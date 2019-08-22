package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_module_check_cost$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_reflexivity extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_reflexivity();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_reflexivity";

    public static final String myFingerPrint = "e1e12ce7019673026838ad14c1b32d86741fe782d6132ada2186a6fb7f8616c5";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_reflexive_both_cost$ = makeSymbol("*DEFAULT-REFLEXIVE-BOTH-COST*");

    // defparameter
    private static final SubLSymbol $default_reflexive_one_arg_cost$ = makeSymbol("*DEFAULT-REFLEXIVE-ONE-ARG-COST*");

    // defparameter
    private static final SubLSymbol $default_irreflexive_both_cost$ = makeSymbol("*DEFAULT-IRREFLEXIVE-BOTH-COST*");

    // defparameter
    private static final SubLSymbol $default_irreflexive_one_arg_cost$ = makeSymbol("*DEFAULT-IRREFLEXIVE-ONE-ARG-COST*");



    private static final SubLSymbol $REMOVAL_REFLEXIVE_BOTH = makeKeyword("REMOVAL-REFLEXIVE-BOTH");

    public static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REFLEXIVE-BOTH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-BOTH-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <fully-bound>)\n    by unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy #$Italy)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa (#$geographicalSubRegions #$ReflexiveBinaryPredicate))\n") });

    private static final SubLSymbol $REMOVAL_REFLEXIVE_ONE_ARG = makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG");

    public static final SubLList $list4 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REFLEXIVE-ONE-ARG-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <fully-bound> <not-fully-bound>) and\n    (<reflexive predicate> <not-fully-bound> <fully-bound>)\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$notFarFrom #$Italy ?WHERE)\nin\n #$WorldGeographyMt\nvia\n (#$isa #$notFarFrom #$ReflexiveBinaryPredicate)\n\n(#$geographicalSubRegions (#$SchemaObjectFn #$Nima-Gns-LS -4463449) ?WHERE)\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$geographicalSubRegions #$ReflexiveBinaryPredicate)") });

    private static final SubLSymbol $REMOVAL_REFLEXIVE_MAP = makeKeyword("REMOVAL-REFLEXIVE-MAP");

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-REFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-REFLEXIVE-MAP-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-REFLEXIVE-MAP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<reflexive predicate> <not-fully-bound> <not-fully-bound>)\nby iterating over the instances of the arg-types of <reflexive predicate>"), makeKeyword("EXAMPLE"), makeString("(#$subCultures ?X ?Y)") });

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $REMOVAL_IRREFLEXIVE_BOTH = makeKeyword("REMOVAL-IRREFLEXIVE-BOTH");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IRREFLEXIVE-BOTH-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IRREFLEXIVE-BOTH-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <fully-bound>))\nby unification of <arg1> and <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom #$Italy #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom (#$SchemaObjectFn #$Nima-Gns-LS -4463449) (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)") });







    private static final SubLSymbol $REMOVAL_IRREFLEXIVE_ONE_ARG = makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG");

    public static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("OR"), list(makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-IRREFLEXIVE-ONE-ARG-COST*"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-ONE-ARG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-IRREFLEXIVE-ONE-ARG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <fully-bound> <not-fully-bound>)) and\n    (#$not (<irreflexive predicate> <not-fully-bound> <fully-bound>))\nby unification of <not-fully-bound> and <fully-bound>\n"), makeKeyword("EXAMPLE"), makeString("(#$not (#$farFrom ?WHERE #$Italy))\nin\n #$WorldGeographyMt\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)\n\n(#$not (#$farFrom ?WHERE (#$SchemaObjectFn #$Nima-Gns-LS -4463449)))\nin\n (#$ContentMtFn #$Nima-KS)\nvia\n (#$isa #$farFrom #$IrreflexiveBinaryPredicate)") });

    private static final SubLSymbol $REMOVAL_IRREFLEXIVE_MAP = makeKeyword("REMOVAL-IRREFLEXIVE-MAP");

    public static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("PREDICATE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), makeKeyword("INPUT")), makeKeyword("SUPPORT"), makeSymbol("REMOVAL-IRREFLEXIVE-MAP-SUPPORT"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<irreflexive predicate> <not-fully-bound> <not-fully-bound>)) \nby iterating over the instances of the arg-types of <irreflexive predicate>") });

    private static final SubLSymbol $PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE = makeKeyword("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-IRREFLEXIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("REQUIRED"), makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<irreflexive-predicate> <anything> <anything>) pruned when <arg1> and <arg2> are equal."), makeKeyword("EXAMPLE"), makeString("(#$sisters ?var0 ?var0)") });

    public static final SubLSymbol PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_REQUIRED = makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED");



    public static final SubLSymbol PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_EXPAND = makeSymbol("PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND");

    public static SubLObject removal_reflexive_both_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($REFLEXIVE, asent, UNPROVIDED, UNPROVIDED), NIL, justification);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_reflexive_one_arg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($REFLEXIVE, formula, UNPROVIDED, UNPROVIDED), v_bindings, justification);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_reflexive_map_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject best_index_collection = best_reflexive_pred_arg_type(cycl_utilities.atomic_sentence_predicate(asent));
        final SubLObject best_cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return best_cost;
    }

    public static SubLObject removal_reflexive_map_iterator(final SubLObject predicate) {
        return iteration.new_list_iterator(isa.all_fort_instances(best_reflexive_pred_arg_type(predicate), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject best_reflexive_pred_arg_type(final SubLObject predicate) {
        final SubLObject arg1_isa = kb_accessors.arg1_isa(predicate, UNPROVIDED);
        final SubLObject arg2_isa = kb_accessors.arg2_isa(predicate, UNPROVIDED);
        SubLObject best_index = $$Thing;
        SubLObject best_index_cost = cardinality_estimates.instance_iteration_cost(best_index);
        SubLObject cdolist_list_var = arg1_isa;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type_cost = cardinality_estimates.instance_iteration_cost(type);
            if (type_cost.numL(best_index_cost)) {
                best_index = type;
                best_index_cost = type_cost;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        cdolist_list_var = arg2_isa;
        type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type_cost = cardinality_estimates.instance_iteration_cost(type);
            if (type_cost.numL(best_index_cost)) {
                best_index = type;
                best_index_cost = type_cost;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return values(best_index, best_index_cost);
    }

    public static SubLObject removal_irreflexive_both_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support($REFLEXIVE, cycl_utilities.negate(asent), UNPROVIDED, UNPROVIDED), NIL, justification);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_irreflexive_one_arg_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static SubLObject removal_irreflexive_one_arg_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        try {
            at_vars.$at_admit_consistent_nautsP$.bind(NIL, thread);
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, arg2, T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                backward.removal_add_node(arguments.make_hl_support($REFLEXIVE, cycl_utilities.negate(formula), UNPROVIDED, UNPROVIDED), v_bindings, justification);
            }
        } finally {
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject removal_irreflexive_map_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject best_index_collection = best_reflexive_pred_arg_type(cycl_utilities.atomic_sentence_predicate(asent));
        final SubLObject best_cost = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return best_cost;
    }

    public static SubLObject removal_irreflexive_map_completeness(final SubLObject asent) {
        if (NIL != removal_module_utilities.negation_grossly_incompleteP(asent, $NEG)) {
            return $GROSSLY_INCOMPLETE;
        }
        return $INCOMPLETE;
    }

    public static SubLObject removal_irreflexive_map_iterator(final SubLObject predicate) {
        return iteration.new_list_iterator(isa.all_fort_instances(best_reflexive_pred_arg_type(predicate), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject removal_irreflexive_map_support(final SubLObject support_asent, final SubLObject support_mt) {
        final SubLObject support = arguments.make_hl_support($REFLEXIVE, support_asent, support_mt, UNPROVIDED);
        final SubLObject more_supports = NIL;
        return values(support, more_supports);
    }

    public static SubLObject prune_reflexive_use_of_irreflexive_predicate_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return makeBoolean(((NIL != inference_worker.currently_active_problem()) && cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED).eql(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED))) && (NIL != kb_accessors.irreflexive_predicateP(cycl_utilities.atomic_sentence_predicate(asent))));
    }

    public static SubLObject prune_reflexive_use_of_irreflexive_predicate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject problem = inference_worker.currently_active_problem();
        if (NIL != problem) {
            inference_worker.make_problem_no_good(problem, NIL, $TACTICAL);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_reflexivity_file() {
        declareFunction(me, "removal_reflexive_both_expand", "REMOVAL-REFLEXIVE-BOTH-EXPAND", 1, 1, false);
        declareFunction(me, "removal_reflexive_one_arg_expand", "REMOVAL-REFLEXIVE-ONE-ARG-EXPAND", 1, 1, false);
        new removal_modules_reflexivity.$removal_reflexive_one_arg_expand$UnaryFunction();
        new removal_modules_reflexivity.$removal_reflexive_one_arg_expand$BinaryFunction();
        declareFunction(me, "removal_reflexive_map_cost", "REMOVAL-REFLEXIVE-MAP-COST", 1, 1, false);
        declareFunction(me, "removal_reflexive_map_iterator", "REMOVAL-REFLEXIVE-MAP-ITERATOR", 1, 0, false);
        declareFunction(me, "best_reflexive_pred_arg_type", "BEST-REFLEXIVE-PRED-ARG-TYPE", 1, 0, false);
        declareFunction(me, "removal_irreflexive_both_expand", "REMOVAL-IRREFLEXIVE-BOTH-EXPAND", 1, 1, false);
        declareFunction(me, "removal_irreflexive_one_arg_completeness", "REMOVAL-IRREFLEXIVE-ONE-ARG-COMPLETENESS", 1, 0, false);
        declareFunction(me, "removal_irreflexive_one_arg_expand", "REMOVAL-IRREFLEXIVE-ONE-ARG-EXPAND", 1, 1, false);
        declareFunction(me, "removal_irreflexive_map_cost", "REMOVAL-IRREFLEXIVE-MAP-COST", 1, 1, false);
        declareFunction(me, "removal_irreflexive_map_completeness", "REMOVAL-IRREFLEXIVE-MAP-COMPLETENESS", 1, 0, false);
        declareFunction(me, "removal_irreflexive_map_iterator", "REMOVAL-IRREFLEXIVE-MAP-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_irreflexive_map_support", "REMOVAL-IRREFLEXIVE-MAP-SUPPORT", 2, 0, false);
        declareFunction(me, "prune_reflexive_use_of_irreflexive_predicate_required", "PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-REQUIRED", 1, 1, false);
        declareFunction(me, "prune_reflexive_use_of_irreflexive_predicate_expand", "PRUNE-REFLEXIVE-USE-OF-IRREFLEXIVE-PREDICATE-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_reflexivity_file() {
        defparameter("*DEFAULT-REFLEXIVE-BOTH-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-REFLEXIVE-ONE-ARG-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-IRREFLEXIVE-BOTH-COST*", $hl_module_check_cost$.getDynamicValue());
        defparameter("*DEFAULT-IRREFLEXIVE-ONE-ARG-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_reflexivity_file() {
        inference_modules.inference_removal_module($REMOVAL_REFLEXIVE_BOTH, $list2);
        inference_modules.inference_removal_module($REMOVAL_REFLEXIVE_ONE_ARG, $list4);
        inference_modules.inference_removal_module($REMOVAL_REFLEXIVE_MAP, $list6);
        inference_modules.inference_removal_module($REMOVAL_IRREFLEXIVE_BOTH, $list9);
        inference_modules.inference_removal_module($REMOVAL_IRREFLEXIVE_ONE_ARG, $list14);
        inference_modules.inference_removal_module($REMOVAL_IRREFLEXIVE_MAP, $list16);
        inference_modules.inference_removal_module($PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE, $list18);
        note_funcall_helper_function(PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_REQUIRED);
        note_funcall_helper_function(PRUNE_REFLEXIVE_USE_OF_IRREFLEXIVE_PREDICATE_EXPAND);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_reflexivity_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_reflexivity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_reflexivity_file();
    }

    

    public static final class $removal_reflexive_one_arg_expand$UnaryFunction extends UnaryFunction {
        public $removal_reflexive_one_arg_expand$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_reflexive_one_arg_expand(arg1, removal_modules_reflexivity.$removal_reflexive_one_arg_expand$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_reflexive_one_arg_expand$BinaryFunction extends BinaryFunction {
        public $removal_reflexive_one_arg_expand$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-REFLEXIVE-ONE-ARG-EXPAND"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_reflexive_one_arg_expand(arg1, arg2);
        }
    }
}

/**
 * Total time: 132 ms
 */
