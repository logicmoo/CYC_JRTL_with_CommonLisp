package com.cyc.cycjava.cycl.cyc_testing;


import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cfasl_utilities;
import com.cyc.cycjava.cycl.cyc_testing.inference_unit_tests;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_grammar;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.inference_unit_tests.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_pretty$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class inference_unit_tests extends SubLTranslatedFile {
    public static final SubLFile me = new inference_unit_tests();

    public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.inference_unit_tests";

    public static final String myFingerPrint = "8e37c142c8f536b42fbb635f6a5f70262e9a739c14d9f0541f05b16a4b1cd606";

    // defparameter
    // Definitions
    private static final SubLSymbol $within_inference_unit_testP$ = makeSymbol("*WITHIN-INFERENCE-UNIT-TEST?*");

    // defparameter
    /**
     * Accumulates a list of assertions created by side effect during the execution
     * of an inference unit test, so they can be optionally cleaned up later.
     */
    private static final SubLSymbol $inference_unit_test_assertions_created$ = makeSymbol("*INFERENCE-UNIT-TEST-ASSERTIONS-CREATED*");

    // defconstant
    public static final SubLSymbol $dtp_inference_unit_test$ = makeSymbol("*DTP-INFERENCE-UNIT-TEST*");

    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_inference_unit_test$ = makeSymbol("*CFASL-WIDE-OPCODE-INFERENCE-UNIT-TEST*");





    // deflexical
    // The list of permissible properties for inference unit tests
    private static final SubLSymbol $inference_unit_test_properties$ = makeSymbol("*INFERENCE-UNIT-TEST-PROPERTIES*");

    // deflexical
    // The list of permissible properties for inference unit test followups
    private static final SubLSymbol $inference_unit_test_followup_properties$ = makeSymbol("*INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTIES*");

    // defparameter
    // Whether tests with followups explicitly use a public problem store
    private static final SubLSymbol $test_followups_use_public_problem_storeP$ = makeSymbol("*TEST-FOLLOWUPS-USE-PUBLIC-PROBLEM-STORE?*");



    public static final SubLSymbol INFERENCE_UNIT_TEST = makeSymbol("INFERENCE-UNIT-TEST");

    public static final SubLSymbol INFERENCE_UNIT_TEST_P = makeSymbol("INFERENCE-UNIT-TEST-P");

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("COMMENT"), makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("RESULT"), makeSymbol("HALT-REASON"), makeSymbol("RESULT-TEST"), makeSymbol("FOLLOWUPS"), makeSymbol("BINDINGS"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?"), makeSymbol("SUBTYPE") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("COMMENT"), makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("RESULT"), makeKeyword("HALT-REASON"), makeKeyword("RESULT-TEST"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?"), makeKeyword("SUBTYPE") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("IUT-NAME"), makeSymbol("IUT-COMMENT"), makeSymbol("IUT-SENTENCE"), makeSymbol("IUT-PROPERTIES"), makeSymbol("IUT-RESULT"), makeSymbol("IUT-HALT-REASON"), makeSymbol("IUT-RESULT-TEST"), makeSymbol("IUT-FOLLOWUPS"), makeSymbol("IUT-BINDINGS"), makeSymbol("IUT-KB"), makeSymbol("IUT-OWNER"), makeSymbol("IUT-BUG-NUMBER"), makeSymbol("IUT-CREATION-DATE"), makeSymbol("IUT-CREATOR"), makeSymbol("IUT-WORKING?"), makeSymbol("IUT-SUBTYPE") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-IUT-NAME"), makeSymbol("_CSETF-IUT-COMMENT"), makeSymbol("_CSETF-IUT-SENTENCE"), makeSymbol("_CSETF-IUT-PROPERTIES"), makeSymbol("_CSETF-IUT-RESULT"), makeSymbol("_CSETF-IUT-HALT-REASON"), makeSymbol("_CSETF-IUT-RESULT-TEST"), makeSymbol("_CSETF-IUT-FOLLOWUPS"), makeSymbol("_CSETF-IUT-BINDINGS"), makeSymbol("_CSETF-IUT-KB"), makeSymbol("_CSETF-IUT-OWNER"), makeSymbol("_CSETF-IUT-BUG-NUMBER"), makeSymbol("_CSETF-IUT-CREATION-DATE"), makeSymbol("_CSETF-IUT-CREATOR"), makeSymbol("_CSETF-IUT-WORKING?"), makeSymbol("_CSETF-IUT-SUBTYPE") });



    public static final SubLSymbol INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-UNIT-TEST-P"));

    private static final SubLSymbol IUT_NAME = makeSymbol("IUT-NAME");

    private static final SubLSymbol _CSETF_IUT_NAME = makeSymbol("_CSETF-IUT-NAME");

    private static final SubLSymbol IUT_COMMENT = makeSymbol("IUT-COMMENT");

    private static final SubLSymbol _CSETF_IUT_COMMENT = makeSymbol("_CSETF-IUT-COMMENT");

    private static final SubLSymbol IUT_SENTENCE = makeSymbol("IUT-SENTENCE");

    private static final SubLSymbol _CSETF_IUT_SENTENCE = makeSymbol("_CSETF-IUT-SENTENCE");

    private static final SubLSymbol IUT_PROPERTIES = makeSymbol("IUT-PROPERTIES");

    private static final SubLSymbol _CSETF_IUT_PROPERTIES = makeSymbol("_CSETF-IUT-PROPERTIES");

    private static final SubLSymbol IUT_RESULT = makeSymbol("IUT-RESULT");

    private static final SubLSymbol _CSETF_IUT_RESULT = makeSymbol("_CSETF-IUT-RESULT");

    private static final SubLSymbol IUT_HALT_REASON = makeSymbol("IUT-HALT-REASON");

    private static final SubLSymbol _CSETF_IUT_HALT_REASON = makeSymbol("_CSETF-IUT-HALT-REASON");

    private static final SubLSymbol IUT_RESULT_TEST = makeSymbol("IUT-RESULT-TEST");

    private static final SubLSymbol _CSETF_IUT_RESULT_TEST = makeSymbol("_CSETF-IUT-RESULT-TEST");

    private static final SubLSymbol IUT_FOLLOWUPS = makeSymbol("IUT-FOLLOWUPS");

    private static final SubLSymbol _CSETF_IUT_FOLLOWUPS = makeSymbol("_CSETF-IUT-FOLLOWUPS");

    private static final SubLSymbol IUT_BINDINGS = makeSymbol("IUT-BINDINGS");

    private static final SubLSymbol _CSETF_IUT_BINDINGS = makeSymbol("_CSETF-IUT-BINDINGS");

    private static final SubLSymbol IUT_KB = makeSymbol("IUT-KB");

    private static final SubLSymbol _CSETF_IUT_KB = makeSymbol("_CSETF-IUT-KB");

    private static final SubLSymbol IUT_OWNER = makeSymbol("IUT-OWNER");

    private static final SubLSymbol _CSETF_IUT_OWNER = makeSymbol("_CSETF-IUT-OWNER");

    private static final SubLSymbol IUT_BUG_NUMBER = makeSymbol("IUT-BUG-NUMBER");

    private static final SubLSymbol _CSETF_IUT_BUG_NUMBER = makeSymbol("_CSETF-IUT-BUG-NUMBER");

    private static final SubLSymbol IUT_CREATION_DATE = makeSymbol("IUT-CREATION-DATE");

    private static final SubLSymbol _CSETF_IUT_CREATION_DATE = makeSymbol("_CSETF-IUT-CREATION-DATE");

    private static final SubLSymbol IUT_CREATOR = makeSymbol("IUT-CREATOR");

    private static final SubLSymbol _CSETF_IUT_CREATOR = makeSymbol("_CSETF-IUT-CREATOR");

    private static final SubLSymbol $sym38$IUT_WORKING_ = makeSymbol("IUT-WORKING?");

    private static final SubLSymbol $sym39$_CSETF_IUT_WORKING_ = makeSymbol("_CSETF-IUT-WORKING?");

    private static final SubLSymbol IUT_SUBTYPE = makeSymbol("IUT-SUBTYPE");

    private static final SubLSymbol _CSETF_IUT_SUBTYPE = makeSymbol("_CSETF-IUT-SUBTYPE");

































    private static final SubLString $str58$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_INFERENCE_UNIT_TEST = makeSymbol("MAKE-INFERENCE-UNIT-TEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INFERENCE_UNIT_TEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-UNIT-TEST-METHOD");

    private static final SubLSymbol $sym64$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLString $str65$Cannot_build_inference_test_recip = makeString("Cannot build inference test recipe; symbolic form of result test function ~A unknown.");



    private static final SubLInteger $int$513 = makeInteger(513);

    private static final SubLSymbol CFASL_INPUT_INFERENCE_UNIT_TEST = makeSymbol("CFASL-INPUT-INFERENCE-UNIT-TEST");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD");

    private static final SubLString $str70$Deserialization_produced__A_inste = makeString("Deserialization produced ~A instead of ~A for IUT ~A.");

    private static final SubLSymbol $inference_unit_test_names_in_order$ = makeSymbol("*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*");

    private static final SubLSymbol $inference_unit_tests_by_name$ = makeSymbol("*INFERENCE-UNIT-TESTS-BY-NAME*");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLList $list74 = list(list(makeSymbol("TEST-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list75 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym78$NAME = makeUninternedSymbol("NAME");





    private static final SubLSymbol FIND_INFERENCE_UNIT_TEST_BY_NAME = makeSymbol("FIND-INFERENCE-UNIT-TEST-BY-NAME");

    private static final SubLList $list82 = list(makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("EXPECTED-RESULT"), makeSymbol("EXPECTED-RESULT-TEST"), makeSymbol("EXPECTED-HALT-REASON"));





    private static final SubLList $list85 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("EXPECTED-RESULT"), list(makeSymbol("EXPECTED-HALT-REASON"), makeKeyword("EXHAUST-TOTAL")), makeSymbol("EXPECTED-RESULT-TEST"), makeSymbol("COMMENT"), makeSymbol("FOLLOWUPS"), makeSymbol("BINDINGS"), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T), makeSymbol("SUBTYPE"), makeSymbol("&ALLOW-OTHER-KEYS") });

    private static final SubLSymbol $EXPECTED_HALT_REASON = makeKeyword("EXPECTED-HALT-REASON");



    private static final SubLSymbol $EXPECTED_RESULT_TEST = makeKeyword("EXPECTED-RESULT-TEST");









    private static final SubLSymbol VALIDATE_INFERENCE_UNIT_TEST_PLIST = makeSymbol("VALIDATE-INFERENCE-UNIT-TEST-PLIST");



    private static final SubLSymbol DEFINE_INFERENCE_UNIT_TEST_INTERNAL = makeSymbol("DEFINE-INFERENCE-UNIT-TEST-INTERNAL");

    private static final SubLSymbol CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS = makeSymbol("CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS");

    private static final SubLSymbol DEFINE_INFERENCE_UNIT_TEST = makeSymbol("DEFINE-INFERENCE-UNIT-TEST");

    private static final SubLList $list98 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("NAME"), makeKeyword("COMMENT"), makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("EXPECTED-RESULT"), makeKeyword("EXPECTED-HALT-REASON"), makeKeyword("EXPECTED-RESULT-TEST"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG"), makeKeyword("JIRA"), makeKeyword("CREATION"), makeKeyword("CREATOR"), makeKeyword("WORKING?"), makeKeyword("SUBTYPE") });



    private static final SubLString $str101$_s_is_not_a_known__a = makeString("~s is not a known ~a");

    private static final SubLSymbol INFERENCE_UNIT_TEST_PROPERTY_P = makeSymbol("INFERENCE-UNIT-TEST-PROPERTY-P");

    private static final SubLList $list103 = list(makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("EXPECTED-RESULT"), makeKeyword("EXPECTED-HALT-REASON"), makeKeyword("EXPECTED-RESULT-TEST"));

    private static final SubLSymbol VALIDATE_INFERENCE_UNIT_TEST_FOLLOWUP_PLIST = makeSymbol("VALIDATE-INFERENCE-UNIT-TEST-FOLLOWUP-PLIST");

    private static final SubLSymbol INFERENCE_UNIT_TEST_FOLLOWUP_PROPERTY_P = makeSymbol("INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTY-P");







    private static final SubLSymbol BINDING_LISTS_P = makeSymbol("BINDING-LISTS-P");

    private static final SubLSymbol QUERY_HALT_REASON_P = makeSymbol("QUERY-HALT-REASON-P");

    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    private static final SubLSymbol INFERENCE_TEST_COMMENT_P = makeSymbol("INFERENCE-TEST-COMMENT-P");



    private static final SubLSymbol INFERENCE_UNIT_TEST_FOLLOWUP_P = makeSymbol("INFERENCE-UNIT-TEST-FOLLOWUP-P");

    private static final SubLSymbol SUBL_VARIABLE_BINDING_LIST_P = makeSymbol("SUBL-VARIABLE-BINDING-LIST-P");



    private static final SubLSymbol INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");









    private static final SubLSymbol $kw122$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLString $str123$The_test__S_is_not_queried_with__ = makeString("The test ~S is not queried with :conditional-sentence? T.");









    private static final SubLSymbol CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");

    private static final SubLSymbol CYC_TEST_P = makeSymbol("CYC-TEST-P");

    private static final SubLSymbol FIND_CYC_TEST = makeSymbol("FIND-CYC-TEST");

    private static final SubLString $str131$No_test_with_name__a_was_found = makeString("No test with name ~a was found");













    private static final SubLString $str138$Previous_inference_was_not_browsa = makeString("Previous inference was not browsable");







    private static final SubLList $list142 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL);



    private static final SubLSymbol $BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");



    private static final SubLString $str146$___IUT__S____ = makeString("~&:IUT ~S -> ");

    private static final SubLString $str147$_S____3f___ = makeString("~S (~,3f)~%");



    private static final SubLString $str149$__Failure_when_asking = makeString("~%Failure when asking");

    private static final SubLString $str150$_______S = makeString("~%~%  ~S");

    private static final SubLString $str151$____with_properties__s = makeString("~%~%with properties ~s");

    private static final SubLString $str152$__Result_test____s = makeString("~%Result test : ~s");

    private static final SubLString $str153$__Actual_result______s = makeString("~%Actual result   : ~s");

    private static final SubLString $str154$__Expected_result____s = makeString("~%Expected result : ~s");

    private static final SubLString $str155$__Actual_halt_reason______s = makeString("~%Actual halt reason   : ~s");

    private static final SubLString $str156$__Expected_halt_reason____s = makeString("~%Expected halt reason : ~s");

    private static final SubLString $str157$____ = makeString("~%~%");

    public static SubLObject within_inference_unit_testP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_inference_unit_testP$.getDynamicValue(thread);
    }

    public static SubLObject note_assertion_for_inference_unit_test(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $inference_unit_test_assertions_created$.setDynamicValue(cons(assertion, $inference_unit_test_assertions_created$.getDynamicValue(thread)), thread);
        return assertion;
    }

    public static SubLObject inference_unit_test_cleanup() {
        return NIL;
    }

    public static SubLObject inference_unit_test_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject inference_unit_test_p(final SubLObject v_object) {
        return v_object.getClass() == inference_unit_tests.$inference_unit_test_native.class ? T : NIL;
    }

    public static SubLObject iut_name(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject iut_comment(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject iut_sentence(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject iut_properties(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject iut_result(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject iut_halt_reason(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject iut_result_test(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject iut_followups(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject iut_bindings(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject iut_kb(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject iut_owner(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject iut_bug_number(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject iut_creation_date(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField14();
    }

    public static SubLObject iut_creator(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField15();
    }

    public static SubLObject iut_workingP(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField16();
    }

    public static SubLObject iut_subtype(final SubLObject v_object) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.getField17();
    }

    public static SubLObject _csetf_iut_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_iut_comment(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_iut_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_iut_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_iut_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_iut_halt_reason(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_iut_result_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_iut_followups(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_iut_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_iut_kb(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_iut_owner(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_iut_bug_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_iut_creation_date(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_iut_creator(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_iut_workingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_iut_subtype(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_unit_test_p(v_object) : "inference_unit_tests.inference_unit_test_p(v_object) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(v_object) " + v_object;
        return v_object.setField17(value);
    }

    public static SubLObject make_inference_unit_test(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new inference_unit_tests.$inference_unit_test_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_iut_name(v_new, current_value);
            } else
                if (pcase_var.eql($COMMENT)) {
                    _csetf_iut_comment(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_iut_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROPERTIES)) {
                            _csetf_iut_properties(v_new, current_value);
                        } else
                            if (pcase_var.eql($RESULT)) {
                                _csetf_iut_result(v_new, current_value);
                            } else
                                if (pcase_var.eql($HALT_REASON)) {
                                    _csetf_iut_halt_reason(v_new, current_value);
                                } else
                                    if (pcase_var.eql($RESULT_TEST)) {
                                        _csetf_iut_result_test(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($FOLLOWUPS)) {
                                            _csetf_iut_followups(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($BINDINGS)) {
                                                _csetf_iut_bindings(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($KB)) {
                                                    _csetf_iut_kb(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($OWNER)) {
                                                        _csetf_iut_owner(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($BUG_NUMBER)) {
                                                            _csetf_iut_bug_number(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($CREATION_DATE)) {
                                                                _csetf_iut_creation_date(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($CREATOR)) {
                                                                    _csetf_iut_creator(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($WORKING_)) {
                                                                        _csetf_iut_workingP(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($SUBTYPE)) {
                                                                            _csetf_iut_subtype(v_new, current_value);
                                                                        } else {
                                                                            Errors.error($str58$Invalid_slot__S_for_construction_, current_arg);
                                                                        }















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_inference_unit_test(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INFERENCE_UNIT_TEST, SIXTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, iut_name(obj));
        funcall(visitor_fn, obj, $SLOT, $COMMENT, iut_comment(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, iut_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, iut_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, iut_result(obj));
        funcall(visitor_fn, obj, $SLOT, $HALT_REASON, iut_halt_reason(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT_TEST, iut_result_test(obj));
        funcall(visitor_fn, obj, $SLOT, $FOLLOWUPS, iut_followups(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, iut_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $KB, iut_kb(obj));
        funcall(visitor_fn, obj, $SLOT, $OWNER, iut_owner(obj));
        funcall(visitor_fn, obj, $SLOT, $BUG_NUMBER, iut_bug_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATION_DATE, iut_creation_date(obj));
        funcall(visitor_fn, obj, $SLOT, $CREATOR, iut_creator(obj));
        funcall(visitor_fn, obj, $SLOT, $WORKING_, iut_workingP(obj));
        funcall(visitor_fn, obj, $SLOT, $SUBTYPE, iut_subtype(obj));
        funcall(visitor_fn, obj, $END, MAKE_INFERENCE_UNIT_TEST, SIXTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_inference_unit_test_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_inference_unit_test(obj, visitor_fn);
    }

    public static SubLObject inference_unit_test_name(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_name(test);
    }

    public static SubLObject inference_unit_test_comment(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_comment(test);
    }

    public static SubLObject inference_unit_test_sentence(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_sentence(test);
    }

    public static SubLObject inference_unit_test_properties(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_properties(test);
    }

    public static SubLObject inference_unit_test_expected_result(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_result(test);
    }

    public static SubLObject inference_unit_test_expected_halt_reason(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_halt_reason(test);
    }

    public static SubLObject inference_unit_test_result_test(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_result_test(test);
    }

    public static SubLObject inference_unit_test_followups(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_followups(test);
    }

    public static SubLObject inference_unit_test_bindings(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_bindings(test);
    }

    public static SubLObject inference_unit_test_kb(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_kb(test);
    }

    public static SubLObject inference_unit_test_owner(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_owner(test);
    }

    public static SubLObject inference_unit_test_bug_number(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_bug_number(test);
    }

    public static SubLObject inference_unit_test_creation_date(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_creation_date(test);
    }

    public static SubLObject inference_unit_test_creator(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_creator(test);
    }

    public static SubLObject inference_unit_test_workingP(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_workingP(test);
    }

    public static SubLObject inference_unit_test_subtype(final SubLObject test) {
        assert NIL != inference_unit_test_p(test) : "inference_unit_tests.inference_unit_test_p(test) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_p(test) " + test;
        return iut_subtype(test);
    }

    public static SubLObject inference_unit_test_mentions_invalid_constantP(final SubLObject iut) {
        return makeBoolean((NIL != list_utilities.tree_find_if(symbol_function($sym64$INVALID_CONSTANT_), inference_unit_test_sentence(iut), UNPROVIDED)) || (NIL != list_utilities.tree_find_if(symbol_function($sym64$INVALID_CONSTANT_), inference_unit_test_followups(iut), UNPROVIDED)));
    }

    public static SubLObject inference_unit_test_invalid_constants(final SubLObject iut) {
        return remove_duplicates(append(cycl_utilities.expression_gather(inference_unit_test_sentence(iut), $sym64$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.expression_gather(inference_unit_test_followups(iut), $sym64$INVALID_CONSTANT_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_unit_test_recipe(final SubLObject test) {
        final SubLObject raw_result_test = inference_unit_test_result_test(test);
        final SubLObject result_test = inference_unit_result_test_recipe(raw_result_test);
        SubLObject recipe = NIL;
        if ((NIL == result_test) && raw_result_test.isFunction()) {
            Errors.error($str65$Cannot_build_inference_test_recip, raw_result_test);
        }
        recipe = putf(recipe, $NAME, inference_unit_test_name(test));
        recipe = putf(recipe, $COMMENT, inference_unit_test_comment(test));
        recipe = putf(recipe, $SENTENCE, inference_unit_test_sentence(test));
        recipe = putf(recipe, $PROPERTIES, inference_unit_test_properties(test));
        recipe = putf(recipe, $RESULT, inference_unit_test_expected_result(test));
        recipe = putf(recipe, $HALT_REASON, inference_unit_test_expected_halt_reason(test));
        recipe = putf(recipe, $RESULT_TEST, result_test);
        recipe = putf(recipe, $FOLLOWUPS, inference_unit_test_followups(test));
        recipe = putf(recipe, $BINDINGS, inference_unit_test_bindings(test));
        recipe = putf(recipe, $KB, inference_unit_test_kb(test));
        recipe = putf(recipe, $OWNER, inference_unit_test_owner(test));
        recipe = putf(recipe, $BUG_NUMBER, inference_unit_test_bug_number(test));
        recipe = putf(recipe, $CREATION_DATE, inference_unit_test_creation_date(test));
        recipe = putf(recipe, $CREATOR, inference_unit_test_creator(test));
        recipe = putf(recipe, $WORKING_, inference_unit_test_workingP(test));
        recipe = putf(recipe, $SUBTYPE, inference_unit_test_subtype(test));
        return recipe;
    }

    public static SubLObject inference_unit_result_test_recipe(final SubLObject result_test) {
        if (result_test.isSymbol()) {
            return result_test;
        }
        SubLObject test_recipe = NIL;
        test_recipe = hash_table_utilities.hash_test_to_symbol(result_test);
        if (NIL != list_utilities.sublisp_boolean(test_recipe)) {
            return test_recipe;
        }
        return NIL;
    }

    public static SubLObject new_inference_unit_test_from_recipe(final SubLObject recipe) {
        final SubLObject name_tail = property_list_member($NAME, recipe);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, recipe);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject sentence_tail = property_list_member($SENTENCE, recipe);
        final SubLObject sentence = (NIL != sentence_tail) ? cadr(sentence_tail) : NIL;
        final SubLObject properties_tail = property_list_member($PROPERTIES, recipe);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject expected_result_tail = property_list_member($EXPECTED_RESULT, recipe);
        final SubLObject expected_result = (NIL != expected_result_tail) ? cadr(expected_result_tail) : NIL;
        final SubLObject halt_reason_tail = property_list_member($HALT_REASON, recipe);
        final SubLObject halt_reason = (NIL != halt_reason_tail) ? cadr(halt_reason_tail) : NIL;
        final SubLObject result_test_tail = property_list_member($RESULT_TEST, recipe);
        final SubLObject result_test = (NIL != result_test_tail) ? cadr(result_test_tail) : NIL;
        final SubLObject followups_tail = property_list_member($FOLLOWUPS, recipe);
        final SubLObject followups = (NIL != followups_tail) ? cadr(followups_tail) : NIL;
        final SubLObject bindings_tail = property_list_member($BINDINGS, recipe);
        final SubLObject v_bindings = (NIL != bindings_tail) ? cadr(bindings_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, recipe);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : NIL;
        final SubLObject owner_tail = property_list_member($OWNER, recipe);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject bug_number_tail = property_list_member($BUG_NUMBER, recipe);
        final SubLObject bug_number = (NIL != bug_number_tail) ? cadr(bug_number_tail) : NIL;
        final SubLObject creation_date_tail = property_list_member($CREATION_DATE, recipe);
        final SubLObject creation_date = (NIL != creation_date_tail) ? cadr(creation_date_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, recipe);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, recipe);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : NIL;
        final SubLObject subtype_tail = property_list_member($SUBTYPE, recipe);
        final SubLObject subtype = (NIL != subtype_tail) ? cadr(subtype_tail) : NIL;
        return define_inference_unit_test_internal(name, comment, sentence, v_properties, expected_result, halt_reason, result_test, followups, v_bindings, kb, owner, bug_number, creation_date, creator, workingP, subtype);
    }

    public static SubLObject cfasl_output_object_inference_unit_test_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_inference_unit_test(v_object, stream);
    }

    public static SubLObject cfasl_output_inference_unit_test(final SubLObject test, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_inference_unit_test$.getGlobalValue(), stream);
        cfasl_output_inference_unit_test_internal(test, stream);
        return test;
    }

    public static SubLObject cfasl_output_inference_unit_test_internal(final SubLObject test, final SubLObject stream) {
        final SubLObject recipe = inference_unit_test_recipe(test);
        cfasl_output(recipe, stream);
        return test;
    }

    public static SubLObject cfasl_input_inference_unit_test(final SubLObject stream) {
        final SubLObject recipe = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_inference_unit_test_from_recipe(recipe);
    }

    public static SubLObject test_inference_unit_test_serialization(final SubLObject iut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_recipe = inference_unit_test_recipe(iut);
        SubLObject new_iut = NIL;
        new_iut = cfasl_utilities.cfasl_copy_object(iut);
        final SubLObject new_recipe = inference_unit_test_recipe(new_iut);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.slow_plists_equalP(old_recipe, new_recipe, EQUALP))) {
            Errors.error($str70$Deserialization_produced__A_inste, new_recipe, old_recipe, iut);
        }
        return iut;
    }

    public static SubLObject find_inference_unit_test_by_name(final SubLObject name) {
        return gethash(name, $inference_unit_tests_by_name$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject store_inference_unit_test(final SubLObject test) {
        final SubLObject name = inference_unit_test_name(test);
        $inference_unit_test_names_in_order$.setGlobalValue(delete(name, $inference_unit_test_names_in_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        $inference_unit_test_names_in_order$.setGlobalValue(append($inference_unit_test_names_in_order$.getGlobalValue(), list(name)));
        return sethash(name, $inference_unit_tests_by_name$.getGlobalValue(), test);
    }

    public static SubLObject do_inference_unit_tests(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject test_var = NIL;
        destructuring_bind_must_consp(current, datum, $list74);
        test_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list74);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list74);
            if (NIL == member(current_$1, $list75, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list74);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject name = $sym78$NAME;
        return list(DO_LIST, list(name, $inference_unit_test_names_in_order$, $DONE, done), listS(CLET, list(list(test_var, list(FIND_INFERENCE_UNIT_TEST_BY_NAME, name))), append(body, NIL)));
    }

    public static SubLObject all_inference_unit_test_names() {
        SubLObject names = NIL;
        SubLObject cdolist_list_var = $inference_unit_test_names_in_order$.getGlobalValue();
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject test = find_inference_unit_test_by_name(name);
            final SubLObject name_$2 = inference_unit_test_name(test);
            names = cons(name_$2, names);
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return nreverse(names);
    }

    public static SubLObject inference_unit_test_followup_p(final SubLObject followup) {
        if ((NIL != list_utilities.proper_list_p(followup)) && (NIL != list_utilities.lengthE(followup, FIVE_INTEGER, UNPROVIDED))) {
            SubLObject sentence = NIL;
            SubLObject v_properties = NIL;
            SubLObject expected_result = NIL;
            SubLObject expected_result_test = NIL;
            SubLObject expected_halt_reason = NIL;
            destructuring_bind_must_consp(followup, followup, $list82);
            sentence = followup.first();
            SubLObject current = followup.rest();
            destructuring_bind_must_consp(current, followup, $list82);
            v_properties = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, followup, $list82);
            expected_result = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, followup, $list82);
            expected_result_test = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, followup, $list82);
            expected_halt_reason = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean(((((($CONTINUE == sentence) || ($PREVIOUS == sentence)) || (NIL != possibly_sentence_p(sentence))) && (NIL != inference_datastructures_enumerated_types.query_properties_p(v_properties))) && ((NIL == expected_result_test) || (NIL != subl_promotions.function_symbol_p(expected_result_test)))) && ((NIL == expected_halt_reason) || (NIL != inference_datastructures_enumerated_types.query_halt_reason_p(expected_halt_reason))));
            }
            cdestructuring_bind_error(followup, $list82);
        }
        return NIL;
    }

    public static SubLObject define_inference_unit_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list85);
        name = current.first();
        final SubLObject plist;
        current = plist = current.rest();
        final SubLObject sentence_tail = property_list_member($SENTENCE, current);
        final SubLObject sentence = (NIL != sentence_tail) ? cadr(sentence_tail) : NIL;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
        final SubLObject expected_result_tail = property_list_member($EXPECTED_RESULT, current);
        final SubLObject expected_result = (NIL != expected_result_tail) ? cadr(expected_result_tail) : NIL;
        final SubLObject expected_halt_reason_tail = property_list_member($EXPECTED_HALT_REASON, current);
        final SubLObject expected_halt_reason = (NIL != expected_halt_reason_tail) ? cadr(expected_halt_reason_tail) : $EXHAUST_TOTAL;
        final SubLObject expected_result_test_tail = property_list_member($EXPECTED_RESULT_TEST, current);
        final SubLObject expected_result_test = (NIL != expected_result_test_tail) ? cadr(expected_result_test_tail) : NIL;
        final SubLObject comment_tail = property_list_member($COMMENT, current);
        final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
        final SubLObject followups_tail = property_list_member($FOLLOWUPS, current);
        final SubLObject followups = (NIL != followups_tail) ? cadr(followups_tail) : NIL;
        final SubLObject bindings_tail = property_list_member($BINDINGS, current);
        final SubLObject v_bindings = (NIL != bindings_tail) ? cadr(bindings_tail) : NIL;
        final SubLObject kb_tail = property_list_member($KB, current);
        final SubLObject kb = (NIL != kb_tail) ? cadr(kb_tail) : $TINY;
        final SubLObject owner_tail = property_list_member($OWNER, current);
        final SubLObject owner = (NIL != owner_tail) ? cadr(owner_tail) : NIL;
        final SubLObject bug_tail = property_list_member($BUG, current);
        final SubLObject bug = (NIL != bug_tail) ? cadr(bug_tail) : NIL;
        final SubLObject created_tail = property_list_member($CREATED, current);
        final SubLObject created = (NIL != created_tail) ? cadr(created_tail) : NIL;
        final SubLObject creator_tail = property_list_member($CREATOR, current);
        final SubLObject creator = (NIL != creator_tail) ? cadr(creator_tail) : NIL;
        final SubLObject workingP_tail = property_list_member($WORKING_, current);
        final SubLObject workingP = (NIL != workingP_tail) ? cadr(workingP_tail) : T;
        final SubLObject subtype_tail = property_list_member($SUBTYPE, current);
        final SubLObject subtype = (NIL != subtype_tail) ? cadr(subtype_tail) : NIL;
        return list(PROGN, list(VALIDATE_INFERENCE_UNIT_TEST_PLIST, list(QUOTE, plist)), list(new SubLObject[]{ DEFINE_INFERENCE_UNIT_TEST_INTERNAL, name, comment, sentence, v_properties, expected_result, expected_halt_reason, expected_result_test, list(CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS, followups), v_bindings, kb, owner, bug, created, creator, workingP, subtype }));
    }

    public static SubLObject undefine_inference_unit_test(final SubLObject name) {
        final SubLObject removedP = remhash(name, $inference_unit_tests_by_name$.getGlobalValue());
        $inference_unit_test_names_in_order$.setGlobalValue(delete(name, $inference_unit_test_names_in_order$.getGlobalValue(), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return removedP;
    }

    public static SubLObject undefine_all_inference_unit_tests() {
        $inference_unit_test_names_in_order$.setGlobalValue(NIL);
        $inference_unit_tests_by_name$.setGlobalValue(make_hash_table($int$212, symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject inference_unit_test_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_unit_test_properties$.getGlobalValue());
    }

    public static SubLObject validate_inference_unit_test_plist(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL == inference_unit_test_property_p(property)) {
                Errors.warn($str101$_s_is_not_a_known__a, property, INFERENCE_UNIT_TEST_PROPERTY_P);
            }
        }
        return plist;
    }

    public static SubLObject inference_unit_test_followup_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $inference_unit_test_followup_properties$.getGlobalValue());
    }

    public static SubLObject validate_inference_unit_test_followup_plist(final SubLObject plist) {
        assert NIL != list_utilities.property_list_p(plist) : "list_utilities.property_list_p(plist) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist) " + plist;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (NIL == inference_unit_test_followup_property_p(property)) {
                Errors.warn($str101$_s_is_not_a_known__a, property, INFERENCE_UNIT_TEST_FOLLOWUP_PROPERTY_P);
            }
        }
        return plist;
    }

    public static SubLObject define_inference_unit_test_internal(final SubLObject name, final SubLObject comment, final SubLObject sentence, final SubLObject v_properties, final SubLObject expected_result, final SubLObject halt_reason, final SubLObject result_test, final SubLObject followups, final SubLObject v_bindings, final SubLObject kb, final SubLObject owner, final SubLObject bug_number, final SubLObject creation_date, final SubLObject creator, final SubLObject workingP, final SubLObject subtype) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        assert NIL != possibly_sentence_p(sentence) : "el_utilities.possibly_sentence_p(sentence) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(sentence) " + sentence;
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = v_properties; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        if (((NIL == result_test) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == bindings.binding_lists_p(expected_result))) {
            throw new AssertionError(expected_result);
        }
        if (((NIL != halt_reason) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == inference_datastructures_enumerated_types.query_halt_reason_p(halt_reason))) {
            throw new AssertionError(halt_reason);
        }
        if (((NIL != result_test) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.function_symbol_p(result_test))) {
            throw new AssertionError(result_test);
        }
        assert NIL != inference_testing.inference_test_comment_p(comment) : "inference_testing.inference_test_comment_p(comment) " + "CommonSymbols.NIL != inference_testing.inference_test_comment_p(comment) " + comment;
        assert NIL != list_utilities.non_dotted_list_p(followups) : "list_utilities.non_dotted_list_p(followups) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(followups) " + followups;
        SubLObject cdolist_list_var = followups;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != inference_unit_test_followup_p(elem) : "inference_unit_tests.inference_unit_test_followup_p(elem) " + "CommonSymbols.NIL != inference_unit_tests.inference_unit_test_followup_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != misc_utilities.subl_variable_binding_list_p(v_bindings) : "misc_utilities.subl_variable_binding_list_p(v_bindings) " + "CommonSymbols.NIL != misc_utilities.subl_variable_binding_list_p(v_bindings) " + v_bindings;
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
        if (((NIL != subtype) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == keywordp(subtype))) {
            throw new AssertionError(subtype);
        }
        if ((NIL != el_conditional_sentence_p(sentence)) && (NIL == getf(v_properties, $kw122$CONDITIONAL_SENTENCE_, UNPROVIDED))) {
            Errors.warn($str123$The_test__S_is_not_queried_with__, name);
        }
        final SubLObject test = make_inference_unit_test(list(new SubLObject[]{ $NAME, name, $COMMENT, comment, $SENTENCE, sentence, $PROPERTIES, v_properties, $RESULT, expected_result, $HALT_REASON, halt_reason, $RESULT_TEST, result_test, $FOLLOWUPS, followups, $BINDINGS, v_bindings, $KB, kb, $OWNER, owner, $BUG_NUMBER, bug_number, $CREATION_DATE, creation_date, $CREATOR, creator, $WORKING_, workingP, $SUBTYPE, subtype }));
        store_inference_unit_test(test);
        cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), test);
        return test;
    }

    public static SubLObject canonicalize_inference_unit_test_followups(final SubLObject followup_specs) {
        SubLObject followups = NIL;
        SubLObject cdolist_list_var = followup_specs;
        SubLObject followup_spec = NIL;
        followup_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            validate_inference_unit_test_followup_plist(followup_spec);
            final SubLObject current;
            final SubLObject datum = current = followup_spec;
            final SubLObject sentence_tail = property_list_member($SENTENCE, current);
            final SubLObject sentence = (NIL != sentence_tail) ? cadr(sentence_tail) : $CONTINUE;
            final SubLObject properties_tail = property_list_member($PROPERTIES, current);
            final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : NIL;
            final SubLObject expected_result_tail = property_list_member($EXPECTED_RESULT, current);
            final SubLObject expected_result = (NIL != expected_result_tail) ? cadr(expected_result_tail) : NIL;
            final SubLObject expected_result_test_tail = property_list_member($EXPECTED_RESULT_TEST, current);
            final SubLObject expected_result_test = (NIL != expected_result_test_tail) ? cadr(expected_result_test_tail) : NIL;
            final SubLObject expected_halt_reason_tail = property_list_member($EXPECTED_HALT_REASON, current);
            final SubLObject expected_halt_reason = (NIL != expected_halt_reason_tail) ? cadr(expected_halt_reason_tail) : $EXHAUST_TOTAL;
            followups = cons(list(sentence, v_properties, expected_result, expected_result_test, expected_halt_reason), followups);
            cdolist_list_var = cdolist_list_var.rest();
            followup_spec = cdolist_list_var.first();
        } 
        return nreverse(followups);
    }

    public static SubLObject run_all_inference_unit_tests(SubLObject verboseP, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
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
        final SubLObject verbosity = (NIL != verboseP) ? $VERBOSE : $TERSE;
        return cyc_testing.run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $IUT, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_inference_unit_tests(SubLObject names, SubLObject verboseP, SubLObject stop_at_first_failureP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP, SubLObject return_test_runsP) {
        if (names == UNPROVIDED) {
            names = all_inference_unit_test_names();
        }
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (stop_at_first_failureP == UNPROVIDED) {
            stop_at_first_failureP = NIL;
        }
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
        assert NIL != booleanp(verboseP) : "Types.booleanp(verboseP) " + "CommonSymbols.NIL != Types.booleanp(verboseP) " + verboseP;
        assert NIL != booleanp(stop_at_first_failureP) : "Types.booleanp(stop_at_first_failureP) " + "CommonSymbols.NIL != Types.booleanp(stop_at_first_failureP) " + stop_at_first_failureP;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject verbosity = (NIL != verboseP) ? $VERBOSE : $TERSE;
        final SubLObject cyc_tests = list_utilities.delete_if_not(CYC_TEST_P, Mapping.mapcar(FIND_CYC_TEST, names), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return cyc_testing.run_all_loaded_cyc_tests(stream, verbosity, stop_at_first_failureP, output_format, run_tiny_kb_tests_in_full_kbP, NIL, return_test_runsP, $IUT, NIL, NIL, NIL, cyc_tests, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject run_inference_unit_test(final SubLObject name, SubLObject verboseP, SubLObject browsableP, SubLObject blockingP, SubLObject output_format, SubLObject stream, SubLObject run_tiny_kb_tests_in_full_kbP) {
        if (verboseP == UNPROVIDED) {
            verboseP = T;
        }
        if (browsableP == UNPROVIDED) {
            browsableP = NIL;
        }
        if (blockingP == UNPROVIDED) {
            blockingP = NIL;
        }
        if (output_format == UNPROVIDED) {
            output_format = $STANDARD;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (run_tiny_kb_tests_in_full_kbP == UNPROVIDED) {
            run_tiny_kb_tests_in_full_kbP = cyc_testing.$run_tiny_kb_tests_in_full_kbP$.getDynamicValue();
        }
        assert NIL != keywordp(name) : "Types.keywordp(name) " + "CommonSymbols.NIL != Types.keywordp(name) " + name;
        assert NIL != cyc_testing.cyc_test_output_format_p(output_format) : "cyc_testing.cyc_test_output_format_p(output_format) " + "CommonSymbols.NIL != cyc_testing.cyc_test_output_format_p(output_format) " + output_format;
        final SubLObject test = find_inference_unit_test_by_name(name);
        if (NIL == test) {
            Errors.error($str131$No_test_with_name__a_was_found, name);
        }
        return run_inference_unit_test_int(test, verboseP, browsableP, blockingP, output_format, stream, run_tiny_kb_tests_in_full_kbP);
    }

    public static SubLObject run_inference_unit_test_int(final SubLObject test, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject output_format, final SubLObject stream, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == run_inference_unit_testP(test, run_tiny_kb_tests_in_full_kbP)) {
            final SubLObject name = inference_unit_test_name(test);
            return values($NOT_RUN, cyc_testing.new_cyc_test_run($IUT, name, $NOT_RUN, NIL));
        }
        if (NIL != inference_unit_test_mentions_invalid_constantP(test)) {
            final SubLObject name = inference_unit_test_name(test);
            return values($INVALID, cyc_testing.new_cyc_test_run($IUT, name, $INVALID, NIL));
        }
        SubLObject all_inferences = NIL;
        SubLObject overall_result = NIL;
        SubLObject overall_test_time = NIL;
        SubLObject test_run = NIL;
        final SubLObject _prev_bind_0 = $within_inference_unit_testP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $inference_unit_test_assertions_created$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_pretty$.currentBinding(thread);
        try {
            $within_inference_unit_testP$.bind(T, thread);
            $inference_unit_test_assertions_created$.bind(NIL, thread);
            $print_pretty$.bind(NIL, thread);
            final SubLObject name2 = inference_unit_test_name(test);
            final SubLObject sentence = inference_unit_test_sentence(test);
            final SubLObject v_properties = inference_unit_test_properties(test);
            final SubLObject expected_result = inference_unit_test_expected_result(test);
            final SubLObject expected_halt_reason = inference_unit_test_expected_halt_reason(test);
            final SubLObject result_test_func = inference_unit_test_result_test(test);
            final SubLObject followups = inference_unit_test_followups(test);
            final SubLObject v_bindings = inference_unit_test_bindings(test);
            final SubLObject subtype = inference_unit_test_subtype(test);
            SubLObject previous_inference = NIL;
            print_inference_unit_test_preamble(name2, verboseP, output_format, stream);
            thread.resetMultipleValues();
            final SubLObject overall_result_$3 = run_inference_unit_test_query(name2, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, list_utilities.sublisp_boolean(followups), subtype, output_format, stream);
            final SubLObject overall_test_time_$4 = thread.secondMultipleValue();
            final SubLObject previous_inference_$5 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            overall_result = overall_result_$3;
            overall_test_time = overall_test_time_$4;
            final SubLObject var;
            previous_inference = var = previous_inference_$5;
            if (NIL != var) {
                all_inferences = cons(var, all_inferences);
            }
            SubLObject rest;
            SubLObject followup;
            SubLObject current;
            SubLObject datum;
            SubLObject sentence_$6;
            SubLObject v_properties_$7;
            SubLObject expected_result_$8;
            SubLObject expected_result_test;
            SubLObject expected_halt_reason_$9;
            SubLObject followup_result;
            SubLObject followup_test_time;
            SubLObject followup_inference;
            SubLObject var2;
            SubLObject item_var;
            for (rest = NIL, rest = followups; ($SUCCESS == overall_result) && (NIL != rest); rest = rest.rest()) {
                followup = rest.first();
                datum = current = followup;
                sentence_$6 = NIL;
                v_properties_$7 = NIL;
                expected_result_$8 = NIL;
                expected_result_test = NIL;
                expected_halt_reason_$9 = NIL;
                destructuring_bind_must_consp(current, datum, $list82);
                sentence_$6 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list82);
                v_properties_$7 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list82);
                expected_result_$8 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list82);
                expected_result_test = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list82);
                expected_halt_reason_$9 = current.first();
                current = current.rest();
                if (NIL == current) {
                    thread.resetMultipleValues();
                    followup_result = run_inference_unit_test_followup_query(name2, previous_inference, sentence_$6, v_properties_$7, v_bindings, expected_result_$8, expected_halt_reason_$9, expected_result_test, verboseP, browsableP, blockingP, subtype, output_format, stream);
                    followup_test_time = thread.secondMultipleValue();
                    followup_inference = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    overall_result = followup_result;
                    overall_test_time = add(overall_test_time, followup_test_time);
                    previous_inference = var2 = followup_inference;
                    if (NIL != var2) {
                        item_var = var2;
                        if (NIL == member(item_var, all_inferences, symbol_function(EQL), symbol_function(IDENTITY))) {
                            all_inferences = cons(item_var, all_inferences);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list82);
                }
            }
            if ($SUCCESS == overall_result) {
                print_inference_unit_test_postamble(overall_result, name2, overall_test_time, verboseP, output_format, stream);
            }
            test_run = cyc_testing.new_cyc_test_run($IUT, name2, overall_result, overall_test_time);
            inference_unit_test_cleanup();
        } finally {
            $print_pretty$.rebind(_prev_bind_3, thread);
            $inference_unit_test_assertions_created$.rebind(_prev_bind_2, thread);
            $within_inference_unit_testP$.rebind(_prev_bind_0, thread);
        }
        if (NIL == browsableP) {
            SubLObject cdolist_list_var = all_inferences;
            SubLObject inference = NIL;
            inference = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                cdolist_list_var = cdolist_list_var.rest();
                inference = cdolist_list_var.first();
            } 
        }
        return values(overall_result, test_run);
    }

    public static SubLObject run_inference_unit_testP(final SubLObject test, final SubLObject run_tiny_kb_tests_in_full_kbP) {
        final SubLObject test_kb = inference_unit_test_kb(test);
        if (NIL == inference_testing.kb_matches_expectationsP(test_kb, run_tiny_kb_tests_in_full_kbP)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject run_inference_unit_test_followup_query(final SubLObject name, final SubLObject previous_inference, SubLObject sentence_spec, SubLObject v_properties, final SubLObject v_bindings, SubLObject expected_result, final SubLObject expected_halt_reason, final SubLObject result_test_func, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject subtype, final SubLObject output_format, final SubLObject stream) {
        if ($CONTINUE == sentence_spec) {
            return run_inference_unit_test_query(name, previous_inference, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format, stream);
        }
        if ($PREVIOUS == sentence_spec) {
            sentence_spec = make_ist_sentence(inference_datastructures_inference.inference_mt(previous_inference), inference_datastructures_inference.inference_el_query(previous_inference));
        }
        SubLObject sentence = sentence_spec;
        assert NIL != el_grammar.el_sentence_p(sentence) : "el_grammar.el_sentence_p(sentence) " + "CommonSymbols.NIL != el_grammar.el_sentence_p(sentence) " + sentence;
        if (NIL != previous_inference) {
            final SubLObject store = inference_datastructures_inference.inference_problem_store(previous_inference);
            sentence = followup_substitute_hypothetical_bindings(store, sentence);
            expected_result = followup_substitute_hypothetical_bindings(store, expected_result);
        }
        if ($UNPROVIDED != getf(v_properties, $PROBLEM_STORE, $UNPROVIDED)) {
            return run_inference_unit_test_query(name, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format, stream);
        }
        if (NIL == previous_inference) {
            final SubLObject actual_result = NIL;
            final SubLObject actual_halt_reason = inference_datastructures_enumerated_types.new_inference_error_suspend_status($str138$Previous_inference_was_not_browsa);
            final SubLObject result = $FAILURE;
            final SubLObject followup_time = ZERO_INTEGER;
            final SubLObject followup_inference = NIL;
            print_inference_unit_test_postamble(result, name, followup_time, verboseP, output_format, stream);
            print_inference_unit_test_failure(stream, verboseP, sentence, v_properties, result_test_func, expected_result, actual_result, expected_halt_reason, actual_halt_reason);
            return values(result, followup_time, followup_inference);
        }
        final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(previous_inference);
        v_properties = putf(copy_list(v_properties), $PROBLEM_STORE, problem_store);
        return run_inference_unit_test_query(name, sentence, v_properties, v_bindings, expected_result, expected_halt_reason, result_test_func, verboseP, browsableP, blockingP, T, subtype, output_format, stream);
    }

    public static SubLObject followup_substitute_hypothetical_bindings(final SubLObject store, SubLObject sentence) {
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$10 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$10);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject earlier_inference;
                SubLObject hypothetical_bindings;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    earlier_inference = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(earlier_inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(earlier_inference)) {
                            earlier_inference = $SKIP;
                        }
                        hypothetical_bindings = inference_datastructures_inference.inference_hypothetical_bindings(earlier_inference);
                        sentence = bindings.apply_bindings(hypothetical_bindings, sentence);
                    }
                }
            }
            final SubLObject idx_$11 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$11)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$11);
                SubLObject id2 = NIL;
                SubLObject earlier_inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        earlier_inference2 = getEntryValue(cdohash_entry);
                        final SubLObject hypothetical_bindings2 = inference_datastructures_inference.inference_hypothetical_bindings(earlier_inference2);
                        sentence = bindings.apply_bindings(hypothetical_bindings2, sentence);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return sentence;
    }

    public static SubLObject run_inference_unit_test_query(final SubLObject name, final SubLObject sentence_or_inference, SubLObject v_properties, final SubLObject v_bindings, SubLObject expected_result, final SubLObject expected_halt_reason, final SubLObject result_test_func, final SubLObject verboseP, final SubLObject browsableP, final SubLObject blockingP, final SubLObject has_followupsP, final SubLObject subtype, final SubLObject output_format, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject test_time = NIL;
        SubLObject query_inference = NIL;
        if (NIL != blockingP) {
            v_properties = putf(copy_list(v_properties), $BLOCK_, T);
            v_properties = list_utilities.nmerge_plist(v_properties, $list142);
        }
        if (NIL != browsableP) {
            v_properties = putf(copy_list(v_properties), $BROWSABLE_, T);
        }
        if ((((NIL != $test_followups_use_public_problem_storeP$.getDynamicValue(thread)) && (NIL != has_followupsP)) && (NIL == pruning_inference_testP(subtype))) && (NIL == inference_datastructures_inference.inference_p(sentence_or_inference))) {
            final SubLObject store = inference_kernel.problem_store_from_properties(inference_datastructures_enumerated_types.extract_query_static_properties(v_properties));
            v_properties = putf(copy_list(v_properties), $PROBLEM_STORE, store);
        }
        SubLObject actual_result = NIL;
        SubLObject hypothetical_bindings = NIL;
        SubLObject actual_halt_reason = NIL;
        SubLObject query_result = NIL;
        final SubLObject return_type = inference_datastructures_enumerated_types.inference_properties_return_type(v_properties);
        SubLObject time = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $use_transcriptP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            $use_transcriptP$.bind(NIL, thread);
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            final SubLObject cprogv_var = misc_utilities.subl_variable_binding_list_variables(v_bindings);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, misc_utilities.subl_variable_binding_list_values(v_bindings));
                if (NIL != inference_datastructures_inference.inference_p(sentence_or_inference)) {
                    final SubLObject time_var = get_internal_real_time();
                    thread.resetMultipleValues();
                    final SubLObject query_result_$12 = inference_kernel.continue_inference(sentence_or_inference, v_properties);
                    final SubLObject actual_halt_reason_$13 = thread.secondMultipleValue();
                    final SubLObject query_inference_$14 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    query_result = query_result_$12;
                    actual_halt_reason = actual_halt_reason_$13;
                    query_inference = query_inference_$14;
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                } else {
                    final SubLObject time_var = get_internal_real_time();
                    thread.resetMultipleValues();
                    final SubLObject query_result_$13 = inference_kernel.new_cyc_query(sentence_or_inference, NIL, v_properties);
                    final SubLObject actual_halt_reason_$14 = thread.secondMultipleValue();
                    final SubLObject query_inference_$15 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    query_result = query_result_$13;
                    actual_halt_reason = actual_halt_reason_$14;
                    query_inference = query_inference_$15;
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_2, thread);
            $use_transcriptP$.rebind(_prev_bind_0, thread);
        }
        test_time = time;
        final SubLObject pcase_var = return_type;
        if (pcase_var.eql($BINDINGS)) {
            actual_result = query_result;
            hypothetical_bindings = NIL;
        } else
            if (pcase_var.eql($BINDINGS_AND_HYPOTHETICAL_BINDINGS)) {
                actual_result = query_result.first();
                hypothetical_bindings = second(query_result);
            } else {
                actual_result = query_result;
                hypothetical_bindings = NIL;
            }

        if (NIL != hypothetical_bindings) {
            expected_result = bindings.apply_bindings(hypothetical_bindings, expected_result);
        }
        result = boolean_to_test_result(makeBoolean((NIL != halt_reason_matches_specP(actual_halt_reason, expected_halt_reason)) && (NIL != iut_result_test_passesP(result_test_func, actual_result, expected_result))));
        if ($FAILURE == result) {
            print_inference_unit_test_postamble(result, name, test_time, verboseP, output_format, stream);
            print_inference_unit_test_failure(stream, verboseP, sentence_or_inference, v_properties, result_test_func, expected_result, actual_result, expected_halt_reason, actual_halt_reason);
        }
        return values(result, test_time, query_inference);
    }

    public static SubLObject pruning_inference_testP(final SubLObject subtype) {
        return eq($PRUNING, subtype);
    }

    public static SubLObject boolean_to_test_result(final SubLObject v_boolean) {
        if (NIL != v_boolean) {
            return $SUCCESS;
        }
        return $FAILURE;
    }

    public static SubLObject halt_reason_matches_specP(final SubLObject actual_halt_reason, final SubLObject expected_halt_reason) {
        return makeBoolean((NIL == expected_halt_reason) || actual_halt_reason.equal(expected_halt_reason));
    }

    public static SubLObject iut_result_test_passesP(final SubLObject result_test_func, final SubLObject actual_result, final SubLObject expected_result) {
        if (NIL == result_test_func) {
            return bindings.lists_of_binding_lists_equalP(actual_result, expected_result);
        }
        return funcall(result_test_func, actual_result, expected_result);
    }

    public static SubLObject print_inference_unit_test_preamble(final SubLObject name, final SubLObject verboseP, final SubLObject output_format, final SubLObject stream) {
        if ((NIL != verboseP) && ($STANDARD == output_format)) {
            format(stream, $str146$___IUT__S____, name);
            force_output(stream);
        }
        return NIL;
    }

    public static SubLObject print_inference_unit_test_postamble(final SubLObject result, final SubLObject name, final SubLObject test_time, final SubLObject verboseP, final SubLObject output_format, final SubLObject stream) {
        if ((NIL != verboseP) && ($STANDARD == output_format)) {
            format(stream, $str147$_S____3f___, result, test_time);
        }
        if ($POST_BUILD == output_format) {
            cyc_testing.print_post_build_test_summary(stream, result, $IUT, name, test_time, inference_unit_test_owner(find_inference_unit_test_by_name(name)));
        }
        force_output(stream);
        return NIL;
    }

    public static SubLObject print_inference_unit_test_failure(final SubLObject stream, final SubLObject verboseP, final SubLObject sentence_or_inference, final SubLObject v_properties, final SubLObject result_test_func, final SubLObject expected_result, final SubLObject actual_result, final SubLObject expected_halt_reason, final SubLObject actual_halt_reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != verboseP) {
            final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
            try {
                $print_pretty$.bind(T, thread);
                format(stream, $str149$__Failure_when_asking);
                format(stream, $str150$_______S, sentence_or_inference);
                format(stream, $str151$____with_properties__s, v_properties);
                if (result_test_func.isFunctionSpec()) {
                    format(stream, $str152$__Result_test____s, result_test_func);
                }
                format(stream, $str153$__Actual_result______s, actual_result);
                format(stream, $str154$__Expected_result____s, expected_result);
                format(stream, $str155$__Actual_halt_reason______s, actual_halt_reason);
                format(stream, $str156$__Expected_halt_reason____s, expected_halt_reason);
                format(stream, $str157$____);
                force_output(stream);
            } finally {
                $print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject previous_query_inference() {
        final SubLObject store = inference_worker.currently_active_problem_store();
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(store, ZERO_INTEGER);
        return inference;
    }

    public static SubLObject previous_query_root_problem_and_strategy() {
        final SubLObject inference = previous_query_inference();
        final SubLObject problem = inference_datastructures_inference.inference_root_problem(inference);
        final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy(inference);
        return values(problem, strategy);
    }

    public static SubLObject previous_query_root_problem() {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), previous_query_root_problem_and_strategy());
    }

    public static SubLObject declare_inference_unit_tests_file() {
        declareFunction(me, "within_inference_unit_testP", "WITHIN-INFERENCE-UNIT-TEST?", 0, 0, false);
        declareFunction(me, "note_assertion_for_inference_unit_test", "NOTE-ASSERTION-FOR-INFERENCE-UNIT-TEST", 1, 0, false);
        declareFunction(me, "inference_unit_test_cleanup", "INFERENCE-UNIT-TEST-CLEANUP", 0, 0, false);
        declareFunction(me, "inference_unit_test_print_function_trampoline", "INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "inference_unit_test_p", "INFERENCE-UNIT-TEST-P", 1, 0, false);
        new inference_unit_tests.$inference_unit_test_p$UnaryFunction();
        declareFunction(me, "iut_name", "IUT-NAME", 1, 0, false);
        declareFunction(me, "iut_comment", "IUT-COMMENT", 1, 0, false);
        declareFunction(me, "iut_sentence", "IUT-SENTENCE", 1, 0, false);
        declareFunction(me, "iut_properties", "IUT-PROPERTIES", 1, 0, false);
        declareFunction(me, "iut_result", "IUT-RESULT", 1, 0, false);
        declareFunction(me, "iut_halt_reason", "IUT-HALT-REASON", 1, 0, false);
        declareFunction(me, "iut_result_test", "IUT-RESULT-TEST", 1, 0, false);
        declareFunction(me, "iut_followups", "IUT-FOLLOWUPS", 1, 0, false);
        declareFunction(me, "iut_bindings", "IUT-BINDINGS", 1, 0, false);
        declareFunction(me, "iut_kb", "IUT-KB", 1, 0, false);
        declareFunction(me, "iut_owner", "IUT-OWNER", 1, 0, false);
        declareFunction(me, "iut_bug_number", "IUT-BUG-NUMBER", 1, 0, false);
        declareFunction(me, "iut_creation_date", "IUT-CREATION-DATE", 1, 0, false);
        declareFunction(me, "iut_creator", "IUT-CREATOR", 1, 0, false);
        declareFunction(me, "iut_workingP", "IUT-WORKING?", 1, 0, false);
        declareFunction(me, "iut_subtype", "IUT-SUBTYPE", 1, 0, false);
        declareFunction(me, "_csetf_iut_name", "_CSETF-IUT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_iut_comment", "_CSETF-IUT-COMMENT", 2, 0, false);
        declareFunction(me, "_csetf_iut_sentence", "_CSETF-IUT-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_iut_properties", "_CSETF-IUT-PROPERTIES", 2, 0, false);
        declareFunction(me, "_csetf_iut_result", "_CSETF-IUT-RESULT", 2, 0, false);
        declareFunction(me, "_csetf_iut_halt_reason", "_CSETF-IUT-HALT-REASON", 2, 0, false);
        declareFunction(me, "_csetf_iut_result_test", "_CSETF-IUT-RESULT-TEST", 2, 0, false);
        declareFunction(me, "_csetf_iut_followups", "_CSETF-IUT-FOLLOWUPS", 2, 0, false);
        declareFunction(me, "_csetf_iut_bindings", "_CSETF-IUT-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_iut_kb", "_CSETF-IUT-KB", 2, 0, false);
        declareFunction(me, "_csetf_iut_owner", "_CSETF-IUT-OWNER", 2, 0, false);
        declareFunction(me, "_csetf_iut_bug_number", "_CSETF-IUT-BUG-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_iut_creation_date", "_CSETF-IUT-CREATION-DATE", 2, 0, false);
        declareFunction(me, "_csetf_iut_creator", "_CSETF-IUT-CREATOR", 2, 0, false);
        declareFunction(me, "_csetf_iut_workingP", "_CSETF-IUT-WORKING?", 2, 0, false);
        declareFunction(me, "_csetf_iut_subtype", "_CSETF-IUT-SUBTYPE", 2, 0, false);
        declareFunction(me, "make_inference_unit_test", "MAKE-INFERENCE-UNIT-TEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_inference_unit_test", "VISIT-DEFSTRUCT-INFERENCE-UNIT-TEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_inference_unit_test_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-UNIT-TEST-METHOD", 2, 0, false);
        declareFunction(me, "inference_unit_test_name", "INFERENCE-UNIT-TEST-NAME", 1, 0, false);
        declareFunction(me, "inference_unit_test_comment", "INFERENCE-UNIT-TEST-COMMENT", 1, 0, false);
        declareFunction(me, "inference_unit_test_sentence", "INFERENCE-UNIT-TEST-SENTENCE", 1, 0, false);
        declareFunction(me, "inference_unit_test_properties", "INFERENCE-UNIT-TEST-PROPERTIES", 1, 0, false);
        declareFunction(me, "inference_unit_test_expected_result", "INFERENCE-UNIT-TEST-EXPECTED-RESULT", 1, 0, false);
        declareFunction(me, "inference_unit_test_expected_halt_reason", "INFERENCE-UNIT-TEST-EXPECTED-HALT-REASON", 1, 0, false);
        declareFunction(me, "inference_unit_test_result_test", "INFERENCE-UNIT-TEST-RESULT-TEST", 1, 0, false);
        declareFunction(me, "inference_unit_test_followups", "INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false);
        declareFunction(me, "inference_unit_test_bindings", "INFERENCE-UNIT-TEST-BINDINGS", 1, 0, false);
        declareFunction(me, "inference_unit_test_kb", "INFERENCE-UNIT-TEST-KB", 1, 0, false);
        declareFunction(me, "inference_unit_test_owner", "INFERENCE-UNIT-TEST-OWNER", 1, 0, false);
        declareFunction(me, "inference_unit_test_bug_number", "INFERENCE-UNIT-TEST-BUG-NUMBER", 1, 0, false);
        declareFunction(me, "inference_unit_test_creation_date", "INFERENCE-UNIT-TEST-CREATION-DATE", 1, 0, false);
        declareFunction(me, "inference_unit_test_creator", "INFERENCE-UNIT-TEST-CREATOR", 1, 0, false);
        declareFunction(me, "inference_unit_test_workingP", "INFERENCE-UNIT-TEST-WORKING?", 1, 0, false);
        declareFunction(me, "inference_unit_test_subtype", "INFERENCE-UNIT-TEST-SUBTYPE", 1, 0, false);
        declareFunction(me, "inference_unit_test_mentions_invalid_constantP", "INFERENCE-UNIT-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
        declareFunction(me, "inference_unit_test_invalid_constants", "INFERENCE-UNIT-TEST-INVALID-CONSTANTS", 1, 0, false);
        declareFunction(me, "inference_unit_test_recipe", "INFERENCE-UNIT-TEST-RECIPE", 1, 0, false);
        declareFunction(me, "inference_unit_result_test_recipe", "INFERENCE-UNIT-RESULT-TEST-RECIPE", 1, 0, false);
        declareFunction(me, "new_inference_unit_test_from_recipe", "NEW-INFERENCE-UNIT-TEST-FROM-RECIPE", 1, 0, false);
        declareFunction(me, "cfasl_output_object_inference_unit_test_method", "CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_inference_unit_test", "CFASL-OUTPUT-INFERENCE-UNIT-TEST", 2, 0, false);
        declareFunction(me, "cfasl_output_inference_unit_test_internal", "CFASL-OUTPUT-INFERENCE-UNIT-TEST-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_inference_unit_test", "CFASL-INPUT-INFERENCE-UNIT-TEST", 1, 0, false);
        declareFunction(me, "test_inference_unit_test_serialization", "TEST-INFERENCE-UNIT-TEST-SERIALIZATION", 1, 0, false);
        declareFunction(me, "find_inference_unit_test_by_name", "FIND-INFERENCE-UNIT-TEST-BY-NAME", 1, 0, false);
        declareFunction(me, "store_inference_unit_test", "STORE-INFERENCE-UNIT-TEST", 1, 0, false);
        declareMacro(me, "do_inference_unit_tests", "DO-INFERENCE-UNIT-TESTS");
        declareFunction(me, "all_inference_unit_test_names", "ALL-INFERENCE-UNIT-TEST-NAMES", 0, 0, false);
        declareFunction(me, "inference_unit_test_followup_p", "INFERENCE-UNIT-TEST-FOLLOWUP-P", 1, 0, false);
        declareMacro(me, "define_inference_unit_test", "DEFINE-INFERENCE-UNIT-TEST");
        declareFunction(me, "undefine_inference_unit_test", "UNDEFINE-INFERENCE-UNIT-TEST", 1, 0, false);
        declareFunction(me, "undefine_all_inference_unit_tests", "UNDEFINE-ALL-INFERENCE-UNIT-TESTS", 0, 0, false);
        declareFunction(me, "inference_unit_test_property_p", "INFERENCE-UNIT-TEST-PROPERTY-P", 1, 0, false);
        declareFunction(me, "validate_inference_unit_test_plist", "VALIDATE-INFERENCE-UNIT-TEST-PLIST", 1, 0, false);
        declareFunction(me, "inference_unit_test_followup_property_p", "INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTY-P", 1, 0, false);
        declareFunction(me, "validate_inference_unit_test_followup_plist", "VALIDATE-INFERENCE-UNIT-TEST-FOLLOWUP-PLIST", 1, 0, false);
        declareFunction(me, "define_inference_unit_test_internal", "DEFINE-INFERENCE-UNIT-TEST-INTERNAL", 16, 0, false);
        declareFunction(me, "canonicalize_inference_unit_test_followups", "CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false);
        declareFunction(me, "run_all_inference_unit_tests", "RUN-ALL-INFERENCE-UNIT-TESTS", 0, 6, false);
        declareFunction(me, "run_inference_unit_tests", "RUN-INFERENCE-UNIT-TESTS", 0, 7, false);
        declareFunction(me, "run_inference_unit_test", "RUN-INFERENCE-UNIT-TEST", 1, 6, false);
        declareFunction(me, "run_inference_unit_test_int", "RUN-INFERENCE-UNIT-TEST-INT", 7, 0, false);
        declareFunction(me, "run_inference_unit_testP", "RUN-INFERENCE-UNIT-TEST?", 2, 0, false);
        declareFunction(me, "run_inference_unit_test_followup_query", "RUN-INFERENCE-UNIT-TEST-FOLLOWUP-QUERY", 14, 0, false);
        declareFunction(me, "followup_substitute_hypothetical_bindings", "FOLLOWUP-SUBSTITUTE-HYPOTHETICAL-BINDINGS", 2, 0, false);
        declareFunction(me, "run_inference_unit_test_query", "RUN-INFERENCE-UNIT-TEST-QUERY", 14, 0, false);
        declareFunction(me, "pruning_inference_testP", "PRUNING-INFERENCE-TEST?", 1, 0, false);
        declareFunction(me, "boolean_to_test_result", "BOOLEAN-TO-TEST-RESULT", 1, 0, false);
        declareFunction(me, "halt_reason_matches_specP", "HALT-REASON-MATCHES-SPEC?", 2, 0, false);
        declareFunction(me, "iut_result_test_passesP", "IUT-RESULT-TEST-PASSES?", 3, 0, false);
        declareFunction(me, "print_inference_unit_test_preamble", "PRINT-INFERENCE-UNIT-TEST-PREAMBLE", 4, 0, false);
        declareFunction(me, "print_inference_unit_test_postamble", "PRINT-INFERENCE-UNIT-TEST-POSTAMBLE", 6, 0, false);
        declareFunction(me, "print_inference_unit_test_failure", "PRINT-INFERENCE-UNIT-TEST-FAILURE", 9, 0, false);
        declareFunction(me, "previous_query_inference", "PREVIOUS-QUERY-INFERENCE", 0, 0, false);
        declareFunction(me, "previous_query_root_problem_and_strategy", "PREVIOUS-QUERY-ROOT-PROBLEM-AND-STRATEGY", 0, 0, false);
        declareFunction(me, "previous_query_root_problem", "PREVIOUS-QUERY-ROOT-PROBLEM", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_unit_tests_file() {
        defparameter("*WITHIN-INFERENCE-UNIT-TEST?*", NIL);
        defparameter("*INFERENCE-UNIT-TEST-ASSERTIONS-CREATED*", $UNINITIALIZED);
        defconstant("*DTP-INFERENCE-UNIT-TEST*", INFERENCE_UNIT_TEST);
        defconstant("*CFASL-WIDE-OPCODE-INFERENCE-UNIT-TEST*", $int$513);
        deflexical("*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*", NIL != boundp($inference_unit_test_names_in_order$) ? $inference_unit_test_names_in_order$.getGlobalValue() : NIL);
        deflexical("*INFERENCE-UNIT-TESTS-BY-NAME*", NIL != boundp($inference_unit_tests_by_name$) ? $inference_unit_tests_by_name$.getGlobalValue() : make_hash_table($int$212, symbol_function(EQ), UNPROVIDED));
        deflexical("*INFERENCE-UNIT-TEST-PROPERTIES*", $list99);
        deflexical("*INFERENCE-UNIT-TEST-FOLLOWUP-PROPERTIES*", $list103);
        defparameter("*TEST-FOLLOWUPS-USE-PUBLIC-PROBLEM-STORE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_unit_tests_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), symbol_function(INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(IUT_NAME, _CSETF_IUT_NAME);
        def_csetf(IUT_COMMENT, _CSETF_IUT_COMMENT);
        def_csetf(IUT_SENTENCE, _CSETF_IUT_SENTENCE);
        def_csetf(IUT_PROPERTIES, _CSETF_IUT_PROPERTIES);
        def_csetf(IUT_RESULT, _CSETF_IUT_RESULT);
        def_csetf(IUT_HALT_REASON, _CSETF_IUT_HALT_REASON);
        def_csetf(IUT_RESULT_TEST, _CSETF_IUT_RESULT_TEST);
        def_csetf(IUT_FOLLOWUPS, _CSETF_IUT_FOLLOWUPS);
        def_csetf(IUT_BINDINGS, _CSETF_IUT_BINDINGS);
        def_csetf(IUT_KB, _CSETF_IUT_KB);
        def_csetf(IUT_OWNER, _CSETF_IUT_OWNER);
        def_csetf(IUT_BUG_NUMBER, _CSETF_IUT_BUG_NUMBER);
        def_csetf(IUT_CREATION_DATE, _CSETF_IUT_CREATION_DATE);
        def_csetf(IUT_CREATOR, _CSETF_IUT_CREATOR);
        def_csetf($sym38$IUT_WORKING_, $sym39$_CSETF_IUT_WORKING_);
        def_csetf(IUT_SUBTYPE, _CSETF_IUT_SUBTYPE);
        identity(INFERENCE_UNIT_TEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INFERENCE_UNIT_TEST_METHOD));
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_inference_unit_test$.getGlobalValue(), CFASL_INPUT_INFERENCE_UNIT_TEST);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD));
        declare_defglobal($inference_unit_test_names_in_order$);
        declare_defglobal($inference_unit_tests_by_name$);
        meta_macros.declare_indention_pattern(DEFINE_INFERENCE_UNIT_TEST, $list98);
        register_macro_helper(VALIDATE_INFERENCE_UNIT_TEST_PLIST, DEFINE_INFERENCE_UNIT_TEST);
        register_macro_helper(VALIDATE_INFERENCE_UNIT_TEST_FOLLOWUP_PLIST, DEFINE_INFERENCE_UNIT_TEST);
        register_macro_helper(DEFINE_INFERENCE_UNIT_TEST_INTERNAL, DEFINE_INFERENCE_UNIT_TEST);
        register_macro_helper(CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS, DEFINE_INFERENCE_UNIT_TEST);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_unit_tests_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_unit_tests_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_unit_tests_file();
    }

    static {








































































































































































    }

    public static final class $inference_unit_test_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $comment;

        public SubLObject $sentence;

        public SubLObject $properties;

        public SubLObject $result;

        public SubLObject $halt_reason;

        public SubLObject $result_test;

        public SubLObject $followups;

        public SubLObject $bindings;

        public SubLObject $kb;

        public SubLObject $owner;

        public SubLObject $bug_number;

        public SubLObject $creation_date;

        public SubLObject $creator;

        public SubLObject $workingP;

        public SubLObject $subtype;

        private static final SubLStructDeclNative structDecl;

        public $inference_unit_test_native() {
            this.$name = Lisp.NIL;
            this.$comment = Lisp.NIL;
            this.$sentence = Lisp.NIL;
            this.$properties = Lisp.NIL;
            this.$result = Lisp.NIL;
            this.$halt_reason = Lisp.NIL;
            this.$result_test = Lisp.NIL;
            this.$followups = Lisp.NIL;
            this.$bindings = Lisp.NIL;
            this.$kb = Lisp.NIL;
            this.$owner = Lisp.NIL;
            this.$bug_number = Lisp.NIL;
            this.$creation_date = Lisp.NIL;
            this.$creator = Lisp.NIL;
            this.$workingP = Lisp.NIL;
            this.$subtype = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$comment;
        }

        @Override
        public SubLObject getField4() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField5() {
            return this.$properties;
        }

        @Override
        public SubLObject getField6() {
            return this.$result;
        }

        @Override
        public SubLObject getField7() {
            return this.$halt_reason;
        }

        @Override
        public SubLObject getField8() {
            return this.$result_test;
        }

        @Override
        public SubLObject getField9() {
            return this.$followups;
        }

        @Override
        public SubLObject getField10() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField11() {
            return this.$kb;
        }

        @Override
        public SubLObject getField12() {
            return this.$owner;
        }

        @Override
        public SubLObject getField13() {
            return this.$bug_number;
        }

        @Override
        public SubLObject getField14() {
            return this.$creation_date;
        }

        @Override
        public SubLObject getField15() {
            return this.$creator;
        }

        @Override
        public SubLObject getField16() {
            return this.$workingP;
        }

        @Override
        public SubLObject getField17() {
            return this.$subtype;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$comment = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$properties = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$halt_reason = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$result_test = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$followups = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$kb = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$owner = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$bug_number = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$creation_date = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$creator = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$workingP = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return this.$subtype = value;
        }

        static {
            structDecl = makeStructDeclNative(inference_unit_tests.$inference_unit_test_native.class, INFERENCE_UNIT_TEST, INFERENCE_UNIT_TEST_P, $list3, $list4, new String[]{ "$name", "$comment", "$sentence", "$properties", "$result", "$halt_reason", "$result_test", "$followups", "$bindings", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP", "$subtype" }, $list5, $list6, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $inference_unit_test_p$UnaryFunction extends UnaryFunction {
        public $inference_unit_test_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-UNIT-TEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_unit_test_p(arg1);
        }
    }
}

/**
 * Total time: 582 ms synthetic
 */
