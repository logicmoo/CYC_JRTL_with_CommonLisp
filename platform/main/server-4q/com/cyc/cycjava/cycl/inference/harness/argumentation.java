package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deductions_interface;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class argumentation extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.argumentation";
    public static String myFingerPrint = "4079e730969905ce6fb13b1941faeea665e8f394d408c9095c5b3cb6d0d62e70";
    @SubL(source = "cycl/inference/harness.lisp", position = 4900L)
    public static SubLSymbol $tms_treat_monotonic_contradiction_as_unknownP$;
    private static SubLSymbol $TRUE;
    private static SubLList $list1;
    private static SubLSymbol $sym2$DEDUCTION_P;
    private static SubLString $str3$Deduction__A_supporting__S_has_no;
    private static SubLSymbol $UNKNOWN;
    private static SubLString $str5$_s_attempted_to_change_its_truth_;
    private static SubLSymbol $sym6$ASSERTION_P;
    private static SubLSymbol $DEFAULT;
    private static SubLSymbol $MONOTONIC;
    private static SubLSymbol $sym9$NON_DOTTED_LIST_P;
    private static SubLSymbol $sym10$ARGUMENT_P;
    private static SubLSymbol $UNKNOWN_MON;
    private static SubLSymbol $sym12$ARGUMENT_TV;
    private static SubLSymbol $TRUE_MON;
    private static SubLSymbol $FALSE_MON;
    private static SubLSymbol $sym15$ASSERTED_ARGUMENT_P;
    private static SubLSymbol $TRUE_DEF;
    private static SubLSymbol $FALSE_DEF;
    private static SubLString $str18$Use__unknown;
    private static SubLString $str19$_S_results_in_a_contradiction_;
    private static SubLSymbol $SUPPORTS;
    private static SubLSymbol $TV;
    private static SubLSymbol $sym22$TMS_DEDUCTION_SPEC_P;
    private static SubLSymbol $sym23$TMS_DEDUCTION_SPEC_TV;

    @SubL(source = "cycl/inference/harness.lisp", position = 600L)
    public static SubLObject compute_supports_tv(SubLObject supports, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLObject first_support = NIL;
        SubLObject rest_supports = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(supports, supports, $list1);
        first_support = supports.first();
        SubLObject current = rest_supports = supports.rest();
        SubLObject strength = arguments.support_strength(first_support);
        SubLObject cdolist_list_var = rest_supports;
        SubLObject rest_support = NIL;
        rest_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strength = strength_combine(strength, arguments.support_strength(rest_support));
            cdolist_list_var = cdolist_list_var.rest();
            rest_support = cdolist_list_var.first();
        }
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 1000L)
    public static SubLObject compute_deduction_tv(SubLObject deduction) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != deduction_handles.deduction_p(deduction) : deduction;
        SubLObject supports = deductions_high.deduction_supports(deduction);
        if (NIL == supports) {
            Errors.warn($str3$Deduction__A_supporting__S_has_no, deduction_handles.deduction_id(deduction), deductions_high.deduction_supported_object(deduction));
            return $UNKNOWN;
        }
        SubLObject old_tv = arguments.argument_tv(deduction);
        SubLObject new_tv = compute_supports_tv(supports, arguments.argument_truth(deduction));
        if (!old_tv.eql(new_tv)) {
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !enumeration_types.tv_truth(old_tv).eql(enumeration_types.tv_truth(new_tv))) {
                Errors.error($str5$_s_attempted_to_change_its_truth_, enumeration_types.tv_truth(old_tv), enumeration_types.tv_truth(new_tv));
            }
            deductions_interface.kb_set_deduction_strength(deduction, enumeration_types.tv_strength(new_tv));
        }
        return new_tv;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 1700L)
    public static SubLObject compute_assertion_tv(SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : assertion;
        SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        SubLObject old_tv = assertions_high.cyc_assertion_tv(assertion);
        SubLObject new_tv = perform_argumentation(v_arguments);
        if (!old_tv.eql(new_tv)) {
            assertions_interface.kb_set_assertion_truth(assertion, enumeration_types.tv_truth(new_tv));
            assertions_interface.kb_set_assertion_strength(assertion, enumeration_types.tv_strength(new_tv));
            sbhl_link_methods.possibly_update_sbhl_links_tv(assertion, old_tv);
        }
        return new_tv;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 2300L)
    public static SubLObject strength_combine(SubLObject strength1, SubLObject strength2) {
        if (strength1 == $UNKNOWN || strength2 == $UNKNOWN) {
            return $UNKNOWN;
        }
        if (strength1 == $DEFAULT || strength2 == $DEFAULT) {
            return $DEFAULT;
        }
        return $MONOTONIC;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 2600L)
    public static SubLObject perform_argumentation(SubLObject v_arguments) {
        assert NIL != list_utilities.non_dotted_list_p(v_arguments) : v_arguments;
        SubLObject cdolist_list_var = v_arguments;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != arguments.argument_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (NIL == v_arguments) {
            return $UNKNOWN;
        }
        if (Sequences.length(v_arguments).numE(ONE_INTEGER)) {
            return arguments.argument_tv(v_arguments.first());
        }
        SubLObject tv = arguments.argument_tv(v_arguments.first());
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = v_arguments.rest(), argument = NIL, argument = csome_list_var.first(); NIL == done && NIL != csome_list_var; done = makeBoolean(!tv.eql(arguments.argument_tv(argument))), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {
            }
        }
        if (NIL == done) {
            return tv;
        }
        if (NIL != subl_promotions.memberP($UNKNOWN_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return $UNKNOWN_MON;
        }
        if (NIL != subl_promotions.memberP($TRUE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV)) && NIL != subl_promotions.memberP($FALSE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return resolve_contradiction(v_arguments);
        }
        if (NIL != subl_promotions.memberP($TRUE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return $TRUE_MON;
        }
        if (NIL != subl_promotions.memberP($FALSE_MON, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return $FALSE_MON;
        }
        SubLObject asserted_argument = Sequences.find_if(Symbols.symbol_function($sym15$ASSERTED_ARGUMENT_P), v_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != asserted_argument) {
            return arguments.argument_tv(asserted_argument);
        }
        if (NIL != subl_promotions.memberP($TRUE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV)) && NIL != conses_high.member($FALSE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return complex_argumentation(v_arguments);
        }
        if (NIL != subl_promotions.memberP($TRUE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return $TRUE_DEF;
        }
        if (NIL != subl_promotions.memberP($FALSE_DEF, v_arguments, Symbols.symbol_function(EQL), Symbols.symbol_function($sym12$ARGUMENT_TV))) {
            return $FALSE_DEF;
        }
        return $UNKNOWN;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 4800L)
    public static SubLObject complex_argumentation(SubLObject v_arguments) {
        return $UNKNOWN;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5100L)
    public static SubLObject resolve_contradiction(SubLObject v_arguments) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $tms_treat_monotonic_contradiction_as_unknownP$.getDynamicValue(thread)) {
            Errors.cerror($str18$Use__unknown, $str19$_S_results_in_a_contradiction_, v_arguments);
        }
        return $UNKNOWN;
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5400L)
    public static SubLObject tms_deduction_spec_p(SubLObject v_object) {
        return makeBoolean(NIL != list_utilities.proper_list_p(v_object) && NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED) && NIL != list_utilities.sublisp_boolean(conses_high.getf(v_object, $SUPPORTS, NIL))
                && NIL != list_utilities.sublisp_boolean(conses_high.getf(v_object, $TV, NIL)));
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5600L)
    public static SubLObject tms_deduction_spec_tv(SubLObject tms_deduction_spec) {
        return conses_high.getf(tms_deduction_spec, $TV, NIL);
    }

    @SubL(source = "cycl/inference/harness.lisp", position = 5700L)
    public static SubLObject perform_tms_deduction_spec_argumentation(SubLObject tms_deduction_specs) {
        assert NIL != list_utilities.non_dotted_list_p(tms_deduction_specs) : tms_deduction_specs;
        SubLObject cdolist_list_var = tms_deduction_specs;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != tms_deduction_spec_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (NIL == tms_deduction_specs) {
            return $UNKNOWN;
        }
        if (Sequences.length(tms_deduction_specs).numE(ONE_INTEGER)) {
            return tms_deduction_spec_tv(tms_deduction_specs.first());
        }
        SubLObject tv = tms_deduction_spec_tv(tms_deduction_specs.first());
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = tms_deduction_specs.rest(), argument = NIL, argument = csome_list_var.first(); NIL == done && NIL != csome_list_var; done = makeBoolean(!tv.eql(tms_deduction_spec_tv(argument))), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {
            }
        }
        if (NIL == done) {
            return tv;
        }
        if (NIL != subl_promotions.memberP($TRUE_MON, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))
                && NIL != conses_high.member($FALSE_MON, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $UNKNOWN;
        }
        if (NIL != subl_promotions.memberP($TRUE_MON, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $TRUE_MON;
        }
        if (NIL != subl_promotions.memberP($FALSE_MON, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $FALSE_MON;
        }
        if (NIL != subl_promotions.memberP($TRUE_DEF, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))
                && NIL != conses_high.member($FALSE_DEF, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $UNKNOWN;
        }
        if (NIL != subl_promotions.memberP($TRUE_DEF, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $TRUE_DEF;
        }
        if (NIL != subl_promotions.memberP($FALSE_DEF, tms_deduction_specs, Symbols.symbol_function(EQL), Symbols.symbol_function($sym23$TMS_DEDUCTION_SPEC_TV))) {
            return $FALSE_DEF;
        }
        return $UNKNOWN;
    }

    public static SubLObject declare_argumentation_file() {
        declareFunction(myName, "compute_supports_tv", "COMPUTE-SUPPORTS-TV", 1, 1, false);
        declareFunction(myName, "compute_deduction_tv", "COMPUTE-DEDUCTION-TV", 1, 0, false);
        declareFunction(myName, "compute_assertion_tv", "COMPUTE-ASSERTION-TV", 1, 0, false);
        declareFunction(myName, "strength_combine", "STRENGTH-COMBINE", 2, 0, false);
        declareFunction(myName, "perform_argumentation", "PERFORM-ARGUMENTATION", 1, 0, false);
        declareFunction(myName, "complex_argumentation", "COMPLEX-ARGUMENTATION", 1, 0, false);
        declareFunction(myName, "resolve_contradiction", "RESOLVE-CONTRADICTION", 1, 0, false);
        declareFunction(myName, "tms_deduction_spec_p", "TMS-DEDUCTION-SPEC-P", 1, 0, false);
        declareFunction(myName, "tms_deduction_spec_tv", "TMS-DEDUCTION-SPEC-TV", 1, 0, false);
        declareFunction(myName, "perform_tms_deduction_spec_argumentation", "PERFORM-TMS-DEDUCTION-SPEC-ARGUMENTATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_argumentation_file() {
        $tms_treat_monotonic_contradiction_as_unknownP$ = SubLFiles.defvar("*TMS-TREAT-MONOTONIC-CONTRADICTION-AS-UNKNOWN?*", NIL);
        return NIL;
    }

    public static SubLObject setup_argumentation_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_argumentation_file();
    }

    @Override
    public void initializeVariables() {
        init_argumentation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_argumentation_file();
    }

    static {
        me = new argumentation();
        $tms_treat_monotonic_contradiction_as_unknownP$ = null;
        $TRUE = makeKeyword("TRUE");
        $list1 = cons(makeSymbol("FIRST-SUPPORT"), makeSymbol("REST-SUPPORTS"));
        $sym2$DEDUCTION_P = makeSymbol("DEDUCTION-P");
        $str3$Deduction__A_supporting__S_has_no = makeString("Deduction ~A supporting ~S has no supports, reporting tv :unknown");
        $UNKNOWN = makeKeyword("UNKNOWN");
        $str5$_s_attempted_to_change_its_truth_ = makeString("~s attempted to change its truth from ~s to ~s");
        $sym6$ASSERTION_P = makeSymbol("ASSERTION-P");
        $DEFAULT = makeKeyword("DEFAULT");
        $MONOTONIC = makeKeyword("MONOTONIC");
        $sym9$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
        $sym10$ARGUMENT_P = makeSymbol("ARGUMENT-P");
        $UNKNOWN_MON = makeKeyword("UNKNOWN-MON");
        $sym12$ARGUMENT_TV = makeSymbol("ARGUMENT-TV");
        $TRUE_MON = makeKeyword("TRUE-MON");
        $FALSE_MON = makeKeyword("FALSE-MON");
        $sym15$ASSERTED_ARGUMENT_P = makeSymbol("ASSERTED-ARGUMENT-P");
        $TRUE_DEF = makeKeyword("TRUE-DEF");
        $FALSE_DEF = makeKeyword("FALSE-DEF");
        $str18$Use__unknown = makeString("Use :unknown");
        $str19$_S_results_in_a_contradiction_ = makeString("~S results in a contradiction.");
        $SUPPORTS = makeKeyword("SUPPORTS");
        $TV = makeKeyword("TV");
        $sym22$TMS_DEDUCTION_SPEC_P = makeSymbol("TMS-DEDUCTION-SPEC-P");
        $sym23$TMS_DEDUCTION_SPEC_TV = makeSymbol("TMS-DEDUCTION-SPEC-TV");
    }
}
/*
 *
 * Total time: 61 ms
 *
 */