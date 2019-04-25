package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_after_addings
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.lexicon_after_addings";
  public static final String myFingerPrint = "bab348f90c9e8f754ca44276a611a04696a8f503edf46574623ae0986f128894";
  private static final SubLSymbol $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLObject $const3$partOfSpeech;
  private static final SubLSymbol $sym4$CSETQ;
  private static final SubLString $str5$_A;
  private static final SubLObject $const6$UnitOfMeasure;
  private static final SubLSymbol $sym7$_EXIT;
  private static final SubLSymbol $sym8$ADD_LEXICON_PREDICATE;
  private static final SubLSymbol $kw9$TRUE;
  private static final SubLSymbol $sym10$REMOVE_LEXICON_PREDICATE;
  private static final SubLSymbol $sym11$ADD_SEMANTIC_ASSERTION;
  private static final SubLSymbol $sym12$REMOVE_SEMANTIC_ASSERTION;
  private static final SubLSymbol $sym13$ADD_INDEX_SUB_WORDS_FOR_ARG;
  private static final SubLSymbol $sym14$REMOVE_INDEX_SUB_WORDS_FOR_ARG;
  private static final SubLSymbol $sym15$ADD_SUB_WORD_INDEXED_ASSERTION;
  private static final SubLSymbol $sym16$REMOVE_SUB_WORD_INDEXED_ASSERTION;
  private static final SubLSymbol $sym17$ADD_GENERATION_ASSERTION;
  private static final SubLSymbol $sym18$REMOVE_GENERATION_ASSERTION;
  private static final SubLSymbol $sym19$ADD_PRAGMATIC_ASSERTION;
  private static final SubLSymbol $sym20$REMOVE_PRAGMATIC_ASSERTION;
  private static final SubLSymbol $sym21$ADD_DETERMINER_AGREEMENT;
  private static final SubLSymbol $sym22$REMOVE_DETERMINER_AGREEMENT;
  private static final SubLSymbol $sym23$ADD_SPEECH_PART_PREDS;
  private static final SubLSymbol $sym24$REMOVE_SPEECH_PART_PREDS;
  private static final SubLSymbol $sym25$ADD_REGULAR_SUFFIX;
  private static final SubLSymbol $sym26$REMOVE_REGULAR_SUFFIX;
  private static final SubLSymbol $sym27$ADD_DERIVATIONAL_AFFIX_BASE_POS;
  private static final SubLSymbol $sym28$REMOVE_DERIVATIONAL_AFFIX_BASE_POS;
  private static final SubLSymbol $sym29$ADD_DERIVATIONAL_AFFIX_RESULT_POS;
  private static final SubLSymbol $sym30$REMOVE_DERIVATIONAL_AFFIX_RESULT_POS;
  private static final SubLSymbol $sym31$ADD_AFFIX_SEMANTICS;
  private static final SubLSymbol $sym32$REMOVE_AFFIX_SEMANTICS;
  private static final SubLSymbol $sym33$ADD_AFFIX_STRING;
  private static final SubLSymbol $sym34$REMOVE_AFFIX_STRING;
  private static final SubLSymbol $sym35$ADD_BASIC_SPEECH_PART_PRED;
  private static final SubLSymbol $sym36$REMOVE_BASIC_SPEECH_PART_PRED;

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 1048L)
  public static SubLObject add_lexicon_predicate(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject message_var = NIL;
    SubLObject was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg0( assertion ), $const3$partOfSpeech ) )
            {
              lexicon_accessors.clear_closed_lexical_class_hash();
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    message_var = NIL;
    was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            nl_trie.augment_nl_trie_syntactic( assertion, UNPROVIDED );
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    message_var = NIL;
    was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            lexicon_accessors.clear_preds_of_stringXword();
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    message_var = NIL;
    was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            np_parser.clear_npp_caches();
            final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached( assertions_high.gaf_arg0( assertion ) );
            SubLObject cdolist_list_var;
            final SubLObject denotations = cdolist_list_var = lexicon_accessors.denots_of_wu( cycl_utilities.formula_arg( assertion, wu_arg, UNPROVIDED ), UNPROVIDED );
            SubLObject denot = NIL;
            denot = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              if( NIL != isa.isaP( denot, $const6$UnitOfMeasure, UNPROVIDED, UNPROVIDED ) )
              {
                english_quantity_parser.add_english_units_for_measure( denot );
              }
              cdolist_list_var = cdolist_list_var.rest();
              denot = cdolist_list_var.first();
            }
            return NIL;
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 2036L)
  public static SubLObject remove_lexicon_predicate(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_accessors.assertion_still_thereP( assertion, $kw9$TRUE ) )
    {
      SubLObject message_var = NIL;
      SubLObject was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              if( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg0( assertion ), $const3$partOfSpeech ) )
              {
                lexicon_accessors.clear_closed_lexical_class_hash();
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              nl_trie.prune_nl_trie_syntactic( assertion, UNPROVIDED );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              lexicon_accessors.clear_preds_of_stringXword();
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              np_parser.clear_npp_caches();
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values4 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values4 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              final SubLObject wu_arg = lexicon_utilities.wu_arg_of_pred_cached( assertions_high.gaf_arg0( assertion ) );
              SubLObject cdolist_list_var;
              final SubLObject denotations = cdolist_list_var = lexicon_accessors.denots_of_wu( cycl_utilities.formula_arg( assertion, wu_arg, UNPROVIDED ), UNPROVIDED );
              SubLObject denot = NIL;
              denot = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                if( NIL != isa.isaP( denot, $const6$UnitOfMeasure, UNPROVIDED, UNPROVIDED ) )
                {
                  english_quantity_parser.clear_english_units_of_measure( denot );
                }
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 2874L)
  public static SubLObject add_semantic_assertion(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    lexicon_vars.clear_verb_frames();
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    final SubLObject v_term = lexicon_utilities.term_from_nl_assertion( assertion );
    SubLObject message_var = NIL;
    SubLObject was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            lexicon_utilities.clear_lexical_info_caches( v_term );
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    message_var = NIL;
    was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            np_parser.clear_npp_caches();
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    message_var = NIL;
    was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
    Eval.eval( $list1 );
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            if( NIL != isa.isaP( v_term, $const6$UnitOfMeasure, UNPROVIDED, UNPROVIDED ) )
            {
              english_quantity_parser.add_english_units_for_measure( v_term );
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
        message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    if( message_var.isString() )
    {
      Errors.warn( $str5$_A, message_var );
    }
    final SubLObject _prev_bind_5 = lexicon_vars.$initialize_nl_trie_control_varsP$.currentBinding( thread );
    try
    {
      lexicon_vars.$initialize_nl_trie_control_varsP$.bind( NIL, thread );
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              thread.resetMultipleValues();
              final SubLObject ret_value = nl_trie.augment_nl_trie_semantic( assertion, UNPROVIDED );
              final SubLObject strings = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var = strings;
              SubLObject string = NIL;
              string = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject message_var_$2 = NIL;
                final SubLObject was_appendingP_$3 = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                Eval.eval( $list1 );
                try
                {
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        lexicon_subword_index.reset_nl_trie_subword_index_for_string( string, NIL );
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    message_var_$2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP_$3 ) );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                  }
                }
                if( message_var_$2.isString() )
                {
                  Errors.warn( $str5$_A, message_var_$2 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
              }
            }
            catch( final Throwable catch_var )
            {
              Errors.handleThrowable( catch_var, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_0_$1, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
    }
    finally
    {
      lexicon_vars.$initialize_nl_trie_control_varsP$.rebind( _prev_bind_5, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 3913L)
  public static SubLObject remove_semantic_assertion(final SubLObject argument, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == kb_accessors.assertion_still_thereP( assertion, $kw9$TRUE ) )
    {
      pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
      final SubLObject v_term = lexicon_utilities.term_from_nl_assertion( assertion );
      SubLObject message_var = NIL;
      SubLObject was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              lexicon_utilities.clear_lexical_info_caches( v_term );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              np_parser.clear_npp_caches();
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      message_var = NIL;
      was_appendingP = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              if( NIL != isa.isaP( v_term, $const6$UnitOfMeasure, UNPROVIDED, UNPROVIDED ) )
              {
                english_quantity_parser.clear_english_units_of_measure( UNPROVIDED );
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
          message_var = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values3 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP ) );
          Values.restoreValuesFromVector( _values3 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
        }
      }
      if( message_var.isString() )
      {
        Errors.warn( $str5$_A, message_var );
      }
      SubLObject message_var2 = NIL;
      final SubLObject was_appendingP2 = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
      Eval.eval( $list1 );
      try
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_5 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              thread.resetMultipleValues();
              final SubLObject ret_value = nl_trie.prune_nl_trie_semantic( assertion, UNPROVIDED );
              final SubLObject strings = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject cdolist_list_var = strings;
              SubLObject string = NIL;
              string = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject message_var_$7 = NIL;
                final SubLObject was_appendingP_$8 = Eval.eval( $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ );
                Eval.eval( $list1 );
                try
                {
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$9 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym2$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        lexicon_subword_index.reset_nl_trie_subword_index_for_string( string, T );
                      }
                      catch( final Throwable catch_var2 )
                      {
                        Errors.handleThrowable( catch_var2, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var2 )
                  {
                    message_var_$7 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values4 = Values.getValuesAsVector();
                    Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP_$8 ) );
                    Values.restoreValuesFromVector( _values4 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                  }
                }
                if( message_var_$7.isString() )
                {
                  Errors.warn( $str5$_A, message_var_$7 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
              }
            }
            catch( final Throwable catch_var3 )
            {
              Errors.handleThrowable( catch_var3, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( _prev_bind_5, thread );
          }
        }
        catch( final Throwable ccatch_env_var3 )
        {
          message_var2 = Errors.handleThrowable( ccatch_env_var3, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
      finally
      {
        final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          Eval.eval( ConsesLow.list( $sym4$CSETQ, $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2 ) );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
        }
      }
      if( message_var2.isString() )
      {
        Errors.warn( $str5$_A, message_var2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 4703L)
  public static SubLObject add_index_sub_words_for_arg(final SubLObject argument, final SubLObject assertion)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 5047L)
  public static SubLObject remove_index_sub_words_for_arg(final SubLObject argument, final SubLObject assertion)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 5297L)
  public static SubLObject add_sub_word_indexed_assertion(final SubLObject argument, final SubLObject assertion)
  {
    SubLObject cdolist_list_var = lexicon_subword_index.non_trie_subword_pred_args( assertions_high.gaf_arg0( assertion ) );
    SubLObject n = NIL;
    n = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject string = assertions_high.gaf_arg( assertion, n );
      if( NIL != cycl_string.cycl_string_p( string ) )
      {
        lexicon_subword_index.reset_nl_trie_subword_index_for_string( string, NIL );
      }
      cdolist_list_var = cdolist_list_var.rest();
      n = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 5604L)
  public static SubLObject remove_sub_word_indexed_assertion(final SubLObject argument, final SubLObject assertion)
  {
    SubLObject cdolist_list_var = lexicon_subword_index.non_trie_subword_pred_args( assertions_high.gaf_arg0( assertion ) );
    SubLObject n = NIL;
    n = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject string = assertions_high.gaf_arg( assertion, n );
      if( NIL != cycl_string.cycl_string_p( string ) )
      {
        lexicon_subword_index.reset_nl_trie_subword_index_for_string( string, T );
      }
      cdolist_list_var = cdolist_list_var.rest();
      n = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 5914L)
  public static SubLObject add_generation_assertion(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_vars.clear_verb_frames();
    np_parser.clear_npp_caches();
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    final SubLObject v_term = lexicon_utilities.term_from_nl_assertion( assertion );
    lexicon_utilities.clear_lexical_info_caches( v_term );
    if( NIL != assertion_utilities.meta_assertion_p( assertion ) && NIL != fort_types_interface.isa_relationP( v_term, UNPROVIDED ) )
    {
      pph_templates.reinitialize_gen_templates_for_reln( v_term, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 6499L)
  public static SubLObject remove_generation_assertion(final SubLObject argument, final SubLObject assertion)
  {
    if( NIL == kb_accessors.assertion_still_thereP( assertion, $kw9$TRUE ) )
    {
      np_parser.clear_npp_caches();
      pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
      final SubLObject v_term = lexicon_utilities.term_from_nl_assertion( assertion );
      lexicon_utilities.clear_lexical_info_caches( v_term );
      if( NIL != assertion_utilities.meta_assertion_p( assertion ) && NIL != fort_types_interface.isa_relationP( v_term, UNPROVIDED ) )
      {
        pph_templates.reinitialize_gen_templates_for_reln( v_term, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 7049L)
  public static SubLObject add_pragmatic_assertion(final SubLObject argument, final SubLObject assertion)
  {
    final SubLObject semantic_assertion = assertions_high.gaf_arg1( assertion );
    nl_trie.retriefy_semantic_assertion( semantic_assertion, UNPROVIDED );
    np_parser.clear_npp_caches();
    pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 7481L)
  public static SubLObject remove_pragmatic_assertion(final SubLObject argument, final SubLObject assertion)
  {
    if( NIL == kb_accessors.assertion_still_thereP( assertion, $kw9$TRUE ) )
    {
      final SubLObject semantic_assertion = assertions_high.gaf_arg1( assertion );
      nl_trie.retriefy_semantic_assertion( semantic_assertion, UNPROVIDED );
      np_parser.clear_npp_caches();
      pph_main.clear_paraphrase_caches( UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 7910L)
  public static SubLObject add_determiner_agreement(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_agr_of_det_string();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 8349L)
  public static SubLObject remove_determiner_agreement(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_agr_of_det_string();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 8540L)
  public static SubLObject add_speech_part_preds(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_derived_preds();
    lexicon_accessors.initialize_speech_part_caches();
    nl_trie.clear_nl_trie_closed_class_pos_preds();
    lexicon_utilities.clear_preds_of_pos();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 8875L)
  public static SubLObject remove_speech_part_preds(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_derived_preds();
    lexicon_accessors.initialize_speech_part_caches();
    nl_trie.clear_nl_trie_closed_class_pos_preds();
    lexicon_utilities.clear_preds_of_pos();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 9153L)
  public static SubLObject add_regular_suffix(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_derived_preds();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 9379L)
  public static SubLObject remove_regular_suffix(final SubLObject argument, final SubLObject assertion)
  {
    lexicon_accessors.clear_derived_preds();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 9554L)
  public static SubLObject add_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_base_poses_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 9872L)
  public static SubLObject remove_derivational_affix_base_pos(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_base_poses_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 10126L)
  public static SubLObject add_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_result_poses_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 10452L)
  public static SubLObject remove_derivational_affix_result_pos(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_result_poses_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 10712L)
  public static SubLObject add_affix_semantics(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_sem_templates_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 11001L)
  public static SubLObject remove_affix_semantics(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    mwp_rule.clear_mwp_sem_templates_for_reified_affix();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 11236L)
  public static SubLObject add_affix_string(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 11468L)
  public static SubLObject remove_affix_string(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 11651L)
  public static SubLObject add_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    morph_word.clear_mwp_base_pred_of_pos();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lexicon-after-addings.lisp", position = 11939L)
  public static SubLObject remove_basic_speech_part_pred(final SubLObject argument, final SubLObject assertion)
  {
    morphological_word_parser.note_mwp_needs_reinitialization();
    morph_word.clear_mwp_base_pred_of_pos();
    return NIL;
  }

  public static SubLObject declare_lexicon_after_addings_file()
  {
    SubLFiles.declareFunction( me, "add_lexicon_predicate", "ADD-LEXICON-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_lexicon_predicate", "REMOVE-LEXICON-PREDICATE", 2, 0, false );
    SubLFiles.declareFunction( me, "add_semantic_assertion", "ADD-SEMANTIC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_semantic_assertion", "REMOVE-SEMANTIC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "add_index_sub_words_for_arg", "ADD-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_index_sub_words_for_arg", "REMOVE-INDEX-SUB-WORDS-FOR-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "add_sub_word_indexed_assertion", "ADD-SUB-WORD-INDEXED-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_sub_word_indexed_assertion", "REMOVE-SUB-WORD-INDEXED-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "add_generation_assertion", "ADD-GENERATION-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_generation_assertion", "REMOVE-GENERATION-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "add_pragmatic_assertion", "ADD-PRAGMATIC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_pragmatic_assertion", "REMOVE-PRAGMATIC-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "add_determiner_agreement", "ADD-DETERMINER-AGREEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_determiner_agreement", "REMOVE-DETERMINER-AGREEMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "add_speech_part_preds", "ADD-SPEECH-PART-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_speech_part_preds", "REMOVE-SPEECH-PART-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_regular_suffix", "ADD-REGULAR-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_regular_suffix", "REMOVE-REGULAR-SUFFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "add_derivational_affix_base_pos", "ADD-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_derivational_affix_base_pos", "REMOVE-DERIVATIONAL-AFFIX-BASE-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_derivational_affix_result_pos", "ADD-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_derivational_affix_result_pos", "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_affix_semantics", "ADD-AFFIX-SEMANTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_affix_semantics", "REMOVE-AFFIX-SEMANTICS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_affix_string", "ADD-AFFIX-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_affix_string", "REMOVE-AFFIX-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "add_basic_speech_part_pred", "ADD-BASIC-SPEECH-PART-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_basic_speech_part_pred", "REMOVE-BASIC-SPEECH-PART-PRED", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_lexicon_after_addings_file()
  {
    return NIL;
  }

  public static SubLObject setup_lexicon_after_addings_file()
  {
    utilities_macros.register_kb_function( $sym8$ADD_LEXICON_PREDICATE );
    utilities_macros.register_kb_function( $sym10$REMOVE_LEXICON_PREDICATE );
    utilities_macros.register_kb_function( $sym11$ADD_SEMANTIC_ASSERTION );
    utilities_macros.register_kb_function( $sym12$REMOVE_SEMANTIC_ASSERTION );
    utilities_macros.register_kb_function( $sym13$ADD_INDEX_SUB_WORDS_FOR_ARG );
    utilities_macros.register_kb_function( $sym14$REMOVE_INDEX_SUB_WORDS_FOR_ARG );
    utilities_macros.register_kb_function( $sym15$ADD_SUB_WORD_INDEXED_ASSERTION );
    utilities_macros.register_kb_function( $sym16$REMOVE_SUB_WORD_INDEXED_ASSERTION );
    utilities_macros.register_kb_function( $sym17$ADD_GENERATION_ASSERTION );
    utilities_macros.register_kb_function( $sym18$REMOVE_GENERATION_ASSERTION );
    utilities_macros.register_kb_function( $sym19$ADD_PRAGMATIC_ASSERTION );
    utilities_macros.register_kb_function( $sym20$REMOVE_PRAGMATIC_ASSERTION );
    utilities_macros.register_kb_function( $sym21$ADD_DETERMINER_AGREEMENT );
    utilities_macros.register_kb_function( $sym22$REMOVE_DETERMINER_AGREEMENT );
    utilities_macros.register_kb_function( $sym23$ADD_SPEECH_PART_PREDS );
    utilities_macros.register_kb_function( $sym24$REMOVE_SPEECH_PART_PREDS );
    utilities_macros.register_kb_function( $sym25$ADD_REGULAR_SUFFIX );
    utilities_macros.register_kb_function( $sym26$REMOVE_REGULAR_SUFFIX );
    utilities_macros.register_kb_function( $sym27$ADD_DERIVATIONAL_AFFIX_BASE_POS );
    utilities_macros.register_kb_function( $sym28$REMOVE_DERIVATIONAL_AFFIX_BASE_POS );
    utilities_macros.register_kb_function( $sym29$ADD_DERIVATIONAL_AFFIX_RESULT_POS );
    utilities_macros.register_kb_function( $sym30$REMOVE_DERIVATIONAL_AFFIX_RESULT_POS );
    utilities_macros.register_kb_function( $sym31$ADD_AFFIX_SEMANTICS );
    utilities_macros.register_kb_function( $sym32$REMOVE_AFFIX_SEMANTICS );
    utilities_macros.register_kb_function( $sym33$ADD_AFFIX_STRING );
    utilities_macros.register_kb_function( $sym34$REMOVE_AFFIX_STRING );
    utilities_macros.register_kb_function( $sym35$ADD_BASIC_SPEECH_PART_PRED );
    utilities_macros.register_kb_function( $sym36$REMOVE_BASIC_SPEECH_PART_PRED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_lexicon_after_addings_file();
  }

  @Override
  public void initializeVariables()
  {
    init_lexicon_after_addings_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_lexicon_after_addings_file();
  }
  static
  {
    me = new lexicon_after_addings();
    $sym0$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" );
    $list1 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL );
    $sym2$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $const3$partOfSpeech = constant_handles.reader_make_constant_shell( makeString( "partOfSpeech" ) );
    $sym4$CSETQ = makeSymbol( "CSETQ" );
    $str5$_A = makeString( "~A" );
    $const6$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
    $sym7$_EXIT = makeSymbol( "%EXIT" );
    $sym8$ADD_LEXICON_PREDICATE = makeSymbol( "ADD-LEXICON-PREDICATE" );
    $kw9$TRUE = makeKeyword( "TRUE" );
    $sym10$REMOVE_LEXICON_PREDICATE = makeSymbol( "REMOVE-LEXICON-PREDICATE" );
    $sym11$ADD_SEMANTIC_ASSERTION = makeSymbol( "ADD-SEMANTIC-ASSERTION" );
    $sym12$REMOVE_SEMANTIC_ASSERTION = makeSymbol( "REMOVE-SEMANTIC-ASSERTION" );
    $sym13$ADD_INDEX_SUB_WORDS_FOR_ARG = makeSymbol( "ADD-INDEX-SUB-WORDS-FOR-ARG" );
    $sym14$REMOVE_INDEX_SUB_WORDS_FOR_ARG = makeSymbol( "REMOVE-INDEX-SUB-WORDS-FOR-ARG" );
    $sym15$ADD_SUB_WORD_INDEXED_ASSERTION = makeSymbol( "ADD-SUB-WORD-INDEXED-ASSERTION" );
    $sym16$REMOVE_SUB_WORD_INDEXED_ASSERTION = makeSymbol( "REMOVE-SUB-WORD-INDEXED-ASSERTION" );
    $sym17$ADD_GENERATION_ASSERTION = makeSymbol( "ADD-GENERATION-ASSERTION" );
    $sym18$REMOVE_GENERATION_ASSERTION = makeSymbol( "REMOVE-GENERATION-ASSERTION" );
    $sym19$ADD_PRAGMATIC_ASSERTION = makeSymbol( "ADD-PRAGMATIC-ASSERTION" );
    $sym20$REMOVE_PRAGMATIC_ASSERTION = makeSymbol( "REMOVE-PRAGMATIC-ASSERTION" );
    $sym21$ADD_DETERMINER_AGREEMENT = makeSymbol( "ADD-DETERMINER-AGREEMENT" );
    $sym22$REMOVE_DETERMINER_AGREEMENT = makeSymbol( "REMOVE-DETERMINER-AGREEMENT" );
    $sym23$ADD_SPEECH_PART_PREDS = makeSymbol( "ADD-SPEECH-PART-PREDS" );
    $sym24$REMOVE_SPEECH_PART_PREDS = makeSymbol( "REMOVE-SPEECH-PART-PREDS" );
    $sym25$ADD_REGULAR_SUFFIX = makeSymbol( "ADD-REGULAR-SUFFIX" );
    $sym26$REMOVE_REGULAR_SUFFIX = makeSymbol( "REMOVE-REGULAR-SUFFIX" );
    $sym27$ADD_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol( "ADD-DERIVATIONAL-AFFIX-BASE-POS" );
    $sym28$REMOVE_DERIVATIONAL_AFFIX_BASE_POS = makeSymbol( "REMOVE-DERIVATIONAL-AFFIX-BASE-POS" );
    $sym29$ADD_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol( "ADD-DERIVATIONAL-AFFIX-RESULT-POS" );
    $sym30$REMOVE_DERIVATIONAL_AFFIX_RESULT_POS = makeSymbol( "REMOVE-DERIVATIONAL-AFFIX-RESULT-POS" );
    $sym31$ADD_AFFIX_SEMANTICS = makeSymbol( "ADD-AFFIX-SEMANTICS" );
    $sym32$REMOVE_AFFIX_SEMANTICS = makeSymbol( "REMOVE-AFFIX-SEMANTICS" );
    $sym33$ADD_AFFIX_STRING = makeSymbol( "ADD-AFFIX-STRING" );
    $sym34$REMOVE_AFFIX_STRING = makeSymbol( "REMOVE-AFFIX-STRING" );
    $sym35$ADD_BASIC_SPEECH_PART_PRED = makeSymbol( "ADD-BASIC-SPEECH-PART-PRED" );
    $sym36$REMOVE_BASIC_SPEECH_PART_PRED = makeSymbol( "REMOVE-BASIC-SPEECH-PART-PRED" );
  }
}
/*
 * 
 * Total time: 1011 ms
 * 
 */