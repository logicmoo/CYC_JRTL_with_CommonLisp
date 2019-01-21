package com.cyc.cycjava.cycl.nl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.builder_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class syntactic_coverage extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl.syntactic_coverage";
    public static final String myFingerPrint = "dcb1a14ce3db24f1ad00f69a67a584cbeb252a12f9ec40b13a845470be730e0f";
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 931L)
    private static SubLSymbol $get_syntactic_document_stats_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 2766L)
    private static SubLSymbol $simple_semantic_distance_dict$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 4574L)
    private static SubLSymbol $get_useless_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 5533L)
    private static SubLSymbol $higher_order_collectionP_cached_caching_state$;
    private static final SubLSymbol $sym0$GET_SYNTACTIC_DOCUMENT_STATS;
    private static final SubLSymbol $kw1$OPTIONS;
    private static final SubLSymbol $kw2$CYC_LINK_INTERFACE;
    private static final SubLSymbol $kw3$MAX_LINKAGE;
    private static final SubLSymbol $kw4$DICTIONARY_NICKNAME;
    private static final SubLString $str5$default;
    private static final SubLSymbol $kw6$MAX_PARSE_TIME;
    private static final SubLInteger $int7$1000;
    private static final SubLString $str8$_sentence_count___S;
    private static final SubLSymbol $kw9$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym10$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str11$incing_sentence_count___S;
    private static final SubLString $str12$sentence_count___S;
    private static final SubLSymbol $sym13$_GET_SYNTACTIC_DOCUMENT_STATS_CACHING_STATE_;
    private static final SubLSymbol $sym14$WORDS;
    private static final SubLSymbol $sym15$GET_RIGHT_LINKS;
    private static final SubLSymbol $sym16$GET_LEFT_LINKS;
    private static final SubLString $str17$at_iteration__S__distances_size__;
    private static final SubLSymbol $kw18$GAF;
    private static final SubLSymbol $kw19$IGNORE;
    private static final SubLString $str20$at_final_iteration__size__S;
    private static final SubLSymbol $kw21$UNINITIALIZED;
    private static final SubLObject $const22$nodeInSystem;
    private static final SubLObject $const23$quotedIsa;
    private static final SubLObject $const24$numberOfResultsThatSupportBinding;
    private static final SubLObject $const25$evincesBinding;
    private static final SubLObject $const26$synonymousExternalConcept;
    private static final SubLObject $const27$definingMt;
    private static final SubLObject $const28$lexiconSliceIncludeTerm;
    private static final SubLObject $const29$collectionIntersection2;
    private static final SubLObject $const30$repatriateToMt;
    private static final SubLList $list31;
    private static final SubLObject $const32$rdfURIInNamespace;
    private static final SubLObject $const33$properNounSemTrans;
    private static final SubLObject $const34$verbSemTrans;
    private static final SubLString $str35$Unable_to_initialize__A__;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$HIGHER_ORDER_COLLECTION__CACHED;
    private static final SubLSymbol $sym38$_HIGHER_ORDER_COLLECTION__CACHED_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 931L)
    public static SubLObject clear_get_syntactic_document_stats() {
        final SubLObject cs = syntactic_coverage.$get_syntactic_document_stats_caching_state$.getGlobalValue();
        if (syntactic_coverage.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)syntactic_coverage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 931L)
    public static SubLObject remove_get_syntactic_document_stats(final SubLObject doc_string, SubLObject timeout_msecs) {
        if (timeout_msecs == syntactic_coverage.UNPROVIDED) {
            timeout_msecs = (SubLObject)syntactic_coverage.NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args(syntactic_coverage.$get_syntactic_document_stats_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(doc_string, timeout_msecs), (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 931L)
    public static SubLObject get_syntactic_document_stats_internal(final SubLObject doc_string, final SubLObject timeout_msecs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject utf8 = cycl_string.cycl_string_to_utf8_string(doc_string);
        final SubLObject doc = document.new_document(utf8, (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED);
        SubLObject fragment_count = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        SubLObject sentence_sizes = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        SubLObject sentence_size_percents = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        SubLObject sentence_count = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        final SubLObject link_options = (SubLObject)ConsesLow.list((SubLObject)syntactic_coverage.$kw1$OPTIONS, (SubLObject)ConsesLow.list((SubLObject)syntactic_coverage.$kw2$CYC_LINK_INTERFACE, linkage.$cyc_link_interface$.getDynamicValue(thread), (SubLObject)syntactic_coverage.$kw3$MAX_LINKAGE, (SubLObject)syntactic_coverage.ONE_INTEGER, (SubLObject)syntactic_coverage.$kw4$DICTIONARY_NICKNAME, (SubLObject)syntactic_coverage.$str5$default, (SubLObject)syntactic_coverage.$kw6$MAX_PARSE_TIME, Numbers.divide(timeout_msecs, (SubLObject)syntactic_coverage.$int7$1000)));
        SubLObject timed_out = (SubLObject)syntactic_coverage.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)syntactic_coverage.T, thread);
                SubLObject timer = (SubLObject)syntactic_coverage.NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)syntactic_coverage.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer((SubLObject)((syntactic_coverage.NIL != timeout_msecs) ? Numbers.divide(timeout_msecs, (SubLObject)syntactic_coverage.$int7$1000) : syntactic_coverage.NIL), tag);
                        final SubLObject vector_var = document.document_paragraphs(doc);
                        final SubLObject backwardP_var = (SubLObject)syntactic_coverage.NIL;
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
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)syntactic_coverage.NIL, v_iteration = (SubLObject)syntactic_coverage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)syntactic_coverage.ONE_INTEGER)) {
                            element_num = ((syntactic_coverage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)syntactic_coverage.ONE_INTEGER) : v_iteration);
                            paragraph = Vectors.aref(vector_var, element_num);
                            vector_var_$2 = document.paragraph_sentences(paragraph);
                            backwardP_var_$3 = (SubLObject)syntactic_coverage.NIL;
                            for (length_$4 = Sequences.length(vector_var_$2), v_iteration_$5 = (SubLObject)syntactic_coverage.NIL, v_iteration_$5 = (SubLObject)syntactic_coverage.ZERO_INTEGER; v_iteration_$5.numL(length_$4); v_iteration_$5 = Numbers.add(v_iteration_$5, (SubLObject)syntactic_coverage.ONE_INTEGER)) {
                                element_num_$6 = ((syntactic_coverage.NIL != backwardP_var_$3) ? Numbers.subtract(length_$4, v_iteration_$5, (SubLObject)syntactic_coverage.ONE_INTEGER) : v_iteration_$5);
                                sentence = Vectors.aref(vector_var_$2, element_num_$6);
                                Errors.warn((SubLObject)syntactic_coverage.$str8$_sentence_count___S, sentence_count);
                                ignore_errors_tag = (SubLObject)syntactic_coverage.NIL;
                                try {
                                    thread.throwStack.push(syntactic_coverage.$kw9$IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)syntactic_coverage.$sym10$IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            sentence_string = document.sentence_string(sentence);
                                            v_linkage = linkage.new_linkage(sentence_string, link_options);
                                            thread.resetMultipleValues();
                                            linked_word_count = get_sentence_size(v_linkage);
                                            word_count = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (!linked_word_count.numE(word_count)) {
                                                fragment_count = Numbers.add(fragment_count, (SubLObject)syntactic_coverage.ONE_INTEGER);
                                            }
                                            sentence_sizes = Numbers.add(sentence_sizes, linked_word_count);
                                            sentence_size_percents = Numbers.add(sentence_size_percents, Numbers.divide(linked_word_count, word_count));
                                            Errors.warn((SubLObject)syntactic_coverage.$str11$incing_sentence_count___S, sentence_count);
                                            sentence_count = Numbers.add(sentence_count, (SubLObject)syntactic_coverage.ONE_INTEGER);
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)syntactic_coverage.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)syntactic_coverage.$kw9$IGNORE_ERRORS_TARGET);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                            }
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)syntactic_coverage.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var2) {
            timed_out = Errors.handleThrowable(ccatch_env_var2, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        Errors.warn((SubLObject)syntactic_coverage.$str12$sentence_count___S, sentence_count);
        return (SubLObject)ConsesLow.list((SubLObject)(sentence_count.isPositive() ? Numbers.divide(fragment_count, sentence_count) : syntactic_coverage.ZERO_INTEGER), (SubLObject)(sentence_count.isPositive() ? Numbers.divide(sentence_sizes, sentence_count) : syntactic_coverage.ZERO_INTEGER), (SubLObject)(sentence_count.isPositive() ? Numbers.divide(sentence_size_percents, sentence_count) : syntactic_coverage.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 931L)
    public static SubLObject get_syntactic_document_stats(final SubLObject doc_string, SubLObject timeout_msecs) {
        if (timeout_msecs == syntactic_coverage.UNPROVIDED) {
            timeout_msecs = (SubLObject)syntactic_coverage.NIL;
        }
        SubLObject caching_state = syntactic_coverage.$get_syntactic_document_stats_caching_state$.getGlobalValue();
        if (syntactic_coverage.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)syntactic_coverage.$sym0$GET_SYNTACTIC_DOCUMENT_STATS, (SubLObject)syntactic_coverage.$sym13$_GET_SYNTACTIC_DOCUMENT_STATS_CACHING_STATE_, (SubLObject)syntactic_coverage.NIL, (SubLObject)syntactic_coverage.EQUAL, (SubLObject)syntactic_coverage.TWO_INTEGER, (SubLObject)syntactic_coverage.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(doc_string, timeout_msecs);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)syntactic_coverage.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)syntactic_coverage.NIL;
            collision = cdolist_list_var.first();
            while (syntactic_coverage.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (doc_string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (syntactic_coverage.NIL != cached_args && syntactic_coverage.NIL == cached_args.rest() && timeout_msecs.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_syntactic_document_stats_internal(doc_string, timeout_msecs)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(doc_string, timeout_msecs));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 2455L)
    public static SubLObject get_sentence_size(final SubLObject v_linkage) {
        SubLObject linked_word_count = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        SubLObject word_count = (SubLObject)syntactic_coverage.ZERO_INTEGER;
        SubLObject word = (SubLObject)syntactic_coverage.NIL;
        final SubLObject vector_var = instances.get_slot(v_linkage, (SubLObject)syntactic_coverage.$sym14$WORDS);
        final SubLObject backwardP_var = (SubLObject)syntactic_coverage.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject w;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)syntactic_coverage.NIL, v_iteration = (SubLObject)syntactic_coverage.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)syntactic_coverage.ONE_INTEGER)) {
            element_num = ((syntactic_coverage.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)syntactic_coverage.ONE_INTEGER) : v_iteration);
            w = (word = Vectors.aref(vector_var, element_num));
            if (syntactic_coverage.NIL != methods.funcall_instance_method_with_0_args(word, (SubLObject)syntactic_coverage.$sym15$GET_RIGHT_LINKS) || syntactic_coverage.NIL != methods.funcall_instance_method_with_0_args(word, (SubLObject)syntactic_coverage.$sym16$GET_LEFT_LINKS)) {
                linked_word_count = Numbers.add(linked_word_count, (SubLObject)syntactic_coverage.ONE_INTEGER);
            }
            word_count = Numbers.add(word_count, (SubLObject)syntactic_coverage.ONE_INTEGER);
        }
        return Values.values(linked_word_count, word_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 2848L)
    public static SubLObject simple_semantic_distance(final SubLObject term1, final SubLObject term2, SubLObject max_distance) {
        if (max_distance == syntactic_coverage.UNPROVIDED) {
            max_distance = (SubLObject)syntactic_coverage.THREE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject distances = (syntactic_coverage.NIL != dictionary.dictionary_lookup(syntactic_coverage.$simple_semantic_distance_dict$.getDynamicValue(thread), term1, (SubLObject)syntactic_coverage.UNPROVIDED)) ? dictionary.dictionary_lookup(syntactic_coverage.$simple_semantic_distance_dict$.getDynamicValue(thread), term1, (SubLObject)syntactic_coverage.UNPROVIDED) : dictionary.new_dictionary((SubLObject)syntactic_coverage.EQUAL, (SubLObject)syntactic_coverage.UNPROVIDED);
        SubLObject done = (SubLObject)syntactic_coverage.NIL;
        dictionary.dictionary_enter(distances, term1, (SubLObject)syntactic_coverage.NIL);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)syntactic_coverage.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)syntactic_coverage.T, thread);
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
            for (v_iteration = (SubLObject)syntactic_coverage.NIL, v_iteration = (SubLObject)syntactic_coverage.ZERO_INTEGER; v_iteration.numL(max_distance); v_iteration = Numbers.add(v_iteration, (SubLObject)syntactic_coverage.ONE_INTEGER)) {
                Errors.warn((SubLObject)syntactic_coverage.$str17$at_iteration__S__distances_size__, v_iteration, dictionary.dictionary_length(distances));
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(distances)); syntactic_coverage.NIL == done && syntactic_coverage.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    related_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    path = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (syntactic_coverage.NIL != list_utilities.lengthLE(path, max_distance, (SubLObject)syntactic_coverage.UNPROVIDED)) {
                        pred_var = (SubLObject)syntactic_coverage.NIL;
                        if (syntactic_coverage.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(related_term, (SubLObject)syntactic_coverage.NIL, pred_var)) {
                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(related_term, (SubLObject)syntactic_coverage.NIL, pred_var);
                            done_var = done;
                            token_var = (SubLObject)syntactic_coverage.NIL;
                            while (syntactic_coverage.NIL == done_var) {
                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                if (syntactic_coverage.NIL != valid) {
                                    final_index_iterator = (SubLObject)syntactic_coverage.NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)syntactic_coverage.$kw18$GAF, (SubLObject)syntactic_coverage.NIL, (SubLObject)syntactic_coverage.NIL);
                                        done_var_$9 = done;
                                        token_var_$10 = (SubLObject)syntactic_coverage.NIL;
                                        while (syntactic_coverage.NIL == done_var_$9) {
                                            v_assert = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                            valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(v_assert));
                                            if (syntactic_coverage.NIL != valid_$11) {
                                                args = cycl_utilities.formula_args(v_assert, (SubLObject)syntactic_coverage.$kw19$IGNORE);
                                                for (rest = (SubLObject)syntactic_coverage.NIL, rest = args; syntactic_coverage.NIL == done && syntactic_coverage.NIL != rest; rest = rest.rest()) {
                                                    arg = rest.first();
                                                    thread.resetMultipleValues();
                                                    current_best_known_path = dictionary.dictionary_lookup(distances, arg, (SubLObject)syntactic_coverage.UNPROVIDED);
                                                    pathP = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (syntactic_coverage.NIL == useless_intermediary_nodeP(arg, v_assert) && syntactic_coverage.NIL == subl_promotions.memberP(v_assert, current_best_known_path, (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED) && (syntactic_coverage.NIL == pathP || (syntactic_coverage.NIL != pathP && syntactic_coverage.NIL != list_utilities.lengthL(path, Sequences.length(current_best_known_path), (SubLObject)syntactic_coverage.UNPROVIDED)))) {
                                                        dictionary.dictionary_enter(distances, arg, (SubLObject)ConsesLow.cons(v_assert, path));
                                                        if (arg.equal(term2)) {
                                                            done = (SubLObject)syntactic_coverage.T;
                                                        }
                                                    }
                                                }
                                            }
                                            done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(syntactic_coverage.NIL == valid_$11 || syntactic_coverage.NIL != done);
                                        }
                                    }
                                    finally {
                                        _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)syntactic_coverage.T, thread);
                                            _values = Values.getValuesAsVector();
                                            if (syntactic_coverage.NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                        }
                                    }
                                }
                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(syntactic_coverage.NIL == valid || syntactic_coverage.NIL != done);
                            }
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        Errors.warn((SubLObject)syntactic_coverage.$str20$at_final_iteration__size__S, dictionary.dictionary_length(distances));
        dictionary.dictionary_enter(syntactic_coverage.$simple_semantic_distance_dict$.getDynamicValue(thread), term1, distances);
        return dictionary.dictionary_lookup(distances, term2, (SubLObject)syntactic_coverage.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 4574L)
    public static SubLObject get_useless_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (syntactic_coverage.$get_useless_preds$.getDynamicValue(thread) == syntactic_coverage.$kw21$UNINITIALIZED) {
            final SubLObject init_value = (SubLObject)ConsesLow.list(new SubLObject[] { syntactic_coverage.$const22$nodeInSystem, syntactic_coverage.$const23$quotedIsa, syntactic_coverage.$const24$numberOfResultsThatSupportBinding, syntactic_coverage.$const25$evincesBinding, syntactic_coverage.$const26$synonymousExternalConcept, syntactic_coverage.$const27$definingMt, syntactic_coverage.$const28$lexiconSliceIncludeTerm, syntactic_coverage.$const29$collectionIntersection2, syntactic_coverage.$const30$repatriateToMt, narts_high.nart_substitute((SubLObject)syntactic_coverage.$list31), syntactic_coverage.$const32$rdfURIInNamespace, syntactic_coverage.$const33$properNounSemTrans, syntactic_coverage.$const34$verbSemTrans });
            if (init_value == syntactic_coverage.$kw21$UNINITIALIZED) {
                Errors.error((SubLObject)syntactic_coverage.$str35$Unable_to_initialize__A__, syntactic_coverage.$get_useless_preds$.getDynamicValue(thread));
            }
            syntactic_coverage.$get_useless_preds$.setDynamicValue(init_value, thread);
        }
        return syntactic_coverage.$get_useless_preds$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 4981L)
    public static SubLObject useless_intermediary_nodeP(final SubLObject v_term, final SubLObject v_assert) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term.isNumber() || syntactic_coverage.NIL != fort_types_interface.predicate_p(v_term) || v_term.isString() || syntactic_coverage.NIL != lexicon_accessors.speech_partP(v_term, (SubLObject)syntactic_coverage.UNPROVIDED) || syntactic_coverage.NIL != higher_order_collectionP_cached(v_term) || syntactic_coverage.NIL != conses_high.member(v_term, (SubLObject)syntactic_coverage.$list36, (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED) || syntactic_coverage.NIL != conses_high.member(cycl_utilities.formula_arg0(v_assert), get_useless_preds(), (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 5533L)
    public static SubLObject clear_higher_order_collectionP_cached() {
        final SubLObject cs = syntactic_coverage.$higher_order_collectionP_cached_caching_state$.getGlobalValue();
        if (syntactic_coverage.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)syntactic_coverage.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 5533L)
    public static SubLObject remove_higher_order_collectionP_cached(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(syntactic_coverage.$higher_order_collectionP_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)syntactic_coverage.UNPROVIDED, (SubLObject)syntactic_coverage.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 5533L)
    public static SubLObject higher_order_collectionP_cached_internal(final SubLObject v_term) {
        return builder_utilities.higher_order_collectionP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl/syntactic-coverage.lisp", position = 5533L)
    public static SubLObject higher_order_collectionP_cached(final SubLObject v_term) {
        SubLObject caching_state = syntactic_coverage.$higher_order_collectionP_cached_caching_state$.getGlobalValue();
        if (syntactic_coverage.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)syntactic_coverage.$sym37$HIGHER_ORDER_COLLECTION__CACHED, (SubLObject)syntactic_coverage.$sym38$_HIGHER_ORDER_COLLECTION__CACHED_CACHING_STATE_, (SubLObject)syntactic_coverage.NIL, (SubLObject)syntactic_coverage.EQUAL, (SubLObject)syntactic_coverage.ONE_INTEGER, (SubLObject)syntactic_coverage.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(higher_order_collectionP_cached_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)syntactic_coverage.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_syntactic_coverage_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "clear_get_syntactic_document_stats", "CLEAR-GET-SYNTACTIC-DOCUMENT-STATS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "remove_get_syntactic_document_stats", "REMOVE-GET-SYNTACTIC-DOCUMENT-STATS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "get_syntactic_document_stats_internal", "GET-SYNTACTIC-DOCUMENT-STATS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "get_syntactic_document_stats", "GET-SYNTACTIC-DOCUMENT-STATS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "get_sentence_size", "GET-SENTENCE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "simple_semantic_distance", "SIMPLE-SEMANTIC-DISTANCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "get_useless_preds", "GET-USELESS-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "useless_intermediary_nodeP", "USELESS-INTERMEDIARY-NODE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "clear_higher_order_collectionP_cached", "CLEAR-HIGHER-ORDER-COLLECTION?-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "remove_higher_order_collectionP_cached", "REMOVE-HIGHER-ORDER-COLLECTION?-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "higher_order_collectionP_cached_internal", "HIGHER-ORDER-COLLECTION?-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl.syntactic_coverage", "higher_order_collectionP_cached", "HIGHER-ORDER-COLLECTION?-CACHED", 1, 0, false);
        return (SubLObject)syntactic_coverage.NIL;
    }
    
    public static SubLObject init_syntactic_coverage_file() {
        syntactic_coverage.$get_syntactic_document_stats_caching_state$ = SubLFiles.deflexical("*GET-SYNTACTIC-DOCUMENT-STATS-CACHING-STATE*", (SubLObject)syntactic_coverage.NIL);
        syntactic_coverage.$simple_semantic_distance_dict$ = SubLFiles.defparameter("*SIMPLE-SEMANTIC-DISTANCE-DICT*", dictionary.new_dictionary((SubLObject)syntactic_coverage.EQUAL, (SubLObject)syntactic_coverage.UNPROVIDED));
        syntactic_coverage.$get_useless_preds$ = SubLFiles.defparameter("*GET-USELESS-PREDS*", (SubLObject)syntactic_coverage.$kw21$UNINITIALIZED);
        syntactic_coverage.$higher_order_collectionP_cached_caching_state$ = SubLFiles.deflexical("*HIGHER-ORDER-COLLECTION?-CACHED-CACHING-STATE*", (SubLObject)syntactic_coverage.NIL);
        return (SubLObject)syntactic_coverage.NIL;
    }
    
    public static SubLObject setup_syntactic_coverage_file() {
        memoization_state.note_globally_cached_function((SubLObject)syntactic_coverage.$sym0$GET_SYNTACTIC_DOCUMENT_STATS);
        memoization_state.note_globally_cached_function((SubLObject)syntactic_coverage.$sym37$HIGHER_ORDER_COLLECTION__CACHED);
        return (SubLObject)syntactic_coverage.NIL;
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
        me = (SubLFile)new syntactic_coverage();
        syntactic_coverage.$get_syntactic_document_stats_caching_state$ = null;
        syntactic_coverage.$simple_semantic_distance_dict$ = null;
        syntactic_coverage.$get_useless_preds$ = null;
        syntactic_coverage.$higher_order_collectionP_cached_caching_state$ = null;
        $sym0$GET_SYNTACTIC_DOCUMENT_STATS = SubLObjectFactory.makeSymbol("GET-SYNTACTIC-DOCUMENT-STATS");
        $kw1$OPTIONS = SubLObjectFactory.makeKeyword("OPTIONS");
        $kw2$CYC_LINK_INTERFACE = SubLObjectFactory.makeKeyword("CYC-LINK-INTERFACE");
        $kw3$MAX_LINKAGE = SubLObjectFactory.makeKeyword("MAX-LINKAGE");
        $kw4$DICTIONARY_NICKNAME = SubLObjectFactory.makeKeyword("DICTIONARY-NICKNAME");
        $str5$default = SubLObjectFactory.makeString("default");
        $kw6$MAX_PARSE_TIME = SubLObjectFactory.makeKeyword("MAX-PARSE-TIME");
        $int7$1000 = SubLObjectFactory.makeInteger(1000);
        $str8$_sentence_count___S = SubLObjectFactory.makeString(" sentence-count: ~S");
        $kw9$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym10$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str11$incing_sentence_count___S = SubLObjectFactory.makeString("incing sentence-count: ~S");
        $str12$sentence_count___S = SubLObjectFactory.makeString("sentence-count: ~S");
        $sym13$_GET_SYNTACTIC_DOCUMENT_STATS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-SYNTACTIC-DOCUMENT-STATS-CACHING-STATE*");
        $sym14$WORDS = SubLObjectFactory.makeSymbol("WORDS");
        $sym15$GET_RIGHT_LINKS = SubLObjectFactory.makeSymbol("GET-RIGHT-LINKS");
        $sym16$GET_LEFT_LINKS = SubLObjectFactory.makeSymbol("GET-LEFT-LINKS");
        $str17$at_iteration__S__distances_size__ = SubLObjectFactory.makeString("at iteration ~S, distances size=~S");
        $kw18$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw19$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $str20$at_final_iteration__size__S = SubLObjectFactory.makeString("at final iteration, size=~S");
        $kw21$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $const22$nodeInSystem = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nodeInSystem"));
        $const23$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const24$numberOfResultsThatSupportBinding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberOfResultsThatSupportBinding"));
        $const25$evincesBinding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evincesBinding"));
        $const26$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $const27$definingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingMt"));
        $const28$lexiconSliceIncludeTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lexiconSliceIncludeTerm"));
        $const29$collectionIntersection2 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionIntersection2"));
        $const30$repatriateToMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("repatriateToMt"));
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypicallyComparesToWRTSlotFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("widthOfObject")));
        $const32$rdfURIInNamespace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfURIInNamespace"));
        $const33$properNounSemTrans = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("properNounSemTrans"));
        $const34$verbSemTrans = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTrans"));
        $str35$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $list36 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FACToryIrrelevantTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonHumanAnimal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetOrCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplanationWorthyConcept")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdultAnimal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdultMaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("projectMonthlyAssignments")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requestingAgent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalSpecies")) });
        $sym37$HIGHER_ORDER_COLLECTION__CACHED = SubLObjectFactory.makeSymbol("HIGHER-ORDER-COLLECTION?-CACHED");
        $sym38$_HIGHER_ORDER_COLLECTION__CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HIGHER-ORDER-COLLECTION?-CACHED-CACHING-STATE*");
    }
}

/*

	Total time: 194 ms
	
*/