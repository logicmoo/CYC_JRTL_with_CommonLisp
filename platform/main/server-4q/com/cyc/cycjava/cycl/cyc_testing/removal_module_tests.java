package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cyc_testing.removal_module_tests;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.removal_module_tests.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_module_tests extends SubLTranslatedFile {
    public static final SubLFile me = new removal_module_tests();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.removal_module_tests";

    public static final String myFingerPrint = "3919368d5d098e3a8da35fab39693632740972e3363f6e620c8629935b0864c6";

    // defconstant
    public static final SubLSymbol $dtp_removal_module_test$ = makeSymbol("*DTP-REMOVAL-MODULE-TEST*");



    // Internal Constants
    public static final SubLSymbol REMOVAL_MODULE_TEST = makeSymbol("REMOVAL-MODULE-TEST");

    public static final SubLSymbol REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("RMT-HL-MODULE"), makeSymbol("RMT-ID"), makeSymbol("RMT-SENTENCE"), makeSymbol("RMT-MT"), makeSymbol("RMT-PROPERTIES"), makeSymbol("RMT-COMMENT"), makeSymbol("RMT-KB"), makeSymbol("RMT-OWNER"), makeSymbol("RMT-BUG-NUMBER"), makeSymbol("RMT-CREATION-DATE"), makeSymbol("RMT-CREATOR"), makeSymbol("RMT-WORKING?") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-RMT-HL-MODULE"), makeSymbol("_CSETF-RMT-ID"), makeSymbol("_CSETF-RMT-SENTENCE"), makeSymbol("_CSETF-RMT-MT"), makeSymbol("_CSETF-RMT-PROPERTIES"), makeSymbol("_CSETF-RMT-COMMENT"), makeSymbol("_CSETF-RMT-KB"), makeSymbol("_CSETF-RMT-OWNER"), makeSymbol("_CSETF-RMT-BUG-NUMBER"), makeSymbol("_CSETF-RMT-CREATION-DATE"), makeSymbol("_CSETF-RMT-CREATOR"), makeSymbol("_CSETF-RMT-WORKING?") });



    public static final SubLSymbol REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-MODULE-TEST-P"));

    private static final SubLSymbol RMT_HL_MODULE = makeSymbol("RMT-HL-MODULE");

    private static final SubLSymbol _CSETF_RMT_HL_MODULE = makeSymbol("_CSETF-RMT-HL-MODULE");

    private static final SubLSymbol RMT_ID = makeSymbol("RMT-ID");

    private static final SubLSymbol _CSETF_RMT_ID = makeSymbol("_CSETF-RMT-ID");

    private static final SubLSymbol RMT_SENTENCE = makeSymbol("RMT-SENTENCE");

    private static final SubLSymbol _CSETF_RMT_SENTENCE = makeSymbol("_CSETF-RMT-SENTENCE");

    private static final SubLSymbol RMT_MT = makeSymbol("RMT-MT");

    private static final SubLSymbol _CSETF_RMT_MT = makeSymbol("_CSETF-RMT-MT");

    private static final SubLSymbol RMT_PROPERTIES = makeSymbol("RMT-PROPERTIES");

    private static final SubLSymbol _CSETF_RMT_PROPERTIES = makeSymbol("_CSETF-RMT-PROPERTIES");

    private static final SubLSymbol RMT_COMMENT = makeSymbol("RMT-COMMENT");

    private static final SubLSymbol _CSETF_RMT_COMMENT = makeSymbol("_CSETF-RMT-COMMENT");

    private static final SubLSymbol RMT_KB = makeSymbol("RMT-KB");

    private static final SubLSymbol _CSETF_RMT_KB = makeSymbol("_CSETF-RMT-KB");

    private static final SubLSymbol RMT_OWNER = makeSymbol("RMT-OWNER");

    private static final SubLSymbol _CSETF_RMT_OWNER = makeSymbol("_CSETF-RMT-OWNER");

    private static final SubLSymbol RMT_BUG_NUMBER = makeSymbol("RMT-BUG-NUMBER");

    private static final SubLSymbol _CSETF_RMT_BUG_NUMBER = makeSymbol("_CSETF-RMT-BUG-NUMBER");

    private static final SubLSymbol RMT_CREATION_DATE = makeSymbol("RMT-CREATION-DATE");

    private static final SubLSymbol _CSETF_RMT_CREATION_DATE = makeSymbol("_CSETF-RMT-CREATION-DATE");

    private static final SubLSymbol RMT_CREATOR = makeSymbol("RMT-CREATOR");

    private static final SubLSymbol _CSETF_RMT_CREATOR = makeSymbol("_CSETF-RMT-CREATOR");

    private static final SubLSymbol $sym31$RMT_WORKING_ = makeSymbol("RMT-WORKING?");

    private static final SubLSymbol $sym32$_CSETF_RMT_WORKING_ = makeSymbol("_CSETF-RMT-WORKING?");

























    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REMOVAL_MODULE_TEST = makeSymbol("MAKE-REMOVAL-MODULE-TEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD");

    private static final SubLSymbol $removal_module_tests$ = makeSymbol("*REMOVAL-MODULE-TESTS*");



    private static final SubLSymbol $sym53$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol $sym55$_ = makeSymbol("<");

    private static final SubLSymbol $sym56$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLList $list57 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("BaseKB"))), makeSymbol("PROPERTIES"), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) });

    private static final SubLList $list58 = list(new SubLObject[]{ makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));







    private static final SubLSymbol DEFINE_REMOVAL_MODULE_TEST_INT = makeSymbol("DEFINE-REMOVAL-MODULE-TEST-INT");

    private static final SubLSymbol DEFINE_REMOVAL_MODULE_TEST = makeSymbol("DEFINE-REMOVAL-MODULE-TEST");

    private static final SubLString $str66$Define_a_removal_module_test_numb = makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");





    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");









    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");





    private static final SubLSymbol RUN_REMOVAL_MODULE_TESTS_FOR_PRED = makeSymbol("RUN-REMOVAL-MODULE-TESTS-FOR-PRED");













    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol $FAILURE_HALT_REASON = makeKeyword("FAILURE-HALT-REASON");

    private static final SubLSymbol $FAILURE_REMOVAL_MODULE = makeKeyword("FAILURE-REMOVAL-MODULE");

    private static final SubLSymbol $kw89$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLSymbol $kw91$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLSymbol $kw92$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");



    private static final SubLString $str94$___RMT__S__S____ = makeString("~&:RMT ~S ~S -> ");



    private static final SubLString $str96$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str97$_S____3f___ = makeString("~S (~,3f)~%");

    public static SubLObject removal_module_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_module_test_p(final SubLObject v_object) {
        return v_object.getClass() == removal_module_tests.$removal_module_test_native.class ? T : NIL;
    }

    public static SubLObject rmt_hl_module(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject rmt_id(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject rmt_sentence(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject rmt_mt(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject rmt_properties(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject rmt_comment(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject rmt_kb(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject rmt_owner(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject rmt_bug_number(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject rmt_creation_date(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject rmt_creator(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject rmt_workingP(final SubLObject v_object) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_rmt_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rmt_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rmt_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rmt_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rmt_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rmt_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rmt_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rmt_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rmt_bug_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rmt_creation_date(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rmt_creator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_rmt_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_test_p(v_object) : "removal_module_tests.removal_module_test_p(v_object) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_removal_module_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new removal_module_tests.$removal_module_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_rmt_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_rmt_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_rmt_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_rmt_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROPERTIES)) {
                                _csetf_rmt_properties(v_new, current_value);
                            } else
                                if (pcase_var.eql($COMMENT)) {
                                    _csetf_rmt_comment(v_new, current_value);
                                } else
                                    if (pcase_var.eql($KB)) {
                                        _csetf_rmt_kb(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OWNER)) {
                                            _csetf_rmt_owner(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($BUG_NUMBER)) {
                                                _csetf_rmt_bug_number(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($CREATION_DATE)) {
                                                    _csetf_rmt_creation_date(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($CREATOR)) {
                                                        _csetf_rmt_creator(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($WORKING_)) {
                                                            _csetf_rmt_workingP(v_new, current_value);
                                                        } else {
                                                            Errors.error($str45$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_module_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOVAL_MODULE_TEST, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, rmt_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, rmt_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, rmt_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rmt_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, rmt_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, rmt_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, rmt_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, rmt_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $BUG_NUMBER, rmt_bug_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_DATE, rmt_creation_date(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATOR, rmt_creator(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, rmt_workingP(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOVAL_MODULE_TEST, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_module_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_module_test(obj, visitor_fn);
    }

    public static SubLObject removal_modules_with_removal_module_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys($removal_module_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, symbol_function($sym53$TERM__), symbol_function(HL_MODULE_NAME));
        return hl_modules;
    }

    public static SubLObject removal_module_tests(final SubLObject hl_module) {
        SubLObject tests = copy_list(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
        tests = Sort.sort(tests, symbol_function($sym55$_), symbol_function(RMT_ID));
        return tests;
    }

    public static SubLObject some_removal_module_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject removal_module_test_name(final SubLObject rmt) {
        return list(inference_modules.hl_module_name(rmt_hl_module(rmt)), rmt_id(rmt));
    }

    public static SubLObject removal_module_test_id(final SubLObject rmt) {
        return rmt_id(rmt);
    }

    public static SubLObject removal_module_test_mt(final SubLObject rmt) {
        return rmt_mt(rmt);
    }

    public static SubLObject removal_module_test_sentence(final SubLObject rmt) {
        return rmt_sentence(rmt);
    }

    public static SubLObject removal_module_test_owner(final SubLObject rmt) {
        return rmt_owner(rmt);
    }

    public static SubLObject removal_module_test_comment(final SubLObject rmt) {
        return rmt_comment(rmt);
    }

    public static SubLObject removal_module_test_kb(final SubLObject rmt) {
        return rmt_kb(rmt);
    }

    public static SubLObject removal_module_test_workingP(final SubLObject rmt) {
        return rmt_workingP(rmt);
    }

    public static SubLObject removal_module_test_predicate(final SubLObject rmt) {
        final SubLObject hl_module = rmt_hl_module(rmt);
        if (NIL != hl_module) {
            final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
            return predicate;
        }
        return NIL;
    }

    public static SubLObject removal_module_test_mentions_invalid_constantP(final SubLObject rmt) {
        return makeBoolean((NIL != list_utilities.tree_find_if($sym56$INVALID_CONSTANT_, removal_module_test_mt(rmt), UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym56$INVALID_CONSTANT_, removal_module_test_sentence(rmt), UNPROVIDED)));
    }

    public static SubLObject removal_module_test_invalid_constants(final SubLObject rmt) {
        return remove_duplicates(append(cycl_utilities.expression_gather(removal_module_test_mt(rmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(removal_module_test_sentence(rmt), $sym56$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject define_removal_module_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$1, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$BaseKB;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $TINY;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject bug_tail = property_list_member($BUG, current);
        final SubLObject bug = (NIL != bug_tail) ? cadr(bug_tail) : NIL;
        final SubLObject created_tail = property_list_member($CREATED, current);
        final SubLObject created = (NIL != created_tail) ? cadr(created_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, current);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        return list(new SubLObject[]{ DEFINE_REMOVAL_MODULE_TEST_INT, name, id, sentence, mt, v_properties, kb, owner, comment, bug, created, creator, workingP });
    }

    public static SubLObject define_removal_module_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != cyc_testing.cyc_test_kb_p(kb) : "cyc_testing.cyc_test_kb_p(kb) " + "CommonSymbols.NIL != cyc_testing.cyc_test_kb_p(kb) " + kb;
        assert NIL != inference_testing.inference_test_owner_p(owner) : "inference_testing.inference_test_owner_p(owner) " + "CommonSymbols.NIL != inference_testing.inference_test_owner_p(owner) " + owner;
        if (((NIL != bug_number) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(bug_number))) {
            throw new AssertionError(bug_number);
        }
        if (((NIL != creation_date) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == numeric_date_utilities.universal_date_p(creation_date))) {
            throw new AssertionError(creation_date);
        }
        if (((NIL != creator) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(creator))) {
            throw new AssertionError(creator);
        }
        assert NIL != booleanp(workingP) : "Types.booleanp(workingP) " + "CommonSymbols.NIL != Types.booleanp(workingP) " + workingP;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            final SubLObject test = make_removal_module_test(list(new SubLObject[]{ $HL_MODULE, hl_module, $ID, id, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties, $COMMENT, comment, $KB, kb, $OWNER, owner, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP }));
            SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
            existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            existing_tests = cons(test, existing_tests);
            sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return NIL;
    }

    public static SubLObject undefine_removal_module_test_number(final SubLObject name, final SubLObject number) {
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject existing_tests = gethash(hl_module, $removal_module_tests$.getGlobalValue(), UNPROVIDED);
        existing_tests = delete(number, existing_tests, symbol_function(EQL), symbol_function(RMT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        sethash(hl_module, $removal_module_tests$.getGlobalValue(), existing_tests);
        return length(existing_tests);
    }

    public static SubLObject clear_removal_module_tests() {
        clrhash($removal_module_tests$.getGlobalValue());
        return NIL;
    }

    public static SubLObject run_all_removal_module_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        if (return_test_runsP == UNPROVIDED) {
            return_test_runsP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $RMT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_removal_module_tests_for_pred(final SubLObject pred, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_modules = inference_modules.removal_modules_specific(pred);
        SubLObject result = $SUCCESS;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
            final SubLObject partial_test_runs = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = nconc(test_runs, partial_test_runs);
            if (partial_result != $SUCCESS) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        return values(result, test_runs);
    }

    public static SubLObject run_removal_module_tests_browsable(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_removal_module_tests_blocking(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_tests(name, output_format, stream, T, T);
    }

    public static SubLObject run_removal_module_tests(final SubLObject name, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            return run_removal_module_tests_int(hl_module, output_format, stream, browsableP, blockP);
        }
        return NIL;
    }

    public static SubLObject run_removal_module_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream, final SubLObject browsableP, final SubLObject blockP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = $SUCCESS;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = removal_module_tests(hl_module);
        SubLObject rmt = NIL;
        rmt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject partial_result = run_removal_module_test(rmt, output_format, stream, browsableP, blockP);
            final SubLObject test_run = thread.secondMultipleValue();
            thread.resetMultipleValues();
            test_runs = cons(test_run, test_runs);
            if ((partial_result != $SUCCESS) && (partial_result != $NOT_RUN)) {
                result = partial_result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            rmt = cdolist_list_var.first();
        } 
        return values(result, nreverse(test_runs));
    }

    public static SubLObject run_removal_module_test_number_browsable(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, T, UNPROVIDED);
    }

    public static SubLObject run_removal_module_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_test_number(name, number, output_format, stream, T, T);
    }

    public static SubLObject run_removal_module_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = NIL;
        if ((NIL != inference_modules.removal_module_p(hl_module)) && (NIL == test)) {
            SubLObject csome_list_var = removal_module_tests(hl_module);
            SubLObject rmt = NIL;
            rmt = csome_list_var.first();
            while ((NIL == test) && (NIL != csome_list_var)) {
                if (number.numE(rmt_id(rmt))) {
                    test = rmt;
                }
                csome_list_var = csome_list_var.rest();
                rmt = csome_list_var.first();
            } 
        }
        return run_removal_module_test(test, output_format, stream, browsableP, blockP);
    }

    public static SubLObject run_removal_module_test(final SubLObject rmt, SubLObject output_format, SubLObject stream, SubLObject browsableP, SubLObject blockP) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_module_test_p(rmt) : "removal_module_tests.removal_module_test_p(rmt) " + "CommonSymbols.NIL != removal_module_tests.removal_module_test_p(rmt) " + rmt;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject name = removal_module_test_name(rmt);
        SubLObject time = NIL;
        SubLObject result = NIL;
        if (NIL == run_removal_module_testP(rmt)) {
            result = $NOT_RUN;
        } else
            if (NIL != removal_module_test_mentions_invalid_constantP(rmt)) {
                result = $INVALID;
            } else {
                final SubLObject hl_module = rmt_hl_module(rmt);
                final SubLObject sentence = rmt_sentence(rmt);
                final SubLObject mt = rmt_mt(rmt);
                final SubLObject v_properties = rmt_properties(rmt);
                final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                try {
                    $print_pretty$.bind(NIL, thread);
                    print_removal_module_test_preamble(rmt, output_format, stream);
                    thread.resetMultipleValues();
                    final SubLObject result_$2 = run_removal_module_test_query(hl_module, sentence, mt, v_properties, browsableP, blockP, UNPROVIDED, UNPROVIDED);
                    final SubLObject time_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = result_$2;
                    time = time_$3;
                    print_removal_module_test_result(rmt, result, time, output_format, stream);
                } finally {
                    $print_pretty$.rebind(_prev_bind_0, thread);
                }
            }

        final SubLObject test_run = cyc_testing.new_cyc_test_run($RMT, name, result, time);
        return values(result, test_run);
    }

    public static SubLObject run_removal_module_testP(final SubLObject rmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = rmt_kb(rmt);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject run_removal_module_test_query(final SubLObject hl_module, final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject browsableP, SubLObject blockP, SubLObject expected_result, SubLObject expected_halt_reason) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        if (expected_result == UNPROVIDED) {
            expected_result = $UNSPECIFIED;
        }
        if (expected_halt_reason == UNPROVIDED) {
            expected_halt_reason = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject subresult = run_removal_module_test_query_int(hl_module, sentence, mt, v_properties, browsableP, blockP, expected_result, expected_halt_reason);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = subresult;
        if (pcase_var.eql($ERROR)) {
            return values(subresult, time);
        }
        if (pcase_var.eql($SUCCESS)) {
            return values(subresult, time);
        }
        return values($FAILURE, time);
    }

    public static SubLObject run_removal_module_test_query_int(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject browsableP, final SubLObject blockP, final SubLObject expected_result, final SubLObject expected_halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = $ERROR;
        SubLObject time = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject inference = removal_module_test_query_inference(sentence, mt, v_properties, blockP);
                    final SubLObject inference_time = thread.secondMultipleValue();
                    final SubLObject result = thread.thirdMultipleValue();
                    final SubLObject halt_reason = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    time = inference_time;
                    if (($UNSPECIFIED != expected_result) && (NIL == bindings.lists_of_binding_lists_equalP(result, expected_result))) {
                        v_answer = $FAILURE_BINDINGS;
                    } else
                        if ((NIL != expected_halt_reason) && (!halt_reason.equal(expected_halt_reason))) {
                            v_answer = $FAILURE_HALT_REASON;
                        } else
                            if (NIL == inference_utilities.inference_some_proof_uses_removal_moduleP(inference, hl_module)) {
                                v_answer = $FAILURE_REMOVAL_MODULE;
                            } else {
                                v_answer = $SUCCESS;
                            }


                    if (NIL == browsableP) {
                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(v_answer, time);
    }

    public static SubLObject removal_module_test_query_inference(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject blockP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (blockP == UNPROVIDED) {
            blockP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(sentence);
        v_properties = copy_list(v_properties);
        v_properties = putf(v_properties, $kw89$CONDITIONAL_SENTENCE_, conditionalP);
        v_properties = putf(v_properties, $BROWSABLE_, T);
        v_properties = putf(v_properties, $kw91$CACHE_INFERENCE_RESULTS_, NIL);
        v_properties = putf(v_properties, $kw92$NEW_TERMS_ALLOWED_, T);
        if (NIL != blockP) {
            v_properties = putf(v_properties, $BLOCK_, T);
        }
        SubLObject time = NIL;
        SubLObject result = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        final SubLObject time_var = get_internal_real_time();
        thread.resetMultipleValues();
        final SubLObject result_$4 = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        final SubLObject halt_reason_$5 = thread.secondMultipleValue();
        final SubLObject inference_$6 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        result = result_$4;
        halt_reason = halt_reason_$5;
        inference = inference_$6;
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return values(inference, time, result, halt_reason);
    }

    public static SubLObject print_removal_module_test_preamble(final SubLObject rmt, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            final SubLObject hl_module = rmt_hl_module(rmt);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmt_id(rmt);
            format(stream, $str94$___RMT__S__S____, name, id);
            force_output(stream);
        } else
            if (!output_format.eql($POST_BUILD)) {
                format(stream, $str96$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject print_removal_module_test_result(final SubLObject rmt, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            format(stream, $str97$_S____3f___, result, time);
            force_output(stream);
        } else
            if (output_format.eql($POST_BUILD)) {
                final SubLObject hl_module = rmt_hl_module(rmt);
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                final SubLObject id = rmt_id(rmt);
                final SubLObject owner = rmt_owner(rmt);
                cyc_testing.print_post_build_test_summary(stream, result, $RMT, list(name, id), time, owner);
            } else {
                format(stream, $str96$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject declare_removal_module_tests_file() {
        declareFunction(me, "removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false);
        new removal_module_tests.$removal_module_test_p$UnaryFunction();
        declareFunction(me, "rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
        declareFunction(me, "rmt_id", "RMT-ID", 1, 0, false);
        declareFunction(me, "rmt_sentence", "RMT-SENTENCE", 1, 0, false);
        declareFunction(me, "rmt_mt", "RMT-MT", 1, 0, false);
        declareFunction(me, "rmt_properties", "RMT-PROPERTIES", 1, 0, false);
        declareFunction(me, "rmt_comment", "RMT-COMMENT", 1, 0, false);
        declareFunction(me, "rmt_kb", "RMT-KB", 1, 0, false);
        declareFunction(me, "rmt_owner", "RMT-OWNER", 1, 0, false);
        declareFunction(me, "rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
        declareFunction(me, "rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
        declareFunction(me, "rmt_creator", "RMT-CREATOR", 1, 0, false);
        declareFunction(me, "rmt_workingP", "RMT-WORKING?", 1, 0, false);
        declareFunction(me, "_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
        declareFunction(me, "_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
        declareFunction(me, "_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
        declareFunction(me, "_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
        declareFunction(me, "_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
        declareFunction(me, "_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
        declareFunction(me, "_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
        declareFunction(me, "_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
        declareFunction(me, "_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
        declareFunction(me, "make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_removal_module_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-TEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_removal_module_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-TEST-METHOD", 2, 0, false);
        declareFunction(me, "removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction(me, "removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
        declareFunction(me, "some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
        declareFunction(me, "removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
        declareFunction(me, "removal_module_test_id", "REMOVAL-MODULE-TEST-ID", 1, 0, false);
        declareFunction(me, "removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
        declareFunction(me, "removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
        declareFunction(me, "removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
        declareFunction(me, "removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
        declareFunction(me, "removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
        declareFunction(me, "removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
        declareFunction(me, "removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
        declareFunction(me, "removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "removal_module_test_invalid_constants", "REMOVAL-MODULE-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareMacro(me, "define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
        declareFunction(me, "define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
        declareFunction(me, "undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
        declareFunction(me, "clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
        declareFunction(me, "run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
        declareFunction(me, "run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
        declareFunction(me, "run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
        declareFunction(me, "run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
        declareFunction(me, "run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
        declareFunction(me, "run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
        declareFunction(me, "run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
        declareFunction(me, "run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
        declareFunction(me, "run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
        declareFunction(me, "run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
        declareFunction(me, "run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
        declareFunction(me, "run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
        declareFunction(me, "run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
        declareFunction(me, "removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
        declareFunction(me, "print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
        declareFunction(me, "print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_module_tests_file() {
        defconstant("*DTP-REMOVAL-MODULE-TEST*", REMOVAL_MODULE_TEST);
        deflexical("*REMOVAL-MODULE-TESTS*", SubLTrampolineFile.maybeDefault($removal_module_tests$, $removal_module_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_removal_module_tests_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RMT_HL_MODULE, _CSETF_RMT_HL_MODULE);
        def_csetf(RMT_ID, _CSETF_RMT_ID);
        def_csetf(RMT_SENTENCE, _CSETF_RMT_SENTENCE);
        def_csetf(RMT_MT, _CSETF_RMT_MT);
        def_csetf(RMT_PROPERTIES, _CSETF_RMT_PROPERTIES);
        def_csetf(RMT_COMMENT, _CSETF_RMT_COMMENT);
        def_csetf(RMT_KB, _CSETF_RMT_KB);
        def_csetf(RMT_OWNER, _CSETF_RMT_OWNER);
        def_csetf(RMT_BUG_NUMBER, _CSETF_RMT_BUG_NUMBER);
        def_csetf(RMT_CREATION_DATE, _CSETF_RMT_CREATION_DATE);
        def_csetf(RMT_CREATOR, _CSETF_RMT_CREATOR);
        def_csetf($sym31$RMT_WORKING_, $sym32$_CSETF_RMT_WORKING_);
        identity(REMOVAL_MODULE_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_TEST_METHOD));
        declare_defglobal($removal_module_tests$);
        register_cyc_api_macro(DEFINE_REMOVAL_MODULE_TEST, $list57, $str66$Define_a_removal_module_test_numb);
        register_external_symbol(DEFINE_REMOVAL_MODULE_TEST_INT);
        register_macro_helper(DEFINE_REMOVAL_MODULE_TEST_INT, DEFINE_REMOVAL_MODULE_TEST);
        register_external_symbol(RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_module_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_module_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_module_tests_file();
    }

    static {





































































































    }

    public static final class $removal_module_test_native extends SubLStructNative {
        public SubLObject $hl_module;

        public SubLObject $id;

        public SubLObject $sentence;

        public SubLObject $mt;

        public SubLObject $properties;

        public SubLObject $comment;

        public SubLObject $kb;

        public SubLObject $owner;

        public SubLObject $bug_number;

        public SubLObject $creation_date;

        public SubLObject $creator;

        public SubLObject $workingP;

        private static final SubLStructDeclNative structDecl;

        public $removal_module_test_native() {
            this.$hl_module = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$properties = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$kb = Lisp.NIL;
            this.$owner = Lisp.NIL;
            this.$bug_number = Lisp.NIL;
            this.$creation_date = Lisp.NIL;
            this.$creator = Lisp.NIL;
            this.$workingP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hl_module;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField5() {
            return this.$mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$properties;
        }

        @Override
        public SubLObject getField7() {
            return this.$comment;
        }

        @Override
        public SubLObject getField8() {
            return this.$kb;
        }

        @Override
        public SubLObject getField9() {
            return this.$owner;
        }

        @Override
        public SubLObject getField10() {
            return this.$bug_number;
        }

        @Override
        public SubLObject getField11() {
            return this.$creation_date;
        }

        @Override
        public SubLObject getField12() {
            return this.$creator;
        }

        @Override
        public SubLObject getField13() {
            return this.$workingP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hl_module = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$properties = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$kb = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$owner = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$bug_number = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$creation_date = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$creator = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$workingP = value;
        }

        static {
            structDecl = makeStructDeclNative(removal_module_tests.$removal_module_test_native.class, REMOVAL_MODULE_TEST, REMOVAL_MODULE_TEST_P, $list2, $list3, new String[]{ "$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $removal_module_test_p$UnaryFunction extends UnaryFunction {
        public $removal_module_test_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-MODULE-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_module_test_p(arg1);
        }
    }
}

/**
 * Total time: 313 ms synthetic
 */
