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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class removal_modules_lexicon
    extends
      SubLTranslatedFile
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
  public static SubLObject removal_word_strings_check_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1024L)
  public static SubLObject hl_verify_word_strings(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject hl_module = NIL;
    SubLObject asent = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list0 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list0 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list0 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list0 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        ans = removal_word_strings_check_succeedsP( asent );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list0 );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1301L)
  public static SubLObject hl_justify_word_strings(final SubLObject support)
  {
    return nl_trie_accessors.nl_trie_hl_justify_word_strings( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1411L)
  public static SubLObject hl_forward_mt_combos_word_strings(final SubLObject support)
  {
    return nl_trie_accessors.nl_trie_hl_forward_mt_combos_word_strings( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1541L)
  public static SubLObject removal_word_strings_check_succeedsP(final SubLObject asent)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( asent, UNPROVIDED );
    SubLObject pos_pred = NIL;
    SubLObject word = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    pos_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject misspellingsP = mt_relevance_macros.relevant_mtP( $const5$CommonEnglishMisspellingsMt );
      final SubLObject mt = mt_relevance_macros.inference_relevant_mt();
      final SubLObject words = lexicon_accessors.words_of_stringXpred( string, pos_pred, misspellingsP, mt, UNPROVIDED );
      return subl_promotions.memberP( word, words, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 1890L)
  public static SubLObject removal_word_strings_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != removal_word_strings_check_succeedsP( asent ) )
    {
      final SubLObject hl_support = make_word_strings_support( asent );
      backward.removal_add_node( hl_support, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 2650L)
  public static SubLObject make_word_strings_support(final SubLObject formula)
  {
    return arguments.make_hl_support( $kw8$WORD_STRINGS, formula, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 2958L)
  public static SubLObject removal_word_strings_unify_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 3275L)
  public static SubLObject removal_word_strings_unify_arg1_output_generate(final SubLObject pos_pred, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return iteration.new_list_iterator( lexicon_accessors.words_of_stringXpred( string, pos_pred, T, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4323L)
  public static SubLObject removal_word_strings_unify_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4576L)
  public static SubLObject removal_word_strings_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return kb_indexing.num_gaf_arg_index( word, ONE_INTEGER, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 4756L)
  public static SubLObject removal_word_strings_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( asent, UNPROVIDED );
    SubLObject pos_pred = NIL;
    SubLObject word = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    pos_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding( thread );
      try
      {
        lexicon_vars.$misspellingsP$.bind( mt_relevance_macros.relevant_mtP( $const5$CommonEnglishMisspellingsMt ), thread );
        SubLObject cdolist_list_var;
        final SubLObject strings = cdolist_list_var = lexicon_cache.strings_of_wordXpred( word, pos_pred, mt_relevance_macros.mt_info( UNPROVIDED ) );
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings = unification_utilities.term_unify( string, arg2, T, T );
          final SubLObject unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings )
          {
            final SubLObject formula = bindings.subst_bindings( v_bindings, asent );
            final SubLObject hl_support = make_word_strings_support( formula );
            backward.removal_add_node( hl_support, v_bindings, unify_justification );
          }
          cdolist_list_var = cdolist_list_var.rest();
          string = cdolist_list_var.first();
        }
      }
      finally
      {
        lexicon_vars.$misspellingsP$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 5923L)
  public static SubLObject removal_word_strings_unify_arg1_and_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6196L)
  public static SubLObject removal_word_strings_unify_arg1_and_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject count = ZERO_INTEGER;
    final SubLObject node_var = cycl_utilities.atomic_sentence_predicate( asent );
    final SubLObject deck_type = $kw17$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = $const18$True_JustificationTruth;
        final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw20$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw23$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw25$WARN ) )
            {
              Errors.warn( $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( cycl_utilities.atomic_sentence_predicate( asent ), sbhl_module_vars.get_sbhl_module(
                UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const27$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( cycl_utilities.atomic_sentence_predicate( asent ), sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck
                    .deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$7 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec_pred = node_var_$7;
                  final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7 ) )
                    {
                      count = Numbers.add( count, kb_indexing.relevant_num_predicate_extent_index( spec_pred ) );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$7 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$12;
                                    for( iteration_state_$12 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$12 ); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next( iteration_state_$12 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$12 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$7, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$12 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$6, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$14;
                          final SubLObject new_list = cdolist_list_var_$14 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$14.first();
                          while ( NIL != cdolist_list_var_$14)
                          {
                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$8, thread );
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            generating_fn = cdolist_list_var_$14.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$5, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$5, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$4, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$6, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$4, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$3, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, cycl_utilities.atomic_sentence_predicate( asent ), sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module(
                  UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$3, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    final SubLObject current_controlling_inference = inference_macros.current_controlling_inference();
    if( NIL != current_controlling_inference )
    {
      final SubLObject number_cutoff = inference_datastructures_inference.inference_max_number( current_controlling_inference );
      if( NIL != number_cutoff && number_cutoff.numL( count ) )
      {
        count = number_cutoff;
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_word_strings_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_word_strings_iterator_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $removal_word_strings_iterator_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_wsi_state_speech_part_predicate(final SubLObject v_object)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_wsi_state_arg1(final SubLObject v_object)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_wsi_state_arg2(final SubLObject v_object)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_wsi_state_trie_iterator(final SubLObject v_object)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject removal_wsi_state_entry_iterator(final SubLObject v_object)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject _csetf_removal_wsi_state_speech_part_predicate(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject _csetf_removal_wsi_state_arg1(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject _csetf_removal_wsi_state_arg2(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject _csetf_removal_wsi_state_trie_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject _csetf_removal_wsi_state_entry_iterator(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != removal_word_strings_iterator_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject make_removal_word_strings_iterator_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $removal_word_strings_iterator_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw50$SPEECH_PART_PREDICATE ) )
      {
        _csetf_removal_wsi_state_speech_part_predicate( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$ARG1 ) )
      {
        _csetf_removal_wsi_state_arg1( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$ARG2 ) )
      {
        _csetf_removal_wsi_state_arg2( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$TRIE_ITERATOR ) )
      {
        _csetf_removal_wsi_state_trie_iterator( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$ENTRY_ITERATOR ) )
      {
        _csetf_removal_wsi_state_entry_iterator( v_new, current_value );
      }
      else
      {
        Errors.error( $str55$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject visit_defstruct_removal_word_strings_iterator_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw56$BEGIN, $sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw50$SPEECH_PART_PREDICATE, removal_wsi_state_speech_part_predicate( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw51$ARG1, removal_wsi_state_arg1( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw52$ARG2, removal_wsi_state_arg2( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw53$TRIE_ITERATOR, removal_wsi_state_trie_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$SLOT, $kw54$ENTRY_ITERATOR, removal_wsi_state_entry_iterator( obj ) );
    Functions.funcall( visitor_fn, obj, $kw59$END, $sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 6919L)
  public static SubLObject visit_defstruct_object_removal_word_strings_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_removal_word_strings_iterator_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7079L)
  public static SubLObject iterator_word_strings_done(final SubLObject state)
  {
    return makeBoolean( NIL != iteration.iteration_done( removal_wsi_state_trie_iterator( state ) ) && ( NIL == removal_wsi_state_entry_iterator( state ) || NIL != iteration.iteration_done(
        removal_wsi_state_entry_iterator( state ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7341L)
  public static SubLObject wsi_entry_iterator_prepared_p(final SubLObject state)
  {
    return makeBoolean( NIL != removal_wsi_state_entry_iterator( state ) && NIL == iteration.iteration_done( removal_wsi_state_entry_iterator( state ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7524L)
  public static SubLObject wsi_advance_to_next_entry_iterator(final SubLObject state)
  {
    while ( NIL == iteration.iteration_done( removal_wsi_state_trie_iterator( state ) ) && NIL == wsi_entry_iterator_prepared_p( state ))
    {
      final SubLObject this_pair = iteration.iteration_next( removal_wsi_state_trie_iterator( state ) );
      final SubLObject entries = conses_high.second( this_pair );
      if( NIL != entries )
      {
        _csetf_removal_wsi_state_entry_iterator( state, iteration.new_list_iterator( entries ) );
      }
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 7941L)
  public static SubLObject wsi_current_word_and_string_unifyP(final SubLObject state, final SubLObject current_word, final SubLObject string)
  {
    return makeBoolean( NIL != unification_utilities.term_unify( removal_wsi_state_arg1( state ), current_word, UNPROVIDED, UNPROVIDED ) && NIL != unification_utilities.term_unify( removal_wsi_state_arg2( state ),
        string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 8151L)
  public static SubLObject iterator_word_strings_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word = NIL;
    SubLObject supported_string = NIL;
    while ( ( NIL == word || NIL == supported_string ) && NIL == iterator_word_strings_done( state ))
    {
      if( NIL == wsi_entry_iterator_prepared_p( state ) )
      {
        wsi_advance_to_next_entry_iterator( state );
      }
      while ( NIL == word && NIL != wsi_entry_iterator_prepared_p( state ))
      {
        final SubLObject current_entry = iteration.iteration_next( removal_wsi_state_entry_iterator( state ) );
        final SubLObject speech_part_predicate = removal_wsi_state_speech_part_predicate( state );
        if( NIL != nl_trie.nl_trie_word_p( current_entry, UNPROVIDED ) && NIL != nl_trie.nl_trie_word_head_onlyP( current_entry ) )
        {
          thread.resetMultipleValues();
          final SubLObject entry_pred = nl_trie_accessors.nl_trie_word_pred_and_supports_for_pred( current_entry, speech_part_predicate, UNPROVIDED );
          final SubLObject supports = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == entry_pred )
          {
            continue;
          }
          final SubLObject current_word = nl_trie.nl_trie_word_word_unit( current_entry, NIL );
          final SubLObject string = nl_trie.nl_trie_entry_string( current_entry );
          if( NIL == wsi_current_word_and_string_unifyP( state, current_word, string ) )
          {
            continue;
          }
          word = current_word;
          supported_string = ConsesLow.cons( string, supports );
        }
      }
    }
    return Values.values( ( NIL != word ) ? ConsesLow.list( removal_wsi_state_speech_part_predicate( state ), word, supported_string ) : NIL, state, Types.sublisp_null( word ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 9412L)
  public static SubLObject removal_word_strings_unify_arg1_and_arg2_iterator(final SubLObject asent)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( asent, UNPROVIDED );
    SubLObject speech_part_predicate = NIL;
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    speech_part_predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list63 );
    arg2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject trie_iterator = nl_trie.new_nl_trie_iterator( UNPROVIDED );
      final SubLObject state = make_removal_word_strings_iterator_state( ConsesLow.list( $kw53$TRIE_ITERATOR, trie_iterator, $kw50$SPEECH_PART_PREDICATE, speech_part_predicate, $kw51$ARG1, arg1, $kw52$ARG2, arg2 ) );
      return iteration.new_iterator( state, Symbols.symbol_function( $sym61$ITERATOR_WORD_STRINGS_DONE ), Symbols.symbol_function( $sym62$ITERATOR_WORD_STRINGS_NEXT ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list63 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 9894L)
  public static SubLObject removal_word_strings_unify_arg1_and_arg2_supports(final SubLObject input)
  {
    return conses_high.second( input ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 10009L)
  public static SubLObject removal_word_strings_unify_arg1_and_arg2_output_asent(final SubLObject predicate, final SubLObject word, final SubLObject supported_string)
  {
    SubLObject string = NIL;
    SubLObject supports = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( supported_string, supported_string, $list66 );
    string = supported_string.first();
    final SubLObject current = supports = supported_string.rest();
    return el_utilities.make_binary_formula( predicate, word, string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 10260L)
  public static SubLObject set_up_removal_support_for_speech_part_predicate(final SubLObject spp)
  {
    inference_modules.register_solely_specific_removal_module_predicate( spp );
    SubLObject cdolist_list_var = $list68;
    SubLObject module = NIL;
    module = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      inference_modules.inference_removal_module_use_generic( spp, module );
      cdolist_list_var = cdolist_list_var.rest();
      module = cdolist_list_var.first();
    }
    return spp;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 11714L)
  public static SubLObject removal_word_forms_check_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 12368L)
  public static SubLObject removal_word_forms_check_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject num_asserted = kb_indexing.relevant_num_gaf_arg_index( word, ONE_INTEGER, pred );
    final SubLObject num_rules = kb_indexing.relevant_num_gaf_arg_index( pred, ONE_INTEGER, $const69$regularSuffix );
    return Numbers.add( num_asserted, Numbers.multiply( num_rules, $avg_suffix_expansion_cost$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 12735L)
  public static SubLObject removal_word_forms_check_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    final SubLObject gafs = kb_mapping.gather_gaf_arg_index( word, ONE_INTEGER, pred, NIL, UNPROVIDED );
    SubLObject foundP = NIL;
    if( NIL == gafs )
    {
      final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
      try
      {
        lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.inference_relevant_mt(), thread );
        final SubLObject words = lexicon_accessors.words_of_stringXpred( string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != subl_promotions.memberP( word, words, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          backward.removal_add_node( make_word_strings_support( el_utilities.make_binary_formula( pred, word, string ) ), UNPROVIDED, UNPROVIDED );
          foundP = T;
        }
      }
      finally
      {
        lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL == foundP )
    {
      SubLObject csome_list_var = gafs;
      SubLObject gaf = NIL;
      gaf = csome_list_var.first();
      while ( NIL == foundP && NIL != csome_list_var)
      {
        if( NIL != cycl_string.cycl_stringE( string, assertions_high.gaf_arg2( gaf ) ) )
        {
          foundP = T;
          backward.removal_add_node( gaf, UNPROVIDED, UNPROVIDED );
        }
        csome_list_var = csome_list_var.rest();
        gaf = csome_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 13975L)
  public static SubLObject removal_word_forms_unify_arg1_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 14312L)
  public static SubLObject removal_word_forms_unify_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    return Numbers.multiply( TWO_INTEGER, Sequences.length( lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 14505L)
  public static SubLObject removal_word_forms_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var = lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$17;
      final SubLObject results = cdolist_list_var_$17 = lexicon_cache.strings_of_word_unit_with_supports( word, ConsesLow.list( pred ) );
      SubLObject result = NIL;
      result = cdolist_list_var_$17.first();
      while ( NIL != cdolist_list_var_$17)
      {
        final SubLObject lexicon_string = result.first();
        if( NIL != Strings.stringE( string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          thread.resetMultipleValues();
          final SubLObject word_binding = unification_utilities.term_unify( arg1, word, T, T );
          final SubLObject unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != word_binding )
          {
            backward.removal_add_node( conses_high.cadr( result ), word_binding, ConsesLow.append( conses_high.cddr( result ), unify_justification ) );
          }
        }
        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
        result = cdolist_list_var_$17.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 15763L)
  public static SubLObject removal_word_forms_unify_arg2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 16099L)
  public static SubLObject removal_word_forms_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pos_list = lexicon_accessors.pos_of_word( word, UNPROVIDED );
    SubLObject ans = ZERO_INTEGER;
    SubLObject cdolist_list_var = pos_list;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = Numbers.add( ans, kb_indexing.num_gaf_arg_index( pos, ONE_INTEGER, $const74$speechPartPreds, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return Numbers.multiply( TWO_INTEGER, ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 16401L)
  public static SubLObject removal_word_forms_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pos_list = lexicon_accessors.pos_of_word( word, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var = pos_list;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$18 = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
      SubLObject pred = NIL;
      pred = cdolist_list_var_$18.first();
      while ( NIL != cdolist_list_var_$18)
      {
        SubLObject cdolist_list_var_$19;
        final SubLObject results = cdolist_list_var_$19 = lexicon_cache.strings_of_word_unit_with_supports( word, ConsesLow.list( pred ) );
        SubLObject result = NIL;
        result = cdolist_list_var_$19.first();
        while ( NIL != cdolist_list_var_$19)
        {
          final SubLObject lexicon_string = result.first();
          if( NIL != Strings.stringE( string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify( pred, arg2, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != v_bindings )
            {
              backward.removal_add_node( conses_high.cadr( result ), v_bindings, ConsesLow.append( conses_high.cddr( result ), unify_justification ) );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 17690L)
  public static SubLObject removal_word_forms_unify_arg3_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 18025L)
  public static SubLObject removal_word_forms_unify_arg3_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return Numbers.multiply( TWO_INTEGER, removal_word_forms_check_cost( asent, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 18171L)
  public static SubLObject removal_word_forms_unify_arg3_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pred = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject results = cdolist_list_var = lexicon_cache.strings_of_word_unit_with_supports( word, ConsesLow.list( pred ) );
    SubLObject result = NIL;
    result = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject string = result.first();
      thread.resetMultipleValues();
      final SubLObject v_bindings = unification_utilities.term_unify( string, arg3, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        backward.removal_add_node( conses_high.cadr( result ), v_bindings, ConsesLow.append( conses_high.cddr( result ), unify_justification ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      result = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 19301L)
  public static SubLObject removal_word_forms_unify_args_1_and_2_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 19657L)
  public static SubLObject removal_word_forms_unify_args_1_and_2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject ans = ZERO_INTEGER;
    SubLObject cdolist_list_var = lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$20;
      final SubLObject pos_list = cdolist_list_var_$20 = lexicon_accessors.pos_of_word( word, UNPROVIDED );
      SubLObject pos = NIL;
      pos = cdolist_list_var_$20.first();
      while ( NIL != cdolist_list_var_$20)
      {
        ans = Numbers.add( ans, Numbers.multiply( TWO_INTEGER, kb_indexing.num_gaf_arg_index( pos, ONE_INTEGER, $const74$speechPartPreds, UNPROVIDED ) ) );
        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
        pos = cdolist_list_var_$20.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 20022L)
  public static SubLObject removal_word_forms_unify_args_1_and_2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject string = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var = lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject word_binding = unification_utilities.term_unify( word, arg1, T, T );
      final SubLObject word_unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != word_binding )
      {
        SubLObject cdolist_list_var_$21;
        final SubLObject pos_list = cdolist_list_var_$21 = lexicon_accessors.pos_of_word( word, UNPROVIDED );
        SubLObject pos = NIL;
        pos = cdolist_list_var_$21.first();
        while ( NIL != cdolist_list_var_$21)
        {
          SubLObject cdolist_list_var_$22 = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
          SubLObject pred = NIL;
          pred = cdolist_list_var_$22.first();
          while ( NIL != cdolist_list_var_$22)
          {
            SubLObject cdolist_list_var_$23;
            final SubLObject results = cdolist_list_var_$23 = lexicon_cache.strings_of_word_unit_with_supports( word, ConsesLow.list( pred ) );
            SubLObject result = NIL;
            result = cdolist_list_var_$23.first();
            while ( NIL != cdolist_list_var_$23)
            {
              final SubLObject lexicon_string = result.first();
              if( NIL != Strings.stringE( string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                thread.resetMultipleValues();
                final SubLObject pred_binding = unification_utilities.term_unify( pred, arg2, T, T );
                final SubLObject pred_unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != pred_binding )
                {
                  backward.removal_add_node( conses_high.cadr( result ), ConsesLow.append( word_binding, pred_binding ), ConsesLow.append( conses_high.cddr( result ), word_unify_justification,
                      pred_unify_justification ) );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 21620L)
  public static SubLObject removal_word_forms_unify_args_2_and_3_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 21975L)
  public static SubLObject removal_word_forms_unify_args_2_and_3_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pos_list = lexicon_accessors.pos_of_word( word, UNPROVIDED );
    SubLObject ans = ZERO_INTEGER;
    SubLObject cdolist_list_var = pos_list;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = Numbers.add( ans, Numbers.multiply( TWO_INTEGER, kb_indexing.num_gaf_arg_index( pos, ONE_INTEGER, $const74$speechPartPreds, UNPROVIDED ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      pos = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 22285L)
  public static SubLObject removal_word_forms_unify_args_2_and_3_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject word = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject pos_list = lexicon_accessors.pos_of_word( word, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var = pos_list;
    SubLObject pos = NIL;
    pos = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$24 = lexicon_utilities.preds_of_pos( pos, UNPROVIDED );
      SubLObject pred = NIL;
      pred = cdolist_list_var_$24.first();
      while ( NIL != cdolist_list_var_$24)
      {
        SubLObject cdolist_list_var_$25;
        final SubLObject results = cdolist_list_var_$25 = lexicon_cache.strings_of_word_unit_with_supports( word, ConsesLow.list( pred ) );
        SubLObject result = NIL;
        result = cdolist_list_var_$25.first();
        while ( NIL != cdolist_list_var_$25)
        {
          final SubLObject lexicon_string = result.first();
          thread.resetMultipleValues();
          final SubLObject pred_binding = unification_utilities.term_unify( pred, arg2, T, T );
          final SubLObject pred_unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != pred_binding )
          {
            thread.resetMultipleValues();
            final SubLObject string_binding = unification_utilities.term_unify( lexicon_string, arg3, T, T );
            final SubLObject string_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != string_binding )
            {
              backward.removal_add_node( conses_high.cadr( result ), ConsesLow.append( pred_binding, string_binding ), ConsesLow.append( conses_high.cddr( result ), pred_unify_justification,
                  string_unify_justification ) );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 23814L)
  public static SubLObject hl_verify_term_phrases(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.non_empty_list_p( hl_justify_term_phrases( support ) ) )
    {
      return T;
    }
    if( $const83$termStrings.eql( arguments.support_sentence_operator( support ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = destructure_term_phrases_support( support );
      final SubLObject string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject ans = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( arguments.support_mt( support ) );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        ans = makeBoolean( NIL == forts.fort_p( v_term ) && NIL != ( ( $kw84$TRUE == arguments.support_truth( support ) ) ? removal_modules_term_strings.removal_term_strings_check_pos_output_check( v_term, string )
            : removal_modules_term_strings.removal_term_strings_check_neg_output_check( v_term, string ) ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      return ans;
    }
    if( NIL == lexical_only_term_phrases_asent_p( arguments.support_sentence( support ) ) )
    {
      SubLObject ans2 = NIL;
      thread.resetMultipleValues();
      final SubLObject v_term2 = destructure_term_phrases_support( support );
      final SubLObject string2 = thread.secondMultipleValue();
      final SubLObject constraint = thread.thirdMultipleValue();
      final SubLObject case_insensitiveP = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( arguments.support_mt( support ) );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
        final SubLObject parsed_terms = psp_main.inference_ps_get_cycls_for_phrase( string2, constraint, case_insensitiveP );
        ans2 = ( $kw84$TRUE == arguments.support_truth( support ) ) ? list_utilities.member_equalP( v_term2, parsed_terms ) : makeBoolean( NIL == list_utilities.member_equalP( v_term2, parsed_terms ) );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
      }
      return ans2;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 25160L)
  public static SubLObject hl_justify_term_phrases(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt = arguments.support_mt( support );
    SubLObject supports = NIL;
    if( $kw84$TRUE == arguments.support_truth( support ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = destructure_term_phrases_support( support );
      final SubLObject string = thread.secondMultipleValue();
      final SubLObject constraint = thread.thirdMultipleValue();
      final SubLObject case_insensitiveP = thread.fourthMultipleValue();
      final SubLObject lexical_onlyP = thread.fifthMultipleValue();
      thread.resetMultipleValues();
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        supports = get_term_phrases_supports( v_term, string, constraint, case_insensitiveP, lexical_onlyP );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 25603L)
  public static SubLObject destructure_term_phrases_support(final SubLObject support)
  {
    final SubLObject asent = arguments.support_sentence( support );
    final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p( asent );
    final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p( asent );
    SubLObject v_term = NIL;
    SubLObject string = NIL;
    SubLObject constraint = NIL;
    final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate( asent );
    if( pcase_var.eql( $const87$termPhrases ) || pcase_var.eql( $const88$termPhrases_Lexical ) || pcase_var.eql( $const89$termPhrases_CaseInsensitive ) || pcase_var.eql( $const90$termPhrases_CaseInsensitive_Lexic ) )
    {
      final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
      v_term = datum_evaluated_var.first();
      constraint = conses_high.cadr( datum_evaluated_var );
      string = conses_high.cddr( datum_evaluated_var ).first();
    }
    else if( pcase_var.eql( $const83$termStrings ) )
    {
      final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
      v_term = datum_evaluated_var.first();
      string = conses_high.cadr( datum_evaluated_var );
      constraint = $const91$CharacterString;
    }
    return Values.values( v_term, string, constraint, case_insensitiveP, lexical_onlyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 26318L)
  public static SubLObject hl_forward_mt_combos_term_phrases(final SubLObject support)
  {
    final SubLObject meta_supports = hl_justify_term_phrases( support );
    SubLObject mts = NIL;
    SubLObject supports = NIL;
    SubLObject cdolist_list_var = meta_supports;
    SubLObject meta_support = NIL;
    meta_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( meta_support ) )
      {
        final SubLObject item_var = assertions_high.assertion_mt( meta_support );
        if( NIL == conses_high.member( item_var, mts, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          mts = ConsesLow.cons( item_var, mts );
        }
      }
      else if( NIL != arguments.hl_support_p( meta_support ) )
      {
        SubLObject cdolist_list_var_$26 = hl_supports.hl_forward_mt_combos( meta_support );
        SubLObject meta_meta_support = NIL;
        meta_meta_support = cdolist_list_var_$26.first();
        while ( NIL != cdolist_list_var_$26)
        {
          final SubLObject item_var2 = arguments.support_mt( meta_meta_support );
          if( NIL == conses_high.member( item_var2, mts, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            mts = ConsesLow.cons( item_var2, mts );
          }
          cdolist_list_var_$26 = cdolist_list_var_$26.rest();
          meta_meta_support = cdolist_list_var_$26.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_support = cdolist_list_var.first();
    }
    SubLObject hl_module = NIL;
    SubLObject el_sentence = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list92 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list92 );
    el_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list92 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list92 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var2 = genl_mts.max_floor_mts( mts, UNPROVIDED, UNPROVIDED );
      SubLObject mt_$27 = NIL;
      mt_$27 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        supports = ConsesLow.cons( arguments.make_hl_support( hl_module, el_sentence, mt_$27, tv ), supports );
        cdolist_list_var2 = cdolist_list_var2.rest();
        mt_$27 = cdolist_list_var2.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list92 );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 26988L)
  public static SubLObject supports_have_predsP(final SubLObject supports, final SubLObject preds)
  {
    return list_utilities.sets_equalP( preds, get_supports_preds( supports ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 27102L)
  public static SubLObject get_supports_preds(final SubLObject supports)
  {
    return Mapping.mapcar( $sym94$SUPPORT_SENTENCE_OPERATOR, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 27203L)
  public static SubLObject hl_verify_and_justify_term_phrases(final SubLObject support)
  {
    final SubLObject narty_support = narts_high.nart_substitute( support );
    return ( NIL != hl_verify_term_phrases( narty_support ) ) ? hl_justify_term_phrases( narty_support ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 33777L)
  public static SubLObject removal_term_phrases_required(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return control_vars.lexicon_initialized_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 33959L)
  public static SubLObject get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, SubLObject case_insensitiveP, SubLObject lexical_onlyP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    if( lexical_onlyP == UNPROVIDED )
    {
      lexical_onlyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = list_utilities.remove_if_not( $sym104$SUPPORT_P, nl_trie_accessors.nl_trie_get_term_phrases_supports( denot, string, constraint, case_insensitiveP, mt_relevance_macros.$mt$.getDynamicValue(
        thread ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject pos = NIL;
    SubLObject pos_pred = NIL;
    if( NIL == supports && NIL == lexical_onlyP )
    {
      supports = get_non_lexical_term_phrases_supports( denot, string, constraint, case_insensitiveP );
    }
    if( NIL != supports )
    {
      SubLObject pos_pred_support = Sequences.find_if( $sym105$SPEECH_PART_PRED_, supports, $sym94$SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED );
      if( NIL != pos_pred_support )
      {
        pos_pred = arguments.support_sentence_operator( pos_pred_support );
      }
      if( NIL == pos_pred )
      {
        pos_pred_support = Sequences.find( $const106$abbreviationForLexicalWord, supports, Symbols.symbol_function( EQL ), $sym94$SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED );
        if( NIL != pos_pred_support )
        {
          pos_pred = cycl_utilities.atomic_sentence_arg2( arguments.support_sentence( pos_pred_support ), UNPROVIDED );
        }
      }
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( lexicon_utilities.preds_to_pos_args() ) ); NIL == pos && NIL == dictionary_contents
          .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject pos_arg = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pos_support = Sequences.find( pred, supports, Symbols.symbol_function( EQUAL ), $sym94$SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED );
        if( NIL != pos_support )
        {
          pos = cycl_utilities.atomic_sentence_arg( arguments.support_sentence( pos_support ), pos_arg, UNPROVIDED );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      if( NIL != lexicon_accessors.speech_partP( constraint, UNPROVIDED ) && !pos.equal( constraint ) )
      {
        SubLObject cdolist_list_var = backward.removal_ask_justifications( ConsesLow.list( $const108$genls, pos, constraint ), mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw84$TRUE, $list109 ).first();
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item_var = support;
          if( NIL == conses_high.member( item_var, supports, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym107$SUPPORT_SENTENCE ) ) )
          {
            supports = ConsesLow.cons( item_var, supports );
          }
          cdolist_list_var = cdolist_list_var.rest();
          support = cdolist_list_var.first();
        }
      }
    }
    if( NIL != pos && NIL != pos_pred && NIL == conses_high.member( $const74$speechPartPreds, supports, Symbols.symbol_function( EQL ), $sym94$SUPPORT_SENTENCE_OPERATOR ) )
    {
      SubLObject cdolist_list_var = backward.removal_ask_justifications( ConsesLow.list( $const74$speechPartPreds, pos, pos_pred ), mt_relevance_macros.$mt$.getDynamicValue( thread ), $kw84$TRUE, $list109 ).first();
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject item_var = support;
        if( NIL == conses_high.member( item_var, supports, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym107$SUPPORT_SENTENCE ) ) )
        {
          supports = ConsesLow.cons( item_var, supports );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 35716L)
  public static SubLObject get_non_lexical_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, final SubLObject case_insensitiveP)
  {
    SubLObject supports = NIL;
    if( string.isString() )
    {
      supports = psp_main.psp_hl_justify_parse( string, constraint, denot, case_insensitiveP );
    }
    if( NIL != list_utilities.empty_list_p( supports ) )
    {
      SubLObject cdolist_list_var = pph_methods_lexicon.hl_justify_string_for_term( denot, string, preds_from_term_phrases_constraint( constraint ), case_insensitiveP );
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == formula_pattern_match.formula_matches_pattern( arguments.support_sentence( support ), ConsesLow.list( $list110, denot, constraint, string ) ) )
        {
          supports = ConsesLow.cons( support, supports );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 36369L)
  public static SubLObject do_lexical_gafs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject gaf = NIL;
    SubLObject v_term = NIL;
    SubLObject predicate = NIL;
    SubLObject index_arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    gaf = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    predicate = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    index_arg = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym112$PIF, ConsesLow.list( $sym113$INDEXED_TERM_P, v_term ), ConsesLow.listS( $sym114$DO_GAF_ARG_INDEX, ConsesLow.listS( gaf, new SubLObject[] { v_term, $kw115$PREDICATE, predicate,
        $kw116$INDEX, index_arg, $list117
      } ), ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym118$DO_GAF_ARG_INDEX_NAUT, ConsesLow.listS( gaf, new SubLObject[] { v_term, $kw115$PREDICATE, predicate, $kw116$INDEX, index_arg, $list117
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list111 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 36704L)
  public static SubLObject removal_term_phrases_unify_arg3_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject v_term = NIL;
    SubLObject constraint = NIL;
    SubLObject arg3 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    v_term = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    constraint = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list119 );
    arg3 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject preds = preds_from_term_phrases_constraint( constraint );
      final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p( asent );
      if( NIL != preds )
      {
        final SubLObject strings = removal_modules_term_strings.inference_strings_for_term( v_term, preds, lexical_onlyP );
        add_term_phrases_removal_nodes( strings, asent, arg3 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list119 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37179L)
  public static SubLObject add_term_phrases_removal_nodes(final SubLObject values, final SubLObject asent, final SubLObject target)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = values;
    SubLObject value = NIL;
    value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject v_bindings = ( NIL != case_insensitive_term_phrases_asent_p( asent ) ) ? term_unify_case_insensitive( value, target, T, T ) : unification_utilities.term_unify( value, target, T, T );
      final SubLObject unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != v_bindings )
      {
        final SubLObject formula = bindings.subst_bindings( v_bindings, asent );
        final SubLObject hl_support = make_term_phrases_support( formula );
        backward.removal_add_node( hl_support, v_bindings, unify_justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      value = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37686L)
  public static SubLObject make_term_phrases_support(final SubLObject formula)
  {
    return arguments.make_hl_support( $kw120$TERM_PHRASES, formula, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 37790L)
  public static SubLObject term_unify_case_insensitive(final SubLObject value, final SubLObject target, SubLObject share_vars, SubLObject justifyP)
  {
    if( share_vars == UNPROVIDED )
    {
      share_vars = T;
    }
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    return unification_utilities.term_unify( value.isString() ? Strings.string_downcase( value, UNPROVIDED, UNPROVIDED ) : value, target.isString() ? Strings.string_downcase( target, UNPROVIDED, UNPROVIDED ) : target,
        share_vars, justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 38048L)
  public static SubLObject preds_from_term_phrases_constraint(final SubLObject constraint)
  {
    SubLObject preds = NIL;
    if( NIL != lexicon_accessors.speech_partP( constraint, UNPROVIDED ) )
    {
      preds = lexicon_accessors.all_preds_of_pos( constraint );
    }
    else if( NIL != lexicon_accessors.speech_part_predP( constraint, UNPROVIDED ) )
    {
      preds = Sequences.remove_if( Symbols.symbol_function( $sym121$GENERIC_PRED_ ), genl_predicates.all_spec_preds( constraint, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != isa.isaP( constraint, $const122$StringIndexingSlot, UNPROVIDED, UNPROVIDED ) )
    {
      preds = list_utilities.remove_if_not( $sym123$NAME_STRING_PRED_, genl_predicates.all_spec_preds( constraint, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else if( constraint.eql( $const124$ProperNameString ) )
    {
      preds = list_utilities.remove_if_not( $sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values( $const124$ProperNameString, $const125$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), UNPROVIDED, UNPROVIDED,
          UNPROVIDED, UNPROVIDED );
    }
    else if( constraint.eql( $const91$CharacterString ) )
    {
      preds = $kw126$ALL;
    }
    if( NIL == lexicon_accessors.speech_partP( constraint, UNPROVIDED ) )
    {
      final SubLObject pos_of_cat = lexicon_utilities.pos_of_cat( constraint, UNPROVIDED );
      if( NIL != pos_of_cat )
      {
        final SubLObject items_var = preds_from_term_phrases_constraint( pos_of_cat );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            preds = ConsesLow.cons( item, preds );
          }
        }
        else
        {
          SubLObject cdolist_list_var = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            preds = ConsesLow.cons( item2, preds );
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
        preds = Sequences.delete_duplicates( preds, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    if( preds != $kw126$ALL && NIL != genls.genlP( $const127$NLWordForm, constraint, UNPROVIDED, UNPROVIDED ) )
    {
      preds = $kw126$ALL;
    }
    if( NIL != genls.genlP( $const128$NounPhrase, constraint, UNPROVIDED, UNPROVIDED ) && preds.isList() )
    {
      preds = ConsesLow.append( preds, list_utilities.remove_if_not( $sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values( $const124$ProperNameString, $const125$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ),
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      preds = ConsesLow.append( preds, genl_predicates.all_spec_preds( $const129$nonSingular_Generic, UNPROVIDED, UNPROVIDED ) );
    }
    return preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 39310L)
  public static SubLObject generic_predP(final SubLObject pred)
  {
    return isa.isaP( pred, $const130$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 44519L)
  public static SubLObject removal_term_phrases_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject constraint = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    constraint = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject preds = preds_from_term_phrases_constraint( constraint );
      final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p( asent );
      final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p( asent );
      final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
      try
      {
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == case_insensitiveP ) ? $kw148$ON : $kw149$OFF, thread );
        if( preds.isList() )
        {
          SubLObject found_oneP = NIL;
          SubLObject support_sentence = el_utilities.copy_expression( asent );
          SubLObject no_lexical_denotsP = NIL;
          final SubLObject _prev_bind_0_$28 = lexicon_vars.$parse_morphologically$.currentBinding( thread );
          try
          {
            lexicon_vars.$parse_morphologically$.bind( $kw150$NEVER, thread );
            SubLObject cdolist_list_var = preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject denots = inference_denots_of_stringXpred( string, pred );
              if( NIL != denots )
              {
                found_oneP = T;
                support_sentence = el_utilities.nreplace_formula_arg( TWO_INTEGER, pred, support_sentence );
                add_term_phrases_removal_nodes( denots, support_sentence, arg1 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              pred = cdolist_list_var.first();
            }
            no_lexical_denotsP = makeBoolean( NIL == found_oneP );
          }
          finally
          {
            lexicon_vars.$parse_morphologically$.rebind( _prev_bind_0_$28, thread );
          }
          if( NIL != no_lexical_denotsP )
          {
            final SubLObject _prev_bind_0_$29 = lexicon_vars.$parse_morphologically$.currentBinding( thread );
            try
            {
              lexicon_vars.$parse_morphologically$.bind( $kw151$ONLY, thread );
              SubLObject cdolist_list_var = preds;
              SubLObject pred = NIL;
              pred = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject denots = inference_denots_of_stringXpred( string, pred );
                if( NIL != denots )
                {
                  found_oneP = T;
                  support_sentence = el_utilities.nreplace_formula_arg( TWO_INTEGER, pred, support_sentence );
                  add_term_phrases_removal_nodes( denots, support_sentence, arg1 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
              }
              no_lexical_denotsP = makeBoolean( NIL == found_oneP );
            }
            finally
            {
              lexicon_vars.$parse_morphologically$.rebind( _prev_bind_0_$29, thread );
            }
          }
        }
        else
        {
          add_term_phrases_removal_nodes( inference_denots_of_string( string ), asent, arg1 );
        }
      }
      finally
      {
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_0, thread );
      }
      if( NIL == lexical_onlyP )
      {
        SubLObject timed_outP = NIL;
        if( NIL != inference_strategist.current_controlling_inference_time_remaining() )
        {
          final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
          final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
          final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
          try
          {
            parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
            parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( inference_strategist.current_controlling_inference_time_remaining() ), thread );
            parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
            if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
            {
              add_term_phrases_removal_nodes( psp_main.inference_ps_get_cycls_for_phrase( string, constraint, case_insensitiveP ), asent, arg1 );
            }
            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
          }
          finally
          {
            parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_4, thread );
            parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_3, thread );
            parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_2, thread );
          }
        }
        else
        {
          add_term_phrases_removal_nodes( psp_main.inference_ps_get_cycls_for_phrase( string, constraint, case_insensitiveP ), asent, arg1 );
          timed_outP = NIL;
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 45941L)
  public static SubLObject case_insensitive_term_phrases_asent_p(final SubLObject asent)
  {
    return subl_promotions.memberP( cycl_utilities.atomic_sentence_predicate( asent ), $list152, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46134L)
  public static SubLObject lexical_only_term_phrases_asent_p(final SubLObject asent)
  {
    return subl_promotions.memberP( cycl_utilities.atomic_sentence_predicate( asent ), $list153, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46311L)
  public static SubLObject inference_denots_of_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      denots = lexicon_accessors.denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return denots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 46487L)
  public static SubLObject inference_denots_of_stringXpred(final SubLObject string, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denots = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
      denots = lexicon_accessors.denots_of_stringXpred( string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return denots;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 47889L)
  public static SubLObject removal_term_phrases_unify_arg1_and_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    arg2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding( thread );
      try
      {
        lexicon_vars.$lexicon_lookup_mt$.bind( mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind( ( NIL == case_insensitive_term_phrases_asent_p( asent ) ) ? $kw148$ON : $kw149$OFF, thread );
        thread.resetMultipleValues();
        final SubLObject denots = lexicon_accessors.denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject pred_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        add_term_phrases_arg1_and_arg2_removal_nodes( asent, denots, pred_lists );
      }
      finally
      {
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind( _prev_bind_2, thread );
        lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
      }
      if( NIL == lexical_only_term_phrases_asent_p( asent ) )
      {
        SubLObject timed_outP = NIL;
        if( NIL != inference_strategist.current_controlling_inference_time_remaining() )
        {
          final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding( thread );
          final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_time$.currentBinding( thread );
          final SubLObject _prev_bind_5 = parsing_macros.$parsing_timeout_reachedP$.currentBinding( thread );
          try
          {
            parsing_macros.$parsing_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
            parsing_macros.$parsing_timeout_time$.bind( parsing_macros.parsing_compute_timeout_time( inference_strategist.current_controlling_inference_time_remaining() ), thread );
            parsing_macros.$parsing_timeout_reachedP$.bind( parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ), thread );
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue( parsing_macros.parsing_timeout_time_reachedP(), thread );
            if( NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue( thread ) )
            {
              SubLObject cdolist_list_var = psp_main.inference_ps_get_cycls_and_constraints_for_phrase( string, case_insensitive_term_phrases_asent_p( asent ) );
              SubLObject pair = NIL;
              pair = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current_$31;
                final SubLObject datum_$30 = current_$31 = pair;
                SubLObject denot = NIL;
                SubLObject pred = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list159 );
                denot = current_$31.first();
                current_$31 = current_$31.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$31, datum_$30, $list159 );
                pred = current_$31.first();
                current_$31 = current_$31.rest();
                if( NIL == current_$31 )
                {
                  add_term_phrases_arg1_and_arg2_removal_node( asent, denot, pred );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$30, $list159 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
              }
            }
            timed_outP = parsing_macros.parsing_timeout_time_reachedP();
          }
          finally
          {
            parsing_macros.$parsing_timeout_reachedP$.rebind( _prev_bind_5, thread );
            parsing_macros.$parsing_timeout_time$.rebind( _prev_bind_4, thread );
            parsing_macros.$parsing_timeout_time_check_count$.rebind( _prev_bind_3, thread );
          }
        }
        else
        {
          SubLObject cdolist_list_var2 = psp_main.inference_ps_get_cycls_and_constraints_for_phrase( string, case_insensitive_term_phrases_asent_p( asent ) );
          SubLObject pair2 = NIL;
          pair2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            SubLObject current_$32;
            final SubLObject datum_$31 = current_$32 = pair2;
            SubLObject denot2 = NIL;
            SubLObject pred2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current_$32, datum_$31, $list159 );
            denot2 = current_$32.first();
            current_$32 = current_$32.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current_$32, datum_$31, $list159 );
            pred2 = current_$32.first();
            current_$32 = current_$32.rest();
            if( NIL == current_$32 )
            {
              add_term_phrases_arg1_and_arg2_removal_node( asent, denot2, pred2 );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum_$31, $list159 );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pair2 = cdolist_list_var2.first();
          }
          timed_outP = NIL;
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 48852L)
  public static SubLObject add_term_phrases_arg1_and_arg2_removal_nodes(final SubLObject asent, final SubLObject denots, final SubLObject pred_lists)
  {
    SubLObject denot = NIL;
    SubLObject denot_$34 = NIL;
    SubLObject pred_list = NIL;
    SubLObject pred_list_$35 = NIL;
    denot = denots;
    denot_$34 = denot.first();
    pred_list = pred_lists;
    pred_list_$35 = pred_list.first();
    while ( NIL != pred_list || NIL != denot)
    {
      SubLObject cdolist_list_var = pred_list_$35;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        add_term_phrases_arg1_and_arg2_removal_node( asent, denot_$34, pred );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
      denot = denot.rest();
      denot_$34 = denot.first();
      pred_list = pred_list.rest();
      pred_list_$35 = pred_list.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 49121L)
  public static SubLObject add_term_phrases_arg1_and_arg2_removal_node(final SubLObject asent, final SubLObject denot, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject arg1 = NIL;
    SubLObject arg2 = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    arg2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list158 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      thread.resetMultipleValues();
      final SubLObject denot_bindings = unification_utilities.term_unify( denot, arg1, T, T );
      final SubLObject denot_unify_justification = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = term_phrases_constraints_from_pred( pred );
      SubLObject constraint = NIL;
      constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject constraint_bindings = unification_utilities.term_unify( constraint, arg2, T, T );
        final SubLObject constraint_unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == bindings.some_variable_with_conflicting_bindings( denot_bindings, constraint_bindings ) )
        {
          final SubLObject all_bindings = ConsesLow.append( denot_bindings, constraint_bindings );
          final SubLObject formula = bindings.subst_bindings( all_bindings, asent );
          final SubLObject hl_support = make_term_phrases_support( formula );
          backward.removal_add_node( hl_support, all_bindings, ConsesLow.append( denot_unify_justification, constraint_unify_justification ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        constraint = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list158 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 49982L)
  public static SubLObject term_phrases_constraints_from_pred(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constraints = ConsesLow.list( $const91$CharacterString );
    final SubLObject name_string_predP = lexicon_vars.name_string_predP( pred );
    final SubLObject pos = ( NIL != name_string_predP || NIL == lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) ) ? NIL : lexicon_accessors.pos_of_pred( pred );
    final SubLObject deck_type = $kw17$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw20$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw23$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw25$WARN ) )
            {
              Errors.warn( $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var, $sym22$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const27$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$42 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject genl_predicate = node_var_$42;
                  final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$42 ) && NIL != isa.isaP( genl_predicate, $const160$TermPhrasesConstraint,
                        UNPROVIDED, UNPROVIDED ) )
                    {
                      constraints = ConsesLow.cons( genl_predicate, constraints );
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const27$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$42 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$47;
                                    for( iteration_state_$47 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$47 ); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next( iteration_state_$47 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$47 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$42, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$47 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$41, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$49;
                          final SubLObject new_list = cdolist_list_var_$49 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$49.first();
                          while ( NIL != cdolist_list_var_$49)
                          {
                            final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$43, thread );
                            }
                            cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                            generating_fn = cdolist_list_var_$49.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$40, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$40, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$39, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$41, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$39, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$38, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$38, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$37, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$36, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    if( NIL != name_string_predP )
    {
      constraints = ConsesLow.cons( $const124$ProperNameString, constraints );
      constraints = ConsesLow.cons( $const128$NounPhrase, constraints );
      final SubLObject deck_type_$53 = $kw17$QUEUE;
      final SubLObject recur_deck_$54 = deck.create_deck( deck_type_$53 );
      final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var2 = NIL;
          final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var2 ) )
            {
              final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var2.eql( $kw20$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var2.eql( $kw23$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var2.eql( $kw25$WARN ) )
              {
                Errors.warn( $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const161$isa ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const161$isa ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const161$isa ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const161$isa ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  SubLObject cdolist_list_var2;
                  final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const161$isa ) );
                  SubLObject module_var2 = NIL;
                  module_var2 = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                          .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                      final SubLObject node2 = function_terms.naut_to_nart( pred );
                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                      {
                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                        if( NIL != d_link2 )
                        {
                          final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != mt_links2 )
                          {
                            SubLObject iteration_state2;
                            for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                              final SubLObject tv_links2 = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                              {
                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                  SubLObject iteration_state_$48;
                                  for( iteration_state_$48 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state_$48 ); iteration_state_$48 = dictionary_contents.do_dictionary_contents_next( iteration_state_$48 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$48 );
                                    final SubLObject link_nodes3 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                        final SubLObject sol3 = link_nodes3;
                                        if( NIL != set.set_p( sol3 ) )
                                        {
                                          final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                          SubLObject basis_object3;
                                          SubLObject state3;
                                          SubLObject node_vars_link_node5;
                                          for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                              set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                          {
                                            node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                            if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node5,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node5, recur_deck_$54 );
                                            }
                                          }
                                        }
                                        else if( sol3.isList() )
                                        {
                                          SubLObject csome_list_var3 = sol3;
                                          SubLObject node_vars_link_node6 = NIL;
                                          node_vars_link_node6 = csome_list_var3.first();
                                          while ( NIL != csome_list_var3)
                                          {
                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node6, recur_deck_$54 );
                                            }
                                            csome_list_var3 = csome_list_var3.rest();
                                            node_vars_link_node6 = csome_list_var3.first();
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$50, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$48 );
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$49, thread );
                                }
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                      {
                        SubLObject cdolist_list_var_$50;
                        final SubLObject new_list2 = cdolist_list_var_$50 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                UNPROVIDED ) ) )
                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                .get_sbhl_module( UNPROVIDED ) ) );
                        SubLObject generating_fn2 = NIL;
                        generating_fn2 = cdolist_list_var_$50.first();
                        while ( NIL != cdolist_list_var_$50)
                        {
                          final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                          try
                          {
                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                            final SubLObject sol4;
                            final SubLObject link_nodes4 = sol4 = Functions.funcall( generating_fn2, node2 );
                            if( NIL != set.set_p( sol4 ) )
                            {
                              final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                              SubLObject basis_object4;
                              SubLObject state4;
                              SubLObject node_vars_link_node7;
                              for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                  set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                              {
                                node_vars_link_node7 = set_contents.do_set_contents_next( basis_object4, state4 );
                                if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node7 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node7, recur_deck_$54 );
                                }
                              }
                            }
                            else if( sol4.isList() )
                            {
                              SubLObject csome_list_var4 = sol4;
                              SubLObject node_vars_link_node8 = NIL;
                              node_vars_link_node8 = csome_list_var4.first();
                              while ( NIL != csome_list_var4)
                              {
                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node8, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node8, recur_deck_$54 );
                                }
                                csome_list_var4 = csome_list_var4.rest();
                                node_vars_link_node8 = csome_list_var4.first();
                              }
                            }
                            else
                            {
                              Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                            }
                          }
                          finally
                          {
                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$51, thread );
                          }
                          cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                          generating_fn2 = cdolist_list_var_$50.first();
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$43, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$48, thread );
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    module_var2 = cdolist_list_var2.first();
                  }
                  SubLObject node_var_$43 = deck.deck_pop( recur_deck_$54 );
                  final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  try
                  {
                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                    while ( NIL != node_var_$43)
                    {
                      final SubLObject v_isa = node_var_$43;
                      if( NIL != isa.isaP( v_isa, $const160$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED ) )
                      {
                        constraints = ConsesLow.cons( v_isa, constraints );
                      }
                      SubLObject cdolist_list_var3;
                      final SubLObject accessible_modules3 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                      SubLObject module_var3 = NIL;
                      module_var3 = cdolist_list_var3.first();
                      while ( NIL != cdolist_list_var3)
                      {
                        final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var3, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node3 = function_terms.naut_to_nart( node_var_$43 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node3 ) )
                          {
                            final SubLObject d_link3 = sbhl_graphs.get_sbhl_graph_link( node3, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link3 )
                            {
                              final SubLObject mt_links3 = sbhl_links.get_sbhl_mt_links( d_link3, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links3 )
                              {
                                SubLObject iteration_state3;
                                for( iteration_state3 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links3 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state3 ); iteration_state3 = dictionary_contents.do_dictionary_contents_next( iteration_state3 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state3 );
                                  final SubLObject tv_links3 = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                  {
                                    final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                      SubLObject iteration_state_$49;
                                      for( iteration_state_$49 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links3 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$49 ); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next( iteration_state_$49 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$49 );
                                        final SubLObject link_nodes5 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv3 ) )
                                        {
                                          final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv3, thread );
                                            final SubLObject sol5 = link_nodes5;
                                            if( NIL != set.set_p( sol5 ) )
                                            {
                                              final SubLObject set_contents_var5 = set.do_set_internal( sol5 );
                                              SubLObject basis_object5;
                                              SubLObject state5;
                                              SubLObject node_vars_link_node9;
                                              for( basis_object5 = set_contents.do_set_contents_basis_object( set_contents_var5 ), state5 = NIL, state5 = set_contents.do_set_contents_initial_state( basis_object5,
                                                  set_contents_var5 ); NIL == set_contents.do_set_contents_doneP( basis_object5, state5 ); state5 = set_contents.do_set_contents_update_state( state5 ) )
                                              {
                                                node_vars_link_node9 = set_contents.do_set_contents_next( basis_object5, state5 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state5, node_vars_link_node9 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node9, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node9, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node9, recur_deck_$54 );
                                                }
                                              }
                                            }
                                            else if( sol5.isList() )
                                            {
                                              SubLObject csome_list_var5 = sol5;
                                              SubLObject node_vars_link_node = NIL;
                                              node_vars_link_node = csome_list_var5.first();
                                              while ( NIL != csome_list_var5)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck_$54 );
                                                }
                                                csome_list_var5 = csome_list_var5.rest();
                                                node_vars_link_node = csome_list_var5.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol5 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$55, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$49 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$54, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state3 );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node3, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$51;
                            final SubLObject new_list3 = cdolist_list_var_$51 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn3 = NIL;
                            generating_fn3 = cdolist_list_var_$51.first();
                            while ( NIL != cdolist_list_var_$51)
                            {
                              final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn3, thread );
                                final SubLObject sol6;
                                final SubLObject link_nodes6 = sol6 = Functions.funcall( generating_fn3, node3 );
                                if( NIL != set.set_p( sol6 ) )
                                {
                                  final SubLObject set_contents_var6 = set.do_set_internal( sol6 );
                                  SubLObject node_vars_link_node6;
                                  SubLObject basis_object6;
                                  SubLObject state6;
                                  for( basis_object6 = set_contents.do_set_contents_basis_object( set_contents_var6 ), state6 = NIL, state6 = set_contents.do_set_contents_initial_state( basis_object6,
                                      set_contents_var6 ); NIL == set_contents.do_set_contents_doneP( basis_object6, state6 ); state6 = set_contents.do_set_contents_update_state( state6 ) )
                                  {
                                    node_vars_link_node6 = set_contents.do_set_contents_next( basis_object6, state6 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state6, node_vars_link_node6 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node6, recur_deck_$54 );
                                    }
                                  }
                                }
                                else if( sol6.isList() )
                                {
                                  SubLObject csome_list_var6 = sol6;
                                  SubLObject node_vars_link_node3 = NIL;
                                  node_vars_link_node3 = csome_list_var6.first();
                                  while ( NIL != csome_list_var6)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck_$54 );
                                    }
                                    csome_list_var6 = csome_list_var6.rest();
                                    node_vars_link_node3 = csome_list_var6.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol6 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$56, thread );
                              }
                              cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                              generating_fn3 = cdolist_list_var_$51.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$45, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$53, thread );
                        }
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        module_var3 = cdolist_list_var3.first();
                      }
                      node_var_$43 = deck.deck_pop( recur_deck_$54 );
                    }
                  }
                  finally
                  {
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$43, thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$44, thread );
                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$52, thread );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$42, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$42, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$47, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_10, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_9, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_8, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$41, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$46, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_7, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$45, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_6, thread );
      }
    }
    else if( NIL != pos )
    {
      if( NIL != lexicon_accessors.genl_pos_predP( pred, $const129$nonSingular_Generic, UNPROVIDED ) )
      {
        constraints = ConsesLow.cons( $const128$NounPhrase, constraints );
      }
      SubLObject node_var_$44 = pos;
      final SubLObject deck_type_$54 = $kw16$STACK;
      final SubLObject recur_deck_$55 = deck.create_deck( deck_type_$54 );
      final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var2 = NIL;
          final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var2 ) )
            {
              final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var2.eql( $kw20$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var2.eql( $kw23$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var2.eql( $kw25$WARN ) )
              {
                Errors.warn( $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str24$continue_anyway, $str21$_A_is_not_a__A, tv_var2, $sym22$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const108$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const108$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const108$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const108$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pos, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const108$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$44, UNPROVIDED );
                  while ( NIL != node_var_$44)
                  {
                    final SubLObject genl = node_var_$44;
                    if( NIL != isa.isaP( genl, $const160$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED ) )
                    {
                      constraints = ConsesLow.cons( genl, constraints );
                    }
                    SubLObject cdolist_list_var2;
                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const108$genls ) );
                    SubLObject module_var2 = NIL;
                    module_var2 = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      final SubLObject _prev_bind_0_$61 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node2 = function_terms.naut_to_nart( node_var_$44 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                        {
                          final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link2 )
                          {
                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links2 )
                            {
                              SubLObject iteration_state2;
                              for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                final SubLObject tv_links2 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                {
                                  final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                    SubLObject iteration_state_$50;
                                    for( iteration_state_$50 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$50 ); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next( iteration_state_$50 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$50 );
                                      final SubLObject link_nodes3 = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                          final SubLObject sol3 = link_nodes3;
                                          if( NIL != set.set_p( sol3 ) )
                                          {
                                            final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                            SubLObject basis_object3;
                                            SubLObject state3;
                                            SubLObject node_vars_link_node5;
                                            for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                            {
                                              node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                              if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node5,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node5, recur_deck_$55 );
                                              }
                                            }
                                          }
                                          else if( sol3.isList() )
                                          {
                                            SubLObject csome_list_var3 = sol3;
                                            SubLObject node_vars_link_node6 = NIL;
                                            node_vars_link_node6 = csome_list_var3.first();
                                            while ( NIL != csome_list_var3)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node6, recur_deck_$55 );
                                              }
                                              csome_list_var3 = csome_list_var3.rest();
                                              node_vars_link_node6 = csome_list_var3.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$63, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$50 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$62, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$52;
                          final SubLObject new_list2 = cdolist_list_var_$52 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn2 = NIL;
                          generating_fn2 = cdolist_list_var_$52.first();
                          while ( NIL != cdolist_list_var_$52)
                          {
                            final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                              final SubLObject sol4;
                              final SubLObject link_nodes4 = sol4 = Functions.funcall( generating_fn2, node2 );
                              if( NIL != set.set_p( sol4 ) )
                              {
                                final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                SubLObject basis_object4;
                                SubLObject state4;
                                SubLObject node_vars_link_node7;
                                for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                    set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                {
                                  node_vars_link_node7 = set_contents.do_set_contents_next( basis_object4, state4 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node7 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node7, recur_deck_$55 );
                                  }
                                }
                              }
                              else if( sol4.isList() )
                              {
                                SubLObject csome_list_var4 = sol4;
                                SubLObject node_vars_link_node8 = NIL;
                                node_vars_link_node8 = csome_list_var4.first();
                                while ( NIL != csome_list_var4)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node8, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node8, recur_deck_$55 );
                                  }
                                  csome_list_var4 = csome_list_var4.rest();
                                  node_vars_link_node8 = csome_list_var4.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str28$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$64, thread );
                            }
                            cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                            generating_fn2 = cdolist_list_var_$52.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$48, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$61, thread );
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      module_var2 = cdolist_list_var2.first();
                    }
                    node_var_$44 = deck.deck_pop( recur_deck_$55 );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$44, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$47, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$60, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_10, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_9, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_8, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$46, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$59, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_7, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$58, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_6, thread );
      }
    }
    return constraints;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 51248L)
  public static SubLObject removal_lexicon_namestring_expand(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( asent, UNPROVIDED );
    SubLObject pred = NIL;
    SubLObject arg1 = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
    pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
    arg1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list164 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var = nl_trie_accessors.nl_trie_assertions_with_string_and_namestring_pred( string, pred, T, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED );
      SubLObject as = NIL;
      as = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern( assertions_high.gaf_formula( as ), ConsesLow.list( $list165, $list166, string ) );
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != success )
        {
          final SubLObject name_pred = list_utilities.alist_lookup_without_values( v_bindings, $sym167$NAME_PRED, UNPROVIDED, UNPROVIDED );
          final SubLObject denot = list_utilities.alist_lookup_without_values( v_bindings, $sym168$DENOT, UNPROVIDED, UNPROVIDED );
          if( NIL != lexicon_accessors.genl_pos_predP( name_pred, pred, UNPROVIDED ) )
          {
            thread.resetMultipleValues();
            final SubLObject v_bindings_$96 = unification_utilities.term_unify( denot, arg1, T, T );
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject more_supports = name_pred.eql( pred ) ? NIL
                : ConsesLow.list( arguments.make_hl_support( $kw169$GENLPREDS, el_utilities.make_binary_formula( $const27$genlPreds, name_pred, pred ), UNPROVIDED, UNPROVIDED ) );
            if( NIL != v_bindings_$96 )
            {
              backward.removal_add_node( as, v_bindings_$96, ConsesLow.append( more_supports, unify_justification ) );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        as = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list164 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-lexicon.lisp", position = 52074L)
  public static SubLObject removal_lexicon_namestring_completeP(final SubLObject asent)
  {
    return makeBoolean( NIL == el_utilities.el_formula_with_operator_p( asent, $const83$termStrings ) );
  }

  public static SubLObject declare_removal_modules_lexicon_file()
  {
    SubLFiles.declareFunction( me, "removal_word_strings_check_required", "REMOVAL-WORD-STRINGS-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_verify_word_strings", "HL-VERIFY-WORD-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_word_strings", "HL-JUSTIFY-WORD-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_forward_mt_combos_word_strings", "HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_check_succeedsP", "REMOVAL-WORD-STRINGS-CHECK-SUCCEEDS?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_check_expand", "REMOVAL-WORD-STRINGS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "make_word_strings_support", "MAKE-WORD-STRINGS-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_output_generate", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg2_expand", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_and_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_and_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_strings_iterator_state_print_function_trampoline", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_iterator_state_p", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P", 1, 0, false );
    new $removal_word_strings_iterator_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "removal_wsi_state_speech_part_predicate", "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_wsi_state_arg1", "REMOVAL-WSI-STATE-ARG1", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_wsi_state_arg2", "REMOVAL-WSI-STATE-ARG2", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_wsi_state_trie_iterator", "REMOVAL-WSI-STATE-TRIE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_wsi_state_entry_iterator", "REMOVAL-WSI-STATE-ENTRY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_removal_wsi_state_speech_part_predicate", "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_removal_wsi_state_arg1", "_CSETF-REMOVAL-WSI-STATE-ARG1", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_removal_wsi_state_arg2", "_CSETF-REMOVAL-WSI-STATE-ARG2", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_removal_wsi_state_trie_iterator", "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_removal_wsi_state_entry_iterator", "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "make_removal_word_strings_iterator_state", "MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_removal_word_strings_iterator_state", "VISIT-DEFSTRUCT-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_removal_word_strings_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "iterator_word_strings_done", "ITERATOR-WORD-STRINGS-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "wsi_entry_iterator_prepared_p", "WSI-ENTRY-ITERATOR-PREPARED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wsi_advance_to_next_entry_iterator", "WSI-ADVANCE-TO-NEXT-ENTRY-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "wsi_current_word_and_string_unifyP", "WSI-CURRENT-WORD-AND-STRING-UNIFY?", 3, 0, false );
    SubLFiles.declareFunction( me, "iterator_word_strings_next", "ITERATOR-WORD-STRINGS-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_and_arg2_iterator", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_and_arg2_supports", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_strings_unify_arg1_and_arg2_output_asent", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT", 3, 0, false );
    SubLFiles.declareFunction( me, "set_up_removal_support_for_speech_part_predicate", "SET-UP-REMOVAL-SUPPORT-FOR-SPEECH-PART-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_word_forms_check_required", "REMOVAL-WORD-FORMS-CHECK-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_check_cost", "REMOVAL-WORD-FORMS-CHECK-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_check_expand", "REMOVAL-WORD-FORMS-CHECK-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg1_required", "REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg1_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg1_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg2_required", "REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg3_required", "REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG3-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_arg3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_1_and_2_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_1_and_2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_1_and_2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_2_and_3_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_2_and_3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_word_forms_unify_args_2_and_3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_verify_term_phrases", "HL-VERIFY-TERM-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_justify_term_phrases", "HL-JUSTIFY-TERM-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "destructure_term_phrases_support", "DESTRUCTURE-TERM-PHRASES-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_forward_mt_combos_term_phrases", "HL-FORWARD-MT-COMBOS-TERM-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "supports_have_predsP", "SUPPORTS-HAVE-PREDS?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_supports_preds", "GET-SUPPORTS-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_verify_and_justify_term_phrases", "HL-VERIFY-AND-JUSTIFY-TERM-PHRASES", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_term_phrases_required", "REMOVAL-TERM-PHRASES-REQUIRED", 1, 1, false );
    SubLFiles.declareFunction( me, "get_term_phrases_supports", "GET-TERM-PHRASES-SUPPORTS", 3, 2, false );
    SubLFiles.declareFunction( me, "get_non_lexical_term_phrases_supports", "GET-NON-LEXICAL-TERM-PHRASES-SUPPORTS", 4, 0, false );
    SubLFiles.declareMacro( me, "do_lexical_gafs", "DO-LEXICAL-GAFS" );
    SubLFiles.declareFunction( me, "removal_term_phrases_unify_arg3_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "add_term_phrases_removal_nodes", "ADD-TERM-PHRASES-REMOVAL-NODES", 3, 0, false );
    SubLFiles.declareFunction( me, "make_term_phrases_support", "MAKE-TERM-PHRASES-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "term_unify_case_insensitive", "TERM-UNIFY-CASE-INSENSITIVE", 2, 2, false );
    SubLFiles.declareFunction( me, "preds_from_term_phrases_constraint", "PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_predP", "GENERIC-PRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_term_phrases_unify_arg1_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "case_insensitive_term_phrases_asent_p", "CASE-INSENSITIVE-TERM-PHRASES-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lexical_only_term_phrases_asent_p", "LEXICAL-ONLY-TERM-PHRASES-ASENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_denots_of_string", "INFERENCE-DENOTS-OF-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_denots_of_stringXpred", "INFERENCE-DENOTS-OF-STRING&PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_term_phrases_unify_arg1_and_arg2_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "add_term_phrases_arg1_and_arg2_removal_nodes", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODES", 3, 0, false );
    SubLFiles.declareFunction( me, "add_term_phrases_arg1_and_arg2_removal_node", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "term_phrases_constraints_from_pred", "TERM-PHRASES-CONSTRAINTS-FROM-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_lexicon_namestring_expand", "REMOVAL-LEXICON-NAMESTRING-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_lexicon_namestring_completeP", "REMOVAL-LEXICON-NAMESTRING-COMPLETE?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_lexicon_file()
  {
    $default_word_string_check_cost$ = SubLFiles.defparameter( "*DEFAULT-WORD-STRING-CHECK-COST*", ONE_INTEGER );
    $default_word_strings_unify_cost$ = SubLFiles.defparameter( "*DEFAULT-WORD-STRINGS-UNIFY-COST*", TWO_INTEGER );
    $dtp_removal_word_strings_iterator_state$ = SubLFiles.defconstant( "*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*", $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE );
    $avg_suffix_expansion_cost$ = SubLFiles.defconstant( "*AVG-SUFFIX-EXPANSION-COST*", THREE_INTEGER );
    $default_term_phrases_cost$ = SubLFiles.defparameter( "*DEFAULT-TERM-PHRASES-COST*", TWO_INTEGER );
    $default_lexicon_namestring_check_cost$ = SubLFiles.defparameter( "*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_lexicon_file()
  {
    utilities_macros.note_funcall_helper_function( $sym1$HL_VERIFY_WORD_STRINGS );
    utilities_macros.note_funcall_helper_function( $sym2$HL_JUSTIFY_WORD_STRINGS );
    utilities_macros.note_funcall_helper_function( $sym3$HL_FORWARD_MT_COMBOS_WORD_STRINGS );
    inference_modules.inference_removal_module( $kw6$REMOVAL_WORD_STRINGS_CHECK, $list7 );
    utilities_macros.note_funcall_helper_function( $sym9$REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw10$REMOVAL_WORD_STRINGS_UNIFY_ARG1, $list11 );
    inference_modules.inference_removal_module( $kw13$REMOVAL_WORD_STRINGS_UNIFY_ARG2, $list14 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_word_strings_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym38$REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list39 );
    Structures.def_csetf( $sym40$REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, $sym41$_CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE );
    Structures.def_csetf( $sym42$REMOVAL_WSI_STATE_ARG1, $sym43$_CSETF_REMOVAL_WSI_STATE_ARG1 );
    Structures.def_csetf( $sym44$REMOVAL_WSI_STATE_ARG2, $sym45$_CSETF_REMOVAL_WSI_STATE_ARG2 );
    Structures.def_csetf( $sym46$REMOVAL_WSI_STATE_TRIE_ITERATOR, $sym47$_CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR );
    Structures.def_csetf( $sym48$REMOVAL_WSI_STATE_ENTRY_ITERATOR, $sym49$_CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR );
    Equality.identity( $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_word_strings_iterator_state$.getGlobalValue(), Symbols.symbol_function(
        $sym60$VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym61$ITERATOR_WORD_STRINGS_DONE );
    utilities_macros.note_funcall_helper_function( $sym62$ITERATOR_WORD_STRINGS_NEXT );
    utilities_macros.note_funcall_helper_function( $sym64$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR );
    utilities_macros.note_funcall_helper_function( $sym65$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS );
    utilities_macros.note_funcall_helper_function( $sym67$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT );
    inference_modules.inference_removal_module( $kw70$REMOVAL_WORD_FORMS_CHECK, $list71 );
    inference_modules.inference_removal_module( $kw72$REMOVAL_WORD_FORMS_UNIFY_ARG1, $list73 );
    inference_modules.inference_removal_module( $kw75$REMOVAL_WORD_FORMS_UNIFY_ARG2, $list76 );
    inference_modules.inference_removal_module( $kw77$REMOVAL_WORD_FORMS_UNIFY_ARG3, $list78 );
    inference_modules.inference_removal_module( $kw79$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, $list80 );
    inference_modules.inference_removal_module( $kw81$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, $list82 );
    utilities_macros.note_funcall_helper_function( $sym85$HL_VERIFY_TERM_PHRASES );
    utilities_macros.note_funcall_helper_function( $sym86$HL_JUSTIFY_TERM_PHRASES );
    utilities_macros.note_funcall_helper_function( $sym93$HL_FORWARD_MT_COMBOS_TERM_PHRASES );
    generic_testing.define_test_case_table_int( $sym95$HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, ConsesLow.list( new SubLObject[] { $kw96$TEST, $sym97$SUPPORTS_HAVE_PREDS_, $kw98$OWNER, NIL, $kw99$CLASSES, NIL, $kw100$KB,
      $kw101$FULL, $kw102$WORKING_, T
    } ), $list103 );
    inference_modules.inference_removal_module( $kw131$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, $list132 );
    inference_modules.inference_removal_module( $kw133$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, $list134 );
    inference_modules.inference_removal_module( $kw135$REMOVAL_TERM_PHRASES_UNIFY_ARG3, $list136 );
    inference_modules.inference_removal_module( $kw137$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, $list138 );
    inference_modules.inference_removal_module( $kw139$REMOVAL_TERM_PHRASES_UNIFY_ARG1, $list140 );
    inference_modules.inference_removal_module( $kw141$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, $list142 );
    inference_modules.inference_removal_module( $kw143$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, $list144 );
    inference_modules.inference_removal_module( $kw145$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, $list146 );
    inference_modules.inference_removal_module( $kw154$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, $list155 );
    inference_modules.inference_removal_module( $kw156$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, $list157 );
    inference_modules.register_solely_specific_removal_module_predicate( $const87$termPhrases );
    inference_modules.register_solely_specific_removal_module_predicate( $const89$termPhrases_CaseInsensitive );
    inference_modules.register_solely_specific_removal_module_predicate( $const163$wordForms );
    utilities_macros.note_funcall_helper_function( $sym170$REMOVAL_LEXICON_NAMESTRING_EXPAND );
    utilities_macros.note_funcall_helper_function( $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ );
    preference_modules.inference_preference_module( $kw172$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list173 );
    preference_modules.inference_preference_module( $kw174$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, $list175 );
    inference_modules.inference_removal_module( $kw176$REMOVAL_LEXICON_NAMESTRING, $list177 );
    return NIL;
  }

  private static SubLObject _constant_103_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest" ) ), constant_handles.reader_make_constant_shell( makeString(
            "nameString" ) ), makeString( "COPD-PFT" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                .reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "acronymString" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword(
                    "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "Atherosclerosis" ) ),
                        constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString( "hardening of the arteries" ) ), constant_handles.reader_make_constant_shell( makeString(
                            "EnglishCompositionalPhrasesLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles
                                .reader_make_constant_shell( makeString( "compoundString" ) ), constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) ), constant_handles.reader_make_constant_shell(
                                    makeString( "presentParticiple" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                        makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "OpenEndedInvestmentCompany" ) ), constant_handles.reader_make_constant_shell(
                                            makeString( "nameString" ) ), makeString( "OEIC" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list(
                                                constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "initialismString" ) ) ) ), ConsesLow
                                                    .list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                        "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "ScubaDiving" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                            "nonPlural-Generic" ) ), makeString( "scuba diving" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword(
                                                                "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell(
                                                                    makeString( "multiWordString" ) ), constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) ), constant_handles
                                                                        .reader_make_constant_shell( makeString( "regularSuffix" ) ), constant_handles.reader_make_constant_shell( makeString( "infinitive" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
          .reader_make_constant_shell( makeString( "SupraventricularTachycardia" ) ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), makeString( "supraventricular tach" ) ), constant_handles
              .reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) ), constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow
                      .list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "Hepatitis" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ), makeString( "hepatitis" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ),
                          makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow
                                  .list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "GolfCourse" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "plural" ) ), makeString( "links" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ), makeKeyword(
                                          "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                              "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ),
                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                      "ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest" ) ), constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString(
                                                          "COPD confirmed by a pulmonary function test" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ),
                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ),
                                                      constant_handles.reader_make_constant_shell( makeString( "compoundString" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
          .reader_make_constant_shell( makeString( "TetralogyOfFallotWithAbsentPulmonaryValve" ) ), constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString(
              "Tetralogy of Fallot with absent pulmonary valve" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "compoundString" ) ), constant_handles.reader_make_constant_shell( makeString( "pnMassNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "DiseaseOfTheAorta" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "CountNoun" ) ), makeString( "disease of the aorta" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ),
                          makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "compoundString" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow
                                  .list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "Tennis-TheGame" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString( "tennis" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ),
                                  makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ) ), ConsesLow
                                          .list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "PorscheCar" ) ), constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString(
                                                  "Porsche" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles
                                                          .reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ) ) ), ConsesLow.list(
                                                              ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "InLineSkating" ) ), constant_handles.reader_make_constant_shell(
                                                                      makeString( "nonPlural-Generic" ) ), makeString( "roller-blading" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "GeneralEnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell(
                                                                                  makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) ), constant_handles
                                                                                      .reader_make_constant_shell( makeString( "regularSuffix" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                          "infinitive" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list(
                                                                                              constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "EnemaAdministeringEvent" ) ), constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "nonPlural-Generic" ) ), makeString( "enema" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "GeneralEnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ),
                                                                                                              constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                                  ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "Exercising" ) ), constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString( "Bewegung" ) ),
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "GermanLexicalMt" ) ), makeKeyword(
                                                                                                                          "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                              "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "denotation" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "singular-Feminine" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                              makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ),
                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "Baseball-TheGame" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "nonPlural-Generic" ) ), makeString(
                                                                                                                                                              "the game of baseball" ) ), constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                      "GeneralEnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ),
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "speechPartPreds" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                      makeString( "genlPreds" ) ), constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "headMedialString" ) ),
                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "massNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                          makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                  "termPhrases-Lexical" ) ), constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "AtrialFibrillationOrFlutter" ) ),
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "nonPlural-Generic" ) ), makeString(
                                                                                                                                                                      "atrial fibrillation or flutter" ) ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "GeneralEnglishMt" ) ), makeKeyword(
                                                                                                                                                                                  "TRUE-DEF" ) ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "speechPartPreds" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "genlPreds" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "headMedialString" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "singular" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
          .reader_make_constant_shell( makeString( "SinglesTableTennis" ) ), constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString( "singles table tennis" ) ), constant_handles
              .reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "multiWordString" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "massNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "VentricularSeptalDefect-Atrial-ventricularCanalType" ) ), constant_handles.reader_make_constant_shell(
                              makeString( "nonPlural-Generic" ) ), makeString( "A-V canal type VSD" ) ), constant_handles.reader_make_constant_shell( makeString( "MedicalLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ),
                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "multiWordString" ) ), constant_handles.reader_make_constant_shell( makeString( "pnSingular" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                  makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "Poker-CardGame" ) ), constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ), makeString( "poker game" ) ), constant_handles
                                          .reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                  "multiWordString" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword(
                                                      "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell(
                                                          makeString( "DiseaseOfTheDescendingAorta" ) ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), makeString(
                                                              "disease of the descending aorta" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishCompositionalPhrasesLexicalMt" ) ), makeKeyword(
                                                                  "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "compoundString" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
          .reader_make_constant_shell( makeString( "Franchise" ) ), constant_handles.reader_make_constant_shell( makeString( "Noun" ) ), makeString( "franchises" ) ), constant_handles.reader_make_constant_shell(
              makeString( "GeneralEnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "genls" ) ), constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "regularSuffix" ) ), constant_handles.reader_make_constant_shell( makeString( "singular" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "Ox" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "CountNoun" ) ), makeString( "oxen" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ), makeKeyword(
                                  "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "plural" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow
                                          .list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "Calcification" ) ),
                                              constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ), makeString( "calcification" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                  "EnglishJargonMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "massNumber" ) ) ) ), ConsesLow.list( ConsesLow
                                                          .list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ),
                                                              constant_handles.reader_make_constant_shell( makeString( "AtresiaWithVentricularSeptalDefect-PulmonaryValve" ) ), constant_handles.reader_make_constant_shell(
                                                                  makeString( "MassNoun" ) ), makeString( "pulmonary valve atresia with ventricular septal defect" ) ), constant_handles.reader_make_constant_shell(
                                                                      makeString( "MedicalLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "speechPartPreds" ) ), constant_handles.reader_make_constant_shell( makeString( "headMedialString" ) ), constant_handles
                                                                              .reader_make_constant_shell( makeString( "massNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ),
                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
                                                                                      .reader_make_constant_shell( makeString( "RenalFailure" ) ), constant_handles.reader_make_constant_shell( makeString( "MassNoun" ) ),
                                                                                      makeString( "renal failure" ) ), constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ), makeKeyword(
                                                                                          "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "multiWordString" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "massNumber" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "AbnormalNumberOfCusps" ) ), constant_handles.reader_make_constant_shell(
                                                                                                              makeString( "nonPlural-Generic" ) ), makeString( "abnormal num of cusps" ) ), constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "CCFLexicalMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow
                                                                                                                      .list( constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) ),
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) ),
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) ), constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "headMedialString" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                  .list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive-Lexical" ) ),
                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "Ox" ) ), constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "CountNoun" ) ), makeString( "oXen" ) ),
                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "GeneralEnglishMt" ) ),
                                                                                                                                      makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "speechPartPreds" ) ), constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "denotation" ) ), constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "plural" ) ) ) ), ConsesLow.list(
                                                                                                                                                      ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ),
                                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "termPhrases" ) ), ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "Submarine" ) ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "mainColorOfObject" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "YellowColor" ) ) ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "CharacterString" ) ),
                                                                                                                                                              makeString( "the yellow submarine" ) ), constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "EnglishMt" ) ),
                                                                                                                                                          makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                  "termPhrases-Lexical" ) ) ) ), ConsesLow.list( ConsesLow
                                                                                                                                                                      .list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ),
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "termPhrases" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "SubcollectionOfWithRelationToFn" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "Submarine" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "mainColorOfObject" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "YellowColor" ) ) ),
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "NounPhrase" ) ), makeString(
                                                                                                                                                                                      "a yellow submarine" ) ),
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "EnglishMt" ) ), makeKeyword(
                                                                                                                                                                                  "TRUE-DEF" ) ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "termPhrases-Lexical" ) ) ) ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( makeKeyword( "TERM-PHRASES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "SubcollectionOfWithRelationToFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Submarine" ) ), constant_handles.reader_make_constant_shell( makeString(
              "mainColorOfObject" ) ), constant_handles.reader_make_constant_shell( makeString( "YellowColor" ) ) ), constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) ), makeString(
                  "yellow submarine" ) ), constant_handles.reader_make_constant_shell( makeString( "EnglishMt" ) ), makeKeyword( "TRUE-DEF" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "termPhrases-Lexical" ) ) ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_lexicon_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_lexicon_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_lexicon_file();
  }
  static
  {
    me = new removal_modules_lexicon();
    $default_word_string_check_cost$ = null;
    $default_word_strings_unify_cost$ = null;
    $dtp_removal_word_strings_iterator_state$ = null;
    $avg_suffix_expansion_cost$ = null;
    $default_term_phrases_cost$ = null;
    $default_lexicon_namestring_check_cost$ = null;
    $list0 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "ASENT" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $sym1$HL_VERIFY_WORD_STRINGS = makeSymbol( "HL-VERIFY-WORD-STRINGS" );
    $sym2$HL_JUSTIFY_WORD_STRINGS = makeSymbol( "HL-JUSTIFY-WORD-STRINGS" );
    $sym3$HL_FORWARD_MT_COMBOS_WORD_STRINGS = makeSymbol( "HL-FORWARD-MT-COMBOS-WORD-STRINGS" );
    $list4 = ConsesLow.list( makeSymbol( "POS-PRED" ), makeSymbol( "WORD" ), makeSymbol( "STRING" ) );
    $const5$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) );
    $kw6$REMOVAL_WORD_STRINGS_CHECK = makeKeyword( "REMOVAL-WORD-STRINGS-CHECK" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SPEECH-PART-PRED?" ) ),
        makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-STRINGS-CHECK-REQUIRED" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
            "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-WORD-STRING-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-WORD-STRINGS-CHECK-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                "(<speech-part-pred> <fully bound> <string>) using the lexicon cache" ), makeKeyword( "EXAMPLE" ), makeString( "(#$nounStrings #$Dog-TheWord \"dog\")" )
    } );
    $kw8$WORD_STRINGS = makeKeyword( "WORD-STRINGS" );
    $sym9$REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE = makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE" );
    $kw10$REMOVAL_WORD_STRINGS_UNIFY_ARG1 = makeKeyword( "REMOVAL-WORD-STRINGS-UNIFY-ARG1" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "SPEECH-PART-PRED?" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-WORD-STRINGS-UNIFY-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "POS-PRED" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "STRING" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword(
              "VALUE" ), makeSymbol( "POS-PRED" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "POS-PRED" ), makeSymbol( "STRING" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE" ), ConsesLow.list( makeKeyword( "VALUE" ),
                      makeSymbol( "POS-PRED" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ),
                          makeSymbol( "POS-PRED" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "STRING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "WORD-STRINGS" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordStrings ?WHAT \"dog\")" )
    } );
    $list12 = ConsesLow.list( makeSymbol( "POS-PRED" ), makeSymbol( "WORD" ), makeSymbol( "ARG2" ) );
    $kw13$REMOVAL_WORD_STRINGS_UNIFY_ARG2 = makeKeyword( "REMOVAL-WORD-STRINGS-UNIFY-ARG2" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "SPEECH-PART-PRED?" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
            "COMPLETE" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache" ), makeKeyword( "EXAMPLE" ), makeString( "(#$nounStrings #$Dog-TheWord ?STRING)" )
    } );
    $kw15$DEPTH = makeKeyword( "DEPTH" );
    $kw16$STACK = makeKeyword( "STACK" );
    $kw17$QUEUE = makeKeyword( "QUEUE" );
    $const18$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw20$ERROR = makeKeyword( "ERROR" );
    $str21$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym22$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw23$CERROR = makeKeyword( "CERROR" );
    $str24$continue_anyway = makeString( "continue anyway" );
    $kw25$WARN = makeKeyword( "WARN" );
    $str26$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const27$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str28$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str29$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str30$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol( "REMOVAL-WORD-STRINGS-ITERATOR-STATE" );
    $sym32$REMOVAL_WORD_STRINGS_ITERATOR_STATE_P = makeSymbol( "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P" );
    $list33 = ConsesLow.list( makeSymbol( "SPEECH-PART-PREDICATE" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "TRIE-ITERATOR" ), makeSymbol( "ENTRY-ITERATOR" ) );
    $list34 = ConsesLow.list( makeKeyword( "SPEECH-PART-PREDICATE" ), makeKeyword( "ARG1" ), makeKeyword( "ARG2" ), makeKeyword( "TRIE-ITERATOR" ), makeKeyword( "ENTRY-ITERATOR" ) );
    $list35 = ConsesLow.list( makeSymbol( "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE" ), makeSymbol( "REMOVAL-WSI-STATE-ARG1" ), makeSymbol( "REMOVAL-WSI-STATE-ARG2" ), makeSymbol( "REMOVAL-WSI-STATE-TRIE-ITERATOR" ),
        makeSymbol( "REMOVAL-WSI-STATE-ENTRY-ITERATOR" ) );
    $list36 = ConsesLow.list( makeSymbol( "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE" ), makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ARG1" ), makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ARG2" ), makeSymbol(
        "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR" ), makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR" ) );
    $sym37$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym38$REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list39 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P" ) );
    $sym40$REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol( "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE" );
    $sym41$_CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol( "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE" );
    $sym42$REMOVAL_WSI_STATE_ARG1 = makeSymbol( "REMOVAL-WSI-STATE-ARG1" );
    $sym43$_CSETF_REMOVAL_WSI_STATE_ARG1 = makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ARG1" );
    $sym44$REMOVAL_WSI_STATE_ARG2 = makeSymbol( "REMOVAL-WSI-STATE-ARG2" );
    $sym45$_CSETF_REMOVAL_WSI_STATE_ARG2 = makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ARG2" );
    $sym46$REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol( "REMOVAL-WSI-STATE-TRIE-ITERATOR" );
    $sym47$_CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol( "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR" );
    $sym48$REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol( "REMOVAL-WSI-STATE-ENTRY-ITERATOR" );
    $sym49$_CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol( "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR" );
    $kw50$SPEECH_PART_PREDICATE = makeKeyword( "SPEECH-PART-PREDICATE" );
    $kw51$ARG1 = makeKeyword( "ARG1" );
    $kw52$ARG2 = makeKeyword( "ARG2" );
    $kw53$TRIE_ITERATOR = makeKeyword( "TRIE-ITERATOR" );
    $kw54$ENTRY_ITERATOR = makeKeyword( "ENTRY-ITERATOR" );
    $str55$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw56$BEGIN = makeKeyword( "BEGIN" );
    $sym57$MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol( "MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE" );
    $kw58$SLOT = makeKeyword( "SLOT" );
    $kw59$END = makeKeyword( "END" );
    $sym60$VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD" );
    $sym61$ITERATOR_WORD_STRINGS_DONE = makeSymbol( "ITERATOR-WORD-STRINGS-DONE" );
    $sym62$ITERATOR_WORD_STRINGS_NEXT = makeSymbol( "ITERATOR-WORD-STRINGS-NEXT" );
    $list63 = ConsesLow.list( makeSymbol( "SPEECH-PART-PREDICATE" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) );
    $sym64$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR = makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR" );
    $sym65$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS = makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS" );
    $list66 = ConsesLow.cons( makeSymbol( "STRING" ), makeSymbol( "SUPPORTS" ) );
    $sym67$REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT = makeSymbol( "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT" );
    $list68 = ConsesLow.list( makeKeyword( "REMOVAL-WORD-STRINGS-UNIFY-ARG2" ), makeKeyword( "REMOVAL-WORD-STRINGS-UNIFY-ARG1" ), makeKeyword( "REMOVAL-WORD-STRINGS-CHECK" ) );
    $const69$regularSuffix = constant_handles.reader_make_constant_shell( makeString( "regularSuffix" ) );
    $kw70$REMOVAL_WORD_FORMS_CHECK = makeKeyword( "REMOVAL-WORD-FORMS-CHECK" );
    $list71 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword(
            "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-CHECK-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-CHECK-COST" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-WORD-FORMS-CHECK-EXPAND" ),
      makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$wordForms <fully bound> <fully bound> <string>) using morphology functions" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$wordForms #$Ox-TheWord #$plural \"oxen\")" )
    } );
    $kw72$REMOVAL_WORD_FORMS_UNIFY_ARG1 = makeKeyword( "REMOVAL-WORD-FORMS-UNIFY-ARG1" );
    $list73 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG1-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordForms ?WORD #$plural \"dogs\")" )
    } );
    $const74$speechPartPreds = constant_handles.reader_make_constant_shell( makeString( "speechPartPreds" ) );
    $kw75$REMOVAL_WORD_FORMS_UNIFY_ARG2 = makeKeyword( "REMOVAL-WORD-FORMS-UNIFY-ARG2" );
    $list76 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG2-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordForms #$Dog-TheWord ?PRED \"dogs\")" )
    } );
    $kw77$REMOVAL_WORD_FORMS_UNIFY_ARG3 = makeKeyword( "REMOVAL-WORD-FORMS-UNIFY-ARG3" );
    $list78 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARG3-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordForms #$Dog-TheWord #$plural ?STRING)" )
    } );
    $kw79$REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2 = makeKeyword( "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2" );
    $list80 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordForms ?WORD ?PRED \"dogs\")" )
    } );
    $kw81$REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3 = makeKeyword( "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3" );
    $list82 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "wordForms" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED" ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$wordForms #$Dog-TheWord ?PRED ?STRING)" )
    } );
    $const83$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $kw84$TRUE = makeKeyword( "TRUE" );
    $sym85$HL_VERIFY_TERM_PHRASES = makeSymbol( "HL-VERIFY-TERM-PHRASES" );
    $sym86$HL_JUSTIFY_TERM_PHRASES = makeSymbol( "HL-JUSTIFY-TERM-PHRASES" );
    $const87$termPhrases = constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) );
    $const88$termPhrases_Lexical = constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) );
    $const89$termPhrases_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) );
    $const90$termPhrases_CaseInsensitive_Lexic = constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive-Lexical" ) );
    $const91$CharacterString = constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) );
    $list92 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "EL-SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $sym93$HL_FORWARD_MT_COMBOS_TERM_PHRASES = makeSymbol( "HL-FORWARD-MT-COMBOS-TERM-PHRASES" );
    $sym94$SUPPORT_SENTENCE_OPERATOR = makeSymbol( "SUPPORT-SENTENCE-OPERATOR" );
    $sym95$HL_VERIFY_AND_JUSTIFY_TERM_PHRASES = makeSymbol( "HL-VERIFY-AND-JUSTIFY-TERM-PHRASES" );
    $kw96$TEST = makeKeyword( "TEST" );
    $sym97$SUPPORTS_HAVE_PREDS_ = makeSymbol( "SUPPORTS-HAVE-PREDS?" );
    $kw98$OWNER = makeKeyword( "OWNER" );
    $kw99$CLASSES = makeKeyword( "CLASSES" );
    $kw100$KB = makeKeyword( "KB" );
    $kw101$FULL = makeKeyword( "FULL" );
    $kw102$WORKING_ = makeKeyword( "WORKING?" );
    $list103 = _constant_103_initializer();
    $sym104$SUPPORT_P = makeSymbol( "SUPPORT-P" );
    $sym105$SPEECH_PART_PRED_ = makeSymbol( "SPEECH-PART-PRED?" );
    $const106$abbreviationForLexicalWord = constant_handles.reader_make_constant_shell( makeString( "abbreviationForLexicalWord" ) );
    $sym107$SUPPORT_SENTENCE = makeSymbol( "SUPPORT-SENTENCE" );
    $const108$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $list109 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $list110 = ConsesLow.list( makeKeyword( "OR" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), constant_handles.reader_make_constant_shell( makeString(
        "termPhrases-CaseInsensitive" ) ) );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "GAF" ), makeSymbol( "TERM" ), makeSymbol( "PREDICATE" ), makeSymbol( "INDEX-ARG" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym112$PIF = makeSymbol( "PIF" );
    $sym113$INDEXED_TERM_P = makeSymbol( "INDEXED-TERM-P" );
    $sym114$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $kw115$PREDICATE = makeKeyword( "PREDICATE" );
    $kw116$INDEX = makeKeyword( "INDEX" );
    $list117 = ConsesLow.list( makeKeyword( "TRUTH" ), makeKeyword( "TRUE" ) );
    $sym118$DO_GAF_ARG_INDEX_NAUT = makeSymbol( "DO-GAF-ARG-INDEX-NAUT" );
    $list119 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "CONSTRAINT" ), makeSymbol( "ARG3" ) );
    $kw120$TERM_PHRASES = makeKeyword( "TERM-PHRASES" );
    $sym121$GENERIC_PRED_ = makeSymbol( "GENERIC-PRED?" );
    $const122$StringIndexingSlot = constant_handles.reader_make_constant_shell( makeString( "StringIndexingSlot" ) );
    $sym123$NAME_STRING_PRED_ = makeSymbol( "NAME-STRING-PRED?" );
    $const124$ProperNameString = constant_handles.reader_make_constant_shell( makeString( "ProperNameString" ) );
    $const125$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $kw126$ALL = makeKeyword( "ALL" );
    $const127$NLWordForm = constant_handles.reader_make_constant_shell( makeString( "NLWordForm" ) );
    $const128$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const129$nonSingular_Generic = constant_handles.reader_make_constant_shell( makeString( "nonSingular-Generic" ) );
    $const130$GenericSpeechPartPredicate = constant_handles.reader_make_constant_shell( makeString( "GenericSpeechPartPredicate" ) );
    $kw131$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3 = makeKeyword( "REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG3" );
    $list132 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "termPhrases-CaseInsensitive-Lexical" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive-Lexical" ) ), makeKeyword(
            "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)" )
    } );
    $kw133$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3 = makeKeyword( "REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG3" );
    $list134 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "ANYTHING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)" )
    } );
    $kw135$REMOVAL_TERM_PHRASES_UNIFY_ARG3 = makeKeyword( "REMOVAL-TERM-PHRASES-UNIFY-ARG3" );
    $list136 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)" )
    } );
    $kw137$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3 = makeKeyword( "REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG3" );
    $list138 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions" ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)" )
    } );
    $kw139$REMOVAL_TERM_PHRASES_UNIFY_ARG1 = makeKeyword( "REMOVAL-TERM-PHRASES-UNIFY-ARG1" );
    $list140 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword(
            "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing" ), makeKeyword( "EXAMPLE" ), makeString( "(#$termPhrases ?WHAT #$singular \"emu\")" )
    } );
    $kw141$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1 = makeKeyword( "REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1" );
    $list142 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")" )
    } );
    $kw143$REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1 = makeKeyword( "REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG1" );
    $list144 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$termPhrases-Lexical ?WHAT #$singular \"emu\")" )
    } );
    $kw145$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1 = makeKeyword( "REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG1" );
    $list146 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString(
        "termPhrases-CaseInsensitive-Lexical" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive-Lexical" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ), makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
                "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword(
                    "DOCUMENTATION" ), makeString( "(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions" ), makeKeyword( "EXAMPLE" ), makeString(
                        "(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")" )
    } );
    $list147 = ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "CONSTRAINT" ), makeSymbol( "STRING" ) );
    $kw148$ON = makeKeyword( "ON" );
    $kw149$OFF = makeKeyword( "OFF" );
    $kw150$NEVER = makeKeyword( "NEVER" );
    $kw151$ONLY = makeKeyword( "ONLY" );
    $list152 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ), constant_handles.reader_make_constant_shell( makeString(
        "termPhrases-CaseInsensitive-Lexical" ) ) );
    $list153 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-Lexical" ) ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive-Lexical" ) ) );
    $kw154$REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2 = makeKeyword( "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2" );
    $list155 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "STRING" ) ),
      makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")" )
    } );
    $kw156$REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2 = makeKeyword( "REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1-AND-ARG2" );
    $list157 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "termPhrases-CaseInsensitive" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ),
          makeKeyword( "STRING" ) ), makeKeyword( "REQUIRED" ), makeSymbol( "REMOVAL-TERM-PHRASES-REQUIRED" ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TERM-PHRASES-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions" ), makeKeyword( "EXAMPLE" ), makeString( "(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")" )
    } );
    $list158 = ConsesLow.list( makeSymbol( "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "STRING" ) );
    $list159 = ConsesLow.list( makeSymbol( "DENOT" ), makeSymbol( "PRED" ) );
    $const160$TermPhrasesConstraint = constant_handles.reader_make_constant_shell( makeString( "TermPhrasesConstraint" ) );
    $const161$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw162$BREADTH = makeKeyword( "BREADTH" );
    $const163$wordForms = constant_handles.reader_make_constant_shell( makeString( "wordForms" ) );
    $list164 = ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "ARG1" ), makeSymbol( "STRING" ) );
    $list165 = ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "NAME-PRED" ) );
    $list166 = ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DENOT" ) );
    $sym167$NAME_PRED = makeSymbol( "NAME-PRED" );
    $sym168$DENOT = makeSymbol( "DENOT" );
    $kw169$GENLPREDS = makeKeyword( "GENLPREDS" );
    $sym170$REMOVAL_LEXICON_NAMESTRING_EXPAND = makeSymbol( "REMOVAL-LEXICON-NAMESTRING-EXPAND" );
    $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ = makeSymbol( "REMOVAL-LEXICON-NAMESTRING-COMPLETE?" );
    $kw172$TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword( "TERM-STRINGS-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG" );
    $list173 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell(
        makeString( "termStrings" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw174$TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND = makeKeyword( "TERM-PHRASES-STRONGLY-PREFER-AT-LEAST-TERM-OR-STRING-FULLY-BOUND" );
    $list175 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "GENL-PRED" ), constant_handles.reader_make_constant_shell(
        makeString( "termPhrases" ) ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw176$REMOVAL_LEXICON_NAMESTRING = makeKeyword( "REMOVAL-LEXICON-NAMESTRING" );
    $list177 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
        "NL-TRIE-NAME-STRING-PRED?" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "STRINGP" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
            "*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*" ), makeKeyword( "COMPLETE-PATTERN" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "REMOVAL-LEXICON-NAMESTRING-COMPLETE?" ) ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-LEXICON-NAMESTRING-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon." ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$nameString ?WHO \"Cher\")" )
    } );
  }

  public static final class $removal_word_strings_iterator_state_native
      extends
        SubLStructNative
  {
    public SubLObject $speech_part_predicate;
    public SubLObject $arg1;
    public SubLObject $arg2;
    public SubLObject $trie_iterator;
    public SubLObject $entry_iterator;
    private static final SubLStructDeclNative structDecl;

    public $removal_word_strings_iterator_state_native()
    {
      this.$speech_part_predicate = CommonSymbols.NIL;
      this.$arg1 = CommonSymbols.NIL;
      this.$arg2 = CommonSymbols.NIL;
      this.$trie_iterator = CommonSymbols.NIL;
      this.$entry_iterator = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $removal_word_strings_iterator_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$speech_part_predicate;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$arg1;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$arg2;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$trie_iterator;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$entry_iterator;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$speech_part_predicate = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$arg1 = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$arg2 = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$trie_iterator = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$entry_iterator = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $removal_word_strings_iterator_state_native.class, $sym31$REMOVAL_WORD_STRINGS_ITERATOR_STATE, $sym32$REMOVAL_WORD_STRINGS_ITERATOR_STATE_P, $list33, $list34,
          new String[]
          { "$speech_part_predicate", "$arg1", "$arg2", "$trie_iterator", "$entry_iterator"
          }, $list35, $list36, $sym37$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $removal_word_strings_iterator_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $removal_word_strings_iterator_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return removal_word_strings_iterator_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 3448 ms
 * 
 */