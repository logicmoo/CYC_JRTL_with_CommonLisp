/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cheap_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-DEDUCTION-SUPPORTS
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-deduction-supports.lisp
 * created:     2019/07/03 17:37:46
 */
public final class removal_modules_deduction_supports extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_deduction_supports();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_deduction_supports_check_cost$ = makeSymbol("*DEFAULT-DEDUCTION-SUPPORTS-CHECK-COST*");

    // deflexical
    // The expected number of supports for a deduction.
    /**
     * The expected number of supports for a deduction.
     */
    @LispMethod(comment = "The expected number of supports for a deduction.\ndeflexical")
    private static final SubLSymbol $average_deduction_support_count$ = makeSymbol("*AVERAGE-DEDUCTION-SUPPORT-COUNT*");





    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("deductionSupports"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("deductionSupports"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("deductionSupports"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-DEDUCTION-SUPPORT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DEDUCTIONSUPPORTS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$deductionSupports <fully-bound-p> <anything>) or (#$deductionSupports <anything> <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });

    // Definitions
    /**
     * Return T iff SUPPORT is a support for DEDUCTION.
     */
    @LispMethod(comment = "Return T iff SUPPORT is a support for DEDUCTION.")
    public static final SubLObject deduction_supportP_alt(SubLObject deduction, SubLObject support) {
        return member(support, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED);
    }

    // Definitions
    /**
     * Return T iff SUPPORT is a support for DEDUCTION.
     */
    @LispMethod(comment = "Return T iff SUPPORT is a support for DEDUCTION.")
    public static SubLObject deduction_supportP(final SubLObject deduction, final SubLObject support) {
        return member(support, deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns the deduction denoted by DEDUCTION-TERM.
     */
    @LispMethod(comment = "Returns the deduction denoted by DEDUCTION-TERM.")
    public static final SubLObject find_deduction_from_term_alt(SubLObject deduction_term) {
        {
            SubLObject d_id = NIL;
            SubLObject deduction = NIL;
            if (cycl_utilities.formula_operator(deduction_term) == $$CycDeductionDatastructureFn) {
                d_id = cycl_utilities.formula_arg1(deduction_term, UNPROVIDED);
                deduction = deduction_handles.find_deduction_by_id(d_id);
                if (NIL != deduction_handles.deduction_p(deduction)) {
                    return deduction;
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * Returns the deduction denoted by DEDUCTION-TERM.
     */
    @LispMethod(comment = "Returns the deduction denoted by DEDUCTION-TERM.")
    public static SubLObject find_deduction_from_term(final SubLObject deduction_term) {
        SubLObject d_id = NIL;
        SubLObject deduction = NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            return NIL;
        }
        d_id = cycl_utilities.formula_arg1(deduction_term, UNPROVIDED);
        deduction = deduction_handles.find_deduction_by_id(d_id);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            return deduction;
        }
        return NIL;
    }

    /**
     * Returns the supports for the deduction denoted by DEDUCTION-TERM.
     */
    @LispMethod(comment = "Returns the supports for the deduction denoted by DEDUCTION-TERM.")
    public static final SubLObject deduction_term_supports_alt(SubLObject deduction_term) {
        {
            SubLObject deduction = NIL;
            SubLObject supports = NIL;
            if (cycl_utilities.formula_operator(deduction_term) == $$CycDeductionDatastructureFn) {
                deduction = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_deduction_supports.find_deduction_from_term(deduction_term);
                if (NIL != deduction_handles.deduction_p(deduction)) {
                    supports = deductions_high.deduction_supports(deduction);
                    return supports;
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * Returns the supports for the deduction denoted by DEDUCTION-TERM.
     */
    @LispMethod(comment = "Returns the supports for the deduction denoted by DEDUCTION-TERM.")
    public static SubLObject deduction_term_supports(final SubLObject deduction_term) {
        SubLObject deduction = NIL;
        SubLObject supports = NIL;
        if (!cycl_utilities.formula_operator(deduction_term).eql($$CycDeductionDatastructureFn)) {
            return NIL;
        }
        deduction = find_deduction_from_term(deduction_term);
        if (NIL != deduction_handles.deduction_p(deduction)) {
            supports = deductions_high.deduction_supports(deduction);
            return supports;
        }
        return NIL;
    }

    public static SubLObject removal_deductionsupports_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != variables.fully_bound_p(arg1)) {
            SubLObject cdolist_list_var;
            final SubLObject supports = cdolist_list_var = deduction_term_supports(arg1);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject v_bindings = unification_utilities.term_unify(support, arg2, UNPROVIDED, UNPROVIDED);
                if (NIL != v_bindings) {
                    backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        } else
            if (NIL != assertion_handles.assertion_p(arg2)) {
                SubLObject cdolist_list_var2 = assertions_high.assertion_arguments(arg2);
                SubLObject argument = NIL;
                argument = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != deduction_handles.deduction_p(argument)) {
                        final SubLObject v_answer = make_unary_formula($$CycDeductionDatastructureFn, deduction_handles.deduction_id(argument));
                        final SubLObject v_bindings = unification_utilities.term_unify(v_answer, arg1, UNPROVIDED, UNPROVIDED);
                        if (NIL != v_bindings) {
                            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
                        }
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    argument = cdolist_list_var2.first();
                } 
            }

        return NIL;
    }

    private static final SubLSymbol $REMOVAL_DEDUCTION_SUPPORT_UNIFY = makeKeyword("REMOVAL-DEDUCTION-SUPPORT-UNIFY");

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("deductionSupports"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("deductionSupports"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-DEDUCTION-SUPPORT-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("deductionSupports"), list($BIND, makeSymbol("DEDUCTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("DEDUCTION-TERM-SUPPORTS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("deductionSupports"), list(makeKeyword("VALUE"), makeSymbol("DEDUCTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("(#$deductionSupports <deduction-term> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$deductionSupports \n      (#$CycDeductionDatastructureFn 408468)\n      ?SUPPORT)") });

    public static SubLObject declare_removal_modules_deduction_supports_file() {
        declareFunction("deduction_supportP", "DEDUCTION-SUPPORT?", 2, 0, false);
        declareFunction("find_deduction_from_term", "FIND-DEDUCTION-FROM-TERM", 1, 0, false);
        declareFunction("deduction_term_supports", "DEDUCTION-TERM-SUPPORTS", 1, 0, false);
        declareFunction("removal_deductionsupports_expand", "REMOVAL-DEDUCTIONSUPPORTS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_deduction_supports_file() {
        defparameter("*DEFAULT-DEDUCTION-SUPPORTS-CHECK-COST*", $cheap_hl_module_check_cost$.getGlobalValue());
        deflexical("*AVERAGE-DEDUCTION-SUPPORT-COUNT*", THREE_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_removal_modules_deduction_supports_file_alt() {
        inference_modules.register_solely_specific_removal_module_predicate($$deductionSupports);
        inference_modules.inference_removal_module($REMOVAL_DEDUCTION_SUPPORT_UNIFY, $list_alt3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_deduction_supports_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.register_solely_specific_removal_module_predicate($$deductionSupports);
            preference_modules.doomed_unless_either_arg_bindable($POS, $$deductionSupports);
            preference_modules.doomed_unless_all_args_bindable($NEG, $$deductionSupports);
            inference_modules.inference_removal_module($REMOVAL_DEDUCTIONSUPPORTS, $list5);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_DEDUCTION_SUPPORT_UNIFY, $list_alt3);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_deduction_supports_file_Previous() {
        inference_modules.register_solely_specific_removal_module_predicate($$deductionSupports);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$deductionSupports);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$deductionSupports);
        inference_modules.inference_removal_module($REMOVAL_DEDUCTIONSUPPORTS, $list5);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_deduction_supports_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_deduction_supports_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_deduction_supports_file();
    }

    static {
    }
}

/**
 * Total time: 77 ms
 */
