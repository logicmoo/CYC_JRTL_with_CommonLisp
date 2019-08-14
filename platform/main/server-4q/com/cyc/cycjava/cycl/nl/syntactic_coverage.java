package com.cyc.cycjava.cycl.nl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$with_timeout_nesting_depth$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$within_with_timeout$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_make_tag;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_start_timer;
import static com.cyc.cycjava.cycl.subl_macro_promotions.with_timeout_stop_timer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class syntactic_coverage extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new syntactic_coverage();

    public static final String myName = "com.cyc.cycjava_2.cycl.nl.syntactic_coverage";




    // defparameter
    private static final SubLSymbol $simple_semantic_distance_dict$ = makeSymbol("*SIMPLE-SEMANTIC-DISTANCE-DICT*");

    // defparameter
    private static final SubLSymbol $get_useless_preds$ = makeSymbol("*GET-USELESS-PREDS*");

    // deflexical
    private static final SubLSymbol $higher_order_collectionP_cached_caching_state$ = makeSymbol("*HIGHER-ORDER-COLLECTION?-CACHED-CACHING-STATE*");

    private static final SubLSymbol GET_SYNTACTIC_DOCUMENT_STATS = makeSymbol("GET-SYNTACTIC-DOCUMENT-STATS");



    private static final SubLSymbol $CYC_LINK_INTERFACE = makeKeyword("CYC-LINK-INTERFACE");





    private static final SubLString $$$default = makeString("default");

    private static final SubLSymbol $MAX_PARSE_TIME = makeKeyword("MAX-PARSE-TIME");



    private static final SubLString $str8$_sentence_count___S = makeString(" sentence-count: ~S");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str11$incing_sentence_count___S = makeString("incing sentence-count: ~S");

    private static final SubLString $str12$sentence_count___S = makeString("sentence-count: ~S");

    private static final SubLSymbol $get_syntactic_document_stats_caching_state$ = makeSymbol("*GET-SYNTACTIC-DOCUMENT-STATS-CACHING-STATE*");







    private static final SubLString $str17$at_iteration__S__distances_size__ = makeString("at iteration ~S, distances size=~S");





    private static final SubLString $str20$at_final_iteration__size__S = makeString("at final iteration, size=~S");



    private static final SubLObject $$nodeInSystem = reader_make_constant_shell(makeString("nodeInSystem"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$numberOfResultsThatSupportBinding = reader_make_constant_shell(makeString("numberOfResultsThatSupportBinding"));

    private static final SubLObject $$evincesBinding = reader_make_constant_shell(makeString("evincesBinding"));

    private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLObject $$lexiconSliceIncludeTerm = reader_make_constant_shell(makeString("lexiconSliceIncludeTerm"));

    private static final SubLObject $$collectionIntersection2 = reader_make_constant_shell(makeString("collectionIntersection2"));

    private static final SubLObject $$repatriateToMt = reader_make_constant_shell(makeString("repatriateToMt"));

    private static final SubLList $list31 = list(reader_make_constant_shell(makeString("TypicallyComparesToWRTSlotFn")), reader_make_constant_shell(makeString("lessThan")), reader_make_constant_shell(makeString("widthOfObject")));

    private static final SubLObject $$rdfURIInNamespace = reader_make_constant_shell(makeString("rdfURIInNamespace"));

    private static final SubLObject $$properNounSemTrans = reader_make_constant_shell(makeString("properNounSemTrans"));

    private static final SubLObject $$verbSemTrans = reader_make_constant_shell(makeString("verbSemTrans"));

    private static final SubLString $str35$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");

    private static final SubLList $list36 = list(new SubLObject[]{ reader_make_constant_shell(makeString("FACToryIrrelevantTerm")), reader_make_constant_shell(makeString("EnglishWord")), reader_make_constant_shell(makeString("NonHumanAnimal")), reader_make_constant_shell(makeString("Microtheory")), reader_make_constant_shell(makeString("SetOrCollection")), reader_make_constant_shell(makeString("LexicalWord")), reader_make_constant_shell(makeString("ExplanationWorthyConcept")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("AdultAnimal")), reader_make_constant_shell(makeString("AdultMaleHuman")), reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("MaleHuman")), reader_make_constant_shell(makeString("projectMonthlyAssignments")), reader_make_constant_shell(makeString("requestingAgent")), reader_make_constant_shell(makeString("WordNet-Version2_0")), reader_make_constant_shell(makeString("BiologicalSpecies")) });

    private static final SubLSymbol $sym37$HIGHER_ORDER_COLLECTION__CACHED = makeSymbol("HIGHER-ORDER-COLLECTION?-CACHED");

    private static final SubLSymbol $sym38$_HIGHER_ORDER_COLLECTION__CACHED_CACHING_STATE_ = makeSymbol("*HIGHER-ORDER-COLLECTION?-CACHED-CACHING-STATE*");

    public static SubLObject clear_get_syntactic_document_stats() {
        final SubLObject cs = $get_syntactic_document_stats_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_syntactic_document_stats(final SubLObject doc_string, SubLObject timeout_msecs) {
        if (timeout_msecs == UNPROVIDED) {
            timeout_msecs = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_syntactic_document_stats_caching_state$.getGlobalValue(), list(doc_string, timeout_msecs), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_syntactic_document_stats_internal(final SubLObject doc_string, final SubLObject timeout_msecs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject utf8 = cycl_string.cycl_string_to_utf8_string(doc_string);
        final SubLObject doc = document.new_document(utf8, UNPROVIDED, UNPROVIDED);
        SubLObject fragment_count = ZERO_INTEGER;
        SubLObject sentence_sizes = ZERO_INTEGER;
        SubLObject sentence_size_percents = ZERO_INTEGER;
        SubLObject sentence_count = ZERO_INTEGER;
        final SubLObject link_options = list($OPTIONS, list($CYC_LINK_INTERFACE, linkage.$cyc_link_interface$.getDynamicValue(thread), $MAX_LINKAGE, ONE_INTEGER, $DICTIONARY_NICKNAME, $$$default, $MAX_PARSE_TIME, divide(timeout_msecs, $int$1000)));
        SubLObject timed_out = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(NIL != timeout_msecs ? divide(timeout_msecs, $int$1000) : NIL, tag);
                        final SubLObject vector_var = document.document_paragraphs(doc);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject paragraph;
                        SubLObject vector_var_$2;
                        SubLObject backwardP_var_$3;
                        SubLObject length_$4;
                        SubLObject v_iteration_$5;
                        SubLObject element_num_$6;
                        SubLObject sentence;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$2;
                        SubLObject sentence_string;
                        SubLObject v_linkage;
                        SubLObject linked_word_count;
                        SubLObject word_count;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            paragraph = aref(vector_var, element_num);
                            vector_var_$2 = document.paragraph_sentences(paragraph);
                            backwardP_var_$3 = NIL;
                            for (length_$4 = length(vector_var_$2), v_iteration_$5 = NIL, v_iteration_$5 = ZERO_INTEGER; v_iteration_$5.numL(length_$4); v_iteration_$5 = add(v_iteration_$5, ONE_INTEGER)) {
                                element_num_$6 = (NIL != backwardP_var_$3) ? subtract(length_$4, v_iteration_$5, ONE_INTEGER) : v_iteration_$5;
                                sentence = aref(vector_var_$2, element_num_$6);
                                Errors.warn($str8$_sentence_count___S, sentence_count);
                                ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            sentence_string = document.sentence_string(sentence);
                                            v_linkage = linkage.new_linkage(sentence_string, link_options);
                                            thread.resetMultipleValues();
                                            linked_word_count = get_sentence_size(v_linkage);
                                            word_count = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (!linked_word_count.numE(word_count)) {
                                                fragment_count = add(fragment_count, ONE_INTEGER);
                                            }
                                            sentence_sizes = add(sentence_sizes, linked_word_count);
                                            sentence_size_percents = add(sentence_size_percents, divide(linked_word_count, word_count));
                                            Errors.warn($str11$incing_sentence_count___S, sentence_count);
                                            sentence_count = add(sentence_count, ONE_INTEGER);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            timed_out = Errors.handleThrowable(ccatch_env_var2, tag);
        } finally {
            thread.throwStack.pop();
        }
        Errors.warn($str12$sentence_count___S, sentence_count);
        return list(sentence_count.isPositive() ? divide(fragment_count, sentence_count) : ZERO_INTEGER, sentence_count.isPositive() ? divide(sentence_sizes, sentence_count) : ZERO_INTEGER, sentence_count.isPositive() ? divide(sentence_size_percents, sentence_count) : ZERO_INTEGER);
    }

    public static SubLObject get_syntactic_document_stats(final SubLObject doc_string, SubLObject timeout_msecs) {
        if (timeout_msecs == UNPROVIDED) {
            timeout_msecs = NIL;
        }
        SubLObject caching_state = $get_syntactic_document_stats_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_SYNTACTIC_DOCUMENT_STATS, $get_syntactic_document_stats_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(doc_string, timeout_msecs);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (doc_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && timeout_msecs.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_syntactic_document_stats_internal(doc_string, timeout_msecs)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(doc_string, timeout_msecs));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject get_sentence_size(final SubLObject v_linkage) {
        SubLObject linked_word_count = ZERO_INTEGER;
        SubLObject word_count = ZERO_INTEGER;
        SubLObject word = NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, WORDS);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            w = word = aref(vector_var, element_num);
            if ((NIL != methods.funcall_instance_method_with_0_args(word, GET_RIGHT_LINKS)) || (NIL != methods.funcall_instance_method_with_0_args(word, GET_LEFT_LINKS))) {
                linked_word_count = add(linked_word_count, ONE_INTEGER);
            }
            word_count = add(word_count, ONE_INTEGER);
        }
        return values(linked_word_count, word_count);
    }

    public static SubLObject simple_semantic_distance(final SubLObject term1, final SubLObject term2, SubLObject max_distance) {
        if (max_distance == UNPROVIDED) {
            max_distance = THREE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject distances = (NIL != dictionary.dictionary_lookup($simple_semantic_distance_dict$.getDynamicValue(thread), term1, UNPROVIDED)) ? dictionary.dictionary_lookup($simple_semantic_distance_dict$.getDynamicValue(thread), term1, UNPROVIDED) : dictionary.new_dictionary(EQUAL, UNPROVIDED);
        SubLObject done = NIL;
        dictionary.dictionary_enter(distances, term1, NIL);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            SubLObject v_iteration;
            SubLObject iteration_state;
            SubLObject related_term;
            SubLObject path;
            SubLObject pred_var;
            SubLObject iterator_var;
            SubLObject done_var;
            SubLObject token_var;
            SubLObject final_index_spec;
            SubLObject valid;
            SubLObject final_index_iterator;
            SubLObject done_var_$9;
            SubLObject token_var_$10;
            SubLObject v_assert;
            SubLObject valid_$11;
            SubLObject args;
            SubLObject rest;
            SubLObject arg;
            SubLObject current_best_known_path;
            SubLObject pathP;
            SubLObject _prev_bind_0_$12;
            SubLObject _values;
            for (v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(max_distance); v_iteration = add(v_iteration, ONE_INTEGER)) {
                Errors.warn($str17$at_iteration__S__distances_size__, v_iteration, dictionary.dictionary_length(distances));
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(distances)); (NIL == done) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    related_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    path = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != list_utilities.lengthLE(path, max_distance, UNPROVIDED)) {
                        pred_var = NIL;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(related_term, NIL, pred_var)) {
                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(related_term, NIL, pred_var);
                            done_var = done;
                            token_var = NIL;
                            while (NIL == done_var) {
                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        done_var_$9 = done;
                                        token_var_$10 = NIL;
                                        while (NIL == done_var_$9) {
                                            v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                            valid_$11 = makeBoolean(!token_var_$10.eql(v_assert));
                                            if (NIL != valid_$11) {
                                                args = cycl_utilities.formula_args(v_assert, $IGNORE);
                                                for (rest = NIL, rest = args; (NIL == done) && (NIL != rest); rest = rest.rest()) {
                                                    arg = rest.first();
                                                    thread.resetMultipleValues();
                                                    current_best_known_path = dictionary.dictionary_lookup(distances, arg, UNPROVIDED);
                                                    pathP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (((NIL == useless_intermediary_nodeP(arg, v_assert)) && (NIL == subl_promotions.memberP(v_assert, current_best_known_path, UNPROVIDED, UNPROVIDED))) && ((NIL == pathP) || ((NIL != pathP) && (NIL != list_utilities.lengthL(path, length(current_best_known_path), UNPROVIDED))))) {
                                                        dictionary.dictionary_enter(distances, arg, cons(v_assert, path));
                                                        if (arg.equal(term2)) {
                                                            done = T;
                                                        }
                                                    }
                                                }
                                            }
                                            done_var_$9 = makeBoolean((NIL == valid_$11) || (NIL != done));
                                        } 
                                    } finally {
                                        _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != done));
                            } 
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        } finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        Errors.warn($str20$at_final_iteration__size__S, dictionary.dictionary_length(distances));
        dictionary.dictionary_enter($simple_semantic_distance_dict$.getDynamicValue(thread), term1, distances);
        return dictionary.dictionary_lookup(distances, term2, UNPROVIDED);
    }

    public static SubLObject get_useless_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($get_useless_preds$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = list(new SubLObject[]{ $$nodeInSystem, $$quotedIsa, $$numberOfResultsThatSupportBinding, $$evincesBinding, $$synonymousExternalConcept, $$definingMt, $$lexiconSliceIncludeTerm, $$collectionIntersection2, $$repatriateToMt, narts_high.nart_substitute($list31), $$rdfURIInNamespace, $$properNounSemTrans, $$verbSemTrans });
            if (init_value == $UNINITIALIZED) {
                Errors.error($str35$Unable_to_initialize__A__, $get_useless_preds$.getDynamicValue(thread));
            }
            $get_useless_preds$.setDynamicValue(init_value, thread);
        }
        return $get_useless_preds$.getDynamicValue(thread);
    }

    public static SubLObject useless_intermediary_nodeP(final SubLObject v_term, final SubLObject v_assert) {
        return makeBoolean((((((v_term.isNumber() || (NIL != fort_types_interface.predicate_p(v_term))) || v_term.isString()) || (NIL != lexicon_accessors.speech_partP(v_term, UNPROVIDED))) || (NIL != higher_order_collectionP_cached(v_term))) || (NIL != member(v_term, $list36, UNPROVIDED, UNPROVIDED))) || (NIL != member(cycl_utilities.formula_arg0(v_assert), get_useless_preds(), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject clear_higher_order_collectionP_cached() {
        final SubLObject cs = $higher_order_collectionP_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_higher_order_collectionP_cached(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($higher_order_collectionP_cached_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject higher_order_collectionP_cached_internal(final SubLObject v_term) {
        return builder_utilities.higher_order_collectionP(v_term);
    }

    public static SubLObject higher_order_collectionP_cached(final SubLObject v_term) {
        SubLObject caching_state = $higher_order_collectionP_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym37$HIGHER_ORDER_COLLECTION__CACHED, $sym38$_HIGHER_ORDER_COLLECTION__CACHED_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(higher_order_collectionP_cached_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_syntactic_coverage_file() {
        declareFunction("clear_get_syntactic_document_stats", "CLEAR-GET-SYNTACTIC-DOCUMENT-STATS", 0, 0, false);
        declareFunction("remove_get_syntactic_document_stats", "REMOVE-GET-SYNTACTIC-DOCUMENT-STATS", 1, 1, false);
        declareFunction("get_syntactic_document_stats_internal", "GET-SYNTACTIC-DOCUMENT-STATS-INTERNAL", 2, 0, false);
        declareFunction("get_syntactic_document_stats", "GET-SYNTACTIC-DOCUMENT-STATS", 1, 1, false);
        declareFunction("get_sentence_size", "GET-SENTENCE-SIZE", 1, 0, false);
        declareFunction("simple_semantic_distance", "SIMPLE-SEMANTIC-DISTANCE", 2, 1, false);
        declareFunction("get_useless_preds", "GET-USELESS-PREDS", 0, 0, false);
        declareFunction("useless_intermediary_nodeP", "USELESS-INTERMEDIARY-NODE?", 2, 0, false);
        declareFunction("clear_higher_order_collectionP_cached", "CLEAR-HIGHER-ORDER-COLLECTION?-CACHED", 0, 0, false);
        declareFunction("remove_higher_order_collectionP_cached", "REMOVE-HIGHER-ORDER-COLLECTION?-CACHED", 1, 0, false);
        declareFunction("higher_order_collectionP_cached_internal", "HIGHER-ORDER-COLLECTION?-CACHED-INTERNAL", 1, 0, false);
        declareFunction("higher_order_collectionP_cached", "HIGHER-ORDER-COLLECTION?-CACHED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_syntactic_coverage_file() {
        deflexical("*GET-SYNTACTIC-DOCUMENT-STATS-CACHING-STATE*", NIL);
        defparameter("*SIMPLE-SEMANTIC-DISTANCE-DICT*", dictionary.new_dictionary(EQUAL, UNPROVIDED));
        defparameter("*GET-USELESS-PREDS*", $UNINITIALIZED);
        deflexical("*HIGHER-ORDER-COLLECTION?-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_syntactic_coverage_file() {
        memoization_state.note_globally_cached_function(GET_SYNTACTIC_DOCUMENT_STATS);
        memoization_state.note_globally_cached_function($sym37$HIGHER_ORDER_COLLECTION__CACHED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_syntactic_coverage_file();
    }

    @Override
    public void initializeVariables() {
        init_syntactic_coverage_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_syntactic_coverage_file();
    }

    static {












































    }
}

/**
 * Total time: 194 ms
 */
