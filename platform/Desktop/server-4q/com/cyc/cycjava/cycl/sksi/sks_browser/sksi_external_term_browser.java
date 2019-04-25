package com.cyc.cycjava.cycl.sksi.sks_browser;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cb_browser;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_external_term_browser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser";
  public static final String myFingerPrint = "3934fef59874b2d2cfddc1973f6abe0f5eefa63220c3169fe7c275f992c92941";
  private static final SubLObject $const0$SchemaObjectFn;
  private static final SubLObject $const1$SourceSchemaObjectFn;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$CONTENT;
  private static final SubLString $str4$sksi_external_term_gaf_argument__;
  private static final SubLString $str5$__a;
  private static final SubLString $str6$Arg__a;
  private static final SubLString $str7$External_GAFs;
  private static final SubLString $str8$___a_;
  private static final SubLSymbol $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT;
  private static final SubLSymbol $sym10$CB_LINK_SKSI_EXTERNAL_TERM_GAF_ARGUMENT;
  private static final SubLSymbol $sym11$MT_FOR_EXTERNAL_TERM;
  private static final SubLSymbol $sym12$_;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLString $str15$Could_not_determine_an_index_hook;
  private static final SubLString $str16$Could_not_determine_an_arg_from__;
  private static final SubLString $str17$Could_not_determine_a_term_from__;
  private static final SubLString $str18$External_GAF_index_for_;
  private static final SubLString $str19$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str20$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw21$UNINITIALIZED;
  private static final SubLSymbol $kw22$CB_CYC;
  private static final SubLString $str23$yui_skin_sam;
  private static final SubLString $str24$reloadFrameButton;
  private static final SubLString $str25$button;
  private static final SubLString $str26$reload;
  private static final SubLString $str27$Refresh;
  private static final SubLString $str28$reloadCurrentFrame__reloadFrameBu;
  private static final SubLSymbol $sym29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT;
  private static final SubLSymbol $kw30$HTML_HANDLER;
  private static final SubLString $str31$sksi_external_term_predicate_exte;
  private static final SubLString $str32$External_Predicate_Extent;
  private static final SubLString $str33$__N_A_;
  private static final SubLSymbol $kw34$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT;
  private static final SubLSymbol $sym35$CB_LINK_SKSI_EXTERNAL_TERM_PREDICATE_EXTENT;
  private static final SubLList $list36;
  private static final SubLString $str37$Predicate_extent_index_for_;
  private static final SubLSymbol $sym38$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 985L)
  public static SubLObject sksi_supported_external_termP(final SubLObject v_term)
  {
    return makeBoolean( NIL != sksi_supported_external_gaf_argument_termP( v_term ) || NIL != sksi_supported_external_predicate_termP( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 1352L)
  public static SubLObject sksi_supported_external_term_intP(final SubLObject v_term)
  {
    return makeBoolean( NIL != sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_browsing_registeredP() && NIL != term.closed_nautP( v_term, UNPROVIDED ) && ( ( cycl_utilities.nat_functor( v_term ).eql(
        $const0$SchemaObjectFn ) && NIL != sksi_kb_accessors.isa_logical_schemaP( cycl_utilities.nat_arg1( v_term, UNPROVIDED ) ) ) || ( cycl_utilities.nat_functor( v_term ).eql( $const1$SourceSchemaObjectFn )
            && NIL != sksi_kb_accessors.isa_logical_schemaP( cycl_utilities.nat_arg2( v_term, UNPROVIDED ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 1703L)
  public static SubLObject sksi_supported_external_term_logical_schema(final SubLObject v_term)
  {
    final SubLObject pcase_var;
    final SubLObject func = pcase_var = cycl_utilities.nat_functor( v_term );
    if( pcase_var.eql( $const0$SchemaObjectFn ) )
    {
      return cycl_utilities.nat_arg1( v_term, UNPROVIDED );
    }
    if( pcase_var.eql( $const1$SourceSchemaObjectFn ) )
    {
      return cycl_utilities.nat_arg2( v_term, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 1980L)
  public static SubLObject sksi_supported_external_gaf_argument_termP(final SubLObject v_term)
  {
    if( NIL != sksi_supported_external_term_intP( v_term ) )
    {
      return sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entries_for_term( sksi_supported_external_term_logical_schema( v_term ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 2343L)
  public static SubLObject sksi_supported_external_predicate_termP(final SubLObject v_term)
  {
    if( NIL != sksi_supported_external_term_intP( v_term ) )
    {
      return sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entries_for_predicate( sksi_supported_external_term_logical_schema( v_term ), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 2577L)
  public static SubLObject register_sksi_supported_external_terms(final SubLObject logical_schemas, final SubLObject meaning_sentence, final SubLObject required_pattern, final SubLObject predicate_list,
      final SubLObject content_mt, final SubLObject count, final SubLObject module)
  {
    final SubLObject query_form = sksi_external_browser_utilities.sksi_create_query_form_from_required_pattern( required_pattern );
    if( NIL != query_form )
    {
      SubLObject cdolist_list_var = predicate_list;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p( pred, UNPROVIDED ) )
        {
          register_sksi_supported_external_terms_int( logical_schemas, query_form, pred, content_mt, count, module );
        }
        SubLObject cdolist_list_var_$1 = logical_schemas;
        SubLObject arg_pos_schemas_pair = NIL;
        arg_pos_schemas_pair = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          SubLObject current;
          final SubLObject datum = current = arg_pos_schemas_pair;
          SubLObject arg_pos = NIL;
          SubLObject schemas = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
          arg_pos = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
          schemas = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( arg_pos.numE( ZERO_INTEGER ) )
            {
              SubLObject cdolist_list_var_$2 = schemas;
              SubLObject schema = NIL;
              schema = cdolist_list_var_$2.first();
              while ( NIL != cdolist_list_var_$2)
              {
                final SubLObject entry = sksi_sks_predicate_indexing.new_sksi_supported_predicate_cache_entry( meaning_sentence, query_form, content_mt, count, module );
                sksi_sks_predicate_indexing.sksi_supported_predicate_cache_enter( schema, entry );
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                schema = cdolist_list_var_$2.first();
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
          }
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          arg_pos_schemas_pair = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 3740L)
  public static SubLObject register_sksi_supported_external_terms_int(final SubLObject logical_schemas, final SubLObject query_form, final SubLObject predicate, final SubLObject content_mt, final SubLObject count,
      final SubLObject module)
  {
    final SubLObject cache_entry_query_form = el_utilities.make_el_formula( predicate, cycl_utilities.formula_args( query_form, UNPROVIDED ), UNPROVIDED );
    SubLObject cdolist_list_var = logical_schemas;
    SubLObject arg_pos_schemas_pair = NIL;
    arg_pos_schemas_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = arg_pos_schemas_pair;
      SubLObject arg_pos = NIL;
      SubLObject schemas = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      arg_pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      schemas = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( arg_pos.numG( ZERO_INTEGER ) )
        {
          SubLObject cdolist_list_var_$3 = schemas;
          SubLObject schema = NIL;
          schema = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            final SubLObject entry = sksi_sks_gaf_arg_indexing.new_sksi_supported_gaf_argument_cache_entry( arg_pos, cache_entry_query_form, predicate, content_mt, count, module );
            sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_enter( schema, entry, UNPROVIDED );
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            schema = cdolist_list_var_$3.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos_schemas_pair = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 4394L)
  public static SubLObject deregister_sksi_supported_external_terms(final SubLObject logical_schemas, final SubLObject predicate, final SubLObject content_mt, final SubLObject module, final SubLObject count)
  {
    SubLObject cdolist_list_var = logical_schemas;
    SubLObject arg_pos_schemas_pair = NIL;
    arg_pos_schemas_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = arg_pos_schemas_pair;
      SubLObject arg_pos = NIL;
      SubLObject schemas = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      arg_pos = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
      schemas = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( arg_pos.numG( ZERO_INTEGER ) )
        {
          SubLObject cdolist_list_var_$4 = schemas;
          SubLObject schema = NIL;
          schema = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            SubLObject cdolist_list_var_$5;
            final SubLObject cache_entries = cdolist_list_var_$5 = sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_cache_entries_for_term_argument_position_predicate_mt( schema, arg_pos, predicate, content_mt );
            SubLObject entry = NIL;
            entry = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_remove( schema, entry, module, count, UNPROVIDED );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              entry = cdolist_list_var_$5.first();
            }
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            schema = cdolist_list_var_$4.first();
          }
        }
        else
        {
          SubLObject cdolist_list_var_$6 = schemas;
          SubLObject schema = NIL;
          schema = cdolist_list_var_$6.first();
          while ( NIL != cdolist_list_var_$6)
          {
            SubLObject cdolist_list_var_$7;
            final SubLObject cache_entries = cdolist_list_var_$7 = sksi_sks_predicate_indexing.sksi_supported_predicate_cache_entries_for_predicate_and_mt( schema, content_mt );
            SubLObject entry = NIL;
            entry = cdolist_list_var_$7.first();
            while ( NIL != cdolist_list_var_$7)
            {
              sksi_sks_predicate_indexing.sksi_supported_predicate_cache_remove( schema, entry, module, count );
              cdolist_list_var_$7 = cdolist_list_var_$7.rest();
              entry = cdolist_list_var_$7.first();
            }
            cdolist_list_var_$6 = cdolist_list_var_$6.rest();
            schema = cdolist_list_var_$6.first();
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg_pos_schemas_pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject cb_link_sksi_external_term_gaf_argument(final SubLObject index_hook, SubLObject argument_position, SubLObject predicate, SubLObject mt, SubLObject count)
  {
    if( argument_position == UNPROVIDED )
    {
      argument_position = NIL;
    }
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( count == UNPROVIDED )
    {
      count = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP( count ) )
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw3$CONTENT );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str4$sksi_external_term_gaf_argument__, cb_utilities.cb_naut_identifier( index_hook ) );
      if( NIL != argument_position )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str5$__a, argument_position );
        if( NIL != predicate )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str5$__a, cb_utilities.cb_fort_identifier( predicate ) );
          if( NIL != mt )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str5$__a, cb_utilities.cb_fort_identifier( mt ) );
          }
        }
      }
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != mt )
        {
          html_utilities.html_princ( cb_utilities.cb_fort_display_string( mt ) );
        }
        else if( NIL != predicate )
        {
          html_utilities.html_princ( cb_utilities.cb_fort_display_string( predicate ) );
        }
        else if( NIL != argument_position )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str6$Arg__a, argument_position );
        }
        else
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str7$External_GAFs );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
      if( count.isInteger() )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str8$___a_, count );
      }
    }
    return index_hook;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject mt_for_external_term_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term_ks = ( NIL != sksi_kb_accessors.source_schema_object_fn_expression_p( v_term ) ) ? cycl_utilities.nat_arg1( v_term, UNPROVIDED ) : NIL;
    SubLObject result = NIL;
    if( NIL != term_ks )
    {
      final SubLObject mt_var = sksi_kb_accessors.sk_source_mapping_mt( term_ks );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
        result = sksi_kb_accessors.sk_source_content_mt( sksi_kb_accessors.max_genl_ks( term_ks ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject mt_for_external_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return mt_for_external_term_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym11$MT_FOR_EXTERNAL_TERM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym11$MT_FOR_EXTERNAL_TERM, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym11$MT_FOR_EXTERNAL_TERM, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( mt_for_external_term_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject display_sksi_supported_gaf_argument_positions_for_external_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        final SubLObject visible_mt = mt_for_external_term( v_term );
        SubLObject cdolist_list_var;
        final SubLObject argument_positions = cdolist_list_var = Sort.sort( sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_positions_for_term( sksi_supported_external_term_logical_schema( v_term ), visible_mt ),
            $sym12$_, UNPROVIDED );
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          sksi_external_term_gaf_argument_index( v_term, arg );
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
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
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject sksi_external_term_gaf_argument_index(final SubLObject v_term, final SubLObject argument_position)
  {
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_utilities.html_indent( ONE_INTEGER );
    cb_utilities.cb_link( $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, v_term, argument_position, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    final SubLObject visible_mt = mt_for_external_term( v_term );
    SubLObject cdolist_list_var;
    final SubLObject preds = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_preds_for_display( sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_predicates_for_term_argument_position(
        sksi_supported_external_term_logical_schema( v_term ), argument_position, visible_mt ) );
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sksi_external_term_gaf_argument_predicate_index( v_term, argument_position, pred );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject sksi_external_term_gaf_argument_predicate_index(final SubLObject v_term, final SubLObject argument_position, final SubLObject pred)
  {
    final SubLObject visible_mt = mt_for_external_term( v_term );
    final SubLObject mt_count_pairs = sksi_external_browser_utilities.sksi_sort_mt_count_pairs( sksi_sks_gaf_arg_indexing.sksi_supported_gaf_argument_mt_count_pairs_for_term_argument_position_predicate(
        sksi_supported_external_term_logical_schema( v_term ), argument_position, pred, visible_mt ) );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    cb_utilities.cb_link( $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, v_term, argument_position, pred, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = mt_count_pairs;
    SubLObject mt_count_pair = NIL;
    mt_count_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = mt_count_pair;
      SubLObject mt = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
      count = current.first();
      current = current.rest();
      if( NIL == current )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_indent( THREE_INTEGER );
        cb_utilities.cb_link( $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, v_term, argument_position, pred, mt, count );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_count_pair = cdolist_list_var.first();
    }
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject sksi_external_term_gaf_argument(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list14 );
    index_spec = args.first();
    SubLObject current = args.rest();
    final SubLObject arg_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list14 );
    current = current.rest();
    final SubLObject pred_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list14 );
    current = current.rest();
    final SubLObject mt_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list14 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject index_hook = cb_utilities.cb_guess_naut_spec( index_spec );
      SubLObject arg = NIL;
      SubLObject predicate = NIL;
      SubLObject mt = NIL;
      if( NIL == term.closed_nautP( index_hook, UNPROVIDED ) )
      {
        return cb_utilities.cb_error( $str15$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != arg_string )
      {
        arg = reader.read_from_string_ignoring_errors( arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED );
        if( !arg.isFixnum() )
        {
          return cb_utilities.cb_error( $str16$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != pred_spec )
        {
          predicate = cb_utilities.cb_guess_term( pred_spec, UNPROVIDED );
          if( NIL == forts.fort_p( predicate ) )
          {
            return cb_utilities.cb_error( $str17$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          if( NIL != mt_spec )
          {
            mt = cb_utilities.cb_guess_term( mt_spec, UNPROVIDED );
            if( NIL == hlmt.hlmt_p( mt ) )
            {
              return cb_utilities.cb_error( $str17$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
          }
        }
      }
      final SubLObject title_var;
      final SubLObject title = title_var = Sequences.cconcatenate( $str18$External_GAF_index_for_, format_nil.format_nil_s_no_copy( index_hook ) );
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str19$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str20$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$9 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw21$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw22$CB_CYC );
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          dhtml_macros.html_basic_cb_scripts();
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str24$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str25$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str26$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str27$Refresh );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str28$reloadCurrentFrame__reloadFrameBu );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              cb_browser.cb_c_term_header( index_hook );
              html_utilities.html_newline( TWO_INTEGER );
              sksi_external_gaf_argument_browser.sksi_external_gaf_argument_internal( index_hook, arg, predicate, mt, T, UNPROVIDED );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$9, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list14 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject cb_link_sksi_external_term_predicate_extent(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw3$CONTENT );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str31$sksi_external_term_predicate_exte, cb_utilities.cb_naut_identifier( predicate ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( $str32$External_Predicate_Extent );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    final SubLObject visible_mt = mt_for_external_term( predicate );
    SubLObject cdolist_list_var;
    final SubLObject mt_count_pairs = cdolist_list_var = sksi_external_browser_utilities.sksi_sort_mt_count_pairs( sksi_sks_predicate_indexing.sksi_supported_predicate_mt_count_pairs_for_predicate(
        sksi_supported_external_term_logical_schema( predicate ), visible_mt ) );
    SubLObject mt_count_pair = NIL;
    mt_count_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = mt_count_pair;
      SubLObject mt = NIL;
      SubLObject count = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
      count = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != sksi_external_browser_utilities.count_not_too_expensive_for_browser_supportP( count ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          final SubLObject frame_name_var2 = cb_utilities.cb_frame_name( $kw3$CONTENT );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_parameters.cyc_cgi_url_int();
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str31$sksi_external_term_predicate_exte, cb_utilities.cb_naut_identifier( predicate ) );
          if( NIL != mt )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str5$__a, cb_utilities.cb_fort_identifier( mt ) );
          }
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var2 )
          {
            html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != mt )
            {
              html_utilities.html_princ( cb_utilities.cb_fort_display_string( mt ) );
            }
            else
            {
              html_utilities.html_princ( $str32$External_Predicate_Extent );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          if( count.isInteger() )
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str8$___a_, count );
          }
          else
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str33$__N_A_ );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list13 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_count_pair = cdolist_list_var.first();
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sks-browser/sksi-external-term-browser.lisp", position = 5525L)
  public static SubLObject sksi_external_term_predicate_extent(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list36 );
    index_spec = args.first();
    SubLObject current = args.rest();
    final SubLObject mt_spec = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list36 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject predicate = cb_utilities.cb_guess_naut_spec( index_spec );
      SubLObject mt = NIL;
      if( NIL == term.closed_nautP( predicate, UNPROVIDED ) )
      {
        return cb_utilities.cb_error( $str15$Could_not_determine_an_index_hook, index_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL != mt_spec )
      {
        mt = cb_utilities.cb_guess_fort( mt_spec, UNPROVIDED );
        if( NIL == hlmt.hlmt_p( mt ) )
        {
          return cb_utilities.cb_error( $str17$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      final SubLObject visible_mt = mt_for_external_term( predicate );
      final SubLObject title_var;
      final SubLObject title = title_var = Sequences.cconcatenate( $str37$Predicate_extent_index_for_, format_nil.format_nil_s_no_copy( predicate ) );
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str19$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str20$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw21$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw22$CB_CYC );
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          dhtml_macros.html_basic_cb_scripts();
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str23$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str24$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str25$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str26$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str27$Refresh );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str28$reloadCurrentFrame__reloadFrameBu );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              cb_browser.cb_c_term_header( predicate );
              html_utilities.html_newline( TWO_INTEGER );
              sksi_external_predicate_extent_browser.sksi_external_predicate_extent_internal( predicate, mt, T, visible_mt );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list36 );
    }
    return NIL;
  }

  public static SubLObject declare_sksi_external_term_browser_file()
  {
    SubLFiles.declareFunction( me, "sksi_supported_external_termP", "SKSI-SUPPORTED-EXTERNAL-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_external_term_intP", "SKSI-SUPPORTED-EXTERNAL-TERM-INT?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_external_term_logical_schema", "SKSI-SUPPORTED-EXTERNAL-TERM-LOGICAL-SCHEMA", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_external_gaf_argument_termP", "SKSI-SUPPORTED-EXTERNAL-GAF-ARGUMENT-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_supported_external_predicate_termP", "SKSI-SUPPORTED-EXTERNAL-PREDICATE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_supported_external_terms", "REGISTER-SKSI-SUPPORTED-EXTERNAL-TERMS", 7, 0, false );
    SubLFiles.declareFunction( me, "register_sksi_supported_external_terms_int", "REGISTER-SKSI-SUPPORTED-EXTERNAL-TERMS-INT", 6, 0, false );
    SubLFiles.declareFunction( me, "deregister_sksi_supported_external_terms", "DEREGISTER-SKSI-SUPPORTED-EXTERNAL-TERMS", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_link_sksi_external_term_gaf_argument", "CB-LINK-SKSI-EXTERNAL-TERM-GAF-ARGUMENT", 1, 4, false );
    SubLFiles.declareFunction( me, "mt_for_external_term_internal", "MT-FOR-EXTERNAL-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_for_external_term", "MT-FOR-EXTERNAL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "display_sksi_supported_gaf_argument_positions_for_external_term", "DISPLAY-SKSI-SUPPORTED-GAF-ARGUMENT-POSITIONS-FOR-EXTERNAL-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_term_gaf_argument_index", "SKSI-EXTERNAL-TERM-GAF-ARGUMENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_term_gaf_argument_predicate_index", "SKSI-EXTERNAL-TERM-GAF-ARGUMENT-PREDICATE-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_term_gaf_argument", "SKSI-EXTERNAL-TERM-GAF-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_sksi_external_term_predicate_extent", "CB-LINK-SKSI-EXTERNAL-TERM-PREDICATE-EXTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_external_term_predicate_extent", "SKSI-EXTERNAL-TERM-PREDICATE-EXTENT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_external_term_browser_file()
  {
    return NIL;
  }

  public static SubLObject setup_sksi_external_term_browser_file()
  {
    cb_utilities.setup_cb_link_method( $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, $sym10$CB_LINK_SKSI_EXTERNAL_TERM_GAF_ARGUMENT, FIVE_INTEGER );
    memoization_state.note_memoized_function( $sym11$MT_FOR_EXTERNAL_TERM );
    html_macros.note_cgi_handler_function( $sym29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT, $kw30$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw34$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT, $sym35$CB_LINK_SKSI_EXTERNAL_TERM_PREDICATE_EXTENT, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym38$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT, $kw30$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_external_term_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_external_term_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_external_term_browser_file();
  }
  static
  {
    me = new sksi_external_term_browser();
    $const0$SchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) );
    $const1$SourceSchemaObjectFn = constant_handles.reader_make_constant_shell( makeString( "SourceSchemaObjectFn" ) );
    $list2 = ConsesLow.list( makeSymbol( "ARG-POS" ), makeSymbol( "SCHEMAS" ) );
    $kw3$CONTENT = makeKeyword( "CONTENT" );
    $str4$sksi_external_term_gaf_argument__ = makeString( "sksi-external-term-gaf-argument&~a" );
    $str5$__a = makeString( "&~a" );
    $str6$Arg__a = makeString( "Arg ~a" );
    $str7$External_GAFs = makeString( "External GAFs" );
    $str8$___a_ = makeString( " (~a)" );
    $kw9$SKSI_EXTERNAL_TERM_GAF_ARGUMENT = makeKeyword( "SKSI-EXTERNAL-TERM-GAF-ARGUMENT" );
    $sym10$CB_LINK_SKSI_EXTERNAL_TERM_GAF_ARGUMENT = makeSymbol( "CB-LINK-SKSI-EXTERNAL-TERM-GAF-ARGUMENT" );
    $sym11$MT_FOR_EXTERNAL_TERM = makeSymbol( "MT-FOR-EXTERNAL-TERM" );
    $sym12$_ = makeSymbol( "<" );
    $list13 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "COUNT" ) );
    $list14 = ConsesLow.list( makeSymbol( "INDEX-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARG-STRING" ), makeSymbol( "PRED-SPEC" ), makeSymbol( "MT-SPEC" ) );
    $str15$Could_not_determine_an_index_hook = makeString( "Could not determine an index-hook from ~a" );
    $str16$Could_not_determine_an_arg_from__ = makeString( "Could not determine an arg from ~a" );
    $str17$Could_not_determine_a_term_from__ = makeString( "Could not determine a term from ~a" );
    $str18$External_GAF_index_for_ = makeString( "External GAF index for " );
    $str19$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str20$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw21$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw22$CB_CYC = makeKeyword( "CB-CYC" );
    $str23$yui_skin_sam = makeString( "yui-skin-sam" );
    $str24$reloadFrameButton = makeString( "reloadFrameButton" );
    $str25$button = makeString( "button" );
    $str26$reload = makeString( "reload" );
    $str27$Refresh = makeString( "Refresh" );
    $str28$reloadCurrentFrame__reloadFrameBu = makeString( "reloadCurrentFrame('reloadFrameButton');" );
    $sym29$SKSI_EXTERNAL_TERM_GAF_ARGUMENT = makeSymbol( "SKSI-EXTERNAL-TERM-GAF-ARGUMENT" );
    $kw30$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str31$sksi_external_term_predicate_exte = makeString( "sksi-external-term-predicate-extent&~a" );
    $str32$External_Predicate_Extent = makeString( "External Predicate Extent" );
    $str33$__N_A_ = makeString( " (N/A)" );
    $kw34$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT = makeKeyword( "SKSI-EXTERNAL-TERM-PREDICATE-EXTENT" );
    $sym35$CB_LINK_SKSI_EXTERNAL_TERM_PREDICATE_EXTENT = makeSymbol( "CB-LINK-SKSI-EXTERNAL-TERM-PREDICATE-EXTENT" );
    $list36 = ConsesLow.list( makeSymbol( "INDEX-SPEC" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MT-SPEC" ) );
    $str37$Predicate_extent_index_for_ = makeString( "Predicate extent index for " );
    $sym38$SKSI_EXTERNAL_TERM_PREDICATE_EXTENT = makeSymbol( "SKSI-EXTERNAL-TERM-PREDICATE-EXTENT" );
  }
}
/*
 * 
 * Total time: 214 ms
 * 
 */