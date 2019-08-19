package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_kappa extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kappa";
    public static String myFingerPrint = "702d667b7e8dc79777041fdc0fdec92c35fd8f52e36327441e10d9db405d554b";
    private static SubLSymbol $REMOVAL_KAPPA;
    private static SubLList $list1;
    private static SubLSymbol $REMOVAL_KAPPA_POS;
    private static SubLList $list3;
    private static SubLSymbol $POS;
    private static SubLSymbol $INCOMPLETE;
    private static SubLSymbol $GROSSLY_DISPREFERRED;
    private static SubLList $list7;
    private static SubLSymbol $sym8$MAKE_VARIABLE_BINDING;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1300L)
    public static SubLObject removal_kappa_pos_gaf_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject expression_query = kappa_expression_query(asent);
        SubLObject cost = (NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_cost(expression_query, $POS, UNPROVIDED, UNPROVIDED) : control_vars.$expensive_hl_module_check_cost$.getGlobalValue();
        if (!cost.isZero()) {
            cost = Numbers.add(cost, removal_modules_true_sentence.$known_sentence_lookahead_cost$.getDynamicValue(thread));
        }
        return cost;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 1700L)
    public static SubLObject removal_kappa_pos_gaf_completeness(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject expression_query = kappa_expression_query(asent);
        SubLObject completeness = (NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_completeness(expression_query, $POS, UNPROVIDED) : $INCOMPLETE;
        return completeness;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2000L)
    public static SubLObject removal_kappa_pos_gaf_preference_level(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
        SubLObject expression_query = kappa_expression_query(asent);
        SubLObject preference_level = (NIL != el_utilities.atomic_sentenceP(expression_query)) ? inference_utilities.literal_removal_preference_level(expression_query, $POS, bindable_vars, UNPROVIDED, UNPROVIDED) : $GROSSLY_DISPREFERRED;
        return preference_level;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2400L)
    public static SubLObject removal_kappa_expand(SubLObject asent, SubLObject sense) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject regular_query = kappa_expression_query(asent);
        SubLObject variable_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = ask_utilities.kappa_tuples_justified(variable_bindings, regular_query, inference_worker.mt_of_currently_executing_tactic(), UNPROVIDED);
        SubLObject bindings_and_supports = NIL;
        bindings_and_supports = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = bindings_and_supports;
            SubLObject v_bindings = NIL;
            SubLObject supports = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                backward.removal_add_node(supports.first(), bindings.apply_bindings(variable_bindings, v_bindings), supports.rest());
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_and_supports = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 2900L)
    public static SubLObject kappa_expression_query(SubLObject asent) {
        SubLObject kappa_expression = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject formal_args = el_utilities.kappa_predicate_formal_args(kappa_expression);
        SubLObject kappa_query = el_utilities.kappa_predicate_query(kappa_expression);
        SubLObject args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject formal_argument_bindings = Mapping.mapcar(Symbols.symbol_function($sym8$MAKE_VARIABLE_BINDING), formal_args, new SubLObject[] { args });
        SubLObject regular_query = bindings.apply_bindings(formal_argument_bindings, kappa_query);
        SubLObject variable_bindings = remove_bindings_to_ground_terms(formal_argument_bindings);
        return Values.values(regular_query, variable_bindings);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-kappa.lisp", position = 3400L)
    public static SubLObject remove_bindings_to_ground_terms(SubLObject v_bindings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == el_utilities.groundP(bindings.variable_binding_value(binding), UNPROVIDED)) {
                result = cons(binding, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return result;
    }

    public static SubLObject declare_removal_modules_kappa_file() {
        declareFunction(myName, "removal_kappa_pos_gaf_cost", "REMOVAL-KAPPA-POS-GAF-COST", 1, 1, false);
        declareFunction(myName, "removal_kappa_pos_gaf_completeness", "REMOVAL-KAPPA-POS-GAF-COMPLETENESS", 1, 1, false);
        declareFunction(myName, "removal_kappa_pos_gaf_preference_level", "REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(myName, "removal_kappa_expand", "REMOVAL-KAPPA-EXPAND", 2, 0, false);
        declareFunction(myName, "kappa_expression_query", "KAPPA-EXPRESSION-QUERY", 1, 0, false);
        declareFunction(myName, "remove_bindings_to_ground_terms", "REMOVE-BINDINGS-TO-GROUND-TERMS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_kappa_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_kappa_file() {
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
        me = new removal_modules_kappa();
        $REMOVAL_KAPPA = makeKeyword("REMOVAL-KAPPA");
        $list1 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("TEST"), makeSymbol("KAPPA-PREDICATE-P")), makeKeyword("ANYTHING")), makeKeyword("COST"), makeSymbol("REMOVAL-KAPPA-POS-GAF-COST"),
                makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-KAPPA-POS-GAF-COMPLETENESS"), makeKeyword("INPUT"), makeKeyword("POS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KAPPA-EXPAND"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"),
                makeKeyword("SUPPLANTS"), makeKeyword("ALL"), makeKeyword("DOCUMENTATION"), makeString("((#$Kappa <formal-args> <sentence>) <args>)"), makeKeyword("EXAMPLE"), makeString("((#$Kappa (?X ?Y) (#$isa ?X ?Y)) #$Guyren ?WHAT)") });
        $REMOVAL_KAPPA_POS = makeKeyword("REMOVAL-KAPPA-POS");
        $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("TEST"), makeSymbol("KAPPA-PREDICATE-P")), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("REMOVAL-KAPPA-POS-GAF-PREFERENCE-LEVEL"));
        $POS = makeKeyword("POS");
        $INCOMPLETE = makeKeyword("INCOMPLETE");
        $GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
        $list7 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
        $sym8$MAKE_VARIABLE_BINDING = makeSymbol("MAKE-VARIABLE-BINDING");
    }
}
/*
 *
 * Total time: 79 ms
 *
 */