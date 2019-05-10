package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.nl_trie;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.shallow_parser;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parser;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.question";
  public static final String myFingerPrint = "511271deee2d79eeebb44a31612a9bdd85747e32ef5b143a01f9f447c5594dce";
  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1534L)
  private static SubLSymbol $question_parser$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1687L)
  private static SubLSymbol $question_lexicon$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1786L)
  private static SubLSymbol $sksi_registered$;
  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14822L)
  private static SubLSymbol $cyc_to_resporator_map$;
  private static final SubLSymbol $kw0$WARN;
  private static final SubLInteger $int1$30;
  private static final SubLSymbol $sym2$TERM_LEXICON;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$QUESTION;
  private static final SubLSymbol $sym5$INFORMATION_REQUEST;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CORPORA;
  private static final SubLSymbol $sym8$ANSWER_TYPES;
  private static final SubLSymbol $sym9$PARSE;
  private static final SubLSymbol $sym10$STRING;
  private static final SubLSymbol $sym11$LEARNABLE_TYPES;
  private static final SubLSymbol $sym12$MAX_CONFIDENCE;
  private static final SubLSymbol $sym13$MAX_CANDIDATES;
  private static final SubLSymbol $sym14$CHUNKER;
  private static final SubLSymbol $sym15$TAGGER;
  private static final SubLSymbol $sym16$PARSER;
  private static final SubLSymbol $sym17$LEXICON;
  private static final SubLSymbol $sym18$OBJECT;
  private static final SubLSymbol $sym19$INSTANCE_COUNT;
  private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS;
  private static final SubLSymbol $sym21$ISOLATED_P;
  private static final SubLSymbol $sym22$INSTANCE_NUMBER;
  private static final SubLSymbol $sym23$ERROR_HANDLING;
  private static final SubLSymbol $sym24$TIMEOUT;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE;
  private static final SubLSymbol $sym26$CLASSIFY;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$ISA_;
  private static final SubLSymbol $sym31$CHILD_CLASSES;
  private static final SubLSymbol $sym32$QUESTION_CLASSIFY_METHOD;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym35$INITIALIZE;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym38$QUESTION_INITIALIZE_METHOD;
  private static final SubLSymbol $sym39$AUGMENT_TERMS;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str43$index;
  private static final SubLString $str44$Could_not_get_augmentation_terms_;
  private static final SubLSymbol $sym45$GET_PATH_LABELS;
  private static final SubLSymbol $sym46$QUESTION_AUGMENT_TERMS_METHOD;
  private static final SubLSymbol $sym47$REQUIRE_PERCENTAGE;
  private static final SubLList $list48;
  private static final SubLInteger $int49$100;
  private static final SubLSymbol $sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD;
  private static final SubLSymbol $sym51$GET_HEAD;
  private static final SubLSymbol $sym52$GET_STRING;
  private static final SubLSymbol $sym53$TREE_TYPE_MATCH;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym56$GET_KEYWORDS;
  private static final SubLSymbol $sym57$GET;
  private static final SubLSymbol $kw58$DENOT;
  private static final SubLSymbol $sym59$GET_LEXES;
  private static final SubLSymbol $sym60$QUESTION_TREE_TYPE_MATCH_METHOD;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$QUESTION_ANSWER_TYPES_METHOD;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym65$GET_CATEGORY;
  private static final SubLSymbol $sym66$YIELD;
  private static final SubLSymbol $sym67$QUESTION_GET_KEYWORDS_METHOD;
  private static final SubLSymbol $sym68$GET_KEYSTRINGS;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$WORD_TREE_GET_STRING_METHOD;
  private static final SubLSymbol $sym71$QUESTION_GET_KEYSTRINGS_METHOD;
  private static final SubLSymbol $sym72$CANDIDATE_ANSWER_P;
  private static final SubLList $list73;
  private static final SubLFloat $float74$0_3;
  private static final SubLSymbol $sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$STRINGP;
  private static final SubLSymbol $sym78$LISTP;
  private static final SubLSymbol $sym79$LEARN;
  private static final SubLSymbol $sym80$LEXIFY;
  private static final SubLSymbol $sym81$PRINT;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLString $str85$__;
  private static final SubLString $str86$__;
  private static final SubLString $str87$_;
  private static final SubLSymbol $sym88$QUESTION_PRINT_METHOD;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym92$QUESTION_GET_STRING_METHOD;
  private static final SubLSymbol $sym93$ANSWER;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym96$ANSWER_CARDINALITY;
  private static final SubLSymbol $sym97$GET_CONTENT;
  private static final SubLSymbol $sym98$EXTRACT;
  private static final SubLSymbol $sym99$QUERIFY;
  private static final SubLString $str100$Answering__a_timed_out_after__a_s;
  private static final SubLSymbol $sym101$SELECT;
  private static final SubLSymbol $sym102$QUESTION_ANSWER_METHOD;
  private static final SubLObject $const103$GuruQAMt;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const106$EverythingPSC;
  private static final SubLSymbol $sym107$PARSE_TREE_P;
  private static final SubLFloat $float108$0_8;
  private static final SubLSymbol $sym109$WORD_TREE_P;
  private static final SubLSymbol $kw110$STRING;
  private static final SubLString $str111$__;
  private static final SubLString $str112$_;
  private static final SubLString $str113$__;
  private static final SubLString $str114$_;
  private static final SubLString $str115$__;
  private static final SubLString $str116$_;
  private static final SubLString $str117$__;
  private static final SubLString $str118$_;
  private static final SubLString $str119$__;
  private static final SubLString $str120$_;
  private static final SubLString $str121$_;
  private static final SubLSymbol $kw122$CYC_POS;
  private static final SubLSymbol $kw123$WORD_UNIT;
  private static final SubLList $list124;
  private static final SubLString $str125$_cyc_quirk_trec_questions_trec_qu;
  private static final SubLSymbol $sym126$QUESTION_P;
  private static final SubLSymbol $kw127$INPUT;
  private static final SubLString $str128$Unable_to_open__S;
  private static final SubLString $str129$_;
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLString $str132$__;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1826L)
  public static SubLObject initialize_question()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $question_parser$.getDynamicValue( thread ) )
    {
      $question_parser$.setDynamicValue( parser.new_stanford_parser( $kw0$WARN, $int1$30 ), thread );
    }
    if( NIL == $question_lexicon$.getDynamicValue( thread ) )
    {
      $question_lexicon$.setDynamicValue( object.new_class_instance( $sym2$TERM_LEXICON ), thread );
    }
    if( NIL == $sksi_registered$.getDynamicValue( thread ) )
    {
      sksi_sks_manager.register_sksi_removal_modules_for_skses( $list3 );
      $sksi_registered$.setDynamicValue( T, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_corpora(final SubLObject v_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_question, SIX_INTEGER, $sym7$CORPORA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_corpora(final SubLObject v_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_question, value, SIX_INTEGER, $sym7$CORPORA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_answer_types(final SubLObject v_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_question, FIVE_INTEGER, $sym8$ANSWER_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_answer_types(final SubLObject v_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_question, value, FIVE_INTEGER, $sym8$ANSWER_TYPES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_parse(final SubLObject v_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_question, FOUR_INTEGER, $sym9$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_parse(final SubLObject v_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_question, value, FOUR_INTEGER, $sym9$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_string(final SubLObject v_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_question, THREE_INTEGER, $sym10$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_string(final SubLObject v_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_question, value, THREE_INTEGER, $sym10$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_learnable_types(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym11$LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_learnable_types(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym11$LEARNABLE_TYPES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SEVEN_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_max_confidence(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym12$MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_max_confidence(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym12$MAX_CONFIDENCE, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), SIX_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_max_candidates(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym13$MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_max_candidates(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym13$MAX_CANDIDATES, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FIVE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_chunker(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym14$CHUNKER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_chunker(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym14$CHUNKER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), FOUR_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_tagger(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym15$TAGGER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_tagger(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym15$TAGGER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_parser(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym16$PARSER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_parser(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym16$PARSER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject get_question_lexicon(final SubLObject v_question)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym17$LEXICON, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject set_question_lexicon(final SubLObject v_question, final SubLObject value)
  {
    final SubLObject v_class = v_question.isSymbol() ? classes.classes_retrieve_class( v_question )
        : ( ( NIL != subloop_structures.class_p( v_question ) ) ? v_question : ( ( NIL != subloop_structures.instance_p( v_question ) ) ? subloop_structures.instance_class( v_question ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym17$LEXICON, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject subloop_reserved_initialize_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym18$OBJECT, $sym19$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym17$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym16$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym15$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym14$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym13$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym12$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym11$LEARNABLE_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject subloop_reserved_initialize_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym18$OBJECT, $sym21$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym18$OBJECT, $sym22$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$INFORMATION_REQUEST, $sym23$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$INFORMATION_REQUEST, $sym24$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym10$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym9$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym8$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$QUESTION, $sym7$CORPORA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2233L)
  public static SubLObject question_p(final SubLObject v_question)
  {
    return classes.subloop_instanceof_class( v_question, $sym4$QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3473L)
  public static SubLObject question_classify_method(final SubLObject self, final SubLObject tree)
  {
    if( NIL == parse_tree.question_tree_p( tree ) )
    {
      return NIL;
    }
    final SubLObject class_stack = stacks.create_stack();
    SubLObject qclasses = NIL;
    stacks.stack_push( self, class_stack );
    while ( NIL == stacks.stack_empty_p( class_stack ))
    {
      final SubLObject qclass = stacks.stack_pop( class_stack );
      if( NIL != methods.funcall_class_method_with_1_args( qclass, $sym30$ISA_, tree ) )
      {
        qclasses = ConsesLow.cons( qclass, qclasses );
      }
      SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args( qclass, $sym31$CHILD_CLASSES );
      SubLObject child_class = NIL;
      child_class = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        stacks.stack_push( child_class, class_stack );
        cdolist_list_var = cdolist_list_var.rest();
        child_class = cdolist_list_var.first();
      }
    }
    return qclasses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4589L)
  public static SubLObject question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return parse_tree.question_tree_p( tree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5017L)
  public static SubLObject question_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    SubLObject learnable_types = get_question_learnable_types( self );
    SubLObject chunker = get_question_chunker( self );
    SubLObject tagger = get_question_tagger( self );
    SubLObject v_parser = get_question_parser( self );
    SubLObject lexicon = get_question_lexicon( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        search_engine.information_request_initialize_method( self );
        if( NIL == lexicon )
        {
          lexicon = object.new_class_instance( $sym2$TERM_LEXICON );
        }
        if( NIL == v_parser )
        {
          v_parser = parser.new_stanford_parser( $kw0$WARN, $int1$30 );
        }
        if( NIL == tagger )
        {
          tagger = pos_tagger.get_tagger();
        }
        if( NIL == chunker )
        {
          chunker = shallow_parser.new_shallow_parser( $kw0$WARN, TEN_INTEGER );
        }
        if( NIL == learnable_types )
        {
          learnable_types = get_learnable_types();
        }
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_QUESTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_learnable_types( self, learnable_types );
          set_question_chunker( self, chunker );
          set_question_tagger( self, tagger );
          set_question_parser( self, v_parser );
          set_question_lexicon( self, lexicon );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5477L)
  public static SubLObject question_augment_terms_method(final SubLObject self, final SubLObject terms, final SubLObject corpus)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject word_graph = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym42$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          word_graph = external_interfaces.get_word_graph( terms, ConsesLow.list( ConsesLow.list( $str43$index, external_interfaces.get_word_graph_path( corpus ) ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      Errors.warn( $str44$Could_not_get_augmentation_terms_, terms );
    }
    if( word_graph.isCons() )
    {
      return methods.funcall_instance_method_with_1_args( graph.make_graph_from_string_lists( word_graph ), $sym45$GET_PATH_LABELS, terms );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6031L)
  public static SubLObject question_require_percentage_method(final SubLObject self)
  {
    return $int49$100;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6238L)
  public static SubLObject np_term_match(final SubLObject np, final SubLObject v_term, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUALP;
    }
    final SubLObject head = methods.funcall_instance_method_with_0_args( np, $sym51$GET_HEAD );
    final SubLObject head_words = ( NIL != head ) ? string_utilities.split_string( methods.funcall_instance_method_with_0_args( head, $sym52$GET_STRING ), UNPROVIDED ) : NIL;
    final SubLObject term_words = string_utilities.split_string( v_term, UNPROVIDED );
    return makeBoolean( NIL != conses_high.intersection( head_words, term_words, test, UNPROVIDED ) && NIL != string_utilities.substringP( v_term, methods.funcall_instance_method_with_0_args( np, $sym52$GET_STRING ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6551L)
  public static SubLObject question_tree_type_match_method(final SubLObject self, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject answer_types = get_question_answer_types( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        final SubLObject head = methods.funcall_instance_method_with_0_args( tree, $sym51$GET_HEAD );
        SubLObject i = NIL;
        SubLObject denot = NIL;
        SubLObject score = NIL;
        SubLObject incompatibleP = NIL;
        if( NIL != head )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym56$GET_KEYWORDS );
          SubLObject keyword = NIL;
          keyword = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != tree_match( head, keyword ) )
            {
              Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER );
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
          }
          cdolist_list_var = methods.funcall_instance_method_with_0_args( head, $sym59$GET_LEXES );
          SubLObject lex = NIL;
          lex = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            denot = methods.funcall_instance_method_with_1_args( lex, $sym57$GET, $kw58$DENOT );
            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args( self, $sym8$ANSWER_TYPES );
            SubLObject type_path = NIL;
            type_path = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              i = Sequences.length( type_path );
              incompatibleP = NIL;
              if( NIL == incompatibleP )
              {
                SubLObject csome_list_var;
                SubLObject required_type;
                for( csome_list_var = type_path, required_type = NIL, required_type = csome_list_var.first(); NIL == incompatibleP && NIL != csome_list_var; incompatibleP = incompatible_p( denot,
                    required_type ), i = Numbers.subtract( i, ONE_INTEGER ), csome_list_var = csome_list_var.rest(), required_type = csome_list_var.first() )
                {
                  score = number_utilities.f_1X( Numbers.log( i, TWO_INTEGER ) );
                  if( NIL != at_utilities.more_specific_p( denot, required_type, UNPROVIDED ) )
                  {
                    Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_QUESTION_METHOD, score );
                  }
                }
              }
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              type_path = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_QUESTION_METHOD, ZERO_INTEGER );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_answer_types( self, answer_types );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7615L)
  public static SubLObject question_answer_types_method(final SubLObject self)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7838L)
  public static SubLObject question_get_keywords_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject parse = get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        SubLObject keywords = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( parse, $sym66$YIELD );
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != content_category_p( methods.funcall_instance_method_with_0_args( word, $sym65$GET_CATEGORY ) ) )
          {
            keywords = ConsesLow.cons( word, keywords );
          }
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_QUESTION_METHOD, keywords );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_parse( self, parse );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8147L)
  public static SubLObject question_get_keystrings_method(final SubLObject self)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym70$WORD_TREE_GET_STRING_METHOD ), question_get_keywords_method( self ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8351L)
  public static SubLObject question_candidate_answer_p_method(final SubLObject self, final SubLObject tree)
  {
    return Numbers.numG( methods.funcall_instance_method_with_1_args( self, $sym53$TREE_TYPE_MATCH, tree ), $float74$0_3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8599L)
  public static SubLObject new_question(final SubLObject string, SubLObject corpora, SubLObject v_class)
  {
    if( corpora == UNPROVIDED )
    {
      corpora = $list76;
    }
    if( v_class == UNPROVIDED )
    {
      v_class = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    assert NIL != Types.listp( corpora ) : corpora;
    initialize_question();
    methods.funcall_instance_method_with_1_args( $question_lexicon$.getDynamicValue( thread ), $sym79$LEARN, string );
    final SubLObject parse = methods.funcall_instance_method_with_1_args( $question_parser$.getDynamicValue( thread ), $sym9$PARSE, string );
    SubLObject v_question = NIL;
    if( NIL != parse )
    {
      methods.funcall_instance_method_with_1_args( parse, $sym80$LEXIFY, $question_lexicon$.getDynamicValue( thread ) );
      if( NIL == v_class )
      {
        v_class = methods.funcall_class_method_with_1_args( $sym4$QUESTION, $sym26$CLASSIFY, parse ).first();
      }
      if( NIL != v_class )
      {
        v_question = object.new_class_instance( v_class );
        set_question_string( v_question, string );
        set_question_corpora( v_question, corpora );
        set_question_parse( v_question, parse );
      }
    }
    return v_question;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9361L)
  public static SubLObject question_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject string = get_question_string( self );
    try
    {
      thread.throwStack.push( $sym84$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        streams_high.write_string( $str85$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.princ( subloop_structures.class_name( subloop_structures.instance_class( self ) ), stream );
        streams_high.write_string( $str86$__, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( string, stream, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str87$_, stream, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym84$OUTER_CATCH_FOR_QUESTION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_string( self, string );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym84$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9672L)
  public static SubLObject question_get_string_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject string = get_question_string( self );
    try
    {
      thread.throwStack.push( $sym91$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_QUESTION_METHOD, string );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_question_string( self, string );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym91$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9795L)
  public static SubLObject question_answer_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject max_candidates = get_question_max_candidates( self );
    final SubLObject timeout = search_engine.get_information_request_timeout( self );
    try
    {
      thread.throwStack.push( $sym95$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        final SubLObject texts = set.new_set( EQUAL, UNPROVIDED );
        SubLObject enoughP = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject candidates = NIL;
        final SubLObject cutoff = methods.funcall_instance_method_with_0_args( self, $sym96$ANSWER_CARDINALITY );
        SubLObject timed_outP = NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try
        {
          thread.throwStack.push( tag );
          final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
          try
          {
            subl_macro_promotions.$within_with_timeout$.bind( T, thread );
            SubLObject timer = NIL;
            try
            {
              final SubLObject _prev_bind_0_$2 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                timer = subl_macro_promotions.with_timeout_start_timer( timeout, tag );
                if( NIL == enoughP )
                {
                  SubLObject csome_list_var = methods.funcall_instance_method_with_0_args( self, $sym99$QUERIFY );
                  SubLObject query = NIL;
                  query = csome_list_var.first();
                  while ( NIL == enoughP && NIL != csome_list_var)
                  {
                    if( NIL == enoughP )
                    {
                      SubLObject csome_list_var_$3 = methods.funcall_instance_method_with_0_args( query, $sym93$ANSWER );
                      SubLObject passage = NIL;
                      passage = csome_list_var_$3.first();
                      while ( NIL == enoughP && NIL != csome_list_var_$3)
                      {
                        if( NIL == set.set_memberP( methods.funcall_instance_method_with_0_args( passage, $sym97$GET_CONTENT ), texts ) )
                        {
                          set.set_add( methods.funcall_instance_method_with_0_args( passage, $sym97$GET_CONTENT ), texts );
                          if( NIL == enoughP )
                          {
                            SubLObject csome_list_var_$4 = methods.funcall_instance_method_with_1_args( self, $sym98$EXTRACT, passage );
                            SubLObject candidate = NIL;
                            candidate = csome_list_var_$4.first();
                            while ( NIL == enoughP && NIL != csome_list_var_$4)
                            {
                              candidates = ConsesLow.cons( candidate, candidates );
                              i = Numbers.add( i, ONE_INTEGER );
                              enoughP = Numbers.numG( i, max_candidates );
                              csome_list_var_$4 = csome_list_var_$4.rest();
                              candidate = csome_list_var_$4.first();
                            }
                          }
                        }
                        csome_list_var_$3 = csome_list_var_$3.rest();
                        passage = csome_list_var_$3.first();
                      }
                    }
                    csome_list_var = csome_list_var.rest();
                    query = csome_list_var.first();
                  }
                }
              }
              finally
              {
                subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$2, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                subl_macro_promotions.with_timeout_stop_timer( timer );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
              }
            }
          }
          finally
          {
            subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != timed_outP )
        {
          Errors.warn( $str100$Answering__a_timed_out_after__a_s, self, timeout );
        }
        if( NIL != candidates )
        {
          Dynamic.sublisp_throw( $sym95$OUTER_CATCH_FOR_QUESTION_METHOD, list_utilities.first_n( cutoff, methods.funcall_class_method_with_1_args( candidates.first(), $sym101$SELECT, candidates ) ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          set_question_max_candidates( self, max_candidates );
          search_engine.set_information_request_timeout( self, timeout );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var2, $sym95$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10700L)
  public static SubLObject get_learnable_types()
  {
    SubLObject learnable_types = NIL;
    SubLObject cdolist_list_var = $list104;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$6 = kb_mapping.gather_predicate_extent_index( predicate, $const103$GuruQAMt, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$6.first();
      while ( NIL != cdolist_list_var_$6)
      {
        learnable_types = ConsesLow.cons( assertions_high.gaf_arg2( assertion ), learnable_types );
        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
        assertion = cdolist_list_var_$6.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return Sequences.remove_duplicates( learnable_types, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11138L)
  public static SubLObject incompatible_p(final SubLObject v_term, final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym105$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const106$EverythingPSC, thread );
      result = ( ( NIL != fort_types_interface.collection_in_any_mtP( v_term ) ) ? disjoint_with.disjoint_withP( v_term, collection, UNPROVIDED, UNPROVIDED )
          : isa.not_isaP( v_term, collection, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11473L)
  public static SubLObject new_parse_vector(final SubLObject parse)
  {
    assert NIL != parse_tree.parse_tree_p( parse ) : parse;
    final SubLObject vec = sparse_vector.new_sparse_vector( EQUALP, UNPROVIDED );
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( parse, $sym66$YIELD );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != content_category_p( methods.funcall_instance_method_with_0_args( word, $sym65$GET_CATEGORY ) ) )
      {
        SubLObject cdolist_list_var_$7 = string_utilities.split_string( methods.funcall_instance_method_with_0_args( word, $sym52$GET_STRING ), UNPROVIDED );
        SubLObject string = NIL;
        string = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          sparse_vector.svector_inc( vec, morphology.get_root( string, UNPROVIDED ) );
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          string = cdolist_list_var_$7.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return vec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11900L)
  public static SubLObject new_string_vector(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject vec = sparse_vector.new_sparse_vector( EQUALP, UNPROVIDED );
    SubLObject cdolist_list_var = document.sentence_yield_exhaustive( pos_tagger.tagger_tag_sentence( pos_tagger.get_tagger(), document.new_sentence( string, UNPROVIDED ) ) );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != content_category_p( document.word_category( word ) ) )
      {
        sparse_vector.svector_inc( vec, morphology.get_root( document.word_string( word ), UNPROVIDED ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return vec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12316L)
  public static SubLObject tree_match(final SubLObject tree1, final SubLObject tree2)
  {
    final SubLObject vec1 = new_parse_vector( tree1 );
    final SubLObject vec2 = new_parse_vector( tree2 );
    return Numbers.numG( scenario.safe_svector_cosine_angle( vec1, vec2, UNPROVIDED ), $float108$0_8 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12585L)
  public static SubLObject word_implies(final SubLObject word_tree1, final SubLObject word_tree2)
  {
    assert NIL != word_tree.word_tree_p( word_tree1 ) : word_tree1;
    assert NIL != word_tree.word_tree_p( word_tree2 ) : word_tree2;
    if( NIL != parse_tree.verbal_tree_p( word_tree1 ) && NIL != parse_tree.verbal_tree_p( word_tree2 ) )
    {
      final SubLObject lexes1 = methods.funcall_instance_method_with_0_args( word_tree1, $sym59$GET_LEXES );
      final SubLObject lexes2 = methods.funcall_instance_method_with_0_args( word_tree2, $sym59$GET_LEXES );
      SubLObject cdolist_list_var = lexes1;
      SubLObject lex1 = NIL;
      lex1 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$8 = lexes2;
        SubLObject lex2 = NIL;
        lex2 = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          if( NIL != at_utilities.more_specific_p( methods.funcall_instance_method_with_1_args( lex1, $sym57$GET, $kw58$DENOT ), methods.funcall_instance_method_with_1_args( lex2, $sym57$GET, $kw58$DENOT ),
              UNPROVIDED ) )
          {
            return T;
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          lex2 = cdolist_list_var_$8.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        lex1 = cdolist_list_var.first();
      }
    }
    return Equality.equalp( morphology.find_stem( conses_high.last( string_utilities.split_string( methods.funcall_instance_method_with_0_args( word_tree1, $sym52$GET_STRING ), UNPROVIDED ), UNPROVIDED ).first(),
        UNPROVIDED ), morphology.find_stem( conses_high.last( string_utilities.split_string( methods.funcall_instance_method_with_0_args( word_tree2, $sym52$GET_STRING ), UNPROVIDED ), UNPROVIDED ).first(),
            UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13271L)
  public static SubLObject position_mean(final SubLObject yield, final SubLObject keywords)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject positions = NIL;
    SubLObject position = ZERO_INTEGER;
    SubLObject found = NIL;
    SubLObject cdolist_list_var = yield;
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      position = Numbers.add( position, ONE_INTEGER );
      SubLObject cdolist_list_var_$9 = keywords;
      SubLObject keyword = NIL;
      keyword = cdolist_list_var_$9.first();
      while ( NIL != cdolist_list_var_$9)
      {
        if( NIL != word_implies( word, keyword ) )
        {
          positions = ConsesLow.cons( position, positions );
          final SubLObject item_var = methods.funcall_instance_method_with_0_args( keyword, $sym52$GET_STRING );
          if( NIL == conses_high.member( item_var, found, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            found = ConsesLow.cons( item_var, found );
          }
        }
        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
        keyword = cdolist_list_var_$9.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    if( NIL != positions )
    {
      thread.resetMultipleValues();
      final SubLObject deviation = number_utilities.standard_deviation_from_population( positions );
      final SubLObject mean = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Values.values( deviation, mean, Sequences.length( found ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13849L)
  public static SubLObject split_yield(final SubLObject yield, final SubLObject keywords)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject deviation = position_mean( yield, keywords );
    final SubLObject mean = thread.secondMultipleValue();
    final SubLObject found = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject rounded_mean = mean.isNumber() ? Numbers.round( mean, UNPROVIDED ) : NIL;
    if( NIL != rounded_mean )
    {
      return Values.values( Sequences.nreverse( list_utilities.first_n( rounded_mean, yield ) ), conses_high.nthcdr( rounded_mean, yield ), deviation, found );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14413L)
  public static SubLObject build_cyc_to_resporator_map()
  {
    final SubLObject map = Hashtables.make_hash_table( $int49$100, Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $list104;
    SubLObject predicate = NIL;
    predicate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$10 = kb_mapping.gather_predicate_extent_index( predicate, $const103$GuruQAMt, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$10.first();
      while ( NIL != cdolist_list_var_$10)
      {
        Hashtables.sethash( assertions_high.gaf_arg2( assertion ), map, Packages.intern( string_utilities.strip_final( assertions_high.gaf_arg1( assertion ), UNPROVIDED ), UNPROVIDED ) );
        cdolist_list_var_$10 = cdolist_list_var_$10.rest();
        assertion = cdolist_list_var_$10.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      predicate = cdolist_list_var.first();
    }
    return map;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14868L)
  public static SubLObject cyc_to_resporator(final SubLObject constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !$cyc_to_resporator_map$.getDynamicValue( thread ).isHashtable() )
    {
      $cyc_to_resporator_map$.setDynamicValue( build_cyc_to_resporator_map(), thread );
    }
    return Hashtables.gethash( constant, $cyc_to_resporator_map$.getDynamicValue( thread ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15211L)
  public static SubLObject sentencify(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject tokens = nl_trie.nl_trie_string_tokenize( separate_punctuation( string ) );
    final SubLObject length = Sequences.length( tokens );
    final SubLObject sentence = document.new_sentence( UNPROVIDED, UNPROVIDED );
    final SubLObject words = Vectors.make_vector( length, UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Vectors.set_aref( words, i, document.new_word( ConsesLow.list( $kw110$STRING, token ) ) );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    document._csetf_sign_constituents( sentence, words );
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15743L)
  public static SubLObject separate_punctuation(SubLObject string)
  {
    string = string_utilities.string_substitute( $str111$__, $str112$_, string, UNPROVIDED );
    string = string_utilities.string_substitute( $str113$__, $str114$_, string, UNPROVIDED );
    string = string_utilities.string_substitute( $str115$__, $str116$_, string, UNPROVIDED );
    string = string_utilities.string_substitute( $str117$__, $str118$_, string, UNPROVIDED );
    string = string_utilities.string_substitute( $str119$__, $str120$_, string, UNPROVIDED );
    if( NIL != string_utilities.ends_with( string, $str121$_, UNPROVIDED ) )
    {
      Vectors.set_aref( string, number_utilities.f_1_( Sequences.length( string ) ), Characters.CHAR_space );
      string = Sequences.cconcatenate( string, $str121$_ );
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16200L)
  public static SubLObject word_alternations(final SubLObject word, final SubLObject pos, final SubLObject lexicon)
  {
    final SubLObject lexes = methods.funcall_instance_method_with_1_args( lexicon, $sym57$GET, word );
    SubLObject variants = NIL;
    SubLObject cdolist_list_var = lexes;
    SubLObject lex = NIL;
    lex = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_1_args( lex, $sym57$GET, $kw122$CYC_POS ).eql( pos ) )
      {
        SubLObject cdolist_list_var_$11 = lexicon_accessors.get_strings_of_type( methods.funcall_instance_method_with_1_args( lex, $sym57$GET, $kw123$WORD_UNIT ), methods.funcall_instance_method_with_1_args( lex,
            $sym57$GET, $kw122$CYC_POS ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject variant = NIL;
        variant = cdolist_list_var_$11.first();
        while ( NIL != cdolist_list_var_$11)
        {
          final SubLObject item_var = variant;
          if( NIL == conses_high.member( item_var, variants, EQUAL, Symbols.symbol_function( IDENTITY ) ) )
          {
            variants = ConsesLow.cons( item_var, variants );
          }
          cdolist_list_var_$11 = cdolist_list_var_$11.rest();
          variant = cdolist_list_var_$11.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      lex = cdolist_list_var.first();
    }
    if( NIL == variants )
    {
      variants = ConsesLow.cons( word, variants );
    }
    return variants;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16625L)
  public static SubLObject content_category_p(final SubLObject category)
  {
    return conses_high.member( category, $list124, EQ, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16782L)
  public static SubLObject test_questions(SubLObject file, SubLObject question_type)
  {
    if( file == UNPROVIDED )
    {
      file = $str125$_cyc_quirk_trec_questions_trec_qu;
    }
    if( question_type == UNPROVIDED )
    {
      question_type = $sym126$QUESTION_P;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( file ) : file;
    SubLObject i = ZERO_INTEGER;
    SubLObject tokens = NIL;
    SubLObject v_question = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( file, $kw127$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str128$Unable_to_open__S, file );
      }
      final SubLObject infile = stream;
      if( infile.isStream() )
      {
        SubLObject line;
        for( line = NIL, line = file_utilities.cdolines_get_next_line( infile ); NIL != line; line = file_utilities.cdolines_get_next_line( infile ) )
        {
          if( NIL == string_utilities.starts_with( line, $str129$_ ) )
          {
            i = Numbers.add( i, ONE_INTEGER );
            tokens = string_utilities.split_string( line, $list130 );
            v_question = new_question( tokens.first(), string_utilities.split_string( conses_high.second( tokens ), $list131 ), UNPROVIDED );
            if( NIL != v_question && NIL != Functions.funcall( question_type, v_question ) )
            {
              print_high.princ( i, UNPROVIDED );
              print_high.princ( $str132$__, UNPROVIDED );
              print_high.princ( v_question, UNPROVIDED );
              streams_high.terpri( UNPROVIDED );
              print_high.princ( methods.funcall_instance_method_with_0_args( v_question, $sym93$ANSWER ), UNPROVIDED );
              streams_high.terpri( UNPROVIDED );
              streams_high.terpri( UNPROVIDED );
            }
          }
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 17457L)
  public static SubLObject test_scenario_questions(final SubLObject question_triples)
  {
    assert NIL != Types.listp( question_triples ) : question_triples;
    SubLObject v_question = NIL;
    SubLObject cdolist_list_var = question_triples;
    SubLObject question_triple = NIL;
    question_triple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      v_question = new_question( conses_high.third( question_triple ), UNPROVIDED, UNPROVIDED );
      if( NIL != question_p( v_question ) )
      {
        print_high.princ( question_triple.first(), UNPROVIDED );
        print_high.princ( $str132$__, UNPROVIDED );
        print_high.princ( v_question, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( methods.funcall_instance_method_with_0_args( v_question, $sym93$ANSWER ), UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      question_triple = cdolist_list_var.first();
    }
    return NIL;
  }

  public static SubLObject declare_question_file()
  {
    SubLFiles.declareFunction( me, "initialize_question", "INITIALIZE-QUESTION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_question_corpora", "GET-QUESTION-CORPORA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_corpora", "SET-QUESTION-CORPORA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_answer_types", "GET-QUESTION-ANSWER-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_answer_types", "SET-QUESTION-ANSWER-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_parse", "GET-QUESTION-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_parse", "SET-QUESTION-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_string", "GET-QUESTION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_string", "SET-QUESTION-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_learnable_types", "GET-QUESTION-LEARNABLE-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_learnable_types", "SET-QUESTION-LEARNABLE-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_max_confidence", "GET-QUESTION-MAX-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_max_confidence", "SET-QUESTION-MAX-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_max_candidates", "GET-QUESTION-MAX-CANDIDATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_max_candidates", "SET-QUESTION-MAX-CANDIDATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_chunker", "GET-QUESTION-CHUNKER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_chunker", "SET-QUESTION-CHUNKER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_tagger", "GET-QUESTION-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_tagger", "SET-QUESTION-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_parser", "GET-QUESTION-PARSER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_parser", "SET-QUESTION-PARSER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_question_lexicon", "GET-QUESTION-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "set_question_lexicon", "SET-QUESTION-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_question_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_question_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "question_p", "QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "question_classify_method", "QUESTION-CLASSIFY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_isaP_method", "QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_initialize_method", "QUESTION-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_augment_terms_method", "QUESTION-AUGMENT-TERMS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "question_require_percentage_method", "QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "np_term_match", "NP-TERM-MATCH", 2, 1, false );
    SubLFiles.declareFunction( me, "question_tree_type_match_method", "QUESTION-TREE-TYPE-MATCH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answer_types_method", "QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_get_keywords_method", "QUESTION-GET-KEYWORDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_get_keystrings_method", "QUESTION-GET-KEYSTRINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_candidate_answer_p_method", "QUESTION-CANDIDATE-ANSWER-P-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_question", "NEW-QUESTION", 1, 2, false );
    SubLFiles.declareFunction( me, "question_print_method", "QUESTION-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "question_get_string_method", "QUESTION-GET-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_answer_method", "QUESTION-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_learnable_types", "GET-LEARNABLE-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "incompatible_p", "INCOMPATIBLE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "new_parse_vector", "NEW-PARSE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_string_vector", "NEW-STRING-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "tree_match", "TREE-MATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "word_implies", "WORD-IMPLIES", 2, 0, false );
    SubLFiles.declareFunction( me, "position_mean", "POSITION-MEAN", 2, 0, false );
    SubLFiles.declareFunction( me, "split_yield", "SPLIT-YIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "build_cyc_to_resporator_map", "BUILD-CYC-TO-RESPORATOR-MAP", 0, 0, false );
    SubLFiles.declareFunction( me, "cyc_to_resporator", "CYC-TO-RESPORATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sentencify", "SENTENCIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "separate_punctuation", "SEPARATE-PUNCTUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "word_alternations", "WORD-ALTERNATIONS", 3, 0, false );
    SubLFiles.declareFunction( me, "content_category_p", "CONTENT-CATEGORY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "test_questions", "TEST-QUESTIONS", 0, 2, false );
    SubLFiles.declareFunction( me, "test_scenario_questions", "TEST-SCENARIO-QUESTIONS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_question_file()
  {
    $question_parser$ = SubLFiles.defvar( "*QUESTION-PARSER*", NIL );
    $question_lexicon$ = SubLFiles.defvar( "*QUESTION-LEXICON*", NIL );
    $sksi_registered$ = SubLFiles.defvar( "*SKSI-REGISTERED*", NIL );
    $cyc_to_resporator_map$ = SubLFiles.defvar( "*CYC-TO-RESPORATOR-MAP*", NIL );
    return NIL;
  }

  public static SubLObject setup_question_file()
  {
    classes.subloop_new_class( $sym4$QUESTION, $sym5$INFORMATION_REQUEST, NIL, NIL, $list6 );
    classes.class_set_implements_slot_listeners( $sym4$QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym4$QUESTION, $sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym4$QUESTION, $sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE );
    subloop_reserved_initialize_question_class( $sym4$QUESTION );
    methods.methods_incorporate_class_method( $sym26$CLASSIFY, $sym4$QUESTION, $list27, $list28, $list29 );
    methods.subloop_register_class_method( $sym4$QUESTION, $sym26$CLASSIFY, $sym32$QUESTION_CLASSIFY_METHOD );
    methods.methods_incorporate_class_method( $sym30$ISA_, $sym4$QUESTION, $list27, $list28, $list33 );
    methods.subloop_register_class_method( $sym4$QUESTION, $sym30$ISA_, $sym34$QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym35$INITIALIZE, $sym4$QUESTION, $list27, NIL, $list36 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym35$INITIALIZE, $sym38$QUESTION_INITIALIZE_METHOD );
    methods.methods_incorporate_class_method( $sym39$AUGMENT_TERMS, $sym4$QUESTION, $list27, $list40, $list41 );
    methods.subloop_register_class_method( $sym4$QUESTION, $sym39$AUGMENT_TERMS, $sym46$QUESTION_AUGMENT_TERMS_METHOD );
    methods.methods_incorporate_class_method( $sym47$REQUIRE_PERCENTAGE, $sym4$QUESTION, $list27, NIL, $list48 );
    methods.subloop_register_class_method( $sym4$QUESTION, $sym47$REQUIRE_PERCENTAGE, $sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym53$TREE_TYPE_MATCH, $sym4$QUESTION, $list27, $list28, $list54 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym53$TREE_TYPE_MATCH, $sym60$QUESTION_TREE_TYPE_MATCH_METHOD );
    methods.methods_incorporate_instance_method( $sym8$ANSWER_TYPES, $sym4$QUESTION, $list27, NIL, $list61 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym8$ANSWER_TYPES, $sym62$QUESTION_ANSWER_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym56$GET_KEYWORDS, $sym4$QUESTION, $list27, NIL, $list63 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym56$GET_KEYWORDS, $sym67$QUESTION_GET_KEYWORDS_METHOD );
    methods.methods_incorporate_instance_method( $sym68$GET_KEYSTRINGS, $sym4$QUESTION, $list27, NIL, $list69 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym68$GET_KEYSTRINGS, $sym71$QUESTION_GET_KEYSTRINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym72$CANDIDATE_ANSWER_P, $sym4$QUESTION, $list27, $list28, $list73 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym72$CANDIDATE_ANSWER_P, $sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD );
    methods.methods_incorporate_instance_method( $sym81$PRINT, $sym4$QUESTION, $list27, $list82, $list83 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym81$PRINT, $sym88$QUESTION_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym52$GET_STRING, $sym4$QUESTION, $list89, NIL, $list90 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym52$GET_STRING, $sym92$QUESTION_GET_STRING_METHOD );
    methods.methods_incorporate_instance_method( $sym93$ANSWER, $sym4$QUESTION, $list89, NIL, $list94 );
    methods.subloop_register_instance_method( $sym4$QUESTION, $sym93$ANSWER, $sym102$QUESTION_ANSWER_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_question_file();
  }
  static
  {
    me = new question();
    $question_parser$ = null;
    $question_lexicon$ = null;
    $sksi_registered$ = null;
    $cyc_to_resporator_map$ = null;
    $kw0$WARN = makeKeyword( "WARN" );
    $int1$30 = makeInteger( 30 );
    $sym2$TERM_LEXICON = makeSymbol( "TERM-LEXICON" );
    $list3 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Usgs-KS" ) ), constant_handles.reader_make_constant_shell( makeString( "NGA-KS" ) ) );
    $sym4$QUESTION = makeSymbol( "QUESTION" );
    $sym5$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $list6 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LEXICON" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSER" ), makeKeyword( "CLASS" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TAGGER" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CHUNKER" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "MAX-CANDIDATES" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), TWENTY_INTEGER ), ConsesLow.list( makeSymbol( "MAX-CONFIDENCE" ), makeKeyword( "CLASS" ),
          makeKeyword( "PROTECTED" ), makeKeyword( "VALUE" ), TEN_INTEGER ), ConsesLow.list( makeSymbol( "LEARNABLE-TYPES" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STRING" ),
              makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ANSWER-TYPES" ),
                  makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CORPORA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-CLASS-METHOD" ), makeSymbol( "CLASSIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), NIL, makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "AUGMENT-TERMS" ), ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "CORPUS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
          "DEF-CLASS-METHOD" ), makeSymbol( "REQUIRE-PERCENTAGE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STRING" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword(
          "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), ConsesLow.list( makeSymbol( "PASSAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
              "DEF-INSTANCE-METHOD" ), makeSymbol( "CANDIDATE-ANSWER-P" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYWORDS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                      "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-KEYSTRINGS" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-CARDINALITY" ), NIL, makeKeyword(
                          "PROTECTED" ) )
    } );
    $sym7$CORPORA = makeSymbol( "CORPORA" );
    $sym8$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym9$PARSE = makeSymbol( "PARSE" );
    $sym10$STRING = makeSymbol( "STRING" );
    $sym11$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym12$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym13$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym14$CHUNKER = makeSymbol( "CHUNKER" );
    $sym15$TAGGER = makeSymbol( "TAGGER" );
    $sym16$PARSER = makeSymbol( "PARSER" );
    $sym17$LEXICON = makeSymbol( "LEXICON" );
    $sym18$OBJECT = makeSymbol( "OBJECT" );
    $sym19$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym20$SUBLOOP_RESERVED_INITIALIZE_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUESTION-CLASS" );
    $sym21$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym22$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym23$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym24$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUESTION-INSTANCE" );
    $sym26$CLASSIFY = makeSymbol( "CLASSIFY" );
    $list27 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list28 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list29 = ConsesLow.list( makeString(
        "@param TREE parse-tree-p; the parse tree to be classified\n   @return symbolp, the question class of PARSE, or nil if there is none\n   This happens by iterating over all subclasses of questions (via \n   introspection) and calling the 'isa' predicate with TREE as its argument.\n   If TREE does qualify as a question tree of a subclass, 'isa?' will return \n   t and that class will be added to the list of questions that TREE qualifies\n   as" ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "QUESTION-TREE-P" ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "CLASS-STACK" ), ConsesLow.list( makeSymbol( "CREATE-STACK" ) ) ), ConsesLow.list( makeSymbol( "QCLASSES" ), NIL ) ), ConsesLow.list( makeSymbol( "STACK-PUSH" ), makeSymbol(
                "SELF" ), makeSymbol( "CLASS-STACK" ) ), ConsesLow.list( makeSymbol( "UNTIL" ), ConsesLow.list( makeSymbol( "STACK-EMPTY-P" ), makeSymbol( "CLASS-STACK" ) ), ConsesLow.list( makeSymbol( "CLET" ),
                    ConsesLow.list( ConsesLow.list( makeSymbol( "QCLASS" ), ConsesLow.list( makeSymbol( "STACK-POP" ), makeSymbol( "CLASS-STACK" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "FCM" ), makeSymbol( "QCLASS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ISA?" ) ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "QCLASS" ), makeSymbol(
                            "QCLASSES" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CHILD-CLASS" ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "QCLASS" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "CHILD-CLASSES" ) ) ) ), ConsesLow.list( makeSymbol( "STACK-PUSH" ), makeSymbol( "CHILD-CLASS" ), makeSymbol( "CLASS-STACK" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                    "RET" ), makeSymbol( "QCLASSES" ) ) ) );
    $sym30$ISA_ = makeSymbol( "ISA?" );
    $sym31$CHILD_CLASSES = makeSymbol( "CHILD-CLASSES" );
    $sym32$QUESTION_CLASSIFY_METHOD = makeSymbol( "QUESTION-CLASSIFY-METHOD" );
    $list33 = ConsesLow.list( makeString(
        "@param TREE parse-tree-p; the tree for which we need to decide whether it can \n   be this kind of question\n   @return boolean; t if TREE is this kind of question, nil otherwise\n   @note each subclass of question needs to implement this method to recognize a \n   parse tree as a particular kind of question, otherwise, it'll default to nil" ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUESTION-TREE-P" ), makeSymbol( "TREE" ) ) ) );
    $sym34$QUESTION_ISA__METHOD = makeSymbol( "QUESTION-ISA?-METHOD" );
    $sym35$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list36 = ConsesLow.list( makeString( "Initializes all class slots in question" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
        "LEXICON" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TERM-LEXICON" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "NEW-STANFORD-PARSER" ), makeKeyword( "WARN" ),
            makeInteger( 30 ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TAGGER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TAGGER" ), ConsesLow.list( makeSymbol( "GET-TAGGER" ) ) ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CHUNKER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CHUNKER" ), ConsesLow.list( makeSymbol( "NEW-SHALLOW-PARSER" ), makeKeyword( "WARN" ),
            TEN_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "LEARNABLE-TYPES" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEARNABLE-TYPES" ), ConsesLow.list( makeSymbol(
                "GET-LEARNABLE-TYPES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym37$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym38$QUESTION_INITIALIZE_METHOD = makeSymbol( "QUESTION-INITIALIZE-METHOD" );
    $sym39$AUGMENT_TERMS = makeSymbol( "AUGMENT-TERMS" );
    $list40 = ConsesLow.list( makeSymbol( "TERMS" ), makeSymbol( "CORPUS" ) );
    $list41 = ConsesLow.list( makeString( "@param TERMS listp; a list of strings to topically augment with related terms\n   @return listp; a list of terms topically related to TERMS" ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( makeSymbol( "WORD-GRAPH" ), makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "WORD-GRAPH" ), ConsesLow.list( makeSymbol( "GET-WORD-GRAPH" ), makeSymbol( "TERMS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeString( "index" ),
                ConsesLow.list( makeSymbol( "GET-WORD-GRAPH-PATH" ), makeSymbol( "CORPUS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "WARN" ), makeString(
                    "Could not get augmentation terms for ~S" ), makeSymbol( "TERMS" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CONSP" ), makeSymbol( "WORD-GRAPH" ) ), ConsesLow.list(
                        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "MAKE-GRAPH-FROM-STRING-LISTS" ), makeSymbol( "WORD-GRAPH" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                            makeSymbol( "GET-PATH-LABELS" ) ), makeSymbol( "TERMS" ) ) ) ) ) );
    $sym42$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str43$index = makeString( "index" );
    $str44$Could_not_get_augmentation_terms_ = makeString( "Could not get augmentation terms for ~S" );
    $sym45$GET_PATH_LABELS = makeSymbol( "GET-PATH-LABELS" );
    $sym46$QUESTION_AUGMENT_TERMS_METHOD = makeSymbol( "QUESTION-AUGMENT-TERMS-METHOD" );
    $sym47$REQUIRE_PERCENTAGE = makeSymbol( "REQUIRE-PERCENTAGE" );
    $list48 = ConsesLow.list( makeString( "@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers" ), ConsesLow.list( makeSymbol( "RET" ),
        makeInteger( 100 ) ) );
    $int49$100 = makeInteger( 100 );
    $sym50$QUESTION_REQUIRE_PERCENTAGE_METHOD = makeSymbol( "QUESTION-REQUIRE-PERCENTAGE-METHOD" );
    $sym51$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym52$GET_STRING = makeSymbol( "GET-STRING" );
    $sym53$TREE_TYPE_MATCH = makeSymbol( "TREE-TYPE-MATCH" );
    $list54 = ConsesLow.list( makeString( "@param TREE parse-tree-p; a possible answer for this question\n   @return numberp; a score for how well TREE matches the answer types this question requires" ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ),
            makeSymbol( "I" ), makeSymbol( "DENOT" ), makeSymbol( "SCORE" ), makeSymbol( "INCOMPATIBLE?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                ConsesLow.list( makeSymbol( "KEYWORD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORDS" ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "TREE-MATCH" ), makeSymbol( "HEAD" ), makeSymbol( "KEYWORD" ) ), ConsesLow.list( makeSymbol( "RET" ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol(
                        "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-LEXES" ) ) ) ), ConsesLow.list(
                            makeSymbol( "CSETQ" ), makeSymbol( "DENOT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword(
                                "DENOT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE-PATH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), makeSymbol( "ANSWER-TYPES" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "I" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "TYPE-PATH" ) ) ),
                                    ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INCOMPATIBLE?" ), NIL ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "REQUIRED-TYPE" ), makeSymbol(
                                        "TYPE-PATH" ), makeSymbol( "INCOMPATIBLE?" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "1+" ), ConsesLow.list( makeSymbol(
                                            "LOG" ), makeSymbol( "I" ), TWO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MORE-SPECIFIC-P" ), makeSymbol( "DENOT" ), makeSymbol(
                                                "REQUIRED-TYPE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SCORE" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INCOMPATIBLE?" ), ConsesLow.list(
                                                    makeSymbol( "INCOMPATIBLE-P" ), makeSymbol( "DENOT" ), makeSymbol( "REQUIRED-TYPE" ) ) ), ConsesLow.list( makeSymbol( "CDEC" ), makeSymbol( "I" ) ) ) ) ) ) ), ConsesLow
                                                        .list( makeSymbol( "RET" ), ZERO_INTEGER ) );
    $sym55$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym56$GET_KEYWORDS = makeSymbol( "GET-KEYWORDS" );
    $sym57$GET = makeSymbol( "GET" );
    $kw58$DENOT = makeKeyword( "DENOT" );
    $sym59$GET_LEXES = makeSymbol( "GET-LEXES" );
    $sym60$QUESTION_TREE_TYPE_MATCH_METHOD = makeSymbol( "QUESTION-TREE-TYPE-MATCH-METHOD" );
    $list61 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), NIL ) );
    $sym62$QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "QUESTION-ANSWER-TYPES-METHOD" );
    $list63 = ConsesLow.list( makeString( "@return listp; the non-functional or content strings of this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "KEYWORDS" ),
        NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CONTENT-CATEGORY-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-CATEGORY" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "WORD" ), makeSymbol( "KEYWORDS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "KEYWORDS" ) ) ) );
    $sym64$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym65$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $sym66$YIELD = makeSymbol( "YIELD" );
    $sym67$QUESTION_GET_KEYWORDS_METHOD = makeSymbol( "QUESTION-GET-KEYWORDS-METHOD" );
    $sym68$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $list69 = ConsesLow.list( makeString( "@return listp; the non-functional or content strings of this question" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
        makeSymbol( "FUNCTION" ), makeSymbol( "WORD-TREE-GET-STRING-METHOD" ) ), ConsesLow.list( makeSymbol( "GET-KEYWORDS" ), makeSymbol( "SELF" ) ) ) ) );
    $sym70$WORD_TREE_GET_STRING_METHOD = makeSymbol( "WORD-TREE-GET-STRING-METHOD" );
    $sym71$QUESTION_GET_KEYSTRINGS_METHOD = makeSymbol( "QUESTION-GET-KEYSTRINGS-METHOD" );
    $sym72$CANDIDATE_ANSWER_P = makeSymbol( "CANDIDATE-ANSWER-P" );
    $list73 = ConsesLow.list( makeString( "@return boolanp; t if TREE is considered to be a candidate answer to this question\n   on semantic grounds, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TREE-TYPE-MATCH" ) ), makeSymbol( "TREE" ) ), makeDouble( 0.3 ) ) ) );
    $float74$0_3 = makeDouble( 0.3 );
    $sym75$QUESTION_CANDIDATE_ANSWER_P_METHOD = makeSymbol( "QUESTION-CANDIDATE-ANSWER-P-METHOD" );
    $list76 = ConsesLow.list( makeString( "AQUAINT" ) );
    $sym77$STRINGP = makeSymbol( "STRINGP" );
    $sym78$LISTP = makeSymbol( "LISTP" );
    $sym79$LEARN = makeSymbol( "LEARN" );
    $sym80$LEXIFY = makeSymbol( "LEXIFY" );
    $sym81$PRINT = makeSymbol( "PRINT" );
    $list82 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list83 = ConsesLow.list( makeString( "Prints QUESTION to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<" ),
        makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRINC" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "STREAM" ) ),
        ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeSymbol( "STRING" ), makeSymbol( "STREAM" ) ), ConsesLow.list(
            makeSymbol( "WRITE-STRING" ), makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym84$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $str85$__ = makeString( "#<" );
    $str86$__ = makeString( ": " );
    $str87$_ = makeString( ">" );
    $sym88$QUESTION_PRINT_METHOD = makeSymbol( "QUESTION-PRINT-METHOD" );
    $list89 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list90 = ConsesLow.list( makeString( "@return stringp; the surface string of QUESTION" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STRING" ) ) );
    $sym91$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym92$QUESTION_GET_STRING_METHOD = makeSymbol( "QUESTION-GET-STRING-METHOD" );
    $sym93$ANSWER = makeSymbol( "ANSWER" );
    $list94 = ConsesLow.list( makeString( "@return listp; a list of answers to this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEXTS" ), ConsesLow.list( makeSymbol(
        "NEW-SET" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "ENOUGH?" ), NIL ), ConsesLow.list( makeSymbol( "I" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CANDIDATES" ),
            NIL ), ConsesLow.list( makeSymbol( "CUTOFF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-CARDINALITY" ) ) ) ), makeSymbol(
                "TIMED-OUT?" ) ), ConsesLow.list( makeSymbol( "WITH-TIMEOUT" ), ConsesLow.list( makeSymbol( "TIMEOUT" ), makeSymbol( "TIMED-OUT?" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol(
                    "QUERY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUERIFY" ) ) ), makeSymbol( "ENOUGH?" ) ), ConsesLow.list( makeSymbol(
                        "CSOME" ), ConsesLow.list( makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ), makeSymbol(
                            "ENOUGH?" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SET-MEMBER?" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ), makeSymbol( "TEXTS" ) ), ConsesLow.list( makeSymbol( "SET-ADD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ), makeSymbol( "TEXTS" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "CANDIDATE" ), ConsesLow.list(
                                        makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXTRACT" ) ), makeSymbol( "PASSAGE" ) ), makeSymbol( "ENOUGH?" ) ), ConsesLow.list(
                                            makeSymbol( "CPUSH" ), makeSymbol( "CANDIDATE" ), makeSymbol( "CANDIDATES" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol(
                                                "CSETQ" ), makeSymbol( "ENOUGH?" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "I" ), makeSymbol( "MAX-CANDIDATES" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                    "PWHEN" ), makeSymbol( "TIMED-OUT?" ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "Answering ~a timed out after ~a seconds~%" ), makeSymbol( "SELF" ),
                                                        makeSymbol( "TIMEOUT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CANDIDATES" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                            "FIRST-N" ), makeSymbol( "CUTOFF" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "CANDIDATES" ) ), ConsesLow.list(
                                                                makeSymbol( "QUOTE" ), makeSymbol( "SELECT" ) ), makeSymbol( "CANDIDATES" ) ) ) ) ) ) );
    $sym95$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym96$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $sym97$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym98$EXTRACT = makeSymbol( "EXTRACT" );
    $sym99$QUERIFY = makeSymbol( "QUERIFY" );
    $str100$Answering__a_timed_out_after__a_s = makeString( "Answering ~a timed out after ~a seconds~%" );
    $sym101$SELECT = makeSymbol( "SELECT" );
    $sym102$QUESTION_ANSWER_METHOD = makeSymbol( "QUESTION-ANSWER-METHOD" );
    $const103$GuruQAMt = constant_handles.reader_make_constant_shell( makeString( "GuruQAMt" ) );
    $list104 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "guruqaGenlsToken" ) ), constant_handles.reader_make_constant_shell( makeString( "guruqaTypeToken" ) ) );
    $sym105$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const106$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym107$PARSE_TREE_P = makeSymbol( "PARSE-TREE-P" );
    $float108$0_8 = makeDouble( 0.8 );
    $sym109$WORD_TREE_P = makeSymbol( "WORD-TREE-P" );
    $kw110$STRING = makeKeyword( "STRING" );
    $str111$__ = makeString( " ," );
    $str112$_ = makeString( "," );
    $str113$__ = makeString( " ;" );
    $str114$_ = makeString( ";" );
    $str115$__ = makeString( " :" );
    $str116$_ = makeString( ":" );
    $str117$__ = makeString( "( " );
    $str118$_ = makeString( "(" );
    $str119$__ = makeString( " )" );
    $str120$_ = makeString( ")" );
    $str121$_ = makeString( "." );
    $kw122$CYC_POS = makeKeyword( "CYC-POS" );
    $kw123$WORD_UNIT = makeKeyword( "WORD-UNIT" );
    $list124 = ConsesLow.list( new SubLObject[] { makeKeyword( "NNP" ), makeKeyword( "NP" ), makeKeyword( "NNPS" ), makeKeyword( "NN" ), makeKeyword( "NNS" ), makeKeyword( "JJ" ), makeKeyword( "VBP" ), makeKeyword(
        "VB" ), makeKeyword( "VBD" ), makeKeyword( "VBG" ), makeKeyword( "VBN" ), makeKeyword( "VBZ" ), makeKeyword( "CD" )
    } );
    $str125$_cyc_quirk_trec_questions_trec_qu = makeString( "/cyc/quirk/trec-questions/trec-questions.txt" );
    $sym126$QUESTION_P = makeSymbol( "QUESTION-P" );
    $kw127$INPUT = makeKeyword( "INPUT" );
    $str128$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str129$_ = makeString( "#" );
    $list130 = ConsesLow.list( Characters.CHAR_tab );
    $list131 = ConsesLow.list( Characters.CHAR_space );
    $str132$__ = makeString( ". " );
  }
}
/*
 * 
 * Total time: 499 ms
 * 
 */