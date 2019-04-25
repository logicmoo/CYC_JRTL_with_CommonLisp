package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_generation_api
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_generation_api";
  public static final String myFingerPrint = "dc5e53aff6d968e695f9e96cfc6c021007411aa0208d3bf33a62dbc10d244850";
  private static final SubLSymbol $sym0$NEW_PPH_PARAMETERS;
  private static final SubLSymbol $sym1$PPH_API_PARAM_LIST_P;
  private static final SubLSymbol $sym2$PPH_MUTABLE_API_PARAMS_P;
  private static final SubLSymbol $kw3$DEFAULT;
  private static final SubLSymbol $sym4$PPH_API_PARAM_P;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$TIMED_OUT_;
  private static final SubLSymbol $sym7$PARAMS;
  private static final SubLSymbol $sym8$GET_PPH_PARAM;
  private static final SubLSymbol $sym9$TERM__;
  private static final SubLSymbol $sym10$FIRST;
  private static final SubLSymbol $sym11$CLET;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$WITH_PPH_TIMEOUT;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$IGNORE;
  private static final SubLSymbol $sym16$PPH_API_PARAMS_P;
  private static final SubLSymbol $kw17$UNSPECIFIED;
  private static final SubLSymbol $kw18$NO_VALUE;
  private static final SubLSymbol $sym19$LEXICAL_CONTEXT_P;
  private static final SubLSymbol $sym20$CYCL_TERM_TO_NL_STRING_INTERNAL;
  private static final SubLSymbol $sym21$CYCL_TERM_TO_NL_STRING;
  private static final SubLSymbol $sym22$CYCL_TERM_TO_NL_INTERNAL;
  private static final SubLSymbol $sym23$CYCL_TERM_TO_NL;
  private static final SubLSymbol $kw24$PPH_AGREEMENT;
  private static final SubLSymbol $kw25$PPH_SENTENTIAL_FORCE;
  private static final SubLSymbol $kw26$PPH_LEXICAL_CONTEXT;
  private static final SubLSymbol $kw27$PPH_SEMANTIC_MT;
  private static final SubLSymbol $kw28$PPH_GENERATION_COUNT;
  private static final SubLSymbol $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_;
  private static final SubLSymbol $kw30$DEMERIT_CUTOFF;
  private static final SubLSymbol $kw31$HIDE_EXPLICIT_UNIVERSALS_;
  private static final SubLSymbol $kw32$MAX_DIGITS_WITHOUT_COMMA;
  private static final SubLSymbol $kw33$MAXIMIZE_LINKS_;
  private static final SubLSymbol $kw34$QUANTIFY_VARIABLES_;
  private static final SubLSymbol $kw35$GENLPREDS_BACKOFF_LIMIT;
  private static final SubLSymbol $kw36$SIGNIFICANT_DIGITS_CUTOFF;
  private static final SubLSymbol $kw37$PREFER_TERSE_PARAPHRASE_;
  private static final SubLSymbol $kw38$USE_INDEXICAL_DATES_;
  private static final SubLSymbol $kw39$USE_SMART_VARIABLE_REPLACEMENT_;
  private static final SubLSymbol $kw40$USE_TITLE_CAPITALIZATION_;
  private static final SubLSymbol $kw41$PPH_TIMEOUT;
  private static final SubLSymbol $kw42$NONE;
  private static final SubLSymbol $kw43$HTML;
  private static final SubLSymbol $sym44$CYCL_TERMS_TO_NL_STRINGS_INTERNAL;
  private static final SubLSymbol $sym45$CYCL_TERMS_TO_NL_STRINGS;
  private static final SubLSymbol $sym46$CYCL_TERMS_TO_NL_INTERNAL;
  private static final SubLSymbol $sym47$CYCL_TERMS_TO_NL;
  private static final SubLSymbol $kw48$PREFERRED;
  private static final SubLSymbol $sym49$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL;
  private static final SubLSymbol $sym50$CYCL_TERM_TO_SEARCH_QUERY;
  private static final SubLSymbol $sym51$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL;
  private static final SubLSymbol $sym52$PPH_OUTPUT_MAP_TO_TEXT;
  private static final SubLSymbol $sym53$PPH_OUTPUT_MAP_TO_HTML_INTERNAL;
  private static final SubLSymbol $sym54$PPH_OUTPUT_MAP_TO_HTML;
  private static final SubLSymbol $sym55$PPH_OUTPUT_MAPS_P;
  private static final SubLSymbol $sym56$PPH_OUTPUT_MAP_P;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$PPH_OUTPUT_MAP_GET_ITEMS;
  private static final SubLSymbol $sym59$PPH_OUTPUT_MAP_GET_STRING;
  private static final SubLSymbol $sym60$PPH_OUTPUT_MAP_GET_CYCL;
  private static final SubLSymbol $sym61$PPH_OUTPUT_MAP_GET_STRING_OFFSET;
  private static final SubLSymbol $sym62$PPH_OUTPUT_MAP_GET_ARG_POSITION;

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 958L)
  public static SubLObject new_pph_parameters(SubLObject param_values)
  {
    if( param_values == UNPROVIDED )
    {
      param_values = NIL;
    }
    enforceType( param_values, $sym1$PPH_API_PARAM_LIST_P );
    final SubLObject pph_params = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    SubLObject remainder;
    SubLObject param;
    SubLObject value;
    for( remainder = NIL, remainder = param_values; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      param = remainder.first();
      value = conses_high.cadr( remainder );
      dictionary.dictionary_enter( pph_params, param, value );
    }
    assert NIL != pph_mutable_api_params_p( pph_params ) : pph_params;
    return pph_params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 1412L)
  public static SubLObject pph_api_param_p(final SubLObject param_name)
  {
    return Types.keywordp( pph_parameter_declaration.get_pph_param_type( param_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 1509L)
  public static SubLObject pph_api_params_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.eql( $kw3$DEFAULT ) || NIL != pph_mutable_api_params_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 1627L)
  public static SubLObject pph_mutable_api_params_p(final SubLObject v_object)
  {
    return dictionary.dictionary_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 1708L)
  public static SubLObject pph_api_param_list_p(final SubLObject v_object)
  {
    SubLObject ans = NIL;
    if( NIL != list_utilities.plist_of_type_p( v_object, $sym4$PPH_API_PARAM_P ) )
    {
      SubLObject violationP = NIL;
      SubLObject remainder;
      SubLObject param;
      SubLObject value;
      for( remainder = NIL, remainder = v_object; NIL != remainder; remainder = conses_high.cddr( remainder ) )
      {
        param = remainder.first();
        value = conses_high.cadr( remainder );
        if( NIL == pph_parameter_declaration.valid_pph_param_value_pair_p( param, value ) )
        {
          violationP = T;
        }
      }
      if( NIL == violationP )
      {
        ans = T;
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 2027L)
  public static SubLObject with_pph_api_params(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject param_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    param_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject timed_outP = $sym6$TIMED_OUT_;
    final SubLObject params = $sym7$PARAMS;
    SubLObject global_bindings = NIL;
    final SubLObject iterator_var = pph_parameter_declaration.new_pph_api_param_iterator();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject tuple = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        final SubLObject param = tuple.first();
        final SubLObject corresponding_global = pph_parameter_declaration.get_pph_param_corresponding_global( param );
        if( NIL != corresponding_global )
        {
          global_bindings = ConsesLow.cons( ConsesLow.list( corresponding_global, ConsesLow.list( $sym8$GET_PPH_PARAM, params, param ) ), global_bindings );
        }
      }
    }
    global_bindings = Sort.sort( global_bindings, Symbols.symbol_function( $sym9$TERM__ ), Symbols.symbol_function( $sym10$FIRST ) );
    return ConsesLow.list( $sym11$CLET, reader.bq_cons( ConsesLow.list( params, param_list ), ConsesLow.append( global_bindings, ConsesLow.list( reader.bq_cons( timed_outP, $list12 ) ) ) ), ConsesLow.listS(
        $sym13$WITH_PPH_TIMEOUT, ConsesLow.list( timed_outP, ConsesLow.listS( $sym8$GET_PPH_PARAM, params, $list14 ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym15$IGNORE, timed_outP ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 2725L)
  public static SubLObject get_pph_param(final SubLObject params, final SubLObject param, SubLObject use_defaultP)
  {
    if( use_defaultP == UNPROVIDED )
    {
      use_defaultP = T;
    }
    assert NIL != pph_api_params_p( params ) : params;
    final SubLObject unspecified = $kw17$UNSPECIFIED;
    final SubLObject value_from_specification = ( NIL != dictionary.dictionary_p( params ) ) ? dictionary.dictionary_lookup_without_values( params, param, unspecified ) : unspecified;
    if( !value_from_specification.eql( unspecified ) )
    {
      return value_from_specification;
    }
    if( NIL != use_defaultP || params.eql( $kw3$DEFAULT ) )
    {
      return pph_parameter_declaration.pph_default_for_param( param );
    }
    return $kw18$NO_VALUE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 3377L)
  public static SubLObject lexical_context_p(final SubLObject v_object)
  {
    return hlmt.hlmt_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 3560L)
  public static SubLObject cycl_term_to_nl_string_internal(final SubLObject cycl_term, final SubLObject pph_params)
  {
    final SubLObject maps = cycl_term_to_nl_internal( cycl_term, pph_params );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = maps;
    SubLObject map = NIL;
    map = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( pph_output_map_to_text_internal( map, NIL, ZERO_INTEGER, NIL, NIL ), result );
      cdolist_list_var = cdolist_list_var.rest();
      map = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 3921L)
  public static SubLObject cycl_term_to_nl_internal(final SubLObject cycl_term, final SubLObject pph_params)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nl_preds = get_pph_param( pph_params, $kw24$PPH_AGREEMENT, T );
    final SubLObject force = get_pph_param( pph_params, $kw25$PPH_SENTENTIAL_FORCE, T );
    final SubLObject language_mt = get_pph_param( pph_params, $kw26$PPH_LEXICAL_CONTEXT, T );
    final SubLObject domain_mt = get_pph_param( pph_params, $kw27$PPH_SEMANTIC_MT, T );
    final SubLObject max = get_pph_param( pph_params, $kw28$PPH_GENERATION_COUNT, T );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding( thread );
    try
    {
      pph_vars.$pph_link_arg0P$.bind( T, thread );
      final SubLObject _prev_bind_0_$1 = pph_vars.$determiners_before_variables$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding( thread );
      final SubLObject _prev_bind_4 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding( thread );
      final SubLObject _prev_bind_6 = pph_vars.$pph_max_no_comma_length$.currentBinding( thread );
      final SubLObject _prev_bind_7 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = pph_vars.$pph_search_limit$.currentBinding( thread );
      final SubLObject _prev_bind_10 = pph_vars.$pph_significant_digits_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_11 = pph_vars.$pph_terse_modeP$.currentBinding( thread );
      final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
      final SubLObject _prev_bind_13 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding( thread );
      final SubLObject _prev_bind_14 = pph_vars.$pph_use_title_capitalizationP$.currentBinding( thread );
      try
      {
        pph_vars.$determiners_before_variables$.bind( get_pph_param( pph_params, $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_, UNPROVIDED ), thread );
        pph_vars.$pph_demerit_cutoff$.bind( get_pph_param( pph_params, $kw30$DEMERIT_CUTOFF, UNPROVIDED ), thread );
        pph_vars.$pph_domain_mt$.bind( get_pph_param( pph_params, $kw27$PPH_SEMANTIC_MT, UNPROVIDED ), thread );
        pph_vars.$pph_hide_explicit_universalsP$.bind( get_pph_param( pph_params, $kw31$HIDE_EXPLICIT_UNIVERSALS_, UNPROVIDED ), thread );
        pph_vars.$pph_language_mt$.bind( get_pph_param( pph_params, $kw26$PPH_LEXICAL_CONTEXT, UNPROVIDED ), thread );
        pph_vars.$pph_max_no_comma_length$.bind( get_pph_param( pph_params, $kw32$MAX_DIGITS_WITHOUT_COMMA, UNPROVIDED ), thread );
        pph_vars.$pph_maximize_linksP$.bind( get_pph_param( pph_params, $kw33$MAXIMIZE_LINKS_, UNPROVIDED ), thread );
        pph_vars.$pph_quantify_varsP$.bind( get_pph_param( pph_params, $kw34$QUANTIFY_VARIABLES_, UNPROVIDED ), thread );
        pph_vars.$pph_search_limit$.bind( get_pph_param( pph_params, $kw35$GENLPREDS_BACKOFF_LIMIT, UNPROVIDED ), thread );
        pph_vars.$pph_significant_digits_cutoff$.bind( get_pph_param( pph_params, $kw36$SIGNIFICANT_DIGITS_CUTOFF, UNPROVIDED ), thread );
        pph_vars.$pph_terse_modeP$.bind( get_pph_param( pph_params, $kw37$PREFER_TERSE_PARAPHRASE_, UNPROVIDED ), thread );
        pph_vars.$pph_use_indexical_datesP$.bind( get_pph_param( pph_params, $kw38$USE_INDEXICAL_DATES_, UNPROVIDED ), thread );
        pph_vars.$pph_use_smart_variable_replacementP$.bind( get_pph_param( pph_params, $kw39$USE_SMART_VARIABLE_REPLACEMENT_, UNPROVIDED ), thread );
        pph_vars.$pph_use_title_capitalizationP$.bind( get_pph_param( pph_params, $kw40$USE_TITLE_CAPITALIZATION_, UNPROVIDED ), thread );
        SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0_$2 = pph_macros.$pph_timeout_time_check_count$.currentBinding( thread );
        final SubLObject _prev_bind_1_$3 = pph_macros.$pph_timeout_time$.currentBinding( thread );
        final SubLObject _prev_bind_2_$4 = pph_macros.$pph_timeout_reachedP$.currentBinding( thread );
        try
        {
          pph_macros.$pph_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
          pph_macros.$pph_timeout_time$.bind( pph_macros.pph_compute_timeout_time( get_pph_param( pph_params, $kw41$PPH_TIMEOUT, UNPROVIDED ) ), thread );
          pph_macros.$pph_timeout_reachedP$.bind( pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ), thread );
          pph_macros.$pph_timeout_reachedP$.setDynamicValue( pph_macros.pph_timeout_time_reachedP(), thread );
          if( NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ) )
          {
            if( ( force == $kw42$NONE || ( force == $kw3$DEFAULT && $kw42$NONE == pph_utilities.pph_default_force_for_term( cycl_term ) ) ) && NIL != number_utilities.potentially_infinite_integer_G( max, ONE_INTEGER ) )
            {
              final SubLObject allow_morphological_variantsP = NIL;
              final SubLObject allow_nested_variantsP = NIL;
              final SubLObject output_lists = pph_main.generate_pph_output_lists_for_term( cycl_term, nl_preds, language_mt, domain_mt, allow_morphological_variantsP, allow_nested_variantsP, UNPROVIDED );
              SubLObject doneP = makeBoolean( max.isInteger() && NIL != list_utilities.lengthGE( result, max, UNPROVIDED ) );
              if( NIL == doneP )
              {
                SubLObject csome_list_var = output_lists;
                SubLObject output_list = NIL;
                output_list = csome_list_var.first();
                while ( NIL == doneP && NIL != csome_list_var)
                {
                  final SubLObject javalist = pph_utilities.pph_output_list_to_javalist( output_list );
                  final SubLObject item_var;
                  final SubLObject output_map = item_var = pph_utilities.pph_javalist_to_output_map( javalist, cycl_term );
                  if( NIL == conses_high.member( item_var, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    result = ConsesLow.cons( item_var, result );
                  }
                  doneP = makeBoolean( max.isInteger() && NIL != list_utilities.lengthGE( result, max, UNPROVIDED ) );
                  csome_list_var = csome_list_var.rest();
                  output_list = csome_list_var.first();
                }
              }
            }
            else
            {
              final SubLObject output_list2 = pph_main.generate_pph_output_list( cycl_term, nl_preds, language_mt, domain_mt, $kw43$HTML, force );
              final SubLObject javalist2 = pph_utilities.pph_output_list_to_javalist( output_list2 );
              final SubLObject item_var2;
              final SubLObject output_map2 = item_var2 = pph_utilities.pph_javalist_to_output_map( javalist2, cycl_term );
              if( NIL == conses_high.member( item_var2, result, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                result = ConsesLow.cons( item_var2, result );
              }
            }
          }
          timed_outP = pph_macros.pph_timeout_time_reachedP();
        }
        finally
        {
          pph_macros.$pph_timeout_reachedP$.rebind( _prev_bind_2_$4, thread );
          pph_macros.$pph_timeout_time$.rebind( _prev_bind_1_$3, thread );
          pph_macros.$pph_timeout_time_check_count$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        pph_vars.$pph_use_title_capitalizationP$.rebind( _prev_bind_14, thread );
        pph_vars.$pph_use_smart_variable_replacementP$.rebind( _prev_bind_13, thread );
        pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_12, thread );
        pph_vars.$pph_terse_modeP$.rebind( _prev_bind_11, thread );
        pph_vars.$pph_significant_digits_cutoff$.rebind( _prev_bind_10, thread );
        pph_vars.$pph_search_limit$.rebind( _prev_bind_9, thread );
        pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_8, thread );
        pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_7, thread );
        pph_vars.$pph_max_no_comma_length$.rebind( _prev_bind_6, thread );
        pph_vars.$pph_language_mt$.rebind( _prev_bind_5, thread );
        pph_vars.$pph_hide_explicit_universalsP$.rebind( _prev_bind_4, thread );
        pph_vars.$pph_domain_mt$.rebind( _prev_bind_3, thread );
        pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
        pph_vars.$determiners_before_variables$.rebind( _prev_bind_0_$1, thread );
      }
    }
    finally
    {
      pph_vars.$pph_link_arg0P$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 5497L)
  public static SubLObject cycl_terms_to_nl_strings_internal(final SubLObject cycl_terms, final SubLObject pph_params)
  {
    final SubLObject maps = cycl_terms_to_nl_internal( cycl_terms, pph_params );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = maps;
    SubLObject map = NIL;
    map = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( pph_output_map_to_text_internal( map, NIL, ZERO_INTEGER, NIL, NIL ), result );
      cdolist_list_var = cdolist_list_var.rest();
      map = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 5796L)
  public static SubLObject cycl_terms_to_nl_internal(final SubLObject cycl_term_list, final SubLObject pph_params)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject nl_preds = get_pph_param( pph_params, $kw24$PPH_AGREEMENT, T );
    final SubLObject force = get_pph_param( pph_params, $kw25$PPH_SENTENTIAL_FORCE, T );
    final SubLObject language_mt = get_pph_param( pph_params, $kw26$PPH_LEXICAL_CONTEXT, T );
    final SubLObject domain_mt = get_pph_param( pph_params, $kw27$PPH_SEMANTIC_MT, T );
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding( thread );
    try
    {
      pph_vars.$pph_link_arg0P$.bind( T, thread );
      final SubLObject _prev_bind_0_$5 = pph_vars.$determiners_before_variables$.currentBinding( thread );
      final SubLObject _prev_bind_2 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_3 = pph_vars.$pph_domain_mt$.currentBinding( thread );
      final SubLObject _prev_bind_4 = pph_vars.$pph_hide_explicit_universalsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = pph_vars.$pph_language_mt$.currentBinding( thread );
      final SubLObject _prev_bind_6 = pph_vars.$pph_max_no_comma_length$.currentBinding( thread );
      final SubLObject _prev_bind_7 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = pph_vars.$pph_quantify_varsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = pph_vars.$pph_search_limit$.currentBinding( thread );
      final SubLObject _prev_bind_10 = pph_vars.$pph_significant_digits_cutoff$.currentBinding( thread );
      final SubLObject _prev_bind_11 = pph_vars.$pph_terse_modeP$.currentBinding( thread );
      final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
      final SubLObject _prev_bind_13 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding( thread );
      final SubLObject _prev_bind_14 = pph_vars.$pph_use_title_capitalizationP$.currentBinding( thread );
      try
      {
        pph_vars.$determiners_before_variables$.bind( get_pph_param( pph_params, $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_, UNPROVIDED ), thread );
        pph_vars.$pph_demerit_cutoff$.bind( get_pph_param( pph_params, $kw30$DEMERIT_CUTOFF, UNPROVIDED ), thread );
        pph_vars.$pph_domain_mt$.bind( get_pph_param( pph_params, $kw27$PPH_SEMANTIC_MT, UNPROVIDED ), thread );
        pph_vars.$pph_hide_explicit_universalsP$.bind( get_pph_param( pph_params, $kw31$HIDE_EXPLICIT_UNIVERSALS_, UNPROVIDED ), thread );
        pph_vars.$pph_language_mt$.bind( get_pph_param( pph_params, $kw26$PPH_LEXICAL_CONTEXT, UNPROVIDED ), thread );
        pph_vars.$pph_max_no_comma_length$.bind( get_pph_param( pph_params, $kw32$MAX_DIGITS_WITHOUT_COMMA, UNPROVIDED ), thread );
        pph_vars.$pph_maximize_linksP$.bind( get_pph_param( pph_params, $kw33$MAXIMIZE_LINKS_, UNPROVIDED ), thread );
        pph_vars.$pph_quantify_varsP$.bind( get_pph_param( pph_params, $kw34$QUANTIFY_VARIABLES_, UNPROVIDED ), thread );
        pph_vars.$pph_search_limit$.bind( get_pph_param( pph_params, $kw35$GENLPREDS_BACKOFF_LIMIT, UNPROVIDED ), thread );
        pph_vars.$pph_significant_digits_cutoff$.bind( get_pph_param( pph_params, $kw36$SIGNIFICANT_DIGITS_CUTOFF, UNPROVIDED ), thread );
        pph_vars.$pph_terse_modeP$.bind( get_pph_param( pph_params, $kw37$PREFER_TERSE_PARAPHRASE_, UNPROVIDED ), thread );
        pph_vars.$pph_use_indexical_datesP$.bind( get_pph_param( pph_params, $kw38$USE_INDEXICAL_DATES_, UNPROVIDED ), thread );
        pph_vars.$pph_use_smart_variable_replacementP$.bind( get_pph_param( pph_params, $kw39$USE_SMART_VARIABLE_REPLACEMENT_, UNPROVIDED ), thread );
        pph_vars.$pph_use_title_capitalizationP$.bind( get_pph_param( pph_params, $kw40$USE_TITLE_CAPITALIZATION_, UNPROVIDED ), thread );
        SubLObject timed_outP = NIL;
        final SubLObject _prev_bind_0_$6 = pph_macros.$pph_timeout_time_check_count$.currentBinding( thread );
        final SubLObject _prev_bind_1_$7 = pph_macros.$pph_timeout_time$.currentBinding( thread );
        final SubLObject _prev_bind_2_$8 = pph_macros.$pph_timeout_reachedP$.currentBinding( thread );
        try
        {
          pph_macros.$pph_timeout_time_check_count$.bind( ZERO_INTEGER, thread );
          pph_macros.$pph_timeout_time$.bind( pph_macros.pph_compute_timeout_time( get_pph_param( pph_params, $kw41$PPH_TIMEOUT, UNPROVIDED ) ), thread );
          pph_macros.$pph_timeout_reachedP$.bind( pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ), thread );
          pph_macros.$pph_timeout_reachedP$.setDynamicValue( pph_macros.pph_timeout_time_reachedP(), thread );
          if( NIL == pph_macros.$pph_timeout_reachedP$.getDynamicValue( thread ) )
          {
            SubLObject javalist = NIL;
            SubLObject javalist_$9 = NIL;
            SubLObject cycl_term = NIL;
            SubLObject cycl_term_$10 = NIL;
            javalist = pph_main.generate_disambiguation_phrases_for_java( cycl_term_list, force, nl_preds, language_mt, domain_mt, NIL, $kw48$PREFERRED );
            javalist_$9 = javalist.first();
            cycl_term = cycl_term_list;
            cycl_term_$10 = cycl_term.first();
            while ( NIL != cycl_term || NIL != javalist)
            {
              result = ConsesLow.cons( pph_utilities.pph_javalist_to_output_map( javalist_$9, cycl_term_$10 ), result );
              javalist = javalist.rest();
              javalist_$9 = javalist.first();
              cycl_term = cycl_term.rest();
              cycl_term_$10 = cycl_term.first();
            }
          }
          timed_outP = pph_macros.pph_timeout_time_reachedP();
        }
        finally
        {
          pph_macros.$pph_timeout_reachedP$.rebind( _prev_bind_2_$8, thread );
          pph_macros.$pph_timeout_time$.rebind( _prev_bind_1_$7, thread );
          pph_macros.$pph_timeout_time_check_count$.rebind( _prev_bind_0_$6, thread );
        }
      }
      finally
      {
        pph_vars.$pph_use_title_capitalizationP$.rebind( _prev_bind_14, thread );
        pph_vars.$pph_use_smart_variable_replacementP$.rebind( _prev_bind_13, thread );
        pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_12, thread );
        pph_vars.$pph_terse_modeP$.rebind( _prev_bind_11, thread );
        pph_vars.$pph_significant_digits_cutoff$.rebind( _prev_bind_10, thread );
        pph_vars.$pph_search_limit$.rebind( _prev_bind_9, thread );
        pph_vars.$pph_quantify_varsP$.rebind( _prev_bind_8, thread );
        pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_7, thread );
        pph_vars.$pph_max_no_comma_length$.rebind( _prev_bind_6, thread );
        pph_vars.$pph_language_mt$.rebind( _prev_bind_5, thread );
        pph_vars.$pph_hide_explicit_universalsP$.rebind( _prev_bind_4, thread );
        pph_vars.$pph_domain_mt$.rebind( _prev_bind_3, thread );
        pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_2, thread );
        pph_vars.$determiners_before_variables$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      pph_vars.$pph_link_arg0P$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 6532L)
  public static SubLObject cycl_term_to_search_query_internal(final SubLObject cycl_term, final SubLObject engine, final SubLObject max_words, final SubLObject pph_params)
  {
    SubLObject result = NIL;
    result = qua_query.qua_query_string_for_cycl_sentence( cycl_term, engine, UNPROVIDED );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 7028L)
  public static SubLObject pph_output_map_to_text_internal(final SubLObject map, final SubLObject use_bulleted_listsP, final SubLObject bulleted_list_indent_level, final SubLObject allow_utf8P,
      final SubLObject use_blanks_for_varsP)
  {
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return pph_utilities.pph_javalist_item_string( map );
    }
    return pph_utilities.pph_javalist_string_as_utf8( pph_utilities.pph_output_map_javalist( map ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 7509L)
  public static SubLObject pph_output_map_to_html_internal(final SubLObject map, final SubLObject tag_function, final SubLObject use_bulleted_listsP, final SubLObject bulleted_list_indent_level,
      final SubLObject link_arg0P, final SubLObject use_blanks_for_varsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_link_arg0P$.currentBinding( thread );
    try
    {
      pph_vars.$pph_link_arg0P$.bind( link_arg0P, thread );
      if( NIL != pph_utilities.pph_javalist_item_p( map ) )
      {
        result = pph_utilities.pph_javalist_item_html_string( map );
      }
      else
      {
        result = pph_utilities.pph_javalist_html_string( pph_utilities.pph_output_map_javalist( map ), UNPROVIDED );
      }
    }
    finally
    {
      pph_vars.$pph_link_arg0P$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 8116L)
  public static SubLObject pph_output_maps_p(final SubLObject v_object)
  {
    return list_utilities.list_of_type_p( $sym56$PPH_OUTPUT_MAP_P, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 8355L)
  public static SubLObject pph_output_map_p(final SubLObject v_object)
  {
    return list_utilities.sublisp_boolean( pattern_match.tree_matches_pattern( v_object, $list57 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 8618L)
  public static SubLObject pph_output_map_get_items(final SubLObject map)
  {
    enforceType( map, $sym56$PPH_OUTPUT_MAP_P );
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return NIL;
    }
    return pph_utilities.pph_javalist_items( pph_utilities.pph_output_map_javalist( map ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 8954L)
  public static SubLObject pph_output_map_get_string(final SubLObject map)
  {
    enforceType( map, $sym56$PPH_OUTPUT_MAP_P );
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return pph_utilities.pph_javalist_item_string( map );
    }
    return pph_utilities.pph_javalist_string( pph_utilities.pph_output_map_javalist( map ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 9289L)
  public static SubLObject pph_output_map_get_cycl(final SubLObject map)
  {
    enforceType( map, $sym56$PPH_OUTPUT_MAP_P );
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return pph_utilities.pph_javalist_item_cycl( map );
    }
    return map.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 9597L)
  public static SubLObject pph_output_map_get_string_offset(final SubLObject map)
  {
    enforceType( map, $sym56$PPH_OUTPUT_MAP_P );
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return pph_utilities.pph_javalist_item_start_char( map );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-api.lisp", position = 9978L)
  public static SubLObject pph_output_map_get_arg_position(final SubLObject map)
  {
    enforceType( map, $sym56$PPH_OUTPUT_MAP_P );
    if( NIL != pph_utilities.pph_javalist_item_p( map ) )
    {
      return pph_utilities.pph_javalist_item_arg_position( map );
    }
    return pph_utilities.pph_top_level_arg_position( pph_utilities.pph_identity_map() );
  }

  public static SubLObject declare_nl_generation_api_file()
  {
    SubLFiles.declareFunction( me, "new_pph_parameters", "NEW-PPH-PARAMETERS", 0, 1, false );
    SubLFiles.declareFunction( me, "pph_api_param_p", "PPH-API-PARAM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_api_params_p", "PPH-API-PARAMS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_mutable_api_params_p", "PPH-MUTABLE-API-PARAMS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_api_param_list_p", "PPH-API-PARAM-LIST-P", 1, 0, false );
    SubLFiles.declareMacro( me, "with_pph_api_params", "WITH-PPH-API-PARAMS" );
    SubLFiles.declareFunction( me, "get_pph_param", "GET-PPH-PARAM", 2, 1, false );
    SubLFiles.declareFunction( me, "lexical_context_p", "LEXICAL-CONTEXT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_term_to_nl_string_internal", "CYCL-TERM-TO-NL-STRING-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_term_to_nl_internal", "CYCL-TERM-TO-NL-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_terms_to_nl_strings_internal", "CYCL-TERMS-TO-NL-STRINGS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_terms_to_nl_internal", "CYCL-TERMS-TO-NL-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_term_to_search_query_internal", "CYCL-TERM-TO-SEARCH-QUERY-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_to_text_internal", "PPH-OUTPUT-MAP-TO-TEXT-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_to_html_internal", "PPH-OUTPUT-MAP-TO-HTML-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "pph_output_maps_p", "PPH-OUTPUT-MAPS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_p", "PPH-OUTPUT-MAP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_get_items", "PPH-OUTPUT-MAP-GET-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_get_string", "PPH-OUTPUT-MAP-GET-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_get_cycl", "PPH-OUTPUT-MAP-GET-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_get_string_offset", "PPH-OUTPUT-MAP-GET-STRING-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_output_map_get_arg_position", "PPH-OUTPUT-MAP-GET-ARG-POSITION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_nl_generation_api_file()
  {
    return NIL;
  }

  public static SubLObject setup_nl_generation_api_file()
  {
    access_macros.register_external_symbol( $sym0$NEW_PPH_PARAMETERS );
    access_macros.register_external_symbol( $sym19$LEXICAL_CONTEXT_P );
    access_macros.register_macro_helper( $sym20$CYCL_TERM_TO_NL_STRING_INTERNAL, $sym21$CYCL_TERM_TO_NL_STRING );
    access_macros.register_macro_helper( $sym22$CYCL_TERM_TO_NL_INTERNAL, $sym23$CYCL_TERM_TO_NL );
    access_macros.register_macro_helper( $sym44$CYCL_TERMS_TO_NL_STRINGS_INTERNAL, $sym45$CYCL_TERMS_TO_NL_STRINGS );
    access_macros.register_macro_helper( $sym46$CYCL_TERMS_TO_NL_INTERNAL, $sym47$CYCL_TERMS_TO_NL );
    access_macros.register_macro_helper( $sym49$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL, $sym50$CYCL_TERM_TO_SEARCH_QUERY );
    access_macros.register_macro_helper( $sym51$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL, $sym52$PPH_OUTPUT_MAP_TO_TEXT );
    access_macros.register_macro_helper( $sym53$PPH_OUTPUT_MAP_TO_HTML_INTERNAL, $sym54$PPH_OUTPUT_MAP_TO_HTML );
    access_macros.register_external_symbol( $sym55$PPH_OUTPUT_MAPS_P );
    access_macros.register_external_symbol( $sym56$PPH_OUTPUT_MAP_P );
    access_macros.register_external_symbol( $sym58$PPH_OUTPUT_MAP_GET_ITEMS );
    access_macros.register_external_symbol( $sym59$PPH_OUTPUT_MAP_GET_STRING );
    access_macros.register_external_symbol( $sym60$PPH_OUTPUT_MAP_GET_CYCL );
    access_macros.register_external_symbol( $sym61$PPH_OUTPUT_MAP_GET_STRING_OFFSET );
    access_macros.register_external_symbol( $sym62$PPH_OUTPUT_MAP_GET_ARG_POSITION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_generation_api_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_generation_api_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_generation_api_file();
  }
  static
  {
    me = new nl_generation_api();
    $sym0$NEW_PPH_PARAMETERS = makeSymbol( "NEW-PPH-PARAMETERS" );
    $sym1$PPH_API_PARAM_LIST_P = makeSymbol( "PPH-API-PARAM-LIST-P" );
    $sym2$PPH_MUTABLE_API_PARAMS_P = makeSymbol( "PPH-MUTABLE-API-PARAMS-P" );
    $kw3$DEFAULT = makeKeyword( "DEFAULT" );
    $sym4$PPH_API_PARAM_P = makeSymbol( "PPH-API-PARAM-P" );
    $list5 = ConsesLow.list( makeSymbol( "PARAM-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$TIMED_OUT_ = makeUninternedSymbol( "TIMED-OUT?" );
    $sym7$PARAMS = makeUninternedSymbol( "PARAMS" );
    $sym8$GET_PPH_PARAM = makeSymbol( "GET-PPH-PARAM" );
    $sym9$TERM__ = makeSymbol( "TERM-<" );
    $sym10$FIRST = makeSymbol( "FIRST" );
    $sym11$CLET = makeSymbol( "CLET" );
    $list12 = ConsesLow.list( NIL );
    $sym13$WITH_PPH_TIMEOUT = makeSymbol( "WITH-PPH-TIMEOUT" );
    $list14 = ConsesLow.list( makeKeyword( "PPH-TIMEOUT" ) );
    $sym15$IGNORE = makeSymbol( "IGNORE" );
    $sym16$PPH_API_PARAMS_P = makeSymbol( "PPH-API-PARAMS-P" );
    $kw17$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $kw18$NO_VALUE = makeKeyword( "NO-VALUE" );
    $sym19$LEXICAL_CONTEXT_P = makeSymbol( "LEXICAL-CONTEXT-P" );
    $sym20$CYCL_TERM_TO_NL_STRING_INTERNAL = makeSymbol( "CYCL-TERM-TO-NL-STRING-INTERNAL" );
    $sym21$CYCL_TERM_TO_NL_STRING = makeSymbol( "CYCL-TERM-TO-NL-STRING" );
    $sym22$CYCL_TERM_TO_NL_INTERNAL = makeSymbol( "CYCL-TERM-TO-NL-INTERNAL" );
    $sym23$CYCL_TERM_TO_NL = makeSymbol( "CYCL-TERM-TO-NL" );
    $kw24$PPH_AGREEMENT = makeKeyword( "PPH-AGREEMENT" );
    $kw25$PPH_SENTENTIAL_FORCE = makeKeyword( "PPH-SENTENTIAL-FORCE" );
    $kw26$PPH_LEXICAL_CONTEXT = makeKeyword( "PPH-LEXICAL-CONTEXT" );
    $kw27$PPH_SEMANTIC_MT = makeKeyword( "PPH-SEMANTIC-MT" );
    $kw28$PPH_GENERATION_COUNT = makeKeyword( "PPH-GENERATION-COUNT" );
    $kw29$ADD_DETERMINERS_BEFORE_VARIABLES_ = makeKeyword( "ADD-DETERMINERS-BEFORE-VARIABLES?" );
    $kw30$DEMERIT_CUTOFF = makeKeyword( "DEMERIT-CUTOFF" );
    $kw31$HIDE_EXPLICIT_UNIVERSALS_ = makeKeyword( "HIDE-EXPLICIT-UNIVERSALS?" );
    $kw32$MAX_DIGITS_WITHOUT_COMMA = makeKeyword( "MAX-DIGITS-WITHOUT-COMMA" );
    $kw33$MAXIMIZE_LINKS_ = makeKeyword( "MAXIMIZE-LINKS?" );
    $kw34$QUANTIFY_VARIABLES_ = makeKeyword( "QUANTIFY-VARIABLES?" );
    $kw35$GENLPREDS_BACKOFF_LIMIT = makeKeyword( "GENLPREDS-BACKOFF-LIMIT" );
    $kw36$SIGNIFICANT_DIGITS_CUTOFF = makeKeyword( "SIGNIFICANT-DIGITS-CUTOFF" );
    $kw37$PREFER_TERSE_PARAPHRASE_ = makeKeyword( "PREFER-TERSE-PARAPHRASE?" );
    $kw38$USE_INDEXICAL_DATES_ = makeKeyword( "USE-INDEXICAL-DATES?" );
    $kw39$USE_SMART_VARIABLE_REPLACEMENT_ = makeKeyword( "USE-SMART-VARIABLE-REPLACEMENT?" );
    $kw40$USE_TITLE_CAPITALIZATION_ = makeKeyword( "USE-TITLE-CAPITALIZATION?" );
    $kw41$PPH_TIMEOUT = makeKeyword( "PPH-TIMEOUT" );
    $kw42$NONE = makeKeyword( "NONE" );
    $kw43$HTML = makeKeyword( "HTML" );
    $sym44$CYCL_TERMS_TO_NL_STRINGS_INTERNAL = makeSymbol( "CYCL-TERMS-TO-NL-STRINGS-INTERNAL" );
    $sym45$CYCL_TERMS_TO_NL_STRINGS = makeSymbol( "CYCL-TERMS-TO-NL-STRINGS" );
    $sym46$CYCL_TERMS_TO_NL_INTERNAL = makeSymbol( "CYCL-TERMS-TO-NL-INTERNAL" );
    $sym47$CYCL_TERMS_TO_NL = makeSymbol( "CYCL-TERMS-TO-NL" );
    $kw48$PREFERRED = makeKeyword( "PREFERRED" );
    $sym49$CYCL_TERM_TO_SEARCH_QUERY_INTERNAL = makeSymbol( "CYCL-TERM-TO-SEARCH-QUERY-INTERNAL" );
    $sym50$CYCL_TERM_TO_SEARCH_QUERY = makeSymbol( "CYCL-TERM-TO-SEARCH-QUERY" );
    $sym51$PPH_OUTPUT_MAP_TO_TEXT_INTERNAL = makeSymbol( "PPH-OUTPUT-MAP-TO-TEXT-INTERNAL" );
    $sym52$PPH_OUTPUT_MAP_TO_TEXT = makeSymbol( "PPH-OUTPUT-MAP-TO-TEXT" );
    $sym53$PPH_OUTPUT_MAP_TO_HTML_INTERNAL = makeSymbol( "PPH-OUTPUT-MAP-TO-HTML-INTERNAL" );
    $sym54$PPH_OUTPUT_MAP_TO_HTML = makeSymbol( "PPH-OUTPUT-MAP-TO-HTML" );
    $sym55$PPH_OUTPUT_MAPS_P = makeSymbol( "PPH-OUTPUT-MAPS-P" );
    $sym56$PPH_OUTPUT_MAP_P = makeSymbol( "PPH-OUTPUT-MAP-P" );
    $list57 = ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "CYCL-TERM-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "PPH-JAVALIST-P" ) ) ),
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "PPH-JAVALIST-ITEM-P" ) ) );
    $sym58$PPH_OUTPUT_MAP_GET_ITEMS = makeSymbol( "PPH-OUTPUT-MAP-GET-ITEMS" );
    $sym59$PPH_OUTPUT_MAP_GET_STRING = makeSymbol( "PPH-OUTPUT-MAP-GET-STRING" );
    $sym60$PPH_OUTPUT_MAP_GET_CYCL = makeSymbol( "PPH-OUTPUT-MAP-GET-CYCL" );
    $sym61$PPH_OUTPUT_MAP_GET_STRING_OFFSET = makeSymbol( "PPH-OUTPUT-MAP-GET-STRING-OFFSET" );
    $sym62$PPH_OUTPUT_MAP_GET_ARG_POSITION = makeSymbol( "PPH-OUTPUT-MAP-GET-ARG-POSITION" );
  }
}
/*
 * 
 * Total time: 145 ms
 * 
 */