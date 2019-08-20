/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_formal_args;
import static com.cyc.cycjava.cycl.el_utilities.kappa_predicate_query;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-KAPPA
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-kappa.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_kappa extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_kappa();



    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list($TEST, makeSymbol("KAPPA-PREDICATE-P")), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-KAPPA-POS-GAF-COST"), makeKeyword("COMPLETENESS-PATTERN"), list($CALL, makeSymbol("REMOVAL-KAPPA-POS-GAF-COMPLETENESS"), makeKeyword("INPUT"), makeKeyword("POS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KAPPA-EXPAND"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("DOCUMENTATION"), makeString("((#$Kappa <formal-args> <sentence>) <args>)"), makeKeyword("EXAMPLE"), makeString("((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)") });

    private static final SubLSymbol $REMOVAL_KAPPA_POS = makeKeyword("REMOVAL-KAPPA-POS");

    private static final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list($TEST, makeSymbol("KAPPA-PREDICATE-P")), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL"));

    private static final SubLList $list7 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol MAKE_VARIABLE_BINDING = makeSymbol("MAKE-VARIABLE-BINDING");

    public static final SubLObject removal_kappa_pos_gaf_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cost = inference_utilities.literal_removal_cost(kappa_predicate_query(asent), $POS, UNPROVIDED, UNPROVIDED);
                if (!cost.isZero()) {
                    cost = add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
                }
                return cost;
            }
        }
    }

    public static SubLObject removal_kappa_pos_gaf_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject expression_query = kappa_expression_query(asent);
        SubLObject cost = (NIL != atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_cost(expression_query, $POS, UNPROVIDED, UNPROVIDED) : $expensive_hl_module_check_cost$.getGlobalValue();
        if (!cost.isZero()) {
            cost = add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    public static SubLObject removal_kappa_pos_gaf_completeness(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject expression_query = kappa_expression_query(asent);
        final SubLObject completeness = (NIL != atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_completeness(expression_query, $POS, UNPROVIDED) : $INCOMPLETE;
        return completeness;
    }

    public static SubLObject removal_kappa_pos_gaf_preference_level(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLObject expression_query = kappa_expression_query(asent);
        final SubLObject preference_level = (NIL != atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_preference_level(expression_query, $POS, bindable_vars, UNPROVIDED, UNPROVIDED) : $GROSSLY_DISPREFERRED;
        return preference_level;
    }

    // Definitions
    public static final SubLObject removal_kappa_expand_alt(SubLObject asent, SubLObject sense) {
        {
            SubLObject kappa_expression = cycl_utilities.atomic_sentence_predicate(asent);
            SubLObject formal_args = kappa_predicate_formal_args(kappa_expression);
            SubLObject kappa_query = kappa_predicate_query(kappa_expression);
            SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), formal_args, new SubLObject[]{ args });
            SubLObject regular_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
            SubLObject variable_bindings = com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa.remove_bindings_to_ground_terms(formal_argument_bindings);
            SubLObject cdolist_list_var = ask_utilities.kappa_tuples_justified(variable_bindings, regular_query, inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED);
            SubLObject bindings_and_supports = NIL;
            for (bindings_and_supports = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bindings_and_supports = cdolist_list_var.first()) {
                {
                    SubLObject datum = bindings_and_supports;
                    SubLObject current = datum;
                    SubLObject v_bindings = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    v_bindings = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt1);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        backward.removal_add_node(supports.first(), bindings.apply_bindings(variable_bindings, v_bindings), supports.rest());
                    } else {
                        cdestructuring_bind_error(datum, $list_alt1);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject removal_kappa_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject regular_query = kappa_expression_query(asent);
        final SubLObject variable_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = ask_utilities.kappa_tuples_justified(variable_bindings, regular_query, inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED);
        SubLObject bindings_and_supports = NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list7);
            v_bindings = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list7);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                backward.removal_add_node(supports.first(), bindings.apply_bindings(variable_bindings, v_bindings), supports.rest());
            } else {
                cdestructuring_bind_error(datum, $list7);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list($TEST, makeSymbol("KAPPA-PREDICATE-P")), makeKeyword("ANYTHING")), $COST, makeSymbol("REMOVAL-KAPPA-POS-GAF-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KAPPA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("((#$Kappa <formal-args> <sentence>) <args>)"), makeKeyword("EXAMPLE"), makeString("((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)") });

    public static SubLObject kappa_expression_query(final SubLObject asent) {
        final SubLObject kappa_expression = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject formal_args = kappa_predicate_formal_args(kappa_expression);
        final SubLObject kappa_query = kappa_predicate_query(kappa_expression);
        final SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        final SubLObject formal_argument_bindings = Mapping.mapcar(symbol_function(MAKE_VARIABLE_BINDING), formal_args, new SubLObject[]{ args });
        final SubLObject regular_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
        final SubLObject variable_bindings = remove_bindings_to_ground_terms(formal_argument_bindings);
        return values(regular_query, variable_bindings);
    }

    public static final SubLObject remove_bindings_to_ground_terms_alt(SubLObject v_bindings) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                if (NIL == groundP(bindings.variable_binding_value(binding), UNPROVIDED)) {
                    result = cons(binding, result);
                }
            }
            return result;
        }
    }

    public static SubLObject remove_bindings_to_ground_terms(final SubLObject v_bindings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == groundP(bindings.variable_binding_value(binding), UNPROVIDED)) {
                result = cons(binding, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject declare_removal_modules_kappa_file() {
        declareFunction("removal_kappa_pos_gaf_cost", "REMOVAL-KAPPA-POS-GAF-COST", 1, 1, false);
        declareFunction("removal_kappa_pos_gaf_completeness", "REMOVAL-KAPPA-POS-GAF-COMPLETENESS", 1, 1, false);
        declareFunction("removal_kappa_pos_gaf_preference_level", "REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("removal_kappa_expand", "REMOVAL-KAPPA-EXPAND", 2, 0, false);
        declareFunction("kappa_expression_query", "KAPPA-EXPRESSION-QUERY", 1, 0, false);
        declareFunction("remove_bindings_to_ground_terms", "REMOVE-BINDINGS-TO-GROUND-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_kappa_file() {
        return NIL;
    }

    public static final SubLObject setup_removal_modules_kappa_file_alt() {
        inference_modules.inference_removal_module($REMOVAL_KAPPA, $list_alt4);
        return NIL;
    }

    public static SubLObject setup_removal_modules_kappa_file() {
        if (SubLFiles.USE_V1) {
            inference_modules.inference_removal_module($REMOVAL_KAPPA, $list1);
            preference_modules.inference_preference_module($REMOVAL_KAPPA_POS, $list3);
        }
        if (SubLFiles.USE_V2) {
            inference_modules.inference_removal_module($REMOVAL_KAPPA, $list_alt4);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_kappa_file_Previous() {
        inference_modules.inference_removal_module($REMOVAL_KAPPA, $list1);
        preference_modules.inference_preference_module($REMOVAL_KAPPA_POS, $list3);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_kappa_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_kappa_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_kappa_file();
    }

    static {
    }
}

/**
 * Total time: 79 ms
 */
