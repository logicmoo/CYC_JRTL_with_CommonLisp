package com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_db
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db";
  public static final String myFingerPrint = "e696903350934ff662518a0cd11a32d734b25bde6e9890451b866066b7459cbb";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
  private static SubLSymbol $simple_sksi_terms_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
  private static SubLSymbol $simple_sksi_assertions_for_sks_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3154L)
  public static SubLSymbol $sksi_transcript_source_repropagationP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4016L)
  private static SubLSymbol $simplified_sksi_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4934L)
  private static SubLSymbol $simple_db_validation_problems$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 16558L)
  private static SubLSymbol $convert_simple_sksi_db_to_complex_override_properties$;
  private static final SubLObject $const0$SimpleDatabase;
  private static final SubLSymbol $sym1$SIMPLE_SKSI_TERMS;
  private static final SubLObject $const2$TestPace;
  private static final SubLSymbol $kw3$NEG;
  private static final SubLObject $const4$SimplifiedSKSIConstant;
  private static final SubLSymbol $sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_;
  private static final SubLSymbol $sym6$CLEAR_SIMPLE_SKSI_TERMS;
  private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const8$EverythingPSC;
  private static final SubLSymbol $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS;
  private static final SubLString $str10$Gathering_simple_SKSI_assertions_;
  private static final SubLString $str11$cdolist;
  private static final SubLSymbol $sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_;
  private static final SubLSymbol $sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS;
  private static final SubLSymbol $sym14$SIMPLE_SKSI_TERM_;
  private static final SubLSymbol $sym15$SK_SOURCE_IN_ANY_MT_P;
  private static final SubLSymbol $sym16$MICROTHEORY_P;
  private static final SubLString $str17$Repropagating_;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$UNINITIALIZED;
  private static final SubLList $list20;
  private static final SubLString $str21$Simple_DB_invalid___s;
  private static final SubLString $str22$Validating__a_____;
  private static final SubLString $str23$DB_was_not_simple__returning__loo;
  private static final SubLList $list24;
  private static final SubLObject $const25$SKSIMt;
  private static final SubLList $list26;
  private static final SubLString $str27$Using_mapping_mt__a__;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLString $str30$_is_not___sksRepresentationComple;
  private static final SubLString $str31$could_not_find_any_tables_in_;
  private static final SubLString $str32$in_mappingMt_;
  private static final SubLList $list33;
  private static final SubLObject $const34$schemaTranslation;
  private static final SubLSymbol $kw35$DEPTH;
  private static final SubLSymbol $kw36$STACK;
  private static final SubLSymbol $kw37$QUEUE;
  private static final SubLSymbol $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw39$ERROR;
  private static final SubLString $str40$_A_is_not_a__A;
  private static final SubLSymbol $sym41$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw42$CERROR;
  private static final SubLString $str43$continue_anyway;
  private static final SubLSymbol $kw44$WARN;
  private static final SubLString $str45$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const46$genlPreds;
  private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str48$attempting_to_bind_direction_link;
  private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLString $str50$no___schemaTranslation_for_;
  private static final SubLString $str51$_in_;
  private static final SubLObject $const52$objectSchemaTranslation;
  private static final SubLList $list53;
  private static final SubLObject $const54$objectSchemaColumnPredicate;
  private static final SubLObject $const55$columnInDBTableNamed;
  private static final SubLString $str56$expected_at_least_2_columns__via_;
  private static final SubLString $str57$__got_;
  private static final SubLString $str58$no_columns__via___columnInDBTable;
  private static final SubLString $str59$_have_an___objectSchemaColumnPred;
  private static final SubLObject $const60$relationshipSchemaTranslation;
  private static final SubLList $list61;
  private static final SubLObject $const62$assertionSchemaTranslation;
  private static final SubLList $list63;
  private static final SubLObject $const64$DatabaseColumn;
  private static final SubLString $str65$_is_not_a___DatabaseColumn__argum;
  private static final SubLString $str66$_;
  private static final SubLList $list67;
  private static final SubLObject $const68$dBTableArgNumMapping;
  private static final SubLString $str69$unexpected_schema_translation_pre;
  private static final SubLString $str70$_for_;
  private static final SubLString $str71$Expected_exactly_one_physical_sch;
  private static final SubLString $str72$__via___physicalSchemaSourceMap__;
  private static final SubLObject $const73$tableFieldNameList;
  private static final SubLSymbol $kw74$TRUE;
  private static final SubLString $str75$Found_column_;
  private static final SubLString $str76$_not_listed_in___tableFieldNameLi;
  private static final SubLString $str77$__If_it_is_a_column_in_the_table_;
  private static final SubLObject $const78$NonCanonicallyTemporallyIndexedDB;
  private static final SubLObject $const79$CanonicallyTemporallyIndexedDBTab;
  private static final SubLList $list80;
  private static final SubLObject $const81$temporalTranslationColumns;
  private static final SubLString $str82$Found_no___temporalTranslationCol;
  private static final SubLList $list83;
  private static final SubLString $str84$_is_not_known_to_be_a___Canonical;
  private static final SubLList $list85;
  private static final SubLObject $const86$fieldEncoding;
  private static final SubLString $str87$Expected_exactly_one_logical_sche;
  private static final SubLString $str88$__via___logicalPhysicalSchemaMap_;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$CMLS_FN_NART_P;
  private static final SubLObject $const92$codeMapping;
  private static final SubLSymbol $kw93$GAF;
  private static final SubLObject $const94$logicalFieldValueWithFieldName;
  private static final SubLString $str95$Found_no___codeMapping_for_;
  private static final SubLString $str96$__the_indexical_for_the_field_nam;
  private static final SubLString $str97$__Ensure_one_exists_via_either_as;
  private static final SubLObject $const98$fieldDecoding;
  private static final SubLObject $const99$CMLSFn;
  private static final SubLSymbol $sym100$LISTP;
  private static final SubLString $str101$_is_missing_an_asserted_value_for;
  private static final SubLString $str102$_is_missing_a_value_for_;
  private static final SubLSymbol $kw103$REPROPAGATE_;
  private static final SubLString $str104$Processing_;
  private static final SubLString $str105$__seed__simple_sksi_assertions_fo;
  private static final SubLString $str106$___A_simple_sksi_assertions_check;
  private static final SubLSymbol $kw107$VERBOSE_;
  private static final SubLString $str108$___S_in__S__;
  private static final SubLString $str109$___S_in__S__;
  private static final SubLSymbol $kw110$READ_ONLY_;
  private static final SubLString $str111$Adding_asserted_arguments_to_;
  private static final SubLString $str112$_complex_sksi_assertions_for_;
  private static final SubLString $str113$Assert_failed_for__A;
  private static final SubLString $str114$Killing_;
  private static final SubLString $str115$_simple_sksi_assertions_for_;
  private static final SubLObject $const116$isa;
  private static final SubLObject $const117$Database_Physical;
  private static final SubLObject $const118$StructuredKnowledgeSource_TopLeve;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1264L)
  public static SubLObject simple_sksi_dbP(final SubLObject db)
  {
    return isa.isa_in_any_mtP( db, $const0$SimpleDatabase );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
  public static SubLObject clear_simple_sksi_terms()
  {
    final SubLObject cs = $simple_sksi_terms_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
  public static SubLObject remove_simple_sksi_terms()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $simple_sksi_terms_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
  public static SubLObject simple_sksi_terms_internal()
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts( $const4$SimplifiedSKSIConstant );
    SubLObject candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject skip_candidateP = NIL;
      if( NIL != kb_utilities.kbeq( candidate, $const2$TestPace ) )
      {
        skip_candidateP = T;
      }
      else if( NIL != fort_types_interface.predicateP( candidate ) )
      {
        if( kb_indexing.num_predicate_rule_index( candidate, $kw3$NEG, UNPROVIDED, UNPROVIDED ).isZero() )
        {
          skip_candidateP = T;
        }
        else
        {
          final SubLObject antecedent_rules = kb_mapping.gather_predicate_rule_index( candidate, $kw3$NEG, UNPROVIDED, UNPROVIDED );
          SubLObject forward_rule_foundP = T;
          if( NIL == forward_rule_foundP )
          {
            SubLObject csome_list_var = antecedent_rules;
            SubLObject antecedent_rule = NIL;
            antecedent_rule = csome_list_var.first();
            while ( NIL == forward_rule_foundP && NIL != csome_list_var)
            {
              if( NIL != assertions_high.forward_assertionP( antecedent_rule ) )
              {
                forward_rule_foundP = T;
              }
              csome_list_var = csome_list_var.rest();
              antecedent_rule = csome_list_var.first();
            }
          }
          if( NIL == forward_rule_foundP )
          {
            skip_candidateP = T;
          }
        }
      }
      if( NIL == skip_candidateP )
      {
        final SubLObject item_var = candidate;
        if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
        {
          result = ConsesLow.cons( item_var, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
  public static SubLObject simple_sksi_terms()
  {
    SubLObject caching_state = $simple_sksi_terms_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym1$SIMPLE_SKSI_TERMS, $sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym6$CLEAR_SIMPLE_SKSI_TERMS );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( simple_sksi_terms_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2187L)
  public static SubLObject simple_sksi_termP(final SubLObject v_object)
  {
    return list_utilities.member_kbeqP( v_object, simple_sksi_terms() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2284L)
  public static SubLObject simple_sksi_assertions_for_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
      SubLObject cdolist_list_var = simple_sksi_terms();
      SubLObject simple_sksi_term = NIL;
      simple_sksi_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == fort_types_interface.functorP( simple_sksi_term ) )
        {
          SubLObject cdolist_list_var_$1 = virtual_indexing.assertions_mentioning_terms( ConsesLow.list( v_term, simple_sksi_term ), UNPROVIDED );
          SubLObject a = NIL;
          a = cdolist_list_var_$1.first();
          while ( NIL != cdolist_list_var_$1)
          {
            final SubLObject item_var = a;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
            a = cdolist_list_var_$1.first();
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        simple_sksi_term = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
  public static SubLObject clear_simple_sksi_assertions_for_sks()
  {
    final SubLObject cs = $simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
  public static SubLObject remove_simple_sksi_assertions_for_sks(final SubLObject sks)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $simple_sksi_assertions_for_sks_caching_state$.getGlobalValue(), ConsesLow.list( sks ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
  public static SubLObject simple_sksi_assertions_for_sks_internal(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = simple_sksi_assertions_for_term( sks );
    final SubLObject mapping_mt = sksi_sks_accessors.sks_get_defining_mt( sks, UNPROVIDED );
    final SubLObject list_var = kb_mapping.gather_mt_index( mapping_mt );
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
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy( mapping_mt ) ) ) ? Sequences.cconcatenate(
          $str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy( mapping_mt ) ) : $str11$cdolist, thread );
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
        SubLObject a = NIL;
        a = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL != simple_sksi_assertionP( a ) )
          {
            final SubLObject item_var = a;
            if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              result = ConsesLow.cons( item_var, result );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          a = csome_list_var.first();
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
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
  public static SubLObject simple_sksi_assertions_for_sks(final SubLObject sks)
  {
    SubLObject caching_state = $simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS, $sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_, FOUR_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( simple_sksi_assertions_for_sks_internal( sks ) ) );
      memoization_state.caching_state_put( caching_state, sks, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3025L)
  public static SubLObject simple_sksi_assertionP(final SubLObject assertion)
  {
    return cycl_utilities.expression_find_if( $sym14$SIMPLE_SKSI_TERM_, assertions_high.assertion_cnf( assertion ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3370L)
  public static SubLObject repropagate_knowledge_source(final SubLObject sk_source, SubLObject only_these_predicates)
  {
    if( only_these_predicates == UNPROVIDED )
    {
      only_these_predicates = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_kb_accessors.sk_source_in_any_mt_p( sk_source ) : sk_source;
    SubLObject count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding( thread );
    try
    {
      control_vars.$use_transcriptP$.bind( $sksi_transcript_source_repropagationP$.getDynamicValue( thread ), thread );
      final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
      assert NIL != fort_types_interface.microtheory_p( mapping_mt ) : mapping_mt;
      final SubLObject list_var = kb_mapping.gather_mt_index( mapping_mt );
      final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str17$Repropagating_, format_nil.format_nil_a_no_copy( sk_source ) ) ) ? Sequences.cconcatenate( $str17$Repropagating_, format_nil
            .format_nil_a_no_copy( sk_source ) ) : $str11$cdolist, thread );
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
          SubLObject gaf = NIL;
          gaf = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != assertions_high.gaf_assertionP( gaf ) && ( NIL == only_these_predicates || NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p( gaf, only_these_predicates ) ) )
            {
              ke.ke_repropagate_assertion_now( gaf );
              count = Numbers.add( count, ONE_INTEGER );
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            gaf = csome_list_var.first();
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
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      control_vars.$use_transcriptP$.rebind( _prev_bind_0, thread );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4676L)
  public static SubLObject repropagate_simple_db(final SubLObject db)
  {
    return repropagate_knowledge_source( db, $simplified_sksi_predicates$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 5048L)
  public static SubLObject ensure_simple_db_valid(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP)
  {
    if( validate_queryableP == UNPROVIDED )
    {
      validate_queryableP = T;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    final SubLObject validation_result = validate_simple_db( db, validate_queryableP, verboseP );
    if( $list20.equal( validation_result ) )
    {
      return validation_result;
    }
    return Errors.error( $str21$Simple_DB_invalid___s, validation_result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 5359L)
  public static SubLObject validate_simple_db(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP)
  {
    if( validate_queryableP == UNPROVIDED )
    {
      validate_queryableP = T;
    }
    if( verboseP == UNPROVIDED )
    {
      verboseP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != verboseP )
    {
      format_nil.force_format( T, $str22$Validating__a_____, db, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL == simple_sksi_dbP( db ) )
    {
      Errors.warn( $str23$DB_was_not_simple__returning__loo );
      return $list20;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $simple_db_validation_problems$.currentBinding( thread );
    try
    {
      $simple_db_validation_problems$.bind( NIL, thread );
      ensure_preds_have_deduced_values( db, $list24, $const25$SKSIMt, UNPROVIDED );
      ensure_preds_have_deduced_values( db, $list26, $const25$SKSIMt, UNPROVIDED );
      final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( db );
      if( NIL != verboseP )
      {
        format_nil.force_format( T, $str27$Using_mapping_mt__a__, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
      final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        ensure_preds_have_deduced_values( db, $list28, mapping_mt, UNPROVIDED );
        ensure_preds_have_deduced_values( db, $list29, mapping_mt, UNPROVIDED );
        if( NIL == sksi_kb_accessors.knowledge_source_representation_completeP( db ) )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( db ), $str30$_is_not___sksRepresentationComple ) );
        }
        SubLObject tables = NIL;
        final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym7$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const8$EverythingPSC, thread );
          tables = sksi_kb_accessors.sk_source_sub_ks_direct( db );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_1_$7, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$6, thread );
        }
        if( NIL == tables )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str31$could_not_find_any_tables_in_, format_nil.format_nil_a_no_copy( db ) ) );
        }
        SubLObject cdolist_list_var = tables;
        SubLObject table = NIL;
        table = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          validate_simple_table( table, mapping_mt, validate_queryableP );
          cdolist_list_var = cdolist_list_var.rest();
          table = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0_$5, thread );
      }
      if( NIL == $simple_db_validation_problems$.getDynamicValue( thread ) )
      {
        result = $list20;
      }
      else
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( $str32$in_mappingMt_, format_nil.format_nil_a_no_copy( mapping_mt ) ) );
        result = Sequences.nreverse( $simple_db_validation_problems$.getDynamicValue( thread ) );
      }
    }
    finally
    {
      $simple_db_validation_problems$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 7301L)
  public static SubLObject validate_simple_table(final SubLObject table, final SubLObject mapping_mt, final SubLObject validate_queryableP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ensure_preds_have_deduced_values( table, $list33, mapping_mt, UNPROVIDED );
      ensure_all_fields_are_listed( table, mapping_mt );
      SubLObject schema_translation_pred = NIL;
      if( NIL == schema_translation_pred )
      {
        final SubLObject node_var = $const34$schemaTranslation;
        final SubLObject deck_type = $kw37$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw39$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw42$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw44$WARN ) )
                {
                  Errors.warn( $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str43$continue_anyway, $str40$_A_is_not_a__A, tv_var, $sym41$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( $const34$schemaTranslation, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                        $const46$genlPreds ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                    for( node_and_predicate_mode = ConsesLow.list( $const34$schemaTranslation, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode
                        && NIL == schema_translation_pred; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                    {
                      final SubLObject node_var_$17 = node_and_predicate_mode.first();
                      final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                      final SubLObject spec_pred = node_var_$17;
                      final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                        final SubLObject inverseP = predicate_mode;
                        if( NIL != kb_mapping_utilities.fpred_value( table, spec_pred, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                        {
                          schema_translation_pred = spec_pred;
                        }
                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const46$genlPreds ) );
                        SubLObject rest;
                        SubLObject module_var;
                        SubLObject _prev_bind_0_$13;
                        SubLObject _prev_bind_1_$13;
                        SubLObject node;
                        SubLObject d_link;
                        SubLObject mt_links;
                        SubLObject iteration_state;
                        SubLObject mt;
                        SubLObject tv_links;
                        SubLObject _prev_bind_0_$14;
                        SubLObject iteration_state_$22;
                        SubLObject tv;
                        SubLObject link_nodes;
                        SubLObject _prev_bind_0_$15;
                        SubLObject sol;
                        SubLObject set_contents_var;
                        SubLObject basis_object;
                        SubLObject state;
                        SubLObject node_vars_link_node;
                        SubLObject csome_list_var;
                        SubLObject node_vars_link_node2;
                        SubLObject new_list;
                        SubLObject rest_$24;
                        SubLObject generating_fn;
                        SubLObject _prev_bind_0_$16;
                        SubLObject sol2;
                        SubLObject link_nodes2;
                        SubLObject set_contents_var2;
                        SubLObject basis_object2;
                        SubLObject state2;
                        SubLObject node_vars_link_node3;
                        SubLObject csome_list_var2;
                        SubLObject node_vars_link_node4;
                        for( rest = NIL, rest = accessible_modules; NIL == schema_translation_pred && NIL != rest; rest = rest.rest() )
                        {
                          module_var = rest.first();
                          _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node = function_terms.naut_to_nart( node_var_$17 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == schema_translation_pred && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        for( iteration_state_$22 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == schema_translation_pred
                                            && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state_$22 ); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(
                                                iteration_state_$22 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$22 );
                                          link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                set_contents_var = set.do_set_internal( sol );
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == schema_translation_pred && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents
                                                        .do_set_contents_update_state( state ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                      UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                if( NIL == schema_translation_pred )
                                                {
                                                  csome_list_var = sol;
                                                  node_vars_link_node2 = NIL;
                                                  node_vars_link_node2 = csome_list_var.first();
                                                  while ( NIL == schema_translation_pred && NIL != csome_list_var)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    node_vars_link_node2 = csome_list_var.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$15, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$22 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$14, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$24 = NIL, rest_$24 = new_list; NIL == schema_translation_pred && NIL != rest_$24; rest_$24 = rest_$24.rest() )
                              {
                                generating_fn = rest_$24.first();
                                _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    set_contents_var2 = set.do_set_internal( sol2 );
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == schema_translation_pred && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state(
                                            state2 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    if( NIL == schema_translation_pred )
                                    {
                                      csome_list_var2 = sol2;
                                      node_vars_link_node4 = NIL;
                                      node_vars_link_node4 = csome_list_var2.first();
                                      while ( NIL == schema_translation_pred && NIL != csome_list_var2)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                          deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        node_vars_link_node4 = csome_list_var2.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str47$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$16, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$13, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$13, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$12, thread );
                      }
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$14, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$12, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$11, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, $const34$schemaTranslation, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                      UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$13, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$11, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$10, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$10, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$9, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$17, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$8, thread );
        }
      }
      if( NIL == schema_translation_pred )
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( $str50$no___schemaTranslation_for_, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str51$_in_, format_nil.format_nil_a_no_copy(
            mapping_mt )
        } ) );
      }
      final SubLObject pcase_var2 = schema_translation_pred;
      if( pcase_var2.eql( $const52$objectSchemaTranslation ) )
      {
        ensure_preds_have_deduced_values( table, $list53, mapping_mt, UNPROVIDED );
        SubLObject column_count = ZERO_INTEGER;
        SubLObject found_a_column_predicateP = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( table, $const55$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
        SubLObject column = NIL;
        column = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          column_count = Numbers.add( column_count, ONE_INTEGER );
          if( NIL != kb_mapping_utilities.fpred_value( column, $const54$objectSchemaColumnPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            found_a_column_predicateP = T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          column = cdolist_list_var.first();
        }
        if( column_count.numL( TWO_INTEGER ) )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str57$__got_, format_nil.format_nil_a_no_copy(
              column_count )
          } ) );
        }
        if( NIL == found_a_column_predicateP )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str58$no_columns__via___columnInDBTable, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str59$_have_an___objectSchemaColumnPred
          } ) );
        }
      }
      else if( pcase_var2.eql( $const60$relationshipSchemaTranslation ) )
      {
        ensure_preds_have_deduced_values( table, $list61, mapping_mt, UNPROVIDED );
        final SubLObject column_count = Sequences.length( kb_mapping_utilities.pred_values( table, $const55$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
        if( column_count.numL( TWO_INTEGER ) )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str57$__got_, format_nil.format_nil_a_no_copy(
              column_count )
          } ) );
        }
        ensure_temporal_or_atemporal_table( table, mapping_mt );
      }
      else if( pcase_var2.eql( $const62$assertionSchemaTranslation ) )
      {
        ensure_preds_have_deduced_values( table, $list63, mapping_mt, UNPROVIDED );
        final SubLObject column_count = Sequences.length( kb_mapping_utilities.pred_values( table, $const55$columnInDBTableNamed, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
        if( column_count.numL( TWO_INTEGER ) )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str57$__got_, format_nil.format_nil_a_no_copy(
              column_count )
          } ) );
        }
        SubLObject cdolist_list_var2 = el_utilities.el_list_items( kb_mapping_utilities.fpred_value( table, $const68$dBTableArgNumMapping, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        SubLObject column2 = NIL;
        column2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          if( NIL == isa.isaP( column2, $const64$DatabaseColumn, UNPROVIDED, UNPROVIDED ) )
          {
            note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( column2 ), new SubLObject[] { $str65$_is_not_a___DatabaseColumn__argum, format_nil.format_nil_a_no_copy( table ),
              $str66$_
            } ) );
          }
          ensure_preds_have_deduced_values( column2, $list67, mapping_mt, UNPROVIDED );
          cdolist_list_var2 = cdolist_list_var2.rest();
          column2 = cdolist_list_var2.first();
        }
        ensure_temporal_or_atemporal_table( table, mapping_mt );
      }
      else
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( $str69$unexpected_schema_translation_pre, new SubLObject[] { format_nil.format_nil_a_no_copy( schema_translation_pred ), $str70$_for_, format_nil
            .format_nil_a_no_copy( table )
        } ) );
      }
      if( NIL == sksi_kb_accessors.knowledge_source_representation_completeP( table ) )
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( table ), $str30$_is_not___sksRepresentationComple ) );
      }
      final SubLObject ps_list = sksi_kb_accessors.sk_source_physical_schemata( table );
      if( NIL == list_utilities.singletonP( ps_list ) )
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( $str71$Expected_exactly_one_physical_sch, new SubLObject[] { format_nil.format_nil_a_no_copy( table ), $str72$__via___physicalSchemaSourceMap__,
          format_nil.format_nil_a_no_copy( ps_list )
        } ) );
      }
      else
      {
        validate_simple_physical_schema( list_utilities.only_one( ps_list ), mapping_mt, validate_queryableP );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 10780L)
  public static SubLObject ensure_all_fields_are_listed(final SubLObject table, final SubLObject mapping_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject field_name_el_list = kb_mapping_utilities.fpred_value( table, $const73$tableFieldNameList, ONE_INTEGER, TWO_INTEGER, $kw74$TRUE );
      final SubLObject field_name_items = ( NIL != field_name_el_list ) ? el_utilities.el_list_items( field_name_el_list ) : NIL;
      final SubLObject field_set = set_utilities.construct_set_from_list( field_name_items, Symbols.symbol_function( EQUALP ), UNPROVIDED );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( table, $const55$columnInDBTableNamed, TWO_INTEGER, THREE_INTEGER, $kw74$TRUE );
      SubLObject column = NIL;
      column = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == set.set_memberP( column, field_set ) )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str75$Found_column_, new SubLObject[] { format_nil.format_nil_a_no_copy( column ), $str76$_not_listed_in___tableFieldNameLi, format_nil
              .format_nil_a_no_copy( table ), $str77$__If_it_is_a_column_in_the_table_
          } ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        column = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 11500L)
  public static SubLObject ensure_temporal_or_atemporal_table(final SubLObject table, final SubLObject mapping_mt)
  {
    if( NIL == isa.isaP( table, $const78$NonCanonicallyTemporallyIndexedDB, mapping_mt, UNPROVIDED ) )
    {
      if( NIL != isa.isaP( table, $const79$CanonicallyTemporallyIndexedDBTab, mapping_mt, UNPROVIDED ) )
      {
        ensure_preds_have_deduced_values( table, $list80, mapping_mt, UNPROVIDED );
        final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf( table, $const81$temporalTranslationColumns, UNPROVIDED, UNPROVIDED );
        if( NIL == gaf )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( $str82$Found_no___temporalTranslationCol, format_nil.format_nil_a_no_copy( table ) ) );
        }
        else
        {
          final SubLObject column_1 = assertions_high.gaf_arg2( gaf );
          final SubLObject column_2 = assertions_high.gaf_arg3( gaf );
          ensure_preds_have_deduced_values( column_1, $list83, mapping_mt, UNPROVIDED );
          ensure_preds_have_deduced_values( column_2, $list83, mapping_mt, UNPROVIDED );
        }
      }
      else
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( table ), new SubLObject[] { $str84$_is_not_known_to_be_a___Canonical, format_nil.format_nil_a_no_copy( mapping_mt )
        } ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 12468L)
  public static SubLObject validate_simple_physical_schema(final SubLObject ps, final SubLObject mapping_mt, final SubLObject validate_queryableP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject preds = $list85;
      if( NIL != validate_queryableP )
      {
        preds = ConsesLow.cons( $const86$fieldEncoding, preds );
      }
      ensure_preds_have_deduced_values( ps, preds, mapping_mt, UNPROVIDED );
      final SubLObject ls_list = sksi_kb_accessors.physical_schema_logical_schemata( ps );
      if( NIL == list_utilities.singletonP( ls_list ) )
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( $str87$Expected_exactly_one_logical_sche, new SubLObject[] { format_nil.format_nil_a_no_copy( ps ), $str88$__via___logicalPhysicalSchemaMap_, format_nil
            .format_nil_a_no_copy( ls_list )
        } ) );
      }
      else
      {
        validate_simple_logical_schema( list_utilities.only_one( ls_list ), mapping_mt, validate_queryableP );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 13171L)
  public static SubLObject validate_simple_logical_schema(final SubLObject ls, final SubLObject mapping_mt, final SubLObject validate_queryableP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ensure_preds_have_deduced_values( ls, $list89, mapping_mt, UNPROVIDED );
      SubLObject cdolist_list_var = sksi_meaning_sentence_utilities.logical_schema_logical_field_indexicals_used_in_meaning_sentences( ls );
      SubLObject lfi = NIL;
      lfi = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        validate_simple_logical_field_indexical( lfi, mapping_mt, validate_queryableP );
        cdolist_list_var = cdolist_list_var.rest();
        lfi = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 13806L)
  public static SubLObject validate_simple_logical_field_indexical(final SubLObject lfi, final SubLObject mapping_mt, final SubLObject validate_queryableP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject preds = $list90;
    if( NIL != validate_queryableP )
    {
      preds = ConsesLow.cons( $const86$fieldEncoding, preds );
    }
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mapping_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      ensure_preds_have_deduced_values( lfi, preds, mapping_mt, T );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 14231L)
  public static SubLObject ensure_field_decoding_has_code_mappings(final SubLObject lfi)
  {
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_values( lfi, $const98$fieldDecoding, TWO_INTEGER, FOUR_INTEGER, $kw74$TRUE );
    SubLObject decoding = NIL;
    decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$27;
      final SubLObject cmls_fn_narts = cdolist_list_var_$27 = cycl_utilities.expression_gather( decoding, $sym91$CMLS_FN_NART_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cmls_fn_nart = NIL;
      cmls_fn_nart = cdolist_list_var_$27.first();
      while ( NIL != cdolist_list_var_$27)
      {
        SubLObject code_mapping_foundP = NIL;
        final SubLObject pred_var = $const92$codeMapping;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( cmls_fn_nart, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( cmls_fn_nart, ONE_INTEGER, pred_var );
          SubLObject done_var = code_mapping_foundP;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw93$GAF, $kw74$TRUE, NIL );
                SubLObject done_var_$28 = code_mapping_foundP;
                final SubLObject token_var_$29 = NIL;
                while ( NIL == done_var_$28)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$29 );
                  final SubLObject valid_$30 = makeBoolean( !token_var_$29.eql( gaf ) );
                  if( NIL != valid_$30 )
                  {
                    code_mapping_foundP = T;
                  }
                  done_var_$28 = makeBoolean( NIL == valid_$30 || NIL != code_mapping_foundP );
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
            done_var = makeBoolean( NIL == valid || NIL != code_mapping_foundP );
          }
        }
        if( NIL == code_mapping_foundP )
        {
          final SubLObject field_name = kb_mapping_utilities.fpred_value( lfi, $const94$logicalFieldValueWithFieldName, THREE_INTEGER, TWO_INTEGER, $kw74$TRUE );
          note_simple_db_validation_problem( Sequences.cconcatenate( $str95$Found_no___codeMapping_for_, new SubLObject[] { format_nil.format_nil_a_no_copy( lfi ), $str96$__the_indexical_for_the_field_nam, format_nil
              .format_nil_a_no_copy( field_name ), $str97$__Ensure_one_exists_via_either_as
          } ) );
        }
        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
        cmls_fn_nart = cdolist_list_var_$27.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      decoding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15065L)
  public static SubLObject cmls_fn_nart_p(final SubLObject v_object)
  {
    return narts_high.nart_with_functor_p( $const99$CMLSFn, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15153L)
  public static SubLObject note_simple_db_validation_problem(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( $simple_db_validation_problems$.getDynamicValue( thread ) ) : $simple_db_validation_problems$.getDynamicValue( thread );
    $simple_db_validation_problems$.setDynamicValue( ConsesLow.cons( string, $simple_db_validation_problems$.getDynamicValue( thread ) ), thread );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15343L)
  public static SubLObject ensure_preds_have_deduced_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, SubLObject find_as_subtermP)
  {
    if( find_as_subtermP == UNPROVIDED )
    {
      find_as_subtermP = NIL;
    }
    return ensure_preds_have_values( fort, preds, mt, NIL, find_as_subtermP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15507L)
  public static SubLObject ensure_preds_have_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP)
  {
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ensure_pred_has_value( fort, pred, mt, ensure_assertedP, find_as_subtermP );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15712L)
  public static SubLObject ensure_pred_has_value(final SubLObject fort, final SubLObject pred, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject foundP = NIL;
      SubLObject found_assertedP = NIL;
      if( NIL != find_as_subtermP )
      {
        if( NIL != kb_mapping_macros.do_term_index_key_validator( fort, $kw93$GAF ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator( fort, $kw93$GAF );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw93$GAF, NIL, NIL );
                SubLObject done_var_$31 = NIL;
                final SubLObject token_var_$32 = NIL;
                while ( NIL == done_var_$31)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$32 );
                  final SubLObject valid_$33 = makeBoolean( !token_var_$32.eql( gaf ) );
                  if( NIL != valid_$33 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( gaf, final_index_spec ) && pred.eql( assertions_high.gaf_predicate( gaf ) ) )
                  {
                    foundP = T;
                    if( NIL != assertions_high.asserted_assertionP( gaf ) )
                    {
                      found_assertedP = T;
                    }
                  }
                  done_var_$31 = makeBoolean( NIL == valid_$33 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( fort, NIL, pred ) )
      {
        final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( fort, NIL, pred );
        SubLObject done_var2 = NIL;
        final SubLObject token_var2 = NIL;
        while ( NIL == done_var2)
        {
          final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
          final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
          if( NIL != valid2 )
          {
            SubLObject final_index_iterator2 = NIL;
            try
            {
              final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw93$GAF, NIL, NIL );
              SubLObject done_var_$32 = NIL;
              final SubLObject token_var_$33 = NIL;
              while ( NIL == done_var_$32)
              {
                final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$33 );
                final SubLObject valid_$34 = makeBoolean( !token_var_$33.eql( gaf2 ) );
                if( NIL != valid_$34 )
                {
                  foundP = T;
                  if( NIL != assertions_high.asserted_assertionP( gaf2 ) )
                  {
                    found_assertedP = T;
                  }
                }
                done_var_$32 = makeBoolean( NIL == valid_$34 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator2 )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$35, thread );
              }
            }
          }
          done_var2 = makeBoolean( NIL == valid2 );
        }
      }
      if( NIL != ensure_assertedP )
      {
        if( NIL == found_assertedP )
        {
          note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( fort ), new SubLObject[] { $str101$_is_missing_an_asserted_value_for, format_nil.format_nil_a_no_copy( pred ),
            $str51$_in_, format_nil.format_nil_a_no_copy( mt )
          } ) );
        }
      }
      else if( NIL == foundP )
      {
        note_simple_db_validation_problem( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( fort ), new SubLObject[] { $str102$_is_missing_a_value_for_, format_nil.format_nil_a_no_copy( pred ), $str51$_in_,
          format_nil.format_nil_a_no_copy( mt )
        } ) );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 16769L)
  public static SubLObject convert_simple_sksi_db_to_complex(final SubLObject sks, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    v_properties = list_utilities.merge_plist( v_properties, $convert_simple_sksi_db_to_complex_override_properties$.getDynamicValue( thread ) );
    final SubLObject repropagateP = conses_high.getf( v_properties, $kw103$REPROPAGATE_, UNPROVIDED );
    if( NIL != repropagateP )
    {
      SubLObject times;
      SubLObject n;
      for( times = ( NIL != subl_promotions.positive_integer_p( repropagateP ) ) ? repropagateP : ONE_INTEGER, n = NIL, n = ZERO_INTEGER; n.numL( times ); n = Numbers.add( n, ONE_INTEGER ) )
      {
        repropagate_simple_db( sks );
      }
    }
    final SubLObject simple_assertions_queue = queues.create_queue( UNPROVIDED );
    SubLObject simple_assertions_checked_count = ZERO_INTEGER;
    SubLObject complex_assertions_asserted_count = ZERO_INTEGER;
    SubLObject simple_assertions_removed_count = ZERO_INTEGER;
    SubLObject processed_simple_assertions = NIL;
    SubLObject complex_assertions_to_assert = NIL;
    queues.enqueue_all( simple_sksi_assertions_for_sks( sks ), simple_assertions_queue );
    final SubLObject str = Sequences.cconcatenate( $str104$Processing_, new SubLObject[] { format_nil.format_nil_a_no_copy( queues.queue_size( simple_assertions_queue ) ), $str105$__seed__simple_sksi_assertions_fo,
      format_nil.format_nil_a_no_copy( sks )
    } );
    SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
    SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
    SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
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
      while ( NIL != queues.queue_not_empty_p( simple_assertions_queue ))
      {
        final SubLObject simple_assertion = queues.dequeue( simple_assertions_queue );
        simple_assertions_checked_count = Numbers.add( simple_assertions_checked_count, ONE_INTEGER );
        processed_simple_assertions = ConsesLow.cons( simple_assertion, processed_simple_assertions );
        final SubLObject set_contents_var = assertions_high.assertion_dependents( simple_assertion );
        SubLObject basis_object;
        SubLObject state;
        SubLObject deduction;
        SubLObject dependent_assertion;
        SubLObject item_var;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          deduction = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, deduction ) )
          {
            dependent_assertion = deductions_high.deduction_supported_object( deduction );
            if( NIL != assertion_handles.assertion_p( dependent_assertion ) )
            {
              if( NIL == subl_promotions.memberP( dependent_assertion, processed_simple_assertions, UNPROVIDED, UNPROVIDED ) )
              {
                if( NIL != simple_sksi_assertionP( dependent_assertion ) )
                {
                  queues.enqueue( dependent_assertion, simple_assertions_queue );
                }
                else if( NIL == assertions_high.asserted_assertionP( dependent_assertion ) )
                {
                  item_var = dependent_assertion;
                  if( NIL == conses_high.member( item_var, complex_assertions_to_assert, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    complex_assertions_to_assert = ConsesLow.cons( item_var, complex_assertions_to_assert );
                  }
                }
              }
            }
          }
        }
      }
      PrintLow.format( T, $str106$___A_simple_sksi_assertions_check, simple_assertions_checked_count );
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
    if( NIL != conses_high.getf( v_properties, $kw107$VERBOSE_, UNPROVIDED ) )
    {
      SubLObject cdolist_list_var = complex_assertions_to_assert;
      SubLObject a = NIL;
      a = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str108$___S_in__S__, uncanonicalizer.assertion_el_formula( a ), assertions_high.assertion_mt( a ) );
        cdolist_list_var = cdolist_list_var.rest();
        a = cdolist_list_var.first();
      }
      cdolist_list_var = processed_simple_assertions;
      a = NIL;
      a = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( T, $str109$___S_in__S__, uncanonicalizer.assertion_el_formula( a ), assertions_high.assertion_mt( a ) );
        cdolist_list_var = cdolist_list_var.rest();
        a = cdolist_list_var.first();
      }
    }
    if( NIL != conses_high.getf( v_properties, $kw110$READ_ONLY_, UNPROVIDED ) )
    {
      return NIL;
    }
    final SubLObject list_var = complex_assertions_to_assert;
    _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str111$Adding_asserted_arguments_to_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( complex_assertions_to_assert ) ),
        $str112$_complex_sksi_assertions_for_, format_nil.format_nil_a_no_copy( sks )
      } ) ) ? Sequences.cconcatenate( $str111$Adding_asserted_arguments_to_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( complex_assertions_to_assert ) ), $str112$_complex_sksi_assertions_for_,
        format_nil.format_nil_a_no_copy( sks )
      } ) : $str11$cdolist, thread );
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
        SubLObject a2 = NIL;
        a2 = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          ke.ke_assert_now( uncanonicalizer.assertion_el_formula( a2 ), assertions_high.assertion_mt( a2 ), assertions_high.assertion_strength( a2 ), assertions_high.assertion_direction( a2 ) );
          if( NIL != assertions_high.asserted_assertionP( a2 ) )
          {
            complex_assertions_asserted_count = Numbers.add( complex_assertions_asserted_count, ONE_INTEGER );
          }
          else
          {
            Errors.warn( $str113$Assert_failed_for__A, a2 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          a2 = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
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
    SubLObject simple_assertions_to_kill = NIL;
    SubLObject cdolist_list_var2 = processed_simple_assertions;
    SubLObject a3 = NIL;
    a3 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != assertions_high.assertion_dependents( a3 ) )
      {
        simple_assertions_to_kill = ConsesLow.cons( a3, simple_assertions_to_kill );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      a3 = cdolist_list_var2.first();
    }
    final SubLObject list_var2 = simple_assertions_to_kill;
    final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( ( NIL != Sequences.cconcatenate( $str114$Killing_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( processed_simple_assertions ) ),
        $str115$_simple_sksi_assertions_for_, format_nil.format_nil_a_no_copy( sks )
      } ) ) ? Sequences.cconcatenate( $str114$Killing_, new SubLObject[] { format_nil.format_nil_a_no_copy( Sequences.length( processed_simple_assertions ) ), $str115$_simple_sksi_assertions_for_, format_nil
          .format_nil_a_no_copy( sks )
      } ) : $str11$cdolist, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( list_var2 ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var2 = list_var2;
        SubLObject a4 = NIL;
        a4 = csome_list_var2.first();
        while ( NIL != csome_list_var2)
        {
          if( NIL != assertion_handles.valid_assertionP( a4, UNPROVIDED ) )
          {
            if( NIL != assertion_utilities.gaf_assertion_with_pred_p( a4, $const116$isa ) && NIL != kb_utilities.kbeq( assertions_high.gaf_arg2( a4 ), $const0$SimpleDatabase ) )
            {
              ke.ke_assert_now( el_utilities.make_binary_formula( $const116$isa, assertions_high.gaf_arg1( a4 ), $const117$Database_Physical ), assertions_high.assertion_mt( a4 ), UNPROVIDED, UNPROVIDED );
              ke.ke_assert_now( el_utilities.make_binary_formula( $const116$isa, assertions_high.gaf_arg1( a4 ), $const118$StructuredKnowledgeSource_TopLeve ), assertions_high.assertion_mt( a4 ), UNPROVIDED,
                  UNPROVIDED );
              complex_assertions_asserted_count = Numbers.add( complex_assertions_asserted_count, TWO_INTEGER );
            }
            simple_assertions_removed_count = Numbers.add( simple_assertions_removed_count, ONE_INTEGER );
            ke.ke_unassert_assertion_now( a4 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var2 = csome_list_var2.rest();
          a4 = csome_list_var2.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_16, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_15, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_14, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_13, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_12, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_11, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_10, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_9, thread );
    }
    return Values.values( complex_assertions_asserted_count, simple_assertions_removed_count );
  }

  public static SubLObject declare_simple_db_file()
  {
    SubLFiles.declareFunction( me, "simple_sksi_dbP", "SIMPLE-SKSI-DB?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_simple_sksi_terms", "CLEAR-SIMPLE-SKSI-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_simple_sksi_terms", "REMOVE-SIMPLE-SKSI-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_terms_internal", "SIMPLE-SKSI-TERMS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_terms", "SIMPLE-SKSI-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_termP", "SIMPLE-SKSI-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_assertions_for_term", "SIMPLE-SKSI-ASSERTIONS-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_simple_sksi_assertions_for_sks", "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_simple_sksi_assertions_for_sks", "REMOVE-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_assertions_for_sks_internal", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_assertions_for_sks", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_sksi_assertionP", "SIMPLE-SKSI-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "repropagate_knowledge_source", "REPROPAGATE-KNOWLEDGE-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "repropagate_simple_db", "REPROPAGATE-SIMPLE-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_simple_db_valid", "ENSURE-SIMPLE-DB-VALID", 1, 2, false );
    SubLFiles.declareFunction( me, "validate_simple_db", "VALIDATE-SIMPLE-DB", 1, 2, false );
    SubLFiles.declareFunction( me, "validate_simple_table", "VALIDATE-SIMPLE-TABLE", 3, 0, false );
    SubLFiles.declareFunction( me, "ensure_all_fields_are_listed", "ENSURE-ALL-FIELDS-ARE-LISTED", 2, 0, false );
    SubLFiles.declareFunction( me, "ensure_temporal_or_atemporal_table", "ENSURE-TEMPORAL-OR-ATEMPORAL-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "validate_simple_physical_schema", "VALIDATE-SIMPLE-PHYSICAL-SCHEMA", 3, 0, false );
    SubLFiles.declareFunction( me, "validate_simple_logical_schema", "VALIDATE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false );
    SubLFiles.declareFunction( me, "validate_simple_logical_field_indexical", "VALIDATE-SIMPLE-LOGICAL-FIELD-INDEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "ensure_field_decoding_has_code_mappings", "ENSURE-FIELD-DECODING-HAS-CODE-MAPPINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "cmls_fn_nart_p", "CMLS-FN-NART-P", 1, 0, false );
    SubLFiles.declareFunction( me, "note_simple_db_validation_problem", "NOTE-SIMPLE-DB-VALIDATION-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_preds_have_deduced_values", "ENSURE-PREDS-HAVE-DEDUCED-VALUES", 3, 1, false );
    SubLFiles.declareFunction( me, "ensure_preds_have_values", "ENSURE-PREDS-HAVE-VALUES", 5, 0, false );
    SubLFiles.declareFunction( me, "ensure_pred_has_value", "ENSURE-PRED-HAS-VALUE", 5, 0, false );
    SubLFiles.declareFunction( me, "convert_simple_sksi_db_to_complex", "CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_simple_db_file()
  {
    $simple_sksi_terms_caching_state$ = SubLFiles.deflexical( "*SIMPLE-SKSI-TERMS-CACHING-STATE*", NIL );
    $simple_sksi_assertions_for_sks_caching_state$ = SubLFiles.deflexical( "*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*", NIL );
    $sksi_transcript_source_repropagationP$ = SubLFiles.defparameter( "*SKSI-TRANSCRIPT-SOURCE-REPROPAGATION?*", T );
    $simplified_sksi_predicates$ = SubLFiles.deflexical( "*SIMPLIFIED-SKSI-PREDICATES*", $list18 );
    $simple_db_validation_problems$ = SubLFiles.defparameter( "*SIMPLE-DB-VALIDATION-PROBLEMS*", $kw19$UNINITIALIZED );
    $convert_simple_sksi_db_to_complex_override_properties$ = SubLFiles.defparameter( "*CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX-OVERRIDE-PROPERTIES*", NIL );
    return NIL;
  }

  public static SubLObject setup_simple_db_file()
  {
    memoization_state.note_globally_cached_function( $sym1$SIMPLE_SKSI_TERMS );
    memoization_state.note_globally_cached_function( $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_simple_db_file();
  }

  @Override
  public void initializeVariables()
  {
    init_simple_db_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_simple_db_file();
  }
  static
  {
    me = new simple_db();
    $simple_sksi_terms_caching_state$ = null;
    $simple_sksi_assertions_for_sks_caching_state$ = null;
    $sksi_transcript_source_repropagationP$ = null;
    $simplified_sksi_predicates$ = null;
    $simple_db_validation_problems$ = null;
    $convert_simple_sksi_db_to_complex_override_properties$ = null;
    $const0$SimpleDatabase = constant_handles.reader_make_constant_shell( makeString( "SimpleDatabase" ) );
    $sym1$SIMPLE_SKSI_TERMS = makeSymbol( "SIMPLE-SKSI-TERMS" );
    $const2$TestPace = constant_handles.reader_make_constant_shell( makeString( "TestPace" ) );
    $kw3$NEG = makeKeyword( "NEG" );
    $const4$SimplifiedSKSIConstant = constant_handles.reader_make_constant_shell( makeString( "SimplifiedSKSIConstant" ) );
    $sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_ = makeSymbol( "*SIMPLE-SKSI-TERMS-CACHING-STATE*" );
    $sym6$CLEAR_SIMPLE_SKSI_TERMS = makeSymbol( "CLEAR-SIMPLE-SKSI-TERMS" );
    $sym7$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const8$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS = makeSymbol( "SIMPLE-SKSI-ASSERTIONS-FOR-SKS" );
    $str10$Gathering_simple_SKSI_assertions_ = makeString( "Gathering simple SKSI assertions in " );
    $str11$cdolist = makeString( "cdolist" );
    $sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_ = makeSymbol( "*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*" );
    $sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS = makeSymbol( "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS" );
    $sym14$SIMPLE_SKSI_TERM_ = makeSymbol( "SIMPLE-SKSI-TERM?" );
    $sym15$SK_SOURCE_IN_ANY_MT_P = makeSymbol( "SK-SOURCE-IN-ANY-MT-P" );
    $sym16$MICROTHEORY_P = makeSymbol( "MICROTHEORY-P" );
    $str17$Repropagating_ = makeString( "Repropagating " );
    $list18 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "tableInDBNamed" ) ), constant_handles.reader_make_constant_shell( makeString( "columnInDBTableNamed" ) ),
      constant_handles.reader_make_constant_shell( makeString( "objectSchemaTranslation" ) ), constant_handles.reader_make_constant_shell( makeString( "relationshipSchemaTranslation" ) ), constant_handles
          .reader_make_constant_shell( makeString( "assertionSchemaTranslation" ) ), constant_handles.reader_make_constant_shell( makeString( "tablePrimaryKey-SingleColumn" ) ), constant_handles
              .reader_make_constant_shell( makeString( "tablePrimaryKey" ) ), constant_handles.reader_make_constant_shell( makeString( "objectSchemaColumnPredicate" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "assertionTablePredicateColumn" ) ), constant_handles.reader_make_constant_shell( makeString( "dBTableArgNumMapping" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "dBTablePredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "tableFieldNameList" ) ), constant_handles.reader_make_constant_shell( makeString( "identityTranslationColumn" ) ),
      constant_handles.reader_make_constant_shell( makeString( "temporalTranslationColumns" ) ), constant_handles.reader_make_constant_shell( makeString( "dBTableLogicalFieldIndexicalForArgNum" ) ), constant_handles
          .reader_make_constant_shell( makeString( "dBTableTemporalLogicalFieldIndexicals" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFieldIndexicalTranslationType" ) ), constant_handles
              .reader_make_constant_shell( makeString( "dBFieldTranslationInputs" ) ), constant_handles.reader_make_constant_shell( makeString( "predicateAndArgnumForLogicalFieldIndexical" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "nonContextualizedMeaningSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaFieldNameList" ) )
    } );
    $kw19$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list20 = ConsesLow.list( makeKeyword( "LOOKS-GOOD" ) );
    $str21$Simple_DB_invalid___s = makeString( "Simple DB invalid: ~s" );
    $str22$Validating__a_____ = makeString( "Validating ~a...~%" );
    $str23$DB_was_not_simple__returning__loo = makeString( "DB was not simple, returning :looks-good anyway" );
    $list24 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ) );
    $const25$SKSIMt = constant_handles.reader_make_constant_shell( makeString( "SKSIMt" ) );
    $list26 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "mappingMt" ) ) );
    $str27$Using_mapping_mt__a__ = makeString( "Using mapping mt ~a~%" );
    $list28 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) ), constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) ), constant_handles
        .reader_make_constant_shell( makeString( "passwordForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
            "portNumberForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) ), constant_handles.reader_make_constant_shell( makeString( "sksProxyPort" ) ) );
    $list29 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ) );
    $str30$_is_not___sksRepresentationComple = makeString( " is not #$sksRepresentationComplete" );
    $str31$could_not_find_any_tables_in_ = makeString( "could not find any tables in " );
    $str32$in_mappingMt_ = makeString( "in mappingMt " );
    $list33 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "tableInDBNamed" ) ), constant_handles
        .reader_make_constant_shell( makeString( "tableFieldNameList" ) ), constant_handles.reader_make_constant_shell( makeString( "contentMt" ) ), constant_handles.reader_make_constant_shell( makeString(
            "physicalSchemaWithNameForKS" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalSchemaWithNameForKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                "columnInDBTableNamed" ) ) );
    $const34$schemaTranslation = constant_handles.reader_make_constant_shell( makeString( "schemaTranslation" ) );
    $kw35$DEPTH = makeKeyword( "DEPTH" );
    $kw36$STACK = makeKeyword( "STACK" );
    $kw37$QUEUE = makeKeyword( "QUEUE" );
    $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw39$ERROR = makeKeyword( "ERROR" );
    $str40$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym41$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw42$CERROR = makeKeyword( "CERROR" );
    $str43$continue_anyway = makeString( "continue anyway" );
    $kw44$WARN = makeKeyword( "WARN" );
    $str45$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const46$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str48$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str49$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $str50$no___schemaTranslation_for_ = makeString( "no #$schemaTranslation for " );
    $str51$_in_ = makeString( " in " );
    $const52$objectSchemaTranslation = constant_handles.reader_make_constant_shell( makeString( "objectSchemaTranslation" ) );
    $list53 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "tablePrimaryKey-SingleColumn" ) ) );
    $const54$objectSchemaColumnPredicate = constant_handles.reader_make_constant_shell( makeString( "objectSchemaColumnPredicate" ) );
    $const55$columnInDBTableNamed = constant_handles.reader_make_constant_shell( makeString( "columnInDBTableNamed" ) );
    $str56$expected_at_least_2_columns__via_ = makeString( "expected at least 2 columns (via #$columnInDBTableNamed) in " );
    $str57$__got_ = makeString( ", got " );
    $str58$no_columns__via___columnInDBTable = makeString( "no columns (via #$columnInDBTableNamed) in " );
    $str59$_have_an___objectSchemaColumnPred = makeString( " have an #$objectSchemaColumnPredicate" );
    $const60$relationshipSchemaTranslation = constant_handles.reader_make_constant_shell( makeString( "relationshipSchemaTranslation" ) );
    $list61 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dBTablePredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "dBTableArgNumMapping" ) ) );
    $const62$assertionSchemaTranslation = constant_handles.reader_make_constant_shell( makeString( "assertionSchemaTranslation" ) );
    $list63 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionTablePredicateColumn" ) ), constant_handles.reader_make_constant_shell( makeString( "dBTableArgNumMapping" ) ) );
    $const64$DatabaseColumn = constant_handles.reader_make_constant_shell( makeString( "DatabaseColumn" ) );
    $str65$_is_not_a___DatabaseColumn__argum = makeString( " is not a #$DatabaseColumn (argument to #$dBTableArgNumMapping for " );
    $str66$_ = makeString( ")" );
    $list67 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "identityTranslationColumn" ) ) );
    $const68$dBTableArgNumMapping = constant_handles.reader_make_constant_shell( makeString( "dBTableArgNumMapping" ) );
    $str69$unexpected_schema_translation_pre = makeString( "unexpected schema translation pred " );
    $str70$_for_ = makeString( " for " );
    $str71$Expected_exactly_one_physical_sch = makeString( "Expected exactly one physical schema for " );
    $str72$__via___physicalSchemaSourceMap__ = makeString( " (via #$physicalSchemaSourceMap), got " );
    $const73$tableFieldNameList = constant_handles.reader_make_constant_shell( makeString( "tableFieldNameList" ) );
    $kw74$TRUE = makeKeyword( "TRUE" );
    $str75$Found_column_ = makeString( "Found column " );
    $str76$_not_listed_in___tableFieldNameLi = makeString( " not listed in #$tableFieldNameList for " );
    $str77$__If_it_is_a_column_in_the_table_ = makeString( ". If it is a column in the table, add it to the #$tableFieldNameList. If not, remove it as a #$columnInDBTableNamed." );
    $const78$NonCanonicallyTemporallyIndexedDB = constant_handles.reader_make_constant_shell( makeString( "NonCanonicallyTemporallyIndexedDBTable" ) );
    $const79$CanonicallyTemporallyIndexedDBTab = constant_handles.reader_make_constant_shell( makeString( "CanonicallyTemporallyIndexedDBTable" ) );
    $list80 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalTranslationColumns" ) ) );
    $const81$temporalTranslationColumns = constant_handles.reader_make_constant_shell( makeString( "temporalTranslationColumns" ) );
    $str82$Found_no___temporalTranslationCol = makeString( "Found no #$temporalTranslationColumns for " );
    $list83 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalColumnNullMapsTo" ) ) );
    $str84$_is_not_known_to_be_a___Canonical = makeString( " is not known to be a #$CanonicallyTemporallyIndexedDBTable or a #$NonCanonicallyTemporallyIndexedDBTable in " );
    $list85 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "physicalFields" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldIndexicals" ) ), constant_handles
        .reader_make_constant_shell( makeString( "schemaFieldList" ) ), constant_handles.reader_make_constant_shell( makeString( "primaryKey" ) ) );
    $const86$fieldEncoding = constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) );
    $str87$Expected_exactly_one_logical_sche = makeString( "Expected exactly one logical schema for " );
    $str88$__via___logicalPhysicalSchemaMap_ = makeString( " (via #$logicalPhysicalSchemaMap), got " );
    $list89 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) ),
      constant_handles.reader_make_constant_shell( makeString( "logicalFieldIndexicals" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) ), constant_handles
          .reader_make_constant_shell( makeString( "logicalSchemaFieldOfTypeWithMultiplicity" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalSchemaFieldIndexicalOfTypeWithMultiplicity" ) ),
      constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) ), constant_handles.reader_make_constant_shell( makeString( "nonContextualizedMeaningSentence" ) ), constant_handles
          .reader_make_constant_shell( makeString( "meaningSentenceOfSchema" ) )
    } );
    $list90 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) ) );
    $sym91$CMLS_FN_NART_P = makeSymbol( "CMLS-FN-NART-P" );
    $const92$codeMapping = constant_handles.reader_make_constant_shell( makeString( "codeMapping" ) );
    $kw93$GAF = makeKeyword( "GAF" );
    $const94$logicalFieldValueWithFieldName = constant_handles.reader_make_constant_shell( makeString( "logicalFieldValueWithFieldName" ) );
    $str95$Found_no___codeMapping_for_ = makeString( "Found no #$codeMapping for " );
    $str96$__the_indexical_for_the_field_nam = makeString( ", the indexical for the field named " );
    $str97$__Ensure_one_exists_via_either_as = makeString( ". Ensure one exists via either asserting it directly or concluding it via #$synonymousExternalConceptToken." );
    $const98$fieldDecoding = constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) );
    $const99$CMLSFn = constant_handles.reader_make_constant_shell( makeString( "CMLSFn" ) );
    $sym100$LISTP = makeSymbol( "LISTP" );
    $str101$_is_missing_an_asserted_value_for = makeString( " is missing an asserted value for " );
    $str102$_is_missing_a_value_for_ = makeString( " is missing a value for " );
    $kw103$REPROPAGATE_ = makeKeyword( "REPROPAGATE?" );
    $str104$Processing_ = makeString( "Processing " );
    $str105$__seed__simple_sksi_assertions_fo = makeString( " (seed) simple sksi assertions for " );
    $str106$___A_simple_sksi_assertions_check = makeString( "~&~A simple sksi assertions checked~%" );
    $kw107$VERBOSE_ = makeKeyword( "VERBOSE?" );
    $str108$___S_in__S__ = makeString( "+ ~S in ~S~%" );
    $str109$___S_in__S__ = makeString( "- ~S in ~S~%" );
    $kw110$READ_ONLY_ = makeKeyword( "READ-ONLY?" );
    $str111$Adding_asserted_arguments_to_ = makeString( "Adding asserted arguments to " );
    $str112$_complex_sksi_assertions_for_ = makeString( " complex sksi assertions for " );
    $str113$Assert_failed_for__A = makeString( "Assert failed for ~A" );
    $str114$Killing_ = makeString( "Killing " );
    $str115$_simple_sksi_assertions_for_ = makeString( " simple sksi assertions for " );
    $const116$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const117$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const118$StructuredKnowledgeSource_TopLeve = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-TopLevel" ) );
  }
}
/*
 * 
 * Total time: 2712 ms
 * 
 */