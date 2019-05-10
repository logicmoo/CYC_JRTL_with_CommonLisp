package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_location_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.event_location_question";
  public static final String myFingerPrint = "6e5e4df0ea8b7c152d1c526303190d7eb7452d8883a78619b29134250f16c579";
  private static final SubLSymbol $sym0$EVENT_LOCATION_QUESTION;
  private static final SubLSymbol $sym1$WH_QUESTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$QUESTION;
  private static final SubLSymbol $sym6$LEXICON;
  private static final SubLSymbol $sym7$PARSER;
  private static final SubLSymbol $sym8$TAGGER;
  private static final SubLSymbol $sym9$CHUNKER;
  private static final SubLSymbol $sym10$MAX_CANDIDATES;
  private static final SubLSymbol $sym11$MAX_CONFIDENCE;
  private static final SubLSymbol $sym12$LEARNABLE_TYPES;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE;
  private static final SubLSymbol $sym24$ISA_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_DAUGHTER;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$GET_PREDICATE;
  private static final SubLSymbol $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD;
  private static final SubLList $list33;
  private static final SubLObject $const34$Place;
  private static final SubLSymbol $sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
  public static SubLObject subloop_reserved_initialize_event_location_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym6$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym7$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym8$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym9$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym10$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym11$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym12$LEARNABLE_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
  public static SubLObject subloop_reserved_initialize_event_location_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$INFORMATION_REQUEST, $sym17$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$INFORMATION_REQUEST, $sym18$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym19$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym20$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym21$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym22$CORPORA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
  public static SubLObject event_location_question_p(final SubLObject v_event_location_question)
  {
    return classes.subloop_instanceof_class( v_event_location_question, $sym0$EVENT_LOCATION_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 1041L)
  public static SubLObject event_location_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ), $list30, UNPROVIDED ) && NIL == word_tree.aux_verb_tree_p(
            methods.funcall_instance_method_with_0_args( tree, $sym31$GET_PREDICATE ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 1440L)
  public static SubLObject event_location_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const34$Place ) );
  }

  public static SubLObject declare_event_location_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_event_location_question_class", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_event_location_question_instance", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "event_location_question_p", "EVENT-LOCATION-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "event_location_question_isaP_method", "EVENT-LOCATION-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "event_location_question_answer_types_method", "EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_event_location_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_event_location_question_file()
  {
    classes.subloop_new_class( $sym0$EVENT_LOCATION_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$EVENT_LOCATION_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$EVENT_LOCATION_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$EVENT_LOCATION_QUESTION, $sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE );
    subloop_reserved_initialize_event_location_question_class( $sym0$EVENT_LOCATION_QUESTION );
    methods.methods_incorporate_class_method( $sym24$ISA_, $sym0$EVENT_LOCATION_QUESTION, $list25, $list26, $list27 );
    methods.subloop_register_class_method( $sym0$EVENT_LOCATION_QUESTION, $sym24$ISA_, $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$EVENT_LOCATION_QUESTION, $list25, NIL, $list33 );
    methods.subloop_register_instance_method( $sym0$EVENT_LOCATION_QUESTION, $sym21$ANSWER_TYPES, $sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_event_location_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_event_location_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_event_location_question_file();
  }
  static
  {
    me = new event_location_question();
    $sym0$EVENT_LOCATION_QUESTION = makeSymbol( "EVENT-LOCATION-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$QUESTION = makeSymbol( "QUESTION" );
    $sym6$LEXICON = makeSymbol( "LEXICON" );
    $sym7$PARSER = makeSymbol( "PARSER" );
    $sym8$TAGGER = makeSymbol( "TAGGER" );
    $sym9$CHUNKER = makeSymbol( "CHUNKER" );
    $sym10$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym11$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym12$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE" );
    $sym24$ISA_ = makeSymbol( "ISA?" );
    $list25 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list26 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list27 = ConsesLow.list( makeString( "@return boolen; t if TREE is an event location (aka where) question, \n   nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow
        .list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol(
            "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "where" ), makeString( "whence" ), makeString(
                    "whither" ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "GET-PREDICATE" ) ) ) ) ) ) ) );
    $sym28$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "where" ), makeString( "whence" ), makeString( "whither" ) );
    $sym31$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD = makeSymbol( "EVENT-LOCATION-QUESTION-ISA?-METHOD" );
    $list33 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ) ) ) );
    $const34$Place = constant_handles.reader_make_constant_shell( makeString( "Place" ) );
    $sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD" );
  }
}
/*
 * 
 * Total time: 30 ms
 * 
 */