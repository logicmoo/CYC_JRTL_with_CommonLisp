package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_module_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_module_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities";

    public static final String myFingerPrint = "9b08827aff7eed9c1103401ff8faec1123031ac86b08a27d567e9554e06b5485";





    public static final SubLSymbol GET_SBHL_PREDICATES = makeSymbol("GET-SBHL-PREDICATES");

    public static final SubLSymbol $get_sbhl_predicates_caching_state$ = makeSymbol("*GET-SBHL-PREDICATES-CACHING-STATE*");

    private static final SubLList $list3 = cons(makeUninternedSymbol("KEY"), makeSymbol("MODULE"));



    private static final SubLSymbol $NAUT_FORWARD_TRUE_GENERATORS = makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");



    private static final SubLSymbol $ADD_NODE_TO_RESULT_TEST = makeKeyword("ADD-NODE-TO-RESULT-TEST");

    private static final SubLSymbol $ADD_UNMARKED_NODE_TO_RESULT_TEST = makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");



    private static final SubLSymbol $TRANSFERS_VIA_ARG = makeKeyword("TRANSFERS-VIA-ARG");

    private static final SubLSymbol $PREDICATE_SEARCH_P = makeKeyword("PREDICATE-SEARCH-P");

    private static final SubLSymbol $MODULE_INVERTS_ARGUMENTS = makeKeyword("MODULE-INVERTS-ARGUMENTS");

    private static final SubLSymbol $INVERTS_ARGUMENTS_OF_MODULE = makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");







    private static final SubLSymbol $TRANSFERS_THROUGH_MODULE = makeKeyword("TRANSFERS-THROUGH-MODULE");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));



    public static final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");

    public static final SubLSymbol SBHL_SEARCH_DIRECTION_P = makeSymbol("SBHL-SEARCH-DIRECTION-P");



    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    public static final SubLString $str27$invalid_sbhl_search_direction__a = makeString("invalid sbhl-search-direction ~a");

    public static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));





    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$negationMt = reader_make_constant_shell(makeString("negationMt"));



    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));



    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));









    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));







    public static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    public static final SubLSymbol FUNCTION_SYMBOL_LIST_P = makeSymbol("FUNCTION-SYMBOL-LIST-P");

    public static final SubLString $str54$Data___a__associated_with_propert = makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");

    public static final SubLString $str55$No_data_associated_with_required_ = makeString("No data associated with required property ~a");

    public static SubLObject init_sbhl_module_data(final SubLObject predicate, final SubLObject data) {
        assert NIL != forts.fort_p(predicate) : "forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) " + predicate;
        final SubLObject module = sbhl_module_vars.new_sbhl_module(predicate);
        SubLObject cdolist_list_var = data;
        SubLObject data_association = NIL;
        data_association = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject property = data_association.first();
            final SubLObject property_data = second(data_association);
            sbhl_module_vars.set_sbhl_module_property(module, property, property_data);
            cdolist_list_var = cdolist_list_var.rest();
            data_association = cdolist_list_var.first();
        } 
        new_sbhl_module_graph(module);
        sbhl_module_vars.add_sbhl_module(predicate, module);
        return NIL;
    }

    public static SubLObject clear_get_sbhl_predicates() {
        final SubLObject cs = $get_sbhl_predicates_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_sbhl_predicates() {
        return memoization_state.caching_state_remove_function_results_with_args($get_sbhl_predicates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sbhl_predicates_internal() {
        return sbhl_module_vars.get_sbhl_predicates_int();
    }

    public static SubLObject get_sbhl_predicates() {
        SubLObject caching_state = $get_sbhl_predicates_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_SBHL_PREDICATES, $get_sbhl_predicates_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_sbhl_predicates_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sbhl_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_sbhl_predicates(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject sbhl_module_or_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) || (NIL != sbhl_predicate_p(v_object)));
    }

    public static SubLObject sbhl_non_time_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) && (NIL == sbhl_time_module_p(v_object)));
    }

    public static SubLObject sbhl_non_time_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_predicate_p(v_object)) && (NIL == sbhl_time_module_p(sbhl_module_vars.get_sbhl_module(v_object))));
    }

    public static SubLObject sbhl_graph_p(final SubLObject v_graph) {
        SubLObject graphP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject sbhl_graph;
        for (graphP = NIL, rest = NIL, rest = sbhl_module_vars.get_sbhl_modules(); (NIL == graphP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            key = NIL;
            module = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = module = current.rest();
            sbhl_graph = sbhl_module_vars.get_sbhl_module_graph(module);
            if (v_graph.eql(sbhl_graph)) {
                graphP = T;
            }
        }
        return graphP;
    }

    public static SubLObject get_sbhl_link_pred(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_link_pred(module);
    }

    public static SubLObject get_sbhl_link_style(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_link_style(module);
    }

    public static SubLObject get_sbhl_module_naut_forward_true_generators(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $NAUT_FORWARD_TRUE_GENERATORS);
    }

    public static SubLObject get_sbhl_module_type(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_module_type(module);
    }

    public static SubLObject get_sbhl_path_terminating_markP_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_path_terminating_mark(module);
    }

    public static SubLObject get_sbhl_marking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_marking_fn(module);
    }

    public static SubLObject get_sbhl_unmarking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_unmarking_fn(module);
    }

    public static SubLObject get_sbhl_module_marking_increment(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $MARKING_INCREMENT);
    }

    public static SubLObject get_sbhl_index_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_index_arg(module);
    }

    public static SubLObject get_sbhl_gather_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return subtract(THREE_INTEGER, get_sbhl_index_arg(module));
    }

    public static SubLObject get_sbhl_add_node_to_result_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_NODE_TO_RESULT_TEST);
    }

    public static SubLObject get_sbhl_add_unmarked_node_to_result_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_UNMARKED_NODE_TO_RESULT_TEST);
    }

    public static SubLObject get_sbhl_type_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_type_test(module);
    }

    public static SubLObject get_sbhl_module_root(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ROOT);
    }

    public static SubLObject get_sbhl_transfers_via_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $TRANSFERS_VIA_ARG);
    }

    public static SubLObject get_sbhl_accessible_link_preds(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_accessible_link_preds(module);
    }

    public static SubLObject sbhl_module_indicates_predicate_search_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $PREDICATE_SEARCH_P);
    }

    public static SubLObject get_sbhl_node_modules(final SubLObject node) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = module = current.rest();
            if (NIL != sbhl_graphs.get_sbhl_graph_link(node, module)) {
                result = cons(get_sbhl_link_pred(module), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sbhl_disjoins_search_p() {
        return sbhl_module_vars.sbhl_disjoins_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    public static SubLObject sbhl_time_search_p() {
        return sbhl_module_vars.sbhl_time_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    public static SubLObject sbhl_root_p(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return eql(node, get_sbhl_module_root(module));
    }

    public static SubLObject get_sbhl_inverse_link_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject inverse_module = NIL;
        inverse_module = get_sbhl_module_with_inverted_arguments(module);
        if (NIL != inverse_module) {
            return inverse_module;
        }
        inverse_module = get_sbhl_module_which_this_module_inverts_arguments_of(module);
        if (NIL != inverse_module) {
            return inverse_module;
        }
        return NIL;
    }

    public static SubLObject get_sbhl_module_relevant_naut_link_generators(final SubLObject direction, final SubLObject tv, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) && (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction))) {
            return get_sbhl_module_naut_forward_true_generators(module);
        }
        return NIL;
    }

    public static SubLObject sbhl_simple_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return makeBoolean((NIL != sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module))) || (NIL != sbhl_module_vars.sbhl_simple_non_reflexive_module_type_p(get_sbhl_module_type(module))));
    }

    public static SubLObject sbhl_time_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.sbhl_time_module_type_p(get_sbhl_module_type(module));
    }

    public static SubLObject sbhl_transitive_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.sbhl_transitive_module_type_p(get_sbhl_module_type(module));
    }

    public static SubLObject sbhl_inverse_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return list_utilities.sublisp_boolean(get_sbhl_module_which_this_module_inverts_arguments_of(module));
    }

    public static SubLObject get_sbhl_inverse_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject result = NIL;
        result = get_sbhl_module_with_inverted_arguments(module);
        if (NIL != result) {
            return result;
        }
        return get_sbhl_module_which_this_module_inverts_arguments_of(module);
    }

    public static SubLObject get_sbhl_module_with_inverted_arguments(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject inverted_arguments_module = sbhl_module_vars.get_sbhl_module_property(module, $MODULE_INVERTS_ARGUMENTS);
        if (NIL != sbhl_module_vars.sbhl_module_p(inverted_arguments_module)) {
            return inverted_arguments_module;
        }
        if (NIL == inverted_arguments_module) {
            return NIL;
        }
        if (NIL != sbhl_predicate_p(inverted_arguments_module)) {
            inverted_arguments_module = sbhl_module_vars.get_sbhl_module(inverted_arguments_module);
            sbhl_module_vars.set_sbhl_module_property(module, $MODULE_INVERTS_ARGUMENTS, inverted_arguments_module);
            return inverted_arguments_module;
        }
        return NIL;
    }

    public static SubLObject get_sbhl_module_which_this_module_inverts_arguments_of(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module_property(module, $INVERTS_ARGUMENTS_OF_MODULE);
        if (NIL != sbhl_module_vars.sbhl_module_p(inverts_arguments_of_module)) {
            return inverts_arguments_of_module;
        }
        if (NIL == inverts_arguments_of_module) {
            return NIL;
        }
        if (NIL != sbhl_predicate_p(inverts_arguments_of_module)) {
            inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module(inverts_arguments_of_module);
            sbhl_module_vars.set_sbhl_module_property(module, $INVERTS_ARGUMENTS_OF_MODULE, inverts_arguments_of_module);
            return inverts_arguments_of_module;
        }
        return NIL;
    }

    public static SubLObject get_sbhl_module_tag(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $MODULE_TAG);
    }

    public static SubLObject new_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject v_graph = sbhl_graphs.make_new_sbhl_graph();
        sbhl_module_vars.set_sbhl_module_property(module, $GRAPH, v_graph);
        return module;
    }

    public static SubLObject get_sbhl_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.get_sbhl_module_graph(module);
    }

    public static SubLObject get_sbhl_graphs() {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject module = NIL;
            destructuring_bind_must_consp(current, datum, $list3);
            key = current.first();
            current = module = current.rest();
            final SubLObject v_graph = get_sbhl_graph(module);
            if (NIL != v_graph) {
                result = cons(v_graph, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sbhl_disjoins_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.sbhl_disjoins_module_type_p(get_sbhl_module_type(module));
    }

    public static SubLObject get_sbhl_disjoins_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject disjoins_module = sbhl_module_vars.get_sbhl_module_property(module, $DISJOINS_MODULE);
        if (NIL != sbhl_module_vars.sbhl_module_p(disjoins_module)) {
            return disjoins_module;
        }
        if (NIL == disjoins_module) {
            return NIL;
        }
        if (NIL != sbhl_predicate_p(disjoins_module)) {
            disjoins_module = sbhl_module_vars.get_sbhl_module(disjoins_module);
            sbhl_module_vars.set_sbhl_module_property(module, $DISJOINS_MODULE, disjoins_module);
            return disjoins_module;
        }
        return NIL;
    }

    public static SubLObject sbhl_transfers_through_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.sbhl_transfers_through_module_type_p(get_sbhl_module_type(module));
    }

    public static SubLObject get_sbhl_transfers_through_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject tt_module = sbhl_module_vars.get_sbhl_module_property(module, $TRANSFERS_THROUGH_MODULE);
        if (NIL != sbhl_module_vars.sbhl_module_p(tt_module)) {
            return tt_module;
        }
        if (NIL == tt_module) {
            return NIL;
        }
        if (NIL != sbhl_predicate_p(tt_module)) {
            tt_module = sbhl_module_vars.get_sbhl_module(tt_module);
            sbhl_module_vars.set_sbhl_module_property(module, $TRANSFERS_THROUGH_MODULE, tt_module);
            return tt_module;
        }
        return NIL;
    }

    public static SubLObject sbhl_reflexive_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module));
    }

    public static SubLObject get_sbhl_disjoins_search_tt_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return NIL != sbhl_disjoins_module_p(module) ? get_sbhl_transfers_through_module(module) : module;
    }

    public static SubLObject get_sbhl_reductions_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject tt_module = get_sbhl_transfers_through_module(module);
        final SubLObject search_module = (NIL != module) ? module : sbhl_search_vars.get_sbhl_search_module();
        if (NIL != tt_module) {
            return tt_module;
        }
        if (sbhl_module_vars.get_sbhl_module_link_pred(search_module).eql($$genlInverse)) {
            return sbhl_module_vars.get_sbhl_module($$genlPreds);
        }
        return search_module;
    }

    public static SubLObject get_sbhl_premark_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return NIL != sbhl_disjoins_module_p(module) ? get_sbhl_transfers_through_module(module) : module;
    }

    public static SubLObject sbhl_search_direction_p(final SubLObject direction) {
        return makeBoolean((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) || (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)));
    }

    public static SubLObject sbhl_forward_direction_for_module_p(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return eq(direction, get_sbhl_module_forward_direction(module));
    }

    public static SubLObject get_sbhl_module_forward_direction(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_forward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    public static SubLObject get_sbhl_module_backward_direction(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_backward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    public static SubLObject get_sbhl_opposite_search_direction(SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_direction = (NIL != direction) ? direction : sbhl_search_vars.get_sbhl_search_direction();
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(current_direction)) {
            return sbhl_search_vars.get_sbhl_backward_search_direction();
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(current_direction)) {
            return sbhl_search_vars.get_sbhl_forward_search_direction();
        }
        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p()) && (NIL == sbhl_search_direction_p(current_direction))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql($ERROR)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (pcase_var.eql($CERROR)) {
                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (pcase_var.eql($WARN)) {
                        Errors.warn($str21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P);
                    } else {
                        Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                        Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P);
                    }


        }
        return NIL;
    }

    public static SubLObject sbhl_module_directed_linksP(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return sbhl_module_vars.fort_denotes_sbhl_directed_graph_p(get_sbhl_link_style(module));
    }

    public static SubLObject sbhl_search_direction_to_link_direction(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject sbhl_search_direction_to_opposite_link_direction(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_relevant_sbhl_directions(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return (NIL != sbhl_link_vars.get_sbhl_link_direction()) && (NIL != module) ? sbhl_link_vars.get_sbhl_link_direction_as_list() : NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_directed_directions() : sbhl_link_vars.get_sbhl_undirected_direction_as_list();
    }

    public static SubLObject sbhl_predicate_cardinality(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.genl_cardinality(node);
    }

    public static SubLObject sbhl_inverse_cardinality(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.spec_cardinality(node);
    }

    public static SubLObject sbhl_module_hl_support_module(final SubLObject module) {
        return sbhl_pred_hl_support_module(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }

    public static SubLObject sbhl_pred_hl_support_module(final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) " + pred;
        if (pred.eql($$genls)) {
            return $GENLS;
        }
        if (pred.eql($$isa) || pred.eql($$quotedIsa)) {
            return $ISA;
        }
        if (pred.eql($$genlPreds) || pred.eql($$genlInverse)) {
            return $GENLPREDS;
        }
        if (pred.eql($$genlMt) || pred.eql($$negationMt)) {
            return $GENLMT;
        }
        if (pred.eql($$disjointWith)) {
            return $DISJOINTWITH;
        }
        if (pred.eql($$negationPreds) || pred.eql($$negationInverse)) {
            return $NEGATIONPREDS;
        }
        return NIL;
    }

    public static SubLObject sbhl_old_mode(final SubLObject direction, final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) " + pred;
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        if (pred.eql($$isa)) {
            return $ISA;
        }
        if (NIL != sbhl_disjoins_module_p(module)) {
            return $NEGATION;
        }
        if (get_sbhl_module_forward_direction(module).eql(direction)) {
            return $SUPERIOR;
        }
        if (get_sbhl_module_backward_direction(module).eql(direction)) {
            return $INFERIOR;
        }
        return NIL;
    }

    public static SubLObject sbhl_pred_get_hl_module(final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) " + pred;
        if (pred.eql($$genls)) {
            return $GENLS;
        }
        if (pred.eql($$isa)) {
            return $ISA;
        }
        if (pred.eql($$quotedIsa)) {
            return $ISA;
        }
        if (pred.eql($$genlPreds)) {
            return $GENLPREDS;
        }
        if (pred.eql($$genlInverse)) {
            return $GENLPREDS;
        }
        if (pred.eql($$genlMt)) {
            return $GENLMT;
        }
        if (pred.eql($$disjointWith)) {
            return $DISJOINTWITH;
        }
        if (pred.eql($$negationPreds)) {
            return $NEGATIONPREDS;
        }
        if (pred.eql($$negationInverse)) {
            return $NEGATIONPREDS;
        }
        if (pred.eql($$negationMt)) {
            return $GENLMT;
        }
        return NIL;
    }

    public static SubLObject sbhl_old_module(final SubLObject pred) {
        return sbhl_pred_get_hl_module(pred);
    }

    public static SubLObject sbhl_predicate_for_hl_module(final SubLObject hl_module) {
        if (hl_module.eql($GENLS)) {
            return $$genls;
        }
        if (hl_module.eql($GENLMT)) {
            return $$genlMt;
        }
        if (hl_module.eql($GENLPREDS)) {
            return $$genlPreds;
        }
        if (hl_module.eql($ISA)) {
            return $$isa;
        }
        if (hl_module.eql($DISJOINTWITH)) {
            return $$disjointWith;
        }
        if (hl_module.eql($NEGATIONPREDS)) {
            return $$negationPreds;
        }
        return NIL;
    }

    public static SubLObject sbhl_predicate_from_fort_type(final SubLObject fort_type) {
        if (fort_type.eql($$Collection)) {
            return $$genls;
        }
        if (fort_type.eql($$Predicate)) {
            return $$genlPreds;
        }
        if (fort_type.eql($$Microtheory)) {
            return $$genlMt;
        }
        return $$isa;
    }

    public static SubLObject sbhl_node_has_type_associated_to_predicate_p(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        return apply_sbhl_module_type_test(node, module);
    }

    public static SubLObject determine_sbhl_predicate_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt));
    }

    public static SubLObject determine_sbhl_module_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_module_vars.get_sbhl_module(sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt)));
    }

    public static SubLObject sbhl_node_with_any_sbhl_type_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(fort)) || (!$$isa.eql(determine_sbhl_predicate_from_fort_type(fort, mt))));
    }

    public static SubLObject sbhl_fortP(final SubLObject fort) {
        return makeBoolean((((NIL != sbhl_links.any_sbhl_links_p(fort, $$isa)) || (NIL != fort_types_interface.collection_p(fort))) || (NIL != fort_types_interface.predicate_p(fort))) || (NIL != fort_types_interface.microtheory_p(fort)));
    }

    public static SubLObject sbhl_isa_collection_p(final SubLObject node) {
        return fort_types_interface.isa_collectionP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject sbhl_isa_microtheory_p(final SubLObject node) {
        return fort_types_interface.isa_mtP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject sbhl_isa_predicate_p(final SubLObject node) {
        return fort_types_interface.isa_predicateP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject apply_sbhl_module_type_test(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        final SubLObject test_fn = get_sbhl_type_test(module);
        if (NIL == test_fn) {
            return T;
        }
        final SubLObject pcase_var = test_fn;
        if (pcase_var.eql(COLLECTION_P)) {
            return sbhl_isa_collection_p(node);
        }
        if (pcase_var.eql(MICROTHEORY_P)) {
            return sbhl_isa_microtheory_p(node);
        }
        if (pcase_var.eql(PREDICATE_P)) {
            return sbhl_isa_predicate_p(node);
        }
        return NIL;
    }

    public static SubLObject sbhl_module_meets_requisitesP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) " + module;
        SubLObject failP;
        SubLObject iteration_state;
        for (failP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_module_properties())); (NIL == failP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject property = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data_test = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject data = sbhl_module_vars.get_sbhl_module_property(module, property);
            if (NIL != data) {
                if (NIL != funcall(data_test, data)) {
                    final SubLObject pcase_var = data_test;
                    if (pcase_var.eql(FUNCTION_SYMBOL_P)) {
                        register_kb_function(data);
                    } else
                        if (pcase_var.eql(FUNCTION_SYMBOL_LIST_P)) {
                            SubLObject cdolist_list_var = data;
                            SubLObject symbol_function = NIL;
                            symbol_function = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                register_kb_function(symbol_function);
                                cdolist_list_var = cdolist_list_var.rest();
                                symbol_function = cdolist_list_var.first();
                            } 
                        }

                } else {
                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str54$Data___a__associated_with_propert, data, property, data_test, UNPROVIDED, UNPROVIDED);
                    failP = T;
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject rest;
        SubLObject property2;
        for (rest = NIL, rest = sbhl_module_vars.get_sbhl_module_required_properties(); (NIL == failP) && (NIL != rest); rest = rest.rest()) {
            property2 = rest.first();
            if (NIL == sbhl_module_vars.get_sbhl_module_property(module, property2)) {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str55$No_data_associated_with_required_, property2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                failP = T;
            }
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject declare_sbhl_module_utilities_file() {
        declareFunction(me, "init_sbhl_module_data", "INIT-SBHL-MODULE-DATA", 2, 0, false);
        declareFunction(me, "clear_get_sbhl_predicates", "CLEAR-GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction(me, "remove_get_sbhl_predicates", "REMOVE-GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction(me, "get_sbhl_predicates_internal", "GET-SBHL-PREDICATES-INTERNAL", 0, 0, false);
        declareFunction(me, "get_sbhl_predicates", "GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction(me, "sbhl_predicate_p", "SBHL-PREDICATE-P", 1, 0, false);
        declareFunction(me, "sbhl_module_or_predicate_p", "SBHL-MODULE-OR-PREDICATE-P", 1, 0, false);
        declareFunction(me, "sbhl_non_time_module_p", "SBHL-NON-TIME-MODULE-P", 1, 0, false);
        declareFunction(me, "sbhl_non_time_predicate_p", "SBHL-NON-TIME-PREDICATE-P", 1, 0, false);
        declareFunction(me, "sbhl_graph_p", "SBHL-GRAPH-P", 1, 0, false);
        declareFunction(me, "get_sbhl_link_pred", "GET-SBHL-LINK-PRED", 1, 0, false);
        declareFunction(me, "get_sbhl_link_style", "GET-SBHL-LINK-STYLE", 1, 0, false);
        declareFunction(me, "get_sbhl_module_naut_forward_true_generators", "GET-SBHL-MODULE-NAUT-FORWARD-TRUE-GENERATORS", 1, 0, false);
        declareFunction(me, "get_sbhl_module_type", "GET-SBHL-MODULE-TYPE", 1, 0, false);
        declareFunction(me, "get_sbhl_path_terminating_markP_fn", "GET-SBHL-PATH-TERMINATING-MARK?-FN", 1, 0, false);
        declareFunction(me, "get_sbhl_marking_fn", "GET-SBHL-MARKING-FN", 1, 0, false);
        declareFunction(me, "get_sbhl_unmarking_fn", "GET-SBHL-UNMARKING-FN", 1, 0, false);
        declareFunction(me, "get_sbhl_module_marking_increment", "GET-SBHL-MODULE-MARKING-INCREMENT", 1, 0, false);
        declareFunction(me, "get_sbhl_index_arg", "GET-SBHL-INDEX-ARG", 1, 0, false);
        declareFunction(me, "get_sbhl_gather_arg", "GET-SBHL-GATHER-ARG", 1, 0, false);
        declareFunction(me, "get_sbhl_add_node_to_result_test", "GET-SBHL-ADD-NODE-TO-RESULT-TEST", 1, 0, false);
        declareFunction(me, "get_sbhl_add_unmarked_node_to_result_test", "GET-SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST", 1, 0, false);
        declareFunction(me, "get_sbhl_type_test", "GET-SBHL-TYPE-TEST", 1, 0, false);
        declareFunction(me, "get_sbhl_module_root", "GET-SBHL-MODULE-ROOT", 1, 0, false);
        declareFunction(me, "get_sbhl_transfers_via_arg", "GET-SBHL-TRANSFERS-VIA-ARG", 1, 0, false);
        declareFunction(me, "get_sbhl_accessible_link_preds", "GET-SBHL-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction(me, "sbhl_module_indicates_predicate_search_p", "SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P", 1, 0, false);
        declareFunction(me, "get_sbhl_node_modules", "GET-SBHL-NODE-MODULES", 1, 0, false);
        declareFunction(me, "sbhl_disjoins_search_p", "SBHL-DISJOINS-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_time_search_p", "SBHL-TIME-SEARCH-P", 0, 0, false);
        declareFunction(me, "sbhl_root_p", "SBHL-ROOT-P", 2, 0, false);
        declareFunction(me, "get_sbhl_inverse_link_module", "GET-SBHL-INVERSE-LINK-MODULE", 1, 0, false);
        declareFunction(me, "get_sbhl_module_relevant_naut_link_generators", "GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS", 3, 0, false);
        declareFunction(me, "sbhl_simple_module_p", "SBHL-SIMPLE-MODULE-P", 1, 0, false);
        declareFunction(me, "sbhl_time_module_p", "SBHL-TIME-MODULE-P", 1, 0, false);
        declareFunction(me, "sbhl_transitive_module_p", "SBHL-TRANSITIVE-MODULE-P", 1, 0, false);
        declareFunction(me, "sbhl_inverse_module_p", "SBHL-INVERSE-MODULE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_inverse_module", "GET-SBHL-INVERSE-MODULE", 1, 0, false);
        declareFunction(me, "get_sbhl_module_with_inverted_arguments", "GET-SBHL-MODULE-WITH-INVERTED-ARGUMENTS", 1, 0, false);
        declareFunction(me, "get_sbhl_module_which_this_module_inverts_arguments_of", "GET-SBHL-MODULE-WHICH-THIS-MODULE-INVERTS-ARGUMENTS-OF", 1, 0, false);
        declareFunction(me, "get_sbhl_module_tag", "GET-SBHL-MODULE-TAG", 1, 0, false);
        declareFunction(me, "new_sbhl_module_graph", "NEW-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction(me, "get_sbhl_graph", "GET-SBHL-GRAPH", 1, 0, false);
        declareFunction(me, "get_sbhl_graphs", "GET-SBHL-GRAPHS", 0, 0, false);
        declareFunction(me, "sbhl_disjoins_module_p", "SBHL-DISJOINS-MODULE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_disjoins_module", "GET-SBHL-DISJOINS-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_transfers_through_module_p", "SBHL-TRANSFERS-THROUGH-MODULE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_transfers_through_module", "GET-SBHL-TRANSFERS-THROUGH-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_reflexive_module_p", "SBHL-REFLEXIVE-MODULE-P", 1, 0, false);
        declareFunction(me, "get_sbhl_disjoins_search_tt_module", "GET-SBHL-DISJOINS-SEARCH-TT-MODULE", 1, 0, false);
        declareFunction(me, "get_sbhl_reductions_module", "GET-SBHL-REDUCTIONS-MODULE", 1, 0, false);
        declareFunction(me, "get_sbhl_premark_module", "GET-SBHL-PREMARK-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_search_direction_p", "SBHL-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction(me, "sbhl_forward_direction_for_module_p", "SBHL-FORWARD-DIRECTION-FOR-MODULE-P", 2, 0, false);
        declareFunction(me, "get_sbhl_module_forward_direction", "GET-SBHL-MODULE-FORWARD-DIRECTION", 1, 0, false);
        declareFunction(me, "get_sbhl_module_backward_direction", "GET-SBHL-MODULE-BACKWARD-DIRECTION", 1, 0, false);
        declareFunction(me, "get_sbhl_opposite_search_direction", "GET-SBHL-OPPOSITE-SEARCH-DIRECTION", 0, 1, false);
        declareFunction(me, "sbhl_module_directed_linksP", "SBHL-MODULE-DIRECTED-LINKS?", 1, 0, false);
        declareFunction(me, "sbhl_search_direction_to_link_direction", "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION", 2, 0, false);
        declareFunction(me, "sbhl_search_direction_to_opposite_link_direction", "SBHL-SEARCH-DIRECTION-TO-OPPOSITE-LINK-DIRECTION", 2, 0, false);
        declareFunction(me, "get_relevant_sbhl_directions", "GET-RELEVANT-SBHL-DIRECTIONS", 1, 0, false);
        declareFunction(me, "sbhl_predicate_cardinality", "SBHL-PREDICATE-CARDINALITY", 2, 0, false);
        declareFunction(me, "sbhl_inverse_cardinality", "SBHL-INVERSE-CARDINALITY", 2, 0, false);
        declareFunction(me, "sbhl_module_hl_support_module", "SBHL-MODULE-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_pred_hl_support_module", "SBHL-PRED-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_old_mode", "SBHL-OLD-MODE", 2, 0, false);
        declareFunction(me, "sbhl_pred_get_hl_module", "SBHL-PRED-GET-HL-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_old_module", "SBHL-OLD-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_predicate_for_hl_module", "SBHL-PREDICATE-FOR-HL-MODULE", 1, 0, false);
        declareFunction(me, "sbhl_predicate_from_fort_type", "SBHL-PREDICATE-FROM-FORT-TYPE", 1, 0, false);
        declareFunction(me, "sbhl_node_has_type_associated_to_predicate_p", "SBHL-NODE-HAS-TYPE-ASSOCIATED-TO-PREDICATE-P", 2, 0, false);
        declareFunction(me, "determine_sbhl_predicate_from_fort_type", "DETERMINE-SBHL-PREDICATE-FROM-FORT-TYPE", 1, 1, false);
        declareFunction(me, "determine_sbhl_module_from_fort_type", "DETERMINE-SBHL-MODULE-FROM-FORT-TYPE", 1, 1, false);
        declareFunction(me, "sbhl_node_with_any_sbhl_type_p", "SBHL-NODE-WITH-ANY-SBHL-TYPE-P", 1, 1, false);
        declareFunction(me, "sbhl_fortP", "SBHL-FORT?", 1, 0, false);
        declareFunction(me, "sbhl_isa_collection_p", "SBHL-ISA-COLLECTION-P", 1, 0, false);
        declareFunction(me, "sbhl_isa_microtheory_p", "SBHL-ISA-MICROTHEORY-P", 1, 0, false);
        declareFunction(me, "sbhl_isa_predicate_p", "SBHL-ISA-PREDICATE-P", 1, 0, false);
        declareFunction(me, "apply_sbhl_module_type_test", "APPLY-SBHL-MODULE-TYPE-TEST", 2, 0, false);
        declareFunction(me, "sbhl_module_meets_requisitesP", "SBHL-MODULE-MEETS-REQUISITES?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_module_utilities_file() {
        deflexical("*GET-SBHL-PREDICATES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_module_utilities_file() {
        memoization_state.note_globally_cached_function(GET_SBHL_PREDICATES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_module_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_module_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_module_utilities_file();
    }

    
}

/**
 * Total time: 157 ms
 */
