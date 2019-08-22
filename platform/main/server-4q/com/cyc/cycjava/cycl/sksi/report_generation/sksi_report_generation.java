package com.cyc.cycjava.cycl.sksi.report_generation;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_report_generation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.report_generation.sksi_report_generation";
  public static final String myFingerPrint = "634ffb2cb154c0149b78e1897e30f5ca8bc88af482cd736eb23d690c4180eb12";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 924L)
  public static SubLSymbol $reportgen_minimal_property$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 1082L)
  public static SubLSymbol $reportgen_easy_one_answer_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8291L)
  private static SubLSymbol $run_column_query_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLSymbol $dtp_reportgen_exclusivity_state$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$REPORTGEN_OUTPUT_ROWS_FROM_INPUT_ROW;
  private static final SubLString $str3$_;
  private static final SubLList $list4;
  private static final SubLObject $const5$reportHasVariant;
  private static final SubLSymbol $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY;
  private static final SubLList $list7;
  private static final SubLObject $const8$queryNeedsThingBoundInPosition;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$RUN_COLUMN_QUERY;
  private static final SubLSymbol $kw12$RETURN;
  private static final SubLSymbol $kw13$BINDINGS;
  private static final SubLSymbol $sym14$_RUN_COLUMN_QUERY_CACHING_STATE_;
  private static final SubLInteger $int15$100;
  private static final SubLSymbol $sym16$REPORTGEN_SCHEMA_FIELD_NAME_LIST;
  private static final SubLObject $const17$reportLFIHasFieldName;
  private static final SubLSymbol $kw18$GAF;
  private static final SubLSymbol $kw19$TRUE;
  private static final SubLList $list20;
  private static final SubLObject $const21$logicalFieldValueWithFieldName;
  private static final SubLSymbol $sym22$REPORTGEN_INPUT_DOC_FIELD_NAME_LIST;
  private static final SubLSymbol $sym23$REPORTGEN_EXCLUSIVITY_STATE;
  private static final SubLSymbol $sym24$REPORTGEN_EXCLUSIVITY_STATE_P;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$PRINT_EXC_STATE;
  private static final SubLSymbol $sym30$REPORTGEN_EXCLUSIVITY_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$EXC_STATE_PHYS_FIELDS;
  private static final SubLSymbol $sym33$_CSETF_EXC_STATE_PHYS_FIELDS;
  private static final SubLSymbol $sym34$EXC_STATE_EXC_VALUE;
  private static final SubLSymbol $sym35$_CSETF_EXC_STATE_EXC_VALUE;
  private static final SubLSymbol $sym36$EXC_STATE_DEFAULT_VALUE;
  private static final SubLSymbol $sym37$_CSETF_EXC_STATE_DEFAULT_VALUE;
  private static final SubLSymbol $sym38$EXC_STATE_SATISFIED_YET_;
  private static final SubLSymbol $sym39$_CSETF_EXC_STATE_SATISFIED_YET_;
  private static final SubLSymbol $kw40$PHYS_FIELDS;
  private static final SubLSymbol $kw41$EXC_VALUE;
  private static final SubLSymbol $kw42$DEFAULT_VALUE;
  private static final SubLSymbol $kw43$SATISFIED_YET_;
  private static final SubLString $str44$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw45$BEGIN;
  private static final SubLSymbol $sym46$MAKE_REPORTGEN_EXCLUSIVITY_STATE;
  private static final SubLSymbol $kw47$SLOT;
  private static final SubLSymbol $kw48$END;
  private static final SubLSymbol $sym49$VISIT_DEFSTRUCT_OBJECT_REPORTGEN_EXCLUSIVITY_STATE_METHOD;
  private static final SubLString $str50$__a_EXCLUSIVITY_STATE__a__a__a_;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS;
  private static final SubLObject $const53$mutuallyExclusiveSchemaFieldListW;
  private static final SubLSymbol $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS;
  private static final SubLObject $const55$defaultBooleanStringsForKS;
  private static final SubLObject $const56$True;
  private static final SubLObject $const57$False;
  private static final SubLSymbol $sym58$INPUT_KS_FROM_REPORT_KS;
  private static final SubLObject $const59$derivedFromInput;
  private static final SubLSymbol $sym60$BASE_QUERY_FROM_KS;
  private static final SubLObject $const61$baseQueryForReportType;
  private static final SubLSymbol $sym62$RESULT_ARGPOS_IN_BASE_QUERY;
  private static final SubLObject $const63$baseQueryUsesAnswersInPosition;
  private static final SubLString $str64$_A_is_not_an_appropriate_knowledg;
  private static final SubLString $str65$_A_is_not_an_appropriate_knowledg;
  private static final SubLString $str66$Could_not_find___schemaFieldNameL;
  private static final SubLSymbol $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL;
  private static final SubLString $str68$The_expression__A_is_supposed_to_;
  private static final SubLSymbol $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD;
  private static final SubLString $str70$Field__A_is_required_to_have_only;
  private static final SubLObject $const71$SetOfValuesOfFn;
  private static final SubLSymbol $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD;
  private static final SubLObject $const73$fieldEncodingWRTKS;
  private static final SubLSymbol $sym74$DECODING_FOR_INPUT_LFI;
  private static final SubLString $str75$_A_should_only_have_one_decoding_;
  private static final SubLSymbol $sym76$GAF_FORMULAS_EQ;
  private static final SubLString $str77$Field_indexical__A_is_required_to;
  private static final SubLObject $const78$kSHasQueryForLogicalFieldIndexica;
  private static final SubLObject $const79$valueFromColumnInSKS;
  private static final SubLObject $const80$queryHasFocalOutputVariablePositi;
  private static final SubLList $list81;
  private static final SubLList $list82;
  private static final SubLObject $const83$queryHasFocalInputVariablePositio;
  private static final SubLObject $const84$queryHasFocalOutputVariablePositi;
  private static final SubLString $str85$Column__D_in__A_doesn_t_correspon;
  private static final SubLList $list86;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 1205L)
  public static SubLObject reportgen_output_rows_from_input_row(final SubLObject input_row, final SubLObject ks, SubLObject placeholder)
  {
    if( placeholder == UNPROVIDED )
    {
      placeholder = $str3$_;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_run_column_query();
    SubLObject result = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject entities = focal_entities_from_input_row( input_row, ks );
      if( NIL == entities )
      {
        result = $list4;
      }
      else
      {
        SubLObject cdolist_list_var = entities;
        SubLObject entity = NIL;
        entity = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.append( output_rows_from_entity( entity, input_row, ks, placeholder ), result );
          cdolist_list_var = cdolist_list_var.rest();
          entity = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 2080L)
  public static SubLObject reportgen_source_mapping_mt(final SubLObject ks, SubLObject already_checked)
  {
    if( already_checked == UNPROVIDED )
    {
      already_checked = NIL;
    }
    SubLObject result = sksi_kb_accessors.sk_source_mapping_mt( ks );
    if( NIL == result )
    {
      if( NIL != set.set_p( already_checked ) )
      {
        set.set_add( ks, already_checked );
      }
      else
      {
        already_checked = set_utilities.new_singleton_set( ks, Symbols.symbol_function( EQUAL ) );
      }
      final SubLObject source_template = reportgen_report_from_variant( ks );
      if( NIL != source_template && NIL != set.set_add( source_template, already_checked ) )
      {
        result = reportgen_source_mapping_mt( source_template, already_checked );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 2604L)
  public static SubLObject reportgen_report_from_variant(final SubLObject variant)
  {
    return kb_mapping_utilities.fpred_value_in_any_mt( variant, $const5$reportHasVariant, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 2727L)
  public static SubLObject output_rows_from_entity(final SubLObject entity, final SubLObject input_row, final SubLObject ks, SubLObject placeholder)
  {
    if( placeholder == UNPROVIDED )
    {
      placeholder = $str3$_;
    }
    final SubLObject pf_list = reportgen_schema_field_list( ks );
    SubLObject result = NIL;
    final SubLObject exclusivity_states = get_fresh_exclusivity_states( ks );
    SubLObject cdolist_list_var = pf_list;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject values = values_for_pf( pf, entity, input_row, ks, exclusivity_states );
      if( NIL == values )
      {
        result = ConsesLow.cons( ConsesLow.list( placeholder ), result );
      }
      else
      {
        result = ConsesLow.cons( list_utilities.fast_delete_duplicates( values, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    result = Sequences.nreverse( result );
    return reportgen_cartesian_product( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 4651L)
  public static SubLObject focal_entities_from_input_row(final SubLObject input_row, final SubLObject ks)
  {
    final SubLObject base_query = base_query_from_ks( ks );
    final SubLObject sentence = get_bound_base_query_sentence( ks, input_row );
    final SubLObject var = cycl_utilities.formula_cycl_arg_position( sentence, result_argpos_in_base_query( ks ), UNPROVIDED );
    return ask_utilities.query_variable( var, sentence, kb_query.kbq_mt( base_query ), kb_query.kbq_query_properties( base_query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 5182L)
  public static SubLObject get_bound_base_query_sentence(final SubLObject report_ks, final SubLObject input_row)
  {
    final SubLObject base_query = base_query_from_ks( report_ks );
    final SubLObject input_ks = input_ks_from_report_ks( report_ks );
    return cycl_utilities.expression_sublis( get_free_vars_with_values( base_query, input_row, input_ks ), kb_query.kbq_sentence( base_query ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 6162L)
  public static SubLObject get_free_vars_with_values(final SubLObject base_query, final SubLObject input_row, final SubLObject input_ks)
  {
    final SubLObject argposes_lfis_alist = get_argposes_and_lfis_for_base_query( base_query, input_ks );
    SubLObject result_alist = NIL;
    SubLObject cdolist_list_var = argposes_lfis_alist;
    SubLObject argpos_lfi_pair = NIL;
    argpos_lfi_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result_alist = conses_high.acons( cycl_utilities.formula_cycl_arg_position( kb_query.kbq_sentence( base_query ), argpos_lfi_pair.first(), UNPROVIDED ), evaluate_lfi_from_input_row( argpos_lfi_pair.rest(),
          input_row, input_ks ), result_alist );
      cdolist_list_var = cdolist_list_var.rest();
      argpos_lfi_pair = cdolist_list_var.first();
    }
    return result_alist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 6822L)
  public static SubLObject evaluate_lfi_from_input_row(final SubLObject lfi, final SubLObject input_row, final SubLObject input_ks)
  {
    final SubLObject decoding = decoding_for_input_lfi( lfi, input_ks );
    final SubLObject pfis_values_alist = conses_high.pairlis( sksi_kb_accessors.physical_fields_to_indexicals( reportgen_schema_field_list( input_ks ) ), input_row, UNPROVIDED );
    return sksi_field_translation_utilities.sksi_apply_decoding_and_reformulate( pfis_values_alist, decoding, input_ks, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 7163L)
  public static SubLObject get_argposes_and_lfis_for_base_query_internal(final SubLObject base_query, final SubLObject input_ks)
  {
    return ask_utilities.query_template( $list7, ConsesLow.listS( $const8$queryNeedsThingBoundInPosition, base_query, $list9 ), reportgen_source_mapping_mt( input_ks, UNPROVIDED ), $list10 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 7163L)
  public static SubLObject get_argposes_and_lfis_for_base_query(final SubLObject base_query, final SubLObject input_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_argposes_and_lfis_for_base_query_internal( base_query, input_ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( base_query, input_ks );
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
        if( base_query.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && input_ks.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_argposes_and_lfis_for_base_query_internal( base_query, input_ks ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( base_query, input_ks ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 7478L)
  public static SubLObject query_variable_using_query_function(final SubLObject var, final SubLObject sentence, final SubLObject query_fn, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject all_bindings = Functions.funcall( query_fn, sentence, mt, query_properties );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject answers_for_var = NIL;
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pair = conses_high.assoc( var, binding, UNPROVIDED, UNPROVIDED );
      if( NIL != pair )
      {
        answers_for_var = ConsesLow.cons( pair.rest(), answers_for_var );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    return Values.values( list_utilities.fast_delete_duplicates( answers_for_var, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), halt_reason );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8291L)
  public static SubLObject clear_run_column_query()
  {
    final SubLObject cs = $run_column_query_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8291L)
  public static SubLObject remove_run_column_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $run_column_query_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt, query_properties ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8291L)
  public static SubLObject run_column_query_internal(final SubLObject sentence, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLObject new_query_properties = conses_high.putf( conses_high.copy_list( query_properties ), $kw12$RETURN, $kw13$BINDINGS );
    return inference_kernel.new_cyc_query( sentence, mt, new_query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8291L)
  public static SubLObject run_column_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    SubLObject caching_state = $run_column_query_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym11$RUN_COLUMN_QUERY, $sym14$_RUN_COLUMN_QUERY_CACHING_STATE_, $int15$100, EQUAL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, query_properties );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && query_properties.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( run_column_query_internal( sentence, mt, query_properties ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, query_properties ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 8961L)
  public static SubLObject reportgen_schema_field_name_list(final SubLObject ks)
  {
    return reportgen_schema_field_name_list_int( ks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 9749L)
  public static SubLObject reportgen_schema_field_name_list_int(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = reportgen_physical_schema_field_name_list( reportgen_physical_schema_from_knowledge_source( ks ), ks );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 10172L)
  public static SubLObject reportgen_physical_schema_field_name_list(final SubLObject schema, final SubLObject ks)
  {
    SubLObject result = sksi_kb_accessors.physical_schema_field_name_list( schema );
    final SubLObject source_template = reportgen_report_from_variant( ks );
    if( NIL != source_template )
    {
      final SubLObject pred_var = $const17$reportLFIHasFieldName;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( ks, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( ks, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw18$GAF, $kw19$TRUE, NIL );
              SubLObject done_var_$1 = NIL;
              final SubLObject token_var_$2 = NIL;
              while ( NIL == done_var_$1)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( gaf ) );
                if( NIL != valid_$3 )
                {
                  SubLObject current;
                  final SubLObject datum = current = assertions_high.gaf_args( gaf ).rest();
                  SubLObject lfi = NIL;
                  SubLObject new_name = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                  lfi = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
                  new_name = current.first();
                  current = current.rest();
                  if( NIL == current )
                  {
                    SubLObject old_name = NIL;
                    final SubLObject pred_var_$4 = $const21$logicalFieldValueWithFieldName;
                    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( lfi, THREE_INTEGER, pred_var_$4 ) )
                    {
                      final SubLObject iterator_var_$5 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( lfi, THREE_INTEGER, pred_var_$4 );
                      SubLObject done_var_$2 = NIL;
                      final SubLObject token_var_$3 = NIL;
                      while ( NIL == done_var_$2)
                      {
                        final SubLObject final_index_spec_$8 = iteration.iteration_next_without_values_macro_helper( iterator_var_$5, token_var_$3 );
                        final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( final_index_spec_$8 ) );
                        if( NIL != valid_$4 )
                        {
                          SubLObject final_index_iterator_$10 = NIL;
                          try
                          {
                            final_index_iterator_$10 = kb_mapping_macros.new_final_index_iterator( final_index_spec_$8, $kw18$GAF, NIL, NIL );
                            SubLObject done_var_$3 = NIL;
                            final SubLObject token_var_$4 = NIL;
                            while ( NIL == done_var_$3)
                            {
                              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator_$10, token_var_$4 );
                              final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( assertion ) );
                              if( NIL != valid_$5 )
                              {
                                old_name = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                                result = conses_high.nsubst( new_name, old_name, result, Symbols.symbol_function( EQUAL ), UNPROVIDED );
                              }
                              done_var_$3 = makeBoolean( NIL == valid_$5 );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                            try
                            {
                              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                              final SubLObject _values = Values.getValuesAsVector();
                              if( NIL != final_index_iterator_$10 )
                              {
                                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator_$10 );
                              }
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
                            }
                          }
                        }
                        done_var_$2 = makeBoolean( NIL == valid_$4 );
                      }
                    }
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
                  }
                }
                done_var_$1 = makeBoolean( NIL == valid_$3 );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 10717L)
  public static SubLObject reportgen_input_doc_field_name_list(final SubLObject report_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( report_ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = reportgen_schema_field_name_list_int( input_ks_from_report_ks( report_ks ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject reportgen_exclusivity_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_exc_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject reportgen_exclusivity_state_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$reportgen_exclusivity_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject exc_state_phys_fields(final SubLObject v_object)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject exc_state_exc_value(final SubLObject v_object)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject exc_state_default_value(final SubLObject v_object)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject exc_state_satisfied_yetP(final SubLObject v_object)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject _csetf_exc_state_phys_fields(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject _csetf_exc_state_exc_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject _csetf_exc_state_default_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject _csetf_exc_state_satisfied_yetP(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reportgen_exclusivity_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject make_reportgen_exclusivity_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $reportgen_exclusivity_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw40$PHYS_FIELDS ) )
      {
        _csetf_exc_state_phys_fields( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$EXC_VALUE ) )
      {
        _csetf_exc_state_exc_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$DEFAULT_VALUE ) )
      {
        _csetf_exc_state_default_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$SATISFIED_YET_ ) )
      {
        _csetf_exc_state_satisfied_yetP( v_new, current_value );
      }
      else
      {
        Errors.error( $str44$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject visit_defstruct_reportgen_exclusivity_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw45$BEGIN, $sym46$MAKE_REPORTGEN_EXCLUSIVITY_STATE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw40$PHYS_FIELDS, exc_state_phys_fields( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw41$EXC_VALUE, exc_state_exc_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw42$DEFAULT_VALUE, exc_state_default_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw47$SLOT, $kw43$SATISFIED_YET_, exc_state_satisfied_yetP( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$END, $sym46$MAKE_REPORTGEN_EXCLUSIVITY_STATE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11146L)
  public static SubLObject visit_defstruct_object_reportgen_exclusivity_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_reportgen_exclusivity_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11564L)
  public static SubLObject print_exc_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str50$__a_EXCLUSIVITY_STATE__a__a__a_, new SubLObject[] { exc_state_satisfied_yetP( v_object ), exc_state_exc_value( v_object ), exc_state_default_value( v_object ), exc_state_phys_fields(
        v_object )
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 11840L)
  public static SubLObject get_fresh_exclusivity_states(final SubLObject ks)
  {
    final SubLObject exclusivity_gafs = get_mutually_exclusive_field_gafs( ks );
    SubLObject fresh_states = NIL;
    SubLObject cdolist_list_var = exclusivity_gafs;
    SubLObject gaf = NIL;
    gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject boolean_exc_value = assertions_high.gaf_arg2( gaf );
      fresh_states = ConsesLow.cons( make_reportgen_exclusivity_state( ConsesLow.listS( $kw40$PHYS_FIELDS, new SubLObject[] { cycl_utilities.formula_args( assertions_high.gaf_arg3( gaf ), UNPROVIDED ), $kw41$EXC_VALUE,
        get_default_boolean_string_for_ks( ks, boolean_exc_value ), $kw42$DEFAULT_VALUE, get_default_boolean_string_for_ks( ks, opposite_boolean_constant( boolean_exc_value ) ), $list51
      } ) ), fresh_states );
      cdolist_list_var = cdolist_list_var.rest();
      gaf = cdolist_list_var.first();
    }
    return Sequences.nreverse( fresh_states );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 12472L)
  public static SubLObject values_for_pf(final SubLObject pf, final SubLObject entity, final SubLObject input_row, final SubLObject ks, final SubLObject exclusivity_states)
  {
    final SubLObject values_from_exclusivity = values_for_pf_from_exclusivity_states( pf, exclusivity_states );
    if( NIL != values_from_exclusivity )
    {
      return values_from_exclusivity;
    }
    final SubLObject final_values = values_from_encoding_expressions( reportgen_encoding_expressions_from_physical_field( pf, ks ), ks, entity, input_row );
    if( NIL == list_utilities.singletonP( final_values ) )
    {
      return final_values;
    }
    nupdate_exclusivity_states( pf, final_values.first(), exclusivity_states );
    return final_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 13270L)
  public static SubLObject nupdate_exclusivity_states(final SubLObject pf, final SubLObject value, final SubLObject exclusivity_states)
  {
    SubLObject cdolist_list_var = exclusivity_states;
    SubLObject state = NIL;
    state = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == exc_state_satisfied_yetP( state ) && NIL != conses_high.member( pf, exc_state_phys_fields( state ), Symbols.symbol_function( EQ ), UNPROVIDED ) && value.equal( exc_state_exc_value( state ) ) )
      {
        _csetf_exc_state_satisfied_yetP( state, T );
      }
      cdolist_list_var = cdolist_list_var.rest();
      state = cdolist_list_var.first();
    }
    return exclusivity_states;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 14670L)
  public static SubLObject values_for_pf_from_exclusivity_states(final SubLObject pf, final SubLObject exclusivity_states)
  {
    SubLObject cdolist_list_var = exclusivity_states;
    SubLObject state = NIL;
    state = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != exc_state_satisfied_yetP( state ) && NIL != conses_high.member( pf, exc_state_phys_fields( state ), Symbols.symbol_function( EQ ), UNPROVIDED ) )
      {
        return ConsesLow.list( exc_state_default_value( state ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      state = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15131L)
  public static SubLObject get_mutually_exclusive_field_gafs_internal(final SubLObject ks)
  {
    return kb_mapping_utilities.pred_value_gafs( reportgen_physical_schema_from_knowledge_source( ks ), $const53$mutuallyExclusiveSchemaFieldListW, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15131L)
  public static SubLObject get_mutually_exclusive_field_gafs(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_mutually_exclusive_field_gafs_internal( ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_mutually_exclusive_field_gafs_internal( ks ) ) );
      memoization_state.caching_state_put( caching_state, ks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15423L)
  public static SubLObject get_default_boolean_string_for_ks_internal(final SubLObject ks, final SubLObject bool_value)
  {
    return kb_mapping_utilities.pred_arg_values( ks, $const55$defaultBooleanStringsForKS, bool_value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15423L)
  public static SubLObject get_default_boolean_string_for_ks(final SubLObject ks, final SubLObject bool_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return get_default_boolean_string_for_ks_internal( ks, bool_value );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( ks, bool_value );
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
        if( ks.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && bool_value.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( get_default_boolean_string_for_ks_internal( ks, bool_value ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( ks, bool_value ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15607L)
  public static SubLObject opposite_boolean_constant(final SubLObject constant)
  {
    return constant.eql( $const56$True ) ? $const57$False : $const56$True;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15790L)
  public static SubLObject input_ks_from_report_ks_internal(final SubLObject ks)
  {
    return kb_mapping_utilities.fpred_value( ks, $const59$derivedFromInput, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 15790L)
  public static SubLObject input_ks_from_report_ks(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return input_ks_from_report_ks_internal( ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym58$INPUT_KS_FROM_REPORT_KS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym58$INPUT_KS_FROM_REPORT_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym58$INPUT_KS_FROM_REPORT_KS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( input_ks_from_report_ks_internal( ks ) ) );
      memoization_state.caching_state_put( caching_state, ks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 16027L)
  public static SubLObject base_query_from_ks_internal(final SubLObject ks)
  {
    return kb_mapping_utilities.fpred_value( ks, $const61$baseQueryForReportType, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 16027L)
  public static SubLObject base_query_from_ks(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return base_query_from_ks_internal( ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym60$BASE_QUERY_FROM_KS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym60$BASE_QUERY_FROM_KS, ONE_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym60$BASE_QUERY_FROM_KS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( base_query_from_ks_internal( ks ) ) );
      memoization_state.caching_state_put( caching_state, ks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 16249L)
  public static SubLObject result_argpos_in_base_query_internal(final SubLObject ks)
  {
    return kb_mapping_utilities.fpred_value( base_query_from_ks( ks ), $const63$baseQueryUsesAnswersInPosition, ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 16249L)
  public static SubLObject result_argpos_in_base_query(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return result_argpos_in_base_query_internal( ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym62$RESULT_ARGPOS_IN_BASE_QUERY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym62$RESULT_ARGPOS_IN_BASE_QUERY, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym62$RESULT_ARGPOS_IN_BASE_QUERY, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, ks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( result_argpos_in_base_query_internal( ks ) ) );
      memoization_state.caching_state_put( caching_state, ks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 16581L)
  public static SubLObject reportgen_physical_schema_from_knowledge_source(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject schemata = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      schemata = sksi_kb_accessors.sk_source_physical_schemata( ks );
      final SubLObject source_template = reportgen_report_from_variant( ks );
      if( NIL != source_template )
      {
        final SubLObject items_var = sksi_kb_accessors.sk_source_physical_schemata( source_template );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            schemata = ConsesLow.cons( item, schemata );
          }
        }
        else
        {
          SubLObject cdolist_list_var = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            schemata = ConsesLow.cons( item2, schemata );
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    schemata = list_utilities.fast_remove_duplicates( schemata, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( schemata ) )
    {
      Errors.error( $str64$_A_is_not_an_appropriate_knowledg, ks );
    }
    return schemata.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 17471L)
  public static SubLObject reportgen_logical_schema_from_knowledge_source(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject schemata = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      schemata = sksi_kb_accessors.sk_source_logical_schemata( ks );
      final SubLObject source_template = reportgen_report_from_variant( ks );
      if( NIL != source_template )
      {
        final SubLObject items_var = sksi_kb_accessors.sk_source_logical_schemata( source_template );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = Vectors.aref( vector_var, element_num );
            schemata = ConsesLow.cons( item, schemata );
          }
        }
        else
        {
          SubLObject cdolist_list_var = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            schemata = ConsesLow.cons( item2, schemata );
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    schemata = list_utilities.fast_remove_duplicates( schemata, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( schemata ) )
    {
      Errors.error( $str65$_A_is_not_an_appropriate_knowledg, ks );
    }
    return schemata.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 18122L)
  public static SubLObject reportgen_schema_field_list(final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = reportgen_physical_schema_ordered_field_list( reportgen_physical_schema_from_knowledge_source( ks ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == result )
    {
      Errors.error( $str66$Could_not_find___schemaFieldNameL, reportgen_physical_schema_from_knowledge_source( ks ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 18610L)
  public static SubLObject reportgen_physical_schema_ordered_field_list(final SubLObject physical_schema)
  {
    final SubLObject result = sksi_kb_accessors.physical_schema_ordered_field_list( physical_schema );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 18783L)
  public static SubLObject encoding_logical_field_indexical_internal(final SubLObject expr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals( expr );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.exactly_one_distinct_memberP( lfis, UNPROVIDED ) )
    {
      Errors.error( $str68$The_expression__A_is_supposed_to_, expr );
    }
    return lfis.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 18783L)
  public static SubLObject encoding_logical_field_indexical(final SubLObject expr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return encoding_logical_field_indexical_internal( expr );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, expr, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( encoding_logical_field_indexical_internal( expr ) ) );
      memoization_state.caching_state_put( caching_state, expr, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 19793L)
  public static SubLObject reportgen_encoding_expression_from_physical_field_internal(final SubLObject pf, final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject exprs = reportgen_encoding_expressions_from_physical_field( pf, ks );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.exactly_one_distinct_memberP( exprs, UNPROVIDED ) )
    {
      Errors.error( $str70$Field__A_is_required_to_have_only, pf, Sequences.length( list_utilities.fast_remove_duplicates( exprs, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    }
    final SubLObject encoding_expression = exprs.first();
    final SubLObject lfi = encoding_logical_field_indexical( encoding_expression );
    final SubLObject set_of_values_expression = el_utilities.make_unary_formula( $const71$SetOfValuesOfFn, lfi );
    final SubLObject collect_multiple_valuesP = list_utilities.sublisp_boolean( cycl_utilities.expression_find( set_of_values_expression, encoding_expression, T, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    final SubLObject modified_encoding_expression = cycl_utilities.expression_subst( lfi, set_of_values_expression, encoding_expression, Symbols.symbol_function( EQUALP ), UNPROVIDED );
    return Values.values( modified_encoding_expression, collect_multiple_valuesP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 19793L)
  public static SubLObject reportgen_encoding_expression_from_physical_field(final SubLObject pf, final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return reportgen_encoding_expression_from_physical_field_internal( pf, ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pf, ks );
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
        if( pf.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ks.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( reportgen_encoding_expression_from_physical_field_internal( pf, ks ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pf, ks ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 20864L)
  public static SubLObject reportgen_encoding_expressions_from_physical_field_internal(final SubLObject pf, final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ps = reportgen_physical_schema_from_knowledge_source( ks );
    final SubLObject ls = reportgen_logical_schema_from_knowledge_source( ks );
    SubLObject direct_encoding_expressions = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field( pf );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_u_v_holds_gafs( $const73$fieldEncodingWRTKS, ks, ps, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject gaf = NIL;
      gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( pfi.eql( assertions_high.gaf_arg3( gaf ) ) && ls.eql( assertions_high.gaf_arg4( gaf ) ) )
        {
          direct_encoding_expressions = ConsesLow.cons( assertions_high.gaf_arg5( gaf ), direct_encoding_expressions );
        }
        cdolist_list_var = cdolist_list_var.rest();
        gaf = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != direct_encoding_expressions )
    {
      return direct_encoding_expressions;
    }
    final SubLObject source_template = reportgen_report_from_variant( ks );
    return ( NIL != source_template ) ? reportgen_encoding_expressions_from_physical_field( pf, source_template ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 20864L)
  public static SubLObject reportgen_encoding_expressions_from_physical_field(final SubLObject pf, final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return reportgen_encoding_expressions_from_physical_field_internal( pf, ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, TWO_INTEGER, NIL, EQ,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pf, ks );
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
        if( pf.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && ks.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( reportgen_encoding_expressions_from_physical_field_internal( pf, ks ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pf, ks ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 21830L)
  public static SubLObject decoding_for_input_lfi_internal(final SubLObject lfi, final SubLObject input_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject decodings = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( input_ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      decodings = list_utilities.fast_remove_duplicates( sksi_field_translation_utilities.relevant_field_decodings_for_indexical( lfi, ConsesLow.list( reportgen_logical_schema_from_knowledge_source( input_ks ) ),
          ConsesLow.list( reportgen_physical_schema_from_knowledge_source( input_ks ) ) ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( decodings ) )
      {
        Errors.error( $str75$_A_should_only_have_one_decoding_, lfi, input_ks );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return decodings.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 21830L)
  public static SubLObject decoding_for_input_lfi(final SubLObject lfi, final SubLObject input_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return decoding_for_input_lfi_internal( lfi, input_ks );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym74$DECODING_FOR_INPUT_LFI, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym74$DECODING_FOR_INPUT_LFI, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym74$DECODING_FOR_INPUT_LFI, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( lfi, input_ks );
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
        if( lfi.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && input_ks.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( decoding_for_input_lfi_internal( lfi, input_ks ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( lfi, input_ks ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 22406L)
  public static SubLObject query_lfi_gaf_from_logical_indexical(final SubLObject lfi, final SubLObject ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gafs = query_lfi_gafs_from_logical_indexical( lfi, ks );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.exactly_one_distinct_memberP( gafs, Symbols.symbol_function( $sym76$GAF_FORMULAS_EQ ) ) )
    {
      Errors.error( $str77$Field_indexical__A_is_required_to, lfi, Sequences.length( list_utilities.fast_remove_duplicates( gafs, Symbols.symbol_function( $sym76$GAF_FORMULAS_EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) ) );
    }
    return gafs.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 23009L)
  public static SubLObject gaf_formulas_eq(final SubLObject gaf1, final SubLObject gaf2)
  {
    return Equality.eq( assertions_high.gaf_formula( gaf1 ), assertions_high.gaf_formula( gaf2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 23110L)
  public static SubLObject query_lfi_gafs_from_logical_indexical(final SubLObject lfi, final SubLObject ks)
  {
    final SubLObject directly_asserted = kb_mapping_utilities.pred_u_v_holds_gafs( $const78$kSHasQueryForLogicalFieldIndexica, ks, lfi, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject source_template = reportgen_report_from_variant( ks );
    return ( NIL != directly_asserted ) ? directly_asserted : ( ( NIL != source_template ) ? query_lfi_gafs_from_logical_indexical( lfi, source_template ) : NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 23519L)
  public static SubLObject input_columns_from_logical_indexical(final SubLObject lfi, final SubLObject input_ks)
  {
    return kb_mapping_utilities.pred_arg_values( lfi, $const79$valueFromColumnInSKS, input_ks, TWO_INTEGER, ONE_INTEGER, THREE_INTEGER, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 23917L)
  public static SubLObject nbind_into_sentence(final SubLObject sentence, final SubLObject cycl_arg_pos, final SubLObject obj)
  {
    return cycl_utilities.expression_nsubst( obj, cycl_utilities.formula_cycl_arg_position( sentence, cycl_arg_pos, UNPROVIDED ), sentence, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 24794L)
  public static SubLObject bind_into_query_sentence(final SubLObject kbquery, final SubLObject cycl_arg_pos, final SubLObject obj)
  {
    return nbind_into_sentence( el_utilities.copy_expression( kb_query.kbq_sentence( kbquery ) ), cycl_arg_pos, obj );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 25149L)
  public static SubLObject convert_to_boolean_kb_constant(final SubLObject x)
  {
    return ( NIL != x ) ? $const56$True : $const57$False;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 25302L)
  public static SubLObject query_lfi_gaf_for_closed_queryP(final SubLObject gaf)
  {
    final SubLObject query = assertions_high.gaf_arg3( gaf );
    return Equality.equal( kb_mapping_utilities.fpred_value_in_any_mt( query, $const80$queryHasFocalOutputVariablePositi, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $list81 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 25673L)
  public static SubLObject answers_from_ks_has_query_for_lfi_gaf(final SubLObject query_lfi_gaf, final SubLObject entity)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( query_lfi_gaf, UNPROVIDED );
    SubLObject ks = NIL;
    SubLObject lfi = NIL;
    SubLObject final_query = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    ks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    lfi = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    final_query = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject input_argpos = kb_mapping_utilities.fpred_value_in_any_mt( final_query, $const83$queryHasFocalInputVariablePositio, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject output_argpos = kb_mapping_utilities.fpred_value_in_any_mt( final_query, $const84$queryHasFocalOutputVariablePositi, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject new_query_sentence = bind_into_query_sentence( final_query, input_argpos, entity );
      final SubLObject mt = kb_query.kbq_mt( final_query );
      final SubLObject props = kb_query.kbq_query_properties( final_query );
      return ( NIL != query_lfi_gaf_for_closed_queryP( query_lfi_gaf ) ) ? ConsesLow.list( convert_to_boolean_kb_constant( run_column_query( new_query_sentence, mt, props ) ) )
          : query_variable_using_query_function( cycl_utilities.formula_cycl_arg_position( new_query_sentence, output_argpos, UNPROVIDED ), new_query_sentence, Symbols.symbol_function( $sym11$RUN_COLUMN_QUERY ), mt,
              props );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list82 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 27038L)
  public static SubLObject answers_from_lfi(final SubLObject lfi, final SubLObject ks, final SubLObject entity, final SubLObject original_input_list)
  {
    final SubLObject query_lfi_gafs = query_lfi_gafs_from_logical_indexical( lfi, ks );
    if( NIL != query_lfi_gafs )
    {
      SubLObject answers = NIL;
      SubLObject cdolist_list_var = query_lfi_gafs;
      SubLObject query_lfi_gaf = NIL;
      query_lfi_gaf = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        answers = ConsesLow.append( answers, answers_from_ks_has_query_for_lfi_gaf( query_lfi_gaf, entity ) );
        cdolist_list_var = cdolist_list_var.rest();
        query_lfi_gaf = cdolist_list_var.first();
      }
      return answers;
    }
    final SubLObject column_nos = input_columns_from_logical_indexical( lfi, input_ks_from_report_ks( ks ) );
    SubLObject answers2 = NIL;
    SubLObject cdolist_list_var2 = column_nos;
    SubLObject column_no = NIL;
    column_no = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      answers2 = ConsesLow.cons( translate_input_column_no( original_input_list, column_no, input_ks_from_report_ks( ks ) ), answers2 );
      cdolist_list_var2 = cdolist_list_var2.rest();
      column_no = cdolist_list_var2.first();
    }
    return Sequences.nreverse( answers2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 27946L)
  public static SubLObject translate_input_column_no(final SubLObject original_input_list, final SubLObject column_no, final SubLObject input_ks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = reportgen_source_mapping_mt( input_ks, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      SubLObject logical_fields = sksi_kb_accessors.sksi_get_decoding_mapped_logical_fields_for_physical_field( ConsesLow.nth( Numbers.subtract( column_no, ONE_INTEGER ), reportgen_schema_field_list( input_ks ) ) );
      logical_fields = list_utilities.fast_remove_duplicates( logical_fields, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( logical_fields ) )
      {
        Errors.error( $str85$Column__D_in__A_doesn_t_correspon, column_no, input_ks );
      }
      result = evaluate_lfi_from_input_row( sksi_kb_accessors.indexical_for_logical_field( logical_fields.first() ), original_input_list, input_ks );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 29076L)
  public static SubLObject values_from_encoding_expressions(final SubLObject exprs, final SubLObject ks, final SubLObject entity, final SubLObject original_input_list)
  {
    SubLObject final_values = NIL;
    SubLObject cdolist_list_var = exprs;
    SubLObject expr = NIL;
    expr = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals( expr );
      SubLObject cart_prod = NIL;
      SubLObject all_answers_for_each_lfi = NIL;
      SubLObject no_answers = NIL;
      if( NIL == no_answers )
      {
        SubLObject csome_list_var = lfis;
        SubLObject lfi = NIL;
        lfi = csome_list_var.first();
        while ( NIL == no_answers && NIL != csome_list_var)
        {
          final SubLObject answers = answers_from_lfi( lfi, ks, entity, original_input_list );
          if( NIL == answers )
          {
            no_answers = T;
          }
          else
          {
            all_answers_for_each_lfi = ConsesLow.cons( list_utilities.fast_delete_duplicates( answers, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), all_answers_for_each_lfi );
          }
          csome_list_var = csome_list_var.rest();
          lfi = csome_list_var.first();
        }
      }
      if( NIL == no_answers )
      {
        all_answers_for_each_lfi = Sequences.nreverse( all_answers_for_each_lfi );
        SubLObject cdolist_list_var_$14;
        cart_prod = ( cdolist_list_var_$14 = reportgen_cartesian_product( all_answers_for_each_lfi ) );
        SubLObject values = NIL;
        values = cdolist_list_var_$14.first();
        while ( NIL != cdolist_list_var_$14)
        {
          final_values = ConsesLow.cons( sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate( conses_high.pairlis( lfis, values, UNPROVIDED ), expr, ks, UNPROVIDED ), final_values );
          cdolist_list_var_$14 = cdolist_list_var_$14.rest();
          values = cdolist_list_var_$14.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      expr = cdolist_list_var.first();
    }
    return final_values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/report-generation/sksi-report-generation.lisp", position = 30320L)
  public static SubLObject reportgen_cartesian_product(final SubLObject lists)
  {
    if( NIL == lists )
    {
      return $list86;
    }
    final SubLObject first_list = lists.first();
    final SubLObject cartesian_rest = reportgen_cartesian_product( lists.rest() );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = first_list;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$15 = cartesian_rest;
      SubLObject current_list = NIL;
      current_list = cdolist_list_var_$15.first();
      while ( NIL != cdolist_list_var_$15)
      {
        result = ConsesLow.cons( ConsesLow.cons( item, current_list ), result );
        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
        current_list = cdolist_list_var_$15.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return result;
  }

  public static SubLObject declare_sksi_report_generation_file()
  {
    SubLFiles.declareFunction( me, "reportgen_output_rows_from_input_row", "REPORTGEN-OUTPUT-ROWS-FROM-INPUT-ROW", 2, 1, false );
    SubLFiles.declareFunction( me, "reportgen_source_mapping_mt", "REPORTGEN-SOURCE-MAPPING-MT", 1, 1, false );
    SubLFiles.declareFunction( me, "reportgen_report_from_variant", "REPORTGEN-REPORT-FROM-VARIANT", 1, 0, false );
    SubLFiles.declareFunction( me, "output_rows_from_entity", "OUTPUT-ROWS-FROM-ENTITY", 3, 1, false );
    SubLFiles.declareFunction( me, "focal_entities_from_input_row", "FOCAL-ENTITIES-FROM-INPUT-ROW", 2, 0, false );
    SubLFiles.declareFunction( me, "get_bound_base_query_sentence", "GET-BOUND-BASE-QUERY-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_free_vars_with_values", "GET-FREE-VARS-WITH-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "evaluate_lfi_from_input_row", "EVALUATE-LFI-FROM-INPUT-ROW", 3, 0, false );
    SubLFiles.declareFunction( me, "get_argposes_and_lfis_for_base_query_internal", "GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_argposes_and_lfis_for_base_query", "GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY", 2, 0, false );
    SubLFiles.declareFunction( me, "query_variable_using_query_function", "QUERY-VARIABLE-USING-QUERY-FUNCTION", 3, 2, false );
    SubLFiles.declareFunction( me, "clear_run_column_query", "CLEAR-RUN-COLUMN-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_run_column_query", "REMOVE-RUN-COLUMN-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "run_column_query_internal", "RUN-COLUMN-QUERY-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "run_column_query", "RUN-COLUMN-QUERY", 1, 2, false );
    SubLFiles.declareFunction( me, "reportgen_schema_field_name_list", "REPORTGEN-SCHEMA-FIELD-NAME-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_schema_field_name_list_int", "REPORTGEN-SCHEMA-FIELD-NAME-LIST-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_physical_schema_field_name_list", "REPORTGEN-PHYSICAL-SCHEMA-FIELD-NAME-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "reportgen_input_doc_field_name_list", "REPORTGEN-INPUT-DOC-FIELD-NAME-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_exclusivity_state_print_function_trampoline", "REPORTGEN-EXCLUSIVITY-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "reportgen_exclusivity_state_p", "REPORTGEN-EXCLUSIVITY-STATE-P", 1, 0, false );
    new $reportgen_exclusivity_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "exc_state_phys_fields", "EXC-STATE-PHYS-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "exc_state_exc_value", "EXC-STATE-EXC-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "exc_state_default_value", "EXC-STATE-DEFAULT-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "exc_state_satisfied_yetP", "EXC-STATE-SATISFIED-YET?", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_exc_state_phys_fields", "_CSETF-EXC-STATE-PHYS-FIELDS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_exc_state_exc_value", "_CSETF-EXC-STATE-EXC-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_exc_state_default_value", "_CSETF-EXC-STATE-DEFAULT-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_exc_state_satisfied_yetP", "_CSETF-EXC-STATE-SATISFIED-YET?", 2, 0, false );
    SubLFiles.declareFunction( me, "make_reportgen_exclusivity_state", "MAKE-REPORTGEN-EXCLUSIVITY-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_reportgen_exclusivity_state", "VISIT-DEFSTRUCT-REPORTGEN-EXCLUSIVITY-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_reportgen_exclusivity_state_method", "VISIT-DEFSTRUCT-OBJECT-REPORTGEN-EXCLUSIVITY-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_exc_state", "PRINT-EXC-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "get_fresh_exclusivity_states", "GET-FRESH-EXCLUSIVITY-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "values_for_pf", "VALUES-FOR-PF", 5, 0, false );
    SubLFiles.declareFunction( me, "nupdate_exclusivity_states", "NUPDATE-EXCLUSIVITY-STATES", 3, 0, false );
    SubLFiles.declareFunction( me, "values_for_pf_from_exclusivity_states", "VALUES-FOR-PF-FROM-EXCLUSIVITY-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_mutually_exclusive_field_gafs_internal", "GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_mutually_exclusive_field_gafs", "GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_default_boolean_string_for_ks_internal", "GET-DEFAULT-BOOLEAN-STRING-FOR-KS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_default_boolean_string_for_ks", "GET-DEFAULT-BOOLEAN-STRING-FOR-KS", 2, 0, false );
    SubLFiles.declareFunction( me, "opposite_boolean_constant", "OPPOSITE-BOOLEAN-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "input_ks_from_report_ks_internal", "INPUT-KS-FROM-REPORT-KS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "input_ks_from_report_ks", "INPUT-KS-FROM-REPORT-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "base_query_from_ks_internal", "BASE-QUERY-FROM-KS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "base_query_from_ks", "BASE-QUERY-FROM-KS", 1, 0, false );
    SubLFiles.declareFunction( me, "result_argpos_in_base_query_internal", "RESULT-ARGPOS-IN-BASE-QUERY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "result_argpos_in_base_query", "RESULT-ARGPOS-IN-BASE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_physical_schema_from_knowledge_source", "REPORTGEN-PHYSICAL-SCHEMA-FROM-KNOWLEDGE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_logical_schema_from_knowledge_source", "REPORTGEN-LOGICAL-SCHEMA-FROM-KNOWLEDGE-SOURCE", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_schema_field_list", "REPORTGEN-SCHEMA-FIELD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_physical_schema_ordered_field_list", "REPORTGEN-PHYSICAL-SCHEMA-ORDERED-FIELD-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "encoding_logical_field_indexical_internal", "ENCODING-LOGICAL-FIELD-INDEXICAL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "encoding_logical_field_indexical", "ENCODING-LOGICAL-FIELD-INDEXICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "reportgen_encoding_expression_from_physical_field_internal", "REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "reportgen_encoding_expression_from_physical_field", "REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "reportgen_encoding_expressions_from_physical_field_internal", "REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "reportgen_encoding_expressions_from_physical_field", "REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "decoding_for_input_lfi_internal", "DECODING-FOR-INPUT-LFI-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "decoding_for_input_lfi", "DECODING-FOR-INPUT-LFI", 2, 0, false );
    SubLFiles.declareFunction( me, "query_lfi_gaf_from_logical_indexical", "QUERY-LFI-GAF-FROM-LOGICAL-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "gaf_formulas_eq", "GAF-FORMULAS-EQ", 2, 0, false );
    SubLFiles.declareFunction( me, "query_lfi_gafs_from_logical_indexical", "QUERY-LFI-GAFS-FROM-LOGICAL-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "input_columns_from_logical_indexical", "INPUT-COLUMNS-FROM-LOGICAL-INDEXICAL", 2, 0, false );
    SubLFiles.declareFunction( me, "nbind_into_sentence", "NBIND-INTO-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "bind_into_query_sentence", "BIND-INTO-QUERY-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "convert_to_boolean_kb_constant", "CONVERT-TO-BOOLEAN-KB-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "query_lfi_gaf_for_closed_queryP", "QUERY-LFI-GAF-FOR-CLOSED-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "answers_from_ks_has_query_for_lfi_gaf", "ANSWERS-FROM-KS-HAS-QUERY-FOR-LFI-GAF", 2, 0, false );
    SubLFiles.declareFunction( me, "answers_from_lfi", "ANSWERS-FROM-LFI", 4, 0, false );
    SubLFiles.declareFunction( me, "translate_input_column_no", "TRANSLATE-INPUT-COLUMN-NO", 3, 0, false );
    SubLFiles.declareFunction( me, "values_from_encoding_expressions", "VALUES-FROM-ENCODING-EXPRESSIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "reportgen_cartesian_product", "REPORTGEN-CARTESIAN-PRODUCT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_report_generation_file()
  {
    $reportgen_minimal_property$ = SubLFiles.deflexical( "*REPORTGEN-MINIMAL-PROPERTY*", $list0 );
    $reportgen_easy_one_answer_query_properties$ = SubLFiles.deflexical( "*REPORTGEN-EASY-ONE-ANSWER-QUERY-PROPERTIES*", ConsesLow.append( $reportgen_minimal_property$.getGlobalValue(), $list1 ) );
    $run_column_query_caching_state$ = SubLFiles.deflexical( "*RUN-COLUMN-QUERY-CACHING-STATE*", NIL );
    $dtp_reportgen_exclusivity_state$ = SubLFiles.defconstant( "*DTP-REPORTGEN-EXCLUSIVITY-STATE*", $sym23$REPORTGEN_EXCLUSIVITY_STATE );
    return NIL;
  }

  public static SubLObject setup_sksi_report_generation_file()
  {
    access_macros.register_external_symbol( $sym2$REPORTGEN_OUTPUT_ROWS_FROM_INPUT_ROW );
    memoization_state.note_memoized_function( $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY );
    memoization_state.note_globally_cached_function( $sym11$RUN_COLUMN_QUERY );
    access_macros.register_external_symbol( $sym16$REPORTGEN_SCHEMA_FIELD_NAME_LIST );
    access_macros.register_external_symbol( $sym22$REPORTGEN_INPUT_DOC_FIELD_NAME_LIST );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_reportgen_exclusivity_state$.getGlobalValue(), Symbols.symbol_function(
        $sym30$REPORTGEN_EXCLUSIVITY_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list31 );
    Structures.def_csetf( $sym32$EXC_STATE_PHYS_FIELDS, $sym33$_CSETF_EXC_STATE_PHYS_FIELDS );
    Structures.def_csetf( $sym34$EXC_STATE_EXC_VALUE, $sym35$_CSETF_EXC_STATE_EXC_VALUE );
    Structures.def_csetf( $sym36$EXC_STATE_DEFAULT_VALUE, $sym37$_CSETF_EXC_STATE_DEFAULT_VALUE );
    Structures.def_csetf( $sym38$EXC_STATE_SATISFIED_YET_, $sym39$_CSETF_EXC_STATE_SATISFIED_YET_ );
    Equality.identity( $sym23$REPORTGEN_EXCLUSIVITY_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reportgen_exclusivity_state$.getGlobalValue(), Symbols.symbol_function(
        $sym49$VISIT_DEFSTRUCT_OBJECT_REPORTGEN_EXCLUSIVITY_STATE_METHOD ) );
    memoization_state.note_memoized_function( $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS );
    memoization_state.note_memoized_function( $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS );
    memoization_state.note_memoized_function( $sym58$INPUT_KS_FROM_REPORT_KS );
    memoization_state.note_memoized_function( $sym60$BASE_QUERY_FROM_KS );
    memoization_state.note_memoized_function( $sym62$RESULT_ARGPOS_IN_BASE_QUERY );
    memoization_state.note_memoized_function( $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL );
    memoization_state.note_memoized_function( $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD );
    memoization_state.note_memoized_function( $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD );
    memoization_state.note_memoized_function( $sym74$DECODING_FOR_INPUT_LFI );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_report_generation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_report_generation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_report_generation_file();
  }
  static
  {
    me = new sksi_report_generation();
    $reportgen_minimal_property$ = null;
    $reportgen_easy_one_answer_query_properties$ = null;
    $run_column_query_caching_state$ = null;
    $dtp_reportgen_exclusivity_state$ = null;
    $list0 = ConsesLow.list( makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ) );
    $list1 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $sym2$REPORTGEN_OUTPUT_ROWS_FROM_INPUT_ROW = makeSymbol( "REPORTGEN-OUTPUT-ROWS-FROM-INPUT-ROW" );
    $str3$_ = makeString( "." );
    $list4 = ConsesLow.list( ConsesLow.list( makeString( "No entity or event found corresponding to this row." ) ) );
    $const5$reportHasVariant = constant_handles.reader_make_constant_shell( makeString( "reportHasVariant" ) );
    $sym6$GET_ARGPOSES_AND_LFIS_FOR_BASE_QUERY = makeSymbol( "GET-ARGPOSES-AND-LFIS-FOR-BASE-QUERY" );
    $list7 = ConsesLow.cons( makeSymbol( "?ARGPOS" ), makeSymbol( "?LFI" ) );
    $const8$queryNeedsThingBoundInPosition = constant_handles.reader_make_constant_shell( makeString( "queryNeedsThingBoundInPosition" ) );
    $list9 = ConsesLow.list( makeSymbol( "?LFI" ), makeSymbol( "?ARGPOS" ) );
    $list10 = ConsesLow.list( makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ) );
    $sym11$RUN_COLUMN_QUERY = makeSymbol( "RUN-COLUMN-QUERY" );
    $kw12$RETURN = makeKeyword( "RETURN" );
    $kw13$BINDINGS = makeKeyword( "BINDINGS" );
    $sym14$_RUN_COLUMN_QUERY_CACHING_STATE_ = makeSymbol( "*RUN-COLUMN-QUERY-CACHING-STATE*" );
    $int15$100 = makeInteger( 100 );
    $sym16$REPORTGEN_SCHEMA_FIELD_NAME_LIST = makeSymbol( "REPORTGEN-SCHEMA-FIELD-NAME-LIST" );
    $const17$reportLFIHasFieldName = constant_handles.reader_make_constant_shell( makeString( "reportLFIHasFieldName" ) );
    $kw18$GAF = makeKeyword( "GAF" );
    $kw19$TRUE = makeKeyword( "TRUE" );
    $list20 = ConsesLow.list( makeSymbol( "LFI" ), makeSymbol( "NEW-NAME" ) );
    $const21$logicalFieldValueWithFieldName = constant_handles.reader_make_constant_shell( makeString( "logicalFieldValueWithFieldName" ) );
    $sym22$REPORTGEN_INPUT_DOC_FIELD_NAME_LIST = makeSymbol( "REPORTGEN-INPUT-DOC-FIELD-NAME-LIST" );
    $sym23$REPORTGEN_EXCLUSIVITY_STATE = makeSymbol( "REPORTGEN-EXCLUSIVITY-STATE" );
    $sym24$REPORTGEN_EXCLUSIVITY_STATE_P = makeSymbol( "REPORTGEN-EXCLUSIVITY-STATE-P" );
    $list25 = ConsesLow.list( makeSymbol( "PHYS-FIELDS" ), makeSymbol( "EXC-VALUE" ), makeSymbol( "DEFAULT-VALUE" ), makeSymbol( "SATISFIED-YET?" ) );
    $list26 = ConsesLow.list( makeKeyword( "PHYS-FIELDS" ), makeKeyword( "EXC-VALUE" ), makeKeyword( "DEFAULT-VALUE" ), makeKeyword( "SATISFIED-YET?" ) );
    $list27 = ConsesLow.list( makeSymbol( "EXC-STATE-PHYS-FIELDS" ), makeSymbol( "EXC-STATE-EXC-VALUE" ), makeSymbol( "EXC-STATE-DEFAULT-VALUE" ), makeSymbol( "EXC-STATE-SATISFIED-YET?" ) );
    $list28 = ConsesLow.list( makeSymbol( "_CSETF-EXC-STATE-PHYS-FIELDS" ), makeSymbol( "_CSETF-EXC-STATE-EXC-VALUE" ), makeSymbol( "_CSETF-EXC-STATE-DEFAULT-VALUE" ), makeSymbol( "_CSETF-EXC-STATE-SATISFIED-YET?" ) );
    $sym29$PRINT_EXC_STATE = makeSymbol( "PRINT-EXC-STATE" );
    $sym30$REPORTGEN_EXCLUSIVITY_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REPORTGEN-EXCLUSIVITY-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list31 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REPORTGEN-EXCLUSIVITY-STATE-P" ) );
    $sym32$EXC_STATE_PHYS_FIELDS = makeSymbol( "EXC-STATE-PHYS-FIELDS" );
    $sym33$_CSETF_EXC_STATE_PHYS_FIELDS = makeSymbol( "_CSETF-EXC-STATE-PHYS-FIELDS" );
    $sym34$EXC_STATE_EXC_VALUE = makeSymbol( "EXC-STATE-EXC-VALUE" );
    $sym35$_CSETF_EXC_STATE_EXC_VALUE = makeSymbol( "_CSETF-EXC-STATE-EXC-VALUE" );
    $sym36$EXC_STATE_DEFAULT_VALUE = makeSymbol( "EXC-STATE-DEFAULT-VALUE" );
    $sym37$_CSETF_EXC_STATE_DEFAULT_VALUE = makeSymbol( "_CSETF-EXC-STATE-DEFAULT-VALUE" );
    $sym38$EXC_STATE_SATISFIED_YET_ = makeSymbol( "EXC-STATE-SATISFIED-YET?" );
    $sym39$_CSETF_EXC_STATE_SATISFIED_YET_ = makeSymbol( "_CSETF-EXC-STATE-SATISFIED-YET?" );
    $kw40$PHYS_FIELDS = makeKeyword( "PHYS-FIELDS" );
    $kw41$EXC_VALUE = makeKeyword( "EXC-VALUE" );
    $kw42$DEFAULT_VALUE = makeKeyword( "DEFAULT-VALUE" );
    $kw43$SATISFIED_YET_ = makeKeyword( "SATISFIED-YET?" );
    $str44$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw45$BEGIN = makeKeyword( "BEGIN" );
    $sym46$MAKE_REPORTGEN_EXCLUSIVITY_STATE = makeSymbol( "MAKE-REPORTGEN-EXCLUSIVITY-STATE" );
    $kw47$SLOT = makeKeyword( "SLOT" );
    $kw48$END = makeKeyword( "END" );
    $sym49$VISIT_DEFSTRUCT_OBJECT_REPORTGEN_EXCLUSIVITY_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REPORTGEN-EXCLUSIVITY-STATE-METHOD" );
    $str50$__a_EXCLUSIVITY_STATE__a__a__a_ = makeString( "<~a EXCLUSIVITY-STATE:~a:~a:~a>" );
    $list51 = ConsesLow.list( makeKeyword( "SATISFIED-YET?" ), NIL );
    $sym52$GET_MUTUALLY_EXCLUSIVE_FIELD_GAFS = makeSymbol( "GET-MUTUALLY-EXCLUSIVE-FIELD-GAFS" );
    $const53$mutuallyExclusiveSchemaFieldListW = constant_handles.reader_make_constant_shell( makeString( "mutuallyExclusiveSchemaFieldListWRT" ) );
    $sym54$GET_DEFAULT_BOOLEAN_STRING_FOR_KS = makeSymbol( "GET-DEFAULT-BOOLEAN-STRING-FOR-KS" );
    $const55$defaultBooleanStringsForKS = constant_handles.reader_make_constant_shell( makeString( "defaultBooleanStringsForKS" ) );
    $const56$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const57$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym58$INPUT_KS_FROM_REPORT_KS = makeSymbol( "INPUT-KS-FROM-REPORT-KS" );
    $const59$derivedFromInput = constant_handles.reader_make_constant_shell( makeString( "derivedFromInput" ) );
    $sym60$BASE_QUERY_FROM_KS = makeSymbol( "BASE-QUERY-FROM-KS" );
    $const61$baseQueryForReportType = constant_handles.reader_make_constant_shell( makeString( "baseQueryForReportType" ) );
    $sym62$RESULT_ARGPOS_IN_BASE_QUERY = makeSymbol( "RESULT-ARGPOS-IN-BASE-QUERY" );
    $const63$baseQueryUsesAnswersInPosition = constant_handles.reader_make_constant_shell( makeString( "baseQueryUsesAnswersInPosition" ) );
    $str64$_A_is_not_an_appropriate_knowledg = makeString( "~A is not an appropriate knowledge source for a report (must have exactly one physical schema)." );
    $str65$_A_is_not_an_appropriate_knowledg = makeString( "~A is not an appropriate knowledge source for a report (must have exactly one logical schema)." );
    $str66$Could_not_find___schemaFieldNameL = makeString( "Could not find #$schemaFieldNameList for ~S~%" );
    $sym67$ENCODING_LOGICAL_FIELD_INDEXICAL = makeSymbol( "ENCODING-LOGICAL-FIELD-INDEXICAL" );
    $str68$The_expression__A_is_supposed_to_ = makeString( "The expression ~A is supposed to have only one distinct logical field indexical." );
    $sym69$REPORTGEN_ENCODING_EXPRESSION_FROM_PHYSICAL_FIELD = makeSymbol( "REPORTGEN-ENCODING-EXPRESSION-FROM-PHYSICAL-FIELD" );
    $str70$Field__A_is_required_to_have_only = makeString( "Field ~A is required to have only one transformation, but it has ~D." );
    $const71$SetOfValuesOfFn = constant_handles.reader_make_constant_shell( makeString( "SetOfValuesOfFn" ) );
    $sym72$REPORTGEN_ENCODING_EXPRESSIONS_FROM_PHYSICAL_FIELD = makeSymbol( "REPORTGEN-ENCODING-EXPRESSIONS-FROM-PHYSICAL-FIELD" );
    $const73$fieldEncodingWRTKS = constant_handles.reader_make_constant_shell( makeString( "fieldEncodingWRTKS" ) );
    $sym74$DECODING_FOR_INPUT_LFI = makeSymbol( "DECODING-FOR-INPUT-LFI" );
    $str75$_A_should_only_have_one_decoding_ = makeString( "~A should only have one decoding for the knowledge source ~A." );
    $sym76$GAF_FORMULAS_EQ = makeSymbol( "GAF-FORMULAS-EQ" );
    $str77$Field_indexical__A_is_required_to = makeString( "Field indexical ~A is required to have exactly one associated query, but it has ~D." );
    $const78$kSHasQueryForLogicalFieldIndexica = constant_handles.reader_make_constant_shell( makeString( "kSHasQueryForLogicalFieldIndexical" ) );
    $const79$valueFromColumnInSKS = constant_handles.reader_make_constant_shell( makeString( "valueFromColumnInSKS" ) );
    $const80$queryHasFocalOutputVariablePositi = constant_handles.reader_make_constant_shell( makeString( "queryHasFocalOutputVariablePositionForReportIndexical" ) );
    $list81 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ) );
    $list82 = ConsesLow.list( makeSymbol( "KS" ), makeSymbol( "LFI" ), makeSymbol( "FINAL-QUERY" ) );
    $const83$queryHasFocalInputVariablePositio = constant_handles.reader_make_constant_shell( makeString( "queryHasFocalInputVariablePosition" ) );
    $const84$queryHasFocalOutputVariablePositi = constant_handles.reader_make_constant_shell( makeString( "queryHasFocalOutputVariablePosition" ) );
    $str85$Column__D_in__A_doesn_t_correspon = makeString( "Column ~D in ~A doesn't correspond to a unique logical field." );
    $list86 = ConsesLow.list( NIL );
  }

  public static final class $reportgen_exclusivity_state_native
      extends
        SubLStructNative
  {
    public SubLObject $phys_fields;
    public SubLObject $exc_value;
    public SubLObject $default_value;
    public SubLObject $satisfied_yetP;
    private static final SubLStructDeclNative structDecl;

    public $reportgen_exclusivity_state_native()
    {
      this.$phys_fields = CommonSymbols.NIL;
      this.$exc_value = CommonSymbols.NIL;
      this.$default_value = CommonSymbols.NIL;
      this.$satisfied_yetP = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $reportgen_exclusivity_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$phys_fields;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$exc_value;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$default_value;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$satisfied_yetP;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$phys_fields = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$exc_value = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$default_value = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$satisfied_yetP = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $reportgen_exclusivity_state_native.class, $sym23$REPORTGEN_EXCLUSIVITY_STATE, $sym24$REPORTGEN_EXCLUSIVITY_STATE_P, $list25, $list26, new String[] { "$phys_fields",
        "$exc_value", "$default_value", "$satisfied_yetP"
      }, $list27, $list28, $sym29$PRINT_EXC_STATE );
    }
  }

  public static final class $reportgen_exclusivity_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $reportgen_exclusivity_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REPORTGEN-EXCLUSIVITY-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reportgen_exclusivity_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 346 ms
 * 
 */