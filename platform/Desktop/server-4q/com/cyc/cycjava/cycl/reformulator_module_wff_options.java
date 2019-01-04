package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_module_wff_options extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_wff_options";
    public static final String myFingerPrint = "9fc40d2998b49001360db7a70cbae6eb586b89a78ca8220bdfc7693332c3a61f";
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 2237L)
    private static SubLSymbol $wff_options_microseconds$;
    private static final SubLObject $const0$WffViolationResolutionRLModule;
    private static final SubLList $list1;
    private static final SubLInteger $int2$20000;
    private static final SubLObject $const3$isa;
    private static final SubLSymbol $kw4$MAL_ARG_WRT_ARG_ISA;
    private static final SubLSymbol $sym5$FIRST;
    private static final SubLSymbol $kw6$IGNORE;
    private static final SubLSymbol $kw7$MAL_ARG_WRT_INTER_ARG_ISA;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLString $str10$Wff_Options_1_1a;
    private static final SubLString $str11$Wff_Options_1_1b;
    private static final SubLString $str12$Wff_Options_2_1;
    private static final SubLObject $const13$forAll;
    private static final SubLObject $const14$implies;
    private static final SubLObject $const15$thereExists;
    private static final SubLObject $const16$and;
    private static final SubLString $str17$Wff_Violation_Resolution_Processi;
    private static final SubLString $str18$wff_options_proc_test_suite;
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 1447L)
    public static SubLObject wff_options_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (reformulator_module_wff_options.NIL != clauses.clauses_p(expression) && reformulator_module_wff_options.NIL != list_utilities.singletonP(expression) && reformulator_module_wff_options.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (reformulator_module_wff_options.NIL != el_utilities.el_formula_p(asent)) {
                SubLObject matchP = (SubLObject)reformulator_module_wff_options.NIL;
                if (reformulator_module_wff_options.NIL != wff_options_malf_arg_wrt_isaP(asent, mt) || reformulator_module_wff_options.NIL != wff_options_malf_arg_wrt_interargisaP(asent, mt)) {
                    matchP = (SubLObject)reformulator_module_wff_options.T;
                }
                return matchP;
            }
        }
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 2302L)
    public static SubLObject wff_options_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return reformulator_module_wff_options.$wff_options_microseconds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 2431L)
    public static SubLObject wff_options_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (reformulator_module_wff_options.NIL != clauses.clauses_p(expression) && reformulator_module_wff_options.NIL != list_utilities.singletonP(expression) && reformulator_module_wff_options.NIL != clause_utilities.pos_atomic_cnf_p(expression.first())) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentences = (SubLObject)reformulator_module_wff_options.NIL;
            SubLObject justification = (SubLObject)reformulator_module_wff_options.T;
            if (reformulator_module_wff_options.NIL != el_utilities.el_formula_p(asent) && reformulator_module_wff_options.NIL != fort_types_interface.isa_predicateP(cycl_utilities.formula_operator(asent), mt)) {
                final SubLObject wrt_isa_argnum = wff_options_malf_arg_wrt_isaP(asent, mt);
                final SubLObject wrt_interarg_isa_list = wff_options_malf_arg_wrt_interargisaP(asent, mt);
                if (reformulator_module_wff_options.NIL != list_utilities.sublisp_boolean(wrt_isa_argnum)) {
                    thread.resetMultipleValues();
                    final SubLObject new_sentences_$1 = wff_options_reformulate_malf_arg_wrt_isa(asent, wrt_isa_argnum, mt, settings, original_clause);
                    final SubLObject justification_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_sentences = new_sentences_$1;
                    justification = justification_$2;
                }
                else {
                    if (reformulator_module_wff_options.NIL == wrt_interarg_isa_list.first()) {
                        return (SubLObject)reformulator_module_wff_options.NIL;
                    }
                    thread.resetMultipleValues();
                    final SubLObject new_sentences_$2 = wff_options_reformulate_malf_arg_wrt_interargisa(asent, wrt_interarg_isa_list, mt, settings, original_clause);
                    final SubLObject justification_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_sentences = new_sentences_$2;
                    justification = justification_$3;
                }
                if (reformulator_module_wff_options.NIL != new_sentences) {
                    return Values.values(new_sentences, justification);
                }
            }
            return Values.values((SubLObject)ConsesLow.list(expression), (SubLObject)reformulator_module_wff_options.NIL);
        }
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 3780L)
    public static SubLObject wff_options_malf_arg_wrt_isaP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (reformulator_module_wff_options.NIL != fort_types_interface.isa_predicateP(pred, mt) && !pred.eql(reformulator_module_wff_options.$const3$isa)) {
            final SubLObject all_violations = wff.why_not_wff_assert(asent, mt, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
            final SubLObject violations = Sequences.find((SubLObject)reformulator_module_wff_options.$kw4$MAL_ARG_WRT_ARG_ISA, all_violations, Symbols.symbol_function((SubLObject)reformulator_module_wff_options.EQL), Symbols.symbol_function((SubLObject)reformulator_module_wff_options.$sym5$FIRST), (SubLObject)reformulator_module_wff_options.UNPROVIDED, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
            if (reformulator_module_wff_options.NIL != violations) {
                SubLObject malf_arg = (SubLObject)reformulator_module_wff_options.NIL;
                final SubLObject terms = cycl_utilities.formula_terms(asent, (SubLObject)reformulator_module_wff_options.$kw6$IGNORE);
                SubLObject list_var = (SubLObject)reformulator_module_wff_options.NIL;
                SubLObject arg = (SubLObject)reformulator_module_wff_options.NIL;
                SubLObject argnum = (SubLObject)reformulator_module_wff_options.NIL;
                list_var = terms;
                arg = list_var.first();
                for (argnum = (SubLObject)reformulator_module_wff_options.ZERO_INTEGER; reformulator_module_wff_options.NIL == malf_arg && reformulator_module_wff_options.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                    if (!arg.eql(pred) && reformulator_module_wff_options.NIL != forts.fort_p(arg)) {
                        final SubLObject arg_isa_constraints = kb_accessors.argn_isa(pred, argnum, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
                        final SubLObject argcol = arg_isa_constraints.first();
                        SubLObject cdolist_list_var = arg_isa_constraints;
                        SubLObject constraint = (SubLObject)reformulator_module_wff_options.NIL;
                        constraint = cdolist_list_var.first();
                        while (reformulator_module_wff_options.NIL != cdolist_list_var) {
                            if (reformulator_module_wff_options.NIL == isa.isaP(arg, argcol, mt, (SubLObject)reformulator_module_wff_options.UNPROVIDED) && reformulator_module_wff_options.NIL != genls.genlsP(arg, constraint, mt, (SubLObject)reformulator_module_wff_options.UNPROVIDED)) {
                                malf_arg = arg;
                                return argnum;
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 5046L)
    public static SubLObject wff_options_malf_arg_wrt_interargisaP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (reformulator_module_wff_options.NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            final SubLObject all_violations = wff.why_not_wff_assert(asent, mt, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
            final SubLObject malf_justification;
            final SubLObject violation = malf_justification = Sequences.find((SubLObject)reformulator_module_wff_options.$kw7$MAL_ARG_WRT_INTER_ARG_ISA, all_violations, Symbols.symbol_function((SubLObject)reformulator_module_wff_options.EQL), Symbols.symbol_function((SubLObject)reformulator_module_wff_options.$sym5$FIRST), (SubLObject)reformulator_module_wff_options.UNPROVIDED, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
            final SubLObject malf_term = conses_high.second(malf_justification);
            if (reformulator_module_wff_options.NIL != violation && reformulator_module_wff_options.NIL != forts.fort_p(malf_term)) {
                if (reformulator_module_wff_options.$kw7$MAL_ARG_WRT_INTER_ARG_ISA.eql(malf_justification.first()) && reformulator_module_wff_options.NIL != genls.genlsP(malf_term, conses_high.fifth(malf_justification), mt, (SubLObject)reformulator_module_wff_options.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list((SubLObject)reformulator_module_wff_options.T, conses_high.fourth(malf_justification));
                }
                return (SubLObject)reformulator_module_wff_options.NIL;
            }
        }
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 6104L)
    public static SubLObject wff_options_reformulate_malf_arg_wrt_isa(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_wff_options.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_wff_options.NIL;
        }
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (argnum.numE((SubLObject)reformulator_module_wff_options.ZERO_INTEGER)) {
            return (SubLObject)reformulator_module_wff_options.NIL;
        }
        if (reformulator_module_wff_options.$list8.equal(kb_accessors.arg1_format(pred, mt)) || reformulator_module_wff_options.$list9.equal(kb_accessors.arg1_format(pred, mt))) {
            return Values.values((SubLObject)ConsesLow.list(wff_options_instance_existential(asent, argnum, original_clause)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_wff_options.$str10$Wff_Options_1_1a));
        }
        return Values.values((SubLObject)ConsesLow.list(wff_options_instance_existential(asent, argnum, original_clause), wff_options_instance_universal(asent, argnum, original_clause)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_wff_options.$str11$Wff_Options_1_1b));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 7078L)
    public static SubLObject wff_options_reformulate_malf_arg_wrt_interargisa(final SubLObject asent, final SubLObject argnum_list, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == reformulator_module_wff_options.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_wff_options.NIL;
        }
        final SubLObject argnum = conses_high.second(argnum_list);
        if (!argnum.numE((SubLObject)reformulator_module_wff_options.ZERO_INTEGER)) {
            return Values.values((SubLObject)ConsesLow.list(wff_options_instance_existential(asent, argnum, original_clause)), (SubLObject)ConsesLow.list((SubLObject)reformulator_module_wff_options.$str12$Wff_Options_2_1));
        }
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 7560L)
    public static SubLObject wff_options_instance_universal(final SubLObject asent, final SubLObject argnum, SubLObject original_clause) {
        if (original_clause == reformulator_module_wff_options.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_wff_options.NIL;
        }
        final SubLObject thesent = conses_high.copy_tree(asent);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, thesent), (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        final SubLObject new_universal_sent = el_utilities.replace_formula_arg(argnum, new_var, thesent);
        final SubLObject col = cycl_utilities.formula_arg(thesent, argnum, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_wff_options.$const13$forAll, new_var, (SubLObject)ConsesLow.list(reformulator_module_wff_options.$const14$implies, (SubLObject)ConsesLow.list(reformulator_module_wff_options.$const3$isa, new_var, col), new_universal_sent)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/reformulator-module-wff-options.lisp", position = 8059L)
    public static SubLObject wff_options_instance_existential(final SubLObject asent, final SubLObject argnum, SubLObject original_clause) {
        if (original_clause == reformulator_module_wff_options.UNPROVIDED) {
            original_clause = (SubLObject)reformulator_module_wff_options.NIL;
        }
        final SubLObject thesent = conses_high.copy_tree(asent);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression((SubLObject)ConsesLow.list(original_clause, thesent), (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        final SubLObject new_existential_sent = el_utilities.replace_formula_arg(argnum, new_var, thesent);
        final SubLObject col = cycl_utilities.formula_arg(thesent, argnum, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        return el_utilities.list_to_elf((SubLObject)ConsesLow.list(reformulator_module_wff_options.$const15$thereExists, new_var, (SubLObject)ConsesLow.list(reformulator_module_wff_options.$const16$and, (SubLObject)ConsesLow.list(reformulator_module_wff_options.$const3$isa, new_var, col), new_existential_sent)));
    }
    
    public static SubLObject declare_reformulator_module_wff_options_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_required", "WFF-OPTIONS-REQUIRED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_cost", "WFF-OPTIONS-COST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_reformulate", "WFF-OPTIONS-REFORMULATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_malf_arg_wrt_isaP", "WFF-OPTIONS-MALF-ARG-WRT-ISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_malf_arg_wrt_interargisaP", "WFF-OPTIONS-MALF-ARG-WRT-INTERARGISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_reformulate_malf_arg_wrt_isa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-ISA", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_reformulate_malf_arg_wrt_interargisa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-INTERARGISA", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_instance_universal", "WFF-OPTIONS-INSTANCE-UNIVERSAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.reformulator_module_wff_options", "wff_options_instance_existential", "WFF-OPTIONS-INSTANCE-EXISTENTIAL", 2, 1, false);
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    public static SubLObject init_reformulator_module_wff_options_file() {
        reformulator_module_wff_options.$wff_options_microseconds$ = SubLFiles.deflexical("*WFF-OPTIONS-MICROSECONDS*", (SubLObject)reformulator_module_wff_options.$int2$20000);
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    public static SubLObject setup_reformulator_module_wff_options_file() {
        reformulator_module_harness.declare_rl_module(reformulator_module_wff_options.$const0$WffViolationResolutionRLModule, (SubLObject)reformulator_module_wff_options.$list1);
        sunit_external.define_test_category((SubLObject)reformulator_module_wff_options.$str17$Wff_Violation_Resolution_Processi, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)reformulator_module_wff_options.$str18$wff_options_proc_test_suite, (SubLObject)ConsesLow.list((SubLObject)reformulator_module_wff_options.$str17$Wff_Violation_Resolution_Processi), (SubLObject)reformulator_module_wff_options.UNPROVIDED, (SubLObject)reformulator_module_wff_options.UNPROVIDED);
        return (SubLObject)reformulator_module_wff_options.NIL;
    }
    
    public void declareFunctions() {
        declare_reformulator_module_wff_options_file();
    }
    
    public void initializeVariables() {
        init_reformulator_module_wff_options_file();
    }
    
    public void runTopLevelForms() {
        setup_reformulator_module_wff_options_file();
    }
    
    static {
        me = (SubLFile)new reformulator_module_wff_options();
        reformulator_module_wff_options.$wff_options_microseconds$ = null;
        $const0$WffViolationResolutionRLModule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WffViolationResolutionRLModule"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("WFF-OPTIONS-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("WFF-OPTIONS-COST"), SubLObjectFactory.makeKeyword("REFORMULATE"), SubLObjectFactory.makeSymbol("WFF-OPTIONS-REFORMULATE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Returns wff alternatives to several common instance-type violations."), SubLObjectFactory.makeKeyword("EXAMPLE-SOURCE"), SubLObjectFactory.makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), SubLObjectFactory.makeKeyword("EXAMPLE-TARGET"), SubLObjectFactory.makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });
        $int2$20000 = SubLObjectFactory.makeInteger(20000);
        $const3$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw4$MAL_ARG_WRT_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-ARG-ISA");
        $sym5$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $kw6$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw7$MAL_ARG_WRT_INTER_ARG_ISA = SubLObjectFactory.makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleEntry")));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs")));
        $str10$Wff_Options_1_1a = SubLObjectFactory.makeString("Wff Options 1.1a");
        $str11$Wff_Options_1_1b = SubLObjectFactory.makeString("Wff Options 1.1b");
        $str12$Wff_Options_2_1 = SubLObjectFactory.makeString("Wff Options 2.1");
        $const13$forAll = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll"));
        $const14$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const15$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $const16$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $str17$Wff_Violation_Resolution_Processi = SubLObjectFactory.makeString("Wff Violation Resolution Processing");
        $str18$wff_options_proc_test_suite = SubLObjectFactory.makeString("wff-options-proc-test-suite");
    }
}

/*

	Total time: 43 ms
	
*/