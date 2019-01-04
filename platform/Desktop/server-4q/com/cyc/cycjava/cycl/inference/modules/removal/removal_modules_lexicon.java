package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.parsing_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.lexicon_macros;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.psp_main;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.nl_trie;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon";
    public static final String myFingerPrint = "462114e8bf8d13cb2b8bd26e66303893963d7b833ddad5222e7f70de8572cffd";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 965L)
    private static SubLSymbol $default_word_string_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 3215L)
    private static SubLSymbol $default_word_strings_unify_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLSymbol $dtp_removal_word_strings_iterator_state$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 12315L)
    private static SubLSymbol $avg_suffix_expansion_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 33905L)
    private static SubLSymbol $default_term_phrases_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 51053L)
    private static SubLSymbol $default_lexicon_namestring_check_cost$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$HL_VERIFY_WORD_STRINGS;
    private static final SubLSymbol $sym2$HL_JUSTIFY_WORD_STRINGS;
    private static final SubLSymbol $sym3$HL_FORWARD_MT_COMBOS_WORD_STRINGS;
    private static final SubLList $list4;
    private static final SubLObject $const5$CommonEnglishMisspellingsMt;
    private static final SubLSymbol $kw6$REMOVAL_WORD_STRINGS_CHECK;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$WORD_STRINGS;
    private static final SubLSymbol $sym9$REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE;
    private static final SubLSymbol $kw10$REMOVAL_WORD_STRINGS_UNIFY_ARG1;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$REMOVAL_WORD_STRINGS_UNIFY_ARG2;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$DEPTH;
    private static final SubLSymbol $kw16$STACK;
    private static final SubLSymbol $kw17$QUEUE;
    private static final SubLObject $const18$True_JustificationTruth;
    private static final SubLSymbol $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw20$ERROR;
    private static final SubLString $str21$_A_is_not_a__A;
    private static final SubLSymbol $sym22$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw23$CERROR;
    private static final SubLString $str24$continue_anyway;
    private static final SubLSymbol $kw25$WARN;
    private static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const27$genlPreds;
    private static final SubLString $str28$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str29$attempting_to_bind_direction_link;
    private static final SubLString $str30$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE;
    private static final SubLSymbol $sym32$REMOVAL_WORD_STRINGS_ITERATOR_STATE_P;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym38$REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE;
    private static final SubLSymbol $sym41$_CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE;
    private static final SubLSymbol $sym42$REMOVAL_WSI_STATE_ARG1;
    private static final SubLSymbol $sym43$_CSETF_REMOVAL_WSI_STATE_ARG1;
    private static final SubLSymbol $sym44$REMOVAL_WSI_STATE_ARG2;
    private static final SubLSymbol $sym45$_CSETF_REMOVAL_WSI_STATE_ARG2;
    private static final SubLSymbol $sym46$REMOVAL_WSI_STATE_TRIE_ITERATOR;
    private static final SubLSymbol $sym47$_CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR;
    private static final SubLSymbol $sym48$REMOVAL_WSI_STATE_ENTRY_ITERATOR;
    private static final SubLSymbol $sym49$_CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR;
    private static final SubLSymbol $kw50$SPEECH_PART_PREDICATE;
    private static final SubLSymbol $kw51$ARG1;
    private static final SubLSymbol $kw52$ARG2;
    private static final SubLSymbol $kw53$TRIE_ITERATOR;
    private static final SubLSymbol $kw54$ENTRY_ITERATOR;
    private static final SubLString $str55$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw56$BEGIN;
    private static final SubLSymbol $sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE;
    private static final SubLSymbol $kw58$SLOT;
    private static final SubLSymbol $kw59$END;
    private static final SubLSymbol $sym60$VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD;
    private static final SubLSymbol $sym61$ITERATOR_WORD_STRINGS_DONE;
    private static final SubLSymbol $sym62$ITERATOR_WORD_STRINGS_NEXT;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR;
    private static final SubLSymbol $sym65$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT;
    private static final SubLList $list68;
    private static final SubLObject $const69$regularSuffix;
    private static final SubLSymbol $kw70$REMOVAL_WORD_FORMS_CHECK;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$REMOVAL_WORD_FORMS_UNIFY_ARG1;
    private static final SubLList $list73;
    private static final SubLObject $const74$speechPartPreds;
    private static final SubLSymbol $kw75$REMOVAL_WORD_FORMS_UNIFY_ARG2;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$REMOVAL_WORD_FORMS_UNIFY_ARG3;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2;
    private static final SubLList $list80;
    private static final SubLSymbol $kw81$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3;
    private static final SubLList $list82;
    private static final SubLObject $const83$termStrings;
    private static final SubLSymbol $kw84$TRUE;
    private static final SubLSymbol $sym85$HL_VERIFY_TERM_PHRASES;
    private static final SubLSymbol $sym86$HL_JUSTIFY_TERM_PHRASES;
    private static final SubLObject $const87$termPhrases;
    private static final SubLObject $const88$termPhrases_Lexical;
    private static final SubLObject $const89$termPhrases_CaseInsensitive;
    private static final SubLObject $const90$termPhrases_CaseInsensitive_Lexic;
    private static final SubLObject $const91$CharacterString;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$HL_FORWARD_MT_COMBOS_TERM_PHRASES;
    private static final SubLSymbol $sym94$SUPPORT_SENTENCE_OPERATOR;
    private static final SubLSymbol $sym95$HL_VERIFY_AND_JUSTIFY_TERM_PHRASES;
    private static final SubLSymbol $kw96$TEST;
    private static final SubLSymbol $sym97$SUPPORTS_HAVE_PREDS_;
    private static final SubLSymbol $kw98$OWNER;
    private static final SubLSymbol $kw99$CLASSES;
    private static final SubLSymbol $kw100$KB;
    private static final SubLSymbol $kw101$FULL;
    private static final SubLSymbol $kw102$WORKING_;
    private static final SubLObject $list103;
    private static final SubLSymbol $sym104$SUPPORT_P;
    private static final SubLSymbol $sym105$SPEECH_PART_PRED_;
    private static final SubLObject $const106$abbreviationForLexicalWord;
    private static final SubLSymbol $sym107$SUPPORT_SENTENCE;
    private static final SubLObject $const108$genls;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$PIF;
    private static final SubLSymbol $sym113$INDEXED_TERM_P;
    private static final SubLSymbol $sym114$DO_GAF_ARG_INDEX;
    private static final SubLSymbol $kw115$PREDICATE;
    private static final SubLSymbol $kw116$INDEX;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$DO_GAF_ARG_INDEX_NAUT;
    private static final SubLList $list119;
    private static final SubLSymbol $kw120$TERM_PHRASES;
    private static final SubLSymbol $sym121$GENERIC_PRED_;
    private static final SubLObject $const122$StringIndexingSlot;
    private static final SubLSymbol $sym123$NAME_STRING_PRED_;
    private static final SubLObject $const124$ProperNameString;
    private static final SubLObject $const125$arg2Isa;
    private static final SubLSymbol $kw126$ALL;
    private static final SubLObject $const127$NLWordForm;
    private static final SubLObject $const128$NounPhrase;
    private static final SubLObject $const129$nonSingular_Generic;
    private static final SubLObject $const130$GenericSpeechPartPredicate;
    private static final SubLSymbol $kw131$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3;
    private static final SubLList $list132;
    private static final SubLSymbol $kw133$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3;
    private static final SubLList $list134;
    private static final SubLSymbol $kw135$REMOVAL_TERM_PHRASES_UNIFY_ARG3;
    private static final SubLList $list136;
    private static final SubLSymbol $kw137$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3;
    private static final SubLList $list138;
    private static final SubLSymbol $kw139$REMOVAL_TERM_PHRASES_UNIFY_ARG1;
    private static final SubLList $list140;
    private static final SubLSymbol $kw141$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1;
    private static final SubLList $list142;
    private static final SubLSymbol $kw143$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1;
    private static final SubLList $list144;
    private static final SubLSymbol $kw145$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1;
    private static final SubLList $list146;
    private static final SubLList $list147;
    private static final SubLSymbol $kw148$ON;
    private static final SubLSymbol $kw149$OFF;
    private static final SubLSymbol $kw150$NEVER;
    private static final SubLSymbol $kw151$ONLY;
    private static final SubLList $list152;
    private static final SubLList $list153;
    private static final SubLSymbol $kw154$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2;
    private static final SubLList $list155;
    private static final SubLSymbol $kw156$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLObject $const160$TermPhrasesConstraint;
    private static final SubLObject $const161$isa;
    private static final SubLSymbol $kw162$BREADTH;
    private static final SubLObject $const163$wordForms;
    private static final SubLList $list164;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLSymbol $sym167$NAME_PRED;
    private static final SubLSymbol $sym168$DENOT;
    private static final SubLSymbol $kw169$GENLPREDS;
    private static final SubLSymbol $sym170$REMOVAL_LEXICON_NAMESTRING_EXPAND;
    private static final SubLSymbol $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_;
    private static final SubLSymbol $kw172$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
    private static final SubLList $list173;
    private static final SubLSymbol $kw174$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND;
    private static final SubLList $list175;
    private static final SubLSymbol $kw176$REMOVAL_LEXICON_NAMESTRING;
    private static final SubLList $list177;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 548L)
    public static SubLObject removal_word_strings_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1024L)
    public static SubLObject hl_verify_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject hl_module = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject asent = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject mt = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject tv = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_lexicon.$list0);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list0);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list0);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list0);
        tv = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = removal_word_strings_check_succeedsP(asent);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_lexicon.$list0);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1301L)
    public static SubLObject hl_justify_word_strings(final SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_justify_word_strings(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1411L)
    public static SubLObject hl_forward_mt_combos_word_strings(final SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_forward_mt_combos_word_strings(support);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1541L)
    public static SubLObject removal_word_strings_check_succeedsP(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject pos_pred = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list4);
        pos_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list4);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list4);
        string = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject misspellingsP = mt_relevance_macros.relevant_mtP(removal_modules_lexicon.$const5$CommonEnglishMisspellingsMt);
            final SubLObject mt = mt_relevance_macros.inference_relevant_mt();
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, pos_pred, misspellingsP, mt, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            return subl_promotions.memberP(word, words, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list4);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1890L)
    public static SubLObject removal_word_strings_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        if (removal_modules_lexicon.NIL != removal_word_strings_check_succeedsP(asent)) {
            final SubLObject hl_support = make_word_strings_support(asent);
            backward.removal_add_node(hl_support, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 2650L)
    public static SubLObject make_word_strings_support(final SubLObject formula) {
        return arguments.make_hl_support((SubLObject)removal_modules_lexicon.$kw8$WORD_STRINGS, formula, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 2958L)
    public static SubLObject removal_word_strings_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 3275L)
    public static SubLObject removal_word_strings_unify_arg1_output_generate(final SubLObject pos_pred, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iteration.new_list_iterator(lexicon_accessors.words_of_stringXpred(string, pos_pred, (SubLObject)removal_modules_lexicon.T, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_lexicon.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4323L)
    public static SubLObject removal_word_strings_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4576L)
    public static SubLObject removal_word_strings_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        return kb_indexing.num_gaf_arg_index(word, (SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4756L)
    public static SubLObject removal_word_strings_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject pos_pred = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list12);
        pos_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list12);
        word = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list12);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding(thread);
            try {
                lexicon_vars.$misspellingsP$.bind(mt_relevance_macros.relevant_mtP(removal_modules_lexicon.$const5$CommonEnglishMisspellingsMt), thread);
                SubLObject cdolist_list_var;
                final SubLObject strings = cdolist_list_var = lexicon_cache.strings_of_wordXpred(word, pos_pred, mt_relevance_macros.mt_info((SubLObject)removal_modules_lexicon.UNPROVIDED));
                SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
                string = cdolist_list_var.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(string, arg2, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_lexicon.NIL != v_bindings) {
                        final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                        final SubLObject hl_support = make_word_strings_support(formula);
                        backward.removal_add_node(hl_support, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    string = cdolist_list_var.first();
                }
            }
            finally {
                lexicon_vars.$misspellingsP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list12);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 5923L)
    public static SubLObject removal_word_strings_unify_arg1_and_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6196L)
    public static SubLObject removal_word_strings_unify_arg1_and_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)removal_modules_lexicon.ZERO_INTEGER;
        final SubLObject node_var = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject deck_type = (SubLObject)removal_modules_lexicon.$kw17$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)removal_modules_lexicon.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = removal_modules_lexicon.$const18$True_JustificationTruth;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((removal_modules_lexicon.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_lexicon.NIL != tv_var) ? removal_modules_lexicon.$sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (removal_modules_lexicon.NIL != tv_var && removal_modules_lexicon.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_lexicon.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw20$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw23$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw25$WARN)) {
                            Errors.warn((SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds), thread);
                        if (removal_modules_lexicon.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_lexicon.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(cycl_utilities.atomic_sentence_predicate(asent), sbhl_search_vars.genl_inverse_mode_p()); removal_modules_lexicon.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$7;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (removal_modules_lexicon.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7)) {
                                            count = Numbers.add(count, kb_indexing.relevant_num_predicate_extent_index(spec_pred));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds));
                                        SubLObject module_var = (SubLObject)removal_modules_lexicon.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (removal_modules_lexicon.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$7);
                                                if (removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                    if (removal_modules_lexicon.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                        if (removal_modules_lexicon.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (removal_modules_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (removal_modules_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (removal_modules_lexicon.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_lexicon.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)removal_modules_lexicon.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (removal_modules_lexicon.NIL != csome_list_var) {
                                                                                            if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.FIVE_INTEGER, (SubLObject)removal_modules_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                    }
                                                }
                                                else if (removal_modules_lexicon.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$14;
                                                    final SubLObject new_list = cdolist_list_var_$14 = ((removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)removal_modules_lexicon.NIL;
                                                    generating_fn = cdolist_list_var_$14.first();
                                                    while (removal_modules_lexicon.NIL != cdolist_list_var_$14) {
                                                        final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (removal_modules_lexicon.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_lexicon.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)removal_modules_lexicon.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (removal_modules_lexicon.NIL != csome_list_var2) {
                                                                    if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                        }
                                                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                        generating_fn = cdolist_list_var_$14.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        final SubLObject current_controlling_inference = inference_macros.current_controlling_inference();
        if (removal_modules_lexicon.NIL != current_controlling_inference) {
            final SubLObject number_cutoff = inference_datastructures_inference.inference_max_number(current_controlling_inference);
            if (removal_modules_lexicon.NIL != number_cutoff && number_cutoff.numL(count)) {
                count = number_cutoff;
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_word_strings_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)removal_modules_lexicon.ZERO_INTEGER);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_word_strings_iterator_state_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $removal_word_strings_iterator_state_native.class) ? removal_modules_lexicon.T : removal_modules_lexicon.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_wsi_state_speech_part_predicate(final SubLObject v_object) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_wsi_state_arg1(final SubLObject v_object) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_wsi_state_arg2(final SubLObject v_object) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_wsi_state_trie_iterator(final SubLObject v_object) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject removal_wsi_state_entry_iterator(final SubLObject v_object) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject _csetf_removal_wsi_state_speech_part_predicate(final SubLObject v_object, final SubLObject value) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject _csetf_removal_wsi_state_arg1(final SubLObject v_object, final SubLObject value) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject _csetf_removal_wsi_state_arg2(final SubLObject v_object, final SubLObject value) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject _csetf_removal_wsi_state_trie_iterator(final SubLObject v_object, final SubLObject value) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject _csetf_removal_wsi_state_entry_iterator(final SubLObject v_object, final SubLObject value) {
        assert removal_modules_lexicon.NIL != removal_word_strings_iterator_state_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject make_removal_word_strings_iterator_state(SubLObject arglist) {
        if (arglist == removal_modules_lexicon.UNPROVIDED) {
            arglist = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject v_new = (SubLObject)new $removal_word_strings_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)removal_modules_lexicon.NIL, next = arglist; removal_modules_lexicon.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw50$SPEECH_PART_PREDICATE)) {
                _csetf_removal_wsi_state_speech_part_predicate(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw51$ARG1)) {
                _csetf_removal_wsi_state_arg1(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw52$ARG2)) {
                _csetf_removal_wsi_state_arg2(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw53$TRIE_ITERATOR)) {
                _csetf_removal_wsi_state_trie_iterator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw54$ENTRY_ITERATOR)) {
                _csetf_removal_wsi_state_entry_iterator(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)removal_modules_lexicon.$str55$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject visit_defstruct_removal_word_strings_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw56$BEGIN, (SubLObject)removal_modules_lexicon.$sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, (SubLObject)removal_modules_lexicon.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw58$SLOT, (SubLObject)removal_modules_lexicon.$kw50$SPEECH_PART_PREDICATE, removal_wsi_state_speech_part_predicate(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw58$SLOT, (SubLObject)removal_modules_lexicon.$kw51$ARG1, removal_wsi_state_arg1(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw58$SLOT, (SubLObject)removal_modules_lexicon.$kw52$ARG2, removal_wsi_state_arg2(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw58$SLOT, (SubLObject)removal_modules_lexicon.$kw53$TRIE_ITERATOR, removal_wsi_state_trie_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw58$SLOT, (SubLObject)removal_modules_lexicon.$kw54$ENTRY_ITERATOR, removal_wsi_state_entry_iterator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)removal_modules_lexicon.$kw59$END, (SubLObject)removal_modules_lexicon.$sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, (SubLObject)removal_modules_lexicon.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
    public static SubLObject visit_defstruct_object_removal_word_strings_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_word_strings_iterator_state(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7079L)
    public static SubLObject iterator_word_strings_done(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL != iteration.iteration_done(removal_wsi_state_trie_iterator(state)) && (removal_modules_lexicon.NIL == removal_wsi_state_entry_iterator(state) || removal_modules_lexicon.NIL != iteration.iteration_done(removal_wsi_state_entry_iterator(state))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7341L)
    public static SubLObject wsi_entry_iterator_prepared_p(final SubLObject state) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL != removal_wsi_state_entry_iterator(state) && removal_modules_lexicon.NIL == iteration.iteration_done(removal_wsi_state_entry_iterator(state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7524L)
    public static SubLObject wsi_advance_to_next_entry_iterator(final SubLObject state) {
        while (removal_modules_lexicon.NIL == iteration.iteration_done(removal_wsi_state_trie_iterator(state)) && removal_modules_lexicon.NIL == wsi_entry_iterator_prepared_p(state)) {
            final SubLObject this_pair = iteration.iteration_next(removal_wsi_state_trie_iterator(state));
            final SubLObject entries = conses_high.second(this_pair);
            if (removal_modules_lexicon.NIL != entries) {
                _csetf_removal_wsi_state_entry_iterator(state, iteration.new_list_iterator(entries));
            }
        }
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7941L)
    public static SubLObject wsi_current_word_and_string_unifyP(final SubLObject state, final SubLObject current_word, final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL != unification_utilities.term_unify(removal_wsi_state_arg1(state), current_word, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED) && removal_modules_lexicon.NIL != unification_utilities.term_unify(removal_wsi_state_arg2(state), string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 8151L)
    public static SubLObject iterator_word_strings_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject supported_string = (SubLObject)removal_modules_lexicon.NIL;
        while ((removal_modules_lexicon.NIL == word || removal_modules_lexicon.NIL == supported_string) && removal_modules_lexicon.NIL == iterator_word_strings_done(state)) {
            if (removal_modules_lexicon.NIL == wsi_entry_iterator_prepared_p(state)) {
                wsi_advance_to_next_entry_iterator(state);
            }
            while (removal_modules_lexicon.NIL == word && removal_modules_lexicon.NIL != wsi_entry_iterator_prepared_p(state)) {
                final SubLObject current_entry = iteration.iteration_next(removal_wsi_state_entry_iterator(state));
                final SubLObject speech_part_predicate = removal_wsi_state_speech_part_predicate(state);
                if (removal_modules_lexicon.NIL != nl_trie.nl_trie_word_p(current_entry, (SubLObject)removal_modules_lexicon.UNPROVIDED) && removal_modules_lexicon.NIL != nl_trie.nl_trie_word_head_onlyP(current_entry)) {
                    thread.resetMultipleValues();
                    final SubLObject entry_pred = nl_trie_accessors.nl_trie_word_pred_and_supports_for_pred(current_entry, speech_part_predicate, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                    final SubLObject supports = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_lexicon.NIL == entry_pred) {
                        continue;
                    }
                    final SubLObject current_word = nl_trie.nl_trie_word_word_unit(current_entry, (SubLObject)removal_modules_lexicon.NIL);
                    final SubLObject string = nl_trie.nl_trie_entry_string(current_entry);
                    if (removal_modules_lexicon.NIL == wsi_current_word_and_string_unifyP(state, current_word, string)) {
                        continue;
                    }
                    word = current_word;
                    supported_string = (SubLObject)ConsesLow.cons(string, supports);
                }
            }
        }
        return Values.values((SubLObject)((removal_modules_lexicon.NIL != word) ? ConsesLow.list(removal_wsi_state_speech_part_predicate(state), word, supported_string) : removal_modules_lexicon.NIL), state, Types.sublisp_null(word));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 9412L)
    public static SubLObject removal_word_strings_unify_arg1_and_arg2_iterator(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject speech_part_predicate = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg1 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list63);
        speech_part_predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list63);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list63);
        arg2 = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject trie_iterator = nl_trie.new_nl_trie_iterator((SubLObject)removal_modules_lexicon.UNPROVIDED);
            final SubLObject state = make_removal_word_strings_iterator_state((SubLObject)ConsesLow.list((SubLObject)removal_modules_lexicon.$kw53$TRIE_ITERATOR, trie_iterator, (SubLObject)removal_modules_lexicon.$kw50$SPEECH_PART_PREDICATE, speech_part_predicate, (SubLObject)removal_modules_lexicon.$kw51$ARG1, arg1, (SubLObject)removal_modules_lexicon.$kw52$ARG2, arg2));
            return iteration.new_iterator(state, Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym61$ITERATOR_WORD_STRINGS_DONE), Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym62$ITERATOR_WORD_STRINGS_NEXT), (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list63);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 9894L)
    public static SubLObject removal_word_strings_unify_arg1_and_arg2_supports(final SubLObject input) {
        return conses_high.second(input).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 10009L)
    public static SubLObject removal_word_strings_unify_arg1_and_arg2_output_asent(final SubLObject predicate, final SubLObject word, final SubLObject supported_string) {
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject supports = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(supported_string, supported_string, (SubLObject)removal_modules_lexicon.$list66);
        string = supported_string.first();
        final SubLObject current = supports = supported_string.rest();
        return el_utilities.make_binary_formula(predicate, word, string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 10260L)
    public static SubLObject set_up_removal_support_for_speech_part_predicate(final SubLObject spp) {
        inference_modules.register_solely_specific_removal_module_predicate(spp);
        SubLObject cdolist_list_var = (SubLObject)removal_modules_lexicon.$list68;
        SubLObject module = (SubLObject)removal_modules_lexicon.NIL;
        module = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            inference_modules.inference_removal_module_use_generic(spp, module);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        }
        return spp;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 11714L)
    public static SubLObject removal_word_forms_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 12368L)
    public static SubLObject removal_word_forms_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject num_asserted = kb_indexing.relevant_num_gaf_arg_index(word, (SubLObject)removal_modules_lexicon.ONE_INTEGER, pred);
        final SubLObject num_rules = kb_indexing.relevant_num_gaf_arg_index(pred, (SubLObject)removal_modules_lexicon.ONE_INTEGER, removal_modules_lexicon.$const69$regularSuffix);
        return Numbers.add(num_asserted, Numbers.multiply(num_rules, removal_modules_lexicon.$avg_suffix_expansion_cost$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 12735L)
    public static SubLObject removal_word_forms_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject gafs = kb_mapping.gather_gaf_arg_index(word, (SubLObject)removal_modules_lexicon.ONE_INTEGER, pred, (SubLObject)removal_modules_lexicon.NIL, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject foundP = (SubLObject)removal_modules_lexicon.NIL;
        if (removal_modules_lexicon.NIL == gafs) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.inference_relevant_mt(), thread);
                final SubLObject words = lexicon_accessors.words_of_stringXpred(string, pred, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                if (removal_modules_lexicon.NIL != subl_promotions.memberP(word, words, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                    backward.removal_add_node(make_word_strings_support(el_utilities.make_binary_formula(pred, word, string)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                    foundP = (SubLObject)removal_modules_lexicon.T;
                }
            }
            finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (removal_modules_lexicon.NIL == foundP) {
            SubLObject csome_list_var = gafs;
            SubLObject gaf = (SubLObject)removal_modules_lexicon.NIL;
            gaf = csome_list_var.first();
            while (removal_modules_lexicon.NIL == foundP && removal_modules_lexicon.NIL != csome_list_var) {
                if (removal_modules_lexicon.NIL != cycl_string.cycl_stringE(string, assertions_high.gaf_arg2(gaf))) {
                    foundP = (SubLObject)removal_modules_lexicon.T;
                    backward.removal_add_node(gaf, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            }
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 13975L)
    public static SubLObject removal_word_forms_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 14312L)
    public static SubLObject removal_word_forms_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        return Numbers.multiply((SubLObject)removal_modules_lexicon.TWO_INTEGER, Sequences.length(lexicon_cache.words_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 14505L)
    public static SubLObject removal_word_forms_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        word = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17;
            final SubLObject results = cdolist_list_var_$17 = lexicon_cache.strings_of_word_unit_with_supports(word, (SubLObject)ConsesLow.list(pred));
            SubLObject result = (SubLObject)removal_modules_lexicon.NIL;
            result = cdolist_list_var_$17.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var_$17) {
                final SubLObject lexicon_string = result.first();
                if (removal_modules_lexicon.NIL != Strings.stringE(string, lexicon_string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject word_binding = unification_utilities.term_unify(arg1, word, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_lexicon.NIL != word_binding) {
                        backward.removal_add_node(conses_high.cadr(result), word_binding, ConsesLow.append(conses_high.cddr(result), unify_justification));
                    }
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                result = cdolist_list_var_$17.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 15763L)
    public static SubLObject removal_word_forms_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 16099L)
    public static SubLObject removal_word_forms_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject ans = (SubLObject)removal_modules_lexicon.ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
        pos = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            ans = Numbers.add(ans, kb_indexing.num_gaf_arg_index(pos, (SubLObject)removal_modules_lexicon.ONE_INTEGER, removal_modules_lexicon.$const74$speechPartPreds, (SubLObject)removal_modules_lexicon.UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return Numbers.multiply((SubLObject)removal_modules_lexicon.TWO_INTEGER, ans);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 16401L)
    public static SubLObject removal_word_forms_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
        pos = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = lexicon_utilities.preds_of_pos(pos, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
            pred = cdolist_list_var_$18.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var_$18) {
                SubLObject cdolist_list_var_$19;
                final SubLObject results = cdolist_list_var_$19 = lexicon_cache.strings_of_word_unit_with_supports(word, (SubLObject)ConsesLow.list(pred));
                SubLObject result = (SubLObject)removal_modules_lexicon.NIL;
                result = cdolist_list_var_$19.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var_$19) {
                    final SubLObject lexicon_string = result.first();
                    if (removal_modules_lexicon.NIL != Strings.stringE(string, lexicon_string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(pred, arg2, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_lexicon.NIL != v_bindings) {
                            backward.removal_add_node(conses_high.cadr(result), v_bindings, ConsesLow.append(conses_high.cddr(result), unify_justification));
                        }
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    result = cdolist_list_var_$19.first();
                }
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                pred = cdolist_list_var_$18.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 17690L)
    public static SubLObject removal_word_forms_unify_arg3_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 18025L)
    public static SubLObject removal_word_forms_unify_arg3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return Numbers.multiply((SubLObject)removal_modules_lexicon.TWO_INTEGER, removal_word_forms_check_cost(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 18171L)
    public static SubLObject removal_word_forms_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = lexicon_cache.strings_of_word_unit_with_supports(word, (SubLObject)ConsesLow.list(pred));
        SubLObject result = (SubLObject)removal_modules_lexicon.NIL;
        result = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            final SubLObject string = result.first();
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(string, arg3, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lexicon.NIL != v_bindings) {
                backward.removal_add_node(conses_high.cadr(result), v_bindings, ConsesLow.append(conses_high.cddr(result), unify_justification));
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 19301L)
    public static SubLObject removal_word_forms_unify_args_1_and_2_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 19657L)
    public static SubLObject removal_word_forms_unify_args_1_and_2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject ans = (SubLObject)removal_modules_lexicon.ZERO_INTEGER;
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        word = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20;
            final SubLObject pos_list = cdolist_list_var_$20 = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
            pos = cdolist_list_var_$20.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var_$20) {
                ans = Numbers.add(ans, Numbers.multiply((SubLObject)removal_modules_lexicon.TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, (SubLObject)removal_modules_lexicon.ONE_INTEGER, removal_modules_lexicon.$const74$speechPartPreds, (SubLObject)removal_modules_lexicon.UNPROVIDED)));
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                pos = cdolist_list_var_$20.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 20022L)
    public static SubLObject removal_word_forms_unify_args_1_and_2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject word = (SubLObject)removal_modules_lexicon.NIL;
        word = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject word_binding = unification_utilities.term_unify(word, arg1, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
            final SubLObject word_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lexicon.NIL != word_binding) {
                SubLObject cdolist_list_var_$21;
                final SubLObject pos_list = cdolist_list_var_$21 = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
                pos = cdolist_list_var_$21.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var_$21) {
                    SubLObject cdolist_list_var_$22 = lexicon_utilities.preds_of_pos(pos, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                    SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
                    pred = cdolist_list_var_$22.first();
                    while (removal_modules_lexicon.NIL != cdolist_list_var_$22) {
                        SubLObject cdolist_list_var_$23;
                        final SubLObject results = cdolist_list_var_$23 = lexicon_cache.strings_of_word_unit_with_supports(word, (SubLObject)ConsesLow.list(pred));
                        SubLObject result = (SubLObject)removal_modules_lexicon.NIL;
                        result = cdolist_list_var_$23.first();
                        while (removal_modules_lexicon.NIL != cdolist_list_var_$23) {
                            final SubLObject lexicon_string = result.first();
                            if (removal_modules_lexicon.NIL != Strings.stringE(string, lexicon_string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                thread.resetMultipleValues();
                                final SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                                final SubLObject pred_unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (removal_modules_lexicon.NIL != pred_binding) {
                                    backward.removal_add_node(conses_high.cadr(result), ConsesLow.append(word_binding, pred_binding), ConsesLow.append(conses_high.cddr(result), word_unify_justification, pred_unify_justification));
                                }
                            }
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            result = cdolist_list_var_$23.first();
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        pred = cdolist_list_var_$22.first();
                    }
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    pos = cdolist_list_var_$21.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 21620L)
    public static SubLObject removal_word_forms_unify_args_2_and_3_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 21975L)
    public static SubLObject removal_word_forms_unify_args_2_and_3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject ans = (SubLObject)removal_modules_lexicon.ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
        pos = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            ans = Numbers.add(ans, Numbers.multiply((SubLObject)removal_modules_lexicon.TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, (SubLObject)removal_modules_lexicon.ONE_INTEGER, removal_modules_lexicon.$const74$speechPartPreds, (SubLObject)removal_modules_lexicon.UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 22285L)
    public static SubLObject removal_word_forms_unify_args_2_and_3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
        pos = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = lexicon_utilities.preds_of_pos(pos, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
            pred = cdolist_list_var_$24.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var_$24) {
                SubLObject cdolist_list_var_$25;
                final SubLObject results = cdolist_list_var_$25 = lexicon_cache.strings_of_word_unit_with_supports(word, (SubLObject)ConsesLow.list(pred));
                SubLObject result = (SubLObject)removal_modules_lexicon.NIL;
                result = cdolist_list_var_$25.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var_$25) {
                    final SubLObject lexicon_string = result.first();
                    thread.resetMultipleValues();
                    final SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                    final SubLObject pred_unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (removal_modules_lexicon.NIL != pred_binding) {
                        thread.resetMultipleValues();
                        final SubLObject string_binding = unification_utilities.term_unify(lexicon_string, arg3, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                        final SubLObject string_unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (removal_modules_lexicon.NIL != string_binding) {
                            backward.removal_add_node(conses_high.cadr(result), ConsesLow.append(pred_binding, string_binding), ConsesLow.append(conses_high.cddr(result), pred_unify_justification, string_unify_justification));
                        }
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    result = cdolist_list_var_$25.first();
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                pred = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 23814L)
    public static SubLObject hl_verify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_lexicon.NIL != list_utilities.non_empty_list_p(hl_justify_term_phrases(support))) {
            return (SubLObject)removal_modules_lexicon.T;
        }
        if (removal_modules_lexicon.$const83$termStrings.eql(arguments.support_sentence_operator(support))) {
            thread.resetMultipleValues();
            final SubLObject v_term = destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject ans = (SubLObject)removal_modules_lexicon.NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == forts.fort_p(v_term) && removal_modules_lexicon.NIL != ((removal_modules_lexicon.$kw84$TRUE == arguments.support_truth(support)) ? removal_modules_term_strings.removal_term_strings_check_pos_output_check(v_term, string) : removal_modules_term_strings.removal_term_strings_check_neg_output_check(v_term, string)));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        if (removal_modules_lexicon.NIL == lexical_only_term_phrases_asent_p(arguments.support_sentence(support))) {
            SubLObject ans2 = (SubLObject)removal_modules_lexicon.NIL;
            thread.resetMultipleValues();
            final SubLObject v_term2 = destructure_term_phrases_support(support);
            final SubLObject string2 = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                final SubLObject parsed_terms = psp_main.inference_ps_get_cycls_for_phrase(string2, constraint, case_insensitiveP);
                ans2 = (SubLObject)((removal_modules_lexicon.$kw84$TRUE == arguments.support_truth(support)) ? list_utilities.member_equalP(v_term2, parsed_terms) : SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == list_utilities.member_equalP(v_term2, parsed_terms)));
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            }
            return ans2;
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 25160L)
    public static SubLObject hl_justify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = arguments.support_mt(support);
        SubLObject supports = (SubLObject)removal_modules_lexicon.NIL;
        if (removal_modules_lexicon.$kw84$TRUE == arguments.support_truth(support)) {
            thread.resetMultipleValues();
            final SubLObject v_term = destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            final SubLObject lexical_onlyP = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                supports = get_term_phrases_supports(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 25603L)
    public static SubLObject destructure_term_phrases_support(final SubLObject support) {
        final SubLObject asent = arguments.support_sentence(support);
        final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p(asent);
        final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
        SubLObject v_term = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject constraint = (SubLObject)removal_modules_lexicon.NIL;
        final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (pcase_var.eql(removal_modules_lexicon.$const87$termPhrases) || pcase_var.eql(removal_modules_lexicon.$const88$termPhrases_Lexical) || pcase_var.eql(removal_modules_lexicon.$const89$termPhrases_CaseInsensitive) || pcase_var.eql(removal_modules_lexicon.$const90$termPhrases_CaseInsensitive_Lexic)) {
            final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            v_term = datum_evaluated_var.first();
            constraint = conses_high.cadr(datum_evaluated_var);
            string = conses_high.cddr(datum_evaluated_var).first();
        }
        else if (pcase_var.eql(removal_modules_lexicon.$const83$termStrings)) {
            final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            v_term = datum_evaluated_var.first();
            string = conses_high.cadr(datum_evaluated_var);
            constraint = removal_modules_lexicon.$const91$CharacterString;
        }
        return Values.values(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 26318L)
    public static SubLObject hl_forward_mt_combos_term_phrases(final SubLObject support) {
        final SubLObject meta_supports = hl_justify_term_phrases(support);
        SubLObject mts = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject supports = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject cdolist_list_var = meta_supports;
        SubLObject meta_support = (SubLObject)removal_modules_lexicon.NIL;
        meta_support = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            if (removal_modules_lexicon.NIL != assertion_handles.assertion_p(meta_support)) {
                final SubLObject item_var = assertions_high.assertion_mt(meta_support);
                if (removal_modules_lexicon.NIL == conses_high.member(item_var, mts, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_lexicon.IDENTITY))) {
                    mts = (SubLObject)ConsesLow.cons(item_var, mts);
                }
            }
            else if (removal_modules_lexicon.NIL != arguments.hl_support_p(meta_support)) {
                SubLObject cdolist_list_var_$26 = hl_supports.hl_forward_mt_combos(meta_support);
                SubLObject meta_meta_support = (SubLObject)removal_modules_lexicon.NIL;
                meta_meta_support = cdolist_list_var_$26.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var_$26) {
                    final SubLObject item_var2 = arguments.support_mt(meta_meta_support);
                    if (removal_modules_lexicon.NIL == conses_high.member(item_var2, mts, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_lexicon.IDENTITY))) {
                        mts = (SubLObject)ConsesLow.cons(item_var2, mts);
                    }
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    meta_meta_support = cdolist_list_var_$26.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        }
        SubLObject hl_module = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject el_sentence = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject mt = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject tv = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(support, support, (SubLObject)removal_modules_lexicon.$list92);
        hl_module = support.first();
        SubLObject current = support.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list92);
        el_sentence = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list92);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, support, (SubLObject)removal_modules_lexicon.$list92);
        tv = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(mts, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            SubLObject mt_$27 = (SubLObject)removal_modules_lexicon.NIL;
            mt_$27 = cdolist_list_var2.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var2) {
                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support(hl_module, el_sentence, mt_$27, tv), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$27 = cdolist_list_var2.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(support, (SubLObject)removal_modules_lexicon.$list92);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 26988L)
    public static SubLObject supports_have_predsP(final SubLObject supports, final SubLObject preds) {
        return list_utilities.sets_equalP(preds, get_supports_preds(supports), (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 27102L)
    public static SubLObject get_supports_preds(final SubLObject supports) {
        return Mapping.mapcar((SubLObject)removal_modules_lexicon.$sym94$SUPPORT_SENTENCE_OPERATOR, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 27203L)
    public static SubLObject hl_verify_and_justify_term_phrases(final SubLObject support) {
        final SubLObject narty_support = narts_high.nart_substitute(support);
        return (SubLObject)((removal_modules_lexicon.NIL != hl_verify_term_phrases(narty_support)) ? hl_justify_term_phrases(narty_support) : removal_modules_lexicon.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 33777L)
    public static SubLObject removal_term_phrases_required(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        return control_vars.lexicon_initialized_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 33959L)
    public static SubLObject get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, SubLObject case_insensitiveP, SubLObject lexical_onlyP) {
        if (case_insensitiveP == removal_modules_lexicon.UNPROVIDED) {
            case_insensitiveP = (SubLObject)removal_modules_lexicon.NIL;
        }
        if (lexical_onlyP == removal_modules_lexicon.UNPROVIDED) {
            lexical_onlyP = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = list_utilities.remove_if_not((SubLObject)removal_modules_lexicon.$sym104$SUPPORT_P, nl_trie_accessors.nl_trie_get_term_phrases_supports(denot, string, constraint, case_insensitiveP, mt_relevance_macros.$mt$.getDynamicValue(thread)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject pos = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject pos_pred = (SubLObject)removal_modules_lexicon.NIL;
        if (removal_modules_lexicon.NIL == supports && removal_modules_lexicon.NIL == lexical_onlyP) {
            supports = get_non_lexical_term_phrases_supports(denot, string, constraint, case_insensitiveP);
        }
        if (removal_modules_lexicon.NIL != supports) {
            SubLObject pos_pred_support = Sequences.find_if((SubLObject)removal_modules_lexicon.$sym105$SPEECH_PART_PRED_, supports, (SubLObject)removal_modules_lexicon.$sym94$SUPPORT_SENTENCE_OPERATOR, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            if (removal_modules_lexicon.NIL != pos_pred_support) {
                pos_pred = arguments.support_sentence_operator(pos_pred_support);
            }
            if (removal_modules_lexicon.NIL == pos_pred) {
                pos_pred_support = Sequences.find(removal_modules_lexicon.$const106$abbreviationForLexicalWord, supports, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQL), (SubLObject)removal_modules_lexicon.$sym94$SUPPORT_SENTENCE_OPERATOR, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                if (removal_modules_lexicon.NIL != pos_pred_support) {
                    pos_pred = cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(pos_pred_support), (SubLObject)removal_modules_lexicon.UNPROVIDED);
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_utilities.preds_to_pos_args())); removal_modules_lexicon.NIL == pos && removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject pos_arg = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pos_support = Sequences.find(pred, supports, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), (SubLObject)removal_modules_lexicon.$sym94$SUPPORT_SENTENCE_OPERATOR, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                if (removal_modules_lexicon.NIL != pos_support) {
                    pos = cycl_utilities.atomic_sentence_arg(arguments.support_sentence(pos_support), pos_arg, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if (removal_modules_lexicon.NIL != lexicon_accessors.speech_partP(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED) && !pos.equal(constraint)) {
                SubLObject cdolist_list_var = backward.removal_ask_justifications((SubLObject)ConsesLow.list(removal_modules_lexicon.$const108$genls, pos, constraint), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_lexicon.$kw84$TRUE, (SubLObject)removal_modules_lexicon.$list109).first();
                SubLObject support = (SubLObject)removal_modules_lexicon.NIL;
                support = cdolist_list_var.first();
                while (removal_modules_lexicon.NIL != cdolist_list_var) {
                    final SubLObject item_var = support;
                    if (removal_modules_lexicon.NIL == conses_high.member(item_var, supports, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym107$SUPPORT_SENTENCE))) {
                        supports = (SubLObject)ConsesLow.cons(item_var, supports);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
        }
        if (removal_modules_lexicon.NIL != pos && removal_modules_lexicon.NIL != pos_pred && removal_modules_lexicon.NIL == conses_high.member(removal_modules_lexicon.$const74$speechPartPreds, supports, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQL), (SubLObject)removal_modules_lexicon.$sym94$SUPPORT_SENTENCE_OPERATOR)) {
            SubLObject cdolist_list_var = backward.removal_ask_justifications((SubLObject)ConsesLow.list(removal_modules_lexicon.$const74$speechPartPreds, pos, pos_pred), mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_lexicon.$kw84$TRUE, (SubLObject)removal_modules_lexicon.$list109).first();
            SubLObject support = (SubLObject)removal_modules_lexicon.NIL;
            support = cdolist_list_var.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                final SubLObject item_var = support;
                if (removal_modules_lexicon.NIL == conses_high.member(item_var, supports, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym107$SUPPORT_SENTENCE))) {
                    supports = (SubLObject)ConsesLow.cons(item_var, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 35716L)
    public static SubLObject get_non_lexical_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, final SubLObject case_insensitiveP) {
        SubLObject supports = (SubLObject)removal_modules_lexicon.NIL;
        if (string.isString()) {
            supports = psp_main.psp_hl_justify_parse(string, constraint, denot, case_insensitiveP);
        }
        if (removal_modules_lexicon.NIL != list_utilities.empty_list_p(supports)) {
            SubLObject cdolist_list_var = pph_methods_lexicon.hl_justify_string_for_term(denot, string, preds_from_term_phrases_constraint(constraint), case_insensitiveP);
            SubLObject support = (SubLObject)removal_modules_lexicon.NIL;
            support = cdolist_list_var.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                if (removal_modules_lexicon.NIL == formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), (SubLObject)ConsesLow.list((SubLObject)removal_modules_lexicon.$list110, denot, constraint, string))) {
                    supports = (SubLObject)ConsesLow.cons(support, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 36369L)
    public static SubLObject do_lexical_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject v_term = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject predicate = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject index_arg = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list111);
        gaf = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list111);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list111);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list111);
        index_arg = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)removal_modules_lexicon.$sym112$PIF, (SubLObject)ConsesLow.list((SubLObject)removal_modules_lexicon.$sym113$INDEXED_TERM_P, v_term), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_lexicon.$sym114$DO_GAF_ARG_INDEX, (SubLObject)ConsesLow.listS(gaf, new SubLObject[] { v_term, removal_modules_lexicon.$kw115$PREDICATE, predicate, removal_modules_lexicon.$kw116$INDEX, index_arg, removal_modules_lexicon.$list117 }), ConsesLow.append(body, (SubLObject)removal_modules_lexicon.NIL)), (SubLObject)ConsesLow.listS((SubLObject)removal_modules_lexicon.$sym118$DO_GAF_ARG_INDEX_NAUT, (SubLObject)ConsesLow.listS(gaf, new SubLObject[] { v_term, removal_modules_lexicon.$kw115$PREDICATE, predicate, removal_modules_lexicon.$kw116$INDEX, index_arg, removal_modules_lexicon.$list117 }), ConsesLow.append(body, (SubLObject)removal_modules_lexicon.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list111);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 36704L)
    public static SubLObject removal_term_phrases_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject v_term = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject constraint = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg3 = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list119);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list119);
        constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list119);
        arg3 = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject preds = preds_from_term_phrases_constraint(constraint);
            final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
            if (removal_modules_lexicon.NIL != preds) {
                final SubLObject strings = removal_modules_term_strings.inference_strings_for_term(v_term, preds, lexical_onlyP);
                add_term_phrases_removal_nodes(strings, asent, arg3);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list119);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37179L)
    public static SubLObject add_term_phrases_removal_nodes(final SubLObject values, final SubLObject asent, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = values;
        SubLObject value = (SubLObject)removal_modules_lexicon.NIL;
        value = cdolist_list_var.first();
        while (removal_modules_lexicon.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = (removal_modules_lexicon.NIL != case_insensitive_term_phrases_asent_p(asent)) ? term_unify_case_insensitive(value, target, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T) : unification_utilities.term_unify(value, target, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_lexicon.NIL != v_bindings) {
                final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = make_term_phrases_support(formula);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37686L)
    public static SubLObject make_term_phrases_support(final SubLObject formula) {
        return arguments.make_hl_support((SubLObject)removal_modules_lexicon.$kw120$TERM_PHRASES, formula, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37790L)
    public static SubLObject term_unify_case_insensitive(final SubLObject value, final SubLObject target, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == removal_modules_lexicon.UNPROVIDED) {
            share_vars = (SubLObject)removal_modules_lexicon.T;
        }
        if (justifyP == removal_modules_lexicon.UNPROVIDED) {
            justifyP = (SubLObject)removal_modules_lexicon.NIL;
        }
        return unification_utilities.term_unify(value.isString() ? Strings.string_downcase(value, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED) : value, target.isString() ? Strings.string_downcase(target, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED) : target, share_vars, justifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 38048L)
    public static SubLObject preds_from_term_phrases_constraint(final SubLObject constraint) {
        SubLObject preds = (SubLObject)removal_modules_lexicon.NIL;
        if (removal_modules_lexicon.NIL != lexicon_accessors.speech_partP(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
            preds = lexicon_accessors.all_preds_of_pos(constraint);
        }
        else if (removal_modules_lexicon.NIL != lexicon_accessors.speech_part_predP(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
            preds = Sequences.remove_if(Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym121$GENERIC_PRED_), genl_predicates.all_spec_preds(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        else if (removal_modules_lexicon.NIL != isa.isaP(constraint, removal_modules_lexicon.$const122$StringIndexingSlot, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
            preds = list_utilities.remove_if_not((SubLObject)removal_modules_lexicon.$sym123$NAME_STRING_PRED_, genl_predicates.all_spec_preds(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        else if (constraint.eql(removal_modules_lexicon.$const124$ProperNameString)) {
            preds = list_utilities.remove_if_not((SubLObject)removal_modules_lexicon.$sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values(removal_modules_lexicon.$const124$ProperNameString, removal_modules_lexicon.$const125$arg2Isa, (SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.UNPROVIDED), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        else if (constraint.eql(removal_modules_lexicon.$const91$CharacterString)) {
            preds = (SubLObject)removal_modules_lexicon.$kw126$ALL;
        }
        if (removal_modules_lexicon.NIL == lexicon_accessors.speech_partP(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
            final SubLObject pos_of_cat = lexicon_utilities.pos_of_cat(constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            if (removal_modules_lexicon.NIL != pos_of_cat) {
                final SubLObject items_var = preds_from_term_phrases_constraint(pos_of_cat);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = (SubLObject)removal_modules_lexicon.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)removal_modules_lexicon.NIL, v_iteration = (SubLObject)removal_modules_lexicon.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)removal_modules_lexicon.ONE_INTEGER)) {
                        element_num = ((removal_modules_lexicon.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)removal_modules_lexicon.ONE_INTEGER) : v_iteration);
                        item = Vectors.aref(vector_var, element_num);
                        preds = (SubLObject)ConsesLow.cons(item, preds);
                    }
                }
                else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = (SubLObject)removal_modules_lexicon.NIL;
                    item2 = cdolist_list_var.first();
                    while (removal_modules_lexicon.NIL != cdolist_list_var) {
                        preds = (SubLObject)ConsesLow.cons(item2, preds);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    }
                }
                preds = Sequences.delete_duplicates(preds, Symbols.symbol_function((SubLObject)removal_modules_lexicon.EQUAL), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
            }
        }
        if (preds != removal_modules_lexicon.$kw126$ALL && removal_modules_lexicon.NIL != genls.genlP(removal_modules_lexicon.$const127$NLWordForm, constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
            preds = (SubLObject)removal_modules_lexicon.$kw126$ALL;
        }
        if (removal_modules_lexicon.NIL != genls.genlP(removal_modules_lexicon.$const128$NounPhrase, constraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED) && preds.isList()) {
            preds = ConsesLow.append(preds, list_utilities.remove_if_not((SubLObject)removal_modules_lexicon.$sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values(removal_modules_lexicon.$const124$ProperNameString, removal_modules_lexicon.$const125$arg2Isa, (SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.UNPROVIDED), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED));
            preds = ConsesLow.append(preds, genl_predicates.all_spec_preds(removal_modules_lexicon.$const129$nonSingular_Generic, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED));
        }
        return preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 39310L)
    public static SubLObject generic_predP(final SubLObject pred) {
        return isa.isaP(pred, removal_modules_lexicon.$const130$GenericSpeechPartPredicate, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 44519L)
    public static SubLObject removal_term_phrases_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject arg1 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject constraint = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list147);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list147);
        constraint = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list147);
        string = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject preds = preds_from_term_phrases_constraint(constraint);
            final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p(asent);
            final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)((removal_modules_lexicon.NIL == case_insensitiveP) ? removal_modules_lexicon.$kw148$ON : removal_modules_lexicon.$kw149$OFF), thread);
                if (preds.isList()) {
                    SubLObject found_oneP = (SubLObject)removal_modules_lexicon.NIL;
                    SubLObject support_sentence = el_utilities.copy_expression(asent);
                    SubLObject no_lexical_denotsP = (SubLObject)removal_modules_lexicon.NIL;
                    final SubLObject _prev_bind_0_$28 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                    try {
                        lexicon_vars.$parse_morphologically$.bind((SubLObject)removal_modules_lexicon.$kw150$NEVER, thread);
                        SubLObject cdolist_list_var = preds;
                        SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
                        pred = cdolist_list_var.first();
                        while (removal_modules_lexicon.NIL != cdolist_list_var) {
                            final SubLObject denots = inference_denots_of_stringXpred(string, pred);
                            if (removal_modules_lexicon.NIL != denots) {
                                found_oneP = (SubLObject)removal_modules_lexicon.T;
                                support_sentence = el_utilities.nreplace_formula_arg((SubLObject)removal_modules_lexicon.TWO_INTEGER, pred, support_sentence);
                                add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pred = cdolist_list_var.first();
                        }
                        no_lexical_denotsP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == found_oneP);
                    }
                    finally {
                        lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_$28, thread);
                    }
                    if (removal_modules_lexicon.NIL != no_lexical_denotsP) {
                        final SubLObject _prev_bind_0_$29 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                        try {
                            lexicon_vars.$parse_morphologically$.bind((SubLObject)removal_modules_lexicon.$kw151$ONLY, thread);
                            SubLObject cdolist_list_var = preds;
                            SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
                            pred = cdolist_list_var.first();
                            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                                final SubLObject denots = inference_denots_of_stringXpred(string, pred);
                                if (removal_modules_lexicon.NIL != denots) {
                                    found_oneP = (SubLObject)removal_modules_lexicon.T;
                                    support_sentence = el_utilities.nreplace_formula_arg((SubLObject)removal_modules_lexicon.TWO_INTEGER, pred, support_sentence);
                                    add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            }
                            no_lexical_denotsP = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == found_oneP);
                        }
                        finally {
                            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                }
                else {
                    add_term_phrases_removal_nodes(inference_denots_of_string(string), asent, arg1);
                }
            }
            finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_lexicon.NIL == lexical_onlyP) {
                SubLObject timed_outP = (SubLObject)removal_modules_lexicon.NIL;
                if (removal_modules_lexicon.NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)removal_modules_lexicon.ZERO_INTEGER, thread);
                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                        if (removal_modules_lexicon.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                        }
                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                    }
                    finally {
                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_4, thread);
                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_3, thread);
                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_2, thread);
                    }
                }
                else {
                    add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                    timed_outP = (SubLObject)removal_modules_lexicon.NIL;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list147);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 45941L)
    public static SubLObject case_insensitive_term_phrases_asent_p(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), (SubLObject)removal_modules_lexicon.$list152, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46134L)
    public static SubLObject lexical_only_term_phrases_asent_p(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), (SubLObject)removal_modules_lexicon.$list153, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46311L)
    public static SubLObject inference_denots_of_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)removal_modules_lexicon.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            denots = lexicon_accessors.denots_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46487L)
    public static SubLObject inference_denots_of_stringXpred(final SubLObject string, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = (SubLObject)removal_modules_lexicon.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            denots = lexicon_accessors.denots_of_stringXpred(string, pred, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 47889L)
    public static SubLObject removal_term_phrases_unify_arg1_and_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_lexicon.UNPROVIDED) {
            sense = (SubLObject)removal_modules_lexicon.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject arg1 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        string = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)((removal_modules_lexicon.NIL == case_insensitive_term_phrases_asent_p(asent)) ? removal_modules_lexicon.$kw148$ON : removal_modules_lexicon.$kw149$OFF), thread);
                thread.resetMultipleValues();
                final SubLObject denots = lexicon_accessors.denots_of_string(string, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                final SubLObject pred_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                add_term_phrases_arg1_and_arg2_removal_nodes(asent, denots, pred_lists);
            }
            finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            if (removal_modules_lexicon.NIL == lexical_only_term_phrases_asent_p(asent)) {
                SubLObject timed_outP = (SubLObject)removal_modules_lexicon.NIL;
                if (removal_modules_lexicon.NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)removal_modules_lexicon.ZERO_INTEGER, thread);
                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                        if (removal_modules_lexicon.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            SubLObject cdolist_list_var = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, case_insensitive_term_phrases_asent_p(asent));
                            SubLObject pair = (SubLObject)removal_modules_lexicon.NIL;
                            pair = cdolist_list_var.first();
                            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                                SubLObject current_$31;
                                final SubLObject datum_$30 = current_$31 = pair;
                                SubLObject denot = (SubLObject)removal_modules_lexicon.NIL;
                                SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)removal_modules_lexicon.$list159);
                                denot = current_$31.first();
                                current_$31 = current_$31.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)removal_modules_lexicon.$list159);
                                pred = current_$31.first();
                                current_$31 = current_$31.rest();
                                if (removal_modules_lexicon.NIL == current_$31) {
                                    add_term_phrases_arg1_and_arg2_removal_node(asent, denot, pred);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$30, (SubLObject)removal_modules_lexicon.$list159);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            }
                        }
                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                    }
                    finally {
                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_5, thread);
                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_4, thread);
                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_3, thread);
                    }
                }
                else {
                    SubLObject cdolist_list_var2 = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, case_insensitive_term_phrases_asent_p(asent));
                    SubLObject pair2 = (SubLObject)removal_modules_lexicon.NIL;
                    pair2 = cdolist_list_var2.first();
                    while (removal_modules_lexicon.NIL != cdolist_list_var2) {
                        SubLObject current_$32;
                        final SubLObject datum_$31 = current_$32 = pair2;
                        SubLObject denot2 = (SubLObject)removal_modules_lexicon.NIL;
                        SubLObject pred2 = (SubLObject)removal_modules_lexicon.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)removal_modules_lexicon.$list159);
                        denot2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$32, datum_$31, (SubLObject)removal_modules_lexicon.$list159);
                        pred2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        if (removal_modules_lexicon.NIL == current_$32) {
                            add_term_phrases_arg1_and_arg2_removal_node(asent, denot2, pred2);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$31, (SubLObject)removal_modules_lexicon.$list159);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pair2 = cdolist_list_var2.first();
                    }
                    timed_outP = (SubLObject)removal_modules_lexicon.NIL;
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list158);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 48852L)
    public static SubLObject add_term_phrases_arg1_and_arg2_removal_nodes(final SubLObject asent, final SubLObject denots, final SubLObject pred_lists) {
        SubLObject denot = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject denot_$34 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject pred_list = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject pred_list_$35 = (SubLObject)removal_modules_lexicon.NIL;
        denot = denots;
        denot_$34 = denot.first();
        pred_list = pred_lists;
        pred_list_$35 = pred_list.first();
        while (removal_modules_lexicon.NIL != pred_list || removal_modules_lexicon.NIL != denot) {
            SubLObject cdolist_list_var = pred_list_$35;
            SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
            pred = cdolist_list_var.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                add_term_phrases_arg1_and_arg2_removal_node(asent, denot_$34, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
            denot = denot.rest();
            denot_$34 = denot.first();
            pred_list = pred_list.rest();
            pred_list_$35 = pred_list.first();
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 49121L)
    public static SubLObject add_term_phrases_arg1_and_arg2_removal_node(final SubLObject asent, final SubLObject denot, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject arg1 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg2 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list158);
        string = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            thread.resetMultipleValues();
            final SubLObject denot_bindings = unification_utilities.term_unify(denot, arg1, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
            final SubLObject denot_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = term_phrases_constraints_from_pred(pred);
            SubLObject constraint = (SubLObject)removal_modules_lexicon.NIL;
            constraint = cdolist_list_var.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject constraint_bindings = unification_utilities.term_unify(constraint, arg2, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                final SubLObject constraint_unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_lexicon.NIL == bindings.some_variable_with_conflicting_bindings(denot_bindings, constraint_bindings)) {
                    final SubLObject all_bindings = ConsesLow.append(denot_bindings, constraint_bindings);
                    final SubLObject formula = bindings.subst_bindings(all_bindings, asent);
                    final SubLObject hl_support = make_term_phrases_support(formula);
                    backward.removal_add_node(hl_support, all_bindings, ConsesLow.append(denot_unify_justification, constraint_unify_justification));
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list158);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 49982L)
    public static SubLObject term_phrases_constraints_from_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraints = (SubLObject)ConsesLow.list(removal_modules_lexicon.$const91$CharacterString);
        final SubLObject name_string_predP = lexicon_vars.name_string_predP(pred);
        final SubLObject pos = (SubLObject)((removal_modules_lexicon.NIL != name_string_predP || removal_modules_lexicon.NIL == lexicon_accessors.speech_part_predP(pred, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? removal_modules_lexicon.NIL : lexicon_accessors.pos_of_pred(pred));
        final SubLObject deck_type = (SubLObject)removal_modules_lexicon.$kw17$QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = (SubLObject)removal_modules_lexicon.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)removal_modules_lexicon.NIL;
                final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((removal_modules_lexicon.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_lexicon.NIL != tv_var) ? removal_modules_lexicon.$sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (removal_modules_lexicon.NIL != tv_var && removal_modules_lexicon.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_lexicon.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw20$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw23$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)removal_modules_lexicon.$kw25$WARN)) {
                            Errors.warn((SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds), thread);
                        if (removal_modules_lexicon.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_lexicon.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                for (node_and_predicate_mode = (SubLObject)ConsesLow.list(pred, sbhl_search_vars.genl_inverse_mode_p()); removal_modules_lexicon.NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$42 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    final SubLObject genl_predicate = node_var_$42;
                                    final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (removal_modules_lexicon.NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$42) && removal_modules_lexicon.NIL != isa.isaP(genl_predicate, removal_modules_lexicon.$const160$TermPhrasesConstraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                            constraints = (SubLObject)ConsesLow.cons(genl_predicate, constraints);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const27$genlPreds));
                                        SubLObject module_var = (SubLObject)removal_modules_lexicon.NIL;
                                        module_var = cdolist_list_var.first();
                                        while (removal_modules_lexicon.NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$42);
                                                if (removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                    if (removal_modules_lexicon.NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                        if (removal_modules_lexicon.NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (removal_modules_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$47;
                                                                        for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (removal_modules_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (removal_modules_lexicon.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)removal_modules_lexicon.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = (SubLObject)removal_modules_lexicon.NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (removal_modules_lexicon.NIL != csome_list_var) {
                                                                                            if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.FIVE_INTEGER, (SubLObject)removal_modules_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                    }
                                                }
                                                else if (removal_modules_lexicon.NIL != obsolete.cnat_p(node, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$49;
                                                    final SubLObject new_list = cdolist_list_var_$49 = ((removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)));
                                                    SubLObject generating_fn = (SubLObject)removal_modules_lexicon.NIL;
                                                    generating_fn = cdolist_list_var_$49.first();
                                                    while (removal_modules_lexicon.NIL != cdolist_list_var_$49) {
                                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                            if (removal_modules_lexicon.NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)removal_modules_lexicon.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol2.isList()) {
                                                                SubLObject csome_list_var2 = sol2;
                                                                SubLObject node_vars_link_node4 = (SubLObject)removal_modules_lexicon.NIL;
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                while (removal_modules_lexicon.NIL != csome_list_var2) {
                                                                    if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                        }
                                                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                        generating_fn = cdolist_list_var_$49.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$39, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lexicon.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_lexicon.NIL != name_string_predP) {
            constraints = (SubLObject)ConsesLow.cons(removal_modules_lexicon.$const124$ProperNameString, constraints);
            constraints = (SubLObject)ConsesLow.cons(removal_modules_lexicon.$const128$NounPhrase, constraints);
            final SubLObject deck_type_$53 = (SubLObject)removal_modules_lexicon.$kw17$QUEUE;
            final SubLObject recur_deck_$54 = deck.create_deck(deck_type_$53);
            final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var2 = (SubLObject)removal_modules_lexicon.NIL;
                    final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_lexicon.NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_lexicon.NIL != tv_var2) ? removal_modules_lexicon.$sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_lexicon.NIL != tv_var2 && removal_modules_lexicon.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_lexicon.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw20$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw23$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw25$WARN)) {
                                Errors.warn((SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const161$isa), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const161$isa)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const161$isa)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const161$isa), thread);
                            if (removal_modules_lexicon.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_lexicon.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const161$isa));
                                    SubLObject module_var2 = (SubLObject)removal_modules_lexicon.NIL;
                                    module_var2 = cdolist_list_var2.first();
                                    while (removal_modules_lexicon.NIL != cdolist_list_var2) {
                                        final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            final SubLObject node2 = function_terms.naut_to_nart(pred);
                                            if (removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                if (removal_modules_lexicon.NIL != d_link2) {
                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                    if (removal_modules_lexicon.NIL != mt_links2) {
                                                        SubLObject iteration_state2;
                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (removal_modules_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                    SubLObject iteration_state_$48;
                                                                    for (iteration_state_$48 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$48); iteration_state_$48 = dictionary_contents.do_dictionary_contents_next(iteration_state_$48)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$48);
                                                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (removal_modules_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                            final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                final SubLObject sol3 = link_nodes3;
                                                                                if (removal_modules_lexicon.NIL != set.set_p(sol3)) {
                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                    SubLObject basis_object3;
                                                                                    SubLObject state3;
                                                                                    SubLObject node_vars_link_node5;
                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)removal_modules_lexicon.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                        node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                        if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node5, recur_deck_$54);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol3.isList()) {
                                                                                    SubLObject csome_list_var3 = sol3;
                                                                                    SubLObject node_vars_link_node6 = (SubLObject)removal_modules_lexicon.NIL;
                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                    while (removal_modules_lexicon.NIL != csome_list_var3) {
                                                                                        if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node6, recur_deck_$54);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$48);
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.FIVE_INTEGER, (SubLObject)removal_modules_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                }
                                            }
                                            else if (removal_modules_lexicon.NIL != obsolete.cnat_p(node2, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                SubLObject cdolist_list_var_$50;
                                                final SubLObject new_list2 = cdolist_list_var_$50 = ((removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)));
                                                SubLObject generating_fn2 = (SubLObject)removal_modules_lexicon.NIL;
                                                generating_fn2 = cdolist_list_var_$50.first();
                                                while (removal_modules_lexicon.NIL != cdolist_list_var_$50) {
                                                    final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                        final SubLObject sol4;
                                                        final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                                        if (removal_modules_lexicon.NIL != set.set_p(sol4)) {
                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                            SubLObject basis_object4;
                                                            SubLObject state4;
                                                            SubLObject node_vars_link_node7;
                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)removal_modules_lexicon.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node7, recur_deck_$54);
                                                                }
                                                            }
                                                        }
                                                        else if (sol4.isList()) {
                                                            SubLObject csome_list_var4 = sol4;
                                                            SubLObject node_vars_link_node8 = (SubLObject)removal_modules_lexicon.NIL;
                                                            node_vars_link_node8 = csome_list_var4.first();
                                                            while (removal_modules_lexicon.NIL != csome_list_var4) {
                                                                if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node8, recur_deck_$54);
                                                                }
                                                                csome_list_var4 = csome_list_var4.rest();
                                                                node_vars_link_node8 = csome_list_var4.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                    }
                                                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                    generating_fn2 = cdolist_list_var_$50.first();
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        module_var2 = cdolist_list_var2.first();
                                    }
                                    SubLObject node_var_$43 = deck.deck_pop(recur_deck_$54);
                                    final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), thread);
                                        while (removal_modules_lexicon.NIL != node_var_$43) {
                                            final SubLObject v_isa = node_var_$43;
                                            if (removal_modules_lexicon.NIL != isa.isaP(v_isa, removal_modules_lexicon.$const160$TermPhrasesConstraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                constraints = (SubLObject)ConsesLow.cons(v_isa, constraints);
                                            }
                                            SubLObject cdolist_list_var3;
                                            final SubLObject accessible_modules3 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                            SubLObject module_var3 = (SubLObject)removal_modules_lexicon.NIL;
                                            module_var3 = cdolist_list_var3.first();
                                            while (removal_modules_lexicon.NIL != cdolist_list_var3) {
                                                final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var3, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node3 = function_terms.naut_to_nart(node_var_$43);
                                                    if (removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node3)) {
                                                        final SubLObject d_link3 = sbhl_graphs.get_sbhl_graph_link(node3, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                        if (removal_modules_lexicon.NIL != d_link3) {
                                                            final SubLObject mt_links3 = sbhl_links.get_sbhl_mt_links(d_link3, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                            if (removal_modules_lexicon.NIL != mt_links3) {
                                                                SubLObject iteration_state3;
                                                                for (iteration_state3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links3)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state3); iteration_state3 = dictionary_contents.do_dictionary_contents_next(iteration_state3)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state3);
                                                                    final SubLObject tv_links3 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (removal_modules_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$49;
                                                                            for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links3)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                                final SubLObject link_nodes5 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (removal_modules_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv3)) {
                                                                                    final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv3, thread);
                                                                                        final SubLObject sol5 = link_nodes5;
                                                                                        if (removal_modules_lexicon.NIL != set.set_p(sol5)) {
                                                                                            final SubLObject set_contents_var5 = set.do_set_internal(sol5);
                                                                                            SubLObject basis_object5;
                                                                                            SubLObject state5;
                                                                                            SubLObject node_vars_link_node9;
                                                                                            for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = (SubLObject)removal_modules_lexicon.NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                                                                                                node_vars_link_node9 = set_contents.do_set_contents_next(basis_object5, state5);
                                                                                                if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state5, node_vars_link_node9) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node9, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node9, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node9, recur_deck_$54);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol5.isList()) {
                                                                                            SubLObject csome_list_var5 = sol5;
                                                                                            SubLObject node_vars_link_node = (SubLObject)removal_modules_lexicon.NIL;
                                                                                            node_vars_link_node = csome_list_var5.first();
                                                                                            while (removal_modules_lexicon.NIL != csome_list_var5) {
                                                                                                if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck_$54);
                                                                                                }
                                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                                node_vars_link_node = csome_list_var5.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol5);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state3);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.FIVE_INTEGER, (SubLObject)removal_modules_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (removal_modules_lexicon.NIL != obsolete.cnat_p(node3, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$51;
                                                        final SubLObject new_list3 = cdolist_list_var_$51 = ((removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)));
                                                        SubLObject generating_fn3 = (SubLObject)removal_modules_lexicon.NIL;
                                                        generating_fn3 = cdolist_list_var_$51.first();
                                                        while (removal_modules_lexicon.NIL != cdolist_list_var_$51) {
                                                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn3, thread);
                                                                final SubLObject sol6;
                                                                final SubLObject link_nodes6 = sol6 = Functions.funcall(generating_fn3, node3);
                                                                if (removal_modules_lexicon.NIL != set.set_p(sol6)) {
                                                                    final SubLObject set_contents_var6 = set.do_set_internal(sol6);
                                                                    SubLObject node_vars_link_node6;
                                                                    SubLObject basis_object6;
                                                                    SubLObject state6;
                                                                    for (basis_object6 = set_contents.do_set_contents_basis_object(set_contents_var6), state6 = (SubLObject)removal_modules_lexicon.NIL, state6 = set_contents.do_set_contents_initial_state(basis_object6, set_contents_var6); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object6, state6); state6 = set_contents.do_set_contents_update_state(state6)) {
                                                                        node_vars_link_node6 = set_contents.do_set_contents_next(basis_object6, state6);
                                                                        if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state6, node_vars_link_node6) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node6, recur_deck_$54);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol6.isList()) {
                                                                    SubLObject csome_list_var6 = sol6;
                                                                    SubLObject node_vars_link_node3 = (SubLObject)removal_modules_lexicon.NIL;
                                                                    node_vars_link_node3 = csome_list_var6.first();
                                                                    while (removal_modules_lexicon.NIL != csome_list_var6) {
                                                                        if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck_$54);
                                                                        }
                                                                        csome_list_var6 = csome_list_var6.rest();
                                                                        node_vars_link_node3 = csome_list_var6.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol6);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$56, thread);
                                                            }
                                                            cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                            generating_fn3 = cdolist_list_var_$51.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$45, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                }
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                module_var3 = cdolist_list_var3.first();
                                            }
                                            node_var_$43 = deck.deck_pop(recur_deck_$54);
                                        }
                                    }
                                    finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$43, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$47, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$46, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$45, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lexicon.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            }
        }
        else if (removal_modules_lexicon.NIL != pos) {
            if (removal_modules_lexicon.NIL != lexicon_accessors.genl_pos_predP(pred, removal_modules_lexicon.$const129$nonSingular_Generic, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                constraints = (SubLObject)ConsesLow.cons(removal_modules_lexicon.$const128$NounPhrase, constraints);
            }
            SubLObject node_var_$44 = pos;
            final SubLObject deck_type_$54 = (SubLObject)removal_modules_lexicon.$kw16$STACK;
            final SubLObject recur_deck_$55 = deck.create_deck(deck_type_$54);
            final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var2 = (SubLObject)removal_modules_lexicon.NIL;
                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind((removal_modules_lexicon.NIL != tv_var2) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((removal_modules_lexicon.NIL != tv_var2) ? removal_modules_lexicon.$sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if (removal_modules_lexicon.NIL != tv_var2 && removal_modules_lexicon.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && removal_modules_lexicon.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw20$ERROR)) {
                                sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw23$CERROR)) {
                                sbhl_paranoia.sbhl_cerror((SubLObject)removal_modules_lexicon.ONE_INTEGER, (SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                            else if (pcase_var2.eql((SubLObject)removal_modules_lexicon.$kw25$WARN)) {
                                Errors.warn((SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                            else {
                                Errors.warn((SubLObject)removal_modules_lexicon.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror((SubLObject)removal_modules_lexicon.$str24$continue_anyway, (SubLObject)removal_modules_lexicon.$str21$_A_is_not_a__A, tv_var2, (SubLObject)removal_modules_lexicon.$sym22$SBHL_TRUE_TV_P);
                            }
                        }
                        final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls), thread);
                            if (removal_modules_lexicon.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || removal_modules_lexicon.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) {
                                final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)removal_modules_lexicon.NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$44, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                    while (removal_modules_lexicon.NIL != node_var_$44) {
                                        final SubLObject genl = node_var_$44;
                                        if (removal_modules_lexicon.NIL != isa.isaP(genl, removal_modules_lexicon.$const160$TermPhrasesConstraint, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                            constraints = (SubLObject)ConsesLow.cons(genl, constraints);
                                        }
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(removal_modules_lexicon.$const108$genls));
                                        SubLObject module_var2 = (SubLObject)removal_modules_lexicon.NIL;
                                        module_var2 = cdolist_list_var2.first();
                                        while (removal_modules_lexicon.NIL != cdolist_list_var2) {
                                            final SubLObject _prev_bind_0_$61 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((removal_modules_lexicon.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$44);
                                                if (removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                    final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                    if (removal_modules_lexicon.NIL != d_link2) {
                                                        final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED));
                                                        if (removal_modules_lexicon.NIL != mt_links2) {
                                                            SubLObject iteration_state2;
                                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (removal_modules_lexicon.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                    final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                        SubLObject iteration_state_$50;
                                                                        for (iteration_state_$50 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); removal_modules_lexicon.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$50); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next(iteration_state_$50)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$50);
                                                                            final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (removal_modules_lexicon.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol3 = link_nodes3;
                                                                                    if (removal_modules_lexicon.NIL != set.set_p(sol3)) {
                                                                                        final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                        SubLObject basis_object3;
                                                                                        SubLObject state3;
                                                                                        SubLObject node_vars_link_node5;
                                                                                        for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)removal_modules_lexicon.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                            node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                            if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node5, recur_deck_$55);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol3.isList()) {
                                                                                        SubLObject csome_list_var3 = sol3;
                                                                                        SubLObject node_vars_link_node6 = (SubLObject)removal_modules_lexicon.NIL;
                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                        while (removal_modules_lexicon.NIL != csome_list_var3) {
                                                                                            if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node6, recur_deck_$55);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node6 = csome_list_var3.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$63, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$50);
                                                                    }
                                                                    finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$62, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                        }
                                                    }
                                                    else {
                                                        sbhl_paranoia.sbhl_error((SubLObject)removal_modules_lexicon.FIVE_INTEGER, (SubLObject)removal_modules_lexicon.$str29$attempting_to_bind_direction_link, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                    }
                                                }
                                                else if (removal_modules_lexicon.NIL != obsolete.cnat_p(node2, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$52;
                                                    final SubLObject new_list2 = cdolist_list_var_$52 = ((removal_modules_lexicon.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)));
                                                    SubLObject generating_fn2 = (SubLObject)removal_modules_lexicon.NIL;
                                                    generating_fn2 = cdolist_list_var_$52.first();
                                                    while (removal_modules_lexicon.NIL != cdolist_list_var_$52) {
                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                            final SubLObject sol4;
                                                            final SubLObject link_nodes4 = sol4 = Functions.funcall(generating_fn2, node2);
                                                            if (removal_modules_lexicon.NIL != set.set_p(sol4)) {
                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                SubLObject basis_object4;
                                                                SubLObject state4;
                                                                SubLObject node_vars_link_node7;
                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)removal_modules_lexicon.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); removal_modules_lexicon.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                    node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                    if (removal_modules_lexicon.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7) && removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node7, recur_deck_$55);
                                                                    }
                                                                }
                                                            }
                                                            else if (sol4.isList()) {
                                                                SubLObject csome_list_var4 = sol4;
                                                                SubLObject node_vars_link_node8 = (SubLObject)removal_modules_lexicon.NIL;
                                                                node_vars_link_node8 = csome_list_var4.first();
                                                                while (removal_modules_lexicon.NIL != csome_list_var4) {
                                                                    if (removal_modules_lexicon.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node8, recur_deck_$55);
                                                                    }
                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                    node_vars_link_node8 = csome_list_var4.first();
                                                                }
                                                            }
                                                            else {
                                                                Errors.error((SubLObject)removal_modules_lexicon.$str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                            }
                                                        }
                                                        finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$64, thread);
                                                        }
                                                        cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                        generating_fn2 = cdolist_list_var_$52.first();
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$61, thread);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            module_var2 = cdolist_list_var2.first();
                                        }
                                        node_var_$44 = deck.deck_pop(recur_deck_$55);
                                    }
                                }
                                finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$44, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$47, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$60, thread);
                                }
                            }
                            else {
                                sbhl_paranoia.sbhl_warn((SubLObject)removal_modules_lexicon.TWO_INTEGER, (SubLObject)removal_modules_lexicon.$str30$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)removal_modules_lexicon.UNPROVIDED)), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                            }
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$46, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$59, thread);
                        }
                    }
                    finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$58, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_lexicon.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            }
        }
        return constraints;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 51248L)
    public static SubLObject removal_lexicon_namestring_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, (SubLObject)removal_modules_lexicon.UNPROVIDED);
        SubLObject pred = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject arg1 = (SubLObject)removal_modules_lexicon.NIL;
        SubLObject string = (SubLObject)removal_modules_lexicon.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list164);
        pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list164);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)removal_modules_lexicon.$list164);
        string = current.first();
        current = current.rest();
        if (removal_modules_lexicon.NIL == current) {
            SubLObject cdolist_list_var = nl_trie_accessors.nl_trie_assertions_with_string_and_namestring_pred(string, pred, (SubLObject)removal_modules_lexicon.T, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_lexicon.UNPROVIDED);
            SubLObject as = (SubLObject)removal_modules_lexicon.NIL;
            as = cdolist_list_var.first();
            while (removal_modules_lexicon.NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_formula(as), (SubLObject)ConsesLow.list((SubLObject)removal_modules_lexicon.$list165, (SubLObject)removal_modules_lexicon.$list166, string));
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (removal_modules_lexicon.NIL != success) {
                    final SubLObject name_pred = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_lexicon.$sym167$NAME_PRED, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                    final SubLObject denot = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)removal_modules_lexicon.$sym168$DENOT, (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED);
                    if (removal_modules_lexicon.NIL != lexicon_accessors.genl_pos_predP(name_pred, pred, (SubLObject)removal_modules_lexicon.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$96 = unification_utilities.term_unify(denot, arg1, (SubLObject)removal_modules_lexicon.T, (SubLObject)removal_modules_lexicon.T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject more_supports = (SubLObject)(name_pred.eql(pred) ? removal_modules_lexicon.NIL : ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_lexicon.$kw169$GENLPREDS, el_utilities.make_binary_formula(removal_modules_lexicon.$const27$genlPreds, name_pred, pred), (SubLObject)removal_modules_lexicon.UNPROVIDED, (SubLObject)removal_modules_lexicon.UNPROVIDED)));
                        if (removal_modules_lexicon.NIL != v_bindings_$96) {
                            backward.removal_add_node(as, v_bindings_$96, ConsesLow.append(more_supports, unify_justification));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)removal_modules_lexicon.$list164);
        }
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 52074L)
    public static SubLObject removal_lexicon_namestring_completeP(final SubLObject asent) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_lexicon.NIL == el_utilities.el_formula_with_operator_p(asent, removal_modules_lexicon.$const83$termStrings));
    }
    
    public static SubLObject declare_removal_modules_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_check_required", "REMOVAL-WORD-STRINGS-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_verify_word_strings", "HL-VERIFY-WORD-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_justify_word_strings", "HL-JUSTIFY-WORD-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_forward_mt_combos_word_strings", "HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_check_succeedsP", "REMOVAL-WORD-STRINGS-CHECK-SUCCEEDS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_check_expand", "REMOVAL-WORD-STRINGS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "make_word_strings_support", "MAKE-WORD-STRINGS-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_output_generate", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg2_expand", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_and_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_and_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_iterator_state_print_function_trampoline", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_iterator_state_p", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P", 1, 0, false);
        new $removal_word_strings_iterator_state_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_wsi_state_speech_part_predicate", "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_wsi_state_arg1", "REMOVAL-WSI-STATE-ARG1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_wsi_state_arg2", "REMOVAL-WSI-STATE-ARG2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_wsi_state_trie_iterator", "REMOVAL-WSI-STATE-TRIE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_wsi_state_entry_iterator", "REMOVAL-WSI-STATE-ENTRY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "_csetf_removal_wsi_state_speech_part_predicate", "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "_csetf_removal_wsi_state_arg1", "_CSETF-REMOVAL-WSI-STATE-ARG1", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "_csetf_removal_wsi_state_arg2", "_CSETF-REMOVAL-WSI-STATE-ARG2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "_csetf_removal_wsi_state_trie_iterator", "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "_csetf_removal_wsi_state_entry_iterator", "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "make_removal_word_strings_iterator_state", "MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "visit_defstruct_removal_word_strings_iterator_state", "VISIT-DEFSTRUCT-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "visit_defstruct_object_removal_word_strings_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "iterator_word_strings_done", "ITERATOR-WORD-STRINGS-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "wsi_entry_iterator_prepared_p", "WSI-ENTRY-ITERATOR-PREPARED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "wsi_advance_to_next_entry_iterator", "WSI-ADVANCE-TO-NEXT-ENTRY-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "wsi_current_word_and_string_unifyP", "WSI-CURRENT-WORD-AND-STRING-UNIFY?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "iterator_word_strings_next", "ITERATOR-WORD-STRINGS-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_and_arg2_iterator", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_and_arg2_supports", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_strings_unify_arg1_and_arg2_output_asent", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "set_up_removal_support_for_speech_part_predicate", "SET-UP-REMOVAL-SUPPORT-FOR-SPEECH-PART-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_check_required", "REMOVAL-WORD-FORMS-CHECK-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_check_cost", "REMOVAL-WORD-FORMS-CHECK-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_check_expand", "REMOVAL-WORD-FORMS-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg1_required", "REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg1_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG1-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg1_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg2_required", "REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg3_required", "REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG3-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_arg3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_1_and_2_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_1_and_2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_1_and_2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_2_and_3_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_2_and_3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_word_forms_unify_args_2_and_3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_verify_term_phrases", "HL-VERIFY-TERM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_justify_term_phrases", "HL-JUSTIFY-TERM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "destructure_term_phrases_support", "DESTRUCTURE-TERM-PHRASES-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_forward_mt_combos_term_phrases", "HL-FORWARD-MT-COMBOS-TERM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "supports_have_predsP", "SUPPORTS-HAVE-PREDS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "get_supports_preds", "GET-SUPPORTS-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "hl_verify_and_justify_term_phrases", "HL-VERIFY-AND-JUSTIFY-TERM-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_term_phrases_required", "REMOVAL-TERM-PHRASES-REQUIRED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "get_term_phrases_supports", "GET-TERM-PHRASES-SUPPORTS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "get_non_lexical_term_phrases_supports", "GET-NON-LEXICAL-TERM-PHRASES-SUPPORTS", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "do_lexical_gafs", "DO-LEXICAL-GAFS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_term_phrases_unify_arg3_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "add_term_phrases_removal_nodes", "ADD-TERM-PHRASES-REMOVAL-NODES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "make_term_phrases_support", "MAKE-TERM-PHRASES-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "term_unify_case_insensitive", "TERM-UNIFY-CASE-INSENSITIVE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "preds_from_term_phrases_constraint", "PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "generic_predP", "GENERIC-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_term_phrases_unify_arg1_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "case_insensitive_term_phrases_asent_p", "CASE-INSENSITIVE-TERM-PHRASES-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "lexical_only_term_phrases_asent_p", "LEXICAL-ONLY-TERM-PHRASES-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "inference_denots_of_string", "INFERENCE-DENOTS-OF-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "inference_denots_of_stringXpred", "INFERENCE-DENOTS-OF-STRING&PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_term_phrases_unify_arg1_and_arg2_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "add_term_phrases_arg1_and_arg2_removal_nodes", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "add_term_phrases_arg1_and_arg2_removal_node", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "term_phrases_constraints_from_pred", "TERM-PHRASES-CONSTRAINTS-FROM-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_lexicon_namestring_expand", "REMOVAL-LEXICON-NAMESTRING-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon", "removal_lexicon_namestring_completeP", "REMOVAL-LEXICON-NAMESTRING-COMPLETE?", 1, 0, false);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    public static SubLObject init_removal_modules_lexicon_file() {
        removal_modules_lexicon.$default_word_string_check_cost$ = SubLFiles.defparameter("*DEFAULT-WORD-STRING-CHECK-COST*", (SubLObject)removal_modules_lexicon.ONE_INTEGER);
        removal_modules_lexicon.$default_word_strings_unify_cost$ = SubLFiles.defparameter("*DEFAULT-WORD-STRINGS-UNIFY-COST*", (SubLObject)removal_modules_lexicon.TWO_INTEGER);
        removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$ = SubLFiles.defconstant("*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*", (SubLObject)removal_modules_lexicon.$sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        removal_modules_lexicon.$avg_suffix_expansion_cost$ = SubLFiles.defconstant("*AVG-SUFFIX-EXPANSION-COST*", (SubLObject)removal_modules_lexicon.THREE_INTEGER);
        removal_modules_lexicon.$default_term_phrases_cost$ = SubLFiles.defparameter("*DEFAULT-TERM-PHRASES-COST*", (SubLObject)removal_modules_lexicon.TWO_INTEGER);
        removal_modules_lexicon.$default_lexicon_namestring_check_cost$ = SubLFiles.defparameter("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*", (SubLObject)removal_modules_lexicon.TWO_INTEGER);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    public static SubLObject setup_removal_modules_lexicon_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym1$HL_VERIFY_WORD_STRINGS);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym2$HL_JUSTIFY_WORD_STRINGS);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym3$HL_FORWARD_MT_COMBOS_WORD_STRINGS);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw6$REMOVAL_WORD_STRINGS_CHECK, (SubLObject)removal_modules_lexicon.$list7);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym9$REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw10$REMOVAL_WORD_STRINGS_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw13$REMOVAL_WORD_STRINGS_UNIFY_ARG2, (SubLObject)removal_modules_lexicon.$list14);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym38$REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)removal_modules_lexicon.$list39);
        Structures.def_csetf((SubLObject)removal_modules_lexicon.$sym40$REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, (SubLObject)removal_modules_lexicon.$sym41$_CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE);
        Structures.def_csetf((SubLObject)removal_modules_lexicon.$sym42$REMOVAL_WSI_STATE_ARG1, (SubLObject)removal_modules_lexicon.$sym43$_CSETF_REMOVAL_WSI_STATE_ARG1);
        Structures.def_csetf((SubLObject)removal_modules_lexicon.$sym44$REMOVAL_WSI_STATE_ARG2, (SubLObject)removal_modules_lexicon.$sym45$_CSETF_REMOVAL_WSI_STATE_ARG2);
        Structures.def_csetf((SubLObject)removal_modules_lexicon.$sym46$REMOVAL_WSI_STATE_TRIE_ITERATOR, (SubLObject)removal_modules_lexicon.$sym47$_CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR);
        Structures.def_csetf((SubLObject)removal_modules_lexicon.$sym48$REMOVAL_WSI_STATE_ENTRY_ITERATOR, (SubLObject)removal_modules_lexicon.$sym49$_CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR);
        Equality.identity((SubLObject)removal_modules_lexicon.$sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$.getGlobalValue(), Symbols.symbol_function((SubLObject)removal_modules_lexicon.$sym60$VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym61$ITERATOR_WORD_STRINGS_DONE);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym62$ITERATOR_WORD_STRINGS_NEXT);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym64$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym65$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym67$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw70$REMOVAL_WORD_FORMS_CHECK, (SubLObject)removal_modules_lexicon.$list71);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw72$REMOVAL_WORD_FORMS_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list73);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw75$REMOVAL_WORD_FORMS_UNIFY_ARG2, (SubLObject)removal_modules_lexicon.$list76);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw77$REMOVAL_WORD_FORMS_UNIFY_ARG3, (SubLObject)removal_modules_lexicon.$list78);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw79$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, (SubLObject)removal_modules_lexicon.$list80);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw81$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, (SubLObject)removal_modules_lexicon.$list82);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym85$HL_VERIFY_TERM_PHRASES);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym86$HL_JUSTIFY_TERM_PHRASES);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym93$HL_FORWARD_MT_COMBOS_TERM_PHRASES);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_lexicon.$sym95$HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_lexicon.$kw96$TEST, removal_modules_lexicon.$sym97$SUPPORTS_HAVE_PREDS_, removal_modules_lexicon.$kw98$OWNER, removal_modules_lexicon.NIL, removal_modules_lexicon.$kw99$CLASSES, removal_modules_lexicon.NIL, removal_modules_lexicon.$kw100$KB, removal_modules_lexicon.$kw101$FULL, removal_modules_lexicon.$kw102$WORKING_, removal_modules_lexicon.T }), removal_modules_lexicon.$list103);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw131$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, (SubLObject)removal_modules_lexicon.$list132);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw133$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, (SubLObject)removal_modules_lexicon.$list134);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw135$REMOVAL_TERM_PHRASES_UNIFY_ARG3, (SubLObject)removal_modules_lexicon.$list136);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw137$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, (SubLObject)removal_modules_lexicon.$list138);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw139$REMOVAL_TERM_PHRASES_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list140);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw141$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list142);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw143$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list144);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw145$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, (SubLObject)removal_modules_lexicon.$list146);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw154$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, (SubLObject)removal_modules_lexicon.$list155);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw156$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, (SubLObject)removal_modules_lexicon.$list157);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_lexicon.$const87$termPhrases);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_lexicon.$const89$termPhrases_CaseInsensitive);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_lexicon.$const163$wordForms);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym170$REMOVAL_LEXICON_NAMESTRING_EXPAND);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_lexicon.$sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
        preference_modules.inference_preference_module((SubLObject)removal_modules_lexicon.$kw172$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, (SubLObject)removal_modules_lexicon.$list173);
        preference_modules.inference_preference_module((SubLObject)removal_modules_lexicon.$kw174$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, (SubLObject)removal_modules_lexicon.$list175);
        inference_modules.inference_removal_module((SubLObject)removal_modules_lexicon.$kw176$REMOVAL_LEXICON_NAMESTRING, (SubLObject)removal_modules_lexicon.$list177);
        return (SubLObject)removal_modules_lexicon.NIL;
    }
    
    private static SubLObject _constant_103_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeString("COPD-PFT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("hardening of the arteries")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishCompositionalPhrasesLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("presentParticiple")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OpenEndedInvestmentCompany")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)SubLObjectFactory.makeString("OEIC")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialismString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScubaDiving")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("scuba diving")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupraventricularTachycardia")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), (SubLObject)SubLObjectFactory.makeString("supraventricular tach")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hepatitis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), (SubLObject)SubLObjectFactory.makeString("hepatitis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GolfCourse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")), (SubLObject)SubLObjectFactory.makeString("links")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("COPD confirmed by a pulmonary function test")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TetralogyOfFallotWithAbsentPulmonaryValve")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("Tetralogy of Fallot with absent pulmonary valve")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnMassNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorta")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), (SubLObject)SubLObjectFactory.makeString("disease of the aorta")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tennis-TheGame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("tennis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PorscheCar")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("Porsche")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InLineSkating")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("roller-blading")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnemaAdministeringEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("enema")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exercising")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("Bewegung")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GermanLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Feminine")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Baseball-TheGame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("the game of baseball")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("atrial fibrillation or flutter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinglesTableTennis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("singles table tennis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Atrial-ventricularCanalType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("A-V canal type VSD")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pnSingular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Poker-CardGame")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("poker game")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheDescendingAorta")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), (SubLObject)SubLObjectFactory.makeString("disease of the descending aorta")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishCompositionalPhrasesLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Franchise")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")), (SubLObject)SubLObjectFactory.makeString("franchises")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ox")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), (SubLObject)SubLObjectFactory.makeString("oxen")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), (SubLObject)SubLObjectFactory.makeString("calcification")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishJargonMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), (SubLObject)SubLObjectFactory.makeString("pulmonary valve atresia with ventricular septal defect")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalFailure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MassNoun")), (SubLObject)SubLObjectFactory.makeString("renal failure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("massNumber")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic")), (SubLObject)SubLObjectFactory.makeString("abnormal num of cusps")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFLexicalMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ox")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), (SubLObject)SubLObjectFactory.makeString("oXen")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneralEnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mainColorOfObject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YellowColor"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString")), (SubLObject)SubLObjectFactory.makeString("the yellow submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mainColorOfObject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YellowColor"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")), (SubLObject)SubLObjectFactory.makeString("a yellow submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TERM-PHRASES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mainColorOfObject")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YellowColor"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic")), (SubLObject)SubLObjectFactory.makeString("yellow submarine")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")), (SubLObject)SubLObjectFactory.makeKeyword("TRUE-DEF"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")))) });
    }
    
    public void declareFunctions() {
        declare_removal_modules_lexicon_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_lexicon_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_lexicon_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_lexicon();
        removal_modules_lexicon.$default_word_string_check_cost$ = null;
        removal_modules_lexicon.$default_word_strings_unify_cost$ = null;
        removal_modules_lexicon.$dtp_removal_word_strings_iterator_state$ = null;
        removal_modules_lexicon.$avg_suffix_expansion_cost$ = null;
        removal_modules_lexicon.$default_term_phrases_cost$ = null;
        removal_modules_lexicon.$default_lexicon_namestring_check_cost$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym1$HL_VERIFY_WORD_STRINGS = SubLObjectFactory.makeSymbol("HL-VERIFY-WORD-STRINGS");
        $sym2$HL_JUSTIFY_WORD_STRINGS = SubLObjectFactory.makeSymbol("HL-JUSTIFY-WORD-STRINGS");
        $sym3$HL_FORWARD_MT_COMBOS_WORD_STRINGS = SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $const5$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt"));
        $kw6$REMOVAL_WORD_STRINGS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-CHECK");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<speech-part-pred> <fully bound> <string>) using the lexicon cache"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nounStrings #$Dog-TheWord \"dog\")") });
        $kw8$WORD_STRINGS = SubLObjectFactory.makeKeyword("WORD-STRINGS");
        $sym9$REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE");
        $kw10$REMOVAL_WORD_STRINGS_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("POS-PRED")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("WORD-STRINGS"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordStrings ?WHAT \"dog\")") });
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw13$REMOVAL_WORD_STRINGS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nounStrings #$Dog-TheWord ?STRING)") });
        $kw15$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw16$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw17$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $const18$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw20$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str21$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym22$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw23$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str24$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw25$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str26$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const27$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str28$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str29$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str30$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE");
        $sym32$REMOVAL_WORD_STRINGS_ITERATOR_STATE_P = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY-ITERATOR"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SPEECH-PART-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("ARG2"), (SubLObject)SubLObjectFactory.makeKeyword("TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("ENTRY-ITERATOR"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR"));
        $sym37$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym38$REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));
        $sym40$REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");
        $sym41$_CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");
        $sym42$REMOVAL_WSI_STATE_ARG1 = SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ARG1");
        $sym43$_CSETF_REMOVAL_WSI_STATE_ARG1 = SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1");
        $sym44$REMOVAL_WSI_STATE_ARG2 = SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ARG2");
        $sym45$_CSETF_REMOVAL_WSI_STATE_ARG2 = SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2");
        $sym46$REMOVAL_WSI_STATE_TRIE_ITERATOR = SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR");
        $sym47$_CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR");
        $sym48$REMOVAL_WSI_STATE_ENTRY_ITERATOR = SubLObjectFactory.makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR");
        $sym49$_CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR = SubLObjectFactory.makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR");
        $kw50$SPEECH_PART_PREDICATE = SubLObjectFactory.makeKeyword("SPEECH-PART-PREDICATE");
        $kw51$ARG1 = SubLObjectFactory.makeKeyword("ARG1");
        $kw52$ARG2 = SubLObjectFactory.makeKeyword("ARG2");
        $kw53$TRIE_ITERATOR = SubLObjectFactory.makeKeyword("TRIE-ITERATOR");
        $kw54$ENTRY_ITERATOR = SubLObjectFactory.makeKeyword("ENTRY-ITERATOR");
        $str55$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw56$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE = SubLObjectFactory.makeSymbol("MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE");
        $kw58$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw59$END = SubLObjectFactory.makeKeyword("END");
        $sym60$VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD");
        $sym61$ITERATOR_WORD_STRINGS_DONE = SubLObjectFactory.makeSymbol("ITERATOR-WORD-STRINGS-DONE");
        $sym62$ITERATOR_WORD_STRINGS_NEXT = SubLObjectFactory.makeSymbol("ITERATOR-WORD-STRINGS-NEXT");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEECH-PART-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $sym64$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR");
        $sym65$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS");
        $list66 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $sym67$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT = SubLObjectFactory.makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-WORD-STRINGS-CHECK"));
        $const69$regularSuffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("regularSuffix"));
        $kw70$REMOVAL_WORD_FORMS_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-CHECK");
        $list71 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-CHECK-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-CHECK-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <fully bound> <fully bound> <string>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms #$Ox-TheWord #$plural \"oxen\")") });
        $kw72$REMOVAL_WORD_FORMS_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG1");
        $list73 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms ?WORD #$plural \"dogs\")") });
        $const74$speechPartPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("speechPartPreds"));
        $kw75$REMOVAL_WORD_FORMS_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG2");
        $list76 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms #$Dog-TheWord ?PRED \"dogs\")") });
        $kw77$REMOVAL_WORD_FORMS_UNIFY_ARG3 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG3");
        $list78 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms #$Dog-TheWord #$plural ?STRING)") });
        $kw79$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2");
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms ?WORD ?PRED \"dogs\")") });
        $kw81$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3 = SubLObjectFactory.makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3");
        $list82 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED"), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$wordForms #$Dog-TheWord ?PRED ?STRING)") });
        $const83$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $kw84$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym85$HL_VERIFY_TERM_PHRASES = SubLObjectFactory.makeSymbol("HL-VERIFY-TERM-PHRASES");
        $sym86$HL_JUSTIFY_TERM_PHRASES = SubLObjectFactory.makeSymbol("HL-JUSTIFY-TERM-PHRASES");
        $const87$termPhrases = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"));
        $const88$termPhrases_Lexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical"));
        $const89$termPhrases_CaseInsensitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive"));
        $const90$termPhrases_CaseInsensitive_Lexic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical"));
        $const91$CharacterString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"));
        $sym93$HL_FORWARD_MT_COMBOS_TERM_PHRASES = SubLObjectFactory.makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES");
        $sym94$SUPPORT_SENTENCE_OPERATOR = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE-OPERATOR");
        $sym95$HL_VERIFY_AND_JUSTIFY_TERM_PHRASES = SubLObjectFactory.makeSymbol("HL-VERIFY-AND-JUSTIFY-TERM-PHRASES");
        $kw96$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym97$SUPPORTS_HAVE_PREDS_ = SubLObjectFactory.makeSymbol("SUPPORTS-HAVE-PREDS?");
        $kw98$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw99$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw100$KB = SubLObjectFactory.makeKeyword("KB");
        $kw101$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw102$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list103 = _constant_103_initializer();
        $sym104$SUPPORT_P = SubLObjectFactory.makeSymbol("SUPPORT-P");
        $sym105$SPEECH_PART_PRED_ = SubLObjectFactory.makeSymbol("SPEECH-PART-PRED?");
        $const106$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("abbreviationForLexicalWord"));
        $sym107$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $const108$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)removal_modules_lexicon.ONE_INTEGER);
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")));
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-ARG")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym112$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym113$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym114$DO_GAF_ARG_INDEX = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX");
        $kw115$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw116$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"));
        $sym118$DO_GAF_ARG_INDEX_NAUT = SubLObjectFactory.makeSymbol("DO-GAF-ARG-INDEX-NAUT");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("ARG3"));
        $kw120$TERM_PHRASES = SubLObjectFactory.makeKeyword("TERM-PHRASES");
        $sym121$GENERIC_PRED_ = SubLObjectFactory.makeSymbol("GENERIC-PRED?");
        $const122$StringIndexingSlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringIndexingSlot"));
        $sym123$NAME_STRING_PRED_ = SubLObjectFactory.makeSymbol("NAME-STRING-PRED?");
        $const124$ProperNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNameString"));
        $const125$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $kw126$ALL = SubLObjectFactory.makeKeyword("ALL");
        $const127$NLWordForm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLWordForm"));
        $const128$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $const129$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $const130$GenericSpeechPartPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericSpeechPartPredicate"));
        $kw131$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG3");
        $list132 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)") });
        $kw133$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG3");
        $list134 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)") });
        $kw135$REMOVAL_TERM_PHRASES_UNIFY_ARG3 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG3");
        $list136 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });
        $kw137$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG3");
        $list138 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });
        $kw139$REMOVAL_TERM_PHRASES_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1");
        $list140 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases ?WHAT #$singular \"emu\")") });
        $kw141$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1");
        $list142 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")") });
        $kw143$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG1");
        $list144 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-Lexical ?WHAT #$singular \"emu\")") });
        $kw145$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG1");
        $list146 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("INCOMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")") });
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $kw148$ON = SubLObjectFactory.makeKeyword("ON");
        $kw149$OFF = SubLObjectFactory.makeKeyword("OFF");
        $kw150$NEVER = SubLObjectFactory.makeKeyword("NEVER");
        $kw151$ONLY = SubLObjectFactory.makeKeyword("ONLY");
        $list152 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")));
        $list153 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-Lexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive-Lexical")));
        $kw154$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2");
        $list155 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")") });
        $kw156$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1-AND-ARG2");
        $list157 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases-CaseInsensitive")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), SubLObjectFactory.makeKeyword("REQUIRED"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")") });
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $const160$TermPhrasesConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermPhrasesConstraint"));
        $const161$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw162$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $const163$wordForms = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wordForms"));
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list165 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NAME-PRED"));
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"));
        $sym167$NAME_PRED = SubLObjectFactory.makeSymbol("NAME-PRED");
        $sym168$DENOT = SubLObjectFactory.makeSymbol("DENOT");
        $kw169$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $sym170$REMOVAL_LEXICON_NAMESTRING_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND");
        $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ = SubLObjectFactory.makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?");
        $kw172$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = SubLObjectFactory.makeKeyword("TERM-STRINGS-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw174$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND = SubLObjectFactory.makeKeyword("TERM-PHRASES-STRONGLY-PREFER-AT-LEAST-TERM-OR-STRING-FULLY-BOUND");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL-PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termPhrases"))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw176$REMOVAL_LEXICON_NAMESTRING = SubLObjectFactory.makeKeyword("REMOVAL-LEXICON-NAMESTRING");
        $list177 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-NAME-STRING-PRED?")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?")), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$nameString ?WHO \"Cher\")") });
    }
    
    public static final class $removal_word_strings_iterator_state_native extends SubLStructNative
    {
        public SubLObject $speech_part_predicate;
        public SubLObject $arg1;
        public SubLObject $arg2;
        public SubLObject $trie_iterator;
        public SubLObject $entry_iterator;
        private static final SubLStructDeclNative structDecl;
        
        public $removal_word_strings_iterator_state_native() {
            this.$speech_part_predicate = (SubLObject)CommonSymbols.NIL;
            this.$arg1 = (SubLObject)CommonSymbols.NIL;
            this.$arg2 = (SubLObject)CommonSymbols.NIL;
            this.$trie_iterator = (SubLObject)CommonSymbols.NIL;
            this.$entry_iterator = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$removal_word_strings_iterator_state_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$speech_part_predicate;
        }
        
        public SubLObject getField3() {
            return this.$arg1;
        }
        
        public SubLObject getField4() {
            return this.$arg2;
        }
        
        public SubLObject getField5() {
            return this.$trie_iterator;
        }
        
        public SubLObject getField6() {
            return this.$entry_iterator;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$speech_part_predicate = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$arg1 = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$arg2 = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$trie_iterator = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$entry_iterator = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$removal_word_strings_iterator_state_native.class, removal_modules_lexicon.$sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE, removal_modules_lexicon.$sym32$REMOVAL_WORD_STRINGS_ITERATOR_STATE_P, removal_modules_lexicon.$list33, removal_modules_lexicon.$list34, new String[] { "$speech_part_predicate", "$arg1", "$arg2", "$trie_iterator", "$entry_iterator" }, removal_modules_lexicon.$list35, removal_modules_lexicon.$list36, removal_modules_lexicon.$sym37$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $removal_word_strings_iterator_state_p$UnaryFunction extends UnaryFunction
    {
        public $removal_word_strings_iterator_state_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return removal_modules_lexicon.removal_word_strings_iterator_state_p(arg1);
        }
    }
}

/*

	Total time: 3448 ms
	
*/