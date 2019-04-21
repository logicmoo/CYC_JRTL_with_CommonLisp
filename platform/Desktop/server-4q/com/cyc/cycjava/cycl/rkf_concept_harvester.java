package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_concept_harvester extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_harvester";
    public static final String myFingerPrint = "dae104ea522351f368fd51258e11e85754168376c98ea0c9cb4871f6260335b6";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
    private static SubLSymbol $rkf_ch_string_tokenize_internal_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7572L)
    private static SubLSymbol $rkf_all_concept_harvester_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7876L)
    private static SubLSymbol $rkf_active_concept_harvester_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16190L)
    public static SubLSymbol $rkf_ch_template_parses_method$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16653L)
    private static SubLSymbol $rkf_ch_template_parse_cache$;
    private static final SubLSymbol $sym0$STRINGP;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$TERM__;
    private static final SubLSymbol $sym3$CAAR;
    private static final SubLSymbol $sym4$_;
    private static final SubLSymbol $sym5$FIRST_LENGTH;
    private static final SubLSymbol $sym6$FORT_P;
    private static final SubLSymbol $sym7$ATOM;
    private static final SubLSymbol $sym8$CONSP;
    private static final SubLSymbol $sym9$NUM_INDEX;
    private static final SubLSymbol $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED;
    private static final SubLSymbol $sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_;
    private static final SubLInteger $int12$1000;
    private static final SubLInteger $int13$100;
    private static final SubLObject $const14$TheResultOfParsing;
    private static final SubLSymbol $sym15$RKF_CH_PARSING_SURROGATE_P;
    private static final SubLSymbol $sym16$RKF_CH_ASSEMBLE_PHRASE_P;
    private static final SubLSymbol $sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE;
    private static final SubLObject $const18$AssemblePhraseFn;
    private static final SubLList $list19;
    private static final SubLString $str20$;
    private static final SubLString $str21$_;
    private static final SubLSymbol $sym22$CCONCATENATE;
    private static final SubLSymbol $sym23$FIRST;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$RKF_CH_INCLUDES_INVALID_SURROGATE;
    private static final SubLSymbol $sym26$SECOND;
    private static final SubLSymbol $sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL;
    private static final SubLSymbol $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_;
    private static final SubLSymbol $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_;
    private static final SubLSymbol $sym30$SYMBOLP;
    private static final SubLSymbol $sym31$RKF_CH_CYC_CONSTANTS;
    private static final SubLString $str32$Explicit_Cyc_constant_references_;
    private static final SubLSymbol $sym33$RKF_CH_INTEGERS;
    private static final SubLString $str34$Numbers_in_the_text___Examples___;
    private static final SubLSymbol $sym35$RKF_CH_DENOTS_OF_STRING;
    private static final SubLString $str36$Denotations_of_individual_words_i;
    private static final SubLSymbol $sym37$RKF_CH_MULTI_WORD_DENOTATION;
    private static final SubLString $str38$Denotations_for_the_entire_text_i;
    private static final SubLSymbol $sym39$RKF_CH_NOUN_COMPOUND_PHRASES;
    private static final SubLString $str40$Multi_word_phrases_from_the_lexic;
    private static final SubLSymbol $sym41$RKF_CH_NOUN_PHRASE_PARSES;
    private static final SubLString $str42$Noun_phrases_identified_using_a_n;
    private static final SubLSymbol $sym43$RKF_CH_TEMPLATE_PARSES;
    private static final SubLString $str44$Phrases_interpreted_by_a_Template;
    private static final SubLSymbol $sym45$ITP_SEQUEL;
    private static final SubLSymbol $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_;
    private static final SubLSymbol $kw47$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym48$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw49$INPUT;
    private static final SubLString $str50$Unable_to_open__S;
    private static final SubLSymbol $kw51$EOF;
    private static final SubLList $list52;
    private static final SubLList $list53;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 1016L)
    public static SubLObject rkf_concept_harvester(final SubLObject text) {
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        final SubLObject v_methods = rkf_active_concept_harvester_methods();
        SubLObject harvests = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = (SubLObject)rkf_concept_harvester.NIL;
        method = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            if (method.isSymbol() && rkf_concept_harvester.NIL != Symbols.fboundp(method)) {
                harvests = (SubLObject)ConsesLow.cons(Functions.funcall(method, text), harvests);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        harvests = Sequences.nreverse(harvests);
        SubLObject harvest = rkf_ch_unify_harvests(harvests);
        harvest = rkf_ch_filter_invalid_surrogates(harvest);
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 1636L)
    public static SubLObject rkf_ch_unify_harvests(final SubLObject harvests) {
        final SubLObject token_table = Hashtables.make_hash_table((SubLObject)rkf_concept_harvester.TWENTY_INTEGER, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), (SubLObject)rkf_concept_harvester.UNPROVIDED);
        SubLObject cdolist_list_var = harvests;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        harvest = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = harvest;
            SubLObject harvest_item = (SubLObject)rkf_concept_harvester.NIL;
            harvest_item = cdolist_list_var_$1.first();
            while (rkf_concept_harvester.NIL != cdolist_list_var_$1) {
                SubLObject current;
                final SubLObject datum = current = harvest_item;
                SubLObject token_list = (SubLObject)rkf_concept_harvester.NIL;
                SubLObject cycl_list = (SubLObject)rkf_concept_harvester.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list1);
                token_list = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list1);
                cycl_list = current.first();
                current = current.rest();
                if (rkf_concept_harvester.NIL == current) {
                    SubLObject existing = Hashtables.gethash(token_list, token_table, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                    SubLObject cdolist_list_var_$2 = cycl_list;
                    SubLObject cycl = (SubLObject)rkf_concept_harvester.NIL;
                    cycl = cdolist_list_var_$2.first();
                    while (rkf_concept_harvester.NIL != cdolist_list_var_$2) {
                        final SubLObject item_var;
                        cycl = (item_var = narts_high.nart_expand(cycl));
                        if (rkf_concept_harvester.NIL == conses_high.member(item_var, existing, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.IDENTITY))) {
                            existing = (SubLObject)ConsesLow.cons(item_var, existing);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        cycl = cdolist_list_var_$2.first();
                    }
                    Hashtables.sethash(token_list, token_table, existing);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_concept_harvester.$list1);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                harvest_item = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            harvest = cdolist_list_var.first();
        }
        SubLObject unified_harvest = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject token_list2 = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject cycl_list2 = (SubLObject)rkf_concept_harvester.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(token_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                token_list2 = Hashtables.getEntryKey(cdohash_entry);
                cycl_list2 = Hashtables.getEntryValue(cdohash_entry);
                cycl_list2 = rkf_ch_sort_cycl_terms(cycl_list2);
                unified_harvest = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(token_list2, cycl_list2), unified_harvest);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        unified_harvest = Sort.sort(unified_harvest, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym2$TERM__), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym3$CAAR));
        unified_harvest = Sort.stable_sort(unified_harvest, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym4$_), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym5$FIRST_LENGTH));
        return unified_harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2513L)
    public static SubLObject first_length(final SubLObject v_object) {
        return Sequences.length(v_object.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2599L)
    public static SubLObject rkf_ch_sort_cycl_terms(final SubLObject terms) {
        SubLObject v_forts = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym6$FORT_P), terms, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        final SubLObject non_forts = Sequences.remove_if(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym6$FORT_P), terms, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        SubLObject conses = Sequences.remove_if(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym7$ATOM), non_forts, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        SubLObject atoms = Sequences.remove_if(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym8$CONSP), non_forts, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        atoms = Sort.sort(atoms, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym2$TERM__), (SubLObject)rkf_concept_harvester.UNPROVIDED);
        v_forts = Sort.sort(v_forts, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym4$_), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym9$NUM_INDEX));
        conses = Sort.sort(conses, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym2$TERM__), (SubLObject)rkf_concept_harvester.UNPROVIDED);
        return ConsesLow.nconc(atoms, v_forts, conses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 2988L)
    public static SubLObject rkf_ch_string_tokenize(final SubLObject string) {
        return rkf_ch_string_tokenize_internal_cached(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3489L)
    public static SubLObject rkf_ch_raw_tokenization(final SubLObject string) {
        return standard_tokenization.standard_raw_tokenization(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3652L)
    public static SubLObject rkf_ch_token_chunker(final SubLObject raw_tokenization) {
        return standard_tokenization.standard_token_chunker(raw_tokenization);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
    public static SubLObject clear_rkf_ch_string_tokenize_internal_cached() {
        final SubLObject cs = rkf_concept_harvester.$rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
        if (rkf_concept_harvester.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
    public static SubLObject remove_rkf_ch_string_tokenize_internal_cached(final SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args(rkf_concept_harvester.$rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(string), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
    public static SubLObject rkf_ch_string_tokenize_internal_cached_internal(final SubLObject string) {
        return rkf_ch_string_tokenize_internal(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 3905L)
    public static SubLObject rkf_ch_string_tokenize_internal_cached(final SubLObject string) {
        SubLObject caching_state = rkf_concept_harvester.$rkf_ch_string_tokenize_internal_cached_caching_state$.getGlobalValue();
        if (rkf_concept_harvester.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rkf_concept_harvester.$sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED, (SubLObject)rkf_concept_harvester.$sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_, (SubLObject)rkf_concept_harvester.$int12$1000, (SubLObject)rkf_concept_harvester.EQUAL, (SubLObject)rkf_concept_harvester.ONE_INTEGER, (SubLObject)rkf_concept_harvester.$int13$100);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rkf_ch_string_tokenize_internal_cached_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4063L)
    public static SubLObject rkf_ch_string_tokenize_internal(final SubLObject string) {
        final SubLObject raw_tokenization = rkf_ch_raw_tokenization(string);
        final SubLObject chunked_tokenization = rkf_ch_token_chunker(raw_tokenization);
        return chunked_tokenization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4281L)
    public static SubLObject rkf_ch_parsing_surrogate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && rkf_concept_harvester.$const14$TheResultOfParsing.eql(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4478L)
    public static SubLObject rkf_ch_gather_parsing_surrogates(final SubLObject v_object) {
        return list_utilities.tree_gather(v_object, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym15$RKF_CH_PARSING_SURROGATE_P), Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4603L)
    public static SubLObject rkf_ch_parsing_surrogate_token_index_list(final SubLObject surrogate) {
        return cycl_utilities.formula_args(cycl_utilities.formula_arg2(surrogate, (SubLObject)rkf_concept_harvester.UNPROVIDED), (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4722L)
    public static SubLObject rkf_ch_simplify_assemble_phrases(final SubLObject v_object) {
        return Values.values(transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym16$RKF_CH_ASSEMBLE_PHRASE_P), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE), (SubLObject)rkf_concept_harvester.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 4959L)
    public static SubLObject rkf_ch_assemble_phrase_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && rkf_concept_harvester.$const18$AssemblePhraseFn.eql(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 5107L)
    public static SubLObject rkf_ch_simplify_one_assemble_phrase(final SubLObject v_object) {
        SubLObject assemble_phrase_fn = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject string_parts = (SubLObject)rkf_concept_harvester.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)rkf_concept_harvester.$list19);
        assemble_phrase_fn = v_object.first();
        final SubLObject current = string_parts = v_object.rest();
        if (rkf_concept_harvester.NIL == string_parts) {
            return (SubLObject)rkf_concept_harvester.$str20$;
        }
        if (rkf_concept_harvester.NIL != list_utilities.singletonP(string_parts)) {
            return string_parts.first();
        }
        SubLObject new_string_parts = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject cdolist_list_var = string_parts;
        SubLObject string_part = (SubLObject)rkf_concept_harvester.NIL;
        string_part = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            if (!string_part.eql(string_parts.first())) {
                new_string_parts = (SubLObject)ConsesLow.cons((SubLObject)rkf_concept_harvester.$str21$_, new_string_parts);
            }
            new_string_parts = (SubLObject)ConsesLow.cons(string_part, new_string_parts);
            cdolist_list_var = cdolist_list_var.rest();
            string_part = cdolist_list_var.first();
        }
        new_string_parts = Sequences.nreverse(new_string_parts);
        return Functions.apply(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym22$CCONCATENATE), new_string_parts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 5700L)
    public static SubLObject rkf_ch_filter_invalid_surrogates(SubLObject harvest) {
        for (SubLObject invalid_surrogates = rkf_ch_gather_invalid_surrogates(harvest); rkf_concept_harvester.NIL != invalid_surrogates; invalid_surrogates = rkf_ch_gather_invalid_surrogates(harvest)) {
            harvest = rkf_ch_delete_invalid_surrogates(harvest, invalid_surrogates);
        }
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 6228L)
    public static SubLObject rkf_ch_gather_invalid_surrogates(final SubLObject harvest) {
        final SubLObject valid_harvest_token_index_lists = Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym23$FIRST), harvest);
        SubLObject invalid_surrogates = (SubLObject)rkf_concept_harvester.NIL;
        SubLObject cdolist_list_var = harvest;
        SubLObject harvest_item = (SubLObject)rkf_concept_harvester.NIL;
        harvest_item = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = harvest_item;
            SubLObject index_list = (SubLObject)rkf_concept_harvester.NIL;
            SubLObject cycl_list = (SubLObject)rkf_concept_harvester.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list24);
            index_list = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list24);
            cycl_list = current.first();
            current = current.rest();
            if (rkf_concept_harvester.NIL == current) {
                SubLObject cdolist_list_var_$3 = cycl_list;
                SubLObject cycl = (SubLObject)rkf_concept_harvester.NIL;
                cycl = cdolist_list_var_$3.first();
                while (rkf_concept_harvester.NIL != cdolist_list_var_$3) {
                    SubLObject cdolist_list_var_$4;
                    final SubLObject surrogates = cdolist_list_var_$4 = rkf_ch_gather_parsing_surrogates(cycl);
                    SubLObject surrogate = (SubLObject)rkf_concept_harvester.NIL;
                    surrogate = cdolist_list_var_$4.first();
                    while (rkf_concept_harvester.NIL != cdolist_list_var_$4) {
                        final SubLObject token_index_list = rkf_ch_parsing_surrogate_token_index_list(surrogate);
                        if (rkf_concept_harvester.NIL == subl_promotions.memberP(token_index_list, valid_harvest_token_index_lists, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), (SubLObject)rkf_concept_harvester.UNPROVIDED)) {
                            final SubLObject item_var = surrogate;
                            if (rkf_concept_harvester.NIL == conses_high.member(item_var, invalid_surrogates, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.IDENTITY))) {
                                invalid_surrogates = (SubLObject)ConsesLow.cons(item_var, invalid_surrogates);
                            }
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        surrogate = cdolist_list_var_$4.first();
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    cycl = cdolist_list_var_$3.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_concept_harvester.$list24);
            }
            cdolist_list_var = cdolist_list_var.rest();
            harvest_item = cdolist_list_var.first();
        }
        return Sequences.nreverse(invalid_surrogates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 6899L)
    public static SubLObject rkf_ch_delete_invalid_surrogates(SubLObject harvest, final SubLObject invalid_surrogates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
        try {
            control_vars.$mapping_target$.bind(invalid_surrogates, thread);
            SubLObject cdolist_list_var = harvest;
            SubLObject harvest_item = (SubLObject)rkf_concept_harvester.NIL;
            harvest_item = cdolist_list_var.first();
            while (rkf_concept_harvester.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = harvest_item;
                SubLObject index_list = (SubLObject)rkf_concept_harvester.NIL;
                SubLObject cycl_list = (SubLObject)rkf_concept_harvester.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list24);
                index_list = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list24);
                cycl_list = current.first();
                current = current.rest();
                if (rkf_concept_harvester.NIL == current) {
                    ConsesLow.set_nth((SubLObject)rkf_concept_harvester.ONE_INTEGER, harvest_item, Sequences.delete_if(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym25$RKF_CH_INCLUDES_INVALID_SURROGATE), cycl_list, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_concept_harvester.$list24);
                }
                cdolist_list_var = cdolist_list_var.rest();
                harvest_item = cdolist_list_var.first();
            }
        }
        finally {
            control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
        }
        harvest = Sequences.delete((SubLObject)rkf_concept_harvester.NIL, harvest, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym26$SECOND), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7316L)
    public static SubLObject rkf_ch_includes_invalid_surrogate(final SubLObject v_object) {
        return list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL), v_object, (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 7452L)
    public static SubLObject rkf_ch_includes_invalid_surrogate_internal(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, control_vars.$mapping_target$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8000L)
    public static SubLObject rkf_all_concept_harvester_methods() {
        return Sequences.nreverse(Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym23$FIRST), rkf_concept_harvester.$rkf_all_concept_harvester_methods$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8126L)
    public static SubLObject rkf_register_concept_harvester_method(final SubLObject symbol, final SubLObject description) {
        assert rkf_concept_harvester.NIL != Types.symbolp(symbol) : symbol;
        assert rkf_concept_harvester.NIL != Types.stringp(description) : description;
        rkf_deregister_concept_harvester_method(symbol);
        rkf_concept_harvester.$rkf_all_concept_harvester_methods$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(symbol, description), rkf_concept_harvester.$rkf_all_concept_harvester_methods$.getGlobalValue()));
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8446L)
    public static SubLObject rkf_deregister_concept_harvester_method(final SubLObject symbol) {
        assert rkf_concept_harvester.NIL != Types.symbolp(symbol) : symbol;
        rkf_concept_harvester.$rkf_all_concept_harvester_methods$.setGlobalValue(Sequences.delete(symbol, rkf_concept_harvester.$rkf_all_concept_harvester_methods$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym23$FIRST), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED));
        return symbol;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8671L)
    public static SubLObject rkf_concept_harvester_method_description(final SubLObject symbol) {
        assert rkf_concept_harvester.NIL != Types.symbolp(symbol) : symbol;
        return conses_high.second(conses_high.assoc(symbol, rkf_concept_harvester.$rkf_all_concept_harvester_methods$.getGlobalValue(), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 8836L)
    public static SubLObject rkf_active_concept_harvester_methods() {
        return Sequences.nreverse(Sequences.remove_duplicates(conses_high.copy_list(rkf_concept_harvester.$rkf_active_concept_harvester_methods$.getGlobalValue()), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 9095L)
    public static SubLObject rkf_note_active_concept_harvester_method(final SubLObject method) {
        if (rkf_concept_harvester.NIL != Sequences.find(method, rkf_concept_harvester.$rkf_all_concept_harvester_methods$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym23$FIRST), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED)) {
            rkf_concept_harvester.$rkf_active_concept_harvester_methods$.setGlobalValue((SubLObject)ConsesLow.cons(method, rkf_concept_harvester.$rkf_active_concept_harvester_methods$.getGlobalValue()));
        }
        return method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 9309L)
    public static SubLObject rkf_set_active_concept_harvester_methods(final SubLObject v_methods) {
        rkf_concept_harvester.$rkf_active_concept_harvester_methods$.setGlobalValue((SubLObject)rkf_concept_harvester.NIL);
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = (SubLObject)rkf_concept_harvester.NIL;
        method = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            rkf_note_active_concept_harvester_method(method);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return Sequences.length(rkf_concept_harvester.$rkf_active_concept_harvester_methods$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 10024L)
    public static SubLObject rkf_ch_cyc_constants(final SubLObject text) {
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = (SubLObject)rkf_concept_harvester.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)rkf_concept_harvester.NIL;
        token = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            if (rkf_concept_harvester.NIL != string_utilities.string_starts_with_constant_reader_prefix_p(token)) {
                final SubLObject constant = constant_completion_high.constant_complete_exact(token, (SubLObject)rkf_concept_harvester.TWO_INTEGER, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                if (rkf_concept_harvester.NIL != constant_handles.valid_constantP(constant, (SubLObject)rkf_concept_harvester.UNPROVIDED)) {
                    harvest = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index), (SubLObject)ConsesLow.list(constant)), harvest);
                }
            }
            index = Numbers.add(index, (SubLObject)rkf_concept_harvester.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(harvest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 10769L)
    public static SubLObject rkf_ch_integers(final SubLObject text) {
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = (SubLObject)rkf_concept_harvester.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)rkf_concept_harvester.NIL;
        token = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            final SubLObject number = number_utilities.number_string_value(token);
            if (number.isNumber()) {
                harvest = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index), (SubLObject)ConsesLow.list(number)), harvest);
            }
            index = Numbers.add(index, (SubLObject)rkf_concept_harvester.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(harvest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 11455L)
    public static SubLObject rkf_ch_denots_of_string(final SubLObject text, SubLObject mt) {
        if (mt == rkf_concept_harvester.UNPROVIDED) {
            mt = (SubLObject)rkf_concept_harvester.NIL;
        }
        return rkf_ch_denotations_for_string(text, mt, (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 11567L)
    public static SubLObject rkf_ch_denotations_for_string(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == rkf_concept_harvester.UNPROVIDED) {
            mt = (SubLObject)rkf_concept_harvester.NIL;
        }
        if (pos == rkf_concept_harvester.UNPROVIDED) {
            pos = (SubLObject)rkf_concept_harvester.NIL;
        }
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        SubLObject index = (SubLObject)rkf_concept_harvester.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)rkf_concept_harvester.NIL;
        token = cdolist_list_var.first();
        while (rkf_concept_harvester.NIL != cdolist_list_var) {
            final SubLObject possible_cycl = rkf_ch_denots_of_string_internal(token, mt, pos);
            if (rkf_concept_harvester.NIL != possible_cycl) {
                final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index), possible_cycl);
                if (rkf_concept_harvester.NIL == conses_high.member(item_var, harvest, Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQL), Symbols.symbol_function((SubLObject)rkf_concept_harvester.IDENTITY))) {
                    harvest = (SubLObject)ConsesLow.cons(item_var, harvest);
                }
            }
            index = Numbers.add(index, (SubLObject)rkf_concept_harvester.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(harvest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 12027L)
    public static SubLObject rkf_ch_denots_of_string_internal(final SubLObject token, final SubLObject mt, final SubLObject pos) {
        if (rkf_concept_harvester.NIL == rkf_ch_denots_of_string_stop_word(token)) {
            SubLObject result = (SubLObject)rkf_concept_harvester.NIL;
            if (!Sequences.length(token).numL((SubLObject)rkf_concept_harvester.TWO_INTEGER)) {
                if (rkf_concept_harvester.NIL == mt) {
                    result = lexicon_accessors.all_parsing_denots_of_string(token, (SubLObject)rkf_concept_harvester.T, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                }
                else {
                    result = lexicon_accessors.all_parsing_denots_of_string(token, (SubLObject)rkf_concept_harvester.T, mt, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                }
            }
            return result;
        }
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 12606L)
    public static SubLObject rkf_ch_denots_of_string_stop_word(final SubLObject token) {
        return lexicon_utilities.denots_of_string_stop_word(token);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13075L)
    public static SubLObject rkf_ch_multi_word_denotation(final SubLObject text) {
        return rkf_ch_denotations_from_multi_word_string(text, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13186L)
    public static SubLObject rkf_ch_denotations_from_multi_word_string(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == rkf_concept_harvester.UNPROVIDED) {
            mt = (SubLObject)rkf_concept_harvester.NIL;
        }
        if (pos == rkf_concept_harvester.UNPROVIDED) {
            pos = (SubLObject)rkf_concept_harvester.NIL;
        }
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        final SubLObject tokens = rkf_ch_string_tokenize(text);
        if (rkf_concept_harvester.NIL == list_utilities.singletonP(tokens)) {
            final SubLObject complete_denotations = rkf_ch_denotations_int(text, mt);
            if (rkf_concept_harvester.NIL != complete_denotations) {
                final SubLObject token_list = parsing_utilities.token_list_from_span((SubLObject)rkf_concept_harvester.ZERO_INTEGER, Sequences.length(tokens));
                harvest = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(token_list, complete_denotations));
            }
        }
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 13700L)
    public static SubLObject rkf_ch_denotations_int(final SubLObject text, final SubLObject mt) {
        SubLObject denotations = (SubLObject)rkf_concept_harvester.NIL;
        if (rkf_concept_harvester.NIL == mt) {
            denotations = lexicon_accessors.all_parsing_denots_of_string(text, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        }
        else {
            denotations = lexicon_accessors.all_parsing_denots_of_string(text, (SubLObject)rkf_concept_harvester.T, mt, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        }
        return denotations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 14322L)
    public static SubLObject rkf_ch_noun_compound_phrases(final SubLObject text, SubLObject mt, SubLObject pos) {
        if (mt == rkf_concept_harvester.UNPROVIDED) {
            mt = (SubLObject)rkf_concept_harvester.NIL;
        }
        if (pos == rkf_concept_harvester.UNPROVIDED) {
            pos = (SubLObject)rkf_concept_harvester.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        if (rkf_concept_harvester.NIL == mt) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread);
        }
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            SubLObject cdolist_list_var;
            final SubLObject interval_tokens = cdolist_list_var = (SubLObject)((rkf_concept_harvester.NIL != nl_trie.nl_trie_presentP((SubLObject)rkf_concept_harvester.UNPROVIDED)) ? np_parser.npp_sentence_tokenize(text, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED) : rkf_concept_harvester.NIL);
            SubLObject interval_token = (SubLObject)rkf_concept_harvester.NIL;
            interval_token = cdolist_list_var.first();
            while (rkf_concept_harvester.NIL != cdolist_list_var) {
                final SubLObject parse = standard_tokenization.interval_token_value(interval_token);
                final SubLObject denots = Sequences.remove_duplicates(Mapping.mapcar(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym23$FIRST), standard_tokenization.string_token_value(parse)), (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                if (rkf_concept_harvester.NIL != denots) {
                    final SubLObject start_index = standard_tokenization.interval_token_start(interval_token);
                    final SubLObject end_index = standard_tokenization.interval_token_end(interval_token);
                    final SubLObject span_length = Numbers.subtract(end_index, start_index);
                    if (!span_length.numL((SubLObject)rkf_concept_harvester.TWO_INTEGER)) {
                        final SubLObject index_list = parsing_utilities.token_list_from_span(start_index, end_index);
                        harvest = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(index_list, denots), harvest);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                interval_token = cdolist_list_var.first();
            }
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(harvest);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 15276L)
    public static SubLObject rkf_ch_noun_compound_phrase_parser(final SubLObject text, final SubLObject mt, SubLObject pos) {
        if (pos == rkf_concept_harvester.UNPROVIDED) {
            pos = (SubLObject)rkf_concept_harvester.NIL;
        }
        return rkf_ch_noun_compound_phrases(text, mt, pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 15691L)
    public static SubLObject rkf_ch_noun_phrase_parses(final SubLObject text) {
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        harvest = psp_main.ps_harvest_nps(text, (SubLObject)rkf_concept_harvester.T, (SubLObject)rkf_concept_harvester.UNPROVIDED);
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16403L)
    public static SubLObject rkf_ch_template_parses(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
        if (rkf_concept_harvester.$rkf_ch_template_parses_method$.getDynamicValue(thread).isFunctionSpec()) {
            harvest = Functions.funcall(rkf_concept_harvester.$rkf_ch_template_parses_method$.getDynamicValue(thread), text);
        }
        return harvest;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 16826L)
    public static SubLObject rkf_ch_template_parse_cache_lookup(final SubLObject text) {
        assert rkf_concept_harvester.NIL != Types.stringp(text) : text;
        if (rkf_concept_harvester.NIL != rkf_concept_harvester.$rkf_ch_template_parse_cache$.getGlobalValue()) {
            final SubLObject tokens = rkf_ch_string_tokenize(text);
            final SubLObject harvest = Hashtables.gethash(tokens, rkf_concept_harvester.$rkf_ch_template_parse_cache$.getGlobalValue(), (SubLObject)rkf_concept_harvester.NIL);
            return conses_high.copy_tree(harvest);
        }
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-harvester.lisp", position = 17103L)
    public static SubLObject rkf_ch_initialize_template_parse_cache(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rkf_concept_harvester.NIL != Types.stringp(filename) : filename;
        if (rkf_concept_harvester.NIL != Filesys.probe_file(filename)) {
            SubLObject cache_items = (SubLObject)rkf_concept_harvester.NIL;
            SubLObject cache_item = (SubLObject)rkf_concept_harvester.NIL;
            SubLObject ignore_errors_tag = (SubLObject)rkf_concept_harvester.NIL;
            try {
                thread.throwStack.push(rkf_concept_harvester.$kw47$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)rkf_concept_harvester.$sym48$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        SubLObject stream = (SubLObject)rkf_concept_harvester.NIL;
                        try {
                            stream = compatibility.open_text(filename, (SubLObject)rkf_concept_harvester.$kw49$INPUT);
                            if (!stream.isStream()) {
                                Errors.error((SubLObject)rkf_concept_harvester.$str50$Unable_to_open__S, filename);
                            }
                            final SubLObject stream_$5 = stream;
                            while (rkf_concept_harvester.$kw51$EOF != cache_item) {
                                cache_item = reader.read(stream_$5, (SubLObject)rkf_concept_harvester.NIL, (SubLObject)rkf_concept_harvester.$kw51$EOF, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                                if (rkf_concept_harvester.$kw51$EOF != cache_item) {
                                    cache_items = (SubLObject)ConsesLow.cons(cache_item, cache_items);
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_concept_harvester.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (stream.isStream()) {
                                    streams_high.close(stream, (SubLObject)rkf_concept_harvester.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)rkf_concept_harvester.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)rkf_concept_harvester.$kw47$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            if (rkf_concept_harvester.NIL != cache_items) {
                final SubLObject v_cache = Hashtables.make_hash_table(Sequences.length(cache_items), Symbols.symbol_function((SubLObject)rkf_concept_harvester.EQUAL), (SubLObject)rkf_concept_harvester.UNPROVIDED);
                SubLObject cdolist_list_var = cache_items;
                SubLObject cache_item_$7 = (SubLObject)rkf_concept_harvester.NIL;
                cache_item_$7 = cdolist_list_var.first();
                while (rkf_concept_harvester.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cache_item_$7;
                    SubLObject sentence = (SubLObject)rkf_concept_harvester.NIL;
                    SubLObject harvest_specs = (SubLObject)rkf_concept_harvester.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list52);
                    sentence = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_concept_harvester.$list52);
                    harvest_specs = current.first();
                    current = current.rest();
                    if (rkf_concept_harvester.NIL == current) {
                        SubLObject harvest = (SubLObject)rkf_concept_harvester.NIL;
                        final SubLObject tokens = rkf_ch_string_tokenize(sentence);
                        SubLObject cdolist_list_var_$8 = harvest_specs;
                        SubLObject harvest_spec = (SubLObject)rkf_concept_harvester.NIL;
                        harvest_spec = cdolist_list_var_$8.first();
                        while (rkf_concept_harvester.NIL != cdolist_list_var_$8) {
                            SubLObject current_$10;
                            final SubLObject datum_$9 = current_$10 = harvest_spec;
                            SubLObject index_list = (SubLObject)rkf_concept_harvester.NIL;
                            SubLObject cycl = (SubLObject)rkf_concept_harvester.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)rkf_concept_harvester.$list53);
                            index_list = current_$10.first();
                            current_$10 = current_$10.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)rkf_concept_harvester.$list53);
                            cycl = current_$10.first();
                            current_$10 = current_$10.rest();
                            if (rkf_concept_harvester.NIL == current_$10) {
                                harvest = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(index_list, (SubLObject)ConsesLow.list(cycl)), harvest);
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)rkf_concept_harvester.$list53);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            harvest_spec = cdolist_list_var_$8.first();
                        }
                        harvest = Sequences.nreverse(harvest);
                        Hashtables.sethash(tokens, v_cache, harvest);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_concept_harvester.$list52);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_item_$7 = cdolist_list_var.first();
                }
                rkf_concept_harvester.$rkf_ch_template_parse_cache$.setGlobalValue(v_cache);
                return (SubLObject)rkf_concept_harvester.T;
            }
        }
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    public static SubLObject declare_rkf_concept_harvester_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_concept_harvester", "RKF-CONCEPT-HARVESTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_unify_harvests", "RKF-CH-UNIFY-HARVESTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "first_length", "FIRST-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_sort_cycl_terms", "RKF-CH-SORT-CYCL-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_string_tokenize", "RKF-CH-STRING-TOKENIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_raw_tokenization", "RKF-CH-RAW-TOKENIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_token_chunker", "RKF-CH-TOKEN-CHUNKER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "clear_rkf_ch_string_tokenize_internal_cached", "CLEAR-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "remove_rkf_ch_string_tokenize_internal_cached", "REMOVE-RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_string_tokenize_internal_cached_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_string_tokenize_internal_cached", "RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_string_tokenize_internal", "RKF-CH-STRING-TOKENIZE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_parsing_surrogate_p", "RKF-CH-PARSING-SURROGATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_gather_parsing_surrogates", "RKF-CH-GATHER-PARSING-SURROGATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_parsing_surrogate_token_index_list", "RKF-CH-PARSING-SURROGATE-TOKEN-INDEX-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_simplify_assemble_phrases", "RKF-CH-SIMPLIFY-ASSEMBLE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_assemble_phrase_p", "RKF-CH-ASSEMBLE-PHRASE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_simplify_one_assemble_phrase", "RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_filter_invalid_surrogates", "RKF-CH-FILTER-INVALID-SURROGATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_gather_invalid_surrogates", "RKF-CH-GATHER-INVALID-SURROGATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_delete_invalid_surrogates", "RKF-CH-DELETE-INVALID-SURROGATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_includes_invalid_surrogate", "RKF-CH-INCLUDES-INVALID-SURROGATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_includes_invalid_surrogate_internal", "RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_all_concept_harvester_methods", "RKF-ALL-CONCEPT-HARVESTER-METHODS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_register_concept_harvester_method", "RKF-REGISTER-CONCEPT-HARVESTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_deregister_concept_harvester_method", "RKF-DEREGISTER-CONCEPT-HARVESTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_concept_harvester_method_description", "RKF-CONCEPT-HARVESTER-METHOD-DESCRIPTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_active_concept_harvester_methods", "RKF-ACTIVE-CONCEPT-HARVESTER-METHODS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_note_active_concept_harvester_method", "RKF-NOTE-ACTIVE-CONCEPT-HARVESTER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_set_active_concept_harvester_methods", "RKF-SET-ACTIVE-CONCEPT-HARVESTER-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_cyc_constants", "RKF-CH-CYC-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_integers", "RKF-CH-INTEGERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denots_of_string", "RKF-CH-DENOTS-OF-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denotations_for_string", "RKF-CH-DENOTATIONS-FOR-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denots_of_string_internal", "RKF-CH-DENOTS-OF-STRING-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denots_of_string_stop_word", "RKF-CH-DENOTS-OF-STRING-STOP-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_multi_word_denotation", "RKF-CH-MULTI-WORD-DENOTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denotations_from_multi_word_string", "RKF-CH-DENOTATIONS-FROM-MULTI-WORD-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_denotations_int", "RKF-CH-DENOTATIONS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_noun_compound_phrases", "RKF-CH-NOUN-COMPOUND-PHRASES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_noun_compound_phrase_parser", "RKF-CH-NOUN-COMPOUND-PHRASE-PARSER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_noun_phrase_parses", "RKF-CH-NOUN-PHRASE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_template_parses", "RKF-CH-TEMPLATE-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_template_parse_cache_lookup", "RKF-CH-TEMPLATE-PARSE-CACHE-LOOKUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_concept_harvester", "rkf_ch_initialize_template_parse_cache", "RKF-CH-INITIALIZE-TEMPLATE-PARSE-CACHE", 1, 0, false);
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    public static SubLObject init_rkf_concept_harvester_file() {
        rkf_concept_harvester.$rkf_ch_string_tokenize_internal_cached_caching_state$ = SubLFiles.deflexical("*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*", (SubLObject)rkf_concept_harvester.NIL);
        rkf_concept_harvester.$rkf_all_concept_harvester_methods$ = SubLFiles.deflexical("*RKF-ALL-CONCEPT-HARVESTER-METHODS*", (SubLObject)(maybeDefault((SubLObject)rkf_concept_harvester.$sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_, rkf_concept_harvester.$rkf_all_concept_harvester_methods$, rkf_concept_harvester.NIL)));
        rkf_concept_harvester.$rkf_active_concept_harvester_methods$ = SubLFiles.deflexical("*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*", (SubLObject)(maybeDefault((SubLObject)rkf_concept_harvester.$sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_, rkf_concept_harvester.$rkf_active_concept_harvester_methods$, rkf_concept_harvester.NIL)));
        rkf_concept_harvester.$rkf_ch_template_parses_method$ = SubLFiles.defparameter("*RKF-CH-TEMPLATE-PARSES-METHOD*", (SubLObject)rkf_concept_harvester.$sym45$ITP_SEQUEL);
        rkf_concept_harvester.$rkf_ch_template_parse_cache$ = SubLFiles.deflexical("*RKF-CH-TEMPLATE-PARSE-CACHE*", (SubLObject)(maybeDefault((SubLObject)rkf_concept_harvester.$sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_, rkf_concept_harvester.$rkf_ch_template_parse_cache$, rkf_concept_harvester.NIL)));
        return (SubLObject)rkf_concept_harvester.NIL;
    }
    
    public static SubLObject setup_rkf_concept_harvester_file() {
        memoization_state.note_globally_cached_function((SubLObject)rkf_concept_harvester.$sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_concept_harvester.$sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_concept_harvester.$sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym31$RKF_CH_CYC_CONSTANTS, (SubLObject)rkf_concept_harvester.$str32$Explicit_Cyc_constant_references_);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym31$RKF_CH_CYC_CONSTANTS);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym33$RKF_CH_INTEGERS, (SubLObject)rkf_concept_harvester.$str34$Numbers_in_the_text___Examples___);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym33$RKF_CH_INTEGERS);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym35$RKF_CH_DENOTS_OF_STRING, (SubLObject)rkf_concept_harvester.$str36$Denotations_of_individual_words_i);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym35$RKF_CH_DENOTS_OF_STRING);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym37$RKF_CH_MULTI_WORD_DENOTATION, (SubLObject)rkf_concept_harvester.$str38$Denotations_for_the_entire_text_i);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym37$RKF_CH_MULTI_WORD_DENOTATION);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym39$RKF_CH_NOUN_COMPOUND_PHRASES, (SubLObject)rkf_concept_harvester.$str40$Multi_word_phrases_from_the_lexic);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym39$RKF_CH_NOUN_COMPOUND_PHRASES);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym41$RKF_CH_NOUN_PHRASE_PARSES, (SubLObject)rkf_concept_harvester.$str42$Noun_phrases_identified_using_a_n);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym41$RKF_CH_NOUN_PHRASE_PARSES);
        rkf_register_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym43$RKF_CH_TEMPLATE_PARSES, (SubLObject)rkf_concept_harvester.$str44$Phrases_interpreted_by_a_Template);
        rkf_note_active_concept_harvester_method((SubLObject)rkf_concept_harvester.$sym43$RKF_CH_TEMPLATE_PARSES);
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_concept_harvester.$sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_);
        return (SubLObject)rkf_concept_harvester.NIL;
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
    
    static {
        me = (SubLFile)new rkf_concept_harvester();
        rkf_concept_harvester.$rkf_ch_string_tokenize_internal_cached_caching_state$ = null;
        rkf_concept_harvester.$rkf_all_concept_harvester_methods$ = null;
        rkf_concept_harvester.$rkf_active_concept_harvester_methods$ = null;
        rkf_concept_harvester.$rkf_ch_template_parses_method$ = null;
        rkf_concept_harvester.$rkf_ch_template_parse_cache$ = null;
        $sym0$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKEN-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-LIST"));
        $sym2$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym3$CAAR = SubLObjectFactory.makeSymbol("CAAR");
        $sym4$_ = SubLObjectFactory.makeSymbol(">");
        $sym5$FIRST_LENGTH = SubLObjectFactory.makeSymbol("FIRST-LENGTH");
        $sym6$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym7$ATOM = SubLObjectFactory.makeSymbol("ATOM");
        $sym8$CONSP = SubLObjectFactory.makeSymbol("CONSP");
        $sym9$NUM_INDEX = SubLObjectFactory.makeSymbol("NUM-INDEX");
        $sym10$RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED = SubLObjectFactory.makeSymbol("RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED");
        $sym11$_RKF_CH_STRING_TOKENIZE_INTERNAL_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RKF-CH-STRING-TOKENIZE-INTERNAL-CACHED-CACHING-STATE*");
        $int12$1000 = SubLObjectFactory.makeInteger(1000);
        $int13$100 = SubLObjectFactory.makeInteger(100);
        $const14$TheResultOfParsing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheResultOfParsing"));
        $sym15$RKF_CH_PARSING_SURROGATE_P = SubLObjectFactory.makeSymbol("RKF-CH-PARSING-SURROGATE-P");
        $sym16$RKF_CH_ASSEMBLE_PHRASE_P = SubLObjectFactory.makeSymbol("RKF-CH-ASSEMBLE-PHRASE-P");
        $sym17$RKF_CH_SIMPLIFY_ONE_ASSEMBLE_PHRASE = SubLObjectFactory.makeSymbol("RKF-CH-SIMPLIFY-ONE-ASSEMBLE-PHRASE");
        $const18$AssemblePhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssemblePhraseFn"));
        $list19 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ASSEMBLE-PHRASE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-PARTS"));
        $str20$ = SubLObjectFactory.makeString("");
        $str21$_ = SubLObjectFactory.makeString(" ");
        $sym22$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym23$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-LIST"));
        $sym25$RKF_CH_INCLUDES_INVALID_SURROGATE = SubLObjectFactory.makeSymbol("RKF-CH-INCLUDES-INVALID-SURROGATE");
        $sym26$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $sym27$RKF_CH_INCLUDES_INVALID_SURROGATE_INTERNAL = SubLObjectFactory.makeSymbol("RKF-CH-INCLUDES-INVALID-SURROGATE-INTERNAL");
        $sym28$_RKF_ALL_CONCEPT_HARVESTER_METHODS_ = SubLObjectFactory.makeSymbol("*RKF-ALL-CONCEPT-HARVESTER-METHODS*");
        $sym29$_RKF_ACTIVE_CONCEPT_HARVESTER_METHODS_ = SubLObjectFactory.makeSymbol("*RKF-ACTIVE-CONCEPT-HARVESTER-METHODS*");
        $sym30$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym31$RKF_CH_CYC_CONSTANTS = SubLObjectFactory.makeSymbol("RKF-CH-CYC-CONSTANTS");
        $str32$Explicit_Cyc_constant_references_ = SubLObjectFactory.makeString("Explicit Cyc constant references like #$Dog.  Useful for pseudo-CycL and testing.");
        $sym33$RKF_CH_INTEGERS = SubLObjectFactory.makeSymbol("RKF-CH-INTEGERS");
        $str34$Numbers_in_the_text___Examples___ = SubLObjectFactory.makeString("Numbers in the text.  Examples :  7,  -1, 0, 42, 1776 3.14 etc.");
        $sym35$RKF_CH_DENOTS_OF_STRING = SubLObjectFactory.makeSymbol("RKF-CH-DENOTS-OF-STRING");
        $str36$Denotations_of_individual_words_i = SubLObjectFactory.makeString("Denotations of individual words in the text.");
        $sym37$RKF_CH_MULTI_WORD_DENOTATION = SubLObjectFactory.makeSymbol("RKF-CH-MULTI-WORD-DENOTATION");
        $str38$Denotations_for_the_entire_text_i = SubLObjectFactory.makeString("Denotations for the entire text if it is a multi-word phrase.  Best for clarifications.");
        $sym39$RKF_CH_NOUN_COMPOUND_PHRASES = SubLObjectFactory.makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASES");
        $str40$Multi_word_phrases_from_the_lexic = SubLObjectFactory.makeString("Multi-word phrases from the lexicon.");
        $sym41$RKF_CH_NOUN_PHRASE_PARSES = SubLObjectFactory.makeSymbol("RKF-CH-NOUN-PHRASE-PARSES");
        $str42$Noun_phrases_identified_using_a_n = SubLObjectFactory.makeString("Noun phrases identified using a noun-phrase parser");
        $sym43$RKF_CH_TEMPLATE_PARSES = SubLObjectFactory.makeSymbol("RKF-CH-TEMPLATE-PARSES");
        $str44$Phrases_interpreted_by_a_Template = SubLObjectFactory.makeString("Phrases interpreted by a Template Parser");
        $sym45$ITP_SEQUEL = SubLObjectFactory.makeSymbol("ITP-SEQUEL");
        $sym46$_RKF_CH_TEMPLATE_PARSE_CACHE_ = SubLObjectFactory.makeSymbol("*RKF-CH-TEMPLATE-PARSE-CACHE*");
        $kw47$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym48$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw49$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str50$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw51$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("HARVEST-SPECS"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"));
    }
}

/*

	Total time: 233 ms
	
*/