package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inverted_index_query_library
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inverted_index_query_library";
  public static final String myFingerPrint = "4b88b00461aee3a12e5af9a66ce5b6d665d116e9bd387c78558b00c615945054";
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  private static SubLSymbol $query_index_index_generationP$;
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLSymbol $ql_search_weight_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  private static SubLSymbol $min_query_weight$;
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9190L)
  private static SubLSymbol $query_template_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9269L)
  private static SubLSymbol $ql_ir_search_disabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9322L)
  private static SubLSymbol $ql_build_index_in_memory$;
  private static final SubLSymbol $sym0$QUERY_TEMPLATE_INVERTED_INDEX;
  private static final SubLSymbol $sym1$INVERTED_INDEX;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$PHYSICAL_INDEX;
  private static final SubLSymbol $sym9$INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym10$VALUE_TEST;
  private static final SubLSymbol $sym11$INDEXED_ITEMS;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC;
  private static final SubLSymbol $sym13$INITIALIZE;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym17$SET_INDEX;
  private static final SubLSymbol $sym18$IN_MEMORY_EQUALP_INDEX;
  private static final SubLSymbol $sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD;
  private static final SubLSymbol $sym20$LOOKUP;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_;
  private static final SubLSymbol $sym26$_;
  private static final SubLSymbol $sym27$SECOND;
  private static final SubLSymbol $sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD;
  private static final SubLFloat $float29$0_5;
  private static final SubLSymbol $sym30$NORMALIZED_WEIGHT_TOO_LOW_;
  private static final SubLSymbol $sym31$REMOVE_KEY;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym35$COMPUTE_INDEX_ENTRIES;
  private static final SubLSymbol $sym36$REMOVE_VALUE;
  private static final SubLSymbol $sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym41$REMOVE;
  private static final SubLSymbol $sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD;
  private static final SubLSymbol $sym43$INDEX_ALL_QUERIES_IN_FOLDER;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLObject $const46$InferencePSC;
  private static final SubLSymbol $sym47$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym48$INDEX_AN_ITEM;
  private static final SubLSymbol $kw49$NEW;
  private static final SubLSymbol $sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD;
  private static final SubLSymbol $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $kw54$TEMPLATE;
  private static final SubLSymbol $kw55$QUERY_GLOSS;
  private static final SubLSymbol $kw56$FORMULA;
  private static final SubLSymbol $sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$PARENT_INDEX;
  private static final SubLSymbol $sym60$GENERATION_DOMAIN_MT;
  private static final SubLSymbol $sym61$GENERATION_MT;
  private static final SubLSymbol $sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C;
  private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
  private static final SubLSymbol $sym68$INVERTED_INDEX_P;
  private static final SubLSymbol $sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD;
  private static final SubLSymbol $sym70$SET_GENERATION_MT;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
  private static final SubLSymbol $sym74$HLMT_P;
  private static final SubLSymbol $sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME;
  private static final SubLSymbol $sym76$SET_GENERATION_DOMAIN_MT;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
  private static final SubLSymbol $sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI;
  private static final SubLList $list80;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH;
  private static final SubLString $str83$;
  private static final SubLSymbol $sym84$FORT_P;
  private static final SubLSymbol $sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$_QL_BUILD_INDEX_IN_MEMORY_;
  private static final SubLSymbol $kw88$PARAMETER;
  private static final SubLSymbol $sym89$BOOLEANP;
  private static final SubLSymbol $kw90$INDEXED;
  private static final SubLSymbol $kw91$INDEX_UNINITIALIZED;
  private static final SubLSymbol $sym92$FIRST;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$DISABLE_QL_IR_SEARCH;
  private static final SubLSymbol $sym95$ENABLE_QL_IR_SEARCH;
  private static final SubLObject $const96$TemplateFromTestQueryFn;
  private static final SubLObject $const97$querySpecificationForFormulaTempl;
  private static final SubLSymbol $kw98$ALLOWED_MODULES;
  private static final SubLSymbol $kw99$REMOVAL_LOOKUP_POS;
  private static final SubLSymbol $kw100$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw101$HL;
  private static final SubLSymbol $kw102$RETURN;
  private static final SubLSymbol $kw103$TRUE;
  private static final SubLList $list104;
  private static final SubLSymbol $kw105$X;
  private static final SubLObject $const106$assertedSentence;
  private static final SubLObject $const107$comment;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLObject $const110$EverythingPSC;
  private static final SubLObject $const111$formulaTemplateGloss;

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject subloop_reserved_initialize_query_template_inverted_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject subloop_reserved_initialize_query_template_inverted_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym8$PHYSICAL_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym9$INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym10$VALUE_TEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym11$INDEXED_ITEMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_p(final SubLObject query_template_inverted_index)
  {
    return classes.subloop_instanceof_class( query_template_inverted_index, $sym0$QUERY_TEMPLATE_INVERTED_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_initialize_method(final SubLObject self)
  {
    instances.set_slot( self, $sym10$VALUE_TEST, Symbols.symbol_function( EQUALP ) );
    instances.set_slot( self, $sym11$INDEXED_ITEMS, inverted_index.new_indexed_items() );
    instances.set_slot( self, $sym9$INDEX_ENTRY_COMPUTER, object.new_class_instance( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER ) );
    methods.funcall_instance_method_with_1_args( instances.get_slot( self, $sym9$INDEX_ENTRY_COMPUTER ), $sym17$SET_INDEX, self );
    instances.set_slot( self, $sym8$PHYSICAL_INDEX, object.new_class_instance( $sym18$IN_MEMORY_EQUALP_INDEX ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_lookup_method(final SubLObject self, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_method = NIL;
    final SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items( self );
    final SubLObject physical_index = inverted_index.get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
      try
      {
        final SubLObject lookup_items = key.isString() ? document.string_tokenize_via_wordify( key ) : ConsesLow.list( key );
        final SubLObject lookup_item_count = Sequences.length( Sequences.remove_if( $sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_, lookup_items, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        final SubLObject dict = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
        SubLObject scored = NIL;
        SubLObject cdolist_list_var = lookup_items;
        SubLObject key_$1 = NIL;
        key_$1 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args( physical_index, $sym20$LOOKUP, key_$1 );
          SubLObject suid = NIL;
          suid = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            final SubLObject existing_count = dictionary.dictionary_lookup( dict, suid, ZERO_INTEGER );
            dictionary.dictionary_enter( dict, suid, number_utilities.f_1X( existing_count ) );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            suid = cdolist_list_var_$2.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          key_$1 = cdolist_list_var.first();
        }
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dict ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject suid2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject score = thread.secondMultipleValue();
          thread.resetMultipleValues();
          scored = ConsesLow.cons( ConsesLow.list( inverted_index.get_item_from_index_suid( indexed_items, suid2 ), score ), scored );
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        SubLObject normalized = NIL;
        SubLObject highest_weight = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = scored;
        SubLObject item = NIL;
        item = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          final SubLObject raw_weight = conses_high.second( item );
          final SubLObject normalized_weight = Numbers.divide( raw_weight, lookup_item_count );
          if( raw_weight.numG( highest_weight ) )
          {
            highest_weight = raw_weight;
          }
          normalized = ConsesLow.cons( ConsesLow.list( item.first(), normalized_weight ), normalized );
          cdolist_list_var2 = cdolist_list_var2.rest();
          item = cdolist_list_var2.first();
        }
        normalized = remove_low_weighted_items( normalized, highest_weight, lookup_item_count );
        normalized = Sort.sort( normalized, $sym26$_, $sym27$SECOND );
        Dynamic.sublisp_throw( $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, normalized );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_indexed_items( self, indexed_items );
          inverted_index.set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_query_template_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject remove_low_weighted_items(final SubLObject items, final SubLObject max_weight, final SubLObject max_weight_possible)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $min_query_weight$.currentBinding( thread );
    try
    {
      $min_query_weight$.bind( Numbers.divide( Numbers.multiply( max_weight, $ql_search_weight_factor$.getDynamicValue( thread ) ), max_weight_possible ), thread );
      result = Sequences.remove_if( $sym30$NORMALIZED_WEIGHT_TOO_LOW_, items, $sym27$SECOND, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $min_query_weight$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject normalized_weight_too_lowP(final SubLObject weight)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numL( weight, $min_query_weight$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_remove_key_method(final SubLObject self, final SubLObject index_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_method = NIL;
    final SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer( self );
    try
    {
      thread.throwStack.push( $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
      try
      {
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args( index_entry_computer, $sym35$COMPUTE_INDEX_ENTRIES, index_key );
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          methods.funcall_instance_method_with_1_args( self, $sym36$REMOVE_VALUE, entry );
          cdolist_list_var = cdolist_list_var.rest();
          entry = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_index_entry_computer( self, index_entry_computer );
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
      catch_var_for_query_template_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_remove_value_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_method = NIL;
    final SubLObject physical_index = inverted_index.get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( physical_index, $sym41$REMOVE, index_entry );
        Dynamic.sublisp_throw( $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_query_template_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_index_all_queries_in_folder_method(final SubLObject self, final SubLObject root_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject templates = ke_interaction_folder.templates_in_folder( root_node, $const46$InferencePSC, T );
    SubLObject error = NIL;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$3 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$4 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$5 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  SubLObject cdolist_list_var = templates;
                  SubLObject template = NIL;
                  template = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    try
                    {
                      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                      final SubLObject _prev_bind_0_$7 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( $sym47$CATCH_ERROR_MESSAGE_HANDLER, thread );
                        try
                        {
                          methods.funcall_instance_method_with_1_args( self, $sym48$INDEX_AN_ITEM, template );
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$7, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                    if( NIL != error )
                    {
                      report_ql_index_initialization_error( template, error );
                      error = NIL;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    template = cdolist_list_var.first();
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$6, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$5, thread );
            }
            if( new_or_reused == $kw49$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( NIL == reuseP )
            {
              pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_index_query_with_formula_and_gloss_method(final SubLObject self, final SubLObject template, final SubLObject formula, final SubLObject gloss)
  {
    final SubLObject query_formula_encapsulated = ConsesLow.list( $kw54$TEMPLATE, template, $kw55$QUERY_GLOSS, gloss, $kw56$FORMULA, formula );
    methods.funcall_instance_method_with_1_args( self, $sym48$INDEX_AN_ITEM, query_formula_encapsulated );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject get_query_template_inverted_index_entry_computer_parent_index(final SubLObject query_template_inverted_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( query_template_inverted_index_entry_computer, THREE_INTEGER, $sym59$PARENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject set_query_template_inverted_index_entry_computer_parent_index(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( query_template_inverted_index_entry_computer, value, THREE_INTEGER, $sym59$PARENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject get_query_template_inverted_index_entry_computer_generation_domain_mt(final SubLObject query_template_inverted_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( query_template_inverted_index_entry_computer, TWO_INTEGER, $sym60$GENERATION_DOMAIN_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject set_query_template_inverted_index_entry_computer_generation_domain_mt(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( query_template_inverted_index_entry_computer, value, TWO_INTEGER, $sym60$GENERATION_DOMAIN_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject get_query_template_inverted_index_entry_computer_generation_mt(final SubLObject query_template_inverted_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( query_template_inverted_index_entry_computer, ONE_INTEGER, $sym61$GENERATION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject set_query_template_inverted_index_entry_computer_generation_mt(final SubLObject query_template_inverted_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( query_template_inverted_index_entry_computer, value, ONE_INTEGER, $sym61$GENERATION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject subloop_reserved_initialize_query_template_inverted_index_entry_computer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject subloop_reserved_initialize_query_template_inverted_index_entry_computer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym61$GENERATION_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym60$GENERATION_DOMAIN_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym59$PARENT_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_entry_computer_p(final SubLObject query_template_inverted_index_entry_computer)
  {
    return classes.subloop_instanceof_class( query_template_inverted_index_entry_computer, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = NIL;
    SubLObject parent_index = get_query_template_inverted_index_entry_computer_parent_index( self );
    try
    {
      thread.throwStack.push( $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
      try
      {
        assert NIL != inverted_index.inverted_index_p( v_inverted_index ) : v_inverted_index;
        parent_index = v_inverted_index;
        Dynamic.sublisp_throw( $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_query_template_inverted_index_entry_computer_parent_index( self, parent_index );
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
      catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = NIL;
    SubLObject generation_mt = get_query_template_inverted_index_entry_computer_generation_mt( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
      try
      {
        assert NIL != hlmt.hlmt_p( mt ) : mt;
        generation_mt = mt;
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_query_template_inverted_index_entry_computer_generation_mt( self, generation_mt );
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
      catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = NIL;
    SubLObject generation_domain_mt = get_query_template_inverted_index_entry_computer_generation_domain_mt( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
      try
      {
        assert NIL != hlmt.hlmt_p( mt ) : mt;
        generation_domain_mt = mt;
        Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_query_template_inverted_index_entry_computer_generation_domain_mt( self, generation_domain_mt );
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
      catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject query_template_inverted_index_entry_computer_compute_index_entries_method(final SubLObject self, SubLObject query_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_query_template_inverted_index_entry_computer_method = NIL;
    final SubLObject parent_index = get_query_template_inverted_index_entry_computer_parent_index( self );
    try
    {
      thread.throwStack.push( $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
      try
      {
        final SubLObject indexed_items = instances.get_slot( parent_index, $sym11$INDEXED_ITEMS );
        SubLObject query_template_query = NIL;
        SubLObject comment = NIL;
        SubLObject result = NIL;
        if( NIL != query_template_encapsulated_p( query_template ) )
        {
          query_template_query = conses_high.getf( query_template, $kw56$FORMULA, UNPROVIDED );
          comment = conses_high.getf( query_template, $kw55$QUERY_GLOSS, $str83$ );
          query_template = conses_high.getf( query_template, $kw54$TEMPLATE, UNPROVIDED );
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject query_template_query_$10 = query_and_gloss_for_formula_template( query_template, UNPROVIDED );
          final SubLObject comment_$11 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          query_template_query = query_template_query_$10;
          comment = comment_$11;
        }
        final SubLObject my_index = inverted_index.maybe_add_new_indexed_item( indexed_items, query_template );
        SubLObject cdolist_list_var = cycl_utilities.expression_gather( query_template_query, $sym84$FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( inverted_index.new_inverted_index_entry( fort, my_index ), result );
          cdolist_list_var = cdolist_list_var.rest();
          fort = cdolist_list_var.first();
        }
        if( NIL != $query_index_index_generationP$.getDynamicValue( thread ) )
        {
          cdolist_list_var = compute_inverted_index_entries_for_string( pph_question.generate_question( query_template_query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), my_index );
          SubLObject entry = NIL;
          entry = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.cons( entry, result );
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
          }
        }
        if( NIL != comment )
        {
          cdolist_list_var = compute_inverted_index_entries_for_string( comment, my_index );
          SubLObject entry = NIL;
          entry = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            result = ConsesLow.cons( entry, result );
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_query_template_inverted_index_entry_computer_parent_index( self, parent_index );
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
      catch_var_for_query_template_inverted_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_query_template_inverted_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 941L)
  public static SubLObject report_ql_index_initialization_error(final SubLObject template, final SubLObject error)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 8609L)
  public static SubLObject compute_inverted_index_entries_for_string(final SubLObject string, final SubLObject my_index)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = document.string_tokenize_via_wordify( string );
    SubLObject word = NIL;
    word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == query_template_inverted_index_stop_wordP( word ) )
      {
        result = ConsesLow.cons( inverted_index.new_inverted_index_entry( word, my_index ), result );
        final SubLObject stem = morphology.find_stem_memoized( word, UNPROVIDED );
        if( !stem.equal( word ) )
        {
          result = ConsesLow.cons( inverted_index.new_inverted_index_entry( stem, my_index ), result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      word = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9041L)
  public static SubLObject query_template_inverted_index_stop_wordP(final SubLObject string)
  {
    return string.isString() ? lexicon_utilities.denots_of_string_stop_word( string ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 9890L)
  public static SubLObject set_ql_build_index_in_memory(final SubLObject t_or_nil)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.booleanp( t_or_nil ) : t_or_nil;
    if( NIL != t_or_nil )
    {
      $ql_build_index_in_memory$.setDynamicValue( ONE_INTEGER, thread );
    }
    else
    {
      $ql_build_index_in_memory$.setDynamicValue( ZERO_INTEGER, thread );
    }
    return Equality.eql( $ql_build_index_in_memory$.getDynamicValue( thread ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10130L)
  public static SubLObject get_ql_build_index_in_memory()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Equality.eql( $ql_build_index_in_memory$.getDynamicValue( thread ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10222L)
  public static SubLObject clear_inverted_index()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $query_template_index$.getDynamicValue( thread ) )
    {
      methods.funcall_instance_method_with_0_args( $query_template_index$.getDynamicValue( thread ), $sym13$INITIALIZE );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10371L)
  public static SubLObject index_queries_from_node_in_memory(final SubLObject root_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $query_template_index$.getDynamicValue( thread ) )
    {
      $query_template_index$.setDynamicValue( object.new_class_instance( $sym0$QUERY_TEMPLATE_INVERTED_INDEX ), thread );
    }
    methods.funcall_instance_method_with_1_args( $query_template_index$.getDynamicValue( thread ), $sym43$INDEX_ALL_QUERIES_IN_FOLDER, root_node );
    return $kw90$INDEXED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10663L)
  public static SubLObject add_template_with_formula_and_gloss_in_memory(final SubLObject template, final SubLObject formula, final SubLObject gloss)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != query_template_inverted_index_p( $query_template_index$.getDynamicValue( thread ) ) )
    {
      methods.funcall_instance_method_with_3_args( $query_template_index$.getDynamicValue( thread ), $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, template, formula, gloss );
      return $kw90$INDEXED;
    }
    return $kw91$INDEX_UNINITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 10978L)
  public static SubLObject indexed_queries_from_string_in_memory(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == ql_ir_search_allowedP() )
    {
      return NIL;
    }
    return Mapping.mapcar( $sym92$FIRST, methods.funcall_instance_method_with_1_args( $query_template_index$.getDynamicValue( thread ), $sym20$LOOKUP, string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11180L)
  public static SubLObject indexed_queries_from_string_with_confidences_in_memory(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == ql_ir_search_allowedP() )
    {
      return NIL;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args( $query_template_index$.getDynamicValue( thread ), $sym20$LOOKUP, string );
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject cycl = NIL;
      SubLObject weight = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
      cycl = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
      weight = current.first();
      current = current.rest();
      if( NIL == current )
      {
        result = ConsesLow.cons( query_library_utils.new_ql_parse( cycl, weight, UNPROVIDED ), result );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list93 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11605L)
  public static SubLObject disable_ql_ir_search()
  {
    $ql_ir_search_disabledP$.setDynamicValue( T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 11845L)
  public static SubLObject enable_ql_ir_search()
  {
    $ql_ir_search_disabledP$.setDynamicValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12080L)
  public static SubLObject ql_ir_search_allowedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ql_ir_search_disabledP() )
    {
      return NIL;
    }
    if( ( NIL != get_ql_build_index_in_memory() && NIL != inverted_index.inverted_index_p( $query_template_index$.getDynamicValue( thread ) ) ) || NIL == get_ql_build_index_in_memory() )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12342L)
  public static SubLObject ql_ir_search_disabledP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_ir_search_disabledP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12418L)
  public static SubLObject test_query_for_template(final SubLObject template, final SubLObject mt)
  {
    if( NIL != nart_handles.nart_p( template ) && cycl_utilities.nat_functor( template ).eql( $const96$TemplateFromTestQueryFn ) )
    {
      return cycl_utilities.nat_arg1( template, UNPROVIDED );
    }
    final SubLObject var = variables.get_variable( ZERO_INTEGER );
    return backward.removal_ask_variable( var, ConsesLow.list( $const97$querySpecificationForFormulaTempl, template, var ), mt, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 12763L)
  public static SubLObject cycl_for_test_query_new(final SubLObject test_query, final SubLObject mt)
  {
    final SubLObject var = variables.get_variable( ZERO_INTEGER );
    final SubLObject v_properties = ConsesLow.list( $kw98$ALLOWED_MODULES, $kw99$REMOVAL_LOOKUP_POS, $kw100$ANSWER_LANGUAGE, $kw101$HL, $kw102$RETURN, ConsesLow.list( $kw54$TEMPLATE, var ) );
    final SubLObject dnf = ConsesLow.list( NIL, ConsesLow.list( kb_query.kbq_askable_query_spec_sentence( var, test_query, T ) ) );
    return inference_kernel.new_cyc_query_from_dnf( dnf, mt, NIL, v_properties ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13114L)
  public static SubLObject cycl_for_test_query(final SubLObject test_query, final SubLObject mt)
  {
    final SubLObject var = variables.get_variable( ZERO_INTEGER );
    return backward.removal_ask_variable( var, kb_query.kbq_askable_query_spec_sentence( var, test_query, T ), mt, $kw103$TRUE, $list104 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13567L)
  public static SubLObject comment_for_test_query(final SubLObject test_query, final SubLObject mt)
  {
    return ask_utilities.query_variable( $kw105$X, ConsesLow.list( $const106$assertedSentence, ConsesLow.listS( $const107$comment, test_query, $list108 ) ), mt, $list109 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 13889L)
  public static SubLObject query_and_gloss_for_formula_template(final SubLObject formula_template, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const110$EverythingPSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nartified_template = czer_main.canonicalize_term( formula_template, UNPROVIDED );
    final SubLObject test_query = test_query_for_template( nartified_template, mt );
    SubLObject comment = NIL;
    SubLObject query = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      comment = kb_mapping_utilities.fpred_value( nartified_template, $const111$formulaTemplateGloss, ONE_INTEGER, TWO_INTEGER, $kw103$TRUE );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( NIL != test_query )
    {
      query = cycl_for_test_query( test_query, mt );
    }
    return Values.values( query, comment );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index-query-library.lisp", position = 14678L)
  public static SubLObject query_template_encapsulated_p(final SubLObject obj)
  {
    return makeBoolean( NIL != list_utilities.property_list_p( obj ) && NIL != conses_high.getf( obj, $kw56$FORMULA, UNPROVIDED ) && NIL != conses_high.getf( obj, $kw54$TEMPLATE, UNPROVIDED ) );
  }

  public static SubLObject declare_inverted_index_query_library_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_query_template_inverted_index_class", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_query_template_inverted_index_instance", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_p", "QUERY-TEMPLATE-INVERTED-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_initialize_method", "QUERY-TEMPLATE-INVERTED-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_lookup_method", "QUERY-TEMPLATE-INVERTED-INDEX-LOOKUP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_low_weighted_items", "REMOVE-LOW-WEIGHTED-ITEMS", 3, 0, false );
    SubLFiles.declareFunction( me, "normalized_weight_too_lowP", "NORMALIZED-WEIGHT-TOO-LOW?", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_remove_key_method", "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_remove_value_method", "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-VALUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_index_all_queries_in_folder_method", "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-ALL-QUERIES-IN-FOLDER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_index_query_with_formula_and_gloss_method", "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-QUERY-WITH-FORMULA-AND-GLOSS-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "get_query_template_inverted_index_entry_computer_parent_index", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_query_template_inverted_index_entry_computer_parent_index", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_query_template_inverted_index_entry_computer_generation_domain_mt", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_query_template_inverted_index_entry_computer_generation_domain_mt", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_query_template_inverted_index_entry_computer_generation_mt", "GET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_query_template_inverted_index_entry_computer_generation_mt", "SET-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_query_template_inverted_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_query_template_inverted_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_entry_computer_p", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_entry_computer_set_index_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_entry_computer_set_generation_mt_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_entry_computer_set_generation_domain_mt_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_entry_computer_compute_index_entries_method", "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "report_ql_index_initialization_error", "REPORT-QL-INDEX-INITIALIZATION-ERROR", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_inverted_index_entries_for_string", "COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING", 2, 0, false );
    SubLFiles.declareFunction( me, "query_template_inverted_index_stop_wordP", "QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_ql_build_index_in_memory", "SET-QL-BUILD-INDEX-IN-MEMORY", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_build_index_in_memory", "GET-QL-BUILD-INDEX-IN-MEMORY", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_inverted_index", "CLEAR-INVERTED-INDEX", 0, 0, false );
    SubLFiles.declareFunction( me, "index_queries_from_node_in_memory", "INDEX-QUERIES-FROM-NODE-IN-MEMORY", 1, 0, false );
    SubLFiles.declareFunction( me, "add_template_with_formula_and_gloss_in_memory", "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS-IN-MEMORY", 3, 0, false );
    SubLFiles.declareFunction( me, "indexed_queries_from_string_in_memory", "INDEXED-QUERIES-FROM-STRING-IN-MEMORY", 1, 0, false );
    SubLFiles.declareFunction( me, "indexed_queries_from_string_with_confidences_in_memory", "INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES-IN-MEMORY", 1, 0, false );
    SubLFiles.declareFunction( me, "disable_ql_ir_search", "DISABLE-QL-IR-SEARCH", 0, 0, false );
    SubLFiles.declareFunction( me, "enable_ql_ir_search", "ENABLE-QL-IR-SEARCH", 0, 0, false );
    SubLFiles.declareFunction( me, "ql_ir_search_allowedP", "QL-IR-SEARCH-ALLOWED?", 0, 0, false );
    SubLFiles.declareFunction( me, "ql_ir_search_disabledP", "QL-IR-SEARCH-DISABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "test_query_for_template", "TEST-QUERY-FOR-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_for_test_query_new", "CYCL-FOR-TEST-QUERY-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_for_test_query", "CYCL-FOR-TEST-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "comment_for_test_query", "COMMENT-FOR-TEST-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "query_and_gloss_for_formula_template", "QUERY-AND-GLOSS-FOR-FORMULA-TEMPLATE", 1, 1, false );
    SubLFiles.declareFunction( me, "query_template_encapsulated_p", "QUERY-TEMPLATE-ENCAPSULATED-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inverted_index_query_library_file()
  {
    $query_index_index_generationP$ = SubLFiles.defparameter( "*QUERY-INDEX-INDEX-GENERATION?*", NIL );
    $ql_search_weight_factor$ = SubLFiles.defparameter( "*QL-SEARCH-WEIGHT-FACTOR*", $float29$0_5 );
    $min_query_weight$ = SubLFiles.defparameter( "*MIN-QUERY-WEIGHT*", ZERO_INTEGER );
    $query_template_index$ = SubLFiles.defparameter( "*QUERY-TEMPLATE-INDEX*", NIL );
    $ql_ir_search_disabledP$ = SubLFiles.defparameter( "*QL-IR-SEARCH-DISABLED?*", NIL );
    $ql_build_index_in_memory$ = SubLFiles.defparameter( "*QL-BUILD-INDEX-IN-MEMORY*", red_infrastructure_macros.red_def_helper( $list86.isSymbol() ? Symbols.symbol_value( $list86 ) : $list86,
        $sym87$_QL_BUILD_INDEX_IN_MEMORY_, ZERO_INTEGER.isSymbol() ? Symbols.symbol_value( ZERO_INTEGER ) : ZERO_INTEGER, $kw88$PARAMETER, UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_inverted_index_query_library_file()
  {
    classes.subloop_new_class( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym1$INVERTED_INDEX, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC );
    subloop_reserved_initialize_query_template_inverted_index_class( $sym0$QUERY_TEMPLATE_INVERTED_INDEX );
    methods.methods_incorporate_instance_method( $sym13$INITIALIZE, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list14, NIL, $list15 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym13$INITIALIZE, $sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym20$LOOKUP, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list21, $list22, $list23 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym20$LOOKUP, $sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD );
    methods.methods_incorporate_instance_method( $sym31$REMOVE_KEY, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list21, $list32, $list33 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym31$REMOVE_KEY, $sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym36$REMOVE_VALUE, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list21, $list38, $list39 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym36$REMOVE_VALUE, $sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD );
    methods.methods_incorporate_instance_method( $sym43$INDEX_ALL_QUERIES_IN_FOLDER, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list21, $list44, $list45 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym43$INDEX_ALL_QUERIES_IN_FOLDER, $sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD );
    methods.methods_incorporate_instance_method( $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $list21, $list52, $list53 );
    methods.subloop_register_instance_method( $sym0$QUERY_TEMPLATE_INVERTED_INDEX, $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS, $sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_ );
    classes.subloop_new_class( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym9$INDEX_ENTRY_COMPUTER, NIL, NIL, $list58 );
    classes.class_set_implements_slot_listeners( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_note_class_initialization_function( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C );
    classes.subloop_note_instance_initialization_function( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C );
    subloop_reserved_initialize_query_template_inverted_index_entry_computer_class( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER );
    methods.methods_incorporate_instance_method( $sym17$SET_INDEX, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $list64, $list65, $list66 );
    methods.subloop_register_instance_method( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym17$SET_INDEX, $sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym70$SET_GENERATION_MT, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $list64, $list71, $list72 );
    methods.subloop_register_instance_method( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym70$SET_GENERATION_MT, $sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME );
    methods.methods_incorporate_instance_method( $sym76$SET_GENERATION_DOMAIN_MT, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $list64, $list71, $list77 );
    methods.subloop_register_instance_method( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym76$SET_GENERATION_DOMAIN_MT, $sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI );
    methods.methods_incorporate_instance_method( $sym35$COMPUTE_INDEX_ENTRIES, $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $list64, $list80, $list81 );
    methods.subloop_register_instance_method( $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER, $sym35$COMPUTE_INDEX_ENTRIES, $sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE );
    access_macros.register_external_symbol( $sym94$DISABLE_QL_IR_SEARCH );
    access_macros.register_external_symbol( $sym95$ENABLE_QL_IR_SEARCH );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inverted_index_query_library_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inverted_index_query_library_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inverted_index_query_library_file();
  }
  static
  {
    me = new inverted_index_query_library();
    $query_index_index_generationP$ = null;
    $ql_search_weight_factor$ = null;
    $min_query_weight$ = null;
    $query_template_index$ = null;
    $ql_ir_search_disabledP$ = null;
    $ql_build_index_in_memory$ = null;
    $sym0$QUERY_TEMPLATE_INVERTED_INDEX = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX" );
    $sym1$INVERTED_INDEX = makeSymbol( "INVERTED-INDEX" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$PHYSICAL_INDEX = makeSymbol( "PHYSICAL-INDEX" );
    $sym9$INDEX_ENTRY_COMPUTER = makeSymbol( "INDEX-ENTRY-COMPUTER" );
    $sym10$VALUE_TEST = makeSymbol( "VALUE-TEST" );
    $sym11$INDEXED_ITEMS = makeSymbol( "INDEXED-ITEMS" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-INSTANCE" );
    $sym13$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list14 = ConsesLow.list( makeKeyword( "PROTECTED" ), makeKeyword( "NO-MEMBER-VARIABLES" ), T );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VALUE-TEST" ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEXED-ITEMS" ) ), ConsesLow.list( makeSymbol( "NEW-INDEXED-ITEMS" ) ) ), ConsesLow.list(
            makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ) ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-INDEX" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                        "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PHYSICAL-INDEX" ) ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                            "QUOTE" ), makeSymbol( "IN-MEMORY-EQUALP-INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym16$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER" );
    $sym17$SET_INDEX = makeSymbol( "SET-INDEX" );
    $sym18$IN_MEMORY_EQUALP_INDEX = makeSymbol( "IN-MEMORY-EQUALP-INDEX" );
    $sym19$QUERY_TEMPLATE_INVERTED_INDEX_INITIALIZE_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-INITIALIZE-METHOD" );
    $sym20$LOOKUP = makeSymbol( "LOOKUP" );
    $list21 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list22 = ConsesLow.list( makeSymbol( "KEY" ) );
    $list23 = ConsesLow.list( makeString(
        "@param KEY stringp;\n       @return list; a list of (query weight) lists that are indexed on at least one word in KEY.  In the case of multiple matches,\n                     return queries with more words matching the key first.  Also accepts CycL as the key, in which case it\n                     must be one (not more than one) of the terms in the template's cycl." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LOOKUP-ITEMS" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "STRINGP" ), makeSymbol( "KEY" ) ), ConsesLow
            .list( makeSymbol( "STRING-TOKENIZE-VIA-WORDIFY" ), makeSymbol( "KEY" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "KEY" ) ) ) ), ConsesLow.list( makeSymbol( "LOOKUP-ITEM-COUNT" ), ConsesLow.list(
                makeSymbol( "LENGTH" ), ConsesLow.list( makeSymbol( "REMOVE-IF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?" ) ), makeSymbol( "LOOKUP-ITEMS" ) ) ) ),
            ConsesLow.list( makeSymbol( "DICT" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ), makeSymbol( "SCORED" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol(
                "LOOKUP-ITEMS" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUID" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "LOOKUP" ) ), makeSymbol( "KEY" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EXISTING-COUNT" ), ConsesLow.list(
                        makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "DICT" ), makeSymbol( "SUID" ), ZERO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "DICT" ), makeSymbol( "SUID" ),
                            ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "EXISTING-COUNT" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "DO-DICTIONARY" ), ConsesLow.list( makeSymbol( "SUID" ), makeSymbol( "SCORE" ),
                                makeSymbol( "DICT" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "GET-ITEM-FROM-INDEX-SUID" ), makeSymbol(
                                    "INDEXED-ITEMS" ), makeSymbol( "SUID" ) ), makeSymbol( "SCORE" ) ), makeSymbol( "SCORED" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                        "NORMALIZED" ) ), ConsesLow.list( makeSymbol( "HIGHEST-WEIGHT" ), ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol(
                                            "SCORED" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RAW-WEIGHT" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol(
                                                "ITEM" ) ) ), ConsesLow.list( makeSymbol( "NORMALIZED-WEIGHT" ), ConsesLow.list( makeSymbol( "/" ), makeSymbol( "RAW-WEIGHT" ), makeSymbol( "LOOKUP-ITEM-COUNT" ) ) ) ),
                                                ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">" ), makeSymbol( "RAW-WEIGHT" ), makeSymbol( "HIGHEST-WEIGHT" ) ), ConsesLow.list( makeSymbol(
                                                    "CSETQ" ), makeSymbol( "HIGHEST-WEIGHT" ), makeSymbol( "RAW-WEIGHT" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
                                                        makeSymbol( "FIRST" ), makeSymbol( "ITEM" ) ), makeSymbol( "NORMALIZED-WEIGHT" ) ), makeSymbol( "NORMALIZED" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                            makeSymbol( "NORMALIZED" ), ConsesLow.list( makeSymbol( "REMOVE-LOW-WEIGHTED-ITEMS" ), makeSymbol( "NORMALIZED" ), makeSymbol( "HIGHEST-WEIGHT" ), makeSymbol(
                                                                "LOOKUP-ITEM-COUNT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NORMALIZED" ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol(
                                                                    "NORMALIZED" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( ">" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SECOND" ) ) ) ),
                                        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NORMALIZED" ) ) ) ) );
    $sym24$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD" );
    $sym25$QUERY_TEMPLATE_INVERTED_INDEX_STOP_WORD_ = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-STOP-WORD?" );
    $sym26$_ = makeSymbol( ">" );
    $sym27$SECOND = makeSymbol( "SECOND" );
    $sym28$QUERY_TEMPLATE_INVERTED_INDEX_LOOKUP_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-LOOKUP-METHOD" );
    $float29$0_5 = makeDouble( 0.5 );
    $sym30$NORMALIZED_WEIGHT_TOO_LOW_ = makeSymbol( "NORMALIZED-WEIGHT-TOO-LOW?" );
    $sym31$REMOVE_KEY = makeSymbol( "REMOVE-KEY" );
    $list32 = ConsesLow.list( makeSymbol( "INDEX-KEY" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRIES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ) ), makeSymbol( "INDEX-KEY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol(
            "ENTRIES" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-VALUE" ) ), makeSymbol( "ENTRY" ) ) ) ), ConsesLow
                .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym34$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD" );
    $sym35$COMPUTE_INDEX_ENTRIES = makeSymbol( "COMPUTE-INDEX-ENTRIES" );
    $sym36$REMOVE_VALUE = makeSymbol( "REMOVE-VALUE" );
    $sym37$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_KEY_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-KEY-METHOD" );
    $list38 = ConsesLow.list( makeSymbol( "INDEX-ENTRY" ) );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE" ) ), makeSymbol( "INDEX-ENTRY" ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym40$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-METHOD" );
    $sym41$REMOVE = makeSymbol( "REMOVE" );
    $sym42$QUERY_TEMPLATE_INVERTED_INDEX_REMOVE_VALUE_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-REMOVE-VALUE-METHOD" );
    $sym43$INDEX_ALL_QUERIES_IN_FOLDER = makeSymbol( "INDEX-ALL-QUERIES-IN-FOLDER" );
    $list44 = ConsesLow.list( makeSymbol( "ROOT-NODE" ) );
    $list45 = ConsesLow.list( makeString( "index all queries in ROOT-NODE folder and its subfolders" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEMPLATES" ), ConsesLow.list(
        makeSymbol( "TEMPLATES-IN-FOLDER" ), makeSymbol( "ROOT-NODE" ), constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) ), T ) ), ConsesLow.list( makeSymbol( "ERROR" ) ) ), ConsesLow.list(
            makeSymbol( "WITH-PPH-MEMOIZATION" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TEMPLATE" ), makeSymbol( "TEMPLATES" ) ), ConsesLow.list( makeSymbol( "CATCH-ERROR-MESSAGE" ),
                ConsesLow.list( makeSymbol( "ERROR" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-AN-ITEM" ) ), makeSymbol(
                    "TEMPLATE" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR" ), ConsesLow.list( makeSymbol( "REPORT-QL-INDEX-INITIALIZATION-ERROR" ), makeSymbol( "TEMPLATE" ), makeSymbol( "ERROR" ) ),
                        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ERROR" ), NIL ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $const46$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym47$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym48$INDEX_AN_ITEM = makeSymbol( "INDEX-AN-ITEM" );
    $kw49$NEW = makeKeyword( "NEW" );
    $sym50$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_ALL_QUERIES_IN_FOLDER_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-ALL-QUERIES-IN-FOLDER-METHOD" );
    $sym51$INDEX_QUERY_WITH_FORMULA_AND_GLOSS = makeSymbol( "INDEX-QUERY-WITH-FORMULA-AND-GLOSS" );
    $list52 = ConsesLow.list( makeSymbol( "TEMPLATE" ), makeSymbol( "FORMULA" ), makeSymbol( "GLOSS" ) );
    $list53 = ConsesLow.list( makeString( "index a particular QUERY-TEMPLATE using FORMULA and GLOSS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "QUERY-FORMULA-ENCAPSULATED" ),
        ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "TEMPLATE" ), makeSymbol( "TEMPLATE" ), makeKeyword( "QUERY-GLOSS" ), makeSymbol( "GLOSS" ), makeKeyword( "FORMULA" ), makeSymbol( "FORMULA" ) ) ) ), ConsesLow
            .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INDEX-AN-ITEM" ) ), makeSymbol( "QUERY-FORMULA-ENCAPSULATED" ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $kw54$TEMPLATE = makeKeyword( "TEMPLATE" );
    $kw55$QUERY_GLOSS = makeKeyword( "QUERY-GLOSS" );
    $kw56$FORMULA = makeKeyword( "FORMULA" );
    $sym57$QUERY_TEMPLATE_INVERTED_INDEX_INDEX_QUERY_WITH_FORMULA_AND_GLOSS_ = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-INDEX-QUERY-WITH-FORMULA-AND-GLOSS-METHOD" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENERATION-MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GENERATION-DOMAIN-MT" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "PARENT-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "COMPUTE-INDEX-ENTRIES" ), ConsesLow.list( makeSymbol( "ITEM-TO-INDEX" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym59$PARENT_INDEX = makeSymbol( "PARENT-INDEX" );
    $sym60$GENERATION_DOMAIN_MT = makeSymbol( "GENERATION-DOMAIN-MT" );
    $sym61$GENERATION_MT = makeSymbol( "GENERATION-MT" );
    $sym62$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-CLASS" );
    $sym63$SUBLOOP_RESERVED_INITIALIZE_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_C = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-INSTANCE" );
    $list64 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list65 = ConsesLow.list( makeSymbol( "INVERTED-INDEX" ) );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "INVERTED-INDEX" ), makeSymbol( "INVERTED-INDEX-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARENT-INDEX" ),
        makeSymbol( "INVERTED-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym67$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym68$INVERTED_INDEX_P = makeSymbol( "INVERTED-INDEX-P" );
    $sym69$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD" );
    $sym70$SET_GENERATION_MT = makeSymbol( "SET-GENERATION-MT" );
    $list71 = ConsesLow.list( makeSymbol( "MT" ) );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENERATION-MT" ), makeSymbol( "MT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym73$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym74$HLMT_P = makeSymbol( "HLMT-P" );
    $sym75$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_ME = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD" );
    $sym76$SET_GENERATION_DOMAIN_MT = makeSymbol( "SET-GENERATION-DOMAIN-MT" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENERATION-DOMAIN-MT" ), makeSymbol( "MT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym78$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym79$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAI = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD" );
    $list80 = ConsesLow.list( makeSymbol( "QUERY-TEMPLATE" ) );
    $list81 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INDEXED-ITEMS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PARENT-INDEX" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "INDEXED-ITEMS" ) ) ) ), makeSymbol( "QUERY-TEMPLATE-QUERY" ), makeSymbol( "COMMENT" ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list(
            ConsesLow.list( makeSymbol( "QUERY-TEMPLATE-ENCAPSULATED-P" ), makeSymbol( "QUERY-TEMPLATE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUERY-TEMPLATE-QUERY" ), ConsesLow.list( makeSymbol(
                "GETF" ), makeSymbol( "QUERY-TEMPLATE" ), makeKeyword( "FORMULA" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COMMENT" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol(
                    "QUERY-TEMPLATE" ), makeKeyword( "QUERY-GLOSS" ), makeString( "" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "QUERY-TEMPLATE" ), ConsesLow.list( makeSymbol( "GETF" ), makeSymbol(
                        "QUERY-TEMPLATE" ), makeKeyword( "TEMPLATE" ) ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol( "QUERY-TEMPLATE-QUERY" ), makeSymbol(
                            "COMMENT" ) ), ConsesLow.list( makeSymbol( "QUERY-AND-GLOSS-FOR-FORMULA-TEMPLATE" ), makeSymbol( "QUERY-TEMPLATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                                .list( makeSymbol( "MY-INDEX" ), ConsesLow.list( makeSymbol( "MAYBE-ADD-NEW-INDEXED-ITEM" ), makeSymbol( "INDEXED-ITEMS" ), makeSymbol( "QUERY-TEMPLATE" ) ) ) ), ConsesLow.list(
                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "FORT" ), ConsesLow.list( makeSymbol( "EXPRESSION-GATHER" ), makeSymbol( "QUERY-TEMPLATE-QUERY" ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "FORT-P" ) ), T ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-INVERTED-INDEX-ENTRY" ), makeSymbol( "FORT" ), makeSymbol(
                                            "MY-INDEX" ) ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*QUERY-INDEX-INDEX-GENERATION?*" ), ConsesLow.list( makeSymbol( "CDOLIST" ),
                                                ConsesLow.list( makeSymbol( "ENTRY" ), ConsesLow.list( makeSymbol( "COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING" ), ConsesLow.list( makeSymbol( "GENERATE-QUESTION" ),
                                                    makeSymbol( "QUERY-TEMPLATE-QUERY" ) ), makeSymbol( "MY-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ENTRY" ), makeSymbol( "RESULT" ) ) ) ),
                                ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "COMMENT" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTRY" ), ConsesLow.list( makeSymbol(
                                    "COMPUTE-INVERTED-INDEX-ENTRIES-FOR-STRING" ), makeSymbol( "COMMENT" ), makeSymbol( "MY-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ENTRY" ), makeSymbol(
                                        "RESULT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) ) );
    $sym82$OUTER_CATCH_FOR_QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_METH = makeUninternedSymbol( "OUTER-CATCH-FOR-QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-METHOD" );
    $str83$ = makeString( "" );
    $sym84$FORT_P = makeSymbol( "FORT-P" );
    $sym85$QUERY_TEMPLATE_INVERTED_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIE = makeSymbol( "QUERY-TEMPLATE-INVERTED-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD" );
    $list86 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.in-memory" ) );
    $sym87$_QL_BUILD_INDEX_IN_MEMORY_ = makeSymbol( "*QL-BUILD-INDEX-IN-MEMORY*" );
    $kw88$PARAMETER = makeKeyword( "PARAMETER" );
    $sym89$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw90$INDEXED = makeKeyword( "INDEXED" );
    $kw91$INDEX_UNINITIALIZED = makeKeyword( "INDEX-UNINITIALIZED" );
    $sym92$FIRST = makeSymbol( "FIRST" );
    $list93 = ConsesLow.list( makeSymbol( "CYCL" ), makeSymbol( "WEIGHT" ) );
    $sym94$DISABLE_QL_IR_SEARCH = makeSymbol( "DISABLE-QL-IR-SEARCH" );
    $sym95$ENABLE_QL_IR_SEARCH = makeSymbol( "ENABLE-QL-IR-SEARCH" );
    $const96$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TemplateFromTestQueryFn" ) );
    $const97$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell( makeString( "querySpecificationForFormulaTemplate" ) );
    $kw98$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw99$REMOVAL_LOOKUP_POS = makeKeyword( "REMOVAL-LOOKUP-POS" );
    $kw100$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw101$HL = makeKeyword( "HL" );
    $kw102$RETURN = makeKeyword( "RETURN" );
    $kw103$TRUE = makeKeyword( "TRUE" );
    $list104 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $kw105$X = makeKeyword( "X" );
    $const106$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $const107$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $list108 = ConsesLow.list( makeKeyword( "X" ) );
    $list109 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "ALLOWED-MODULES" ),
        makeKeyword( "REMOVAL-ASSERTED-SENTENCE-LOOKUP-POS" ) );
    $const110$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const111$formulaTemplateGloss = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateGloss" ) );
  }
}
/*
 * 
 * Total time: 541 ms
 * 
 */