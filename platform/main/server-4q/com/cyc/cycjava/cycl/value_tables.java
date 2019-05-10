package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class value_tables
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.value_tables";
  public static final String myFingerPrint = "afae5de018904beba3a485122de818d5f1e5f8dd69382ced87a797a79c3bc0f0";
  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLSymbol $dtp_value_table_column$;
  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLSymbol $dtp_value_table$;
  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLSymbol $dtp_variable_mapping_table$;
  private static final SubLSymbol $sym0$VALUE_TABLE_COLUMN;
  private static final SubLSymbol $sym1$VALUE_TABLE_COLUMN_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_VALUE_TABLE_COLUMN;
  private static final SubLSymbol $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$VALUE_TABLE_COLUMN_QUERY;
  private static final SubLSymbol $sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY;
  private static final SubLSymbol $sym11$VALUE_TABLE_COLUMN_LABEL;
  private static final SubLSymbol $sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL;
  private static final SubLSymbol $sym13$VALUE_TABLE_COLUMN_VALUES;
  private static final SubLSymbol $sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES;
  private static final SubLSymbol $kw15$QUERY;
  private static final SubLSymbol $kw16$LABEL;
  private static final SubLSymbol $kw17$VALUES;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_VALUE_TABLE_COLUMN;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD;
  private static final SubLString $str24$__ValueTableColumn_;
  private static final SubLString $str25$_A___S____supported_values___S;
  private static final SubLString $str26$_;
  private static final SubLString $str27$valueTableColumn;
  private static final SubLSymbol $kw28$UNINITIALIZED;
  private static final SubLString $str29$valueTableQuery;
  private static final SubLString $str30$valueTableLabel;
  private static final SubLString $str31$valueTableValues;
  private static final SubLString $str32$valueTableValue;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$RESULT_SET;
  private static final SubLObject $const36$validQueryResultForTable;
  private static final SubLSymbol $sym37$VALUE_TABLE;
  private static final SubLSymbol $sym38$VALUE_TABLE_P;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$PRINT_VALUE_TABLE;
  private static final SubLSymbol $sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$VALUE_TABLE_ID;
  private static final SubLSymbol $sym47$_CSETF_VALUE_TABLE_ID;
  private static final SubLSymbol $sym48$VALUE_TABLE_LABEL;
  private static final SubLSymbol $sym49$_CSETF_VALUE_TABLE_LABEL;
  private static final SubLSymbol $sym50$VALUE_TABLE_INPUT_COLUMNS;
  private static final SubLSymbol $sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS;
  private static final SubLSymbol $sym52$VALUE_TABLE_OUTPUT_COLUMN;
  private static final SubLSymbol $sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN;
  private static final SubLSymbol $sym54$VALUE_TABLE_ASSIGNMENTS;
  private static final SubLSymbol $sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS;
  private static final SubLSymbol $kw56$ID;
  private static final SubLSymbol $kw57$INPUT_COLUMNS;
  private static final SubLSymbol $kw58$OUTPUT_COLUMN;
  private static final SubLSymbol $kw59$ASSIGNMENTS;
  private static final SubLSymbol $sym60$MAKE_VALUE_TABLE;
  private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD;
  private static final SubLString $str62$__ValueTable_;
  private static final SubLString $str63$_S___A___;
  private static final SubLString $str64$_Input_Columns__;
  private static final SubLString $str65$_____S__;
  private static final SubLString $str66$_Output_Column__;
  private static final SubLString $str67$_Existing_Assignments__;
  private static final SubLSymbol $sym68$FORT_P;
  private static final SubLSymbol $sym69$HLMT_P;
  private static final SubLString $str70$valueTable;
  private static final SubLString $str71$valueTableId;
  private static final SubLString $str72$valueTableInputColumns;
  private static final SubLString $str73$valueTableOutputColumns;
  private static final SubLString $str74$valueTableAssignments;
  private static final SubLString $str75$valueTableAssignment;
  private static final SubLList $list76;
  private static final SubLString $str77$valueTableAssignmentSources;
  private static final SubLString $str78$valueTableAssignmentTuple;
  private static final SubLList $list79;
  private static final SubLString $str80$valueTableAssignmentTargets;
  private static final SubLSymbol $kw81$INPUT_QUERIES;
  private static final SubLObject $const82$valueTableSourceQueries;
  private static final SubLList $list83;
  private static final SubLSymbol $kw84$OUTPUT_QUERY;
  private static final SubLObject $const85$valueTableTargetQuery;
  private static final SubLList $list86;
  private static final SubLList $list87;
  private static final SubLObject $const88$queryResultsCombineInTable;
  private static final SubLSymbol $sym89$_SOURCES;
  private static final SubLSymbol $sym90$_TARGETS;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$REST;
  private static final SubLSymbol $sym93$VARIABLE_MAPPING_TABLE;
  private static final SubLSymbol $sym94$VARIABLE_MAPPING_TABLE_P;
  private static final SubLList $list95;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$PRINT_VARMAP_TABLE;
  private static final SubLSymbol $sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$VARIABLE_MAPPING_TABLE_ID;
  private static final SubLSymbol $sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID;
  private static final SubLSymbol $sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY;
  private static final SubLSymbol $sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY;
  private static final SubLSymbol $sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY;
  private static final SubLSymbol $sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY;
  private static final SubLSymbol $sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES;
  private static final SubLSymbol $sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES;
  private static final SubLSymbol $sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES;
  private static final SubLSymbol $sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES;
  private static final SubLSymbol $sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES;
  private static final SubLSymbol $sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES;
  private static final SubLSymbol $sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS;
  private static final SubLSymbol $sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS;
  private static final SubLSymbol $kw116$SOURCE_QUERY;
  private static final SubLSymbol $kw117$TARGET_QUERY;
  private static final SubLSymbol $kw118$SOURCE_VARIABLES;
  private static final SubLSymbol $kw119$TARGET_VARIABLES;
  private static final SubLSymbol $kw120$INCOMPATIBLES;
  private static final SubLSymbol $sym121$MAKE_VARIABLE_MAPPING_TABLE;
  private static final SubLSymbol $sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD;
  private static final SubLString $str123$__VariableMappingTable_;
  private static final SubLString $str124$_A_for__A_____A__;
  private static final SubLString $str125$anonymous;
  private static final SubLString $str126$no_source;
  private static final SubLString $str127$no_target;
  private static final SubLString $str128$_Source_Variables___A__;
  private static final SubLString $str129$_Target_Variables___A__;
  private static final SubLString $str130$_Incompatibilities__source_view__;
  private static final SubLString $str131$null_dictionary__;
  private static final SubLString $str132$_Current_Assignments___A__;
  private static final SubLString $str133$varMapTable;
  private static final SubLString $str134$varMapTableId;
  private static final SubLString $str135$varMapSourceQuery;
  private static final SubLString $str136$varMapTargetQuery;
  private static final SubLString $str137$varMapSourceVariables;
  private static final SubLString $str138$varMapTargetVariables;
  private static final SubLString $str139$varMapIncompatibles;
  private static final SubLString $str140$varMapIncompatible;
  private static final SubLString $str141$varMapSourceVariable;
  private static final SubLString $str142$varMapAssignments;
  private static final SubLString $str143$varMapAssignment;
  private static final SubLList $list144;
  private static final SubLString $str145$varMapTargetVariable;
  private static final SubLSymbol $sym146$CYC_VAR_;
  private static final SubLSymbol $kw147$SOURCE;
  private static final SubLObject $const148$variableMappingTableSourceFormula;
  private static final SubLList $list149;
  private static final SubLSymbol $kw150$TARGET;
  private static final SubLObject $const151$variableMappingTableTargetFormula;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLObject $const156$querySpecVariablesUnifyInTable_Wo;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLObject $const159$querySpecVariablesUnifyInTable;
  private static final SubLSymbol $sym160$_SOURCE_VAR;
  private static final SubLSymbol $sym161$_TARGET_VAR;
  private static final SubLSymbol $sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS;
  private static final SubLSymbol $sym163$FUNCTION_SPEC_P;

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject value_table_column_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_value_table_column( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject value_table_column_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $value_table_column_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject value_table_column_query(final SubLObject v_object)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject value_table_column_label(final SubLObject v_object)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject value_table_column_values(final SubLObject v_object)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject _csetf_value_table_column_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject _csetf_value_table_column_label(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject _csetf_value_table_column_values(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_column_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject make_value_table_column(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $value_table_column_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$QUERY ) )
      {
        _csetf_value_table_column_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$LABEL ) )
      {
        _csetf_value_table_column_label( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$VALUES ) )
      {
        _csetf_value_table_column_values( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject visit_defstruct_value_table_column(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_VALUE_TABLE_COLUMN, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$QUERY, value_table_column_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$LABEL, value_table_column_label( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$VALUES, value_table_column_values( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_VALUE_TABLE_COLUMN, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 873L)
  public static SubLObject visit_defstruct_object_value_table_column_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_value_table_column( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1224L)
  public static SubLObject print_value_table_column(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str24$__ValueTableColumn_, stream, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str25$_A___S____supported_values___S, new SubLObject[] { value_table_column_query( v_object ), value_table_column_label( v_object ), value_table_column_values( v_object )
    } );
    streams_high.write_string( $str26$_, stream, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1581L)
  public static SubLObject new_value_table_column(final SubLObject query_id)
  {
    final SubLObject column = make_value_table_column( UNPROVIDED );
    _csetf_value_table_column_query( column, query_id );
    return column;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 1751L)
  public static SubLObject load_value_table_column_from_kb(final SubLObject vtable_id, final SubLObject query_id, final SubLObject elmt)
  {
    final SubLObject column = new_value_table_column( query_id );
    final SubLObject values = get_vtbl_query_result_values( vtable_id, query_id, elmt );
    _csetf_value_table_column_values( column, values );
    _csetf_value_table_column_label( column, pph_main.generate_phrase( query_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return column;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 2152L)
  public static SubLObject xml_serialize_value_table_column(final SubLObject column, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != value_table_column_p( column ) : column;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      try
      {
        final SubLObject _prev_bind_0_$1 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str27$valueTableColumn, NIL, NIL, NIL, $kw28$UNINITIALIZED );
          final SubLObject _prev_bind_0_$2 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str29$valueTableQuery, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( value_table_column_query( column ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$4, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$3, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str29$valueTableQuery );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
            try
            {
              final SubLObject _prev_bind_0_$6 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$5 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str30$valueTableLabel, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                final SubLObject _prev_bind_0_$7 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( value_table_column_label( column ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$7, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$5, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$6, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str30$valueTableLabel );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
              }
            }
            if( NIL != value_table_column_values( column ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$9 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$6 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str31$valueTableValues, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$10 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = value_table_column_values( column );
                    SubLObject value = NIL;
                    value = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$11 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$7 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str32$valueTableValue, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$12 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                            cycml.cycml_serialize_term( value );
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$12, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$7, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$11, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values3 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str32$valueTableValue );
                          Values.restoreValuesFromVector( _values3 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                        }
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      value = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$10, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$6, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$9, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str31$valueTableValues );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
                }
              }
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
        final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values5 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str27$valueTableColumn );
          Values.restoreValuesFromVector( _values5 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return column;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 2809L)
  public static SubLObject get_vtbl_query_result_values(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt)
  {
    SubLObject result_values = NIL;
    SubLObject cdolist_list_var = get_vtbl_query_result_sets( vtable_id, query, elmt );
    SubLObject value = NIL;
    value = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = value;
      SubLObject the_set = NIL;
      SubLObject el_inference_binding = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      the_set = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      el_inference_binding = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$21;
        final SubLObject datum_$20 = current_$21 = el_inference_binding;
        SubLObject el_infbind_fn = NIL;
        SubLObject variable = NIL;
        SubLObject result_value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list34 );
        el_infbind_fn = current_$21.first();
        current_$21 = current_$21.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list34 );
        variable = current_$21.first();
        current_$21 = current_$21.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$21, datum_$20, $list34 );
        result_value = current_$21.first();
        current_$21 = current_$21.rest();
        if( NIL == current_$21 )
        {
          result_values = ConsesLow.cons( result_value, result_values );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$20, $list34 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      value = cdolist_list_var.first();
    }
    return result_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3280L)
  public static SubLObject get_vtbl_query_result_sets(final SubLObject vtable_id, final SubLObject query, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw35$RESULT_SET, ConsesLow.list( $const36$validQueryResultForTable, query, $kw35$RESULT_SET, vtable_id ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_value_table( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $value_table_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_id(final SubLObject v_object)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_label(final SubLObject v_object)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_input_columns(final SubLObject v_object)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_output_column(final SubLObject v_object)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject value_table_assignments(final SubLObject v_object)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject _csetf_value_table_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject _csetf_value_table_label(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject _csetf_value_table_input_columns(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject _csetf_value_table_output_column(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject _csetf_value_table_assignments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != value_table_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject make_value_table(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $value_table_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw56$ID ) )
      {
        _csetf_value_table_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$LABEL ) )
      {
        _csetf_value_table_label( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$INPUT_COLUMNS ) )
      {
        _csetf_value_table_input_columns( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$OUTPUT_COLUMN ) )
      {
        _csetf_value_table_output_column( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$ASSIGNMENTS ) )
      {
        _csetf_value_table_assignments( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject visit_defstruct_value_table(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym60$MAKE_VALUE_TABLE, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw56$ID, value_table_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$LABEL, value_table_label( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw57$INPUT_COLUMNS, value_table_input_columns( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw58$OUTPUT_COLUMN, value_table_output_column( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw59$ASSIGNMENTS, value_table_assignments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym60$MAKE_VALUE_TABLE, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3491L)
  public static SubLObject visit_defstruct_object_value_table_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_value_table( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 3928L)
  public static SubLObject print_value_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str62$__ValueTable_, stream, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str63$_S___A___, value_table_id( v_object ), value_table_label( v_object ) );
    streams_high.write_string( $str64$_Input_Columns__, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    SubLObject cdolist_list_var = value_table_input_columns( v_object );
    SubLObject input_column = NIL;
    input_column = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str65$_____S__, input_column );
      cdolist_list_var = cdolist_list_var.rest();
      input_column = cdolist_list_var.first();
    }
    streams_high.write_string( $str66$_Output_Column__, stream, UNPROVIDED, UNPROVIDED );
    streams_high.terpri( stream );
    final SubLObject output_column = value_table_output_column( v_object );
    PrintLow.format( stream, $str65$_____S__, output_column );
    if( NIL != value_table_assignments( v_object ) )
    {
      streams_high.write_string( $str67$_Existing_Assignments__, stream, UNPROVIDED, UNPROVIDED );
      streams_high.terpri( stream );
      PrintLow.format( stream, $str65$_____S__, value_table_assignments( v_object ) );
    }
    streams_high.write_string( $str26$_, stream, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 4682L)
  public static SubLObject new_value_table(final SubLObject id)
  {
    final SubLObject vtable = make_value_table( UNPROVIDED );
    _csetf_value_table_id( vtable, id );
    return vtable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 4820L)
  public static SubLObject load_value_table_from_kb(final SubLObject vtable_id, final SubLObject elmt)
  {
    assert NIL != forts.fort_p( vtable_id ) : vtable_id;
    assert NIL != hlmt.hlmt_p( elmt ) : elmt;
    final SubLObject vtable = new_value_table( vtable_id );
    final SubLObject input_queries = get_vtbl_input_queries( vtable_id, elmt );
    final SubLObject output_query = get_vtbl_output_query( vtable_id, elmt );
    SubLObject cdolist_list_var = input_queries;
    SubLObject input_query = NIL;
    input_query = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject column = load_value_table_column_from_kb( vtable_id, input_query, elmt );
      _csetf_value_table_input_columns( vtable, ConsesLow.cons( column, value_table_input_columns( vtable ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      input_query = cdolist_list_var.first();
    }
    _csetf_value_table_output_column( vtable, load_value_table_column_from_kb( vtable_id, output_query, elmt ) );
    _csetf_value_table_assignments( vtable, load_value_table_assignments_from_kb( vtable_id, elmt ) );
    _csetf_value_table_label( vtable, pph_main.generate_phrase( vtable_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return vtable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 5678L)
  public static SubLObject xml_serialize_value_table(final SubLObject vtable, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != value_table_p( vtable ) : vtable;
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      try
      {
        final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str70$valueTable, NIL, NIL, NIL, $kw28$UNINITIALIZED );
          final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
            try
            {
              final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$25 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str71$valueTableId, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( value_table_id( vtable ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$25, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$25, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$24, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str71$valueTableId );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
              }
            }
            try
            {
              final SubLObject _prev_bind_0_$27 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
              final SubLObject _prev_bind_1_$26 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
              try
              {
                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                xml_utilities.xml_start_tag_internal( $str30$valueTableLabel, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                final SubLObject _prev_bind_0_$28 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                try
                {
                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                  cycml.cycml_serialize_term( value_table_label( vtable ) );
                }
                finally
                {
                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$28, thread );
                }
              }
              finally
              {
                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$26, thread );
                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$27, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal( $str30$valueTableLabel );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
              }
            }
            if( NIL != value_table_input_columns( vtable ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$30 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str72$valueTableInputColumns, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$31 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = value_table_input_columns( vtable );
                    SubLObject column = NIL;
                    column = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      xml_serialize_value_table_column( column, stream );
                      cdolist_list_var = cdolist_list_var.rest();
                      column = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$31, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$27, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$30, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str72$valueTableInputColumns );
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
                }
              }
            }
            if( NIL != value_table_output_column( vtable ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$33 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$28 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str73$valueTableOutputColumns, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    xml_serialize_value_table_column( value_table_output_column( vtable ), stream );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$34, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$28, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$33, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str73$valueTableOutputColumns );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
                }
              }
            }
            if( NIL != value_table_assignments( vtable ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$29 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str74$valueTableAssignments, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = value_table_assignments( vtable );
                    SubLObject assignment = NIL;
                    assignment = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$30 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str75$valueTableAssignment, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$39 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                            SubLObject current;
                            final SubLObject datum = current = assignment;
                            SubLObject v_sources = NIL;
                            SubLObject targets = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list76 );
                            v_sources = current.first();
                            current = ( targets = current.rest() );
                            try
                            {
                              final SubLObject _prev_bind_0_$40 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$31 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str77$valueTableAssignmentSources, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$41 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                  SubLObject cdolist_list_var_$49 = v_sources;
                                  SubLObject source = NIL;
                                  source = cdolist_list_var_$49.first();
                                  while ( NIL != cdolist_list_var_$49)
                                  {
                                    try
                                    {
                                      final SubLObject _prev_bind_0_$42 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                      try
                                      {
                                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                            thread ) ), thread );
                                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                        xml_utilities.xml_start_tag_internal( $str78$valueTableAssignmentTuple, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                        final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                        try
                                        {
                                          xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                          SubLObject current_$54;
                                          final SubLObject datum_$53 = current_$54 = source;
                                          SubLObject query = NIL;
                                          SubLObject value = NIL;
                                          cdestructuring_bind.destructuring_bind_must_consp( current_$54, datum_$53, $list79 );
                                          query = current_$54.first();
                                          current_$54 = current_$54.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current_$54, datum_$53, $list79 );
                                          value = current_$54.first();
                                          current_$54 = current_$54.rest();
                                          if( NIL == current_$54 )
                                          {
                                            try
                                            {
                                              final SubLObject _prev_bind_0_$44 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                              final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                              try
                                              {
                                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                    .getDynamicValue( thread ) ), thread );
                                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                xml_utilities.xml_start_tag_internal( $str29$valueTableQuery, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                                final SubLObject _prev_bind_0_$45 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                try
                                                {
                                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                                  cycml.cycml_serialize_term( query );
                                                }
                                                finally
                                                {
                                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$45, thread );
                                                }
                                              }
                                              finally
                                              {
                                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$33, thread );
                                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$44, thread );
                                              }
                                            }
                                            finally
                                            {
                                              final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values5 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal( $str29$valueTableQuery );
                                                Values.restoreValuesFromVector( _values5 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$46, thread );
                                              }
                                            }
                                            try
                                            {
                                              final SubLObject _prev_bind_0_$47 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                              final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                              try
                                              {
                                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                    .getDynamicValue( thread ) ), thread );
                                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                xml_utilities.xml_start_tag_internal( $str32$valueTableValue, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                                final SubLObject _prev_bind_0_$48 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                try
                                                {
                                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                                  cycml.cycml_serialize_term( value );
                                                }
                                                finally
                                                {
                                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$48, thread );
                                                }
                                              }
                                              finally
                                              {
                                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$34, thread );
                                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$47, thread );
                                              }
                                            }
                                            finally
                                            {
                                              final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values6 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal( $str32$valueTableValue );
                                                Values.restoreValuesFromVector( _values6 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$49, thread );
                                              }
                                            }
                                          }
                                          else
                                          {
                                            cdestructuring_bind.cdestructuring_bind_error( datum_$53, $list79 );
                                          }
                                        }
                                        finally
                                        {
                                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$43, thread );
                                        }
                                      }
                                      finally
                                      {
                                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$32, thread );
                                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$42, thread );
                                      }
                                    }
                                    finally
                                    {
                                      final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        final SubLObject _values7 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal( $str78$valueTableAssignmentTuple );
                                        Values.restoreValuesFromVector( _values7 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$50, thread );
                                      }
                                    }
                                    cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                    source = cdolist_list_var_$49.first();
                                  }
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$41, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$31, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$40, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values8 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str77$valueTableAssignmentSources );
                                Values.restoreValuesFromVector( _values8 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$51, thread );
                              }
                            }
                            try
                            {
                              final SubLObject _prev_bind_0_$52 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$35 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str80$valueTableAssignmentTargets, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$53 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                  SubLObject cdolist_list_var_$50 = targets;
                                  SubLObject target = NIL;
                                  target = cdolist_list_var_$50.first();
                                  while ( NIL != cdolist_list_var_$50)
                                  {
                                    try
                                    {
                                      final SubLObject _prev_bind_0_$54 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                      final SubLObject _prev_bind_1_$36 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                      try
                                      {
                                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                            thread ) ), thread );
                                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                        xml_utilities.xml_start_tag_internal( $str78$valueTableAssignmentTuple, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                        final SubLObject _prev_bind_0_$55 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                        try
                                        {
                                          xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                          SubLObject current_$55;
                                          final SubLObject datum_$54 = current_$55 = target;
                                          SubLObject query = NIL;
                                          SubLObject value = NIL;
                                          cdestructuring_bind.destructuring_bind_must_consp( current_$55, datum_$54, $list79 );
                                          query = current_$55.first();
                                          current_$55 = current_$55.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current_$55, datum_$54, $list79 );
                                          value = current_$55.first();
                                          current_$55 = current_$55.rest();
                                          if( NIL == current_$55 )
                                          {
                                            try
                                            {
                                              final SubLObject _prev_bind_0_$56 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                              final SubLObject _prev_bind_1_$37 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                              try
                                              {
                                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                    .getDynamicValue( thread ) ), thread );
                                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                xml_utilities.xml_start_tag_internal( $str29$valueTableQuery, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                                final SubLObject _prev_bind_0_$57 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                try
                                                {
                                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                                  cycml.cycml_serialize_term( query );
                                                }
                                                finally
                                                {
                                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$57, thread );
                                                }
                                              }
                                              finally
                                              {
                                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$37, thread );
                                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$56, thread );
                                              }
                                            }
                                            finally
                                            {
                                              final SubLObject _prev_bind_0_$58 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values9 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal( $str29$valueTableQuery );
                                                Values.restoreValuesFromVector( _values9 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$58, thread );
                                              }
                                            }
                                            try
                                            {
                                              final SubLObject _prev_bind_0_$59 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                              final SubLObject _prev_bind_1_$38 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                              try
                                              {
                                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$
                                                    .getDynamicValue( thread ) ), thread );
                                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                                xml_utilities.xml_start_tag_internal( $str32$valueTableValue, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                                final SubLObject _prev_bind_0_$60 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                                try
                                                {
                                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                                  cycml.cycml_serialize_term( value );
                                                }
                                                finally
                                                {
                                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$60, thread );
                                                }
                                              }
                                              finally
                                              {
                                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$38, thread );
                                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$59, thread );
                                              }
                                            }
                                            finally
                                            {
                                              final SubLObject _prev_bind_0_$61 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                              try
                                              {
                                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                final SubLObject _values10 = Values.getValuesAsVector();
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal( $str32$valueTableValue );
                                                Values.restoreValuesFromVector( _values10 );
                                              }
                                              finally
                                              {
                                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$61, thread );
                                              }
                                            }
                                          }
                                          else
                                          {
                                            cdestructuring_bind.cdestructuring_bind_error( datum_$54, $list79 );
                                          }
                                        }
                                        finally
                                        {
                                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$55, thread );
                                        }
                                      }
                                      finally
                                      {
                                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$36, thread );
                                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$54, thread );
                                      }
                                    }
                                    finally
                                    {
                                      final SubLObject _prev_bind_0_$62 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                      try
                                      {
                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                        final SubLObject _values11 = Values.getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal( $str78$valueTableAssignmentTuple );
                                        Values.restoreValuesFromVector( _values11 );
                                      }
                                      finally
                                      {
                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$62, thread );
                                      }
                                    }
                                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                    target = cdolist_list_var_$50.first();
                                  }
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$53, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$35, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$52, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$63 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values12 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str80$valueTableAssignmentTargets );
                                Values.restoreValuesFromVector( _values12 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$63, thread );
                              }
                            }
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$39, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$30, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$38, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values13 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str75$valueTableAssignment );
                          Values.restoreValuesFromVector( _values13 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$64, thread );
                        }
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      assignment = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$29, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$36, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$65 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values14 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str74$valueTableAssignments );
                  Values.restoreValuesFromVector( _values14 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$65, thread );
                }
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$23, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$22, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$66 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values15 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str70$valueTable );
          Values.restoreValuesFromVector( _values15 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$66, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return vtable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 7670L)
  public static SubLObject get_vtbl_input_queries(final SubLObject vtable_id, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw81$INPUT_QUERIES, ConsesLow.listS( $const82$valueTableSourceQueries, vtable_id, $list83 ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 7872L)
  public static SubLObject get_vtbl_output_query(final SubLObject vtable_id, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw84$OUTPUT_QUERY, ConsesLow.listS( $const85$valueTableTargetQuery, vtable_id, $list86 ), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8091L)
  public static SubLObject load_value_table_assignments_from_kb(final SubLObject vtable_id, final SubLObject elmt)
  {
    final SubLObject v_bindings = ask_utilities.ask_template( $list87, ConsesLow.list( $const88$queryResultsCombineInTable, $sym89$_SOURCES, $sym90$_TARGETS, vtable_id ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED );
    SubLObject assignments = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding;
      SubLObject v_sources = NIL;
      SubLObject targets = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
      v_sources = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
      targets = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject assignment = ConsesLow.cons( Mapping.mapcar( $sym92$REST, v_sources.rest() ), Mapping.mapcar( $sym92$REST, targets.rest() ) );
        assignments = ConsesLow.cons( assignment, assignments );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return assignments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_varmap_table( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $variable_mapping_table_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_id(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_source_query(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_target_query(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_source_variables(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_target_variables(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_incompatibles(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject variable_mapping_table_assignments(final SubLObject v_object)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_source_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_target_query(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_source_variables(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_target_variables(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_incompatibles(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject _csetf_variable_mapping_table_assignments(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != variable_mapping_table_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject make_variable_mapping_table(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $variable_mapping_table_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw56$ID ) )
      {
        _csetf_variable_mapping_table_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw116$SOURCE_QUERY ) )
      {
        _csetf_variable_mapping_table_source_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw117$TARGET_QUERY ) )
      {
        _csetf_variable_mapping_table_target_query( v_new, current_value );
      }
      else if( pcase_var.eql( $kw118$SOURCE_VARIABLES ) )
      {
        _csetf_variable_mapping_table_source_variables( v_new, current_value );
      }
      else if( pcase_var.eql( $kw119$TARGET_VARIABLES ) )
      {
        _csetf_variable_mapping_table_target_variables( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$INCOMPATIBLES ) )
      {
        _csetf_variable_mapping_table_incompatibles( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$ASSIGNMENTS ) )
      {
        _csetf_variable_mapping_table_assignments( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject visit_defstruct_variable_mapping_table(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym121$MAKE_VARIABLE_MAPPING_TABLE, SEVEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw56$ID, variable_mapping_table_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw116$SOURCE_QUERY, variable_mapping_table_source_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw117$TARGET_QUERY, variable_mapping_table_target_query( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw118$SOURCE_VARIABLES, variable_mapping_table_source_variables( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw119$TARGET_VARIABLES, variable_mapping_table_target_variables( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw120$INCOMPATIBLES, variable_mapping_table_incompatibles( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw59$ASSIGNMENTS, variable_mapping_table_assignments( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym121$MAKE_VARIABLE_MAPPING_TABLE, SEVEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 8704L)
  public static SubLObject visit_defstruct_object_variable_mapping_table_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_variable_mapping_table( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 9235L)
  public static SubLObject print_varmap_table(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    streams_high.write_string( $str123$__VariableMappingTable_, stream, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str124$_A_for__A_____A__, new SubLObject[] { ( NIL != variable_mapping_table_id( v_object ) ) ? variable_mapping_table_id( v_object ) : $str125$anonymous,
      ( NIL != variable_mapping_table_source_query( v_object ) ) ? variable_mapping_table_source_query( v_object ) : $str126$no_source, ( NIL != variable_mapping_table_target_query( v_object ) )
          ? variable_mapping_table_target_query( v_object )
          : $str127$no_target
    } );
    PrintLow.format( stream, $str128$_Source_Variables___A__, variable_mapping_table_source_variables( v_object ) );
    PrintLow.format( stream, $str129$_Target_Variables___A__, variable_mapping_table_target_variables( v_object ) );
    PrintLow.format( stream, $str130$_Incompatibilities__source_view__ );
    if( NIL != dictionary.dictionary_p( variable_mapping_table_incompatibles( v_object ) ) )
    {
      dictionary_utilities.print_dictionary_contents( variable_mapping_table_incompatibles( v_object ), stream );
    }
    else
    {
      PrintLow.format( stream, $str131$null_dictionary__ );
    }
    PrintLow.format( stream, $str132$_Current_Assignments___A__, variable_mapping_table_assignments( v_object ) );
    streams_high.write_string( $str26$_, stream, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 10435L)
  public static SubLObject xml_serialize_variable_mapping_table(final SubLObject varmap, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = xml_vars.$xml_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
    try
    {
      xml_vars.$xml_stream$.bind( stream, thread );
      try
      {
        final SubLObject _prev_bind_0_$87 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
        try
        {
          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
          xml_utilities.xml_start_tag_internal( $str133$varMapTable, NIL, NIL, NIL, $kw28$UNINITIALIZED );
          final SubLObject _prev_bind_0_$88 = xml_vars.$xml_default_namespace$.currentBinding( thread );
          try
          {
            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
            if( NIL != variable_mapping_table_id( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$89 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$90 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str134$varMapTableId, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$90 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    cycml.cycml_serialize_term( variable_mapping_table_id( varmap ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$90, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$90, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$89, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str134$varMapTableId );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$91, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_source_query( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$92 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$91 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str135$varMapSourceQuery, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$93 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    cycml.cycml_serialize_term( variable_mapping_table_source_query( varmap ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$93, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$91, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$92, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$94 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str135$varMapSourceQuery );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$94, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_target_query( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$95 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$92 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str136$varMapTargetQuery, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$96 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    cycml.cycml_serialize_term( variable_mapping_table_target_query( varmap ) );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$96, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$92, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$95, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str136$varMapTargetQuery );
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_source_variables( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$98 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$93 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str137$varMapSourceVariables, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$99 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = variable_mapping_table_source_variables( varmap );
                    SubLObject variable = NIL;
                    variable = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      cycml.cycml_serialize_term( variable );
                      cdolist_list_var = cdolist_list_var.rest();
                      variable = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$99, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$93, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$98, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$100 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str137$varMapSourceVariables );
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$100, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_target_variables( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$101 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$94 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str138$varMapTargetVariables, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$102 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = variable_mapping_table_target_variables( varmap );
                    SubLObject variable = NIL;
                    variable = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      cycml.cycml_serialize_term( variable );
                      cdolist_list_var = cdolist_list_var.rest();
                      variable = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$102, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$94, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$101, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values5 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str138$varMapTargetVariables );
                  Values.restoreValuesFromVector( _values5 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$103, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_incompatibles( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$104 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$95 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str139$varMapIncompatibles, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$105 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject iteration_state;
                    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( variable_mapping_table_incompatibles( varmap ) ) ); NIL == dictionary_contents
                        .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                    {
                      thread.resetMultipleValues();
                      final SubLObject source_var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                      final SubLObject target_vars = thread.secondMultipleValue();
                      thread.resetMultipleValues();
                      try
                      {
                        final SubLObject _prev_bind_0_$106 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$96 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str140$varMapIncompatible, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$107 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                            try
                            {
                              final SubLObject _prev_bind_0_$108 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$97 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str141$varMapSourceVariable, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$109 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                  cycml.cycml_serialize_term( source_var );
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$109, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$97, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$108, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$110 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values6 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str141$varMapSourceVariable );
                                Values.restoreValuesFromVector( _values6 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$110, thread );
                              }
                            }
                            try
                            {
                              final SubLObject _prev_bind_0_$111 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$98 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                              try
                              {
                                xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                    thread ) ), thread );
                                xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                xml_utilities.xml_start_tag_internal( $str138$varMapTargetVariables, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                final SubLObject _prev_bind_0_$112 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                try
                                {
                                  xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                  SubLObject cdolist_list_var2 = target_vars;
                                  SubLObject target_var = NIL;
                                  target_var = cdolist_list_var2.first();
                                  while ( NIL != cdolist_list_var2)
                                  {
                                    cycml.cycml_serialize_term( target_var );
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    target_var = cdolist_list_var2.first();
                                  }
                                }
                                finally
                                {
                                  xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$112, thread );
                                }
                              }
                              finally
                              {
                                xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$98, thread );
                                xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$111, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values7 = Values.getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal( $str138$varMapTargetVariables );
                                Values.restoreValuesFromVector( _values7 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$113, thread );
                              }
                            }
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$107, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$96, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$106, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$114 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values8 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str140$varMapIncompatible );
                          Values.restoreValuesFromVector( _values8 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$114, thread );
                        }
                      }
                    }
                    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$105, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$95, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$104, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values9 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str139$varMapIncompatibles );
                  Values.restoreValuesFromVector( _values9 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$115, thread );
                }
              }
            }
            if( NIL != variable_mapping_table_assignments( varmap ) )
            {
              try
              {
                final SubLObject _prev_bind_0_$116 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$99 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str142$varMapAssignments, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$117 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                    SubLObject cdolist_list_var = variable_mapping_table_assignments( varmap );
                    SubLObject assignment = NIL;
                    assignment = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      try
                      {
                        final SubLObject _prev_bind_0_$118 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$100 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                        try
                        {
                          xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                              thread );
                          xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                          xml_utilities.xml_start_tag_internal( $str143$varMapAssignment, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                          final SubLObject _prev_bind_0_$119 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                          try
                          {
                            xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                            SubLObject current;
                            final SubLObject datum = current = assignment;
                            SubLObject source_var2 = NIL;
                            SubLObject target_var2 = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
                            source_var2 = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
                            target_var2 = current.first();
                            current = current.rest();
                            if( NIL == current )
                            {
                              try
                              {
                                final SubLObject _prev_bind_0_$120 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$101 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str141$varMapSourceVariable, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$121 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                    cycml.cycml_serialize_term( source_var2 );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$121, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$101, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$120, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values10 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str141$varMapSourceVariable );
                                  Values.restoreValuesFromVector( _values10 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$122, thread );
                                }
                              }
                              try
                              {
                                final SubLObject _prev_bind_0_$123 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$102 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                                try
                                {
                                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue(
                                      thread ) ), thread );
                                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                                  xml_utilities.xml_start_tag_internal( $str145$varMapTargetVariable, NIL, NIL, NIL, $kw28$UNINITIALIZED );
                                  final SubLObject _prev_bind_0_$124 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                                  try
                                  {
                                    xml_vars.$xml_default_namespace$.bind( $kw28$UNINITIALIZED, thread );
                                    cycml.cycml_serialize_term( target_var2 );
                                  }
                                  finally
                                  {
                                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$124, thread );
                                  }
                                }
                                finally
                                {
                                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$102, thread );
                                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$123, thread );
                                }
                              }
                              finally
                              {
                                final SubLObject _prev_bind_0_$125 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                try
                                {
                                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                  final SubLObject _values11 = Values.getValuesAsVector();
                                  xml_utilities.xml_terpri();
                                  xml_utilities.xml_end_tag_internal( $str145$varMapTargetVariable );
                                  Values.restoreValuesFromVector( _values11 );
                                }
                                finally
                                {
                                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$125, thread );
                                }
                              }
                            }
                            else
                            {
                              cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
                            }
                          }
                          finally
                          {
                            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$119, thread );
                          }
                        }
                        finally
                        {
                          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$100, thread );
                          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$118, thread );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$126 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                        try
                        {
                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                          final SubLObject _values12 = Values.getValuesAsVector();
                          xml_utilities.xml_terpri();
                          xml_utilities.xml_end_tag_internal( $str143$varMapAssignment );
                          Values.restoreValuesFromVector( _values12 );
                        }
                        finally
                        {
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$126, thread );
                        }
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      assignment = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$117, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$99, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$116, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$127 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values13 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str142$varMapAssignments );
                  Values.restoreValuesFromVector( _values13 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$127, thread );
                }
              }
            }
          }
          finally
          {
            xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$88, thread );
          }
        }
        finally
        {
          xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
          xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$87, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$128 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values14 = Values.getValuesAsVector();
          xml_utilities.xml_terpri();
          xml_utilities.xml_end_tag_internal( $str133$varMapTable );
          Values.restoreValuesFromVector( _values14 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$128, thread );
        }
      }
    }
    finally
    {
      xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
    }
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 12605L)
  public static SubLObject new_variable_mapping_table(final SubLObject table_id)
  {
    final SubLObject varmap = make_variable_mapping_table( UNPROVIDED );
    _csetf_variable_mapping_table_id( varmap, table_id );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 12784L)
  public static SubLObject load_variable_mapping_table_from_kb(final SubLObject table_id, final SubLObject elmt, SubLObject source_query, SubLObject target_query)
  {
    if( source_query == UNPROVIDED )
    {
      source_query = NIL;
    }
    if( target_query == UNPROVIDED )
    {
      target_query = NIL;
    }
    final SubLObject varmap = new_variable_mapping_table( table_id );
    varmaptbl_assign_queries( varmap, source_query, target_query, elmt );
    varmaptbl_assign_variable_information( varmap, elmt );
    varmaptbl_assign_current_assignments( varmap, elmt );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 13207L)
  public static SubLObject get_variable_mapping_table_for_formulas(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym146$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    final SubLObject varmap = new_variable_mapping_table( NIL );
    varmaptbl_assign_variable_information_from_formulas( varmap, elmt, source_formula, target_formula, varP, free_variables_onlyP );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 13556L)
  public static SubLObject varmaptbl_assign_queries(final SubLObject varmap, SubLObject source_query, SubLObject target_query, final SubLObject elmt)
  {
    final SubLObject table_id = variable_mapping_table_id( varmap );
    if( NIL == source_query )
    {
      source_query = varmaptbl_load_source_query_information( table_id, elmt );
    }
    if( NIL == target_query )
    {
      target_query = varmaptbl_load_target_query_information( table_id, elmt );
    }
    _csetf_variable_mapping_table_source_query( varmap, source_query );
    _csetf_variable_mapping_table_target_query( varmap, target_query );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14078L)
  public static SubLObject varmaptbl_load_source_query_information(final SubLObject table_id, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw147$SOURCE, ConsesLow.listS( $const148$variableMappingTableSourceFormula, table_id, $list149 ), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14307L)
  public static SubLObject varmaptbl_load_target_query_information(final SubLObject table_id, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw150$TARGET, ConsesLow.listS( $const151$variableMappingTableTargetFormula, table_id, $list152 ), elmt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 14536L)
  public static SubLObject varmaptbl_assign_variable_information(final SubLObject varmap, final SubLObject elmt)
  {
    final SubLObject source_constraints = varmaptbl_load_query_variable_information( variable_mapping_table_source_query( varmap ), elmt );
    final SubLObject target_constraints = varmaptbl_load_query_variable_information( variable_mapping_table_target_query( varmap ), elmt );
    varmaptbl_store_variable_information( varmap, elmt, source_constraints, target_constraints );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 15027L)
  public static SubLObject varmaptbl_assign_variable_information_from_formulas(final SubLObject varmap, final SubLObject elmt, final SubLObject source_formula, final SubLObject target_formula, SubLObject varP,
      SubLObject free_variables_onlyP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym146$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    final SubLObject source_constraints = at_var_types.formula_variables_arg_constraints_dict( source_formula, elmt, varP, free_variables_onlyP );
    final SubLObject target_constraints = at_var_types.formula_variables_arg_constraints_dict( target_formula, elmt, varP, free_variables_onlyP );
    return varmaptbl_store_variable_information( varmap, elmt, source_constraints, target_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 15522L)
  public static SubLObject varmaptbl_store_variable_information(final SubLObject varmap, final SubLObject elmt, final SubLObject source_constraints, final SubLObject target_constraints)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    _csetf_variable_mapping_table_source_variables( varmap, dictionary.dictionary_keys( source_constraints ) );
    _csetf_variable_mapping_table_target_variables( varmap, dictionary.dictionary_keys( target_constraints ) );
    final SubLObject incompatible_variables = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        SubLObject iteration_state;
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( source_constraints ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
            iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject src_var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject src_constraint = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject current;
          final SubLObject datum = current = src_constraint;
          SubLObject src_isas = NIL;
          SubLObject src_genls = NIL;
          SubLObject src_quoted_isas = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
          src_isas = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
          src_genls = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list153 );
          src_quoted_isas = current.first();
          current = current.rest();
          if( NIL == current )
          {
            SubLObject incompatibles = NIL;
            SubLObject iteration_state_$142;
            for( iteration_state_$142 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( target_constraints ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                iteration_state_$142 ); iteration_state_$142 = dictionary_contents.do_dictionary_contents_next( iteration_state_$142 ) )
            {
              thread.resetMultipleValues();
              final SubLObject trg_var = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$142 );
              final SubLObject trg_constraint = thread.secondMultipleValue();
              thread.resetMultipleValues();
              SubLObject current_$144;
              final SubLObject datum_$143 = current_$144 = trg_constraint;
              SubLObject trg_isas = NIL;
              SubLObject trg_genls = NIL;
              SubLObject trg_quoted_isas = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$144, datum_$143, $list154 );
              trg_isas = current_$144.first();
              current_$144 = current_$144.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$144, datum_$143, $list154 );
              trg_genls = current_$144.first();
              current_$144 = current_$144.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$144, datum_$143, $list154 );
              trg_quoted_isas = current_$144.first();
              current_$144 = current_$144.rest();
              if( NIL == current_$144 )
              {
                if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( src_isas, trg_isas, elmt, T, UNPROVIDED ) )
                {
                  incompatibles = ConsesLow.cons( trg_var, incompatibles );
                }
                else if( NIL != disjoint_with.any_disjoint_with_anyP_memoized( src_genls, trg_genls, elmt, T, UNPROVIDED ) )
                {
                  incompatibles = ConsesLow.cons( trg_var, incompatibles );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$143, $list154 );
              }
            }
            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$142 );
            if( NIL != incompatibles )
            {
              dictionary.dictionary_enter( incompatible_variables, src_var, incompatibles );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list153 );
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
      }
      finally
      {
        final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$145, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    _csetf_variable_mapping_table_incompatibles( varmap, incompatible_variables );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17154L)
  public static SubLObject varmaptbl_load_query_variable_information(final SubLObject query_id, final SubLObject elmt)
  {
    if( NIL == query_id )
    {
      return dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    }
    final SubLObject query_spec = new_cycl_query_specification.load_new_cycl_query_specification_from_kb( query_id, UNPROVIDED );
    final SubLObject formula = new_cycl_query_specification.new_cycl_query_specification_formula( query_spec );
    return at_var_types.formula_variables_arg_constraints_dict( formula, elmt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17494L)
  public static SubLObject varmaptbl_assign_current_assignments(final SubLObject varmap, final SubLObject elmt)
  {
    _csetf_variable_mapping_table_assignments( varmap, varmaptbl_load_current_assignments( variable_mapping_table_id( varmap ), variable_mapping_table_source_query( varmap ), variable_mapping_table_target_query(
        varmap ), elmt ) );
    return varmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 17850L)
  public static SubLObject varmaptbl_load_current_assignments(final SubLObject table_id, final SubLObject source_query, final SubLObject target_query, final SubLObject elmt)
  {
    if( NIL == table_id || NIL == target_query || NIL == source_query )
    {
      return NIL;
    }
    SubLObject results = NIL;
    final SubLObject workaround = results = ask_utilities.ask_template( $list155, ConsesLow.list( $const156$querySpecVariablesUnifyInTable_Wo, source_query, $list157, target_query, $list158, table_id ), elmt, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == results )
    {
      results = ask_utilities.ask_template( $list155, ConsesLow.list( $const159$querySpecVariablesUnifyInTable, source_query, $sym160$_SOURCE_VAR, target_query, $sym161$_TARGET_VAR, table_id ), elmt, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 18871L)
  public static SubLObject varmap_autocombine_literals(final SubLObject literals, SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP)
  {
    if( elmt == UNPROVIDED )
    {
      elmt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = $sym146$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    SubLObject result = literals.first();
    SubLObject cdolist_list_var = literals.rest();
    SubLObject other_formula = NIL;
    other_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      other_formula = varmap_uniquify_source_vars( other_formula, result );
      final SubLObject varmap = varmap_attempt_to_combine_variables( other_formula, result, elmt, varP, free_variables_onlyP );
      result = analysis_diagram_tool_widgets.join_formulas_along_variable_mappings( other_formula, result, varmap, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      other_formula = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 19756L)
  public static SubLObject varmap_uniquify_source_vars(SubLObject source_formula, final SubLObject target_formula)
  {
    final SubLObject source_vars = list_utilities.tree_find_all_if( $sym146$CYC_VAR_, source_formula, UNPROVIDED );
    SubLObject used_vars;
    final SubLObject target_vars = used_vars = list_utilities.tree_find_all_if( $sym146$CYC_VAR_, target_formula, UNPROVIDED );
    SubLObject mapping = NIL;
    SubLObject cdolist_list_var = source_vars;
    SubLObject source_var = NIL;
    source_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subl_promotions.memberP( source_var, used_vars, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject current_source_vars = list_utilities.tree_find_all_if( $sym146$CYC_VAR_, source_formula, UNPROVIDED );
        final SubLObject new_var = varmap_unique_el_var_wrt_vars( source_var, Sequences.cconcatenate( current_source_vars, used_vars ) );
        source_formula = list_utilities.tree_substitute( source_formula, source_var, new_var );
        mapping = ConsesLow.cons( ConsesLow.cons( source_var, new_var ), mapping );
        used_vars = ConsesLow.cons( new_var, used_vars );
      }
      cdolist_list_var = cdolist_list_var.rest();
      source_var = cdolist_list_var.first();
    }
    return Values.values( source_formula, mapping );
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 20622L)
  public static SubLObject varmap_unique_el_var_wrt_vars(final SubLObject original_var, final SubLObject known_vars)
  {
    SubLObject result_var = original_var;
    while ( NIL != subl_promotions.memberP( result_var, known_vars, UNPROVIDED, UNPROVIDED ))
    {
      final SubLObject result_var_str = string_utilities.to_string( result_var );
      if( NIL != string_utilities.ends_with_number_p( result_var_str ) )
      {
        final SubLObject var_num = string_utilities.ends_with_number( result_var_str );
        final SubLObject next_num = number_utilities.f_1X( var_num );
        result_var = cycl_variables.make_el_var( string_utilities.string_subst( string_utilities.str( next_num ), string_utilities.str( var_num ), result_var_str, UNPROVIDED ) );
      }
      else
      {
        result_var = el_utilities.next_named_var( known_vars, original_var );
      }
    }
    return result_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/value-tables.lisp", position = 21476L)
  public static SubLObject varmap_attempt_to_combine_variables(final SubLObject source_formula, final SubLObject target_formula, final SubLObject elmt, SubLObject varP, SubLObject free_variables_onlyP)
  {
    if( varP == UNPROVIDED )
    {
      varP = $sym146$CYC_VAR_;
    }
    if( free_variables_onlyP == UNPROVIDED )
    {
      free_variables_onlyP = T;
    }
    assert NIL != Types.function_spec_p( varP ) : varP;
    final SubLObject varmap = get_variable_mapping_table_for_formulas( source_formula, target_formula, elmt, varP, free_variables_onlyP );
    final SubLObject incompatibles = variable_mapping_table_incompatibles( varmap );
    final SubLObject source_vars = variable_mapping_table_source_variables( varmap );
    final SubLObject target_vars = variable_mapping_table_target_variables( varmap );
    final SubLObject hit_count = Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED );
    SubLObject matches = NIL;
    SubLObject result = NIL;
    SubLObject cdolist_list_var = source_vars;
    SubLObject source_var_i = NIL;
    source_var_i = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$146 = target_vars;
      SubLObject target_var_j = NIL;
      target_var_j = cdolist_list_var_$146.first();
      while ( NIL != cdolist_list_var_$146)
      {
        final SubLObject incomp = dictionary.dictionary_lookup( incompatibles, source_var_i, UNPROVIDED );
        if( NIL != Functions.funcall( varP, source_var_i ) && NIL != Functions.funcall( varP, target_var_j ) )
        {
          SubLObject possibleP = T;
          if( NIL != incomp && NIL != subl_promotions.memberP( target_var_j, incomp, UNPROVIDED, UNPROVIDED ) )
          {
            possibleP = NIL;
          }
          if( NIL != possibleP )
          {
            matches = ConsesLow.cons( ConsesLow.list( source_var_i, target_var_j ), matches );
            hash_table_utilities.cinc_hash( source_var_i, hit_count, UNPROVIDED, UNPROVIDED );
            hash_table_utilities.cinc_hash( target_var_j, hit_count, UNPROVIDED, UNPROVIDED );
          }
        }
        cdolist_list_var_$146 = cdolist_list_var_$146.rest();
        target_var_j = cdolist_list_var_$146.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      source_var_i = cdolist_list_var.first();
    }
    cdolist_list_var = matches;
    SubLObject match = NIL;
    match = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var1 = match.first();
      final SubLObject var2 = conses_high.second( match );
      final SubLObject var1_count = Hashtables.gethash( var1, hit_count, UNPROVIDED );
      final SubLObject var2_count = Hashtables.gethash( var2, hit_count, UNPROVIDED );
      if( var1_count.isInteger() && var2_count.isInteger() && var1_count.numE( ONE_INTEGER ) && var2_count.numE( ONE_INTEGER ) )
      {
        result = ConsesLow.cons( match, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      match = cdolist_list_var.first();
    }
    return result;
  }

  public static SubLObject declare_value_tables_file()
  {
    SubLFiles.declareFunction( me, "value_table_column_print_function_trampoline", "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "value_table_column_p", "VALUE-TABLE-COLUMN-P", 1, 0, false );
    new $value_table_column_p$UnaryFunction();
    SubLFiles.declareFunction( me, "value_table_column_query", "VALUE-TABLE-COLUMN-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_column_label", "VALUE-TABLE-COLUMN-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_column_values", "VALUE-TABLE-COLUMN-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_column_query", "_CSETF-VALUE-TABLE-COLUMN-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_column_label", "_CSETF-VALUE-TABLE-COLUMN-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_column_values", "_CSETF-VALUE-TABLE-COLUMN-VALUES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_value_table_column", "MAKE-VALUE-TABLE-COLUMN", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_value_table_column", "VISIT-DEFSTRUCT-VALUE-TABLE-COLUMN", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_value_table_column_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_value_table_column", "PRINT-VALUE-TABLE-COLUMN", 3, 0, false );
    SubLFiles.declareFunction( me, "new_value_table_column", "NEW-VALUE-TABLE-COLUMN", 1, 0, false );
    SubLFiles.declareFunction( me, "load_value_table_column_from_kb", "LOAD-VALUE-TABLE-COLUMN-FROM-KB", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_serialize_value_table_column", "XML-SERIALIZE-VALUE-TABLE-COLUMN", 1, 1, false );
    SubLFiles.declareFunction( me, "get_vtbl_query_result_values", "GET-VTBL-QUERY-RESULT-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "get_vtbl_query_result_sets", "GET-VTBL-QUERY-RESULT-SETS", 3, 0, false );
    SubLFiles.declareFunction( me, "value_table_print_function_trampoline", "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "value_table_p", "VALUE-TABLE-P", 1, 0, false );
    new $value_table_p$UnaryFunction();
    SubLFiles.declareFunction( me, "value_table_id", "VALUE-TABLE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_label", "VALUE-TABLE-LABEL", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_input_columns", "VALUE-TABLE-INPUT-COLUMNS", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_output_column", "VALUE-TABLE-OUTPUT-COLUMN", 1, 0, false );
    SubLFiles.declareFunction( me, "value_table_assignments", "VALUE-TABLE-ASSIGNMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_id", "_CSETF-VALUE-TABLE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_label", "_CSETF-VALUE-TABLE-LABEL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_input_columns", "_CSETF-VALUE-TABLE-INPUT-COLUMNS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_output_column", "_CSETF-VALUE-TABLE-OUTPUT-COLUMN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_value_table_assignments", "_CSETF-VALUE-TABLE-ASSIGNMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_value_table", "MAKE-VALUE-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_value_table", "VISIT-DEFSTRUCT-VALUE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_value_table_method", "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_value_table", "PRINT-VALUE-TABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_value_table", "NEW-VALUE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "load_value_table_from_kb", "LOAD-VALUE-TABLE-FROM-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "xml_serialize_value_table", "XML-SERIALIZE-VALUE-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "get_vtbl_input_queries", "GET-VTBL-INPUT-QUERIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_vtbl_output_query", "GET-VTBL-OUTPUT-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "load_value_table_assignments_from_kb", "LOAD-VALUE-TABLE-ASSIGNMENTS-FROM-KB", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_print_function_trampoline", "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_p", "VARIABLE-MAPPING-TABLE-P", 1, 0, false );
    new $variable_mapping_table_p$UnaryFunction();
    SubLFiles.declareFunction( me, "variable_mapping_table_id", "VARIABLE-MAPPING-TABLE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_source_query", "VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_target_query", "VARIABLE-MAPPING-TABLE-TARGET-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_source_variables", "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_target_variables", "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_incompatibles", "VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 1, 0, false );
    SubLFiles.declareFunction( me, "variable_mapping_table_assignments", "VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_id", "_CSETF-VARIABLE-MAPPING-TABLE-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_source_query", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_target_query", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_source_variables", "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_target_variables", "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_incompatibles", "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_variable_mapping_table_assignments", "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_variable_mapping_table", "MAKE-VARIABLE-MAPPING-TABLE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_variable_mapping_table", "VISIT-DEFSTRUCT-VARIABLE-MAPPING-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_variable_mapping_table_method", "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_varmap_table", "PRINT-VARMAP-TABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "xml_serialize_variable_mapping_table", "XML-SERIALIZE-VARIABLE-MAPPING-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_variable_mapping_table", "NEW-VARIABLE-MAPPING-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "load_variable_mapping_table_from_kb", "LOAD-VARIABLE-MAPPING-TABLE-FROM-KB", 2, 2, false );
    SubLFiles.declareFunction( me, "get_variable_mapping_table_for_formulas", "GET-VARIABLE-MAPPING-TABLE-FOR-FORMULAS", 3, 2, false );
    SubLFiles.declareFunction( me, "varmaptbl_assign_queries", "VARMAPTBL-ASSIGN-QUERIES", 4, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_load_source_query_information", "VARMAPTBL-LOAD-SOURCE-QUERY-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_load_target_query_information", "VARMAPTBL-LOAD-TARGET-QUERY-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_assign_variable_information", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_assign_variable_information_from_formulas", "VARMAPTBL-ASSIGN-VARIABLE-INFORMATION-FROM-FORMULAS", 4, 2, false );
    SubLFiles.declareFunction( me, "varmaptbl_store_variable_information", "VARMAPTBL-STORE-VARIABLE-INFORMATION", 4, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_load_query_variable_information", "VARMAPTBL-LOAD-QUERY-VARIABLE-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_assign_current_assignments", "VARMAPTBL-ASSIGN-CURRENT-ASSIGNMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "varmaptbl_load_current_assignments", "VARMAPTBL-LOAD-CURRENT-ASSIGNMENTS", 4, 0, false );
    SubLFiles.declareFunction( me, "varmap_autocombine_literals", "VARMAP-AUTOCOMBINE-LITERALS", 1, 3, false );
    SubLFiles.declareFunction( me, "varmap_uniquify_source_vars", "VARMAP-UNIQUIFY-SOURCE-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "varmap_unique_el_var_wrt_vars", "VARMAP-UNIQUE-EL-VAR-WRT-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "varmap_attempt_to_combine_variables", "VARMAP-ATTEMPT-TO-COMBINE-VARIABLES", 3, 2, false );
    return NIL;
  }

  public static SubLObject init_value_tables_file()
  {
    $dtp_value_table_column$ = SubLFiles.defconstant( "*DTP-VALUE-TABLE-COLUMN*", $sym0$VALUE_TABLE_COLUMN );
    $dtp_value_table$ = SubLFiles.defconstant( "*DTP-VALUE-TABLE*", $sym37$VALUE_TABLE );
    $dtp_variable_mapping_table$ = SubLFiles.defconstant( "*DTP-VARIABLE-MAPPING-TABLE*", $sym93$VARIABLE_MAPPING_TABLE );
    return NIL;
  }

  public static SubLObject setup_value_tables_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), Symbols.symbol_function( $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$VALUE_TABLE_COLUMN_QUERY, $sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY );
    Structures.def_csetf( $sym11$VALUE_TABLE_COLUMN_LABEL, $sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL );
    Structures.def_csetf( $sym13$VALUE_TABLE_COLUMN_VALUES, $sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES );
    Equality.identity( $sym0$VALUE_TABLE_COLUMN );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table_column$.getGlobalValue(), Symbols.symbol_function(
        $sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), Symbols.symbol_function( $sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list45 );
    Structures.def_csetf( $sym46$VALUE_TABLE_ID, $sym47$_CSETF_VALUE_TABLE_ID );
    Structures.def_csetf( $sym48$VALUE_TABLE_LABEL, $sym49$_CSETF_VALUE_TABLE_LABEL );
    Structures.def_csetf( $sym50$VALUE_TABLE_INPUT_COLUMNS, $sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS );
    Structures.def_csetf( $sym52$VALUE_TABLE_OUTPUT_COLUMN, $sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN );
    Structures.def_csetf( $sym54$VALUE_TABLE_ASSIGNMENTS, $sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS );
    Equality.identity( $sym37$VALUE_TABLE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_value_table$.getGlobalValue(), Symbols.symbol_function( $sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), Symbols.symbol_function(
        $sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list101 );
    Structures.def_csetf( $sym102$VARIABLE_MAPPING_TABLE_ID, $sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID );
    Structures.def_csetf( $sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY, $sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY );
    Structures.def_csetf( $sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY, $sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY );
    Structures.def_csetf( $sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES, $sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES );
    Structures.def_csetf( $sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES, $sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES );
    Structures.def_csetf( $sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES, $sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES );
    Structures.def_csetf( $sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS, $sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS );
    Equality.identity( $sym93$VARIABLE_MAPPING_TABLE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_variable_mapping_table$.getGlobalValue(), Symbols.symbol_function(
        $sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD ) );
    access_macros.register_external_symbol( $sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_value_tables_file();
  }

  @Override
  public void initializeVariables()
  {
    init_value_tables_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_value_tables_file();
  }
  static
  {
    me = new value_tables();
    $dtp_value_table_column$ = null;
    $dtp_value_table$ = null;
    $dtp_variable_mapping_table$ = null;
    $sym0$VALUE_TABLE_COLUMN = makeSymbol( "VALUE-TABLE-COLUMN" );
    $sym1$VALUE_TABLE_COLUMN_P = makeSymbol( "VALUE-TABLE-COLUMN-P" );
    $list2 = ConsesLow.list( makeSymbol( "QUERY" ), makeSymbol( "LABEL" ), makeSymbol( "VALUES" ) );
    $list3 = ConsesLow.list( makeKeyword( "QUERY" ), makeKeyword( "LABEL" ), makeKeyword( "VALUES" ) );
    $list4 = ConsesLow.list( makeSymbol( "VALUE-TABLE-COLUMN-QUERY" ), makeSymbol( "VALUE-TABLE-COLUMN-LABEL" ), makeSymbol( "VALUE-TABLE-COLUMN-VALUES" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-QUERY" ), makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-LABEL" ), makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-VALUES" ) );
    $sym6$PRINT_VALUE_TABLE_COLUMN = makeSymbol( "PRINT-VALUE-TABLE-COLUMN" );
    $sym7$VALUE_TABLE_COLUMN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VALUE-TABLE-COLUMN-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VALUE-TABLE-COLUMN-P" ) );
    $sym9$VALUE_TABLE_COLUMN_QUERY = makeSymbol( "VALUE-TABLE-COLUMN-QUERY" );
    $sym10$_CSETF_VALUE_TABLE_COLUMN_QUERY = makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-QUERY" );
    $sym11$VALUE_TABLE_COLUMN_LABEL = makeSymbol( "VALUE-TABLE-COLUMN-LABEL" );
    $sym12$_CSETF_VALUE_TABLE_COLUMN_LABEL = makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-LABEL" );
    $sym13$VALUE_TABLE_COLUMN_VALUES = makeSymbol( "VALUE-TABLE-COLUMN-VALUES" );
    $sym14$_CSETF_VALUE_TABLE_COLUMN_VALUES = makeSymbol( "_CSETF-VALUE-TABLE-COLUMN-VALUES" );
    $kw15$QUERY = makeKeyword( "QUERY" );
    $kw16$LABEL = makeKeyword( "LABEL" );
    $kw17$VALUES = makeKeyword( "VALUES" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_VALUE_TABLE_COLUMN = makeSymbol( "MAKE-VALUE-TABLE-COLUMN" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_COLUMN_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-COLUMN-METHOD" );
    $str24$__ValueTableColumn_ = makeString( "#<ValueTableColumn " );
    $str25$_A___S____supported_values___S = makeString( "~A (~S)~% supported values: ~S" );
    $str26$_ = makeString( ">" );
    $str27$valueTableColumn = makeString( "valueTableColumn" );
    $kw28$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str29$valueTableQuery = makeString( "valueTableQuery" );
    $str30$valueTableLabel = makeString( "valueTableLabel" );
    $str31$valueTableValues = makeString( "valueTableValues" );
    $str32$valueTableValue = makeString( "valueTableValue" );
    $list33 = ConsesLow.list( makeSymbol( "THE-SET" ), makeSymbol( "EL-INFERENCE-BINDING" ) );
    $list34 = ConsesLow.list( makeSymbol( "EL-INFBIND-FN" ), makeSymbol( "VARIABLE" ), makeSymbol( "RESULT-VALUE" ) );
    $kw35$RESULT_SET = makeKeyword( "RESULT-SET" );
    $const36$validQueryResultForTable = constant_handles.reader_make_constant_shell( makeString( "validQueryResultForTable" ) );
    $sym37$VALUE_TABLE = makeSymbol( "VALUE-TABLE" );
    $sym38$VALUE_TABLE_P = makeSymbol( "VALUE-TABLE-P" );
    $list39 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "LABEL" ), makeSymbol( "INPUT-COLUMNS" ), makeSymbol( "OUTPUT-COLUMN" ), makeSymbol( "ASSIGNMENTS" ) );
    $list40 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "LABEL" ), makeKeyword( "INPUT-COLUMNS" ), makeKeyword( "OUTPUT-COLUMN" ), makeKeyword( "ASSIGNMENTS" ) );
    $list41 = ConsesLow.list( makeSymbol( "VALUE-TABLE-ID" ), makeSymbol( "VALUE-TABLE-LABEL" ), makeSymbol( "VALUE-TABLE-INPUT-COLUMNS" ), makeSymbol( "VALUE-TABLE-OUTPUT-COLUMN" ), makeSymbol(
        "VALUE-TABLE-ASSIGNMENTS" ) );
    $list42 = ConsesLow.list( makeSymbol( "_CSETF-VALUE-TABLE-ID" ), makeSymbol( "_CSETF-VALUE-TABLE-LABEL" ), makeSymbol( "_CSETF-VALUE-TABLE-INPUT-COLUMNS" ), makeSymbol( "_CSETF-VALUE-TABLE-OUTPUT-COLUMN" ),
        makeSymbol( "_CSETF-VALUE-TABLE-ASSIGNMENTS" ) );
    $sym43$PRINT_VALUE_TABLE = makeSymbol( "PRINT-VALUE-TABLE" );
    $sym44$VALUE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VALUE-TABLE-PRINT-FUNCTION-TRAMPOLINE" );
    $list45 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VALUE-TABLE-P" ) );
    $sym46$VALUE_TABLE_ID = makeSymbol( "VALUE-TABLE-ID" );
    $sym47$_CSETF_VALUE_TABLE_ID = makeSymbol( "_CSETF-VALUE-TABLE-ID" );
    $sym48$VALUE_TABLE_LABEL = makeSymbol( "VALUE-TABLE-LABEL" );
    $sym49$_CSETF_VALUE_TABLE_LABEL = makeSymbol( "_CSETF-VALUE-TABLE-LABEL" );
    $sym50$VALUE_TABLE_INPUT_COLUMNS = makeSymbol( "VALUE-TABLE-INPUT-COLUMNS" );
    $sym51$_CSETF_VALUE_TABLE_INPUT_COLUMNS = makeSymbol( "_CSETF-VALUE-TABLE-INPUT-COLUMNS" );
    $sym52$VALUE_TABLE_OUTPUT_COLUMN = makeSymbol( "VALUE-TABLE-OUTPUT-COLUMN" );
    $sym53$_CSETF_VALUE_TABLE_OUTPUT_COLUMN = makeSymbol( "_CSETF-VALUE-TABLE-OUTPUT-COLUMN" );
    $sym54$VALUE_TABLE_ASSIGNMENTS = makeSymbol( "VALUE-TABLE-ASSIGNMENTS" );
    $sym55$_CSETF_VALUE_TABLE_ASSIGNMENTS = makeSymbol( "_CSETF-VALUE-TABLE-ASSIGNMENTS" );
    $kw56$ID = makeKeyword( "ID" );
    $kw57$INPUT_COLUMNS = makeKeyword( "INPUT-COLUMNS" );
    $kw58$OUTPUT_COLUMN = makeKeyword( "OUTPUT-COLUMN" );
    $kw59$ASSIGNMENTS = makeKeyword( "ASSIGNMENTS" );
    $sym60$MAKE_VALUE_TABLE = makeSymbol( "MAKE-VALUE-TABLE" );
    $sym61$VISIT_DEFSTRUCT_OBJECT_VALUE_TABLE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VALUE-TABLE-METHOD" );
    $str62$__ValueTable_ = makeString( "#<ValueTable " );
    $str63$_S___A___ = makeString( "~S (~A)~%" );
    $str64$_Input_Columns__ = makeString( " Input Columns: " );
    $str65$_____S__ = makeString( "    ~S~%" );
    $str66$_Output_Column__ = makeString( " Output Column: " );
    $str67$_Existing_Assignments__ = makeString( " Existing Assignments: " );
    $sym68$FORT_P = makeSymbol( "FORT-P" );
    $sym69$HLMT_P = makeSymbol( "HLMT-P" );
    $str70$valueTable = makeString( "valueTable" );
    $str71$valueTableId = makeString( "valueTableId" );
    $str72$valueTableInputColumns = makeString( "valueTableInputColumns" );
    $str73$valueTableOutputColumns = makeString( "valueTableOutputColumns" );
    $str74$valueTableAssignments = makeString( "valueTableAssignments" );
    $str75$valueTableAssignment = makeString( "valueTableAssignment" );
    $list76 = ConsesLow.cons( makeSymbol( "SOURCES" ), makeSymbol( "TARGETS" ) );
    $str77$valueTableAssignmentSources = makeString( "valueTableAssignmentSources" );
    $str78$valueTableAssignmentTuple = makeString( "valueTableAssignmentTuple" );
    $list79 = ConsesLow.list( makeSymbol( "QUERY" ), makeSymbol( "VALUE" ) );
    $str80$valueTableAssignmentTargets = makeString( "valueTableAssignmentTargets" );
    $kw81$INPUT_QUERIES = makeKeyword( "INPUT-QUERIES" );
    $const82$valueTableSourceQueries = constant_handles.reader_make_constant_shell( makeString( "valueTableSourceQueries" ) );
    $list83 = ConsesLow.list( makeKeyword( "INPUT-QUERIES" ) );
    $kw84$OUTPUT_QUERY = makeKeyword( "OUTPUT-QUERY" );
    $const85$valueTableTargetQuery = constant_handles.reader_make_constant_shell( makeString( "valueTableTargetQuery" ) );
    $list86 = ConsesLow.list( makeKeyword( "OUTPUT-QUERY" ) );
    $list87 = ConsesLow.list( makeSymbol( "?SOURCES" ), makeSymbol( "?TARGETS" ) );
    $const88$queryResultsCombineInTable = constant_handles.reader_make_constant_shell( makeString( "queryResultsCombineInTable" ) );
    $sym89$_SOURCES = makeSymbol( "?SOURCES" );
    $sym90$_TARGETS = makeSymbol( "?TARGETS" );
    $list91 = ConsesLow.list( makeSymbol( "SOURCES" ), makeSymbol( "TARGETS" ) );
    $sym92$REST = makeSymbol( "REST" );
    $sym93$VARIABLE_MAPPING_TABLE = makeSymbol( "VARIABLE-MAPPING-TABLE" );
    $sym94$VARIABLE_MAPPING_TABLE_P = makeSymbol( "VARIABLE-MAPPING-TABLE-P" );
    $list95 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "SOURCE-QUERY" ), makeSymbol( "TARGET-QUERY" ), makeSymbol( "SOURCE-VARIABLES" ), makeSymbol( "TARGET-VARIABLES" ), makeSymbol( "INCOMPATIBLES" ), makeSymbol(
        "ASSIGNMENTS" ) );
    $list96 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "SOURCE-QUERY" ), makeKeyword( "TARGET-QUERY" ), makeKeyword( "SOURCE-VARIABLES" ), makeKeyword( "TARGET-VARIABLES" ), makeKeyword( "INCOMPATIBLES" ),
        makeKeyword( "ASSIGNMENTS" ) );
    $list97 = ConsesLow.list( makeSymbol( "VARIABLE-MAPPING-TABLE-ID" ), makeSymbol( "VARIABLE-MAPPING-TABLE-SOURCE-QUERY" ), makeSymbol( "VARIABLE-MAPPING-TABLE-TARGET-QUERY" ), makeSymbol(
        "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES" ), makeSymbol( "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES" ), makeSymbol( "VARIABLE-MAPPING-TABLE-INCOMPATIBLES" ), makeSymbol( "VARIABLE-MAPPING-TABLE-ASSIGNMENTS" ) );
    $list98 = ConsesLow.list( makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-ID" ), makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY" ), makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY" ), makeSymbol(
        "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES" ), makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES" ), makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES" ), makeSymbol(
            "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS" ) );
    $sym99$PRINT_VARMAP_TABLE = makeSymbol( "PRINT-VARMAP-TABLE" );
    $sym100$VARIABLE_MAPPING_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VARIABLE-MAPPING-TABLE-PRINT-FUNCTION-TRAMPOLINE" );
    $list101 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VARIABLE-MAPPING-TABLE-P" ) );
    $sym102$VARIABLE_MAPPING_TABLE_ID = makeSymbol( "VARIABLE-MAPPING-TABLE-ID" );
    $sym103$_CSETF_VARIABLE_MAPPING_TABLE_ID = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-ID" );
    $sym104$VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol( "VARIABLE-MAPPING-TABLE-SOURCE-QUERY" );
    $sym105$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_QUERY = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-QUERY" );
    $sym106$VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol( "VARIABLE-MAPPING-TABLE-TARGET-QUERY" );
    $sym107$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_QUERY = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-QUERY" );
    $sym108$VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol( "VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES" );
    $sym109$_CSETF_VARIABLE_MAPPING_TABLE_SOURCE_VARIABLES = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-SOURCE-VARIABLES" );
    $sym110$VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol( "VARIABLE-MAPPING-TABLE-TARGET-VARIABLES" );
    $sym111$_CSETF_VARIABLE_MAPPING_TABLE_TARGET_VARIABLES = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-TARGET-VARIABLES" );
    $sym112$VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol( "VARIABLE-MAPPING-TABLE-INCOMPATIBLES" );
    $sym113$_CSETF_VARIABLE_MAPPING_TABLE_INCOMPATIBLES = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-INCOMPATIBLES" );
    $sym114$VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol( "VARIABLE-MAPPING-TABLE-ASSIGNMENTS" );
    $sym115$_CSETF_VARIABLE_MAPPING_TABLE_ASSIGNMENTS = makeSymbol( "_CSETF-VARIABLE-MAPPING-TABLE-ASSIGNMENTS" );
    $kw116$SOURCE_QUERY = makeKeyword( "SOURCE-QUERY" );
    $kw117$TARGET_QUERY = makeKeyword( "TARGET-QUERY" );
    $kw118$SOURCE_VARIABLES = makeKeyword( "SOURCE-VARIABLES" );
    $kw119$TARGET_VARIABLES = makeKeyword( "TARGET-VARIABLES" );
    $kw120$INCOMPATIBLES = makeKeyword( "INCOMPATIBLES" );
    $sym121$MAKE_VARIABLE_MAPPING_TABLE = makeSymbol( "MAKE-VARIABLE-MAPPING-TABLE" );
    $sym122$VISIT_DEFSTRUCT_OBJECT_VARIABLE_MAPPING_TABLE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VARIABLE-MAPPING-TABLE-METHOD" );
    $str123$__VariableMappingTable_ = makeString( "#<VariableMappingTable " );
    $str124$_A_for__A_____A__ = makeString( "~A for ~A -> ~A~%" );
    $str125$anonymous = makeString( "anonymous" );
    $str126$no_source = makeString( "no source" );
    $str127$no_target = makeString( "no target" );
    $str128$_Source_Variables___A__ = makeString( " Source Variables: ~A~%" );
    $str129$_Target_Variables___A__ = makeString( " Target Variables: ~A~%" );
    $str130$_Incompatibilities__source_view__ = makeString( " Incompatibilities (source view): ~%" );
    $str131$null_dictionary__ = makeString( "null dictionary~%" );
    $str132$_Current_Assignments___A__ = makeString( " Current Assignments: ~A~%" );
    $str133$varMapTable = makeString( "varMapTable" );
    $str134$varMapTableId = makeString( "varMapTableId" );
    $str135$varMapSourceQuery = makeString( "varMapSourceQuery" );
    $str136$varMapTargetQuery = makeString( "varMapTargetQuery" );
    $str137$varMapSourceVariables = makeString( "varMapSourceVariables" );
    $str138$varMapTargetVariables = makeString( "varMapTargetVariables" );
    $str139$varMapIncompatibles = makeString( "varMapIncompatibles" );
    $str140$varMapIncompatible = makeString( "varMapIncompatible" );
    $str141$varMapSourceVariable = makeString( "varMapSourceVariable" );
    $str142$varMapAssignments = makeString( "varMapAssignments" );
    $str143$varMapAssignment = makeString( "varMapAssignment" );
    $list144 = ConsesLow.list( makeSymbol( "SOURCE-VAR" ), makeSymbol( "TARGET-VAR" ) );
    $str145$varMapTargetVariable = makeString( "varMapTargetVariable" );
    $sym146$CYC_VAR_ = makeSymbol( "CYC-VAR?" );
    $kw147$SOURCE = makeKeyword( "SOURCE" );
    $const148$variableMappingTableSourceFormula = constant_handles.reader_make_constant_shell( makeString( "variableMappingTableSourceFormula-QuerySpec" ) );
    $list149 = ConsesLow.list( makeKeyword( "SOURCE" ) );
    $kw150$TARGET = makeKeyword( "TARGET" );
    $const151$variableMappingTableTargetFormula = constant_handles.reader_make_constant_shell( makeString( "variableMappingTableTargetFormula-QuerySpec" ) );
    $list152 = ConsesLow.list( makeKeyword( "TARGET" ) );
    $list153 = ConsesLow.list( makeSymbol( "SRC-ISAS" ), makeSymbol( "SRC-GENLS" ), makeSymbol( "SRC-QUOTED-ISAS" ) );
    $list154 = ConsesLow.list( makeSymbol( "TRG-ISAS" ), makeSymbol( "TRG-GENLS" ), makeSymbol( "TRG-QUOTED-ISAS" ) );
    $list155 = ConsesLow.list( makeSymbol( "?SOURCE-VAR" ), makeSymbol( "?TARGET-VAR" ) );
    $const156$querySpecVariablesUnifyInTable_Wo = constant_handles.reader_make_constant_shell( makeString( "querySpecVariablesUnifyInTable-WorkaroundPred" ) );
    $list157 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AnalysisOutputBindingsForVarFn" ) ), makeSymbol( "?SOURCE-VAR" ) );
    $list158 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AnalysisInputBindingsForVarFn" ) ), makeSymbol( "?TARGET-VAR" ) );
    $const159$querySpecVariablesUnifyInTable = constant_handles.reader_make_constant_shell( makeString( "querySpecVariablesUnifyInTable" ) );
    $sym160$_SOURCE_VAR = makeSymbol( "?SOURCE-VAR" );
    $sym161$_TARGET_VAR = makeSymbol( "?TARGET-VAR" );
    $sym162$VARMAP_UNIQUE_EL_VAR_WRT_VARS = makeSymbol( "VARMAP-UNIQUE-EL-VAR-WRT-VARS" );
    $sym163$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
  }

  public static final class $value_table_column_native
      extends
        SubLStructNative
  {
    public SubLObject $query;
    public SubLObject $label;
    public SubLObject $values;
    private static final SubLStructDeclNative structDecl;

    public $value_table_column_native()
    {
      this.$query = CommonSymbols.NIL;
      this.$label = CommonSymbols.NIL;
      this.$values = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $value_table_column_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$query;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$label;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$values;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$query = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$label = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$values = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $value_table_column_native.class, $sym0$VALUE_TABLE_COLUMN, $sym1$VALUE_TABLE_COLUMN_P, $list2, $list3, new String[] { "$query", "$label", "$values"
      }, $list4, $list5, $sym6$PRINT_VALUE_TABLE_COLUMN );
    }
  }

  public static final class $value_table_column_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $value_table_column_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALUE-TABLE-COLUMN-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return value_table_column_p( arg1 );
    }
  }

  public static final class $value_table_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $label;
    public SubLObject $input_columns;
    public SubLObject $output_column;
    public SubLObject $assignments;
    private static final SubLStructDeclNative structDecl;

    public $value_table_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$label = CommonSymbols.NIL;
      this.$input_columns = CommonSymbols.NIL;
      this.$output_column = CommonSymbols.NIL;
      this.$assignments = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $value_table_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$label;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$input_columns;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$output_column;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$assignments;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$label = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$input_columns = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$output_column = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$assignments = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $value_table_native.class, $sym37$VALUE_TABLE, $sym38$VALUE_TABLE_P, $list39, $list40, new String[] { "$id", "$label", "$input_columns", "$output_column",
        "$assignments"
      }, $list41, $list42, $sym43$PRINT_VALUE_TABLE );
    }
  }

  public static final class $value_table_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $value_table_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VALUE-TABLE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return value_table_p( arg1 );
    }
  }

  public static final class $variable_mapping_table_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $source_query;
    public SubLObject $target_query;
    public SubLObject $source_variables;
    public SubLObject $target_variables;
    public SubLObject $incompatibles;
    public SubLObject $assignments;
    private static final SubLStructDeclNative structDecl;

    public $variable_mapping_table_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$source_query = CommonSymbols.NIL;
      this.$target_query = CommonSymbols.NIL;
      this.$source_variables = CommonSymbols.NIL;
      this.$target_variables = CommonSymbols.NIL;
      this.$incompatibles = CommonSymbols.NIL;
      this.$assignments = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $variable_mapping_table_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$source_query;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$target_query;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$source_variables;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$target_variables;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$incompatibles;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$assignments;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$source_query = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$target_query = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$source_variables = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$target_variables = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$incompatibles = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$assignments = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $variable_mapping_table_native.class, $sym93$VARIABLE_MAPPING_TABLE, $sym94$VARIABLE_MAPPING_TABLE_P, $list95, $list96, new String[] { "$id", "$source_query",
        "$target_query", "$source_variables", "$target_variables", "$incompatibles", "$assignments"
      }, $list97, $list98, $sym99$PRINT_VARMAP_TABLE );
    }
  }

  public static final class $variable_mapping_table_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $variable_mapping_table_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VARIABLE-MAPPING-TABLE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return variable_mapping_table_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 5098 ms
 * 
 */