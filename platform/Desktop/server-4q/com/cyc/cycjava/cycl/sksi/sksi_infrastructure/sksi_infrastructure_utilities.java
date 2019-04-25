package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.sksi.corba.corba_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.corba.corba_module_utilities;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_infrastructure_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities";
  public static final String myFingerPrint = "e36188b00df23d0f13fa04a37122acd53b617f16457cc95d8c439f64ce715c8f";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 846L)
  private static SubLSymbol $sksi_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 6341L)
  private static SubLSymbol $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 12466L)
  private static SubLSymbol $sort_knowledge_sources_by_dateP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32011L)
  private static SubLSymbol $external_sources_activated_in_image$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$VALID_CONSTANT_;
  private static final SubLSymbol $sym2$_SKSI_NON_THELOGICALFIELDVALUEFN_LFI_FORT_CACHE_;
  private static final SubLObject $const3$LogicalFieldIndexical;
  private static final SubLObject $const4$quotedIsa;
  private static final SubLSymbol $kw5$TRUE;
  private static final SubLObject $const6$TheLogicalFieldValueFn;
  private static final SubLSymbol $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED;
  private static final SubLSymbol $sym8$NART_P;
  private static final SubLSymbol $sym9$HL_TO_EL;
  private static final SubLSymbol $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT;
  private static final SubLSymbol $sym11$RELEVANT_MT_;
  private static final SubLSymbol $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT;
  private static final SubLSymbol $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT;
  private static final SubLSymbol $sym14$CONTENT_MT_SPINDLE_MEMBER_P;
  private static final SubLObject $const15$StructuredKnowledgeSource_Atomic;
  private static final SubLObject $const16$StructuredKnowledgeSource_Complex;
  private static final SubLSymbol $sym17$TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P;
  private static final SubLSymbol $sym18$SKS_REGISTERED_P;
  private static final SubLSymbol $sym19$_;
  private static final SubLSymbol $sym20$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE;
  private static final SubLObject $const21$comment;
  private static final SubLString $str22$An_external_knowledge_source_with;
  private static final SubLSymbol $sym23$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const24$EverythingPSC;
  private static final SubLObject $const25$Database_Physical;
  private static final SubLSymbol $sym26$SK_SOURCE_SUB_KS_IN_ANY_MT_;
  private static final SubLSymbol $sym27$PHYSICAL_FIELD_INDEXICAL_P;
  private static final SubLSymbol $sym28$PHYSICAL_FIELD_P;
  private static final SubLSymbol $sym29$PHYSICAL_FIELD_NAME;
  private static final SubLSymbol $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE;
  private static final SubLObject $const31$ThePhysicalFieldValueFn;
  private static final SubLObject $const32$ReifiedMappingForPredFn;
  private static final SubLSymbol $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY;
  private static final SubLSymbol $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS;
  private static final SubLSymbol $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_;
  private static final SubLSymbol $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS;
  private static final SubLSymbol $sym37$_FN;
  private static final SubLList $list38;
  private static final SubLObject $const39$InferencePSC;
  private static final SubLSymbol $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA;
  private static final SubLSymbol $sym41$LOGICAL_FIELD_P;
  private static final SubLSymbol $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED;
  private static final SubLSymbol $sym43$LOGICAL_FIELD_INDEXICAL_P;
  private static final SubLSymbol $sym44$LOGICAL_FIELD_FOR_INDEXICAL;
  private static final SubLSymbol $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE;
  private static final SubLSymbol $sym46$PREDICATE_;
  private static final SubLObject $const47$WebPage_AIS;
  private static final SubLObject $const48$FileHashTable_File;
  private static final SubLObject $const49$CommonObjectRequestBrokerArchitec;
  private static final SubLSymbol $kw50$CACHE;
  private static final SubLString $str51$continue;
  private static final SubLString $str52$Unknown_access_path_type__A_for__;
  private static final SubLSymbol $sym53$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str54$The_following_error_occurred_whil;
  private static final SubLString $str55$;
  private static final SubLSymbol $kw56$DEFAULT;
  private static final SubLInteger $int57$80;
  private static final SubLSymbol $kw58$PRIVATE;
  private static final SubLSymbol $kw59$MACHINE;
  private static final SubLSymbol $kw60$PORT;
  private static final SubLSymbol $kw61$METHOD;
  private static final SubLSymbol $kw62$GET;
  private static final SubLSymbol $kw63$URL;
  private static final SubLSymbol $kw64$QUERY;
  private static final SubLSymbol $kw65$KEEP_ALIVE_;
  private static final SubLSymbol $kw66$WIDE_NEWLINES_;
  private static final SubLSymbol $kw67$ACCEPT_TYPES;
  private static final SubLSymbol $kw68$CONTENT_TYPE;
  private static final SubLSymbol $kw69$SOAP_ACTION_URI;
  private static final SubLString $str70$The_following_problem_was_encount;
  private static final SubLString $str71$_A;
  private static final SubLSymbol $kw72$PUBLIC;
  private static final SubLSymbol $sym73$_EXTERNAL_SOURCES_ACTIVATED_IN_IMAGE_;
  private static final SubLSymbol $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT;
  private static final SubLSymbol $sym75$ALL_DISJOINT_SCHEMAS_INT;
  private static final SubLObject $const76$ObjectDefiningSchema;
  private static final SubLObject $const77$isa;
  private static final SubLSymbol $kw78$BREADTH;
  private static final SubLSymbol $kw79$QUEUE;
  private static final SubLSymbol $kw80$STACK;
  private static final SubLSymbol $sym81$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw82$ERROR;
  private static final SubLString $str83$_A_is_not_a__A;
  private static final SubLSymbol $sym84$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw85$CERROR;
  private static final SubLString $str86$continue_anyway;
  private static final SubLSymbol $kw87$WARN;
  private static final SubLString $str88$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str89$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str90$attempting_to_bind_direction_link;
  private static final SubLList $list91;
  private static final SubLString $str92$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT;
  private static final SubLSymbol $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED;
  private static final SubLSymbol $sym95$SCHEMA_OBJECT_ID_FN_EXPRESSION_P;
  private static final SubLSymbol $sym96$SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P;
  private static final SubLObject $const97$SchemaObjectFn;
  private static final SubLObject $const98$SchemaObjectIDFn;
  private static final SubLList $list99;
  private static final SubLObject $const100$equals;
  private static final SubLSymbol $kw101$REFLEXIVE;
  private static final SubLList $list102;
  private static final SubLList $list103;
  private static final SubLObject $const104$joinable;
  private static final SubLSymbol $kw105$TRANSITIVITY;
  private static final SubLObject $const106$subKS;
  private static final SubLSymbol $sym107$SK_SOURCE_SUB_KS_CLOSURE;
  private static final SubLObject $const108$SourceSchemaObjectFn;
  private static final SubLObject $const109$subKS_Direct;
  private static final SubLSymbol $kw110$GAF;
  private static final SubLObject $const111$logicalFields;
  private static final SubLSymbol $kw112$MODULE_SOURCE;
  private static final SubLSymbol $kw113$OR;
  private static final SubLList $list114;
  private static final SubLSymbol $kw115$SKSI;
  private static final SubLSymbol $sym116$HL_MODULE_NAME;
  private static final SubLSymbol $sym117$FIND_ASSERTION_CYCL_MEMOIZED;
  private static final SubLSymbol $sym118$GENL_PREDICATE_MEMOIZED_;
  private static final SubLSymbol $sym119$GENL_INVERSE_MEMOIZED_;
  private static final SubLSymbol $sym120$ALL_FORT_INSTANCES_MEMOIZED;
  private static final SubLSymbol $sym121$MT_RELEVANT_TO_MT_MEMOIZED_;
  private static final SubLSymbol $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED;
  private static final SubLSymbol $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED;
  private static final SubLSymbol $sym124$REMOVAL_ASK_MEMOIZED;
  private static final SubLSymbol $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED;
  private static final SubLSymbol $sym126$ISA_UNIT_OF_MEASURE_;
  private static final SubLObject $const127$UnitOfMeasure;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 5890L)
  public static SubLObject initialize_sksi_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym1$VALID_CONSTANT_, $sksi_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_sksi_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_sksi_kb_loaded();
    }
    return kb_control_vars.sksi_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 6218L)
  public static SubLObject initialize_sksi_data_structures()
  {
    initialize_non_thelogicalfieldvaluefn_lfi_fort_cache();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 6565L)
  public static SubLObject initialize_non_thelogicalfieldvaluefn_lfi_fort_cache()
  {
    SubLObject cdolist_list_var;
    final SubLObject all_lfi_gafs = cdolist_list_var = kb_mapping_utilities.pred_value_gafs( $const3$LogicalFieldIndexical, $const4$quotedIsa, TWO_INTEGER, $kw5$TRUE );
    SubLObject lfi_gaf = NIL;
    lfi_gaf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject lfi = assertions_high.gaf_arg1( lfi_gaf );
      possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache( lfi, assertions_high.assertion_mt( lfi_gaf ) );
      cdolist_list_var = cdolist_list_var.rest();
      lfi_gaf = cdolist_list_var.first();
    }
    return $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 6985L)
  public static SubLObject possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache(final SubLObject v_object, final SubLObject mt)
  {
    if( NIL != forts.fort_p( v_object ) && NIL == narts_high.nart_with_functor_p( $const6$TheLogicalFieldValueFn, v_object ) )
    {
      return dictionary_utilities.dictionary_pushnew( $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 7271L)
  public static SubLObject possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache(final SubLObject v_object, final SubLObject mt)
  {
    if( NIL != forts.fort_p( v_object ) && NIL == narts_high.nart_with_functor_p( $const6$TheLogicalFieldValueFn, v_object ) )
    {
      return dictionary_utilities.dictionary_remove_from_value( $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 7572L)
  public static SubLObject non_thelogicalfieldvaluefn_lfi_fort_p(final SubLObject v_object)
  {
    return mt_relevance_macros.any_relevant_mtP( dictionary.dictionary_lookup_without_values( $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$.getGlobalValue(), v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 7866L)
  public static SubLObject sksi_reconstruct_expression(final SubLObject expression, final SubLObject test, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = NIL;
    }
    return ( NIL != memoizeP ) ? sksi_reconstruct_expression_memoized( expression, test ) : sksi_reconstruct_expression_int( expression, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 8318L)
  public static SubLObject sksi_reconstruct_expression_memoized_internal(final SubLObject expression, final SubLObject test)
  {
    return sksi_reconstruct_expression_int( expression, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 8318L)
  public static SubLObject sksi_reconstruct_expression_memoized(final SubLObject expression, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_reconstruct_expression_memoized_internal( expression, test );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( expression, test );
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
        if( expression.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && test.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_reconstruct_expression_memoized_internal( expression, test ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( expression, test ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 8485L)
  public static SubLObject sksi_reconstruct_expression_int(SubLObject expression, final SubLObject test)
  {
    if( NIL != nart_handles.nart_p( expression ) )
    {
      return ( NIL != Functions.funcall( test, cycl_utilities.hl_to_el( expression ) ) ) ? expression : cycl_utilities.hl_to_el( expression );
    }
    final SubLObject narts = list_utilities.tree_find_all_if( $sym8$NART_P, expression, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject narts_to_replace = cdolist_list_var = list_utilities.find_all_if_not( test, narts, $sym9$HL_TO_EL );
    SubLObject nart_to_replace = NIL;
    nart_to_replace = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      expression = list_utilities.tree_substitute( expression, nart_to_replace, cycl_utilities.hl_to_el( nart_to_replace ) );
      cdolist_list_var = cdolist_list_var.rest();
      nart_to_replace = cdolist_list_var.first();
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 8968L)
  public static SubLObject all_relevant_sksi_content_mts()
  {
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() )
    {
      return sksi_kb_accessors.sksi_content_mts();
    }
    return all_relevant_sksi_content_mts_int( mt_relevance_macros.mt_info( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 9882L)
  public static SubLObject all_relevant_sksi_content_mts_int_internal(final SubLObject mt_info)
  {
    return list_utilities.remove_if_not( $sym11$RELEVANT_MT_, sksi_kb_accessors.sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 9882L)
  public static SubLObject all_relevant_sksi_content_mts_int(final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return all_relevant_sksi_content_mts_int_internal( mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( all_relevant_sksi_content_mts_int_internal( mt_info ) ) );
      memoization_state.caching_state_put( caching_state, mt_info, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10056L)
  public static SubLObject any_sksi_content_mt_with_registered_module_relevantP()
  {
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() )
    {
      return T;
    }
    return any_sksi_content_mt_with_registered_module_relevantP_int( mt_relevance_macros.mt_info( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10427L)
  public static SubLObject any_sksi_content_mt_with_registered_module_relevantP_int_internal(final SubLObject mt_info)
  {
    return mt_relevance_macros.any_relevant_mtP( sksi_sks_manager.sksi_content_mts_with_registered_module() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10427L)
  public static SubLObject any_sksi_content_mt_with_registered_module_relevantP_int(final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return any_sksi_content_mt_with_registered_module_relevantP_int_internal( mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, ONE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( any_sksi_content_mt_with_registered_module_relevantP_int_internal( mt_info ) ) );
      memoization_state.caching_state_put( caching_state, mt_info, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10636L)
  public static SubLObject any_sksi_content_mt_relevantP()
  {
    if( NIL != mt_relevance_macros.any_or_all_mts_are_relevantP() )
    {
      return T;
    }
    return any_sksi_content_mt_relevantP_int( mt_relevance_macros.mt_info( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10961L)
  public static SubLObject any_sksi_content_mt_relevantP_int_internal(final SubLObject mt_info)
  {
    return mt_relevance_macros.any_relevant_mtP( sksi_kb_accessors.sksi_content_mts() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 10961L)
  public static SubLObject any_sksi_content_mt_relevantP_int(final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return any_sksi_content_mt_relevantP_int_internal( mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mt_info, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( any_sksi_content_mt_relevantP_int_internal( mt_info ) ) );
      memoization_state.caching_state_put( caching_state, mt_info, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11124L)
  public static SubLObject relevant_top_level_sksi_content_mts()
  {
    return Sequences.remove_if( $sym14$CONTENT_MT_SPINDLE_MEMBER_P, all_relevant_sksi_content_mts(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11360L)
  public static SubLObject sk_source_atomicP(final SubLObject sk_source)
  {
    return isa.isaP( sk_source, $const15$StructuredKnowledgeSource_Atomic, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11535L)
  public static SubLObject sk_source_complexP(final SubLObject sk_source)
  {
    return isa.isaP( sk_source, $const16$StructuredKnowledgeSource_Complex, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11647L)
  public static SubLObject gather_all_complete_knowledge_sources()
  {
    return sort_knowledge_sources( sksi_kb_accessors.complete_knowledge_sources() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11770L)
  public static SubLObject gather_all_top_level_complete_knowledge_sources()
  {
    return sort_knowledge_sources( list_utilities.remove_if_not( $sym17$TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_kb_accessors.complete_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 11959L)
  public static SubLObject gather_all_top_level_complete_registered_knowledge_sources()
  {
    if( NIL == sksi_sks_manager.sksi_registered_knowledge_sources() )
    {
      return NIL;
    }
    return sort_knowledge_sources( list_utilities.remove_if_not( $sym18$SKS_REGISTERED_P, list_utilities.remove_if_not( $sym17$TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_kb_accessors.complete_knowledge_sources(),
        UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 12268L)
  public static SubLObject gather_all_top_level_registered_knowledge_sources()
  {
    return sort_knowledge_sources( list_utilities.remove_if_not( $sym17$TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P, sksi_sks_manager.sksi_registered_knowledge_sources(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 12528L)
  public static SubLObject sort_knowledge_sources(final SubLObject knowledge_sources)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != $sort_knowledge_sources_by_dateP$.getDynamicValue( thread ) ) ? Sort.sort( knowledge_sources, $sym19$_, $sym20$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE )
        : kb_utilities.sort_terms( knowledge_sources, T, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 12756L)
  public static SubLObject gather_sksi_knowledge_sources_and_descriptions()
  {
    final SubLObject sks_list = gather_all_top_level_complete_knowledge_sources();
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sks_list;
    SubLObject sks = NIL;
    sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sks_description = get_sks_description_string( sks );
      result = ConsesLow.cons( ConsesLow.list( sks, sks_description ), result );
      cdolist_list_var = cdolist_list_var.rest();
      sks = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 13244L)
  public static SubLObject get_sks_description_string(final SubLObject sks)
  {
    SubLObject desc = kb_mapping_utilities.fpred_value_in_any_mt( sks, $const21$comment, ONE_INTEGER, TWO_INTEGER, $kw5$TRUE );
    if( NIL == desc )
    {
      desc = $str22$An_external_knowledge_source_with;
    }
    return desc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 13470L)
  public static SubLObject top_level_knowledge_source_p(final SubLObject sks)
  {
    return Types.sublisp_null( sksi_kb_accessors.immediate_genl_ks( sks ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 13565L)
  public static SubLObject top_level_knowledge_source_in_any_mt_p(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym23$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const24$EverythingPSC, thread );
      result = top_level_knowledge_source_p( sks );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 13740L)
  public static SubLObject all_relevant_sk_sources()
  {
    final SubLObject mts = all_relevant_sksi_content_mts();
    SubLObject sk_sources = NIL;
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
      if( NIL != sks )
      {
        sk_sources = ConsesLow.cons( sks, sk_sources );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( sk_sources, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 14059L)
  public static SubLObject all_relevant_dbs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mts = all_relevant_sksi_content_mts();
    SubLObject dbs = NIL;
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
      if( NIL != sks )
      {
        final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          if( sksi_kb_accessors.sk_source_ks_type( sks ).eql( $const25$Database_Physical ) )
          {
            dbs = ConsesLow.cons( sks, dbs );
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( dbs, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 14470L)
  public static SubLObject relevant_registered_top_level_sksi_dbs()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cdolist_list_var;
    final SubLObject mts = cdolist_list_var = relevant_top_level_sksi_content_mts();
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject sks = sksi_kb_accessors.content_mt_sk_source_in_any_mt( mt );
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( sksi_kb_accessors.sk_source_ks_type( sks ).eql( $const25$Database_Physical ) && NIL != top_level_knowledge_source_p( sks ) && NIL != sk_source_registeredP( sks, UNPROVIDED ) )
        {
          result = ConsesLow.cons( sks, result );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 15086L)
  public static SubLObject relevant_maximum_sksi_dbs()
  {
    return list_utilities.delete_subsumed_items( all_relevant_dbs(), $sym26$SK_SOURCE_SUB_KS_IN_ANY_MT_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 15370L)
  public static SubLObject external_term_denoting_function_expression_p(final SubLObject expression)
  {
    if( NIL != obsolete.closed_nat_p( expression, UNPROVIDED ) )
    {
      return fort_types_interface.sksi_external_term_denoting_function_p( cycl_utilities.nat_functor( expression ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 15643L)
  public static SubLObject sksi_external_term_p(final SubLObject v_term)
  {
    return makeBoolean( NIL != el_utilities.closedP( v_term, UNPROVIDED ) && NIL != external_term_denoting_function_expression_p( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 15780L)
  public static SubLObject sksi_term_p(final SubLObject v_term)
  {
    return makeBoolean( NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argumentP( v_term ) || NIL != sksi_external_term_p( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 15899L)
  public static SubLObject sksi_supported_predicate_type_p(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != ( ( NIL != hlmt.hlmt_p( mt ) ) ? fort_types_interface.isa_predicateP( v_object, mt ) : fort_types_interface.predicate_in_any_mtP( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 16410L)
  public static SubLObject physical_fields_for_indexicals_in_expression(final SubLObject expression)
  {
    final SubLObject indexicals = cycl_utilities.expression_gather( expression, $sym27$PHYSICAL_FIELD_INDEXICAL_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sksi_kb_accessors.indexicals_to_physical_fields( indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 16769L)
  public static SubLObject indexicals_for_physical_fields_in_expression(final SubLObject expression)
  {
    final SubLObject physical_fields = cycl_utilities.expression_gather( expression, $sym28$PHYSICAL_FIELD_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return sksi_kb_accessors.physical_fields_to_indexicals( physical_fields );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 16985L)
  public static SubLObject extract_physical_fields_via_indexicals(final SubLObject expression, final SubLObject all_physical_fields)
  {
    final SubLObject physical_fields_in_expression = physical_fields_for_indexicals_in_expression( expression );
    return keyhash_utilities.fast_intersection( all_physical_fields, physical_fields_in_expression, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 17259L)
  public static SubLObject sort_physical_fields_by_field_name_list(final SubLObject physical_fields, final SubLObject physical_schema)
  {
    final SubLObject field_name_list = sksi_kb_accessors.physical_schema_field_name_list( physical_schema );
    final SubLObject sorted_physical_fields = list_utilities.sort_via_position( conses_high.copy_list( physical_fields ), field_name_list, Symbols.symbol_function( EQUAL ), $sym29$PHYSICAL_FIELD_NAME );
    return sorted_physical_fields;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 17586L)
  public static SubLObject sksi_determine_relevant_physical_field_indexicals(final SubLObject logical_field_indexicals, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = logical_field_indexicals;
    SubLObject lfi = NIL;
    lfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.append( result, sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical( lfi, logical_schemata, physical_schemata ) );
      cdolist_list_var = cdolist_list_var.rest();
      lfi = cdolist_list_var.first();
    }
    return list_utilities.fast_delete_duplicates( result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 18008L)
  public static SubLObject sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical(final SubLObject lfi, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLObject field_decodings = sksi_field_translation_utilities.get_field_decodings_for_logical_field_indexical( lfi, logical_schemata, physical_schemata );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = field_decodings;
    SubLObject field_decoding = NIL;
    field_decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$1;
      final SubLObject physical_field_indexicals = cdolist_list_var_$1 = sksi_field_translation_utilities.decoding_physical_field_indexicals( field_decoding );
      SubLObject pfi = NIL;
      pfi = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        result = ConsesLow.cons( sksi_kb_accessors.pfi_for_lfi( pfi, lfi ), result );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        pfi = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_decoding = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 18522L)
  public static SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical( pfi, logical_schemata, physical_schemata );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = field_encodings;
    SubLObject field_encoding = NIL;
    field_encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$2;
      final SubLObject logical_field_indexicals = cdolist_list_var_$2 = sksi_field_translation_utilities.encoding_logical_field_indexicals( field_encoding );
      SubLObject lfi = NIL;
      lfi = cdolist_list_var_$2.first();
      while ( NIL != cdolist_list_var_$2)
      {
        result = ConsesLow.cons( sksi_kb_accessors.lfi_for_pfi( lfi, pfi ), result );
        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
        lfi = cdolist_list_var_$2.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 18522L)
  public static SubLObject sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical(final SubLObject pfi, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal( pfi, logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, THREE_INTEGER, NIL,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( pfi, logical_schemata, physical_schemata );
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
        if( pfi.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal( pfi, logical_schemata,
        physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pfi, logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 19069L)
  public static SubLObject physical_field_indexical_el_formula_p(final SubLObject formula)
  {
    return el_utilities.el_formula_with_operator_p( formula, $const31$ThePhysicalFieldValueFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 19208L)
  public static SubLObject reified_mapping_el_formula_p(final SubLObject formula)
  {
    return el_utilities.el_formula_with_operator_p( formula, $const32$ReifiedMappingForPredFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 19556L)
  public static SubLObject physical_field_indexical_or_reified_mapping_el_formula_p(final SubLObject formula)
  {
    return makeBoolean( NIL != physical_field_indexical_el_formula_p( formula ) || NIL != reified_mapping_el_formula_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 19749L)
  public static SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schema, final SubLObject physical_schema)
  {
    final SubLObject pfs = sksi_kb_accessors.physical_schema_fields( physical_schema );
    final SubLObject mappings_cache = dictionary.new_dictionary( Symbols.symbol_function( EQ ), Sequences.length( pfs ) );
    SubLObject cdolist_list_var = pfs;
    SubLObject pf = NIL;
    pf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject relevant_lfis = sksi_kb_accessors.sksi_determine_logical_field_indexicals_relevant_to_physical_field( pf, physical_schema, logical_schema );
      dictionary.dictionary_enter( mappings_cache, pf, relevant_lfis );
      cdolist_list_var = cdolist_list_var.rest();
      pf = cdolist_list_var.first();
    }
    return mappings_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 19749L)
  public static SubLObject physical_field_logical_field_indexical_mappings_given_logical_physical_schemata(final SubLObject logical_schema, final SubLObject physical_schema)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal( logical_schema, physical_schema );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, TWO_INTEGER, NIL,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( logical_schema, physical_schema );
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
        if( logical_schema.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && physical_schema.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal( logical_schema,
        physical_schema ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_schema, physical_schema ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 20275L)
  public static SubLObject determine_relevant_physical_fields_for_field_decoding(final SubLObject field_decoding, final SubLObject physical_fields)
  {
    final SubLObject physical_fields_in_decoding = physical_fields_for_indexicals_in_expression( field_decoding );
    final SubLObject referenced_physical_fields = keyhash_utilities.fast_intersection( physical_fields, physical_fields_in_decoding, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return Sequences.nreverse( referenced_physical_fields );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 20863L)
  public static SubLObject determine_relevant_physical_field_indexicals_for_field_decoding(final SubLObject field_decoding, final SubLObject physical_field_indexicals)
  {
    final SubLObject physical_field_indexicals_in_decoding = sksi_field_translation_utilities.field_decoding_physical_field_indexicals( field_decoding );
    SubLObject referenced_physical_field_indexicals = NIL;
    SubLObject cdolist_list_var = physical_field_indexicals;
    SubLObject pfi = NIL;
    pfi = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != list_utilities.member_eqP( sksi_kb_accessors.pfi_fort_for_pfi( pfi ), physical_field_indexicals_in_decoding ) )
      {
        referenced_physical_field_indexicals = ConsesLow.cons( pfi, referenced_physical_field_indexicals );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pfi = cdolist_list_var.first();
    }
    return Sequences.nreverse( referenced_physical_field_indexicals );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 21386L)
  public static SubLObject sksi_determine_fixed_physical_field_indexicals_internal(final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = physical_schemata;
    SubLObject physical_schema = NIL;
    physical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$3 = sksi_kb_accessors.physical_schema_fields( physical_schema );
      SubLObject physical_field = NIL;
      physical_field = cdolist_list_var_$3.first();
      while ( NIL != cdolist_list_var_$3)
      {
        final SubLObject physical_field_indexical = sksi_kb_accessors.indexical_for_physical_field( physical_field );
        if( NIL != sksi_fixed_physical_field_indexicalP( physical_field_indexical, logical_schemata ) )
        {
          final SubLObject item_var = physical_field_indexical;
          if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            result = ConsesLow.cons( item_var, result );
          }
        }
        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
        physical_field = cdolist_list_var_$3.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      physical_schema = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 21386L)
  public static SubLObject sksi_determine_fixed_physical_field_indexicals(final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_determine_fixed_physical_field_indexicals_internal( logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( logical_schemata, physical_schemata );
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
        if( logical_schemata.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && physical_schemata.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_determine_fixed_physical_field_indexicals_internal( logical_schemata, physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22041L)
  public static SubLObject sksi_fixed_physical_field_indexicalP_internal(final SubLObject physical_field_indexical, final SubLObject logical_schemata)
  {
    SubLObject cdolist_list_var = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical( physical_field_indexical, logical_schemata, UNPROVIDED );
    SubLObject field_encoding = NIL;
    field_encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_grammar.subl_atomic_term_p( field_encoding ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_encoding = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22041L)
  public static SubLObject sksi_fixed_physical_field_indexicalP(final SubLObject physical_field_indexical, final SubLObject logical_schemata)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_fixed_physical_field_indexicalP_internal( physical_field_indexical, logical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( physical_field_indexical, logical_schemata );
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
          if( NIL != cached_args && NIL == cached_args.rest() && logical_schemata.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_fixed_physical_field_indexicalP_internal( physical_field_indexical, logical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( physical_field_indexical, logical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22374L)
  public static SubLObject logical_field_indexical_denoting_functions_internal()
  {
    return ask_utilities.query_variable( $sym37$_FN, $list38, $const39$InferencePSC, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22374L)
  public static SubLObject logical_field_indexical_denoting_functions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_field_indexical_denoting_functions_internal();
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, ZERO_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_field_indexical_denoting_functions_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22690L)
  public static SubLObject logical_field_indexical_el_formula_p(final SubLObject formula)
  {
    return el_utilities.el_formula_with_any_of_operators_p( formula, logical_field_indexical_denoting_functions() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 22855L)
  public static SubLObject logical_field_indexical_or_reified_mapping_el_formula_p(final SubLObject formula)
  {
    return makeBoolean( NIL != logical_field_indexical_el_formula_p( formula ) || NIL != reified_mapping_el_formula_p( formula ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 23046L)
  public static SubLObject logical_physical_field_mappings_given_logical_physical_schemata_internal(final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    SubLObject mappings_cache = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = logical_schemata;
    SubLObject logical_schema = NIL;
    logical_schema = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject logical_fields = sksi_kb_accessors.logical_schema_fields( logical_schema );
      SubLObject cdolist_list_var_$4 = keyhash_utilities.fast_intersection( sksi_kb_accessors.logical_schema_physical_schemata( logical_schema ), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      SubLObject physical_schema = NIL;
      physical_schema = cdolist_list_var_$4.first();
      while ( NIL != cdolist_list_var_$4)
      {
        mappings_cache = physical_field_mappings_for_logical_fields( logical_fields, logical_schema, physical_schema, mappings_cache );
        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
        physical_schema = cdolist_list_var_$4.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      logical_schema = cdolist_list_var.first();
    }
    return mappings_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 23046L)
  public static SubLObject logical_physical_field_mappings_given_logical_physical_schemata(final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return logical_physical_field_mappings_given_logical_physical_schemata_internal( logical_schemata, physical_schemata );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, TWO_INTEGER, NIL,
          EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( logical_schemata, physical_schemata );
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
        if( logical_schemata.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && physical_schemata.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( logical_physical_field_mappings_given_logical_physical_schemata_internal( logical_schemata, physical_schemata ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_schemata, physical_schemata ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 23646L)
  public static SubLObject physical_field_mappings_for_logical_fields(final SubLObject logical_fields, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mappings_cache)
  {
    if( mappings_cache == UNPROVIDED )
    {
      mappings_cache = dictionary.new_dictionary( Symbols.symbol_function( EQ ), Sequences.length( logical_fields ) );
    }
    final SubLObject physical_fields = sksi_kb_accessors.physical_schema_fields( physical_schema );
    SubLObject cdolist_list_var = logical_fields;
    SubLObject lf = NIL;
    lf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings( lf, logical_schema, physical_schema );
      SubLObject relevant_physical_fields = NIL;
      SubLObject cdolist_list_var_$5 = field_decodings;
      SubLObject field_decoding = NIL;
      field_decoding = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        relevant_physical_fields = ConsesLow.nconc( relevant_physical_fields, determine_relevant_physical_fields_for_field_decoding( field_decoding, physical_fields ) );
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        field_decoding = cdolist_list_var_$5.first();
      }
      if( NIL != relevant_physical_fields )
      {
        dictionary.dictionary_enter( mappings_cache, lf, relevant_physical_fields );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lf = cdolist_list_var.first();
    }
    return mappings_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 24408L)
  public static SubLObject physical_field_mappings_for_logical_fields_given_logical_physical_schemata(final SubLObject logical_fields, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    SubLObject mappings_cache = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = logical_fields;
    SubLObject lf = NIL;
    lf = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject logical_schema = sksi_kb_accessors.logical_field_schema( lf );
      if( NIL != list_utilities.member_eqP( logical_schema, logical_schemata ) )
      {
        final SubLObject physical_schema = keyhash_utilities.fast_intersection( sksi_kb_accessors.logical_schema_physical_schemata( logical_schema ), physical_schemata, UNPROVIDED, UNPROVIDED, UNPROVIDED ).first();
        mappings_cache = physical_field_mappings_for_logical_fields( ConsesLow.list( lf ), logical_schema, physical_schema, mappings_cache );
      }
      cdolist_list_var = cdolist_list_var.rest();
      lf = cdolist_list_var.first();
    }
    return mappings_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25028L)
  public static SubLObject expression_logical_fields(final SubLObject expression)
  {
    return cycl_utilities.expression_gather( expression, $sym41$LOGICAL_FIELD_P, T, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25150L)
  public static SubLObject expression_logical_field_indexicals(final SubLObject expression, SubLObject subs_tooP, SubLObject memoizeP)
  {
    if( subs_tooP == UNPROVIDED )
    {
      subs_tooP = T;
    }
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = NIL;
    }
    if( NIL != memoizeP )
    {
      return expression_logical_field_indexicals_memoized( expression, subs_tooP );
    }
    return expression_logical_field_indexicals_int( expression, subs_tooP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25426L)
  public static SubLObject expression_logical_field_indexicals_memoized_internal(final SubLObject expression, final SubLObject subs_tooP)
  {
    return expression_logical_field_indexicals_int( expression, subs_tooP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25426L)
  public static SubLObject expression_logical_field_indexicals_memoized(final SubLObject expression, final SubLObject subs_tooP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return expression_logical_field_indexicals_memoized_internal( expression, subs_tooP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( expression, subs_tooP );
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
        if( expression.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && subs_tooP.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( expression_logical_field_indexicals_memoized_internal( expression, subs_tooP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( expression, subs_tooP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25652L)
  public static SubLObject expression_logical_field_indexicals_int(final SubLObject expression, final SubLObject subs_tooP)
  {
    return cycl_utilities.expression_gather( expression, $sym43$LOGICAL_FIELD_INDEXICAL_P, T, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), subs_tooP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 25830L)
  public static SubLObject expression_logical_field_indexicals_ordered(final SubLObject expression, SubLObject subs_tooP)
  {
    if( subs_tooP == UNPROVIDED )
    {
      subs_tooP = T;
    }
    return list_utilities.tree_gather_ordered( expression, $sym43$LOGICAL_FIELD_INDEXICAL_P, Symbols.symbol_function( IDENTITY ), subs_tooP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 26021L)
  public static SubLObject expression_logical_fields_for_indexicals(final SubLObject expression)
  {
    return Mapping.mapcar( $sym44$LOGICAL_FIELD_FOR_INDEXICAL, expression_logical_field_indexicals( expression, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 26190L)
  public static SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate_internal(final SubLObject pred, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical( pred, ConsesLow.list( logical_schema ), ConsesLow.list( physical_schema ) );
    SubLObject cycl_relations = NIL;
    SubLObject cdolist_list_var = field_decodings;
    SubLObject field_decoding = NIL;
    field_decoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != sksi_kb_accessors.schema_object_fn_expression_p( field_decoding ) || NIL != sksi_kb_accessors.source_schema_object_fn_expression_p( field_decoding ) )
      {
        final SubLObject code_mapping_schema = ( NIL != sksi_kb_accessors.schema_object_fn_expression_p( field_decoding ) ) ? cycl_utilities.formula_arg1( field_decoding, UNPROVIDED )
            : cycl_utilities.formula_arg2( field_decoding, UNPROVIDED );
        if( NIL != forts.fort_p( code_mapping_schema ) )
        {
          cycl_relations = ConsesLow.nconc( cycl_relations, sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema( code_mapping_schema ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      field_decoding = cdolist_list_var.first();
    }
    return list_utilities.delete_if_not( $sym46$PREDICATE_, cycl_relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 26190L)
  public static SubLObject sksi_get_code_mapping_relations_for_logical_field_predicate(final SubLObject pred, final SubLObject logical_schema, final SubLObject physical_schema, SubLObject mt_info)
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
      return sksi_get_code_mapping_relations_for_logical_field_predicate_internal( pred, logical_schema, physical_schema, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, FOUR_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( pred, logical_schema, physical_schema, mt_info );
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
        if( pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( logical_schema.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( physical_schema.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_get_code_mapping_relations_for_logical_field_predicate_internal( pred, logical_schema, physical_schema,
        mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, logical_schema, physical_schema, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 27071L)
  public static SubLObject sk_source_accessibleP(final SubLObject sks, SubLObject meta_mt)
  {
    if( meta_mt == UNPROVIDED )
    {
      meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject accessibleP = NIL;
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject access_path = sksi_access_path.sksi_determine_access_path( sks, NIL, T );
      if( NIL != sksi_access_path.access_path_p( access_path ) )
      {
        final SubLObject pcase_var;
        final SubLObject sks_type = pcase_var = sksi_access_path.access_path_type( access_path );
        if( pcase_var.eql( $const25$Database_Physical ) )
        {
          accessibleP = db_sk_source_accessibleP( access_path );
        }
        else if( pcase_var.eql( $const47$WebPage_AIS ) )
        {
          accessibleP = web_page_sk_source_accessibleP( access_path );
        }
        else if( pcase_var.eql( $const48$FileHashTable_File ) )
        {
          accessibleP = fht_sk_source_accessibleP( access_path );
        }
        else if( pcase_var.eql( $const49$CommonObjectRequestBrokerArchitec ) )
        {
          accessibleP = corba_sk_source_accessibleP( access_path );
        }
        else if( pcase_var.eql( $kw50$CACHE ) )
        {
          accessibleP = T;
        }
        else
        {
          Errors.cerror( $str51$continue, $str52$Unknown_access_path_type__A_for__, sks_type, sks );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return accessibleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 28530L)
  public static SubLObject db_sk_source_accessibleP(final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym53$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject connection = sksi_sks_interaction.open_sql_source( access_path, UNPROVIDED, UNPROVIDED );
          if( NIL != sdbc.sql_open_connection_p( connection ) )
          {
            successP = T;
            sdbc.sqlc_close( connection );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( error_message.isString() )
    {
      PrintLow.format( T, $str54$The_following_error_occurred_whil, sksi_access_path.access_path_sks( access_path ), error_message );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 29027L)
  public static SubLObject web_page_sk_source_accessibleP(final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym53$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject server = sksi_access_path.access_path_server( access_path );
          final SubLObject port = sksi_access_path.access_path_port( access_path );
          SubLObject url = sksi_access_path.access_path_url( access_path );
          if( NIL == url )
          {
            url = $str55$;
          }
          final SubLObject real_port = port.eql( $kw56$DEFAULT ) ? $int57$80 : port;
          SubLObject channel = NIL;
          try
          {
            channel = subl_promotions.open_tcp_stream_with_timeout( server, real_port, sksi_sks_interaction.$sksi_open_web_connection_default_timeout$.getDynamicValue( thread ), $kw58$PRIVATE );
            if( NIL != subl_macro_promotions.validate_tcp_connection( channel, server, real_port ) )
            {
              web_utilities.send_http_request( channel, ConsesLow.list( new SubLObject[] { $kw59$MACHINE, server, $kw60$PORT, port, $kw61$METHOD, $kw62$GET, $kw63$URL, url, $kw64$QUERY, NIL, $kw65$KEEP_ALIVE_, T,
                $kw66$WIDE_NEWLINES_, NIL, $kw67$ACCEPT_TYPES, $kw56$DEFAULT, $kw68$CONTENT_TYPE, $kw56$DEFAULT, $kw69$SOAP_ACTION_URI, NIL
              } ) );
              successP = T;
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != channel )
              {
                streams_high.close( channel, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( error_message.isString() )
    {
      PrintLow.format( T, $str70$The_following_problem_was_encount, sksi_access_path.access_path_sks( access_path ), error_message );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 29867L)
  public static SubLObject fht_sk_source_accessibleP(final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym53$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject fht = sksi_sks_interaction.open_fht_source( access_path );
          if( NIL != file_hash_table.file_hash_table_p( fht ) )
          {
            successP = T;
          }
          file_hash_table.finalize_file_hash_table( fht );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( error_message.isString() )
    {
      PrintLow.format( T, $str71$_A, error_message );
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 30239L)
  public static SubLObject corba_sk_source_accessibleP(final SubLObject access_path)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sks = sksi_access_path.access_path_sks( access_path );
    SubLObject error_message = NIL;
    SubLObject result = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym53$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject connection = corba_module_utilities.new_corba_connection_by_sks( sks );
          SubLObject transaction_timed_out = NIL;
          final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
          try
          {
            thread.throwStack.push( tag );
            final SubLObject _prev_bind_0_$7 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
            try
            {
              subl_macro_promotions.$within_with_timeout$.bind( T, thread );
              SubLObject timer = NIL;
              try
              {
                final SubLObject _prev_bind_0_$8 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                try
                {
                  subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                  timer = subl_macro_promotions.with_timeout_start_timer( NIL, tag );
                  try
                  {
                    if( NIL != corba_utilities.corba_connection_open( connection, NIL, $kw72$PUBLIC ) )
                    {
                      result = list_utilities.sublisp_boolean( corba_utilities.corba_connection_verify( connection ) );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      if( NIL != corba_utilities.corba_connection_open_p( connection ) )
                      {
                        corba_utilities.corba_connection_close( connection );
                      }
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                }
                finally
                {
                  subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$8, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  subl_macro_promotions.with_timeout_stop_timer( timer );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
                }
              }
            }
            finally
            {
              subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$7, thread );
            }
          }
          catch( final Throwable ccatch_env_var )
          {
            transaction_timed_out = Errors.handleThrowable( ccatch_env_var, tag );
          }
          finally
          {
            thread.throwStack.pop();
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
    catch( final Throwable ccatch_env_var2 )
    {
      error_message = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( error_message.isString() )
    {
      PrintLow.format( T, $str71$_A, error_message );
      return NIL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 30738L)
  public static SubLObject sk_source_registeredP(final SubLObject sks, SubLObject meta_mt)
  {
    if( meta_mt == UNPROVIDED )
    {
      meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sk_source_to_look = sks;
    SubLObject registeredP = sk_source_registeredP_int( sk_source_to_look );
    final SubLObject mt_var = meta_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      while ( NIL == registeredP && NIL != sk_source_to_look)
      {
        sk_source_to_look = sksi_kb_accessors.immediate_genl_ks( sk_source_to_look );
        if( NIL != forts.fort_p( sk_source_to_look ) )
        {
          registeredP = sk_source_registeredP_int( sk_source_to_look );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return registeredP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 31487L)
  public static SubLObject sk_source_registeredP_int(final SubLObject sks)
  {
    return list_utilities.member_eqP( sks, sksi_sks_manager.sksi_registered_knowledge_sources() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 31598L)
  public static SubLObject sk_source_queryableP(final SubLObject sks, SubLObject meta_mt)
  {
    if( meta_mt == UNPROVIDED )
    {
      meta_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    }
    return makeBoolean( NIL != sk_source_registeredP( sks, meta_mt ) && NIL != external_source_activated_in_imageP( sks ) && NIL != sk_source_accessibleP( sks, meta_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32346L)
  public static SubLObject set_external_sources_activated_in_image(final SubLObject sks_list)
  {
    clear_external_sources_activated_in_image();
    SubLObject cdolist_list_var = sks_list;
    SubLObject sks = NIL;
    sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      add_to_external_sources_activated_in_image( sks, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      sks = cdolist_list_var.first();
    }
    return $external_sources_activated_in_image$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32586L)
  public static SubLObject external_sources_activated_in_image()
  {
    return $external_sources_activated_in_image$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32706L)
  public static SubLObject list_of_external_sources_activated_in_image()
  {
    return set.set_element_list( $external_sources_activated_in_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32853L)
  public static SubLObject some_external_source_activated_in_imageP()
  {
    return makeBoolean( NIL == set.set_emptyP( $external_sources_activated_in_image$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 32980L)
  public static SubLObject number_of_external_sources_activated_in_image()
  {
    return set.set_size( $external_sources_activated_in_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 33103L)
  public static SubLObject external_source_activated_in_imageP(final SubLObject sk_source)
  {
    return set.set_memberP( sk_source, $external_sources_activated_in_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 33238L)
  public static SubLObject clear_external_sources_activated_in_image()
  {
    return set.clear_set( $external_sources_activated_in_image$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 33358L)
  public static SubLObject add_to_external_sources_activated_in_image(final SubLObject sks, SubLObject add_sub_ksesP)
  {
    if( add_sub_ksesP == UNPROVIDED )
    {
      add_sub_ksesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sks_list = ConsesLow.list( sks );
    if( NIL != add_sub_ksesP )
    {
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        sks_list = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = sks_list;
    SubLObject eash_sks = NIL;
    eash_sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( eash_sks, $external_sources_activated_in_image$.getGlobalValue() );
      cdolist_list_var = cdolist_list_var.rest();
      eash_sks = cdolist_list_var.first();
    }
    return $external_sources_activated_in_image$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 33753L)
  public static SubLObject remove_from_external_sources_activated_in_image(final SubLObject sks, SubLObject remove_sub_ksesP)
  {
    if( remove_sub_ksesP == UNPROVIDED )
    {
      remove_sub_ksesP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sks_list = ConsesLow.list( sks );
    if( NIL != remove_sub_ksesP )
    {
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        sks_list = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = sks_list;
    SubLObject each_sks = NIL;
    each_sks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_remove( each_sks, $external_sources_activated_in_image$.getGlobalValue() );
      cdolist_list_var = cdolist_list_var.rest();
      each_sks = cdolist_list_var.first();
    }
    return $external_sources_activated_in_image$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 34162L)
  public static SubLObject disjoint_schemasP(final SubLObject schema0, final SubLObject schema1, SubLObject memoizeP)
  {
    if( memoizeP == UNPROVIDED )
    {
      memoizeP = NIL;
    }
    return schema0.eql( schema1 ) ? NIL : ( ( NIL != memoizeP ) ? disjoint_schemas_memoize( schema0, schema1 ) : disjoint_schemas_regular( schema0, schema1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 34422L)
  public static SubLObject disjoint_schemas_memoize(final SubLObject schema0, final SubLObject schema1)
  {
    final SubLObject schema0_isa = sksi_kb_accessors.schema_isa( schema0, UNPROVIDED );
    final SubLObject schema1_isa = sksi_kb_accessors.schema_isa( schema1, UNPROVIDED );
    final SubLObject mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    SubLObject disjointP = NIL;
    if( NIL == disjointP )
    {
      SubLObject csome_list_var = schema0_isa;
      SubLObject col0 = NIL;
      col0 = csome_list_var.first();
      while ( NIL == disjointP && NIL != csome_list_var)
      {
        if( NIL == disjointP )
        {
          SubLObject csome_list_var_$11;
          SubLObject col2;
          for( csome_list_var_$11 = schema1_isa, col2 = NIL, col2 = csome_list_var_$11.first(); NIL == disjointP && NIL != csome_list_var_$11; disjointP = ( ( NIL != kb_utilities.term_L( col2, col0, UNPROVIDED,
              UNPROVIDED, UNPROVIDED ) ) ? disjoint_schemas_memoized_int( col2, col0, mt_info ) : disjoint_schemas_memoized_int( col0, col2, mt_info ) ), csome_list_var_$11 = csome_list_var_$11
                  .rest(), col2 = csome_list_var_$11.first() )
          {
          }
        }
        csome_list_var = csome_list_var.rest();
        col0 = csome_list_var.first();
      }
    }
    return disjointP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 34870L)
  public static SubLObject disjoint_schemas_memoized_int_internal(final SubLObject col0, final SubLObject col1, final SubLObject mt_info)
  {
    return disjoint_with.disjoint_withP( col0, col1, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 34870L)
  public static SubLObject disjoint_schemas_memoized_int(final SubLObject col0, final SubLObject col1, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return disjoint_schemas_memoized_int_internal( col0, col1, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( col0, col1, mt_info );
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
        if( col0.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( col1.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( disjoint_schemas_memoized_int_internal( col0, col1, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col0, col1, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 35028L)
  public static SubLObject disjoint_schemas_regular(final SubLObject schema0, final SubLObject schema1)
  {
    final SubLObject schema0_isa = sksi_kb_accessors.schema_isa( schema0, UNPROVIDED );
    final SubLObject schema1_isa = sksi_kb_accessors.schema_isa( schema1, UNPROVIDED );
    SubLObject disjointP = NIL;
    if( NIL == disjointP )
    {
      SubLObject csome_list_var = schema0_isa;
      SubLObject col0 = NIL;
      col0 = csome_list_var.first();
      while ( NIL == disjointP && NIL != csome_list_var)
      {
        if( NIL == disjointP )
        {
          SubLObject csome_list_var_$12;
          SubLObject col2;
          for( csome_list_var_$12 = schema1_isa, col2 = NIL, col2 = csome_list_var_$12.first(); NIL == disjointP && NIL != csome_list_var_$12; disjointP = disjoint_with.disjoint_withP( col0, col2, UNPROVIDED,
              UNPROVIDED ), csome_list_var_$12 = csome_list_var_$12.rest(), col2 = csome_list_var_$12.first() )
          {
          }
        }
        csome_list_var = csome_list_var.rest();
        col0 = csome_list_var.first();
      }
    }
    return disjointP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 35336L)
  public static SubLObject all_disjoint_schemas(final SubLObject schema, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject disjoint_schemas = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      disjoint_schemas = all_disjoint_schemas_int( schema, mt_relevance_macros.mt_info( UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return disjoint_schemas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 35554L)
  public static SubLObject all_disjoint_schemas_int_internal(final SubLObject schema, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject disjoint_schemas = NIL;
    final SubLObject node_var = $const76$ObjectDefiningSchema;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const77$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$13 = node_var;
        final SubLObject deck_type = $kw80$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym81$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw82$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw85$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str86$continue_anyway, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw87$WARN ) )
                {
                  Errors.warn( $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str88$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str86$continue_anyway, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ) ),
                    thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                    $const77$isa ) ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$18 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                        .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$13, UNPROVIDED );
                    while ( NIL != node_var_$13)
                    {
                      final SubLObject tt_node_var = node_var_$13;
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const77$isa ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$25;
                                      for( iteration_state_$25 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$25 ); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next( iteration_state_$25 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$25 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject other_schema;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                other_schema = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, other_schema ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( other_schema ) && NIL != disjoint_schemasP( schema, other_schema, T ) )
                                                  {
                                                    disjoint_schemas = ConsesLow.cons( other_schema, disjoint_schemas );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject other_schema2 = NIL;
                                              other_schema2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( other_schema2 ) && NIL != disjoint_schemasP( schema, other_schema2, T ) )
                                                  {
                                                    disjoint_schemas = ConsesLow.cons( other_schema2, disjoint_schemas );
                                                  }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                other_schema2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$20, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$25 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$19, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                            {
                              SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                              SubLObject instance_tuple = NIL;
                              instance_tuple = csome_list_var2.first();
                              while ( NIL != csome_list_var2)
                              {
                                SubLObject current;
                                final SubLObject datum = current = instance_tuple;
                                SubLObject link_node = NIL;
                                SubLObject mt2 = NIL;
                                SubLObject tv2 = NIL;
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                link_node = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                mt2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                tv2 = current.first();
                                current = current.rest();
                                if( NIL == current )
                                {
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                          final SubLObject sol;
                                          final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject other_schema;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              other_schema = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, other_schema ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema,
                                                  sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL != forts.fort_p( other_schema ) && NIL != disjoint_schemasP( schema, other_schema, T ) )
                                                {
                                                  disjoint_schemas = ConsesLow.cons( other_schema, disjoint_schemas );
                                                }
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var_$29 = sol;
                                            SubLObject other_schema2 = NIL;
                                            other_schema2 = csome_list_var_$29.first();
                                            while ( NIL != csome_list_var_$29)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL != forts.fort_p( other_schema2 ) && NIL != disjoint_schemasP( schema, other_schema2, T ) )
                                                {
                                                  disjoint_schemas = ConsesLow.cons( other_schema2, disjoint_schemas );
                                                }
                                              }
                                              csome_list_var_$29 = csome_list_var_$29.rest();
                                              other_schema2 = csome_list_var_$29.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$22, thread );
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$21, thread );
                                    }
                                  }
                                }
                                else
                                {
                                  cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                instance_tuple = csome_list_var2.first();
                              }
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$30;
                            final SubLObject new_list = cdolist_list_var_$30 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), sbhl_search_vars.$sbhl_tv$
                                    .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                    sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$30.first();
                            while ( NIL != cdolist_list_var_$30)
                            {
                              final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject other_schema3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    other_schema3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, other_schema3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema3,
                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL != forts.fort_p( other_schema3 ) && NIL != disjoint_schemasP( schema, other_schema3, T ) )
                                      {
                                        disjoint_schemas = ConsesLow.cons( other_schema3, disjoint_schemas );
                                      }
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var3 = sol2;
                                  SubLObject other_schema4 = NIL;
                                  other_schema4 = csome_list_var3.first();
                                  while ( NIL != csome_list_var3)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL != forts.fort_p( other_schema4 ) && NIL != disjoint_schemasP( schema, other_schema4, T ) )
                                      {
                                        disjoint_schemas = ConsesLow.cons( other_schema4, disjoint_schemas );
                                      }
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    other_schema4 = csome_list_var3.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$23, thread );
                              }
                              cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                              generating_fn = cdolist_list_var_$30.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$19, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$18, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      SubLObject cdolist_list_var2;
                      final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                          $const77$isa ) ) );
                      SubLObject module_var2 = NIL;
                      module_var2 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node2 = function_terms.naut_to_nart( node_var_$13 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                          {
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link2 )
                            {
                              final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links2 )
                              {
                                SubLObject iteration_state2;
                                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                  final SubLObject tv_links2 = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                  {
                                    final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                      SubLObject iteration_state_$26;
                                      for( iteration_state_$26 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$26 ); iteration_state_$26 = dictionary_contents.do_dictionary_contents_next( iteration_state_$26 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$26 );
                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol3 = link_nodes4;
                                            if( NIL != set.set_p( sol3 ) )
                                            {
                                              final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                              SubLObject basis_object3;
                                              SubLObject state3;
                                              SubLObject node_vars_link_node;
                                              for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                  set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol3.isList() )
                                            {
                                              SubLObject csome_list_var4 = sol3;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var4.first();
                                              while ( NIL != csome_list_var4)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var4 = csome_list_var4.rest();
                                                node_vars_link_node2 = csome_list_var4.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$26, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$26 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$25, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$31;
                            final SubLObject new_list2 = cdolist_list_var_$31 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn2 = NIL;
                            generating_fn2 = cdolist_list_var_$31.first();
                            while ( NIL != cdolist_list_var_$31)
                            {
                              final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                final SubLObject sol4;
                                final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                if( NIL != set.set_p( sol4 ) )
                                {
                                  final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                  SubLObject basis_object4;
                                  SubLObject state4;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                      set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol4.isList() )
                                {
                                  SubLObject csome_list_var5 = sol4;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var5.first();
                                  while ( NIL != csome_list_var5)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var5 = csome_list_var5.rest();
                                    node_vars_link_node4 = csome_list_var5.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$27, thread );
                              }
                              cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                              generating_fn2 = cdolist_list_var_$31.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$20, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$24, thread );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        module_var2 = cdolist_list_var2.first();
                      }
                      node_var_$13 = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$21, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$18, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$17, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str92$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$17, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$16, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$16, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$15, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$14, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return disjoint_schemas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 35554L)
  public static SubLObject all_disjoint_schemas_int(final SubLObject schema, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return all_disjoint_schemas_int_internal( schema, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym75$ALL_DISJOINT_SCHEMAS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym75$ALL_DISJOINT_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym75$ALL_DISJOINT_SCHEMAS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( schema, mt_info );
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
        if( schema.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( all_disjoint_schemas_int_internal( schema, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( schema, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 35885L)
  public static SubLObject all_joinable_object_defining_schemas(final SubLObject schema, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject schemas = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      schemas = all_joinable_object_defining_schemas_int( schema, mt_relevance_macros.mt_info( UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return schemas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 36158L)
  public static SubLObject all_joinable_object_defining_schemas_int_internal(final SubLObject schema, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject schemas = NIL;
    final SubLObject node_var = $const76$ObjectDefiningSchema;
    final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
    final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
    try
    {
      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const77$isa ), thread );
      sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        SubLObject node_var_$41 = node_var;
        final SubLObject deck_type = $kw80$STACK;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$42 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = NIL;
            final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym81$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw82$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw85$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str86$continue_anyway, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw87$WARN ) )
                {
                  Errors.warn( $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str88$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str86$continue_anyway, $str83$_A_is_not_a__A, tv_var, $sym84$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ) ),
                    thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                    $const77$isa ) ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$46 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                        .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const77$isa ) ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$41, UNPROVIDED );
                    while ( NIL != node_var_$41)
                    {
                      final SubLObject tt_node_var = node_var_$41;
                      SubLObject cdolist_list_var;
                      final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const77$isa ) );
                      SubLObject module_var = NIL;
                      module_var = cdolist_list_var.first();
                      while ( NIL != cdolist_list_var)
                      {
                        final SubLObject _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                          {
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link )
                            {
                              final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                  sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links )
                              {
                                SubLObject iteration_state;
                                for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                  final SubLObject tv_links = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                  {
                                    final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                      SubLObject iteration_state_$53;
                                      for( iteration_state_$53 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$53 ); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next( iteration_state_$53 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$53 );
                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                        {
                                          final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                            final SubLObject sol = link_nodes;
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject other_schema;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                other_schema = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, other_schema ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( other_schema ) && NIL == disjoint_schemasP( schema, other_schema, T ) )
                                                  {
                                                    schemas = ConsesLow.cons( other_schema, schemas );
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var = sol;
                                              SubLObject other_schema2 = NIL;
                                              other_schema2 = csome_list_var.first();
                                              while ( NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( other_schema2 ) && NIL == disjoint_schemasP( schema, other_schema2, T ) )
                                                  {
                                                    schemas = ConsesLow.cons( other_schema2, schemas );
                                                  }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                other_schema2 = csome_list_var.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$48, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$53 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$47, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                            {
                              SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                              SubLObject instance_tuple = NIL;
                              instance_tuple = csome_list_var2.first();
                              while ( NIL != csome_list_var2)
                              {
                                SubLObject current;
                                final SubLObject datum = current = instance_tuple;
                                SubLObject link_node = NIL;
                                SubLObject mt2 = NIL;
                                SubLObject tv2 = NIL;
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                link_node = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                mt2 = current.first();
                                current = current.rest();
                                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list91 );
                                tv2 = current.first();
                                current = current.rest();
                                if( NIL == current )
                                {
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                  {
                                    final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                      {
                                        final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                          final SubLObject sol;
                                          final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject other_schema;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              other_schema = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, other_schema ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema,
                                                  sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( other_schema, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL != forts.fort_p( other_schema ) && NIL == disjoint_schemasP( schema, other_schema, T ) )
                                                {
                                                  schemas = ConsesLow.cons( other_schema, schemas );
                                                }
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var_$57 = sol;
                                            SubLObject other_schema2 = NIL;
                                            other_schema2 = csome_list_var_$57.first();
                                            while ( NIL != csome_list_var_$57)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( other_schema2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                if( NIL != forts.fort_p( other_schema2 ) && NIL == disjoint_schemasP( schema, other_schema2, T ) )
                                                {
                                                  schemas = ConsesLow.cons( other_schema2, schemas );
                                                }
                                              }
                                              csome_list_var_$57 = csome_list_var_$57.rest();
                                              other_schema2 = csome_list_var_$57.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$50, thread );
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$49, thread );
                                    }
                                  }
                                }
                                else
                                {
                                  cdestructuring_bind.cdestructuring_bind_error( datum, $list91 );
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                instance_tuple = csome_list_var2.first();
                              }
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$58;
                            final SubLObject new_list = cdolist_list_var_$58 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ), sbhl_search_vars.$sbhl_tv$
                                    .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const77$isa ) ),
                                    sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn = NIL;
                            generating_fn = cdolist_list_var_$58.first();
                            while ( NIL != cdolist_list_var_$58)
                            {
                              final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                final SubLObject sol2;
                                final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                if( NIL != set.set_p( sol2 ) )
                                {
                                  final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                  SubLObject basis_object2;
                                  SubLObject state2;
                                  SubLObject other_schema3;
                                  for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                      set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                  {
                                    other_schema3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state2, other_schema3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema3,
                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( other_schema3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL != forts.fort_p( other_schema3 ) && NIL == disjoint_schemasP( schema, other_schema3, T ) )
                                      {
                                        schemas = ConsesLow.cons( other_schema3, schemas );
                                      }
                                    }
                                  }
                                }
                                else if( sol2.isList() )
                                {
                                  SubLObject csome_list_var3 = sol2;
                                  SubLObject other_schema4 = NIL;
                                  other_schema4 = csome_list_var3.first();
                                  while ( NIL != csome_list_var3)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( other_schema4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                      if( NIL != forts.fort_p( other_schema4 ) && NIL == disjoint_schemasP( schema, other_schema4, T ) )
                                      {
                                        schemas = ConsesLow.cons( other_schema4, schemas );
                                      }
                                    }
                                    csome_list_var3 = csome_list_var3.rest();
                                    other_schema4 = csome_list_var3.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$51, thread );
                              }
                              cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                              generating_fn = cdolist_list_var_$58.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$47, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$46, thread );
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        module_var = cdolist_list_var.first();
                      }
                      SubLObject cdolist_list_var2;
                      final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                          $const77$isa ) ) );
                      SubLObject module_var2 = NIL;
                      module_var2 = cdolist_list_var2.first();
                      while ( NIL != cdolist_list_var2)
                      {
                        final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                              .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                          final SubLObject node2 = function_terms.naut_to_nart( node_var_$41 );
                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                          {
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != d_link2 )
                            {
                              final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != mt_links2 )
                              {
                                SubLObject iteration_state2;
                                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                    iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                {
                                  thread.resetMultipleValues();
                                  final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                  final SubLObject tv_links2 = thread.secondMultipleValue();
                                  thread.resetMultipleValues();
                                  if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                  {
                                    final SubLObject _prev_bind_0_$53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                      SubLObject iteration_state_$54;
                                      for( iteration_state_$54 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state_$54 ); iteration_state_$54 = dictionary_contents.do_dictionary_contents_next( iteration_state_$54 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$54 );
                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol3 = link_nodes4;
                                            if( NIL != set.set_p( sol3 ) )
                                            {
                                              final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                              SubLObject basis_object3;
                                              SubLObject state3;
                                              SubLObject node_vars_link_node;
                                              for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                  set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                              {
                                                node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                    UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol3.isList() )
                                            {
                                              SubLObject csome_list_var4 = sol3;
                                              SubLObject node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var4.first();
                                              while ( NIL != csome_list_var4)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var4 = csome_list_var4.rest();
                                                node_vars_link_node2 = csome_list_var4.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$54, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$54 );
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$53, thread );
                                    }
                                  }
                                }
                                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                              }
                            }
                            else
                            {
                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str90$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                          }
                          else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                          {
                            SubLObject cdolist_list_var_$59;
                            final SubLObject new_list2 = cdolist_list_var_$59 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                    UNPROVIDED ) ) )
                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                    .get_sbhl_module( UNPROVIDED ) ) );
                            SubLObject generating_fn2 = NIL;
                            generating_fn2 = cdolist_list_var_$59.first();
                            while ( NIL != cdolist_list_var_$59)
                            {
                              final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                              try
                              {
                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                final SubLObject sol4;
                                final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                if( NIL != set.set_p( sol4 ) )
                                {
                                  final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                  SubLObject basis_object4;
                                  SubLObject state4;
                                  SubLObject node_vars_link_node3;
                                  for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                      set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                  {
                                    node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                    if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                        UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node3, recur_deck );
                                    }
                                  }
                                }
                                else if( sol4.isList() )
                                {
                                  SubLObject csome_list_var5 = sol4;
                                  SubLObject node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var5.first();
                                  while ( NIL != csome_list_var5)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var5 = csome_list_var5.rest();
                                    node_vars_link_node4 = csome_list_var5.first();
                                  }
                                }
                                else
                                {
                                  Errors.error( $str89$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                }
                              }
                              finally
                              {
                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$55, thread );
                              }
                              cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                              generating_fn2 = cdolist_list_var_$59.first();
                            }
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$48, thread );
                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$52, thread );
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        module_var2 = cdolist_list_var2.first();
                      }
                      node_var_$41 = deck.deck_pop( recur_deck );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$49, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$46, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$45, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str92$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$45, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$44, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$44, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$43, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$56 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$56, thread );
            }
          }
        }
        finally
        {
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$42, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_2, thread );
      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0, thread );
    }
    return schemas;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 36158L)
  public static SubLObject all_joinable_object_defining_schemas_int(final SubLObject schema, final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return all_joinable_object_defining_schemas_int_internal( schema, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( schema, mt_info );
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
        if( schema.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( all_joinable_object_defining_schemas_int_internal( schema, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( schema, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 36530L)
  public static SubLObject sksi_determine_relevant_object_defining_schemas(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata)
  {
    return sksi_determine_relevant_object_defining_schemas_memoized( logical_field_indexical, logical_schemata, physical_schemata, mt_relevance_macros.mt_info( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 36796L)
  public static SubLObject sksi_determine_relevant_object_defining_schemas_memoized_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject mt_info)
  {
    final SubLObject encodings = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical( logical_field_indexical, logical_schemata, physical_schemata, UNPROVIDED );
    SubLObject schemas = NIL;
    SubLObject source_schemas = NIL;
    SubLObject cdolist_list_var = encodings;
    SubLObject encoding = NIL;
    encoding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject schema_object_id_fn_exps = list_utilities.tree_find_all_if( $sym95$SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED );
      final SubLObject source_schema_object_id_fn_exps = list_utilities.tree_find_all_if( $sym96$SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P, encoding, UNPROVIDED );
      SubLObject cdolist_list_var_$69 = schema_object_id_fn_exps;
      SubLObject schema_object_id_fn_exp = NIL;
      schema_object_id_fn_exp = cdolist_list_var_$69.first();
      while ( NIL != cdolist_list_var_$69)
      {
        schemas = ConsesLow.cons( cycl_utilities.formula_arg1( schema_object_id_fn_exp, UNPROVIDED ), schemas );
        cdolist_list_var_$69 = cdolist_list_var_$69.rest();
        schema_object_id_fn_exp = cdolist_list_var_$69.first();
      }
      SubLObject cdolist_list_var_$70 = source_schema_object_id_fn_exps;
      SubLObject source_schema_object_id_fn_exp = NIL;
      source_schema_object_id_fn_exp = cdolist_list_var_$70.first();
      while ( NIL != cdolist_list_var_$70)
      {
        source_schemas = ConsesLow.cons( cycl_utilities.formula_arg2( source_schema_object_id_fn_exp, UNPROVIDED ), source_schemas );
        cdolist_list_var_$70 = cdolist_list_var_$70.rest();
        source_schema_object_id_fn_exp = cdolist_list_var_$70.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      encoding = cdolist_list_var.first();
    }
    return Values.values( list_utilities.fast_delete_duplicates( schemas, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), list_utilities.fast_delete_duplicates( source_schemas, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 36796L)
  public static SubLObject sksi_determine_relevant_object_defining_schemas_memoized(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata,
      final SubLObject mt_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return sksi_determine_relevant_object_defining_schemas_memoized_internal( logical_field_indexical, logical_schemata, physical_schemata, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, FOUR_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED, caching_state );
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( sksi_determine_relevant_object_defining_schemas_memoized_internal( logical_field_indexical, logical_schemata,
        physical_schemata, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( logical_field_indexical, logical_schemata, physical_schemata, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 37781L)
  public static SubLObject schema_object_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != narts_high.naut_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const97$SchemaObjectFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 38028L)
  public static SubLObject schema_object_id_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != narts_high.naut_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const98$SchemaObjectIDFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 38194L)
  public static SubLObject source_schema_object_fn_expression_possibly_definedP(final SubLObject expression)
  {
    return list_utilities.sublisp_boolean( source_schema_object_fn_expression_possibly_defined( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 38464L)
  public static SubLObject source_schema_object_fn_expression_possibly_defined(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( expression, UNPROVIDED );
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var;
      final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        supports = sks_relevant_to_ods( sks, ods );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 38882L)
  public static SubLObject source_schema_object_fn_expression_undefinedP(final SubLObject expression)
  {
    return list_utilities.sublisp_boolean( source_schema_object_fn_expression_undefined( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 39035L)
  public static SubLObject source_schema_object_fn_expression_undefined(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject supports = source_schema_object_fn_expression_undefined_int( expression );
    final SubLObject object_field = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 39275L)
  public static SubLObject source_schema_object_fn_expression_undefined_int(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    SubLObject object_field = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( expression, UNPROVIDED );
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject mt_var;
      final SubLObject mapping_mt = mt_var = sksi_kb_accessors.sk_source_mapping_mt( sks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        object_field = sksi_kb_accessors.schema_object_field( ods );
        if( NIL != object_field )
        {
          final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields( object_field, UNPROVIDED );
          thread.resetMultipleValues();
          final SubLObject anti_supports = sks_relevant_to_some_logical_field( sks, joinable_fields );
          final SubLObject anti_support_lf = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL == anti_supports )
          {
            final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf( ods, object_field );
            supports = ConsesLow.cons( object_field_gaf, supports );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    }
    return Values.values( supports, object_field );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 40119L)
  public static SubLObject source_schema_object_fn_expressions_equalP(final SubLObject expression1, final SubLObject expression2)
  {
    return list_utilities.sublisp_boolean( source_schema_object_fn_expressions_equal( expression1, expression2, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 40296L)
  public static SubLObject source_schema_object_fn_expressions_equal(final SubLObject expression1, final SubLObject expression2, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    if( expression1.equal( expression2 ) )
    {
      final SubLObject equals_literal = el_utilities.list_to_elf( ConsesLow.list( $const100$equals, expression1, expression2 ) );
      final SubLObject equals_support = arguments.make_hl_support( $kw101$REFLEXIVE, equals_literal, UNPROVIDED, UNPROVIDED );
      supports = ConsesLow.cons( equals_support, supports );
    }
    if( NIL == supports )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.formula_args( expression1, UNPROVIDED );
      SubLObject sks1 = NIL;
      SubLObject ods1 = NIL;
      SubLObject sub_expression1 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
      sks1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
      ods1 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list102 );
      sub_expression1 = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$72;
        final SubLObject datum_$71 = current_$72 = cycl_utilities.formula_args( expression2, UNPROVIDED );
        SubLObject sks2 = NIL;
        SubLObject ods2 = NIL;
        SubLObject sub_expression2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$72, datum_$71, $list103 );
        sks2 = current_$72.first();
        current_$72 = current_$72.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$72, datum_$71, $list103 );
        ods2 = current_$72.first();
        current_$72 = current_$72.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$72, datum_$71, $list103 );
        sub_expression2 = current_$72.first();
        current_$72 = current_$72.rest();
        if( NIL == current_$72 )
        {
          final SubLObject mapping_mt1 = sksi_kb_accessors.sk_source_mapping_mt( sks1 );
          final SubLObject mapping_mt2 = sksi_kb_accessors.sk_source_mapping_mt( sks2 );
          if( mapping_mt1.eql( mapping_mt2 ) )
          {
            final SubLObject mt_var = mapping_mt1;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
              if( ods1.eql( ods2 ) && sub_expression1.equal( sub_expression2 ) )
              {
                final SubLObject object_field = sksi_kb_accessors.schema_object_field( ods1 );
                if( NIL != object_field )
                {
                  final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields( object_field, UNPROVIDED );
                  if( NIL != joinable_fields )
                  {
                    if( NIL != sksi_kb_accessors.sk_source_super_ksP( sks1, sks2 ) )
                    {
                      supports = source_schema_object_fn_expressions_equal_sub_ks( sks1, sks2, object_field, joinable_fields, ods1, justifyP );
                    }
                    else if( NIL != sksi_kb_accessors.sk_source_sub_ksP( sks1, sks2 ) )
                    {
                      supports = source_schema_object_fn_expressions_equal_sub_ks( sks2, sks1, object_field, joinable_fields, ods1, justifyP );
                    }
                    else if( NIL != sksi_kb_accessors.common_super_ksP( sks1, sks2 ) )
                    {
                      supports = source_schema_object_fn_expressions_equal_common_super_ks( sks1, sks2, object_field, joinable_fields, ods1, justifyP );
                    }
                  }
                }
              }
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
            }
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$71, $list103 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list102 );
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 42130L)
  public static SubLObject source_schema_object_fn_expressions_equal_sub_ks(final SubLObject sub_ks, final SubLObject super_ks, final SubLObject object_field, final SubLObject joinable_fields, final SubLObject ods,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    thread.resetMultipleValues();
    SubLObject possible_supports = sks_relevant_to_some_logical_field( sub_ks, joinable_fields );
    final SubLObject logical_field = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != possible_supports )
    {
      if( NIL != justifyP )
      {
        final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf( ods, object_field );
        final SubLObject joinable_literal = el_utilities.list_to_elf( ConsesLow.list( $const104$joinable, object_field, logical_field ) );
        final SubLObject support_module = object_field.eql( logical_field ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
        final SubLObject joinable_support = arguments.make_hl_support( support_module, joinable_literal, UNPROVIDED, UNPROVIDED );
        final SubLObject sub_ks_literal = el_utilities.list_to_elf( ConsesLow.list( $const106$subKS, super_ks, sub_ks ) );
        final SubLObject sub_ks_support = arguments.make_hl_support( $kw105$TRANSITIVITY, sub_ks_literal, UNPROVIDED, UNPROVIDED );
        possible_supports = ConsesLow.cons( object_field_gaf, possible_supports );
        possible_supports = ConsesLow.cons( joinable_support, possible_supports );
        possible_supports = ( supports = ConsesLow.cons( sub_ks_support, possible_supports ) );
      }
      else
      {
        supports = T;
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 43147L)
  public static SubLObject source_schema_object_fn_expressions_equal_common_super_ks(final SubLObject sks1, final SubLObject sks2, final SubLObject object_field, final SubLObject joinable_fields, final SubLObject ods,
      final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject supports = NIL;
    thread.resetMultipleValues();
    SubLObject possible_supports1 = sks_relevant_to_some_logical_field( sks1, joinable_fields );
    final SubLObject logical_field1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != possible_supports1 )
    {
      thread.resetMultipleValues();
      SubLObject possible_supports2 = sks_relevant_to_some_logical_field( sks2, joinable_fields );
      final SubLObject logical_field2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != possible_supports2 )
      {
        if( NIL != justifyP )
        {
          final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf( ods, object_field );
          final SubLObject joinable_literal1 = el_utilities.list_to_elf( ConsesLow.list( $const104$joinable, object_field, logical_field1 ) );
          final SubLObject support_module1 = object_field.eql( logical_field1 ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
          final SubLObject joinable_support1 = arguments.make_hl_support( support_module1, joinable_literal1, UNPROVIDED, UNPROVIDED );
          final SubLObject joinable_literal2 = el_utilities.list_to_elf( ConsesLow.list( $const104$joinable, object_field, logical_field2 ) );
          final SubLObject support_module2 = object_field.eql( logical_field2 ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
          final SubLObject joinable_support2 = arguments.make_hl_support( support_module2, joinable_literal2, UNPROVIDED, UNPROVIDED );
          final SubLObject common_super_ks = sksi_kb_accessors.super_ks_closure_intersection( sks1, sks2 ).first();
          final SubLObject super_ks_literal1 = el_utilities.list_to_elf( ConsesLow.list( $const106$subKS, common_super_ks, sks1 ) );
          final SubLObject support_module3 = common_super_ks.eql( sks1 ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
          final SubLObject super_ks_support1 = arguments.make_hl_support( support_module3, super_ks_literal1, UNPROVIDED, UNPROVIDED );
          final SubLObject super_ks_literal2 = el_utilities.list_to_elf( ConsesLow.list( $const106$subKS, common_super_ks, sks2 ) );
          final SubLObject support_module4 = common_super_ks.eql( sks2 ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
          final SubLObject super_ks_support2 = arguments.make_hl_support( support_module4, super_ks_literal2, UNPROVIDED, UNPROVIDED );
          possible_supports1 = ConsesLow.cons( object_field_gaf, possible_supports1 );
          possible_supports1 = ConsesLow.cons( joinable_support1, possible_supports1 );
          possible_supports2 = ConsesLow.cons( joinable_support2, possible_supports2 );
          possible_supports1 = ConsesLow.cons( super_ks_support1, possible_supports1 );
          possible_supports2 = ConsesLow.cons( super_ks_support2, possible_supports2 );
          supports = ConsesLow.append( possible_supports1, possible_supports2 );
        }
        else
        {
          supports = T;
        }
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 45070L)
  public static SubLObject source_schema_object_fn_equal_sk_sources(final SubLObject expression)
  {
    SubLObject sk_sources = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( expression, UNPROVIDED );
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject object_field = sksi_kb_accessors.schema_object_field( ods );
      if( NIL != object_field )
      {
        final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields( object_field, UNPROVIDED );
        if( NIL != sks_relevant_to_some_logical_fieldP( sks, joinable_fields ) )
        {
          final SubLObject max_sk_sources = sksi_kb_accessors.sk_source_super_ks_max( sks );
          SubLObject cdolist_list_var;
          final SubLObject closure = cdolist_list_var = list_utilities.fast_delete_duplicates( Mapping.mapcan( $sym107$SK_SOURCE_SUB_KS_CLOSURE, max_sk_sources, EMPTY_SUBL_OBJECT_ARRAY ), Symbols.symbol_function( EQ ),
              UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          SubLObject ks = NIL;
          ks = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != sks_relevant_to_some_logical_fieldP( ks, joinable_fields ) )
            {
              sk_sources = ConsesLow.cons( ks, sk_sources );
            }
            cdolist_list_var = cdolist_list_var.rest();
            ks = cdolist_list_var.first();
          }
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    }
    return sk_sources;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 45879L)
  public static SubLObject source_schema_object_fn_equal_expressions(final SubLObject expression)
  {
    SubLObject expressions = NIL;
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( expression, UNPROVIDED );
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject cdolist_list_var;
      final SubLObject sk_sources = cdolist_list_var = source_schema_object_fn_equal_sk_sources( expression );
      SubLObject ks = NIL;
      ks = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        expressions = ConsesLow.cons( el_utilities.list_to_elf( ConsesLow.list( $const108$SourceSchemaObjectFn, ks, ods, sub_expression ) ), expressions );
        cdolist_list_var = cdolist_list_var.rest();
        ks = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    }
    return expressions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 46301L)
  public static SubLObject source_schema_object_fn_canonical_sks(final SubLObject sks)
  {
    return sksi_kb_accessors.sk_source_super_ks_max( sks ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 46417L)
  public static SubLObject source_schema_object_fn_canonical_expression(final SubLObject expression)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.formula_args( expression, UNPROVIDED );
    SubLObject sks = NIL;
    SubLObject ods = NIL;
    SubLObject sub_expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    ods = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    sub_expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return el_utilities.list_to_elf( ConsesLow.list( $const108$SourceSchemaObjectFn, source_schema_object_fn_canonical_sks( sks ), ods, sub_expression ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list99 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 46695L)
  public static SubLObject sks_relevant_to_ods(final SubLObject sks, final SubLObject ods)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject object_field = sksi_kb_accessors.schema_object_field( ods );
    SubLObject supports = NIL;
    if( NIL != object_field )
    {
      final SubLObject joinable_fields = sksi_kb_accessors.logical_field_joinable_fields( object_field, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject possible_supports = sks_relevant_to_some_logical_field( sks, joinable_fields );
      final SubLObject logical_field = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != possible_supports )
      {
        final SubLObject object_field_gaf = sksi_kb_accessors.schema_object_field_gaf( ods, object_field );
        final SubLObject joinable_literal = el_utilities.list_to_elf( ConsesLow.list( $const104$joinable, object_field, logical_field ) );
        final SubLObject support_module = object_field.eql( logical_field ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
        final SubLObject joinable_support = arguments.make_hl_support( support_module, joinable_literal, UNPROVIDED, UNPROVIDED );
        supports = possible_supports;
        supports = ConsesLow.cons( object_field_gaf, supports );
        supports = ConsesLow.cons( joinable_support, supports );
      }
    }
    return supports;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 47533L)
  public static SubLObject sks_relevant_to_some_logical_fieldP(final SubLObject sks, final SubLObject logical_fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject supports = sks_relevant_to_some_logical_field( sks, logical_fields );
    final SubLObject support_lf = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return list_utilities.sublisp_boolean( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 47770L)
  public static SubLObject sks_relevant_to_some_logical_field(final SubLObject sks, final SubLObject logical_fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject supports = sks_relevant_to_some_logical_field_int( sks, logical_fields );
    final SubLObject support_ks = thread.secondMultipleValue();
    final SubLObject support_lf = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != supports )
    {
      final SubLObject sub_ks_literal = el_utilities.list_to_elf( ConsesLow.list( $const106$subKS, sks, support_ks ) );
      final SubLObject support_module = sks.eql( support_ks ) ? $kw101$REFLEXIVE : $kw105$TRANSITIVITY;
      final SubLObject sub_ks_support = arguments.make_hl_support( support_module, sub_ks_literal, UNPROVIDED, UNPROVIDED );
      supports = ConsesLow.cons( sub_ks_support, supports );
    }
    return Values.values( supports, support_lf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 48280L)
  public static SubLObject sks_relevant_to_some_logical_field_int(final SubLObject sks, final SubLObject logical_fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject supports = sks_directly_relevant_to_some_logical_field( sks, logical_fields );
    SubLObject support_ks = thread.secondMultipleValue();
    SubLObject support_lf = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject pred_var = $const109$subKS_Direct;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( sks, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( sks, ONE_INTEGER, pred_var );
      SubLObject done_var = supports;
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
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw110$GAF, $kw5$TRUE, NIL );
            SubLObject done_var_$73 = supports;
            final SubLObject token_var_$74 = NIL;
            while ( NIL == done_var_$73)
            {
              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$74 );
              final SubLObject valid_$75 = makeBoolean( !token_var_$74.eql( gaf ) );
              if( NIL != valid_$75 )
              {
                final SubLObject sub_ks = assertions_high.gaf_arg2( gaf );
                thread.resetMultipleValues();
                final SubLObject supports_$76 = sks_relevant_to_some_logical_field_int( sub_ks, logical_fields );
                final SubLObject support_ks_$77 = thread.secondMultipleValue();
                final SubLObject support_lf_$78 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                supports = supports_$76;
                support_ks = support_ks_$77;
                support_lf = support_lf_$78;
              }
              done_var_$73 = makeBoolean( NIL == valid_$75 || NIL != supports );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        done_var = makeBoolean( NIL == valid || NIL != supports );
      }
    }
    return Values.values( supports, support_ks, support_lf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 48726L)
  public static SubLObject sks_directly_relevant_to_some_logical_field(final SubLObject sks, final SubLObject logical_fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject logical_schemata = sksi_kb_accessors.sk_source_logical_schemata( sks );
    SubLObject supports = NIL;
    SubLObject support_ks = NIL;
    SubLObject support_lf = NIL;
    if( NIL != logical_schemata )
    {
      thread.resetMultipleValues();
      final SubLObject ls_relevance_gaf = some_logical_schema_relevant_to_some_logical_field( logical_schemata, logical_fields );
      final SubLObject logical_schema = thread.secondMultipleValue();
      final SubLObject logical_field = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != ls_relevance_gaf )
      {
        final SubLObject sks_relevance_gafs = sksi_kb_accessors.logical_schema_source_gafs( logical_schema, sks );
        supports = ConsesLow.cons( ls_relevance_gaf, sks_relevance_gafs );
        support_ks = sks;
        support_lf = logical_field;
      }
    }
    return Values.values( supports, support_ks, support_lf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 49377L)
  public static SubLObject some_logical_schema_relevant_to_some_logical_field(final SubLObject logical_schemata, final SubLObject logical_fields)
  {
    SubLObject support = NIL;
    SubLObject support_ls = NIL;
    SubLObject support_lf = NIL;
    if( NIL == support )
    {
      SubLObject csome_list_var = logical_fields;
      SubLObject lf = NIL;
      lf = csome_list_var.first();
      while ( NIL == support && NIL != csome_list_var)
      {
        final SubLObject pred_var = $const111$logicalFields;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( lf, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( lf, TWO_INTEGER, pred_var );
          SubLObject done_var = support;
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw110$GAF, $kw5$TRUE, NIL );
                SubLObject done_var_$79 = support;
                final SubLObject token_var_$80 = NIL;
                while ( NIL == done_var_$79)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$80 );
                  final SubLObject valid_$81 = makeBoolean( !token_var_$80.eql( gaf ) );
                  if( NIL != valid_$81 )
                  {
                    final SubLObject ls = assertions_high.gaf_arg1( gaf );
                    if( NIL != list_utilities.member_eqP( ls, logical_schemata ) )
                    {
                      support = gaf;
                      support_ls = ls;
                      support_lf = lf;
                    }
                  }
                  done_var_$79 = makeBoolean( NIL == valid_$81 || NIL != support );
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
            done_var = makeBoolean( NIL == valid || NIL != support );
          }
        }
        csome_list_var = csome_list_var.rest();
        lf = csome_list_var.first();
      }
    }
    return Values.values( support, support_ls, support_lf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 49848L)
  public static SubLObject sksi_supported_function_expression_p(final SubLObject expression)
  {
    return fort_types_interface.sksi_supported_function_p( cycl_utilities.nat_functor( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 50175L)
  public static SubLObject sks_to_allowed_modules_list(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt( sks );
    SubLObject sub_ks_list = NIL;
    SubLObject allowed_modules_list = NIL;
    final SubLObject mt_var = mapping_mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      sub_ks_list = sksi_kb_accessors.sk_source_sub_ks_closure( sks );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = sub_ks_list;
    SubLObject sub_ks = NIL;
    sub_ks = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      allowed_modules_list = ConsesLow.cons( ConsesLow.list( $kw112$MODULE_SOURCE, sub_ks ), allowed_modules_list );
      cdolist_list_var = cdolist_list_var.rest();
      sub_ks = cdolist_list_var.first();
    }
    if( NIL != list_utilities.singletonP( allowed_modules_list ) )
    {
      allowed_modules_list = allowed_modules_list.first();
    }
    else
    {
      allowed_modules_list = ConsesLow.cons( $kw113$OR, allowed_modules_list );
    }
    allowed_modules_list = ConsesLow.listS( $kw113$OR, allowed_modules_list, $list114 );
    return allowed_modules_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 50891L)
  public static SubLObject make_sksi_support(final SubLObject asent, final SubLObject mt)
  {
    return arguments.make_hl_support( $kw115$SKSI, asent, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 51017L)
  public static SubLObject sksi_support_p(final SubLObject v_object)
  {
    return ( NIL != arguments.hl_support_p( v_object ) ) ? Equality.eq( arguments.hl_support_module( v_object ), $kw115$SKSI ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 51141L)
  public static SubLObject hl_modules_list_to_allowed_modules_spec(final SubLObject hl_modules)
  {
    return ( NIL != list_utilities.singletonP( hl_modules ) ) ? inference_modules.hl_module_name( hl_modules.first() ) : ConsesLow.cons( $kw113$OR, Mapping.mapcar( $sym116$HL_MODULE_NAME, hl_modules ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 51347L)
  public static SubLObject sksi_possibly_nart_el_formula_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != fort_types_interface.reifiable_function_p( cycl_utilities.formula_operator( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 51604L)
  public static SubLObject sksi_true_cycl_expression_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_represented_term_p( v_object ) || NIL != cycl_grammar.cycl_sentence_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 51863L)
  public static SubLObject code_mapping_expressionP(final SubLObject expression)
  {
    if( NIL != sksi_kb_accessors.schema_object_fn_expression_p( expression ) )
    {
      return sksi_kb_accessors.isa_reified_mappingP( cycl_utilities.formula_arg1( expression, UNPROVIDED ) );
    }
    if( NIL != sksi_kb_accessors.schema_object_id_fn_expression_p( expression ) )
    {
      return sksi_kb_accessors.isa_reified_mappingP( cycl_utilities.formula_arg1( expression, UNPROVIDED ) );
    }
    if( NIL != sksi_kb_accessors.source_schema_object_fn_expression_p( expression ) )
    {
      return sksi_kb_accessors.isa_reified_mappingP( cycl_utilities.formula_arg2( expression, UNPROVIDED ) );
    }
    if( NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p( expression ) )
    {
      return sksi_kb_accessors.isa_reified_mappingP( cycl_utilities.formula_arg2( expression, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 52382L)
  public static SubLObject code_mapping_expression_schema(final SubLObject expression)
  {
    if( NIL != sksi_kb_accessors.schema_object_fn_expression_p( expression ) )
    {
      return cycl_utilities.formula_arg1( expression, UNPROVIDED );
    }
    if( NIL != sksi_kb_accessors.schema_object_id_fn_expression_p( expression ) )
    {
      return cycl_utilities.formula_arg1( expression, UNPROVIDED );
    }
    if( NIL != sksi_kb_accessors.source_schema_object_fn_expression_p( expression ) )
    {
      return cycl_utilities.formula_arg2( expression, UNPROVIDED );
    }
    if( NIL != sksi_kb_accessors.source_schema_object_id_fn_expression_p( expression ) )
    {
      return cycl_utilities.formula_arg2( expression, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 52814L)
  public static SubLObject find_assertion_cycl_memoized_internal(final SubLObject sentence, SubLObject mt, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return czer_meta.find_assertion_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 52814L)
  public static SubLObject find_assertion_cycl_memoized(final SubLObject sentence, SubLObject mt, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
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
      return find_assertion_cycl_memoized_internal( sentence, mt, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym117$FIND_ASSERTION_CYCL_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym117$FIND_ASSERTION_CYCL_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym117$FIND_ASSERTION_CYCL_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, mt_info );
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
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( find_assertion_cycl_memoized_internal( sentence, mt, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53289L)
  public static SubLObject genl_predicate_memoizedP_internal(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return genl_predicates.genl_predicateP( spec, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53289L)
  public static SubLObject genl_predicate_memoizedP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
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
      return genl_predicate_memoizedP_internal( spec, genl, mt, tv, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym118$GENL_PREDICATE_MEMOIZED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym118$GENL_PREDICATE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym118$GENL_PREDICATE_MEMOIZED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( spec, genl, mt, tv, mt_info );
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
        if( spec.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( genl.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( tv.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( genl_predicate_memoizedP_internal( spec, genl, mt, tv, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spec, genl, mt, tv, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53479L)
  public static SubLObject genl_inverse_memoizedP_internal(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return genl_predicates.genl_inverseP( spec, genl, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53479L)
  public static SubLObject genl_inverse_memoizedP(final SubLObject spec, final SubLObject genl, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
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
      return genl_inverse_memoizedP_internal( spec, genl, mt, tv, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym119$GENL_INVERSE_MEMOIZED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym119$GENL_INVERSE_MEMOIZED_, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym119$GENL_INVERSE_MEMOIZED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( spec, genl, mt, tv, mt_info );
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
        if( spec.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( genl.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( tv.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( genl_inverse_memoizedP_internal( spec, genl, mt, tv, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( spec, genl, mt, tv, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53665L)
  public static SubLObject all_fort_instances_memoized_internal(final SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
    }
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return isa.all_fort_instances( coll, mt, tv );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53665L)
  public static SubLObject all_fort_instances_memoized(final SubLObject coll, SubLObject mt, SubLObject tv, SubLObject mt_info)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( tv == UNPROVIDED )
    {
      tv = NIL;
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
      return all_fort_instances_memoized_internal( coll, mt, tv, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym120$ALL_FORT_INSTANCES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym120$ALL_FORT_INSTANCES_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym120$ALL_FORT_INSTANCES_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( coll, mt, tv, mt_info );
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
        if( coll.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( tv.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( all_fort_instances_memoized_internal( coll, mt, tv, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( coll, mt, tv, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53851L)
  public static SubLObject mt_relevant_to_mt_memoizedP_internal(final SubLObject mt, final SubLObject possibly_relevant_mt, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = mt_relevance_macros.mt_info( UNPROVIDED );
    }
    return mt_relevance_macros.mt_relevant_to_mtP( mt, possibly_relevant_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 53851L)
  public static SubLObject mt_relevant_to_mt_memoizedP(final SubLObject mt, final SubLObject possibly_relevant_mt, SubLObject mt_info)
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
      return mt_relevant_to_mt_memoizedP_internal( mt, possibly_relevant_mt, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym121$MT_RELEVANT_TO_MT_MEMOIZED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( mt, possibly_relevant_mt, mt_info );
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
        if( mt.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( possibly_relevant_mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( mt_relevant_to_mt_memoizedP_internal( mt, possibly_relevant_mt, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mt, possibly_relevant_mt, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54063L)
  public static SubLObject formula_commutative_permutations_memoized_internal(final SubLObject formula, final SubLObject penetrate_argsP, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = NIL;
    }
    return cycl_utilities.formula_commutative_permutations( formula, penetrate_argsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54063L)
  public static SubLObject formula_commutative_permutations_memoized(final SubLObject formula, final SubLObject penetrate_argsP, SubLObject mt_info)
  {
    if( mt_info == UNPROVIDED )
    {
      mt_info = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return formula_commutative_permutations_memoized_internal( formula, penetrate_argsP, mt_info );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( formula, penetrate_argsP, mt_info );
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
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( penetrate_argsP.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && mt_info.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( formula_commutative_permutations_memoized_internal( formula, penetrate_argsP, mt_info ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, penetrate_argsP, mt_info ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54293L)
  public static SubLObject removal_ask_template_memoized_internal(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    return backward.removal_ask_template( template, asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54293L)
  public static SubLObject removal_ask_template_memoized(final SubLObject template, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return removal_ask_template_memoized_internal( template, asent, mt, truth, query_properties );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( template, asent, mt, truth, query_properties );
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
        if( template.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( asent.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( truth.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && query_properties.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( removal_ask_template_memoized_internal( template, asent, mt, truth, query_properties ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( template, asent, mt, truth, query_properties ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54512L)
  public static SubLObject removal_ask_memoized_internal(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    return backward.removal_ask( asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54512L)
  public static SubLObject removal_ask_memoized(final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return removal_ask_memoized_internal( asent, mt, truth, query_properties );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym124$REMOVAL_ASK_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym124$REMOVAL_ASK_MEMOIZED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym124$REMOVAL_ASK_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( asent, mt, truth, query_properties );
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
        if( asent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( truth.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && query_properties.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( removal_ask_memoized_internal( asent, mt, truth, query_properties ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( asent, mt, truth, query_properties ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54695L)
  public static SubLObject removal_ask_hl_variable_memoized_internal(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    return backward.removal_ask_hl_variable( hl_variable, asent, mt, truth, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54695L)
  public static SubLObject removal_ask_hl_variable_memoized(final SubLObject hl_variable, final SubLObject asent, SubLObject mt, SubLObject truth, SubLObject query_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = $kw5$TRUE;
    }
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return removal_ask_hl_variable_memoized_internal( hl_variable, asent, mt, truth, query_properties );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED, FIVE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_5( hl_variable, asent, mt, truth, query_properties );
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
        if( hl_variable.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( asent.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( mt.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( truth.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( NIL != cached_args && NIL == cached_args.rest() && query_properties.equal( cached_args.first() ) )
                {
                  return memoization_state.caching_results( results2 );
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( removal_ask_hl_variable_memoized_internal( hl_variable, asent, mt, truth, query_properties ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( hl_variable, asent, mt, truth, query_properties ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54927L)
  public static SubLObject isa_unit_of_measureP_internal(final SubLObject v_object)
  {
    return isa.isaP( v_object, $const127$UnitOfMeasure, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-utilities.lisp", position = 54927L)
  public static SubLObject isa_unit_of_measureP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return isa_unit_of_measureP_internal( v_object );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym126$ISA_UNIT_OF_MEASURE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym126$ISA_UNIT_OF_MEASURE_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym126$ISA_UNIT_OF_MEASURE_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( isa_unit_of_measureP_internal( v_object ) ) );
      memoization_state.caching_state_put( caching_state, v_object, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_sksi_infrastructure_utilities_file()
  {
    SubLFiles.declareFunction( me, "initialize_sksi_kb_feature", "INITIALIZE-SKSI-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_sksi_data_structures", "INITIALIZE-SKSI-DATA-STRUCTURES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_non_thelogicalfieldvaluefn_lfi_fort_cache", "INITIALIZE-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_lfi_to_non_thelogicalfieldvaluefn_lfi_fort_cache", "POSSIBLY-ADD-LFI-TO-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_remove_lfi_from_non_thelogicalfieldvaluefn_lfi_fort_cache", "POSSIBLY-REMOVE-LFI-FROM-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "non_thelogicalfieldvaluefn_lfi_fort_p", "NON-THELOGICALFIELDVALUEFN-LFI-FORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_expression", "SKSI-RECONSTRUCT-EXPRESSION", 2, 1, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_expression_memoized_internal", "SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_expression_memoized", "SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_reconstruct_expression_int", "SKSI-RECONSTRUCT-EXPRESSION-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_sksi_content_mts", "ALL-RELEVANT-SKSI-CONTENT-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_sksi_content_mts_int_internal", "ALL-RELEVANT-SKSI-CONTENT-MTS-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_sksi_content_mts_int", "ALL-RELEVANT-SKSI-CONTENT-MTS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_with_registered_module_relevantP", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_with_registered_module_relevantP_int_internal", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_with_registered_module_relevantP_int", "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_relevantP", "ANY-SKSI-CONTENT-MT-RELEVANT?", 0, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_relevantP_int_internal", "ANY-SKSI-CONTENT-MT-RELEVANT?-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "any_sksi_content_mt_relevantP_int", "ANY-SKSI-CONTENT-MT-RELEVANT?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "relevant_top_level_sksi_content_mts", "RELEVANT-TOP-LEVEL-SKSI-CONTENT-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "sk_source_atomicP", "SK-SOURCE-ATOMIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_complexP", "SK-SOURCE-COMPLEX?", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_all_complete_knowledge_sources", "GATHER-ALL-COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_all_top_level_complete_knowledge_sources", "GATHER-ALL-TOP-LEVEL-COMPLETE-KNOWLEDGE-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_all_top_level_complete_registered_knowledge_sources", "GATHER-ALL-TOP-LEVEL-COMPLETE-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "gather_all_top_level_registered_knowledge_sources", "GATHER-ALL-TOP-LEVEL-REGISTERED-KNOWLEDGE-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "sort_knowledge_sources", "SORT-KNOWLEDGE-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_sksi_knowledge_sources_and_descriptions", "GATHER-SKSI-KNOWLEDGE-SOURCES-AND-DESCRIPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_sks_description_string", "GET-SKS-DESCRIPTION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "top_level_knowledge_source_p", "TOP-LEVEL-KNOWLEDGE-SOURCE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "top_level_knowledge_source_in_any_mt_p", "TOP-LEVEL-KNOWLEDGE-SOURCE-IN-ANY-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_sk_sources", "ALL-RELEVANT-SK-SOURCES", 0, 0, false );
    SubLFiles.declareFunction( me, "all_relevant_dbs", "ALL-RELEVANT-DBS", 0, 0, false );
    SubLFiles.declareFunction( me, "relevant_registered_top_level_sksi_dbs", "RELEVANT-REGISTERED-TOP-LEVEL-SKSI-DBS", 0, 0, false );
    SubLFiles.declareFunction( me, "relevant_maximum_sksi_dbs", "RELEVANT-MAXIMUM-SKSI-DBS", 0, 0, false );
    SubLFiles.declareFunction( me, "external_term_denoting_function_expression_p", "EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_term_p", "SKSI-EXTERNAL-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_term_p", "SKSI-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_predicate_type_p", "SKSI-SUPPORTED-PREDICATE-TYPE-P", 1, 1, false );
    SubLFiles.declareFunction( me, "physical_fields_for_indexicals_in_expression", "PHYSICAL-FIELDS-FOR-INDEXICALS-IN-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "indexicals_for_physical_fields_in_expression", "INDEXICALS-FOR-PHYSICAL-FIELDS-IN-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_physical_fields_via_indexicals", "EXTRACT-PHYSICAL-FIELDS-VIA-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "sort_physical_fields_by_field_name_list", "SORT-PHYSICAL-FIELDS-BY-FIELD-NAME-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_physical_field_indexicals", "SKSI-DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_physical_field_indexicals_for_logical_field_indexical", "SKSI-DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS-FOR-LOGICAL-FIELD-INDEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical_internal", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL-INTERNAL", 3, 0,
        false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_logical_field_indexicals_for_physical_field_indexical", "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL", 3, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_el_formula_p", "PHYSICAL-FIELD-INDEXICAL-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "reified_mapping_el_formula_p", "REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_indexical_or_reified_mapping_el_formula_p", "PHYSICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_field_logical_field_indexical_mappings_given_logical_physical_schemata_internal", "PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL",
        2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_logical_field_indexical_mappings_given_logical_physical_schemata", "PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_relevant_physical_fields_for_field_decoding", "DETERMINE-RELEVANT-PHYSICAL-FIELDS-FOR-FIELD-DECODING", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_relevant_physical_field_indexicals_for_field_decoding", "DETERMINE-RELEVANT-PHYSICAL-FIELD-INDEXICALS-FOR-FIELD-DECODING", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_fixed_physical_field_indexicals_internal", "SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_fixed_physical_field_indexicals", "SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_fixed_physical_field_indexicalP_internal", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_fixed_physical_field_indexicalP", "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_denoting_functions_internal", "LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_denoting_functions", "LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "logical_field_indexical_el_formula_p", "LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P", 1, 0, false );
    new $logical_field_indexical_el_formula_p$UnaryFunction();
    SubLFiles.declareFunction( me, "logical_field_indexical_or_reified_mapping_el_formula_p", "LOGICAL-FIELD-INDEXICAL-OR-REIFIED-MAPPING-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "logical_physical_field_mappings_given_logical_physical_schemata_internal", "LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "logical_physical_field_mappings_given_logical_physical_schemata", "LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 2, 0, false );
    SubLFiles.declareFunction( me, "physical_field_mappings_for_logical_fields", "PHYSICAL-FIELD-MAPPINGS-FOR-LOGICAL-FIELDS", 3, 1, false );
    SubLFiles.declareFunction( me, "physical_field_mappings_for_logical_fields_given_logical_physical_schemata", "PHYSICAL-FIELD-MAPPINGS-FOR-LOGICAL-FIELDS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA", 3, 0, false );
    SubLFiles.declareFunction( me, "expression_logical_fields", "EXPRESSION-LOGICAL-FIELDS", 1, 0, false );
    SubLFiles.declareFunction( me, "expression_logical_field_indexicals", "EXPRESSION-LOGICAL-FIELD-INDEXICALS", 1, 2, false );
    SubLFiles.declareFunction( me, "expression_logical_field_indexicals_memoized_internal", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "expression_logical_field_indexicals_memoized", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED", 2, 0, false );
    SubLFiles.declareFunction( me, "expression_logical_field_indexicals_int", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "expression_logical_field_indexicals_ordered", "EXPRESSION-LOGICAL-FIELD-INDEXICALS-ORDERED", 1, 1, false );
    SubLFiles.declareFunction( me, "expression_logical_fields_for_indexicals", "EXPRESSION-LOGICAL-FIELDS-FOR-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_get_code_mapping_relations_for_logical_field_predicate_internal", "SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE-INTERNAL", 3, 1, false );
    SubLFiles.declareFunction( me, "sksi_get_code_mapping_relations_for_logical_field_predicate", "SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE", 3, 1, false );
    SubLFiles.declareFunction( me, "sk_source_accessibleP", "SK-SOURCE-ACCESSIBLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "db_sk_source_accessibleP", "DB-SK-SOURCE-ACCESSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "web_page_sk_source_accessibleP", "WEB-PAGE-SK-SOURCE-ACCESSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "fht_sk_source_accessibleP", "FHT-SK-SOURCE-ACCESSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "corba_sk_source_accessibleP", "CORBA-SK-SOURCE-ACCESSIBLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_registeredP", "SK-SOURCE-REGISTERED?", 1, 1, false );
    SubLFiles.declareFunction( me, "sk_source_registeredP_int", "SK-SOURCE-REGISTERED?-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "sk_source_queryableP", "SK-SOURCE-QUERYABLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "set_external_sources_activated_in_image", "SET-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "external_sources_activated_in_image", "EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "list_of_external_sources_activated_in_image", "LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "some_external_source_activated_in_imageP", "SOME-EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?", 0, 0, false );
    SubLFiles.declareFunction( me, "number_of_external_sources_activated_in_image", "NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "external_source_activated_in_imageP", "EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_external_sources_activated_in_image", "CLEAR-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "add_to_external_sources_activated_in_image", "ADD-TO-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "remove_from_external_sources_activated_in_image", "REMOVE-FROM-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "disjoint_schemasP", "DISJOINT-SCHEMAS?", 2, 1, false );
    SubLFiles.declareFunction( me, "disjoint_schemas_memoize", "DISJOINT-SCHEMAS-MEMOIZE", 2, 0, false );
    SubLFiles.declareFunction( me, "disjoint_schemas_memoized_int_internal", "DISJOINT-SCHEMAS-MEMOIZED-INT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "disjoint_schemas_memoized_int", "DISJOINT-SCHEMAS-MEMOIZED-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "disjoint_schemas_regular", "DISJOINT-SCHEMAS-REGULAR", 2, 0, false );
    SubLFiles.declareFunction( me, "all_disjoint_schemas", "ALL-DISJOINT-SCHEMAS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_disjoint_schemas_int_internal", "ALL-DISJOINT-SCHEMAS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "all_disjoint_schemas_int", "ALL-DISJOINT-SCHEMAS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "all_joinable_object_defining_schemas", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS", 1, 1, false );
    SubLFiles.declareFunction( me, "all_joinable_object_defining_schemas_int_internal", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "all_joinable_object_defining_schemas_int", "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_object_defining_schemas", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_object_defining_schemas_memoized_internal", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_determine_relevant_object_defining_schemas_memoized", "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED", 4, 0, false );
    SubLFiles.declareFunction( me, "schema_object_naut_p", "SCHEMA-OBJECT-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "schema_object_id_naut_p", "SCHEMA-OBJECT-ID-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_possibly_definedP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_possibly_defined", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-POSSIBLY-DEFINED", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_undefinedP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED?", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_undefined", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expression_undefined_int", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-UNDEFINED-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expressions_equalP", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expressions_equal", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL", 2, 1, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expressions_equal_sub_ks", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL-SUB-KS", 6, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_expressions_equal_common_super_ks", "SOURCE-SCHEMA-OBJECT-FN-EXPRESSIONS-EQUAL-COMMON-SUPER-KS", 6, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_equal_sk_sources", "SOURCE-SCHEMA-OBJECT-FN-EQUAL-SK-SOURCES", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_equal_expressions", "SOURCE-SCHEMA-OBJECT-FN-EQUAL-EXPRESSIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_canonical_sks", "SOURCE-SCHEMA-OBJECT-FN-CANONICAL-SKS", 1, 0, false );
    SubLFiles.declareFunction( me, "source_schema_object_fn_canonical_expression", "SOURCE-SCHEMA-OBJECT-FN-CANONICAL-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_relevant_to_ods", "SKS-RELEVANT-TO-ODS", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_relevant_to_some_logical_fieldP", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD?", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_relevant_to_some_logical_field", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_relevant_to_some_logical_field_int", "SKS-RELEVANT-TO-SOME-LOGICAL-FIELD-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "sks_directly_relevant_to_some_logical_field", "SKS-DIRECTLY-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "some_logical_schema_relevant_to_some_logical_field", "SOME-LOGICAL-SCHEMA-RELEVANT-TO-SOME-LOGICAL-FIELD", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_function_expression_p", "SKSI-SUPPORTED-FUNCTION-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sks_to_allowed_modules_list", "SKS-TO-ALLOWED-MODULES-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sksi_support", "MAKE-SKSI-SUPPORT", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_support_p", "SKSI-SUPPORT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_modules_list_to_allowed_modules_spec", "HL-MODULES-LIST-TO-ALLOWED-MODULES-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_possibly_nart_el_formula_p", "SKSI-POSSIBLY-NART-EL-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_true_cycl_expression_p", "SKSI-TRUE-CYCL-EXPRESSION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "code_mapping_expressionP", "CODE-MAPPING-EXPRESSION?", 1, 0, false );
    SubLFiles.declareFunction( me, "code_mapping_expression_schema", "CODE-MAPPING-EXPRESSION-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "find_assertion_cycl_memoized_internal", "FIND-ASSERTION-CYCL-MEMOIZED-INTERNAL", 1, 2, false );
    SubLFiles.declareFunction( me, "find_assertion_cycl_memoized", "FIND-ASSERTION-CYCL-MEMOIZED", 1, 2, false );
    SubLFiles.declareFunction( me, "genl_predicate_memoizedP_internal", "GENL-PREDICATE-MEMOIZED?-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "genl_predicate_memoizedP", "GENL-PREDICATE-MEMOIZED?", 2, 3, false );
    SubLFiles.declareFunction( me, "genl_inverse_memoizedP_internal", "GENL-INVERSE-MEMOIZED?-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "genl_inverse_memoizedP", "GENL-INVERSE-MEMOIZED?", 2, 3, false );
    SubLFiles.declareFunction( me, "all_fort_instances_memoized_internal", "ALL-FORT-INSTANCES-MEMOIZED-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "all_fort_instances_memoized", "ALL-FORT-INSTANCES-MEMOIZED", 1, 3, false );
    SubLFiles.declareFunction( me, "mt_relevant_to_mt_memoizedP_internal", "MT-RELEVANT-TO-MT-MEMOIZED?-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "mt_relevant_to_mt_memoizedP", "MT-RELEVANT-TO-MT-MEMOIZED?", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_commutative_permutations_memoized_internal", "FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_commutative_permutations_memoized", "FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_ask_template_memoized_internal", "REMOVAL-ASK-TEMPLATE-MEMOIZED-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_template_memoized", "REMOVAL-ASK-TEMPLATE-MEMOIZED", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_memoized_internal", "REMOVAL-ASK-MEMOIZED-INTERNAL", 1, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_memoized", "REMOVAL-ASK-MEMOIZED", 1, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_hl_variable_memoized_internal", "REMOVAL-ASK-HL-VARIABLE-MEMOIZED-INTERNAL", 2, 3, false );
    SubLFiles.declareFunction( me, "removal_ask_hl_variable_memoized", "REMOVAL-ASK-HL-VARIABLE-MEMOIZED", 2, 3, false );
    SubLFiles.declareFunction( me, "isa_unit_of_measureP_internal", "ISA-UNIT-OF-MEASURE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "isa_unit_of_measureP", "ISA-UNIT-OF-MEASURE?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_infrastructure_utilities_file()
  {
    $sksi_core_constants$ = SubLFiles.deflexical( "*SKSI-CORE-CONSTANTS*", $list0 );
    $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$ = SubLFiles.deflexical( "*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*", maybeDefault( $sym2$_SKSI_NON_THELOGICALFIELDVALUEFN_LFI_FORT_CACHE_,
        $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    $sort_knowledge_sources_by_dateP$ = SubLFiles.defparameter( "*SORT-KNOWLEDGE-SOURCES-BY-DATE?*", NIL );
    $external_sources_activated_in_image$ = SubLFiles.deflexical( "*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*", maybeDefault( $sym73$_EXTERNAL_SOURCES_ACTIVATED_IN_IMAGE_, $external_sources_activated_in_image$, () -> ( set
        .new_set( Symbols.symbol_function( EQ ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_sksi_infrastructure_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_SKSI_NON_THELOGICALFIELDVALUEFN_LFI_FORT_CACHE_ );
    memoization_state.note_memoized_function( $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED );
    memoization_state.note_memoized_function( $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT );
    memoization_state.note_memoized_function( $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT );
    memoization_state.note_memoized_function( $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT );
    memoization_state.note_memoized_function( $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE );
    memoization_state.note_memoized_function( $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY );
    memoization_state.note_memoized_function( $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS );
    memoization_state.note_memoized_function( $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_ );
    memoization_state.note_memoized_function( $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS );
    memoization_state.note_memoized_function( $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA );
    memoization_state.note_memoized_function( $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED );
    memoization_state.note_memoized_function( $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE );
    subl_macro_promotions.declare_defglobal( $sym73$_EXTERNAL_SOURCES_ACTIVATED_IN_IMAGE_ );
    memoization_state.note_memoized_function( $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT );
    memoization_state.note_memoized_function( $sym75$ALL_DISJOINT_SCHEMAS_INT );
    memoization_state.note_memoized_function( $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT );
    memoization_state.note_memoized_function( $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED );
    memoization_state.note_memoized_function( $sym117$FIND_ASSERTION_CYCL_MEMOIZED );
    memoization_state.note_memoized_function( $sym118$GENL_PREDICATE_MEMOIZED_ );
    memoization_state.note_memoized_function( $sym119$GENL_INVERSE_MEMOIZED_ );
    memoization_state.note_memoized_function( $sym120$ALL_FORT_INSTANCES_MEMOIZED );
    memoization_state.note_memoized_function( $sym121$MT_RELEVANT_TO_MT_MEMOIZED_ );
    memoization_state.note_memoized_function( $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED );
    memoization_state.note_memoized_function( $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED );
    memoization_state.note_memoized_function( $sym124$REMOVAL_ASK_MEMOIZED );
    memoization_state.note_memoized_function( $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED );
    memoization_state.note_memoized_function( $sym126$ISA_UNIT_OF_MEASURE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_infrastructure_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_infrastructure_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_infrastructure_utilities_file();
  }
  static
  {
    me = new sksi_infrastructure_utilities();
    $sksi_core_constants$ = null;
    $sksi_non_thelogicalfieldvaluefn_lfi_fort_cache$ = null;
    $sort_knowledge_sources_by_dateP$ = null;
    $external_sources_activated_in_image$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "ContentMtFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ContentMtHeadFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "ContentMtSpindleFn" ) ), constant_handles.reader_make_constant_shell( makeString( "MappingMtFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "PhysicalFieldFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) ), constant_handles.reader_make_constant_shell( makeString( "PFIAliasFn" ) ), constant_handles
                .reader_make_constant_shell( makeString( "PFAliasFn" ) ), constant_handles.reader_make_constant_shell( makeString( "LogicalFieldFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                    "TheLogicalFieldValueFn" ) ), constant_handles.reader_make_constant_shell( makeString( "LFIAliasFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) ), constant_handles.reader_make_constant_shell(
                            makeString( "SourceSchemaObjectIDFn" ) ), constant_handles.reader_make_constant_shell( makeString( "SchemaIndexFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "TheNextSequenceValueFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntegerSequenceGeneratorFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                    "TheCurrentSequenceValueFn" ) ), constant_handles.reader_make_constant_shell( makeString( "mappingMt" ) ), constant_handles.reader_make_constant_shell( makeString(
                                        "sksSourceDescriptionMt" ) ), constant_handles.reader_make_constant_shell( makeString( "sksPhysicalSchemaDescriptionMt" ) ), constant_handles.reader_make_constant_shell(
                                            makeString( "sksLogicalSchemaDescriptionMt" ) ), constant_handles.reader_make_constant_shell( makeString( "sksSchemaTranslationMt" ) ), constant_handles
                                                .reader_make_constant_shell( makeString( "contentMt" ) ), constant_handles.reader_make_constant_shell( makeString( "contentMtSpindle" ) ), constant_handles
                                                    .reader_make_constant_shell( makeString( "contentMtHead" ) ), constant_handles.reader_make_constant_shell( makeString( "subKS" ) ), constant_handles
                                                        .reader_make_constant_shell( makeString( "subKS-Direct" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaSourceMap" ) ), constant_handles
                                                            .reader_make_constant_shell( makeString( "physicalSchemaSourceMap" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalSchemaSourceMap" ) ),
      constant_handles.reader_make_constant_shell( makeString( "sksIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "structuredKnowledgeSourceName" ) ), constant_handles.reader_make_constant_shell(
          makeString( "serverOfSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "portNumberForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sksProxyHost" ) ), constant_handles
              .reader_make_constant_shell( makeString( "sksProxyPort" ) ), constant_handles.reader_make_constant_shell( makeString( "userNameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "passwordForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sqlProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "subProtocolForSKS" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "filenameForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "serializationTypeForSKS" ) ), constant_handles.reader_make_constant_shell(
                          makeString( "keyTestFunctionForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "valueTestFunctionForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "physicalFields" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldIndexicals" ) ), constant_handles.reader_make_constant_shell( makeString( "enumerableSchema" ) ),
      constant_handles.reader_make_constant_shell( makeString( "schemaFieldNameList" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaFieldList" ) ), constant_handles.reader_make_constant_shell(
          makeString( "exampleTuple" ) ), constant_handles.reader_make_constant_shell( makeString( "indexicalForPhysicalField" ) ), constant_handles.reader_make_constant_shell( makeString( "requiredFields" ) ),
      constant_handles.reader_make_constant_shell( makeString( "indexedFields" ) ), constant_handles.reader_make_constant_shell( makeString( "primaryKey" ) ), constant_handles.reader_make_constant_shell( makeString(
          "schemaKeys" ) ), constant_handles.reader_make_constant_shell( makeString( "secondaryKeys" ) ), constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap" ) ), constant_handles
              .reader_make_constant_shell( makeString( "foreignKeyMap-Restrict" ) ), constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-Cascade" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "foreignKeyMap-SetNull" ) ), constant_handles.reader_make_constant_shell( makeString( "foreignKeyMap-SetDefault" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "nonNullFields" ) ), constant_handles.reader_make_constant_shell( makeString( "uniqueFieldList" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaConstraints" ) ),
      constant_handles.reader_make_constant_shell( makeString( "defaultFieldValue" ) ), constant_handles.reader_make_constant_shell( makeString( "nonNullFieldList" ) ), constant_handles.reader_make_constant_shell(
          makeString( "resultSetCardinality" ) ), constant_handles.reader_make_constant_shell( makeString( "resultSetCardinalityWithConstraints" ) ), constant_handles.reader_make_constant_shell( makeString(
              "logicalResultSetCardinality" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalResultSetCardinalityWRTValue" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "physicalFieldConversionFunction" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaFieldsIndex" ) ), constant_handles.reader_make_constant_shell( makeString( "indexType" ) ),
      constant_handles.reader_make_constant_shell( makeString( "indexName" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldXPath" ) ), constant_handles.reader_make_constant_shell( makeString(
          "physicalFieldXPathString" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldValue" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldValueComparison" ) ), constant_handles
              .reader_make_constant_shell( makeString( "fieldValueComparison-Inverse" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldIndexicalsEqual" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "fieldIndexicalsComparison" ) ), constant_handles.reader_make_constant_shell( makeString( "integerSequenceGeneratorName" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "integerSequenceGeneratorIncrementsField" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "meaningSentenceOfSchema" ) ), constant_handles.reader_make_constant_shell( makeString( "conditionalMeaningSentenceOfSchema" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "objectField" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldGenls" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "schemaIsa" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaGenls" ) ), constant_handles.reader_make_constant_shell(
                                      makeString( "logicalSchemaKeys" ) ), constant_handles.reader_make_constant_shell( makeString( "indexicalForLogicalField" ) ), constant_handles.reader_make_constant_shell( makeString(
                                          "logicalFieldIndexicals" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalSchemaFieldTypeList" ) ), constant_handles.reader_make_constant_shell( makeString(
                                              "schemaExampleSentence" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaCompleteExtentKnown" ) ), constant_handles.reader_make_constant_shell(
                                                  makeString( "completeObjectSchema" ) ), constant_handles.reader_make_constant_shell( makeString( "contentSentenceOfSchema" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "codeMapping" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaFields" ) ), constant_handles
                                                          .reader_make_constant_shell( makeString( "indexicalForField" ) ), constant_handles.reader_make_constant_shell( makeString( "schemaFieldIndexicals" ) ),
      constant_handles.reader_make_constant_shell( makeString( "schemaObjectID" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldName-SKS" ) ), constant_handles.reader_make_constant_shell( makeString(
          "fieldTranslation" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFieldTranslation" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldTranslation" ) ),
      constant_handles.reader_make_constant_shell( makeString( "logicalFieldDecoding" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalFieldEncoding" ) ), constant_handles.reader_make_constant_shell(
          makeString( "physicalFieldDecoding" ) ), constant_handles.reader_make_constant_shell( makeString( "physicalFieldEncoding" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldDecoding" ) ),
      constant_handles.reader_make_constant_shell( makeString( "fieldEncoding" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalSchemaMap" ) ), constant_handles.reader_make_constant_shell(
          makeString( "calendarMonthIndex" ) ), constant_handles.reader_make_constant_shell( makeString( "logicalPhysicalFieldMap-DecodeClosed" ) ), constant_handles.reader_make_constant_shell( makeString(
              "logicalPhysicalFieldMap-EncodeClosed" ) ), constant_handles.reader_make_constant_shell( makeString( "fieldEncodingOverrideForComparisonOperatorArg" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "logicalPhysicalFieldMap" ) ), constant_handles.reader_make_constant_shell( makeString( "httpdRequestSubLParsingProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "httpdRequestURLForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "httpdRequestMethodForSKS" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "httpdRequestSubLBooleanParsingProgramForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "httpdRequestUnboundOnlySubLParsingProgramForSKS" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "httpdRequestQueryTemplateForSKS" ) ), constant_handles.reader_make_constant_shell( makeString( "rowInSourceClaims" ) ), constant_handles
                                  .reader_make_constant_shell( makeString( "sourceClaims" ) ), constant_handles.reader_make_constant_shell( makeString( "meaningSentencePredicateForSource" ) ), constant_handles
                                      .reader_make_constant_shell( makeString( "meaningSentencePredicateForSchema" ) ), constant_handles.reader_make_constant_shell( makeString( "sksRepresentationComplete" ) ),
      constant_handles.reader_make_constant_shell( makeString( "rowCount-SKS" ) ), constant_handles.reader_make_constant_shell( makeString( "sourceAssumptions" ) ), constant_handles.reader_make_constant_shell(
          makeString( "sksModifiable" ) ), constant_handles.reader_make_constant_shell( makeString( "objectFieldTypeForSource" ) ), constant_handles.reader_make_constant_shell( makeString(
              "logicalFieldTypeForSource" ) ), constant_handles.reader_make_constant_shell( makeString( "sourceSchemaObjectID" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "schemaRepresentationComplete" ) ), constant_handles.reader_make_constant_shell( makeString( "sksModuleTypeDirection" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "SKSIPhysicalSchemaConstraintPredicate" ) ), constant_handles.reader_make_constant_shell( makeString( "PhysicalFieldIndexical" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "SKSIPhysicalSchemaDescriptionMicrotheory" ) ), constant_handles.reader_make_constant_shell( makeString( "PhysicalField" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "IndexDataStructure" ) ), constant_handles.reader_make_constant_shell( makeString( "IndexDataStructureType" ) ), constant_handles.reader_make_constant_shell( makeString(
                                  "IntegerSequenceGenerator" ) ), constant_handles.reader_make_constant_shell( makeString( "LogicalSchema" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "LogicalFieldIndexical" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSILogicalSchemaDescriptionMicrotheory" ) ), constant_handles.reader_make_constant_shell(
                                          makeString( "LogicalField" ) ), constant_handles.reader_make_constant_shell( makeString( "ObjectDefiningSchema" ) ), constant_handles.reader_make_constant_shell( makeString(
                                              "ReifiedMapping" ) ), constant_handles.reader_make_constant_shell( makeString( "Schema-LogicalOrPhysical" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                  "SchemaType-LogicalOrPhysical" ) ), constant_handles.reader_make_constant_shell( makeString( "FieldIndexical-LogicalOrPhysical" ) ), constant_handles
                                                      .reader_make_constant_shell( makeString( "SKSISchemaDescriptionMicrotheory" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                          "Field-LogicalOrPhysical" ) ), constant_handles.reader_make_constant_shell( makeString( "FieldType-LogicalOrPhysical" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "SKSISchemaTranslationMicrotheory" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                  "HTTP-RequestMethod" ) ), constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource" ) ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Atomic" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                          "StructuredKnowledgeSource-Complex" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIContentMicrotheorySpindle" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKSISupportedStructuredKnowledgeSourceType" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSISourceDescriptionMicrotheory" ) ),
      constant_handles.reader_make_constant_shell( makeString( "SKSIMappingMicrotheory" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSISupportedDatabaseServerProgram" ) ), constant_handles
          .reader_make_constant_shell( makeString( "SKSMereologyType" ) ), constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-TopLevel" ) ), constant_handles.reader_make_constant_shell(
              makeString( "SKSIContentMicrotheory" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIExternalTermDenotingFunction" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "SKSIHLModule" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIHLModuleType" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIRemovalModule" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "SKSISingleLiteralRemovalModule" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSIMultiLiteralRemovalModule" ) ), constant_handles
                          .reader_make_constant_shell( makeString( "SKSIStorageModule" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSISupportedComparisonPredicate" ) ), constant_handles
                              .reader_make_constant_shell( makeString( "SKSISupportedOperator" ) ), constant_handles.reader_make_constant_shell( makeString( "SKSISupportedFunction" ) )
    } );
    $sym1$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym2$_SKSI_NON_THELOGICALFIELDVALUEFN_LFI_FORT_CACHE_ = makeSymbol( "*SKSI-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE*" );
    $const3$LogicalFieldIndexical = constant_handles.reader_make_constant_shell( makeString( "LogicalFieldIndexical" ) );
    $const4$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw5$TRUE = makeKeyword( "TRUE" );
    $const6$TheLogicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "TheLogicalFieldValueFn" ) );
    $sym7$SKSI_RECONSTRUCT_EXPRESSION_MEMOIZED = makeSymbol( "SKSI-RECONSTRUCT-EXPRESSION-MEMOIZED" );
    $sym8$NART_P = makeSymbol( "NART-P" );
    $sym9$HL_TO_EL = makeSymbol( "HL-TO-EL" );
    $sym10$ALL_RELEVANT_SKSI_CONTENT_MTS_INT = makeSymbol( "ALL-RELEVANT-SKSI-CONTENT-MTS-INT" );
    $sym11$RELEVANT_MT_ = makeSymbol( "RELEVANT-MT?" );
    $sym12$ANY_SKSI_CONTENT_MT_WITH_REGISTERED_MODULE_RELEVANT__INT = makeSymbol( "ANY-SKSI-CONTENT-MT-WITH-REGISTERED-MODULE-RELEVANT?-INT" );
    $sym13$ANY_SKSI_CONTENT_MT_RELEVANT__INT = makeSymbol( "ANY-SKSI-CONTENT-MT-RELEVANT?-INT" );
    $sym14$CONTENT_MT_SPINDLE_MEMBER_P = makeSymbol( "CONTENT-MT-SPINDLE-MEMBER-P" );
    $const15$StructuredKnowledgeSource_Atomic = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Atomic" ) );
    $const16$StructuredKnowledgeSource_Complex = constant_handles.reader_make_constant_shell( makeString( "StructuredKnowledgeSource-Complex" ) );
    $sym17$TOP_LEVEL_KNOWLEDGE_SOURCE_IN_ANY_MT_P = makeSymbol( "TOP-LEVEL-KNOWLEDGE-SOURCE-IN-ANY-MT-P" );
    $sym18$SKS_REGISTERED_P = makeSymbol( "SKS-REGISTERED-P" );
    $sym19$_ = makeSymbol( ">" );
    $sym20$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE = makeSymbol( "CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE" );
    $const21$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $str22$An_external_knowledge_source_with = makeString( "An external knowledge source without any description." );
    $sym23$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const24$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const25$Database_Physical = constant_handles.reader_make_constant_shell( makeString( "Database-Physical" ) );
    $sym26$SK_SOURCE_SUB_KS_IN_ANY_MT_ = makeSymbol( "SK-SOURCE-SUB-KS-IN-ANY-MT?" );
    $sym27$PHYSICAL_FIELD_INDEXICAL_P = makeSymbol( "PHYSICAL-FIELD-INDEXICAL-P" );
    $sym28$PHYSICAL_FIELD_P = makeSymbol( "PHYSICAL-FIELD-P" );
    $sym29$PHYSICAL_FIELD_NAME = makeSymbol( "PHYSICAL-FIELD-NAME" );
    $sym30$SKSI_DETERMINE_RELEVANT_LOGICAL_FIELD_INDEXICALS_FOR_PHYSICAL_FIE = makeSymbol( "SKSI-DETERMINE-RELEVANT-LOGICAL-FIELD-INDEXICALS-FOR-PHYSICAL-FIELD-INDEXICAL" );
    $const31$ThePhysicalFieldValueFn = constant_handles.reader_make_constant_shell( makeString( "ThePhysicalFieldValueFn" ) );
    $const32$ReifiedMappingForPredFn = constant_handles.reader_make_constant_shell( makeString( "ReifiedMappingForPredFn" ) );
    $sym33$PHYSICAL_FIELD_LOGICAL_FIELD_INDEXICAL_MAPPINGS_GIVEN_LOGICAL_PHY = makeSymbol( "PHYSICAL-FIELD-LOGICAL-FIELD-INDEXICAL-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA" );
    $sym34$SKSI_DETERMINE_FIXED_PHYSICAL_FIELD_INDEXICALS = makeSymbol( "SKSI-DETERMINE-FIXED-PHYSICAL-FIELD-INDEXICALS" );
    $sym35$SKSI_FIXED_PHYSICAL_FIELD_INDEXICAL_ = makeSymbol( "SKSI-FIXED-PHYSICAL-FIELD-INDEXICAL?" );
    $sym36$LOGICAL_FIELD_INDEXICAL_DENOTING_FUNCTIONS = makeSymbol( "LOGICAL-FIELD-INDEXICAL-DENOTING-FUNCTIONS" );
    $sym37$_FN = makeSymbol( "?FN" );
    $list38 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "resultQuotedIsa" ) ), makeSymbol( "?FN" ), constant_handles.reader_make_constant_shell( makeString( "LogicalFieldIndexical" ) ) );
    $const39$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym40$LOGICAL_PHYSICAL_FIELD_MAPPINGS_GIVEN_LOGICAL_PHYSICAL_SCHEMATA = makeSymbol( "LOGICAL-PHYSICAL-FIELD-MAPPINGS-GIVEN-LOGICAL-PHYSICAL-SCHEMATA" );
    $sym41$LOGICAL_FIELD_P = makeSymbol( "LOGICAL-FIELD-P" );
    $sym42$EXPRESSION_LOGICAL_FIELD_INDEXICALS_MEMOIZED = makeSymbol( "EXPRESSION-LOGICAL-FIELD-INDEXICALS-MEMOIZED" );
    $sym43$LOGICAL_FIELD_INDEXICAL_P = makeSymbol( "LOGICAL-FIELD-INDEXICAL-P" );
    $sym44$LOGICAL_FIELD_FOR_INDEXICAL = makeSymbol( "LOGICAL-FIELD-FOR-INDEXICAL" );
    $sym45$SKSI_GET_CODE_MAPPING_RELATIONS_FOR_LOGICAL_FIELD_PREDICATE = makeSymbol( "SKSI-GET-CODE-MAPPING-RELATIONS-FOR-LOGICAL-FIELD-PREDICATE" );
    $sym46$PREDICATE_ = makeSymbol( "PREDICATE?" );
    $const47$WebPage_AIS = constant_handles.reader_make_constant_shell( makeString( "WebPage-AIS" ) );
    $const48$FileHashTable_File = constant_handles.reader_make_constant_shell( makeString( "FileHashTable-File" ) );
    $const49$CommonObjectRequestBrokerArchitec = constant_handles.reader_make_constant_shell( makeString( "CommonObjectRequestBrokerArchitecture" ) );
    $kw50$CACHE = makeKeyword( "CACHE" );
    $str51$continue = makeString( "continue" );
    $str52$Unknown_access_path_type__A_for__ = makeString( "Unknown access path type ~A for ~A." );
    $sym53$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str54$The_following_error_occurred_whil = makeString( "The following error occurred while trying to open/close the knowledge source ~A: ~%~A" );
    $str55$ = makeString( "" );
    $kw56$DEFAULT = makeKeyword( "DEFAULT" );
    $int57$80 = makeInteger( 80 );
    $kw58$PRIVATE = makeKeyword( "PRIVATE" );
    $kw59$MACHINE = makeKeyword( "MACHINE" );
    $kw60$PORT = makeKeyword( "PORT" );
    $kw61$METHOD = makeKeyword( "METHOD" );
    $kw62$GET = makeKeyword( "GET" );
    $kw63$URL = makeKeyword( "URL" );
    $kw64$QUERY = makeKeyword( "QUERY" );
    $kw65$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw66$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw67$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw68$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw69$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $str70$The_following_problem_was_encount = makeString( "The following problem was encountered while trying to access the knowledge source ~A :~%~A" );
    $str71$_A = makeString( "~A" );
    $kw72$PUBLIC = makeKeyword( "PUBLIC" );
    $sym73$_EXTERNAL_SOURCES_ACTIVATED_IN_IMAGE_ = makeSymbol( "*EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE*" );
    $sym74$DISJOINT_SCHEMAS_MEMOIZED_INT = makeSymbol( "DISJOINT-SCHEMAS-MEMOIZED-INT" );
    $sym75$ALL_DISJOINT_SCHEMAS_INT = makeSymbol( "ALL-DISJOINT-SCHEMAS-INT" );
    $const76$ObjectDefiningSchema = constant_handles.reader_make_constant_shell( makeString( "ObjectDefiningSchema" ) );
    $const77$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw78$BREADTH = makeKeyword( "BREADTH" );
    $kw79$QUEUE = makeKeyword( "QUEUE" );
    $kw80$STACK = makeKeyword( "STACK" );
    $sym81$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw82$ERROR = makeKeyword( "ERROR" );
    $str83$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym84$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw85$CERROR = makeKeyword( "CERROR" );
    $str86$continue_anyway = makeString( "continue anyway" );
    $kw87$WARN = makeKeyword( "WARN" );
    $str88$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str89$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str90$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list91 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str92$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym93$ALL_JOINABLE_OBJECT_DEFINING_SCHEMAS_INT = makeSymbol( "ALL-JOINABLE-OBJECT-DEFINING-SCHEMAS-INT" );
    $sym94$SKSI_DETERMINE_RELEVANT_OBJECT_DEFINING_SCHEMAS_MEMOIZED = makeSymbol( "SKSI-DETERMINE-RELEVANT-OBJECT-DEFINING-SCHEMAS-MEMOIZED" );
    $sym95$SCHEMA_OBJECT_ID_FN_EXPRESSION_P = makeSymbol( "SCHEMA-OBJECT-ID-FN-EXPRESSION-P" );
    $sym96$SOURCE_SCHEMA_OBJECT_ID_FN_EXPRESSION_P = makeSymbol( "SOURCE-SCHEMA-OBJECT-ID-FN-EXPRESSION-P" );
    $const97$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $const98$SchemaObjectIDFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectIDFn" ) );
    $list99 = ConsesLow.list( makeSymbol( "SKS" ), makeSymbol( "ODS" ), makeSymbol( "SUB-EXPRESSION" ) );
    $const100$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $kw101$REFLEXIVE = makeKeyword( "REFLEXIVE" );
    $list102 = ConsesLow.list( makeSymbol( "SKS1" ), makeSymbol( "ODS1" ), makeSymbol( "SUB-EXPRESSION1" ) );
    $list103 = ConsesLow.list( makeSymbol( "SKS2" ), makeSymbol( "ODS2" ), makeSymbol( "SUB-EXPRESSION2" ) );
    $const104$joinable = constant_handles.reader_make_constant_shell( makeString( "joinable" ) );
    $kw105$TRANSITIVITY = makeKeyword( "TRANSITIVITY" );
    $const106$subKS = constant_handles.reader_make_constant_shell( makeString( "subKS" ) );
    $sym107$SK_SOURCE_SUB_KS_CLOSURE = makeSymbol( "SK-SOURCE-SUB-KS-CLOSURE" );
    $const108$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) );
    $const109$subKS_Direct = constant_handles.reader_make_constant_shell( makeString( "subKS-Direct" ) );
    $kw110$GAF = makeKeyword( "GAF" );
    $const111$logicalFields = constant_handles.reader_make_constant_shell( makeString( "logicalFields" ) );
    $kw112$MODULE_SOURCE = makeKeyword( "MODULE-SOURCE" );
    $kw113$OR = makeKeyword( "OR" );
    $list114 = ConsesLow.list( ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL" ) ) ), ConsesLow.list( makeKeyword( "NOT" ),
        ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL-CONJUNCTIVE" ) ) ) ) );
    $kw115$SKSI = makeKeyword( "SKSI" );
    $sym116$HL_MODULE_NAME = makeSymbol( "HL-MODULE-NAME" );
    $sym117$FIND_ASSERTION_CYCL_MEMOIZED = makeSymbol( "FIND-ASSERTION-CYCL-MEMOIZED" );
    $sym118$GENL_PREDICATE_MEMOIZED_ = makeSymbol( "GENL-PREDICATE-MEMOIZED?" );
    $sym119$GENL_INVERSE_MEMOIZED_ = makeSymbol( "GENL-INVERSE-MEMOIZED?" );
    $sym120$ALL_FORT_INSTANCES_MEMOIZED = makeSymbol( "ALL-FORT-INSTANCES-MEMOIZED" );
    $sym121$MT_RELEVANT_TO_MT_MEMOIZED_ = makeSymbol( "MT-RELEVANT-TO-MT-MEMOIZED?" );
    $sym122$FORMULA_COMMUTATIVE_PERMUTATIONS_MEMOIZED = makeSymbol( "FORMULA-COMMUTATIVE-PERMUTATIONS-MEMOIZED" );
    $sym123$REMOVAL_ASK_TEMPLATE_MEMOIZED = makeSymbol( "REMOVAL-ASK-TEMPLATE-MEMOIZED" );
    $sym124$REMOVAL_ASK_MEMOIZED = makeSymbol( "REMOVAL-ASK-MEMOIZED" );
    $sym125$REMOVAL_ASK_HL_VARIABLE_MEMOIZED = makeSymbol( "REMOVAL-ASK-HL-VARIABLE-MEMOIZED" );
    $sym126$ISA_UNIT_OF_MEASURE_ = makeSymbol( "ISA-UNIT-OF-MEASURE?" );
    $const127$UnitOfMeasure = constant_handles.reader_make_constant_shell( makeString( "UnitOfMeasure" ) );
  }

  public static final class $logical_field_indexical_el_formula_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $logical_field_indexical_el_formula_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOGICAL-FIELD-INDEXICAL-EL-FORMULA-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return logical_field_indexical_el_formula_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 2685 ms
 * 
 */