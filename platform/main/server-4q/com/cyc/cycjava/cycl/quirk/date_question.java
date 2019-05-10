package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public final class date_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.date_question";
  public static final String myFingerPrint = "0d738612c347cd21abf411d4673556065837196c4d1f06766a76ee7e8904cd67";
  private static final SubLSymbol $sym0$DATE_QUESTION;
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
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE;
  private static final SubLSymbol $sym24$ISA_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_DAUGHTER;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLString $str31$on_what_date;
  private static final SubLSymbol $sym32$DATE_QUESTION_ISA__METHOD;
  private static final SubLList $list33;
  private static final SubLObject $const34$Date;
  private static final SubLObject $const35$Time_Quantity;
  private static final SubLSymbol $sym36$DATE_QUESTION_ANSWER_TYPES_METHOD;
  private static final SubLSymbol $sym37$ANSWER_CARDINALITY;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD;
  private static final SubLSymbol $sym40$QUERIFY;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD;
  private static final SubLString $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM;
  private static final SubLSymbol $sym44$GET_KEYSTRINGS;
  private static final SubLString $str45$_;
  private static final SubLSymbol $sym46$DATE_QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym47$EXTRACT;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD;
  private static final SubLSymbol $sym51$LEARN;
  private static final SubLSymbol $sym52$GET_CONTENT;
  private static final SubLSymbol $sym53$LEXIFY;
  private static final SubLSymbol $sym54$GET_SEMANTIC_SUBJECT;
  private static final SubLSymbol $sym55$GET_SEMANTIC_OBJECTS;
  private static final SubLSymbol $sym56$GET_PREDICATE;
  private static final SubLSymbol $sym57$GET_HEAD;
  private static final SubLSymbol $sym58$CANDIDATE_ANSWER_P;
  private static final SubLSymbol $sym59$YIELD;
  private static final SubLSymbol $sym60$GET_MODIFIERS;
  private static final SubLSymbol $sym61$DATE_QUESTION_EXTRACT_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
  public static SubLObject subloop_reserved_initialize_date_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
  public static SubLObject subloop_reserved_initialize_date_question_instance(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
  public static SubLObject date_question_p(final SubLObject v_date_question)
  {
    return classes.subloop_instanceof_class( v_date_question, $sym0$DATE_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1160L)
  public static SubLObject date_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( ( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ), $list30, UNPROVIDED ) ) || methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ).equalp( $str31$on_what_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1532L)
  public static SubLObject date_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const34$Date ), ConsesLow.list( $const35$Time_Quantity ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1715L)
  public static SubLObject date_question_answer_cardinality_method(final SubLObject self)
  {
    return TEN_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1879L)
  public static SubLObject date_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_date_question_method = NIL;
    final SubLObject corpora = question.get_question_corpora( self );
    try
    {
      thread.throwStack.push( $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD );
      try
      {
        SubLObject queries = NIL;
        SubLObject cdolist_list_var = corpora;
        SubLObject corpus = NIL;
        corpus = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          queries = ConsesLow.cons( search_engine.new_guruqa_query( Sequences.cconcatenate( $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM, new SubLObject[] { string_utilities.bunge( methods
              .funcall_instance_method_with_0_args( self, $sym44$GET_KEYSTRINGS ), UNPROVIDED ), $str45$_
          } ), corpus ), queries );
          cdolist_list_var = cdolist_list_var.rest();
          corpus = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, queries );
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
      catch_var_for_date_question_method = Errors.handleThrowable( ccatch_env_var, $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_date_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 2287L)
  public static SubLObject date_question_extract_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_date_question_method = NIL;
    final SubLObject v_parser = question.get_question_parser( self );
    final SubLObject lexicon = question.get_question_lexicon( self );
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym51$LEARN, methods.funcall_instance_method_with_0_args( passage, $sym52$GET_CONTENT ) );
        final SubLObject pparse = methods.funcall_instance_method_with_1_args( v_parser, $sym20$PARSE, methods.funcall_instance_method_with_0_args( passage, $sym52$GET_CONTENT ) );
        final SubLObject lexified = ( NIL != pparse ) ? methods.funcall_instance_method_with_1_args( pparse, $sym53$LEXIFY, lexicon ) : NIL;
        final SubLObject qsubject = methods.funcall_instance_method_with_0_args( parse, $sym54$GET_SEMANTIC_SUBJECT );
        final SubLObject qobject = methods.funcall_instance_method_with_0_args( parse, $sym55$GET_SEMANTIC_OBJECTS ).first();
        final SubLObject qpredicate = methods.funcall_instance_method_with_0_args( parse, $sym56$GET_PREDICATE );
        SubLObject answers = NIL;
        if( NIL != lexified && NIL != qpredicate )
        {
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( lexified, $sym59$YIELD );
          SubLObject word = NIL;
          word = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != parse_tree.verbal_tree_p( word ) && NIL != question.word_implies( word, qpredicate ) && ( ( NIL != qsubject && NIL != word_tree.word_tree_p( methods.funcall_instance_method_with_0_args( word,
                $sym54$GET_SEMANTIC_SUBJECT ) ) && NIL != question.word_implies( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( word, $sym54$GET_SEMANTIC_SUBJECT ),
                    $sym57$GET_HEAD ), methods.funcall_instance_method_with_0_args( qsubject, $sym57$GET_HEAD ) ) ) || NIL == qsubject ) && ( ( NIL != qobject && NIL != word_tree.word_tree_p( methods
                        .funcall_instance_method_with_0_args( word, $sym55$GET_SEMANTIC_OBJECTS ).first() ) && NIL != question.word_implies( methods.funcall_instance_method_with_0_args( methods
                            .funcall_instance_method_with_0_args( word, $sym55$GET_SEMANTIC_OBJECTS ).first(), $sym57$GET_HEAD ), methods.funcall_instance_method_with_0_args( qobject, $sym57$GET_HEAD ) ) )
                        || NIL == qobject ) )
            {
              SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args( word, $sym60$GET_MODIFIERS );
              SubLObject mod = NIL;
              mod = cdolist_list_var_$1.first();
              while ( NIL != cdolist_list_var_$1)
              {
                SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args( mod, $sym59$YIELD );
                SubLObject candidate = NIL;
                candidate = cdolist_list_var_$2.first();
                while ( NIL != cdolist_list_var_$2)
                {
                  if( NIL != methods.funcall_instance_method_with_1_args( self, $sym58$CANDIDATE_ANSWER_P, candidate ) )
                  {
                    answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( candidate, $sym29$GET_STRING ), passage, TEN_INTEGER, UNPROVIDED ), answers );
                  }
                  cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                  candidate = cdolist_list_var_$2.first();
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                mod = cdolist_list_var_$1.first();
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, answers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
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
      catch_var_for_date_question_method = Errors.handleThrowable( ccatch_env_var, $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_date_question_method;
  }

  public static SubLObject declare_date_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_date_question_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_date_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "date_question_p", "DATE-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "date_question_isaP_method", "DATE-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "date_question_answer_types_method", "DATE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "date_question_answer_cardinality_method", "DATE-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "date_question_querify_method", "DATE-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "date_question_extract_method", "DATE-QUESTION-EXTRACT-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_date_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_date_question_file()
  {
    classes.subloop_new_class( $sym0$DATE_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$DATE_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$DATE_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$DATE_QUESTION, $sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE );
    subloop_reserved_initialize_date_question_class( $sym0$DATE_QUESTION );
    methods.methods_incorporate_class_method( $sym24$ISA_, $sym0$DATE_QUESTION, $list25, $list26, $list27 );
    methods.subloop_register_class_method( $sym0$DATE_QUESTION, $sym24$ISA_, $sym32$DATE_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$DATE_QUESTION, $list25, NIL, $list33 );
    methods.subloop_register_instance_method( $sym0$DATE_QUESTION, $sym21$ANSWER_TYPES, $sym36$DATE_QUESTION_ANSWER_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym37$ANSWER_CARDINALITY, $sym0$DATE_QUESTION, $list25, NIL, $list38 );
    methods.subloop_register_instance_method( $sym0$DATE_QUESTION, $sym37$ANSWER_CARDINALITY, $sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD );
    methods.methods_incorporate_instance_method( $sym40$QUERIFY, $sym0$DATE_QUESTION, $list25, NIL, $list41 );
    methods.subloop_register_instance_method( $sym0$DATE_QUESTION, $sym40$QUERIFY, $sym46$DATE_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym47$EXTRACT, $sym0$DATE_QUESTION, $list25, $list48, $list49 );
    methods.subloop_register_instance_method( $sym0$DATE_QUESTION, $sym47$EXTRACT, $sym61$DATE_QUESTION_EXTRACT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_date_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_date_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_date_question_file();
  }
  static
  {
    me = new date_question();
    $sym0$DATE_QUESTION = makeSymbol( "DATE-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
        makeSymbol( "ANSWER-TYPES" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-CARDINALITY" ), NIL, makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), ConsesLow.list( makeSymbol( "PASSAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ) );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE" );
    $sym24$ISA_ = makeSymbol( "ISA?" );
    $list25 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list26 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list27 = ConsesLow.list( makeString( "@return boolean; t if TREE is a date question, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ),
        ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list(
            makeSymbol( "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "when" ) ) ) ) ), ConsesLow
                    .list( EQUALP, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeString( "on what date" ) ) ) ) );
    $sym28$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "when" ) );
    $str31$on_what_date = makeString( "on what date" );
    $sym32$DATE_QUESTION_ISA__METHOD = makeSymbol( "DATE-QUESTION-ISA?-METHOD" );
    $list33 = ConsesLow.list( makeString( "@return listp; the list of expected answers of this question" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ),
        constant_handles.reader_make_constant_shell( makeString( "Date" ) ) ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "Time-Quantity" ) ) ) ) ) );
    $const34$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
    $const35$Time_Quantity = constant_handles.reader_make_constant_shell( makeString( "Time-Quantity" ) );
    $sym36$DATE_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "DATE-QUESTION-ANSWER-TYPES-METHOD" );
    $sym37$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list38 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), TEN_INTEGER ) );
    $sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "DATE-QUESTION-ANSWER-CARDINALITY-METHOD" );
    $sym40$QUERIFY = makeSymbol( "QUERIFY" );
    $list41 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "QUERIES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ), makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
            "NEW-GURUQA-QUERY" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) " ), ConsesLow.list( makeSymbol( "BUNGE" ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYSTRINGS" ) ) ) ), makeString( ")" ) ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ) ), ConsesLow.list( makeSymbol(
                    "RET" ), makeSymbol( "QUERIES" ) ) ) );
    $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DATE-QUESTION-METHOD" );
    $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM = makeString( "@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) " );
    $sym44$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $str45$_ = makeString( ")" );
    $sym46$DATE_QUESTION_QUERIFY_METHOD = makeSymbol( "DATE-QUESTION-QUERIFY-METHOD" );
    $sym47$EXTRACT = makeSymbol( "EXTRACT" );
    $list48 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list49 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "PPARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "FIM" ),
                makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEXIFIED" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol(
                    "PPARSE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PPARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol( "LEXICON" ) ) ) ), ConsesLow.list( makeSymbol(
                        "QSUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                            "QOBJECT" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "GET-SEMANTIC-OBJECTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "QPREDICATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "GET-PREDICATE" ) ) ) ), ConsesLow.list( makeSymbol( "ANSWERS" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "LEXIFIED" ),
                                        makeSymbol( "QPREDICATE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXIFIED" ),
                                            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                                                "VERBAL-TREE-P" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "WORD-IMPLIES" ), makeSymbol( "WORD" ), makeSymbol( "QPREDICATE" ) ) ), ConsesLow.list( makeSymbol(
                                                    "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "QSUBJECT" ), ConsesLow.list( makeSymbol( "WORD-TREE-P" ), ConsesLow
                                                        .list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol(
                                                            "WORD-IMPLIES" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                makeSymbol( "GET-SEMANTIC-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                    makeSymbol( "QSUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol(
                                                                        "QSUBJECT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                                                                            "QOBJECT" ), ConsesLow.list( makeSymbol( "WORD-TREE-P" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                    "WORD-IMPLIES" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                                        makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SEMANTIC-OBJECTS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                            "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "QOBJECT" ), ConsesLow.list(
                                                                                                makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "QOBJECT" ) ) ),
                                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORD" ),
                                                                                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-MODIFIERS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                                                                                    makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "MOD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                        "YIELD" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                                                            makeSymbol( "QUOTE" ), makeSymbol( "CANDIDATE-ANSWER-P" ) ), makeSymbol( "CANDIDATE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                                                ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                                                    "CANDIDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ),
                                                                                                    TEN_INTEGER ), makeSymbol( "ANSWERS" ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                                                                                        "ANSWERS" ) ) ) );
    $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-DATE-QUESTION-METHOD" );
    $sym51$LEARN = makeSymbol( "LEARN" );
    $sym52$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym53$LEXIFY = makeSymbol( "LEXIFY" );
    $sym54$GET_SEMANTIC_SUBJECT = makeSymbol( "GET-SEMANTIC-SUBJECT" );
    $sym55$GET_SEMANTIC_OBJECTS = makeSymbol( "GET-SEMANTIC-OBJECTS" );
    $sym56$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $sym57$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym58$CANDIDATE_ANSWER_P = makeSymbol( "CANDIDATE-ANSWER-P" );
    $sym59$YIELD = makeSymbol( "YIELD" );
    $sym60$GET_MODIFIERS = makeSymbol( "GET-MODIFIERS" );
    $sym61$DATE_QUESTION_EXTRACT_METHOD = makeSymbol( "DATE-QUESTION-EXTRACT-METHOD" );
  }
}
/*
 * 
 * Total time: 128 ms
 * 
 */