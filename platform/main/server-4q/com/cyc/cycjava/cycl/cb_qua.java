package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_qua
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_qua";
  public static final String myFingerPrint = "9aa2aa8df6b6371ec92268efe8a5bb0ba55f02e01fe2d218037da4de6af49555";
  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6612L)
  private static SubLSymbol $qua_supported_search_engine_strings$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6697L)
  public static SubLSymbol $qua_supported_search_engines$;
  private static final SubLString $str0$cb_query_augmentation;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLSymbol $kw2$QUERY_AUGMENTATION;
  private static final SubLSymbol $sym3$CB_LINK_QUERY_AUGMENTATION;
  private static final SubLSymbol $kw4$QUA_INPUT;
  private static final SubLString $str5$qua_input;
  private static final SubLString $str6$cb_qua_input;
  private static final SubLSymbol $kw7$QUA_OUTPUT;
  private static final SubLString $str8$quaoutput;
  private static final SubLString $str9$cb_qua_output;
  private static final SubLSymbol $kw10$QUA_RAW_OUTPUT;
  private static final SubLString $str11$quarawoutput;
  private static final SubLString $str12$cb_qua_raw_output;
  private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw15$UNINITIALIZED;
  private static final SubLSymbol $sym16$CB_QUA_RAW_OUTPUT;
  private static final SubLSymbol $kw17$HTML_HANDLER;
  private static final SubLSymbol $sym18$CB_QUA_OUTPUT;
  private static final SubLSymbol $kw19$CB_CYC;
  private static final SubLString $str20$Cycorp_Query_Augmentation;
  private static final SubLString $str21$Cannot_have_a_FRAMESET_tag_inside;
  private static final SubLString $str22$90__10_;
  private static final SubLString $str23$50__50_;
  private static final SubLSymbol $sym24$CB_QUERY_AUGMENTATION;
  private static final SubLString $str25$_id;
  private static final SubLString $str26$_query_text;
  private static final SubLString $str27$_search_engine;
  private static final SubLSymbol $kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL;
  private static final SubLSymbol $kw29$CENTER;
  private static final SubLString $str30$Cyc_Browser;
  private static final SubLString $str31$post;
  private static final SubLString $str32$Query_String__;
  private static final SubLString $str33$_Run_Query_;
  private static final SubLString $str34$parent_quaoutput_location_href___;
  private static final SubLString $str35$__;
  private static final SubLString $str36$parent_quarawoutput_location_href;
  private static final SubLSymbol $sym37$CB_QUA_INPUT;
  private static final SubLSymbol $kw38$TOP;
  private static final SubLString $str39$Specializations_;
  private static final SubLString $str40$Generalizations_;
  private static final SubLString $str41$Related_terms_;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLString $str44$;
  private static final SubLInteger $int45$75;
  private static final SubLString $str46$New_Query;
  private static final SubLString $str47$Search_Engine__;
  private static final SubLString $str48$onChange_javascript_this_form_sub;
  private static final SubLString $str49$Query_Terms__;
  private static final SubLString $str50$__;
  private static final SubLString $str51$_A;
  private static final SubLString $str52$setVisibility___A___inline__;
  private static final SubLString $str53$setVisibility___A___none__;
  private static final SubLList $list54;
  private static final SubLSymbol $kw55$INVISIBLE;
  private static final SubLSymbol $kw56$TEXT;
  private static final SubLString $str57$Synonyms__;
  private static final SubLString $str58$_raw_string;
  private static final SubLString $str59$_;
  private static final SubLString $str60$qua_query_term_id__A__A;

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 721L)
  public static SubLObject cb_link_query_augmentation(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$cb_query_augmentation;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str0$cb_query_augmentation );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1434L)
  public static SubLObject cb_qua_raw_output(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1523L)
  public static SubLObject cb_qua_output(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return args;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1608L)
  public static SubLObject cb_query_augmentation(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw19$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str20$Cycorp_Query_Augmentation );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != html_macros.html_inside_body_p() )
      {
        Errors.error( $str21$Cannot_have_a_FRAMESET_tag_inside );
      }
      html_utilities.html_markup( html_macros.$html_frameset_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_frameset_rows$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str22$90__10_ );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_frame( $kw4$QUA_INPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != html_macros.html_inside_body_p() )
        {
          Errors.error( $str21$Cannot_have_a_FRAMESET_tag_inside );
        }
        html_utilities.html_markup( html_macros.$html_frameset_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_frameset_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str23$50__50_ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_frame( $kw7$QUA_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_utilities.cb_frame( $kw10$QUA_RAW_OUTPUT, args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_frameset_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_frameset_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 2084L)
  public static SubLObject cb_qua_input(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_id_string = html_utilities.html_extract_input( $str25$_id, args );
    final SubLObject query_text = html_utilities.html_extract_input( $str26$_query_text, args );
    final SubLObject v_search_engine = Symbols.make_keyword( html_utilities.html_extract_input( $str27$_search_engine, args ) );
    SubLObject new_query = makeBoolean( !query_id_string.isString() );
    SubLObject query_id = ( NIL == new_query ) ? reader.read_from_string_ignoring_errors( query_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : qua_query.new_augmented_query( query_text, v_search_engine );
    SubLObject query = qua_query.get_augmented_query_for_id( query_id );
    if( NIL != qua_query.augmented_query_p( query ) && query_text.equalp( qua_query.aq_original_phrase( query ) ) && !v_search_engine.eql( qua_query.get_aq_search_engine( query ) ) )
    {
      qua_query.set_aq_search_engine( query, v_search_engine );
    }
    else if( NIL == qua_query.augmented_query_p( query ) || !query_text.equalp( qua_query.aq_original_phrase( query ) ) )
    {
      query_id = qua_query.new_augmented_query( query_text, v_search_engine );
      query = qua_query.get_augmented_query_for_id( query_id );
      new_query = T;
    }
    if( NIL == new_query )
    {
      handle_disambiguation_info( query_id, args );
    }
    html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw19$CB_CYC );
      dhtml_macros.dhtml_with_dom_script();
      dhtml_macros.dhtml_with_toggle_visibility_support();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != color_value )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color_value ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL ) );
                final SubLObject align = $kw29$CENTER;
                final SubLObject alt = $str30$Cyc_Browser;
                final SubLObject border = ZERO_INTEGER;
                html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( image_src );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != alt )
                {
                  html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( alt );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                if( NIL != align )
                {
                  html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( align ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                if( NIL != border )
                {
                  html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( border );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                }
                html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( $str20$Cycorp_Query_Augmentation );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str31$post );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str6$cb_qua_input, T, UNPROVIDED );
            print_query_guts( query_text, v_search_engine );
            print_disambiguation_info( query_id );
            html_utilities.html_hidden_input( $str25$_id, query_id, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject query_string = qua_query.get_search_string_for_query( query );
            if( NIL != string_utilities.non_empty_stringP( query_string ) )
            {
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str32$Query_String__ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_princ( query_string );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( qua_query.get_augmented_query_url( query, UNPROVIDED ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str8$quaoutput );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str33$_Run_Query_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
              }
              html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
            }
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          print_addition_info( query_id );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( NIL, thread );
              html_utilities.html_princ( $str34$parent_quaoutput_location_href___ );
              html_utilities.html_princ( qua_query.get_augmented_query_url( query, UNPROVIDED ) );
              html_utilities.html_princ( $str35$__ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
          }
          html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
          if( NIL != new_query )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( NIL, thread );
                html_utilities.html_princ( $str36$parent_quarawoutput_location_href );
                html_utilities.html_princ( qua_query.get_raw_query_url( query, UNPROVIDED ) );
                html_utilities.html_princ( $str35$__ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
              }
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$3, thread );
      }
      html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 4538L)
  public static SubLObject print_addition_info(final SubLObject query_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query = qua_query.get_augmented_query_for_id( query_id );
    final SubLObject terms = ( NIL != qua_query.augmented_query_p( query ) ) ? qua_query.aq_tokenizations( query ).first() : NIL;
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject specs = qua_query.aq_term_specs( v_term );
        final SubLObject v_genls = qua_query.aq_term_genls( v_term );
        final SubLObject related = qua_query.aq_term_related_terms( v_term );
        if( NIL != specs || NIL != v_genls || NIL != related )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw38$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( THREE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            cb_qua_show_term_in_nl( qua_query.aq_term_preferred_meaning( v_term ) );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( THREE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            if( NIL != specs )
            {
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str39$Specializations_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    SubLObject cdolist_list_var_$20 = specs;
                    SubLObject spec = NIL;
                    spec = cdolist_list_var_$20.first();
                    while ( NIL != cdolist_list_var_$20)
                    {
                      cb_qua_show_term_in_nl( spec );
                      html_utilities.html_newline( UNPROVIDED );
                      cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                      spec = cdolist_list_var_$20.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            if( NIL != v_genls )
            {
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str40$Generalizations_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    SubLObject cdolist_list_var_$21 = v_genls;
                    SubLObject genl = NIL;
                    genl = cdolist_list_var_$21.first();
                    while ( NIL != cdolist_list_var_$21)
                    {
                      cb_qua_show_term_in_nl( genl );
                      html_utilities.html_newline( UNPROVIDED );
                      cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                      genl = cdolist_list_var_$21.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
            if( NIL != related )
            {
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str41$Related_terms_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                    SubLObject cdolist_list_var_$22 = related;
                    SubLObject related_item = NIL;
                    related_item = cdolist_list_var_$22.first();
                    while ( NIL != cdolist_list_var_$22)
                    {
                      cb_qua_show_term_in_nl( related_item );
                      html_utilities.html_newline( UNPROVIDED );
                      cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                      related_item = cdolist_list_var_$22.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6009L)
  public static SubLObject handle_disambiguation_info(final SubLObject query_id, final SubLObject args)
  {
    SubLObject cdolist_list_var;
    final SubLObject options = cdolist_list_var = qua_query.get_all_disambiguation_options( query_id );
    SubLObject option = NIL;
    option = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject option_id = option.first();
      final SubLObject option_id_string = print_high.princ_to_string( option_id );
      final SubLObject value = html_utilities.html_extract_input( option_id_string, args );
      final SubLObject accepted_option = cb_utilities.cb_guess_term( value, UNPROVIDED );
      if( NIL != accepted_option )
      {
        final SubLObject changedP = qua_query.accept_disambiguation_option( query_id, option_id, accepted_option );
      }
      else
      {
        qua_query.reset_ambiguity( query_id, option_id );
      }
      cdolist_list_var = cdolist_list_var.rest();
      option = cdolist_list_var.first();
    }
    return query_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6774L)
  public static SubLObject print_query_guts(SubLObject query_text, SubLObject v_search_engine)
  {
    if( query_text == UNPROVIDED )
    {
      query_text = $str44$;
    }
    if( v_search_engine == UNPROVIDED )
    {
      v_search_engine = NIL;
    }
    html_utilities.html_text_input( $str26$_query_text, query_text, $int45$75 );
    html_utilities.html_submit_input( $str46$New_Query, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str47$Search_Engine__ );
    html_utilities.html_create_dropdown_list( $str27$_search_engine, $qua_supported_search_engine_strings$.getGlobalValue(), $qua_supported_search_engines$.getGlobalValue(), ONE_INTEGER, Sequences.position(
        v_search_engine, $qua_supported_search_engines$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str48$onChange_javascript_this_form_sub );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 7273L)
  public static SubLObject print_disambiguation_info(final SubLObject query_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject disambig_options = qua_query.get_all_disambiguation_options( query_id );
    html_utilities.html_newline( UNPROVIDED );
    if( NIL != disambig_options )
    {
      html_utilities.html_princ( $str49$Query_Terms__ );
    }
    SubLObject cdolist_list_var = disambig_options;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject term_id_string = PrintLow.write_to_string( v_term.first(), EMPTY_SUBL_OBJECT_ARRAY );
      final SubLObject choices = v_term.rest();
      html_utilities.html_princ( $str50$__ );
      if( NIL != list_utilities.lengthE( choices, ONE_INTEGER, UNPROVIDED ) )
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str51$_A, choices.first().first() );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( term_id_string );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ONE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
        html_utilities.html_markup( $str48$onChange_javascript_this_form_sub );
        if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
        {
          html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject cdolist_list_var_$29 = choices;
          SubLObject choice = NIL;
          choice = cdolist_list_var_$29.first();
          while ( NIL != cdolist_list_var_$29)
          {
            final SubLObject choice_string = conses_high.second( choice );
            final SubLObject choice_cycl = choice.first();
            final SubLObject choice_identifier = cb_utilities.cb_term_identifier( choice_cycl );
            final SubLObject dhtml_object_id = cb_make_qua_query_term_object_id( term_id_string, choice_identifier );
            final SubLObject mouse_over = PrintLow.format( NIL, $str52$setVisibility___A___inline__, dhtml_object_id );
            final SubLObject mouse_out = PrintLow.format( NIL, $str53$setVisibility___A___none__, dhtml_object_id );
            html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
            if( NIL != choice_identifier )
            {
              html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( choice_identifier );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_anchor_onmouseout$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( mouse_out );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_anchor_onmouseover$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( mouse_over );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( choice_string );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
            }
            html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
            cdolist_list_var_$29 = cdolist_list_var_$29.rest();
            choice = cdolist_list_var_$29.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    cdolist_list_var = disambig_options;
    v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$30;
      final SubLObject choice_lists = cdolist_list_var_$30 = v_term.rest();
      SubLObject choice2 = NIL;
      choice2 = cdolist_list_var_$30.first();
      while ( NIL != cdolist_list_var_$30)
      {
        SubLObject current;
        final SubLObject datum = current = choice2;
        SubLObject choice_cycl2 = NIL;
        SubLObject choice_string2 = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
        choice_cycl2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
        choice_string2 = current.first();
        current = current.rest();
        if( NIL == current )
        {
          final SubLObject dhtml_object_id2 = cb_make_qua_query_term_object_id( PrintLow.write_to_string( v_term.first(), EMPTY_SUBL_OBJECT_ARRAY ), cb_utilities.cb_term_identifier( choice_cycl2 ) );
          dhtml_macros.dhtml_set_switched_visibility( dhtml_object_id2, $kw55$INVISIBLE, $kw56$TEXT );
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          if( NIL != dhtml_object_id2 )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( dhtml_object_id2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            html_utilities.html_princ( $str57$Synonyms__ );
            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            html_utilities.html_princ( qua_query.qua_all_phrases_for_term_as_string_list( choice_cycl2 ) );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
        }
        cdolist_list_var_$30 = cdolist_list_var_$30.rest();
        choice2 = cdolist_list_var_$30.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 8879L)
  public static SubLObject cb_make_qua_query_term_object_id(final SubLObject query_id, final SubLObject term_id)
  {
    final SubLObject modified_term_id = term_id.isString() ? Sequences.cconcatenate( string_utilities.trim_sides( term_id, Characters.CHAR_quotation ), $str58$_raw_string )
        : PrintLow.write_to_string( term_id, EMPTY_SUBL_OBJECT_ARRAY );
    final SubLObject usable_term_id = string_utilities.remove_substring( modified_term_id, $str59$_ );
    return PrintLow.format( NIL, $str60$qua_query_term_id__A__A, query_id, usable_term_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 9238L)
  public static SubLObject cb_qua_show_term_in_nl(final SubLObject v_term)
  {
    return cb_utilities.cb_show_term_in_nl( v_term, UNPROVIDED );
  }

  public static SubLObject declare_cb_qua_file()
  {
    SubLFiles.declareFunction( me, "cb_link_query_augmentation", "CB-LINK-QUERY-AUGMENTATION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_qua_raw_output", "CB-QUA-RAW-OUTPUT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_qua_output", "CB-QUA-OUTPUT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_query_augmentation", "CB-QUERY-AUGMENTATION", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_qua_input", "CB-QUA-INPUT", 0, 1, false );
    SubLFiles.declareFunction( me, "print_addition_info", "PRINT-ADDITION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_disambiguation_info", "HANDLE-DISAMBIGUATION-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "print_query_guts", "PRINT-QUERY-GUTS", 0, 2, false );
    SubLFiles.declareFunction( me, "print_disambiguation_info", "PRINT-DISAMBIGUATION-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_make_qua_query_term_object_id", "CB-MAKE-QUA-QUERY-TERM-OBJECT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_qua_show_term_in_nl", "CB-QUA-SHOW-TERM-IN-NL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_qua_file()
  {
    $qua_supported_search_engine_strings$ = SubLFiles.defconstant( "*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", $list42 );
    $qua_supported_search_engines$ = SubLFiles.defconstant( "*QUA-SUPPORTED-SEARCH-ENGINES*", $list43 );
    return NIL;
  }

  public static SubLObject setup_cb_qua_file()
  {
    cb_utilities.setup_cb_link_method( $kw2$QUERY_AUGMENTATION, $sym3$CB_LINK_QUERY_AUGMENTATION, ONE_INTEGER );
    cb_utilities.register_cb_frame( $kw4$QUA_INPUT, $str5$qua_input, $str6$cb_qua_input, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cb_utilities.register_cb_frame( $kw7$QUA_OUTPUT, $str8$quaoutput, $str9$cb_qua_output, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    cb_utilities.register_cb_frame( $kw10$QUA_RAW_OUTPUT, $str11$quarawoutput, $str12$cb_qua_raw_output, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_macros.note_cgi_handler_function( $sym16$CB_QUA_RAW_OUTPUT, $kw17$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym18$CB_QUA_OUTPUT, $kw17$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym24$CB_QUERY_AUGMENTATION, $kw17$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym37$CB_QUA_INPUT, $kw17$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_qua_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_qua_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_qua_file();
  }
  static
  {
    me = new cb_qua();
    $qua_supported_search_engine_strings$ = null;
    $qua_supported_search_engines$ = null;
    $str0$cb_query_augmentation = makeString( "cb-query-augmentation" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $kw2$QUERY_AUGMENTATION = makeKeyword( "QUERY-AUGMENTATION" );
    $sym3$CB_LINK_QUERY_AUGMENTATION = makeSymbol( "CB-LINK-QUERY-AUGMENTATION" );
    $kw4$QUA_INPUT = makeKeyword( "QUA-INPUT" );
    $str5$qua_input = makeString( "qua-input" );
    $str6$cb_qua_input = makeString( "cb-qua-input" );
    $kw7$QUA_OUTPUT = makeKeyword( "QUA-OUTPUT" );
    $str8$quaoutput = makeString( "quaoutput" );
    $str9$cb_qua_output = makeString( "cb-qua-output" );
    $kw10$QUA_RAW_OUTPUT = makeKeyword( "QUA-RAW-OUTPUT" );
    $str11$quarawoutput = makeString( "quarawoutput" );
    $str12$cb_qua_raw_output = makeString( "cb-qua-raw-output" );
    $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str14$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw15$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym16$CB_QUA_RAW_OUTPUT = makeSymbol( "CB-QUA-RAW-OUTPUT" );
    $kw17$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $sym18$CB_QUA_OUTPUT = makeSymbol( "CB-QUA-OUTPUT" );
    $kw19$CB_CYC = makeKeyword( "CB-CYC" );
    $str20$Cycorp_Query_Augmentation = makeString( "Cycorp Query Augmentation" );
    $str21$Cannot_have_a_FRAMESET_tag_inside = makeString( "Cannot have a FRAMESET tag inside a BODY tag." );
    $str22$90__10_ = makeString( "90%,10%" );
    $str23$50__50_ = makeString( "50%,50%" );
    $sym24$CB_QUERY_AUGMENTATION = makeSymbol( "CB-QUERY-AUGMENTATION" );
    $str25$_id = makeString( ":id" );
    $str26$_query_text = makeString( ":query-text" );
    $str27$_search_engine = makeString( ":search-engine" );
    $kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL = makeKeyword( "CYC-LOGO-LARGE-VIOLET-FULL-URL" );
    $kw29$CENTER = makeKeyword( "CENTER" );
    $str30$Cyc_Browser = makeString( "Cyc Browser" );
    $str31$post = makeString( "post" );
    $str32$Query_String__ = makeString( "Query String: " );
    $str33$_Run_Query_ = makeString( "[Run Query]" );
    $str34$parent_quaoutput_location_href___ = makeString( "parent.quaoutput.location.href = '" );
    $str35$__ = makeString( "';" );
    $str36$parent_quarawoutput_location_href = makeString( "parent.quarawoutput.location.href = '" );
    $sym37$CB_QUA_INPUT = makeSymbol( "CB-QUA-INPUT" );
    $kw38$TOP = makeKeyword( "TOP" );
    $str39$Specializations_ = makeString( "Specializations:" );
    $str40$Generalizations_ = makeString( "Generalizations:" );
    $str41$Related_terms_ = makeString( "Related terms:" );
    $list42 = ConsesLow.list( makeString( "AltaVista" ), makeString( "Google" ) );
    $list43 = ConsesLow.list( makeKeyword( "ALTAVISTA" ), makeKeyword( "GOOGLE" ) );
    $str44$ = makeString( "" );
    $int45$75 = makeInteger( 75 );
    $str46$New_Query = makeString( "New Query" );
    $str47$Search_Engine__ = makeString( "Search Engine: " );
    $str48$onChange_javascript_this_form_sub = makeString( "onChange=javascript:this.form.submit();" );
    $str49$Query_Terms__ = makeString( "Query Terms: " );
    $str50$__ = makeString( "  " );
    $str51$_A = makeString( "~A" );
    $str52$setVisibility___A___inline__ = makeString( "setVisibility('~A','inline')" );
    $str53$setVisibility___A___none__ = makeString( "setVisibility('~A','none')" );
    $list54 = ConsesLow.list( makeSymbol( "CHOICE-CYCL" ), makeSymbol( "CHOICE-STRING" ) );
    $kw55$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw56$TEXT = makeKeyword( "TEXT" );
    $str57$Synonyms__ = makeString( "Synonyms: " );
    $str58$_raw_string = makeString( "-raw-string" );
    $str59$_ = makeString( " " );
    $str60$qua_query_term_id__A__A = makeString( "qua-query-term-id-~A-~A" );
  }
}
/*
 * 
 * Total time: 463 ms
 * 
 */