package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_instance;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$average_all_isa_count$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_instance.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_relation_all_instance extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_relation_all_instance();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_instance";

    public static final String myFingerPrint = "f19981b55b72366d301de93b13cdd3337fd2582ace0fc834354c8402988d506c";

    // defparameter
    private static final SubLSymbol $estimated_per_collection_removal_all_instance_count$ = makeSymbol("*ESTIMATED-PER-COLLECTION-REMOVAL-ALL-INSTANCE-COUNT*");

    // defparameter
    private static final SubLSymbol $relation_all_instance_rule$ = makeSymbol("*RELATION-ALL-INSTANCE-RULE*");



    // defparameter
    private static final SubLSymbol $removal_relation_all_instance_check_cost$ = makeSymbol("*REMOVAL-RELATION-ALL-INSTANCE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $minimum_relation_all_instance_unify_cost$ = makeSymbol("*MINIMUM-RELATION-ALL-INSTANCE-UNIFY-COST*");

    // defparameter
    private static final SubLSymbol $estimated_per_collection_removal_instance_all_count$ = makeSymbol("*ESTIMATED-PER-COLLECTION-REMOVAL-INSTANCE-ALL-COUNT*");

    // deflexical
    private static final SubLSymbol $relation_instance_all_rule$ = makeSymbol("*RELATION-INSTANCE-ALL-RULE*");



    // defparameter
    private static final SubLSymbol $removal_relation_instance_all_check_cost$ = makeSymbol("*REMOVAL-RELATION-INSTANCE-ALL-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $minimum_relation_instance_all_unify_cost$ = makeSymbol("*MINIMUM-RELATION-INSTANCE-ALL-UNIFY-COST*");

    private static final SubLSymbol $RELATION_ALL_INSTANCE = makeKeyword("RELATION-ALL-INSTANCE");

    public static final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-ALL-INSTANCE-COULD-APPLY-IF-MORE-BOUND"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));



    private static final SubLSymbol RELATION_ALL_INSTANCE_COULD_APPLY_IF_MORE_BOUND = makeSymbol("RELATION-ALL-INSTANCE-COULD-APPLY-IF-MORE-BOUND");

    private static final SubLSymbol $RELATION_INSTANCE_ALL = makeKeyword("RELATION-INSTANCE-ALL");

    private static final SubLList $list6 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-INSTANCE-ALL-COULD-APPLY-IF-MORE-BOUND"));

    private static final SubLObject $$relationInstanceAll = reader_make_constant_shell(makeString("relationInstanceAll"));

    private static final SubLSymbol RELATION_INSTANCE_ALL_COULD_APPLY_IF_MORE_BOUND = makeSymbol("RELATION-INSTANCE-ALL-COULD-APPLY-IF-MORE-BOUND");

    private static final SubLList $list9 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("relationAllInstance")), makeSymbol("?PRED"), makeSymbol("?COL"), makeSymbol("?VALUE")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL"))), list(makeSymbol("?PRED"), makeSymbol("?OBJ"), makeSymbol("?VALUE")));

    public static final SubLSymbol $relation_all_instance_defining_mt$ = makeSymbol("*RELATION-ALL-INSTANCE-DEFINING-MT*");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));





    private static final SubLFloat $float$1_5 = makeDouble(1.5);





    private static final SubLSymbol $REMOVAL_RELATION_ALL_INSTANCE_CHECK = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-RELATION-ALL-INSTANCE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) (#$YearsDuration 1))\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $REMOVAL_RELATION_ALL_INSTANCE_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY");

    private static final SubLList $list22 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT or NAUT\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <object> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln ?GENDER)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });

    private static final SubLList $list23 = cons(makeSymbol("COLLECTION"), makeSymbol("RAI-ASSERTIONS"));











    private static final SubLString $str29$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str34$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str35$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str36$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list37 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str38$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol $REMOVAL_RELATION_ALL_INSTANCE_ITERATE = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-ITERATE");

    public static final SubLList $list40 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <non-fort> <object>) where <object> is a FORT\n from (#$relationAllInstance <predicate> <collection> <object>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender ?WHO #$Masculine)\n from (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)") });

    private static final SubLList $list41 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("relationInstanceAll")), makeSymbol("?PRED"), makeSymbol("?VALUE"), makeSymbol("?COL")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL"))), list(makeSymbol("?PRED"), makeSymbol("?VALUE"), makeSymbol("?OBJ")));

    public static final SubLSymbol $relation_instance_all_defining_mt$ = makeSymbol("*RELATION-INSTANCE-ALL-DEFINING-MT*");

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_ALL_CHECK = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-RELATION-INSTANCE-ALL-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationInstanceAll <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationInstanceAll #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationInstanceAll #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_ALL_UNIFY = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY");

    private static final SubLList $list46 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <fort or naut>)\nfrom (#$relationInstanceAll <predicate> <value> <collection>) \nand (#$isa <fort> <collection>)") });

    private static final SubLSymbol $REMOVAL_RELATION_INSTANCE_ALL_ITERATE = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-ITERATE");

    private static final SubLList $list48 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT\n from (#$relationInstanceAll <predicate> <object> <collection>)\n by iterating over <collection>"), makeKeyword("EXAMPLE"), makeString("(subsetOf TheEmptySet ?WHAT) \n from\n   (relationInstanceAll subsetOf TheEmptySet SetOrCollection)") });

    public static SubLObject relation_all_instance_could_apply_if_more_bound(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pred = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != list_utilities.tree_find_any(bindable_vars, arg1, UNPROVIDED, UNPROVIDED)) && (NIL != forts.fort_p(pred))) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$relationAllInstance, pred, ONE_INTEGER, UNPROVIDED))) {
            return $DISPREFERRED;
        }
        return NIL;
    }

    public static SubLObject relation_instance_all_could_apply_if_more_bound(final SubLObject asent, final SubLObject bindable_vars, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject pred = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (((NIL != list_utilities.tree_find_any(bindable_vars, arg2, UNPROVIDED, UNPROVIDED)) && (NIL != forts.fort_p(pred))) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$relationInstanceAll, pred, ONE_INTEGER, UNPROVIDED))) {
            return $DISPREFERRED;
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_all_instance_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationAllInstance, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_all_instance_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationAllInstance, mt, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_all_instance_for_value(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != indexed_term_p(v_term)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$relationAllInstance, mt, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject relation_all_instance_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationAllInstance);
    }

    public static SubLObject relation_all_instance_collection_cost_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($estimated_per_collection_removal_all_instance_count$.getDynamicValue(thread), $average_all_isa_count$.getDynamicValue(thread));
    }

    public static SubLObject relation_all_instance_value_cost_estimate(final SubLObject value) {
        return kb_indexing.relevant_num_gaf_arg_index(value, THREE_INTEGER, $$relationAllInstance);
    }

    public static SubLObject removal_relation_all_instance_required(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((NIL == hl_supports.hl_predicate_p(predicate)) && (NIL != removal_some_relation_all_instance_for_predicate(predicate, NIL)));
    }

    public static SubLObject make_relation_all_instance_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arguments.make_hl_support($CODE, $relation_all_instance_rule$.getDynamicValue(thread), $relation_all_instance_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_relation_all_instance_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_all_instance_required(asent)) {
            final SubLObject value = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return makeBoolean((NIL != possibly_naut_p(value)) || (NIL != removal_some_relation_all_instance_for_value(value, NIL)));
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject value = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_instance_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_all_instance_collection_cost_estimate();
        final SubLObject value_cost_estimate_meaningfulP = forts.fort_p(value);
        final SubLObject value_cost_estimate = (NIL != value_cost_estimate_meaningfulP) ? relation_all_instance_value_cost_estimate(value) : NIL;
        if (((NIL != value_cost_estimate_meaningfulP) && value_cost_estimate.numLE(predicate_cost_estimate)) && value_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationAllInstance;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(value, THREE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(value, THREE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = NIL;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                if (NIL != valid_$3) {
                                    removal_relation_all_instance_check_via_value_expand(asent, assertion);
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else
            if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
                final SubLObject pred_var = $$relationAllInstance;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$2 = NIL;
                                final SubLObject token_var_$3 = NIL;
                                while (NIL == done_var_$2) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                    final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(assertion));
                                    if (NIL != valid_$4) {
                                        removal_relation_all_instance_check_via_predicate_expand(asent, assertion);
                                    }
                                    done_var_$2 = makeBoolean(NIL == valid_$4);
                                } 
                            } finally {
                                final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else {
                SubLObject cdolist_list_var;
                final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_object, NIL, UNPROVIDED);
                SubLObject collection = NIL;
                collection = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != removal_some_relation_all_instance_for_collection(collection, NIL)) {
                        final SubLObject pred_var2 = $$relationAllInstance;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, TWO_INTEGER, pred_var2)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, TWO_INTEGER, pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion2));
                                            if (NIL != valid_$5) {
                                                removal_relation_all_instance_check_via_collection_expand(asent, assertion2);
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    collection = cdolist_list_var.first();
                } 
            }

        return NIL;
    }

    public static SubLObject removal_relation_all_instance_check_via_value_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        if (NIL == isa.isaP(v_object, assertions_high.gaf_arg2(assertion), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_all_instance_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_all_instance_check_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject value = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        if (!value.equal(assertions_high.gaf_arg3(assertion))) {
            return NIL;
        }
        return removal_relation_all_instance_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_all_instance_check_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject value = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == czer_utilities.equal_modulo_el_var_names(value, assertions_high.gaf_arg3(assertion))) {
            return NIL;
        }
        if (NIL == isa.isaP(v_object, assertions_high.gaf_arg2(assertion), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_all_instance_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_all_instance_check_expand_guts(final SubLObject asent, final SubLObject assertion) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject collection = assertions_high.gaf_arg2(assertion);
            final SubLObject rule_support = make_relation_all_instance_support();
            final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_object, collection), UNPROVIDED, UNPROVIDED);
            final SubLObject more_supports = list(rule_support, isa_support);
            backward.removal_add_node(assertion, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_all_instance_required(asent)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != possibly_naut_p(v_object)));
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return max($minimum_relation_all_instance_unify_cost$.getDynamicValue(thread), min(relation_all_instance_predicate_cost_estimate(cycl_utilities.atomic_sentence_predicate(asent)), relation_all_instance_collection_cost_estimate()));
    }

    public static SubLObject removal_relation_all_instance_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_all_instance_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_all_instance_collection_cost_estimate();
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationAllInstance;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$10 = NIL;
                            final SubLObject token_var_$11 = NIL;
                            while (NIL == done_var_$10) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$11);
                                final SubLObject valid_$12 = makeBoolean(!token_var_$11.eql(assertion));
                                if (NIL != valid_$12) {
                                    removal_relation_all_instance_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$10 = makeBoolean(NIL == valid_$12);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_object, NIL, UNPROVIDED);
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_some_relation_all_instance_for_collection(collection, NIL)) {
                    final SubLObject pred_var2 = $$relationAllInstance;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, TWO_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, TWO_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$11 = NIL;
                                    final SubLObject token_var_$12 = NIL;
                                    while (NIL == done_var_$11) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$12);
                                        final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(assertion2));
                                        if (NIL != valid_$13) {
                                            removal_relation_all_instance_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$11 = makeBoolean(NIL == valid_$13);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        return removal_relation_all_instance_unify_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_all_instance_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg2(assertion);
        if (NIL == isa.isaP(arg1, collection, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_all_instance_unify_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_all_instance_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject collection = assertions_high.gaf_arg2(assertion);
            final SubLObject value = assertions_high.gaf_arg3(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg2, value, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject rule_support = make_relation_all_instance_support();
                final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_object, collection), UNPROVIDED, UNPROVIDED);
                final SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_iterate_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_all_instance_required(asent)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return removal_some_relation_all_instance_for_value(v_object, NIL);
        }
        return NIL;
    }

    public static SubLObject removal_relation_all_instance_iterate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cost = ZERO_INTEGER;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = removal_relation_all_instance_iteration_collections(predicate, v_object);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject collection_cost = cardinality_estimates.instance_cardinality(collection);
            cost = add(cost, collection_cost);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return cost;
    }

    public static SubLObject removal_relation_all_instance_iteration_collections(final SubLObject predicate, final SubLObject v_object) {
        return list_utilities.alist_keys(removal_relation_all_instance_iteration_collections_rai(predicate, v_object));
    }

    public static SubLObject removal_relation_all_instance_iteration_collections_rai(final SubLObject predicate, final SubLObject v_object) {
        SubLObject collections_rai = NIL;
        SubLObject cdolist_list_var;
        final SubLObject rai_assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($$relationAllInstance, predicate, v_object, ONE_INTEGER, THREE_INTEGER, $TRUE);
        SubLObject rai_ass = NIL;
        rai_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject collection = assertions_high.gaf_arg2(rai_ass);
            SubLObject collection_assertions = list_utilities.alist_lookup(collections_rai, collection, UNPROVIDED, UNPROVIDED);
            collection_assertions = cons(rai_ass, collection_assertions);
            collections_rai = list_utilities.alist_enter(collections_rai, collection, collection_assertions, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rai_ass = cdolist_list_var.first();
        } 
        return collections_rai;
    }

    public static SubLObject removal_relation_all_instance_iterate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject unbound_instance = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject code_support = make_relation_all_instance_support();
        SubLObject cdolist_list_var;
        final SubLObject collections_rai = cdolist_list_var = removal_relation_all_instance_iteration_collections_rai(predicate, v_object);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject collection = NIL;
            SubLObject rai_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            collection = current.first();
            current = rai_assertions = current.rest();
            final SubLObject node_var = collection;
            final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$16 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str34$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$16, UNPROVIDED);
                                            while (NIL != node_var_$16) {
                                                final SubLObject tt_node_var = node_var_$16;
                                                SubLObject cdolist_list_var_$25;
                                                final SubLObject accessible_modules = cdolist_list_var_$25 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var_$25.first();
                                                while (NIL != cdolist_list_var_$25) {
                                                    final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
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
                                                                                SubLObject iteration_state_$29;
                                                                                for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
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
                                                                                                SubLObject instance;
                                                                                                SubLObject cdolist_list_var_$26;
                                                                                                SubLObject rai_ass;
                                                                                                SubLObject v_bindings;
                                                                                                SubLObject unify_justification;
                                                                                                SubLObject isa_support;
                                                                                                SubLObject more_supports;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                            cdolist_list_var_$26 = rai_assertions;
                                                                                                            rai_ass = NIL;
                                                                                                            rai_ass = cdolist_list_var_$26.first();
                                                                                                            while (NIL != cdolist_list_var_$26) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                v_bindings = unification_utilities.term_unify(unbound_instance, instance, T, T);
                                                                                                                unify_justification = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                isa_support = arguments.make_hl_support($ISA, list($$isa, instance, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                more_supports = append(list(code_support, isa_support), unify_justification);
                                                                                                                if (NIL != v_bindings) {
                                                                                                                    backward.removal_add_node(rai_ass, v_bindings, more_supports);
                                                                                                                }
                                                                                                                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                                                                                                                rai_ass = cdolist_list_var_$26.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance2)) {
                                                                                                                SubLObject cdolist_list_var_$27 = rai_assertions;
                                                                                                                SubLObject rai_ass2 = NIL;
                                                                                                                rai_ass2 = cdolist_list_var_$27.first();
                                                                                                                while (NIL != cdolist_list_var_$27) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject v_bindings2 = unification_utilities.term_unify(unbound_instance, instance2, T, T);
                                                                                                                    final SubLObject unify_justification2 = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject isa_support2 = arguments.make_hl_support($ISA, list($$isa, instance2, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                    final SubLObject more_supports2 = append(list(code_support, isa_support2), unify_justification2);
                                                                                                                    if (NIL != v_bindings2) {
                                                                                                                        backward.removal_add_node(rai_ass2, v_bindings2, more_supports2);
                                                                                                                    }
                                                                                                                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                                                                                                                    rai_ass2 = cdolist_list_var_$27.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$23, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$22, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current_$34;
                                                                    final SubLObject datum_$33 = current_$34 = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current_$34, datum_$33, $list37);
                                                                    link_node = current_$34.first();
                                                                    current_$34 = current_$34.rest();
                                                                    destructuring_bind_must_consp(current_$34, datum_$33, $list37);
                                                                    mt2 = current_$34.first();
                                                                    current_$34 = current_$34.rest();
                                                                    destructuring_bind_must_consp(current_$34, datum_$33, $list37);
                                                                    tv2 = current_$34.first();
                                                                    current_$34 = current_$34.rest();
                                                                    if (NIL == current_$34) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject rai_ass;
                                                                                            SubLObject v_bindings;
                                                                                            SubLObject unify_justification;
                                                                                            SubLObject isa_support;
                                                                                            SubLObject more_supports;
                                                                                            SubLObject cdolist_list_var_$28;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(instance)) {
                                                                                                        cdolist_list_var_$28 = rai_assertions;
                                                                                                        rai_ass = NIL;
                                                                                                        rai_ass = cdolist_list_var_$28.first();
                                                                                                        while (NIL != cdolist_list_var_$28) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            v_bindings = unification_utilities.term_unify(unbound_instance, instance, T, T);
                                                                                                            unify_justification = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            isa_support = arguments.make_hl_support($ISA, list($$isa, instance, collection), UNPROVIDED, UNPROVIDED);
                                                                                                            more_supports = append(list(code_support, isa_support), unify_justification);
                                                                                                            if (NIL != v_bindings) {
                                                                                                                backward.removal_add_node(rai_ass, v_bindings, more_supports);
                                                                                                            }
                                                                                                            cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                                                                                                            rai_ass = cdolist_list_var_$28.first();
                                                                                                        } 
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$38 = sol;
                                                                                                SubLObject instance2 = NIL;
                                                                                                instance2 = csome_list_var_$38.first();
                                                                                                while (NIL != csome_list_var_$38) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance2)) {
                                                                                                            SubLObject cdolist_list_var_$29 = rai_assertions;
                                                                                                            SubLObject rai_ass2 = NIL;
                                                                                                            rai_ass2 = cdolist_list_var_$29.first();
                                                                                                            while (NIL != cdolist_list_var_$29) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject v_bindings2 = unification_utilities.term_unify(unbound_instance, instance2, T, T);
                                                                                                                final SubLObject unify_justification2 = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject isa_support2 = arguments.make_hl_support($ISA, list($$isa, instance2, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                final SubLObject more_supports2 = append(list(code_support, isa_support2), unify_justification2);
                                                                                                                if (NIL != v_bindings2) {
                                                                                                                    backward.removal_add_node(rai_ass2, v_bindings2, more_supports2);
                                                                                                                }
                                                                                                                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                                                                                rai_ass2 = cdolist_list_var_$29.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$38 = csome_list_var_$38.rest();
                                                                                                    instance2 = csome_list_var_$38.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum_$33, $list37);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$30;
                                                                final SubLObject new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$30.first();
                                                                while (NIL != cdolist_list_var_$30) {
                                                                    final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject instance3;
                                                                            SubLObject cdolist_list_var_$31;
                                                                            SubLObject rai_ass3;
                                                                            SubLObject v_bindings3;
                                                                            SubLObject unify_justification3;
                                                                            SubLObject isa_support3;
                                                                            SubLObject more_supports3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(instance3)) {
                                                                                        cdolist_list_var_$31 = rai_assertions;
                                                                                        rai_ass3 = NIL;
                                                                                        rai_ass3 = cdolist_list_var_$31.first();
                                                                                        while (NIL != cdolist_list_var_$31) {
                                                                                            thread.resetMultipleValues();
                                                                                            v_bindings3 = unification_utilities.term_unify(unbound_instance, instance3, T, T);
                                                                                            unify_justification3 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            isa_support3 = arguments.make_hl_support($ISA, list($$isa, instance3, collection), UNPROVIDED, UNPROVIDED);
                                                                                            more_supports3 = append(list(code_support, isa_support3), unify_justification3);
                                                                                            if (NIL != v_bindings3) {
                                                                                                backward.removal_add_node(rai_ass3, v_bindings3, more_supports3);
                                                                                            }
                                                                                            cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                                                                                            rai_ass3 = cdolist_list_var_$31.first();
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject instance4 = NIL;
                                                                                instance4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(instance4)) {
                                                                                            SubLObject cdolist_list_var_$32 = rai_assertions;
                                                                                            SubLObject rai_ass4 = NIL;
                                                                                            rai_ass4 = cdolist_list_var_$32.first();
                                                                                            while (NIL != cdolist_list_var_$32) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject v_bindings4 = unification_utilities.term_unify(unbound_instance, instance4, T, T);
                                                                                                final SubLObject unify_justification4 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject isa_support4 = arguments.make_hl_support($ISA, list($$isa, instance4, collection), UNPROVIDED, UNPROVIDED);
                                                                                                final SubLObject more_supports4 = append(list(code_support, isa_support4), unify_justification4);
                                                                                                if (NIL != v_bindings4) {
                                                                                                    backward.removal_add_node(rai_ass4, v_bindings4, more_supports4);
                                                                                                }
                                                                                                cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                                                                                                rai_ass4 = cdolist_list_var_$32.first();
                                                                                            } 
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    instance4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                                                                    }
                                                                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                    generating_fn = cdolist_list_var_$30.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$22, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                    module_var = cdolist_list_var_$25.first();
                                                } 
                                                SubLObject cdolist_list_var_$33;
                                                final SubLObject accessible_modules2 = cdolist_list_var_$33 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var_$33.first();
                                                while (NIL != cdolist_list_var_$33) {
                                                    final SubLObject _prev_bind_0_$27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$16);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$30;
                                                                                for (iteration_state_$30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$30); iteration_state_$30 = dictionary_contents.do_dictionary_contents_next(iteration_state_$30)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$30);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$30);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$34;
                                                                final SubLObject new_list2 = cdolist_list_var_$34 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$34.first();
                                                                while (NIL != cdolist_list_var_$34) {
                                                                    final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                    }
                                                                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                                    generating_fn2 = cdolist_list_var_$34.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$23, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$27, thread);
                                                    }
                                                    cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                    module_var2 = cdolist_list_var_$33.first();
                                                } 
                                                node_var_$16 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$24, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$21, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$20, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str38$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$20, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$19, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$17, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_some_relation_instance_all_for_predicate(final SubLObject predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(predicate)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $$relationInstanceAll, mt, ONE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_instance_all_for_value(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != indexed_term_p(v_term)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_term, $$relationInstanceAll, mt, TWO_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_some_relation_instance_all_for_collection(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != forts.fort_p(collection)) {
            return kb_mapping_utilities.some_pred_value_in_relevant_mts(collection, $$relationInstanceAll, mt, THREE_INTEGER, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject relation_instance_all_predicate_cost_estimate(final SubLObject predicate) {
        return kb_indexing.relevant_num_gaf_arg_index(predicate, ONE_INTEGER, $$relationInstanceAll);
    }

    public static SubLObject relation_instance_all_collection_cost_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($estimated_per_collection_removal_instance_all_count$.getDynamicValue(thread), $average_all_isa_count$.getDynamicValue(thread));
    }

    public static SubLObject relation_instance_all_value_cost_estimate(final SubLObject v_term) {
        return kb_indexing.relevant_num_gaf_arg_index(v_term, TWO_INTEGER, $$relationInstanceAll);
    }

    public static SubLObject removal_relation_instance_all_required(final SubLObject asent) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return makeBoolean((NIL == hl_supports.hl_predicate_p(predicate)) && (NIL != removal_some_relation_instance_all_for_predicate(predicate, NIL)));
    }

    public static SubLObject make_relation_instance_all_support() {
        return arguments.make_hl_support($CODE, $relation_instance_all_rule$.getGlobalValue(), $relation_instance_all_defining_mt$.getGlobalValue(), $TRUE_MON);
    }

    public static SubLObject removal_relation_instance_all_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_instance_all_required(asent)) {
            final SubLObject value = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return makeBoolean((NIL != possibly_naut_p(value)) || (NIL != removal_some_relation_instance_all_for_value(value, NIL)));
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject value = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_instance_all_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_instance_all_collection_cost_estimate();
        final SubLObject value_cost_estimate_meaningfulP = forts.fort_p(value);
        final SubLObject value_cost_estimate = (NIL != value_cost_estimate_meaningfulP) ? relation_instance_all_value_cost_estimate(value) : NIL;
        if (((NIL != value_cost_estimate_meaningfulP) && value_cost_estimate.numLE(predicate_cost_estimate)) && value_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationInstanceAll;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(value, TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(value, TWO_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$54 = NIL;
                            final SubLObject token_var_$55 = NIL;
                            while (NIL == done_var_$54) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$55);
                                final SubLObject valid_$56 = makeBoolean(!token_var_$55.eql(assertion));
                                if (NIL != valid_$56) {
                                    removal_relation_instance_all_check_via_value_expand(asent, assertion);
                                }
                                done_var_$54 = makeBoolean(NIL == valid_$56);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else
            if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
                final SubLObject pred_var = $$relationInstanceAll;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$55 = NIL;
                                final SubLObject token_var_$56 = NIL;
                                while (NIL == done_var_$55) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$56);
                                    final SubLObject valid_$57 = makeBoolean(!token_var_$56.eql(assertion));
                                    if (NIL != valid_$57) {
                                        removal_relation_instance_all_check_via_predicate_expand(asent, assertion);
                                    }
                                    done_var_$55 = makeBoolean(NIL == valid_$57);
                                } 
                            } finally {
                                final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
            } else {
                SubLObject cdolist_list_var;
                final SubLObject all_isa = cdolist_list_var = isa.all_isa(v_object, NIL, UNPROVIDED);
                SubLObject collection = NIL;
                collection = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != removal_some_relation_instance_all_for_collection(collection, NIL)) {
                        final SubLObject pred_var2 = $$relationInstanceAll;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var2)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var2);
                            SubLObject done_var2 = NIL;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$56 = NIL;
                                        final SubLObject token_var_$57 = NIL;
                                        while (NIL == done_var_$56) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$57);
                                            final SubLObject valid_$58 = makeBoolean(!token_var_$57.eql(assertion2));
                                            if (NIL != valid_$58) {
                                                removal_relation_instance_all_check_via_collection_expand(asent, assertion2);
                                            }
                                            done_var_$56 = makeBoolean(NIL == valid_$58);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean(NIL == valid2);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    collection = cdolist_list_var.first();
                } 
            }

        return NIL;
    }

    public static SubLObject removal_relation_instance_all_check_via_value_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        if (NIL == isa.isaP(v_object, assertions_high.gaf_arg3(assertion), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_instance_all_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_instance_all_check_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject value = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        if (!value.equal(assertions_high.gaf_arg2(assertion))) {
            return NIL;
        }
        return removal_relation_instance_all_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_instance_all_check_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject value = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL == czer_utilities.equal_modulo_el_var_names(value, assertions_high.gaf_arg2(assertion))) {
            return NIL;
        }
        if (NIL == isa.isaP(v_object, assertions_high.gaf_arg3(assertion), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_instance_all_check_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_instance_all_check_expand_guts(final SubLObject asent, final SubLObject assertion) {
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject collection = assertions_high.gaf_arg3(assertion);
            final SubLObject rule_support = make_relation_instance_all_support();
            final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_object, collection), UNPROVIDED, UNPROVIDED);
            final SubLObject more_supports = list(rule_support, isa_support);
            backward.removal_add_node(assertion, NIL, more_supports);
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_unify_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_instance_all_required(asent)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != possibly_naut_p(v_object)));
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_unify_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return max($minimum_relation_instance_all_unify_cost$.getDynamicValue(thread), min(relation_instance_all_predicate_cost_estimate(cycl_utilities.atomic_sentence_predicate(asent)), relation_instance_all_collection_cost_estimate()));
    }

    public static SubLObject removal_relation_instance_all_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject predicate_cost_estimate = relation_instance_all_predicate_cost_estimate(predicate);
        final SubLObject collection_cost_estimate = relation_instance_all_collection_cost_estimate();
        if (predicate_cost_estimate.numLE(collection_cost_estimate)) {
            final SubLObject pred_var = $$relationInstanceAll;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$63 = NIL;
                            final SubLObject token_var_$64 = NIL;
                            while (NIL == done_var_$63) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$64);
                                final SubLObject valid_$65 = makeBoolean(!token_var_$64.eql(assertion));
                                if (NIL != valid_$65) {
                                    removal_relation_instance_all_unify_via_predicate_expand(asent, assertion);
                                }
                                done_var_$63 = makeBoolean(NIL == valid_$65);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } else {
            SubLObject cdolist_list_var;
            final SubLObject all_isa = cdolist_list_var = isa.all_isa(arg2, NIL, UNPROVIDED);
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != removal_some_relation_instance_all_for_collection(collection, NIL)) {
                    final SubLObject pred_var2 = $$relationInstanceAll;
                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var2)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var2);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$64 = NIL;
                                    final SubLObject token_var_$65 = NIL;
                                    while (NIL == done_var_$64) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$65);
                                        final SubLObject valid_$66 = makeBoolean(!token_var_$65.eql(assertion2));
                                        if (NIL != valid_$66) {
                                            removal_relation_instance_all_unify_via_collection_expand(asent, assertion2);
                                        }
                                        done_var_$64 = makeBoolean(NIL == valid_$66);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_unify_via_predicate_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject collection = assertions_high.gaf_arg3(assertion);
        if (NIL == isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        return removal_relation_instance_all_unify_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_instance_all_unify_via_collection_expand(final SubLObject asent, final SubLObject assertion) {
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (!predicate.eql(assertions_high.gaf_arg1(assertion))) {
            return NIL;
        }
        return removal_relation_instance_all_unify_expand_guts(asent, assertion);
    }

    public static SubLObject removal_relation_instance_all_unify_expand_guts(final SubLObject asent, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != backward_utilities.direction_is_relevant(assertion)) {
            final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
            final SubLObject value = assertions_high.gaf_arg2(assertion);
            final SubLObject collection = assertions_high.gaf_arg3(assertion);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(arg1, value, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject rule_support = make_relation_instance_all_support();
                final SubLObject isa_support = arguments.make_hl_support($ISA, list($$isa, v_object, collection), UNPROVIDED, UNPROVIDED);
                final SubLObject more_supports = append(list(rule_support, isa_support), unify_justification);
                backward.removal_add_node(assertion, v_bindings, more_supports);
            }
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_iterate_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_relation_instance_all_required(asent)) {
            final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
            return removal_some_relation_instance_all_for_value(v_object, NIL);
        }
        return NIL;
    }

    public static SubLObject removal_relation_instance_all_iterate_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject cost = ZERO_INTEGER;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject collections = cdolist_list_var = removal_relation_instance_all_iteration_collections(predicate, v_object);
        SubLObject collection = NIL;
        collection = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject collection_cost = cardinality_estimates.instance_cardinality(collection);
            cost = add(cost, collection_cost);
            cdolist_list_var = cdolist_list_var.rest();
            collection = cdolist_list_var.first();
        } 
        return cost;
    }

    public static SubLObject removal_relation_instance_all_iteration_collections(final SubLObject predicate, final SubLObject v_object) {
        return list_utilities.alist_keys(removal_relation_instance_all_iteration_collections_ria(predicate, v_object));
    }

    public static SubLObject removal_relation_instance_all_iteration_collections_ria(final SubLObject predicate, final SubLObject v_object) {
        SubLObject collections_ria = NIL;
        SubLObject cdolist_list_var;
        final SubLObject ria_assertions = cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs($$relationInstanceAll, predicate, v_object, ONE_INTEGER, TWO_INTEGER, $TRUE);
        SubLObject ria_ass = NIL;
        ria_ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject collection = assertions_high.gaf_arg3(ria_ass);
            SubLObject collection_assertions = list_utilities.alist_lookup(collections_ria, collection, UNPROVIDED, UNPROVIDED);
            collection_assertions = cons(ria_ass, collection_assertions);
            collections_ria = list_utilities.alist_enter(collections_ria, collection, collection_assertions, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            ria_ass = cdolist_list_var.first();
        } 
        return collections_ria;
    }

    public static SubLObject removal_relation_instance_all_iterate_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject v_object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject unbound_instance = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject code_support = make_relation_instance_all_support();
        SubLObject cdolist_list_var;
        final SubLObject collections_ria = cdolist_list_var = removal_relation_instance_all_iteration_collections_ria(predicate, v_object);
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject collection = NIL;
            SubLObject rai_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list23);
            collection = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$69;
            rai_assertions = cdolist_list_var_$69 = current;
            SubLObject rai_ass = NIL;
            rai_ass = cdolist_list_var_$69.first();
            while (NIL != cdolist_list_var_$69) {
                final SubLObject node_var = collection;
                final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$70 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$71 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$73 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str34$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$75 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$70, UNPROVIDED);
                                                while (NIL != node_var_$70) {
                                                    final SubLObject tt_node_var = node_var_$70;
                                                    SubLObject cdolist_list_var_$70;
                                                    final SubLObject accessible_modules = cdolist_list_var_$70 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var_$70.first();
                                                    while (NIL != cdolist_list_var_$70) {
                                                        final SubLObject _prev_bind_0_$75 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$83;
                                                                                    for (iteration_state_$83 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$83); iteration_state_$83 = dictionary_contents.do_dictionary_contents_next(iteration_state_$83)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$83);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject instance;
                                                                                                    SubLObject v_bindings;
                                                                                                    SubLObject unify_justification;
                                                                                                    SubLObject isa_support;
                                                                                                    SubLObject more_supports;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                v_bindings = unification_utilities.term_unify(unbound_instance, instance, T, T);
                                                                                                                unify_justification = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                isa_support = arguments.make_hl_support($ISA, list($$isa, instance, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                more_supports = append(list(code_support, isa_support), unify_justification);
                                                                                                                if (NIL != v_bindings) {
                                                                                                                    backward.removal_add_node(rai_ass, v_bindings, more_supports);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject instance2 = NIL;
                                                                                                        instance2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(instance2)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject v_bindings2 = unification_utilities.term_unify(unbound_instance, instance2, T, T);
                                                                                                                    final SubLObject unify_justification2 = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject isa_support2 = arguments.make_hl_support($ISA, list($$isa, instance2, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                    final SubLObject more_supports2 = append(list(code_support, isa_support2), unify_justification2);
                                                                                                                    if (NIL != v_bindings2) {
                                                                                                                        backward.removal_add_node(rai_ass, v_bindings2, more_supports2);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            instance2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$77, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$83);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$76, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current_$86;
                                                                        final SubLObject datum_$85 = current_$86 = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current_$86, datum_$85, $list37);
                                                                        link_node = current_$86.first();
                                                                        current_$86 = current_$86.rest();
                                                                        destructuring_bind_must_consp(current_$86, datum_$85, $list37);
                                                                        mt2 = current_$86.first();
                                                                        current_$86 = current_$86.rest();
                                                                        destructuring_bind_must_consp(current_$86, datum_$85, $list37);
                                                                        tv2 = current_$86.first();
                                                                        current_$86 = current_$86.rest();
                                                                        if (NIL == current_$86) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject v_bindings;
                                                                                                SubLObject unify_justification;
                                                                                                SubLObject isa_support;
                                                                                                SubLObject more_supports;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            v_bindings = unification_utilities.term_unify(unbound_instance, instance, T, T);
                                                                                                            unify_justification = thread.secondMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            isa_support = arguments.make_hl_support($ISA, list($$isa, instance, collection), UNPROVIDED, UNPROVIDED);
                                                                                                            more_supports = append(list(code_support, isa_support), unify_justification);
                                                                                                            if (NIL != v_bindings) {
                                                                                                                backward.removal_add_node(rai_ass, v_bindings, more_supports);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$89 = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var_$89.first();
                                                                                                    while (NIL != csome_list_var_$89) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance2)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject v_bindings2 = unification_utilities.term_unify(unbound_instance, instance2, T, T);
                                                                                                                final SubLObject unify_justification2 = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject isa_support2 = arguments.make_hl_support($ISA, list($$isa, instance2, collection), UNPROVIDED, UNPROVIDED);
                                                                                                                final SubLObject more_supports2 = append(list(code_support, isa_support2), unify_justification2);
                                                                                                                if (NIL != v_bindings2) {
                                                                                                                    backward.removal_add_node(rai_ass, v_bindings2, more_supports2);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$89 = csome_list_var_$89.rest();
                                                                                                        instance2 = csome_list_var_$89.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum_$85, $list37);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$71;
                                                                    final SubLObject new_list = cdolist_list_var_$71 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$71.first();
                                                                    while (NIL != cdolist_list_var_$71) {
                                                                        final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject instance3;
                                                                                SubLObject v_bindings3;
                                                                                SubLObject unify_justification3;
                                                                                SubLObject isa_support3;
                                                                                SubLObject more_supports3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(instance3)) {
                                                                                            thread.resetMultipleValues();
                                                                                            v_bindings3 = unification_utilities.term_unify(unbound_instance, instance3, T, T);
                                                                                            unify_justification3 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            isa_support3 = arguments.make_hl_support($ISA, list($$isa, instance3, collection), UNPROVIDED, UNPROVIDED);
                                                                                            more_supports3 = append(list(code_support, isa_support3), unify_justification3);
                                                                                            if (NIL != v_bindings3) {
                                                                                                backward.removal_add_node(rai_ass, v_bindings3, more_supports3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(instance4)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject v_bindings4 = unification_utilities.term_unify(unbound_instance, instance4, T, T);
                                                                                                final SubLObject unify_justification4 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject isa_support4 = arguments.make_hl_support($ISA, list($$isa, instance4, collection), UNPROVIDED, UNPROVIDED);
                                                                                                final SubLObject more_supports4 = append(list(code_support, isa_support4), unify_justification4);
                                                                                                if (NIL != v_bindings4) {
                                                                                                    backward.removal_add_node(rai_ass, v_bindings4, more_supports4);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$80, thread);
                                                                        }
                                                                        cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                                                                        generating_fn = cdolist_list_var_$71.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$76, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$75, thread);
                                                        }
                                                        cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                                                        module_var = cdolist_list_var_$70.first();
                                                    } 
                                                    SubLObject cdolist_list_var_$72;
                                                    final SubLObject accessible_modules2 = cdolist_list_var_$72 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var_$72.first();
                                                    while (NIL != cdolist_list_var_$72) {
                                                        final SubLObject _prev_bind_0_$81 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$70);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$84;
                                                                                    for (iteration_state_$84 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$84); iteration_state_$84 = dictionary_contents.do_dictionary_contents_next(iteration_state_$84)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$84);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$83, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$84);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$82, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str36$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$73;
                                                                    final SubLObject new_list2 = cdolist_list_var_$73 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$73.first();
                                                                    while (NIL != cdolist_list_var_$73) {
                                                                        final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str35$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$84, thread);
                                                                        }
                                                                        cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                                                                        generating_fn2 = cdolist_list_var_$73.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$77, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$81, thread);
                                                        }
                                                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                                                        module_var2 = cdolist_list_var_$72.first();
                                                    } 
                                                    node_var_$70 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$78, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$75, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$74, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str38$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$74, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$73, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$73, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$72, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$71, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                rai_ass = cdolist_list_var_$69.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject declare_removal_modules_relation_all_instance_file() {
        declareFunction(me, "relation_all_instance_could_apply_if_more_bound", "RELATION-ALL-INSTANCE-COULD-APPLY-IF-MORE-BOUND", 3, 0, false);
        declareFunction(me, "relation_instance_all_could_apply_if_more_bound", "RELATION-INSTANCE-ALL-COULD-APPLY-IF-MORE-BOUND", 3, 0, false);
        declareFunction(me, "removal_some_relation_all_instance_for_predicate", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "removal_some_relation_all_instance_for_collection", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-COLLECTION", 1, 1, false);
        declareFunction(me, "removal_some_relation_all_instance_for_value", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-VALUE", 1, 1, false);
        declareFunction(me, "relation_all_instance_predicate_cost_estimate", "RELATION-ALL-INSTANCE-PREDICATE-COST-ESTIMATE", 1, 0, false);
        declareFunction(me, "relation_all_instance_collection_cost_estimate", "RELATION-ALL-INSTANCE-COLLECTION-COST-ESTIMATE", 0, 0, false);
        declareFunction(me, "relation_all_instance_value_cost_estimate", "RELATION-ALL-INSTANCE-VALUE-COST-ESTIMATE", 1, 0, false);
        declareFunction(me, "removal_relation_all_instance_required", "REMOVAL-RELATION-ALL-INSTANCE-REQUIRED", 1, 0, false);
        declareFunction(me, "make_relation_all_instance_support", "MAKE-RELATION-ALL-INSTANCE-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_relation_all_instance_check_required", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_relation_all_instance_check_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_all_instance_check_via_value_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-VALUE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_check_via_collection_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_check_via_predicate_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_check_expand_guts", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND-GUTS", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_unify_required", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_instance.$removal_relation_all_instance_unify_required$UnaryFunction();
        new removal_modules_relation_all_instance.$removal_relation_all_instance_unify_required$BinaryFunction();
        declareFunction(me, "removal_relation_all_instance_unify_cost", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_relation_all_instance_unify_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_all_instance_unify_via_collection_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_unify_via_predicate_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_unify_expand_guts", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND-GUTS", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_iterate_required", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_instance.$removal_relation_all_instance_iterate_required$UnaryFunction();
        new removal_modules_relation_all_instance.$removal_relation_all_instance_iterate_required$BinaryFunction();
        declareFunction(me, "removal_relation_all_instance_iterate_cost", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-COST", 1, 1, false);
        declareFunction(me, "removal_relation_all_instance_iteration_collections", "REMOVAL-RELATION-ALL-INSTANCE-ITERATION-COLLECTIONS", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_iteration_collections_rai", "REMOVAL-RELATION-ALL-INSTANCE-ITERATION-COLLECTIONS-RAI", 2, 0, false);
        declareFunction(me, "removal_relation_all_instance_iterate_expand", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_some_relation_instance_all_for_predicate", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "removal_some_relation_instance_all_for_value", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-VALUE", 1, 1, false);
        declareFunction(me, "removal_some_relation_instance_all_for_collection", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-COLLECTION", 1, 1, false);
        declareFunction(me, "relation_instance_all_predicate_cost_estimate", "RELATION-INSTANCE-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
        declareFunction(me, "relation_instance_all_collection_cost_estimate", "RELATION-INSTANCE-ALL-COLLECTION-COST-ESTIMATE", 0, 0, false);
        declareFunction(me, "relation_instance_all_value_cost_estimate", "RELATION-INSTANCE-ALL-VALUE-COST-ESTIMATE", 1, 0, false);
        declareFunction(me, "removal_relation_instance_all_required", "REMOVAL-RELATION-INSTANCE-ALL-REQUIRED", 1, 0, false);
        declareFunction(me, "make_relation_instance_all_support", "MAKE-RELATION-INSTANCE-ALL-SUPPORT", 0, 0, false);
        declareFunction(me, "removal_relation_instance_all_check_required", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_relation_instance_all_check_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_all_check_via_value_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-VALUE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_check_via_collection_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_check_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_check_expand_guts", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND-GUTS", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_unify_required", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_instance.$removal_relation_instance_all_unify_required$UnaryFunction();
        new removal_modules_relation_all_instance.$removal_relation_instance_all_unify_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_all_unify_cost", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_all_unify_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND", 1, 1, false);
        declareFunction(me, "removal_relation_instance_all_unify_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_unify_via_collection_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_unify_expand_guts", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND-GUTS", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_iterate_required", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED", 1, 1, false);
        new removal_modules_relation_all_instance.$removal_relation_instance_all_iterate_required$UnaryFunction();
        new removal_modules_relation_all_instance.$removal_relation_instance_all_iterate_required$BinaryFunction();
        declareFunction(me, "removal_relation_instance_all_iterate_cost", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-COST", 1, 1, false);
        declareFunction(me, "removal_relation_instance_all_iteration_collections", "REMOVAL-RELATION-INSTANCE-ALL-ITERATION-COLLECTIONS", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_iteration_collections_ria", "REMOVAL-RELATION-INSTANCE-ALL-ITERATION-COLLECTIONS-RIA", 2, 0, false);
        declareFunction(me, "removal_relation_instance_all_iterate_expand", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_relation_all_instance_file() {
        defparameter("*ESTIMATED-PER-COLLECTION-REMOVAL-ALL-INSTANCE-COUNT*", TWO_INTEGER);
        defparameter("*RELATION-ALL-INSTANCE-RULE*", $list9);
        deflexical("*RELATION-ALL-INSTANCE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_all_instance_defining_mt$, $relation_all_instance_defining_mt$, $$BaseKB));
        defparameter("*REMOVAL-RELATION-ALL-INSTANCE-CHECK-COST*", $float$1_5);
        defparameter("*MINIMUM-RELATION-ALL-INSTANCE-UNIFY-COST*", TWO_INTEGER);
        defparameter("*ESTIMATED-PER-COLLECTION-REMOVAL-INSTANCE-ALL-COUNT*", TWO_INTEGER);
        deflexical("*RELATION-INSTANCE-ALL-RULE*", $list41);
        deflexical("*RELATION-INSTANCE-ALL-DEFINING-MT*", SubLTrampolineFile.maybeDefault($relation_instance_all_defining_mt$, $relation_instance_all_defining_mt$, $$BaseKB));
        defparameter("*REMOVAL-RELATION-INSTANCE-ALL-CHECK-COST*", $float$1_5);
        defparameter("*MINIMUM-RELATION-INSTANCE-ALL-UNIFY-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_relation_all_instance_file() {
        preference_modules.inference_preference_module($RELATION_ALL_INSTANCE, $list1);
        note_funcall_helper_function(RELATION_ALL_INSTANCE_COULD_APPLY_IF_MORE_BOUND);
        preference_modules.inference_preference_module($RELATION_INSTANCE_ALL, $list6);
        note_funcall_helper_function(RELATION_INSTANCE_ALL_COULD_APPLY_IF_MORE_BOUND);
        declare_defglobal($relation_all_instance_defining_mt$);
        mt_vars.note_mt_var($relation_all_instance_defining_mt$, $$relationAllInstance);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_INSTANCE_CHECK, $list18);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_INSTANCE_UNIFY, $list22);
        inference_modules.inference_removal_module($REMOVAL_RELATION_ALL_INSTANCE_ITERATE, $list40);
        declare_defglobal($relation_instance_all_defining_mt$);
        mt_vars.note_mt_var($relation_instance_all_defining_mt$, $$relationInstanceAll);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_ALL_CHECK, $list44);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_ALL_UNIFY, $list46);
        inference_modules.inference_removal_module($REMOVAL_RELATION_INSTANCE_ALL_ITERATE, $list48);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_relation_all_instance_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_relation_all_instance_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_relation_all_instance_file();
    }

    static {




























































    }

    public static final class $removal_relation_all_instance_unify_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_all_instance_unify_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_all_instance_unify_required(arg1, removal_modules_relation_all_instance.$removal_relation_all_instance_unify_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_all_instance_unify_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_all_instance_unify_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_all_instance_unify_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_all_instance_iterate_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_all_instance_iterate_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_all_instance_iterate_required(arg1, removal_modules_relation_all_instance.$removal_relation_all_instance_iterate_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_all_instance_iterate_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_all_instance_iterate_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_all_instance_iterate_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_all_unify_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_all_unify_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_all_unify_required(arg1, removal_modules_relation_all_instance.$removal_relation_instance_all_unify_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_all_unify_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_all_unify_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_all_unify_required(arg1, arg2);
        }
    }

    public static final class $removal_relation_instance_all_iterate_required$UnaryFunction extends UnaryFunction {
        public $removal_relation_instance_all_iterate_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_relation_instance_all_iterate_required(arg1, removal_modules_relation_all_instance.$removal_relation_instance_all_iterate_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_relation_instance_all_iterate_required$BinaryFunction extends BinaryFunction {
        public $removal_relation_instance_all_iterate_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_relation_instance_all_iterate_required(arg1, arg2);
        }
    }
}

/**
 * Total time: 3472 ms
 */
