package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wh_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.wh_question";
  public static final String myFingerPrint = "3fc28cf43f1b4a9ab84988567cab58a0cc3137137691ea8aa2e4092f3f2e0849";
  private static final SubLSymbol $sym0$WH_QUESTION;
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
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS;
  private static final SubLSymbol $sym13$ISOLATED_P;
  private static final SubLSymbol $sym14$INSTANCE_NUMBER;
  private static final SubLSymbol $sym15$INFORMATION_REQUEST;
  private static final SubLSymbol $sym16$ERROR_HANDLING;
  private static final SubLSymbol $sym17$TIMEOUT;
  private static final SubLSymbol $sym18$STRING;
  private static final SubLSymbol $sym19$PARSE;
  private static final SubLSymbol $sym20$ANSWER_TYPES;
  private static final SubLSymbol $sym21$CORPORA;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE;
  private static final SubLSymbol $sym23$ISA_;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$WH_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym28$SENTENCE2WORD_TREES;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD;
  private static final SubLSymbol $sym32$QUERIFY;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
  private static final SubLSymbol $sym35$GET_KEYSTRINGS;
  private static final SubLSymbol $sym36$AUGMENT_TERMS;
  private static final SubLString $str37$_;
  private static final SubLSymbol $sym38$WH_QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym39$EXTRACT;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
  private static final SubLSymbol $sym43$LEARN;
  private static final SubLSymbol $sym44$GET_CONTENT;
  private static final SubLSymbol $sym45$LEXIFY_SENTENCE;
  private static final SubLSymbol $sym46$GET_KEYWORDS;
  private static final SubLSymbol $sym47$TREE_TYPE_MATCH;
  private static final SubLSymbol $sym48$GET_STRING;
  private static final SubLSymbol $sym49$WH_QUESTION_EXTRACT_METHOD;
  private static final SubLSymbol $sym50$SUBJECT_QUESTION_P;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
  private static final SubLSymbol $sym54$GET_HEAD;
  private static final SubLSymbol $sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD;
  private static final SubLSymbol $sym56$OBJECT_QUESTION_P;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
  private static final SubLSymbol $sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD;
  private static final SubLSymbol $sym60$GET_WH_PHRASE;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
  private static final SubLSymbol $sym63$FIND_FIRST;
  private static final SubLSymbol $sym64$WH_TREE_P;
  private static final SubLSymbol $sym65$WH_QUESTION_GET_WH_PHRASE_METHOD;
  private static final SubLSymbol $sym66$ANSWER_CARDINALITY;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
  public static SubLObject subloop_reserved_initialize_wh_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
  public static SubLObject subloop_reserved_initialize_wh_question_instance(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
  public static SubLObject wh_question_p(final SubLObject v_wh_question)
  {
    return classes.subloop_instanceof_class( v_wh_question, $sym0$WH_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1411L)
  public static SubLObject wh_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1589L)
  public static SubLObject wh_question_sentence2word_trees_method(final SubLObject self, final SubLObject sentence)
  {
    SubLObject word_trees = NIL;
    SubLObject i = ZERO_INTEGER;
    SubLObject cdolist_list_var = document.sentence_listify( sentence );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      word_trees = ConsesLow.cons( word_tree.new_word_tree( document.word_string( word ), document.word_category( word ), NIL, i, document.word_info( word ), UNPROVIDED ), word_trees );
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return Sequences.nreverse( word_trees );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1972L)
  public static SubLObject wh_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wh_question_method = NIL;
    final SubLObject corpora = question.get_question_corpora( self );
    try
    {
      thread.throwStack.push( $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
      try
      {
        SubLObject queries = NIL;
        final SubLObject content_terms = methods.funcall_instance_method_with_0_args( self, $sym35$GET_KEYSTRINGS );
        SubLObject cdolist_list_var = corpora;
        SubLObject corpus = NIL;
        corpus = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args( $sym1$QUESTION, $sym36$AUGMENT_TERMS, content_terms, corpus );
          queries = ConsesLow.cons( search_engine.new_lemur_query( Sequences.cconcatenate( string_utilities.bunge( content_terms, UNPROVIDED ), new SubLObject[] { $str37$_, string_utilities.bunge( augmentation_terms,
              UNPROVIDED )
          } ), corpus, UNPROVIDED, UNPROVIDED ), queries );
          cdolist_list_var = cdolist_list_var.rest();
          corpus = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD, Sequences.nreverse( queries ) );
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
      catch_var_for_wh_question_method = Errors.handleThrowable( ccatch_env_var, $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wh_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 2472L)
  public static SubLObject wh_question_extract_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wh_question_method = NIL;
    final SubLObject tagger = question.get_question_tagger( self );
    final SubLObject lexicon = question.get_question_lexicon( self );
    try
    {
      thread.throwStack.push( $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym43$LEARN, methods.funcall_instance_method_with_0_args( passage, $sym44$GET_CONTENT ) );
        final SubLObject sentence = question.sentencify( methods.funcall_instance_method_with_0_args( passage, $sym44$GET_CONTENT ) );
        final SubLObject tagged = pos_tagger.tagger_tag_sentence( tagger, sentence );
        final SubLObject lexified = ( NIL != sentence ) ? methods.funcall_instance_method_with_1_args( lexicon, $sym45$LEXIFY_SENTENCE, tagged ) : NIL;
        final SubLObject yield = methods.funcall_class_method_with_1_args( $sym0$WH_QUESTION, $sym28$SENTENCE2WORD_TREES, lexified );
        final SubLObject keywords = methods.funcall_instance_method_with_0_args( self, $sym46$GET_KEYWORDS );
        SubLObject answers = NIL;
        SubLObject i = NIL;
        if( NIL != lexified )
        {
          thread.resetMultipleValues();
          final SubLObject before = question.split_yield( yield, keywords );
          final SubLObject after = thread.secondMultipleValue();
          final SubLObject deviation = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != deviation && deviation.numL( EIGHT_INTEGER ) )
          {
            SubLObject cdolist_list_var = ConsesLow.list( before, after );
            SubLObject candidates = NIL;
            candidates = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              i = ZERO_INTEGER;
              SubLObject cdolist_list_var_$1 = candidates;
              SubLObject candidate = NIL;
              candidate = cdolist_list_var_$1.first();
              while ( NIL != cdolist_list_var_$1)
              {
                i = Numbers.add( i, ONE_INTEGER );
                final SubLObject score = methods.funcall_instance_method_with_1_args( self, $sym47$TREE_TYPE_MATCH, candidate );
                if( score.isPositive() )
                {
                  answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( candidate, $sym48$GET_STRING ), passage, Numbers.multiply( score, Numbers.divide( ONE_INTEGER, i
                      .numL( FOUR_INTEGER ) ? ONE_INTEGER : i ) ), UNPROVIDED ), answers );
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                candidate = cdolist_list_var_$1.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              candidates = cdolist_list_var.first();
            }
          }
        }
        Dynamic.sublisp_throw( $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD, answers );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_tagger( self, tagger );
          question.set_question_lexicon( self, lexicon );
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
      catch_var_for_wh_question_method = Errors.handleThrowable( ccatch_env_var, $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wh_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3625L)
  public static SubLObject wh_question_subject_question_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wh_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD, makeBoolean( NIL == word_tree.aux_verb_tree_p( methods.funcall_instance_method_with_0_args( parse, $sym54$GET_HEAD ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
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
      catch_var_for_wh_question_method = Errors.handleThrowable( ccatch_env_var, $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wh_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3816L)
  public static SubLObject wh_question_object_question_p_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wh_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD, word_tree.aux_verb_tree_p( methods.funcall_instance_method_with_0_args( parse, $sym54$GET_HEAD ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
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
      catch_var_for_wh_question_method = Errors.handleThrowable( ccatch_env_var, $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wh_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3999L)
  public static SubLObject wh_question_get_wh_phrase_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_wh_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD, methods.funcall_instance_method_with_1_args( parse, $sym63$FIND_FIRST, $sym64$WH_TREE_P ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
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
      catch_var_for_wh_question_method = Errors.handleThrowable( ccatch_env_var, $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_wh_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 4207L)
  public static SubLObject wh_question_answer_cardinality_method(final SubLObject self)
  {
    return THREE_INTEGER;
  }

  public static SubLObject declare_wh_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wh_question_class", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_wh_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_p", "WH-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_isaP_method", "WH-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "wh_question_sentence2word_trees_method", "WH-QUESTION-SENTENCE2WORD-TREES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "wh_question_querify_method", "WH-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_extract_method", "WH-QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "wh_question_subject_question_p_method", "WH-QUESTION-SUBJECT-QUESTION-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_object_question_p_method", "WH-QUESTION-OBJECT-QUESTION-P-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_get_wh_phrase_method", "WH-QUESTION-GET-WH-PHRASE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "wh_question_answer_cardinality_method", "WH-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_wh_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_wh_question_file()
  {
    classes.subloop_new_class( $sym0$WH_QUESTION, $sym1$QUESTION, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$WH_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$WH_QUESTION, $sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$WH_QUESTION, $sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE );
    subloop_reserved_initialize_wh_question_class( $sym0$WH_QUESTION );
    methods.methods_incorporate_class_method( $sym23$ISA_, $sym0$WH_QUESTION, $list24, $list25, $list26 );
    methods.subloop_register_class_method( $sym0$WH_QUESTION, $sym23$ISA_, $sym27$WH_QUESTION_ISA__METHOD );
    methods.methods_incorporate_class_method( $sym28$SENTENCE2WORD_TREES, $sym0$WH_QUESTION, $list24, $list29, $list30 );
    methods.subloop_register_class_method( $sym0$WH_QUESTION, $sym28$SENTENCE2WORD_TREES, $sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD );
    methods.methods_incorporate_instance_method( $sym32$QUERIFY, $sym0$WH_QUESTION, $list24, NIL, $list33 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym32$QUERIFY, $sym38$WH_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym39$EXTRACT, $sym0$WH_QUESTION, $list24, $list40, $list41 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym39$EXTRACT, $sym49$WH_QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym50$SUBJECT_QUESTION_P, $sym0$WH_QUESTION, $list51, NIL, $list52 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym50$SUBJECT_QUESTION_P, $sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD );
    methods.methods_incorporate_instance_method( $sym56$OBJECT_QUESTION_P, $sym0$WH_QUESTION, $list51, NIL, $list57 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym56$OBJECT_QUESTION_P, $sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD );
    methods.methods_incorporate_instance_method( $sym60$GET_WH_PHRASE, $sym0$WH_QUESTION, $list24, NIL, $list61 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym60$GET_WH_PHRASE, $sym65$WH_QUESTION_GET_WH_PHRASE_METHOD );
    methods.methods_incorporate_instance_method( $sym66$ANSWER_CARDINALITY, $sym0$WH_QUESTION, $list24, NIL, $list67 );
    methods.subloop_register_instance_method( $sym0$WH_QUESTION, $sym66$ANSWER_CARDINALITY, $sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_wh_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_wh_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_wh_question_file();
  }
  static
  {
    me = new wh_question();
    $sym0$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $sym1$QUESTION = makeSymbol( "QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
        makeSymbol( "SENTENCE2WORD-TREES" ), ConsesLow.list( makeSymbol( "SENTENCE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "SUBJECT-QUESTION-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OBJECT-QUESTION-P" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-WH-PHRASE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-CARDINALITY" ), NIL, makeKeyword(
                        "PROTECTED" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$LEXICON = makeSymbol( "LEXICON" );
    $sym6$PARSER = makeSymbol( "PARSER" );
    $sym7$TAGGER = makeSymbol( "TAGGER" );
    $sym8$CHUNKER = makeSymbol( "CHUNKER" );
    $sym9$MAX_CANDIDATES = makeSymbol( "MAX-CANDIDATES" );
    $sym10$MAX_CONFIDENCE = makeSymbol( "MAX-CONFIDENCE" );
    $sym11$LEARNABLE_TYPES = makeSymbol( "LEARNABLE-TYPES" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS" );
    $sym13$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym14$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym15$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym16$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym17$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym18$STRING = makeSymbol( "STRING" );
    $sym19$PARSE = makeSymbol( "PARSE" );
    $sym20$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym21$CORPORA = makeSymbol( "CORPORA" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE" );
    $sym23$ISA_ = makeSymbol( "ISA?" );
    $list24 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list25 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list26 = ConsesLow.list( makeString( "@param TREE parse-tree-p; \n   @return boolean; t if TREE is a wh-question, nil otherwise" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "TREE" ) ), ConsesLow.list(
        makeSymbol( "RET" ), NIL ) );
    $sym27$WH_QUESTION_ISA__METHOD = makeSymbol( "WH-QUESTION-ISA?-METHOD" );
    $sym28$SENTENCE2WORD_TREES = makeSymbol( "SENTENCE2WORD-TREES" );
    $list29 = ConsesLow.list( makeSymbol( "SENTENCE" ) );
    $list30 = ConsesLow.list( makeString( "Convert a sentence object into a list of word-tree objects" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "WORD-TREES" ), NIL ), ConsesLow
        .list( makeSymbol( "I" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "SENTENCE-LISTIFY" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow
            .list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-WORD-TREE" ), ConsesLow.list( makeSymbol( "WORD-STRING" ), makeSymbol( "WORD" ) ), ConsesLow.list( makeSymbol( "WORD-CATEGORY" ), makeSymbol(
                "WORD" ) ), NIL, makeSymbol( "I" ), ConsesLow.list( makeSymbol( "WORD-INFO" ), makeSymbol( "WORD" ) ) ), makeSymbol( "WORD-TREES" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "WORD-TREES" ) ) ) ) );
    $sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD = makeSymbol( "WH-QUESTION-SENTENCE2WORD-TREES-METHOD" );
    $sym32$QUERIFY = makeSymbol( "QUERIFY" );
    $list33 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "QUERIES" ), NIL ), ConsesLow.list( makeSymbol( "CONTENT-TERMS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-KEYSTRINGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ), makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                makeSymbol( "AUGMENTATION-TERMS" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUESTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "AUGMENT-TERMS" ) ), makeSymbol( "CONTENT-TERMS" ), makeSymbol( "CORPUS" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-LEMUR-QUERY" ), ConsesLow.list( makeSymbol(
                        "CCONCATENATE" ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "CONTENT-TERMS" ) ), makeString( " " ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "AUGMENTATION-TERMS" ) ) ),
                        makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "QUERIES" ) ) ) ) );
    $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WH-QUESTION-METHOD" );
    $sym35$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $sym36$AUGMENT_TERMS = makeSymbol( "AUGMENT-TERMS" );
    $str37$_ = makeString( " " );
    $sym38$WH_QUESTION_QUERIFY_METHOD = makeSymbol( "WH-QUESTION-QUERIFY-METHOD" );
    $sym39$EXTRACT = makeSymbol( "EXTRACT" );
    $list40 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list41 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "SENTENCIFY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "TAGGED" ), ConsesLow.list( makeSymbol( "TAGGER-TAG-SENTENCE" ), makeSymbol( "TAGGER" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( makeSymbol(
                    "LEXIFIED" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEXIFY-SENTENCE" ) ), makeSymbol( "TAGGED" ) ) ) ), ConsesLow.list( makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "WH-QUESTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENTENCE2WORD-TREES" ) ), makeSymbol( "LEXIFIED" ) ) ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORDS" ) ) ) ), ConsesLow.list( makeSymbol( "ANSWERS" ), NIL ), makeSymbol( "I" ) ),
            ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXIFIED" ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "BEFORE" ), makeSymbol( "AFTER" ), makeSymbol(
                "DEVIATION" ) ), ConsesLow.list( makeSymbol( "SPLIT-YIELD" ), makeSymbol( "YIELD" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol(
                    "DEVIATION" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "DEVIATION" ), EIGHT_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CANDIDATES" ), ConsesLow.list(
                        makeSymbol( "LIST" ), makeSymbol( "BEFORE" ), makeSymbol( "AFTER" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "I" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                            ConsesLow.list( makeSymbol( "CANDIDATE" ), makeSymbol( "CANDIDATES" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                                ConsesLow.list( makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TREE-TYPE-MATCH" ) ), makeSymbol(
                                    "CANDIDATE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PLUSP" ), makeSymbol( "SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                        makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CANDIDATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                            "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "/" ), ONE_INTEGER, ConsesLow.list(
                                                makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "I" ), FOUR_INTEGER ), ONE_INTEGER, makeSymbol( "I" ) ) ) ) ), makeSymbol( "ANSWERS" ) ) ) ) ) ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWERS" ) ) ) );
    $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WH-QUESTION-METHOD" );
    $sym43$LEARN = makeSymbol( "LEARN" );
    $sym44$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym45$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym46$GET_KEYWORDS = makeSymbol( "GET-KEYWORDS" );
    $sym47$TREE_TYPE_MATCH = makeSymbol( "TREE-TYPE-MATCH" );
    $sym48$GET_STRING = makeSymbol( "GET-STRING" );
    $sym49$WH_QUESTION_EXTRACT_METHOD = makeSymbol( "WH-QUESTION-EXTRACT-METHOD" );
    $sym50$SUBJECT_QUESTION_P = makeSymbol( "SUBJECT-QUESTION-P" );
    $list51 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list52 = ConsesLow.list( makeString( "@return booleanp; t if this is a subject question, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol(
        "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) ) );
    $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WH-QUESTION-METHOD" );
    $sym54$GET_HEAD = makeSymbol( "GET-HEAD" );
    $sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD = makeSymbol( "WH-QUESTION-SUBJECT-QUESTION-P-METHOD" );
    $sym56$OBJECT_QUESTION_P = makeSymbol( "OBJECT-QUESTION-P" );
    $list57 = ConsesLow.list( makeString( "@return booleanp; t if this is a subject question, nil otherwise" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list(
        makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) ) ) );
    $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WH-QUESTION-METHOD" );
    $sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD = makeSymbol( "WH-QUESTION-OBJECT-QUESTION-P-METHOD" );
    $sym60$GET_WH_PHRASE = makeSymbol( "GET-WH-PHRASE" );
    $list61 = ConsesLow.list( makeString( "@return parse-tree-p; the initial wh phrase of this question, \n   like 'How many', 'Where', etc" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FIND-FIRST" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WH-TREE-P" ) ) ) ) );
    $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WH-QUESTION-METHOD" );
    $sym63$FIND_FIRST = makeSymbol( "FIND-FIRST" );
    $sym64$WH_TREE_P = makeSymbol( "WH-TREE-P" );
    $sym65$WH_QUESTION_GET_WH_PHRASE_METHOD = makeSymbol( "WH-QUESTION-GET-WH-PHRASE-METHOD" );
    $sym66$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list67 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), THREE_INTEGER ) );
    $sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "WH-QUESTION-ANSWER-CARDINALITY-METHOD" );
  }
}
/*
 * 
 * Total time: 199 ms
 * 
 */