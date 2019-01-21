package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_dates extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_dates";
    public static final String myFingerPrint = "7ca8c2b69a54bbafd5f3df36134994d260487a3595bdd2a4ecb38da8778865fd";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1396L)
    private static SubLSymbol $dates_reformulation_microseconds$;
    private static final SubLObject $const0$DatesReformulatorRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$1200;
    private static final SubLSymbol $kw3$IGNORE;
    private static final SubLObject $const4$TemporalThing;
    private static final SubLObject $const5$YearFn;
    private static final SubLString $str6$Dates__Integers_to_Years;
    private static final SubLString $str7$Dates_Reformulation;
    private static final SubLString $str8$dates_reformulation_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1458L)
    public static SubLObject dates_reformulation_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_dates.$dates_reformulation_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1764L)
    public static SubLObject dates_reformulation_check_expression(final SubLObject expression) {
        return (SubLObject)SubLObjectFactory.makeBoolean(reformulator_module_dates.NIL != clauses.clauses_p(expression) && reformulator_module_dates.NIL != list_utilities.singletonP(expression) && reformulator_module_dates.NIL != clause_utilities.pos_atomic_cnf_p(expression.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 1944L)
    public static SubLObject dates_reformulation_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_dates.NIL != dates_reformulation_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (reformulator_module_dates.NIL != el_utilities.el_formula_p(asent)) {
                SubLObject matchP = (SubLObject)reformulator_module_dates.NIL;
                if (reformulator_module_dates.NIL != contains_integers_to_reformulateP(asent, mt)) {
                    matchP = (SubLObject)reformulator_module_dates.T;
                }
                return matchP;
            }
        }
        return (SubLObject)reformulator_module_dates.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 2408L)
    public static SubLObject contains_integers_to_reformulateP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        SubLObject arg_numbers = (SubLObject)reformulator_module_dates.NIL;
        if (reformulator_module_dates.NIL != forts.fort_p(pred)) {
            SubLObject arg_num = (SubLObject)reformulator_module_dates.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, (SubLObject)reformulator_module_dates.$kw3$IGNORE);
            SubLObject arg = (SubLObject)reformulator_module_dates.NIL;
            arg = cdolist_list_var.first();
            while (reformulator_module_dates.NIL != cdolist_list_var) {
                arg_num = Numbers.add(arg_num, (SubLObject)reformulator_module_dates.ONE_INTEGER);
                SubLObject csome_list_var;
                final SubLObject arg_isa_constraints = csome_list_var = kb_accessors.min_argn_isa(pred, arg_num, (SubLObject)reformulator_module_dates.UNPROVIDED);
                SubLObject constraint = (SubLObject)reformulator_module_dates.NIL;
                constraint = csome_list_var.first();
                while (reformulator_module_dates.NIL != csome_list_var) {
                    if (arg.isInteger() && reformulator_module_dates.NIL != genls.genlsP(constraint, reformulator_module_dates.$const4$TemporalThing, mt, (SubLObject)reformulator_module_dates.UNPROVIDED)) {
                        arg_numbers = (SubLObject)ConsesLow.cons(arg_num, arg_numbers);
                    }
                    csome_list_var = csome_list_var.rest();
                    constraint = csome_list_var.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return arg_numbers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 3118L)
    public static SubLObject dates_reformulation_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_dates.NIL != dates_reformulation_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = (SubLObject)reformulator_module_dates.NIL;
            SubLObject justification = (SubLObject)reformulator_module_dates.T;
            final SubLObject date_args = contains_integers_to_reformulateP(asent, mt);
            if (reformulator_module_dates.NIL != el_utilities.el_formula_p(asent) && reformulator_module_dates.NIL != list_utilities.sublisp_boolean(date_args)) {
                thread.resetMultipleValues();
                final SubLObject new_sentence_$1 = dates_reformulation_reformulate_years(asent, date_args, mt, settings, original_clause);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                new_sentence = new_sentence_$1;
                justification = justification_$2;
            }
            return Values.values((SubLObject)ConsesLow.list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
        }
        return Values.values(expression, (SubLObject)reformulator_module_dates.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-dates.lisp", position = 3803L)
    public static SubLObject dates_reformulation_reformulate_years(final SubLObject expression, final SubLObject date_args, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_dates.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_dates.NIL;
        }
        if (date_args.isCons() && reformulator_module_dates.NIL != list_utilities.sublisp_boolean(date_args)) {
            SubLObject new_sentence;
            final SubLObject asent = new_sentence = conses_high.copy_tree(expression);
            SubLObject cdolist_list_var = date_args;
            SubLObject arg_num = (SubLObject)reformulator_module_dates.NIL;
            arg_num = cdolist_list_var.first();
            while (reformulator_module_dates.NIL != cdolist_list_var) {
                final SubLObject int_arg = cycl_utilities.formula_arg(asent, arg_num, (SubLObject)reformulator_module_dates.UNPROVIDED);
                final SubLObject year_arg = el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_dates.$const5$YearFn, int_arg));
                new_sentence = el_utilities.replace_formula_arg(arg_num, year_arg, new_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                arg_num = cdolist_list_var.first();
            }
            return Values.values(new_sentence, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_dates.$str6$Dates__Integers_to_Years));
        }
        return (SubLObject)reformulator_module_dates.NIL;
    }
    
    public static SubLObject declare_reformulator_module_dates_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "dates_reformulation_cost_estimate", "DATES-REFORMULATION-COST-ESTIMATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "dates_reformulation_check_expression", "DATES-REFORMULATION-CHECK-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "dates_reformulation_expression_required", "DATES-REFORMULATION-EXPRESSION-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "contains_integers_to_reformulateP", "CONTAINS-INTEGERS-TO-REFORMULATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "dates_reformulation_reformulate", "DATES-REFORMULATION-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_dates", "dates_reformulation_reformulate_years", "DATES-REFORMULATION-REFORMULATE-YEARS", 4, 1, false);
        return (SubLObject)reformulator_module_dates.NIL;
    }
    
    public static SubLObject init_reformulator_module_dates_file() {
        reformulator_module_dates.$dates_reformulation_microseconds$ = SubLFiles.deflexical("*DATES-REFORMULATION-MICROSECONDS*", (SubLObject)reformulator_module_dates.$int2$1200);
        return (SubLObject)reformulator_module_dates.NIL;
    }
    
    public static SubLObject setup_reformulator_module_dates_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_dates.$const0$DatesReformulatorRLModule, (SubLObject)reformulator_module_dates.$list1);
        sunit_external.define_test_category((SubLObject)reformulator_module_dates.$str7$Dates_Reformulation, (SubLObject)reformulator_module_dates.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)reformulator_module_dates.$str8$dates_reformulation_test_suite, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_dates.$str7$Dates_Reformulation), (SubLObject)reformulator_module_dates.UNPROVIDED, (SubLObject)reformulator_module_dates.UNPROVIDED);
        return (SubLObject)reformulator_module_dates.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_reformulator_module_dates_file();
    }
    
    @Override
	public void initializeVariables() {
        init_reformulator_module_dates_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_reformulator_module_dates_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_dates();
        reformulator_module_dates.$dates_reformulation_microseconds$ = null;
        $const0$DatesReformulatorRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DatesReformulatorRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("DATES-REFORMULATION-EXPRESSION-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("DATES-REFORMULATION-COST-ESTIMATE"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("DATES-REFORMULATION-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Reformulates numbers into proper date-denoting CycL expressions."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$birthDate #$JohnKennedy 1917)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$birthDate #$JohnKennedy (#$YearFn 1917))") });
        $int2$1200 = SubLObjectFactory.makeInteger(1200);
        $kw3$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const4$TemporalThing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporalThing"));
        $const5$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $str6$Dates__Integers_to_Years = SubLObjectFactory.makeString("Dates: Integers to Years");
        $str7$Dates_Reformulation = SubLObjectFactory.makeString("Dates Reformulation");
        $str8$dates_reformulation_test_suite = SubLObjectFactory.makeString("dates-reformulation-test-suite");
    }
}

/*

	Total time: 28 ms
	
*/