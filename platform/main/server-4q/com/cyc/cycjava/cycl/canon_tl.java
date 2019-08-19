/**

 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_fo_represented_term_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CANON-TL
 * source file: /cyc/top/cycl/canon-tl.lisp
 * created:     2019/07/03 17:37:33
 */
public final class canon_tl extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new canon_tl();

 public static final String myName = "com.cyc.cycjava.cycl.canon_tl";


    // defparameter
    // el var names of current assertion being translated to TL
    /**
     * el var names of current assertion being translated to TL
     */
    @LispMethod(comment = "el var names of current assertion being translated to TL\ndefparameter")
    private static final SubLSymbol $el_var_names$ = makeSymbol("*EL-VAR-NAMES*");

    private static final SubLSymbol ASSERTION_TL_IST_FORMULA = makeSymbol("ASSERTION-TL-IST-FORMULA");



    static private final SubLSymbol $sym3$HL_NOT_TL_TERM_ = makeSymbol("HL-NOT-TL-TERM?");

    private static final SubLSymbol HL_TERM_TO_TL = makeSymbol("HL-TERM-TO-TL");



    static private final SubLSymbol $sym6$TL_TERM_ = makeSymbol("TL-TERM?");



    private static final SubLSymbol TL_TERM_TO_HL = makeSymbol("TL-TERM-TO-HL");











    static private final SubLString $str14$referenced_assertion_not_found___ = makeString("referenced assertion not found: ~%  ~s");

    static private final SubLString $str15$referenced_function_not_found____ = makeString("referenced function not found: ~%  ~s");

    static private final SubLString $str17$referenced_TL_assertion_not_found = makeString("referenced TL assertion not found: ~%  ~s");

    static private final SubLString $str18$referenced_TL_nart_not_found_____ = makeString("referenced TL nart not found: ~%  ~s");

    private static final SubLSymbol TL_ASSERTION_TERM_TO_EL = makeSymbol("TL-ASSERTION-TERM-TO-EL");

    private static final SubLSymbol TL_FUNCTION_TERM_TO_EL = makeSymbol("TL-FUNCTION-TERM-TO-EL");

    private static final SubLSymbol TL_VAR_TO_EL = makeSymbol("TL-VAR-TO-EL");

    private static final SubLSymbol $sym23$TL_VAR_ = makeSymbol("TL-VAR?");

    private static final SubLSymbol $sym24$TL_FUNCTION_TERM_ = makeSymbol("TL-FUNCTION-TERM?");

    private static final SubLSymbol TL_FUNCTION_TERM_TO_HL = makeSymbol("TL-FUNCTION-TERM-TO-HL");

    private static final SubLSymbol $ASSERTION_NOT_PRESENT = makeKeyword("ASSERTION-NOT-PRESENT");

    private static final SubLString $str28$formula__S_in_mt__S_cannot_be_fou = makeString("formula ~S in mt ~S cannot be found");

    private static final SubLSymbol $ASSERTION_NOT_LOCAL = makeKeyword("ASSERTION-NOT-LOCAL");

    private static final SubLString $str30$CNF__S_in_mt__S_is_not_locally_in = makeString("CNF ~S in mt ~S is not locally in the KB");

    // Definitions
    /**
     * Returns the TL (transcript level) formula of ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns the TL (transcript level) formula of ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns the TL (transcript level) formula of ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static final SubLObject assertion_tl_formula_alt(SubLObject assertion) {
        {
			SubLObject formulas = assertion_tl_formulas(assertion);
            if (NIL != list_utilities.singletonP(formulas)) {
                return formulas.first();
            } else {
                return simplifier.conjoin(formulas, UNPROVIDED);
            }
        }
    }

    // Definitions
    /**
     * Returns the TL (transcript level) formula of ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns the TL (transcript level) formula of ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns the TL (transcript level) formula of ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static SubLObject assertion_tl_formula(final SubLObject assertion) {
        final SubLObject formulas = assertion_tl_formulas(assertion);
        if (NIL != list_utilities.singletonP(formulas)) {
            return formulas.first();
        }
        return simplifier.conjoin(formulas, UNPROVIDED);
    }

    /**
     * Returns the TL (transcript level) ist formula of ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns the TL (transcript level) ist formula of ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns the TL (transcript level) ist formula of ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static final SubLObject assertion_tl_ist_formula_alt(SubLObject assertion) {
        {
			SubLObject formulas = assertion_tl_ist_formulas(assertion);
            if (NIL != list_utilities.singletonP(formulas)) {
                return formulas.first();
            } else {
                return simplifier.conjoin(formulas, UNPROVIDED);
            }
        }
    }

    /**
     * Returns the TL (transcript level) ist formula of ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns the TL (transcript level) ist formula of ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns the TL (transcript level) ist formula of ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static SubLObject assertion_tl_ist_formula(final SubLObject assertion) {
        final SubLObject formulas = assertion_tl_ist_formulas(assertion);
        if (NIL != list_utilities.singletonP(formulas)) {
            return formulas.first();
        }
        return simplifier.conjoin(formulas, UNPROVIDED);
    }

    public static final SubLObject convert_assertions_to_tl_ist_formulas_alt(SubLObject tree) {
        return transform_list_utilities.transform(tree, ASSERTION_P, ASSERTION_TL_IST_FORMULA, UNPROVIDED);
    }

    public static SubLObject convert_assertions_to_tl_ist_formulas(final SubLObject tree) {
        return transform_list_utilities.transform(tree, ASSERTION_P, ASSERTION_TL_IST_FORMULA, UNPROVIDED);
    }

    /**
     * Returns a list of TL (transcript level) formulas for ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns a list of TL (transcript level) formulas for ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns a list of TL (transcript level) formulas for ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static final SubLObject assertion_tl_formulas_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject siblings = sibling_tl_assertions(assertion);
            SubLObject multi_mtsP = NIL;
            SubLObject result = NIL;
            if (NIL == multi_mtsP) {
                {
                    SubLObject csome_list_var = siblings;
                    SubLObject sibling = NIL;
                    for (sibling = csome_list_var.first(); !((NIL != multi_mtsP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , sibling = csome_list_var.first()) {
                        multi_mtsP = makeBoolean(NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(sibling)));
                    }
                }
            }
            if (NIL != multi_mtsP) {
                {
                    SubLObject cdolist_list_var = siblings;
                    SubLObject sibling = NIL;
                    for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
						result = cons(assertion_tl_ist_formula_int(sibling), result);
                    }
                }
            } else {
                {
                    SubLObject cdolist_list_var = siblings;
                    SubLObject sibling = NIL;
                    for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
						result = cons(assertion_tl_formula_int(sibling), result);
                    }
                }
            }
            return nreverse(result);
        }
    }

    /**
     * Returns a list of TL (transcript level) formulas for ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns a list of TL (transcript level) formulas for ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns a list of TL (transcript level) formulas for ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static SubLObject assertion_tl_formulas(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject siblings = sibling_tl_assertions(assertion);
        SubLObject multi_mtsP = NIL;
        SubLObject result = NIL;
        if (NIL == multi_mtsP) {
            SubLObject csome_list_var;
            SubLObject sibling;
            for (csome_list_var = siblings, sibling = NIL, sibling = csome_list_var.first(); (NIL == multi_mtsP) && (NIL != csome_list_var); multi_mtsP = makeBoolean(NIL == hlmt.hlmt_equal(mt, assertions_high.assertion_mt(sibling))) , csome_list_var = csome_list_var.rest() , sibling = csome_list_var.first()) {
            }
        }
        if (NIL != multi_mtsP) {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = NIL;
            sibling = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(assertion_tl_ist_formula_int(sibling), result);
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = siblings;
            SubLObject sibling = NIL;
            sibling = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(assertion_tl_formula_int(sibling), result);
                cdolist_list_var = cdolist_list_var.rest();
                sibling = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    /**
     * Returns a list of TL (transcript level) ist formulas for ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns a list of TL (transcript level) ist formulas for ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns a list of TL (transcript level) ist formulas for ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static final SubLObject assertion_tl_ist_formulas_alt(SubLObject assertion) {
        {
            SubLObject result = NIL;
			SubLObject cdolist_list_var = sibling_tl_assertions(assertion);
            SubLObject sibling = NIL;
            for (sibling = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling = cdolist_list_var.first()) {
				result = cons(assertion_tl_ist_formula_int(sibling), result);
            }
            return nreverse(result);
        }
    }

    /**
     * Returns a list of TL (transcript level) ist formulas for ASSERTION
     * (sibling assertions (e.g., wrt skolems) are included)
     */
    @LispMethod(comment = "Returns a list of TL (transcript level) ist formulas for ASSERTION\r\n(sibling assertions (e.g., wrt skolems) are included)\nReturns a list of TL (transcript level) ist formulas for ASSERTION\n(sibling assertions (e.g., wrt skolems) are included)")
    public static SubLObject assertion_tl_ist_formulas(final SubLObject assertion) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sibling_tl_assertions(assertion);
        SubLObject sibling = NIL;
        sibling = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(assertion_tl_ist_formula_int(sibling), result);
            cdolist_list_var = cdolist_list_var.rest();
            sibling = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject sibling_tl_assertions_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject assertions = list(assertion);
            SubLObject cdolist_list_var = skolems.defn_assertion_skolems(assertion);
            SubLObject skolem = NIL;
            for (skolem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , skolem = cdolist_list_var.first()) {
                assertions = nunion(assertions, skolems.all_skolem_mt_defn_assertions(skolem, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
            return assertions;
        }
    }

    public static SubLObject sibling_tl_assertions(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject assertions = list(assertion);
        SubLObject cdolist_list_var = skolems.defn_assertion_skolems(assertion);
        SubLObject skolem = NIL;
        skolem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assertions = nunion(assertions, skolems.all_skolem_mt_defn_assertions(skolem, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            skolem = cdolist_list_var.first();
        } 
        return assertions;
    }

    public static final SubLObject assertion_tl_ist_formula_int_alt(SubLObject assertion) {
        {
			SubLObject tl_mt = transform_hl_terms_to_tl(assertions_high.assertion_mt(assertion));
			SubLObject tl_formula = assertion_tl_formula_int(assertion);
            return make_binary_formula($$ist, tl_mt, tl_formula);
        }
    }

    public static SubLObject assertion_tl_ist_formula_int(final SubLObject assertion) {
        final SubLObject tl_mt = transform_hl_terms_to_tl(assertions_high.assertion_mt(assertion));
        final SubLObject tl_formula = assertion_tl_formula_int(assertion);
        return make_binary_formula($$ist, tl_mt, tl_formula);
    }

    public static final SubLObject assertion_tl_formula_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $el_var_names$.currentBinding(thread);
                    try {
                        $el_var_names$.bind(assertions_high.assertion_variable_names(assertion), thread);
						result = clauses.cnf_formula(transform_hl_terms_to_tl(assertion_tl_cnf(assertion)), UNPROVIDED);
                    } finally {
                        $el_var_names$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject assertion_tl_formula_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $el_var_names$.currentBinding(thread);
        try {
            $el_var_names$.bind(assertions_high.assertion_variable_names(assertion), thread);
            result = clauses.cnf_formula(transform_hl_terms_to_tl(assertion_tl_cnf(assertion)), UNPROVIDED);
        } finally {
            $el_var_names$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject assertion_tl_cnf_alt(SubLObject assertion) {
        return assertions_high.assertion_cnf(assertion);
    }

    public static SubLObject assertion_tl_cnf(final SubLObject assertion) {
        return assertions_high.assertion_cnf(assertion);
    }

    public static final SubLObject transform_hl_terms_to_tl_alt(SubLObject tree) {
        return transform_list_utilities.quiescent_transform(tree, $sym3$HL_NOT_TL_TERM_, HL_TERM_TO_TL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transform_hl_terms_to_tl(final SubLObject tree) {
        return transform_list_utilities.quiescent_transform(tree, $sym3$HL_NOT_TL_TERM_, HL_TERM_TO_TL, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tl_encapsulate_alt(SubLObject tree) {
		return encapsulation.encapsulate(transform_hl_terms_to_tl(tree));
    }

    public static SubLObject tl_encapsulate(final SubLObject tree) {
        return encapsulation.encapsulate(transform_hl_terms_to_tl(tree));
    }

    /**
     * Return the single existing assertion (if any) specified by
     * TL (transcript level) formula TL-FORMULA in MT.
     */
    @LispMethod(comment = "Return the single existing assertion (if any) specified by\r\nTL (transcript level) formula TL-FORMULA in MT.\nReturn the single existing assertion (if any) specified by\nTL (transcript level) formula TL-FORMULA in MT.")
    public static final SubLObject find_assertion_from_tl_formula_alt(SubLObject tl_formula, SubLObject mt) {
        {
			SubLObject assertions = find_assertions_from_tl_formula(tl_formula, mt);
            if (NIL != list_utilities.singletonP(assertions)) {
                return assertions.first();
            }
        }
        return NIL;
    }

    /**
     * Return the single existing assertion (if any) specified by
     * TL (transcript level) formula TL-FORMULA in MT.
     */
    @LispMethod(comment = "Return the single existing assertion (if any) specified by\r\nTL (transcript level) formula TL-FORMULA in MT.\nReturn the single existing assertion (if any) specified by\nTL (transcript level) formula TL-FORMULA in MT.")
    public static SubLObject find_assertion_from_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        final SubLObject assertions = find_assertions_from_tl_formula(tl_formula, mt);
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertions.first();
        }
        return NIL;
    }

    /**
     * Return a list of existing assertions specificed by
     * TL (transcript level) formula TL-FORMULA in MT.
     */
    @LispMethod(comment = "Return a list of existing assertions specificed by\r\nTL (transcript level) formula TL-FORMULA in MT.\nReturn a list of existing assertions specificed by\nTL (transcript level) formula TL-FORMULA in MT.")
    public static final SubLObject find_assertions_from_tl_formula_alt(SubLObject tl_formula, SubLObject mt) {
        if (!$$and.eql(cycl_utilities.formula_arg0(tl_formula))) {
            {
				SubLObject assertion = find_assertion_from_tl_cnf_formula(tl_formula, mt);
                if (NIL != assertion) {
                    return list(assertion);
                }
            }
        } else {
            {
                SubLObject sibling_specs = cycl_utilities.formula_args(tl_formula, UNPROVIDED);
                SubLObject first_sibling = sibling_specs.first();
                SubLObject assertions = NIL;
                if (!$$ist.eql(cycl_utilities.formula_arg0(first_sibling))) {
                    {
                        SubLObject cdolist_list_var = sibling_specs;
                        SubLObject sibling_spec = NIL;
                        for (sibling_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_spec = cdolist_list_var.first()) {
                            {
								SubLObject assertion = find_assertion_from_tl_cnf_formula(sibling_spec, mt);
                                if (NIL != assertion) {
                                    assertions = cons(assertion, assertions);
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = sibling_specs;
                        SubLObject sibling_spec = NIL;
                        for (sibling_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_spec = cdolist_list_var.first()) {
                            {
								SubLObject assertion = find_assertion_from_tl_cnf_ist_formula(sibling_spec);
                                if (NIL != assertion) {
                                    assertions = cons(assertion, assertions);
                                }
                            }
                        }
                    }
                }
                return nreverse(assertions);
            }
        }
        return NIL;
    }

    /**
     * Return a list of existing assertions specificed by
     * TL (transcript level) formula TL-FORMULA in MT.
     */
    @LispMethod(comment = "Return a list of existing assertions specificed by\r\nTL (transcript level) formula TL-FORMULA in MT.\nReturn a list of existing assertions specificed by\nTL (transcript level) formula TL-FORMULA in MT.")
    public static SubLObject find_assertions_from_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        if ($$and.eql(cycl_utilities.formula_arg0(tl_formula))) {
            final SubLObject sibling_specs = cycl_utilities.formula_args(tl_formula, UNPROVIDED);
            final SubLObject first_sibling = sibling_specs.first();
            SubLObject assertions = NIL;
            if (!$$ist.eql(cycl_utilities.formula_arg0(first_sibling))) {
                SubLObject cdolist_list_var = sibling_specs;
                SubLObject sibling_spec = NIL;
                sibling_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion = find_assertion_from_tl_cnf_formula(sibling_spec, mt);
                    if (NIL != assertion) {
                        assertions = cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_spec = cdolist_list_var.first();
                } 
            } else {
                SubLObject cdolist_list_var = sibling_specs;
                SubLObject sibling_spec = NIL;
                sibling_spec = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject assertion = find_assertion_from_tl_cnf_ist_formula(sibling_spec);
                    if (NIL != assertion) {
                        assertions = cons(assertion, assertions);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    sibling_spec = cdolist_list_var.first();
                } 
            }
            return nreverse(assertions);
        }
        final SubLObject assertion2 = find_assertion_from_tl_cnf_formula(tl_formula, mt);
        if (NIL != assertion2) {
            return list(assertion2);
        }
        return NIL;
    }

    public static final SubLObject find_assertion_from_tl_cnf_ist_formula_alt(SubLObject tl_cnf_ist_formula) {
        {
			SubLObject mt = tl_term_to_hl(cycl_utilities.formula_arg1(tl_cnf_ist_formula, UNPROVIDED));
            SubLObject tl_cnf_formula = cycl_utilities.formula_arg2(tl_cnf_ist_formula, UNPROVIDED);
			return find_assertion_from_tl_cnf_formula(tl_cnf_formula, mt);
        }
    }

    public static SubLObject find_assertion_from_tl_cnf_ist_formula(final SubLObject tl_cnf_ist_formula) {
        final SubLObject mt = tl_term_to_hl(cycl_utilities.formula_arg1(tl_cnf_ist_formula, UNPROVIDED));
        final SubLObject tl_cnf_formula = cycl_utilities.formula_arg2(tl_cnf_ist_formula, UNPROVIDED);
        return find_assertion_from_tl_cnf_formula(tl_cnf_formula, mt);
    }

    public static final SubLObject find_assertion_from_tl_cnf_formula_alt(SubLObject tl_cnf_formula, SubLObject tl_mt) {
        {
			SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_cnf_formula);
			SubLObject v_hlmt = tlmt_to_hlmt(tl_mt);
            if (NIL != hlmt.hlmt_p(v_hlmt)) {
                return kb_indexing.find_assertion(hl_cnf, v_hlmt);
            }
        }
        return NIL;
    }

    public static SubLObject find_assertion_from_tl_cnf_formula(final SubLObject tl_cnf_formula, final SubLObject tl_mt) {
        final SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_cnf_formula);
        final SubLObject v_hlmt = tlmt_to_hlmt(tl_mt);
        if (NIL != hlmt.hlmt_p(v_hlmt)) {
            return kb_indexing.find_assertion(hl_cnf, v_hlmt);
        }
        return NIL;
    }

    public static final SubLObject tl_formula_to_hl_cnf_alt(SubLObject tl_formula) {
		return tl_formula_to_cnf_int(transform_tl_terms_to_hl(tl_formula));
    }

    public static SubLObject tl_formula_to_hl_cnf(final SubLObject tl_formula) {
        return tl_formula_to_cnf_int(transform_tl_terms_to_hl(tl_formula));
    }

    public static final SubLObject tlmt_to_hlmt_alt(SubLObject tl_mt) {
		return transform_tl_terms_to_hl(tl_mt);
    }

    public static SubLObject tlmt_to_hlmt(final SubLObject tl_mt) {
        return transform_tl_terms_to_hl(tl_mt);
    }

    public static final SubLObject transform_tl_terms_to_hl_alt(SubLObject tree) {
        return transform_list_utilities.quiescent_transform(tree, $sym6$TL_TERM_, TL_TERM_TO_HL, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transform_tl_terms_to_hl(SubLObject tree) {
        if ((NIL != cycl_utilities.expression_find_if($sym6$TL_TERM_, tree, UNPROVIDED, UNPROVIDED)) || (NIL != cycl_utilities.expression_find($$TLVariableFn, tree, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            tree = transform_list_utilities.quiescent_transform(tree, $sym6$TL_TERM_, TL_TERM_TO_HL, UNPROVIDED, UNPROVIDED);
        }
        return tree;
    }

    public static final SubLObject tl_formula_to_cnf_int_alt(SubLObject formula) {
        {
            SubLObject pcase_var = cycl_utilities.formula_operator(formula);
            if (pcase_var.eql($$implies)) {
                {
                    SubLObject neg_lits = (NIL != el_conjunction_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))) ? ((SubLObject) (cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED))) : list(cycl_utilities.formula_arg1(formula, UNPROVIDED));
                    SubLObject pos_lits = (NIL != el_disjunction_p(cycl_utilities.formula_arg2(formula, UNPROVIDED))) ? ((SubLObject) (cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED))) : list(cycl_utilities.formula_arg2(formula, UNPROVIDED));
                    return clauses.make_cnf(neg_lits, pos_lits);
                }
            } else {
                if (pcase_var.eql($$or)) {
                    return clauses.make_cnf(NIL, cycl_utilities.formula_args(formula, UNPROVIDED));
                } else {
                    if (pcase_var.eql($$not)) {
                        return clauses.make_cnf(NIL != el_conjunction_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)) ? ((SubLObject) (cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED))) : cycl_utilities.formula_args(formula, UNPROVIDED), NIL);
                    } else {
                        return clauses.make_cnf(NIL, list(formula));
                    }
                }
            }
        }
    }

    public static SubLObject tl_formula_to_cnf_int(final SubLObject formula) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(formula);
        if (pcase_var.eql($$implies)) {
            final SubLObject neg_lits = (NIL != el_conjunction_p(cycl_utilities.formula_arg1(formula, UNPROVIDED))) ? cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED) : list(cycl_utilities.formula_arg1(formula, UNPROVIDED));
            final SubLObject pos_lits = (NIL != el_disjunction_p(cycl_utilities.formula_arg2(formula, UNPROVIDED))) ? cycl_utilities.formula_args(cycl_utilities.formula_arg2(formula, UNPROVIDED), UNPROVIDED) : list(cycl_utilities.formula_arg2(formula, UNPROVIDED));
            return clauses.make_cnf(neg_lits, pos_lits);
        }
        if (pcase_var.eql($$or)) {
            return clauses.make_cnf(NIL, cycl_utilities.formula_args(formula, UNPROVIDED));
        }
        if (pcase_var.eql($$not)) {
            return clauses.make_cnf(NIL != el_conjunction_p(cycl_utilities.formula_arg1(formula, UNPROVIDED)) ? cycl_utilities.formula_args(cycl_utilities.formula_arg1(formula, UNPROVIDED), UNPROVIDED) : cycl_utilities.formula_args(formula, UNPROVIDED), NIL);
        }
        return clauses.make_cnf(NIL, list(formula));
    }

    public static final SubLObject tl_termP_alt(SubLObject v_object) {
		return makeBoolean(((NIL != tl_assertion_termP(v_object)) || (NIL != tl_function_termP(v_object)))
				|| (NIL != tl_varP(v_object)));
    }

    public static SubLObject tl_termP(final SubLObject v_object) {
        return makeBoolean(((NIL != tl_assertion_termP(v_object)) || (NIL != tl_function_termP(v_object))) || (NIL != tl_varP(v_object)));
    }

    public static final SubLObject tl_assertion_termP_alt(SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLAssertionFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.naut_arg2(v_object, UNPROVIDED);
                return makeBoolean((NIL != possibly_fo_represented_term_p(arg1)) && (NIL != el_formula_p(arg2)));
            }
        }
        return NIL;
    }

    public static SubLObject tl_assertion_termP(final SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLAssertionFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.naut_arg2(v_object, UNPROVIDED);
            return makeBoolean((NIL != possibly_fo_represented_term_p(arg1)) && (NIL != el_formula_p(arg2)));
        }
        return NIL;
    }

    public static final SubLObject tl_function_termP_alt(SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLReifiedNatFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, ONE_INTEGER, UNPROVIDED))) {
            {
                SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
                return possibly_naut_p(arg1);
            }
        }
        return NIL;
    }

    public static SubLObject tl_function_termP(final SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLReifiedNatFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, ONE_INTEGER, UNPROVIDED))) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
            return possibly_naut_p(arg1);
        }
        return NIL;
    }

    public static final SubLObject tl_varP_alt(SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLVariableFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) {
            {
                SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.naut_arg2(v_object, UNPROVIDED);
                return makeBoolean(arg1.isInteger() && (arg2.isString() || (NIL == arg2)));
            }
        }
        return NIL;
    }

    public static SubLObject tl_varP(final SubLObject v_object) {
        if (((NIL != possibly_naut_p(v_object)) && $$TLVariableFn.eql(cycl_utilities.naut_functor(v_object))) && (NIL != el_formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) {
            final SubLObject arg1 = cycl_utilities.naut_arg1(v_object, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.naut_arg2(v_object, UNPROVIDED);
            return makeBoolean(arg1.isInteger() && (arg2.isString() || (NIL == arg2)));
        }
        return NIL;
    }

    public static final SubLObject hl_not_tl_termP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != variables.variable_p(v_object)));
    }

    public static SubLObject hl_not_tl_termP(final SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) || (NIL != nart_handles.nart_p(v_object))) || (NIL != variables.variable_p(v_object)));
    }

    public static final SubLObject hl_term_to_tl_alt(SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
			return hl_assertion_term_to_tl(v_object);
        } else {
            if (NIL != nart_handles.nart_p(v_object)) {
				return hl_function_term_to_tl(v_object);
            } else {
                if (NIL != variables.variable_p(v_object)) {
					return hl_var_to_tl(v_object, UNPROVIDED);
                }
            }
        }
        return v_object;
    }

    public static SubLObject hl_term_to_tl(final SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return hl_assertion_term_to_tl(v_object);
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return hl_function_term_to_tl(v_object);
        }
        if (NIL != variables.variable_p(v_object)) {
            return hl_var_to_tl(v_object, UNPROVIDED);
        }
        return v_object;
    }

    public static final SubLObject hl_assertion_term_to_tl_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject tl_formula = assertion_tl_formula_int(assertion);
			SubLObject tl_mt = transform_hl_terms_to_tl(mt);
			if (!assertion.eql(find_assertion_from_tl_formula(tl_formula, mt))) {
                el_error(THREE_INTEGER, $str_alt14$referenced_assertion_not_found___, assertion, UNPROVIDED, UNPROVIDED);
            }
            return make_binary_formula($$TLAssertionFn, tl_mt, tl_formula);
        }
    }

    public static SubLObject hl_assertion_term_to_tl(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject tl_formula = assertion_tl_formula_int(assertion);
        final SubLObject tl_mt = transform_hl_terms_to_tl(mt);
        if (!assertion.eql(find_assertion_from_tl_formula(tl_formula, mt))) {
            el_error(THREE_INTEGER, $str14$referenced_assertion_not_found___, assertion, UNPROVIDED, UNPROVIDED);
        }
        return make_binary_formula($$TLAssertionFn, tl_mt, tl_formula);
    }

    public static final SubLObject hl_function_term_to_tl_alt(SubLObject nart) {
        {
            SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
            if (!((NIL != term.hl_ground_nautP(nart_hl_formula)) && nart.eql(narts_high.find_nart(nart_hl_formula)))) {
                el_error(THREE_INTEGER, $str_alt15$referenced_function_not_found____, nart, UNPROVIDED, UNPROVIDED);
            }
            return make_unary_formula($$TLReifiedNatFn, nart_hl_formula);
        }
    }

    public static SubLObject hl_function_term_to_tl(final SubLObject nart) {
        final SubLObject nart_hl_formula = narts_high.nart_hl_formula(nart);
        if ((NIL == term.hl_ground_nautP(nart_hl_formula)) || (!nart.eql(narts_high.find_nart(nart_hl_formula)))) {
            el_error(THREE_INTEGER, $str15$referenced_function_not_found____, nart, UNPROVIDED, UNPROVIDED);
        }
        return make_unary_formula($$TLReifiedNatFn, nart_hl_formula);
    }

    public static final SubLObject hl_var_to_tl_alt(SubLObject hl_var, SubLObject el_var_names) {
        if (el_var_names == UNPROVIDED) {
            el_var_names = $el_var_names$.getDynamicValue();
        }
        {
            SubLObject id = variables.variable_id(hl_var);
            SubLObject name = (id.isInteger()) ? ((SubLObject) (nth(id, el_var_names))) : NIL;
            return make_binary_formula($$TLVariableFn, id, name);
        }
    }

    public static SubLObject hl_var_to_tl(final SubLObject hl_var, SubLObject el_var_names) {
        if (el_var_names == UNPROVIDED) {
            el_var_names = $el_var_names$.getDynamicValue();
        }
        final SubLObject id = variables.variable_id(hl_var);
        final SubLObject name = (id.isInteger()) ? nth(id, el_var_names) : NIL;
        return make_binary_formula($$TLVariableFn, id, name);
    }

    /**
     * Return an expression which, if evaluated, would return OBJECT.
     * Quotes HL things that are going to be turned into lists at the TL.
     */
    @LispMethod(comment = "Return an expression which, if evaluated, would return OBJECT.\r\nQuotes HL things that are going to be turned into lists at the TL.\nReturn an expression which, if evaluated, would return OBJECT.\nQuotes HL things that are going to be turned into lists at the TL.")
    public static final SubLObject tl_quotify_alt(SubLObject v_object) {
		if ((NIL != list_utilities.self_evaluating_form_p(v_object)) && (NIL == hl_not_tl_termP(v_object))) {
            return v_object;
        } else {
            return list(QUOTE, v_object);
        }
    }

    @LispMethod(comment = "Return an expression which, if evaluated, would return OBJECT.\r\nQuotes HL things that are going to be turned into lists at the TL.\nReturn an expression which, if evaluated, would return OBJECT.\nQuotes HL things that are going to be turned into lists at the TL.")
    public static SubLObject tl_quotify(final SubLObject v_object) {
        if ((NIL != list_utilities.self_evaluating_form_p(v_object)) && (NIL == hl_not_tl_termP(v_object))) {
            return v_object;
        }
        return list(QUOTE, v_object);
    }

    public static final SubLObject tl_term_to_hl_alt(SubLObject v_object) {
		if (NIL != tl_assertion_termP(v_object)) {
			return tl_assertion_term_to_hl(v_object);
        } else {
			if (NIL != tl_function_termP(v_object)) {
				return tl_function_term_to_hl(v_object);
            } else {
				if (NIL != tl_varP(v_object)) {
					return tl_var_to_hl(v_object);
                }
            }
        }
        return v_object;
    }

    public static SubLObject tl_term_to_hl(final SubLObject v_object) {
        if (NIL != tl_assertion_termP(v_object)) {
            return tl_assertion_term_to_hl(v_object);
        }
        if (NIL != tl_function_termP(v_object)) {
            return tl_function_term_to_hl(v_object);
        }
        if (NIL != tl_varP(v_object)) {
            return tl_var_to_hl(v_object);
        }
        return v_object;
    }

    public static final SubLObject tl_assertion_term_to_hl_alt(SubLObject tl_assertion_term) {
        {
            SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, UNPROVIDED);
			SubLObject mt = tl_term_to_hl(cycl_utilities.nat_arg1(tl_assertion_term, UNPROVIDED));
			SubLObject assertion = find_assertion_from_tl_formula(tl_formula, mt);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                return assertion;
            }
            el_error(THREE_INTEGER, $str_alt17$referenced_TL_assertion_not_found, tl_assertion_term, UNPROVIDED, UNPROVIDED);
			return tl_assertion_term_to_el(tl_assertion_term);
        }
    }

    public static SubLObject tl_assertion_term_to_hl(final SubLObject tl_assertion_term) {
        final SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, UNPROVIDED);
        final SubLObject mt = tl_term_to_hl(cycl_utilities.nat_arg1(tl_assertion_term, UNPROVIDED));
        final SubLObject assertion = find_assertion_from_tl_formula(tl_formula, mt);
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return assertion;
        }
        el_error(THREE_INTEGER, $str17$referenced_TL_assertion_not_found, tl_assertion_term, UNPROVIDED, UNPROVIDED);
        return tl_assertion_term_to_el(tl_assertion_term);
    }

    public static final SubLObject tl_function_term_to_hl_alt(SubLObject tl_function_term) {
        {
            SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, UNPROVIDED);
			SubLObject nart = tl_find_nart(nat_spec);
            if (NIL != nart_handles.nart_p(nart)) {
                return nart;
            }
            el_error(THREE_INTEGER, $str_alt18$referenced_TL_nart_not_found_____, tl_function_term, UNPROVIDED, UNPROVIDED);
			return tl_function_term_to_el(tl_function_term);
        }
    }

    public static SubLObject tl_function_term_to_hl(final SubLObject tl_function_term) {
        final SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, UNPROVIDED);
        final SubLObject nart = tl_find_nart(nat_spec);
        if (NIL != nart_handles.nart_p(nart)) {
            return nart;
        }
        el_error(THREE_INTEGER, $str18$referenced_TL_nart_not_found_____, tl_function_term, UNPROVIDED, UNPROVIDED);
        return tl_function_term_to_el(tl_function_term);
    }

    public static final SubLObject tl_var_to_hl_alt(SubLObject tl_var) {
        {
            SubLObject id = cycl_utilities.nat_arg1(tl_var, UNPROVIDED);
            if (id.isInteger()) {
                return variables.find_variable_by_id(id);
            } else {
                return tl_var;
            }
        }
    }

    public static SubLObject tl_var_to_hl(final SubLObject tl_var) {
        final SubLObject id = cycl_utilities.nat_arg1(tl_var, UNPROVIDED);
        if (id.isInteger()) {
            return variables.find_variable_by_id(id);
        }
        return tl_var;
    }

    public static final SubLObject tl_term_to_el_alt(SubLObject v_object) {
		if (NIL != tl_assertion_termP(v_object)) {
			return tl_assertion_term_to_el(v_object);
        } else {
			if (NIL != tl_function_termP(v_object)) {
				return tl_function_term_to_el(v_object);
            } else {
				if (NIL != tl_varP(v_object)) {
					return tl_var_to_el(v_object);
                }
            }
        }
        return v_object;
    }

    public static SubLObject tl_term_to_el(final SubLObject v_object) {
        if (NIL != tl_assertion_termP(v_object)) {
            return tl_assertion_term_to_el(v_object);
        }
        if (NIL != tl_function_termP(v_object)) {
            return tl_function_term_to_el(v_object);
        }
        if (NIL != tl_varP(v_object)) {
            return tl_var_to_el(v_object);
        }
        return v_object;
    }

    /**
     * #$expansionDefn for #$TLAssertionFn
     */
    @LispMethod(comment = "#$expansionDefn for #$TLAssertionFn")
    public static final SubLObject tl_assertion_term_to_el_alt(SubLObject tl_assertion_term) {
        {
            SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, UNPROVIDED);
			SubLObject mt = tl_term_to_el(cycl_utilities.nat_arg1(tl_assertion_term, UNPROVIDED));
            return values(make_binary_formula($$ist, mt, tl_formula), mt_vars.$ist_mt$.getGlobalValue());
        }
    }

    /**
     * #$expansionDefn for #$TLAssertionFn
     */
    @LispMethod(comment = "#$expansionDefn for #$TLAssertionFn")
    public static SubLObject tl_assertion_term_to_el(final SubLObject tl_assertion_term) {
        final SubLObject tl_formula = cycl_utilities.nat_arg2(tl_assertion_term, UNPROVIDED);
        final SubLObject mt = tl_term_to_el(cycl_utilities.nat_arg1(tl_assertion_term, UNPROVIDED));
        return values(make_binary_formula($$ist, mt, tl_formula), mt_vars.$ist_mt$.getGlobalValue());
    }

    /**
     * #$expansionDefn for #$TLReifiedNatFn
     */
    @LispMethod(comment = "#$expansionDefn for #$TLReifiedNatFn")
    public static final SubLObject tl_function_term_to_el_alt(SubLObject tl_function_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, UNPROVIDED);
                SubLObject nat = NIL;
                if (NIL != term.closed_nautP(nat_spec, UNPROVIDED)) {
                    nat = nat_spec;
                } else {
                    if ((NIL != nart_handles.nart_p(nat_spec)) && (NIL != narts_high.nart_hl_formula(nat_spec))) {
                        nat = narts_high.nart_hl_formula(nat_spec);
                    }
                }
                if (NIL != nat) {
                    return values(nat, mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    return values(nat_spec, mt_relevance_macros.$mt$.getDynamicValue(thread));
                }
            }
        }
    }

    /**
     * #$expansionDefn for #$TLReifiedNatFn
     */
    @LispMethod(comment = "#$expansionDefn for #$TLReifiedNatFn")
    public static SubLObject tl_function_term_to_el(final SubLObject tl_function_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nat_spec = cycl_utilities.nat_arg1(tl_function_term, UNPROVIDED);
        SubLObject nat = NIL;
        if (NIL != term.closed_nautP(nat_spec, UNPROVIDED)) {
            nat = nat_spec;
        } else
            if ((NIL != nart_handles.nart_p(nat_spec)) && (NIL != narts_high.nart_hl_formula(nat_spec))) {
                nat = narts_high.nart_hl_formula(nat_spec);
            }

        if (NIL != nat) {
            return values(nat, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return values(nat_spec, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    /**
     * #$expansionDefn for #$TLVariableFn
     */
    @LispMethod(comment = "#$expansionDefn for #$TLVariableFn")
    public static final SubLObject tl_var_to_el_alt(SubLObject tl_var) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject name = cycl_utilities.nat_arg2(tl_var, UNPROVIDED);
                if (name.isString()) {
                    return values(cycl_variables.make_el_var(name), mt_relevance_macros.$mt$.getDynamicValue(thread));
                } else {
                    return values(tl_var, mt_relevance_macros.$mt$.getDynamicValue(thread));
                }
            }
        }
    }

    @LispMethod(comment = "#$expansionDefn for #$TLVariableFn")
    public static SubLObject tl_var_to_el(final SubLObject tl_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject name = cycl_utilities.nat_arg2(tl_var, UNPROVIDED);
        if (name.isString()) {
            return values(cycl_variables.make_el_var(name), mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return values(tl_var, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }/**
     * #$expansionDefn for #$TLVariableFn
     */


    /**
     * Return the NART implementing lispy NAT-SPEC, or NIL if none is present.
     * Substitutions for sub-NATs are performed.
     */
    @LispMethod(comment = "Return the NART implementing lispy NAT-SPEC, or NIL if none is present.\r\nSubstitutions for sub-NATs are performed.\nReturn the NART implementing lispy NAT-SPEC, or NIL if none is present.\nSubstitutions for sub-NATs are performed.")
    public static final SubLObject tl_find_nart_alt(SubLObject nat_spec) {
        {
			SubLObject nart = tl_nart_substitute(nat_spec);
            return NIL != nart_handles.nart_p(nart) ? ((SubLObject) (nart)) : NIL;
        }
    }

    @LispMethod(comment = "Return the NART implementing lispy NAT-SPEC, or NIL if none is present.\r\nSubstitutions for sub-NATs are performed.\nReturn the NART implementing lispy NAT-SPEC, or NIL if none is present.\nSubstitutions for sub-NATs are performed.")
    public static SubLObject tl_find_nart(final SubLObject nat_spec) {
        final SubLObject nart = tl_nart_substitute(nat_spec);
        return NIL != nart_handles.nart_p(nart) ? nart : NIL;
    }/**
     * Return the NART implementing lispy NAT-SPEC, or NIL if none is present.
     * Substitutions for sub-NATs are performed.
     */


    /**
     * Substitute into lispy NAT-FORMULA as many reified NATs as possible.
     * If the entire NAT can be substituted, it will
     */
    @LispMethod(comment = "Substitute into lispy NAT-FORMULA as many reified NATs as possible.\r\nIf the entire NAT can be substituted, it will\nSubstitute into lispy NAT-FORMULA as many reified NATs as possible.\nIf the entire NAT can be substituted, it will")
    public static final SubLObject tl_nart_substitute_alt(SubLObject nat_formula) {
        if (NIL != list_utilities.not_any_in_list(symbol_function(CONSP), nat_formula, UNPROVIDED)) {
            {
                SubLObject nart = narts_high.nart_lookup(nat_formula);
                return NIL != nart_handles.nart_p(nart) ? ((SubLObject) (nart)) : nat_formula;
            }
        } else {
            {
                SubLObject new_nat_formula = copy_list(nat_formula);
                SubLObject list = NIL;
                SubLObject arg = NIL;
                for (list = new_nat_formula, arg = list.first(); NIL != list; list = list.rest() , arg = list.first()) {
					if (NIL != tl_function_termP(arg)) {
                        {
							SubLObject sub_nart = tl_function_term_to_hl(arg);
                            if (NIL != sub_nart) {
                                rplaca(list, sub_nart);
                            }
                        }
                    } else {
                        if (NIL != function_terms.nat_formula_p(arg)) {
                            {
								SubLObject sub_nart = tl_nart_substitute(arg);
                                if (NIL != sub_nart) {
                                    rplaca(list, sub_nart);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject nart = narts_high.nart_lookup(new_nat_formula);
                    return NIL != nart_handles.nart_p(nart) ? ((SubLObject) (nart)) : new_nat_formula;
                }
            }
        }
    }

    /**
     * Substitute into lispy NAT-FORMULA as many reified NATs as possible.
     * If the entire NAT can be substituted, it will
     */
    @LispMethod(comment = "Substitute into lispy NAT-FORMULA as many reified NATs as possible.\r\nIf the entire NAT can be substituted, it will\nSubstitute into lispy NAT-FORMULA as many reified NATs as possible.\nIf the entire NAT can be substituted, it will")
    public static SubLObject tl_nart_substitute(final SubLObject nat_formula) {
        if (NIL != list_utilities.not_any_in_list(symbol_function(CONSP), nat_formula, UNPROVIDED)) {
            final SubLObject nart = narts_high.nart_lookup(nat_formula);
            return NIL != nart_handles.nart_p(nart) ? nart : nat_formula;
        }
        final SubLObject new_nat_formula = copy_list(nat_formula);
        SubLObject list = NIL;
        SubLObject arg = NIL;
        list = new_nat_formula;
        arg = list.first();
        while (NIL != list) {
            if (NIL != tl_function_termP(arg)) {
                final SubLObject sub_nart = tl_function_term_to_hl(arg);
                if (NIL != sub_nart) {
                    rplaca(list, sub_nart);
                }
            } else
                if (NIL != function_terms.nat_formula_p(arg)) {
                    final SubLObject sub_nart = tl_nart_substitute(arg);
                    if (NIL != sub_nart) {
                        rplaca(list, sub_nart);
                    }
                }

            list = list.rest();
            arg = list.first();
        } 
        final SubLObject nart2 = narts_high.nart_lookup(new_nat_formula);
        return NIL != nart_handles.nart_p(nart2) ? nart2 : new_nat_formula;
    }

    public static SubLObject tl_var_to_el_var_transform(final SubLObject v_object) {
        return cycl_utilities.expression_transform(v_object, $sym23$TL_VAR_, TL_VAR_TO_EL, T, UNPROVIDED);
    }

    public static SubLObject tl_nart_transform(final SubLObject v_object) {
        return cycl_utilities.expression_transform(v_object, $sym24$TL_FUNCTION_TERM_, TL_FUNCTION_TERM_TO_HL, T, UNPROVIDED);
    }

    /**
     * Return T iff ASSERTION is findable via its TL formula.
     */
    @LispMethod(comment = "Return T iff ASSERTION is findable via its TL formula.")
    public static final SubLObject assertion_findable_via_tlP_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject tl_formula = assertion_tl_formula(assertion);
            SubLObject assertions_found_via_tl = ke.find_assertions_via_tl(tl_formula, mt);
            return subl_promotions.memberP(assertion, assertions_found_via_tl, UNPROVIDED, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Return T iff ASSERTION is findable via its TL formula.")
    public static SubLObject assertion_findable_via_tlP(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject tl_formula = assertion_tl_formula(assertion);
        final SubLObject assertions_found_via_tl = ke.find_assertions_via_tl(tl_formula, mt);
        return subl_promotions.memberP(assertion, assertions_found_via_tl, UNPROVIDED, UNPROVIDED);
    }/**
     * Return T iff ASSERTION is findable via its TL formula.
     */


    public static final SubLObject assertion_unassertible_via_tlP_alt(SubLObject assertion) {
        {
            SubLObject foundP = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
								SubLObject tl_formula = assertion_tl_formula(assertion);
                                SubLObject mt = assertions_high.assertion_mt(assertion);
								SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_formula);
                                SubLObject found_assertion = (NIL != hl_cnf) ? ((SubLObject) (kb_indexing.find_assertion(hl_cnf, mt))) : NIL;
                                if (NIL != found_assertion) {
                                    foundP = eql(assertion, found_assertion);
                                } else {
									foundP = list_utilities.sets_equalP(sibling_tl_assertions(assertion),
											find_assertions_from_tl_formula(tl_formula, mt), UNPROVIDED);
                                }
                            }
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
            if (NIL == error_message) {
                return foundP;
            }
        }
        return NIL;
    }

    public static SubLObject assertion_unassertible_via_tlP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject tl_formula = assertion_tl_formula(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject hl_cnf = tl_formula_to_hl_cnf(tl_formula);
                    final SubLObject found_assertion = (NIL != hl_cnf) ? kb_indexing.find_assertion(hl_cnf, mt) : NIL;
                    if (NIL != found_assertion) {
                        foundP = eql(assertion, found_assertion);
                    } else {
                        foundP = list_utilities.sets_equalP(sibling_tl_assertions(assertion), find_assertions_from_tl_formula(tl_formula, mt), UNPROVIDED);
                    }
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
        if (NIL == error_message) {
            return foundP;
        }
        return NIL;
    }

    public static final SubLObject assertion_unassertible_via_tl_fastP_alt(SubLObject assertion) {
        {
            SubLObject foundP = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
							foundP = eql(assertion,
									kb_indexing.find_assertion(tl_formula_to_hl_cnf(assertion_tl_formula(assertion)),
											assertions_high.assertion_mt(assertion)));
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
            if (NIL == error_message) {
                return foundP;
            }
        }
        return NIL;
    }

    public static SubLObject assertion_unassertible_via_tl_fastP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    foundP = eql(assertion, kb_indexing.find_assertion(tl_formula_to_hl_cnf(assertion_tl_formula(assertion)), assertions_high.assertion_mt(assertion)));
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
        if (NIL == error_message) {
            return foundP;
        }
        return NIL;
    }

    public static final SubLObject duplicate_assertionP_alt(SubLObject assertion) {
        {
            SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject cnf_assertions = kb_indexing.find_all_assertions(cnf);
            SubLObject duplicateP = NIL;
            if (NIL == duplicateP) {
                {
                    SubLObject csome_list_var = cnf_assertions;
                    SubLObject cnf_assertion = NIL;
                    for (cnf_assertion = csome_list_var.first(); !((NIL != duplicateP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cnf_assertion = csome_list_var.first()) {
                        if (!assertion.eql(cnf_assertion)) {
                            duplicateP = hlmt.hlmt_equal(mt, assertions_high.assertion_mt(cnf_assertion));
                        }
                    }
                }
            }
            return duplicateP;
        }
    }

    public static SubLObject duplicate_assertionP(final SubLObject assertion) {
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf_assertions = kb_indexing.find_all_assertions(cnf);
        SubLObject duplicateP = NIL;
        if (NIL == duplicateP) {
            SubLObject csome_list_var = cnf_assertions;
            SubLObject cnf_assertion = NIL;
            cnf_assertion = csome_list_var.first();
            while ((NIL == duplicateP) && (NIL != csome_list_var)) {
                if (!assertion.eql(cnf_assertion)) {
                    duplicateP = hlmt.hlmt_equal(mt, assertions_high.assertion_mt(cnf_assertion));
                }
                csome_list_var = csome_list_var.rest();
                cnf_assertion = csome_list_var.first();
            } 
        }
        return duplicateP;
    }

    public static final SubLObject unassert_assertion_via_tl_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
			SubLObject cdolist_list_var = assertion_tl_formulas(assertion);
            SubLObject tl_formula = NIL;
            for (tl_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tl_formula = cdolist_list_var.first()) {
				return unassert_tl_formula(tl_formula, mt);
            }
        }
        return NIL;
    }

    public static SubLObject unassert_assertion_via_tl(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cdolist_list_var = assertion_tl_formulas(assertion);
        SubLObject tl_formula = NIL;
        tl_formula = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            return unassert_tl_formula(tl_formula, mt);
        }
        return NIL;
    }

    public static final SubLObject unassert_tl_formula_alt(SubLObject tl_formula, SubLObject mt) {
        {
            SubLObject ans = NIL;
			SubLObject already_thereP = find_assertion_from_tl_formula(tl_formula, mt);
            if (NIL == already_thereP) {
                fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str_alt25$formula__S_in_mt__S_cannot_be_fou, tl_formula, mt));
            } else {
                {
                    SubLObject asserted_argument = assertions_high.get_asserted_argument(already_thereP);
                    if (NIL == asserted_argument) {
                        fi.signal_fi_warning(list($ASSERTION_NOT_LOCAL, $str_alt27$CNF__S_in_mt__S_is_not_locally_in, tl_formula, mt));
                    } else {
                        tms.tms_remove_argument(asserted_argument, already_thereP);
                    }
                }
            }
            ans = makeBoolean(NIL == fi.fi_error_signaledP());
            if (NIL == fi.fi_error_signaledP()) {
                forward.perform_forward_inference();
            }
            return ans;
        }
    }

    public static SubLObject unassert_tl_formula(final SubLObject tl_formula, final SubLObject mt) {
        SubLObject ans = NIL;
        final SubLObject already_thereP = find_assertion_from_tl_formula(tl_formula, mt);
        if (NIL == already_thereP) {
            fi.signal_fi_warning(list($ASSERTION_NOT_PRESENT, $str28$formula__S_in_mt__S_cannot_be_fou, tl_formula, mt));
        } else {
            final SubLObject asserted_argument = assertions_high.get_asserted_argument(already_thereP);
            if (NIL == asserted_argument) {
                fi.signal_fi_warning(list($ASSERTION_NOT_LOCAL, $str30$CNF__S_in_mt__S_is_not_locally_in, tl_formula, mt));
            } else {
                tms.tms_remove_argument(asserted_argument, already_thereP, UNPROVIDED);
            }
        }
        ans = makeBoolean(NIL == fi.fi_error_signaledP());
        if (NIL == fi.fi_error_signaledP()) {
            forward.perform_forward_inference();
        }
        return ans;
    }

    public static SubLObject declare_canon_tl_file() {
        declareFunction("assertion_tl_formula", "ASSERTION-TL-FORMULA", 1, 0, false);
        declareFunction("assertion_tl_ist_formula", "ASSERTION-TL-IST-FORMULA", 1, 0, false);
        declareFunction("convert_assertions_to_tl_ist_formulas", "CONVERT-ASSERTIONS-TO-TL-IST-FORMULAS", 1, 0, false);
        declareFunction("assertion_tl_formulas", "ASSERTION-TL-FORMULAS", 1, 0, false);
        declareFunction("assertion_tl_ist_formulas", "ASSERTION-TL-IST-FORMULAS", 1, 0, false);
        declareFunction("sibling_tl_assertions", "SIBLING-TL-ASSERTIONS", 1, 0, false);
        declareFunction("assertion_tl_ist_formula_int", "ASSERTION-TL-IST-FORMULA-INT", 1, 0, false);
        declareFunction("assertion_tl_formula_int", "ASSERTION-TL-FORMULA-INT", 1, 0, false);
        declareFunction("assertion_tl_cnf", "ASSERTION-TL-CNF", 1, 0, false);
        declareFunction("transform_hl_terms_to_tl", "TRANSFORM-HL-TERMS-TO-TL", 1, 0, false);
        declareFunction("tl_encapsulate", "TL-ENCAPSULATE", 1, 0, false);
        declareFunction("find_assertion_from_tl_formula", "FIND-ASSERTION-FROM-TL-FORMULA", 2, 0, false);
        declareFunction("find_assertions_from_tl_formula", "FIND-ASSERTIONS-FROM-TL-FORMULA", 2, 0, false);
        declareFunction("find_assertion_from_tl_cnf_ist_formula", "FIND-ASSERTION-FROM-TL-CNF-IST-FORMULA", 1, 0, false);
        declareFunction("find_assertion_from_tl_cnf_formula", "FIND-ASSERTION-FROM-TL-CNF-FORMULA", 2, 0, false);
        declareFunction("tl_formula_to_hl_cnf", "TL-FORMULA-TO-HL-CNF", 1, 0, false);
        declareFunction("tlmt_to_hlmt", "TLMT-TO-HLMT", 1, 0, false);
        declareFunction("transform_tl_terms_to_hl", "TRANSFORM-TL-TERMS-TO-HL", 1, 0, false);
        declareFunction("tl_formula_to_cnf_int", "TL-FORMULA-TO-CNF-INT", 1, 0, false);
        declareFunction("tl_termP", "TL-TERM?", 1, 0, false);
        new canon_tl.$tl_termP$UnaryFunction();
        declareFunction("tl_assertion_termP", "TL-ASSERTION-TERM?", 1, 0, false);
        declareFunction("tl_function_termP", "TL-FUNCTION-TERM?", 1, 0, false);
        declareFunction("tl_varP", "TL-VAR?", 1, 0, false);
        declareFunction("hl_not_tl_termP", "HL-NOT-TL-TERM?", 1, 0, false);
        declareFunction("hl_term_to_tl", "HL-TERM-TO-TL", 1, 0, false);
        declareFunction("hl_assertion_term_to_tl", "HL-ASSERTION-TERM-TO-TL", 1, 0, false);
        declareFunction("hl_function_term_to_tl", "HL-FUNCTION-TERM-TO-TL", 1, 0, false);
        declareFunction("hl_var_to_tl", "HL-VAR-TO-TL", 1, 1, false);
        declareFunction("tl_quotify", "TL-QUOTIFY", 1, 0, false);
        declareFunction("tl_term_to_hl", "TL-TERM-TO-HL", 1, 0, false);
        declareFunction("tl_assertion_term_to_hl", "TL-ASSERTION-TERM-TO-HL", 1, 0, false);
        declareFunction("tl_function_term_to_hl", "TL-FUNCTION-TERM-TO-HL", 1, 0, false);
        declareFunction("tl_var_to_hl", "TL-VAR-TO-HL", 1, 0, false);
        declareFunction("tl_term_to_el", "TL-TERM-TO-EL", 1, 0, false);
        declareFunction("tl_assertion_term_to_el", "TL-ASSERTION-TERM-TO-EL", 1, 0, false);
        declareFunction("tl_function_term_to_el", "TL-FUNCTION-TERM-TO-EL", 1, 0, false);
        declareFunction("tl_var_to_el", "TL-VAR-TO-EL", 1, 0, false);
        declareFunction("tl_find_nart", "TL-FIND-NART", 1, 0, false);
        declareFunction("tl_nart_substitute", "TL-NART-SUBSTITUTE", 1, 0, false);
        declareFunction("tl_var_to_el_var_transform", "TL-VAR-TO-EL-VAR-TRANSFORM", 1, 0, false);
        declareFunction("tl_nart_transform", "TL-NART-TRANSFORM", 1, 0, false);
        declareFunction("assertion_findable_via_tlP", "ASSERTION-FINDABLE-VIA-TL?", 1, 0, false);
        declareFunction("assertion_unassertible_via_tlP", "ASSERTION-UNASSERTIBLE-VIA-TL?", 1, 0, false);
        declareFunction("assertion_unassertible_via_tl_fastP", "ASSERTION-UNASSERTIBLE-VIA-TL-FAST?", 1, 0, false);
        declareFunction("duplicate_assertionP", "DUPLICATE-ASSERTION?", 1, 0, false);
        declareFunction("unassert_assertion_via_tl", "UNASSERT-ASSERTION-VIA-TL", 1, 0, false);
        declareFunction("unassert_tl_formula", "UNASSERT-TL-FORMULA", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_canon_tl_file() {
        defparameter("*EL-VAR-NAMES*", NIL);
        return NIL;
    }

    public static SubLObject setup_canon_tl_file() {
        register_kb_function(TL_ASSERTION_TERM_TO_EL);
        register_kb_function(TL_FUNCTION_TERM_TO_EL);
        register_kb_function(TL_VAR_TO_EL);
        return NIL;
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
    }

    public static final class $tl_termP$UnaryFunction extends UnaryFunction {
        public $tl_termP$UnaryFunction() {
            super(extractFunctionNamed("TL-TERM?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tl_termP(arg1);
        }
    }

    static private final SubLString $str_alt14$referenced_assertion_not_found___ = makeString("referenced assertion not found: ~%  ~s");

    static private final SubLString $str_alt15$referenced_function_not_found____ = makeString("referenced function not found: ~%  ~s");

    static private final SubLString $str_alt17$referenced_TL_assertion_not_found = makeString("referenced TL assertion not found: ~%  ~s");

    static private final SubLString $str_alt18$referenced_TL_nart_not_found_____ = makeString("referenced TL nart not found: ~%  ~s");

    static private final SubLString $str_alt25$formula__S_in_mt__S_cannot_be_fou = makeString("formula ~S in mt ~S cannot be found");

    static private final SubLString $str_alt27$CNF__S_in_mt__S_is_not_locally_in = makeString("CNF ~S in mt ~S is not locally in the KB");
}

/**
 * Total time: 241 ms
 */
