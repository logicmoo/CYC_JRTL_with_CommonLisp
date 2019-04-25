package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class canon_tl extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.canon_tl";
    public static final String myFingerPrint = "619bc731e2513268d92e52dce3c8e4dd6269530aa71022c8d9bec1607fdd8416";
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 5757L)
    private static SubLSymbol $el_var_names$;
    private static final SubLSymbol $sym0$ASSERTION_P;
    private static final SubLSymbol $sym1$ASSERTION_TL_IST_FORMULA;
    private static final SubLObject $const2$ist;
    private static final SubLSymbol $sym3$HL_NOT_TL_TERM_;
    private static final SubLSymbol $sym4$HL_TERM_TO_TL;
    private static final SubLObject $const5$and;
    private static final SubLSymbol $sym6$TL_TERM_;
    private static final SubLObject $const7$TLVariableFn;
    private static final SubLSymbol $sym8$TL_TERM_TO_HL;
    private static final SubLObject $const9$implies;
    private static final SubLObject $const10$or;
    private static final SubLObject $const11$not;
    private static final SubLObject $const12$TLAssertionFn;
    private static final SubLObject $const13$TLReifiedNatFn;
    private static final SubLString $str14$referenced_assertion_not_found___;
    private static final SubLString $str15$referenced_function_not_found____;
    private static final SubLSymbol $sym16$QUOTE;
    private static final SubLString $str17$referenced_TL_assertion_not_found;
    private static final SubLString $str18$referenced_TL_nart_not_found_____;
    private static final SubLSymbol $sym19$TL_ASSERTION_TERM_TO_EL;
    private static final SubLSymbol $sym20$TL_FUNCTION_TERM_TO_EL;
    private static final SubLSymbol $sym21$TL_VAR_TO_EL;
    private static final SubLSymbol $sym22$CONSP;
    private static final SubLSymbol $sym23$TL_VAR_;
    private static final SubLSymbol $sym24$TL_FUNCTION_TERM_;
    private static final SubLSymbol $sym25$TL_FUNCTION_TERM_TO_HL;
    private static final SubLSymbol $sym26$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $kw27$ASSERTION_NOT_PRESENT;
    private static final SubLString $str28$formula__S_in_mt__S_cannot_be_fou;
    private static final SubLSymbol $kw29$ASSERTION_NOT_LOCAL;
    private static final SubLString $str30$CNF__S_in_mt__S_is_not_locally_in;
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 2071L)
    public static SubLObject assertion_tl_formula(final SubLObject assertion) {
        final SubLObject formulas = assertion_tl_formulas(assertion);
        if (canon_tl.NIL != list_utilities.singletonP(formulas)) {
            return formulas.first();
        }
        return simplifier.conjoin(formulas, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 3795L)
    public static SubLObject assertion_tl_ist_formula(final SubLObject assertion) {
        final SubLObject formulas = assertion_tl_ist_formulas(assertion);
        if (canon_tl.NIL != list_utilities.singletonP(formulas)) {
            return formulas.first();
        }
        return simplifier.conjoin(formulas, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 4113L)
    public static SubLObject convert_assertions_to_tl_ist_formulas(final SubLObject tree) {
        return transform_list_utilities.transform(tree, (SubLObject)canon_tl.$sym0$ASSERTION_P, (SubLObject)canon_tl.$sym1$ASSERTION_TL_IST_FORMULA, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 4239L)
    public static SubLObject assertion_tl_formulas(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject siblings = sibling_tl_assertions(assertion);
        SubLObject multi_mtsP = (SubLObject)canon_tl.NIL;
        SubLObject result = (SubLObject)canon_tl.NIL;
        if (canon_tl.NIL == multi_mtsP) {
            SubLObject csome_list_var;
            SubLObject sibling;
            for (csome_list_var = siblings, sibling = (SubLObject)canon_tl.NIL, sibling = csome_list_var.first(); canon_tl.NIL == multi_mtsP && canon_tl.NIL != csome_list_var; multi_mtsP = (SubLObject)SubLObjectFactory.makeBoolean(canon_tl.NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(sibling))), csome_list_var = csome_list_var.rest(), sibling = csome_list_var.first()) {}
        }
        if (canon_tl.NIL != multi_mtsP) {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = (SubLObject)canon_tl.NIL;
            sibling = cdolist_list_var.first();
            while (canon_tl.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(assertion_tl_ist_formula_int(sibling), result);
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = (SubLObject)canon_tl.NIL;
            sibling = cdolist_list_var.first();
            while (canon_tl.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.cons(assertion_tl_formula_int(sibling), result);
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 4873L)
    public static SubLObject assertion_tl_ist_formulas(final SubLObject assertion) {
        SubLObject result = (SubLObject)canon_tl.NIL;
        SubLObject cdolist_list_var = sibling_tl_assertions(assertion);
        SubLObject sibling = (SubLObject)canon_tl.NIL;
        sibling = cdolist_list_var.first();
        while (canon_tl.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(assertion_tl_ist_formula_int(sibling), result);
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 5221L)
    public static SubLObject sibling_tl_assertions(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject assertions = (SubLObject)ConsesLow.list(assertion);
        SubLObject cdolist_list_var = skolems.defn_assertion_skolems(assertion);
        SubLObject skolem = (SubLObject)canon_tl.NIL;
        skolem = cdolist_list_var.first();
        while (canon_tl.NIL != cdolist_list_var) {
            assertions = conses_high.nunion(assertions, skolems.all_skolem_mt_defn_assertions(skolem, mt, (SubLObject)canon_tl.UNPROVIDED), (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 5514L)
    public static SubLObject assertion_tl_ist_formula_int(final SubLObject assertion) {
        final SubLObject tl_mt = transform_hl_terms_to_tl(assertions_high.assertion_mt(assertion));
        final SubLObject tl_formula = assertion_tl_formula_int(assertion);
        return el_utilities.make_binary_formula(canon_tl.$const2$ist, tl_mt, tl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 5861L)
    public static SubLObject assertion_tl_formula_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)canon_tl.NIL;
        final SubLObject _prev_bind_0 = canon_tl.$el_var_names$.currentBinding(thread);
        try {
            canon_tl.$el_var_names$.bind(assertions_high.assertion_variable_names(assertion), thread);
            result = clauses.cnf_formula(transform_hl_terms_to_tl(assertion_tl_cnf(assertion)), (SubLObject)canon_tl.UNPROVIDED);
        }
        finally {
            canon_tl.$el_var_names$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 6109L)
    public static SubLObject assertion_tl_cnf(final SubLObject assertion) {
        return assertions_high.assertion_cnf(assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 6190L)
    public static SubLObject transform_hl_terms_to_tl(final SubLObject tree) {
        return transform_list_utilities.quiescent_transform(tree, (SubLObject)canon_tl.$sym3$HL_NOT_TL_TERM_, (SubLObject)canon_tl.$sym4$HL_TERM_TO_TL, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 6309L)
    public static SubLObject tl_encapsulate(final SubLObject tree) {
        return encapsulation.encapsulate(transform_hl_terms_to_tl(tree));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 6405L)
    public static SubLObject find_assertion_from_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        final SubLObject assertions = find_assertions_from_tl_formula(tl_formula, mt);
        if (canon_tl.NIL != list_utilities.singletonP(assertions)) {
            return assertions.first();
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 6892L)
    public static SubLObject find_assertions_from_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        if (canon_tl.$const5$and.eql(cycl_utilities.formula_arg0(tl_formula))) {
            final SubLObject sibling_specs = cycl_utilities.formula_args(tl_formula, (SubLObject)canon_tl.UNPROVIDED);
            final SubLObject first_sibling = sibling_specs.first();
            SubLObject assertions = (SubLObject)canon_tl.NIL;
            if (!canon_tl.$const2$ist.eql(cycl_utilities.formula_arg0(first_sibling))) {
                SubLObject cdolist_list_var = sibling_specs;
                SubLObject sibling_spec = (SubLObject)canon_tl.NIL;
                sibling_spec = cdolist_list_var.first();
                while (canon_tl.NIL != cdolist_list_var) {
                    final SubLObject assertion = find_assertion_from_tl_cnf_formula(sibling_spec, mt);
                    if (canon_tl.NIL != assertion) {
                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_spec = cdolist_list_var.first();
                }
            }
            else {
                SubLObject cdolist_list_var = sibling_specs;
                SubLObject sibling_spec = (SubLObject)canon_tl.NIL;
                sibling_spec = cdolist_list_var.first();
                while (canon_tl.NIL != cdolist_list_var) {
                    final SubLObject assertion = find_assertion_from_tl_cnf_ist_formula(sibling_spec);
                    if (canon_tl.NIL != assertion) {
                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_spec = cdolist_list_var.first();
                }
            }
            return Sequences.nreverse(assertions);
        }
        final SubLObject assertion2 = find_assertion_from_tl_cnf_formula(tl_formula, mt);
        if (canon_tl.NIL != assertion2) {
            return (SubLObject)ConsesLow.list(assertion2);
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 7958L)
    public static SubLObject find_assertion_from_tl_cnf_ist_formula(final SubLObject tl_cnf_ist_formula) {
        final SubLObject mt = tl_term_to_hl(cycl_utilities.formula_arg1(tl_cnf_ist_formula, (SubLObject)canon_tl.UNPROVIDED));
        final SubLObject tl_cnf_formula = cycl_utilities.formula_arg2(tl_cnf_ist_formula, (SubLObject)canon_tl.UNPROVIDED);
        return find_assertion_from_tl_cnf_formula(tl_cnf_formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 8234L)
    public static SubLObject find_assertion_from_tl_cnf_formula(final SubLObject tl_cnf_formula, final SubLObject tl_mt) {
        final SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_cnf_formula);
        final SubLObject v_hlmt = tlmt_to_hlmt(tl_mt);
        if (canon_tl.NIL != hlmt.hlmt_p(v_hlmt)) {
            return kb_indexing.find_assertion(hl_cnf, v_hlmt);
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 8467L)
    public static SubLObject tl_formula_to_hl_cnf(final SubLObject tl_formula) {
        return tl_formula_to_cnf_int(transform_tl_terms_to_hl(tl_formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 8589L)
    public static SubLObject tlmt_to_hlmt(final SubLObject tl_mt) {
        return transform_tl_terms_to_hl(tl_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 8671L)
    public static SubLObject transform_tl_terms_to_hl(SubLObject tree) {
        if (canon_tl.NIL != cycl_utilities.expression_find_if((SubLObject)canon_tl.$sym6$TL_TERM_, tree, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED) || canon_tl.NIL != cycl_utilities.expression_find(canon_tl.$const7$TLVariableFn, tree, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED)) {
            tree = transform_list_utilities.quiescent_transform(tree, (SubLObject)canon_tl.$sym6$TL_TERM_, (SubLObject)canon_tl.$sym8$TL_TERM_TO_HL, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 8954L)
    public static SubLObject tl_formula_to_cnf_int(final SubLObject formula) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(formula);
        if (pcase_var.eql(canon_tl.$const9$implies)) {
            final SubLObject neg_lits = (SubLObject)((canon_tl.NIL != el_utilities.el_conjunction_p(cycl_utilities.formula_arg1(formula, (SubLObject)canon_tl.UNPROVIDED))) ? cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, (SubLObject)canon_tl.UNPROVIDED), (SubLObject)canon_tl.UNPROVIDED) : ConsesLow.list(cycl_utilities.formula_arg1(formula, (SubLObject)canon_tl.UNPROVIDED)));
            final SubLObject pos_lits = (SubLObject)((canon_tl.NIL != el_utilities.el_disjunction_p(cycl_utilities.formula_arg2(formula, (SubLObject)canon_tl.UNPROVIDED))) ? cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, (SubLObject)canon_tl.UNPROVIDED), (SubLObject)canon_tl.UNPROVIDED) : ConsesLow.list(cycl_utilities.formula_arg2(formula, (SubLObject)canon_tl.UNPROVIDED)));
            return clauses.make_cnf(neg_lits, pos_lits);
        }
        if (pcase_var.eql(canon_tl.$const10$or)) {
            return clauses.make_cnf((SubLObject)canon_tl.NIL, cycl_utilities.formula_args(formula, (SubLObject)canon_tl.UNPROVIDED));
        }
        if (pcase_var.eql(canon_tl.$const11$not)) {
            return clauses.make_cnf((canon_tl.NIL != el_utilities.el_conjunction_p(cycl_utilities.formula_arg1(formula, (SubLObject)canon_tl.UNPROVIDED))) ? cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, (SubLObject)canon_tl.UNPROVIDED), (SubLObject)canon_tl.UNPROVIDED) : cycl_utilities.formula_args(formula, (SubLObject)canon_tl.UNPROVIDED), (SubLObject)canon_tl.NIL);
        }
        return clauses.make_cnf((SubLObject)canon_tl.NIL, (SubLObject)ConsesLow.list(formula));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 9672L)
    public static SubLObject tl_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(canon_tl.NIL != tl_assertion_termP(v_object) || canon_tl.NIL != tl_function_termP(v_object) || canon_tl.NIL != tl_varP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 10049L)
    public static SubLObject tl_assertion_termP(final SubLObject v_object) {
        if (canon_tl.NIL != el_utilities.possibly_naut_p(v_object) && canon_tl.$const12$TLAssertionFn.eql(cycl_utilities.naut_functor(v_object)) && canon_tl.NIL != el_utilities.el_formula_arityE(v_object, (SubLObject)canon_tl.TWO_INTEGER, (SubLObject)canon_tl.UNPROVIDED)) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, (SubLObject)canon_tl.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.naut_arg2(v_object, (SubLObject)canon_tl.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(canon_tl.NIL != el_utilities.possibly_fo_represented_term_p(arg1) && canon_tl.NIL != el_utilities.el_formula_p(arg2));
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 10479L)
    public static SubLObject tl_function_termP(final SubLObject v_object) {
        if (canon_tl.NIL != el_utilities.possibly_naut_p(v_object) && canon_tl.$const13$TLReifiedNatFn.eql(cycl_utilities.naut_functor(v_object)) && canon_tl.NIL != el_utilities.el_formula_arityE(v_object, (SubLObject)canon_tl.ONE_INTEGER, (SubLObject)canon_tl.UNPROVIDED)) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, (SubLObject)canon_tl.UNPROVIDED);
            return el_utilities.possibly_naut_p(arg1);
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 10799L)
    public static SubLObject tl_varP(final SubLObject v_object) {
        if (canon_tl.NIL != el_utilities.possibly_naut_p(v_object) && canon_tl.$const7$TLVariableFn.eql(cycl_utilities.naut_functor(v_object)) && canon_tl.NIL != el_utilities.el_formula_arityE(v_object, (SubLObject)canon_tl.TWO_INTEGER, (SubLObject)canon_tl.UNPROVIDED)) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, (SubLObject)canon_tl.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.naut_arg2(v_object, (SubLObject)canon_tl.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(arg1.isInteger() && (arg2.isString() || canon_tl.NIL == arg2));
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 11222L)
    public static SubLObject hl_not_tl_termP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(canon_tl.NIL != assertion_handles.assertion_p(v_object) || canon_tl.NIL != nart_handles.nart_p(v_object) || canon_tl.NIL != variables.variable_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 11435L)
    public static SubLObject hl_term_to_tl(final SubLObject v_object) {
        if (canon_tl.NIL != assertion_handles.assertion_p(v_object)) {
            return hl_assertion_term_to_tl(v_object);
        }
        if (canon_tl.NIL != nart_handles.nart_p(v_object)) {
            return hl_function_term_to_tl(v_object);
        }
        if (canon_tl.NIL != variables.variable_p(v_object)) {
            return hl_var_to_tl(v_object, (SubLObject)canon_tl.UNPROVIDED);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 11729L)
    public static SubLObject hl_assertion_term_to_tl(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject tl_formula = assertion_tl_formula_int(assertion);
        final SubLObject tl_mt = transform_hl_terms_to_tl(mt);
        if (!assertion.eql(find_assertion_from_tl_formula(tl_formula, mt))) {
            el_utilities.el_error((SubLObject)canon_tl.THREE_INTEGER, (SubLObject)canon_tl.$str14$referenced_assertion_not_found___, assertion, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
        }
        return el_utilities.make_binary_formula(canon_tl.$const12$TLAssertionFn, tl_mt, tl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 12128L)
    public static SubLObject hl_function_term_to_tl(final SubLObject nart) {
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
        if (canon_tl.NIL == term.hl_ground_nautP(nart_hl_formula) || !nart.eql(narts_high.find_nart(nart_hl_formula))) {
            el_utilities.el_error((SubLObject)canon_tl.THREE_INTEGER, (SubLObject)canon_tl.$str15$referenced_function_not_found____, nart, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
        }
        return el_utilities.make_unary_formula(canon_tl.$const13$TLReifiedNatFn, nart_hl_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 12455L)
    public static SubLObject hl_var_to_tl(final SubLObject hl_var, SubLObject el_var_names) {
        if (el_var_names == canon_tl.UNPROVIDED) {
            el_var_names = canon_tl.$el_var_names$.getDynamicValue();
        }
        final SubLObject id = variables.variable_id(hl_var);
        final SubLObject name = (SubLObject)(id.isInteger() ? ConsesLow.nth(id, el_var_names) : canon_tl.NIL);
        return el_utilities.make_binary_formula(canon_tl.$const7$TLVariableFn, id, name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 12680L)
    public static SubLObject tl_quotify(final SubLObject v_object) {
        if (canon_tl.NIL != list_utilities.self_evaluating_form_p(v_object) && canon_tl.NIL == hl_not_tl_termP(v_object)) {
            return v_object;
        }
        return (SubLObject)ConsesLow.list((SubLObject)canon_tl.$sym16$QUOTE, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 12993L)
    public static SubLObject tl_term_to_hl(final SubLObject v_object) {
        if (canon_tl.NIL != tl_assertion_termP(v_object)) {
            return tl_assertion_term_to_hl(v_object);
        }
        if (canon_tl.NIL != tl_function_termP(v_object)) {
            return tl_function_term_to_hl(v_object);
        }
        if (canon_tl.NIL != tl_varP(v_object)) {
            return tl_var_to_hl(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 13391L)
    public static SubLObject tl_assertion_term_to_hl(final SubLObject tl_assertion_term) {
        final SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, (SubLObject)canon_tl.UNPROVIDED);
        final SubLObject mt = tl_term_to_hl(cycl_utilities.nat_arg1(tl_assertion_term, (SubLObject)canon_tl.UNPROVIDED));
        final SubLObject assertion = find_assertion_from_tl_formula(tl_formula, mt);
        if (canon_tl.NIL != assertion_handles.assertion_p(assertion)) {
            return assertion;
        }
        el_utilities.el_error((SubLObject)canon_tl.THREE_INTEGER, (SubLObject)canon_tl.$str17$referenced_TL_assertion_not_found, tl_assertion_term, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
        return tl_assertion_term_to_el(tl_assertion_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 13810L)
    public static SubLObject tl_function_term_to_hl(final SubLObject tl_function_term) {
        final SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, (SubLObject)canon_tl.UNPROVIDED);
        final SubLObject nart = tl_find_nart(nat_spec);
        if (canon_tl.NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        el_utilities.el_error((SubLObject)canon_tl.THREE_INTEGER, (SubLObject)canon_tl.$str18$referenced_TL_nart_not_found_____, tl_function_term, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
        return tl_function_term_to_el(tl_function_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 14121L)
    public static SubLObject tl_var_to_hl(final SubLObject tl_var) {
        final SubLObject id = cycl_utilities.nat_arg1(tl_var, (SubLObject)canon_tl.UNPROVIDED);
        if (id.isInteger()) {
            return variables.find_variable_by_id(id);
        }
        return tl_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 14267L)
    public static SubLObject tl_term_to_el(final SubLObject v_object) {
        if (canon_tl.NIL != tl_assertion_termP(v_object)) {
            return tl_assertion_term_to_el(v_object);
        }
        if (canon_tl.NIL != tl_function_termP(v_object)) {
            return tl_function_term_to_el(v_object);
        }
        if (canon_tl.NIL != tl_varP(v_object)) {
            return tl_var_to_el(v_object);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 14632L)
    public static SubLObject tl_assertion_term_to_el(final SubLObject tl_assertion_term) {
        final SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, (SubLObject)canon_tl.UNPROVIDED);
        final SubLObject mt = tl_term_to_el(cycl_utilities.nat_arg1(tl_assertion_term, (SubLObject)canon_tl.UNPROVIDED));
        return Values.values(el_utilities.make_binary_formula(canon_tl.$const2$ist, mt, tl_formula), mt_vars.$ist_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 14936L)
    public static SubLObject tl_function_term_to_el(final SubLObject tl_function_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, (SubLObject)canon_tl.UNPROVIDED);
        SubLObject nat = (SubLObject)canon_tl.NIL;
        if (canon_tl.NIL != term.closed_nautP(nat_spec, (SubLObject)canon_tl.UNPROVIDED)) {
            nat = nat_spec;
        }
        else if (canon_tl.NIL != nart_handles.nart_p(nat_spec) && canon_tl.NIL != narts_high.nart_hl_formula(nat_spec)) {
            nat = narts_high.nart_hl_formula(nat_spec);
        }
        if (canon_tl.NIL != nat) {
            return Values.values(nat, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return Values.values(nat_spec, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 15338L)
    public static SubLObject tl_var_to_el(final SubLObject tl_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = cycl_utilities.nat_arg2(tl_var, (SubLObject)canon_tl.UNPROVIDED);
        if (name.isString()) {
            return Values.values(cycl_variables.make_el_var(name), mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return Values.values(tl_var, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 15555L)
    public static SubLObject tl_find_nart(final SubLObject nat_spec) {
        final SubLObject nart = tl_nart_substitute(nat_spec);
        return (SubLObject)((canon_tl.NIL != nart_handles.nart_p(nart)) ? nart : canon_tl.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 15986L)
    public static SubLObject tl_nart_substitute(final SubLObject nat_formula) {
        if (canon_tl.NIL != list_utilities.not_any_in_list(Symbols.symbol_function((SubLObject)canon_tl.$sym22$CONSP), nat_formula, (SubLObject)canon_tl.UNPROVIDED)) {
            final SubLObject nart = narts_high.nart_lookup(nat_formula);
            return (canon_tl.NIL != nart_handles.nart_p(nart)) ? nart : nat_formula;
        }
        final SubLObject new_nat_formula = conses_high.copy_list(nat_formula);
        SubLObject list = (SubLObject)canon_tl.NIL;
        SubLObject arg = (SubLObject)canon_tl.NIL;
        list = new_nat_formula;
        arg = list.first();
        while (canon_tl.NIL != list) {
            if (canon_tl.NIL != tl_function_termP(arg)) {
                final SubLObject sub_nart = tl_function_term_to_hl(arg);
                if (canon_tl.NIL != sub_nart) {
                    ConsesLow.rplaca(list, sub_nart);
                }
            }
            else if (canon_tl.NIL != function_terms.nat_formula_p(arg)) {
                final SubLObject sub_nart = tl_nart_substitute(arg);
                if (canon_tl.NIL != sub_nart) {
                    ConsesLow.rplaca(list, sub_nart);
                }
            }
            list = list.rest();
            arg = list.first();
        }
        final SubLObject nart2 = narts_high.nart_lookup(new_nat_formula);
        return (canon_tl.NIL != nart_handles.nart_p(nart2)) ? nart2 : new_nat_formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 16854L)
    public static SubLObject tl_var_to_el_var_transform(final SubLObject v_object) {
        return cycl_utilities.expression_transform(v_object, (SubLObject)canon_tl.$sym23$TL_VAR_, (SubLObject)canon_tl.$sym21$TL_VAR_TO_EL, (SubLObject)canon_tl.T, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 17202L)
    public static SubLObject tl_nart_transform(final SubLObject v_object) {
        return cycl_utilities.expression_transform(v_object, (SubLObject)canon_tl.$sym24$TL_FUNCTION_TERM_, (SubLObject)canon_tl.$sym25$TL_FUNCTION_TERM_TO_HL, (SubLObject)canon_tl.T, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 17393L)
    public static SubLObject assertion_findable_via_tlP(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject tl_formula = assertion_tl_formula(assertion);
        final SubLObject assertions_found_via_tl = ke.find_assertions_via_tl(tl_formula, mt);
        return subl_promotions.memberP(assertion, assertions_found_via_tl, (SubLObject)canon_tl.UNPROVIDED, (SubLObject)canon_tl.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 17875L)
    public static SubLObject assertion_unassertible_via_tlP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)canon_tl.NIL;
        SubLObject error_message = (SubLObject)canon_tl.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)canon_tl.$sym26$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject tl_formula = assertion_tl_formula(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_formula);
                    final SubLObject found_assertion = (SubLObject)((canon_tl.NIL != hl_cnf) ? kb_indexing.find_assertion(hl_cnf, mt) : canon_tl.NIL);
                    if (canon_tl.NIL != found_assertion) {
                        foundP = Equality.eql(assertion, found_assertion);
                    }
                    else {
                        foundP = list_utilities.sets_equalP(sibling_tl_assertions(assertion), find_assertions_from_tl_formula(tl_formula, mt), (SubLObject)canon_tl.UNPROVIDED);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)canon_tl.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (canon_tl.NIL == error_message) {
            return foundP;
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 18493L)
    public static SubLObject assertion_unassertible_via_tl_fastP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = (SubLObject)canon_tl.NIL;
        SubLObject error_message = (SubLObject)canon_tl.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)canon_tl.$sym26$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    foundP = Equality.eql(assertion, kb_indexing.find_assertion(tl_formula_to_hl_cnf(assertion_tl_formula(assertion)), assertions_high.assertion_mt(assertion)));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)canon_tl.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (canon_tl.NIL == error_message) {
            return foundP;
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 18871L)
    public static SubLObject duplicate_assertionP(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf_assertions = kb_indexing.find_all_assertions(cnf);
        SubLObject duplicateP = (SubLObject)canon_tl.NIL;
        if (canon_tl.NIL == duplicateP) {
            SubLObject csome_list_var = cnf_assertions;
            SubLObject cnf_assertion = (SubLObject)canon_tl.NIL;
            cnf_assertion = csome_list_var.first();
            while (canon_tl.NIL == duplicateP && canon_tl.NIL != csome_list_var) {
                if (!assertion.eql(cnf_assertion)) {
                    duplicateP = hlmt.hlmt_equal(mt, assertions_high.assertion_mt(cnf_assertion));
                }
                csome_list_var = csome_list_var.rest();
                cnf_assertion = csome_list_var.first();
            }
        }
        return duplicateP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 19272L)
    public static SubLObject unassert_assertion_via_tl(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cdolist_list_var = assertion_tl_formulas(assertion);
        SubLObject tl_formula = (SubLObject)canon_tl.NIL;
        tl_formula = cdolist_list_var.first();
        if (canon_tl.NIL != cdolist_list_var) {
            return unassert_tl_formula(tl_formula, mt);
        }
        return (SubLObject)canon_tl.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/canon-tl.lisp", position = 19509L)
    public static SubLObject unassert_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        SubLObject ans = (SubLObject)canon_tl.NIL;
        final SubLObject already_thereP = find_assertion_from_tl_formula(tl_formula, mt);
        if (canon_tl.NIL == already_thereP) {
            fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)canon_tl.$kw27$ASSERTION_NOT_PRESENT, (SubLObject)canon_tl.$str28$formula__S_in_mt__S_cannot_be_fou, tl_formula, mt));
        }
        else {
            final SubLObject asserted_argument = assertions_high.get_asserted_argument(already_thereP);
            if (canon_tl.NIL == asserted_argument) {
                fi.signal_fi_warning((SubLObject)ConsesLow.list((SubLObject)canon_tl.$kw29$ASSERTION_NOT_LOCAL, (SubLObject)canon_tl.$str30$CNF__S_in_mt__S_is_not_locally_in, tl_formula, mt));
            }
            else {
                tms.tms_remove_argument(asserted_argument, already_thereP, (SubLObject)canon_tl.UNPROVIDED);
            }
        }
        ans = (SubLObject)SubLObjectFactory.makeBoolean(canon_tl.NIL == fi.fi_error_signaledP());
        if (canon_tl.NIL == fi.fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }
    
    public static SubLObject declare_canon_tl_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_formula", "ASSERTION-TL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_ist_formula", "ASSERTION-TL-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "convert_assertions_to_tl_ist_formulas", "CONVERT-ASSERTIONS-TO-TL-IST-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_formulas", "ASSERTION-TL-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_ist_formulas", "ASSERTION-TL-IST-FORMULAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "sibling_tl_assertions", "SIBLING-TL-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_ist_formula_int", "ASSERTION-TL-IST-FORMULA-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_formula_int", "ASSERTION-TL-FORMULA-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_tl_cnf", "ASSERTION-TL-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "transform_hl_terms_to_tl", "TRANSFORM-HL-TERMS-TO-TL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_encapsulate", "TL-ENCAPSULATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "find_assertion_from_tl_formula", "FIND-ASSERTION-FROM-TL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "find_assertions_from_tl_formula", "FIND-ASSERTIONS-FROM-TL-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "find_assertion_from_tl_cnf_ist_formula", "FIND-ASSERTION-FROM-TL-CNF-IST-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "find_assertion_from_tl_cnf_formula", "FIND-ASSERTION-FROM-TL-CNF-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_formula_to_hl_cnf", "TL-FORMULA-TO-HL-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tlmt_to_hlmt", "TLMT-TO-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "transform_tl_terms_to_hl", "TRANSFORM-TL-TERMS-TO-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_formula_to_cnf_int", "TL-FORMULA-TO-CNF-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_termP", "TL-TERM?", 1, 0, false);
        new $tl_termP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_assertion_termP", "TL-ASSERTION-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_function_termP", "TL-FUNCTION-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_varP", "TL-VAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "hl_not_tl_termP", "HL-NOT-TL-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "hl_term_to_tl", "HL-TERM-TO-TL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "hl_assertion_term_to_tl", "HL-ASSERTION-TERM-TO-TL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "hl_function_term_to_tl", "HL-FUNCTION-TERM-TO-TL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "hl_var_to_tl", "HL-VAR-TO-TL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_quotify", "TL-QUOTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_term_to_hl", "TL-TERM-TO-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_assertion_term_to_hl", "TL-ASSERTION-TERM-TO-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_function_term_to_hl", "TL-FUNCTION-TERM-TO-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_var_to_hl", "TL-VAR-TO-HL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_term_to_el", "TL-TERM-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_assertion_term_to_el", "TL-ASSERTION-TERM-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_function_term_to_el", "TL-FUNCTION-TERM-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_var_to_el", "TL-VAR-TO-EL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_find_nart", "TL-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_nart_substitute", "TL-NART-SUBSTITUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_var_to_el_var_transform", "TL-VAR-TO-EL-VAR-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "tl_nart_transform", "TL-NART-TRANSFORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_findable_via_tlP", "ASSERTION-FINDABLE-VIA-TL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_unassertible_via_tlP", "ASSERTION-UNASSERTIBLE-VIA-TL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "assertion_unassertible_via_tl_fastP", "ASSERTION-UNASSERTIBLE-VIA-TL-FAST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "duplicate_assertionP", "DUPLICATE-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "unassert_assertion_via_tl", "UNASSERT-ASSERTION-VIA-TL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.canon_tl", "unassert_tl_formula", "UNASSERT-TL-FORMULA", 2, 0, false);
        return (SubLObject)canon_tl.NIL;
    }
    
    public static SubLObject init_canon_tl_file() {
        canon_tl.$el_var_names$ = SubLFiles.defparameter("*EL-VAR-NAMES*", (SubLObject)canon_tl.NIL);
        return (SubLObject)canon_tl.NIL;
    }
    
    public static SubLObject setup_canon_tl_file() {
        utilities_macros.register_kb_function((SubLObject)canon_tl.$sym19$TL_ASSERTION_TERM_TO_EL);
        utilities_macros.register_kb_function((SubLObject)canon_tl.$sym20$TL_FUNCTION_TERM_TO_EL);
        utilities_macros.register_kb_function((SubLObject)canon_tl.$sym21$TL_VAR_TO_EL);
        return (SubLObject)canon_tl.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_canon_tl_file();
    }
    
    @Override
	public void initializeVariables() {
        init_canon_tl_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_canon_tl_file();
    }
    
    static {
        me = (SubLFile)new canon_tl();
        canon_tl.$el_var_names$ = null;
        $sym0$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym1$ASSERTION_TL_IST_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-TL-IST-FORMULA");
        $const2$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym3$HL_NOT_TL_TERM_ = SubLObjectFactory.makeSymbol("HL-NOT-TL-TERM?");
        $sym4$HL_TERM_TO_TL = SubLObjectFactory.makeSymbol("HL-TERM-TO-TL");
        $const5$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym6$TL_TERM_ = SubLObjectFactory.makeSymbol("TL-TERM?");
        $const7$TLVariableFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TLVariableFn"));
        $sym8$TL_TERM_TO_HL = SubLObjectFactory.makeSymbol("TL-TERM-TO-HL");
        $const9$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const10$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const11$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $const12$TLAssertionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TLAssertionFn"));
        $const13$TLReifiedNatFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TLReifiedNatFn"));
        $str14$referenced_assertion_not_found___ = SubLObjectFactory.makeString("referenced assertion not found: ~%  ~s");
        $str15$referenced_function_not_found____ = SubLObjectFactory.makeString("referenced function not found: ~%  ~s");
        $sym16$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $str17$referenced_TL_assertion_not_found = SubLObjectFactory.makeString("referenced TL assertion not found: ~%  ~s");
        $str18$referenced_TL_nart_not_found_____ = SubLObjectFactory.makeString("referenced TL nart not found: ~%  ~s");
        $sym19$TL_ASSERTION_TERM_TO_EL = SubLObjectFactory.makeSymbol("TL-ASSERTION-TERM-TO-EL");
        $sym20$TL_FUNCTION_TERM_TO_EL = SubLObjectFactory.makeSymbol("TL-FUNCTION-TERM-TO-EL");
        $sym21$TL_VAR_TO_EL = SubLObjectFactory.makeSymbol("TL-VAR-TO-EL");
        $sym22$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym23$TL_VAR_ = SubLObjectFactory.makeSymbol("TL-VAR?");
        $sym24$TL_FUNCTION_TERM_ = SubLObjectFactory.makeSymbol("TL-FUNCTION-TERM?");
        $sym25$TL_FUNCTION_TERM_TO_HL = SubLObjectFactory.makeSymbol("TL-FUNCTION-TERM-TO-HL");
        $sym26$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw27$ASSERTION_NOT_PRESENT = SubLObjectFactory.makeKeyword("ASSERTION-NOT-PRESENT");
        $str28$formula__S_in_mt__S_cannot_be_fou = SubLObjectFactory.makeString("formula ~S in mt ~S cannot be found");
        $kw29$ASSERTION_NOT_LOCAL = SubLObjectFactory.makeKeyword("ASSERTION-NOT-LOCAL");
        $str30$CNF__S_in_mt__S_is_not_locally_in = SubLObjectFactory.makeString("CNF ~S in mt ~S is not locally in the KB");
    }
    
    public static final class $tl_termP$UnaryFunction extends UnaryFunction
    {
        public $tl_termP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TL-TERM?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return canon_tl.tl_termP(arg1);
        }
    }
}

/*

	Total time: 241 ms
	
*/