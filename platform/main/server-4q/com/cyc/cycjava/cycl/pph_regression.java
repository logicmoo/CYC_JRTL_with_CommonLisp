/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.hlmt.hlmtP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-REGRESSION
 * source file: /cyc/top/cycl/pph-regression.lisp
 * created:     2019/07/03 17:38:17
 */
public final class pph_regression extends SubLTranslatedFile implements V12 {
    public static final class $pph_regression_item_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$test_case;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$purpose;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$excused;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$language_mt;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$domain_mt;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$test_case = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$purpose = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$excused = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$language_mt = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.this.$domain_mt = value;
        }

        public SubLObject $test_case = Lisp.NIL;

        public SubLObject $purpose = Lisp.NIL;

        public SubLObject $excused = Lisp.NIL;

        public SubLObject $language_mt = Lisp.NIL;

        public SubLObject $domain_mt = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.class, PPH_REGRESSION_ITEM, PPH_REGRESSION_ITEM_P, $list_alt18, $list_alt19, new String[]{ "$test_case", "$purpose", "$excused", "$language_mt", "$domain_mt" }, $list_alt20, $list_alt21, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new pph_regression();

 public static final String myName = "com.cyc.cycjava.cycl.pph_regression";


    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_tmp_test_object$ = makeSymbol("*PPH-TMP-TEST-OBJECT*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_regression_failure_expectedP$ = makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_known_problem_objects$ = makeSymbol("*PPH-KNOWN-PROBLEM-OBJECTS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $pph_regression_hosed_by_kb$ = makeSymbol("*PPH-REGRESSION-HOSED-BY-KB*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pph_regression_item$ = makeSymbol("*DTP-PPH-REGRESSION-ITEM*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_regression_item_requires_all_args$ = makeSymbol("*PPH-REGRESSION-ITEM-REQUIRES-ALL-ARGS*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $pph_regression_doomed_combinations$ = makeSymbol("*PPH-REGRESSION-DOOMED-COMBINATIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_regression_item_case_blessed$ = makeSymbol("*PPH-REGRESSION-ITEM-CASE-BLESSED*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $pph_regression_item_case_doomed$ = makeSymbol("*PPH-REGRESSION-ITEM-CASE-DOOMED*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLSymbol $sym2$__ = makeSymbol(">=");

    public static final SubLSymbol $pph_regression_trace_level$ = makeSymbol("*PPH-REGRESSION-TRACE-LEVEL*");

    static private final SubLList $list5 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list6 = list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*")), list(makeSymbol(">="), makeSymbol("*PPH-REGRESSION-TRACE-LEVEL*"), TWO_INTEGER));

    private static final SubLSymbol LOUD_WARNING = makeSymbol("LOUD-WARNING");

    private static final SubLSymbol JOIN_STRINGS = makeSymbol("JOIN-STRINGS");

    public static final SubLSymbol $empty_string$ = makeSymbol("*EMPTY-STRING*");

    static private final SubLString $str12$______PPH_REGRESSION_PROBLEM____ = makeString("  *** PPH REGRESSION PROBLEM ***");

    static private final SubLList $list13 = list(makeString("  *** SEE BELOW FOR DETAILS ***"));

    static private final SubLList $list14 = list(makeString("~%"));

    static private final SubLString $str15$____PPH_REGRESSION_CASE_EXPECTED_ = makeString("*** PPH REGRESSION CASE EXPECTED TO FAIL ~A BUT PASSED ... details:~%");

    private static final SubLSymbol PPH_REGRESSION_ITEM = makeSymbol("PPH-REGRESSION-ITEM");

    private static final SubLSymbol PPH_REGRESSION_ITEM_P = makeSymbol("PPH-REGRESSION-ITEM-P");

    static private final SubLList $list18 = list(makeSymbol("TEST-CASE"), makeSymbol("PURPOSE"), makeSymbol("EXCUSED"), makeSymbol("LANGUAGE-MT"), makeSymbol("DOMAIN-MT"));

    static private final SubLList $list19 = list(makeKeyword("TEST-CASE"), makeKeyword("PURPOSE"), makeKeyword("EXCUSED"), makeKeyword("LANGUAGE-MT"), makeKeyword("DOMAIN-MT"));

    static private final SubLList $list20 = list(makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("PPH-REGRESSION-ITEM-PURPOSE"), makeSymbol("PPH-REGRESSION-ITEM-EXCUSED"), makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT"), makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT"));

    static private final SubLList $list21 = list(makeSymbol("_CSETF-PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-PURPOSE"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-EXCUSED"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT"));

    private static final SubLSymbol PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list24 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-REGRESSION-ITEM-P"));

    private static final SubLSymbol PPH_REGRESSION_ITEM_TEST_CASE = makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE");

    private static final SubLSymbol _CSETF_PPH_REGRESSION_ITEM_TEST_CASE = makeSymbol("_CSETF-PPH-REGRESSION-ITEM-TEST-CASE");

    private static final SubLSymbol PPH_REGRESSION_ITEM_PURPOSE = makeSymbol("PPH-REGRESSION-ITEM-PURPOSE");

    private static final SubLSymbol _CSETF_PPH_REGRESSION_ITEM_PURPOSE = makeSymbol("_CSETF-PPH-REGRESSION-ITEM-PURPOSE");

    private static final SubLSymbol PPH_REGRESSION_ITEM_EXCUSED = makeSymbol("PPH-REGRESSION-ITEM-EXCUSED");

    private static final SubLSymbol _CSETF_PPH_REGRESSION_ITEM_EXCUSED = makeSymbol("_CSETF-PPH-REGRESSION-ITEM-EXCUSED");

    private static final SubLSymbol PPH_REGRESSION_ITEM_LANGUAGE_MT = makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT");

    private static final SubLSymbol _CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT = makeSymbol("_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT");

    private static final SubLSymbol PPH_REGRESSION_ITEM_DOMAIN_MT = makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT");

    private static final SubLSymbol _CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT = makeSymbol("_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT");

    private static final SubLString $str40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PPH_REGRESSION_ITEM = makeSymbol("MAKE-PPH-REGRESSION-ITEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD");

    private static final SubLSymbol $sym47$HLMT_ = makeSymbol("HLMT?");

    private static final SubLString $str48$updating_status_of__S__w_r_t__tes = makeString("updating status of ~S~%w.r.t. test function ~S");

    private static final SubLString $str49$____marked_as_failing_with_force_ = makeString("... marked as failing with force ~S");

    private static final SubLString $str50$____failing_to_mark_as_failing_un = makeString("... failing to mark as failing under force ~S");

    private static final SubLString $str51$____now_blessed_as_passing_with_f = makeString("... now blessed as passing with force ~S");

    private static final SubLString $str52$At_least_1_argument_for_gather_pp = makeString("At least 1 argument for gather-pph-regression tests is required");



    private static final SubLString $$$KB_search = makeString("KB search");

    private static final SubLString $str55$skipping_this_case_as_language_mt = makeString("skipping this case as language-mt ~S fails regression:~%~S");

    private static final SubLString $str56$skipping_this_case_as_domain_mt__ = makeString("skipping this case as domain-mt ~S fails regression:~%~S");

    private static final SubLSymbol $sym57$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    private static final SubLString $str58$_S_would_fail_regression__skippin = makeString("~S would fail regression, skipping test case:~%~S");

    private static final SubLString $str59$_____ALERT___KB_ISSUES___ALERT___ = makeString(" *** ALERT * KB ISSUES * ALERT ***");

    private static final SubLString $str60$These_test_cases_were_skipped_due = makeString("These test-cases were skipped due to constants missing from the KB:~%");

    private static final SubLString $str61$_S_in__S = makeString("~S in ~S");

    private static final SubLList $list62 = list(list(makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TEST-FUNC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list63 = list(makeKeyword("TEST-FUNC"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $pph_tmp_regression_item$ = makeSymbol("*PPH-TMP-REGRESSION-ITEM*");

    private static final SubLSymbol GATHER_PPH_REGRESSION_TESTS = makeSymbol("GATHER-PPH-REGRESSION-TESTS");

    private static final SubLList $list69 = list(list(makeSymbol("*PPH-TMP-TEST-OBJECT*"), list(makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("*PPH-TMP-REGRESSION-ITEM*"))));

    private static final SubLList $list70 = list(makeSymbol("TEST-FUNC"), makeSymbol("REG-SPECIFIC-FUNC"));

    public static final SubLSymbol $pph_regression_current_test$ = makeSymbol("*PPH-REGRESSION-CURRENT-TEST*");

    private static final SubLList $list74 = list(makeSymbol("FIF"), makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*"), list(QUOTE, makeSymbol("FAIL-IF")), list(QUOTE, makeSymbol("FAIL-UNLESS")));

    private static final SubLSymbol PPH_REGRESSION_DIAGNOSTICS = makeSymbol("PPH-REGRESSION-DIAGNOSTICS");

    /**
     * Display warning iff *pph-regression-trace-level* is high enough
     */
    @LispMethod(comment = "Display warning iff *pph-regression-trace-level* is high enough")
    public static final SubLObject pph_regression_warn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, list($sym2$__, $pph_regression_trace_level$, level), listS(WARN, format_str, append(args, NIL)));
            }
        }
    }

    /**
     * Display warning iff *pph-regression-trace-level* is high enough
     */
    @LispMethod(comment = "Display warning iff *pph-regression-trace-level* is high enough")
    public static SubLObject pph_regression_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym2$__, $pph_regression_trace_level$, level), listS(WARN, format_str, append(args, NIL)));
    }

    /**
     * Display warning if either:
     * 1) the current test/function/force combo is expected to pass
     * or, 2) *pph-regression-trace-level* is at least 2
     */
    @LispMethod(comment = "Display warning if either:\r\n1) the current test/function/force combo is expected to pass\r\nor, 2) *pph-regression-trace-level* is at least 2\nDisplay warning if either:\n1) the current test/function/force combo is expected to pass\nor, 2) *pph-regression-trace-level* is at least 2")
    public static final SubLObject pph_regression_warn_wXo_false_positives_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, $list_alt6, list(CLET, list(list(LOUD_WARNING, listS(JOIN_STRINGS, listS(LIST, $empty_string$, $str_alt12$______PPH_REGRESSION_PROBLEM____, format_str, $list_alt13), $list_alt14))), listS(WARN, LOUD_WARNING, append(args, NIL))));
            }
        }
    }

    /**
     * Display warning if either:
     * 1) the current test/function/force combo is expected to pass
     * or, 2) *pph-regression-trace-level* is at least 2
     */
    @LispMethod(comment = "Display warning if either:\r\n1) the current test/function/force combo is expected to pass\r\nor, 2) *pph-regression-trace-level* is at least 2\nDisplay warning if either:\n1) the current test/function/force combo is expected to pass\nor, 2) *pph-regression-trace-level* is at least 2")
    public static SubLObject pph_regression_warn_wXo_false_positives(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, $list6, list(CLET, list(list(LOUD_WARNING, listS(JOIN_STRINGS, listS(LIST, $empty_string$, $str12$______PPH_REGRESSION_PROBLEM____, format_str, $list13), $list14))), listS(WARN, LOUD_WARNING, append(args, NIL))));
    }

    /**
     * Unifies the code for printing out error messages when a test for a
     * regression item fails (or succeeds unexpectedly). The core functions contains
     * strictly generic info, but can be passed a 'give more details' function
     * by the file coordinating the regression tests.
     */
    @LispMethod(comment = "Unifies the code for printing out error messages when a test for a\r\nregression item fails (or succeeds unexpectedly). The core functions contains\r\nstrictly generic info, but can be passed a \'give more details\' function\r\nby the file coordinating the regression tests.\nUnifies the code for printing out error messages when a test for a\nregression item fails (or succeeds unexpectedly). The core functions contains\nstrictly generic info, but can be passed a \'give more details\' function\nby the file coordinating the regression tests.")
    public static final SubLObject pph_regression_diagnostics_alt(SubLObject details_func) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = (NIL != $pph_regression_failure_expectedP$.getDynamicValue(thread)) ? ((SubLObject) (format(NIL, $str_alt15$____PPH_REGRESSION_CASE_EXPECTED_, $pph_regression_current_test$.getDynamicValue(thread)))) : string_utilities.$empty_string$.getGlobalValue();
                return cconcatenate(ans, funcall(details_func));
            }
        }
    }

    /**
     * Unifies the code for printing out error messages when a test for a
     * regression item fails (or succeeds unexpectedly). The core functions contains
     * strictly generic info, but can be passed a 'give more details' function
     * by the file coordinating the regression tests.
     */
    @LispMethod(comment = "Unifies the code for printing out error messages when a test for a\r\nregression item fails (or succeeds unexpectedly). The core functions contains\r\nstrictly generic info, but can be passed a \'give more details\' function\r\nby the file coordinating the regression tests.\nUnifies the code for printing out error messages when a test for a\nregression item fails (or succeeds unexpectedly). The core functions contains\nstrictly generic info, but can be passed a \'give more details\' function\nby the file coordinating the regression tests.")
    public static SubLObject pph_regression_diagnostics(final SubLObject details_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = (NIL != $pph_regression_failure_expectedP$.getDynamicValue(thread)) ? format(NIL, $str15$____PPH_REGRESSION_CASE_EXPECTED_, $pph_regression_current_test$.getDynamicValue(thread)) : string_utilities.$empty_string$.getGlobalValue();
        return cconcatenate(ans, funcall(details_func));
    }

    public static final SubLObject pph_regression_item_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_regression_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pph_regression_item_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pph_regression_item_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native.class ? T : NIL;
    }

    public static final SubLObject pph_regression_item_test_case_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.getField2();
    }

    public static SubLObject pph_regression_item_test_case(final SubLObject v_object) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pph_regression_item_purpose_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.getField3();
    }

    public static SubLObject pph_regression_item_purpose(final SubLObject v_object) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject pph_regression_item_excused_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.getField4();
    }

    public static SubLObject pph_regression_item_excused(final SubLObject v_object) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject pph_regression_item_language_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.getField5();
    }

    public static SubLObject pph_regression_item_language_mt(final SubLObject v_object) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject pph_regression_item_domain_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.getField6();
    }

    public static SubLObject pph_regression_item_domain_mt(final SubLObject v_object) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_pph_regression_item_test_case_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_regression_item_test_case(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pph_regression_item_purpose_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_regression_item_purpose(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pph_regression_item_excused_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_regression_item_excused(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_pph_regression_item_language_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_pph_regression_item_language_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_pph_regression_item_domain_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_REGRESSION_ITEM_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_pph_regression_item_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_regression_item_p(v_object) : "! pph_regression.pph_regression_item_p(v_object) " + "pph_regression.pph_regression_item_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_pph_regression_item_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TEST_CASE)) {
                        _csetf_pph_regression_item_test_case(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PURPOSE)) {
                            _csetf_pph_regression_item_purpose(v_new, current_value);
                        } else {
                            if (pcase_var.eql($EXCUSED)) {
                                _csetf_pph_regression_item_excused(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LANGUAGE_MT)) {
                                    _csetf_pph_regression_item_language_mt(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DOMAIN_MT)) {
                                        _csetf_pph_regression_item_domain_mt(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt39$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_pph_regression_item(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pph_regression.$pph_regression_item_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TEST_CASE)) {
                _csetf_pph_regression_item_test_case(v_new, current_value);
            } else
                if (pcase_var.eql($PURPOSE)) {
                    _csetf_pph_regression_item_purpose(v_new, current_value);
                } else
                    if (pcase_var.eql($EXCUSED)) {
                        _csetf_pph_regression_item_excused(v_new, current_value);
                    } else
                        if (pcase_var.eql($LANGUAGE_MT)) {
                            _csetf_pph_regression_item_language_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($DOMAIN_MT)) {
                                _csetf_pph_regression_item_domain_mt(v_new, current_value);
                            } else {
                                Errors.error($str40$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_regression_item(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_REGRESSION_ITEM, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TEST_CASE, pph_regression_item_test_case(obj));
        funcall(visitor_fn, obj, $SLOT, $PURPOSE, pph_regression_item_purpose(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCUSED, pph_regression_item_excused(obj));
        funcall(visitor_fn, obj, $SLOT, $LANGUAGE_MT, pph_regression_item_language_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_MT, pph_regression_item_domain_mt(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_REGRESSION_ITEM, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_regression_item_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_regression_item(obj, visitor_fn);
    }

    /**
     * Create a new regression item, that must have at least an object and a purpose
     * specified. Items that can be excused from the resulting output list or java phrases
     * (particularly variables), the language to be used, and the domain to be used,
     * may also be specified if the default (nil) isn't desired.
     *
     * @unknown check-typing on language-mt and domain-mt
     */
    @LispMethod(comment = "Create a new regression item, that must have at least an object and a purpose\r\nspecified. Items that can be excused from the resulting output list or java phrases\r\n(particularly variables), the language to be used, and the domain to be used,\r\nmay also be specified if the default (nil) isn\'t desired.\r\n\r\n@unknown check-typing on language-mt and domain-mt\nCreate a new regression item, that must have at least an object and a purpose\nspecified. Items that can be excused from the resulting output list or java phrases\n(particularly variables), the language to be used, and the domain to be used,\nmay also be specified if the default (nil) isn\'t desired.")
    public static final SubLObject new_pph_regression_item_alt(SubLObject obj, SubLObject purp, SubLObject exc, SubLObject lang, SubLObject domain) {
        if (exc == UNPROVIDED) {
            exc = $pph_regression_item_requires_all_args$.getDynamicValue();
        }
        if (lang == UNPROVIDED) {
            lang = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain == UNPROVIDED) {
            domain = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != exc) {
                SubLTrampolineFile.checkType(exc, PROPER_LIST_P);
            }
            if (NIL == lang) {
                lang = pph_vars.$pph_language_mt$.getDynamicValue(thread);
            }
            if (NIL != lang) {
                SubLTrampolineFile.checkType(lang, $sym41$HLMT_);
            }
            if (NIL == domain) {
                domain = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
            }
            if (NIL != domain) {
                SubLTrampolineFile.checkType(domain, $sym41$HLMT_);
            }
            {
                SubLObject reg_item = make_pph_regression_item(UNPROVIDED);
                _csetf_pph_regression_item_test_case(reg_item, obj);
                _csetf_pph_regression_item_purpose(reg_item, purp);
                _csetf_pph_regression_item_excused(reg_item, exc);
                _csetf_pph_regression_item_language_mt(reg_item, lang);
                _csetf_pph_regression_item_domain_mt(reg_item, domain);
                return reg_item;
            }
        }
    }

    /**
     * Create a new regression item, that must have at least an object and a purpose
     * specified. Items that can be excused from the resulting output list or java phrases
     * (particularly variables), the language to be used, and the domain to be used,
     * may also be specified if the default (nil) isn't desired.
     *
     * @unknown check-typing on language-mt and domain-mt
     */
    @LispMethod(comment = "Create a new regression item, that must have at least an object and a purpose\r\nspecified. Items that can be excused from the resulting output list or java phrases\r\n(particularly variables), the language to be used, and the domain to be used,\r\nmay also be specified if the default (nil) isn\'t desired.\r\n\r\n@unknown check-typing on language-mt and domain-mt\nCreate a new regression item, that must have at least an object and a purpose\nspecified. Items that can be excused from the resulting output list or java phrases\n(particularly variables), the language to be used, and the domain to be used,\nmay also be specified if the default (nil) isn\'t desired.")
    public static SubLObject new_pph_regression_item(final SubLObject obj, final SubLObject purp, SubLObject exc, SubLObject lang, SubLObject domain) {
        if (exc == UNPROVIDED) {
            exc = $pph_regression_item_requires_all_args$.getDynamicValue();
        }
        if (lang == UNPROVIDED) {
            lang = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain == UNPROVIDED) {
            domain = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != exc) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == list_utilities.proper_list_p(exc))) {
            throw new AssertionError(exc);
        }
        if (NIL == lang) {
            lang = pph_vars.$pph_language_mt$.getDynamicValue(thread);
        }
        if (((NIL != lang) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmtP(lang))) {
            throw new AssertionError(lang);
        }
        if (NIL == domain) {
            domain = pph_vars.$pph_domain_mt$.getDynamicValue(thread);
        }
        if (((NIL != domain) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.hlmtP(domain))) {
            throw new AssertionError(domain);
        }
        final SubLObject reg_item = make_pph_regression_item(UNPROVIDED);
        _csetf_pph_regression_item_test_case(reg_item, obj);
        _csetf_pph_regression_item_purpose(reg_item, purp);
        _csetf_pph_regression_item_excused(reg_item, exc);
        _csetf_pph_regression_item_language_mt(reg_item, lang);
        _csetf_pph_regression_item_domain_mt(reg_item, domain);
        return reg_item;
    }

    /**
     * Provide a copy of a pph-regression-item-p
     */
    @LispMethod(comment = "Provide a copy of a pph-regression-item-p")
    public static final SubLObject copy_pph_regression_item_alt(SubLObject old) {
        SubLTrampolineFile.checkType(old, PPH_REGRESSION_ITEM_P);
        {
            SubLObject obj = pph_regression_item_test_case(old);
            SubLObject purp = pph_regression_item_purpose(old);
            SubLObject exc = copy_list(pph_regression_item_excused(old));
            SubLObject lang = pph_regression_item_language_mt(old);
            SubLObject domain = pph_regression_item_domain_mt(old);
            return new_pph_regression_item(obj, purp, exc, lang, domain);
        }
    }

    /**
     * Provide a copy of a pph-regression-item-p
     */
    @LispMethod(comment = "Provide a copy of a pph-regression-item-p")
    public static SubLObject copy_pph_regression_item(final SubLObject old) {
        assert NIL != pph_regression_item_p(old) : "! pph_regression.pph_regression_item_p(old) " + ("pph_regression.pph_regression_item_p(old) " + "CommonSymbols.NIL != pph_regression.pph_regression_item_p(old) ") + old;
        final SubLObject obj = pph_regression_item_test_case(old);
        final SubLObject purp = pph_regression_item_purpose(old);
        final SubLObject exc = copy_list(pph_regression_item_excused(old));
        final SubLObject lang = pph_regression_item_language_mt(old);
        final SubLObject domain = pph_regression_item_domain_mt(old);
        return new_pph_regression_item(obj, purp, exc, lang, domain);
    }

    /**
     * Hide the exact implementation of the regression sets from the top-level code
     */
    @LispMethod(comment = "Hide the exact implementation of the regression sets from the top-level code")
    public static final SubLObject new_regression_store_alt(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (size == UNPROVIDED) {
            size = ONE_INTEGER;
        }
        return set.new_set(test, size);
    }

    /**
     * Hide the exact implementation of the regression sets from the top-level code
     */
    @LispMethod(comment = "Hide the exact implementation of the regression sets from the top-level code")
    public static SubLObject new_regression_store(SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        if (size == UNPROVIDED) {
            size = ONE_INTEGER;
        }
        return set.new_set(test, size);
    }

    /**
     * File a pph-regression-item such that it will be subject to the usual tests
     * If it had been marked as failing, undo that.
     * Proper defaults for optional args appear in @xref new-pph-regression-item
     *
     * @return the new PPH-REGRESSION-ITEM-P
     */
    @LispMethod(comment = "File a pph-regression-item such that it will be subject to the usual tests\r\nIf it had been marked as failing, undo that.\r\nProper defaults for optional args appear in @xref new-pph-regression-item\r\n\r\n@return the new PPH-REGRESSION-ITEM-P\nFile a pph-regression-item such that it will be subject to the usual tests\nIf it had been marked as failing, undo that.\nProper defaults for optional args appear in @xref new-pph-regression-item")
    public static final SubLObject add_case_to_pph_regression_store_alt(SubLObject store, SubLObject v_object, SubLObject docs, SubLObject exc, SubLObject lang, SubLObject dom) {
        if (exc == UNPROVIDED) {
            exc = NIL;
        }
        if (lang == UNPROVIDED) {
            lang = NIL;
        }
        if (dom == UNPROVIDED) {
            dom = NIL;
        }
        {
            SubLObject new_item = new_pph_regression_item(v_object, docs, exc, lang, dom);
            set.set_add(new_item, store);
            return new_item;
        }
    }

    /**
     * File a pph-regression-item such that it will be subject to the usual tests
     * If it had been marked as failing, undo that.
     * Proper defaults for optional args appear in @xref new-pph-regression-item
     *
     * @return the new PPH-REGRESSION-ITEM-P
     */
    @LispMethod(comment = "File a pph-regression-item such that it will be subject to the usual tests\r\nIf it had been marked as failing, undo that.\r\nProper defaults for optional args appear in @xref new-pph-regression-item\r\n\r\n@return the new PPH-REGRESSION-ITEM-P\nFile a pph-regression-item such that it will be subject to the usual tests\nIf it had been marked as failing, undo that.\nProper defaults for optional args appear in @xref new-pph-regression-item")
    public static SubLObject add_case_to_pph_regression_store(final SubLObject store, final SubLObject v_object, final SubLObject docs, SubLObject exc, SubLObject lang, SubLObject dom) {
        if (exc == UNPROVIDED) {
            exc = NIL;
        }
        if (lang == UNPROVIDED) {
            lang = NIL;
        }
        if (dom == UNPROVIDED) {
            dom = NIL;
        }
        final SubLObject new_item = new_pph_regression_item(v_object, docs, exc, lang, dom);
        set.set_add(new_item, store);
        return new_item;
    }

    /**
     * A version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p
     * instead of building one of its own.
     *
     * @return the BOOLEAN-P from set-add
     */
    @LispMethod(comment = "A version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p\r\ninstead of building one of its own.\r\n\r\n@return the BOOLEAN-P from set-add\nA version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p\ninstead of building one of its own.")
    public static final SubLObject add_item_to_pph_regression_store_alt(SubLObject store, SubLObject item) {
        SubLTrampolineFile.checkType(item, PPH_REGRESSION_ITEM_P);
        set.set_add(item, store);
        return item;
    }

    /**
     * A version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p
     * instead of building one of its own.
     *
     * @return the BOOLEAN-P from set-add
     */
    @LispMethod(comment = "A version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p\r\ninstead of building one of its own.\r\n\r\n@return the BOOLEAN-P from set-add\nA version of @xref add-to-pph-regression-store which accepts a pph-regression-item-p\ninstead of building one of its own.")
    public static SubLObject add_item_to_pph_regression_store(final SubLObject store, final SubLObject item) {
        assert NIL != pph_regression_item_p(item) : "! pph_regression.pph_regression_item_p(item) " + ("pph_regression.pph_regression_item_p(item) " + "CommonSymbols.NIL != pph_regression.pph_regression_item_p(item) ") + item;
        set.set_add(item, store);
        return item;
    }

    /**
     * Wipe out a regression store... use this when a test case is deleted entirely,
     * e.g., because you had to change the name of a constant
     */
    @LispMethod(comment = "Wipe out a regression store... use this when a test case is deleted entirely,\r\ne.g., because you had to change the name of a constant\nWipe out a regression store... use this when a test case is deleted entirely,\ne.g., because you had to change the name of a constant")
    public static final SubLObject clear_regression_store_alt(SubLObject store) {
        return set.clear_set(store);
    }

    /**
     * Wipe out a regression store... use this when a test case is deleted entirely,
     * e.g., because you had to change the name of a constant
     */
    @LispMethod(comment = "Wipe out a regression store... use this when a test case is deleted entirely,\r\ne.g., because you had to change the name of a constant\nWipe out a regression store... use this when a test case is deleted entirely,\ne.g., because you had to change the name of a constant")
    public static SubLObject clear_regression_store(final SubLObject store) {
        return set.clear_set(store);
    }

    /**
     * Mark tem as passing (or failing) the specified test function with the specified force(s)
     * Note that the output-list battery and java-phrase battery use disjoint sets of tests
     */
    @LispMethod(comment = "Mark tem as passing (or failing) the specified test function with the specified force(s)\r\nNote that the output-list battery and java-phrase battery use disjoint sets of tests\nMark tem as passing (or failing) the specified test function with the specified force(s)\nNote that the output-list battery and java-phrase battery use disjoint sets of tests")
    public static final SubLObject bless_or_doom_pph_regression_item_alt(SubLObject item, SubLObject key_func, SubLObject force_list, SubLObject doomedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL == key_func) || (NIL == force_list)) {
                return T;
            }
            {
                SubLObject dict = dictionary.dictionary_lookup($pph_regression_doomed_combinations$.getDynamicValue(thread), item, UNPROVIDED);
                if (NIL == dict) {
                    if (doomedP.eql($pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                        return T;
                    }
                    dict = dictionary.new_dictionary(symbol_function(EQUALP), FIVE_INTEGER);
                    dictionary.dictionary_enter($pph_regression_doomed_combinations$.getDynamicValue(thread), item, dict);
                }
                {
                    SubLObject v_set = dictionary.dictionary_lookup(dict, key_func, UNPROVIDED);
                    if (NIL == v_set) {
                        if (doomedP.eql($pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                            return T;
                        }
                        v_set = set.new_set(symbol_function(EQUALP), UNPROVIDED);
                        dictionary.dictionary_enter(dict, key_func, v_set);
                    }
                    if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                        Errors.warn($str_alt42$updating_status_of__S__w_r_t__tes, pph_regression_item_test_case(item), key_func);
                    }
                    {
                        SubLObject cdolist_list_var = force_list;
                        SubLObject force = NIL;
                        for (force = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , force = cdolist_list_var.first()) {
                            if (doomedP.eql($pph_regression_item_case_doomed$.getDynamicValue(thread))) {
                                if (NIL == set.set_memberP(force, v_set)) {
                                    if (NIL != set.set_add(force, v_set)) {
                                        if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                            Errors.warn($str_alt43$____marked_as_failing_with_force_, force);
                                        }
                                    } else {
                                        Errors.sublisp_break($str_alt44$____failing_to_mark_as_failing_un, new SubLObject[]{ force });
                                    }
                                }
                            } else {
                                if (NIL != set.set_remove(force, v_set)) {
                                    if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                                        Errors.warn($str_alt45$____now_blessed_as_passing_with_f, force);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return T;
        }
    }

    /**
     * Mark tem as passing (or failing) the specified test function with the specified force(s)
     * Note that the output-list battery and java-phrase battery use disjoint sets of tests
     */
    @LispMethod(comment = "Mark tem as passing (or failing) the specified test function with the specified force(s)\r\nNote that the output-list battery and java-phrase battery use disjoint sets of tests\nMark tem as passing (or failing) the specified test function with the specified force(s)\nNote that the output-list battery and java-phrase battery use disjoint sets of tests")
    public static SubLObject bless_or_doom_pph_regression_item(final SubLObject item, final SubLObject key_func, final SubLObject force_list, final SubLObject doomedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == key_func) || (NIL == force_list)) {
            return T;
        }
        SubLObject dict = dictionary.dictionary_lookup($pph_regression_doomed_combinations$.getDynamicValue(thread), item, UNPROVIDED);
        if (NIL == dict) {
            if (doomedP.eql($pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                return T;
            }
            dict = dictionary.new_dictionary(symbol_function(EQUALP), FIVE_INTEGER);
            dictionary.dictionary_enter($pph_regression_doomed_combinations$.getDynamicValue(thread), item, dict);
        }
        SubLObject v_set = dictionary.dictionary_lookup(dict, key_func, UNPROVIDED);
        if (NIL == v_set) {
            if (doomedP.eql($pph_regression_item_case_blessed$.getDynamicValue(thread))) {
                return T;
            }
            v_set = set.new_set(symbol_function(EQUALP), UNPROVIDED);
            dictionary.dictionary_enter(dict, key_func, v_set);
        }
        if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            Errors.warn($str48$updating_status_of__S__w_r_t__tes, pph_regression_item_test_case(item), key_func);
        }
        SubLObject cdolist_list_var = force_list;
        SubLObject force = NIL;
        force = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (doomedP.eql($pph_regression_item_case_doomed$.getDynamicValue(thread))) {
                if (NIL == set.set_memberP(force, v_set)) {
                    if (NIL != set.set_add(force, v_set)) {
                        if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            Errors.warn($str49$____marked_as_failing_with_force_, force);
                        }
                    } else {
                        Errors.sublisp_break($str50$____failing_to_mark_as_failing_un, new SubLObject[]{ force });
                    }
                }
            } else
                if ((NIL != set.set_remove(force, v_set)) && $pph_regression_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                    Errors.warn($str51$____now_blessed_as_passing_with_f, force);
                }

            cdolist_list_var = cdolist_list_var.rest();
            force = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject doom_pph_regression_item_to_fail_with_forces_alt(SubLObject item, SubLObject test_func, SubLObject forces) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bless_or_doom_pph_regression_item(item, test_func, forces, $pph_regression_item_case_doomed$.getDynamicValue(thread));
        }
    }

    public static SubLObject doom_pph_regression_item_to_fail_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return bless_or_doom_pph_regression_item(item, test_func, forces, $pph_regression_item_case_doomed$.getDynamicValue(thread));
    }

    public static final SubLObject bless_pph_regression_item_to_pass_with_forces_alt(SubLObject item, SubLObject test_func, SubLObject forces) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return bless_or_doom_pph_regression_item(item, test_func, forces, $pph_regression_item_case_blessed$.getDynamicValue(thread));
        }
    }

    public static SubLObject bless_pph_regression_item_to_pass_with_forces(final SubLObject item, final SubLObject test_func, final SubLObject forces) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return bless_or_doom_pph_regression_item(item, test_func, forces, $pph_regression_item_case_blessed$.getDynamicValue(thread));
    }

    /**
     * Returns a set of el-formula-p's for a test-method to evaluate, skipping ones
     * which are known to fail. Also performs nart-substitute on each formula.
     *
     * @unknown rip out dictionary support when the defstruct conversion is complete
     * @param FUNCTION;
     * 		function to be called (w/in calling file) to check entire cases
     * @param LISTP;
     * 		a list of set of pph-regression-items - evaluate all their objects
     * @param LISTP;
     * 		a list of KB predicates - find all gafs whose operators are in this list;
     * 		evaluate all their (legitimate) arg1's
     * @return SET-P; of el-formula-p's to be evaluated, if any
     */
    @LispMethod(comment = "Returns a set of el-formula-p\'s for a test-method to evaluate, skipping ones\r\nwhich are known to fail. Also performs nart-substitute on each formula.\r\n\r\n@unknown rip out dictionary support when the defstruct conversion is complete\r\n@param FUNCTION;\r\n\t\tfunction to be called (w/in calling file) to check entire cases\r\n@param LISTP;\r\n\t\ta list of set of pph-regression-items - evaluate all their objects\r\n@param LISTP;\r\n\t\ta list of KB predicates - find all gafs whose operators are in this list;\r\n\t\tevaluate all their (legitimate) arg1\'s\r\n@return SET-P; of el-formula-p\'s to be evaluated, if any\nReturns a set of el-formula-p\'s for a test-method to evaluate, skipping ones\nwhich are known to fail. Also performs nart-substitute on each formula.")
    public static final SubLObject gather_pph_regression_tests_alt(SubLObject filter, SubLObject specs, SubLObject preds) {
        if (specs == UNPROVIDED) {
            specs = NIL;
        }
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != specs) || (NIL != preds))) {
                if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    Errors.warn($str_alt46$At_least_1_argument_for_gather_pp);
                }
                return set.new_set(UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject master_set = set.new_set(symbol_function(EQUALP), UNPROVIDED);
                {
                    SubLObject cdolist_list_var = specs;
                    SubLObject this_spec = NIL;
                    for (this_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_spec = cdolist_list_var.first()) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(this_spec);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject this_pph_item = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, this_pph_item)) {
                                        SubLTrampolineFile.checkType(this_pph_item, PPH_REGRESSION_ITEM_P);
                                        if (NIL == test_object_doomedP(this_pph_item, filter)) {
                                            set.set_add(this_pph_item, master_set);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = preds;
                    SubLObject this_pred = NIL;
                    for (this_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , this_pred = cdolist_list_var.first()) {
                        if (NIL != isa.isaP(this_pred, $$PPHRegressionPredicate, UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject cdolist_list_var_1 = kb_mapping.gather_predicate_extent_index(this_pred, UNPROVIDED, UNPROVIDED);
                                SubLObject found = NIL;
                                for (found = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , found = cdolist_list_var_1.first()) {
                                    if (NIL != el_formula_p(found)) {
                                        if (NIL == test_object_doomedP(found, filter)) {
                                            set.set_add(new_pph_regression_item(found, $$$KB_search, UNPROVIDED, UNPROVIDED, UNPROVIDED), master_set);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return master_set;
            }
        }
    }

    /**
     * Returns a set of el-formula-p's for a test-method to evaluate, skipping ones
     * which are known to fail. Also performs nart-substitute on each formula.
     *
     * @unknown rip out dictionary support when the defstruct conversion is complete
     * @param FUNCTION;
     * 		function to be called (w/in calling file) to check entire cases
     * @param LISTP;
     * 		a list of set of pph-regression-items - evaluate all their objects
     * @param LISTP;
     * 		a list of KB predicates - find all gafs whose operators are in this list;
     * 		evaluate all their (legitimate) arg1's
     * @return SET-P; of el-formula-p's to be evaluated, if any
     */
    @LispMethod(comment = "Returns a set of el-formula-p\'s for a test-method to evaluate, skipping ones\r\nwhich are known to fail. Also performs nart-substitute on each formula.\r\n\r\n@unknown rip out dictionary support when the defstruct conversion is complete\r\n@param FUNCTION;\r\n\t\tfunction to be called (w/in calling file) to check entire cases\r\n@param LISTP;\r\n\t\ta list of set of pph-regression-items - evaluate all their objects\r\n@param LISTP;\r\n\t\ta list of KB predicates - find all gafs whose operators are in this list;\r\n\t\tevaluate all their (legitimate) arg1\'s\r\n@return SET-P; of el-formula-p\'s to be evaluated, if any\nReturns a set of el-formula-p\'s for a test-method to evaluate, skipping ones\nwhich are known to fail. Also performs nart-substitute on each formula.")
    public static SubLObject gather_pph_regression_tests(final SubLObject filter, SubLObject specs, SubLObject preds) {
        if (specs == UNPROVIDED) {
            specs = NIL;
        }
        if (preds == UNPROVIDED) {
            preds = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == specs) && (NIL == preds)) {
            if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                Errors.warn($str52$At_least_1_argument_for_gather_pp);
            }
            return set.new_set(UNPROVIDED, UNPROVIDED);
        }
        final SubLObject master_set = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var = specs;
        SubLObject this_spec = NIL;
        this_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(this_spec);
            SubLObject basis_object;
            SubLObject state;
            SubLObject this_pph_item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                this_pph_item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, this_pph_item)) {
                    assert NIL != pph_regression_item_p(this_pph_item) : "! pph_regression.pph_regression_item_p(this_pph_item) " + ("pph_regression.pph_regression_item_p(this_pph_item) " + "CommonSymbols.NIL != pph_regression.pph_regression_item_p(this_pph_item) ") + this_pph_item;
                    if (NIL == test_object_doomedP(this_pph_item, filter)) {
                        set.set_add(this_pph_item, master_set);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_spec = cdolist_list_var.first();
        } 
        cdolist_list_var = preds;
        SubLObject this_pred = NIL;
        this_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != isa.isaP(this_pred, $$PPHRegressionPredicate, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var_$1 = kb_mapping.gather_predicate_extent_index(this_pred, UNPROVIDED, UNPROVIDED);
                SubLObject found = NIL;
                found = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    if ((NIL != el_formula_p(found)) && (NIL == test_object_doomedP(found, filter))) {
                        set.set_add(new_pph_regression_item(found, $$$KB_search, UNPROVIDED, UNPROVIDED, UNPROVIDED), master_set);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    found = cdolist_list_var_$1.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pred = cdolist_list_var.first();
        } 
        return master_set;
    }

    /**
     * Flag an object as doomed to fail one (or usually more) regression tests.
     * The idea is to mark things that break _everything_, not just ones that
     * break a particular test-case over multiple pph-forces.
     * Note that simply removing a mark-object-as-failing-pph-regression call from
     * a file won't remove it from the banned list for your current session... you
     * also have to call @xref bless-object-for-pph-regression (once).
     *
     * @param OBJECT;
     * 		el-formula-p, constant-p, stringp, numberp, or hlmt?
     * 		I assume it doesn't make sense to mark an el-variable-p as doomed
     * @return BOOLEANP; whether it was added - basically whether it was one of those types
     */
    @LispMethod(comment = "Flag an object as doomed to fail one (or usually more) regression tests.\r\nThe idea is to mark things that break _everything_, not just ones that\r\nbreak a particular test-case over multiple pph-forces.\r\nNote that simply removing a mark-object-as-failing-pph-regression call from\r\na file won\'t remove it from the banned list for your current session... you\r\nalso have to call @xref bless-object-for-pph-regression (once).\r\n\r\n@param OBJECT;\r\n\t\tel-formula-p, constant-p, stringp, numberp, or hlmt?\r\n\t\tI assume it doesn\'t make sense to mark an el-variable-p as doomed\r\n@return BOOLEANP; whether it was added - basically whether it was one of those types\nFlag an object as doomed to fail one (or usually more) regression tests.\nThe idea is to mark things that break _everything_, not just ones that\nbreak a particular test-case over multiple pph-forces.\nNote that simply removing a mark-object-as-failing-pph-regression call from\na file won\'t remove it from the banned list for your current session... you\nalso have to call @xref bless-object-for-pph-regression (once).")
    public static final SubLObject mark_object_as_failing_pph_regression_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((((NIL != el_formula_p(v_object)) || (NIL != constant_p(v_object))) || v_object.isString()) || v_object.isNumber()) || (NIL != hlmtP(v_object))) {
                return set.set_add(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Flag an object as doomed to fail one (or usually more) regression tests.\r\nThe idea is to mark things that break _everything_, not just ones that\r\nbreak a particular test-case over multiple pph-forces.\r\nNote that simply removing a mark-object-as-failing-pph-regression call from\r\na file won\'t remove it from the banned list for your current session... you\r\nalso have to call @xref bless-object-for-pph-regression (once).\r\n\r\n@param OBJECT;\r\n\t\tel-formula-p, constant-p, stringp, numberp, or hlmt?\r\n\t\tI assume it doesn\'t make sense to mark an el-variable-p as doomed\r\n@return BOOLEANP; whether it was added - basically whether it was one of those types\nFlag an object as doomed to fail one (or usually more) regression tests.\nThe idea is to mark things that break _everything_, not just ones that\nbreak a particular test-case over multiple pph-forces.\nNote that simply removing a mark-object-as-failing-pph-regression call from\na file won\'t remove it from the banned list for your current session... you\nalso have to call @xref bless-object-for-pph-regression (once).")
    public static SubLObject mark_object_as_failing_pph_regression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((((NIL != el_formula_p(v_object)) || (NIL != constant_p(v_object))) || v_object.isString()) || v_object.isNumber()) || (NIL != hlmt.hlmtP(v_object))) {
            return set.set_add(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
        }
        return NIL;
    }

    /**
     * Delete object from the list of those doomed to fail regression
     *
     * @param OBJECT
     * 		to be blessed
     * @return BOOELANP; whether it had been marked as doomed to begin with
     */
    @LispMethod(comment = "Delete object from the list of those doomed to fail regression\r\n\r\n@param OBJECT\r\n\t\tto be blessed\r\n@return BOOELANP; whether it had been marked as doomed to begin with")
    public static final SubLObject bless_object_for_pph_regression_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set.set_remove(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Delete object from the list of those doomed to fail regression\r\n\r\n@param OBJECT\r\n\t\tto be blessed\r\n@return BOOELANP; whether it had been marked as doomed to begin with")
    public static SubLObject bless_object_for_pph_regression(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_remove(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
    }

    /**
     * Check whether an object is doomed to fail regression tests
     *
     * @param OBJECT;
     * 		could be anything
     * @return BOOLEAN-P; vacuously NIL if not the sort of thing that could be doomed
     */
    @LispMethod(comment = "Check whether an object is doomed to fail regression tests\r\n\r\n@param OBJECT;\r\n\t\tcould be anything\r\n@return BOOLEAN-P; vacuously NIL if not the sort of thing that could be doomed")
    public static final SubLObject doomed_objectP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return set.set_memberP(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Check whether an object is doomed to fail regression tests\r\n\r\n@param OBJECT;\r\n\t\tcould be anything\r\n@return BOOLEAN-P; vacuously NIL if not the sort of thing that could be doomed")
    public static SubLObject doomed_objectP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return set.set_memberP(v_object, $pph_known_problem_objects$.getDynamicValue(thread));
    }

    /**
     * Determine whether we know a object (or one of its elements) is doomed to fail regression
     *
     * @param object;
     * 		to be checked; typically an el-formula-p
     * @return boolean-p; T or NIL depending on whether it's a problem
     */
    @LispMethod(comment = "Determine whether we know a object (or one of its elements) is doomed to fail regression\r\n\r\n@param object;\r\n\t\tto be checked; typically an el-formula-p\r\n@return boolean-p; T or NIL depending on whether it\'s a problem")
    public static final SubLObject test_object_doomedP_alt(SubLObject pph_item, SubLObject relevant_test) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(pph_item, PPH_REGRESSION_ITEM_P);
            if (NIL != doomed_objectP(pph_regression_item_language_mt(pph_item))) {
                if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    Errors.warn($str_alt49$skipping_this_case_as_language_mt, pph_regression_item_language_mt(pph_item), pph_item);
                }
                return T;
            }
            if (NIL != doomed_objectP(pph_regression_item_domain_mt(pph_item))) {
                if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                    Errors.warn($str_alt50$skipping_this_case_as_domain_mt__, pph_regression_item_domain_mt(pph_item), pph_item);
                }
                return T;
            }
            {
                SubLObject v_object = pph_regression_item_test_case(pph_item);
                SubLObject bogus = cycl_utilities.expression_find_if($sym51$INVALID_CONSTANT_, v_object, UNPROVIDED, UNPROVIDED);
                if (NIL != bogus) {
                    pph_regression_tracking_formula_with_kb_gap(v_object, bogus);
                    return T;
                }
                {
                    SubLObject bad_elements = (NIL != relevant_test) ? ((SubLObject) (funcall(relevant_test, v_object))) : set.new_set(UNPROVIDED, UNPROVIDED);
                    if (NIL == set.empty_set_p(bad_elements)) {
                        if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                            Errors.warn($str_alt52$_S_would_fail_regression__skippin, set.set_element_list(bad_elements), v_object);
                        }
                        return T;
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Determine whether we know a object (or one of its elements) is doomed to fail regression\r\n\r\n@param object;\r\n\t\tto be checked; typically an el-formula-p\r\n@return boolean-p; T or NIL depending on whether it\'s a problem")
    public static SubLObject test_object_doomedP(final SubLObject pph_item, final SubLObject relevant_test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != pph_regression_item_p(pph_item) : "! pph_regression.pph_regression_item_p(pph_item) " + ("pph_regression.pph_regression_item_p(pph_item) " + "CommonSymbols.NIL != pph_regression.pph_regression_item_p(pph_item) ") + pph_item;
        if (NIL != doomed_objectP(pph_regression_item_language_mt(pph_item))) {
            if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                Errors.warn($str55$skipping_this_case_as_language_mt, pph_regression_item_language_mt(pph_item), pph_item);
            }
            return T;
        }
        if (NIL != doomed_objectP(pph_regression_item_domain_mt(pph_item))) {
            if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                Errors.warn($str56$skipping_this_case_as_domain_mt__, pph_regression_item_domain_mt(pph_item), pph_item);
            }
            return T;
        }
        final SubLObject v_object = pph_regression_item_test_case(pph_item);
        final SubLObject bogus = cycl_utilities.expression_find_if($sym57$INVALID_CONSTANT_, v_object, UNPROVIDED, UNPROVIDED);
        if (NIL != bogus) {
            pph_regression_tracking_formula_with_kb_gap(v_object, bogus);
            return T;
        }
        final SubLObject bad_elements = (NIL != relevant_test) ? funcall(relevant_test, v_object) : set.new_set(UNPROVIDED, UNPROVIDED);
        if (NIL == set.empty_set_p(bad_elements)) {
            if ($pph_regression_trace_level$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                Errors.warn($str58$_S_would_fail_regression__skippin, set.set_element_list(bad_elements), v_object);
            }
            return T;
        }
        return NIL;
    }

    public static final SubLObject pph_regression_tracking_reset_skips_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            dictionary.clear_dictionary($pph_regression_hosed_by_kb$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject pph_regression_tracking_reset_skips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dictionary.clear_dictionary($pph_regression_hosed_by_kb$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject pph_regression_tracking_formula_with_kb_gap_alt(SubLObject formula, SubLObject bogus) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return dictionary.dictionary_enter($pph_regression_hosed_by_kb$.getDynamicValue(thread), formula, bogus);
        }
    }

    public static SubLObject pph_regression_tracking_formula_with_kb_gap(final SubLObject formula, final SubLObject bogus) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter($pph_regression_hosed_by_kb$.getDynamicValue(thread), formula, bogus);
    }

    public static final SubLObject pph_regression_tracking_print_skips_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != dictionary.non_empty_dictionary_p($pph_regression_hosed_by_kb$.getDynamicValue(thread))) {
                Errors.warn($str_alt53$_____ALERT___KB_ISSUES___ALERT___);
                Errors.warn($str_alt54$These_test_cases_were_skipped_due);
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($pph_regression_hosed_by_kb$.getDynamicValue(thread)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject this_formula = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject these_constants = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            Errors.warn($str_alt55$_S_in__S, these_constants, this_formula);
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject pph_regression_tracking_print_skips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dictionary.non_empty_dictionary_p($pph_regression_hosed_by_kb$.getDynamicValue(thread))) {
            Errors.warn($str59$_____ALERT___KB_ISSUES___ALERT___);
            Errors.warn($str60$These_test_cases_were_skipped_due);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($pph_regression_hosed_by_kb$.getDynamicValue(thread))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject this_formula = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject these_constants = thread.secondMultipleValue();
                thread.resetMultipleValues();
                Errors.warn($str61$_S_in__S, these_constants, this_formula);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            return T;
        }
        return NIL;
    }

    /**
     * Wrapper macro to isolate implementation of regression stores
     */
    @LispMethod(comment = "Wrapper macro to isolate implementation of regression stores")
    public static final SubLObject do_pph_regression_store_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject store = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt56);
                    store = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt56);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt56);
                            if (NIL == member(current_2, $list_alt57, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt56);
                        }
                        {
                            SubLObject test_func_tail = property_list_member($TEST_FUNC, current);
                            SubLObject test_func = (NIL != test_func_tail) ? ((SubLObject) (cadr(test_func_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list($pph_tmp_regression_item$, list(GATHER_PPH_REGRESSION_TESTS, test_func, list(LIST, store))), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Wrapper macro to isolate implementation of regression stores")
    public static SubLObject do_pph_regression_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject store = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        store = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list62);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list62);
            if (NIL == member(current_$2, $list63, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list62);
        }
        final SubLObject test_func_tail = property_list_member($TEST_FUNC, current);
        final SubLObject test_func = (NIL != test_func_tail) ? cadr(test_func_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list($pph_tmp_regression_item$, list(GATHER_PPH_REGRESSION_TESTS, test_func, list(LIST, store))), append(body, NIL));
    }

    /**
     * Wrapper macro to isolate implementation of test objects within regression items
     */
    @LispMethod(comment = "Wrapper macro to isolate implementation of test objects within regression items")
    public static final SubLObject with_pph_test_object_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt63, append(body, NIL));
        }
    }

    /**
     * Wrapper macro to isolate implementation of test objects within regression items
     */
    @LispMethod(comment = "Wrapper macro to isolate implementation of test objects within regression items")
    public static SubLObject with_pph_test_object(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list69, append(body, NIL));
    }

    /**
     * Applies a test function to the current *pph-regression-item*, checking for
     * fail-unless or fail-if, depending on whether the item has been marked
     * as *pph-regression-failure-expected?* by the calling file.
     * I believe the use of the instance-method stuff demands that this be
     * a macro rather than a function.
     */
    @LispMethod(comment = "Applies a test function to the current *pph-regression-item*, checking for\r\nfail-unless or fail-if, depending on whether the item has been marked\r\nas *pph-regression-failure-expected?* by the calling file.\r\nI believe the use of the instance-method stuff demands that this be\r\na macro rather than a function.\nApplies a test function to the current *pph-regression-item*, checking for\nfail-unless or fail-if, depending on whether the item has been marked\nas *pph-regression-failure-expected?* by the calling file.\nI believe the use of the instance-method stuff demands that this be\na macro rather than a function.")
    public static final SubLObject do_pph_test_in_proper_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject test_func = NIL;
            SubLObject reg_specific_func = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt64);
            test_func = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt64);
            reg_specific_func = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CLET, list(list($pph_regression_current_test$, test_func)), list(FUNCALL_INSTANCE_METHOD, SELF, $list_alt68, list(FUNCALL, test_func), list(PPH_REGRESSION_DIAGNOSTICS, reg_specific_func)));
            } else {
                cdestructuring_bind_error(datum, $list_alt64);
            }
        }
        return NIL;
    }

    /**
     * Applies a test function to the current *pph-regression-item*, checking for
     * fail-unless or fail-if, depending on whether the item has been marked
     * as *pph-regression-failure-expected?* by the calling file.
     * I believe the use of the instance-method stuff demands that this be
     * a macro rather than a function.
     */
    @LispMethod(comment = "Applies a test function to the current *pph-regression-item*, checking for\r\nfail-unless or fail-if, depending on whether the item has been marked\r\nas *pph-regression-failure-expected?* by the calling file.\r\nI believe the use of the instance-method stuff demands that this be\r\na macro rather than a function.\nApplies a test function to the current *pph-regression-item*, checking for\nfail-unless or fail-if, depending on whether the item has been marked\nas *pph-regression-failure-expected?* by the calling file.\nI believe the use of the instance-method stuff demands that this be\na macro rather than a function.")
    public static SubLObject do_pph_test_in_proper_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test_func = NIL;
        SubLObject reg_specific_func = NIL;
        destructuring_bind_must_consp(current, datum, $list70);
        test_func = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list70);
        reg_specific_func = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CLET, list(list($pph_regression_current_test$, test_func)), list(FUNCALL_INSTANCE_METHOD, SELF, $list74, list(FUNCALL, test_func), list(PPH_REGRESSION_DIAGNOSTICS, reg_specific_func)));
        }
        cdestructuring_bind_error(datum, $list70);
        return NIL;
    }

    public static SubLObject declare_pph_regression_file() {
        declareMacro("pph_regression_warn", "PPH-REGRESSION-WARN");
        declareMacro("pph_regression_warn_wXo_false_positives", "PPH-REGRESSION-WARN-W/O-FALSE-POSITIVES");
        declareFunction("pph_regression_diagnostics", "PPH-REGRESSION-DIAGNOSTICS", 1, 0, false);
        declareFunction("pph_regression_item_print_function_trampoline", "PPH-REGRESSION-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_regression_item_p", "PPH-REGRESSION-ITEM-P", 1, 0, false);
        new pph_regression.$pph_regression_item_p$UnaryFunction();
        declareFunction("pph_regression_item_test_case", "PPH-REGRESSION-ITEM-TEST-CASE", 1, 0, false);
        declareFunction("pph_regression_item_purpose", "PPH-REGRESSION-ITEM-PURPOSE", 1, 0, false);
        declareFunction("pph_regression_item_excused", "PPH-REGRESSION-ITEM-EXCUSED", 1, 0, false);
        declareFunction("pph_regression_item_language_mt", "PPH-REGRESSION-ITEM-LANGUAGE-MT", 1, 0, false);
        declareFunction("pph_regression_item_domain_mt", "PPH-REGRESSION-ITEM-DOMAIN-MT", 1, 0, false);
        declareFunction("_csetf_pph_regression_item_test_case", "_CSETF-PPH-REGRESSION-ITEM-TEST-CASE", 2, 0, false);
        declareFunction("_csetf_pph_regression_item_purpose", "_CSETF-PPH-REGRESSION-ITEM-PURPOSE", 2, 0, false);
        declareFunction("_csetf_pph_regression_item_excused", "_CSETF-PPH-REGRESSION-ITEM-EXCUSED", 2, 0, false);
        declareFunction("_csetf_pph_regression_item_language_mt", "_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT", 2, 0, false);
        declareFunction("_csetf_pph_regression_item_domain_mt", "_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT", 2, 0, false);
        declareFunction("make_pph_regression_item", "MAKE-PPH-REGRESSION-ITEM", 0, 1, false);
        declareFunction("visit_defstruct_pph_regression_item", "VISIT-DEFSTRUCT-PPH-REGRESSION-ITEM", 2, 0, false);
        declareFunction("visit_defstruct_object_pph_regression_item_method", "VISIT-DEFSTRUCT-OBJECT-PPH-REGRESSION-ITEM-METHOD", 2, 0, false);
        declareFunction("new_pph_regression_item", "NEW-PPH-REGRESSION-ITEM", 2, 3, false);
        declareFunction("copy_pph_regression_item", "COPY-PPH-REGRESSION-ITEM", 1, 0, false);
        declareFunction("new_regression_store", "NEW-REGRESSION-STORE", 0, 2, false);
        declareFunction("add_case_to_pph_regression_store", "ADD-CASE-TO-PPH-REGRESSION-STORE", 3, 3, false);
        declareFunction("add_item_to_pph_regression_store", "ADD-ITEM-TO-PPH-REGRESSION-STORE", 2, 0, false);
        declareFunction("clear_regression_store", "CLEAR-REGRESSION-STORE", 1, 0, false);
        declareFunction("bless_or_doom_pph_regression_item", "BLESS-OR-DOOM-PPH-REGRESSION-ITEM", 4, 0, false);
        declareFunction("doom_pph_regression_item_to_fail_with_forces", "DOOM-PPH-REGRESSION-ITEM-TO-FAIL-WITH-FORCES", 3, 0, false);
        declareFunction("bless_pph_regression_item_to_pass_with_forces", "BLESS-PPH-REGRESSION-ITEM-TO-PASS-WITH-FORCES", 3, 0, false);
        declareFunction("gather_pph_regression_tests", "GATHER-PPH-REGRESSION-TESTS", 1, 2, false);
        declareFunction("mark_object_as_failing_pph_regression", "MARK-OBJECT-AS-FAILING-PPH-REGRESSION", 1, 0, false);
        declareFunction("bless_object_for_pph_regression", "BLESS-OBJECT-FOR-PPH-REGRESSION", 1, 0, false);
        declareFunction("doomed_objectP", "DOOMED-OBJECT?", 1, 0, false);
        declareFunction("test_object_doomedP", "TEST-OBJECT-DOOMED?", 2, 0, false);
        declareFunction("pph_regression_tracking_reset_skips", "PPH-REGRESSION-TRACKING-RESET-SKIPS", 0, 0, false);
        declareFunction("pph_regression_tracking_formula_with_kb_gap", "PPH-REGRESSION-TRACKING-FORMULA-WITH-KB-GAP", 2, 0, false);
        declareFunction("pph_regression_tracking_print_skips", "PPH-REGRESSION-TRACKING-PRINT-SKIPS", 0, 0, false);
        declareMacro("do_pph_regression_store", "DO-PPH-REGRESSION-STORE");
        declareMacro("with_pph_test_object", "WITH-PPH-TEST-OBJECT");
        declareMacro("do_pph_test_in_proper_mode", "DO-PPH-TEST-IN-PROPER-MODE");
        return NIL;
    }

    public static SubLObject init_pph_regression_file() {
        defvar("*PPH-TMP-REGRESSION-ITEM*", NIL);
        defvar("*PPH-TMP-TEST-OBJECT*", NIL);
        defvar("*PPH-REGRESSION-FAILURE-EXPECTED?*", NIL);
        defvar("*PPH-KNOWN-PROBLEM-OBJECTS*", set.new_set(UNPROVIDED, UNPROVIDED));
        defvar("*PPH-REGRESSION-CURRENT-TEST*", NIL);
        defvar("*PPH-REGRESSION-HOSED-BY-KB*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defparameter("*PPH-REGRESSION-TRACE-LEVEL*", ZERO_INTEGER);
        defconstant("*DTP-PPH-REGRESSION-ITEM*", PPH_REGRESSION_ITEM);
        defvar("*PPH-REGRESSION-ITEM-REQUIRES-ALL-ARGS*", NIL);
        defvar("*PPH-REGRESSION-DOOMED-COMBINATIONS*", dictionary.new_dictionary(symbol_function(EQUALP), TEN_INTEGER));
        defparameter("*PPH-REGRESSION-ITEM-CASE-BLESSED*", NIL);
        defparameter("*PPH-REGRESSION-ITEM-CASE-DOOMED*", T);
        return NIL;
    }

    public static SubLObject setup_pph_regression_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_regression_item$.getGlobalValue(), symbol_function(PPH_REGRESSION_ITEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list24);
        def_csetf(PPH_REGRESSION_ITEM_TEST_CASE, _CSETF_PPH_REGRESSION_ITEM_TEST_CASE);
        def_csetf(PPH_REGRESSION_ITEM_PURPOSE, _CSETF_PPH_REGRESSION_ITEM_PURPOSE);
        def_csetf(PPH_REGRESSION_ITEM_EXCUSED, _CSETF_PPH_REGRESSION_ITEM_EXCUSED);
        def_csetf(PPH_REGRESSION_ITEM_LANGUAGE_MT, _CSETF_PPH_REGRESSION_ITEM_LANGUAGE_MT);
        def_csetf(PPH_REGRESSION_ITEM_DOMAIN_MT, _CSETF_PPH_REGRESSION_ITEM_DOMAIN_MT);
        identity(PPH_REGRESSION_ITEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_regression_item$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_REGRESSION_ITEM_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_regression_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_regression_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_regression_file();
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static {
    }

    static private final SubLList $list_alt5 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt6 = list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*")), list(makeSymbol(">="), makeSymbol("*PPH-REGRESSION-TRACE-LEVEL*"), TWO_INTEGER));

    static private final SubLString $str_alt12$______PPH_REGRESSION_PROBLEM____ = makeString("  *** PPH REGRESSION PROBLEM ***");

    static private final SubLList $list_alt13 = list(makeString("  *** SEE BELOW FOR DETAILS ***"));

    static private final SubLList $list_alt14 = list(makeString("~%"));

    static private final SubLString $str_alt15$____PPH_REGRESSION_CASE_EXPECTED_ = makeString("*** PPH REGRESSION CASE EXPECTED TO FAIL ~A BUT PASSED ... details:~%");

    static private final SubLList $list_alt18 = list(makeSymbol("TEST-CASE"), makeSymbol("PURPOSE"), makeSymbol("EXCUSED"), makeSymbol("LANGUAGE-MT"), makeSymbol("DOMAIN-MT"));

    static private final SubLList $list_alt19 = list(makeKeyword("TEST-CASE"), makeKeyword("PURPOSE"), makeKeyword("EXCUSED"), makeKeyword("LANGUAGE-MT"), makeKeyword("DOMAIN-MT"));

    static private final SubLList $list_alt20 = list(makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("PPH-REGRESSION-ITEM-PURPOSE"), makeSymbol("PPH-REGRESSION-ITEM-EXCUSED"), makeSymbol("PPH-REGRESSION-ITEM-LANGUAGE-MT"), makeSymbol("PPH-REGRESSION-ITEM-DOMAIN-MT"));

    static private final SubLList $list_alt21 = list(makeSymbol("_CSETF-PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-PURPOSE"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-EXCUSED"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-LANGUAGE-MT"), makeSymbol("_CSETF-PPH-REGRESSION-ITEM-DOMAIN-MT"));

    public static final class $pph_regression_item_p$UnaryFunction extends UnaryFunction {
        public $pph_regression_item_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-REGRESSION-ITEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_regression_item_p(arg1);
        }
    }

    static private final SubLString $str_alt39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLSymbol $sym41$HLMT_ = makeSymbol("HLMT?");

    static private final SubLString $str_alt42$updating_status_of__S__w_r_t__tes = makeString("updating status of ~S~%w.r.t. test function ~S");

    static private final SubLString $str_alt43$____marked_as_failing_with_force_ = makeString("... marked as failing with force ~S");

    static private final SubLString $str_alt44$____failing_to_mark_as_failing_un = makeString("... failing to mark as failing under force ~S");

    static private final SubLString $str_alt45$____now_blessed_as_passing_with_f = makeString("... now blessed as passing with force ~S");

    static private final SubLString $str_alt46$At_least_1_argument_for_gather_pp = makeString("At least 1 argument for gather-pph-regression tests is required");

    static private final SubLString $str_alt49$skipping_this_case_as_language_mt = makeString("skipping this case as language-mt ~S fails regression:~%~S");

    static private final SubLString $str_alt50$skipping_this_case_as_domain_mt__ = makeString("skipping this case as domain-mt ~S fails regression:~%~S");

    static private final SubLSymbol $sym51$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");

    static private final SubLString $str_alt52$_S_would_fail_regression__skippin = makeString("~S would fail regression, skipping test case:~%~S");

    static private final SubLString $str_alt53$_____ALERT___KB_ISSUES___ALERT___ = makeString(" *** ALERT * KB ISSUES * ALERT ***");

    static private final SubLString $str_alt54$These_test_cases_were_skipped_due = makeString("These test-cases were skipped due to constants missing from the KB:~%");

    static private final SubLString $str_alt55$_S_in__S = makeString("~S in ~S");

    static private final SubLList $list_alt56 = list(list(makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TEST-FUNC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt57 = list(makeKeyword("TEST-FUNC"));

    static private final SubLList $list_alt63 = list(list(makeSymbol("*PPH-TMP-TEST-OBJECT*"), list(makeSymbol("PPH-REGRESSION-ITEM-TEST-CASE"), makeSymbol("*PPH-TMP-REGRESSION-ITEM*"))));

    static private final SubLList $list_alt64 = list(makeSymbol("TEST-FUNC"), makeSymbol("REG-SPECIFIC-FUNC"));

    static private final SubLList $list_alt68 = list(makeSymbol("FIF"), makeSymbol("*PPH-REGRESSION-FAILURE-EXPECTED?*"), list(QUOTE, makeSymbol("FAIL-IF")), list(QUOTE, makeSymbol("FAIL-UNLESS")));
}

/**
 * Total time: 194 ms synthetic
 */
