package com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_schema_validator
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.sksi_schema_validator";
  public static final String myFingerPrint = "d7611a81e524b2eeda1c9a722515e3658e5ea37069ca65128aa23e12d4a214e2";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 2047L)
  private static SubLSymbol $sksi_relevant_salient_descriptor_predicates$;
  private static final SubLList $list0;
  private static final SubLString $str1$__Validating_the_knowledge_source;
  private static final SubLObject $const2$StructuredKnowledgeSource_Complex;
  private static final SubLString $str3$Validating_the_physical_schemata_;
  private static final SubLString $str4$cdolist;
  private static final SubLString $str5$Validating_the_sub_knowledge_sour;
  private static final SubLString $str6$__Validating_the_physical_schema_;
  private static final SubLString $str7$Validating_the_logical_schemata__;
  private static final SubLString $str8$Validating_the_physical_fields___;
  private static final SubLString $str9$__Validating_the_logical_schema__;
  private static final SubLString $str10$Validating_the_meaning_sentences_;
  private static final SubLString $str11$Validating_the_logical_fields___;
  private static final SubLSymbol $sym12$SKSI_LOGICAL_FIELD_VALIDATOR;
  private static final SubLString $str13$__The_predicate__A_is_not_a_valid;
  private static final SubLString $str14$__The_following_meaning_sentence_;
  private static final SubLSymbol $sym15$_FORMULA;
  private static final SubLString $str16$__Validating_the_requirements_for;
  private static final SubLString $str17$__The_following_requirement_is_no;
  private static final SubLList $list18;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 2477L)
  public static SubLObject sksi_structured_knowledge_source_validator(final SubLObject sks, final SubLObject meta_mt, SubLObject validate_sub_ksesP)
  {
    if( validate_sub_ksesP == UNPROVIDED )
    {
      validate_sub_ksesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str1$__Validating_the_knowledge_source, sks );
    SubLObject all_requirements_satisfiedP = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        all_requirements_satisfiedP = sksi_structured_knowledge_source_validator_int( sks, meta_mt, validate_sub_ksesP );
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return all_requirements_satisfiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 3502L)
  public static SubLObject sksi_structured_knowledge_source_validator_int(final SubLObject sks, final SubLObject meta_mt, final SubLObject validate_sub_ksesP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject all_requirements_satisfiedP = sksi_term_validator( sks, meta_mt );
    SubLObject sub_kses_to_be_validatedP = NIL;
    SubLObject content_mt = NIL;
    SubLObject sub_kses = NIL;
    SubLObject physical_schemata = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( meta_mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( meta_mt ), thread );
      sub_kses_to_be_validatedP = makeBoolean( NIL != validate_sub_ksesP && NIL != isa.isaP( sks, $const2$StructuredKnowledgeSource_Complex, UNPROVIDED, UNPROVIDED ) );
      content_mt = sksi_kb_accessors.sk_source_content_mt( sks );
      physical_schemata = sksi_kb_accessors.sk_source_physical_schemata( sks );
      if( NIL != sub_kses_to_be_validatedP )
      {
        sub_kses = sksi_kb_accessors.sk_source_immediate_spec_sk_sources( sks, meta_mt );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject list_var = physical_schemata;
    SubLObject _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
    SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str3$Validating_the_physical_schemata_, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject physical_schema = NIL;
        physical_schema = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject ps_satisfies_all_requirementsP = sksi_physical_schema_validator( physical_schema, meta_mt, content_mt );
          if( NIL == ps_satisfies_all_requirementsP )
          {
            all_requirements_satisfiedP = ps_satisfies_all_requirementsP;
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          physical_schema = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
    }
    if( NIL != sub_kses_to_be_validatedP )
    {
      list_var = sub_kses;
      _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
      _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
      _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
      _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
      _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str5$Validating_the_sub_knowledge_sour, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject sub_ks = NIL;
          sub_ks = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            final SubLObject sub_ks_satisfies_all_requirementsP = sksi_structured_knowledge_source_validator_int( sub_ks, meta_mt, validate_sub_ksesP );
            if( NIL == sub_ks_satisfies_all_requirementsP )
            {
              all_requirements_satisfiedP = sub_ks_satisfies_all_requirementsP;
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            sub_ks = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
      }
    }
    return all_requirements_satisfiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 4870L)
  public static SubLObject sksi_physical_schema_validator(final SubLObject physical_schema, final SubLObject meta_mt, SubLObject content_mt)
  {
    if( content_mt == UNPROVIDED )
    {
      content_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str6$__Validating_the_physical_schema_, physical_schema );
    SubLObject all_requirements_satisfiedP = sksi_term_validator( physical_schema, meta_mt );
    SubLObject logical_schemata = NIL;
    SubLObject physical_fields = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( meta_mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( meta_mt ), thread );
      logical_schemata = sksi_kb_accessors.physical_schema_logical_schemata( physical_schema );
      physical_fields = sksi_kb_accessors.physical_schema_fields( physical_schema );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject list_var = logical_schemata;
    SubLObject _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
    SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str7$Validating_the_logical_schemata__, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject logical_schema = NIL;
        logical_schema = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject ls_satisfies_all_requirementsP = sksi_logical_schema_validator( logical_schema, meta_mt, content_mt );
          if( NIL == ls_satisfies_all_requirementsP )
          {
            all_requirements_satisfiedP = ls_satisfies_all_requirementsP;
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          logical_schema = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
    }
    list_var = physical_fields;
    _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
    _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
    _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
    _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
    _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str8$Validating_the_physical_fields___, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject physical_field = NIL;
        physical_field = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject pf_satisfies_all_requirementsP = sksi_physical_field_validator( physical_field, meta_mt );
          if( NIL == pf_satisfies_all_requirementsP )
          {
            all_requirements_satisfiedP = pf_satisfies_all_requirementsP;
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          physical_field = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
    }
    return all_requirements_satisfiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 6708L)
  public static SubLObject sksi_physical_field_validator(final SubLObject physical_field, final SubLObject meta_mt)
  {
    return sksi_term_validator( physical_field, meta_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 6834L)
  public static SubLObject sksi_logical_schema_validator(final SubLObject logical_schema, final SubLObject meta_mt, SubLObject content_mt)
  {
    if( content_mt == UNPROVIDED )
    {
      content_mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str9$__Validating_the_logical_schema__, logical_schema );
    SubLObject all_requirements_satisfiedP = sksi_term_validator( logical_schema, meta_mt );
    final SubLObject validate_meaning_sentencesP = hlmt.hlmt_p( content_mt );
    SubLObject meaning_sentences = NIL;
    SubLObject logical_fields = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( meta_mt ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( meta_mt ), thread );
      if( NIL != validate_meaning_sentencesP )
      {
        meaning_sentences = sksi_meaning_sentence_utilities.logical_schema_meaning_sentences( logical_schema, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      logical_fields = sksi_kb_accessors.logical_schema_fields( logical_schema );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != validate_meaning_sentencesP )
    {
      final SubLObject list_var = meaning_sentences;
      final SubLObject _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( $str10$Validating_the_meaning_sentences_, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject csome_list_var = list_var;
          SubLObject meaning_sentence = NIL;
          meaning_sentence = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            final SubLObject meaning_sentence_pred_validP = sksi_meaning_sentence_pred_validP( cycl_utilities.formula_operator( meaning_sentence ), content_mt );
            final SubLObject meaning_sentence_wffP = sksi_meaning_sentence_wffP( meaning_sentence, content_mt, logical_schema );
            if( NIL == meaning_sentence_pred_validP || NIL == meaning_sentence_wffP )
            {
              all_requirements_satisfiedP = NIL;
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            meaning_sentence = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
      }
    }
    final SubLObject list_var = logical_fields;
    final SubLObject _prev_bind_3 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str11$Validating_the_logical_fields___, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = list_var;
        SubLObject logical_field = NIL;
        logical_field = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject ls_satisfies_all_requirementsP = sksi_logical_field_validator( logical_field, meta_mt );
          if( NIL == ls_satisfies_all_requirementsP )
          {
            all_requirements_satisfiedP = ls_satisfies_all_requirementsP;
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          logical_field = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_9, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_8, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_7, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_6, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_3, thread );
    }
    return all_requirements_satisfiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 8950L)
  public static SubLObject sksi_logical_field_validator_internal(final SubLObject logical_field, final SubLObject meta_mt)
  {
    return sksi_term_validator( logical_field, meta_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 8950L)
  public static SubLObject sksi_logical_field_validator(final SubLObject logical_field, final SubLObject meta_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_logical_field_validator_internal( logical_field, meta_mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym12$SKSI_LOGICAL_FIELD_VALIDATOR, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym12$SKSI_LOGICAL_FIELD_VALIDATOR, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym12$SKSI_LOGICAL_FIELD_VALIDATOR, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( logical_field, meta_mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( logical_field.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && meta_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_logical_field_validator_internal( logical_field, meta_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field, meta_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 9091L)
  public static SubLObject sksi_meaning_sentence_pred_validP(final SubLObject pred, final SubLObject content_mt)
  {
    final SubLObject validP = sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p( pred, content_mt );
    if( NIL == validP )
    {
      PrintLow.format( T, $str13$__The_predicate__A_is_not_a_valid, pred, content_mt );
    }
    return validP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 9435L)
  public static SubLObject sksi_meaning_sentence_wffP(final SubLObject meaning_sentence, final SubLObject content_mt, final SubLObject logical_schema)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 10051L)
  public static SubLObject sksi_term_validator(final SubLObject v_term, final SubLObject meta_mt)
  {
    final SubLObject term_requirements = sksi_term_salient_descriptor_formulas( v_term, $sksi_relevant_salient_descriptor_predicates$.getGlobalValue(), meta_mt );
    return sksi_verify_salient_descriptor_formulas( v_term, term_requirements, meta_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 10759L)
  public static SubLObject sksi_term_salient_descriptor_formulas(final SubLObject v_term, final SubLObject pred_list, final SubLObject meta_mt)
  {
    final SubLObject formula_var = $sym15$_FORMULA;
    SubLObject all_sd_formulas = NIL;
    SubLObject cdolist_list_var = pred_list;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject ask_formula = el_utilities.make_binary_formula( pred, v_term, formula_var );
      final SubLObject sd_formulas = ask_utilities.ask_variable( formula_var, ask_formula, meta_mt, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      all_sd_formulas = ConsesLow.append( sd_formulas, all_sd_formulas );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    all_sd_formulas = list_utilities.fast_delete_duplicates( all_sd_formulas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return all_sd_formulas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 11223L)
  public static SubLObject sksi_verify_salient_descriptor_formulas(final SubLObject v_term, final SubLObject requirements, final SubLObject meta_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str16$__Validating_the_requirements_for, v_term );
    SubLObject all_requirements_satisfiedP = T;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str4$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( requirements ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = requirements;
        SubLObject requirement = NIL;
        requirement = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          final SubLObject satisfiedP = sksi_verify_salient_descriptor_formula( requirement, meta_mt );
          if( NIL == satisfiedP )
          {
            PrintLow.format( T, $str17$__The_following_requirement_is_no, v_term, requirement );
            all_requirements_satisfiedP = satisfiedP;
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          requirement = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return all_requirements_satisfiedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/sksi-schema-validator.lisp", position = 11760L)
  public static SubLObject sksi_verify_salient_descriptor_formula(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject verification_result = inference_kernel.new_cyc_query( formula, mt, $list18 );
    return verification_result;
  }

  public static SubLObject declare_sksi_schema_validator_file()
  {
    SubLFiles.declareFunction( me, "sksi_structured_knowledge_source_validator", "SKSI-STRUCTURED-KNOWLEDGE-SOURCE-VALIDATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_structured_knowledge_source_validator_int", "SKSI-STRUCTURED-KNOWLEDGE-SOURCE-VALIDATOR-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_physical_schema_validator", "SKSI-PHYSICAL-SCHEMA-VALIDATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_physical_field_validator", "SKSI-PHYSICAL-FIELD-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_logical_schema_validator", "SKSI-LOGICAL-SCHEMA-VALIDATOR", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_logical_field_validator_internal", "SKSI-LOGICAL-FIELD-VALIDATOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_logical_field_validator", "SKSI-LOGICAL-FIELD-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_meaning_sentence_pred_validP", "SKSI-MEANING-SENTENCE-PRED-VALID?", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_meaning_sentence_wffP", "SKSI-MEANING-SENTENCE-WFF?", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_term_validator", "SKSI-TERM-VALIDATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_term_salient_descriptor_formulas", "SKSI-TERM-SALIENT-DESCRIPTOR-FORMULAS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_verify_salient_descriptor_formulas", "SKSI-VERIFY-SALIENT-DESCRIPTOR-FORMULAS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_verify_salient_descriptor_formula", "SKSI-VERIFY-SALIENT-DESCRIPTOR-FORMULA", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_schema_validator_file()
  {
    $sksi_relevant_salient_descriptor_predicates$ = SubLFiles.deflexical( "*SKSI-RELEVANT-SALIENT-DESCRIPTOR-PREDICATES*", $list0 );
    return NIL;
  }

  public static SubLObject setup_sksi_schema_validator_file()
  {
    memoization_state.note_memoized_function( $sym12$SKSI_LOGICAL_FIELD_VALIDATOR );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_schema_validator_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_schema_validator_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_schema_validator_file();
  }
  static
  {
    me = new sksi_schema_validator();
    $sksi_relevant_salient_descriptor_predicates$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keRequirement" ) ) );
    $str1$__Validating_the_knowledge_source = makeString( "~%Validating the knowledge source ~A ... ~%" );
    $const2$StructuredKnowledgeSource_Complex = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Complex" ) );
    $str3$Validating_the_physical_schemata_ = makeString( "Validating the physical schemata..." );
    $str4$cdolist = makeString( "cdolist" );
    $str5$Validating_the_sub_knowledge_sour = makeString( "Validating the sub knowledge sources..." );
    $str6$__Validating_the_physical_schema_ = makeString( "~%Validating the physical schema ~A ... ~%" );
    $str7$Validating_the_logical_schemata__ = makeString( "Validating the logical schemata..." );
    $str8$Validating_the_physical_fields___ = makeString( "Validating the physical fields..." );
    $str9$__Validating_the_logical_schema__ = makeString( "~%Validating the logical schema ~A ... ~%" );
    $str10$Validating_the_meaning_sentences_ = makeString( "Validating the meaning sentences..." );
    $str11$Validating_the_logical_fields___ = makeString( "Validating the logical fields..." );
    $sym12$SKSI_LOGICAL_FIELD_VALIDATOR = makeSymbol( "SKSI-LOGICAL-FIELD-VALIDATOR" );
    $str13$__The_predicate__A_is_not_a_valid = makeString( "~%The predicate ~A is not a valid meaning sentence predicate (probably because it is #$backchainRequired in the content mt ~A)." );
    $str14$__The_following_meaning_sentence_ = makeString( "~%The following meaning sentence for the logical schema ~A is not well-formed in the content mt ~A:~% ~a ~% ~s~%~%" );
    $sym15$_FORMULA = makeSymbol( "?FORMULA" );
    $str16$__Validating_the_requirements_for = makeString( "~%Validating the requirements for ~A ... ~%" );
    $str17$__The_following_requirement_is_no = makeString( "~%The following requirement is not satisfied for ~s:~%~s~%" );
    $list18 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
  }
}
/*
 * 
 * Total time: 313 ms
 * 
 */