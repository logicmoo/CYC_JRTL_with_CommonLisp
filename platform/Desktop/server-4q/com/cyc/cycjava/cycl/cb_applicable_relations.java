package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_applicable_relations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_applicable_relations";
  public static final String myFingerPrint = "a4d421045f97ebd2a10d9fb8f4f3c7b2c7421673f5d3ff7c09edcf0381b4af18";
  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8776L)
  private static SubLSymbol $cb_suggest_gafs_for_terms_caching_state$;
  private static final SubLSymbol $kw0$CB_APPLICABLE_RELATIONS;
  private static final SubLString $str1$cb_applicable_relations_html;
  private static final SubLString $str2$Unable_to_determine_a_term_from__;
  private static final SubLString $str3$Applicable_Relations;
  private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw6$UNINITIALIZED;
  private static final SubLSymbol $kw7$CB_CYC;
  private static final SubLSymbol $kw8$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw9$SHA1;
  private static final SubLString $str10$yui_skin_sam;
  private static final SubLString $str11$reloadFrameButton;
  private static final SubLString $str12$button;
  private static final SubLString $str13$reload;
  private static final SubLString $str14$Refresh_Frames;
  private static final SubLString $str15$Relations_which_apply_to_;
  private static final SubLString $str16$___;
  private static final SubLList $list17;
  private static final SubLObject $const18$SkolemFunction;
  private static final SubLString $str19$_dddddd;
  private static final SubLSymbol $kw20$GAF_ARG_PREDICATE;
  private static final SubLSymbol $sym21$LITERAL_QUERY_NORMAL;
  private static final SubLSymbol $kw22$MAIN;
  private static final SubLObject $const23$InferencePSC;
  private static final SubLSymbol $kw24$NART_ARG_FUNCTION;
  private static final SubLSymbol $sym25$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const26$EverythingPSC;
  private static final SubLObject $const27$NLGenerationFunction;
  private static final SubLSymbol $kw28$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym29$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym30$CB_APPLICABLE_RELATIONS;
  private static final SubLSymbol $kw31$HTML_HANDLER;
  private static final SubLSymbol $kw32$CONTENT;
  private static final SubLString $str33$cb_applicable_relations__A;
  private static final SubLSymbol $kw34$APPLICABLE_RELATIONS;
  private static final SubLSymbol $sym35$CB_LINK_APPLICABLE_RELATIONS;
  private static final SubLSymbol $sym36$FORT_P;
  private static final SubLObject $const37$CycLReifiableDenotationalTerm;
  private static final SubLSymbol $sym38$_;
  private static final SubLSymbol $sym39$SPEC_CARDINALITY;
  private static final SubLSymbol $kw40$GAF;
  private static final SubLSymbol $kw41$TRUE;
  private static final SubLString $str42$_GAF_Suggestor_;
  private static final SubLString $str43$cb_gaf_suggestor;
  private static final SubLSymbol $kw44$GAF_SUGGESTOR;
  private static final SubLSymbol $sym45$CB_LINK_GAF_SUGGESTOR;
  private static final SubLString $str46$GAF_Suggestor;
  private static final SubLString $str47$post;
  private static final SubLString $str48$cb_handle_gaf_suggestor;
  private static final SubLSymbol $kw49$CB_GAF_SUGGESTOR;
  private static final SubLString $str50$Suggest_GAFs;
  private static final SubLString $str51$Clear;
  private static final SubLSymbol $kw52$INPUT_NAME;
  private static final SubLString $str53$term;
  private static final SubLSymbol $kw54$PRETTY_NAME;
  private static final SubLString $str55$Term_;
  private static final SubLSymbol $kw56$COMPLETE_LABEL;
  private static final SubLString $str57$Complete;
  private static final SubLSymbol $kw58$HEIGHT;
  private static final SubLSymbol $sym59$CB_GAF_SUGGESTOR;
  private static final SubLSymbol $kw60$REQUIRED_;
  private static final SubLSymbol $kw61$AUTO_CYCLIFY;
  private static final SubLString $str62$GAF_Suggestions;
  private static final SubLString $str63$Terms__;
  private static final SubLSymbol $kw64$SENTENCE_QUERY_SIMILAR;
  private static final SubLString $str65$_Query_;
  private static final SubLSymbol $kw66$ASSERT_FORMULA;
  private static final SubLSymbol $kw67$UNSPECIFIED;
  private static final SubLString $str68$_Assert_;
  private static final SubLSymbol $sym69$CB_HANDLE_GAF_SUGGESTOR;
  private static final SubLSymbol $kw70$USAGE_THRESHOLD;
  private static final SubLSymbol $kw71$ISA_HORIZON;
  private static final SubLObject $const72$Individual;
  private static final SubLSymbol $sym73$CB_SUGGEST_GAFS_FOR_TERMS;
  private static final SubLSymbol $kw74$MAX_NUMBER;
  private static final SubLInteger $int75$100;
  private static final SubLSymbol $sym76$_CB_SUGGEST_GAFS_FOR_TERMS_CACHING_STATE_;

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 1116L)
  public static SubLObject cb_applicable_relations(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = cb_utilities.cb_guess_fort( args, UNPROVIDED );
    if( NIL == forts.fort_p( fort ) )
    {
      return cb_utilities.cb_error( $str2$Unable_to_determine_a_term_from__, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject v_applicable_relations = old_applicable_relations( fort );
    SubLObject temp_relations = NIL;
    SubLObject first_lineP = T;
    final SubLObject title_var = $str3$Applicable_Relations;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw7$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str10$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str14$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw0$CB_APPLICABLE_RELATIONS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str15$Relations_which_apply_to_ );
              cb_utilities.cb_show_term( fort, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str16$___ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              SubLObject cdolist_list_var = v_applicable_relations;
              SubLObject info = NIL;
              info = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = info;
                SubLObject arg = NIL;
                SubLObject relations = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
                arg = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
                relations = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  relations = kb_utilities.sort_terms( Sequences.remove_duplicates( relations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( NIL == control_vars.$cb_skolem_applicable_relationsP$.getDynamicValue( thread ) )
                  {
                    SubLObject cdolist_list_var_$6 = relations;
                    SubLObject relation = NIL;
                    relation = cdolist_list_var_$6.first();
                    while ( NIL != cdolist_list_var_$6)
                    {
                      if( NIL == isa.isaP( relation, $const18$SkolemFunction, UNPROVIDED, UNPROVIDED ) )
                      {
                        final SubLObject item_var = relation;
                        if( NIL == conses_high.member( item_var, temp_relations, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                        {
                          temp_relations = ConsesLow.cons( item_var, temp_relations );
                        }
                      }
                      cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                      relation = cdolist_list_var_$6.first();
                    }
                    relations = Sequences.nreverse( temp_relations );
                  }
                  if( NIL != control_vars.$cb_applicable_relations_one_per_lineP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_newline( UNPROVIDED );
                    cb_browser.cb_c_gaf_arg_header( arg );
                    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ZERO_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( FIVE_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( ZERO_INTEGER );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      SubLObject bgcolor = NIL;
                      SubLObject color_toggle = NIL;
                      SubLObject list_var = NIL;
                      SubLObject relation2 = NIL;
                      SubLObject ignore_me = NIL;
                      list_var = relations;
                      relation2 = list_var.first();
                      for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), relation2 = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
                      {
                        if( NIL != color_toggle )
                        {
                          color_toggle = NIL;
                        }
                        else
                        {
                          color_toggle = T;
                        }
                        bgcolor = ( NIL != color_toggle ) ? $str19$_dddddd : html_macros.$html_color_lightest_grey$.getGlobalValue();
                        if( NIL != fort_types_interface.predicate_in_any_mtP( relation2 ) )
                        {
                          cb_adornments.handle_specific_adornment( $kw20$GAF_ARG_PREDICATE, $sym21$LITERAL_QUERY_NORMAL, $kw22$MAIN, fort, arg, relation2, $const23$InferencePSC );
                        }
                        else if( NIL != fort_types_interface.function_in_any_mtP( relation2 ) )
                        {
                          cb_adornments.handle_specific_adornment( $kw24$NART_ARG_FUNCTION, $sym21$LITERAL_QUERY_NORMAL, $kw22$MAIN, fort, arg, relation2, $const23$InferencePSC );
                        }
                        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                        if( NIL != bgcolor )
                        {
                          html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( bgcolor );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        }
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            cb_utilities.cb_show_term( relation2, UNPROVIDED, UNPROVIDED );
                            if( NIL != control_vars.$cb_paraphrase_applicable_relationsP$.getDynamicValue( thread ) )
                            {
                              html_utilities.html_newline( UNPROVIDED );
                              html_utilities.html_indent( FOUR_INTEGER );
                              final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding( thread );
                              try
                              {
                                mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_EVERYTHING, thread );
                                mt_relevance_macros.$mt$.bind( $const26$EverythingPSC, thread );
                                if( NIL == isa.isaP( relation2, $const18$SkolemFunction, UNPROVIDED, UNPROVIDED ) && NIL == isa.isaP( relation2, $const27$NLGenerationFunction, UNPROVIDED, UNPROVIDED )
                                    && ( NIL != fort_types_interface.predicateP( relation2 ) || NIL != fort_types_interface.functionP( relation2 ) ) )
                                {
                                  final SubLObject dummy_formula = pph_utilities.pph_dummy_formula( relation2, T );
                                  list_utilities.nreplace_nth( arg, fort, dummy_formula );
                                  SubLObject ignore_errors_tag = NIL;
                                  try
                                  {
                                    thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
                                    final SubLObject _prev_bind_0_$10 = Errors.$error_handler$.currentBinding( thread );
                                    try
                                    {
                                      Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
                                      try
                                      {
                                        html_utilities.html_princ( pph_main.generate_phrase( dummy_formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                                      }
                                      catch( final Throwable catch_var )
                                      {
                                        Errors.handleThrowable( catch_var, NIL );
                                      }
                                    }
                                    finally
                                    {
                                      Errors.$error_handler$.rebind( _prev_bind_0_$10, thread );
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
                              }
                              finally
                              {
                                mt_relevance_macros.$mt$.rebind( _prev_bind_1_$11, thread );
                                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$9, thread );
                              }
                            }
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                        html_utilities.html_source_readability_terpri( UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                  }
                  else
                  {
                    if( NIL != first_lineP )
                    {
                      first_lineP = NIL;
                    }
                    else
                    {
                      html_utilities.html_newline( UNPROVIDED );
                      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                    }
                    cb_browser.cb_c_gaf_arg_header( arg );
                    html_utilities.html_newline( UNPROVIDED );
                    SubLObject cdolist_list_var_$7 = relations;
                    SubLObject relation = NIL;
                    relation = cdolist_list_var_$7.first();
                    while ( NIL != cdolist_list_var_$7)
                    {
                      if( NIL != fort_types_interface.predicate_in_any_mtP( relation ) )
                      {
                        cb_adornments.handle_specific_adornment( $kw20$GAF_ARG_PREDICATE, $sym21$LITERAL_QUERY_NORMAL, $kw22$MAIN, fort, arg, relation, $const23$InferencePSC );
                      }
                      else if( NIL != fort_types_interface.function_in_any_mtP( relation ) )
                      {
                        cb_adornments.handle_specific_adornment( $kw24$NART_ARG_FUNCTION, $sym21$LITERAL_QUERY_NORMAL, $kw22$MAIN, fort, arg, relation, $const23$InferencePSC );
                      }
                      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                      cb_utilities.cb_show_term( relation, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
                      html_utilities.html_indent( TWO_INTEGER );
                      html_utilities.html_terpri( UNPROVIDED );
                      html_utilities.html_indent( TWO_INTEGER );
                      cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                      relation = cdolist_list_var_$7.first();
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                info = cdolist_list_var.first();
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 4061L)
  public static SubLObject cb_link_applicable_relations(final SubLObject fort, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str3$Applicable_Relations;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw32$CONTENT );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str33$cb_applicable_relations__A, cb_utilities.cb_fort_identifier( fort ) );
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
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 4339L)
  public static SubLObject old_applicable_relations(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym25$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const26$EverythingPSC, thread );
      final SubLObject collectionP = fort_types_interface.collectionP( fort );
      final SubLObject defn_isas = genls.all_genls( $const37$CycLReifiableDenotationalTerm, NIL, UNPROVIDED );
      SubLObject all_isas = isa.all_isa( fort, NIL, UNPROVIDED );
      all_isas = conses_high.nunion( all_isas, defn_isas, UNPROVIDED, UNPROVIDED );
      all_isas = Sort.sort( all_isas, Symbols.symbol_function( $sym38$_ ), Symbols.symbol_function( $sym39$SPEC_CARDINALITY ) );
      SubLObject cdolist_list_var = czer_vars.$arg_positions$.getGlobalValue();
      SubLObject arg = NIL;
      arg = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred( arg, UNPROVIDED, UNPROVIDED );
        SubLObject arg_preds = NIL;
        SubLObject cdolist_list_var_$14 = all_isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var_$14.first();
        while ( NIL != cdolist_list_var_$14)
        {
          SubLObject cdolist_list_var_$15;
          final SubLObject candidate_preds = cdolist_list_var_$15 = kb_mapping_utilities.pred_values( v_isa, arg_isa_pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
          SubLObject candidate_pred = NIL;
          candidate_pred = cdolist_list_var_$15.first();
          while ( NIL != cdolist_list_var_$15)
          {
            SubLObject arg_constraints_violatedP = NIL;
            if( kb_indexing.num_gaf_arg_index( candidate_pred, ONE_INTEGER, arg_isa_pred, UNPROVIDED ).numG( ONE_INTEGER ) )
            {
              SubLObject collection = NIL;
              final SubLObject pred_var = arg_isa_pred;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( candidate_pred, ONE_INTEGER, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate_pred, ONE_INTEGER, pred_var );
                SubLObject done_var = arg_constraints_violatedP;
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
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw40$GAF, $kw41$TRUE, NIL );
                      SubLObject done_var_$16 = arg_constraints_violatedP;
                      final SubLObject token_var_$17 = NIL;
                      while ( NIL == done_var_$16)
                      {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$17 );
                        final SubLObject valid_$18 = makeBoolean( !token_var_$17.eql( assertion ) );
                        if( NIL != valid_$18 )
                        {
                          collection = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                          if( !collection.eql( v_isa ) )
                          {
                            arg_constraints_violatedP = makeBoolean( NIL == isa.isaP( fort, collection, NIL, UNPROVIDED ) );
                          }
                        }
                        done_var_$16 = makeBoolean( NIL == valid_$18 || NIL != arg_constraints_violatedP );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != arg_constraints_violatedP );
                }
              }
            }
            if( NIL == arg_constraints_violatedP )
            {
              final SubLObject arg_genl_pred = kb_accessors.arg_genl_pred( arg, UNPROVIDED, UNPROVIDED );
              if( kb_indexing.num_gaf_arg_index( candidate_pred, ONE_INTEGER, arg_genl_pred, UNPROVIDED ).numG( ZERO_INTEGER ) )
              {
                arg_constraints_violatedP = makeBoolean( NIL == collectionP );
                SubLObject collection2 = NIL;
                final SubLObject pred_var2 = arg_genl_pred;
                if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( candidate_pred, ONE_INTEGER, pred_var2 ) )
                {
                  final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( candidate_pred, ONE_INTEGER, pred_var2 );
                  SubLObject done_var2 = arg_constraints_violatedP;
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
                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw40$GAF, $kw41$TRUE, NIL );
                        SubLObject done_var_$17 = arg_constraints_violatedP;
                        final SubLObject token_var_$18 = NIL;
                        while ( NIL == done_var_$17)
                        {
                          final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$18 );
                          final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion2 ) );
                          if( NIL != valid_$19 )
                          {
                            collection2 = assertions_high.gaf_arg( assertion2, TWO_INTEGER );
                            arg_constraints_violatedP = makeBoolean( NIL == genls.genlsP( fort, collection2, NIL, UNPROVIDED ) );
                          }
                          done_var_$17 = makeBoolean( NIL == valid_$19 || NIL != arg_constraints_violatedP );
                        }
                      }
                      finally
                      {
                        final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
                        }
                      }
                    }
                    done_var2 = makeBoolean( NIL == valid2 || NIL != arg_constraints_violatedP );
                  }
                }
              }
            }
            if( NIL == arg_constraints_violatedP )
            {
              arg_preds = ConsesLow.cons( candidate_pred, arg_preds );
            }
            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
            candidate_pred = cdolist_list_var_$15.first();
          }
          cdolist_list_var_$14 = cdolist_list_var_$14.rest();
          v_isa = cdolist_list_var_$14.first();
        }
        if( NIL != arg_preds )
        {
          arg_preds = Sequences.nreverse( arg_preds );
          v_answer = ConsesLow.cons( ConsesLow.list( arg, arg_preds ), v_answer );
        }
        cdolist_list_var = cdolist_list_var.rest();
        arg = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 6092L)
  public static SubLObject cb_link_gaf_suggestor(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str42$_GAF_Suggestor_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw22$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str43$cb_gaf_suggestor );
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
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 6489L)
  public static SubLObject cb_gaf_suggestor(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str46$GAF_Suggestor;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw7$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw8$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$25 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str10$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str14$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str47$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str48$cb_handle_gaf_suggestor, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw49$CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED );
              html_utilities.html_submit_input( $str50$Suggest_GAFs, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( THREE_INTEGER );
              html_utilities.html_reset_input( $str51$Clear );
              html_utilities.html_newline( UNPROVIDED );
              SubLObject i;
              SubLObject options;
              for( i = NIL, i = ZERO_INTEGER; i.numL( TWO_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
              {
                options = ConsesLow.list( $kw52$INPUT_NAME, Sequences.cconcatenate( $str53$term, format_nil.format_nil_a_no_copy( i ) ), $kw54$PRETTY_NAME, Sequences.cconcatenate( $str55$Term_, format_nil
                    .format_nil_s_no_copy( i ) ), $kw56$COMPLETE_LABEL, $str57$Complete, $kw58$HEIGHT, ONE_INTEGER );
                html_utilities.html_newline( UNPROVIDED );
                cb_form_widgets.cb_el_term_input_section( NIL, options );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$25, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$24, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 7393L)
  public static SubLObject cb_handle_gaf_suggestor(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject terms = NIL;
    SubLObject i;
    SubLObject options;
    SubLObject v_term;
    SubLObject error;
    SubLObject input_string;
    for( i = NIL, i = ZERO_INTEGER; i.numL( TWO_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      options = ConsesLow.list( $kw52$INPUT_NAME, Sequences.cconcatenate( $str53$term, format_nil.format_nil_a_no_copy( i ) ), $kw60$REQUIRED_, T, $kw61$AUTO_CYCLIFY, T );
      thread.resetMultipleValues();
      v_term = cb_form_widgets.cb_extract_el_term_input( args, options );
      error = thread.secondMultipleValue();
      input_string = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != error )
      {
        return cb_form_widgets.cb_el_term_error( error, input_string, UNPROVIDED );
      }
      terms = ConsesLow.cons( v_term, terms );
    }
    terms = Sequences.nreverse( terms );
    final SubLObject iterator = cb_new_suggested_gafs_for_terms_iterator( terms );
    final SubLObject title_var = $str62$GAF_Suggestions;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str4$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str5$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw6$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw7$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$30 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str10$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str11$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str14$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                cb_utilities.cb_help_preamble( $kw49$CB_GAF_SUGGESTOR, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_princ_strong( $str63$Terms__ );
                SubLObject cdolist_list_var = terms;
                SubLObject v_term2 = NIL;
                v_term2 = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  html_utilities.html_indent( TWO_INTEGER );
                  cb_utilities.cb_show_term( v_term2, UNPROVIDED, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  v_term2 = cdolist_list_var.first();
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_flush();
                SubLObject valid;
                for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
                {
                  thread.resetMultipleValues();
                  final SubLObject gaf = iteration.iteration_next( iterator );
                  valid = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  if( NIL != valid )
                  {
                    html_utilities.html_newline( UNPROVIDED );
                    cb_utilities.cb_link( $kw64$SENTENCE_QUERY_SIMILAR, gaf, $str65$_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( UNPROVIDED );
                    cb_utilities.cb_link( $kw66$ASSERT_FORMULA, gaf, $kw67$UNSPECIFIED, $str68$_Assert_, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_indent( UNPROVIDED );
                    html_utilities.html_indent( TWO_INTEGER );
                    cb_utilities.cb_show_term( gaf, ZERO_INTEGER, NIL );
                    html_utilities.html_flush();
                  }
                }
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$30, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$29, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8578L)
  public static SubLObject cb_new_suggested_gafs_for_terms_iterator(final SubLObject terms)
  {
    return applicable_relations.new_suggested_gafs_for_terms_iterator( terms, $const26$EverythingPSC, ConsesLow.list( $kw70$USAGE_THRESHOLD, THREE_INTEGER, $kw71$ISA_HORIZON, $const72$Individual ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8776L)
  public static SubLObject clear_cb_suggest_gafs_for_terms()
  {
    final SubLObject cs = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8776L)
  public static SubLObject remove_cb_suggest_gafs_for_terms(final SubLObject terms)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue(), ConsesLow.list( terms ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8776L)
  public static SubLObject cb_suggest_gafs_for_terms_internal(final SubLObject terms)
  {
    return applicable_relations.suggest_gafs_for_terms( terms, $const26$EverythingPSC, ConsesLow.list( $kw74$MAX_NUMBER, $int75$100, $kw70$USAGE_THRESHOLD, TEN_INTEGER, $kw71$ISA_HORIZON, $const72$Individual ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-applicable-relations.lisp", position = 8776L)
  public static SubLObject cb_suggest_gafs_for_terms(final SubLObject terms)
  {
    SubLObject caching_state = $cb_suggest_gafs_for_terms_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym73$CB_SUGGEST_GAFS_FOR_TERMS, $sym76$_CB_SUGGEST_GAFS_FOR_TERMS_CACHING_STATE_, TEN_INTEGER, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, terms, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cb_suggest_gafs_for_terms_internal( terms ) ) );
      memoization_state.caching_state_put( caching_state, terms, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_cb_applicable_relations_file()
  {
    SubLFiles.declareFunction( me, "cb_applicable_relations", "CB-APPLICABLE-RELATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_applicable_relations", "CB-LINK-APPLICABLE-RELATIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "old_applicable_relations", "OLD-APPLICABLE-RELATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_gaf_suggestor", "CB-LINK-GAF-SUGGESTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_gaf_suggestor", "CB-GAF-SUGGESTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_gaf_suggestor", "CB-HANDLE-GAF-SUGGESTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_new_suggested_gafs_for_terms_iterator", "CB-NEW-SUGGESTED-GAFS-FOR-TERMS-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cb_suggest_gafs_for_terms", "CLEAR-CB-SUGGEST-GAFS-FOR-TERMS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cb_suggest_gafs_for_terms", "REMOVE-CB-SUGGEST-GAFS-FOR-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_suggest_gafs_for_terms_internal", "CB-SUGGEST-GAFS-FOR-TERMS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_suggest_gafs_for_terms", "CB-SUGGEST-GAFS-FOR-TERMS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_applicable_relations_file()
  {
    $cb_suggest_gafs_for_terms_caching_state$ = SubLFiles.deflexical( "*CB-SUGGEST-GAFS-FOR-TERMS-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_applicable_relations_file()
  {
    Hashtables.sethash( $kw0$CB_APPLICABLE_RELATIONS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str1$cb_applicable_relations_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym30$CB_APPLICABLE_RELATIONS, $kw31$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw34$APPLICABLE_RELATIONS, $sym35$CB_LINK_APPLICABLE_RELATIONS, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw44$GAF_SUGGESTOR, $sym45$CB_LINK_GAF_SUGGESTOR, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym59$CB_GAF_SUGGESTOR, $kw31$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym69$CB_HANDLE_GAF_SUGGESTOR, $kw31$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym73$CB_SUGGEST_GAFS_FOR_TERMS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_applicable_relations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_applicable_relations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_applicable_relations_file();
  }
  static
  {
    me = new cb_applicable_relations();
    $cb_suggest_gafs_for_terms_caching_state$ = null;
    $kw0$CB_APPLICABLE_RELATIONS = makeKeyword( "CB-APPLICABLE-RELATIONS" );
    $str1$cb_applicable_relations_html = makeString( "cb-applicable-relations.html" );
    $str2$Unable_to_determine_a_term_from__ = makeString( "Unable to determine a term from ~S" );
    $str3$Applicable_Relations = makeString( "Applicable Relations" );
    $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str5$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw6$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw7$CB_CYC = makeKeyword( "CB-CYC" );
    $kw8$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw9$SHA1 = makeKeyword( "SHA1" );
    $str10$yui_skin_sam = makeString( "yui-skin-sam" );
    $str11$reloadFrameButton = makeString( "reloadFrameButton" );
    $str12$button = makeString( "button" );
    $str13$reload = makeString( "reload" );
    $str14$Refresh_Frames = makeString( "Refresh Frames" );
    $str15$Relations_which_apply_to_ = makeString( "Relations which apply to " );
    $str16$___ = makeString( " : " );
    $list17 = ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "RELATIONS" ) );
    $const18$SkolemFunction = constant_handles.reader_make_constant_shell( makeString( "SkolemFunction" ) );
    $str19$_dddddd = makeString( "#dddddd" );
    $kw20$GAF_ARG_PREDICATE = makeKeyword( "GAF-ARG-PREDICATE" );
    $sym21$LITERAL_QUERY_NORMAL = makeSymbol( "LITERAL-QUERY-NORMAL" );
    $kw22$MAIN = makeKeyword( "MAIN" );
    $const23$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw24$NART_ARG_FUNCTION = makeKeyword( "NART-ARG-FUNCTION" );
    $sym25$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const26$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const27$NLGenerationFunction = constant_handles.reader_make_constant_shell( makeString( "NLGenerationFunction" ) );
    $kw28$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym29$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym30$CB_APPLICABLE_RELATIONS = makeSymbol( "CB-APPLICABLE-RELATIONS" );
    $kw31$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw32$CONTENT = makeKeyword( "CONTENT" );
    $str33$cb_applicable_relations__A = makeString( "cb-applicable-relations&~A" );
    $kw34$APPLICABLE_RELATIONS = makeKeyword( "APPLICABLE-RELATIONS" );
    $sym35$CB_LINK_APPLICABLE_RELATIONS = makeSymbol( "CB-LINK-APPLICABLE-RELATIONS" );
    $sym36$FORT_P = makeSymbol( "FORT-P" );
    $const37$CycLReifiableDenotationalTerm = constant_handles.reader_make_constant_shell( makeString( "CycLReifiableDenotationalTerm" ) );
    $sym38$_ = makeSymbol( "<" );
    $sym39$SPEC_CARDINALITY = makeSymbol( "SPEC-CARDINALITY" );
    $kw40$GAF = makeKeyword( "GAF" );
    $kw41$TRUE = makeKeyword( "TRUE" );
    $str42$_GAF_Suggestor_ = makeString( "[GAF Suggestor]" );
    $str43$cb_gaf_suggestor = makeString( "cb-gaf-suggestor" );
    $kw44$GAF_SUGGESTOR = makeKeyword( "GAF-SUGGESTOR" );
    $sym45$CB_LINK_GAF_SUGGESTOR = makeSymbol( "CB-LINK-GAF-SUGGESTOR" );
    $str46$GAF_Suggestor = makeString( "GAF Suggestor" );
    $str47$post = makeString( "post" );
    $str48$cb_handle_gaf_suggestor = makeString( "cb-handle-gaf-suggestor" );
    $kw49$CB_GAF_SUGGESTOR = makeKeyword( "CB-GAF-SUGGESTOR" );
    $str50$Suggest_GAFs = makeString( "Suggest GAFs" );
    $str51$Clear = makeString( "Clear" );
    $kw52$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $str53$term = makeString( "term" );
    $kw54$PRETTY_NAME = makeKeyword( "PRETTY-NAME" );
    $str55$Term_ = makeString( "Term " );
    $kw56$COMPLETE_LABEL = makeKeyword( "COMPLETE-LABEL" );
    $str57$Complete = makeString( "Complete" );
    $kw58$HEIGHT = makeKeyword( "HEIGHT" );
    $sym59$CB_GAF_SUGGESTOR = makeSymbol( "CB-GAF-SUGGESTOR" );
    $kw60$REQUIRED_ = makeKeyword( "REQUIRED?" );
    $kw61$AUTO_CYCLIFY = makeKeyword( "AUTO-CYCLIFY" );
    $str62$GAF_Suggestions = makeString( "GAF Suggestions" );
    $str63$Terms__ = makeString( "Terms :" );
    $kw64$SENTENCE_QUERY_SIMILAR = makeKeyword( "SENTENCE-QUERY-SIMILAR" );
    $str65$_Query_ = makeString( "[Query]" );
    $kw66$ASSERT_FORMULA = makeKeyword( "ASSERT-FORMULA" );
    $kw67$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $str68$_Assert_ = makeString( "[Assert]" );
    $sym69$CB_HANDLE_GAF_SUGGESTOR = makeSymbol( "CB-HANDLE-GAF-SUGGESTOR" );
    $kw70$USAGE_THRESHOLD = makeKeyword( "USAGE-THRESHOLD" );
    $kw71$ISA_HORIZON = makeKeyword( "ISA-HORIZON" );
    $const72$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $sym73$CB_SUGGEST_GAFS_FOR_TERMS = makeSymbol( "CB-SUGGEST-GAFS-FOR-TERMS" );
    $kw74$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $int75$100 = makeInteger( 100 );
    $sym76$_CB_SUGGEST_GAFS_FOR_TERMS_CACHING_STATE_ = makeSymbol( "*CB-SUGGEST-GAFS-FOR-TERMS-CACHING-STATE*" );
  }
}
/*
 * 
 * Total time: 732 ms
 * 
 */