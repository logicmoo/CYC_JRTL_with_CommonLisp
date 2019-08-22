/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.formula_arity;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.specs_fn_arg;
import static com.cyc.cycjava.cycl.el_utilities.specs_fn_naut_p;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_domain_examples extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_domain_examples();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_domain_examples";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RKF_SALIENT_SPEC_PREDICATE_MEMOIZED = makeSymbol("RKF-SALIENT-SPEC-PREDICATE-MEMOIZED");



    private static final SubLSymbol RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED = makeSymbol("RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED");

    private static final SubLList $list5 = list(reader_make_constant_shell("keSalientPredicate"), makeKeyword("PREDICATE"));



    private static final SubLList $list8 = list(makeKeyword("SENTENCE"));



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");









    private static final SubLSymbol RKF_GENERIC_EXAMPLE_P = makeSymbol("RKF-GENERIC-EXAMPLE-P");

    private static final SubLSymbol RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED = makeSymbol("RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED");

    private static final SubLSymbol MIN_ARITY_MEMOIZED = makeSymbol("MIN-ARITY-MEMOIZED");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol RKF_CH_RAW_TOKENIZATION_MEMOIZED = makeSymbol("RKF-CH-RAW-TOKENIZATION-MEMOIZED");



    private static final SubLSymbol $sym23$_ = makeSymbol("<");

    private static final SubLString $str26$identifying__S_matches = makeString("identifying ~S matches");

    private static final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLString $$$identifying_matches = makeString("identifying matches");

    static private final SubLList $list32 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"));

    static private final SubLSymbol $sym35$RELATION_GENERALITY_ESTIMATE_ = makeSymbol("RELATION-GENERALITY-ESTIMATE<");

    static private final SubLSymbol $sym37$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    static private final SubLList $list39 = list(NIL, NIL, NIL, NIL);

    static private final SubLString $$$organizing_matches = makeString("organizing matches");

    static private final SubLList $list41 = list(makeSymbol("LAST-PRED"), makeSymbol("LAST-ARG"), makeSymbol("LAST-CONSTRAINT"), makeSymbol("LAST-COL"));

    static private final SubLList $list42 = list(makeSymbol("THIS-PRED"), makeSymbol("THIS-ARG"), makeSymbol("THIS-CONSTRAINT"), makeSymbol("THIS-COL"));

    static private final SubLList $list43 = list(makeSymbol("COLLECTION"), makeSymbol("MATCH-PREDICATE-SECTIONS"));

    static private final SubLList $list44 = list(makeSymbol("PREDICATE"), makeSymbol("ARGNUM-LIST"));

    private static final SubLSymbol RELATION_GENERALITY_ESTIMATE = makeSymbol("RELATION-GENERALITY-ESTIMATE");

    static private final SubLString $$$categorizing_predicates = makeString("categorizing predicates");

    static private final SubLString $$$sorting_predicates = makeString("sorting predicates");



    static private final SubLString $$$Other_predicates = makeString("Other predicates");



    private static final SubLObject $const51$TypeInstanceTernaryRuleMacroPredi = reader_make_constant_shell("TypeInstanceTernaryRuleMacroPredicate");

    private static final SubLObject $const52$InstanceTypeTernaryRuleMacroPredi = reader_make_constant_shell("InstanceTypeTernaryRuleMacroPredicate");

    private static final SubLSymbol RKF_MIN_ARG_N_ISA = makeSymbol("RKF-MIN-ARG-N-ISA");

    public static final SubLSymbol $rkf_min_arg_n_isa_caching_state$ = makeSymbol("*RKF-MIN-ARG-N-ISA-CACHING-STATE*");

    private static final SubLSymbol RKF_MIN_ARG_N_GENL = makeSymbol("RKF-MIN-ARG-N-GENL");

    public static final SubLSymbol $rkf_min_arg_n_genl_caching_state$ = makeSymbol("*RKF-MIN-ARG-N-GENL-CACHING-STATE*");

    static private final SubLSymbol $sym57$_ = makeSymbol(">");

    private static final SubLSymbol NUM_PREDICATE_EXTENT_INDEX = makeSymbol("NUM-PREDICATE-EXTENT-INDEX");

    // Definitions
    public static final SubLObject rkf_salient_spec_predicateP_alt(SubLObject predicate, SubLObject domain_mt) {
        return makeBoolean((((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.predicateP(predicate))) && (NIL == forts.invalid_fortP(predicate))) && (NIL != com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicate_memoized(predicate, domain_mt)));
    }

    // Definitions
    public static SubLObject rkf_salient_spec_predicateP(final SubLObject predicate, final SubLObject domain_mt) {
        return makeBoolean((((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.predicateP(predicate))) && (NIL == forts.invalid_fortP(predicate))) && (NIL != rkf_salient_spec_predicate_memoized(predicate, domain_mt)));
    }

    public static final SubLObject rkf_salient_spec_predicate_memoized_internal_alt(SubLObject predicate, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicate_internal(predicate, domain_mt);
    }

    public static SubLObject rkf_salient_spec_predicate_memoized_internal(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_salient_spec_predicate_internal(predicate, domain_mt);
    }

    public static final SubLObject rkf_salient_spec_predicate_memoized_alt(SubLObject predicate, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, domain_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_salient_spec_predicate_memoized(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_SALIENT_SPEC_PREDICATE_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_salient_spec_predicate_memoized_internal(predicate, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_salient_spec_predicate_internal_alt(SubLObject predicate, SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keSalientSpecPredicate, predicate), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_salient_spec_predicate_internal(final SubLObject predicate, final SubLObject domain_mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$keSalientSpecPredicate, predicate), domain_mt, UNPROVIDED, UNPROVIDED));
    }

    /**
     * given a set of PREDICATES and a DOMAIN-MT, construct a graph of the
     * predicates, clustering the salient spec predicates under their respective
     * #$genlPreds; return the graph and any orphans (i.e. salient spec
     * predicates whose #$genlPreds predicates where not members of the
     * PREDICATES set
     */
    @LispMethod(comment = "given a set of PREDICATES and a DOMAIN-MT, construct a graph of the\r\npredicates, clustering the salient spec predicates under their respective\r\n#$genlPreds; return the graph and any orphans (i.e. salient spec\r\npredicates whose #$genlPreds predicates where not members of the\r\nPREDICATES set\ngiven a set of PREDICATES and a DOMAIN-MT, construct a graph of the\npredicates, clustering the salient spec predicates under their respective\n#$genlPreds; return the graph and any orphans (i.e. salient spec\npredicates whose #$genlPreds predicates where not members of the\nPREDICATES set")
    public static final SubLObject rkf_build_spec_predicate_graph_alt(SubLObject predicates, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_build_spec_predicate_graph_memoized(predicates, domain_mt);
    }

    /**
     * given a set of PREDICATES and a DOMAIN-MT, construct a graph of the
     * predicates, clustering the salient spec predicates under their respective
     * #$genlPreds; return the graph and any orphans (i.e. salient spec
     * predicates whose #$genlPreds predicates where not members of the
     * PREDICATES set
     */
    @LispMethod(comment = "given a set of PREDICATES and a DOMAIN-MT, construct a graph of the\r\npredicates, clustering the salient spec predicates under their respective\r\n#$genlPreds; return the graph and any orphans (i.e. salient spec\r\npredicates whose #$genlPreds predicates where not members of the\r\nPREDICATES set\ngiven a set of PREDICATES and a DOMAIN-MT, construct a graph of the\npredicates, clustering the salient spec predicates under their respective\n#$genlPreds; return the graph and any orphans (i.e. salient spec\npredicates whose #$genlPreds predicates where not members of the\nPREDICATES set")
    public static SubLObject rkf_build_spec_predicate_graph(final SubLObject predicates, final SubLObject domain_mt) {
        return rkf_build_spec_predicate_graph_memoized(predicates, domain_mt);
    }

    public static final SubLObject rkf_build_spec_predicate_graph_memoized_internal_alt(SubLObject predicates, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_build_spec_predicate_graph_internal(predicates, domain_mt);
    }

    public static SubLObject rkf_build_spec_predicate_graph_memoized_internal(final SubLObject predicates, final SubLObject domain_mt) {
        return rkf_build_spec_predicate_graph_internal(predicates, domain_mt);
    }

    public static final SubLObject rkf_build_spec_predicate_graph_memoized_alt(SubLObject predicates, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicates.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicates, domain_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_build_spec_predicate_graph_memoized(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicates, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicates.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_build_spec_predicate_graph_memoized_internal(predicates, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicates, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_build_spec_predicate_graph_internal_alt(SubLObject predicates, SubLObject domain_mt) {
        {
            SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject orphans = NIL;
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.rkf_domain_examples.rkf_add_to_spec_predicate_graph(v_graph, predicate);
                if (NIL != com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicateP(predicate, domain_mt)) {
                    {
                        SubLObject superiors = genl_predicates.min_genl_predicates(predicate, domain_mt, UNPROVIDED);
                        if (NIL == superiors) {
                            orphans = cons(predicate, orphans);
                        } else {
                            {
                                SubLObject cdolist_list_var_1 = superiors;
                                SubLObject superior = NIL;
                                for (superior = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , superior = cdolist_list_var_1.first()) {
                                    com.cyc.cycjava.cycl.rkf_domain_examples.rkf_extend_spec_predicate_graph_entry(v_graph, superior, predicate);
                                }
                            }
                        }
                    }
                }
            }
            return values(v_graph, orphans);
        }
    }

    public static SubLObject rkf_build_spec_predicate_graph_internal(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLObject v_graph = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject orphans = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_add_to_spec_predicate_graph(v_graph, predicate);
            if (NIL != rkf_salient_spec_predicateP(predicate, domain_mt)) {
                final SubLObject superiors = genl_predicates.min_genl_predicates(predicate, domain_mt, UNPROVIDED);
                if (NIL == superiors) {
                    orphans = cons(predicate, orphans);
                } else {
                    SubLObject cdolist_list_var_$1 = superiors;
                    SubLObject superior = NIL;
                    superior = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        rkf_extend_spec_predicate_graph_entry(v_graph, superior, predicate);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        superior = cdolist_list_var_$1.first();
                    } 
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return values(v_graph, orphans);
    }

    /**
     * given a list of PREDICATES, a spec-predicate GRAPH constructed from
     * that set (or a superset) of predicates, a possibly empty list of
     * OPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES
     * of SPEC-PREDICATE-INFOs, i.e. lists of the form
     * (:NODE predicate (spec-predicate-infos)) that correctly cluster the
     * salient spec predicates under their #$genlPreds
     */
    @LispMethod(comment = "given a list of PREDICATES, a spec-predicate GRAPH constructed from\r\nthat set (or a superset) of predicates, a possibly empty list of\r\nOPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES\r\nof SPEC-PREDICATE-INFOs, i.e. lists of the form\r\n(:NODE predicate (spec-predicate-infos)) that correctly cluster the\r\nsalient spec predicates under their #$genlPreds\ngiven a list of PREDICATES, a spec-predicate GRAPH constructed from\nthat set (or a superset) of predicates, a possibly empty list of\nOPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES\nof SPEC-PREDICATE-INFOs, i.e. lists of the form\n(:NODE predicate (spec-predicate-infos)) that correctly cluster the\nsalient spec predicates under their #$genlPreds")
    public static final SubLObject rkf_interpret_spec_predicate_graph_alt(SubLObject predicates, SubLObject v_graph, SubLObject orphans, SubLObject domain_mt) {
        {
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = predicates;
                SubLObject predicate = NIL;
                for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.rkf_domain_examples.rkf_salient_spec_predicateP(predicate, domain_mt)) {
                        result = cons(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_obtain_spec_predicate_sub_graph(v_graph, predicate), result);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = nreverse(orphans);
                SubLObject orphan = NIL;
                for (orphan = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , orphan = cdolist_list_var.first()) {
                    result = cons(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_obtain_spec_predicate_sub_graph(v_graph, orphan), result);
                }
            }
            return nreverse(result);
        }
    }

    /**
     * given a list of PREDICATES, a spec-predicate GRAPH constructed from
     * that set (or a superset) of predicates, a possibly empty list of
     * OPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES
     * of SPEC-PREDICATE-INFOs, i.e. lists of the form
     * (:NODE predicate (spec-predicate-infos)) that correctly cluster the
     * salient spec predicates under their #$genlPreds
     */
    @LispMethod(comment = "given a list of PREDICATES, a spec-predicate GRAPH constructed from\r\nthat set (or a superset) of predicates, a possibly empty list of\r\nOPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES\r\nof SPEC-PREDICATE-INFOs, i.e. lists of the form\r\n(:NODE predicate (spec-predicate-infos)) that correctly cluster the\r\nsalient spec predicates under their #$genlPreds\ngiven a list of PREDICATES, a spec-predicate GRAPH constructed from\nthat set (or a superset) of predicates, a possibly empty list of\nOPRHANS and a DOMAIN-MT, construct a list in the order of PREDICATES\nof SPEC-PREDICATE-INFOs, i.e. lists of the form\n(:NODE predicate (spec-predicate-infos)) that correctly cluster the\nsalient spec predicates under their #$genlPreds")
    public static SubLObject rkf_interpret_spec_predicate_graph(final SubLObject predicates, final SubLObject v_graph, final SubLObject orphans, final SubLObject domain_mt) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == rkf_salient_spec_predicateP(predicate, domain_mt)) {
                result = cons(rkf_obtain_spec_predicate_sub_graph(v_graph, predicate), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        cdolist_list_var = nreverse(orphans);
        SubLObject orphan = NIL;
        orphan = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(rkf_obtain_spec_predicate_sub_graph(v_graph, orphan), result);
            cdolist_list_var = cdolist_list_var.rest();
            orphan = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static final SubLObject rkf_add_to_spec_predicate_graph_alt(SubLObject v_graph, SubLObject predicate) {
        if (NIL == dictionary.dictionary_lookup(v_graph, predicate, NIL)) {
            dictionary.dictionary_enter(v_graph, predicate, set.new_set(UNPROVIDED, UNPROVIDED));
        }
        return v_graph;
    }

    public static SubLObject rkf_add_to_spec_predicate_graph(final SubLObject v_graph, final SubLObject predicate) {
        if (NIL == dictionary.dictionary_lookup(v_graph, predicate, NIL)) {
            dictionary.dictionary_enter(v_graph, predicate, set.new_set(UNPROVIDED, UNPROVIDED));
        }
        return v_graph;
    }

    public static final SubLObject rkf_extend_spec_predicate_graph_entry_alt(SubLObject v_graph, SubLObject superior, SubLObject inferior) {
        com.cyc.cycjava.cycl.rkf_domain_examples.rkf_add_to_spec_predicate_graph(v_graph, superior);
        {
            SubLObject subgraph = dictionary.dictionary_lookup(v_graph, superior, UNPROVIDED);
            set.set_add(inferior, subgraph);
        }
        return v_graph;
    }

    public static SubLObject rkf_extend_spec_predicate_graph_entry(final SubLObject v_graph, final SubLObject superior, final SubLObject inferior) {
        rkf_add_to_spec_predicate_graph(v_graph, superior);
        final SubLObject subgraph = dictionary.dictionary_lookup(v_graph, superior, UNPROVIDED);
        set.set_add(inferior, subgraph);
        return v_graph;
    }

    public static final SubLObject rkf_obtain_spec_predicate_sub_graph_alt(SubLObject v_graph, SubLObject predicate) {
        {
            SubLObject subgraph = dictionary.dictionary_lookup(v_graph, predicate, UNPROVIDED);
            SubLObject sub_graph_expanded = NIL;
            if (NIL != set.set_emptyP(subgraph)) {
                return list($NODE, predicate);
            }
            {
                SubLObject set_contents_var = set.do_set_internal(subgraph);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                            sub_graph_expanded = cons(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_obtain_spec_predicate_sub_graph(v_graph, pred), sub_graph_expanded);
                        }
                    }
                }
            }
            return list($NODE, predicate, sub_graph_expanded);
        }
    }

    public static SubLObject rkf_obtain_spec_predicate_sub_graph(final SubLObject v_graph, final SubLObject predicate) {
        final SubLObject subgraph = dictionary.dictionary_lookup(v_graph, predicate, UNPROVIDED);
        SubLObject sub_graph_expanded = NIL;
        if (NIL != set.set_emptyP(subgraph)) {
            return list($NODE, predicate);
        }
        final SubLObject set_contents_var = set.do_set_internal(subgraph);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pred;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pred = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                sub_graph_expanded = cons(rkf_obtain_spec_predicate_sub_graph(v_graph, pred), sub_graph_expanded);
            }
        }
        return list($NODE, predicate, sub_graph_expanded);
    }

    /**
     * given a GRAPH of predicates and salient spec predicates, compute how
     * many predicates have salient spec predicates and return that count
     */
    @LispMethod(comment = "given a GRAPH of predicates and salient spec predicates, compute how\r\nmany predicates have salient spec predicates and return that count\ngiven a GRAPH of predicates and salient spec predicates, compute how\nmany predicates have salient spec predicates and return that count")
    public static final SubLObject rkf_count_spec_predicate_sub_graphs_alt(SubLObject v_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_graph));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject subgraph = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == set.set_emptyP(subgraph)) {
                            count = add(count, ONE_INTEGER);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return count;
            }
        }
    }

    /**
     * given a GRAPH of predicates and salient spec predicates, compute how
     * many predicates have salient spec predicates and return that count
     */
    @LispMethod(comment = "given a GRAPH of predicates and salient spec predicates, compute how\r\nmany predicates have salient spec predicates and return that count\ngiven a GRAPH of predicates and salient spec predicates, compute how\nmany predicates have salient spec predicates and return that count")
    public static SubLObject rkf_count_spec_predicate_sub_graphs(final SubLObject v_graph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_graph)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject predicate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subgraph = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == set.set_emptyP(subgraph)) {
                count = add(count, ONE_INTEGER);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }

    /**
     * Return a list of good example predicates for discussing TOPIC in DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of good example predicates for discussing TOPIC in DOMAIN-MT.")
    public static final SubLObject rkf_domain_example_predicates_alt(SubLObject topic, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_domain_example_predicates_internal(topic, domain_mt);
    }

    /**
     * Return a list of good example predicates for discussing TOPIC in DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of good example predicates for discussing TOPIC in DOMAIN-MT.")
    public static SubLObject rkf_domain_example_predicates(final SubLObject topic, final SubLObject domain_mt) {
        return rkf_domain_example_predicates_internal(topic, domain_mt);
    }

    /**
     * Return an example use of PREDICATE in DOMAIN-MT, or nil if not possible.
     */
    @LispMethod(comment = "Return an example use of PREDICATE in DOMAIN-MT, or nil if not possible.")
    public static final SubLObject rkf_predicate_example_sentence_alt(SubLObject predicate, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_all_predicate_example_sentences(predicate, domain_mt).first();
    }

    /**
     * Return an example use of PREDICATE in DOMAIN-MT, or nil if not possible.
     */
    @LispMethod(comment = "Return an example use of PREDICATE in DOMAIN-MT, or nil if not possible.")
    public static SubLObject rkf_predicate_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_example_sentences(predicate, domain_mt).first();
    }

    /**
     * Returns a list of example uses of PREDICATE in DOMAIN-MT, or nil if not possible.
     */
    @LispMethod(comment = "Returns a list of example uses of PREDICATE in DOMAIN-MT, or nil if not possible.")
    public static final SubLObject rkf_all_predicate_example_sentences_alt(SubLObject predicate, SubLObject domain_mt) {
        {
            SubLObject examples = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_all_predicate_specific_example_sentences(predicate, domain_mt);
            if (NIL == examples) {
                {
                    SubLObject generic_example = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_predicate_generic_example_sentence(predicate, domain_mt);
                    if (NIL != generic_example) {
                        examples = list(generic_example);
                    }
                }
            }
            return examples;
        }
    }

    /**
     * Returns a list of example uses of PREDICATE in DOMAIN-MT, or nil if not possible.
     */
    @LispMethod(comment = "Returns a list of example uses of PREDICATE in DOMAIN-MT, or nil if not possible.")
    public static SubLObject rkf_all_predicate_example_sentences(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject examples = rkf_all_predicate_specific_example_sentences(predicate, domain_mt);
        if (NIL == examples) {
            final SubLObject generic_example = rkf_predicate_generic_example_sentence(predicate, domain_mt);
            if (NIL != generic_example) {
                examples = list(generic_example);
            }
        }
        return examples;
    }

    /**
     * Return a list of good specific examples of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.
     */
    @LispMethod(comment = "Return a list of good specific examples of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.")
    public static final SubLObject rkf_all_predicate_specific_example_sentences_alt(SubLObject predicate, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_all_predicate_example_sentences_internal(predicate, domain_mt);
    }

    /**
     * Return a list of good specific examples of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.
     */
    @LispMethod(comment = "Return a list of good specific examples of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.")
    public static SubLObject rkf_all_predicate_specific_example_sentences(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_example_sentences_internal(predicate, domain_mt);
    }

    /**
     * Return a good specific example of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.
     */
    @LispMethod(comment = "Return a good specific example of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.")
    public static final SubLObject rkf_predicate_specific_example_sentence_alt(SubLObject predicate, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_all_predicate_specific_example_sentences(predicate, domain_mt).first();
    }

    /**
     * Return a good specific example of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.
     */
    @LispMethod(comment = "Return a good specific example of the use of PREDICATE in DOMAIN-MT, or nil if none can be found.")
    public static SubLObject rkf_predicate_specific_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_all_predicate_specific_example_sentences(predicate, domain_mt).first();
    }

    /**
     * Return a generic example of the use of PREDICATE in DOMAIN-MT, or nil if none can be computed.
     */
    @LispMethod(comment = "Return a generic example of the use of PREDICATE in DOMAIN-MT, or nil if none can be computed.")
    public static final SubLObject rkf_predicate_generic_example_sentence_alt(SubLObject predicate, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_predicate_generic_example_sentence_internal(predicate, domain_mt);
    }

    /**
     * Return a generic example of the use of PREDICATE in DOMAIN-MT, or nil if none can be computed.
     */
    @LispMethod(comment = "Return a generic example of the use of PREDICATE in DOMAIN-MT, or nil if none can be computed.")
    public static SubLObject rkf_predicate_generic_example_sentence(final SubLObject predicate, final SubLObject domain_mt) {
        return rkf_predicate_generic_example_sentence_internal(predicate, domain_mt);
    }

    public static final SubLObject rkf_domain_example_predicates_internal_alt(SubLObject topic, SubLObject domain_mt) {
        {
            SubLObject predicates = backward.removal_ask_variable($PREDICATE, $list_alt6, domain_mt, UNPROVIDED, UNPROVIDED);
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                if (NIL != fort_types_interface.predicateP(predicate)) {
                    v_answer = cons(predicate, v_answer);
                }
            }
            return nreverse(v_answer);
        }
    }

    public static SubLObject rkf_domain_example_predicates_internal(final SubLObject topic, final SubLObject domain_mt) {
        final SubLObject predicates = backward.removal_ask_variable($PREDICATE, $list5, domain_mt, UNPROVIDED, UNPROVIDED);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fort_types_interface.predicateP(predicate)) {
                v_answer = cons(predicate, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }

    public static final SubLObject rkf_all_predicate_example_sentences_internal_alt(SubLObject predicate, SubLObject domain_mt) {
        {
            SubLObject candidate_sentences = backward.removal_ask_variable($SENTENCE, listS($$domainExamplePredSentences, predicate, $list_alt9), domain_mt, UNPROVIDED, UNPROVIDED);
            if (NIL == candidate_sentences) {
                candidate_sentences = backward.removal_ask_variable($SENTENCE, listS($$examplePredSentences, predicate, $list_alt9), domain_mt, UNPROVIDED, UNPROVIDED);
            }
            {
                SubLObject example_sentences = NIL;
                SubLObject cdolist_list_var = candidate_sentences;
                SubLObject candidate_sentence = NIL;
                for (candidate_sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_sentence = cdolist_list_var.first()) {
                    if (predicate == cycl_utilities.formula_operator(candidate_sentence)) {
                        example_sentences = cons(candidate_sentence, example_sentences);
                    }
                }
                return nreverse(example_sentences);
            }
        }
    }

    public static SubLObject rkf_all_predicate_example_sentences_internal(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject candidate_sentences = backward.removal_ask_variable($SENTENCE, listS($$domainExamplePredSentences, predicate, $list8), domain_mt, UNPROVIDED, UNPROVIDED);
        if (NIL == candidate_sentences) {
            candidate_sentences = backward.removal_ask_variable($SENTENCE, listS($$examplePredSentences, predicate, $list8), domain_mt, UNPROVIDED, UNPROVIDED);
        }
        SubLObject example_sentences = NIL;
        SubLObject cdolist_list_var = candidate_sentences;
        SubLObject candidate_sentence = NIL;
        candidate_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (predicate.eql(cycl_utilities.formula_operator(candidate_sentence))) {
                example_sentences = cons(candidate_sentence, example_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_sentence = cdolist_list_var.first();
        } 
        return nreverse(example_sentences);
    }

    public static final SubLObject rkf_predicate_generic_example_sentence_internal_alt(SubLObject predicate, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                template = rkf_predicate_creator.generic_relation_template(predicate);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
                if (NIL != template) {
                    {
                        SubLObject cdotimes_end_var = formula_arity(template, UNPROVIDED);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            {
                                SubLObject arg = add(i, ONE_INTEGER);
                                thread.resetMultipleValues();
                                {
                                    SubLObject collection = com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized(predicate, arg, domain_mt);
                                    SubLObject constraint = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject replacement = NIL;
                                        SubLObject pcase_var = constraint;
                                        if (pcase_var.eql($$argIsa)) {
                                            replacement = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_generic_example_for_collection(collection);
                                        } else {
                                            if (pcase_var.eql($$argGenl)) {
                                                replacement = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_generic_spec_for_collection(collection);
                                            }
                                        }
                                        set_nth(arg, template, replacement);
                                    }
                                }
                            }
                        }
                    }
                }
                return template;
            }
        }
    }

    public static SubLObject rkf_predicate_generic_example_sentence_internal(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    template = rkf_predicate_creator.generic_relation_template(predicate);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != template) {
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject arg;
            SubLObject collection;
            SubLObject constraint;
            SubLObject replacement;
            SubLObject pcase_var;
            for (cdotimes_end_var = formula_arity(template, UNPROVIDED), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                arg = add(i, ONE_INTEGER);
                thread.resetMultipleValues();
                collection = relation_most_restricted_arg_constraint_memoized(predicate, arg, domain_mt);
                constraint = thread.secondMultipleValue();
                thread.resetMultipleValues();
                replacement = NIL;
                pcase_var = constraint;
                if (pcase_var.eql($$argIsa)) {
                    replacement = rkf_generic_example_for_collection(collection);
                } else
                    if (pcase_var.eql($$argGenl)) {
                        replacement = rkf_generic_spec_for_collection(collection);
                    }

                set_nth(arg, template, replacement);
            }
        }
        return template;
    }

    public static final SubLObject rkf_generic_example_for_collection_alt(SubLObject collection) {
        if (NIL != specs_fn_naut_p(collection)) {
            return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_generic_spec_for_collection(specs_fn_arg(collection));
        } else {
            return make_unary_formula($$SomeExampleFn, collection);
        }
    }

    public static SubLObject rkf_generic_example_for_collection(final SubLObject collection) {
        if (NIL != specs_fn_naut_p(collection)) {
            return rkf_generic_spec_for_collection(specs_fn_arg(collection));
        }
        return make_unary_formula($$SomeExampleFn, collection);
    }

    public static final SubLObject rkf_generic_spec_for_collection_alt(SubLObject collection) {
        return make_unary_formula($$SomeExampleSpecFn, collection);
    }

    public static SubLObject rkf_generic_spec_for_collection(final SubLObject collection) {
        return make_unary_formula($$SomeExampleSpecFn, collection);
    }

    public static final SubLObject rkf_generic_example_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && ((cycl_utilities.nat_functor(v_object) == $$SomeExampleFn) || (cycl_utilities.nat_functor(v_object) == $$SomeExampleSpecFn)));
    }

    public static SubLObject rkf_generic_example_p(final SubLObject v_object) {
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (cycl_utilities.nat_functor(v_object).eql($$SomeExampleFn) || cycl_utilities.nat_functor(v_object).eql($$SomeExampleSpecFn)));
    }

    public static final SubLObject rkf_generic_example_instance_level_p_alt(SubLObject generic_example) {
        SubLTrampolineFile.checkType(generic_example, RKF_GENERIC_EXAMPLE_P);
        return eq(cycl_utilities.nat_functor(generic_example), $$SomeExampleFn);
    }

    public static SubLObject rkf_generic_example_instance_level_p(final SubLObject generic_example) {
        assert NIL != rkf_generic_example_p(generic_example) : "! rkf_domain_examples.rkf_generic_example_p(generic_example) " + ("rkf_domain_examples.rkf_generic_example_p(generic_example) " + "CommonSymbols.NIL != rkf_domain_examples.rkf_generic_example_p(generic_example) ") + generic_example;
        return eq(cycl_utilities.nat_functor(generic_example), $$SomeExampleFn);
    }

    /**
     * Memoized version of RELATION-MOST-RESTRICTED-ARG-CONSTRAINT
     */
    @LispMethod(comment = "Memoized version of RELATION-MOST-RESTRICTED-ARG-CONSTRAINT")
    public static final SubLObject relation_most_restricted_arg_constraint_memoized_internal_alt(SubLObject predicate, SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        return relationship_generality_estimates.relation_most_restricted_arg_constraint(predicate, argnum, domain_mt);
    }

    /**
     * Memoized version of RELATION-MOST-RESTRICTED-ARG-CONSTRAINT
     */
    @LispMethod(comment = "Memoized version of RELATION-MOST-RESTRICTED-ARG-CONSTRAINT")
    public static SubLObject relation_most_restricted_arg_constraint_memoized_internal(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        return relationship_generality_estimates.relation_most_restricted_arg_constraint(predicate, argnum, domain_mt);
    }

    public static final SubLObject relation_most_restricted_arg_constraint_memoized_alt(SubLObject predicate, SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, THREE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, domain_mt);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (predicate.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (argnum.eql(cached_args.first())) {
                                            cached_args = cached_args.rest();
                                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                                return memoization_state.caching_results(results2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, argnum, domain_mt));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject relation_most_restricted_arg_constraint_memoized(final SubLObject predicate, final SubLObject argnum, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, THREE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(relation_most_restricted_arg_constraint_memoized_internal(predicate, argnum, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, argnum, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject min_arity_memoized_internal_alt(SubLObject relation) {
        return arity.min_arity(relation);
    }

    public static SubLObject min_arity_memoized_internal(final SubLObject relation) {
        return arity.min_arity(relation);
    }

    public static final SubLObject min_arity_memoized_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_domain_examples.min_arity_memoized_internal(relation);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MIN_ARITY_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MIN_ARITY_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, MIN_ARITY_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw1$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.min_arity_memoized_internal(relation)));
                        memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject min_arity_memoized(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return min_arity_memoized_internal(relation);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MIN_ARITY_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MIN_ARITY_MEMOIZED, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MIN_ARITY_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(min_arity_memoized_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Return a list of strings that constitute a set of indicators for the PREDICATE.
     */
    @LispMethod(comment = "Return a list of strings that constitute a set of indicators for the PREDICATE.")
    public static final SubLObject rkf_predicate_indicators_alt(SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        {
            SubLObject template = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            template = rkf_predicate_creator.generic_relation_template(predicate);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL != template) {
                {
                    SubLObject generic_phrase = rkf_sentence_communicator.rkf_sentence_phrase(template, generation_mt, domain_mt, UNPROVIDED);
                    SubLObject cdolist_list_var = cycl_utilities.formula_args(template, UNPROVIDED);
                    SubLObject generic_arg = NIL;
                    for (generic_arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , generic_arg = cdolist_list_var.first()) {
                        {
                            SubLObject term_phrase = rkf_concept_communicator.rkf_term_phrase(generic_arg, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                            generic_phrase = string_utilities.string_substitute($str_alt20$_, term_phrase, generic_phrase, UNPROVIDED);
                        }
                    }
                    {
                        SubLObject tokens = rkf_concept_harvester.rkf_ch_raw_tokenization(generic_phrase);
                        return tokens;
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return a list of strings that constitute a set of indicators for the PREDICATE.
     */
    @LispMethod(comment = "Return a list of strings that constitute a set of indicators for the PREDICATE.")
    public static SubLObject rkf_predicate_indicators(final SubLObject predicate, SubLObject generation_mt, SubLObject domain_mt) {
        if (generation_mt == UNPROVIDED) {
            generation_mt = NIL;
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    template = rkf_predicate_creator.generic_relation_template(predicate);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != template) {
            SubLObject generic_phrase = rkf_sentence_communicator.rkf_sentence_phrase(template, generation_mt, domain_mt, UNPROVIDED);
            SubLObject cdolist_list_var = cycl_utilities.formula_args(template, UNPROVIDED);
            SubLObject generic_arg = NIL;
            generic_arg = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject term_phrase = rkf_concept_communicator.rkf_term_phrase(generic_arg, generation_mt, domain_mt, UNPROVIDED, UNPROVIDED);
                generic_phrase = string_utilities.string_substitute($$$_, term_phrase, generic_phrase, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                generic_arg = cdolist_list_var.first();
            } 
            final SubLObject tokens = rkf_concept_harvester.rkf_ch_raw_tokenization(generic_phrase);
            return tokens;
        }
        return NIL;
    }

    public static final SubLObject rkf_predicate_indicators_match_score_alt(SubLObject phrase, SubLObject indicators) {
        {
            SubLObject phrase_tokens = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_ch_raw_tokenization_memoized(phrase);
            SubLObject score = ZERO_INTEGER;
            SubLObject cdolist_list_var = phrase_tokens;
            SubLObject phrase_token = NIL;
            for (phrase_token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase_token = cdolist_list_var.first()) {
                if (NIL != find(phrase_token, indicators, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    score = add(score, ONE_INTEGER);
                }
            }
            return score;
        }
    }

    public static SubLObject rkf_predicate_indicators_match_score(final SubLObject phrase, final SubLObject indicators) {
        final SubLObject phrase_tokens = rkf_ch_raw_tokenization_memoized(phrase);
        SubLObject score = ZERO_INTEGER;
        SubLObject cdolist_list_var = phrase_tokens;
        SubLObject phrase_token = NIL;
        phrase_token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != find(phrase_token, indicators, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                score = add(score, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase_token = cdolist_list_var.first();
        } 
        return score;
    }

    public static final SubLObject rkf_ch_raw_tokenization_memoized_internal_alt(SubLObject string) {
        return rkf_concept_harvester.rkf_ch_raw_tokenization(string);
    }

    public static SubLObject rkf_ch_raw_tokenization_memoized_internal(final SubLObject string) {
        return rkf_concept_harvester.rkf_ch_raw_tokenization(string);
    }

    public static final SubLObject rkf_ch_raw_tokenization_memoized_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_ch_raw_tokenization_memoized_internal(string);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_CH_RAW_TOKENIZATION_MEMOIZED, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_CH_RAW_TOKENIZATION_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RKF_CH_RAW_TOKENIZATION_MEMOIZED, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw1$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_ch_raw_tokenization_memoized_internal(string)));
                        memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rkf_ch_raw_tokenization_memoized(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rkf_ch_raw_tokenization_memoized_internal(string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RKF_CH_RAW_TOKENIZATION_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RKF_CH_RAW_TOKENIZATION_MEMOIZED, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RKF_CH_RAW_TOKENIZATION_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rkf_ch_raw_tokenization_memoized_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Suggest matches for predicates which are applicable to TERM in DOMAIN-MT.
     * If HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.
     * Returns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that
     * TERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).
     */
    @LispMethod(comment = "Suggest matches for predicates which are applicable to TERM in DOMAIN-MT.\r\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\r\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\r\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).\nSuggest matches for predicates which are applicable to TERM in DOMAIN-MT.\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).")
    public static final SubLObject rkf_predicate_suggestor_matches_alt(SubLObject v_term, SubLObject domain_mt, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_isa = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(v_term, domain_mt, UNPROVIDED), $ASCENDING);
                SubLObject all_genls = (NIL != subl_promotions.memberP($$Collection, all_isa, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (cardinality_estimates.sort_by_generality_estimate(genls.all_genls(v_term, domain_mt, UNPROVIDED), $ASCENDING))) : NIL;
                if (NIL != horizon) {
                    {
                        SubLObject horizon_generality = cardinality_estimates.generality_estimate(horizon);
                        all_isa = delete(horizon_generality, all_isa, symbol_function($sym24$_), symbol_function(GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        all_genls = delete(horizon_generality, all_genls, symbol_function($sym24$_), symbol_function(GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                {
                    SubLObject matches = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(domain_mt, thread);
                            if (NIL != all_isa) {
                                {
                                    SubLObject constraint = $$argIsa;
                                    SubLObject message = format(NIL, $str_alt27$identifying__S_matches, constraint);
                                    SubLObject list_var = all_isa;
                                    $progress_note$.setDynamicValue(message, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_2 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject collection = NIL;
                                                for (collection = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != forts.fort_p(collection)) {
                                                        {
                                                            SubLObject pred_var = constraint;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var);
                                                                    SubLObject done_var = NIL;
                                                                    SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        {
                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                            if (NIL != valid) {
                                                                                {
                                                                                    SubLObject final_index_iterator = NIL;
                                                                                    try {
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_4 = NIL;
                                                                                            SubLObject token_var_5 = NIL;
                                                                                            while (NIL == done_var_4) {
                                                                                                {
                                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_5);
                                                                                                    SubLObject valid_6 = makeBoolean(token_var_5 != ass);
                                                                                                    if (NIL != valid_6) {
                                                                                                        {
                                                                                                            SubLObject predicate = assertions_high.gaf_arg(ass, ONE_INTEGER);
                                                                                                            SubLObject argnum = assertions_high.gaf_arg(ass, TWO_INTEGER);
                                                                                                            if (NIL != fort_types_interface.predicateP(predicate)) {
                                                                                                                if (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    {
                                                                                                                        SubLObject collection_7 = com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                                                                                        SubLObject constraint_8 = thread.secondMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        matches = cons(list(predicate, argnum, constraint_8, collection_7), matches);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_4 = makeBoolean(NIL == valid_6);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_9, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean(NIL == valid);
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_3, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            }
                            if (NIL != all_genls) {
                                {
                                    SubLObject constraint = $$argGenl;
                                    SubLObject message = format(NIL, $str_alt27$identifying__S_matches, constraint);
                                    SubLObject list_var = all_genls;
                                    $progress_note$.setDynamicValue(message, thread);
                                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                    $progress_total$.setDynamicValue(length(list_var), thread);
                                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                    {
                                        SubLObject _prev_bind_0_10 = $last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1_11 = $last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                            $within_noting_percent_progress$.bind(T, thread);
                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                            {
                                                SubLObject csome_list_var = list_var;
                                                SubLObject collection = NIL;
                                                for (collection = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                    if (NIL != forts.fort_p(collection)) {
                                                        {
                                                            SubLObject pred_var = constraint;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var);
                                                                    SubLObject done_var = NIL;
                                                                    SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        {
                                                                            SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                            if (NIL != valid) {
                                                                                {
                                                                                    SubLObject final_index_iterator = NIL;
                                                                                    try {
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                        {
                                                                                            SubLObject done_var_12 = NIL;
                                                                                            SubLObject token_var_13 = NIL;
                                                                                            while (NIL == done_var_12) {
                                                                                                {
                                                                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_13);
                                                                                                    SubLObject valid_14 = makeBoolean(token_var_13 != ass);
                                                                                                    if (NIL != valid_14) {
                                                                                                        {
                                                                                                            SubLObject predicate = assertions_high.gaf_arg(ass, ONE_INTEGER);
                                                                                                            SubLObject argnum = assertions_high.gaf_arg(ass, TWO_INTEGER);
                                                                                                            if (NIL != fort_types_interface.predicateP(predicate)) {
                                                                                                                if (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    {
                                                                                                                        SubLObject collection_15 = com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                                                                                        SubLObject constraint_16 = thread.secondMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        matches = cons(list(predicate, argnum, constraint_16, collection_15), matches);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    done_var_12 = makeBoolean(NIL == valid_14);
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_17, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean(NIL == valid);
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            noting_percent_progress_postamble();
                                        } finally {
                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_11, thread);
                                            $last_percent_progress_index$.rebind(_prev_bind_0_10, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    matches = list_utilities.fast_delete_duplicates(matches, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return matches;
                }
            }
        }
    }

    /**
     * Suggest matches for predicates which are applicable to TERM in DOMAIN-MT.
     * If HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.
     * Returns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that
     * TERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).
     */
    @LispMethod(comment = "Suggest matches for predicates which are applicable to TERM in DOMAIN-MT.\r\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\r\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\r\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).\nSuggest matches for predicates which are applicable to TERM in DOMAIN-MT.\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).")
    public static SubLObject rkf_predicate_suggestor_matches(final SubLObject v_term, final SubLObject domain_mt, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_isa = cardinality_estimates.sort_by_generality_estimate(isa.all_isa(v_term, domain_mt, UNPROVIDED), $ASCENDING);
        SubLObject all_genls = (NIL != subl_promotions.memberP($$Collection, all_isa, UNPROVIDED, UNPROVIDED)) ? cardinality_estimates.sort_by_generality_estimate(genls.all_genls(v_term, domain_mt, UNPROVIDED), $ASCENDING) : NIL;
        if (NIL != horizon) {
            final SubLObject horizon_generality = cardinality_estimates.generality_estimate(horizon);
            all_isa = delete(horizon_generality, all_isa, symbol_function($sym23$_), symbol_function(GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            all_genls = delete(horizon_generality, all_genls, symbol_function($sym23$_), symbol_function(GENERALITY_ESTIMATE), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject matches = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            if (NIL != all_isa) {
                final SubLObject constraint = $$argIsa;
                final SubLObject message = format(NIL, $str26$identifying__S_matches, constraint);
                final SubLObject list_var = all_isa;
                final SubLObject _prev_bind_0_$2 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$3 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject collection = NIL;
                        collection = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != forts.fort_p(collection)) {
                                final SubLObject pred_var = constraint;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$4 = NIL;
                                                final SubLObject token_var_$5 = NIL;
                                                while (NIL == done_var_$4) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                                    final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                                    if (NIL != valid_$6) {
                                                        final SubLObject predicate = assertions_high.gaf_arg(ass, ONE_INTEGER);
                                                        final SubLObject argnum = assertions_high.gaf_arg(ass, TWO_INTEGER);
                                                        if ((NIL != fort_types_interface.predicateP(predicate)) && (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt))) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject collection_$7 = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                            final SubLObject constraint_$8 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            matches = cons(list(predicate, argnum, constraint_$8, collection_$7), matches);
                                                        }
                                                    }
                                                    done_var_$4 = makeBoolean(NIL == valid_$6);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$3, thread);
                    $progress_note$.rebind(_prev_bind_0_$2, thread);
                }
            }
            if (NIL != all_genls) {
                final SubLObject constraint = $$argGenl;
                final SubLObject message = format(NIL, $str26$identifying__S_matches, constraint);
                final SubLObject list_var = all_genls;
                final SubLObject _prev_bind_0_$5 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != message ? message : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject collection = NIL;
                        collection = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != forts.fort_p(collection)) {
                                final SubLObject pred_var = constraint;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(collection, THREE_INTEGER, pred_var)) {
                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(collection, THREE_INTEGER, pred_var);
                                    SubLObject done_var = NIL;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$5 = NIL;
                                                final SubLObject token_var_$6 = NIL;
                                                while (NIL == done_var_$5) {
                                                    final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(ass));
                                                    if (NIL != valid_$7) {
                                                        final SubLObject predicate = assertions_high.gaf_arg(ass, ONE_INTEGER);
                                                        final SubLObject argnum = assertions_high.gaf_arg(ass, TWO_INTEGER);
                                                        if ((NIL != fort_types_interface.predicateP(predicate)) && (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt))) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject collection_$8 = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                            final SubLObject constraint_$9 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            matches = cons(list(predicate, argnum, constraint_$9, collection_$8), matches);
                                                        }
                                                    }
                                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values3 = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values3);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    } 
                                }
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values4 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values4);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$4, thread);
                    $progress_note$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        matches = list_utilities.fast_delete_duplicates(matches, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return matches;
    }

    /**
     * Select from PREDICATES those which are applicable to TERM in DOMAIN-MT.
     * If HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.
     * Returns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that
     * TERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).
     */
    @LispMethod(comment = "Select from PREDICATES those which are applicable to TERM in DOMAIN-MT.\r\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\r\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\r\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).\nSelect from PREDICATES those which are applicable to TERM in DOMAIN-MT.\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).")
    public static final SubLObject rkf_predicate_selector_matches_alt(SubLObject v_term, SubLObject domain_mt, SubLObject predicates, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject horizon_generality_estimate = (NIL != horizon) ? ((SubLObject) (cardinality_estimates.generality_estimate(horizon))) : NIL;
                SubLObject matches = NIL;
                SubLObject list_var = predicates;
                $progress_note$.setDynamicValue($$$identifying_matches, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject predicate = NIL;
                            for (predicate = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject v_arity = com.cyc.cycjava.cycl.rkf_domain_examples.min_arity_memoized(predicate);
                                    if (NIL != v_arity) {
                                        {
                                            SubLObject i = NIL;
                                            for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                                {
                                                    SubLObject argnum = add(ONE_INTEGER, i);
                                                    if (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject collection = com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                                            SubLObject constraint = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (!((NIL != horizon_generality_estimate) && cardinality_estimates.generality_estimate(collection).numG(horizon_generality_estimate))) {
                                                                matches = cons(list(predicate, argnum, constraint, collection), matches);
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
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return matches;
            }
        }
    }

    @LispMethod(comment = "Select from PREDICATES those which are applicable to TERM in DOMAIN-MT.\r\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\r\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\r\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).\nSelect from PREDICATES those which are applicable to TERM in DOMAIN-MT.\nIf HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.\nReturns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that\nTERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).")
    public static SubLObject rkf_predicate_selector_matches(final SubLObject v_term, final SubLObject domain_mt, final SubLObject predicates, SubLObject horizon) {
        if (horizon == UNPROVIDED) {
            horizon = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject horizon_generality_estimate = (NIL != horizon) ? cardinality_estimates.generality_estimate(horizon) : NIL;
        SubLObject matches = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$identifying_matches, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(predicates), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = NIL;
                predicate = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject v_arity = min_arity_memoized(predicate);
                    if (NIL != v_arity) {
                        SubLObject i;
                        SubLObject argnum;
                        SubLObject collection;
                        SubLObject constraint;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                            argnum = add(ONE_INTEGER, i);
                            if (NIL != at_admitted.admitted_argumentP(v_term, argnum, predicate, domain_mt)) {
                                thread.resetMultipleValues();
                                collection = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                constraint = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL == horizon_generality_estimate) || (!cardinality_estimates.generality_estimate(collection).numG(horizon_generality_estimate))) {
                                    matches = cons(list(predicate, argnum, constraint, collection), matches);
                                }
                            }
                        }
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return matches;
    }/**
     * Select from PREDICATES those which are applicable to TERM in DOMAIN-MT.
     * If HORIZON is provided, matches based on a constraint more general than HORIZON are ignored.
     * Returns a list of (PREDICATE ARGNUM CONSTRAINT COLLECTION) tuples indicating that
     * TERM satisfies the constraint (CONSTRAINT PREDICATE ARGNUM COLLECTION).
     */


    /**
     * Converts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where
     * PREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list
     * of argument positions.  Furthermore
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general
     * (c) ARGNUMS are sorted in numeric order.
     */
    @LispMethod(comment = "Converts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where\r\nPREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list\r\nof argument positions.  Furthermore\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general\r\n(c) ARGNUMS are sorted in numeric order.\nConverts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where\nPREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list\nof argument positions.  Furthermore\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general\n(c) ARGNUMS are sorted in numeric order.")
    public static final SubLObject rkf_organize_predicate_matches_by_collection_alt(SubLObject matches) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(matches, LISTP);
            matches = list_utilities.sort_via_position(matches, $list_alt32, symbol_function(EQL), symbol_function(THIRD));
            matches = Sort.stable_sort(matches, symbol_function($sym24$_), symbol_function(SECOND));
            matches = Sort.stable_sort(matches, symbol_function($sym35$RELATION_GENERALITY_ESTIMATE_), symbol_function(FIRST));
            matches = Sort.stable_sort(matches, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FOURTH));
            {
                SubLObject last_match = $list_alt39;
                SubLObject args = NIL;
                SubLObject preds = NIL;
                SubLObject cols = NIL;
                SubLObject list_var = matches;
                $progress_note$.setDynamicValue($$$organizing_matches, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject this_match = NIL;
                            for (this_match = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , this_match = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject datum = last_match;
                                    SubLObject current = datum;
                                    SubLObject last_pred = NIL;
                                    SubLObject last_arg = NIL;
                                    SubLObject last_constraint = NIL;
                                    SubLObject last_col = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt41);
                                    last_pred = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt41);
                                    last_arg = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt41);
                                    last_constraint = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt41);
                                    last_col = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        {
                                            SubLObject datum_18 = this_match;
                                            SubLObject current_19 = datum_18;
                                            SubLObject this_pred = NIL;
                                            SubLObject this_arg = NIL;
                                            SubLObject this_constraint = NIL;
                                            SubLObject this_col = NIL;
                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt42);
                                            this_pred = current_19.first();
                                            current_19 = current_19.rest();
                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt42);
                                            this_arg = current_19.first();
                                            current_19 = current_19.rest();
                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt42);
                                            this_constraint = current_19.first();
                                            current_19 = current_19.rest();
                                            destructuring_bind_must_consp(current_19, datum_18, $list_alt42);
                                            this_col = current_19.first();
                                            current_19 = current_19.rest();
                                            if (NIL == current_19) {
                                                if (last_col.equal(this_col)) {
                                                    if (last_pred.equal(this_pred)) {
                                                        args = cons(this_arg, args);
                                                    } else {
                                                        args = nreverse(args);
                                                        preds = cons(list(last_pred, args), preds);
                                                        args = NIL;
                                                        args = cons(this_arg, args);
                                                    }
                                                } else {
                                                    args = nreverse(args);
                                                    preds = cons(list(last_pred, args), preds);
                                                    args = NIL;
                                                    preds = nreverse(preds);
                                                    cols = cons(list(last_col, preds), cols);
                                                    preds = NIL;
                                                    args = cons(this_arg, args);
                                                }
                                                last_match = this_match;
                                            } else {
                                                cdestructuring_bind_error(datum_18, $list_alt42);
                                            }
                                        }
                                    } else {
                                        cdestructuring_bind_error(datum, $list_alt41);
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject datum = last_match;
                    SubLObject current = datum;
                    SubLObject last_pred = NIL;
                    SubLObject last_arg = NIL;
                    SubLObject last_constraint = NIL;
                    SubLObject last_col = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    last_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    last_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    last_constraint = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt41);
                    last_col = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        args = nreverse(args);
                        preds = cons(list(last_pred, args), preds);
                        args = NIL;
                        preds = nreverse(preds);
                        cols = cons(list(last_col, preds), cols);
                        preds = NIL;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt41);
                    }
                }
                cols = nreverse(cols);
                return cols.rest();
            }
        }
    }

    @LispMethod(comment = "Converts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where\r\nPREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list\r\nof argument positions.  Furthermore\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general\r\n(c) ARGNUMS are sorted in numeric order.\nConverts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where\nPREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list\nof argument positions.  Furthermore\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general\n(c) ARGNUMS are sorted in numeric order.")
    public static SubLObject rkf_organize_predicate_matches_by_collection(SubLObject matches) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(matches) : "! listp(matches) " + ("Types.listp(matches) " + "CommonSymbols.NIL != Types.listp(matches) ") + matches;
        matches = list_utilities.sort_via_position(matches, $list32, symbol_function(EQL), symbol_function(THIRD));
        matches = Sort.stable_sort(matches, symbol_function($sym23$_), symbol_function(SECOND));
        matches = Sort.stable_sort(matches, symbol_function($sym35$RELATION_GENERALITY_ESTIMATE_), symbol_function(FIRST));
        matches = Sort.stable_sort(matches, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FOURTH));
        SubLObject last_match = $list39;
        SubLObject args = NIL;
        SubLObject preds = NIL;
        SubLObject cols = NIL;
        final SubLObject list_var = matches;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$organizing_matches, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject this_match = NIL;
                this_match = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = last_match;
                    SubLObject last_pred = NIL;
                    SubLObject last_arg = NIL;
                    SubLObject last_constraint = NIL;
                    SubLObject last_col = NIL;
                    destructuring_bind_must_consp(current, datum, $list41);
                    last_pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list41);
                    last_arg = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list41);
                    last_constraint = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list41);
                    last_col = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject current_$22;
                        final SubLObject datum_$21 = current_$22 = this_match;
                        SubLObject this_pred = NIL;
                        SubLObject this_arg = NIL;
                        SubLObject this_constraint = NIL;
                        SubLObject this_col = NIL;
                        destructuring_bind_must_consp(current_$22, datum_$21, $list42);
                        this_pred = current_$22.first();
                        current_$22 = current_$22.rest();
                        destructuring_bind_must_consp(current_$22, datum_$21, $list42);
                        this_arg = current_$22.first();
                        current_$22 = current_$22.rest();
                        destructuring_bind_must_consp(current_$22, datum_$21, $list42);
                        this_constraint = current_$22.first();
                        current_$22 = current_$22.rest();
                        destructuring_bind_must_consp(current_$22, datum_$21, $list42);
                        this_col = current_$22.first();
                        current_$22 = current_$22.rest();
                        if (NIL == current_$22) {
                            if (last_col.equal(this_col)) {
                                if (last_pred.equal(this_pred)) {
                                    args = cons(this_arg, args);
                                } else {
                                    args = nreverse(args);
                                    preds = cons(list(last_pred, args), preds);
                                    args = NIL;
                                    args = cons(this_arg, args);
                                }
                            } else {
                                args = nreverse(args);
                                preds = cons(list(last_pred, args), preds);
                                args = NIL;
                                preds = nreverse(preds);
                                cols = cons(list(last_col, preds), cols);
                                preds = NIL;
                                args = cons(this_arg, args);
                            }
                            last_match = this_match;
                        } else {
                            cdestructuring_bind_error(datum_$21, $list42);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list41);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    this_match = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject current2;
        final SubLObject datum2 = current2 = last_match;
        SubLObject last_pred2 = NIL;
        SubLObject last_arg2 = NIL;
        SubLObject last_constraint2 = NIL;
        SubLObject last_col2 = NIL;
        destructuring_bind_must_consp(current2, datum2, $list41);
        last_pred2 = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list41);
        last_arg2 = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list41);
        last_constraint2 = current2.first();
        current2 = current2.rest();
        destructuring_bind_must_consp(current2, datum2, $list41);
        last_col2 = current2.first();
        current2 = current2.rest();
        if (NIL == current2) {
            args = nreverse(args);
            preds = cons(list(last_pred2, args), preds);
            args = NIL;
            preds = nreverse(preds);
            cols = cons(list(last_col2, preds), cols);
            preds = NIL;
        } else {
            cdestructuring_bind_error(datum2, $list41);
        }
        cols = nreverse(cols);
        return cols.rest();
    }/**
     * Converts MATCHES into an organized list of (COL PREDICATE-INFO) tuples, where
     * PREDICATE-INFO is a list of (PREDICATE ARGNUMS) tuples, where ARGNUMS is a list
     * of argument positions.  Furthermore
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATE-INFO tuples are sorted by relation-generality-estimate, from specific to general
     * (c) ARGNUMS are sorted in numeric order.
     */


    public static final SubLObject rkf_organize_predicate_matches_by_mt_alt(SubLObject matches) {
        {
            SubLObject predicates = NIL;
            SubLObject cdolist_list_var = matches;
            SubLObject match = NIL;
            for (match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match = cdolist_list_var.first()) {
                predicates = cons(match.first(), predicates);
            }
            predicates = list_utilities.fast_delete_duplicates(predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_organize_predicates_by_mt(predicates);
        }
    }

    public static SubLObject rkf_organize_predicate_matches_by_mt(final SubLObject matches) {
        SubLObject predicates = NIL;
        SubLObject cdolist_list_var = matches;
        SubLObject match = NIL;
        match = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            predicates = cons(match.first(), predicates);
            cdolist_list_var = cdolist_list_var.rest();
            match = cdolist_list_var.first();
        } 
        predicates = list_utilities.fast_delete_duplicates(predicates, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return rkf_organize_predicates_by_mt(predicates);
    }

    /**
     * Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where
     * COL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general
     */
    @LispMethod(comment = "Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\r\nCOL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\nCOL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general")
    public static final SubLObject rkf_organize_predicates_by_specificity_to_term_alt(SubLObject predicates, SubLObject v_term, SubLObject domain_mt) {
        {
            SubLObject matches = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_predicate_selector_matches(v_term, domain_mt, predicates, UNPROVIDED);
            SubLObject match_sections = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_organize_predicate_matches_by_collection(matches);
            SubLObject v_answer = NIL;
            SubLObject cdolist_list_var = match_sections;
            SubLObject match_section = NIL;
            for (match_section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , match_section = cdolist_list_var.first()) {
                {
                    SubLObject datum = match_section;
                    SubLObject current = datum;
                    SubLObject collection = NIL;
                    SubLObject match_predicate_sections = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    collection = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    match_predicate_sections = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        {
                            SubLObject predicates_20 = NIL;
                            SubLObject cdolist_list_var_21 = match_predicate_sections;
                            SubLObject match_predicate_section = NIL;
                            for (match_predicate_section = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , match_predicate_section = cdolist_list_var_21.first()) {
                                {
                                    SubLObject datum_22 = match_predicate_section;
                                    SubLObject current_23 = datum_22;
                                    SubLObject predicate = NIL;
                                    SubLObject argnum_list = NIL;
                                    destructuring_bind_must_consp(current_23, datum_22, $list_alt44);
                                    predicate = current_23.first();
                                    current_23 = current_23.rest();
                                    destructuring_bind_must_consp(current_23, datum_22, $list_alt44);
                                    argnum_list = current_23.first();
                                    current_23 = current_23.rest();
                                    if (NIL == current_23) {
                                        predicates_20 = cons(predicate, predicates_20);
                                    } else {
                                        cdestructuring_bind_error(datum_22, $list_alt44);
                                    }
                                }
                            }
                            predicates_20 = list_utilities.fast_delete_duplicates(predicates_20, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            predicates_20 = Sort.sort(predicates_20, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                            v_answer = cons(list(collection, predicates_20), v_answer);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt43);
                    }
                }
            }
            return nreverse(v_answer);
        }
    }

    @LispMethod(comment = "Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\r\nCOL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\nCOL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general")
    public static SubLObject rkf_organize_predicates_by_specificity_to_term(final SubLObject predicates, final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject matches = rkf_predicate_selector_matches(v_term, domain_mt, predicates, UNPROVIDED);
        final SubLObject match_sections = rkf_organize_predicate_matches_by_collection(matches);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = match_sections;
        SubLObject match_section = NIL;
        match_section = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = match_section;
            SubLObject collection = NIL;
            SubLObject match_predicate_sections = NIL;
            destructuring_bind_must_consp(current, datum, $list43);
            collection = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list43);
            match_predicate_sections = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject predicates_$24 = NIL;
                SubLObject cdolist_list_var_$25 = match_predicate_sections;
                SubLObject match_predicate_section = NIL;
                match_predicate_section = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    SubLObject current_$27;
                    final SubLObject datum_$26 = current_$27 = match_predicate_section;
                    SubLObject predicate = NIL;
                    SubLObject argnum_list = NIL;
                    destructuring_bind_must_consp(current_$27, datum_$26, $list44);
                    predicate = current_$27.first();
                    current_$27 = current_$27.rest();
                    destructuring_bind_must_consp(current_$27, datum_$26, $list44);
                    argnum_list = current_$27.first();
                    current_$27 = current_$27.rest();
                    if (NIL == current_$27) {
                        predicates_$24 = cons(predicate, predicates_$24);
                    } else {
                        cdestructuring_bind_error(datum_$26, $list44);
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    match_predicate_section = cdolist_list_var_$25.first();
                } 
                predicates_$24 = list_utilities.fast_delete_duplicates(predicates_$24, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                predicates_$24 = Sort.sort(predicates_$24, symbol_function($sym23$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                v_answer = cons(list(collection, predicates_$24), v_answer);
            } else {
                cdestructuring_bind_error(datum, $list43);
            }
            cdolist_list_var = cdolist_list_var.rest();
            match_section = cdolist_list_var.first();
        } 
        return nreverse(v_answer);
    }/**
     * Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where
     * COL is the most specific constraint on PREDICATES-FOR-COL that admits TERM, and where
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general
     */


    /**
     * Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general
     */
    @LispMethod(comment = "Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general")
    public static final SubLObject rkf_organize_predicates_by_specificity_of_args_alt(SubLObject predicates, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
                SubLObject list_var = predicates;
                $progress_note$.setDynamicValue($$$categorizing_predicates, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject predicate = NIL;
                            for (predicate = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject argnum = relationship_generality_estimates.relation_most_restricted_arg(predicate);
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject collection = com.cyc.cycjava.cycl.rkf_domain_examples.relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                                        SubLObject constraint = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        sethash(collection, answer_table, cons(predicate, gethash(collection, answer_table, NIL)));
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject v_answer = NIL;
                    SubLObject table_var = answer_table;
                    $progress_note$.setDynamicValue($$$sorting_predicates, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject collection = NIL;
                                SubLObject predicates_24 = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            collection = getEntryKey(cdohash_entry);
                                            predicates_24 = getEntryValue(cdohash_entry);
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            predicates_24 = Sort.sort(predicates_24, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                                            v_answer = cons(list(collection, predicates_24), v_answer);
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                    v_answer = Sort.sort(v_answer, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FIRST));
                    return v_answer;
                }
            }
        }
    }

    @LispMethod(comment = "Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\r\n(a) tuples are sorted by generality-estimate of COL, from specific to general\r\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where\n(a) tuples are sorted by generality-estimate of COL, from specific to general\n(b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general")
    public static SubLObject rkf_organize_predicates_by_specificity_of_args(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$categorizing_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(predicates), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = NIL;
                predicate = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject argnum = relationship_generality_estimates.relation_most_restricted_arg(predicate);
                    thread.resetMultipleValues();
                    final SubLObject collection = relation_most_restricted_arg_constraint_memoized(predicate, argnum, domain_mt);
                    final SubLObject constraint = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    sethash(collection, answer_table, cons(predicate, gethash(collection, answer_table, NIL)));
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$sorting_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject collection2 = NIL;
                SubLObject predicates_$29 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        collection2 = getEntryKey(cdohash_entry);
                        predicates_$29 = getEntryValue(cdohash_entry);
                        predicates_$29 = Sort.sort(predicates_$29, symbol_function($sym23$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                        v_answer = cons(list(collection2, predicates_$29), v_answer);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FIRST));
        return v_answer;
    }/**
     * Organize PREDICATES into a list of (COL PREDICATES-FOR-COL) tuples, where
     * (a) tuples are sorted by generality-estimate of COL, from specific to general
     * (b) PREDICATES-FOR-COL are sorted by relation-generality-estimate, from specific to general
     */


    /**
     * Organize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where
     * (a) tuples are sorted by generality-estimate of MT, from specific to general
     * (b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general
     */
    @LispMethod(comment = "Organize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where\r\n(a) tuples are sorted by generality-estimate of MT, from specific to general\r\n(b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where\n(a) tuples are sorted by generality-estimate of MT, from specific to general\n(b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general")
    public static final SubLObject rkf_organize_predicates_by_mt_alt(SubLObject predicates) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
                SubLObject list_var = predicates;
                $progress_note$.setDynamicValue($$$categorizing_predicates, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject predicate = NIL;
                            for (predicate = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject defining_mt = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_relation_defining_mts(predicate).first();
                                    sethash(defining_mt, answer_table, cons(predicate, gethash(defining_mt, answer_table, NIL)));
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject v_answer = NIL;
                    SubLObject table_var = answer_table;
                    $progress_note$.setDynamicValue($$$sorting_predicates, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject defining_mt = NIL;
                                SubLObject predicates_25 = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            defining_mt = getEntryKey(cdohash_entry);
                                            predicates_25 = getEntryValue(cdohash_entry);
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            predicates_25 = Sort.sort(predicates_25, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                                            v_answer = cons(list(defining_mt, predicates_25), v_answer);
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                    v_answer = Sort.sort(v_answer, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FIRST));
                    return v_answer;
                }
            }
        }
    }

    @LispMethod(comment = "Organize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where\r\n(a) tuples are sorted by generality-estimate of MT, from specific to general\r\n(b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where\n(a) tuples are sorted by generality-estimate of MT, from specific to general\n(b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general")
    public static SubLObject rkf_organize_predicates_by_mt(final SubLObject predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$categorizing_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(predicates), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = NIL;
                predicate = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject defining_mt = rkf_relation_defining_mts(predicate).first();
                    sethash(defining_mt, answer_table, cons(predicate, gethash(defining_mt, answer_table, NIL)));
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$sorting_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject defining_mt = NIL;
                SubLObject predicates_$32 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        defining_mt = getEntryKey(cdohash_entry);
                        predicates_$32 = getEntryValue(cdohash_entry);
                        predicates_$32 = Sort.sort(predicates_$32, symbol_function($sym23$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                        v_answer = cons(list(defining_mt, predicates_$32), v_answer);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, symbol_function($sym37$GENERALITY_ESTIMATE_), symbol_function(FIRST));
        return v_answer;
    }/**
     * Organize PREDICATES into a list of (MT PREDICATES-FROM-MT) tuples, where
     * (a) tuples are sorted by generality-estimate of MT, from specific to general
     * (b) PREDICATES-FROM-MT are sorted by relation-generality-estimate, from specific to general
     */


    public static final SubLObject rkf_relation_defining_mts_alt(SubLObject relation) {
        return isa.max_floor_mts_of_isa_paths(relation, $$Relation, UNPROVIDED);
    }

    public static SubLObject rkf_relation_defining_mts(final SubLObject relation) {
        return isa.max_floor_mts_of_isa_paths(relation, $$Relation, UNPROVIDED);
    }

    /**
     * Organize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where
     * GENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where
     * (a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general
     * (b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general
     */
    @LispMethod(comment = "Organize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where\r\nGENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where\r\n(a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general\r\n(b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where\nGENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where\n(a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general\n(b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general")
    public static final SubLObject rkf_organize_predicates_by_similarity_alt(SubLObject predicates, SubLObject domain_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
                SubLObject self_tops = NIL;
                SubLObject list_var = predicates;
                $progress_note$.setDynamicValue($$$categorizing_predicates, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(length(list_var), thread);
                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        {
                            SubLObject csome_list_var = list_var;
                            SubLObject predicate = NIL;
                            for (predicate = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , predicate = csome_list_var.first()) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject genl_pred = rkf_ontology_utilities.rkf_predicate_tops(predicate, domain_mt).first();
                                    if (predicate == genl_pred) {
                                        self_tops = cons(predicate, self_tops);
                                    } else {
                                        sethash(genl_pred, answer_table, cons(predicate, gethash(genl_pred, answer_table, NIL)));
                                    }
                                }
                            }
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject v_answer = NIL;
                    SubLObject table_var = answer_table;
                    $progress_note$.setDynamicValue($$$sorting_predicates, thread);
                    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                    $progress_total$.setDynamicValue(hash_table_count(table_var), thread);
                    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                    {
                        SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            {
                                SubLObject genl_pred = NIL;
                                SubLObject predicates_26 = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            genl_pred = getEntryKey(cdohash_entry);
                                            predicates_26 = getEntryValue(cdohash_entry);
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            predicates_26 = Sort.sort(predicates_26, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                                            v_answer = cons(list(genl_pred, predicates_26), v_answer);
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                            noting_percent_progress_postamble();
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                        }
                    }
                    v_answer = Sort.sort(v_answer, symbol_function($sym35$RELATION_GENERALITY_ESTIMATE_), symbol_function(FIRST));
                    self_tops = Sort.sort(self_tops, symbol_function($sym24$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                    {
                        SubLObject section_key = $$$Other_predicates;
                        SubLObject self_top_section = list(section_key, self_tops);
                        rplacd(last(v_answer, UNPROVIDED), list(self_top_section));
                    }
                    return v_answer;
                }
            }
        }
    }

    /**
     * Organize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where
     * GENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where
     * (a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general
     * (b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general
     */
    @LispMethod(comment = "Organize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where\r\nGENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where\r\n(a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general\r\n(b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general\nOrganize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where\nGENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where\n(a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general\n(b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general")
    public static SubLObject rkf_organize_predicates_by_similarity(final SubLObject predicates, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_table = make_hash_table(length(predicates), UNPROVIDED, UNPROVIDED);
        SubLObject self_tops = NIL;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$categorizing_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(predicates), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = predicates;
                SubLObject predicate = NIL;
                predicate = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject genl_pred = rkf_ontology_utilities.rkf_predicate_tops(predicate, domain_mt).first();
                    if (predicate.eql(genl_pred)) {
                        self_tops = cons(predicate, self_tops);
                    } else {
                        sethash(genl_pred, answer_table, cons(predicate, gethash(genl_pred, answer_table, NIL)));
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    predicate = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject v_answer = NIL;
        final SubLObject table_var = answer_table;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$sorting_predicates, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject genl_pred = NIL;
                SubLObject predicates_$35 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        genl_pred = getEntryKey(cdohash_entry);
                        predicates_$35 = getEntryValue(cdohash_entry);
                        predicates_$35 = Sort.sort(predicates_$35, symbol_function($sym23$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
                        v_answer = cons(list(genl_pred, predicates_$35), v_answer);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        v_answer = Sort.sort(v_answer, symbol_function($sym35$RELATION_GENERALITY_ESTIMATE_), symbol_function(FIRST));
        self_tops = Sort.sort(self_tops, symbol_function($sym23$_), symbol_function(RELATION_GENERALITY_ESTIMATE));
        final SubLObject section_key = $$$Other_predicates;
        final SubLObject self_top_section = list(section_key, self_tops);
        rplacd(last(v_answer, UNPROVIDED), list(self_top_section));
        return v_answer;
    }/**
     * Organize PREDICATES into a list of (GENL-PRED SPEC-PREDICATES) tuples, where
     * GENL-PRED is the top of the genlPreds hierarchy for all predicates in SPEC-PREDICATES, and where
     * (a) tuples are sorted by relation-generality-estimate of GENL-PRED, from specific to general
     * (b) SPEC-PREDICATES are sorted by relation-generality-estimate, from specific to general
     */


    /**
     * Return T iff SENTENCE has variations in DOMAIN-MT.
     */
    @LispMethod(comment = "Return T iff SENTENCE has variations in DOMAIN-MT.")
    public static final SubLObject rkf_sentence_has_variations_alt(SubLObject sentence, SubLObject domain_mt) {
        {
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            if (((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.predicateP(predicate))) && (NIL != arity.binaryP(predicate))) {
                return makeBoolean((NIL != com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt)) || (NIL != com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt)));
            }
        }
        return NIL;
    }

    /**
     * Return T iff SENTENCE has variations in DOMAIN-MT.
     */
    @LispMethod(comment = "Return T iff SENTENCE has variations in DOMAIN-MT.")
    public static SubLObject rkf_sentence_has_variations(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        if (((NIL != forts.fort_p(predicate)) && (NIL != fort_types_interface.predicateP(predicate))) && (NIL != arity.binaryP(predicate))) {
            return makeBoolean((NIL != rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt)) || (NIL != rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt)));
        }
        return NIL;
    }/**
     * Return T iff SENTENCE has variations in DOMAIN-MT.
     */


    /**
     * Return a list of variations on SENTENCE in DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of variations on SENTENCE in DOMAIN-MT.")
    public static final SubLObject rkf_sentence_variations_alt(SubLObject sentence, SubLObject domain_mt) {
        return com.cyc.cycjava.cycl.rkf_domain_examples.rkf_sentence_variations_internal(sentence, domain_mt);
    }

    /**
     * Return a list of variations on SENTENCE in DOMAIN-MT.
     */
    @LispMethod(comment = "Return a list of variations on SENTENCE in DOMAIN-MT.")
    public static SubLObject rkf_sentence_variations(final SubLObject sentence, final SubLObject domain_mt) {
        return rkf_sentence_variations_internal(sentence, domain_mt);
    }/**
     * Return a list of variations on SENTENCE in DOMAIN-MT.
     */


    public static final SubLObject rkf_sentence_variations_internal_alt(SubLObject sentence, SubLObject domain_mt) {
        {
            SubLObject variations = nconc(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_sentence_variations_type_type(sentence, domain_mt), com.cyc.cycjava.cycl.rkf_domain_examples.rkf_sentence_variations_type_instance(sentence, domain_mt), com.cyc.cycjava.cycl.rkf_domain_examples.rkf_sentence_variations_instance_type(sentence, domain_mt));
            return variations;
        }
    }

    public static SubLObject rkf_sentence_variations_internal(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject variations = nconc(rkf_sentence_variations_type_type(sentence, domain_mt), rkf_sentence_variations_type_instance(sentence, domain_mt), rkf_sentence_variations_instance_type(sentence, domain_mt));
        return variations;
    }

    public static final SubLObject rkf_sentence_variations_type_type_alt(SubLObject sentence, SubLObject domain_mt) {
        {
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            SubLObject arg_1_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
            SubLObject arg_2_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
            if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
                {
                    SubLObject rule_macro_predicates = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_rule_macro_type_instances($$TypeTypeTernaryRuleMacroPredicate, domain_mt);
                    SubLObject variations = NIL;
                    SubLObject cdolist_list_var = rule_macro_predicates;
                    SubLObject rule_macro_predicate = NIL;
                    for (rule_macro_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_macro_predicate = cdolist_list_var.first()) {
                        {
                            SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                            variations = cons(variation, variations);
                        }
                    }
                    variations = nreverse(variations);
                    return variations;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sentence_variations_type_type(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
        if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances($$TypeTypeTernaryRuleMacroPredicate, domain_mt);
            SubLObject variations = NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            } 
            variations = nreverse(variations);
            return variations;
        }
        return NIL;
    }

    public static final SubLObject rkf_sentence_variations_type_instance_alt(SubLObject sentence, SubLObject domain_mt) {
        {
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            SubLObject arg_1_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
            SubLObject arg_2_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
            if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
                {
                    SubLObject rule_macro_predicates = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_rule_macro_type_instances($const51$TypeInstanceTernaryRuleMacroPredi, domain_mt);
                    SubLObject variations = NIL;
                    SubLObject cdolist_list_var = rule_macro_predicates;
                    SubLObject rule_macro_predicate = NIL;
                    for (rule_macro_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_macro_predicate = cdolist_list_var.first()) {
                        {
                            SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                            variations = cons(variation, variations);
                        }
                    }
                    variations = nreverse(variations);
                    return variations;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sentence_variations_type_instance(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
        if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances($const51$TypeInstanceTernaryRuleMacroPredi, domain_mt);
            SubLObject variations = NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            } 
            variations = nreverse(variations);
            return variations;
        }
        return NIL;
    }

    public static final SubLObject rkf_sentence_variations_instance_type_alt(SubLObject sentence, SubLObject domain_mt) {
        {
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            SubLObject arg_1_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
            SubLObject arg_2_variation = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
            if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
                {
                    SubLObject rule_macro_predicates = com.cyc.cycjava.cycl.rkf_domain_examples.rkf_rule_macro_type_instances($const52$InstanceTypeTernaryRuleMacroPredi, domain_mt);
                    SubLObject variations = NIL;
                    SubLObject cdolist_list_var = rule_macro_predicates;
                    SubLObject rule_macro_predicate = NIL;
                    for (rule_macro_predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule_macro_predicate = cdolist_list_var.first()) {
                        {
                            SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                            variations = cons(variation, variations);
                        }
                    }
                    variations = nreverse(variations);
                    return variations;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_sentence_variations_instance_type(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLObject predicate = cycl_utilities.formula_operator(sentence);
        final SubLObject arg_1_variation = rkf_example_instance_variation_for_arg(cycl_utilities.sentence_arg1(sentence, UNPROVIDED), predicate, ONE_INTEGER, domain_mt);
        final SubLObject arg_2_variation = rkf_example_type_variation_for_arg(cycl_utilities.sentence_arg2(sentence, UNPROVIDED), predicate, TWO_INTEGER, domain_mt);
        if ((NIL != arg_1_variation) && (NIL != arg_2_variation)) {
            final SubLObject rule_macro_predicates = rkf_rule_macro_type_instances($const52$InstanceTypeTernaryRuleMacroPredi, domain_mt);
            SubLObject variations = NIL;
            SubLObject cdolist_list_var = rule_macro_predicates;
            SubLObject rule_macro_predicate = NIL;
            rule_macro_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject variation = make_ternary_formula(rule_macro_predicate, predicate, arg_1_variation, arg_2_variation);
                variations = cons(variation, variations);
                cdolist_list_var = cdolist_list_var.rest();
                rule_macro_predicate = cdolist_list_var.first();
            } 
            variations = nreverse(variations);
            return variations;
        }
        return NIL;
    }

    public static final SubLObject rkf_example_instance_variation_for_arg_alt(SubLObject example, SubLObject predicate, SubLObject arg, SubLObject domain_mt) {
        return example;
    }

    public static SubLObject rkf_example_instance_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt) {
        return example;
    }

    public static final SubLObject rkf_example_type_variation_for_arg_alt(SubLObject example, SubLObject predicate, SubLObject arg, SubLObject domain_mt) {
        if (NIL != isa.isa_in_any_mtP(example, $$Collection)) {
            return NIL;
        } else {
            {
                SubLObject min_isas = rkf_ontology_utilities.rkf_min_isa(example, domain_mt);
                return min_isas.first();
            }
        }
    }

    public static SubLObject rkf_example_type_variation_for_arg(final SubLObject example, final SubLObject predicate, final SubLObject arg, final SubLObject domain_mt) {
        if (NIL != isa.isa_in_any_mtP(example, $$Collection)) {
            return NIL;
        }
        final SubLObject min_isas = rkf_ontology_utilities.rkf_min_isa(example, domain_mt);
        return min_isas.first();
    }

    public static final SubLObject clear_rkf_min_arg_n_isa_alt() {
        {
            SubLObject cs = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rkf_min_arg_n_isa() {
        final SubLObject cs = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rkf_min_arg_n_isa_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_min_arg_n_isa_caching_state$.getGlobalValue(), list(relation, n, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_min_arg_n_isa_caching_state$.getGlobalValue(), list(relation, n, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_min_arg_n_isa_internal_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        {
            SubLObject constraints = kb_accessors.min_argn_isa(relation, n, domain_mt);
            constraints = cardinality_estimates.sort_by_generality_estimate(constraints, $ASCENDING);
            return constraints.first();
        }
    }

    public static SubLObject rkf_min_arg_n_isa_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject constraints = kb_accessors.min_argn_isa(relation, n, domain_mt);
        constraints = cardinality_estimates.sort_by_generality_estimate(constraints, $ASCENDING);
        return constraints.first();
    }

    public static final SubLObject rkf_min_arg_n_isa_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        {
            SubLObject caching_state = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RKF_MIN_ARG_N_ISA, $rkf_min_arg_n_isa_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (n.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_min_arg_n_isa_internal(relation, n, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, n, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rkf_min_arg_n_isa(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject caching_state = $rkf_min_arg_n_isa_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_MIN_ARG_N_ISA, $rkf_min_arg_n_isa_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (n.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rkf_min_arg_n_isa_internal(relation, n, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, n, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_rkf_min_arg_n_genl_alt() {
        {
            SubLObject cs = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rkf_min_arg_n_genl() {
        final SubLObject cs = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rkf_min_arg_n_genl_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_min_arg_n_genl_caching_state$.getGlobalValue(), list(relation, n, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_min_arg_n_genl_caching_state$.getGlobalValue(), list(relation, n, domain_mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_min_arg_n_genl_internal_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        {
            SubLObject constraints = kb_accessors.min_argn_genl(relation, n, domain_mt);
            constraints = cardinality_estimates.sort_by_generality_estimate(constraints, $ASCENDING);
            return constraints.first();
        }
    }

    public static SubLObject rkf_min_arg_n_genl_internal(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject constraints = kb_accessors.min_argn_genl(relation, n, domain_mt);
        constraints = cardinality_estimates.sort_by_generality_estimate(constraints, $ASCENDING);
        return constraints.first();
    }

    public static final SubLObject rkf_min_arg_n_genl_alt(SubLObject relation, SubLObject n, SubLObject domain_mt) {
        {
            SubLObject caching_state = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RKF_MIN_ARG_N_GENL, $rkf_min_arg_n_genl_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw1$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (relation.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (n.eql(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rkf_domain_examples.rkf_min_arg_n_genl_internal(relation, n, domain_mt)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(relation, n, domain_mt));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject rkf_min_arg_n_genl(final SubLObject relation, final SubLObject n, final SubLObject domain_mt) {
        SubLObject caching_state = $rkf_min_arg_n_genl_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_MIN_ARG_N_GENL, $rkf_min_arg_n_genl_caching_state$, NIL, EQL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(relation, n, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (n.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rkf_min_arg_n_genl_internal(relation, n, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, n, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject rkf_rule_macro_type_instances_alt(SubLObject rule_macro_type, SubLObject domain_mt) {
        {
            SubLObject predicates = isa.all_fort_instances(rule_macro_type, domain_mt, UNPROVIDED);
            predicates = rkf_relevance_utilities.rkf_filter_irrelevant_terms(predicates, domain_mt);
            predicates = Sort.sort(predicates, symbol_function($sym57$_), symbol_function(NUM_PREDICATE_EXTENT_INDEX));
            return predicates;
        }
    }

    public static SubLObject rkf_rule_macro_type_instances(final SubLObject rule_macro_type, final SubLObject domain_mt) {
        SubLObject predicates = isa.all_fort_instances(rule_macro_type, domain_mt, UNPROVIDED);
        predicates = rkf_relevance_utilities.rkf_filter_irrelevant_terms(predicates, domain_mt);
        predicates = Sort.sort(predicates, symbol_function($sym57$_), symbol_function(NUM_PREDICATE_EXTENT_INDEX));
        return predicates;
    }

    public static SubLObject declare_rkf_domain_examples_file() {
        declareFunction("rkf_salient_spec_predicateP", "RKF-SALIENT-SPEC-PREDICATE?", 2, 0, false);
        declareFunction("rkf_salient_spec_predicate_memoized_internal", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("rkf_salient_spec_predicate_memoized", "RKF-SALIENT-SPEC-PREDICATE-MEMOIZED", 2, 0, false);
        declareFunction("rkf_salient_spec_predicate_internal", "RKF-SALIENT-SPEC-PREDICATE-INTERNAL", 2, 0, false);
        declareFunction("rkf_build_spec_predicate_graph", "RKF-BUILD-SPEC-PREDICATE-GRAPH", 2, 0, false);
        declareFunction("rkf_build_spec_predicate_graph_memoized_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED-INTERNAL", 2, 0, false);
        declareFunction("rkf_build_spec_predicate_graph_memoized", "RKF-BUILD-SPEC-PREDICATE-GRAPH-MEMOIZED", 2, 0, false);
        declareFunction("rkf_build_spec_predicate_graph_internal", "RKF-BUILD-SPEC-PREDICATE-GRAPH-INTERNAL", 2, 0, false);
        declareFunction("rkf_interpret_spec_predicate_graph", "RKF-INTERPRET-SPEC-PREDICATE-GRAPH", 4, 0, false);
        declareFunction("rkf_add_to_spec_predicate_graph", "RKF-ADD-TO-SPEC-PREDICATE-GRAPH", 2, 0, false);
        declareFunction("rkf_extend_spec_predicate_graph_entry", "RKF-EXTEND-SPEC-PREDICATE-GRAPH-ENTRY", 3, 0, false);
        declareFunction("rkf_obtain_spec_predicate_sub_graph", "RKF-OBTAIN-SPEC-PREDICATE-SUB-GRAPH", 2, 0, false);
        declareFunction("rkf_count_spec_predicate_sub_graphs", "RKF-COUNT-SPEC-PREDICATE-SUB-GRAPHS", 1, 0, false);
        declareFunction("rkf_domain_example_predicates", "RKF-DOMAIN-EXAMPLE-PREDICATES", 2, 0, false);
        declareFunction("rkf_predicate_example_sentence", "RKF-PREDICATE-EXAMPLE-SENTENCE", 2, 0, false);
        declareFunction("rkf_all_predicate_example_sentences", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES", 2, 0, false);
        declareFunction("rkf_all_predicate_specific_example_sentences", "RKF-ALL-PREDICATE-SPECIFIC-EXAMPLE-SENTENCES", 2, 0, false);
        declareFunction("rkf_predicate_specific_example_sentence", "RKF-PREDICATE-SPECIFIC-EXAMPLE-SENTENCE", 2, 0, false);
        declareFunction("rkf_predicate_generic_example_sentence", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE", 2, 0, false);
        declareFunction("rkf_domain_example_predicates_internal", "RKF-DOMAIN-EXAMPLE-PREDICATES-INTERNAL", 2, 0, false);
        declareFunction("rkf_all_predicate_example_sentences_internal", "RKF-ALL-PREDICATE-EXAMPLE-SENTENCES-INTERNAL", 2, 0, false);
        declareFunction("rkf_predicate_generic_example_sentence_internal", "RKF-PREDICATE-GENERIC-EXAMPLE-SENTENCE-INTERNAL", 2, 0, false);
        declareFunction("rkf_generic_example_for_collection", "RKF-GENERIC-EXAMPLE-FOR-COLLECTION", 1, 0, false);
        declareFunction("rkf_generic_spec_for_collection", "RKF-GENERIC-SPEC-FOR-COLLECTION", 1, 0, false);
        declareFunction("rkf_generic_example_p", "RKF-GENERIC-EXAMPLE-P", 1, 0, false);
        declareFunction("rkf_generic_example_instance_level_p", "RKF-GENERIC-EXAMPLE-INSTANCE-LEVEL-P", 1, 0, false);
        declareFunction("relation_most_restricted_arg_constraint_memoized_internal", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED-INTERNAL", 2, 1, false);
        declareFunction("relation_most_restricted_arg_constraint_memoized", "RELATION-MOST-RESTRICTED-ARG-CONSTRAINT-MEMOIZED", 2, 1, false);
        declareFunction("min_arity_memoized_internal", "MIN-ARITY-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("min_arity_memoized", "MIN-ARITY-MEMOIZED", 1, 0, false);
        declareFunction("rkf_predicate_indicators", "RKF-PREDICATE-INDICATORS", 1, 2, false);
        declareFunction("rkf_predicate_indicators_match_score", "RKF-PREDICATE-INDICATORS-MATCH-SCORE", 2, 0, false);
        declareFunction("rkf_ch_raw_tokenization_memoized_internal", "RKF-CH-RAW-TOKENIZATION-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("rkf_ch_raw_tokenization_memoized", "RKF-CH-RAW-TOKENIZATION-MEMOIZED", 1, 0, false);
        declareFunction("rkf_predicate_suggestor_matches", "RKF-PREDICATE-SUGGESTOR-MATCHES", 2, 1, false);
        declareFunction("rkf_predicate_selector_matches", "RKF-PREDICATE-SELECTOR-MATCHES", 3, 1, false);
        declareFunction("rkf_organize_predicate_matches_by_collection", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-COLLECTION", 1, 0, false);
        declareFunction("rkf_organize_predicate_matches_by_mt", "RKF-ORGANIZE-PREDICATE-MATCHES-BY-MT", 1, 0, false);
        declareFunction("rkf_organize_predicates_by_specificity_to_term", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-TO-TERM", 3, 0, false);
        declareFunction("rkf_organize_predicates_by_specificity_of_args", "RKF-ORGANIZE-PREDICATES-BY-SPECIFICITY-OF-ARGS", 2, 0, false);
        declareFunction("rkf_organize_predicates_by_mt", "RKF-ORGANIZE-PREDICATES-BY-MT", 1, 0, false);
        declareFunction("rkf_relation_defining_mts", "RKF-RELATION-DEFINING-MTS", 1, 0, false);
        declareFunction("rkf_organize_predicates_by_similarity", "RKF-ORGANIZE-PREDICATES-BY-SIMILARITY", 2, 0, false);
        declareFunction("rkf_sentence_has_variations", "RKF-SENTENCE-HAS-VARIATIONS", 2, 0, false);
        declareFunction("rkf_sentence_variations", "RKF-SENTENCE-VARIATIONS", 2, 0, false);
        declareFunction("rkf_sentence_variations_internal", "RKF-SENTENCE-VARIATIONS-INTERNAL", 2, 0, false);
        declareFunction("rkf_sentence_variations_type_type", "RKF-SENTENCE-VARIATIONS-TYPE-TYPE", 2, 0, false);
        declareFunction("rkf_sentence_variations_type_instance", "RKF-SENTENCE-VARIATIONS-TYPE-INSTANCE", 2, 0, false);
        declareFunction("rkf_sentence_variations_instance_type", "RKF-SENTENCE-VARIATIONS-INSTANCE-TYPE", 2, 0, false);
        declareFunction("rkf_example_instance_variation_for_arg", "RKF-EXAMPLE-INSTANCE-VARIATION-FOR-ARG", 4, 0, false);
        declareFunction("rkf_example_type_variation_for_arg", "RKF-EXAMPLE-TYPE-VARIATION-FOR-ARG", 4, 0, false);
        declareFunction("clear_rkf_min_arg_n_isa", "CLEAR-RKF-MIN-ARG-N-ISA", 0, 0, false);
        declareFunction("remove_rkf_min_arg_n_isa", "REMOVE-RKF-MIN-ARG-N-ISA", 3, 0, false);
        declareFunction("rkf_min_arg_n_isa_internal", "RKF-MIN-ARG-N-ISA-INTERNAL", 3, 0, false);
        declareFunction("rkf_min_arg_n_isa", "RKF-MIN-ARG-N-ISA", 3, 0, false);
        declareFunction("clear_rkf_min_arg_n_genl", "CLEAR-RKF-MIN-ARG-N-GENL", 0, 0, false);
        declareFunction("remove_rkf_min_arg_n_genl", "REMOVE-RKF-MIN-ARG-N-GENL", 3, 0, false);
        declareFunction("rkf_min_arg_n_genl_internal", "RKF-MIN-ARG-N-GENL-INTERNAL", 3, 0, false);
        declareFunction("rkf_min_arg_n_genl", "RKF-MIN-ARG-N-GENL", 3, 0, false);
        declareFunction("rkf_rule_macro_type_instances", "RKF-RULE-MACRO-TYPE-INSTANCES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_domain_examples_file() {
        deflexical("*RKF-MIN-ARG-N-ISA-CACHING-STATE*", NIL);
        deflexical("*RKF-MIN-ARG-N-GENL-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_domain_examples_file() {
        memoization_state.note_memoized_function(RKF_SALIENT_SPEC_PREDICATE_MEMOIZED);
        memoization_state.note_memoized_function(RKF_BUILD_SPEC_PREDICATE_GRAPH_MEMOIZED);
        memoization_state.note_memoized_function(RELATION_MOST_RESTRICTED_ARG_CONSTRAINT_MEMOIZED);
        memoization_state.note_memoized_function(MIN_ARITY_MEMOIZED);
        memoization_state.note_memoized_function(RKF_CH_RAW_TOKENIZATION_MEMOIZED);
        memoization_state.note_globally_cached_function(RKF_MIN_ARG_N_ISA);
        memoization_state.note_globally_cached_function(RKF_MIN_ARG_N_GENL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_domain_examples_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_domain_examples_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_domain_examples_file();
    }

    

    public static final SubLSymbol $kw1$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("keSalientPredicate"), makeKeyword("PREDICATE"));

    static private final SubLList $list_alt9 = list(makeKeyword("SENTENCE"));

    static private final SubLString $str_alt20$_ = makeString(" ");

    static private final SubLSymbol $sym24$_ = makeSymbol("<");

    static private final SubLString $str_alt27$identifying__S_matches = makeString("identifying ~S matches");

    static private final SubLList $list_alt32 = list(reader_make_constant_shell("argIsa"), reader_make_constant_shell("argGenl"));

    static private final SubLList $list_alt39 = list(NIL, NIL, NIL, NIL);

    static private final SubLList $list_alt41 = list(makeSymbol("LAST-PRED"), makeSymbol("LAST-ARG"), makeSymbol("LAST-CONSTRAINT"), makeSymbol("LAST-COL"));

    static private final SubLList $list_alt42 = list(makeSymbol("THIS-PRED"), makeSymbol("THIS-ARG"), makeSymbol("THIS-CONSTRAINT"), makeSymbol("THIS-COL"));

    static private final SubLList $list_alt43 = list(makeSymbol("COLLECTION"), makeSymbol("MATCH-PREDICATE-SECTIONS"));

    static private final SubLList $list_alt44 = list(makeSymbol("PREDICATE"), makeSymbol("ARGNUM-LIST"));
}

/**
 * Total time: 730 ms
 */
