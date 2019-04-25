package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class analysis_diagram_tool_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.analysis_diagram_tool_widgets";
  public static final String myFingerPrint = "95da389e71dc72771320dc7f5eefc1e985b61b4d9b05f451aef899bc707bc13d";
  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 867L)
  private static SubLSymbol $value_tables_api_success_for_kb_operations$;
  private static final SubLString $str0$All_KB_operations_completed_witho;
  private static final SubLSymbol $sym1$GET_VALUE_TABLE_IN_XML;
  private static final SubLSymbol $sym2$GET_VALUE_TABLES_IN_XML;
  private static final SubLString $str3$valueTables;
  private static final SubLString $str4$http___www_opencyc_org_xml_valueT;
  private static final SubLSymbol $kw5$UNINITIALIZED;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CREATE_VALUE_TABLE;
  private static final SubLString $str8$ValueTable;
  private static final SubLObject $const9$isa;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$DROP_VALUE_TABLE;
  private static final SubLSymbol $sym14$ADD_SOURCE_QUERY_TO_VALUE_TABLE;
  private static final SubLObject $const15$valueTableSourceQueries;
  private static final SubLObject $const16$queryResultSetForTable;
  private static final SubLSymbol $sym17$CONVERT_VARIABLE_AND_BINDINGS_TO_QUERY_RESULT_SET;
  private static final SubLObject $const18$TheSet;
  private static final SubLObject $const19$ELInferenceBindingFn;
  private static final SubLSymbol $sym20$GET_VARIABLE_MAPPING_TABLE_IN_XML;
  private static final SubLSymbol $sym21$GET_VARIABLE_MAPPINGS_FOR_QUERIES_IN_XML;
  private static final SubLSymbol $sym22$GET_VARIABLE_MAPPINGS_FOR_FORMULAS_IN_XML;
  private static final SubLSymbol $sym23$CYC_VAR_;
  private static final SubLString $str24$varMapTable;
  private static final SubLString $str25$http___www_opencyc_org_xml_varMap;
  private static final SubLSymbol $sym26$JOIN_FORMULAS_ALONG_VARIABLE_MAPPINGS;
  private static final SubLObject $const27$and;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$JOIN_QUERIES_ALONG_VARIABLE_MAPPINGS;
  private static final SubLSymbol $sym30$CREATE_VARIABLE_MAPPING_TABLE;
  private static final SubLObject $const31$VariableMappingTableFromArcOnDiag;
  private static final SubLObject $const32$variableMappingTableSourceFormula;
  private static final SubLObject $const33$variableMappingTableTargetFormula;
  private static final SubLSymbol $sym34$DROP_VARIABLE_MAPPING_TABLE;
  private static final SubLSymbol $sym35$ADD_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE;
  private static final SubLObject $const36$querySpecVariablesUnifyInTable_Wo;
  private static final SubLObject $const37$AnalysisOutputBindingsForVarFn;
  private static final SubLObject $const38$AnalysisInputBindingsForVarFn;
  private static final SubLSymbol $sym39$DROP_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE;

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 1085L)
  public static SubLObject get_value_table_in_xml(final SubLObject vtable_id, final SubLObject mt)
  {
    return get_value_tables_in_xml( ConsesLow.list( ConsesLow.list( vtable_id, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 1395L)
  public static SubLObject get_value_tables_in_xml(final SubLObject vtable_mt_pairs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject xml_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.generate_valid_xml_header( stream );
        xml_utilities.generate_xml_header_entry_for_dtd( $str3$valueTables, $str4$http___www_opencyc_org_xml_valueT, stream );
        try
        {
          final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str3$valueTables, NIL, NIL, NIL, $kw5$UNINITIALIZED );
            final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw5$UNINITIALIZED, thread );
              SubLObject cdolist_list_var = vtable_mt_pairs;
              SubLObject vtable_mt_pair = NIL;
              vtable_mt_pair = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = vtable_mt_pair;
                SubLObject vtable_id = NIL;
                SubLObject mt = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
                vtable_id = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
                mt = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  vtable_id = czer_main.coerce_to_fort( vtable_id );
                  mt = hlmt_czer.coerce_to_hlmt( mt );
                  final SubLObject vtable = value_tables.load_value_table_from_kb( vtable_id, mt );
                  xml_utilities.xml_terpri();
                  value_tables.xml_serialize_value_table( vtable, stream );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                vtable_mt_pair = cdolist_list_var.first();
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$2, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$1, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str3$valueTables );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 2335L)
  public static SubLObject create_value_table(SubLObject mt, SubLObject name)
  {
    if( name == UNPROVIDED )
    {
      name = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    if( !name.isString() )
    {
      name = glf_api_widgets.generic_suggest_new_name_for_component( $str8$ValueTable );
    }
    final SubLObject vtable = rkf_term_utilities.rkf_create( name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications( ConsesLow.list( reader.bq_cons( ConsesLow.listS( $const9$isa, vtable, $list10 ), $list11 ), ConsesLow.list( ConsesLow.listS(
        $const9$isa, vtable, $list12 ), mt ) ), $value_tables_api_success_for_kb_operations$.getGlobalValue() );
    final SubLObject message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      rkf_term_utilities.rkf_kill( vtable );
      return Values.values( NIL, message );
    }
    return Values.values( vtable, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 3130L)
  public static SubLObject drop_value_table(final SubLObject vtable)
  {
    rkf_term_utilities.rkf_kill( vtable );
    return Values.values( T, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 3407L)
  public static SubLObject add_source_query_to_value_table(final SubLObject vtable, final SubLObject query, final SubLObject query_result_set, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    thread.resetMultipleValues();
    final SubLObject successP = glf_api_widgets.generic_assert_assertion_specifications( ConsesLow.list( ConsesLow.list( ConsesLow.list( $const15$valueTableSourceQueries, vtable, query ), mt ), ConsesLow.list( ConsesLow
        .list( $const16$queryResultSetForTable, query, query_result_set, vtable ), mt ) ), $value_tables_api_success_for_kb_operations$.getGlobalValue() );
    final SubLObject message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( successP, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 4116L)
  public static SubLObject convert_variable_and_bindings_to_query_result_set(final SubLObject variable, final SubLObject values)
  {
    SubLObject query_result_set = NIL;
    SubLObject cdolist_list_var = values;
    SubLObject value = NIL;
    value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      query_result_set = ConsesLow.cons( ConsesLow.list( $const18$TheSet, ConsesLow.list( $const19$ELInferenceBindingFn, variable, value ) ), query_result_set );
      cdolist_list_var = cdolist_list_var.rest();
      value = cdolist_list_var.first();
    }
    return ConsesLow.cons( $const18$TheSet, Sequences.nreverse( query_result_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 4642L)
  public static SubLObject get_variable_mapping_table_in_xml(final SubLObject table_id, SubLObject mt, SubLObject source_query, SubLObject target_query)
  {
    if( source_query == UNPROVIDED )
    {
      source_query = NIL;
    }
    if( target_query == UNPROVIDED )
    {
      target_query = NIL;
    }
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject varmap = value_tables.load_variable_mapping_table_from_kb( table_id, mt, source_query, target_query );
    return generate_varmap_xml_description_string( varmap );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 5279L)
  public static SubLObject get_variable_mappings_for_queries_in_xml(final SubLObject source_query, final SubLObject target_query, SubLObject mt)
  {
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject varmap = value_tables.load_variable_mapping_table_from_kb( NIL, mt, source_query, target_query );
    return generate_varmap_xml_description_string( varmap );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 5822L)
  public static SubLObject get_variable_mappings_for_formulas_in_xml(final SubLObject source_formula, final SubLObject target_formula, SubLObject mt, SubLObject varP, SubLObject free_variables_onlyP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym23$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        mt = hlmt_czer.coerce_to_hlmt( mt );
        final SubLObject varmap = value_tables.get_variable_mapping_table_for_formulas( source_formula, target_formula, mt, varP, free_variables_onlyP );
        ans = generate_varmap_xml_description_string( varmap );
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 6524L)
  public static SubLObject generate_varmap_xml_description_string(final SubLObject varmap)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject xml_string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( stream, thread );
        xml_utilities.generate_valid_xml_header( stream );
        xml_utilities.generate_xml_header_entry_for_dtd( $str24$varMapTable, $str25$http___www_opencyc_org_xml_varMap, stream );
        xml_utilities.xml_terpri();
        value_tables.xml_serialize_variable_mapping_table( varmap, stream );
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      xml_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return xml_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 6974L)
  public static SubLObject join_formulas_along_variable_mappings(final SubLObject source_formula, final SubLObject target_formula, final SubLObject varmappings, SubLObject connective)
  {
    if( connective == UNPROVIDED )
    {
      connective = $const27$and;
    }
    final SubLObject new_formula = el_utilities.make_binary_formula( connective, source_formula, target_formula );
    SubLObject cdolist_list_var = varmappings;
    SubLObject variable_mapping = NIL;
    variable_mapping = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = variable_mapping;
      SubLObject source_var = NIL;
      SubLObject target_var = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
      source_var = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
      target_var = current.first();
      current = current.rest();
      if( NIL == current )
      {
        conses_high.nsubst( target_var, source_var, new_formula, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      variable_mapping = cdolist_list_var.first();
    }
    return simplifier.simplify_cycl_sentence_syntax( new_formula, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 7846L)
  public static SubLObject join_queries_along_variable_mappings(final SubLObject source_query, final SubLObject target_query, final SubLObject varmappings, final SubLObject mt, SubLObject connective)
  {
    if( connective == UNPROVIDED )
    {
      connective = $const27$and;
    }
    final SubLObject source = new_cycl_query_specification.load_new_cycl_query_specification_from_kb( source_query, UNPROVIDED );
    final SubLObject target = new_cycl_query_specification.load_new_cycl_query_specification_from_kb( target_query, UNPROVIDED );
    return join_formulas_along_variable_mappings( new_cycl_query_specification.new_cycl_query_specification_formula( source ), new_cycl_query_specification.new_cycl_query_specification_formula( target ), varmappings,
        connective );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 8721L)
  public static SubLObject create_variable_mapping_table(final SubLObject graph_id, final SubLObject arc_id, final SubLObject source_query, final SubLObject target_query, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    final SubLObject ais = graphic_library_format.map_glf_graph_to_ais( graph_id, mt );
    final SubLObject table_id = ConsesLow.list( $const31$VariableMappingTableFromArcOnDiag, arc_id, ais );
    final SubLObject source_sentence = ConsesLow.list( $const32$variableMappingTableSourceFormula, table_id, source_query );
    final SubLObject target_sentence = ConsesLow.list( $const33$variableMappingTableTargetFormula, table_id, target_query );
    thread.resetMultipleValues();
    final SubLObject successP = rkf_assertion_utilities.rkf_assert_now( source_sentence, mt );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return Values.values( NIL, reason );
    }
    thread.resetMultipleValues();
    final SubLObject target_successP = rkf_assertion_utilities.rkf_assert_now( target_sentence, mt );
    final SubLObject target_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == target_successP )
    {
      rkf_assertion_utilities.rkf_unassert( source_sentence, mt );
      return Values.values( NIL, target_reason );
    }
    return Values.values( table_id, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 10084L)
  public static SubLObject drop_variable_mapping_table(SubLObject table_id)
  {
    table_id = czer_main.coerce_to_fort( table_id );
    cyc_kernel.cyc_kill( table_id );
    return Values.values( T, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 10472L)
  public static SubLObject add_variable_assignment_to_varmap_table(final SubLObject table_id, final SubLObject source_query, final SubLObject source_variable, final SubLObject target_query,
      final SubLObject target_variable, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    thread.resetMultipleValues();
    final SubLObject successP = rkf_assertion_utilities.rkf_assert_now( ConsesLow.list( $const36$querySpecVariablesUnifyInTable_Wo, source_query, ConsesLow.list( $const37$AnalysisOutputBindingsForVarFn,
        source_variable ), target_query, ConsesLow.list( $const38$AnalysisInputBindingsForVarFn, target_variable ), table_id ), mt );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return Values.values( NIL, reason );
    }
    return Values.values( T, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/analysis-diagram-tool-widgets.lisp", position = 11362L)
  public static SubLObject drop_variable_assignment_to_varmap_table(final SubLObject table_id, final SubLObject source_query, final SubLObject source_variable, final SubLObject target_query,
      final SubLObject target_variable, SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    mt = hlmt_czer.coerce_to_hlmt( mt );
    thread.resetMultipleValues();
    final SubLObject successP = rkf_assertion_utilities.rkf_unassert( ConsesLow.list( $const36$querySpecVariablesUnifyInTable_Wo, source_query, ConsesLow.list( $const37$AnalysisOutputBindingsForVarFn, source_variable ),
        target_query, ConsesLow.list( $const38$AnalysisInputBindingsForVarFn, target_variable ), table_id ), mt );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == successP )
    {
      return Values.values( NIL, reason );
    }
    return Values.values( T, $value_tables_api_success_for_kb_operations$.getGlobalValue() );
  }

  public static SubLObject declare_analysis_diagram_tool_widgets_file()
  {
    SubLFiles.declareFunction( me, "get_value_table_in_xml", "GET-VALUE-TABLE-IN-XML", 2, 0, false );
    SubLFiles.declareFunction( me, "get_value_tables_in_xml", "GET-VALUE-TABLES-IN-XML", 1, 0, false );
    SubLFiles.declareFunction( me, "create_value_table", "CREATE-VALUE-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "drop_value_table", "DROP-VALUE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_source_query_to_value_table", "ADD-SOURCE-QUERY-TO-VALUE-TABLE", 4, 0, false );
    SubLFiles.declareFunction( me, "convert_variable_and_bindings_to_query_result_set", "CONVERT-VARIABLE-AND-BINDINGS-TO-QUERY-RESULT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "get_variable_mapping_table_in_xml", "GET-VARIABLE-MAPPING-TABLE-IN-XML", 2, 2, false );
    SubLFiles.declareFunction( me, "get_variable_mappings_for_queries_in_xml", "GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML", 3, 0, false );
    SubLFiles.declareFunction( me, "get_variable_mappings_for_formulas_in_xml", "GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML", 3, 2, false );
    SubLFiles.declareFunction( me, "generate_varmap_xml_description_string", "GENERATE-VARMAP-XML-DESCRIPTION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "join_formulas_along_variable_mappings", "JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS", 3, 1, false );
    SubLFiles.declareFunction( me, "join_queries_along_variable_mappings", "JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS", 4, 1, false );
    SubLFiles.declareFunction( me, "create_variable_mapping_table", "CREATE-VARIABLE-MAPPING-TABLE", 5, 0, false );
    SubLFiles.declareFunction( me, "drop_variable_mapping_table", "DROP-VARIABLE-MAPPING-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "add_variable_assignment_to_varmap_table", "ADD-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE", 6, 0, false );
    SubLFiles.declareFunction( me, "drop_variable_assignment_to_varmap_table", "DROP-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE", 6, 0, false );
    return NIL;
  }

  public static SubLObject init_analysis_diagram_tool_widgets_file()
  {
    $value_tables_api_success_for_kb_operations$ = SubLFiles.deflexical( "*VALUE-TABLES-API-SUCCESS-FOR-KB-OPERATIONS*", $str0$All_KB_operations_completed_witho );
    return NIL;
  }

  public static SubLObject setup_analysis_diagram_tool_widgets_file()
  {
    access_macros.register_external_symbol( $sym1$GET_VALUE_TABLE_IN_XML );
    access_macros.register_external_symbol( $sym2$GET_VALUE_TABLES_IN_XML );
    access_macros.register_external_symbol( $sym7$CREATE_VALUE_TABLE );
    access_macros.register_external_symbol( $sym13$DROP_VALUE_TABLE );
    access_macros.register_external_symbol( $sym14$ADD_SOURCE_QUERY_TO_VALUE_TABLE );
    access_macros.register_external_symbol( $sym17$CONVERT_VARIABLE_AND_BINDINGS_TO_QUERY_RESULT_SET );
    access_macros.register_external_symbol( $sym20$GET_VARIABLE_MAPPING_TABLE_IN_XML );
    access_macros.register_external_symbol( $sym21$GET_VARIABLE_MAPPINGS_FOR_QUERIES_IN_XML );
    access_macros.register_external_symbol( $sym22$GET_VARIABLE_MAPPINGS_FOR_FORMULAS_IN_XML );
    access_macros.register_external_symbol( $sym26$JOIN_FORMULAS_ALONG_VARIABLE_MAPPINGS );
    access_macros.register_external_symbol( $sym29$JOIN_QUERIES_ALONG_VARIABLE_MAPPINGS );
    access_macros.register_external_symbol( $sym30$CREATE_VARIABLE_MAPPING_TABLE );
    access_macros.register_external_symbol( $sym34$DROP_VARIABLE_MAPPING_TABLE );
    access_macros.register_external_symbol( $sym35$ADD_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE );
    access_macros.register_external_symbol( $sym39$DROP_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_analysis_diagram_tool_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_analysis_diagram_tool_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_analysis_diagram_tool_widgets_file();
  }
  static
  {
    me = new analysis_diagram_tool_widgets();
    $value_tables_api_success_for_kb_operations$ = null;
    $str0$All_KB_operations_completed_witho = makeString( "All KB operations completed without error." );
    $sym1$GET_VALUE_TABLE_IN_XML = makeSymbol( "GET-VALUE-TABLE-IN-XML" );
    $sym2$GET_VALUE_TABLES_IN_XML = makeSymbol( "GET-VALUE-TABLES-IN-XML" );
    $str3$valueTables = makeString( "valueTables" );
    $str4$http___www_opencyc_org_xml_valueT = makeString( "http://www.opencyc.org/xml/valueTables.dtd" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list6 = ConsesLow.list( makeSymbol( "VTABLE-ID" ), makeSymbol( "MT" ) );
    $sym7$CREATE_VALUE_TABLE = makeSymbol( "CREATE-VALUE-TABLE" );
    $str8$ValueTable = makeString( "ValueTable" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $list11 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) ) );
    $list12 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ValueTable-PCW" ) ) );
    $sym13$DROP_VALUE_TABLE = makeSymbol( "DROP-VALUE-TABLE" );
    $sym14$ADD_SOURCE_QUERY_TO_VALUE_TABLE = makeSymbol( "ADD-SOURCE-QUERY-TO-VALUE-TABLE" );
    $const15$valueTableSourceQueries = constant_handles.reader_make_constant_shell( makeString( "valueTableSourceQueries" ) );
    $const16$queryResultSetForTable = constant_handles.reader_make_constant_shell( makeString( "queryResultSetForTable" ) );
    $sym17$CONVERT_VARIABLE_AND_BINDINGS_TO_QUERY_RESULT_SET = makeSymbol( "CONVERT-VARIABLE-AND-BINDINGS-TO-QUERY-RESULT-SET" );
    $const18$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $const19$ELInferenceBindingFn = constant_handles.reader_make_constant_shell( makeString( "ELInferenceBindingFn" ) );
    $sym20$GET_VARIABLE_MAPPING_TABLE_IN_XML = makeSymbol( "GET-VARIABLE-MAPPING-TABLE-IN-XML" );
    $sym21$GET_VARIABLE_MAPPINGS_FOR_QUERIES_IN_XML = makeSymbol( "GET-VARIABLE-MAPPINGS-FOR-QUERIES-IN-XML" );
    $sym22$GET_VARIABLE_MAPPINGS_FOR_FORMULAS_IN_XML = makeSymbol( "GET-VARIABLE-MAPPINGS-FOR-FORMULAS-IN-XML" );
    $sym23$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $str24$varMapTable = makeString( "varMapTable" );
    $str25$http___www_opencyc_org_xml_varMap = makeString( "http://www.opencyc.org/xml/varMapTable.dtd" );
    $sym26$JOIN_FORMULAS_ALONG_VARIABLE_MAPPINGS = makeSymbol( "JOIN-FORMULAS-ALONG-VARIABLE-MAPPINGS" );
    $const27$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list28 = ConsesLow.list( makeSymbol( "SOURCE-VAR" ), makeSymbol( "TARGET-VAR" ) );
    $sym29$JOIN_QUERIES_ALONG_VARIABLE_MAPPINGS = makeSymbol( "JOIN-QUERIES-ALONG-VARIABLE-MAPPINGS" );
    $sym30$CREATE_VARIABLE_MAPPING_TABLE = makeSymbol( "CREATE-VARIABLE-MAPPING-TABLE" );
    $const31$VariableMappingTableFromArcOnDiag = constant_handles.reader_make_constant_shell( makeString( "VariableMappingTableFromArcOnDiagramFn" ) );
    $const32$variableMappingTableSourceFormula = constant_handles.reader_make_constant_shell( makeString( "variableMappingTableSourceFormula-QuerySpec" ) );
    $const33$variableMappingTableTargetFormula = constant_handles.reader_make_constant_shell( makeString( "variableMappingTableTargetFormula-QuerySpec" ) );
    $sym34$DROP_VARIABLE_MAPPING_TABLE = makeSymbol( "DROP-VARIABLE-MAPPING-TABLE" );
    $sym35$ADD_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE = makeSymbol( "ADD-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE" );
    $const36$querySpecVariablesUnifyInTable_Wo = constant_handles.reader_make_constant_shell( makeString( "querySpecVariablesUnifyInTable-WorkaroundPred" ) );
    $const37$AnalysisOutputBindingsForVarFn = constant_handles.reader_make_constant_shell( makeString( "AnalysisOutputBindingsForVarFn" ) );
    $const38$AnalysisInputBindingsForVarFn = constant_handles.reader_make_constant_shell( makeString( "AnalysisInputBindingsForVarFn" ) );
    $sym39$DROP_VARIABLE_ASSIGNMENT_TO_VARMAP_TABLE = makeSymbol( "DROP-VARIABLE-ASSIGNMENT-TO-VARMAP-TABLE" );
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */