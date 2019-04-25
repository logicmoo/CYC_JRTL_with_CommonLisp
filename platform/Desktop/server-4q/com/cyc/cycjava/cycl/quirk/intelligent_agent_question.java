package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class intelligent_agent_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.intelligent_agent_question";
  public static final String myFingerPrint = "dc5617775db505b64f28e333e0e77ac6a74a1600e62f2a460b861b3bb84c1828";
  private static final SubLSymbol $sym0$INTELLIGENT_AGENT_QUESTION;
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
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE;
  private static final SubLSymbol $sym24$ISA_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_DAUGHTER;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$GET_PREDICATE;
  private static final SubLSymbol $sym32$GET_SUBJECT;
  private static final SubLSymbol $sym33$GET_HEAD;
  private static final SubLSymbol $sym34$GET_CATEGORY;
  private static final SubLSymbol $kw35$NN;
  private static final SubLString $str36$the;
  private static final SubLSymbol $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym38$QUERIFY;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym41$EXTRACT;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD;
  private static final SubLSymbol $sym45$LEARN;
  private static final SubLSymbol $sym46$GET_CONTENT;
  private static final SubLSymbol $sym47$LEXIFY;
  private static final SubLSymbol $sym48$SUBJECT_QUESTION_P;
  private static final SubLSymbol $sym49$GET_SEMANTIC_OBJECTS;
  private static final SubLSymbol $sym50$GET_SEMANTIC_SUBJECT;
  private static final SubLSymbol $sym51$YIELD;
  private static final SubLSymbol $sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD;
  private static final SubLList $list53;
  private static final SubLObject $const54$Person;
  private static final SubLObject $const55$IntelligentAgent;
  private static final SubLSymbol $sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
  public static SubLObject subloop_reserved_initialize_intelligent_agent_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
  public static SubLObject subloop_reserved_initialize_intelligent_agent_question_instance(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
  public static SubLObject intelligent_agent_question_p(final SubLObject v_intelligent_agent_question)
  {
    return classes.subloop_instanceof_class( v_intelligent_agent_question, $sym0$INTELLIGENT_AGENT_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1166L)
  public static SubLObject intelligent_agent_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ), $list30, UNPROVIDED ) && ( NIL == word_tree.aux_verb_tree_p(
            methods.funcall_instance_method_with_0_args( tree, $sym31$GET_PREDICATE ) ) || ( NIL != word_tree.aux_verb_tree_p( methods.funcall_instance_method_with_0_args( tree, $sym31$GET_PREDICATE ) ) && NIL != methods
                .funcall_instance_method_with_0_args( tree, $sym32$GET_SUBJECT ) && ( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args(
                    tree, $sym32$GET_SUBJECT ), $sym33$GET_HEAD ), $sym34$GET_CATEGORY ) == $kw35$NN || NIL != string_utilities.starts_with( methods.funcall_instance_method_with_0_args( methods
                        .funcall_instance_method_with_0_args( tree, $sym32$GET_SUBJECT ), $sym29$GET_STRING ), $str36$the ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1722L)
  public static SubLObject intelligent_agent_question_querify_method(final SubLObject self)
  {
    return ConsesLow.list( search_engine.new_lemur_query( methods.funcall_instance_method_with_0_args( self, $sym29$GET_STRING ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1952L)
  public static SubLObject intelligent_agent_question_extract_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_intelligent_agent_question_method = NIL;
    final SubLObject max_confidence = question.get_question_max_confidence( self );
    final SubLObject v_parser = question.get_question_parser( self );
    final SubLObject lexicon = question.get_question_lexicon( self );
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym45$LEARN, methods.funcall_instance_method_with_0_args( passage, $sym46$GET_CONTENT ) );
        final SubLObject pparse = methods.funcall_instance_method_with_1_args( v_parser, $sym20$PARSE, passage_sentence( methods.funcall_instance_method_with_0_args( passage, $sym46$GET_CONTENT ) ) );
        final SubLObject lexified = ( NIL != pparse ) ? methods.funcall_instance_method_with_1_args( pparse, $sym47$LEXIFY, lexicon ) : NIL;
        final SubLObject predicate = methods.funcall_instance_method_with_0_args( parse, $sym31$GET_PREDICATE );
        SubLObject candidate = NIL;
        SubLObject subject = NIL;
        SubLObject v_object = NIL;
        SubLObject answers = NIL;
        if( NIL != lexified && NIL != predicate )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( lexified, $sym51$YIELD );
          SubLObject word = NIL;
          word = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != parse_tree.verbal_tree_p( word ) && NIL != question.word_implies( word, predicate ) )
            {
              if( NIL != methods.funcall_instance_method_with_0_args( self, $sym48$SUBJECT_QUESTION_P ) )
              {
                v_object = methods.funcall_instance_method_with_0_args( word, $sym49$GET_SEMANTIC_OBJECTS ).first();
                v_object = ( NIL != v_object ) ? methods.funcall_instance_method_with_0_args( v_object, $sym33$GET_HEAD ) : NIL;
                if( NIL != v_object && NIL != question.word_implies( v_object, methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( predicate, $sym49$GET_SEMANTIC_OBJECTS ).first(),
                    $sym33$GET_HEAD ) ) )
                {
                  candidate = methods.funcall_instance_method_with_0_args( word, $sym50$GET_SEMANTIC_SUBJECT );
                }
              }
              else
              {
                subject = methods.funcall_instance_method_with_0_args( word, $sym50$GET_SEMANTIC_SUBJECT );
                subject = ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym33$GET_HEAD ) : NIL;
                if( NIL != subject && NIL != question.word_implies( subject, methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( predicate, $sym50$GET_SEMANTIC_SUBJECT ),
                    $sym33$GET_HEAD ) ) )
                {
                  candidate = methods.funcall_instance_method_with_0_args( word, $sym49$GET_SEMANTIC_OBJECTS ).first();
                }
              }
              if( NIL != candidate )
              {
                answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( candidate, $sym29$GET_STRING ), passage, Numbers.multiply( new SubLObject[] { max_confidence
                } ), UNPROVIDED ), answers );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD, answers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_max_confidence( self, max_confidence );
          question.set_question_parser( self, v_parser );
          question.set_question_lexicon( self, lexicon );
          question.set_question_parse( self, parse );
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
      catch_var_for_intelligent_agent_question_method = Errors.handleThrowable( ccatch_env_var, $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_intelligent_agent_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 3418L)
  public static SubLObject intelligent_agent_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const54$Person, $const55$IntelligentAgent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 3697L)
  public static SubLObject passage_sentence(final SubLObject passage)
  {
    return passage;
  }

  public static SubLObject declare_intelligent_agent_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_intelligent_agent_question_class", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_intelligent_agent_question_instance", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "intelligent_agent_question_p", "INTELLIGENT-AGENT-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "intelligent_agent_question_isaP_method", "INTELLIGENT-AGENT-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "intelligent_agent_question_querify_method", "INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "intelligent_agent_question_extract_method", "INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "intelligent_agent_question_answer_types_method", "INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "passage_sentence", "PASSAGE-SENTENCE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_intelligent_agent_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_intelligent_agent_question_file()
  {
    classes.subloop_new_class( $sym0$INTELLIGENT_AGENT_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$INTELLIGENT_AGENT_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$INTELLIGENT_AGENT_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$INTELLIGENT_AGENT_QUESTION, $sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE );
    subloop_reserved_initialize_intelligent_agent_question_class( $sym0$INTELLIGENT_AGENT_QUESTION );
    methods.methods_incorporate_class_method( $sym24$ISA_, $sym0$INTELLIGENT_AGENT_QUESTION, $list25, $list26, $list27 );
    methods.subloop_register_class_method( $sym0$INTELLIGENT_AGENT_QUESTION, $sym24$ISA_, $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym38$QUERIFY, $sym0$INTELLIGENT_AGENT_QUESTION, $list25, NIL, $list39 );
    methods.subloop_register_instance_method( $sym0$INTELLIGENT_AGENT_QUESTION, $sym38$QUERIFY, $sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym41$EXTRACT, $sym0$INTELLIGENT_AGENT_QUESTION, $list25, $list42, $list43 );
    methods.subloop_register_instance_method( $sym0$INTELLIGENT_AGENT_QUESTION, $sym41$EXTRACT, $sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$INTELLIGENT_AGENT_QUESTION, $list25, NIL, $list53 );
    methods.subloop_register_instance_method( $sym0$INTELLIGENT_AGENT_QUESTION, $sym21$ANSWER_TYPES, $sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_intelligent_agent_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_intelligent_agent_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_intelligent_agent_question_file();
  }
  static
  {
    me = new intelligent_agent_question();
    $sym0$INTELLIGENT_AGENT_QUESTION = makeSymbol( "INTELLIGENT-AGENT-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ) );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE" );
    $sym24$ISA_ = makeSymbol( "ISA?" );
    $list25 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list26 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "who" ), makeString( "whose" ), makeString( "whom" ) ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list(
                    makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PREDICATE" ) ) ) ) ), ConsesLow.list( makeSymbol(
                        "CAND" ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PREDICATE" ) ) ) ),
                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( EQ,
                            ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "NN" ) ),
                            ConsesLow.list( makeSymbol( "STARTS-WITH" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "the" ) ) ) ) ) ) ) );
    $sym28$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "who" ), makeString( "whose" ), makeString( "whom" ) );
    $sym31$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $sym32$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $sym33$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym34$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw35$NN = makeKeyword( "NN" );
    $str36$the = makeString( "the" );
    $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD = makeSymbol( "INTELLIGENT-AGENT-QUESTION-ISA?-METHOD" );
    $sym38$QUERIFY = makeSymbol( "QUERIFY" );
    $list39 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ),
        ConsesLow.list( makeSymbol( "NEW-LEMUR-QUERY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ) );
    $sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD = makeSymbol( "INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD" );
    $sym41$EXTRACT = makeSymbol( "EXTRACT" );
    $list42 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list43 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "PPARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol(
                "PASSAGE-SENTENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "LEXIFIED" ),
                    ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "PPARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PPARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol(
                        "LEXICON" ) ) ) ), ConsesLow.list( makeSymbol( "PREDICATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "GET-PREDICATE" ) ) ) ), makeSymbol( "CANDIDATE" ), makeSymbol( "SUBJECT" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "ANSWERS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                                ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "LEXIFIED" ), makeSymbol( "PREDICATE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list(
                                    makeSymbol( "FIM" ), makeSymbol( "LEXIFIED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                        "CAND" ), ConsesLow.list( makeSymbol( "VERBAL-TREE-P" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "WORD-IMPLIES" ), makeSymbol( "WORD" ), makeSymbol( "PREDICATE" ) ) ),
                                        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBJECT-QUESTION-P" ) ) ),
                                            ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                    "OBJECT" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol(
                                                        "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "OBJECT" ), ConsesLow.list(
                                                            makeSymbol( "WORD-IMPLIES" ), makeSymbol( "OBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                                "FIM" ), makeSymbol( "PREDICATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                    "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                        makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                                                                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list(
                                                                                makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUBJECT" ), ConsesLow
                                                                                    .list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                                                                                        makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                                                                                            "CAND" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "WORD-IMPLIES" ), makeSymbol( "SUBJECT" ), ConsesLow.list(
                                                                                                makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PREDICATE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                    makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ),
                                                                                            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list(
                                                                                                makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                    "GET-SEMANTIC-OBJECTS" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CANDIDATE" ), ConsesLow
                                                                                                        .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                                                                            makeSymbol( "FIM" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol(
                                                                                                                    "MAX-CONFIDENCE" ) ) ), makeSymbol( "ANSWERS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                                                                                        makeSymbol( "ANSWERS" ) ) ) );
    $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INTELLIGENT-AGENT-QUESTION-METHOD" );
    $sym45$LEARN = makeSymbol( "LEARN" );
    $sym46$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym47$LEXIFY = makeSymbol( "LEXIFY" );
    $sym48$SUBJECT_QUESTION_P = makeSymbol( "SUBJECT-QUESTION-P" );
    $sym49$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $sym50$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $sym51$YIELD = makeSymbol( "YIELD" );
    $sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD = makeSymbol( "INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD" );
    $list53 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell(
            makeString( "IntelligentAgent" ) ) ) ) ) );
    $const54$Person = constant_handles.reader_make_constant_shell( makeString( "Person" ) );
    $const55$IntelligentAgent = constant_handles.reader_make_constant_shell( makeString( "IntelligentAgent" ) );
    $sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD" );
  }
}
/*
 * 
 * Total time: 168 ms
 * 
 */