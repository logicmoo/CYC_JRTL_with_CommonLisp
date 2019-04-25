package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class what_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.what_question";
  public static final String myFingerPrint = "110890ec5523e37b52f43578a3d4df209091799a4adb73f29c80d7ded654cda0";
  private static final SubLSymbol $sym0$WHAT_QUESTION;
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
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE;
  private static final SubLSymbol $sym24$ISA_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_DAUGHTER;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$GET_SUBJECT;
  private static final SubLSymbol $sym32$GET_PREDICATE;
  private static final SubLSymbol $sym33$WHAT_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym34$REQUIRE_PERCENTAGE;
  private static final SubLList $list35;
  private static final SubLInteger $int36$100;
  private static final SubLSymbol $sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD;
  private static final SubLSymbol $sym38$QUERIFY;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
  private static final SubLSymbol $sym41$GET_FOCUS;
  private static final SubLSymbol $sym42$WORD_TREE_GET_STRING_METHOD;
  private static final SubLSymbol $sym43$GET_KEYWORDS;
  private static final SubLSymbol $sym44$YIELD;
  private static final SubLString $str45$_;
  private static final SubLString $str46$_SEN__SYN_;
  private static final SubLString $str47$__;
  private static final SubLString $str48$_;
  private static final SubLSymbol $sym49$WHAT_QUESTION_QUERIFY_METHOD;
  private static final SubLSymbol $sym50$EXTRACT;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
  private static final SubLSymbol $sym54$LEARN;
  private static final SubLSymbol $sym55$GET_CONTENT;
  private static final SubLSymbol $sym56$LEXIFY_SENTENCE;
  private static final SubLSymbol $sym57$SENTENCE2WORD_TREES;
  private static final SubLSymbol $sym58$TREE_TYPE_MATCH;
  private static final SubLSymbol $sym59$WHAT_QUESTION_EXTRACT_METHOD;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
  private static final SubLSymbol $sym62$SUBJECT_QUESTION_P;
  private static final SubLSymbol $sym63$GET_OBJECTS;
  private static final SubLSymbol $sym64$WHAT_QUESTION_GET_FOCUS_METHOD;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
  private static final SubLSymbol $sym67$GET_HEAD;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$GET;
  private static final SubLSymbol $kw70$PENN_TAGS;
  private static final SubLSymbol $kw71$DENOT;
  private static final SubLSymbol $sym72$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const73$EverythingPSC;
  private static final SubLSymbol $sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD;
  private static final SubLSymbol $sym75$ANSWER_CARDINALITY;
  private static final SubLList $list76;
  private static final SubLInteger $int77$25;
  private static final SubLSymbol $sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
  public static SubLObject subloop_reserved_initialize_what_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
  public static SubLObject subloop_reserved_initialize_what_question_instance(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
  public static SubLObject what_question_p(final SubLObject v_what_question)
  {
    return classes.subloop_instanceof_class( v_what_question, $sym0$WHAT_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1293L)
  public static SubLObject what_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ), $list30, EQUALP ) && NIL != methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ONE_INTEGER ), $sym31$GET_SUBJECT ) && NIL == word_tree.aux_verb_tree_p( methods
                .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ONE_INTEGER ), $sym32$GET_PREDICATE ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1664L)
  public static SubLObject what_question_require_percentage_method(final SubLObject self)
  {
    return $int36$100;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1876L)
  public static SubLObject what_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_what_question_method = NIL;
    final SubLObject answer_types = question.get_question_answer_types( self );
    try
    {
      thread.throwStack.push( $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
      try
      {
        final SubLObject focus = methods.funcall_instance_method_with_0_args( self, $sym41$GET_FOCUS );
        if( NIL != focus )
        {
          final SubLObject search_terms = Mapping.mapcar( $sym42$WORD_TREE_GET_STRING_METHOD, conses_high.set_difference( methods.funcall_instance_method_with_0_args( self, $sym43$GET_KEYWORDS ), methods
              .funcall_instance_method_with_0_args( focus, $sym44$YIELD ), UNPROVIDED, UNPROVIDED ) );
          SubLObject search_type = NIL;
          SubLObject search_types = NIL;
          SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( self, $sym21$ANSWER_TYPES );
          SubLObject path = NIL;
          path = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject cdolist_list_var_$1 = path;
            SubLObject type = NIL;
            type = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              search_type = question.cyc_to_resporator( type );
              if( NIL != search_type )
              {
                search_types = ConsesLow.cons( Sequences.cconcatenate( print_high.princ_to_string( search_type ), $str45$_ ), search_types );
              }
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              type = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            path = cdolist_list_var.first();
          }
          if( NIL != search_types )
          {
            Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, ConsesLow.list( search_engine.new_guruqa_query( Sequences.cconcatenate( $str46$_SEN__SYN_, new SubLObject[] { string_utilities.bunge(
                search_types, UNPROVIDED ), $str47$__, string_utilities.bunge( search_terms, UNPROVIDED ), $str48$_
            } ), UNPROVIDED ) ) );
          }
          else
          {
            Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, ConsesLow.list( search_engine.new_lemur_query( methods.funcall_instance_method_with_0_args( self, $sym29$GET_STRING ), UNPROVIDED,
                UNPROVIDED, UNPROVIDED ) ) );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_answer_types( self, answer_types );
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
      catch_var_for_what_question_method = Errors.handleThrowable( ccatch_env_var, $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_what_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 2863L)
  public static SubLObject what_question_extract_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_what_question_method = NIL;
    final SubLObject tagger = question.get_question_tagger( self );
    final SubLObject lexicon = question.get_question_lexicon( self );
    try
    {
      thread.throwStack.push( $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( lexicon, $sym54$LEARN, methods.funcall_instance_method_with_0_args( passage, $sym55$GET_CONTENT ) );
        final SubLObject sentence = question.sentencify( methods.funcall_instance_method_with_0_args( passage, $sym55$GET_CONTENT ) );
        final SubLObject tagged = pos_tagger.tagger_tag_sentence( tagger, sentence );
        final SubLObject lexified = ( NIL != sentence ) ? methods.funcall_instance_method_with_1_args( lexicon, $sym56$LEXIFY_SENTENCE, tagged ) : NIL;
        final SubLObject yield = methods.funcall_class_method_with_1_args( $sym1$WH_QUESTION, $sym57$SENTENCE2WORD_TREES, lexified );
        final SubLObject keywords = conses_high.set_difference( methods.funcall_instance_method_with_0_args( self, $sym43$GET_KEYWORDS ), methods.funcall_instance_method_with_0_args( methods
            .funcall_instance_method_with_0_args( self, $sym41$GET_FOCUS ), $sym44$YIELD ), UNPROVIDED, UNPROVIDED );
        SubLObject answers = NIL;
        SubLObject i = NIL;
        if( NIL != lexified )
        {
          thread.resetMultipleValues();
          final SubLObject before = question.split_yield( yield, keywords );
          final SubLObject after = thread.secondMultipleValue();
          final SubLObject deviation = thread.thirdMultipleValue();
          final SubLObject found = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          if( NIL != deviation && deviation.numL( EIGHT_INTEGER ) && Sequences.length( keywords ).numE( found ) )
          {
            SubLObject cdolist_list_var = ConsesLow.list( before, after );
            SubLObject candidates = NIL;
            candidates = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              i = ZERO_INTEGER;
              SubLObject cdolist_list_var_$2 = candidates;
              SubLObject candidate = NIL;
              candidate = cdolist_list_var_$2.first();
              while ( NIL != cdolist_list_var_$2)
              {
                i = Numbers.add( i, ONE_INTEGER );
                final SubLObject score = methods.funcall_instance_method_with_1_args( self, $sym58$TREE_TYPE_MATCH, candidate );
                if( score.isPositive() )
                {
                  answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( candidate, $sym29$GET_STRING ), passage, Numbers.multiply( score, Numbers.divide( ONE_INTEGER, i
                      .numL( FOUR_INTEGER ) ? ONE_INTEGER : i ) ), UNPROVIDED ), answers );
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                candidate = cdolist_list_var_$2.first();
              }
              cdolist_list_var = cdolist_list_var.rest();
              candidates = cdolist_list_var.first();
            }
          }
        }
        Dynamic.sublisp_throw( $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, answers );
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
      catch_var_for_what_question_method = Errors.handleThrowable( ccatch_env_var, $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_what_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 4104L)
  public static SubLObject what_question_get_focus_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_what_question_method = NIL;
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, ( NIL != methods.funcall_instance_method_with_0_args( self, $sym62$SUBJECT_QUESTION_P ) ) ? methods.funcall_instance_method_with_0_args( parse,
            $sym31$GET_SUBJECT ) : methods.funcall_instance_method_with_0_args( parse, $sym63$GET_OBJECTS ).first() );
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
      catch_var_for_what_question_method = Errors.handleThrowable( ccatch_env_var, $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_what_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 4339L)
  public static SubLObject what_question_answer_types_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_what_question_method = NIL;
    final SubLObject lexicon = question.get_question_lexicon( self );
    try
    {
      thread.throwStack.push( $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
      try
      {
        final SubLObject focus = methods.funcall_instance_method_with_0_args( self, $sym41$GET_FOCUS );
        final SubLObject head = ( NIL != focus ) ? methods.funcall_instance_method_with_0_args( focus, $sym67$GET_HEAD ) : NIL;
        final SubLObject focus_string = ( NIL != head ) ? methods.funcall_instance_method_with_0_args( head, $sym29$GET_STRING ) : NIL;
        SubLObject lextypes = NIL;
        SubLObject mytypes = NIL;
        if( NIL != focus_string )
        {
          SubLObject cdolist_list_var = ConsesLow.append( methods.funcall_instance_method_with_1_args( lexicon, $sym69$GET, focus_string ), methods.funcall_instance_method_with_1_args( lexicon, $sym69$GET, Strings
              .string_downcase( focus_string, UNPROVIDED, UNPROVIDED ) ) );
          SubLObject lex = NIL;
          lex = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != conses_high.intersection( $list68, methods.funcall_instance_method_with_1_args( lex, $sym69$GET, $kw70$PENN_TAGS ), EQ, UNPROVIDED ) )
            {
              final SubLObject item_var = methods.funcall_instance_method_with_1_args( lex, $sym69$GET, $kw71$DENOT );
              if( NIL == conses_high.member( item_var, lextypes, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                lextypes = ConsesLow.cons( item_var, lextypes );
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
          }
          final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym72$RELEVANT_MT_IS_EVERYTHING, thread );
            mt_relevance_macros.$mt$.bind( $const73$EverythingPSC, thread );
            SubLObject cdolist_list_var2 = lextypes;
            SubLObject lextype = NIL;
            lextype = cdolist_list_var2.first();
            while ( NIL != cdolist_list_var2)
            {
              final SubLObject type_path = ConsesLow.list( lextype );
              mytypes = ConsesLow.cons( Sequences.nreverse( type_path ), mytypes );
              cdolist_list_var2 = cdolist_list_var2.rest();
              lextype = cdolist_list_var2.first();
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
          }
          Dynamic.sublisp_throw( $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, mytypes );
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_lexicon( self, lexicon );
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
      catch_var_for_what_question_method = Errors.handleThrowable( ccatch_env_var, $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_what_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 5438L)
  public static SubLObject what_question_answer_cardinality_method(final SubLObject self)
  {
    return $int77$25;
  }

  public static SubLObject declare_what_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_what_question_class", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_what_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_p", "WHAT-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_isaP_method", "WHAT-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "what_question_require_percentage_method", "WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_querify_method", "WHAT-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_extract_method", "WHAT-QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "what_question_get_focus_method", "WHAT-QUESTION-GET-FOCUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_answer_types_method", "WHAT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "what_question_answer_cardinality_method", "WHAT-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_what_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_what_question_file()
  {
    classes.subloop_new_class( $sym0$WHAT_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$WHAT_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$WHAT_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$WHAT_QUESTION, $sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE );
    subloop_reserved_initialize_what_question_class( $sym0$WHAT_QUESTION );
    methods.methods_incorporate_class_method( $sym24$ISA_, $sym0$WHAT_QUESTION, $list25, $list26, $list27 );
    methods.subloop_register_class_method( $sym0$WHAT_QUESTION, $sym24$ISA_, $sym33$WHAT_QUESTION_ISA__METHOD );
    methods.methods_incorporate_class_method( $sym34$REQUIRE_PERCENTAGE, $sym0$WHAT_QUESTION, $list25, NIL, $list35 );
    methods.subloop_register_class_method( $sym0$WHAT_QUESTION, $sym34$REQUIRE_PERCENTAGE, $sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym38$QUERIFY, $sym0$WHAT_QUESTION, $list25, NIL, $list39 );
    methods.subloop_register_instance_method( $sym0$WHAT_QUESTION, $sym38$QUERIFY, $sym49$WHAT_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym50$EXTRACT, $sym0$WHAT_QUESTION, $list25, $list51, $list52 );
    methods.subloop_register_instance_method( $sym0$WHAT_QUESTION, $sym50$EXTRACT, $sym59$WHAT_QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym41$GET_FOCUS, $sym0$WHAT_QUESTION, $list25, NIL, $list60 );
    methods.subloop_register_instance_method( $sym0$WHAT_QUESTION, $sym41$GET_FOCUS, $sym64$WHAT_QUESTION_GET_FOCUS_METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$WHAT_QUESTION, $list25, NIL, $list65 );
    methods.subloop_register_instance_method( $sym0$WHAT_QUESTION, $sym21$ANSWER_TYPES, $sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym75$ANSWER_CARDINALITY, $sym0$WHAT_QUESTION, $list25, NIL, $list76 );
    methods.subloop_register_instance_method( $sym0$WHAT_QUESTION, $sym75$ANSWER_CARDINALITY, $sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_what_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_what_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_what_question_file();
  }
  static
  {
    me = new what_question();
    $sym0$WHAT_QUESTION = makeSymbol( "WHAT-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
        makeSymbol( "REQUIRE-PERCENTAGE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), ConsesLow.list( makeSymbol( "PASSAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ),
                NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-CARDINALITY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-FOCUS" ), NIL, makeKeyword( "PROTECTED" ) ) );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE" );
    $sym24$ISA_ = makeSymbol( "ISA?" );
    $list25 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list26 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "what" ), makeString( "which" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow
                        .list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PREDICATE" ) ) ) ) ) ) ) );
    $sym28$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "what" ), makeString( "which" ) );
    $sym31$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $sym32$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $sym33$WHAT_QUESTION_ISA__METHOD = makeSymbol( "WHAT-QUESTION-ISA?-METHOD" );
    $sym34$REQUIRE_PERCENTAGE = makeSymbol( "REQUIRE-PERCENTAGE" );
    $list35 = ConsesLow.list( makeString( "@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers" ), ConsesLow.list( makeSymbol( "RET" ),
        makeInteger( 100 ) ) );
    $int36$100 = makeInteger( 100 );
    $sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD = makeSymbol( "WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD" );
    $sym38$QUERIFY = makeSymbol( "QUERIFY" );
    $list39 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
            "FOCUS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SEARCH-TERMS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "WORD-TREE-GET-STRING-METHOD" ) ), ConsesLow.list( makeSymbol( "SET-DIFFERENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-KEYWORDS" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ) ), makeSymbol( "SEARCH-TYPE" ), ConsesLow.list(
                        makeSymbol( "SEARCH-TYPES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "PATH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "ANSWER-TYPES" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "PATH" ) ), ConsesLow.list( makeSymbol(
                                "CSETQ" ), makeSymbol( "SEARCH-TYPE" ), ConsesLow.list( makeSymbol( "CYC-TO-RESPORATOR" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "SEARCH-TYPE" ),
                                    ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), ConsesLow.list( makeSymbol( "PRINC-TO-STRING" ), makeSymbol( "SEARCH-TYPE" ) ), makeString(
                                        "$" ) ), makeSymbol( "SEARCH-TYPES" ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "SEARCH-TYPES" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                            "LIST" ), ConsesLow.list( makeSymbol( "NEW-GURUQA-QUERY" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "@SEN(@SYN(" ), ConsesLow.list( makeSymbol( "BUNGE" ),
                                                makeSymbol( "SEARCH-TYPES" ) ), makeString( ") " ), ConsesLow.list( makeSymbol( "BUNGE" ), makeSymbol( "SEARCH-TERMS" ) ), makeString( ")" ) ) ) ) ), ConsesLow.list(
                                                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "NEW-LEMUR-QUERY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ),
                                                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ) ) ) ) ) ) );
    $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WHAT-QUESTION-METHOD" );
    $sym41$GET_FOCUS = makeSymbol( "GET-FOCUS" );
    $sym42$WORD_TREE_GET_STRING_METHOD = makeSymbol( "WORD-TREE-GET-STRING-METHOD" );
    $sym43$GET_KEYWORDS = makeSymbol( "GET-KEYWORDS" );
    $sym44$YIELD = makeSymbol( "YIELD" );
    $str45$_ = makeString( "$" );
    $str46$_SEN__SYN_ = makeString( "@SEN(@SYN(" );
    $str47$__ = makeString( ") " );
    $str48$_ = makeString( ")" );
    $sym49$WHAT_QUESTION_QUERIFY_METHOD = makeSymbol( "WHAT-QUESTION-QUERIFY-METHOD" );
    $sym50$EXTRACT = makeSymbol( "EXTRACT" );
    $list51 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list52 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ),
        makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
            .list( ConsesLow.list( makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "SENTENCIFY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "TAGGED" ), ConsesLow.list( makeSymbol( "TAGGER-TAG-SENTENCE" ), makeSymbol( "TAGGER" ), makeSymbol( "SENTENCE" ) ) ), ConsesLow.list( makeSymbol(
                    "LEXIFIED" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "SENTENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "LEXIFY-SENTENCE" ) ), makeSymbol( "TAGGED" ) ) ) ), ConsesLow.list( makeSymbol( "YIELD" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "WH-QUESTION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SENTENCE2WORD-TREES" ) ), makeSymbol( "LEXIFIED" ) ) ), ConsesLow.list( makeSymbol( "KEYWORDS" ), ConsesLow.list(
                                makeSymbol( "SET-DIFFERENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYWORDS" ) ) ), ConsesLow.list(
                                    makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "YIELD" ) ) ) ) ), ConsesLow.list( makeSymbol( "ANSWERS" ), NIL ), makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "LEXIFIED" ),
                                            ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "BEFORE" ), makeSymbol( "AFTER" ), makeSymbol( "DEVIATION" ), makeSymbol( "FOUND" ) ),
                                                ConsesLow.list( makeSymbol( "SPLIT-YIELD" ), makeSymbol( "YIELD" ), makeSymbol( "KEYWORDS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                                    makeSymbol( "DEVIATION" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol( "DEVIATION" ), EIGHT_INTEGER ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol(
                                                        "LENGTH" ), makeSymbol( "KEYWORDS" ) ), makeSymbol( "FOUND" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CANDIDATES" ), ConsesLow
                                                            .list( makeSymbol( "LIST" ), makeSymbol( "BEFORE" ), makeSymbol( "AFTER" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "I" ), ZERO_INTEGER ),
                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CANDIDATE" ), makeSymbol( "CANDIDATES" ) ), ConsesLow.list( makeSymbol( "CINC" ),
                                                                makeSymbol( "I" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SCORE" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                                    makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TREE-TYPE-MATCH" ) ), makeSymbol( "CANDIDATE" ) ) ) ), ConsesLow.list(
                                                                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PLUSP" ), makeSymbol( "SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                            makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CANDIDATE" ), ConsesLow.list(
                                                                                makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "*" ), makeSymbol( "SCORE" ),
                                                                                    ConsesLow.list( makeSymbol( "/" ), ONE_INTEGER, ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "<" ), makeSymbol(
                                                                                        "I" ), FOUR_INTEGER ), ONE_INTEGER, makeSymbol( "I" ) ) ) ) ), makeSymbol( "ANSWERS" ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                            "RET" ), makeSymbol( "ANSWERS" ) ) ) );
    $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WHAT-QUESTION-METHOD" );
    $sym54$LEARN = makeSymbol( "LEARN" );
    $sym55$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $sym56$LEXIFY_SENTENCE = makeSymbol( "LEXIFY-SENTENCE" );
    $sym57$SENTENCE2WORD_TREES = makeSymbol( "SENTENCE2WORD-TREES" );
    $sym58$TREE_TYPE_MATCH = makeSymbol( "TREE-TYPE-MATCH" );
    $sym59$WHAT_QUESTION_EXTRACT_METHOD = makeSymbol( "WHAT-QUESTION-EXTRACT-METHOD" );
    $list60 = ConsesLow.list( makeString( "@return parse-tree-p; the focus of this what-question" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "FIM" ),
        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUBJECT-QUESTION-P" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-OBJECTS" ) ) ) ) ) ) );
    $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WHAT-QUESTION-METHOD" );
    $sym62$SUBJECT_QUESTION_P = makeSymbol( "SUBJECT-QUESTION-P" );
    $sym63$GET_OBJECTS = makeSymbol( "GET-OBJECTS" );
    $sym64$WHAT_QUESTION_GET_FOCUS_METHOD = makeSymbol( "WHAT-QUESTION-GET-FOCUS-METHOD" );
    $list65 = ConsesLow.list( makeString( "@return listp; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-FOCUS" ) ) ) ),
            ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "GET-HEAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "FOCUS-STRING" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "HEAD" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEXTYPES" ), NIL ), ConsesLow.list( makeSymbol( "MYTYPES" ), NIL ) ), ConsesLow.list(
                        makeSymbol( "PWHEN" ), makeSymbol( "FOCUS-STRING" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list(
                            makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeSymbol( "FOCUS-STRING" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), ConsesLow.list( makeSymbol( "STRING-DOWNCASE" ), makeSymbol( "FOCUS-STRING" ) ) ) ) ), ConsesLow.list(
                                    makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INTERSECTION" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "NN" ), makeKeyword( "NNS" ) ) ), ConsesLow
                                        .list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ), makeKeyword( "PENN-TAGS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                            EQ ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET" ) ),
                                                makeKeyword( "DENOT" ) ), makeSymbol( "LEXTYPES" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-ALL-MTS" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                                    "LEXTYPE" ), makeSymbol( "LEXTYPES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPE-PATH" ), ConsesLow.list( makeSymbol(
                                                        "LIST" ), makeSymbol( "LEXTYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "TYPE-PATH" ) ), makeSymbol(
                                                            "MYTYPES" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MYTYPES" ) ) ) ) );
    $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-WHAT-QUESTION-METHOD" );
    $sym67$GET_HEAD = makeSymbol( "GET-HEAD" );
    $list68 = ConsesLow.list( makeKeyword( "NN" ), makeKeyword( "NNS" ) );
    $sym69$GET = makeSymbol( "GET" );
    $kw70$PENN_TAGS = makeKeyword( "PENN-TAGS" );
    $kw71$DENOT = makeKeyword( "DENOT" );
    $sym72$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const73$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "WHAT-QUESTION-ANSWER-TYPES-METHOD" );
    $sym75$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list76 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), makeInteger( 25 ) ) );
    $int77$25 = makeInteger( 25 );
    $sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "WHAT-QUESTION-ANSWER-CARDINALITY-METHOD" );
  }
}
/*
 * 
 * Total time: 428 ms
 * 
 */