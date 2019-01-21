package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.deductions_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class argumentation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.argumentation";
    public static final String myFingerPrint = "4079e730969905ce6fb13b1941faeea665e8f394d408c9095c5b3cb6d0d62e70";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 4983L)
    public static SubLSymbol $tms_treat_monotonic_contradiction_as_unknownP$;
    private static final SubLSymbol $kw0$TRUE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$DEDUCTION_P;
    private static final SubLString $str3$Deduction__A_supporting__S_has_no;
    private static final SubLSymbol $kw4$UNKNOWN;
    private static final SubLString $str5$_s_attempted_to_change_its_truth_;
    private static final SubLSymbol $sym6$ASSERTION_P;
    private static final SubLSymbol $kw7$DEFAULT;
    private static final SubLSymbol $kw8$MONOTONIC;
    private static final SubLSymbol $sym9$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym10$ARGUMENT_P;
    private static final SubLSymbol $kw11$UNKNOWN_MON;
    private static final SubLSymbol $sym12$ARGUMENT_TV;
    private static final SubLSymbol $kw13$TRUE_MON;
    private static final SubLSymbol $kw14$FALSE_MON;
    private static final SubLSymbol $sym15$ASSERTED_ARGUMENT_P;
    private static final SubLSymbol $kw16$TRUE_DEF;
    private static final SubLSymbol $kw17$FALSE_DEF;
    private static final SubLString $str18$Use__unknown;
    private static final SubLString $str19$_S_results_in_a_contradiction_;
    private static final SubLSymbol $kw20$SUPPORTS;
    private static final SubLSymbol $kw21$TV;
    private static final SubLSymbol $sym22$TMS_DEDUCTION_SPEC_P;
    private static final SubLSymbol $sym23$TMS_DEDUCTION_SPEC_TV;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 681L)
    public static SubLObject compute_supports_tv(final SubLObject supports, SubLObject truth) {
        if (truth == argumentation.UNPROVIDED) {
            truth = (SubLObject)argumentation.$kw0$TRUE;
        }
        SubLObject first_support = (SubLObject)argumentation.NIL;
        SubLObject rest_supports = (SubLObject)argumentation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(supports, supports, (SubLObject)argumentation.$list1);
        first_support = supports.first();
        final SubLObject current = rest_supports = supports.rest();
        SubLObject strength = arguments.support_strength(first_support);
        SubLObject cdolist_list_var = rest_supports;
        SubLObject rest_support = (SubLObject)argumentation.NIL;
        rest_support = cdolist_list_var.first();
        while (argumentation.NIL != cdolist_list_var) {
            strength = strength_combine(strength, arguments.support_strength(rest_support));
            cdolist_list_var = cdolist_list_var.rest();
            rest_support = cdolist_list_var.first();
        }
        return enumeration_types.tv_from_truth_strength(truth, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 1058L)
    public static SubLObject compute_deduction_tv(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert argumentation.NIL != deduction_handles.deduction_p(deduction) : deduction;
        final SubLObject supports = deductions_high.deduction_supports(deduction);
        if (argumentation.NIL == supports) {
            Errors.warn((SubLObject)argumentation.$str3$Deduction__A_supporting__S_has_no, deduction_handles.deduction_id(deduction), deductions_high.deduction_supported_object(deduction));
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        final SubLObject old_tv = arguments.argument_tv(deduction);
        final SubLObject new_tv = compute_supports_tv(supports, arguments.argument_truth(deduction));
        if (!old_tv.eql(new_tv)) {
            if (argumentation.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !enumeration_types.tv_truth(old_tv).eql(enumeration_types.tv_truth(new_tv))) {
                Errors.error((SubLObject)argumentation.$str5$_s_attempted_to_change_its_truth_, enumeration_types.tv_truth(old_tv), enumeration_types.tv_truth(new_tv));
            }
            deductions_interface.kb_set_deduction_strength(deduction, enumeration_types.tv_strength(new_tv));
        }
        return new_tv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 1752L)
    public static SubLObject compute_assertion_tv(final SubLObject assertion) {
        assert argumentation.NIL != assertion_handles.assertion_p(assertion) : assertion;
        final SubLObject v_arguments = assertions_high.assertion_arguments(assertion);
        final SubLObject old_tv = assertions_high.cyc_assertion_tv(assertion);
        final SubLObject new_tv = perform_argumentation(v_arguments);
        if (!old_tv.eql(new_tv)) {
            assertions_interface.kb_set_assertion_truth(assertion, enumeration_types.tv_truth(new_tv));
            assertions_interface.kb_set_assertion_strength(assertion, enumeration_types.tv_strength(new_tv));
            sbhl_link_methods.possibly_update_sbhl_links_tv(assertion, old_tv);
        }
        return new_tv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 2348L)
    public static SubLObject strength_combine(final SubLObject strength1, final SubLObject strength2) {
        if (strength1 == argumentation.$kw4$UNKNOWN || strength2 == argumentation.$kw4$UNKNOWN) {
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        if (strength1 == argumentation.$kw7$DEFAULT || strength2 == argumentation.$kw7$DEFAULT) {
            return (SubLObject)argumentation.$kw7$DEFAULT;
        }
        return (SubLObject)argumentation.$kw8$MONOTONIC;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 2607L)
    public static SubLObject perform_argumentation(final SubLObject v_arguments) {
        assert argumentation.NIL != list_utilities.non_dotted_list_p(v_arguments) : v_arguments;
        SubLObject cdolist_list_var = v_arguments;
        SubLObject elem = (SubLObject)argumentation.NIL;
        elem = cdolist_list_var.first();
        while (argumentation.NIL != cdolist_list_var) {
            assert argumentation.NIL != arguments.argument_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (argumentation.NIL == v_arguments) {
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        if (Sequences.length(v_arguments).numE((SubLObject)argumentation.ONE_INTEGER)) {
            return arguments.argument_tv(v_arguments.first());
        }
        final SubLObject tv = arguments.argument_tv(v_arguments.first());
        SubLObject done = (SubLObject)argumentation.NIL;
        if (argumentation.NIL == done) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = v_arguments.rest(), argument = (SubLObject)argumentation.NIL, argument = csome_list_var.first(); argumentation.NIL == done && argumentation.NIL != csome_list_var; done = (SubLObject)SubLObjectFactory.makeBoolean(!tv.eql(arguments.argument_tv(argument))), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {}
        }
        if (argumentation.NIL == done) {
            return tv;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw11$UNKNOWN_MON, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return (SubLObject)argumentation.$kw11$UNKNOWN_MON;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw13$TRUE_MON, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV)) && argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw14$FALSE_MON, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return resolve_contradiction(v_arguments);
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw13$TRUE_MON, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return (SubLObject)argumentation.$kw13$TRUE_MON;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw14$FALSE_MON, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return (SubLObject)argumentation.$kw14$FALSE_MON;
        }
        final SubLObject asserted_argument = Sequences.find_if(Symbols.symbol_function((SubLObject)argumentation.$sym15$ASSERTED_ARGUMENT_P), v_arguments, (SubLObject)argumentation.UNPROVIDED, (SubLObject)argumentation.UNPROVIDED, (SubLObject)argumentation.UNPROVIDED);
        if (argumentation.NIL != asserted_argument) {
            return arguments.argument_tv(asserted_argument);
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw16$TRUE_DEF, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV)) && argumentation.NIL != conses_high.member((SubLObject)argumentation.$kw17$FALSE_DEF, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return complex_argumentation(v_arguments);
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw16$TRUE_DEF, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return (SubLObject)argumentation.$kw16$TRUE_DEF;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw17$FALSE_DEF, v_arguments, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym12$ARGUMENT_TV))) {
            return (SubLObject)argumentation.$kw17$FALSE_DEF;
        }
        return (SubLObject)argumentation.$kw4$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 4857L)
    public static SubLObject complex_argumentation(final SubLObject v_arguments) {
        return (SubLObject)argumentation.$kw4$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 5173L)
    public static SubLObject resolve_contradiction(final SubLObject v_arguments) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (argumentation.NIL == argumentation.$tms_treat_monotonic_contradiction_as_unknownP$.getDynamicValue(thread)) {
            Errors.cerror((SubLObject)argumentation.$str18$Use__unknown, (SubLObject)argumentation.$str19$_S_results_in_a_contradiction_, v_arguments);
        }
        return (SubLObject)argumentation.$kw4$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 5408L)
    public static SubLObject tms_deduction_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(argumentation.NIL != list_utilities.proper_list_p(v_object) && argumentation.NIL != list_utilities.lengthE(v_object, (SubLObject)argumentation.FOUR_INTEGER, (SubLObject)argumentation.UNPROVIDED) && argumentation.NIL != list_utilities.sublisp_boolean(conses_high.getf(v_object, (SubLObject)argumentation.$kw20$SUPPORTS, (SubLObject)argumentation.NIL)) && argumentation.NIL != list_utilities.sublisp_boolean(conses_high.getf(v_object, (SubLObject)argumentation.$kw21$TV, (SubLObject)argumentation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 5689L)
    public static SubLObject tms_deduction_spec_tv(final SubLObject tms_deduction_spec) {
        return conses_high.getf(tms_deduction_spec, (SubLObject)argumentation.$kw21$TV, (SubLObject)argumentation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/argumentation.lisp", position = 5792L)
    public static SubLObject perform_tms_deduction_spec_argumentation(final SubLObject tms_deduction_specs) {
        assert argumentation.NIL != list_utilities.non_dotted_list_p(tms_deduction_specs) : tms_deduction_specs;
        SubLObject cdolist_list_var = tms_deduction_specs;
        SubLObject elem = (SubLObject)argumentation.NIL;
        elem = cdolist_list_var.first();
        while (argumentation.NIL != cdolist_list_var) {
            assert argumentation.NIL != tms_deduction_spec_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (argumentation.NIL == tms_deduction_specs) {
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        if (Sequences.length(tms_deduction_specs).numE((SubLObject)argumentation.ONE_INTEGER)) {
            return tms_deduction_spec_tv(tms_deduction_specs.first());
        }
        final SubLObject tv = tms_deduction_spec_tv(tms_deduction_specs.first());
        SubLObject done = (SubLObject)argumentation.NIL;
        if (argumentation.NIL == done) {
            SubLObject csome_list_var;
            SubLObject argument;
            for (csome_list_var = tms_deduction_specs.rest(), argument = (SubLObject)argumentation.NIL, argument = csome_list_var.first(); argumentation.NIL == done && argumentation.NIL != csome_list_var; done = (SubLObject)SubLObjectFactory.makeBoolean(!tv.eql(tms_deduction_spec_tv(argument))), csome_list_var = csome_list_var.rest(), argument = csome_list_var.first()) {}
        }
        if (argumentation.NIL == done) {
            return tv;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw13$TRUE_MON, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV)) && argumentation.NIL != conses_high.member((SubLObject)argumentation.$kw14$FALSE_MON, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw13$TRUE_MON, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw13$TRUE_MON;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw14$FALSE_MON, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw14$FALSE_MON;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw16$TRUE_DEF, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV)) && argumentation.NIL != conses_high.member((SubLObject)argumentation.$kw17$FALSE_DEF, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw4$UNKNOWN;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw16$TRUE_DEF, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw16$TRUE_DEF;
        }
        if (argumentation.NIL != subl_promotions.memberP((SubLObject)argumentation.$kw17$FALSE_DEF, tms_deduction_specs, Symbols.symbol_function((SubLObject)argumentation.EQL), Symbols.symbol_function((SubLObject)argumentation.$sym23$TMS_DEDUCTION_SPEC_TV))) {
            return (SubLObject)argumentation.$kw17$FALSE_DEF;
        }
        return (SubLObject)argumentation.$kw4$UNKNOWN;
    }
    
    public static SubLObject declare_argumentation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "compute_supports_tv", "COMPUTE-SUPPORTS-TV", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "compute_deduction_tv", "COMPUTE-DEDUCTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "compute_assertion_tv", "COMPUTE-ASSERTION-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "strength_combine", "STRENGTH-COMBINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "perform_argumentation", "PERFORM-ARGUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "complex_argumentation", "COMPLEX-ARGUMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "resolve_contradiction", "RESOLVE-CONTRADICTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "tms_deduction_spec_p", "TMS-DEDUCTION-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "tms_deduction_spec_tv", "TMS-DEDUCTION-SPEC-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.argumentation", "perform_tms_deduction_spec_argumentation", "PERFORM-TMS-DEDUCTION-SPEC-ARGUMENTATION", 1, 0, false);
        return (SubLObject)argumentation.NIL;
    }
    
    public static SubLObject init_argumentation_file() {
        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$ = SubLFiles.defvar("*TMS-TREAT-MONOTONIC-CONTRADICTION-AS-UNKNOWN?*", (SubLObject)argumentation.NIL);
        return (SubLObject)argumentation.NIL;
    }
    
    public static SubLObject setup_argumentation_file() {
        return (SubLObject)argumentation.NIL;
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
        me = (SubLFile)new argumentation();
        argumentation.$tms_treat_monotonic_contradiction_as_unknownP$ = null;
        $kw0$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list1 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIRST-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("REST-SUPPORTS"));
        $sym2$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $str3$Deduction__A_supporting__S_has_no = SubLObjectFactory.makeString("Deduction ~A supporting ~S has no supports, reporting tv :unknown");
        $kw4$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str5$_s_attempted_to_change_its_truth_ = SubLObjectFactory.makeString("~s attempted to change its truth from ~s to ~s");
        $sym6$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $kw7$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw8$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $sym9$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym10$ARGUMENT_P = SubLObjectFactory.makeSymbol("ARGUMENT-P");
        $kw11$UNKNOWN_MON = SubLObjectFactory.makeKeyword("UNKNOWN-MON");
        $sym12$ARGUMENT_TV = SubLObjectFactory.makeSymbol("ARGUMENT-TV");
        $kw13$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw14$FALSE_MON = SubLObjectFactory.makeKeyword("FALSE-MON");
        $sym15$ASSERTED_ARGUMENT_P = SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-P");
        $kw16$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw17$FALSE_DEF = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $str18$Use__unknown = SubLObjectFactory.makeString("Use :unknown");
        $str19$_S_results_in_a_contradiction_ = SubLObjectFactory.makeString("~S results in a contradiction.");
        $kw20$SUPPORTS = SubLObjectFactory.makeKeyword("SUPPORTS");
        $kw21$TV = SubLObjectFactory.makeKeyword("TV");
        $sym22$TMS_DEDUCTION_SPEC_P = SubLObjectFactory.makeSymbol("TMS-DEDUCTION-SPEC-P");
        $sym23$TMS_DEDUCTION_SPEC_TV = SubLObjectFactory.makeSymbol("TMS-DEDUCTION-SPEC-TV");
    }
}

/*

	Total time: 61 ms
	
*/