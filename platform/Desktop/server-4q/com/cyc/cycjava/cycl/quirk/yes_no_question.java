package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class yes_no_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.yes_no_question";
  public static final String myFingerPrint = "14dcbd3943492d62a9a9ea5e50e50e5cad9413821e597061afc4c7e22fa840a5";
  private static final SubLSymbol $sym0$YES_NO_QUESTION;
  private static final SubLSymbol $sym1$QUESTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$LEXICON;
  private static final SubLSymbol $sym6$PARSER;
  private static final SubLSymbol $sym7$TAGGER;
  private static final SubLSymbol $sym8$CHUNKER;
  private static final SubLSymbol $sym9$MAX_CANDIDATES;
  private static final SubLSymbol $sym10$MAX_CONFIDENCE;
  private static final SubLSymbol $sym11$LEARNABLE_TYPES;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS;
  private static final SubLSymbol $sym13$ISOLATED_P;
  private static final SubLSymbol $sym14$INSTANCE_NUMBER;
  private static final SubLSymbol $sym15$INFORMATION_REQUEST;
  private static final SubLSymbol $sym16$ERROR_HANDLING;
  private static final SubLSymbol $sym17$TIMEOUT;
  private static final SubLSymbol $sym18$STRING;
  private static final SubLSymbol $sym19$PARSE;
  private static final SubLSymbol $sym20$ANSWER_TYPES;
  private static final SubLSymbol $sym21$CORPORA;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE;
  private static final SubLSymbol $sym23$ISA_;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$GET_DAUGHTER;
  private static final SubLSymbol $sym28$YES_NO_QUESTION_ISA__METHOD;
  private static final SubLList $list29;
  private static final SubLObject $const30$SubLBoolean;
  private static final SubLSymbol $sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
  public static SubLObject subloop_reserved_initialize_yes_no_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym5$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym6$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym7$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym8$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym9$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym10$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym11$LEARNABLE_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
  public static SubLObject subloop_reserved_initialize_yes_no_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym13$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$INFORMATION_REQUEST, $sym16$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$INFORMATION_REQUEST, $sym17$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym18$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym19$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym20$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym21$CORPORA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
  public static SubLObject yes_no_question_p(final SubLObject v_yes_no_question)
  {
    return classes.subloop_instanceof_class( v_yes_no_question, $sym0$YES_NO_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 1001L)
  public static SubLObject yes_no_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.sq_tree_p( tree ) && NIL != word_tree.aux_verb_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym27$GET_DAUGHTER, ZERO_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 1256L)
  public static SubLObject yes_no_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const30$SubLBoolean ) );
  }

  public static SubLObject declare_yes_no_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_yes_no_question_class", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_yes_no_question_instance", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "yes_no_question_p", "YES-NO-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "yes_no_question_isaP_method", "YES-NO-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "yes_no_question_answer_types_method", "YES-NO-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_yes_no_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_yes_no_question_file()
  {
    classes.subloop_new_class( $sym0$YES_NO_QUESTION, $sym1$QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$YES_NO_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$YES_NO_QUESTION, $sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$YES_NO_QUESTION, $sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE );
    subloop_reserved_initialize_yes_no_question_class( $sym0$YES_NO_QUESTION );
    methods.methods_incorporate_class_method( $sym23$ISA_, $sym0$YES_NO_QUESTION, $list24, $list25, $list26 );
    methods.subloop_register_class_method( $sym0$YES_NO_QUESTION, $sym23$ISA_, $sym28$YES_NO_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym20$ANSWER_TYPES, $sym0$YES_NO_QUESTION, $list24, NIL, $list29 );
    methods.subloop_register_instance_method( $sym0$YES_NO_QUESTION, $sym20$ANSWER_TYPES, $sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_yes_no_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_yes_no_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_yes_no_question_file();
  }
  static
  {
    me = new yes_no_question();
    $sym0$YES_NO_QUESTION = makeSymbol( "YES-NO-QUESTION" );
    $sym1$QUESTION = makeSymbol( "QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$LEXICON = makeSymbol( "LEXICON" );
    $sym6$PARSER = makeSymbol( "PARSER" );
    $sym7$TAGGER = makeSymbol( "TAGGER" );
    $sym8$CHUNKER = makeSymbol( "CHUNKER" );
    $sym9$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym10$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym11$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS" );
    $sym13$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym14$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym15$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym16$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym17$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym18$STRING = makeSymbol( "STRING" );
    $sym19$PARSE = makeSymbol( "PARSE" );
    $sym20$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym21$CORPORA = makeSymbol( "CORPORA" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE" );
    $sym23$ISA_ = makeSymbol( "ISA?" );
    $list24 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list25 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list26 = ConsesLow.list( makeString( "@param PARSE question-tree-p\n   @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
        "CAND" ), ConsesLow.list( makeSymbol( "SQ-TREE-P" ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ) ) ) );
    $sym27$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym28$YES_NO_QUESTION_ISA__METHOD = makeSymbol( "YES-NO-QUESTION-ISA?-METHOD" );
    $list29 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "SubLBoolean" ) ) ) ) ) );
    $const30$SubLBoolean = constant_handles.reader_make_constant_shell( makeString( "SubLBoolean" ) );
    $sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "YES-NO-QUESTION-ANSWER-TYPES-METHOD" );
  }
}
/*
 * 
 * Total time: 76 ms
 * 
 */