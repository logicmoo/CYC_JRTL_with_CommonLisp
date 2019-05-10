package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class answer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.quirk.answer";
  public static final String myFingerPrint = "877d2a2b7c4cbbc7c582ae0ef0f7fba8503d0f80bb219fc89ea60fe2043b9f0c";
  private static final SubLSymbol $sym0$ANSWER;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$INFO;
  private static final SubLSymbol $sym4$JUSTIFICATION;
  private static final SubLSymbol $sym5$RELEVANCE;
  private static final SubLSymbol $sym6$CONFIDENCE;
  private static final SubLSymbol $sym7$CONTENT;
  private static final SubLSymbol $sym8$INFO_REQUEST;
  private static final SubLSymbol $sym9$INSTANCE_COUNT;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS;
  private static final SubLSymbol $sym11$ISOLATED_P;
  private static final SubLSymbol $sym12$INSTANCE_NUMBER;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE;
  private static final SubLSymbol $sym14$MAX_INSTANCES;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$LISTP;
  private static final SubLSymbol $sym19$GET_CONFIDENCE;
  private static final SubLSymbol $sym20$ANSWER_MAX_INSTANCES_METHOD;
  private static final SubLSymbol $sym21$PRINT;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLString $str26$__ANSWER_for_;
  private static final SubLString $str27$__;
  private static final SubLString $str28$____2F___2F_;
  private static final SubLSymbol $sym29$ANSWER_PRINT_METHOD;
  private static final SubLSymbol $sym30$GET_INFO_REQUEST;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym33$ANSWER_GET_INFO_REQUEST_METHOD;
  private static final SubLSymbol $sym34$GET_CONTENT;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym37$ANSWER_GET_CONTENT_METHOD;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym40$ANSWER_GET_CONFIDENCE_METHOD;
  private static final SubLSymbol $sym41$GET_RELEVANCE;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym44$ANSWER_GET_RELEVANCE_METHOD;
  private static final SubLSymbol $sym45$JUSTIFY;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym48$ANSWER_JUSTIFY_METHOD;
  private static final SubLSymbol $sym49$GET_INFO;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym52$ANSWER_GET_INFO_METHOD;
  private static final SubLSymbol $sym53$GET_PARSE_TREE;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $kw56$PARSE_TREE;
  private static final SubLSymbol $sym57$ANSWER_GET_PARSE_TREE_METHOD;
  private static final SubLSymbol $sym58$NATURAL_LANGUAGE_FACTOID;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym61$GET_KEYSTRINGS;
  private static final SubLString $str62$_;
  private static final SubLSymbol $sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD;
  private static final SubLSymbol $sym64$OLDER;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$ANSWER_P;
  private static final SubLSymbol $sym68$GET_DATE;
  private static final SubLSymbol $sym69$ANSWER_OLDER_METHOD;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$OUTER_CATCH_FOR_ANSWER_METHOD;
  private static final SubLSymbol $sym72$GET_PUBLICATION_DATE;
  private static final SubLSymbol $sym73$ANSWER_GET_DATE_METHOD;
  private static final SubLSymbol $sym74$TEXT_ANSWER;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$AUGMENTATION_TERMS;
  private static final SubLSymbol $sym77$PARSE;
  private static final SubLSymbol $sym78$VECTOR;
  private static final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS;
  private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE;
  private static final SubLSymbol $sym81$INFORMATION_REQUEST_P;
  private static final SubLSymbol $sym82$INFORMATION_P;
  private static final SubLSymbol $sym83$NUMBERP;
  private static final SubLSymbol $sym84$SIMILARITY_FUNCTION;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$TEXT_ANSWER_SIMILARITY;
  private static final SubLSymbol $sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD;
  private static final SubLSymbol $sym88$REQUIRE_SIMILARITY;
  private static final SubLList $list89;
  private static final SubLFloat $float90$0_3;
  private static final SubLSymbol $sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD;
  private static final SubLSymbol $sym92$TYPICAL_INSTANCE;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$GET_TEXT_ANSWER_VECTOR;
  private static final SubLSymbol $sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD;
  private static final SubLSymbol $sym96$SELECT;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$REQUIRE_PERCENTAGE;
  private static final SubLInteger $int99$100;
  private static final SubLSymbol $sym100$TEXT_ANSWER_BETTER;
  private static final SubLSymbol $sym101$TEXT_ANSWER_SELECT_METHOD;
  private static final SubLSymbol $sym102$CLUSTER_P;
  private static final SubLSymbol $sym103$GET_VECTOR;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD;
  private static final SubLSymbol $sym106$TEXT_ANSWER_GET_VECTOR_METHOD;
  private static final SubLSymbol $sym107$SIMILARITY;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$TEXT_ANSWER_P;
  private static final SubLSymbol $sym111$TEXT_ANSWER_SIMILARITY_METHOD;
  private static final SubLSymbol $sym112$VALUE_ANSWER;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$INTERPRETED_VALUES;
  private static final SubLSymbol $sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS;
  private static final SubLSymbol $sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE;
  private static final SubLSymbol $sym117$PARSE_TREE_P;
  private static final SubLString $str118$_;
  private static final SubLString $str119$__RRB_;
  private static final SubLString $str120$_;
  private static final SubLString $str121$_LRB__;
  private static final SubLSymbol $sym122$GET_STRING;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$VALUE_ANSWER_SIMILARITY;
  private static final SubLSymbol $sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD;
  private static final SubLSymbol $sym126$GET_INTERPRETED_VALUES;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD;
  private static final SubLSymbol $sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$VALUE_ANSWER_P;
  private static final SubLSymbol $sym132$VALUE_ANSWER_SIMILARITY_METHOD;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD;
  private static final SubLSymbol $sym135$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym136$SENTENCE_ANSWER;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS;
  private static final SubLSymbol $sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE;
  private static final SubLSymbol $sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD;
  private static final SubLList $list143;
  private static final SubLSymbol $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD;
  private static final SubLString $str145$__SENTENCE_ANSWER_for_;
  private static final SubLSymbol $sym146$SENTENCE_ANSWER_PRINT_METHOD;
  private static final SubLSymbol $sym147$STRINGP;
  private static final SubLSymbol $sym148$STANFORD_PARSER;
  private static final SubLSymbol $sym149$GET_PARSER;
  private static final SubLSymbol $kw150$NP;
  private static final SubLSymbol $sym151$GET_CATEGORY;
  private static final SubLSymbol $sym152$GET_HEAD;
  private static final SubLSymbol $kw153$NNS;
  private static final SubLString $str154$are;
  private static final SubLString $str155$is;

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_info(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, SIX_INTEGER, $sym3$INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_info(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, SIX_INTEGER, $sym3$INFO );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_justification(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, FIVE_INTEGER, $sym4$JUSTIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_justification(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, FIVE_INTEGER, $sym4$JUSTIFICATION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_relevance(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, FOUR_INTEGER, $sym5$RELEVANCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_relevance(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, FOUR_INTEGER, $sym5$RELEVANCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_confidence(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, THREE_INTEGER, $sym6$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_confidence(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, THREE_INTEGER, $sym6$CONFIDENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_content(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, TWO_INTEGER, $sym7$CONTENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_content(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, TWO_INTEGER, $sym7$CONTENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject get_answer_info_request(final SubLObject v_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( v_answer, ONE_INTEGER, $sym8$INFO_REQUEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject set_answer_info_request(final SubLObject v_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_answer, value, ONE_INTEGER, $sym8$INFO_REQUEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject subloop_reserved_initialize_answer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject subloop_reserved_initialize_answer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym8$INFO_REQUEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym7$CONTENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym6$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym5$RELEVANCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym4$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym3$INFO, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 834L)
  public static SubLObject answer_p(final SubLObject v_answer)
  {
    return classes.subloop_instanceof_class( v_answer, $sym0$ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 1716L)
  public static SubLObject answer_max_instances_method(final SubLObject self, final SubLObject answers)
  {
    assert NIL != Types.listp( answers ) : answers;
    SubLObject max_score = ZERO_INTEGER;
    SubLObject max_answers = NIL;
    SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONFIDENCE ).numG( max_score ) )
      {
        max_score = methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONFIDENCE );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    cdolist_list_var = answers;
    v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONFIDENCE ).numE( max_score ) )
      {
        max_answers = ConsesLow.cons( v_answer, max_answers );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return max_answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2319L)
  public static SubLObject answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject relevance = get_answer_relevance( self );
    final SubLObject confidence = get_answer_confidence( self );
    final SubLObject content = get_answer_content( self );
    final SubLObject info_request = get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        streams_high.write_string( $str26$__ANSWER_for_, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( info_request, stream );
        streams_high.write_string( $str27$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( content, stream );
        PrintLow.format( stream, $str28$____2F___2F_, confidence, relevance );
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_ANSWER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_relevance( self, relevance );
          set_answer_confidence( self, confidence );
          set_answer_content( self, content );
          set_answer_info_request( self, info_request );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2640L)
  public static SubLObject answer_get_info_request_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject info_request = get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_ANSWER_METHOD, info_request );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_info_request( self, info_request );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2773L)
  public static SubLObject answer_get_content_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject content = get_answer_content( self );
    try
    {
      thread.throwStack.push( $sym36$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym36$OUTER_CATCH_FOR_ANSWER_METHOD, content );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_content( self, content );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym36$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 2890L)
  public static SubLObject answer_get_confidence_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject confidence = get_answer_confidence( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_ANSWER_METHOD, confidence );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_confidence( self, confidence );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3033L)
  public static SubLObject answer_get_relevance_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject relevance = get_answer_relevance( self );
    try
    {
      thread.throwStack.push( $sym43$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym43$OUTER_CATCH_FOR_ANSWER_METHOD, relevance );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_relevance( self, relevance );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym43$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3173L)
  public static SubLObject answer_justify_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject justification = get_answer_justification( self );
    try
    {
      thread.throwStack.push( $sym47$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym47$OUTER_CATCH_FOR_ANSWER_METHOD, justification );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_justification( self, justification );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym47$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3300L)
  public static SubLObject answer_get_info_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject info = get_answer_info( self );
    try
    {
      thread.throwStack.push( $sym51$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_ANSWER_METHOD, info );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_info( self, info );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym51$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3415L)
  public static SubLObject answer_get_parse_tree_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject info = get_answer_info( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_ANSWER_METHOD, conses_high.getf( info, $kw56$PARSE_TREE, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_info( self, info );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 3573L)
  public static SubLObject answer_natural_language_factoid_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject justification = get_answer_justification( self );
    final SubLObject content = get_answer_content( self );
    final SubLObject info_request = get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym60$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        SubLObject focus = NIL;
        SubLObject copula = NIL;
        SubLObject factoid = NIL;
        if( NIL != definitional_question.definitional_question_p( info_request ) )
        {
          focus = methods.funcall_instance_method_with_0_args( info_request, $sym61$GET_KEYSTRINGS ).first();
          copula = find_subject_agreement( content );
          if( !copula.equal( string_utilities.$empty_string$.getGlobalValue() ) )
          {
            copula = Sequences.cconcatenate( $str62$_, new SubLObject[] { copula, $str62$_
            } );
          }
          factoid = Sequences.cconcatenate( focus, new SubLObject[] { copula, content
          } );
        }
        else
        {
          factoid = methods.funcall_instance_method_with_0_args( justification, $sym34$GET_CONTENT );
        }
        if( factoid.isString() )
        {
          Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_ANSWER_METHOD, factoid );
        }
        else
        {
          Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_ANSWER_METHOD, string_utilities.$empty_string$.getGlobalValue() );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_justification( self, justification );
          set_answer_content( self, content );
          set_answer_info_request( self, info_request );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym60$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4507L)
  public static SubLObject answer_older_method(final SubLObject self, final SubLObject other_answer)
  {
    assert NIL != answer_p( other_answer ) : other_answer;
    final SubLObject this_date = methods.funcall_instance_method_with_0_args( self, $sym68$GET_DATE );
    final SubLObject other_date = methods.funcall_instance_method_with_0_args( other_answer, $sym68$GET_DATE );
    if( NIL != date_utilities.date_p( this_date ) && NIL != date_utilities.date_p( other_date ) )
    {
      return date_utilities.dateL( this_date, other_date );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 4924L)
  public static SubLObject answer_get_date_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_answer_method = NIL;
    final SubLObject justification = get_answer_justification( self );
    try
    {
      thread.throwStack.push( $sym71$OUTER_CATCH_FOR_ANSWER_METHOD );
      try
      {
        if( NIL != search_engine.abstract_passage_p( justification ) )
        {
          Dynamic.sublisp_throw( $sym71$OUTER_CATCH_FOR_ANSWER_METHOD, methods.funcall_instance_method_with_0_args( justification, $sym72$GET_PUBLICATION_DATE ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_justification( self, justification );
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
      catch_var_for_answer_method = Errors.handleThrowable( ccatch_env_var, $sym71$OUTER_CATCH_FOR_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject get_text_answer_augmentation_terms(final SubLObject text_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( text_answer, NINE_INTEGER, $sym76$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject set_text_answer_augmentation_terms(final SubLObject text_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( text_answer, value, NINE_INTEGER, $sym76$AUGMENTATION_TERMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject get_text_answer_parse(final SubLObject text_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( text_answer, EIGHT_INTEGER, $sym77$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject set_text_answer_parse(final SubLObject text_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( text_answer, value, EIGHT_INTEGER, $sym77$PARSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject get_text_answer_vector(final SubLObject text_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( text_answer, SEVEN_INTEGER, $sym78$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject set_text_answer_vector(final SubLObject text_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( text_answer, value, SEVEN_INTEGER, $sym78$VECTOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject subloop_reserved_initialize_text_answer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject subloop_reserved_initialize_text_answer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym8$INFO_REQUEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym7$CONTENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym6$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym5$RELEVANCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym4$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym3$INFO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym78$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym77$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym76$AUGMENTATION_TERMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5176L)
  public static SubLObject text_answer_p(final SubLObject text_answer)
  {
    return classes.subloop_instanceof_class( text_answer, $sym74$TEXT_ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 5768L)
  public static SubLObject new_text_answer(final SubLObject info_request, final SubLObject string, final SubLObject justification, final SubLObject confidence, SubLObject v_parse_tree)
  {
    if( v_parse_tree == UNPROVIDED )
    {
      v_parse_tree = NIL;
    }
    assert NIL != search_engine.information_request_p( info_request ) : info_request;
    assert NIL != search_engine.information_p( justification ) : justification;
    assert NIL != Types.numberp( confidence ) : confidence;
    final SubLObject v_answer = object.new_class_instance( $sym74$TEXT_ANSWER );
    set_answer_info_request( v_answer, info_request );
    set_answer_content( v_answer, string );
    set_answer_justification( v_answer, justification );
    set_answer_confidence( v_answer, confidence );
    set_answer_info( v_answer, ConsesLow.list( $kw56$PARSE_TREE, v_parse_tree ) );
    set_text_answer_vector( v_answer, question.new_string_vector( string ) );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6435L)
  public static SubLObject text_answer_similarity_function_method(final SubLObject self)
  {
    return $sym86$TEXT_ANSWER_SIMILARITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6535L)
  public static SubLObject text_answer_require_similarity_method(final SubLObject self)
  {
    return $float90$0_3;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 6867L)
  public static SubLObject text_answer_typical_instance_method(final SubLObject self, final SubLObject answers)
  {
    assert NIL != Types.listp( answers ) : answers;
    SubLObject typical = answers.first();
    final SubLObject centroid = sparse_vector.svector_centroid( Mapping.mapcar( $sym94$GET_TEXT_ANSWER_VECTOR, answers ) );
    final SubLObject centroid_length = sparse_vector.svector_length( centroid );
    if( !centroid_length.isZero() )
    {
      final SubLObject typical_vector = get_text_answer_vector( typical );
      SubLObject min_distance = scenario.safe_svector_cosine_angle( typical_vector, centroid, UNPROVIDED );
      SubLObject distance = NIL;
      SubLObject cdolist_list_var = answers;
      SubLObject v_answer = NIL;
      v_answer = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject answer_vector = get_text_answer_vector( v_answer );
        distance = scenario.safe_svector_cosine_angle( answer_vector, centroid, UNPROVIDED );
        if( distance.numG( min_distance ) )
        {
          min_distance = distance;
          typical = v_answer;
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_answer = cdolist_list_var.first();
      }
    }
    return typical;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 7699L)
  public static SubLObject text_answer_select_method(final SubLObject self, final SubLObject answers)
  {
    assert NIL != Types.listp( answers ) : answers;
    final SubLObject require_percentage = methods.funcall_class_method_with_0_args( methods.funcall_instance_method_with_0_args( answers.first(), $sym30$GET_INFO_REQUEST ), $sym98$REQUIRE_PERCENTAGE );
    final SubLObject require_similarity = methods.funcall_class_method_with_0_args( self, $sym88$REQUIRE_SIMILARITY );
    SubLObject typicals = NIL;
    SubLObject total_confidence = ZERO_INTEGER;
    SubLObject selected = NIL;
    final SubLObject similarity_function = ( NIL != answers ) ? methods.funcall_class_method_with_0_args( answers.first(), $sym84$SIMILARITY_FUNCTION ) : NIL;
    SubLObject cdolist_list_var = clustering.cluster( answers, similarity_function, ONE_INTEGER, require_similarity );
    SubLObject cluster = NIL;
    cluster = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_answer = methods.funcall_class_method_with_1_args( self, $sym92$TYPICAL_INSTANCE, methods.funcall_class_method_with_1_args( self, $sym14$MAX_INSTANCES, clustering.cluster_elements( cluster ) ) );
      set_answer_relevance( v_answer, clustering.cluster_cardinality( cluster ) );
      typicals = ConsesLow.cons( v_answer, typicals );
      total_confidence = Numbers.add( total_confidence, methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONFIDENCE ) );
      cdolist_list_var = cdolist_list_var.rest();
      cluster = cdolist_list_var.first();
    }
    final SubLObject stop_after_confidence = Numbers.multiply( Numbers.divide( total_confidence, $int99$100 ), require_percentage );
    SubLObject sofar_confidence = ZERO_INTEGER;
    SubLObject stopP = Numbers.numGE( sofar_confidence, stop_after_confidence );
    if( NIL == stopP )
    {
      SubLObject csome_list_var = Sort.sort( typicals, $sym100$TEXT_ANSWER_BETTER, UNPROVIDED );
      SubLObject v_answer2 = NIL;
      v_answer2 = csome_list_var.first();
      while ( NIL == stopP && NIL != csome_list_var)
      {
        selected = ConsesLow.cons( v_answer2, selected );
        sofar_confidence = Numbers.add( sofar_confidence, methods.funcall_instance_method_with_0_args( v_answer2, $sym19$GET_CONFIDENCE ) );
        stopP = Numbers.numGE( sofar_confidence, stop_after_confidence );
        csome_list_var = csome_list_var.rest();
        v_answer2 = csome_list_var.first();
      }
    }
    return Sequences.nreverse( selected );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9263L)
  public static SubLObject text_answer_better(final SubLObject answer1, final SubLObject answer2)
  {
    return methods.funcall_instance_method_with_0_args( answer1, $sym19$GET_CONFIDENCE ).numE( methods.funcall_instance_method_with_0_args( answer2, $sym19$GET_CONFIDENCE ) ) ? Numbers.numG( methods
        .funcall_instance_method_with_0_args( answer1, $sym41$GET_RELEVANCE ), methods.funcall_instance_method_with_0_args( answer2, $sym41$GET_RELEVANCE ) )
        : Numbers.numG( methods.funcall_instance_method_with_0_args( answer1, $sym19$GET_CONFIDENCE ), methods.funcall_instance_method_with_0_args( answer2, $sym19$GET_CONFIDENCE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9612L)
  public static SubLObject text_answer_set_confidence(final SubLObject answers)
  {
    assert NIL != clustering.cluster_p( answers ) : answers;
    SubLObject confidence = ZERO_INTEGER;
    SubLObject cdolist_list_var = clustering.cluster_elements( answers );
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      confidence = Numbers.add( confidence, methods.funcall_instance_method_with_0_args( v_answer, $sym19$GET_CONFIDENCE ) );
      cdolist_list_var = cdolist_list_var.rest();
      v_answer = cdolist_list_var.first();
    }
    return confidence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 9923L)
  public static SubLObject text_answer_get_vector_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_text_answer_method = NIL;
    final SubLObject vector = get_text_answer_vector( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD, vector );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_text_answer_vector( self, vector );
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
      catch_var_for_text_answer_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_text_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10054L)
  public static SubLObject text_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2)
  {
    assert NIL != text_answer_p( ans1 ) : ans1;
    assert NIL != text_answer_p( ans2 ) : ans2;
    if( NIL != Strings.stringE( methods.funcall_instance_method_with_0_args( ans1, $sym34$GET_CONTENT ), methods.funcall_instance_method_with_0_args( ans2, $sym34$GET_CONTENT ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      return ONE_INTEGER;
    }
    return scenario.safe_svector_cosine_angle( methods.funcall_instance_method_with_0_args( ans1, $sym103$GET_VECTOR ), methods.funcall_instance_method_with_0_args( ans2, $sym103$GET_VECTOR ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10526L)
  public static SubLObject get_value_answer_interpreted_values(final SubLObject value_answer)
  {
    return classes.subloop_get_access_protected_instance_slot( value_answer, TEN_INTEGER, $sym114$INTERPRETED_VALUES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10526L)
  public static SubLObject set_value_answer_interpreted_values(final SubLObject value_answer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( value_answer, value, TEN_INTEGER, $sym114$INTERPRETED_VALUES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10526L)
  public static SubLObject subloop_reserved_initialize_value_answer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10526L)
  public static SubLObject subloop_reserved_initialize_value_answer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym8$INFO_REQUEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym7$CONTENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym6$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym5$RELEVANCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym4$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym3$INFO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym78$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym77$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym76$AUGMENTATION_TERMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym112$VALUE_ANSWER, $sym114$INTERPRETED_VALUES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 10526L)
  public static SubLObject value_answer_p(final SubLObject value_answer)
  {
    return classes.subloop_instanceof_class( value_answer, $sym112$VALUE_ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 11755L)
  public static SubLObject new_value_answer(final SubLObject info_request, final SubLObject parse, final SubLObject justification, final SubLObject confidence, SubLObject cyc_interpretations)
  {
    if( cyc_interpretations == UNPROVIDED )
    {
      cyc_interpretations = NIL;
    }
    assert NIL != search_engine.information_request_p( info_request ) : info_request;
    assert NIL != parse_tree.parse_tree_p( parse ) : parse;
    assert NIL != search_engine.information_p( justification ) : justification;
    assert NIL != Types.numberp( confidence ) : confidence;
    assert NIL != Types.listp( cyc_interpretations ) : cyc_interpretations;
    final SubLObject v_answer = object.new_class_instance( $sym112$VALUE_ANSWER );
    set_answer_info_request( v_answer, info_request );
    set_answer_content( v_answer, string_utilities.string_substitute( $str118$_, $str119$__RRB_, string_utilities.string_substitute( $str120$_, $str121$_LRB__, methods.funcall_instance_method_with_0_args( parse,
        $sym122$GET_STRING ), UNPROVIDED ), UNPROVIDED ) );
    set_answer_justification( v_answer, justification );
    set_answer_confidence( v_answer, confidence );
    set_text_answer_parse( v_answer, parse );
    set_value_answer_interpreted_values( v_answer, cyc_interpretations );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12602L)
  public static SubLObject value_answer_similarity_function_method(final SubLObject self)
  {
    return $sym124$VALUE_ANSWER_SIMILARITY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12779L)
  public static SubLObject value_answer_get_interpreted_values_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_value_answer_method = NIL;
    final SubLObject interpreted_values = get_value_answer_interpreted_values( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD, interpreted_values );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_value_answer_interpreted_values( self, interpreted_values );
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
      catch_var_for_value_answer_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_value_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 12878L)
  public static SubLObject value_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2)
  {
    assert NIL != value_answer_p( ans1 ) : ans1;
    assert NIL != value_answer_p( ans2 ) : ans2;
    SubLObject max = ZERO_INTEGER;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args( ans1, $sym126$GET_INTERPRETED_VALUES );
    SubLObject iv1 = NIL;
    iv1 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args( ans2, $sym126$GET_INTERPRETED_VALUES );
      SubLObject iv2 = NIL;
      iv2 = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject value = amount_similarity( iv1, iv2 );
        if( value.numG( max ) )
        {
          max = value;
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        iv2 = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      iv1 = cdolist_list_var.first();
    }
    return max;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13429L)
  public static SubLObject value_answer_typical_instance_method(final SubLObject self, final SubLObject answers)
  {
    return list_utilities.random_element( answers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13590L)
  public static SubLObject amount_similarity(final SubLObject amount1, final SubLObject amount2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject quotient = quantities.cyc_quotient( amount1, amount2 );
          if( quotient.isNumber() && quotient.numG( ONE_INTEGER ) )
          {
            result = Numbers.invert( quotient );
          }
          else if( quotient.isNumber() )
          {
            result = quotient;
          }
          else
          {
            result = ZERO_INTEGER;
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      result = ZERO_INTEGER;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13997L)
  public static SubLObject subloop_reserved_initialize_sentence_answer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13997L)
  public static SubLObject subloop_reserved_initialize_sentence_answer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym11$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym12$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym8$INFO_REQUEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym7$CONTENT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym6$CONFIDENCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym5$RELEVANCE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym4$JUSTIFICATION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$ANSWER, $sym3$INFO, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym78$VECTOR, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym77$PARSE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym74$TEXT_ANSWER, $sym76$AUGMENTATION_TERMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 13997L)
  public static SubLObject sentence_answer_p(final SubLObject sentence_answer)
  {
    return classes.subloop_instanceof_class( sentence_answer, $sym136$SENTENCE_ANSWER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14241L)
  public static SubLObject new_sentence_answer(final SubLObject info_request, final SubLObject passage, final SubLObject confidence)
  {
    final SubLObject v_answer = object.new_class_instance( $sym136$SENTENCE_ANSWER );
    set_answer_info_request( v_answer, info_request );
    set_answer_content( v_answer, methods.funcall_instance_method_with_0_args( passage, $sym34$GET_CONTENT ) );
    set_answer_justification( v_answer, passage );
    set_answer_confidence( v_answer, confidence );
    set_answer_relevance( v_answer, ONE_INTEGER );
    set_text_answer_vector( v_answer, question.new_string_vector( methods.funcall_instance_method_with_0_args( passage, $sym34$GET_CONTENT ) ) );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 14707L)
  public static SubLObject sentence_answer_require_similarity_method(final SubLObject self)
  {
    return $float90$0_3;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15043L)
  public static SubLObject sentence_answer_typical_instance_method(final SubLObject self, final SubLObject answers)
  {
    return methods.funcall_class_method_with_1_args( self, $sym14$MAX_INSTANCES, answers ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15250L)
  public static SubLObject sentence_answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_sentence_answer_method = NIL;
    final SubLObject relevance = get_answer_relevance( self );
    final SubLObject confidence = get_answer_confidence( self );
    final SubLObject content = get_answer_content( self );
    final SubLObject info_request = get_answer_info_request( self );
    try
    {
      thread.throwStack.push( $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD );
      try
      {
        streams_high.write_string( $str145$__SENTENCE_ANSWER_for_, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( info_request, stream );
        streams_high.write_string( $str27$__, stream, UNPROVIDED, UNPROVIDED );
        print_high.prin1( content, stream );
        PrintLow.format( stream, $str28$____2F___2F_, confidence, relevance );
        Dynamic.sublisp_throw( $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_answer_relevance( self, relevance );
          set_answer_confidence( self, confidence );
          set_answer_content( self, content );
          set_answer_info_request( self, info_request );
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
      catch_var_for_sentence_answer_method = Errors.handleThrowable( ccatch_env_var, $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_sentence_answer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 15593L)
  public static SubLObject text_answer_similarity(final SubLObject ans1, final SubLObject ans2)
  {
    assert NIL != text_answer_p( ans1 ) : ans1;
    assert NIL != text_answer_p( ans2 ) : ans2;
    return methods.funcall_class_method_with_2_args( $sym74$TEXT_ANSWER, $sym107$SIMILARITY, ans1, ans2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16018L)
  public static SubLObject value_answer_similarity(final SubLObject ans1, final SubLObject ans2)
  {
    assert NIL != value_answer_p( ans1 ) : ans1;
    assert NIL != value_answer_p( ans2 ) : ans2;
    return methods.funcall_class_method_with_2_args( $sym112$VALUE_ANSWER, $sym107$SIMILARITY, ans1, ans2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/quirk/lisp", position = 16391L)
  public static SubLObject find_subject_agreement(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    final SubLObject v_parser = methods.funcall_class_method_with_0_args( $sym148$STANFORD_PARSER, $sym149$GET_PARSER );
    final SubLObject parse = methods.funcall_instance_method_with_1_args( v_parser, $sym77$PARSE, string );
    if( !$kw150$NP.eql( methods.funcall_instance_method_with_0_args( parse, $sym151$GET_CATEGORY ) ) )
    {
      return string_utilities.$empty_string$.getGlobalValue();
    }
    final SubLObject head = methods.funcall_instance_method_with_0_args( parse, $sym152$GET_HEAD );
    final SubLObject category = methods.funcall_instance_method_with_0_args( head, $sym151$GET_CATEGORY );
    if( category.eql( $kw153$NNS ) )
    {
      return $str154$are;
    }
    return $str155$is;
  }

  public static SubLObject declare_answer_file()
  {
    SubLFiles.declareFunction( me, "get_answer_info", "GET-ANSWER-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_info", "SET-ANSWER-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_answer_justification", "GET-ANSWER-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_justification", "SET-ANSWER-JUSTIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_answer_relevance", "GET-ANSWER-RELEVANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_relevance", "SET-ANSWER-RELEVANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_answer_confidence", "GET-ANSWER-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_confidence", "SET-ANSWER-CONFIDENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_answer_content", "GET-ANSWER-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_content", "SET-ANSWER-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_answer_info_request", "GET-ANSWER-INFO-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_answer_info_request", "SET-ANSWER-INFO-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_answer_class", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_p", "ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_max_instances_method", "ANSWER-MAX-INSTANCES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "answer_print_method", "ANSWER-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "answer_get_info_request_method", "ANSWER-GET-INFO-REQUEST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_get_content_method", "ANSWER-GET-CONTENT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_get_confidence_method", "ANSWER-GET-CONFIDENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_get_relevance_method", "ANSWER-GET-RELEVANCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_justify_method", "ANSWER-JUSTIFY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_get_info_method", "ANSWER-GET-INFO-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_get_parse_tree_method", "ANSWER-GET-PARSE-TREE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_natural_language_factoid_method", "ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "answer_older_method", "ANSWER-OLDER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "answer_get_date_method", "ANSWER-GET-DATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_text_answer_augmentation_terms", "GET-TEXT-ANSWER-AUGMENTATION-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_text_answer_augmentation_terms", "SET-TEXT-ANSWER-AUGMENTATION-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_text_answer_parse", "GET-TEXT-ANSWER-PARSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_text_answer_parse", "SET-TEXT-ANSWER-PARSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_text_answer_vector", "GET-TEXT-ANSWER-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_text_answer_vector", "SET-TEXT-ANSWER-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_text_answer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_text_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "text_answer_p", "TEXT-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_text_answer", "NEW-TEXT-ANSWER", 4, 1, false );
    SubLFiles.declareFunction( me, "text_answer_similarity_function_method", "TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_answer_require_similarity_method", "TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_answer_typical_instance_method", "TEXT-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "text_answer_select_method", "TEXT-ANSWER-SELECT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "text_answer_better", "TEXT-ANSWER-BETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "text_answer_set_confidence", "TEXT-ANSWER-SET-CONFIDENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "text_answer_get_vector_method", "TEXT-ANSWER-GET-VECTOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "text_answer_similarity_method", "TEXT-ANSWER-SIMILARITY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_value_answer_interpreted_values", "GET-VALUE-ANSWER-INTERPRETED-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_value_answer_interpreted_values", "SET-VALUE-ANSWER-INTERPRETED-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_value_answer_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_value_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "value_answer_p", "VALUE-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_value_answer", "NEW-VALUE-ANSWER", 4, 1, false );
    SubLFiles.declareFunction( me, "value_answer_similarity_function_method", "VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "value_answer_get_interpreted_values_method", "VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "value_answer_similarity_method", "VALUE-ANSWER-SIMILARITY-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "value_answer_typical_instance_method", "VALUE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "amount_similarity", "AMOUNT-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sentence_answer_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_sentence_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_answer_p", "SENTENCE-ANSWER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sentence_answer", "NEW-SENTENCE-ANSWER", 3, 0, false );
    SubLFiles.declareFunction( me, "sentence_answer_require_similarity_method", "SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sentence_answer_typical_instance_method", "SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "sentence_answer_print_method", "SENTENCE-ANSWER-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "text_answer_similarity", "TEXT-ANSWER-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "value_answer_similarity", "VALUE-ANSWER-SIMILARITY", 2, 0, false );
    SubLFiles.declareFunction( me, "find_subject_agreement", "FIND-SUBJECT-AGREEMENT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_answer_file()
  {
    return NIL;
  }

  public static SubLObject setup_answer_file()
  {
    classes.subloop_new_class( $sym0$ANSWER, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$ANSWER, NIL );
    classes.subloop_note_class_initialization_function( $sym0$ANSWER, $sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$ANSWER, $sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE );
    subloop_reserved_initialize_answer_class( $sym0$ANSWER );
    methods.methods_incorporate_class_method( $sym14$MAX_INSTANCES, $sym0$ANSWER, $list15, $list16, $list17 );
    methods.subloop_register_class_method( $sym0$ANSWER, $sym14$MAX_INSTANCES, $sym20$ANSWER_MAX_INSTANCES_METHOD );
    methods.methods_incorporate_instance_method( $sym21$PRINT, $sym0$ANSWER, $list22, $list23, $list24 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym21$PRINT, $sym29$ANSWER_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym30$GET_INFO_REQUEST, $sym0$ANSWER, $list15, NIL, $list31 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym30$GET_INFO_REQUEST, $sym33$ANSWER_GET_INFO_REQUEST_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_CONTENT, $sym0$ANSWER, $list15, NIL, $list35 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym34$GET_CONTENT, $sym37$ANSWER_GET_CONTENT_METHOD );
    methods.methods_incorporate_instance_method( $sym19$GET_CONFIDENCE, $sym0$ANSWER, $list15, NIL, $list38 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym19$GET_CONFIDENCE, $sym40$ANSWER_GET_CONFIDENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym41$GET_RELEVANCE, $sym0$ANSWER, $list15, NIL, $list42 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym41$GET_RELEVANCE, $sym44$ANSWER_GET_RELEVANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym45$JUSTIFY, $sym0$ANSWER, $list15, NIL, $list46 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym45$JUSTIFY, $sym48$ANSWER_JUSTIFY_METHOD );
    methods.methods_incorporate_instance_method( $sym49$GET_INFO, $sym0$ANSWER, $list15, NIL, $list50 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym49$GET_INFO, $sym52$ANSWER_GET_INFO_METHOD );
    methods.methods_incorporate_instance_method( $sym53$GET_PARSE_TREE, $sym0$ANSWER, $list15, NIL, $list54 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym53$GET_PARSE_TREE, $sym57$ANSWER_GET_PARSE_TREE_METHOD );
    methods.methods_incorporate_instance_method( $sym58$NATURAL_LANGUAGE_FACTOID, $sym0$ANSWER, $list15, NIL, $list59 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym58$NATURAL_LANGUAGE_FACTOID, $sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD );
    methods.methods_incorporate_instance_method( $sym64$OLDER, $sym0$ANSWER, $list15, $list65, $list66 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym64$OLDER, $sym69$ANSWER_OLDER_METHOD );
    methods.methods_incorporate_instance_method( $sym68$GET_DATE, $sym0$ANSWER, $list15, NIL, $list70 );
    methods.subloop_register_instance_method( $sym0$ANSWER, $sym68$GET_DATE, $sym73$ANSWER_GET_DATE_METHOD );
    classes.subloop_new_class( $sym74$TEXT_ANSWER, $sym0$ANSWER, NIL, NIL, $list75 );
    classes.class_set_implements_slot_listeners( $sym74$TEXT_ANSWER, NIL );
    classes.subloop_note_class_initialization_function( $sym74$TEXT_ANSWER, $sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym74$TEXT_ANSWER, $sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE );
    subloop_reserved_initialize_text_answer_class( $sym74$TEXT_ANSWER );
    methods.methods_incorporate_class_method( $sym84$SIMILARITY_FUNCTION, $sym74$TEXT_ANSWER, $list22, NIL, $list85 );
    methods.subloop_register_class_method( $sym74$TEXT_ANSWER, $sym84$SIMILARITY_FUNCTION, $sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD );
    methods.methods_incorporate_class_method( $sym88$REQUIRE_SIMILARITY, $sym74$TEXT_ANSWER, $list22, NIL, $list89 );
    methods.subloop_register_class_method( $sym74$TEXT_ANSWER, $sym88$REQUIRE_SIMILARITY, $sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD );
    methods.methods_incorporate_class_method( $sym92$TYPICAL_INSTANCE, $sym74$TEXT_ANSWER, $list15, $list16, $list93 );
    methods.subloop_register_class_method( $sym74$TEXT_ANSWER, $sym92$TYPICAL_INSTANCE, $sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD );
    methods.methods_incorporate_class_method( $sym96$SELECT, $sym74$TEXT_ANSWER, $list15, $list16, $list97 );
    methods.subloop_register_class_method( $sym74$TEXT_ANSWER, $sym96$SELECT, $sym101$TEXT_ANSWER_SELECT_METHOD );
    methods.methods_incorporate_instance_method( $sym103$GET_VECTOR, $sym74$TEXT_ANSWER, $list22, NIL, $list104 );
    methods.subloop_register_instance_method( $sym74$TEXT_ANSWER, $sym103$GET_VECTOR, $sym106$TEXT_ANSWER_GET_VECTOR_METHOD );
    methods.methods_incorporate_class_method( $sym107$SIMILARITY, $sym74$TEXT_ANSWER, $list15, $list108, $list109 );
    methods.subloop_register_class_method( $sym74$TEXT_ANSWER, $sym107$SIMILARITY, $sym111$TEXT_ANSWER_SIMILARITY_METHOD );
    classes.subloop_new_class( $sym112$VALUE_ANSWER, $sym74$TEXT_ANSWER, NIL, NIL, $list113 );
    classes.class_set_implements_slot_listeners( $sym112$VALUE_ANSWER, NIL );
    classes.subloop_note_class_initialization_function( $sym112$VALUE_ANSWER, $sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym112$VALUE_ANSWER, $sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE );
    subloop_reserved_initialize_value_answer_class( $sym112$VALUE_ANSWER );
    methods.methods_incorporate_class_method( $sym84$SIMILARITY_FUNCTION, $sym112$VALUE_ANSWER, $list22, NIL, $list123 );
    methods.subloop_register_class_method( $sym112$VALUE_ANSWER, $sym84$SIMILARITY_FUNCTION, $sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD );
    methods.methods_incorporate_instance_method( $sym126$GET_INTERPRETED_VALUES, $sym112$VALUE_ANSWER, $list15, NIL, $list127 );
    methods.subloop_register_instance_method( $sym112$VALUE_ANSWER, $sym126$GET_INTERPRETED_VALUES, $sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD );
    methods.methods_incorporate_class_method( $sym107$SIMILARITY, $sym112$VALUE_ANSWER, $list15, $list108, $list130 );
    methods.subloop_register_class_method( $sym112$VALUE_ANSWER, $sym107$SIMILARITY, $sym132$VALUE_ANSWER_SIMILARITY_METHOD );
    methods.methods_incorporate_class_method( $sym92$TYPICAL_INSTANCE, $sym112$VALUE_ANSWER, $list15, $list16, $list133 );
    methods.subloop_register_class_method( $sym112$VALUE_ANSWER, $sym92$TYPICAL_INSTANCE, $sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD );
    classes.subloop_new_class( $sym136$SENTENCE_ANSWER, $sym74$TEXT_ANSWER, NIL, NIL, $list137 );
    classes.class_set_implements_slot_listeners( $sym136$SENTENCE_ANSWER, NIL );
    classes.subloop_note_class_initialization_function( $sym136$SENTENCE_ANSWER, $sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym136$SENTENCE_ANSWER, $sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE );
    subloop_reserved_initialize_sentence_answer_class( $sym136$SENTENCE_ANSWER );
    methods.methods_incorporate_class_method( $sym88$REQUIRE_SIMILARITY, $sym136$SENTENCE_ANSWER, $list22, NIL, $list89 );
    methods.subloop_register_class_method( $sym136$SENTENCE_ANSWER, $sym88$REQUIRE_SIMILARITY, $sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD );
    methods.methods_incorporate_class_method( $sym92$TYPICAL_INSTANCE, $sym136$SENTENCE_ANSWER, $list15, $list16, $list141 );
    methods.subloop_register_class_method( $sym136$SENTENCE_ANSWER, $sym92$TYPICAL_INSTANCE, $sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym21$PRINT, $sym136$SENTENCE_ANSWER, $list22, $list23, $list143 );
    methods.subloop_register_instance_method( $sym136$SENTENCE_ANSWER, $sym21$PRINT, $sym146$SENTENCE_ANSWER_PRINT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_answer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_answer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_answer_file();
  }
  static
  {
    me = new answer();
    $sym0$ANSWER = makeSymbol( "ANSWER" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INFO-REQUEST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONTENT" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONFIDENCE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "RELEVANCE" ), makeKeyword( "INSTANCE" ),
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "JUSTIFICATION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INFO" ), makeKeyword( "INSTANCE" ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SELECT" ), ConsesLow.list( makeSymbol( "CANDIDATES" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INFO-REQUEST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONTENT" ), NIL, makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONFIDENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                            "GET-RELEVANCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "JUSTIFY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "NATURAL-LANGUAGE-FACTOID" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "OLDER" ), ConsesLow
                                    .list( makeSymbol( "OTHER-ANSWER" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DATE" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym3$INFO = makeSymbol( "INFO" );
    $sym4$JUSTIFICATION = makeSymbol( "JUSTIFICATION" );
    $sym5$RELEVANCE = makeSymbol( "RELEVANCE" );
    $sym6$CONFIDENCE = makeSymbol( "CONFIDENCE" );
    $sym7$CONTENT = makeSymbol( "CONTENT" );
    $sym8$INFO_REQUEST = makeSymbol( "INFO-REQUEST" );
    $sym9$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS" );
    $sym11$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym12$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE" );
    $sym14$MAX_INSTANCES = makeSymbol( "MAX-INSTANCES" );
    $list15 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list16 = ConsesLow.list( makeSymbol( "ANSWERS" ) );
    $list17 = ConsesLow.list( makeString( "@param ANSWERS listp\n    @return answer-p; the highest scoring answer among ANSWERS" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANSWERS" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAX-SCORE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "MAX-ANSWERS" ), NIL ) ), ConsesLow.list( makeSymbol(
            "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ), makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX-SCORE" ), ConsesLow.list(
                    makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                        "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ), makeSymbol( "MAX-SCORE" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ANSWER" ), makeSymbol( "MAX-ANSWERS" ) ) ) ),
            ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MAX-ANSWERS" ) ) ) );
    $sym18$LISTP = makeSymbol( "LISTP" );
    $sym19$GET_CONFIDENCE = makeSymbol( "GET-CONFIDENCE" );
    $sym20$ANSWER_MAX_INSTANCES_METHOD = makeSymbol( "ANSWER-MAX-INSTANCES-METHOD" );
    $sym21$PRINT = makeSymbol( "PRINT" );
    $list22 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list23 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list24 = ConsesLow.list( makeString( "Prints this answer to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
        "#<ANSWER for " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "INFO-REQUEST" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString( ": " ),
            makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "CONTENT" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                " (~,2F/~,2F)" ), makeSymbol( "CONFIDENCE" ), makeSymbol( "RELEVANCE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym25$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $str26$__ANSWER_for_ = makeString( "#<ANSWER for " );
    $str27$__ = makeString( ": " );
    $str28$____2F___2F_ = makeString( " (~,2F/~,2F)" );
    $sym29$ANSWER_PRINT_METHOD = makeSymbol( "ANSWER-PRINT-METHOD" );
    $sym30$GET_INFO_REQUEST = makeSymbol( "GET-INFO-REQUEST" );
    $list31 = ConsesLow.list( makeString( "@return object; the info-request of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INFO-REQUEST" ) ) );
    $sym32$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym33$ANSWER_GET_INFO_REQUEST_METHOD = makeSymbol( "ANSWER-GET-INFO-REQUEST-METHOD" );
    $sym34$GET_CONTENT = makeSymbol( "GET-CONTENT" );
    $list35 = ConsesLow.list( makeString( "@return object; the string of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONTENT" ) ) );
    $sym36$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym37$ANSWER_GET_CONTENT_METHOD = makeSymbol( "ANSWER-GET-CONTENT-METHOD" );
    $list38 = ConsesLow.list( makeString( "@return non-negative-integer-p; the confidence of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONFIDENCE" ) ) );
    $sym39$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym40$ANSWER_GET_CONFIDENCE_METHOD = makeSymbol( "ANSWER-GET-CONFIDENCE-METHOD" );
    $sym41$GET_RELEVANCE = makeSymbol( "GET-RELEVANCE" );
    $list42 = ConsesLow.list( makeString( "@return non-negative-integer-p; the relevance of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RELEVANCE" ) ) );
    $sym43$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym44$ANSWER_GET_RELEVANCE_METHOD = makeSymbol( "ANSWER-GET-RELEVANCE-METHOD" );
    $sym45$JUSTIFY = makeSymbol( "JUSTIFY" );
    $list46 = ConsesLow.list( makeString( "@return passage; the justification of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "JUSTIFICATION" ) ) );
    $sym47$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym48$ANSWER_JUSTIFY_METHOD = makeSymbol( "ANSWER-JUSTIFY-METHOD" );
    $sym49$GET_INFO = makeSymbol( "GET-INFO" );
    $list50 = ConsesLow.list( makeString( "@return passage; the info slot of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INFO" ) ) );
    $sym51$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym52$ANSWER_GET_INFO_METHOD = makeSymbol( "ANSWER-GET-INFO-METHOD" );
    $sym53$GET_PARSE_TREE = makeSymbol( "GET-PARSE-TREE" );
    $list54 = ConsesLow.list( makeString( "@return passage; the parse-tree of this answer, if there is one" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol( "INFO" ), makeKeyword(
        "PARSE-TREE" ) ) ) );
    $sym55$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $kw56$PARSE_TREE = makeKeyword( "PARSE-TREE" );
    $sym57$ANSWER_GET_PARSE_TREE_METHOD = makeSymbol( "ANSWER-GET-PARSE-TREE-METHOD" );
    $sym58$NATURAL_LANGUAGE_FACTOID = makeSymbol( "NATURAL-LANGUAGE-FACTOID" );
    $list59 = ConsesLow.list( makeString(
        "@return stringp; a simple string stating the answer, whenever possible, in the form\n  of a truth-bearing sentence. For example, the sentence 'Kofi Annan is\n  the UN Secretary General' in response to the question 'who is Kofi Annan?'\n  @owner bertolo." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "FOCUS" ), makeSymbol( "COPULA" ), makeSymbol( "FACTOID" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "DEFINITIONAL-QUESTION-P" ), makeSymbol( "INFO-REQUEST" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FOCUS" ), ConsesLow.list( makeSymbol( "CAR" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                "INFO-REQUEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-KEYSTRINGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COPULA" ), ConsesLow.list( makeSymbol(
                    "FIND-SUBJECT-AGREEMENT" ), makeSymbol( "CONTENT" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, makeSymbol( "COPULA" ), makeSymbol( "*EMPTY-STRING*" ) ), ConsesLow.list(
                        makeSymbol( "CSETQ" ), makeSymbol( "COPULA" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( " " ), makeSymbol( "COPULA" ), makeString( " " ) ) ) ), ConsesLow.list( makeSymbol(
                            "CSETQ" ), makeSymbol( "FACTOID" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "FOCUS" ), makeSymbol( "COPULA" ), makeSymbol( "CONTENT" ) ) ) ), ConsesLow.list( T, ConsesLow
                                .list( makeSymbol( "CSETQ" ), makeSymbol( "FACTOID" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "JUSTIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                    makeSymbol( "GET-CONTENT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "FACTOID" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                        makeSymbol( "FACTOID" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "*EMPTY-STRING*" ) ) ) ) );
    $sym60$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym61$GET_KEYSTRINGS = makeSymbol( "GET-KEYSTRINGS" );
    $str62$_ = makeString( " " );
    $sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD = makeSymbol( "ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD" );
    $sym64$OLDER = makeSymbol( "OLDER" );
    $list65 = ConsesLow.list( makeSymbol( "OTHER-ANSWER" ) );
    $list66 = ConsesLow.list( makeString( "@param OTHER-ANSWER, answer-p\n   @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\n   @owner bertolo." ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ),
        makeSymbol( "OTHER-ANSWER" ), makeSymbol( "ANSWER-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "THIS-DATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
            "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DATE" ) ) ) ), ConsesLow.list( makeSymbol( "OTHER-DATE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OTHER-ANSWER" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "GET-DATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "DATE-P" ), makeSymbol( "THIS-DATE" ) ),
                    ConsesLow.list( makeSymbol( "DATE-P" ), makeSymbol( "OTHER-DATE" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DATE<" ), makeSymbol( "THIS-DATE" ), makeSymbol(
                        "OTHER-DATE" ) ) ) ) ) );
    $sym67$ANSWER_P = makeSymbol( "ANSWER-P" );
    $sym68$GET_DATE = makeSymbol( "GET-DATE" );
    $sym69$ANSWER_OLDER_METHOD = makeSymbol( "ANSWER-OLDER-METHOD" );
    $list70 = ConsesLow.list( makeString( "@return date-p, the publication date of the source on which this answer depends.\n   @owner bertolo" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
        "ABSTRACT-PASSAGE-P" ), makeSymbol( "JUSTIFICATION" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "JUSTIFICATION" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-PUBLICATION-DATE" ) ) ) ) ) );
    $sym71$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-ANSWER-METHOD" );
    $sym72$GET_PUBLICATION_DATE = makeSymbol( "GET-PUBLICATION-DATE" );
    $sym73$ANSWER_GET_DATE_METHOD = makeSymbol( "ANSWER-GET-DATE-METHOD" );
    $sym74$TEXT_ANSWER = makeSymbol( "TEXT-ANSWER" );
    $list75 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "VECTOR" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PARSE" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "AUGMENTATION-TERMS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
            "REQUIRE-SIMILARITY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SIMILARITY" ), ConsesLow.list( makeSymbol( "ANS1" ), makeSymbol( "ANS2" ) ),
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "TYPICAL-INSTANCE" ), ConsesLow.list( makeSymbol( "ANSWERS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                    makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SELECT" ), ConsesLow.list( makeSymbol( "ANSWERS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                        "SIMILARITY-FUNCTION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-VECTOR" ), NIL, makeKeyword( "PROTECTED" ) )
    } );
    $sym76$AUGMENTATION_TERMS = makeSymbol( "AUGMENTATION-TERMS" );
    $sym77$PARSE = makeSymbol( "PARSE" );
    $sym78$VECTOR = makeSymbol( "VECTOR" );
    $sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS" );
    $sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE" );
    $sym81$INFORMATION_REQUEST_P = makeSymbol( "INFORMATION-REQUEST-P" );
    $sym82$INFORMATION_P = makeSymbol( "INFORMATION-P" );
    $sym83$NUMBERP = makeSymbol( "NUMBERP" );
    $sym84$SIMILARITY_FUNCTION = makeSymbol( "SIMILARITY-FUNCTION" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEXT-ANSWER-SIMILARITY" ) ) ) );
    $sym86$TEXT_ANSWER_SIMILARITY = makeSymbol( "TEXT-ANSWER-SIMILARITY" );
    $sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD = makeSymbol( "TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD" );
    $sym88$REQUIRE_SIMILARITY = makeSymbol( "REQUIRE-SIMILARITY" );
    $list89 = ConsesLow.list( makeString(
        "@return positive-number-p; a value between 0 and 1 that specifies a minimal \n   similarity that is required for two answers to end up in the same cluster\n   during answer clustering. A low number implies few clusters, a high number\n   many clusters" ),
        ConsesLow.list( makeSymbol( "RET" ), makeDouble( 0.3 ) ) );
    $float90$0_3 = makeDouble( 0.3 );
    $sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD = makeSymbol( "TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD" );
    $sym92$TYPICAL_INSTANCE = makeSymbol( "TYPICAL-INSTANCE" );
    $list93 = ConsesLow.list( makeString( "@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANSWERS" ), makeSymbol(
        "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPICAL" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "ANSWERS" ) ) ), ConsesLow.list( makeSymbol(
            "CENTROID" ), ConsesLow.list( makeSymbol( "SVECTOR-CENTROID" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TEXT-ANSWER-VECTOR" ) ), makeSymbol(
                "ANSWERS" ) ) ) ), ConsesLow.list( makeSymbol( "CENTROID-LENGTH" ), ConsesLow.list( makeSymbol( "SVECTOR-LENGTH" ), makeSymbol( "CENTROID" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
                    makeSymbol( "ZEROP" ), makeSymbol( "CENTROID-LENGTH" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TYPICAL-VECTOR" ), ConsesLow.list( makeSymbol(
                        "GET-TEXT-ANSWER-VECTOR" ), makeSymbol( "TYPICAL" ) ) ), ConsesLow.list( makeSymbol( "MIN-DISTANCE" ), ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), makeSymbol( "TYPICAL-VECTOR" ),
                            makeSymbol( "CENTROID" ) ) ), makeSymbol( "DISTANCE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ANSWER" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list(
                                makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER-VECTOR" ), ConsesLow.list( makeSymbol( "GET-TEXT-ANSWER-VECTOR" ), makeSymbol( "ANSWER" ) ) ) ), ConsesLow.list(
                                    makeSymbol( "CSETQ" ), makeSymbol( "DISTANCE" ), ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), makeSymbol( "ANSWER-VECTOR" ), makeSymbol( "CENTROID" ) ) ), ConsesLow.list(
                                        makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "DISTANCE" ), makeSymbol( "MIN-DISTANCE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                            "MIN-DISTANCE" ), makeSymbol( "DISTANCE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TYPICAL" ), makeSymbol( "ANSWER" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                "RET" ), makeSymbol( "TYPICAL" ) ) ) );
    $sym94$GET_TEXT_ANSWER_VECTOR = makeSymbol( "GET-TEXT-ANSWER-VECTOR" );
    $sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol( "TEXT-ANSWER-TYPICAL-INSTANCE-METHOD" );
    $sym96$SELECT = makeSymbol( "SELECT" );
    $list97 = ConsesLow.list( makeString( "@param ANSWERS listp;\n     @return listp; the list of conses of the most salient answers among ANSWERS \n     and their confidences, ranked by their salientness" ), ConsesLow
        .list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANSWERS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REQUIRE-PERCENTAGE" ), ConsesLow.list(
            makeSymbol( "FCM" ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INFO-REQUEST" ) ) ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REQUIRE-PERCENTAGE" ) ) ) ), ConsesLow.list( makeSymbol( "REQUIRE-SIMILARITY" ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "SELF" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "REQUIRE-SIMILARITY" ) ) ) ), ConsesLow.list( makeSymbol( "TYPICALS" ), NIL ), ConsesLow.list( makeSymbol( "TOTAL-CONFIDENCE" ), ZERO_INTEGER ), ConsesLow.list(
                    makeSymbol( "SELECTED" ), NIL ), ConsesLow.list( makeSymbol( "SIMILARITY-FUNCTION" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "ANSWERS" ), ConsesLow.list( makeSymbol( "FCM" ), ConsesLow
                        .list( makeSymbol( "FIRST" ), makeSymbol( "ANSWERS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SIMILARITY-FUNCTION" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow
                            .list( makeSymbol( "CLUSTER" ), ConsesLow.list( makeSymbol( "CLUSTER" ), makeSymbol( "ANSWERS" ), makeSymbol( "SIMILARITY-FUNCTION" ), ONE_INTEGER, makeSymbol( "REQUIRE-SIMILARITY" ) ) ),
                            ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                makeSymbol( "TYPICAL-INSTANCE" ) ), ConsesLow.list( makeSymbol( "FCM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAX-INSTANCES" ) ), ConsesLow.list(
                                    makeSymbol( "CLUSTER-ELEMENTS" ), makeSymbol( "CLUSTER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-ANSWER-RELEVANCE" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol(
                                        "CLUSTER-CARDINALITY" ), makeSymbol( "CLUSTER" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ANSWER" ), makeSymbol( "TYPICALS" ) ), ConsesLow.list( makeSymbol(
                                            "CINC" ), makeSymbol( "TOTAL-CONFIDENCE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                "GET-CONFIDENCE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STOP-AFTER-CONFIDENCE" ), ConsesLow.list( makeSymbol(
                                                    "*" ), ConsesLow.list( makeSymbol( "/" ), makeSymbol( "TOTAL-CONFIDENCE" ), makeInteger( 100 ) ), makeSymbol( "REQUIRE-PERCENTAGE" ) ) ), ConsesLow.list( makeSymbol(
                                                        "SOFAR-CONFIDENCE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "STOP?" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "SOFAR-CONFIDENCE" ), makeSymbol(
                                                            "STOP-AFTER-CONFIDENCE" ) ) ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "SORT" ),
                                                                makeSymbol( "TYPICALS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TEXT-ANSWER-BETTER" ) ) ), makeSymbol( "STOP?" ) ), ConsesLow.list(
                                                                    makeSymbol( "CPUSH" ), makeSymbol( "ANSWER" ), makeSymbol( "SELECTED" ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "SOFAR-CONFIDENCE" ),
                                                                        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANSWER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONFIDENCE" ) ) ) ), ConsesLow
                                                                            .list( makeSymbol( "CSETQ" ), makeSymbol( "STOP?" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "SOFAR-CONFIDENCE" ), makeSymbol(
                                                                                "STOP-AFTER-CONFIDENCE" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol(
                                                                                    "SELECTED" ) ) ) ) );
    $sym98$REQUIRE_PERCENTAGE = makeSymbol( "REQUIRE-PERCENTAGE" );
    $int99$100 = makeInteger( 100 );
    $sym100$TEXT_ANSWER_BETTER = makeSymbol( "TEXT-ANSWER-BETTER" );
    $sym101$TEXT_ANSWER_SELECT_METHOD = makeSymbol( "TEXT-ANSWER-SELECT-METHOD" );
    $sym102$CLUSTER_P = makeSymbol( "CLUSTER-P" );
    $sym103$GET_VECTOR = makeSymbol( "GET-VECTOR" );
    $list104 = ConsesLow.list( makeString( "@return svector-p; the word vector of this answer" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VECTOR" ) ) );
    $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-TEXT-ANSWER-METHOD" );
    $sym106$TEXT_ANSWER_GET_VECTOR_METHOD = makeSymbol( "TEXT-ANSWER-GET-VECTOR-METHOD" );
    $sym107$SIMILARITY = makeSymbol( "SIMILARITY" );
    $list108 = ConsesLow.list( makeSymbol( "ANS1" ), makeSymbol( "ANS2" ) );
    $list109 = ConsesLow.list( makeString(
        "@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity" ), ConsesLow.list( makeSymbol(
            "CHECK-TYPE" ), makeSymbol( "ANS1" ), makeSymbol( "TEXT-ANSWER-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANS2" ), makeSymbol( "TEXT-ANSWER-P" ) ), ConsesLow.list( makeSymbol( "PWHEN" ),
                ConsesLow.list( makeSymbol( "STRING=" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANS1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ), ConsesLow.list( makeSymbol(
                    "FIM" ), makeSymbol( "ANS2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-CONTENT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ),
                        ConsesLow.list( makeSymbol( "SAFE-SVECTOR-COSINE-ANGLE" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANS1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VECTOR" ) ) ),
                            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "ANS2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-VECTOR" ) ) ) ) ) );
    $sym110$TEXT_ANSWER_P = makeSymbol( "TEXT-ANSWER-P" );
    $sym111$TEXT_ANSWER_SIMILARITY_METHOD = makeSymbol( "TEXT-ANSWER-SIMILARITY-METHOD" );
    $sym112$VALUE_ANSWER = makeSymbol( "VALUE-ANSWER" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "INTERPRETED-VALUES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "SIMILARITY" ), ConsesLow.list( makeSymbol( "ANS1" ), makeSymbol( "ANS2" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-CLASS-METHOD" ), makeSymbol( "TYPICAL-INSTANCE" ), ConsesLow.list( makeSymbol( "ANSWERS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
                "SIMILARITY-FUNCTION" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INTERPRETED-VALUES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym114$INTERPRETED_VALUES = makeSymbol( "INTERPRETED-VALUES" );
    $sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS" );
    $sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE" );
    $sym117$PARSE_TREE_P = makeSymbol( "PARSE-TREE-P" );
    $str118$_ = makeString( ")" );
    $str119$__RRB_ = makeString( " -RRB-" );
    $str120$_ = makeString( "(" );
    $str121$_LRB__ = makeString( "-LRB- " );
    $sym122$GET_STRING = makeSymbol( "GET-STRING" );
    $list123 = ConsesLow.list( makeString( "@return symbolp; the similarity function used to compare value-answers" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "VALUE-ANSWER-SIMILARITY" ) ) ) );
    $sym124$VALUE_ANSWER_SIMILARITY = makeSymbol( "VALUE-ANSWER-SIMILARITY" );
    $sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD = makeSymbol( "VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD" );
    $sym126$GET_INTERPRETED_VALUES = makeSymbol( "GET-INTERPRETED-VALUES" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INTERPRETED-VALUES" ) ) );
    $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-VALUE-ANSWER-METHOD" );
    $sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD = makeSymbol( "VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD" );
    $list130 = ConsesLow.list( makeString(
        "@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity" ), ConsesLow.list( makeSymbol(
            "CHECK-TYPE" ), makeSymbol( "ANS1" ), makeSymbol( "VALUE-ANSWER-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "ANS2" ), makeSymbol( "VALUE-ANSWER-P" ) ), ConsesLow.list( makeSymbol(
                "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MAX" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "IV1" ), ConsesLow.list( makeSymbol( "FIM" ),
                    makeSymbol( "ANS1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INTERPRETED-VALUES" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "IV2" ), ConsesLow.list(
                        makeSymbol( "FIM" ), makeSymbol( "ANS2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-INTERPRETED-VALUES" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                            .list( makeSymbol( "VALUE" ), ConsesLow.list( makeSymbol( "AMOUNT-SIMILARITY" ), makeSymbol( "IV1" ), makeSymbol( "IV2" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
                                makeSymbol( ">" ), makeSymbol( "VALUE" ), makeSymbol( "MAX" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MAX" ), makeSymbol( "VALUE" ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                    "RET" ), makeSymbol( "MAX" ) ) ) );
    $sym131$VALUE_ANSWER_P = makeSymbol( "VALUE-ANSWER-P" );
    $sym132$VALUE_ANSWER_SIMILARITY_METHOD = makeSymbol( "VALUE-ANSWER-SIMILARITY-METHOD" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "RANDOM-ELEMENT" ), makeSymbol( "ANSWERS" ) ) ) );
    $sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol( "VALUE-ANSWER-TYPICAL-INSTANCE-METHOD" );
    $sym135$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym136$SENTENCE_ANSWER = makeSymbol( "SENTENCE-ANSWER" );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "REQUIRE-SIMILARITY" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol(
        "TYPICAL-INSTANCE" ), ConsesLow.list( makeSymbol( "ANSWERS" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS" );
    $sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE" );
    $sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD = makeSymbol( "SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD" );
    $list141 = ConsesLow.list( makeString( "@param ANSWERS listp\n   @return answer-p; the most typical answer among ANSWERS" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list(
        makeSymbol( "FCM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAX-INSTANCES" ) ), makeSymbol( "ANSWERS" ) ) ) ) );
    $sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol( "SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD" );
    $list143 = ConsesLow.list( makeString( "Prints this answer to STREAM, ignoring DEPTH" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
        "#<SENTENCE-ANSWER for " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "INFO-REQUEST" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "WRITE-STRING" ), makeString(
            ": " ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "PRIN1" ), makeSymbol( "CONTENT" ), makeSymbol( "STREAM" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                " (~,2F/~,2F)" ), makeSymbol( "CONFIDENCE" ), makeSymbol( "RELEVANCE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SENTENCE-ANSWER-METHOD" );
    $str145$__SENTENCE_ANSWER_for_ = makeString( "#<SENTENCE-ANSWER for " );
    $sym146$SENTENCE_ANSWER_PRINT_METHOD = makeSymbol( "SENTENCE-ANSWER-PRINT-METHOD" );
    $sym147$STRINGP = makeSymbol( "STRINGP" );
    $sym148$STANFORD_PARSER = makeSymbol( "STANFORD-PARSER" );
    $sym149$GET_PARSER = makeSymbol( "GET-PARSER" );
    $kw150$NP = makeKeyword( "NP" );
    $sym151$GET_CATEGORY = makeSymbol( "GET-CATEGORY" );
    $sym152$GET_HEAD = makeSymbol( "GET-HEAD" );
    $kw153$NNS = makeKeyword( "NNS" );
    $str154$are = makeString( "are" );
    $str155$is = makeString( "is" );
  }
}
/*
 * 
 * Total time: 414 ms
 * 
 */