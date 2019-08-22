/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.cycjava.cycl.control_vars.$save_asked_queriesP$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.non_tiny_kb_loadedP;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing_utilities.load_lisp_test_file_from_path;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_comment;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_kb;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_name;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_owner;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_p;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_tuples_invalid_constants;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_tuples_mentioning_some_invalid_constant;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.generic_test_case_table_workingP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.run_generic_test_case_int;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.test_cases_of_class;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_comment;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_invalid_constants;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_kb;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_mentions_invalid_constantP;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_name;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_owner;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_project;
import static com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing.kct_test_spec_workingP;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.find_all_if;
import static com.cyc.cycjava.cycl.list_utilities.lengthE;
import static com.cyc.cycjava.cycl.list_utilities.lengthLE;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.position_L;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_macros.rplacd_last;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_cyc_testing;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CYC-TESTING
 * source file: /cyc/top/cycl/cyc-testing/cyc-testing.lisp
 * created:     2019/07/03 17:37:10
 */
public final class cyc_testing extends SubLTranslatedFile implements V12 {
    public static final SubLObject show_cyc_test_run(SubLObject stream, SubLObject test_run, SubLObject show_ownerP, SubLObject show_projectP) {
        format(stream, $str_alt204$_S__A__S__A, new SubLObject[]{ com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_type(test_run), com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_name(test_run), com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run), NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_time(test_run) ? ((SubLObject) (number_utilities.significant_digits(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_time(test_run), FOUR_INTEGER))) : NIL });
        if (NIL != show_ownerP) {
            format(stream, $str_alt205$__A, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_owner(test_run));
        }
        if (NIL != show_projectP) {
            {
                SubLObject project = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_project(test_run);
                if (NIL != project) {
                    format(stream, $str_alt205$__A, project);
                }
            }
        }
        terpri(stream);
        force_output(stream);
        return test_run;
    }

    /**
     * Run test named by NAME in verbose mode.
     *
     * @return list of cyc-test-run-p
     */
    @LispMethod(comment = "Run test named by NAME in verbose mode.\r\n\r\n@return list of cyc-test-run-p")
    public static final SubLObject run_cyc_test_verbose(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt80);
            name = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_5 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt80);
                    current_5 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt80);
                    if (NIL == member(current_5, $list_alt81, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_5 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt80);
                }
                {
                    SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
                    SubLObject browsableP = (NIL != browsableP_tail) ? ((SubLObject) (cadr(browsableP_tail))) : NIL;
                    SubLObject blockP_tail = property_list_member($BLOCK_, current);
                    SubLObject blockP = (NIL != blockP_tail) ? ((SubLObject) (cadr(blockP_tail))) : NIL;
                    SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                    SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                    SubLObject stream_tail = property_list_member($STREAM, current);
                    SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                    SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
                    SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? ((SubLObject) (cadr(run_tiny_kb_tests_in_full_kbP_tail))) : $run_tiny_kb_tests_in_full_kbP$;
                    return list(RUN_CYC_TEST_INT, name, $VERBOSE, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                }
            }
        }
    }

    public static final SubLObject run_cyc_test_tmt(SubLObject tmt, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_runs = NIL;
                if ($SILENT == verbosity) {
                    stream = StreamsLow.$null_output$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result = transformation_module_tests.run_transformation_module_test(tmt, output_format, stream, browsableP, blockP);
                            SubLObject test_run = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            test_runs = list(test_run);
                        }
                    } finally {
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_runs;
            }
        }
    }

    public static final SubLObject run_cyc_test_tct(SubLObject tct, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($SILENT != verbosity) {
                if (NIL != browsableP) {
                    Errors.warn($str_alt109$Can_t_run_test_case_tables_in_bro);
                }
                if (NIL != blockP) {
                    Errors.warn($str_alt110$Can_t_run_test_case_tables_in_blo);
                }
            }
            {
                SubLObject test_runs = NIL;
                SubLObject generic_test_verbosity_level = ($POST_BUILD == output_format) ? ((SubLObject) ($POST_BUILD)) : verbosity;
                {
                    SubLObject _prev_bind_0 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result = run_generic_test_case_int(stream, tct, generic_test_verbosity_level, NIL);
                            SubLObject tct_test_runs = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            test_runs = tct_test_runs;
                        }
                    } finally {
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_runs;
            }
        }
    }

    public static final SubLObject run_cyc_test_rmt(SubLObject rmt, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_runs = NIL;
                if ($SILENT == verbosity) {
                    stream = StreamsLow.$null_output$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        thread.resetMultipleValues();
                        {
                            SubLObject result = removal_module_tests.run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
                            SubLObject test_run = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            test_runs = list(test_run);
                        }
                    } finally {
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return test_runs;
            }
        }
    }

    public static final SubLObject run_cyc_test_rmct(SubLObject rmct, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($SILENT != verbosity) {
                if (NIL != browsableP) {
                    Errors.warn($str_alt106$Can_t_run_removal_module_cost_tes);
                }
                if (NIL != blockP) {
                    Errors.warn($str_alt107$Can_t_run_removal_module_cost_tes);
                }
            }
            {
                SubLObject test_run = NIL;
                if ($SILENT == verbosity) {
                    stream = StreamsLow.$null_output$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        test_run = removal_module_cost_tests.run_removal_module_cost_test(rmct, output_format, stream);
                    } finally {
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(test_run);
            }
        }
    }

    /**
     *
     */
    public static final SubLObject run_cyc_test_parallel_int(SubLObject name, SubLObject nthreads, SubLObject ntimes, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        SubLTrampolineFile.checkType(nthreads, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(ntimes, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(verbosity, CYC_TEST_VERBOSITY_LEVEL_P);
        SubLTrampolineFile.checkType(verbosity, CYC_TEST_VERBOSITY_LEVEL_P);
        SubLTrampolineFile.checkType(browsableP, BOOLEANP);
        SubLTrampolineFile.checkType(blockP, BOOLEANP);
        SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
        SubLTrampolineFile.checkType(stream, STREAMP);
        SubLTrampolineFile.checkType(run_tiny_kb_tests_in_full_kbP, BOOLEANP);
        {
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(nthreads); i = add(i, ONE_INTEGER)) {
                subl_promotions.make_process_with_args(cconcatenate($str_alt95$Parallel_Test_Thread_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(name), $str_alt96$_No__, format_nil.format_nil_a_no_copy(i) }), symbol_function(RUN_CYC_TEST_OBJECT_PARALLEL), list(new SubLObject[]{ name, i, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP }));
            }
        }
        return NIL;
    }

    public static final SubLObject run_cyc_test_parallel(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt88);
            name = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_6 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt88);
                    current_6 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt88);
                    if (NIL == member(current_6, $list_alt89, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_6 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt88);
                }
                {
                    SubLObject nthreads_tail = property_list_member($NTHREADS, current);
                    SubLObject nthreads = (NIL != nthreads_tail) ? ((SubLObject) (cadr(nthreads_tail))) : FOUR_INTEGER;
                    SubLObject ntimes_tail = property_list_member($NTIMES, current);
                    SubLObject ntimes = (NIL != ntimes_tail) ? ((SubLObject) (cadr(ntimes_tail))) : TEN_INTEGER;
                    SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
                    SubLObject verbosity = (NIL != verbosity_tail) ? ((SubLObject) (cadr(verbosity_tail))) : $TERSE;
                    SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
                    SubLObject browsableP = (NIL != browsableP_tail) ? ((SubLObject) (cadr(browsableP_tail))) : NIL;
                    SubLObject blockP_tail = property_list_member($BLOCK_, current);
                    SubLObject blockP = (NIL != blockP_tail) ? ((SubLObject) (cadr(blockP_tail))) : NIL;
                    SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                    SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                    SubLObject stream_tail = property_list_member($STREAM, current);
                    SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                    SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
                    SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? ((SubLObject) (cadr(run_tiny_kb_tests_in_full_kbP_tail))) : $run_tiny_kb_tests_in_full_kbP$;
                    return list(new SubLObject[]{ RUN_CYC_TEST_PARALLEL_INT, name, nthreads, ntimes, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP });
                }
            }
        }
    }

    public static final SubLObject run_cyc_test_object_parallel(SubLObject name, SubLObject thread_num, SubLObject ntimes, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            SubLObject test_runs = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_tests(name);
            SubLObject ct = NIL;
            for (ct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ct = cdolist_list_var.first()) {
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(ntimes); i = add(i, ONE_INTEGER)) {
                        test_runs = nconc(test_runs, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
                    }
                }
            }
            return test_runs;
        }
    }

    public static final SubLObject run_cyc_test_object(SubLObject ct, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $save_asked_queriesP$.currentBinding(thread);
                    try {
                        $save_asked_queriesP$.bind(NIL, thread);
                        {
                            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
                            if (pcase_var.eql($IUT)) {
                                result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_iut(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                            } else {
                                if (pcase_var.eql($IT)) {
                                    result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_it(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                } else {
                                    if (pcase_var.eql($RMT)) {
                                        result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_rmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                    } else {
                                        if (pcase_var.eql($TMT)) {
                                            result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_tmt(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                        } else {
                                            if (pcase_var.eql($RMCT)) {
                                                result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_rmct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                            } else {
                                                if (pcase_var.eql($ERT)) {
                                                    result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_ert(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                } else {
                                                    if (pcase_var.eql($TCT)) {
                                                        result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_tct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                    } else {
                                                        if (pcase_var.eql($KCT)) {
                                                            result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_kct(guts, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                        } else {
                                                            Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        $save_asked_queriesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject run_cyc_test_kct(SubLObject kct, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        return list(kct_cyc_testing.kct_run_test_as_cyc_test(kct, verbosity, browsableP, blockP, output_format, stream));
    }

    /**
     *
     *
     * @return list of cyc-test-run-p
     */
    @LispMethod(comment = "@return list of cyc-test-run-p")
    public static final SubLObject run_cyc_test_iut(SubLObject iut, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject verboseP = makeBoolean($SILENT != verbosity);
                thread.resetMultipleValues();
                {
                    SubLObject result = inference_unit_tests.run_inference_unit_test_int(iut, verboseP, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                    SubLObject test_run = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return list(test_run);
                }
            }
        }
    }

    public static final SubLObject run_cyc_test_it_int(SubLObject it, SubLObject progress_blipP, SubLObject verboseP, SubLObject testing_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error_message = NIL;
                SubLObject total_time = NIL;
                SubLObject test_run = NIL;
                SubLObject time_var = get_internal_real_time();
                if (NIL == $cyc_test_debugP$.getDynamicValue(thread)) {
                    try {
                        {
                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                try {
                                    {
                                        SubLObject pcase_var = testing_direction;
                                        if (pcase_var.eql($BACKWARD)) {
                                            test_run = inference_testing.run_test(it, progress_blipP, verboseP, $BACKWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($FORWARD)) {
                                                test_run = inference_testing.run_test(it, progress_blipP, verboseP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else {
                                                Errors.error($str_alt104$Unexpected_testing_direction____S, testing_direction);
                                            }
                                        }
                                    }
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    }
                } else {
                    {
                        SubLObject pcase_var = testing_direction;
                        if (pcase_var.eql($BACKWARD)) {
                            test_run = inference_testing.run_test(it, progress_blipP, verboseP, $BACKWARD, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            if (pcase_var.eql($FORWARD)) {
                                test_run = inference_testing.run_test(it, progress_blipP, verboseP, $FORWARD, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                Errors.error($str_alt104$Unexpected_testing_direction____S, testing_direction);
                            }
                        }
                    }
                }
                total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                if (NIL != error_message) {
                    test_run = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_run($IT, list(it, testing_direction), $ERROR, total_time);
                }
                return test_run;
            }
        }
    }

    public static final SubLObject run_cyc_test_it(SubLObject it, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($SILENT != verbosity) {
                if (NIL != browsableP) {
                    Errors.warn($str_alt99$Can_t_run_inference_tests_in_brow);
                }
                if (NIL != blockP) {
                    Errors.warn($str_alt100$Can_t_run_inference_tests_in_bloc);
                }
            }
            {
                SubLObject progress_blipP = makeBoolean($SILENT != verbosity);
                SubLObject verboseP = eq($VERBOSE, verbosity);
                SubLObject backward_test_run = NIL;
                SubLObject forward_test_run = NIL;
                {
                    SubLObject _prev_bind_0 = $it_output_format$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
                    try {
                        $it_output_format$.bind(output_format, thread);
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        StreamsLow.$standard_output$.bind(stream, thread);
                        backward_test_run = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_it_int(it, progress_blipP, verboseP, $BACKWARD);
                        forward_test_run = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_it_int(it, progress_blipP, verboseP, $FORWARD);
                    } finally {
                        StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_1, thread);
                        $it_output_format$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(backward_test_run, forward_test_run);
            }
        }
    }

    /**
     *
     *
     * @return list of cyc-test-run-p
     */
    @LispMethod(comment = "@return list of cyc-test-run-p")
    public static final SubLObject run_cyc_test_int(SubLObject name, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        SubLTrampolineFile.checkType(verbosity, CYC_TEST_VERBOSITY_LEVEL_P);
        SubLTrampolineFile.checkType(browsableP, BOOLEANP);
        SubLTrampolineFile.checkType(blockP, BOOLEANP);
        SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
        SubLTrampolineFile.checkType(stream, STREAMP);
        SubLTrampolineFile.checkType(run_tiny_kb_tests_in_full_kbP, BOOLEANP);
        {
            SubLObject test_runs = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_tests(name);
            SubLObject ct = NIL;
            for (ct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ct = cdolist_list_var.first()) {
                test_runs = nconc(test_runs, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_object(ct, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP));
            }
            return test_runs;
        }
    }

    public static final SubLObject run_cyc_test_ert(SubLObject ert, SubLObject verbosity, SubLObject browsableP, SubLObject blockP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($SILENT != verbosity) {
                if (NIL != blockP) {
                    Errors.warn($str_alt108$Can_t_run_evaluatable_relation_te);
                }
            }
            {
                SubLObject test_run = NIL;
                if ($SILENT == verbosity) {
                    stream = StreamsLow.$null_output$.getDynamicValue(thread);
                }
                {
                    SubLObject _prev_bind_0 = $run_tiny_kb_tests_in_full_kbP$.currentBinding(thread);
                    try {
                        $run_tiny_kb_tests_in_full_kbP$.bind(run_tiny_kb_tests_in_full_kbP, thread);
                        test_run = evaluatable_relation_tests.run_evaluatable_relation_test(ert, output_format, stream, browsableP);
                    } finally {
                        $run_tiny_kb_tests_in_full_kbP$.rebind(_prev_bind_0, thread);
                    }
                }
                return list(test_run);
            }
        }
    }

    public static final SubLObject run_cyc_testP(SubLObject ct, SubLObject type_spec, SubLObject run_test_case_tablesP, SubLObject run_non_working_tests) {
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.testing_real_time_pruningP()) {
            if (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct), $list_alt180)) {
                return NIL;
            }
            if (NIL != list_utilities.member_eqP(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct), $tests_that_dont_work_with_real_time_pruning$.getGlobalValue())) {
                return NIL;
            }
        }
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type_p(type_spec)) {
            {
                SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
                if (type != type_spec) {
                    return NIL;
                }
            }
        }
        if (NIL == run_test_case_tablesP) {
            if ($TCT == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct)) {
                return NIL;
            }
        }
        if (T == run_non_working_tests) {
        } else {
            if (NIL == run_non_working_tests) {
                if (NIL == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_workingP(ct)) {
                    return NIL;
                }
            } else {
                if ($ONLY == run_non_working_tests) {
                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_workingP(ct)) {
                        return NIL;
                    }
                } else {
                    return Errors.error($str_alt182$Unexpected_value__s_for__run_non_, run_non_working_tests);
                }
            }
        }
        return T;
    }

    /**
     *
     *
     * @return list of cyc-test-run-p
     */
    @LispMethod(comment = "@return list of cyc-test-run-p")
    public static final SubLObject run_cyc_test(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt68);
            name = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_4 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt68);
                    current_4 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt68);
                    if (NIL == member(current_4, $list_alt69, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_4 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt68);
                }
                {
                    SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
                    SubLObject verbosity = (NIL != verbosity_tail) ? ((SubLObject) (cadr(verbosity_tail))) : $TERSE;
                    SubLObject browsableP_tail = property_list_member($BROWSABLE_, current);
                    SubLObject browsableP = (NIL != browsableP_tail) ? ((SubLObject) (cadr(browsableP_tail))) : NIL;
                    SubLObject blockP_tail = property_list_member($BLOCK_, current);
                    SubLObject blockP = (NIL != blockP_tail) ? ((SubLObject) (cadr(blockP_tail))) : NIL;
                    SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                    SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                    SubLObject stream_tail = property_list_member($STREAM, current);
                    SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                    SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
                    SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? ((SubLObject) (cadr(run_tiny_kb_tests_in_full_kbP_tail))) : $run_tiny_kb_tests_in_full_kbP$;
                    return list(RUN_CYC_TEST_INT, name, verbosity, browsableP, blockP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                }
            }
        }
    }

    public static final SubLObject run_all_loaded_cyc_tests_print_header(SubLObject stream, SubLObject start_time, SubLObject tests_specifiedP) {
        {
            SubLObject tiny_kbP = makeBoolean(NIL == non_tiny_kb_loadedP());
            if (NIL != tests_specifiedP) {
                format(stream, $str_alt183$_Running_a_specified_list_of_test);
            } else {
                format(stream, $str_alt184$_Running__a_file_P_of_tests_, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_file_count(), com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_file_count());
            }
            format(stream, $str_alt185$in_the__a_KB__KB__a___System__a_S, new SubLObject[]{ NIL != tiny_kbP ? ((SubLObject) ($$$Tiny)) : $$$Full, kb_loaded(), system_info.cyc_revision_string(), numeric_date_utilities.timestring(start_time) });
        }
        force_output(stream);
        return NIL;
    }

    public static final SubLObject run_all_loaded_cyc_tests_print_footer(SubLObject stream, SubLObject start_time, SubLObject test_runs, SubLObject tests_specifiedP, SubLObject type) {
        if (NIL == test_runs) {
            format(stream, $str_alt188$__No_tests_were_run___);
        } else {
            if (NIL == tests_specifiedP) {
                {
                    SubLObject non_working_tests = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.non_working_cyc_tests(type);
                    if (NIL != non_working_tests) {
                        {
                            SubLObject non_working_test_names = Mapping.mapcar(symbol_function(CYC_TEST_NAME), non_working_tests);
                            format(stream, $str_alt189$__NOTE__The_following_cyc_tests_w);
                            format_nil.print_one_per_line(non_working_test_names, stream);
                            terpri(stream);
                        }
                    }
                }
            }
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.print_failing_cyc_tests_message(stream, test_runs, T, NIL);
            {
                SubLObject overall_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_runs_overall_result(test_runs);
                SubLObject total_test_guts_time = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_runs_total_time(test_runs);
                SubLObject end_time = get_universal_time();
                SubLObject total_time = subtract(end_time, start_time);
                format(stream, $str_alt190$___Tests_finished_at__a_Total_tim, new SubLObject[]{ numeric_date_utilities.timestring(end_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_time), numeric_date_utilities.elapsed_time_abbreviation_string(total_test_guts_time) });
                list_utilities.pretty_print_plist(list_utilities.histogram_as_plist(Mapping.mapcar(CYC_TEST_RUN_RESULT, test_runs), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
                format(stream, $str_alt192$Overall_result___s__, overall_result);
            }
        }
        force_output(stream);
        return NIL;
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p; the overall result
     * @return 1 list of cyc-test-runs-p; the details of all the tests that were run
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p; the overall result\r\n@return 1 list of cyc-test-runs-p; the details of all the tests that were run")
    public static final SubLObject run_all_loaded_cyc_tests_int(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject type, SubLObject run_non_working_tests, SubLObject tests) {
        if (tests == UNPROVIDED) {
            tests = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(stream, STREAMP);
            SubLTrampolineFile.checkType(verbosity, CYC_TEST_VERBOSITY_LEVEL_P);
            SubLTrampolineFile.checkType(output_format, CYC_TEST_OUTPUT_FORMAT_P);
            SubLTrampolineFile.checkType(stop_at_first_failureP, BOOLEANP);
            SubLTrampolineFile.checkType(run_tiny_kb_tests_in_full_kbP, BOOLEANP);
            SubLTrampolineFile.checkType(type, CYC_TEST_TYPE_SPEC_P);
            {
                SubLObject silentP = eq($SILENT, verbosity);
                SubLObject tests_specifiedP = (NIL != tests) ? ((SubLObject) (makeBoolean(tests != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests()))) : NIL;
                SubLObject doneP = NIL;
                SubLObject start_time = get_universal_time();
                SubLObject test_runs = NIL;
                SubLObject harness_error = NIL;
                SubLObject some_harness_errorP = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (NIL == silentP) {
                                    com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_all_loaded_cyc_tests_print_header(stream, start_time, tests_specifiedP);
                                }
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = tests;
                                        SubLObject ct = NIL;
                                        for (ct = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , ct = csome_list_var.first()) {
                                            {
                                                SubLObject partial_test_runs = NIL;
                                                if (NIL == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_testP(ct, type, run_test_case_tablesP, run_non_working_tests)) {
                                                    partial_test_runs = list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_null_run(ct));
                                                } else {
                                                    if (($TCT != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct)) && (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_mentions_invalid_constantP(ct))) {
                                                        partial_test_runs = list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_invalid_run(ct));
                                                    } else {
                                                        if (NIL == $cyc_test_debugP$.getDynamicValue(thread)) {
                                                            try {
                                                                {
                                                                    SubLObject _prev_bind_0_12 = Errors.$error_handler$.currentBinding(thread);
                                                                    try {
                                                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                        try {
                                                                            partial_test_runs = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_object(ct, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                                        } catch (Throwable catch_var) {
                                                                            Errors.handleThrowable(catch_var, NIL);
                                                                        }
                                                                    } finally {
                                                                        Errors.$error_handler$.rebind(_prev_bind_0_12, thread);
                                                                    }
                                                                }
                                                            } catch (Throwable ccatch_env_var) {
                                                                harness_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                            }
                                                        } else {
                                                            partial_test_runs = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_cyc_test_object(ct, verbosity, NIL, NIL, output_format, stream, run_tiny_kb_tests_in_full_kbP);
                                                        }
                                                    }
                                                }
                                                if (NIL != harness_error) {
                                                    some_harness_errorP = T;
                                                    if (NIL == silentP) {
                                                        format_nil.force_format(stream, $str_alt177$___HARNESS_ERROR___A__, harness_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    harness_error = NIL;
                                                }
                                                test_runs = nconc(test_runs, partial_test_runs);
                                                if (NIL != stop_at_first_failureP) {
                                                    {
                                                        SubLObject partial_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_runs_overall_result(partial_test_runs);
                                                        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_failure_result_p(partial_result)) {
                                                            doneP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == silentP) {
                                    com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_all_loaded_cyc_tests_print_footer(stream, start_time, test_runs, tests_specifiedP, type);
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    harness_error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                {
                    SubLObject overall_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_runs_overall_result(test_runs);
                    if (NIL != some_harness_errorP) {
                        overall_result = $HARNESS_ERROR;
                    }
                    return values(overall_result, test_runs);
                }
            }
        }
    }

    public static final SubLObject print_succeeding_cyc_tests_message(SubLObject stream, SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        format(stream, $str_alt195$__Succeeding_regression_tests___);
        {
            SubLObject succeeding_test_runs = list_utilities.remove_if_not(SUCCEEDING_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != succeeding_test_runs) {
                {
                    SubLObject cdolist_list_var = succeeding_test_runs;
                    SubLObject test_run = NIL;
                    for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                    }
                }
            } else {
                format(stream, $str_alt197$None____);
            }
        }
        force_output(stream);
        return NIL;
    }

    public static final SubLObject print_ignored_cyc_tests_message(SubLObject stream, SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        {
            SubLObject ignored_test_runs = list_utilities.remove_if_not(IGNORED_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL == ignored_test_runs) {
                format(stream, $str_alt199$None_);
            } else {
                {
                    SubLObject ignored_success = NIL;
                    SubLObject ignored_fail = NIL;
                    {
                        SubLObject cdolist_list_var = ignored_test_runs;
                        SubLObject test_run = NIL;
                        for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                            {
                                SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
                                if (pcase_var.eql($NON_REGRESSION_SUCCESS)) {
                                    ignored_success = cons(test_run, ignored_success);
                                } else {
                                    if (pcase_var.eql($NON_REGRESSION_FAILURE)) {
                                        ignored_fail = cons(test_run, ignored_fail);
                                    }
                                }
                            }
                        }
                    }
                    ignored_success = nreverse(ignored_success);
                    ignored_fail = nreverse(ignored_fail);
                    format(stream, $str_alt202$__Failing_non_regression_tests___);
                    {
                        SubLObject cdolist_list_var = ignored_fail;
                        SubLObject test_run = NIL;
                        for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                        }
                    }
                    format(stream, $str_alt203$__Succeeding_non_regression_tests);
                    {
                        SubLObject cdolist_list_var = ignored_success;
                        SubLObject test_run = NIL;
                        for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                        }
                    }
                }
            }
        }
        force_output(stream);
        return NIL;
    }

    public static final SubLObject print_failing_cyc_tests_message(SubLObject stream, SubLObject test_runs, SubLObject show_ownersP, SubLObject show_projectsP) {
        if (show_ownersP == UNPROVIDED) {
            show_ownersP = NIL;
        }
        if (show_projectsP == UNPROVIDED) {
            show_projectsP = NIL;
        }
        format(stream, $str_alt193$__Failing_regression_tests___);
        {
            SubLObject failing_test_runs = list_utilities.remove_if_not(FAILING_CYC_TEST_RUN_P, test_runs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != failing_test_runs) {
                {
                    SubLObject cdolist_list_var = failing_test_runs;
                    SubLObject test_run = NIL;
                    for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.show_cyc_test_run(stream, test_run, show_ownersP, show_projectsP);
                    }
                }
            } else {
                format(stream, $str_alt194$None____);
            }
        }
        force_output(stream);
        return NIL;
    }

    public static final SubLObject new_cyc_test_null_run(SubLObject ct) {
        {
            SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            SubLObject name = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_run(type, name, $NOT_RUN, NIL);
        }
    }

    public static final SubLObject new_cyc_test_invalid_run(SubLObject ct) {
        {
            SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            SubLObject name = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_run(type, name, $INVALID, NIL);
        }
    }

    public static final SubLObject cyc_test_mentions_invalid_constantP(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return inference_testing.inference_test_mentions_invalid_constantP(guts);
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_mentions_invalid_constantP(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return list_utilities.sublisp_boolean(generic_test_case_table_tuples_mentioning_some_invalid_constant(guts));
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cyc_test_has_current_ownerP(SubLObject ct) {
        {
            SubLObject owner = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_owner(ct);
            if (NIL != owner) {
                if (NIL != kb_accessors.current_cycorp_usernameP(owner)) {
                    return T;
                }
            }
        }
        return NIL;
    }



    /**
     * A list of tests that will fail if :compute-answer-justifications? is forced to NIL and/or if problem store pruning happens while they're running.
     */
    // deflexical
    @LispMethod(comment = "A list of tests that will fail if :compute-answer-justifications? is forced to NIL and/or if problem store pruning happens while they\'re running.\ndeflexical")
    private static final SubLSymbol $tests_that_dont_work_with_real_time_pruning$ = makeSymbol("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*");

    public static final SubLFile me = new cyc_testing();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.cyc_testing";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $it_output_format$ = makeSymbol("*IT-OUTPUT-FORMAT*");

    // defparameter
    // Set this to T if you want to debug the tests (not catch errors)
    /**
     * Set this to T if you want to debug the tests (not catch errors)
     */
    @LispMethod(comment = "Set this to T if you want to debug the tests (not catch errors)\ndefparameter")
    public static final SubLSymbol $cyc_test_debugP$ = makeSymbol("*CYC-TEST-DEBUG?*");



    // defparameter
    /**
     * Whether to test real-time while-inference-is-running pruning. This will force
     * :compute-answer-justifications? to NIL and will only run tests where that
     * makes sense.
     */
    @LispMethod(comment = "Whether to test real-time while-inference-is-running pruning. This will force\r\n:compute-answer-justifications? to NIL and will only run tests where that\r\nmakes sense.\ndefparameter\nWhether to test real-time while-inference-is-running pruning. This will force\n:compute-answer-justifications? to NIL and will only run tests where that\nmakes sense.")
    private static final SubLSymbol $test_real_time_pruningP$ = makeSymbol("*TEST-REAL-TIME-PRUNING?*");

    // deflexical
    // The possible levels of verbosity for Cyc tests.
    /**
     * The possible levels of verbosity for Cyc tests.
     */
    @LispMethod(comment = "The possible levels of verbosity for Cyc tests.\ndeflexical")
    private static final SubLSymbol $cyc_test_verbosity_levels$ = makeSymbol("*CYC-TEST-VERBOSITY-LEVELS*");

    // defparameter
    /**
     * Bound to the current file being loaded, so that the tests can know what file
     * they're in
     */
    @LispMethod(comment = "Bound to the current file being loaded, so that the tests can know what file\r\nthey\'re in\ndefparameter\nBound to the current file being loaded, so that the tests can know what file\nthey\'re in")
    public static final SubLSymbol $cyc_test_filename$ = makeSymbol("*CYC-TEST-FILENAME*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cyc_base_testdcl$ = makeSymbol("*CYC-BASE-TESTDCL*");

    // defparameter
    /**
     * Whether we should warn if a test has the same name as another test. This
     * often happens when tests are redefined or updated, so we only want to do it
     * when we're loading tests from a clean initial state.
     */
    @LispMethod(comment = "Whether we should warn if a test has the same name as another test. This\r\noften happens when tests are redefined or updated, so we only want to do it\r\nwhen we\'re loading tests from a clean initial state.\ndefparameter\nWhether we should warn if a test has the same name as another test. This\noften happens when tests are redefined or updated, so we only want to do it\nwhen we\'re loading tests from a clean initial state.")
    public static final SubLSymbol $warn_on_duplicate_cyc_test_namesP$ = makeSymbol("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $only_undeclare_tests_and_test_filesP$ = makeSymbol("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*");

    // deflexical
    // Test results that mean that the test succeeded.
    /**
     * Test results that mean that the test succeeded.
     */
    @LispMethod(comment = "Test results that mean that the test succeeded.\ndeflexical")
    private static final SubLSymbol $cyc_test_result_success_values$ = makeSymbol("*CYC-TEST-RESULT-SUCCESS-VALUES*");

    // deflexical
    // Test results that mean that the test failed.
    /**
     * Test results that mean that the test failed.
     */
    @LispMethod(comment = "Test results that mean that the test failed.\ndeflexical")
    private static final SubLSymbol $cyc_test_result_failure_values$ = makeSymbol("*CYC-TEST-RESULT-FAILURE-VALUES*");

    // deflexical
    /**
     * Test results that mean that the test was ignored, or that the test result
     * should be ignored, and counted as neither a success nor a failure.
     */
    @LispMethod(comment = "Test results that mean that the test was ignored, or that the test result\r\nshould be ignored, and counted as neither a success nor a failure.\ndeflexical\nTest results that mean that the test was ignored, or that the test result\nshould be ignored, and counted as neither a success nor a failure.")
    private static final SubLSymbol $cyc_test_result_ignore_values$ = makeSymbol("*CYC-TEST-RESULT-IGNORE-VALUES*");

    // deflexical
    // All possible results for tests
    /**
     * All possible results for tests
     */
    @LispMethod(comment = "All possible results for tests\ndeflexical")
    private static final SubLSymbol $cyc_test_result_values$ = makeSymbol("*CYC-TEST-RESULT-VALUES*");

    // deflexical
    /**
     * The table of known Cyc test types. Column 1 is a uniquely identifying
     * keyword. Column 2 is a string description of the test type.
     */
    @LispMethod(comment = "The table of known Cyc test types. Column 1 is a uniquely identifying\r\nkeyword. Column 2 is a string description of the test type.\ndeflexical\nThe table of known Cyc test types. Column 1 is a uniquely identifying\nkeyword. Column 2 is a string description of the test type.")
    private static final SubLSymbol $cyc_test_type_table$ = makeSymbol("*CYC-TEST-TYPE-TABLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cyc_test$ = makeSymbol("*DTP-CYC-TEST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $print_post_build_test_summary_timestampP$ = makeSymbol("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_cyc_test$ = makeSymbol("*CFASL-WIDE-OPCODE-CYC-TEST*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cyc_test_file$ = makeSymbol("*DTP-CYC-TEST-FILE*");

    static private final SubLList $list1 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"));

    private static final SubLString $$$testdcl = makeString("testdcl");

    static private final SubLList $list3 = list($TINY, $FULL, $BOTH);

    static private final SubLList $list4 = list(makeKeyword("STANDARD"), makeKeyword("POST-BUILD"));

    static private final SubLList $list5 = list(makeKeyword("SUCCESS"), makeKeyword("REGRESSION-SUCCESS"));

    static private final SubLList $list6 = list(makeKeyword("FAILURE"), makeKeyword("REGRESSION-FAILURE"), makeKeyword("ABNORMAL"), makeKeyword("ERROR"));

    static private final SubLList $list7 = list(makeKeyword("NON-REGRESSION-SUCCESS"), makeKeyword("NON-REGRESSION-FAILURE"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    private static final SubLList $list8 = list(list(makeKeyword("IUT"), makeString("inference unit test")), list(makeKeyword("IT"), makeString("inference test")), list(makeKeyword("RMT"), makeString("removal module test")), list(makeKeyword("TMT"), makeString("transformation module test")), list($RMCT, makeString("removal module cost test")), list(makeKeyword("ERT"), makeString("evaluatable relation test")), list(makeKeyword("TCT"), makeString("test case table")), list(makeKeyword("KCT"), makeString("KB content test")));

    private static final SubLSymbol CYC_TEST_TYPE_P = makeSymbol("CYC-TEST-TYPE-P");

    static private final SubLList $list12 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list13 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLList $list17 = list(makeSymbol("CYC-TESTS"));

    static private final SubLList $list18 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all Cyc tests"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$Iterating_over_all_Cyc_tests = makeString("Iterating over all Cyc tests");

    private static final SubLSymbol PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");

    public static final SubLSymbol $cyc_test_by_name$ = makeSymbol("*CYC-TEST-BY-NAME*");

    private static final SubLInteger $int$212 = makeInteger(212);

    public static final SubLSymbol $cyc_test_by_dwimmed_name$ = makeSymbol("*CYC-TEST-BY-DWIMMED-NAME*");

    static private final SubLString $str24$A_Cyc_test_named__a_already_exist = makeString("A Cyc test named ~a already existed; overwriting");

    private static final SubLSymbol REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");

    private static final SubLSymbol REMOVAL_MODULE_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-TEST-PREDICATE");

    private static final SubLSymbol REMOVAL_MODULE_COST_TEST_P = makeSymbol("REMOVAL-MODULE-COST-TEST-P");

    private static final SubLSymbol REMOVAL_MODULE_COST_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-COST-TEST-PREDICATE");

    private static final SubLSymbol CYC_TEST = makeSymbol("CYC-TEST");

    private static final SubLSymbol CYC_TEST_P = makeSymbol("CYC-TEST-P");

    static private final SubLList $list31 = list(makeSymbol("FILE"), makeSymbol("GUTS"));

    static private final SubLList $list32 = list($FILE, $GUTS);

    static private final SubLList $list33 = list(makeSymbol("CT-FILE"), makeSymbol("CT-GUTS"));

    static private final SubLList $list34 = list(makeSymbol("_CSETF-CT-FILE"), makeSymbol("_CSETF-CT-GUTS"));

    private static final SubLSymbol PRINT_CYC_TEST = makeSymbol("PRINT-CYC-TEST");

    private static final SubLSymbol CYC_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list37 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYC-TEST-P"));

    private static final SubLSymbol CT_FILE = makeSymbol("CT-FILE");

    private static final SubLSymbol _CSETF_CT_FILE = makeSymbol("_CSETF-CT-FILE");

    private static final SubLSymbol CT_GUTS = makeSymbol("CT-GUTS");

    private static final SubLSymbol _CSETF_CT_GUTS = makeSymbol("_CSETF-CT-GUTS");

    private static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_CYC_TEST = makeSymbol("MAKE-CYC-TEST");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD");

    private static final SubLString $str50$__CYC_TEST__a__a_ = makeString("#<CYC-TEST:~a:~a>");

    private static final SubLString $str51$__CYC_TEST__a_ = makeString("#<CYC-TEST:~a>");

    private static final SubLSymbol CYC_TEST_GUTS_P = makeSymbol("CYC-TEST-GUTS-P");

    private static final SubLString $str54$_s_is_not_a_CYC_TEST_GUTS_P = makeString("~s is not a CYC-TEST-GUTS-P");

    private static final SubLSymbol GENERIC_TEST_CASE_TABLE_P = makeSymbol("GENERIC-TEST-CASE-TABLE-P");

    private static final SubLSymbol CYC_TEST_NAME = makeSymbol("CYC-TEST-NAME");

    private static final SubLString $str57$Cyc_test_of_unexpected_type___s = makeString("Cyc test of unexpected type: ~s");

    private static final SubLString $str67$___A__S__S__S____3f___OWNER__S__ = makeString("~&~A ~S ~S ~S (~,3f) :OWNER ~S~%");

    private static final SubLString $str68$___S__S__S____3f___OWNER__S__ = makeString("~&~S ~S ~S (~,3f) :OWNER ~S~%");

    private static final SubLSymbol CYC_TEST_TYPE_SPEC_P = makeSymbol("CYC-TEST-TYPE-SPEC-P");

    private static final SubLSymbol $sym73$CYC_TEST_WORKING_ = makeSymbol("CYC-TEST-WORKING?");

    private static final SubLSymbol CYC_TEST_TYPE = makeSymbol("CYC-TEST-TYPE");

    private static final SubLSymbol FIND_CYC_TEST = makeSymbol("FIND-CYC-TEST");

    private static final SubLInteger $int$514 = makeInteger(514);

    private static final SubLSymbol CFASL_INPUT_CYC_TEST = makeSymbol("CFASL-INPUT-CYC-TEST");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD");

    private static final SubLSymbol CYC_TEST_RESULT_P = makeSymbol("CYC-TEST-RESULT-P");

    private static final SubLSymbol CYC_TEST_RUN_P = makeSymbol("CYC-TEST-RUN-P");

    private static final SubLList $list83 = list(makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    private static final SubLString $str87$___S__S_____S___S_ = makeString("~&~S ~S -> ~S (~S)");

    private static final SubLString $str89$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$Unknown_output_format_ = makeString("Unknown output format ");

    private static final SubLSymbol $cyc_test_files$ = makeSymbol("*CYC-TEST-FILES*");

    private static final SubLList $list94 = list(list(makeSymbol("CYC-TEST-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list96 = list(list(makeSymbol("CYC-TEST-FILES")));

    private static final SubLList $list97 = list(list(makeSymbol("CYC-TEST-FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all test files"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $$$Iterating_over_all_test_files = makeString("Iterating over all test files");

    private static final SubLList $list99 = list(makeSymbol("CYC-TEST-FILES"));

    private static final SubLSymbol CYC_TEST_FILE = makeSymbol("CYC-TEST-FILE");

    private static final SubLSymbol CYC_TEST_FILE_P = makeSymbol("CYC-TEST-FILE-P");

    private static final SubLList $list102 = list(makeSymbol("FILENAME"), makeSymbol("KB"));

    private static final SubLList $list103 = list(makeKeyword("FILENAME"), makeKeyword("KB"));

    private static final SubLList $list104 = list(makeSymbol("CTF-FILENAME"), makeSymbol("CTF-KB"));

    private static final SubLList $list105 = list(makeSymbol("_CSETF-CTF-FILENAME"), makeSymbol("_CSETF-CTF-KB"));

    private static final SubLSymbol PRINT_CYC_TEST_FILE = makeSymbol("PRINT-CYC-TEST-FILE");

    private static final SubLSymbol CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list108 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CYC-TEST-FILE-P"));

    private static final SubLSymbol CTF_FILENAME = makeSymbol("CTF-FILENAME");

    private static final SubLSymbol _CSETF_CTF_FILENAME = makeSymbol("_CSETF-CTF-FILENAME");

    private static final SubLSymbol CTF_KB = makeSymbol("CTF-KB");

    private static final SubLSymbol _CSETF_CTF_KB = makeSymbol("_CSETF-CTF-KB");

    private static final SubLSymbol MAKE_CYC_TEST_FILE = makeSymbol("MAKE-CYC-TEST-FILE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD");

    private static final SubLString $str117$__CTF__a_ = makeString("#<CTF:~a>");

    private static final SubLSymbol $most_recent_cyc_test_runs$ = makeSymbol("*MOST-RECENT-CYC-TEST-RUNS*");

    private static final SubLSymbol $most_recent_cyc_test_file_load_failures$ = makeSymbol("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*");

    private static final SubLSymbol FAILING_CYC_TEST_RUN_P = makeSymbol("FAILING-CYC-TEST-RUN-P");

    private static final SubLSymbol CYC_TEST_RUN_CYC_TEST = makeSymbol("CYC-TEST-RUN-CYC-TEST");

    private static final SubLList $list123 = list(new SubLObject[]{ makeSymbol("PATH"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(QUOTE, makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))), list(makeSymbol("RUN-TEST-CASE-TABLES?"), T), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL), list(makeSymbol("PROGRESS-FILE"), NIL), list(makeSymbol("RERUN-CRASHING-TESTS"), NIL) });

    private static final SubLList $list124 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), makeKeyword("RUN-TEST-CASE-TABLES?"), makeKeyword("RETURN-TEST-RUNS?"), $TYPE, makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });

    private static final SubLSymbol $standard_output$ = makeSymbol("*STANDARD-OUTPUT*");

    private static final SubLSymbol $kw129$STOP_AT_FIRST_FAILURE_ = makeKeyword("STOP-AT-FIRST-FAILURE?");

    private static final SubLSymbol $kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");

    public static final SubLSymbol $run_tiny_kb_tests_in_full_kbP$ = makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");

    private static final SubLSymbol $kw133$RUN_TEST_CASE_TABLES_ = makeKeyword("RUN-TEST-CASE-TABLES?");

    private static final SubLSymbol $kw134$RETURN_TEST_RUNS_ = makeKeyword("RETURN-TEST-RUNS?");

    private static final SubLSymbol $RUN_NON_WORKING_TESTS = makeKeyword("RUN-NON-WORKING-TESTS");

    private static final SubLSymbol $RERUN_CRASHING_TESTS = makeKeyword("RERUN-CRASHING-TESTS");

    private static final SubLSymbol RUN_ALL_CYC_TESTS_INT = makeSymbol("RUN-ALL-CYC-TESTS-INT");

    static private final SubLList $list140 = list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL), list(makeSymbol("PROGRESS-FILE"), NIL), list(makeSymbol("RERUN-CRASHING-TESTS"), NIL) });

    private static final SubLList $list141 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), $TYPE, makeKeyword("RUN-NON-WORKING-TESTS"), makeKeyword("PROGRESS-FILE"), makeKeyword("RERUN-CRASHING-TESTS") });

    private static final SubLSymbol RUN_ALL_LOADED_CYC_TESTS = makeSymbol("RUN-ALL-LOADED-CYC-TESTS");

    private static final SubLList $list145 = list(makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("KB"));

    private static final SubLList $list146 = list(makeKeyword("KB"));

    private static final SubLSymbol DECLARE_CYC_TEST_FILE_INT = makeSymbol("DECLARE-CYC-TEST-FILE-INT");

    private static final SubLList $list148 = list(new SubLObject[]{ makeSymbol("NAMES"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL) });

    private static final SubLList $list149 = list(makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), $TYPE, makeKeyword("RUN-NON-WORKING-TESTS"));

    private static final SubLSymbol FIND_CYC_TESTS_BY_NAME = makeSymbol("FIND-CYC-TESTS-BY-NAME");

    private static final SubLSymbol CYC_TEST_VERBOSITY_LEVEL_P = makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");

    private static final SubLString $str154$could_not_load__a_lisp_from__s = makeString("could not load ~a.lisp from ~s");

    private static final SubLString $$$Loading_test_files = makeString("Loading test files");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str157$_lisp = makeString(".lisp");

    private static final SubLString $str158$Invalid_phase__A_of__A_specified_ = makeString("Invalid phase ~A of ~A specified.");

    private static final SubLSymbol DECLARE_CYC_TEST_FILE = makeSymbol("DECLARE-CYC-TEST-FILE");

    private static final SubLSymbol TINY_KB_CYC_TEST_P = makeSymbol("TINY-KB-CYC-TEST-P");

    private static final SubLSymbol SERVER_SUMMARY = makeSymbol("SERVER-SUMMARY");

    static private final SubLList $list167 = list(list(NIL, NIL));

    private static final SubLSymbol KB_STATISTICS = makeSymbol("KB-STATISTICS");

    private static final SubLSymbol CYC_MEMORY_HOGS = makeSymbol("CYC-MEMORY-HOGS");

    private static final SubLSymbol ALL_CYC_TESTS_ARE_VALID = makeSymbol("ALL-CYC-TESTS-ARE-VALID");

    public static final SubLObject testing_real_time_pruningP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $test_real_time_pruningP$.getDynamicValue(thread);
        }
    }

    public static SubLObject testing_real_time_pruningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $test_real_time_pruningP$.getDynamicValue(thread);
    }

    public static final SubLObject cyc_test_kb_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list_alt2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_kb_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list3, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_verbosity_level_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_verbosity_levels$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject cyc_test_verbosity_level_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_verbosity_levels$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is an valid cyc test output format.
     */
    @LispMethod(comment = "Return T iff OBJECT is an valid cyc test output format.")
    public static final SubLObject cyc_test_output_format_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list_alt3, symbol_function(EQ), UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is an valid cyc test output format.
     */
    @LispMethod(comment = "Return T iff OBJECT is an valid cyc test output format.")
    public static SubLObject cyc_test_output_format_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $list4, symbol_function(EQ), UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is a possible result for a Cyc test.
     */
    @LispMethod(comment = "Return T iff OBJECT is a possible result for a Cyc test.")
    public static final SubLObject cyc_test_result_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff OBJECT is a possible result for a Cyc test.
     */
    @LispMethod(comment = "Return T iff OBJECT is a possible result for a Cyc test.")
    public static SubLObject cyc_test_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_success_result_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_success_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_success_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_success_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_failure_result_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_failure_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_failure_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_failure_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_ignore_result_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_ignore_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_ignore_result_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_result_ignore_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_result_L_alt(SubLObject result1, SubLObject result2) {
        return list_utilities.position_L(result1, result2, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cyc_test_result_L(final SubLObject result1, final SubLObject result2) {
        return position_L(result1, result2, $cyc_test_result_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_test_type_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_type_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST));
    }

    public static SubLObject cyc_test_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $cyc_test_type_table$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST));
    }

    public static final SubLObject cyc_test_type_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type_p(v_object)));
    }

    public static SubLObject cyc_test_type_spec_p(final SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != cyc_test_type_p(v_object)));
    }

    public static final SubLObject cyc_test_type_pretty_name_alt(SubLObject test_type) {
        SubLTrampolineFile.checkType(test_type, CYC_TEST_TYPE_P);
        return list_utilities.alist_lookup($cyc_test_type_table$.getGlobalValue(), test_type, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject cyc_test_type_pretty_name(final SubLObject test_type) {
        assert NIL != cyc_test_type_p(test_type) : "! cyc_testing.cyc_test_type_p(test_type) " + ("cyc_testing.cyc_test_type_p(test_type) " + "CommonSymbols.NIL != cyc_testing.cyc_test_type_p(test_type) ") + test_type;
        return alist_lookup($cyc_test_type_table$.getGlobalValue(), test_type, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject cyc_tests_alt() {
        return $cyc_tests$.getGlobalValue();
    }

    public static SubLObject cyc_tests() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $cyc_tests$.getDynamicValue(thread);
    }

    public static final SubLObject undefine_all_cyc_tests_alt() {
        $cyc_tests$.setGlobalValue(NIL);
        clrhash($cyc_test_by_name$.getGlobalValue());
        clrhash($cyc_test_by_dwimmed_name$.getGlobalValue());
        return NIL;
    }

    public static SubLObject undefine_all_cyc_tests() {
        $cyc_tests$.setDynamicValue(NIL);
        clrhash($cyc_test_by_name$.getGlobalValue());
        clrhash($cyc_test_by_dwimmed_name$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject do_cyc_tests_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyc_test = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    cyc_test = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            if (NIL == member(current_1, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt12);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CSOME, list(cyc_test, $list_alt17, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        cyc_test = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list12);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list12);
            if (NIL == member(current_$1, $list13, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list12);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(cyc_test, $list17, done), append(body, NIL));
    }

    public static final SubLObject progress_do_cyc_tests_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyc_test = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt18);
                    cyc_test = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$Iterating_over_all_Cyc_tests;
                        destructuring_bind_must_listp(current, datum, $list_alt18);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(PROGRESS_CDOLIST, list(cyc_test, $list_alt17, message), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt18);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject progress_do_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list18);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        cyc_test = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$Iterating_over_all_Cyc_tests;
        destructuring_bind_must_listp(current, datum, $list18);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGRESS_CDOLIST, list(cyc_test, $list17, message), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list18);
        return NIL;
    }

    public static final SubLObject cyc_test_count_alt() {
        return length($cyc_tests$.getGlobalValue());
    }

    public static SubLObject cyc_test_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return length($cyc_tests$.getDynamicValue(thread));
    }

    public static final SubLObject no_cyc_tests_definedP_alt() {
        return makeBoolean(NIL == $cyc_tests$.getGlobalValue());
    }

    public static SubLObject no_cyc_tests_definedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL == $cyc_tests$.getDynamicValue(thread));
    }

    public static final SubLObject index_cyc_test_by_name_alt(SubLObject ct, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $warn_on_duplicate_cyc_test_namesP$.getDynamicValue(thread)) {
                if (NIL != gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED)) {
                    Errors.warn($str_alt24$A_Cyc_test_named__a_already_exist, name);
                }
            }
            sethash(name, $cyc_test_by_name$.getGlobalValue(), ct);
            sethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), nconc(gethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED), list(ct)));
            if (name.isCons()) {
                com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_pushnew_to_end_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
            }
            if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
                {
                    SubLObject rmt = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
                    if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
                    }
                }
            }
            if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
                {
                    SubLObject rmct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
                    if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
                    }
                }
            }
            return ct;
        }
    }

    public static SubLObject index_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $warn_on_duplicate_cyc_test_namesP$.getDynamicValue(thread)) && (NIL != gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED))) {
            Errors.warn($str24$A_Cyc_test_named__a_already_exist, name);
        }
        sethash(name, $cyc_test_by_name$.getGlobalValue(), ct);
        sethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), nconc(gethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED), list(ct)));
        if (name.isCons()) {
            my_pushnew_to_end_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmt = cyc_test_guts(ct);
            if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
                my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmct = cyc_test_guts(ct);
            if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
                my_pushnew_to_end_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        return ct;
    }

    public static final SubLObject unindex_cyc_test_by_name_alt(SubLObject ct, SubLObject name) {
        remhash(name, $cyc_test_by_name$.getGlobalValue());
        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_delete_value_from_hash(name, ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
        if (name.isCons()) {
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_delete_value_from_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            {
                SubLObject rmt = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
                if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
                    com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_delete_value_from_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
                }
            }
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            {
                SubLObject rmct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
                if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
                    com.cyc.cycjava.cycl.cyc_testing.cyc_testing.my_delete_value_from_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
                }
            }
        }
        return ct;
    }

    public static SubLObject unindex_cyc_test_by_name(final SubLObject ct, final SubLObject name) {
        remhash(name, $cyc_test_by_name$.getGlobalValue());
        my_delete_value_from_hash(name, ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
        if (name.isCons()) {
            my_delete_value_from_hash(name.first(), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmt = cyc_test_guts(ct);
            if (NIL != funcall(REMOVAL_MODULE_TEST_P, rmt)) {
                my_delete_value_from_hash(funcall(REMOVAL_MODULE_TEST_PREDICATE, rmt), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            final SubLObject rmct = cyc_test_guts(ct);
            if (NIL != funcall(REMOVAL_MODULE_COST_TEST_P, rmct)) {
                my_delete_value_from_hash(funcall(REMOVAL_MODULE_COST_TEST_PREDICATE, rmct), ct, $cyc_test_by_dwimmed_name$.getGlobalValue());
            }
        }
        return ct;
    }

    /**
     * duplicated due to ordering problems
     */
    @LispMethod(comment = "duplicated due to ordering problems")
    public static final SubLObject my_pushnew_to_end_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, nconc(delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list(item)));
    }

    /**
     * duplicated due to ordering problems
     */
    @LispMethod(comment = "duplicated due to ordering problems")
    public static SubLObject my_pushnew_to_end_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, nconc(delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list(item)));
    }

    /**
     * duplicated due to ordering problems
     */
    @LispMethod(comment = "duplicated due to ordering problems")
    public static final SubLObject my_delete_value_from_hash_alt(SubLObject key, SubLObject item, SubLObject table) {
        return sethash(key, table, delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * duplicated due to ordering problems
     */
    @LispMethod(comment = "duplicated due to ordering problems")
    public static SubLObject my_delete_value_from_hash(final SubLObject key, final SubLObject item, final SubLObject table) {
        return sethash(key, table, delete(item, gethash(key, table, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject index_all_cyc_tests_by_name_alt() {
        {
            SubLObject csome_list_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests();
            SubLObject ct = NIL;
            for (ct = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , ct = csome_list_var.first()) {
                com.cyc.cycjava.cycl.cyc_testing.cyc_testing.index_cyc_test_by_name(ct, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
            }
        }
        return NIL;
    }

    public static SubLObject index_all_cyc_tests_by_name() {
        SubLObject csome_list_var = cyc_tests();
        SubLObject ct = NIL;
        ct = csome_list_var.first();
        while (NIL != csome_list_var) {
            index_cyc_test_by_name(ct, cyc_test_name(ct));
            csome_list_var = csome_list_var.rest();
            ct = csome_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject cyc_test_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.print_cyc_test(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cyc_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cyc_test(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cyc_test_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cyc_test_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_native.class ? T : NIL;
    }

    public static final SubLObject ct_file_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_P);
        return v_object.getField2();
    }

    public static SubLObject ct_file(final SubLObject v_object) {
        assert NIL != cyc_test_p(v_object) : "! cyc_testing.cyc_test_p(v_object) " + "cyc_testing.cyc_test_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ct_guts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_P);
        return v_object.getField3();
    }

    public static SubLObject ct_guts(final SubLObject v_object) {
        assert NIL != cyc_test_p(v_object) : "! cyc_testing.cyc_test_p(v_object) " + "cyc_testing.cyc_test_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_ct_file_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ct_file(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyc_test_p(v_object) : "! cyc_testing.cyc_test_p(v_object) " + "cyc_testing.cyc_test_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ct_guts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ct_guts(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyc_test_p(v_object) : "! cyc_testing.cyc_test_p(v_object) " + "cyc_testing.cyc_test_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_cyc_test_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FILE)) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ct_file(v_new, current_value);
                    } else {
                        if (pcase_var.eql($GUTS)) {
                            com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ct_guts(v_new, current_value);
                        } else {
                            Errors.error($str_alt43$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cyc_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FILE)) {
                _csetf_ct_file(v_new, current_value);
            } else
                if (pcase_var.eql($GUTS)) {
                    _csetf_ct_guts(v_new, current_value);
                } else {
                    Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cyc_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYC_TEST, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FILE, ct_file(obj));
        funcall(visitor_fn, obj, $SLOT, $GUTS, ct_guts(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYC_TEST, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cyc_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyc_test(obj, visitor_fn);
    }

    public static final SubLObject print_cyc_test_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject file = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ct_file(v_object);
            if (NIL != file) {
                format(stream, $str_alt44$__CYC_TEST__a__a_, Strings.string_upcase(file, UNPROVIDED, UNPROVIDED), com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ct_guts(v_object));
            } else {
                format(stream, $str_alt45$__CYC_TEST__a_, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ct_guts(v_object));
            }
        }
        return v_object;
    }

    public static SubLObject print_cyc_test(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject file = ct_file(v_object);
        if (NIL != file) {
            format(stream, $str50$__CYC_TEST__a__a_, Strings.string_upcase(file, UNPROVIDED, UNPROVIDED), ct_guts(v_object));
        } else {
            format(stream, $str51$__CYC_TEST__a_, ct_guts(v_object));
        }
        return v_object;
    }

    public static final SubLObject new_cyc_test_alt(SubLObject file, SubLObject guts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != file) {
                SubLTrampolineFile.checkType(file, STRINGP);
            }
            if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == funcall(CYC_TEST_GUTS_P, guts)) {
                        Errors.error($str_alt48$_s_is_not_a_CYC_TEST_GUTS_P, guts);
                    }
                }
            } else {
                SubLTrampolineFile.checkType(guts, GENERIC_TEST_CASE_TABLE_P);
            }
            {
                SubLObject ct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.make_cyc_test(UNPROVIDED);
                com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ct_file(ct, file);
                com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ct_guts(ct, guts);
                {
                    SubLObject name = (NIL != cyc_testing_initialization.cyc_tests_initializedP()) ? ((SubLObject) (funcall(CYC_TEST_NAME, ct))) : generic_test_case_table_name(guts);
                    SubLObject existing_ct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_test_by_exact_name(name);
                    if (NIL != existing_ct) {
                        $cyc_tests$.setGlobalValue(delete(existing_ct, $cyc_tests$.getGlobalValue(), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.unindex_cyc_test_by_name(existing_ct, name);
                    }
                    {
                        SubLObject new_cons = cons(ct, NIL);
                        SubLObject list = $cyc_tests$.getGlobalValue();
                        if (NIL != list) {
                            subl_macros.rplacd_last(list, new_cons);
                        } else {
                            $cyc_tests$.setGlobalValue(new_cons);
                        }
                    }
                    com.cyc.cycjava.cycl.cyc_testing.cyc_testing.index_cyc_test_by_name(ct, name);
                }
                return ct;
            }
        }
    }

    public static SubLObject new_cyc_test(final SubLObject file, final SubLObject guts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != file) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(file))) {
            throw new AssertionError(file);
        }
        if (NIL != cyc_testing_initialization.cyc_tests_initializedP()) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == funcall(CYC_TEST_GUTS_P, guts))) {
                Errors.error($str54$_s_is_not_a_CYC_TEST_GUTS_P, guts);
            }
        } else {
            assert NIL != generic_test_case_table_p(guts) : "! generic_testing.generic_test_case_table_p(guts) " + ("generic_testing.generic_test_case_table_p(guts) " + "CommonSymbols.NIL != generic_testing.generic_test_case_table_p(guts) ") + guts;
        }
        final SubLObject ct = make_cyc_test(UNPROVIDED);
        _csetf_ct_file(ct, file);
        _csetf_ct_guts(ct, guts);
        final SubLObject name = (NIL != cyc_testing_initialization.cyc_tests_initializedP()) ? funcall(CYC_TEST_NAME, ct) : generic_test_case_table_name(guts);
        final SubLObject existing_ct = find_cyc_test_by_exact_name(name);
        if (NIL != existing_ct) {
            $cyc_tests$.setDynamicValue(delete(existing_ct, $cyc_tests$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            unindex_cyc_test_by_name(existing_ct, name);
        }
        final SubLObject new_cons = cons(ct, NIL);
        final SubLObject list = $cyc_tests$.getDynamicValue(thread);
        if (NIL != list) {
            rplacd_last(list, new_cons);
        } else {
            $cyc_tests$.setDynamicValue(new_cons, thread);
        }
        index_cyc_test_by_name(ct, name);
        return ct;
    }

    public static SubLObject undeclare_cyc_test(final SubLObject test_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing_ct = find_cyc_test_by_exact_name(test_name);
        if (NIL != existing_ct) {
            $cyc_tests$.setDynamicValue(delete(existing_ct, $cyc_tests$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            unindex_cyc_test_by_name(existing_ct, test_name);
            return T;
        }
        return NIL;
    }

    public static final SubLObject cyc_test_file_alt(SubLObject ct) {
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ct_file(ct);
    }

    public static SubLObject cyc_test_file(final SubLObject ct) {
        return ct_file(ct);
    }

    public static final SubLObject cyc_test_guts_alt(SubLObject ct) {
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ct_guts(ct);
    }

    public static SubLObject cyc_test_guts(final SubLObject ct) {
        return ct_guts(ct);
    }

    public static final SubLObject cyc_test_type_alt(SubLObject ct) {
        {
            SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type_permissive(ct);
            if (NIL != type) {
                return type;
            } else {
                return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, ct);
            }
        }
    }

    public static SubLObject cyc_test_type(final SubLObject ct) {
        final SubLObject type = cyc_test_type_permissive(ct);
        if (NIL != type) {
            return type;
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, ct);
    }

    public static final SubLObject cyc_test_guts_p_alt(SubLObject v_object) {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts_type(v_object));
    }

    public static SubLObject cyc_test_guts_p(final SubLObject v_object) {
        return sublisp_boolean(cyc_test_guts_type(v_object));
    }

    public static final SubLObject cyc_test_type_permissive_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts_type(guts);
        }
    }

    public static SubLObject cyc_test_type_permissive(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        return cyc_test_guts_type(guts);
    }

    public static final SubLObject cyc_test_guts_type_alt(SubLObject guts) {
        if (NIL != generic_test_case_table_p(guts)) {
            return $TCT;
        } else {
            if (NIL != inference_unit_tests.inference_unit_test_p(guts)) {
                return $IUT;
            } else {
                if (NIL != removal_module_tests.removal_module_test_p(guts)) {
                    return $RMT;
                } else {
                    if (NIL != removal_module_cost_tests.removal_module_cost_test_p(guts)) {
                        return $RMCT;
                    } else {
                        if (NIL != transformation_module_tests.transformation_module_test_p(guts)) {
                            return $TMT;
                        } else {
                            if (NIL != evaluatable_relation_tests.evaluatable_relation_test_p(guts)) {
                                return $ERT;
                            } else {
                                if (NIL != inference_testing.inference_test_p(guts)) {
                                    return $IT;
                                } else {
                                    if (NIL != kct_utils.kct_test_spec_permissive_p(guts)) {
                                        return $KCT;
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_guts_type(final SubLObject guts) {
        if (NIL != generic_test_case_table_p(guts)) {
            return $TCT;
        }
        if (NIL != inference_unit_tests.inference_unit_test_p(guts)) {
            return $IUT;
        }
        if (NIL != removal_module_tests.removal_module_test_p(guts)) {
            return $RMT;
        }
        if (NIL != removal_module_cost_tests.removal_module_cost_test_p(guts)) {
            return $RMCT;
        }
        if (NIL != transformation_module_tests.transformation_module_test_p(guts)) {
            return $TMT;
        }
        if (NIL != evaluatable_relation_tests.evaluatable_relation_test_p(guts)) {
            return $ERT;
        }
        if (NIL != inference_testing.inference_test_p(guts)) {
            return $IT;
        }
        if (NIL != kct_utils.kct_test_spec_permissive_p(guts)) {
            return $KCT;
        }
        return NIL;
    }

    /**
     * Names are assumed to be unique, even across type
     */
    @LispMethod(comment = "Names are assumed to be unique, even across type")
    public static final SubLObject cyc_test_name_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_name(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return guts;
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_name(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_name(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_name(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_name(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_name(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_name(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Names are assumed to be unique, even across type
     */
    @LispMethod(comment = "Names are assumed to be unique, even across type")
    public static SubLObject cyc_test_name(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_name(guts);
        }
        if (pcase_var.eql($IT)) {
            return guts;
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_name(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_name(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_name(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_name(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_name(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_name(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static SubLObject cyc_test_id(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return NIL;
        }
        if (pcase_var.eql($IT)) {
            return NIL;
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_id(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_id(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_id(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_id(guts);
        }
        if (pcase_var.eql($TCT)) {
            return NIL;
        }
        if (pcase_var.eql($KCT)) {
            return NIL;
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static final SubLObject cyc_test_kb_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_kb(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return inference_testing.inference_test_kb(guts);
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_kb(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_kb(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_kb(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_kb(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_kb(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_kb(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_kb(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_kb(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_kb(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_kb(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_kb(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_kb(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_kb(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_kb(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_kb(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static final SubLObject cyc_test_owner_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_owner(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return inference_testing.inference_test_owner(guts);
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_owner(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_owner(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_owner(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_owner(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_owner(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_owner(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_owner(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_owner(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_owner(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_owner(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_owner(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_owner(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_owner(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_owner(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_owner(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static final SubLObject cyc_test_workingP_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_workingP(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return inference_testing.inference_test_workingP(guts);
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_workingP(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_workingP(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_workingP(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_workingP(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_workingP(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_workingP(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_workingP(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_workingP(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_workingP(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_workingP(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_workingP(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_workingP(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_workingP(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_workingP(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_workingP(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static final SubLObject cyc_test_comment_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return inference_unit_tests.inference_unit_test_comment(guts);
            } else {
                if (pcase_var.eql($IT)) {
                    return inference_testing.inference_test_comment(guts);
                } else {
                    if (pcase_var.eql($RMT)) {
                        return removal_module_tests.removal_module_test_comment(guts);
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return transformation_module_tests.transformation_module_test_comment(guts);
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return removal_module_cost_tests.removal_module_cost_test_comment(guts);
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return evaluatable_relation_tests.evaluatable_relation_test_comment(guts);
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_comment(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_comment(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_comment(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_comment(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_comment(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_comment(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_comment(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_comment(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_comment(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_comment(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_comment(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static final SubLObject cyc_test_project_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                return NIL;
            } else {
                if (pcase_var.eql($IT)) {
                    return NIL;
                } else {
                    if (pcase_var.eql($RMT)) {
                        return NIL;
                    } else {
                        if (pcase_var.eql($TMT)) {
                            return NIL;
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                return NIL;
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    return NIL;
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return NIL;
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            return kct_cyc_testing.kct_test_spec_project(guts);
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_test_project(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return NIL;
        }
        if (pcase_var.eql($IT)) {
            return NIL;
        }
        if (pcase_var.eql($RMT)) {
            return NIL;
        }
        if (pcase_var.eql($TMT)) {
            return NIL;
        }
        if (pcase_var.eql($RMCT)) {
            return NIL;
        }
        if (pcase_var.eql($ERT)) {
            return NIL;
        }
        if (pcase_var.eql($TCT)) {
            return NIL;
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_project(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    /**
     * Return a list of the names of cyc TESTS that mention invalid constants.
     * If TESTS isn't provided, all loaded Cyc tests are examined.
     */
    @LispMethod(comment = "Return a list of the names of cyc TESTS that mention invalid constants.\r\nIf TESTS isn\'t provided, all loaded Cyc tests are examined.\nReturn a list of the names of cyc TESTS that mention invalid constants.\nIf TESTS isn\'t provided, all loaded Cyc tests are examined.")
    public static final SubLObject cyc_test_names_mentioning_invalid_constants_alt(SubLObject tests) {
        if (tests == UNPROVIDED) {
            tests = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests();
        }
        {
            SubLObject all_invalid_test_names = NIL;
            SubLObject cdolist_list_var = tests;
            SubLObject test = NIL;
            for (test = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test = cdolist_list_var.first()) {
                {
                    SubLObject invalid_test_names = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_invalid_constant_test_names(test);
                    SubLObject cdolist_list_var_2 = invalid_test_names;
                    SubLObject invalid_test_name = NIL;
                    for (invalid_test_name = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , invalid_test_name = cdolist_list_var_2.first()) {
                        all_invalid_test_names = cons(invalid_test_name, all_invalid_test_names);
                    }
                }
            }
            return nreverse(all_invalid_test_names);
        }
    }

    /**
     * Return a list of the names of cyc TESTS that mention invalid constants.
     * If TESTS isn't provided, all loaded Cyc tests are examined.
     */
    @LispMethod(comment = "Return a list of the names of cyc TESTS that mention invalid constants.\r\nIf TESTS isn\'t provided, all loaded Cyc tests are examined.\nReturn a list of the names of cyc TESTS that mention invalid constants.\nIf TESTS isn\'t provided, all loaded Cyc tests are examined.")
    public static SubLObject cyc_test_names_mentioning_invalid_constants(SubLObject tests) {
        if (tests == UNPROVIDED) {
            tests = cyc_tests();
        }
        SubLObject all_invalid_test_names = NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject invalid_test_names = cdolist_list_var_$2 = cyc_test_invalid_constant_test_names(test);
            SubLObject invalid_test_name = NIL;
            invalid_test_name = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                all_invalid_test_names = cons(invalid_test_name, all_invalid_test_names);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                invalid_test_name = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        } 
        return nreverse(all_invalid_test_names);
    }

    public static final SubLObject cyc_test_invalid_constant_test_names_alt(SubLObject ct) {
        {
            SubLObject guts = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(ct);
            SubLObject pcase_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type(ct);
            if (pcase_var.eql($IUT)) {
                if (NIL != inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts)) {
                    return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                }
            } else {
                if (pcase_var.eql($IT)) {
                    if (NIL != inference_testing.inference_test_mentions_invalid_constantP(guts)) {
                        return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                    }
                } else {
                    if (pcase_var.eql($RMT)) {
                        if (NIL != removal_module_tests.removal_module_test_mentions_invalid_constantP(guts)) {
                            return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                        }
                    } else {
                        if (pcase_var.eql($TMT)) {
                            if (NIL != transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts)) {
                                return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                            }
                        } else {
                            if (pcase_var.eql($RMCT)) {
                                if (NIL != removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts)) {
                                    return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                                }
                            } else {
                                if (pcase_var.eql($ERT)) {
                                    if (NIL != evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts)) {
                                        return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                                    }
                                } else {
                                    if (pcase_var.eql($TCT)) {
                                        return generic_test_case_table_tuples_mentioning_some_invalid_constant(guts);
                                    } else {
                                        if (pcase_var.eql($KCT)) {
                                            if (NIL != kct_cyc_testing.kct_test_spec_mentions_invalid_constantP(guts)) {
                                                return list(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_name(ct));
                                            }
                                        } else {
                                            return Errors.error($str_alt51$Cyc_test_of_unexpected_type___s, guts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_test_invalid_constant_test_names(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            if (NIL != inference_unit_tests.inference_unit_test_mentions_invalid_constantP(guts)) {
                return list(cyc_test_name(ct));
            }
        } else
            if (pcase_var.eql($IT)) {
                if (NIL != inference_testing.inference_test_mentions_invalid_constantP(guts)) {
                    return list(cyc_test_name(ct));
                }
            } else
                if (pcase_var.eql($RMT)) {
                    if (NIL != removal_module_tests.removal_module_test_mentions_invalid_constantP(guts)) {
                        return list(cyc_test_name(ct));
                    }
                } else
                    if (pcase_var.eql($TMT)) {
                        if (NIL != transformation_module_tests.transformation_module_test_mentions_invalid_constantP(guts)) {
                            return list(cyc_test_name(ct));
                        }
                    } else
                        if (pcase_var.eql($RMCT)) {
                            if (NIL != removal_module_cost_tests.removal_module_cost_test_mentions_invalid_constantP(guts)) {
                                return list(cyc_test_name(ct));
                            }
                        } else
                            if (pcase_var.eql($ERT)) {
                                if (NIL != evaluatable_relation_tests.evaluatable_relation_test_mentions_invalid_constantP(guts)) {
                                    return list(cyc_test_name(ct));
                                }
                            } else {
                                if (pcase_var.eql($TCT)) {
                                    return generic_test_case_table_tuples_mentioning_some_invalid_constant(guts);
                                }
                                if (!pcase_var.eql($KCT)) {
                                    return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
                                }
                                if (NIL != kct_test_spec_mentions_invalid_constantP(guts)) {
                                    return list(cyc_test_name(ct));
                                }
                            }





        return NIL;
    }

    public static SubLObject cyc_tests_mentioning_invalid_constants(SubLObject tests) {
        if (tests == UNPROVIDED) {
            tests = cyc_tests();
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = tests;
        SubLObject ct = NIL;
        ct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != cyc_test_workingP(ct)) && (NIL != cyc_test_invalidP(ct))) {
                result = cons(ct, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ct = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject cyc_test_invalidP(final SubLObject ct) {
        return sublisp_boolean(cyc_test_invalid_constants(ct));
    }

    public static SubLObject cyc_test_invalid_constants(final SubLObject ct) {
        final SubLObject guts = cyc_test_guts(ct);
        final SubLObject pcase_var = cyc_test_type(ct);
        if (pcase_var.eql($IUT)) {
            return inference_unit_tests.inference_unit_test_invalid_constants(guts);
        }
        if (pcase_var.eql($IT)) {
            return inference_testing.inference_test_invalid_constants(guts);
        }
        if (pcase_var.eql($RMT)) {
            return removal_module_tests.removal_module_test_invalid_constants(guts);
        }
        if (pcase_var.eql($TMT)) {
            return transformation_module_tests.transformation_module_test_invalid_constants(guts);
        }
        if (pcase_var.eql($RMCT)) {
            return removal_module_cost_tests.removal_module_cost_test_invalid_constants(guts);
        }
        if (pcase_var.eql($ERT)) {
            return evaluatable_relation_tests.evaluatable_relation_test_invalid_constants(guts);
        }
        if (pcase_var.eql($TCT)) {
            return generic_test_case_table_tuples_invalid_constants(guts);
        }
        if (pcase_var.eql($KCT)) {
            return kct_test_spec_invalid_constants(guts);
        }
        return Errors.error($str57$Cyc_test_of_unexpected_type___s, guts);
    }

    public static SubLObject print_post_build_test_summary(final SubLObject stream, final SubLObject result, final SubLObject type, final SubLObject name, final SubLObject time, final SubLObject owner) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (result == $NOT_RUN) {
            return NIL;
        }
        if (NIL != $print_post_build_test_summary_timestampP$.getDynamicValue(thread)) {
            return format_nil.force_format(stream, $str67$___A__S__S__S____3f___OWNER__S__, numeric_date_utilities.timestring_ms(UNPROVIDED, UNPROVIDED), result, type, name, time, owner, UNPROVIDED, UNPROVIDED);
        }
        return format_nil.force_format(stream, $str68$___S__S__S____3f___OWNER__S__, result, type, name, time, owner, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a Cyc test that is declared to
    be run in the Tiny KB.  Note that this will be true if OBJECT is declared
    to be run in both tiny and full KBs.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a Cyc test that is declared to\r\nbe run in the Tiny KB.  Note that this will be true if OBJECT is declared\r\nto be run in both tiny and full KBs.")
    public static final SubLObject tiny_kb_cyc_test_p_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_p(v_object)) {
            {
                SubLObject kb = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_kb(v_object);
                return makeBoolean(($TINY == kb) || ($BOTH == kb));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a Cyc test that is declared to
    be run in the Tiny KB.  Note that this will be true if OBJECT is declared
    to be run in both tiny and full KBs.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a Cyc test that is declared to\r\nbe run in the Tiny KB.  Note that this will be true if OBJECT is declared\r\nto be run in both tiny and full KBs.")
    public static SubLObject tiny_kb_cyc_test_p(final SubLObject v_object) {
        if (NIL != cyc_test_p(v_object)) {
            final SubLObject kb = cyc_test_kb(v_object);
            return makeBoolean(($TINY == kb) || ($BOTH == kb));
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a Cyc test that is declared to
    be run in the full KB.  Note that this will be true if OBJECT is declared
    to be run in both tiny and full KBs.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a Cyc test that is declared to\r\nbe run in the full KB.  Note that this will be true if OBJECT is declared\r\nto be run in both tiny and full KBs.")
    public static final SubLObject full_kb_cyc_test_p_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_p(v_object)) {
            {
                SubLObject kb = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_kb(v_object);
                return makeBoolean(($FULL == kb) || ($BOTH == kb));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether OBJECT is a Cyc test that is declared to
    be run in the full KB.  Note that this will be true if OBJECT is declared
    to be run in both tiny and full KBs.
     */
    @LispMethod(comment = "@return booleanp; whether OBJECT is a Cyc test that is declared to\r\nbe run in the full KB.  Note that this will be true if OBJECT is declared\r\nto be run in both tiny and full KBs.")
    public static SubLObject full_kb_cyc_test_p(final SubLObject v_object) {
        if (NIL != cyc_test_p(v_object)) {
            final SubLObject kb = cyc_test_kb(v_object);
            return makeBoolean(($FULL == kb) || ($BOTH == kb));
        }
        return NIL;
    }

    /**
     *
     *
     * @return list of cyc-test-p; a list of all the Cyc test objects declared to be non-working.
    If TYPE is specified, the result only includes tests of TYPE.
     */
    @LispMethod(comment = "@return list of cyc-test-p; a list of all the Cyc test objects declared to be non-working.\r\nIf TYPE is specified, the result only includes tests of TYPE.")
    public static final SubLObject non_working_cyc_tests_alt(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (NIL != type) {
            SubLTrampolineFile.checkType(type, CYC_TEST_TYPE_SPEC_P);
        }
        {
            SubLObject all_tests = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests();
            SubLObject all_non_working_tests = remove_if(symbol_function($sym64$CYC_TEST_WORKING_), all_tests, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != type) {
                all_non_working_tests = remove(type, all_non_working_tests, symbol_function(NOT_EQ), symbol_function(CYC_TEST_TYPE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return all_non_working_tests;
        }
    }

    /**
     *
     *
     * @return list of cyc-test-p; a list of all the Cyc test objects declared to be non-working.
    If TYPE is specified, the result only includes tests of TYPE.
     */
    @LispMethod(comment = "@return list of cyc-test-p; a list of all the Cyc test objects declared to be non-working.\r\nIf TYPE is specified, the result only includes tests of TYPE.")
    public static SubLObject non_working_cyc_tests(SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        if (((NIL != type) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == cyc_test_type_spec_p(type))) {
            throw new AssertionError(type);
        }
        final SubLObject all_tests = cyc_tests();
        SubLObject all_non_working_tests = remove_if(symbol_function($sym73$CYC_TEST_WORKING_), all_tests, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != type) {
            all_non_working_tests = remove(type, all_non_working_tests, symbol_function(NOT_EQ), symbol_function(CYC_TEST_TYPE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return all_non_working_tests;
    }

    /**
     *
     *
     * @return cyc-test-run-p
     */
    @LispMethod(comment = "@return cyc-test-run-p")
    public static final SubLObject find_cyc_test_by_exact_name_alt(SubLObject name) {
        return gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @return cyc-test-run-p
     */
    @LispMethod(comment = "@return cyc-test-run-p")
    public static SubLObject find_cyc_test_by_exact_name(final SubLObject name) {
        return gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject find_cyc_test_alt(SubLObject name) {
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_tests(name).first();
    }

    public static SubLObject find_cyc_test(final SubLObject name) {
        return find_cyc_tests(name).first();
    }

    /**
     *
     *
     * @return list of cyc-test-p
     */
    @LispMethod(comment = "@return list of cyc-test-p")
    public static final SubLObject find_cyc_tests_alt(SubLObject name) {
        {
            SubLObject tests = NIL;
            SubLObject dwimmed_names = cons(name, test_cases_of_class(name));
            SubLObject cdolist_list_var = dwimmed_names;
            SubLObject dwimmed_name = NIL;
            for (dwimmed_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dwimmed_name = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_3 = gethash_without_values(dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED);
                    SubLObject test = NIL;
                    for (test = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , test = cdolist_list_var_3.first()) {
                        {
                            SubLObject item_var = test;
                            if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
                                tests = cons(item_var, tests);
                            }
                        }
                    }
                }
            }
            return tests;
        }
    }

    /**
     *
     *
     * @return list of cyc-test-p
     */
    @LispMethod(comment = "@return list of cyc-test-p")
    public static SubLObject find_cyc_tests(final SubLObject name) {
        SubLObject tests = NIL;
        SubLObject cdolist_list_var;
        final SubLObject dwimmed_names = cdolist_list_var = cons(name, test_cases_of_class(name));
        SubLObject dwimmed_name = NIL;
        dwimmed_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = gethash_without_values(dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED);
            SubLObject test = NIL;
            test = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var = test;
                if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
                    tests = cons(item_var, tests);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                test = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            dwimmed_name = cdolist_list_var.first();
        } 
        return tests;
    }

    public static SubLObject find_cyc_test_number(final SubLObject name, final SubLObject test_number) {
        return find_cyc_tests_in_range(name, test_number, test_number);
    }

    public static SubLObject find_cyc_tests_in_range(final SubLObject name, final SubLObject min_number, final SubLObject max_number) {
        SubLObject tests = NIL;
        SubLObject cdolist_list_var;
        final SubLObject dwimmed_names = cdolist_list_var = cons(name, test_cases_of_class(name));
        SubLObject dwimmed_name = NIL;
        dwimmed_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = gethash_without_values(dwimmed_name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED);
            SubLObject test = NIL;
            test = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject test_id = cyc_test_id(test);
                if (NIL != test_id) {
                    if (test_id.numGE(min_number) && test_id.numLE(max_number)) {
                        final SubLObject item_var = test;
                        if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
                            tests = cons(item_var, tests);
                        }
                    }
                } else {
                    final SubLObject item_var = test;
                    if (NIL == member(item_var, tests, symbol_function(EQL), symbol_function(IDENTITY))) {
                        tests = cons(item_var, tests);
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

    /**
     *
     *
     * @return list of cyc-test-p
     */
    @LispMethod(comment = "@return list of cyc-test-p")
    public static final SubLObject find_cyc_tests_by_name_alt(SubLObject names) {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CYC_TEST), names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return list of cyc-test-p
     */
    @LispMethod(comment = "@return list of cyc-test-p")
    public static SubLObject find_cyc_tests_by_name(final SubLObject names) {
        return delete(NIL, Mapping.mapcar(symbol_function(FIND_CYC_TEST), names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return the filename of the test file that contains the Cyc test indicated by NAME.
     */
    @LispMethod(comment = "Return the filename of the test file that contains the Cyc test indicated by NAME.")
    public static final SubLObject find_cyc_test_filename_alt(SubLObject name) {
        {
            SubLObject cyc_test = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_test(name);
            if (NIL != cyc_test) {
                return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_file(cyc_test);
            }
        }
        return NIL;
    }

    /**
     * Return the filename of the test file that contains the Cyc test indicated by NAME.
     */
    @LispMethod(comment = "Return the filename of the test file that contains the Cyc test indicated by NAME.")
    public static SubLObject find_cyc_test_filename(final SubLObject name) {
        final SubLObject cyc_test = find_cyc_test(name);
        if (NIL != cyc_test) {
            return cyc_test_file(cyc_test);
        }
        return NIL;
    }

    public static final SubLObject cfasl_output_object_cyc_test_method_alt(SubLObject v_object, SubLObject stream) {
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cfasl_wide_output_cyc_test(v_object, stream);
    }

    public static SubLObject cfasl_output_object_cyc_test_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_wide_output_cyc_test(v_object, stream);
    }

    public static final SubLObject cfasl_wide_output_cyc_test_alt(SubLObject cyc_test, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_cyc_test$.getGlobalValue(), stream);
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cfasl_output_cyc_test_internal(cyc_test, stream);
    }

    public static SubLObject cfasl_wide_output_cyc_test(final SubLObject cyc_test, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_cyc_test$.getGlobalValue(), stream);
        return cfasl_output_cyc_test_internal(cyc_test, stream);
    }

    public static final SubLObject cfasl_output_cyc_test_internal_alt(SubLObject cyc_test, SubLObject stream) {
        cfasl_output(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_file(cyc_test), stream);
        cfasl_output(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_guts(cyc_test), stream);
        return cyc_test;
    }

    public static SubLObject cfasl_output_cyc_test_internal(final SubLObject cyc_test, final SubLObject stream) {
        cfasl_output(cyc_test_file(cyc_test), stream);
        cfasl_output(cyc_test_guts(cyc_test), stream);
        return cyc_test;
    }

    public static final SubLObject cfasl_input_cyc_test_alt(SubLObject stream) {
        {
            SubLObject file = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject guts = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test(file, guts);
        }
    }

    public static SubLObject cfasl_input_cyc_test(final SubLObject stream) {
        final SubLObject file = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject guts = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_cyc_test(file, guts);
    }

    public static final SubLObject new_cyc_test_run_alt(SubLObject type, SubLObject name, SubLObject result, SubLObject time) {
        SubLTrampolineFile.checkType(type, CYC_TEST_TYPE_P);
        SubLTrampolineFile.checkType(result, CYC_TEST_RESULT_P);
        if (NIL != time) {
            SubLTrampolineFile.checkType(time, NON_NEGATIVE_NUMBER_P);
        }
        return list(type, name, result, time);
    }

    public static SubLObject new_cyc_test_run(final SubLObject type, final SubLObject name, final SubLObject result, final SubLObject time) {
        assert NIL != cyc_test_type_p(type) : "! cyc_testing.cyc_test_type_p(type) " + ("cyc_testing.cyc_test_type_p(type) " + "CommonSymbols.NIL != cyc_testing.cyc_test_type_p(type) ") + type;
        assert NIL != cyc_test_result_p(result) : "! cyc_testing.cyc_test_result_p(result) " + ("cyc_testing.cyc_test_result_p(result) " + "CommonSymbols.NIL != cyc_testing.cyc_test_result_p(result) ") + result;
        if (((NIL != time) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == number_utilities.non_negative_number_p(time))) {
            throw new AssertionError(time);
        }
        return list(type, name, result, time);
    }

    public static final SubLObject cyc_test_run_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_type_p(v_object.first()))) && (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_result_p(third(v_object))));
    }

    public static SubLObject cyc_test_run_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != cyc_test_type_p(v_object.first()))) && (NIL != cyc_test_result_p(third(v_object))));
    }

    public static final SubLObject cyc_test_run_type_alt(SubLObject test_run) {
        SubLTrampolineFile.checkType(test_run, CYC_TEST_RUN_P);
        return test_run.first();
    }

    public static SubLObject cyc_test_run_type(final SubLObject test_run) {
        assert NIL != cyc_test_run_p(test_run) : "! cyc_testing.cyc_test_run_p(test_run) " + ("cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) ") + test_run;
        return test_run.first();
    }

    public static final SubLObject cyc_test_run_name_alt(SubLObject test_run) {
        SubLTrampolineFile.checkType(test_run, CYC_TEST_RUN_P);
        return second(test_run);
    }

    public static SubLObject cyc_test_run_name(final SubLObject test_run) {
        assert NIL != cyc_test_run_p(test_run) : "! cyc_testing.cyc_test_run_p(test_run) " + ("cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) ") + test_run;
        return second(test_run);
    }

    public static final SubLObject cyc_test_run_result_alt(SubLObject test_run) {
        SubLTrampolineFile.checkType(test_run, CYC_TEST_RUN_P);
        return third(test_run);
    }

    public static SubLObject cyc_test_run_result(final SubLObject test_run) {
        assert NIL != cyc_test_run_p(test_run) : "! cyc_testing.cyc_test_run_p(test_run) " + ("cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) ") + test_run;
        return third(test_run);
    }

    public static final SubLObject cyc_test_run_time_alt(SubLObject test_run) {
        SubLTrampolineFile.checkType(test_run, CYC_TEST_RUN_P);
        return fourth(test_run);
    }

    public static SubLObject cyc_test_run_time(final SubLObject test_run) {
        assert NIL != cyc_test_run_p(test_run) : "! cyc_testing.cyc_test_run_p(test_run) " + ("cyc_testing.cyc_test_run_p(test_run) " + "CommonSymbols.NIL != cyc_testing.cyc_test_run_p(test_run) ") + test_run;
        return fourth(test_run);
    }

    public static final SubLObject cyc_test_run_cyc_test_alt(SubLObject test_run) {
        {
            SubLObject name = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_name(test_run);
            if ($IT == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_type(test_run)) {
                if (NIL == list_utilities.member_eqP(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run), $list_alt118)) {
                    name = name.first();
                }
            }
            if ($TCT == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_type(test_run)) {
                if (com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run) != $NOT_RUN) {
                    name = name.first();
                }
            }
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_test_by_exact_name(name);
        }
    }

    public static SubLObject cyc_test_run_cyc_test(final SubLObject test_run) {
        SubLObject name = cyc_test_run_name(test_run);
        if (($IT == cyc_test_run_type(test_run)) && (NIL == member_eqP(cyc_test_run_result(test_run), $list83))) {
            name = name.first();
        }
        if (($TCT == cyc_test_run_type(test_run)) && (cyc_test_run_result(test_run) != $NOT_RUN)) {
            name = name.first();
        }
        return find_cyc_test_by_exact_name(name);
    }

    public static final SubLObject cyc_test_runs_overall_result_alt(SubLObject test_runs) {
        {
            SubLObject overall_result = $NOT_RUN;
            SubLObject cdolist_list_var = test_runs;
            SubLObject test_run = NIL;
            for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                {
                    SubLObject test_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
                    overall_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_result_update(overall_result, test_result);
                }
            }
            return overall_result;
        }
    }

    public static SubLObject cyc_test_runs_overall_result(final SubLObject test_runs) {
        SubLObject overall_result = $NOT_RUN;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_result = cyc_test_run_result(test_run);
            overall_result = cyc_test_result_update(overall_result, test_result);
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        } 
        return overall_result;
    }

    public static final SubLObject cyc_test_result_update_alt(SubLObject overall_result, SubLObject test_result) {
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_ignore_result_p(overall_result)) {
            return test_result;
        } else {
            if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_failure_result_p(overall_result)) {
                return $FAILURE;
            } else {
                if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_success_result_p(overall_result)) {
                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_failure_result_p(test_result)) {
                        return $FAILURE;
                    } else {
                        return $SUCCESS;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_test_result_update(final SubLObject overall_result, final SubLObject test_result) {
        if (NIL != cyc_test_ignore_result_p(overall_result)) {
            return test_result;
        }
        if (NIL != cyc_test_failure_result_p(overall_result)) {
            return $FAILURE;
        }
        if (NIL == cyc_test_success_result_p(overall_result)) {
            return NIL;
        }
        if (NIL != cyc_test_failure_result_p(test_result)) {
            return $FAILURE;
        }
        return $SUCCESS;
    }

    public static final SubLObject cyc_test_runs_total_time_alt(SubLObject test_runs) {
        {
            SubLObject total_time = ZERO_INTEGER;
            SubLObject cdolist_list_var = test_runs;
            SubLObject test_run = NIL;
            for (test_run = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_run = cdolist_list_var.first()) {
                {
                    SubLObject test_time = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_time(test_run);
                    if (NIL != test_time) {
                        total_time = add(total_time, test_time);
                    }
                }
            }
            return total_time;
        }
    }

    public static SubLObject cyc_test_runs_total_time(final SubLObject test_runs) {
        SubLObject total_time = ZERO_INTEGER;
        SubLObject cdolist_list_var = test_runs;
        SubLObject test_run = NIL;
        test_run = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_time = cyc_test_run_time(test_run);
            if (NIL != test_time) {
                total_time = add(total_time, test_time);
            }
            cdolist_list_var = cdolist_list_var.rest();
            test_run = cdolist_list_var.first();
        } 
        return total_time;
    }

    public static final SubLObject failing_cyc_test_run_p_alt(SubLObject test_run) {
        {
            SubLObject result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_failure_result_p(result);
        }
    }

    public static SubLObject failing_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_failure_result_p(result);
    }

    public static final SubLObject succeeding_cyc_test_run_p_alt(SubLObject test_run) {
        {
            SubLObject result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_success_result_p(result);
        }
    }

    public static SubLObject succeeding_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_success_result_p(result);
    }

    public static final SubLObject ignored_cyc_test_run_p_alt(SubLObject test_run) {
        {
            SubLObject result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
            return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_ignore_result_p(result);
        }
    }

    public static SubLObject ignored_cyc_test_run_p(final SubLObject test_run) {
        final SubLObject result = cyc_test_run_result(test_run);
        return cyc_test_ignore_result_p(result);
    }

    public static final SubLObject cyc_test_run_owner_alt(SubLObject test_run) {
        {
            SubLObject ct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_cyc_test(test_run);
            if (NIL != ct) {
                return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_owner(ct);
            }
        }
        return NIL;
    }

    public static SubLObject cyc_test_run_owner(final SubLObject test_run) {
        final SubLObject ct = cyc_test_run_cyc_test(test_run);
        if (NIL != ct) {
            return cyc_test_owner(ct);
        }
        return NIL;
    }

    public static final SubLObject cyc_test_run_project_alt(SubLObject test_run) {
        {
            SubLObject ct = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_cyc_test(test_run);
            if (NIL != ct) {
                return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_project(ct);
            }
        }
        return NIL;
    }

    public static SubLObject cyc_test_run_project(final SubLObject test_run) {
        final SubLObject ct = cyc_test_run_cyc_test(test_run);
        if (NIL != ct) {
            return cyc_test_project(ct);
        }
        return NIL;
    }

    public static final SubLObject print_cyc_test_run_summary_alt(SubLObject test_run, SubLObject stream, SubLObject output_format, SubLObject verbosity) {
        if ($SILENT != verbosity) {
            {
                SubLObject name = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_name(test_run);
                SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_type(test_run);
                SubLObject result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
                SubLObject pcase_var = output_format;
                if (pcase_var.eql($STANDARD)) {
                    format(stream, $str_alt122$___S_____S, name, result);
                } else {
                    if (pcase_var.eql($POST_BUILD)) {
                        format(stream, $str_alt123$_S__S__S__, new SubLObject[]{ result, type, name });
                    } else {
                        format(stream, $str_alt124$Unknown_output_format__A, output_format);
                    }
                }
                force_output(stream);
            }
        }
        return NIL;
    }

    public static SubLObject print_cyc_test_run_summary(final SubLObject test_run, final SubLObject stream, final SubLObject output_format, final SubLObject verbosity) {
        if ($SILENT != verbosity) {
            final SubLObject name = cyc_test_run_name(test_run);
            final SubLObject type = cyc_test_run_type(test_run);
            final SubLObject result = cyc_test_run_result(test_run);
            final SubLObject owner = cyc_test_run_owner(test_run);
            final SubLObject time = cyc_test_run_time(test_run);
            if (output_format.eql($STANDARD)) {
                format(stream, $str87$___S__S_____S___S_, new SubLObject[]{ type, name, result, time });
            } else
                if (output_format.eql($POST_BUILD)) {
                    print_post_build_test_summary(stream, result, type, name, time, owner);
                } else {
                    format(stream, $str89$Unknown_output_format__A, output_format);
                }

            force_output(stream);
        }
        return NIL;
    }

    public static final SubLObject cyc_test_run_summary_alt(SubLObject test_run, SubLObject output_format, SubLObject verbosity) {
        if ($SILENT != verbosity) {
            {
                SubLObject name = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_name(test_run);
                SubLObject type = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_type(test_run);
                SubLObject result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_result(test_run);
                SubLObject owner = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_run_owner(test_run);
                SubLObject pcase_var = output_format;
                if (pcase_var.eql($STANDARD)) {
                    return format(NIL, $str_alt122$___S_____S, name, result);
                } else {
                    if (pcase_var.eql($POST_BUILD)) {
                        return cconcatenate(format_nil.format_nil_s_no_copy(result), new SubLObject[]{ $str_alt125$_, format_nil.format_nil_s_no_copy(type), $str_alt125$_, format_nil.format_nil_s_no_copy(name), format_nil.$format_nil_percent$.getGlobalValue() });
                    } else {
                        if (pcase_var.eql($WITH_OWNER)) {
                            return cconcatenate(format_nil.format_nil_s_no_copy(result), new SubLObject[]{ $str_alt125$_, format_nil.format_nil_s_no_copy(type), $str_alt125$_, format_nil.format_nil_s_no_copy(name), $str_alt125$_, format_nil.format_nil_s_no_copy(owner), format_nil.$format_nil_percent$.getGlobalValue() });
                        } else {
                            return cconcatenate($str_alt127$Unknown_output_format_, format_nil.format_nil_a_no_copy(output_format));
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_test_run_summary(final SubLObject test_run, final SubLObject output_format, final SubLObject verbosity) {
        if ($SILENT == verbosity) {
            return NIL;
        }
        final SubLObject name = cyc_test_run_name(test_run);
        final SubLObject type = cyc_test_run_type(test_run);
        final SubLObject result = cyc_test_run_result(test_run);
        final SubLObject owner = cyc_test_run_owner(test_run);
        final SubLObject time = cyc_test_run_time(test_run);
        if (output_format.eql($STANDARD)) {
            return format(NIL, $str87$___S__S_____S___S_, new SubLObject[]{ type, name, result, time });
        }
        if (output_format.eql($POST_BUILD)) {
            return print_post_build_test_summary(NIL, result, type, name, time, owner);
        }
        if (output_format.eql($WITH_OWNER)) {
            return cconcatenate(format_nil.format_nil_s_no_copy(result), new SubLObject[]{ $$$_, format_nil.format_nil_s_no_copy(time), $$$_, format_nil.format_nil_s_no_copy(type), $$$_, format_nil.format_nil_s_no_copy(name), $$$_, format_nil.format_nil_s_no_copy(owner), format_nil.$format_nil_percent$.getGlobalValue() });
        }
        return cconcatenate($$$Unknown_output_format_, format_nil.format_nil_a_no_copy(output_format));
    }

    public static final SubLObject cyc_test_files_alt() {
        return $cyc_test_files$.getGlobalValue();
    }

    public static SubLObject cyc_test_files() {
        return $cyc_test_files$.getGlobalValue();
    }

    public static final SubLObject do_cyc_test_files_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt129);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyc_test_file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt129);
                    cyc_test_file = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, bq_cons(cyc_test_file, $list_alt131), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt129);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list94);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test_file = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        cyc_test_file = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(cyc_test_file, $list96), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list94);
        return NIL;
    }

    public static final SubLObject progress_do_cyc_test_files_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt132);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cyc_test_file = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt132);
                    cyc_test_file = current.first();
                    current = current.rest();
                    {
                        SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $$$Iterating_over_all_test_files;
                        destructuring_bind_must_listp(current, datum, $list_alt132);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(PROGRESS_CDOLIST, list(cyc_test_file, $list_alt134, message), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt132);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject progress_do_cyc_test_files(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cyc_test_file = NIL;
        destructuring_bind_must_consp(current, datum, $list97);
        cyc_test_file = current.first();
        current = current.rest();
        final SubLObject message = (current.isCons()) ? current.first() : $$$Iterating_over_all_test_files;
        destructuring_bind_must_listp(current, datum, $list97);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(PROGRESS_CDOLIST, list(cyc_test_file, $list99, message), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list97);
        return NIL;
    }

    public static final SubLObject cyc_test_file_count_alt() {
        return length($cyc_test_files$.getGlobalValue());
    }

    public static SubLObject cyc_test_file_count() {
        return length($cyc_test_files$.getGlobalValue());
    }

    public static final SubLObject cyc_test_file_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.print_cyc_test_file(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cyc_test_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cyc_test_file(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cyc_test_file_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cyc_test_file_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_native.class ? T : NIL;
    }

    public static final SubLObject ctf_filename_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_FILE_P);
        return v_object.getField2();
    }

    public static SubLObject ctf_filename(final SubLObject v_object) {
        assert NIL != cyc_test_file_p(v_object) : "! cyc_testing.cyc_test_file_p(v_object) " + "cyc_testing.cyc_test_file_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ctf_kb_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_FILE_P);
        return v_object.getField3();
    }

    public static SubLObject ctf_kb(final SubLObject v_object) {
        assert NIL != cyc_test_file_p(v_object) : "! cyc_testing.cyc_test_file_p(v_object) " + "cyc_testing.cyc_test_file_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_ctf_filename_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_FILE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ctf_filename(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyc_test_file_p(v_object) : "! cyc_testing.cyc_test_file_p(v_object) " + "cyc_testing.cyc_test_file_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ctf_kb_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CYC_TEST_FILE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ctf_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != cyc_test_file_p(v_object) : "! cyc_testing.cyc_test_file_p(v_object) " + "cyc_testing.cyc_test_file_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_cyc_test_file_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($FILENAME)) {
                        com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ctf_filename(v_new, current_value);
                    } else {
                        if (pcase_var.eql($KB)) {
                            com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ctf_kb(v_new, current_value);
                        } else {
                            Errors.error($str_alt43$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cyc_test_file(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FILENAME)) {
                _csetf_ctf_filename(v_new, current_value);
            } else
                if (pcase_var.eql($KB)) {
                    _csetf_ctf_kb(v_new, current_value);
                } else {
                    Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cyc_test_file(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CYC_TEST_FILE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FILENAME, ctf_filename(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, ctf_kb(obj));
        funcall(visitor_fn, obj, $END, MAKE_CYC_TEST_FILE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cyc_test_file_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cyc_test_file(obj, visitor_fn);
    }

    public static final SubLObject print_cyc_test_file_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt149$__CTF__a_, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_filename(v_object));
        return v_object;
    }

    public static SubLObject print_cyc_test_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str117$__CTF__a_, ctf_filename(v_object));
        return v_object;
    }

    public static final SubLObject new_cyc_test_file_alt(SubLObject filename, SubLObject kb) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        SubLTrampolineFile.checkType(kb, CYC_TEST_KB_P);
        {
            SubLObject cyc_test_file = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.make_cyc_test_file(UNPROVIDED);
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ctf_filename(cyc_test_file, filename);
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing._csetf_ctf_kb(cyc_test_file, kb);
            return cyc_test_file;
        }
    }

    public static SubLObject new_cyc_test_file(final SubLObject filename, final SubLObject kb) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        assert NIL != cyc_test_kb_p(kb) : "! cyc_testing.cyc_test_kb_p(kb) " + ("cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) ") + kb;
        final SubLObject cyc_test_file = make_cyc_test_file(UNPROVIDED);
        _csetf_ctf_filename(cyc_test_file, filename);
        _csetf_ctf_kb(cyc_test_file, kb);
        return cyc_test_file;
    }

    public static final SubLObject cyc_test_file_filename_alt(SubLObject cyc_test_file) {
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_filename(cyc_test_file);
    }

    public static SubLObject cyc_test_file_filename(final SubLObject cyc_test_file) {
        return ctf_filename(cyc_test_file);
    }

    public static final SubLObject find_cyc_test_file_alt(SubLObject filename) {
        {
            SubLObject cdolist_list_var = $cyc_test_files$.getGlobalValue();
            SubLObject cyc_test_file = NIL;
            for (cyc_test_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cyc_test_file = cdolist_list_var.first()) {
                if (filename.equal(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_filename(cyc_test_file))) {
                    return cyc_test_file;
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_cyc_test_file(final SubLObject filename) {
        SubLObject cdolist_list_var = $cyc_test_files$.getGlobalValue();
        SubLObject cyc_test_file = NIL;
        cyc_test_file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (filename.equal(ctf_filename(cyc_test_file))) {
                return cyc_test_file;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_test_file = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject most_recent_cyc_test_runs_alt() {
        return $most_recent_cyc_test_runs$.getGlobalValue();
    }

    public static SubLObject most_recent_cyc_test_runs() {
        return $most_recent_cyc_test_runs$.getGlobalValue();
    }

    public static final SubLObject most_recent_failing_cyc_test_runs_alt() {
        return list_utilities.remove_if_not(FAILING_CYC_TEST_RUN_P, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.most_recent_cyc_test_runs(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject most_recent_failing_cyc_test_runs() {
        return remove_if_not(FAILING_CYC_TEST_RUN_P, most_recent_cyc_test_runs(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject most_recent_failing_cyc_tests_alt() {
        return Mapping.mapcar(CYC_TEST_RUN_CYC_TEST, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.most_recent_failing_cyc_test_runs());
    }

    public static SubLObject most_recent_failing_cyc_tests() {
        return Mapping.mapcar(CYC_TEST_RUN_CYC_TEST, most_recent_failing_cyc_test_runs());
    }

    public static final SubLObject most_recent_cyc_test_file_load_failures_alt() {
        return $most_recent_cyc_test_file_load_failures$.getGlobalValue();
    }

    public static SubLObject most_recent_cyc_test_file_load_failures() {
        return $most_recent_cyc_test_file_load_failures$.getGlobalValue();
    }

    /**
     *
     *
     * @param PATH
     * 		nil or stringp; NIL indicates that all already-loaded tests should be run
     * 		without attempting to reload from PATH
     * @param RUN-TEST-CASE-TABLES?
     * 		booleanp; usually the set of tests to run is controlled
     * 		by loading them via the testdcl, but test case tables are always loaded, so we need this switch
     * @param TYPE
     * 		cyc-test-type-spec-p; if other than :all, will only run this type of test.
     * @param RUN-NON-WORKING-TESTS
     * 		NIL, T or :only; whether to run only working tests, all tests, or only non-working tests.
     */
    @LispMethod(comment = "@param PATH\r\n\t\tnil or stringp; NIL indicates that all already-loaded tests should be run\r\n\t\twithout attempting to reload from PATH\r\n@param RUN-TEST-CASE-TABLES?\r\n\t\tbooleanp; usually the set of tests to run is controlled\r\n\t\tby loading them via the testdcl, but test case tables are always loaded, so we need this switch\r\n@param TYPE\r\n\t\tcyc-test-type-spec-p; if other than :all, will only run this type of test.\r\n@param RUN-NON-WORKING-TESTS\r\n\t\tNIL, T or :only; whether to run only working tests, all tests, or only non-working tests.")
    public static final SubLObject run_all_cyc_tests_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject path = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt155);
            path = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_7 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt155);
                    current_7 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt155);
                    if (NIL == member(current_7, $list_alt156, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_7 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt155);
                }
                {
                    SubLObject stream_tail = property_list_member($STREAM, current);
                    SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                    SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
                    SubLObject verbosity = (NIL != verbosity_tail) ? ((SubLObject) (cadr(verbosity_tail))) : $TERSE;
                    SubLObject stop_at_first_failureP_tail = property_list_member($kw157$STOP_AT_FIRST_FAILURE_, current);
                    SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? ((SubLObject) (cadr(stop_at_first_failureP_tail))) : NIL;
                    SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                    SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                    SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
                    SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? ((SubLObject) (cadr(run_tiny_kb_tests_in_full_kbP_tail))) : $run_tiny_kb_tests_in_full_kbP$;
                    SubLObject run_test_case_tablesP_tail = property_list_member($kw158$RUN_TEST_CASE_TABLES_, current);
                    SubLObject run_test_case_tablesP = (NIL != run_test_case_tablesP_tail) ? ((SubLObject) (cadr(run_test_case_tablesP_tail))) : T;
                    SubLObject return_test_runsP_tail = property_list_member($kw159$RETURN_TEST_RUNS_, current);
                    SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? ((SubLObject) (cadr(return_test_runsP_tail))) : NIL;
                    SubLObject type_tail = property_list_member($TYPE, current);
                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : $ALL;
                    SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
                    SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? ((SubLObject) (cadr(run_non_working_tests_tail))) : NIL;
                    return list(new SubLObject[]{ RUN_ALL_CYC_TESTS_INT, path, stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests });
                }
            }
        }
    }

    /**
     *
     *
     * @param PATH
     * 		nil or stringp; NIL indicates that all already-loaded tests should be run
     * 		without attempting to reload from PATH
     * @param RUN-TEST-CASE-TABLES?
     * 		booleanp; usually the set of tests to run is controlled
     * 		by loading them via the testdcl, but test case tables are always loaded, so we need this switch
     * @param TYPE
     * 		cyc-test-type-spec-p; if other than :all, will only run this type of test.
     * @param RUN-NON-WORKING-TESTS
     * 		NIL, T or :only; whether to run only working tests, all tests, or only non-working tests.
     */
    @LispMethod(comment = "@param PATH\r\n\t\tnil or stringp; NIL indicates that all already-loaded tests should be run\r\n\t\twithout attempting to reload from PATH\r\n@param RUN-TEST-CASE-TABLES?\r\n\t\tbooleanp; usually the set of tests to run is controlled\r\n\t\tby loading them via the testdcl, but test case tables are always loaded, so we need this switch\r\n@param TYPE\r\n\t\tcyc-test-type-spec-p; if other than :all, will only run this type of test.\r\n@param RUN-NON-WORKING-TESTS\r\n\t\tNIL, T or :only; whether to run only working tests, all tests, or only non-working tests.")
    public static SubLObject run_all_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject path = NIL;
        destructuring_bind_must_consp(current, datum, $list123);
        path = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list123);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list123);
            if (NIL == member(current_$5, $list124, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list123);
        }
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $TERSE;
        final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject run_tiny_kb_tests_in_full_kbP_tail = property_list_member($kw131$RUN_TINY_KB_TESTS_IN_FULL_KB_, current);
        final SubLObject run_tiny_kb_tests_in_full_kbP = (NIL != run_tiny_kb_tests_in_full_kbP_tail) ? cadr(run_tiny_kb_tests_in_full_kbP_tail) : $run_tiny_kb_tests_in_full_kbP$;
        final SubLObject run_test_case_tablesP_tail = property_list_member($kw133$RUN_TEST_CASE_TABLES_, current);
        final SubLObject run_test_case_tablesP = (NIL != run_test_case_tablesP_tail) ? cadr(run_test_case_tablesP_tail) : T;
        final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
        final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
        final SubLObject progress_file_tail = property_list_member($PROGRESS_FILE, current);
        final SubLObject progress_file = (NIL != progress_file_tail) ? cadr(progress_file_tail) : NIL;
        final SubLObject rerun_crashing_tests_tail = property_list_member($RERUN_CRASHING_TESTS, current);
        final SubLObject rerun_crashing_tests = (NIL != rerun_crashing_tests_tail) ? cadr(rerun_crashing_tests_tail) : NIL;
        return list(new SubLObject[]{ RUN_ALL_CYC_TESTS_INT, path, stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests });
    }

    public static final SubLObject run_all_cyc_tests_int(SubLObject path, SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests) {
        if (stream == UNPROVIDED) {
            stream = $standard_output$;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$;
        }
        if (run_test_case_tablesP == UNPROVIDED) {
            run_test_case_tablesP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (type == UNPROVIDED) {
            type = $ALL;
        }
        if (run_non_working_tests == UNPROVIDED) {
            run_non_working_tests = NIL;
        }
        if (NIL != path) {
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.undeclare_all_cyc_test_files();
            com.cyc.cycjava.cycl.cyc_testing.cyc_testing.load_all_cyc_tests(path, stream, run_tiny_kb_tests_in_full_kbP, verbosity);
        }
        return com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, UNPROVIDED);
    }

    public static SubLObject run_all_cyc_tests_int(final SubLObject path, SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject phase, SubLObject phases) {
        if (stream == UNPROVIDED) {
            stream = $standard_output$;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$;
        }
        if (run_test_case_tablesP == UNPROVIDED) {
            run_test_case_tablesP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (type == UNPROVIDED) {
            type = $ALL;
        }
        if (run_non_working_tests == UNPROVIDED) {
            run_non_working_tests = NIL;
        }
        if (progress_file == UNPROVIDED) {
            progress_file = NIL;
        }
        if (rerun_crashing_tests == UNPROVIDED) {
            rerun_crashing_tests = NIL;
        }
        if (phase == UNPROVIDED) {
            phase = ZERO_INTEGER;
        }
        if (phases == UNPROVIDED) {
            phases = ONE_INTEGER;
        }
        if (NIL != path) {
            undeclare_all_cyc_test_files();
            load_all_cyc_tests(path, stream, run_tiny_kb_tests_in_full_kbP, verbosity);
        }
        return run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, cyc_tests(), phase, phases);
    }

    /**
     * Assuming that run-all-cyc-tests has recently been called, this will re-run
     * all the Cyc tests that failed during the previous run.
     */
    @LispMethod(comment = "Assuming that run-all-cyc-tests has recently been called, this will re-run\r\nall the Cyc tests that failed during the previous run.\nAssuming that run-all-cyc-tests has recently been called, this will re-run\nall the Cyc tests that failed during the previous run.")
    public static final SubLObject rerun_failing_cyc_tests_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_8 = NIL;
            for (; NIL != rest;) {
                destructuring_bind_must_consp(rest, datum, $list_alt163);
                current_8 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list_alt163);
                if (NIL == member(current_8, $list_alt164, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_8 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list_alt163);
            }
            {
                SubLObject stream_tail = property_list_member($STREAM, current);
                SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
                SubLObject verbosity = (NIL != verbosity_tail) ? ((SubLObject) (cadr(verbosity_tail))) : $VERBOSE;
                SubLObject stop_at_first_failureP_tail = property_list_member($kw157$STOP_AT_FIRST_FAILURE_, current);
                SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? ((SubLObject) (cadr(stop_at_first_failureP_tail))) : NIL;
                SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                SubLObject return_test_runsP_tail = property_list_member($kw159$RETURN_TEST_RUNS_, current);
                SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? ((SubLObject) (cadr(return_test_runsP_tail))) : NIL;
                SubLObject type_tail = property_list_member($TYPE, current);
                SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : $ALL;
                SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
                SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? ((SubLObject) (cadr(run_non_working_tests_tail))) : NIL;
                return list(new SubLObject[]{ RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, list(QUOTE, com.cyc.cycjava.cycl.cyc_testing.cyc_testing.most_recent_failing_cyc_tests()) });
            }
        }
    }

    @LispMethod(comment = "Assuming that run-all-cyc-tests has recently been called, this will re-run\r\nall the Cyc tests that failed during the previous run.\nAssuming that run-all-cyc-tests has recently been called, this will re-run\nall the Cyc tests that failed during the previous run.")
    public static SubLObject rerun_failing_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        final SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list140);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list140);
            if (NIL == member(current_$6, $list141, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list140);
        }
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $VERBOSE;
        final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
        final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
        final SubLObject progress_file_tail = property_list_member($PROGRESS_FILE, current);
        final SubLObject progress_file = (NIL != progress_file_tail) ? cadr(progress_file_tail) : NIL;
        final SubLObject rerun_crashing_tests_tail = property_list_member($RERUN_CRASHING_TESTS, current);
        final SubLObject rerun_crashing_tests = (NIL != rerun_crashing_tests_tail) ? cadr(rerun_crashing_tests_tail) : NIL;
        return list(new SubLObject[]{ RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, progress_file, rerun_crashing_tests, list(QUOTE, most_recent_failing_cyc_tests()) });
    }/**
     * Assuming that run-all-cyc-tests has recently been called, this will re-run
     * all the Cyc tests that failed during the previous run.
     */


    /**
     *
     *
     * @param FILENAME
     * 		stringp; the filename of the test file to declare.
     * @param KB
     * 		cyc-test-kb-p; if :tiny or :full, all the tests in the file specified
     * 		by FILENAME are expected to work in ONLY the tiny or full KB, respectively.
     * 		If :both, then the file contains a mix of tests.
     */
    @LispMethod(comment = "@param FILENAME\r\n\t\tstringp; the filename of the test file to declare.\r\n@param KB\r\n\t\tcyc-test-kb-p; if :tiny or :full, all the tests in the file specified\r\n\t\tby FILENAME are expected to work in ONLY the tiny or full KB, respectively.\r\n\t\tIf :both, then the file contains a mix of tests.")
    public static final SubLObject declare_cyc_test_file_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject filename = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt167);
            filename = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_9 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt167);
                    current_9 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt167);
                    if (NIL == member(current_9, $list_alt168, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_9 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt167);
                }
                {
                    SubLObject kb_tail = property_list_member($KB, current);
                    SubLObject kb = (NIL != kb_tail) ? ((SubLObject) (cadr(kb_tail))) : NIL;
                    return list(DECLARE_CYC_TEST_FILE_INT, filename, kb);
                }
            }
        }
    }

    /**
     *
     *
     * @param FILENAME
     * 		stringp; the filename of the test file to declare.
     * @param KB
     * 		cyc-test-kb-p; if :tiny or :full, all the tests in the file specified
     * 		by FILENAME are expected to work in ONLY the tiny or full KB, respectively.
     * 		If :both, then the file contains a mix of tests.
     */
    @LispMethod(comment = "@param FILENAME\r\n\t\tstringp; the filename of the test file to declare.\r\n@param KB\r\n\t\tcyc-test-kb-p; if :tiny or :full, all the tests in the file specified\r\n\t\tby FILENAME are expected to work in ONLY the tiny or full KB, respectively.\r\n\t\tIf :both, then the file contains a mix of tests.")
    public static SubLObject declare_cyc_test_file(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filename = NIL;
        destructuring_bind_must_consp(current, datum, $list145);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list145);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list145);
            if (NIL == member(current_$7, $list146, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list145);
        }
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : NIL;
        return list(DECLARE_CYC_TEST_FILE_INT, filename, kb);
    }

    public static final SubLObject run_cyc_tests_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject names = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt170);
            names = current.first();
            current = current.rest();
            {
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_10 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt170);
                    current_10 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt170);
                    if (NIL == member(current_10, $list_alt164, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_10 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt170);
                }
                {
                    SubLObject stream_tail = property_list_member($STREAM, current);
                    SubLObject stream = (NIL != stream_tail) ? ((SubLObject) (cadr(stream_tail))) : $standard_output$;
                    SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
                    SubLObject verbosity = (NIL != verbosity_tail) ? ((SubLObject) (cadr(verbosity_tail))) : $VERBOSE;
                    SubLObject stop_at_first_failureP_tail = property_list_member($kw157$STOP_AT_FIRST_FAILURE_, current);
                    SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? ((SubLObject) (cadr(stop_at_first_failureP_tail))) : NIL;
                    SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
                    SubLObject output_format = (NIL != output_format_tail) ? ((SubLObject) (cadr(output_format_tail))) : $STANDARD;
                    SubLObject return_test_runsP_tail = property_list_member($kw159$RETURN_TEST_RUNS_, current);
                    SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? ((SubLObject) (cadr(return_test_runsP_tail))) : NIL;
                    SubLObject type_tail = property_list_member($TYPE, current);
                    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : $ALL;
                    SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
                    SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? ((SubLObject) (cadr(run_non_working_tests_tail))) : NIL;
                    return list(new SubLObject[]{ RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, list(FIND_CYC_TESTS_BY_NAME, names) });
                }
            }
        }
    }

    public static SubLObject run_cyc_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject names = NIL;
        destructuring_bind_must_consp(current, datum, $list148);
        names = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list148);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list148);
            if (NIL == member(current_$8, $list149, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list148);
        }
        final SubLObject stream_tail = property_list_member($STREAM, current);
        final SubLObject stream = (NIL != stream_tail) ? cadr(stream_tail) : $standard_output$;
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : $VERBOSE;
        final SubLObject stop_at_first_failureP_tail = property_list_member($kw129$STOP_AT_FIRST_FAILURE_, current);
        final SubLObject stop_at_first_failureP = (NIL != stop_at_first_failureP_tail) ? cadr(stop_at_first_failureP_tail) : NIL;
        final SubLObject output_format_tail = property_list_member($OUTPUT_FORMAT, current);
        final SubLObject output_format = (NIL != output_format_tail) ? cadr(output_format_tail) : $STANDARD;
        final SubLObject return_test_runsP_tail = property_list_member($kw134$RETURN_TEST_RUNS_, current);
        final SubLObject return_test_runsP = (NIL != return_test_runsP_tail) ? cadr(return_test_runsP_tail) : NIL;
        final SubLObject type_tail = property_list_member($TYPE, current);
        final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : $ALL;
        final SubLObject run_non_working_tests_tail = property_list_member($RUN_NON_WORKING_TESTS, current);
        final SubLObject run_non_working_tests = (NIL != run_non_working_tests_tail) ? cadr(run_non_working_tests_tail) : NIL;
        return list(new SubLObject[]{ RUN_ALL_LOADED_CYC_TESTS, stream, verbosity, stop_at_first_failureP, output_format, T, T, return_test_runsP, type, run_non_working_tests, NIL, NIL, list(FIND_CYC_TESTS_BY_NAME, names) });
    }

    /**
     * Attempts to load all Cyc test files from the directory specified by PATH.
     *
     * @return non-negative-integer-p; how many test files were successfully loaded.
     */
    @LispMethod(comment = "Attempts to load all Cyc test files from the directory specified by PATH.\r\n\r\n@return non-negative-integer-p; how many test files were successfully loaded.")
    public static final SubLObject load_all_cyc_tests_alt(SubLObject path, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (load_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            load_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(path, STRINGP);
            SubLTrampolineFile.checkType(stream, STREAMP);
            SubLTrampolineFile.checkType(load_tiny_kb_tests_in_full_kbP, BOOLEANP);
            SubLTrampolineFile.checkType(verbosity, CYC_TEST_VERBOSITY_LEVEL_P);
            thread.resetMultipleValues();
            {
                SubLObject tests_directory = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.parse_testdcl_path(path);
                SubLObject extra_filename = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject count = ZERO_INTEGER;
                    SubLObject warn_on_duplicate_cyc_test_namesP = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.no_cyc_tests_definedP();
                    {
                        SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
                        try {
                            StreamsLow.$standard_output$.bind(stream, thread);
                            if (NIL == com.cyc.cycjava.cycl.cyc_testing.cyc_testing.load_testdcl(tests_directory, extra_filename)) {
                                Errors.error($str_alt172$could_not_load__a_lisp_from__s, NIL != extra_filename ? ((SubLObject) (extra_filename)) : $$$testdcl, tests_directory);
                            }
                            if ($VERBOSE == verbosity) {
                                {
                                    SubLObject list_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_files();
                                    $progress_note$.setDynamicValue($$$Loading_test_files, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_11 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject cyc_test_file = NIL;
                                                for (cyc_test_file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , cyc_test_file = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.load_cyc_test_file(cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                                                        count = add(count, ONE_INTEGER);
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                }
                            } else {
                                {
                                    SubLObject cdolist_list_var = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_test_files();
                                    SubLObject cyc_test_file = NIL;
                                    for (cyc_test_file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cyc_test_file = cdolist_list_var.first()) {
                                        if (NIL != com.cyc.cycjava.cycl.cyc_testing.cyc_testing.load_cyc_test_file(cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                                            count = add(count, ONE_INTEGER);
                                        } else {
                                            if (NIL != inference_testing.kb_matches_expectationsP(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_kb(cyc_test_file), load_tiny_kb_tests_in_full_kbP)) {
                                                $most_recent_cyc_test_file_load_failures$.setGlobalValue(cons(cyc_test_file, $most_recent_cyc_test_file_load_failures$.getGlobalValue()));
                                            }
                                        }
                                    }
                                }
                            }
                        } finally {
                            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return count;
                }
            }
        }
    }

    @LispMethod(comment = "Attempts to load all Cyc test files from the directory specified by PATH.\r\n\r\n@return non-negative-integer-p; how many test files were successfully loaded.")
    public static SubLObject load_all_cyc_tests(final SubLObject path, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (load_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            load_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(path) : "! stringp(path) " + ("Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) ") + path;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        assert NIL != booleanp(load_tiny_kb_tests_in_full_kbP) : "! booleanp(load_tiny_kb_tests_in_full_kbP) " + ("Types.booleanp(load_tiny_kb_tests_in_full_kbP) " + "CommonSymbols.NIL != Types.booleanp(load_tiny_kb_tests_in_full_kbP) ") + load_tiny_kb_tests_in_full_kbP;
        assert NIL != cyc_test_verbosity_level_p(verbosity) : "! cyc_testing.cyc_test_verbosity_level_p(verbosity) " + ("cyc_testing.cyc_test_verbosity_level_p(verbosity) " + "CommonSymbols.NIL != cyc_testing.cyc_test_verbosity_level_p(verbosity) ") + verbosity;
        thread.resetMultipleValues();
        final SubLObject tests_directory = parse_testdcl_path(path);
        final SubLObject extra_filename = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject count = ZERO_INTEGER;
        final SubLObject warn_on_duplicate_cyc_test_namesP = no_cyc_tests_definedP();
        final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            StreamsLow.$standard_output$.bind(stream, thread);
            if (NIL == load_testdcl(tests_directory, extra_filename)) {
                Errors.error($str154$could_not_load__a_lisp_from__s, NIL != extra_filename ? extra_filename : $cyc_base_testdcl$.getDynamicValue(thread), tests_directory);
            }
            if ($VERBOSE == verbosity) {
                final SubLObject list_var = cyc_test_files();
                final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($$$Loading_test_files, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject cyc_test_file = NIL;
                        cyc_test_file = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != load_cyc_test_file(cyc_test_file, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                                count = add(count, ONE_INTEGER);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            cyc_test_file = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_2, thread);
                    $progress_note$.rebind(_prev_bind_0_$9, thread);
                }
            } else {
                SubLObject cdolist_list_var = cyc_test_files();
                SubLObject cyc_test_file2 = NIL;
                cyc_test_file2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != load_cyc_test_file(cyc_test_file2, tests_directory, load_tiny_kb_tests_in_full_kbP, warn_on_duplicate_cyc_test_namesP)) {
                        count = add(count, ONE_INTEGER);
                    } else
                        if (NIL != inference_testing.kb_matches_expectationsP(ctf_kb(cyc_test_file2), load_tiny_kb_tests_in_full_kbP)) {
                            $most_recent_cyc_test_file_load_failures$.setGlobalValue(cons(cyc_test_file2, $most_recent_cyc_test_file_load_failures$.getGlobalValue()));
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    cyc_test_file2 = cdolist_list_var.first();
                } 
            }
            if (NIL != extra_filename) {
                final SubLObject _prev_bind_0_$11 = $only_undeclare_tests_and_test_filesP$.currentBinding(thread);
                try {
                    $only_undeclare_tests_and_test_filesP$.bind(T, thread);
                    load_testdcl(tests_directory, extra_filename);
                } finally {
                    $only_undeclare_tests_and_test_filesP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
        }
        return count;
    }/**
     * Attempts to load all Cyc test files from the directory specified by PATH.
     *
     * @return non-negative-integer-p; how many test files were successfully loaded.
     */


    public static final SubLObject parse_testdcl_path_alt(SubLObject path) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject extra_filename = NIL;
                if (NIL != string_utilities.ends_with(path, $str_alt175$_lisp, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject directory = file_utilities.partially_deconstruct_path(path);
                        SubLObject filename = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        extra_filename = string_utilities.post_remove(filename, $str_alt175$_lisp, UNPROVIDED);
                        path = directory;
                    }
                }
                path = file_utilities.possibly_append_path_separator_char(path);
                return values(path, extra_filename);
            }
        }
    }

    public static SubLObject parse_testdcl_path(SubLObject path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extra_filename = NIL;
        if (NIL != string_utilities.ends_with(path, $str157$_lisp, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject directory = file_utilities.partially_deconstruct_path(path);
            final SubLObject filename = thread.secondMultipleValue();
            thread.resetMultipleValues();
            extra_filename = string_utilities.post_remove(filename, $str157$_lisp, UNPROVIDED);
            path = directory;
        }
        path = file_utilities.possibly_append_path_separator_char(path);
        return values(path, extra_filename);
    }

    public static final SubLObject run_all_loaded_cyc_tests(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject tests) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (run_test_case_tablesP == UNPROVIDED) {
            run_test_case_tablesP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (type == UNPROVIDED) {
            type = $ALL;
        }
        if (run_non_working_tests == UNPROVIDED) {
            run_non_working_tests = NIL;
        }
        if (tests == UNPROVIDED) {
            tests = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.cyc_tests();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject overall_result = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_all_loaded_cyc_tests_int(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, type, run_non_working_tests, tests);
                SubLObject test_runs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                $most_recent_cyc_test_runs$.setGlobalValue(test_runs);
                return values(overall_result, NIL != return_test_runsP ? ((SubLObject) (test_runs)) : NIL);
            }
        }
    }

    public static SubLObject run_all_loaded_cyc_tests(SubLObject stream, SubLObject verbosity, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject run_test_case_tablesP, SubLObject return_test_runsP, SubLObject type, SubLObject run_non_working_tests, SubLObject progress_file, SubLObject rerun_crashing_tests, SubLObject tests, SubLObject phase, SubLObject phases) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (run_test_case_tablesP == UNPROVIDED) {
            run_test_case_tablesP = T;
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        if (type == UNPROVIDED) {
            type = $ALL;
        }
        if (run_non_working_tests == UNPROVIDED) {
            run_non_working_tests = NIL;
        }
        if (progress_file == UNPROVIDED) {
            progress_file = NIL;
        }
        if (rerun_crashing_tests == UNPROVIDED) {
            rerun_crashing_tests = NIL;
        }
        if (tests == UNPROVIDED) {
            tests = cyc_tests();
        }
        if (phase == UNPROVIDED) {
            phase = ZERO_INTEGER;
        }
        if (phases == UNPROVIDED) {
            phases = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!phase.numL(phases))) {
            Errors.error($str158$Invalid_phase__A_of__A_specified_, phase, phases);
        }
        thread.resetMultipleValues();
        final SubLObject overall_result = cyc_testing_utilities.run_all_loaded_cyc_tests_int(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, run_test_case_tablesP, type, run_non_working_tests, progress_file, rerun_crashing_tests, tests, phase, phases);
        final SubLObject test_runs = thread.secondMultipleValue();
        thread.resetMultipleValues();
        $most_recent_cyc_test_runs$.setGlobalValue(test_runs);
        return values(overall_result, NIL != return_test_runsP ? test_runs : NIL);
    }

    public static final SubLObject undeclare_all_cyc_test_files_alt() {
        $cyc_test_files$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject undeclare_all_cyc_test_files() {
        $cyc_test_files$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject undeclare_cyc_test_file_alt(SubLObject filename) {
        {
            SubLObject existing_cyc_test_file = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.find_cyc_test_file(filename);
            if (NIL != existing_cyc_test_file) {
                $cyc_test_files$.setGlobalValue(delete(existing_cyc_test_file, $cyc_test_files$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject undeclare_cyc_test_file(final SubLObject filename) {
        final SubLObject existing_cyc_test_file = find_cyc_test_file(filename);
        if (NIL != existing_cyc_test_file) {
            $cyc_test_files$.setGlobalValue(delete(existing_cyc_test_file, $cyc_test_files$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            return T;
        }
        return NIL;
    }

    public static final SubLObject declare_cyc_test_file_int_alt(SubLObject filename, SubLObject kb) {
        com.cyc.cycjava.cycl.cyc_testing.cyc_testing.undeclare_cyc_test_file(filename);
        {
            SubLObject cyc_test_file = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_file(filename, kb);
            SubLObject new_cons = cons(cyc_test_file, NIL);
            SubLObject list = $cyc_test_files$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $cyc_test_files$.setGlobalValue(new_cons);
            }
            return cyc_test_file;
        }
    }

    public static SubLObject declare_cyc_test_file_int(final SubLObject filename, final SubLObject kb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $only_undeclare_tests_and_test_filesP$.getDynamicValue(thread)) {
            undeclare_cyc_test_file(filename);
            final SubLObject cyc_test_file = new_cyc_test_file(filename, kb);
            final SubLObject new_cons = cons(cyc_test_file, NIL);
            final SubLObject list = $cyc_test_files$.getGlobalValue();
            if (NIL != list) {
                rplacd_last(list, new_cons);
            } else {
                $cyc_test_files$.setGlobalValue(new_cons);
            }
            return cyc_test_file;
        }
        return NIL;
    }

    public static final SubLObject load_cyc_test_file_alt(SubLObject cyc_test_file, SubLObject path, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject warn_on_duplicate_cyc_test_namesP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject successP = NIL;
                SubLObject test_kb = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_kb(cyc_test_file);
                if (NIL != inference_testing.kb_matches_expectationsP(test_kb, load_tiny_kb_tests_in_full_kbP)) {
                    {
                        SubLObject filename = com.cyc.cycjava.cycl.cyc_testing.cyc_testing.ctf_filename(cyc_test_file);
                        {
                            SubLObject _prev_bind_0 = $cyc_test_filename$.currentBinding(thread);
                            SubLObject _prev_bind_1 = $warn_on_duplicate_cyc_test_namesP$.currentBinding(thread);
                            try {
                                $cyc_test_filename$.bind(filename, thread);
                                $warn_on_duplicate_cyc_test_namesP$.bind(warn_on_duplicate_cyc_test_namesP, thread);
                                if (NIL != load_lisp_test_file_from_path(path, filename)) {
                                    successP = T;
                                }
                            } finally {
                                $warn_on_duplicate_cyc_test_namesP$.rebind(_prev_bind_1, thread);
                                $cyc_test_filename$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return successP;
            }
        }
    }

    public static SubLObject load_cyc_test_file(final SubLObject cyc_test_file, final SubLObject path, final SubLObject load_tiny_kb_tests_in_full_kbP, final SubLObject warn_on_duplicate_cyc_test_namesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        final SubLObject test_kb = ctf_kb(cyc_test_file);
        if (NIL != inference_testing.kb_matches_expectationsP(test_kb, load_tiny_kb_tests_in_full_kbP)) {
            final SubLObject filename = ctf_filename(cyc_test_file);
            final SubLObject _prev_bind_0 = $cyc_test_filename$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $warn_on_duplicate_cyc_test_namesP$.currentBinding(thread);
            try {
                $cyc_test_filename$.bind(filename, thread);
                $warn_on_duplicate_cyc_test_namesP$.bind(warn_on_duplicate_cyc_test_namesP, thread);
                if (NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, filename)) {
                    successP = T;
                }
            } finally {
                $warn_on_duplicate_cyc_test_namesP$.rebind(_prev_bind_2, thread);
                $cyc_test_filename$.rebind(_prev_bind_0, thread);
            }
        }
        return successP;
    }

    /**
     * Will always load the testdcl from PATH.  If EXTRA-FILENAME is provided, it will also load that, too.
     */
    @LispMethod(comment = "Will always load the testdcl from PATH.  If EXTRA-FILENAME is provided, it will also load that, too.")
    public static final SubLObject load_testdcl_alt(SubLObject path, SubLObject extra_filename) {
        if (extra_filename == UNPROVIDED) {
            extra_filename = NIL;
        }
        return makeBoolean((NIL != load_lisp_test_file_from_path(path, $$$testdcl)) && ((NIL == extra_filename) || (NIL != load_lisp_test_file_from_path(path, extra_filename))));
    }

    @LispMethod(comment = "Will always load the testdcl from PATH.  If EXTRA-FILENAME is provided, it will also load that, too.")
    public static SubLObject load_testdcl(final SubLObject path, SubLObject extra_filename) {
        if (extra_filename == UNPROVIDED) {
            extra_filename = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, $cyc_base_testdcl$.getDynamicValue(thread))) && ((NIL == extra_filename) || (NIL != cyc_testing_utilities.load_lisp_test_file_from_path(path, extra_filename))));
    }/**
     * Will always load the testdcl from PATH.  If EXTRA-FILENAME is provided, it will also load that, too.
     */


    public static SubLObject cyc_invalid_tests_with_info() {
        final SubLObject all_relevant_tests = (NIL != non_tiny_kb_loadedP()) ? cyc_tests() : find_all_if(TINY_KB_CYC_TEST_P, cyc_tests(), UNPROVIDED);
        final SubLObject invalid_tests = cyc_tests_mentioning_invalid_constants(all_relevant_tests);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = invalid_tests;
        SubLObject invalid_test = NIL;
        invalid_test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_name = cyc_test_name(invalid_test);
            final SubLObject test_type = cyc_test_type(invalid_test);
            final SubLObject test_owner = cyc_test_owner(invalid_test);
            final SubLObject invalid_constants = cyc_test_invalid_constants(invalid_test);
            result = cons(list(test_type, test_name, test_owner, invalid_constants), result);
            cdolist_list_var = cdolist_list_var.rest();
            invalid_test = cdolist_list_var.first();
        } 
        if ((NIL != result) && (NIL != lengthLE(result, $int$100, UNPROVIDED))) {
            format_nil.p1(result, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject run_cyc_test_after_every_test(final SubLObject path, final SubLObject test_to_interleave, SubLObject stream, SubLObject load_tiny_kb_tests_in_full_kbP, SubLObject verbosity) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (load_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            load_tiny_kb_tests_in_full_kbP = T;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $TERSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        load_all_cyc_tests(path, stream, load_tiny_kb_tests_in_full_kbP, verbosity);
        SubLObject test_count;
        SubLObject n;
        for (test_count = cyc_test_count(), n = NIL, n = ZERO_INTEGER; n.numL(test_count); n = add(n, ONE_INTEGER)) {
            run_all_loaded_cyc_tests(StreamsLow.$standard_output$.getDynamicValue(thread), verbosity, T, $STANDARD, T, T, NIL, $ALL, NIL, NIL, NIL, cyc_tests(), n, test_count);
            cyc_testing_utilities.run_cyc_test_int(test_to_interleave, verbosity, NIL, NIL, $STANDARD, stream, T);
        }
        return NIL;
    }

    public static SubLObject all_cyc_tests_are_valid() {
        return cyc_invalid_tests_with_info();
    }

    public static final SubLObject declare_cyc_testing_file_alt() {
        declareFunction("testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
        declareFunction("cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
        declareFunction("cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        declareFunction("cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
        declareFunction("cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
        declareFunction("cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
        declareFunction("cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
        declareFunction("cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
        declareFunction("cyc_tests", "CYC-TESTS", 0, 0, false);
        declareFunction("undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
        declareMacro("do_cyc_tests", "DO-CYC-TESTS");
        declareMacro("progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
        declareFunction("cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
        declareFunction("no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
        declareFunction("index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
        declareFunction("unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
        declareFunction("my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
        declareFunction("my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
        declareFunction("index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
        declareFunction("cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyc_test_p", "CYC-TEST-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_p$UnaryFunction();
        declareFunction("ct_file", "CT-FILE", 1, 0, false);
        declareFunction("ct_guts", "CT-GUTS", 1, 0, false);
        declareFunction("_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
        declareFunction("_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
        declareFunction("make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
        declareFunction("print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
        declareFunction("new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
        declareFunction("cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
        declareFunction("cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
        declareFunction("cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
        declareFunction("cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
        declareFunction("cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
        declareFunction("cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
        declareFunction("cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
        declareFunction("cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
        declareFunction("cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
        declareFunction("cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
        declareFunction("cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
        declareFunction("cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
        declareFunction("cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
        declareFunction("cyc_test_mentions_invalid_constantP", "CYC-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction("cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
        declareFunction("tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
        declareFunction("full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
        declareFunction("non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
        declareFunction("find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
        declareFunction("find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
        declareFunction("find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
        declareFunction("find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
        declareFunction("find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
        declareMacro("run_cyc_test", "RUN-CYC-TEST");
        declareMacro("run_cyc_test_verbose", "RUN-CYC-TEST-VERBOSE");
        declareFunction("run_cyc_test_int", "RUN-CYC-TEST-INT", 7, 0, false);
        declareMacro("run_cyc_test_parallel", "RUN-CYC-TEST-PARALLEL");
        declareFunction("run_cyc_test_parallel_int", "RUN-CYC-TEST-PARALLEL-INT", 9, 0, false);
        declareFunction("run_cyc_test_object_parallel", "RUN-CYC-TEST-OBJECT-PARALLEL", 9, 0, false);
        declareFunction("run_cyc_test_object", "RUN-CYC-TEST-OBJECT", 7, 0, false);
        declareFunction("run_cyc_test_iut", "RUN-CYC-TEST-IUT", 7, 0, false);
        declareFunction("run_cyc_test_it", "RUN-CYC-TEST-IT", 7, 0, false);
        declareFunction("run_cyc_test_it_int", "RUN-CYC-TEST-IT-INT", 4, 0, false);
        declareFunction("run_cyc_test_rmt", "RUN-CYC-TEST-RMT", 7, 0, false);
        declareFunction("run_cyc_test_tmt", "RUN-CYC-TEST-TMT", 7, 0, false);
        declareFunction("run_cyc_test_rmct", "RUN-CYC-TEST-RMCT", 7, 0, false);
        declareFunction("run_cyc_test_ert", "RUN-CYC-TEST-ERT", 7, 0, false);
        declareFunction("run_cyc_test_tct", "RUN-CYC-TEST-TCT", 7, 0, false);
        declareFunction("run_cyc_test_kct", "RUN-CYC-TEST-KCT", 7, 0, false);
        declareFunction("cyc_test_has_current_ownerP", "CYC-TEST-HAS-CURRENT-OWNER?", 1, 0, false);
        declareFunction("cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
        declareFunction("cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
        declareFunction("new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
        declareFunction("cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
        declareFunction("cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
        declareFunction("cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
        declareFunction("cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
        declareFunction("cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
        declareFunction("cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
        declareFunction("cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
        declareFunction("cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
        declareFunction("failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
        declareFunction("cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
        declareFunction("print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
        declareFunction("cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
        declareFunction("cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
        declareMacro("do_cyc_test_files", "DO-CYC-TEST-FILES");
        declareMacro("progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
        declareFunction("cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
        declareFunction("cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_p$UnaryFunction();
        declareFunction("ctf_filename", "CTF-FILENAME", 1, 0, false);
        declareFunction("ctf_kb", "CTF-KB", 1, 0, false);
        declareFunction("_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
        declareFunction("_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
        declareFunction("make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
        declareFunction("print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
        declareFunction("new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
        declareFunction("cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
        declareFunction("find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
        declareFunction("most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
        declareFunction("most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
        declareFunction("most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
        declareFunction("most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
        declareMacro("run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
        declareFunction("run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 9, false);
        declareMacro("rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
        declareMacro("declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
        declareMacro("run_cyc_tests", "RUN-CYC-TESTS");
        declareFunction("load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
        declareFunction("parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
        declareFunction("run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 10, false);
        declareFunction("undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
        declareFunction("undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
        declareFunction("declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
        declareFunction("load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
        declareFunction("load_testdcl", "LOAD-TESTDCL", 1, 1, false);
        declareFunction("run_all_loaded_cyc_tests_int", "RUN-ALL-LOADED-CYC-TESTS-INT", 8, 1, false);
        declareFunction("new_cyc_test_null_run", "NEW-CYC-TEST-NULL-RUN", 1, 0, false);
        declareFunction("new_cyc_test_invalid_run", "NEW-CYC-TEST-INVALID-RUN", 1, 0, false);
        declareFunction("run_cyc_testP", "RUN-CYC-TEST?", 4, 0, false);
        declareFunction("run_all_loaded_cyc_tests_print_header", "RUN-ALL-LOADED-CYC-TESTS-PRINT-HEADER", 3, 0, false);
        declareFunction("run_all_loaded_cyc_tests_print_footer", "RUN-ALL-LOADED-CYC-TESTS-PRINT-FOOTER", 5, 0, false);
        declareFunction("print_failing_cyc_tests_message", "PRINT-FAILING-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction("print_succeeding_cyc_tests_message", "PRINT-SUCCEEDING-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction("print_ignored_cyc_tests_message", "PRINT-IGNORED-CYC-TESTS-MESSAGE", 2, 2, false);
        declareFunction("show_cyc_test_run", "SHOW-CYC-TEST-RUN", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_cyc_testing_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
            declareFunction("cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
            declareFunction("cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
            declareFunction("cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
            declareFunction("cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
            declareFunction("cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
            declareFunction("cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
            declareFunction("cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
            declareFunction("cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
            declareFunction("cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
            declareFunction("cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
            declareFunction("cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
            declareFunction("cyc_tests", "CYC-TESTS", 0, 0, false);
            declareFunction("undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
            declareMacro("do_cyc_tests", "DO-CYC-TESTS");
            declareMacro("progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
            declareFunction("cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
            declareFunction("no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
            declareFunction("index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
            declareFunction("unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
            declareFunction("my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
            declareFunction("my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
            declareFunction("index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
            declareFunction("cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("cyc_test_p", "CYC-TEST-P", 1, 0, false);
            new cyc_testing.$cyc_test_p$UnaryFunction();
            declareFunction("ct_file", "CT-FILE", 1, 0, false);
            declareFunction("ct_guts", "CT-GUTS", 1, 0, false);
            declareFunction("_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
            declareFunction("_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
            declareFunction("make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
            declareFunction("visit_defstruct_cyc_test", "VISIT-DEFSTRUCT-CYC-TEST", 2, 0, false);
            declareFunction("visit_defstruct_object_cyc_test_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
            declareFunction("print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
            declareFunction("new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
            declareFunction("undeclare_cyc_test", "UNDECLARE-CYC-TEST", 1, 0, false);
            declareFunction("cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
            declareFunction("cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
            declareFunction("cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
            declareFunction("cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
            declareFunction("cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
            declareFunction("cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
            declareFunction("cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
            declareFunction("cyc_test_id", "CYC-TEST-ID", 1, 0, false);
            declareFunction("cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
            declareFunction("cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
            declareFunction("cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
            declareFunction("cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
            declareFunction("cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
            declareFunction("cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
            declareFunction("cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
            declareFunction("cyc_tests_mentioning_invalid_constants", "CYC-TESTS-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
            declareFunction("cyc_test_invalidP", "CYC-TEST-INVALID?", 1, 0, false);
            declareFunction("cyc_test_invalid_constants", "CYC-TEST-INVALID-CONSTANTS", 1, 0, false);
            declareFunction("print_post_build_test_summary", "PRINT-POST-BUILD-TEST-SUMMARY", 6, 0, false);
            declareFunction("tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
            declareFunction("full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
            declareFunction("non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
            declareFunction("find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
            declareFunction("find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
            declareFunction("find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
            declareFunction("find_cyc_test_number", "FIND-CYC-TEST-NUMBER", 2, 0, false);
            declareFunction("find_cyc_tests_in_range", "FIND-CYC-TESTS-IN-RANGE", 3, 0, false);
            declareFunction("find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
            declareFunction("find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
            declareFunction("cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
            declareFunction("cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
            declareFunction("cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
            declareFunction("cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
            declareFunction("new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
            declareFunction("cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
            declareFunction("cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
            declareFunction("cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
            declareFunction("cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
            declareFunction("cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
            declareFunction("cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
            declareFunction("cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
            declareFunction("cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
            declareFunction("cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
            declareFunction("failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
            declareFunction("succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
            declareFunction("ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
            declareFunction("cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
            declareFunction("cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
            declareFunction("print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
            declareFunction("cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
            declareFunction("cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
            declareMacro("do_cyc_test_files", "DO-CYC-TEST-FILES");
            declareMacro("progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
            declareFunction("cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
            declareFunction("cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false);
            new cyc_testing.$cyc_test_file_p$UnaryFunction();
            declareFunction("ctf_filename", "CTF-FILENAME", 1, 0, false);
            declareFunction("ctf_kb", "CTF-KB", 1, 0, false);
            declareFunction("_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
            declareFunction("_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
            declareFunction("make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
            declareFunction("visit_defstruct_cyc_test_file", "VISIT-DEFSTRUCT-CYC-TEST-FILE", 2, 0, false);
            declareFunction("visit_defstruct_object_cyc_test_file_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD", 2, 0, false);
            declareFunction("print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
            declareFunction("new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
            declareFunction("cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
            declareFunction("find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
            declareFunction("most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
            declareFunction("most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
            declareFunction("most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
            declareFunction("most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
            declareMacro("run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
            declareFunction("run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 13, false);
            declareMacro("rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
            declareMacro("declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
            declareMacro("run_cyc_tests", "RUN-CYC-TESTS");
            declareFunction("load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
            declareFunction("parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
            declareFunction("run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 14, false);
            declareFunction("undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
            declareFunction("undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
            declareFunction("declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
            declareFunction("load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
            declareFunction("load_testdcl", "LOAD-TESTDCL", 1, 1, false);
            declareFunction("cyc_invalid_tests_with_info", "CYC-INVALID-TESTS-WITH-INFO", 0, 0, false);
            declareFunction("run_cyc_test_after_every_test", "RUN-CYC-TEST-AFTER-EVERY-TEST", 2, 3, false);
            declareFunction("all_cyc_tests_are_valid", "ALL-CYC-TESTS-ARE-VALID", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cyc_test_mentions_invalid_constantP", "CYC-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
            declareMacro("run_cyc_test", "RUN-CYC-TEST");
            declareMacro("run_cyc_test_verbose", "RUN-CYC-TEST-VERBOSE");
            declareFunction("run_cyc_test_int", "RUN-CYC-TEST-INT", 7, 0, false);
            declareMacro("run_cyc_test_parallel", "RUN-CYC-TEST-PARALLEL");
            declareFunction("run_cyc_test_parallel_int", "RUN-CYC-TEST-PARALLEL-INT", 9, 0, false);
            declareFunction("run_cyc_test_object_parallel", "RUN-CYC-TEST-OBJECT-PARALLEL", 9, 0, false);
            declareFunction("run_cyc_test_object", "RUN-CYC-TEST-OBJECT", 7, 0, false);
            declareFunction("run_cyc_test_iut", "RUN-CYC-TEST-IUT", 7, 0, false);
            declareFunction("run_cyc_test_it", "RUN-CYC-TEST-IT", 7, 0, false);
            declareFunction("run_cyc_test_it_int", "RUN-CYC-TEST-IT-INT", 4, 0, false);
            declareFunction("run_cyc_test_rmt", "RUN-CYC-TEST-RMT", 7, 0, false);
            declareFunction("run_cyc_test_tmt", "RUN-CYC-TEST-TMT", 7, 0, false);
            declareFunction("run_cyc_test_rmct", "RUN-CYC-TEST-RMCT", 7, 0, false);
            declareFunction("run_cyc_test_ert", "RUN-CYC-TEST-ERT", 7, 0, false);
            declareFunction("run_cyc_test_tct", "RUN-CYC-TEST-TCT", 7, 0, false);
            declareFunction("run_cyc_test_kct", "RUN-CYC-TEST-KCT", 7, 0, false);
            declareFunction("cyc_test_has_current_ownerP", "CYC-TEST-HAS-CURRENT-OWNER?", 1, 0, false);
            declareFunction("run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 9, false);
            declareFunction("run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 10, false);
            declareFunction("run_all_loaded_cyc_tests_int", "RUN-ALL-LOADED-CYC-TESTS-INT", 8, 1, false);
            declareFunction("new_cyc_test_null_run", "NEW-CYC-TEST-NULL-RUN", 1, 0, false);
            declareFunction("new_cyc_test_invalid_run", "NEW-CYC-TEST-INVALID-RUN", 1, 0, false);
            declareFunction("run_cyc_testP", "RUN-CYC-TEST?", 4, 0, false);
            declareFunction("run_all_loaded_cyc_tests_print_header", "RUN-ALL-LOADED-CYC-TESTS-PRINT-HEADER", 3, 0, false);
            declareFunction("run_all_loaded_cyc_tests_print_footer", "RUN-ALL-LOADED-CYC-TESTS-PRINT-FOOTER", 5, 0, false);
            declareFunction("print_failing_cyc_tests_message", "PRINT-FAILING-CYC-TESTS-MESSAGE", 2, 2, false);
            declareFunction("print_succeeding_cyc_tests_message", "PRINT-SUCCEEDING-CYC-TESTS-MESSAGE", 2, 2, false);
            declareFunction("print_ignored_cyc_tests_message", "PRINT-IGNORED-CYC-TESTS-MESSAGE", 2, 2, false);
            declareFunction("show_cyc_test_run", "SHOW-CYC-TEST-RUN", 4, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cyc_testing_file_Previous() {
        declareFunction("testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
        declareFunction("cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
        declareFunction("cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        declareFunction("cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
        declareFunction("cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
        declareFunction("cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
        declareFunction("cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
        declareFunction("cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
        declareFunction("cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
        declareFunction("cyc_tests", "CYC-TESTS", 0, 0, false);
        declareFunction("undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
        declareMacro("do_cyc_tests", "DO-CYC-TESTS");
        declareMacro("progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
        declareFunction("cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
        declareFunction("no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
        declareFunction("index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
        declareFunction("unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
        declareFunction("my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
        declareFunction("my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
        declareFunction("index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
        declareFunction("cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyc_test_p", "CYC-TEST-P", 1, 0, false);
        new cyc_testing.$cyc_test_p$UnaryFunction();
        declareFunction("ct_file", "CT-FILE", 1, 0, false);
        declareFunction("ct_guts", "CT-GUTS", 1, 0, false);
        declareFunction("_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
        declareFunction("_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
        declareFunction("make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
        declareFunction("visit_defstruct_cyc_test", "VISIT-DEFSTRUCT-CYC-TEST", 2, 0, false);
        declareFunction("visit_defstruct_object_cyc_test_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
        declareFunction("print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
        declareFunction("new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
        declareFunction("undeclare_cyc_test", "UNDECLARE-CYC-TEST", 1, 0, false);
        declareFunction("cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
        declareFunction("cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
        declareFunction("cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
        declareFunction("cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
        declareFunction("cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
        declareFunction("cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
        declareFunction("cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
        declareFunction("cyc_test_id", "CYC-TEST-ID", 1, 0, false);
        declareFunction("cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
        declareFunction("cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
        declareFunction("cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
        declareFunction("cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
        declareFunction("cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
        declareFunction("cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
        declareFunction("cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
        declareFunction("cyc_tests_mentioning_invalid_constants", "CYC-TESTS-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
        declareFunction("cyc_test_invalidP", "CYC-TEST-INVALID?", 1, 0, false);
        declareFunction("cyc_test_invalid_constants", "CYC-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareFunction("print_post_build_test_summary", "PRINT-POST-BUILD-TEST-SUMMARY", 6, 0, false);
        declareFunction("tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
        declareFunction("full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
        declareFunction("non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
        declareFunction("find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
        declareFunction("find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
        declareFunction("find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
        declareFunction("find_cyc_test_number", "FIND-CYC-TEST-NUMBER", 2, 0, false);
        declareFunction("find_cyc_tests_in_range", "FIND-CYC-TESTS-IN-RANGE", 3, 0, false);
        declareFunction("find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
        declareFunction("find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
        declareFunction("cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
        declareFunction("cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
        declareFunction("new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
        declareFunction("cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
        declareFunction("cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
        declareFunction("cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
        declareFunction("cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
        declareFunction("cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
        declareFunction("cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
        declareFunction("cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
        declareFunction("cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
        declareFunction("failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
        declareFunction("cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
        declareFunction("cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
        declareFunction("print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
        declareFunction("cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
        declareFunction("cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
        declareMacro("do_cyc_test_files", "DO-CYC-TEST-FILES");
        declareMacro("progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
        declareFunction("cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
        declareFunction("cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false);
        new cyc_testing.$cyc_test_file_p$UnaryFunction();
        declareFunction("ctf_filename", "CTF-FILENAME", 1, 0, false);
        declareFunction("ctf_kb", "CTF-KB", 1, 0, false);
        declareFunction("_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
        declareFunction("_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
        declareFunction("make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
        declareFunction("visit_defstruct_cyc_test_file", "VISIT-DEFSTRUCT-CYC-TEST-FILE", 2, 0, false);
        declareFunction("visit_defstruct_object_cyc_test_file_method", "VISIT-DEFSTRUCT-OBJECT-CYC-TEST-FILE-METHOD", 2, 0, false);
        declareFunction("print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
        declareFunction("new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
        declareFunction("cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
        declareFunction("find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
        declareFunction("most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
        declareFunction("most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
        declareFunction("most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
        declareFunction("most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
        declareMacro("run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
        declareFunction("run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 13, false);
        declareMacro("rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
        declareMacro("declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
        declareMacro("run_cyc_tests", "RUN-CYC-TESTS");
        declareFunction("load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
        declareFunction("parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
        declareFunction("run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 14, false);
        declareFunction("undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
        declareFunction("undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
        declareFunction("declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
        declareFunction("load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
        declareFunction("load_testdcl", "LOAD-TESTDCL", 1, 1, false);
        declareFunction("cyc_invalid_tests_with_info", "CYC-INVALID-TESTS-WITH-INFO", 0, 0, false);
        declareFunction("run_cyc_test_after_every_test", "RUN-CYC-TEST-AFTER-EVERY-TEST", 2, 3, false);
        declareFunction("all_cyc_tests_are_valid", "ALL-CYC-TESTS-ARE-VALID", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyc_testing_file_alt() {
        defparameter("*IT-OUTPUT-FORMAT*", $STANDARD);
        defparameter("*CYC-TEST-DEBUG?*", NIL);
        defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T);
        defparameter("*TEST-REAL-TIME-PRUNING?*", NIL);
        deflexical("*CYC-TEST-VERBOSITY-LEVELS*", $list_alt1);
        defparameter("*CYC-TEST-FILENAME*", NIL);
        defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL);
        deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list_alt4);
        deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list_alt5);
        deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list_alt6);
        deflexical("*CYC-TEST-RESULT-VALUES*", append($cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(), $cyc_test_result_ignore_values$.getGlobalValue()));
        deflexical("*CYC-TEST-TYPE-TABLE*", $list_alt7);
        deflexical("*CYC-TESTS*", NIL != boundp($cyc_tests$) ? ((SubLObject) ($cyc_tests$.getGlobalValue())) : NIL);
        deflexical("*CYC-TEST-BY-NAME*", NIL != boundp($cyc_test_by_name$) ? ((SubLObject) ($cyc_test_by_name$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*CYC-TEST-BY-DWIMMED-NAME*", NIL != boundp($cyc_test_by_dwimmed_name$) ? ((SubLObject) ($cyc_test_by_dwimmed_name$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
        defconstant("*DTP-CYC-TEST*", CYC_TEST);
        defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", $int$514);
        deflexical("*CYC-TEST-FILES*", NIL != boundp($cyc_test_files$) ? ((SubLObject) ($cyc_test_files$.getGlobalValue())) : NIL);
        defconstant("*DTP-CYC-TEST-FILE*", CYC_TEST_FILE);
        deflexical("*MOST-RECENT-CYC-TEST-RUNS*", NIL != boundp($most_recent_cyc_test_runs$) ? ((SubLObject) ($most_recent_cyc_test_runs$.getGlobalValue())) : NIL);
        deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", NIL != boundp($most_recent_cyc_test_file_load_failures$) ? ((SubLObject) ($most_recent_cyc_test_file_load_failures$.getGlobalValue())) : NIL);
        deflexical("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*", $list_alt206);
        return NIL;
    }

    public static SubLObject init_cyc_testing_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*IT-OUTPUT-FORMAT*", $STANDARD);
            defparameter("*CYC-TEST-DEBUG?*", NIL);
            defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T);
            defparameter("*TEST-REAL-TIME-PRUNING?*", NIL);
            deflexical("*CYC-TEST-VERBOSITY-LEVELS*", $list1);
            defparameter("*CYC-TEST-FILENAME*", NIL);
            defparameter("*CYC-BASE-TESTDCL*", $$$testdcl);
            defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL);
            defparameter("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*", NIL);
            deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list5);
            deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list6);
            deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list7);
            deflexical("*CYC-TEST-RESULT-VALUES*", append($cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(), $cyc_test_result_ignore_values$.getGlobalValue()));
            deflexical("*CYC-TEST-TYPE-TABLE*", $list8);
            defvar("*CYC-TESTS*", NIL);
            deflexical("*CYC-TEST-BY-NAME*", SubLTrampolineFile.maybeDefault($cyc_test_by_name$, $cyc_test_by_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
            deflexical("*CYC-TEST-BY-DWIMMED-NAME*", SubLTrampolineFile.maybeDefault($cyc_test_by_dwimmed_name$, $cyc_test_by_dwimmed_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
            defconstant("*DTP-CYC-TEST*", CYC_TEST);
            defparameter("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*", T);
            defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", $int$514);
            deflexical("*CYC-TEST-FILES*", SubLTrampolineFile.maybeDefault($cyc_test_files$, $cyc_test_files$, NIL));
            defconstant("*DTP-CYC-TEST-FILE*", CYC_TEST_FILE);
            deflexical("*MOST-RECENT-CYC-TEST-RUNS*", SubLTrampolineFile.maybeDefault($most_recent_cyc_test_runs$, $most_recent_cyc_test_runs$, NIL));
            deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", SubLTrampolineFile.maybeDefault($most_recent_cyc_test_file_load_failures$, $most_recent_cyc_test_file_load_failures$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list_alt4);
            deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list_alt5);
            deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list_alt6);
            deflexical("*CYC-TEST-TYPE-TABLE*", $list_alt7);
            deflexical("*CYC-TESTS*", NIL != boundp($cyc_tests$) ? ((SubLObject) ($cyc_tests$.getGlobalValue())) : NIL);
            deflexical("*CYC-TEST-BY-NAME*", NIL != boundp($cyc_test_by_name$) ? ((SubLObject) ($cyc_test_by_name$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*CYC-TEST-BY-DWIMMED-NAME*", NIL != boundp($cyc_test_by_dwimmed_name$) ? ((SubLObject) ($cyc_test_by_dwimmed_name$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED));
            deflexical("*CYC-TEST-FILES*", NIL != boundp($cyc_test_files$) ? ((SubLObject) ($cyc_test_files$.getGlobalValue())) : NIL);
            deflexical("*MOST-RECENT-CYC-TEST-RUNS*", NIL != boundp($most_recent_cyc_test_runs$) ? ((SubLObject) ($most_recent_cyc_test_runs$.getGlobalValue())) : NIL);
            deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", NIL != boundp($most_recent_cyc_test_file_load_failures$) ? ((SubLObject) ($most_recent_cyc_test_file_load_failures$.getGlobalValue())) : NIL);
            deflexical("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*", $list_alt206);
        }
        return NIL;
    }

    public static SubLObject init_cyc_testing_file_Previous() {
        defparameter("*IT-OUTPUT-FORMAT*", $STANDARD);
        defparameter("*CYC-TEST-DEBUG?*", NIL);
        defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T);
        defparameter("*TEST-REAL-TIME-PRUNING?*", NIL);
        deflexical("*CYC-TEST-VERBOSITY-LEVELS*", $list1);
        defparameter("*CYC-TEST-FILENAME*", NIL);
        defparameter("*CYC-BASE-TESTDCL*", $$$testdcl);
        defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL);
        defparameter("*ONLY-UNDECLARE-TESTS-AND-TEST-FILES?*", NIL);
        deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list5);
        deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list6);
        deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list7);
        deflexical("*CYC-TEST-RESULT-VALUES*", append($cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(), $cyc_test_result_ignore_values$.getGlobalValue()));
        deflexical("*CYC-TEST-TYPE-TABLE*", $list8);
        defvar("*CYC-TESTS*", NIL);
        deflexical("*CYC-TEST-BY-NAME*", SubLTrampolineFile.maybeDefault($cyc_test_by_name$, $cyc_test_by_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*CYC-TEST-BY-DWIMMED-NAME*", SubLTrampolineFile.maybeDefault($cyc_test_by_dwimmed_name$, $cyc_test_by_dwimmed_name$, () -> make_hash_table($int$212, symbol_function(EQUAL), UNPROVIDED)));
        defconstant("*DTP-CYC-TEST*", CYC_TEST);
        defparameter("*PRINT-POST-BUILD-TEST-SUMMARY-TIMESTAMP?*", T);
        defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", $int$514);
        deflexical("*CYC-TEST-FILES*", SubLTrampolineFile.maybeDefault($cyc_test_files$, $cyc_test_files$, NIL));
        defconstant("*DTP-CYC-TEST-FILE*", CYC_TEST_FILE);
        deflexical("*MOST-RECENT-CYC-TEST-RUNS*", SubLTrampolineFile.maybeDefault($most_recent_cyc_test_runs$, $most_recent_cyc_test_runs$, NIL));
        deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", SubLTrampolineFile.maybeDefault($most_recent_cyc_test_file_load_failures$, $most_recent_cyc_test_file_load_failures$, NIL));
        return NIL;
    }

    public static final SubLObject setup_cyc_testing_file_alt() {
        declare_defglobal($cyc_tests$);
        declare_defglobal($cyc_test_by_name$);
        declare_defglobal($cyc_test_by_dwimmed_name$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CT_FILE, _CSETF_CT_FILE);
        def_csetf(CT_GUTS, _CSETF_CT_GUTS);
        identity(CYC_TEST);
        register_macro_helper(RUN_CYC_TEST_INT, RUN_CYC_TEST);
        register_macro_helper(RUN_CYC_TEST_PARALLEL_INT, RUN_CYC_TEST_PARALLEL);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cyc_test$.getGlobalValue(), CFASL_INPUT_CYC_TEST);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
        declare_defglobal($cyc_test_files$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CTF_FILENAME, _CSETF_CTF_FILENAME);
        def_csetf(CTF_KB, _CSETF_CTF_KB);
        identity(CYC_TEST_FILE);
        declare_defglobal($most_recent_cyc_test_runs$);
        declare_defglobal($most_recent_cyc_test_file_load_failures$);
        register_macro_helper(DECLARE_CYC_TEST_FILE_INT, DECLARE_CYC_TEST_FILE);
        return NIL;
    }

    public static SubLObject setup_cyc_testing_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($cyc_test_by_name$);
            declare_defglobal($cyc_test_by_dwimmed_name$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list37);
            def_csetf(CT_FILE, _CSETF_CT_FILE);
            def_csetf(CT_GUTS, _CSETF_CT_GUTS);
            identity(CYC_TEST);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD));
            register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cyc_test$.getGlobalValue(), CFASL_INPUT_CYC_TEST);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
            declare_defglobal($cyc_test_files$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list108);
            def_csetf(CTF_FILENAME, _CSETF_CTF_FILENAME);
            def_csetf(CTF_KB, _CSETF_CTF_KB);
            identity(CYC_TEST_FILE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD));
            declare_defglobal($most_recent_cyc_test_runs$);
            declare_defglobal($most_recent_cyc_test_file_load_failures$);
            register_macro_helper(DECLARE_CYC_TEST_FILE_INT, DECLARE_CYC_TEST_FILE);
            define_test_case_table_int(SERVER_SUMMARY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
            define_test_case_table_int(KB_STATISTICS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
            define_test_case_table_int(CYC_MEMORY_HOGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
            define_test_case_table_int(ALL_CYC_TESTS_ARE_VALID, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($cyc_tests$);
            register_macro_helper(RUN_CYC_TEST_INT, RUN_CYC_TEST);
            register_macro_helper(RUN_CYC_TEST_PARALLEL_INT, RUN_CYC_TEST_PARALLEL);
        }
        return NIL;
    }

    public static SubLObject setup_cyc_testing_file_Previous() {
        declare_defglobal($cyc_test_by_name$);
        declare_defglobal($cyc_test_by_dwimmed_name$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list37);
        def_csetf(CT_FILE, _CSETF_CT_FILE);
        def_csetf(CT_GUTS, _CSETF_CT_GUTS);
        identity(CYC_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_METHOD));
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cyc_test$.getGlobalValue(), CFASL_INPUT_CYC_TEST);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
        declare_defglobal($cyc_test_files$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list108);
        def_csetf(CTF_FILENAME, _CSETF_CTF_FILENAME);
        def_csetf(CTF_KB, _CSETF_CTF_KB);
        identity(CYC_TEST_FILE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CYC_TEST_FILE_METHOD));
        declare_defglobal($most_recent_cyc_test_runs$);
        declare_defglobal($most_recent_cyc_test_file_load_failures$);
        register_macro_helper(DECLARE_CYC_TEST_FILE_INT, DECLARE_CYC_TEST_FILE);
        define_test_case_table_int(SERVER_SUMMARY, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
        define_test_case_table_int(KB_STATISTICS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
        define_test_case_table_int(CYC_MEMORY_HOGS, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
        define_test_case_table_int(ALL_CYC_TESTS_ARE_VALID, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $BOTH, $WORKING_, T }), $list167);
        return NIL;
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

    

    public static final class $cyc_test_native extends SubLStructNative {
        public SubLObject $file;

        public SubLObject $guts;

        private static final SubLStructDeclNative structDecl;

        public $cyc_test_native() {
            cyc_testing.$cyc_test_native.this.$file = Lisp.NIL;
            cyc_testing.$cyc_test_native.this.$guts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cyc_testing.$cyc_test_native.this.$file;
        }

        @Override
        public SubLObject getField3() {
            return cyc_testing.$cyc_test_native.this.$guts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cyc_testing.$cyc_test_native.this.$file = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cyc_testing.$cyc_test_native.this.$guts = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_native.class, CYC_TEST, CYC_TEST_P, $list31, $list32, new String[]{ "$file", "$guts" }, $list33, $list34, PRINT_CYC_TEST);
        }
    }

    public static final class $cyc_test_p$UnaryFunction extends UnaryFunction {
        public $cyc_test_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_test_p(arg1);
        }
    }

    public static final class $cyc_test_file_native extends SubLStructNative {
        public SubLObject $filename;

        public SubLObject $kb;

        private static final SubLStructDeclNative structDecl;

        public $cyc_test_file_native() {
            cyc_testing.$cyc_test_file_native.this.$filename = Lisp.NIL;
            cyc_testing.$cyc_test_file_native.this.$kb = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cyc_testing.$cyc_test_file_native.this.$filename;
        }

        @Override
        public SubLObject getField3() {
            return cyc_testing.$cyc_test_file_native.this.$kb;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cyc_testing.$cyc_test_file_native.this.$filename = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cyc_testing.$cyc_test_file_native.this.$kb = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_file_native.class, CYC_TEST_FILE, CYC_TEST_FILE_P, $list102, $list103, new String[]{ "$filename", "$kb" }, $list104, $list105, PRINT_CYC_TEST_FILE);
        }
    }

    public static final class $cyc_test_file_p$UnaryFunction extends UnaryFunction {
        public $cyc_test_file_p$UnaryFunction() {
            super(extractFunctionNamed("CYC-TEST-FILE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cyc_test_file_p(arg1);
        }
    }

    static private final SubLList $list_alt1 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"));

    static private final SubLList $list_alt2 = list($TINY, $FULL, $BOTH);

    static private final SubLList $list_alt3 = list(makeKeyword("STANDARD"), makeKeyword("POST-BUILD"));

    static private final SubLList $list_alt4 = list(makeKeyword("SUCCESS"), makeKeyword("REGRESSION-SUCCESS"));

    static private final SubLList $list_alt5 = list(makeKeyword("FAILURE"), makeKeyword("REGRESSION-FAILURE"), makeKeyword("ABNORMAL"), makeKeyword("ERROR"));

    static private final SubLList $list_alt6 = list(makeKeyword("NON-REGRESSION-SUCCESS"), makeKeyword("NON-REGRESSION-FAILURE"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    static private final SubLList $list_alt7 = list(list(makeKeyword("IUT"), makeString("inference unit test")), list(makeKeyword("IT"), makeString("inference test")), list(makeKeyword("RMT"), makeString("removal module test")), list(makeKeyword("TMT"), makeString("transformation module test")), list($RMCT, makeString("removal module cost test")), list(makeKeyword("ERT"), makeString("evaluatable relation test")), list(makeKeyword("TCT"), makeString("test case table")), list(makeKeyword("KCT"), makeString("KB content test")));

    static private final SubLList $list_alt12 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt13 = list($DONE);

    static private final SubLList $list_alt17 = list(makeSymbol("CYC-TESTS"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all Cyc tests"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt24$A_Cyc_test_named__a_already_exist = makeString("A Cyc test named ~a already existed; overwriting");

    static private final SubLList $list_alt31 = list(makeSymbol("FILE"), makeSymbol("GUTS"));

    static private final SubLList $list_alt32 = list($FILE, $GUTS);

    static private final SubLList $list_alt33 = list(makeSymbol("CT-FILE"), makeSymbol("CT-GUTS"));

    static private final SubLList $list_alt34 = list(makeSymbol("_CSETF-CT-FILE"), makeSymbol("_CSETF-CT-GUTS"));

    static private final SubLString $str_alt43$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt44$__CYC_TEST__a__a_ = makeString("#<CYC-TEST:~a:~a>");

    static private final SubLString $str_alt45$__CYC_TEST__a_ = makeString("#<CYC-TEST:~a>");

    static private final SubLString $str_alt48$_s_is_not_a_CYC_TEST_GUTS_P = makeString("~s is not a CYC-TEST-GUTS-P");

    static private final SubLString $str_alt51$Cyc_test_of_unexpected_type___s = makeString("Cyc test of unexpected type: ~s");

    static private final SubLSymbol $sym64$CYC_TEST_WORKING_ = makeSymbol("CYC-TEST-WORKING?");

    static private final SubLList $list_alt68 = list(makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(QUOTE, makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));

    static private final SubLList $list_alt69 = list(makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));

    public static final SubLSymbol $kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");

     private static final SubLSymbol RUN_CYC_TEST_INT = makeSymbol("RUN-CYC-TEST-INT");

    static private final SubLList $list_alt80 = list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(QUOTE, makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));

    static private final SubLList $list_alt81 = list(makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));

    private static final SubLSymbol RUN_CYC_TEST = makeSymbol("RUN-CYC-TEST");

    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");

    static private final SubLList $list_alt88 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("NTHREADS"), FOUR_INTEGER), list(makeSymbol("NTIMES"), TEN_INTEGER), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(QUOTE, makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))) });

    static private final SubLList $list_alt89 = list(makeKeyword("NTHREADS"), makeKeyword("NTIMES"), makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));

    private static final SubLSymbol RUN_CYC_TEST_PARALLEL_INT = makeSymbol("RUN-CYC-TEST-PARALLEL-INT");

    private static final SubLSymbol RUN_CYC_TEST_PARALLEL = makeSymbol("RUN-CYC-TEST-PARALLEL");

    static private final SubLString $str_alt95$Parallel_Test_Thread_for_ = makeString("Parallel Test Thread for ");

    static private final SubLString $str_alt96$_No__ = makeString(" No. ");

    private static final SubLSymbol RUN_CYC_TEST_OBJECT_PARALLEL = makeSymbol("RUN-CYC-TEST-OBJECT-PARALLEL");

    static private final SubLString $str_alt99$Can_t_run_inference_tests_in_brow = makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");

    static private final SubLString $str_alt100$Can_t_run_inference_tests_in_bloc = makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");

    static private final SubLString $str_alt104$Unexpected_testing_direction____S = makeString("Unexpected testing direction : ~S");

    static private final SubLString $str_alt106$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");

    static private final SubLString $str_alt107$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");

    static private final SubLString $str_alt108$Can_t_run_evaluatable_relation_te = makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");

    static private final SubLString $str_alt109$Can_t_run_test_case_tables_in_bro = makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");

    static private final SubLString $str_alt110$Can_t_run_test_case_tables_in_blo = makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");

    static private final SubLList $list_alt118 = list(makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    static private final SubLString $str_alt122$___S_____S = makeString("~&~S -> ~S");

    static private final SubLString $str_alt123$_S__S__S__ = makeString("~S ~S ~S~%");

    static private final SubLString $str_alt124$Unknown_output_format__A = makeString("Unknown output format ~A");

    static private final SubLString $str_alt125$_ = makeString(" ");

    static private final SubLString $str_alt127$Unknown_output_format_ = makeString("Unknown output format ");

    static private final SubLList $list_alt129 = list(list(makeSymbol("CYC-TEST-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt131 = list(list(makeSymbol("CYC-TEST-FILES")));

    static private final SubLList $list_alt132 = list(list(makeSymbol("CYC-TEST-FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all test files"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt134 = list(makeSymbol("CYC-TEST-FILES"));

    static private final SubLList $list_alt137 = list(makeSymbol("FILENAME"), makeSymbol("KB"));

    static private final SubLList $list_alt138 = list(makeKeyword("FILENAME"), makeKeyword("KB"));

    static private final SubLList $list_alt139 = list(makeSymbol("CTF-FILENAME"), makeSymbol("CTF-KB"));

    static private final SubLList $list_alt140 = list(makeSymbol("_CSETF-CTF-FILENAME"), makeSymbol("_CSETF-CTF-KB"));

    static private final SubLString $str_alt149$__CTF__a_ = makeString("#<CTF:~a>");

    static private final SubLList $list_alt155 = list(new SubLObject[]{ makeSymbol("PATH"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(QUOTE, makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))), list(makeSymbol("RUN-TEST-CASE-TABLES?"), T), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL) });

    static private final SubLList $list_alt156 = list(new SubLObject[]{ makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), makeKeyword("RUN-TEST-CASE-TABLES?"), makeKeyword("RETURN-TEST-RUNS?"), $TYPE, makeKeyword("RUN-NON-WORKING-TESTS") });

    public static final SubLSymbol $kw157$STOP_AT_FIRST_FAILURE_ = makeKeyword("STOP-AT-FIRST-FAILURE?");

    public static final SubLSymbol $kw158$RUN_TEST_CASE_TABLES_ = makeKeyword("RUN-TEST-CASE-TABLES?");

    public static final SubLSymbol $kw159$RETURN_TEST_RUNS_ = makeKeyword("RETURN-TEST-RUNS?");

    static private final SubLList $list_alt163 = list(makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL));

    static private final SubLList $list_alt164 = list(makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), $TYPE, makeKeyword("RUN-NON-WORKING-TESTS"));

    static private final SubLList $list_alt167 = list(makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("KB"));

    static private final SubLList $list_alt168 = list(makeKeyword("KB"));

    static private final SubLList $list_alt170 = list(new SubLObject[]{ makeSymbol("NAMES"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(QUOTE, makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL) });

    static private final SubLString $str_alt172$could_not_load__a_lisp_from__s = makeString("could not load ~a.lisp from ~s");

    static private final SubLString $str_alt175$_lisp = makeString(".lisp");

    static private final SubLString $str_alt177$___HARNESS_ERROR___A__ = makeString("~&:HARNESS-ERROR: ~A~%");

    static private final SubLList $list_alt180 = list(makeKeyword("RMT"), makeKeyword("TMT"), makeKeyword("TCT"));

    static private final SubLString $str_alt182$Unexpected_value__s_for__run_non_ = makeString("Unexpected value ~s for :run-non-working-tests");

    static private final SubLString $str_alt183$_Running_a_specified_list_of_test = makeString("\nRunning a specified list of tests ");

    static private final SubLString $str_alt184$_Running__a_file_P_of_tests_ = makeString("\nRunning ~a file~P of tests ");

    static private final SubLString $str_alt185$in_the__a_KB__KB__a___System__a_S = makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a\n\n");

    static private final SubLString $$$Tiny = makeString("Tiny");

    static private final SubLString $$$Full = makeString("Full");

    static private final SubLString $str_alt188$__No_tests_were_run___ = makeString("~&No tests were run.~%");

    static private final SubLString $str_alt189$__NOTE__The_following_cyc_tests_w = makeString("~&NOTE: The following cyc tests were noted as not working:~%");

    static private final SubLString $str_alt190$___Tests_finished_at__a_Total_tim = makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");

    private static final SubLSymbol CYC_TEST_RUN_RESULT = makeSymbol("CYC-TEST-RUN-RESULT");

    static private final SubLString $str_alt192$Overall_result___s__ = makeString("Overall result: ~s~%");

    static private final SubLString $str_alt193$__Failing_regression_tests___ = makeString("~&Failing regression tests:~%");

    static private final SubLString $str_alt194$None____ = makeString("None! (:");

    static private final SubLString $str_alt195$__Succeeding_regression_tests___ = makeString("~&Succeeding regression tests:~%");

    private static final SubLSymbol SUCCEEDING_CYC_TEST_RUN_P = makeSymbol("SUCCEEDING-CYC-TEST-RUN-P");

    static private final SubLString $str_alt197$None____ = makeString("None! ):");

    private static final SubLSymbol IGNORED_CYC_TEST_RUN_P = makeSymbol("IGNORED-CYC-TEST-RUN-P");

    static private final SubLString $str_alt199$None_ = makeString("None.");

    private static final SubLSymbol $NON_REGRESSION_SUCCESS = makeKeyword("NON-REGRESSION-SUCCESS");

    private static final SubLSymbol $NON_REGRESSION_FAILURE = makeKeyword("NON-REGRESSION-FAILURE");

    static private final SubLString $str_alt202$__Failing_non_regression_tests___ = makeString("~&Failing non-regression tests:~%");

    static private final SubLString $str_alt203$__Succeeding_non_regression_tests = makeString("~&Succeeding non-regression tests:~%");

    static private final SubLString $str_alt204$_S__A__S__A = makeString("~S ~A ~S ~A");

    static private final SubLString $str_alt205$__A = makeString(" ~A");

    static private final SubLList $list_alt206 = list(new SubLObject[]{ makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), makeKeyword("TRUE-SENTENCE-NOT-CANONICALIZATION"), makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), makeKeyword("INFERENCE-HARNESS-OVERHEAD"), makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), makeKeyword("THE-SET-OF-ELEMENTS-RETURNS-HL-NARTS"), makeKeyword("THE-COLLECTION-OF-INSTANCES-RETURNS-HL-NARTS"), makeKeyword("GENLPREDS-LOOKUP-GENERATES-CORRECT-SUPPORTS"), makeKeyword("KAPPA-REMOVAL-WORKS"), makeKeyword("DONT-REOPEN-ANSWER-LINK"), makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), makeKeyword("SIMPLE-EXCEPT-WHEN"), makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), makeKeyword("PARTIAL-EXCEPT-WHEN"), makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), makeKeyword("TRUE-SENTENCE-IMPLIES-VAR-CANONICALIZATION"), makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), makeKeyword("COLLECTION-ISA-BACKCHAIN-REQUIRED-4"), makeKeyword("COLLECTION-GENLS-BACKCHAIN-REQUIRED-4"), makeKeyword("COLLECTION-BACKCHAIN-REQUIRED-3"), makeKeyword("COLLECTION-BACKCHAIN-REQUIRED-4"), makeKeyword("EARLY-REMOVAL-OF-8-RESTRICTED-PROBLEMS-REQUIRING-TRANSFORMATION"), makeKeyword("EARLY-NEW-ROOT-OF-9-RESTRICTED-PROBLEMS-REQUIRING-TRANSFORMATION"), makeKeyword("FORWARD-INDETERMINATE-RESULT"), makeKeyword("SIMPLE-FORWARD-PRAGMATIC-REQUIREMENT"), makeKeyword("SIMPLE-FORWARD-PRAGMATIC-REQUIREMENT-SUPPORTS"), makeKeyword("NART-ISA-IN-RIGHT-MT"), makeKeyword("FORWARD-PROBLEM-STORE-DESTRUCTION-ON-CONFLICT"), makeKeyword("FORWARD-RULE-CONCLUDING-CONSEQUENT-IN-WRONG-MT"), makeKeyword("SKOLEMIZE-FORWARD"), makeKeyword("FORWARD-INFERENCE-WITH-DEFNS"), makeKeyword("COMPLETENESS-IN-LOW-MT-DOESNT-HOSE-FORWARD-INFERENCE"), makeKeyword("HYPOTHETICAL-MT-COMPLETENESS-ASSERTION-DOESNT-HOSE-FORWARD-INFERENCE"), makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), makeKeyword("CYC-ASSERT-WITH-REIFIABLE-MONAD-MT"), makeKeyword("FORWARD-RULE-CONCLUDING-FALSE"), makeKeyword("SKOLEM-RESULT-ARG"), makeKeyword("UNASSERT-REIFIABLE-NAT-MT"), makeKeyword("UNASSERT-NART-MT-SENTENCE-WITH-NART"), makeKeyword("UNASSERT-REIFIABLE-NAT-MT-VIA-TL"), makeKeyword("CANONICALIZE-NESTED-MT"), makeKeyword("FUNCTION-TEST"), makeKeyword("NAT-REMOVAL"), makeKeyword("RESULTTYPE-CHANGE"), makeKeyword("META-ASSERTION-REMOVAL"), makeKeyword("ARG-TYPE-MT-DENOTING-FUNCTION"), makeKeyword("MAX-FLOOR-MTS-OF-NAT"), makeKeyword("CONTEXTUALIZED-COLLECTION-SPECPRED-OF-ISA"), makeKeyword("USE-DEFNS-TO-CHECK-INFERENCE-SEMANTICALLY-VALID-DNF"), makeKeyword("SBHL-TRUMPS-DEFNS"), makeKeyword("SKOLEMIZE-FORWARD-NAUT-GENL-MT-WFF-EXCEPTION"), makeKeyword("ONE-STEP"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("MANY-STEP"), makeKeyword("CROSS-MT"), makeKeyword("DISJUNCTIVE-SYLLOGISM"), makeKeyword("ARGUMENTATION"), makeKeyword("TMS-LOOP"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("HL-SUPPORT-MT-HANDLING"), makeKeyword("THERE-EXISTS"), makeKeyword("EXCEPT-WHEN"), makeKeyword("EXCEPT-WHEN"), makeKeyword("STRENGTH-PROPAGATION"), makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), makeKeyword("INFERENCE-ANSWER-TEMPLATE"), makeKeyword("FORWARD-PROPAGATE-MT"), makeKeyword("FORWARD-PROPAGATE-MT-CONTINUE"), makeKeyword("IST-TRIGGERS-FORWARD-INFERENCE-SIMPLE"), makeKeyword("FORWARD-NON-TRIGGER-LITERAL-HONORED"), makeKeyword("EXCEPT-BLOCKS-BACKWARD"), makeKeyword("EXCEPT-BLOCKS-FORWARD"), makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), makeKeyword("TMS-FOR-HL-SUPPORTS"), makeKeyword("ASSERTION-DIRECTION"), makeKeyword("MERGE-IGNORES-OPAQUE-REFERENCES"), makeKeyword("MT-FLOORS-WRT-ISA-PATHS"), makeKeyword("MIN-GENL-MTS"), makeKeyword("MIN-GENL-PREDICATES"), makeKeyword("MIN-GENLS-COLLECTION"), makeKeyword("SPLIT-NO-GOODNESS-PROPAGATION"), makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), makeKeyword("REMOVAL-ALL-ISA-OF-TYPE-2"), makeKeyword("AVOID-LOOKUP-ON-INDETERMINATES"), makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), makeKeyword("ASSERTED-INSTANCE-OF-DISJOINT-COLLECTIONS"), makeKeyword("CHAINING-SKOLEM-STRAIGHTFORWARD"), makeKeyword("CHAINING-SKOLEM-SHALLOW"), makeKeyword("CHAINING-SKOLEM-DEEP"), makeKeyword("CHAINING-SKOLEM"), makeKeyword("EXCEPT-DECONTEXTUALIZED"), makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), makeKeyword("GENLS-BETWEEN"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), makeKeyword("CIRCULAR-PROOFS") });
}

/**
 * Total time: 586 ms synthetic
 */
