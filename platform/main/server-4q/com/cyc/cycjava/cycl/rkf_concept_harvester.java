package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_concept_harvester extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_concept_harvester();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_harvester";

    public static final String myFingerPrint = "dae104ea522351f368fd51258e11e85754168376c98ea0c9cb4871f6260335b6";







    // defparameter
    // The method to use for Template Parses
    public static final SubLSymbol $rkf_ch_template_parses_method$ = makeSymbol("*RKF-CH-TEMPLATE-PARSES-METHOD*");





    public static final SubLList $list1 = list(makeSymbol("TOKEN-LIST"), makeSymbol("CYCL-LIST"));

    public static final SubLSymbol $sym2$TERM__ = makeSymbol("TERM-<");



    public static final SubLSymbol $sym4$_ = makeSymbol(">");

    public static final SubLSymbol FIRST_LENGTH = makeSymbol("FIRST-LENGTH");









    public static final SubLSymbol RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED = makeSymbol("RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED");

    public static final SubLSymbol $rkf_ch_string_tokenize_internal_cached_caching_state$ = makeSymbol("*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*");





    private static final SubLObject $$TheResultOfParsing = reader_make_constant_shell(makeString("TheResultOfParsing"));

    private static final SubLSymbol RKF_CH_PARSING_SURROGATE_P = makeSymbol("RKF-CH-PARSING-SURROGATE-P");

    private static final SubLSymbol RKF_CH_ASSEMBLE_PHRASE_P = makeSymbol("RKF-CH-ASSEMBLE-PHRASE-P");

    private static final SubLSymbol RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE = makeSymbol("RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE");

    private static final SubLObject $$AssemblePhraseFn = reader_make_constant_shell(makeString("AssemblePhraseFn"));

    private static final SubLList $list19 = cons(makeSymbol("ASSEMBLE-PHRASE-FN"), makeSymbol("STRING-PARTS"));

    private static final SubLString $str20$ = makeString("");

    private static final SubLString $$$_ = makeString(" ");





    private static final SubLList $list24 = list(makeSymbol("INDEX-LIST"), makeSymbol("CYCL-LIST"));

    private static final SubLSymbol RKF_CH_INCLUDES_INVALID_SURROGATE = makeSymbol("RKF-CH-INCLUDES-INVALID-SURROGATE");



    private static final SubLSymbol RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL = makeSymbol("RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL");

    private static final SubLSymbol $rkf_all_concept_harvester_methods$ = makeSymbol("*RKF-ALL-CONCEPT-HARVESTER-METHODS*");

    private static final SubLSymbol $rkf_active_concept_harvester_methods$ = makeSymbol("*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*");



    private static final SubLSymbol RKF_CH_CYC_CONSTANTS = makeSymbol("RKF-CH-CYC-CONSTANTS");

    private static final SubLString $str32$Explicit_Cyc_constant_references_ = makeString("Explicit Cyc constant references like #$Dog.  Useful for pseudo-CycL and testing.");

    private static final SubLSymbol RKF_CH_INTEGERS = makeSymbol("RKF-CH-INTEGERS");

    private static final SubLString $str34$Numbers_in_the_text___Examples___ = makeString("Numbers in the text.  Examples :  7,  -1, 0, 42, 1776 3.14 etc.");

    private static final SubLSymbol RKF_CH_DENOTS_OF_STRING = makeSymbol("RKF-CH-DENOTS-OF-STRING");

    private static final SubLString $str36$Denotations_of_individual_words_i = makeString("Denotations of individual words in the text.");

    private static final SubLSymbol RKF_CH_MULTI_WORD_DENOTATION = makeSymbol("RKF-CH-MULTI-WORD-DENOTATION");

    private static final SubLString $str38$Denotations_for_the_entire_text_i = makeString("Denotations for the entire text if it is a multi-word phrase.  Best for clarifications.");

    private static final SubLSymbol RKF_CH_NOUN_COMPOUND_PHRASES = makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASES");

    private static final SubLString $str40$Multi_word_phrases_from_the_lexic = makeString("Multi-word phrases from the lexicon.");

    private static final SubLSymbol RKF_CH_NOUN_PHRASE_PARSES = makeSymbol("RKF-CH-NOUN-PHRASE-PARSES");

    private static final SubLString $str42$Noun_phrases_identified_using_a_n = makeString("Noun phrases identified using a noun-phrase parser");

    private static final SubLSymbol RKF_CH_TEMPLATE_PARSES = makeSymbol("RKF-CH-TEMPLATE-PARSES");

    private static final SubLString $str44$Phrases_interpreted_by_a_Template = makeString("Phrases interpreted by a Template Parser");

    private static final SubLSymbol ITP_SEQUEL = makeSymbol("ITP-SEQUEL");

    private static final SubLSymbol $rkf_ch_template_parse_cache$ = makeSymbol("*RKF-CH-TEMPLATE-PARSE-CACHE*");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLString $str50$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLList $list52 = list(makeSymbol("SENTENCE"), makeSymbol("HARVEST-SPECS"));

    public static final SubLList $list53 = list(makeSymbol("INDEX-LIST"), makeSymbol("CYCL"));

    public static SubLObject rkf_concept_harvester(final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        final SubLObject v_methods = rkf_active_concept_harvester_methods();
        SubLObject harvests = NIL;
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (method.isSymbol() && (NIL != fboundp(method))) {
                harvests = cons(funcall(method, text), harvests);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        harvests = nreverse(harvests);
        SubLObject harvest = rkf_ch_unify_harvests(harvests);
        harvest = rkf_ch_filter_invalid_surrogates(harvest);
        return harvest;
    }

    public static SubLObject rkf_ch_unify_harvests(final SubLObject harvests) {
        final SubLObject token_table = make_hash_table(TWENTY_INTEGER, symbol_function(EQUAL), UNPROVIDED);
        SubLObject cdolist_list_var = harvests;
        SubLObject harvest = NIL;
        harvest = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = harvest;
            SubLObject harvest_item = NIL;
            harvest_item = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                SubLObject current;
                final SubLObject datum = current = harvest_item;
                SubLObject token_list = NIL;
                SubLObject cycl_list = NIL;
                destructuring_bind_must_consp(current, datum, $list1);
                token_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list1);
                cycl_list = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject existing = gethash(token_list, token_table, UNPROVIDED);
                    SubLObject cdolist_list_var_$2 = cycl_list;
                    SubLObject cycl = NIL;
                    cycl = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject item_var;
                        cycl = item_var = narts_high.nart_expand(cycl);
                        if (NIL == member(item_var, existing, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            existing = cons(item_var, existing);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        cycl = cdolist_list_var_$2.first();
                    } 
                    sethash(token_list, token_table, existing);
                } else {
                    cdestructuring_bind_error(datum, $list1);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                harvest_item = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            harvest = cdolist_list_var.first();
        } 
        SubLObject unified_harvest = NIL;
        SubLObject token_list2 = NIL;
        SubLObject cycl_list2 = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(token_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                token_list2 = getEntryKey(cdohash_entry);
                cycl_list2 = getEntryValue(cdohash_entry);
                cycl_list2 = rkf_ch_sort_cycl_terms(cycl_list2);
                unified_harvest = cons(list(token_list2, cycl_list2), unified_harvest);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        unified_harvest = Sort.sort(unified_harvest, symbol_function($sym2$TERM__), symbol_function(CAAR));
        unified_harvest = Sort.stable_sort(unified_harvest, symbol_function($sym4$_), symbol_function(FIRST_LENGTH));
        return unified_harvest;
    }

    public static SubLObject first_length(final SubLObject v_object) {
        return length(v_object.first());
    }

    public static SubLObject rkf_ch_sort_cycl_terms(final SubLObject terms) {
        SubLObject v_forts = list_utilities.remove_if_not(symbol_function(FORT_P), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject non_forts = remove_if(symbol_function(FORT_P), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject conses = remove_if(symbol_function(ATOM), non_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject atoms = remove_if(symbol_function(CONSP), non_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        atoms = Sort.sort(atoms, symbol_function($sym2$TERM__), UNPROVIDED);
        v_forts = Sort.sort(v_forts, symbol_function($sym4$_), symbol_function(NUM_INDEX));
        conses = Sort.sort(conses, symbol_function($sym2$TERM__), UNPROVIDED);
        return nconc(atoms, v_forts, conses);
    }

    public static SubLObject rkf_ch_string_tokenize(final SubLObject string) {
        return rkf_ch_string_tokenize_internal_cached(string);
    }

    public static SubLObject rkf_ch_raw_tokenization(final SubLObject string) {
        return standard_tokenization.standard_raw_tokenization(string);
    }

    public static SubLObject rkf_ch_token_chunker(final SubLObject raw_tokenization) {
        return standard_tokenization.standard_token_chunker(raw_tokenization);
    }

    public static SubLObject clear_rkf_ch_string_tokenize_internal_cached() {
        final SubLObject cs = $rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rkf_ch_string_tokenize_internal_cached(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ch_string_tokenize_internal_cached_internal(final SubLObject string) {
        return rkf_ch_string_tokenize_internal(string);
    }

    public static SubLObject rkf_ch_string_tokenize_internal_cached(final SubLObject string) {
        SubLObject caching_state = $rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED, $rkf_ch_string_tokenize_internal_cached_caching_state$, $int$1000, EQUAL, ONE_INTEGER, $int$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rkf_ch_string_tokenize_internal_cached_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rkf_ch_string_tokenize_internal(final SubLObject string) {
        final SubLObject raw_tokenization = rkf_ch_raw_tokenization(string);
        final SubLObject chunked_tokenization = rkf_ch_token_chunker(raw_tokenization);
        return chunked_tokenization;
    }

    public static SubLObject rkf_ch_parsing_surrogate_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $$TheResultOfParsing.eql(v_object.first()));
    }

    public static SubLObject rkf_ch_gather_parsing_surrogates(final SubLObject v_object) {
        return list_utilities.tree_gather(v_object, symbol_function(RKF_CH_PARSING_SURROGATE_P), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ch_parsing_surrogate_token_index_list(final SubLObject surrogate) {
        return cycl_utilities.formula_args(cycl_utilities.formula_arg2(surrogate, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject rkf_ch_simplify_assemble_phrases(final SubLObject v_object) {
        return values(transform_list_utilities.transform(v_object, symbol_function(RKF_CH_ASSEMBLE_PHRASE_P), symbol_function(RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE), UNPROVIDED));
    }

    public static SubLObject rkf_ch_assemble_phrase_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && $$AssemblePhraseFn.eql(v_object.first()));
    }

    public static SubLObject rkf_ch_simplify_one_assemble_phrase(final SubLObject v_object) {
        SubLObject assemble_phrase_fn = NIL;
        SubLObject string_parts = NIL;
        destructuring_bind_must_consp(v_object, v_object, $list19);
        assemble_phrase_fn = v_object.first();
        final SubLObject current = string_parts = v_object.rest();
        if (NIL == string_parts) {
            return $str20$;
        }
        if (NIL != list_utilities.singletonP(string_parts)) {
            return string_parts.first();
        }
        SubLObject new_string_parts = NIL;
        SubLObject cdolist_list_var = string_parts;
        SubLObject string_part = NIL;
        string_part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!string_part.eql(string_parts.first())) {
                new_string_parts = cons($$$_, new_string_parts);
            }
            new_string_parts = cons(string_part, new_string_parts);
            cdolist_list_var = cdolist_list_var.rest();
            string_part = cdolist_list_var.first();
        } 
        new_string_parts = nreverse(new_string_parts);
        return apply(symbol_function(CCONCATENATE), new_string_parts);
    }

    public static SubLObject rkf_ch_filter_invalid_surrogates(SubLObject harvest) {
        for (SubLObject invalid_surrogates = rkf_ch_gather_invalid_surrogates(harvest); NIL != invalid_surrogates; invalid_surrogates = rkf_ch_gather_invalid_surrogates(harvest)) {
            harvest = rkf_ch_delete_invalid_surrogates(harvest, invalid_surrogates);
        }
        return harvest;
    }

    public static SubLObject rkf_ch_gather_invalid_surrogates(final SubLObject harvest) {
        final SubLObject valid_harvest_token_index_lists = Mapping.mapcar(symbol_function(FIRST), harvest);
        SubLObject invalid_surrogates = NIL;
        SubLObject cdolist_list_var = harvest;
        SubLObject harvest_item = NIL;
        harvest_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = harvest_item;
            SubLObject index_list = NIL;
            SubLObject cycl_list = NIL;
            destructuring_bind_must_consp(current, datum, $list24);
            index_list = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list24);
            cycl_list = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$3 = cycl_list;
                SubLObject cycl = NIL;
                cycl = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    SubLObject cdolist_list_var_$4;
                    final SubLObject surrogates = cdolist_list_var_$4 = rkf_ch_gather_parsing_surrogates(cycl);
                    SubLObject surrogate = NIL;
                    surrogate = cdolist_list_var_$4.first();
                    while (NIL != cdolist_list_var_$4) {
                        final SubLObject token_index_list = rkf_ch_parsing_surrogate_token_index_list(surrogate);
                        if (NIL == subl_promotions.memberP(token_index_list, valid_harvest_token_index_lists, symbol_function(EQUAL), UNPROVIDED)) {
                            final SubLObject item_var = surrogate;
                            if (NIL == member(item_var, invalid_surrogates, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                invalid_surrogates = cons(item_var, invalid_surrogates);
                            }
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        surrogate = cdolist_list_var_$4.first();
                    } 
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    cycl = cdolist_list_var_$3.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            harvest_item = cdolist_list_var.first();
        } 
        return nreverse(invalid_surrogates);
    }

    public static SubLObject rkf_ch_delete_invalid_surrogates(SubLObject harvest, final SubLObject invalid_surrogates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        try {
            $mapping_target$.bind(invalid_surrogates, thread);
            SubLObject cdolist_list_var = harvest;
            SubLObject harvest_item = NIL;
            harvest_item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = harvest_item;
                SubLObject index_list = NIL;
                SubLObject cycl_list = NIL;
                destructuring_bind_must_consp(current, datum, $list24);
                index_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list24);
                cycl_list = current.first();
                current = current.rest();
                if (NIL == current) {
                    set_nth(ONE_INTEGER, harvest_item, delete_if(symbol_function(RKF_CH_INCLUDES_INVALID_SURROGATE), cycl_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else {
                    cdestructuring_bind_error(datum, $list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                harvest_item = cdolist_list_var.first();
            } 
        } finally {
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        harvest = delete(NIL, harvest, symbol_function(EQL), symbol_function(SECOND), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return harvest;
    }

    public static SubLObject rkf_ch_includes_invalid_surrogate(final SubLObject v_object) {
        return list_utilities.tree_find_if(symbol_function(RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL), v_object, UNPROVIDED);
    }

    public static SubLObject rkf_ch_includes_invalid_surrogate_internal(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $mapping_target$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject rkf_all_concept_harvester_methods() {
        return nreverse(Mapping.mapcar(symbol_function(FIRST), $rkf_all_concept_harvester_methods$.getGlobalValue()));
    }

    public static SubLObject rkf_register_concept_harvester_method(final SubLObject symbol, final SubLObject description) {
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        assert NIL != stringp(description) : "Types.stringp(description) " + "CommonSymbols.NIL != Types.stringp(description) " + description;
        rkf_deregister_concept_harvester_method(symbol);
        $rkf_all_concept_harvester_methods$.setGlobalValue(cons(list(symbol, description), $rkf_all_concept_harvester_methods$.getGlobalValue()));
        return symbol;
    }

    public static SubLObject rkf_deregister_concept_harvester_method(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        $rkf_all_concept_harvester_methods$.setGlobalValue(delete(symbol, $rkf_all_concept_harvester_methods$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return symbol;
    }

    public static SubLObject rkf_concept_harvester_method_description(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        return second(assoc(symbol, $rkf_all_concept_harvester_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_active_concept_harvester_methods() {
        return nreverse(remove_duplicates(copy_list($rkf_active_concept_harvester_methods$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_note_active_concept_harvester_method(final SubLObject method) {
        if (NIL != find(method, $rkf_all_concept_harvester_methods$.getGlobalValue(), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED)) {
            $rkf_active_concept_harvester_methods$.setGlobalValue(cons(method, $rkf_active_concept_harvester_methods$.getGlobalValue()));
        }
        return method;
    }

    public static SubLObject rkf_set_active_concept_harvester_methods(final SubLObject v_methods) {
        $rkf_active_concept_harvester_methods$.setGlobalValue(NIL);
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_note_active_concept_harvester_method(method);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return length($rkf_active_concept_harvester_methods$.getGlobalValue());
    }

    public static SubLObject rkf_ch_cyc_constants(final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.string_starts_with_constant_reader_prefix_p(token)) {
                final SubLObject constant = constant_completion_high.constant_complete_exact(token, TWO_INTEGER, UNPROVIDED);
                if (NIL != valid_constantP(constant, UNPROVIDED)) {
                    harvest = cons(list(list(index), list(constant)), harvest);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(harvest);
    }

    public static SubLObject rkf_ch_integers(final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject number = number_utilities.number_string_value(token);
            if (number.isNumber()) {
                harvest = cons(list(list(index), list(number)), harvest);
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(harvest);
    }

    public static SubLObject rkf_ch_denots_of_string(final SubLObject text, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return rkf_ch_denotations_for_string(text, mt, UNPROVIDED);
    }

    public static SubLObject rkf_ch_denotations_for_string(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject possible_cycl = rkf_ch_denots_of_string_internal(token, mt, pos);
            if (NIL != possible_cycl) {
                final SubLObject item_var = list(list(index), possible_cycl);
                if (NIL == member(item_var, harvest, symbol_function(EQL), symbol_function(IDENTITY))) {
                    harvest = cons(item_var, harvest);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(harvest);
    }

    public static SubLObject rkf_ch_denots_of_string_internal(final SubLObject token, final SubLObject mt, final SubLObject pos) {
        if (NIL == rkf_ch_denots_of_string_stop_word(token)) {
            SubLObject result = NIL;
            if (!length(token).numL(TWO_INTEGER)) {
                if (NIL == mt) {
                    result = lexicon_accessors.all_parsing_denots_of_string(token, T, UNPROVIDED, UNPROVIDED);
                } else {
                    result = lexicon_accessors.all_parsing_denots_of_string(token, T, mt, UNPROVIDED);
                }
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject rkf_ch_denots_of_string_stop_word(final SubLObject token) {
        return lexicon_utilities.denots_of_string_stop_word(token);
    }

    public static SubLObject rkf_ch_multi_word_denotation(final SubLObject text) {
        return rkf_ch_denotations_from_multi_word_string(text, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ch_denotations_from_multi_word_string(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        if (NIL == list_utilities.singletonP(tokens)) {
            final SubLObject complete_denotations = rkf_ch_denotations_int(text, mt);
            if (NIL != complete_denotations) {
                final SubLObject token_list = parsing_utilities.token_list_from_span(ZERO_INTEGER, length(tokens));
                harvest = list(list(token_list, complete_denotations));
            }
        }
        return harvest;
    }

    public static SubLObject rkf_ch_denotations_int(final SubLObject text, final SubLObject mt) {
        SubLObject denotations = NIL;
        if (NIL == mt) {
            denotations = lexicon_accessors.all_parsing_denots_of_string(text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            denotations = lexicon_accessors.all_parsing_denots_of_string(text, T, mt, UNPROVIDED);
        }
        return denotations;
    }

    public static SubLObject rkf_ch_noun_compound_phrases(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        if (NIL == mt) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject interval_tokens = cdolist_list_var = (NIL != nl_trie.nl_trie_presentP(UNPROVIDED)) ? np_parser.npp_sentence_tokenize(text, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
            SubLObject interval_token = NIL;
            interval_token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject parse = standard_tokenization.interval_token_value(interval_token);
                final SubLObject denots = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), standard_tokenization.string_token_value(parse)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != denots) {
                    final SubLObject start_index = standard_tokenization.interval_token_start(interval_token);
                    final SubLObject end_index = standard_tokenization.interval_token_end(interval_token);
                    final SubLObject span_length = subtract(end_index, start_index);
                    if (!span_length.numL(TWO_INTEGER)) {
                        final SubLObject index_list = parsing_utilities.token_list_from_span(start_index, end_index);
                        harvest = cons(list(index_list, denots), harvest);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                interval_token = cdolist_list_var.first();
            } 
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(harvest);
    }

    public static SubLObject rkf_ch_noun_compound_phrase_parser(final SubLObject text, final SubLObject mt, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        return rkf_ch_noun_compound_phrases(text, mt, pos);
    }

    public static SubLObject rkf_ch_noun_phrase_parses(final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        harvest = psp_main.ps_harvest_nps(text, T, UNPROVIDED);
        return harvest;
    }

    public static SubLObject rkf_ch_template_parses(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject harvest = NIL;
        if ($rkf_ch_template_parses_method$.getDynamicValue(thread).isFunctionSpec()) {
            harvest = funcall($rkf_ch_template_parses_method$.getDynamicValue(thread), text);
        }
        return harvest;
    }

    public static SubLObject rkf_ch_template_parse_cache_lookup(final SubLObject text) {
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        if (NIL != $rkf_ch_template_parse_cache$.getGlobalValue()) {
            final SubLObject tokens = rkf_ch_string_tokenize(text);
            final SubLObject harvest = gethash(tokens, $rkf_ch_template_parse_cache$.getGlobalValue(), NIL);
            return copy_tree(harvest);
        }
        return NIL;
    }

    public static SubLObject rkf_ch_initialize_template_parse_cache(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if (NIL != Filesys.probe_file(filename)) {
            SubLObject cache_items = NIL;
            SubLObject cache_item = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(filename, $INPUT);
                            if (!stream.isStream()) {
                                Errors.error($str50$Unable_to_open__S, filename);
                            }
                            final SubLObject stream_$5 = stream;
                            while ($EOF != cache_item) {
                                cache_item = read(stream_$5, NIL, $EOF, UNPROVIDED);
                                if ($EOF != cache_item) {
                                    cache_items = cons(cache_item, cache_items);
                                }
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
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
            if (NIL != cache_items) {
                final SubLObject v_cache = make_hash_table(length(cache_items), symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = cache_items;
                SubLObject cache_item_$7 = NIL;
                cache_item_$7 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cache_item_$7;
                    SubLObject sentence = NIL;
                    SubLObject harvest_specs = NIL;
                    destructuring_bind_must_consp(current, datum, $list52);
                    sentence = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list52);
                    harvest_specs = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject harvest = NIL;
                        final SubLObject tokens = rkf_ch_string_tokenize(sentence);
                        SubLObject cdolist_list_var_$8 = harvest_specs;
                        SubLObject harvest_spec = NIL;
                        harvest_spec = cdolist_list_var_$8.first();
                        while (NIL != cdolist_list_var_$8) {
                            SubLObject current_$10;
                            final SubLObject datum_$9 = current_$10 = harvest_spec;
                            SubLObject index_list = NIL;
                            SubLObject cycl = NIL;
                            destructuring_bind_must_consp(current_$10, datum_$9, $list53);
                            index_list = current_$10.first();
                            current_$10 = current_$10.rest();
                            destructuring_bind_must_consp(current_$10, datum_$9, $list53);
                            cycl = current_$10.first();
                            current_$10 = current_$10.rest();
                            if (NIL == current_$10) {
                                harvest = cons(list(index_list, list(cycl)), harvest);
                            } else {
                                cdestructuring_bind_error(datum_$9, $list53);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            harvest_spec = cdolist_list_var_$8.first();
                        } 
                        harvest = nreverse(harvest);
                        sethash(tokens, v_cache, harvest);
                    } else {
                        cdestructuring_bind_error(datum, $list52);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_item_$7 = cdolist_list_var.first();
                } 
                $rkf_ch_template_parse_cache$.setGlobalValue(v_cache);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject declare_rkf_concept_harvester_file() {
        declareFunction(me, "rkf_concept_harvester", "RKF-CONCEPT-HARVESTER", 1, 0, false);
        declareFunction(me, "rkf_ch_unify_harvests", "RKF-CH-UNIFY-HARVESTS", 1, 0, false);
        declareFunction(me, "first_length", "FIRST-LENGTH", 1, 0, false);
        declareFunction(me, "rkf_ch_sort_cycl_terms", "RKF-CH-SORT-CYCL-TERMS", 1, 0, false);
        declareFunction(me, "rkf_ch_string_tokenize", "RKF-CH-STRING-TOKENIZE", 1, 0, false);
        declareFunction(me, "rkf_ch_raw_tokenization", "RKF-CH-RAW-TOKENIZATION", 1, 0, false);
        declareFunction(me, "rkf_ch_token_chunker", "RKF-CH-TOKEN-CHUNKER", 1, 0, false);
        declareFunction(me, "clear_rkf_ch_string_tokenize_internal_cached", "CLEAR-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 0, 0, false);
        declareFunction(me, "remove_rkf_ch_string_tokenize_internal_cached", "REMOVE-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false);
        declareFunction(me, "rkf_ch_string_tokenize_internal_cached_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "rkf_ch_string_tokenize_internal_cached", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false);
        declareFunction(me, "rkf_ch_string_tokenize_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL", 1, 0, false);
        declareFunction(me, "rkf_ch_parsing_surrogate_p", "RKF-CH-PARSING-SURROGATE-P", 1, 0, false);
        declareFunction(me, "rkf_ch_gather_parsing_surrogates", "RKF-CH-GATHER-PARSING-SURROGATES", 1, 0, false);
        declareFunction(me, "rkf_ch_parsing_surrogate_token_index_list", "RKF-CH-PARSING-SURROGATE-TOKEN-INDEX-LIST", 1, 0, false);
        declareFunction(me, "rkf_ch_simplify_assemble_phrases", "RKF-CH-SIMPLIFY-ASSEMBLE-PHRASES", 1, 0, false);
        declareFunction(me, "rkf_ch_assemble_phrase_p", "RKF-CH-ASSEMBLE-PHRASE-P", 1, 0, false);
        declareFunction(me, "rkf_ch_simplify_one_assemble_phrase", "RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE", 1, 0, false);
        declareFunction(me, "rkf_ch_filter_invalid_surrogates", "RKF-CH-FILTER-INVALID-SURROGATES", 1, 0, false);
        declareFunction(me, "rkf_ch_gather_invalid_surrogates", "RKF-CH-GATHER-INVALID-SURROGATES", 1, 0, false);
        declareFunction(me, "rkf_ch_delete_invalid_surrogates", "RKF-CH-DELETE-INVALID-SURROGATES", 2, 0, false);
        declareFunction(me, "rkf_ch_includes_invalid_surrogate", "RKF-CH-INCLUDES-INVALID-SURROGATE", 1, 0, false);
        declareFunction(me, "rkf_ch_includes_invalid_surrogate_internal", "RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL", 1, 0, false);
        declareFunction(me, "rkf_all_concept_harvester_methods", "RKF-ALL-CONCEPT-HARVESTER-METHODS", 0, 0, false);
        declareFunction(me, "rkf_register_concept_harvester_method", "RKF-REGISTER-CONCEPT-HARVESTER-METHOD", 2, 0, false);
        declareFunction(me, "rkf_deregister_concept_harvester_method", "RKF-DEREGISTER-CONCEPT-HARVESTER-METHOD", 1, 0, false);
        declareFunction(me, "rkf_concept_harvester_method_description", "RKF-CONCEPT-HARVESTER-METHOD-DESCRIPTION", 1, 0, false);
        declareFunction(me, "rkf_active_concept_harvester_methods", "RKF-ACTIVE-CONCEPT-HARVESTER-METHODS", 0, 0, false);
        declareFunction(me, "rkf_note_active_concept_harvester_method", "RKF-NOTE-ACTIVE-CONCEPT-HARVESTER-METHOD", 1, 0, false);
        declareFunction(me, "rkf_set_active_concept_harvester_methods", "RKF-SET-ACTIVE-CONCEPT-HARVESTER-METHODS", 1, 0, false);
        declareFunction(me, "rkf_ch_cyc_constants", "RKF-CH-CYC-CONSTANTS", 1, 0, false);
        declareFunction(me, "rkf_ch_integers", "RKF-CH-INTEGERS", 1, 0, false);
        declareFunction(me, "rkf_ch_denots_of_string", "RKF-CH-DENOTS-OF-STRING", 1, 1, false);
        declareFunction(me, "rkf_ch_denotations_for_string", "RKF-CH-DENOTATIONS-FOR-STRING", 1, 2, false);
        declareFunction(me, "rkf_ch_denots_of_string_internal", "RKF-CH-DENOTS-OF-STRING-INTERNAL", 3, 0, false);
        declareFunction(me, "rkf_ch_denots_of_string_stop_word", "RKF-CH-DENOTS-OF-STRING-STOP-WORD", 1, 0, false);
        declareFunction(me, "rkf_ch_multi_word_denotation", "RKF-CH-MULTI-WORD-DENOTATION", 1, 0, false);
        declareFunction(me, "rkf_ch_denotations_from_multi_word_string", "RKF-CH-DENOTATIONS-FROM-MULTI-WORD-STRING", 1, 2, false);
        declareFunction(me, "rkf_ch_denotations_int", "RKF-CH-DENOTATIONS-INT", 2, 0, false);
        declareFunction(me, "rkf_ch_noun_compound_phrases", "RKF-CH-NOUN-COMPOUND-PHRASES", 1, 2, false);
        declareFunction(me, "rkf_ch_noun_compound_phrase_parser", "RKF-CH-NOUN-COMPOUND-PHRASE-PARSER", 2, 1, false);
        declareFunction(me, "rkf_ch_noun_phrase_parses", "RKF-CH-NOUN-PHRASE-PARSES", 1, 0, false);
        declareFunction(me, "rkf_ch_template_parses", "RKF-CH-TEMPLATE-PARSES", 1, 0, false);
        declareFunction(me, "rkf_ch_template_parse_cache_lookup", "RKF-CH-TEMPLATE-PARSE-CACHE-LOOKUP", 1, 0, false);
        declareFunction(me, "rkf_ch_initialize_template_parse_cache", "RKF-CH-INITIALIZE-TEMPLATE-PARSE-CACHE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_concept_harvester_file() {
        deflexical("*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*", NIL);
        deflexical("*RKF-ALL-CONCEPT-HARVESTER-METHODS*", SubLTrampolineFile.maybeDefault($rkf_all_concept_harvester_methods$, $rkf_all_concept_harvester_methods$, NIL));
        deflexical("*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*", SubLTrampolineFile.maybeDefault($rkf_active_concept_harvester_methods$, $rkf_active_concept_harvester_methods$, NIL));
        defparameter("*RKF-CH-TEMPLATE-PARSES-METHOD*", ITP_SEQUEL);
        deflexical("*RKF-CH-TEMPLATE-PARSE-CACHE*", SubLTrampolineFile.maybeDefault($rkf_ch_template_parse_cache$, $rkf_ch_template_parse_cache$, NIL));
        return NIL;
    }

    public static SubLObject setup_rkf_concept_harvester_file() {
        memoization_state.note_globally_cached_function(RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED);
        declare_defglobal($rkf_all_concept_harvester_methods$);
        declare_defglobal($rkf_active_concept_harvester_methods$);
        rkf_register_concept_harvester_method(RKF_CH_CYC_CONSTANTS, $str32$Explicit_Cyc_constant_references_);
        rkf_note_active_concept_harvester_method(RKF_CH_CYC_CONSTANTS);
        rkf_register_concept_harvester_method(RKF_CH_INTEGERS, $str34$Numbers_in_the_text___Examples___);
        rkf_note_active_concept_harvester_method(RKF_CH_INTEGERS);
        rkf_register_concept_harvester_method(RKF_CH_DENOTS_OF_STRING, $str36$Denotations_of_individual_words_i);
        rkf_note_active_concept_harvester_method(RKF_CH_DENOTS_OF_STRING);
        rkf_register_concept_harvester_method(RKF_CH_MULTI_WORD_DENOTATION, $str38$Denotations_for_the_entire_text_i);
        rkf_note_active_concept_harvester_method(RKF_CH_MULTI_WORD_DENOTATION);
        rkf_register_concept_harvester_method(RKF_CH_NOUN_COMPOUND_PHRASES, $str40$Multi_word_phrases_from_the_lexic);
        rkf_note_active_concept_harvester_method(RKF_CH_NOUN_COMPOUND_PHRASES);
        rkf_register_concept_harvester_method(RKF_CH_NOUN_PHRASE_PARSES, $str42$Noun_phrases_identified_using_a_n);
        rkf_note_active_concept_harvester_method(RKF_CH_NOUN_PHRASE_PARSES);
        rkf_register_concept_harvester_method(RKF_CH_TEMPLATE_PARSES, $str44$Phrases_interpreted_by_a_Template);
        rkf_note_active_concept_harvester_method(RKF_CH_TEMPLATE_PARSES);
        declare_defglobal($rkf_ch_template_parse_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_concept_harvester_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_concept_harvester_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_concept_harvester_file();
    }

    
}

/**
 * Total time: 233 ms
 */
