/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.variables.find_variable_by_id;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-INTERVAL-RANGE
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-interval-range.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_interval_range extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_interval_range();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $interval_range_binary_uom_nat_rule_formula$ = makeSymbol("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-FORMULA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $interval_range_binary_uom_nat_rule_antecedent_template$ = makeSymbol("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-TEMPLATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?UNIT"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("operatorFormulas"), makeSymbol("?UNIT"), makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT"))), list(reader_make_constant_shell("intervalRange"), makeSymbol("?NAT"), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE")), list(makeSymbol("?UNIT"), makeSymbol("?MAX-VALUE"))));



    static private final SubLList $list3 = list(list(list(makeSymbol("?NAT")), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE"), makeSymbol("?MAX-VALUE")), NIL), list(NIL, list(list(reader_make_constant_shell("isa"), makeSymbol("?UNIT"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("operatorFormulas"), makeSymbol("?UNIT"), makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT")))));

    static private final SubLList $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    static private final SubLList $list11 = list(reader_make_constant_shell("intervalRange"), list($BIND, makeSymbol("BINARY-UOM-NAT")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLSymbol BINARY_UOM_NAT = makeSymbol("BINARY-UOM-NAT");



    static private final SubLList $list14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    private static final SubLSymbol $REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS = makeKeyword("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS");

    static private final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("intervalRange"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("intervalRange"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), makeKeyword("EXAMPLE"), makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });

    public static final SubLObject make_interval_range_binary_uom_nat_rule_support_alt() {
        return arguments.make_hl_support($CODE, $interval_range_binary_uom_nat_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject make_interval_range_binary_uom_nat_rule_support() {
        return arguments.make_hl_support($CODE, $interval_range_binary_uom_nat_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static final SubLObject interval_range_binary_uom_nat_rule_antecedent_dnf_alt(SubLObject binary_uom_nat) {
        {
            SubLObject rule_antecedent_info = $interval_range_binary_uom_nat_rule_antecedent_template$.getGlobalValue();
            SubLObject input_values = list(binary_uom_nat);
            SubLObject datum = rule_antecedent_info;
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject input_el_vars = NIL;
                    SubLObject output_el_vars = NIL;
                    SubLObject scoped_el_vars = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    input_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    output_el_vars = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt4);
                    scoped_el_vars = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject el_dnf_template = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt4);
                            el_dnf_template = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                {
                                    SubLObject el_bindings = removal_modules_distance_between.make_variable_bindings(input_el_vars, input_values);
                                    SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                                    SubLObject hl_dnf = removal_modules_distance_between.subst_hl_variables(output_el_vars, el_dnf);
                                    SubLObject scoped_hl_vars = removal_modules_distance_between.subst_hl_variables(output_el_vars, scoped_el_vars);
                                    return values(hl_dnf, scoped_hl_vars);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt4);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt4);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject interval_range_binary_uom_nat_rule_antecedent_dnf(final SubLObject binary_uom_nat) {
        final SubLObject rule_antecedent_info = $interval_range_binary_uom_nat_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = list(binary_uom_nat);
        SubLObject current;
        final SubLObject datum = current = rule_antecedent_info;
        destructuring_bind_must_consp(current, datum, $list4);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject input_el_vars = NIL;
        SubLObject output_el_vars = NIL;
        SubLObject scoped_el_vars = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        input_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        output_el_vars = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        scoped_el_vars = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject el_dnf_template = NIL;
            destructuring_bind_must_consp(current, datum, $list4);
            el_dnf_template = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject el_bindings = bindings.make_variable_bindings(input_el_vars, input_values);
                final SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                final SubLObject hl_dnf = variables.subst_hl_variables(output_el_vars, el_dnf);
                final SubLObject scoped_hl_vars = variables.subst_hl_variables(output_el_vars, scoped_el_vars);
                return values(hl_dnf, scoped_hl_vars);
            }
            cdestructuring_bind_error(datum, $list4);
        } else {
            cdestructuring_bind_error(datum, $list4);
        }
        return NIL;
    }

    public static final SubLObject removal_interval_range_binary_uom_nat_antecedent_answers_alt(SubLObject binary_uom_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_store = inference_worker.currently_active_problem_store();
                thread.resetMultipleValues();
                {
                    SubLObject rule_antecedent_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range.interval_range_binary_uom_nat_rule_antecedent_dnf(binary_uom_nat);
                    SubLObject scoped_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
                }
            }
        }
    }

    public static SubLObject removal_interval_range_binary_uom_nat_antecedent_answers(final SubLObject binary_uom_nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = interval_range_binary_uom_nat_rule_antecedent_dnf(binary_uom_nat);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    public static final SubLObject removal_interval_range_binary_uom_nat_pos_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pattern = $list_alt11;
                thread.resetMultipleValues();
                {
                    SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
                    SubLObject v_bindings = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != success) {
                        {
                            SubLObject binary_uom_nat = list_utilities.alist_lookup_without_values(v_bindings, BINARY_UOM_NAT, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_answers = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range.removal_interval_range_binary_uom_nat_antecedent_answers(binary_uom_nat, UNPROVIDED);
                            if (NIL != antecedent_answers) {
                                {
                                    SubLObject output_template = list($$intervalRange, binary_uom_nat, list(find_variable_by_id(ZERO_INTEGER), find_variable_by_id(ONE_INTEGER)), list(find_variable_by_id(ZERO_INTEGER), find_variable_by_id(TWO_INTEGER)));
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_interval_range.make_interval_range_binary_uom_nat_rule_support();
                                    SubLObject cdolist_list_var = antecedent_answers;
                                    SubLObject antecedent_answer = NIL;
                                    for (antecedent_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_answer = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = antecedent_answer;
                                            SubLObject current = datum;
                                            SubLObject antecedent_bindings = NIL;
                                            SubLObject antecedent_supports = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_bindings = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt14);
                                            antecedent_supports = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                {
                                                    SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject v_bindings_1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                                                        SubLObject unify_justification = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != v_bindings_1) {
                                                            backward.removal_add_node(rule_support, v_bindings_1, append(antecedent_supports, unify_justification));
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt14);
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
    }

    public static SubLObject removal_interval_range_binary_uom_nat_pos_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list11;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(asent, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject binary_uom_nat = list_utilities.alist_lookup_without_values(v_bindings, BINARY_UOM_NAT, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_answers = removal_interval_range_binary_uom_nat_antecedent_answers(binary_uom_nat, UNPROVIDED);
            if (NIL != antecedent_answers) {
                final SubLObject output_template = list($$intervalRange, binary_uom_nat, list(variables.find_variable_by_id(ZERO_INTEGER), variables.find_variable_by_id(ONE_INTEGER)), list(variables.find_variable_by_id(ZERO_INTEGER), variables.find_variable_by_id(TWO_INTEGER)));
                final SubLObject rule_support = make_interval_range_binary_uom_nat_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list14);
                    antecedent_supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject proven_asent = bindings.apply_bindings(antecedent_bindings, output_template);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$1 = unification_utilities.term_unify(proven_asent, asent, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings_$1) {
                            backward.removal_add_node(rule_support, v_bindings_$1, append(antecedent_supports, unify_justification));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list14);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_interval_range_file() {
        declareFunction("make_interval_range_binary_uom_nat_rule_support", "MAKE-INTERVAL-RANGE-BINARY-UOM-NAT-RULE-SUPPORT", 0, 0, false);
        declareFunction("interval_range_binary_uom_nat_rule_antecedent_dnf", "INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-DNF", 1, 0, false);
        declareFunction("removal_interval_range_binary_uom_nat_antecedent_answers", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-ANTECEDENT-ANSWERS", 1, 1, false);
        declareFunction("removal_interval_range_binary_uom_nat_pos_expand", "REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?UNIT"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("operatorFormulas"), makeSymbol("?UNIT"), makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT"))), list(reader_make_constant_shell("intervalRange"), makeSymbol("?NAT"), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE")), list(makeSymbol("?UNIT"), makeSymbol("?MAX-VALUE"))));

    public static SubLObject init_removal_modules_interval_range_file() {
        deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-FORMULA*", $list0);
        deflexical("*INTERVAL-RANGE-BINARY-UOM-NAT-RULE-ANTECEDENT-TEMPLATE*", $list3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_interval_range_file() {
        inference_modules.inference_removal_module($REMOVAL_INTERVAL_RANGE_BINARY_UOM_NAT_POS, $list16);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_interval_range_file();
    }

    static private final SubLList $list_alt3 = list(list(list(makeSymbol("?NAT")), list(makeSymbol("?UNIT"), makeSymbol("?MIN-VALUE"), makeSymbol("?MAX-VALUE")), NIL), list(NIL, list(list(reader_make_constant_shell("isa"), makeSymbol("?UNIT"), reader_make_constant_shell("UnitOfMeasure")), list(reader_make_constant_shell("operatorFormulas"), makeSymbol("?UNIT"), makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MIN-VALUE"), ONE_INTEGER, makeSymbol("?NAT")), list(reader_make_constant_shell("argN"), makeSymbol("?MAX-VALUE"), TWO_INTEGER, makeSymbol("?NAT")))));

    @Override
    public void initializeVariables() {
        init_removal_modules_interval_range_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_interval_range_file();
    }

    static {
    }

    static private final SubLList $list_alt4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("intervalRange"), list($BIND, makeSymbol("BINARY-UOM-NAT")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt14 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("intervalRange"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("intervalRange"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INTERVAL-RANGE-BINARY-UOM-NAT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$intervalRange <fully-bound> <whatever> <whatever>)\n    using min and max values from the arg1."), makeKeyword("EXAMPLE"), makeString("(#$intervalRange (#$YearsDuration 1 19) ?LOW ?HIGH)") });
}

/**
 * Total time: 38 ms
 */
