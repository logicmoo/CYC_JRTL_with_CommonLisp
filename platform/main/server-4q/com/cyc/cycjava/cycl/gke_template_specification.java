package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class gke_template_specification extends SubLTranslatedFile {
    public static final SubLFile me = new gke_template_specification();

    public static final String myName = "com.cyc.cycjava.cycl.gke_template_specification";

    public static final String myFingerPrint = "f04bd2c2aad1fa33ef21cd7ff8c513d8093126499ffdc4ddaa84ddcc0d6047ac";



    // defconstant
    public static final SubLSymbol $dtp_gke_template_specification$ = makeSymbol("*DTP-GKE-TEMPLATE-SPECIFICATION*");

    // Internal Constants
    public static final SubLSymbol $gke_template_current_template$ = makeSymbol("*GKE-TEMPLATE-CURRENT-TEMPLATE*");

    public static final SubLSymbol GKE_TEMPLATE_SPECIFICATION = makeSymbol("GKE-TEMPLATE-SPECIFICATION");

    public static final SubLSymbol GKE_TEMPLATE_SPECIFICATION_P = makeSymbol("GKE-TEMPLATE-SPECIFICATION-P");

    public static final SubLList $list3 = list(new SubLObject[]{ makeSymbol("CONSTANT"), makeSymbol("FORMULA"), makeSymbol("ASSERT-MT"), makeSymbol("PARSING-MT"), makeSymbol("NATURAL-LANGUAGE-MT"), makeSymbol("MODE"), makeSymbol("REPLACEMENT-METHOD"), makeSymbol("ARG-REPLACEMENT-METHOD"), makeSymbol("FOCAL-TERM"), makeSymbol("ASSERTION-FORMAT"), makeSymbol("CANDIDATE-REPLACEMENT"), makeSymbol("CONSTRAINT-ON-REPLACEMENT"), makeSymbol("CONSTRAINT-ON-REPLACEMENT-BASIS"), makeSymbol("EXCLUDE-REPLACEMENT"), makeSymbol("EXCLUDE-REPLACEMENT-POSITION") });

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("CONSTANT"), makeKeyword("FORMULA"), makeKeyword("ASSERT-MT"), makeKeyword("PARSING-MT"), makeKeyword("NATURAL-LANGUAGE-MT"), makeKeyword("MODE"), makeKeyword("REPLACEMENT-METHOD"), makeKeyword("ARG-REPLACEMENT-METHOD"), makeKeyword("FOCAL-TERM"), makeKeyword("ASSERTION-FORMAT"), makeKeyword("CANDIDATE-REPLACEMENT"), makeKeyword("CONSTRAINT-ON-REPLACEMENT"), makeKeyword("CONSTRAINT-ON-REPLACEMENT-BASIS"), makeKeyword("EXCLUDE-REPLACEMENT"), makeKeyword("EXCLUDE-REPLACEMENT-POSITION") });

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("GTS-CONSTANT"), makeSymbol("GTS-FORMULA"), makeSymbol("GTS-ASSERT-MT"), makeSymbol("GTS-PARSING-MT"), makeSymbol("GTS-NATURAL-LANGUAGE-MT"), makeSymbol("GTS-MODE"), makeSymbol("GTS-REPLACEMENT-METHOD"), makeSymbol("GTS-ARG-REPLACEMENT-METHOD"), makeSymbol("GTS-FOCAL-TERM"), makeSymbol("GTS-ASSERTION-FORMAT"), makeSymbol("GTS-CANDIDATE-REPLACEMENT"), makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT"), makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT-BASIS"), makeSymbol("GTS-EXCLUDE-REPLACEMENT"), makeSymbol("GTS-EXCLUDE-REPLACEMENT-POSITION") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeSymbol("_CSETF-GTS-CONSTANT"), makeSymbol("_CSETF-GTS-FORMULA"), makeSymbol("_CSETF-GTS-ASSERT-MT"), makeSymbol("_CSETF-GTS-PARSING-MT"), makeSymbol("_CSETF-GTS-NATURAL-LANGUAGE-MT"), makeSymbol("_CSETF-GTS-MODE"), makeSymbol("_CSETF-GTS-REPLACEMENT-METHOD"), makeSymbol("_CSETF-GTS-ARG-REPLACEMENT-METHOD"), makeSymbol("_CSETF-GTS-FOCAL-TERM"), makeSymbol("_CSETF-GTS-ASSERTION-FORMAT"), makeSymbol("_CSETF-GTS-CANDIDATE-REPLACEMENT"), makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT"), makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS"), makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT"), makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION") });

    public static final SubLSymbol GKE_TEMPLATE_SPECIFICATION_PRINT = makeSymbol("GKE-TEMPLATE-SPECIFICATION-PRINT");

    public static final SubLSymbol GKE_TEMPLATE_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GKE-TEMPLATE-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GKE-TEMPLATE-SPECIFICATION-P"));

    private static final SubLSymbol GTS_CONSTANT = makeSymbol("GTS-CONSTANT");

    private static final SubLSymbol _CSETF_GTS_CONSTANT = makeSymbol("_CSETF-GTS-CONSTANT");

    private static final SubLSymbol GTS_FORMULA = makeSymbol("GTS-FORMULA");

    private static final SubLSymbol _CSETF_GTS_FORMULA = makeSymbol("_CSETF-GTS-FORMULA");

    private static final SubLSymbol GTS_ASSERT_MT = makeSymbol("GTS-ASSERT-MT");

    private static final SubLSymbol _CSETF_GTS_ASSERT_MT = makeSymbol("_CSETF-GTS-ASSERT-MT");

    private static final SubLSymbol GTS_PARSING_MT = makeSymbol("GTS-PARSING-MT");

    private static final SubLSymbol _CSETF_GTS_PARSING_MT = makeSymbol("_CSETF-GTS-PARSING-MT");

    private static final SubLSymbol GTS_NATURAL_LANGUAGE_MT = makeSymbol("GTS-NATURAL-LANGUAGE-MT");

    private static final SubLSymbol _CSETF_GTS_NATURAL_LANGUAGE_MT = makeSymbol("_CSETF-GTS-NATURAL-LANGUAGE-MT");

    private static final SubLSymbol GTS_MODE = makeSymbol("GTS-MODE");

    private static final SubLSymbol _CSETF_GTS_MODE = makeSymbol("_CSETF-GTS-MODE");

    private static final SubLSymbol GTS_REPLACEMENT_METHOD = makeSymbol("GTS-REPLACEMENT-METHOD");

    private static final SubLSymbol _CSETF_GTS_REPLACEMENT_METHOD = makeSymbol("_CSETF-GTS-REPLACEMENT-METHOD");

    private static final SubLSymbol GTS_ARG_REPLACEMENT_METHOD = makeSymbol("GTS-ARG-REPLACEMENT-METHOD");

    private static final SubLSymbol _CSETF_GTS_ARG_REPLACEMENT_METHOD = makeSymbol("_CSETF-GTS-ARG-REPLACEMENT-METHOD");

    private static final SubLSymbol GTS_FOCAL_TERM = makeSymbol("GTS-FOCAL-TERM");

    private static final SubLSymbol _CSETF_GTS_FOCAL_TERM = makeSymbol("_CSETF-GTS-FOCAL-TERM");

    private static final SubLSymbol GTS_ASSERTION_FORMAT = makeSymbol("GTS-ASSERTION-FORMAT");

    private static final SubLSymbol _CSETF_GTS_ASSERTION_FORMAT = makeSymbol("_CSETF-GTS-ASSERTION-FORMAT");

    private static final SubLSymbol GTS_CANDIDATE_REPLACEMENT = makeSymbol("GTS-CANDIDATE-REPLACEMENT");

    private static final SubLSymbol _CSETF_GTS_CANDIDATE_REPLACEMENT = makeSymbol("_CSETF-GTS-CANDIDATE-REPLACEMENT");

    private static final SubLSymbol GTS_CONSTRAINT_ON_REPLACEMENT = makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT");

    private static final SubLSymbol _CSETF_GTS_CONSTRAINT_ON_REPLACEMENT = makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT");

    private static final SubLSymbol GTS_CONSTRAINT_ON_REPLACEMENT_BASIS = makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT-BASIS");

    private static final SubLSymbol _CSETF_GTS_CONSTRAINT_ON_REPLACEMENT_BASIS = makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS");

    private static final SubLSymbol GTS_EXCLUDE_REPLACEMENT = makeSymbol("GTS-EXCLUDE-REPLACEMENT");

    private static final SubLSymbol _CSETF_GTS_EXCLUDE_REPLACEMENT = makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT");

    private static final SubLSymbol GTS_EXCLUDE_REPLACEMENT_POSITION = makeSymbol("GTS-EXCLUDE-REPLACEMENT-POSITION");

    private static final SubLSymbol _CSETF_GTS_EXCLUDE_REPLACEMENT_POSITION = makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION");









    private static final SubLSymbol $NATURAL_LANGUAGE_MT = makeKeyword("NATURAL-LANGUAGE-MT");





    private static final SubLSymbol $ARG_REPLACEMENT_METHOD = makeKeyword("ARG-REPLACEMENT-METHOD");







    private static final SubLSymbol $CONSTRAINT_ON_REPLACEMENT = makeKeyword("CONSTRAINT-ON-REPLACEMENT");

    private static final SubLSymbol $CONSTRAINT_ON_REPLACEMENT_BASIS = makeKeyword("CONSTRAINT-ON-REPLACEMENT-BASIS");



    private static final SubLSymbol $EXCLUDE_REPLACEMENT_POSITION = makeKeyword("EXCLUDE-REPLACEMENT-POSITION");

    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_GKE_TEMPLATE_SPECIFICATION = makeSymbol("MAKE-GKE-TEMPLATE-SPECIFICATION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GKE_TEMPLATE_SPECIFICATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GKE-TEMPLATE-SPECIFICATION-METHOD");

    private static final SubLString $str61$_A = makeString("~A");





    private static final SubLObject $$formulaForFormulaTemplate = reader_make_constant_shell(makeString("formulaForFormulaTemplate"));

    private static final SubLObject $$assertMtForFormulaTemplate = reader_make_constant_shell(makeString("assertMtForFormulaTemplate"));

    private static final SubLObject $$parsingMtForFormulaTemplate = reader_make_constant_shell(makeString("parsingMtForFormulaTemplate"));

    private static final SubLObject $const67$naturalLanguageMtForFormulaTempla = reader_make_constant_shell(makeString("naturalLanguageMtForFormulaTemplate"));

    private static final SubLObject $$setModeForFormulaTemplate = reader_make_constant_shell(makeString("setModeForFormulaTemplate"));

    private static final SubLObject $const69$setReplacementSelectionMethodForF = reader_make_constant_shell(makeString("setReplacementSelectionMethodForFormulaTemplate"));

    private static final SubLObject $const70$focalTermPositionForFormulaTempla = reader_make_constant_shell(makeString("focalTermPositionForFormulaTemplate"));

    private static final SubLObject $$assertionFormatForFormulaTemplate = reader_make_constant_shell(makeString("assertionFormatForFormulaTemplate"));

    private static final SubLObject $$candidateReplacementForPosition = reader_make_constant_shell(makeString("candidateReplacementForPosition"));

    private static final SubLObject $$constraintOnReplacement = reader_make_constant_shell(makeString("constraintOnReplacement"));

    private static final SubLObject $$constraintOnReplacementBasis = reader_make_constant_shell(makeString("constraintOnReplacementBasis"));

    private static final SubLObject $const75$excludeReplacementOptionForFormul = reader_make_constant_shell(makeString("excludeReplacementOptionForFormulaTemplate"));

    private static final SubLObject $const76$excludeReplacementOptionForFormul = reader_make_constant_shell(makeString("excludeReplacementOptionForFormulaTemplatePosition"));

    public static SubLObject gke_template_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        gke_template_specification_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject gke_template_specification_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$gke_template_specification_native.class ? T : NIL;
    }

    public static SubLObject gts_constant(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject gts_formula(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject gts_assert_mt(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject gts_parsing_mt(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject gts_natural_language_mt(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject gts_mode(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject gts_replacement_method(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject gts_arg_replacement_method(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject gts_focal_term(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject gts_assertion_format(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject gts_candidate_replacement(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject gts_constraint_on_replacement(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject gts_constraint_on_replacement_basis(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField14();
    }

    public static SubLObject gts_exclude_replacement(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField15();
    }

    public static SubLObject gts_exclude_replacement_position(final SubLObject v_object) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.getField16();
    }

    public static SubLObject _csetf_gts_constant(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_gts_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_gts_assert_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_gts_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_gts_natural_language_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_gts_mode(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_gts_replacement_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_gts_arg_replacement_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_gts_focal_term(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_gts_assertion_format(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_gts_candidate_replacement(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_gts_constraint_on_replacement(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_gts_constraint_on_replacement_basis(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_gts_exclude_replacement(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_gts_exclude_replacement_position(final SubLObject v_object, final SubLObject value) {
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static SubLObject make_gke_template_specification(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $gke_template_specification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CONSTANT)) {
                _csetf_gts_constant(v_new, current_value);
            } else
                if (pcase_var.eql($FORMULA)) {
                    _csetf_gts_formula(v_new, current_value);
                } else
                    if (pcase_var.eql($ASSERT_MT)) {
                        _csetf_gts_assert_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($PARSING_MT)) {
                            _csetf_gts_parsing_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($NATURAL_LANGUAGE_MT)) {
                                _csetf_gts_natural_language_mt(v_new, current_value);
                            } else
                                if (pcase_var.eql($MODE)) {
                                    _csetf_gts_mode(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REPLACEMENT_METHOD)) {
                                        _csetf_gts_replacement_method(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($ARG_REPLACEMENT_METHOD)) {
                                            _csetf_gts_arg_replacement_method(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FOCAL_TERM)) {
                                                _csetf_gts_focal_term(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ASSERTION_FORMAT)) {
                                                    _csetf_gts_assertion_format(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($CANDIDATE_REPLACEMENT)) {
                                                        _csetf_gts_candidate_replacement(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($CONSTRAINT_ON_REPLACEMENT)) {
                                                            _csetf_gts_constraint_on_replacement(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($CONSTRAINT_ON_REPLACEMENT_BASIS)) {
                                                                _csetf_gts_constraint_on_replacement_basis(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($EXCLUDE_REPLACEMENT)) {
                                                                    _csetf_gts_exclude_replacement(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($EXCLUDE_REPLACEMENT_POSITION)) {
                                                                        _csetf_gts_exclude_replacement_position(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_gke_template_specification(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GKE_TEMPLATE_SPECIFICATION, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CONSTANT, gts_constant(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, gts_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERT_MT, gts_assert_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $PARSING_MT, gts_parsing_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $NATURAL_LANGUAGE_MT, gts_natural_language_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $MODE, gts_mode(obj));
        funcall(visitor_fn, obj, $SLOT, $REPLACEMENT_METHOD, gts_replacement_method(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_REPLACEMENT_METHOD, gts_arg_replacement_method(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCAL_TERM, gts_focal_term(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION_FORMAT, gts_assertion_format(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_REPLACEMENT, gts_candidate_replacement(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT_ON_REPLACEMENT, gts_constraint_on_replacement(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT_ON_REPLACEMENT_BASIS, gts_constraint_on_replacement_basis(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCLUDE_REPLACEMENT, gts_exclude_replacement(obj));
        funcall(visitor_fn, obj, $SLOT, $EXCLUDE_REPLACEMENT_POSITION, gts_exclude_replacement_position(obj));
        funcall(visitor_fn, obj, $END, MAKE_GKE_TEMPLATE_SPECIFICATION, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_gke_template_specification_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gke_template_specification(obj, visitor_fn);
    }

    public static SubLObject gke_template_specification_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != gke_template_specification_p(v_object) : "gke_template_specification.gke_template_specification_p error :" + v_object;
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, $str61$_A, gts_constant(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, NIL, NIL);
        }
        return v_object;
    }

    public static SubLObject new_gke_template_specification(final SubLObject template_fort, final SubLObject mt) {
        assert NIL != cycl_grammar.cycl_denotational_term_p(template_fort) : "cycl_grammar.cycl_denotational_term_p(template_fort) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(template_fort) " + template_fort;
        assert NIL != fort_types_interface.microtheory_p(mt) : "fort_types_interface.microtheory_p(mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mt) " + mt;
        final SubLObject result = make_gke_template_specification(UNPROVIDED);
        _csetf_gts_constant(result, template_fort);
        _csetf_gts_formula(result, gke_template_get_value($$formulaForFormulaTemplate, template_fort, mt));
        _csetf_gts_assert_mt(result, gke_template_get_value($$assertMtForFormulaTemplate, template_fort, mt));
        _csetf_gts_parsing_mt(result, gke_template_get_value($$parsingMtForFormulaTemplate, template_fort, mt));
        _csetf_gts_natural_language_mt(result, gke_template_get_value($const67$naturalLanguageMtForFormulaTempla, template_fort, mt));
        _csetf_gts_mode(result, gke_template_get_value($$setModeForFormulaTemplate, template_fort, mt));
        _csetf_gts_replacement_method(result, gke_template_get_value($const69$setReplacementSelectionMethodForF, template_fort, mt));
        _csetf_gts_focal_term(result, gke_template_get_value($const70$focalTermPositionForFormulaTempla, template_fort, mt));
        _csetf_gts_assertion_format(result, gke_template_get_value($$assertionFormatForFormulaTemplate, template_fort, mt));
        _csetf_gts_candidate_replacement(result, gke_template_get_value($$candidateReplacementForPosition, template_fort, mt));
        _csetf_gts_constraint_on_replacement(result, gke_template_get_value($$constraintOnReplacement, template_fort, mt));
        _csetf_gts_constraint_on_replacement_basis(result, gke_template_get_value($$constraintOnReplacementBasis, template_fort, mt));
        _csetf_gts_exclude_replacement(result, gke_template_get_value($const75$excludeReplacementOptionForFormul, template_fort, mt));
        _csetf_gts_exclude_replacement_position(result, gke_template_get_value($const76$excludeReplacementOptionForFormul, template_fort, mt));
        return result;
    }

    public static SubLObject gke_serialize_specification(final SubLObject template_spec) {
        assert NIL != gke_template_specification_p(template_spec) : "gke_template_specification.gke_template_specification_p(template_spec) " + "CommonSymbols.NIL != gke_template_specification.gke_template_specification_p(template_spec) " + template_spec;
        return list(new SubLObject[]{ list($CONSTANT, gts_constant(template_spec)), list($FORMULA, gts_formula(template_spec)), list($ASSERT_MT, gts_assert_mt(template_spec)), list($PARSING_MT, gts_parsing_mt(template_spec)), list($NATURAL_LANGUAGE_MT, gts_natural_language_mt(template_spec)), list($MODE, gts_mode(template_spec)), list($REPLACEMENT_METHOD, gts_replacement_method(template_spec)), list($FOCAL_TERM, gts_focal_term(template_spec)), list($ASSERTION_FORMAT, gts_assertion_format(template_spec)), list($CANDIDATE_REPLACEMENT, gts_candidate_replacement(template_spec)), list($CONSTRAINT_ON_REPLACEMENT, gts_constraint_on_replacement(template_spec)), list($CONSTRAINT_ON_REPLACEMENT_BASIS, gts_constraint_on_replacement_basis(template_spec)), list($EXCLUDE_REPLACEMENT, gts_exclude_replacement(template_spec)), list($EXCLUDE_REPLACEMENT_POSITION, gts_exclude_replacement_position(template_spec)) });
    }

    public static SubLObject gke_template_get_value(final SubLObject predicate, final SubLObject template_fort, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(template_fort, predicate, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject declare_gke_template_specification_file() {
        declareFunction(me, "gke_template_specification_print_function_trampoline", "GKE-TEMPLATE-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "gke_template_specification_p", "GKE-TEMPLATE-SPECIFICATION-P", 1, 0, false);
        new gke_template_specification.$gke_template_specification_p$UnaryFunction();
        declareFunction(me, "gts_constant", "GTS-CONSTANT", 1, 0, false);
        declareFunction(me, "gts_formula", "GTS-FORMULA", 1, 0, false);
        declareFunction(me, "gts_assert_mt", "GTS-ASSERT-MT", 1, 0, false);
        declareFunction(me, "gts_parsing_mt", "GTS-PARSING-MT", 1, 0, false);
        declareFunction(me, "gts_natural_language_mt", "GTS-NATURAL-LANGUAGE-MT", 1, 0, false);
        declareFunction(me, "gts_mode", "GTS-MODE", 1, 0, false);
        declareFunction(me, "gts_replacement_method", "GTS-REPLACEMENT-METHOD", 1, 0, false);
        declareFunction(me, "gts_arg_replacement_method", "GTS-ARG-REPLACEMENT-METHOD", 1, 0, false);
        declareFunction(me, "gts_focal_term", "GTS-FOCAL-TERM", 1, 0, false);
        declareFunction(me, "gts_assertion_format", "GTS-ASSERTION-FORMAT", 1, 0, false);
        declareFunction(me, "gts_candidate_replacement", "GTS-CANDIDATE-REPLACEMENT", 1, 0, false);
        declareFunction(me, "gts_constraint_on_replacement", "GTS-CONSTRAINT-ON-REPLACEMENT", 1, 0, false);
        declareFunction(me, "gts_constraint_on_replacement_basis", "GTS-CONSTRAINT-ON-REPLACEMENT-BASIS", 1, 0, false);
        declareFunction(me, "gts_exclude_replacement", "GTS-EXCLUDE-REPLACEMENT", 1, 0, false);
        declareFunction(me, "gts_exclude_replacement_position", "GTS-EXCLUDE-REPLACEMENT-POSITION", 1, 0, false);
        declareFunction(me, "_csetf_gts_constant", "_CSETF-GTS-CONSTANT", 2, 0, false);
        declareFunction(me, "_csetf_gts_formula", "_CSETF-GTS-FORMULA", 2, 0, false);
        declareFunction(me, "_csetf_gts_assert_mt", "_CSETF-GTS-ASSERT-MT", 2, 0, false);
        declareFunction(me, "_csetf_gts_parsing_mt", "_CSETF-GTS-PARSING-MT", 2, 0, false);
        declareFunction(me, "_csetf_gts_natural_language_mt", "_CSETF-GTS-NATURAL-LANGUAGE-MT", 2, 0, false);
        declareFunction(me, "_csetf_gts_mode", "_CSETF-GTS-MODE", 2, 0, false);
        declareFunction(me, "_csetf_gts_replacement_method", "_CSETF-GTS-REPLACEMENT-METHOD", 2, 0, false);
        declareFunction(me, "_csetf_gts_arg_replacement_method", "_CSETF-GTS-ARG-REPLACEMENT-METHOD", 2, 0, false);
        declareFunction(me, "_csetf_gts_focal_term", "_CSETF-GTS-FOCAL-TERM", 2, 0, false);
        declareFunction(me, "_csetf_gts_assertion_format", "_CSETF-GTS-ASSERTION-FORMAT", 2, 0, false);
        declareFunction(me, "_csetf_gts_candidate_replacement", "_CSETF-GTS-CANDIDATE-REPLACEMENT", 2, 0, false);
        declareFunction(me, "_csetf_gts_constraint_on_replacement", "_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT", 2, 0, false);
        declareFunction(me, "_csetf_gts_constraint_on_replacement_basis", "_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS", 2, 0, false);
        declareFunction(me, "_csetf_gts_exclude_replacement", "_CSETF-GTS-EXCLUDE-REPLACEMENT", 2, 0, false);
        declareFunction(me, "_csetf_gts_exclude_replacement_position", "_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION", 2, 0, false);
        declareFunction(me, "make_gke_template_specification", "MAKE-GKE-TEMPLATE-SPECIFICATION", 0, 1, false);
        declareFunction(me, "visit_defstruct_gke_template_specification", "VISIT-DEFSTRUCT-GKE-TEMPLATE-SPECIFICATION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_gke_template_specification_method", "VISIT-DEFSTRUCT-OBJECT-GKE-TEMPLATE-SPECIFICATION-METHOD", 2, 0, false);
        declareFunction(me, "gke_template_specification_print", "GKE-TEMPLATE-SPECIFICATION-PRINT", 3, 0, false);
        declareFunction(me, "new_gke_template_specification", "NEW-GKE-TEMPLATE-SPECIFICATION", 2, 0, false);
        declareFunction(me, "gke_serialize_specification", "GKE-SERIALIZE-SPECIFICATION", 1, 0, false);
        declareFunction(me, "gke_template_get_value", "GKE-TEMPLATE-GET-VALUE", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_gke_template_specification_file() {
        deflexical("*GKE-TEMPLATE-CURRENT-TEMPLATE*", SubLSystemTrampolineFile.maybeDefault($gke_template_current_template$, $gke_template_current_template$, NIL));
        defconstant("*DTP-GKE-TEMPLATE-SPECIFICATION*", GKE_TEMPLATE_SPECIFICATION);
        return NIL;
    }

    public static SubLObject setup_gke_template_specification_file() {
        declare_defglobal($gke_template_current_template$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_gke_template_specification$.getGlobalValue(), symbol_function(GKE_TEMPLATE_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list9);
        def_csetf(GTS_CONSTANT, _CSETF_GTS_CONSTANT);
        def_csetf(GTS_FORMULA, _CSETF_GTS_FORMULA);
        def_csetf(GTS_ASSERT_MT, _CSETF_GTS_ASSERT_MT);
        def_csetf(GTS_PARSING_MT, _CSETF_GTS_PARSING_MT);
        def_csetf(GTS_NATURAL_LANGUAGE_MT, _CSETF_GTS_NATURAL_LANGUAGE_MT);
        def_csetf(GTS_MODE, _CSETF_GTS_MODE);
        def_csetf(GTS_REPLACEMENT_METHOD, _CSETF_GTS_REPLACEMENT_METHOD);
        def_csetf(GTS_ARG_REPLACEMENT_METHOD, _CSETF_GTS_ARG_REPLACEMENT_METHOD);
        def_csetf(GTS_FOCAL_TERM, _CSETF_GTS_FOCAL_TERM);
        def_csetf(GTS_ASSERTION_FORMAT, _CSETF_GTS_ASSERTION_FORMAT);
        def_csetf(GTS_CANDIDATE_REPLACEMENT, _CSETF_GTS_CANDIDATE_REPLACEMENT);
        def_csetf(GTS_CONSTRAINT_ON_REPLACEMENT, _CSETF_GTS_CONSTRAINT_ON_REPLACEMENT);
        def_csetf(GTS_CONSTRAINT_ON_REPLACEMENT_BASIS, _CSETF_GTS_CONSTRAINT_ON_REPLACEMENT_BASIS);
        def_csetf(GTS_EXCLUDE_REPLACEMENT, _CSETF_GTS_EXCLUDE_REPLACEMENT);
        def_csetf(GTS_EXCLUDE_REPLACEMENT_POSITION, _CSETF_GTS_EXCLUDE_REPLACEMENT_POSITION);
        identity(GKE_TEMPLATE_SPECIFICATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_gke_template_specification$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GKE_TEMPLATE_SPECIFICATION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_gke_template_specification_file();
    }

    @Override
    public void initializeVariables() {
        init_gke_template_specification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gke_template_specification_file();
    }

    

    public static final class $gke_template_specification_native extends SubLStructNative {
        public SubLObject $constant;

        public SubLObject $formula;

        public SubLObject $assert_mt;

        public SubLObject $parsing_mt;

        public SubLObject $natural_language_mt;

        public SubLObject $mode;

        public SubLObject $replacement_method;

        public SubLObject $arg_replacement_method;

        public SubLObject $focal_term;

        public SubLObject $assertion_format;

        public SubLObject $candidate_replacement;

        public SubLObject $constraint_on_replacement;

        public SubLObject $constraint_on_replacement_basis;

        public SubLObject $exclude_replacement;

        public SubLObject $exclude_replacement_position;

        private static final SubLStructDeclNative structDecl;

        private $gke_template_specification_native() {
            this.$constant = Lisp.NIL;
            this.$formula = Lisp.NIL;
            this.$assert_mt = Lisp.NIL;
            this.$parsing_mt = Lisp.NIL;
            this.$natural_language_mt = Lisp.NIL;
            this.$mode = Lisp.NIL;
            this.$replacement_method = Lisp.NIL;
            this.$arg_replacement_method = Lisp.NIL;
            this.$focal_term = Lisp.NIL;
            this.$assertion_format = Lisp.NIL;
            this.$candidate_replacement = Lisp.NIL;
            this.$constraint_on_replacement = Lisp.NIL;
            this.$constraint_on_replacement_basis = Lisp.NIL;
            this.$exclude_replacement = Lisp.NIL;
            this.$exclude_replacement_position = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$constant;
        }

        @Override
        public SubLObject getField3() {
            return this.$formula;
        }

        @Override
        public SubLObject getField4() {
            return this.$assert_mt;
        }

        @Override
        public SubLObject getField5() {
            return this.$parsing_mt;
        }

        @Override
        public SubLObject getField6() {
            return this.$natural_language_mt;
        }

        @Override
        public SubLObject getField7() {
            return this.$mode;
        }

        @Override
        public SubLObject getField8() {
            return this.$replacement_method;
        }

        @Override
        public SubLObject getField9() {
            return this.$arg_replacement_method;
        }

        @Override
        public SubLObject getField10() {
            return this.$focal_term;
        }

        @Override
        public SubLObject getField11() {
            return this.$assertion_format;
        }

        @Override
        public SubLObject getField12() {
            return this.$candidate_replacement;
        }

        @Override
        public SubLObject getField13() {
            return this.$constraint_on_replacement;
        }

        @Override
        public SubLObject getField14() {
            return this.$constraint_on_replacement_basis;
        }

        @Override
        public SubLObject getField15() {
            return this.$exclude_replacement;
        }

        @Override
        public SubLObject getField16() {
            return this.$exclude_replacement_position;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$constant = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$formula = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$assert_mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$parsing_mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$natural_language_mt = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$mode = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$replacement_method = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$arg_replacement_method = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$focal_term = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$assertion_format = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$candidate_replacement = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$constraint_on_replacement = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return this.$constraint_on_replacement_basis = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return this.$exclude_replacement = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return this.$exclude_replacement_position = value;
        }

        static {
            structDecl = makeStructDeclNative($gke_template_specification_native.class, GKE_TEMPLATE_SPECIFICATION, GKE_TEMPLATE_SPECIFICATION_P, $list3, $list4, new String[]{ "$constant", "$formula", "$assert_mt", "$parsing_mt", "$natural_language_mt", "$mode", "$replacement_method", "$arg_replacement_method", "$focal_term", "$assertion_format", "$candidate_replacement", "$constraint_on_replacement", "$constraint_on_replacement_basis", "$exclude_replacement", "$exclude_replacement_position" }, $list5, $list6, GKE_TEMPLATE_SPECIFICATION_PRINT);
        }
    }

    public static final class $gke_template_specification_p$UnaryFunction extends UnaryFunction {
        public $gke_template_specification_p$UnaryFunction() {
            super(extractFunctionNamed("GKE-TEMPLATE-SPECIFICATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gke_template_specification_p(arg1);
        }
    }
}

/**
 * Total time: 172 ms
 */
