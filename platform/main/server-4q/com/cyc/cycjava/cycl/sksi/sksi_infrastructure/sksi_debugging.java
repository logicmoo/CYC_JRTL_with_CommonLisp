package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus;
import com.cyc.cycjava.cycl.sksi.report_generation.sksi_report_generation;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3;
import com.cyc.cycjava.cycl.sksi.mapping_engine;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.sksi.data_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_debugging
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging";
  public static final String myFingerPrint = "4820156ced56ee89abfc30ea62d6d7c130186805f1f770f5654c7a3f774021fb";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 990L)
  private static SubLSymbol $sksi_min_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1228L)
  public static SubLSymbol $sksi_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1387L)
  public static SubLSymbol $sksi_trace_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 2687L)
  public static SubLSymbol $sksi_error_handling_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 2940L)
  public static SubLSymbol $sksi_sks_error_handling_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3000L)
  public static SubLSymbol $sksi_registration_error_handling_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 5332L)
  public static SubLSymbol $sksi_custom_error_handling_table$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 6460L)
  public static SubLSymbol $sksi_custom_error_handling_default$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 11430L)
  private static SubLSymbol $sksi_violations$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PWHEN;
  private static final SubLSymbol $sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_;
  private static final SubLSymbol $sym3$FORMAT;
  private static final SubLSymbol $sym4$_SKSI_TRACE_STREAM_;
  private static final SubLSymbol $sym5$CCONCATENATE;
  private static final SubLString $str6$__SKSI__A_;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$CLET;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SKSI_TRACE;
  private static final SubLSymbol $sym12$PROGN;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$CUSTOM;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$IGNORE;
  private static final SubLSymbol $kw17$WARN;
  private static final SubLSymbol $kw18$BREAK;
  private static final SubLString $str19$Continue;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLString $str22$Unexpected_error_action__s_define;
  private static final SubLString $str23$Continue_without_accessing_;
  private static final SubLString $str24$_;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$CHECK_TYPE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$_SKSI_ERROR_HANDLING_MODE_;
  private static final SubLSymbol $sym29$WITH_SKSI_ERROR_HANDLING_MODE;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$_SKSI_SKS_ERROR_HANDLING_MODE_;
  private static final SubLSymbol $sym32$WITH_SKSI_SKS_ERROR_HANDLING_MODE;
  private static final SubLSymbol $sym33$_SKSI_REGISTRATION_ERROR_HANDLING_MODE_;
  private static final SubLSymbol $sym34$WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$STRING_STREAM;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$WITH_SKSI_TRACE_LEVEL;
  private static final SubLSymbol $sym39$CSETQ;
  private static final SubLSymbol $sym40$GET_OUTPUT_STREAM_STRING;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$SKSI_MISSING_DECODINGS;
  private static final SubLSymbol $kw43$SKSI_MISSING_ENCODINGS;
  private static final SubLSymbol $kw44$SKSI_MISSING_FIELDS;
  private static final SubLSymbol $kw45$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL;
  private static final SubLSymbol $kw46$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL;
  private static final SubLSymbol $kw47$SKSI_MISSING_REQUIRED_FIELD_VALUE;
  private static final SubLSymbol $kw48$SKSI_LIT_MS_ARG_MISMATCH;
  private static final SubLSymbol $kw49$SKSI_UNREFORMULATABLE;
  private static final SubLSymbol $kw50$SKSI_COMPARISON_ASENT_INAPPLICABLE;
  private static final SubLSymbol $kw51$SKSI_COMPARISON_OPERATOR_FORBIDDEN;
  private static final SubLSymbol $kw52$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND;
  private static final SubLSymbol $kw53$SKSI_LIST_LENGTH_MISMATCH;
  private static final SubLSymbol $kw54$SKSI_EVALUATE_CSQL_UNPRODUCIBLE;
  private static final SubLSymbol $kw55$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE;
  private static final SubLString $str56$Continue_anyway;
  private static final SubLString $str57$Unknown_violation__s_;
  private static final SubLString $str58$Could_not_find_decodings_for_;
  private static final SubLString $str59$Could_not_find_encodings_for_;
  private static final SubLString $str60$Could_not_find_fields_for_;
  private static final SubLString $str61$Could_not_find_physical_field_for;
  private static final SubLString $str62$Could_not_find_logical_field_for_;
  private static final SubLList $list63;
  private static final SubLString $str64$Missing_a_value_for_;
  private static final SubLString $str65$__which_is_a___requiredFields_for;
  private static final SubLList $list66;
  private static final SubLString $str67$Mismatch_between_literal_argument;
  private static final SubLString $str68$_and_meaning_sentence_argument_;
  private static final SubLString $str69$_unreformulatable_;
  private static final SubLString $str70$_inapplicable_;
  private static final SubLString $str71$_forbidden_;
  private static final SubLString $str72$_has_no_variables_so_can_t_sent_t;
  private static final SubLList $list73;
  private static final SubLString $str74$Mismatch_between_lengths_of_;
  private static final SubLString $str75$_and_;
  private static final SubLString $str76$No_CSQL_can_be_generated_for_the_;
  private static final SubLString $str77$No_CSQL_can_be_generated_for_the_;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$RESULT;
  private static final SubLSymbol $sym80$CCATCH;
  private static final SubLSymbol $sym81$SKSI_VIOLATION_MESSAGE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$WITH_SKSI_VIOLATION_HANDLING;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1435L)
  public static SubLObject sksi_trace(SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != level )
    {
      sksi_set_trace_level( level );
    }
    else
    {
      sksi_cinc_trace_level();
    }
    return $sksi_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1590L)
  public static SubLObject sksi_untrace()
  {
    return sksi_set_trace_level( $sksi_min_trace_level$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1677L)
  public static SubLObject sksi_set_trace_level(final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( !level.isInteger() )
    {
      return $sksi_trace_level$.getDynamicValue( thread );
    }
    if( level.numL( $sksi_min_trace_level$.getGlobalValue() ) )
    {
      $sksi_trace_level$.setDynamicValue( $sksi_min_trace_level$.getGlobalValue(), thread );
    }
    else
    {
      $sksi_trace_level$.setDynamicValue( level, thread );
    }
    return $sksi_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 1947L)
  public static SubLObject sksi_cinc_trace_level()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $sksi_trace_level$.setDynamicValue( Numbers.add( $sksi_trace_level$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return $sksi_trace_level$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 2045L)
  public static SubLObject sksi_trace_level_exceeds_minimumP(final SubLObject level)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.numGE( $sksi_trace_level$.getDynamicValue( thread ), level );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 2145L)
  public static SubLObject sksi_note(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject level = NIL;
    SubLObject format_str = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    level = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    format_str = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym1$PWHEN, ConsesLow.list( $sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_, level ), ConsesLow.listS( $sym3$FORMAT, $sym4$_SKSI_TRACE_STREAM_, ConsesLow.list( $sym5$CCONCATENATE, $str6$__SKSI__A_,
        format_str ), level, ConsesLow.append( args, NIL ) ), $list7 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 2433L)
  public static SubLObject with_sksi_trace_level(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject trace_level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
    trace_level = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym9$CLET, $list10, ConsesLow.list( $sym11$SKSI_TRACE, trace_level ), reader.bq_cons( $sym12$PROGN, ConsesLow.append( body, NIL ) ), $list13 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3069L)
  public static SubLObject valid_sksi_error_handling_mode_p(final SubLObject mode)
  {
    return makeBoolean( $kw14$CUSTOM == mode || NIL != valid_atomic_sksi_error_handling_mode_p( mode ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3213L)
  public static SubLObject valid_atomic_sksi_error_handling_mode_p(final SubLObject mode)
  {
    return list_utilities.member_eqP( mode, $list15 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3338L)
  public static SubLObject sksi_ignore_errors()
  {
    $sksi_error_handling_mode$.setDynamicValue( $kw16$IGNORE );
    return $kw16$IGNORE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3441L)
  public static SubLObject sksi_warn_on_errors()
  {
    $sksi_error_handling_mode$.setDynamicValue( $kw17$WARN );
    return $kw17$WARN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3541L)
  public static SubLObject sksi_break_on_errors()
  {
    $sksi_error_handling_mode$.setDynamicValue( $kw18$BREAK );
    return $kw18$BREAK;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 3644L)
  public static SubLObject sksi_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $sksi_error_handling_mode$.getDynamicValue( thread ) )
    {
      return $kw16$IGNORE;
    }
    return $sksi_error_handling_mode$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 4024L)
  public static SubLObject sksi_error(final SubLObject error_string)
  {
    if( NIL != sksi_possibly_act_on_custom_error_action( error_string ) )
    {
      return NIL;
    }
    if( NIL == sksi_ignore_errorsP() )
    {
      if( NIL != sksi_warn_on_errorsP() )
      {
        Errors.warn( error_string );
      }
      else if( NIL != sksi_break_on_errorsP() )
      {
        Errors.cerror( $str19$Continue, error_string );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 4331L)
  public static SubLObject sksi_sks_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $sksi_sks_error_handling_mode$.getDynamicValue( thread ) ) ? $sksi_sks_error_handling_mode$.getDynamicValue( thread ) : sksi_error_handling_mode();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 4494L)
  public static SubLObject sksi_registration_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $sksi_registration_error_handling_mode$.getDynamicValue( thread ) ) ? $sksi_registration_error_handling_mode$.getDynamicValue( thread )
        : ( ( NIL != $sksi_error_handling_mode$.getDynamicValue( thread ) ) ? $sksi_error_handling_mode$.getDynamicValue( thread ) : $kw16$IGNORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 4731L)
  public static SubLObject sksi_default_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = sksi_error_handling_mode();
    return ( $kw14$CUSTOM == mode ) ? $sksi_custom_error_handling_default$.getDynamicValue( thread ) : mode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 4920L)
  public static SubLObject sksi_default_sks_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = sksi_sks_error_handling_mode();
    return ( $kw14$CUSTOM == mode ) ? $sksi_custom_error_handling_default$.getDynamicValue( thread ) : mode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 5117L)
  public static SubLObject sksi_default_registration_error_handling_mode()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = sksi_registration_error_handling_mode();
    return ( $kw14$CUSTOM == mode ) ? $sksi_custom_error_handling_default$.getDynamicValue( thread ) : mode;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 6685L)
  public static SubLObject lookup_string_in_sksi_custom_error_handling_table(final SubLObject error_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject action = NIL;
    if( NIL == action )
    {
      SubLObject csome_list_var = $sksi_custom_error_handling_table$.getDynamicValue( thread );
      SubLObject table_pair = NIL;
      table_pair = csome_list_var.first();
      while ( NIL == action && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = table_pair;
        SubLObject table_substring = NIL;
        SubLObject table_action = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
        table_substring = current.first();
        current = ( table_action = current.rest() );
        if( NIL != string_utilities.substringP( table_substring, error_string, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED ) )
        {
          action = table_action;
        }
        csome_list_var = csome_list_var.rest();
        table_pair = csome_list_var.first();
      }
    }
    return action;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 7039L)
  public static SubLObject sksi_possibly_act_on_custom_error_action(final SubLObject error_string)
  {
    if( $kw14$CUSTOM == sksi_error_handling_mode() )
    {
      final SubLObject action = lookup_string_in_sksi_custom_error_handling_table( error_string );
      if( NIL != action )
      {
        final SubLObject pcase_var = action;
        if( !pcase_var.eql( $kw16$IGNORE ) )
        {
          if( pcase_var.eql( $kw17$WARN ) )
          {
            Errors.warn( error_string );
          }
          else if( pcase_var.eql( $kw18$BREAK ) )
          {
            Errors.cerror( $str19$Continue, error_string );
          }
          else
          {
            Errors.cerror( $str19$Continue, $str22$Unexpected_error_action__s_define, action, error_string );
          }
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 7508L)
  public static SubLObject sksi_possibly_act_on_custom_sks_error_action(final SubLObject error_string, final SubLObject sks, final SubLObject error_type)
  {
    if( $kw14$CUSTOM == sksi_sks_error_handling_mode() )
    {
      final SubLObject action = lookup_string_in_sksi_custom_error_handling_table( error_string );
      if( NIL != action )
      {
        final SubLObject pcase_var = action;
        if( !pcase_var.eql( $kw16$IGNORE ) )
        {
          if( pcase_var.eql( $kw17$WARN ) )
          {
            Errors.warn( error_string );
          }
          else if( pcase_var.eql( $kw18$BREAK ) )
          {
            final SubLObject cont_string = Sequences.cconcatenate( $str23$Continue_without_accessing_, new SubLObject[] { format_nil.format_nil_a_no_copy( sks ), $str24$_
            } );
            Errors.cerror( cont_string, error_string );
          }
          else
          {
            Errors.cerror( $str19$Continue, $str22$Unexpected_error_action__s_define, action, error_string );
          }
        }
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8125L)
  public static SubLObject sksi_ignore_errorsP()
  {
    return Equality.eq( sksi_default_error_handling_mode(), $kw16$IGNORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8224L)
  public static SubLObject sksi_warn_on_errorsP()
  {
    return Equality.eq( sksi_default_error_handling_mode(), $kw17$WARN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8322L)
  public static SubLObject sksi_break_on_errorsP()
  {
    return Equality.eq( sksi_default_error_handling_mode(), $kw18$BREAK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8424L)
  public static SubLObject sksi_ignore_sks_errorsP()
  {
    return Equality.eq( sksi_default_sks_error_handling_mode(), $kw16$IGNORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8531L)
  public static SubLObject sksi_warn_on_sks_errorsP()
  {
    return Equality.eq( sksi_default_sks_error_handling_mode(), $kw17$WARN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8637L)
  public static SubLObject sksi_break_on_sks_errorsP()
  {
    return Equality.eq( sksi_default_sks_error_handling_mode(), $kw18$BREAK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8745L)
  public static SubLObject sksi_ignore_registration_errorsP()
  {
    return Equality.eq( sksi_default_registration_error_handling_mode(), $kw16$IGNORE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8870L)
  public static SubLObject sksi_warn_on_registration_errorsP()
  {
    return Equality.eq( sksi_default_registration_error_handling_mode(), $kw17$WARN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 8994L)
  public static SubLObject sksi_break_on_registration_errorsP()
  {
    return Equality.eq( sksi_default_registration_error_handling_mode(), $kw18$BREAK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9120L)
  public static SubLObject with_sksi_error_handling_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym12$PROGN, ConsesLow.listS( $sym26$CHECK_TYPE, mode, $list27 ), ConsesLow.listS( $sym9$CLET, ConsesLow.list( ConsesLow.list( $sym28$_SKSI_ERROR_HANDLING_MODE_, mode ) ), ConsesLow.append(
        body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9322L)
  public static SubLObject with_sksi_ignore_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym29$WITH_SKSI_ERROR_HANDLING_MODE, $kw16$IGNORE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9440L)
  public static SubLObject with_sksi_warn_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym29$WITH_SKSI_ERROR_HANDLING_MODE, $kw17$WARN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9557L)
  public static SubLObject with_sksi_break_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym9$CLET, $list30, ConsesLow.listS( $sym29$WITH_SKSI_ERROR_HANDLING_MODE, $kw18$BREAK, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9713L)
  public static SubLObject with_sksi_sks_error_handling_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym12$PROGN, ConsesLow.listS( $sym26$CHECK_TYPE, mode, $list27 ), ConsesLow.listS( $sym9$CLET, ConsesLow.list( ConsesLow.list( $sym31$_SKSI_SKS_ERROR_HANDLING_MODE_, mode ) ), ConsesLow
        .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 9923L)
  public static SubLObject with_sksi_ignore_sks_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym32$WITH_SKSI_SKS_ERROR_HANDLING_MODE, $kw16$IGNORE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10049L)
  public static SubLObject with_sksi_warn_on_sks_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym32$WITH_SKSI_SKS_ERROR_HANDLING_MODE, $kw17$WARN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10174L)
  public static SubLObject with_sksi_break_on_sks_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym9$CLET, $list30, ConsesLow.listS( $sym32$WITH_SKSI_SKS_ERROR_HANDLING_MODE, $kw18$BREAK, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10338L)
  public static SubLObject with_sksi_registration_error_handling_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym12$PROGN, ConsesLow.listS( $sym26$CHECK_TYPE, mode, $list27 ), ConsesLow.listS( $sym9$CLET, ConsesLow.list( ConsesLow.list( $sym33$_SKSI_REGISTRATION_ERROR_HANDLING_MODE_, mode ) ),
        ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10566L)
  public static SubLObject with_sksi_ignore_registration_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym34$WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $kw16$IGNORE, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10710L)
  public static SubLObject with_sksi_warn_on_registration_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym34$WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $kw17$WARN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 10853L)
  public static SubLObject with_sksi_break_on_registration_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym9$CLET, $list30, ConsesLow.listS( $sym34$WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $kw18$BREAK, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 11035L)
  public static SubLObject with_sksi_tracing_to_string_stream(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject result = NIL;
    SubLObject trace_level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
    trace_level = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject string_stream = $sym36$STRING_STREAM;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( reader.bq_cons( string_stream, $list37 ) ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( $sym4$_SKSI_TRACE_STREAM_, string_stream ) ), ConsesLow
          .listS( $sym38$WITH_SKSI_TRACE_LEVEL, ConsesLow.list( trace_level ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym39$CSETQ, result, ConsesLow.list( $sym40$GET_OUTPUT_STREAM_STRING,
              string_stream ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 12128L)
  public static SubLObject sksi_violation_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $sksi_violations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 12220L)
  public static SubLObject sksi_violations()
  {
    return $sksi_violations$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 12285L)
  public static SubLObject sksi_violation_message(final SubLObject violation, final SubLObject result)
  {
    if( violation.eql( $kw42$SKSI_MISSING_DECODINGS ) )
    {
      return sksi_missing_decodings_message( result );
    }
    if( violation.eql( $kw43$SKSI_MISSING_ENCODINGS ) )
    {
      return sksi_missing_encodings_message( result );
    }
    if( violation.eql( $kw44$SKSI_MISSING_FIELDS ) )
    {
      return sksi_missing_fields_message( result );
    }
    if( violation.eql( $kw45$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL ) )
    {
      return sksi_missing_physical_field_for_indexical_message( result );
    }
    if( violation.eql( $kw46$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL ) )
    {
      return sksi_missing_logical_field_for_indexical_message( result );
    }
    if( violation.eql( $kw47$SKSI_MISSING_REQUIRED_FIELD_VALUE ) )
    {
      return sksi_missing_required_field_value_message( result );
    }
    if( violation.eql( $kw48$SKSI_LIT_MS_ARG_MISMATCH ) )
    {
      return sksi_lit_ms_arg_mismatch_message( result );
    }
    if( violation.eql( $kw49$SKSI_UNREFORMULATABLE ) )
    {
      return sksi_unreformulatable_message( result );
    }
    if( violation.eql( $kw50$SKSI_COMPARISON_ASENT_INAPPLICABLE ) )
    {
      return sksi_comparison_asent_inapplicable_message( result );
    }
    if( violation.eql( $kw51$SKSI_COMPARISON_OPERATOR_FORBIDDEN ) )
    {
      return sksi_comparison_operator_forbidden_message( result );
    }
    if( violation.eql( $kw52$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND ) )
    {
      return sksi_comparison_asent_no_variable_found_message( result );
    }
    if( violation.eql( $kw53$SKSI_LIST_LENGTH_MISMATCH ) )
    {
      return sksi_list_length_mismatch_message( result );
    }
    if( violation.eql( $kw54$SKSI_EVALUATE_CSQL_UNPRODUCIBLE ) )
    {
      return sksi_evaluate_csql_unproducible_message( result );
    }
    if( violation.eql( $kw55$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE ) )
    {
      return sksi_unknown_sentence_csql_unproducible_message( result );
    }
    return Errors.cerror( $str56$Continue_anyway, $str57$Unknown_violation__s_, violation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 13822L)
  public static SubLObject sksi_missing_decodings_message(final SubLObject logical_field)
  {
    return Sequences.cconcatenate( $str58$Could_not_find_decodings_for_, new SubLObject[] { format_nil.format_nil_s_no_copy( logical_field ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 13957L)
  public static SubLObject sksi_missing_encodings_message(final SubLObject physical_field_indexical)
  {
    return Sequences.cconcatenate( $str59$Could_not_find_encodings_for_, new SubLObject[] { format_nil.format_nil_s_no_copy( physical_field_indexical ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 14114L)
  public static SubLObject sksi_missing_fields_message(final SubLObject meaning_sentence_arg)
  {
    return Sequences.cconcatenate( $str60$Could_not_find_fields_for_, new SubLObject[] { format_nil.format_nil_s_no_copy( meaning_sentence_arg ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 14257L)
  public static SubLObject sksi_missing_physical_field_for_indexical_message(final SubLObject physical_field_indexical)
  {
    return Sequences.cconcatenate( $str61$Could_not_find_physical_field_for, new SubLObject[] { format_nil.format_nil_s_no_copy( physical_field_indexical ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 14448L)
  public static SubLObject sksi_missing_logical_field_for_indexical_message(final SubLObject logical_field_indexical)
  {
    return Sequences.cconcatenate( $str62$Could_not_find_logical_field_for_, new SubLObject[] { format_nil.format_nil_s_no_copy( logical_field_indexical ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 14635L)
  public static SubLObject sksi_missing_required_field_value_message(final SubLObject args)
  {
    SubLObject physical_field = NIL;
    SubLObject physical_schema = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list63 );
    physical_field = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list63 );
    physical_schema = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Sequences.cconcatenate( $str64$Missing_a_value_for_, new SubLObject[] { format_nil.format_nil_s_no_copy( physical_field ), $str65$__which_is_a___requiredFields_for, format_nil.format_nil_s_no_copy(
          physical_schema ), $str24$_
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list63 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 14880L)
  public static SubLObject sksi_lit_ms_arg_mismatch_message(final SubLObject args)
  {
    SubLObject lit_arg = NIL;
    SubLObject meaning_sentence_arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list66 );
    lit_arg = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list66 );
    meaning_sentence_arg = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Sequences.cconcatenate( $str67$Mismatch_between_literal_argument, new SubLObject[] { format_nil.format_nil_s_no_copy( lit_arg ), $str68$_and_meaning_sentence_argument_, format_nil.format_nil_s_no_copy(
          meaning_sentence_arg ), $str24$_
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list66 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15123L)
  public static SubLObject sksi_unreformulatable_message(final SubLObject expression)
  {
    return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( expression ), $str69$_unreformulatable_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15239L)
  public static SubLObject sksi_comparison_asent_inapplicable_message(final SubLObject expression)
  {
    return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( expression ), $str70$_inapplicable_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15364L)
  public static SubLObject sksi_comparison_operator_forbidden_message(final SubLObject operator)
  {
    return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( operator ), $str71$_forbidden_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15482L)
  public static SubLObject sksi_comparison_asent_no_variable_found_message(final SubLObject operator)
  {
    return Sequences.cconcatenate( format_nil.format_nil_s_no_copy( operator ), $str72$_has_no_variables_so_can_t_sent_t );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15632L)
  public static SubLObject sksi_list_length_mismatch_message(final SubLObject args)
  {
    SubLObject list0 = NIL;
    SubLObject list2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list73 );
    list0 = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list73 );
    list2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Sequences.cconcatenate( $str74$Mismatch_between_lengths_of_, new SubLObject[] { format_nil.format_nil_s_no_copy( list0 ), $str75$_and_, format_nil.format_nil_s_no_copy( list2 ), $str24$_
      } );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15810L)
  public static SubLObject sksi_evaluate_csql_unproducible_message(final SubLObject expression)
  {
    return Sequences.cconcatenate( $str76$No_CSQL_can_be_generated_for_the_, new SubLObject[] { format_nil.format_nil_a_no_copy( expression ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 15972L)
  public static SubLObject sksi_unknown_sentence_csql_unproducible_message(final SubLObject expression)
  {
    return Sequences.cconcatenate( $str77$No_CSQL_can_be_generated_for_the_, new SubLObject[] { format_nil.format_nil_a_no_copy( expression ), $str24$_
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 16153L)
  public static SubLObject with_sksi_violation_handling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject violation = NIL;
    SubLObject message_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    violation = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
    message_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject result = $sym79$RESULT;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( result ), ConsesLow.listS( $sym80$CCATCH, violation, result, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym1$PWHEN, result, ConsesLow.list( $sym39$CSETQ,
          message_var, ConsesLow.list( $sym81$SKSI_VIOLATION_MESSAGE, violation, result ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 16448L)
  public static SubLObject with_sksi_crm_violation_handling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject message_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    message_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw42$SKSI_MISSING_DECODINGS, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list(
          $kw43$SKSI_MISSING_ENCODINGS, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw44$SKSI_MISSING_FIELDS, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING,
              ConsesLow.list( $kw45$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw46$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL,
                  message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw47$SKSI_MISSING_REQUIRED_FIELD_VALUE, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow
                      .list( $kw48$SKSI_LIT_MS_ARG_MISMATCH, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw49$SKSI_UNREFORMULATABLE, message_var ), ConsesLow.list(
                          $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw50$SKSI_COMPARISON_ASENT_INAPPLICABLE, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list(
                              $kw51$SKSI_COMPARISON_OPERATOR_FORBIDDEN, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw52$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND, message_var ),
                                  ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw53$SKSI_LIST_LENGTH_MISMATCH, message_var ), ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list(
                                      $kw54$SKSI_EVALUATE_CSQL_UNPRODUCIBLE, message_var ), ConsesLow.listS( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw55$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE,
                                          message_var ), ConsesLow.append( body, NIL ) ) ) ) ) ) ) ) ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 17719L)
  public static SubLObject with_sksi_translation_violation_handling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject message_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    message_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list( $kw42$SKSI_MISSING_DECODINGS, message_var ), ConsesLow.listS( $sym83$WITH_SKSI_VIOLATION_HANDLING, ConsesLow.list(
          $kw43$SKSI_MISSING_ENCODINGS, message_var ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-debugging.lisp", position = 17973L)
  public static SubLObject clear_sksi_caches()
  {
    data_parser.clear_semantic_etl_upper_ontology_termP();
    data_parser.clear_data_parser_all_genls();
    data_parser.clear_data_parser_all_isa();
    sksi_batch_translate.clear_sksi_schema_translation_lifting_rule();
    sksi_batch_translate.clear_sksi_get_datum_var();
    sksi_batch_translate.clear_sksi_get_raw_var();
    sksi_batch_translate.clear_sksi_get_arg_var();
    sksi_batch_translate.clear_sksi_schema_translation_lifting_rule();
    sksi_batch_translate.clear_sksi_get_datum_var();
    sksi_batch_translate.clear_sksi_get_raw_var();
    sksi_batch_translate.clear_sksi_get_arg_var();
    mapping_engine.clear_date_genls();
    reformulator_module_quantifier_unifier_3.clear_all_fort_instances_cached();
    sksi_smt.clear_sksi_smt_compile_param_definitions();
    sksi_smt.clear_sksi_smt_column_or_fort_name();
    sksi_smt.clear_sksi_smt_compile_param_definitions();
    sksi_smt.clear_sksi_smt_column_or_fort_name();
    simple_db.clear_simple_sksi_terms();
    simple_db.clear_simple_sksi_assertions_for_sks();
    simple_db.clear_simple_sksi_terms();
    simple_db.clear_simple_sksi_assertions_for_sks();
    sksi_removal_module_generation.clear_generate_sksi_slrm_required_function();
    sksi_removal_module_generation.clear_generate_sksi_slrm_required_function();
    sksi_report_generation.clear_run_column_query();
    sksi_report_generation.clear_run_column_query();
    semantic_etl_bus.clear_semantic_etl_fuse_databases();
    sksi_kb_accessors.clear_sksi_content_mts();
    sksi_reformulate.clear_cmls_decoding_table();
    sksi_result_set_iterators.clear_cached_sqlrs_all_rows();
    sksi_sks_interaction.clear_get_results_from_sksi_web_page_subl_method_cached();
    sksi_sks_interaction.clear_cached_get_result_set_from_sql_source();
    sksi_sks_interaction.clear_cached_get_result_set_from_sparql_source();
    sksi_kb_accessors.clear_sksi_content_mts();
    sksi_reformulate.clear_cmls_decoding_table();
    sksi_result_set_iterators.clear_cached_sqlrs_all_rows();
    sksi_sks_interaction.clear_get_results_from_sksi_web_page_subl_method_cached();
    sksi_sks_interaction.clear_cached_get_result_set_from_sql_source();
    sksi_sks_interaction.clear_cached_get_result_set_from_sparql_source();
    data_parser.clear_semantic_etl_upper_ontology_termP();
    data_parser.clear_data_parser_all_genls();
    data_parser.clear_data_parser_all_isa();
    mapping_engine.clear_date_genls();
    reformulator_module_quantifier_unifier_3.clear_all_fort_instances_cached();
    semantic_etl_bus.clear_semantic_etl_fuse_databases();
    return NIL;
  }

  public static SubLObject declare_sksi_debugging_file()
  {
    SubLFiles.declareFunction( me, "sksi_trace", "SKSI-TRACE", 0, 1, false );
    SubLFiles.declareFunction( me, "sksi_untrace", "SKSI-UNTRACE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_set_trace_level", "SKSI-SET-TRACE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_cinc_trace_level", "SKSI-CINC-TRACE-LEVEL", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_trace_level_exceeds_minimumP", "SKSI-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false );
    SubLFiles.declareMacro( me, "sksi_note", "SKSI-NOTE" );
    SubLFiles.declareMacro( me, "with_sksi_trace_level", "WITH-SKSI-TRACE-LEVEL" );
    SubLFiles.declareFunction( me, "valid_sksi_error_handling_mode_p", "VALID-SKSI-ERROR-HANDLING-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_atomic_sksi_error_handling_mode_p", "VALID-ATOMIC-SKSI-ERROR-HANDLING-MODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_ignore_errors", "SKSI-IGNORE-ERRORS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_warn_on_errors", "SKSI-WARN-ON-ERRORS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_break_on_errors", "SKSI-BREAK-ON-ERRORS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_error_handling_mode", "SKSI-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_error", "SKSI-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_sks_error_handling_mode", "SKSI-SKS-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_registration_error_handling_mode", "SKSI-REGISTRATION-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_default_error_handling_mode", "SKSI-DEFAULT-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_default_sks_error_handling_mode", "SKSI-DEFAULT-SKS-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_default_registration_error_handling_mode", "SKSI-DEFAULT-REGISTRATION-ERROR-HANDLING-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "lookup_string_in_sksi_custom_error_handling_table", "LOOKUP-STRING-IN-SKSI-CUSTOM-ERROR-HANDLING-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_possibly_act_on_custom_error_action", "SKSI-POSSIBLY-ACT-ON-CUSTOM-ERROR-ACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_possibly_act_on_custom_sks_error_action", "SKSI-POSSIBLY-ACT-ON-CUSTOM-SKS-ERROR-ACTION", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_ignore_errorsP", "SKSI-IGNORE-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_warn_on_errorsP", "SKSI-WARN-ON-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_break_on_errorsP", "SKSI-BREAK-ON-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_ignore_sks_errorsP", "SKSI-IGNORE-SKS-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_warn_on_sks_errorsP", "SKSI-WARN-ON-SKS-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_break_on_sks_errorsP", "SKSI-BREAK-ON-SKS-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_ignore_registration_errorsP", "SKSI-IGNORE-REGISTRATION-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_warn_on_registration_errorsP", "SKSI-WARN-ON-REGISTRATION-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_break_on_registration_errorsP", "SKSI-BREAK-ON-REGISTRATION-ERRORS?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_error_handling_mode", "WITH-SKSI-ERROR-HANDLING-MODE" );
    SubLFiles.declareMacro( me, "with_sksi_ignore_errors", "WITH-SKSI-IGNORE-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_warn_on_errors", "WITH-SKSI-WARN-ON-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_break_on_errors", "WITH-SKSI-BREAK-ON-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_sks_error_handling_mode", "WITH-SKSI-SKS-ERROR-HANDLING-MODE" );
    SubLFiles.declareMacro( me, "with_sksi_ignore_sks_errors", "WITH-SKSI-IGNORE-SKS-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_warn_on_sks_errors", "WITH-SKSI-WARN-ON-SKS-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_break_on_sks_errors", "WITH-SKSI-BREAK-ON-SKS-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_registration_error_handling_mode", "WITH-SKSI-REGISTRATION-ERROR-HANDLING-MODE" );
    SubLFiles.declareMacro( me, "with_sksi_ignore_registration_errors", "WITH-SKSI-IGNORE-REGISTRATION-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_warn_on_registration_errors", "WITH-SKSI-WARN-ON-REGISTRATION-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_break_on_registration_errors", "WITH-SKSI-BREAK-ON-REGISTRATION-ERRORS" );
    SubLFiles.declareMacro( me, "with_sksi_tracing_to_string_stream", "WITH-SKSI-TRACING-TO-STRING-STREAM" );
    SubLFiles.declareFunction( me, "sksi_violation_p", "SKSI-VIOLATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_violations", "SKSI-VIOLATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_violation_message", "SKSI-VIOLATION-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_decodings_message", "SKSI-MISSING-DECODINGS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_encodings_message", "SKSI-MISSING-ENCODINGS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_fields_message", "SKSI-MISSING-FIELDS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_physical_field_for_indexical_message", "SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_logical_field_for_indexical_message", "SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_missing_required_field_value_message", "SKSI-MISSING-REQUIRED-FIELD-VALUE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_lit_ms_arg_mismatch_message", "SKSI-LIT-MS-ARG-MISMATCH-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_unreformulatable_message", "SKSI-UNREFORMULATABLE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_comparison_asent_inapplicable_message", "SKSI-COMPARISON-ASENT-INAPPLICABLE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_comparison_operator_forbidden_message", "SKSI-COMPARISON-OPERATOR-FORBIDDEN-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_comparison_asent_no_variable_found_message", "SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_list_length_mismatch_message", "SKSI-LIST-LENGTH-MISMATCH-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_evaluate_csql_unproducible_message", "SKSI-EVALUATE-CSQL-UNPRODUCIBLE-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_unknown_sentence_csql_unproducible_message", "SKSI-UNKNOWN-SENTENCE-CSQL-UNPRODUCIBLE-MESSAGE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_violation_handling", "WITH-SKSI-VIOLATION-HANDLING" );
    SubLFiles.declareMacro( me, "with_sksi_crm_violation_handling", "WITH-SKSI-CRM-VIOLATION-HANDLING" );
    SubLFiles.declareMacro( me, "with_sksi_translation_violation_handling", "WITH-SKSI-TRANSLATION-VIOLATION-HANDLING" );
    SubLFiles.declareFunction( me, "clear_sksi_caches", "CLEAR-SKSI-CACHES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_debugging_file()
  {
    $sksi_min_trace_level$ = SubLFiles.defconstant( "*SKSI-MIN-TRACE-LEVEL*", ZERO_INTEGER );
    $sksi_trace_level$ = SubLFiles.defparameter( "*SKSI-TRACE-LEVEL*", $sksi_min_trace_level$.getGlobalValue() );
    $sksi_trace_stream$ = SubLFiles.defparameter( "*SKSI-TRACE-STREAM*", T );
    $sksi_error_handling_mode$ = SubLFiles.defparameter( "*SKSI-ERROR-HANDLING-MODE*", NIL );
    $sksi_sks_error_handling_mode$ = SubLFiles.defparameter( "*SKSI-SKS-ERROR-HANDLING-MODE*", NIL );
    $sksi_registration_error_handling_mode$ = SubLFiles.defparameter( "*SKSI-REGISTRATION-ERROR-HANDLING-MODE*", NIL );
    $sksi_custom_error_handling_table$ = SubLFiles.defparameter( "*SKSI-CUSTOM-ERROR-HANDLING-TABLE*", $list20 );
    $sksi_custom_error_handling_default$ = SubLFiles.defparameter( "*SKSI-CUSTOM-ERROR-HANDLING-DEFAULT*", $kw17$WARN );
    $sksi_violations$ = SubLFiles.deflexical( "*SKSI-VIOLATIONS*", $list41 );
    return NIL;
  }

  public static SubLObject setup_sksi_debugging_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_debugging_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_debugging_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_debugging_file();
  }
  static
  {
    me = new sksi_debugging();
    $sksi_min_trace_level$ = null;
    $sksi_trace_level$ = null;
    $sksi_trace_stream$ = null;
    $sksi_error_handling_mode$ = null;
    $sksi_sks_error_handling_mode$ = null;
    $sksi_registration_error_handling_mode$ = null;
    $sksi_custom_error_handling_table$ = null;
    $sksi_custom_error_handling_default$ = null;
    $sksi_violations$ = null;
    $list0 = ConsesLow.list( makeSymbol( "LEVEL" ), makeSymbol( "FORMAT-STR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym1$PWHEN = makeSymbol( "PWHEN" );
    $sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_ = makeSymbol( "SKSI-TRACE-LEVEL-EXCEEDS-MINIMUM?" );
    $sym3$FORMAT = makeSymbol( "FORMAT" );
    $sym4$_SKSI_TRACE_STREAM_ = makeSymbol( "*SKSI-TRACE-STREAM*" );
    $sym5$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str6$__SKSI__A_ = makeString( "~&SKSI-~A " );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeSymbol( "*SKSI-TRACE-STREAM*" ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRACE-LEVEL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym9$CLET = makeSymbol( "CLET" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-TRACE-LEVEL*" ) ) );
    $sym11$SKSI_TRACE = makeSymbol( "SKSI-TRACE" );
    $sym12$PROGN = makeSymbol( "PROGN" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "SKSI-UNTRACE" ) ) );
    $kw14$CUSTOM = makeKeyword( "CUSTOM" );
    $list15 = ConsesLow.list( makeKeyword( "IGNORE" ), makeKeyword( "WARN" ), makeKeyword( "BREAK" ), makeKeyword( "CUSTOM" ) );
    $kw16$IGNORE = makeKeyword( "IGNORE" );
    $kw17$WARN = makeKeyword( "WARN" );
    $kw18$BREAK = makeKeyword( "BREAK" );
    $str19$Continue = makeString( "Continue" );
    $list20 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeString( "#<SDBC-CLIENT-ERROR" ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "#<SDBC-SQL-ERROR: This connection has been closed.>" ),
        makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "This connection has been closed." ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "Invalid operation: statement is closed." ), makeKeyword(
            "BREAK" ) ), ConsesLow.cons( makeString( "Connection timed out" ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "end-of-file on stream" ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString(
                "Got invalid type for object: NIL. Wanted type: STREAMP Actual type: NIL" ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "FATAL: terminating connection due to administrator command" ),
                    makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "ERRORCODE=-4470" ), makeKeyword( "BREAK" ) ), ConsesLow.cons( makeString( "SQLCODE=-1001" ), makeKeyword( "BREAK" ) ), ConsesLow.cons(
                        makeString( "SQLCODE=-206" ), makeKeyword( "WARN" ) ), ConsesLow.cons( makeString( "SQLCODE=-204" ), makeKeyword( "WARN" ) ), ConsesLow.cons( makeString(
                            "No field encodings for physical field indexical" ), makeKeyword( "WARN" ) )
    } );
    $list21 = ConsesLow.cons( makeSymbol( "TABLE-SUBSTRING" ), makeSymbol( "TABLE-ACTION" ) );
    $str22$Unexpected_error_action__s_define = makeString( "Unexpected error action ~s defined for substring ~s" );
    $str23$Continue_without_accessing_ = makeString( "Continue without accessing " );
    $str24$_ = makeString( "." );
    $list25 = ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym26$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list27 = ConsesLow.list( makeSymbol( "VALID-SKSI-ERROR-HANDLING-MODE-P" ) );
    $sym28$_SKSI_ERROR_HANDLING_MODE_ = makeSymbol( "*SKSI-ERROR-HANDLING-MODE*" );
    $sym29$WITH_SKSI_ERROR_HANDLING_MODE = makeSymbol( "WITH-SKSI-ERROR-HANDLING-MODE" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "*INFERENCE-DEBUG?*" ), T ) );
    $sym31$_SKSI_SKS_ERROR_HANDLING_MODE_ = makeSymbol( "*SKSI-SKS-ERROR-HANDLING-MODE*" );
    $sym32$WITH_SKSI_SKS_ERROR_HANDLING_MODE = makeSymbol( "WITH-SKSI-SKS-ERROR-HANDLING-MODE" );
    $sym33$_SKSI_REGISTRATION_ERROR_HANDLING_MODE_ = makeSymbol( "*SKSI-REGISTRATION-ERROR-HANDLING-MODE*" );
    $sym34$WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE = makeSymbol( "WITH-SKSI-REGISTRATION-ERROR-HANDLING-MODE" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "TRACE-LEVEL" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym36$STRING_STREAM = makeUninternedSymbol( "STRING-STREAM" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAKE-STRING-OUTPUT-STREAM" ) ) );
    $sym38$WITH_SKSI_TRACE_LEVEL = makeSymbol( "WITH-SKSI-TRACE-LEVEL" );
    $sym39$CSETQ = makeSymbol( "CSETQ" );
    $sym40$GET_OUTPUT_STREAM_STRING = makeSymbol( "GET-OUTPUT-STREAM-STRING" );
    $list41 = ConsesLow.list( new SubLObject[] { makeKeyword( "SKSI-MISSING-DECODINGS" ), makeKeyword( "SKSI-MISSING-ENCODINGS" ), makeKeyword( "SKSI-MISSING-FIELDS" ), makeKeyword(
        "SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL" ), makeKeyword( "SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL" ), makeKeyword( "SKSI-MISSING-REQUIRED-FIELD-VALUE" ), makeKeyword( "SKSI-LIT-MS-ARG-MISMATCH" ),
      makeKeyword( "SKSI-UNREFORMULATABLE" ), makeKeyword( "SKSI-COMPARISON-ASENT-INAPPLICABLE" ), makeKeyword( "SKSI-COMPARISON-OPERATOR-FORBIDDEN" ), makeKeyword( "SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND" ),
      makeKeyword( "SKSI-LIST-LENGTH-MISMATCH" )
    } );
    $kw42$SKSI_MISSING_DECODINGS = makeKeyword( "SKSI-MISSING-DECODINGS" );
    $kw43$SKSI_MISSING_ENCODINGS = makeKeyword( "SKSI-MISSING-ENCODINGS" );
    $kw44$SKSI_MISSING_FIELDS = makeKeyword( "SKSI-MISSING-FIELDS" );
    $kw45$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL = makeKeyword( "SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL" );
    $kw46$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL = makeKeyword( "SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL" );
    $kw47$SKSI_MISSING_REQUIRED_FIELD_VALUE = makeKeyword( "SKSI-MISSING-REQUIRED-FIELD-VALUE" );
    $kw48$SKSI_LIT_MS_ARG_MISMATCH = makeKeyword( "SKSI-LIT-MS-ARG-MISMATCH" );
    $kw49$SKSI_UNREFORMULATABLE = makeKeyword( "SKSI-UNREFORMULATABLE" );
    $kw50$SKSI_COMPARISON_ASENT_INAPPLICABLE = makeKeyword( "SKSI-COMPARISON-ASENT-INAPPLICABLE" );
    $kw51$SKSI_COMPARISON_OPERATOR_FORBIDDEN = makeKeyword( "SKSI-COMPARISON-OPERATOR-FORBIDDEN" );
    $kw52$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND = makeKeyword( "SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND" );
    $kw53$SKSI_LIST_LENGTH_MISMATCH = makeKeyword( "SKSI-LIST-LENGTH-MISMATCH" );
    $kw54$SKSI_EVALUATE_CSQL_UNPRODUCIBLE = makeKeyword( "SKSI-EVALUATE-CSQL-UNPRODUCIBLE" );
    $kw55$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE = makeKeyword( "SKSI-UNKNOWN-SENTENCE-CSQL-UNPRODUCIBLE" );
    $str56$Continue_anyway = makeString( "Continue anyway" );
    $str57$Unknown_violation__s_ = makeString( "Unknown violation ~s." );
    $str58$Could_not_find_decodings_for_ = makeString( "Could not find decodings for " );
    $str59$Could_not_find_encodings_for_ = makeString( "Could not find encodings for " );
    $str60$Could_not_find_fields_for_ = makeString( "Could not find fields for " );
    $str61$Could_not_find_physical_field_for = makeString( "Could not find physical field for indexical " );
    $str62$Could_not_find_logical_field_for_ = makeString( "Could not find logical field for indexical " );
    $list63 = ConsesLow.list( makeSymbol( "PHYSICAL-FIELD" ), makeSymbol( "PHYSICAL-SCHEMA" ) );
    $str64$Missing_a_value_for_ = makeString( "Missing a value for " );
    $str65$__which_is_a___requiredFields_for = makeString( ", which is a #$requiredFields for " );
    $list66 = ConsesLow.list( makeSymbol( "LIT-ARG" ), makeSymbol( "MEANING-SENTENCE-ARG" ) );
    $str67$Mismatch_between_literal_argument = makeString( "Mismatch between literal argument " );
    $str68$_and_meaning_sentence_argument_ = makeString( " and meaning sentence argument " );
    $str69$_unreformulatable_ = makeString( " unreformulatable." );
    $str70$_inapplicable_ = makeString( " inapplicable." );
    $str71$_forbidden_ = makeString( " forbidden." );
    $str72$_has_no_variables_so_can_t_sent_t = makeString( " has no variables so can't sent to DB." );
    $list73 = ConsesLow.list( makeSymbol( "LIST0" ), makeSymbol( "LIST1" ) );
    $str74$Mismatch_between_lengths_of_ = makeString( "Mismatch between lengths of " );
    $str75$_and_ = makeString( " and " );
    $str76$No_CSQL_can_be_generated_for_the_ = makeString( "No CSQL can be generated for the evaluate expression " );
    $str77$No_CSQL_can_be_generated_for_the_ = makeString( "No CSQL can be generated for the sksiUnknownSentence expression " );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "VIOLATION" ), makeSymbol( "MESSAGE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym79$RESULT = makeUninternedSymbol( "RESULT" );
    $sym80$CCATCH = makeSymbol( "CCATCH" );
    $sym81$SKSI_VIOLATION_MESSAGE = makeSymbol( "SKSI-VIOLATION-MESSAGE" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "MESSAGE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym83$WITH_SKSI_VIOLATION_HANDLING = makeSymbol( "WITH-SKSI-VIOLATION-HANDLING" );
  }
}
/*
 * 
 * Total time: 205 ms
 * 
 */