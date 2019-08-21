package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
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
import static com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests.*;
 public final class removal_module_cost_tests extends SubLTranslatedFile {
    public static final SubLFile me = new removal_module_cost_tests();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.removal_module_cost_tests";

    public static final String myFingerPrint = "65abf14b71320501f30cb4dee1dc693b3efe99e25919d39425602506a25ae430";

    // defconstant
    public static final SubLSymbol $dtp_removal_module_cost_test$ = makeSymbol("*DTP-REMOVAL-MODULE-COST-TEST*");



    // Internal Constants
    public static final SubLSymbol REMOVAL_MODULE_COST_TEST = makeSymbol("REMOVAL-MODULE-COST-TEST");

    public static final SubLSymbol REMOVAL_MODULE_COST_TEST_P = makeSymbol("REMOVAL-MODULE-COST-TEST-P");

    public static final SubLList $list2 = list(new SubLObject[]{ makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?") });

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeSymbol("RMCT-HL-MODULE"), makeSymbol("RMCT-ID"), makeSymbol("RMCT-SENTENCE"), makeSymbol("RMCT-MT"), makeSymbol("RMCT-COMMENT"), makeSymbol("RMCT-KB"), makeSymbol("RMCT-OWNER"), makeSymbol("RMCT-BUG-NUMBER"), makeSymbol("RMCT-CREATION-DATE"), makeSymbol("RMCT-CREATOR"), makeSymbol("RMCT-WORKING?") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-RMCT-HL-MODULE"), makeSymbol("_CSETF-RMCT-ID"), makeSymbol("_CSETF-RMCT-SENTENCE"), makeSymbol("_CSETF-RMCT-MT"), makeSymbol("_CSETF-RMCT-COMMENT"), makeSymbol("_CSETF-RMCT-KB"), makeSymbol("_CSETF-RMCT-OWNER"), makeSymbol("_CSETF-RMCT-BUG-NUMBER"), makeSymbol("_CSETF-RMCT-CREATION-DATE"), makeSymbol("_CSETF-RMCT-CREATOR"), makeSymbol("_CSETF-RMCT-WORKING?") });



    public static final SubLSymbol REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-MODULE-COST-TEST-P"));

    private static final SubLSymbol RMCT_HL_MODULE = makeSymbol("RMCT-HL-MODULE");

    private static final SubLSymbol _CSETF_RMCT_HL_MODULE = makeSymbol("_CSETF-RMCT-HL-MODULE");

    private static final SubLSymbol RMCT_ID = makeSymbol("RMCT-ID");

    private static final SubLSymbol _CSETF_RMCT_ID = makeSymbol("_CSETF-RMCT-ID");

    private static final SubLSymbol RMCT_SENTENCE = makeSymbol("RMCT-SENTENCE");

    private static final SubLSymbol _CSETF_RMCT_SENTENCE = makeSymbol("_CSETF-RMCT-SENTENCE");

    private static final SubLSymbol RMCT_MT = makeSymbol("RMCT-MT");

    private static final SubLSymbol _CSETF_RMCT_MT = makeSymbol("_CSETF-RMCT-MT");

    private static final SubLSymbol RMCT_COMMENT = makeSymbol("RMCT-COMMENT");

    private static final SubLSymbol _CSETF_RMCT_COMMENT = makeSymbol("_CSETF-RMCT-COMMENT");

    private static final SubLSymbol RMCT_KB = makeSymbol("RMCT-KB");

    private static final SubLSymbol _CSETF_RMCT_KB = makeSymbol("_CSETF-RMCT-KB");

    private static final SubLSymbol RMCT_OWNER = makeSymbol("RMCT-OWNER");

    private static final SubLSymbol _CSETF_RMCT_OWNER = makeSymbol("_CSETF-RMCT-OWNER");

    private static final SubLSymbol RMCT_BUG_NUMBER = makeSymbol("RMCT-BUG-NUMBER");

    private static final SubLSymbol _CSETF_RMCT_BUG_NUMBER = makeSymbol("_CSETF-RMCT-BUG-NUMBER");

    private static final SubLSymbol RMCT_CREATION_DATE = makeSymbol("RMCT-CREATION-DATE");

    private static final SubLSymbol _CSETF_RMCT_CREATION_DATE = makeSymbol("_CSETF-RMCT-CREATION-DATE");

    private static final SubLSymbol RMCT_CREATOR = makeSymbol("RMCT-CREATOR");

    private static final SubLSymbol _CSETF_RMCT_CREATOR = makeSymbol("_CSETF-RMCT-CREATOR");

    private static final SubLSymbol $sym29$RMCT_WORKING_ = makeSymbol("RMCT-WORKING?");

    private static final SubLSymbol $sym30$_CSETF_RMCT_WORKING_ = makeSymbol("_CSETF-RMCT-WORKING?");























    private static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REMOVAL_MODULE_COST_TEST = makeSymbol("MAKE-REMOVAL-MODULE-COST-TEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_COST_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-COST-TEST-METHOD");

    private static final SubLSymbol $removal_module_cost_tests$ = makeSymbol("*REMOVAL-MODULE-COST-TESTS*");



    private static final SubLSymbol $sym50$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol $sym52$_ = makeSymbol("<");



    private static final SubLSymbol $sym54$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLList $list55 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T) });

    private static final SubLList $list56 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));







    private static final SubLSymbol DEFINE_REMOVAL_MODULE_COST_TEST_INT = makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST-INT");

    private static final SubLSymbol DEFINE_REMOVAL_MODULE_COST_TEST = makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST");





    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");









    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");











    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol $MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");

    private static final SubLSymbol $HANDLE_ONE_OUTPUT_GENERATE_RESULT = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");





    private static final SubLString $str84$___RMCT__S__S____ = makeString("~&:RMCT ~S ~S -> ");



    private static final SubLString $str86$Unknown_output_format__A = makeString("Unknown output format ~A");

    private static final SubLString $str87$_S____3f___ = makeString("~S (~,3f)~%");

    public static SubLObject removal_module_cost_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_module_cost_test_p(final SubLObject v_object) {
        return v_object.getClass() == $removal_module_cost_test_native.class ? T : NIL;
    }

    public static SubLObject rmct_hl_module(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rmct_id(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rmct_sentence(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rmct_mt(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rmct_comment(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rmct_kb(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject rmct_owner(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject rmct_bug_number(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject rmct_creation_date(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject rmct_creator(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject rmct_workingP(final SubLObject v_object) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject _csetf_rmct_hl_module(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rmct_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rmct_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rmct_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rmct_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rmct_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rmct_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_rmct_bug_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_rmct_creation_date(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_rmct_creator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_rmct_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_module_cost_test_p(v_object) : "removal_module_cost_tests.removal_module_cost_test_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject make_removal_module_cost_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $removal_module_cost_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HL_MODULE)) {
                _csetf_rmct_hl_module(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_rmct_id(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_rmct_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($MT)) {
                            _csetf_rmct_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($COMMENT)) {
                                _csetf_rmct_comment(v_new, current_value);
                            } else
                                if (pcase_var.eql($KB)) {
                                    _csetf_rmct_kb(v_new, current_value);
                                } else
                                    if (pcase_var.eql($OWNER)) {
                                        _csetf_rmct_owner(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($BUG_NUMBER)) {
                                            _csetf_rmct_bug_number(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($CREATION_DATE)) {
                                                _csetf_rmct_creation_date(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($CREATOR)) {
                                                    _csetf_rmct_creator(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($WORKING_)) {
                                                        _csetf_rmct_workingP(v_new, current_value);
                                                    } else {
                                                        Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                                                    }










        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_module_cost_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOVAL_MODULE_COST_TEST, ELEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HL_MODULE, rmct_hl_module(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, rmct_id(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, rmct_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, rmct_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, rmct_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, rmct_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, rmct_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $BUG_NUMBER, rmct_bug_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_DATE, rmct_creation_date(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATOR, rmct_creator(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, rmct_workingP(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOVAL_MODULE_COST_TEST, ELEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_module_cost_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_module_cost_test(obj, visitor_fn);
    }

    public static SubLObject removal_modules_with_removal_module_cost_tests() {
        SubLObject hl_modules = hash_table_utilities.hash_table_keys($removal_module_cost_tests$.getGlobalValue());
        hl_modules = Sort.sort(hl_modules, symbol_function($sym50$TERM__), symbol_function(HL_MODULE_NAME));
        return hl_modules;
    }

    public static SubLObject removal_module_cost_tests(final SubLObject hl_module) {
        SubLObject tests = copy_list(gethash(hl_module, $removal_module_cost_tests$.getGlobalValue(), UNPROVIDED));
        tests = Sort.sort(tests, symbol_function($sym52$_), symbol_function(RMCT_ID));
        return tests;
    }

    public static SubLObject some_removal_module_cost_testsP(final SubLObject hl_module) {
        return list_utilities.sublisp_boolean(gethash(hl_module, $removal_module_cost_tests$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject removal_module_cost_test_name(final SubLObject rmct) {
        return list(inference_modules.hl_module_name(rmct_hl_module(rmct)), rmct_id(rmct), $COST);
    }

    public static SubLObject removal_module_cost_test_id(final SubLObject rmct) {
        return rmct_id(rmct);
    }

    public static SubLObject removal_module_cost_test_mt(final SubLObject rmct) {
        return rmct_mt(rmct);
    }

    public static SubLObject removal_module_cost_test_sentence(final SubLObject rmct) {
        return rmct_sentence(rmct);
    }

    public static SubLObject removal_module_cost_test_owner(final SubLObject rmct) {
        return rmct_owner(rmct);
    }

    public static SubLObject removal_module_cost_test_comment(final SubLObject rmct) {
        return rmct_comment(rmct);
    }

    public static SubLObject removal_module_cost_test_kb(final SubLObject rmct) {
        return rmct_kb(rmct);
    }

    public static SubLObject removal_module_cost_test_workingP(final SubLObject rmct) {
        return rmct_workingP(rmct);
    }

    public static SubLObject removal_module_cost_test_predicate(final SubLObject rmct) {
        final SubLObject hl_module = rmct_hl_module(rmct);
        if (NIL != hl_module) {
            final SubLObject predicate = inference_modules.hl_module_predicate(hl_module);
            return predicate;
        }
        return NIL;
    }

    public static SubLObject removal_module_cost_test_mentions_invalid_constantP(final SubLObject rmct) {
        return makeBoolean((NIL != list_utilities.tree_find_if($sym54$INVALID_CONSTANT_, removal_module_cost_test_mt(rmct), UNPROVIDED)) || (NIL != list_utilities.tree_find_if($sym54$INVALID_CONSTANT_, removal_module_cost_test_sentence(rmct), UNPROVIDED)));
    }

    public static SubLObject removal_module_cost_test_invalid_constants(final SubLObject rmct) {
        return remove_duplicates(append(cycl_utilities.expression_gather(removal_module_cost_test_mt(rmct), $sym54$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(removal_module_cost_test_sentence(rmct), $sym54$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject define_removal_module_cost_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        SubLObject id = NIL;
        SubLObject sentence = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        id = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        sentence = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$1, $list56, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $$EverythingPSC;
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
        return list(new SubLObject[]{ DEFINE_REMOVAL_MODULE_COST_TEST_INT, name, id, sentence, mt, kb, owner, comment, bug, created, creator, workingP });
    }

    public static SubLObject define_removal_module_cost_test_int(final SubLObject name, final SubLObject id, final SubLObject sentence, final SubLObject mt, final SubLObject kb, final SubLObject owner, final SubLObject comment, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP) {
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
            final SubLObject test = make_removal_module_cost_test(list(new SubLObject[]{ $HL_MODULE, hl_module, $ID, id, $SENTENCE, sentence, $MT, mt, $COMMENT, comment, $KB, kb, $OWNER, owner, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP }));
            SubLObject existing_tests = gethash(hl_module, $removal_module_cost_tests$.getGlobalValue(), UNPROVIDED);
            existing_tests = delete(id, existing_tests, symbol_function(EQL), symbol_function(RMCT_ID), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            existing_tests = cons(test, existing_tests);
            sethash(hl_module, $removal_module_cost_tests$.getGlobalValue(), existing_tests);
            cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
            return test;
        }
        return NIL;
    }

    public static SubLObject clear_removal_module_cost_tests() {
        clrhash($removal_module_cost_tests$.getGlobalValue());
        return NIL;
    }

    public static SubLObject run_all_removal_module_cost_tests(SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
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
        return cyc_testing.run_all_loaded_cyc_tests(stream, $TERSE, NIL, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $RMCT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_removal_module_cost_tests_for_pred(final SubLObject pred, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject hl_modules = cdolist_list_var = inference_modules.removal_modules_specific(pred);
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject partial_test_runs = run_removal_module_cost_tests_int(hl_module, output_format, stream);
            test_runs = nconc(test_runs, partial_test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        return test_runs;
    }

    public static SubLObject run_removal_module_cost_tests_blocking(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_cost_tests(name, output_format, stream);
    }

    public static SubLObject run_removal_module_cost_tests(final SubLObject name, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        SubLObject test_runs = NIL;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        if (NIL != inference_modules.removal_module_p(hl_module)) {
            final SubLObject partial_test_runs = run_removal_module_cost_tests_int(hl_module, output_format, stream);
            test_runs = nconc(test_runs, partial_test_runs);
        }
        return test_runs;
    }

    public static SubLObject run_removal_module_cost_tests_int(final SubLObject hl_module, final SubLObject output_format, final SubLObject stream) {
        SubLObject test_runs = NIL;
        SubLObject cdolist_list_var = removal_module_cost_tests(hl_module);
        SubLObject rmct = NIL;
        rmct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test_run = run_removal_module_cost_test(rmct, output_format, stream);
            test_runs = cons(test_run, test_runs);
            cdolist_list_var = cdolist_list_var.rest();
            rmct = cdolist_list_var.first();
        } 
        return nreverse(test_runs);
    }

    public static SubLObject run_removal_module_cost_test_number_blocking(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_removal_module_cost_test_number(name, number, output_format, stream);
    }

    public static SubLObject run_removal_module_cost_test_number(final SubLObject name, final SubLObject number, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject hl_module = inference_modules.find_hl_module_by_name(name);
        SubLObject test = NIL;
        if ((NIL != inference_modules.removal_module_p(hl_module)) && (NIL == test)) {
            SubLObject csome_list_var = removal_module_cost_tests(hl_module);
            SubLObject rmct = NIL;
            rmct = csome_list_var.first();
            while ((NIL == test) && (NIL != csome_list_var)) {
                if (number.numE(rmct_id(rmct))) {
                    test = rmct;
                }
                csome_list_var = csome_list_var.rest();
                rmct = csome_list_var.first();
            } 
        }
        return run_removal_module_cost_test(test, output_format, stream);
    }

    public static SubLObject run_removal_module_cost_test(final SubLObject rmct, SubLObject output_format, SubLObject stream) {
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != removal_module_cost_test_p(rmct) : "removal_module_cost_tests.removal_module_cost_test_p(rmct) " + "CommonSymbols.NIL != removal_module_cost_tests.removal_module_cost_test_p(rmct) " + rmct;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject name = removal_module_cost_test_name(rmct);
        if (NIL == run_removal_module_cost_testP(rmct)) {
            return cyc_testing.new_cyc_test_run($RMCT, name, $NOT_RUN, NIL);
        }
        if (NIL != removal_module_cost_test_mentions_invalid_constantP(rmct)) {
            return cyc_testing.new_cyc_test_run($RMCT, name, $INVALID, NIL);
        }
        final SubLObject hl_module = rmct_hl_module(rmct);
        final SubLObject sentence = rmct_sentence(rmct);
        final SubLObject mt = rmct_mt(rmct);
        print_removal_module_cost_test_preamble(rmct, output_format, stream);
        thread.resetMultipleValues();
        final SubLObject result = run_removal_module_cost_test_comparison(hl_module, sentence, mt);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject test_run = cyc_testing.new_cyc_test_run($RMCT, name, result, time);
        print_removal_module_cost_test_result(rmct, result, time, output_format, stream);
        return test_run;
    }

    public static SubLObject run_removal_module_cost_testP(final SubLObject rmct) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test_kb = rmct_kb(rmct);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue(thread))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject run_removal_module_cost_test_comparison(final SubLObject hl_module, final SubLObject sentence, final SubLObject mt) {
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
                    final SubLObject time_var = get_internal_real_time();
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject productivity_cost_estimate = inference_modules.hl_module_cost(hl_module, sentence, $POS);
                        SubLObject actual_productivity = ZERO_INTEGER;
                        thread.resetMultipleValues();
                        final SubLObject maybe_output_iterator = inference_worker_removal.hl_module_guts($MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR, hl_module, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject encoded_bindings = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != maybe_output_iterator) {
                            if (maybe_output_iterator.isList()) {
                                actual_productivity = length(maybe_output_iterator);
                            } else
                                if (NIL != iteration.iterator_p(maybe_output_iterator)) {
                                    SubLObject n = ZERO_INTEGER;
                                    final SubLObject _prev_bind_0_$3 = backward.$inference_expand_sense$.currentBinding(thread);
                                    try {
                                        backward.$inference_expand_sense$.bind($POS, thread);
                                        SubLObject bindings_list = NIL;
                                        SubLObject valid;
                                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                            thread.resetMultipleValues();
                                            final SubLObject output_thing = iteration.iteration_next(maybe_output_iterator);
                                            valid = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != valid) {
                                                thread.resetMultipleValues();
                                                final SubLObject successP = inference_worker_removal.hl_module_guts($HANDLE_ONE_OUTPUT_GENERATE_RESULT, sentence, hl_module, output_thing, encoded_bindings, UNPROVIDED);
                                                final SubLObject support = thread.secondMultipleValue();
                                                final SubLObject unify_bindings = thread.thirdMultipleValue();
                                                final SubLObject more_supports = thread.fourthMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != successP) && (NIL == subl_promotions.memberP(unify_bindings, bindings_list, symbol_function(EQUAL), UNPROVIDED))) {
                                                    bindings_list = cons(unify_bindings, bindings_list);
                                                    n = add(n, ONE_INTEGER);
                                                }
                                                actual_productivity = n;
                                            }
                                        }
                                    } finally {
                                        backward.$inference_expand_sense$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }

                        }
                        v_answer = generic_cost_test_comparison(productivity_cost_estimate, actual_productivity);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$2, thread);
                    }
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
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

    public static SubLObject generic_cost_test_comparison(final SubLObject productivity_cost_estimate, final SubLObject actual_productivity) {
        if (productivity_cost_estimate.numLE(multiply(actual_productivity, THREE_INTEGER)) && productivity_cost_estimate.numGE(subtract(actual_productivity, THREE_INTEGER))) {
            return $SUCCESS;
        }
        return $FAILURE;
    }

    public static SubLObject print_removal_module_cost_test_preamble(final SubLObject rmct, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            final SubLObject hl_module = rmct_hl_module(rmct);
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            final SubLObject id = rmct_id(rmct);
            format(stream, $str84$___RMCT__S__S____, name, id);
            force_output(stream);
        } else
            if (!output_format.eql($POST_BUILD)) {
                format(stream, $str86$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject print_removal_module_cost_test_result(final SubLObject rmct, final SubLObject result, final SubLObject time, final SubLObject output_format, final SubLObject stream) {
        if (output_format.eql($STANDARD)) {
            format(stream, $str87$_S____3f___, result, time);
            force_output(stream);
        } else
            if (output_format.eql($POST_BUILD)) {
                final SubLObject hl_module = rmct_hl_module(rmct);
                final SubLObject name = inference_modules.hl_module_name(hl_module);
                final SubLObject id = rmct_id(rmct);
                final SubLObject owner = rmct_owner(rmct);
                cyc_testing.print_post_build_test_summary(stream, result, $RMCT, list(name, id), time, owner);
            } else {
                format(stream, $str86$Unknown_output_format__A, output_format);
            }

        return NIL;
    }

    public static SubLObject declare_removal_module_cost_tests_file() {
        declareFunction(me, "removal_module_cost_test_print_function_trampoline", "REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "removal_module_cost_test_p", "REMOVAL-MODULE-COST-TEST-P", 1, 0, false);
        new removal_module_cost_tests.$removal_module_cost_test_p$UnaryFunction();
        declareFunction(me, "rmct_hl_module", "RMCT-HL-MODULE", 1, 0, false);
        declareFunction(me, "rmct_id", "RMCT-ID", 1, 0, false);
        declareFunction(me, "rmct_sentence", "RMCT-SENTENCE", 1, 0, false);
        declareFunction(me, "rmct_mt", "RMCT-MT", 1, 0, false);
        declareFunction(me, "rmct_comment", "RMCT-COMMENT", 1, 0, false);
        declareFunction(me, "rmct_kb", "RMCT-KB", 1, 0, false);
        declareFunction(me, "rmct_owner", "RMCT-OWNER", 1, 0, false);
        declareFunction(me, "rmct_bug_number", "RMCT-BUG-NUMBER", 1, 0, false);
        declareFunction(me, "rmct_creation_date", "RMCT-CREATION-DATE", 1, 0, false);
        declareFunction(me, "rmct_creator", "RMCT-CREATOR", 1, 0, false);
        declareFunction(me, "rmct_workingP", "RMCT-WORKING?", 1, 0, false);
        declareFunction(me, "_csetf_rmct_hl_module", "_CSETF-RMCT-HL-MODULE", 2, 0, false);
        declareFunction(me, "_csetf_rmct_id", "_CSETF-RMCT-ID", 2, 0, false);
        declareFunction(me, "_csetf_rmct_sentence", "_CSETF-RMCT-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_rmct_mt", "_CSETF-RMCT-MT", 2, 0, false);
        declareFunction(me, "_csetf_rmct_comment", "_CSETF-RMCT-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_rmct_kb", "_CSETF-RMCT-KB", 2, 0, false);
        declareFunction(me, "_csetf_rmct_owner", "_CSETF-RMCT-OWNER", 2, 0, false);
        declareFunction(me, "_csetf_rmct_bug_number", "_CSETF-RMCT-BUG-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_rmct_creation_date", "_CSETF-RMCT-CREATION-DATE", 2, 0, false);
        declareFunction(me, "_csetf_rmct_creator", "_CSETF-RMCT-CREATOR", 2, 0, false);
        declareFunction(me, "_csetf_rmct_workingP", "_CSETF-RMCT-WORKING?", 2, 0, false);
        declareFunction(me, "make_removal_module_cost_test", "MAKE-REMOVAL-MODULE-COST-TEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_removal_module_cost_test", "VISIT-DEFSTRUCT-REMOVAL-MODULE-COST-TEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_removal_module_cost_test_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-MODULE-COST-TEST-METHOD", 2, 0, false);
        declareFunction(me, "removal_modules_with_removal_module_cost_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
        declareFunction(me, "removal_module_cost_tests", "REMOVAL-MODULE-COST-TESTS", 1, 0, false);
        declareFunction(me, "some_removal_module_cost_testsP", "SOME-REMOVAL-MODULE-COST-TESTS?", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_name", "REMOVAL-MODULE-COST-TEST-NAME", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_id", "REMOVAL-MODULE-COST-TEST-ID", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_mt", "REMOVAL-MODULE-COST-TEST-MT", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_sentence", "REMOVAL-MODULE-COST-TEST-SENTENCE", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_owner", "REMOVAL-MODULE-COST-TEST-OWNER", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_comment", "REMOVAL-MODULE-COST-TEST-COMMENT", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_kb", "REMOVAL-MODULE-COST-TEST-KB", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_workingP", "REMOVAL-MODULE-COST-TEST-WORKING?", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_predicate", "REMOVAL-MODULE-COST-TEST-PREDICATE", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_mentions_invalid_constantP", "REMOVAL-MODULE-COST-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "removal_module_cost_test_invalid_constants", "REMOVAL-MODULE-COST-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareMacro(me, "define_removal_module_cost_test", "DEFINE-REMOVAL-MODULE-COST-TEST");
        declareFunction(me, "define_removal_module_cost_test_int", "DEFINE-REMOVAL-MODULE-COST-TEST-INT", 11, 0, false);
        declareFunction(me, "clear_removal_module_cost_tests", "CLEAR-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
        declareFunction(me, "run_all_removal_module_cost_tests", "RUN-ALL-REMOVAL-MODULE-COST-TESTS", 0, 4, false);
        declareFunction(me, "run_removal_module_cost_tests_for_pred", "RUN-REMOVAL-MODULE-COST-TESTS-FOR-PRED", 1, 2, false);
        declareFunction(me, "run_removal_module_cost_tests_blocking", "RUN-REMOVAL-MODULE-COST-TESTS-BLOCKING", 1, 2, false);
        declareFunction(me, "run_removal_module_cost_tests", "RUN-REMOVAL-MODULE-COST-TESTS", 1, 2, false);
        declareFunction(me, "run_removal_module_cost_tests_int", "RUN-REMOVAL-MODULE-COST-TESTS-INT", 3, 0, false);
        declareFunction(me, "run_removal_module_cost_test_number_blocking", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER-BLOCKING", 2, 2, false);
        declareFunction(me, "run_removal_module_cost_test_number", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER", 2, 2, false);
        declareFunction(me, "run_removal_module_cost_test", "RUN-REMOVAL-MODULE-COST-TEST", 1, 2, false);
        declareFunction(me, "run_removal_module_cost_testP", "RUN-REMOVAL-MODULE-COST-TEST?", 1, 0, false);
        declareFunction(me, "run_removal_module_cost_test_comparison", "RUN-REMOVAL-MODULE-COST-TEST-COMPARISON", 3, 0, false);
        declareFunction(me, "generic_cost_test_comparison", "GENERIC-COST-TEST-COMPARISON", 2, 0, false);
        declareFunction(me, "print_removal_module_cost_test_preamble", "PRINT-REMOVAL-MODULE-COST-TEST-PREAMBLE", 3, 0, false);
        declareFunction(me, "print_removal_module_cost_test_result", "PRINT-REMOVAL-MODULE-COST-TEST-RESULT", 5, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_module_cost_tests_file() {
        defconstant("*DTP-REMOVAL-MODULE-COST-TEST*", REMOVAL_MODULE_COST_TEST);
        deflexical("*REMOVAL-MODULE-COST-TESTS*", SubLTrampolineFile.maybeDefault($removal_module_cost_tests$, $removal_module_cost_tests$, () -> make_hash_table($int$100, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_removal_module_cost_tests_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_module_cost_test$.getGlobalValue(), symbol_function(REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RMCT_HL_MODULE, _CSETF_RMCT_HL_MODULE);
        def_csetf(RMCT_ID, _CSETF_RMCT_ID);
        def_csetf(RMCT_SENTENCE, _CSETF_RMCT_SENTENCE);
        def_csetf(RMCT_MT, _CSETF_RMCT_MT);
        def_csetf(RMCT_COMMENT, _CSETF_RMCT_COMMENT);
        def_csetf(RMCT_KB, _CSETF_RMCT_KB);
        def_csetf(RMCT_OWNER, _CSETF_RMCT_OWNER);
        def_csetf(RMCT_BUG_NUMBER, _CSETF_RMCT_BUG_NUMBER);
        def_csetf(RMCT_CREATION_DATE, _CSETF_RMCT_CREATION_DATE);
        def_csetf(RMCT_CREATOR, _CSETF_RMCT_CREATOR);
        def_csetf($sym29$RMCT_WORKING_, $sym30$_CSETF_RMCT_WORKING_);
        identity(REMOVAL_MODULE_COST_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_module_cost_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOVAL_MODULE_COST_TEST_METHOD));
        declare_defglobal($removal_module_cost_tests$);
        register_macro_helper(DEFINE_REMOVAL_MODULE_COST_TEST_INT, DEFINE_REMOVAL_MODULE_COST_TEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_module_cost_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_module_cost_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_module_cost_tests_file();
    }

    static {



























































































    }

    public static final class $removal_module_cost_test_native extends SubLStructNative {
        public SubLObject $hl_module;

        public SubLObject $id;

        public SubLObject $sentence;

        public SubLObject $mt;

        public SubLObject $comment;

        public SubLObject $kb;

        public SubLObject $owner;

        public SubLObject $bug_number;

        public SubLObject $creation_date;

        public SubLObject $creator;

        public SubLObject $workingP;

        private static final SubLStructDeclNative structDecl;

        private $removal_module_cost_test_native() {
            this.$hl_module = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$mt = Lisp.NIL;
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
            return this.$comment;
        }

        @Override
        public SubLObject getField7() {
            return this.$kb;
        }

        @Override
        public SubLObject getField8() {
            return this.$owner;
        }

        @Override
        public SubLObject getField9() {
            return this.$bug_number;
        }

        @Override
        public SubLObject getField10() {
            return this.$creation_date;
        }

        @Override
        public SubLObject getField11() {
            return this.$creator;
        }

        @Override
        public SubLObject getField12() {
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
            return this.$comment = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$kb = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$owner = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$bug_number = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$creation_date = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$creator = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$workingP = value;
        }

        static {
            structDecl = makeStructDeclNative($removal_module_cost_test_native.class, REMOVAL_MODULE_COST_TEST, REMOVAL_MODULE_COST_TEST_P, $list2, $list3, new String[]{ "$hl_module", "$id", "$sentence", "$mt", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $removal_module_cost_test_p$UnaryFunction extends UnaryFunction {
        public $removal_module_cost_test_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-MODULE-COST-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_module_cost_test_p(arg1);
        }
    }
}

/**
 * Total time: 522 ms synthetic
 */
