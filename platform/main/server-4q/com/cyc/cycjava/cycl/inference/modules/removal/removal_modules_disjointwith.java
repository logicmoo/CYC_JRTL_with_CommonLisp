package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_disjointwith extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith";
    public static String myFingerPrint = "8047c575dc76b707a909369f2b180386cf996a6d98f1b533072ef75a625f16b3";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1600L)
    private static SubLSymbol $default_disjointwith_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2600L)
    private static SubLSymbol $default_sibling_disjoint_cost_factor$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 5900L)
    private static SubLSymbol $default_max_sibling_disjoint_cost_factor$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8200L)
    private static SubLSymbol $default_not_disjointwith_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 9800L)
    private static SubLSymbol $default_instancesofdisjointcollections_check_cost$;
    private static SubLObject $$disjointWith;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLSymbol $MAX_DISJOINT_WITH_POS;
    private static SubLList $list4;
    private static SubLSymbol $DISJOINTWITH;
    private static SubLSymbol $REMOVAL_DISJOINTWITH_CHECK;
    private static SubLList $list7;
    private static SubLSymbol $SIBLING_DISJOINT;
    private static SubLSymbol $REMOVAL_SIBLING_DISJOINT_CHECK;
    private static SubLList $list10;
    private static SubLSymbol $REMOVAL_MAX_DISJOINTWITH;
    private static SubLList $list12;
    private static SubLInteger $int$100;
    private static SubLSymbol $REMOVAL_MAX_SIBLING_DISJOINT;
    private static SubLList $list15;
    private static SubLList $list16;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $REMOVAL_NOT_DISJOINTWITH_CHECK;
    private static SubLList $list19;
    private static SubLObject $$instancesOfDisjointCollections;
    private static SubLSymbol $REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS;
    private static SubLList $list22;
    private static SubLObject $$maximalConsistentSubsets;
    private static SubLSymbol $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK;
    private static SubLList $list25;
    private static SubLSymbol $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY;
    private static SubLList $list27;
    private static SubLSymbol $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST;
    private static SubLSymbol $sym29$CANONICALIZE_TERM;
    private static SubLSymbol $sym30$MAKE_EL_SET;
    private static SubLSymbol $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 1800L)
    public static SubLObject removal_disjointwith_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            SubLObject col1 = el_utilities.literal_arg1(literal, UNPROVIDED);
            SubLObject col2 = el_utilities.literal_arg2(literal, UNPROVIDED);
            if (NIL != disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 2800L)
    public static SubLObject removal_sibling_disjoint_check_required(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        return makeBoolean(NIL != inference_trampolines.inference_applicable_sdctP(arg1) && NIL != inference_trampolines.inference_applicable_sdctP(arg2) && NIL != sdc.isa_common_sdctP(arg1, arg2, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 3200L)
    public static SubLObject removal_sibling_disjoint_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject col1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject col2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        if (NIL != sdc.sdcP(col1, col2, UNPROVIDED)) {
            SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
            backward.removal_add_node(arguments.make_hl_support($SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4100L)
    public static SubLObject removal_max_disjointwith_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == forts.fort_p(v_term)) {
            v_term = el_utilities.literal_arg2(literal, UNPROVIDED);
        }
        result = cardinality_estimates.genl_cardinality(v_term);
        if (result.isZero()) {
            result = Sequences.length(genls.all_genls(v_term, UNPROVIDED, UNPROVIDED));
        }
        return result;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 4800L)
    public static SubLObject removal_max_disjointwith_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject term2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        SubLObject disjoint_terms = cdolist_list_var = disjoint_with.max_all_disjoint_with_no_sdc(fort, UNPROVIDED, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, el_utilities.literal_args(subst_literal, UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6200L)
    public static SubLObject removal_max_sibling_disjoint_required(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject arg1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject arg2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        return makeBoolean((NIL != forts.fort_p(arg1) && NIL != inference_trampolines.inference_applicable_sdctP(arg1)) || (NIL != forts.fort_p(arg2) && NIL != inference_trampolines.inference_applicable_sdctP(arg2)));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 6600L)
    public static SubLObject removal_max_sibling_disjoint_cost(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject disjoint_cost = removal_max_disjointwith_cost(literal, UNPROVIDED);
        return Numbers.multiply(disjoint_cost, $default_max_sibling_disjoint_cost_factor$.getDynamicValue(thread));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 7000L)
    public static SubLObject removal_max_sibling_disjoint_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject term1 = el_utilities.literal_arg1(literal, UNPROVIDED);
        SubLObject term2 = el_utilities.literal_arg2(literal, UNPROVIDED);
        SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        SubLObject disjoint_terms = cdolist_list_var = sdc.max_sdc(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, el_utilities.literal_args(subst_literal, UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support($SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 8400L)
    public static SubLObject removal_not_disjointwith_check_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = el_utilities.literal_args(literal, UNPROVIDED);
        SubLObject col1 = NIL;
        SubLObject col2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        col1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        col2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else if (NIL != disjoint_with.not_disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)) {
                SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 10900L)
    public static SubLObject removal_instances_of_disjoint_collections_expand(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject inst1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject inst2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (inst1.eql(inst2)) {
            return NIL;
        }
        if (NIL != disjoint_with.instances_of_disjoint_collectionsP(inst1, inst2, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 13900L)
    public static SubLObject removal_maximal_consistent_subsets_unify_cost(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_set = el_utilities.el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        return Sequences.length(v_set);
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-disjointwith.lisp", position = 14100L)
    public static SubLObject removal_maximal_consistent_subsets_unify_output_generate(SubLObject v_set) {
        SubLObject cols = el_utilities.el_extensional_set_elements(v_set);
        SubLObject subsets = disjoint_with.maximal_consistent_subsets(cols);
        return Mapping.mapcar($sym29$CANONICALIZE_TERM, Mapping.mapcar($sym30$MAKE_EL_SET, subsets));
    }

    public static SubLObject declare_removal_modules_disjointwith_file() {
        declareFunction(myName, "removal_disjointwith_check_expand", "REMOVAL-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_sibling_disjoint_check_required", "REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_sibling_disjoint_check_expand", "REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_max_disjointwith_cost", "REMOVAL-MAX-DISJOINTWITH-COST", 1, 1, false);
        declareFunction(myName, "removal_max_disjointwith_expand", "REMOVAL-MAX-DISJOINTWITH-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_max_sibling_disjoint_required", "REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED", 1, 1, false);
        declareFunction(myName, "removal_max_sibling_disjoint_cost", "REMOVAL-MAX-SIBLING-DISJOINT-COST", 1, 1, false);
        declareFunction(myName, "removal_max_sibling_disjoint_expand", "REMOVAL-MAX-SIBLING-DISJOINT-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_not_disjointwith_check_expand", "REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_instances_of_disjoint_collections_expand", "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_maximal_consistent_subsets_unify_cost", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST", 1, 1, false);
        declareFunction(myName, "removal_maximal_consistent_subsets_unify_output_generate", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_disjointwith_file() {
        $default_disjointwith_check_cost$ = defparameter("*DEFAULT-DISJOINTWITH-CHECK-COST*", TWO_INTEGER);
        $default_sibling_disjoint_cost_factor$ = defparameter("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*", TWO_INTEGER);
        $default_max_sibling_disjoint_cost_factor$ = SubLFiles.defparameter("*DEFAULT-MAX-SIBLING-DISJOINT-COST-FACTOR*", $int$100);
        $default_not_disjointwith_check_cost$ = defparameter("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*", FOUR_INTEGER);
        $default_instancesofdisjointcollections_check_cost$ = defparameter("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*", $default_disjointwith_check_cost$.getDynamicValue());
        return NIL;
    }

    public static SubLObject setup_removal_modules_disjointwith_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$disjointWith);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$disjointWith);
        preference_modules.doomed_unless_all_args_bindable($NEG, $$disjointWith);
        preference_modules.inference_preference_module($MAX_DISJOINT_WITH_POS, $list4);
        inference_modules.inference_removal_module($REMOVAL_DISJOINTWITH_CHECK, $list7);
        inference_modules.inference_removal_module($REMOVAL_SIBLING_DISJOINT_CHECK, $list10);
        inference_modules.inference_removal_module($REMOVAL_MAX_DISJOINTWITH, $list12);
        inference_modules.inference_removal_module($REMOVAL_MAX_SIBLING_DISJOINT, $list15);
        inference_modules.inference_removal_module($REMOVAL_NOT_DISJOINTWITH_CHECK, $list19);
        inference_modules.register_solely_specific_removal_module_predicate($$instancesOfDisjointCollections);
        preference_modules.doomed_unless_all_args_bindable($POS, $$instancesOfDisjointCollections);
        inference_modules.inference_removal_module($REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS, $list22);
        inference_modules.register_solely_specific_removal_module_predicate($$maximalConsistentSubsets);
        preference_modules.doomed_unless_arg_bindable($POS, $$maximalConsistentSubsets, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK, $list25);
        inference_modules.inference_removal_module($REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY, $list27);
        utilities_macros.note_funcall_helper_function($sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST);
        utilities_macros.note_funcall_helper_function($sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_disjointwith_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_disjointwith_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_disjointwith_file();
    }

    static {
        me = new removal_modules_disjointwith();
        $default_disjointwith_check_cost$ = null;
        $default_sibling_disjoint_cost_factor$ = null;
        $default_max_sibling_disjoint_cost_factor$ = null;
        $default_not_disjointwith_check_cost$ = null;
        $default_instancesofdisjointcollections_check_cost$ = null;
        $$disjointWith = makeConstSym(("disjointWith"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $MAX_DISJOINT_WITH_POS = makeKeyword("MAX-DISJOINT-WITH-POS");
        $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("disjointWith")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(makeConstSym(("disjointWith")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $DISJOINTWITH = makeKeyword("DISJOINTWITH");
        $REMOVAL_DISJOINTWITH_CHECK = makeKeyword("REMOVAL-DISJOINTWITH-CHECK");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISJOINTWITH-CHECK-EXPAND") });
        $SIBLING_DISJOINT = makeKeyword("SIBLING-DISJOINT");
        $REMOVAL_SIBLING_DISJOINT_CHECK = makeKeyword("REMOVAL-SIBLING-DISJOINT-CHECK");
        $list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("REQUIRED"),
                makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), makeSymbol("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*")), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND") });
        $REMOVAL_MAX_DISJOINTWITH = makeKeyword("REMOVAL-MAX-DISJOINTWITH");
        $list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("disjointWith")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(makeConstSym(("disjointWith")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-DISJOINTWITH-COST"),
                makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-DISJOINTWITH-EXPAND") });
        $int$100 = makeInteger(100);
        $REMOVAL_MAX_SIBLING_DISJOINT = makeKeyword("REMOVAL-MAX-SIBLING-DISJOINT");
        $list15 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"),
                list(makeKeyword("OR"), list(makeConstSym(("disjointWith")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(makeConstSym(("disjointWith")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED"),
                makeKeyword("COST"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-EXPAND") });
        $list16 = list(makeSymbol("COL1"), makeSymbol("COL2"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $REMOVAL_NOT_DISJOINTWITH_CHECK = makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK");
        $list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND") });
        $$instancesOfDisjointCollections = makeConstSym(("instancesOfDisjointCollections"));
        $REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS = makeKeyword("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS");
        $list22 = list(
                new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("instancesOfDisjointCollections")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("instancesOfDisjointCollections")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
                        makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND"), makeKeyword("DOCUMENTATION"),
                        makeString("(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))") });
        $$maximalConsistentSubsets = makeConstSym(("maximalConsistentSubsets"));
        $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK");
        $list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("maximalConsistentSubsets")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("maximalConsistentSubsets")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("SUBSET"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("SUBSET")))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("SUBSET")),
                        list(makeKeyword("CALL"), makeSymbol("MAXIMAL-CONSISTENT-SUBSET?"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SET"))),
                                list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SUBSET"))))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)"), makeKeyword("EXAMPLE"),
                makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))") });
        $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY");
        $list27 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("maximalConsistentSubsets")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("maximalConsistentSubsets")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("maximalConsistentSubsets")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)"), makeKeyword("EXAMPLE"),
                makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)") });
        $sym28$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST = makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST");
        $sym29$CANONICALIZE_TERM = makeSymbol("CANONICALIZE-TERM");
        $sym30$MAKE_EL_SET = makeSymbol("MAKE-EL-SET");
        $sym31$REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE = makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE");
    }
}
/*
 *
 * Total time: 132 ms
 *
 */