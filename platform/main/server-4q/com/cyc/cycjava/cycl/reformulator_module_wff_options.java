package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class reformulator_module_wff_options extends SubLTranslatedFile {
    public static final SubLFile me = new reformulator_module_wff_options();

    public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_wff_options";

    public static final String myFingerPrint = "9fc40d2998b49001360db7a70cbae6eb586b89a78ca8220bdfc7693332c3a61f";

    // deflexical
    private static final SubLSymbol $wff_options_microseconds$ = makeSymbol("*WFF-OPTIONS-MICROSECONDS*");

    private static final SubLObject $$WffViolationResolutionRLModule = reader_make_constant_shell(makeString("WffViolationResolutionRLModule"));

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("WFF-OPTIONS-REQUIRED"), makeKeyword("COST"), makeSymbol("WFF-OPTIONS-COST"), makeKeyword("REFORMULATE"), makeSymbol("WFF-OPTIONS-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Returns wff alternatives to several common instance-type violations."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });

    private static final SubLInteger $int$20000 = makeInteger(20000);

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");





    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");

    public static final SubLList $list8 = list(reader_make_constant_shell(makeString("SingleEntry")));

    public static final SubLList $list9 = list(reader_make_constant_shell(makeString("singleEntryFormatInArgs")));

    public static final SubLString $str10$Wff_Options_1_1a = makeString("Wff Options 1.1a");

    public static final SubLString $str11$Wff_Options_1_1b = makeString("Wff Options 1.1b");

    public static final SubLString $str12$Wff_Options_2_1 = makeString("Wff Options 2.1");

    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLString $str17$Wff_Violation_Resolution_Processi = makeString("Wff Violation Resolution Processing");

    public static final SubLString $str18$wff_options_proc_test_suite = makeString("wff-options-proc-test-suite");

    public static SubLObject wff_options_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (NIL != el_formula_p(asent)) {
                SubLObject matchP = NIL;
                if ((NIL != wff_options_malf_arg_wrt_isaP(asent, mt)) || (NIL != wff_options_malf_arg_wrt_interargisaP(asent, mt))) {
                    matchP = T;
                }
                return matchP;
            }
        }
        return NIL;
    }

    public static SubLObject wff_options_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $wff_options_microseconds$.getGlobalValue();
    }

    public static SubLObject wff_options_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentences = NIL;
            SubLObject justification = T;
            if ((NIL != el_formula_p(asent)) && (NIL != fort_types_interface.isa_predicateP(cycl_utilities.formula_operator(asent), mt))) {
                final SubLObject wrt_isa_argnum = wff_options_malf_arg_wrt_isaP(asent, mt);
                final SubLObject wrt_interarg_isa_list = wff_options_malf_arg_wrt_interargisaP(asent, mt);
                if (NIL != list_utilities.sublisp_boolean(wrt_isa_argnum)) {
                    thread.resetMultipleValues();
                    final SubLObject new_sentences_$1 = wff_options_reformulate_malf_arg_wrt_isa(asent, wrt_isa_argnum, mt, settings, original_clause);
                    final SubLObject justification_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_sentences = new_sentences_$1;
                    justification = justification_$2;
                } else {
                    if (NIL == wrt_interarg_isa_list.first()) {
                        return NIL;
                    }
                    thread.resetMultipleValues();
                    final SubLObject new_sentences_$2 = wff_options_reformulate_malf_arg_wrt_interargisa(asent, wrt_interarg_isa_list, mt, settings, original_clause);
                    final SubLObject justification_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_sentences = new_sentences_$2;
                    justification = justification_$3;
                }
                if (NIL != new_sentences) {
                    return values(new_sentences, justification);
                }
            }
            return values(list(expression), NIL);
        }
        return NIL;
    }

    public static SubLObject wff_options_malf_arg_wrt_isaP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if ((NIL != fort_types_interface.isa_predicateP(pred, mt)) && (!pred.eql($$isa))) {
            final SubLObject all_violations = wff.why_not_wff_assert(asent, mt, UNPROVIDED);
            final SubLObject violations = find($MAL_ARG_WRT_ARG_ISA, all_violations, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if (NIL != violations) {
                SubLObject malf_arg = NIL;
                final SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                SubLObject list_var = NIL;
                SubLObject arg = NIL;
                SubLObject argnum = NIL;
                list_var = terms;
                arg = list_var.first();
                for (argnum = ZERO_INTEGER; (NIL == malf_arg) && (NIL != list_var); list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                    if ((!arg.eql(pred)) && (NIL != forts.fort_p(arg))) {
                        final SubLObject arg_isa_constraints = kb_accessors.argn_isa(pred, argnum, UNPROVIDED);
                        final SubLObject argcol = arg_isa_constraints.first();
                        SubLObject cdolist_list_var = arg_isa_constraints;
                        SubLObject constraint = NIL;
                        constraint = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL == isa.isaP(arg, argcol, mt, UNPROVIDED)) && (NIL != genls.genlsP(arg, constraint, mt, UNPROVIDED))) {
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
        return NIL;
    }

    public static SubLObject wff_options_malf_arg_wrt_interargisaP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
            final SubLObject all_violations = wff.why_not_wff_assert(asent, mt, UNPROVIDED);
            final SubLObject malf_justification;
            final SubLObject violation = malf_justification = find($MAL_ARG_WRT_INTER_ARG_ISA, all_violations, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            final SubLObject malf_term = second(malf_justification);
            if ((NIL != violation) && (NIL != forts.fort_p(malf_term))) {
                if ($MAL_ARG_WRT_INTER_ARG_ISA.eql(malf_justification.first()) && (NIL != genls.genlsP(malf_term, fifth(malf_justification), mt, UNPROVIDED))) {
                    return list(T, fourth(malf_justification));
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject wff_options_reformulate_malf_arg_wrt_isa(final SubLObject asent, final SubLObject argnum, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        if (argnum.numE(ZERO_INTEGER)) {
            return NIL;
        }
        if ($list8.equal(kb_accessors.arg1_format(pred, mt)) || $list9.equal(kb_accessors.arg1_format(pred, mt))) {
            return values(list(wff_options_instance_existential(asent, argnum, original_clause)), list($str10$Wff_Options_1_1a));
        }
        return values(list(wff_options_instance_existential(asent, argnum, original_clause), wff_options_instance_universal(asent, argnum, original_clause)), list($str11$Wff_Options_1_1b));
    }

    public static SubLObject wff_options_reformulate_malf_arg_wrt_interargisa(final SubLObject asent, final SubLObject argnum_list, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject argnum = second(argnum_list);
        if (!argnum.numE(ZERO_INTEGER)) {
            return values(list(wff_options_instance_existential(asent, argnum, original_clause)), list($str12$Wff_Options_2_1));
        }
        return NIL;
    }

    public static SubLObject wff_options_instance_universal(final SubLObject asent, final SubLObject argnum, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject thesent = copy_tree(asent);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, thesent), UNPROVIDED);
        final SubLObject new_universal_sent = replace_formula_arg(argnum, new_var, thesent);
        final SubLObject col = cycl_utilities.formula_arg(thesent, argnum, UNPROVIDED);
        return list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), new_universal_sent)));
    }

    public static SubLObject wff_options_instance_existential(final SubLObject asent, final SubLObject argnum, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        final SubLObject thesent = copy_tree(asent);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, thesent), UNPROVIDED);
        final SubLObject new_existential_sent = replace_formula_arg(argnum, new_var, thesent);
        final SubLObject col = cycl_utilities.formula_arg(thesent, argnum, UNPROVIDED);
        return list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), new_existential_sent)));
    }

    public static SubLObject declare_reformulator_module_wff_options_file() {
        declareFunction(me, "wff_options_required", "WFF-OPTIONS-REQUIRED", 3, 0, false);
        declareFunction(me, "wff_options_cost", "WFF-OPTIONS-COST", 3, 0, false);
        declareFunction(me, "wff_options_reformulate", "WFF-OPTIONS-REFORMULATE", 4, 0, false);
        declareFunction(me, "wff_options_malf_arg_wrt_isaP", "WFF-OPTIONS-MALF-ARG-WRT-ISA?", 2, 0, false);
        declareFunction(me, "wff_options_malf_arg_wrt_interargisaP", "WFF-OPTIONS-MALF-ARG-WRT-INTERARGISA?", 2, 0, false);
        declareFunction(me, "wff_options_reformulate_malf_arg_wrt_isa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-ISA", 4, 1, false);
        declareFunction(me, "wff_options_reformulate_malf_arg_wrt_interargisa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-INTERARGISA", 4, 1, false);
        declareFunction(me, "wff_options_instance_universal", "WFF-OPTIONS-INSTANCE-UNIVERSAL", 2, 1, false);
        declareFunction(me, "wff_options_instance_existential", "WFF-OPTIONS-INSTANCE-EXISTENTIAL", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_wff_options_file() {
        deflexical("*WFF-OPTIONS-MICROSECONDS*", $int$20000);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_wff_options_file() {
        reformulator_module_harness.declare_rl_module($$WffViolationResolutionRLModule, $list1);
        sunit_external.define_test_category($str17$Wff_Violation_Resolution_Processi, UNPROVIDED);
        sunit_external.define_test_suite($str18$wff_options_proc_test_suite, list($str17$Wff_Violation_Resolution_Processi), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_reformulator_module_wff_options_file();
    }

    @Override
    public void initializeVariables() {
        init_reformulator_module_wff_options_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reformulator_module_wff_options_file();
    }

    
}

/**
 * Total time: 43 ms
 */
