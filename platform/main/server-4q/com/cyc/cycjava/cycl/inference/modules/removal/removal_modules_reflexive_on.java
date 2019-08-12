/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-REFLEXIVE-ON
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-reflexive-on.lisp
 * created:     2019/07/03 17:37:44
 */
public final class removal_modules_reflexive_on extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_reflexive_on();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on";




    static private final SubLList $list3 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol REFLEXIVE_ON_COMPLETNESS = makeSymbol("REFLEXIVE-ON-COMPLETNESS");

    private static final SubLSymbol $REMOVAL_REFLEXIVE_ON = makeKeyword("REMOVAL-REFLEXIVE-ON");

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), cons(list($TEST, makeSymbol("REFLEXIVE-ON-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REFLEXIVE-ON-COMPLETNESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), makeKeyword("EXAMPLE"), makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });



    static private final SubLString $str14$Couldn_t_validate____isa__S__S__i = makeString("Couldn't validate (#$isa ~S ~S) in ~S");



    // Definitions
    public static final SubLObject reflexive_on_predicateP_alt(SubLObject v_object) {
        return makeBoolean(((!ONE_INTEGER.eql(somewhere_cache.some_pred_assertion_somewhere_argnum($$reflexiveOn))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$reflexiveOn, v_object, ONE_INTEGER, UNPROVIDED))) && (NIL != kb_mapping_utilities.some_pred_value(v_object, $$reflexiveOn, ONE_INTEGER, $TRUE)));
    }

    // Definitions
    public static SubLObject reflexive_on_predicateP(final SubLObject v_object) {
        return makeBoolean(((!ONE_INTEGER.eql(somewhere_cache.some_pred_assertion_somewhere_argnum($$reflexiveOn))) || (NIL != somewhere_cache.some_pred_assertion_somewhereP($$reflexiveOn, v_object, ONE_INTEGER, UNPROVIDED))) && (NIL != kb_mapping_utilities.some_pred_value(v_object, $$reflexiveOn, ONE_INTEGER, $TRUE)));
    }

    public static final SubLObject reflexive_on_cols_alt(SubLObject pred) {
        return kb_mapping_utilities.pred_values(pred, $$reflexiveOn, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject reflexive_on_cols(final SubLObject pred) {
        return kb_mapping_utilities.pred_values(pred, $$reflexiveOn, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @unknown -- Assumes at least one arg in ASENT is fully bound.
     */
    @LispMethod(comment = "@unknown -- Assumes at least one arg in ASENT is fully bound.")
    public static final SubLObject removal_reflexive_on_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
                try {
                    at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
                    {
                        SubLObject fully_bound_arg = find_if(FULLY_BOUND_P, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject successP = NIL;
                        SubLObject datum = cycl_utilities.formula_terms(asent, UNPROVIDED);
                        SubLObject current = datum;
                        SubLObject pred = NIL;
                        SubLObject arg1 = NIL;
                        SubLObject arg2 = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        pred = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        arg1 = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt3);
                        arg2 = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            thread.resetMultipleValues();
                            {
                                SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
                                SubLObject justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != v_bindings) {
                                    if (NIL == successP) {
                                        {
                                            SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.reflexive_on_cols(pred);
                                            SubLObject col = NIL;
                                            for (col = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                                if (NIL != at_defns.has_typeP(fully_bound_arg, col, UNPROVIDED)) {
                                                    {
                                                        SubLObject sentence = bindings.subst_bindings(v_bindings, asent);
                                                        SubLObject support = arguments.make_hl_support($REFLEXIVE_ON, sentence, UNPROVIDED, UNPROVIDED);
                                                        backward.removal_add_node(support, v_bindings, justification);
                                                    }
                                                    successP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt3);
                        }
                    }
                } finally {
                    at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown -- Assumes at least one arg in ASENT is fully bound.
     */
    @LispMethod(comment = "@unknown -- Assumes at least one arg in ASENT is fully bound.")
    public static SubLObject removal_reflexive_on_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            final SubLObject fully_bound_arg = find_if(FULLY_BOUND_P, cycl_utilities.atomic_sentence_args(asent, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject successP = NIL;
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            pred = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            arg1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list3);
            arg2 = current.first();
            current = current.rest();
            if (NIL == current) {
                thread.resetMultipleValues();
                final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
                final SubLObject justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != v_bindings) && (NIL == successP)) {
                    SubLObject csome_list_var = reflexive_on_cols(pred);
                    SubLObject col = NIL;
                    col = csome_list_var.first();
                    while ((NIL == successP) && (NIL != csome_list_var)) {
                        if (NIL != at_defns.has_typeP(fully_bound_arg, col, UNPROVIDED)) {
                            final SubLObject sentence = bindings.subst_bindings(v_bindings, asent);
                            final SubLObject support = arguments.make_hl_support($REFLEXIVE_ON, sentence, UNPROVIDED, UNPROVIDED);
                            backward.removal_add_node(support, v_bindings, justification);
                            successP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    } 
                }
            } else {
                cdestructuring_bind_error(datum, $list3);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reflexive_on_completness_alt(SubLObject asent) {
        return NIL != variables.fully_bound_p(asent) ? ((SubLObject) ($INCOMPLETE)) : $GROSSLY_INCOMPLETE;
    }

    public static SubLObject reflexive_on_completness(final SubLObject asent) {
        return NIL != variables.fully_bound_p(asent) ? $INCOMPLETE : $GROSSLY_INCOMPLETE;
    }

    /**
     *
     *
     * @return LISTP of supports justifying LITERAL in MT.
     */
    @LispMethod(comment = "@return LISTP of supports justifying LITERAL in MT.")
    public static final SubLObject supports_for_reflexive_on_alt(SubLObject literal, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject atomic_sentence = literal_atomic_sentence(literal);
                SubLObject datum = atomic_sentence;
                SubLObject current = datum;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt3);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt3);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt3);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.reflexive_on_predicateP(pred)) {
                        if (NIL == ans) {
                            {
                                SubLObject csome_list_var = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.reflexive_on_cols(pred);
                                SubLObject col = NIL;
                                for (col = csome_list_var.first(); !((NIL != ans) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , col = csome_list_var.first()) {
                                    {
                                        SubLObject reflexive_on_assertion = NIL;
                                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                        {
                                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                reflexive_on_assertion = kb_mapping_utilities.fpred_u_v_holds_gaf($$reflexiveOn, pred, col, ONE_INTEGER, TWO_INTEGER, $TRUE);
                                            } finally {
                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                        if ((NIL != reflexive_on_assertion) && (NIL != at_defns.has_typeP(arg1, col, UNPROVIDED))) {
                                            if (!arg1.equal(arg2)) {
                                                ans = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.reflexive_on_isa_support(arg2, col, mt), ans);
                                                ans = cons(arguments.make_hl_support($EQUALITY, make_binary_formula($$equals, arg1, arg2), mt, UNPROVIDED), ans);
                                            }
                                            ans = cons(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexive_on.reflexive_on_isa_support(arg1, col, mt), ans);
                                            ans = cons(reflexive_on_assertion, ans);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt3);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of supports justifying LITERAL in MT.
     */
    @LispMethod(comment = "@return LISTP of supports justifying LITERAL in MT.")
    public static SubLObject supports_for_reflexive_on(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject atomic_sentence = literal_atomic_sentence(literal);
        SubLObject current;
        final SubLObject datum = current = atomic_sentence;
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != reflexive_on_predicateP(pred)) && (NIL == ans)) {
                SubLObject csome_list_var = reflexive_on_cols(pred);
                SubLObject col = NIL;
                col = csome_list_var.first();
                while ((NIL == ans) && (NIL != csome_list_var)) {
                    SubLObject reflexive_on_assertion = NIL;
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        reflexive_on_assertion = kb_mapping_utilities.fpred_u_v_holds_gaf($$reflexiveOn, pred, col, ONE_INTEGER, TWO_INTEGER, $TRUE);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                    if ((NIL != reflexive_on_assertion) && (NIL != at_defns.has_typeP(arg1, col, UNPROVIDED))) {
                        if (!arg1.equal(arg2)) {
                            ans = cons(reflexive_on_isa_support(arg2, col, mt), ans);
                            ans = cons(arguments.make_hl_support($EQUALITY, make_binary_formula($$equals, arg1, arg2), mt, UNPROVIDED), ans);
                        }
                        ans = cons(reflexive_on_isa_support(arg1, col, mt), ans);
                        ans = cons(reflexive_on_assertion, ans);
                    }
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                } 
            }
        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return ans;
    }

    public static final SubLObject reflexive_on_isa_support_alt(SubLObject v_term, SubLObject col, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject support_module = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (NIL != isa.isaP(v_term, col, UNPROVIDED, UNPROVIDED)) {
                            support_module = $ISA;
                        } else {
                            if (NIL != at_defns.has_typeP(v_term, col, UNPROVIDED)) {
                                support_module = $DEFN;
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == support_module) {
                        Errors.error($str_alt14$Couldn_t_validate____isa__S__S__i, v_term, col, mt);
                    }
                }
                return arguments.make_hl_support(support_module, make_binary_formula($$isa, v_term, col), mt, UNPROVIDED);
            }
        }
    }

    public static SubLObject reflexive_on_isa_support(final SubLObject v_term, final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject support_module = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != isa.isaP(v_term, col, UNPROVIDED, UNPROVIDED)) {
                support_module = $ISA;
            } else
                if (NIL != at_defns.has_typeP(v_term, col, UNPROVIDED)) {
                    support_module = $DEFN;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == support_module)) {
            Errors.error($str14$Couldn_t_validate____isa__S__S__i, v_term, col, mt);
        }
        return arguments.make_hl_support(support_module, make_binary_formula($$isa, v_term, col), mt, UNPROVIDED);
    }

    public static SubLObject declare_removal_modules_reflexive_on_file() {
        declareFunction("reflexive_on_predicateP", "REFLEXIVE-ON-PREDICATE?", 1, 0, false);
        new removal_modules_reflexive_on.$reflexive_on_predicateP$UnaryFunction();
        declareFunction("reflexive_on_cols", "REFLEXIVE-ON-COLS", 1, 0, false);
        declareFunction("removal_reflexive_on_expand", "REMOVAL-REFLEXIVE-ON-EXPAND", 1, 1, false);
        declareFunction("reflexive_on_completness", "REFLEXIVE-ON-COMPLETNESS", 1, 0, false);
        declareFunction("supports_for_reflexive_on", "SUPPORTS-FOR-REFLEXIVE-ON", 2, 0, false);
        declareFunction("reflexive_on_isa_support", "REFLEXIVE-ON-ISA-SUPPORT", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_reflexive_on_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_reflexive_on_file() {
        note_funcall_helper_function(REFLEXIVE_ON_COMPLETNESS);
        inference_modules.inference_removal_module($REMOVAL_REFLEXIVE_ON, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_reflexive_on_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_reflexive_on_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_reflexive_on_file();
    }

    static {
    }

    public static final class $reflexive_on_predicateP$UnaryFunction extends UnaryFunction {
        public $reflexive_on_predicateP$UnaryFunction() {
            super(extractFunctionNamed("REFLEXIVE-ON-PREDICATE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return reflexive_on_predicateP(arg1);
        }
    }

    static private final SubLList $list_alt3 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list($TEST, makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), list(makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"))), cons(list($TEST, makeSymbol("REFLEXIVE-ON-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REFLEXIVE-ON-COMPLETNESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ON-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> arg1 arg2)\nwhere at least one of arg1 and arg2 is fully bound, \nby unification of arg1 and arg2\n"), makeKeyword("EXAMPLE"), makeString("(#$whollyLocatedAt-Spatial #$EarthsEquator ?X) in #$WorldGeographyMt\nvia\n (#$reflexiveOn #$whollyLocatedAt-Spatial #$SpaceRegion)\nand\n (#$isa #$EarthsEquator #$SpaceRegion)") });

    static private final SubLString $str_alt14$Couldn_t_validate____isa__S__S__i = makeString("Couldn't validate (#$isa ~S ~S) in ~S");
}

/**
 * Total time: 104 ms
 */
