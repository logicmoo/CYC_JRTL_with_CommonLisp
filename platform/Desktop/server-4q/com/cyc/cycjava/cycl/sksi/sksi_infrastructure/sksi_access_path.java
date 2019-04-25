package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_hl_support_utilities;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.kb_paths;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_access_path
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path";
  public static final String myFingerPrint = "bd88d9b3f083e84a516d0d923768cf30616205aea888627218d9b65b3f176193";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 1685L)
  private static SubLSymbol $external_source_access_path_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 8154L)
  private static SubLSymbol $ignore_access_path_errorsP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 19922L)
  private static SubLSymbol $red_candidate_access_path_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 20364L)
  private static SubLSymbol $sksi_red_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 20423L)
  private static SubLSymbol $sksi_red_access_path_prefix$;
  private static final SubLSymbol $sym0$DETERMINE_SKS_TYPE;
  private static final SubLSymbol $sym1$_EXTERNAL_SOURCE_ACCESS_PATH_CACHE_;
  private static final SubLObject $const2$SpreadsheetSKS;
  private static final SubLObject $const3$structuredKnowledgeSourceName;
  private static final SubLSymbol $kw4$NOT_FOUND;
  private static final SubLString $str5$TestLanguageSpoken_DB;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLSymbol $sym8$_IGNORE_ACCESS_PATH_ERRORS__;
  private static final SubLObject $const9$Database_Physical;
  private static final SubLObject $const10$WebPage_AIS;
  private static final SubLObject $const11$CycKB;
  private static final SubLObject $const12$FileHashTable_File;
  private static final SubLObject $const13$CommonObjectRequestBrokerArchitec;
  private static final SubLObject $const14$RDFTripleStore_Physical;
  private static final SubLString $str15$Unknown_access_path_type__A_for__;
  private static final SubLObject $const16$sksIsa;
  private static final SubLSymbol $kw17$CACHE;
  private static final SubLSymbol $kw18$SKS;
  private static final SubLObject $const19$userNameForSKS;
  private static final SubLObject $const20$passwordForSKS;
  private static final SubLObject $const21$serverOfSKS;
  private static final SubLObject $const22$portNumberForSKS;
  private static final SubLObject $const23$sksProxyHost;
  private static final SubLObject $const24$sksProxyPort;
  private static final SubLObject $const25$subProtocolForSKS;
  private static final SubLObject $const26$sqlProgramForSKS;
  private static final SubLSymbol $kw27$TIMEOUT;
  private static final SubLSymbol $kw28$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym29$IGNORE_ERRORS_HANDLER;
  private static final SubLObject $const30$httpdRequestURLForSKS;
  private static final SubLObject $const31$httpdRequestQueryTemplateForSKS;
  private static final SubLObject $const32$httpdRequestMethodForSKS;
  private static final SubLSymbol $kw33$PARSING_METHOD;
  private static final SubLSymbol $kw34$PARSING_PROGRAM;
  private static final SubLSymbol $kw35$PHYSICAL_FIELD_NAMES;
  private static final SubLObject $const36$filenameForSKS;
  private static final SubLObject $const37$keyTestFunctionForSKS;
  private static final SubLObject $const38$valueTestFunctionForSKS;
  private static final SubLObject $const39$serializationTypeForSKS;
  private static final SubLObject $const40$corbaSKSInitialORBHost;
  private static final SubLObject $const41$corbaSKSInitialORBPort;
  private static final SubLObject $const42$corbaSKSServiceName;
  private static final SubLObject $const43$corbaSKSInitialObjectClass;
  private static final SubLString $str44$Helper;
  private static final SubLSymbol $kw45$INITIAL_ORB_HOST;
  private static final SubLSymbol $kw46$INITIAL_ORB_PORT;
  private static final SubLSymbol $kw47$SERVICE_NAME;
  private static final SubLSymbol $kw48$INITIAL_OBJECT_CLASS;
  private static final SubLSymbol $kw49$INITIAL_OBJECT_CLASS_HELPER;
  private static final SubLObject $const50$baseNamespaceForSKS;
  private static final SubLObject $const51$nameSpacePrefixForSKS;
  private static final SubLObject $const52$rdfStoreIdentifierForSKS;
  private static final SubLObject $const53$relativePathForAPIAccessToSKS;
  private static final SubLList $list54;
  private static final SubLString $str55$application_sksi;
  private static final SubLString $str56$access_paths;
  private static final SubLString $str57$_;
  private static final SubLString $str58$__;
  private static final SubLSymbol $kw59$OPAQUE;
  private static final SubLObject $const60$sksConnectionTimeout;
  private static final SubLSymbol $kw61$TRUE;
  private static final SubLObject $const62$sksiTargetForSpreadsheet;
  private static final SubLString $str63$_;
  private static final SubLObject $const64$HTTP_GET_RequestMethod;
  private static final SubLSymbol $kw65$GET;
  private static final SubLObject $const66$HTTP_POST_RequestMethod;
  private static final SubLSymbol $kw67$POST;
  private static final SubLString $str68$Unknown_HTTP_request_method__S_fo;
  private static final SubLObject $const69$httpdRequestSubLBooleanParsingPro;
  private static final SubLSymbol $kw70$SUBLBOOLEAN;
  private static final SubLObject $const71$httpdRequestUnboundOnlySubLParsin;
  private static final SubLSymbol $kw72$SUBLUNBOUNDONLY;
  private static final SubLSymbol $kw73$SUBL;
  private static final SubLObject $const74$httpdRequestSubLParsingProgramFor;
  private static final SubLObject $const75$uriString;
  private static final SubLList $list76;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$STRING_LESSP;
  private static final SubLSymbol $sym80$FIRST;
  private static final SubLSymbol $sym81$STRINGP;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 1080L)
  public static SubLObject structured_knowledge_source_type(final SubLObject access_path)
  {
    return access_path_type( access_path );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 1417L)
  public static SubLObject determine_sks_type_internal(final SubLObject sk_source, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return get_sks_type( sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 1417L)
  public static SubLObject determine_sks_type(final SubLObject sk_source, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return determine_sks_type_internal( sk_source, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym0$DETERMINE_SKS_TYPE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym0$DETERMINE_SKS_TYPE, TWO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym0$DETERMINE_SKS_TYPE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( sk_source, mt_info );
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
        if( sk_source.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( determine_sks_type_internal( sk_source, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sk_source, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 1583L)
  public static SubLObject determine_sks_db_sql_flavor(final SubLObject sk_source)
  {
    return get_sks_db_sql_flavor( sk_source );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 2227L)
  public static SubLObject clear_external_source_access_path_cache()
  {
    dictionary.clear_dictionary( $external_source_access_path_cache$.getGlobalValue() );
    return $external_source_access_path_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 2388L)
  public static SubLObject initialize_external_source_access_path_cache(SubLObject allowed_sources_onlyP)
  {
    if( allowed_sources_onlyP == UNPROVIDED )
    {
      allowed_sources_onlyP = NIL;
    }
    clear_external_source_access_path_cache();
    SubLObject cdolist_list_var;
    final SubLObject sks_list = cdolist_list_var = ( ( NIL != allowed_sources_onlyP ) ? sksi_infrastructure_utilities.list_of_external_sources_activated_in_image()
        : sksi_infrastructure_utilities.gather_all_complete_knowledge_sources() );
    SubLObject sks = NIL;
    sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      external_source_access_path( sks, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      sks = cdolist_list_var.first();
    }
    return $external_source_access_path_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 3490L)
  public static SubLObject external_source_access_path(final SubLObject sk_source, SubLObject physical_schema, SubLObject mapping_mt)
  {
    if( physical_schema == UNPROVIDED )
    {
      physical_schema = NIL;
    }
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values( $external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED );
    if( NIL == dictionary.dictionary_p( mt_access_path_subcache ) )
    {
      mt_access_path_subcache = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
      final SubLObject access_path = external_source_access_path_int( sk_source, physical_schema, mapping_mt );
      dictionary.dictionary_enter( mt_access_path_subcache, mapping_mt, access_path );
      dictionary.dictionary_enter( $external_source_access_path_cache$.getGlobalValue(), sk_source, mt_access_path_subcache );
      return access_path;
    }
    SubLObject access_path = dictionary.dictionary_lookup_without_values( mt_access_path_subcache, mapping_mt, UNPROVIDED );
    if( NIL == access_path_p( access_path ) )
    {
      access_path = external_source_access_path_int( sk_source, physical_schema, mapping_mt );
      dictionary.dictionary_enter( mt_access_path_subcache, mapping_mt, access_path );
      return access_path;
    }
    if( NIL != isa.isaP( sk_source, $const2$SpreadsheetSKS, UNPROVIDED, UNPROVIDED ) )
    {
      access_path_remove( access_path, $const3$structuredKnowledgeSourceName );
      final SubLObject mt_var = mapping_mt;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        access_path_enter( access_path, $const3$structuredKnowledgeSourceName, get_spreadsheet_db_name( sk_source ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return access_path;
    }
    return access_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 5048L)
  public static SubLObject external_source_access_path_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject mapping_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject access_path = NIL;
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mapping_mt ), thread );
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mapping_mt ), thread );
          access_path = sksi_determine_access_path( sk_source, physical_schema, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return access_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 5335L)
  public static SubLObject get_external_source_access_path_from_cache(final SubLObject sk_source, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values( $external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED );
    if( NIL != dictionary.dictionary_p( mt_access_path_subcache ) )
    {
      return dictionary.dictionary_lookup_without_values( mt_access_path_subcache, mapping_mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 5896L)
  public static SubLObject remove_external_source_access_path_from_cache(final SubLObject sk_source, SubLObject mapping_mt)
  {
    if( mapping_mt == UNPROVIDED )
    {
      mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sk_source );
    }
    final SubLObject mt_access_path_subcache = dictionary.dictionary_lookup_without_values( $external_source_access_path_cache$.getGlobalValue(), sk_source, UNPROVIDED );
    if( NIL != dictionary.dictionary_p( mt_access_path_subcache ) )
    {
      return dictionary.dictionary_remove( mt_access_path_subcache, mapping_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 6358L)
  public static SubLObject add_to_external_source_access_path(final SubLObject sk_source, final SubLObject property, final SubLObject value)
  {
    final SubLObject access_path = get_external_source_access_path_from_cache( sk_source, UNPROVIDED );
    if( NIL != access_path_p( access_path ) )
    {
      access_path_enter( access_path, property, value );
    }
    return access_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 7074L)
  public static SubLObject remove_from_external_source_access_path(final SubLObject sk_source, final SubLObject property, final SubLObject value)
  {
    final SubLObject access_path = get_external_source_access_path_from_cache( sk_source, UNPROVIDED );
    if( NIL != access_path_p( access_path ) )
    {
      final SubLObject current_value = access_path_lookup( access_path, property, $kw4$NOT_FOUND );
      if( value.equal( current_value ) )
      {
        access_path_remove( access_path, property );
      }
    }
    return access_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 7626L)
  public static SubLObject sksi_determine_access_path(final SubLObject sk_source, SubLObject physical_schema, SubLObject ignore_errorsP)
  {
    if( physical_schema == UNPROVIDED )
    {
      physical_schema = NIL;
    }
    if( ignore_errorsP == UNPROVIDED )
    {
      ignore_errorsP = NIL;
    }
    if( NIL != forts.fort_p( sk_source ) && kb_paths.fort_name( sk_source ).equal( $str5$TestLanguageSpoken_DB ) )
    {
      return new_cache_access_path();
    }
    return sksi_determine_access_path_int( sk_source, physical_schema, ignore_errorsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 8378L)
  public static SubLObject with_ignore_access_path_errors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject ignoreP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    ignoreP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym7$CLET, ConsesLow.list( ConsesLow.list( $sym8$_IGNORE_ACCESS_PATH_ERRORS__, ignoreP ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 8529L)
  public static SubLObject ignore_access_path_errorsP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $ignore_access_path_errorsP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 8614L)
  public static SubLObject sksi_determine_access_path_int(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject ignore_errorsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject access_path = NIL;
    final SubLObject _prev_bind_0 = $ignore_access_path_errorsP$.currentBinding( thread );
    try
    {
      $ignore_access_path_errorsP$.bind( ignore_errorsP, thread );
      access_path = sksi_determine_access_path_int2( sk_source, physical_schema );
    }
    finally
    {
      $ignore_access_path_errorsP$.rebind( _prev_bind_0, thread );
    }
    return access_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 8893L)
  public static SubLObject sksi_determine_access_path_int2(final SubLObject sk_source, SubLObject physical_schema)
  {
    final SubLObject pcase_var;
    final SubLObject type = pcase_var = determine_sks_type( sk_source, UNPROVIDED );
    if( pcase_var.eql( $const9$Database_Physical ) )
    {
      if( NIL != isa.isaP( sk_source, $const2$SpreadsheetSKS, UNPROVIDED, UNPROVIDED ) )
      {
        return spreadsheet_determine_db_access_path( sk_source );
      }
      return sksi_determine_db_access_path( sk_source );
    }
    else
    {
      if( pcase_var.eql( $const10$WebPage_AIS ) )
      {
        if( NIL == physical_schema )
        {
          physical_schema = sksi_kb_accessors.sk_source_complex_physical_schemata( sk_source ).first();
        }
        return sksi_determine_web_page_access_path( sk_source, physical_schema );
      }
      if( pcase_var.eql( $const11$CycKB ) )
      {
        return sksi_determine_kb_access_path( sk_source );
      }
      if( pcase_var.eql( $const12$FileHashTable_File ) )
      {
        return sksi_determine_fht_access_path( sk_source );
      }
      if( pcase_var.eql( $const13$CommonObjectRequestBrokerArchitec ) )
      {
        return sksi_determine_corba_access_path( sk_source );
      }
      if( pcase_var.eql( $const14$RDFTripleStore_Physical ) )
      {
        return sksi_determine_rdf_access_path( sk_source );
      }
      if( NIL != ignore_access_path_errorsP() )
      {
        return NIL;
      }
      Errors.error( $str15$Unknown_access_path_type__A_for__, type, sk_source );
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 9963L)
  public static SubLObject new_cache_access_path()
  {
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $const16$sksIsa, $kw17$CACHE );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 10294L)
  public static SubLObject sksi_determine_db_access_path(final SubLObject sk_source)
  {
    final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks( sk_source );
    final SubLObject name = get_sks_db_name( sk_source );
    final SubLObject user_name = get_sks_db_user_name( top_level_source );
    final SubLObject password = get_sks_db_password( top_level_source );
    final SubLObject server = get_sks_server( top_level_source );
    final SubLObject port = get_sks_port( top_level_source );
    final SubLObject proxy_server = get_sks_proxy_server( top_level_source );
    final SubLObject proxy_port = get_sks_proxy_port( top_level_source );
    final SubLObject subprotocol = get_sks_db_subprotocol( top_level_source );
    final SubLObject sql_flavor = get_sks_db_sql_flavor( top_level_source );
    final SubLObject timeout = get_sks_open_connection_timeout( top_level_source );
    return new_db_access_path( sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, sql_flavor, timeout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 11153L)
  public static SubLObject spreadsheet_determine_db_access_path(final SubLObject sk_source)
  {
    final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks( sk_source );
    final SubLObject name = get_spreadsheet_db_name( sk_source );
    final SubLObject user_name = get_sks_db_user_name( top_level_source );
    final SubLObject password = get_sks_db_password( top_level_source );
    final SubLObject server = get_sks_server( top_level_source );
    final SubLObject port = get_sks_port( top_level_source );
    final SubLObject proxy_server = get_sks_proxy_server( top_level_source );
    final SubLObject proxy_port = get_sks_proxy_port( top_level_source );
    final SubLObject subprotocol = get_sks_db_subprotocol( top_level_source );
    final SubLObject sql_flavor = get_sks_db_sql_flavor( top_level_source );
    final SubLObject timeout = get_sks_open_connection_timeout( top_level_source );
    return new_db_access_path( sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, sql_flavor, timeout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 11984L)
  public static SubLObject new_db_access_path(final SubLObject sk_source, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject server, final SubLObject port,
      final SubLObject proxy_server, final SubLObject proxy_port, final SubLObject subprotocol, final SubLObject sql_flavor, final SubLObject timeout)
  {
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $kw18$SKS, sk_source );
    access_path_enter( ap, $const16$sksIsa, $const9$Database_Physical );
    access_path_enter( ap, $const3$structuredKnowledgeSourceName, db );
    access_path_enter( ap, $const19$userNameForSKS, user );
    access_path_enter( ap, $const20$passwordForSKS, password );
    access_path_enter( ap, $const21$serverOfSKS, server );
    access_path_enter( ap, $const22$portNumberForSKS, port );
    access_path_enter( ap, $const23$sksProxyHost, proxy_server );
    access_path_enter( ap, $const24$sksProxyPort, proxy_port );
    access_path_enter( ap, $const25$subProtocolForSKS, subprotocol );
    access_path_enter( ap, $const26$sqlProgramForSKS, sql_flavor );
    access_path_enter( ap, $kw27$TIMEOUT, timeout );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 12797L)
  public static SubLObject sksi_determine_web_page_access_path(final SubLObject sk_source, final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject server = get_sks_server( sk_source );
    final SubLObject port = get_sks_port( sk_source );
    final SubLObject url = get_sks_http_url( sk_source );
    final SubLObject timeout = get_sks_open_connection_timeout( sk_source );
    final SubLObject request_method = get_sks_http_request_method( sk_source );
    final SubLObject query_template = get_sks_http_query_template( sk_source );
    final SubLObject parsing_method = get_sks_http_parsing_method( sk_source );
    final SubLObject parsing_program = get_sks_http_parsing_program( sk_source );
    SubLObject physical_field_names = NIL;
    if( NIL != ignore_access_path_errorsP() )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            physical_field_names = sksi_kb_accessors.physical_schema_field_name_list( physical_schema );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw28$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      physical_field_names = sksi_kb_accessors.physical_schema_field_name_list( physical_schema );
    }
    return new_web_page_access_path( sk_source, server, port, url, timeout, request_method, query_template, parsing_method, parsing_program, physical_field_names );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 13878L)
  public static SubLObject new_web_page_access_path(final SubLObject sk_source, final SubLObject server, final SubLObject port, final SubLObject url, final SubLObject timeout, final SubLObject request_method,
      final SubLObject query_template, final SubLObject parsing_method, final SubLObject parsing_program, final SubLObject physical_field_names)
  {
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $kw18$SKS, sk_source );
    access_path_enter( ap, $const16$sksIsa, $const10$WebPage_AIS );
    access_path_enter( ap, $const21$serverOfSKS, server );
    access_path_enter( ap, $const22$portNumberForSKS, port );
    access_path_enter( ap, $const30$httpdRequestURLForSKS, url );
    access_path_enter( ap, $kw27$TIMEOUT, timeout );
    access_path_enter( ap, $const31$httpdRequestQueryTemplateForSKS, query_template );
    access_path_enter( ap, $const32$httpdRequestMethodForSKS, request_method );
    access_path_enter( ap, $kw33$PARSING_METHOD, parsing_method );
    access_path_enter( ap, $kw34$PARSING_PROGRAM, parsing_program );
    access_path_enter( ap, $kw35$PHYSICAL_FIELD_NAMES, physical_field_names );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 14709L)
  public static SubLObject sksi_determine_kb_access_path(final SubLObject sk_source)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 14871L)
  public static SubLObject sksi_determine_fht_access_path(final SubLObject sk_source)
  {
    final SubLObject filename = get_sks_fht_filename( sk_source );
    final SubLObject key_test_fn = get_sks_fht_key_test_function( sk_source );
    final SubLObject value_test_fn = get_sks_fht_value_test_function( sk_source );
    final SubLObject serialization = get_sks_fht_serialization_type( sk_source );
    return new_fht_access_path( sk_source, filename, key_test_fn, value_test_fn, serialization );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 15321L)
  public static SubLObject new_fht_access_path(final SubLObject sk_source, final SubLObject filename, final SubLObject key_test_fn, final SubLObject value_test_fn, final SubLObject serialization)
  {
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $kw18$SKS, sk_source );
    access_path_enter( ap, $const16$sksIsa, $const12$FileHashTable_File );
    access_path_enter( ap, $const36$filenameForSKS, filename );
    access_path_enter( ap, $const37$keyTestFunctionForSKS, key_test_fn );
    access_path_enter( ap, $const38$valueTestFunctionForSKS, value_test_fn );
    access_path_enter( ap, $const39$serializationTypeForSKS, serialization );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 15816L)
  public static SubLObject sksi_determine_corba_access_path(final SubLObject sks)
  {
    final SubLObject proxy_host = sksi_sks_accessors.sks_fget( sks, $const23$sksProxyHost, UNPROVIDED );
    final SubLObject proxy_port = sksi_sks_accessors.sks_fget( sks, $const24$sksProxyPort, UNPROVIDED );
    final SubLObject initial_orb_host = sksi_sks_accessors.sks_fget( sks, $const40$corbaSKSInitialORBHost, UNPROVIDED );
    final SubLObject initial_orb_port = sksi_sks_accessors.sks_fget( sks, $const41$corbaSKSInitialORBPort, UNPROVIDED );
    final SubLObject service_name = sksi_sks_accessors.sks_fget( sks, $const42$corbaSKSServiceName, UNPROVIDED );
    final SubLObject initial_object_class = sksi_sks_accessors.sks_fget( sks, $const43$corbaSKSInitialObjectClass, UNPROVIDED );
    final SubLObject initial_object_class_helper = ( NIL != initial_object_class ) ? Sequences.cconcatenate( initial_object_class, $str44$Helper ) : NIL;
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $kw18$SKS, sks );
    access_path_enter( ap, $const16$sksIsa, $const13$CommonObjectRequestBrokerArchitec );
    access_path_enter( ap, $const23$sksProxyHost, proxy_host );
    access_path_enter( ap, $const24$sksProxyPort, proxy_port );
    access_path_enter( ap, $kw45$INITIAL_ORB_HOST, initial_orb_host );
    access_path_enter( ap, $kw46$INITIAL_ORB_PORT, initial_orb_port );
    access_path_enter( ap, $kw47$SERVICE_NAME, service_name );
    access_path_enter( ap, $kw48$INITIAL_OBJECT_CLASS, initial_object_class );
    access_path_enter( ap, $kw49$INITIAL_OBJECT_CLASS_HELPER, initial_object_class_helper );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 16986L)
  public static SubLObject sksi_determine_rdf_access_path(final SubLObject sk_source)
  {
    final SubLObject top_level_source = sksi_kb_accessors.max_genl_ks( sk_source );
    final SubLObject name = get_sks_db_name( sk_source );
    final SubLObject user_name = get_sks_db_user_name( top_level_source );
    final SubLObject password = get_sks_db_password( top_level_source );
    final SubLObject server = get_sks_server( top_level_source );
    final SubLObject port = get_sks_port( top_level_source );
    final SubLObject proxy_server = get_sks_proxy_server( top_level_source );
    final SubLObject proxy_port = get_sks_proxy_port( top_level_source );
    final SubLObject subprotocol = get_sks_db_subprotocol( top_level_source );
    final SubLObject base_uri = get_sks_base_uri( top_level_source );
    final SubLObject prefix_to_uri_map = get_sks_prefix_to_uri_map( top_level_source );
    final SubLObject rdf_store = get_sks_rdf_store( top_level_source );
    final SubLObject relative_path = get_sks_relative_path( top_level_source );
    final SubLObject timeout = get_sks_open_connection_timeout( top_level_source );
    return new_rdf_access_path( sk_source, name, user_name, password, server, port, proxy_server, proxy_port, subprotocol, base_uri, prefix_to_uri_map, rdf_store, relative_path, timeout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 18071L)
  public static SubLObject new_rdf_access_path(final SubLObject sk_source, final SubLObject db, final SubLObject user, final SubLObject password, final SubLObject server, final SubLObject port,
      final SubLObject proxy_server, final SubLObject proxy_port, final SubLObject subprotocol, final SubLObject base_uri, final SubLObject prefix_to_uri_map, final SubLObject rdf_store, final SubLObject relative_path,
      final SubLObject timeout)
  {
    final SubLObject ap = new_access_path();
    access_path_enter( ap, $kw18$SKS, sk_source );
    access_path_enter( ap, $const16$sksIsa, $const14$RDFTripleStore_Physical );
    access_path_enter( ap, $const3$structuredKnowledgeSourceName, db );
    access_path_enter( ap, $const19$userNameForSKS, user );
    access_path_enter( ap, $const20$passwordForSKS, password );
    access_path_enter( ap, $const21$serverOfSKS, server );
    access_path_enter( ap, $const22$portNumberForSKS, port );
    access_path_enter( ap, $const23$sksProxyHost, proxy_server );
    access_path_enter( ap, $const24$sksProxyPort, proxy_port );
    access_path_enter( ap, $const25$subProtocolForSKS, subprotocol );
    access_path_enter( ap, $const50$baseNamespaceForSKS, base_uri );
    access_path_enter( ap, $const51$nameSpacePrefixForSKS, prefix_to_uri_map );
    access_path_enter( ap, $const52$rdfStoreIdentifierForSKS, rdf_store );
    access_path_enter( ap, $const53$relativePathForAPIAccessToSKS, relative_path );
    access_path_enter( ap, $kw27$TIMEOUT, timeout );
    return ap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 19337L)
  public static SubLObject get_red_value_from_framework(final SubLObject key)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 20489L)
  public static SubLObject get_sksi_red_pred_value(final SubLObject sk_source, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject red_string = Sequences.cconcatenate( $sksi_red_prefix$.getGlobalValue(), new SubLObject[] { $str57$_, $sksi_red_access_path_prefix$.getGlobalValue(), $str57$_, kb_paths.fort_name( sk_source ),
      $str57$_, kb_paths.fort_name( pred )
    } );
    SubLObject value = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          value = get_red_value_from_framework( red_string );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw28$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != value )
    {
      if( value.isString() && NIL != list_utilities.lengthG( value, TWO_INTEGER, UNPROVIDED ) && string_utilities.substring( value, ZERO_INTEGER, TWO_INTEGER ).equal( $str58$__ ) )
      {
        value = constants_high.find_constant( string_utilities.substring( value, TWO_INTEGER, UNPROVIDED ) );
      }
      final SubLObject support = arguments.make_hl_support( $kw59$OPAQUE, el_utilities.make_binary_formula( pred, sk_source, value ), UNPROVIDED, UNPROVIDED );
      if( NIL != arguments.hl_support_p( support ) )
      {
        sksi_hl_support_utilities.note_csql_support( support );
      }
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 21528L)
  public static SubLObject get_access_path_info(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( gather_argnum == UNPROVIDED )
    {
      gather_argnum = TWO_INTEGER;
    }
    if( check_arg == UNPROVIDED )
    {
      check_arg = NIL;
    }
    if( check_argnum == UNPROVIDED )
    {
      check_argnum = NIL;
    }
    SubLObject result = NIL;
    result = get_access_path_info_from_kb( sk_source, pred, index_argnum, gather_argnum, check_arg, check_argnum );
    if( NIL != result )
    {
      return result;
    }
    if( NIL != subl_promotions.memberP( pred, $red_candidate_access_path_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
    {
      result = get_sksi_red_pred_value( sk_source, pred );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 22125L)
  public static SubLObject get_access_path_info_from_kb(final SubLObject sk_source, final SubLObject pred, SubLObject index_argnum, SubLObject gather_argnum, SubLObject check_arg, SubLObject check_argnum)
  {
    if( index_argnum == UNPROVIDED )
    {
      index_argnum = ONE_INTEGER;
    }
    if( gather_argnum == UNPROVIDED )
    {
      gather_argnum = TWO_INTEGER;
    }
    if( check_arg == UNPROVIDED )
    {
      check_arg = NIL;
    }
    if( check_argnum == UNPROVIDED )
    {
      check_argnum = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != ignore_access_path_errorsP() )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            v_answer = sksi_kb_accessors.get_sk_source_property_from_kb( sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw28$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      v_answer = sksi_kb_accessors.get_sk_source_property_from_kb( sk_source, pred, index_argnum, gather_argnum, T, check_arg, check_argnum );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 22587L)
  public static SubLObject get_sks_type(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const16$sksIsa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 22828L)
  public static SubLObject get_sks_server(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const21$serverOfSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 22928L)
  public static SubLObject get_sks_port(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const22$portNumberForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23031L)
  public static SubLObject get_sks_proxy_server(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const23$sksProxyHost, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23249L)
  public static SubLObject get_sks_proxy_port(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const24$sksProxyPort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23356L)
  public static SubLObject get_sks_open_connection_timeout(final SubLObject sk_source)
  {
    return kb_mapping_utilities.fpred_value( sk_source, $const60$sksConnectionTimeout, ONE_INTEGER, TWO_INTEGER, $kw61$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23495L)
  public static SubLObject get_sks_db_name(final SubLObject sk_source)
  {
    return get_access_path_info( sksi_kb_accessors.max_genl_ks( sk_source ), $const3$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23842L)
  public static SubLObject get_sks_db_user_name(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const19$userNameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 23951L)
  public static SubLObject get_sks_db_password(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const20$passwordForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 24059L)
  public static SubLObject get_sks_db_subprotocol(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const25$subProtocolForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 24175L)
  public static SubLObject get_sks_db_sql_flavor(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const26$sqlProgramForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 24289L)
  public static SubLObject get_spreadsheet_db_name(final SubLObject sk_source)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.getDynamicValue( thread ) )
    {
      SubLObject db_name = get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FOUR_INTEGER, ONE_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName, UNPROVIDED,
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.getDynamicValue( thread );
      SubLObject table_name = NIL;
      table_name = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        db_name = Sequences.cconcatenate( db_name, new SubLObject[] { $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( table_name, $const62$sksiTargetForSpreadsheet, FIVE_INTEGER, TWO_INTEGER,
            $kw61$TRUE ), $const3$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( table_name,
                $const62$sksiTargetForSpreadsheet, FIVE_INTEGER, THREE_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        } );
        cdolist_list_var = cdolist_list_var.rest();
        table_name = cdolist_list_var.first();
      }
      return db_name;
    }
    if( sk_source.equal( sksi_kb_accessors.max_genl_ks( sk_source ) ) )
    {
      return Sequences.cconcatenate( get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FOUR_INTEGER, ONE_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName,
          UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), new SubLObject[]
          { $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FOUR_INTEGER, TWO_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName, UNPROVIDED,
              UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FOUR_INTEGER, THREE_INTEGER, $kw61$TRUE ),
                  $const3$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
      } );
    }
    return Sequences.cconcatenate( get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FIVE_INTEGER, ONE_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName,
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), new SubLObject[]
        { $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FIVE_INTEGER, TWO_INTEGER, $kw61$TRUE ), $const3$structuredKnowledgeSourceName, UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str63$_, get_access_path_info( kb_mapping_utilities.fpred_value( sk_source, $const62$sksiTargetForSpreadsheet, FIVE_INTEGER, THREE_INTEGER, $kw61$TRUE ),
                $const3$structuredKnowledgeSourceName, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 26068L)
  public static SubLObject get_sks_http_url(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const30$httpdRequestURLForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 26271L)
  public static SubLObject get_sks_http_request_method(final SubLObject sk_source)
  {
    final SubLObject pcase_var;
    final SubLObject method = pcase_var = get_access_path_info( sk_source, $const32$httpdRequestMethodForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( pcase_var.eql( $const64$HTTP_GET_RequestMethod ) )
    {
      return $kw65$GET;
    }
    if( pcase_var.eql( $const66$HTTP_POST_RequestMethod ) )
    {
      return $kw67$POST;
    }
    if( NIL != ignore_access_path_errorsP() )
    {
      return NIL;
    }
    Errors.error( $str68$Unknown_HTTP_request_method__S_fo, method, sk_source );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 26665L)
  public static SubLObject get_sks_http_query_template(final SubLObject sk_source)
  {
    final SubLObject query_template = get_access_path_info( sk_source, $const31$httpdRequestQueryTemplateForSKS, ONE_INTEGER, THREE_INTEGER, UNPROVIDED, UNPROVIDED );
    return query_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 26847L)
  public static SubLObject get_sks_http_parsing_method(final SubLObject sk_source)
  {
    final SubLObject parsing_program = get_access_path_info( sk_source, $const69$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != parsing_program )
    {
      return $kw70$SUBLBOOLEAN;
    }
    final SubLObject parsing_program_$3 = get_access_path_info( sk_source, $const71$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != parsing_program_$3 )
    {
      return $kw72$SUBLUNBOUNDONLY;
    }
    return $kw73$SUBL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 27333L)
  public static SubLObject get_sks_http_parsing_program(final SubLObject sk_source)
  {
    final SubLObject parsing_program = get_access_path_info( sk_source, $const69$httpdRequestSubLBooleanParsingPro, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != parsing_program )
    {
      return parsing_program;
    }
    final SubLObject parsing_program_$4 = get_access_path_info( sk_source, $const71$httpdRequestUnboundOnlySubLParsin, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != parsing_program_$4 ) ? parsing_program_$4 : get_access_path_info( sk_source, $const74$httpdRequestSubLParsingProgramFor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 27901L)
  public static SubLObject get_sks_fht_filename(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const36$filenameForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 28121L)
  public static SubLObject get_sks_fht_key_test_function(final SubLObject sk_source)
  {
    final SubLObject test_fn = get_access_path_info( sk_source, $const37$keyTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != test_fn ) ? test_fn : file_hash_table.get_default_fht_test_function();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 28323L)
  public static SubLObject get_sks_fht_value_test_function(final SubLObject sk_source)
  {
    final SubLObject test_fn = get_access_path_info( sk_source, $const38$valueTestFunctionForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != test_fn ) ? test_fn : Symbols.symbol_function( EQUAL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 28505L)
  public static SubLObject get_sks_fht_serialization_type(final SubLObject sk_source)
  {
    final SubLObject serialization = get_access_path_info( sk_source, $const39$serializationTypeForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return ( NIL != serialization ) ? serialization : file_hash_table.get_default_fht_serialization_protocol();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 28737L)
  public static SubLObject get_sks_base_uri(final SubLObject sk_source)
  {
    final SubLObject base_uri_term = get_access_path_info( sk_source, $const50$baseNamespaceForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != base_uri_term )
    {
      return get_uri_string( base_uri_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 29021L)
  public static SubLObject get_uri_string(final SubLObject uri_term)
  {
    SubLObject uri_string = ( NIL != kb_indexing_datastructures.indexed_term_p( uri_term ) ) ? kb_mapping_utilities.fpred_value( uri_term, $const75$uriString, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    if( NIL == uri_string && NIL != cycl_grammar.cycl_nat_p( uri_term ) )
    {
      uri_string = cycl_utilities.nat_arg( uri_term, ONE_INTEGER, UNPROVIDED );
    }
    return uri_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 29286L)
  public static SubLObject get_sks_prefix_to_uri_map(final SubLObject sk_source)
  {
    final SubLObject tuples = inference_kernel.new_cyc_query( ConsesLow.listS( $const51$nameSpacePrefixForSKS, sk_source, $list76 ), mt_relevance_macros.current_mt_relevance_mt(), $list77 );
    SubLObject uri_map = NIL;
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject prefix = NIL;
      SubLObject uri = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      prefix = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list78 );
      uri = current.first();
      current = current.rest();
      if( NIL == current )
      {
        uri_map = list_utilities.alist_enter( uri_map, prefix, get_uri_string( uri ), UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list78 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return Sort.sort( uri_map, Symbols.symbol_function( $sym79$STRING_LESSP ), Symbols.symbol_function( $sym80$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 29717L)
  public static SubLObject get_sks_rdf_store(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const52$rdfStoreIdentifierForSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 29833L)
  public static SubLObject get_sks_relative_path(final SubLObject sk_source)
  {
    return get_access_path_info( sk_source, $const53$relativePathForAPIAccessToSKS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 29958L)
  public static SubLObject access_path_p(final SubLObject v_object)
  {
    return dictionary.dictionary_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30308L)
  public static SubLObject new_access_path()
  {
    return dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30370L)
  public static SubLObject access_path_enter(final SubLObject access_path, final SubLObject key, final SubLObject value)
  {
    return dictionary.dictionary_enter( access_path, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30479L)
  public static SubLObject access_path_remove(final SubLObject access_path, final SubLObject key)
  {
    return dictionary.dictionary_remove( access_path, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30578L)
  public static SubLObject access_path_lookup(final SubLObject access_path, final SubLObject key, SubLObject not_found)
  {
    if( not_found == UNPROVIDED )
    {
      not_found = NIL;
    }
    return dictionary.dictionary_lookup_without_values( access_path, key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30722L)
  public static SubLObject access_path_sks(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $kw18$SKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 30959L)
  public static SubLObject access_path_type(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const16$sksIsa, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31060L)
  public static SubLObject access_path_server(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const21$serverOfSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31232L)
  public static SubLObject access_path_port(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const22$portNumberForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31343L)
  public static SubLObject access_path_proxy_server(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const23$sksProxyHost, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31458L)
  public static SubLObject access_path_proxy_port(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const24$sksProxyPort, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31571L)
  public static SubLObject access_path_timeout(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $kw27$TIMEOUT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31675L)
  public static SubLObject access_path_sql_flavor(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const26$sqlProgramForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31832L)
  public static SubLObject access_path_db(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const3$structuredKnowledgeSourceName, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 31954L)
  public static SubLObject access_path_user(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const19$userNameForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32063L)
  public static SubLObject access_path_password(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const20$passwordForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32176L)
  public static SubLObject access_path_subprotocol(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const25$subProtocolForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32295L)
  public static SubLObject access_path_url(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const30$httpdRequestURLForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32450L)
  public static SubLObject access_path_request_method(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const32$httpdRequestMethodForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32579L)
  public static SubLObject access_path_query_template(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const31$httpdRequestQueryTemplateForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32715L)
  public static SubLObject access_path_parsing_method(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $kw33$PARSING_METHOD, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32833L)
  public static SubLObject access_path_parsing_program(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $kw34$PARSING_PROGRAM, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 32953L)
  public static SubLObject access_path_physical_field_names(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $kw35$PHYSICAL_FIELD_NAMES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33083L)
  public static SubLObject access_path_filename(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const36$filenameForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33260L)
  public static SubLObject access_path_key_test_function(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const37$keyTestFunctionForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33389L)
  public static SubLObject access_path_value_test_function(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const38$valueTestFunctionForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33522L)
  public static SubLObject access_path_serialization_type(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const39$serializationTypeForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33654L)
  public static SubLObject access_path_rdf_base(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const50$baseNamespaceForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33812L)
  public static SubLObject access_path_rdf_prefix_map(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const51$nameSpacePrefixForSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 33938L)
  public static SubLObject access_path_api_access_relative_path(final SubLObject access_path)
  {
    return access_path_lookup( access_path, $const53$relativePathForAPIAccessToSKS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-access-path.lisp", position = 34082L)
  public static SubLObject adjust_server_of_access_path(final SubLObject access_path, final SubLObject new_server)
  {
    assert NIL != Types.stringp( new_server ) : new_server;
    return access_path_enter( access_path, $const21$serverOfSKS, new_server );
  }

  public static SubLObject declare_sksi_access_path_file()
  {
    SubLFiles.declareFunction( me, "structured_knowledge_source_type", "STRUCTURED-KNOWLEDGE-SOURCE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_sks_type_internal", "DETERMINE-SKS-TYPE-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "determine_sks_type", "DETERMINE-SKS-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "determine_sks_db_sql_flavor", "DETERMINE-SKS-DB-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_external_source_access_path_cache", "CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_external_source_access_path_cache", "INITIALIZE-EXTERNAL-SOURCE-ACCESS-PATH-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "external_source_access_path", "EXTERNAL-SOURCE-ACCESS-PATH", 1, 2, false );
    SubLFiles.declareFunction( me, "external_source_access_path_int", "EXTERNAL-SOURCE-ACCESS-PATH-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "get_external_source_access_path_from_cache", "GET-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_external_source_access_path_from_cache", "REMOVE-EXTERNAL-SOURCE-ACCESS-PATH-FROM-CACHE", 1, 1, false );
    SubLFiles.declareFunction( me, "add_to_external_source_access_path", "ADD-TO-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_from_external_source_access_path", "REMOVE-FROM-EXTERNAL-SOURCE-ACCESS-PATH", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_access_path", "SKSI-DETERMINE-ACCESS-PATH", 1, 2, false );
    SubLFiles.declareMacro( me, "with_ignore_access_path_errors", "WITH-IGNORE-ACCESS-PATH-ERRORS" );
    SubLFiles.declareFunction( me, "ignore_access_path_errorsP", "IGNORE-ACCESS-PATH-ERRORS?", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_access_path_int", "SKSI-DETERMINE-ACCESS-PATH-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_access_path_int2", "SKSI-DETERMINE-ACCESS-PATH-INT2", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cache_access_path", "NEW-CACHE-ACCESS-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_db_access_path", "SKSI-DETERMINE-DB-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "spreadsheet_determine_db_access_path", "SPREADSHEET-DETERMINE-DB-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_db_access_path", "NEW-DB-ACCESS-PATH", 11, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_web_page_access_path", "SKSI-DETERMINE-WEB-PAGE-ACCESS-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "new_web_page_access_path", "NEW-WEB-PAGE-ACCESS-PATH", 10, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_kb_access_path", "SKSI-DETERMINE-KB-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_fht_access_path", "SKSI-DETERMINE-FHT-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_fht_access_path", "NEW-FHT-ACCESS-PATH", 5, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_corba_access_path", "SKSI-DETERMINE-CORBA-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_rdf_access_path", "SKSI-DETERMINE-RDF-ACCESS-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_rdf_access_path", "NEW-RDF-ACCESS-PATH", 14, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_from_framework", "GET-RED-VALUE-FROM-FRAMEWORK", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sksi_red_pred_value", "GET-SKSI-RED-PRED-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_access_path_info", "GET-ACCESS-PATH-INFO", 2, 4, false );
    SubLFiles.declareFunction( me, "get_access_path_info_from_kb", "GET-ACCESS-PATH-INFO-FROM-KB", 2, 4, false );
    SubLFiles.declareFunction( me, "get_sks_type", "GET-SKS-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_server", "GET-SKS-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_port", "GET-SKS-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_proxy_server", "GET-SKS-PROXY-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_proxy_port", "GET-SKS-PROXY-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_open_connection_timeout", "GET-SKS-OPEN-CONNECTION-TIMEOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_db_name", "GET-SKS-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_db_user_name", "GET-SKS-DB-USER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_db_password", "GET-SKS-DB-PASSWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_db_subprotocol", "GET-SKS-DB-SUBPROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_db_sql_flavor", "GET-SKS-DB-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "get_spreadsheet_db_name", "GET-SPREADSHEET-DB-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_http_url", "GET-SKS-HTTP-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_http_request_method", "GET-SKS-HTTP-REQUEST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_http_query_template", "GET-SKS-HTTP-QUERY-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_http_parsing_method", "GET-SKS-HTTP-PARSING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_http_parsing_program", "GET-SKS-HTTP-PARSING-PROGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_fht_filename", "GET-SKS-FHT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_fht_key_test_function", "GET-SKS-FHT-KEY-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_fht_value_test_function", "GET-SKS-FHT-VALUE-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_fht_serialization_type", "GET-SKS-FHT-SERIALIZATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_base_uri", "GET-SKS-BASE-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "get_uri_string", "GET-URI-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_prefix_to_uri_map", "GET-SKS-PREFIX-TO-URI-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_rdf_store", "GET-SKS-RDF-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sks_relative_path", "GET-SKS-RELATIVE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_p", "ACCESS-PATH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_access_path", "NEW-ACCESS-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "access_path_enter", "ACCESS-PATH-ENTER", 3, 0, false );
    SubLFiles.declareFunction( me, "access_path_remove", "ACCESS-PATH-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "access_path_lookup", "ACCESS-PATH-LOOKUP", 2, 1, false );
    SubLFiles.declareFunction( me, "access_path_sks", "ACCESS-PATH-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_type", "ACCESS-PATH-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_server", "ACCESS-PATH-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_port", "ACCESS-PATH-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_proxy_server", "ACCESS-PATH-PROXY-SERVER", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_proxy_port", "ACCESS-PATH-PROXY-PORT", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_timeout", "ACCESS-PATH-TIMEOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_sql_flavor", "ACCESS-PATH-SQL-FLAVOR", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_db", "ACCESS-PATH-DB", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_user", "ACCESS-PATH-USER", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_password", "ACCESS-PATH-PASSWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_subprotocol", "ACCESS-PATH-SUBPROTOCOL", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_url", "ACCESS-PATH-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_request_method", "ACCESS-PATH-REQUEST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_query_template", "ACCESS-PATH-QUERY-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_parsing_method", "ACCESS-PATH-PARSING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_parsing_program", "ACCESS-PATH-PARSING-PROGRAM", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_physical_field_names", "ACCESS-PATH-PHYSICAL-FIELD-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_filename", "ACCESS-PATH-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_key_test_function", "ACCESS-PATH-KEY-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_value_test_function", "ACCESS-PATH-VALUE-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_serialization_type", "ACCESS-PATH-SERIALIZATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_rdf_base", "ACCESS-PATH-RDF-BASE", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_rdf_prefix_map", "ACCESS-PATH-RDF-PREFIX-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "access_path_api_access_relative_path", "ACCESS-PATH-API-ACCESS-RELATIVE-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "adjust_server_of_access_path", "ADJUST-SERVER-OF-ACCESS-PATH", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_access_path_file()
  {
    $external_source_access_path_cache$ = SubLFiles.deflexical( "*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*", maybeDefault( $sym1$_EXTERNAL_SOURCE_ACCESS_PATH_CACHE_, $external_source_access_path_cache$, () -> ( dictionary
        .new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $ignore_access_path_errorsP$ = SubLFiles.defparameter( "*IGNORE-ACCESS-PATH-ERRORS?*", NIL );
    $red_candidate_access_path_predicates$ = SubLFiles.deflexical( "*RED-CANDIDATE-ACCESS-PATH-PREDICATES*", $list54 );
    $sksi_red_prefix$ = SubLFiles.deflexical( "*SKSI-RED-PREFIX*", $str55$application_sksi );
    $sksi_red_access_path_prefix$ = SubLFiles.deflexical( "*SKSI-RED-ACCESS-PATH-PREFIX*", $str56$access_paths );
    return NIL;
  }

  public static SubLObject setup_sksi_access_path_file()
  {
    memoization_state.note_memoized_function( $sym0$DETERMINE_SKS_TYPE );
    subl_macro_promotions.declare_defglobal( $sym1$_EXTERNAL_SOURCE_ACCESS_PATH_CACHE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_access_path_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_access_path_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_access_path_file();
  }
  static
  {
    me = new sksi_access_path();
    $external_source_access_path_cache$ = null;
    $ignore_access_path_errorsP$ = null;
    $red_candidate_access_path_predicates$ = null;
    $sksi_red_prefix$ = null;
    $sksi_red_access_path_prefix$ = null;
    $sym0$DETERMINE_SKS_TYPE = makeSymbol( "DETERMINE-SKS-TYPE" );
    $sym1$_EXTERNAL_SOURCE_ACCESS_PATH_CACHE_ = makeSymbol( "*EXTERNAL-SOURCE-ACCESS-PATH-CACHE*" );
    $const2$SpreadsheetSKS = constant_handles.reader_make_constant_shell( makeString( "SpreadsheetSKS" ) );
    $const3$structuredKnowledgeSourceName = constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) );
    $kw4$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $str5$TestLanguageSpoken_DB = makeString( "TestLanguageSpoken-DB" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE?" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$CLET = makeSymbol( "CLET" );
    $sym8$_IGNORE_ACCESS_PATH_ERRORS__ = makeSymbol( "*IGNORE-ACCESS-PATH-ERRORS?*" );
    $const9$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $const10$WebPage_AIS = constant_handles.reader_make_constant_shell( makeString( "WebPage-AIS" ) );
    $const11$CycKB = constant_handles.reader_make_constant_shell( makeString( "CycKB" ) );
    $const12$FileHashTable_File = constant_handles.reader_make_constant_shell( makeString( "FileHashTable-File" ) );
    $const13$CommonObjectRequestBrokerArchitec = constant_handles.reader_make_constant_shell( makeString( "CommonObjectRequestBrokerArchitecture" ) );
    $const14$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell( makeString( "RDFTripleStore-Physical" ) );
    $str15$Unknown_access_path_type__A_for__ = makeString( "Unknown access path type ~A for ~A." );
    $const16$sksIsa = constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) );
    $kw17$CACHE = makeKeyword( "CACHE" );
    $kw18$SKS = makeKeyword( "SKS" );
    $const19$userNameForSKS = constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) );
    $const20$passwordForSKS = constant_handles.reader_make_constant_shell( makeString( "passwordForSKS" ) );
    $const21$serverOfSKS = constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) );
    $const22$portNumberForSKS = constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) );
    $const23$sksProxyHost = constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) );
    $const24$sksProxyPort = constant_handles.reader_make_constant_shell( makeString( "sksProxyPort" ) );
    $const25$subProtocolForSKS = constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) );
    $const26$sqlProgramForSKS = constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) );
    $kw27$TIMEOUT = makeKeyword( "TIMEOUT" );
    $kw28$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym29$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $const30$httpdRequestURLForSKS = constant_handles.reader_make_constant_shell( makeString( "httpdRequestURLForSKS" ) );
    $const31$httpdRequestQueryTemplateForSKS = constant_handles.reader_make_constant_shell( makeString( "httpdRequestQueryTemplateForSKS" ) );
    $const32$httpdRequestMethodForSKS = constant_handles.reader_make_constant_shell( makeString( "httpdRequestMethodForSKS" ) );
    $kw33$PARSING_METHOD = makeKeyword( "PARSING-METHOD" );
    $kw34$PARSING_PROGRAM = makeKeyword( "PARSING-PROGRAM" );
    $kw35$PHYSICAL_FIELD_NAMES = makeKeyword( "PHYSICAL-FIELD-NAMES" );
    $const36$filenameForSKS = constant_handles.reader_make_constant_shell( makeString( "filenameForSKS" ) );
    $const37$keyTestFunctionForSKS = constant_handles.reader_make_constant_shell( makeString( "keyTestFunctionForSKS" ) );
    $const38$valueTestFunctionForSKS = constant_handles.reader_make_constant_shell( makeString( "valueTestFunctionForSKS" ) );
    $const39$serializationTypeForSKS = constant_handles.reader_make_constant_shell( makeString( "serializationTypeForSKS" ) );
    $const40$corbaSKSInitialORBHost = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialORBHost" ) );
    $const41$corbaSKSInitialORBPort = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialORBPort" ) );
    $const42$corbaSKSServiceName = constant_handles.reader_make_constant_shell( makeString( "corbaSKSServiceName" ) );
    $const43$corbaSKSInitialObjectClass = constant_handles.reader_make_constant_shell( makeString( "corbaSKSInitialObjectClass" ) );
    $str44$Helper = makeString( "Helper" );
    $kw45$INITIAL_ORB_HOST = makeKeyword( "INITIAL-ORB-HOST" );
    $kw46$INITIAL_ORB_PORT = makeKeyword( "INITIAL-ORB-PORT" );
    $kw47$SERVICE_NAME = makeKeyword( "SERVICE-NAME" );
    $kw48$INITIAL_OBJECT_CLASS = makeKeyword( "INITIAL-OBJECT-CLASS" );
    $kw49$INITIAL_OBJECT_CLASS_HELPER = makeKeyword( "INITIAL-OBJECT-CLASS-HELPER" );
    $const50$baseNamespaceForSKS = constant_handles.reader_make_constant_shell( makeString( "baseNamespaceForSKS" ) );
    $const51$nameSpacePrefixForSKS = constant_handles.reader_make_constant_shell( makeString( "nameSpacePrefixForSKS" ) );
    $const52$rdfStoreIdentifierForSKS = constant_handles.reader_make_constant_shell( makeString( "rdfStoreIdentifierForSKS" ) );
    $const53$relativePathForAPIAccessToSKS = constant_handles.reader_make_constant_shell( makeString( "relativePathForAPIAccessToSKS" ) );
    $list54 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) ), constant_handles.reader_make_constant_shell( makeString( "serverOfSKS" ) ),
      constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) ), constant_handles.reader_make_constant_shell( makeString(
          "sksProxyPort" ) ), constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "passwordForSKS" ) ), constant_handles
              .reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "filenameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "serializationTypeForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "keyTestFunctionForSKS" ) ),
      constant_handles.reader_make_constant_shell( makeString( "valueTestFunctionForSKS" ) )
    } );
    $str55$application_sksi = makeString( "application.sksi" );
    $str56$access_paths = makeString( "access-paths" );
    $str57$_ = makeString( "." );
    $str58$__ = makeString( "#$" );
    $kw59$OPAQUE = makeKeyword( "OPAQUE" );
    $const60$sksConnectionTimeout = constant_handles.reader_make_constant_shell( makeString( "sksConnectionTimeout" ) );
    $kw61$TRUE = makeKeyword( "TRUE" );
    $const62$sksiTargetForSpreadsheet = constant_handles.reader_make_constant_shell( makeString( "sksiTargetForSpreadsheet" ) );
    $str63$_ = makeString( "!" );
    $const64$HTTP_GET_RequestMethod = constant_handles.reader_make_constant_shell( makeString( "HTTP-GET-RequestMethod" ) );
    $kw65$GET = makeKeyword( "GET" );
    $const66$HTTP_POST_RequestMethod = constant_handles.reader_make_constant_shell( makeString( "HTTP-POST-RequestMethod" ) );
    $kw67$POST = makeKeyword( "POST" );
    $str68$Unknown_HTTP_request_method__S_fo = makeString( "Unknown HTTP request method ~S for ~S" );
    $const69$httpdRequestSubLBooleanParsingPro = constant_handles.reader_make_constant_shell( makeString( "httpdRequestSubLBooleanParsingProgramForSKS" ) );
    $kw70$SUBLBOOLEAN = makeKeyword( "SUBLBOOLEAN" );
    $const71$httpdRequestUnboundOnlySubLParsin = constant_handles.reader_make_constant_shell( makeString( "httpdRequestUnboundOnlySubLParsingProgramForSKS" ) );
    $kw72$SUBLUNBOUNDONLY = makeKeyword( "SUBLUNBOUNDONLY" );
    $kw73$SUBL = makeKeyword( "SUBL" );
    $const74$httpdRequestSubLParsingProgramFor = constant_handles.reader_make_constant_shell( makeString( "httpdRequestSubLParsingProgramForSKS" ) );
    $const75$uriString = constant_handles.reader_make_constant_shell( makeString( "uriString" ) );
    $list76 = ConsesLow.list( makeSymbol( "?PREFIX" ), makeSymbol( "?URI" ) );
    $list77 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( makeSymbol( "?PREFIX" ), makeSymbol( "?URI" ) ) ) );
    $list78 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "URI" ) );
    $sym79$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym80$FIRST = makeSymbol( "FIRST" );
    $sym81$STRINGP = makeSymbol( "STRINGP" );
  }
}
/*
 * 
 * Total time: 244 ms
 * 
 */