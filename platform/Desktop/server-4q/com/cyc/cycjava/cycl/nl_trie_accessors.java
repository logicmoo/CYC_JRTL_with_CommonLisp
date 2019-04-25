package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_trie_accessors
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_trie_accessors";
  public static final String myFingerPrint = "da4eb28e4277e9a83a08566126bd704d534c971190329ae2aff7a21aad1962c3";
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26000L)
  public static SubLSymbol $word_external_punctuation_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26335L)
  public static SubLSymbol $denotation_mapping_break_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67108L)
  private static SubLSymbol $nl_trie_check_semantic_mtP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 75514L)
  private static SubLSymbol $nl_trie_rotation_index$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 75902L)
  private static SubLSymbol $nl_trie_rotate_characters$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76043L)
  private static SubLSymbol $nl_trie_rotate_point_char$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76195L)
  private static SubLSymbol $nl_trie_rotate_point_string$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76348L)
  private static SubLSymbol $nl_trie_stoplist_trie$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLSymbol $dtp_nl_trie_index_item$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86760L)
  public static SubLSymbol $default_number_of_concurrent_test_threads$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86831L)
  public static SubLSymbol $default_string_test_count$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$STRING;
  private static final SubLSymbol $kw4$DONE;
  private static final SubLSymbol $sym5$KEY;
  private static final SubLSymbol $sym6$ENTRIES;
  private static final SubLSymbol $sym7$DO_NL_TRIE;
  private static final SubLSymbol $sym8$CSOME;
  private static final SubLSymbol $sym9$CSETQ;
  private static final SubLSymbol $sym10$NL_TRIE_ENTRY_STRING;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $kw13$ENTRY_TYPE;
  private static final SubLSymbol $kw14$ANY;
  private static final SubLSymbol $kw15$CHECK_PERIOD_;
  private static final SubLSymbol $kw16$MISSPELLINGS_;
  private static final SubLSymbol $sym17$_MISSPELLINGS__;
  private static final SubLSymbol $kw18$CASE_SENSITIVITY;
  private static final SubLSymbol $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
  private static final SubLSymbol $kw20$CHECK_SEMANTIC_MT_;
  private static final SubLSymbol $sym21$ENTRIES;
  private static final SubLSymbol $sym22$CLET;
  private static final SubLSymbol $sym23$_LEXICON_LOOKUP_MT_;
  private static final SubLSymbol $sym24$GATED_NL_TRIE_SEARCH;
  private static final SubLSymbol $sym25$CDOLIST;
  private static final SubLSymbol $sym26$PWHEN;
  private static final SubLSymbol $sym27$CAND;
  private static final SubLSymbol $sym28$COR;
  private static final SubLSymbol $sym29$NL_TRIE_ENTRY_TYPE;
  private static final SubLSymbol $sym30$FIMPLIES;
  private static final SubLSymbol $sym31$PERIOD_CONST_SATISFIED_;
  private static final SubLSymbol $sym32$CONTAINS_PERIOD_;
  private static final SubLSymbol $sym33$SPELLING_CONST_SATISFIED_;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING;
  private static final SubLSymbol $kw37$WORD;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$NAME;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$SKIP_CONSTRAINTS_;
  private static final SubLSymbol $kw44$ABBREV_TYPES;
  private static final SubLSymbol $kw45$DENOT_TYPE;
  private static final SubLSymbol $kw46$DENOT;
  private static final SubLSymbol $kw47$SKIP_NAMESTRINGS_;
  private static final SubLSymbol $sym48$CMULTIPLE_VALUE_SETQ;
  private static final SubLSymbol $sym49$ADD_NEW_ENTRY;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$ADD_NEW_DENOTS_AND_PREDS;
  private static final SubLSymbol $sym52$NL_TRIE_STRING_IS_POS_;
  private static final SubLInteger $int53$4096;
  private static final SubLObject $const54$partOfSpeech;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$GREEDY;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$GENL_POS_PRED_;
  private static final SubLSymbol $sym59$STRINGP;
  private static final SubLString $str60$the_;
  private static final SubLObject $const61$acronymString;
  private static final SubLObject $const62$InferencePSC;
  private static final SubLSymbol $kw63$SEMTRANS_TEMPLATE;
  private static final SubLObject $const64$nameSpelling;
  private static final SubLObject $const65$commonNickname;
  private static final SubLSymbol $sym66$SPEECH_PART_PRED_;
  private static final SubLSymbol $sym67$SPEC_POS_PRED_;
  private static final SubLSymbol $sym68$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const69$EverythingPSC;
  private static final SubLSymbol $sym70$RELEVANT_MT_IS_ANY_MT;
  private static final SubLSymbol $sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
  private static final SubLSymbol $sym72$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw73$ACRONYMS;
  private static final SubLSymbol $kw74$ABBREVS;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$INTERVAL;
  private static final SubLSymbol $kw77$OFF;
  private static final SubLSymbol $kw78$ON;
  private static final SubLSymbol $sym79$_;
  private static final SubLSymbol $sym80$INTERVAL_TOKEN_LENGTH;
  private static final SubLSymbol $sym81$_;
  private static final SubLSymbol $sym82$INTERVAL_TOKEN_START;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$NL_TRIE_P;
  private static final SubLList $list85;
  private static final SubLString $str86$Invalid_case_sensitivity_value_fo;
  private static final SubLSymbol $sym87$NL_TRIE_PREFIXES_MEMOIZED;
  private static final SubLInteger $int88$512;
  private static final SubLObject $const89$titleOfWork;
  private static final SubLSymbol $sym90$INDEX_COVERED_BY_TOKEN_P;
  private static final SubLObject $const91$CommonEnglishMisspellingsMt;
  private static final SubLList $list92;
  private static final SubLSymbol $kw93$PREFERRED;
  private static final SubLSymbol $kw94$ABORTED;
  private static final SubLSymbol $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_;
  private static final SubLSymbol $sym96$PRAGMATICALLY_ACCEPTABLE_;
  private static final SubLSymbol $sym97$FIRST;
  private static final SubLList $list98;
  private static final SubLString $str99$Found_non_matching_string___S_vs_;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$ASENT;
  private static final SubLSymbol $sym103$MT;
  private static final SubLSymbol $sym104$SUPPORT_SENTENCE;
  private static final SubLSymbol $sym105$SUPPORT_MT;
  private static final SubLSymbol $sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING;
  private static final SubLSymbol $sym107$ATOMIC_SENTENCE_ARG2;
  private static final SubLSymbol $sym108$CNOT;
  private static final SubLSymbol $sym109$MATCHING_WORD_STRINGS_ENTRY_;
  private static final SubLSymbol $sym110$DO_SUPPORTING_TRIE_WORDS;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$EQUALS_EL_;
  private static final SubLList $list114;
  private static final SubLObject $const115$NounPhrase;
  private static final SubLObject $const116$ProperNameString;
  private static final SubLObject $const117$NLPhrase;
  private static final SubLObject $const118$phrase_Bar1;
  private static final SubLString $str119$Don_t_know_how_to_check__S_agains;
  private static final SubLSymbol $sym120$_NL_TRIE_ROTATION_INDEX_;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$_NL_TRIE_STOPLIST_TRIE_;
  private static final SubLString $str123$tried_to_determine_rotations_for_;
  private static final SubLSymbol $sym124$NL_TRIE_INDEX_ITEM;
  private static final SubLSymbol $sym125$NL_TRIE_INDEX_ITEM_P;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$PRINT_NL_TRIE_INDEX_ITEM;
  private static final SubLSymbol $sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$NL_TRIE_INDEX_ITEM_TERM;
  private static final SubLSymbol $sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM;
  private static final SubLSymbol $sym135$NL_TRIE_INDEX_ITEM_PHRASE;
  private static final SubLSymbol $sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE;
  private static final SubLSymbol $sym137$NL_TRIE_INDEX_ITEM_MT;
  private static final SubLSymbol $sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT;
  private static final SubLSymbol $kw139$TERM;
  private static final SubLSymbol $kw140$PHRASE;
  private static final SubLSymbol $kw141$MT;
  private static final SubLString $str142$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw143$BEGIN;
  private static final SubLSymbol $sym144$MAKE_NL_TRIE_INDEX_ITEM;
  private static final SubLSymbol $kw145$SLOT;
  private static final SubLSymbol $kw146$END;
  private static final SubLSymbol $sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD;
  private static final SubLString $str148$_NL_TRIE_INDEX_ITEM__s__s__a_;
  private static final SubLSymbol $kw149$DENOTS;
  private static final SubLString $str150$nl_trie_rotation_stop_list;
  private static final SubLString $str151$nl_trie_rotation_index;
  private static final SubLString $str152$Creating_NL_trie_rotation_index__;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$TRIE_REMOVE;
  private static final SubLSymbol $sym156$TRIE_INSERT;
  private static final SubLSymbol $kw157$INFIX;
  private static final SubLSymbol $kw158$PREFIX;
  private static final SubLSymbol $sym159$STARTS_WITH;
  private static final SubLSymbol $kw160$SUFFIX;
  private static final SubLSymbol $sym161$ENDS_WITH;
  private static final SubLSymbol $sym162$STRING_;
  private static final SubLSymbol $sym163$LESSER_LENGTH_P;
  private static final SubLString $str164$The_NL_Trie_must_be_initialized_b;
  private static final SubLString $str165$Dumping_NL_Trie_spellchecker_stri;
  private static final SubLInteger $int166$500;
  private static final SubLString $str167$Concurrent_NL_Trie_Search_Stress_;
  private static final SubLObject $const168$nameString;
  private static final SubLSymbol $kw169$GAF;
  private static final SubLString $str170$Concurrent_NL_Trie_Searches_;
  private static final SubLSymbol $sym171$STRESS_TEST_NL_TRIE_SEARCH;
  private static final SubLSymbol $sym172$VALID_PROCESS_P;
  private static final SubLSymbol $sym173$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str174$Concurrent_NL_Trie_Prefixes_Stres;
  private static final SubLString $str175$Concurrent_NL_Trie_Prefixes_;
  private static final SubLSymbol $sym176$STRESS_TEST_NL_TRIE_PREFIXES;

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 5326L)
  public static SubLObject do_nl_trie_entries(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    entry = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject string_tail = cdestructuring_bind.property_list_member( $kw3$STRING, current );
    final SubLObject string = ( NIL != string_tail ) ? conses_high.cadr( string_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject key = $sym5$KEY;
    final SubLObject entries = $sym6$ENTRIES;
    if( NIL != string )
    {
      return ConsesLow.list( $sym7$DO_NL_TRIE, ConsesLow.list( key, entries, $kw4$DONE, done ), ConsesLow.listS( $sym8$CSOME, ConsesLow.list( entry, entries, done ), ConsesLow.list( $sym9$CSETQ, string, ConsesLow.list(
          $sym10$NL_TRIE_ENTRY_STRING, entry ) ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.list( $sym7$DO_NL_TRIE, ConsesLow.list( key, entries, $kw4$DONE, done ), ConsesLow.listS( $sym8$CSOME, ConsesLow.list( entry, entries, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 6169L)
  public static SubLObject do_nl_trie_entries_for_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject entry_var = NIL;
    SubLObject string = NIL;
    SubLObject lookup_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    entry_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    lookup_mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list11 );
      if( NIL == conses_high.member( current_$2, $list12, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    }
    final SubLObject entry_type_tail = cdestructuring_bind.property_list_member( $kw13$ENTRY_TYPE, current );
    final SubLObject entry_type = ( NIL != entry_type_tail ) ? conses_high.cadr( entry_type_tail ) : $kw14$ANY;
    final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member( $kw15$CHECK_PERIOD_, current );
    final SubLObject check_periodP = ( NIL != check_periodP_tail ) ? conses_high.cadr( check_periodP_tail ) : T;
    final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member( $kw16$MISSPELLINGS_, current );
    final SubLObject misspellingsP = ( NIL != misspellingsP_tail ) ? conses_high.cadr( misspellingsP_tail ) : $sym17$_MISSPELLINGS__;
    final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member( $kw18$CASE_SENSITIVITY, current );
    final SubLObject case_sensitivity = ( NIL != case_sensitivity_tail ) ? conses_high.cadr( case_sensitivity_tail ) : $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
    final SubLObject check_semantic_mtP_tail = cdestructuring_bind.property_list_member( $kw20$CHECK_SEMANTIC_MT_, current );
    final SubLObject check_semantic_mtP = ( NIL != check_semantic_mtP_tail ) ? conses_high.cadr( check_semantic_mtP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject entries = $sym21$ENTRIES;
    return ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( $sym23$_LEXICON_LOOKUP_MT_, lookup_mt ), ConsesLow.list( entries, ConsesLow.list( $sym24$GATED_NL_TRIE_SEARCH, string, case_sensitivity,
        check_semantic_mtP ) ) ), ConsesLow.list( $sym25$CDOLIST, ConsesLow.list( entry_var, entries ), ConsesLow.listS( $sym26$PWHEN, ConsesLow.list( $sym27$CAND, ConsesLow.list( $sym28$COR, ConsesLow.list( EQ,
            $kw14$ANY, entry_type ), ConsesLow.list( EQ, ConsesLow.list( $sym29$NL_TRIE_ENTRY_TYPE, entry_var ), entry_type ) ), ConsesLow.list( $sym30$FIMPLIES, check_periodP, ConsesLow.list(
                $sym31$PERIOD_CONST_SATISFIED_, ConsesLow.list( $sym32$CONTAINS_PERIOD_, string ), entry_var, string ) ), ConsesLow.list( $sym33$SPELLING_CONST_SATISFIED_, misspellingsP, entry_var ) ), ConsesLow.append(
                    body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 7204L)
  public static SubLObject do_nl_trie_word_entries_for_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject entry_var = NIL;
    SubLObject string = NIL;
    SubLObject lookup_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    entry_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    lookup_mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      if( NIL == conses_high.member( current_$3, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    }
    final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member( $kw15$CHECK_PERIOD_, current );
    final SubLObject check_periodP = ( NIL != check_periodP_tail ) ? conses_high.cadr( check_periodP_tail ) : T;
    final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member( $kw16$MISSPELLINGS_, current );
    final SubLObject misspellingsP = ( NIL != misspellingsP_tail ) ? conses_high.cadr( misspellingsP_tail ) : $sym17$_MISSPELLINGS__;
    final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member( $kw18$CASE_SENSITIVITY, current );
    final SubLObject case_sensitivity = ( NIL != case_sensitivity_tail ) ? conses_high.cadr( case_sensitivity_tail ) : $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
    final SubLObject check_semantic_mtP_tail = cdestructuring_bind.property_list_member( $kw20$CHECK_SEMANTIC_MT_, current );
    final SubLObject check_semantic_mtP = ( NIL != check_semantic_mtP_tail ) ? conses_high.cadr( check_semantic_mtP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING, ConsesLow.list( new SubLObject[] { entry_var, string, lookup_mt, $kw13$ENTRY_TYPE, $kw37$WORD, $kw16$MISSPELLINGS_, misspellingsP, $kw15$CHECK_PERIOD_,
      check_periodP, $kw18$CASE_SENSITIVITY, case_sensitivity, $kw20$CHECK_SEMANTIC_MT_, check_semantic_mtP
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 7819L)
  public static SubLObject do_nl_trie_name_entries_for_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject entry_var = NIL;
    SubLObject string = NIL;
    SubLObject lookup_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    entry_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    lookup_mt = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$4, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject check_periodP_tail = cdestructuring_bind.property_list_member( $kw15$CHECK_PERIOD_, current );
    final SubLObject check_periodP = ( NIL != check_periodP_tail ) ? conses_high.cadr( check_periodP_tail ) : NIL;
    final SubLObject misspellingsP_tail = cdestructuring_bind.property_list_member( $kw16$MISSPELLINGS_, current );
    final SubLObject misspellingsP = ( NIL != misspellingsP_tail ) ? conses_high.cadr( misspellingsP_tail ) : $sym17$_MISSPELLINGS__;
    final SubLObject case_sensitivity_tail = cdestructuring_bind.property_list_member( $kw18$CASE_SENSITIVITY, current );
    final SubLObject case_sensitivity = ( NIL != case_sensitivity_tail ) ? conses_high.cadr( case_sensitivity_tail ) : $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING, ConsesLow.list( new SubLObject[] { entry_var, string, lookup_mt, $kw13$ENTRY_TYPE, $kw40$NAME, $kw16$MISSPELLINGS_, misspellingsP, $kw15$CHECK_PERIOD_,
      check_periodP, $kw18$CASE_SENSITIVITY, case_sensitivity
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8282L)
  public static SubLObject incorporate_new_entry(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject new_entry = NIL;
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    new_entry = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    denot_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list41 );
    pred_list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list41 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list41 );
      if( NIL == conses_high.member( current_$5, $list42, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list41 );
    }
    final SubLObject skip_constraintsP_tail = cdestructuring_bind.property_list_member( $kw43$SKIP_CONSTRAINTS_, current );
    final SubLObject skip_constraintsP = ( NIL != skip_constraintsP_tail ) ? conses_high.cadr( skip_constraintsP_tail ) : NIL;
    final SubLObject abbrev_types_tail = cdestructuring_bind.property_list_member( $kw44$ABBREV_TYPES, current );
    final SubLObject abbrev_types = ( NIL != abbrev_types_tail ) ? conses_high.cadr( abbrev_types_tail ) : NIL;
    final SubLObject denot_type_tail = cdestructuring_bind.property_list_member( $kw45$DENOT_TYPE, current );
    final SubLObject denot_type = ( NIL != denot_type_tail ) ? conses_high.cadr( denot_type_tail ) : $kw46$DENOT;
    final SubLObject skip_namestringsP_tail = cdestructuring_bind.property_list_member( $kw47$SKIP_NAMESTRINGS_, current );
    final SubLObject skip_namestringsP = ( NIL != skip_namestringsP_tail ) ? conses_high.cadr( skip_namestringsP_tail ) : NIL;
    return ConsesLow.list( $sym48$CMULTIPLE_VALUE_SETQ, ConsesLow.list( denot_list, pred_list ), ConsesLow.list( $sym49$ADD_NEW_ENTRY, new_entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type,
        skip_namestringsP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8682L)
  public static SubLObject incorporate_new_denots_and_preds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject new_denots = NIL;
    SubLObject denot_list = NIL;
    SubLObject new_preds = NIL;
    SubLObject pred_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    new_denots = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    denot_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    new_preds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    pred_list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym48$CMULTIPLE_VALUE_SETQ, ConsesLow.list( denot_list, pred_list ), ConsesLow.list( $sym51$ADD_NEW_DENOTS_AND_PREDS, new_denots, denot_list, new_preds, pred_list ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8975L)
  public static SubLObject nl_trie_string_is_posP_internal(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject foundP = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      final SubLObject entries = gated_nl_trie_search( string, UNPROVIDED, UNPROVIDED );
      final SubLObject input_contains_periodP = contains_periodP( string );
      if( NIL == foundP )
      {
        SubLObject csome_list_var = entries;
        SubLObject entry = NIL;
        entry = csome_list_var.first();
        while ( NIL == foundP && NIL != csome_list_var)
        {
          if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != period_const_satisfiedP( input_contains_periodP, entry, string ) && NIL != lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( entry ), pos,
              UNPROVIDED ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) )
          {
            foundP = T;
          }
          csome_list_var = csome_list_var.rest();
          entry = csome_list_var.first();
        }
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 8975L)
  public static SubLObject nl_trie_string_is_posP(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return nl_trie_string_is_posP_internal( string, pos, misspellingsP, lookup_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym52$NL_TRIE_STRING_IS_POS_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym52$NL_TRIE_STRING_IS_POS_, FOUR_INTEGER, $int53$4096, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym52$NL_TRIE_STRING_IS_POS_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( string, pos, misspellingsP, lookup_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( string.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( pos.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( misspellingsP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && lookup_mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( nl_trie_string_is_posP_internal( string, pos, misspellingsP, lookup_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( string, pos, misspellingsP, lookup_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 9875L)
  public static SubLObject nl_trie_words_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word_units = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED ) && NIL != nl_trie.nl_trie_word_head_onlyP( entry ) )
        {
          final SubLObject var = nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED );
          if( NIL != var )
          {
            final SubLObject item_var = var;
            if( NIL == conses_high.member( item_var, word_units, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              word_units = ConsesLow.cons( item_var, word_units );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return word_units;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 11071L)
  public static SubLObject nl_trie_words_of_stringXpred(final SubLObject string, final SubLObject pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word_units = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != pos_pred_const_satisfiedP( pred, nl_trie.nl_trie_word_pos_preds( entry ) ) && NIL != nl_trie.nl_trie_word_head_onlyP( entry ) )
        {
          final SubLObject var = nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED );
          if( NIL != var )
          {
            final SubLObject item_var = var;
            if( NIL == conses_high.member( item_var, word_units, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              word_units = ConsesLow.cons( item_var, word_units );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return word_units;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 12295L)
  public static SubLObject nl_trie_words_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_list = lexicon_accessors.pos_for_keyword( pos_keyword, UNPROVIDED );
    SubLObject word_units = NIL;
    SubLObject pos_preds = NIL;
    SubLObject lex_preds = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) )
        {
          final SubLObject wu = nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED );
          if( NIL != wu && NIL != lexicon_accessors.genl_pos_memberP( nl_trie.nl_trie_word_pos( entry ), pos_list ) && NIL != nl_trie.nl_trie_word_head_onlyP( entry ) )
          {
            final SubLObject new_lex_pred = nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
            final SubLObject new_word_unit = wu;
            SubLObject cdolist_list_var_$6 = nl_trie.nl_trie_word_pos_preds( entry );
            SubLObject new_pos_pred = NIL;
            new_pos_pred = cdolist_list_var_$6.first();
            while ( NIL != cdolist_list_var_$6)
            {
              SubLObject foundP = NIL;
              if( NIL == foundP )
              {
                SubLObject word_unit;
                SubLObject word_unit_$7;
                SubLObject lex_pred;
                SubLObject lex_pred_$8;
                SubLObject pos_pred;
                SubLObject pos_pred_$9;
                for( word_unit = NIL, word_unit_$7 = NIL, lex_pred = NIL, lex_pred_$8 = NIL, pos_pred = NIL, pos_pred_$9 = NIL, word_unit = word_units, word_unit_$7 = word_unit
                    .first(), lex_pred = lex_preds, lex_pred_$8 = lex_pred.first(), pos_pred = pos_preds, pos_pred_$9 = pos_pred.first(); NIL == foundP && ( NIL != pos_pred || NIL != lex_pred
                        || NIL != word_unit ); foundP = makeBoolean( new_word_unit.equal( word_unit_$7 ) && new_lex_pred.equal( lex_pred_$8 ) && new_pos_pred.equal( pos_pred_$9 ) ), word_unit = word_unit
                            .rest(), word_unit_$7 = word_unit.first(), lex_pred = lex_pred.rest(), lex_pred_$8 = lex_pred.first(), pos_pred = pos_pred.rest(), pos_pred_$9 = pos_pred.first() )
                {
                }
              }
              if( NIL == foundP )
              {
                word_units = ConsesLow.cons( wu, word_units );
                lex_preds = ConsesLow.cons( new_lex_pred, lex_preds );
                pos_preds = ConsesLow.cons( new_pos_pred.eql( $const54$partOfSpeech ) ? nl_trie.nl_trie_word_pos( entry ) : new_pos_pred, pos_preds );
              }
              cdolist_list_var_$6 = cdolist_list_var_$6.rest();
              new_pos_pred = cdolist_list_var_$6.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( word_units, pos_preds, lex_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 14458L)
  public static SubLObject nl_trie_words_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word_units = NIL;
    SubLObject pos_preds = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) )
        {
          final SubLObject wu = nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED );
          if( NIL != wu && NIL != lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( entry ), pos, UNPROVIDED ) && NIL != nl_trie.nl_trie_word_head_onlyP( entry ) )
          {
            final SubLObject new_pos_preds = nl_trie.nl_trie_word_pos_preds( entry );
            final SubLObject new_word_units = ConsesLow.make_list( conses_high.list_length( new_pos_preds ), wu );
            word_units = ConsesLow.append( new_word_units, word_units );
            pos_preds = ConsesLow.append( Sequences.substitute( nl_trie.nl_trie_word_pos( entry ), $const54$partOfSpeech, new_pos_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ),
                pos_preds );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject found_words = NIL;
    SubLObject output_words = NIL;
    SubLObject output_preds = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject word;
    SubLObject pos_pred;
    for( cdotimes_end_var = Sequences.length( word_units ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      word = ConsesLow.nth( i, word_units );
      pos_pred = ConsesLow.nth( i, pos_preds );
      if( !list_utilities.alist_lookup( found_words, word, UNPROVIDED, UNPROVIDED ).eql( pos_pred ) )
      {
        output_words = ConsesLow.cons( word, output_words );
        output_preds = ConsesLow.cons( pos_pred, output_preds );
        found_words = list_utilities.alist_enter( found_words, word, pos_pred, UNPROVIDED );
      }
    }
    return Values.values( output_words, output_preds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 16527L)
  public static SubLObject nl_trie_preds_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pos_preds = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED ).equal( word ) )
        {
          pos_preds = conses_high.union( nl_trie.nl_trie_word_pos_preds( entry ), pos_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return pos_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 17598L)
  public static SubLObject nl_trie_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pos_preds = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) )
        {
          pos_preds = conses_high.union( nl_trie.nl_trie_word_pos_preds( entry ), pos_preds, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return pos_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 18514L)
  public static SubLObject nl_trie_namestring_preds_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject name_preds = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw40$NAME || nl_trie.nl_trie_entry_type( entry ) == $kw40$NAME ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) )
        {
          final SubLObject item_var = nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
          if( NIL == conses_high.member( item_var, name_preds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            name_preds = ConsesLow.cons( item_var, name_preds );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return name_preds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 19420L)
  public static SubLObject nl_trie_pos_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pos_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) )
        {
          final SubLObject item_var = nl_trie.nl_trie_word_pos( entry );
          if( NIL == conses_high.member( item_var, pos_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            pos_list = ConsesLow.cons( item_var, pos_list );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.delete( NIL, pos_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 20323L)
  public static SubLObject nl_trie_pos_of_stringXword(final SubLObject string, final SubLObject word, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject pos_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && nl_trie.nl_trie_word_word_unit( entry, UNPROVIDED ).equal( word ) )
        {
          final SubLObject item_var = nl_trie.nl_trie_word_pos( entry );
          if( NIL == conses_high.member( item_var, pos_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            pos_list = ConsesLow.cons( item_var, pos_list );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return pos_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 21358L)
  public static SubLObject nl_trie_all_denots_of_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject abbrev_types = NIL;
    final SubLObject denot_type = $kw46$DENOT;
    final SubLObject skip_namestringsP = NIL;
    return general_nl_trie_denots_of_string( string, misspellingsP, lookup_mt, T, abbrev_types, denot_type, skip_namestringsP, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 22568L)
  public static SubLObject nl_trie_denots_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject skip_namestringsP, SubLObject lookup_mt,
      SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    return general_nl_trie_denots_of_string( string, misspellingsP, lookup_mt, NIL, abbrev_types, denot_type, skip_namestringsP, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 23956L)
  public static SubLObject general_nl_trie_denots_of_string(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, SubLObject skip_constraintsP, SubLObject abbrev_types,
      SubLObject denot_type, SubLObject skip_namestringsP, SubLObject case_sensitivity)
  {
    if( skip_constraintsP == UNPROVIDED )
    {
      skip_constraintsP = NIL;
    }
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject starts_with_theP = starts_with_theP( string );
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      thread.resetMultipleValues();
      final SubLObject denot_list_$10 = general_nl_trie_denots_of_string_int( string, misspellingsP, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP, starts_with_theP, case_sensitivity );
      final SubLObject pred_list_$11 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      denot_list = denot_list_$10;
      pred_list = pred_list_$11;
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 24675L)
  public static SubLObject general_nl_trie_denots_of_string_int(final SubLObject string, final SubLObject misspellingsP, final SubLObject skip_constraintsP, final SubLObject abbrev_types, final SubLObject denot_type,
      final SubLObject skip_namestringsP, final SubLObject starts_with_theP, final SubLObject case_sensitivity)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject precise_with_theP = NIL;
    final SubLObject input_contains_periodP = contains_periodP( string );
    final SubLObject entry_type = ( NIL != skip_namestringsP ) ? $kw37$WORD : $kw14$ANY;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == entry_type || nl_trie.nl_trie_entry_type( entry ).eql( entry_type ) ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) )
        {
          SubLObject okP = NIL;
          if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
          {
            okP = makeBoolean( NIL != period_const_satisfiedP( input_contains_periodP, entry, string ) && NIL != lexicon_accessors.genl_lexicon_mtP( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), nl_trie
                .nl_trie_word_semantics_mt( entry ) ) );
          }
          else if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) )
          {
            okP = makeBoolean( NIL == skip_namestringsP && ( NIL == precise_with_theP || starts_with_theP.eql( starts_with_theP( nl_trie.nl_trie_entry_string( entry ) ) ) ) );
          }
          if( NIL != okP )
          {
            thread.resetMultipleValues();
            final SubLObject denot_list_$12 = add_new_entry( entry, denot_list, pred_list, skip_constraintsP, abbrev_types, denot_type, skip_namestringsP );
            final SubLObject pred_list_$13 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$12;
            pred_list = pred_list_$13;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 26460L)
  public static SubLObject nl_trie_denotation_mapper(final SubLObject string, SubLObject excluded_preds, SubLObject mode, SubLObject parse_morphologically)
  {
    if( excluded_preds == UNPROVIDED )
    {
      excluded_preds = NIL;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw56$GREEDY;
    }
    if( parse_morphologically == UNPROVIDED )
    {
      parse_morphologically = lexicon_vars.$parse_morphologically$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject tokens = string_utilities.string_tokenize( string, $denotation_mapping_break_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject tokenizations = NIL;
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
      try
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
        tokenizations = lexicon_utilities.sentence_tokenize( tokens, nl_trie.get_nl_trie(), $kw3$STRING, mode, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      }
    }
    SubLObject cdolist_list_var = tokenizations;
    SubLObject tokenization = NIL;
    tokenization = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$14 = tokenization;
      SubLObject token = NIL;
      token = cdolist_list_var_$14.first();
      while ( NIL != cdolist_list_var_$14)
      {
        final SubLObject token_string = standard_tokenization.string_token_string( token );
        SubLObject mapping_foundP = NIL;
        if( NIL == lexicon_accessors.skip_to_morphological_parsingP( parse_morphologically ) )
        {
          SubLObject cdolist_list_var_$15 = standard_tokenization.string_token_value( token );
          SubLObject trie_entry = NIL;
          trie_entry = cdolist_list_var_$15.first();
          while ( NIL != cdolist_list_var_$15)
          {
            if( NIL != pred_type_okP( nl_trie.nl_trie_entry_semantic_pred( trie_entry, UNPROVIDED ), $list57, $kw46$DENOT, NIL ) && NIL == subl_promotions.memberP( nl_trie.nl_trie_entry_semantic_pred( trie_entry,
                UNPROVIDED ), excluded_preds, $sym58$GENL_POS_PRED_, UNPROVIDED ) )
            {
              SubLObject cdolist_list_var_$16 = nl_trie.nl_trie_entry_denots( trie_entry );
              SubLObject denot = NIL;
              denot = cdolist_list_var_$16.first();
              while ( NIL != cdolist_list_var_$16)
              {
                final SubLObject item_var = standard_tokenization.new_string_token( token_string, denot );
                if( NIL == conses_high.member( item_var, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
                {
                  result = ConsesLow.cons( item_var, result );
                }
                mapping_foundP = T;
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                denot = cdolist_list_var_$16.first();
              }
            }
            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
            trie_entry = cdolist_list_var_$15.first();
          }
        }
        if( NIL != lexicon_accessors.proceed_with_morphological_parsingP( mapping_foundP, parse_morphologically ) )
        {
          thread.resetMultipleValues();
          final SubLObject morph_denots = morphological_word_parser.denots_of_complex_word_string( token_string, UNPROVIDED );
          final SubLObject morph_predicate_lists = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject morph_denot = NIL;
          SubLObject morph_denot_$17 = NIL;
          SubLObject morph_predicate_list = NIL;
          SubLObject morph_predicate_list_$18 = NIL;
          morph_denot = morph_denots;
          morph_denot_$17 = morph_denot.first();
          morph_predicate_list = morph_predicate_lists;
          morph_predicate_list_$18 = morph_predicate_list.first();
          while ( NIL != morph_predicate_list || NIL != morph_denot)
          {
            SubLObject includedP = NIL;
            if( NIL == includedP )
            {
              SubLObject csome_list_var = morph_predicate_list_$18;
              SubLObject pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == includedP && NIL != csome_list_var)
              {
                if( NIL == subl_promotions.memberP( pred, excluded_preds, $sym58$GENL_POS_PRED_, UNPROVIDED ) )
                {
                  final SubLObject item_var2 = standard_tokenization.new_string_token( token_string, morph_denot_$17 );
                  if( NIL == conses_high.member( item_var2, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var2, result );
                  }
                  mapping_foundP = T;
                  includedP = T;
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
            morph_denot = morph_denot.rest();
            morph_denot_$17 = morph_denot.first();
            morph_predicate_list = morph_predicate_list.rest();
            morph_predicate_list_$18 = morph_predicate_list.first();
          }
        }
        if( NIL == mapping_foundP )
        {
          final SubLObject item_var3 = standard_tokenization.new_string_token( token_string, NIL );
          if( NIL == conses_high.member( item_var3, result, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var3, result );
          }
        }
        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
        token = cdolist_list_var_$14.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      tokenization = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 28712L)
  public static SubLObject nl_trie_denots_of_stringXpos(final SubLObject string, final SubLObject pos_keyword, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos_list = lexicon_accessors.pos_for_keyword( pos_keyword, UNPROVIDED );
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != lexicon_accessors.genl_pos_memberP( nl_trie.nl_trie_word_pos( entry ), pos_list ) )
        {
          thread.resetMultipleValues();
          final SubLObject denot_list_$19 = add_new_entry( entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL );
          final SubLObject pred_list_$20 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denot_list = denot_list_$19;
          pred_list = pred_list_$20;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 30537L)
  public static SubLObject nl_trie_dps_of_string(final SubLObject string, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject skip_namestringsP,
      SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject dp_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != pred_type_okP( nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED ), abbrev_types, denot_type, skip_namestringsP ) )
        {
          SubLObject cdolist_list_var_$21 = nl_trie.nl_trie_entry_denots( entry );
          SubLObject denot = NIL;
          denot = cdolist_list_var_$21.first();
          while ( NIL != cdolist_list_var_$21)
          {
            SubLObject cdolist_list_var_$22 = nl_trie.nl_trie_word_pos_preds( entry );
            SubLObject pos_pred = NIL;
            pos_pred = cdolist_list_var_$22.first();
            while ( NIL != cdolist_list_var_$22)
            {
              final SubLObject item_var = ConsesLow.list( denot, pos_pred );
              if( NIL == conses_high.member( item_var, dp_list, Symbols.symbol_function( EQUALP ), Symbols.symbol_function( IDENTITY ) ) )
              {
                dp_list = ConsesLow.cons( item_var, dp_list );
              }
              cdolist_list_var_$22 = cdolist_list_var_$22.rest();
              pos_pred = cdolist_list_var_$22.first();
            }
            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
            denot = cdolist_list_var_$21.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return dp_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 32064L)
  public static SubLObject nl_trie_denots_of_stringXspeech_part(final SubLObject string, final SubLObject pos, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( entry ), pos, UNPROVIDED ) )
        {
          thread.resetMultipleValues();
          final SubLObject denot_list_$23 = add_new_entry( entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL );
          final SubLObject pred_list_$24 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denot_list = denot_list_$23;
          pred_list = pred_list_$24;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 33939L)
  public static SubLObject nl_trie_denots_of_stringXpred(final SubLObject string, final SubLObject pos_pred, SubLObject abbrev_types, SubLObject denot_type, SubLObject misspellingsP, SubLObject lookup_mt,
      SubLObject case_sensitivity)
  {
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != pos_pred_const_satisfiedP( pos_pred, nl_trie.nl_trie_word_pos_preds( entry ) ) )
        {
          thread.resetMultipleValues();
          final SubLObject denot_list_$25 = add_new_entry( entry, denot_list, pred_list, NIL, abbrev_types, denot_type, NIL );
          final SubLObject pred_list_$26 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denot_list = denot_list_$25;
          pred_list = pred_list_$26;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 35895L)
  public static SubLObject nl_trie_denots_of_name_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject precise_with_theP, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( precise_with_theP == UNPROVIDED )
    {
      precise_with_theP = NIL;
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    assert NIL != Types.stringp( string ) : string;
    return nl_trie_denots_of_name_string_internal( string, misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 36933L)
  public static SubLObject nl_trie_denots_of_name_string_internal(final SubLObject string, final SubLObject misspellingsP, final SubLObject lookup_mt, final SubLObject precise_with_theP,
      final SubLObject case_sensitivity, final SubLObject unquotedP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject starts_with_theP = makeBoolean( NIL != precise_with_theP && NIL != starts_with_theP( string ) );
    final SubLObject lookup_string = ( NIL != starts_with_theP ) ? string_utilities.substring( string, FOUR_INTEGER, UNPROVIDED ) : string;
    final SubLObject quotedP = makeBoolean( NIL == unquotedP && NIL != string_utilities.quoted_stringP( string ) );
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( lookup_string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw40$NAME || nl_trie.nl_trie_entry_type( entry ) == $kw40$NAME ) && NIL != spelling_const_satisfiedP( lexicon_vars.$misspellingsP$.getDynamicValue( thread ), entry ) )
        {
          SubLObject okP = T;
          if( NIL != precise_with_theP && !starts_with_theP.eql( starts_with_theP( nl_trie.nl_trie_entry_string( entry ) ) ) )
          {
            okP = NIL;
          }
          else if( NIL != unquotedP && NIL == nl_trie_unquoted_entry_okP( entry ) )
          {
            okP = NIL;
          }
          else if( NIL == spelling_const_satisfiedP( misspellingsP, entry ) )
          {
            okP = NIL;
          }
          if( NIL != okP )
          {
            thread.resetMultipleValues();
            final SubLObject denot_list_$27 = add_new_entry( entry, denot_list, pred_list, T, NIL, $kw46$DENOT, NIL );
            final SubLObject pred_list_$28 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            denot_list = denot_list_$27;
            pred_list = pred_list_$28;
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != quotedP )
    {
      thread.resetMultipleValues();
      final SubLObject unquoted_denots = nl_trie_denots_of_name_string_internal( string_utilities.unquote_string( string ), misspellingsP, lookup_mt, precise_with_theP, case_sensitivity, T );
      final SubLObject unquoted_preds = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject denot_list_$28 = add_new_denots_and_preds( unquoted_denots, denot_list, unquoted_preds, pred_list );
      final SubLObject pred_list_$29 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      denot_list = denot_list_$28;
      pred_list = pred_list_$29;
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 38244L)
  public static SubLObject starts_with_theP(final SubLObject string)
  {
    return string_utilities.starts_with_by_test( string, $str60$the_, Symbols.symbol_function( EQUALP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 38343L)
  public static SubLObject nl_trie_denots_of_acronym_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject namestring_pred = $const61$acronymString;
    return nl_trie_denots_of_string_and_namestring_pred( string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 39359L)
  public static SubLObject nl_trie_denots_of_abbreviation_string(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw14$ANY || nl_trie.nl_trie_entry_type( entry ) == $kw14$ANY ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            misspellingsP, entry ) && NIL != subl_promotions.memberP( nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED ), lexicon_vars.abbreviation_predicates(), $sym58$GENL_POS_PRED_, UNPROVIDED ) )
        {
          thread.resetMultipleValues();
          final SubLObject denot_list_$31 = add_new_entry( entry, denot_list, pred_list, T, NIL, $kw46$DENOT, NIL );
          final SubLObject pred_list_$32 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denot_list = denot_list_$31;
          pred_list = pred_list_$32;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 40673L)
  public static SubLObject reinitialize_nl_trie_for_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject syntactic_assertions = NIL;
    SubLObject name_assertions = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
      try
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
        final SubLObject _prev_bind_0_$33 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
        try
        {
          lexicon_vars.$lexicon_lookup_mt$.bind( $const62$InferencePSC, thread );
          SubLObject cdolist_list_var;
          final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue( thread ), NIL );
          SubLObject entry = NIL;
          entry = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( ( $kw14$ANY == $kw14$ANY || nl_trie.nl_trie_entry_type( entry ) == $kw14$ANY ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
                lexicon_vars.$misspellingsP$.getDynamicValue( thread ), entry ) )
            {
              if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
              {
                final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( entry );
                final SubLObject set_contents_var = set.do_set_internal( set_var );
                SubLObject basis_object;
                SubLObject state;
                SubLObject support;
                SubLObject item_var;
                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
                    .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                {
                  support = set_contents.do_set_contents_next( basis_object, state );
                  if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != assertion_handles.assertion_p( support ) )
                  {
                    item_var = support;
                    if( NIL == conses_high.member( item_var, syntactic_assertions, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      syntactic_assertions = ConsesLow.cons( item_var, syntactic_assertions );
                    }
                  }
                }
              }
              else if( NIL != assertion_handles.assertion_p( entry ) )
              {
                name_assertions = ConsesLow.cons( entry, name_assertions );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
          }
        }
        finally
        {
          lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0_$33, thread );
        }
        final SubLObject key = nl_trie.nl_trie_string_tokenize( string );
        strie.strie_remove( nl_trie.get_nl_trie(), key );
        SubLObject cdolist_list_var2 = syntactic_assertions;
        SubLObject as = NIL;
        as = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          nl_trie.augment_nl_trie_syntactic( as, UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          as = cdolist_list_var2.first();
        }
        cdolist_list_var2 = name_assertions;
        as = NIL;
        as = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          nl_trie.augment_nl_trie_semantic( as, UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          as = cdolist_list_var2.first();
        }
      }
      finally
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      }
    }
    return nl_trie.nl_trie_search( string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 41721L)
  public static SubLObject nl_trie_semtrans_templates_of_string(final SubLObject string, SubLObject frame, SubLObject misspellingsP, SubLObject pos, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( frame == UNPROVIDED )
    {
      frame = $kw14$ANY;
    }
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = T;
    }
    if( pos == UNPROVIDED )
    {
      pos = $kw14$ANY;
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject semtrans_template_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject skip_constraintsP = NIL;
    final SubLObject input_contains_periodP = contains_periodP( string );
    if( NIL != el_utilities.possibly_naut_p( frame ) )
    {
      frame = narts_high.find_nart( frame );
    }
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) && NIL != period_const_satisfiedP( input_contains_periodP, entry,
            string ) && ( NIL == lexicon_accessors.speech_partP( pos, UNPROVIDED ) || NIL != lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( entry ), pos, UNPROVIDED ) ) && NIL != lexicon_accessors
                .genl_lexicon_mtP( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), nl_trie.nl_trie_word_semantics_mt( entry ) ) && ( NIL == forts.fort_p( frame ) || nl_trie.nl_trie_word_frame( entry ).eql(
                    frame ) ) )
        {
          thread.resetMultipleValues();
          final SubLObject semtrans_template_list_$34 = add_new_entry( entry, semtrans_template_list, pred_list, skip_constraintsP, NIL, $kw63$SEMTRANS_TEMPLATE, NIL );
          final SubLObject pred_list_$35 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          semtrans_template_list = semtrans_template_list_$34;
          pred_list = pred_list_$35;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( semtrans_template_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 43013L)
  public static SubLObject nl_trie_names_from_spelling(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject namestring_pred = $const64$nameSpelling;
    return nl_trie_denots_of_string_and_namestring_pred( string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 44025L)
  public static SubLObject nl_trie_names_from_nickname(final SubLObject string, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject namestring_pred = $const65$commonNickname;
    return nl_trie_denots_of_string_and_namestring_pred( string, namestring_pred, misspellingsP, lookup_mt, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 45045L)
  public static SubLObject nl_trie_denots_of_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject denot_list = NIL;
    SubLObject pred_list = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw40$NAME || nl_trie.nl_trie_entry_type( entry ) == $kw40$NAME ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) && NIL != lexicon_accessors.genl_pos_predP( nl_trie
            .nl_trie_entry_semantic_pred( entry, UNPROVIDED ), namestring_pred, UNPROVIDED ) )
        {
          thread.resetMultipleValues();
          final SubLObject denot_list_$36 = add_new_entry( entry, denot_list, pred_list, T, NIL, $kw46$DENOT, NIL );
          final SubLObject pred_list_$37 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          denot_list = denot_list_$36;
          pred_list = pred_list_$37;
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 46264L)
  public static SubLObject nl_trie_assertions_with_string_and_namestring_pred(final SubLObject string, final SubLObject namestring_pred, SubLObject misspellingsP, SubLObject lookup_mt, SubLObject case_sensitivity)
  {
    if( misspellingsP == UNPROVIDED )
    {
      misspellingsP = lexicon_vars.$misspellingsP$.getDynamicValue();
    }
    if( lookup_mt == UNPROVIDED )
    {
      lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lookup_mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, case_sensitivity, NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw40$NAME || nl_trie.nl_trie_entry_type( entry ) == $kw40$NAME ) && NIL != spelling_const_satisfiedP( misspellingsP, entry ) && NIL != assertion_handles.assertion_p( entry )
            && NIL != lexicon_accessors.genl_pos_predP( nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED ), namestring_pred, UNPROVIDED ) )
        {
          assertions = ConsesLow.cons( entry, assertions );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 47163L)
  public static SubLObject nl_trie_regular_formP(final SubLObject string, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != lexicon_accessors.speech_part_predP( pred, UNPROVIDED ) : pred;
    SubLObject regularP = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue( thread ), NIL );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( entry ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            lexicon_vars.$misspellingsP$.getDynamicValue( thread ), entry ) && NIL != subl_promotions.memberP( pred, nl_trie.nl_trie_word_pos_preds( entry ), $sym67$SPEC_POS_PRED_, UNPROVIDED ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( entry );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject support;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
              .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL == assertion_handles.assertion_p( support ) )
            {
              regularP = T;
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return regularP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 47710L)
  public static SubLObject nl_trie_word_pred_and_supports_for_pred(final SubLObject nl_trie_word, final SubLObject speech_part_predicate, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject entry_pred = NIL;
    SubLObject supports = NIL;
    if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym68$RELEVANT_MT_IS_EVERYTHING ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym68$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const69$EverythingPSC, thread );
        if( NIL != mt_relevance_macros.relevant_mtP( nl_trie.nl_trie_entry_mt( nl_trie_word ) ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( nl_trie_word );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject support;
          SubLObject csome_list_var;
          SubLObject pred;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == entry_pred
              && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != arguments.support_p( support ) && NIL == entry_pred )
            {
              csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds( support );
              pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == entry_pred && NIL != csome_list_var)
              {
                if( NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP( pred, speech_part_predicate, mt_info ) )
                {
                  entry_pred = pred;
                  supports = ConsesLow.cons( support, supports );
                  if( !pred.equal( speech_part_predicate ) )
                  {
                    supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( pred, speech_part_predicate ), supports );
                  }
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != mt_relevance_macros.mt_function_eq( mt_info, $sym70$RELEVANT_MT_IS_ANY_MT ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym70$RELEVANT_MT_IS_ANY_MT, thread );
        mt_relevance_macros.$mt$.bind( $const62$InferencePSC, thread );
        if( NIL != mt_relevance_macros.relevant_mtP( nl_trie.nl_trie_entry_mt( nl_trie_word ) ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( nl_trie_word );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject support;
          SubLObject csome_list_var;
          SubLObject pred;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == entry_pred
              && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != arguments.support_p( support ) && NIL == entry_pred )
            {
              csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds( support );
              pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == entry_pred && NIL != csome_list_var)
              {
                if( NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP( pred, speech_part_predicate, mt_info ) )
                {
                  entry_pred = pred;
                  supports = ConsesLow.cons( support, supports );
                  if( !pred.equal( speech_part_predicate ) )
                  {
                    supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( pred, speech_part_predicate ), supports );
                  }
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else if( NIL != hlmt.mt_union_naut_p( mt_info ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread );
        mt_relevance_macros.$relevant_mts$.bind( hlmt.mt_union_mts( mt_info ), thread );
        if( NIL != mt_relevance_macros.relevant_mtP( nl_trie.nl_trie_entry_mt( nl_trie_word ) ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( nl_trie_word );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject support;
          SubLObject csome_list_var;
          SubLObject pred;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == entry_pred
              && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != arguments.support_p( support ) && NIL == entry_pred )
            {
              csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds( support );
              pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == entry_pred && NIL != csome_list_var)
              {
                if( NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP( pred, speech_part_predicate, mt_info ) )
                {
                  entry_pred = pred;
                  supports = ConsesLow.cons( support, supports );
                  if( !pred.equal( speech_part_predicate ) )
                  {
                    supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( pred, speech_part_predicate ), supports );
                  }
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym72$RELEVANT_MT_IS_GENL_MT, thread );
        mt_relevance_macros.$mt$.bind( mt_info, thread );
        if( NIL != mt_relevance_macros.relevant_mtP( nl_trie.nl_trie_entry_mt( nl_trie_word ) ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( nl_trie_word );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject support;
          SubLObject csome_list_var;
          SubLObject pred;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == entry_pred
              && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != arguments.support_p( support ) && NIL == entry_pred )
            {
              csome_list_var = nl_trie.nl_trie_word_syntactic_support_pos_preds( support );
              pred = NIL;
              pred = csome_list_var.first();
              while ( NIL == entry_pred && NIL != csome_list_var)
              {
                if( NIL != lexicon_accessors.genl_pos_pred_from_mt_infoP( pred, speech_part_predicate, mt_info ) )
                {
                  entry_pred = pred;
                  supports = ConsesLow.cons( support, supports );
                  if( !pred.equal( speech_part_predicate ) )
                  {
                    supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( pred, speech_part_predicate ), supports );
                  }
                }
                csome_list_var = csome_list_var.rest();
                pred = csome_list_var.first();
              }
            }
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( entry_pred, supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 48647L)
  public static SubLObject add_new_entry(final SubLObject entry, SubLObject denot_list, SubLObject pred_list, SubLObject skip_constraintsP, SubLObject abbrev_types, SubLObject denot_type, SubLObject skip_namestringsP)
  {
    if( skip_constraintsP == UNPROVIDED )
    {
      skip_constraintsP = NIL;
    }
    if( abbrev_types == UNPROVIDED )
    {
      abbrev_types = NIL;
    }
    if( denot_type == UNPROVIDED )
    {
      denot_type = $kw46$DENOT;
    }
    if( skip_namestringsP == UNPROVIDED )
    {
      skip_namestringsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != skip_constraintsP || NIL != pred_type_okP( nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED ), abbrev_types, denot_type, skip_namestringsP ) )
    {
      final SubLObject new_denots = ( denot_type == $kw63$SEMTRANS_TEMPLATE ) ? nl_trie.nl_trie_entry_semtrans_templates( entry ) : nl_trie.nl_trie_entry_denots( entry );
      final SubLObject new_preds = ( NIL != new_denots ) ? ConsesLow.make_list( conses_high.list_length( new_denots ), nl_trie_entry_name_pred_or_syntactic_preds( entry ) ) : NIL;
      thread.resetMultipleValues();
      final SubLObject denot_list_$38 = add_new_denots_and_preds( new_denots, denot_list, new_preds, pred_list );
      final SubLObject pred_list_$39 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      denot_list = denot_list_$38;
      pred_list = pred_list_$39;
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 49991L)
  public static SubLObject nl_trie_entry_name_pred_or_syntactic_preds(final SubLObject entry)
  {
    if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) )
    {
      return nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
    }
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
    {
      return nl_trie.nl_trie_entry_pos_preds( entry );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 50230L)
  public static SubLObject add_new_denots_and_preds(final SubLObject new_denots, SubLObject denot_list, final SubLObject new_preds, SubLObject pred_list)
  {
    SubLObject new_denot = NIL;
    SubLObject new_denot_$40 = NIL;
    SubLObject new_name_pred_or_pos_preds = NIL;
    SubLObject new_name_pred_or_pos_preds_$41 = NIL;
    new_denot = new_denots;
    new_denot_$40 = new_denot.first();
    new_name_pred_or_pos_preds = new_preds;
    new_name_pred_or_pos_preds_$41 = new_name_pred_or_pos_preds.first();
    while ( NIL != new_name_pred_or_pos_preds || NIL != new_denot)
    {
      SubLObject cdolist_list_var;
      final SubLObject new_preds_$42 = cdolist_list_var = new_name_pred_or_pos_preds_$41.isList() ? new_name_pred_or_pos_preds_$41 : ConsesLow.list( new_name_pred_or_pos_preds_$41 );
      SubLObject new_pred = NIL;
      new_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject index = Sequences.position( new_denot_$40, denot_list, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != index )
        {
          if( NIL != new_pred )
          {
            final SubLObject item_var = new_pred;
            if( NIL == conses_high.member( item_var, ConsesLow.nth( index, pred_list ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              ConsesLow.set_nth( index, pred_list, ConsesLow.cons( item_var, ConsesLow.nth( index, pred_list ) ) );
            }
          }
        }
        else
        {
          denot_list = ConsesLow.cons( new_denot_$40, denot_list );
          if( NIL != new_pred )
          {
            pred_list = ConsesLow.cons( ConsesLow.list( new_pred ), pred_list );
          }
          else
          {
            pred_list = ConsesLow.cons( NIL, pred_list );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        new_pred = cdolist_list_var.first();
      }
      new_denot = new_denot.rest();
      new_denot_$40 = new_denot.first();
      new_name_pred_or_pos_preds = new_name_pred_or_pos_preds.rest();
      new_name_pred_or_pos_preds_$41 = new_name_pred_or_pos_preds.first();
    }
    return Values.values( denot_list, pred_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 51380L)
  public static SubLObject pred_type_okP(final SubLObject pred, final SubLObject abbrev_types, final SubLObject denot_type, final SubLObject skip_namestringsP)
  {
    return makeBoolean( NIL != abbrev_const_satisfiedP( pred, abbrev_types ) && NIL != denot_const_satisfiedP( pred, denot_type ) && NIL != namestring_const_satisfiedP( pred, skip_namestringsP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 51990L)
  public static SubLObject abbrev_const_satisfiedP(final SubLObject pred, final SubLObject abbrev_types)
  {
    if( NIL != subl_promotions.memberP( pred, lexicon_vars.acronym_predicates(), UNPROVIDED, UNPROVIDED ) )
    {
      return ( NIL != subl_promotions.memberP( $kw73$ACRONYMS, abbrev_types, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
    }
    if( NIL != subl_promotions.memberP( pred, lexicon_vars.abbreviation_predicates(), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      return ( NIL != subl_promotions.memberP( $kw74$ABBREVS, abbrev_types, UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 52463L)
  public static SubLObject denot_const_satisfiedP(final SubLObject pred, final SubLObject denot_type)
  {
    if( NIL != subl_promotions.memberP( pred, $list75, UNPROVIDED, UNPROVIDED ) )
    {
      return subl_promotions.memberP( pred, lexicon_accessors.determine_denotation_preds( denot_type ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != subl_promotions.memberP( pred, nl_trie.nl_trie_semtrans_predicates(), UNPROVIDED, UNPROVIDED ) )
    {
      return Equality.eq( denot_type, $kw63$SEMTRANS_TEMPLATE );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 52980L)
  public static SubLObject namestring_const_satisfiedP(final SubLObject pred, final SubLObject skip_namestringsP)
  {
    if( NIL != nl_trie.nl_trie_name_string_predP( pred ) )
    {
      return makeBoolean( NIL == skip_namestringsP );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 53349L)
  public static SubLObject nl_trie_sentence_tokenize(final SubLObject words, SubLObject output, SubLObject mode, SubLObject token_data, SubLObject starting_index, SubLObject case_sensitivity)
  {
    if( output == UNPROVIDED )
    {
      output = $kw3$STRING;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw56$GREEDY;
    }
    if( token_data == UNPROVIDED )
    {
      token_data = Symbols.symbol_function( IDENTITY );
    }
    if( starting_index == UNPROVIDED )
    {
      starting_index = ZERO_INTEGER;
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject standardized_word_lists = nl_trie.nl_trie_standardize_strings( words );
    final SubLObject alteration_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject standardized_words = standardized_word_lists.first();
    final SubLObject alterations = alteration_lists.first();
    final SubLObject v_nl_trie = nl_trie.get_nl_trie();
    SubLObject tokens = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
      try
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
        tokens = lexicon_utilities.sentence_tokenize( standardized_words, v_nl_trie, output, mode, token_data, starting_index );
      }
      finally
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      }
    }
    if( output != $kw76$INTERVAL )
    {
      return tokens;
    }
    tokens = nl_trie_remove_inappropriate_tokens( tokens );
    if( case_sensitivity != $kw77$OFF && NIL == nl_trie.nl_trie_case_sensitive_p( v_nl_trie ) )
    {
      final SubLObject filtered_tokens = nl_trie_filter_tokens_for_case( tokens, standardized_words );
      if( case_sensitivity == $kw78$ON || NIL != list_utilities.non_empty_list_p( filtered_tokens ) )
      {
        tokens = filtered_tokens;
      }
    }
    if( NIL != alterations )
    {
      tokens = nl_trie_repair_token_indexes( tokens, alterations );
    }
    return Sort.sort( Sort.sort( tokens, Symbols.symbol_function( $sym79$_ ), $sym80$INTERVAL_TOKEN_LENGTH ), Symbols.symbol_function( $sym81$_ ), $sym82$INTERVAL_TOKEN_START );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55136L)
  public static SubLObject nl_trie_filter_tokens_for_case(final SubLObject interval_tokens, final SubLObject key)
  {
    SubLObject cdolist_list_var = interval_tokens;
    SubLObject interval_token = NIL;
    interval_token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject start = standard_tokenization.interval_token_start( interval_token );
      final SubLObject end = standard_tokenization.interval_token_end( interval_token );
      final SubLObject subkey = strie.sequence_slice( key, start, end );
      final SubLObject s_token = standard_tokenization.interval_token_value( interval_token );
      standard_tokenization.string_token_value_set( s_token, nl_trie.nl_trie_filter_entries_for_case( standard_tokenization.string_token_value( s_token ), subkey ) );
      cdolist_list_var = cdolist_list_var.rest();
      interval_token = cdolist_list_var.first();
    }
    return interval_tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55606L)
  public static SubLObject nl_trie_remove_inappropriate_tokens(final SubLObject interval_tokens)
  {
    SubLObject cdolist_list_var = interval_tokens;
    SubLObject interval_token = NIL;
    interval_token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject s_token = standard_tokenization.interval_token_value( interval_token );
      standard_tokenization.string_token_value_set( s_token, nl_trie_remove_inappropriate_entries( standard_tokenization.string_token_value( s_token ), UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      interval_token = cdolist_list_var.first();
    }
    return interval_tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 55936L)
  public static SubLObject nl_trie_repair_token_indexes(final SubLObject tokens, final SubLObject alterations)
  {
    final SubLObject adjustment_hash = Hashtables.make_hash_table( SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject new_tokens = NIL;
    SubLObject cdolist_list_var = alterations;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject index = NIL;
      SubLObject num_tokens = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
      index = current.first();
      current = ( num_tokens = current.rest() );
      final SubLObject old_value = Hashtables.gethash( index, adjustment_hash, ZERO_INTEGER );
      final SubLObject new_value = Numbers.add( old_value, Numbers.subtract( ONE_INTEGER, num_tokens ) );
      Hashtables.sethash( index, adjustment_hash, new_value );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_start;
      final SubLObject start = new_start = standard_tokenization.interval_token_start( token );
      SubLObject new_end;
      final SubLObject end = new_end = standard_tokenization.interval_token_end( token );
      final SubLObject value = standard_tokenization.interval_token_value( token );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( start ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        new_start = Numbers.add( new_start, Hashtables.gethash( number_utilities.f_1X( i ), adjustment_hash, ZERO_INTEGER ) );
      }
      for( i = NIL, i = ZERO_INTEGER; i.numL( end ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        new_end = Numbers.add( new_end, Hashtables.gethash( i, adjustment_hash, ZERO_INTEGER ) );
      }
      new_tokens = ConsesLow.cons( standard_tokenization.new_interval_token( new_start, new_end, value ), new_tokens );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return new_tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 56788L)
  public static SubLObject nl_trie_prefix_keys_from_string(final SubLObject trie, final SubLObject string, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    assert NIL != nl_trie.nl_trie_p( trie, UNPROVIDED ) : trie;
    assert NIL != Types.stringp( string ) : string;
    final SubLObject tokens = nl_trie.nl_trie_string_tokenize( string );
    return nl_trie_prefixes( trie, tokens, case_sensitivity );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 57100L)
  public static SubLObject nl_trie_prefixes(final SubLObject trie, final SubLObject key, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != nl_trie.nl_trie_p( trie, UNPROVIDED ) : trie;
    SubLObject filtered_nodes = NIL;
    SubLObject quotedP = NIL;
    thread.resetMultipleValues();
    final SubLObject standardized_keys = nl_trie.nl_trie_strings_keys( key );
    final SubLObject alteration_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject standardized_key = NIL;
    SubLObject standardized_key_$43 = NIL;
    SubLObject alterations = NIL;
    SubLObject alterations_$44 = NIL;
    standardized_key = standardized_keys;
    standardized_key_$43 = standardized_key.first();
    alterations = alteration_lists;
    alterations_$44 = alterations.first();
    while ( NIL != alterations || NIL != standardized_key)
    {
      if( NIL != list_utilities.singletonP( standardized_key_$43 ) && NIL != string_utilities.quoted_stringP( standardized_key_$43.first() ) )
      {
        thread.resetMultipleValues();
        final SubLObject standardized_key_$44 = nl_trie.nl_trie_string_tokenize( string_utilities.unquote_string( standardized_key_$43.first() ) );
        final SubLObject alterations_$45 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        standardized_key_$43 = standardized_key_$44;
        alterations_$44 = alterations_$45;
        quotedP = T;
      }
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
        try
        {
          file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
          SubLObject cdolist_list_var = strie.strie_prefixes( trie, standardized_key_$43 );
          SubLObject record = NIL;
          record = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject record_key = list_utilities.first_n( Sequences.length( nl_trie.nl_trie_record_key( record ) ), standardized_key_$43 );
            final SubLObject record_key_okP = nl_trie_prefix_key_jibes_with_alterationsP( record_key, alterations_$44 );
            SubLObject filtered_entries = ( NIL != record_key_okP ) ? nl_trie.nl_trie_remove_invalid_entries( nl_trie_remove_inappropriate_entries( nl_trie.nl_trie_record_entries( record ), UNPROVIDED ), trie,
                record_key ) : NIL;
            if( case_sensitivity != $kw77$OFF )
            {
              if( NIL == nl_trie.nl_trie_case_sensitive_p( trie ) )
              {
                if( NIL != conses_high.member( case_sensitivity, $list85, UNPROVIDED, UNPROVIDED ) )
                {
                  final SubLObject really_filtered = nl_trie.nl_trie_filter_entries_for_case( filtered_entries, record_key );
                  if( case_sensitivity == $kw78$ON || NIL != list_utilities.non_empty_list_p( really_filtered ) )
                  {
                    filtered_entries = really_filtered;
                  }
                }
                else
                {
                  Errors.error( $str86$Invalid_case_sensitivity_value_fo, case_sensitivity );
                }
              }
            }
            if( NIL != quotedP )
            {
              filtered_entries = nl_trie_filter_unquoted_entries( filtered_entries );
            }
            if( NIL != filtered_entries )
            {
              if( NIL != alterations_$44 )
              {
                record_key = nl_trie_find_original_prefix_key( Sequences.length( record_key ), key, alterations_$44 );
              }
              filtered_nodes = ConsesLow.cons( nl_trie.new_nl_trie_record( record_key, filtered_entries ), filtered_nodes );
            }
            cdolist_list_var = cdolist_list_var.rest();
            record = cdolist_list_var.first();
          }
        }
        finally
        {
          file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
        }
      }
      standardized_key = standardized_key.rest();
      standardized_key_$43 = standardized_key.first();
      alterations = alterations.rest();
      alterations_$44 = alterations.first();
    }
    return Sequences.nreverse( filtered_nodes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59551L)
  public static SubLObject nl_trie_prefixes_memoized_internal(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt)
  {
    if( lexicon_lookup_mt == UNPROVIDED )
    {
      lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( lexicon_lookup_mt, thread );
      ans = nl_trie_prefixes( trie, key, case_sensitivity );
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59551L)
  public static SubLObject nl_trie_prefixes_memoized(final SubLObject trie, final SubLObject key, final SubLObject case_sensitivity, SubLObject lexicon_lookup_mt)
  {
    if( lexicon_lookup_mt == UNPROVIDED )
    {
      lexicon_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return nl_trie_prefixes_memoized_internal( trie, key, case_sensitivity, lexicon_lookup_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym87$NL_TRIE_PREFIXES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym87$NL_TRIE_PREFIXES_MEMOIZED, FOUR_INTEGER, $int88$512, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym87$NL_TRIE_PREFIXES_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( trie, key, case_sensitivity, lexicon_lookup_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( trie.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( key.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( case_sensitivity.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && lexicon_lookup_mt.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( nl_trie_prefixes_memoized_internal( trie, key, case_sensitivity, lexicon_lookup_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( trie, key, case_sensitivity, lexicon_lookup_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 59878L)
  public static SubLObject nl_trie_filter_unquoted_entries(final SubLObject entries)
  {
    SubLObject filtered_entries = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != nl_trie_unquoted_entry_okP( entry ) )
      {
        filtered_entries = ConsesLow.cons( entry, filtered_entries );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return Sequences.nreverse( filtered_entries );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60122L)
  public static SubLObject nl_trie_unquoted_entry_okP(final SubLObject entry)
  {
    return makeBoolean( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) && NIL != lexicon_accessors.genl_pos_predP( nl_trie_entry_name_pred_or_syntactic_preds( entry ), $const89$titleOfWork, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60308L)
  public static SubLObject nl_trie_access_case_sensitive_p()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eq( lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue( thread ), $kw78$ON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 60424L)
  public static SubLObject nl_trie_prefix_key_jibes_with_alterationsP(final SubLObject prefix_key, final SubLObject alterations)
  {
    if( NIL == alterations )
    {
      return T;
    }
    final SubLObject prefix_key_length = Sequences.length( prefix_key );
    SubLObject largest_known_valid_length = ZERO_INTEGER;
    if( prefix_key_length.isZero() )
    {
      return T;
    }
    SubLObject end_var;
    SubLObject original_token_num;
    SubLObject new_token_count;
    for( end_var = prefix_key_length, original_token_num = NIL, original_token_num = ZERO_INTEGER; !original_token_num.numGE( end_var ); original_token_num = number_utilities.f_1X( original_token_num ) )
    {
      new_token_count = list_utilities.alist_lookup( alterations, original_token_num, Symbols.symbol_function( EQL ), ONE_INTEGER );
      largest_known_valid_length = Numbers.add( largest_known_valid_length, new_token_count );
      if( prefix_key_length.eql( largest_known_valid_length ) )
      {
        return T;
      }
      if( largest_known_valid_length.numG( prefix_key_length ) )
      {
        return NIL;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 61526L)
  public static SubLObject nl_trie_find_original_prefix_key(SubLObject entry_key_length, final SubLObject original_strings, final SubLObject alterations)
  {
    SubLObject original_key = NIL;
    SubLObject entry_key_index;
    SubLObject alternation_length;
    for( entry_key_index = NIL, entry_key_index = ZERO_INTEGER; !entry_key_index.numGE( entry_key_length ); entry_key_index = number_utilities.f_1X( entry_key_index ) )
    {
      original_key = ConsesLow.cons( ConsesLow.nth( entry_key_index, original_strings ), original_key );
      alternation_length = list_utilities.alist_lookup( alterations, entry_key_index, Symbols.symbol_function( EQL ), ONE_INTEGER );
      if( alternation_length.numG( ONE_INTEGER ) )
      {
        entry_key_length = Numbers.subtract( entry_key_length, Numbers.subtract( alternation_length, ONE_INTEGER ) );
      }
    }
    return Sequences.nreverse( original_key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 62170L)
  public static SubLObject nl_trie_unknown_strings(final SubLObject string, final SubLObject mt, SubLObject case_sensitivity)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLObject tokens = nl_trie_unknown_string_tokens( string, mt, case_sensitivity );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( standard_tokenization.string_token_string( standard_tokenization.interval_token_value( token ) ), result );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 62684L)
  public static SubLObject nl_trie_unknown_string_tokens(final SubLObject string, SubLObject mt, SubLObject case_sensitivity)
  {
    if( mt == UNPROVIDED )
    {
      mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject word_list = standard_tokenization.standard_string_tokenize( string );
    final SubLObject word_count = Sequences.length( word_list );
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      final SubLObject starting_index = ZERO_INTEGER;
      final SubLObject interval_tokens = nl_trie_sentence_tokenize( word_list, $kw76$INTERVAL, $kw56$GREEDY, Symbols.symbol_function( IDENTITY ), starting_index, case_sensitivity );
      SubLObject index;
      for( index = NIL, index = ZERO_INTEGER; index.numL( word_count ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        if( NIL == subl_promotions.memberP( index, interval_tokens, $sym90$INDEX_COVERED_BY_TOKEN_P, UNPROVIDED ) )
        {
          result = ConsesLow.cons( standard_tokenization.new_interval_token( index, number_utilities.f_1X( index ), standard_tokenization.new_string_token( ConsesLow.nth( index, word_list ), UNPROVIDED ) ), result );
        }
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 63664L)
  public static SubLObject index_covered_by_token_p(final SubLObject index, final SubLObject token)
  {
    return makeBoolean( NIL != nl_trie_token_has_meaning_p( token ) && index.numGE( standard_tokenization.interval_token_start( token ) ) && index.numL( standard_tokenization.interval_token_end( token ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64168L)
  public static SubLObject nl_trie_token_has_meaning_p(final SubLObject token)
  {
    final SubLObject string_token = standard_tokenization.interval_token_value( token );
    return list_utilities.sublisp_boolean( standard_tokenization.string_token_value( string_token ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64418L)
  public static SubLObject spelling_const_satisfiedP(final SubLObject misspellingsP, final SubLObject nl_trie_entry)
  {
    return makeBoolean( NIL != misspellingsP || !nl_trie.nl_trie_entry_mt( nl_trie_entry ).eql( $const91$CommonEnglishMisspellingsMt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64907L)
  public static SubLObject contains_periodP(final SubLObject string)
  {
    return string_utilities.contains_charP( string, Characters.CHAR_period );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 64988L)
  public static SubLObject period_const_satisfiedP(final SubLObject contains_periodP, final SubLObject entry, final SubLObject string)
  {
    if( NIL == contains_periodP )
    {
      return T;
    }
    if( NIL != nl_trie.nl_trie_name_p( entry, T ) )
    {
      final SubLObject entry_string = nl_trie.nl_trie_name_string_macro_helper( entry );
      if( string.equalp( entry_string ) )
      {
        return T;
      }
    }
    else if( NIL != nl_trie.nl_trie_term_phrases_entry_p( entry, T ) )
    {
      final SubLObject entry_string = assertions_high.gaf_arg3( entry );
      if( string.equalp( entry_string ) )
      {
        return T;
      }
    }
    else if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
    {
      final SubLObject head_string = nl_trie.nl_trie_word_head_string_macro_helper( entry );
      final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set( entry );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject semantic_support;
      SubLObject leading_strings;
      SubLObject following_strings;
      SubLObject entry_string2;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        semantic_support = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, semantic_support ) )
        {
          leading_strings = nl_trie.nl_trie_word_leading_strings_from_support_macro_helper( semantic_support );
          following_strings = nl_trie.nl_trie_word_following_strings_from_support_macro_helper( semantic_support );
          entry_string2 = nl_trie.nl_trie_assemble_strings_macro_helper( leading_strings, head_string, following_strings );
          if( string.equalp( entry_string2 ) )
          {
            return T;
          }
        }
      }
    }
    else if( NIL != abstract_lexicon.lex_entry_p( entry ) )
    {
      final SubLObject entry_string = nl_trie.nl_trie_lex_entry_get( entry, $kw3$STRING );
      if( string.equalp( entry_string ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 65512L)
  public static SubLObject pos_pred_const_satisfiedP(final SubLObject pred, final SubLObject preds)
  {
    return subl_promotions.memberP( pred, preds, $sym67$SPEC_POS_PRED_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 65699L)
  public static SubLObject nl_trie_record_filter_mt(final SubLObject record, final SubLObject mt)
  {
    if( NIL != subl_promotions.memberP( mt, $list92, UNPROVIDED, UNPROVIDED ) )
    {
      return record;
    }
    final SubLObject entries = nl_trie.nl_trie_record_entries( record );
    SubLObject filtered = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject semantic_mt = nl_trie.nl_trie_entry_semantic_mt( entry );
      final SubLObject entry_mt = ( NIL != semantic_mt ) ? semantic_mt : nl_trie.nl_trie_entry_mt( entry );
      if( NIL != lexicon_accessors.genl_lexicon_mtP( mt, entry_mt ) )
      {
        filtered = ConsesLow.cons( entry, filtered );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return ( NIL != filtered ) ? nl_trie.new_nl_trie_record( nl_trie.nl_trie_record_key( record ), Sequences.nreverse( filtered ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 66414L)
  public static SubLObject gated_nl_trie_search(final SubLObject string, SubLObject case_sensitivity, SubLObject semanticP)
  {
    if( case_sensitivity == UNPROVIDED )
    {
      case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
    }
    if( semanticP == UNPROVIDED )
    {
      semanticP = NIL;
    }
    SubLObject ans = nl_trie.nl_trie_search( string, nl_trie.get_nl_trie(), case_sensitivity );
    if( NIL != list_utilities.non_empty_list_p( ans ) )
    {
      ans = nl_trie_filter_pragmatics( ans, semanticP );
    }
    return ( NIL != list_utilities.empty_list_p( ans ) && case_sensitivity.eql( $kw93$PREFERRED ) ) ? gated_nl_trie_search( string, $kw77$OFF, UNPROVIDED ) : ( ( ans == $kw94$ABORTED ) ? NIL : ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 66886L)
  public static SubLObject nl_trie_filter_pragmatics(final SubLObject trie_entries, SubLObject semanticP)
  {
    if( semanticP == UNPROVIDED )
    {
      semanticP = NIL;
    }
    return nl_trie_remove_inappropriate_entries( trie_entries, semanticP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67165L)
  public static SubLObject nl_trie_remove_inappropriate_entries(final SubLObject trie_entries, SubLObject semanticP)
  {
    if( semanticP == UNPROVIDED )
    {
      semanticP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $nl_trie_check_semantic_mtP$.currentBinding( thread );
    try
    {
      $nl_trie_check_semantic_mtP$.bind( semanticP, thread );
      ans = Sequences.remove_if( $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_, trie_entries, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $nl_trie_check_semantic_mtP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67498L)
  public static SubLObject nl_trie_inappropriate_entryP(final SubLObject trie_entry, SubLObject semanticP)
  {
    if( semanticP == UNPROVIDED )
    {
      semanticP = $nl_trie_check_semantic_mtP$.getDynamicValue();
    }
    if( NIL != lexicon_vars.active_lexicon_filtersP() && NIL != list_utilities.find_if_not( $sym96$PRAGMATICALLY_ACCEPTABLE_, nl_trie.nl_trie_entry_pragmatics( trie_entry ), Symbols.symbol_function( $sym97$FIRST ),
        UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL == nl_trie_entry_mt_okP( trie_entry, semanticP ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 67934L)
  public static SubLObject nl_trie_entry_mt_okP(final SubLObject entry, SubLObject semanticP)
  {
    if( semanticP == UNPROVIDED )
    {
      semanticP = $nl_trie_check_semantic_mtP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entry_mt = ( NIL != semanticP ) ? nl_trie.nl_trie_entry_semantic_mt( entry ) : nl_trie.nl_trie_entry_mt( entry );
    return makeBoolean( NIL == entry_mt || NIL != lexicon_accessors.genl_lexicon_mtP( lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), entry_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 68213L)
  public static SubLObject nl_trie_string_to_use(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
      final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding( thread );
      try
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
        file_vector_utilities.$current_backed_map_cache_strategy$.bind( nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread );
        final SubLObject node = map_utilities.map_get_without_values( nl_trie.get_nl_trie(), string, UNPROVIDED );
        final SubLObject existing_string = nl_trie_match_string( string, node );
        result = ( ( NIL != existing_string ) ? existing_string : string );
      }
      finally
      {
        file_vector_utilities.$current_backed_map_cache_strategy$.rebind( _prev_bind_2, thread );
        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 68731L)
  public static SubLObject nl_trie_match_string(final SubLObject string, final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    if( node.isCons() )
    {
      ans = node.first().first();
      if( ans.isString() && !ans.eql( string ) )
      {
      }
    }
    else if( NIL != map_utilities.map_p( node ) )
    {
      final SubLObject iterator = map_utilities.new_map_iterator( node );
      SubLObject valid;
      for( SubLObject done_var = ans; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != ans ) )
      {
        thread.resetMultipleValues();
        final SubLObject var = iteration.iteration_next( iterator );
        valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != valid )
        {
          SubLObject current;
          final SubLObject datum = current = var;
          SubLObject key = NIL;
          SubLObject subnode = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
          key = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
          subnode = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject result = nl_trie_match_string( string, subnode );
            if( NIL != Functions.funcall( strie.strie_test( nl_trie.get_nl_trie() ), result, string ) )
            {
              ans = result;
            }
            else if( result.isString() )
            {
              Errors.warn( $str99$Found_non_matching_string___S_vs_, result, string );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
          }
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 69450L)
  public static SubLObject do_supporting_trie_words(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject word = NIL;
    SubLObject support = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
    support = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$47 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      current_$47 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list100 );
      if( NIL == conses_high.member( current_$47, $list101, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$47 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list100 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw4$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject asent = $sym102$ASENT;
    final SubLObject mt = $sym103$MT;
    return ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( asent, ConsesLow.list( $sym104$SUPPORT_SENTENCE, support ) ), ConsesLow.list( mt, ConsesLow.list( $sym105$SUPPORT_MT, support ) ) ), ConsesLow.list(
        $sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING, ConsesLow.list( word, ConsesLow.list( $sym107$ATOMIC_SENTENCE_ARG2, asent ), mt ), ConsesLow.listS( $sym26$PWHEN, ConsesLow.list( $sym27$CAND, ConsesLow.list(
            $sym108$CNOT, done ), ConsesLow.list( $sym109$MATCHING_WORD_STRINGS_ENTRY_, word, asent ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 70106L)
  public static SubLObject matching_word_strings_entryP(final SubLObject entry, final SubLObject asent)
  {
    SubLObject okP = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_terms( asent, UNPROVIDED );
    SubLObject pos_pred = NIL;
    SubLObject word = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    pos_pred = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    word = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( word.equal( nl_trie.nl_trie_word_word_unit( entry, NIL ) ) && string.equal( nl_trie.nl_trie_entry_string( entry ) ) && NIL == okP )
      {
        SubLObject csome_list_var;
        SubLObject entry_pos_pred;
        for( csome_list_var = nl_trie.nl_trie_entry_pos_preds( entry ), entry_pos_pred = NIL, entry_pos_pred = csome_list_var.first(); NIL == okP && NIL != csome_list_var; okP = lexicon_accessors.genl_pos_predP(
            entry_pos_pred, pos_pred, UNPROVIDED ), csome_list_var = csome_list_var.rest(), entry_pos_pred = csome_list_var.first() )
        {
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list111 );
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 70550L)
  public static SubLObject nl_trie_hl_justify_word_strings(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    SubLObject trie_support_pos_pred = NIL;
    final SubLObject asent = arguments.support_sentence( support );
    final SubLObject mt = arguments.support_mt( support );
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue( thread ),
          NIL );
      SubLObject trie_word = NIL;
      trie_word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( trie_word ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ), trie_word,
            cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) && NIL != spelling_const_satisfiedP( lexicon_vars.$misspellingsP$.getDynamicValue( thread ), trie_word ) && NIL == supports
            && NIL != matching_word_strings_entryP( trie_word, asent ) )
        {
          final SubLObject set_var = nl_trie.nl_trie_word_syntactic_support_set( trie_word );
          final SubLObject set_contents_var = set.do_set_internal( set_var );
          SubLObject basis_object;
          SubLObject state;
          SubLObject trie_word_support;
          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
              .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
          {
            trie_word_support = set_contents.do_set_contents_next( basis_object, state );
            if( NIL != set_contents.do_set_contents_element_validP( state, trie_word_support ) )
            {
              if( NIL != arguments.support_p( trie_word_support ) )
              {
                supports = ConsesLow.cons( trie_word_support, supports );
                trie_support_pos_pred = arguments.support_sentence_operator( trie_word_support );
              }
              else if( NIL != nl_trie.nl_trie_word_hl_syntactic_support_p( trie_word_support, UNPROVIDED ) )
              {
                supports = nl_trie.nl_trie_justify_hl_syntactic_support( trie_word_support );
                trie_support_pos_pred = cycl_utilities.formula_arg0( trie_word_support.first() );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        trie_word = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != trie_support_pos_pred )
    {
      final SubLObject support_pred = arguments.support_sentence_operator( support );
      if( !support_pred.equal( trie_support_pos_pred ) )
      {
        supports = ConsesLow.cons( removal_module_utilities.make_genl_preds_support( trie_support_pos_pred, support_pred ), supports );
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 71423L)
  public static SubLObject nl_trie_hl_forward_mt_combos_word_strings(final SubLObject support)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    SubLObject mts = NIL;
    SubLObject hl_module = NIL;
    SubLObject el_sentence = NIL;
    SubLObject mt = NIL;
    SubLObject tv = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( support, support, $list112 );
    hl_module = support.first();
    SubLObject current = support.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list112 );
    el_sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list112 );
    mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, support, $list112 );
    tv = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject pcase_var = mt;
      if( pcase_var.eql( $const62$InferencePSC ) )
      {
        final SubLObject asent = arguments.support_sentence( support );
        final SubLObject mt_$48 = arguments.support_mt( support );
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
        try
        {
          lexicon_vars.$lexicon_lookup_mt$.bind( mt_$48, thread );
          SubLObject cdolist_list_var;
          final SubLObject entries = cdolist_list_var = gated_nl_trie_search( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ), lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue(
              thread ), NIL );
          SubLObject trie_word = NIL;
          trie_word = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( ( $kw14$ANY == $kw37$WORD || nl_trie.nl_trie_entry_type( trie_word ) == $kw37$WORD ) && NIL != period_const_satisfiedP( contains_periodP( cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ),
                trie_word, cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED ) ) && NIL != spelling_const_satisfiedP( lexicon_vars.$misspellingsP$.getDynamicValue( thread ), trie_word )
                && NIL != matching_word_strings_entryP( trie_word, asent ) )
            {
              final SubLObject item_var = nl_trie.nl_trie_entry_mt( trie_word );
              if( NIL == conses_high.member( item_var, mts, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                mts = ConsesLow.cons( item_var, mts );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            trie_word = cdolist_list_var.first();
          }
        }
        finally
        {
          lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        supports = ConsesLow.list( support );
      }
      SubLObject cdolist_list_var2 = genl_mts.max_floor_mts( mts, UNPROVIDED, UNPROVIDED );
      SubLObject mt_$49 = NIL;
      mt_$49 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        supports = ConsesLow.cons( arguments.make_hl_support( hl_module, el_sentence, mt_$49, tv ), supports );
        cdolist_list_var2 = cdolist_list_var2.rest();
        mt_$49 = cdolist_list_var2.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( support, $list112 );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 71949L)
  public static SubLObject nl_trie_get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject term_phrases_constraint, final SubLObject case_insensitiveP, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject supports = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( mt, thread );
      SubLObject cdolist_list_var;
      final SubLObject entries = cdolist_list_var = gated_nl_trie_search( string, ( NIL != case_insensitiveP ) ? $kw77$OFF : $kw78$ON, T );
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( ( $kw14$ANY == $kw14$ANY || nl_trie.nl_trie_entry_type( entry ) == $kw14$ANY ) && NIL != period_const_satisfiedP( contains_periodP( string ), entry, string ) && NIL != spelling_const_satisfiedP(
            lexicon_vars.$misspellingsP$.getDynamicValue( thread ), entry ) && NIL != set.empty_set_p( supports ) && NIL != subl_promotions.memberP( denot, nl_trie.nl_trie_entry_denots( entry ), Symbols.symbol_function(
                $sym113$EQUALS_EL_ ), UNPROVIDED ) && NIL != nl_trie_entry_matches_term_phrases_constraintP( entry, term_phrases_constraint, mt ) )
        {
          add_nl_trie_supports( entry, supports, denot, term_phrases_constraint, mt );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 72578L)
  public static SubLObject add_nl_trie_supports(final SubLObject entry, final SubLObject supports, final SubLObject denot, final SubLObject term_phrases_constraint, final SubLObject mt)
  {
    if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) && NIL != arguments.support_p( entry ) )
    {
      final SubLObject support_pred = nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED );
      if( NIL != fort_types_interface.isa_predicateP( term_phrases_constraint, mt ) && !support_pred.eql( term_phrases_constraint ) && NIL != genl_predicates.genl_predicateP( support_pred, term_phrases_constraint, mt,
          UNPROVIDED ) )
      {
        set.set_add( removal_module_utilities.make_genl_preds_support( support_pred, term_phrases_constraint ), supports );
      }
      set.set_add( entry, supports );
    }
    else if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) )
    {
      final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set( entry );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject support;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        support = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, support ) && NIL != subl_promotions.memberP( denot, nl_trie.nl_trie_word_semantic_support_denots( support, UNPROVIDED ), Symbols.symbol_function(
            EQUAL ), UNPROVIDED ) )
        {
          set.set_add( support, supports );
        }
      }
      SubLObject pos_pred = NIL;
      final SubLObject set_var2 = nl_trie.nl_trie_word_syntactic_support_set( entry );
      final SubLObject set_contents_var2 = set.do_set_internal( set_var2 );
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject support2;
      SubLObject support_pred2;
      SubLObject speech_part_predP;
      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2, set_contents_var2 ); NIL == set_contents
          .do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
      {
        support2 = set_contents.do_set_contents_next( basis_object2, state2 );
        if( NIL != set_contents.do_set_contents_element_validP( state2, support2 ) )
        {
          support_pred2 = nl_trie.nl_trie_word_support_predicate( support2 );
          speech_part_predP = lexicon_accessors.speech_part_predP( support_pred2, mt );
          if( NIL == speech_part_predP || NIL == pos_pred )
          {
            if( NIL != speech_part_predP && !support_pred2.eql( term_phrases_constraint ) && NIL != genl_predicates.genl_predicateP( support_pred2, term_phrases_constraint, mt, UNPROVIDED ) )
            {
              set.set_add( removal_module_utilities.make_genl_preds_support( support_pred2, term_phrases_constraint ), supports );
            }
            if( NIL != arguments.support_p( support2 ) )
            {
              set.set_add( support2, supports );
            }
            else if( NIL != nl_trie.nl_trie_word_hl_syntactic_support_p( support2, UNPROVIDED ) )
            {
              set_utilities.set_add_all( nl_trie.nl_trie_justify_hl_syntactic_support( support2 ), supports );
            }
            if( NIL != speech_part_predP )
            {
              pos_pred = support_pred2;
            }
          }
        }
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 74084L)
  public static SubLObject nl_trie_entry_matches_term_phrases_constraintP(final SubLObject entry, final SubLObject term_phrases_constraint, final SubLObject mt)
  {
    if( NIL != conses_high.member( term_phrases_constraint, $list114, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != nl_trie.nl_trie_name_p( entry, UNPROVIDED ) )
    {
      return makeBoolean( ( NIL != nl_trie.nl_trie_name_string_predP( term_phrases_constraint ) && NIL != genl_predicates.genl_predicateP( nl_trie.nl_trie_entry_semantic_pred( entry, UNPROVIDED ),
          term_phrases_constraint, mt, UNPROVIDED ) ) || NIL != genls.genlP( $const115$NounPhrase, term_phrases_constraint, mt, UNPROVIDED ) || NIL != genls.genlP( $const116$ProperNameString, term_phrases_constraint, mt,
              UNPROVIDED ) );
    }
    if( NIL != genls.genlP( term_phrases_constraint, $const117$NLPhrase, mt, UNPROVIDED ) )
    {
      return NIL;
    }
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( term_phrases_constraint, $const118$phrase_Bar1, mt, TWO_INTEGER, UNPROVIDED ) )
    {
      return nl_trie_entry_matches_term_phrases_constraintP( entry, kb_mapping_utilities.fpred_value_in_relevant_mts( term_phrases_constraint, $const118$phrase_Bar1, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ), mt );
    }
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != lexicon_accessors.speech_partP( term_phrases_constraint, mt ) )
    {
      return lexicon_accessors.genl_posP( nl_trie.nl_trie_word_pos( entry ), term_phrases_constraint, mt );
    }
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != lexicon_accessors.speech_part_predP( term_phrases_constraint, mt ) )
    {
      SubLObject csome_list_var = nl_trie.nl_trie_word_pos_preds( entry );
      SubLObject entry_pred = NIL;
      entry_pred = csome_list_var.first();
      while ( NIL != csome_list_var)
      {
        if( NIL != lexicon_accessors.genl_pos_predP( entry_pred, term_phrases_constraint, mt ) )
        {
          return T;
        }
        csome_list_var = csome_list_var.rest();
        entry_pred = csome_list_var.first();
      }
      return NIL;
    }
    if( NIL != nl_trie.nl_trie_word_p( entry, UNPROVIDED ) && NIL != nl_trie.nl_trie_name_string_predP( term_phrases_constraint ) )
    {
      return NIL;
    }
    Errors.error( $str119$Don_t_know_how_to_check__S_agains, term_phrases_constraint, entry );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76481L)
  public static SubLObject nl_trie_rotations(final SubLObject string)
  {
    if( !string.isString() )
    {
      Errors.warn( $str123$tried_to_determine_rotations_for_, string );
      return NIL;
    }
    return string_utilities.string_rotations( string, $nl_trie_stoplist_trie$.getGlobalValue(), $nl_trie_rotate_characters$.getGlobalValue(), $nl_trie_rotate_point_string$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject nl_trie_index_item_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_nl_trie_index_item( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject nl_trie_index_item_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $nl_trie_index_item_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject nl_trie_index_item_term(final SubLObject v_object)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject nl_trie_index_item_phrase(final SubLObject v_object)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject nl_trie_index_item_mt(final SubLObject v_object)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject _csetf_nl_trie_index_item_term(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject _csetf_nl_trie_index_item_phrase(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject _csetf_nl_trie_index_item_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != nl_trie_index_item_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject make_nl_trie_index_item(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $nl_trie_index_item_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw139$TERM ) )
      {
        _csetf_nl_trie_index_item_term( v_new, current_value );
      }
      else if( pcase_var.eql( $kw140$PHRASE ) )
      {
        _csetf_nl_trie_index_item_phrase( v_new, current_value );
      }
      else if( pcase_var.eql( $kw141$MT ) )
      {
        _csetf_nl_trie_index_item_mt( v_new, current_value );
      }
      else
      {
        Errors.error( $str142$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject visit_defstruct_nl_trie_index_item(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw143$BEGIN, $sym144$MAKE_NL_TRIE_INDEX_ITEM, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw145$SLOT, $kw139$TERM, nl_trie_index_item_term( obj ) );
    Functions.funcall( visitor_fn, obj, $kw145$SLOT, $kw140$PHRASE, nl_trie_index_item_phrase( obj ) );
    Functions.funcall( visitor_fn, obj, $kw145$SLOT, $kw141$MT, nl_trie_index_item_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw146$END, $sym144$MAKE_NL_TRIE_INDEX_ITEM, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 76832L)
  public static SubLObject visit_defstruct_object_nl_trie_index_item_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_nl_trie_index_item( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 77427L)
  public static SubLObject new_nl_trie_index_item(final SubLObject v_term, final SubLObject phrase, final SubLObject mt)
  {
    final SubLObject new_item = make_nl_trie_index_item( UNPROVIDED );
    _csetf_nl_trie_index_item_term( new_item, v_term );
    _csetf_nl_trie_index_item_phrase( new_item, phrase );
    _csetf_nl_trie_index_item_mt( new_item, mt );
    return new_item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 77781L)
  public static SubLObject print_nl_trie_index_item(final SubLObject item, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str148$_NL_TRIE_INDEX_ITEM__s__s__a_, new SubLObject[] { nl_trie_index_item_term( item ), nl_trie_index_item_phrase( item ), nl_trie_index_item_mt( item )
    } );
    return item;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78029L)
  public static SubLObject extract_nl_trie_indexing_data(final SubLObject phrase, final SubLObject nl_trie_data)
  {
    SubLObject nl_trie_index_items = NIL;
    SubLObject cdolist_list_var = nl_trie_data;
    SubLObject nl_trie_entry = NIL;
    nl_trie_entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      nl_trie_index_items = Sequences.cconcatenate( nl_trie_index_items, extract_nl_trie_indexing_data_from_entry( phrase, nl_trie_entry ) );
      cdolist_list_var = cdolist_list_var.rest();
      nl_trie_entry = cdolist_list_var.first();
    }
    return nl_trie_index_items;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78427L)
  public static SubLObject extract_nl_trie_indexing_data_from_entry(final SubLObject phrase, final SubLObject nl_trie_entry)
  {
    SubLObject result = NIL;
    final SubLObject mt = nl_trie.nl_trie_entry_mt( nl_trie_entry );
    if( NIL != nl_trie.nl_trie_name_p( nl_trie_entry, T ) )
    {
      final SubLObject denot = nl_trie.nl_trie_name_denot( nl_trie_entry );
      result = ConsesLow.cons( new_nl_trie_index_item( denot, phrase, mt ), result );
    }
    else if( NIL != nl_trie.nl_trie_term_phrases_entry_p( nl_trie_entry, T ) )
    {
      final SubLObject denot = assertions_high.gaf_arg1( nl_trie_entry );
      result = ConsesLow.cons( new_nl_trie_index_item( denot, phrase, mt ), result );
    }
    else if( NIL != nl_trie.nl_trie_word_p( nl_trie_entry, UNPROVIDED ) )
    {
      final SubLObject pred = nl_trie.nl_trie_word_sem_pred( nl_trie_entry, NIL );
      final SubLObject denot_arg = ( NIL != kb_indexing_datastructures.indexed_term_p( pred ) ) ? lexicon_utilities.denotatum_arg_of_pred_cached( pred ) : NIL;
      if( denot_arg.isInteger() )
      {
        final SubLObject set_var = nl_trie.nl_trie_word_semantic_support_set( nl_trie_entry );
        final SubLObject set_contents_var = set.do_set_internal( set_var );
        SubLObject basis_object;
        SubLObject state;
        SubLObject semantic_support;
        SubLObject cdolist_list_var;
        SubLObject denot2;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          semantic_support = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, semantic_support ) )
          {
            cdolist_list_var = nl_trie.nl_trie_word_semantic_support_denots( semantic_support, denot_arg );
            denot2 = NIL;
            denot2 = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              result = ConsesLow.cons( new_nl_trie_index_item( denot2, phrase, mt ), result );
              cdolist_list_var = cdolist_list_var.rest();
              denot2 = cdolist_list_var.first();
            }
          }
        }
      }
    }
    else if( NIL != abstract_lexicon.lex_entry_p( nl_trie_entry ) )
    {
      SubLObject cdolist_list_var2 = nl_trie.nl_trie_lex_entry_get( nl_trie_entry, $kw149$DENOTS );
      SubLObject denot3 = NIL;
      denot3 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        result = ConsesLow.cons( new_nl_trie_index_item( denot3, phrase, mt ), result );
        cdolist_list_var2 = cdolist_list_var2.rest();
        denot3 = cdolist_list_var2.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78698L)
  public static SubLObject force_nl_trie_rotation_index_initialization(SubLObject max_num)
  {
    if( max_num == UNPROVIDED )
    {
      max_num = NIL;
    }
    $nl_trie_rotation_index$.setGlobalValue( NIL );
    return initialize_nl_trie_rotation_index( max_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 78871L)
  public static SubLObject initialize_nl_trie_rotation_index(SubLObject max_num)
  {
    if( max_num == UNPROVIDED )
    {
      max_num = NIL;
    }
    if( NIL == nl_trie_rotation_index_initializedP() )
    {
      $nl_trie_stoplist_trie$.setGlobalValue( tries.create_trie( T, $str150$nl_trie_rotation_stop_list, T, Symbols.symbol_function( EQL ) ) );
      SubLObject cdolist_list_var = lexicon_accessors.closed_lexical_class_strings( UNPROVIDED );
      SubLObject word = NIL;
      word = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        tries.trie_insert( $nl_trie_stoplist_trie$.getGlobalValue(), word, word, UNPROVIDED, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        word = cdolist_list_var.first();
      }
      $nl_trie_rotation_index$.setGlobalValue( create_nl_trie_rotation_index( max_num, UNPROVIDED ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 79590L)
  public static SubLObject nl_trie_rotation_index_initializedP()
  {
    return makeBoolean( NIL != tries.trie_p( $nl_trie_rotation_index$.getGlobalValue() ) && tries.trie_count( $nl_trie_rotation_index$.getGlobalValue() ).numG( ZERO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 79821L)
  public static SubLObject nl_trie_rotation_index_initialization_practical_p()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 80015L)
  public static SubLObject create_nl_trie_rotation_index(SubLObject max_num, SubLObject v_nl_trie)
  {
    if( max_num == UNPROVIDED )
    {
      max_num = NIL;
    }
    if( v_nl_trie == UNPROVIDED )
    {
      v_nl_trie = nl_trie.get_nl_trie();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject trie_index = tries.create_trie( NIL, $str151$nl_trie_rotation_index, T, Symbols.symbol_function( EQUALP ) );
    final SubLObject max_count = ( NIL != max_num ) ? max_num : nl_trie.nl_trie_size( v_nl_trie );
    final SubLObject gc_every = Numbers.integerDivide( max_count, TEN_INTEGER );
    SubLObject count = ZERO_INTEGER;
    SubLObject stop = NIL;
    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, SIX_INTEGER ), thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
        final SubLObject _prev_bind_0_$50 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
        final SubLObject _prev_bind_1_$51 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding( thread );
        try
        {
          file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
          file_vector_utilities.$current_backed_map_cache_strategy$.bind( nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread );
          final SubLObject stack = stacks.create_stack();
          final SubLObject the_map = nl_trie.get_nl_trie();
          final SubLObject mess = $str152$Creating_NL_trie_rotation_index__;
          SubLObject sofar = ZERO_INTEGER;
          final SubLObject total = map_utilities.map_size( the_map );
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$51 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$52 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_2_$54 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject iterator = map_utilities.new_map_iterator( the_map );
              SubLObject valid;
              for( SubLObject done_var = stop; NIL == done_var; done_var = makeBoolean( NIL == valid || NIL != stop ) )
              {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next( iterator );
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if( NIL != valid )
                {
                  SubLObject current;
                  final SubLObject datum = current = var;
                  SubLObject strie_dict_key = NIL;
                  SubLObject strie_dict_value = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
                  strie_dict_key = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
                  strie_dict_value = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    utilities_macros.note_percent_progress( sofar, total );
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    if( NIL != map_utilities.map_p( strie_dict_value ) )
                    {
                      stacks.stack_push( strie_dict_value, stack );
                      while ( NIL == stop && NIL == stacks.stack_empty_p( stack ))
                      {
                        final SubLObject entry = stacks.stack_pop( stack );
                        final SubLObject iterator_$55 = map_utilities.new_map_iterator( entry );
                        SubLObject valid_$58;
                        for( SubLObject done_var_$56 = stop; NIL == done_var_$56; done_var_$56 = makeBoolean( NIL == valid_$58 || NIL != stop ) )
                        {
                          thread.resetMultipleValues();
                          final SubLObject var_$57 = iteration.iteration_next( iterator_$55 );
                          valid_$58 = thread.secondMultipleValue();
                          thread.resetMultipleValues();
                          if( NIL != valid_$58 )
                          {
                            SubLObject current_$60;
                            final SubLObject datum_$59 = current_$60 = var_$57;
                            SubLObject dict_key = NIL;
                            SubLObject dict_value = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp( current_$60, datum_$59, $list154 );
                            dict_key = current_$60.first();
                            current_$60 = current_$60.rest();
                            cdestructuring_bind.destructuring_bind_must_consp( current_$60, datum_$59, $list154 );
                            dict_value = current_$60.first();
                            current_$60 = current_$60.rest();
                            if( NIL == current_$60 )
                            {
                              if( NIL != map_utilities.map_p( dict_value ) )
                              {
                                stacks.stack_push( dict_value, stack );
                              }
                              else if( dict_value.isCons() )
                              {
                                final SubLObject nl_trie_key = dict_value.first();
                                final SubLObject nl_trie_data = dict_value.rest();
                                update_nl_trie_rotation_index( nl_trie_data, NIL, trie_index );
                                count = Numbers.add( count, ONE_INTEGER );
                                stop = Numbers.numGE( count, max_count );
                              }
                            }
                            else
                            {
                              cdestructuring_bind.cdestructuring_bind_error( datum_$59, $list154 );
                            }
                          }
                        }
                      }
                    }
                    else if( strie_dict_value.isCons() )
                    {
                      final SubLObject nl_trie_key2 = strie_dict_value.first();
                      final SubLObject nl_trie_data2 = strie_dict_value.rest();
                      update_nl_trie_rotation_index( nl_trie_data2, NIL, trie_index );
                      count = Numbers.add( count, ONE_INTEGER );
                      stop = Numbers.numGE( count, max_count );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$54, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$52, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$51, thread );
          }
        }
        finally
        {
          file_vector_utilities.$current_backed_map_cache_strategy$.rebind( _prev_bind_1_$51, thread );
          file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$50, thread );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_3, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_2, thread );
      sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0, thread );
    }
    return trie_index;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 80857L)
  public static SubLObject update_nl_trie_rotation_index(final SubLObject nl_trie_data, SubLObject removeP, SubLObject trie_index)
  {
    if( removeP == UNPROVIDED )
    {
      removeP = NIL;
    }
    if( trie_index == UNPROVIDED )
    {
      trie_index = $nl_trie_rotation_index$.getGlobalValue();
    }
    if( NIL != tries.trie_p( trie_index ) )
    {
      SubLObject cdolist_list_var = nl_trie_data;
      SubLObject trie_entry = NIL;
      trie_entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == nl_trie_inappropriate_entryP( trie_entry, UNPROVIDED ) )
        {
          final SubLObject phrase = nl_trie.nl_trie_entry_string( trie_entry );
          final SubLObject rotations = nl_trie_rotations( phrase );
          final SubLObject update_fn = ( NIL != removeP ) ? Symbols.symbol_function( $sym155$TRIE_REMOVE ) : Symbols.symbol_function( $sym156$TRIE_INSERT );
          final SubLObject filtered_nl_trie_data = extract_nl_trie_indexing_data_from_entry( phrase, trie_entry );
          SubLObject cdolist_list_var_$62 = ConsesLow.cons( phrase, rotations );
          SubLObject variant = NIL;
          variant = cdolist_list_var_$62.first();
          while ( NIL != cdolist_list_var_$62)
          {
            SubLObject cdolist_list_var_$63 = filtered_nl_trie_data;
            SubLObject index_item = NIL;
            index_item = cdolist_list_var_$63.first();
            while ( NIL != cdolist_list_var_$63)
            {
              Functions.funcall( update_fn, trie_index, lexification_utilities.join_words( nl_trie.nl_trie_string_tokenize( variant ) ), index_item );
              cdolist_list_var_$63 = cdolist_list_var_$63.rest();
              index_item = cdolist_list_var_$63.first();
            }
            cdolist_list_var_$62 = cdolist_list_var_$62.rest();
            variant = cdolist_list_var_$62.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        trie_entry = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 81770L)
  public static SubLObject nl_trie_matching_phrases(final SubLObject pattern, final SubLObject search_type)
  {
    if( search_type.eql( $kw157$INFIX ) )
    {
      return nl_trie_matching_phrases_inverted_index( pattern );
    }
    return nl_trie_matching_phrases_substring( pattern, search_type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 82010L)
  public static SubLObject nl_trie_matching_phrases_substring(final SubLObject pattern, final SubLObject search_type)
  {
    if( NIL != string_utilities.non_empty_stringP( pattern ) && NIL != tries.trie_p( $nl_trie_rotation_index$.getGlobalValue() ) )
    {
      final SubLObject standardized_pattern = lexification_utilities.join_words( nl_trie.nl_trie_string_tokenize( pattern ) );
      final SubLObject index_entries = tries.trie_prefix( $nl_trie_rotation_index$.getGlobalValue(), standardized_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject comparison_function = ( search_type == $kw158$PREFIX ) ? Symbols.symbol_function( $sym159$STARTS_WITH ) : ( ( search_type == $kw160$SUFFIX ) ? Symbols.symbol_function( $sym161$ENDS_WITH ) : NIL );
      SubLObject result = index_entries;
      if( search_type != $kw157$INFIX )
      {
        result = NIL;
        SubLObject cdolist_list_var = Sequences.remove_duplicates( index_entries, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject index_entry = NIL;
        index_entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != Functions.funcall( comparison_function, nl_trie_index_item_phrase( index_entry ), pattern ) )
          {
            result = ConsesLow.cons( index_entry, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          index_entry = cdolist_list_var.first();
        }
      }
      result = Sort.sort( result, Symbols.symbol_function( $sym162$STRING_ ), Symbols.symbol_function( $sym135$NL_TRIE_INDEX_ITEM_PHRASE ) );
      result = Sort.stable_sort( result, Symbols.symbol_function( $sym163$LESSER_LENGTH_P ), Symbols.symbol_function( $sym135$NL_TRIE_INDEX_ITEM_PHRASE ) );
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 83208L)
  public static SubLObject nl_trie_matching_phrases_inverted_index(final SubLObject input_string)
  {
    final SubLObject search_strings = nl_trie_search_strings_from_pattern( input_string );
    final SubLObject dict_vector = Vectors.make_vector( Sequences.length( search_strings ), UNPROVIDED );
    SubLObject list_var = NIL;
    SubLObject search_string = NIL;
    SubLObject num = NIL;
    list_var = search_strings;
    search_string = list_var.first();
    for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), search_string = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      Vectors.set_aref( dict_vector, num, dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
      final SubLObject dict = Vectors.aref( dict_vector, num );
      SubLObject cdolist_list_var;
      final SubLObject matches = cdolist_list_var = nl_trie_matching_phrases_substring( search_string, $kw157$INFIX );
      SubLObject match = NIL;
      match = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        dictionary_utilities.dictionary_push( dict, nl_trie_index_item_term( match ), match );
        cdolist_list_var = cdolist_list_var.rest();
        match = cdolist_list_var.first();
      }
    }
    return nl_trie_matches_from_dictionary( dict_vector, search_strings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 84634L)
  public static SubLObject nl_trie_matches_from_dictionary(final SubLObject dict_vector, final SubLObject search_terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject search_string_count = Sequences.length( search_terms );
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( Vectors.aref( dict_vector, ZERO_INTEGER ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject matches = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject failP = NIL;
      SubLObject cdotimes_end_var;
      SubLObject n;
      for( cdotimes_end_var = Numbers.subtract( Sequences.length( dict_vector ), ONE_INTEGER ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
      {
        if( NIL == dictionary.dictionary_lookup_without_values( Vectors.aref( dict_vector, number_utilities.f_1X( n ) ), v_term, UNPROVIDED ) )
        {
          failP = T;
        }
      }
      if( NIL == failP )
      {
        SubLObject cdolist_list_var = matches;
        SubLObject match = NIL;
        match = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( search_string_count.eql( ONE_INTEGER ) || NIL != string_utilities.substring_every_in_list( search_terms, nl_trie_index_item_phrase( match ), UNPROVIDED ) )
          {
            result = ConsesLow.cons( match, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          match = cdolist_list_var.first();
        }
      }
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 85318L)
  public static SubLObject nl_trie_search_strings_from_pattern(final SubLObject pattern)
  {
    return ConsesLow.list( lexification_utilities.join_words( nl_trie.nl_trie_string_tokenize( pattern ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 85609L)
  public static SubLObject dump_nl_trie_spellchecker_strings(SubLObject stream, SubLObject omit_duplicatesP, SubLObject duplicate_test, SubLObject separator_char)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( omit_duplicatesP == UNPROVIDED )
    {
      omit_duplicatesP = T;
    }
    if( duplicate_test == UNPROVIDED )
    {
      duplicate_test = Symbols.symbol_function( EQUALP );
    }
    if( separator_char == UNPROVIDED )
    {
      separator_char = Characters.CHAR_newline;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == nl_trie.nl_trie_presentP( UNPROVIDED ) )
    {
      Errors.error( $str164$The_NL_Trie_must_be_initialized_b );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
      try
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
        final SubLObject done_strings = ( NIL != omit_duplicatesP ) ? set.new_set( duplicate_test, UNPROVIDED ) : NIL;
        final SubLObject break_chars = Sequences.delete_duplicates( ConsesLow.cons( Characters.CHAR_period, conses_high.union( string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars(),
            UNPROVIDED, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject release_$64 = NIL;
        try
        {
          release_$64 = Locks.seize_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
          final SubLObject _prev_bind_0_$65 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding( thread );
          final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding( thread );
          try
          {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind( nl_trie.$nl_trie_lock$.getGlobalValue(), thread );
            file_vector_utilities.$current_backed_map_cache_strategy$.bind( nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread );
            final SubLObject stack = stacks.create_stack();
            final SubLObject the_map = nl_trie.get_nl_trie();
            final SubLObject mess = $str165$Dumping_NL_Trie_spellchecker_stri;
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject total = map_utilities.map_size( the_map );
            assert NIL != Types.stringp( mess ) : mess;
            final SubLObject _prev_bind_0_$66 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
            final SubLObject _prev_bind_1_$67 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
            try
            {
              utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
              utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
              utilities_macros.$within_noting_percent_progress$.bind( T, thread );
              utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
              try
              {
                utilities_macros.noting_percent_progress_preamble( mess );
                final SubLObject iterator = map_utilities.new_map_iterator( the_map );
                SubLObject valid;
                for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject var = iteration.iteration_next( iterator );
                  valid = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != valid )
                  {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject strie_dict_key = NIL;
                    SubLObject strie_dict_value = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
                    strie_dict_key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
                    strie_dict_value = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      utilities_macros.note_percent_progress( sofar, total );
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      if( NIL != map_utilities.map_p( strie_dict_value ) )
                      {
                        stacks.stack_push( strie_dict_value, stack );
                        while ( NIL == stacks.stack_empty_p( stack ))
                        {
                          final SubLObject entry = stacks.stack_pop( stack );
                          final SubLObject iterator_$68 = map_utilities.new_map_iterator( entry );
                          SubLObject valid_$71;
                          for( SubLObject done_var_$69 = NIL; NIL == done_var_$69; done_var_$69 = makeBoolean( NIL == valid_$71 ) )
                          {
                            thread.resetMultipleValues();
                            final SubLObject var_$70 = iteration.iteration_next( iterator_$68 );
                            valid_$71 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if( NIL != valid_$71 )
                            {
                              SubLObject current_$73;
                              final SubLObject datum_$72 = current_$73 = var_$70;
                              SubLObject dict_key = NIL;
                              SubLObject dict_value = NIL;
                              cdestructuring_bind.destructuring_bind_must_consp( current_$73, datum_$72, $list154 );
                              dict_key = current_$73.first();
                              current_$73 = current_$73.rest();
                              cdestructuring_bind.destructuring_bind_must_consp( current_$73, datum_$72, $list154 );
                              dict_value = current_$73.first();
                              current_$73 = current_$73.rest();
                              if( NIL == current_$73 )
                              {
                                if( NIL != map_utilities.map_p( dict_value ) )
                                {
                                  stacks.stack_push( dict_value, stack );
                                }
                                else if( dict_value.isCons() )
                                {
                                  final SubLObject key = dict_value.first();
                                  SubLObject cdolist_list_var;
                                  final SubLObject entries = cdolist_list_var = dict_value.rest();
                                  SubLObject entry_$74 = NIL;
                                  entry_$74 = cdolist_list_var.first();
                                  while ( NIL != cdolist_list_var)
                                  {
                                    SubLObject cdolist_list_var_$75 = string_utilities.string_tokenize( nl_trie.nl_trie_entry_string( entry_$74 ), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
                                        UNPROVIDED );
                                    SubLObject string = NIL;
                                    string = cdolist_list_var_$75.first();
                                    while ( NIL != cdolist_list_var_$75)
                                    {
                                      if( NIL == omit_duplicatesP || NIL == set.set_memberP( string, done_strings ) )
                                      {
                                        print_high.princ( string, stream );
                                        print_high.princ( separator_char, stream );
                                        if( NIL != omit_duplicatesP )
                                        {
                                          set.set_add( string, done_strings );
                                        }
                                      }
                                      cdolist_list_var_$75 = cdolist_list_var_$75.rest();
                                      string = cdolist_list_var_$75.first();
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    entry_$74 = cdolist_list_var.first();
                                  }
                                }
                              }
                              else
                              {
                                cdestructuring_bind.cdestructuring_bind_error( datum_$72, $list154 );
                              }
                            }
                          }
                        }
                      }
                      else if( strie_dict_value.isCons() )
                      {
                        final SubLObject key2 = strie_dict_value.first();
                        SubLObject cdolist_list_var2;
                        final SubLObject entries2 = cdolist_list_var2 = strie_dict_value.rest();
                        SubLObject entry2 = NIL;
                        entry2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          SubLObject cdolist_list_var_$76 = string_utilities.string_tokenize( nl_trie.nl_trie_entry_string( entry2 ), break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          SubLObject string2 = NIL;
                          string2 = cdolist_list_var_$76.first();
                          while ( NIL != cdolist_list_var_$76)
                          {
                            if( NIL == omit_duplicatesP || NIL == set.set_memberP( string2, done_strings ) )
                            {
                              print_high.princ( string2, stream );
                              print_high.princ( separator_char, stream );
                              if( NIL != omit_duplicatesP )
                              {
                                set.set_add( string2, done_strings );
                              }
                            }
                            cdolist_list_var_$76 = cdolist_list_var_$76.rest();
                            string2 = cdolist_list_var_$76.first();
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          entry2 = cdolist_list_var2.first();
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
                    }
                  }
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  utilities_macros.noting_percent_progress_postamble();
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$67, thread );
                }
              }
            }
            finally
            {
              utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
              utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
              utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$67, thread );
              utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$66, thread );
            }
          }
          finally
          {
            file_vector_utilities.$current_backed_map_cache_strategy$.rebind( _prev_bind_2, thread );
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0_$65, thread );
          }
        }
        finally
        {
          if( NIL != release_$64 )
          {
            Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
          }
        }
      }
      finally
      {
        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind( _prev_bind_0, thread );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( nl_trie.$nl_trie_lock$.getGlobalValue() );
      }
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 86886L)
  public static SubLObject stress_test_nl_trie_search_concurrent_swapping(SubLObject checker_count, SubLObject string_count)
  {
    if( checker_count == UNPROVIDED )
    {
      checker_count = $default_number_of_concurrent_test_threads$.getGlobalValue();
    }
    if( string_count == UNPROVIDED )
    {
      string_count = $default_string_test_count$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_queue = process_utilities.new_ipc_queue( $str167$Concurrent_NL_Trie_Search_Stress_ );
    SubLObject checkers = NIL;
    SubLObject issue_list = NIL;
    SubLObject strings = NIL;
    file_vector_utilities.swap_out_all_pristine_backed_map_objects( nl_trie.get_nl_trie() );
    Storage.gc( UNPROVIDED );
    final SubLObject index = ZERO_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject pred_var = $const168$nameString;
    if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
    {
      final SubLObject str = NIL;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
        SubLObject done_var = doneP;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            utilities_macros.note_progress();
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw169$GAF, NIL, NIL );
              SubLObject done_var_$78 = doneP;
              final SubLObject token_var_$79 = NIL;
              while ( NIL == done_var_$78)
              {
                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$79 );
                final SubLObject valid_$80 = makeBoolean( !token_var_$79.eql( v_assert ) );
                if( NIL != valid_$80 )
                {
                  strings = ConsesLow.cons( cycl_utilities.formula_arg2( v_assert, UNPROVIDED ), strings );
                  if( index.numG( Numbers.multiply( string_count, checker_count ) ) )
                  {
                    doneP = T;
                  }
                }
                done_var_$78 = makeBoolean( NIL == valid_$80 || NIL != doneP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$81 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$81, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != doneP );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject i;
    SubLObject name;
    SubLObject checker;
    for( i = NIL, i = ZERO_INTEGER; i.numL( checker_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str170$Concurrent_NL_Trie_Searches_, format_nil.format_nil_a_no_copy( Numbers.add( ONE_INTEGER, i ) ) );
      checker = subl_promotions.make_process_with_args( name, $sym171$STRESS_TEST_NL_TRIE_SEARCH, ConsesLow.list( Sequences.subseq( strings, Numbers.multiply( i, string_count ), Numbers.multiply( Numbers.add(
          ONE_INTEGER, i ), string_count ) ), problem_queue, name ) );
      checkers = ConsesLow.cons( checker, checkers );
    }
    while ( Sequences.position_if( $sym172$VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isNumber())
    {
      Threads.sleep( ONE_INTEGER );
    }
    while ( process_utilities.ipc_current_queue_size( problem_queue ).isPositive())
    {
      issue_list = ConsesLow.cons( process_utilities.ipc_dequeue( problem_queue, UNPROVIDED ), issue_list );
    }
    if( NIL != list_utilities.sublisp_boolean( issue_list ) )
    {
      file_vector_utilities.swap_out_all_pristine_backed_map_objects( nl_trie.get_nl_trie() );
    }
    return issue_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 88571L)
  public static SubLObject stress_test_nl_trie_search(final SubLObject strings, final SubLObject problem_queue, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym173$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            nl_trie.nl_trie_search( string, UNPROVIDED, UNPROVIDED );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( error_message.isString() )
      {
        process_utilities.ipc_enqueue( ConsesLow.cons( string, error_message ), problem_queue, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return $kw4$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 88896L)
  public static SubLObject stress_test_nl_trie_prefixes_concurrent_swapping(SubLObject checker_count, SubLObject string_count)
  {
    if( checker_count == UNPROVIDED )
    {
      checker_count = $default_number_of_concurrent_test_threads$.getGlobalValue();
    }
    if( string_count == UNPROVIDED )
    {
      string_count = $default_string_test_count$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject problem_queue = process_utilities.new_ipc_queue( $str174$Concurrent_NL_Trie_Prefixes_Stres );
    SubLObject checkers = NIL;
    SubLObject issue_list = NIL;
    SubLObject strings = NIL;
    file_vector_utilities.swap_out_all_pristine_backed_map_objects( nl_trie.get_nl_trie() );
    Storage.gc( UNPROVIDED );
    final SubLObject index = ZERO_INTEGER;
    SubLObject doneP = NIL;
    final SubLObject pred_var = $const168$nameString;
    if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
    {
      final SubLObject str = NIL;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
        SubLObject done_var = doneP;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            utilities_macros.note_progress();
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw169$GAF, NIL, NIL );
              SubLObject done_var_$82 = doneP;
              final SubLObject token_var_$83 = NIL;
              while ( NIL == done_var_$82)
              {
                final SubLObject v_assert = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$83 );
                final SubLObject valid_$84 = makeBoolean( !token_var_$83.eql( v_assert ) );
                if( NIL != valid_$84 )
                {
                  strings = ConsesLow.cons( cycl_utilities.formula_arg2( v_assert, UNPROVIDED ), strings );
                  if( index.numG( Numbers.multiply( string_count, checker_count ) ) )
                  {
                    doneP = T;
                  }
                }
                done_var_$82 = makeBoolean( NIL == valid_$84 || NIL != doneP );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != doneP );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject i;
    SubLObject name;
    SubLObject checker;
    for( i = NIL, i = ZERO_INTEGER; i.numL( checker_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str175$Concurrent_NL_Trie_Prefixes_, format_nil.format_nil_a_no_copy( Numbers.add( ONE_INTEGER, i ) ) );
      checker = subl_promotions.make_process_with_args( name, $sym176$STRESS_TEST_NL_TRIE_PREFIXES, ConsesLow.list( Sequences.subseq( strings, Numbers.multiply( i, string_count ), Numbers.multiply( Numbers.add(
          ONE_INTEGER, i ), string_count ) ), problem_queue, name ) );
      checkers = ConsesLow.cons( checker, checkers );
    }
    while ( Sequences.position_if( $sym172$VALID_PROCESS_P, checkers, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isNumber())
    {
      Threads.sleep( ONE_INTEGER );
    }
    while ( process_utilities.ipc_current_queue_size( problem_queue ).isPositive())
    {
      issue_list = ConsesLow.cons( process_utilities.ipc_dequeue( problem_queue, UNPROVIDED ), issue_list );
    }
    if( NIL != list_utilities.sublisp_boolean( issue_list ) )
    {
      file_vector_utilities.swap_out_all_pristine_backed_map_objects( nl_trie.get_nl_trie() );
    }
    return issue_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-trie-accessors.lisp", position = 90586L)
  public static SubLObject stress_test_nl_trie_prefixes(final SubLObject strings, final SubLObject problem_queue, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject error_message = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym173$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            nl_trie_prefixes( nl_trie.get_nl_trie(), nl_trie.nl_trie_string_tokenize( string ), UNPROVIDED );
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( error_message.isString() )
      {
        process_utilities.ipc_enqueue( ConsesLow.cons( string, error_message ), problem_queue, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return $kw4$DONE;
  }

  public static SubLObject declare_nl_trie_accessors_file()
  {
    SubLFiles.declareMacro( me, "do_nl_trie_entries", "DO-NL-TRIE-ENTRIES" );
    SubLFiles.declareMacro( me, "do_nl_trie_entries_for_string", "DO-NL-TRIE-ENTRIES-FOR-STRING" );
    SubLFiles.declareMacro( me, "do_nl_trie_word_entries_for_string", "DO-NL-TRIE-WORD-ENTRIES-FOR-STRING" );
    SubLFiles.declareMacro( me, "do_nl_trie_name_entries_for_string", "DO-NL-TRIE-NAME-ENTRIES-FOR-STRING" );
    SubLFiles.declareMacro( me, "incorporate_new_entry", "INCORPORATE-NEW-ENTRY" );
    SubLFiles.declareMacro( me, "incorporate_new_denots_and_preds", "INCORPORATE-NEW-DENOTS-AND-PREDS" );
    SubLFiles.declareFunction( me, "nl_trie_string_is_posP_internal", "NL-TRIE-STRING-IS-POS?-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "nl_trie_string_is_posP", "NL-TRIE-STRING-IS-POS?", 2, 2, false );
    SubLFiles.declareFunction( me, "nl_trie_words_of_string", "NL-TRIE-WORDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_words_of_stringXpred", "NL-TRIE-WORDS-OF-STRING&PRED", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_words_of_stringXpos", "NL-TRIE-WORDS-OF-STRING&POS", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_words_of_stringXspeech_part", "NL-TRIE-WORDS-OF-STRING&SPEECH-PART", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_preds_of_stringXword", "NL-TRIE-PREDS-OF-STRING&WORD", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_preds_of_string", "NL-TRIE-PREDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_namestring_preds_of_string", "NL-TRIE-NAMESTRING-PREDS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_pos_of_string", "NL-TRIE-POS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_pos_of_stringXword", "NL-TRIE-POS-OF-STRING&WORD", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_all_denots_of_string", "NL-TRIE-ALL-DENOTS-OF-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_string", "NL-TRIE-DENOTS-OF-STRING", 1, 6, false );
    SubLFiles.declareFunction( me, "general_nl_trie_denots_of_string", "GENERAL-NL-TRIE-DENOTS-OF-STRING", 3, 5, false );
    SubLFiles.declareFunction( me, "general_nl_trie_denots_of_string_int", "GENERAL-NL-TRIE-DENOTS-OF-STRING-INT", 8, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_denotation_mapper", "NL-TRIE-DENOTATION-MAPPER", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_stringXpos", "NL-TRIE-DENOTS-OF-STRING&POS", 2, 5, false );
    SubLFiles.declareFunction( me, "nl_trie_dps_of_string", "NL-TRIE-DPS-OF-STRING", 1, 6, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_stringXspeech_part", "NL-TRIE-DENOTS-OF-STRING&SPEECH-PART", 2, 5, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_stringXpred", "NL-TRIE-DENOTS-OF-STRING&PRED", 2, 5, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_name_string", "NL-TRIE-DENOTS-OF-NAME-STRING", 1, 4, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_name_string_internal", "NL-TRIE-DENOTS-OF-NAME-STRING-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "starts_with_theP", "STARTS-WITH-THE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_acronym_string", "NL-TRIE-DENOTS-OF-ACRONYM-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_abbreviation_string", "NL-TRIE-DENOTS-OF-ABBREVIATION-STRING", 1, 3, false );
    SubLFiles.declareFunction( me, "reinitialize_nl_trie_for_string", "REINITIALIZE-NL-TRIE-FOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_semtrans_templates_of_string", "NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING", 1, 5, false );
    SubLFiles.declareFunction( me, "nl_trie_names_from_spelling", "NL-TRIE-NAMES-FROM-SPELLING", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_names_from_nickname", "NL-TRIE-NAMES-FROM-NICKNAME", 1, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_denots_of_string_and_namestring_pred", "NL-TRIE-DENOTS-OF-STRING-AND-NAMESTRING-PRED", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_assertions_with_string_and_namestring_pred", "NL-TRIE-ASSERTIONS-WITH-STRING-AND-NAMESTRING-PRED", 2, 3, false );
    SubLFiles.declareFunction( me, "nl_trie_regular_formP", "NL-TRIE-REGULAR-FORM?", 2, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_word_pred_and_supports_for_pred", "NL-TRIE-WORD-PRED-AND-SUPPORTS-FOR-PRED", 2, 1, false );
    SubLFiles.declareFunction( me, "add_new_entry", "ADD-NEW-ENTRY", 3, 4, false );
    SubLFiles.declareFunction( me, "nl_trie_entry_name_pred_or_syntactic_preds", "NL-TRIE-ENTRY-NAME-PRED-OR-SYNTACTIC-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_new_denots_and_preds", "ADD-NEW-DENOTS-AND-PREDS", 4, 0, false );
    SubLFiles.declareFunction( me, "pred_type_okP", "PRED-TYPE-OK?", 4, 0, false );
    SubLFiles.declareFunction( me, "abbrev_const_satisfiedP", "ABBREV-CONST-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "denot_const_satisfiedP", "DENOT-CONST-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "namestring_const_satisfiedP", "NAMESTRING-CONST-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_sentence_tokenize", "NL-TRIE-SENTENCE-TOKENIZE", 1, 5, false );
    SubLFiles.declareFunction( me, "nl_trie_filter_tokens_for_case", "NL-TRIE-FILTER-TOKENS-FOR-CASE", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_remove_inappropriate_tokens", "NL-TRIE-REMOVE-INAPPROPRIATE-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_repair_token_indexes", "NL-TRIE-REPAIR-TOKEN-INDEXES", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_prefix_keys_from_string", "NL-TRIE-PREFIX-KEYS-FROM-STRING", 2, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_prefixes", "NL-TRIE-PREFIXES", 2, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_prefixes_memoized_internal", "NL-TRIE-PREFIXES-MEMOIZED-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_prefixes_memoized", "NL-TRIE-PREFIXES-MEMOIZED", 3, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_filter_unquoted_entries", "NL-TRIE-FILTER-UNQUOTED-ENTRIES", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_unquoted_entry_okP", "NL-TRIE-UNQUOTED-ENTRY-OK?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_access_case_sensitive_p", "NL-TRIE-ACCESS-CASE-SENSITIVE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_prefix_key_jibes_with_alterationsP", "NL-TRIE-PREFIX-KEY-JIBES-WITH-ALTERATIONS?", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_find_original_prefix_key", "NL-TRIE-FIND-ORIGINAL-PREFIX-KEY", 3, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_unknown_strings", "NL-TRIE-UNKNOWN-STRINGS", 2, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_unknown_string_tokens", "NL-TRIE-UNKNOWN-STRING-TOKENS", 1, 2, false );
    SubLFiles.declareFunction( me, "index_covered_by_token_p", "INDEX-COVERED-BY-TOKEN-P", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_token_has_meaning_p", "NL-TRIE-TOKEN-HAS-MEANING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "spelling_const_satisfiedP", "SPELLING-CONST-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "contains_periodP", "CONTAINS-PERIOD?", 1, 0, false );
    SubLFiles.declareFunction( me, "period_const_satisfiedP", "PERIOD-CONST-SATISFIED?", 3, 0, false );
    SubLFiles.declareFunction( me, "pos_pred_const_satisfiedP", "POS-PRED-CONST-SATISFIED?", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_record_filter_mt", "NL-TRIE-RECORD-FILTER-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "gated_nl_trie_search", "GATED-NL-TRIE-SEARCH", 1, 2, false );
    SubLFiles.declareFunction( me, "nl_trie_filter_pragmatics", "NL-TRIE-FILTER-PRAGMATICS", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_remove_inappropriate_entries", "NL-TRIE-REMOVE-INAPPROPRIATE-ENTRIES", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_inappropriate_entryP", "NL-TRIE-INAPPROPRIATE-ENTRY?", 1, 1, false );
    new $nl_trie_inappropriate_entryP$UnaryFunction();
    new $nl_trie_inappropriate_entryP$BinaryFunction();
    SubLFiles.declareFunction( me, "nl_trie_entry_mt_okP", "NL-TRIE-ENTRY-MT-OK?", 1, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_string_to_use", "NL-TRIE-STRING-TO-USE", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_match_string", "NL-TRIE-MATCH-STRING", 2, 0, false );
    SubLFiles.declareMacro( me, "do_supporting_trie_words", "DO-SUPPORTING-TRIE-WORDS" );
    SubLFiles.declareFunction( me, "matching_word_strings_entryP", "MATCHING-WORD-STRINGS-ENTRY?", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_hl_justify_word_strings", "NL-TRIE-HL-JUSTIFY-WORD-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_hl_forward_mt_combos_word_strings", "NL-TRIE-HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_get_term_phrases_supports", "NL-TRIE-GET-TERM-PHRASES-SUPPORTS", 5, 0, false );
    SubLFiles.declareFunction( me, "add_nl_trie_supports", "ADD-NL-TRIE-SUPPORTS", 5, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_entry_matches_term_phrases_constraintP", "NL-TRIE-ENTRY-MATCHES-TERM-PHRASES-CONSTRAINT?", 3, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_rotations", "NL-TRIE-ROTATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_index_item_print_function_trampoline", "NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_index_item_p", "NL-TRIE-INDEX-ITEM-P", 1, 0, false );
    new $nl_trie_index_item_p$UnaryFunction();
    SubLFiles.declareFunction( me, "nl_trie_index_item_term", "NL-TRIE-INDEX-ITEM-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_index_item_phrase", "NL-TRIE-INDEX-ITEM-PHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_index_item_mt", "NL-TRIE-INDEX-ITEM-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nl_trie_index_item_term", "_CSETF-NL-TRIE-INDEX-ITEM-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nl_trie_index_item_phrase", "_CSETF-NL-TRIE-INDEX-ITEM-PHRASE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_nl_trie_index_item_mt", "_CSETF-NL-TRIE-INDEX-ITEM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_nl_trie_index_item", "MAKE-NL-TRIE-INDEX-ITEM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_nl_trie_index_item", "VISIT-DEFSTRUCT-NL-TRIE-INDEX-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_nl_trie_index_item_method", "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_nl_trie_index_item", "NEW-NL-TRIE-INDEX-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "print_nl_trie_index_item", "PRINT-NL-TRIE-INDEX-ITEM", 3, 0, false );
    SubLFiles.declareFunction( me, "extract_nl_trie_indexing_data", "EXTRACT-NL-TRIE-INDEXING-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "extract_nl_trie_indexing_data_from_entry", "EXTRACT-NL-TRIE-INDEXING-DATA-FROM-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "force_nl_trie_rotation_index_initialization", "FORCE-NL-TRIE-ROTATION-INDEX-INITIALIZATION", 0, 1, false );
    SubLFiles.declareFunction( me, "initialize_nl_trie_rotation_index", "INITIALIZE-NL-TRIE-ROTATION-INDEX", 0, 1, false );
    SubLFiles.declareFunction( me, "nl_trie_rotation_index_initializedP", "NL-TRIE-ROTATION-INDEX-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_rotation_index_initialization_practical_p", "NL-TRIE-ROTATION-INDEX-INITIALIZATION-PRACTICAL-P", 0, 0, false );
    SubLFiles.declareFunction( me, "create_nl_trie_rotation_index", "CREATE-NL-TRIE-ROTATION-INDEX", 0, 2, false );
    SubLFiles.declareFunction( me, "update_nl_trie_rotation_index", "UPDATE-NL-TRIE-ROTATION-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "nl_trie_matching_phrases", "NL-TRIE-MATCHING-PHRASES", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_matching_phrases_substring", "NL-TRIE-MATCHING-PHRASES-SUBSTRING", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_matching_phrases_inverted_index", "NL-TRIE-MATCHING-PHRASES-INVERTED-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_matches_from_dictionary", "NL-TRIE-MATCHES-FROM-DICTIONARY", 2, 0, false );
    SubLFiles.declareFunction( me, "nl_trie_search_strings_from_pattern", "NL-TRIE-SEARCH-STRINGS-FROM-PATTERN", 1, 0, false );
    SubLFiles.declareFunction( me, "dump_nl_trie_spellchecker_strings", "DUMP-NL-TRIE-SPELLCHECKER-STRINGS", 0, 4, false );
    SubLFiles.declareFunction( me, "stress_test_nl_trie_search_concurrent_swapping", "STRESS-TEST-NL-TRIE-SEARCH-CONCURRENT-SWAPPING", 0, 2, false );
    SubLFiles.declareFunction( me, "stress_test_nl_trie_search", "STRESS-TEST-NL-TRIE-SEARCH", 3, 0, false );
    SubLFiles.declareFunction( me, "stress_test_nl_trie_prefixes_concurrent_swapping", "STRESS-TEST-NL-TRIE-PREFIXES-CONCURRENT-SWAPPING", 0, 2, false );
    SubLFiles.declareFunction( me, "stress_test_nl_trie_prefixes", "STRESS-TEST-NL-TRIE-PREFIXES", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_nl_trie_accessors_file()
  {
    $word_external_punctuation_chars$ = SubLFiles.deflexical( "*WORD-EXTERNAL-PUNCTUATION-CHARS*", $list55 );
    $denotation_mapping_break_chars$ = SubLFiles.deflexical( "*DENOTATION-MAPPING-BREAK-CHARS*", Sequences.cconcatenate( $word_external_punctuation_chars$.getGlobalValue(), string_utilities.whitespace_chars() ) );
    $nl_trie_check_semantic_mtP$ = SubLFiles.defparameter( "*NL-TRIE-CHECK-SEMANTIC-MT?*", NIL );
    $nl_trie_rotation_index$ = SubLFiles.deflexical( "*NL-TRIE-ROTATION-INDEX*", ( maybeDefault( $sym120$_NL_TRIE_ROTATION_INDEX_, $nl_trie_rotation_index$, NIL ) ) );
    $nl_trie_rotate_characters$ = SubLFiles.deflexical( "*NL-TRIE-ROTATE-CHARACTERS*", $list121 );
    $nl_trie_rotate_point_char$ = SubLFiles.defconstant( "*NL-TRIE-ROTATE-POINT-CHAR*", Characters.CHAR_vertical );
    $nl_trie_rotate_point_string$ = SubLFiles.defconstant( "*NL-TRIE-ROTATE-POINT-STRING*", Strings.string( $nl_trie_rotate_point_char$.getGlobalValue() ) );
    $nl_trie_stoplist_trie$ = SubLFiles.deflexical( "*NL-TRIE-STOPLIST-TRIE*", ( maybeDefault( $sym122$_NL_TRIE_STOPLIST_TRIE_, $nl_trie_stoplist_trie$, NIL ) ) );
    $dtp_nl_trie_index_item$ = SubLFiles.defconstant( "*DTP-NL-TRIE-INDEX-ITEM*", $sym124$NL_TRIE_INDEX_ITEM );
    $default_number_of_concurrent_test_threads$ = SubLFiles.deflexical( "*DEFAULT-NUMBER-OF-CONCURRENT-TEST-THREADS*", TWENTY_INTEGER );
    $default_string_test_count$ = SubLFiles.deflexical( "*DEFAULT-STRING-TEST-COUNT*", $int166$500 );
    return NIL;
  }

  public static SubLObject setup_nl_trie_accessors_file()
  {
    memoization_state.note_memoized_function( $sym52$NL_TRIE_STRING_IS_POS_ );
    memoization_state.note_memoized_function( $sym87$NL_TRIE_PREFIXES_MEMOIZED );
    access_macros.register_macro_helper( $sym109$MATCHING_WORD_STRINGS_ENTRY_, $sym110$DO_SUPPORTING_TRIE_WORDS );
    subl_macro_promotions.declare_defglobal( $sym120$_NL_TRIE_ROTATION_INDEX_ );
    subl_macro_promotions.declare_defglobal( $sym122$_NL_TRIE_STOPLIST_TRIE_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_nl_trie_index_item$.getGlobalValue(), Symbols.symbol_function( $sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list132 );
    Structures.def_csetf( $sym133$NL_TRIE_INDEX_ITEM_TERM, $sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM );
    Structures.def_csetf( $sym135$NL_TRIE_INDEX_ITEM_PHRASE, $sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE );
    Structures.def_csetf( $sym137$NL_TRIE_INDEX_ITEM_MT, $sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT );
    Equality.identity( $sym124$NL_TRIE_INDEX_ITEM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_nl_trie_index_item$.getGlobalValue(), Symbols.symbol_function(
        $sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_trie_accessors_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_trie_accessors_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_trie_accessors_file();
  }
  static
  {
    me = new nl_trie_accessors();
    $word_external_punctuation_chars$ = null;
    $denotation_mapping_break_chars$ = null;
    $nl_trie_check_semantic_mtP$ = null;
    $nl_trie_rotation_index$ = null;
    $nl_trie_rotate_characters$ = null;
    $nl_trie_rotate_point_char$ = null;
    $nl_trie_rotate_point_string$ = null;
    $nl_trie_stoplist_trie$ = null;
    $dtp_nl_trie_index_item$ = null;
    $default_number_of_concurrent_test_threads$ = null;
    $default_string_test_count$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol( "&KEY" ), makeSymbol( "STRING" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "STRING" ), makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$STRING = makeKeyword( "STRING" );
    $kw4$DONE = makeKeyword( "DONE" );
    $sym5$KEY = makeUninternedSymbol( "KEY" );
    $sym6$ENTRIES = makeUninternedSymbol( "ENTRIES" );
    $sym7$DO_NL_TRIE = makeSymbol( "DO-NL-TRIE" );
    $sym8$CSOME = makeSymbol( "CSOME" );
    $sym9$CSETQ = makeSymbol( "CSETQ" );
    $sym10$NL_TRIE_ENTRY_STRING = makeSymbol( "NL-TRIE-ENTRY-STRING" );
    $list11 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "ENTRY-VAR" ), makeSymbol( "STRING" ), makeSymbol( "LOOKUP-MT" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ENTRY-TYPE" ),
        makeKeyword( "ANY" ) ), ConsesLow.list( makeSymbol( "CHECK-PERIOD?" ), T ), ConsesLow.list( makeSymbol( "MISSPELLINGS?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*MISSPELLINGS?*" ) ) ), ConsesLow
            .list( makeSymbol( "CASE-SENSITIVITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ) ) ), ConsesLow.list( makeSymbol( "CHECK-SEMANTIC-MT?" ), NIL )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list12 = ConsesLow.list( makeKeyword( "ENTRY-TYPE" ), makeKeyword( "CHECK-PERIOD?" ), makeKeyword( "MISSPELLINGS?" ), makeKeyword( "CASE-SENSITIVITY" ), makeKeyword( "CHECK-SEMANTIC-MT?" ) );
    $kw13$ENTRY_TYPE = makeKeyword( "ENTRY-TYPE" );
    $kw14$ANY = makeKeyword( "ANY" );
    $kw15$CHECK_PERIOD_ = makeKeyword( "CHECK-PERIOD?" );
    $kw16$MISSPELLINGS_ = makeKeyword( "MISSPELLINGS?" );
    $sym17$_MISSPELLINGS__ = makeSymbol( "*MISSPELLINGS?*" );
    $kw18$CASE_SENSITIVITY = makeKeyword( "CASE-SENSITIVITY" );
    $sym19$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_ = makeSymbol( "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" );
    $kw20$CHECK_SEMANTIC_MT_ = makeKeyword( "CHECK-SEMANTIC-MT?" );
    $sym21$ENTRIES = makeUninternedSymbol( "ENTRIES" );
    $sym22$CLET = makeSymbol( "CLET" );
    $sym23$_LEXICON_LOOKUP_MT_ = makeSymbol( "*LEXICON-LOOKUP-MT*" );
    $sym24$GATED_NL_TRIE_SEARCH = makeSymbol( "GATED-NL-TRIE-SEARCH" );
    $sym25$CDOLIST = makeSymbol( "CDOLIST" );
    $sym26$PWHEN = makeSymbol( "PWHEN" );
    $sym27$CAND = makeSymbol( "CAND" );
    $sym28$COR = makeSymbol( "COR" );
    $sym29$NL_TRIE_ENTRY_TYPE = makeSymbol( "NL-TRIE-ENTRY-TYPE" );
    $sym30$FIMPLIES = makeSymbol( "FIMPLIES" );
    $sym31$PERIOD_CONST_SATISFIED_ = makeSymbol( "PERIOD-CONST-SATISFIED?" );
    $sym32$CONTAINS_PERIOD_ = makeSymbol( "CONTAINS-PERIOD?" );
    $sym33$SPELLING_CONST_SATISFIED_ = makeSymbol( "SPELLING-CONST-SATISFIED?" );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRY-VAR" ), makeSymbol( "STRING" ), makeSymbol( "LOOKUP-MT" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "CHECK-PERIOD?" ), T ), ConsesLow.list(
        makeSymbol( "MISSPELLINGS?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*MISSPELLINGS?*" ) ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ) ) ), ConsesLow.list( makeSymbol( "CHECK-SEMANTIC-MT?" ), NIL ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list35 = ConsesLow.list( makeKeyword( "CHECK-PERIOD?" ), makeKeyword( "MISSPELLINGS?" ), makeKeyword( "CASE-SENSITIVITY" ), makeKeyword( "CHECK-SEMANTIC-MT?" ) );
    $sym36$DO_NL_TRIE_ENTRIES_FOR_STRING = makeSymbol( "DO-NL-TRIE-ENTRIES-FOR-STRING" );
    $kw37$WORD = makeKeyword( "WORD" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRY-VAR" ), makeSymbol( "STRING" ), makeSymbol( "LOOKUP-MT" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "CHECK-PERIOD?" ), NIL ), ConsesLow.list(
        makeSymbol( "MISSPELLINGS?" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*MISSPELLINGS?*" ) ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*" ) ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list39 = ConsesLow.list( makeKeyword( "CHECK-PERIOD?" ), makeKeyword( "MISSPELLINGS?" ), makeKeyword( "CASE-SENSITIVITY" ) );
    $kw40$NAME = makeKeyword( "NAME" );
    $list41 = ConsesLow.list( makeSymbol( "NEW-ENTRY" ), makeSymbol( "DENOT-LIST" ), makeSymbol( "PRED-LIST" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "SKIP-CONSTRAINTS?" ), NIL ), ConsesLow.list( makeSymbol(
        "ABBREV-TYPES" ), NIL ), ConsesLow.list( makeSymbol( "DENOT-TYPE" ), makeKeyword( "DENOT" ) ), ConsesLow.list( makeSymbol( "SKIP-NAMESTRINGS?" ), NIL ) );
    $list42 = ConsesLow.list( makeKeyword( "SKIP-CONSTRAINTS?" ), makeKeyword( "ABBREV-TYPES" ), makeKeyword( "DENOT-TYPE" ), makeKeyword( "SKIP-NAMESTRINGS?" ) );
    $kw43$SKIP_CONSTRAINTS_ = makeKeyword( "SKIP-CONSTRAINTS?" );
    $kw44$ABBREV_TYPES = makeKeyword( "ABBREV-TYPES" );
    $kw45$DENOT_TYPE = makeKeyword( "DENOT-TYPE" );
    $kw46$DENOT = makeKeyword( "DENOT" );
    $kw47$SKIP_NAMESTRINGS_ = makeKeyword( "SKIP-NAMESTRINGS?" );
    $sym48$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $sym49$ADD_NEW_ENTRY = makeSymbol( "ADD-NEW-ENTRY" );
    $list50 = ConsesLow.list( makeSymbol( "NEW-DENOTS" ), makeSymbol( "DENOT-LIST" ), makeSymbol( "NEW-PREDS" ), makeSymbol( "PRED-LIST" ) );
    $sym51$ADD_NEW_DENOTS_AND_PREDS = makeSymbol( "ADD-NEW-DENOTS-AND-PREDS" );
    $sym52$NL_TRIE_STRING_IS_POS_ = makeSymbol( "NL-TRIE-STRING-IS-POS?" );
    $int53$4096 = makeInteger( 4096 );
    $const54$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $list55 = ConsesLow.list( new SubLObject[] { Characters.CHAR_comma, Characters.CHAR_period, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_ampersand, Characters.CHAR_exclamation,
      Characters.CHAR_quotation, Characters.CHAR_semicolon, Characters.CHAR_colon, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_slash
    } );
    $kw56$GREEDY = makeKeyword( "GREEDY" );
    $list57 = ConsesLow.list( makeKeyword( "ABBREVS" ), makeKeyword( "ACRONYMS" ) );
    $sym58$GENL_POS_PRED_ = makeSymbol( "GENL-POS-PRED?" );
    $sym59$STRINGP = makeSymbol( "STRINGP" );
    $str60$the_ = makeString( "the " );
    $const61$acronymString = constant_handles.reader_make_constant_shell( makeString( "acronymString" ) );
    $const62$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw63$SEMTRANS_TEMPLATE = makeKeyword( "SEMTRANS-TEMPLATE" );
    $const64$nameSpelling = constant_handles.reader_make_constant_shell( makeString( "nameSpelling" ) );
    $const65$commonNickname = constant_handles.reader_make_constant_shell( makeString( "commonNickname" ) );
    $sym66$SPEECH_PART_PRED_ = makeSymbol( "SPEECH-PART-PRED?" );
    $sym67$SPEC_POS_PRED_ = makeSymbol( "SPEC-POS-PRED?" );
    $sym68$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const69$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym70$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $sym71$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol( "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER" );
    $sym72$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw73$ACRONYMS = makeKeyword( "ACRONYMS" );
    $kw74$ABBREVS = makeKeyword( "ABBREVS" );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "denotation" ) ), constant_handles.reader_make_constant_shell( makeString( "denotationRelatedTo" ) ), constant_handles
        .reader_make_constant_shell( makeString( "denotationPlaceholder" ) ) );
    $kw76$INTERVAL = makeKeyword( "INTERVAL" );
    $kw77$OFF = makeKeyword( "OFF" );
    $kw78$ON = makeKeyword( "ON" );
    $sym79$_ = makeSymbol( ">" );
    $sym80$INTERVAL_TOKEN_LENGTH = makeSymbol( "INTERVAL-TOKEN-LENGTH" );
    $sym81$_ = makeSymbol( "<" );
    $sym82$INTERVAL_TOKEN_START = makeSymbol( "INTERVAL-TOKEN-START" );
    $list83 = ConsesLow.cons( makeSymbol( "INDEX" ), makeSymbol( "NUM-TOKENS" ) );
    $sym84$NL_TRIE_P = makeSymbol( "NL-TRIE-P" );
    $list85 = ConsesLow.list( makeKeyword( "ON" ), makeKeyword( "PREFERRED" ) );
    $str86$Invalid_case_sensitivity_value_fo = makeString( "Invalid case-sensitivity value for NL-TRIE-PREFIXES: ~S" );
    $sym87$NL_TRIE_PREFIXES_MEMOIZED = makeSymbol( "NL-TRIE-PREFIXES-MEMOIZED" );
    $int88$512 = makeInteger( 512 );
    $const89$titleOfWork = constant_handles.reader_make_constant_shell( makeString( "titleOfWork" ) );
    $sym90$INDEX_COVERED_BY_TOKEN_P = makeSymbol( "INDEX-COVERED-BY-TOKEN-P" );
    $const91$CommonEnglishMisspellingsMt = constant_handles.reader_make_constant_shell( makeString( "CommonEnglishMisspellingsMt" ) );
    $list92 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ) );
    $kw93$PREFERRED = makeKeyword( "PREFERRED" );
    $kw94$ABORTED = makeKeyword( "ABORTED" );
    $sym95$NL_TRIE_INAPPROPRIATE_ENTRY_ = makeSymbol( "NL-TRIE-INAPPROPRIATE-ENTRY?" );
    $sym96$PRAGMATICALLY_ACCEPTABLE_ = makeSymbol( "PRAGMATICALLY-ACCEPTABLE?" );
    $sym97$FIRST = makeSymbol( "FIRST" );
    $list98 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "SUBNODE" ) );
    $str99$Found_non_matching_string___S_vs_ = makeString( "Found non-matching string: ~S vs. ~S" );
    $list100 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SUPPORT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list101 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym102$ASENT = makeUninternedSymbol( "ASENT" );
    $sym103$MT = makeUninternedSymbol( "MT" );
    $sym104$SUPPORT_SENTENCE = makeSymbol( "SUPPORT-SENTENCE" );
    $sym105$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $sym106$DO_NL_TRIE_WORD_ENTRIES_FOR_STRING = makeSymbol( "DO-NL-TRIE-WORD-ENTRIES-FOR-STRING" );
    $sym107$ATOMIC_SENTENCE_ARG2 = makeSymbol( "ATOMIC-SENTENCE-ARG2" );
    $sym108$CNOT = makeSymbol( "CNOT" );
    $sym109$MATCHING_WORD_STRINGS_ENTRY_ = makeSymbol( "MATCHING-WORD-STRINGS-ENTRY?" );
    $sym110$DO_SUPPORTING_TRIE_WORDS = makeSymbol( "DO-SUPPORTING-TRIE-WORDS" );
    $list111 = ConsesLow.list( makeSymbol( "POS-PRED" ), makeSymbol( "WORD" ), makeSymbol( "STRING" ) );
    $list112 = ConsesLow.list( makeSymbol( "HL-MODULE" ), makeSymbol( "EL-SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "TV" ) );
    $sym113$EQUALS_EL_ = makeSymbol( "EQUALS-EL?" );
    $list114 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CharacterString" ) ), constant_handles.reader_make_constant_shell( makeString( "SententialConstituent" ) ) );
    $const115$NounPhrase = constant_handles.reader_make_constant_shell( makeString( "NounPhrase" ) );
    $const116$ProperNameString = constant_handles.reader_make_constant_shell( makeString( "ProperNameString" ) );
    $const117$NLPhrase = constant_handles.reader_make_constant_shell( makeString( "NLPhrase" ) );
    $const118$phrase_Bar1 = constant_handles.reader_make_constant_shell( makeString( "phrase-Bar1" ) );
    $str119$Don_t_know_how_to_check__S_agains = makeString( "Don't know how to check ~S against ~S" );
    $sym120$_NL_TRIE_ROTATION_INDEX_ = makeSymbol( "*NL-TRIE-ROTATION-INDEX*" );
    $list121 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_hyphen );
    $sym122$_NL_TRIE_STOPLIST_TRIE_ = makeSymbol( "*NL-TRIE-STOPLIST-TRIE*" );
    $str123$tried_to_determine_rotations_for_ = makeString( "tried to determine rotations for a non-string: ~S~%" );
    $sym124$NL_TRIE_INDEX_ITEM = makeSymbol( "NL-TRIE-INDEX-ITEM" );
    $sym125$NL_TRIE_INDEX_ITEM_P = makeSymbol( "NL-TRIE-INDEX-ITEM-P" );
    $list126 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "PHRASE" ), makeSymbol( "MT" ) );
    $list127 = ConsesLow.list( makeKeyword( "TERM" ), makeKeyword( "PHRASE" ), makeKeyword( "MT" ) );
    $list128 = ConsesLow.list( makeSymbol( "NL-TRIE-INDEX-ITEM-TERM" ), makeSymbol( "NL-TRIE-INDEX-ITEM-PHRASE" ), makeSymbol( "NL-TRIE-INDEX-ITEM-MT" ) );
    $list129 = ConsesLow.list( makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-TERM" ), makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-PHRASE" ), makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-MT" ) );
    $sym130$PRINT_NL_TRIE_INDEX_ITEM = makeSymbol( "PRINT-NL-TRIE-INDEX-ITEM" );
    $sym131$NL_TRIE_INDEX_ITEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "NL-TRIE-INDEX-ITEM-PRINT-FUNCTION-TRAMPOLINE" );
    $list132 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "NL-TRIE-INDEX-ITEM-P" ) );
    $sym133$NL_TRIE_INDEX_ITEM_TERM = makeSymbol( "NL-TRIE-INDEX-ITEM-TERM" );
    $sym134$_CSETF_NL_TRIE_INDEX_ITEM_TERM = makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-TERM" );
    $sym135$NL_TRIE_INDEX_ITEM_PHRASE = makeSymbol( "NL-TRIE-INDEX-ITEM-PHRASE" );
    $sym136$_CSETF_NL_TRIE_INDEX_ITEM_PHRASE = makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-PHRASE" );
    $sym137$NL_TRIE_INDEX_ITEM_MT = makeSymbol( "NL-TRIE-INDEX-ITEM-MT" );
    $sym138$_CSETF_NL_TRIE_INDEX_ITEM_MT = makeSymbol( "_CSETF-NL-TRIE-INDEX-ITEM-MT" );
    $kw139$TERM = makeKeyword( "TERM" );
    $kw140$PHRASE = makeKeyword( "PHRASE" );
    $kw141$MT = makeKeyword( "MT" );
    $str142$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw143$BEGIN = makeKeyword( "BEGIN" );
    $sym144$MAKE_NL_TRIE_INDEX_ITEM = makeSymbol( "MAKE-NL-TRIE-INDEX-ITEM" );
    $kw145$SLOT = makeKeyword( "SLOT" );
    $kw146$END = makeKeyword( "END" );
    $sym147$VISIT_DEFSTRUCT_OBJECT_NL_TRIE_INDEX_ITEM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-NL-TRIE-INDEX-ITEM-METHOD" );
    $str148$_NL_TRIE_INDEX_ITEM__s__s__a_ = makeString( "<NL-TRIE-INDEX-ITEM:~s:~s:~a>" );
    $kw149$DENOTS = makeKeyword( "DENOTS" );
    $str150$nl_trie_rotation_stop_list = makeString( "nl trie rotation stop list" );
    $str151$nl_trie_rotation_index = makeString( "nl trie rotation index" );
    $str152$Creating_NL_trie_rotation_index__ = makeString( "Creating NL trie rotation index..." );
    $list153 = ConsesLow.list( makeUninternedSymbol( "STRIE-DICT-KEY" ), makeUninternedSymbol( "STRIE-DICT-VALUE" ) );
    $list154 = ConsesLow.list( makeUninternedSymbol( "DICT-KEY" ), makeUninternedSymbol( "DICT-VALUE" ) );
    $sym155$TRIE_REMOVE = makeSymbol( "TRIE-REMOVE" );
    $sym156$TRIE_INSERT = makeSymbol( "TRIE-INSERT" );
    $kw157$INFIX = makeKeyword( "INFIX" );
    $kw158$PREFIX = makeKeyword( "PREFIX" );
    $sym159$STARTS_WITH = makeSymbol( "STARTS-WITH" );
    $kw160$SUFFIX = makeKeyword( "SUFFIX" );
    $sym161$ENDS_WITH = makeSymbol( "ENDS-WITH" );
    $sym162$STRING_ = makeSymbol( "STRING<" );
    $sym163$LESSER_LENGTH_P = makeSymbol( "LESSER-LENGTH-P" );
    $str164$The_NL_Trie_must_be_initialized_b = makeString( "The NL Trie must be initialized before it can be dumped." );
    $str165$Dumping_NL_Trie_spellchecker_stri = makeString( "Dumping NL Trie spellchecker strings..." );
    $int166$500 = makeInteger( 500 );
    $str167$Concurrent_NL_Trie_Search_Stress_ = makeString( "Concurrent NL-Trie Search Stress Test Problems" );
    $const168$nameString = constant_handles.reader_make_constant_shell( makeString( "nameString" ) );
    $kw169$GAF = makeKeyword( "GAF" );
    $str170$Concurrent_NL_Trie_Searches_ = makeString( "Concurrent NL Trie Searches " );
    $sym171$STRESS_TEST_NL_TRIE_SEARCH = makeSymbol( "STRESS-TEST-NL-TRIE-SEARCH" );
    $sym172$VALID_PROCESS_P = makeSymbol( "VALID-PROCESS-P" );
    $sym173$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str174$Concurrent_NL_Trie_Prefixes_Stres = makeString( "Concurrent NL-Trie Prefixes Stress Test Problems" );
    $str175$Concurrent_NL_Trie_Prefixes_ = makeString( "Concurrent NL Trie Prefixes " );
    $sym176$STRESS_TEST_NL_TRIE_PREFIXES = makeSymbol( "STRESS-TEST-NL-TRIE-PREFIXES" );
  }

  public static final class $nl_trie_inappropriate_entryP$UnaryFunction
      extends
        UnaryFunction
  {
    public $nl_trie_inappropriate_entryP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NL-TRIE-INAPPROPRIATE-ENTRY?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nl_trie_inappropriate_entryP( arg1, $nl_trie_inappropriate_entryP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $nl_trie_inappropriate_entryP$BinaryFunction
      extends
        BinaryFunction
  {
    public $nl_trie_inappropriate_entryP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NL-TRIE-INAPPROPRIATE-ENTRY?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return nl_trie_inappropriate_entryP( arg1, arg2 );
    }
  }

  public static final class $nl_trie_index_item_native
      extends
        SubLStructNative
  {
    public SubLObject $term;
    public SubLObject $phrase;
    public SubLObject $mt;
    private static final SubLStructDeclNative structDecl;

    public $nl_trie_index_item_native()
    {
      this.$term = CommonSymbols.NIL;
      this.$phrase = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $nl_trie_index_item_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$term;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$phrase;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$term = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$phrase = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $nl_trie_index_item_native.class, $sym124$NL_TRIE_INDEX_ITEM, $sym125$NL_TRIE_INDEX_ITEM_P, $list126, $list127, new String[] { "$term", "$phrase", "$mt"
      }, $list128, $list129, $sym130$PRINT_NL_TRIE_INDEX_ITEM );
    }
  }

  public static final class $nl_trie_index_item_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $nl_trie_index_item_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "NL-TRIE-INDEX-ITEM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return nl_trie_index_item_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1536 ms
 * 
 */