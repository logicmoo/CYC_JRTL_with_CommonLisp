/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REFORMULATOR-MODULE-DATES
 * source file: /cyc/top/cycl/reformulator-module-dates.lisp
 * created:     2019/07/03 17:37:33
 */
public final class reformulator_module_dates extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_date_in_years_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, DATE_IN_YEARS, IN_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, DATE_IN_YEARS, OUT_CYCL, NIL);
        classes.subloop_initialize_slot(new_instance, DATE_IN_YEARS, MT, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_date_in_years_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_date_in_years_out_cycl(SubLObject date_in_years, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(date_in_years, value, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject set_date_in_years_mt(SubLObject date_in_years, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(date_in_years, value, FIVE_INTEGER, MT);
    }

    public static final SubLObject set_date_in_years_in_cycl(SubLObject date_in_years, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(date_in_years, value, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject get_date_in_years_out_cycl(SubLObject date_in_years) {
        return classes.subloop_get_access_protected_instance_slot(date_in_years, FOUR_INTEGER, OUT_CYCL);
    }

    public static final SubLObject get_date_in_years_mt(SubLObject date_in_years) {
        return classes.subloop_get_access_protected_instance_slot(date_in_years, FIVE_INTEGER, MT);
    }

    public static final SubLObject get_date_in_years_in_cycl(SubLObject date_in_years) {
        return classes.subloop_get_access_protected_instance_slot(date_in_years, THREE_INTEGER, IN_CYCL);
    }

    public static final SubLObject date_in_years_p(SubLObject date_in_years) {
        return classes.subloop_instanceof_class(date_in_years, DATE_IN_YEARS);
    }

    public static final SubLFile me = new reformulator_module_dates();

 public static final String myName = "com.cyc.cycjava.cycl.reformulator_module_dates";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $dates_reformulation_microseconds$ = makeSymbol("*DATES-REFORMULATION-MICROSECONDS*");



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("DATES-REFORMULATION-EXPRESSION-REQUIRED"), $COST, makeSymbol("DATES-REFORMULATION-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("DATES-REFORMULATION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reformulates numbers into proper date-denoting CycL expressions."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$birthDate #$JohnKennedy 1917)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$birthDate #$JohnKennedy (#$YearFn 1917))") });

    private static final SubLInteger $int$1200 = makeInteger(1200);





    static private final SubLString $str6$Dates__Integers_to_Years = makeString("Dates: Integers to Years");

    static private final SubLString $$$Dates_Reformulation = makeString("Dates Reformulation");

    static private final SubLString $str8$dates_reformulation_test_suite = makeString("dates-reformulation-test-suite");

    /**
     *
     *
     * @param expression:
     * 		EL formula
     * @return integer
    Estimates the cost of calling the #$DatesProcessingRLModule on EXPRESSION
     */
    @LispMethod(comment = "@param expression:\r\n\t\tEL formula\r\n@return integer\r\nEstimates the cost of calling the #$DatesProcessingRLModule on EXPRESSION")
    public static final SubLObject dates_reformulation_cost_estimate_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        return $dates_reformulation_microseconds$.getGlobalValue();
    }

    /**
     *
     *
     * @param expression:
     * 		EL formula
     * @return integer
    Estimates the cost of calling the #$DatesProcessingRLModule on EXPRESSION
     */
    @LispMethod(comment = "@param expression:\r\n\t\tEL formula\r\n@return integer\r\nEstimates the cost of calling the #$DatesProcessingRLModule on EXPRESSION")
    public static SubLObject dates_reformulation_cost_estimate(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        return $dates_reformulation_microseconds$.getGlobalValue();
    }

    public static final SubLObject dates_reformulation_check_expression_alt(SubLObject expression) {
        return makeBoolean(((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first())));
    }

    public static SubLObject dates_reformulation_check_expression(final SubLObject expression) {
        return makeBoolean(((NIL != clauses.clauses_p(expression)) && (NIL != list_utilities.singletonP(expression))) && (NIL != clause_utilities.pos_atomic_cnf_p(expression.first())));
    }

    /**
     *
     *
     * @return boolean
    T iff the DatesProcessingRLModule applies to EXPRESSION
     */
    @LispMethod(comment = "@return boolean\r\nT iff the DatesProcessingRLModule applies to EXPRESSION")
    public static final SubLObject dates_reformulation_expression_required_alt(SubLObject expression, SubLObject mt, SubLObject settings) {
        if (NIL != com.cyc.cycjava.cycl.reformulator_module_dates.dates_reformulation_check_expression(expression)) {
            {
                SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                if (NIL != el_formula_p(asent)) {
                    {
                        SubLObject matchP = NIL;
                        if (NIL != com.cyc.cycjava.cycl.reformulator_module_dates.contains_integers_to_reformulateP(asent, mt)) {
                            matchP = T;
                        }
                        return matchP;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean
    T iff the DatesProcessingRLModule applies to EXPRESSION
     */
    @LispMethod(comment = "@return boolean\r\nT iff the DatesProcessingRLModule applies to EXPRESSION")
    public static SubLObject dates_reformulation_expression_required(final SubLObject expression, final SubLObject mt, final SubLObject settings) {
        if (NIL != dates_reformulation_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            if (NIL != el_formula_p(asent)) {
                SubLObject matchP = NIL;
                if (NIL != contains_integers_to_reformulateP(asent, mt)) {
                    matchP = T;
                }
                return matchP;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return consp: (...i...) iff ASENT is of the form (PRED TERM_1...TERM_n), and for
    some i <= n and >=1, TERM_i is an integer and (argIsa PRED i COLL) and
    (genls COLL TemporalThing)
     */
    @LispMethod(comment = "@return consp: (...i...) iff ASENT is of the form (PRED TERM_1...TERM_n), and for\r\nsome i <= n and >=1, TERM_i is an integer and (argIsa PRED i COLL) and\r\n(genls COLL TemporalThing)")
    public static final SubLObject contains_integers_to_reformulateP_alt(SubLObject asent, SubLObject mt) {
        {
            SubLObject pred = cycl_utilities.formula_operator(asent);
            SubLObject arg_numbers = NIL;
            if (NIL != forts.fort_p(pred)) {
                {
                    SubLObject arg_num = ZERO_INTEGER;
                    SubLObject args = cycl_utilities.formula_args(asent, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject arg = NIL;
                    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                        arg_num = add(arg_num, ONE_INTEGER);
                        {
                            SubLObject arg_isa_constraints = kb_accessors.min_argn_isa(pred, arg_num, UNPROVIDED);
                            SubLObject csome_list_var = arg_isa_constraints;
                            SubLObject constraint = NIL;
                            for (constraint = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , constraint = csome_list_var.first()) {
                                if (arg.isInteger() && (NIL != genls.genlsP(constraint, $$TemporalThing, mt, UNPROVIDED))) {
                                    arg_numbers = cons(arg_num, arg_numbers);
                                }
                            }
                        }
                    }
                }
            }
            return arg_numbers;
        }
    }

    /**
     *
     *
     * @return consp: (...i...) iff ASENT is of the form (PRED TERM_1...TERM_n), and for
    some i <= n and >=1, TERM_i is an integer and (argIsa PRED i COLL) and
    (genls COLL TemporalThing)
     */
    @LispMethod(comment = "@return consp: (...i...) iff ASENT is of the form (PRED TERM_1...TERM_n), and for\r\nsome i <= n and >=1, TERM_i is an integer and (argIsa PRED i COLL) and\r\n(genls COLL TemporalThing)")
    public static SubLObject contains_integers_to_reformulateP(final SubLObject asent, final SubLObject mt) {
        final SubLObject pred = cycl_utilities.formula_operator(asent);
        SubLObject arg_numbers = NIL;
        if (NIL != forts.fort_p(pred)) {
            SubLObject arg_num = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(asent, $IGNORE);
            SubLObject arg = NIL;
            arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                arg_num = add(arg_num, ONE_INTEGER);
                SubLObject csome_list_var;
                final SubLObject arg_isa_constraints = csome_list_var = kb_accessors.min_argn_isa(pred, arg_num, UNPROVIDED);
                SubLObject constraint = NIL;
                constraint = csome_list_var.first();
                while (NIL != csome_list_var) {
                    if (arg.isInteger() && (NIL != genls.genlsP(constraint, $$TemporalThing, mt, UNPROVIDED))) {
                        arg_numbers = cons(arg_num, arg_numbers);
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

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification")
    public static final SubLObject dates_reformulation_reformulate_alt(SubLObject expression, SubLObject original_clause, SubLObject mt, SubLObject settings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.reformulator_module_dates.dates_reformulation_check_expression(expression)) {
                {
                    SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
                    SubLObject new_sentence = NIL;
                    SubLObject justification = T;
                    SubLObject date_args = com.cyc.cycjava.cycl.reformulator_module_dates.contains_integers_to_reformulateP(asent, mt);
                    if ((NIL != el_formula_p(asent)) && (NIL != list_utilities.sublisp_boolean(date_args))) {
                        thread.resetMultipleValues();
                        {
                            SubLObject new_sentence_1 = com.cyc.cycjava.cycl.reformulator_module_dates.dates_reformulation_reformulate_years(asent, date_args, mt, settings, original_clause);
                            SubLObject justification_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            new_sentence = new_sentence_1;
                            justification = justification_2;
                        }
                    }
                    return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
                }
            }
            return values(expression, NIL);
        }
    }

    /**
     *
     *
     * @return 0 el-expression-p
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p\r\n@return 1 justification")
    public static SubLObject dates_reformulation_reformulate(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dates_reformulation_check_expression(expression)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(expression.first());
            SubLObject new_sentence = NIL;
            SubLObject justification = T;
            final SubLObject date_args = contains_integers_to_reformulateP(asent, mt);
            if ((NIL != el_formula_p(asent)) && (NIL != list_utilities.sublisp_boolean(date_args))) {
                thread.resetMultipleValues();
                final SubLObject new_sentence_$1 = dates_reformulation_reformulate_years(asent, date_args, mt, settings, original_clause);
                final SubLObject justification_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                new_sentence = new_sentence_$1;
                justification = justification_$2;
            }
            return values(list(clause_utilities.make_gaf_cnf(new_sentence)), justification);
        }
        return values(expression, NIL);
    }

    /**
     *
     *
     * @return 0 el-expression-p: with 1917 -> (YearFn 1917)
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p: with 1917 -> (YearFn 1917)\r\n@return 1 justification")
    public static final SubLObject dates_reformulation_reformulate_years_alt(SubLObject expression, SubLObject date_args, SubLObject mt, SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        if (date_args.isCons() && (NIL != list_utilities.sublisp_boolean(date_args))) {
            {
                SubLObject asent = copy_tree(expression);
                SubLObject new_sentence = asent;
                SubLObject cdolist_list_var = date_args;
                SubLObject arg_num = NIL;
                for (arg_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg_num = cdolist_list_var.first()) {
                    {
                        SubLObject int_arg = cycl_utilities.formula_arg(asent, arg_num, UNPROVIDED);
                        SubLObject year_arg = list_to_elf(list($$YearFn, int_arg));
                        new_sentence = replace_formula_arg(arg_num, year_arg, new_sentence);
                    }
                }
                return values(new_sentence, list($str_alt6$Dates__Integers_to_Years));
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return 0 el-expression-p: with 1917 -> (YearFn 1917)
     * @return 1 justification
     */
    @LispMethod(comment = "@return 0 el-expression-p: with 1917 -> (YearFn 1917)\r\n@return 1 justification")
    public static SubLObject dates_reformulation_reformulate_years(final SubLObject expression, final SubLObject date_args, final SubLObject mt, final SubLObject settings, SubLObject original_clause) {
        if (original_clause == UNPROVIDED) {
            original_clause = NIL;
        }
        if (date_args.isCons() && (NIL != list_utilities.sublisp_boolean(date_args))) {
            SubLObject new_sentence;
            final SubLObject asent = new_sentence = copy_tree(expression);
            SubLObject cdolist_list_var = date_args;
            SubLObject arg_num = NIL;
            arg_num = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject int_arg = cycl_utilities.formula_arg(asent, arg_num, UNPROVIDED);
                final SubLObject year_arg = list_to_elf(list($$YearFn, int_arg));
                new_sentence = replace_formula_arg(arg_num, year_arg, new_sentence);
                cdolist_list_var = cdolist_list_var.rest();
                arg_num = cdolist_list_var.first();
            } 
            return values(new_sentence, list($str6$Dates__Integers_to_Years));
        }
        return NIL;
    }

    public static final SubLObject declare_reformulator_module_dates_file_alt() {
        declareFunction("dates_reformulation_cost_estimate", "DATES-REFORMULATION-COST-ESTIMATE", 3, 0, false);
        declareFunction("dates_reformulation_check_expression", "DATES-REFORMULATION-CHECK-EXPRESSION", 1, 0, false);
        declareFunction("dates_reformulation_expression_required", "DATES-REFORMULATION-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("contains_integers_to_reformulateP", "CONTAINS-INTEGERS-TO-REFORMULATE?", 2, 0, false);
        declareFunction("dates_reformulation_reformulate", "DATES-REFORMULATION-REFORMULATE", 4, 0, false);
        declareFunction("dates_reformulation_reformulate_years", "DATES-REFORMULATION-REFORMULATE-YEARS", 4, 1, false);
        declareFunction("get_date_in_years_mt", "GET-DATE-IN-YEARS-MT", 1, 0, false);
        declareFunction("set_date_in_years_mt", "SET-DATE-IN-YEARS-MT", 2, 0, false);
        declareFunction("get_date_in_years_out_cycl", "GET-DATE-IN-YEARS-OUT-CYCL", 1, 0, false);
        declareFunction("set_date_in_years_out_cycl", "SET-DATE-IN-YEARS-OUT-CYCL", 2, 0, false);
        declareFunction("get_date_in_years_in_cycl", "GET-DATE-IN-YEARS-IN-CYCL", 1, 0, false);
        declareFunction("set_date_in_years_in_cycl", "SET-DATE-IN-YEARS-IN-CYCL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_date_in_years_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_date_in_years_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-INSTANCE", 1, 0, false);
        declareFunction("date_in_years_p", "DATE-IN-YEARS-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_reformulator_module_dates_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("dates_reformulation_cost_estimate", "DATES-REFORMULATION-COST-ESTIMATE", 3, 0, false);
            declareFunction("dates_reformulation_check_expression", "DATES-REFORMULATION-CHECK-EXPRESSION", 1, 0, false);
            declareFunction("dates_reformulation_expression_required", "DATES-REFORMULATION-EXPRESSION-REQUIRED", 3, 0, false);
            declareFunction("contains_integers_to_reformulateP", "CONTAINS-INTEGERS-TO-REFORMULATE?", 2, 0, false);
            declareFunction("dates_reformulation_reformulate", "DATES-REFORMULATION-REFORMULATE", 4, 0, false);
            declareFunction("dates_reformulation_reformulate_years", "DATES-REFORMULATION-REFORMULATE-YEARS", 4, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_date_in_years_mt", "GET-DATE-IN-YEARS-MT", 1, 0, false);
            declareFunction("set_date_in_years_mt", "SET-DATE-IN-YEARS-MT", 2, 0, false);
            declareFunction("get_date_in_years_out_cycl", "GET-DATE-IN-YEARS-OUT-CYCL", 1, 0, false);
            declareFunction("set_date_in_years_out_cycl", "SET-DATE-IN-YEARS-OUT-CYCL", 2, 0, false);
            declareFunction("get_date_in_years_in_cycl", "GET-DATE-IN-YEARS-IN-CYCL", 1, 0, false);
            declareFunction("set_date_in_years_in_cycl", "SET-DATE-IN-YEARS-IN-CYCL", 2, 0, false);
            declareFunction("subloop_reserved_initialize_date_in_years_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_date_in_years_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-INSTANCE", 1, 0, false);
            declareFunction("date_in_years_p", "DATE-IN-YEARS-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_reformulator_module_dates_file_Previous() {
        declareFunction("dates_reformulation_cost_estimate", "DATES-REFORMULATION-COST-ESTIMATE", 3, 0, false);
        declareFunction("dates_reformulation_check_expression", "DATES-REFORMULATION-CHECK-EXPRESSION", 1, 0, false);
        declareFunction("dates_reformulation_expression_required", "DATES-REFORMULATION-EXPRESSION-REQUIRED", 3, 0, false);
        declareFunction("contains_integers_to_reformulateP", "CONTAINS-INTEGERS-TO-REFORMULATE?", 2, 0, false);
        declareFunction("dates_reformulation_reformulate", "DATES-REFORMULATION-REFORMULATE", 4, 0, false);
        declareFunction("dates_reformulation_reformulate_years", "DATES-REFORMULATION-REFORMULATE-YEARS", 4, 1, false);
        return NIL;
    }

    public static SubLObject init_reformulator_module_dates_file() {
        deflexical("*DATES-REFORMULATION-MICROSECONDS*", $int$1200);
        return NIL;
    }

    public static final SubLObject setup_reformulator_module_dates_file_alt() {
        reformulator_module_harness.declare_rl_module($$DatesReformulatorRLModule, $list_alt1);
        sunit_external.define_test_category($$$Dates_Reformulation, UNPROVIDED);
        sunit_external.define_test_suite($str_alt8$dates_reformulation_test_suite, list($$$Dates_Reformulation), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(DATE_IN_YEARS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(DATE_IN_YEARS);
        classes.subloop_new_class(DATE_IN_YEARS, TEST_CASE, NIL, NIL, $list_alt11);
        classes.class_set_implements_slot_listeners(DATE_IN_YEARS, NIL);
        classes.subloop_note_class_initialization_function(DATE_IN_YEARS, SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_CLASS);
        classes.subloop_note_instance_initialization_function(DATE_IN_YEARS, SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_INSTANCE);
        com.cyc.cycjava.cycl.reformulator_module_dates.subloop_reserved_initialize_date_in_years_class(DATE_IN_YEARS);
        sunit_macros.define_test_case_postamble(DATE_IN_YEARS, $str_alt29$reformulator_module_dates, $$$cycl, $list_alt31);
        sunit_macros.def_test_method_register(DATE_IN_YEARS, DATES_TEST_REFORMULATION);
        return NIL;
    }

    public static SubLObject setup_reformulator_module_dates_file() {
        if (SubLFiles.USE_V1) {
            reformulator_module_harness.declare_rl_module($$DatesReformulatorRLModule, $list1);
            sunit_external.define_test_category($$$Dates_Reformulation, UNPROVIDED);
            sunit_external.define_test_suite($str8$dates_reformulation_test_suite, list($$$Dates_Reformulation), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(DATE_IN_YEARS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(DATE_IN_YEARS);
            classes.subloop_new_class(DATE_IN_YEARS, TEST_CASE, NIL, NIL, $list_alt11);
            classes.class_set_implements_slot_listeners(DATE_IN_YEARS, NIL);
            classes.subloop_note_class_initialization_function(DATE_IN_YEARS, SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_CLASS);
            classes.subloop_note_instance_initialization_function(DATE_IN_YEARS, SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_INSTANCE);
            com.cyc.cycjava.cycl.reformulator_module_dates.subloop_reserved_initialize_date_in_years_class(DATE_IN_YEARS);
            sunit_macros.define_test_case_postamble(DATE_IN_YEARS, $str_alt29$reformulator_module_dates, $$$cycl, $list_alt31);
            sunit_macros.def_test_method_register(DATE_IN_YEARS, DATES_TEST_REFORMULATION);
        }
        return NIL;
    }

    public static SubLObject setup_reformulator_module_dates_file_Previous() {
        reformulator_module_harness.declare_rl_module($$DatesReformulatorRLModule, $list1);
        sunit_external.define_test_category($$$Dates_Reformulation, UNPROVIDED);
        sunit_external.define_test_suite($str8$dates_reformulation_test_suite, list($$$Dates_Reformulation), UNPROVIDED, UNPROVIDED);
        return NIL;
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
    }

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("REQUIRED"), makeSymbol("DATES-REFORMULATION-EXPRESSION-REQUIRED"), $COST, makeSymbol("DATES-REFORMULATION-COST-ESTIMATE"), makeKeyword("REFORMULATE"), makeSymbol("DATES-REFORMULATION-REFORMULATE"), makeKeyword("DOCUMENTATION"), makeString("Reformulates numbers into proper date-denoting CycL expressions."), makeKeyword("EXAMPLE-SOURCE"), makeString("(#$birthDate #$JohnKennedy 1917)"), makeKeyword("EXAMPLE-TARGET"), makeString("(#$birthDate #$JohnKennedy (#$YearFn 1917))") });

    static private final SubLString $str_alt6$Dates__Integers_to_Years = makeString("Dates: Integers to Years");

    static private final SubLString $str_alt8$dates_reformulation_test_suite = makeString("dates-reformulation-test-suite");

    private static final SubLSymbol DATE_IN_YEARS = makeSymbol("DATE-IN-YEARS");

    static private final SubLList $list_alt11 = list(list(makeSymbol("IN-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("OUT-CYCL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DATES-TEST-REFORMULATION"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_IN_YEARS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-IN-YEARS-INSTANCE");

    static private final SubLString $str_alt29$reformulator_module_dates = makeString("reformulator-module-dates");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt31 = list(makeString("Dates Reformulation"));

    private static final SubLSymbol DATES_TEST_REFORMULATION = makeSymbol("DATES-TEST-REFORMULATION");
}

/**
 * Total time: 28 ms
 */
