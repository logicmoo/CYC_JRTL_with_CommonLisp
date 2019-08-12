/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.forts.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_module_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_module_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities";


    private static final SubLSymbol GET_SBHL_PREDICATES = makeSymbol("GET-SBHL-PREDICATES");

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





    static private final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_SEARCH_DIRECTION_P = makeSymbol("SBHL-SEARCH-DIRECTION-P");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str27$invalid_sbhl_search_direction__a = makeString("invalid sbhl-search-direction ~a");

    private static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");























    private static final SubLSymbol FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");

    private static final SubLSymbol FUNCTION_SYMBOL_LIST_P = makeSymbol("FUNCTION-SYMBOL-LIST-P");

    static private final SubLString $str54$Data___a__associated_with_propert = makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");

    static private final SubLString $str55$No_data_associated_with_required_ = makeString("No data associated with required property ~a");

    // Definitions
    /**
     * Modifier: initialize and store the DATA for PREDICATE. DATA is an alist
     */
    @LispMethod(comment = "Modifier: initialize and store the DATA for PREDICATE. DATA is an alist")
    public static final SubLObject init_sbhl_module_data_alt(SubLObject predicate, SubLObject data) {
        SubLTrampolineFile.checkType(predicate, FORT_P);
        {
            SubLObject module = sbhl_module_vars.new_sbhl_module(predicate);
            SubLObject cdolist_list_var = data;
            SubLObject data_association = NIL;
            for (data_association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , data_association = cdolist_list_var.first()) {
                {
                    SubLObject property = data_association.first();
                    SubLObject property_data = second(data_association);
                    sbhl_module_vars.set_sbhl_module_property(module, property, property_data);
                }
            }
            com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.new_sbhl_module_graph(module);
            sbhl_module_vars.add_sbhl_module(predicate, module);
        }
        return NIL;
    }

    // Definitions
    /**
     * Modifier: initialize and store the DATA for PREDICATE. DATA is an alist
     */
    @LispMethod(comment = "Modifier: initialize and store the DATA for PREDICATE. DATA is an alist")
    public static SubLObject init_sbhl_module_data(final SubLObject predicate, final SubLObject data) {
        assert NIL != forts.fort_p(predicate) : "! forts.fort_p(predicate) " + ("forts.fort_p(predicate) " + "CommonSymbols.NIL != forts.fort_p(predicate) ") + predicate;
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

    public static final SubLObject clear_get_sbhl_predicates_alt() {
        {
            SubLObject cs = $get_sbhl_predicates_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_sbhl_predicates() {
        final SubLObject cs = $get_sbhl_predicates_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_sbhl_predicates_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($get_sbhl_predicates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_sbhl_predicates() {
        return memoization_state.caching_state_remove_function_results_with_args($get_sbhl_predicates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_sbhl_predicates_internal_alt() {
        return sbhl_module_vars.get_sbhl_predicates_int();
    }

    public static SubLObject get_sbhl_predicates_internal() {
        return sbhl_module_vars.get_sbhl_predicates_int();
    }

    public static final SubLObject get_sbhl_predicates_alt() {
        {
            SubLObject caching_state = $get_sbhl_predicates_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_SBHL_PREDICATES, $get_sbhl_predicates_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw3$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_predicates_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates*
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates*")
    public static final SubLObject sbhl_predicate_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_predicates());
    }

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates*
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates*")
    public static SubLObject sbhl_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_sbhl_predicates(), symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject sbhl_module_or_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) || (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(v_object)));
    }

    public static SubLObject sbhl_module_or_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) || (NIL != sbhl_predicate_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module")
    public static final SubLObject sbhl_non_time_module_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) && (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_time_module_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module")
    public static SubLObject sbhl_non_time_module_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_module_vars.sbhl_module_p(v_object)) && (NIL == sbhl_time_module_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module")
    public static final SubLObject sbhl_non_time_predicate_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(v_object)) && (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_time_module_p(sbhl_module_vars.get_sbhl_module(v_object))));
    }

    /**
     *
     *
     * @return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module
     */
    @LispMethod(comment = "@return booleanp; whether PRED is a member of *sbhl-predicates* and not an sbhl-time-module")
    public static SubLObject sbhl_non_time_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_predicate_p(v_object)) && (NIL == sbhl_time_module_p(sbhl_module_vars.get_sbhl_module(v_object))));
    }

    /**
     *
     *
     * @return booleanp; whether GRAPH is a member of *sbhl-graphs*
     */
    @LispMethod(comment = "@return booleanp; whether GRAPH is a member of *sbhl-graphs*")
    public static final SubLObject sbhl_graph_p_alt(SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject graphP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (!((NIL != graphP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject sbhl_graph = sbhl_module_vars.get_sbhl_module_graph(module);
                            if (v_graph == sbhl_graph) {
                                graphP = T;
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return graphP;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether GRAPH is a member of *sbhl-graphs*
     */
    @LispMethod(comment = "@return booleanp; whether GRAPH is a member of *sbhl-graphs*")
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

    /**
     * Accessor: @return fortp; the link predicate associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return fortp; the link predicate associated with MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_link_pred_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_link_pred(module);
    }

    /**
     * Accessor: @return fortp; the link predicate associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return fortp; the link predicate associated with MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_link_pred(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_link_pred(module);
    }

    /**
     * Accessor: @return fortp; whether MODULE / *sbhl-module* entails directed or undirected direction links
     */
    @LispMethod(comment = "Accessor: @return fortp; whether MODULE / *sbhl-module* entails directed or undirected direction links")
    public static final SubLObject get_sbhl_link_style_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_link_style(module);
    }

    /**
     * Accessor: @return fortp; whether MODULE / *sbhl-module* entails directed or undirected direction links
     */
    @LispMethod(comment = "Accessor: @return fortp; whether MODULE / *sbhl-module* entails directed or undirected direction links")
    public static SubLObject get_sbhl_link_style(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_link_style(module);
    }

    /**
     * Accessor: @return listp; the list of functions which generate forward true links for MODULE.
     */
    @LispMethod(comment = "Accessor: @return listp; the list of functions which generate forward true links for MODULE.")
    public static final SubLObject get_sbhl_module_naut_forward_true_generators_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $NAUT_FORWARD_TRUE_GENERATORS);
    }

    /**
     * Accessor: @return listp; the list of functions which generate forward true links for MODULE.
     */
    @LispMethod(comment = "Accessor: @return listp; the list of functions which generate forward true links for MODULE.")
    public static SubLObject get_sbhl_module_naut_forward_true_generators(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $NAUT_FORWARD_TRUE_GENERATORS);
    }

    /**
     * Accessor: @return sbhl-module-type-p. The type of module that MODULE / *sbhl-module* is.
     */
    @LispMethod(comment = "Accessor: @return sbhl-module-type-p. The type of module that MODULE / *sbhl-module* is.")
    public static final SubLObject get_sbhl_module_type_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_module_type(module);
    }

    /**
     * Accessor: @return sbhl-module-type-p. The type of module that MODULE / *sbhl-module* is.
     */
    @LispMethod(comment = "Accessor: @return sbhl-module-type-p. The type of module that MODULE / *sbhl-module* is.")
    public static SubLObject get_sbhl_module_type(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_module_type(module);
    }

    /**
     * Accessor: @return functionp; the function determing whether to terminate a search path, associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the function determing whether to terminate a search path, associated with MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_path_terminating_markP_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_path_terminating_mark(module);
    }

    /**
     * Accessor: @return functionp; the function determing whether to terminate a search path, associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the function determing whether to terminate a search path, associated with MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_path_terminating_markP_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_path_terminating_mark(module);
    }

    /**
     * Accessor: @return functionp; the marking function associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the marking function associated with MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_marking_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_marking_fn(module);
    }

    /**
     * Accessor: @return functionp; the marking function associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the marking function associated with MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_marking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_marking_fn(module);
    }

    /**
     * Accessor: @return functionp; the unmarking function associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the unmarking function associated with MODULE / *sbhl-module*")
    public static final SubLObject get_sbhl_unmarking_fn_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_unmarking_fn(module);
    }

    /**
     * Accessor: @return functionp; the unmarking function associated with MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return functionp; the unmarking function associated with MODULE / *sbhl-module*")
    public static SubLObject get_sbhl_unmarking_fn(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_unmarking_fn(module);
    }

    /**
     * Accessor: @return integerp; the marking increment for marking based on search parent's marking
     */
    @LispMethod(comment = "Accessor: @return integerp; the marking increment for marking based on search parent\'s marking")
    public static final SubLObject get_sbhl_module_marking_increment_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $MARKING_INCREMENT);
    }

    /**
     * Accessor: @return integerp; the marking increment for marking based on search parent's marking
     */
    @LispMethod(comment = "Accessor: @return integerp; the marking increment for marking based on search parent\'s marking")
    public static SubLObject get_sbhl_module_marking_increment(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $MARKING_INCREMENT);
    }

    /**
     * Accessor: @return integerp; the number corresponding to the index-arg position for MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return integerp; the number corresponding to the index-arg position for MODULE / *sbhl-module*.")
    public static final SubLObject get_sbhl_index_arg_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_index_arg(module);
    }

    /**
     * Accessor: @return integerp; the number corresponding to the index-arg position for MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return integerp; the number corresponding to the index-arg position for MODULE / *sbhl-module*.")
    public static SubLObject get_sbhl_index_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_index_arg(module);
    }

    /**
     * Accessor: @return integerp; which arg slot of {1,2} is not the index arg. @see get-sbhl-index-arg
     */
    @LispMethod(comment = "Accessor: @return integerp; which arg slot of {1,2} is not the index arg. @see get-sbhl-index-arg")
    public static final SubLObject get_sbhl_gather_arg_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return subtract(THREE_INTEGER, com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_index_arg(module));
    }

    /**
     * Accessor: @return integerp; which arg slot of {1,2} is not the index arg. @see get-sbhl-index-arg
     */
    @LispMethod(comment = "Accessor: @return integerp; which arg slot of {1,2} is not the index arg. @see get-sbhl-index-arg")
    public static SubLObject get_sbhl_gather_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return subtract(THREE_INTEGER, get_sbhl_index_arg(module));
    }

    /**
     * Accessor: @return functionp; the function applied to a node's marking before pushing it onto the result
     */
    @LispMethod(comment = "Accessor: @return functionp; the function applied to a node\'s marking before pushing it onto the result")
    public static final SubLObject get_sbhl_add_node_to_result_test_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_NODE_TO_RESULT_TEST);
    }

    /**
     * Accessor: @return functionp; the function applied to a node's marking before pushing it onto the result
     */
    @LispMethod(comment = "Accessor: @return functionp; the function applied to a node\'s marking before pushing it onto the result")
    public static SubLObject get_sbhl_add_node_to_result_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_NODE_TO_RESULT_TEST);
    }

    /**
     * Accessor: @return functionp; the function applied to an unmarked node's marking before pushing it onto the result
     */
    @LispMethod(comment = "Accessor: @return functionp; the function applied to an unmarked node\'s marking before pushing it onto the result")
    public static final SubLObject get_sbhl_add_unmarked_node_to_result_test_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_UNMARKED_NODE_TO_RESULT_TEST);
    }

    /**
     * Accessor: @return functionp; the function applied to an unmarked node's marking before pushing it onto the result
     */
    @LispMethod(comment = "Accessor: @return functionp; the function applied to an unmarked node\'s marking before pushing it onto the result")
    public static SubLObject get_sbhl_add_unmarked_node_to_result_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ADD_UNMARKED_NODE_TO_RESULT_TEST);
    }

    /**
     * Accessor: @return function-spec-p; the function used to test the type of objects used in *sbhl-module* / MODULE
     */
    @LispMethod(comment = "Accessor: @return function-spec-p; the function used to test the type of objects used in *sbhl-module* / MODULE")
    public static final SubLObject get_sbhl_type_test_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_type_test(module);
    }

    /**
     * Accessor: @return function-spec-p; the function used to test the type of objects used in *sbhl-module* / MODULE
     */
    @LispMethod(comment = "Accessor: @return function-spec-p; the function used to test the type of objects used in *sbhl-module* / MODULE")
    public static SubLObject get_sbhl_type_test(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_type_test(module);
    }

    /**
     * Accessor: @return sbhl-node-object-p; the root of the graph for MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the root of the graph for MODULE / *sbhl-module*.")
    public static final SubLObject get_sbhl_module_root_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $ROOT);
    }

    /**
     * Accessor: @return sbhl-node-object-p; the root of the graph for MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return sbhl-node-object-p; the root of the graph for MODULE / *sbhl-module*.")
    public static SubLObject get_sbhl_module_root(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $ROOT);
    }

    /**
     * returns the argument slot, if any, that MODULE / *sbhl-module* uses to transfer through another sbhl module
     */
    @LispMethod(comment = "returns the argument slot, if any, that MODULE / *sbhl-module* uses to transfer through another sbhl module")
    public static final SubLObject get_sbhl_transfers_via_arg_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $TRANSFERS_VIA_ARG);
    }

    /**
     * returns the argument slot, if any, that MODULE / *sbhl-module* uses to transfer through another sbhl module
     */
    @LispMethod(comment = "returns the argument slot, if any, that MODULE / *sbhl-module* uses to transfer through another sbhl module")
    public static SubLObject get_sbhl_transfers_via_arg(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $TRANSFERS_VIA_ARG);
    }

    /**
     * Accessor: @return listp; the list of sbhl predicates allowed by MODULE / *sbhl-module* for following links.
     */
    @LispMethod(comment = "Accessor: @return listp; the list of sbhl predicates allowed by MODULE / *sbhl-module* for following links.")
    public static final SubLObject get_sbhl_accessible_link_preds_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_accessible_link_preds(module);
    }

    /**
     * Accessor: @return listp; the list of sbhl predicates allowed by MODULE / *sbhl-module* for following links.
     */
    @LispMethod(comment = "Accessor: @return listp; the list of sbhl predicates allowed by MODULE / *sbhl-module* for following links.")
    public static SubLObject get_sbhl_accessible_link_preds(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_accessible_link_preds(module);
    }

    /**
     * Accessor: @return booleanp.
     */
    @LispMethod(comment = "Accessor: @return booleanp.")
    public static final SubLObject sbhl_module_indicates_predicate_search_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $PREDICATE_SEARCH_P);
    }

    /**
     * Accessor: @return booleanp.
     */
    @LispMethod(comment = "Accessor: @return booleanp.")
    public static SubLObject sbhl_module_indicates_predicate_search_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $PREDICATE_SEARCH_P);
    }

    /**
     * Accessor: @return listp; the sbhl modules in which NODE has links.
     */
    @LispMethod(comment = "Accessor: @return listp; the sbhl modules in which NODE has links.")
    public static final SubLObject get_sbhl_node_modules_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != sbhl_graphs.get_sbhl_graph_link(node, module)) {
                            result = cons(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_link_pred(module), result);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    /**
     * Accessor: @return listp; the sbhl modules in which NODE has links.
     */
    @LispMethod(comment = "Accessor: @return listp; the sbhl modules in which NODE has links.")
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

    /**
     * Accessor: @return booleanp; whether the current search module is a disjoins module
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current search module is a disjoins module")
    public static final SubLObject sbhl_disjoins_search_p_alt() {
        return sbhl_module_vars.sbhl_disjoins_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    /**
     * Accessor: @return booleanp; whether the current search module is a disjoins module
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current search module is a disjoins module")
    public static SubLObject sbhl_disjoins_search_p() {
        return sbhl_module_vars.sbhl_disjoins_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    /**
     * Accessor: @return booleanp; whether the current module is a time module.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current module is a time module.")
    public static final SubLObject sbhl_time_search_p_alt() {
        return sbhl_module_vars.sbhl_time_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    /**
     * Accessor: @return booleanp; whether the current module is a time module.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether the current module is a time module.")
    public static SubLObject sbhl_time_search_p() {
        return sbhl_module_vars.sbhl_time_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }

    /**
     * Accessor: @return booleanp; whether NODE is the root for MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is the root for MODULE / *sbhl-module*")
    public static final SubLObject sbhl_root_p_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return eq(node, com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_root(module));
    }

    /**
     * Accessor: @return booleanp; whether NODE is the root for MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether NODE is the root for MODULE / *sbhl-module*")
    public static SubLObject sbhl_root_p(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return eql(node, get_sbhl_module_root(module));
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; the predicate which has argument order flipped from that of MODULE.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the predicate which has argument order flipped from that of MODULE.")
    public static final SubLObject get_sbhl_inverse_link_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject inverse_module = NIL;
            inverse_module = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_with_inverted_arguments(module);
            if (NIL != inverse_module) {
                return inverse_module;
            }
            inverse_module = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_which_this_module_inverts_arguments_of(module);
            if (NIL != inverse_module) {
                return inverse_module;
            }
        }
        return NIL;
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; the predicate which has argument order flipped from that of MODULE.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the predicate which has argument order flipped from that of MODULE.")
    public static SubLObject get_sbhl_inverse_link_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor. @return listp; The list of functions used to generate links for nauts with MODULE, link direction DIRECTION, and sbhl-tv TV.
     */
    @LispMethod(comment = "Accessor. @return listp; The list of functions used to generate links for nauts with MODULE, link direction DIRECTION, and sbhl-tv TV.")
    public static final SubLObject get_sbhl_module_relevant_naut_link_generators_alt(SubLObject direction, SubLObject tv, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
            if (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_naut_forward_true_generators(module);
            }
        }
        return NIL;
    }

    /**
     * Accessor. @return listp; The list of functions used to generate links for nauts with MODULE, link direction DIRECTION, and sbhl-tv TV.
     */
    @LispMethod(comment = "Accessor. @return listp; The list of functions used to generate links for nauts with MODULE, link direction DIRECTION, and sbhl-tv TV.")
    public static SubLObject get_sbhl_module_relevant_naut_link_generators(final SubLObject direction, final SubLObject tv, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) && (NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction))) {
            return get_sbhl_module_naut_forward_true_generators(module);
        }
        return NIL;
    }

    /**
     * Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy
     *
     * @see sbhl-simple-reflexive-module-type-p or @see sbhl-simple-irreflexive-module-type-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy\r\n\r\n@see sbhl-simple-reflexive-module-type-p or @see sbhl-simple-irreflexive-module-type-p.")
    public static final SubLObject sbhl_simple_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return makeBoolean((NIL != sbhl_module_vars.sbhl_simple_reflexive_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module))) || (NIL != sbhl_module_vars.sbhl_simple_non_reflexive_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module))));
    }

    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy\r\n\r\n@see sbhl-simple-reflexive-module-type-p or @see sbhl-simple-irreflexive-module-type-p.")
    public static SubLObject sbhl_simple_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return makeBoolean((NIL != sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module))) || (NIL != sbhl_module_vars.sbhl_simple_non_reflexive_module_type_p(get_sbhl_module_type(module))));
    }

    /**
     * Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-time-module-type-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-time-module-type-p.")
    public static final SubLObject sbhl_time_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.sbhl_time_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-time-module-type-p.")
    public static SubLObject sbhl_time_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_time_module_type_p(get_sbhl_module_type(module));
    }

    /**
     * Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transitive-module-type-p
     */
    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transitive-module-type-p")
    public static final SubLObject sbhl_transitive_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.sbhl_transitive_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transitive-module-type-p")
    public static SubLObject sbhl_transitive_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_transitive_module_type_p(get_sbhl_module_type(module));
    }

    /**
     * Accessor: @return booleanp; is MODULE / *sbhl-module* one which is defined by the fact that it inverts the argument order of another module.
     */
    @LispMethod(comment = "Accessor: @return booleanp; is MODULE / *sbhl-module* one which is defined by the fact that it inverts the argument order of another module.")
    public static final SubLObject sbhl_inverse_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_which_this_module_inverts_arguments_of(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp; is MODULE / *sbhl-module* one which is defined by the fact that it inverts the argument order of another module.")
    public static SubLObject sbhl_inverse_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return list_utilities.sublisp_boolean(get_sbhl_module_which_this_module_inverts_arguments_of(module));
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; the module which is the same as MODULE relations, with argument order flipped.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the module which is the same as MODULE relations, with argument order flipped.")
    public static final SubLObject get_sbhl_inverse_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject result = NIL;
            result = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_with_inverted_arguments(module);
            if (NIL != result) {
                return result;
            }
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_which_this_module_inverts_arguments_of(module);
    }

    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the module which is the same as MODULE relations, with argument order flipped.")
    public static SubLObject get_sbhl_inverse_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        SubLObject result = NIL;
        result = get_sbhl_module_with_inverted_arguments(module);
        if (NIL != result) {
            return result;
        }
        return get_sbhl_module_which_this_module_inverts_arguments_of(module);
    }

    /**
     * Accessor: @return sbhl-predicate-object-p. The associated module that differs in argument order.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p. The associated module that differs in argument order.")
    public static final SubLObject get_sbhl_module_with_inverted_arguments_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject inverted_arguments_module = sbhl_module_vars.get_sbhl_module_property(module, $MODULE_INVERTS_ARGUMENTS);
            if (NIL != sbhl_module_vars.sbhl_module_p(inverted_arguments_module)) {
                return inverted_arguments_module;
            } else {
                if (NIL == inverted_arguments_module) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(inverted_arguments_module)) {
                        inverted_arguments_module = sbhl_module_vars.get_sbhl_module(inverted_arguments_module);
                        sbhl_module_vars.set_sbhl_module_property(module, $MODULE_INVERTS_ARGUMENTS, inverted_arguments_module);
                        return inverted_arguments_module;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p. The associated module that differs in argument order.")
    public static SubLObject get_sbhl_module_with_inverted_arguments(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return sbhl-module-p. The module which MODULE / *sbhl-module* inverts arguments of.
     */
    @LispMethod(comment = "Accessor: @return sbhl-module-p. The module which MODULE / *sbhl-module* inverts arguments of.")
    public static final SubLObject get_sbhl_module_which_this_module_inverts_arguments_of_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module_property(module, $INVERTS_ARGUMENTS_OF_MODULE);
            if (NIL != sbhl_module_vars.sbhl_module_p(inverts_arguments_of_module)) {
                return inverts_arguments_of_module;
            } else {
                if (NIL == inverts_arguments_of_module) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(inverts_arguments_of_module)) {
                        inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module(inverts_arguments_of_module);
                        sbhl_module_vars.set_sbhl_module_property(module, $INVERTS_ARGUMENTS_OF_MODULE, inverts_arguments_of_module);
                        return inverts_arguments_of_module;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-module-p. The module which MODULE / *sbhl-module* inverts arguments of.")
    public static SubLObject get_sbhl_module_which_this_module_inverts_arguments_of(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return keywordp; the keyword for the head of pseudo links in sbhl time module
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword for the head of pseudo links in sbhl time module")
    public static final SubLObject get_sbhl_module_tag_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_property(module, $MODULE_TAG);
    }

    @LispMethod(comment = "Accessor: @return keywordp; the keyword for the head of pseudo links in sbhl time module")
    public static SubLObject get_sbhl_module_tag(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_property(module, $MODULE_TAG);
    }

    /**
     * Modifier: stores a hash-table in the :graph field of MODULE
     */
    @LispMethod(comment = "Modifier: stores a hash-table in the :graph field of MODULE")
    public static final SubLObject new_sbhl_module_graph_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject v_graph = sbhl_graphs.make_new_sbhl_graph();
            sbhl_module_vars.set_sbhl_module_property(module, $GRAPH, v_graph);
        }
        return module;
    }

    @LispMethod(comment = "Modifier: stores a hash-table in the :graph field of MODULE")
    public static SubLObject new_sbhl_module_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        final SubLObject v_graph = sbhl_graphs.make_new_sbhl_graph();
        sbhl_module_vars.set_sbhl_module_property(module, $GRAPH, v_graph);
        return module;
    }

    /**
     * Accessor: @return hash-table-p; the table containing the graph corresonding to link predicate of MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return hash-table-p; the table containing the graph corresonding to link predicate of MODULE / *sbhl-module*.")
    public static final SubLObject get_sbhl_graph_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.get_sbhl_module_graph(module);
    }

    @LispMethod(comment = "Accessor: @return hash-table-p; the table containing the graph corresonding to link predicate of MODULE / *sbhl-module*.")
    public static SubLObject get_sbhl_graph(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.get_sbhl_module_graph(module);
    }

    /**
     *
     *
     * @return dictionary-p; the defined sbhl link tables. @see *sbhl-tables*
     */
    @LispMethod(comment = "@return dictionary-p; the defined sbhl link tables. @see *sbhl-tables*")
    public static final SubLObject get_sbhl_graphs_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_modules()));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject module = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject v_graph = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_graph(module);
                            if (NIL != v_graph) {
                                result = cons(v_graph, result);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    /**
     *
     *
     * @return dictionary-p; the defined sbhl link tables. @see *sbhl-tables*
     */
    @LispMethod(comment = "@return dictionary-p; the defined sbhl link tables. @see *sbhl-tables*")
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

    /**
     * Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-disjoins-module-type-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-disjoins-module-type-p.")
    public static final SubLObject sbhl_disjoins_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.sbhl_disjoins_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-disjoins-module-type-p.")
    public static SubLObject sbhl_disjoins_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_disjoins_module_type_p(get_sbhl_module_type(module));
    }

    /**
     * Accessor: @return sbhl-module-p. The associated module to MODULE / *sbhl-module* for disjoins.
     */
    @LispMethod(comment = "Accessor: @return sbhl-module-p. The associated module to MODULE / *sbhl-module* for disjoins.")
    public static final SubLObject get_sbhl_disjoins_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject disjoins_module = sbhl_module_vars.get_sbhl_module_property(module, $DISJOINS_MODULE);
            if (NIL != sbhl_module_vars.sbhl_module_p(disjoins_module)) {
                return disjoins_module;
            } else {
                if (NIL == disjoins_module) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(disjoins_module)) {
                        disjoins_module = sbhl_module_vars.get_sbhl_module(disjoins_module);
                        sbhl_module_vars.set_sbhl_module_property(module, $DISJOINS_MODULE, disjoins_module);
                        return disjoins_module;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-module-p. The associated module to MODULE / *sbhl-module* for disjoins.")
    public static SubLObject get_sbhl_disjoins_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transfers-through-module-type-p.
     */
    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transfers-through-module-type-p.")
    public static final SubLObject sbhl_transfers_through_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.sbhl_transfers_through_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp. does module type of MODULE / *sbhl-module* satisfy @see sbhl-transfers-through-module-type-p.")
    public static SubLObject sbhl_transfers_through_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_transfers_through_module_type_p(get_sbhl_module_type(module));
    }

    /**
     * returns the module, if any, that MODULE uses to transfer through.
     */
    @LispMethod(comment = "returns the module, if any, that MODULE uses to transfer through.")
    public static final SubLObject get_sbhl_transfers_through_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = sbhl_module_vars.get_sbhl_module_property(module, $TRANSFERS_THROUGH_MODULE);
            if (NIL != sbhl_module_vars.sbhl_module_p(tt_module)) {
                return tt_module;
            } else {
                if (NIL == tt_module) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_p(tt_module)) {
                        tt_module = sbhl_module_vars.get_sbhl_module(tt_module);
                        sbhl_module_vars.set_sbhl_module_property(module, $TRANSFERS_THROUGH_MODULE, tt_module);
                        return tt_module;
                    } else {
                        return NIL;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "returns the module, if any, that MODULE uses to transfer through.")
    public static SubLObject get_sbhl_transfers_through_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return booleanp; whether MODULE is for a reflexive predicate or not.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MODULE is for a reflexive predicate or not.")
    public static final SubLObject sbhl_reflexive_module_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.sbhl_simple_reflexive_module_type_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MODULE is for a reflexive predicate or not.")
    public static SubLObject sbhl_reflexive_module_p(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module));
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; If current search is a disjoins search, returns the module it transfers through.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; If current search is a disjoins search, returns the module it transfers through.")
    public static final SubLObject get_sbhl_disjoins_search_tt_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_disjoins_module_p(module) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_transfers_through_module(module))) : module;
    }

    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; If current search is a disjoins search, returns the module it transfers through.")
    public static SubLObject get_sbhl_disjoins_search_tt_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return NIL != sbhl_disjoins_module_p(module) ? get_sbhl_transfers_through_module(module) : module;
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; Module for minimizations and maximizations.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; Module for minimizations and maximizations.")
    public static final SubLObject get_sbhl_reductions_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject tt_module = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_transfers_through_module(module);
            SubLObject search_module = (NIL != module) ? ((SubLObject) (module)) : sbhl_search_vars.get_sbhl_search_module();
            if (NIL != tt_module) {
                return tt_module;
            } else {
                if (sbhl_module_vars.get_sbhl_module_link_pred(search_module) == $$genlInverse) {
                    return sbhl_module_vars.get_sbhl_module($$genlPreds);
                } else {
                    return search_module;
                }
            }
        }
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; Module for minimizations and maximizations.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; Module for minimizations and maximizations.")
    public static SubLObject get_sbhl_reductions_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return sbhl-predicate-object-p; the module corresponding to MODULE to be used for premarking in searches.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the module corresponding to MODULE to be used for premarking in searches.")
    public static final SubLObject get_sbhl_premark_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_disjoins_module_p(module) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_transfers_through_module(module))) : module;
    }

    /**
     * Accessor: @return sbhl-predicate-object-p; the module corresponding to MODULE to be used for premarking in searches.
     */
    @LispMethod(comment = "Accessor: @return sbhl-predicate-object-p; the module corresponding to MODULE to be used for premarking in searches.")
    public static SubLObject get_sbhl_premark_module(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return NIL != sbhl_disjoins_module_p(module) ? get_sbhl_transfers_through_module(module) : module;
    }

    /**
     * Accessor. @return booleanp; whether direction is a valid sbhl search direction
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether direction is a valid sbhl search direction")
    public static final SubLObject sbhl_search_direction_p_alt(SubLObject direction) {
        return makeBoolean((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) || (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)));
    }

    @LispMethod(comment = "Accessor. @return booleanp; whether direction is a valid sbhl search direction")
    public static SubLObject sbhl_search_direction_p(final SubLObject direction) {
        return makeBoolean((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) || (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)));
    }

    /**
     * Accessor: @return booleanp; whether DIRECTION is the keyword for forward links of MODULE.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether DIRECTION is the keyword for forward links of MODULE.")
    public static final SubLObject sbhl_forward_direction_for_module_p_alt(SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return eq(direction, com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_forward_direction(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether DIRECTION is the keyword for forward links of MODULE.")
    public static SubLObject sbhl_forward_direction_for_module_p(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return eq(direction, get_sbhl_module_forward_direction(module));
    }

    /**
     * Accessor: @return keywordp; the keyword that relates MODULE / *sbhl-module* to either :predicate or :link direction
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword that relates MODULE / *sbhl-module* to either :predicate or :link direction")
    public static final SubLObject get_sbhl_module_forward_direction_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_module_directed_linksP(module) ? ((SubLObject) (sbhl_link_vars.get_sbhl_forward_directed_direction())) : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    /**
     * Accessor: @return keywordp; the keyword that relates MODULE / *sbhl-module* to either :predicate or :link direction
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword that relates MODULE / *sbhl-module* to either :predicate or :link direction")
    public static SubLObject get_sbhl_module_forward_direction(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_forward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    /**
     * Accessor: @return keywordp; the keyword that relates MODULE to either :inverse or :link direction
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword that relates MODULE to either :inverse or :link direction")
    public static final SubLObject get_sbhl_module_backward_direction_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_module_directed_linksP(module) ? ((SubLObject) (sbhl_link_vars.get_sbhl_backward_directed_direction())) : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    @LispMethod(comment = "Accessor: @return keywordp; the keyword that relates MODULE to either :inverse or :link direction")
    public static SubLObject get_sbhl_module_backward_direction(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_backward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }

    /**
     * Accessor. @return sbhl-search-direction-p. the opposite of DIRECTION / *sbhl-search-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-search-direction-p. the opposite of DIRECTION / *sbhl-search-direction*")
    public static final SubLObject get_sbhl_opposite_search_direction_alt(SubLObject direction) {
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject current_direction = (NIL != direction) ? ((SubLObject) (direction)) : sbhl_search_vars.get_sbhl_search_direction();
                if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(current_direction)) {
                    return sbhl_search_vars.get_sbhl_backward_search_direction();
                } else {
                    if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(current_direction)) {
                        return sbhl_search_vars.get_sbhl_forward_search_direction();
                    } else {
                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_search_direction_p(current_direction)) {
                                {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str_alt21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P);
                                            } else {
                                                Errors.warn($str_alt26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str_alt21$_A_is_not_a__A, current_direction, SBHL_SEARCH_DIRECTION_P);
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

    /**
     * Accessor. @return sbhl-search-direction-p. the opposite of DIRECTION / *sbhl-search-direction*
     */
    @LispMethod(comment = "Accessor. @return sbhl-search-direction-p. the opposite of DIRECTION / *sbhl-search-direction*")
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

    /**
     * Accessor: @return booleanp; whether MODULE / *sbhl-module* is a directed or undirected graph
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MODULE / *sbhl-module* is a directed or undirected graph")
    public static final SubLObject sbhl_module_directed_linksP_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return sbhl_module_vars.fort_denotes_sbhl_directed_graph_p(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_link_style(module));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MODULE / *sbhl-module* is a directed or undirected graph")
    public static SubLObject sbhl_module_directed_linksP(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return sbhl_module_vars.fort_denotes_sbhl_directed_graph_p(get_sbhl_link_style(module));
    }/**
     * Accessor: @return booleanp; whether MODULE / *sbhl-module* is a directed or undirected graph
     */


    /**
     * Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.")
    public static final SubLObject sbhl_search_direction_to_link_direction_alt(SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_forward_direction(module);
        } else {
            if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_backward_direction(module);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.")
    public static SubLObject sbhl_search_direction_to_link_direction(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.
     */


    /**
     * Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.
     */
    @LispMethod(comment = "Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.")
    public static final SubLObject sbhl_search_direction_to_opposite_link_direction_alt(SubLObject direction, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_backward_direction(module);
        } else {
            if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_forward_direction(module);
            } else {
                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.")
    public static SubLObject sbhl_search_direction_to_opposite_link_direction(final SubLObject direction, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$invalid_sbhl_search_direction__a, direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }/**
     * Accessor: @return keywordp; the keyword for links in direction DIRECTION corresponding to MODULE / *sbhl-module*.
     */


    /**
     * Accessor: @return listp; of the keywords for relevant directions for links of MODULE / *sbhl-module*. if *sbhl-link-direction* is specified, it will return with a list of either the forward-direction for MODULE / *sbhl-module* or the backward-direction for MODULE / *sbhl-module*
     */
    @LispMethod(comment = "Accessor: @return listp; of the keywords for relevant directions for links of MODULE / *sbhl-module*. if *sbhl-link-direction* is specified, it will return with a list of either the forward-direction for MODULE / *sbhl-module* or the backward-direction for MODULE / *sbhl-module*")
    public static final SubLObject get_relevant_sbhl_directions_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return (NIL != sbhl_link_vars.get_sbhl_link_direction()) && (NIL != module) ? ((SubLObject) (sbhl_link_vars.get_sbhl_link_direction_as_list())) : NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_module_directed_linksP(module) ? ((SubLObject) (sbhl_link_vars.get_sbhl_directed_directions())) : sbhl_link_vars.get_sbhl_undirected_direction_as_list();
    }

    @LispMethod(comment = "Accessor: @return listp; of the keywords for relevant directions for links of MODULE / *sbhl-module*. if *sbhl-link-direction* is specified, it will return with a list of either the forward-direction for MODULE / *sbhl-module* or the backward-direction for MODULE / *sbhl-module*")
    public static SubLObject get_relevant_sbhl_directions(final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return (NIL != sbhl_link_vars.get_sbhl_link_direction()) && (NIL != module) ? sbhl_link_vars.get_sbhl_link_direction_as_list() : NIL != sbhl_module_directed_linksP(module) ? sbhl_link_vars.get_sbhl_directed_directions() : sbhl_link_vars.get_sbhl_undirected_direction_as_list();
    }/**
     * Accessor: @return listp; of the keywords for relevant directions for links of MODULE / *sbhl-module*. if *sbhl-link-direction* is specified, it will return with a list of either the forward-direction for MODULE / *sbhl-module* or the backward-direction for MODULE / *sbhl-module*
     */


    /**
     * The cardinality of NODE with MODULE in the predicate direction
     */
    @LispMethod(comment = "The cardinality of NODE with MODULE in the predicate direction")
    public static final SubLObject sbhl_predicate_cardinality_alt(SubLObject module, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.genl_cardinality(node);
    }

    @LispMethod(comment = "The cardinality of NODE with MODULE in the predicate direction")
    public static SubLObject sbhl_predicate_cardinality(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.genl_cardinality(node);
    }/**
     * The cardinality of NODE with MODULE in the predicate direction
     */


    /**
     * The cardinality of NODE with PRED in the inverse direction
     */
    @LispMethod(comment = "The cardinality of NODE with PRED in the inverse direction")
    public static final SubLObject sbhl_inverse_cardinality_alt(SubLObject module, SubLObject node) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.spec_cardinality(node);
    }

    @LispMethod(comment = "The cardinality of NODE with PRED in the inverse direction")
    public static SubLObject sbhl_inverse_cardinality(final SubLObject module, final SubLObject node) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        if (NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return ZERO_INTEGER;
        }
        return cardinality_estimates.spec_cardinality(node);
    }/**
     * The cardinality of NODE with PRED in the inverse direction
     */


    public static final SubLObject sbhl_module_hl_support_module_alt(SubLObject module) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_pred_hl_support_module(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }

    public static SubLObject sbhl_module_hl_support_module(final SubLObject module) {
        return sbhl_pred_hl_support_module(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }

    public static final SubLObject sbhl_pred_hl_support_module_alt(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, SBHL_PREDICATE_P);
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$genls)) {
                return $GENLS;
            } else {
                if (pcase_var.eql($$isa) || pcase_var.eql($$quotedIsa)) {
                    return $ISA;
                } else {
                    if (pcase_var.eql($$genlPreds) || pcase_var.eql($$genlInverse)) {
                        return $GENLPREDS;
                    } else {
                        if (pcase_var.eql($$genlMt) || pcase_var.eql($$negationMt)) {
                            return $GENLMT;
                        } else {
                            if (pcase_var.eql($$disjointWith)) {
                                return $DISJOINTWITH;
                            } else {
                                if (pcase_var.eql($$negationPreds) || pcase_var.eql($$negationInverse)) {
                                    return $NEGATIONPREDS;
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_pred_hl_support_module(final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "! sbhl_module_utilities.sbhl_predicate_p(pred) " + ("sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ") + pred;
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

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static final SubLObject sbhl_old_mode_alt(SubLObject direction, SubLObject pred) {
        SubLTrampolineFile.checkType(pred, SBHL_PREDICATE_P);
        {
            SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
            if (pred == $$isa) {
                return $ISA;
            } else {
                if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_disjoins_module_p(module)) {
                    return $NEGATION;
                } else {
                    if (com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_forward_direction(module) == direction) {
                        return $SUPERIOR;
                    } else {
                        if (com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_backward_direction(module) == direction) {
                            return $INFERIOR;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static SubLObject sbhl_old_mode(final SubLObject direction, final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "! sbhl_module_utilities.sbhl_predicate_p(pred) " + ("sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ") + pred;
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

    public static final SubLObject sbhl_pred_get_hl_module_alt(SubLObject pred) {
        SubLTrampolineFile.checkType(pred, SBHL_PREDICATE_P);
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$genls)) {
                return $GENLS;
            } else {
                if (pcase_var.eql($$isa)) {
                    return $ISA;
                } else {
                    if (pcase_var.eql($$quotedIsa)) {
                        return $ISA;
                    } else {
                        if (pcase_var.eql($$genlPreds)) {
                            return $GENLPREDS;
                        } else {
                            if (pcase_var.eql($$genlInverse)) {
                                return $GENLPREDS;
                            } else {
                                if (pcase_var.eql($$genlMt)) {
                                    return $GENLMT;
                                } else {
                                    if (pcase_var.eql($$disjointWith)) {
                                        return $DISJOINTWITH;
                                    } else {
                                        if (pcase_var.eql($$negationPreds)) {
                                            return $NEGATIONPREDS;
                                        } else {
                                            if (pcase_var.eql($$negationInverse)) {
                                                return $NEGATIONPREDS;
                                            } else {
                                                if (pcase_var.eql($$negationMt)) {
                                                    return $GENLMT;
                                                }
                                            }
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

    public static SubLObject sbhl_pred_get_hl_module(final SubLObject pred) {
        assert NIL != sbhl_predicate_p(pred) : "! sbhl_module_utilities.sbhl_predicate_p(pred) " + ("sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ") + pred;
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

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static final SubLObject sbhl_old_module_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_pred_get_hl_module(pred);
    }

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static SubLObject sbhl_old_module(final SubLObject pred) {
        return sbhl_pred_get_hl_module(pred);
    }

    /**
     *
     *
     * @unknown way too old.
     */
    @LispMethod(comment = "@unknown way too old.")
    public static final SubLObject sbhl_predicate_for_hl_module_alt(SubLObject hl_module) {
        {
            SubLObject pcase_var = hl_module;
            if (pcase_var.eql($GENLS)) {
                return $$genls;
            } else {
                if (pcase_var.eql($GENLMT)) {
                    return $$genlMt;
                } else {
                    if (pcase_var.eql($GENLPREDS)) {
                        return $$genlPreds;
                    } else {
                        if (pcase_var.eql($ISA)) {
                            return $$isa;
                        } else {
                            if (pcase_var.eql($DISJOINTWITH)) {
                                return $$disjointWith;
                            } else {
                                if (pcase_var.eql($NEGATIONPREDS)) {
                                    return $$negationPreds;
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown way too old.
     */
    @LispMethod(comment = "@unknown way too old.")
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

    public static final SubLObject sbhl_predicate_from_fort_type_alt(SubLObject fort_type) {
        {
            SubLObject pcase_var = fort_type;
            if (pcase_var.eql($$Collection)) {
                return $$genls;
            } else {
                if (pcase_var.eql($$Predicate)) {
                    return $$genlPreds;
                } else {
                    if (pcase_var.eql($$Microtheory)) {
                        return $$genlMt;
                    } else {
                        return $$isa;
                    }
                }
            }
        }
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

    public static final SubLObject sbhl_node_has_type_associated_to_predicate_p_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.apply_sbhl_module_type_test(node, module);
    }

    public static SubLObject sbhl_node_has_type_associated_to_predicate_p(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
        return apply_sbhl_module_type_test(node, module);
    }

    public static final SubLObject determine_sbhl_predicate_from_fort_type_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt));
    }

    public static SubLObject determine_sbhl_predicate_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt));
    }

    public static final SubLObject determine_sbhl_module_from_fort_type_alt(SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_module_vars.get_sbhl_module(com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt)));
    }

    public static SubLObject determine_sbhl_module_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sbhl_module_vars.get_sbhl_module(sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt)));
    }

    public static final SubLObject sbhl_node_with_any_sbhl_type_p_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != fort_p(fort)) || ($$isa != com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.determine_sbhl_predicate_from_fort_type(fort, mt)));
    }

    public static SubLObject sbhl_node_with_any_sbhl_type_p(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != forts.fort_p(fort)) || (!$$isa.eql(determine_sbhl_predicate_from_fort_type(fort, mt))));
    }

    /**
     * Accessor: @return booleanp; whether FORT is part of the SBHL.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether FORT is part of the SBHL.")
    public static final SubLObject sbhl_fortP_alt(SubLObject fort) {
        return makeBoolean((((NIL != sbhl_links.any_sbhl_links_p(fort, $$isa)) || (NIL != fort_types_interface.collection_p(fort))) || (NIL != fort_types_interface.predicate_p(fort))) || (NIL != fort_types_interface.microtheory_p(fort)));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether FORT is part of the SBHL.")
    public static SubLObject sbhl_fortP(final SubLObject fort) {
        return makeBoolean((((NIL != sbhl_links.any_sbhl_links_p(fort, $$isa)) || (NIL != fort_types_interface.collection_p(fort))) || (NIL != fort_types_interface.predicate_p(fort))) || (NIL != fort_types_interface.microtheory_p(fort)));
    }/**
     * Accessor: @return booleanp; whether FORT is part of the SBHL.
     */


    public static final SubLObject sbhl_isa_collection_p_alt(SubLObject node) {
        return fort_types_interface.isa_collectionP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject sbhl_isa_collection_p(final SubLObject node) {
        return fort_types_interface.isa_collectionP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static final SubLObject sbhl_isa_microtheory_p_alt(SubLObject node) {
        return fort_types_interface.isa_mtP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject sbhl_isa_microtheory_p(final SubLObject node) {
        return fort_types_interface.isa_mtP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static final SubLObject sbhl_isa_predicate_p_alt(SubLObject node) {
        return fort_types_interface.isa_predicateP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    public static SubLObject sbhl_isa_predicate_p(final SubLObject node) {
        return fort_types_interface.isa_predicateP(function_terms.naut_to_nart(node), UNPROVIDED);
    }

    /**
     *
     *
     * @unknown reduce funcalls. Applies to NODE the @see get-sbhl-module-type-test.
     */
    @LispMethod(comment = "@unknown reduce funcalls. Applies to NODE the @see get-sbhl-module-type-test.")
    public static final SubLObject apply_sbhl_module_type_test_alt(SubLObject node, SubLObject module) {
        SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
        {
            SubLObject test_fn = com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_type_test(module);
            if (NIL != test_fn) {
                {
                    SubLObject pcase_var = test_fn;
                    if (pcase_var.eql(COLLECTION_P)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_isa_collection_p(node);
                    } else {
                        if (pcase_var.eql(MICROTHEORY_P)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_isa_microtheory_p(node);
                        } else {
                            if (pcase_var.eql(PREDICATE_P)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_isa_predicate_p(node);
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            } else {
                return T;
            }
        }
    }

    /**
     *
     *
     * @unknown reduce funcalls. Applies to NODE the @see get-sbhl-module-type-test.
     */
    @LispMethod(comment = "@unknown reduce funcalls. Applies to NODE the @see get-sbhl-module-type-test.")
    public static SubLObject apply_sbhl_module_type_test(final SubLObject node, final SubLObject module) {
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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

    /**
     * Accessor: @return booleanp; whether all the keys of MODULE meet the test @see sbhl-module-property-p, and whether MODULE-DICTIONARY has key-data pairs for all of @see *sbhl-module-required-properites*. @return booleanp; whether
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether all the keys of MODULE meet the test @see sbhl-module-property-p, and whether MODULE-DICTIONARY has key-data pairs for all of @see *sbhl-module-required-properites*. @return booleanp; whether")
    public static final SubLObject sbhl_module_meets_requisitesP_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module, SBHL_MODULE_P);
            {
                SubLObject failP = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_module_properties()));
                while (!((NIL != failP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject property = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject data_test = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject data = sbhl_module_vars.get_sbhl_module_property(module, property);
                            if (NIL != data) {
                                if (NIL != funcall(data_test, data)) {
                                    {
                                        SubLObject pcase_var = data_test;
                                        if (pcase_var.eql(FUNCTION_SYMBOL_P)) {
                                            register_kb_function(data);
                                        } else {
                                            if (pcase_var.eql(FUNCTION_SYMBOL_LIST_P)) {
                                                {
                                                    SubLObject cdolist_list_var = data;
                                                    SubLObject symbol_function = NIL;
                                                    for (symbol_function = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbol_function = cdolist_list_var.first()) {
                                                        register_kb_function(symbol_function);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt54$Data___a__associated_with_propert, data, property, data_test, UNPROVIDED, UNPROVIDED);
                                    failP = T;
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                {
                    SubLObject rest = NIL;
                    for (rest = sbhl_module_vars.get_sbhl_module_required_properties(); !((NIL != failP) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject property = rest.first();
                            if (NIL == sbhl_module_vars.get_sbhl_module_property(module, property)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt55$No_data_associated_with_required_, property, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                failP = T;
                            }
                        }
                    }
                }
                return makeBoolean(NIL == failP);
            }
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether all the keys of MODULE meet the test @see sbhl-module-property-p, and whether MODULE-DICTIONARY has key-data pairs for all of @see *sbhl-module-required-properites*. @return booleanp; whether")
    public static SubLObject sbhl_module_meets_requisitesP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sbhl_module_vars.sbhl_module_p(module) : "! sbhl_module_vars.sbhl_module_p(module) " + ("sbhl_module_vars.sbhl_module_p(module) " + "CommonSymbols.NIL != sbhl_module_vars.sbhl_module_p(module) ") + module;
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
    }/**
     * Accessor: @return booleanp; whether all the keys of MODULE meet the test @see sbhl-module-property-p, and whether MODULE-DICTIONARY has key-data pairs for all of @see *sbhl-module-required-properites*. @return booleanp; whether
     */


    public static SubLObject declare_sbhl_module_utilities_file() {
        declareFunction("init_sbhl_module_data", "INIT-SBHL-MODULE-DATA", 2, 0, false);
        declareFunction("clear_get_sbhl_predicates", "CLEAR-GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction("remove_get_sbhl_predicates", "REMOVE-GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction("get_sbhl_predicates_internal", "GET-SBHL-PREDICATES-INTERNAL", 0, 0, false);
        declareFunction("get_sbhl_predicates", "GET-SBHL-PREDICATES", 0, 0, false);
        declareFunction("sbhl_predicate_p", "SBHL-PREDICATE-P", 1, 0, false);
        declareFunction("sbhl_module_or_predicate_p", "SBHL-MODULE-OR-PREDICATE-P", 1, 0, false);
        declareFunction("sbhl_non_time_module_p", "SBHL-NON-TIME-MODULE-P", 1, 0, false);
        declareFunction("sbhl_non_time_predicate_p", "SBHL-NON-TIME-PREDICATE-P", 1, 0, false);
        declareFunction("sbhl_graph_p", "SBHL-GRAPH-P", 1, 0, false);
        declareFunction("get_sbhl_link_pred", "GET-SBHL-LINK-PRED", 1, 0, false);
        declareFunction("get_sbhl_link_style", "GET-SBHL-LINK-STYLE", 1, 0, false);
        declareFunction("get_sbhl_module_naut_forward_true_generators", "GET-SBHL-MODULE-NAUT-FORWARD-TRUE-GENERATORS", 1, 0, false);
        declareFunction("get_sbhl_module_type", "GET-SBHL-MODULE-TYPE", 1, 0, false);
        declareFunction("get_sbhl_path_terminating_markP_fn", "GET-SBHL-PATH-TERMINATING-MARK?-FN", 1, 0, false);
        declareFunction("get_sbhl_marking_fn", "GET-SBHL-MARKING-FN", 1, 0, false);
        declareFunction("get_sbhl_unmarking_fn", "GET-SBHL-UNMARKING-FN", 1, 0, false);
        declareFunction("get_sbhl_module_marking_increment", "GET-SBHL-MODULE-MARKING-INCREMENT", 1, 0, false);
        declareFunction("get_sbhl_index_arg", "GET-SBHL-INDEX-ARG", 1, 0, false);
        declareFunction("get_sbhl_gather_arg", "GET-SBHL-GATHER-ARG", 1, 0, false);
        declareFunction("get_sbhl_add_node_to_result_test", "GET-SBHL-ADD-NODE-TO-RESULT-TEST", 1, 0, false);
        declareFunction("get_sbhl_add_unmarked_node_to_result_test", "GET-SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST", 1, 0, false);
        declareFunction("get_sbhl_type_test", "GET-SBHL-TYPE-TEST", 1, 0, false);
        declareFunction("get_sbhl_module_root", "GET-SBHL-MODULE-ROOT", 1, 0, false);
        declareFunction("get_sbhl_transfers_via_arg", "GET-SBHL-TRANSFERS-VIA-ARG", 1, 0, false);
        declareFunction("get_sbhl_accessible_link_preds", "GET-SBHL-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        declareFunction("sbhl_module_indicates_predicate_search_p", "SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P", 1, 0, false);
        declareFunction("get_sbhl_node_modules", "GET-SBHL-NODE-MODULES", 1, 0, false);
        declareFunction("sbhl_disjoins_search_p", "SBHL-DISJOINS-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_time_search_p", "SBHL-TIME-SEARCH-P", 0, 0, false);
        declareFunction("sbhl_root_p", "SBHL-ROOT-P", 2, 0, false);
        declareFunction("get_sbhl_inverse_link_module", "GET-SBHL-INVERSE-LINK-MODULE", 1, 0, false);
        declareFunction("get_sbhl_module_relevant_naut_link_generators", "GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS", 3, 0, false);
        declareFunction("sbhl_simple_module_p", "SBHL-SIMPLE-MODULE-P", 1, 0, false);
        declareFunction("sbhl_time_module_p", "SBHL-TIME-MODULE-P", 1, 0, false);
        declareFunction("sbhl_transitive_module_p", "SBHL-TRANSITIVE-MODULE-P", 1, 0, false);
        declareFunction("sbhl_inverse_module_p", "SBHL-INVERSE-MODULE-P", 1, 0, false);
        declareFunction("get_sbhl_inverse_module", "GET-SBHL-INVERSE-MODULE", 1, 0, false);
        declareFunction("get_sbhl_module_with_inverted_arguments", "GET-SBHL-MODULE-WITH-INVERTED-ARGUMENTS", 1, 0, false);
        declareFunction("get_sbhl_module_which_this_module_inverts_arguments_of", "GET-SBHL-MODULE-WHICH-THIS-MODULE-INVERTS-ARGUMENTS-OF", 1, 0, false);
        declareFunction("get_sbhl_module_tag", "GET-SBHL-MODULE-TAG", 1, 0, false);
        declareFunction("new_sbhl_module_graph", "NEW-SBHL-MODULE-GRAPH", 1, 0, false);
        declareFunction("get_sbhl_graph", "GET-SBHL-GRAPH", 1, 0, false);
        declareFunction("get_sbhl_graphs", "GET-SBHL-GRAPHS", 0, 0, false);
        declareFunction("sbhl_disjoins_module_p", "SBHL-DISJOINS-MODULE-P", 1, 0, false);
        declareFunction("get_sbhl_disjoins_module", "GET-SBHL-DISJOINS-MODULE", 1, 0, false);
        declareFunction("sbhl_transfers_through_module_p", "SBHL-TRANSFERS-THROUGH-MODULE-P", 1, 0, false);
        declareFunction("get_sbhl_transfers_through_module", "GET-SBHL-TRANSFERS-THROUGH-MODULE", 1, 0, false);
        declareFunction("sbhl_reflexive_module_p", "SBHL-REFLEXIVE-MODULE-P", 1, 0, false);
        declareFunction("get_sbhl_disjoins_search_tt_module", "GET-SBHL-DISJOINS-SEARCH-TT-MODULE", 1, 0, false);
        declareFunction("get_sbhl_reductions_module", "GET-SBHL-REDUCTIONS-MODULE", 1, 0, false);
        declareFunction("get_sbhl_premark_module", "GET-SBHL-PREMARK-MODULE", 1, 0, false);
        declareFunction("sbhl_search_direction_p", "SBHL-SEARCH-DIRECTION-P", 1, 0, false);
        declareFunction("sbhl_forward_direction_for_module_p", "SBHL-FORWARD-DIRECTION-FOR-MODULE-P", 2, 0, false);
        declareFunction("get_sbhl_module_forward_direction", "GET-SBHL-MODULE-FORWARD-DIRECTION", 1, 0, false);
        declareFunction("get_sbhl_module_backward_direction", "GET-SBHL-MODULE-BACKWARD-DIRECTION", 1, 0, false);
        declareFunction("get_sbhl_opposite_search_direction", "GET-SBHL-OPPOSITE-SEARCH-DIRECTION", 0, 1, false);
        declareFunction("sbhl_module_directed_linksP", "SBHL-MODULE-DIRECTED-LINKS?", 1, 0, false);
        declareFunction("sbhl_search_direction_to_link_direction", "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION", 2, 0, false);
        declareFunction("sbhl_search_direction_to_opposite_link_direction", "SBHL-SEARCH-DIRECTION-TO-OPPOSITE-LINK-DIRECTION", 2, 0, false);
        declareFunction("get_relevant_sbhl_directions", "GET-RELEVANT-SBHL-DIRECTIONS", 1, 0, false);
        declareFunction("sbhl_predicate_cardinality", "SBHL-PREDICATE-CARDINALITY", 2, 0, false);
        declareFunction("sbhl_inverse_cardinality", "SBHL-INVERSE-CARDINALITY", 2, 0, false);
        declareFunction("sbhl_module_hl_support_module", "SBHL-MODULE-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction("sbhl_pred_hl_support_module", "SBHL-PRED-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction("sbhl_old_mode", "SBHL-OLD-MODE", 2, 0, false);
        declareFunction("sbhl_pred_get_hl_module", "SBHL-PRED-GET-HL-MODULE", 1, 0, false);
        declareFunction("sbhl_old_module", "SBHL-OLD-MODULE", 1, 0, false);
        declareFunction("sbhl_predicate_for_hl_module", "SBHL-PREDICATE-FOR-HL-MODULE", 1, 0, false);
        declareFunction("sbhl_predicate_from_fort_type", "SBHL-PREDICATE-FROM-FORT-TYPE", 1, 0, false);
        declareFunction("sbhl_node_has_type_associated_to_predicate_p", "SBHL-NODE-HAS-TYPE-ASSOCIATED-TO-PREDICATE-P", 2, 0, false);
        declareFunction("determine_sbhl_predicate_from_fort_type", "DETERMINE-SBHL-PREDICATE-FROM-FORT-TYPE", 1, 1, false);
        declareFunction("determine_sbhl_module_from_fort_type", "DETERMINE-SBHL-MODULE-FROM-FORT-TYPE", 1, 1, false);
        declareFunction("sbhl_node_with_any_sbhl_type_p", "SBHL-NODE-WITH-ANY-SBHL-TYPE-P", 1, 1, false);
        declareFunction("sbhl_fortP", "SBHL-FORT?", 1, 0, false);
        declareFunction("sbhl_isa_collection_p", "SBHL-ISA-COLLECTION-P", 1, 0, false);
        declareFunction("sbhl_isa_microtheory_p", "SBHL-ISA-MICROTHEORY-P", 1, 0, false);
        declareFunction("sbhl_isa_predicate_p", "SBHL-ISA-PREDICATE-P", 1, 0, false);
        declareFunction("apply_sbhl_module_type_test", "APPLY-SBHL-MODULE-TYPE-TEST", 2, 0, false);
        declareFunction("sbhl_module_meets_requisitesP", "SBHL-MODULE-MEETS-REQUISITES?", 1, 0, false);
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

    static {
    }

    public static final SubLSymbol $kw3$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt21$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt27$invalid_sbhl_search_direction__a = makeString("invalid sbhl-search-direction ~a");

    static private final SubLString $str_alt54$Data___a__associated_with_propert = makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");

    static private final SubLString $str_alt55$No_data_associated_with_required_ = makeString("No data associated with required property ~a");
}

/**
 * Total time: 157 ms
 */
