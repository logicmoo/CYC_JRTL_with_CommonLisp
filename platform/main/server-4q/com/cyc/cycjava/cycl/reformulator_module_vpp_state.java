/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_unary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_vpp_state extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new reformulator_module_vpp_state();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_vpp_state";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $vpps_microseconds$ = makeSymbol("*VPPS-MICROSECONDS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("VPPS-REQUIRED"), $COST, makeSymbol("VPPS-COST"), makeKeyword("REFORMULATE"), makeSymbol("VPPS-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Transforms the output of the RTP and VPP into usable CycL."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$likes-Generic #$TheActiveSubject #$BillClinton)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$likes-Generic (#$SomeFn #$Agent-Generic) #$BillClinton)") });







    // Definitions
    /**
     * An instance of EvaluatableFunction. For any instance of Relation RELN of arity 0
     * through N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where
     * (assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where
     * (assertedSentence (argIsa RELN N COL)).
     */
    @LispMethod(comment = "An instance of EvaluatableFunction. For any instance of Relation RELN of arity 0\r\nthrough N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where\r\n(assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where\r\n(assertedSentence (argIsa RELN N COL)).\nAn instance of EvaluatableFunction. For any instance of Relation RELN of arity 0\nthrough N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where\n(assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where\n(assertedSentence (argIsa RELN N COL)).")
    public static final SubLObject active_subject_for_reln_in_arg_alt(SubLObject reln, SubLObject n, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt, thread);
                        {
                            SubLObject genl_assertions = kb_mapping.gather_gaf_arg_index(reln, ONE_INTEGER, kb_accessors.arg_genl_pred(n, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            if (NIL != genl_assertions) {
                                {
                                    SubLObject cols = Mapping.mapcar(GAF_ARG2, genl_assertions);
                                    SubLObject min_cols = genls.min_cols(cols, UNPROVIDED, UNPROVIDED);
                                    if (NIL != list_utilities.singletonP(min_cols)) {
                                        result = min_cols.first();
                                    }
                                }
                            } else {
                                {
                                    SubLObject isa_assertions = kb_mapping.gather_gaf_arg_index(reln, ONE_INTEGER, kb_accessors.arg_isa_pred(n, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                    SubLObject cols = Mapping.mapcar(GAF_ARG2, isa_assertions);
                                    SubLObject min_cols = genls.min_cols(cols, UNPROVIDED, UNPROVIDED);
                                    if (NIL != list_utilities.singletonP(min_cols)) {
                                        result = min_cols.first();
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    // Definitions
    /**
     * An instance of EvaluatableFunction. For any instance of Relation RELN of arity 0
     * through N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where
     * (assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where
     * (assertedSentence (argIsa RELN N COL)).
     */
    @LispMethod(comment = "An instance of EvaluatableFunction. For any instance of Relation RELN of arity 0\r\nthrough N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where\r\n(assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where\r\n(assertedSentence (argIsa RELN N COL)).\nAn instance of EvaluatableFunction. For any instance of Relation RELN of arity 0\nthrough N+M, (ActiveSubjectForRelnInArgFn RELN N) will evaluate to COL, where\n(assertedSentence (argGenl RELN N COL)). Otherwise, it will return COL, where\n(assertedSentence (argIsa RELN N COL)).")
    public static SubLObject active_subject_for_reln_in_arg(final SubLObject reln, final SubLObject n, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject genl_assertions = kb_mapping.gather_gaf_arg_index(reln, ONE_INTEGER, kb_accessors.arg_genl_pred(n, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            if (NIL != genl_assertions) {
                final SubLObject cols = Mapping.mapcar(GAF_ARG2, genl_assertions);
                final SubLObject min_cols = genls.min_cols(cols, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(min_cols)) {
                    result = min_cols.first();
                }
            } else {
                final SubLObject isa_assertions = kb_mapping.gather_gaf_arg_index(reln, ONE_INTEGER, kb_accessors.arg_isa_pred(n, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                final SubLObject cols2 = Mapping.mapcar(GAF_ARG2, isa_assertions);
                final SubLObject min_cols2 = genls.min_cols(cols2, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(min_cols2)) {
                    result = min_cols2.first();
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject vpps_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (NIL != clauses.clauses_p(expression)) {
            if ((NIL != list_utilities.singletonP(expression)) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
                {
                    SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                    if (NIL != el_binary_formula_p(asent)) {
                        {
                            SubLObject plays_role_pred = cycl_utilities.atomic_sentence_predicate(asent);
                            SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                            if ((NIL != el_unary_formula_p(some_fn_arg)) && $$SomeFn.eql(cycl_utilities.formula_operator(some_fn_arg))) {
                                {
                                    SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED);
                                    if ((NIL != el_unary_formula_p(state_fn_arg)) && $$StateFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED)))) {
                                        if (NIL != reformulator_module_vpp_non_state.subject_role_predicateP(plays_role_pred, mt)) {
                                            return T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                        SubLObject cdolist_list_var = args;
                        SubLObject arg = NIL;
                        for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                            if ($$TheActiveSubject.eql(arg)) {
                                if (NIL != fort_types_interface.isa_predicateP(cycl_utilities.atomic_sentence_predicate(asent), mt)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject vpps_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (NIL != el_binary_formula_p(asent)) {
                final SubLObject plays_role_pred = cycl_utilities.atomic_sentence_predicate(asent);
                final SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, UNPROVIDED);
                if ((NIL != el_unary_formula_p(some_fn_arg)) && $$SomeFn.eql(cycl_utilities.formula_operator(some_fn_arg))) {
                    final SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED);
                    if (((NIL != el_unary_formula_p(state_fn_arg)) && $$StateFn.eql(cycl_utilities.formula_operator(cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED)))) && (NIL != reformulator_module_vpp_non_state.subject_role_predicateP(plays_role_pred, mt))) {
                        return T;
                    }
                }
            }
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$TheActiveSubject.eql(arg) && (NIL != fort_types_interface.isa_predicateP(cycl_utilities.atomic_sentence_predicate(asent), mt))) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject vpps_cost_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $vpps_microseconds$.getGlobalValue();
    }

    public static SubLObject vpps_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $vpps_microseconds$.getGlobalValue();
    }

    public static final SubLObject vpps_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            SubLObject result = NIL;
            SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject active_subjectP = NIL;
            SubLObject argnum = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject rest = NIL;
            for (rest = args; !((NIL != result) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject arg = rest.first();
                    argnum = add(argnum, ONE_INTEGER);
                    if ($$TheActiveSubject.eql(arg)) {
                        active_subjectP = T;
                        result = com.cyc.cycjava.cycl.reformulator_module_vpp_state.vpps_reformulate_the_active_subject(asent, argnum, mt, settings);
                    }
                }
            }
            if (NIL == active_subjectP) {
                result = com.cyc.cycjava.cycl.reformulator_module_vpp_state.vpps_reformulate_some_fn_state_fn(asent, mt, settings);
            }
            if (NIL != result) {
                return values(result, T);
            } else {
                return values(expression, NIL);
            }
        }
    }

    public static SubLObject vpps_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        SubLObject result = NIL;
        final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
        SubLObject active_subjectP = NIL;
        SubLObject argnum = ZERO_INTEGER;
        final SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = args; (NIL == result) && (NIL != rest); rest = rest.rest()) {
            arg = rest.first();
            argnum = add(argnum, ONE_INTEGER);
            if ($$TheActiveSubject.eql(arg)) {
                active_subjectP = T;
                result = vpps_reformulate_the_active_subject(asent, argnum, mt, settings);
            }
        }
        if (NIL == active_subjectP) {
            result = vpps_reformulate_some_fn_state_fn(asent, mt, settings);
        }
        if (NIL != result) {
            return values(result, T);
        }
        return values(expression, NIL);
    }

    public static final SubLObject vpps_reformulate_the_active_subject_alt(SubLObject asent, SubLObject argnum, SubLObject mt, SubLObject settings) {
        {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject col = com.cyc.cycjava.cycl.reformulator_module_vpp_state.active_subject_for_reln_in_arg(pred, argnum, mt);
            SubLObject new_arg = make_unary_formula($$SomeFn, col);
            if (NIL != col) {
                return replace_formula_arg(argnum, new_arg, asent);
            }
        }
        return NIL;
    }

    public static SubLObject vpps_reformulate_the_active_subject(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings) {
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject col = active_subject_for_reln_in_arg(pred, argnum, mt);
        final SubLObject new_arg = make_unary_formula($$SomeFn, col);
        if (NIL != col) {
            return replace_formula_arg(argnum, new_arg, asent);
        }
        return NIL;
    }

    public static final SubLObject vpps_reformulate_some_fn_state_fn_alt(SubLObject asent, SubLObject mt, SubLObject settings) {
        {
            SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, UNPROVIDED);
            SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED);
            SubLObject sentence = cycl_utilities.formula_arg1(state_fn_arg, UNPROVIDED);
            return sentence;
        }
    }

    public static SubLObject vpps_reformulate_some_fn_state_fn(final SubLObject asent, final SubLObject mt, final SubLObject settings) {
        final SubLObject some_fn_arg = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject state_fn_arg = cycl_utilities.formula_arg1(some_fn_arg, UNPROVIDED);
        final SubLObject sentence = cycl_utilities.formula_arg1(state_fn_arg, UNPROVIDED);
        return sentence;
    }

    public static SubLObject declare_reformulator_module_vpp_state_file() {
        declareFunction("active_subject_for_reln_in_arg", "ACTIVE-SUBJECT-FOR-RELN-IN-ARG", 3, 0, false);
        declareFunction("vpps_required", "VPPS-REQUIRED", 3, 0, false);
        declareFunction("vpps_cost", "VPPS-COST", 3, 0, false);
        declareFunction("vpps_reformulate", "VPPS-REFORMULATE", 4, 0, false);
        declareFunction("vpps_reformulate_the_active_subject", "VPPS-REFORMULATE-THE-ACTIVE-SUBJECT", 4, 0, false);
        declareFunction("vpps_reformulate_some_fn_state_fn", "VPPS-REFORMULATE-SOME-FN-STATE-FN", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_vpp_state_file() {
        deflexical("*VPPS-MICROSECONDS*", $int$100);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_vpp_state_file() {
        reformulator_module_harness.declare_rl_module($$VPPProcessingStateRLModule, $list1);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_vpp_state_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_vpp_state_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_vpp_state_file();
    }

    static {
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("VPPS-REQUIRED"), $COST, makeSymbol("VPPS-COST"), makeKeyword("REFORMULATE"), makeSymbol("VPPS-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Transforms the output of the RTP and VPP into usable CycL."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$likes-Generic #$TheActiveSubject #$BillClinton)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$likes-Generic (#$SomeFn #$Agent-Generic) #$BillClinton)") });
}

/**
 * Total time: 55 ms
 */
