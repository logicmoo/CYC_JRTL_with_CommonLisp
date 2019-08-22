package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_argument_communicator extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_argument_communicator();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_argument_communicator";

    public static final String myFingerPrint = "80ae33048fe012aa5da31ef125d93851c2e83e15b818caa253ebe875a4fed878";

    // defparameter
    // HL support modules which are not considered relevant
    private static final SubLSymbol $rkf_irrelevant_hl_support_modules$ = makeSymbol("*RKF-IRRELEVANT-HL-SUPPORT-MODULES*");

    // defparameter
    // HL support predicates which are not considered relevant
    private static final SubLSymbol $rkf_irrelevant_hl_support_predicates$ = makeSymbol("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATES*");

    // defparameter
    // HL support predicates which are not considered relevant
    private static final SubLSymbol $rkf_irrelevant_hl_support_predicate_types$ = makeSymbol("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATE-TYPES*");

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("ISA"), makeKeyword("GENLS"), makeKeyword("EVAL"));

    public static final SubLSymbol SUPPORT_MODULE = makeSymbol("SUPPORT-MODULE");



    public static final SubLSymbol $sym3$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static final SubLList $list4 = list(makeKeyword("CODE"), makeKeyword("EQUALITY"), makeKeyword("GENLPREDS"), makeKeyword("EVAL"));

    public static final SubLList $list5 = list(reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlInverse")));

    public static final SubLList $list6 = list(reader_make_constant_shell(makeString("MetaPredicate")));





    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));











    public static final SubLSymbol $sym15$HL_VAR_ = makeSymbol("HL-VAR?");



    public static final SubLSymbol $sym17$RELN_OR_COL_VAR_LIT_ = makeSymbol("RELN-OR-COL-VAR-LIT?");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    public static SubLObject rkf_sort_supports(SubLObject supports) {
        supports = list_utilities.sort_via_position(supports, $list0, symbol_function(EQ), symbol_function(SUPPORT_MODULE));
        supports = list_utilities.stable_sort_via_test(supports, symbol_function(ASSERTION_P), UNPROVIDED);
        supports = list_utilities.stable_sort_via_test(supports, symbol_function($sym3$RULE_ASSERTION_), UNPROVIDED);
        return supports;
    }

    public static SubLObject rkf_irrelevant_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != arguments.support_p(support) : "arguments.support_p(support) " + "CommonSymbols.NIL != arguments.support_p(support) " + support;
        if (NIL != rkf_relevance_utilities.rkf_irrelevant_formula(arguments.support_sentence(support), arguments.support_mt(support))) {
            return T;
        }
        if (NIL != assertions_high.gaf_assertionP(support)) {
            final SubLObject pred = assertions_high.gaf_predicate(support);
            if (NIL != find(pred, $rkf_irrelevant_hl_support_predicates$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            SubLObject badP = NIL;
            if (NIL == badP) {
                SubLObject csome_list_var = $rkf_irrelevant_hl_support_predicate_types$.getDynamicValue(thread);
                SubLObject pred_type = NIL;
                pred_type = csome_list_var.first();
                while ((NIL == badP) && (NIL != csome_list_var)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        badP = isa.isaP(pred, pred_type, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    pred_type = csome_list_var.first();
                } 
            }
            return badP;
        } else {
            if (NIL != assertion_handles.assertion_p(support)) {
                return rkf_irrelevant_non_gaf_assertionP(support);
            }
            final SubLObject module = arguments.support_module(support);
            final SubLObject formula = arguments.support_formula(support);
            if (NIL != find(module, $rkf_irrelevant_hl_support_modules$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
            final SubLObject pcase_var = module;
            if (((((pcase_var.eql($GENLS) || pcase_var.eql($GENLPREDS)) || pcase_var.eql($GENLMT)) || pcase_var.eql($TRANSITIVITY)) || pcase_var.eql($SUBSETOF)) && literal_arg1(formula, UNPROVIDED).equal(literal_arg2(formula, UNPROVIDED))) {
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject rkf_irrelevant_non_gaf_assertionP(final SubLObject as) {
        if (NIL != assertions_high.invalid_assertion(as, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != second_order_cnfP(assertions_high.assertion_cnf(as))) {
            return T;
        }
        if (NIL != reln_or_col_var_cnfP(assertions_high.assertion_cnf(as))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject second_order_cnfP(final SubLObject cnf) {
        return makeBoolean((NIL != find_if($sym15$HL_VAR_, clauses.neg_lits(cnf), symbol_function(FORMULA_OPERATOR), UNPROVIDED, UNPROVIDED)) || (NIL != find_if($sym15$HL_VAR_, clauses.pos_lits(cnf), symbol_function(FORMULA_OPERATOR), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject reln_or_col_var_cnfP(final SubLObject cnf) {
        return makeBoolean((NIL != find_if($sym17$RELN_OR_COL_VAR_LIT_, clauses.neg_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != find_if($sym17$RELN_OR_COL_VAR_LIT_, clauses.pos_lits(cnf), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject reln_or_col_var_litP(final SubLObject lit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_operator(lit);
        SubLObject ans = NIL;
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject i = NIL;
        list_var = cycl_utilities.formula_args(lit, UNPROVIDED);
        arg = list_var.first();
        for (i = ZERO_INTEGER; (NIL == ans) && (NIL != list_var); list_var = list_var.rest() , arg = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != cycl_variables.hl_varP(arg)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject argnum = number_utilities.f_1X(i);
                    final SubLObject argtypes = kb_accessors.argn_isa(pred, argnum, UNPROVIDED);
                    if (NIL == ans) {
                        SubLObject csome_list_var;
                        SubLObject type;
                        for (csome_list_var = argtypes, type = NIL, type = csome_list_var.first(); (NIL == ans) && (NIL != csome_list_var); ans = makeBoolean((NIL != genls.genlP(type, $$Relation, UNPROVIDED, UNPROVIDED)) || (NIL != genls.genlP(type, $$Collection, UNPROVIDED, UNPROVIDED))) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }

    public static SubLObject declare_rkf_argument_communicator_file() {
        declareFunction(me, "rkf_sort_supports", "RKF-SORT-SUPPORTS", 1, 0, false);
        declareFunction(me, "rkf_irrelevant_support_p", "RKF-IRRELEVANT-SUPPORT-P", 1, 0, false);
        declareFunction(me, "rkf_irrelevant_non_gaf_assertionP", "RKF-IRRELEVANT-NON-GAF-ASSERTION?", 1, 0, false);
        declareFunction(me, "second_order_cnfP", "SECOND-ORDER-CNF?", 1, 0, false);
        declareFunction(me, "reln_or_col_var_cnfP", "RELN-OR-COL-VAR-CNF?", 1, 0, false);
        declareFunction(me, "reln_or_col_var_litP", "RELN-OR-COL-VAR-LIT?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_argument_communicator_file() {
        defparameter("*RKF-IRRELEVANT-HL-SUPPORT-MODULES*", $list4);
        defparameter("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATES*", $list5);
        defparameter("*RKF-IRRELEVANT-HL-SUPPORT-PREDICATE-TYPES*", $list6);
        return NIL;
    }

    public static SubLObject setup_rkf_argument_communicator_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_argument_communicator_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_argument_communicator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_argument_communicator_file();
    }

    
}

/**
 * Total time: 105 ms
 */
