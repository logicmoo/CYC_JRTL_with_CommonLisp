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
 * module:      REMOVAL-MODULES-KE-USELESS-PRECISION-VALUE
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-ke-useless-precision-value.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_ke_useless_precision_value extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_ke_useless_precision_value();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $useless_precision_from_relevant_precision_rule_formula$ = makeSymbol("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-FORMULA*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $useless_precision_from_relevant_precision_rule_antecedent_template$ = makeSymbol("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-TEMPLATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(reader_make_constant_shell("intervalSize"), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")), list(reader_make_constant_shell("keRelevantPrecisionValueForSlotOnType"), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"))), list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeSymbol("?SLOT"), makeSymbol("?TERM"), makeSymbol("?INTERVAL")));



    static private final SubLList $list3 = list(list(list(makeSymbol("?TERM"), makeSymbol("?INTERVAL")), list(makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE")), list(makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE"))), list(NIL, list(list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(reader_make_constant_shell("intervalSize"), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")), list(reader_make_constant_shell("keRelevantPrecisionValueForSlotOnType"), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE")))));

    static private final SubLList $list4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    private static final SubLSymbol $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw8$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    static private final SubLList $list11 = list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("INTERVAL")));

    private static final SubLObject $const14$keUselessPrecisionValueForSlotOnT = reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm");

    static private final SubLList $list15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    private static final SubLSymbol $REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION = makeKeyword("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION");

    static private final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keUselessPrecisionValueForSlotOnTerm <whatever> <fully-bound> <fully-bound>)\n    using relevant precision information from the KB."), makeKeyword("EXAMPLE"), makeString("(#$keUselessPrecisionValueForSlotOnTerm #$age #$Muffet (#$YearsDuration 1 19))") });

    public static final SubLObject make_useless_precision_from_relevant_precision_rule_support_alt() {
        return arguments.make_hl_support($CODE, $useless_precision_from_relevant_precision_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static SubLObject make_useless_precision_from_relevant_precision_rule_support() {
        return arguments.make_hl_support($CODE, $useless_precision_from_relevant_precision_rule_formula$.getGlobalValue(), $$UniversalVocabularyMt, UNPROVIDED);
    }

    public static final SubLObject useless_precision_from_relevant_precision_rule_antecedent_dnf_alt(SubLObject v_term, SubLObject interval) {
        {
            SubLObject rule_antecedent_info = $useless_precision_from_relevant_precision_rule_antecedent_template$.getGlobalValue();
            SubLObject input_values = list(v_term, interval);
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

    public static SubLObject useless_precision_from_relevant_precision_rule_antecedent_dnf(final SubLObject v_term, final SubLObject interval) {
        final SubLObject rule_antecedent_info = $useless_precision_from_relevant_precision_rule_antecedent_template$.getGlobalValue();
        final SubLObject input_values = list(v_term, interval);
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

    public static final SubLObject removal_useless_precision_from_relevant_precision_antecedent_answers_alt(SubLObject v_term, SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem_store = inference_worker.currently_active_problem_store();
                thread.resetMultipleValues();
                {
                    SubLObject rule_antecedent_dnf = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value.useless_precision_from_relevant_precision_rule_antecedent_dnf(v_term, interval);
                    SubLObject scoped_vars = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
                }
            }
        }
    }

    public static SubLObject removal_useless_precision_from_relevant_precision_antecedent_answers(final SubLObject v_term, final SubLObject interval, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_worker.currently_active_problem_store();
        thread.resetMultipleValues();
        final SubLObject rule_antecedent_dnf = useless_precision_from_relevant_precision_rule_antecedent_dnf(v_term, interval);
        final SubLObject scoped_vars = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return inference_kernel.new_cyc_query_from_dnf(rule_antecedent_dnf, mt, scoped_vars, list(new SubLObject[]{ $PROBLEM_STORE, problem_store, $CONTINUABLE_, NIL, $kw7$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw8$TRANSFORMATION_ALLOWED_, NIL, $RETURN, $BINDINGS_AND_SUPPORTS }));
    }

    public static final SubLObject removal_useless_precision_from_relevant_precision_pos_expand_alt(SubLObject asent, SubLObject sense) {
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
                            SubLObject interval = list_utilities.alist_lookup_without_values(v_bindings, INTERVAL, UNPROVIDED, UNPROVIDED);
                            SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
                            SubLObject antecedent_answers = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value.removal_useless_precision_from_relevant_precision_antecedent_answers(v_term, interval, UNPROVIDED);
                            if (NIL != antecedent_answers) {
                                {
                                    SubLObject output_template = list($const14$keUselessPrecisionValueForSlotOnT, find_variable_by_id(ZERO_INTEGER), v_term, interval);
                                    SubLObject rule_support = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_ke_useless_precision_value.make_useless_precision_from_relevant_precision_rule_support();
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

    public static SubLObject removal_useless_precision_from_relevant_precision_pos_expand(final SubLObject asent, SubLObject sense) {
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
            final SubLObject interval = list_utilities.alist_lookup_without_values(v_bindings, INTERVAL, UNPROVIDED, UNPROVIDED);
            final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
            final SubLObject antecedent_answers = removal_useless_precision_from_relevant_precision_antecedent_answers(v_term, interval, UNPROVIDED);
            if (NIL != antecedent_answers) {
                final SubLObject output_template = list($const14$keUselessPrecisionValueForSlotOnT, variables.find_variable_by_id(ZERO_INTEGER), v_term, interval);
                final SubLObject rule_support = make_useless_precision_from_relevant_precision_rule_support();
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

    public static SubLObject declare_removal_modules_ke_useless_precision_value_file() {
        declareFunction("make_useless_precision_from_relevant_precision_rule_support", "MAKE-USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-SUPPORT", 0, 0, false);
        declareFunction("useless_precision_from_relevant_precision_rule_antecedent_dnf", "USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-DNF", 2, 0, false);
        declareFunction("removal_useless_precision_from_relevant_precision_antecedent_answers", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-ANTECEDENT-ANSWERS", 2, 1, false);
        declareFunction("removal_useless_precision_from_relevant_precision_pos_expand", "REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND", 1, 1, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(reader_make_constant_shell("intervalSize"), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")), list(reader_make_constant_shell("keRelevantPrecisionValueForSlotOnType"), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"))), list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeSymbol("?SLOT"), makeSymbol("?TERM"), makeSymbol("?INTERVAL")));

    public static SubLObject init_removal_modules_ke_useless_precision_value_file() {
        deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-FORMULA*", $list0);
        deflexical("*USELESS-PRECISION-FROM-RELEVANT-PRECISION-RULE-ANTECEDENT-TEMPLATE*", $list3);
        return NIL;
    }

    public static SubLObject setup_removal_modules_ke_useless_precision_value_file() {
        inference_modules.inference_removal_module($REMOVAL_USELESS_PRECISION_FROM_RELEVANT_PRECISION, $list17);
        return NIL;
    }

    static private final SubLList $list_alt3 = list(list(list(makeSymbol("?TERM"), makeSymbol("?INTERVAL")), list(makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE")), list(makeSymbol("?TYPE"), makeSymbol("?SIZE"), makeSymbol("?INTERVAL-SIZE"))), list(NIL, list(list(reader_make_constant_shell("isa"), makeSymbol("?TERM"), makeSymbol("?TYPE")), list(reader_make_constant_shell("intervalSize"), makeSymbol("?INTERVAL"), makeSymbol("?INTERVAL-SIZE")), list(reader_make_constant_shell("greaterThan"), makeSymbol("?INTERVAL-SIZE"), makeSymbol("?SIZE")), list(reader_make_constant_shell("keRelevantPrecisionValueForSlotOnType"), makeSymbol("?SLOT"), makeSymbol("?TYPE"), makeSymbol("?SIZE")))));

    @Override
    public void declareFunctions() {
        declare_removal_modules_ke_useless_precision_value_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_ke_useless_precision_value_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_ke_useless_precision_value_file();
    }

    

    static private final SubLList $list_alt4 = list(list(makeSymbol("INPUT-EL-VARS"), makeSymbol("OUTPUT-EL-VARS"), makeSymbol("SCOPED-EL-VARS")), makeSymbol("EL-DNF-TEMPLATE"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("TERM")), list($BIND, makeSymbol("INTERVAL")));

    static private final SubLList $list_alt15 = list(makeSymbol("ANTECEDENT-BINDINGS"), makeSymbol("ANTECEDENT-SUPPORTS"));

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("keUselessPrecisionValueForSlotOnTerm"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-USELESS-PRECISION-FROM-RELEVANT-PRECISION-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keUselessPrecisionValueForSlotOnTerm <whatever> <fully-bound> <fully-bound>)\n    using relevant precision information from the KB."), makeKeyword("EXAMPLE"), makeString("(#$keUselessPrecisionValueForSlotOnTerm #$age #$Muffet (#$YearsDuration 1 19))") });
}

/**
 * Total time: 90 ms
 */
