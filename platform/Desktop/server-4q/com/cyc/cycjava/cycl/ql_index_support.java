package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ql_index_support
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.ql_index_support";
  public static final String myFingerPrint = "61791dd6e7e97992bbe084333d1a4869137423d15f3c4d6f9b0b3d4e91ebd4cc";
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 955L)
  private static SubLSymbol $ql_index_sc_index$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1036L)
  private static SubLSymbol $ql_index_sc_input$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1116L)
  private static SubLSymbol $ql_index_sc_segments$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1205L)
  private static SubLSymbol $ql_index_sc_xml$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1279L)
  private static SubLSymbol $ql_index_sc_file_permission$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1471L)
  private static SubLSymbol $ql_index_sc_from_address$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1643L)
  private static SubLSymbol $ql_index_sc_to_address$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1822L)
  private static SubLSymbol $ql_index_support_verbose$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 1922L)
  private static SubLSymbol $ql_index_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 2711L)
  private static SubLSymbol $ql_index_distance$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9625L)
  private static SubLSymbol $get_object_by_hl_id_string_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 13987L)
  private static SubLSymbol $ql_index_update_procedure$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15031L)
  private static SubLSymbol $ql_index_update_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15439L)
  private static SubLSymbol $ql_index_dequeue_procedure$;
  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15934L)
  private static SubLSymbol $ql_index_update_process$;
  private static final SubLString $str0$index;
  private static final SubLString $str1$input;
  private static final SubLString $str2$segments;
  private static final SubLString $str3$xml;
  private static final SubLString $str4$777;
  private static final SubLString $str5$ql_qa_cyc_com;
  private static final SubLString $str6$nsiegel_cyc_com;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$_QL_INDEX_THRESHOLD_;
  private static final SubLString $str9$3380;
  private static final SubLSymbol $kw10$PARAMETER;
  private static final SubLFloat $float11$0_3;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_QL_INDEX_DISTANCE_;
  private static final SubLString $str14$3381;
  private static final SubLFloat $float15$0_5;
  private static final SubLSymbol $sym16$INDEX_QUERIES_FROM_NODE;
  private static final SubLSymbol $kw17$INDEXED;
  private static final SubLSymbol $kw18$INDEX_UNINITIALIZED;
  private static final SubLSymbol $kw19$CYCL;
  private static final SubLSymbol $kw20$GLOSS;
  private static final SubLSymbol $kw21$ERROR;
  private static final SubLSymbol $kw22$NEW;
  private static final SubLString $str23$___add_template_with_formula_and_;
  private static final SubLSymbol $sym24$INDEXED_QUERIES_FROM_STRING;
  private static final SubLSymbol $sym25$EXTRACT_CYCL_TERM_FROM_PLIST;
  private static final SubLSymbol $sym26$NUMBERP;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$WEIGHT;
  private static final SubLSymbol $sym29$GET_OBJECT_BY_HL_ID_STRING;
  private static final SubLSymbol $sym30$_GET_OBJECT_BY_HL_ID_STRING_CACHING_STATE_;
  private static final SubLInteger $int31$5000;
  private static final SubLObject $const32$FormulaTemplate;
  private static final SubLSymbol $kw33$INDEX;
  private static final SubLString $str34$Collecting_all_instances_of__S;
  private static final SubLSymbol $sym35$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const36$EverythingPSC;
  private static final SubLString $str37$___a_template_a_collected;
  private static final SubLString $str38$;
  private static final SubLString $str39$s;
  private static final SubLInteger $int40$100;
  private static final SubLSymbol $sym41$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str42$__QL_Index___s;
  private static final SubLString $str43$__Enter___process_ql_index_queue_;
  private static final SubLSymbol $kw44$TERM;
  private static final SubLString $str45$__Exit___process_ql_index_queue_e;
  private static final SubLSymbol $sym46$_QL_INDEX_UPDATE_PROCEDURE_;
  private static final SubLSymbol $sym47$ENQUEUE_FOR_QL_INDEXING;
  private static final SubLString $str48$___maybe_update_ql_index__a__a_;
  private static final SubLString $str49$___maybe_update_ql_index__a__a___;
  private static final SubLSymbol $sym50$_QL_INDEX_UPDATE_QUEUE_;
  private static final SubLString $str51$ql_index;
  private static final SubLSymbol $sym52$_QL_INDEX_DEQUEUE_PROCEDURE_;
  private static final SubLSymbol $sym53$PROCESS_QL_INDEX_QUEUE_ENTRIES;
  private static final SubLSymbol $sym54$_QL_INDEX_UPDATE_PROCESS_;
  private static final SubLString $str55$The_process_object_responsible_fo;
  private static final SubLString $str56$Update_QL_Index;
  private static final SubLSymbol $kw57$OUTPUT;
  private static final SubLString $str58$Unable_to_open__S;
  private static final SubLSymbol $kw59$UNINITIALIZED;
  private static final SubLSymbol $kw60$ID;
  private static final SubLSymbol $kw61$GENERATION;
  private static final SubLInteger $int62$200;
  private static final SubLString $str63$___A_template_forms_written_to__S;
  private static final SubLString $str64$___s;
  private static final SubLObject $const65$formulaTemplateGloss;
  private static final SubLObject $const66$querySpecificationForFormulaTempl;
  private static final SubLSymbol $kw67$KB;
  private static final SubLSymbol $kw68$PROCESS;
  private static final SubLSymbol $kw69$HOST;
  private static final SubLSymbol $kw70$USER;
  private static final SubLSymbol $kw71$TIME;
  private static final SubLSymbol $kw72$ROOT;
  private static final SubLSymbol $kw73$INPUT;
  private static final SubLSymbol $sym74$NON_EMPTY_STRING_P;
  private static final SubLList $list75;

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 2244L)
  public static SubLObject get_ql_index_threshold()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject val = kb_utilities.find_object_by_hl_external_id_string( $ql_index_threshold$.getDynamicValue( thread ) );
    if( !val.isNumber() || !val.numGE( ZERO_INTEGER ) || !val.numLE( ONE_INTEGER ) )
    {
      val = $float11$0_3;
      $ql_index_threshold$.setDynamicValue( kb_utilities.hl_external_id_string( val ), thread );
    }
    return val;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 2530L)
  public static SubLObject set_ql_index_threshold(final SubLObject n)
  {
    if( n.numGE( ZERO_INTEGER ) && n.numLE( ONE_INTEGER ) )
    {
      $ql_index_threshold$.setDynamicValue( kb_utilities.hl_external_id_string( n ) );
    }
    return get_ql_index_threshold();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 3106L)
  public static SubLObject get_ql_index_distance()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject val = kb_utilities.find_object_by_hl_external_id_string( $ql_index_distance$.getDynamicValue( thread ) );
    if( !val.numGE( ZERO_INTEGER ) || !val.numLE( ONE_INTEGER ) )
    {
      val = $float15$0_5;
      $ql_index_distance$.setDynamicValue( kb_utilities.hl_external_id_string( val ), thread );
    }
    return val;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 3370L)
  public static SubLObject set_ql_index_distance(final SubLObject n)
  {
    if( n.numGE( ZERO_INTEGER ) && n.numLE( ONE_INTEGER ) )
    {
      $ql_index_distance$.setDynamicValue( kb_utilities.hl_external_id_string( n ) );
    }
    return get_ql_index_distance();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 3548L)
  public static SubLObject get_ql_index_input_file_base_name()
  {
    return lucene_index.$ql_index_sc_query_index_forms$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 3765L)
  public static SubLObject set_ql_index_support_verbose(SubLObject boolean_value)
  {
    if( boolean_value == UNPROVIDED )
    {
      boolean_value = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $ql_index_support_verbose$.setDynamicValue( boolean_value, thread );
    return $ql_index_support_verbose$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 3927L)
  public static SubLObject get_ql_index_support_verbose()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ql_index_support_verbose$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 4011L)
  public static SubLObject index_queries_from_node(final SubLObject root_node)
  {
    if( NIL != inverted_index_query_library.get_ql_build_index_in_memory() )
    {
      return inverted_index_query_library.index_queries_from_node_in_memory( root_node );
    }
    return $kw17$INDEXED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 5656L)
  public static SubLObject add_template_with_formula_and_gloss(final SubLObject template, final SubLObject formula, final SubLObject gloss)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = $kw18$INDEX_UNINITIALIZED;
    final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
    try
    {
      pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
      thread.resetMultipleValues();
      final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
      try
      {
        pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
        final SubLObject reuseP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        try
        {
          thread.resetMultipleValues();
          final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding( thread );
          try
          {
            pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
            final SubLObject new_or_reused = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
              final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
              final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding( thread );
              try
              {
                memoization_state.$memoization_state$.bind( local_state, thread );
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                try
                {
                  if( NIL != inverted_index_query_library.get_ql_build_index_in_memory() )
                  {
                    SubLObject fm = formula;
                    SubLObject gl = gloss;
                    if( NIL == fm || NIL == gl )
                    {
                      final SubLObject v_encapsulation = encapsulate_query_template( template, formula, gloss );
                      fm = conses_high.getf( v_encapsulation, $kw19$CYCL, NIL );
                      gl = conses_high.getf( v_encapsulation, $kw20$GLOSS, NIL );
                    }
                    result = inverted_index_query_library.add_template_with_formula_and_gloss_in_memory( template, fm, gl );
                  }
                  else
                  {
                    start_ql_index_update_thread( UNPROVIDED );
                    final SubLObject v_answer = maybe_update_ql_index( encapsulate_query_template( template, formula, gloss ), UNPROVIDED );
                    if( v_answer != $kw21$ERROR )
                    {
                      result = $kw17$INDEXED;
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                  }
                }
              }
              finally
              {
                memoization_state.$memoization_state$.rebind( _prev_bind_0_$4, thread );
              }
            }
            finally
            {
              pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$3, thread );
            }
            if( new_or_reused == $kw22$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
            {
              memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
            }
          }
          finally
          {
            pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
    }
    if( NIL != get_ql_index_support_verbose() )
    {
      PrintLow.format( T, $str23$___add_template_with_formula_and_, new SubLObject[] { template, formula, gloss, result
      } );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 6965L)
  public static SubLObject indexed_queries_from_string(final SubLObject string)
  {
    if( NIL != inverted_index_query_library.get_ql_build_index_in_memory() )
    {
      return inverted_index_query_library.indexed_queries_from_string_in_memory( string );
    }
    return Mapping.mapcar( $sym25$EXTRACT_CYCL_TERM_FROM_PLIST, cae_query_search.indexed_queries_from_string_with_confidences( string, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 7758L)
  public static SubLObject old_indexed_queries_from_string_with_confidences(final SubLObject string, SubLObject threshold, SubLObject distance)
  {
    if( threshold == UNPROVIDED )
    {
      threshold = get_ql_index_threshold();
    }
    if( distance == UNPROVIDED )
    {
      distance = get_ql_index_distance();
    }
    assert NIL != Types.numberp( threshold ) : threshold;
    assert NIL != Types.numberp( distance ) : distance;
    SubLObject result = NIL;
    if( NIL != inverted_index_query_library.ql_ir_search_allowedP() )
    {
      if( NIL != inverted_index_query_library.get_ql_build_index_in_memory() )
      {
        result = inverted_index_query_library.indexed_queries_from_string_with_confidences_in_memory( string );
      }
      else
      {
        final SubLObject found = lucene_index.ql_index_find_queries( control_vars.kb_loaded(), string, UNPROVIDED, UNPROVIDED );
        SubLObject max = ZERO_INTEGER;
        SubLObject tmp = NIL;
        if( NIL != list_utilities.non_empty_list_p( found ) )
        {
          SubLObject cdolist_list_var = found;
          SubLObject pair = NIL;
          pair = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject id_string = NIL;
            SubLObject score = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
            id_string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list27 );
            score = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject v_term = get_object_by_hl_id_string( id_string );
              if( NIL != v_term && score.isNumber() && score.numGE( threshold ) )
              {
                tmp = ConsesLow.cons( query_library_utils.new_ql_parse( v_term, score, UNPROVIDED ), tmp );
                if( score.numG( max ) )
                {
                  max = score;
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list27 );
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
          }
          if( max.numG( ZERO_INTEGER ) && max.numGE( threshold ) )
          {
            cdolist_list_var = tmp;
            SubLObject obj = NIL;
            obj = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject score2 = conses_high.getf( obj, $kw28$WEIGHT, UNPROVIDED );
              if( score2.numG( ZERO_INTEGER ) && Numbers.divide( score2, max ).numLE( distance ) )
              {
                result = ConsesLow.cons( obj, result );
              }
              cdolist_list_var = cdolist_list_var.rest();
              obj = cdolist_list_var.first();
            }
          }
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9625L)
  public static SubLObject clear_get_object_by_hl_id_string()
  {
    final SubLObject cs = $get_object_by_hl_id_string_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9625L)
  public static SubLObject remove_get_object_by_hl_id_string(final SubLObject string)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_object_by_hl_id_string_caching_state$.getGlobalValue(), ConsesLow.list( string ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9625L)
  public static SubLObject get_object_by_hl_id_string_internal(final SubLObject string)
  {
    return string.isString() ? kb_utilities.find_object_by_hl_external_id_string( string ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9625L)
  public static SubLObject get_object_by_hl_id_string(final SubLObject string)
  {
    SubLObject caching_state = $get_object_by_hl_id_string_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym29$GET_OBJECT_BY_HL_ID_STRING, $sym30$_GET_OBJECT_BY_HL_ID_STRING_CACHING_STATE_, $int31$5000, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_object_by_hl_id_string_internal( string ) ) );
      memoization_state.caching_state_put( caching_state, string, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 9797L)
  public static SubLObject build_query_template_index(SubLObject kb, SubLObject collection, SubLObject verbose)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    if( collection == UNPROVIDED )
    {
      collection = $const32$FormulaTemplate;
    }
    if( verbose == UNPROVIDED )
    {
      verbose = get_ql_index_support_verbose();
    }
    SubLObject status = NIL;
    if( NIL != write_ql_index_input_file( NIL, kb, collection, verbose ) )
    {
      final SubLObject index_dir = find_or_create_index_directory( kb, $kw33$INDEX );
      if( NIL != index_dir )
      {
        lucene_index.ql_index_build_from_file( kb, UNPROVIDED, UNPROVIDED );
        status = segments_file_exists_p( kb );
      }
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 10405L)
  public static SubLObject write_ql_index_input_file(SubLObject pathname, SubLObject kb, SubLObject collection, SubLObject verbose)
  {
    if( pathname == UNPROVIDED )
    {
      pathname = NIL;
    }
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    if( collection == UNPROVIDED )
    {
      collection = $const32$FormulaTemplate;
    }
    if( verbose == UNPROVIDED )
    {
      verbose = get_ql_index_support_verbose();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject templates = NIL;
    SubLObject status = NIL;
    if( NIL != verbose )
    {
      PrintLow.format( T, $str34$Collecting_all_instances_of__S, collection );
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym35$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const36$EverythingPSC, thread );
      templates = isa.all_fort_instances( collection, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != verbose )
    {
      final SubLObject tlen = Sequences.length( templates );
      PrintLow.format( T, $str37$___a_template_a_collected, tlen, tlen.eql( ONE_INTEGER ) ? $str38$ : $str39$s );
    }
    if( NIL != templates && ( NIL != string_utilities.non_empty_string_p( pathname ) || NIL != find_or_create_index_directory( kb, $kw33$INDEX ) ) )
    {
      final SubLObject file_pathname = ( NIL != pathname ) ? pathname : get_ql_index_input_file_pathname( kb );
      if( NIL != string_utilities.non_empty_string_p( file_pathname ) )
      {
        write_template_index_source_file( templates, file_pathname, kb, UNPROVIDED );
        status = list_utilities.sublisp_boolean( Filesys.probe_file( file_pathname ) );
      }
    }
    return status;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 11856L)
  public static SubLObject process_ql_index_queue_entries()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject queue = get_ql_index_update_queue();
    final SubLObject htbl = Hashtables.make_hash_table( $int40$100, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    SubLObject error = NIL;
    if( NIL != process_utilities.ipc_queue_p( queue ) )
    {
      final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
      try
      {
        pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
        thread.resetMultipleValues();
        final SubLObject _prev_bind_0_$7 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
        try
        {
          pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
          final SubLObject reuseP = thread.secondMultipleValue();
          thread.resetMultipleValues();
          try
          {
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$8 = pph_macros.$pph_memoization_state$.currentBinding( thread );
            try
            {
              pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
              final SubLObject new_or_reused = thread.secondMultipleValue();
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$9 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
              try
              {
                pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding( thread );
                try
                {
                  memoization_state.$memoization_state$.bind( local_state, thread );
                  final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                  try
                  {
                    while ( true)
                    {
                      try
                      {
                        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                        final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding( thread );
                        try
                        {
                          Errors.$error_handler$.bind( $sym41$CATCH_ERROR_MESSAGE_HANDLER, thread );
                          try
                          {
                            final SubLObject entry = process_utilities.ipc_dequeue( queue, UNPROVIDED );
                            if( NIL != entry )
                            {
                              process_ql_index_queue_entries_int( ConsesLow.list( entry ), htbl );
                            }
                          }
                          catch( final Throwable catch_var )
                          {
                            Errors.handleThrowable( catch_var, NIL );
                          }
                        }
                        finally
                        {
                          Errors.$error_handler$.rebind( _prev_bind_0_$11, thread );
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
                        PrintLow.format( T, $str42$__QL_Index___s, error );
                        error = NIL;
                      }
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                    }
                  }
                }
                finally
                {
                  memoization_state.$memoization_state$.rebind( _prev_bind_0_$10, thread );
                }
              }
              finally
              {
                pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$8, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
            }
          }
        }
        finally
        {
          pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$7, thread );
        }
      }
      finally
      {
        pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 12459L)
  public static SubLObject process_ql_index_queue_entries_int(final SubLObject entries, SubLObject hashtable)
  {
    if( hashtable == UNPROVIDED )
    {
      hashtable = NIL;
    }
    if( NIL != get_ql_index_support_verbose() )
    {
      PrintLow.format( T, $str43$__Enter___process_ql_index_queue_, entries, hashtable );
    }
    SubLObject encapsulated_templates = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = entries;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != ke_interaction_folder.cycl_formula_templateP( entry ) )
      {
        encapsulated_templates = ConsesLow.cons( encapsulate_query_template( entry, UNPROVIDED, UNPROVIDED ), encapsulated_templates );
      }
      else if( NIL != list_utilities.property_list_p( entry ) )
      {
        encapsulated_templates = ConsesLow.cons( entry, encapsulated_templates );
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    if( NIL != encapsulated_templates )
    {
      if( NIL != inverted_index_query_library.get_ql_build_index_in_memory() )
      {
        cdolist_list_var = encapsulated_templates;
        SubLObject v_encapsulation = NIL;
        v_encapsulation = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject v_term = conses_high.getf( v_encapsulation, $kw44$TERM, UNPROVIDED );
          final SubLObject formula = conses_high.getf( v_encapsulation, $kw19$CYCL, UNPROVIDED );
          final SubLObject gloss = conses_high.getf( v_encapsulation, $kw20$GLOSS, UNPROVIDED );
          result = inverted_index_query_library.add_template_with_formula_and_gloss_in_memory( v_term, formula, gloss );
          cdolist_list_var = cdolist_list_var.rest();
          v_encapsulation = cdolist_list_var.first();
        }
      }
      else
      {
        result = lucene_index.ql_index_add_queries( encapsulated_templates, UNPROVIDED, UNPROVIDED );
      }
    }
    if( NIL != get_ql_index_support_verbose() )
    {
      PrintLow.format( T, $str45$__Exit___process_ql_index_queue_e, new SubLObject[] { entries, hashtable, result
      } );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 13779L)
  public static SubLObject get_adler_checksum(final SubLObject obj)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject bv = cfasl.cfasl_encode_externalized( obj );
    SubLObject checksum = NIL;
    final SubLObject _prev_bind_0 = number_utilities.$checksum_sum$.currentBinding( thread );
    final SubLObject _prev_bind_2 = number_utilities.$checksum_length$.currentBinding( thread );
    try
    {
      number_utilities.$checksum_sum$.bind( number_utilities.$checksum_initial_value_sum$.getGlobalValue(), thread );
      number_utilities.$checksum_length$.bind( number_utilities.$checksum_initial_value_length$.getGlobalValue(), thread );
      final SubLObject vector_var = bv;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject v_byte;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        v_byte = Vectors.aref( vector_var, element_num );
        number_utilities.checksum_update( v_byte );
      }
      checksum = number_utilities.checksum_finalize();
    }
    finally
    {
      number_utilities.$checksum_length$.rebind( _prev_bind_2, thread );
      number_utilities.$checksum_sum$.rebind( _prev_bind_0, thread );
    }
    return checksum;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 14224L)
  public static SubLObject get_ql_index_update_procedure()
  {
    return $ql_index_update_procedure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 14310L)
  public static SubLObject set_ql_index_update_procedure(final SubLObject fsym)
  {
    $ql_index_update_procedure$.setGlobalValue( fsym );
    return $ql_index_update_procedure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 14445L)
  public static SubLObject maybe_update_ql_index(final SubLObject obj, SubLObject fsym)
  {
    if( fsym == UNPROVIDED )
    {
      fsym = get_ql_index_update_procedure();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str48$___maybe_update_ql_index__a__a_, obj, fsym );
    SubLObject result = NIL;
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym41$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != Symbols.fboundp( fsym ) )
          {
            result = Functions.apply( Symbols.symbol_function( fsym ), obj, NIL );
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
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      PrintLow.format( T, $str49$___maybe_update_ql_index__a__a___, new SubLObject[] { obj, fsym, error
      } );
      result = $kw21$ERROR;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 14874L)
  public static SubLObject enqueue_for_ql_indexing(final SubLObject obj)
  {
    return process_utilities.ipc_enqueue( obj, get_ql_index_update_queue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15248L)
  public static SubLObject get_ql_index_update_queue()
  {
    if( NIL == process_utilities.ipc_queue_p( $ql_index_update_queue$.getGlobalValue() ) )
    {
      $ql_index_update_queue$.setGlobalValue( process_utilities.new_ipc_queue( $str51$ql_index ) );
    }
    return $ql_index_update_queue$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15708L)
  public static SubLObject get_ql_index_dequeue_procedure()
  {
    return $ql_index_dequeue_procedure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 15796L)
  public static SubLObject set_ql_index_dequeue_procedure(final SubLObject fsym)
  {
    $ql_index_dequeue_procedure$.setGlobalValue( fsym );
    return $ql_index_dequeue_procedure$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 16082L)
  public static SubLObject get_ql_index_update_process()
  {
    return $ql_index_update_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 16164L)
  public static SubLObject start_ql_index_update_thread(SubLObject fsym)
  {
    if( fsym == UNPROVIDED )
    {
      fsym = get_ql_index_dequeue_procedure();
    }
    final SubLObject ql_queue = get_ql_index_update_queue();
    if( NIL != process_utilities.ipc_queue_p( ql_queue ) && NIL != Symbols.fboundp( fsym ) && ( NIL == Types.processp( $ql_index_update_process$.getGlobalValue() ) || NIL == Threads.valid_process_p(
        $ql_index_update_process$.getGlobalValue() ) || NIL == Threads.process_active_p( $ql_index_update_process$.getGlobalValue() ) ) )
    {
      if( NIL != Types.processp( $ql_index_update_process$.getGlobalValue() ) )
      {
        Threads.kill_process( $ql_index_update_process$.getGlobalValue() );
        $ql_index_update_process$.setGlobalValue( NIL );
      }
      $ql_index_update_process$.setGlobalValue( Threads.make_process( $str56$Update_QL_Index, Symbols.symbol_function( fsym ) ) );
    }
    return $ql_index_update_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 16791L)
  public static SubLObject initialize_ql_index_globals()
  {
    $ql_index_update_queue$.setGlobalValue( NIL );
    get_ql_index_update_queue();
    set_ql_index_update_procedure( $sym47$ENQUEUE_FOR_QL_INDEXING );
    set_ql_index_dequeue_procedure( $sym53$PROCESS_QL_INDEX_QUEUE_ENTRIES );
    if( NIL != Types.processp( $ql_index_update_process$.getGlobalValue() ) )
    {
      Threads.kill_process( $ql_index_update_process$.getGlobalValue() );
    }
    $ql_index_update_process$.setGlobalValue( NIL );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 17175L)
  public static SubLObject extract_cycl_term_from_plist(final SubLObject plist)
  {
    return conses_high.getf( plist, $kw19$CYCL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 17284L)
  public static SubLObject write_template_index_source_file(final SubLObject templates, final SubLObject pathname, SubLObject kb, SubLObject verbose)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    if( verbose == UNPROVIDED )
    {
      verbose = get_ql_index_support_verbose();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error = NIL;
    if( NIL != list_utilities.non_empty_list_p( templates ) && NIL != string_utilities.non_empty_string_p( pathname ) && NIL != subl_promotions.positive_integer_p( kb ) && NIL != obsolete.booleanP( verbose ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw57$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str58$Unable_to_open__S, pathname );
        }
        final SubLObject out = stream;
        if( out.isStream() )
        {
          final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
          try
          {
            xml_vars.$xml_stream$.bind( out, thread );
            xml_utilities.xml_header( UNPROVIDED, UNPROVIDED, UNPROVIDED );
            try
            {
              final SubLObject _prev_bind_0_$14 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( get_ql_index_input_file_base_name(), ConsesLow.list( lucene_index.$ql_index_sc_kb$.getGlobalValue(), format_nil.format_nil_a( kb ) ), NIL, NIL, $kw59$UNINITIALIZED );
                final SubLObject _prev_bind_0_$15 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                final SubLObject _prev_bind_1_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw59$UNINITIALIZED, thread );
                  pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$16 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try
                    {
                      thread.resetMultipleValues();
                      final SubLObject _prev_bind_0_$17 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                      try
                      {
                        pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$18 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                        try
                        {
                          pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                          final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                          final SubLObject _prev_bind_0_$19 = memoization_state.$memoization_state$.currentBinding( thread );
                          try
                          {
                            memoization_state.$memoization_state$.bind( local_state, thread );
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                            try
                            {
                              SubLObject count = ZERO_INTEGER;
                              SubLObject cdolist_list_var = templates;
                              SubLObject template = NIL;
                              template = cdolist_list_var.first();
                              while ( NIL != cdolist_list_var)
                              {
                                try
                                {
                                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                                  final SubLObject _prev_bind_0_$20 = Errors.$error_handler$.currentBinding( thread );
                                  try
                                  {
                                    Errors.$error_handler$.bind( $sym41$CATCH_ERROR_MESSAGE_HANDLER, thread );
                                    try
                                    {
                                      final SubLObject wrapper = encapsulate_query_template( template, UNPROVIDED, UNPROVIDED );
                                      final SubLObject id_string = conses_high.getf( wrapper, $kw60$ID, UNPROVIDED );
                                      final SubLObject cycl = conses_high.getf( wrapper, $kw19$CYCL, UNPROVIDED );
                                      final SubLObject template_gloss = conses_high.getf( wrapper, $kw20$GLOSS, UNPROVIDED );
                                      final SubLObject query_string = conses_high.getf( wrapper, $kw61$GENERATION, UNPROVIDED );
                                      Label_2331:
                                      {
                                        if( NIL != string_utilities.non_empty_string_p( id_string ) && NIL != cycl )
                                        {
                                          if( NIL == string_utilities.non_empty_string_p( template_gloss ) )
                                          {
                                            if( NIL == string_utilities.non_empty_string_p( query_string ) )
                                            {
                                              break Label_2331;
                                            }
                                          }
                                          try
                                          {
                                            final SubLObject _prev_bind_0_$21 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                            final SubLObject _prev_bind_1_$17 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                            try
                                            {
                                              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                  .getDynamicValue( thread ) ), thread );
                                              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                              xml_utilities.xml_start_tag_internal( lucene_index.$ql_index_sc_form$.getGlobalValue(), ConsesLow.list( lucene_index.$ql_index_sc_id$.getGlobalValue(), id_string ), NIL, NIL,
                                                  $kw59$UNINITIALIZED );
                                              final SubLObject _prev_bind_0_$22 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                              try
                                              {
                                                xml_vars.$xml_default_namespace$.bind( $kw59$UNINITIALIZED, thread );
                                                if( NIL != cycl )
                                                {
                                                  try
                                                  {
                                                    final SubLObject _prev_bind_0_$23 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                                    final SubLObject _prev_bind_1_$18 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                                    try
                                                    {
                                                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                          .getDynamicValue( thread ) ), thread );
                                                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                      xml_utilities.xml_start_tag_internal( lucene_index.$ql_index_sc_cycl$.getGlobalValue(), NIL, NIL, NIL, $kw59$UNINITIALIZED );
                                                      final SubLObject _prev_bind_0_$24 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                      try
                                                      {
                                                        xml_vars.$xml_default_namespace$.bind( $kw59$UNINITIALIZED, thread );
                                                        xml_utilities.xml_cdata( format_nil.format_nil_a( cycl ) );
                                                      }
                                                      finally
                                                      {
                                                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$24, thread );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$18, thread );
                                                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$23, thread );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values = Values.getValuesAsVector();
                                                      xml_utilities.xml_terpri();
                                                      xml_utilities.xml_end_tag_internal( lucene_index.$ql_index_sc_cycl$.getGlobalValue() );
                                                      Values.restoreValuesFromVector( _values );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
                                                    }
                                                  }
                                                }
                                                if( NIL != string_utilities.non_empty_string_p( template_gloss ) )
                                                {
                                                  try
                                                  {
                                                    final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                                    final SubLObject _prev_bind_1_$19 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                                    try
                                                    {
                                                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                          .getDynamicValue( thread ) ), thread );
                                                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                      xml_utilities.xml_start_tag_internal( lucene_index.$ql_index_sc_gloss$.getGlobalValue(), NIL, NIL, NIL, $kw59$UNINITIALIZED );
                                                      final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                      try
                                                      {
                                                        xml_vars.$xml_default_namespace$.bind( $kw59$UNINITIALIZED, thread );
                                                        xml_utilities.xml_cdata( template_gloss );
                                                      }
                                                      finally
                                                      {
                                                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$27, thread );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$19, thread );
                                                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$26, thread );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values2 = Values.getValuesAsVector();
                                                      xml_utilities.xml_terpri();
                                                      xml_utilities.xml_end_tag_internal( lucene_index.$ql_index_sc_gloss$.getGlobalValue() );
                                                      Values.restoreValuesFromVector( _values2 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                                                    }
                                                  }
                                                }
                                                if( NIL != string_utilities.non_empty_string_p( query_string ) )
                                                {
                                                  try
                                                  {
                                                    final SubLObject _prev_bind_0_$29 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                                    final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                                    try
                                                    {
                                                      xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                          .getDynamicValue( thread ) ), thread );
                                                      xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                      xml_utilities.xml_start_tag_internal( lucene_index.$ql_index_sc_generation$.getGlobalValue(), NIL, NIL, NIL, $kw59$UNINITIALIZED );
                                                      final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                      try
                                                      {
                                                        xml_vars.$xml_default_namespace$.bind( $kw59$UNINITIALIZED, thread );
                                                        xml_utilities.xml_cdata( query_string );
                                                      }
                                                      finally
                                                      {
                                                        xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$30, thread );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
                                                      xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$29, thread );
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                    try
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                      final SubLObject _values3 = Values.getValuesAsVector();
                                                      xml_utilities.xml_terpri();
                                                      xml_utilities.xml_end_tag_internal( lucene_index.$ql_index_sc_generation$.getGlobalValue() );
                                                      Values.restoreValuesFromVector( _values3 );
                                                    }
                                                    finally
                                                    {
                                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
                                                    }
                                                  }
                                                }
                                              }
                                              finally
                                              {
                                                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$22, thread );
                                              }
                                            }
                                            finally
                                            {
                                              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$17, thread );
                                              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$21, thread );
                                            }
                                          }
                                          finally
                                          {
                                            final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                            try
                                            {
                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                              final SubLObject _values4 = Values.getValuesAsVector();
                                              xml_utilities.xml_terpri();
                                              xml_utilities.xml_end_tag_internal( lucene_index.$ql_index_sc_form$.getGlobalValue() );
                                              Values.restoreValuesFromVector( _values4 );
                                            }
                                            finally
                                            {
                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
                                            }
                                          }
                                          count = Numbers.add( count, ONE_INTEGER );
                                          if( NIL != verbose && ( count.eql( FIVE_INTEGER ) || Numbers.mod( count, $int62$200 ).eql( ZERO_INTEGER ) ) )
                                          {
                                            PrintLow.format( T, $str63$___A_template_forms_written_to__S, count, pathname );
                                          }
                                        }
                                      }
                                    }
                                    catch( final Throwable catch_var )
                                    {
                                      Errors.handleThrowable( catch_var, NIL );
                                    }
                                  }
                                  finally
                                  {
                                    Errors.$error_handler$.rebind( _prev_bind_0_$20, thread );
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
                                  if( NIL != verbose )
                                  {
                                    PrintLow.format( T, $str64$___s, error );
                                  }
                                  report_ql_indexing_error( template, error );
                                  error = NIL;
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                template = cdolist_list_var.first();
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values5 = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                                Values.restoreValuesFromVector( _values5 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
                              }
                            }
                          }
                          finally
                          {
                            memoization_state.$memoization_state$.rebind( _prev_bind_0_$19, thread );
                          }
                        }
                        finally
                        {
                          pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$18, thread );
                        }
                        if( new_or_reused == $kw22$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                        {
                          memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                        }
                      }
                      finally
                      {
                        pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$17, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values6 = Values.getValuesAsVector();
                        if( NIL == reuseP )
                        {
                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                        }
                        Values.restoreValuesFromVector( _values6 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                      }
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$16, thread );
                  }
                }
                finally
                {
                  pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_1_$16, thread );
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$15, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$14, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values7 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( get_ql_index_input_file_base_name() );
                Values.restoreValuesFromVector( _values7 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
              }
            }
          }
          finally
          {
            xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values8 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values8 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
        }
      }
    }
    error = file_utilities.why_not_probe_fileP( pathname );
    if( NIL != error )
    {
      report_ql_indexing_error( pathname, error );
      error = NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 19314L)
  public static SubLObject encapsulate_query_template(final SubLObject template, SubLObject formula, SubLObject gloss)
  {
    if( formula == UNPROVIDED )
    {
      formula = NIL;
    }
    if( gloss == UNPROVIDED )
    {
      gloss = NIL;
    }
    final SubLObject id_string = kb_utilities.hl_external_id_string( template );
    final SubLObject template_gloss = ( NIL != string_utilities.non_empty_string_p( gloss ) ) ? gloss
        : ( ( NIL != kb_indexing_datastructures.indexed_term_p( template ) ) ? kb_mapping_utilities.fpred_value_in_any_mt( template, $const65$formulaTemplateGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL );
    final SubLObject query_spec = ( NIL != kb_indexing_datastructures.indexed_term_p( template ) ) ? kb_mapping_utilities.fpred_value_in_any_mt( template, $const66$querySpecificationForFormulaTempl, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) : NIL;
    final SubLObject query_cycl = ( NIL != cycl_grammar.cycl_term_p( formula ) && !formula.isString() && !formula.isKeyword() ) ? formula
        : ( ( NIL != kb_indexing_datastructures.indexed_term_p( query_spec ) ) ? cycl_for_test_query_in_any_mt( query_spec ) : NIL );
    final SubLObject query_string = ( NIL != query_cycl ) ? pph_question.generate_question( query_cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    SubLObject v_encapsulation = NIL;
    if( NIL != string_utilities.non_empty_string_p( id_string ) )
    {
      v_encapsulation = ConsesLow.list( $kw44$TERM, template );
      conses_high.putf( v_encapsulation, $kw60$ID, id_string );
      if( NIL != query_cycl )
      {
        conses_high.putf( v_encapsulation, $kw19$CYCL, query_cycl );
        if( NIL != string_utilities.non_empty_string_p( query_string ) )
        {
          conses_high.putf( v_encapsulation, $kw61$GENERATION, query_string );
        }
        if( NIL != string_utilities.non_empty_string_p( template_gloss ) )
        {
          conses_high.putf( v_encapsulation, $kw20$GLOSS, template_gloss );
        }
      }
      conses_high.putf( v_encapsulation, $kw67$KB, control_vars.kb_loaded() );
      conses_high.putf( v_encapsulation, $kw68$PROCESS, format_nil.format_nil_a( Threads.current_process() ) );
      conses_high.putf( v_encapsulation, $kw69$HOST, Environment.get_machine_name( UNPROVIDED ) );
      conses_high.putf( v_encapsulation, $kw70$USER, format_nil.format_nil_a( operation_communication.the_cyclist() ) );
      conses_high.putf( v_encapsulation, $kw71$TIME, numeric_date_utilities.safe_timestring( Time.get_universal_time() ) );
    }
    return v_encapsulation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 20803L)
  public static SubLObject get_ql_index_input_file_pathname(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    SubLObject subdir_path = NIL;
    SubLObject pathname = NIL;
    if( NIL != subl_promotions.positive_integer_p( kb ) )
    {
      subdir_path = find_or_create_index_directory( kb, $kw72$ROOT );
      if( NIL != string_utilities.non_empty_string_p( subdir_path ) )
      {
        pathname = subl_promotions.ensure_physical_pathname( file_utilities.relative_filename( subdir_path, get_ql_index_input_file_base_name(), $ql_index_sc_xml$.getGlobalValue() ) );
      }
    }
    return pathname;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 21243L)
  public static SubLObject segments_file_exists_p(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    SubLObject ans = NIL;
    if( NIL != subl_promotions.positive_integer_p( kb ) )
    {
      final SubLObject subdir_path = make_index_directory_path( kb, $kw33$INDEX );
      final SubLObject filename = subl_promotions.ensure_physical_pathname( file_utilities.relative_filename( subdir_path, $ql_index_sc_segments$.getGlobalValue(), NIL ) );
      ans = list_utilities.sublisp_boolean( Filesys.probe_file( filename ) );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 21638L)
  public static SubLObject find_ql_index_directory(SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw72$ROOT;
    }
    SubLObject kb = control_vars.kb_loaded();
    SubLObject path_string = make_index_directory_path( kb, type );
    for( SubLObject v_tries = ZERO_INTEGER; v_tries.numL( TEN_INTEGER ); v_tries = Numbers.add( v_tries, ONE_INTEGER ) )
    {
      if( NIL != Filesys.probe_file( path_string ) )
      {
        return path_string;
      }
      kb = number_utilities.f_1_( kb );
      path_string = make_index_directory_path( kb, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 21997L)
  public static SubLObject find_or_create_index_directory(final SubLObject kb, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw72$ROOT;
    }
    final SubLObject path_string = make_index_directory_path( kb, type );
    if( NIL != file_utilities.make_directory_recursive( path_string, T, $ql_index_sc_file_permission$.getGlobalValue() ) )
    {
      return subl_promotions.ensure_physical_pathname( path_string );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 22275L)
  public static SubLObject make_index_directory_path(final SubLObject kb, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw72$ROOT;
    }
    final SubLObject dir_list = make_index_directory_list( kb, type );
    return subl_promotions.ensure_physical_pathname( file_utilities.cyc_home_subdirectory( dir_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 22475L)
  public static SubLObject make_index_directory_list(final SubLObject kb, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $kw72$ROOT;
    }
    final SubLObject root_dir_list = ConsesLow.append( get_ql_root_dir_list(), ConsesLow.list( format_nil.format_nil_s( kb ) ) );
    SubLObject sub_dir_list = NIL;
    final SubLObject pcase_var = type;
    if( pcase_var.eql( $kw73$INPUT ) )
    {
      sub_dir_list = ConsesLow.list( $ql_index_sc_input$.getGlobalValue() );
    }
    else if( pcase_var.eql( $kw33$INDEX ) )
    {
      sub_dir_list = ConsesLow.list( $ql_index_sc_index$.getGlobalValue() );
    }
    return ConsesLow.append( root_dir_list, sub_dir_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 22910L)
  public static SubLObject get_ql_root_dir_list()
  {
    return list_utilities.remove_if_not( $sym74$NON_EMPTY_STRING_P, string_utilities.split_string( lucene_index.get_ql_index_root_dir_names(), $list75 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 23078L)
  public static SubLObject cycl_for_test_query_in_any_mt(final SubLObject test_query)
  {
    return kb_query.kbq_sentences( test_query ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/ql-index-support.lisp", position = 23182L)
  public static SubLObject report_ql_indexing_error(final SubLObject v_object, final SubLObject error)
  {
    return NIL;
  }

  public static SubLObject declare_ql_index_support_file()
  {
    SubLFiles.declareFunction( me, "get_ql_index_threshold", "GET-QL-INDEX-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_threshold", "SET-QL-INDEX-THRESHOLD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_distance", "GET-QL-INDEX-DISTANCE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_distance", "SET-QL-INDEX-DISTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_input_file_base_name", "GET-QL-INDEX-INPUT-FILE-BASE-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_support_verbose", "SET-QL-INDEX-SUPPORT-VERBOSE", 0, 1, false );
    SubLFiles.declareFunction( me, "get_ql_index_support_verbose", "GET-QL-INDEX-SUPPORT-VERBOSE", 0, 0, false );
    SubLFiles.declareFunction( me, "index_queries_from_node", "INDEX-QUERIES-FROM-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_template_with_formula_and_gloss", "ADD-TEMPLATE-WITH-FORMULA-AND-GLOSS", 3, 0, false );
    SubLFiles.declareFunction( me, "indexed_queries_from_string", "INDEXED-QUERIES-FROM-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "old_indexed_queries_from_string_with_confidences", "OLD-INDEXED-QUERIES-FROM-STRING-WITH-CONFIDENCES", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_get_object_by_hl_id_string", "CLEAR-GET-OBJECT-BY-HL-ID-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_object_by_hl_id_string", "REMOVE-GET-OBJECT-BY-HL-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_object_by_hl_id_string_internal", "GET-OBJECT-BY-HL-ID-STRING-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_object_by_hl_id_string", "GET-OBJECT-BY-HL-ID-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "build_query_template_index", "BUILD-QUERY-TEMPLATE-INDEX", 0, 3, false );
    SubLFiles.declareFunction( me, "write_ql_index_input_file", "WRITE-QL-INDEX-INPUT-FILE", 0, 4, false );
    SubLFiles.declareFunction( me, "process_ql_index_queue_entries", "PROCESS-QL-INDEX-QUEUE-ENTRIES", 0, 0, false );
    SubLFiles.declareFunction( me, "process_ql_index_queue_entries_int", "PROCESS-QL-INDEX-QUEUE-ENTRIES-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "get_adler_checksum", "GET-ADLER-CHECKSUM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_update_procedure", "GET-QL-INDEX-UPDATE-PROCEDURE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_update_procedure", "SET-QL-INDEX-UPDATE-PROCEDURE", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_update_ql_index", "MAYBE-UPDATE-QL-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "enqueue_for_ql_indexing", "ENQUEUE-FOR-QL-INDEXING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_update_queue", "GET-QL-INDEX-UPDATE-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_dequeue_procedure", "GET-QL-INDEX-DEQUEUE-PROCEDURE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_ql_index_dequeue_procedure", "SET-QL-INDEX-DEQUEUE-PROCEDURE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_ql_index_update_process", "GET-QL-INDEX-UPDATE-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "start_ql_index_update_thread", "START-QL-INDEX-UPDATE-THREAD", 0, 1, false );
    SubLFiles.declareFunction( me, "initialize_ql_index_globals", "INITIALIZE-QL-INDEX-GLOBALS", 0, 0, false );
    SubLFiles.declareFunction( me, "extract_cycl_term_from_plist", "EXTRACT-CYCL-TERM-FROM-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "write_template_index_source_file", "WRITE-TEMPLATE-INDEX-SOURCE-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "encapsulate_query_template", "ENCAPSULATE-QUERY-TEMPLATE", 1, 2, false );
    SubLFiles.declareFunction( me, "get_ql_index_input_file_pathname", "GET-QL-INDEX-INPUT-FILE-PATHNAME", 0, 1, false );
    SubLFiles.declareFunction( me, "segments_file_exists_p", "SEGMENTS-FILE-EXISTS-P", 0, 1, false );
    SubLFiles.declareFunction( me, "find_ql_index_directory", "FIND-QL-INDEX-DIRECTORY", 0, 1, false );
    SubLFiles.declareFunction( me, "find_or_create_index_directory", "FIND-OR-CREATE-INDEX-DIRECTORY", 1, 1, false );
    SubLFiles.declareFunction( me, "make_index_directory_path", "MAKE-INDEX-DIRECTORY-PATH", 1, 1, false );
    SubLFiles.declareFunction( me, "make_index_directory_list", "MAKE-INDEX-DIRECTORY-LIST", 1, 1, false );
    SubLFiles.declareFunction( me, "get_ql_root_dir_list", "GET-QL-ROOT-DIR-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "cycl_for_test_query_in_any_mt", "CYCL-FOR-TEST-QUERY-IN-ANY-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "report_ql_indexing_error", "REPORT-QL-INDEXING-ERROR", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_ql_index_support_file()
  {
    $ql_index_sc_index$ = SubLFiles.defconstant( "*QL-INDEX-SC-INDEX*", $str0$index );
    $ql_index_sc_input$ = SubLFiles.defconstant( "*QL-INDEX-SC-INPUT*", $str1$input );
    $ql_index_sc_segments$ = SubLFiles.defconstant( "*QL-INDEX-SC-SEGMENTS*", $str2$segments );
    $ql_index_sc_xml$ = SubLFiles.defconstant( "*QL-INDEX-SC-XML*", $str3$xml );
    $ql_index_sc_file_permission$ = SubLFiles.defconstant( "*QL-INDEX-SC-FILE-PERMISSION*", $str4$777 );
    $ql_index_sc_from_address$ = SubLFiles.defconstant( "*QL-INDEX-SC-FROM-ADDRESS*", $str5$ql_qa_cyc_com );
    $ql_index_sc_to_address$ = SubLFiles.defconstant( "*QL-INDEX-SC-TO-ADDRESS*", $str6$nsiegel_cyc_com );
    $ql_index_support_verbose$ = SubLFiles.defvar( "*QL-INDEX-SUPPORT-VERBOSE*", NIL );
    $ql_index_threshold$ = SubLFiles.defparameter( "*QL-INDEX-THRESHOLD*", red_infrastructure_macros.red_def_helper( $list7.isSymbol() ? Symbols.symbol_value( $list7 ) : $list7, $sym8$_QL_INDEX_THRESHOLD_, $str9$3380
        .isSymbol() ? Symbols.symbol_value( $str9$3380 ) : $str9$3380, $kw10$PARAMETER, UNPROVIDED ) );
    $ql_index_distance$ = SubLFiles.defparameter( "*QL-INDEX-DISTANCE*", red_infrastructure_macros.red_def_helper( $list12.isSymbol() ? Symbols.symbol_value( $list12 ) : $list12, $sym13$_QL_INDEX_DISTANCE_, $str14$3381
        .isSymbol() ? Symbols.symbol_value( $str14$3381 ) : $str14$3381, $kw10$PARAMETER, UNPROVIDED ) );
    $get_object_by_hl_id_string_caching_state$ = SubLFiles.deflexical( "*GET-OBJECT-BY-HL-ID-STRING-CACHING-STATE*", NIL );
    $ql_index_update_procedure$ = SubLFiles.deflexical( "*QL-INDEX-UPDATE-PROCEDURE*", ( maybeDefault( $sym46$_QL_INDEX_UPDATE_PROCEDURE_, $ql_index_update_procedure$, $sym47$ENQUEUE_FOR_QL_INDEXING ) ) );
    $ql_index_update_queue$ = SubLFiles.deflexical( "*QL-INDEX-UPDATE-QUEUE*", ( maybeDefault( $sym50$_QL_INDEX_UPDATE_QUEUE_, $ql_index_update_queue$, NIL ) ) );
    $ql_index_dequeue_procedure$ = SubLFiles.deflexical( "*QL-INDEX-DEQUEUE-PROCEDURE*", ( maybeDefault( $sym52$_QL_INDEX_DEQUEUE_PROCEDURE_, $ql_index_dequeue_procedure$, $sym53$PROCESS_QL_INDEX_QUEUE_ENTRIES ) ) );
    $ql_index_update_process$ = SubLFiles.deflexical( "*QL-INDEX-UPDATE-PROCESS*", ( maybeDefault( $sym54$_QL_INDEX_UPDATE_PROCESS_, $ql_index_update_process$, $str55$The_process_object_responsible_fo ) ) );
    return NIL;
  }

  public static SubLObject setup_ql_index_support_file()
  {
    access_macros.register_external_symbol( $sym16$INDEX_QUERIES_FROM_NODE );
    access_macros.register_external_symbol( $sym24$INDEXED_QUERIES_FROM_STRING );
    memoization_state.note_globally_cached_function( $sym29$GET_OBJECT_BY_HL_ID_STRING );
    subl_macro_promotions.declare_defglobal( $sym46$_QL_INDEX_UPDATE_PROCEDURE_ );
    subl_macro_promotions.declare_defglobal( $sym50$_QL_INDEX_UPDATE_QUEUE_ );
    subl_macro_promotions.declare_defglobal( $sym52$_QL_INDEX_DEQUEUE_PROCEDURE_ );
    subl_macro_promotions.declare_defglobal( $sym54$_QL_INDEX_UPDATE_PROCESS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ql_index_support_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ql_index_support_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ql_index_support_file();
  }
  static
  {
    me = new ql_index_support();
    $ql_index_sc_index$ = null;
    $ql_index_sc_input$ = null;
    $ql_index_sc_segments$ = null;
    $ql_index_sc_xml$ = null;
    $ql_index_sc_file_permission$ = null;
    $ql_index_sc_from_address$ = null;
    $ql_index_sc_to_address$ = null;
    $ql_index_support_verbose$ = null;
    $ql_index_threshold$ = null;
    $ql_index_distance$ = null;
    $get_object_by_hl_id_string_caching_state$ = null;
    $ql_index_update_procedure$ = null;
    $ql_index_update_queue$ = null;
    $ql_index_dequeue_procedure$ = null;
    $ql_index_update_process$ = null;
    $str0$index = makeString( "index" );
    $str1$input = makeString( "input" );
    $str2$segments = makeString( "segments" );
    $str3$xml = makeString( "xml" );
    $str4$777 = makeString( "777" );
    $str5$ql_qa_cyc_com = makeString( "ql-qa@cyc.com" );
    $str6$nsiegel_cyc_com = makeString( "nsiegel@cyc.com" );
    $list7 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.threshold" ) );
    $sym8$_QL_INDEX_THRESHOLD_ = makeSymbol( "*QL-INDEX-THRESHOLD*" );
    $str9$3380 = makeString( "3380" );
    $kw10$PARAMETER = makeKeyword( "PARAMETER" );
    $float11$0_3 = makeDouble( 0.3 );
    $list12 = ConsesLow.list( makeString( "application.cyc-ir.lucene.ql-index.distance" ) );
    $sym13$_QL_INDEX_DISTANCE_ = makeSymbol( "*QL-INDEX-DISTANCE*" );
    $str14$3381 = makeString( "3381" );
    $float15$0_5 = makeDouble( 0.5 );
    $sym16$INDEX_QUERIES_FROM_NODE = makeSymbol( "INDEX-QUERIES-FROM-NODE" );
    $kw17$INDEXED = makeKeyword( "INDEXED" );
    $kw18$INDEX_UNINITIALIZED = makeKeyword( "INDEX-UNINITIALIZED" );
    $kw19$CYCL = makeKeyword( "CYCL" );
    $kw20$GLOSS = makeKeyword( "GLOSS" );
    $kw21$ERROR = makeKeyword( "ERROR" );
    $kw22$NEW = makeKeyword( "NEW" );
    $str23$___add_template_with_formula_and_ = makeString( "~%(add-template-with-formula-and-gloss ~a ~a ~s) => ~a" );
    $sym24$INDEXED_QUERIES_FROM_STRING = makeSymbol( "INDEXED-QUERIES-FROM-STRING" );
    $sym25$EXTRACT_CYCL_TERM_FROM_PLIST = makeSymbol( "EXTRACT-CYCL-TERM-FROM-PLIST" );
    $sym26$NUMBERP = makeSymbol( "NUMBERP" );
    $list27 = ConsesLow.list( makeSymbol( "ID-STRING" ), makeSymbol( "SCORE" ) );
    $kw28$WEIGHT = makeKeyword( "WEIGHT" );
    $sym29$GET_OBJECT_BY_HL_ID_STRING = makeSymbol( "GET-OBJECT-BY-HL-ID-STRING" );
    $sym30$_GET_OBJECT_BY_HL_ID_STRING_CACHING_STATE_ = makeSymbol( "*GET-OBJECT-BY-HL-ID-STRING-CACHING-STATE*" );
    $int31$5000 = makeInteger( 5000 );
    $const32$FormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplate" ) );
    $kw33$INDEX = makeKeyword( "INDEX" );
    $str34$Collecting_all_instances_of__S = makeString( "Collecting all instances of ~S" );
    $sym35$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const36$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $str37$___a_template_a_collected = makeString( "~%~a template~a collected" );
    $str38$ = makeString( "" );
    $str39$s = makeString( "s" );
    $int40$100 = makeInteger( 100 );
    $sym41$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str42$__QL_Index___s = makeString( "~%QL Index: ~s" );
    $str43$__Enter___process_ql_index_queue_ = makeString( "~%Enter: (process-ql-index-queue-entries-int ~s ~s)" );
    $kw44$TERM = makeKeyword( "TERM" );
    $str45$__Exit___process_ql_index_queue_e = makeString( "~%Exit: (process-ql-index-queue-entries-int ~s ~s) => ~a" );
    $sym46$_QL_INDEX_UPDATE_PROCEDURE_ = makeSymbol( "*QL-INDEX-UPDATE-PROCEDURE*" );
    $sym47$ENQUEUE_FOR_QL_INDEXING = makeSymbol( "ENQUEUE-FOR-QL-INDEXING" );
    $str48$___maybe_update_ql_index__a__a_ = makeString( "~%(maybe-update-ql-index ~a ~a)" );
    $str49$___maybe_update_ql_index__a__a___ = makeString( "~%(maybe-update-ql-index ~a ~a) : ~a" );
    $sym50$_QL_INDEX_UPDATE_QUEUE_ = makeSymbol( "*QL-INDEX-UPDATE-QUEUE*" );
    $str51$ql_index = makeString( "ql-index" );
    $sym52$_QL_INDEX_DEQUEUE_PROCEDURE_ = makeSymbol( "*QL-INDEX-DEQUEUE-PROCEDURE*" );
    $sym53$PROCESS_QL_INDEX_QUEUE_ENTRIES = makeSymbol( "PROCESS-QL-INDEX-QUEUE-ENTRIES" );
    $sym54$_QL_INDEX_UPDATE_PROCESS_ = makeSymbol( "*QL-INDEX-UPDATE-PROCESS*" );
    $str55$The_process_object_responsible_fo = makeString( "The process object responsible for unloading the \n   update queue for the QL Index Server index." );
    $str56$Update_QL_Index = makeString( "Update QL Index" );
    $kw57$OUTPUT = makeKeyword( "OUTPUT" );
    $str58$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw59$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw60$ID = makeKeyword( "ID" );
    $kw61$GENERATION = makeKeyword( "GENERATION" );
    $int62$200 = makeInteger( 200 );
    $str63$___A_template_forms_written_to__S = makeString( "~%~A template forms written to ~S" );
    $str64$___s = makeString( "~%~s" );
    $const65$formulaTemplateGloss = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateGloss" ) );
    $const66$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell( makeString( "querySpecificationForFormulaTemplate" ) );
    $kw67$KB = makeKeyword( "KB" );
    $kw68$PROCESS = makeKeyword( "PROCESS" );
    $kw69$HOST = makeKeyword( "HOST" );
    $kw70$USER = makeKeyword( "USER" );
    $kw71$TIME = makeKeyword( "TIME" );
    $kw72$ROOT = makeKeyword( "ROOT" );
    $kw73$INPUT = makeKeyword( "INPUT" );
    $sym74$NON_EMPTY_STRING_P = makeSymbol( "NON-EMPTY-STRING-P" );
    $list75 = ConsesLow.list( Characters.CHAR_vertical, Characters.CHAR_slash, Characters.CHAR_colon, Characters.CHAR_backslash );
  }
}
/*
 * 
 * Total time: 1080 ms
 * 
 */