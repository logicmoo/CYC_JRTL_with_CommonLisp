package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class geographical_question
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.geographical_question";
  public static final String myFingerPrint = "ab5c5ccc730d12ae3ce821f4d4ce57f5ebcbd4ebd55bc2c85b53ed5128ab076b";
  private static final SubLSymbol $sym0$GEOGRAPHICAL_QUESTION;
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
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS;
  private static final SubLSymbol $sym14$ISOLATED_P;
  private static final SubLSymbol $sym15$INSTANCE_NUMBER;
  private static final SubLSymbol $sym16$INFORMATION_REQUEST;
  private static final SubLSymbol $sym17$ERROR_HANDLING;
  private static final SubLSymbol $sym18$TIMEOUT;
  private static final SubLSymbol $sym19$STRING;
  private static final SubLSymbol $sym20$PARSE;
  private static final SubLSymbol $sym21$ANSWER_TYPES;
  private static final SubLSymbol $sym22$CORPORA;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE;
  private static final SubLSymbol $sym24$ISA_;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$GET_DAUGHTER;
  private static final SubLSymbol $sym29$GET_STRING;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$GET_PREDICATE;
  private static final SubLSymbol $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD;
  private static final SubLSymbol $sym33$QUERIFY;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
  private static final SubLSymbol $sym36$GET_SUBJECT;
  private static final SubLObject $const37$thereExists;
  private static final SubLSymbol $sym38$_FOCUS;
  private static final SubLObject $const39$and;
  private static final SubLList $list40;
  private static final SubLObject $const41$placeName_Standard;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLString $str44$_a___in;
  private static final SubLString $str45$_a___near;
  private static final SubLString $str46$_a___close_to;
  private static final SubLString $str47$_a_in;
  private static final SubLString $str48$_a_near_;
  private static final SubLString $str49$_a_______;
  private static final SubLSymbol $sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD;
  private static final SubLList $list51;
  private static final SubLObject $const52$Place;
  private static final SubLSymbol $sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD;
  private static final SubLSymbol $sym54$ANSWER_CARDINALITY;
  private static final SubLList $list55;
  private static final SubLInteger $int56$1000;
  private static final SubLSymbol $sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD;
  private static final SubLSymbol $sym58$EXTRACT;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$INFORMATION_P;
  private static final SubLSymbol $sym62$EXTRACT_FROM_PASSAGE;
  private static final SubLSymbol $sym63$EXTRACT_FROM_ASSIGNMENT;
  private static final SubLSymbol $sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
  private static final SubLSymbol $sym68$GET_CONTENT;
  private static final SubLObject $const69$PlanetEarth;
  private static final SubLString $str70$in_;
  private static final SubLSymbol $sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD;
  private static final SubLList $list72;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
  private static final SubLSymbol $sym75$ABSTRACT_PASSAGE_P;
  private static final SubLSymbol $sym76$LEARN;
  private static final SubLSymbol $sym77$LEXIFY;
  private static final SubLList $list78;
  private static final SubLSymbol $kw79$DFR2L;
  private static final SubLSymbol $kw80$DFL2R;
  private static final SubLString $str81$_S_is_not_one_of__S;
  private static final SubLSymbol $sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD;
  private static final SubLSymbol $sym83$EXTRACT_COMMA_PP;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$GET_SISTER;
  private static final SubLSymbol $sym87$GET_CATEGORY;
  private static final SubLSymbol $kw88$_;
  private static final SubLSymbol $sym89$GET_HEAD;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$GET_COMPLEMENTS;
  private static final SubLSymbol $sym92$CANDIDATE_ANSWER_P;
  private static final SubLSymbol $sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD;
  private static final SubLSymbol $sym94$EXTRACT_NONCOMMA_PP;
  private static final SubLList $list95;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD;
  private static final SubLSymbol $sym98$EXTRACT_APPOSITIVE;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$DAUGHTER_COUNT;
  private static final SubLSymbol $sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
  public static SubLObject subloop_reserved_initialize_geographical_question_class(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
  public static SubLObject subloop_reserved_initialize_geographical_question_instance(final SubLObject new_instance)
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

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
  public static SubLObject geographical_question_p(final SubLObject v_geographical_question)
  {
    return classes.subloop_instanceof_class( v_geographical_question, $sym0$GEOGRAPHICAL_QUESTION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 1417L)
  public static SubLObject geographical_question_isaP_method(final SubLObject self, final SubLObject tree)
  {
    return makeBoolean( NIL != parse_tree.wh_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ) ) && NIL != string_utilities.starts_with_one_of_by_test( methods
        .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), $sym29$GET_STRING ), $list30, UNPROVIDED ) && NIL != word_tree.aux_verb_tree_p(
            methods.funcall_instance_method_with_0_args( tree, $sym31$GET_PREDICATE ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 1712L)
  public static SubLObject geographical_question_querify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_geographical_question_method = NIL;
    final SubLObject corpora = question.get_question_corpora( self );
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
      try
      {
        final SubLObject subject = methods.funcall_instance_method_with_0_args( parse, $sym36$GET_SUBJECT );
        final SubLObject focus = ( NIL != subject ) ? methods.funcall_instance_method_with_0_args( subject, $sym29$GET_STRING ) : NIL;
        final SubLObject cycl_query = ( NIL != focus ) ? ConsesLow.list( $const37$thereExists, $sym38$_FOCUS, ConsesLow.list( $const39$and, $list40, ConsesLow.list( $const41$placeName_Standard, $sym38$_FOCUS, focus ) ) )
            : NIL;
        SubLObject queries = ( NIL != cycl_query ) ? ConsesLow.list( search_engine.new_cycl_query( cycl_query, ConsesLow.list( narts_high.find_nart( $list42 ) ), UNPROVIDED ), search_engine.new_cycl_query( cycl_query,
            ConsesLow.list( narts_high.find_nart( $list43 ) ), UNPROVIDED ) ) : NIL;
        if( NIL != focus )
        {
          SubLObject cdolist_list_var = corpora;
          SubLObject corpus = NIL;
          corpus = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str44$_a___in, focus ), corpus ), queries );
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str45$_a___near, focus ), corpus ), queries );
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str46$_a___close_to, focus ), corpus ), queries );
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str47$_a_in, focus ), corpus ), queries );
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str48$_a_near_, focus ), corpus ), queries );
            queries = ConsesLow.cons( search_engine.new_glimpse_query( PrintLow.format( NIL, $str49$_a_______, focus ), corpus ), queries );
            cdolist_list_var = cdolist_list_var.rest();
            corpus = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, Sequences.nreverse( queries ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_corpora( self, corpora );
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
      catch_var_for_geographical_question_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_geographical_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 2893L)
  public static SubLObject geographical_question_answer_types_method(final SubLObject self)
  {
    return ConsesLow.list( ConsesLow.list( $const52$Place ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3147L)
  public static SubLObject geographical_question_answer_cardinality_method(final SubLObject self)
  {
    return $int56$1000;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3321L)
  public static SubLObject geographical_question_extract_method(final SubLObject self, final SubLObject info)
  {
    assert NIL != search_engine.information_p( info ) : info;
    return ( NIL != search_engine.abstract_passage_p( info ) ) ? methods.funcall_instance_method_with_1_args( self, $sym62$EXTRACT_FROM_PASSAGE, info )
        : ( ( NIL != search_engine.var_assignment_p( info ) ) ? methods.funcall_instance_method_with_1_args( self, $sym63$EXTRACT_FROM_ASSIGNMENT, info ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3754L)
  public static SubLObject geographical_question_extract_from_assignment_method(final SubLObject self, final SubLObject assignment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_geographical_question_method = NIL;
    final SubLObject max_confidence = question.get_question_max_confidence( self );
    try
    {
      thread.throwStack.push( $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
      try
      {
        final SubLObject varXbinding = methods.funcall_instance_method_with_0_args( assignment, $sym68$GET_CONTENT ).first();
        if( NIL != varXbinding && !varXbinding.rest().eql( $const69$PlanetEarth ) )
        {
          Dynamic.sublisp_throw( $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, ConsesLow.list( answer.new_text_answer( self, Sequences.cconcatenate( $str70$in_, pph_main.generate_phrase( varXbinding.rest(),
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ), assignment, max_confidence, UNPROVIDED ) ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          question.set_question_max_confidence( self, max_confidence );
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
      catch_var_for_geographical_question_method = Errors.handleThrowable( ccatch_env_var, $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_geographical_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 4201L)
  public static SubLObject geographical_question_extract_from_passage_method(final SubLObject self, final SubLObject passage)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_geographical_question_method = NIL;
    final SubLObject max_confidence = question.get_question_max_confidence( self );
    final SubLObject v_parser = question.get_question_parser( self );
    final SubLObject lexicon = question.get_question_lexicon( self );
    final SubLObject parse = question.get_question_parse( self );
    try
    {
      thread.throwStack.push( $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
      try
      {
        assert NIL != search_engine.abstract_passage_p( passage ) : passage;
        methods.funcall_instance_method_with_1_args( lexicon, $sym76$LEARN, methods.funcall_instance_method_with_0_args( passage, $sym68$GET_CONTENT ) );
        final SubLObject tree = methods.funcall_instance_method_with_1_args( v_parser, $sym20$PARSE, methods.funcall_instance_method_with_0_args( passage, $sym68$GET_CONTENT ) );
        final SubLObject lexified = ( NIL != tree ) ? methods.funcall_instance_method_with_1_args( tree, $sym77$LEXIFY, lexicon ) : NIL;
        final SubLObject focus = methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( parse, $sym36$GET_SUBJECT ), $sym29$GET_STRING );
        SubLObject answers = NIL;
        final SubLObject extractors = $list78;
        if( NIL != parse_tree.parse_tree_p( lexified ) )
        {
          final SubLObject stack = stacks.create_stack();
          final SubLObject order_var = $kw79$DFR2L;
          final SubLObject possible_orders = ConsesLow.list( $kw80$DFL2R, $kw79$DFR2L );
          SubLObject sub = NIL;
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subl_promotions.memberP( order_var, possible_orders, Symbols.symbol_function( EQ ), UNPROVIDED ) )
          {
            Errors.error( $str81$_S_is_not_one_of__S, order_var, possible_orders );
          }
          stacks.stack_push( lexified, stack );
          while ( NIL == stacks.stack_empty_p( stack ) && NIL == answers)
          {
            sub = stacks.stack_pop( stack );
            if( NIL != parse_tree.phrase_tree_p( sub ) && NIL == answers )
            {
              SubLObject csome_list_var = extractors;
              SubLObject extractor = NIL;
              extractor = csome_list_var.first();
              while ( NIL == answers && NIL != csome_list_var)
              {
                final SubLObject v_answer = methods.funcall_instance_method_with_2_args( self, extractor, focus, sub );
                if( NIL != v_answer )
                {
                  answers = ConsesLow.cons( answer.new_text_answer( self, methods.funcall_instance_method_with_0_args( v_answer, $sym29$GET_STRING ), passage, max_confidence, UNPROVIDED ), answers );
                }
                csome_list_var = csome_list_var.rest();
                extractor = csome_list_var.first();
              }
            }
            if( NIL != parse_tree.phrase_tree_p( sub ) )
            {
              final SubLObject vector_var = parse_tree.get_phrase_tree_daughters( sub );
              final SubLObject backwardP_var = Equality.eq( order_var, $kw80$DFL2R );
              SubLObject length;
              SubLObject v_iteration;
              SubLObject element_num;
              SubLObject daughter;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                daughter = Vectors.aref( vector_var, element_num );
                stacks.stack_push( daughter, stack );
              }
            }
          }
        }
        Dynamic.sublisp_throw( $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, answers );
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
      catch_var_for_geographical_question_method = Errors.handleThrowable( ccatch_env_var, $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_geographical_question_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 5065L)
  public static SubLObject geographical_question_extract_comma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree)
  {
    if( NIL != string_utilities.ends_with( methods.funcall_instance_method_with_0_args( tree, $sym29$GET_STRING ), v_term, UNPROVIDED ) && NIL != methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER,
        ONE_INTEGER ) && methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym87$GET_CATEGORY ) == $kw88$_ && NIL != methods
            .funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, TWO_INTEGER ) && NIL != parse_tree.pp_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, TWO_INTEGER ) )
        && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, TWO_INTEGER ),
            $sym89$GET_HEAD ), $sym29$GET_STRING ), $list90, EQUAL, UNPROVIDED ) && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods
                .funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, TWO_INTEGER ), $sym91$GET_COMPLEMENTS ).first(), $sym89$GET_HEAD ) && NIL != methods.funcall_instance_method_with_1_args( self,
                    $sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER,
                        TWO_INTEGER ), $sym91$GET_COMPLEMENTS ).first(), $sym89$GET_HEAD ) ) )
    {
      return methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 5825L)
  public static SubLObject geographical_question_extract_noncomma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree)
  {
    if( NIL != string_utilities.ends_with( methods.funcall_instance_method_with_0_args( tree, $sym29$GET_STRING ), v_term, UNPROVIDED ) && NIL != methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER,
        ONE_INTEGER ) && NIL != parse_tree.pp_tree_p( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ) ) && NIL != methods.funcall_instance_method_with_0_args( methods
            .funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym89$GET_HEAD ) && NIL != conses_high.member( methods.funcall_instance_method_with_0_args( methods
                .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym89$GET_HEAD ), $sym29$GET_STRING ), $list96, EQUAL, UNPROVIDED )
        && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym91$GET_COMPLEMENTS ).first() && NIL != methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym91$GET_COMPLEMENTS ).first(),
                $sym89$GET_HEAD ) && NIL != methods.funcall_instance_method_with_1_args( self, $sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_0_args( methods
                    .funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER ), $sym91$GET_COMPLEMENTS ).first(), $sym89$GET_HEAD ) ) )
    {
      return methods.funcall_instance_method_with_1_args( tree, $sym86$GET_SISTER, ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 6588L)
  public static SubLObject geographical_question_extract_appositive_method(final SubLObject self, final SubLObject v_term, final SubLObject tree)
  {
    if( NIL != parse_tree.np_tree_p( tree ) && methods.funcall_instance_method_with_0_args( tree, $sym100$DAUGHTER_COUNT ).numG( TWO_INTEGER ) && methods.funcall_instance_method_with_0_args( tree,
        $sym100$DAUGHTER_COUNT ).numL( FIVE_INTEGER ) && NIL != question.np_term_match( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ZERO_INTEGER ), v_term, UNPROVIDED ) && methods
            .funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, ONE_INTEGER ), $sym87$GET_CATEGORY ) == $kw88$_ && NIL != parse_tree.nominal_tree_p( methods
                .funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, TWO_INTEGER ) ) && NIL != methods.funcall_instance_method_with_0_args( methods.funcall_instance_method_with_1_args( tree,
                    $sym28$GET_DAUGHTER, TWO_INTEGER ), $sym89$GET_HEAD ) && NIL != methods.funcall_instance_method_with_1_args( self, $sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args( methods
                        .funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, TWO_INTEGER ), $sym89$GET_HEAD ) ) )
    {
      return methods.funcall_instance_method_with_1_args( tree, $sym28$GET_DAUGHTER, TWO_INTEGER );
    }
    return NIL;
  }

  public static SubLObject declare_geographical_question_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_geographical_question_class", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_geographical_question_instance", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_p", "GEOGRAPHICAL-QUESTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_isaP_method", "GEOGRAPHICAL-QUESTION-ISA?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_querify_method", "GEOGRAPHICAL-QUESTION-QUERIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_answer_types_method", "GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_answer_cardinality_method", "GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_method", "GEOGRAPHICAL-QUESTION-EXTRACT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_from_assignment_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_from_passage_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_comma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_noncomma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "geographical_question_extract_appositive_method", "GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_geographical_question_file()
  {
    return NIL;
  }

  public static SubLObject setup_geographical_question_file()
  {
    classes.subloop_new_class( $sym0$GEOGRAPHICAL_QUESTION, $sym1$WH_QUESTION, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$GEOGRAPHICAL_QUESTION, NIL );
    classes.subloop_note_class_initialization_function( $sym0$GEOGRAPHICAL_QUESTION, $sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$GEOGRAPHICAL_QUESTION, $sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE );
    subloop_reserved_initialize_geographical_question_class( $sym0$GEOGRAPHICAL_QUESTION );
    methods.methods_incorporate_class_method( $sym24$ISA_, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list26, $list27 );
    methods.subloop_register_class_method( $sym0$GEOGRAPHICAL_QUESTION, $sym24$ISA_, $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD );
    methods.methods_incorporate_instance_method( $sym33$QUERIFY, $sym0$GEOGRAPHICAL_QUESTION, $list25, NIL, $list34 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym33$QUERIFY, $sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym21$ANSWER_TYPES, $sym0$GEOGRAPHICAL_QUESTION, $list25, NIL, $list51 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym21$ANSWER_TYPES, $sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD );
    methods.methods_incorporate_instance_method( $sym54$ANSWER_CARDINALITY, $sym0$GEOGRAPHICAL_QUESTION, $list25, NIL, $list55 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym54$ANSWER_CARDINALITY, $sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD );
    methods.methods_incorporate_instance_method( $sym58$EXTRACT, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list59, $list60 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym58$EXTRACT, $sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD );
    methods.methods_incorporate_instance_method( $sym63$EXTRACT_FROM_ASSIGNMENT, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list65, $list66 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym63$EXTRACT_FROM_ASSIGNMENT, $sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD );
    methods.methods_incorporate_instance_method( $sym62$EXTRACT_FROM_PASSAGE, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list72, $list73 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym62$EXTRACT_FROM_PASSAGE, $sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym83$EXTRACT_COMMA_PP, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list84, $list85 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym83$EXTRACT_COMMA_PP, $sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD );
    methods.methods_incorporate_instance_method( $sym94$EXTRACT_NONCOMMA_PP, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list84, $list95 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym94$EXTRACT_NONCOMMA_PP, $sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD );
    methods.methods_incorporate_instance_method( $sym98$EXTRACT_APPOSITIVE, $sym0$GEOGRAPHICAL_QUESTION, $list25, $list84, $list99 );
    methods.subloop_register_instance_method( $sym0$GEOGRAPHICAL_QUESTION, $sym98$EXTRACT_APPOSITIVE, $sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_geographical_question_file();
  }

  @Override
  public void initializeVariables()
  {
    init_geographical_question_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_geographical_question_file();
  }
  static
  {
    me = new geographical_question();
    $sym0$GEOGRAPHICAL_QUESTION = makeSymbol( "GEOGRAPHICAL-QUESTION" );
    $sym1$WH_QUESTION = makeSymbol( "WH-QUESTION" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "ISA?" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "QUERIFY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ANSWER-TYPES" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT" ), ConsesLow.list( makeSymbol( "INFO" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                "EXTRACT-FROM-PASSAGE" ), ConsesLow.list( makeSymbol( "PASSAGE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT-FROM-ASSIGNMENT" ), ConsesLow
                    .list( makeSymbol( "ASSIGNMENT" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT-PP" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol(
                        "TREE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXTRACT-APPOSITIVE" ), ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) ),
                            makeKeyword( "PROTECTED" ) ) );
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
    $sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$INFORMATION_REQUEST = makeSymbol( "INFORMATION-REQUEST" );
    $sym17$ERROR_HANDLING = makeSymbol( "ERROR-HANDLING" );
    $sym18$TIMEOUT = makeSymbol( "TIMEOUT" );
    $sym19$STRING = makeSymbol( "STRING" );
    $sym20$PARSE = makeSymbol( "PARSE" );
    $sym21$ANSWER_TYPES = makeSymbol( "ANSWER-TYPES" );
    $sym22$CORPORA = makeSymbol( "CORPORA" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE" );
    $sym24$ISA_ = makeSymbol( "ISA?" );
    $list25 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list26 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "WH-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
        .list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "STARTS-WITH-ONE-OF-BY-TEST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
            "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), ConsesLow.list( makeString( "where" ), makeString( "whence" ), makeString( "whither" ) ) ) ), ConsesLow.list( makeSymbol( "AUX-VERB-TREE-P" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-PREDICATE" ) ) ) ) ) ) );
    $sym28$GET_DAUGHTER = makeSymbol( "GET-DAUGHTER" );
    $sym29$GET_STRING = makeSymbol( "GET-STRING" );
    $list30 = ConsesLow.list( makeString( "where" ), makeString( "whence" ), makeString( "whither" ) );
    $sym31$GET_PREDICATE = makeSymbol( "GET-PREDICATE" );
    $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-ISA?-METHOD" );
    $sym33$QUERIFY = makeSymbol( "QUERIFY" );
    $list34 = ConsesLow.list( makeString( "@return listp; a list of queries likely to extract passages relevant to answer\n   this question" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "FOCUS" ), ConsesLow
            .list( makeSymbol( "FWHEN" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SUBJECT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ) ), ConsesLow.list(
                makeSymbol( "CYCL-QUERY" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString(
                    "thereExists" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "?FOCUS" ) ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) ), makeSymbol( "?WHERE" ), makeSymbol( "?FOCUS" ) ) ),
                        ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell( makeString( "placeName-Standard" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "?FOCUS" ) ),
                            makeSymbol( "FOCUS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "QUERIES" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "CYCL-QUERY" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow
                                .list( makeSymbol( "NEW-CYCL-QUERY" ), makeSymbol( "CYCL-QUERY" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIND-NART" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Nima-Gns-KS" ) ) ) ) ) ) ),
                                ConsesLow.list( makeSymbol( "NEW-CYCL-QUERY" ), makeSymbol( "CYCL-QUERY" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "FIND-NART" ), ConsesLow.list( makeSymbol(
                                    "QUOTE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "Usgs-KS" ) ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CORPUS" ),
                                            makeSymbol( "CORPORA" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                "~a\\, in" ), makeSymbol( "FOCUS" ) ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
                                                    "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a\\, near" ), makeSymbol( "FOCUS" ) ), makeSymbol( "CORPUS" ) ), makeSymbol(
                                                        "QUERIES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                            "~a\\, close to" ), makeSymbol( "FOCUS" ) ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list(
                                                                makeSymbol( "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a in" ), makeSymbol( "FOCUS" ) ), makeSymbol( "CORPUS" ) ),
                                                                makeSymbol( "QUERIES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ),
                                                                    NIL, makeString( "~a near " ), makeSymbol( "FOCUS" ) ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                                                        ConsesLow.list( makeSymbol( "NEW-GLIMPSE-QUERY" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~a\\, #\\, " ), makeSymbol(
                                                                            "FOCUS" ) ), makeSymbol( "CORPUS" ) ), makeSymbol( "QUERIES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                                "NREVERSE" ), makeSymbol( "QUERIES" ) ) ) ) );
    $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD" );
    $sym36$GET_SUBJECT = makeSymbol( "GET-SUBJECT" );
    $const37$thereExists = constant_handles.reader_make_constant_shell( makeString( "thereExists" ) );
    $sym38$_FOCUS = makeSymbol( "?FOCUS" );
    $const39$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegions" ) ), makeSymbol( "?WHERE" ), makeSymbol( "?FOCUS" ) );
    $const41$placeName_Standard = constant_handles.reader_make_constant_shell( makeString( "placeName-Standard" ) );
    $list42 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Nima-Gns-KS" ) ) );
    $list43 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Usgs-KS" ) ) );
    $str44$_a___in = makeString( "~a\\, in" );
    $str45$_a___near = makeString( "~a\\, near" );
    $str46$_a___close_to = makeString( "~a\\, close to" );
    $str47$_a_in = makeString( "~a in" );
    $str48$_a_near_ = makeString( "~a near " );
    $str49$_a_______ = makeString( "~a\\, #\\, " );
    $sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-QUERIFY-METHOD" );
    $list51 = ConsesLow.list( makeString( "@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction" ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), constant_handles.reader_make_constant_shell( makeString( "Place" ) ) ) ) ) );
    $const52$Place = constant_handles.reader_make_constant_shell( makeString( "Place" ) );
    $sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD" );
    $sym54$ANSWER_CARDINALITY = makeSymbol( "ANSWER-CARDINALITY" );
    $list55 = ConsesLow.list( makeString( "@return positive-integer-p; the number of answers expected for this question" ), ConsesLow.list( makeSymbol( "RET" ), makeInteger( 1000 ) ) );
    $int56$1000 = makeInteger( 1000 );
    $sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD" );
    $sym58$EXTRACT = makeSymbol( "EXTRACT" );
    $list59 = ConsesLow.list( makeSymbol( "INFO" ) );
    $list60 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from INFO\n   @note instead of an explicit fcond, dispatching using OO methods would be nice" ), ConsesLow.list( makeSymbol(
        "CHECK-TYPE" ), makeSymbol( "INFO" ), makeSymbol( "INFORMATION-P" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "ABSTRACT-PASSAGE-P" ), makeSymbol( "INFO" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "EXTRACT-FROM-PASSAGE" ) ), makeSymbol(
                "INFO" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-ASSIGNMENT-P" ), makeSymbol( "INFO" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "EXTRACT-FROM-ASSIGNMENT" ) ), makeSymbol( "INFO" ) ) ), ConsesLow.list( T, NIL ) ) ) );
    $sym61$INFORMATION_P = makeSymbol( "INFORMATION-P" );
    $sym62$EXTRACT_FROM_PASSAGE = makeSymbol( "EXTRACT-FROM-PASSAGE" );
    $sym63$EXTRACT_FROM_ASSIGNMENT = makeSymbol( "EXTRACT-FROM-ASSIGNMENT" );
    $sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-METHOD" );
    $list65 = ConsesLow.list( makeSymbol( "ASSIGNMENT" ) );
    $list66 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from ASSIGNMENT" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR.BINDING" ),
        ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ASSIGNMENT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
            "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "VAR.BINDING" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQL, ConsesLow.list( makeSymbol( "CDR" ), makeSymbol( "VAR.BINDING" ) ),
                constant_handles.reader_make_constant_shell( makeString( "PlanetEarth" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol(
                    "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "in " ), ConsesLow.list( makeSymbol( "GENERATE-PHRASE" ), ConsesLow.list( makeSymbol( "CDR" ),
                        makeSymbol( "VAR.BINDING" ) ) ) ), makeSymbol( "ASSIGNMENT" ), makeSymbol( "MAX-CONFIDENCE" ) ) ) ) ) ) );
    $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD" );
    $sym68$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $const69$PlanetEarth = constant_handles.reader_make_constant_shell( makeString( "PlanetEarth" ) );
    $str70$in_ = makeString( "in " );
    $sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD" );
    $list72 = ConsesLow.list( makeSymbol( "PASSAGE" ) );
    $list73 = ConsesLow.list( makeString( "@return listp; a list of answers to this question from PASSAGE" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PASSAGE" ), makeSymbol( "ABSTRACT-PASSAGE-P" ) ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LEXICON" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEARN" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "PARSER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PASSAGE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "GET-CONTENT" ) ) ) ) ), ConsesLow.list( makeSymbol( "LEXIFIED" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow
                        .list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFY" ) ), makeSymbol( "LEXICON" ) ) ) ), ConsesLow.list( makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol(
                            "FIM" ), makeSymbol( "PARSE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SUBJECT" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ) ), ConsesLow.list(
                                makeSymbol( "ANSWERS" ), NIL ), ConsesLow.list( makeSymbol( "EXTRACTORS" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "EXTRACT-COMMA-PP" ), makeSymbol(
                                    "EXTRACT-NONCOMMA-PP" ), makeSymbol( "EXTRACT-APPOSITIVE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "PARSE-TREE-P" ), makeSymbol( "LEXIFIED" ) ),
                                        ConsesLow.list( makeSymbol( "DO-PARSE-TREE-SUBTREES" ), ConsesLow.list( makeSymbol( "SUB" ), makeSymbol( "LEXIFIED" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol(
                                            "PWHEN" ), ConsesLow.list( makeSymbol( "PHRASE-TREE-P" ), makeSymbol( "SUB" ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "EXTRACTOR" ), makeSymbol(
                                                "EXTRACTORS" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol(
                                                    "FIM" ), makeSymbol( "SELF" ), makeSymbol( "EXTRACTOR" ), makeSymbol( "FOCUS" ), makeSymbol( "SUB" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                        "ANSWER" ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-TEXT-ANSWER" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIM" ),
                                                            makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "PASSAGE" ), makeSymbol( "MAX-CONFIDENCE" ) ),
                                                            makeSymbol( "ANSWERS" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWERS" ) ) ) );
    $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD" );
    $sym75$ABSTRACT_PASSAGE_P = makeSymbol( "ABSTRACT-PASSAGE-P" );
    $sym76$LEARN = makeSymbol( "LEARN" );
    $sym77$LEXIFY = makeSymbol( "LEXIFY" );
    $list78 = ConsesLow.list( makeSymbol( "EXTRACT-COMMA-PP" ), makeSymbol( "EXTRACT-NONCOMMA-PP" ), makeSymbol( "EXTRACT-APPOSITIVE" ) );
    $kw79$DFR2L = makeKeyword( "DFR2L" );
    $kw80$DFL2R = makeKeyword( "DFL2R" );
    $str81$_S_is_not_one_of__S = makeString( "~S is not one of ~S" );
    $sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD" );
    $sym83$EXTRACT_COMMA_PP = makeSymbol( "EXTRACT-COMMA-PP" );
    $list84 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "TREE" ) );
    $list85 = ConsesLow.list( makeString( "@return pp-tree-p or nil; the pp tree in phrases like 'Guam, in the Pacific, ...'" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol(
        "CAND" ), ConsesLow.list( makeSymbol( "ENDS-WITH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "TERM" ) ),
      ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
          .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ),
          makeKeyword( "," ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "PP-TREE-P" ),
              ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list(
                  makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), TWO_INTEGER ),
                      ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list(
                          makeString( "in" ), makeString( "near" ), makeString( "on" ), makeString( "close to" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                              makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ),
                                  TWO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list(
                                      makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CANDIDATE-ANSWER-P" ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list(
                                          makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                              "GET-SISTER" ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                  "GET-HEAD" ) ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), TWO_INTEGER ) ) ) );
    $sym86$GET_SISTER = makeSymbol( "GET-SISTER" );
    $sym87$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $kw88$_ = makeKeyword( "," );
    $sym89$GET_HEAD = makeSymbol( "GET-HEAD" );
    $list90 = ConsesLow.list( makeString( "in" ), makeString( "near" ), makeString( "on" ), makeString( "close to" ) );
    $sym91$GET_COMPLEMENTS = makeSymbol( "GET-COMPLEMENTS" );
    $sym92$CANDIDATE_ANSWER_P = makeSymbol( "CANDIDATE-ANSWER-P" );
    $sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD" );
    $sym94$EXTRACT_NONCOMMA_PP = makeSymbol( "EXTRACT-NONCOMMA-PP" );
    $list95 = ConsesLow.list( makeString( "@return pp-tree-p or nil; the pp tree in phrases like 'Guam in the Pacific, ...'" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol(
        "CAND" ), ConsesLow.list( makeSymbol( "ENDS-WITH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), makeSymbol( "TERM" ) ),
      ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "PP-TREE-P" ), ConsesLow.list( makeSymbol(
          "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
              "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "MEMBER" ),
                  ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ),
                      ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-STRING" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                          ConsesLow.list( makeString( "in" ), makeString( "near" ), makeString( "close to" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUAL ) ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list(
                              makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list(
                                  makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
                                      .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                          makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow
                                              .list( makeSymbol( "QUOTE" ), makeSymbol( "CANDIDATE-ANSWER-P" ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                  "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ), ConsesLow.list(
                                                      makeSymbol( "QUOTE" ), makeSymbol( "GET-COMPLEMENTS" ) ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-SISTER" ) ), ONE_INTEGER ) ) ) );
    $list96 = ConsesLow.list( makeString( "in" ), makeString( "near" ), makeString( "close to" ) );
    $sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD" );
    $sym98$EXTRACT_APPOSITIVE = makeSymbol( "EXTRACT-APPOSITIVE" );
    $list99 = ConsesLow.list( makeString( "@return np-tree-p or nil; the np tree in phrases like 'Austin, Texas, ...'" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CAND" ),
      ConsesLow.list( makeSymbol( "NP-TREE-P" ), makeSymbol( "TREE" ) ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
          "DAUGHTER-COUNT" ) ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "<" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DAUGHTER-COUNT" ) ) ),
              FIVE_INTEGER ), ConsesLow.list( makeSymbol( "NP-TERM-MATCH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ),
                  ZERO_INTEGER ), makeSymbol( "TERM" ) ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                      makeSymbol( "GET-DAUGHTER" ) ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CATEGORY" ) ) ), makeKeyword( "," ) ), ConsesLow.list( makeSymbol( "NOMINAL-TREE-P" ),
                          ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow
                              .list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                  "GET-HEAD" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CANDIDATE-ANSWER-P" ) ), ConsesLow.list( makeSymbol(
                                      "FIM" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ), ConsesLow.list( makeSymbol(
                                          "QUOTE" ), makeSymbol( "GET-HEAD" ) ) ) )
    } ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DAUGHTER" ) ), TWO_INTEGER ) ) ) );
    $sym100$DAUGHTER_COUNT = makeSymbol( "DAUGHTER-COUNT" );
    $sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD = makeSymbol( "GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD" );
  }
}
/*
 * 
 * Total time: 322 ms
 * 
 */