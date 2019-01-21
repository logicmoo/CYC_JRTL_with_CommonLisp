package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class relation_lexifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.relation_lexifier";
    public static final String myFingerPrint = "6639b037e08a92f3f98ee6f7fcbe0c6156cd6e849cb336b1d19feccef6271298";
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 971L)
    private static SubLSymbol $pos_template_mappings$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16718L)
    private static SubLSymbol $generalize_speech_part_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 26709L)
    private static SubLSymbol $qsl_keywords_used$;
    private static final SubLSymbol $sym0$_POS_TEMPLATE_MAPPINGS_;
    private static final SubLString $str1$__;
    private static final SubLString $str2$_;
    private static final SubLString $str3$__;
    private static final SubLString $str4$_a;
    private static final SubLString $str5$_;
    private static final SubLSymbol $sym6$INTEGERP;
    private static final SubLSymbol $sym7$PPH_DETERMINER_;
    private static final SubLSymbol $sym8$SPEECH_PART_PRED_;
    private static final SubLSymbol $sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_;
    private static final SubLString $str10$Can_t_handle__S_in__S;
    private static final SubLString $str11$_S_references_arg_S____which_is_g;
    private static final SubLString $str12$Multiple_slots_for_arg_S_in____S;
    private static final SubLString $str13$Failed_to_exhaust_arg_order_list_;
    private static final SubLString $str14$Couldn_t_find_twiddle_for_ARG_S_i;
    private static final SubLString $str15$_S_must_be_the_same_length_as__S;
    private static final SubLSymbol $sym16$SPEECH_PART_;
    private static final SubLSymbol $sym17$LISTP;
    private static final SubLSymbol $sym18$KEYWORDP;
    private static final SubLList $list19;
    private static final SubLObject $const20$NounPhrase;
    private static final SubLSymbol $sym21$_;
    private static final SubLSymbol $sym22$REL_PHRASE_START;
    private static final SubLSymbol $kw23$NOT_YET;
    private static final SubLSymbol $kw24$CAT;
    private static final SubLObject $const25$headsPhraseOfType;
    private static final SubLList $list26;
    private static final SubLObject $const27$GeneralLexiconMt;
    private static final SubLObject $const28$PhraseFn;
    private static final SubLList $list29;
    private static final SubLObject $const30$Indefinite_NLAttr;
    private static final SubLObject $const31$Definite_NLAttr;
    private static final SubLObject $const32$Determiner;
    private static final SubLSymbol $kw33$A_THE_WORD;
    private static final SubLSymbol $kw34$SOME;
    private static final SubLSymbol $kw35$THE_THE_WORD;
    private static final SubLString $str36$Can_t_determine_definiteness_of__;
    private static final SubLSymbol $sym37$CLOSE_QUOTE_STRING_P;
    private static final SubLSymbol $sym38$PPH_PHRASE_STRING;
    private static final SubLSymbol $sym39$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw40$POS_PRED;
    private static final SubLObject $const41$nounStrings;
    private static final SubLObject $const42$tensed;
    private static final SubLSymbol $kw43$SUBJECT_VERB;
    private static final SubLObject $const44$Verb;
    private static final SubLString $str45$guess_more_info_not_doing_anythin;
    private static final SubLObject $const46$pastTense_Generic;
    private static final SubLObject $const47$presentTense_Generic;
    private static final SubLSymbol $sym48$GENERALIZE_SPEECH_PART_PRED;
    private static final SubLSymbol $sym49$_GENERALIZE_SPEECH_PART_PRED_CACHING_STATE_;
    private static final SubLObject $const50$genlPreds;
    private static final SubLSymbol $kw51$BREADTH;
    private static final SubLSymbol $kw52$DEPTH;
    private static final SubLSymbol $kw53$STACK;
    private static final SubLSymbol $kw54$QUEUE;
    private static final SubLObject $const55$BaseKB;
    private static final SubLObject $const56$True_JustificationTruth;
    private static final SubLSymbol $sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw58$ERROR;
    private static final SubLString $str59$_A_is_not_a__A;
    private static final SubLSymbol $sym60$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw61$CERROR;
    private static final SubLString $str62$continue_anyway;
    private static final SubLSymbol $kw63$WARN;
    private static final SubLString $str64$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str65$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str66$attempting_to_bind_direction_link;
    private static final SubLString $str67$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const68$gerund;
    private static final SubLObject $const69$agentiveNounStrings;
    private static final SubLObject $const70$GenericSpeechPartPredicate;
    private static final SubLSymbol $sym71$SPEC_PRED_;
    private static final SubLSymbol $kw72$ANY;
    private static final SubLSymbol $sym73$GENERIC_ARG_;
    private static final SubLSymbol $sym74$_;
    private static final SubLSymbol $sym75$GENERIC_ARG_NUM;
    private static final SubLObject $const76$NLPattern_Template;
    private static final SubLObject $const77$NPTemplate;
    private static final SubLObject $const78$NLPattern_Word;
    private static final SubLObject $const79$NLPattern_Exact;
    private static final SubLObject $const80$NLPatternList;
    private static final SubLSymbol $kw81$NL_PREDS;
    private static final SubLString $str82$unusable_phrase_sent_to_PPH_PHRAS;
    private static final SubLObject $const83$Function_Denotational;
    private static final SubLObject $const84$termTemplate_Reln;
    private static final SubLObject $const85$assertTemplate_Reln;
    private static final SubLSymbol $sym86$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const87$EverythingPSC;
    private static final SubLObject $const88$STemplate;
    private static final SubLString $str89$Sent_non_relation__S_to_DETERMINE;
    private static final SubLSymbol $kw90$INTERROGATIVE;
    private static final SubLObject $const91$queryTemplate;
    private static final SubLObject $const92$assertTemplate;
    private static final SubLObject $const93$QuestionTemplate;
    private static final SubLSymbol $kw94$PPH_UNKNOWN_CYCL;
    private static final SubLObject $const95$NBarTemplate;
    private static final SubLObject $const96$NumberTemplate;
    private static final SubLString $str97$_;
    private static final SubLObject $const98$posForTemplateCategory;
    private static final SubLObject $const99$TemplateParsingMt;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 1172L)
    public static SubLObject gen_format_assertion_to_gen_template(final SubLObject as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject format_string = pph_methods_formulas.get_genformat_string_and_list(as);
        SubLObject arg_order_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        format_string = string_utilities.replace_substring(string_utilities.replace_substring(format_string, (SubLObject)relation_lexifier.$str1$__, (SubLObject)relation_lexifier.$str2$_), (SubLObject)relation_lexifier.$str3$__, (SubLObject)relation_lexifier.$str2$_);
        final SubLObject reln = assertions_high.gaf_arg1(as);
        final SubLObject v_arity = arity.min_arity(reln);
        final SubLObject twiddle_string = (SubLObject)relation_lexifier.$str4$_a;
        final SubLObject break_list = (SubLObject)ConsesLow.list(twiddle_string, Strings.string_upcase(twiddle_string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.$str2$_, (SubLObject)relation_lexifier.$str5$_);
        final SubLObject tokenized_original = massage_lexification_tokenization(string_utilities.string_tokenize(format_string, break_list, (SubLObject)relation_lexifier.NIL, (SubLObject)relation_lexifier.T, (SubLObject)relation_lexifier.T, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED));
        final SubLObject arg_location_table = dictionary.new_dictionary((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        SubLObject arg_location_list = (SubLObject)relation_lexifier.NIL;
        final SubLObject arg_speech_part_table = dictionary.new_dictionary((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        SubLObject arg_speech_part_preds = (SubLObject)relation_lexifier.NIL;
        final SubLObject arg_determiner_table = dictionary.new_dictionary((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        SubLObject arg_determiners = (SubLObject)relation_lexifier.NIL;
        arg_order_list = pph_methods_formulas.regularize_genformat_arglist(arg_order_list, v_arity);
        SubLObject list_var = (SubLObject)relation_lexifier.NIL;
        SubLObject token = (SubLObject)relation_lexifier.NIL;
        SubLObject start = (SubLObject)relation_lexifier.NIL;
        list_var = tokenized_original;
        token = list_var.first();
        for (start = (SubLObject)relation_lexifier.ZERO_INTEGER; relation_lexifier.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), start = Numbers.add((SubLObject)relation_lexifier.ONE_INTEGER, start)) {
            if (token.equalp(twiddle_string)) {
                final SubLObject arg_order_sublist;
                final SubLObject keyword_arg_order_sublist = arg_order_sublist = arg_order_list.first();
                final SubLObject argnum = Sequences.find_if(Symbols.symbol_function((SubLObject)relation_lexifier.$sym6$INTEGERP), arg_order_sublist, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                final SubLObject determiner = Sequences.find_if((SubLObject)relation_lexifier.$sym7$PPH_DETERMINER_, keyword_arg_order_sublist, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                final SubLObject agr_preds = generalize_speech_part_preds(list_utilities.find_all_if((SubLObject)relation_lexifier.$sym8$SPEECH_PART_PRED_, arg_order_sublist, (SubLObject)relation_lexifier.UNPROVIDED));
                if (relation_lexifier.NIL != list_utilities.find_if_not((SubLObject)relation_lexifier.$sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    Errors.warn((SubLObject)relation_lexifier.$str10$Can_t_handle__S_in__S, list_utilities.find_if_not((SubLObject)relation_lexifier.$sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_, keyword_arg_order_sublist, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED), keyword_arg_order_sublist);
                    return (SubLObject)relation_lexifier.NIL;
                }
                if (argnum.isInteger() && argnum.numG(v_arity)) {
                    Errors.warn((SubLObject)relation_lexifier.$str11$_S_references_arg_S____which_is_g, as, argnum, reln);
                    return (SubLObject)relation_lexifier.NIL;
                }
                if (relation_lexifier.NIL != dictionary.dictionary_lookup(arg_location_table, argnum, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    Errors.warn((SubLObject)relation_lexifier.$str12$Multiple_slots_for_arg_S_in____S, argnum, as);
                    return (SubLObject)relation_lexifier.NIL;
                }
                dictionary.dictionary_enter(arg_location_table, argnum, start);
                dictionary.dictionary_enter(arg_speech_part_table, argnum, agr_preds);
                dictionary.dictionary_enter(arg_determiner_table, argnum, determiner);
                arg_order_list = arg_order_list.rest();
            }
        }
        if (relation_lexifier.NIL != arg_order_list) {
            Errors.warn((SubLObject)relation_lexifier.$str13$Failed_to_exhaust_arg_order_list_, as, arg_order_list);
            return (SubLObject)relation_lexifier.NIL;
        }
        SubLObject end_var;
        SubLObject argnum2;
        SubLObject agr_preds2;
        SubLObject determiner2;
        for (end_var = (SubLObject)relation_lexifier.ZERO_INTEGER, argnum2 = (SubLObject)relation_lexifier.NIL, argnum2 = v_arity; !argnum2.numLE(end_var); argnum2 = Numbers.add(argnum2, (SubLObject)relation_lexifier.MINUS_ONE_INTEGER)) {
            start = dictionary.dictionary_lookup(arg_location_table, argnum2, (SubLObject)relation_lexifier.UNPROVIDED);
            agr_preds2 = dictionary.dictionary_lookup(arg_speech_part_table, argnum2, (SubLObject)relation_lexifier.UNPROVIDED);
            determiner2 = dictionary.dictionary_lookup(arg_determiner_table, argnum2, (SubLObject)relation_lexifier.UNPROVIDED);
            if (!start.isInteger()) {
                Errors.warn((SubLObject)relation_lexifier.$str14$Couldn_t_find_twiddle_for_ARG_S_i, argnum2, format_string);
                return (SubLObject)relation_lexifier.NIL;
            }
            arg_location_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(start, number_utilities.f_1X(start)), arg_location_list);
            arg_speech_part_preds = (SubLObject)ConsesLow.cons(agr_preds2, arg_speech_part_preds);
            arg_determiners = (SubLObject)ConsesLow.cons(determiner2, arg_determiners);
        }
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)relation_lexifier.ONE_INTEGER), lexify_relation(reln, arg_location_list, tokenized_original, (SubLObject)relation_lexifier.NIL, arg_speech_part_preds, arg_determiners));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 4157L)
    public static SubLObject handlable_arg_order_sublist_elementP(final SubLObject element) {
        if (element.isInteger()) {
            return (SubLObject)relation_lexifier.T;
        }
        if (element.isKeyword() && relation_lexifier.NIL != pph_utilities.pph_determinerP(element)) {
            return (SubLObject)relation_lexifier.T;
        }
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 4357L)
    public static SubLObject massage_lexification_tokenization(final SubLObject strings) {
        SubLObject new_strings = (SubLObject)relation_lexifier.NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject string = (SubLObject)relation_lexifier.NIL;
        string = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            final SubLObject new_string = string_utilities.trim_whitespace(string);
            final SubLObject pos = Sequences.position((SubLObject)Characters.CHAR_space, new_string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
            if (relation_lexifier.NIL != pos) {
                new_strings = (SubLObject)ConsesLow.cons(string_utilities.substring(new_string, (SubLObject)relation_lexifier.ZERO_INTEGER, pos), new_strings);
                new_strings = (SubLObject)ConsesLow.cons(string_utilities.substring(new_string, number_utilities.f_1X(pos), (SubLObject)relation_lexifier.UNPROVIDED), new_strings);
            }
            else {
                new_strings = (SubLObject)ConsesLow.cons(new_string, new_strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return Sequences.nreverse(new_strings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 4767L)
    public static SubLObject lexify_relation(final SubLObject rel, final SubLObject arg_location_list, final SubLObject tokenized_original, SubLObject arg_speech_parts, SubLObject arg_speech_part_preds, SubLObject arg_determiners) {
        if (arg_speech_parts == relation_lexifier.UNPROVIDED) {
            arg_speech_parts = (SubLObject)relation_lexifier.NIL;
        }
        if (arg_speech_part_preds == relation_lexifier.UNPROVIDED) {
            arg_speech_part_preds = (SubLObject)relation_lexifier.NIL;
        }
        if (arg_determiners == relation_lexifier.UNPROVIDED) {
            arg_determiners = (SubLObject)relation_lexifier.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (relation_lexifier.NIL != arg_speech_parts) {
            if (relation_lexifier.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && relation_lexifier.NIL == list_utilities.same_length_p(arg_speech_parts, arg_location_list)) {
                Errors.error((SubLObject)relation_lexifier.$str15$_S_must_be_the_same_length_as__S, arg_speech_parts, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_speech_parts;
            SubLObject speech_part = (SubLObject)relation_lexifier.NIL;
            speech_part = cdolist_list_var.first();
            while (relation_lexifier.NIL != cdolist_list_var) {
                if (relation_lexifier.NIL != speech_part && !relation_lexifier.assertionsDisabledInClass && relation_lexifier.NIL == lexicon_accessors.speech_partP(speech_part, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    throw new AssertionError(speech_part);
                }
                cdolist_list_var = cdolist_list_var.rest();
                speech_part = cdolist_list_var.first();
            }
        }
        if (relation_lexifier.NIL != arg_speech_part_preds) {
            if (relation_lexifier.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && relation_lexifier.NIL == list_utilities.same_length_p(arg_speech_part_preds, arg_location_list)) {
                Errors.error((SubLObject)relation_lexifier.$str15$_S_must_be_the_same_length_as__S, arg_speech_part_preds, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_speech_part_preds;
            SubLObject speech_part_pred = (SubLObject)relation_lexifier.NIL;
            speech_part_pred = cdolist_list_var.first();
            while (relation_lexifier.NIL != cdolist_list_var) {
                if (relation_lexifier.NIL != speech_part_pred && !relation_lexifier.assertionsDisabledInClass && relation_lexifier.NIL == Types.listp(speech_part_pred)) {
                    throw new AssertionError(speech_part_pred);
                }
                cdolist_list_var = cdolist_list_var.rest();
                speech_part_pred = cdolist_list_var.first();
            }
        }
        if (relation_lexifier.NIL != arg_determiners) {
            if (relation_lexifier.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && relation_lexifier.NIL == list_utilities.same_length_p(arg_determiners, arg_location_list)) {
                Errors.error((SubLObject)relation_lexifier.$str15$_S_must_be_the_same_length_as__S, arg_determiners, arg_location_list);
            }
            SubLObject cdolist_list_var = arg_determiners;
            SubLObject determiner = (SubLObject)relation_lexifier.NIL;
            determiner = cdolist_list_var.first();
            while (relation_lexifier.NIL != cdolist_list_var) {
                if (relation_lexifier.NIL != determiner && !relation_lexifier.assertionsDisabledInClass && relation_lexifier.NIL == Types.keywordp(determiner)) {
                    throw new AssertionError(determiner);
                }
                cdolist_list_var = cdolist_list_var.rest();
                determiner = cdolist_list_var.first();
            }
        }
        final SubLObject parsetemplate = (SubLObject)relation_lexifier.NIL;
        SubLObject gentemplate_phrase = (SubLObject)relation_lexifier.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)relation_lexifier.T, thread);
            try {
                SubLObject result = (SubLObject)relation_lexifier.NIL;
                SubLObject pph_phrases = (SubLObject)relation_lexifier.NIL;
                SubLObject rel_phrases = (SubLObject)relation_lexifier.NIL;
                SubLObject list_var = (SubLObject)relation_lexifier.NIL;
                SubLObject arg_location = (SubLObject)relation_lexifier.NIL;
                SubLObject i = (SubLObject)relation_lexifier.NIL;
                list_var = arg_location_list;
                arg_location = list_var.first();
                for (i = (SubLObject)relation_lexifier.ZERO_INTEGER; relation_lexifier.NIL != list_var; list_var = list_var.rest(), arg_location = list_var.first(), i = Numbers.add((SubLObject)relation_lexifier.ONE_INTEGER, i)) {
                    SubLObject current;
                    final SubLObject datum = current = arg_location;
                    SubLObject start = (SubLObject)relation_lexifier.NIL;
                    SubLObject end = (SubLObject)relation_lexifier.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)relation_lexifier.$list19);
                    start = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)relation_lexifier.$list19);
                    end = current.first();
                    current = current.rest();
                    if (relation_lexifier.NIL == current) {
                        final SubLObject principled_cat = phrasal_cat_for_pos(arg_speech_parts.first());
                        final SubLObject agr_preds = arg_speech_part_preds.first();
                        final SubLObject determiner2 = arg_determiners.first();
                        final SubLObject cat = (relation_lexifier.NIL != principled_cat) ? principled_cat : relation_lexifier.$const20$NounPhrase;
                        final SubLObject argnum = number_utilities.f_1X(i);
                        final SubLObject cycl = at_utilities.get_generic_arg(argnum);
                        final SubLObject phrase_string = string_utilities.bunge(Sequences.subseq(tokenized_original, start, end), (SubLObject)relation_lexifier.UNPROVIDED);
                        final SubLObject v_pph_phrase = lexifier_pph_phrase(phrase_string, cycl, cat, agr_preds, determiner2);
                        rel_phrases = (SubLObject)ConsesLow.cons(new_rel_phrase(start, end, v_pph_phrase, tokenized_original), rel_phrases);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)relation_lexifier.$list19);
                    }
                    arg_speech_parts = arg_speech_parts.rest();
                    arg_speech_part_preds = arg_speech_part_preds.rest();
                    arg_determiners = arg_determiners.rest();
                }
                rel_phrases = Sort.sort(rel_phrases, (SubLObject)relation_lexifier.$sym21$_, (SubLObject)relation_lexifier.$sym22$REL_PHRASE_START);
                SubLObject start_of_last = Sequences.length(tokenized_original);
                SubLObject cdolist_list_var2 = rel_phrases;
                SubLObject rel_phrase = (SubLObject)relation_lexifier.NIL;
                rel_phrase = cdolist_list_var2.first();
                while (relation_lexifier.NIL != cdolist_list_var2) {
                    if (!start_of_last.numE(rel_phrase_end(rel_phrase))) {
                        pph_phrases = push_phrase(tokenized_original, rel_phrase_end(rel_phrase), start_of_last, pph_phrases);
                    }
                    pph_phrases = (SubLObject)ConsesLow.cons(rel_phrase_pph_phrase(rel_phrase), pph_phrases);
                    start_of_last = rel_phrase_start(rel_phrase);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    rel_phrase = cdolist_list_var2.first();
                }
                if (!start_of_last.numE((SubLObject)relation_lexifier.ZERO_INTEGER)) {
                    pph_phrases = push_phrase(tokenized_original, (SubLObject)relation_lexifier.ZERO_INTEGER, start_of_last, pph_phrases);
                }
                final SubLObject mother_phrase = pph_data_structures.new_pph_phrase((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                pph_phrase.set_pph_phrase_dtrs_from_list(mother_phrase, pph_phrases, (SubLObject)relation_lexifier.UNPROVIDED);
                result = mother_phrase;
                rel_lex_guess_more_info(result);
                rel_lex_revert_generic_arg_phrases(result);
                rel_lex_merge_strings(result);
                gentemplate_phrase = pph_templates.gentemplate_phrase_from_pph_phrase(rel, result);
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)relation_lexifier.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
        return Values.values(parsetemplate, gentemplate_phrase, (SubLObject)relation_lexifier.$kw23$NOT_YET);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 9131L)
    public static SubLObject phrasal_cat_for_pos(final SubLObject pos) {
        final SubLObject cat = ask_utilities.ask_variable((SubLObject)relation_lexifier.$kw24$CAT, (SubLObject)ConsesLow.listS(relation_lexifier.$const25$headsPhraseOfType, pos, (SubLObject)relation_lexifier.$list26), relation_lexifier.$const27$GeneralLexiconMt, (SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED).first();
        return (SubLObject)((relation_lexifier.NIL != cat) ? reformulator_hub.reformulate_cycl((SubLObject)ConsesLow.list(relation_lexifier.$const28$PhraseFn, cat), relation_lexifier.$const27$GeneralLexiconMt, (SubLObject)relation_lexifier.UNPROVIDED) : relation_lexifier.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 9353L)
    public static SubLObject lexifier_pph_phrase(final SubLObject phrase_string, final SubLObject cycl, SubLObject cat, SubLObject agr_preds, SubLObject determiner) {
        if (agr_preds == relation_lexifier.UNPROVIDED) {
            agr_preds = (SubLObject)relation_lexifier.NIL;
        }
        if (determiner == relation_lexifier.UNPROVIDED) {
            determiner = (SubLObject)relation_lexifier.NIL;
        }
        if (relation_lexifier.NIL != determiner) {
            cat = relation_lexifier.$const20$NounPhrase;
        }
        final SubLObject v_pph_phrase = (relation_lexifier.NIL != determiner) ? lexifier_np(phrase_string, cycl, agr_preds, determiner) : pph_data_structures.new_pph_phrase(phrase_string, cycl, (SubLObject)relation_lexifier.UNPROVIDED);
        pph_phrase.pph_phrase_set_category(v_pph_phrase, cat, (SubLObject)relation_lexifier.UNPROVIDED);
        if (relation_lexifier.NIL != agr_preds) {
            pph_phrase.pph_phrase_set_agr_preds(v_pph_phrase, agr_preds, (SubLObject)relation_lexifier.UNPROVIDED);
        }
        else {
            pph_phrase.pph_phrase_set_absolute_agr_from_phrase(v_pph_phrase);
        }
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 9928L)
    public static SubLObject lexifier_np(final SubLObject phrase_string, final SubLObject cycl, final SubLObject agr_preds, final SubLObject determiner) {
        final SubLObject nbar_dtr = lexifier_pph_phrase(phrase_string, cycl, (SubLObject)relation_lexifier.$list29, agr_preds, (SubLObject)relation_lexifier.NIL);
        final SubLObject det_dtr = lexifier_det_phrase(determiner);
        final SubLObject np_phrase = pph_data_structures.new_pph_phrase((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        pph_phrase.pph_phrase_set_category_to_np(np_phrase);
        pph_phrase.pph_phrase_set_head_dtr_num(np_phrase, (SubLObject)relation_lexifier.ONE_INTEGER);
        pph_phrase.set_pph_phrase_dtrs_from_list(np_phrase, (SubLObject)ConsesLow.list(det_dtr, nbar_dtr), (SubLObject)relation_lexifier.UNPROVIDED);
        return np_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 10367L)
    public static SubLObject lexifier_det_phrase(final SubLObject determiner) {
        final SubLObject determiner_attribute = (relation_lexifier.NIL != lexifier_indefinite_determiner_p(determiner)) ? relation_lexifier.$const30$Indefinite_NLAttr : relation_lexifier.$const31$Definite_NLAttr;
        return lexifier_pph_phrase((SubLObject)relation_lexifier.NIL, determiner_attribute, relation_lexifier.$const32$Determiner, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 10628L)
    public static SubLObject lexifier_indefinite_determiner_p(final SubLObject determiner) {
        if (determiner.eql((SubLObject)relation_lexifier.$kw33$A_THE_WORD) || determiner.eql((SubLObject)relation_lexifier.$kw34$SOME)) {
            return (SubLObject)relation_lexifier.T;
        }
        if (determiner.eql((SubLObject)relation_lexifier.$kw35$THE_THE_WORD)) {
            return (SubLObject)relation_lexifier.NIL;
        }
        Errors.sublisp_break((SubLObject)relation_lexifier.$str36$Can_t_determine_definiteness_of__, new SubLObject[] { determiner });
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 10864L)
    public static SubLObject push_phrase(final SubLObject original, final SubLObject start, final SubLObject end, final SubLObject existing_phrases) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = existing_phrases;
        SubLObject close_quote_phrase = Sequences.find_if((SubLObject)relation_lexifier.$sym37$CLOSE_QUOTE_STRING_P, result, (SubLObject)relation_lexifier.$sym38$PPH_PHRASE_STRING, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        final SubLObject word_strings = Sequences.subseq(original, start, end);
        SubLObject cdolist_list_var = Sequences.nreverse(word_strings);
        SubLObject word_string = (SubLObject)relation_lexifier.NIL;
        word_string = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            if (relation_lexifier.NIL == string_utilities.empty_string_p(word_string)) {
                if (relation_lexifier.NIL != open_quote_string_p(word_string) && relation_lexifier.NIL != close_quote_phrase) {
                    final SubLObject close_quote_position = Sequences.position(close_quote_phrase, result, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject phrases_to_quote = list_utilities.split_list(result, close_quote_position);
                    final SubLObject rest = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject phrase_to_quote = (relation_lexifier.NIL != list_utilities.singletonP(phrases_to_quote)) ? phrases_to_quote.first() : pph_phrase.new_pph_phrase_with_dtr_list(phrases_to_quote);
                    final SubLObject quoted_phrase = pph_phrase.quote_pph_phrase(phrase_to_quote);
                    result = (SubLObject)ConsesLow.cons(quoted_phrase, Sequences.remove(close_quote_phrase, rest, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED));
                    close_quote_phrase = Sequences.find_if((SubLObject)relation_lexifier.$sym37$CLOSE_QUOTE_STRING_P, result, (SubLObject)relation_lexifier.$sym38$PPH_PHRASE_STRING, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                }
                else if (relation_lexifier.NIL != close_quote_string_p(word_string)) {
                    close_quote_phrase = pph_data_structures.new_pph_phrase(word_string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                    result = (SubLObject)ConsesLow.cons(close_quote_phrase, result);
                }
                else {
                    result = (SubLObject)ConsesLow.cons(pph_data_structures.new_pph_phrase(word_string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word_string = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 12514L)
    public static SubLObject open_quote_string_p(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && relation_lexifier.NIL != list_utilities.lengthE(string, (SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.UNPROVIDED) && relation_lexifier.NIL != open_quote_p(Strings.sublisp_char(string, (SubLObject)relation_lexifier.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 12655L)
    public static SubLObject open_quote_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && (v_char.eql((SubLObject)Characters.CHAR_quote) || v_char.eql((SubLObject)Characters.CHAR_backquote)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 12811L)
    public static SubLObject close_quote_string_p(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && relation_lexifier.NIL != list_utilities.lengthE(string, (SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.UNPROVIDED) && relation_lexifier.NIL != close_quote_p(Strings.sublisp_char(string, (SubLObject)relation_lexifier.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 12954L)
    public static SubLObject close_quote_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && v_char.eql((SubLObject)Characters.CHAR_quote));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 13046L)
    public static SubLObject rel_lex_guess_more_info(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relation_lexifier.$sym39$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            SubLObject subj_dtr_num = (SubLObject)relation_lexifier.NIL;
            SubLObject found_head_verbP = (SubLObject)relation_lexifier.NIL;
            SubLObject dtr_num = (SubLObject)relation_lexifier.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                SubLObject subj_dtr_num_$2;
                SubLObject found_head_verbP_$3;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                    element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    thread.resetMultipleValues();
                    subj_dtr_num_$2 = guess_more_info_for_dtr(dtr, phrase, dtr_num, subj_dtr_num, found_head_verbP);
                    found_head_verbP_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    subj_dtr_num = subj_dtr_num_$2;
                    found_head_verbP = found_head_verbP_$3;
                    dtr_num = Numbers.add(dtr_num, (SubLObject)relation_lexifier.ONE_INTEGER);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 13667L)
    public static SubLObject guess_more_info_for_dtr(final SubLObject dtr, final SubLObject phrase, final SubLObject dtr_num, SubLObject subj_dtr_num, SubLObject found_head_verbP) {
        if (relation_lexifier.NIL != subj_dtr_num && relation_lexifier.NIL == found_head_verbP && relation_lexifier.NIL != tensed_verb_lacking_agreement_infoP(dtr)) {
            found_head_verbP = maybe_make_head_verb(dtr, phrase, subj_dtr_num);
        }
        else if (relation_lexifier.NIL != pph_phrase.pph_phrase_has_dtrsP(dtr)) {
            if (relation_lexifier.NIL == subj_dtr_num && relation_lexifier.NIL != pph_phrase.pph_phrase_npP(dtr)) {
                subj_dtr_num = dtr_num;
            }
        }
        else if (relation_lexifier.NIL != pph_phrase.pph_phrase_npP(pph_phrase_resolution.pph_wordify_sem_free_noun(dtr)) || (pph_utilities.pph_agr_constraint_type(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))) == relation_lexifier.$kw40$POS_PRED && relation_lexifier.NIL != genl_predicates.genl_predP(pph_utilities.pph_agr_constraint_target(pph_data_structures.pph_phrase_agr_absolute_constraint(pph_phrase.pph_phrase_agr(dtr))), relation_lexifier.$const41$nounStrings, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED))) {
            make_np_dtr(dtr);
            if (relation_lexifier.NIL == subj_dtr_num) {
                subj_dtr_num = dtr_num;
            }
        }
        return Values.values(subj_dtr_num, found_head_verbP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 14707L)
    public static SubLObject maybe_make_head_verb(final SubLObject dtr, final SubLObject phrase, final SubLObject subj_dtr_num) {
        final SubLObject subj_dtr = pph_phrase.pph_phrase_nth_dtr(phrase, subj_dtr_num);
        final SubLObject verb_string = pph_phrase.pph_phrase_string(dtr, (SubLObject)relation_lexifier.UNPROVIDED);
        SubLObject verb_agr_pred = (SubLObject)relation_lexifier.NIL;
        SubLObject wu = (SubLObject)relation_lexifier.NIL;
        SubLObject found_head_verbP = (SubLObject)relation_lexifier.NIL;
        if (relation_lexifier.NIL == wu) {
            SubLObject csome_list_var = lexicon_utilities.preds_of_string(verb_string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
            SubLObject verb_pred = (SubLObject)relation_lexifier.NIL;
            verb_pred = csome_list_var.first();
            while (relation_lexifier.NIL == wu && relation_lexifier.NIL != csome_list_var) {
                if (relation_lexifier.NIL != lexicon_accessors.genl_pos_predP(verb_pred, relation_lexifier.$const42$tensed, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    final SubLObject required_verb_pred = pph_phrase_resolution.verb_pred_for_subject(subj_dtr, (SubLObject)ConsesLow.list(verb_pred));
                    wu = lexicon_accessors.words_of_stringXpred(pph_phrase.pph_phrase_string(dtr, (SubLObject)relation_lexifier.UNPROVIDED), required_verb_pred, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED).first();
                    if (relation_lexifier.NIL != wu) {
                        verb_agr_pred = verb_pred;
                    }
                }
                csome_list_var = csome_list_var.rest();
                verb_pred = csome_list_var.first();
            }
        }
        if (relation_lexifier.NIL != wu) {
            pph_phrase.pph_phrase_set_agr(dtr, pph_data_structures.new_pph_phrase_agr((SubLObject)relation_lexifier.NIL, pph_utilities.new_pph_agr_constraint((SubLObject)relation_lexifier.$kw43$SUBJECT_VERB, subj_dtr)), (SubLObject)relation_lexifier.UNPROVIDED);
            pph_phrase.pph_phrase_set_wu(dtr, wu);
            pph_phrase.pph_phrase_set_category(dtr, relation_lexifier.$const44$Verb, (SubLObject)relation_lexifier.UNPROVIDED);
            if (relation_lexifier.NIL != verb_agr_pred) {
                verb_agr_pred = remove_number_agreement(verb_agr_pred);
                pph_phrase.pph_phrase_set_agr_pred(dtr, verb_agr_pred, (SubLObject)relation_lexifier.UNPROVIDED);
            }
            pph_phrase.pph_phrase_set_string(dtr, (SubLObject)relation_lexifier.NIL);
            found_head_verbP = (SubLObject)relation_lexifier.T;
        }
        return found_head_verbP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 15821L)
    public static SubLObject make_np_dtr(final SubLObject dtr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject np_parse = psp_main.best_ps_parse_for_np(pph_phrase.pph_phrase_string(dtr, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        if (relation_lexifier.NIL == np_parse) {
            attach_less_principled_information(dtr);
        }
        else if (relation_lexifier.NIL != pph_phrase_resolution.pph_phrase_starts_with_detpP(np_parse)) {
            pph_phrase.pph_phrase_set_cycl(np_parse, pph_phrase.pph_phrase_cycl(dtr, (SubLObject)relation_lexifier.UNPROVIDED));
            pph_phrase.pph_phrase_copy(np_parse, dtr, (SubLObject)relation_lexifier.UNPROVIDED);
        }
        else if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)relation_lexifier.$str45$guess_more_info_not_doing_anythin, pph_phrase.pph_phrase_string(dtr, (SubLObject)relation_lexifier.UNPROVIDED));
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16338L)
    public static SubLObject remove_number_agreement(final SubLObject verb_agr_pred) {
        if (relation_lexifier.NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, relation_lexifier.$const46$pastTense_Generic, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return relation_lexifier.$const46$pastTense_Generic;
        }
        if (relation_lexifier.NIL != lexicon_accessors.genl_pos_predP(verb_agr_pred, relation_lexifier.$const47$presentTense_Generic, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return relation_lexifier.$const47$presentTense_Generic;
        }
        return verb_agr_pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16611L)
    public static SubLObject generalize_speech_part_preds(final SubLObject preds) {
        return Mapping.mapcar((SubLObject)relation_lexifier.$sym48$GENERALIZE_SPEECH_PART_PRED, preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16718L)
    public static SubLObject clear_generalize_speech_part_pred() {
        final SubLObject cs = relation_lexifier.$generalize_speech_part_pred_caching_state$.getGlobalValue();
        if (relation_lexifier.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16718L)
    public static SubLObject remove_generalize_speech_part_pred(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args(relation_lexifier.$generalize_speech_part_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred), (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16718L)
    public static SubLObject generalize_speech_part_pred_internal(final SubLObject pred) {
        final SubLObject general_pred = (relation_lexifier.NIL != general_speech_part_predP(pred)) ? pred : generalize_speech_part_pred_int(pred, set_utilities.new_singleton_set(pred, (SubLObject)relation_lexifier.UNPROVIDED));
        return (relation_lexifier.NIL != general_pred) ? general_pred : pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16718L)
    public static SubLObject generalize_speech_part_pred(final SubLObject pred) {
        SubLObject caching_state = relation_lexifier.$generalize_speech_part_pred_caching_state$.getGlobalValue();
        if (relation_lexifier.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)relation_lexifier.$sym48$GENERALIZE_SPEECH_PART_PRED, (SubLObject)relation_lexifier.$sym49$_GENERALIZE_SPEECH_PART_PRED_CACHING_STATE_, (SubLObject)relation_lexifier.NIL, (SubLObject)relation_lexifier.EQL, (SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generalize_speech_part_pred_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)relation_lexifier.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 16977L)
    public static SubLObject generalize_speech_part_pred_int(final SubLObject pred, final SubLObject done_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject general_pred = (SubLObject)((relation_lexifier.NIL != general_speech_part_predP(pred)) ? pred : relation_lexifier.NIL);
        if (relation_lexifier.NIL == general_pred) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(relation_lexifier.$const50$genlPreds);
            final SubLObject deck_type = (SubLObject)((relation_lexifier.$kw51$BREADTH == relation_lexifier.$kw52$DEPTH) ? relation_lexifier.$kw53$STACK : relation_lexifier.$kw54$QUEUE);
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)relation_lexifier.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = relation_lexifier.$const55$BaseKB;
                    final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = relation_lexifier.$const56$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((relation_lexifier.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((relation_lexifier.NIL != tv_var) ? relation_lexifier.$sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (relation_lexifier.NIL != tv_var && relation_lexifier.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && relation_lexifier.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)relation_lexifier.$kw58$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.$str59$_A_is_not_a__A, tv_var, (SubLObject)relation_lexifier.$sym60$SBHL_TRUE_TV_P, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)relation_lexifier.$kw61$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)relation_lexifier.ONE_INTEGER, (SubLObject)relation_lexifier.$str62$continue_anyway, (SubLObject)relation_lexifier.$str59$_A_is_not_a__A, tv_var, (SubLObject)relation_lexifier.$sym60$SBHL_TRUE_TV_P, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)relation_lexifier.$kw63$WARN)) {
                                    Errors.warn((SubLObject)relation_lexifier.$str59$_A_is_not_a__A, tv_var, (SubLObject)relation_lexifier.$sym60$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)relation_lexifier.$str64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)relation_lexifier.$str62$continue_anyway, (SubLObject)relation_lexifier.$str59$_A_is_not_a__A, tv_var, (SubLObject)relation_lexifier.$sym60$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)relation_lexifier.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                                if (relation_lexifier.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || relation_lexifier.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)relation_lexifier.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)relation_lexifier.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); relation_lexifier.NIL != node_and_predicate_mode && relation_lexifier.NIL == general_pred; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$13 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$13;
                                            final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (relation_lexifier.NIL == inverseP && !genl_pred.eql(pred) && relation_lexifier.NIL == set.set_memberP(genl_pred, done_preds)) {
                                                    set.set_add(genl_pred, done_preds);
                                                    if (relation_lexifier.NIL != lexicon_accessors.speech_part_predP(genl_pred, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                        general_pred = generalize_speech_part_pred_int(genl_pred, done_preds);
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$9;
                                                SubLObject _prev_bind_1_$9;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$10;
                                                SubLObject iteration_state_$18;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$11;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$20;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$12;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)relation_lexifier.NIL, rest = accessible_modules; relation_lexifier.NIL == general_pred && relation_lexifier.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((relation_lexifier.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(relation_lexifier.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$13);
                                                        if (relation_lexifier.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED));
                                                            if (relation_lexifier.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED));
                                                                if (relation_lexifier.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); relation_lexifier.NIL == general_pred && relation_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (relation_lexifier.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); relation_lexifier.NIL == general_pred && relation_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$18); iteration_state_$18 = dictionary_contents.do_dictionary_contents_next(iteration_state_$18)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$18);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (relation_lexifier.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (relation_lexifier.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)relation_lexifier.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); relation_lexifier.NIL == general_pred && relation_lexifier.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (relation_lexifier.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && relation_lexifier.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)relation_lexifier.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (relation_lexifier.NIL == general_pred) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)relation_lexifier.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (relation_lexifier.NIL == general_pred && relation_lexifier.NIL != csome_list_var) {
                                                                                                        if (relation_lexifier.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)relation_lexifier.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)relation_lexifier.$str65$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$11, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$18);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$10, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)relation_lexifier.FIVE_INTEGER, (SubLObject)relation_lexifier.$str66$attempting_to_bind_direction_link, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (relation_lexifier.NIL != obsolete.cnat_p(node, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                            new_list = ((relation_lexifier.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED)));
                                                            for (rest_$20 = (SubLObject)relation_lexifier.NIL, rest_$20 = new_list; relation_lexifier.NIL == general_pred && relation_lexifier.NIL != rest_$20; rest_$20 = rest_$20.rest()) {
                                                                generating_fn = rest_$20.first();
                                                                _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (relation_lexifier.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)relation_lexifier.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); relation_lexifier.NIL == general_pred && relation_lexifier.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (relation_lexifier.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && relation_lexifier.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)relation_lexifier.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (relation_lexifier.NIL == general_pred) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)relation_lexifier.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (relation_lexifier.NIL == general_pred && relation_lexifier.NIL != csome_list_var2) {
                                                                                if (relation_lexifier.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)relation_lexifier.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)relation_lexifier.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)relation_lexifier.$str65$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$9, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$9, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$8, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$10, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$8, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)relation_lexifier.TWO_INTEGER, (SubLObject)relation_lexifier.$str67$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)relation_lexifier.UNPROVIDED)), (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$9, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$7, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$6, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$6, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)relation_lexifier.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return general_pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 17508L)
    public static SubLObject general_speech_part_predP(final SubLObject pred) {
        if (pred.eql(relation_lexifier.$const68$gerund)) {
            return (SubLObject)relation_lexifier.T;
        }
        if (relation_lexifier.NIL != lexicon_accessors.genl_pos_predP(pred, relation_lexifier.$const69$agentiveNounStrings, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return (SubLObject)relation_lexifier.T;
        }
        if (relation_lexifier.NIL != isa.isaP(pred, relation_lexifier.$const70$GenericSpeechPartPredicate, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return (SubLObject)relation_lexifier.T;
        }
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 17741L)
    public static SubLObject tensed_verb_lacking_agreement_infoP(final SubLObject phrase) {
        return (SubLObject)SubLObjectFactory.makeBoolean(relation_lexifier.NIL != pph_data_structures.dont_care_pph_phrase_agr_p(pph_phrase.pph_phrase_agr(phrase)) && relation_lexifier.NIL != conses_high.member(relation_lexifier.$const42$tensed, nl_trie_accessors.nl_trie_preds_of_string(pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.$sym71$SPEC_PRED_, (SubLObject)relation_lexifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 18037L)
    public static SubLObject rel_lex_revert_generic_arg_phrases(final SubLObject phrase) {
        SubLObject dtr_num = (SubLObject)relation_lexifier.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (relation_lexifier.NIL != at_utilities.generic_argP(pph_phrase.pph_phrase_cycl(dtr, (SubLObject)relation_lexifier.UNPROVIDED))) {
                    pph_phrase.pph_phrase_set_string(dtr, string_utilities.$empty_string$.getGlobalValue());
                    pph_phrase.set_pph_phrase_dtrs_from_list(dtr, (SubLObject)relation_lexifier.NIL, (SubLObject)relation_lexifier.UNPROVIDED);
                    pph_phrase.pph_phrase_set_agr_preds(dtr, (SubLObject)relation_lexifier.$kw72$ANY, (SubLObject)relation_lexifier.UNPROVIDED);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)relation_lexifier.ONE_INTEGER);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 18561L)
    public static SubLObject rel_lex_merge_strings(final SubLObject phrase) {
        SubLObject new_dtrs = (SubLObject)relation_lexifier.NIL;
        SubLObject bare_string_dtrs = (SubLObject)relation_lexifier.NIL;
        SubLObject dtr_num = (SubLObject)relation_lexifier.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                if (relation_lexifier.NIL != pph_phrase.pph_bare_string_phrase_p(dtr)) {
                    bare_string_dtrs = (SubLObject)ConsesLow.cons(dtr, bare_string_dtrs);
                }
                else {
                    new_dtrs = add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
                    bare_string_dtrs = (SubLObject)relation_lexifier.NIL;
                    new_dtrs = (SubLObject)ConsesLow.cons(dtr, new_dtrs);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)relation_lexifier.ONE_INTEGER);
            }
        }
        if (relation_lexifier.NIL != bare_string_dtrs) {
            new_dtrs = add_bare_string_dtrs(bare_string_dtrs, new_dtrs);
        }
        final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(phrase);
        pph_phrase.set_pph_phrase_dtrs_from_list(phrase, Sequences.nreverse(new_dtrs), head_dtr_num);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 19401L)
    public static SubLObject add_bare_string_dtrs(final SubLObject bare_string_dtrs, SubLObject new_dtrs) {
        if (relation_lexifier.NIL != list_utilities.singletonP(bare_string_dtrs)) {
            new_dtrs = (SubLObject)ConsesLow.cons(bare_string_dtrs.first(), new_dtrs);
        }
        else if (relation_lexifier.NIL != bare_string_dtrs) {
            final SubLObject strings = Mapping.mapcar((SubLObject)relation_lexifier.$sym38$PPH_PHRASE_STRING, bare_string_dtrs);
            final SubLObject string = pph_utilities.clean_bunge_nreverse(strings, (SubLObject)relation_lexifier.UNPROVIDED);
            final SubLObject new_bare_string_dtr = pph_data_structures.new_pph_phrase(string, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
            new_dtrs = (SubLObject)ConsesLow.cons(new_bare_string_dtr, new_dtrs);
        }
        return new_dtrs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 19832L)
    public static SubLObject build_pph_np_from_np_parse(final SubLObject np_parse, final SubLObject phrase) {
        final SubLObject dtrs = Vectors.make_vector((SubLObject)relation_lexifier.TWO_INTEGER, (SubLObject)relation_lexifier.UNPROVIDED);
        final SubLObject detp_dtr = pph_phrase.pph_phrase_nth_dtr((SubLObject)relation_lexifier.ZERO_INTEGER, np_parse);
        final SubLObject nbar_dtr = pph_phrase.pph_phrase_nth_dtr((SubLObject)relation_lexifier.ONE_INTEGER, np_parse);
        pph_phrase.pph_phrase_set_dtrs(phrase, dtrs);
        pph_phrase.pph_phrase_set_nth_dtr((SubLObject)relation_lexifier.ZERO_INTEGER, phrase, detp_dtr);
        pph_phrase.pph_phrase_set_nth_dtr((SubLObject)relation_lexifier.ONE_INTEGER, phrase, nbar_dtr);
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 20450L)
    public static SubLObject parse_template_from_pph_phrase(final SubLObject rel, final SubLObject phrase) {
        final SubLObject template_pred = determine_template_pred(rel, phrase);
        final SubLObject template_category = determine_template_category(rel, phrase);
        SubLObject template_syntax = (SubLObject)relation_lexifier.NIL;
        SubLObject template_sem = (SubLObject)relation_lexifier.NIL;
        template_syntax = pph_phrase_to_template_syntax(phrase, rel);
        template_sem = template_sem_from_template_syntax(template_syntax, rel);
        return (SubLObject)ConsesLow.list(template_pred, template_category, rel, template_syntax, template_sem);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 21146L)
    public static SubLObject template_sem_from_template_syntax(final SubLObject syntax, final SubLObject rel) {
        final SubLObject keywords = list_utilities.tree_gather(syntax, (SubLObject)relation_lexifier.$sym73$GENERIC_ARG_, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED);
        return (SubLObject)ConsesLow.cons(rel, Sort.sort(keywords, Symbols.symbol_function((SubLObject)relation_lexifier.$sym74$_), (SubLObject)relation_lexifier.$sym75$GENERIC_ARG_NUM));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 21663L)
    public static SubLObject pph_phrase_to_template_syntax(final SubLObject phrase, final SubLObject rel) {
        if (relation_lexifier.NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED))) {
            return el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, relation_lexifier.$const77$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
        }
        if (relation_lexifier.NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
            return el_utilities.make_binary_formula(relation_lexifier.$const78$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED), relation_lexifier.$const44$Verb);
        }
        if (relation_lexifier.NIL != pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return el_utilities.make_binary_formula(relation_lexifier.$const78$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED), pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
        }
        if (relation_lexifier.NIL != pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) {
            return el_utilities.make_unary_formula(relation_lexifier.$const79$NLPattern_Exact, pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
        }
        if (relation_lexifier.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
            SubLObject result = (SubLObject)relation_lexifier.NIL;
            SubLObject dtr_num = (SubLObject)relation_lexifier.ZERO_INTEGER;
            if (document.sign_constituents(phrase).isVector()) {
                final SubLObject vector_var = document.sign_constituents(phrase);
                final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject dtr;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                    element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                    dtr = Vectors.aref(vector_var, element_num);
                    result = (SubLObject)ConsesLow.cons(pph_phrase_to_template_syntax(dtr, rel), result);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)relation_lexifier.ONE_INTEGER);
                }
            }
            result = Sequences.reverse(result);
            return el_utilities.make_el_formula(relation_lexifier.$const80$NLPatternList, result, (SubLObject)relation_lexifier.UNPROVIDED);
        }
        if (pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED).isKeyword()) {
            SubLObject template_category = relation_lexifier.$const77$NPTemplate;
            if (relation_lexifier.NIL != pph_phrase.pph_phrase_agr(phrase)) {
                final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                if (pcase_var.eql((SubLObject)relation_lexifier.$kw40$POS_PRED)) {
                    template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                }
                else if (pcase_var.eql((SubLObject)relation_lexifier.$kw81$NL_PREDS)) {
                    template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                }
            }
            else if (relation_lexifier.NIL != kb_indexing_datastructures.indexed_term_p(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED))) {
                template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
            }
            return el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
        }
        Errors.warn((SubLObject)relation_lexifier.$str82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 23505L)
    public static SubLObject determine_template_pred(final SubLObject rel, final SubLObject phrase) {
        return (relation_lexifier.NIL != isa.isa_in_any_mtP(rel, relation_lexifier.$const83$Function_Denotational)) ? relation_lexifier.$const84$termTemplate_Reln : relation_lexifier.$const85$assertTemplate_Reln;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 23780L)
    public static SubLObject determine_template_category(final SubLObject rel, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)relation_lexifier.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)relation_lexifier.$sym86$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(relation_lexifier.$const87$EverythingPSC, thread);
            if (relation_lexifier.NIL != fort_types_interface.isa_functionP(rel, (SubLObject)relation_lexifier.UNPROVIDED)) {
                result = relation_lexifier.$const77$NPTemplate;
            }
            else if (relation_lexifier.NIL != fort_types_interface.predicate_p(rel)) {
                result = relation_lexifier.$const88$STemplate;
            }
            else {
                Errors.warn((SubLObject)relation_lexifier.$str89$Sent_non_relation__S_to_DETERMINE, rel);
                result = (SubLObject)relation_lexifier.NIL;
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 24355L)
    public static SubLObject qsl_parse_template_from_pph_phrase(final SubLObject base_semantics, final SubLObject phrase, final SubLObject semantics_with_keywords, final SubLObject force) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_pred = (force == relation_lexifier.$kw90$INTERROGATIVE) ? relation_lexifier.$const91$queryTemplate : relation_lexifier.$const92$assertTemplate;
        final SubLObject template_category = qsl_determine_template_category(force);
        SubLObject template_syntax = (SubLObject)relation_lexifier.NIL;
        SubLObject keywords_in_syntax = (SubLObject)relation_lexifier.NIL;
        SubLObject template_semantics = (SubLObject)relation_lexifier.NIL;
        thread.resetMultipleValues();
        final SubLObject template_syntax_$23 = qsl_pph_phrase_to_template_syntax(phrase, base_semantics);
        final SubLObject keywords_in_syntax_$24 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        template_syntax = template_syntax_$23;
        keywords_in_syntax = keywords_in_syntax_$24;
        template_semantics = compute_qsl_parse_template_semantics(base_semantics, semantics_with_keywords, keywords_in_syntax);
        return el_utilities.make_ternary_formula(template_pred, template_category, template_syntax, template_semantics);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 25469L)
    public static SubLObject compute_qsl_parse_template_semantics(final SubLObject base_semantics, final SubLObject semantics_with_keywords, final SubLObject keywords_in_syntax) {
        SubLObject result_semantics = conses_high.copy_list(base_semantics);
        SubLObject cdolist_list_var = keywords_in_syntax;
        SubLObject keyword = (SubLObject)relation_lexifier.NIL;
        keyword = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            final SubLObject position = cycl_utilities.arg_positions_bfs(keyword, semantics_with_keywords, (SubLObject)relation_lexifier.UNPROVIDED).first();
            final SubLObject corresponding_semantics = cycl_utilities.formula_arg_position(base_semantics, position, (SubLObject)relation_lexifier.UNPROVIDED);
            result_semantics = cycl_utilities.expression_subst(keyword, corresponding_semantics, result_semantics, (SubLObject)relation_lexifier.EQUAL, (SubLObject)relation_lexifier.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        }
        return result_semantics;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 26579L)
    public static SubLObject qsl_determine_template_category(final SubLObject force) {
        return (force == relation_lexifier.$kw90$INTERROGATIVE) ? relation_lexifier.$const93$QuestionTemplate : relation_lexifier.$const88$STemplate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 26866L)
    public static SubLObject qsl_pph_phrase_to_template_syntax(final SubLObject phrase, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject keywords = (SubLObject)relation_lexifier.NIL;
        SubLObject template_syntax = (SubLObject)relation_lexifier.NIL;
        final SubLObject _prev_bind_0 = relation_lexifier.$qsl_keywords_used$.currentBinding(thread);
        try {
            relation_lexifier.$qsl_keywords_used$.bind((SubLObject)relation_lexifier.NIL, thread);
            template_syntax = el_utilities.make_formula(relation_lexifier.$const80$NLPatternList, qsl_pph_phrase_to_template_syntax_int(phrase, semantics), (SubLObject)relation_lexifier.UNPROVIDED);
            keywords = relation_lexifier.$qsl_keywords_used$.getDynamicValue(thread);
        }
        finally {
            relation_lexifier.$qsl_keywords_used$.rebind(_prev_bind_0, thread);
        }
        return Values.values(template_syntax, keywords);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 27472L)
    public static SubLObject qsl_pph_phrase_to_template_syntax_int(final SubLObject phrase, final SubLObject semantics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((relation_lexifier.NIL == qsl_trees_availableP() || relation_lexifier.NIL != pph_phrase.pph_phrase_nominalP(phrase)) && relation_lexifier.$kw94$PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED) && pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED).isKeyword()) {
            relation_lexifier.$qsl_keywords_used$.setDynamicValue((SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED), relation_lexifier.$qsl_keywords_used$.getDynamicValue(thread)), thread);
            if (relation_lexifier.NIL != pph_phrase.pph_phrase_nbarP(phrase)) {
                return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, relation_lexifier.$const95$NBarTemplate, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)));
            }
            return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, relation_lexifier.$const77$NPTemplate, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)));
        }
        else {
            if ((relation_lexifier.NIL == qsl_trees_availableP() || pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED).equal(relation_lexifier.$const32$Determiner)) && relation_lexifier.$kw94$PPH_UNKNOWN_CYCL != pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED) && pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED).isKeyword() && numeral_parser.string_to_interval(pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED)).isNumber()) {
                relation_lexifier.$qsl_keywords_used$.setDynamicValue((SubLObject)ConsesLow.cons(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED), relation_lexifier.$qsl_keywords_used$.getDynamicValue(thread)), thread);
                return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, relation_lexifier.$const96$NumberTemplate, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)));
            }
            if (relation_lexifier.NIL != lexicon_accessors.npP(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) && (relation_lexifier.NIL == pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED) || relation_lexifier.$kw94$PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)))) {
                SubLObject result = (SubLObject)relation_lexifier.NIL;
                SubLObject num = (SubLObject)relation_lexifier.ZERO_INTEGER;
                if (document.sign_constituents(phrase).isVector()) {
                    final SubLObject vector_var = document.sign_constituents(phrase);
                    final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject daughter;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                        element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                        daughter = Vectors.aref(vector_var, element_num);
                        result = Sequences.cconcatenate(result, qsl_pph_phrase_to_template_syntax_int(daughter, semantics));
                        num = Numbers.add(num, (SubLObject)relation_lexifier.ONE_INTEGER);
                    }
                }
                if (relation_lexifier.NIL != result) {
                    return result;
                }
                SubLObject cdolist_list_var = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.UNPROVIDED);
                SubLObject word = (SubLObject)relation_lexifier.NIL;
                word = cdolist_list_var.first();
                while (relation_lexifier.NIL != cdolist_list_var) {
                    result = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(relation_lexifier.$const79$NLPattern_Exact, word), result);
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
                return Sequences.nreverse(result);
            }
            else {
                if (relation_lexifier.NIL != pph_phrase.pph_phrase_head_verbP(phrase)) {
                    return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const78$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED), relation_lexifier.$const44$Verb));
                }
                if (relation_lexifier.NIL != pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const78$NLPattern_Word, pph_phrase.pph_phrase_wu(phrase, (SubLObject)relation_lexifier.UNPROVIDED), pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED)));
                }
                if (relation_lexifier.NIL != pph_phrase.pph_phrase_has_dtrsP(phrase)) {
                    SubLObject result = (SubLObject)relation_lexifier.NIL;
                    SubLObject dtr_num = (SubLObject)relation_lexifier.ZERO_INTEGER;
                    if (document.sign_constituents(phrase).isVector()) {
                        final SubLObject vector_var = document.sign_constituents(phrase);
                        final SubLObject backwardP_var = (SubLObject)relation_lexifier.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject dtr;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)relation_lexifier.NIL, v_iteration = (SubLObject)relation_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER)) {
                            element_num = ((relation_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)relation_lexifier.ONE_INTEGER) : v_iteration);
                            dtr = Vectors.aref(vector_var, element_num);
                            result = Sequences.cconcatenate(result, qsl_pph_phrase_to_template_syntax_int(dtr, semantics));
                            dtr_num = Numbers.add(dtr_num, (SubLObject)relation_lexifier.ONE_INTEGER);
                        }
                    }
                    return result;
                }
                if (relation_lexifier.NIL != pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) {
                    SubLObject ret_value = (SubLObject)relation_lexifier.NIL;
                    SubLObject cdolist_list_var2 = string_utilities.split_string(pph_phrase.pph_phrase_string(phrase, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.UNPROVIDED);
                    SubLObject word2 = (SubLObject)relation_lexifier.NIL;
                    word2 = cdolist_list_var2.first();
                    while (relation_lexifier.NIL != cdolist_list_var2) {
                        ret_value = (SubLObject)ConsesLow.cons(el_utilities.make_unary_formula(relation_lexifier.$const79$NLPattern_Exact, word2), ret_value);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        word2 = cdolist_list_var2.first();
                    }
                    return Sequences.nreverse(ret_value);
                }
                if (pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED).isKeyword() && !relation_lexifier.$kw94$PPH_UNKNOWN_CYCL.equal(pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)) && relation_lexifier.NIL != pph_phrase.pph_phrase_nominalP(phrase)) {
                    SubLObject template_category = relation_lexifier.$const77$NPTemplate;
                    if (relation_lexifier.NIL != pph_phrase.pph_phrase_agr(phrase)) {
                        final SubLObject phrase_agr = pph_phrase.pph_phrase_agr(phrase);
                        final SubLObject abcon = pph_data_structures.pph_phrase_agr_absolute_constraint(phrase_agr);
                        final SubLObject pcase_var = pph_utilities.pph_agr_constraint_type(abcon);
                        if (pcase_var.eql((SubLObject)relation_lexifier.$kw40$POS_PRED)) {
                            template_category = iterative_template_parser.rtp_cat_for_pred(pph_utilities.pph_agr_constraint_target(abcon));
                        }
                        else if (pcase_var.eql((SubLObject)relation_lexifier.$kw81$NL_PREDS)) {
                            template_category = iterative_template_parser.best_rtp_cat_for_preds(pph_utilities.pph_agr_constraint_target(abcon));
                        }
                    }
                    else if (relation_lexifier.NIL != kb_indexing_datastructures.indexed_term_p(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED))) {
                        template_category = iterative_template_parser.rtp_cat_for_pos(pph_phrase.pph_phrase_category(phrase, (SubLObject)relation_lexifier.UNPROVIDED));
                    }
                    return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(relation_lexifier.$const76$NLPattern_Template, template_category, pph_phrase.pph_phrase_cycl(phrase, (SubLObject)relation_lexifier.UNPROVIDED)));
                }
                Errors.warn((SubLObject)relation_lexifier.$str82$unusable_phrase_sent_to_PPH_PHRAS, phrase);
                return (SubLObject)relation_lexifier.NIL;
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 31451L)
    public static SubLObject qsl_trees_availableP() {
        return parser.charniak_parser_availableP((SubLObject)relation_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 31534L)
    public static SubLObject print_words_from_rel_phrases(final SubLObject rel_phrases) {
        SubLObject cdolist_list_var = rel_phrases;
        SubLObject rel_phrase = (SubLObject)relation_lexifier.NIL;
        rel_phrase = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            print_high.princ(pph_phrase_resolution.pph_phrase_get_string(rel_phrase_pph_phrase(rel_phrase), (SubLObject)relation_lexifier.UNPROVIDED, (SubLObject)relation_lexifier.UNPROVIDED), (SubLObject)relation_lexifier.UNPROVIDED);
            print_high.princ((SubLObject)relation_lexifier.$str97$_, (SubLObject)relation_lexifier.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            rel_phrase = cdolist_list_var.first();
        }
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 31732L)
    public static SubLObject attach_less_principled_information(final SubLObject dtr) {
        return dtr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 31857L)
    public static SubLObject new_rel_phrase(final SubLObject start, final SubLObject end, final SubLObject v_pph_phrase, final SubLObject tokenized_original) {
        return (SubLObject)ConsesLow.list(start, end, v_pph_phrase, tokenized_original);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 31987L)
    public static SubLObject rel_phrase_end(final SubLObject phrase) {
        return conses_high.second(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 32053L)
    public static SubLObject rel_phrase_start(final SubLObject phrase) {
        return phrase.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 32120L)
    public static SubLObject rel_phrase_pph_phrase(final SubLObject phrase) {
        return conses_high.third(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 32192L)
    public static SubLObject rel_phrase_original(final SubLObject phrase) {
        return conses_high.fourth(phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 32263L)
    public static SubLObject rel_phrase_words(final SubLObject phrase) {
        return Sequences.subseq(rel_phrase_original(phrase), rel_phrase_start(phrase), rel_phrase_end(phrase));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 32410L)
    public static SubLObject get_rtp_useful_speech_parts(final SubLObject speech_parts) {
        ensure_pos_template_mappings_initialized();
        SubLObject result = (SubLObject)relation_lexifier.NIL;
        SubLObject cdolist_list_var = speech_parts;
        SubLObject speech_part = (SubLObject)relation_lexifier.NIL;
        speech_part = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$25 = relation_lexifier.$pos_template_mappings$.getGlobalValue();
            SubLObject map = (SubLObject)relation_lexifier.NIL;
            map = cdolist_list_var_$25.first();
            while (relation_lexifier.NIL != cdolist_list_var_$25) {
                if (relation_lexifier.NIL != genls.genl_in_any_mtP(speech_part, map.first())) {
                    result = (SubLObject)ConsesLow.cons(map.first(), result);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                map = cdolist_list_var_$25.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            speech_part = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 38197L)
    public static SubLObject ensure_pos_template_mappings_initialized() {
        if (relation_lexifier.NIL == relation_lexifier.$pos_template_mappings$.getGlobalValue()) {
            initialize_pos_template_mappings();
        }
        return relation_lexifier.$pos_template_mappings$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/relation-lexifier.lisp", position = 42482L)
    public static SubLObject initialize_pos_template_mappings() {
        relation_lexifier.$pos_template_mappings$.setGlobalValue((SubLObject)relation_lexifier.NIL);
        SubLObject cdolist_list_var;
        final SubLObject assertion_list = cdolist_list_var = kb_mapping.gather_predicate_extent_index(relation_lexifier.$const98$posForTemplateCategory, relation_lexifier.$const99$TemplateParsingMt, (SubLObject)relation_lexifier.UNPROVIDED);
        SubLObject v_assert = (SubLObject)relation_lexifier.NIL;
        v_assert = cdolist_list_var.first();
        while (relation_lexifier.NIL != cdolist_list_var) {
            relation_lexifier.$pos_template_mappings$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(assertions_high.assertion_formula(v_assert), (SubLObject)relation_lexifier.UNPROVIDED), cycl_utilities.formula_arg2(assertions_high.assertion_formula(v_assert), (SubLObject)relation_lexifier.UNPROVIDED)), relation_lexifier.$pos_template_mappings$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            v_assert = cdolist_list_var.first();
        }
        return relation_lexifier.$pos_template_mappings$.getGlobalValue();
    }
    
    public static SubLObject declare_relation_lexifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "gen_format_assertion_to_gen_template", "GEN-FORMAT-ASSERTION-TO-GEN-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "handlable_arg_order_sublist_elementP", "HANDLABLE-ARG-ORDER-SUBLIST-ELEMENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "massage_lexification_tokenization", "MASSAGE-LEXIFICATION-TOKENIZATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "lexify_relation", "LEXIFY-RELATION", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "phrasal_cat_for_pos", "PHRASAL-CAT-FOR-POS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "lexifier_pph_phrase", "LEXIFIER-PPH-PHRASE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "lexifier_np", "LEXIFIER-NP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "lexifier_det_phrase", "LEXIFIER-DET-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "lexifier_indefinite_determiner_p", "LEXIFIER-INDEFINITE-DETERMINER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "push_phrase", "PUSH-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "open_quote_string_p", "OPEN-QUOTE-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "open_quote_p", "OPEN-QUOTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "close_quote_string_p", "CLOSE-QUOTE-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "close_quote_p", "CLOSE-QUOTE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_lex_guess_more_info", "REL-LEX-GUESS-MORE-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "guess_more_info_for_dtr", "GUESS-MORE-INFO-FOR-DTR", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "maybe_make_head_verb", "MAYBE-MAKE-HEAD-VERB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "make_np_dtr", "MAKE-NP-DTR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "remove_number_agreement", "REMOVE-NUMBER-AGREEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "generalize_speech_part_preds", "GENERALIZE-SPEECH-PART-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "clear_generalize_speech_part_pred", "CLEAR-GENERALIZE-SPEECH-PART-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "remove_generalize_speech_part_pred", "REMOVE-GENERALIZE-SPEECH-PART-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "generalize_speech_part_pred_internal", "GENERALIZE-SPEECH-PART-PRED-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "generalize_speech_part_pred", "GENERALIZE-SPEECH-PART-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "generalize_speech_part_pred_int", "GENERALIZE-SPEECH-PART-PRED-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "general_speech_part_predP", "GENERAL-SPEECH-PART-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "tensed_verb_lacking_agreement_infoP", "TENSED-VERB-LACKING-AGREEMENT-INFO?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_lex_revert_generic_arg_phrases", "REL-LEX-REVERT-GENERIC-ARG-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_lex_merge_strings", "REL-LEX-MERGE-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "add_bare_string_dtrs", "ADD-BARE-STRING-DTRS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "build_pph_np_from_np_parse", "BUILD-PPH-NP-FROM-NP-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "parse_template_from_pph_phrase", "PARSE-TEMPLATE-FROM-PPH-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "template_sem_from_template_syntax", "TEMPLATE-SEM-FROM-TEMPLATE-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "pph_phrase_to_template_syntax", "PPH-PHRASE-TO-TEMPLATE-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "determine_template_pred", "DETERMINE-TEMPLATE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "determine_template_category", "DETERMINE-TEMPLATE-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "qsl_parse_template_from_pph_phrase", "QSL-PARSE-TEMPLATE-FROM-PPH-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "compute_qsl_parse_template_semantics", "COMPUTE-QSL-PARSE-TEMPLATE-SEMANTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "qsl_determine_template_category", "QSL-DETERMINE-TEMPLATE-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "qsl_pph_phrase_to_template_syntax", "QSL-PPH-PHRASE-TO-TEMPLATE-SYNTAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "qsl_pph_phrase_to_template_syntax_int", "QSL-PPH-PHRASE-TO-TEMPLATE-SYNTAX-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "qsl_trees_availableP", "QSL-TREES-AVAILABLE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "print_words_from_rel_phrases", "PRINT-WORDS-FROM-REL-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "attach_less_principled_information", "ATTACH-LESS-PRINCIPLED-INFORMATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "new_rel_phrase", "NEW-REL-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_phrase_end", "REL-PHRASE-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_phrase_start", "REL-PHRASE-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_phrase_pph_phrase", "REL-PHRASE-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_phrase_original", "REL-PHRASE-ORIGINAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "rel_phrase_words", "REL-PHRASE-WORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "get_rtp_useful_speech_parts", "GET-RTP-USEFUL-SPEECH-PARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "ensure_pos_template_mappings_initialized", "ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.relation_lexifier", "initialize_pos_template_mappings", "INITIALIZE-POS-TEMPLATE-MAPPINGS", 0, 0, false);
        return (SubLObject)relation_lexifier.NIL;
    }
    
    public static SubLObject init_relation_lexifier_file() {
        relation_lexifier.$pos_template_mappings$ = SubLFiles.deflexical("*POS-TEMPLATE-MAPPINGS*", (SubLObject)((relation_lexifier.NIL != Symbols.boundp((SubLObject)relation_lexifier.$sym0$_POS_TEMPLATE_MAPPINGS_)) ? relation_lexifier.$pos_template_mappings$.getGlobalValue() : relation_lexifier.NIL));
        relation_lexifier.$generalize_speech_part_pred_caching_state$ = SubLFiles.deflexical("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*", (SubLObject)relation_lexifier.NIL);
        relation_lexifier.$qsl_keywords_used$ = SubLFiles.defparameter("*QSL-KEYWORDS-USED*", (SubLObject)relation_lexifier.NIL);
        return (SubLObject)relation_lexifier.NIL;
    }
    
    public static SubLObject setup_relation_lexifier_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)relation_lexifier.$sym0$_POS_TEMPLATE_MAPPINGS_);
        memoization_state.note_globally_cached_function((SubLObject)relation_lexifier.$sym48$GENERALIZE_SPEECH_PART_PRED);
        return (SubLObject)relation_lexifier.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_relation_lexifier_file();
    }
    
    @Override
	public void initializeVariables() {
        init_relation_lexifier_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_relation_lexifier_file();
    }
    
    static {
        me = (SubLFile)new relation_lexifier();
        relation_lexifier.$pos_template_mappings$ = null;
        relation_lexifier.$generalize_speech_part_pred_caching_state$ = null;
        relation_lexifier.$qsl_keywords_used$ = null;
        $sym0$_POS_TEMPLATE_MAPPINGS_ = SubLObjectFactory.makeSymbol("*POS-TEMPLATE-MAPPINGS*");
        $str1$__ = SubLObjectFactory.makeString("''");
        $str2$_ = SubLObjectFactory.makeString("'");
        $str3$__ = SubLObjectFactory.makeString("``");
        $str4$_a = SubLObjectFactory.makeString("~a");
        $str5$_ = SubLObjectFactory.makeString("`");
        $sym6$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym7$PPH_DETERMINER_ = SubLObjectFactory.makeSymbol("PPH-DETERMINER?");
        $sym8$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $sym9$HANDLABLE_ARG_ORDER_SUBLIST_ELEMENT_ = SubLObjectFactory.makeSymbol("HANDLABLE-ARG-ORDER-SUBLIST-ELEMENT?");
        $str10$Can_t_handle__S_in__S = SubLObjectFactory.makeString("Can't handle ~S in ~S");
        $str11$_S_references_arg_S____which_is_g = SubLObjectFactory.makeString("~S references arg~S,~% which is greater than the min-arity of ~S");
        $str12$Multiple_slots_for_arg_S_in____S = SubLObjectFactory.makeString("Multiple slots for arg~S in~% ~S");
        $str13$Failed_to_exhaust_arg_order_list_ = SubLObjectFactory.makeString("Failed to exhaust arg-order list for ~S.~% Remainder: ~S~%");
        $str14$Couldn_t_find_twiddle_for_ARG_S_i = SubLObjectFactory.makeString("Couldn't find twiddle for ARG~S in ~S");
        $str15$_S_must_be_the_same_length_as__S = SubLObjectFactory.makeString("~S must be the same length as ~S");
        $sym16$SPEECH_PART_ = SubLObjectFactory.makeSymbol("SPEECH-PART?");
        $sym17$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym18$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $const20$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $sym21$_ = SubLObjectFactory.makeSymbol(">");
        $sym22$REL_PHRASE_START = SubLObjectFactory.makeSymbol("REL-PHRASE-START");
        $kw23$NOT_YET = SubLObjectFactory.makeKeyword("NOT-YET");
        $kw24$CAT = SubLObjectFactory.makeKeyword("CAT");
        $const25$headsPhraseOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headsPhraseOfType"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CAT"));
        $const27$GeneralLexiconMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt"));
        $const28$PhraseFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn"));
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $const30$Indefinite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Indefinite-NLAttr"));
        $const31$Definite_NLAttr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Definite-NLAttr"));
        $const32$Determiner = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"));
        $kw33$A_THE_WORD = SubLObjectFactory.makeKeyword("A-THE-WORD");
        $kw34$SOME = SubLObjectFactory.makeKeyword("SOME");
        $kw35$THE_THE_WORD = SubLObjectFactory.makeKeyword("THE-THE-WORD");
        $str36$Can_t_determine_definiteness_of__ = SubLObjectFactory.makeString("Can't determine definiteness of ~S");
        $sym37$CLOSE_QUOTE_STRING_P = SubLObjectFactory.makeSymbol("CLOSE-QUOTE-STRING-P");
        $sym38$PPH_PHRASE_STRING = SubLObjectFactory.makeSymbol("PPH-PHRASE-STRING");
        $sym39$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw40$POS_PRED = SubLObjectFactory.makeKeyword("POS-PRED");
        $const41$nounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nounStrings"));
        $const42$tensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"));
        $kw43$SUBJECT_VERB = SubLObjectFactory.makeKeyword("SUBJECT-VERB");
        $const44$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $str45$guess_more_info_not_doing_anythin = SubLObjectFactory.makeString("guess-more-info not doing anything with ~s~%");
        $const46$pastTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastTense-Generic"));
        $const47$presentTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentTense-Generic"));
        $sym48$GENERALIZE_SPEECH_PART_PRED = SubLObjectFactory.makeSymbol("GENERALIZE-SPEECH-PART-PRED");
        $sym49$_GENERALIZE_SPEECH_PART_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENERALIZE-SPEECH-PART-PRED-CACHING-STATE*");
        $const50$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw51$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw52$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw53$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw54$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $const55$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const56$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw58$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str59$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym60$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw61$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str62$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw63$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str64$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str65$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str66$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str67$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const68$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $const69$agentiveNounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentiveNounStrings"));
        $const70$GenericSpeechPartPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericSpeechPartPredicate"));
        $sym71$SPEC_PRED_ = SubLObjectFactory.makeSymbol("SPEC-PRED?");
        $kw72$ANY = SubLObjectFactory.makeKeyword("ANY");
        $sym73$GENERIC_ARG_ = SubLObjectFactory.makeSymbol("GENERIC-ARG?");
        $sym74$_ = SubLObjectFactory.makeSymbol("<");
        $sym75$GENERIC_ARG_NUM = SubLObjectFactory.makeSymbol("GENERIC-ARG-NUM");
        $const76$NLPattern_Template = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Template"));
        $const77$NPTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"));
        $const78$NLPattern_Word = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Word"));
        $const79$NLPattern_Exact = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPattern-Exact"));
        $const80$NLPatternList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLPatternList"));
        $kw81$NL_PREDS = SubLObjectFactory.makeKeyword("NL-PREDS");
        $str82$unusable_phrase_sent_to_PPH_PHRAS = SubLObjectFactory.makeString("unusable phrase sent to PPH-PHRASE-TO-TEMPLATE-SYNTAX: ~%~S~%");
        $const83$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $const84$termTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termTemplate-Reln"));
        $const85$assertTemplate_Reln = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate-Reln"));
        $sym86$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const87$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const88$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $str89$Sent_non_relation__S_to_DETERMINE = SubLObjectFactory.makeString("Sent non-relation ~S to DETERMINE-TEMPLATE-CATEGORY");
        $kw90$INTERROGATIVE = SubLObjectFactory.makeKeyword("INTERROGATIVE");
        $const91$queryTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("queryTemplate"));
        $const92$assertTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertTemplate"));
        $const93$QuestionTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate"));
        $kw94$PPH_UNKNOWN_CYCL = SubLObjectFactory.makeKeyword("PPH-UNKNOWN-CYCL");
        $const95$NBarTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NBarTemplate"));
        $const96$NumberTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumberTemplate"));
        $str97$_ = SubLObjectFactory.makeString(" ");
        $const98$posForTemplateCategory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForTemplateCategory"));
        $const99$TemplateParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemplateParsingMt"));
    }
}

/*

	Total time: 659 ms
	 synthetic 
*/