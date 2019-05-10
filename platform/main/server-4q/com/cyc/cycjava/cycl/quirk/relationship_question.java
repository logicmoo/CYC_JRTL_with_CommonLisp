package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class relationship_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.relationship_question";
  public static final String myFingerPrint = "5df1aeda613135d7081f74d0a8faca386829d9d5f465b1615940113f5d2592d1";
  private static final SubLSymbol $sym0$RELATIONSHIP_QUESTION;
  private static final SubLSymbol $sym1$QUESTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$INFORMATION_EXTRACTION_GRAPH;
  private static final SubLSymbol $sym4$WORD_GRAPH;
  private static final SubLSymbol $sym5$OBJECT;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$LEXICON;
  private static final SubLSymbol $sym8$PARSER;
  private static final SubLSymbol $sym9$TAGGER;
  private static final SubLSymbol $sym10$CHUNKER;
  private static final SubLSymbol $sym11$MAX_CANDIDATES;
  private static final SubLSymbol $sym12$MAX_CONFIDENCE;
  private static final SubLSymbol $sym13$LEARNABLE_TYPES;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS;
  private static final SubLSymbol $sym15$ISOLATED_P;
  private static final SubLSymbol $sym16$INSTANCE_NUMBER;
  private static final SubLSymbol $sym17$INFORMATION_REQUEST;
  private static final SubLSymbol $sym18$ERROR_HANDLING;
  private static final SubLSymbol $sym19$TIMEOUT;
  private static final SubLSymbol $sym20$STRING;
  private static final SubLSymbol $sym21$PARSE;
  private static final SubLSymbol $sym22$ANSWER_TYPES;
  private static final SubLSymbol $sym23$CORPORA;
  private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE;
  private static final SubLSymbol $sym25$ISA_;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLString $str31$between;
  private static final SubLString $str32$common;
  private static final SubLSymbol $sym33$YIELD;
  private static final SubLSymbol $sym34$RELATIONSHIP_QUESTION_ISA__METHOD;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$QUERIFY;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$OUTER_CATCH_FOR_QUESTION_METHOD;
  private static final SubLSymbol $sym39$GET_KEYSTRINGS;
  private static final SubLSymbol $sym40$AUGMENT_TERMS;
  private static final SubLString $str41$_;
  private static final SubLSymbol $sym42$QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym43$EXTRACT;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$GET_SCORE;
  private static final SubLSymbol $sym47$QUESTION_EXTRACT_METHOD;
  private static final SubLSymbol $sym48$ANSWER_CARDINALITY;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$QUESTION_ANSWER_CARDINALITY_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject get_relationship_question_information_extraction_graph(final SubLObject v_relationship_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_relationship_question, EIGHT_INTEGER, $sym3$INFORMATION_EXTRACTION_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject set_relationship_question_information_extraction_graph(final SubLObject v_relationship_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_relationship_question, value, EIGHT_INTEGER, $sym3$INFORMATION_EXTRACTION_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject get_relationship_question_word_graph(final SubLObject v_relationship_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_relationship_question, SEVEN_INTEGER, $sym4$WORD_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject set_relationship_question_word_graph(final SubLObject v_relationship_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_relationship_question, value, SEVEN_INTEGER, $sym4$WORD_GRAPH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject subloop_reserved_initialize_relationship_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym7$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym8$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym9$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym10$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym11$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym12$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym13$LEARNABLE_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject subloop_reserved_initialize_relationship_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$INFORMATION_REQUEST, $sym18$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$INFORMATION_REQUEST, $sym19$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym20$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym21$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym22$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$QUESTION, $sym23$CORPORA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$RELATIONSHIP_QUESTION, $sym4$WORD_GRAPH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$RELATIONSHIP_QUESTION, $sym3$INFORMATION_EXTRACTION_GRAPH, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
  public static SubLObject relationship_question_p(final SubLObject v_relationship_question)
  {
    return classes.subloop_instanceof_class( v_relationship_question, $sym0$RELATIONSHIP_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 1203L)
  public static SubLObject relationship_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    SubLObject what_flag = NIL;
    SubLObject rel_flag = NIL;
    SubLObject done = NIL;
    if( NIL == done )
    {
      SubLObject csome_list_var = methods.funcall_instance_method_with_0_args( tree, $sym33$YIELD );
      SubLObject word = NIL;
      word = csome_list_var.first();
      while ( NIL == done && NIL != csome_list_var)
      {
        final SubLObject word_string = methods.funcall_instance_method_with_0_args( word, $sym29$GET_STRING );
        if( NIL != conses_high.member( word_string, $list30, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
        {
          what_flag = T;
        }
        else if( NIL != relationship_string_p( word_string ) && NIL != what_flag )
        {
          rel_flag = T;
        }
        else if( word_string.equalp( $str31$between ) && NIL != rel_flag )
        {
          done = T;
        }
        else if( word_string.equalp( $str32$common ) )
        {
          done = T;
        }
        csome_list_var = csome_list_var.rest();
        word = csome_list_var.first();
      }
    }
    return done;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 1783L)
  public static SubLObject relationship_string_p(final SubLObject string)
  {
    return conses_high.member( morphology.get_root( string, UNPROVIDED ), $list35, EQUALP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2029L)
  public static SubLObject question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_question_method = NIL;
    final SubLObject corpora = question.get_question_corpora( self );
    try
    {
      thread.throwStack.push( $sym38$OUTER_CATCH_FOR_QUESTION_METHOD );
      try
      {
        SubLObject content_terms = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym39$GET_KEYSTRINGS );
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == relationship_string_p( v_term ) )
          {
            content_terms = ConsesLow.cons( v_term, content_terms );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
        if( NIL == content_terms )
        {
          Dynamic.sublisp_throw( $sym38$OUTER_CATCH_FOR_QUESTION_METHOD, NIL );
        }
        SubLObject queries = NIL;
        final SubLObject content_string = string_utilities.bunge( content_terms, UNPROVIDED );
        SubLObject cdolist_list_var2 = corpora;
        SubLObject corpus = NIL;
        corpus = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args( $sym1$QUESTION, $sym40$AUGMENT_TERMS, content_terms, corpus );
          SubLObject query = string_utilities.bunge( augmentation_terms, UNPROVIDED );
          SubLObject i;
          for( i = NIL, i = ZERO_INTEGER; i.numL( THREE_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            query = Sequences.cconcatenate( content_string, new SubLObject[] { $str41$_, query
            } );
          }
          queries = ConsesLow.cons( search_engine.new_lemur_query( query, corpus, UNPROVIDED, UNPROVIDED ), queries );
          cdolist_list_var2 = cdolist_list_var2.rest();
          corpus = cdolist_list_var2.first();
        }
        Dynamic.sublisp_throw( $sym38$OUTER_CATCH_FOR_QUESTION_METHOD, Sequences.nreverse( queries ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_corpora( self, corpora );
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
      catch_var_for_question_method = Errors.handleThrowable( ccatch_env_var, $sym38$OUTER_CATCH_FOR_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2748L)
  public static SubLObject question_extract_method(final SubLObject self, final SubLObject passage)
  {
    return ConsesLow.list( answer.new_sentence_answer( self, passage, methods.funcall_instance_method_with_0_args( passage, $sym46$GET_SCORE ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2953L)
  public static SubLObject question_answer_cardinality_method(final SubLObject self)
  {
    return TEN_INTEGER;
  }

  public static SubLObject declare_relationship_question_file()
  {
    SubLFiles.declareFunction( me, "get_relationship_question_information_extraction_graph", "GET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_relationship_question_information_extraction_graph", "SET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "get_relationship_question_word_graph", "GET-RELATIONSHIP-QUESTION-WORD-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_relationship_question_word_graph", "SET-RELATIONSHIP-QUESTION-WORD-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_relationship_question_class", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_relationship_question_instance", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "relationship_question_p", "RELATIONSHIP-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "relationship_question_isaP_method", "RELATIONSHIP-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "relationship_string_p", "RELATIONSHIP-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "question_querify_method", "QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "question_extract_method", "QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "question_answer_cardinality_method", "QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_relationship_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_relationship_question_file()
  {
    classes.subloop_new_class( $sym0$RELATIONSHIP_QUESTION, $sym1$QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$RELATIONSHIP_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$RELATIONSHIP_QUESTION, $sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$RELATIONSHIP_QUESTION, $sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE );
    subloop_reserved_initialize_relationship_question_class( $sym0$RELATIONSHIP_QUESTION );
    methods.methods_incorporate_class_method( $sym25$ISA_, $sym0$RELATIONSHIP_QUESTION, $list26, $list27, $list28 );
    methods.subloop_register_class_method( $sym0$RELATIONSHIP_QUESTION, $sym25$ISA_, $sym34$RELATIONSHIP_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym36$QUERIFY, $sym1$QUESTION, $list26, NIL, $list37 );
    methods.subloop_register_instance_method( $sym1$QUESTION, $sym36$QUERIFY, $sym42$QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym43$EXTRACT, $sym1$QUESTION, $list26, $list44, $list45 );
    methods.subloop_register_instance_method( $sym1$QUESTION, $sym43$EXTRACT, $sym47$QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym48$ANSWER_CARDINALITY, $sym1$QUESTION, $list26, NIL, $list49 );
    methods.subloop_register_instance_method( $sym1$QUESTION, $sym48$ANSWER_CARDINALITY, $sym50$QUESTION_ANSWER_CARDINALITY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_relationship_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_relationship_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_relationship_question_file();
  }
  static
  {
    me = new relationship_question();
    $sym0$RELATIONSHIP_QUESTION = makeSymbol( "RELATIONSHIP-QUESTION" );
    $sym1$QUESTION = makeSymbol( "QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-GRAPH" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INFORMATION-EXTRACTION-GRAPH" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$INFORMATION_EXTRACTION_GRAPH = makeSymbol( "INFORMATION-EXTRACTION-GRAPH" );
    $sym4$WORD_GRAPH = makeSymbol( "WORD-GRAPH" );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$LEXICON = makeSymbol( "LEXICON" );
    $sym8$PARSER = makeSymbol( "PARSER" );
    $sym9$TAGGER = makeSymbol( "TAGGER" );
    $sym10$CHUNKER = makeSymbol( "CHUNKER" );
    $sym11$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym12$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym13$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS" );
    $sym15$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym16$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym17$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym18$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym19$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym20$STRING = makeSymbol( "STRING" );
    $sym21$PARSE = makeSymbol( "PARSE" );
    $sym22$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym23$CORPORA = makeSymbol( "CORPORA" );
    $sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE" );
    $sym25$ISA_ = makeSymbol( "ISA?" );
    $list26 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list27 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list28 = ConsesLow.list( makeString( "@return boolean; t if TREE is a relationship question, nil otherwise" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "WHAT-FLAG" ), makeSymbol(
        "REL-FLAG" ), makeSymbol( "DONE" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "YIELD" ) ) ), makeSymbol( "DONE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-STRING" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "WORD-STRING" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "what" ), makeString( "which" ) ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                        makeSymbol( "WHAT-FLAG" ), T ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "RELATIONSHIP-STRING-P" ), makeSymbol( "WORD-STRING" ) ), makeSymbol(
                            "WHAT-FLAG" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "REL-FLAG" ), T ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( EQUALP, makeSymbol(
                                "WORD-STRING" ), makeString( "between" ) ), makeSymbol( "REL-FLAG" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DONE" ), T ) ), ConsesLow.list( ConsesLow.list( EQUALP,
                                    makeSymbol( "WORD-STRING" ), makeString( "common" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DONE" ), T ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                        "DONE" ) ) ) );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "what" ), makeString( "which" ) );
    $str31$between = makeString( "between" );
    $str32$common = makeString( "common" );
    $sym33$YIELD = makeSymbol( "YIELD" );
    $sym34$RELATIONSHIP_QUESTION_ISA__METHOD = makeSymbol( "RELATIONSHIP-QUESTION-ISA?-METHOD" );
    $list35 = ConsesLow.list( makeString( "relationship" ), makeString( "connection" ), makeString( "link" ), makeString( "nexus" ), makeString( "tie" ), makeString( "tied" ) );
    $sym36$QUERIFY = makeSymbol( "QUERIFY" );
    $list37 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "CONTENT-TERMS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TERM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "GET-KEYSTRINGS" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "RELATIONSHIP-STRING-P" ), makeSymbol( "TERM" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                makeSymbol( "TERM" ), makeSymbol( "CONTENT-TERMS" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "CONTENT-TERMS" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol(
                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUERIES" ), NIL ), ConsesLow.list( makeSymbol( "CONTENT-STRING" ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "CONTENT-TERMS" ) ) ) ),
                    ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ), makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                        "AUGMENTATION-TERMS" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "AUGMENT-TERMS" ) ), makeSymbol( "CONTENT-TERMS" ), makeSymbol( "CORPUS" ) ) ), ConsesLow.list( makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol(
                                "AUGMENTATION-TERMS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOTIMES" ), ConsesLow.list( makeSymbol( "I" ), THREE_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUERY" ),
                                    ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "CONTENT-STRING" ), makeString( " " ), makeSymbol( "QUERY" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                        makeSymbol( "NEW-LEMUR-QUERY" ), makeSymbol( "QUERY" ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                            "NREVERSE" ), makeSymbol( "QUERIES" ) ) ) ) ) );
    $sym38$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUESTION-METHOD" );
    $sym39$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $sym40$AUGMENT_TERMS = makeSymbol( "AUGMENT-TERMS" );
    $str41$_ = makeString( " " );
    $sym42$QUESTION_QUERIFY_METHOD = makeSymbol( "QUESTION-QUERIFY-METHOD" );
    $sym43$EXTRACT = makeSymbol( "EXTRACT" );
    $list44 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list45 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
        "NEW-SENTENCE-ANSWER" ), makeSymbol( "SELF" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SCORE" ) ) ) ) ) ) );
    $sym46$GET_SCORE = makeSymbol( "GET-SCORE" );
    $sym47$QUESTION_EXTRACT_METHOD = makeSymbol( "QUESTION-EXTRACT-METHOD" );
    $sym48$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list49 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), TEN_INTEGER ) );
    $sym50$QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "QUESTION-ANSWER-CARDINALITY-METHOD" );
  }
}
/*
 * 
 * Total time: 139 ms
 * 
 */