/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-DISTANCE-BETWEEN
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-distance-between.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_distance_between extends SubLTranslatedFile implements V12 {
    public static final SubLObject subst_hl_variables(SubLObject el_vars, SubLObject tree) {
        tree = copy_tree(tree);
        {
            SubLObject list_var = NIL;
            SubLObject el_var = NIL;
            SubLObject hl_var_id = NIL;
            for (list_var = el_vars, el_var = list_var.first(), hl_var_id = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , el_var = list_var.first() , hl_var_id = add(ONE_INTEGER, hl_var_id)) {
                {
                    SubLObject hl_var = variables.find_variable_by_id(hl_var_id);
                    tree = nsubst(hl_var, el_var, tree, symbol_function(EQ), UNPROVIDED);
                }
            }
        }
        return tree;
    }

    public static final SubLObject make_variable_bindings(SubLObject v_variables, SubLObject values) {
        {
            SubLObject v_bindings = NIL;
            SubLObject variable = NIL;
            SubLObject variable_2 = NIL;
            SubLObject value = NIL;
            SubLObject value_3 = NIL;
            for (variable = v_variables, variable_2 = variable.first(), value = values, value_3 = value.first(); !((NIL == value) && (NIL == variable)); variable = variable.rest() , variable_2 = variable.first() , value = value.rest() , value_3 = value.first()) {
                v_bindings = bindings.add_variable_binding(variable_2, value_3, v_bindings);
            }
            return nreverse(v_bindings);
        }
    }

    public static final SubLFile me = new removal_modules_distance_between();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $distance_between_great_circle_rule_formula$ = makeSymbol("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-FORMULA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $distance_between_great_circle_rule_antecedent_template$ = makeSymbol("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-TEMPLATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC2"), makeSymbol("?LONG2")), list(reader_make_constant_shell("evaluate"), makeSymbol("?TIMESFN"), list(reader_make_constant_shell("TimesFn"), list(list(reader_make_constant_shell("PerFn"), reader_make_constant_shell("Mile"), reader_make_constant_shell("Radian")), makeDouble(3980.91)), list(reader_make_constant_shell("ArcCosineFn"), list(reader_make_constant_shell("PlusFn"), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT2"))), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT2")), list(reader_make_constant_shell("CosineFn"), list(reader_make_constant_shell("DifferenceFn"), makeSymbol("?LONG2"), makeSymbol("?LONG1"))))))))), list(reader_make_constant_shell("distanceBetween"), makeSymbol("?LOC1"), makeSymbol("?LOC2"), makeSymbol("?TIMESFN")));



    static private final SubLList $list3 = list(list(list(makeSymbol("?LOC1"), makeSymbol("?LOC2")), list(makeSymbol("?TIMESFN"), makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2")), list(makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2"))), list(NIL, list(list(reader_make_constant_shell("latitude"), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC2"), makeSymbol("?LONG2")), list(reader_make_constant_shell("evaluate"), makeSymbol("?TIMESFN"), list(reader_make_constant_shell("TimesFn"), list(list(reader_make_constant_shell("PerFn"), reader_make_constant_shell("Mile"), reader_make_constant_shell("Radian")), makeDouble(3980.91)), list(reader_make_constant_shell("ArcCosineFn"), list(reader_make_constant_shell("PlusFn"), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT2"))), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT2")), list(reader_make_constant_shell("CosineFn"), list(reader_make_constant_shell("DifferenceFn"), makeSymbol("?LONG2"), makeSymbol("?LONG1")))))))))));

    static private final SubLList $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    static private final SubLList $list11 = list(reader_make_constant_shell("distanceBetween"), list($BIND, makeSymbol("LOC1")), list($BIND, makeSymbol("LOC2")), makeKeyword("ANYTHING"));

    private static final SubLSymbol LOC2 = makeSymbol("LOC2");

    private static final SubLSymbol LOC1 = makeSymbol("LOC1");



    static private final SubLList $list15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    private static final SubLSymbol $REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS = makeKeyword("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS");

    static private final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("distanceBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("distanceBetween"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2"), makeKeyword("EXAMPLE"), makeString("(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)") });

    private static final SubLSymbol $DISTANCE_BETWEEN_POS = makeKeyword("DISTANCE-BETWEEN-POS");

    static private final SubLList $list19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("distanceBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("distanceBetween"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"));

    public static final SubLObject make_distance_between_great_circle_rule_support_alt() {
        return arguments.make_hl_support($CODE, $distance_between_great_circle_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static SubLObject make_distance_between_great_circle_rule_support() {
        return arguments.make_hl_support($CODE, $distance_between_great_circle_rule_formula$.getGlobalValue(), $$GeographyMt, UNPROVIDED);
    }

    public static final SubLObject distance_between_great_circle_rule_antecedent_dnf_alt(SubLObject loc1, SubLObject loc2) {
        {
            SubLObject rule_antecedent_info = $distance_between_great_circle_rule_antecedent_template$.getGlobalValue();
            SubLObject input_values = list(loc1, loc2);
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
                                    SubLObject el_bindings = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.make_variable_bindings(input_el_vars, input_values);
                                    SubLObject el_dnf = bindings.apply_bindings(el_bindings, el_dnf_template);
                                    SubLObject hl_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.subst_hl_variables(output_el_vars, el_dnf);
                                    SubLObject scoped_hl_vars = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.subst_hl_variables(output_el_vars, scoped_el_vars);
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

    public static SubLObject distance_between_great_circle_rule_antecedent_dnf(final SubLObject loc1, final SubLObject loc2) {
        final SubLObject rule_antecedent_info = $distance_between_great_circle_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = list(loc1, loc2);
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

    public static final SubLObject removal_distance_between_great_circle_antecedent_answers_alt(SubLObject loc1, SubLObject loc2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_store = inference_worker.currently_active_problem_store();
                thread.resetMultipleValues();
                {
                    SubLObject rule_antecedent_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.distance_between_great_circle_rule_antecedent_dnf(loc1, loc2);
                    SubLObject scoped_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
                }
            }
        }
    }

    public static SubLObject removal_distance_between_great_circle_antecedent_answers(final SubLObject loc1, final SubLObject loc2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = distance_between_great_circle_rule_antecedent_dnf(loc1, loc2);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    public static final SubLObject removal_distance_between_great_circle_pos_expand_alt(SubLObject asent, SubLObject sense) {
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
                            SubLObject loc2 = list_utilities.alist_lookup_without_values(v_bindings, LOC2, UNPROVIDED, UNPROVIDED);
                            SubLObject loc1 = list_utilities.alist_lookup_without_values(v_bindings, LOC1, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_answers = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.removal_distance_between_great_circle_antecedent_answers(loc1, loc2, UNPROVIDED);
                            if (NIL != antecedent_answers) {
                                {
                                    SubLObject output_template = list($$distanceBetween, loc1, loc2, variables.find_variable_by_id(ZERO_INTEGER));
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_distance_between.make_distance_between_great_circle_rule_support();
                                    SubLObject cdolist_list_var = antecedent_answers;
                                    SubLObject antecedent_answer = NIL;
                                    for (antecedent_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , antecedent_answer = cdolist_list_var.first()) {
                                        {
                                            SubLObject datum = antecedent_answer;
                                            SubLObject current = datum;
                                            SubLObject antecedent_bindings = NIL;
                                            SubLObject antecedent_supports = NIL;
                                            destructuring_bind_must_consp(current, datum, $list_alt15);
                                            antecedent_bindings = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt15);
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
                                                cdestructuring_bind_error(datum, $list_alt15);
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

    public static SubLObject removal_distance_between_great_circle_pos_expand(final SubLObject asent, SubLObject sense) {
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
            final SubLObject loc2 = list_utilities.alist_lookup_without_values(v_bindings, LOC2, UNPROVIDED, UNPROVIDED);
            final SubLObject loc3 = list_utilities.alist_lookup_without_values(v_bindings, LOC1, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_answers = removal_distance_between_great_circle_antecedent_answers(loc3, loc2, UNPROVIDED);
            if (NIL != antecedent_answers) {
                final SubLObject output_template = list($$distanceBetween, loc3, loc2, variables.find_variable_by_id(ZERO_INTEGER));
                final SubLObject rule_support = make_distance_between_great_circle_rule_support();
                SubLObject cdolist_list_var = antecedent_answers;
                SubLObject antecedent_answer = NIL;
                antecedent_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = antecedent_answer;
                    SubLObject antecedent_bindings = NIL;
                    SubLObject antecedent_supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list15);
                    antecedent_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list15);
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
                        cdestructuring_bind_error(datum, $list15);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    antecedent_answer = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC2"), makeSymbol("?LONG2")), list(reader_make_constant_shell("evaluate"), makeSymbol("?TIMESFN"), list(reader_make_constant_shell("TimesFn"), list(list(reader_make_constant_shell("PerFn"), reader_make_constant_shell("Mile"), reader_make_constant_shell("Radian")), makeDouble(3980.91)), list(reader_make_constant_shell("ArcCosineFn"), list(reader_make_constant_shell("PlusFn"), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT2"))), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT2")), list(reader_make_constant_shell("CosineFn"), list(reader_make_constant_shell("DifferenceFn"), makeSymbol("?LONG2"), makeSymbol("?LONG1"))))))))), list(reader_make_constant_shell("distanceBetween"), makeSymbol("?LOC1"), makeSymbol("?LOC2"), makeSymbol("?TIMESFN")));

    public static final SubLObject declare_removal_modules_distance_between_file_alt() {
        declareFunction("make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false);
        declareFunction("distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false);
        declareFunction("removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false);
        declareFunction("removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false);
        declareFunction("make_variable_bindings", "MAKE-VARIABLE-BINDINGS", 2, 0, false);
        declareFunction("subst_hl_variables", "SUBST-HL-VARIABLES", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_removal_modules_distance_between_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false);
            declareFunction("distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false);
            declareFunction("removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false);
            declareFunction("removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("make_variable_bindings", "MAKE-VARIABLE-BINDINGS", 2, 0, false);
            declareFunction("subst_hl_variables", "SUBST-HL-VARIABLES", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_distance_between_file_Previous() {
        declareFunction("make_distance_between_great_circle_rule_support", "MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT", 0, 0, false);
        declareFunction("distance_between_great_circle_rule_antecedent_dnf", "DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-DNF", 2, 0, false);
        declareFunction("removal_distance_between_great_circle_antecedent_answers", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-ANTECEDENT-ANSWERS", 2, 1, false);
        declareFunction("removal_distance_between_great_circle_pos_expand", "REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_distance_between_file() {
        deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-FORMULA*", $list0);
        deflexical("*DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-ANTECEDENT-TEMPLATE*", $list3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_distance_between_file() {
        inference_modules.inference_removal_module($REMOVAL_DISTANCE_BETWEEN_GREAT_CIRCLE_POS, $list17);
        preference_modules.inference_preference_module($DISTANCE_BETWEEN_POS, $list19);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_distance_between_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_distance_between_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_distance_between_file();
    }

    static {
    }

    static private final SubLList $list_alt3 = list(list(list(makeSymbol("?LOC1"), makeSymbol("?LOC2")), list(makeSymbol("?TIMESFN"), makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2")), list(makeSymbol("?LAT1"), makeSymbol("?LONG1"), makeSymbol("?LAT2"), makeSymbol("?LONG2"))), list(NIL, list(list(reader_make_constant_shell("latitude"), makeSymbol("?LOC1"), makeSymbol("?LAT1")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC1"), makeSymbol("?LONG1")), list(reader_make_constant_shell("latitude"), makeSymbol("?LOC2"), makeSymbol("?LAT2")), list(reader_make_constant_shell("longitude"), makeSymbol("?LOC2"), makeSymbol("?LONG2")), list(reader_make_constant_shell("evaluate"), makeSymbol("?TIMESFN"), list(reader_make_constant_shell("TimesFn"), list(list(reader_make_constant_shell("PerFn"), reader_make_constant_shell("Mile"), reader_make_constant_shell("Radian")), makeDouble(3980.91)), list(reader_make_constant_shell("ArcCosineFn"), list(reader_make_constant_shell("PlusFn"), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("SineFn"), makeSymbol("?LAT2"))), list(reader_make_constant_shell("TimesFn"), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT1")), list(reader_make_constant_shell("CosineFn"), makeSymbol("?LAT2")), list(reader_make_constant_shell("CosineFn"), list(reader_make_constant_shell("DifferenceFn"), makeSymbol("?LONG2"), makeSymbol("?LONG1")))))))))));

    static private final SubLList $list_alt4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("distanceBetween"), list($BIND, makeSymbol("LOC1")), list($BIND, makeSymbol("LOC2")), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("distanceBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("distanceBetween"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISTANCE-BETWEEN-GREAT-CIRCLE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$distanceBetween <fully-bound> <fully-bound> <whatever>)\n    by computing the Great Circle distance using \n    #$latitude and #$longitude information about ARG1 and ARG2"), makeKeyword("EXAMPLE"), makeString("(#$distanceBetween #$CityOfAnchorageAK #$CityOfSanFranciscoCA ?DIST)") });

    static private final SubLList $list_alt19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("distanceBetween"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("distanceBetween"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("PREFERRED"));
}

/**
 * Total time: 102 ms
 */
