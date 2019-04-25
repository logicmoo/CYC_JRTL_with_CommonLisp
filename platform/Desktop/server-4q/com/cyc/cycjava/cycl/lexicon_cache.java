package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexicon_cache";
    public static final String myFingerPrint = "1a499bb47e0dd301bc6654473d50f8e59e6380196802d6175887e2c853dca7fc";
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1565L)
    private static SubLSymbol $perfect_aspect_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 2886L)
    private static SubLSymbol $sowu_eq_test$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3088L)
    private static SubLSymbol $sowu_first_onlyP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3209L)
    private static SubLSymbol $sowu_use_morphologyP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3319L)
    private static SubLSymbol $sowu_include_supportsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3431L)
    private static SubLSymbol $sowu_respect_orderP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 9006L)
    private static SubLSymbol $within_regular_generation_internalsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
    private static SubLSymbol $sosowp_do_filter_exceptions_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12310L)
    private static SubLSymbol $sosowp_done_args$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12579L)
    private static SubLSymbol $sosowp_repeated_argsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31287L)
    private static SubLSymbol $grsos_done_args$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31543L)
    private static SubLSymbol $grsos_repeated_argsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 37308L)
    private static SubLSymbol $lexicon_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38260L)
    private static SubLSymbol $allow_nl_trie_rotation_initializationP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44133L)
    private static SubLSymbol $must_use_static_memory_for_nl_trieP$;
    private static final SubLString $str0$_Revision__146268__;
    private static final SubLSymbol $sym1$_LEXICON_CACHE_CODE_REVISION_;
    private static final SubLList $list2;
    private static final SubLString $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84;
    private static final SubLSymbol $sym4$STRINGP;
    private static final SubLSymbol $sym5$PARSE_MORPHOLOGICALLY_OPTION_P;
    private static final SubLSymbol $sym6$WORDS_OF_STRING;
    private static final SubLList $list7;
    private static final SubLString $str8$_return_LISTP__of_word_units_asso;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$ALL;
    private static final SubLSymbol $sym12$LEXICAL_WORD_;
    private static final SubLSymbol $sym13$SPEECH_PART_PRED_;
    private static final SubLSymbol $kw14$DEPTH;
    private static final SubLSymbol $kw15$STACK;
    private static final SubLSymbol $kw16$QUEUE;
    private static final SubLObject $const17$True_JustificationTruth;
    private static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw19$ERROR;
    private static final SubLString $str20$_A_is_not_a__A;
    private static final SubLSymbol $sym21$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw22$CERROR;
    private static final SubLString $str23$continue_anyway;
    private static final SubLSymbol $kw24$WARN;
    private static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const26$genlPreds;
    private static final SubLString $str27$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str28$attempting_to_bind_direction_link;
    private static final SubLString $str29$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const30$regularSuffix;
    private static final SubLSymbol $sym31$LISTP;
    private static final SubLSymbol $sym32$PREFER_POS_PRED_;
    private static final SubLSymbol $sym33$REGULAR_GENERATION_ANSWER_STRING;
    private static final SubLSymbol $sym34$SOSOWP_DO_FILTER_EXCEPTIONS;
    private static final SubLSymbol $sym35$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym36$ALL_SPEC_PREDICATES;
    private static final SubLSymbol $sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_;
    private static final SubLSymbol $sym38$GENL_PRED_;
    private static final SubLSymbol $sym39$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const40$EverythingPSC;
    private static final SubLSymbol $sym41$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const42$InferencePSC;
    private static final SubLSymbol $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym44$ALL_GENL_LEXICON_PREDS;
    private static final SubLSymbol $sym45$_;
    private static final SubLSymbol $sym46$NUM_PREDICATE_EXTENT_INDEX;
    private static final SubLInteger $int47$64;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$PROGN;
    private static final SubLSymbol $sym50$CLET;
    private static final SubLSymbol $sym51$NEW_ARGS_;
    private static final SubLSymbol $sym52$SET_ADD;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$CUNWIND_PROTECT;
    private static final SubLSymbol $sym56$PWHEN;
    private static final SubLSymbol $sym57$SET_REMOVE;
    private static final SubLSymbol $sym58$STRING_OR_STRINGS_OF_WORD_PRED;
    private static final SubLSymbol $sym59$RELEVANT_PRED_IS_EVERYTHING;
    private static final SubLInteger $int60$1000;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS;
    private static final SubLSymbol $sym63$SOSOWP_INT_ANSWER_TO_UTF8;
    private static final SubLSymbol $sym64$_STRING;
    private static final SubLSymbol $sym65$_PRED;
    private static final SubLSymbol $kw66$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $kw67$MAX_NUMBER;
    private static final SubLSymbol $kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static final SubLSymbol $kw69$NONE;
    private static final SubLSymbol $kw70$RETURN;
    private static final SubLSymbol $kw71$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $kw72$BINDINGS;
    private static final SubLObject $const73$and;
    private static final SubLSymbol $sym74$FIRST;
    private static final SubLSymbol $sym75$SOSOWP_INT_SPEC_PREDS;
    private static final SubLInteger $int76$200;
    private static final SubLSymbol $sym77$PREFER_LEXICAL_ASSERTION_;
    private static final SubLObject $const78$simpleFuture_Generic;
    private static final SubLObject $const79$futureTense_Generic;
    private static final SubLObject $const80$EnglishMt;
    private static final SubLObject $const81$EnglishHeadlineParaphraseMt;
    private static final SubLString $str82$to_;
    private static final SubLString $str83$will_;
    private static final SubLObject $const84$infinitive;
    private static final SubLString $str85$_;
    private static final SubLObject $const86$perfect;
    private static final SubLObject $const87$abbreviationForLexicalWord;
    private static final SubLSymbol $kw88$GAF;
    private static final SubLSymbol $kw89$TRUE;
    private static final SubLObject $const90$futurePerfect_Universal;
    private static final SubLString $str91$will_have;
    private static final SubLObject $const92$pastPerfect_Universal;
    private static final SubLString $str93$had;
    private static final SubLObject $const94$firstPersonSg_PresentPerfect;
    private static final SubLObject $const95$secondPersonSg_PresentPerfect;
    private static final SubLObject $const96$pluralVerb_PresentPerfect;
    private static final SubLString $str97$have;
    private static final SubLObject $const98$thirdPersonSg_PresentPerfect;
    private static final SubLString $str99$has;
    private static final SubLObject $const100$dispreferredLexification;
    private static final SubLSymbol $kw101$MONOTONIC;
    private static final SubLSymbol $kw102$DEFAULT;
    private static final SubLSymbol $kw103$TERSE;
    private static final SubLObject $const104$genStringAssertion_Terse;
    private static final SubLSymbol $kw105$PRECISE;
    private static final SubLObject $const106$genStringAssertion_Precise;
    private static final SubLObject $const107$genStringAssertion;
    private static final SubLSymbol $sym108$SECOND;
    private static final SubLObject $const109$verbStrings;
    private static final SubLObject $const110$simpleNounStrings;
    private static final SubLObject $const111$plural_Generic;
    private static final SubLObject $const112$singular_Generic;
    private static final SubLObject $const113$ProperNoun;
    private static final SubLObject $const114$CountNoun_Generic;
    private static final SubLObject $const115$MassNoun_Generic;
    private static final SubLInteger $int116$400;
    private static final SubLObject $const117$tensed;
    private static final SubLObject $const118$presentTense_Generic;
    private static final SubLList $list119;
    private static final SubLList $list120;
    private static final SubLObject $const121$adverbStrings;
    private static final SubLObject $const122$adjStrings;
    private static final SubLObject $const123$regularDegree;
    private static final SubLObject $const124$regularAdverb;
    private static final SubLObject $const125$Noun;
    private static final SubLObject $const126$comparativeDegree;
    private static final SubLObject $const127$comparativeAdverb;
    private static final SubLObject $const128$superlativeDegree;
    private static final SubLObject $const129$superlativeAdverb;
    private static final SubLString $str130$est;
    private static final SubLString $str131$er;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$VALID_CONSTANT_;
    private static final SubLObject $const134$AnytimePSC;
    private static final SubLList $list135;
    private static final SubLString $str136$Merely_validating_NL_trie_as_it_a;
    private static final SubLString $str137$Skipping_initialization_of_NL_tri;
    private static final SubLString $str138$needed;
    private static final SubLString $str139$allowed;
    private static final SubLString $str140$lexicon_cache;
    private static final SubLString $str141$cfasl;
    private static final SubLSymbol $kw142$OUTPUT;
    private static final SubLString $str143$Dumping_lexicon_cache___;
    private static final SubLString $str144$Unable_to_open__S;
    private static final SubLString $str145$CFASL_file__s_not_found;
    private static final SubLString $str146$Loading_lexicon_cache___;
    private static final SubLSymbol $kw147$INPUT;
    private static final SubLString $str148$nl_trie_contents;
    private static final SubLString $str149$nl_trie_contents_index;
    private static final SubLSymbol $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__;
    private static final SubLSymbol $sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE;
    private static final SubLString $str152$Instruct_the_loader_to_use_static;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE;
    private static final SubLString $str155$Instruct_the_loader_to_leave_it_u;
    private static final SubLSymbol $kw156$TEST;
    private static final SubLSymbol $kw157$OWNER;
    private static final SubLSymbol $kw158$CLASSES;
    private static final SubLSymbol $kw159$KB;
    private static final SubLSymbol $kw160$FULL;
    private static final SubLSymbol $kw161$WORKING_;
    private static final SubLList $list162;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1682L)
    public static SubLObject perfect_aspect_pred() {
        if (lexicon_cache.NIL == lexicon_cache.$perfect_aspect_pred$.getGlobalValue()) {
            lexicon_cache.$perfect_aspect_pred$.setGlobalValue(constants_high.find_constant_by_guid(Guids.string_to_guid((SubLObject)lexicon_cache.$str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84)));
        }
        return lexicon_cache.$perfect_aspect_pred$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 1957L)
    public static SubLObject words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject parse_morphologically) {
        if (misspellingsP == lexicon_cache.UNPROVIDED) {
            misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
        }
        if (lookup_mt == lexicon_cache.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (parse_morphologically == lexicon_cache.UNPROVIDED) {
            parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
        }
        enforceType(string, lexicon_cache.$sym4$STRINGP);
        enforceType(parse_morphologically, lexicon_cache.$sym5$PARSE_MORPHOLOGICALLY_OPTION_P);
        SubLObject words = nl_trie_accessors.nl_trie_words_of_string(string, misspellingsP, lookup_mt, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL != lexicon_accessors.proceed_with_morphological_parsingP(words, parse_morphologically)) {
            words = czer_utilities.delete_el_duplicates(ConsesLow.append(words, morphological_word_parser.words_of_complex_word_string(string)));
        }
        return words;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 3536L)
    public static SubLObject strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == lexicon_cache.UNPROVIDED) {
            include = (SubLObject)lexicon_cache.$kw11$ALL;
        }
        if (exceptions == lexicon_cache.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_cache.NIL;
        }
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(word) : word;
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.NIL, thread);
            ans = string_or_strings_of_word_unit(word, include, exceptions, mt, (SubLObject)lexicon_cache.UNPROVIDED);
        }
        finally {
            lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 4132L)
    public static SubLObject first_string_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject mt) {
        if (include == lexicon_cache.UNPROVIDED) {
            include = (SubLObject)lexicon_cache.$kw11$ALL;
        }
        if (exceptions == lexicon_cache.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_cache.NIL;
        }
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(word) : word;
        SubLObject string = (SubLObject)lexicon_cache.NIL;
        SubLObject pred = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.T, thread);
            thread.resetMultipleValues();
            final SubLObject string_$1 = string_or_strings_of_word_unit(word, include, exceptions, mt, (SubLObject)lexicon_cache.UNPROVIDED);
            final SubLObject pred_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            string = string_$1;
            pred = pred_$2;
        }
        finally {
            lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(string, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 4612L)
    public static SubLObject strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(word) : word;
        assert lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) : pred;
        SubLObject ans_strings = (SubLObject)lexicon_cache.NIL;
        SubLObject ans_preds = (SubLObject)lexicon_cache.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$3 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
                try {
                    lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject ans_strings_$4 = string_or_strings_of_wordXpred(word, pred, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                    final SubLObject ans_preds_$5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    ans_strings = ans_strings_$4;
                    ans_preds = ans_preds_$5;
                }
                finally {
                    lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0_$3, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans_strings, ans_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5178L)
    public static SubLObject inference_strings_of_wordXpred(final SubLObject word, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_include_supportsP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_include_supportsP$.bind((SubLObject)lexicon_cache.T, thread);
            ans = strings_of_wordXpred(word, pred, mt_relevance_macros.mt_info((SubLObject)lexicon_cache.UNPROVIDED));
        }
        finally {
            lexicon_cache.$sowu_include_supportsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5373L)
    public static SubLObject first_string_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(word) : word;
        assert lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) : pred;
        SubLObject ans_string = (SubLObject)lexicon_cache.NIL;
        SubLObject ans_pred = (SubLObject)lexicon_cache.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$7 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
                try {
                    lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.T, thread);
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        thread.resetMultipleValues();
                        final SubLObject ans_string_$9 = string_or_strings_of_wordXpred(word, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                        final SubLObject ans_pred_$10 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        ans_string = ans_string_$9;
                        ans_pred = ans_pred_$10;
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
                    }
                }
                finally {
                    lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(ans_string, ans_pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 5924L)
    public static SubLObject ok_to_derive_word_form_from_predP(final SubLObject wu, final SubLObject derived_pred, final SubLObject basic_pred, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLObject cleared_preds = set_utilities.new_singleton_set(basic_pred, (SubLObject)lexicon_cache.UNPROVIDED);
        return ok_to_derive_word_form_for_predP(wu, derived_pred, mt, cleared_preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 6304L)
    public static SubLObject ok_to_derive_word_form_for_predP(final SubLObject wu, final SubLObject pred, final SubLObject mt, final SubLObject cleared_preds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = (SubLObject)lexicon_cache.NIL;
        SubLObject irregularP = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, mt) && lexicon_cache.NIL == irregularP) {
            final SubLObject deck_type = (SubLObject)lexicon_cache.$kw16$QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = (SubLObject)lexicon_cache.NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = lexicon_cache.$const17$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((lexicon_cache.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((lexicon_cache.NIL != tv_var) ? lexicon_cache.$sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (lexicon_cache.NIL != tv_var && lexicon_cache.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && lexicon_cache.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)lexicon_cache.$kw19$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)lexicon_cache.ONE_INTEGER, (SubLObject)lexicon_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)lexicon_cache.$sym21$SBHL_TRUE_TV_P, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_cache.$kw22$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)lexicon_cache.ONE_INTEGER, (SubLObject)lexicon_cache.$str23$continue_anyway, (SubLObject)lexicon_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)lexicon_cache.$sym21$SBHL_TRUE_TV_P, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)lexicon_cache.$kw24$WARN)) {
                                    Errors.warn((SubLObject)lexicon_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)lexicon_cache.$sym21$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)lexicon_cache.$str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)lexicon_cache.$str23$continue_anyway, (SubLObject)lexicon_cache.$str20$_A_is_not_a__A, tv_var, (SubLObject)lexicon_cache.$sym21$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_cache.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds), thread);
                                if (lexicon_cache.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || lexicon_cache.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$16 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)lexicon_cache.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)lexicon_cache.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); lexicon_cache.NIL != node_and_predicate_mode && lexicon_cache.NIL == irregularP; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$21 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$21;
                                            final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (lexicon_cache.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$21)) {
                                                    irregularP = word_form_assertedP(wu, spec_pred, mt);
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(lexicon_cache.$const26$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$17;
                                                SubLObject _prev_bind_1_$17;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt_$25;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$18;
                                                SubLObject iteration_state_$27;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$19;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$29;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$20;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)lexicon_cache.NIL, rest = accessible_modules; lexicon_cache.NIL == irregularP && lexicon_cache.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((lexicon_cache.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(lexicon_cache.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$21);
                                                        if (lexicon_cache.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED));
                                                            if (lexicon_cache.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED));
                                                                if (lexicon_cache.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); lexicon_cache.NIL == irregularP && lexicon_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt_$25 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(mt_$25)) {
                                                                            _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$25, thread);
                                                                                for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); lexicon_cache.NIL == irregularP && lexicon_cache.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (lexicon_cache.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (lexicon_cache.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)lexicon_cache.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); lexicon_cache.NIL == irregularP && lexicon_cache.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (lexicon_cache.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && lexicon_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)lexicon_cache.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (lexicon_cache.NIL == irregularP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)lexicon_cache.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (lexicon_cache.NIL == irregularP && lexicon_cache.NIL != csome_list_var) {
                                                                                                        if (lexicon_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)lexicon_cache.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)lexicon_cache.$str27$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$19, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$18, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)lexicon_cache.FIVE_INTEGER, (SubLObject)lexicon_cache.$str28$attempting_to_bind_direction_link, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (lexicon_cache.NIL != obsolete.cnat_p(node, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                                            new_list = ((lexicon_cache.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED)));
                                                            for (rest_$29 = (SubLObject)lexicon_cache.NIL, rest_$29 = new_list; lexicon_cache.NIL == irregularP && lexicon_cache.NIL != rest_$29; rest_$29 = rest_$29.rest()) {
                                                                generating_fn = rest_$29.first();
                                                                _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (lexicon_cache.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)lexicon_cache.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); lexicon_cache.NIL == irregularP && lexicon_cache.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (lexicon_cache.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && lexicon_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)lexicon_cache.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (lexicon_cache.NIL == irregularP) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)lexicon_cache.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (lexicon_cache.NIL == irregularP && lexicon_cache.NIL != csome_list_var2) {
                                                                                if (lexicon_cache.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)lexicon_cache.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)lexicon_cache.$str27$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$20, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$17, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$17, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$16, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$18, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$16, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$15, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.$str29$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)lexicon_cache.UNPROVIDED)), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$17, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$15, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$14, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        if (lexicon_cache.NIL == irregularP) {
            set.set_add(pred, cleared_preds);
            if (lexicon_cache.NIL == okP) {
                SubLObject csome_list_var3 = kb_mapping_utilities.pred_values_in_relevant_mts(pred, lexicon_cache.$const30$regularSuffix, mt, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                SubLObject more_basic_pred = (SubLObject)lexicon_cache.NIL;
                more_basic_pred = csome_list_var3.first();
                while (lexicon_cache.NIL == okP && lexicon_cache.NIL != csome_list_var3) {
                    okP = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == lexicon_accessors.derived_predP(more_basic_pred, (SubLObject)lexicon_cache.UNPROVIDED) || lexicon_cache.NIL != set.set_memberP(more_basic_pred, cleared_preds) || lexicon_cache.NIL != ok_to_derive_word_form_for_predP(wu, more_basic_pred, mt, cleared_preds));
                    set.set_add(more_basic_pred, cleared_preds);
                    csome_list_var3 = csome_list_var3.rest();
                    more_basic_pred = csome_list_var3.first();
                }
            }
        }
        return okP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 6988L)
    public static SubLObject word_form_assertedP(final SubLObject wu, final SubLObject pred, final SubLObject mt) {
        return kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, pred, mt, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 7092L)
    public static SubLObject generate_regular_string(final SubLObject wu, final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(wu) : wu;
        assert lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) : pred;
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.T, thread);
            ans = generate_regular_string_or_strings(wu, pred, mt);
        }
        finally {
            lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 7859L)
    public static SubLObject generate_regular_strings(final SubLObject wu, final SubLObject pred, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != lexicon_accessors.lexical_wordP(wu) : wu;
        assert lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) : pred;
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.NIL, thread);
            ans = generate_regular_string_or_strings(wu, pred, mt);
        }
        finally {
            lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 8218L)
    public static SubLObject strings_of_word_unit_with_supports(final SubLObject word, final SubLObject include) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert lexicon_cache.NIL != Types.listp(include) : include;
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_include_supportsP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_include_supportsP$.bind((SubLObject)lexicon_cache.T, thread);
            ans = strings_of_word_unit(word, include, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.NIL);
        }
        finally {
            lexicon_cache.$sowu_include_supportsP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 8502L)
    public static SubLObject ordered_strings_of_word_unit(final SubLObject word, SubLObject include, SubLObject exceptions, SubLObject lookup_mt) {
        if (include == lexicon_cache.UNPROVIDED) {
            include = (SubLObject)lexicon_cache.$kw11$ALL;
        }
        if (exceptions == lexicon_cache.UNPROVIDED) {
            exceptions = (SubLObject)lexicon_cache.NIL;
        }
        if (lookup_mt == lexicon_cache.UNPROVIDED) {
            lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject respect_orderP = (SubLObject)lexicon_cache.T;
        final SubLObject _prev_bind_0 = lexicon_cache.$sowu_first_onlyP$.currentBinding(thread);
        try {
            lexicon_cache.$sowu_first_onlyP$.bind((SubLObject)lexicon_cache.NIL, thread);
            ans = string_or_strings_of_word_unit(word, include, exceptions, lookup_mt, respect_orderP);
        }
        finally {
            lexicon_cache.$sowu_first_onlyP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 9118L)
    public static SubLObject string_or_strings_of_word_unit(SubLObject word, final SubLObject include, final SubLObject exceptions, SubLObject mt, SubLObject respect_orderP) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (respect_orderP == lexicon_cache.UNPROVIDED) {
            respect_orderP = lexicon_cache.$sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_cache.NIL != el_utilities.possibly_naut_p(word)) {
            final SubLObject nart = narts_high.find_nart(word);
            word = ((lexicon_cache.NIL != nart) ? nart : word);
        }
        if (lexicon_cache.NIL != forts.fort_p(word) && lexicon_cache.NIL == lexicon_accessors.quick_lexical_wordP(word, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        final SubLObject preds0 = (include == lexicon_cache.$kw11$ALL) ? lexicon_accessors.top_level_nl_preds() : include;
        final SubLObject preds2 = (lexicon_cache.NIL != respect_orderP || lexicon_cache.NIL == lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread)) ? preds0 : Sort.sort(sosowp_filter_exceptions(conses_high.copy_list(preds0), exceptions), (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, (SubLObject)lexicon_cache.UNPROVIDED);
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject doneP = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$within_regular_generation_internalsP$.currentBinding(thread);
        try {
            lexicon_cache.$within_regular_generation_internalsP$.bind((SubLObject)lexicon_cache.T, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$32 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$33 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = preds2;
                            SubLObject pred = (SubLObject)lexicon_cache.NIL;
                            pred = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                    final SubLObject new_answers = string_or_strings_of_wordXpred(word, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    if (lexicon_cache.NIL != new_answers) {
                                        answers = ConsesLow.append(answers, new_answers);
                                        doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                pred = csome_list_var.first();
                            }
                        }
                        if (include == lexicon_cache.$kw11$ALL && lexicon_cache.NIL == doneP && lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = lexicon_accessors.other_strings_of_wu(word, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt);
                            SubLObject other_string = (SubLObject)lexicon_cache.NIL;
                            other_string = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                if (lexicon_cache.NIL == subl_promotions.memberP(other_string, answers, lexicon_cache.$sowu_eq_test$.getGlobalValue(), (SubLObject)lexicon_cache.$sym33$REGULAR_GENERATION_ANSWER_STRING)) {
                                    answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(other_string, lexicon_vars.$top_level_nl_pred$.getGlobalValue()), answers);
                                    doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                }
                                csome_list_var = csome_list_var.rest();
                                other_string = csome_list_var.first();
                            }
                        }
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$33, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$32, thread);
            }
        }
        finally {
            lexicon_cache.$within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread), lexicon_cache.$sowu_include_supportsP$.getDynamicValue(thread), lexicon_cache.$within_regular_generation_internalsP$.getDynamicValue(thread), respect_orderP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11096L)
    public static SubLObject sosowp_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        if (lexicon_cache.NIL == include) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL == exceptions) {
            return include;
        }
        return sosowp_do_filter_exceptions(include, exceptions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
    public static SubLObject clear_sosowp_do_filter_exceptions() {
        final SubLObject cs = lexicon_cache.$sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
        if (lexicon_cache.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
    public static SubLObject remove_sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        return memoization_state.caching_state_remove_function_results_with_args(lexicon_cache.$sosowp_do_filter_exceptions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(include, exceptions), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
    public static SubLObject sosowp_do_filter_exceptions_internal(final SubLObject include, final SubLObject exceptions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), thread);
            final SubLObject all_include = Sequences.delete_duplicates(list_utilities.flatten(Mapping.mapcar((SubLObject)lexicon_cache.$sym36$ALL_SPEC_PREDICATES, include)), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
            SubLObject filtered_include = (SubLObject)lexicon_cache.NIL;
            SubLObject cdolist_list_var = all_include;
            SubLObject include_pred = (SubLObject)lexicon_cache.NIL;
            include_pred = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                if (lexicon_cache.NIL == lexicon_accessors.speech_part_pred_max_floors((SubLObject)ConsesLow.cons(include_pred, exceptions), (SubLObject)lexicon_cache.UNPROVIDED)) {
                    final SubLObject item_var = include_pred;
                    if (lexicon_cache.NIL == conses_high.member(item_var, filtered_include, Symbols.symbol_function((SubLObject)lexicon_cache.EQL), Symbols.symbol_function((SubLObject)lexicon_cache.IDENTITY))) {
                        filtered_include = (SubLObject)ConsesLow.cons(item_var, filtered_include);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                include_pred = cdolist_list_var.first();
            }
            ans = sosowp_remove_spec_preds(filtered_include, (SubLObject)lexicon_cache.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11434L)
    public static SubLObject sosowp_do_filter_exceptions(final SubLObject include, final SubLObject exceptions) {
        SubLObject caching_state = lexicon_cache.$sosowp_do_filter_exceptions_caching_state$.getGlobalValue();
        if (lexicon_cache.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)lexicon_cache.$sym34$SOSOWP_DO_FILTER_EXCEPTIONS, (SubLObject)lexicon_cache.$sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.SIXTEEN_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(include, exceptions);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_cache.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (include.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_cache.NIL != cached_args && lexicon_cache.NIL == cached_args.rest() && exceptions.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sosowp_do_filter_exceptions_internal(include, exceptions)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(include, exceptions));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 11935L)
    public static SubLObject sosowp_remove_spec_preds(final SubLObject preds, SubLObject key) {
        if (key == lexicon_cache.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)lexicon_cache.IDENTITY);
        }
        if (!preds.isList()) {
            return (SubLObject)lexicon_cache.NIL;
        }
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)lexicon_cache.NIL;
        pred = cdolist_list_var.first();
        while (lexicon_cache.NIL != cdolist_list_var) {
            final SubLObject others = Sequences.remove(pred, preds, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
            if (lexicon_cache.NIL == subl_promotions.memberP(Functions.funcall(key, pred), others, (SubLObject)lexicon_cache.$sym38$GENL_PRED_, key)) {
                ans = (SubLObject)ConsesLow.cons(pred, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12631L)
    public static SubLObject sosowp_repeated_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_cache.$sosowp_repeated_argsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12706L)
    public static SubLObject sosowp_top_levelP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.numLE(set.set_size(lexicon_cache.$sosowp_done_args$.getDynamicValue(thread)), (SubLObject)lexicon_cache.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 12790L)
    public static SubLObject higher_asserted_entry_for_wuP(final SubLObject pred, final SubLObject wu, SubLObject mt_info) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != kb_indexing_datastructures.indexed_term_p(wu)) {
            if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                    if (lexicon_cache.NIL == ans) {
                        SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                        SubLObject genl_pred = (SubLObject)lexicon_cache.NIL;
                        genl_pred = csome_list_var.first();
                        while (lexicon_cache.NIL == ans && lexicon_cache.NIL != csome_list_var) {
                            if (lexicon_cache.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                ans = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            genl_pred = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                    if (lexicon_cache.NIL == ans) {
                        SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                        SubLObject genl_pred = (SubLObject)lexicon_cache.NIL;
                        genl_pred = csome_list_var.first();
                        while (lexicon_cache.NIL == ans && lexicon_cache.NIL != csome_list_var) {
                            if (lexicon_cache.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                ans = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            genl_pred = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                    if (lexicon_cache.NIL == ans) {
                        SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                        SubLObject genl_pred = (SubLObject)lexicon_cache.NIL;
                        genl_pred = csome_list_var.first();
                        while (lexicon_cache.NIL == ans && lexicon_cache.NIL != csome_list_var) {
                            if (lexicon_cache.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                ans = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            genl_pred = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                    if (lexicon_cache.NIL == ans) {
                        SubLObject csome_list_var = all_genl_lexicon_preds(pred, mt_info);
                        SubLObject genl_pred = (SubLObject)lexicon_cache.NIL;
                        genl_pred = csome_list_var.first();
                        while (lexicon_cache.NIL == ans && lexicon_cache.NIL != csome_list_var) {
                            if (lexicon_cache.NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(wu, genl_pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED)) {
                                ans = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            genl_pred = csome_list_var.first();
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13281L)
    public static SubLObject all_genl_lexicon_preds_internal(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                ans = Sort.sort(genl_predicates.all_genl_preds(pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)lexicon_cache.$sym45$_), (SubLObject)lexicon_cache.$sym46$NUM_PREDICATE_EXTENT_INDEX);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                ans = Sort.sort(genl_predicates.all_genl_preds(pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)lexicon_cache.$sym45$_), (SubLObject)lexicon_cache.$sym46$NUM_PREDICATE_EXTENT_INDEX);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                ans = Sort.sort(genl_predicates.all_genl_preds(pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)lexicon_cache.$sym45$_), (SubLObject)lexicon_cache.$sym46$NUM_PREDICATE_EXTENT_INDEX);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                ans = Sort.sort(genl_predicates.all_genl_preds(pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED), Symbols.symbol_function((SubLObject)lexicon_cache.$sym45$_), (SubLObject)lexicon_cache.$sym46$NUM_PREDICATE_EXTENT_INDEX);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13281L)
    public static SubLObject all_genl_lexicon_preds(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL == v_memoization_state) {
            return all_genl_lexicon_preds_internal(pred, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_cache.$sym44$ALL_GENL_LEXICON_PREDS, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_cache.$sym44$ALL_GENL_LEXICON_PREDS, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.$int47$64, (SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_cache.$sym44$ALL_GENL_LEXICON_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_cache.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lexicon_cache.NIL != cached_args && lexicon_cache.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_genl_lexicon_preds_internal(pred, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13540L)
    public static SubLObject with_sosowp_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject args = (SubLObject)lexicon_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_cache.$list48);
        args = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym49$PROGN, (SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym50$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym51$NEW_ARGS_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_cache.$sym52$SET_ADD, args, (SubLObject)lexicon_cache.$list53)), (SubLObject)lexicon_cache.$list54), reader.bq_cons((SubLObject)lexicon_cache.$sym55$CUNWIND_PROTECT, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym56$PWHEN, (SubLObject)lexicon_cache.$sym51$NEW_ARGS_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_cache.$sym57$SET_REMOVE, args, (SubLObject)lexicon_cache.$list53)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13970L)
    public static SubLObject string_or_strings_of_wordXpred_internal(SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)lexicon_cache.UNPROVIDED);
        }
        if (first_onlyP == lexicon_cache.UNPROVIDED) {
            first_onlyP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == lexicon_cache.UNPROVIDED) {
            include_supportsP = lexicon_cache.$sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == lexicon_cache.UNPROVIDED) {
            within_regular_generation_internalsP = lexicon_cache.$within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == lexicon_cache.UNPROVIDED) {
            respect_orderP = lexicon_cache.$sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_cache.NIL != el_utilities.possibly_naut_p(word)) {
            final SubLObject nart = narts_high.find_nart(word);
            word = ((lexicon_cache.NIL != nart) ? nart : word);
        }
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        final SubLObject _prev_bind_0 = lexicon_cache.$within_regular_generation_internalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
        try {
            lexicon_cache.$within_regular_generation_internalsP$.bind((SubLObject)lexicon_cache.T, thread);
            pred_relevance_macros.$relevant_pred_function$.bind((SubLObject)lexicon_cache.$sym59$RELEVANT_PRED_IS_EVERYTHING, thread);
            if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0_$35 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                    answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread), lexicon_cache.$sowu_eq_test$.getGlobalValue());
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$36, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$35, thread);
                }
            }
            else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0_$36 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$37 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                    answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread), lexicon_cache.$sowu_eq_test$.getGlobalValue());
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$37, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$36, thread);
                }
            }
            else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
                final SubLObject _prev_bind_0_$37 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$38 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                    answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread), lexicon_cache.$sowu_eq_test$.getGlobalValue());
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$38, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$37, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$39 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                    answers = sosowp_int(word, pred, mt_info, first_onlyP, include_supportsP, lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread), lexicon_cache.$sowu_eq_test$.getGlobalValue());
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$39, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$38, thread);
                }
            }
        }
        finally {
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
            lexicon_cache.$within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 13970L)
    public static SubLObject string_or_strings_of_wordXpred(final SubLObject word, final SubLObject pred, SubLObject mt_info, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)lexicon_cache.UNPROVIDED);
        }
        if (first_onlyP == lexicon_cache.UNPROVIDED) {
            first_onlyP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == lexicon_cache.UNPROVIDED) {
            include_supportsP = lexicon_cache.$sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == lexicon_cache.UNPROVIDED) {
            within_regular_generation_internalsP = lexicon_cache.$within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == lexicon_cache.UNPROVIDED) {
            respect_orderP = lexicon_cache.$sowu_respect_orderP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL == v_memoization_state) {
            return string_or_strings_of_wordXpred_internal(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_cache.$sym58$STRING_OR_STRINGS_OF_WORD_PRED, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_cache.$sym58$STRING_OR_STRINGS_OF_WORD_PRED, (SubLObject)lexicon_cache.SEVEN_INTEGER, (SubLObject)lexicon_cache.$int60$1000, (SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_cache.$sym58$STRING_OR_STRINGS_OF_WORD_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_cache.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (first_onlyP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (include_supportsP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (within_regular_generation_internalsP.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (lexicon_cache.NIL != cached_args && lexicon_cache.NIL == cached_args.rest() && respect_orderP.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(string_or_strings_of_wordXpred_internal(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word, pred, mt_info, first_onlyP, include_supportsP, within_regular_generation_internalsP, respect_orderP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15088L)
    public static SubLObject make_regular_generation_answer(final SubLObject string, SubLObject pred, SubLObject supports) {
        if (pred == lexicon_cache.UNPROVIDED) {
            pred = (SubLObject)lexicon_cache.NIL;
        }
        if (supports == lexicon_cache.UNPROVIDED) {
            supports = (SubLObject)lexicon_cache.NIL;
        }
        return ConsesLow.append((SubLObject)ConsesLow.list(string, pred), supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15215L)
    public static SubLObject regular_generation_answer_string(final SubLObject v_answer) {
        return v_answer.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15298L)
    public static SubLObject regular_generation_answer_pred(final SubLObject v_answer) {
        return conses_high.second(v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15380L)
    public static SubLObject regular_generation_answer_supports(final SubLObject v_answer) {
        return v_answer.rest().rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15471L)
    public static SubLObject regular_generation_answer_string_plus_supports(final SubLObject v_answer) {
        SubLObject string = (SubLObject)lexicon_cache.NIL;
        SubLObject pred = (SubLObject)lexicon_cache.NIL;
        SubLObject supports = (SubLObject)lexicon_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_answer, v_answer, (SubLObject)lexicon_cache.$list61);
        string = v_answer.first();
        SubLObject current = v_answer.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, v_answer, (SubLObject)lexicon_cache.$list61);
        pred = current.first();
        current = (supports = current.rest());
        return (SubLObject)ConsesLow.cons(string, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 15652L)
    public static SubLObject extract_regular_generation_answer_type(final SubLObject answers, SubLObject first_onlyP, SubLObject include_supportsP, SubLObject within_regular_generation_internalsP, SubLObject respect_orderP) {
        if (first_onlyP == lexicon_cache.UNPROVIDED) {
            first_onlyP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue();
        }
        if (include_supportsP == lexicon_cache.UNPROVIDED) {
            include_supportsP = lexicon_cache.$sowu_include_supportsP$.getDynamicValue();
        }
        if (within_regular_generation_internalsP == lexicon_cache.UNPROVIDED) {
            within_regular_generation_internalsP = lexicon_cache.$within_regular_generation_internalsP$.getDynamicValue();
        }
        if (respect_orderP == lexicon_cache.UNPROVIDED) {
            respect_orderP = (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL != within_regular_generation_internalsP) {
            return answers;
        }
        if (lexicon_cache.NIL != first_onlyP) {
            final SubLObject first_answer = answers.first();
            return Values.values(regular_generation_answer_string(first_answer), regular_generation_answer_pred(first_answer));
        }
        if (lexicon_cache.NIL != include_supportsP) {
            return Mapping.mapcar((SubLObject)lexicon_cache.$sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS, answers);
        }
        SubLObject strings = (SubLObject)lexicon_cache.NIL;
        SubLObject preds = (SubLObject)lexicon_cache.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)lexicon_cache.NIL;
        v_answer = cdolist_list_var.first();
        while (lexicon_cache.NIL != cdolist_list_var) {
            final SubLObject answer_string = regular_generation_answer_string(v_answer);
            if (lexicon_cache.NIL == subl_promotions.memberP(answer_string, strings, Symbols.symbol_function((SubLObject)lexicon_cache.EQUAL), (SubLObject)lexicon_cache.UNPROVIDED)) {
                strings = (SubLObject)ConsesLow.cons(answer_string, strings);
                preds = (SubLObject)ConsesLow.cons(regular_generation_answer_pred(v_answer), preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return (lexicon_cache.NIL != respect_orderP) ? Values.values(Sequences.nreverse(strings), Sequences.nreverse(preds)) : Values.values(strings, preds);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 16696L)
    public static SubLObject sosowp_int(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        final SubLObject new_argsP = set.set_add((SubLObject)ConsesLow.list(word, pred, mt_info), lexicon_cache.$sosowp_done_args$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = lexicon_cache.$sosowp_repeated_argsP$.currentBinding(thread);
        try {
            lexicon_cache.$sosowp_repeated_argsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$sosowp_repeated_argsP$.getDynamicValue(thread) || lexicon_cache.NIL == new_argsP), thread);
            try {
                answers = (SubLObject)((lexicon_cache.NIL != kb_indexing_datastructures.indexed_term_p(word)) ? sosowp_int_via_index_surfing(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test) : lexicon_cache.NIL);
            }
            finally {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (lexicon_cache.NIL != new_argsP) {
                        set.set_remove((SubLObject)ConsesLow.list(word, pred, mt_info), lexicon_cache.$sosowp_done_args$.getDynamicValue(thread));
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        }
        finally {
            lexicon_cache.$sosowp_repeated_argsP$.rebind(_prev_bind_0, thread);
        }
        answers = Mapping.mapcar((SubLObject)lexicon_cache.$sym63$SOSOWP_INT_ANSWER_TO_UTF8, answers);
        if (lexicon_cache.NIL == first_onlyP) {
            answers = Sequences.delete_duplicates(answers, Symbols.symbol_function((SubLObject)lexicon_cache.EQUAL), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
            answers = sosowp_sort_answers(answers);
            answers = sosowp_remove_duplicate_strings(answers, test);
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 17541L)
    public static SubLObject sosowp_int_answer_to_utf8(final SubLObject v_answer) {
        return ConsesLow.rplaca(v_answer, cycl_string.cycl_string_to_utf8_string(v_answer.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 17662L)
    public static SubLObject sosowp_int_via_inference(final SubLObject word, final SubLObject pred, final SubLObject mt, final SubLObject first_onlyP, final SubLObject include_supportsP) {
        final SubLObject string_var = (SubLObject)lexicon_cache.$sym64$_STRING;
        final SubLObject pred_var = (SubLObject)lexicon_cache.$sym65$_PRED;
        final SubLObject exhaustiveP = (SubLObject)lexicon_cache.NIL;
        final SubLObject query_properties = (SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$kw66$MAX_TRANSFORMATION_DEPTH, (SubLObject)lexicon_cache.THREE_INTEGER, (SubLObject)lexicon_cache.$kw67$MAX_NUMBER, (SubLObject)((lexicon_cache.NIL != first_onlyP || lexicon_cache.NIL == exhaustiveP) ? lexicon_cache.ONE_INTEGER : lexicon_cache.NIL), (SubLObject)lexicon_cache.$kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL, (SubLObject)lexicon_cache.$kw69$NONE, (SubLObject)lexicon_cache.$kw70$RETURN, (SubLObject)((lexicon_cache.NIL != include_supportsP) ? lexicon_cache.$kw71$BINDINGS_AND_SUPPORTS : lexicon_cache.$kw72$BINDINGS));
        final SubLObject query_sentence = (SubLObject)ConsesLow.list(lexicon_cache.$const73$and, (SubLObject)ConsesLow.list(pred_var, word, string_var), (SubLObject)ConsesLow.list(lexicon_cache.$const26$genlPreds, pred_var, pred));
        final SubLObject query_results = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject query_result = (SubLObject)lexicon_cache.NIL;
        query_result = cdolist_list_var.first();
        while (lexicon_cache.NIL != cdolist_list_var) {
            final SubLObject v_bindings = (lexicon_cache.NIL != include_supportsP) ? query_result.first() : query_result;
            final SubLObject supports = (SubLObject)((lexicon_cache.NIL != include_supportsP) ? conses_high.second(query_result) : lexicon_cache.NIL);
            final SubLObject result_string = bindings.variable_lookup(string_var, v_bindings);
            final SubLObject result_pred = bindings.variable_lookup(pred_var, v_bindings);
            if (result_string.isString() && lexicon_cache.NIL != result_pred) {
                answers = (SubLObject)ConsesLow.cons(make_regular_generation_answer(result_string, result_pred, supports), answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            query_result = cdolist_list_var.first();
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 18788L)
    public static SubLObject sosowp_int_via_index_surfing(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject answers = sosowp_int_this_pred(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP);
        SubLObject doneP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        doneP = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != doneP || lexicon_cache.NIL != sosowp_repeated_argsP());
        if (lexicon_cache.NIL == doneP) {
            if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                    final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                    answers = ConsesLow.append(answers, spec_pred_answers);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                    final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                    answers = ConsesLow.append(answers, spec_pred_answers);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                    final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                    answers = ConsesLow.append(answers, spec_pred_answers);
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                    final SubLObject spec_pred_answers = sosowp_int_spec_preds(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                    answers = ConsesLow.append(answers, spec_pred_answers);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19439L)
    public static SubLObject sosowp_remove_duplicate_strings(final SubLObject answers, final SubLObject test) {
        return list_utilities.remove_duplicates_from_end(answers, test, Symbols.symbol_function((SubLObject)lexicon_cache.$sym74$FIRST), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19562L)
    public static SubLObject sosowp_int_spec_preds_internal(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject doneP = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = spec_preds;
                    SubLObject spec_pred = (SubLObject)lexicon_cache.NIL;
                    spec_pred = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(spec_pred, (SubLObject)lexicon_cache.UNPROVIDED)) {
                            SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            if (lexicon_cache.NIL != spec_pred_answers) {
                                if (lexicon_cache.NIL != lexicon_cache.$sowu_include_supportsP$.getDynamicValue(thread) && lexicon_cache.NIL != sosowp_top_levelP()) {
                                    SubLObject enhanced_answers = (SubLObject)lexicon_cache.NIL;
                                    SubLObject cdolist_list_var = spec_pred_answers;
                                    SubLObject v_answer = (SubLObject)lexicon_cache.NIL;
                                    v_answer = cdolist_list_var.first();
                                    while (lexicon_cache.NIL != cdolist_list_var) {
                                        enhanced_answers = (SubLObject)ConsesLow.cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_answer = cdolist_list_var.first();
                                    }
                                    spec_pred_answers = Sequences.nreverse(enhanced_answers);
                                }
                                if (lexicon_cache.NIL != first_onlyP) {
                                    answers = spec_pred_answers;
                                    doneP = (SubLObject)lexicon_cache.T;
                                }
                                else {
                                    answers = ConsesLow.append(answers, spec_pred_answers);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        spec_pred = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = spec_preds;
                    SubLObject spec_pred = (SubLObject)lexicon_cache.NIL;
                    spec_pred = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(spec_pred, (SubLObject)lexicon_cache.UNPROVIDED)) {
                            SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            if (lexicon_cache.NIL != spec_pred_answers) {
                                if (lexicon_cache.NIL != lexicon_cache.$sowu_include_supportsP$.getDynamicValue(thread) && lexicon_cache.NIL != sosowp_top_levelP()) {
                                    SubLObject enhanced_answers = (SubLObject)lexicon_cache.NIL;
                                    SubLObject cdolist_list_var = spec_pred_answers;
                                    SubLObject v_answer = (SubLObject)lexicon_cache.NIL;
                                    v_answer = cdolist_list_var.first();
                                    while (lexicon_cache.NIL != cdolist_list_var) {
                                        enhanced_answers = (SubLObject)ConsesLow.cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_answer = cdolist_list_var.first();
                                    }
                                    spec_pred_answers = Sequences.nreverse(enhanced_answers);
                                }
                                if (lexicon_cache.NIL != first_onlyP) {
                                    answers = spec_pred_answers;
                                    doneP = (SubLObject)lexicon_cache.T;
                                }
                                else {
                                    answers = ConsesLow.append(answers, spec_pred_answers);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        spec_pred = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = spec_preds;
                    SubLObject spec_pred = (SubLObject)lexicon_cache.NIL;
                    spec_pred = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(spec_pred, (SubLObject)lexicon_cache.UNPROVIDED)) {
                            SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            if (lexicon_cache.NIL != spec_pred_answers) {
                                if (lexicon_cache.NIL != lexicon_cache.$sowu_include_supportsP$.getDynamicValue(thread) && lexicon_cache.NIL != sosowp_top_levelP()) {
                                    SubLObject enhanced_answers = (SubLObject)lexicon_cache.NIL;
                                    SubLObject cdolist_list_var = spec_pred_answers;
                                    SubLObject v_answer = (SubLObject)lexicon_cache.NIL;
                                    v_answer = cdolist_list_var.first();
                                    while (lexicon_cache.NIL != cdolist_list_var) {
                                        enhanced_answers = (SubLObject)ConsesLow.cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_answer = cdolist_list_var.first();
                                    }
                                    spec_pred_answers = Sequences.nreverse(enhanced_answers);
                                }
                                if (lexicon_cache.NIL != first_onlyP) {
                                    answers = spec_pred_answers;
                                    doneP = (SubLObject)lexicon_cache.T;
                                }
                                else {
                                    answers = ConsesLow.append(answers, spec_pred_answers);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        spec_pred = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                final SubLObject spec_preds = sosowp_immediate_spec_preds_for_word(pred, word);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = spec_preds;
                    SubLObject spec_pred = (SubLObject)lexicon_cache.NIL;
                    spec_pred = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(spec_pred, (SubLObject)lexicon_cache.UNPROVIDED)) {
                            SubLObject spec_pred_answers = sosowp_int(word, spec_pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
                            if (lexicon_cache.NIL != spec_pred_answers) {
                                if (lexicon_cache.NIL != lexicon_cache.$sowu_include_supportsP$.getDynamicValue(thread) && lexicon_cache.NIL != sosowp_top_levelP()) {
                                    SubLObject enhanced_answers = (SubLObject)lexicon_cache.NIL;
                                    SubLObject cdolist_list_var = spec_pred_answers;
                                    SubLObject v_answer = (SubLObject)lexicon_cache.NIL;
                                    v_answer = cdolist_list_var.first();
                                    while (lexicon_cache.NIL != cdolist_list_var) {
                                        enhanced_answers = (SubLObject)ConsesLow.cons(make_regular_generation_answer(regular_generation_answer_string(v_answer), regular_generation_answer_pred(v_answer), (SubLObject)ConsesLow.cons(removal_module_utilities.make_genl_preds_support(regular_generation_answer_pred(v_answer), pred), regular_generation_answer_supports(v_answer))), enhanced_answers);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_answer = cdolist_list_var.first();
                                    }
                                    spec_pred_answers = Sequences.nreverse(enhanced_answers);
                                }
                                if (lexicon_cache.NIL != first_onlyP) {
                                    answers = spec_pred_answers;
                                    doneP = (SubLObject)lexicon_cache.T;
                                }
                                else {
                                    answers = ConsesLow.append(answers, spec_pred_answers);
                                }
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        spec_pred = csome_list_var.first();
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 19562L)
    public static SubLObject sosowp_int_spec_preds(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL == v_memoization_state) {
            return sosowp_int_spec_preds_internal(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_cache.$sym75$SOSOWP_INT_SPEC_PREDS, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_cache.$sym75$SOSOWP_INT_SPEC_PREDS, (SubLObject)lexicon_cache.SEVEN_INTEGER, (SubLObject)lexicon_cache.$int76$200, (SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_cache.$sym75$SOSOWP_INT_SPEC_PREDS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_cache.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (word.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt_info.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (first_onlyP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (include_supportsP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (use_morphologyP.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (lexicon_cache.NIL != cached_args && lexicon_cache.NIL == cached_args.rest() && test.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sosowp_int_spec_preds_internal(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(word, pred, mt_info, first_onlyP, include_supportsP, use_morphologyP, test));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 20835L)
    public static SubLObject sosowp_int_this_pred(final SubLObject word, final SubLObject pred, final SubLObject mt_info, final SubLObject first_onlyP, final SubLObject include_supportsP, final SubLObject use_morphologyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject doneP = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, (SubLObject)lexicon_cache.ONE_INTEGER, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                lookup_gafs = Sort.sort(lookup_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = lookup_gafs;
                    SubLObject gaf = (SubLObject)lexicon_cache.NIL;
                    gaf = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        final SubLObject string = assertions_high.gaf_arg2(gaf);
                        final SubLObject v_answer = (SubLObject)((lexicon_cache.NIL != include_supportsP) ? ConsesLow.list(string, pred, gaf) : ConsesLow.list(string, pred));
                        answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                        if (lexicon_cache.NIL != first_onlyP) {
                            doneP = (SubLObject)lexicon_cache.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    }
                }
                answers = Sequences.nreverse(answers);
                if (lexicon_cache.NIL == doneP) {
                    if (lexicon_cache.NIL == lookup_gafs && lexicon_cache.NIL != use_morphologyP) {
                        if (lexicon_cache.NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                            if (lexicon_cache.NIL != ((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED) : SubLObjectFactory.makeBoolean(lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED))) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                if (lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var = string_or_strings_of_wordXpred(word, lexicon_cache.$const84$infinitive, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject future_answer = (SubLObject)lexicon_cache.NIL;
                                    future_answer = csome_list_var.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                        if (lexicon_cache.NIL != future_answer) {
                                            final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                            final SubLObject helper = (SubLObject)((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt)) ? lexicon_cache.$str82$to_ : lexicon_cache.$str83$will_);
                                            final SubLObject future_string = Sequences.cconcatenate(helper, infinitive);
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(future_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        future_answer = csome_list_var.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != constant_handles.valid_constantP(perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                if (have_aux.isString() && lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, lexicon_cache.$const86$perfect, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject perfect_answer = (SubLObject)lexicon_cache.NIL;
                                    perfect_answer = csome_list_var2.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                        if (lexicon_cache.NIL != perfect_answer) {
                                            final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                            final SubLObject perfect_string = Sequences.cconcatenate(have_aux, new SubLObject[] { lexicon_cache.$str85$_, perfect_form });
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(perfect_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        perfect_answer = csome_list_var2.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == doneP) {
                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                SubLObject derived_answer = (SubLObject)lexicon_cache.NIL;
                                derived_answer = csome_list_var.first();
                                while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                    if (lexicon_cache.NIL != derived_answer) {
                                        answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                        doneP = first_onlyP;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    derived_answer = csome_list_var.first();
                                }
                            }
                        }
                    }
                }
                if (lexicon_cache.NIL == doneP && lexicon_cache.NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread)) {
                    SubLObject abbrev_gafs = (SubLObject)lexicon_cache.NIL;
                    final SubLObject pred_var = lexicon_cache.$const87$abbreviationForLexicalWord;
                    if (lexicon_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)lexicon_cache.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)lexicon_cache.NIL, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_cache.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_cache.NIL;
                        while (lexicon_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_cache.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_cache.$kw88$GAF, (SubLObject)lexicon_cache.$kw89$TRUE, (SubLObject)lexicon_cache.NIL);
                                    SubLObject done_var_$44 = (SubLObject)lexicon_cache.NIL;
                                    final SubLObject token_var_$45 = (SubLObject)lexicon_cache.NIL;
                                    while (lexicon_cache.NIL == done_var_$44) {
                                        final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$45);
                                        final SubLObject valid_$46 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$45.eql(abbrev_gaf));
                                        if (lexicon_cache.NIL != valid_$46) {
                                            final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                            if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                abbrev_gafs = (SubLObject)ConsesLow.cons(abbrev_gaf, abbrev_gafs);
                                            }
                                        }
                                        done_var_$44 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid_$46);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$47 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (lexicon_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid);
                        }
                    }
                    abbrev_gafs = Sort.sort(abbrev_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                    if (lexicon_cache.NIL == doneP) {
                        SubLObject csome_list_var3 = abbrev_gafs;
                        SubLObject gaf2 = (SubLObject)lexicon_cache.NIL;
                        gaf2 = csome_list_var3.first();
                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var3) {
                            final SubLObject string_arg = (SubLObject)lexicon_cache.THREE_INTEGER;
                            final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                            SubLObject v_answer2 = (SubLObject)ConsesLow.list(string2, pred);
                            if (lexicon_cache.NIL != include_supportsP) {
                                v_answer2 = ConsesLow.append(v_answer2, (SubLObject)ConsesLow.list(gaf2));
                            }
                            answers = (SubLObject)ConsesLow.cons(v_answer2, answers);
                            if (lexicon_cache.NIL != first_onlyP) {
                                doneP = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            gaf2 = csome_list_var3.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, (SubLObject)lexicon_cache.ONE_INTEGER, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                lookup_gafs = Sort.sort(lookup_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = lookup_gafs;
                    SubLObject gaf = (SubLObject)lexicon_cache.NIL;
                    gaf = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        final SubLObject string = assertions_high.gaf_arg2(gaf);
                        final SubLObject v_answer = (SubLObject)((lexicon_cache.NIL != include_supportsP) ? ConsesLow.list(string, pred, gaf) : ConsesLow.list(string, pred));
                        answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                        if (lexicon_cache.NIL != first_onlyP) {
                            doneP = (SubLObject)lexicon_cache.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    }
                }
                answers = Sequences.nreverse(answers);
                if (lexicon_cache.NIL == doneP) {
                    if (lexicon_cache.NIL == lookup_gafs && lexicon_cache.NIL != use_morphologyP) {
                        if (lexicon_cache.NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                            if (lexicon_cache.NIL != ((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED) : SubLObjectFactory.makeBoolean(lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED))) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                if (lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var = string_or_strings_of_wordXpred(word, lexicon_cache.$const84$infinitive, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject future_answer = (SubLObject)lexicon_cache.NIL;
                                    future_answer = csome_list_var.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                        if (lexicon_cache.NIL != future_answer) {
                                            final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                            final SubLObject helper = (SubLObject)((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt)) ? lexicon_cache.$str82$to_ : lexicon_cache.$str83$will_);
                                            final SubLObject future_string = Sequences.cconcatenate(helper, infinitive);
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(future_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        future_answer = csome_list_var.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != constant_handles.valid_constantP(perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                if (have_aux.isString() && lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, lexicon_cache.$const86$perfect, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject perfect_answer = (SubLObject)lexicon_cache.NIL;
                                    perfect_answer = csome_list_var2.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                        if (lexicon_cache.NIL != perfect_answer) {
                                            final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                            final SubLObject perfect_string = Sequences.cconcatenate(have_aux, new SubLObject[] { lexicon_cache.$str85$_, perfect_form });
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(perfect_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        perfect_answer = csome_list_var2.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == doneP) {
                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                SubLObject derived_answer = (SubLObject)lexicon_cache.NIL;
                                derived_answer = csome_list_var.first();
                                while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                    if (lexicon_cache.NIL != derived_answer) {
                                        answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                        doneP = first_onlyP;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    derived_answer = csome_list_var.first();
                                }
                            }
                        }
                    }
                }
                if (lexicon_cache.NIL == doneP && lexicon_cache.NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread)) {
                    SubLObject abbrev_gafs = (SubLObject)lexicon_cache.NIL;
                    final SubLObject pred_var = lexicon_cache.$const87$abbreviationForLexicalWord;
                    if (lexicon_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)lexicon_cache.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)lexicon_cache.NIL, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_cache.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_cache.NIL;
                        while (lexicon_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_cache.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_cache.$kw88$GAF, (SubLObject)lexicon_cache.$kw89$TRUE, (SubLObject)lexicon_cache.NIL);
                                    SubLObject done_var_$45 = (SubLObject)lexicon_cache.NIL;
                                    final SubLObject token_var_$46 = (SubLObject)lexicon_cache.NIL;
                                    while (lexicon_cache.NIL == done_var_$45) {
                                        final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                        final SubLObject valid_$47 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$46.eql(abbrev_gaf));
                                        if (lexicon_cache.NIL != valid_$47) {
                                            final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                            if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                abbrev_gafs = (SubLObject)ConsesLow.cons(abbrev_gaf, abbrev_gafs);
                                            }
                                        }
                                        done_var_$45 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid_$47);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$48 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (lexicon_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid);
                        }
                    }
                    abbrev_gafs = Sort.sort(abbrev_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                    if (lexicon_cache.NIL == doneP) {
                        SubLObject csome_list_var3 = abbrev_gafs;
                        SubLObject gaf2 = (SubLObject)lexicon_cache.NIL;
                        gaf2 = csome_list_var3.first();
                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var3) {
                            final SubLObject string_arg = (SubLObject)lexicon_cache.THREE_INTEGER;
                            final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                            SubLObject v_answer2 = (SubLObject)ConsesLow.list(string2, pred);
                            if (lexicon_cache.NIL != include_supportsP) {
                                v_answer2 = ConsesLow.append(v_answer2, (SubLObject)ConsesLow.list(gaf2));
                            }
                            answers = (SubLObject)ConsesLow.cons(v_answer2, answers);
                            if (lexicon_cache.NIL != first_onlyP) {
                                doneP = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            gaf2 = csome_list_var3.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, (SubLObject)lexicon_cache.ONE_INTEGER, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                lookup_gafs = Sort.sort(lookup_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = lookup_gafs;
                    SubLObject gaf = (SubLObject)lexicon_cache.NIL;
                    gaf = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        final SubLObject string = assertions_high.gaf_arg2(gaf);
                        final SubLObject v_answer = (SubLObject)((lexicon_cache.NIL != include_supportsP) ? ConsesLow.list(string, pred, gaf) : ConsesLow.list(string, pred));
                        answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                        if (lexicon_cache.NIL != first_onlyP) {
                            doneP = (SubLObject)lexicon_cache.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    }
                }
                answers = Sequences.nreverse(answers);
                if (lexicon_cache.NIL == doneP) {
                    if (lexicon_cache.NIL == lookup_gafs && lexicon_cache.NIL != use_morphologyP) {
                        if (lexicon_cache.NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                            if (lexicon_cache.NIL != ((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED) : SubLObjectFactory.makeBoolean(lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED))) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                if (lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var = string_or_strings_of_wordXpred(word, lexicon_cache.$const84$infinitive, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject future_answer = (SubLObject)lexicon_cache.NIL;
                                    future_answer = csome_list_var.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                        if (lexicon_cache.NIL != future_answer) {
                                            final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                            final SubLObject helper = (SubLObject)((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt)) ? lexicon_cache.$str82$to_ : lexicon_cache.$str83$will_);
                                            final SubLObject future_string = Sequences.cconcatenate(helper, infinitive);
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(future_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        future_answer = csome_list_var.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != constant_handles.valid_constantP(perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                if (have_aux.isString() && lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, lexicon_cache.$const86$perfect, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject perfect_answer = (SubLObject)lexicon_cache.NIL;
                                    perfect_answer = csome_list_var2.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                        if (lexicon_cache.NIL != perfect_answer) {
                                            final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                            final SubLObject perfect_string = Sequences.cconcatenate(have_aux, new SubLObject[] { lexicon_cache.$str85$_, perfect_form });
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(perfect_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        perfect_answer = csome_list_var2.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == doneP) {
                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                SubLObject derived_answer = (SubLObject)lexicon_cache.NIL;
                                derived_answer = csome_list_var.first();
                                while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                    if (lexicon_cache.NIL != derived_answer) {
                                        answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                        doneP = first_onlyP;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    derived_answer = csome_list_var.first();
                                }
                            }
                        }
                    }
                }
                if (lexicon_cache.NIL == doneP && lexicon_cache.NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread)) {
                    SubLObject abbrev_gafs = (SubLObject)lexicon_cache.NIL;
                    final SubLObject pred_var = lexicon_cache.$const87$abbreviationForLexicalWord;
                    if (lexicon_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)lexicon_cache.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)lexicon_cache.NIL, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_cache.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_cache.NIL;
                        while (lexicon_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_cache.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_cache.$kw88$GAF, (SubLObject)lexicon_cache.$kw89$TRUE, (SubLObject)lexicon_cache.NIL);
                                    SubLObject done_var_$46 = (SubLObject)lexicon_cache.NIL;
                                    final SubLObject token_var_$47 = (SubLObject)lexicon_cache.NIL;
                                    while (lexicon_cache.NIL == done_var_$46) {
                                        final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$47);
                                        final SubLObject valid_$48 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$47.eql(abbrev_gaf));
                                        if (lexicon_cache.NIL != valid_$48) {
                                            final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                            if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                abbrev_gafs = (SubLObject)ConsesLow.cons(abbrev_gaf, abbrev_gafs);
                                            }
                                        }
                                        done_var_$46 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid_$48);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        if (lexicon_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid);
                        }
                    }
                    abbrev_gafs = Sort.sort(abbrev_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                    if (lexicon_cache.NIL == doneP) {
                        SubLObject csome_list_var3 = abbrev_gafs;
                        SubLObject gaf2 = (SubLObject)lexicon_cache.NIL;
                        gaf2 = csome_list_var3.first();
                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var3) {
                            final SubLObject string_arg = (SubLObject)lexicon_cache.THREE_INTEGER;
                            final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                            SubLObject v_answer2 = (SubLObject)ConsesLow.list(string2, pred);
                            if (lexicon_cache.NIL != include_supportsP) {
                                v_answer2 = ConsesLow.append(v_answer2, (SubLObject)ConsesLow.list(gaf2));
                            }
                            answers = (SubLObject)ConsesLow.cons(v_answer2, answers);
                            if (lexicon_cache.NIL != first_onlyP) {
                                doneP = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            gaf2 = csome_list_var3.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt_info, thread);
                SubLObject lookup_gafs = kb_mapping.gather_gaf_arg_index(word, (SubLObject)lexicon_cache.ONE_INTEGER, pred, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                lookup_gafs = Sort.sort(lookup_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                if (lexicon_cache.NIL == doneP) {
                    SubLObject csome_list_var = lookup_gafs;
                    SubLObject gaf = (SubLObject)lexicon_cache.NIL;
                    gaf = csome_list_var.first();
                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                        final SubLObject string = assertions_high.gaf_arg2(gaf);
                        final SubLObject v_answer = (SubLObject)((lexicon_cache.NIL != include_supportsP) ? ConsesLow.list(string, pred, gaf) : ConsesLow.list(string, pred));
                        answers = (SubLObject)ConsesLow.cons(v_answer, answers);
                        if (lexicon_cache.NIL != first_onlyP) {
                            doneP = (SubLObject)lexicon_cache.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    }
                }
                answers = Sequences.nreverse(answers);
                if (lexicon_cache.NIL == doneP) {
                    if (lexicon_cache.NIL == lookup_gafs && lexicon_cache.NIL != use_morphologyP) {
                        if (lexicon_cache.NIL == higher_asserted_entry_for_wuP(pred, word, mt_info)) {
                            if (lexicon_cache.NIL != ((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) ? lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const78$simpleFuture_Generic, (SubLObject)lexicon_cache.UNPROVIDED) : SubLObjectFactory.makeBoolean(lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const79$futureTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED))) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                if (lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var = string_or_strings_of_wordXpred(word, lexicon_cache.$const84$infinitive, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject future_answer = (SubLObject)lexicon_cache.NIL;
                                    future_answer = csome_list_var.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                        if (lexicon_cache.NIL != future_answer) {
                                            final SubLObject infinitive = regular_generation_answer_string(future_answer);
                                            final SubLObject helper = (SubLObject)((lexicon_cache.NIL != constant_handles.valid_constantP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const81$EnglishHeadlineParaphraseMt)) ? lexicon_cache.$str82$to_ : lexicon_cache.$str83$will_);
                                            final SubLObject future_string = Sequences.cconcatenate(helper, infinitive);
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(future_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        future_answer = csome_list_var.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != constant_handles.valid_constantP(perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != mt_relevance_macros.relevant_mtP(lexicon_cache.$const80$EnglishMt)) {
                                final SubLObject have_aux = perfect_english_have_aux_for_pred(pred);
                                if (have_aux.isString() && lexicon_cache.NIL == doneP) {
                                    SubLObject csome_list_var2 = string_or_strings_of_wordXpred(word, lexicon_cache.$const86$perfect, mt_info, first_onlyP, include_supportsP, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                    SubLObject perfect_answer = (SubLObject)lexicon_cache.NIL;
                                    perfect_answer = csome_list_var2.first();
                                    while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                        if (lexicon_cache.NIL != perfect_answer) {
                                            final SubLObject perfect_form = regular_generation_answer_string(perfect_answer);
                                            final SubLObject perfect_string = Sequences.cconcatenate(have_aux, new SubLObject[] { lexicon_cache.$str85$_, perfect_form });
                                            answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(perfect_string, pred), answers);
                                            doneP = first_onlyP;
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        perfect_answer = csome_list_var2.first();
                                    }
                                }
                            }
                            else if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == doneP) {
                                SubLObject csome_list_var = generate_regular_string_or_strings(word, pred, mt_info);
                                SubLObject derived_answer = (SubLObject)lexicon_cache.NIL;
                                derived_answer = csome_list_var.first();
                                while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                    if (lexicon_cache.NIL != derived_answer) {
                                        answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                        doneP = first_onlyP;
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    derived_answer = csome_list_var.first();
                                }
                            }
                        }
                    }
                }
                if (lexicon_cache.NIL == doneP && lexicon_cache.NIL != lexicon_vars.$use_lexical_abbreviationsP$.getDynamicValue(thread)) {
                    SubLObject abbrev_gafs = (SubLObject)lexicon_cache.NIL;
                    final SubLObject pred_var = lexicon_cache.$const87$abbreviationForLexicalWord;
                    if (lexicon_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(word, (SubLObject)lexicon_cache.NIL, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(word, (SubLObject)lexicon_cache.NIL, pred_var);
                        SubLObject done_var = (SubLObject)lexicon_cache.NIL;
                        final SubLObject token_var = (SubLObject)lexicon_cache.NIL;
                        while (lexicon_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (lexicon_cache.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)lexicon_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)lexicon_cache.$kw88$GAF, (SubLObject)lexicon_cache.$kw89$TRUE, (SubLObject)lexicon_cache.NIL);
                                    SubLObject done_var_$47 = (SubLObject)lexicon_cache.NIL;
                                    final SubLObject token_var_$48 = (SubLObject)lexicon_cache.NIL;
                                    while (lexicon_cache.NIL == done_var_$47) {
                                        final SubLObject abbrev_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$48);
                                        final SubLObject valid_$49 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$48.eql(abbrev_gaf));
                                        if (lexicon_cache.NIL != valid_$49) {
                                            final SubLObject term_phrases_constraint = assertions_high.gaf_arg2(abbrev_gaf);
                                            if (term_phrases_constraint.eql(pred) || term_phrases_constraint.eql(lexicon_accessors.pos_of_pred(pred))) {
                                                abbrev_gafs = (SubLObject)ConsesLow.cons(abbrev_gaf, abbrev_gafs);
                                            }
                                        }
                                        done_var_$47 = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid_$49);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                                        final SubLObject _values4 = Values.getValuesAsVector();
                                        if (lexicon_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values4);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL == valid);
                        }
                    }
                    abbrev_gafs = Sort.sort(abbrev_gafs, (SubLObject)lexicon_cache.$sym77$PREFER_LEXICAL_ASSERTION_, (SubLObject)lexicon_cache.UNPROVIDED);
                    if (lexicon_cache.NIL == doneP) {
                        SubLObject csome_list_var3 = abbrev_gafs;
                        SubLObject gaf2 = (SubLObject)lexicon_cache.NIL;
                        gaf2 = csome_list_var3.first();
                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var3) {
                            final SubLObject string_arg = (SubLObject)lexicon_cache.THREE_INTEGER;
                            final SubLObject string2 = assertions_high.gaf_arg(gaf2, string_arg);
                            SubLObject v_answer2 = (SubLObject)ConsesLow.list(string2, pred);
                            if (lexicon_cache.NIL != include_supportsP) {
                                v_answer2 = ConsesLow.append(v_answer2, (SubLObject)ConsesLow.list(gaf2));
                            }
                            answers = (SubLObject)ConsesLow.cons(v_answer2, answers);
                            if (lexicon_cache.NIL != first_onlyP) {
                                doneP = (SubLObject)lexicon_cache.T;
                            }
                            csome_list_var3 = csome_list_var3.rest();
                            gaf2 = csome_list_var3.first();
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(answers, doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 24351L)
    public static SubLObject perfect_english_have_aux_for_pred(final SubLObject pred) {
        if (pred.eql(lexicon_cache.$const90$futurePerfect_Universal)) {
            return (SubLObject)lexicon_cache.$str91$will_have;
        }
        if (pred.eql(lexicon_cache.$const92$pastPerfect_Universal)) {
            return (SubLObject)lexicon_cache.$str93$had;
        }
        if (pred.eql(lexicon_cache.$const94$firstPersonSg_PresentPerfect) || pred.eql(lexicon_cache.$const95$secondPersonSg_PresentPerfect) || pred.eql(lexicon_cache.$const96$pluralVerb_PresentPerfect)) {
            return (SubLObject)lexicon_cache.$str97$have;
        }
        if (pred.eql(lexicon_cache.$const98$thirdPersonSg_PresentPerfect)) {
            return (SubLObject)lexicon_cache.$str99$has;
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 24726L)
    public static SubLObject prefer_lexical_assertionP(final SubLObject as1, final SubLObject as2, SubLObject terseness) {
        if (terseness == lexicon_cache.UNPROVIDED) {
            terseness = (SubLObject)lexicon_cache.NIL;
        }
        final SubLObject gsa_pred = gen_string_assertion_pred_for_terseness(terseness);
        if (lexicon_cache.NIL == assertion_handles.assertion_p(as1)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL == assertion_handles.assertion_p(as2)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as1, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as2, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as2, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == somewhere_cache.some_pred_assertion_somewhereP(gsa_pred, as1, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL != somewhere_cache.some_pred_assertion_somewhereP(lexicon_cache.$const100$dispreferredLexification, as1, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == somewhere_cache.some_pred_assertion_somewhereP(lexicon_cache.$const100$dispreferredLexification, as2, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL != somewhere_cache.some_pred_assertion_somewhereP(lexicon_cache.$const100$dispreferredLexification, as2, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == somewhere_cache.some_pred_assertion_somewhereP(lexicon_cache.$const100$dispreferredLexification, as1, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != terseness && lexicon_cache.NIL != prefer_lexical_assertionP(as1, as2, (SubLObject)lexicon_cache.NIL)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != terseness && lexicon_cache.NIL != prefer_lexical_assertionP(as2, as1, (SubLObject)lexicon_cache.NIL)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        return prefer_lexical_assertion_sans_asserted_preferenceP(as1, as2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 25951L)
    public static SubLObject prefer_lexical_assertion_sans_asserted_preferenceP(final SubLObject as1, final SubLObject as2) {
        if (lexicon_cache.NIL != abbreviation_assertion_p(as2) && lexicon_cache.NIL == abbreviation_assertion_p(as1)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != abbreviation_assertion_p(as1) && lexicon_cache.NIL == abbreviation_assertion_p(as2)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.$kw101$MONOTONIC == assertions_high.assertion_strength(as1) && lexicon_cache.$kw102$DEFAULT == assertions_high.assertion_strength(as2)) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.$kw101$MONOTONIC == assertions_high.assertion_strength(as2) && lexicon_cache.$kw102$DEFAULT == assertions_high.assertion_strength(as1)) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL != cardinality_estimates.generality_estimateL(assertions_high.assertion_mt(as1), assertions_high.assertion_mt(as2))) {
            return (SubLObject)lexicon_cache.T;
        }
        if (lexicon_cache.NIL != cardinality_estimates.generality_estimateG(assertions_high.assertion_mt(as1), assertions_high.assertion_mt(as2))) {
            return (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL != assertions_high.asserted_assertionP(as1) && lexicon_cache.NIL == assertions_high.asserted_assertionP(as2)) {
            return (SubLObject)lexicon_cache.T;
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 26848L)
    public static SubLObject abbreviation_assertion_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != assertion_handles.assertion_p(v_object) && cycl_utilities.formula_arg0(v_object).eql(lexicon_cache.$const87$abbreviationForLexicalWord));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 26999L)
    public static SubLObject gen_string_assertion_pred_for_terseness(final SubLObject terseness) {
        if (terseness.eql((SubLObject)lexicon_cache.$kw103$TERSE)) {
            return lexicon_cache.$const104$genStringAssertion_Terse;
        }
        if (terseness.eql((SubLObject)lexicon_cache.$kw105$PRECISE)) {
            return lexicon_cache.$const106$genStringAssertion_Precise;
        }
        return lexicon_cache.$const107$genStringAssertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27243L)
    public static SubLObject sosowp_sort_answers(final SubLObject answers) {
        return Sort.sort(answers, (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, Symbols.symbol_function((SubLObject)lexicon_cache.$sym108$SECOND));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27341L)
    public static SubLObject sosowp_immediate_spec_preds_for_word(final SubLObject pred, final SubLObject word) {
        final SubLObject ans;
        final SubLObject all_immediate_spec_preds = ans = kb_mapping_utilities.pred_values_in_any_mt(pred, lexicon_cache.$const26$genlPreds, (SubLObject)lexicon_cache.TWO_INTEGER, (SubLObject)lexicon_cache.ONE_INTEGER, (SubLObject)lexicon_cache.UNPROVIDED);
        return Sort.sort(list_utilities.remove_if_not((SubLObject)lexicon_cache.$sym13$SPEECH_PART_PRED_, ans, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED), (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27706L)
    public static SubLObject prefer_pos_predP_internal(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const109$verbStrings, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const109$verbStrings, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = prefer_verbal_pos_predP(pred1, pred2, mt);
            }
            else if (lexicon_cache.NIL != lexicon_accessors.derived_predP(pred2, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == lexicon_accessors.derived_predP(pred1, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const110$simpleNounStrings, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const110$simpleNounStrings, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const111$plural_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const111$plural_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const112$singular_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const112$singular_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred2), lexicon_cache.$const113$ProperNoun, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL == lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred1), lexicon_cache.$const113$ProperNoun, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred1), lexicon_cache.$const114$CountNoun_Generic, (SubLObject)lexicon_cache.UNPROVIDED) && lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred2), lexicon_cache.$const115$MassNoun_Generic, (SubLObject)lexicon_cache.UNPROVIDED)) {
                ans = (SubLObject)lexicon_cache.T;
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 27706L)
    public static SubLObject prefer_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL == v_memoization_state) {
            return prefer_pos_predP_internal(pred1, pred2, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, (SubLObject)lexicon_cache.THREE_INTEGER, (SubLObject)lexicon_cache.$int116$400, (SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred1, pred2, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)lexicon_cache.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)lexicon_cache.NIL;
            collision = cdolist_list_var.first();
            while (lexicon_cache.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pred2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (lexicon_cache.NIL != cached_args && lexicon_cache.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(prefer_pos_predP_internal(pred1, pred2, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred1, pred2, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 28871L)
    public static SubLObject prefer_verbal_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred1_tensedP = lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const117$tensed, (SubLObject)lexicon_cache.UNPROVIDED);
            final SubLObject pred2_tensedP = lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const117$tensed, (SubLObject)lexicon_cache.UNPROVIDED);
            ans = (SubLObject)((lexicon_cache.NIL != pred1_tensedP) ? ((lexicon_cache.NIL != pred2_tensedP) ? prefer_tensed_pos_predP(pred1, pred2, mt) : lexicon_cache.NIL) : ((lexicon_cache.NIL != pred2_tensedP) ? lexicon_cache.T : prefer_non_tensed_pos_predP(pred1, pred2, mt)));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 29615L)
    public static SubLObject prefer_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)lexicon_cache.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred1_presentP = lexicon_accessors.genl_pos_predP(pred1, lexicon_cache.$const118$presentTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED);
            final SubLObject pred2_presentP = lexicon_accessors.genl_pos_predP(pred2, lexicon_cache.$const118$presentTense_Generic, (SubLObject)lexicon_cache.UNPROVIDED);
            if (lexicon_cache.NIL != pred1_presentP && lexicon_cache.NIL == pred2_presentP) {
                ans = (SubLObject)lexicon_cache.T;
            }
            else if (lexicon_cache.NIL != pred2_presentP && lexicon_cache.NIL == pred1_presentP) {
                ans = (SubLObject)lexicon_cache.NIL;
            }
            else {
                final SubLObject pred1_perfectP = lexicon_accessors.genl_pos_predP(pred1, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED);
                final SubLObject pred2_perfectP = lexicon_accessors.genl_pos_predP(pred2, perfect_aspect_pred(), (SubLObject)lexicon_cache.UNPROVIDED);
                if (lexicon_cache.NIL != pred1_perfectP && lexicon_cache.NIL == pred2_perfectP) {
                    ans = (SubLObject)lexicon_cache.NIL;
                }
                else if (lexicon_cache.NIL != pred2_perfectP && lexicon_cache.NIL == pred1_perfectP) {
                    ans = (SubLObject)lexicon_cache.T;
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 30774L)
    public static SubLObject prefer_non_tensed_pos_predP(final SubLObject pred1, final SubLObject pred2, SubLObject mt) {
        if (mt == lexicon_cache.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31594L)
    public static SubLObject grsos_repeated_argsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_cache.$grsos_repeated_argsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 31667L)
    public static SubLObject with_grsos_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject args = (SubLObject)lexicon_cache.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_cache.$list48);
        args = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym49$PROGN, (SubLObject)ConsesLow.listS((SubLObject)lexicon_cache.$sym50$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym51$NEW_ARGS_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_cache.$sym52$SET_ADD, args, (SubLObject)lexicon_cache.$list119)), (SubLObject)lexicon_cache.$list120), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_cache.$sym56$PWHEN, (SubLObject)lexicon_cache.$sym51$NEW_ARGS_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_cache.$sym57$SET_REMOVE, args, (SubLObject)lexicon_cache.$list119))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 32057L)
    public static SubLObject generate_regular_string_or_strings(final SubLObject wu, final SubLObject pred, SubLObject mt_info) {
        if (mt_info == lexicon_cache.UNPROVIDED) {
            mt_info = lexicon_vars.lexicon_lookup_mt_info();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject doneP = (SubLObject)lexicon_cache.NIL;
        SubLObject stop_recursionP = (SubLObject)lexicon_cache.NIL;
        final SubLObject new_argsP = set.set_add((SubLObject)ConsesLow.list(wu, pred, mt_info), lexicon_cache.$grsos_done_args$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = lexicon_cache.$within_regular_generation_internalsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_cache.$grsos_repeated_argsP$.currentBinding(thread);
        try {
            lexicon_cache.$within_regular_generation_internalsP$.bind((SubLObject)lexicon_cache.T, thread);
            lexicon_cache.$grsos_repeated_argsP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$grsos_repeated_argsP$.getDynamicValue(thread) || lexicon_cache.NIL == new_argsP), thread);
            if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING)) {
                final SubLObject _prev_bind_0_$60 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$61 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym39$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const40$EverythingPSC, thread);
                    if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), lexicon_cache.$const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                        final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                        final SubLObject base_string_answers = (SubLObject)((lexicon_cache.NIL != kb_utilities.kbeq(base_form, pred)) ? lexicon_cache.NIL : string_or_strings_of_wordXpred(wu, base_form, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = base_string_answers;
                            SubLObject base_answer = (SubLObject)lexicon_cache.NIL;
                            base_answer = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                final SubLObject base_string = regular_generation_answer_string(base_answer);
                                final SubLObject upcased_string = string_utilities.string_proper(base_string, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                answers = (SubLObject)ConsesLow.cons(upcased_answer, answers);
                                doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                csome_list_var = csome_list_var.rest();
                                base_answer = csome_list_var.first();
                            }
                        }
                    }
                    if (lexicon_cache.NIL != derived_modifier_predP(pred)) {
                        final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                        if (lexicon_cache.NIL != result) {
                            answers = ConsesLow.append(answers, result);
                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                        }
                    }
                    else if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (lexicon_cache.NIL != hlmt.hlmt_p(mt_info)) ? mt_info : lexicon_cache.$const42$InferencePSC)) {
                        if (lexicon_cache.NIL != grsos_repeated_argsP()) {
                            stop_recursionP = (SubLObject)lexicon_cache.T;
                        }
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                            SubLObject rule = (SubLObject)lexicon_cache.NIL;
                            rule = csome_list_var2.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                final SubLObject _prev_bind_0_$61 = lexicon_cache.$sowu_use_morphologyP$.currentBinding(thread);
                                try {
                                    lexicon_cache.$sowu_use_morphologyP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread) && lexicon_cache.NIL == stop_recursionP), thread);
                                    if (lexicon_cache.NIL == doneP) {
                                        SubLObject csome_list_var_$63 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                        SubLObject base_answer2 = (SubLObject)lexicon_cache.NIL;
                                        base_answer2 = csome_list_var_$63.first();
                                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var_$63) {
                                            final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                            final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                            final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                            final SubLObject supports = (SubLObject)((lexicon_cache.NIL != arguments.support_p(rule)) ? ConsesLow.cons(rule, base_supports) : base_supports);
                                            final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                            answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                            csome_list_var_$63 = csome_list_var_$63.rest();
                                            base_answer2 = csome_list_var_$63.first();
                                        }
                                    }
                                }
                                finally {
                                    lexicon_cache.$sowu_use_morphologyP$.rebind(_prev_bind_0_$61, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                rule = csome_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$61, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$60, thread);
                }
            }
            else if (lexicon_cache.NIL != mt_relevance_macros.mt_function_eq(mt_info, (SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym41$RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind(lexicon_cache.$const42$InferencePSC, thread);
                    if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), lexicon_cache.$const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                        final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                        final SubLObject base_string_answers = (SubLObject)((lexicon_cache.NIL != kb_utilities.kbeq(base_form, pred)) ? lexicon_cache.NIL : string_or_strings_of_wordXpred(wu, base_form, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = base_string_answers;
                            SubLObject base_answer = (SubLObject)lexicon_cache.NIL;
                            base_answer = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                final SubLObject base_string = regular_generation_answer_string(base_answer);
                                final SubLObject upcased_string = string_utilities.string_proper(base_string, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                answers = (SubLObject)ConsesLow.cons(upcased_answer, answers);
                                doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                csome_list_var = csome_list_var.rest();
                                base_answer = csome_list_var.first();
                            }
                        }
                    }
                    if (lexicon_cache.NIL != derived_modifier_predP(pred)) {
                        final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                        if (lexicon_cache.NIL != result) {
                            answers = ConsesLow.append(answers, result);
                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                        }
                    }
                    else if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (lexicon_cache.NIL != hlmt.hlmt_p(mt_info)) ? mt_info : lexicon_cache.$const42$InferencePSC)) {
                        if (lexicon_cache.NIL != grsos_repeated_argsP()) {
                            stop_recursionP = (SubLObject)lexicon_cache.T;
                        }
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                            SubLObject rule = (SubLObject)lexicon_cache.NIL;
                            rule = csome_list_var2.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                final SubLObject _prev_bind_0_$63 = lexicon_cache.$sowu_use_morphologyP$.currentBinding(thread);
                                try {
                                    lexicon_cache.$sowu_use_morphologyP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread) && lexicon_cache.NIL == stop_recursionP), thread);
                                    if (lexicon_cache.NIL == doneP) {
                                        SubLObject csome_list_var_$64 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                        SubLObject base_answer2 = (SubLObject)lexicon_cache.NIL;
                                        base_answer2 = csome_list_var_$64.first();
                                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var_$64) {
                                            final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                            final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                            final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                            final SubLObject supports = (SubLObject)((lexicon_cache.NIL != arguments.support_p(rule)) ? ConsesLow.cons(rule, base_supports) : base_supports);
                                            final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                            answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                            csome_list_var_$64 = csome_list_var_$64.rest();
                                            base_answer2 = csome_list_var_$64.first();
                                        }
                                    }
                                }
                                finally {
                                    lexicon_cache.$sowu_use_morphologyP$.rebind(_prev_bind_0_$63, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                rule = csome_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$62, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$62, thread);
                }
            }
            else if (lexicon_cache.NIL != hlmt.mt_union_naut_p(mt_info)) {
                final SubLObject _prev_bind_0_$64 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                    mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                    if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), lexicon_cache.$const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                        final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                        final SubLObject base_string_answers = (SubLObject)((lexicon_cache.NIL != kb_utilities.kbeq(base_form, pred)) ? lexicon_cache.NIL : string_or_strings_of_wordXpred(wu, base_form, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = base_string_answers;
                            SubLObject base_answer = (SubLObject)lexicon_cache.NIL;
                            base_answer = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                final SubLObject base_string = regular_generation_answer_string(base_answer);
                                final SubLObject upcased_string = string_utilities.string_proper(base_string, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                answers = (SubLObject)ConsesLow.cons(upcased_answer, answers);
                                doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                csome_list_var = csome_list_var.rest();
                                base_answer = csome_list_var.first();
                            }
                        }
                    }
                    if (lexicon_cache.NIL != derived_modifier_predP(pred)) {
                        final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                        if (lexicon_cache.NIL != result) {
                            answers = ConsesLow.append(answers, result);
                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                        }
                    }
                    else if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (lexicon_cache.NIL != hlmt.hlmt_p(mt_info)) ? mt_info : lexicon_cache.$const42$InferencePSC)) {
                        if (lexicon_cache.NIL != grsos_repeated_argsP()) {
                            stop_recursionP = (SubLObject)lexicon_cache.T;
                        }
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                            SubLObject rule = (SubLObject)lexicon_cache.NIL;
                            rule = csome_list_var2.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                final SubLObject _prev_bind_0_$65 = lexicon_cache.$sowu_use_morphologyP$.currentBinding(thread);
                                try {
                                    lexicon_cache.$sowu_use_morphologyP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread) && lexicon_cache.NIL == stop_recursionP), thread);
                                    if (lexicon_cache.NIL == doneP) {
                                        SubLObject csome_list_var_$65 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                        SubLObject base_answer2 = (SubLObject)lexicon_cache.NIL;
                                        base_answer2 = csome_list_var_$65.first();
                                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var_$65) {
                                            final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                            final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                            final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                            final SubLObject supports = (SubLObject)((lexicon_cache.NIL != arguments.support_p(rule)) ? ConsesLow.cons(rule, base_supports) : base_supports);
                                            final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                            answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                            csome_list_var_$65 = csome_list_var_$65.rest();
                                            base_answer2 = csome_list_var_$65.first();
                                        }
                                    }
                                }
                                finally {
                                    lexicon_cache.$sowu_use_morphologyP$.rebind(_prev_bind_0_$65, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                rule = csome_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$63, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$64, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0_$66 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$64 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)lexicon_cache.$sym35$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt_info, thread);
                    if (lexicon_cache.NIL != lexicon_accessors.genl_posP(lexicon_accessors.pos_of_pred(pred), lexicon_cache.$const113$ProperNoun, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                        final SubLObject base_form = lexicon_utilities.common_noun_form_of_pred(pred);
                        final SubLObject base_string_answers = (SubLObject)((lexicon_cache.NIL != kb_utilities.kbeq(base_form, pred)) ? lexicon_cache.NIL : string_or_strings_of_wordXpred(wu, base_form, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var = base_string_answers;
                            SubLObject base_answer = (SubLObject)lexicon_cache.NIL;
                            base_answer = csome_list_var.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                                final SubLObject base_string = regular_generation_answer_string(base_answer);
                                final SubLObject upcased_string = string_utilities.string_proper(base_string, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                final SubLObject upcased_answer = make_regular_generation_answer(upcased_string, pred, regular_generation_answer_supports(base_answer));
                                answers = (SubLObject)ConsesLow.cons(upcased_answer, answers);
                                doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                csome_list_var = csome_list_var.rest();
                                base_answer = csome_list_var.first();
                            }
                        }
                    }
                    if (lexicon_cache.NIL != derived_modifier_predP(pred)) {
                        final SubLObject result = generate_regular_modifier_string_or_strings(wu, pred, mt_info);
                        if (lexicon_cache.NIL != result) {
                            answers = ConsesLow.append(answers, result);
                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                        }
                    }
                    else if (lexicon_cache.NIL != lexicon_accessors.speech_part_predP(pred, (lexicon_cache.NIL != hlmt.hlmt_p(mt_info)) ? mt_info : lexicon_cache.$const42$InferencePSC)) {
                        if (lexicon_cache.NIL != grsos_repeated_argsP()) {
                            stop_recursionP = (SubLObject)lexicon_cache.T;
                        }
                        if (lexicon_cache.NIL == doneP) {
                            SubLObject csome_list_var2 = morphology.suffix_rules_for_pred(pred);
                            SubLObject rule = (SubLObject)lexicon_cache.NIL;
                            rule = csome_list_var2.first();
                            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var2) {
                                final SubLObject base_form2 = assertions_high.gaf_arg2(rule);
                                final SubLObject suffix = assertions_high.gaf_arg3(rule);
                                final SubLObject _prev_bind_0_$67 = lexicon_cache.$sowu_use_morphologyP$.currentBinding(thread);
                                try {
                                    lexicon_cache.$sowu_use_morphologyP$.bind((SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_cache.$sowu_use_morphologyP$.getDynamicValue(thread) && lexicon_cache.NIL == stop_recursionP), thread);
                                    if (lexicon_cache.NIL == doneP) {
                                        SubLObject csome_list_var_$66 = string_or_strings_of_wordXpred(wu, base_form2, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
                                        SubLObject base_answer2 = (SubLObject)lexicon_cache.NIL;
                                        base_answer2 = csome_list_var_$66.first();
                                        while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var_$66) {
                                            final SubLObject base_string2 = regular_generation_answer_string(base_answer2);
                                            final SubLObject base_supports = regular_generation_answer_supports(base_answer2);
                                            final SubLObject derived_string = morphology.add_english_suffix(base_string2, suffix);
                                            final SubLObject supports = (SubLObject)((lexicon_cache.NIL != arguments.support_p(rule)) ? ConsesLow.cons(rule, base_supports) : base_supports);
                                            final SubLObject derived_answer = make_regular_generation_answer(derived_string, pred, supports);
                                            answers = (SubLObject)ConsesLow.cons(derived_answer, answers);
                                            doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                                            csome_list_var_$66 = csome_list_var_$66.rest();
                                            base_answer2 = csome_list_var_$66.first();
                                        }
                                    }
                                }
                                finally {
                                    lexicon_cache.$sowu_use_morphologyP$.rebind(_prev_bind_0_$67, thread);
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                rule = csome_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$64, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$66, thread);
                }
            }
            if (lexicon_cache.NIL != new_argsP) {
                set.set_remove((SubLObject)ConsesLow.list(wu, pred, mt_info), lexicon_cache.$grsos_done_args$.getDynamicValue(thread));
            }
        }
        finally {
            lexicon_cache.$grsos_repeated_argsP$.rebind(_prev_bind_2, thread);
            lexicon_cache.$within_regular_generation_internalsP$.rebind(_prev_bind_0, thread);
        }
        return extract_regular_generation_answer_type(answers, lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread), (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 34800L)
    public static SubLObject generate_regular_modifier_string_or_strings(final SubLObject wu, final SubLObject pred, final SubLObject mt_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)lexicon_cache.NIL;
        SubLObject doneP = (SubLObject)lexicon_cache.NIL;
        final SubLObject base_pred = base_pred_for_derived_modifier_pred(pred);
        final SubLObject base_string_answers = string_or_strings_of_wordXpred(wu, base_pred, mt_info, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
        if (lexicon_cache.NIL == doneP) {
            SubLObject csome_list_var = base_string_answers;
            SubLObject base_answer = (SubLObject)lexicon_cache.NIL;
            base_answer = csome_list_var.first();
            while (lexicon_cache.NIL == doneP && lexicon_cache.NIL != csome_list_var) {
                final SubLObject base_string = regular_generation_answer_string(base_answer);
                final SubLObject inflected_string = morphology.generate_regular_string_from_form(pred, base_pred, base_string, mt_info);
                final SubLObject inflected_answer = ConsesLow.append((SubLObject)ConsesLow.list(inflected_string, pred), regular_generation_answer_supports(base_answer));
                answers = (SubLObject)ConsesLow.cons(inflected_answer, answers);
                doneP = lexicon_cache.$sowu_first_onlyP$.getDynamicValue(thread);
                csome_list_var = csome_list_var.rest();
                base_answer = csome_list_var.first();
            }
        }
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35587L)
    public static SubLObject derived_modifier_predP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_accessors.derived_predP(pred, (SubLObject)lexicon_cache.UNPROVIDED) && (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const121$adverbStrings, (SubLObject)lexicon_cache.UNPROVIDED) || lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const122$adjStrings, (SubLObject)lexicon_cache.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35760L)
    public static SubLObject base_pred_for_derived_modifier_pred(final SubLObject derived_pred) {
        if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(derived_pred, lexicon_cache.$const122$adjStrings, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return lexicon_cache.$const123$regularDegree;
        }
        if (lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(derived_pred, lexicon_cache.$const121$adverbStrings, (SubLObject)lexicon_cache.UNPROVIDED)) {
            return lexicon_cache.$const124$regularAdverb;
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 35990L)
    public static SubLObject modifier_form_blockedP(final SubLObject string, final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != modifier_form_has_noun_denotP(string) || (lexicon_cache.NIL != superlative_formP(pred) && lexicon_cache.NIL != superlative_form_lacks_corresponding_comparativeP(string, pred)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36401L)
    public static SubLObject modifier_form_has_noun_denotP(final SubLObject string) {
        return list_utilities.sublisp_boolean(lexicon_accessors.denots_of_stringXspeech_part(string, lexicon_cache.$const125$Noun, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36521L)
    public static SubLObject comparative_formP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const126$comparativeDegree, (SubLObject)lexicon_cache.UNPROVIDED) || lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const127$comparativeAdverb, (SubLObject)lexicon_cache.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36669L)
    public static SubLObject superlative_formP(final SubLObject pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const128$superlativeDegree, (SubLObject)lexicon_cache.UNPROVIDED) || lexicon_cache.NIL != lexicon_accessors.genl_pos_predP(pred, lexicon_cache.$const129$superlativeAdverb, (SubLObject)lexicon_cache.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 36817L)
    public static SubLObject superlative_form_lacks_corresponding_comparativeP(final SubLObject string, final SubLObject pred) {
        SubLObject blockedP = (SubLObject)lexicon_cache.NIL;
        if (lexicon_cache.NIL != kb_utilities.kbeq(pred, lexicon_cache.$const129$superlativeAdverb)) {
            blockedP = Types.sublisp_null(lexicon_accessors.words_of_stringXpred(morphology.add_english_suffix(string_utilities.post_remove(string, (SubLObject)lexicon_cache.$str130$est, (SubLObject)lexicon_cache.UNPROVIDED), (SubLObject)lexicon_cache.$str131$er), lexicon_cache.$const127$comparativeAdverb, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
        }
        else if (lexicon_cache.NIL != kb_utilities.kbeq(pred, lexicon_cache.$const128$superlativeDegree)) {
            blockedP = Types.sublisp_null(lexicon_accessors.words_of_stringXpred(morphology.add_english_suffix(string_utilities.post_remove(string, (SubLObject)lexicon_cache.$str130$est, (SubLObject)lexicon_cache.UNPROVIDED), (SubLObject)lexicon_cache.$str131$er), lexicon_cache.$const126$comparativeDegree, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED));
        }
        return blockedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 37724L)
    public static SubLObject initialize_lexicon_kb_feature() {
        if (lexicon_cache.NIL != list_utilities.every_in_list((SubLObject)lexicon_cache.$sym133$VALID_CONSTANT_, lexicon_cache.$lexicon_core_constants$.getGlobalValue(), (SubLObject)lexicon_cache.UNPROVIDED)) {
            kb_control_vars.set_lexicon_kb_loaded();
        }
        else {
            kb_control_vars.unset_lexicon_kb_loaded();
        }
        return kb_control_vars.lexicon_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38078L)
    public static SubLObject initialize_lexicon_modules() {
        initialize_lexicon();
        sme_lexification_wizard_accessors.init_sme_lexwiz();
        return (SubLObject)lexicon_cache.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38414L)
    public static SubLObject initialize_lexicon() {
        lexicon_accessors.clear_cached_lexical_access_functions();
        initialize_lexicon_lookup_mt();
        lexicon_vars.initialize_multi_word_preds();
        lexicon_vars.initialize_all_speech_part_preds();
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 38739L)
    public static SubLObject initialize_lexicon_lookup_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_cache.NIL != control_vars.kb_loaded()) {
            lexicon_vars.$lexicon_lookup_mt$.setDynamicValue((SubLObject)lexicon_cache.NIL, thread);
            if (lexicon_cache.NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread)) {
                SubLObject csome_list_var = (SubLObject)lexicon_cache.$list135;
                SubLObject mt_name = (SubLObject)lexicon_cache.NIL;
                mt_name = csome_list_var.first();
                while (lexicon_cache.NIL == lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread) && lexicon_cache.NIL != csome_list_var) {
                    final SubLObject mt = constants_high.find_constant(mt_name);
                    if (lexicon_cache.NIL != constant_handles.valid_constantP(mt, (SubLObject)lexicon_cache.UNPROVIDED)) {
                        final SubLObject anytime = hlmt_czer.canonicalize_hlmt(hlmt.new_hlmt((SubLObject)ConsesLow.list(mt, lexicon_cache.$const134$AnytimePSC)));
                        lexicon_vars.$lexicon_lookup_mt$.setDynamicValue((lexicon_cache.NIL != hlmt.valid_hlmt_p(anytime, (SubLObject)lexicon_cache.UNPROVIDED)) ? anytime : mt, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    mt_name = csome_list_var.first();
                }
            }
        }
        return lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 39277L)
    public static SubLObject initialize_lexicon_from_kb() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexicon_vars.initialize_all_speech_part_preds();
        final SubLObject nl_trie_rebuild_flag = (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != nl_trie.empty_nl_trieP((SubLObject)lexicon_cache.UNPROVIDED) || lexicon_cache.NIL != nl_trie_staleness_test.nl_trie_known_stale_p() || lexicon_cache.NIL != nl_trie_staleness_test.nl_trie_revisions_staleP());
        if (lexicon_cache.NIL != nl_trie_rebuild_flag) {
            nl_trie.initialize_nl_trie((SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
        }
        else {
            PrintLow.format((SubLObject)lexicon_cache.T, (SubLObject)lexicon_cache.$str136$Merely_validating_NL_trie_as_it_a);
            nl_trie.nl_trie_validate_all_entries();
        }
        if (lexicon_cache.NIL != lexicon_cache.$allow_nl_trie_rotation_initializationP$.getDynamicValue(thread) && (lexicon_cache.NIL != nl_trie_rebuild_flag || lexicon_cache.NIL == nl_trie_accessors.nl_trie_rotation_index_initializedP())) {
            nl_trie_accessors.force_nl_trie_rotation_index_initialization((SubLObject)lexicon_cache.UNPROVIDED);
        }
        else {
            PrintLow.format((SubLObject)lexicon_cache.T, (SubLObject)lexicon_cache.$str137$Skipping_initialization_of_NL_tri, (SubLObject)((lexicon_cache.NIL != lexicon_cache.$allow_nl_trie_rotation_initializationP$.getDynamicValue(thread)) ? lexicon_cache.$str138$needed : lexicon_cache.$str139$allowed));
        }
        control_vars.note_lexicon_initialized();
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40287L)
    public static SubLObject lexicon_cache_filename(final SubLObject directory_path) {
        return file_utilities.relative_filename(directory_path, (SubLObject)lexicon_cache.$str140$lexicon_cache, (SubLObject)lexicon_cache.$str141$cfasl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40473L)
    public static SubLObject rebuild_lexicon_cache() {
        nl_trie.initialize_nl_trie((SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
        control_vars.note_lexicon_initialized();
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 40835L)
    public static SubLObject lexicon_cache_builtP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(lexicon_cache.NIL != lexicon_vars.$nl_trie_code_revision$.getGlobalValue() && lexicon_cache.NIL != lexicon_vars.$morphology_code_revision$.getGlobalValue() && lexicon_cache.NIL != lexicon_vars.$lexicon_cache_code_revision$.getGlobalValue() && lexicon_cache.NIL != nl_trie.get_nl_trie() && lexicon_cache.NIL == nl_trie.empty_nl_trieP(nl_trie.get_nl_trie()) && lexicon_cache.NIL != nl_trie_completion.$nl_trie_completion_index$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 41153L)
    public static SubLObject dump_lexicon_cache(final SubLObject directory_path) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cfasl_file = lexicon_cache_filename(directory_path);
        final SubLObject _prev_bind_0 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
        try {
            StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
            StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
            final SubLObject data_file = get_nl_trie_contents_data_file(directory_path);
            final SubLObject index_file = get_nl_trie_contents_index_file(directory_path);
            SubLObject fvector = (SubLObject)lexicon_cache.NIL;
            try {
                fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)lexicon_cache.$kw142$OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), (SubLObject)lexicon_cache.UNPROVIDED);
                dumper.kb_dump_stamp_file_vector_for_references(fvector);
                final SubLObject str = (SubLObject)lexicon_cache.$str143$Dumping_lexicon_cache___;
                final SubLObject _prev_bind_0_$76 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$77 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)lexicon_cache.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((lexicon_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : lexicon_cache.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    SubLObject stream = (SubLObject)lexicon_cache.NIL;
                    try {
                        stream = compatibility.open_binary(cfasl_file, (SubLObject)lexicon_cache.$kw142$OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)lexicon_cache.$str144$Unable_to_open__S, cfasl_file);
                        }
                        final SubLObject stream_$78 = stream;
                        nl_trie_staleness_test.dump_nl_trie_revisions(stream_$78);
                        nl_trie.dump_swappable_nl_trie_to_lexicon_cache(stream_$78, fvector);
                        nl_trie.dump_nl_trie_completion_index(stream_$78);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)lexicon_cache.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                        }
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$77, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$76, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$78 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if (lexicon_cache.NIL != file_vector.file_vector_p(fvector)) {
                        file_vector.close_file_vector(fvector);
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$78, thread);
                }
            }
            dumper.discard_dump_filename(index_file);
            dumper.discard_dump_filename(data_file);
        }
        finally {
            StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_2, thread);
            StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 42048L)
    public static SubLObject load_lexicon_cache(SubLObject directory_path) {
        if (directory_path == lexicon_cache.UNPROVIDED) {
            directory_path = (SubLObject)lexicon_cache.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_cache.NIL == directory_path) {
            directory_path = dumper.kb_dump_directory((SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
        }
        final SubLObject cfasl_file = lexicon_cache_filename(directory_path);
        if (lexicon_cache.NIL == Filesys.probe_file(cfasl_file)) {
            Errors.warn((SubLObject)lexicon_cache.$str145$CFASL_file__s_not_found, cfasl_file);
        }
        else {
            final SubLObject str = (SubLObject)lexicon_cache.$str146$Loading_lexicon_cache___;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                utilities_macros.$progress_notification_count$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)lexicon_cache.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)lexicon_cache.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((lexicon_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : lexicon_cache.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject _prev_bind_0_$81 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding(thread);
                final SubLObject _prev_bind_1_$82 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding(thread);
                try {
                    StreamsLow.$stream_initial_input_buffer_size$.bind(file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), thread);
                    StreamsLow.$stream_initial_output_buffer_size$.bind(StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue(thread), thread);
                    SubLObject stream = (SubLObject)lexicon_cache.NIL;
                    try {
                        stream = compatibility.open_binary(cfasl_file, (SubLObject)lexicon_cache.$kw147$INPUT);
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)lexicon_cache.$str144$Unable_to_open__S, cfasl_file);
                        }
                        final SubLObject stream_$83 = stream;
                        nl_trie_staleness_test.load_nl_trie_revisions(stream_$83);
                        final SubLObject _prev_bind_0_$82 = cfasl.$cfasl_input_to_static_area$.currentBinding(thread);
                        try {
                            cfasl.$cfasl_input_to_static_area$.bind(load_nl_trie_into_static_areaP(), thread);
                            nl_trie.load_nl_trie_from_lexicon_cache(stream_$83);
                            final SubLObject data_file = get_nl_trie_contents_data_file(directory_path);
                            final SubLObject index_file = get_nl_trie_contents_index_file(directory_path);
                            if (lexicon_cache.NIL != file_utilities.file_existsP(data_file) && lexicon_cache.NIL != file_utilities.file_existsP(index_file)) {
                                nl_trie.reconnect_nl_trie_to_file_vector_files(data_file, index_file, (SubLObject)lexicon_cache.UNPROVIDED);
                            }
                            dumper.discard_dump_filename(index_file);
                            dumper.discard_dump_filename(data_file);
                            nl_trie.load_nl_trie_completion_index(stream_$83);
                        }
                        finally {
                            cfasl.$cfasl_input_to_static_area$.rebind(_prev_bind_0_$82, thread);
                        }
                        if (lexicon_cache.NIL != lexicon_cache.$allow_nl_trie_rotation_initializationP$.getDynamicValue(thread)) {
                            nl_trie_accessors.initialize_nl_trie_rotation_index((SubLObject)lexicon_cache.UNPROVIDED);
                        }
                        control_vars.note_lexicon_initialized();
                    }
                    finally {
                        final SubLObject _prev_bind_0_$83 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_cache.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)lexicon_cache.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                        }
                    }
                }
                finally {
                    StreamsLow.$stream_initial_output_buffer_size$.rebind(_prev_bind_1_$82, thread);
                    StreamsLow.$stream_initial_input_buffer_size$.rebind(_prev_bind_0_$81, thread);
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
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43533L)
    public static SubLObject get_nl_trie_contents_data_file(SubLObject directory_path) {
        if (directory_path == lexicon_cache.UNPROVIDED) {
            directory_path = (SubLObject)lexicon_cache.NIL;
        }
        return dumper.kb_dump_file((SubLObject)lexicon_cache.$str148$nl_trie_contents, directory_path, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43659L)
    public static SubLObject get_nl_trie_contents_index_file(SubLObject directory_path) {
        if (directory_path == lexicon_cache.UNPROVIDED) {
            directory_path = (SubLObject)lexicon_cache.NIL;
        }
        return dumper.kb_dump_file((SubLObject)lexicon_cache.$str149$nl_trie_contents_index, directory_path, (SubLObject)lexicon_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 43791L)
    public static SubLObject redump_lexicon_cache(SubLObject directory_path) {
        if (directory_path == lexicon_cache.UNPROVIDED) {
            directory_path = (SubLObject)lexicon_cache.NIL;
        }
        if (lexicon_cache.NIL == directory_path) {
            directory_path = dumper.kb_dump_directory((SubLObject)lexicon_cache.UNPROVIDED, (SubLObject)lexicon_cache.UNPROVIDED);
        }
        return dump_lexicon_cache(directory_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44247L)
    public static SubLObject must_use_static_memory_for_nl_trie() {
        lexicon_cache.$must_use_static_memory_for_nl_trieP$.setGlobalValue((SubLObject)lexicon_cache.T);
        return list_utilities.sublisp_boolean(lexicon_cache.$must_use_static_memory_for_nl_trieP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44505L)
    public static SubLObject may_use_dynamic_memory_for_nl_trie() {
        lexicon_cache.$must_use_static_memory_for_nl_trieP$.setGlobalValue((SubLObject)lexicon_cache.NIL);
        return list_utilities.sublisp_boolean(lexicon_cache.$must_use_static_memory_for_nl_trieP$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-cache.lisp", position = 44823L)
    public static SubLObject load_nl_trie_into_static_areaP() {
        if (lexicon_cache.NIL == lexicon_cache.$must_use_static_memory_for_nl_trieP$.getGlobalValue()) {
            return (SubLObject)lexicon_cache.T;
        }
        return (SubLObject)lexicon_cache.T;
    }
    
    public static SubLObject declare_lexicon_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "perfect_aspect_pred", "PERFECT-ASPECT-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "words_of_string", "WORDS-OF-STRING", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "strings_of_word_unit", "STRINGS-OF-WORD-UNIT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "first_string_of_word_unit", "FIRST-STRING-OF-WORD-UNIT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "strings_of_wordXpred", "STRINGS-OF-WORD&PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "inference_strings_of_wordXpred", "INFERENCE-STRINGS-OF-WORD&PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "first_string_of_wordXpred", "FIRST-STRING-OF-WORD&PRED", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "ok_to_derive_word_form_from_predP", "OK-TO-DERIVE-WORD-FORM-FROM-PRED?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "ok_to_derive_word_form_for_predP", "OK-TO-DERIVE-WORD-FORM-FOR-PRED?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "word_form_assertedP", "WORD-FORM-ASSERTED?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "generate_regular_string", "GENERATE-REGULAR-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "generate_regular_strings", "GENERATE-REGULAR-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "strings_of_word_unit_with_supports", "STRINGS-OF-WORD-UNIT-WITH-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "ordered_strings_of_word_unit", "ORDERED-STRINGS-OF-WORD-UNIT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "string_or_strings_of_word_unit", "STRING-OR-STRINGS-OF-WORD-UNIT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_filter_exceptions", "SOSOWP-FILTER-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "clear_sosowp_do_filter_exceptions", "CLEAR-SOSOWP-DO-FILTER-EXCEPTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "remove_sosowp_do_filter_exceptions", "REMOVE-SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_do_filter_exceptions_internal", "SOSOWP-DO-FILTER-EXCEPTIONS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_do_filter_exceptions", "SOSOWP-DO-FILTER-EXCEPTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_remove_spec_preds", "SOSOWP-REMOVE-SPEC-PREDS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_repeated_argsP", "SOSOWP-REPEATED-ARGS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_top_levelP", "SOSOWP-TOP-LEVEL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "higher_asserted_entry_for_wuP", "HIGHER-ASSERTED-ENTRY-FOR-WU?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "all_genl_lexicon_preds_internal", "ALL-GENL-LEXICON-PREDS-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "all_genl_lexicon_preds", "ALL-GENL-LEXICON-PREDS", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_cache", "with_sosowp_context", "WITH-SOSOWP-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "string_or_strings_of_wordXpred_internal", "STRING-OR-STRINGS-OF-WORD&PRED-INTERNAL", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "string_or_strings_of_wordXpred", "STRING-OR-STRINGS-OF-WORD&PRED", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "make_regular_generation_answer", "MAKE-REGULAR-GENERATION-ANSWER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "regular_generation_answer_string", "REGULAR-GENERATION-ANSWER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "regular_generation_answer_pred", "REGULAR-GENERATION-ANSWER-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "regular_generation_answer_supports", "REGULAR-GENERATION-ANSWER-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "regular_generation_answer_string_plus_supports", "REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS", 1, 0, false);
        new $regular_generation_answer_string_plus_supports$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "extract_regular_generation_answer_type", "EXTRACT-REGULAR-GENERATION-ANSWER-TYPE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int", "SOSOWP-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_answer_to_utf8", "SOSOWP-INT-ANSWER-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_via_inference", "SOSOWP-INT-VIA-INFERENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_via_index_surfing", "SOSOWP-INT-VIA-INDEX-SURFING", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_remove_duplicate_strings", "SOSOWP-REMOVE-DUPLICATE-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_spec_preds_internal", "SOSOWP-INT-SPEC-PREDS-INTERNAL", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_spec_preds", "SOSOWP-INT-SPEC-PREDS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_int_this_pred", "SOSOWP-INT-THIS-PRED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "perfect_english_have_aux_for_pred", "PERFECT-ENGLISH-HAVE-AUX-FOR-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_lexical_assertionP", "PREFER-LEXICAL-ASSERTION?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_lexical_assertion_sans_asserted_preferenceP", "PREFER-LEXICAL-ASSERTION-SANS-ASSERTED-PREFERENCE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "abbreviation_assertion_p", "ABBREVIATION-ASSERTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "gen_string_assertion_pred_for_terseness", "GEN-STRING-ASSERTION-PRED-FOR-TERSENESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_sort_answers", "SOSOWP-SORT-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "sosowp_immediate_spec_preds_for_word", "SOSOWP-IMMEDIATE-SPEC-PREDS-FOR-WORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_pos_predP_internal", "PREFER-POS-PRED?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_pos_predP", "PREFER-POS-PRED?", 2, 1, false);
        new $prefer_pos_predP$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_verbal_pos_predP", "PREFER-VERBAL-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_tensed_pos_predP", "PREFER-TENSED-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "prefer_non_tensed_pos_predP", "PREFER-NON-TENSED-POS-PRED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "grsos_repeated_argsP", "GRSOS-REPEATED-ARGS?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_cache", "with_grsos_context", "WITH-GRSOS-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "generate_regular_string_or_strings", "GENERATE-REGULAR-STRING-OR-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "generate_regular_modifier_string_or_strings", "GENERATE-REGULAR-MODIFIER-STRING-OR-STRINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "derived_modifier_predP", "DERIVED-MODIFIER-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "base_pred_for_derived_modifier_pred", "BASE-PRED-FOR-DERIVED-MODIFIER-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "modifier_form_blockedP", "MODIFIER-FORM-BLOCKED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "modifier_form_has_noun_denotP", "MODIFIER-FORM-HAS-NOUN-DENOT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "comparative_formP", "COMPARATIVE-FORM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "superlative_formP", "SUPERLATIVE-FORM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "superlative_form_lacks_corresponding_comparativeP", "SUPERLATIVE-FORM-LACKS-CORRESPONDING-COMPARATIVE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "initialize_lexicon_kb_feature", "INITIALIZE-LEXICON-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "initialize_lexicon_modules", "INITIALIZE-LEXICON-MODULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "initialize_lexicon", "INITIALIZE-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "initialize_lexicon_lookup_mt", "INITIALIZE-LEXICON-LOOKUP-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "initialize_lexicon_from_kb", "INITIALIZE-LEXICON-FROM-KB", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "lexicon_cache_filename", "LEXICON-CACHE-FILENAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "rebuild_lexicon_cache", "REBUILD-LEXICON-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "lexicon_cache_builtP", "LEXICON-CACHE-BUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "dump_lexicon_cache", "DUMP-LEXICON-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "load_lexicon_cache", "LOAD-LEXICON-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "get_nl_trie_contents_data_file", "GET-NL-TRIE-CONTENTS-DATA-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "get_nl_trie_contents_index_file", "GET-NL-TRIE-CONTENTS-INDEX-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "redump_lexicon_cache", "REDUMP-LEXICON-CACHE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "must_use_static_memory_for_nl_trie", "MUST-USE-STATIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "may_use_dynamic_memory_for_nl_trie", "MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_cache", "load_nl_trie_into_static_areaP", "LOAD-NL-TRIE-INTO-STATIC-AREA?", 0, 0, false);
        return (SubLObject)lexicon_cache.NIL;
    }
    
    public static SubLObject init_lexicon_cache_file() {
        lexicon_cache.$perfect_aspect_pred$ = SubLFiles.deflexical("*PERFECT-ASPECT-PRED*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$sowu_eq_test$ = SubLFiles.deflexical("*SOWU-EQ-TEST*", Symbols.symbol_function((SubLObject)lexicon_cache.EQUAL));
        lexicon_cache.$sowu_first_onlyP$ = SubLFiles.defparameter("*SOWU-FIRST-ONLY?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$sowu_use_morphologyP$ = SubLFiles.defparameter("*SOWU-USE-MORPHOLOGY?*", (SubLObject)lexicon_cache.T);
        lexicon_cache.$sowu_include_supportsP$ = SubLFiles.defparameter("*SOWU-INCLUDE-SUPPORTS?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$sowu_respect_orderP$ = SubLFiles.defparameter("*SOWU-RESPECT-ORDER?*", (SubLObject)lexicon_cache.T);
        lexicon_cache.$within_regular_generation_internalsP$ = SubLFiles.defparameter("*WITHIN-REGULAR-GENERATION-INTERNALS?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$sosowp_do_filter_exceptions_caching_state$ = SubLFiles.deflexical("*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$sosowp_done_args$ = SubLFiles.defparameter("*SOSOWP-DONE-ARGS*", set.new_set((SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED));
        lexicon_cache.$sosowp_repeated_argsP$ = SubLFiles.defparameter("*SOSOWP-REPEATED-ARGS?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$grsos_done_args$ = SubLFiles.defparameter("*GRSOS-DONE-ARGS*", set.new_set((SubLObject)lexicon_cache.EQUAL, (SubLObject)lexicon_cache.UNPROVIDED));
        lexicon_cache.$grsos_repeated_argsP$ = SubLFiles.defparameter("*GRSOS-REPEATED-ARGS?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$lexicon_core_constants$ = SubLFiles.deflexical("*LEXICON-CORE-CONSTANTS*", (SubLObject)lexicon_cache.$list132);
        lexicon_cache.$allow_nl_trie_rotation_initializationP$ = SubLFiles.defparameter("*ALLOW-NL-TRIE-ROTATION-INITIALIZATION?*", (SubLObject)lexicon_cache.NIL);
        lexicon_cache.$must_use_static_memory_for_nl_trieP$ = SubLFiles.deflexical("*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*", (SubLObject)(maybeDefault((SubLObject)lexicon_cache.$sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__, lexicon_cache.$must_use_static_memory_for_nl_trieP$, lexicon_cache.NIL)));
        return (SubLObject)lexicon_cache.NIL;
    }
    
    public static SubLObject setup_lexicon_cache_file() {
        lexicon_vars.$lexicon_cache_code_revision$.setGlobalValue((SubLObject)lexicon_cache.$str0$_Revision__146268__);
        lexicon_vars.declare_noop_updates_for_lexicon_global((SubLObject)lexicon_cache.$sym1$_LEXICON_CACHE_CODE_REVISION_, (SubLObject)lexicon_cache.$list2);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_cache.$sym6$WORDS_OF_STRING, (SubLObject)lexicon_cache.$list7, (SubLObject)lexicon_cache.$str8$_return_LISTP__of_word_units_asso, (SubLObject)lexicon_cache.$list9, (SubLObject)lexicon_cache.$list10);
        memoization_state.note_globally_cached_function((SubLObject)lexicon_cache.$sym34$SOSOWP_DO_FILTER_EXCEPTIONS);
        memoization_state.note_memoized_function((SubLObject)lexicon_cache.$sym44$ALL_GENL_LEXICON_PREDS);
        memoization_state.note_memoized_function((SubLObject)lexicon_cache.$sym58$STRING_OR_STRINGS_OF_WORD_PRED);
        memoization_state.note_memoized_function((SubLObject)lexicon_cache.$sym75$SOSOWP_INT_SPEC_PREDS);
        memoization_state.note_memoized_function((SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_);
        subl_macro_promotions.declare_defglobal((SubLObject)lexicon_cache.$sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_cache.$sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.$str152$Instruct_the_loader_to_use_static, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.$list153);
        utilities_macros.register_cyc_api_function((SubLObject)lexicon_cache.$sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.$str155$Instruct_the_loader_to_leave_it_u, (SubLObject)lexicon_cache.NIL, (SubLObject)lexicon_cache.$list153);
        generic_testing.define_test_case_table_int((SubLObject)lexicon_cache.$sym32$PREFER_POS_PRED_, (SubLObject)ConsesLow.list(new SubLObject[] { lexicon_cache.$kw156$TEST, Symbols.symbol_function((SubLObject)lexicon_cache.EQL), lexicon_cache.$kw157$OWNER, lexicon_cache.NIL, lexicon_cache.$kw158$CLASSES, lexicon_cache.NIL, lexicon_cache.$kw159$KB, lexicon_cache.$kw160$FULL, lexicon_cache.$kw161$WORKING_, lexicon_cache.T }), (SubLObject)lexicon_cache.$list162);
        return (SubLObject)lexicon_cache.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexicon_cache_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexicon_cache_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexicon_cache_file();
    }
    
    static {
        me = (SubLFile)new lexicon_cache();
        lexicon_cache.$perfect_aspect_pred$ = null;
        lexicon_cache.$sowu_eq_test$ = null;
        lexicon_cache.$sowu_first_onlyP$ = null;
        lexicon_cache.$sowu_use_morphologyP$ = null;
        lexicon_cache.$sowu_include_supportsP$ = null;
        lexicon_cache.$sowu_respect_orderP$ = null;
        lexicon_cache.$within_regular_generation_internalsP$ = null;
        lexicon_cache.$sosowp_do_filter_exceptions_caching_state$ = null;
        lexicon_cache.$sosowp_done_args$ = null;
        lexicon_cache.$sosowp_repeated_argsP$ = null;
        lexicon_cache.$grsos_done_args$ = null;
        lexicon_cache.$grsos_repeated_argsP$ = null;
        lexicon_cache.$lexicon_core_constants$ = null;
        lexicon_cache.$allow_nl_trie_rotation_initializationP$ = null;
        lexicon_cache.$must_use_static_memory_for_nl_trieP$ = null;
        $str0$_Revision__146268__ = SubLObjectFactory.makeString("$Revision: 146268 $");
        $sym1$_LEXICON_CACHE_CODE_REVISION_ = SubLObjectFactory.makeSymbol("*LEXICON-CACHE-CODE-REVISION*");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.193"), (SubLObject)SubLObjectFactory.makeString("1.194")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.194"), (SubLObject)SubLObjectFactory.makeString("1.195")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.195"), (SubLObject)SubLObjectFactory.makeString("1.196")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.197"), (SubLObject)SubLObjectFactory.makeString("1.198")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.198"), (SubLObject)SubLObjectFactory.makeString("1.199")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1.199"), (SubLObject)SubLObjectFactory.makeString("1.200")));
        $str3$d2c1a460_aa6e_11d8_8d3f_0002b3a84 = SubLObjectFactory.makeString("d2c1a460-aa6e-11d8-8d3f-0002b3a84f94");
        $sym4$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym5$PARSE_MORPHOLOGICALLY_OPTION_P = SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P");
        $sym6$WORDS_OF_STRING = SubLObjectFactory.makeSymbol("WORDS-OF-STRING");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSPELLINGS?"), (SubLObject)SubLObjectFactory.makeSymbol("*MISSPELLINGS?*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOOKUP-MT"), (SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-LOOKUP-MT*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*")));
        $str8$_return_LISTP__of_word_units_asso = SubLObjectFactory.makeString("@return LISTP; of word units associated with STRING.\n@param STRING stringp\n@param MISSPELLINGS? boolean; Should we include misspellings?\n@param LOOKUP-MT hlmt-p; Which mt should we look from?\n@param PARSE-MORPHOLOGICALLY: :ALWAYS or :NEVER or :AS-FALLBACK;\n                               Do we attempt to parse STRING as a complex (multi-morpheme) word?");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MORPHOLOGICALLY-OPTION-P")));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $kw11$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym12$LEXICAL_WORD_ = SubLObjectFactory.makeSymbol("LEXICAL-WORD?");
        $sym13$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $kw14$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw15$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw16$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $const17$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw19$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str20$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym21$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw22$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str23$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw24$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str25$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const26$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str27$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str28$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str29$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const30$regularSuffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $sym31$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym32$PREFER_POS_PRED_ = SubLObjectFactory.makeSymbol("PREFER-POS-PRED?");
        $sym33$REGULAR_GENERATION_ANSWER_STRING = SubLObjectFactory.makeSymbol("REGULAR-GENERATION-ANSWER-STRING");
        $sym34$SOSOWP_DO_FILTER_EXCEPTIONS = SubLObjectFactory.makeSymbol("SOSOWP-DO-FILTER-EXCEPTIONS");
        $sym35$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym36$ALL_SPEC_PREDICATES = SubLObjectFactory.makeSymbol("ALL-SPEC-PREDICATES");
        $sym37$_SOSOWP_DO_FILTER_EXCEPTIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOSOWP-DO-FILTER-EXCEPTIONS-CACHING-STATE*");
        $sym38$GENL_PRED_ = SubLObjectFactory.makeSymbol("GENL-PRED?");
        $sym39$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const40$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym41$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const42$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym43$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym44$ALL_GENL_LEXICON_PREDS = SubLObjectFactory.makeSymbol("ALL-GENL-LEXICON-PREDS");
        $sym45$_ = SubLObjectFactory.makeSymbol(">");
        $sym46$NUM_PREDICATE_EXTENT_INDEX = SubLObjectFactory.makeSymbol("NUM-PREDICATE-EXTENT-INDEX");
        $int47$64 = SubLObjectFactory.makeInteger(64);
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym49$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym50$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym51$NEW_ARGS_ = SubLObjectFactory.makeSymbol("NEW-ARGS?");
        $sym52$SET_ADD = SubLObjectFactory.makeSymbol("SET-ADD");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SOSOWP-DONE-ARGS*"));
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SOSOWP-REPEATED-ARGS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("*SOSOWP-REPEATED-ARGS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ARGS?")))));
        $sym55$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym56$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym57$SET_REMOVE = SubLObjectFactory.makeSymbol("SET-REMOVE");
        $sym58$STRING_OR_STRINGS_OF_WORD_PRED = SubLObjectFactory.makeSymbol("STRING-OR-STRINGS-OF-WORD&PRED");
        $sym59$RELEVANT_PRED_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-PRED-IS-EVERYTHING");
        $int60$1000 = SubLObjectFactory.makeInteger(1000);
        $list61 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym62$REGULAR_GENERATION_ANSWER_STRING_PLUS_SUPPORTS = SubLObjectFactory.makeSymbol("REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS");
        $sym63$SOSOWP_INT_ANSWER_TO_UTF8 = SubLObjectFactory.makeSymbol("SOSOWP-INT-ANSWER-TO-UTF8");
        $sym64$_STRING = SubLObjectFactory.makeSymbol("?STRING");
        $sym65$_PRED = SubLObjectFactory.makeSymbol("?PRED");
        $kw66$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $kw67$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw68$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $kw69$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw70$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw71$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw72$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $const73$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym74$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym75$SOSOWP_INT_SPEC_PREDS = SubLObjectFactory.makeSymbol("SOSOWP-INT-SPEC-PREDS");
        $int76$200 = SubLObjectFactory.makeInteger(200);
        $sym77$PREFER_LEXICAL_ASSERTION_ = SubLObjectFactory.makeSymbol("PREFER-LEXICAL-ASSERTION?");
        $const78$simpleFuture_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("simpleFuture-Generic"));
        $const79$futureTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("futureTense-Generic"));
        $const80$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const81$EnglishHeadlineParaphraseMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishHeadlineParaphraseMt"));
        $str82$to_ = SubLObjectFactory.makeString("to ");
        $str83$will_ = SubLObjectFactory.makeString("will ");
        $const84$infinitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $str85$_ = SubLObjectFactory.makeString(" ");
        $const86$perfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perfect"));
        $const87$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord"));
        $kw88$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw89$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const90$futurePerfect_Universal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("futurePerfect-Universal"));
        $str91$will_have = SubLObjectFactory.makeString("will have");
        $const92$pastPerfect_Universal = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastPerfect-Universal"));
        $str93$had = SubLObjectFactory.makeString("had");
        $const94$firstPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstPersonSg-PresentPerfect"));
        $const95$secondPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("secondPersonSg-PresentPerfect"));
        $const96$pluralVerb_PresentPerfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pluralVerb-PresentPerfect"));
        $str97$have = SubLObjectFactory.makeString("have");
        $const98$thirdPersonSg_PresentPerfect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-PresentPerfect"));
        $str99$has = SubLObjectFactory.makeString("has");
        $const100$dispreferredLexification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dispreferredLexification"));
        $kw101$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw102$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw103$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $const104$genStringAssertion_Terse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Terse"));
        $kw105$PRECISE = SubLObjectFactory.makeKeyword("PRECISE");
        $const106$genStringAssertion_Precise = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise"));
        $const107$genStringAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $sym108$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $const109$verbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbStrings"));
        $const110$simpleNounStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("simpleNounStrings"));
        $const111$plural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural-Generic"));
        $const112$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $const113$ProperNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNoun"));
        $const114$CountNoun_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun-Generic"));
        $const115$MassNoun_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun-Generic"));
        $int116$400 = SubLObjectFactory.makeInteger(400);
        $const117$tensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"));
        $const118$presentTense_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentTense-Generic"));
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRSOS-DONE-ARGS*"));
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-REGULAR-GENERATION-INTERNALS?*"), (SubLObject)lexicon_cache.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GRSOS-REPEATED-ARGS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("*GRSOS-REPEATED-ARGS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ARGS?")))));
        $const121$adverbStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adverbStrings"));
        $const122$adjStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("adjStrings"));
        $const123$regularDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularDegree"));
        $const124$regularAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularAdverb"));
        $const125$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const126$comparativeDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeDegree"));
        $const127$comparativeAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("comparativeAdverb"));
        $const128$superlativeDegree = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeDegree"));
        $const129$superlativeAdverb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("superlativeAdverb"));
        $str130$est = SubLObjectFactory.makeString("est");
        $str131$er = SubLObjectFactory.makeString("er");
        $list132 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralLexiconMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllLexicalMicrotheoryPSC")));
        $sym133$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $const134$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AllEnglishValidatedLexicalMicrotheoryPSC"), (SubLObject)SubLObjectFactory.makeString("AllEnglishLexicalMicrotheoryPSC"), (SubLObject)SubLObjectFactory.makeString("EnglishMt"), (SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $str136$Merely_validating_NL_trie_as_it_a = SubLObjectFactory.makeString("Merely validating NL trie as it appears to be non-empty and non-stale.");
        $str137$Skipping_initialization_of_NL_tri = SubLObjectFactory.makeString("Skipping initialization of NL trie rotation index and it appears to not be ~A.");
        $str138$needed = SubLObjectFactory.makeString("needed");
        $str139$allowed = SubLObjectFactory.makeString("allowed");
        $str140$lexicon_cache = SubLObjectFactory.makeString("lexicon-cache");
        $str141$cfasl = SubLObjectFactory.makeString("cfasl");
        $kw142$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str143$Dumping_lexicon_cache___ = SubLObjectFactory.makeString("Dumping lexicon cache...");
        $str144$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str145$CFASL_file__s_not_found = SubLObjectFactory.makeString("CFASL file ~s not found");
        $str146$Loading_lexicon_cache___ = SubLObjectFactory.makeString("Loading lexicon cache...");
        $kw147$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str148$nl_trie_contents = SubLObjectFactory.makeString("nl-trie-contents");
        $str149$nl_trie_contents_index = SubLObjectFactory.makeString("nl-trie-contents-index");
        $sym150$_MUST_USE_STATIC_MEMORY_FOR_NL_TRIE__ = SubLObjectFactory.makeSymbol("*MUST-USE-STATIC-MEMORY-FOR-NL-TRIE?*");
        $sym151$MUST_USE_STATIC_MEMORY_FOR_NL_TRIE = SubLObjectFactory.makeSymbol("MUST-USE-STATIC-MEMORY-FOR-NL-TRIE");
        $str152$Instruct_the_loader_to_use_static = SubLObjectFactory.makeString("Instruct the loader to use static memory when loading the NL trie.");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym154$MAY_USE_DYNAMIC_MEMORY_FOR_NL_TRIE = SubLObjectFactory.makeSymbol("MAY-USE-DYNAMIC-MEMORY-FOR-NL-TRIE");
        $str155$Instruct_the_loader_to_leave_it_u = SubLObjectFactory.makeString("Instruct the loader to leave it up to the implementation whether to\n   use dynamic or static memory when loading the NL trie");
        $kw156$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw157$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw158$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw159$KB = SubLObjectFactory.makeKeyword("KB");
        $kw160$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw161$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list162 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present"))), (SubLObject)lexicon_cache.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past"))), (SubLObject)lexicon_cache.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastPerfect-Universal")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past"))), (SubLObject)lexicon_cache.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thirdPersonSg-Past")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pastPerfect-Universal"))), (SubLObject)lexicon_cache.T));
    }
    
    public static final class $regular_generation_answer_string_plus_supports$UnaryFunction extends UnaryFunction
    {
        public $regular_generation_answer_string_plus_supports$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REGULAR-GENERATION-ANSWER-STRING-PLUS-SUPPORTS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return lexicon_cache.regular_generation_answer_string_plus_supports(arg1);
        }
    }
    
    public static final class $prefer_pos_predP$BinaryFunction extends BinaryFunction
    {
        public $prefer_pos_predP$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PREFER-POS-PRED?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return lexicon_cache.prefer_pos_predP(arg1, arg2, (SubLObject)$prefer_pos_predP$BinaryFunction.UNPROVIDED);
        }
    }
}

/*

	Total time: 2118 ms
	
*/