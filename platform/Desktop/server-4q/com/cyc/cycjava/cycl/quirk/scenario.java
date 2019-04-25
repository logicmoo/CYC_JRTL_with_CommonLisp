package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.object;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class scenario
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.scenario";
  public static final String myFingerPrint = "5bb46dfc06978e75616d9947c4331f47e82f9054df57a40f5de2ad5b02df23e2";
  private static final SubLSymbol $sym0$SCENARIO;
  private static final SubLSymbol $sym1$INFORMATION_REQUEST;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$ANSWERS;
  private static final SubLSymbol $sym4$QUESTIONS;
  private static final SubLSymbol $sym5$VECTOR;
  private static final SubLSymbol $sym6$AUGMENTATION_TERMS;
  private static final SubLSymbol $sym7$SENTENCES;
  private static final SubLSymbol $sym8$CORPORA;
  private static final SubLSymbol $sym9$STRING;
  private static final SubLSymbol $sym10$TAGGER;
  private static final SubLSymbol $sym11$PARSER;
  private static final SubLSymbol $sym12$LEXICON;
  private static final SubLSymbol $sym13$OBJECT;
  private static final SubLSymbol $sym14$INSTANCE_COUNT;
  private static final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS;
  private static final SubLSymbol $sym16$ISOLATED_P;
  private static final SubLSymbol $sym17$INSTANCE_NUMBER;
  private static final SubLSymbol $sym18$ERROR_HANDLING;
  private static final SubLSymbol $sym19$TIMEOUT;
  private static final SubLSymbol $sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE;
  private static final SubLSymbol $sym21$VIABLE_QUESTION;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$SCENARIO_VIABLE_QUESTION_METHOD;
  private static final SubLSymbol $sym27$INITIALIZE;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD;
  private static final SubLSymbol $sym30$QUIRK_LEXICON;
  private static final SubLSymbol $kw31$WARN;
  private static final SubLInteger $int32$30;
  private static final SubLSymbol $sym33$SCENARIO_INITIALIZE_METHOD;
  private static final SubLSymbol $sym34$GET_VECTOR;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD;
  private static final SubLSymbol $sym38$SCENARIO_GET_VECTOR_METHOD;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$STRINGP;
  private static final SubLSymbol $sym41$LISTP;
  private static final SubLSymbol $sym42$ANSWER;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$QUESTION;
  private static final SubLSymbol $sym46$AUGMENT_TERMS;
  private static final SubLInteger $int47$50;
  private static final SubLSymbol $sym48$ESSAY;
  private static final SubLSymbol $sym49$SELECT;
  private static final SubLSymbol $sym50$SCENARIO_ANSWER_METHOD;
  private static final SubLSymbol $sym51$ANSWER_SUBQUESTIONS;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD;
  private static final SubLString $str55$___S_has_been_answered____;
  private static final SubLString $str56$_______S;
  private static final SubLSymbol $sym57$GET_CONTENT;
  private static final SubLString $str58$____;
  private static final SubLSymbol $sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$IDENTIFIED_ENTITIES;
  private static final SubLSymbol $sym62$SUBQUESTION_ANSWERS;
  private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS;
  private static final SubLSymbol $sym64$INFO_REQUEST;
  private static final SubLSymbol $sym65$CONTENT;
  private static final SubLSymbol $sym66$CONFIDENCE;
  private static final SubLSymbol $sym67$RELEVANCE;
  private static final SubLSymbol $sym68$JUSTIFICATION;
  private static final SubLSymbol $sym69$INFO;
  private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLFloat $float73$0_3;
  private static final SubLSymbol $sym74$PASSAGE_SIMILARITY;
  private static final SubLSymbol $sym75$CORPUS_PASSAGE;
  private static final SubLSymbol $sym76$MAX_INSTANCES;
  private static final SubLSymbol $sym77$TYPICAL_INSTANCE;
  private static final SubLSymbol $sym78$ESSAY_SELECT_METHOD;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$GET_ABSTRACT_PASSAGE_VECTOR;
  private static final SubLSymbol $sym81$ESSAY_TYPICAL_INSTANCE_METHOD;
  private static final SubLSymbol $sym82$KEY_POINTS;
  private static final SubLSymbol $sym83$PRINT;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLString $str87$__ESSAY_sources_;
  private static final SubLString $str88$_entities_;
  private static final SubLString $str89$_;
  private static final SubLSymbol $sym90$ESSAY_PRINT_METHOD;
  private static final SubLSymbol $sym91$CHRONOLOGY;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$RENDER;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$ESSAY_CHRONOLOGY_METHOD;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLSymbol $kw100$FORMAT;
  private static final SubLSymbol $kw101$ORDER;
  private static final SubLSymbol $kw102$TEXT;
  private static final SubLString $str103$;
  private static final SubLSymbol $kw104$SEQUENTIAL;
  private static final SubLString $str105$_;
  private static final SubLSymbol $sym106$GET_SOURCE;
  private static final SubLString $str107$_;
  private static final SubLSymbol $kw108$CHRONOLOGICAL;
  private static final SubLSymbol $sym109$ABSTRACT_PASSAGE_OLDER_METHOD;
  private static final SubLSymbol $sym110$ESSAY_RENDER_METHOD;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLSymbol $sym113$EXTRACT;
  private static final SubLSymbol $sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD;
  private static final SubLSymbol $sym115$BACKGROUND_IDENTIFY_ENTITIES;
  private static final SubLList $list116;
  private static final SubLString $str117$_S;
  private static final SubLSymbol $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD;
  private static final SubLSymbol $sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD;
  private static final SubLSymbol $sym120$GET_ENTITY_BY_NAME;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLSymbol $sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD;
  private static final SubLSymbol $sym125$GET_ENTITIES_BY_TYPES;
  private static final SubLList $list126;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLSymbol $sym129$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const130$EverythingPSC;
  private static final SubLSymbol $sym131$ALL_TYPES;
  private static final SubLSymbol $sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD;
  private static final SubLSymbol $sym133$IDENTIFY_ENTITIES;
  private static final SubLList $list134;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$OUTER_CATCH_FOR_ESSAY_METHOD;
  private static final SubLInteger $int138$32;
  private static final SubLSymbol $sym139$ADD_PASSAGE;
  private static final SubLSymbol $sym140$TEXTUAL_FOCUS_ENTITY_EQUAL;
  private static final SubLSymbol $sym141$SPARSE_VECTOR_P;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_answers(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, NINE_INTEGER, $sym3$ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_answers(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, NINE_INTEGER, $sym3$ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_questions(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, EIGHT_INTEGER, $sym4$QUESTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_questions(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, EIGHT_INTEGER, $sym4$QUESTIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_vector(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, SEVEN_INTEGER, $sym5$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_vector(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, SEVEN_INTEGER, $sym5$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_augmentation_terms(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, SIX_INTEGER, $sym6$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_augmentation_terms(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, SIX_INTEGER, $sym6$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_sentences(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, FIVE_INTEGER, $sym7$SENTENCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_sentences(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, FIVE_INTEGER, $sym7$SENTENCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_corpora(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, FOUR_INTEGER, $sym8$CORPORA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_corpora(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, FOUR_INTEGER, $sym8$CORPORA );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_string(final SubLObject v_scenario)
  {
    return classes.subloop_get_access_protected_instance_slot( v_scenario, THREE_INTEGER, $sym9$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_string(final SubLObject v_scenario, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_scenario, value, THREE_INTEGER, $sym9$STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_tagger(final SubLObject v_scenario)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym10$TAGGER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_tagger(final SubLObject v_scenario, final SubLObject value)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym10$TAGGER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), THREE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_parser(final SubLObject v_scenario)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym11$PARSER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_parser(final SubLObject v_scenario, final SubLObject value)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym11$PARSER, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject get_scenario_lexicon(final SubLObject v_scenario)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym12$LEXICON, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject set_scenario_lexicon(final SubLObject v_scenario, final SubLObject value)
  {
    final SubLObject v_class = v_scenario.isSymbol() ? classes.classes_retrieve_class( v_scenario )
        : ( ( NIL != subloop_structures.class_p( v_scenario ) ) ? v_scenario : ( ( NIL != subloop_structures.instance_p( v_scenario ) ) ? subloop_structures.instance_class( v_scenario ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym12$LEXICON, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject subloop_reserved_initialize_scenario_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym12$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym11$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym10$TAGGER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject subloop_reserved_initialize_scenario_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym16$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym17$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INFORMATION_REQUEST, $sym18$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INFORMATION_REQUEST, $sym19$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym9$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym8$CORPORA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym7$SENTENCES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym6$AUGMENTATION_TERMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym5$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym4$QUESTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SCENARIO, $sym3$ANSWERS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 851L)
  public static SubLObject scenario_p(final SubLObject v_scenario)
  {
    return classes.subloop_instanceof_class( v_scenario, $sym0$SCENARIO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1573L)
  public static SubLObject scenario_viable_question_method(final SubLObject self, final SubLObject v_question)
  {
    SubLObject viable = NIL;
    if( NIL == viable )
    {
      SubLObject csome_list_var;
      SubLObject pred;
      for( csome_list_var = $list25, pred = NIL, pred = csome_list_var.first(); NIL == viable && NIL != csome_list_var; viable = Functions.funcall( pred, v_question ), csome_list_var = csome_list_var
          .rest(), pred = csome_list_var.first() )
      {
      }
    }
    return viable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2129L)
  public static SubLObject scenario_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scenario_method = NIL;
    SubLObject tagger = get_scenario_tagger( self );
    SubLObject v_parser = get_scenario_parser( self );
    SubLObject lexicon = get_scenario_lexicon( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD );
      try
      {
        search_engine.information_request_initialize_method( self );
        if( NIL == lexicon )
        {
          lexicon = object.new_class_instance( $sym30$QUIRK_LEXICON );
        }
        if( NIL == v_parser )
        {
          v_parser = parser.new_charniak_parser( $kw31$WARN, $int32$30 );
        }
        if( NIL == tagger )
        {
          tagger = pos_tagger.get_tagger();
        }
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scenario_tagger( self, tagger );
          set_scenario_parser( self, v_parser );
          set_scenario_lexicon( self, lexicon );
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
      catch_var_for_scenario_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scenario_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2490L)
  public static SubLObject scenario_get_vector_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scenario_method = NIL;
    SubLObject vector = get_scenario_vector( self );
    final SubLObject augmentation_terms = get_scenario_augmentation_terms( self );
    final SubLObject string = get_scenario_string( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD );
      try
      {
        if( NIL != vector )
        {
          Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, vector );
        }
        final SubLObject augmented_string = Sequences.cconcatenate( string, string_utilities.bunge( augmentation_terms, UNPROVIDED ) );
        final SubLObject new_vector = vector = question.new_string_vector( augmented_string );
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, new_vector );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scenario_vector( self, vector );
          set_scenario_augmentation_terms( self, augmentation_terms );
          set_scenario_string( self, string );
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
      catch_var_for_scenario_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scenario_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2847L)
  public static SubLObject new_scenario(final SubLObject scenario_string, SubLObject corpora)
  {
    if( corpora == UNPROVIDED )
    {
      corpora = $list39;
    }
    assert NIL != Types.stringp( scenario_string ) : scenario_string;
    assert NIL != Types.listp( corpora ) : corpora;
    question.initialize_question();
    final SubLObject v_scenario = object.new_class_instance( $sym0$SCENARIO );
    SubLObject sentences = NIL;
    SubLObject questions = NIL;
    instances.set_slot( v_scenario, $sym9$STRING, scenario_string );
    instances.set_slot( v_scenario, $sym8$CORPORA, corpora );
    final SubLObject vector_var = document.paragraph_sentences( document.new_paragraph( scenario_string ) );
    final SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject sentence;
    SubLObject q;
    for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      sentence = Vectors.aref( vector_var, element_num );
      q = question.new_question( string_utilities.bunge( document.sentence_stringify( sentence ), UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      sentences = ConsesLow.cons( sentence, sentences );
      if( NIL != question.question_p( q ) )
      {
        questions = ConsesLow.cons( q, questions );
      }
    }
    instances.set_slot( v_scenario, $sym7$SENTENCES, Sequences.nreverse( sentences ) );
    instances.set_slot( v_scenario, $sym4$QUESTIONS, Sequences.nreverse( questions ) );
    return v_scenario;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3805L)
  public static SubLObject scenario_answer_method(final SubLObject self)
  {
    SubLObject words = NIL;
    SubLObject passages = NIL;
    SubLObject scenario_query = NIL;
    instances.set_slot( self, $sym3$ANSWERS, NIL );
    instances.set_slot( self, $sym6$AUGMENTATION_TERMS, NIL );
    SubLObject cdolist_list_var = instances.get_slot( self, $sym7$SENTENCES );
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = document.sentence_yield_exhaustive( sentence );
      SubLObject word = NIL;
      word = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        words = ConsesLow.cons( document.word_string( word ), words );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        word = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    cdolist_list_var = instances.get_slot( self, $sym8$CORPORA );
    SubLObject corpus = NIL;
    corpus = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject augmented_terms = methods.funcall_class_method_with_2_args( $sym45$QUESTION, $sym46$AUGMENT_TERMS, words, corpus );
      instances.set_slot( self, $sym6$AUGMENTATION_TERMS, ConsesLow.cons( ConsesLow.cons( corpus, augmented_terms ), instances.get_slot( self, $sym6$AUGMENTATION_TERMS ) ) );
      scenario_query = search_engine.new_lemur_query( string_utilities.bunge( ConsesLow.append( words, augmented_terms ), UNPROVIDED ), corpus, TEN_INTEGER, $int47$50 );
      SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args( scenario_query, $sym42$ANSWER );
      SubLObject passage = NIL;
      passage = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        passages = ConsesLow.cons( passage, passages );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        passage = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      corpus = cdolist_list_var.first();
    }
    return new_essay( self, methods.funcall_class_method_with_1_args( $sym48$ESSAY, $sym49$SELECT, passages ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4951L)
  public static SubLObject scenario_answer_subquestions_method(final SubLObject self, SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_scenario_method = NIL;
    SubLObject answers = get_scenario_answers( self );
    final SubLObject questions = get_scenario_questions( self );
    try
    {
      thread.throwStack.push( $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD );
      try
      {
        SubLObject cdolist_list_var = questions;
        SubLObject v_question = NIL;
        v_question = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != methods.funcall_class_method_with_1_args( $sym0$SCENARIO, $sym21$VIABLE_QUESTION, v_question ) )
          {
            final SubLObject q_answers = methods.funcall_instance_method_with_0_args( v_question, $sym42$ANSWER );
            if( NIL != q_answers && NIL != verbose )
            {
              PrintLow.format( T, $str55$___S_has_been_answered____, v_question );
              SubLObject cdolist_list_var_$3 = q_answers;
              SubLObject v_answer = NIL;
              v_answer = cdolist_list_var_$3.first();
              while ( NIL != cdolist_list_var_$3)
              {
                PrintLow.format( T, $str56$_______S, methods.funcall_instance_method_with_0_args( v_answer, $sym57$GET_CONTENT ) );
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                v_answer = cdolist_list_var_$3.first();
              }
              PrintLow.format( T, $str58$____, v_question );
            }
            answers = ConsesLow.append( q_answers, answers );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_question = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_scenario_answers( self, answers );
          set_scenario_questions( self, questions );
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
      catch_var_for_scenario_method = Errors.handleThrowable( ccatch_env_var, $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_scenario_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject get_essay_identified_entities(final SubLObject essay)
  {
    return classes.subloop_get_access_protected_instance_slot( essay, EIGHT_INTEGER, $sym61$IDENTIFIED_ENTITIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject set_essay_identified_entities(final SubLObject essay, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( essay, value, EIGHT_INTEGER, $sym61$IDENTIFIED_ENTITIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject get_essay_subquestion_answers(final SubLObject essay)
  {
    return classes.subloop_get_access_protected_instance_slot( essay, SEVEN_INTEGER, $sym62$SUBQUESTION_ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject set_essay_subquestion_answers(final SubLObject essay, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( essay, value, SEVEN_INTEGER, $sym62$SUBQUESTION_ANSWERS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject subloop_reserved_initialize_essay_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym14$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject subloop_reserved_initialize_essay_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym16$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$OBJECT, $sym17$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym64$INFO_REQUEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym65$CONTENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym66$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym67$RELEVANCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym68$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym42$ANSWER, $sym69$INFO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym48$ESSAY, $sym62$SUBQUESTION_ANSWERS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym48$ESSAY, $sym61$IDENTIFIED_ENTITIES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5655L)
  public static SubLObject essay_p(final SubLObject essay)
  {
    return classes.subloop_instanceof_class( essay, $sym48$ESSAY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6255L)
  public static SubLObject essay_select_method(final SubLObject self, final SubLObject passages)
  {
    assert NIL != Types.listp( passages ) : passages;
    SubLObject selected = NIL;
    final SubLObject require_similarity = $float73$0_3;
    SubLObject cdolist_list_var;
    final SubLObject clusters = cdolist_list_var = clustering.cluster( passages, $sym74$PASSAGE_SIMILARITY, ONE_INTEGER, require_similarity );
    SubLObject cluster = NIL;
    cluster = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject max_passages = methods.funcall_class_method_with_1_args( $sym75$CORPUS_PASSAGE, $sym76$MAX_INSTANCES, clustering.cluster_elements( cluster ) );
      selected = ConsesLow.cons( methods.funcall_class_method_with_1_args( $sym48$ESSAY, $sym77$TYPICAL_INSTANCE, max_passages ), selected );
      cdolist_list_var = cdolist_list_var.rest();
      cluster = cdolist_list_var.first();
    }
    return selected;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6950L)
  public static SubLObject essay_typical_instance_method(final SubLObject self, final SubLObject passages)
  {
    assert NIL != Types.listp( passages ) : passages;
    SubLObject typical = passages.first();
    final SubLObject centroid = sparse_vector.svector_centroid( Mapping.mapcar( $sym80$GET_ABSTRACT_PASSAGE_VECTOR, passages ) );
    final SubLObject centroid_length = sparse_vector.svector_length( centroid );
    if( !centroid_length.isZero() )
    {
      final SubLObject typical_vector = search_engine.get_abstract_passage_vector( typical );
      SubLObject min_distance = safe_svector_cosine_angle( typical_vector, centroid, UNPROVIDED );
      SubLObject distance = NIL;
      SubLObject cdolist_list_var = passages;
      SubLObject passage = NIL;
      passage = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject passage_vector = search_engine.get_abstract_passage_vector( passage );
        distance = safe_svector_cosine_angle( passage_vector, centroid, UNPROVIDED );
        if( distance.numG( min_distance ) )
        {
          min_distance = distance;
          typical = passage;
        }
        cdolist_list_var = cdolist_list_var.rest();
        passage = cdolist_list_var.first();
      }
    }
    return typical;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7819L)
  public static SubLObject new_essay(final SubLObject info_request, final SubLObject passages, SubLObject key_points)
  {
    if( key_points == UNPROVIDED )
    {
      key_points = NIL;
    }
    final SubLObject essay = object.new_class_instance( $sym48$ESSAY );
    answer.set_answer_info_request( essay, info_request );
    answer.set_answer_content( essay, passages );
    instances.set_slot( essay, $sym82$KEY_POINTS, key_points );
    return essay;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8266L)
  public static SubLObject essay_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    final SubLObject identified_entities = get_essay_identified_entities( self );
    final SubLObject content = answer.get_answer_content( self );
    try
    {
      thread.throwStack.push( $sym86$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        streams_high.write_string( $str87$__ESSAY_sources_, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( Sequences.length( content ), stream );
        streams_high.write_string( $str88$_entities_, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( Sequences.length( identified_entities ), stream );
        streams_high.write_string( $str89$_, stream, UNPROVIDED, UNPROVIDED );
        streams_high.terpri( stream );
        Dynamic.sublisp_throw( $sym86$OUTER_CATCH_FOR_ESSAY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_essay_identified_entities( self, identified_entities );
          answer.set_answer_content( self, content );
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
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym86$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8565L)
  public static SubLObject essay_chronology_method(final SubLObject self)
  {
    return methods.funcall_instance_method_with_1_args( self, $sym93$RENDER, $list94 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 8684L)
  public static SubLObject essay_render_method(final SubLObject self, SubLObject strategy)
  {
    if( strategy == UNPROVIDED )
    {
      strategy = $list98;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    final SubLObject content = answer.get_answer_content( self );
    try
    {
      thread.throwStack.push( $sym99$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        final SubLObject format = conses_high.getf( strategy, $kw100$FORMAT, UNPROVIDED );
        final SubLObject order = conses_high.getf( strategy, $kw101$ORDER, UNPROVIDED );
        SubLObject accumulator = NIL;
        SubLObject pcase_var = format;
        if( pcase_var.eql( $kw102$TEXT ) )
        {
          accumulator = $str103$;
        }
        pcase_var = order;
        if( pcase_var.eql( $kw104$SEQUENTIAL ) )
        {
          SubLObject cdolist_list_var = content;
          SubLObject passage = NIL;
          passage = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            accumulator = Sequences.cconcatenate( accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args( passage, $sym57$GET_CONTENT ), string_utilities.$new_line_string$.getGlobalValue(),
              $str105$_, methods.funcall_instance_method_with_0_args( passage, $sym106$GET_SOURCE ), $str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue()
            } );
            cdolist_list_var = cdolist_list_var.rest();
            passage = cdolist_list_var.first();
          }
        }
        else if( pcase_var.eql( $kw108$CHRONOLOGICAL ) )
        {
          SubLObject cdolist_list_var2;
          final SubLObject sorted = cdolist_list_var2 = Sort.sort( conses_high.copy_list( content ), $sym109$ABSTRACT_PASSAGE_OLDER_METHOD, UNPROVIDED );
          SubLObject passage2 = NIL;
          passage2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            accumulator = Sequences.cconcatenate( accumulator, new SubLObject[] { methods.funcall_instance_method_with_0_args( passage2, $sym57$GET_CONTENT ), string_utilities.$new_line_string$.getGlobalValue(),
              $str105$_, methods.funcall_instance_method_with_0_args( passage2, $sym106$GET_SOURCE ), $str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue()
            } );
            cdolist_list_var2 = cdolist_list_var2.rest();
            passage2 = cdolist_list_var2.first();
          }
        }
        Dynamic.sublisp_throw( $sym99$OUTER_CATCH_FOR_ESSAY_METHOD, accumulator );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          answer.set_answer_content( self, content );
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
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym99$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9549L)
  public static SubLObject essay_answer_subquestions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    SubLObject subquestion_answers = get_essay_subquestion_answers( self );
    final SubLObject content = answer.get_answer_content( self );
    final SubLObject info_request = answer.get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym112$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        SubLObject cdolist_list_var = instances.get_slot( info_request, $sym4$QUESTIONS );
        SubLObject v_question = NIL;
        v_question = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != methods.funcall_class_method_with_1_args( $sym48$ESSAY, $sym21$VIABLE_QUESTION, v_question ) )
          {
            SubLObject cdolist_list_var_$4 = content;
            SubLObject passage = NIL;
            passage = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              final SubLObject answers = methods.funcall_instance_method_with_1_args( v_question, $sym113$EXTRACT, passage );
              if( NIL != answers )
              {
                subquestion_answers = ConsesLow.append( methods.funcall_class_method_with_1_args( answers.first(), $sym49$SELECT, answers ), subquestion_answers );
              }
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              passage = cdolist_list_var_$4.first();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_question = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym112$OUTER_CATCH_FOR_ESSAY_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_essay_subquestion_answers( self, subquestion_answers );
          answer.set_answer_content( self, content );
          answer.set_answer_info_request( self, info_request );
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
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym112$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9939L)
  public static SubLObject essay_background_identify_entities_method(final SubLObject self)
  {
    process_utilities.new_task( PrintLow.format( NIL, $str117$_S, Symbols.gensym( UNPROVIDED ) ), $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD, ConsesLow.list( self ), UNPROVIDED );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10109L)
  public static SubLObject essay_get_entity_by_name_method(final SubLObject self, final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    final SubLObject identified_entities = get_essay_identified_entities( self );
    try
    {
      thread.throwStack.push( $sym123$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        assert NIL != Types.stringp( name ) : name;
        SubLObject named_entity = NIL;
        if( NIL == named_entity )
        {
          SubLObject csome_list_var = identified_entities;
          SubLObject entity = NIL;
          entity = csome_list_var.first();
          while ( NIL == named_entity && NIL != csome_list_var)
          {
            if( name.equalp( instances.get_slot( entity, $sym9$STRING ) ) )
            {
              named_entity = entity;
            }
            csome_list_var = csome_list_var.rest();
            entity = csome_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym123$OUTER_CATCH_FOR_ESSAY_METHOD, named_entity );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_essay_identified_entities( self, identified_entities );
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
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym123$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10386L)
  public static SubLObject essay_get_entities_by_types_method(final SubLObject self, final SubLObject desired_types)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    final SubLObject identified_entities = get_essay_identified_entities( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        assert NIL != Types.listp( desired_types ) : desired_types;
        SubLObject appropriate_entities = NIL;
        SubLObject cdolist_list_var = identified_entities;
        SubLObject entity = NIL;
        entity = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym129$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const130$EverythingPSC, thread );
            if( NIL != genls.any_genl_anyP( methods.funcall_instance_method_with_0_args( entity, $sym131$ALL_TYPES ), desired_types, UNPROVIDED, UNPROVIDED ) )
            {
              appropriate_entities = ConsesLow.cons( entity, appropriate_entities );
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
          cdolist_list_var = cdolist_list_var.rest();
          entity = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_ESSAY_METHOD, appropriate_entities );
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_essay_identified_entities( self, identified_entities );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10737L)
  public static SubLObject essay_identify_entities_method(final SubLObject self, SubLObject types_to_identify)
  {
    if( types_to_identify == UNPROVIDED )
    {
      types_to_identify = $list136;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_essay_method = NIL;
    SubLObject identified_entities = get_essay_identified_entities( self );
    final SubLObject content = answer.get_answer_content( self );
    final SubLObject info_request = answer.get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym137$OUTER_CATCH_FOR_ESSAY_METHOD );
      try
      {
        assert NIL != Types.listp( types_to_identify ) : types_to_identify;
        final SubLObject lexicon = instances.get_slot( info_request, $sym12$LEXICON );
        final SubLObject entities_hash = Hashtables.make_hash_table( $int138$32, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        SubLObject cdolist_list_var = content;
        SubLObject passage = NIL;
        passage = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$5;
          final SubLObject passage_entities = cdolist_list_var_$5 = methods.funcall_instance_method_with_2_args( passage, $sym133$IDENTIFY_ENTITIES, lexicon, types_to_identify );
          SubLObject entity = NIL;
          entity = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            final SubLObject string = instances.get_slot( entity, $sym9$STRING );
            final SubLObject value = Hashtables.gethash( string, entities_hash, UNPROVIDED );
            if( NIL != value )
            {
              methods.funcall_instance_method_with_1_args( value, $sym139$ADD_PASSAGE, passage );
            }
            else
            {
              Hashtables.sethash( string, entities_hash, entity );
            }
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            entity = cdolist_list_var_$5.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          passage = cdolist_list_var.first();
        }
        SubLObject key = NIL;
        SubLObject value2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( entities_hash );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            key = Hashtables.getEntryKey( cdohash_entry );
            final SubLObject item_var;
            value2 = ( item_var = Hashtables.getEntryValue( cdohash_entry ) );
            if( NIL == conses_high.member( item_var, identified_entities, $sym140$TEXTUAL_FOCUS_ENTITY_EQUAL, Symbols.symbol_function( IDENTITY ) ) )
            {
              identified_entities = ConsesLow.cons( item_var, identified_entities );
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym137$OUTER_CATCH_FOR_ESSAY_METHOD, identified_entities );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_essay_identified_entities( self, identified_entities );
          answer.set_answer_content( self, content );
          answer.set_answer_info_request( self, info_request );
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
      catch_var_for_essay_method = Errors.handleThrowable( ccatch_env_var, $sym137$OUTER_CATCH_FOR_ESSAY_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_essay_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11512L)
  public static SubLObject safe_svector_cosine_angle(final SubLObject svector1, final SubLObject svector2, SubLObject fall_back)
  {
    if( fall_back == UNPROVIDED )
    {
      fall_back = ZERO_INTEGER;
    }
    assert NIL != sparse_vector.sparse_vector_p( svector1 ) : svector1;
    assert NIL != sparse_vector.sparse_vector_p( svector2 ) : svector2;
    if( sparse_vector.svector_length( svector1 ).isZero() )
    {
      return fall_back;
    }
    if( sparse_vector.svector_length( svector2 ).isZero() )
    {
      return fall_back;
    }
    return sparse_vector.svector_cosine_angle( svector1, svector2 );
  }

  public static SubLObject declare_scenario_file()
  {
    SubLFiles.declareFunction( me, "get_scenario_answers", "GET-SCENARIO-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_answers", "SET-SCENARIO-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_questions", "GET-SCENARIO-QUESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_questions", "SET-SCENARIO-QUESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_vector", "GET-SCENARIO-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_vector", "SET-SCENARIO-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_augmentation_terms", "GET-SCENARIO-AUGMENTATION-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_augmentation_terms", "SET-SCENARIO-AUGMENTATION-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_sentences", "GET-SCENARIO-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_sentences", "SET-SCENARIO-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_corpora", "GET-SCENARIO-CORPORA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_corpora", "SET-SCENARIO-CORPORA", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_string", "GET-SCENARIO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_string", "SET-SCENARIO-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_tagger", "GET-SCENARIO-TAGGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_tagger", "SET-SCENARIO-TAGGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_parser", "GET-SCENARIO-PARSER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_parser", "SET-SCENARIO-PARSER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_scenario_lexicon", "GET-SCENARIO-LEXICON", 1, 0, false );
    SubLFiles.declareFunction( me, "set_scenario_lexicon", "SET-SCENARIO-LEXICON", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scenario_class", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_scenario_instance", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "scenario_p", "SCENARIO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "scenario_viable_question_method", "SCENARIO-VIABLE-QUESTION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "scenario_initialize_method", "SCENARIO-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scenario_get_vector_method", "SCENARIO-GET-VECTOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_scenario", "NEW-SCENARIO", 1, 1, false );
    SubLFiles.declareFunction( me, "scenario_answer_method", "SCENARIO-ANSWER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "scenario_answer_subquestions_method", "SCENARIO-ANSWER-SUBQUESTIONS-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_essay_identified_entities", "GET-ESSAY-IDENTIFIED-ENTITIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_essay_identified_entities", "SET-ESSAY-IDENTIFIED-ENTITIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_essay_subquestion_answers", "GET-ESSAY-SUBQUESTION-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_essay_subquestion_answers", "SET-ESSAY-SUBQUESTION-ANSWERS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_essay_class", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_essay_instance", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "essay_p", "ESSAY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "essay_select_method", "ESSAY-SELECT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "essay_typical_instance_method", "ESSAY-TYPICAL-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_essay", "NEW-ESSAY", 2, 1, false );
    SubLFiles.declareFunction( me, "essay_print_method", "ESSAY-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "essay_chronology_method", "ESSAY-CHRONOLOGY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "essay_render_method", "ESSAY-RENDER-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "essay_answer_subquestions_method", "ESSAY-ANSWER-SUBQUESTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "essay_background_identify_entities_method", "ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "essay_get_entity_by_name_method", "ESSAY-GET-ENTITY-BY-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "essay_get_entities_by_types_method", "ESSAY-GET-ENTITIES-BY-TYPES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "essay_identify_entities_method", "ESSAY-IDENTIFY-ENTITIES-METHOD", 1, 1, false );
    SubLFiles.declareFunction( me, "safe_svector_cosine_angle", "SAFE-SVECTOR-COSINE-ANGLE", 2, 1, false );
    return NIL;
  }

  public static SubLObject init_scenario_file()
  {
    return NIL;
  }

  public static SubLObject setup_scenario_file()
  {
    classes.subloop_new_class( $sym0$SCENARIO, $sym1$INFORMATION_REQUEST, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$SCENARIO, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SCENARIO, $sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SCENARIO, $sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE );
    subloop_reserved_initialize_scenario_class( $sym0$SCENARIO );
    methods.methods_incorporate_class_method( $sym21$VIABLE_QUESTION, $sym0$SCENARIO, $list22, $list23, $list24 );
    methods.subloop_register_class_method( $sym0$SCENARIO, $sym21$VIABLE_QUESTION, $sym26$SCENARIO_VIABLE_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym27$INITIALIZE, $sym0$SCENARIO, $list22, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$SCENARIO, $sym27$INITIALIZE, $sym33$SCENARIO_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_VECTOR, $sym0$SCENARIO, $list35, NIL, $list36 );
    methods.subloop_register_instance_method( $sym0$SCENARIO, $sym34$GET_VECTOR, $sym38$SCENARIO_GET_VECTOR_METHOD );
    methods.methods_incorporate_instance_method( $sym42$ANSWER, $sym0$SCENARIO, $list43, NIL, $list44 );
    methods.subloop_register_instance_method( $sym0$SCENARIO, $sym42$ANSWER, $sym50$SCENARIO_ANSWER_METHOD );
    methods.methods_incorporate_instance_method( $sym51$ANSWER_SUBQUESTIONS, $sym0$SCENARIO, $list35, $list52, $list53 );
    methods.subloop_register_instance_method( $sym0$SCENARIO, $sym51$ANSWER_SUBQUESTIONS, $sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD );
    classes.subloop_new_class( $sym48$ESSAY, $sym42$ANSWER, NIL, NIL, $list60 );
    classes.class_set_implements_slot_listeners( $sym48$ESSAY, NIL );
    classes.subloop_note_class_initialization_function( $sym48$ESSAY, $sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym48$ESSAY, $sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE );
    subloop_reserved_initialize_essay_class( $sym48$ESSAY );
    methods.methods_incorporate_class_method( $sym49$SELECT, $sym48$ESSAY, $list35, $list71, $list72 );
    methods.subloop_register_class_method( $sym48$ESSAY, $sym49$SELECT, $sym78$ESSAY_SELECT_METHOD );
    methods.methods_incorporate_class_method( $sym77$TYPICAL_INSTANCE, $sym48$ESSAY, $list35, $list71, $list79 );
    methods.subloop_register_class_method( $sym48$ESSAY, $sym77$TYPICAL_INSTANCE, $sym81$ESSAY_TYPICAL_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym83$PRINT, $sym48$ESSAY, $list22, $list84, $list85 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym83$PRINT, $sym90$ESSAY_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym91$CHRONOLOGY, $sym48$ESSAY, $list35, NIL, $list92 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym91$CHRONOLOGY, $sym95$ESSAY_CHRONOLOGY_METHOD );
    methods.methods_incorporate_instance_method( $sym93$RENDER, $sym48$ESSAY, $list35, $list96, $list97 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym93$RENDER, $sym110$ESSAY_RENDER_METHOD );
    methods.methods_incorporate_instance_method( $sym51$ANSWER_SUBQUESTIONS, $sym48$ESSAY, $list22, NIL, $list111 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym51$ANSWER_SUBQUESTIONS, $sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym115$BACKGROUND_IDENTIFY_ENTITIES, $sym48$ESSAY, $list35, NIL, $list116 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym115$BACKGROUND_IDENTIFY_ENTITIES, $sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD );
    methods.methods_incorporate_instance_method( $sym120$GET_ENTITY_BY_NAME, $sym48$ESSAY, $list35, $list121, $list122 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym120$GET_ENTITY_BY_NAME, $sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym125$GET_ENTITIES_BY_TYPES, $sym48$ESSAY, $list35, $list126, $list127 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym125$GET_ENTITIES_BY_TYPES, $sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym133$IDENTIFY_ENTITIES, $sym48$ESSAY, $list35, $list134, $list135 );
    methods.subloop_register_instance_method( $sym48$ESSAY, $sym133$IDENTIFY_ENTITIES, $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_scenario_file();
  }

  @Override
  public void initializeVariables()
  {
    init_scenario_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_scenario_file();
  }
  static
  {
    me = new scenario();
    $sym0$SCENARIO = makeSymbol( "SCENARIO" );
    $sym1$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "LEXICON" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSER" ), makeKeyword( "CLASS" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "TAGGER" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "STRING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "CORPORA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SENTENCES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
          makeSymbol( "AUGMENTATION-TERMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "VECTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list(
              makeSymbol( "QUESTIONS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ANSWERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                  makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "VIABLE-QUESTION" ), ConsesLow.list( makeSymbol( "QUESTION" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VECTOR" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                          "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym3$ANSWERS = makeSymbol( "ANSWERS" );
    $sym4$QUESTIONS = makeSymbol( "QUESTIONS" );
    $sym5$VECTOR = makeSymbol( "VECTOR" );
    $sym6$AUGMENTATION_TERMS = makeSymbol( "AUGMENTATION-TERMS" );
    $sym7$SENTENCES = makeSymbol( "SENTENCES" );
    $sym8$CORPORA = makeSymbol( "CORPORA" );
    $sym9$STRING = makeSymbol( "STRING" );
    $sym10$TAGGER = makeSymbol( "TAGGER" );
    $sym11$PARSER = makeSymbol( "PARSER" );
    $sym12$LEXICON = makeSymbol( "LEXICON" );
    $sym13$OBJECT = makeSymbol( "OBJECT" );
    $sym14$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym15$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS" );
    $sym16$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym17$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym18$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym19$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym20$SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE" );
    $sym21$VIABLE_QUESTION = makeSymbol( "VIABLE-QUESTION" );
    $list22 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list23 = ConsesLow.list( makeSymbol( "QUESTION" ) );
    $list24 = ConsesLow.list( makeString( "@param QUESTION, question-p;\n   @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "VIABLE" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( new SubLObject[]
        { makeSymbol( "DEFINITIONAL-QUESTION-P" ), makeSymbol( "INTELLIGENT-AGENT-QUESTION-P" ), makeSymbol( "GEOGRAPHICAL-QUESTION-P" ), makeSymbol( "EVENT-LOCATION-QUESTION-P" ), makeSymbol( "DISTANCE-QUESTION-P" ),
          makeSymbol( "PHYSICAL-QUANTITY-QUESTION-P" ), makeSymbol( "AGE-QUESTION-P" ), makeSymbol( "WHAT-QUESTION-P" ), makeSymbol( "DATE-QUESTION-P" )
        } ) ), makeSymbol( "VIABLE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VIABLE" ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeSymbol( "PRED" ), makeSymbol( "QUESTION" ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "VIABLE" ) ) ) );
    $list25 = ConsesLow.list( new SubLObject[] { makeSymbol( "DEFINITIONAL-QUESTION-P" ), makeSymbol( "INTELLIGENT-AGENT-QUESTION-P" ), makeSymbol( "GEOGRAPHICAL-QUESTION-P" ), makeSymbol( "EVENT-LOCATION-QUESTION-P" ),
      makeSymbol( "DISTANCE-QUESTION-P" ), makeSymbol( "PHYSICAL-QUANTITY-QUESTION-P" ), makeSymbol( "AGE-QUESTION-P" ), makeSymbol( "WHAT-QUESTION-P" ), makeSymbol( "DATE-QUESTION-P" )
    } );
    $sym26$SCENARIO_VIABLE_QUESTION_METHOD = makeSymbol( "SCENARIO-VIABLE-QUESTION-METHOD" );
    $sym27$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list28 = ConsesLow.list( makeString( "Initializes all class slots in question\n   @return scenario-p\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list(
        makeSymbol( "PUNLESS" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "QUIRK-LEXICON" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol(
                "NEW-CHARNIAK-PARSER" ), makeKeyword( "WARN" ), makeInteger( 30 ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "TAGGER" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TAGGER" ),
                    ConsesLow.list( makeSymbol( "GET-TAGGER" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCENARIO-METHOD" );
    $sym30$QUIRK_LEXICON = makeSymbol( "QUIRK-LEXICON" );
    $kw31$WARN = makeKeyword( "WARN" );
    $int32$30 = makeInteger( 30 );
    $sym33$SCENARIO_INITIALIZE_METHOD = makeSymbol( "SCENARIO-INITIALIZE-METHOD" );
    $sym34$GET_VECTOR = makeSymbol( "GET-VECTOR" );
    $list35 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list36 = ConsesLow.list( makeString( "@return sparse-vector-p, a vector representation of this \n   @owner bertolo" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "VECTOR" ), ConsesLow.list( makeSymbol(
        "RET" ), makeSymbol( "VECTOR" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AUGMENTED-STRING" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "STRING" ),
            ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "AUGMENTATION-TERMS" ) ) ) ), ConsesLow.list( makeSymbol( "NEW-VECTOR" ), ConsesLow.list( makeSymbol( "NEW-STRING-VECTOR" ), makeSymbol(
                "AUGMENTED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VECTOR" ), makeSymbol( "NEW-VECTOR" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-VECTOR" ) ) ) );
    $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCENARIO-METHOD" );
    $sym38$SCENARIO_GET_VECTOR_METHOD = makeSymbol( "SCENARIO-GET-VECTOR-METHOD" );
    $list39 = ConsesLow.list( makeString( "AQUAINT" ) );
    $sym40$STRINGP = makeSymbol( "STRINGP" );
    $sym41$LISTP = makeSymbol( "LISTP" );
    $sym42$ANSWER = makeSymbol( "ANSWER" );
    $list43 = ConsesLow.list( makeKeyword( "PUBLIC" ), makeKeyword( "NO-MEMBER-VARIABLES" ) );
    $list44 = ConsesLow.list( makeString( "@return essay-p, an essay to answer this \n   @owner bertolo" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORDS" ), NIL ), ConsesLow
        .list( makeSymbol( "PASSAGES" ), NIL ), makeSymbol( "SCENARIO-QUERY" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWERS" ) ), NIL ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "AUGMENTATION-TERMS" ) ), NIL ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
            makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENTENCES" ) ) ) ), ConsesLow.list( makeSymbol(
                "SENTENCE-DO-WORDS" ), ConsesLow.list( makeSymbol( "WORD" ), makeSymbol( "SENTENCE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "WORD-STRING" ), makeSymbol( "WORD" ) ),
                    makeSymbol( "WORDS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "CORPORA" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "AUGMENTED-TERMS" ), ConsesLow.list( makeSymbol( "FCM" ),
                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "AUGMENT-TERMS" ) ), makeSymbol( "WORDS" ), makeSymbol( "CORPUS" ) ) ) ),
                            ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "AUGMENTATION-TERMS" ) ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow
                                .list( makeSymbol( "CONS" ), makeSymbol( "CORPUS" ), makeSymbol( "AUGMENTED-TERMS" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), makeSymbol( "AUGMENTATION-TERMS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SCENARIO-QUERY" ), ConsesLow.list( makeSymbol( "NEW-LEMUR-QUERY" ), ConsesLow
                                        .list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "WORDS" ), makeSymbol( "AUGMENTED-TERMS" ) ) ), makeSymbol( "CORPUS" ), TEN_INTEGER, makeInteger(
                                            50 ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SCENARIO-QUERY" ), ConsesLow.list(
                                                makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "PASSAGE" ), makeSymbol( "PASSAGES" ) ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NEW-ESSAY" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                        makeSymbol( "ESSAY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SELECT" ) ), makeSymbol( "PASSAGES" ) ) ) ) ) );
    $sym45$QUESTION = makeSymbol( "QUESTION" );
    $sym46$AUGMENT_TERMS = makeSymbol( "AUGMENT-TERMS" );
    $int47$50 = makeInteger( 50 );
    $sym48$ESSAY = makeSymbol( "ESSAY" );
    $sym49$SELECT = makeSymbol( "SELECT" );
    $sym50$SCENARIO_ANSWER_METHOD = makeSymbol( "SCENARIO-ANSWER-METHOD" );
    $sym51$ANSWER_SUBQUESTIONS = makeSymbol( "ANSWER-SUBQUESTIONS" );
    $list52 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "VERBOSE" ) );
    $list53 = ConsesLow.list( makeString(
        "@param VERBOSE, booleanp\n   @return scenario-p, this scenario\n   As a side effect it computes answers to all viable subquestions of this scenario and\n   stores them in the appropriate slot of this object.\n   @owner bertolo" ),
        ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "QUESTION" ), makeSymbol( "QUESTIONS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "SCENARIO" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VIABLE-QUESTION" ) ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                ConsesLow.list( makeSymbol( "Q-ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ANSWER" ) ) ) ) ), ConsesLow.list( makeSymbol(
                    "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "Q-ANSWERS" ), makeSymbol( "VERBOSE" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "~%~S has been answered: ~%" ),
                        makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "Q-ANSWERS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString(
                            "~%    ~S" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ),
                                T, makeString( "~%~%" ), makeSymbol( "QUESTION" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "Q-ANSWERS" ),
                                    makeSymbol( "ANSWERS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SCENARIO-METHOD" );
    $str55$___S_has_been_answered____ = makeString( "~%~S has been answered: ~%" );
    $str56$_______S = makeString( "~%    ~S" );
    $sym57$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $str58$____ = makeString( "~%~%" );
    $sym59$SCENARIO_ANSWER_SUBQUESTIONS_METHOD = makeSymbol( "SCENARIO-ANSWER-SUBQUESTIONS-METHOD" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBQUESTION-ANSWERS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "IDENTIFIED-ENTITIES" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SELECT" ), ConsesLow.list( makeSymbol( "PASSAGES" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-CLASS-METHOD" ), makeSymbol( "TYPICAL-INSTANCE" ), ConsesLow.list( makeSymbol( "PASSAGES" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                "VIABLE-QUESTION" ), ConsesLow.list( makeSymbol( "QUESTION" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT" ), ConsesLow.list( makeSymbol(
                    "STREAM" ), makeSymbol( "DEPTH" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RENDER" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol(
                        "RENDERING-P-LIST" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-SUBQUESTIONS" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym61$IDENTIFIED_ENTITIES = makeSymbol( "IDENTIFIED-ENTITIES" );
    $sym62$SUBQUESTION_ANSWERS = makeSymbol( "SUBQUESTION-ANSWERS" );
    $sym63$SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS" );
    $sym64$INFO_REQUEST = makeSymbol( "INFO-REQUEST" );
    $sym65$CONTENT = makeSymbol( "CONTENT" );
    $sym66$CONFIDENCE = makeSymbol( "CONFIDENCE" );
    $sym67$RELEVANCE = makeSymbol( "RELEVANCE" );
    $sym68$JUSTIFICATION = makeSymbol( "JUSTIFICATION" );
    $sym69$INFO = makeSymbol( "INFO" );
    $sym70$SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE" );
    $list71 = ConsesLow.list( makeSymbol( "PASSAGES" ) );
    $list72 = ConsesLow.list( makeString(
        "@param PASSAGES listp;\n     @return listp; the list of conses of the most salient passages among PASSAGES \n     and their confidences, ranked by their salientness.\n     @owner aldag" ), ConsesLow.list(
            makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGES" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SELECTED" ), NIL ), ConsesLow.list(
                makeSymbol( "REQUIRE-SIMILARITY" ), makeDouble( 0.3 ) ), ConsesLow.list( makeSymbol( "CLUSTERS" ), ConsesLow.list( makeSymbol( "CLUSTER" ), makeSymbol( "PASSAGES" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "PASSAGE-SIMILARITY" ) ), ONE_INTEGER, makeSymbol( "REQUIRE-SIMILARITY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CLUSTER" ), makeSymbol(
                        "CLUSTERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAX-PASSAGES" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                            makeSymbol( "CORPUS-PASSAGE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAX-INSTANCES" ) ), ConsesLow.list( makeSymbol( "CLUSTER-ELEMENTS" ), makeSymbol( "CLUSTER" ) ) ) ) ),
                            ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ESSAY" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "TYPICAL-INSTANCE" ) ), makeSymbol( "MAX-PASSAGES" ) ), makeSymbol( "SELECTED" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELECTED" ) ) ) );
    $float73$0_3 = makeDouble( 0.3 );
    $sym74$PASSAGE_SIMILARITY = makeSymbol( "PASSAGE-SIMILARITY" );
    $sym75$CORPUS_PASSAGE = makeSymbol( "CORPUS-PASSAGE" );
    $sym76$MAX_INSTANCES = makeSymbol( "MAX-INSTANCES" );
    $sym77$TYPICAL_INSTANCE = makeSymbol( "TYPICAL-INSTANCE" );
    $sym78$ESSAY_SELECT_METHOD = makeSymbol( "ESSAY-SELECT-METHOD" );
    $list79 = ConsesLow.list( makeString( "@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS.\n    @owner aldag" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGES" ),
        makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPICAL" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "PASSAGES" ) ) ), ConsesLow.list(
            makeSymbol( "CENTROID" ), ConsesLow.list( makeSymbol( "SVECTOR-CENTROID" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ABSTRACT-PASSAGE-VECTOR" ) ),
                makeSymbol( "PASSAGES" ) ) ) ), ConsesLow.list( makeSymbol( "CENTROID-LENGTH" ), ConsesLow.list( makeSymbol( "SVECTOR-LENGTH" ), makeSymbol( "CENTROID" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                    ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol( "CENTROID-LENGTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPICAL-VECTOR" ), ConsesLow.list(
                        makeSymbol( "GET-ABSTRACT-PASSAGE-VECTOR" ), makeSymbol( "TYPICAL" ) ) ), ConsesLow.list( makeSymbol( "MIN-DISTANCE" ), ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), makeSymbol(
                            "TYPICAL-VECTOR" ), makeSymbol( "CENTROID" ) ) ), makeSymbol( "DISTANCE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "PASSAGES" ) ),
                                ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PASSAGE-VECTOR" ), ConsesLow.list( makeSymbol( "GET-ABSTRACT-PASSAGE-VECTOR" ), makeSymbol(
                                    "PASSAGE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DISTANCE" ), ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), makeSymbol( "PASSAGE-VECTOR" ),
                                        makeSymbol( "CENTROID" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "DISTANCE" ), makeSymbol( "MIN-DISTANCE" ) ), ConsesLow.list(
                                            makeSymbol( "CSETQ" ), makeSymbol( "MIN-DISTANCE" ), makeSymbol( "DISTANCE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPICAL" ), makeSymbol(
                                                "PASSAGE" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TYPICAL" ) ) ) );
    $sym80$GET_ABSTRACT_PASSAGE_VECTOR = makeSymbol( "GET-ABSTRACT-PASSAGE-VECTOR" );
    $sym81$ESSAY_TYPICAL_INSTANCE_METHOD = makeSymbol( "ESSAY-TYPICAL-INSTANCE-METHOD" );
    $sym82$KEY_POINTS = makeSymbol( "KEY-POINTS" );
    $sym83$PRINT = makeSymbol( "PRINT" );
    $list84 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( "#<ESSAY sources:" ), makeSymbol( "STREAM" ) ), ConsesLow.list(
        makeSymbol( "PRIN1" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CONTENT" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( " entities:" ), makeSymbol(
            "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "IDENTIFIED-ENTITIES" ) ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ),
                makeString( ">" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "TERPRI" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym86$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $str87$__ESSAY_sources_ = makeString( "#<ESSAY sources:" );
    $str88$_entities_ = makeString( " entities:" );
    $str89$_ = makeString( ">" );
    $sym90$ESSAY_PRINT_METHOD = makeSymbol( "ESSAY-PRINT-METHOD" );
    $sym91$CHRONOLOGY = makeSymbol( "CHRONOLOGY" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "RENDER" ) ), ConsesLow.list( makeSymbol(
        "QUOTE" ), ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword( "ORDER" ), makeKeyword( "CHRONOLOGICAL" ) ) ) ) ) );
    $sym93$RENDER = makeSymbol( "RENDER" );
    $list94 = ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword( "ORDER" ), makeKeyword( "CHRONOLOGICAL" ) );
    $sym95$ESSAY_CHRONOLOGY_METHOD = makeSymbol( "ESSAY-CHRONOLOGY-METHOD" );
    $list96 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRATEGY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword(
        "ORDER" ), makeKeyword( "SEQUENTIAL" ) ) ) ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FORMAT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "STRATEGY" ), makeKeyword( "FORMAT" ) ) ),
        ConsesLow.list( makeSymbol( "ORDER" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "STRATEGY" ), makeKeyword( "ORDER" ) ) ), makeSymbol( "ACCUMULATOR" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
            "FORMAT" ), ConsesLow.list( makeKeyword( "TEXT" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACCUMULATOR" ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "ORDER" ),
                ConsesLow.list( makeKeyword( "SEQUENTIAL" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "CONTENT" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                    "ACCUMULATOR" ), ConsesLow.list( new SubLObject[]
                    { makeSymbol( "CCONCATENATE" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ),
                      makeSymbol( "*NEW-LINE-STRING*" ), makeString( "(" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SOURCE" ) ) ), makeString(
                          ")" ), makeSymbol( "*NEW-LINE-STRING*" ), makeSymbol( "*NEW-LINE-STRING*" )
                } ) ) ) ), ConsesLow.list( makeKeyword( "CHRONOLOGICAL" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SORTED" ), ConsesLow.list( makeSymbol( "SORT" ), ConsesLow
                    .list( makeSymbol( "COPY-LIST" ), makeSymbol( "CONTENT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ABSTRACT-PASSAGE-OLDER-METHOD" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                        ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "SORTED" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( new SubLObject[]
                        { makeSymbol( "CCONCATENATE" ), makeSymbol( "ACCUMULATOR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ),
                          makeSymbol( "*NEW-LINE-STRING*" ), makeString( "(" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SOURCE" ) ) ),
                          makeString( ")" ), makeSymbol( "*NEW-LINE-STRING*" ), makeSymbol( "*NEW-LINE-STRING*" )
                        } ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ACCUMULATOR" ) ) ) );
    $list98 = ConsesLow.list( makeKeyword( "FORMAT" ), makeKeyword( "TEXT" ), makeKeyword( "ORDER" ), makeKeyword( "SEQUENTIAL" ) );
    $sym99$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $kw100$FORMAT = makeKeyword( "FORMAT" );
    $kw101$ORDER = makeKeyword( "ORDER" );
    $kw102$TEXT = makeKeyword( "TEXT" );
    $str103$ = makeString( "" );
    $kw104$SEQUENTIAL = makeKeyword( "SEQUENTIAL" );
    $str105$_ = makeString( "(" );
    $sym106$GET_SOURCE = makeSymbol( "GET-SOURCE" );
    $str107$_ = makeString( ")" );
    $kw108$CHRONOLOGICAL = makeKeyword( "CHRONOLOGICAL" );
    $sym109$ABSTRACT_PASSAGE_OLDER_METHOD = makeSymbol( "ABSTRACT-PASSAGE-OLDER-METHOD" );
    $sym110$ESSAY_RENDER_METHOD = makeSymbol( "ESSAY-RENDER-METHOD" );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "INFO-REQUEST" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "QUESTIONS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ESSAY" ) ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "VIABLE-QUESTION" ) ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ), makeSymbol( "CONTENT" ) ), ConsesLow.list(
                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QUESTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "EXTRACT" ) ), makeSymbol( "PASSAGE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBQUESTION-ANSWERS" ), ConsesLow
                        .list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "CAR" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SELECT" ) ),
                            makeSymbol( "ANSWERS" ) ), makeSymbol( "SUBQUESTION-ANSWERS" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym112$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $sym113$EXTRACT = makeSymbol( "EXTRACT" );
    $sym114$ESSAY_ANSWER_SUBQUESTIONS_METHOD = makeSymbol( "ESSAY-ANSWER-SUBQUESTIONS-METHOD" );
    $sym115$BACKGROUND_IDENTIFY_ENTITIES = makeSymbol( "BACKGROUND-IDENTIFY-ENTITIES" );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-TASK" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~S" ), ConsesLow.list( makeSymbol( "GENSYM" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "ESSAY-IDENTIFY-ENTITIES-METHOD" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $str117$_S = makeString( "~S" );
    $sym118$ESSAY_IDENTIFY_ENTITIES_METHOD = makeSymbol( "ESSAY-IDENTIFY-ENTITIES-METHOD" );
    $sym119$ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD = makeSymbol( "ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD" );
    $sym120$GET_ENTITY_BY_NAME = makeSymbol( "GET-ENTITY-BY-NAME" );
    $list121 = ConsesLow.list( makeSymbol( "NAME" ) );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "NAMED-ENTITY" ) ), ConsesLow
        .list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ENTITY" ), makeSymbol( "IDENTIFIED-ENTITIES" ), makeSymbol( "NAMED-ENTITY" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUALP,
            makeSymbol( "NAME" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "NAMED-ENTITY" ), makeSymbol( "ENTITY" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NAMED-ENTITY" ) ) ) );
    $sym123$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $sym124$ESSAY_GET_ENTITY_BY_NAME_METHOD = makeSymbol( "ESSAY-GET-ENTITY-BY-NAME-METHOD" );
    $sym125$GET_ENTITIES_BY_TYPES = makeSymbol( "GET-ENTITIES-BY-TYPES" );
    $list126 = ConsesLow.list( makeSymbol( "DESIRED-TYPES" ) );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "DESIRED-TYPES" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "APPROPRIATE-ENTITIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTITY" ), makeSymbol( "IDENTIFIED-ENTITIES" ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow
            .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ANY-GENL-ANY?" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ALL-TYPES" ) ) ),
                makeSymbol( "DESIRED-TYPES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ENTITY" ), makeSymbol( "APPROPRIATE-ENTITIES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "APPROPRIATE-ENTITIES" ) ) ) );
    $sym128$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $sym129$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const130$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym131$ALL_TYPES = makeSymbol( "ALL-TYPES" );
    $sym132$ESSAY_GET_ENTITIES_BY_TYPES_METHOD = makeSymbol( "ESSAY-GET-ENTITIES-BY-TYPES-METHOD" );
    $sym133$IDENTIFY_ENTITIES = makeSymbol( "IDENTIFY-ENTITIES" );
    $list134 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TYPES-TO-IDENTIFY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
        "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell( makeString( "Organization" ) ) ) ) ) );
    $list135 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TYPES-TO-IDENTIFY" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "LEXICON" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "INFO-REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXICON" ) ) ) ), ConsesLow.list( makeSymbol( "ENTITIES-HASH" ), ConsesLow
            .list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 32 ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PASSAGE" ),
                makeSymbol( "CONTENT" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PASSAGE-ENTITIES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "IDENTIFY-ENTITIES" ) ), makeSymbol( "LEXICON" ), makeSymbol( "TYPES-TO-IDENTIFY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                        makeSymbol( "ENTITY" ), makeSymbol( "PASSAGE-ENTITIES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                            makeSymbol( "ENTITY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STRING" ) ) ) ), ConsesLow.list( makeSymbol( "VALUE" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol(
                                "STRING" ), makeSymbol( "ENTITIES-HASH" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "VALUE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "VALUE" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "ADD-PASSAGE" ) ), makeSymbol( "PASSAGE" ) ), ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol( "STRING" ), makeSymbol( "ENTITIES-HASH" ),
                                        makeSymbol( "ENTITY" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "ENTITIES-HASH" ) ), ConsesLow
                                            .list( makeSymbol( "IGNORE" ), makeSymbol( "KEY" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "VALUE" ), makeSymbol( "IDENTIFIED-ENTITIES" ), ConsesLow.list(
                                                makeSymbol( "QUOTE" ), makeSymbol( "TEXTUAL-FOCUS-ENTITY-EQUAL" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "IDENTIFIED-ENTITIES" ) ) ) );
    $list136 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Organization" ) ) );
    $sym137$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ESSAY-METHOD" );
    $int138$32 = makeInteger( 32 );
    $sym139$ADD_PASSAGE = makeSymbol( "ADD-PASSAGE" );
    $sym140$TEXTUAL_FOCUS_ENTITY_EQUAL = makeSymbol( "TEXTUAL-FOCUS-ENTITY-EQUAL" );
    $sym141$SPARSE_VECTOR_P = makeSymbol( "SPARSE-VECTOR-P" );
  }
}
/*
 * 
 * Total time: 764 ms
 * 
 */