package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class distance_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.distance_question";
  public static final String myFingerPrint = "e961fbbacdfd0da2a86a1de0a33704b4239c6801c576ffd6258a4e6d07c45200";
  private static final SubLSymbol $sym0$DISTANCE_QUESTION;
  private static final SubLSymbol $sym1$VALUE_QUESTION;
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
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$VALUE_PREDICATE;
  private static final SubLSymbol $sym24$CYC_FOCUSES;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE;
  private static final SubLSymbol $sym26$ISA_;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$GET_DAUGHTER;
  private static final SubLSymbol $sym31$GET_STRING;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$DISTANCE_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym34$QUERIFY;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD;
  private static final SubLString $str37$_WIN_1_SIZE1__;
  private static final SubLSymbol $sym38$GET_KEYSTRINGS;
  private static final SubLString $str39$_;
  private static final SubLSymbol $sym40$DISTANCE_QUESTION_QUERIFY_METHOD;
  private static final SubLList $list41;
  private static final SubLObject $const42$Distance;
  private static final SubLSymbol $sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
  public static SubLObject subloop_reserved_initialize_distance_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
  public static SubLObject subloop_reserved_initialize_distance_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$INFORMATION_REQUEST, $sym17$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$INFORMATION_REQUEST, $sym18$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym19$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym20$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym21$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$QUESTION, $sym22$CORPORA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$VALUE_QUESTION, $sym23$VALUE_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$VALUE_QUESTION, $sym24$CYC_FOCUSES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
  public static SubLObject distance_question_p(final SubLObject v_distance_question)
  {
    return classes.subloop_instanceof_class( v_distance_question, $sym0$DISTANCE_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1062L)
  public static SubLObject distance_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym30$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym30$GET_DAUGHTER, ZERO_INTEGER ), $sym31$GET_STRING ), $list32, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1348L)
  public static SubLObject distance_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_distance_question_method = NIL;
    final SubLObject corpora = question.get_question_corpora( self );
    try
    {
      thread.throwStack.push( $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD );
      try
      {
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = corpora;
        SubLObject corpus = NIL;
        corpus = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          queries = ConsesLow.cons( search_engine.new_guruqa_query( Sequences.cconcatenate( $str37$_WIN_1_SIZE1__, new SubLObject[] { string_utilities.bunge( methods.funcall_instance_method_with_0_args( self,
              $sym38$GET_KEYSTRINGS ), UNPROVIDED ), $str39$_
          } ), corpus ), queries );
          cdolist_list_var = cdolist_list_var.rest();
          corpus = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD, queries );
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
      catch_var_for_distance_question_method = Errors.handleThrowable( ccatch_env_var, $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_distance_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1626L)
  public static SubLObject distance_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const42$Distance ) );
  }

  public static SubLObject declare_distance_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_distance_question_class", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_distance_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "distance_question_p", "DISTANCE-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "distance_question_isaP_method", "DISTANCE-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "distance_question_querify_method", "DISTANCE-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "distance_question_answer_types_method", "DISTANCE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_distance_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_distance_question_file()
  {
    classes.subloop_new_class( $sym0$DISTANCE_QUESTION, $sym1$VALUE_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$DISTANCE_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$DISTANCE_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$DISTANCE_QUESTION, $sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE );
    subloop_reserved_initialize_distance_question_class( $sym0$DISTANCE_QUESTION );
    methods.methods_incorporate_class_method( $sym26$ISA_, $sym0$DISTANCE_QUESTION, $list27, $list28, $list29 );
    methods.subloop_register_class_method( $sym0$DISTANCE_QUESTION, $sym26$ISA_, $sym33$DISTANCE_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym34$QUERIFY, $sym0$DISTANCE_QUESTION, $list27, NIL, $list35 );
    methods.subloop_register_instance_method( $sym0$DISTANCE_QUESTION, $sym34$QUERIFY, $sym40$DISTANCE_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$DISTANCE_QUESTION, $list27, NIL, $list41 );
    methods.subloop_register_instance_method( $sym0$DISTANCE_QUESTION, $sym21$ANSWER_TYPES, $sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_distance_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_distance_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_distance_question_file();
  }
  static
  {
    me = new distance_question();
    $sym0$DISTANCE_QUESTION = makeSymbol( "DISTANCE-QUESTION" );
    $sym1$VALUE_QUESTION = makeSymbol( "VALUE-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ) );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$VALUE_PREDICATE = makeSymbol( "VALUE-PREDICATE" );
    $sym24$CYC_FOCUSES = makeSymbol( "CYC-FOCUSES" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE" );
    $sym26$ISA_ = makeSymbol( "ISA?" );
    $list27 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list28 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "How tall" ), makeString( "How long" ), makeString( "How wide" ), makeString( "How far" ), makeString( "How much in miles" ) ) ) ) ) ) );
    $sym30$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym31$GET_STRING = makeSymbol( "GET-STRING" );
    $list32 = ConsesLow.list( makeString( "How tall" ), makeString( "How long" ), makeString( "How wide" ), makeString( "How far" ), makeString( "How much in miles" ) );
    $sym33$DISTANCE_QUESTION_ISA__METHOD = makeSymbol( "DISTANCE-QUESTION-ISA?-METHOD" );
    $sym34$QUERIFY = makeSymbol( "QUERIFY" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUERIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ),
        makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GURUQA-QUERY" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "@WIN(1 SIZE1$ " ), ConsesLow.list(
            makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYSTRINGS" ) ) ) ), makeString( ")" ) ), makeSymbol( "CORPUS" ) ),
            makeSymbol( "QUERIES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "QUERIES" ) ) ) );
    $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DISTANCE-QUESTION-METHOD" );
    $str37$_WIN_1_SIZE1__ = makeString( "@WIN(1 SIZE1$ " );
    $sym38$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $str39$_ = makeString( ")" );
    $sym40$DISTANCE_QUESTION_QUERIFY_METHOD = makeSymbol( "DISTANCE-QUESTION-QUERIFY-METHOD" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString(
        "Distance" ) ) ) ) ) );
    $const42$Distance = constant_handles.reader_make_constant_shell( makeString( "Distance" ) );
    $sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "DISTANCE-QUESTION-ANSWER-TYPES-METHOD" );
  }
}
/*
 * 
 * Total time: 51 ms
 * 
 */