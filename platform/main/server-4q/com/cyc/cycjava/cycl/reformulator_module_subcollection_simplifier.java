package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cdar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_subcollection_simplifier extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_subcollection_simplifier();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier";

    public static final String myFingerPrint = "eef50d7f6683594af6a00ce10fad7d6fe81297faa6acd0caef6a76e31338ed39";

    // deflexical
    private static final SubLSymbol $subcol_simp_microseconds$ = makeSymbol("*SUBCOL-SIMP-MICROSECONDS*");

    private static final SubLObject $$SubcollectionSimplifierRLModule = reader_make_constant_shell(makeString("SubcollectionSimplifierRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("SUBCOL-SIMP-REQUIRED"), makeKeyword("COST"), makeSymbol("SUBCOL-SIMP-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("SUBCOL-SIMP-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Simplifies a #$SubcollectionFunction NAUT by removing redundancies."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$and (#$isa ?X #$Sheep) (#$hates ?X #$Bertolo))))"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$hates ?X #$Bertolo))") });

    private static final SubLInteger $int$212 = makeInteger(212);

    public static final SubLSymbol SUBCOL_SIMP_COST_ESTIMATE = makeSymbol("SUBCOL-SIMP-COST-ESTIMATE");

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLObject $$ReformulatorMode_Simplify = reader_make_constant_shell(makeString("ReformulatorMode-Simplify"));

    public static final SubLSymbol SUBCOL_SIMP_REQUIRED = makeSymbol("SUBCOL-SIMP-REQUIRED");

    public static final SubLSymbol SUBCOL_SIMP_REFORMULATE = makeSymbol("SUBCOL-SIMP-REFORMULATE");

    public static final SubLSymbol $sym9$ISA_LIT_ = makeSymbol("ISA-LIT?");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$CollectionIntersectionFn = reader_make_constant_shell(makeString("CollectionIntersectionFn"));

    public static SubLObject subcol_simp_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $subcol_simp_microseconds$.getGlobalValue();
    }

    public static SubLObject subcol_simp_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != el_formula_with_operator_p(expression, $$CollectionSubsetFn)) && (NIL != el_formula_with_operator_p(cycl_utilities.nat_arg2(expression, UNPROVIDED), $$TheSetOf))) && (NIL != list_utilities.member_eqP($$ReformulatorMode_Simplify, reformulator_datastructures.get_reformulator_modes(settings, mt)))) {
            return subcol_simp_reformulate_int(expression, mt, settings, NIL);
        }
        return NIL;
    }

    public static SubLObject subcol_simp_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        return subcol_simp_reformulate_int(expression, mt, settings, T);
    }

    public static SubLObject subcol_simp_reformulate_int(SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject do_itP) {
        SubLObject successP = NIL;
        final SubLObject base_col = cycl_utilities.nat_arg1(expression, UNPROVIDED);
        final SubLObject cols = extract_relevant_cols_from_base_col(base_col);
        if (NIL != cols) {
            if (NIL != do_itP) {
                expression = copy_expression(expression);
            }
            final SubLObject the_set_of_expr = cycl_utilities.nat_arg2(expression, UNPROVIDED);
            if (NIL != el_formula_with_operator_p(the_set_of_expr, $$TheSetOf)) {
                final SubLObject var = cycl_utilities.nat_arg1(the_set_of_expr, UNPROVIDED);
                SubLObject set_cons;
                SubLObject set_expr;
                for (set_cons = cddr(the_set_of_expr), set_expr = cycl_utilities.nat_arg2(the_set_of_expr, UNPROVIDED); NIL != el_existential_p(set_expr); set_expr = cycl_utilities.formula_arg2(set_expr, UNPROVIDED) , set_cons = cdar(set_cons).rest()) {
                }
                if (NIL != el_conjunction_p(set_expr)) {
                    final SubLObject conjuncts = cycl_utilities.formula_args(set_expr, UNPROVIDED);
                    if (NIL != find_if($sym9$ISA_LIT_, conjuncts, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        SubLObject new_conjuncts = NIL;
                        SubLObject cdolist_list_var = conjuncts;
                        SubLObject conjunct = NIL;
                        conjunct = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (((NIL == el_formula_with_operator_p(conjunct, $$isa)) || (!var.eql(cycl_utilities.formula_arg1(conjunct, UNPROVIDED)))) || (NIL == list_utilities.member_eqP(cycl_utilities.formula_arg2(conjunct, UNPROVIDED), cols))) {
                                new_conjuncts = cons(conjunct, new_conjuncts);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            conjunct = cdolist_list_var.first();
                        } 
                        new_conjuncts = nreverse(new_conjuncts);
                        if (!conjuncts.equal(new_conjuncts)) {
                            successP = T;
                            if ((NIL != new_conjuncts) && (NIL != do_itP)) {
                                final SubLObject new_conjunction = simplifier.simplify_cycl_conjunction(simplifier.conjoin(new_conjuncts, T), UNPROVIDED);
                                rplaca(set_cons, new_conjunction);
                            }
                        }
                    }
                }
            }
        }
        if (NIL != do_itP) {
            return values(expression, successP);
        }
        return successP;
    }

    public static SubLObject extract_relevant_cols_from_base_col(final SubLObject base_col) {
        if (NIL != forts.fort_p(base_col)) {
            return list(base_col);
        }
        if (NIL != el_formula_with_operator_p(base_col, $$CollectionIntersection2Fn)) {
            return cycl_utilities.formula_args(base_col, UNPROVIDED);
        }
        if (NIL != el_formula_with_operator_p(base_col, $$CollectionIntersectionFn)) {
            return cycl_utilities.formula_args(cycl_utilities.formula_arg1(base_col, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_subcollection_simplifier_file() {
        declareFunction(me, "subcol_simp_cost_estimate", "SUBCOL-SIMP-COST-ESTIMATE", 3, 0, false);
        declareFunction(me, "subcol_simp_required", "SUBCOL-SIMP-REQUIRED", 3, 0, false);
        declareFunction(me, "subcol_simp_reformulate", "SUBCOL-SIMP-REFORMULATE", 4, 0, false);
        declareFunction(me, "subcol_simp_reformulate_int", "SUBCOL-SIMP-REFORMULATE-INT", 4, 0, false);
        declareFunction(me, "extract_relevant_cols_from_base_col", "EXTRACT-RELEVANT-COLS-FROM-BASE-COL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_subcollection_simplifier_file() {
        deflexical("*SUBCOL-SIMP-MICROSECONDS*", $int$212);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_subcollection_simplifier_file() {
        reformulator_module_harness.declare_rl_module($$SubcollectionSimplifierRLModule, $list1);
        note_funcall_helper_function(SUBCOL_SIMP_COST_ESTIMATE);
        note_funcall_helper_function(SUBCOL_SIMP_REQUIRED);
        note_funcall_helper_function(SUBCOL_SIMP_REFORMULATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_subcollection_simplifier_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_subcollection_simplifier_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_subcollection_simplifier_file();
    }

    
}

/**
 * Total time: 27 ms
 */
