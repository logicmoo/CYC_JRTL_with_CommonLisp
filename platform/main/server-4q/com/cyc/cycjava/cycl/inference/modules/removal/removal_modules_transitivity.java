package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.gt_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_transitivity extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_transitivity();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity";

    public static final String myFingerPrint = "20644c724b069e7c1beaa5d12ab1cecda5ea54ff3c752fb702f1dd1522a8cc09";

    // defparameter
    private static final SubLSymbol $default_transitive_check_cost$ = makeSymbol("*DEFAULT-TRANSITIVE-CHECK-COST*");

    // defparameter
    public static final SubLSymbol $transitivity_justification_max_length$ = makeSymbol("*TRANSITIVITY-JUSTIFICATION-MAX-LENGTH*");

    // defparameter
    private static final SubLSymbol $default_transitive_walk_cost$ = makeSymbol("*DEFAULT-TRANSITIVE-WALK-COST*");

    // defparameter
    private static final SubLSymbol $nearest_restricted_transitive_neighbor_max_query_count$ = makeSymbol("*NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-MAX-QUERY-COUNT*");





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$TransitiveBinaryPredicate = reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    private static final SubLSymbol $REMOVAL_TRANSITIVE_CHECK = makeKeyword("REMOVAL-TRANSITIVE-CHECK");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSITIVE-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TRANSITIVITY-CHECK-STRICT"), list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <fort> <fort>))\nusing general transitivity graph walking of KB assertions"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions #$ContinentOfEurope #$CityOfParisFrance)") });



    private static final SubLSymbol $REMOVAL_TRANSITIVE_ARG1_WALK = makeKeyword("REMOVAL-TRANSITIVE-ARG1-WALK");

    private static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")), makeKeyword("VARIABLE")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("ARG1")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <fort> <variable>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg1>"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions #$ContinentOfEurope ?SUB)") });

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));











    private static final SubLString $str15$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str20$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str22$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str23$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str24$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLSymbol $sym26$NOT_EQUALS_ = makeSymbol("NOT-EQUALS?");

    private static final SubLSymbol $REMOVAL_TRANSITIVE_ARG2_WALK = makeKeyword("REMOVAL-TRANSITIVE-ARG2-WALK");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("VARIABLE"), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-TRANSITIVE-ARG2-WALK-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG2"))), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSITIVE-ARG2-WALK-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG2"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG2"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <variable> <fort>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions ?SUPER #$CityOfParisFrance)") });



    private static final SubLSymbol $REMOVAL_TRANSITIVE_PREDICATE_UNION_FN_DOOM = makeKeyword("REMOVAL-TRANSITIVE-PREDICATE-UNION-FN-DOOM");

    private static final SubLList $list31 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("PREDICATE-UNION-FN-NAT?")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLObject $$PredicateUnionFn_Reifiable = reader_make_constant_shell(makeString("PredicateUnionFn-Reifiable"));

    private static final SubLObject $$PredicateUnionFn = reader_make_constant_shell(makeString("PredicateUnionFn"));

    private static final SubLSymbol $REMOVAL_TRANSITIVE_PREDICATE_UNION_FN = makeKeyword("REMOVAL-TRANSITIVE-PREDICATE-UNION-FN");

    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(list(makeKeyword("TEST"), makeSymbol("PREDICATE-UNION-FN-NAT?")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")), makeKeyword("ANYTHING")), list(list(makeKeyword("TEST"), makeSymbol("PREDICATE-UNION-FN-NAT?")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")))), makeKeyword("COST"), makeSymbol("REMOVAL-TRANSITIVE-PREDICATE-UNION-FN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TRANSITIVE-PREDICATE-UNION-FN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<#$PredicateUnionFn nat> <anything> <anything>) using general transitivity graph walking of KB assertions using the specified predicates"), makeKeyword("EXAMPLE"), makeString("((#$PredicateUnionFn #$typicallyMoreVoluminousThan #$genls) #$Planet ?LARGE-TYPE)") });

    private static final SubLObject $const36$nearestRestrictedTransitiveNeighb = reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor"));



    private static final SubLSymbol $REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR = makeKeyword("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestRestrictedTransitiveNeighbor <trans-pred> <thing> <unary-pred> ?NEIGHBOR)"), makeKeyword("EXAMPLE"), makeString("(#$nearestRestrictedTransitiveNeighbor #$genls #$Thing (#$Kappa (?X) (#$isa ?X #$Collection)) ?SPEC)") });

    private static final SubLObject $const40$nearestRestrictedTransitiveNeighb = reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Inverse"));

    private static final SubLSymbol $REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_INVERSE = makeKeyword("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-INVERSE");

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Inverse")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Inverse")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestRestrictedTransitiveNeighbor-Inverse <trans-pred> <thing> <unary-pred> ?NEIGHBOR)"), makeKeyword("EXAMPLE"), makeString("(#$nearestRestrictedTransitiveNeighbor-Inverse #$genls #$Thing (#$Kappa (?X) (#$isa ?X #$Collection)) ?SPEC)") });

    private static final SubLObject $const43$nearestRestrictedTransitiveNeighb = reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Proper"));

    private static final SubLSymbol $REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_PROPER = makeKeyword("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-PROPER");

    private static final SubLList $list45 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Proper")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-Proper")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestRestrictedTransitiveNeighbor-Proper <trans-pred> <thing> <unary-pred> ?NEIGHBOR)"), makeKeyword("EXAMPLE"), makeString("(#$nearestRestrictedTransitiveNeighbor-Proper #$genls #$Thing (#$Kappa (?X) (#$isa ?X #$Collection)) ?SPEC)") });

    private static final SubLObject $const46$nearestRestrictedTransitiveNeighb = reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-InverseProper"));

    private static final SubLSymbol $REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_INVERSE_PROPER = makeKeyword("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-INVERSE-PROPER");

    private static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-InverseProper")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("nearestRestrictedTransitiveNeighbor-InverseProper")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$nearestRestrictedTransitiveNeighbor-InverseProper <trans-pred> <thing> <unary-pred> ?NEIGHBOR)"), makeKeyword("EXAMPLE"), makeString("(#$nearestRestrictedTransitiveNeighbor-InverseProper #$genls #$Thing (#$Kappa (?X) (#$isa ?X #$Collection)) ?SPEC)") });





    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLList $list52 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));



    public static SubLObject make_transitivity_support(final SubLObject predicate, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return arguments.make_hl_support($ISA, make_binary_formula($$isa, predicate, $$TransitiveBinaryPredicate), mt, tv);
    }

    public static SubLObject gt_required_arg_type_p(final SubLObject v_object) {
        return gt_utilities.gt_term_p(v_object);
    }

    public static SubLObject inference_transitivity_check(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return ghl_search_methods.gt_predicate_relation_p(predicate, arg1, arg2, mt, tv, T);
    }

    public static SubLObject inference_transitivity_check_strict(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        return ghl_search_methods.gt_predicate_relation_p(predicate, arg1, arg2, mt, tv, NIL);
    }

    public static SubLObject inference_transitivity_justify(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justification = ghl_search_methods.why_gt_predicate_relation_p(predicate, arg1, arg2, mt, tv);
        if (NIL == justification) {
            return NIL;
        }
        if (NIL != list_utilities.lengthLE(justification, $transitivity_justification_max_length$.getDynamicValue(thread), UNPROVIDED)) {
            return cons(make_transitivity_support(predicate, mt, tv), justification);
        }
        final SubLObject island = assertions_high.gaf_arg2(list_utilities.middle_sublist(justification, ONE_INTEGER).first());
        final SubLObject to_island = make_binary_formula(predicate, arg1, island);
        final SubLObject from_island = make_binary_formula(predicate, island, arg2);
        return list(arguments.make_hl_support($TRANSITIVITY, to_island, mt, tv), arguments.make_hl_support($TRANSITIVITY, from_island, mt, tv));
    }

    public static SubLObject removal_transitive_arg1_walk_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject est = ZERO_INTEGER;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
        final SubLObject node_var = pred;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$7;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inv = predicate_mode;
                                        if (NIL != inv) {
                                            if (genl_pred.eql($$genls)) {
                                                est = add(est, cardinality_estimates.spec_cardinality(arg1));
                                            } else {
                                                est = add(est, kb_indexing.num_gaf_arg_index(arg1, TWO_INTEGER, genl_pred, UNPROVIDED));
                                            }
                                        } else
                                            if (genl_pred.eql($$genls)) {
                                                est = add(est, cardinality_estimates.genl_cardinality(arg1));
                                            } else {
                                                est = add(est, kb_indexing.num_gaf_arg_index(arg1, ONE_INTEGER, genl_pred, UNPROVIDED));
                                            }

                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$7);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$14;
                                                        final SubLObject new_list = cdolist_list_var_$14 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$14.first();
                                                        while (NIL != cdolist_list_var_$14) {
                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                            generating_fn = cdolist_list_var_$14.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return max($default_transitive_walk_cost$.getDynamicValue(thread), est);
    }

    public static SubLObject removal_transitive_arg1_walk_iterator(final SubLObject predicate, final SubLObject arg1) {
        final SubLObject inner_iterator = ghl_search_methods.new_removal_ghl_closure_iterator(predicate, arg1, $FORWARD, UNPROVIDED);
        if (NIL != fort_types_interface.irreflexive_binary_predicate_p(predicate)) {
            return iteration.new_filter_iterator(inner_iterator, $sym26$NOT_EQUALS_, list(arg1));
        }
        return inner_iterator;
    }

    public static SubLObject removal_transitive_arg2_walk_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject est = ZERO_INTEGER;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
        final SubLObject node_var = pred;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str20$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str15$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(module, thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$23 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_pred = node_var_$23;
                                    final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inv = predicate_mode;
                                        if (NIL != inv) {
                                            if (genl_pred.eql($$genls)) {
                                                est = add(est, cardinality_estimates.genl_cardinality(arg2));
                                            } else {
                                                est = add(est, kb_indexing.num_gaf_arg_index(arg2, ONE_INTEGER, genl_pred, UNPROVIDED));
                                            }
                                        } else
                                            if (genl_pred.eql($$genls)) {
                                                est = add(est, cardinality_estimates.spec_cardinality(arg2));
                                            } else {
                                                est = add(est, kb_indexing.num_gaf_arg_index(arg2, TWO_INTEGER, genl_pred, UNPROVIDED));
                                            }

                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$23);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$28;
                                                                        for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$30;
                                                        final SubLObject new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$30.first();
                                                        while (NIL != cdolist_list_var_$30) {
                                                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$24, thread);
                                                            }
                                                            cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                            generating_fn = cdolist_list_var_$30.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$20, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str24$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return max($default_transitive_walk_cost$.getDynamicValue(thread), est);
    }

    public static SubLObject removal_transitive_arg2_walk_iterator(final SubLObject predicate, final SubLObject arg2) {
        final SubLObject inner_iterator = ghl_search_methods.new_removal_ghl_closure_iterator(predicate, arg2, $BACKWARD, UNPROVIDED);
        if (NIL != fort_types_interface.irreflexive_binary_predicate_p(predicate)) {
            return iteration.new_filter_iterator(inner_iterator, $sym26$NOT_EQUALS_, list(arg2));
        }
        return inner_iterator;
    }

    public static SubLObject inference_transitivity_gather_arg1(final SubLObject predicate, final SubLObject arg2) {
        return ghl_search_methods.ghl_all_backward_true_nodes(predicate, arg2, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject predicate_union_fn_natP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_utilities.nat_with_functor_p(v_object, $$PredicateUnionFn_Reifiable)) || (NIL != cycl_utilities.nat_with_functor_p(v_object, $$PredicateUnionFn)));
    }

    public static SubLObject removal_transitive_predicate_union_fn_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicates = cycl_utilities.atomic_sentence_args(cycl_utilities.atomic_sentence_predicate(asent), UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cost = ONE_INTEGER;
        if ((NIL != variables.fully_bound_p(arg1)) && (NIL != variables.fully_bound_p(arg2))) {
            SubLObject cdolist_list_var = predicates;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cost = add(cost, $default_transitive_check_cost$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } else
            if (NIL != variables.fully_bound_p(arg1)) {
                cost = multiply(cost, cardinality_estimates.generality_estimate(arg1));
                SubLObject cdolist_list_var = predicates;
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cost = multiply(cost, removal_transitive_arg1_walk_cost(make_binary_formula(pred, arg1, arg2), UNPROVIDED));
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            } else
                if (NIL != variables.fully_bound_p(arg2)) {
                    cost = multiply(cost, cardinality_estimates.generality_estimate(arg1));
                    SubLObject cdolist_list_var = predicates;
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        cost = multiply(cost, removal_transitive_arg2_walk_cost(make_binary_formula(pred, arg1, arg2), UNPROVIDED));
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                }


        return multiply(ONE_INTEGER, cost);
    }

    public static SubLObject removal_transitive_predicate_union_fn_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicates = cycl_utilities.atomic_sentence_args(cycl_utilities.atomic_sentence_predicate(asent), UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != variables.fully_bound_p(arg1)) && (NIL != variables.fully_bound_p(arg2))) {
            final SubLObject supports = (NIL != inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(inference_datastructures_problem.problem_store(inference_worker.currently_active_problem()))) ? ghl_search_methods.why_gt_predicates_relation_p(predicates, make_list(length(predicates), $FORWARD), arg1, arg2, UNPROVIDED, UNPROVIDED) : ghl_search_methods.gt_predicates_relation_p(predicates, make_list(length(predicates), $FORWARD), arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (supports.isCons()) {
                backward.removal_add_node(supports.first(), NIL, supports.rest());
            } else
                if (NIL != supports) {
                    backward.removal_add_node(arguments.make_hl_support($TRANSITIVITY, asent, UNPROVIDED, UNPROVIDED), NIL, UNPROVIDED);
                }

        } else
            if (NIL != variables.fully_bound_p(arg1)) {
                SubLObject cdolist_list_var = ghl_search_methods.ghl_closures(predicates, arg1, make_list(length(predicates), $FORWARD), UNPROVIDED, UNPROVIDED);
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject v_bindings = unification_utilities.term_unify(arg2, v_answer, UNPROVIDED, UNPROVIDED);
                    final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
                    final SubLObject hl_support = arguments.make_hl_support($TRANSITIVITY, sentence, UNPROVIDED, UNPROVIDED);
                    backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_answer = cdolist_list_var.first();
                } 
            } else
                if (NIL != variables.fully_bound_p(arg2)) {
                    SubLObject cdolist_list_var = ghl_search_methods.ghl_closures(predicates, arg2, make_list(length(predicates), $BACKWARD), UNPROVIDED, UNPROVIDED);
                    SubLObject v_answer = NIL;
                    v_answer = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject v_bindings = unification_utilities.term_unify(arg1, v_answer, UNPROVIDED, UNPROVIDED);
                        final SubLObject sentence = bindings.apply_bindings(v_bindings, asent);
                        final SubLObject hl_support = arguments.make_hl_support($TRANSITIVITY, sentence, UNPROVIDED, UNPROVIDED);
                        backward.removal_add_node(hl_support, v_bindings, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_answer = cdolist_list_var.first();
                    } 
                }


        return NIL;
    }

    public static SubLObject removal_nearest_restricted_transitive_neighbor_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const36$nearestRestrictedTransitiveNeighb)) {
            return removal_nearest_restricted_transitive_neighbor_expand_int(asent, sense, NIL, NIL);
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const40$nearestRestrictedTransitiveNeighb)) {
            return removal_nearest_restricted_transitive_neighbor_expand_int(asent, sense, T, NIL);
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const43$nearestRestrictedTransitiveNeighb)) {
            return removal_nearest_restricted_transitive_neighbor_expand_int(asent, sense, NIL, T);
        }
        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, $const46$nearestRestrictedTransitiveNeighb)) {
            return removal_nearest_restricted_transitive_neighbor_expand_int(asent, sense, T, T);
        }
        return NIL;
    }

    public static SubLObject removal_nearest_restricted_transitive_neighbor_expand_int(final SubLObject asent, SubLObject sense, SubLObject inverseP, SubLObject properP) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (inverseP == UNPROVIDED) {
            inverseP = NIL;
        }
        if (properP == UNPROVIDED) {
            properP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binary_pred = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject thing = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject unary_pred = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject neighbor = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        SubLObject query_count = ZERO_INTEGER;
        SubLObject terms_to_check = list(thing);
        final SubLObject answer_supports_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject answer_bindings_dict = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject answers = NIL;
        SubLObject initial_term_checkedP = NIL;
        SubLObject checked_terms = NIL;
        while (NIL != terms_to_check) {
            final SubLObject v_term = terms_to_check.first();
            terms_to_check = terms_to_check.rest();
            checked_terms = cons(v_term, checked_terms);
            if (!query_count.numG($nearest_restricted_transitive_neighbor_max_query_count$.getDynamicValue(thread))) {
                SubLObject already_subsumedP = NIL;
                if (NIL == already_subsumedP) {
                    SubLObject csome_list_var;
                    SubLObject answer_term;
                    for (csome_list_var = answers, answer_term = NIL, answer_term = csome_list_var.first(); (NIL == already_subsumedP) && (NIL != csome_list_var); already_subsumedP = (NIL != inverseP) ? ghl_search_methods.ghl_predicate_relation_p(binary_pred, v_term, answer_term, UNPROVIDED, UNPROVIDED, UNPROVIDED) : ghl_search_methods.ghl_predicate_relation_p(binary_pred, answer_term, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , answer_term = csome_list_var.first()) {
                    }
                }
                if (NIL != already_subsumedP) {
                    continue;
                }
                SubLObject query_properties = NIL;
                SubLObject results = NIL;
                query_properties = putf(query_properties, $RETURN, $BINDINGS_AND_SUPPORTS);
                if ((NIL != properP) && (NIL == initial_term_checkedP)) {
                    initial_term_checkedP = T;
                } else {
                    results = ask_utilities.recursive_query(make_unary_formula(unary_pred, v_term), mt_relevance_macros.$mt$.getDynamicValue(thread), query_properties);
                }
                query_count = add(query_count, ONE_INTEGER);
                if (NIL != results) {
                    SubLObject cdolist_list_var = results;
                    SubLObject bindings_and_supports = NIL;
                    bindings_and_supports = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = bindings_and_supports;
                        SubLObject v_bindings = NIL;
                        SubLObject supports = NIL;
                        destructuring_bind_must_consp(current, datum, $list52);
                        v_bindings = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list52);
                        supports = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject answer_bindings = unification_utilities.term_unify(v_term, neighbor, UNPROVIDED, UNPROVIDED);
                            if (NIL != answer_bindings) {
                                answers = cons(v_term, answers);
                                SubLObject answer_supports = supports;
                                if (NIL == kb_utilities.kbeq(thing, v_term)) {
                                    answer_supports = cons(arguments.make_hl_support($QUERY, make_binary_formula(binary_pred, thing, v_term), UNPROVIDED, UNPROVIDED), answer_supports);
                                }
                                dictionary.dictionary_enter(answer_bindings_dict, v_term, answer_bindings);
                                dictionary.dictionary_enter(answer_supports_dict, v_term, answer_supports);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list52);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        bindings_and_supports = cdolist_list_var.first();
                    } 
                } else {
                    final SubLObject next_terms = (NIL != inverseP) ? ghl_search_methods.ghl_max_inferiors(v_term, binary_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED) : ghl_search_methods.ghl_min_superiors(v_term, binary_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    query_count = add(query_count, ONE_INTEGER);
                    SubLObject cdolist_list_var2 = next_terms;
                    SubLObject next_term = NIL;
                    next_term = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == list_utilities.member_kbeqP(next_term, checked_terms)) {
                            final SubLObject new_cons = cons(next_term, NIL);
                            final SubLObject list = terms_to_check;
                            if (NIL != list) {
                                subl_macros.rplacd_last(list, new_cons);
                            } else {
                                terms_to_check = new_cons;
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        next_term = cdolist_list_var2.first();
                    } 
                }
            }
        } 
        SubLObject cdolist_list_var3;
        answers = cdolist_list_var3 = (NIL != inverseP) ? ghl_search_methods.ghl_max_terms_wrt(binary_pred, answers, UNPROVIDED) : ghl_search_methods.ghl_min_terms_wrt(binary_pred, answers, UNPROVIDED);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var3.first();
        while (NIL != cdolist_list_var3) {
            final SubLObject answer_supports2 = dictionary.dictionary_lookup(answer_supports_dict, v_answer, UNPROVIDED);
            final SubLObject answer_bindings2 = dictionary.dictionary_lookup(answer_bindings_dict, v_answer, UNPROVIDED);
            backward.removal_add_node(answer_supports2.first(), answer_bindings2, answer_supports2.rest());
            cdolist_list_var3 = cdolist_list_var3.rest();
            v_answer = cdolist_list_var3.first();
        } 
        return NIL;
    }

    public static SubLObject declare_removal_modules_transitivity_file() {
        declareFunction(me, "make_transitivity_support", "MAKE-TRANSITIVITY-SUPPORT", 1, 2, false);
        declareFunction(me, "gt_required_arg_type_p", "GT-REQUIRED-ARG-TYPE-P", 1, 0, false);
        new removal_modules_transitivity.$gt_required_arg_type_p$UnaryFunction();
        declareFunction(me, "inference_transitivity_check", "INFERENCE-TRANSITIVITY-CHECK", 3, 2, false);
        declareFunction(me, "inference_transitivity_check_strict", "INFERENCE-TRANSITIVITY-CHECK-STRICT", 3, 2, false);
        declareFunction(me, "inference_transitivity_justify", "INFERENCE-TRANSITIVITY-JUSTIFY", 3, 2, false);
        declareFunction(me, "removal_transitive_arg1_walk_cost", "REMOVAL-TRANSITIVE-ARG1-WALK-COST", 1, 1, false);
        new removal_modules_transitivity.$removal_transitive_arg1_walk_cost$UnaryFunction();
        new removal_modules_transitivity.$removal_transitive_arg1_walk_cost$BinaryFunction();
        declareFunction(me, "removal_transitive_arg1_walk_iterator", "REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR", 2, 0, false);
        new removal_modules_transitivity.$removal_transitive_arg1_walk_iterator$BinaryFunction();
        declareFunction(me, "removal_transitive_arg2_walk_cost", "REMOVAL-TRANSITIVE-ARG2-WALK-COST", 1, 1, false);
        declareFunction(me, "removal_transitive_arg2_walk_iterator", "REMOVAL-TRANSITIVE-ARG2-WALK-ITERATOR", 2, 0, false);
        declareFunction(me, "inference_transitivity_gather_arg1", "INFERENCE-TRANSITIVITY-GATHER-ARG1", 2, 0, false);
        declareFunction(me, "predicate_union_fn_natP", "PREDICATE-UNION-FN-NAT?", 1, 0, false);
        declareFunction(me, "removal_transitive_predicate_union_fn_cost", "REMOVAL-TRANSITIVE-PREDICATE-UNION-FN-COST", 1, 1, false);
        declareFunction(me, "removal_transitive_predicate_union_fn_expand", "REMOVAL-TRANSITIVE-PREDICATE-UNION-FN-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nearest_restricted_transitive_neighbor_expand", "REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND", 1, 1, false);
        declareFunction(me, "removal_nearest_restricted_transitive_neighbor_expand_int", "REMOVAL-NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-EXPAND-INT", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_transitivity_file() {
        defparameter("*DEFAULT-TRANSITIVE-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        defparameter("*TRANSITIVITY-JUSTIFICATION-MAX-LENGTH*", TEN_INTEGER);
        defparameter("*DEFAULT-TRANSITIVE-WALK-COST*", FOUR_INTEGER);
        defparameter("*NEAREST-RESTRICTED-TRANSITIVE-NEIGHBOR-MAX-QUERY-COUNT*", $int$256);
        return NIL;
    }

    public static SubLObject setup_removal_modules_transitivity_file() {
        inference_modules.inference_removal_module($REMOVAL_TRANSITIVE_CHECK, $list5);
        inference_modules.inference_removal_module($REMOVAL_TRANSITIVE_ARG1_WALK, $list8);
        inference_modules.inference_removal_module($REMOVAL_TRANSITIVE_ARG2_WALK, $list28);
        preference_modules.inference_preference_module($REMOVAL_TRANSITIVE_PREDICATE_UNION_FN_DOOM, $list31);
        inference_modules.inference_removal_module($REMOVAL_TRANSITIVE_PREDICATE_UNION_FN, $list35);
        inference_modules.register_solely_specific_removal_module_predicate($const36$nearestRestrictedTransitiveNeighb);
        preference_modules.doomed_unless_arg_bindable($POS, $const36$nearestRestrictedTransitiveNeighb, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const36$nearestRestrictedTransitiveNeighb, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const36$nearestRestrictedTransitiveNeighb, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR, $list39);
        inference_modules.register_solely_specific_removal_module_predicate($const40$nearestRestrictedTransitiveNeighb);
        preference_modules.doomed_unless_arg_bindable($POS, $const40$nearestRestrictedTransitiveNeighb, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const40$nearestRestrictedTransitiveNeighb, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const40$nearestRestrictedTransitiveNeighb, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_INVERSE, $list42);
        inference_modules.register_solely_specific_removal_module_predicate($const43$nearestRestrictedTransitiveNeighb);
        preference_modules.doomed_unless_arg_bindable($POS, $const43$nearestRestrictedTransitiveNeighb, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const43$nearestRestrictedTransitiveNeighb, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const43$nearestRestrictedTransitiveNeighb, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_PROPER, $list45);
        inference_modules.register_solely_specific_removal_module_predicate($const46$nearestRestrictedTransitiveNeighb);
        preference_modules.doomed_unless_arg_bindable($POS, $const46$nearestRestrictedTransitiveNeighb, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const46$nearestRestrictedTransitiveNeighb, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const46$nearestRestrictedTransitiveNeighb, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_NEAREST_RESTRICTED_TRANSITIVE_NEIGHBOR_INVERSE_PROPER, $list48);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_transitivity_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_transitivity_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_transitivity_file();
    }

    

    public static final class $gt_required_arg_type_p$UnaryFunction extends UnaryFunction {
        public $gt_required_arg_type_p$UnaryFunction() {
            super(extractFunctionNamed("GT-REQUIRED-ARG-TYPE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return gt_required_arg_type_p(arg1);
        }
    }

    public static final class $removal_transitive_arg1_walk_cost$UnaryFunction extends UnaryFunction {
        public $removal_transitive_arg1_walk_cost$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_transitive_arg1_walk_cost(arg1, removal_modules_transitivity.$removal_transitive_arg1_walk_cost$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_transitive_arg1_walk_cost$BinaryFunction extends BinaryFunction {
        public $removal_transitive_arg1_walk_cost$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-COST"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_transitive_arg1_walk_cost(arg1, arg2);
        }
    }

    public static final class $removal_transitive_arg1_walk_iterator$BinaryFunction extends BinaryFunction {
        public $removal_transitive_arg1_walk_iterator$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_transitive_arg1_walk_iterator(arg1, arg2);
        }
    }
}

/**
 * Total time: 775 ms
 */
