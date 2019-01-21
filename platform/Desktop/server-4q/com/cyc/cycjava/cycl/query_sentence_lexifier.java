package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class query_sentence_lexifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.query_sentence_lexifier";
    public static final String myFingerPrint = "89c63675f83e88f9012167eb05fd0c155151976c323c4801c6d1ca48ab23b481";
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 1020L)
    private static SubLSymbol $qsl_on_single_literal_query$;
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 15865L)
    private static SubLSymbol $unit_of_money_p_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16202L)
    private static SubLSymbol $sentential_operators_caching_state$;
    private static final SubLSymbol $sym0$POSSIBLY_REPLACEABLE_TERM_P;
    private static final SubLSymbol $kw1$ALL;
    private static final SubLList $list2;
    private static final SubLSymbol $kw3$TEXT;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$MAPPED_EXPRESSION_SUBSUMES_;
    private static final SubLSymbol $sym6$PARSE_TREE_STRING;
    private static final SubLList $list7;
    private static final SubLString $str8$_b;
    private static final SubLList $list9;
    private static final SubLString $str10$No_string_positions_for_;
    private static final SubLString $str11$_in_;
    private static final SubLString $str12$No_term_positions_for_;
    private static final SubLString $str13$Non_singleton_string_positions_fo;
    private static final SubLString $str14$Non_singleton_term_positions_for_;
    private static final SubLSymbol $kw15$INTERROGATIVE;
    private static final SubLSymbol $sym16$STRINGP;
    private static final SubLSymbol $sym17$CDR;
    private static final SubLString $str18$Couldn_t_find_strings_for_any_ter;
    private static final SubLString $str19$_;
    private static final SubLString $str20$_;
    private static final SubLString $str21$_;
    private static final SubLList $list22;
    private static final SubLString $str23$_;
    private static final SubLObject $const24$NounPhrase;
    private static final SubLSymbol $sym25$GET_HEAD_DAUGHTERS;
    private static final SubLSymbol $sym26$GET_CATEGORY;
    private static final SubLSymbol $kw27$VBP;
    private static final SubLObject $const28$nonThirdSg_Present;
    private static final SubLSymbol $kw29$VBZ;
    private static final SubLObject $const30$thirdPersonSg_Present;
    private static final SubLSymbol $kw31$NN;
    private static final SubLObject $const32$singular_Generic;
    private static final SubLSymbol $kw33$NNS;
    private static final SubLObject $const34$plural_Generic;
    private static final SubLSymbol $sym35$_;
    private static final SubLSymbol $sym36$SECOND;
    private static final SubLSymbol $kw37$DECLARATIVE;
    private static final SubLObject $const38$genTemplate_QuerySentence;
    private static final SubLString $str39$__a_z0_9__;
    private static final SubLString $str40$__a_z0_9_;
    private static final SubLString $str41$_;
    private static final SubLString $str42$_;
    private static final SubLString $str43$_;
    private static final SubLObject $const44$Date;
    private static final SubLSymbol $sym45$UNIT_OF_MONEY_P;
    private static final SubLObject $const46$UnitOfMoney;
    private static final SubLSymbol $sym47$_UNIT_OF_MONEY_P_CACHING_STATE_;
    private static final SubLInteger $int48$500;
    private static final SubLObject $const49$Time_Quantity;
    private static final SubLSymbol $sym50$SENTENTIAL_OPERATORS;
    private static final SubLObject $const51$SententialOperator;
    private static final SubLSymbol $sym52$_SENTENTIAL_OPERATORS_CACHING_STATE_;
    private static final SubLSymbol $sym53$CLEAR_SENTENTIAL_OPERATORS;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw57$TEST_SPECIFICATION_TYPE;
    private static final SubLSymbol $kw58$TEMPLATE_FOLDER;
    private static final SubLSymbol $sym59$FTG_GAF;
    private static final SubLSymbol $sym60$QUERY_SPEC;
    private static final SubLSymbol $sym61$WITH_ALL_MTS;
    private static final SubLSymbol $sym62$DO_PREDICATE_EXTENT_INDEX;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym65$GAF_ARGS;
    private static final SubLSymbol $sym66$CDOLIST;
    private static final SubLSymbol $sym67$PRED_VALUES;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PWHEN;
    private static final SubLSymbol $sym70$CAND;
    private static final SubLSymbol $sym71$FIMPLIES;
    private static final SubLSymbol $sym72$NART_P;
    private static final SubLSymbol $sym73$NAT_FUNCTOR;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$ISA_;
    private static final SubLSymbol $sym76$NAT_ARG1;
    private static final SubLSymbol $sym77$MEMBER_;
    private static final SubLSymbol $sym78$PRED_VALUES_IN_ANY_MT;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$KBQ_SENTENCES;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$DO_REIFIED_QUERY_SPEC_SENTENCES;
    private static final SubLSymbol $sym83$CLET;
    private static final SubLSymbol $sym84$GTQS_FIND_TERM_GLOSSES;
    private static final SubLObject $const85$TKBTestQuery;
    private static final SubLObject $const86$TKB_RedTeamQueryFolder;
    private static final SubLString $str87$In_Mt__EnglishParaphraseMt_;
    private static final SubLSymbol $sym88$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const89$EverythingPSC;
    private static final SubLObject $const90$formulaTemplateGloss;
    private static final SubLSymbol $kw91$GAF;
    private static final SubLSymbol $kw92$TRUE;
    private static final SubLList $list93;
    private static final SubLObject $const94$TestQueryFn;
    private static final SubLObject $const95$folderContainsResource;
    private static final SubLString $str96$__f___S_____;
    private static final SubLObject $const97$querySpecificationForFormulaTempl;
    private static final SubLString $str98$___Template___S__;
    private static final SubLString $str99$___S___Gloss___S__;
    private static final SubLSymbol $kw100$HTML;
    private static final SubLString $str101$_Old___S__;
    private static final SubLSymbol $sym102$GTQS_ASSERTION_P;
    private static final SubLString $str103$___New___S__;
    private static final SubLObject $const104$genTemplate;
    private static final SubLString $str105$ARG;
    private static final SubLObject $const106$genTemplate_Constrained;
    private static final SubLObject $const107$equals;
    private static final SubLSymbol $kw108$ARG1;
    private static final SubLObject $const109$InstanceTypeTernaryRuleMacroPredi;
    private static final SubLObject $const110$TypeInstanceTernaryRuleMacroPredi;
    private static final SubLObject $const111$TypeTypeTernaryRuleMacroPredicate;
    private static final SubLList $list112;
    private static final SubLObject $const113$Pronoun;
    private static final SubLObject $const114$Determiner;
    private static final SubLString $str115$cdolist;
    private static final SubLList $list116;
    private static final SubLSymbol $kw117$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym118$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str119$Total_attempts___S_in__S_seconds_;
    private static final SubLString $str120$Successful_attempts___S__;
    private static final SubLString $str121$__successful___S__;
    private static final SubLInteger $int122$100;
    private static final SubLString $str123$Average_time_per_attempt___S__;
    private static final SubLString $str124$__Successful_GTQS_Constructions__;
    private static final SubLList $list125;
    private static final SubLString $str126$CycL___S__Gloss___S__GTQS___S____;
    private static final SubLString $str127$__________Unsuccessful_GTQS_Const;
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 1078L)
    public static SubLObject gtqs_add_term_gloss(final SubLObject v_term, final SubLObject gloss, SubLObject a_list) {
        SubLObject doneP = (SubLObject)query_sentence_lexifier.NIL;
        final SubLObject a_list_terms = list_utilities.alist_keys(a_list);
        if (query_sentence_lexifier.NIL == doneP) {
            SubLObject csome_list_var = a_list_terms;
            SubLObject a_list_term = (SubLObject)query_sentence_lexifier.NIL;
            a_list_term = csome_list_var.first();
            while (query_sentence_lexifier.NIL == doneP && query_sentence_lexifier.NIL != csome_list_var) {
                if (query_sentence_lexifier.NIL != cycl_utilities.expression_find(v_term, a_list_term, (SubLObject)query_sentence_lexifier.NIL, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                    doneP = (SubLObject)query_sentence_lexifier.T;
                }
                else if (query_sentence_lexifier.NIL != cycl_utilities.expression_find(a_list_term, v_term, (SubLObject)query_sentence_lexifier.NIL, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                    a_list = list_utilities.alist_delete(a_list, a_list_term, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                a_list_term = csome_list_var.first();
            }
        }
        final SubLObject a_list_values = list_utilities.alist_values(a_list);
        if (query_sentence_lexifier.NIL == doneP) {
            SubLObject csome_list_var2 = a_list_values;
            SubLObject a_list_value = (SubLObject)query_sentence_lexifier.NIL;
            a_list_value = csome_list_var2.first();
            while (query_sentence_lexifier.NIL == doneP && query_sentence_lexifier.NIL != csome_list_var2) {
                if (query_sentence_lexifier.NIL != string_utilities.subwordP(gloss, a_list_value, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) || query_sentence_lexifier.NIL != string_utilities.subwordP(a_list_value, gloss, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                    a_list = list_utilities.alist_delete(a_list, list_utilities.alist_reverse_lookup(a_list, a_list_value, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED);
                    doneP = (SubLObject)query_sentence_lexifier.T;
                }
                csome_list_var2 = csome_list_var2.rest();
                a_list_value = csome_list_var2.first();
            }
        }
        if (query_sentence_lexifier.NIL == doneP) {
            a_list = list_utilities.alist_enter(a_list, v_term, gloss, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        }
        return a_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 2073L)
    public static SubLObject gtqs_find_term_glosses(final SubLObject cycl_query, final SubLObject english_query) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject result = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject terms_we_failed_to_find = (SubLObject)query_sentence_lexifier.NIL;
        final SubLObject _prev_bind_0 = query_sentence_lexifier.$qsl_on_single_literal_query$.currentBinding(thread);
        try {
            query_sentence_lexifier.$qsl_on_single_literal_query$.bind(cycl_grammar.cycl_atomic_sentence_p(cycl_query), thread);
            terms = cycl_utilities.expression_gather(cycl_query, (SubLObject)query_sentence_lexifier.$sym0$POSSIBLY_REPLACEABLE_TERM_P, (SubLObject)query_sentence_lexifier.NIL, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        }
        finally {
            query_sentence_lexifier.$qsl_on_single_literal_query$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)query_sentence_lexifier.NIL;
        v_term = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            final SubLObject phrases = pph_methods_lexicon.all_phrases_for_term(narts_high.nart_substitute(v_term), (SubLObject)query_sentence_lexifier.$kw1$ALL, (SubLObject)query_sentence_lexifier.$list2, (SubLObject)query_sentence_lexifier.$kw3$TEXT, (SubLObject)query_sentence_lexifier.NIL, (SubLObject)query_sentence_lexifier.NIL, (SubLObject)query_sentence_lexifier.$list4, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            SubLObject max_phrase_length = (SubLObject)query_sentence_lexifier.ZERO_INTEGER;
            SubLObject selected_phrase = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject cdolist_list_var_$1 = phrases;
            SubLObject phrase = (SubLObject)query_sentence_lexifier.NIL;
            phrase = cdolist_list_var_$1.first();
            while (query_sentence_lexifier.NIL != cdolist_list_var_$1) {
                if (query_sentence_lexifier.NIL != english_query_contains_phraseP(phrase, english_query) && query_sentence_lexifier.NIL != list_utilities.lengthG(phrase, max_phrase_length, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                    max_phrase_length = Sequences.length(phrase);
                    selected_phrase = phrase;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                phrase = cdolist_list_var_$1.first();
            }
            if (selected_phrase.isString()) {
                result = gtqs_add_term_gloss(v_term, selected_phrase, result);
            }
            else {
                terms_we_failed_to_find = (SubLObject)ConsesLow.cons(v_term, terms_we_failed_to_find);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        result = list_utilities.delete_subsumed_items(result, (SubLObject)query_sentence_lexifier.$sym5$MAPPED_EXPRESSION_SUBSUMES_, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        return Values.values(result, terms_we_failed_to_find);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 4149L)
    public static SubLObject get_term_offsets(final SubLObject term_glosses, final SubLObject gloss, final SubLObject query_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject syntactic_xps = ql_syntactic_xps(gloss);
        final SubLObject gloss_tree = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject syntactic_xp_strings = Mapping.mapcar((SubLObject)query_sentence_lexifier.$sym6$PARSE_TREE_STRING, syntactic_xps);
        SubLObject problem_message = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject term_offsets = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject cdolist_list_var = term_glosses;
        SubLObject cons = (SubLObject)query_sentence_lexifier.NIL;
        cons = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject v_term = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject term_gloss = (SubLObject)query_sentence_lexifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list7);
            v_term = current.first();
            current = (term_gloss = current.rest());
            if (term_gloss.isString()) {
                final SubLObject term_gloss_regex = Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str8$_b, new SubLObject[] { format_nil.format_nil_a_no_copy(term_gloss), query_sentence_lexifier.$str8$_b });
                final SubLObject string_positions = list_utilities.alist_keys(regular_expression_utilities.offsets_of_regex_matches(term_gloss_regex, gloss, (SubLObject)query_sentence_lexifier.$list9, (SubLObject)query_sentence_lexifier.UNPROVIDED));
                final SubLObject term_positions = cycl_utilities.arg_positions_dfs(v_term, query_sentence, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL));
                if (query_sentence_lexifier.NIL == string_positions) {
                    problem_message = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str10$No_string_positions_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str11$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                }
                else if (query_sentence_lexifier.NIL == term_positions) {
                    problem_message = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str12$No_term_positions_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str11$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                }
                else if (query_sentence_lexifier.NIL == list_utilities.singletonP(string_positions)) {
                    problem_message = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str13$Non_singleton_string_positions_fo, new SubLObject[] { format_nil.format_nil_s_no_copy(term_gloss), format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str11$_in_, format_nil.format_nil_s_no_copy(gloss), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                }
                else if (query_sentence_lexifier.NIL == list_utilities.singletonP(term_positions)) {
                    problem_message = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str14$Non_singleton_term_positions_for_, new SubLObject[] { format_nil.format_nil_s_no_copy(v_term), format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str11$_in_, format_nil.format_nil_s_no_copy(query_sentence), format_nil.$format_nil_percent$.getGlobalValue() }), problem_message);
                }
                else {
                    final SubLObject tree = best_tree_for_string(term_gloss, syntactic_xps, syntactic_xp_strings, gloss_tree);
                    term_offsets = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, string_positions.first(), term_gloss, tree), term_offsets);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return Values.values(term_offsets, problem_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 5646L)
    public static SubLObject pph_phrase_from_sentence(final SubLObject query_sentence, SubLObject gloss, final SubLObject term_glosses, SubLObject parsing_usefulP, SubLObject force) {
        if (parsing_usefulP == query_sentence_lexifier.UNPROVIDED) {
            parsing_usefulP = (SubLObject)query_sentence_lexifier.NIL;
        }
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem_message = (SubLObject)((query_sentence_lexifier.NIL != Sequences.find_if((SubLObject)query_sentence_lexifier.$sym16$STRINGP, term_glosses, Symbols.symbol_function((SubLObject)query_sentence_lexifier.$sym17$CDR), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) ? query_sentence_lexifier.NIL : Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str18$Couldn_t_find_strings_for_any_ter, new SubLObject[] { format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str19$_, format_nil.format_nil_s_no_copy(query_sentence), format_nil.$format_nil_percent$.getGlobalValue(), query_sentence_lexifier.$str11$_in_, format_nil.format_nil_s_no_copy(gloss) }));
        SubLObject query_sentence_with_keys = el_utilities.copy_expression(query_sentence);
        SubLObject term_offsets = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject v_pph_phrase = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject parsing_phrase = (SubLObject)query_sentence_lexifier.NIL;
        if (query_sentence_lexifier.NIL != problem_message) {
            return Values.values(v_pph_phrase, query_sentence_with_keys, problem_message);
        }
        gloss = string_utilities.trim_whitespace(gloss);
        thread.resetMultipleValues();
        final SubLObject term_offsets_$2 = get_term_offsets(term_glosses, gloss, query_sentence);
        final SubLObject problem_message_$3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        term_offsets = term_offsets_$2;
        problem_message = problem_message_$3;
        gloss = string_utilities.post_remove(gloss, (SubLObject)query_sentence_lexifier.$str20$_, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        gloss = string_utilities.post_remove(gloss, (SubLObject)query_sentence_lexifier.$str21$_, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        SubLObject index = (SubLObject)query_sentence_lexifier.ZERO_INTEGER;
        SubLObject dtrs = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject cdolist_list_var = Sort.sort(term_offsets, Symbols.symbol_function((SubLObject)query_sentence_lexifier.$sym35$_), Symbols.symbol_function((SubLObject)query_sentence_lexifier.$sym36$SECOND));
        SubLObject term_offset = (SubLObject)query_sentence_lexifier.NIL;
        term_offset = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = term_offset;
            SubLObject v_term = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject start = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject term_gloss = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject tree = (SubLObject)query_sentence_lexifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list22);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list22);
            start = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list22);
            term_gloss = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list22);
            tree = current.first();
            current = current.rest();
            if (query_sentence_lexifier.NIL == current) {
                SubLObject nospace_before_termP = (SubLObject)query_sentence_lexifier.NIL;
                if (start.numG(index)) {
                    final SubLObject whole_prefix_string = string_utilities.substring(gloss, index, start);
                    final SubLObject nospaceP = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != dtrs && query_sentence_lexifier.NIL == string_utilities.starts_with(whole_prefix_string, (SubLObject)query_sentence_lexifier.$str19$_));
                    if (query_sentence_lexifier.NIL == string_utilities.ends_with(whole_prefix_string, (SubLObject)query_sentence_lexifier.$str19$_, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                        nospace_before_termP = (SubLObject)query_sentence_lexifier.T;
                    }
                    dtrs = handle_unmatched_strings(whole_prefix_string, dtrs, nospaceP);
                }
                final SubLObject term_key = Symbols.make_keyword(string_utilities.replace_substring(Strings.string_upcase(term_gloss, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.$str19$_, (SubLObject)query_sentence_lexifier.$str23$_));
                SubLObject term_dtr = pph_data_structures.new_pph_phrase(term_gloss, term_key, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                final SubLObject top_dtr = dtrs.first();
                final SubLObject top_dtr_string = (SubLObject)((query_sentence_lexifier.NIL != pph_phrase.pph_phrase_p(top_dtr, (SubLObject)query_sentence_lexifier.UNPROVIDED)) ? pph_phrase.pph_phrase_string(top_dtr, (SubLObject)query_sentence_lexifier.UNPROVIDED) : query_sentence_lexifier.NIL);
                if (query_sentence_lexifier.NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_name_string(term_gloss, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                    pph_phrase.pph_phrase_set_category(term_dtr, query_sentence_lexifier.$const24$NounPhrase, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                }
                else if (query_sentence_lexifier.NIL != parse_tree.verbal_tree_p(tree)) {
                    final SubLObject head_phrase = methods.funcall_instance_method_with_0_args(tree, (SubLObject)query_sentence_lexifier.$sym25$GET_HEAD_DAUGHTERS).first();
                    final SubLObject head_string = (SubLObject)((query_sentence_lexifier.NIL != head_phrase) ? parse_tree_utilities.parse_tree_string(head_phrase) : query_sentence_lexifier.NIL);
                    final SubLObject head_preds = (SubLObject)((query_sentence_lexifier.NIL != head_phrase) ? lexicon_utilities.preds_of_string(head_string, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) : query_sentence_lexifier.NIL);
                    SubLObject term_pred = (SubLObject)query_sentence_lexifier.NIL;
                    if (query_sentence_lexifier.NIL == term_pred) {
                        SubLObject csome_list_var = head_preds;
                        SubLObject pred = (SubLObject)query_sentence_lexifier.NIL;
                        pred = csome_list_var.first();
                        while (query_sentence_lexifier.NIL == term_pred && query_sentence_lexifier.NIL != csome_list_var) {
                            if (query_sentence_lexifier.NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_stringXpred(term_gloss, pred, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                                term_pred = pred;
                            }
                            csome_list_var = csome_list_var.rest();
                            pred = csome_list_var.first();
                        }
                    }
                    if (query_sentence_lexifier.NIL != head_phrase && methods.funcall_instance_method_with_0_args(head_phrase, (SubLObject)query_sentence_lexifier.$sym26$GET_CATEGORY) == query_sentence_lexifier.$kw27$VBP) {
                        term_pred = query_sentence_lexifier.$const28$nonThirdSg_Present;
                    }
                    else if (query_sentence_lexifier.NIL != head_phrase && methods.funcall_instance_method_with_0_args(head_phrase, (SubLObject)query_sentence_lexifier.$sym26$GET_CATEGORY) == query_sentence_lexifier.$kw29$VBZ) {
                        term_pred = query_sentence_lexifier.$const30$thirdPersonSg_Present;
                    }
                    if (query_sentence_lexifier.NIL != term_pred) {
                        pph_phrase.pph_phrase_set_agr_pred(term_dtr, term_pred, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                    }
                }
                else if (query_sentence_lexifier.NIL != parse_tree.nominal_tree_p(tree)) {
                    final SubLObject head_daughters = methods.funcall_instance_method_with_0_args(tree, (SubLObject)query_sentence_lexifier.$sym25$GET_HEAD_DAUGHTERS);
                    final SubLObject head_phrase2 = (query_sentence_lexifier.NIL != head_daughters) ? head_daughters.first() : tree;
                    final SubLObject head_string2 = (SubLObject)((query_sentence_lexifier.NIL != head_phrase2) ? parse_tree_utilities.parse_tree_string(head_phrase2) : query_sentence_lexifier.NIL);
                    final SubLObject head_preds2 = (SubLObject)((query_sentence_lexifier.NIL != head_string2) ? lexicon_utilities.preds_of_string(head_string2, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) : query_sentence_lexifier.NIL);
                    SubLObject term_pred2 = (SubLObject)query_sentence_lexifier.NIL;
                    if (query_sentence_lexifier.NIL != string_utilities.substringP(head_string2, pph_phrase.pph_phrase_string(term_dtr, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                        if (query_sentence_lexifier.NIL == term_pred2) {
                            SubLObject csome_list_var2 = head_preds2;
                            SubLObject pred2 = (SubLObject)query_sentence_lexifier.NIL;
                            pred2 = csome_list_var2.first();
                            while (query_sentence_lexifier.NIL == term_pred2 && query_sentence_lexifier.NIL != csome_list_var2) {
                                if (query_sentence_lexifier.NIL != subl_promotions.memberP(v_term, lexicon_accessors.denots_of_stringXpred(term_gloss, pred2, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                                    term_pred2 = pred2;
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                pred2 = csome_list_var2.first();
                            }
                        }
                        if (query_sentence_lexifier.NIL != head_phrase2 && methods.funcall_instance_method_with_0_args(head_phrase2, (SubLObject)query_sentence_lexifier.$sym26$GET_CATEGORY) == query_sentence_lexifier.$kw31$NN) {
                            term_pred2 = query_sentence_lexifier.$const32$singular_Generic;
                        }
                        else if (query_sentence_lexifier.NIL != head_phrase2 && methods.funcall_instance_method_with_0_args(head_phrase2, (SubLObject)query_sentence_lexifier.$sym26$GET_CATEGORY) == query_sentence_lexifier.$kw33$NNS) {
                            term_pred2 = query_sentence_lexifier.$const34$plural_Generic;
                        }
                        if (query_sentence_lexifier.NIL != term_pred2) {
                            pph_phrase.pph_phrase_set_agr_pred(term_dtr, term_pred2, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                        }
                        if (query_sentence_lexifier.NIL != top_dtr) {
                            term_dtr = pph_templates.pph_new_np_from_det_and_nbar(top_dtr, term_dtr, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                            pph_phrase.pph_phrase_set_string(term_dtr, string_utilities.bunge((SubLObject)ConsesLow.list(pph_phrase.pph_phrase_string(top_dtr, (SubLObject)query_sentence_lexifier.UNPROVIDED), term_gloss), (SubLObject)query_sentence_lexifier.UNPROVIDED));
                        }
                        dtrs = dtrs.rest();
                    }
                }
                if (query_sentence_lexifier.NIL != nospace_before_termP) {
                    dtrs = dtrs.rest();
                    dtrs = (SubLObject)ConsesLow.cons(nospace_phrase_from_phrases((SubLObject)ConsesLow.list(top_dtr, term_dtr)), dtrs);
                }
                else {
                    dtrs = (SubLObject)ConsesLow.cons(term_dtr, dtrs);
                }
                query_sentence_with_keys = cycl_utilities.formula_subst(term_key, v_term, query_sentence_with_keys, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED);
                index = Numbers.add(start, Sequences.length(term_gloss));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list22);
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_offset = cdolist_list_var.first();
        }
        if (query_sentence_lexifier.NIL != list_utilities.lengthG(gloss, index, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
            final SubLObject whole_tail_string = string_utilities.substring(gloss, index, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            final SubLObject nospaceP2 = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != dtrs && query_sentence_lexifier.NIL == string_utilities.starts_with(whole_tail_string, (SubLObject)query_sentence_lexifier.$str19$_));
            dtrs = handle_unmatched_strings(whole_tail_string, dtrs, nospaceP2);
        }
        if (query_sentence_lexifier.NIL != dtrs) {
            if (query_sentence_lexifier.NIL != list_utilities.singletonP(dtrs)) {
                v_pph_phrase = dtrs.first();
            }
            else {
                v_pph_phrase = pph_data_structures.new_pph_phrase((SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                pph_phrase.set_pph_phrase_dtrs_from_list(v_pph_phrase, Sequences.nreverse(dtrs), (SubLObject)query_sentence_lexifier.UNPROVIDED);
            }
        }
        if (query_sentence_lexifier.NIL != v_pph_phrase) {
            relation_lexifier.rel_lex_guess_more_info(v_pph_phrase);
            relation_lexifier.rel_lex_revert_generic_arg_phrases(v_pph_phrase);
            if (query_sentence_lexifier.NIL != parsing_usefulP) {
                parsing_phrase = pph_phrase.pph_phrase_copy(v_pph_phrase, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            }
            relation_lexifier.rel_lex_merge_strings(v_pph_phrase);
        }
        return Values.values(v_pph_phrase, query_sentence_with_keys, problem_message, parsing_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 11213L)
    public static SubLObject nl_templates_from_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject alist, final SubLObject generationP, final SubLObject parsingP, SubLObject force) {
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gen_ans = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject parse_ans = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject problem_message = (SubLObject)query_sentence_lexifier.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)query_sentence_lexifier.T, thread);
            try {
                thread.resetMultipleValues();
                final SubLObject gen_phrase = pph_phrase_from_sentence(query_sentence, gloss, alist, parsingP, force);
                final SubLObject query_sentence_with_keys = thread.secondMultipleValue();
                final SubLObject pph_phrase_problem = thread.thirdMultipleValue();
                final SubLObject parsing_phrase = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                problem_message = pph_phrase_problem;
                if (query_sentence_lexifier.NIL != gen_phrase && query_sentence_lexifier.NIL != generationP) {
                    final SubLObject gentemplate_phrase = pph_templates.gentemplate_phrase_from_pph_phrase_int(gen_phrase);
                    if (force == query_sentence_lexifier.$kw37$DECLARATIVE && query_sentence_lexifier.NIL != rmp_gafP(query_sentence)) {
                        gen_ans = create_gentemplate_constrained_sentence(query_sentence_with_keys, gentemplate_phrase);
                    }
                    else if (force == query_sentence_lexifier.$kw37$DECLARATIVE && query_sentence_lexifier.NIL != el_utilities.gafP(query_sentence)) {
                        gen_ans = create_gentemplate_sentence(query_sentence_with_keys, gentemplate_phrase);
                    }
                    else if (force == query_sentence_lexifier.$kw15$INTERROGATIVE) {
                        gen_ans = el_utilities.make_binary_formula(query_sentence_lexifier.$const38$genTemplate_QuerySentence, query_sentence_with_keys, gentemplate_phrase);
                    }
                }
                if (query_sentence_lexifier.NIL != parsingP && query_sentence_lexifier.NIL != parsing_phrase) {
                    parse_ans = relation_lexifier.qsl_parse_template_from_pph_phrase(query_sentence, parsing_phrase, query_sentence_with_keys, force);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return Values.values(gen_ans, parse_ans, problem_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 12576L)
    public static SubLObject gtqs_and_parse_template_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        return nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, (SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.T, force);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 12964L)
    public static SubLObject construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(final SubLObject query_sentence, final SubLObject gloss, SubLObject force) {
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        final SubLObject gloss_info = gtqs_find_term_glosses(query_sentence, gloss);
        return gtqs_and_parse_template_from_query_sentence_gloss_info(query_sentence, gloss, gloss_info, force);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 13753L)
    public static SubLObject mapped_expression_subsumesP(final SubLObject expression1, final SubLObject expression2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != cycl_utilities.expression_find(expression2.first(), expression1.first(), (SubLObject)query_sentence_lexifier.NIL, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED) && expression1.rest().isString() && (!expression2.rest().isString() || query_sentence_lexifier.NIL != string_utilities.substringP(expression2.rest(), expression1.rest(), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 14030L)
    public static SubLObject english_query_contains_phraseP(final SubLObject phrase, final SubLObject english_query) {
        final SubLObject reg_exp = regular_expression_string_for_phrase_match(phrase);
        return list_utilities.sublisp_boolean(regular_expression_utilities.find_all_matches_for_regular_expression(reg_exp, english_query, (SubLObject)query_sentence_lexifier.$list9, (SubLObject)query_sentence_lexifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 14277L)
    public static SubLObject regular_expression_string_for_phrase_match(final SubLObject phrase) {
        final SubLObject escaped_phrase = regular_expression_utilities.escape_regex_special_chars(phrase);
        final SubLObject reg_exp1 = Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str39$__a_z0_9__, new SubLObject[] { escaped_phrase, query_sentence_lexifier.$str40$__a_z0_9_ });
        final SubLObject reg_exp2 = Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str41$_, new SubLObject[] { escaped_phrase, query_sentence_lexifier.$str40$__a_z0_9_ });
        final SubLObject reg_exp3 = Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str39$__a_z0_9__, new SubLObject[] { escaped_phrase, query_sentence_lexifier.$str42$_ });
        final SubLObject reg_exp4 = Sequences.cconcatenate(reg_exp1, new SubLObject[] { query_sentence_lexifier.$str43$_, reg_exp2, query_sentence_lexifier.$str43$_, reg_exp3 });
        return reg_exp4;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 14796L)
    public static SubLObject possibly_replaceable_term_p(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (query_sentence_lexifier.NIL != query_sentence_lexifier.$qsl_on_single_literal_query$.getDynamicValue(thread) && query_sentence_lexifier.NIL != fort_types_interface.relation_p(cycl)) {
            return (SubLObject)query_sentence_lexifier.NIL;
        }
        if (query_sentence_lexifier.NIL != time_quantity_p(cycl)) {
            return (SubLObject)query_sentence_lexifier.T;
        }
        if (cycl.isNumber()) {
            return (SubLObject)query_sentence_lexifier.T;
        }
        if (query_sentence_lexifier.NIL != sentential_operator_p(cycl)) {
            return (SubLObject)query_sentence_lexifier.NIL;
        }
        if (query_sentence_lexifier.NIL != narts_high.naut_p(cycl) && (query_sentence_lexifier.NIL != narts_high.find_nart(cycl) || query_sentence_lexifier.NIL != unit_of_money_p(cycl_utilities.naut_functor(cycl)) || query_sentence_lexifier.NIL != isa.isaP(cycl, query_sentence_lexifier.$const44$Date, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED))) {
            return (SubLObject)query_sentence_lexifier.T;
        }
        if (query_sentence_lexifier.NIL != forts.fort_p(cycl) && query_sentence_lexifier.NIL == fort_types_interface.relation_p(cycl) && query_sentence_lexifier.NIL == fort_types_interface.functionP(cycl) && query_sentence_lexifier.NIL == fort_types_interface.microtheory_p(cycl)) {
            return (SubLObject)query_sentence_lexifier.T;
        }
        if (cycl.isString()) {
            return (SubLObject)query_sentence_lexifier.T;
        }
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 15865L)
    public static SubLObject clear_unit_of_money_p() {
        final SubLObject cs = query_sentence_lexifier.$unit_of_money_p_caching_state$.getGlobalValue();
        if (query_sentence_lexifier.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 15865L)
    public static SubLObject remove_unit_of_money_p(final SubLObject thing) {
        return memoization_state.caching_state_remove_function_results_with_args(query_sentence_lexifier.$unit_of_money_p_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(thing), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 15865L)
    public static SubLObject unit_of_money_p_internal(final SubLObject thing) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != fort_types_interface.functionP(thing) && query_sentence_lexifier.NIL != isa.isa_in_any_mtP(thing, query_sentence_lexifier.$const46$UnitOfMoney));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 15865L)
    public static SubLObject unit_of_money_p(final SubLObject thing) {
        SubLObject caching_state = query_sentence_lexifier.$unit_of_money_p_caching_state$.getGlobalValue();
        if (query_sentence_lexifier.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_sentence_lexifier.$sym45$UNIT_OF_MONEY_P, (SubLObject)query_sentence_lexifier.$sym47$_UNIT_OF_MONEY_P_CACHING_STATE_, (SubLObject)query_sentence_lexifier.$int48$500, (SubLObject)query_sentence_lexifier.EQL, (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, thing, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(unit_of_money_p_internal(thing)));
            memoization_state.caching_state_put(caching_state, thing, results, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16019L)
    public static SubLObject time_quantity_p(final SubLObject thing) {
        return isa.isa_in_any_mtP(thing, query_sentence_lexifier.$const49$Time_Quantity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16108L)
    public static SubLObject sentential_operator_p(final SubLObject thing) {
        return conses_high.member(thing, sentential_operators(), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16202L)
    public static SubLObject clear_sentential_operators() {
        final SubLObject cs = query_sentence_lexifier.$sentential_operators_caching_state$.getGlobalValue();
        if (query_sentence_lexifier.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16202L)
    public static SubLObject remove_sentential_operators() {
        return memoization_state.caching_state_remove_function_results_with_args(query_sentence_lexifier.$sentential_operators_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(query_sentence_lexifier.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16202L)
    public static SubLObject sentential_operators_internal() {
        return isa.all_fort_instances_in_all_mts(query_sentence_lexifier.$const51$SententialOperator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16202L)
    public static SubLObject sentential_operators() {
        SubLObject caching_state = query_sentence_lexifier.$sentential_operators_caching_state$.getGlobalValue();
        if (query_sentence_lexifier.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)query_sentence_lexifier.$sym50$SENTENTIAL_OPERATORS, (SubLObject)query_sentence_lexifier.$sym52$_SENTENTIAL_OPERATORS_CACHING_STATE_, (SubLObject)query_sentence_lexifier.NIL, (SubLObject)query_sentence_lexifier.EQL, (SubLObject)query_sentence_lexifier.ZERO_INTEGER, (SubLObject)query_sentence_lexifier.ZERO_INTEGER);
            memoization_state.register_isa_dependent_cache_clear_callback((SubLObject)query_sentence_lexifier.$sym53$CLEAR_SENTENTIAL_OPERATORS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sentential_operators_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 16337L)
    public static SubLObject do_reified_query_spec_sentences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_sentence = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject gloss = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject template = (SubLObject)query_sentence_lexifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list54);
        query_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list54);
        gloss = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list54);
        template = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject current_$5 = (SubLObject)query_sentence_lexifier.NIL;
        while (query_sentence_lexifier.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)query_sentence_lexifier.$list54);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)query_sentence_lexifier.$list54);
            if (query_sentence_lexifier.NIL == conses_high.member(current_$5, (SubLObject)query_sentence_lexifier.$list55, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                bad = (SubLObject)query_sentence_lexifier.T;
            }
            if (current_$5 == query_sentence_lexifier.$kw56$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (query_sentence_lexifier.NIL != bad && query_sentence_lexifier.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list54);
        }
        final SubLObject test_specification_type_tail = cdestructuring_bind.property_list_member((SubLObject)query_sentence_lexifier.$kw57$TEST_SPECIFICATION_TYPE, current);
        final SubLObject test_specification_type = (SubLObject)((query_sentence_lexifier.NIL != test_specification_type_tail) ? conses_high.cadr(test_specification_type_tail) : query_sentence_lexifier.NIL);
        final SubLObject template_folder_tail = cdestructuring_bind.property_list_member((SubLObject)query_sentence_lexifier.$kw58$TEMPLATE_FOLDER, current);
        final SubLObject template_folder = (SubLObject)((query_sentence_lexifier.NIL != template_folder_tail) ? conses_high.cadr(template_folder_tail) : query_sentence_lexifier.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject ftg_gaf = (SubLObject)query_sentence_lexifier.$sym59$FTG_GAF;
        final SubLObject query_spec = (SubLObject)query_sentence_lexifier.$sym60$QUERY_SPEC;
        return (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym61$WITH_ALL_MTS, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym62$DO_PREDICATE_EXTENT_INDEX, reader.bq_cons(ftg_gaf, (SubLObject)query_sentence_lexifier.$list63), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym64$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(template, gloss), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym65$GAF_ARGS, ftg_gaf), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym66$CDOLIST, (SubLObject)ConsesLow.list(query_spec, (SubLObject)ConsesLow.listS((SubLObject)query_sentence_lexifier.$sym67$PRED_VALUES, template, (SubLObject)query_sentence_lexifier.$list68)), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym69$PWHEN, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym70$CAND, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym71$FIMPLIES, test_specification_type, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym70$CAND, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym72$NART_P, query_spec), (SubLObject)ConsesLow.listS((SubLObject)query_sentence_lexifier.EQL, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym73$NAT_FUNCTOR, query_spec), (SubLObject)query_sentence_lexifier.$list74), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym75$ISA_, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym76$NAT_ARG1, query_spec), test_specification_type))), (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym71$FIMPLIES, template_folder, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym77$MEMBER_, template_folder, (SubLObject)ConsesLow.listS((SubLObject)query_sentence_lexifier.$sym78$PRED_VALUES_IN_ANY_MT, template, (SubLObject)query_sentence_lexifier.$list79)))), (SubLObject)ConsesLow.listS((SubLObject)query_sentence_lexifier.$sym66$CDOLIST, (SubLObject)ConsesLow.list(query_sentence, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym80$KBQ_SENTENCES, query_spec)), ConsesLow.append(body, (SubLObject)query_sentence_lexifier.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 17312L)
    public static SubLObject do_reified_query_lexifications(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list81);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_sentence = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject gloss = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject template = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject alist = (SubLObject)query_sentence_lexifier.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list81);
        query_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list81);
        gloss = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list81);
        template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list81);
        alist = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject current_$6 = (SubLObject)query_sentence_lexifier.NIL;
        while (query_sentence_lexifier.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)query_sentence_lexifier.$list81);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)query_sentence_lexifier.$list81);
            if (query_sentence_lexifier.NIL == conses_high.member(current_$6, (SubLObject)query_sentence_lexifier.$list55, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                bad = (SubLObject)query_sentence_lexifier.T;
            }
            if (current_$6 == query_sentence_lexifier.$kw56$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (query_sentence_lexifier.NIL != bad && query_sentence_lexifier.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list81);
        }
        final SubLObject test_specification_type_tail = cdestructuring_bind.property_list_member((SubLObject)query_sentence_lexifier.$kw57$TEST_SPECIFICATION_TYPE, current);
        final SubLObject test_specification_type = (SubLObject)((query_sentence_lexifier.NIL != test_specification_type_tail) ? conses_high.cadr(test_specification_type_tail) : query_sentence_lexifier.NIL);
        final SubLObject template_folder_tail = cdestructuring_bind.property_list_member((SubLObject)query_sentence_lexifier.$kw58$TEMPLATE_FOLDER, current);
        final SubLObject template_folder = (SubLObject)((query_sentence_lexifier.NIL != template_folder_tail) ? conses_high.cadr(template_folder_tail) : query_sentence_lexifier.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym82$DO_REIFIED_QUERY_SPEC_SENTENCES, (SubLObject)ConsesLow.list(query_sentence, gloss, template, (SubLObject)query_sentence_lexifier.$kw57$TEST_SPECIFICATION_TYPE, test_specification_type, (SubLObject)query_sentence_lexifier.$kw58$TEMPLATE_FOLDER, template_folder), (SubLObject)ConsesLow.listS((SubLObject)query_sentence_lexifier.$sym83$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(alist, (SubLObject)ConsesLow.list((SubLObject)query_sentence_lexifier.$sym84$GTQS_FIND_TERM_GLOSSES, query_sentence, gloss))), ConsesLow.append(body, (SubLObject)query_sentence_lexifier.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 17738L)
    public static SubLObject print_reified_query_lexifications(SubLObject test_specification_type, SubLObject template_folder) {
        if (test_specification_type == query_sentence_lexifier.UNPROVIDED) {
            test_specification_type = query_sentence_lexifier.$const85$TKBTestQuery;
        }
        if (template_folder == query_sentence_lexifier.UNPROVIDED) {
            template_folder = query_sentence_lexifier.$const86$TKB_RedTeamQueryFolder;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        print_high.princ((SubLObject)query_sentence_lexifier.$str87$In_Mt__EnglishParaphraseMt_, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)query_sentence_lexifier.$sym88$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(query_sentence_lexifier.$const89$EverythingPSC, thread);
            final SubLObject pred_var = query_sentence_lexifier.$const90$formulaTemplateGloss;
            if (query_sentence_lexifier.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)query_sentence_lexifier.NIL;
                final SubLObject _prev_bind_0_$7 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((query_sentence_lexifier.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : query_sentence_lexifier.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)query_sentence_lexifier.NIL;
                    final SubLObject token_var = (SubLObject)query_sentence_lexifier.NIL;
                    while (query_sentence_lexifier.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (query_sentence_lexifier.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)query_sentence_lexifier.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)query_sentence_lexifier.$kw91$GAF, (SubLObject)query_sentence_lexifier.$kw92$TRUE, (SubLObject)query_sentence_lexifier.NIL);
                                SubLObject done_var_$9 = (SubLObject)query_sentence_lexifier.NIL;
                                final SubLObject token_var_$10 = (SubLObject)query_sentence_lexifier.NIL;
                                while (query_sentence_lexifier.NIL == done_var_$9) {
                                    final SubLObject ftg_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$10);
                                    final SubLObject valid_$11 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$10.eql(ftg_gaf));
                                    if (query_sentence_lexifier.NIL != valid_$11) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(ftg_gaf);
                                        SubLObject template = (SubLObject)query_sentence_lexifier.NIL;
                                        SubLObject gloss = (SubLObject)query_sentence_lexifier.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list93);
                                        template = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list93);
                                        gloss = current.first();
                                        current = current.rest();
                                        if (query_sentence_lexifier.NIL == current) {
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(template, query_sentence_lexifier.$const97$querySpecificationForFormulaTempl, (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)query_sentence_lexifier.$kw92$TRUE);
                                            SubLObject query_spec = (SubLObject)query_sentence_lexifier.NIL;
                                            query_spec = cdolist_list_var.first();
                                            while (query_sentence_lexifier.NIL != cdolist_list_var) {
                                                if ((query_sentence_lexifier.NIL == test_specification_type || (query_sentence_lexifier.NIL != nart_handles.nart_p(query_spec) && cycl_utilities.nat_functor(query_spec).eql(query_sentence_lexifier.$const94$TestQueryFn) && query_sentence_lexifier.NIL != isa.isaP(cycl_utilities.nat_arg1(query_spec, (SubLObject)query_sentence_lexifier.UNPROVIDED), test_specification_type, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED))) && (query_sentence_lexifier.NIL == template_folder || query_sentence_lexifier.NIL != subl_promotions.memberP(template_folder, kb_mapping_utilities.pred_values_in_any_mt(template, query_sentence_lexifier.$const95$folderContainsResource, (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED))) {
                                                    SubLObject cdolist_list_var_$12 = kb_query.kbq_sentences(query_spec);
                                                    SubLObject query_sentence = (SubLObject)query_sentence_lexifier.NIL;
                                                    query_sentence = cdolist_list_var_$12.first();
                                                    while (query_sentence_lexifier.NIL != cdolist_list_var_$12) {
                                                        final SubLObject alist = gtqs_find_term_glosses(query_sentence, gloss);
                                                        final SubLObject gtqs_sentence = gtqs_from_query_sentence_gloss_info(query_sentence, gloss, alist, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                                                        if (query_sentence_lexifier.NIL != gtqs_sentence) {
                                                            PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str96$__f___S_____, gtqs_sentence);
                                                        }
                                                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                                        query_sentence = cdolist_list_var_$12.first();
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                query_spec = cdolist_list_var.first();
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list93);
                                        }
                                    }
                                    done_var_$9 = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL == valid_$11);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (query_sentence_lexifier.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$8, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 18291L)
    public static SubLObject test_reified_query_lexifications(SubLObject test_specification_type, SubLObject template_folder) {
        if (test_specification_type == query_sentence_lexifier.UNPROVIDED) {
            test_specification_type = query_sentence_lexifier.$const85$TKBTestQuery;
        }
        if (template_folder == query_sentence_lexifier.UNPROVIDED) {
            template_folder = (SubLObject)query_sentence_lexifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)query_sentence_lexifier.$sym88$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(query_sentence_lexifier.$const89$EverythingPSC, thread);
            final SubLObject pred_var = query_sentence_lexifier.$const90$formulaTemplateGloss;
            if (query_sentence_lexifier.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)query_sentence_lexifier.NIL;
                final SubLObject _prev_bind_0_$14 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$15 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((query_sentence_lexifier.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : query_sentence_lexifier.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)query_sentence_lexifier.NIL;
                    final SubLObject token_var = (SubLObject)query_sentence_lexifier.NIL;
                    while (query_sentence_lexifier.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (query_sentence_lexifier.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)query_sentence_lexifier.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)query_sentence_lexifier.$kw91$GAF, (SubLObject)query_sentence_lexifier.$kw92$TRUE, (SubLObject)query_sentence_lexifier.NIL);
                                SubLObject done_var_$16 = (SubLObject)query_sentence_lexifier.NIL;
                                final SubLObject token_var_$17 = (SubLObject)query_sentence_lexifier.NIL;
                                while (query_sentence_lexifier.NIL == done_var_$16) {
                                    final SubLObject ftg_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                    final SubLObject valid_$18 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$17.eql(ftg_gaf));
                                    if (query_sentence_lexifier.NIL != valid_$18) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(ftg_gaf);
                                        SubLObject template = (SubLObject)query_sentence_lexifier.NIL;
                                        SubLObject gloss = (SubLObject)query_sentence_lexifier.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list93);
                                        template = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list93);
                                        gloss = current.first();
                                        current = current.rest();
                                        if (query_sentence_lexifier.NIL == current) {
                                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(template, query_sentence_lexifier.$const97$querySpecificationForFormulaTempl, (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)query_sentence_lexifier.$kw92$TRUE);
                                            SubLObject query_spec = (SubLObject)query_sentence_lexifier.NIL;
                                            query_spec = cdolist_list_var.first();
                                            while (query_sentence_lexifier.NIL != cdolist_list_var) {
                                                if ((query_sentence_lexifier.NIL == test_specification_type || (query_sentence_lexifier.NIL != nart_handles.nart_p(query_spec) && cycl_utilities.nat_functor(query_spec).eql(query_sentence_lexifier.$const94$TestQueryFn) && query_sentence_lexifier.NIL != isa.isaP(cycl_utilities.nat_arg1(query_spec, (SubLObject)query_sentence_lexifier.UNPROVIDED), test_specification_type, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED))) && (query_sentence_lexifier.NIL == template_folder || query_sentence_lexifier.NIL != subl_promotions.memberP(template_folder, kb_mapping_utilities.pred_values_in_any_mt(template, query_sentence_lexifier.$const95$folderContainsResource, (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.UNPROVIDED), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED))) {
                                                    SubLObject cdolist_list_var_$19 = kb_query.kbq_sentences(query_spec);
                                                    SubLObject query_sentence = (SubLObject)query_sentence_lexifier.NIL;
                                                    query_sentence = cdolist_list_var_$19.first();
                                                    while (query_sentence_lexifier.NIL != cdolist_list_var_$19) {
                                                        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str98$___Template___S__, template);
                                                        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str99$___S___Gloss___S__, query_sentence, gloss);
                                                        final SubLObject _prev_bind_0_$15 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$16 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                                                            final SubLObject _prev_bind_0_$16 = pph_question.$pph_use_gtqsP$.currentBinding(thread);
                                                            try {
                                                                pph_question.$pph_use_gtqsP$.bind((SubLObject)query_sentence_lexifier.NIL, thread);
                                                                final SubLObject regular_paraphrase = pph_question.generate_question(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)query_sentence_lexifier.$kw100$HTML, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                                                                PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str101$_Old___S__, regular_paraphrase);
                                                            }
                                                            finally {
                                                                pph_question.$pph_use_gtqsP$.rebind(_prev_bind_0_$16, thread);
                                                            }
                                                            thread.resetMultipleValues();
                                                            final SubLObject new_paraphrase = pph_question.generate_question(query_sentence, pph_vars.$pph_language_mt$.getDynamicValue(thread), pph_vars.$pph_domain_mt$.getDynamicValue(thread), (SubLObject)query_sentence_lexifier.$kw100$HTML, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                                                            final SubLObject nl_pred = thread.secondMultipleValue();
                                                            final SubLObject supports = thread.thirdMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (query_sentence_lexifier.NIL != Sequences.find_if((SubLObject)query_sentence_lexifier.$sym102$GTQS_ASSERTION_P, supports, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                                                                PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str103$___New___S__, new_paraphrase);
                                                            }
                                                        }
                                                        finally {
                                                            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_1_$16, thread);
                                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$15, thread);
                                                        }
                                                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                        query_sentence = cdolist_list_var_$19.first();
                                                    }
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                query_spec = cdolist_list_var.first();
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list93);
                                        }
                                    }
                                    done_var_$16 = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL == valid_$18);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (query_sentence_lexifier.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$15, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$14, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 19248L)
    public static SubLObject gtqs_assertion_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != assertion_handles.assertion_p(v_object) && query_sentence_lexifier.NIL != assertions_high.gaf_assertionP(v_object) && assertions_high.gaf_arg0(v_object).eql(query_sentence_lexifier.$const38$genTemplate_QuerySentence));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 19415L)
    public static SubLObject gtqs_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gtqs = nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, (SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.NIL, force);
        final SubLObject parse_template = thread.secondMultipleValue();
        final SubLObject problem_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(gtqs, problem_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 19885L)
    public static SubLObject parse_template_from_query_sentence_gloss_info(final SubLObject query_sentence, final SubLObject gloss, final SubLObject term_gloss_alist, SubLObject force) {
        if (force == query_sentence_lexifier.UNPROVIDED) {
            force = (SubLObject)query_sentence_lexifier.$kw15$INTERROGATIVE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject gen_template = nl_templates_from_sentence_gloss_info(query_sentence, gloss, term_gloss_alist, (SubLObject)query_sentence_lexifier.NIL, (SubLObject)query_sentence_lexifier.T, force);
        final SubLObject parse_template = thread.secondMultipleValue();
        final SubLObject problem_message = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(parse_template, problem_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 20363L)
    public static SubLObject create_gentemplate_sentence(final SubLObject query_sentence, final SubLObject gentemplate_phrase) {
        SubLObject result = el_utilities.make_binary_formula(query_sentence_lexifier.$const104$genTemplate, cycl_utilities.formula_arg0(query_sentence), gentemplate_phrase);
        SubLObject list_var = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject var = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject arg_num = (SubLObject)query_sentence_lexifier.NIL;
        list_var = cycl_utilities.formula_args(query_sentence, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        var = list_var.first();
        for (arg_num = (SubLObject)query_sentence_lexifier.ZERO_INTEGER; query_sentence_lexifier.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), arg_num = Numbers.add((SubLObject)query_sentence_lexifier.ONE_INTEGER, arg_num)) {
            result = cycl_utilities.expression_subst(Symbols.make_keyword(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str105$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(arg_num)))), var, result, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 20780L)
    public static SubLObject create_gentemplate_constrained_sentence(final SubLObject query_sentence, final SubLObject gentemplate_phrase) {
        final SubLObject arg0 = cycl_utilities.formula_arg0(query_sentence);
        final SubLObject arg2 = cycl_utilities.formula_arg1(query_sentence, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        SubLObject result = el_utilities.make_ternary_formula(query_sentence_lexifier.$const106$genTemplate_Constrained, arg0, (SubLObject)ConsesLow.list(query_sentence_lexifier.$const107$equals, (SubLObject)query_sentence_lexifier.$kw108$ARG1, arg2), gentemplate_phrase);
        SubLObject list_var = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject var = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject arg_num = (SubLObject)query_sentence_lexifier.NIL;
        list_var = cycl_utilities.formula_args(query_sentence, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        var = list_var.first();
        for (arg_num = (SubLObject)query_sentence_lexifier.ZERO_INTEGER; query_sentence_lexifier.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), arg_num = Numbers.add((SubLObject)query_sentence_lexifier.ONE_INTEGER, arg_num)) {
            if (var.isKeyword()) {
                result = cycl_utilities.expression_subst(Symbols.make_keyword(Sequences.cconcatenate((SubLObject)query_sentence_lexifier.$str105$ARG, format_nil.format_nil_a_no_copy(number_utilities.f_1X(arg_num)))), var, result, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 21311L)
    public static SubLObject rmp_gafP(final SubLObject sentence) {
        final SubLObject arg0 = cycl_utilities.formula_arg0(sentence);
        return (SubLObject)SubLObjectFactory.makeBoolean(query_sentence_lexifier.NIL != el_utilities.gafP(sentence) && (query_sentence_lexifier.NIL != isa.isaP(arg0, query_sentence_lexifier.$const109$InstanceTypeTernaryRuleMacroPredi, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) || query_sentence_lexifier.NIL != isa.isaP(arg0, query_sentence_lexifier.$const110$TypeInstanceTernaryRuleMacroPredi, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) || query_sentence_lexifier.NIL != isa.isaP(arg0, query_sentence_lexifier.$const111$TypeTypeTernaryRuleMacroPredicate, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 21602L)
    public static SubLObject handle_unmatched_strings(final SubLObject whole_string, SubLObject dtrs, final SubLObject nospaceP) {
        SubLObject tokens = string_utilities.string_tokenize(whole_string, (SubLObject)query_sentence_lexifier.$list112, (SubLObject)query_sentence_lexifier.NIL, (SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        tokens = Sequences.remove((SubLObject)query_sentence_lexifier.$str19$_, tokens, Symbols.symbol_function((SubLObject)query_sentence_lexifier.EQUAL), (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        SubLObject list_var = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject sub_string = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject i = (SubLObject)query_sentence_lexifier.NIL;
        list_var = tokens;
        sub_string = list_var.first();
        for (i = (SubLObject)query_sentence_lexifier.ZERO_INTEGER; query_sentence_lexifier.NIL != list_var; list_var = list_var.rest(), sub_string = list_var.first(), i = Numbers.add((SubLObject)query_sentence_lexifier.ONE_INTEGER, i)) {
            final SubLObject current_dtr = pph_data_structures.new_pph_phrase(sub_string, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            if (query_sentence_lexifier.NIL != lexicon_accessors.string_is_posP(sub_string, query_sentence_lexifier.$const113$Pronoun, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) && query_sentence_lexifier.NIL == lexicon_accessors.string_is_posP(sub_string, query_sentence_lexifier.$const114$Determiner, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED)) {
                pph_phrase.pph_phrase_set_category(current_dtr, query_sentence_lexifier.$const24$NounPhrase, (SubLObject)query_sentence_lexifier.UNPROVIDED);
            }
            if (query_sentence_lexifier.NIL != nospaceP && i.isZero()) {
                final SubLObject top_dtr = dtrs.first();
                final SubLObject nospace_dtr = nospace_phrase_from_phrases((SubLObject)ConsesLow.list(top_dtr, current_dtr));
                dtrs = dtrs.rest();
                dtrs = (SubLObject)ConsesLow.cons(nospace_dtr, dtrs);
            }
            else {
                dtrs = (SubLObject)ConsesLow.cons(current_dtr, dtrs);
            }
        }
        return dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 22343L)
    public static SubLObject ql_syntactic_xps(final SubLObject string) {
        return parse_tree_utilities.syntactic_xps(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 22418L)
    public static SubLObject best_tree_for_string(final SubLObject string, final SubLObject xp_trees, final SubLObject xp_strings, final SubLObject full_tree) {
        SubLObject best_xp_string = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject best_xp_tree = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject xp_string = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject xp_string_$24 = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject xp_tree = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject xp_tree_$25 = (SubLObject)query_sentence_lexifier.NIL;
        xp_string = xp_strings;
        xp_string_$24 = xp_string.first();
        xp_tree = xp_trees;
        xp_tree_$25 = xp_tree.first();
        while (query_sentence_lexifier.NIL != xp_tree || query_sentence_lexifier.NIL != xp_string) {
            if (query_sentence_lexifier.NIL != string_utilities.substringP(string, xp_string_$24, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED) && (!best_xp_string.isString() || query_sentence_lexifier.NIL != list_utilities.lengthG(best_xp_string, Sequences.length(xp_string_$24), (SubLObject)query_sentence_lexifier.UNPROVIDED))) {
                best_xp_string = xp_string_$24;
                best_xp_tree = xp_tree_$25;
            }
            xp_string = xp_string.rest();
            xp_string_$24 = xp_string.first();
            xp_tree = xp_tree.rest();
            xp_tree_$25 = xp_tree.first();
        }
        return best_xp_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 22972L)
    public static SubLObject nospace_phrase_from_phrases(final SubLObject phrases) {
        final SubLObject concatenated = pph_data_structures.new_pph_phrase((SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        final SubLObject new_phrases = compute_nospace_phrases(phrases);
        pph_phrase.set_pph_phrase_dtrs_from_list(concatenated, new_phrases, (SubLObject)query_sentence_lexifier.UNPROVIDED);
        return pph_phrase.convert_pph_phrase_to_nospace_phrase(concatenated);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 23244L)
    public static SubLObject compute_nospace_phrases(final SubLObject phrases) {
        SubLObject new_phrases = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject cdolist_list_var = phrases;
        SubLObject phrase = (SubLObject)query_sentence_lexifier.NIL;
        phrase = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            if (query_sentence_lexifier.NIL != pph_phrase.pph_nospace_phrase_p(phrase)) {
                SubLObject cdolist_list_var_$26 = compute_nospace_phrases(pph_phrase.pph_phrase_dtr_list(pph_phrase.pph_phrase_nth_dtr(phrase, (SubLObject)query_sentence_lexifier.ZERO_INTEGER)));
                SubLObject real_phrase = (SubLObject)query_sentence_lexifier.NIL;
                real_phrase = cdolist_list_var_$26.first();
                while (query_sentence_lexifier.NIL != cdolist_list_var_$26) {
                    new_phrases = (SubLObject)ConsesLow.cons(real_phrase, new_phrases);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    real_phrase = cdolist_list_var_$26.first();
                }
            }
            else {
                new_phrases = (SubLObject)ConsesLow.cons(phrase, new_phrases);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_phrases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/query-sentence-lexifier.lisp", position = 23637L)
    public static SubLObject construct_gtqs_for_sentences_and_glosses(final SubLObject input_triples) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successful = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject unsuccessful = (SubLObject)query_sentence_lexifier.NIL;
        SubLObject total_time = (SubLObject)query_sentence_lexifier.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)query_sentence_lexifier.$str115$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(input_triples), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)query_sentence_lexifier.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)query_sentence_lexifier.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)query_sentence_lexifier.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = input_triples;
                SubLObject triple = (SubLObject)query_sentence_lexifier.NIL;
                triple = csome_list_var.first();
                while (query_sentence_lexifier.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = triple;
                    SubLObject template = (SubLObject)query_sentence_lexifier.NIL;
                    SubLObject cycl = (SubLObject)query_sentence_lexifier.NIL;
                    SubLObject gloss = (SubLObject)query_sentence_lexifier.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list116);
                    template = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list116);
                    cycl = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)query_sentence_lexifier.$list116);
                    gloss = current.first();
                    current = current.rest();
                    if (query_sentence_lexifier.NIL == current) {
                        SubLObject ignore_errors_tag = (SubLObject)query_sentence_lexifier.NIL;
                        try {
                            thread.throwStack.push(query_sentence_lexifier.$kw117$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0_$27 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)query_sentence_lexifier.$sym118$IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    final SubLObject gtqs = construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss(cycl, gloss, (SubLObject)query_sentence_lexifier.UNPROVIDED);
                                    if (query_sentence_lexifier.NIL != gtqs) {
                                        successful = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gtqs, cycl, gloss), successful);
                                    }
                                    else {
                                        unsuccessful = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gtqs, cycl, gloss), unsuccessful);
                                    }
                                }
                                catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, (SubLObject)query_sentence_lexifier.NIL);
                                }
                            }
                            finally {
                                Errors.$error_handler$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                        catch (Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)query_sentence_lexifier.$kw117$IGNORE_ERRORS_TARGET);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)query_sentence_lexifier.$list116);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)query_sentence_lexifier.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    triple = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)query_sentence_lexifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        final SubLObject total_attempts = Sequences.length(input_triples);
        final SubLObject total_successes = Sequences.length(successful);
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str119$Total_attempts___S_in__S_seconds_, total_attempts, total_time);
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str120$Successful_attempts___S__, total_successes);
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str121$__successful___S__, Numbers.multiply(Numbers.divide(total_successes, total_attempts), (SubLObject)query_sentence_lexifier.$int122$100));
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str123$Average_time_per_attempt___S__, Numbers.divide(total_time, total_attempts));
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str124$__Successful_GTQS_Constructions__);
        SubLObject cdolist_list_var = successful;
        SubLObject success = (SubLObject)query_sentence_lexifier.NIL;
        success = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = success;
            SubLObject gtqs2 = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject cycl2 = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject gloss2 = (SubLObject)query_sentence_lexifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            gtqs2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            cycl2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            gloss2 = current2.first();
            current2 = current2.rest();
            if (query_sentence_lexifier.NIL == current2) {
                PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str126$CycL___S__Gloss___S__GTQS___S____, new SubLObject[] { cycl2, gloss2, gtqs2 });
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)query_sentence_lexifier.$list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            success = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str127$__________Unsuccessful_GTQS_Const);
        cdolist_list_var = unsuccessful;
        SubLObject unsuccess = (SubLObject)query_sentence_lexifier.NIL;
        unsuccess = cdolist_list_var.first();
        while (query_sentence_lexifier.NIL != cdolist_list_var) {
            SubLObject current2;
            final SubLObject datum2 = current2 = unsuccess;
            SubLObject gtqs2 = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject cycl2 = (SubLObject)query_sentence_lexifier.NIL;
            SubLObject gloss2 = (SubLObject)query_sentence_lexifier.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            gtqs2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            cycl2 = current2.first();
            current2 = current2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)query_sentence_lexifier.$list125);
            gloss2 = current2.first();
            current2 = current2.rest();
            if (query_sentence_lexifier.NIL == current2) {
                PrintLow.format((SubLObject)query_sentence_lexifier.T, (SubLObject)query_sentence_lexifier.$str126$CycL___S__Gloss___S__GTQS___S____, new SubLObject[] { cycl2, gloss2, gtqs2 });
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)query_sentence_lexifier.$list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            unsuccess = cdolist_list_var.first();
        }
        return Values.values(successful, unsuccessful);
    }
    
    public static SubLObject declare_query_sentence_lexifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "gtqs_add_term_gloss", "GTQS-ADD-TERM-GLOSS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "gtqs_find_term_glosses", "GTQS-FIND-TERM-GLOSSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "get_term_offsets", "GET-TERM-OFFSETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "pph_phrase_from_sentence", "PPH-PHRASE-FROM-SENTENCE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "nl_templates_from_sentence_gloss_info", "NL-TEMPLATES-FROM-SENTENCE-GLOSS-INFO", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "gtqs_and_parse_template_from_query_sentence_gloss_info", "GTQS-AND-PARSE-TEMPLATE-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "construct_gtqs_sentence_and_parse_template_for_query_sentence_from_gloss", "CONSTRUCT-GTQS-SENTENCE-AND-PARSE-TEMPLATE-FOR-QUERY-SENTENCE-FROM-GLOSS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "mapped_expression_subsumesP", "MAPPED-EXPRESSION-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "english_query_contains_phraseP", "ENGLISH-QUERY-CONTAINS-PHRASE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "regular_expression_string_for_phrase_match", "REGULAR-EXPRESSION-STRING-FOR-PHRASE-MATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "possibly_replaceable_term_p", "POSSIBLY-REPLACEABLE-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "clear_unit_of_money_p", "CLEAR-UNIT-OF-MONEY-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "remove_unit_of_money_p", "REMOVE-UNIT-OF-MONEY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "unit_of_money_p_internal", "UNIT-OF-MONEY-P-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "unit_of_money_p", "UNIT-OF-MONEY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "time_quantity_p", "TIME-QUANTITY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "sentential_operator_p", "SENTENTIAL-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "clear_sentential_operators", "CLEAR-SENTENTIAL-OPERATORS", 0, 0, false);
        new $clear_sentential_operators$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "remove_sentential_operators", "REMOVE-SENTENTIAL-OPERATORS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "sentential_operators_internal", "SENTENTIAL-OPERATORS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "sentential_operators", "SENTENTIAL-OPERATORS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.query_sentence_lexifier", "do_reified_query_spec_sentences", "DO-REIFIED-QUERY-SPEC-SENTENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.query_sentence_lexifier", "do_reified_query_lexifications", "DO-REIFIED-QUERY-LEXIFICATIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "print_reified_query_lexifications", "PRINT-REIFIED-QUERY-LEXIFICATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "test_reified_query_lexifications", "TEST-REIFIED-QUERY-LEXIFICATIONS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "gtqs_assertion_p", "GTQS-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "gtqs_from_query_sentence_gloss_info", "GTQS-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "parse_template_from_query_sentence_gloss_info", "PARSE-TEMPLATE-FROM-QUERY-SENTENCE-GLOSS-INFO", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "create_gentemplate_sentence", "CREATE-GENTEMPLATE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "create_gentemplate_constrained_sentence", "CREATE-GENTEMPLATE-CONSTRAINED-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "rmp_gafP", "RMP-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "handle_unmatched_strings", "HANDLE-UNMATCHED-STRINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "ql_syntactic_xps", "QL-SYNTACTIC-XPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "best_tree_for_string", "BEST-TREE-FOR-STRING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "nospace_phrase_from_phrases", "NOSPACE-PHRASE-FROM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "compute_nospace_phrases", "COMPUTE-NOSPACE-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.query_sentence_lexifier", "construct_gtqs_for_sentences_and_glosses", "CONSTRUCT-GTQS-FOR-SENTENCES-AND-GLOSSES", 1, 0, false);
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    public static SubLObject init_query_sentence_lexifier_file() {
        query_sentence_lexifier.$qsl_on_single_literal_query$ = SubLFiles.defparameter("*QSL-ON-SINGLE-LITERAL-QUERY*", (SubLObject)query_sentence_lexifier.NIL);
        query_sentence_lexifier.$unit_of_money_p_caching_state$ = SubLFiles.deflexical("*UNIT-OF-MONEY-P-CACHING-STATE*", (SubLObject)query_sentence_lexifier.NIL);
        query_sentence_lexifier.$sentential_operators_caching_state$ = SubLFiles.deflexical("*SENTENTIAL-OPERATORS-CACHING-STATE*", (SubLObject)query_sentence_lexifier.NIL);
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    public static SubLObject setup_query_sentence_lexifier_file() {
        memoization_state.note_globally_cached_function((SubLObject)query_sentence_lexifier.$sym45$UNIT_OF_MONEY_P);
        memoization_state.note_globally_cached_function((SubLObject)query_sentence_lexifier.$sym50$SENTENTIAL_OPERATORS);
        return (SubLObject)query_sentence_lexifier.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_query_sentence_lexifier_file();
    }
    
    @Override
	public void initializeVariables() {
        init_query_sentence_lexifier_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_query_sentence_lexifier_file();
    }
    
    static {
        me = (SubLFile)new query_sentence_lexifier();
        query_sentence_lexifier.$qsl_on_single_literal_query$ = null;
        query_sentence_lexifier.$unit_of_money_p_caching_state$ = null;
        query_sentence_lexifier.$sentential_operators_caching_state$ = null;
        $sym0$POSSIBLY_REPLACEABLE_TERM_P = SubLObjectFactory.makeSymbol("POSSIBLY-REPLACEABLE-TERM-P");
        $kw1$ALL = SubLObjectFactory.makeKeyword("ALL");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ABBREVS"), (SubLObject)SubLObjectFactory.makeKeyword("ACRONYMS"));
        $kw3$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("the"));
        $sym5$MAPPED_EXPRESSION_SUBSUMES_ = SubLObjectFactory.makeSymbol("MAPPED-EXPRESSION-SUBSUMES?");
        $sym6$PARSE_TREE_STRING = SubLObjectFactory.makeSymbol("PARSE-TREE-STRING");
        $list7 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-GLOSS"));
        $str8$_b = SubLObjectFactory.makeString("\\b");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASELESS"));
        $str10$No_string_positions_for_ = SubLObjectFactory.makeString("No string positions for ");
        $str11$_in_ = SubLObjectFactory.makeString(" in ");
        $str12$No_term_positions_for_ = SubLObjectFactory.makeString("No term positions for ");
        $str13$Non_singleton_string_positions_fo = SubLObjectFactory.makeString("Non-singleton string positions for ");
        $str14$Non_singleton_term_positions_for_ = SubLObjectFactory.makeString("Non-singleton term positions for ");
        $kw15$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $sym16$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym17$CDR = SubLObjectFactory.makeSymbol("CDR");
        $str18$Couldn_t_find_strings_for_any_ter = SubLObjectFactory.makeString("Couldn't find strings for any terms in");
        $str19$_ = SubLObjectFactory.makeString(" ");
        $str20$_ = SubLObjectFactory.makeString("?");
        $str21$_ = SubLObjectFactory.makeString(".");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("TERM-GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $str23$_ = SubLObjectFactory.makeString("-");
        $const24$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $sym25$GET_HEAD_DAUGHTERS = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTERS");
        $sym26$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw27$VBP = SubLObjectFactory.makeKeyword("VBP");
        $const28$nonThirdSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonThirdSg-Present"));
        $kw29$VBZ = SubLObjectFactory.makeKeyword("VBZ");
        $const30$thirdPersonSg_Present = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"));
        $kw31$NN = SubLObjectFactory.makeKeyword("NN");
        $const32$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $kw33$NNS = SubLObjectFactory.makeKeyword("NNS");
        $const34$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $sym35$_ = SubLObjectFactory.makeSymbol("<");
        $sym36$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $kw37$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $const38$genTemplate_QuerySentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-QuerySentence"));
        $str39$__a_z0_9__ = SubLObjectFactory.makeString("[^a-z0-9-]");
        $str40$__a_z0_9_ = SubLObjectFactory.makeString("[^a-z0-9]");
        $str41$_ = SubLObjectFactory.makeString("^");
        $str42$_ = SubLObjectFactory.makeString("$");
        $str43$_ = SubLObjectFactory.makeString("|");
        $const44$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym45$UNIT_OF_MONEY_P = SubLObjectFactory.makeSymbol("UNIT-OF-MONEY-P");
        $const46$UnitOfMoney = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnitOfMoney"));
        $sym47$_UNIT_OF_MONEY_P_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*UNIT-OF-MONEY-P-CACHING-STATE*");
        $int48$500 = SubLObjectFactory.makeInteger(500);
        $const49$Time_Quantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Time-Quantity"));
        $sym50$SENTENTIAL_OPERATORS = SubLObjectFactory.makeSymbol("SENTENTIAL-OPERATORS");
        $const51$SententialOperator = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SententialOperator"));
        $sym52$_SENTENTIAL_OPERATORS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SENTENTIAL-OPERATORS-CACHING-STATE*");
        $sym53$CLEAR_SENTENTIAL_OPERATORS = SubLObjectFactory.makeSymbol("CLEAR-SENTENTIAL-OPERATORS");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-SPECIFICATION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FOLDER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST-SPECIFICATION-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-FOLDER"));
        $kw56$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw57$TEST_SPECIFICATION_TYPE = SubLObjectFactory.makeKeyword("TEST-SPECIFICATION-TYPE");
        $kw58$TEMPLATE_FOLDER = SubLObjectFactory.makeKeyword("TEMPLATE-FOLDER");
        $sym59$FTG_GAF = SubLObjectFactory.makeUninternedSymbol("FTG-GAF");
        $sym60$QUERY_SPEC = SubLObjectFactory.makeUninternedSymbol("QUERY-SPEC");
        $sym61$WITH_ALL_MTS = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $sym62$DO_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("DO-PREDICATE-EXTENT-INDEX");
        $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss")), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $sym64$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym65$GAF_ARGS = SubLObjectFactory.makeSymbol("GAF-ARGS");
        $sym66$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym67$PRED_VALUES = SubLObjectFactory.makeSymbol("PRED-VALUES");
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate")), (SubLObject)query_sentence_lexifier.ONE_INTEGER, (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $sym69$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym70$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym71$FIMPLIES = SubLObjectFactory.makeSymbol("FIMPLIES");
        $sym72$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym73$NAT_FUNCTOR = SubLObjectFactory.makeSymbol("NAT-FUNCTOR");
        $list74 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestQueryFn")));
        $sym75$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $sym76$NAT_ARG1 = SubLObjectFactory.makeSymbol("NAT-ARG1");
        $sym77$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $sym78$PRED_VALUES_IN_ANY_MT = SubLObjectFactory.makeSymbol("PRED-VALUES-IN-ANY-MT");
        $list79 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderContainsResource")), (SubLObject)query_sentence_lexifier.TWO_INTEGER, (SubLObject)query_sentence_lexifier.ONE_INTEGER);
        $sym80$KBQ_SENTENCES = SubLObjectFactory.makeSymbol("KBQ-SENTENCES");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-SPECIFICATION-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE-FOLDER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym82$DO_REIFIED_QUERY_SPEC_SENTENCES = SubLObjectFactory.makeSymbol("DO-REIFIED-QUERY-SPEC-SENTENCES");
        $sym83$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym84$GTQS_FIND_TERM_GLOSSES = SubLObjectFactory.makeSymbol("GTQS-FIND-TERM-GLOSSES");
        $const85$TKBTestQuery = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBTestQuery"));
        $const86$TKB_RedTeamQueryFolder = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKB-RedTeamQueryFolder"));
        $str87$In_Mt__EnglishParaphraseMt_ = SubLObjectFactory.makeString("In Mt: EnglishParaphraseMt.");
        $sym88$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const89$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const90$formulaTemplateGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateGloss"));
        $kw91$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw92$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"));
        $const94$TestQueryFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestQueryFn"));
        $const95$folderContainsResource = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("folderContainsResource"));
        $str96$__f___S_____ = SubLObjectFactory.makeString("~&f: ~S.~%~%");
        $const97$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("querySpecificationForFormulaTemplate"));
        $str98$___Template___S__ = SubLObjectFactory.makeString("~% Template: ~S~%");
        $str99$___S___Gloss___S__ = SubLObjectFactory.makeString("~%~S~% Gloss: ~S~%");
        $kw100$HTML = SubLObjectFactory.makeKeyword("HTML");
        $str101$_Old___S__ = SubLObjectFactory.makeString(" Old: ~S~%");
        $sym102$GTQS_ASSERTION_P = SubLObjectFactory.makeSymbol("GTQS-ASSERTION-P");
        $str103$___New___S__ = SubLObjectFactory.makeString("~% New: ~S~%");
        $const104$genTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate"));
        $str105$ARG = SubLObjectFactory.makeString("ARG");
        $const106$genTemplate_Constrained = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genTemplate-Constrained"));
        $const107$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw108$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $const109$InstanceTypeTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceTypeTernaryRuleMacroPredicate"));
        $const110$TypeInstanceTernaryRuleMacroPredi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeInstanceTernaryRuleMacroPredicate"));
        $const111$TypeTypeTernaryRuleMacroPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TypeTypeTernaryRuleMacroPredicate"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeString(","));
        $const113$Pronoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pronoun"));
        $const114$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $str115$cdolist = SubLObjectFactory.makeString("cdolist");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"));
        $kw117$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym118$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str119$Total_attempts___S_in__S_seconds_ = SubLObjectFactory.makeString("Total attempts: ~S in ~S seconds~%");
        $str120$Successful_attempts___S__ = SubLObjectFactory.makeString("Successful attempts: ~S~%");
        $str121$__successful___S__ = SubLObjectFactory.makeString("% successful: ~S~%");
        $int122$100 = SubLObjectFactory.makeInteger(100);
        $str123$Average_time_per_attempt___S__ = SubLObjectFactory.makeString("Average time per attempt: ~S~%");
        $str124$__Successful_GTQS_Constructions__ = SubLObjectFactory.makeString("**Successful GTQS Constructions** ~%");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GTQS"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("GLOSS"));
        $str126$CycL___S__Gloss___S__GTQS___S____ = SubLObjectFactory.makeString("CycL: ~S~%Gloss: ~S~%GTQS: ~S~%~%~%");
        $str127$__________Unsuccessful_GTQS_Const = SubLObjectFactory.makeString("~%~%~%~%**Unsuccessful GTQS Constructions** ~%");
    }
    
    public static final class $clear_sentential_operators$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_sentential_operators$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-SENTENTIAL-OPERATORS"));
        }
        
        @Override
		public SubLObject processItem() {
            return query_sentence_lexifier.clear_sentential_operators();
        }
    }
}

/*

	Total time: 817 ms
	
*/