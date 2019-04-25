package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class value_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.value_question";
  public static final String myFingerPrint = "8e3cf8372098468b52e66104e24578882d60e7734a3adfbd6bf593590ef66b11";
  private static final SubLSymbol $sym0$VALUE_QUESTION;
  private static final SubLSymbol $sym1$WH_QUESTION;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CYC_FOCUSES;
  private static final SubLSymbol $sym4$VALUE_PREDICATE;
  private static final SubLSymbol $sym5$OBJECT;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$QUESTION;
  private static final SubLSymbol $sym8$LEXICON;
  private static final SubLSymbol $sym9$PARSER;
  private static final SubLSymbol $sym10$TAGGER;
  private static final SubLSymbol $sym11$CHUNKER;
  private static final SubLSymbol $sym12$MAX_CANDIDATES;
  private static final SubLSymbol $sym13$MAX_CONFIDENCE;
  private static final SubLSymbol $sym14$LEARNABLE_TYPES;
  private static final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS;
  private static final SubLSymbol $sym16$ISOLATED_P;
  private static final SubLSymbol $sym17$INSTANCE_NUMBER;
  private static final SubLSymbol $sym18$INFORMATION_REQUEST;
  private static final SubLSymbol $sym19$ERROR_HANDLING;
  private static final SubLSymbol $sym20$TIMEOUT;
  private static final SubLSymbol $sym21$STRING;
  private static final SubLSymbol $sym22$PARSE;
  private static final SubLSymbol $sym23$ANSWER_TYPES;
  private static final SubLSymbol $sym24$CORPORA;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE;
  private static final SubLSymbol $sym26$GET_VALUE_PREDICATE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD;
  private static final SubLSymbol $sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD;
  private static final SubLSymbol $sym31$GET_CYC_FOCUSES;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD;
  private static final SubLSymbol $sym34$GET_FOCUS;
  private static final SubLSymbol $sym35$GET_HEAD;
  private static final SubLSymbol $sym36$GET_LEXES;
  private static final SubLSymbol $sym37$GET;
  private static final SubLSymbol $kw38$DENOT;
  private static final SubLSymbol $sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject get_value_question_cyc_focuses(final SubLObject v_value_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_value_question, EIGHT_INTEGER, $sym3$CYC_FOCUSES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject set_value_question_cyc_focuses(final SubLObject v_value_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_value_question, value, EIGHT_INTEGER, $sym3$CYC_FOCUSES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject get_value_question_value_predicate(final SubLObject v_value_question)
  {
    return classes.subloop_get_access_protected_instance_slot( v_value_question, SEVEN_INTEGER, $sym4$VALUE_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject set_value_question_value_predicate(final SubLObject v_value_question, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_value_question, value, SEVEN_INTEGER, $sym4$VALUE_PREDICATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject subloop_reserved_initialize_value_question_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym8$LEXICON, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym9$PARSER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym10$TAGGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym11$CHUNKER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym12$MAX_CANDIDATES, TWENTY_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym13$MAX_CONFIDENCE, TEN_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym14$LEARNABLE_TYPES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject subloop_reserved_initialize_value_question_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym16$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym17$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym18$INFORMATION_REQUEST, $sym19$ERROR_HANDLING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym18$INFORMATION_REQUEST, $sym20$TIMEOUT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym21$STRING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym22$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym23$ANSWER_TYPES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym7$QUESTION, $sym24$CORPORA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$VALUE_QUESTION, $sym4$VALUE_PREDICATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$VALUE_QUESTION, $sym3$CYC_FOCUSES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
  public static SubLObject value_question_p(final SubLObject v_value_question)
  {
    return classes.subloop_instanceof_class( v_value_question, $sym0$VALUE_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 1496L)
  public static SubLObject value_question_get_value_predicate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_value_question_method = NIL;
    final SubLObject value_predicate = get_value_question_value_predicate( self );
    try
    {
      thread.throwStack.push( $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, value_predicate );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_value_question_value_predicate( self, value_predicate );
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
      catch_var_for_value_question_method = Errors.handleThrowable( ccatch_env_var, $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_value_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 1591L)
  public static SubLObject value_question_get_cyc_focuses_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_value_question_method = NIL;
    SubLObject cyc_focuses = get_value_question_cyc_focuses( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD );
      try
      {
        if( NIL != cyc_focuses )
        {
          Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, cyc_focuses );
        }
        final SubLObject focus_tree = methods.funcall_instance_method_with_0_args( self, $sym34$GET_FOCUS );
        final SubLObject head = methods.funcall_instance_method_with_0_args( focus_tree, $sym35$GET_HEAD );
        final SubLObject lexes = methods.funcall_instance_method_with_0_args( head, $sym36$GET_LEXES );
        SubLObject denots = NIL;
        SubLObject cdolist_list_var = lexes;
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          denots = ConsesLow.cons( methods.funcall_instance_method_with_1_args( lex, $sym37$GET, $kw38$DENOT ), denots );
          cdolist_list_var = cdolist_list_var.rest();
          lex = cdolist_list_var.first();
        }
        cyc_focuses = denots;
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, denots );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_value_question_cyc_focuses( self, cyc_focuses );
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
      catch_var_for_value_question_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_value_question_method;
  }

  public static SubLObject declare_value_question_file()
  {
    SubLFiles.declareFunction( me, "get_value_question_cyc_focuses", "GET-VALUE-QUESTION-CYC-FOCUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_value_question_cyc_focuses", "SET-VALUE-QUESTION-CYC-FOCUSES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_value_question_value_predicate", "GET-VALUE-QUESTION-VALUE-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_value_question_value_predicate", "SET-VALUE-QUESTION-VALUE-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_value_question_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_value_question_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "value_question_p", "VALUE-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "value_question_get_value_predicate_method", "VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "value_question_get_cyc_focuses_method", "VALUE-QUESTION-GET-CYC-FOCUSES-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_value_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_value_question_file()
  {
    classes.subloop_new_class( $sym0$VALUE_QUESTION, $sym1$WH_QUESTION, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$VALUE_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$VALUE_QUESTION, $sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$VALUE_QUESTION, $sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE );
    subloop_reserved_initialize_value_question_class( $sym0$VALUE_QUESTION );
    methods.methods_incorporate_instance_method( $sym26$GET_VALUE_PREDICATE, $sym0$VALUE_QUESTION, $list27, NIL, $list28 );
    methods.subloop_register_instance_method( $sym0$VALUE_QUESTION, $sym26$GET_VALUE_PREDICATE, $sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym31$GET_CYC_FOCUSES, $sym0$VALUE_QUESTION, $list27, NIL, $list32 );
    methods.subloop_register_instance_method( $sym0$VALUE_QUESTION, $sym31$GET_CYC_FOCUSES, $sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_value_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_value_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_value_question_file();
  }
  static
  {
    me = new value_question();
    $sym0$VALUE_QUESTION = makeSymbol( "VALUE-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE-PREDICATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CYC-FOCUSES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VALUE-PREDICATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "GET-CYC-FOCUSES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym3$CYC_FOCUSES = makeSymbol( "CYC-FOCUSES" );
    $sym4$VALUE_PREDICATE = makeSymbol( "VALUE-PREDICATE" );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$QUESTION = makeSymbol( "QUESTION" );
    $sym8$LEXICON = makeSymbol( "LEXICON" );
    $sym9$PARSER = makeSymbol( "PARSER" );
    $sym10$TAGGER = makeSymbol( "TAGGER" );
    $sym11$CHUNKER = makeSymbol( "CHUNKER" );
    $sym12$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym13$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym14$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS" );
    $sym16$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym17$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym18$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym19$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym20$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym21$STRING = makeSymbol( "STRING" );
    $sym22$PARSE = makeSymbol( "PARSE" );
    $sym23$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym24$CORPORA = makeSymbol( "CORPORA" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE" );
    $sym26$GET_VALUE_PREDICATE = makeSymbol( "GET-VALUE-PREDICATE" );
    $list27 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VALUE-PREDICATE" ) ) );
    $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VALUE-QUESTION-METHOD" );
    $sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD = makeSymbol( "VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD" );
    $sym31$GET_CYC_FOCUSES = makeSymbol( "GET-CYC-FOCUSES" );
    $list32 = ConsesLow.list( makeString( "@return listp; a list of Cyc interpretations of the focus of this value-question" ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CYC-FOCUSES" ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "CYC-FOCUSES" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ) ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS-TREE" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "LEXES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-LEXES" ) ) ) ), makeSymbol( "DENOTS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), makeSymbol( "LEXES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                        .list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "DENOT" ) ), makeSymbol( "DENOTS" ) ) ), ConsesLow.list( makeSymbol(
                            "CSETQ" ), makeSymbol( "CYC-FOCUSES" ), makeSymbol( "DENOTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DENOTS" ) ) ) );
    $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VALUE-QUESTION-METHOD" );
    $sym34$GET_FOCUS = makeSymbol( "GET-FOCUS" );
    $sym35$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym36$GET_LEXES = makeSymbol( "GET-LEXES" );
    $sym37$GET = makeSymbol( "GET" );
    $kw38$DENOT = makeKeyword( "DENOT" );
    $sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD = makeSymbol( "VALUE-QUESTION-GET-CYC-FOCUSES-METHOD" );
  }
}
/*
 * 
 * Total time: 155 ms
 * 
 */