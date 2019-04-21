package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gke_template_specification extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gke_template_specification";
    public static final String myFingerPrint = "f04bd2c2aad1fa33ef21cd7ff8c513d8093126499ffdc4ddaa84ddcc0d6047ac";
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 891L)
    public static SubLSymbol $gke_template_current_template$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLSymbol $dtp_gke_template_specification$;
    private static final SubLSymbol $sym0$_GKE_TEMPLATE_CURRENT_TEMPLATE_;
    private static final SubLSymbol $sym1$GKE_TEMPLATE_SPECIFICATION;
    private static final SubLSymbol $sym2$GKE_TEMPLATE_SPECIFICATION_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$GKE_TEMPLATE_SPECIFICATION_PRINT;
    private static final SubLSymbol $sym8$GKE_TEMPLATE_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GTS_CONSTANT;
    private static final SubLSymbol $sym11$_CSETF_GTS_CONSTANT;
    private static final SubLSymbol $sym12$GTS_FORMULA;
    private static final SubLSymbol $sym13$_CSETF_GTS_FORMULA;
    private static final SubLSymbol $sym14$GTS_ASSERT_MT;
    private static final SubLSymbol $sym15$_CSETF_GTS_ASSERT_MT;
    private static final SubLSymbol $sym16$GTS_PARSING_MT;
    private static final SubLSymbol $sym17$_CSETF_GTS_PARSING_MT;
    private static final SubLSymbol $sym18$GTS_NATURAL_LANGUAGE_MT;
    private static final SubLSymbol $sym19$_CSETF_GTS_NATURAL_LANGUAGE_MT;
    private static final SubLSymbol $sym20$GTS_MODE;
    private static final SubLSymbol $sym21$_CSETF_GTS_MODE;
    private static final SubLSymbol $sym22$GTS_REPLACEMENT_METHOD;
    private static final SubLSymbol $sym23$_CSETF_GTS_REPLACEMENT_METHOD;
    private static final SubLSymbol $sym24$GTS_ARG_REPLACEMENT_METHOD;
    private static final SubLSymbol $sym25$_CSETF_GTS_ARG_REPLACEMENT_METHOD;
    private static final SubLSymbol $sym26$GTS_FOCAL_TERM;
    private static final SubLSymbol $sym27$_CSETF_GTS_FOCAL_TERM;
    private static final SubLSymbol $sym28$GTS_ASSERTION_FORMAT;
    private static final SubLSymbol $sym29$_CSETF_GTS_ASSERTION_FORMAT;
    private static final SubLSymbol $sym30$GTS_CANDIDATE_REPLACEMENT;
    private static final SubLSymbol $sym31$_CSETF_GTS_CANDIDATE_REPLACEMENT;
    private static final SubLSymbol $sym32$GTS_CONSTRAINT_ON_REPLACEMENT;
    private static final SubLSymbol $sym33$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT;
    private static final SubLSymbol $sym34$GTS_CONSTRAINT_ON_REPLACEMENT_BASIS;
    private static final SubLSymbol $sym35$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT_BASIS;
    private static final SubLSymbol $sym36$GTS_EXCLUDE_REPLACEMENT;
    private static final SubLSymbol $sym37$_CSETF_GTS_EXCLUDE_REPLACEMENT;
    private static final SubLSymbol $sym38$GTS_EXCLUDE_REPLACEMENT_POSITION;
    private static final SubLSymbol $sym39$_CSETF_GTS_EXCLUDE_REPLACEMENT_POSITION;
    private static final SubLSymbol $kw40$CONSTANT;
    private static final SubLSymbol $kw41$FORMULA;
    private static final SubLSymbol $kw42$ASSERT_MT;
    private static final SubLSymbol $kw43$PARSING_MT;
    private static final SubLSymbol $kw44$NATURAL_LANGUAGE_MT;
    private static final SubLSymbol $kw45$MODE;
    private static final SubLSymbol $kw46$REPLACEMENT_METHOD;
    private static final SubLSymbol $kw47$ARG_REPLACEMENT_METHOD;
    private static final SubLSymbol $kw48$FOCAL_TERM;
    private static final SubLSymbol $kw49$ASSERTION_FORMAT;
    private static final SubLSymbol $kw50$CANDIDATE_REPLACEMENT;
    private static final SubLSymbol $kw51$CONSTRAINT_ON_REPLACEMENT;
    private static final SubLSymbol $kw52$CONSTRAINT_ON_REPLACEMENT_BASIS;
    private static final SubLSymbol $kw53$EXCLUDE_REPLACEMENT;
    private static final SubLSymbol $kw54$EXCLUDE_REPLACEMENT_POSITION;
    private static final SubLString $str55$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw56$BEGIN;
    private static final SubLSymbol $sym57$MAKE_GKE_TEMPLATE_SPECIFICATION;
    private static final SubLSymbol $kw58$SLOT;
    private static final SubLSymbol $kw59$END;
    private static final SubLSymbol $sym60$VISIT_DEFSTRUCT_OBJECT_GKE_TEMPLATE_SPECIFICATION_METHOD;
    private static final SubLString $str61$_A;
    private static final SubLSymbol $sym62$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLSymbol $sym63$MICROTHEORY_P;
    private static final SubLObject $const64$formulaForFormulaTemplate;
    private static final SubLObject $const65$assertMtForFormulaTemplate;
    private static final SubLObject $const66$parsingMtForFormulaTemplate;
    private static final SubLObject $const67$naturalLanguageMtForFormulaTempla;
    private static final SubLObject $const68$setModeForFormulaTemplate;
    private static final SubLObject $const69$setReplacementSelectionMethodForF;
    private static final SubLObject $const70$focalTermPositionForFormulaTempla;
    private static final SubLObject $const71$assertionFormatForFormulaTemplate;
    private static final SubLObject $const72$candidateReplacementForPosition;
    private static final SubLObject $const73$constraintOnReplacement;
    private static final SubLObject $const74$constraintOnReplacementBasis;
    private static final SubLObject $const75$excludeReplacementOptionForFormul;
    private static final SubLObject $const76$excludeReplacementOptionForFormul;
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gke_template_specification_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        gke_template_specification_print(v_object, stream, (SubLObject)gke_template_specification.ZERO_INTEGER);
        return (SubLObject)gke_template_specification.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gke_template_specification_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $gke_template_specification_native.class) ? gke_template_specification.T : gke_template_specification.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_constant(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_formula(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_assert_mt(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_parsing_mt(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_natural_language_mt(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_mode(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_replacement_method(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_arg_replacement_method(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_focal_term(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_assertion_format(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_candidate_replacement(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_constraint_on_replacement(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_constraint_on_replacement_basis(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_exclude_replacement(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject gts_exclude_replacement_position(final SubLObject v_object) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_constant(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_formula(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_assert_mt(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_parsing_mt(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_natural_language_mt(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_mode(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_replacement_method(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_arg_replacement_method(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_focal_term(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_assertion_format(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_candidate_replacement(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_constraint_on_replacement(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_constraint_on_replacement_basis(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_exclude_replacement(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject _csetf_gts_exclude_replacement_position(final SubLObject v_object, final SubLObject value) {
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject make_gke_template_specification(SubLObject arglist) {
        if (arglist == gke_template_specification.UNPROVIDED) {
            arglist = (SubLObject)gke_template_specification.NIL;
        }
        final SubLObject v_new = (SubLObject)new $gke_template_specification_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)gke_template_specification.NIL, next = arglist; gke_template_specification.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)gke_template_specification.$kw40$CONSTANT)) {
                _csetf_gts_constant(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw41$FORMULA)) {
                _csetf_gts_formula(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw42$ASSERT_MT)) {
                _csetf_gts_assert_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw43$PARSING_MT)) {
                _csetf_gts_parsing_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw44$NATURAL_LANGUAGE_MT)) {
                _csetf_gts_natural_language_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw45$MODE)) {
                _csetf_gts_mode(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw46$REPLACEMENT_METHOD)) {
                _csetf_gts_replacement_method(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw47$ARG_REPLACEMENT_METHOD)) {
                _csetf_gts_arg_replacement_method(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw48$FOCAL_TERM)) {
                _csetf_gts_focal_term(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw49$ASSERTION_FORMAT)) {
                _csetf_gts_assertion_format(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw50$CANDIDATE_REPLACEMENT)) {
                _csetf_gts_candidate_replacement(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw51$CONSTRAINT_ON_REPLACEMENT)) {
                _csetf_gts_constraint_on_replacement(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw52$CONSTRAINT_ON_REPLACEMENT_BASIS)) {
                _csetf_gts_constraint_on_replacement_basis(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw53$EXCLUDE_REPLACEMENT)) {
                _csetf_gts_exclude_replacement(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_template_specification.$kw54$EXCLUDE_REPLACEMENT_POSITION)) {
                _csetf_gts_exclude_replacement_position(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)gke_template_specification.$str55$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject visit_defstruct_gke_template_specification(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw56$BEGIN, (SubLObject)gke_template_specification.$sym57$MAKE_GKE_TEMPLATE_SPECIFICATION, (SubLObject)gke_template_specification.FIFTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw40$CONSTANT, gts_constant(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw41$FORMULA, gts_formula(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw42$ASSERT_MT, gts_assert_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw43$PARSING_MT, gts_parsing_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw44$NATURAL_LANGUAGE_MT, gts_natural_language_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw45$MODE, gts_mode(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw46$REPLACEMENT_METHOD, gts_replacement_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw47$ARG_REPLACEMENT_METHOD, gts_arg_replacement_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw48$FOCAL_TERM, gts_focal_term(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw49$ASSERTION_FORMAT, gts_assertion_format(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw50$CANDIDATE_REPLACEMENT, gts_candidate_replacement(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw51$CONSTRAINT_ON_REPLACEMENT, gts_constraint_on_replacement(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw52$CONSTRAINT_ON_REPLACEMENT_BASIS, gts_constraint_on_replacement_basis(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw53$EXCLUDE_REPLACEMENT, gts_exclude_replacement(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw58$SLOT, (SubLObject)gke_template_specification.$kw54$EXCLUDE_REPLACEMENT_POSITION, gts_exclude_replacement_position(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_template_specification.$kw59$END, (SubLObject)gke_template_specification.$sym57$MAKE_GKE_TEMPLATE_SPECIFICATION, (SubLObject)gke_template_specification.FIFTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 1917L)
    public static SubLObject visit_defstruct_object_gke_template_specification_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_gke_template_specification(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 4431L)
    public static SubLObject gke_template_specification_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gke_template_specification.NIL != gke_template_specification_p(v_object) : v_object;
        if (gke_template_specification.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)gke_template_specification.T, (SubLObject)gke_template_specification.T);
            PrintLow.format(stream, (SubLObject)gke_template_specification.$str61$_A, gts_constant(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)gke_template_specification.NIL, (SubLObject)gke_template_specification.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 4685L)
    public static SubLObject new_gke_template_specification(final SubLObject template_fort, final SubLObject mt) {
        assert gke_template_specification.NIL != cycl_grammar.cycl_denotational_term_p(template_fort) : template_fort;
        assert gke_template_specification.NIL != fort_types_interface.microtheory_p(mt) : mt;
        final SubLObject result = make_gke_template_specification((SubLObject)gke_template_specification.UNPROVIDED);
        _csetf_gts_constant(result, template_fort);
        _csetf_gts_formula(result, gke_template_get_value(gke_template_specification.$const64$formulaForFormulaTemplate, template_fort, mt));
        _csetf_gts_assert_mt(result, gke_template_get_value(gke_template_specification.$const65$assertMtForFormulaTemplate, template_fort, mt));
        _csetf_gts_parsing_mt(result, gke_template_get_value(gke_template_specification.$const66$parsingMtForFormulaTemplate, template_fort, mt));
        _csetf_gts_natural_language_mt(result, gke_template_get_value(gke_template_specification.$const67$naturalLanguageMtForFormulaTempla, template_fort, mt));
        _csetf_gts_mode(result, gke_template_get_value(gke_template_specification.$const68$setModeForFormulaTemplate, template_fort, mt));
        _csetf_gts_replacement_method(result, gke_template_get_value(gke_template_specification.$const69$setReplacementSelectionMethodForF, template_fort, mt));
        _csetf_gts_focal_term(result, gke_template_get_value(gke_template_specification.$const70$focalTermPositionForFormulaTempla, template_fort, mt));
        _csetf_gts_assertion_format(result, gke_template_get_value(gke_template_specification.$const71$assertionFormatForFormulaTemplate, template_fort, mt));
        _csetf_gts_candidate_replacement(result, gke_template_get_value(gke_template_specification.$const72$candidateReplacementForPosition, template_fort, mt));
        _csetf_gts_constraint_on_replacement(result, gke_template_get_value(gke_template_specification.$const73$constraintOnReplacement, template_fort, mt));
        _csetf_gts_constraint_on_replacement_basis(result, gke_template_get_value(gke_template_specification.$const74$constraintOnReplacementBasis, template_fort, mt));
        _csetf_gts_exclude_replacement(result, gke_template_get_value(gke_template_specification.$const75$excludeReplacementOptionForFormul, template_fort, mt));
        _csetf_gts_exclude_replacement_position(result, gke_template_get_value(gke_template_specification.$const76$excludeReplacementOptionForFormul, template_fort, mt));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 6753L)
    public static SubLObject gke_serialize_specification(final SubLObject template_spec) {
        assert gke_template_specification.NIL != gke_template_specification_p(template_spec) : template_spec;
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)gke_template_specification.$kw40$CONSTANT, gts_constant(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw41$FORMULA, gts_formula(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw42$ASSERT_MT, gts_assert_mt(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw43$PARSING_MT, gts_parsing_mt(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw44$NATURAL_LANGUAGE_MT, gts_natural_language_mt(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw45$MODE, gts_mode(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw46$REPLACEMENT_METHOD, gts_replacement_method(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw48$FOCAL_TERM, gts_focal_term(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw49$ASSERTION_FORMAT, gts_assertion_format(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw50$CANDIDATE_REPLACEMENT, gts_candidate_replacement(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw51$CONSTRAINT_ON_REPLACEMENT, gts_constraint_on_replacement(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw52$CONSTRAINT_ON_REPLACEMENT_BASIS, gts_constraint_on_replacement_basis(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw53$EXCLUDE_REPLACEMENT, gts_exclude_replacement(template_spec)), ConsesLow.list((SubLObject)gke_template_specification.$kw54$EXCLUDE_REPLACEMENT_POSITION, gts_exclude_replacement_position(template_spec)) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-template-specification.lisp", position = 7723L)
    public static SubLObject gke_template_get_value(final SubLObject predicate, final SubLObject template_fort, final SubLObject mt) {
        return kb_mapping_utilities.fpred_value_in_mt(template_fort, predicate, mt, (SubLObject)gke_template_specification.UNPROVIDED, (SubLObject)gke_template_specification.UNPROVIDED, (SubLObject)gke_template_specification.UNPROVIDED);
    }
    
    public static SubLObject declare_gke_template_specification_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gke_template_specification_print_function_trampoline", "GKE-TEMPLATE-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gke_template_specification_p", "GKE-TEMPLATE-SPECIFICATION-P", 1, 0, false);
        new $gke_template_specification_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_constant", "GTS-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_formula", "GTS-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_assert_mt", "GTS-ASSERT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_parsing_mt", "GTS-PARSING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_natural_language_mt", "GTS-NATURAL-LANGUAGE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_mode", "GTS-MODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_replacement_method", "GTS-REPLACEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_arg_replacement_method", "GTS-ARG-REPLACEMENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_focal_term", "GTS-FOCAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_assertion_format", "GTS-ASSERTION-FORMAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_candidate_replacement", "GTS-CANDIDATE-REPLACEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_constraint_on_replacement", "GTS-CONSTRAINT-ON-REPLACEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_constraint_on_replacement_basis", "GTS-CONSTRAINT-ON-REPLACEMENT-BASIS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_exclude_replacement", "GTS-EXCLUDE-REPLACEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gts_exclude_replacement_position", "GTS-EXCLUDE-REPLACEMENT-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_constant", "_CSETF-GTS-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_formula", "_CSETF-GTS-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_assert_mt", "_CSETF-GTS-ASSERT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_parsing_mt", "_CSETF-GTS-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_natural_language_mt", "_CSETF-GTS-NATURAL-LANGUAGE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_mode", "_CSETF-GTS-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_replacement_method", "_CSETF-GTS-REPLACEMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_arg_replacement_method", "_CSETF-GTS-ARG-REPLACEMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_focal_term", "_CSETF-GTS-FOCAL-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_assertion_format", "_CSETF-GTS-ASSERTION-FORMAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_candidate_replacement", "_CSETF-GTS-CANDIDATE-REPLACEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_constraint_on_replacement", "_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_constraint_on_replacement_basis", "_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_exclude_replacement", "_CSETF-GTS-EXCLUDE-REPLACEMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "_csetf_gts_exclude_replacement_position", "_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "make_gke_template_specification", "MAKE-GKE-TEMPLATE-SPECIFICATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "visit_defstruct_gke_template_specification", "VISIT-DEFSTRUCT-GKE-TEMPLATE-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "visit_defstruct_object_gke_template_specification_method", "VISIT-DEFSTRUCT-OBJECT-GKE-TEMPLATE-SPECIFICATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gke_template_specification_print", "GKE-TEMPLATE-SPECIFICATION-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "new_gke_template_specification", "NEW-GKE-TEMPLATE-SPECIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gke_serialize_specification", "GKE-SERIALIZE-SPECIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_template_specification", "gke_template_get_value", "GKE-TEMPLATE-GET-VALUE", 3, 0, false);
        return (SubLObject)gke_template_specification.NIL;
    }
    
    public static SubLObject init_gke_template_specification_file() {
        gke_template_specification.$gke_template_current_template$ = SubLFiles.deflexical("*GKE-TEMPLATE-CURRENT-TEMPLATE*", (SubLObject)(maybeDefault((SubLObject)gke_template_specification.$sym0$_GKE_TEMPLATE_CURRENT_TEMPLATE_, gke_template_specification.$gke_template_current_template$, gke_template_specification.NIL)));
        gke_template_specification.$dtp_gke_template_specification$ = SubLFiles.defconstant("*DTP-GKE-TEMPLATE-SPECIFICATION*", (SubLObject)gke_template_specification.$sym1$GKE_TEMPLATE_SPECIFICATION);
        return (SubLObject)gke_template_specification.NIL;
    }
    
    public static SubLObject setup_gke_template_specification_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)gke_template_specification.$sym0$_GKE_TEMPLATE_CURRENT_TEMPLATE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), gke_template_specification.$dtp_gke_template_specification$.getGlobalValue(), Symbols.symbol_function((SubLObject)gke_template_specification.$sym8$GKE_TEMPLATE_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)gke_template_specification.$list9);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym10$GTS_CONSTANT, (SubLObject)gke_template_specification.$sym11$_CSETF_GTS_CONSTANT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym12$GTS_FORMULA, (SubLObject)gke_template_specification.$sym13$_CSETF_GTS_FORMULA);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym14$GTS_ASSERT_MT, (SubLObject)gke_template_specification.$sym15$_CSETF_GTS_ASSERT_MT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym16$GTS_PARSING_MT, (SubLObject)gke_template_specification.$sym17$_CSETF_GTS_PARSING_MT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym18$GTS_NATURAL_LANGUAGE_MT, (SubLObject)gke_template_specification.$sym19$_CSETF_GTS_NATURAL_LANGUAGE_MT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym20$GTS_MODE, (SubLObject)gke_template_specification.$sym21$_CSETF_GTS_MODE);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym22$GTS_REPLACEMENT_METHOD, (SubLObject)gke_template_specification.$sym23$_CSETF_GTS_REPLACEMENT_METHOD);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym24$GTS_ARG_REPLACEMENT_METHOD, (SubLObject)gke_template_specification.$sym25$_CSETF_GTS_ARG_REPLACEMENT_METHOD);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym26$GTS_FOCAL_TERM, (SubLObject)gke_template_specification.$sym27$_CSETF_GTS_FOCAL_TERM);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym28$GTS_ASSERTION_FORMAT, (SubLObject)gke_template_specification.$sym29$_CSETF_GTS_ASSERTION_FORMAT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym30$GTS_CANDIDATE_REPLACEMENT, (SubLObject)gke_template_specification.$sym31$_CSETF_GTS_CANDIDATE_REPLACEMENT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym32$GTS_CONSTRAINT_ON_REPLACEMENT, (SubLObject)gke_template_specification.$sym33$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym34$GTS_CONSTRAINT_ON_REPLACEMENT_BASIS, (SubLObject)gke_template_specification.$sym35$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT_BASIS);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym36$GTS_EXCLUDE_REPLACEMENT, (SubLObject)gke_template_specification.$sym37$_CSETF_GTS_EXCLUDE_REPLACEMENT);
        Structures.def_csetf((SubLObject)gke_template_specification.$sym38$GTS_EXCLUDE_REPLACEMENT_POSITION, (SubLObject)gke_template_specification.$sym39$_CSETF_GTS_EXCLUDE_REPLACEMENT_POSITION);
        Equality.identity((SubLObject)gke_template_specification.$sym1$GKE_TEMPLATE_SPECIFICATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), gke_template_specification.$dtp_gke_template_specification$.getGlobalValue(), Symbols.symbol_function((SubLObject)gke_template_specification.$sym60$VISIT_DEFSTRUCT_OBJECT_GKE_TEMPLATE_SPECIFICATION_METHOD));
        return (SubLObject)gke_template_specification.NIL;
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
    
    static {
        me = (SubLFile)new gke_template_specification();
        gke_template_specification.$gke_template_current_template$ = null;
        gke_template_specification.$dtp_gke_template_specification$ = null;
        $sym0$_GKE_TEMPLATE_CURRENT_TEMPLATE_ = SubLObjectFactory.makeSymbol("*GKE-TEMPLATE-CURRENT-TEMPLATE*");
        $sym1$GKE_TEMPLATE_SPECIFICATION = SubLObjectFactory.makeSymbol("GKE-TEMPLATE-SPECIFICATION");
        $sym2$GKE_TEMPLATE_SPECIFICATION_P = SubLObjectFactory.makeSymbol("GKE-TEMPLATE-SPECIFICATION-P");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CONSTANT"), SubLObjectFactory.makeSymbol("FORMULA"), SubLObjectFactory.makeSymbol("ASSERT-MT"), SubLObjectFactory.makeSymbol("PARSING-MT"), SubLObjectFactory.makeSymbol("NATURAL-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("MODE"), SubLObjectFactory.makeSymbol("REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("ARG-REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("FOCAL-TERM"), SubLObjectFactory.makeSymbol("ASSERTION-FORMAT"), SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENT"), SubLObjectFactory.makeSymbol("CONSTRAINT-ON-REPLACEMENT"), SubLObjectFactory.makeSymbol("CONSTRAINT-ON-REPLACEMENT-BASIS"), SubLObjectFactory.makeSymbol("EXCLUDE-REPLACEMENT"), SubLObjectFactory.makeSymbol("EXCLUDE-REPLACEMENT-POSITION") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("CONSTANT"), SubLObjectFactory.makeKeyword("FORMULA"), SubLObjectFactory.makeKeyword("ASSERT-MT"), SubLObjectFactory.makeKeyword("PARSING-MT"), SubLObjectFactory.makeKeyword("NATURAL-LANGUAGE-MT"), SubLObjectFactory.makeKeyword("MODE"), SubLObjectFactory.makeKeyword("REPLACEMENT-METHOD"), SubLObjectFactory.makeKeyword("ARG-REPLACEMENT-METHOD"), SubLObjectFactory.makeKeyword("FOCAL-TERM"), SubLObjectFactory.makeKeyword("ASSERTION-FORMAT"), SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENT"), SubLObjectFactory.makeKeyword("CONSTRAINT-ON-REPLACEMENT"), SubLObjectFactory.makeKeyword("CONSTRAINT-ON-REPLACEMENT-BASIS"), SubLObjectFactory.makeKeyword("EXCLUDE-REPLACEMENT"), SubLObjectFactory.makeKeyword("EXCLUDE-REPLACEMENT-POSITION") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("GTS-CONSTANT"), SubLObjectFactory.makeSymbol("GTS-FORMULA"), SubLObjectFactory.makeSymbol("GTS-ASSERT-MT"), SubLObjectFactory.makeSymbol("GTS-PARSING-MT"), SubLObjectFactory.makeSymbol("GTS-NATURAL-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("GTS-MODE"), SubLObjectFactory.makeSymbol("GTS-REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("GTS-ARG-REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("GTS-FOCAL-TERM"), SubLObjectFactory.makeSymbol("GTS-ASSERTION-FORMAT"), SubLObjectFactory.makeSymbol("GTS-CANDIDATE-REPLACEMENT"), SubLObjectFactory.makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT"), SubLObjectFactory.makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT-BASIS"), SubLObjectFactory.makeSymbol("GTS-EXCLUDE-REPLACEMENT"), SubLObjectFactory.makeSymbol("GTS-EXCLUDE-REPLACEMENT-POSITION") });
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTANT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-FORMULA"), SubLObjectFactory.makeSymbol("_CSETF-GTS-ASSERT-MT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-PARSING-MT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-NATURAL-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-MODE"), SubLObjectFactory.makeSymbol("_CSETF-GTS-REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("_CSETF-GTS-ARG-REPLACEMENT-METHOD"), SubLObjectFactory.makeSymbol("_CSETF-GTS-FOCAL-TERM"), SubLObjectFactory.makeSymbol("_CSETF-GTS-ASSERTION-FORMAT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-CANDIDATE-REPLACEMENT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS"), SubLObjectFactory.makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT"), SubLObjectFactory.makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION") });
        $sym7$GKE_TEMPLATE_SPECIFICATION_PRINT = SubLObjectFactory.makeSymbol("GKE-TEMPLATE-SPECIFICATION-PRINT");
        $sym8$GKE_TEMPLATE_SPECIFICATION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("GKE-TEMPLATE-SPECIFICATION-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("GKE-TEMPLATE-SPECIFICATION-P"));
        $sym10$GTS_CONSTANT = SubLObjectFactory.makeSymbol("GTS-CONSTANT");
        $sym11$_CSETF_GTS_CONSTANT = SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTANT");
        $sym12$GTS_FORMULA = SubLObjectFactory.makeSymbol("GTS-FORMULA");
        $sym13$_CSETF_GTS_FORMULA = SubLObjectFactory.makeSymbol("_CSETF-GTS-FORMULA");
        $sym14$GTS_ASSERT_MT = SubLObjectFactory.makeSymbol("GTS-ASSERT-MT");
        $sym15$_CSETF_GTS_ASSERT_MT = SubLObjectFactory.makeSymbol("_CSETF-GTS-ASSERT-MT");
        $sym16$GTS_PARSING_MT = SubLObjectFactory.makeSymbol("GTS-PARSING-MT");
        $sym17$_CSETF_GTS_PARSING_MT = SubLObjectFactory.makeSymbol("_CSETF-GTS-PARSING-MT");
        $sym18$GTS_NATURAL_LANGUAGE_MT = SubLObjectFactory.makeSymbol("GTS-NATURAL-LANGUAGE-MT");
        $sym19$_CSETF_GTS_NATURAL_LANGUAGE_MT = SubLObjectFactory.makeSymbol("_CSETF-GTS-NATURAL-LANGUAGE-MT");
        $sym20$GTS_MODE = SubLObjectFactory.makeSymbol("GTS-MODE");
        $sym21$_CSETF_GTS_MODE = SubLObjectFactory.makeSymbol("_CSETF-GTS-MODE");
        $sym22$GTS_REPLACEMENT_METHOD = SubLObjectFactory.makeSymbol("GTS-REPLACEMENT-METHOD");
        $sym23$_CSETF_GTS_REPLACEMENT_METHOD = SubLObjectFactory.makeSymbol("_CSETF-GTS-REPLACEMENT-METHOD");
        $sym24$GTS_ARG_REPLACEMENT_METHOD = SubLObjectFactory.makeSymbol("GTS-ARG-REPLACEMENT-METHOD");
        $sym25$_CSETF_GTS_ARG_REPLACEMENT_METHOD = SubLObjectFactory.makeSymbol("_CSETF-GTS-ARG-REPLACEMENT-METHOD");
        $sym26$GTS_FOCAL_TERM = SubLObjectFactory.makeSymbol("GTS-FOCAL-TERM");
        $sym27$_CSETF_GTS_FOCAL_TERM = SubLObjectFactory.makeSymbol("_CSETF-GTS-FOCAL-TERM");
        $sym28$GTS_ASSERTION_FORMAT = SubLObjectFactory.makeSymbol("GTS-ASSERTION-FORMAT");
        $sym29$_CSETF_GTS_ASSERTION_FORMAT = SubLObjectFactory.makeSymbol("_CSETF-GTS-ASSERTION-FORMAT");
        $sym30$GTS_CANDIDATE_REPLACEMENT = SubLObjectFactory.makeSymbol("GTS-CANDIDATE-REPLACEMENT");
        $sym31$_CSETF_GTS_CANDIDATE_REPLACEMENT = SubLObjectFactory.makeSymbol("_CSETF-GTS-CANDIDATE-REPLACEMENT");
        $sym32$GTS_CONSTRAINT_ON_REPLACEMENT = SubLObjectFactory.makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT");
        $sym33$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT = SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT");
        $sym34$GTS_CONSTRAINT_ON_REPLACEMENT_BASIS = SubLObjectFactory.makeSymbol("GTS-CONSTRAINT-ON-REPLACEMENT-BASIS");
        $sym35$_CSETF_GTS_CONSTRAINT_ON_REPLACEMENT_BASIS = SubLObjectFactory.makeSymbol("_CSETF-GTS-CONSTRAINT-ON-REPLACEMENT-BASIS");
        $sym36$GTS_EXCLUDE_REPLACEMENT = SubLObjectFactory.makeSymbol("GTS-EXCLUDE-REPLACEMENT");
        $sym37$_CSETF_GTS_EXCLUDE_REPLACEMENT = SubLObjectFactory.makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT");
        $sym38$GTS_EXCLUDE_REPLACEMENT_POSITION = SubLObjectFactory.makeSymbol("GTS-EXCLUDE-REPLACEMENT-POSITION");
        $sym39$_CSETF_GTS_EXCLUDE_REPLACEMENT_POSITION = SubLObjectFactory.makeSymbol("_CSETF-GTS-EXCLUDE-REPLACEMENT-POSITION");
        $kw40$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw41$FORMULA = SubLObjectFactory.makeKeyword("FORMULA");
        $kw42$ASSERT_MT = SubLObjectFactory.makeKeyword("ASSERT-MT");
        $kw43$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw44$NATURAL_LANGUAGE_MT = SubLObjectFactory.makeKeyword("NATURAL-LANGUAGE-MT");
        $kw45$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw46$REPLACEMENT_METHOD = SubLObjectFactory.makeKeyword("REPLACEMENT-METHOD");
        $kw47$ARG_REPLACEMENT_METHOD = SubLObjectFactory.makeKeyword("ARG-REPLACEMENT-METHOD");
        $kw48$FOCAL_TERM = SubLObjectFactory.makeKeyword("FOCAL-TERM");
        $kw49$ASSERTION_FORMAT = SubLObjectFactory.makeKeyword("ASSERTION-FORMAT");
        $kw50$CANDIDATE_REPLACEMENT = SubLObjectFactory.makeKeyword("CANDIDATE-REPLACEMENT");
        $kw51$CONSTRAINT_ON_REPLACEMENT = SubLObjectFactory.makeKeyword("CONSTRAINT-ON-REPLACEMENT");
        $kw52$CONSTRAINT_ON_REPLACEMENT_BASIS = SubLObjectFactory.makeKeyword("CONSTRAINT-ON-REPLACEMENT-BASIS");
        $kw53$EXCLUDE_REPLACEMENT = SubLObjectFactory.makeKeyword("EXCLUDE-REPLACEMENT");
        $kw54$EXCLUDE_REPLACEMENT_POSITION = SubLObjectFactory.makeKeyword("EXCLUDE-REPLACEMENT-POSITION");
        $str55$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw56$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym57$MAKE_GKE_TEMPLATE_SPECIFICATION = SubLObjectFactory.makeSymbol("MAKE-GKE-TEMPLATE-SPECIFICATION");
        $kw58$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw59$END = SubLObjectFactory.makeKeyword("END");
        $sym60$VISIT_DEFSTRUCT_OBJECT_GKE_TEMPLATE_SPECIFICATION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-GKE-TEMPLATE-SPECIFICATION-METHOD");
        $str61$_A = SubLObjectFactory.makeString("~A");
        $sym62$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $sym63$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $const64$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaForFormulaTemplate"));
        $const65$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertMtForFormulaTemplate"));
        $const66$parsingMtForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parsingMtForFormulaTemplate"));
        $const67$naturalLanguageMtForFormulaTempla = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("naturalLanguageMtForFormulaTemplate"));
        $const68$setModeForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setModeForFormulaTemplate"));
        $const69$setReplacementSelectionMethodForF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("setReplacementSelectionMethodForFormulaTemplate"));
        $const70$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("focalTermPositionForFormulaTemplate"));
        $const71$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionFormatForFormulaTemplate"));
        $const72$candidateReplacementForPosition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("candidateReplacementForPosition"));
        $const73$constraintOnReplacement = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraintOnReplacement"));
        $const74$constraintOnReplacementBasis = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("constraintOnReplacementBasis"));
        $const75$excludeReplacementOptionForFormul = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("excludeReplacementOptionForFormulaTemplate"));
        $const76$excludeReplacementOptionForFormul = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("excludeReplacementOptionForFormulaTemplatePosition"));
    }
    
    public static final class $gke_template_specification_native extends SubLStructNative
    {
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
        
        public $gke_template_specification_native() {
            this.$constant = (SubLObject)CommonSymbols.NIL;
            this.$formula = (SubLObject)CommonSymbols.NIL;
            this.$assert_mt = (SubLObject)CommonSymbols.NIL;
            this.$parsing_mt = (SubLObject)CommonSymbols.NIL;
            this.$natural_language_mt = (SubLObject)CommonSymbols.NIL;
            this.$mode = (SubLObject)CommonSymbols.NIL;
            this.$replacement_method = (SubLObject)CommonSymbols.NIL;
            this.$arg_replacement_method = (SubLObject)CommonSymbols.NIL;
            this.$focal_term = (SubLObject)CommonSymbols.NIL;
            this.$assertion_format = (SubLObject)CommonSymbols.NIL;
            this.$candidate_replacement = (SubLObject)CommonSymbols.NIL;
            this.$constraint_on_replacement = (SubLObject)CommonSymbols.NIL;
            this.$constraint_on_replacement_basis = (SubLObject)CommonSymbols.NIL;
            this.$exclude_replacement = (SubLObject)CommonSymbols.NIL;
            this.$exclude_replacement_position = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$gke_template_specification_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$gke_template_specification_native.class, gke_template_specification.$sym1$GKE_TEMPLATE_SPECIFICATION, gke_template_specification.$sym2$GKE_TEMPLATE_SPECIFICATION_P, gke_template_specification.$list3, gke_template_specification.$list4, new String[] { "$constant", "$formula", "$assert_mt", "$parsing_mt", "$natural_language_mt", "$mode", "$replacement_method", "$arg_replacement_method", "$focal_term", "$assertion_format", "$candidate_replacement", "$constraint_on_replacement", "$constraint_on_replacement_basis", "$exclude_replacement", "$exclude_replacement_position" }, gke_template_specification.$list5, gke_template_specification.$list6, gke_template_specification.$sym7$GKE_TEMPLATE_SPECIFICATION_PRINT);
        }
    }
    
    public static final class $gke_template_specification_p$UnaryFunction extends UnaryFunction
    {
        public $gke_template_specification_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("GKE-TEMPLATE-SPECIFICATION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return gke_template_specification.gke_template_specification_p(arg1);
        }
    }
}

/*

	Total time: 172 ms
	
*/