package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$negation_by_failure$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_disjointwith extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_disjointwith();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_disjointwith";

    public static final String myFingerPrint = "8047c575dc76b707a909369f2b180386cf996a6d98f1b533072ef75a625f16b3";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_disjointwith_check_cost$ = makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_sibling_disjoint_cost_factor$ = makeSymbol("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*");

    // defparameter
    private static final SubLSymbol $default_max_sibling_disjoint_cost_factor$ = makeSymbol("*DEFAULT-MAX-SIBLING-DISJOINT-COST-FACTOR*");

    // defparameter
    private static final SubLSymbol $default_not_disjointwith_check_cost$ = makeSymbol("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_instancesofdisjointcollections_check_cost$ = makeSymbol("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*");

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));





    private static final SubLSymbol $MAX_DISJOINT_WITH_POS = makeKeyword("MAX-DISJOINT-WITH-POS");

    public static final SubLList $list4 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));



    private static final SubLSymbol $REMOVAL_DISJOINTWITH_CHECK = makeKeyword("REMOVAL-DISJOINTWITH-CHECK");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISJOINTWITH-CHECK-EXPAND") });



    private static final SubLSymbol $REMOVAL_SIBLING_DISJOINT_CHECK = makeKeyword("REMOVAL-SIBLING-DISJOINT-CHECK");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), list(makeSymbol("*"), makeSymbol("*DEFAULT-DISJOINTWITH-CHECK-COST*"), makeSymbol("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND") });

    private static final SubLSymbol $REMOVAL_MAX_DISJOINTWITH = makeKeyword("REMOVAL-MAX-DISJOINTWITH");

    public static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-DISJOINTWITH-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-DISJOINTWITH-EXPAND") });



    private static final SubLSymbol $REMOVAL_MAX_SIBLING_DISJOINT = makeKeyword("REMOVAL-MAX-SIBLING-DISJOINT");

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FORT"), makeKeyword("VARIABLE")), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("VARIABLE"), makeKeyword("FORT"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-MAX-SIBLING-DISJOINT-EXPAND") });

    private static final SubLList $list16 = list(makeSymbol("COL1"), makeSymbol("COL2"));



    private static final SubLSymbol $REMOVAL_NOT_DISJOINTWITH_CHECK = makeKeyword("REMOVAL-NOT-DISJOINTWITH-CHECK");

    private static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("disjointWith")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("disjointWith")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND") });

    private static final SubLObject $$instancesOfDisjointCollections = reader_make_constant_shell(makeString("instancesOfDisjointCollections"));

    private static final SubLSymbol $REMOVAL_INSTANCES_OF_DISJOINT_COLLECTIONS = makeKeyword("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("instancesOfDisjointCollections")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("instancesOfDisjointCollections")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$instancesOfDisjointCollections <fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$instancesOfDisjointCollections #$AbrahamLincoln #$CityOfAustinTX)\n    (#$instancesOfDisjointCollections (#$SomeFn #$Cat) (#$SomeFn #$Dog))") });

    private static final SubLObject $$maximalConsistentSubsets = reader_make_constant_shell(makeString("maximalConsistentSubsets"));

    private static final SubLSymbol $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_CHECK = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-CHECK");

    private static final SubLList $list25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("maximalConsistentSubsets")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("maximalConsistentSubsets")), list(makeKeyword("BIND"), makeSymbol("SET")), list(makeKeyword("BIND"), makeSymbol("SUBSET"))), list(list(makeKeyword("VALUE"), makeSymbol("SET")), list(makeKeyword("VALUE"), makeSymbol("SUBSET")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("SET"), makeSymbol("SUBSET")), list(makeKeyword("CALL"), makeSymbol("MAXIMAL-CONSISTENT-SUBSET?"), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SET"))), list(makeKeyword("CALL"), makeSymbol("EL-EXTENSIONAL-SET-ELEMENTS"), list(makeKeyword("VALUE"), makeSymbol("SUBSET"))))), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <set-of-collections>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) (#$TheSet #$Animal #$MaleAnimal))") });

    private static final SubLSymbol $REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY = makeKeyword("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY");

    private static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("maximalConsistentSubsets")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("maximalConsistentSubsets")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("EL-EXTENSIONAL-SET-P"))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("maximalConsistentSubsets")), list(makeKeyword("BIND"), makeSymbol("SET")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("SET"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("maximalConsistentSubsets")), list(makeKeyword("VALUE"), makeSymbol("SET")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("CODE"), makeKeyword("DOCUMENTATION"), makeString("(#$maximalConsistentSubsets <set-of-collections> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$maximalConsistentSubsets (#$TheSet #$Animal #$MaleAnimal #$FemaleAnimal) ?WHAT)") });

    private static final SubLSymbol REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST = makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST");



    private static final SubLSymbol MAKE_EL_SET = makeSymbol("MAKE-EL-SET");

    private static final SubLSymbol REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE = makeSymbol("REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE");

    public static SubLObject removal_disjointwith_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            final SubLObject col1 = literal_arg1(literal, UNPROVIDED);
            final SubLObject col2 = literal_arg2(literal, UNPROVIDED);
            if (NIL != disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_sibling_disjoint_check_required(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        return makeBoolean(((NIL != inference_trampolines.inference_applicable_sdctP(arg1)) && (NIL != inference_trampolines.inference_applicable_sdctP(arg2))) && (NIL != sdc.isa_common_sdctP(arg1, arg2, UNPROVIDED)));
    }

    public static SubLObject removal_sibling_disjoint_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject col1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject col2 = literal_arg2(literal, UNPROVIDED);
        if (NIL != sdc.sdcP(col1, col2, UNPROVIDED)) {
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
            backward.removal_add_node(arguments.make_hl_support($SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_max_disjointwith_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject v_term = literal_arg1(literal, UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == forts.fort_p(v_term)) {
            v_term = literal_arg2(literal, UNPROVIDED);
        }
        result = cardinality_estimates.genl_cardinality(v_term);
        if (result.isZero()) {
            result = length(genls.all_genls(v_term, UNPROVIDED, UNPROVIDED));
        }
        return result;
    }

    public static SubLObject removal_max_disjointwith_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject term2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = disjoint_with.max_all_disjoint_with_no_sdc(fort, UNPROVIDED, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, literal_args(subst_literal, UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_max_sibling_disjoint_required(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject arg2 = literal_arg2(literal, UNPROVIDED);
        return makeBoolean(((NIL != forts.fort_p(arg1)) && (NIL != inference_trampolines.inference_applicable_sdctP(arg1))) || ((NIL != forts.fort_p(arg2)) && (NIL != inference_trampolines.inference_applicable_sdctP(arg2))));
    }

    public static SubLObject removal_max_sibling_disjoint_cost(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjoint_cost = removal_max_disjointwith_cost(literal, UNPROVIDED);
        return multiply(disjoint_cost, $default_max_sibling_disjoint_cost_factor$.getDynamicValue(thread));
    }

    public static SubLObject removal_max_sibling_disjoint_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = literal_arg1(literal, UNPROVIDED);
        final SubLObject term2 = literal_arg2(literal, UNPROVIDED);
        final SubLObject variable = (NIL != variables.variable_p(term1)) ? term1 : term2;
        final SubLObject fort = (NIL != forts.fort_p(term1)) ? term1 : term2;
        SubLObject cdolist_list_var;
        final SubLObject disjoint_terms = cdolist_list_var = sdc.max_sdc(fort, UNPROVIDED);
        SubLObject disjoint_term = NIL;
        disjoint_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(variable, disjoint_term, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject subst_literal = bindings.subst_bindings(v_bindings, literal);
            final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, literal_args(subst_literal, UNPROVIDED));
            backward.removal_add_node(arguments.make_hl_support($SIBLING_DISJOINT, hl_support_formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
            cdolist_list_var = cdolist_list_var.rest();
            disjoint_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_not_disjointwith_check_expand(final SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject col1 = NIL;
        SubLObject col2 = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        col1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        col2 = current.first();
        current = current.rest();
        if (NIL == current) {
            if ((NIL != $negation_by_failure$.getDynamicValue(thread)) && (NIL == disjoint_with.disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED))) {
                final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != disjoint_with.not_disjoint_withP(col1, col2, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject hl_support_formula = backward_utilities.inference_make_commutative_literal($$disjointWith, list(col1, col2));
                    backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, cycl_utilities.negate(hl_support_formula), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                }

        } else {
            cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    public static SubLObject removal_instances_of_disjoint_collections_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject inst1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject inst2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (inst1.eql(inst2)) {
            return NIL;
        }
        if (NIL != disjoint_with.instances_of_disjoint_collectionsP(inst1, inst2, UNPROVIDED, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($DISJOINTWITH, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_maximal_consistent_subsets_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_set = el_extensional_set_elements(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
        return length(v_set);
    }

    public static SubLObject removal_maximal_consistent_subsets_unify_output_generate(final SubLObject v_set) {
        final SubLObject cols = el_extensional_set_elements(v_set);
        final SubLObject subsets = disjoint_with.maximal_consistent_subsets(cols);
        return Mapping.mapcar(CANONICALIZE_TERM, Mapping.mapcar(MAKE_EL_SET, subsets));
    }

    public static SubLObject declare_removal_modules_disjointwith_file() {
        declareFunction(me, "removal_disjointwith_check_expand", "REMOVAL-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_sibling_disjoint_check_required", "REMOVAL-SIBLING-DISJOINT-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_sibling_disjoint_check_expand", "REMOVAL-SIBLING-DISJOINT-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_max_disjointwith_cost", "REMOVAL-MAX-DISJOINTWITH-COST", 1, 1, false);
        declareFunction(me, "removal_max_disjointwith_expand", "REMOVAL-MAX-DISJOINTWITH-EXPAND", 1, 1, false);
        declareFunction(me, "removal_max_sibling_disjoint_required", "REMOVAL-MAX-SIBLING-DISJOINT-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_max_sibling_disjoint_cost", "REMOVAL-MAX-SIBLING-DISJOINT-COST", 1, 1, false);
        declareFunction(me, "removal_max_sibling_disjoint_expand", "REMOVAL-MAX-SIBLING-DISJOINT-EXPAND", 1, 1, false);
        declareFunction(me, "removal_not_disjointwith_check_expand", "REMOVAL-NOT-DISJOINTWITH-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_instances_of_disjoint_collections_expand", "REMOVAL-INSTANCES-OF-DISJOINT-COLLECTIONS-EXPAND", 1, 1, false);
        declareFunction(me, "removal_maximal_consistent_subsets_unify_cost", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_maximal_consistent_subsets_unify_output_generate", "REMOVAL-MAXIMAL-CONSISTENT-SUBSETS-UNIFY-OUTPUT-GENERATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_disjointwith_file() {
        defparameter("*DEFAULT-DISJOINTWITH-CHECK-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-SIBLING-DISJOINT-COST-FACTOR*", TWO_INTEGER);
        defparameter("*DEFAULT-MAX-SIBLING-DISJOINT-COST-FACTOR*", $int$100);
        defparameter("*DEFAULT-NOT-DISJOINTWITH-CHECK-COST*", FOUR_INTEGER);
        defparameter("*DEFAULT-INSTANCESOFDISJOINTCOLLECTIONS-CHECK-COST*", $default_disjointwith_check_cost$.getDynamicValue());
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
        note_funcall_helper_function(REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_COST);
        note_funcall_helper_function(REMOVAL_MAXIMAL_CONSISTENT_SUBSETS_UNIFY_OUTPUT_GENERATE);
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

    
}

/**
 * Total time: 132 ms
 */
