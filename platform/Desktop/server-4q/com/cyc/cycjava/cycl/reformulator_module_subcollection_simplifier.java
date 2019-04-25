package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_subcollection_simplifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier";
    public static final String myFingerPrint = "eef50d7f6683594af6a00ce10fad7d6fe81297faa6acd0caef6a76e31338ed39";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1459L)
    private static SubLSymbol $subcol_simp_microseconds$;
    private static final SubLObject $const0$SubcollectionSimplifierRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$212;
    private static final SubLSymbol $sym3$SUBCOL_SIMP_COST_ESTIMATE;
    private static final SubLObject $const4$CollectionSubsetFn;
    private static final SubLObject $const5$TheSetOf;
    private static final SubLObject $const6$ReformulatorMode_Simplify;
    private static final SubLSymbol $sym7$SUBCOL_SIMP_REQUIRED;
    private static final SubLSymbol $sym8$SUBCOL_SIMP_REFORMULATE;
    private static final SubLSymbol $sym9$ISA_LIT_;
    private static final SubLObject $const10$isa;
    private static final SubLObject $const11$CollectionIntersection2Fn;
    private static final SubLObject $const12$CollectionIntersectionFn;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1512L)
    public static SubLObject subcol_simp_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_subcollection_simplifier.$subcol_simp_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 1860L)
    public static SubLObject subcol_simp_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_subcollection_simplifier.NIL != el_utilities.el_formula_with_operator_p(expression, reformulator_module_subcollection_simplifier.$const4$CollectionSubsetFn) && reformulator_module_subcollection_simplifier.NIL != el_utilities.el_formula_with_operator_p(cycl_utilities.nat_arg2(expression, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED), reformulator_module_subcollection_simplifier.$const5$TheSetOf) && reformulator_module_subcollection_simplifier.NIL != list_utilities.member_eqP(reformulator_module_subcollection_simplifier.$const6$ReformulatorMode_Simplify, reformulator_datastructures.get_reformulator_modes(settings, mt))) {
            return subcol_simp_reformulate_int(expression, mt, settings, (SubLObject)reformulator_module_subcollection_simplifier.NIL);
        }
        return (SubLObject)reformulator_module_subcollection_simplifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 2350L)
    public static SubLObject subcol_simp_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        return subcol_simp_reformulate_int(expression, mt, settings, (SubLObject)reformulator_module_subcollection_simplifier.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 2620L)
    public static SubLObject subcol_simp_reformulate_int(SubLObject expression, final SubLObject mt, final SubLObject settings, final SubLObject do_itP) {
        SubLObject successP = (SubLObject)reformulator_module_subcollection_simplifier.NIL;
        final SubLObject base_col = cycl_utilities.nat_arg1(expression, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
        final SubLObject cols = extract_relevant_cols_from_base_col(base_col);
        if (reformulator_module_subcollection_simplifier.NIL != cols) {
            if (reformulator_module_subcollection_simplifier.NIL != do_itP) {
                expression = el_utilities.copy_expression(expression);
            }
            final SubLObject the_set_of_expr = cycl_utilities.nat_arg2(expression, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
            if (reformulator_module_subcollection_simplifier.NIL != el_utilities.el_formula_with_operator_p(the_set_of_expr, reformulator_module_subcollection_simplifier.$const5$TheSetOf)) {
                final SubLObject var = cycl_utilities.nat_arg1(the_set_of_expr, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
                SubLObject set_cons;
                SubLObject set_expr;
                for (set_cons = conses_high.cddr(the_set_of_expr), set_expr = cycl_utilities.nat_arg2(the_set_of_expr, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED); reformulator_module_subcollection_simplifier.NIL != el_utilities.el_existential_p(set_expr); set_expr = cycl_utilities.formula_arg2(set_expr, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED), set_cons = conses_high.cdar(set_cons).rest()) {}
                if (reformulator_module_subcollection_simplifier.NIL != el_utilities.el_conjunction_p(set_expr)) {
                    final SubLObject conjuncts = cycl_utilities.formula_args(set_expr, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
                    if (reformulator_module_subcollection_simplifier.NIL != Sequences.find_if((SubLObject)reformulator_module_subcollection_simplifier.$sym9$ISA_LIT_, conjuncts, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED)) {
                        SubLObject new_conjuncts = (SubLObject)reformulator_module_subcollection_simplifier.NIL;
                        SubLObject cdolist_list_var = conjuncts;
                        SubLObject conjunct = (SubLObject)reformulator_module_subcollection_simplifier.NIL;
                        conjunct = cdolist_list_var.first();
                        while (reformulator_module_subcollection_simplifier.NIL != cdolist_list_var) {
                            if (reformulator_module_subcollection_simplifier.NIL == el_utilities.el_formula_with_operator_p(conjunct, reformulator_module_subcollection_simplifier.$const10$isa) || !var.eql(cycl_utilities.formula_arg1(conjunct, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED)) || reformulator_module_subcollection_simplifier.NIL == list_utilities.member_eqP(cycl_utilities.formula_arg2(conjunct, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED), cols)) {
                                new_conjuncts = (SubLObject)ConsesLow.cons(conjunct, new_conjuncts);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            conjunct = cdolist_list_var.first();
                        }
                        new_conjuncts = Sequences.nreverse(new_conjuncts);
                        if (!conjuncts.equal(new_conjuncts)) {
                            successP = (SubLObject)reformulator_module_subcollection_simplifier.T;
                            if (reformulator_module_subcollection_simplifier.NIL != new_conjuncts && reformulator_module_subcollection_simplifier.NIL != do_itP) {
                                final SubLObject new_conjunction = simplifier.simplify_cycl_conjunction(simplifier.conjoin(new_conjuncts, (SubLObject)reformulator_module_subcollection_simplifier.T), (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
                                ConsesLow.rplaca(set_cons, new_conjunction);
                            }
                        }
                    }
                }
            }
        }
        if (reformulator_module_subcollection_simplifier.NIL != do_itP) {
            return Values.values(expression, successP);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-subcollection-simplifier.lisp", position = 4341L)
    public static SubLObject extract_relevant_cols_from_base_col(final SubLObject base_col) {
        if (reformulator_module_subcollection_simplifier.NIL != forts.fort_p(base_col)) {
            return (SubLObject)ConsesLow.list(base_col);
        }
        if (reformulator_module_subcollection_simplifier.NIL != el_utilities.el_formula_with_operator_p(base_col, reformulator_module_subcollection_simplifier.$const11$CollectionIntersection2Fn)) {
            return cycl_utilities.formula_args(base_col, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
        }
        if (reformulator_module_subcollection_simplifier.NIL != el_utilities.el_formula_with_operator_p(base_col, reformulator_module_subcollection_simplifier.$const12$CollectionIntersectionFn)) {
            return cycl_utilities.formula_args(cycl_utilities.formula_arg1(base_col, (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED), (SubLObject)reformulator_module_subcollection_simplifier.UNPROVIDED);
        }
        return (SubLObject)reformulator_module_subcollection_simplifier.NIL;
    }
    
    public static SubLObject declare_reformulator_module_subcollection_simplifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier", "subcol_simp_cost_estimate", "SUBCOL-SIMP-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier", "subcol_simp_required", "SUBCOL-SIMP-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier", "subcol_simp_reformulate", "SUBCOL-SIMP-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier", "subcol_simp_reformulate_int", "SUBCOL-SIMP-REFORMULATE-INT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_subcollection_simplifier", "extract_relevant_cols_from_base_col", "EXTRACT-RELEVANT-COLS-FROM-BASE-COL", 1, 0, false);
        return (SubLObject)reformulator_module_subcollection_simplifier.NIL;
    }
    
    public static SubLObject init_reformulator_module_subcollection_simplifier_file() {
        reformulator_module_subcollection_simplifier.$subcol_simp_microseconds$ = SubLFiles.deflexical("*SUBCOL-SIMP-MICROSECONDS*", (SubLObject)reformulator_module_subcollection_simplifier.$int2$212);
        return (SubLObject)reformulator_module_subcollection_simplifier.NIL;
    }
    
    public static SubLObject setup_reformulator_module_subcollection_simplifier_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_subcollection_simplifier.$const0$SubcollectionSimplifierRLModule, (SubLObject)reformulator_module_subcollection_simplifier.$list1);
        utilities_macros.note_funcall_helper_function((SubLObject)reformulator_module_subcollection_simplifier.$sym3$SUBCOL_SIMP_COST_ESTIMATE);
        utilities_macros.note_funcall_helper_function((SubLObject)reformulator_module_subcollection_simplifier.$sym7$SUBCOL_SIMP_REQUIRED);
        utilities_macros.note_funcall_helper_function((SubLObject)reformulator_module_subcollection_simplifier.$sym8$SUBCOL_SIMP_REFORMULATE);
        return (SubLObject)reformulator_module_subcollection_simplifier.NIL;
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
    
    static {
        me = (SubLFile)new reformulator_module_subcollection_simplifier();
        reformulator_module_subcollection_simplifier.$subcol_simp_microseconds$ = null;
        $const0$SubcollectionSimplifierRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionSimplifierRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("SUBCOL-SIMP-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("SUBCOL-SIMP-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("SUBCOL-SIMP-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Simplifies a #$SubcollectionFunction NAUT by removing redundancies."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$and (#$isa ?X #$Sheep) (#$hates ?X #$Bertolo))))"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$CollectionSubsetFn #$Sheep (#$TheSetOf ?X (#$hates ?X #$Bertolo))") });
        $int2$212 = SubLObjectFactory.makeInteger(212);
        $sym3$SUBCOL_SIMP_COST_ESTIMATE = SubLObjectFactory.makeSymbol("SUBCOL-SIMP-COST-ESTIMATE");
        $const4$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $const5$TheSetOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf"));
        $const6$ReformulatorMode_Simplify = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorMode-Simplify"));
        $sym7$SUBCOL_SIMP_REQUIRED = SubLObjectFactory.makeSymbol("SUBCOL-SIMP-REQUIRED");
        $sym8$SUBCOL_SIMP_REFORMULATE = SubLObjectFactory.makeSymbol("SUBCOL-SIMP-REFORMULATE");
        $sym9$ISA_LIT_ = SubLObjectFactory.makeSymbol("ISA-LIT?");
        $const10$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const11$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const12$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
    }
}

/*

	Total time: 27 ms
	
*/