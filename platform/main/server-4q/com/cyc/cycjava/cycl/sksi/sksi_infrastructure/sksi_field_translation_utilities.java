package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_incremental_edit;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_field_translation_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities";
  public static final String myFingerPrint = "0faa8c376b31e47693c38aa53a1f044df6d4e565b1160e0756bb7d64cc4246f5";
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym2$GAF_ARGS;
  private static final SubLSymbol $sym3$PHYSICAL_FIELD_INDEXICAL_P;
  private static final SubLSymbol $sym4$LOGICAL_FIELD_INDEXICAL_P;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF;
  private static final SubLObject $const7$logicalFieldDecoding;
  private static final SubLSymbol $kw8$GAF;
  private static final SubLSymbol $kw9$TRUE;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLObject $const12$logicalFieldEncoding;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$RELEVANT_FIELD_DECODINGS;
  private static final SubLSymbol $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL;
  private static final SubLObject $const17$fieldDecoding;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$GET_FIELD_DECODING_FROM_GAF;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$RELEVANT_FIELD_ENCODINGS;
  private static final SubLSymbol $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD;
  private static final SubLSymbol $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL;
  private static final SubLObject $const25$fieldEncoding;
  private static final SubLList $list26;
  private static final SubLInteger $int27$100;
  private static final SubLSymbol $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLObject $const31$physicalFieldDecoding;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLObject $const34$physicalFieldEncoding;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P;
  private static final SubLSymbol $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P;
  private static final SubLSymbol $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P;
  private static final SubLSymbol $kw39$SKSI_MISSING_DECODINGS;
  private static final SubLSymbol $kw40$SKSI_MISSING_ENCODINGS;
  private static final SubLString $str41$__SKSI__A_;
  private static final SubLString $str42$Decoding_loop___a_;
  private static final SubLSymbol $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL;
  private static final SubLString $str44$Encoding_loop___a_;
  private static final SubLSymbol $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL;
  private static final SubLSymbol $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED;
  private static final SubLSymbol $sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P;
  private static final SubLSymbol $kw48$ENCODE;
  private static final SubLSymbol $kw49$DECODE;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym52$RELEVANT_PRED_IS_EQ;
  private static final SubLObject $const53$meaningSentenceOfSchema;
  private static final SubLString $str54$No_meaning_sentence_for__S;
  private static final SubLSymbol $kw55$PRED;
  private static final SubLSymbol $kw56$NO_NAME;
  private static final SubLString $str57$failure_on_name_for__S;
  private static final SubLSymbol $kw58$NO_VALUE;
  private static final SubLString $str59$failure_on_value_for__S;
  private static final SubLString $str60$No_physical_field_for__S;
  private static final SubLSymbol $sym61$INDEXICAL_FOR_LOGICAL_FIELD;
  private static final SubLSymbol $sym62$_PRED;
  private static final SubLString $str63$More_than_one_meaning_sentence_pr;
  private static final SubLString $str64$Meaning_sentence_not_found_for__S;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1328L)
  public static SubLObject get_field_translation_from_gaf(final SubLObject field_translation_gaf)
  {
    return assertions_high.gaf_arg4( field_translation_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1532L)
  public static SubLObject destructure_field_translation_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject to_schema = NIL;
    SubLObject to_field = NIL;
    SubLObject from_schema = NIL;
    SubLObject field_translation = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    to_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    to_field = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    from_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    field_translation = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject field_translation_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      field_translation_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym1$CDESTRUCTURING_BIND, ConsesLow.list( to_schema, to_field, from_schema, field_translation ), ConsesLow.list( $sym2$GAF_ARGS, field_translation_gaf ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 1836L)
  public static SubLObject field_translation_fields(final SubLObject field_translation, final SubLObject test)
  {
    return cycl_utilities.expression_gather( field_translation, test, T, Symbols.symbol_function( EQ ), Symbols.symbol_function( IDENTITY ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2044L)
  public static SubLObject decoding_physical_field_indexicals(final SubLObject decoding)
  {
    return field_translation_fields( decoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2240L)
  public static SubLObject decoding_physical_field_indexicals_ordered(final SubLObject decoding)
  {
    final SubLObject reconstructed_decoding = sksi_reconstruct_decoding( decoding, UNPROVIDED );
    return list_utilities.tree_gather_ordered( reconstructed_decoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P, Symbols.symbol_function( IDENTITY ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2577L)
  public static SubLObject encoding_logical_fields(final SubLObject encoding)
  {
    return sksi_kb_accessors.logical_fields_for_indexicals( encoding_logical_field_indexicals( encoding ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2763L)
  public static SubLObject encoding_logical_field_indexicals(final SubLObject encoding)
  {
    return field_translation_fields( encoding, $sym4$LOGICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 2955L)
  public static SubLObject encoding_logical_fields_ordered(final SubLObject encoding)
  {
    final SubLObject reconstructed_encoding = sksi_reconstruct_encoding( encoding, UNPROVIDED );
    final SubLObject logical_field_indexicals = list_utilities.tree_gather_ordered( reconstructed_encoding, $sym4$LOGICAL_FIELD_INDEXICAL_P, Symbols.symbol_function( IDENTITY ), NIL );
    return sksi_kb_accessors.logical_fields_for_indexicals( logical_field_indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3355L)
  public static SubLObject get_logical_field_decoding_from_gaf(final SubLObject logical_field_decoding_gaf)
  {
    return get_field_translation_from_gaf( logical_field_decoding_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3603L)
  public static SubLObject destructure_logical_field_decoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject to_logical_schema = NIL;
    SubLObject logical_field = NIL;
    SubLObject from_logical_schema = NIL;
    SubLObject logical_field_decoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    to_logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    logical_field = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    from_logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    logical_field_decoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject logical_field_decoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
      logical_field_decoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( to_logical_schema, logical_field, from_logical_schema, logical_field_decoding ), logical_field_decoding_gaf, ConsesLow.append( body,
          NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 3984L)
  public static SubLObject logical_field_decoding_logical_field_indexicals(final SubLObject logical_field_decoding)
  {
    return field_translation_fields( logical_field_decoding, $sym4$LOGICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 4232L)
  public static SubLObject get_logical_field_decoding_gafs_for_logical_field(final SubLObject logical_field, SubLObject logical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field( logical_field );
    return get_logical_field_decoding_gafs_for_logical_field_indexical( logical_field_indexical, logical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 4749L)
  public static SubLObject get_logical_field_decoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject logical_field_decoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      final SubLObject pred_var = $const7$logicalFieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$1 = NIL;
                final SubLObject token_var_$2 = NIL;
                while ( NIL == done_var_$1)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                  final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                  if( NIL != valid_$3 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_logical_field_indexical.eql( logical_field_indexical ) && NIL != list_utilities.member_eqP( to_logical_schema, logical_schemata ) && NIL != list_utilities.member_eqP( from_logical_schema,
                          logical_schemata ) )
                      {
                        logical_field_decoding_gafs = ConsesLow.cons( assertion, logical_field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
                    }
                  }
                  done_var_$1 = makeBoolean( NIL == valid_$3 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const7$logicalFieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$2 = NIL;
                final SubLObject token_var_$3 = NIL;
                while ( NIL == done_var_$2)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                  final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( assertion ) );
                  if( NIL != valid_$4 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_logical_field_indexical.eql( logical_field_indexical ) )
                      {
                        logical_field_decoding_gafs = ConsesLow.cons( assertion, logical_field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
                    }
                  }
                  done_var_$2 = makeBoolean( NIL == valid_$4 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return logical_field_decoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 6091L)
  public static SubLObject get_logical_field_decodings_for_logical_field(final SubLObject logical_field, SubLObject logical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    final SubLObject logical_field_decoding_gafs = get_logical_field_decoding_gafs_for_logical_field( logical_field, logical_schemata );
    SubLObject logical_field_decodings = NIL;
    SubLObject cdolist_list_var = logical_field_decoding_gafs;
    SubLObject logical_field_decoding_gaf = NIL;
    logical_field_decoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      logical_field_decodings = ConsesLow.cons( get_logical_field_decoding_from_gaf( logical_field_decoding_gaf ), logical_field_decodings );
      cdolist_list_var = cdolist_list_var.rest();
      logical_field_decoding_gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( list_utilities.fast_delete_duplicates( logical_field_decodings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 6765L)
  public static SubLObject get_logical_field_encoding_from_gaf(final SubLObject logical_field_encoding_gaf)
  {
    return get_field_translation_from_gaf( logical_field_encoding_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7013L)
  public static SubLObject destructure_logical_field_encoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject to_logical_schema = NIL;
    SubLObject logical_field = NIL;
    SubLObject from_logical_schema = NIL;
    SubLObject logical_field_encoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    to_logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    logical_field = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    from_logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    logical_field_encoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject logical_field_encoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      logical_field_encoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( to_logical_schema, logical_field, from_logical_schema, logical_field_encoding ), logical_field_encoding_gaf, ConsesLow.append( body,
          NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7394L)
  public static SubLObject logical_field_encoding_logical_field_indexicals(final SubLObject logical_field_encoding)
  {
    return field_translation_fields( logical_field_encoding, $sym4$LOGICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7630L)
  public static SubLObject logical_field_encoding_contains_logical_field_indexicalP(final SubLObject logical_field_encoding, final SubLObject logical_field_indexical)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( logical_field_indexical, logical_field_encoding, T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 7842L)
  public static SubLObject get_logical_field_encoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject logical_field_encoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      final SubLObject pred_var = $const12$logicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$9 = NIL;
                final SubLObject token_var_$10 = NIL;
                while ( NIL == done_var_$9)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$10 );
                  final SubLObject valid_$11 = makeBoolean( !token_var_$10.eql( assertion ) );
                  if( NIL != valid_$11 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_logical_field_indexical.eql( logical_field_indexical ) && NIL != list_utilities.member_eqP( to_logical_schema, logical_schemata ) && NIL != list_utilities.member_eqP( from_logical_schema,
                          logical_schemata ) )
                      {
                        logical_field_encoding_gafs = ConsesLow.cons( assertion, logical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
                    }
                  }
                  done_var_$9 = makeBoolean( NIL == valid_$11 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$12, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const12$logicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$10 = NIL;
                final SubLObject token_var_$11 = NIL;
                while ( NIL == done_var_$10)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$11 );
                  final SubLObject valid_$12 = makeBoolean( !token_var_$11.eql( assertion ) );
                  if( NIL != valid_$12 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_logical_field_indexical.eql( logical_field_indexical ) )
                      {
                        logical_field_encoding_gafs = ConsesLow.cons( assertion, logical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
                    }
                  }
                  done_var_$10 = makeBoolean( NIL == valid_$12 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$13, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return logical_field_encoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 9185L)
  public static SubLObject get_logical_field_encoding_gafs_from_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject logical_field_encoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      final SubLObject pred_var = $const12$logicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$17 = NIL;
                final SubLObject token_var_$18 = NIL;
                while ( NIL == done_var_$17)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
                  final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion ) );
                  if( NIL != valid_$19 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( to_logical_schema, logical_schemata ) && NIL != list_utilities.member_eqP( from_logical_schema, logical_schemata )
                          && NIL != logical_field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                      {
                        logical_field_encoding_gafs = ConsesLow.cons( assertion, logical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
                    }
                  }
                  done_var_$17 = makeBoolean( NIL == valid_$19 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const12$logicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$18 = NIL;
                final SubLObject token_var_$19 = NIL;
                while ( NIL == done_var_$18)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$19 );
                  final SubLObject valid_$20 = makeBoolean( !token_var_$19.eql( assertion ) );
                  if( NIL != valid_$20 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject from_logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    from_logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != logical_field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                      {
                        logical_field_encoding_gafs = ConsesLow.cons( assertion, logical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
                    }
                  }
                  done_var_$18 = makeBoolean( NIL == valid_$20 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return logical_field_encoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 10649L)
  public static SubLObject get_field_decoding_from_gaf(final SubLObject field_decoding_gaf)
  {
    return sksi_reconstruct_decoding( get_field_translation_from_gaf( field_decoding_gaf ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 10893L)
  public static SubLObject destructure_field_decoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject logical_schema = NIL;
    SubLObject logical_field = NIL;
    SubLObject physical_schema = NIL;
    SubLObject field_decoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    logical_field = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
    field_decoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject field_decoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      field_decoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( logical_schema, logical_field, physical_schema, field_decoding ), field_decoding_gaf, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11208L)
  public static SubLObject field_decoding_physical_field_indexicals(final SubLObject field_decoding)
  {
    return field_translation_fields( field_decoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11425L)
  public static SubLObject field_decoding_contains_physical_field_indexicalP(final SubLObject decoding, final SubLObject physical_field)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( physical_field, decoding, T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11584L)
  public static SubLObject field_decoding_contains_physical_field_indexicalsP(final SubLObject decoding, final SubLObject physical_fields)
  {
    SubLObject missingP = NIL;
    if( NIL == missingP )
    {
      SubLObject csome_list_var = physical_fields;
      SubLObject physical_field = NIL;
      physical_field = csome_list_var.first();
      while ( NIL == missingP && NIL != csome_list_var)
      {
        if( NIL == field_decoding_contains_physical_field_indexicalP( decoding, physical_field ) )
        {
          missingP = T;
        }
        csome_list_var = csome_list_var.rest();
        physical_field = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == missingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11894L)
  public static SubLObject relevant_field_decodings_internal(final SubLObject logical_field, final SubLObject logical_schema, final SubLObject physical_schema)
  {
    final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field( logical_field );
    return relevant_field_decodings_for_indexical( logical_field_indexical, ConsesLow.list( logical_schema ), ConsesLow.list( physical_schema ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 11894L)
  public static SubLObject relevant_field_decodings(final SubLObject logical_field, final SubLObject logical_schema, final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return relevant_field_decodings_internal( logical_field, logical_schema, physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym15$RELEVANT_FIELD_DECODINGS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym15$RELEVANT_FIELD_DECODINGS, THREE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym15$RELEVANT_FIELD_DECODINGS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( logical_field, logical_schema, physical_schema );
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
        if( logical_field.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schema.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && physical_schema.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( relevant_field_decodings_internal( logical_field, logical_schema, physical_schema ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field, logical_schema, physical_schema ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12215L)
  public static SubLObject relevant_field_decodings_for_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    return get_field_decodings_for_logical_field_indexical( logical_field_indexical, logical_schemata, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12215L)
  public static SubLObject relevant_field_decodings_for_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return relevant_field_decodings_for_indexical_internal( logical_field_indexical, logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( logical_field_indexical, logical_schemata, physical_schemata );
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
        if( logical_field_indexical.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && physical_schemata.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( relevant_field_decodings_for_indexical_internal( logical_field_indexical, logical_schemata, physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field_indexical, logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 12488L)
  public static SubLObject get_field_decoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    SubLObject field_decoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      if( NIL != physical_schemata )
      {
        final SubLObject pred_var = $const17$fieldDecoding;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_field_indexical, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_field_indexical, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$25 = NIL;
                final SubLObject token_var_$26 = NIL;
                while ( NIL == done_var_$25)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
                  final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( assertion ) );
                  if( NIL != valid_$27 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) && NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) )
                      {
                        field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                    }
                  }
                  done_var_$25 = makeBoolean( NIL == valid_$27 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = $const17$fieldDecoding;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_field_indexical, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_field_indexical, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$26 = NIL;
                final SubLObject token_var_$27 = NIL;
                while ( NIL == done_var_$26)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$27 );
                  final SubLObject valid_$28 = makeBoolean( !token_var_$27.eql( assertion ) );
                  if( NIL != valid_$28 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject logical_schema = NIL;
                    SubLObject to_logical_field_indexical = NIL;
                    SubLObject physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    to_logical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) )
                      {
                        field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                    }
                  }
                  done_var_$26 = makeBoolean( NIL == valid_$28 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const17$fieldDecoding;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_field_indexical, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_field_indexical, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$27 = NIL;
              final SubLObject token_var_$28 = NIL;
              while ( NIL == done_var_$27)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$28 );
                final SubLObject valid_$29 = makeBoolean( !token_var_$28.eql( assertion ) );
                if( NIL != valid_$29 )
                {
                  SubLObject current;
                  final SubLObject datum = current = assertions_high.gaf_args( assertion );
                  SubLObject logical_schema = NIL;
                  SubLObject to_logical_field_indexical = NIL;
                  SubLObject physical_schema = NIL;
                  SubLObject decoding = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                  logical_schema = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                  to_logical_field_indexical = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                  physical_schema = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
                  decoding = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) )
                    {
                      field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
                  }
                }
                done_var_$27 = makeBoolean( NIL == valid_$29 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const17$fieldDecoding;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( logical_field_indexical, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( logical_field_indexical, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$28 = NIL;
              final SubLObject token_var_$29 = NIL;
              while ( NIL == done_var_$28)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$29 );
                final SubLObject valid_$30 = makeBoolean( !token_var_$29.eql( assertion ) );
                if( NIL != valid_$30 )
                {
                  field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                }
                done_var_$28 = makeBoolean( NIL == valid_$30 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_4 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values4 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_4 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    return field_decoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 14463L)
  public static SubLObject get_field_decodings_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi( logical_field_indexical );
    final SubLObject field_decoding_gafs = get_field_decoding_gafs_for_logical_field_indexical( logical_field_indexical_fort, logical_schemata, physical_schemata );
    return list_utilities.fast_delete_duplicates( Mapping.mapcar( $sym19$GET_FIELD_DECODING_FROM_GAF, field_decoding_gafs ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 15125L)
  public static SubLObject get_field_decoding_gafs_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject field_decoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      if( NIL != physical_schemata )
      {
        final SubLObject pred_var = $const17$fieldDecoding;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$37 = NIL;
                  final SubLObject token_var_$38 = NIL;
                  while ( NIL == done_var_$37)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$38 );
                    final SubLObject valid_$39 = makeBoolean( !token_var_$38.eql( assertion ) );
                    if( NIL != valid_$39 )
                    {
                      SubLObject current;
                      final SubLObject datum = current = assertions_high.gaf_args( assertion );
                      SubLObject logical_schema = NIL;
                      SubLObject logical_field = NIL;
                      SubLObject physical_schema = NIL;
                      SubLObject decoding = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      logical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      logical_field = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      physical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      decoding = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) && NIL != list_utilities.member_eqP( physical_schema, physical_schemata )
                            && NIL != field_decoding_contains_physical_field_indexicalP( decoding, physical_field_indexical ) )
                        {
                          field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
                      }
                    }
                    done_var_$37 = makeBoolean( NIL == valid_$39 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        final SubLObject pred_var = $const17$fieldDecoding;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$38 = NIL;
                  final SubLObject token_var_$39 = NIL;
                  while ( NIL == done_var_$38)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$39 );
                    final SubLObject valid_$40 = makeBoolean( !token_var_$39.eql( assertion ) );
                    if( NIL != valid_$40 )
                    {
                      SubLObject current;
                      final SubLObject datum = current = assertions_high.gaf_args( assertion );
                      SubLObject logical_schema = NIL;
                      SubLObject logical_field = NIL;
                      SubLObject physical_schema = NIL;
                      SubLObject decoding = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      logical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      logical_field = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      physical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                      decoding = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) && NIL != field_decoding_contains_physical_field_indexicalP( decoding, physical_field_indexical ) )
                        {
                          field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
                      }
                    }
                    done_var_$38 = makeBoolean( NIL == valid_$40 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    else if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const17$fieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$39 = NIL;
                final SubLObject token_var_$40 = NIL;
                while ( NIL == done_var_$39)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$40 );
                  final SubLObject valid_$41 = makeBoolean( !token_var_$40.eql( assertion ) );
                  if( NIL != valid_$41 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject logical_schema = NIL;
                    SubLObject logical_field = NIL;
                    SubLObject physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    logical_field = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) && NIL != field_decoding_contains_physical_field_indexicalP( decoding, physical_field_indexical ) )
                      {
                        field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
                    }
                  }
                  done_var_$39 = makeBoolean( NIL == valid_$41 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const17$fieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$40 = NIL;
                final SubLObject token_var_$41 = NIL;
                while ( NIL == done_var_$40)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$41 );
                  final SubLObject valid_$42 = makeBoolean( !token_var_$41.eql( assertion ) );
                  if( NIL != valid_$42 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject logical_schema = NIL;
                    SubLObject logical_field = NIL;
                    SubLObject physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    logical_field = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != field_decoding_contains_physical_field_indexicalP( decoding, physical_field_indexical ) )
                      {
                        field_decoding_gafs = ConsesLow.cons( assertion, field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
                    }
                  }
                  done_var_$40 = makeBoolean( NIL == valid_$42 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return field_decoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 17428L)
  public static SubLObject get_field_decodings_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject field_decoding_gafs = get_field_decoding_gafs_from_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata );
    return list_utilities.fast_delete_duplicates( Mapping.mapcar( $sym19$GET_FIELD_DECODING_FROM_GAF, field_decoding_gafs ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18018L)
  public static SubLObject get_field_encoding_from_gaf(final SubLObject field_encoding_gaf)
  {
    return sksi_reconstruct_encoding( get_field_translation_from_gaf( field_encoding_gaf ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18260L)
  public static SubLObject destructure_field_encoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject physical_schema = NIL;
    SubLObject physical_field_indexical = NIL;
    SubLObject logical_schema = NIL;
    SubLObject field_encoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    physical_field_indexical = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    logical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
    field_encoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject field_encoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      field_encoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( physical_schema, physical_field_indexical, logical_schema, field_encoding ), field_encoding_gaf, ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18595L)
  public static SubLObject field_encoding_logical_field_indexicals(final SubLObject field_encoding)
  {
    return field_translation_fields( field_encoding, $sym4$LOGICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 18808L)
  public static SubLObject isomorphic_field_encoding_p(final SubLObject field_encoding)
  {
    return makeBoolean( NIL != sksi_kb_accessors.schema_object_id_fn_expression_p( field_encoding ) || NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p( field_encoding ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19231L)
  public static SubLObject field_encoding_contains_logical_field_indexicalP(final SubLObject encoding, final SubLObject logical_field_indexical)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( logical_field_indexical, encoding, T, Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19469L)
  public static SubLObject relevant_field_encodings_internal(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    return get_field_encodings_for_physical_field( physical_field, ConsesLow.list( logical_schema ), ConsesLow.list( physical_schema ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19469L)
  public static SubLObject relevant_field_encodings(final SubLObject physical_field, final SubLObject physical_schema, final SubLObject logical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return relevant_field_encodings_internal( physical_field, physical_schema, logical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym22$RELEVANT_FIELD_ENCODINGS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym22$RELEVANT_FIELD_ENCODINGS, THREE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym22$RELEVANT_FIELD_ENCODINGS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( physical_field, physical_schema, logical_schema );
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
        if( physical_field.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( physical_schema.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && logical_schema.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( relevant_field_encodings_internal( physical_field, physical_schema, logical_schema ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( physical_field, physical_schema, logical_schema ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 19678L)
  public static SubLObject get_field_encoding_gafs_for_physical_field(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_field_encoding_gafs_for_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20336L)
  public static SubLObject get_field_encodings_for_physical_field_internal(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_field_encodings_for_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20336L)
  public static SubLObject get_field_encodings_for_physical_field(final SubLObject physical_field, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_field_encodings_for_physical_field_internal( physical_field, logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( physical_field, logical_schemata, physical_schemata );
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
        if( physical_field.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && physical_schemata.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_field_encodings_for_physical_field_internal( physical_field, logical_schemata, physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( physical_field, logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20833L)
  public static SubLObject get_field_encoding_gafs_for_physical_field_indexical_internal(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    SubLObject field_encoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      if( NIL != physical_schemata )
      {
        final SubLObject pred_var = $const25$fieldEncoding;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( physical_field_indexical, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( physical_field_indexical, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$53 = NIL;
                final SubLObject token_var_$54 = NIL;
                while ( NIL == done_var_$53)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$54 );
                  final SubLObject valid_$55 = makeBoolean( !token_var_$54.eql( assertion ) );
                  if( NIL != valid_$55 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) && NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) )
                      {
                        field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
                    }
                  }
                  done_var_$53 = makeBoolean( NIL == valid_$55 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = $const25$fieldEncoding;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( physical_field_indexical, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( physical_field_indexical, TWO_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$54 = NIL;
                final SubLObject token_var_$55 = NIL;
                while ( NIL == done_var_$54)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$55 );
                  final SubLObject valid_$56 = makeBoolean( !token_var_$55.eql( assertion ) );
                  if( NIL != valid_$56 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) )
                      {
                        field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
                    }
                  }
                  done_var_$54 = makeBoolean( NIL == valid_$56 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    else if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const25$fieldEncoding;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( physical_field_indexical, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( physical_field_indexical, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$55 = NIL;
              final SubLObject token_var_$56 = NIL;
              while ( NIL == done_var_$55)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$56 );
                final SubLObject valid_$57 = makeBoolean( !token_var_$56.eql( assertion ) );
                if( NIL != valid_$57 )
                {
                  SubLObject current;
                  final SubLObject datum = current = assertions_high.gaf_args( assertion );
                  SubLObject physical_schema = NIL;
                  SubLObject to_physical_field_indexical = NIL;
                  SubLObject logical_schema = NIL;
                  SubLObject encoding = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                  physical_schema = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                  to_physical_field_indexical = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                  logical_schema = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list26 );
                  encoding = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) )
                    {
                      field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list26 );
                  }
                }
                done_var_$55 = makeBoolean( NIL == valid_$57 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_3 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_3 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const25$fieldEncoding;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( physical_field_indexical, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( physical_field_indexical, TWO_INTEGER, pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
              SubLObject done_var_$56 = NIL;
              final SubLObject token_var_$57 = NIL;
              while ( NIL == done_var_$56)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$57 );
                final SubLObject valid_$58 = makeBoolean( !token_var_$57.eql( assertion ) );
                if( NIL != valid_$58 )
                {
                  field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                }
                done_var_$56 = makeBoolean( NIL == valid_$58 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_4 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values4 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_4 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    return field_encoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 20833L)
  public static SubLObject get_field_encoding_gafs_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_field_encoding_gafs_for_physical_field_indexical_internal( physical_field_indexical, logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, THREE_INTEGER, $int27$100,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( physical_field_indexical, logical_schemata, physical_schemata );
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
        if( physical_field_indexical.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && physical_schemata.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_field_encoding_gafs_for_physical_field_indexical_internal( physical_field_indexical, logical_schemata,
        physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( physical_field_indexical, logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 22873L)
  public static SubLObject get_field_encodings_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical_fort = sksi_kb_accessors.pfi_fort_for_pfi( physical_field_indexical );
    final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_physical_field_indexical( physical_field_indexical_fort, logical_schemata, physical_schemata );
    SubLObject field_encodings = NIL;
    SubLObject cdolist_list_var = field_encoding_gafs;
    SubLObject field_encoding_gaf = NIL;
    field_encoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      field_encodings = ConsesLow.cons( get_field_encoding_from_gaf( field_encoding_gaf ), field_encodings );
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding_gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( list_utilities.fast_delete_duplicates( field_encodings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 23746L)
  public static SubLObject get_field_encoding_gafs_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject field_encoding_gafs = NIL;
    if( NIL != logical_schemata )
    {
      if( NIL != physical_schemata )
      {
        final SubLObject pred_var = $const25$fieldEncoding;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$65 = NIL;
                  final SubLObject token_var_$66 = NIL;
                  while ( NIL == done_var_$65)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$66 );
                    final SubLObject valid_$67 = makeBoolean( !token_var_$66.eql( assertion ) );
                    if( NIL != valid_$67 )
                    {
                      SubLObject current;
                      final SubLObject datum = current = assertions_high.gaf_args( assertion );
                      SubLObject physical_schema = NIL;
                      SubLObject physical_field_indexical = NIL;
                      SubLObject logical_schema = NIL;
                      SubLObject encoding = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      physical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      physical_field_indexical = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      logical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      encoding = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) && NIL != list_utilities.member_eqP( logical_schema, logical_schemata )
                            && NIL != field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                        {
                          field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
                      }
                    }
                    done_var_$65 = makeBoolean( NIL == valid_$67 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$68, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        final SubLObject pred_var = $const25$fieldEncoding;
        if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
        {
          final SubLObject str = NIL;
          final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
          final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
          try
          {
            utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
            utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
            utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
            utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
            utilities_macros.$is_noting_progressP$.bind( T, thread );
            utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
            utilities_macros.noting_progress_preamble( str );
            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
              if( NIL != valid )
              {
                utilities_macros.note_progress();
                SubLObject final_index_iterator = NIL;
                try
                {
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                  SubLObject done_var_$66 = NIL;
                  final SubLObject token_var_$67 = NIL;
                  while ( NIL == done_var_$66)
                  {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$67 );
                    final SubLObject valid_$68 = makeBoolean( !token_var_$67.eql( assertion ) );
                    if( NIL != valid_$68 )
                    {
                      SubLObject current;
                      final SubLObject datum = current = assertions_high.gaf_args( assertion );
                      SubLObject physical_schema = NIL;
                      SubLObject physical_field_indexical = NIL;
                      SubLObject logical_schema = NIL;
                      SubLObject encoding = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      physical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      physical_field_indexical = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      logical_schema = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                      encoding = current.first();
                      current = current.rest();
                      if( NIL == current )
                      {
                        if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) && NIL != field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                        {
                          field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                        }
                      }
                      else
                      {
                        cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
                      }
                    }
                    done_var_$66 = makeBoolean( NIL == valid_$68 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$69, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid );
            }
            utilities_macros.noting_progress_postamble();
          }
          finally
          {
            utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
            utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
            utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
            utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
            utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
            utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
            utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    else if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const25$fieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$67 = NIL;
                final SubLObject token_var_$68 = NIL;
                while ( NIL == done_var_$67)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$68 );
                  final SubLObject valid_$69 = makeBoolean( !token_var_$68.eql( assertion ) );
                  if( NIL != valid_$69 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject physical_schema = NIL;
                    SubLObject physical_field_indexical = NIL;
                    SubLObject logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( physical_schema, physical_schemata ) && NIL != field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                      {
                        field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
                    }
                  }
                  done_var_$67 = makeBoolean( NIL == valid_$69 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const25$fieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$68 = NIL;
                final SubLObject token_var_$69 = NIL;
                while ( NIL == done_var_$68)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$69 );
                  final SubLObject valid_$70 = makeBoolean( !token_var_$69.eql( assertion ) );
                  if( NIL != valid_$70 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject physical_schema = NIL;
                    SubLObject physical_field_indexical = NIL;
                    SubLObject logical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    logical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != field_encoding_contains_logical_field_indexicalP( encoding, logical_field_indexical ) )
                      {
                        field_encoding_gafs = ConsesLow.cons( assertion, field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
                    }
                  }
                  done_var_$68 = makeBoolean( NIL == valid_$70 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return field_encoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 23746L)
  public static SubLObject get_field_encoding_gafs_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_field_encoding_gafs_for_logical_field_indexical_internal( logical_field_indexical, logical_schemata, physical_schemata, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, FOUR_INTEGER, $int27$100, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( logical_field_indexical, logical_schemata, physical_schemata, mt_info );
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
        if( logical_field_indexical.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( physical_schemata.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_field_encoding_gafs_for_logical_field_indexical_internal( logical_field_indexical, logical_schemata,
        physical_schemata, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field_indexical, logical_schemata, physical_schemata, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26199L)
  public static SubLObject get_physical_field_decoding_from_gaf(final SubLObject physical_field_decoding_gaf)
  {
    return get_field_translation_from_gaf( physical_field_decoding_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26451L)
  public static SubLObject destructure_physical_field_decoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject to_physical_schema = NIL;
    SubLObject physical_field_indexical = NIL;
    SubLObject from_physical_schema = NIL;
    SubLObject physical_field_decoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    to_physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    physical_field_indexical = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    from_physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    physical_field_decoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject physical_field_decoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
      physical_field_decoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( to_physical_schema, physical_field_indexical, from_physical_schema, physical_field_decoding ), physical_field_decoding_gaf, ConsesLow
          .append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 26875L)
  public static SubLObject physical_field_decoding_physical_field_indexicals(final SubLObject physical_field_decoding)
  {
    return field_translation_fields( physical_field_decoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 27128L)
  public static SubLObject get_physical_field_decoding_gafs_for_physical_field(final SubLObject physical_field, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_physical_field_decoding_gafs_for_physical_field_indexical( physical_field_indexical, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 27662L)
  public static SubLObject get_physical_field_decodings_for_physical_field(final SubLObject physical_field, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_physical_field_decodings_for_physical_field_indexical( physical_field_indexical, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 28145L)
  public static SubLObject get_physical_field_decoding_gafs_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject physical_field_decoding_gafs = NIL;
    if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const31$physicalFieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$81 = NIL;
                final SubLObject token_var_$82 = NIL;
                while ( NIL == done_var_$81)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$82 );
                  final SubLObject valid_$83 = makeBoolean( !token_var_$82.eql( assertion ) );
                  if( NIL != valid_$83 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject from_physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    to_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    from_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_physical_field_indexical.eql( physical_field_indexical ) && NIL != list_utilities.member_eqP( to_physical_schema, physical_schemata ) && NIL != list_utilities.member_eqP(
                          from_physical_schema, physical_schemata ) )
                      {
                        physical_field_decoding_gafs = ConsesLow.cons( assertion, physical_field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
                    }
                  }
                  done_var_$81 = makeBoolean( NIL == valid_$83 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$84 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$84, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const31$physicalFieldDecoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$82 = NIL;
                final SubLObject token_var_$83 = NIL;
                while ( NIL == done_var_$82)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$83 );
                  final SubLObject valid_$84 = makeBoolean( !token_var_$83.eql( assertion ) );
                  if( NIL != valid_$84 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject from_physical_schema = NIL;
                    SubLObject decoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    to_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    from_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
                    decoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( to_physical_field_indexical.eql( physical_field_indexical ) )
                      {
                        physical_field_decoding_gafs = ConsesLow.cons( assertion, physical_field_decoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
                    }
                  }
                  done_var_$82 = makeBoolean( NIL == valid_$84 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$85, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return physical_field_decoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 29557L)
  public static SubLObject get_physical_field_decodings_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_decoding_gafs = get_physical_field_decoding_gafs_for_physical_field_indexical( physical_field_indexical, physical_schemata );
    SubLObject physical_field_decodings = NIL;
    SubLObject cdolist_list_var = physical_field_decoding_gafs;
    SubLObject physical_field_decoding_gaf = NIL;
    physical_field_decoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      physical_field_decodings = ConsesLow.cons( get_physical_field_decoding_from_gaf( physical_field_decoding_gaf ), physical_field_decodings );
      cdolist_list_var = cdolist_list_var.rest();
      physical_field_decoding_gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( list_utilities.fast_delete_duplicates( physical_field_decodings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 30331L)
  public static SubLObject get_physical_field_encoding_from_gaf(final SubLObject physical_field_encoding_gaf)
  {
    return get_field_translation_from_gaf( physical_field_encoding_gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 30583L)
  public static SubLObject destructure_physical_field_encoding_gaf(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject to_physical_schema = NIL;
    SubLObject physical_field_indexical = NIL;
    SubLObject from_physical_schema = NIL;
    SubLObject physical_field_encoding = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    to_physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    physical_field_indexical = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    from_physical_schema = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
    physical_field_encoding = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject physical_field_encoding_gaf = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list33 );
      physical_field_encoding_gaf = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF, ConsesLow.list( to_physical_schema, physical_field_indexical, from_physical_schema, physical_field_encoding ), physical_field_encoding_gaf, ConsesLow
          .append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list33 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31007L)
  public static SubLObject physical_field_encoding_physical_field_indexicals(final SubLObject physical_field_encoding)
  {
    return field_translation_fields( physical_field_encoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31260L)
  public static SubLObject physical_field_encoding_contains_physical_field_indexicalP(final SubLObject physical_field_encoding, final SubLObject physical_field_indexical)
  {
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( physical_field_indexical, physical_field_encoding, T, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 31478L)
  public static SubLObject get_physical_field_encoding_gafs_from_physical_field(final SubLObject physical_field, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_physical_field_encoding_gafs_from_physical_field_indexical( physical_field_indexical, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 32015L)
  public static SubLObject get_physical_field_encodings_from_physical_field(final SubLObject physical_field, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
    return get_physical_field_encodings_from_physical_field_indexical( physical_field_indexical, physical_schemata );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 32501L)
  public static SubLObject get_physical_field_encoding_gafs_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject physical_field_encoding_gafs = NIL;
    if( NIL != physical_schemata )
    {
      final SubLObject pred_var = $const34$physicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$89 = NIL;
                final SubLObject token_var_$90 = NIL;
                while ( NIL == done_var_$89)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$90 );
                  final SubLObject valid_$91 = makeBoolean( !token_var_$90.eql( assertion ) );
                  if( NIL != valid_$91 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject from_physical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    to_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    from_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != list_utilities.member_eqP( to_physical_schema, physical_schemata ) && NIL != list_utilities.member_eqP( from_physical_schema, physical_schemata )
                          && NIL != physical_field_encoding_contains_physical_field_indexicalP( encoding, physical_field_indexical ) )
                      {
                        physical_field_encoding_gafs = ConsesLow.cons( assertion, physical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
                    }
                  }
                  done_var_$89 = makeBoolean( NIL == valid_$91 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    else
    {
      final SubLObject pred_var = $const34$physicalFieldEncoding;
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw8$GAF, $kw9$TRUE, NIL );
                SubLObject done_var_$90 = NIL;
                final SubLObject token_var_$91 = NIL;
                while ( NIL == done_var_$90)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$91 );
                  final SubLObject valid_$92 = makeBoolean( !token_var_$91.eql( assertion ) );
                  if( NIL != valid_$92 )
                  {
                    SubLObject current;
                    final SubLObject datum = current = assertions_high.gaf_args( assertion );
                    SubLObject to_physical_schema = NIL;
                    SubLObject to_physical_field_indexical = NIL;
                    SubLObject from_physical_schema = NIL;
                    SubLObject encoding = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    to_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    to_physical_field_indexical = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    from_physical_schema = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    encoding = current.first();
                    current = current.rest();
                    if( NIL == current )
                    {
                      if( NIL != physical_field_encoding_contains_physical_field_indexicalP( encoding, physical_field_indexical ) )
                      {
                        physical_field_encoding_gafs = ConsesLow.cons( assertion, physical_field_encoding_gafs );
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
                    }
                  }
                  done_var_$90 = makeBoolean( NIL == valid_$92 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$93, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return physical_field_encoding_gafs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 34028L)
  public static SubLObject get_physical_field_encodings_from_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject physical_schemata)
  {
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical( physical_field_indexical, physical_schemata );
    SubLObject physical_field_encodings = NIL;
    SubLObject cdolist_list_var = physical_field_encoding_gafs;
    SubLObject physical_field_encoding_gaf = NIL;
    physical_field_encoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      physical_field_encodings = ConsesLow.cons( get_physical_field_encoding_from_gaf( physical_field_encoding_gaf ), physical_field_encodings );
      cdolist_list_var = cdolist_list_var.rest();
      physical_field_encoding_gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( list_utilities.fast_delete_duplicates( physical_field_encodings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 34808L)
  public static SubLObject sksi_reconstruct_encoding(final SubLObject encoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( encoding, $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35174L)
  public static SubLObject sksi_reconstruct_decoding(final SubLObject decoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( decoding, $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35454L)
  public static SubLObject sksi_reconstruct_logical_field_encoding(final SubLObject logical_field_encoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( logical_field_encoding, $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 35778L)
  public static SubLObject sksi_reconstruct_field_encoding(final SubLObject encoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( encoding, $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36052L)
  public static SubLObject sksi_reconstruct_physical_field_encoding(final SubLObject physical_field_encoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( physical_field_encoding, $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36373L)
  public static SubLObject sksi_reconstruct_logical_field_decoding(final SubLObject logical_field_decoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( logical_field_decoding, $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36697L)
  public static SubLObject sksi_reconstruct_field_decoding(final SubLObject decoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( decoding, $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 36983L)
  public static SubLObject sksi_reconstruct_physical_field_decoding(final SubLObject physical_field_decoding, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return sksi_reconstruct_translation( physical_field_decoding, $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 37323L)
  public static SubLObject sksi_reconstruct_translation(final SubLObject translation, final SubLObject test, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_kb_accessors.schema_object_fn_expression_p( translation ) )
    {
      thread.resetMultipleValues();
      final SubLObject schema_object_fn = el_utilities.unmake_binary_formula( translation );
      final SubLObject source = thread.secondMultipleValue();
      final SubLObject descriptor = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject translated_descriptor = sksi_infrastructure_utilities.sksi_reconstruct_expression( descriptor, test, memoizeP );
      return el_utilities.make_binary_formula( schema_object_fn, source, translated_descriptor );
    }
    return sksi_infrastructure_utilities.sksi_reconstruct_expression( translation, test, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 37934L)
  public static SubLObject generate_decoding_compositions_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi( logical_field_indexical );
    SubLObject translations = NIL;
    SubLObject result = NIL;
    SubLObject error_message = NIL;
    SubLObject result_$97 = NIL;
    try
    {
      thread.throwStack.push( $kw39$SKSI_MISSING_DECODINGS );
      SubLObject result_$98 = NIL;
      try
      {
        thread.throwStack.push( $kw40$SKSI_MISSING_ENCODINGS );
        translations = list_utilities.fast_delete_duplicates( generate_decoding_compositions_for_logical_field_indexical_recursive( logical_field_indexical_fort, logical_schemata, physical_schemata, NIL ), UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      catch( final Throwable ccatch_env_var )
      {
        result_$98 = Errors.handleThrowable( ccatch_env_var, $kw40$SKSI_MISSING_ENCODINGS );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != result_$98 )
      {
        error_message = sksi_debugging.sksi_violation_message( $kw40$SKSI_MISSING_ENCODINGS, result_$98 );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      result_$97 = Errors.handleThrowable( ccatch_env_var2, $kw39$SKSI_MISSING_DECODINGS );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != result_$97 )
    {
      error_message = sksi_debugging.sksi_violation_message( $kw39$SKSI_MISSING_DECODINGS, result_$97 );
    }
    if( NIL != error_message && NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( THREE_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str41$__SKSI__A_, error_message ), THREE_INTEGER );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    if( NIL != sksi_kb_accessors.lfi_alias_fn_naut_p( logical_field_indexical ) )
    {
      SubLObject cdolist_list_var = translations;
      SubLObject translation = NIL;
      translation = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject translation_pfis = cycl_utilities.expression_gather( translation, $sym3$PHYSICAL_FIELD_INDEXICAL_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject translation_copy = el_utilities.copy_expression( translation );
        SubLObject cdolist_list_var_$99 = translation_pfis;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var_$99.first();
        while ( NIL != cdolist_list_var_$99)
        {
          translation_copy = cycl_utilities.expression_nsubst( sksi_kb_accessors.pfi_for_lfi( pfi, logical_field_indexical ), pfi, translation_copy, UNPROVIDED, UNPROVIDED );
          cdolist_list_var_$99 = cdolist_list_var_$99.rest();
          pfi = cdolist_list_var_$99.first();
        }
        result = ConsesLow.cons( translation_copy, result );
        cdolist_list_var = cdolist_list_var.rest();
        translation = cdolist_list_var.first();
      }
      result = Sequences.nreverse( result );
    }
    else
    {
      result = translations;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 39270L)
  public static SubLObject generate_decoding_compositions_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject used_gafs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject logical_field_decoding_gafs = get_logical_field_decoding_gafs_for_logical_field_indexical( logical_field_indexical, logical_schemata );
    final SubLObject field_decoding_gafs = get_field_decoding_gafs_for_logical_field_indexical( logical_field_indexical, logical_schemata, physical_schemata );
    SubLObject translations = NIL;
    SubLObject cdolist_list_var = logical_field_decoding_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str42$Decoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject logical_field_decoding = get_logical_field_decoding_from_gaf( gaf );
        final SubLObject decoding_logical_field_indexicals = logical_field_decoding_logical_field_indexicals( logical_field_decoding );
        final SubLObject decoding_list = sksi_reconstruct_logical_field_decoding( logical_field_decoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        try
        {
          thread.throwStack.push( $kw39$SKSI_MISSING_DECODINGS );
          SubLObject result_$100 = NIL;
          try
          {
            thread.throwStack.push( $kw40$SKSI_MISSING_ENCODINGS );
            SubLObject cdolist_list_var_$101 = decoding_logical_field_indexicals;
            SubLObject decoding_logical_field_indexical = NIL;
            decoding_logical_field_indexical = cdolist_list_var_$101.first();
            while ( NIL != cdolist_list_var_$101)
            {
              final SubLObject sub_translations = generate_decoding_compositions_for_logical_field_indexical_recursive( decoding_logical_field_indexical, logical_schemata, physical_schemata, new_used_gafs );
              if( NIL != sub_translations )
              {
                multi_alist = ConsesLow.cons( ConsesLow.cons( decoding_logical_field_indexical, sub_translations ), multi_alist );
              }
              cdolist_list_var_$101 = cdolist_list_var_$101.rest();
              decoding_logical_field_indexical = cdolist_list_var_$101.first();
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            result_$100 = Errors.handleThrowable( ccatch_env_var, $kw40$SKSI_MISSING_ENCODINGS );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != result_$100 )
          {
            error_message = sksi_debugging.sksi_violation_message( $kw40$SKSI_MISSING_ENCODINGS, result_$100 );
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          result = Errors.handleThrowable( ccatch_env_var2, $kw39$SKSI_MISSING_DECODINGS );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != result )
        {
          error_message = sksi_debugging.sksi_violation_message( $kw39$SKSI_MISSING_DECODINGS, result );
        }
        if( NIL == error_message )
        {
          translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, decoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    cdolist_list_var = field_decoding_gafs;
    gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str42$Decoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject field_decoding = get_field_decoding_from_gaf( gaf );
        final SubLObject decoding_physical_field_indexicals = field_decoding_physical_field_indexicals( field_decoding );
        final SubLObject decoding_list = sksi_reconstruct_field_decoding( field_decoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject cdolist_list_var_$102 = decoding_physical_field_indexicals;
        SubLObject decoding_physical_field_indexical = NIL;
        decoding_physical_field_indexical = cdolist_list_var_$102.first();
        while ( NIL != cdolist_list_var_$102)
        {
          final SubLObject sub_translations2 = generate_decoding_compositions_for_physical_field_indexical_recursive( decoding_physical_field_indexical, physical_schemata, new_used_gafs );
          if( NIL != sub_translations2 )
          {
            multi_alist = ConsesLow.cons( ConsesLow.cons( decoding_physical_field_indexical, sub_translations2 ), multi_alist );
          }
          cdolist_list_var_$102 = cdolist_list_var_$102.rest();
          decoding_physical_field_indexical = cdolist_list_var_$102.first();
        }
        translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, decoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    if( NIL == translations )
    {
      Dynamic.sublisp_throw( $kw39$SKSI_MISSING_DECODINGS, logical_field_indexical );
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 41927L)
  public static SubLObject generate_decoding_compositions_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject used_gafs)
  {
    final SubLObject physical_field_decoding_gafs = get_physical_field_decoding_gafs_for_physical_field_indexical( physical_field_indexical, physical_schemata );
    SubLObject translations = NIL;
    SubLObject cdolist_list_var = physical_field_decoding_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str42$Decoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject physical_field_decoding = get_physical_field_decoding_from_gaf( gaf );
        final SubLObject decoding_physical_field_indexicals = physical_field_decoding_physical_field_indexicals( physical_field_decoding );
        final SubLObject decoding_list = sksi_reconstruct_physical_field_decoding( physical_field_decoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject cdolist_list_var_$103 = decoding_physical_field_indexicals;
        SubLObject decoding_physical_field_indexical = NIL;
        decoding_physical_field_indexical = cdolist_list_var_$103.first();
        while ( NIL != cdolist_list_var_$103)
        {
          final SubLObject sub_translations = generate_decoding_compositions_for_physical_field_indexical_recursive( decoding_physical_field_indexical, physical_schemata, new_used_gafs );
          if( NIL != sub_translations )
          {
            multi_alist = ConsesLow.cons( ConsesLow.cons( decoding_physical_field_indexical, sub_translations ), multi_alist );
          }
          cdolist_list_var_$103 = cdolist_list_var_$103.rest();
          decoding_physical_field_indexical = cdolist_list_var_$103.first();
        }
        translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, decoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43271L)
  public static SubLObject generate_encoding_compositions_for_physical_field_indexical_internal(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject translations = NIL;
    SubLObject error_message = NIL;
    SubLObject result = NIL;
    try
    {
      thread.throwStack.push( $kw39$SKSI_MISSING_DECODINGS );
      SubLObject result_$104 = NIL;
      try
      {
        thread.throwStack.push( $kw40$SKSI_MISSING_ENCODINGS );
        translations = list_utilities.fast_delete_duplicates( generate_encoding_compositions_for_physical_field_indexical_recursive( physical_field_indexical, logical_schemata, physical_schemata, NIL ), UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      catch( final Throwable ccatch_env_var )
      {
        result_$104 = Errors.handleThrowable( ccatch_env_var, $kw40$SKSI_MISSING_ENCODINGS );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != result_$104 )
      {
        error_message = sksi_debugging.sksi_violation_message( $kw40$SKSI_MISSING_ENCODINGS, result_$104 );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      result = Errors.handleThrowable( ccatch_env_var2, $kw39$SKSI_MISSING_DECODINGS );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != result )
    {
      error_message = sksi_debugging.sksi_violation_message( $kw39$SKSI_MISSING_DECODINGS, result );
    }
    if( NIL != error_message && NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( THREE_INTEGER ) )
    {
      PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str41$__SKSI__A_, error_message ), THREE_INTEGER );
      streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43271L)
  public static SubLObject generate_encoding_compositions_for_physical_field_indexical(final SubLObject physical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return generate_encoding_compositions_for_physical_field_indexical_internal( physical_field_indexical, logical_schemata, physical_schemata, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, FOUR_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( physical_field_indexical, logical_schemata, physical_schemata, mt_info );
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
        if( physical_field_indexical.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( physical_schemata.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( generate_encoding_compositions_for_physical_field_indexical_internal( physical_field_indexical, logical_schemata,
        physical_schemata, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( physical_field_indexical, logical_schemata, physical_schemata, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 43982L)
  public static SubLObject generate_encoding_compositions_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject used_gafs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical( physical_field_indexical, physical_schemata );
    final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata );
    SubLObject translations = NIL;
    SubLObject cdolist_list_var = physical_field_encoding_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject physical_field_encoding = get_physical_field_encoding_from_gaf( gaf );
        final SubLObject encoding_physical_field_indexicals = physical_field_encoding_physical_field_indexicals( physical_field_encoding );
        final SubLObject encoding_list = sksi_reconstruct_physical_field_encoding( physical_field_encoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject error_message = NIL;
        SubLObject result = NIL;
        try
        {
          thread.throwStack.push( $kw39$SKSI_MISSING_DECODINGS );
          SubLObject result_$105 = NIL;
          try
          {
            thread.throwStack.push( $kw40$SKSI_MISSING_ENCODINGS );
            SubLObject cdolist_list_var_$106 = encoding_physical_field_indexicals;
            SubLObject encoding_physical_field_indexical = NIL;
            encoding_physical_field_indexical = cdolist_list_var_$106.first();
            while ( NIL != cdolist_list_var_$106)
            {
              final SubLObject sub_translations = generate_encoding_compositions_for_physical_field_indexical_recursive( encoding_physical_field_indexical, logical_schemata, physical_schemata, new_used_gafs );
              if( NIL != sub_translations )
              {
                multi_alist = ConsesLow.cons( ConsesLow.cons( encoding_physical_field_indexical, sub_translations ), multi_alist );
              }
              cdolist_list_var_$106 = cdolist_list_var_$106.rest();
              encoding_physical_field_indexical = cdolist_list_var_$106.first();
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            result_$105 = Errors.handleThrowable( ccatch_env_var, $kw40$SKSI_MISSING_ENCODINGS );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != result_$105 )
          {
            error_message = sksi_debugging.sksi_violation_message( $kw40$SKSI_MISSING_ENCODINGS, result_$105 );
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          result = Errors.handleThrowable( ccatch_env_var2, $kw39$SKSI_MISSING_DECODINGS );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL != result )
        {
          error_message = sksi_debugging.sksi_violation_message( $kw39$SKSI_MISSING_DECODINGS, result );
        }
        if( NIL == error_message )
        {
          translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, encoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    cdolist_list_var = field_encoding_gafs;
    gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject field_encoding = get_field_encoding_from_gaf( gaf );
        final SubLObject logical_field_indexicals = field_encoding_logical_field_indexicals( field_encoding );
        final SubLObject encoding_list = sksi_reconstruct_field_encoding( field_encoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject cdolist_list_var_$107 = logical_field_indexicals;
        SubLObject logical_field_indexical = NIL;
        logical_field_indexical = cdolist_list_var_$107.first();
        while ( NIL != cdolist_list_var_$107)
        {
          final SubLObject sub_translations2 = generate_encoding_compositions_for_logical_field_indexical_recursive( logical_field_indexical, logical_schemata, new_used_gafs );
          if( NIL != sub_translations2 )
          {
            multi_alist = ConsesLow.cons( ConsesLow.cons( logical_field_indexical, sub_translations2 ), multi_alist );
          }
          cdolist_list_var_$107 = cdolist_list_var_$107.rest();
          logical_field_indexical = cdolist_list_var_$107.first();
        }
        translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, encoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    if( NIL == translations )
    {
      Dynamic.sublisp_throw( $kw40$SKSI_MISSING_ENCODINGS, physical_field_indexical );
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 46565L)
  public static SubLObject generate_encoding_compositions_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject used_gafs)
  {
    final SubLObject logical_field_encoding_gafs = get_logical_field_encoding_gafs_for_logical_field_indexical( logical_field_indexical, logical_schemata );
    SubLObject translations = NIL;
    SubLObject cdolist_list_var = logical_field_encoding_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject logical_field_encoding = get_logical_field_encoding_from_gaf( gaf );
        final SubLObject encoding_logical_field_indexicals = logical_field_encoding_logical_field_indexicals( logical_field_encoding );
        final SubLObject encoding_list = sksi_reconstruct_logical_field_encoding( logical_field_encoding, UNPROVIDED );
        final SubLObject new_used_gafs = ConsesLow.cons( gaf, used_gafs );
        SubLObject multi_alist = NIL;
        SubLObject cdolist_list_var_$108 = encoding_logical_field_indexicals;
        SubLObject encoding_logical_field_indexical = NIL;
        encoding_logical_field_indexical = cdolist_list_var_$108.first();
        while ( NIL != cdolist_list_var_$108)
        {
          final SubLObject sub_translations = generate_encoding_compositions_for_logical_field_indexical_recursive( encoding_logical_field_indexical, logical_schemata, new_used_gafs );
          if( NIL != sub_translations )
          {
            multi_alist = ConsesLow.cons( ConsesLow.cons( encoding_logical_field_indexical, sub_translations ), multi_alist );
          }
          cdolist_list_var_$108 = cdolist_list_var_$108.rest();
          encoding_logical_field_indexical = cdolist_list_var_$108.first();
        }
        translations = ConsesLow.append( list_utilities.multi_sublis( multi_alist, encoding_list, Symbols.symbol_function( EQ ), UNPROVIDED ), translations );
      }
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 47863L)
  public static SubLObject generate_encoding_compositions_from_logical_field_indexical_internal(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLObject logical_field_indexical_fort = sksi_kb_accessors.lfi_fort_for_lfi( logical_field_indexical );
    final SubLObject physical_field_indexicals = gather_lowest_physical_field_indexicals_for_logical_field_indexical( logical_field_indexical_fort, logical_schemata, physical_schemata );
    SubLObject translations = NIL;
    SubLObject cdolist_list_var = physical_field_indexicals;
    SubLObject physical_field_indexical = NIL;
    physical_field_indexical = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pfi_translations = generate_encoding_compositions_for_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata, UNPROVIDED );
      final SubLObject alist = ConsesLow.list( reader.bq_cons( logical_field_indexical_fort, logical_field_indexical ) );
      SubLObject cdolist_list_var_$109 = pfi_translations;
      SubLObject pfi_translation = NIL;
      pfi_translation = cdolist_list_var_$109.first();
      while ( NIL != cdolist_list_var_$109)
      {
        if( NIL != sksi_query_utilities.expression_contains_logical_field_indexicalP( logical_field_indexical_fort, pfi_translation ) )
        {
          translations = ConsesLow.cons( ConsesLow.list( sksi_kb_accessors.pfi_for_lfi( physical_field_indexical, logical_field_indexical ), conses_high.sublis( alist, pfi_translation, UNPROVIDED, UNPROVIDED ) ),
              translations );
        }
        cdolist_list_var_$109 = cdolist_list_var_$109.rest();
        pfi_translation = cdolist_list_var_$109.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      physical_field_indexical = cdolist_list_var.first();
    }
    return translations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 47863L)
  public static SubLObject generate_encoding_compositions_from_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata, SubLObject mt_info)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return generate_encoding_compositions_from_logical_field_indexical_internal( logical_field_indexical, logical_schemata, physical_schemata, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, FOUR_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( logical_field_indexical, logical_schemata, physical_schemata, mt_info );
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
        if( logical_field_indexical.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schemata.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( physical_schemata.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( generate_encoding_compositions_from_logical_field_indexical_internal( logical_field_indexical, logical_schemata,
        physical_schemata, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field_indexical, logical_schemata, physical_schemata, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 49212L)
  public static SubLObject gather_lowest_physical_field_indexicals_for_logical_field_indexical(final SubLObject logical_field_indexical, SubLObject logical_schemata, SubLObject physical_schemata)
  {
    if( logical_schemata == UNPROVIDED )
    {
      logical_schemata = NIL;
    }
    if( physical_schemata == UNPROVIDED )
    {
      physical_schemata = NIL;
    }
    return list_utilities.fast_delete_duplicates( gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive( logical_field_indexical, logical_schemata, physical_schemata, NIL ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 49729L)
  public static SubLObject gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject used_gafs)
  {
    final SubLObject logical_field_encoding_gafs = get_logical_field_encoding_gafs_from_logical_field_indexical( logical_field_indexical, logical_schemata );
    final SubLObject field_encoding_gafs = get_field_encoding_gafs_for_logical_field_indexical( logical_field_indexical, logical_schemata, physical_schemata, UNPROVIDED );
    SubLObject physical_field_indexicals = NIL;
    SubLObject cdolist_list_var = logical_field_encoding_gafs;
    SubLObject logical_field_encoding_gaf = NIL;
    logical_field_encoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( logical_field_encoding_gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject new_logical_field_indexical = assertions_high.gaf_arg2( logical_field_encoding_gaf );
        final SubLObject new_used_gafs = ConsesLow.cons( logical_field_encoding_gaf, used_gafs );
        final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive( new_logical_field_indexical, logical_schemata, physical_schemata, new_used_gafs );
        physical_field_indexicals = ConsesLow.append( new_pf_indexicals, physical_field_indexicals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      logical_field_encoding_gaf = cdolist_list_var.first();
    }
    cdolist_list_var = field_encoding_gafs;
    SubLObject field_encoding_gaf = NIL;
    field_encoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( field_encoding_gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject pf_indexical = assertions_high.gaf_arg2( field_encoding_gaf );
        final SubLObject new_used_gafs = ConsesLow.cons( field_encoding_gaf, used_gafs );
        final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive( pf_indexical, physical_schemata, new_used_gafs );
        physical_field_indexicals = ConsesLow.append( new_pf_indexicals, physical_field_indexicals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding_gaf = cdolist_list_var.first();
    }
    return physical_field_indexicals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 51403L)
  public static SubLObject gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive(final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject used_gafs)
  {
    final SubLObject physical_field_encoding_gafs = get_physical_field_encoding_gafs_from_physical_field_indexical( physical_field_indexical, physical_schemata );
    SubLObject physical_field_indexicals = ( NIL != physical_field_encoding_gafs ) ? NIL : ConsesLow.list( physical_field_indexical );
    SubLObject cdolist_list_var = physical_field_encoding_gafs;
    SubLObject physical_field_encoding_gaf = NIL;
    physical_field_encoding_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( physical_field_encoding_gaf, used_gafs ) )
      {
        Errors.warn( $str44$Encoding_loop___a_, used_gafs );
      }
      else
      {
        final SubLObject pf_indexical = assertions_high.gaf_arg2( physical_field_encoding_gaf );
        final SubLObject new_used_gafs = ConsesLow.cons( physical_field_encoding_gaf, used_gafs );
        final SubLObject new_pf_indexicals = gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive( pf_indexical, physical_schemata, new_used_gafs );
        physical_field_indexicals = ConsesLow.append( new_pf_indexicals, physical_field_indexicals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      physical_field_encoding_gaf = cdolist_list_var.first();
    }
    return physical_field_indexicals;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 52422L)
  public static SubLObject translations_equivalentP(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = NIL;
    }
    if( NIL == memoizeP )
    {
      return translations_equivalent_int( translation0, translation1, hl_test, el_test );
    }
    if( NIL != kb_utilities.term_L( translation1, translation0, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return translations_equivalent_memoized( translation0, translation1, hl_test, el_test );
    }
    return translations_equivalent_memoized( translation0, translation1, hl_test, el_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53012L)
  public static SubLObject translations_equivalent_memoized_internal(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test)
  {
    return translations_equivalent_int( translation0, translation1, hl_test, el_test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53012L)
  public static SubLObject translations_equivalent_memoized(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return translations_equivalent_memoized_internal( translation0, translation1, hl_test, el_test );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( translation0, translation1, hl_test, el_test );
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
        if( translation0.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( translation1.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( hl_test.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && el_test.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( translations_equivalent_memoized_internal( translation0, translation1, hl_test, el_test ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( translation0, translation1, hl_test, el_test ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 53205L)
  public static SubLObject translations_equivalent_int(final SubLObject translation0, final SubLObject translation1, final SubLObject hl_test, final SubLObject el_test)
  {
    if( translation0.equal( translation1 ) )
    {
      return T;
    }
    if( NIL == translation0 || NIL == translation1 )
    {
      return NIL;
    }
    SubLObject modified_translation0 = sksi_reconstruct_translation( translation0, el_test, UNPROVIDED );
    SubLObject modified_translation2 = sksi_reconstruct_translation( translation1, el_test, UNPROVIDED );
    SubLObject possibly_equivalentP = T;
    SubLObject doneP = NIL;
    SubLObject arg_count = NIL;
    arg_count = ZERO_INTEGER;
    while ( NIL != possibly_equivalentP && NIL == doneP)
    {
      final SubLObject field0 = cycl_utilities.expression_find_if( hl_test, modified_translation0, T, UNPROVIDED );
      final SubLObject field2 = cycl_utilities.expression_find_if( hl_test, modified_translation2, T, UNPROVIDED );
      if( NIL != field0 && NIL != field2 )
      {
        modified_translation0 = cycl_utilities.expression_subst( arg_count, field0, modified_translation0, UNPROVIDED, UNPROVIDED );
        modified_translation2 = cycl_utilities.expression_subst( arg_count, field2, modified_translation2, UNPROVIDED, UNPROVIDED );
      }
      else if( NIL != field0 || NIL != field2 )
      {
        possibly_equivalentP = NIL;
      }
      else
      {
        doneP = T;
      }
      arg_count = Numbers.add( arg_count, ONE_INTEGER );
    }
    if( NIL != possibly_equivalentP )
    {
      return Equality.equal( modified_translation0, modified_translation2 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 54829L)
  public static SubLObject encodings_equivalentP(final SubLObject encoding0, final SubLObject encoding1, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return translations_equivalentP( encoding0, encoding1, $sym4$LOGICAL_FIELD_INDEXICAL_P, $sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55056L)
  public static SubLObject decodings_equivalentP(final SubLObject decoding0, final SubLObject decoding1, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = T;
    }
    return translations_equivalentP( decoding0, decoding1, $sym3$PHYSICAL_FIELD_INDEXICAL_P, $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P, memoizeP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55284L)
  public static SubLObject some_encodings_equivalentP(final SubLObject encodings0, final SubLObject encodings1, SubLObject memoizedP)
  {
    if( memoizedP == UNPROVIDED )
    {
      memoizedP = NIL;
    }
    SubLObject some_equivalentP = NIL;
    if( NIL == some_equivalentP )
    {
      SubLObject csome_list_var = encodings0;
      SubLObject encoding0 = NIL;
      encoding0 = csome_list_var.first();
      while ( NIL == some_equivalentP && NIL != csome_list_var)
      {
        if( NIL == some_equivalentP )
        {
          SubLObject csome_list_var_$110;
          SubLObject encoding2;
          for( csome_list_var_$110 = encodings1, encoding2 = NIL, encoding2 = csome_list_var_$110.first(); NIL == some_equivalentP && NIL != csome_list_var_$110; some_equivalentP = encodings_equivalentP( encoding0,
              encoding2, memoizedP ), csome_list_var_$110 = csome_list_var_$110.rest(), encoding2 = csome_list_var_$110.first() )
          {
          }
        }
        csome_list_var = csome_list_var.rest();
        encoding0 = csome_list_var.first();
      }
    }
    return some_equivalentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 55698L)
  public static SubLObject some_decodings_equivalentP(final SubLObject decodings0, final SubLObject decodings1, SubLObject memoizedP)
  {
    if( memoizedP == UNPROVIDED )
    {
      memoizedP = NIL;
    }
    SubLObject some_equivalentP = NIL;
    if( NIL == some_equivalentP )
    {
      SubLObject csome_list_var = decodings0;
      SubLObject decoding0 = NIL;
      decoding0 = csome_list_var.first();
      while ( NIL == some_equivalentP && NIL != csome_list_var)
      {
        if( NIL == some_equivalentP )
        {
          SubLObject csome_list_var_$111;
          SubLObject decoding2;
          for( csome_list_var_$111 = decodings1, decoding2 = NIL, decoding2 = csome_list_var_$111.first(); NIL == some_equivalentP && NIL != csome_list_var_$111; some_equivalentP = decodings_equivalentP( decoding0,
              decoding2, memoizedP ), csome_list_var_$111 = csome_list_var_$111.rest(), decoding2 = csome_list_var_$111.first() )
          {
          }
        }
        csome_list_var = csome_list_var.rest();
        decoding0 = csome_list_var.first();
      }
    }
    return some_equivalentP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 56111L)
  public static SubLObject sksi_apply_encoding_and_reformulate(final SubLObject alist, final SubLObject encoding, final SubLObject sks, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject reconstructed_encoding = sksi_reconstruct_encoding( encoding, UNPROVIDED );
    return sksi_apply_translation_and_reformulate( alist, reconstructed_encoding, $kw48$ENCODE, sks, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 56643L)
  public static SubLObject sksi_apply_decoding_and_reformulate(final SubLObject alist, final SubLObject decoding, final SubLObject sks, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject reconstructed_decoding = sksi_reconstruct_decoding( decoding, UNPROVIDED );
    return sksi_apply_translation_and_reformulate( alist, reconstructed_decoding, $kw49$DECODE, sks, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 57091L)
  public static SubLObject sksi_apply_translation_and_reformulate(final SubLObject alist, final SubLObject translation, final SubLObject direction, final SubLObject sks, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject recursedP = NIL;
    SubLObject result = NIL;
    SubLObject rest;
    SubLObject cons;
    SubLObject current;
    SubLObject datum;
    SubLObject lf;
    SubLObject value;
    SubLObject result_items;
    SubLObject cdolist_list_var;
    SubLObject item;
    SubLObject new_alist;
    for( rest = NIL, rest = alist; NIL == recursedP && NIL != rest; rest = rest.rest() )
    {
      cons = rest.first();
      datum = ( current = cons );
      lf = NIL;
      value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
      lf = current.first();
      current = ( value = current.rest() );
      if( NIL != el_utilities.el_set_p( value ) )
      {
        result_items = NIL;
        cdolist_list_var = el_utilities.el_set_items( value );
        item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          new_alist = list_utilities.alist_enter( el_utilities.copy_expression( alist ), lf, item, UNPROVIDED );
          result_items = ConsesLow.cons( sksi_apply_translation_and_reformulate( new_alist, translation, direction, sks, mt ), result_items );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
        result = el_utilities.make_el_set( result_items, UNPROVIDED );
        recursedP = T;
      }
    }
    if( NIL == recursedP )
    {
      final SubLObject applied_translation = cycl_utilities.expression_sublis( alist, translation, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject mt_var = mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        result = sksi_reformulate.sksi_reformulate( applied_translation, direction, sks );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 57918L)
  public static SubLObject filter_decodings(final SubLObject decodings, final SubLObject physical_schemata)
  {
    SubLObject new_decodings = NIL;
    SubLObject cdolist_list_var = decodings;
    SubLObject decoding = NIL;
    decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != filter_decoding( decoding, physical_schemata ) )
      {
        new_decodings = ConsesLow.cons( decoding, new_decodings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      decoding = cdolist_list_var.first();
    }
    return Sequences.nreverse( new_decodings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 58264L)
  public static SubLObject filter_decoding(final SubLObject decoding, final SubLObject physical_schemata)
  {
    final SubLObject physical_field_indexicals = field_translation_fields( decoding, $sym3$PHYSICAL_FIELD_INDEXICAL_P );
    SubLObject filterP = NIL;
    if( NIL == filterP )
    {
      SubLObject csome_list_var = physical_field_indexicals;
      SubLObject physical_field_indexical = NIL;
      physical_field_indexical = csome_list_var.first();
      while ( NIL == filterP && NIL != csome_list_var)
      {
        if( NIL == list_utilities.member_eqP( sksi_kb_accessors.physical_field_indexical_schema( physical_field_indexical ), physical_schemata ) )
        {
          filterP = T;
        }
        csome_list_var = csome_list_var.rest();
        physical_field_indexical = csome_list_var.first();
      }
    }
    return ( NIL != filterP ) ? NIL : decoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 58677L)
  public static SubLObject sksi_translate_logical_sentences_to_physical_sentences(final SubLObject sentences, final SubLObject sks, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt( sks );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym51$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mapping_mt, thread );
      final SubLObject logical_schemata = ( NIL != sksi_sks_accessors.sks_complex_p( sks ) ) ? sksi_kb_accessors.sk_source_complex_logical_schemata( sks ) : sksi_kb_accessors.sk_source_logical_schemata( sks );
      SubLObject cdolist_list_var = sentences;
      SubLObject sentence = NIL;
      sentence = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred = cycl_utilities.sentence_arg0( sentence );
        SubLObject meaning_sentence_gafs = sksi_meaning_sentence_utilities.relevant_logical_schemata_meaning_sentence_gafs( logical_schemata, pred, $sym52$RELEVANT_PRED_IS_EQ, UNPROVIDED, UNPROVIDED );
        if( NIL != content_mt )
        {
          SubLObject matching_meaning_sentence_gafs = NIL;
          SubLObject cdolist_list_var_$112 = meaning_sentence_gafs;
          SubLObject meaning_sentence_gaf = NIL;
          meaning_sentence_gaf = cdolist_list_var_$112.first();
          while ( NIL != cdolist_list_var_$112)
          {
            final SubLObject mt_var = content_mt;
            final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_1_$114 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
              if( NIL != sksi_meaning_sentence_utilities.meaning_sentence_type_check( sentence, assertions_high.gaf_arg2( meaning_sentence_gaf ), memoizeP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                matching_meaning_sentence_gafs = ConsesLow.cons( meaning_sentence_gaf, matching_meaning_sentence_gafs );
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_1_$114, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$113, thread );
            }
            cdolist_list_var_$112 = cdolist_list_var_$112.rest();
            meaning_sentence_gaf = cdolist_list_var_$112.first();
          }
          meaning_sentence_gafs = matching_meaning_sentence_gafs;
        }
        if( NIL == meaning_sentence_gafs )
        {
          final SubLObject _prev_bind_0_$114 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
          final SubLObject _prev_bind_1_$115 = mt_relevance_macros.$mt$.currentBinding( thread );
          try
          {
            mt_relevance_macros.$relevant_mt_function$.bind( $sym51$RELEVANT_MT_IS_GENL_MT, thread );
            mt_relevance_macros.$mt$.bind( mapping_mt, thread );
            if( NIL != virtual_indexing.assertions_mentioning_terms( ConsesLow.list( pred, $const53$meaningSentenceOfSchema ), UNPROVIDED ) )
            {
              Errors.warn( $str54$No_meaning_sentence_for__S, sentence );
            }
          }
          finally
          {
            mt_relevance_macros.$mt$.rebind( _prev_bind_1_$115, thread );
            mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$114, thread );
          }
        }
        else
        {
          SubLObject sentence_translation = NIL;
          SubLObject successP = NIL;
          if( NIL == successP )
          {
            SubLObject csome_list_var = meaning_sentence_gafs;
            SubLObject meaning_sentence_gaf2 = NIL;
            meaning_sentence_gaf2 = csome_list_var.first();
            while ( NIL == successP && NIL != csome_list_var)
            {
              final SubLObject meaning_sentence = assertions_high.gaf_arg2( meaning_sentence_gaf2 );
              final SubLObject logical_schema = assertions_high.gaf_arg1( meaning_sentence_gaf2 );
              final SubLObject physical_schemata = sksi_kb_accessors.logical_schema_physical_schemata( logical_schema );
              thread.resetMultipleValues();
              final SubLObject raw_tuples = sksi_incremental_edit.sksi_translate_logical_sentence_to_raw_tuples( sentence, logical_schema, physical_schemata.first(), mapping_mt, sks, UNPROVIDED );
              final SubLObject physical_fields = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if( NIL != raw_tuples )
              {
                successP = T;
                sentence_translation = ConsesLow.cons( $kw55$PRED, sentence_translation );
                sentence_translation = ConsesLow.cons( cycl_utilities.sentence_arg0( meaning_sentence ), sentence_translation );
                SubLObject cdolist_list_var_$113 = cycl_utilities.sentence_args( meaning_sentence, UNPROVIDED );
                SubLObject arg = NIL;
                arg = cdolist_list_var_$113.first();
                while ( NIL != cdolist_list_var_$113)
                {
                  SubLObject name = NIL;
                  SubLObject value = NIL;
                  if( NIL != sksi_kb_accessors.logical_field_indexical_p( arg ) )
                  {
                    final SubLObject relevant_physical_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical( arg, logical_schemata, physical_schemata );
                    if( NIL == value )
                    {
                      SubLObject csome_list_var_$118 = relevant_physical_indexicals;
                      SubLObject relevant_physical_indexical = NIL;
                      relevant_physical_indexical = csome_list_var_$118.first();
                      while ( NIL == value && NIL != csome_list_var_$118)
                      {
                        final SubLObject relevant_physical_field = sksi_kb_accessors.physical_field_for_indexical( relevant_physical_indexical );
                        final SubLObject position = Sequences.position( relevant_physical_field, physical_fields, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        if( NIL != position )
                        {
                          name = sksi_kb_accessors.physical_field_name( relevant_physical_field );
                          value = ConsesLow.nth( position, raw_tuples.first().first() );
                        }
                        csome_list_var_$118 = csome_list_var_$118.rest();
                        relevant_physical_indexical = csome_list_var_$118.first();
                      }
                    }
                  }
                  else
                  {
                    value = arg;
                  }
                  if( NIL == name )
                  {
                    value = $kw56$NO_NAME;
                    successP = NIL;
                    Errors.warn( $str57$failure_on_name_for__S, arg );
                  }
                  if( NIL == value )
                  {
                    value = $kw58$NO_VALUE;
                    successP = NIL;
                    Errors.warn( $str59$failure_on_value_for__S, arg );
                  }
                  sentence_translation = ConsesLow.cons( name, sentence_translation );
                  sentence_translation = ConsesLow.cons( value, sentence_translation );
                  cdolist_list_var_$113 = cdolist_list_var_$113.rest();
                  arg = cdolist_list_var_$113.first();
                }
                sentence_translation = Sequences.nreverse( sentence_translation );
                if( NIL != successP && NIL == Sequences.find( $kw56$NO_NAME, sentence_translation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  result = ConsesLow.cons( sentence_translation, result );
                }
                if( NIL != Sequences.find( $kw56$NO_NAME, sentence_translation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  successP = NIL;
                }
              }
              csome_list_var = csome_list_var.rest();
              meaning_sentence_gaf2 = csome_list_var.first();
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        sentence = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-field-translation-utilities.lisp", position = 62423L)
  public static SubLObject sksi_translate_physical_sentence_plists_to_logical_sentences(final SubLObject raw_sentence_plists, final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym51$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mapping_mt, thread );
      final SubLObject physical_schemata = ( NIL != sksi_sks_accessors.sks_complex_p( sks ) ) ? sksi_kb_accessors.sk_source_complex_physical_schemata( sks ) : sksi_kb_accessors.sk_source_physical_schemata( sks );
      SubLObject cdolist_list_var = raw_sentence_plists;
      SubLObject raw_sentence_plist = NIL;
      raw_sentence_plist = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject logical_values = NIL;
        SubLObject logical_fields = NIL;
        SubLObject logical_schemata = NIL;
        SubLObject remainder;
        SubLObject pf_name;
        SubLObject raw_value;
        SubLObject physical_field;
        SubLObject physical_schema;
        SubLObject csome_list_var;
        SubLObject this_physical_schema;
        SubLObject possible_physical_field;
        SubLObject physical_field_indexical;
        SubLObject logical_field_indexicals;
        SubLObject found_logical_valueP;
        SubLObject cdolist_list_var_$119;
        SubLObject logical_field_indexical;
        SubLObject recipes;
        SubLObject csome_list_var2;
        SubLObject recipe;
        SubLObject reformulatable_expression;
        SubLObject logical_value;
        for( remainder = NIL, remainder = raw_sentence_plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
        {
          pf_name = remainder.first();
          raw_value = conses_high.cadr( remainder );
          physical_field = NIL;
          physical_schema = NIL;
          if( NIL == physical_field )
          {
            csome_list_var = physical_schemata;
            this_physical_schema = NIL;
            this_physical_schema = csome_list_var.first();
            while ( NIL == physical_field && NIL != csome_list_var)
            {
              possible_physical_field = sksi_kb_accessors.physical_field_for_schema_and_name( this_physical_schema, pf_name );
              if( NIL != possible_physical_field )
              {
                physical_field = possible_physical_field;
                physical_schema = this_physical_schema;
              }
              csome_list_var = csome_list_var.rest();
              this_physical_schema = csome_list_var.first();
            }
          }
          if( NIL == physical_field )
          {
            Errors.warn( $str60$No_physical_field_for__S, raw_value );
          }
          else
          {
            logical_schemata = sksi_kb_accessors.physical_schema_logical_schemata( physical_schema );
            physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
            if( NIL != physical_field_indexical )
            {
              logical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical( physical_field_indexical, logical_schemata, physical_schemata );
              found_logical_valueP = NIL;
              cdolist_list_var_$119 = logical_field_indexicals;
              logical_field_indexical = NIL;
              logical_field_indexical = cdolist_list_var_$119.first();
              while ( NIL != cdolist_list_var_$119)
              {
                recipes = relevant_field_decodings_for_indexical( logical_field_indexical, logical_schemata, physical_schemata );
                if( NIL == found_logical_valueP )
                {
                  csome_list_var2 = recipes;
                  recipe = NIL;
                  recipe = csome_list_var2.first();
                  while ( NIL == found_logical_valueP && NIL != csome_list_var2)
                  {
                    reformulatable_expression = cycl_utilities.expression_subst( raw_value, cycl_utilities.naut_substitute( physical_field_indexical ), cycl_utilities.naut_substitute( recipe ), Symbols.symbol_function(
                        EQUAL ), UNPROVIDED );
                    logical_value = sksi_reformulate.sksi_reformulate( reformulatable_expression, $kw49$DECODE, sks );
                    if( NIL != logical_value )
                    {
                      found_logical_valueP = T;
                      logical_values = ConsesLow.cons( logical_value, logical_values );
                      logical_fields = ConsesLow.cons( sksi_kb_accessors.logical_field_for_indexical( logical_field_indexical ), logical_fields );
                    }
                    csome_list_var2 = csome_list_var2.rest();
                    recipe = csome_list_var2.first();
                  }
                }
                cdolist_list_var_$119 = cdolist_list_var_$119.rest();
                logical_field_indexical = cdolist_list_var_$119.first();
              }
            }
          }
        }
        logical_values = Sequences.nreverse( logical_values );
        logical_fields = Sequences.nreverse( logical_fields );
        final SubLObject logical_field_indexicals2 = Mapping.mapcar( $sym61$INDEXICAL_FOR_LOGICAL_FIELD, logical_fields );
        SubLObject pred = NIL;
        if( NIL == pred )
        {
          SubLObject csome_list_var3 = logical_schemata;
          SubLObject logical_schema = NIL;
          logical_schema = csome_list_var3.first();
          while ( NIL == pred && NIL != csome_list_var3)
          {
            final SubLObject preds = ask_utilities.query_variable( $sym62$_PRED, ConsesLow.list( $const53$meaningSentenceOfSchema, logical_schema, reader.bq_cons( $sym62$_PRED, logical_field_indexicals2 ) ), mapping_mt,
                UNPROVIDED );
            if( NIL != list_utilities.lengthGE( preds, TWO_INTEGER, UNPROVIDED ) )
            {
              Errors.warn( $str63$More_than_one_meaning_sentence_pr, logical_field_indexicals2, raw_sentence_plist );
            }
            if( NIL != preds )
            {
              pred = preds.first();
            }
            csome_list_var3 = csome_list_var3.rest();
            logical_schema = csome_list_var3.first();
          }
        }
        if( NIL == pred )
        {
          Errors.warn( $str64$Meaning_sentence_not_found_for__S, logical_field_indexicals2, raw_sentence_plist );
        }
        else
        {
          result = ConsesLow.cons( reader.bq_cons( pred, logical_values ), result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        raw_sentence_plist = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  public static SubLObject declare_sksi_field_translation_utilities_file()
  {
    SubLFiles.declareFunction( me, "get_field_translation_from_gaf", "GET-FIELD-TRANSLATION-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_field_translation_gaf", "DESTRUCTURE-FIELD-TRANSLATION-GAF" );
    SubLFiles.declareFunction( me, "field_translation_fields", "FIELD-TRANSLATION-FIELDS", 2, 0, false );
    SubLFiles.declareFunction( me, "decoding_physical_field_indexicals", "DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false );
    new $decoding_physical_field_indexicals$UnaryFunction();
    SubLFiles.declareFunction( me, "decoding_physical_field_indexicals_ordered", "DECODING-PHYSICAL-FIELD-INDEXICALS-ORDERED", 1, 0, false );
    SubLFiles.declareFunction( me, "encoding_logical_fields", "ENCODING-LOGICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "encoding_logical_field_indexicals", "ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "encoding_logical_fields_ordered", "ENCODING-LOGICAL-FIELDS-ORDERED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_logical_field_decoding_from_gaf", "GET-LOGICAL-FIELD-DECODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_logical_field_decoding_gaf", "DESTRUCTURE-LOGICAL-FIELD-DECODING-GAF" );
    SubLFiles.declareFunction( me, "logical_field_decoding_logical_field_indexicals", "LOGICAL-FIELD-DECODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_logical_field_decoding_gafs_for_logical_field", "GET-LOGICAL-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_logical_field_decoding_gafs_for_logical_field_indexical", "GET-LOGICAL-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_logical_field_decodings_for_logical_field", "GET-LOGICAL-FIELD-DECODINGS-FOR-LOGICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_logical_field_encoding_from_gaf", "GET-LOGICAL-FIELD-ENCODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_logical_field_encoding_gaf", "DESTRUCTURE-LOGICAL-FIELD-ENCODING-GAF" );
    SubLFiles.declareFunction( me, "logical_field_encoding_logical_field_indexicals", "LOGICAL-FIELD-ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_field_encoding_contains_logical_field_indexicalP", "LOGICAL-FIELD-ENCODING-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_logical_field_encoding_gafs_for_logical_field_indexical", "GET-LOGICAL-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_logical_field_encoding_gafs_from_logical_field_indexical", "GET-LOGICAL-FIELD-ENCODING-GAFS-FROM-LOGICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_field_decoding_from_gaf", "GET-FIELD-DECODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_field_decoding_gaf", "DESTRUCTURE-FIELD-DECODING-GAF" );
    SubLFiles.declareFunction( me, "field_decoding_physical_field_indexicals", "FIELD-DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "field_decoding_contains_physical_field_indexicalP", "FIELD-DECODING-CONTAINS-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "field_decoding_contains_physical_field_indexicalsP", "FIELD-DECODING-CONTAINS-PHYSICAL-FIELD-INDEXICALS?", 2, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_decodings_internal", "RELEVANT-FIELD-DECODINGS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_decodings", "RELEVANT-FIELD-DECODINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_decodings_for_indexical_internal", "RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_decodings_for_indexical", "RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "get_field_decoding_gafs_for_logical_field_indexical", "GET-FIELD-DECODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_decodings_for_logical_field_indexical", "GET-FIELD-DECODINGS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_decoding_gafs_from_physical_field_indexical", "GET-FIELD-DECODING-GAFS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_decodings_from_physical_field_indexical", "GET-FIELD-DECODINGS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encoding_from_gaf", "GET-FIELD-ENCODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_field_encoding_gaf", "DESTRUCTURE-FIELD-ENCODING-GAF" );
    SubLFiles.declareFunction( me, "field_encoding_logical_field_indexicals", "FIELD-ENCODING-LOGICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "isomorphic_field_encoding_p", "ISOMORPHIC-FIELD-ENCODING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "field_encoding_contains_logical_field_indexicalP", "FIELD-ENCODING-CONTAINS-LOGICAL-FIELD-INDEXICAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_encodings_internal", "RELEVANT-FIELD-ENCODINGS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "relevant_field_encodings", "RELEVANT-FIELD-ENCODINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_field_encoding_gafs_for_physical_field", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encodings_for_physical_field_internal", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD-INTERNAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encodings_for_physical_field", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encoding_gafs_for_physical_field_indexical_internal", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encoding_gafs_for_physical_field_indexical", "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encodings_for_physical_field_indexical", "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "get_field_encoding_gafs_for_logical_field_indexical_internal", "GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "get_field_encoding_gafs_for_logical_field_indexical", "GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 3, false );
    SubLFiles.declareFunction( me, "get_physical_field_decoding_from_gaf", "GET-PHYSICAL-FIELD-DECODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_physical_field_decoding_gaf", "DESTRUCTURE-PHYSICAL-FIELD-DECODING-GAF" );
    SubLFiles.declareFunction( me, "physical_field_decoding_physical_field_indexicals", "PHYSICAL-FIELD-DECODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_physical_field_decoding_gafs_for_physical_field", "GET-PHYSICAL-FIELD-DECODING-GAFS-FOR-PHYSICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_decodings_for_physical_field", "GET-PHYSICAL-FIELD-DECODINGS-FOR-PHYSICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_decoding_gafs_for_physical_field_indexical", "GET-PHYSICAL-FIELD-DECODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_decodings_for_physical_field_indexical", "GET-PHYSICAL-FIELD-DECODINGS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_encoding_from_gaf", "GET-PHYSICAL-FIELD-ENCODING-FROM-GAF", 1, 0, false );
    SubLFiles.declareMacro( me, "destructure_physical_field_encoding_gaf", "DESTRUCTURE-PHYSICAL-FIELD-ENCODING-GAF" );
    SubLFiles.declareFunction( me, "physical_field_encoding_physical_field_indexicals", "PHYSICAL-FIELD-ENCODING-PHYSICAL-FIELD-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_encoding_contains_physical_field_indexicalP", "PHYSICAL-FIELD-ENCODING-CONTAINS-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_physical_field_encoding_gafs_from_physical_field", "GET-PHYSICAL-FIELD-ENCODING-GAFS-FROM-PHYSICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_encodings_from_physical_field", "GET-PHYSICAL-FIELD-ENCODINGS-FROM-PHYSICAL-FIELD", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_encoding_gafs_from_physical_field_indexical", "GET-PHYSICAL-FIELD-ENCODING-GAFS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "get_physical_field_encodings_from_physical_field_indexical", "GET-PHYSICAL-FIELD-ENCODINGS-FROM-PHYSICAL-FIELD-INDEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_encoding", "SKSI-RECONSTRUCT-ENCODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_decoding", "SKSI-RECONSTRUCT-DECODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_logical_field_encoding", "SKSI-RECONSTRUCT-LOGICAL-FIELD-ENCODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_field_encoding", "SKSI-RECONSTRUCT-FIELD-ENCODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_physical_field_encoding", "SKSI-RECONSTRUCT-PHYSICAL-FIELD-ENCODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_logical_field_decoding", "SKSI-RECONSTRUCT-LOGICAL-FIELD-DECODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_field_decoding", "SKSI-RECONSTRUCT-FIELD-DECODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_physical_field_decoding", "SKSI-RECONSTRUCT-PHYSICAL-FIELD-DECODING", 1, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_translation", "SKSI-RECONSTRUCT-TRANSLATION", 2, 1, false );
    SubLFiles.declareFunction( me, "generate_decoding_compositions_for_logical_field_indexical", "GENERATE-DECODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "generate_decoding_compositions_for_logical_field_indexical_recursive", "GENERATE-DECODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "generate_decoding_compositions_for_physical_field_indexical_recursive", "GENERATE-DECODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_for_physical_field_indexical_internal", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_for_physical_field_indexical", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_for_physical_field_indexical_recursive", "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_for_logical_field_indexical_recursive", "GENERATE-ENCODING-COMPOSITIONS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_from_logical_field_indexical_internal", "GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "generate_encoding_compositions_from_logical_field_indexical", "GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL", 1, 3, false );
    SubLFiles.declareFunction( me, "gather_lowest_physical_field_indexicals_for_logical_field_indexical", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL", 1, 2, false );
    SubLFiles.declareFunction( me, "gather_lowest_physical_field_indexicals_for_logical_field_indexical_recursive", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "gather_lowest_physical_field_indexicals_for_physical_field_indexical_recursive", "GATHER-LOWEST-PHYSICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "translations_equivalentP", "TRANSLATIONS-EQUIVALENT?", 4, 1, false );
    SubLFiles.declareFunction( me, "translations_equivalent_memoized_internal", "TRANSLATIONS-EQUIVALENT-MEMOIZED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "translations_equivalent_memoized", "TRANSLATIONS-EQUIVALENT-MEMOIZED", 4, 0, false );
    SubLFiles.declareFunction( me, "translations_equivalent_int", "TRANSLATIONS-EQUIVALENT-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "encodings_equivalentP", "ENCODINGS-EQUIVALENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "decodings_equivalentP", "DECODINGS-EQUIVALENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "some_encodings_equivalentP", "SOME-ENCODINGS-EQUIVALENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "some_decodings_equivalentP", "SOME-DECODINGS-EQUIVALENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_apply_encoding_and_reformulate", "SKSI-APPLY-ENCODING-AND-REFORMULATE", 3, 1, false );
    SubLFiles.declareFunction( me, "sksi_apply_decoding_and_reformulate", "SKSI-APPLY-DECODING-AND-REFORMULATE", 3, 1, false );
    SubLFiles.declareFunction( me, "sksi_apply_translation_and_reformulate", "SKSI-APPLY-TRANSLATION-AND-REFORMULATE", 4, 1, false );
    SubLFiles.declareFunction( me, "filter_decodings", "FILTER-DECODINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "filter_decoding", "FILTER-DECODING", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_translate_logical_sentences_to_physical_sentences", "SKSI-TRANSLATE-LOGICAL-SENTENCES-TO-PHYSICAL-SENTENCES", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_translate_physical_sentence_plists_to_logical_sentences", "SKSI-TRANSLATE-PHYSICAL-SENTENCE-PLISTS-TO-LOGICAL-SENTENCES", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_field_translation_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_field_translation_utilities_file()
  {
    memoization_state.note_memoized_function( $sym15$RELEVANT_FIELD_DECODINGS );
    memoization_state.note_memoized_function( $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL );
    memoization_state.note_memoized_function( $sym22$RELEVANT_FIELD_ENCODINGS );
    memoization_state.note_memoized_function( $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD );
    memoization_state.note_memoized_function( $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL );
    memoization_state.note_memoized_function( $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL );
    memoization_state.note_memoized_function( $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL );
    memoization_state.note_memoized_function( $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL );
    memoization_state.note_memoized_function( $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_field_translation_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_field_translation_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_field_translation_utilities_file();
  }
  static
  {
    me = new sksi_field_translation_utilities();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "TO-SCHEMA" ), makeSymbol( "TO-FIELD" ), makeSymbol( "FROM-SCHEMA" ), makeSymbol( "FIELD-TRANSLATION" ) ), makeSymbol( "FIELD-TRANSLATION-GAF" ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym2$GAF_ARGS = makeSymbol( "GAF-ARGS" );
    $sym3$PHYSICAL_FIELD_INDEXICAL_P = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-P" );
    $sym4$LOGICAL_FIELD_INDEXICAL_P = makeSymbol( "LOGICAL-FIELD-INDEXICAL-P" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "TO-LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD" ), makeSymbol( "FROM-LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD-DECODING" ) ), makeSymbol(
        "LOGICAL-FIELD-DECODING-GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$DESTRUCTURE_FIELD_TRANSLATION_GAF = makeSymbol( "DESTRUCTURE-FIELD-TRANSLATION-GAF" );
    $const7$logicalFieldDecoding = constant_handles.reader_make_constant_shell( makeString( "logicalFieldDecoding" ) );
    $kw8$GAF = makeKeyword( "GAF" );
    $kw9$TRUE = makeKeyword( "TRUE" );
    $list10 = ConsesLow.list( makeSymbol( "TO-LOGICAL-SCHEMA" ), makeSymbol( "TO-LOGICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-LOGICAL-SCHEMA" ), makeSymbol( "DECODING" ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "TO-LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD" ), makeSymbol( "FROM-LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD-ENCODING" ) ), makeSymbol(
        "LOGICAL-FIELD-ENCODING-GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $const12$logicalFieldEncoding = constant_handles.reader_make_constant_shell( makeString( "logicalFieldEncoding" ) );
    $list13 = ConsesLow.list( makeSymbol( "TO-LOGICAL-SCHEMA" ), makeSymbol( "TO-LOGICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-LOGICAL-SCHEMA" ), makeSymbol( "ENCODING" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD" ), makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "FIELD-DECODING" ) ), makeSymbol( "FIELD-DECODING-GAF" ),
        makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym15$RELEVANT_FIELD_DECODINGS = makeSymbol( "RELEVANT-FIELD-DECODINGS" );
    $sym16$RELEVANT_FIELD_DECODINGS_FOR_INDEXICAL = makeSymbol( "RELEVANT-FIELD-DECODINGS-FOR-INDEXICAL" );
    $const17$fieldDecoding = constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) );
    $list18 = ConsesLow.list( makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "TO-LOGICAL-FIELD-INDEXICAL" ), makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "DECODING" ) );
    $sym19$GET_FIELD_DECODING_FROM_GAF = makeSymbol( "GET-FIELD-DECODING-FROM-GAF" );
    $list20 = ConsesLow.list( makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "LOGICAL-FIELD" ), makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "DECODING" ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "FIELD-ENCODING" ) ), makeSymbol(
        "FIELD-ENCODING-GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym22$RELEVANT_FIELD_ENCODINGS = makeSymbol( "RELEVANT-FIELD-ENCODINGS" );
    $sym23$GET_FIELD_ENCODINGS_FOR_PHYSICAL_FIELD = makeSymbol( "GET-FIELD-ENCODINGS-FOR-PHYSICAL-FIELD" );
    $sym24$GET_FIELD_ENCODING_GAFS_FOR_PHYSICAL_FIELD_INDEXICAL = makeSymbol( "GET-FIELD-ENCODING-GAFS-FOR-PHYSICAL-FIELD-INDEXICAL" );
    $const25$fieldEncoding = constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) );
    $list26 = ConsesLow.list( makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "TO-PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "ENCODING" ) );
    $int27$100 = makeInteger( 100 );
    $sym28$GET_FIELD_ENCODING_GAFS_FOR_LOGICAL_FIELD_INDEXICAL = makeSymbol( "GET-FIELD-ENCODING-GAFS-FOR-LOGICAL-FIELD-INDEXICAL" );
    $list29 = ConsesLow.list( makeSymbol( "PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "LOGICAL-SCHEMA" ), makeSymbol( "ENCODING" ) );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "TO-PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-DECODING" ) ), makeSymbol(
        "PHYSICAL-FIELD-DECODING-GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $const31$physicalFieldDecoding = constant_handles.reader_make_constant_shell( makeString( "physicalFieldDecoding" ) );
    $list32 = ConsesLow.list( makeSymbol( "TO-PHYSICAL-SCHEMA" ), makeSymbol( "TO-PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-PHYSICAL-SCHEMA" ), makeSymbol( "DECODING" ) );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "TO-PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-PHYSICAL-SCHEMA" ), makeSymbol( "PHYSICAL-FIELD-ENCODING" ) ), makeSymbol(
        "PHYSICAL-FIELD-ENCODING-GAF" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $const34$physicalFieldEncoding = constant_handles.reader_make_constant_shell( makeString( "physicalFieldEncoding" ) );
    $list35 = ConsesLow.list( makeSymbol( "TO-PHYSICAL-SCHEMA" ), makeSymbol( "TO-PHYSICAL-FIELD-INDEXICAL" ), makeSymbol( "FROM-PHYSICAL-SCHEMA" ), makeSymbol( "ENCODING" ) );
    $sym36$LOGICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P = makeSymbol( "LOGICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P" );
    $sym37$PHYSICAL_FIELD_INDEXICAL_OR_REIFIED_MAPPING_EL_FORMULA_P = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P" );
    $sym38$PHYSICAL_FIELD_INDEXICAL_EL_FORMULA_P = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-EL-FORMULA-P" );
    $kw39$SKSI_MISSING_DECODINGS = makeKeyword( "SKSI-MISSING-DECODINGS" );
    $kw40$SKSI_MISSING_ENCODINGS = makeKeyword( "SKSI-MISSING-ENCODINGS" );
    $str41$__SKSI__A_ = makeString( "~&SKSI-~A " );
    $str42$Decoding_loop___a_ = makeString( "Decoding loop: ~a." );
    $sym43$GENERATE_ENCODING_COMPOSITIONS_FOR_PHYSICAL_FIELD_INDEXICAL = makeSymbol( "GENERATE-ENCODING-COMPOSITIONS-FOR-PHYSICAL-FIELD-INDEXICAL" );
    $str44$Encoding_loop___a_ = makeString( "Encoding loop: ~a." );
    $sym45$GENERATE_ENCODING_COMPOSITIONS_FROM_LOGICAL_FIELD_INDEXICAL = makeSymbol( "GENERATE-ENCODING-COMPOSITIONS-FROM-LOGICAL-FIELD-INDEXICAL" );
    $sym46$TRANSLATIONS_EQUIVALENT_MEMOIZED = makeSymbol( "TRANSLATIONS-EQUIVALENT-MEMOIZED" );
    $sym47$LOGICAL_FIELD_INDEXICAL_EL_FORMULA_P = makeSymbol( "LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P" );
    $kw48$ENCODE = makeKeyword( "ENCODE" );
    $kw49$DECODE = makeKeyword( "DECODE" );
    $list50 = ConsesLow.cons( makeSymbol( "LF" ), makeSymbol( "VALUE" ) );
    $sym51$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym52$RELEVANT_PRED_IS_EQ = makeSymbol( "RELEVANT-PRED-IS-EQ" );
    $const53$meaningSentenceOfSchema = constant_handles.reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) );
    $str54$No_meaning_sentence_for__S = makeString( "No meaning sentence for ~S" );
    $kw55$PRED = makeKeyword( "PRED" );
    $kw56$NO_NAME = makeKeyword( "NO-NAME" );
    $str57$failure_on_name_for__S = makeString( "failure on name for ~S" );
    $kw58$NO_VALUE = makeKeyword( "NO-VALUE" );
    $str59$failure_on_value_for__S = makeString( "failure on value for ~S" );
    $str60$No_physical_field_for__S = makeString( "No physical field for ~S" );
    $sym61$INDEXICAL_FOR_LOGICAL_FIELD = makeSymbol( "INDEXICAL-FOR-LOGICAL-FIELD" );
    $sym62$_PRED = makeSymbol( "?PRED" );
    $str63$More_than_one_meaning_sentence_pr = makeString( "More than one meaning sentence pred found for ~S (from ~S)" );
    $str64$Meaning_sentence_not_found_for__S = makeString( "Meaning sentence not found for ~S (from ~S)" );
  }

  public static final class $decoding_physical_field_indexicals$UnaryFunction
      extends
        UnaryFunction
  {
    public $decoding_physical_field_indexicals$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DECODING-PHYSICAL-FIELD-INDEXICALS" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return decoding_physical_field_indexicals( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2521 ms
 * 
 */