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
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$cyc_test_filename$;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing.$run_tiny_kb_tests_in_full_kbP$;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing.new_cyc_test_run;
import static com.cyc.cycjava.cycl.cyc_testing.cyc_testing.run_all_loaded_cyc_tests;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GENERIC-TESTING
 * source file: /cyc/top/cycl/cyc-testing/generic-testing.lisp
 * created:     2019/07/03 17:37:10
 */
public final class generic_testing extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt45$ = makeString("");

    public static final SubLFile me = new generic_testing();



    // deflexical
    // all the test-cases sorted by what classes they belong to
    /**
     * all the test-cases sorted by what classes they belong to
     */
    @LispMethod(comment = "all the test-cases sorted by what classes they belong to\ndeflexical")
    private static final SubLSymbol $test_case_tables_by_class$ = makeSymbol("*TEST-CASE-TABLES-BY-CLASS*");

    // deflexical
    // The possible statuses for generic tests.
    /**
     * The possible statuses for generic tests.
     */
    @LispMethod(comment = "The possible statuses for generic tests.\ndeflexical")
    private static final SubLSymbol $generic_test_results$ = makeSymbol("*GENERIC-TEST-RESULTS*");

    // deflexical
    // The possible levels of verbosity for generic tests.
    /**
     * The possible levels of verbosity for generic tests.
     */
    @LispMethod(comment = "The possible levels of verbosity for generic tests.\ndeflexical")
    private static final SubLSymbol $generic_test_verbosity_levels$ = makeSymbol("*GENERIC-TEST-VERBOSITY-LEVELS*");

    // deflexical
    // The token identifying 'test case table' in the space of post-build tests.
    /**
     * The token identifying 'test case table' in the space of post-build tests.
     */
    @LispMethod(comment = "The token identifying \'test case table\' in the space of post-build tests.\ndeflexical")
    private static final SubLSymbol $test_case_table_post_build_token$ = makeSymbol("*TEST-CASE-TABLE-POST-BUILD-TOKEN*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $debug_test_case_tablesP$ = makeSymbol("*DEBUG-TEST-CASE-TABLES?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_generic_test_case_table$ = makeSymbol("*DTP-GENERIC-TEST-CASE-TABLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_generic_test_case_table$ = makeSymbol("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $test_case_table_index$ = makeSymbol("*TEST-CASE-TABLE-INDEX*");

    private static final SubLInteger $int$212 = makeInteger(212);

    public static final SubLSymbol $ordered_test_cases$ = makeSymbol("*ORDERED-TEST-CASES*");

    static private final SubLList $list4 = list(makeKeyword("SUCCESS"), makeKeyword("FAILURE"), makeKeyword("ERROR"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    static private final SubLList $list5 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"), makeKeyword("POST-BUILD"));

    private static final SubLSymbol GENERIC_TEST_CASE_TABLE = makeSymbol("GENERIC-TEST-CASE-TABLE");

    private static final SubLSymbol GENERIC_TEST_CASE_TABLE_P = makeSymbol("GENERIC-TEST-CASE-TABLE-P");

    static private final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("TUPLES"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), makeSymbol("KB"), makeSymbol("WORKING?"));

    static private final SubLList $list10 = list($NAME, makeKeyword("TUPLES"), $TEST, makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    static private final SubLList $list11 = list(makeSymbol("GTCT-NAME"), makeSymbol("GTCT-TUPLES"), makeSymbol("GTCT-TEST"), makeSymbol("GTCT-OWNER"), makeSymbol("GTCT-CLASSES"), makeSymbol("GTCT-KB"), makeSymbol("GTCT-WORKING?"));

    static private final SubLList $list12 = list(makeSymbol("_CSETF-GTCT-NAME"), makeSymbol("_CSETF-GTCT-TUPLES"), makeSymbol("_CSETF-GTCT-TEST"), makeSymbol("_CSETF-GTCT-OWNER"), makeSymbol("_CSETF-GTCT-CLASSES"), makeSymbol("_CSETF-GTCT-KB"), makeSymbol("_CSETF-GTCT-WORKING?"));

    private static final SubLSymbol GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list15 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GENERIC-TEST-CASE-TABLE-P"));

    private static final SubLSymbol GTCT_NAME = makeSymbol("GTCT-NAME");

    private static final SubLSymbol _CSETF_GTCT_NAME = makeSymbol("_CSETF-GTCT-NAME");

    private static final SubLSymbol GTCT_TUPLES = makeSymbol("GTCT-TUPLES");

    private static final SubLSymbol _CSETF_GTCT_TUPLES = makeSymbol("_CSETF-GTCT-TUPLES");

    private static final SubLSymbol GTCT_TEST = makeSymbol("GTCT-TEST");

    private static final SubLSymbol _CSETF_GTCT_TEST = makeSymbol("_CSETF-GTCT-TEST");

    private static final SubLSymbol GTCT_OWNER = makeSymbol("GTCT-OWNER");

    private static final SubLSymbol _CSETF_GTCT_OWNER = makeSymbol("_CSETF-GTCT-OWNER");

    private static final SubLSymbol GTCT_CLASSES = makeSymbol("GTCT-CLASSES");

    private static final SubLSymbol _CSETF_GTCT_CLASSES = makeSymbol("_CSETF-GTCT-CLASSES");

    private static final SubLSymbol GTCT_KB = makeSymbol("GTCT-KB");

    private static final SubLSymbol _CSETF_GTCT_KB = makeSymbol("_CSETF-GTCT-KB");

    private static final SubLSymbol $sym28$GTCT_WORKING_ = makeSymbol("GTCT-WORKING?");

    private static final SubLSymbol $sym29$_CSETF_GTCT_WORKING_ = makeSymbol("_CSETF-GTCT-WORKING?");

    private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_GENERIC_TEST_CASE_TABLE = makeSymbol("MAKE-GENERIC-TEST-CASE-TABLE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD");

    private static final SubLSymbol TEST_CASE_NAME_P = makeSymbol("TEST-CASE-NAME-P");

    private static final SubLString $str49$_S_was_not_a_valid___input_____ex = makeString("~S was not a valid (<input> . <expected-results>) tuple");

    private static final SubLString $str50$ = makeString("");

    private static final SubLSymbol $sym51$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLList $list52 = list(makeSymbol("TEST-CASE-NAME"), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), list(makeSymbol("KB"), $TINY), list(makeSymbol("WORKING?"), T)), makeSymbol("&BODY"), makeSymbol("TUPLES"));

    private static final SubLList $list53 = list($TEST, makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DEFINE_TEST_CASE_TABLE_INT = makeSymbol("DEFINE-TEST-CASE-TABLE-INT");

    private static final SubLSymbol GENERIC_TEST_VERBOSITY_LEVEL_P = makeSymbol("GENERIC-TEST-VERBOSITY-LEVEL-P");

    private static final SubLString $str62$__There_is_no_test_case_table_nam = makeString("~%There is no test case table named ~s.");

    private static final SubLSymbol DEFINE_TEST_CASE_TABLE = makeSymbol("DEFINE-TEST-CASE-TABLE");

    private static final SubLList $list71 = list(makeSymbol("&KEY"), makeSymbol("OWNER"), makeSymbol("TEST"), makeSymbol("CLASSES"), makeSymbol("KB"), list(makeSymbol("WORKING?"), T));

    private static final SubLList $list72 = list(makeKeyword("OWNER"), $TEST, makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    private static final SubLList $list74 = list(makeSymbol("INPUT-ARGS"), makeSymbol("&REST"), makeSymbol("EXPECTED-RESULTS"));

    private static final SubLSymbol QUOTIFY = makeSymbol("QUOTIFY");

    private static final SubLString $str77$_TCT__S____ = makeString(":TCT ~S -> ");

    private static final SubLString $str78$Starting__TCT__S______ = makeString("Starting :TCT ~S :~%~%");

    private static final SubLString $str79$_S____3f___ = makeString("~S (~,3f)~%");

    private static final SubLString $str80$__Overall_result_for___S___S__ = makeString("~%Overall result for '~S: ~S~%");

    private static final SubLString $str81$Please_notify__a_cyc_com_ = makeString("Please notify ~a@cyc.com.");

    private static final SubLString $str82$__Input___s____Expected_result___ = makeString("  Input: ~s~%  Expected result: ~s  ~%");

    private static final SubLString $str83$__Input___s____Expected_results__ = makeString("  Input: ~s~%  Expected results: ~s  ~%");

    private static final SubLString $str84$__________SUCCESS___S___ = makeString("~%    -> :SUCCESS (~S)~%");

    private static final SubLString $str85$__________ERROR__S___S___ = makeString("~%    -> :ERROR ~S (~S)~%");

    private static final SubLString $str86$____Actual_result___s____Compared = makeString("    Actual result: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");

    private static final SubLString $str87$____Actual_results___s____Compare = makeString("    Actual results: ~s~%  Compared via: ~s~%  -> :FAILURE (~S)~%");

    private static final SubLSymbol CFASL_INPUT_GENERIC_TEST_CASE_TABLE = makeSymbol("CFASL-INPUT-GENERIC-TEST-CASE-TABLE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD");

    public static final SubLObject all_generic_test_cases_alt() {
        return $ordered_test_cases$.getGlobalValue();
    }

    public static SubLObject all_generic_test_cases() {
        return $ordered_test_cases$.getGlobalValue();
    }

    public static final SubLObject generic_test_case_table_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject generic_test_case_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject generic_test_case_table_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject generic_test_case_table_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_native.class ? T : NIL;
    }

    public static final SubLObject gtct_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField2();
    }

    public static SubLObject gtct_name(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject gtct_tuples_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField3();
    }

    public static SubLObject gtct_tuples(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject gtct_test_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField4();
    }

    public static SubLObject gtct_test(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject gtct_owner_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField5();
    }

    public static SubLObject gtct_owner(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject gtct_classes_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField6();
    }

    public static SubLObject gtct_classes(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject gtct_kb_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField7();
    }

    public static SubLObject gtct_kb(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject gtct_workingP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.getField8();
    }

    public static SubLObject gtct_workingP(final SubLObject v_object) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_gtct_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_gtct_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_gtct_tuples_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_gtct_tuples(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_gtct_test_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_gtct_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_gtct_owner_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_gtct_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_gtct_classes_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_gtct_classes(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_gtct_kb_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_gtct_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_gtct_workingP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, GENERIC_TEST_CASE_TABLE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_gtct_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != generic_test_case_table_p(v_object) : "! generic_testing.generic_test_case_table_p(v_object) " + "generic_testing.generic_test_case_table_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_generic_test_case_table_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_gtct_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TUPLES)) {
                            _csetf_gtct_tuples(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TEST)) {
                                _csetf_gtct_test(v_new, current_value);
                            } else {
                                if (pcase_var.eql($OWNER)) {
                                    _csetf_gtct_owner(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CLASSES)) {
                                        _csetf_gtct_classes(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($KB)) {
                                            _csetf_gtct_kb(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($WORKING_)) {
                                                _csetf_gtct_workingP(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_generic_test_case_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_gtct_name(v_new, current_value);
            } else
                if (pcase_var.eql($TUPLES)) {
                    _csetf_gtct_tuples(v_new, current_value);
                } else
                    if (pcase_var.eql($TEST)) {
                        _csetf_gtct_test(v_new, current_value);
                    } else
                        if (pcase_var.eql($OWNER)) {
                            _csetf_gtct_owner(v_new, current_value);
                        } else
                            if (pcase_var.eql($CLASSES)) {
                                _csetf_gtct_classes(v_new, current_value);
                            } else
                                if (pcase_var.eql($KB)) {
                                    _csetf_gtct_kb(v_new, current_value);
                                } else
                                    if (pcase_var.eql($WORKING_)) {
                                        _csetf_gtct_workingP(v_new, current_value);
                                    } else {
                                        Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_generic_test_case_table(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GENERIC_TEST_CASE_TABLE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, gtct_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TUPLES, gtct_tuples(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST, gtct_test(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, gtct_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASSES, gtct_classes(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, gtct_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, gtct_workingP(obj));
        funcall(visitor_fn, obj, $END, MAKE_GENERIC_TEST_CASE_TABLE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_generic_test_case_table_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_generic_test_case_table(obj, visitor_fn);
    }

    public static final SubLObject new_generic_test_case_table_alt(SubLObject name, SubLObject tuples, SubLObject test, SubLObject owner, SubLObject v_classes, SubLObject kb, SubLObject workingP) {
        if (v_classes == UNPROVIDED) {
            v_classes = NIL;
        }
        if (kb == UNPROVIDED) {
            kb = $TINY;
        }
        if (workingP == UNPROVIDED) {
            workingP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == test) {
                test = symbol_function(EQUAL);
            }
            SubLTrampolineFile.checkType(name, TEST_CASE_NAME_P);
            SubLTrampolineFile.checkType(tuples, NON_DOTTED_LIST_P);
            SubLTrampolineFile.checkType(test, FUNCTION_SPEC_P);
            if (NIL != owner) {
                SubLTrampolineFile.checkType(owner, STRINGP);
            }
            if (NIL != v_classes) {
                SubLTrampolineFile.checkType(v_classes, LISTP);
            }
            SubLTrampolineFile.checkType(kb, CYC_TEST_KB_P);
            {
                SubLObject cdolist_list_var = tuples;
                SubLObject tuple = NIL;
                for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != list_utilities.proper_list_p(tuple)) && (NIL != list_utilities.lengthGE(tuple, TWO_INTEGER, UNPROVIDED)))) {
                            Errors.error($str_alt44$_S_was_not_a_valid___input_____ex, tuple);
                        }
                    }
                }
            }
            {
                SubLObject gtct = make_generic_test_case_table(UNPROVIDED);
                _csetf_gtct_name(gtct, name);
                _csetf_gtct_tuples(gtct, tuples);
                _csetf_gtct_test(gtct, test);
                _csetf_gtct_owner(gtct, owner);
                _csetf_gtct_classes(gtct, v_classes);
                _csetf_gtct_kb(gtct, kb);
                _csetf_gtct_workingP(gtct, workingP);
                return gtct;
            }
        }
    }

    public static SubLObject new_generic_test_case_table(final SubLObject name, final SubLObject tuples, SubLObject test, final SubLObject owner, SubLObject v_classes, SubLObject kb, SubLObject workingP) {
        if (v_classes == UNPROVIDED) {
            v_classes = NIL;
        }
        if (kb == UNPROVIDED) {
            kb = $TINY;
        }
        if (workingP == UNPROVIDED) {
            workingP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == test) {
            test = symbol_function(EQUAL);
        }
        assert NIL != test_case_name_p(name) : "! generic_testing.test_case_name_p(name) " + ("generic_testing.test_case_name_p(name) " + "CommonSymbols.NIL != generic_testing.test_case_name_p(name) ") + name;
        assert NIL != listp(tuples) : "! listp(tuples) " + ("Types.listp(tuples) " + "CommonSymbols.NIL != Types.listp(tuples) ") + tuples;
        assert NIL != function_spec_p(test) : "! function_spec_p(test) " + ("Types.function_spec_p(test) " + "CommonSymbols.NIL != Types.function_spec_p(test) ") + test;
        if (((NIL != owner) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(owner))) {
            throw new AssertionError(owner);
        }
        if (((NIL != v_classes) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == listp(v_classes))) {
            throw new AssertionError(v_classes);
        }
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "! cyc_testing.cyc_test_kb_p(kb) " + ("cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) ") + kb;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!tuple.isCons()) || (!length(tuple).numGE(TWO_INTEGER)))) {
                Errors.error($str49$_S_was_not_a_valid___input_____ex, tuple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        final SubLObject gtct = make_generic_test_case_table(UNPROVIDED);
        _csetf_gtct_name(gtct, name);
        _csetf_gtct_tuples(gtct, tuples);
        _csetf_gtct_test(gtct, test);
        _csetf_gtct_owner(gtct, owner);
        _csetf_gtct_classes(gtct, v_classes);
        _csetf_gtct_kb(gtct, kb);
        _csetf_gtct_workingP(gtct, workingP);
        return gtct;
    }

    public static final SubLObject generic_test_case_table_name_alt(SubLObject gtct) {
        return gtct_name(gtct);
    }

    public static SubLObject generic_test_case_table_name(final SubLObject gtct) {
        return gtct_name(gtct);
    }

    public static final SubLObject generic_test_case_table_tuples_alt(SubLObject gtct) {
        return gtct_tuples(gtct);
    }

    public static SubLObject generic_test_case_table_tuples(final SubLObject gtct) {
        return gtct_tuples(gtct);
    }

    public static final SubLObject generic_test_case_table_kb_alt(SubLObject gtct) {
        return gtct_kb(gtct);
    }

    public static SubLObject generic_test_case_table_kb(final SubLObject gtct) {
        return gtct_kb(gtct);
    }

    public static final SubLObject generic_test_case_table_owner_alt(SubLObject gtct) {
        return gtct_owner(gtct);
    }

    public static SubLObject generic_test_case_table_owner(final SubLObject gtct) {
        return gtct_owner(gtct);
    }

    public static final SubLObject generic_test_case_table_workingP_alt(SubLObject gtct) {
        return gtct_workingP(gtct);
    }

    public static SubLObject generic_test_case_table_workingP(final SubLObject gtct) {
        return gtct_workingP(gtct);
    }

    public static final SubLObject generic_test_case_table_comment_alt(SubLObject gtct) {
        return $str_alt45$;
    }

    public static SubLObject generic_test_case_table_comment(final SubLObject gtct) {
        return $str50$;
    }

    public static final SubLObject generic_test_case_table_tuples_mentioning_some_invalid_constant_alt(SubLObject gtct) {
        {
            SubLObject name = generic_test_case_table_name(gtct);
            SubLObject tuples = generic_test_case_table_tuples(gtct);
            SubLObject invalid_tuple_names = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = tuples;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                if (NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
                    invalid_tuple_names = cons(list(name, index), invalid_tuple_names);
                }
                index = add(index, ONE_INTEGER);
            }
            return nreverse(invalid_tuple_names);
        }
    }

    public static SubLObject generic_test_case_table_tuples_mentioning_some_invalid_constant(final SubLObject gtct) {
        final SubLObject name = generic_test_case_table_name(gtct);
        final SubLObject tuples = generic_test_case_table_tuples(gtct);
        SubLObject invalid_tuple_names = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
                invalid_tuple_names = cons(list(name, index), invalid_tuple_names);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(invalid_tuple_names);
    }

    public static SubLObject generic_test_case_table_tuples_invalid_constants(final SubLObject gtct) {
        final SubLObject tuples = generic_test_case_table_tuples(gtct);
        SubLObject result = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = generic_test_case_table_tuple_invalid_constants(tuple);
            SubLObject constant = NIL;
            constant = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject item_var = constant;
                if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                    result = cons(item_var, result);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                constant = cdolist_list_var_$1.first();
            } 
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject generic_test_case_table_tuple_mentions_invalid_constantP_alt(SubLObject tuple) {
        return list_utilities.tree_find_if(symbol_function($sym46$INVALID_CONSTANT_), tuple, UNPROVIDED);
    }

    public static SubLObject generic_test_case_table_tuple_mentions_invalid_constantP(final SubLObject tuple) {
        return list_utilities.tree_find_if($sym51$INVALID_CONSTANT_, tuple, UNPROVIDED);
    }

    public static SubLObject generic_test_case_table_tuple_invalid_constants(final SubLObject tuple) {
        return cycl_utilities.expression_gather(tuple, $sym51$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject define_test_case_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_case_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            test_case_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_1 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt47);
                        current_1 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt47);
                        if (NIL == member(current_1, $list_alt48, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_1 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                    {
                        SubLObject test_tail = property_list_member($TEST, current);
                        SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                        SubLObject owner_tail = property_list_member($OWNER, current);
                        SubLObject owner = (NIL != owner_tail) ? ((SubLObject) (cadr(owner_tail))) : NIL;
                        SubLObject classes_tail = property_list_member($CLASSES, current);
                        SubLObject v_classes = (NIL != classes_tail) ? ((SubLObject) (cadr(classes_tail))) : NIL;
                        SubLObject kb_tail = property_list_member($KB, current);
                        SubLObject kb = (NIL != kb_tail) ? ((SubLObject) (cadr(kb_tail))) : $TINY;
                        SubLObject workingP_tail = property_list_member($WORKING_, current);
                        SubLObject workingP = (NIL != workingP_tail) ? ((SubLObject) (cadr(workingP_tail))) : T;
                        current = temp;
                        {
                            SubLObject tuples = current;
                            SubLTrampolineFile.checkType(test_case_name, TEST_CASE_NAME_P);
                            return list(DEFINE_TEST_CASE_TABLE_INT, list(QUOTE, test_case_name), list(new SubLObject[]{ LIST, $TEST, test, $OWNER, owner, $CLASSES, v_classes, $KB, kb, $WORKING_, workingP }), list(QUOTE, tuples));
                        }
                    }
                }
            }
        }
    }

    public static SubLObject define_test_case_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_case_name = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        test_case_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list52);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list52);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list52);
            if (NIL == member(current_$2, $list53, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list52);
        }
        final SubLObject test_tail = property_list_member($TEST, current);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject classes_tail = property_list_member($CLASSES, current);
        final SubLObject v_classes = (NIL != classes_tail) ? cadr(classes_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $TINY;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        final SubLObject tuples;
        current = tuples = temp;
        assert NIL != test_case_name_p(test_case_name) : "! generic_testing.test_case_name_p(test_case_name) " + ("generic_testing.test_case_name_p(test_case_name) " + "CommonSymbols.NIL != generic_testing.test_case_name_p(test_case_name) ") + test_case_name;
        return list(DEFINE_TEST_CASE_TABLE_INT, list(QUOTE, test_case_name), list(new SubLObject[]{ LIST, $TEST, test, $OWNER, NIL, $CLASSES, v_classes, $KB, kb, $WORKING_, workingP }), list(QUOTE, tuples));
    }

    /**
     *
     *
     * @return booleanp; whether TEST-CASE-NAME was previously defined.
     */
    @LispMethod(comment = "@return booleanp; whether TEST-CASE-NAME was previously defined.")
    public static final SubLObject undefine_test_case_table_alt(SubLObject test_case_name) {
        SubLTrampolineFile.checkType(test_case_name, TEST_CASE_NAME_P);
        $ordered_test_cases$.setGlobalValue(delete(test_case_name, $ordered_test_cases$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        {
            SubLObject cdolist_list_var = test_case_classes(test_case_name);
            SubLObject v_class = NIL;
            for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                hash_table_utilities.remove_value_from_hash(v_class, test_case_name, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED);
            }
        }
        return remhash(test_case_name, $test_case_table_index$.getGlobalValue());
    }

    /**
     *
     *
     * @return booleanp; whether TEST-CASE-NAME was previously defined.
     */
    @LispMethod(comment = "@return booleanp; whether TEST-CASE-NAME was previously defined.")
    public static SubLObject undefine_test_case_table(final SubLObject test_case_name) {
        assert NIL != test_case_name_p(test_case_name) : "! generic_testing.test_case_name_p(test_case_name) " + ("generic_testing.test_case_name_p(test_case_name) " + "CommonSymbols.NIL != generic_testing.test_case_name_p(test_case_name) ") + test_case_name;
        $ordered_test_cases$.setGlobalValue(delete(test_case_name, $ordered_test_cases$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = test_case_classes(test_case_name);
        SubLObject v_class = NIL;
        v_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.remove_value_from_hash(v_class, test_case_name, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        } 
        return remhash(test_case_name, $test_case_table_index$.getGlobalValue());
    }

    public static final SubLObject undefine_all_test_case_tables_alt() {
        clrhash($test_case_table_index$.getGlobalValue());
        $ordered_test_cases$.setGlobalValue(NIL);
        clrhash($test_case_tables_by_class$.getGlobalValue());
        return T;
    }

    public static SubLObject undefine_all_test_case_tables() {
        clrhash($test_case_table_index$.getGlobalValue());
        $ordered_test_cases$.setGlobalValue(NIL);
        clrhash($test_case_tables_by_class$.getGlobalValue());
        return T;
    }

    /**
     *
     *
     * @return 0 generic-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 generic-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static final SubLObject run_test_case_table_alt(SubLObject test_case_name, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $VERBOSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        SubLTrampolineFile.checkType(stream, STREAMP);
        SubLTrampolineFile.checkType(test_case_name, TEST_CASE_NAME_P);
        SubLTrampolineFile.checkType(verbosity_level, GENERIC_TEST_VERBOSITY_LEVEL_P);
        {
            SubLObject test_case = gethash(test_case_name, $test_case_table_index$.getGlobalValue(), $UNDEFINED);
            if ($UNDEFINED == test_case) {
                format(stream, $str_alt57$__There_is_no_test_case_table_nam, test_case_name);
                return values($NOT_RUN, list(new_cyc_test_run($TCT, test_case_name, $NOT_RUN, NIL)));
            } else {
                return run_generic_test_case_int(stream, test_case, verbosity_level, stop_at_first_failureP);
            }
        }
    }

    /**
     *
     *
     * @return 0 generic-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 generic-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static SubLObject run_test_case_table(final SubLObject test_case_name, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $VERBOSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        assert NIL != test_case_name_p(test_case_name) : "! generic_testing.test_case_name_p(test_case_name) " + ("generic_testing.test_case_name_p(test_case_name) " + "CommonSymbols.NIL != generic_testing.test_case_name_p(test_case_name) ") + test_case_name;
        assert NIL != generic_test_verbosity_level_p(verbosity_level) : "! generic_testing.generic_test_verbosity_level_p(verbosity_level) " + ("generic_testing.generic_test_verbosity_level_p(verbosity_level) " + "CommonSymbols.NIL != generic_testing.generic_test_verbosity_level_p(verbosity_level) ") + verbosity_level;
        final SubLObject test_case = gethash(test_case_name, $test_case_table_index$.getGlobalValue(), $UNDEFINED);
        if ($UNDEFINED == test_case) {
            format(stream, $str62$__There_is_no_test_case_table_nam, test_case_name);
            return values($NOT_RUN, list(cyc_testing.new_cyc_test_run($TCT, test_case_name, $NOT_RUN, NIL)));
        }
        return run_generic_test_case_int(stream, test_case, verbosity_level, stop_at_first_failureP);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p		; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p\t\t; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static final SubLObject run_all_test_case_tables_alt(SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = $run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return run_all_loaded_cyc_tests(stream, verbosity_level, stop_at_first_failureP, $STANDARD, run_tiny_kb_tests_in_full_kbP, T, return_test_runsP, $TCT, NIL, UNPROVIDED);
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p		; the overall result
     * @return 1 list of cyc-test-run-p; the details of each test that was run
    but will be dwimmed to NIL unless RETURN-TEST-RUNS? is t
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p\t\t; the overall result\r\n@return 1 list of cyc-test-run-p; the details of each test that was run\r\nbut will be dwimmed to NIL unless RETURN-TEST-RUNS? is t")
    public static SubLObject run_all_test_case_tables(SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        return cyc_testing.run_all_loaded_cyc_tests(stream, verbosity_level, stop_at_first_failureP, $STANDARD, run_tiny_kb_tests_in_full_kbP, T, return_test_runsP, $TCT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject run_test_case_tables_of_class_alt(SubLObject v_class, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        return run_test_case_tables(test_cases_of_class(v_class), stream, verbosity_level, stop_at_first_failureP);
    }

    public static SubLObject run_test_case_tables_of_class(final SubLObject v_class, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        return run_test_case_tables(test_cases_of_class(v_class), stream, verbosity_level, stop_at_first_failureP);
    }

    /**
     *
     *
     * @return 0 generic-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 generic-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static final SubLObject run_test_case_tables_alt(SubLObject tables, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(stream, STREAMP);
            SubLTrampolineFile.checkType(verbosity_level, GENERIC_TEST_VERBOSITY_LEVEL_P);
            {
                SubLObject overall_result = $NOT_RUN;
                SubLObject test_runs = NIL;
                SubLObject stopP = NIL;
                if (NIL == stopP) {
                    {
                        SubLObject csome_list_var = tables;
                        SubLObject test_case_name = NIL;
                        for (test_case_name = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , test_case_name = csome_list_var.first()) {
                            thread.resetMultipleValues();
                            {
                                SubLObject table_result = run_test_case_table(test_case_name, stream, verbosity_level, stop_at_first_failureP);
                                SubLObject partial_test_runs = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                test_runs = nconc(test_runs, partial_test_runs);
                                overall_result = generic_test_result_update(overall_result, table_result);
                                if ((NIL != generic_test_failure_result_p(overall_result)) && (NIL != stop_at_first_failureP)) {
                                    stopP = T;
                                }
                            }
                        }
                    }
                }
                return values(overall_result, test_runs);
            }
        }
    }

    /**
     *
     *
     * @return 0 generic-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 generic-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static SubLObject run_test_case_tables(final SubLObject tables, SubLObject stream, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        assert NIL != generic_test_verbosity_level_p(verbosity_level) : "! generic_testing.generic_test_verbosity_level_p(verbosity_level) " + ("generic_testing.generic_test_verbosity_level_p(verbosity_level) " + "CommonSymbols.NIL != generic_testing.generic_test_verbosity_level_p(verbosity_level) ") + verbosity_level;
        SubLObject overall_result = $NOT_RUN;
        SubLObject test_runs = NIL;
        SubLObject stopP = NIL;
        if (NIL == stopP) {
            SubLObject csome_list_var = tables;
            SubLObject test_case_name = NIL;
            test_case_name = csome_list_var.first();
            while ((NIL == stopP) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject table_result = run_test_case_table(test_case_name, stream, verbosity_level, stop_at_first_failureP);
                final SubLObject partial_test_runs = thread.secondMultipleValue();
                thread.resetMultipleValues();
                test_runs = nconc(test_runs, partial_test_runs);
                overall_result = generic_test_result_update(overall_result, table_result);
                if ((NIL != generic_test_failure_result_p(overall_result)) && (NIL != stop_at_first_failureP)) {
                    stopP = T;
                }
                csome_list_var = csome_list_var.rest();
                test_case_name = csome_list_var.first();
            } 
        }
        return values(overall_result, test_runs);
    }

    public static final SubLObject generic_test_result_p_alt(SubLObject v_object) {
        return member(v_object, $generic_test_results$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject generic_test_result_p(final SubLObject v_object) {
        return member(v_object, $generic_test_results$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject generic_test_success_result_p_alt(SubLObject v_object) {
        return eq($SUCCESS, v_object);
    }

    public static SubLObject generic_test_success_result_p(final SubLObject v_object) {
        return eq($SUCCESS, v_object);
    }

    public static final SubLObject generic_test_failure_result_p_alt(SubLObject v_object) {
        return eq($FAILURE, v_object);
    }

    public static SubLObject generic_test_failure_result_p(final SubLObject v_object) {
        return eq($FAILURE, v_object);
    }

    public static final SubLObject generic_test_error_result_p_alt(SubLObject v_object) {
        return eq($ERROR, v_object);
    }

    public static SubLObject generic_test_error_result_p(final SubLObject v_object) {
        return eq($ERROR, v_object);
    }

    public static final SubLObject generic_test_not_run_result_p_alt(SubLObject v_object) {
        return eq($NOT_RUN, v_object);
    }

    public static SubLObject generic_test_not_run_result_p(final SubLObject v_object) {
        return eq($NOT_RUN, v_object);
    }

    public static final SubLObject generic_test_invalid_result_p_alt(SubLObject v_object) {
        return eq($INVALID, v_object);
    }

    public static SubLObject generic_test_invalid_result_p(final SubLObject v_object) {
        return eq($INVALID, v_object);
    }

    public static final SubLObject generic_test_verbosity_level_p_alt(SubLObject v_object) {
        return member(v_object, $generic_test_verbosity_levels$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject generic_test_verbosity_level_p(final SubLObject v_object) {
        return member(v_object, $generic_test_verbosity_levels$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static final SubLObject test_cases_of_class_alt(SubLObject v_class) {
        return gethash(v_class, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject test_cases_of_class(final SubLObject v_class) {
        return reverse(gethash(v_class, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED));
    }

    public static final SubLObject test_case_name_p_alt(SubLObject v_object) {
        return possibly_function_symbol_p(v_object);
    }

    public static SubLObject test_case_name_p(final SubLObject v_object) {
        return possibly_function_symbol_p(v_object);
    }

    public static final SubLObject possibly_function_symbol_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (!v_object.isKeyword()));
    }

    public static SubLObject possibly_function_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() && (!v_object.isKeyword()));
    }

    public static final SubLObject define_test_case_table_int_alt(SubLObject test_case_name, SubLObject v_properties, SubLObject tuples) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = v_properties;
                SubLObject current = datum;
                SubLObject allow_other_keys_p = NIL;
                SubLObject rest = current;
                SubLObject bad = NIL;
                SubLObject current_2 = NIL;
                for (; NIL != rest;) {
                    destructuring_bind_must_consp(rest, datum, $list_alt66);
                    current_2 = rest.first();
                    rest = rest.rest();
                    destructuring_bind_must_consp(rest, datum, $list_alt66);
                    if (NIL == member(current_2, $list_alt67, UNPROVIDED, UNPROVIDED)) {
                        bad = T;
                    }
                    if (current_2 == $ALLOW_OTHER_KEYS) {
                        allow_other_keys_p = rest.first();
                    }
                    rest = rest.rest();
                }
                if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                    cdestructuring_bind_error(datum, $list_alt66);
                }
                {
                    SubLObject owner_tail = property_list_member($OWNER, current);
                    SubLObject owner = (NIL != owner_tail) ? ((SubLObject) (cadr(owner_tail))) : NIL;
                    SubLObject test_tail = property_list_member($TEST, current);
                    SubLObject test = (NIL != test_tail) ? ((SubLObject) (cadr(test_tail))) : NIL;
                    SubLObject classes_tail = property_list_member($CLASSES, current);
                    SubLObject v_classes = (NIL != classes_tail) ? ((SubLObject) (cadr(classes_tail))) : NIL;
                    SubLObject kb_tail = property_list_member($KB, current);
                    SubLObject kb = (NIL != kb_tail) ? ((SubLObject) (cadr(kb_tail))) : NIL;
                    SubLObject workingP_tail = property_list_member($WORKING_, current);
                    SubLObject workingP = (NIL != workingP_tail) ? ((SubLObject) (cadr(workingP_tail))) : T;
                    SubLObject gtct = new_generic_test_case_table(test_case_name, tuples, test, owner, v_classes, kb, workingP);
                    SubLObject cdolist_list_var = v_classes;
                    SubLObject v_class = NIL;
                    for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                        sethash(v_class, $test_case_tables_by_class$.getGlobalValue(), adjoin(test_case_name, gethash(v_class, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED));
                    }
                    {
                        SubLObject item_var = test_case_name;
                        if (NIL == member(item_var, $ordered_test_cases$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                            {
                                SubLObject new_cons = cons(item_var, NIL);
                                SubLObject list = $ordered_test_cases$.getGlobalValue();
                                if (NIL != list) {
                                    subl_macros.rplacd_last(list, new_cons);
                                } else {
                                    $ordered_test_cases$.setGlobalValue(new_cons);
                                }
                            }
                        }
                    }
                    sethash(test_case_name, $test_case_table_index$.getGlobalValue(), gtct);
                    new_cyc_test($cyc_test_filename$.getDynamicValue(thread), gtct);
                    return test_case_name;
                }
            }
        }
    }

    public static SubLObject define_test_case_table_int(final SubLObject test_case_name, final SubLObject v_properties, final SubLObject tuples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = v_properties;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, v_properties, $list71);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, v_properties, $list71);
            if (NIL == member(current_$3, $list72, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(v_properties, $list71);
        }
        final SubLObject owner_tail = property_list_member($OWNER, v_properties);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject test_tail = property_list_member($TEST, v_properties);
        final SubLObject test = (NIL != test_tail) ? cadr(test_tail) : NIL;
        final SubLObject classes_tail = property_list_member($CLASSES, v_properties);
        final SubLObject v_classes = (NIL != classes_tail) ? cadr(classes_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, v_properties);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, v_properties);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        final SubLObject gtct = new_generic_test_case_table(test_case_name, tuples, test, owner, v_classes, kb, workingP);
        SubLObject cdolist_list_var = v_classes;
        SubLObject v_class = NIL;
        v_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(v_class, $test_case_tables_by_class$.getGlobalValue(), adjoin(test_case_name, gethash(v_class, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            v_class = cdolist_list_var.first();
        } 
        if (NIL == member(test_case_name, $ordered_test_cases$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            final SubLObject new_cons = cons(test_case_name, NIL);
            final SubLObject list = $ordered_test_cases$.getGlobalValue();
            if (NIL != list) {
                subl_macros.rplacd_last(list, new_cons);
            } else {
                $ordered_test_cases$.setGlobalValue(new_cons);
            }
        }
        sethash(test_case_name, $test_case_table_index$.getGlobalValue(), gtct);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), gtct);
        return test_case_name;
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static final SubLObject run_generic_test_case_int_alt(SubLObject stream, SubLObject test_case, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        {
            SubLObject name = gtct_name(test_case);
            if (NIL == run_test_case_tableP(test_case)) {
                return values($NOT_RUN, list(new_cyc_test_run($TCT, name, $NOT_RUN, NIL)));
            } else {
                {
                    SubLObject test = gtct_test(test_case);
                    SubLObject tuples = gtct_tuples(test_case);
                    SubLObject owner = gtct_owner(test_case);
                    return run_test_case_table_int(stream, name, test, tuples, owner, verbosity_level, stop_at_first_failureP);
                }
            }
        }
    }

    /**
     *
     *
     * @return 0 cyc-test-result-p
     * @return 1 list of cyc-test-run-p
     */
    @LispMethod(comment = "@return 0 cyc-test-result-p\r\n@return 1 list of cyc-test-run-p")
    public static SubLObject run_generic_test_case_int(final SubLObject stream, final SubLObject test_case, final SubLObject verbosity_level, final SubLObject stop_at_first_failureP) {
        final SubLObject name = gtct_name(test_case);
        if (NIL == run_test_case_tableP(test_case)) {
            return values($NOT_RUN, list(cyc_testing.new_cyc_test_run($TCT, name, $NOT_RUN, NIL)));
        }
        final SubLObject test = gtct_test(test_case);
        final SubLObject tuples = gtct_tuples(test_case);
        final SubLObject owner = gtct_owner(test_case);
        return run_test_case_table_int(stream, name, test, tuples, owner, verbosity_level, stop_at_first_failureP);
    }

    public static final SubLObject run_test_case_table_int_alt(SubLObject stream, SubLObject name, SubLObject test, SubLObject tuples, SubLObject owner, SubLObject verbosity_level, SubLObject stop_at_first_failureP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_result = $NOT_RUN;
                SubLObject test_runs = NIL;
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(verbosity_level == $POST_BUILD ? ((SubLObject) (NIL)) : $print_pretty$.getDynamicValue(thread), thread);
                        {
                            SubLObject stopP = NIL;
                            run_test_case_table_print_header(stream, name, verbosity_level);
                            {
                                SubLObject list_var = NIL;
                                SubLObject tuple = NIL;
                                SubLObject i = NIL;
                                for (list_var = tuples, tuple = list_var.first(), i = ZERO_INTEGER; !((NIL != stopP) || (NIL == list_var)); list_var = list_var.rest() , tuple = list_var.first() , i = number_utilities.f_1X(i)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject case_result = run_test_case_tuple_int(stream, name, i, tuple, test, verbosity_level);
                                        SubLObject test_run = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        test_runs = cons(test_run, test_runs);
                                        table_result = generic_test_result_update(table_result, case_result);
                                        if ((($FAILURE == table_result) || ($ERROR == table_result)) && (NIL != stop_at_first_failureP)) {
                                            stopP = T;
                                        }
                                    }
                                }
                            }
                            run_test_case_table_print_footer(stream, name, table_result, owner, verbosity_level);
                        }
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(table_result, nreverse(test_runs));
            }
        }
    }

    public static SubLObject run_test_case_table_int(final SubLObject stream, final SubLObject name, final SubLObject test, final SubLObject tuples, final SubLObject owner, final SubLObject verbosity_level, final SubLObject stop_at_first_failureP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table_result = $NOT_RUN;
        SubLObject test_runs = NIL;
        SubLObject time = NIL;
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(verbosity_level == $POST_BUILD ? NIL : $print_pretty$.getDynamicValue(thread), thread);
            SubLObject stopP = NIL;
            run_test_case_table_print_header(stream, name, verbosity_level);
            final SubLObject time_var = get_internal_real_time();
            SubLObject list_var = NIL;
            SubLObject tuple = NIL;
            SubLObject i = NIL;
            list_var = tuples;
            tuple = list_var.first();
            for (i = ZERO_INTEGER; (NIL == stopP) && (NIL != list_var); list_var = list_var.rest() , tuple = list_var.first() , i = number_utilities.f_1X(i)) {
                thread.resetMultipleValues();
                final SubLObject case_result = run_test_case_tuple_int(stream, name, i, tuple, test, verbosity_level);
                final SubLObject test_run = thread.secondMultipleValue();
                thread.resetMultipleValues();
                test_runs = cons(test_run, test_runs);
                table_result = generic_test_result_update(table_result, case_result);
                if ((($FAILURE == table_result) || ($ERROR == table_result)) && (NIL != stop_at_first_failureP)) {
                    stopP = T;
                }
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            run_test_case_table_print_footer(stream, name, table_result, time, owner, verbosity_level);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return values(table_result, nreverse(test_runs));
    }

    /**
     *
     *
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@see run-inference-unit-test?")
    public static final SubLObject run_test_case_tableP_alt(SubLObject test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_kb = gtct_kb(test_case);
                if (NIL == inference_testing.kb_matches_expectationsP(test_kb, $run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
                    return NIL;
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @see run-inference-unit-test?
     */
    @LispMethod(comment = "@see run-inference-unit-test?")
    public static SubLObject run_test_case_tableP(final SubLObject test_case) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = gtct_kb(test_case);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject run_test_case_tuple_int_alt(SubLObject stream, SubLObject table_name, SubLObject i, SubLObject tuple, SubLObject test, SubLObject verbosity_level) {
        {
            SubLObject test_result = $NOT_RUN;
            SubLObject time = NIL;
            if (NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
                test_result = $INVALID;
            } else {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject input_args = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    input_args = current.first();
                    current = current.rest();
                    {
                        SubLObject expected_results = current;
                        SubLObject form_to_eval = cons(table_name, Mapping.mapcar(symbol_function(QUOTIFY), input_args));
                        run_test_case_tuple_print_header(stream, form_to_eval, expected_results, verbosity_level);
                        {
                            SubLObject expected_result_count = length(expected_results);
                            SubLObject error_message = NIL;
                            SubLObject all_actual_results = NIL;
                            SubLObject actual_results = NIL;
                            SubLObject time_var = get_internal_real_time();
                            try {
                                {
                                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                    try {
                                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                        try {
                                            all_actual_results = arg2(resetMultipleValues(), multiple_value_list(apply(table_name, input_args)));
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        rebind(Errors.$error_handler$, _prev_bind_0);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            }
                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            if (NIL != error_message) {
                                actual_results = error_message;
                                test_result = $ERROR;
                            } else {
                                actual_results = list_utilities.first_n(expected_result_count, all_actual_results);
                                test_result = determine_run_test_case_tuple_result(expected_results, actual_results, test);
                            }
                            run_test_case_tuple_print_footer(stream, test_result, actual_results, test, verbosity_level);
                        }
                    }
                }
            }
            {
                SubLObject tuple_name = list(table_name, i);
                SubLObject test_run = new_cyc_test_run($TCT, tuple_name, test_result, time);
                return values(test_result, test_run);
            }
        }
    }

    public static SubLObject run_test_case_tuple_int(final SubLObject stream, final SubLObject table_name, final SubLObject i, final SubLObject tuple, final SubLObject test, final SubLObject verbosity_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject test_result = $NOT_RUN;
        SubLObject time = NIL;
        SubLObject input_args = NIL;
        destructuring_bind_must_consp(tuple, tuple, $list74);
        input_args = tuple.first();
        final SubLObject expected_results;
        final SubLObject current = expected_results = tuple.rest();
        if (NIL != generic_test_case_table_tuple_mentions_invalid_constantP(tuple)) {
            test_result = $INVALID;
        } else {
            final SubLObject form_to_eval = cons(table_name, Mapping.mapcar(symbol_function(QUOTIFY), input_args));
            run_test_case_tuple_print_header(stream, form_to_eval, expected_results, verbosity_level);
            final SubLObject expected_result_count = length(expected_results);
            SubLObject error_message = NIL;
            SubLObject all_actual_results = NIL;
            SubLObject actual_results = NIL;
            final SubLObject time_var = get_internal_real_time();
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        all_actual_results = arg2(thread.resetMultipleValues(), multiple_value_list(apply(table_name, input_args)));
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            if (NIL != error_message) {
                actual_results = error_message;
                test_result = $ERROR;
            } else {
                actual_results = list_utilities.first_n(expected_result_count, all_actual_results);
                test_result = determine_run_test_case_tuple_result(expected_results, actual_results, test);
            }
            run_test_case_tuple_print_footer(stream, test_result, actual_results, test, time, verbosity_level);
        }
        final SubLObject tuple_name = (NIL != $debug_test_case_tablesP$.getDynamicValue(thread)) ? bq_cons(table_name, Mapping.mapcar(QUOTIFY, input_args)) : list(table_name, i);
        final SubLObject test_run = cyc_testing.new_cyc_test_run($TCT, tuple_name, test_result, time);
        return values(test_result, test_run);
    }

    public static final SubLObject determine_run_test_case_tuple_result_alt(SubLObject expected_results, SubLObject actual_results, SubLObject test) {
        {
            SubLObject rest_expected_results = NIL;
            SubLObject rest_actual_results = NIL;
            for (rest_expected_results = expected_results, rest_actual_results = actual_results; !((NIL == rest_expected_results) || (NIL == rest_actual_results)); rest_expected_results = rest_expected_results.rest() , rest_actual_results = rest_actual_results.rest()) {
                {
                    SubLObject expected_result = rest_expected_results.first();
                    SubLObject actual_result = rest_actual_results.first();
                    if (NIL == funcall(test, actual_result, expected_result)) {
                        return $FAILURE;
                    }
                }
            }
            return $SUCCESS;
        }
    }

    public static SubLObject determine_run_test_case_tuple_result(final SubLObject expected_results, final SubLObject actual_results, final SubLObject test) {
        SubLObject rest_expected_results;
        SubLObject rest_actual_results;
        SubLObject expected_result;
        SubLObject actual_result;
        for (rest_expected_results = NIL, rest_actual_results = NIL, rest_expected_results = expected_results, rest_actual_results = actual_results; (NIL != rest_expected_results) && (NIL != rest_actual_results); rest_expected_results = rest_expected_results.rest() , rest_actual_results = rest_actual_results.rest()) {
            expected_result = rest_expected_results.first();
            actual_result = rest_actual_results.first();
            if (NIL == funcall(test, actual_result, expected_result)) {
                return $FAILURE;
            }
        }
        return $SUCCESS;
    }

    public static final SubLObject generic_test_result_update_alt(SubLObject overall_result, SubLObject test_result) {
        {
            SubLObject pcase_var = overall_result;
            if (pcase_var.eql($NOT_RUN)) {
                return test_result;
            } else {
                if (pcase_var.eql($INVALID)) {
                    return test_result;
                } else {
                    if (pcase_var.eql($ERROR)) {
                        return $ERROR;
                    } else {
                        if (pcase_var.eql($FAILURE)) {
                            return $FAILURE;
                        } else {
                            if (pcase_var.eql($SUCCESS)) {
                                {
                                    SubLObject pcase_var_3 = test_result;
                                    if (pcase_var_3.eql($ERROR)) {
                                        return $ERROR;
                                    } else {
                                        if (pcase_var_3.eql($FAILURE)) {
                                            return $FAILURE;
                                        } else {
                                            return $SUCCESS;
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

    public static SubLObject generic_test_result_update(final SubLObject overall_result, final SubLObject test_result) {
        if (overall_result.eql($NOT_RUN)) {
            return test_result;
        }
        if (overall_result.eql($INVALID)) {
            return test_result;
        }
        if (overall_result.eql($ERROR)) {
            return $ERROR;
        }
        if (overall_result.eql($FAILURE)) {
            return $FAILURE;
        }
        if (!overall_result.eql($SUCCESS)) {
            return NIL;
        }
        if (test_result.eql($ERROR)) {
            return $ERROR;
        }
        if (test_result.eql($FAILURE)) {
            return $FAILURE;
        }
        return $SUCCESS;
    }

    public static final SubLObject get_gtct_by_name_alt(SubLObject name) {
        return gethash(name, $test_case_table_index$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject get_gtct_by_name(final SubLObject name) {
        return gethash(name, $test_case_table_index$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject test_case_classes_alt(SubLObject name) {
        {
            SubLObject gtct = get_gtct_by_name(name);
            if (NIL != gtct) {
                return gtct_classes(get_gtct_by_name(name));
            }
        }
        return NIL;
    }

    public static SubLObject test_case_classes(final SubLObject name) {
        final SubLObject gtct = get_gtct_by_name(name);
        if (NIL != gtct) {
            return gtct_classes(get_gtct_by_name(name));
        }
        return NIL;
    }

    public static final SubLObject run_test_case_table_print_header_alt(SubLObject stream, SubLObject name, SubLObject verbosity_level) {
        {
            SubLObject pcase_var = verbosity_level;
            if (pcase_var.eql($TERSE)) {
                format(stream, $str_alt72$_S____, name);
                force_output(stream);
            } else {
                if (pcase_var.eql($VERBOSE)) {
                    format(stream, $str_alt73$Starting__S______, name);
                    force_output(stream);
                }
            }
        }
        return NIL;
    }

    public static SubLObject run_test_case_table_print_header(final SubLObject stream, final SubLObject name, final SubLObject verbosity_level) {
        if (verbosity_level.eql($TERSE)) {
            format(stream, $str77$_TCT__S____, name);
            force_output(stream);
        } else
            if (verbosity_level.eql($VERBOSE)) {
                format(stream, $str78$Starting__TCT__S______, name);
                force_output(stream);
            }

        return NIL;
    }

    public static final SubLObject run_test_case_table_print_footer(SubLObject stream, SubLObject name, SubLObject table_result, SubLObject owner, SubLObject verbosity_level) {
        {
            SubLObject pcase_var = verbosity_level;
            if (pcase_var.eql($TERSE)) {
                format(stream, $str_alt74$_S__, table_result);
                force_output(stream);
            } else {
                if (pcase_var.eql($POST_BUILD)) {
                    format(stream, $str_alt75$_S__S__S__OWNER__S__, new SubLObject[]{ table_result, $test_case_table_post_build_token$.getGlobalValue(), name, owner });
                    force_output(stream);
                } else {
                    if (pcase_var.eql($VERBOSE)) {
                        format(stream, $str_alt76$__Overall_result_for__S___S__, name, table_result);
                        if ((NIL != owner) && (($FAILURE == table_result) || ($ERROR == table_result))) {
                            format(stream, $str_alt77$Please_notify__a_cyc_com_, owner);
                        }
                        force_output(stream);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject run_test_case_table_print_footer(final SubLObject stream, final SubLObject name, final SubLObject table_result, final SubLObject time, final SubLObject owner, final SubLObject verbosity_level) {
        if (verbosity_level.eql($TERSE)) {
            format(stream, $str79$_S____3f___, table_result, time);
            force_output(stream);
        } else
            if (verbosity_level.eql($POST_BUILD)) {
                cyc_testing.print_post_build_test_summary(stream, table_result, $test_case_table_post_build_token$.getGlobalValue(), name, time, owner);
            } else
                if (verbosity_level.eql($VERBOSE)) {
                    format(stream, $str80$__Overall_result_for___S___S__, name, table_result);
                    if ((NIL != owner) && (($FAILURE == table_result) || ($ERROR == table_result))) {
                        format(stream, $str81$Please_notify__a_cyc_com_, owner);
                    }
                    force_output(stream);
                }


        return NIL;
    }

    public static final SubLObject run_test_case_tuple_print_header_alt(SubLObject stream, SubLObject form_to_eval, SubLObject expected_results, SubLObject verbosity_level) {
        if ($VERBOSE == verbosity_level) {
            if (NIL != list_utilities.singletonP(expected_results)) {
                format(stream, $str_alt78$__Input___s____Expected_result___, form_to_eval, expected_results.first());
            } else {
                format(stream, $str_alt79$__Input___s____Expected_results__, form_to_eval, expected_results);
            }
            force_output(stream);
        }
        return NIL;
    }

    public static SubLObject run_test_case_tuple_print_header(final SubLObject stream, final SubLObject form_to_eval, final SubLObject expected_results, final SubLObject verbosity_level) {
        if ($VERBOSE == verbosity_level) {
            if (NIL != list_utilities.singletonP(expected_results)) {
                format(stream, $str82$__Input___s____Expected_result___, form_to_eval, expected_results.first());
            } else {
                format(stream, $str83$__Input___s____Expected_results__, form_to_eval, expected_results);
            }
            force_output(stream);
        }
        return NIL;
    }

    public static final SubLObject run_test_case_tuple_print_footer(SubLObject stream, SubLObject test_result, SubLObject actual_results, SubLObject test, SubLObject verbosity_level) {
        {
            SubLObject pcase_var = test_result;
            if (pcase_var.eql($SUCCESS)) {
                if ($VERBOSE == verbosity_level) {
                    format(stream, $str_alt80$__________SUCCESS__);
                    force_output(stream);
                }
            } else {
                if (pcase_var.eql($ERROR)) {
                    if ($VERBOSE == verbosity_level) {
                        format(stream, $str_alt81$__________ERROR__S__, actual_results);
                        force_output(stream);
                    }
                } else {
                    if ($VERBOSE == verbosity_level) {
                        if (NIL != list_utilities.singletonP(actual_results)) {
                            format(stream, $str_alt82$____Actual_result___s____Compared, actual_results.first(), test);
                        } else {
                            format(stream, $str_alt83$____Actual_results___s____Compare, actual_results, test);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject run_test_case_tuple_print_footer(final SubLObject stream, final SubLObject test_result, final SubLObject actual_results, final SubLObject test, final SubLObject time, final SubLObject verbosity_level) {
        if (test_result.eql($SUCCESS)) {
            if ($VERBOSE == verbosity_level) {
                format(stream, $str84$__________SUCCESS___S___, time);
                force_output(stream);
            }
        } else
            if (test_result.eql($ERROR)) {
                if ($VERBOSE == verbosity_level) {
                    format(stream, $str85$__________ERROR__S___S___, actual_results, time);
                    force_output(stream);
                }
            } else
                if ($VERBOSE == verbosity_level) {
                    if (NIL != list_utilities.singletonP(actual_results)) {
                        format(stream, $str86$____Actual_result___s____Compared, new SubLObject[]{ actual_results.first(), test, time });
                    } else {
                        format(stream, $str87$____Actual_results___s____Compare, new SubLObject[]{ actual_results, test, time });
                    }
                }


        return NIL;
    }

    public static final SubLObject cfasl_output_object_generic_test_case_table_method_alt(SubLObject v_object, SubLObject stream) {
        cfasl_wide_output_generic_test_case_table(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_output_object_generic_test_case_table_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_generic_test_case_table(v_object, stream);
        return v_object;
    }

    public static final SubLObject cfasl_wide_output_generic_test_case_table_alt(SubLObject tct, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), stream);
        cfasl_output_generic_test_case_table(tct, stream);
        return tct;
    }

    public static SubLObject cfasl_wide_output_generic_test_case_table(final SubLObject tct, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), stream);
        cfasl_output_generic_test_case_table(tct, stream);
        return tct;
    }

    public static final SubLObject cfasl_output_generic_test_case_table_alt(SubLObject tct, SubLObject stream) {
        cfasl_output(gtct_name(tct), stream);
        cfasl_output(gtct_tuples(tct), stream);
        cfasl_output(hash_table_utilities.hash_test_to_symbol(gtct_test(tct)), stream);
        cfasl_output(gtct_owner(tct), stream);
        cfasl_output(gtct_classes(tct), stream);
        cfasl_output(gtct_kb(tct), stream);
        cfasl_output(gtct_workingP(tct), stream);
        return tct;
    }

    public static SubLObject cfasl_output_generic_test_case_table(final SubLObject tct, final SubLObject stream) {
        cfasl_output(gtct_name(tct), stream);
        cfasl_output(gtct_tuples(tct), stream);
        cfasl_output(hash_table_utilities.hash_test_to_symbol(gtct_test(tct)), stream);
        cfasl_output(gtct_owner(tct), stream);
        cfasl_output(gtct_classes(tct), stream);
        cfasl_output(gtct_kb(tct), stream);
        cfasl_output(gtct_workingP(tct), stream);
        return tct;
    }

    public static final SubLObject cfasl_input_generic_test_case_table_alt(SubLObject stream) {
        {
            SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject tuples = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject test = symbol_function(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
            SubLObject owner = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject v_classes = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject kb = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject working_p = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return new_generic_test_case_table(name, tuples, test, owner, v_classes, kb, working_p);
        }
    }

    public static SubLObject cfasl_input_generic_test_case_table(final SubLObject stream) {
        final SubLObject name = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject tuples = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject test = symbol_function(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        final SubLObject owner = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject v_classes = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject kb = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject working_p = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_generic_test_case_table(name, tuples, test, owner, v_classes, kb, working_p);
    }

    public static final SubLObject declare_generic_testing_file_alt() {
        declareFunction("all_generic_test_cases", "ALL-GENERIC-TEST-CASES", 0, 0, false);
        declareFunction("generic_test_case_table_print_function_trampoline", "GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("generic_test_case_table_p", "GENERIC-TEST-CASE-TABLE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_p$UnaryFunction();
        declareFunction("gtct_name", "GTCT-NAME", 1, 0, false);
        declareFunction("gtct_tuples", "GTCT-TUPLES", 1, 0, false);
        declareFunction("gtct_test", "GTCT-TEST", 1, 0, false);
        declareFunction("gtct_owner", "GTCT-OWNER", 1, 0, false);
        declareFunction("gtct_classes", "GTCT-CLASSES", 1, 0, false);
        declareFunction("gtct_kb", "GTCT-KB", 1, 0, false);
        declareFunction("gtct_workingP", "GTCT-WORKING?", 1, 0, false);
        declareFunction("_csetf_gtct_name", "_CSETF-GTCT-NAME", 2, 0, false);
        declareFunction("_csetf_gtct_tuples", "_CSETF-GTCT-TUPLES", 2, 0, false);
        declareFunction("_csetf_gtct_test", "_CSETF-GTCT-TEST", 2, 0, false);
        declareFunction("_csetf_gtct_owner", "_CSETF-GTCT-OWNER", 2, 0, false);
        declareFunction("_csetf_gtct_classes", "_CSETF-GTCT-CLASSES", 2, 0, false);
        declareFunction("_csetf_gtct_kb", "_CSETF-GTCT-KB", 2, 0, false);
        declareFunction("_csetf_gtct_workingP", "_CSETF-GTCT-WORKING?", 2, 0, false);
        declareFunction("make_generic_test_case_table", "MAKE-GENERIC-TEST-CASE-TABLE", 0, 1, false);
        declareFunction("new_generic_test_case_table", "NEW-GENERIC-TEST-CASE-TABLE", 4, 3, false);
        declareFunction("generic_test_case_table_name", "GENERIC-TEST-CASE-TABLE-NAME", 1, 0, false);
        declareFunction("generic_test_case_table_tuples", "GENERIC-TEST-CASE-TABLE-TUPLES", 1, 0, false);
        declareFunction("generic_test_case_table_kb", "GENERIC-TEST-CASE-TABLE-KB", 1, 0, false);
        declareFunction("generic_test_case_table_owner", "GENERIC-TEST-CASE-TABLE-OWNER", 1, 0, false);
        declareFunction("generic_test_case_table_workingP", "GENERIC-TEST-CASE-TABLE-WORKING?", 1, 0, false);
        declareFunction("generic_test_case_table_comment", "GENERIC-TEST-CASE-TABLE-COMMENT", 1, 0, false);
        declareFunction("generic_test_case_table_tuples_mentioning_some_invalid_constant", "GENERIC-TEST-CASE-TABLE-TUPLES-MENTIONING-SOME-INVALID-CONSTANT", 1, 0, false);
        declareFunction("generic_test_case_table_tuple_mentions_invalid_constantP", "GENERIC-TEST-CASE-TABLE-TUPLE-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareMacro("define_test_case_table", "DEFINE-TEST-CASE-TABLE");
        declareFunction("undefine_test_case_table", "UNDEFINE-TEST-CASE-TABLE", 1, 0, false);
        declareFunction("undefine_all_test_case_tables", "UNDEFINE-ALL-TEST-CASE-TABLES", 0, 0, false);
        declareFunction("run_test_case_table", "RUN-TEST-CASE-TABLE", 1, 3, false);
        declareFunction("run_all_test_case_tables", "RUN-ALL-TEST-CASE-TABLES", 0, 5, false);
        declareFunction("run_test_case_tables_of_class", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
        declareFunction("run_test_case_tables", "RUN-TEST-CASE-TABLES", 1, 3, false);
        declareFunction("generic_test_result_p", "GENERIC-TEST-RESULT-P", 1, 0, false);
        declareFunction("generic_test_success_result_p", "GENERIC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("generic_test_failure_result_p", "GENERIC-TEST-FAILURE-RESULT-P", 1, 0, false);
        declareFunction("generic_test_error_result_p", "GENERIC-TEST-ERROR-RESULT-P", 1, 0, false);
        declareFunction("generic_test_not_run_result_p", "GENERIC-TEST-NOT-RUN-RESULT-P", 1, 0, false);
        declareFunction("generic_test_invalid_result_p", "GENERIC-TEST-INVALID-RESULT-P", 1, 0, false);
        declareFunction("generic_test_verbosity_level_p", "GENERIC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        declareFunction("test_cases_of_class", "TEST-CASES-OF-CLASS", 1, 0, false);
        declareFunction("test_case_name_p", "TEST-CASE-NAME-P", 1, 0, false);
        declareFunction("possibly_function_symbol_p", "POSSIBLY-FUNCTION-SYMBOL-P", 1, 0, false);
        declareFunction("define_test_case_table_int", "DEFINE-TEST-CASE-TABLE-INT", 3, 0, false);
        declareFunction("run_generic_test_case_int", "RUN-GENERIC-TEST-CASE-INT", 4, 0, false);
        declareFunction("run_test_case_table_int", "RUN-TEST-CASE-TABLE-INT", 7, 0, false);
        declareFunction("run_test_case_tableP", "RUN-TEST-CASE-TABLE?", 1, 0, false);
        declareFunction("run_test_case_tuple_int", "RUN-TEST-CASE-TUPLE-INT", 6, 0, false);
        declareFunction("determine_run_test_case_tuple_result", "DETERMINE-RUN-TEST-CASE-TUPLE-RESULT", 3, 0, false);
        declareFunction("generic_test_result_update", "GENERIC-TEST-RESULT-UPDATE", 2, 0, false);
        declareFunction("get_gtct_by_name", "GET-GTCT-BY-NAME", 1, 0, false);
        declareFunction("test_case_classes", "TEST-CASE-CLASSES", 1, 0, false);
        declareFunction("run_test_case_table_print_header", "RUN-TEST-CASE-TABLE-PRINT-HEADER", 3, 0, false);
        declareFunction("run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 5, 0, false);
        declareFunction("run_test_case_tuple_print_header", "RUN-TEST-CASE-TUPLE-PRINT-HEADER", 4, 0, false);
        declareFunction("run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 5, 0, false);
        declareFunction("cfasl_output_object_generic_test_case_table_method", "CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_generic_test_case_table", "CFASL-WIDE-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        declareFunction("cfasl_output_generic_test_case_table", "CFASL-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        declareFunction("cfasl_input_generic_test_case_table", "CFASL-INPUT-GENERIC-TEST-CASE-TABLE", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_generic_testing_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("all_generic_test_cases", "ALL-GENERIC-TEST-CASES", 0, 0, false);
            declareFunction("generic_test_case_table_print_function_trampoline", "GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("generic_test_case_table_p", "GENERIC-TEST-CASE-TABLE-P", 1, 0, false);
            new generic_testing.$generic_test_case_table_p$UnaryFunction();
            declareFunction("gtct_name", "GTCT-NAME", 1, 0, false);
            declareFunction("gtct_tuples", "GTCT-TUPLES", 1, 0, false);
            declareFunction("gtct_test", "GTCT-TEST", 1, 0, false);
            declareFunction("gtct_owner", "GTCT-OWNER", 1, 0, false);
            declareFunction("gtct_classes", "GTCT-CLASSES", 1, 0, false);
            declareFunction("gtct_kb", "GTCT-KB", 1, 0, false);
            declareFunction("gtct_workingP", "GTCT-WORKING?", 1, 0, false);
            declareFunction("_csetf_gtct_name", "_CSETF-GTCT-NAME", 2, 0, false);
            declareFunction("_csetf_gtct_tuples", "_CSETF-GTCT-TUPLES", 2, 0, false);
            declareFunction("_csetf_gtct_test", "_CSETF-GTCT-TEST", 2, 0, false);
            declareFunction("_csetf_gtct_owner", "_CSETF-GTCT-OWNER", 2, 0, false);
            declareFunction("_csetf_gtct_classes", "_CSETF-GTCT-CLASSES", 2, 0, false);
            declareFunction("_csetf_gtct_kb", "_CSETF-GTCT-KB", 2, 0, false);
            declareFunction("_csetf_gtct_workingP", "_CSETF-GTCT-WORKING?", 2, 0, false);
            declareFunction("make_generic_test_case_table", "MAKE-GENERIC-TEST-CASE-TABLE", 0, 1, false);
            declareFunction("visit_defstruct_generic_test_case_table", "VISIT-DEFSTRUCT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
            declareFunction("visit_defstruct_object_generic_test_case_table_method", "VISIT-DEFSTRUCT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
            declareFunction("new_generic_test_case_table", "NEW-GENERIC-TEST-CASE-TABLE", 4, 3, false);
            declareFunction("generic_test_case_table_name", "GENERIC-TEST-CASE-TABLE-NAME", 1, 0, false);
            declareFunction("generic_test_case_table_tuples", "GENERIC-TEST-CASE-TABLE-TUPLES", 1, 0, false);
            declareFunction("generic_test_case_table_kb", "GENERIC-TEST-CASE-TABLE-KB", 1, 0, false);
            declareFunction("generic_test_case_table_owner", "GENERIC-TEST-CASE-TABLE-OWNER", 1, 0, false);
            declareFunction("generic_test_case_table_workingP", "GENERIC-TEST-CASE-TABLE-WORKING?", 1, 0, false);
            declareFunction("generic_test_case_table_comment", "GENERIC-TEST-CASE-TABLE-COMMENT", 1, 0, false);
            declareFunction("generic_test_case_table_tuples_mentioning_some_invalid_constant", "GENERIC-TEST-CASE-TABLE-TUPLES-MENTIONING-SOME-INVALID-CONSTANT", 1, 0, false);
            declareFunction("generic_test_case_table_tuples_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLES-INVALID-CONSTANTS", 1, 0, false);
            declareFunction("generic_test_case_table_tuple_mentions_invalid_constantP", "GENERIC-TEST-CASE-TABLE-TUPLE-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
            declareFunction("generic_test_case_table_tuple_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLE-INVALID-CONSTANTS", 1, 0, false);
            declareMacro("define_test_case_table", "DEFINE-TEST-CASE-TABLE");
            declareFunction("undefine_test_case_table", "UNDEFINE-TEST-CASE-TABLE", 1, 0, false);
            declareFunction("undefine_all_test_case_tables", "UNDEFINE-ALL-TEST-CASE-TABLES", 0, 0, false);
            declareFunction("run_test_case_table", "RUN-TEST-CASE-TABLE", 1, 3, false);
            declareFunction("run_all_test_case_tables", "RUN-ALL-TEST-CASE-TABLES", 0, 5, false);
            declareFunction("run_test_case_tables_of_class", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
            declareFunction("run_test_case_tables", "RUN-TEST-CASE-TABLES", 1, 3, false);
            declareFunction("generic_test_result_p", "GENERIC-TEST-RESULT-P", 1, 0, false);
            declareFunction("generic_test_success_result_p", "GENERIC-TEST-SUCCESS-RESULT-P", 1, 0, false);
            declareFunction("generic_test_failure_result_p", "GENERIC-TEST-FAILURE-RESULT-P", 1, 0, false);
            declareFunction("generic_test_error_result_p", "GENERIC-TEST-ERROR-RESULT-P", 1, 0, false);
            declareFunction("generic_test_not_run_result_p", "GENERIC-TEST-NOT-RUN-RESULT-P", 1, 0, false);
            declareFunction("generic_test_invalid_result_p", "GENERIC-TEST-INVALID-RESULT-P", 1, 0, false);
            declareFunction("generic_test_verbosity_level_p", "GENERIC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
            declareFunction("test_cases_of_class", "TEST-CASES-OF-CLASS", 1, 0, false);
            declareFunction("test_case_name_p", "TEST-CASE-NAME-P", 1, 0, false);
            declareFunction("possibly_function_symbol_p", "POSSIBLY-FUNCTION-SYMBOL-P", 1, 0, false);
            declareFunction("define_test_case_table_int", "DEFINE-TEST-CASE-TABLE-INT", 3, 0, false);
            declareFunction("run_generic_test_case_int", "RUN-GENERIC-TEST-CASE-INT", 4, 0, false);
            declareFunction("run_test_case_table_int", "RUN-TEST-CASE-TABLE-INT", 7, 0, false);
            declareFunction("run_test_case_tableP", "RUN-TEST-CASE-TABLE?", 1, 0, false);
            declareFunction("run_test_case_tuple_int", "RUN-TEST-CASE-TUPLE-INT", 6, 0, false);
            declareFunction("determine_run_test_case_tuple_result", "DETERMINE-RUN-TEST-CASE-TUPLE-RESULT", 3, 0, false);
            declareFunction("generic_test_result_update", "GENERIC-TEST-RESULT-UPDATE", 2, 0, false);
            declareFunction("get_gtct_by_name", "GET-GTCT-BY-NAME", 1, 0, false);
            declareFunction("test_case_classes", "TEST-CASE-CLASSES", 1, 0, false);
            declareFunction("run_test_case_table_print_header", "RUN-TEST-CASE-TABLE-PRINT-HEADER", 3, 0, false);
            declareFunction("run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 6, 0, false);
            declareFunction("run_test_case_tuple_print_header", "RUN-TEST-CASE-TUPLE-PRINT-HEADER", 4, 0, false);
            declareFunction("run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 6, 0, false);
            declareFunction("cfasl_output_object_generic_test_case_table_method", "CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
            declareFunction("cfasl_wide_output_generic_test_case_table", "CFASL-WIDE-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
            declareFunction("cfasl_output_generic_test_case_table", "CFASL-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
            declareFunction("cfasl_input_generic_test_case_table", "CFASL-INPUT-GENERIC-TEST-CASE-TABLE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 5, 0, false);
            declareFunction("run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 5, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_generic_testing_file_Previous() {
        declareFunction("all_generic_test_cases", "ALL-GENERIC-TEST-CASES", 0, 0, false);
        declareFunction("generic_test_case_table_print_function_trampoline", "GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("generic_test_case_table_p", "GENERIC-TEST-CASE-TABLE-P", 1, 0, false);
        new generic_testing.$generic_test_case_table_p$UnaryFunction();
        declareFunction("gtct_name", "GTCT-NAME", 1, 0, false);
        declareFunction("gtct_tuples", "GTCT-TUPLES", 1, 0, false);
        declareFunction("gtct_test", "GTCT-TEST", 1, 0, false);
        declareFunction("gtct_owner", "GTCT-OWNER", 1, 0, false);
        declareFunction("gtct_classes", "GTCT-CLASSES", 1, 0, false);
        declareFunction("gtct_kb", "GTCT-KB", 1, 0, false);
        declareFunction("gtct_workingP", "GTCT-WORKING?", 1, 0, false);
        declareFunction("_csetf_gtct_name", "_CSETF-GTCT-NAME", 2, 0, false);
        declareFunction("_csetf_gtct_tuples", "_CSETF-GTCT-TUPLES", 2, 0, false);
        declareFunction("_csetf_gtct_test", "_CSETF-GTCT-TEST", 2, 0, false);
        declareFunction("_csetf_gtct_owner", "_CSETF-GTCT-OWNER", 2, 0, false);
        declareFunction("_csetf_gtct_classes", "_CSETF-GTCT-CLASSES", 2, 0, false);
        declareFunction("_csetf_gtct_kb", "_CSETF-GTCT-KB", 2, 0, false);
        declareFunction("_csetf_gtct_workingP", "_CSETF-GTCT-WORKING?", 2, 0, false);
        declareFunction("make_generic_test_case_table", "MAKE-GENERIC-TEST-CASE-TABLE", 0, 1, false);
        declareFunction("visit_defstruct_generic_test_case_table", "VISIT-DEFSTRUCT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        declareFunction("visit_defstruct_object_generic_test_case_table_method", "VISIT-DEFSTRUCT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
        declareFunction("new_generic_test_case_table", "NEW-GENERIC-TEST-CASE-TABLE", 4, 3, false);
        declareFunction("generic_test_case_table_name", "GENERIC-TEST-CASE-TABLE-NAME", 1, 0, false);
        declareFunction("generic_test_case_table_tuples", "GENERIC-TEST-CASE-TABLE-TUPLES", 1, 0, false);
        declareFunction("generic_test_case_table_kb", "GENERIC-TEST-CASE-TABLE-KB", 1, 0, false);
        declareFunction("generic_test_case_table_owner", "GENERIC-TEST-CASE-TABLE-OWNER", 1, 0, false);
        declareFunction("generic_test_case_table_workingP", "GENERIC-TEST-CASE-TABLE-WORKING?", 1, 0, false);
        declareFunction("generic_test_case_table_comment", "GENERIC-TEST-CASE-TABLE-COMMENT", 1, 0, false);
        declareFunction("generic_test_case_table_tuples_mentioning_some_invalid_constant", "GENERIC-TEST-CASE-TABLE-TUPLES-MENTIONING-SOME-INVALID-CONSTANT", 1, 0, false);
        declareFunction("generic_test_case_table_tuples_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLES-INVALID-CONSTANTS", 1, 0, false);
        declareFunction("generic_test_case_table_tuple_mentions_invalid_constantP", "GENERIC-TEST-CASE-TABLE-TUPLE-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction("generic_test_case_table_tuple_invalid_constants", "GENERIC-TEST-CASE-TABLE-TUPLE-INVALID-CONSTANTS", 1, 0, false);
        declareMacro("define_test_case_table", "DEFINE-TEST-CASE-TABLE");
        declareFunction("undefine_test_case_table", "UNDEFINE-TEST-CASE-TABLE", 1, 0, false);
        declareFunction("undefine_all_test_case_tables", "UNDEFINE-ALL-TEST-CASE-TABLES", 0, 0, false);
        declareFunction("run_test_case_table", "RUN-TEST-CASE-TABLE", 1, 3, false);
        declareFunction("run_all_test_case_tables", "RUN-ALL-TEST-CASE-TABLES", 0, 5, false);
        declareFunction("run_test_case_tables_of_class", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
        declareFunction("run_test_case_tables", "RUN-TEST-CASE-TABLES", 1, 3, false);
        declareFunction("generic_test_result_p", "GENERIC-TEST-RESULT-P", 1, 0, false);
        declareFunction("generic_test_success_result_p", "GENERIC-TEST-SUCCESS-RESULT-P", 1, 0, false);
        declareFunction("generic_test_failure_result_p", "GENERIC-TEST-FAILURE-RESULT-P", 1, 0, false);
        declareFunction("generic_test_error_result_p", "GENERIC-TEST-ERROR-RESULT-P", 1, 0, false);
        declareFunction("generic_test_not_run_result_p", "GENERIC-TEST-NOT-RUN-RESULT-P", 1, 0, false);
        declareFunction("generic_test_invalid_result_p", "GENERIC-TEST-INVALID-RESULT-P", 1, 0, false);
        declareFunction("generic_test_verbosity_level_p", "GENERIC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
        declareFunction("test_cases_of_class", "TEST-CASES-OF-CLASS", 1, 0, false);
        declareFunction("test_case_name_p", "TEST-CASE-NAME-P", 1, 0, false);
        declareFunction("possibly_function_symbol_p", "POSSIBLY-FUNCTION-SYMBOL-P", 1, 0, false);
        declareFunction("define_test_case_table_int", "DEFINE-TEST-CASE-TABLE-INT", 3, 0, false);
        declareFunction("run_generic_test_case_int", "RUN-GENERIC-TEST-CASE-INT", 4, 0, false);
        declareFunction("run_test_case_table_int", "RUN-TEST-CASE-TABLE-INT", 7, 0, false);
        declareFunction("run_test_case_tableP", "RUN-TEST-CASE-TABLE?", 1, 0, false);
        declareFunction("run_test_case_tuple_int", "RUN-TEST-CASE-TUPLE-INT", 6, 0, false);
        declareFunction("determine_run_test_case_tuple_result", "DETERMINE-RUN-TEST-CASE-TUPLE-RESULT", 3, 0, false);
        declareFunction("generic_test_result_update", "GENERIC-TEST-RESULT-UPDATE", 2, 0, false);
        declareFunction("get_gtct_by_name", "GET-GTCT-BY-NAME", 1, 0, false);
        declareFunction("test_case_classes", "TEST-CASE-CLASSES", 1, 0, false);
        declareFunction("run_test_case_table_print_header", "RUN-TEST-CASE-TABLE-PRINT-HEADER", 3, 0, false);
        declareFunction("run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 6, 0, false);
        declareFunction("run_test_case_tuple_print_header", "RUN-TEST-CASE-TUPLE-PRINT-HEADER", 4, 0, false);
        declareFunction("run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 6, 0, false);
        declareFunction("cfasl_output_object_generic_test_case_table_method", "CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_generic_test_case_table", "CFASL-WIDE-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        declareFunction("cfasl_output_generic_test_case_table", "CFASL-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
        declareFunction("cfasl_input_generic_test_case_table", "CFASL-INPUT-GENERIC-TEST-CASE-TABLE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeKeyword("SUCCESS"), makeKeyword("FAILURE"), makeKeyword("ERROR"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));

    static private final SubLList $list_alt5 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"), makeKeyword("POST-BUILD"));

    static private final SubLList $list_alt9 = list(makeSymbol("NAME"), makeSymbol("TUPLES"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), makeSymbol("KB"), makeSymbol("WORKING?"));

    static private final SubLList $list_alt10 = list($NAME, makeKeyword("TUPLES"), $TEST, makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    static private final SubLList $list_alt11 = list(makeSymbol("GTCT-NAME"), makeSymbol("GTCT-TUPLES"), makeSymbol("GTCT-TEST"), makeSymbol("GTCT-OWNER"), makeSymbol("GTCT-CLASSES"), makeSymbol("GTCT-KB"), makeSymbol("GTCT-WORKING?"));

    static private final SubLList $list_alt12 = list(makeSymbol("_CSETF-GTCT-NAME"), makeSymbol("_CSETF-GTCT-TUPLES"), makeSymbol("_CSETF-GTCT-TEST"), makeSymbol("_CSETF-GTCT-OWNER"), makeSymbol("_CSETF-GTCT-CLASSES"), makeSymbol("_CSETF-GTCT-KB"), makeSymbol("_CSETF-GTCT-WORKING?"));

    public static final SubLObject init_generic_testing_file_alt() {
        deflexical("*TEST-CASE-TABLE-INDEX*", NIL != boundp($test_case_table_index$) ? ((SubLObject) ($test_case_table_index$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQL), UNPROVIDED));
        deflexical("*ORDERED-TEST-CASES*", NIL != boundp($ordered_test_cases$) ? ((SubLObject) ($ordered_test_cases$.getGlobalValue())) : NIL);
        deflexical("*TEST-CASE-TABLES-BY-CLASS*", make_hash_table($int$64, EQL, UNPROVIDED));
        deflexical("*GENERIC-TEST-RESULTS*", $list_alt4);
        deflexical("*GENERIC-TEST-VERBOSITY-LEVELS*", $list_alt5);
        deflexical("*TEST-CASE-TABLE-POST-BUILD-TOKEN*", $TCT);
        defconstant("*DTP-GENERIC-TEST-CASE-TABLE*", GENERIC_TEST_CASE_TABLE);
        defconstant("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*", $int$512);
        return NIL;
    }

    public static SubLObject init_generic_testing_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*TEST-CASE-TABLE-INDEX*", SubLTrampolineFile.maybeDefault($test_case_table_index$, $test_case_table_index$, () -> make_hash_table($int$212, symbol_function(EQL), UNPROVIDED)));
            deflexical("*ORDERED-TEST-CASES*", SubLTrampolineFile.maybeDefault($ordered_test_cases$, $ordered_test_cases$, NIL));
            deflexical("*TEST-CASE-TABLES-BY-CLASS*", make_hash_table($int$64, EQL, UNPROVIDED));
            deflexical("*GENERIC-TEST-RESULTS*", $list4);
            deflexical("*GENERIC-TEST-VERBOSITY-LEVELS*", $list5);
            deflexical("*TEST-CASE-TABLE-POST-BUILD-TOKEN*", $TCT);
            defparameter("*DEBUG-TEST-CASE-TABLES?*", NIL);
            defconstant("*DTP-GENERIC-TEST-CASE-TABLE*", GENERIC_TEST_CASE_TABLE);
            defconstant("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*", $int$512);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TEST-CASE-TABLE-INDEX*", NIL != boundp($test_case_table_index$) ? ((SubLObject) ($test_case_table_index$.getGlobalValue())) : make_hash_table($int$212, symbol_function(EQL), UNPROVIDED));
            deflexical("*ORDERED-TEST-CASES*", NIL != boundp($ordered_test_cases$) ? ((SubLObject) ($ordered_test_cases$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_generic_testing_file_Previous() {
        deflexical("*TEST-CASE-TABLE-INDEX*", SubLTrampolineFile.maybeDefault($test_case_table_index$, $test_case_table_index$, () -> make_hash_table($int$212, symbol_function(EQL), UNPROVIDED)));
        deflexical("*ORDERED-TEST-CASES*", SubLTrampolineFile.maybeDefault($ordered_test_cases$, $ordered_test_cases$, NIL));
        deflexical("*TEST-CASE-TABLES-BY-CLASS*", make_hash_table($int$64, EQL, UNPROVIDED));
        deflexical("*GENERIC-TEST-RESULTS*", $list4);
        deflexical("*GENERIC-TEST-VERBOSITY-LEVELS*", $list5);
        deflexical("*TEST-CASE-TABLE-POST-BUILD-TOKEN*", $TCT);
        defparameter("*DEBUG-TEST-CASE-TABLES?*", NIL);
        defconstant("*DTP-GENERIC-TEST-CASE-TABLE*", GENERIC_TEST_CASE_TABLE);
        defconstant("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*", $int$512);
        return NIL;
    }

    static private final SubLSymbol $sym27$GTCT_WORKING_ = makeSymbol("GTCT-WORKING?");

    static private final SubLSymbol $sym28$_CSETF_GTCT_WORKING_ = makeSymbol("_CSETF-GTCT-WORKING?");

    static private final SubLString $str_alt36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt44$_S_was_not_a_valid___input_____ex = makeString("~S was not a valid (<input> . <expected-results>) tuple");

    public static final SubLObject setup_generic_testing_file_alt() {
        declare_defglobal($test_case_table_index$);
        declare_defglobal($ordered_test_cases$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(GTCT_NAME, _CSETF_GTCT_NAME);
        def_csetf(GTCT_TUPLES, _CSETF_GTCT_TUPLES);
        def_csetf(GTCT_TEST, _CSETF_GTCT_TEST);
        def_csetf(GTCT_OWNER, _CSETF_GTCT_OWNER);
        def_csetf(GTCT_CLASSES, _CSETF_GTCT_CLASSES);
        def_csetf(GTCT_KB, _CSETF_GTCT_KB);
        def_csetf($sym27$GTCT_WORKING_, $sym28$_CSETF_GTCT_WORKING_);
        identity(GENERIC_TEST_CASE_TABLE);
        register_macro_helper(DEFINE_TEST_CASE_TABLE_INT, DEFINE_TEST_CASE_TABLE);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), CFASL_INPUT_GENERIC_TEST_CASE_TABLE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        return NIL;
    }

    public static SubLObject setup_generic_testing_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($test_case_table_index$);
            declare_defglobal($ordered_test_cases$);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list15);
            def_csetf(GTCT_NAME, _CSETF_GTCT_NAME);
            def_csetf(GTCT_TUPLES, _CSETF_GTCT_TUPLES);
            def_csetf(GTCT_TEST, _CSETF_GTCT_TEST);
            def_csetf(GTCT_OWNER, _CSETF_GTCT_OWNER);
            def_csetf(GTCT_CLASSES, _CSETF_GTCT_CLASSES);
            def_csetf(GTCT_KB, _CSETF_GTCT_KB);
            def_csetf($sym28$GTCT_WORKING_, $sym29$_CSETF_GTCT_WORKING_);
            identity(GENERIC_TEST_CASE_TABLE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
            register_macro_helper(DEFINE_TEST_CASE_TABLE_INT, DEFINE_TEST_CASE_TABLE);
            register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), CFASL_INPUT_GENERIC_TEST_CASE_TABLE);
            register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym27$GTCT_WORKING_, $sym28$_CSETF_GTCT_WORKING_);
        }
        return NIL;
    }

    public static SubLObject setup_generic_testing_file_Previous() {
        declare_defglobal($test_case_table_index$);
        declare_defglobal($ordered_test_cases$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list15);
        def_csetf(GTCT_NAME, _CSETF_GTCT_NAME);
        def_csetf(GTCT_TUPLES, _CSETF_GTCT_TUPLES);
        def_csetf(GTCT_TEST, _CSETF_GTCT_TEST);
        def_csetf(GTCT_OWNER, _CSETF_GTCT_OWNER);
        def_csetf(GTCT_CLASSES, _CSETF_GTCT_CLASSES);
        def_csetf(GTCT_KB, _CSETF_GTCT_KB);
        def_csetf($sym28$GTCT_WORKING_, $sym29$_CSETF_GTCT_WORKING_);
        identity(GENERIC_TEST_CASE_TABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        register_macro_helper(DEFINE_TEST_CASE_TABLE_INT, DEFINE_TEST_CASE_TABLE);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), CFASL_INPUT_GENERIC_TEST_CASE_TABLE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
        return NIL;
    }

    static private final SubLSymbol $sym46$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    static private final SubLList $list_alt47 = list(makeSymbol("TEST-CASE-NAME"), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), list(makeSymbol("KB"), $TINY), list(makeSymbol("WORKING?"), T)), makeSymbol("&BODY"), makeSymbol("TUPLES"));

    static private final SubLList $list_alt48 = list($TEST, makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    static private final SubLString $str_alt57$__There_is_no_test_case_table_nam = makeString("~%There is no test case table named ~s.");

    static private final SubLList $list_alt66 = list(makeSymbol("&KEY"), makeSymbol("OWNER"), makeSymbol("TEST"), makeSymbol("CLASSES"), makeSymbol("KB"), list(makeSymbol("WORKING?"), T));

    @Override
    public void declareFunctions() {
        declare_generic_testing_file();
    }

    static private final SubLList $list_alt67 = list(makeKeyword("OWNER"), $TEST, makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));

    @Override
    public void initializeVariables() {
        init_generic_testing_file();
    }

    static private final SubLList $list_alt69 = list(makeSymbol("INPUT-ARGS"), makeSymbol("&REST"), makeSymbol("EXPECTED-RESULTS"));

    @Override
    public void runTopLevelForms() {
        setup_generic_testing_file();
    }

    static {
    }

    static private final SubLString $str_alt72$_S____ = makeString("~S -> ");

    static private final SubLString $str_alt73$Starting__S______ = makeString("Starting ~S :~%~%");

    public static final class $generic_test_case_table_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $tuples;

        public SubLObject $test;

        public SubLObject $owner;

        public SubLObject $classes;

        public SubLObject $kb;

        public SubLObject $workingP;

        private static final SubLStructDeclNative structDecl;

        public $generic_test_case_table_native() {
            generic_testing.$generic_test_case_table_native.this.$name = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$tuples = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$test = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$owner = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$classes = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$kb = Lisp.NIL;
            generic_testing.$generic_test_case_table_native.this.$workingP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return generic_testing.$generic_test_case_table_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return generic_testing.$generic_test_case_table_native.this.$tuples;
        }

        @Override
        public SubLObject getField4() {
            return generic_testing.$generic_test_case_table_native.this.$test;
        }

        @Override
        public SubLObject getField5() {
            return generic_testing.$generic_test_case_table_native.this.$owner;
        }

        @Override
        public SubLObject getField6() {
            return generic_testing.$generic_test_case_table_native.this.$classes;
        }

        @Override
        public SubLObject getField7() {
            return generic_testing.$generic_test_case_table_native.this.$kb;
        }

        @Override
        public SubLObject getField8() {
            return generic_testing.$generic_test_case_table_native.this.$workingP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$tuples = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$test = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$owner = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$classes = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$kb = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return generic_testing.$generic_test_case_table_native.this.$workingP = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cyc_testing.generic_testing.$generic_test_case_table_native.class, GENERIC_TEST_CASE_TABLE, GENERIC_TEST_CASE_TABLE_P, $list9, $list10, new String[]{ "$name", "$tuples", "$test", "$owner", "$classes", "$kb", "$workingP" }, $list11, $list12, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLString $str_alt74$_S__ = makeString("~S~%");

    static private final SubLString $str_alt75$_S__S__S__OWNER__S__ = makeString("~S ~S ~S :OWNER ~S~%");

    static private final SubLString $str_alt76$__Overall_result_for__S___S__ = makeString("~%Overall result for ~S: ~S~%");

    static private final SubLString $str_alt77$Please_notify__a_cyc_com_ = makeString("Please notify ~a@cyc.com.");

    static private final SubLString $str_alt78$__Input___s____Expected_result___ = makeString("  Input: ~s~%  Expected result: ~s  ~%");

    static private final SubLString $str_alt79$__Input___s____Expected_results__ = makeString("  Input: ~s~%  Expected results: ~s  ~%");

    static private final SubLString $str_alt80$__________SUCCESS__ = makeString("~%    -> :SUCCESS~%");

    static private final SubLString $str_alt81$__________ERROR__S__ = makeString("~%    -> :ERROR ~S~%");

    static private final SubLString $str_alt82$____Actual_result___s____Compared = makeString("    Actual result: ~s~%  Compared via: ~s~%  -> :FAILURE~%");

    static private final SubLString $str_alt83$____Actual_results___s____Compare = makeString("    Actual results: ~s~%  Compared via: ~s~%  -> :FAILURE~%");

    public static final class $generic_test_case_table_p$UnaryFunction extends UnaryFunction {
        public $generic_test_case_table_p$UnaryFunction() {
            super(extractFunctionNamed("GENERIC-TEST-CASE-TABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return generic_test_case_table_p(arg1);
        }
    }
}

/**
 * Total time: 283 ms synthetic
 */
