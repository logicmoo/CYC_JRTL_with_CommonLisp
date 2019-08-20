/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.list_to_elf;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-MODULE-WFF-OPTIONS
 * source file: /cyc/top/cycl/reformulator-module-wff-options.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_module_wff_options extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_inter_arg_isa_viols_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, INTER_ARG_ISA_VIOLS, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, INTER_ARG_ISA_VIOLS, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, INTER_ARG_ISA_VIOLS, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_inter_arg_isa_viols_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_arg_isa_viols_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, ARG_ISA_VIOLS, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ARG_ISA_VIOLS, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, ARG_ISA_VIOLS, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_arg_isa_viols_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_inter_arg_isa_viols_out_cycl(SubLObject inter_arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inter_arg_isa_viols, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_inter_arg_isa_viols_mt(SubLObject inter_arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inter_arg_isa_viols, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_inter_arg_isa_viols_in_cycl(SubLObject inter_arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(inter_arg_isa_viols, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject set_arg_isa_viols_out_cycl(SubLObject arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(arg_isa_viols, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_arg_isa_viols_mt(SubLObject arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(arg_isa_viols, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_arg_isa_viols_in_cycl(SubLObject arg_isa_viols, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(arg_isa_viols, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject inter_arg_isa_viols_p(SubLObject inter_arg_isa_viols) {
        return classes.subloop_instanceof_class(inter_arg_isa_viols, INTER_ARG_ISA_VIOLS);
    }

    public static final SubLObject get_inter_arg_isa_viols_out_cycl(SubLObject inter_arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(inter_arg_isa_viols, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_inter_arg_isa_viols_mt(SubLObject inter_arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(inter_arg_isa_viols, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_inter_arg_isa_viols_in_cycl(SubLObject inter_arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(inter_arg_isa_viols, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_arg_isa_viols_out_cycl(SubLObject arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(arg_isa_viols, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_arg_isa_viols_mt(SubLObject arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(arg_isa_viols, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_arg_isa_viols_in_cycl(SubLObject arg_isa_viols) {
        return classes.subloop_get_access_protected_instance_slot(arg_isa_viols, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject arg_isa_viols_p(SubLObject arg_isa_viols) {
        return classes.subloop_instanceof_class(arg_isa_viols, ARG_ISA_VIOLS);
    }

    public static final SubLFile me = new reformulator_module_wff_options();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wff_options_microseconds$ = makeSymbol("*WFF-OPTIONS-MICROSECONDS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("WFF-OPTIONS-REQUIRED"), $COST, makeSymbol("WFF-OPTIONS-COST"), makeKeyword("REFORMULATE"), makeSymbol("WFF-OPTIONS-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Returns wff alternatives to several common instance-type violations."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });

    private static final SubLInteger $int$20000 = makeInteger(20000);



    private static final SubLSymbol $MAL_ARG_WRT_ARG_ISA = makeKeyword("MAL-ARG-WRT-ARG-ISA");

    private static final SubLSymbol $MAL_ARG_WRT_INTER_ARG_ISA = makeKeyword("MAL-ARG-WRT-INTER-ARG-ISA");

    static private final SubLList $list8 = list(reader_make_constant_shell("SingleEntry"));

    static private final SubLList $list9 = list(reader_make_constant_shell("singleEntryFormatInArgs"));

    static private final SubLString $str10$Wff_Options_1_1a = makeString("Wff Options 1.1a");

    static private final SubLString $str11$Wff_Options_1_1b = makeString("Wff Options 1.1b");

    static private final SubLString $str12$Wff_Options_2_1 = makeString("Wff Options 2.1");









    static private final SubLString $str17$Wff_Violation_Resolution_Processi = makeString("Wff Violation Resolution Processing");

    static private final SubLString $str18$wff_options_proc_test_suite = makeString("wff-options-proc-test-suite");

    // Definitions
    /**
     *
     *
     * @return boolean; t iff EXPRESSION is non-wff because of a wrt-isa or wrt-inter-arg-isa violation
    and the violating argument is a spec of the applicable arg constraint.
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is non-wff because of a wrt-isa or wrt-inter-arg-isa violation\r\nand the violating argument is a spec of the applicable arg constraint.")
    public static final SubLObject wff_options_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                if (NIL != el_formula_p(asent)) {
                    {
                        SubLObject matchP = NIL;
                        if ((NIL != com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_malf_arg_wrt_isaP(asent, mt)) || (NIL != com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_malf_arg_wrt_interargisaP(asent, mt))) {
                            matchP = T;
                        }
                        return matchP;
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    /**
     *
     *
     * @return boolean; t iff EXPRESSION is non-wff because of a wrt-isa or wrt-inter-arg-isa violation
    and the violating argument is a spec of the applicable arg constraint.
     */
    @LispMethod(comment = "@return boolean; t iff EXPRESSION is non-wff because of a wrt-isa or wrt-inter-arg-isa violation\r\nand the violating argument is a spec of the applicable arg constraint.")
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

    public static final SubLObject wff_options_cost_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $wff_options_microseconds$.getGlobalValue();
    }

    public static SubLObject wff_options_cost(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $wff_options_microseconds$.getGlobalValue();
    }

    public static final SubLObject wff_options_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first()))) {
                {
                    SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                    SubLObject new_sentences = NIL;
                    SubLObject justification = T;
                    if ((NIL != el_formula_p(asent)) && (NIL != fort_types_interface.isa_predicateP(cycl_utilities.formula_operator(asent), mt))) {
                        {
                            SubLObject wrt_isa_argnum = com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_malf_arg_wrt_isaP(asent, mt);
                            SubLObject wrt_interarg_isa_list = com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_malf_arg_wrt_interargisaP(asent, mt);
                            if (NIL != list_utilities.sublisp_boolean(wrt_isa_argnum)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject new_sentences_1 = com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_reformulate_malf_arg_wrt_isa(asent, wrt_isa_argnum, mt, settings, original_clause);
                                    SubLObject justification_2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    new_sentences = new_sentences_1;
                                    justification = justification_2;
                                }
                            } else {
                                if (NIL != wrt_interarg_isa_list.first()) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject new_sentences_3 = com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_reformulate_malf_arg_wrt_interargisa(asent, wrt_interarg_isa_list, mt, settings, original_clause);
                                        SubLObject justification_4 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        new_sentences = new_sentences_3;
                                        justification = justification_4;
                                    }
                                } else {
                                    return NIL;
                                }
                            }
                            if (NIL != new_sentences) {
                                return values(new_sentences, justification);
                            }
                        }
                    }
                }
                return values(list(expression), NIL);
            }
            return NIL;
        }
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

    /**
     *
     *
     * @return boolean: T iff ASENT is of the form (PRED TERM_1...TERM_n) and for some i<=n:
    (argIsa PRED i COLL) and (genls TERM_i COLL)
     */
    @LispMethod(comment = "@return boolean: T iff ASENT is of the form (PRED TERM_1...TERM_n) and for some i<=n:\r\n(argIsa PRED i COLL) and (genls TERM_i COLL)")
    public static final SubLObject wff_options_malf_arg_wrt_isaP_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.formula_operator(asent);
            if ((NIL != fort_types_interface.isa_predicateP(pred, mt)) && (!pred.eql($$isa))) {
                {
                    SubLObject all_violations = wff.why_not_wff_assert(asent, mt, UNPROVIDED);
                    SubLObject violations = find($MAL_ARG_WRT_ARG_ISA, all_violations, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                    if (NIL != violations) {
                        {
                            SubLObject malf_arg = NIL;
                            SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
                            SubLObject list_var = NIL;
                            SubLObject arg = NIL;
                            SubLObject argnum = NIL;
                            for (list_var = terms, arg = list_var.first(), argnum = ZERO_INTEGER; !((NIL != malf_arg) || (NIL == list_var)); list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                                if ((!arg.eql(pred)) && (NIL != forts.fort_p(arg))) {
                                    {
                                        SubLObject arg_isa_constraints = kb_accessors.argn_isa(pred, argnum, UNPROVIDED);
                                        SubLObject argcol = arg_isa_constraints.first();
                                        SubLObject cdolist_list_var = arg_isa_constraints;
                                        SubLObject constraint = NIL;
                                        for (constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constraint = cdolist_list_var.first()) {
                                            if ((NIL == isa.isaP(arg, argcol, mt, UNPROVIDED)) && (NIL != genls.genlsP(arg, constraint, mt, UNPROVIDED))) {
                                                malf_arg = arg;
                                                return argnum;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean: T iff ASENT is of the form (PRED TERM_1...TERM_n) and for some i<=n:
    (argIsa PRED i COLL) and (genls TERM_i COLL)
     */
    @LispMethod(comment = "@return boolean: T iff ASENT is of the form (PRED TERM_1...TERM_n) and for some i<=n:\r\n(argIsa PRED i COLL) and (genls TERM_i COLL)")
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

    /**
     *
     *
     * @return list: first is T iff ASENT is of the form (PRED TERM_1...TERM_n), and
    there is an inter-arg-isa wff violation at argnum=i in (PRED TERM_1...TERM_n) which
    could be fixed  by replacing TERM_i with an instance of TERM_i; second is arg position
    of the malf argument with the lowest position number
     */
    @LispMethod(comment = "@return list: first is T iff ASENT is of the form (PRED TERM_1...TERM_n), and\r\nthere is an inter-arg-isa wff violation at argnum=i in (PRED TERM_1...TERM_n) which\r\ncould be fixed  by replacing TERM_i with an instance of TERM_i; second is arg position\r\nof the malf argument with the lowest position number")
    public static final SubLObject wff_options_malf_arg_wrt_interargisaP_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.formula_operator(asent);
            if (NIL != fort_types_interface.isa_predicateP(pred, mt)) {
                {
                    SubLObject all_violations = wff.why_not_wff_assert(asent, mt, UNPROVIDED);
                    SubLObject violation = find($MAL_ARG_WRT_INTER_ARG_ISA, all_violations, symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                    SubLObject malf_justification = violation;
                    SubLObject malf_term = second(malf_justification);
                    if ((NIL != violation) && (NIL != forts.fort_p(malf_term))) {
                        if ($MAL_ARG_WRT_INTER_ARG_ISA.eql(malf_justification.first()) && (NIL != genls.genlsP(malf_term, fifth(malf_justification), mt, UNPROVIDED))) {
                            return list(T, fourth(malf_justification));
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return list: first is T iff ASENT is of the form (PRED TERM_1...TERM_n), and
    there is an inter-arg-isa wff violation at argnum=i in (PRED TERM_1...TERM_n) which
    could be fixed  by replacing TERM_i with an instance of TERM_i; second is arg position
    of the malf argument with the lowest position number
     */
    @LispMethod(comment = "@return list: first is T iff ASENT is of the form (PRED TERM_1...TERM_n), and\r\nthere is an inter-arg-isa wff violation at argnum=i in (PRED TERM_1...TERM_n) which\r\ncould be fixed  by replacing TERM_i with an instance of TERM_i; second is arg position\r\nof the malf argument with the lowest position number")
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

    /**
     *
     *
     * @return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum
     * @return 1 list: justification
     */
    @LispMethod(comment = "@return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum\r\n@return 1 list: justification")
    public static final SubLObject wff_options_reformulate_malf_arg_wrt_isa_alt(SubLObject asent, SubLObject argnum, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject pred = cycl_utilities.formula_operator(asent);
            if (!argnum.numE(ZERO_INTEGER)) {
                if ($list_alt8.equal(kb_accessors.arg1_format(pred, mt)) || $list_alt9.equal(kb_accessors.arg1_format(pred, mt))) {
                    return values(list(com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_instance_existential(asent, argnum, original_clause)), list($str_alt10$Wff_Options_1_1a));
                } else {
                    return values(list(com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_instance_existential(asent, argnum, original_clause), com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_instance_universal(asent, argnum, original_clause)), list($str_alt11$Wff_Options_1_1b));
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum
     * @return 1 list: justification
     */
    @LispMethod(comment = "@return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum\r\n@return 1 list: justification")
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

    /**
     *
     *
     * @return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum
     * @return 1 list: justification
     */
    @LispMethod(comment = "@return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum\r\n@return 1 list: justification")
    public static final SubLObject wff_options_reformulate_malf_arg_wrt_interargisa_alt(SubLObject asent, SubLObject argnum_list, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject argnum = second(argnum_list);
            if (!argnum.numE(ZERO_INTEGER)) {
                return values(list(com.cyc.cycjava.cycl.reformulator_module_wff_options.wff_options_instance_existential(asent, argnum, original_clause)), list($str_alt12$Wff_Options_2_1));
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum
     * @return 1 list: justification
     */
    @LispMethod(comment = "@return 0 list: wff alternatives to asent w.r.t the malformed arg in argnum\r\n@return 1 list: justification")
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

    public static final SubLObject wff_options_instance_universal_alt(SubLObject asent, SubLObject argnum, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject thesent = copy_tree(asent);
            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, thesent), UNPROVIDED);
            SubLObject new_universal_sent = replace_formula_arg(argnum, new_var, thesent);
            SubLObject col = cycl_utilities.formula_arg(thesent, argnum, UNPROVIDED);
            return list_to_elf(list($$forAll, new_var, list($$implies, list($$isa, new_var, col), new_universal_sent)));
        }
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

    public static final SubLObject wff_options_instance_existential_alt(SubLObject asent, SubLObject argnum, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        {
            SubLObject thesent = copy_tree(asent);
            SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(list(original_clause, thesent), UNPROVIDED);
            SubLObject new_existential_sent = replace_formula_arg(argnum, new_var, thesent);
            SubLObject col = cycl_utilities.formula_arg(thesent, argnum, UNPROVIDED);
            return list_to_elf(list($$thereExists, new_var, list($$and, list($$isa, new_var, col), new_existential_sent)));
        }
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

    public static final SubLObject declare_reformulator_module_wff_options_file_alt() {
        declareFunction("wff_options_required", "WFF-OPTIONS-REQUIRED", 3, 0, false);
        declareFunction("wff_options_cost", "WFF-OPTIONS-COST", 3, 0, false);
        declareFunction("wff_options_reformulate", "WFF-OPTIONS-REFORMULATE", 4, 0, false);
        declareFunction("wff_options_malf_arg_wrt_isaP", "WFF-OPTIONS-MALF-ARG-WRT-ISA?", 2, 0, false);
        declareFunction("wff_options_malf_arg_wrt_interargisaP", "WFF-OPTIONS-MALF-ARG-WRT-INTERARGISA?", 2, 0, false);
        declareFunction("wff_options_reformulate_malf_arg_wrt_isa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-ISA", 4, 1, false);
        declareFunction("wff_options_reformulate_malf_arg_wrt_interargisa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-INTERARGISA", 4, 1, false);
        declareFunction("wff_options_instance_universal", "WFF-OPTIONS-INSTANCE-UNIVERSAL", 2, 1, false);
        declareFunction("wff_options_instance_existential", "WFF-OPTIONS-INSTANCE-EXISTENTIAL", 2, 1, false);
        declareFunction("get_arg_isa_viols_mt", "GET-ARG-ISA-VIOLS-MT", 1, 0, false);
        declareFunction("set_arg_isa_viols_mt", "SET-ARG-ISA-VIOLS-MT", 2, 0, false);
        declareFunction("get_arg_isa_viols_out_cycl", "GET-ARG-ISA-VIOLS-OUT-CYCL", 1, 0, false);
        declareFunction("set_arg_isa_viols_out_cycl", "SET-ARG-ISA-VIOLS-OUT-CYCL", 2, 0, false);
        declareFunction("get_arg_isa_viols_in_cycl", "GET-ARG-ISA-VIOLS-IN-CYCL", 1, 0, false);
        declareFunction("set_arg_isa_viols_in_cycl", "SET-ARG-ISA-VIOLS-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_arg_isa_viols_class", "SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_arg_isa_viols_instance", "SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-INSTANCE", 1, 0, false);
        declareFunction("arg_isa_viols_p", "ARG-ISA-VIOLS-P", 1, 0, false);
        declareFunction("get_inter_arg_isa_viols_mt", "GET-INTER-ARG-ISA-VIOLS-MT", 1, 0, false);
        declareFunction("set_inter_arg_isa_viols_mt", "SET-INTER-ARG-ISA-VIOLS-MT", 2, 0, false);
        declareFunction("get_inter_arg_isa_viols_out_cycl", "GET-INTER-ARG-ISA-VIOLS-OUT-CYCL", 1, 0, false);
        declareFunction("set_inter_arg_isa_viols_out_cycl", "SET-INTER-ARG-ISA-VIOLS-OUT-CYCL", 2, 0, false);
        declareFunction("get_inter_arg_isa_viols_in_cycl", "GET-INTER-ARG-ISA-VIOLS-IN-CYCL", 1, 0, false);
        declareFunction("set_inter_arg_isa_viols_in_cycl", "SET-INTER-ARG-ISA-VIOLS-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_inter_arg_isa_viols_class", "SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_inter_arg_isa_viols_instance", "SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-INSTANCE", 1, 0, false);
        declareFunction("inter_arg_isa_viols_p", "INTER-ARG-ISA-VIOLS-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_reformulator_module_wff_options_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("wff_options_required", "WFF-OPTIONS-REQUIRED", 3, 0, false);
            declareFunction("wff_options_cost", "WFF-OPTIONS-COST", 3, 0, false);
            declareFunction("wff_options_reformulate", "WFF-OPTIONS-REFORMULATE", 4, 0, false);
            declareFunction("wff_options_malf_arg_wrt_isaP", "WFF-OPTIONS-MALF-ARG-WRT-ISA?", 2, 0, false);
            declareFunction("wff_options_malf_arg_wrt_interargisaP", "WFF-OPTIONS-MALF-ARG-WRT-INTERARGISA?", 2, 0, false);
            declareFunction("wff_options_reformulate_malf_arg_wrt_isa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-ISA", 4, 1, false);
            declareFunction("wff_options_reformulate_malf_arg_wrt_interargisa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-INTERARGISA", 4, 1, false);
            declareFunction("wff_options_instance_universal", "WFF-OPTIONS-INSTANCE-UNIVERSAL", 2, 1, false);
            declareFunction("wff_options_instance_existential", "WFF-OPTIONS-INSTANCE-EXISTENTIAL", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_arg_isa_viols_mt", "GET-ARG-ISA-VIOLS-MT", 1, 0, false);
            declareFunction("set_arg_isa_viols_mt", "SET-ARG-ISA-VIOLS-MT", 2, 0, false);
            declareFunction("get_arg_isa_viols_out_cycl", "GET-ARG-ISA-VIOLS-OUT-CYCL", 1, 0, false);
            declareFunction("set_arg_isa_viols_out_cycl", "SET-ARG-ISA-VIOLS-OUT-CYCL", 2, 0, false);
            declareFunction("get_arg_isa_viols_in_cycl", "GET-ARG-ISA-VIOLS-IN-CYCL", 1, 0, false);
            declareFunction("set_arg_isa_viols_in_cycl", "SET-ARG-ISA-VIOLS-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_arg_isa_viols_class", "SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_arg_isa_viols_instance", "SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-INSTANCE", 1, 0, false);
            declareFunction("arg_isa_viols_p", "ARG-ISA-VIOLS-P", 1, 0, false);
            declareFunction("get_inter_arg_isa_viols_mt", "GET-INTER-ARG-ISA-VIOLS-MT", 1, 0, false);
            declareFunction("set_inter_arg_isa_viols_mt", "SET-INTER-ARG-ISA-VIOLS-MT", 2, 0, false);
            declareFunction("get_inter_arg_isa_viols_out_cycl", "GET-INTER-ARG-ISA-VIOLS-OUT-CYCL", 1, 0, false);
            declareFunction("set_inter_arg_isa_viols_out_cycl", "SET-INTER-ARG-ISA-VIOLS-OUT-CYCL", 2, 0, false);
            declareFunction("get_inter_arg_isa_viols_in_cycl", "GET-INTER-ARG-ISA-VIOLS-IN-CYCL", 1, 0, false);
            declareFunction("set_inter_arg_isa_viols_in_cycl", "SET-INTER-ARG-ISA-VIOLS-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_inter_arg_isa_viols_class", "SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_inter_arg_isa_viols_instance", "SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-INSTANCE", 1, 0, false);
            declareFunction("inter_arg_isa_viols_p", "INTER-ARG-ISA-VIOLS-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_wff_options_file_Previous() {
        declareFunction("wff_options_required", "WFF-OPTIONS-REQUIRED", 3, 0, false);
        declareFunction("wff_options_cost", "WFF-OPTIONS-COST", 3, 0, false);
        declareFunction("wff_options_reformulate", "WFF-OPTIONS-REFORMULATE", 4, 0, false);
        declareFunction("wff_options_malf_arg_wrt_isaP", "WFF-OPTIONS-MALF-ARG-WRT-ISA?", 2, 0, false);
        declareFunction("wff_options_malf_arg_wrt_interargisaP", "WFF-OPTIONS-MALF-ARG-WRT-INTERARGISA?", 2, 0, false);
        declareFunction("wff_options_reformulate_malf_arg_wrt_isa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-ISA", 4, 1, false);
        declareFunction("wff_options_reformulate_malf_arg_wrt_interargisa", "WFF-OPTIONS-REFORMULATE-MALF-ARG-WRT-INTERARGISA", 4, 1, false);
        declareFunction("wff_options_instance_universal", "WFF-OPTIONS-INSTANCE-UNIVERSAL", 2, 1, false);
        declareFunction("wff_options_instance_existential", "WFF-OPTIONS-INSTANCE-EXISTENTIAL", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_wff_options_file() {
        deflexical("*WFF-OPTIONS-MICROSECONDS*", $int$20000);
        return NIL;
    }

    public static final SubLObject setup_reformulator_module_wff_options_file_alt() {
        reformulator_module_harness.declare_rl_module($$WffViolationResolutionRLModule, $list_alt1);
        sunit_external.define_test_category($str_alt17$Wff_Violation_Resolution_Processi, UNPROVIDED);
        sunit_external.define_test_suite($str_alt18$wff_options_proc_test_suite, list($str_alt17$Wff_Violation_Resolution_Processi), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ARG_ISA_VIOLS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(ARG_ISA_VIOLS);
        classes.subloop_new_class(ARG_ISA_VIOLS, TEST_CASE, NIL, NIL, $list_alt21);
        classes.class_set_implements_slot_listeners(ARG_ISA_VIOLS, NIL);
        classes.subloop_note_class_initialization_function(ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_CLASS);
        classes.subloop_note_instance_initialization_function(ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_INSTANCE);
        com.cyc.cycjava.cycl.reformulator_module_wff_options.subloop_reserved_initialize_arg_isa_viols_class(ARG_ISA_VIOLS);
        sunit_macros.define_test_case_postamble(ARG_ISA_VIOLS, $str_alt39$reformulator_module_wff_options, $$$cycl, $list_alt41);
        sunit_macros.def_test_method_register(ARG_ISA_VIOLS, WFF_OPTIONS_TEST_REFORMULATION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INTER_ARG_ISA_VIOLS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(INTER_ARG_ISA_VIOLS);
        classes.subloop_new_class(INTER_ARG_ISA_VIOLS, TEST_CASE, NIL, NIL, $list_alt21);
        classes.class_set_implements_slot_listeners(INTER_ARG_ISA_VIOLS, NIL);
        classes.subloop_note_class_initialization_function(INTER_ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_CLASS);
        classes.subloop_note_instance_initialization_function(INTER_ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_INSTANCE);
        com.cyc.cycjava.cycl.reformulator_module_wff_options.subloop_reserved_initialize_inter_arg_isa_viols_class(INTER_ARG_ISA_VIOLS);
        sunit_macros.define_test_case_postamble(INTER_ARG_ISA_VIOLS, $str_alt39$reformulator_module_wff_options, $$$cycl, $list_alt41);
        sunit_macros.def_test_method_register(INTER_ARG_ISA_VIOLS, WFF_OPTIONS_TEST_REFORMULATION);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_wff_options_file() {
        if (SubLFiles.USE_V1) {
            reformulator_module_harness.declare_rl_module($$WffViolationResolutionRLModule, $list1);
            sunit_external.define_test_category($str17$Wff_Violation_Resolution_Processi, UNPROVIDED);
            sunit_external.define_test_suite($str18$wff_options_proc_test_suite, list($str17$Wff_Violation_Resolution_Processi), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(ARG_ISA_VIOLS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(ARG_ISA_VIOLS);
            classes.subloop_new_class(ARG_ISA_VIOLS, TEST_CASE, NIL, NIL, $list_alt21);
            classes.class_set_implements_slot_listeners(ARG_ISA_VIOLS, NIL);
            classes.subloop_note_class_initialization_function(ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_CLASS);
            classes.subloop_note_instance_initialization_function(ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_INSTANCE);
            com.cyc.cycjava.cycl.reformulator_module_wff_options.subloop_reserved_initialize_arg_isa_viols_class(ARG_ISA_VIOLS);
            sunit_macros.define_test_case_postamble(ARG_ISA_VIOLS, $str_alt39$reformulator_module_wff_options, $$$cycl, $list_alt41);
            sunit_macros.def_test_method_register(ARG_ISA_VIOLS, WFF_OPTIONS_TEST_REFORMULATION);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INTER_ARG_ISA_VIOLS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(INTER_ARG_ISA_VIOLS);
            classes.subloop_new_class(INTER_ARG_ISA_VIOLS, TEST_CASE, NIL, NIL, $list_alt21);
            classes.class_set_implements_slot_listeners(INTER_ARG_ISA_VIOLS, NIL);
            classes.subloop_note_class_initialization_function(INTER_ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_CLASS);
            classes.subloop_note_instance_initialization_function(INTER_ARG_ISA_VIOLS, SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_INSTANCE);
            com.cyc.cycjava.cycl.reformulator_module_wff_options.subloop_reserved_initialize_inter_arg_isa_viols_class(INTER_ARG_ISA_VIOLS);
            sunit_macros.define_test_case_postamble(INTER_ARG_ISA_VIOLS, $str_alt39$reformulator_module_wff_options, $$$cycl, $list_alt41);
            sunit_macros.def_test_method_register(INTER_ARG_ISA_VIOLS, WFF_OPTIONS_TEST_REFORMULATION);
        }
        return NIL;
    }

    public static SubLObject setup_reformulator_module_wff_options_file_Previous() {
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

    static {
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("WFF-OPTIONS-REQUIRED"), $COST, makeSymbol("WFF-OPTIONS-COST"), makeKeyword("REFORMULATE"), makeSymbol("WFF-OPTIONS-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Returns wff alternatives to several common instance-type violations."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$hasPhysicalPartTypes #$Cell #$CellNucleus)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$relationAllInstance #$hasPhysicalPartTypes #$Cell #$CellNucleus)") });

    static private final SubLList $list_alt8 = list(reader_make_constant_shell("SingleEntry"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("singleEntryFormatInArgs"));

    static private final SubLString $str_alt10$Wff_Options_1_1a = makeString("Wff Options 1.1a");

    static private final SubLString $str_alt11$Wff_Options_1_1b = makeString("Wff Options 1.1b");

    static private final SubLString $str_alt12$Wff_Options_2_1 = makeString("Wff Options 2.1");

    static private final SubLString $str_alt17$Wff_Violation_Resolution_Processi = makeString("Wff Violation Resolution Processing");

    static private final SubLString $str_alt18$wff_options_proc_test_suite = makeString("wff-options-proc-test-suite");

    private static final SubLSymbol ARG_ISA_VIOLS = makeSymbol("ARG-ISA-VIOLS");

    static private final SubLList $list_alt21 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WFF-OPTIONS-TEST-REFORMULATION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARG_ISA_VIOLS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARG-ISA-VIOLS-INSTANCE");

    static private final SubLString $str_alt39$reformulator_module_wff_options = makeString("reformulator-module-wff-options");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt41 = list(makeString("Wff Violation Resolution Processing"));

    private static final SubLSymbol WFF_OPTIONS_TEST_REFORMULATION = makeSymbol("WFF-OPTIONS-TEST-REFORMULATION");

    private static final SubLSymbol INTER_ARG_ISA_VIOLS = makeSymbol("INTER-ARG-ISA-VIOLS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTER_ARG_ISA_VIOLS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTER-ARG-ISA-VIOLS-INSTANCE");
}

/**
 * Total time: 43 ms
 */
