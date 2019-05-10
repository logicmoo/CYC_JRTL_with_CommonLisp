package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_similarity
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_similarity";
  public static final String myFingerPrint = "384dc61c359895c5706481624d1d11b245f8a34349cebe0857b3d9932dbee727";
  private static final SubLSymbol $kw0$BLUE_BALL;
  private static final SubLString $str1$blue_gif;
  private static final SubLSymbol $kw2$GREEN_BALL;
  private static final SubLString $str3$green_gif;
  private static final SubLSymbol $kw4$RED_BALL;
  private static final SubLString $str5$red_gif;
  private static final SubLSymbol $kw6$WHITE_BALL;
  private static final SubLString $str7$white_gif;
  private static final SubLSymbol $kw8$YELLOW_BALL;
  private static final SubLString $str9$yellow_gif;
  private static final SubLSymbol $sym10$ST_SIMILARITY_ENTRANCE;
  private static final SubLSymbol $kw11$HTML_HANDLER;
  private static final SubLString $str12$Similarity;
  private static final SubLSymbol $kw13$MAIN;
  private static final SubLString $str14$st_similarity_entrance;
  private static final SubLSymbol $kw15$SIMILARITY;
  private static final SubLSymbol $sym16$CB_LINK_SIMILARITY;
  private static final SubLString $str17$Sim;
  private static final SubLString $str18$Similarity_Tool;
  private static final SubLSymbol $kw19$ST_SIMILARITY;
  private static final SubLString $str20$st_similarity_html;
  private static final SubLString $str21$Similarity_Tool_Choose;
  private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw24$UNINITIALIZED;
  private static final SubLSymbol $kw25$CB_CYC;
  private static final SubLSymbol $kw26$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw27$SHA1;
  private static final SubLString $str28$yui_skin_sam;
  private static final SubLString $str29$reloadFrameButton;
  private static final SubLString $str30$button;
  private static final SubLString $str31$reload;
  private static final SubLString $str32$Refresh_Frames;
  private static final SubLSymbol $kw33$CLEAR_HISTORY;
  private static final SubLString $str34$cg_cb_similarity;
  private static final SubLSymbol $kw35$POST;
  private static final SubLString $str36$cb_similarity;
  private static final SubLString $str37$Run_Similarity_Tool;
  private static final SubLString $str38$Please_choose_two_or_more_constan;
  private static final SubLString $str39$Recent_Constants__;
  private static final SubLString $str40$None;
  private static final SubLString $str41$Recent_NATs__;
  private static final SubLSymbol $sym42$VALID_CONSTANT_;
  private static final SubLSymbol $sym43$VALID_NART_;
  private static final SubLString $str44$the_Similarity_Tool_page;
  private static final SubLString $str45$Cannot_show_similarity_for_just_o;
  private static final SubLSymbol $kw46$NBSP;
  private static final SubLString $str47$Check_or_uncheck_the_boxes_to_mak;
  private static final SubLString $str48$cg;
  private static final SubLString $str49$SimilarityForm;
  private static final SubLString $str50$cb_similarity_assert;
  private static final SubLString $str51$t;
  private static final SubLString $str52$Reset;
  private static final SubLString $str53$Submit;
  private static final SubLSymbol $sym54$CB_SIMILARITY;
  private static final SubLSymbol $kw55$CENTER;
  private static final SubLString $str56$_nbsp_;
  private static final SubLSymbol $kw57$LEFT;
  private static final SubLObject $const58$isa;
  private static final SubLObject $const59$genlPreds;
  private static final SubLObject $const60$genls;
  private static final SubLString $str61$_;
  private static final SubLString $str62$_;
  private static final SubLInteger $int63$32;
  private static final SubLString $str64$_dddddd;
  private static final SubLString $str65$_cccccc;
  private static final SubLString $str66$___;
  private static final SubLString $str67$__A_;
  private static final SubLSymbol $kw68$BASIS;
  private static final SubLSymbol $kw69$IMPLIED;
  private static final SubLSymbol $kw70$ASSERTED;
  private static final SubLString $str71$BIA_;
  private static final SubLString $str72$BI__;
  private static final SubLString $str73$B_A_;
  private static final SubLString $str74$B___;
  private static final SubLString $str75$_IA_;
  private static final SubLString $str76$_I__;
  private static final SubLString $str77$__A_;
  private static final SubLString $str78$____;
  private static final SubLSymbol $kw79$RIGHT;
  private static final SubLString $str80$cg_cb_af__a;
  private static final SubLSymbol $kw81$BOTTOM;
  private static final SubLString $str82$a;
  private static final SubLString $str83$x;
  private static final SubLString $str84$L_E_G_E_N_D;
  private static final SubLString $str85$_;
  private static final SubLString $str86$;
  private static final SubLString $str87$Asserted_in_KB_;
  private static final SubLString $str88$Asserted_in_KB__but_redundant_;
  private static final SubLSymbol $kw89$TOP;
  private static final SubLString $str90$Shown_as_asserted_in_KB_by_a_forw;
  private static final SubLString $str91$Not_asserted_in_KB__but_true_;
  private static final SubLString $str92$Neither_asserted_in_KB_nor_true_;
  private static final SubLInteger $int93$64;
  private static final SubLSymbol $sym94$ASSERT;
  private static final SubLSymbol $sym95$DO_NOTHING;
  private static final SubLSymbol $sym96$UNASSERT;
  private static final SubLString $str97$Asserting____A__A__A__in__A;
  private static final SubLString $str98$Result__;
  private static final SubLString $str99$Unasserting____A__A__A__from__A;
  private static final SubLSymbol $sym100$CB_SIMILARITY_ASSERT;
  private static final SubLString $str101$st__A__A__A__A__A_;
  private static final SubLString $str102$st__A__A__A__A_;
  private static final SubLString $str103$st__A__A__A_;
  private static final SubLString $str104$st__A__A_;
  private static final SubLString $str105$st__A_;
  private static final SubLList $list106;

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 838L)
  public static SubLObject st_similarity_entrance(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return st_similarity_entrance_internal();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 1559L)
  public static SubLObject cb_link_similarity(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str12$Similarity;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw13$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str14$st_similarity_entrance );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 2630L)
  public static SubLObject st_similarity_entrance_internal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str21$Similarity_Tool_Choose;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str22$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str23$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw24$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw25$CB_CYC );
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
          html_utilities.html_markup( $str28$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str29$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str30$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str31$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str32$Refresh_Frames );
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
              cb_utilities.cb_help_preamble( $kw19$ST_SIMILARITY, UNPROVIDED, UNPROVIDED );
              cb_utilities.cb_link( $kw33$CLEAR_HISTORY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              st_similarity_show_recent_history();
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 2931L)
  public static SubLObject st_similarity_show_recent_history()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str34$cg_cb_similarity );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $kw35$POST );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str36$cb_similarity, NIL, UNPROVIDED );
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_submit_input( $str37$Run_Similarity_Tool, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_princ( $str38$Please_choose_two_or_more_constan );
      html_utilities.html_newline( TWO_INTEGER );
      SubLObject items = st_similarity_constant_history_items();
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_princ( $str39$Recent_Constants__ );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      if( NIL != items )
      {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_checkbox_input( cb_utilities.cb_fort_identifier( item ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          cb_utilities.cb_form( item, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      else
      {
        html_utilities.html_princ( $str40$None );
      }
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
      html_utilities.html_princ( $str41$Recent_NATs__ );
      html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      items = st_similarity_nat_history_items();
      if( NIL != items )
      {
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          html_utilities.html_checkbox_input( cb_utilities.cb_fort_identifier( item ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          cb_utilities.cb_form( item, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
      else
      {
        html_utilities.html_princ( $str40$None );
      }
      html_utilities.html_newline( TWO_INTEGER );
      html_utilities.html_submit_input( $str37$Run_Similarity_Tool, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( TWO_INTEGER );
      html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
    }
    finally
    {
      html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
      html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 5898L)
  public static SubLObject st_similarity_constant_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_constant_history$.setDynamicValue( list_utilities.delete_if_not( Symbols.symbol_function( $sym42$VALID_CONSTANT_ ), cb_parameters.$cb_constant_history$.getDynamicValue( thread ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
    return conses_high.copy_list( cb_parameters.$cb_constant_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 6475L)
  public static SubLObject st_similarity_nat_history_items()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_parameters.$cb_nat_history$.setDynamicValue( list_utilities.delete_if_not( Symbols.symbol_function( $sym43$VALID_NART_ ), cb_parameters.$cb_nat_history$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), thread );
    return conses_high.copy_list( cb_parameters.$cb_nat_history$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 6999L)
  public static SubLObject cb_similarity(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str44$the_Similarity_Tool_page );
      return NIL;
    }
    SubLObject fort_list = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isList() )
      {
        final SubLObject fort_spec = arg.first();
        final SubLObject fort = cb_utilities.cb_guess_fort( fort_spec, UNPROVIDED );
        if( NIL != forts.fort_p( fort ) )
        {
          fort_list = ConsesLow.cons( fort, fort_list );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    fort_list = Sequences.nreverse( Sequences.remove_duplicates( fort_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    if( NIL == fort_list.rest() )
    {
      cb_utilities.cb_error( $str45$Cannot_show_similarity_for_just_o, fort_list.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject title_var = $str18$Similarity_Tool;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str22$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str23$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw24$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw25$CB_CYC );
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
        final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str28$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str29$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str30$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str31$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str32$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
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
            cb_utilities.cb_help_preamble( $kw19$ST_SIMILARITY, NIL, UNPROVIDED );
            html_utilities.html_glyph( $kw46$NBSP, UNPROVIDED );
            html_utilities.html_princ( $str47$Check_or_uncheck_the_boxes_to_mak );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str48$cg );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $kw35$POST );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str49$SimilarityForm );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str50$cb_similarity_assert, $str51$t, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str30$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str52$Reset );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                st_html_tree( fort_list, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str53$Submit, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              st_html_legend();
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$6, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 9018L)
  public static SubLObject st_html_td_pipes(final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    SubLObject bgcolor = html_macros.$html_color_light_grey$.getGlobalValue();
    SubLObject grey_toggle = NIL;
    if( n.numG( ZERO_INTEGER ) )
    {
      SubLObject x;
      SubLObject _prev_bind_2;
      for( x = NIL, x = ZERO_INTEGER; x.numL( n ); x = Numbers.add( x, ONE_INTEGER ) )
      {
        bgcolor = ( ( NIL != grey_toggle ) ? html_macros.$html_color_light_grey$.getGlobalValue() : html_macros.$html_color_lighter_grey$.getGlobalValue() );
        if( NIL != grey_toggle )
        {
          grey_toggle = NIL;
        }
        else
        {
          grey_toggle = T;
        }
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw55$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( $str56$_nbsp_ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 9811L)
  public static SubLObject st_html_table_top(final SubLObject cols)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject width = Numbers.add( ONE_INTEGER, Sequences.length( cols ) );
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = cols;
    SubLObject col = NIL;
    col = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        st_html_td_pipes( count );
        final SubLObject span = Numbers.subtract( width, count );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != span )
        {
          html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( span );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw57$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( FOUR_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( col, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      count = Numbers.add( count, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      col = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 10576L)
  public static SubLObject st_html_tree(final SubLObject cols, SubLObject pred, SubLObject mt)
  {
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject span = Sequences.length( cols );
    if( NIL == pred )
    {
      st_html_table_top( cols );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( $const58$isa, $const59$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      SubLObject isa_genlpred = NIL;
      isa_genlpred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        st_html_tree( cols, isa_genlpred, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        isa_genlpred = cdolist_list_var.first();
      }
      st_html_tree( cols, $const58$isa, UNPROVIDED );
      cdolist_list_var = kb_mapping_utilities.pred_values_in_any_mt( $const60$genls, $const59$genlPreds, TWO_INTEGER, ONE_INTEGER, UNPROVIDED );
      SubLObject genls_genlpred = NIL;
      genls_genlpred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        st_html_tree( cols, genls_genlpred, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        genls_genlpred = cdolist_list_var.first();
      }
      st_html_tree( cols, $const60$genls, UNPROVIDED );
      return NIL;
    }
    if( NIL == mt )
    {
      final SubLObject mts = similarity.find_relevant_mts( cols, pred );
      if( NIL != mts )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          st_html_td_pipes( span );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw55$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != html_macros.$html_color_light_purple$.getGlobalValue() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_color_light_purple$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
            cb_utilities.cb_form( pred, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        SubLObject cdolist_list_var2 = mts;
        SubLObject mt_$15 = NIL;
        mt_$15 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          st_html_tree( cols, pred, mt_$15 );
          cdolist_list_var2 = cdolist_list_var2.rest();
          mt_$15 = cdolist_list_var2.first();
        }
      }
      return NIL;
    }
    Hashtables.clrhash( similarity.$similarity_relation_hash$.getDynamicValue( thread ) );
    final SubLObject similarity_tree = similarity.make_similarity_tree( cols, pred, mt );
    if( NIL != similarity_tree )
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        st_html_td_pipes( span );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw55$CENTER ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != html_macros.$html_color_light_blue$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_color_light_blue$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          html_utilities.html_princ( $str61$_ );
          cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ( $str62$_ );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      st_html_print_tree( similarity_tree, cols, pred, mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 13492L)
  public static SubLObject st_html_print_tree(final SubLObject edge_list, final SubLObject cols, final SubLObject pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject node_note_number = Hashtables.make_hash_table( $int63$32, UNPROVIDED, UNPROVIDED );
    SubLObject count = ZERO_INTEGER;
    SubLObject bgcolor = NIL;
    thread.resetMultipleValues();
    final SubLObject node_ordering = similarity.st_order_nodes_in_dag( edge_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject forward_links = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject color_toggle = NIL;
    SubLObject list_var = NIL;
    SubLObject node_with_indent = NIL;
    SubLObject ignore_me = NIL;
    list_var = node_ordering;
    node_with_indent = list_var.first();
    for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), node_with_indent = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
    {
      if( NIL != color_toggle )
      {
        color_toggle = NIL;
      }
      else
      {
        color_toggle = T;
      }
      bgcolor = ( NIL != color_toggle ) ? $str64$_dddddd : $str65$_cccccc;
      final SubLObject node = node_with_indent.first();
      final SubLObject indent = conses_high.second( node_with_indent );
      html_utilities.html_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw46$NBSP, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        st_html_print_node( node, cols, pred, mt );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( !indent.numE( ZERO_INTEGER ) )
          {
            html_utilities.html_glyph( $kw46$NBSP, TWO_INTEGER );
            SubLObject cdotimes_end_var;
            SubLObject i;
            for( cdotimes_end_var = Numbers.multiply( FOUR_INTEGER, Numbers.subtract( indent, ONE_INTEGER ) ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
            {
              html_utilities.html_glyph( $kw46$NBSP, TWO_INTEGER );
            }
            html_utilities.html_princ( $str66$___ );
          }
          html_utilities.html_glyph( $kw46$NBSP, TWO_INTEGER );
          SubLObject cdolist_list_var = similarity.edge_list_node_parents( forward_links, node );
          SubLObject parent = NIL;
          parent = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str67$__A_, Hashtables.gethash( parent, node_note_number, UNPROVIDED ) );
            html_utilities.html_glyph( $kw46$NBSP, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            parent = cdolist_list_var.first();
          }
          cb_utilities.cb_form( node, UNPROVIDED, UNPROVIDED );
          if( NIL != similarity.edge_list_node_children( forward_links, node ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
            Hashtables.sethash( node, node_note_number, count );
            html_utilities.html_glyph( $kw46$NBSP, UNPROVIDED );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str67$__A_, count );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 15106L)
  public static SubLObject st_html_print_node(final SubLObject node, final SubLObject cols, final SubLObject pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject temp_string = NIL;
    SubLObject bgcolor = NIL;
    SubLObject color_toggle = NIL;
    SubLObject list_var = NIL;
    SubLObject c = NIL;
    SubLObject ignore_me = NIL;
    list_var = cols;
    c = list_var.first();
    for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), c = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
    {
      if( NIL != color_toggle )
      {
        color_toggle = NIL;
      }
      else
      {
        color_toggle = T;
      }
      bgcolor = ( NIL != color_toggle ) ? $str64$_dddddd : $str65$_cccccc;
      final SubLObject nodepair = ConsesLow.list( c, node );
      if( NIL != similarity.sim_check_relation( nodepair, $kw68$BASIS ) )
      {
        if( NIL != similarity.sim_check_relation( nodepair, $kw69$IMPLIED ) )
        {
          if( NIL != similarity.sim_check_relation( nodepair, $kw70$ASSERTED ) )
          {
            temp_string = PrintLow.format( NIL, $str71$BIA_ );
          }
          else
          {
            temp_string = PrintLow.format( NIL, $str72$BI__ );
          }
        }
        else if( NIL != similarity.sim_check_relation( nodepair, $kw70$ASSERTED ) )
        {
          temp_string = PrintLow.format( NIL, $str73$B_A_ );
        }
        else
        {
          temp_string = PrintLow.format( NIL, $str74$B___ );
        }
      }
      else if( NIL != similarity.sim_check_relation( nodepair, $kw69$IMPLIED ) )
      {
        if( NIL != similarity.sim_check_relation( nodepair, $kw70$ASSERTED ) )
        {
          temp_string = PrintLow.format( NIL, $str75$_IA_ );
        }
        else
        {
          temp_string = PrintLow.format( NIL, $str76$_I__ );
        }
      }
      else if( NIL != similarity.sim_check_relation( nodepair, $kw70$ASSERTED ) )
      {
        temp_string = PrintLow.format( NIL, $str77$__A_ );
      }
      else
      {
        temp_string = PrintLow.format( NIL, $str78$____ );
      }
      final SubLObject assertedP = similarity.sim_check_relation( nodepair, $kw70$ASSERTED );
      final SubLObject impliedP = similarity.sim_check_relation( nodepair, $kw69$IMPLIED );
      final SubLObject basisP = similarity.sim_check_relation( nodepair, $kw68$BASIS );
      if( NIL != assertedP )
      {
        if( NIL != basisP )
        {
          bgcolor = html_macros.$html_color_light_yellow$.getGlobalValue();
        }
        else
        {
          bgcolor = html_macros.$html_color_light_red$.getGlobalValue();
        }
      }
      else if( NIL != impliedP )
      {
        bgcolor = html_macros.$html_color_light_green$.getGlobalValue();
      }
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != bgcolor )
      {
        html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( bgcolor );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject assertion = kb_indexing.find_gaf( ConsesLow.list( pred, c, node ), mt );
        if( NIL != assertion )
        {
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str80$cg_cb_af__a, assertion_handles.assertion_id( assertion ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.html_assertion_marker( assertion, $kw81$BOTTOM );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        }
        if( NIL != assertedP )
        {
          html_utilities.html_hidden_input( st_make_a_string( pred, mt, node, c, UNPROVIDED ), $str82$a, UNPROVIDED );
        }
        html_utilities.html_checkbox_input( st_make_a_string( pred, mt, node, c, UNPROVIDED ), $str83$x, assertedP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 17670L)
  public static SubLObject st_html_legend()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ONE_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( ZERO_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( THREE_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw55$CENTER ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( FOUR_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str84$L_E_G_E_N_D );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_color_light_yellow$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_color_light_yellow$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_subscript_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( EIGHT_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str85$_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_subscript_tail$.getGlobalValue() );
                html_utilities.html_checkbox_input( $str86$, $str86$, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str87$Asserted_in_KB_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_color_light_red$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_color_light_red$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_subscript_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( EIGHT_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str85$_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_subscript_tail$.getGlobalValue() );
                html_utilities.html_checkbox_input( $str86$, $str86$, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str88$Asserted_in_KB__but_redundant_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_color_light_green$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_color_light_green$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $kw2$GREEN_BALL );
                final SubLObject align = $kw89$TOP;
                final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( $kw2$GREEN_BALL );
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
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
                }
                html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
                html_utilities.html_checkbox_input( $str86$, $str86$, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str90$Shown_as_asserted_in_KB_by_a_forw );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_color_light_green$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_color_light_green$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str86$, $str86$, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str91$Not_asserted_in_KB__but_true_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw79$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_color_lighter_grey$.getGlobalValue() )
              {
                html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_color_lighter_grey$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_checkbox_input( $str86$, $str86$, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str92$Neither_asserted_in_KB_nor_true_ );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 19629L)
  public static SubLObject cb_similarity_assert(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion_hash = Hashtables.make_hash_table( $int93$64, EQUAL, UNPROVIDED );
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str44$the_Similarity_Tool_page );
      return NIL;
    }
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isList() )
      {
        final SubLObject assertion = arg.first();
        final SubLObject indicator = conses_high.second( arg );
        final SubLObject cur_state = Hashtables.gethash( assertion, assertion_hash, UNPROVIDED );
        if( indicator.equal( $str83$x ) )
        {
          if( NIL == cur_state )
          {
            Hashtables.sethash( assertion, assertion_hash, $sym94$ASSERT );
          }
          else
          {
            Hashtables.sethash( assertion, assertion_hash, $sym95$DO_NOTHING );
          }
        }
        if( indicator.equal( $str82$a ) )
        {
          if( NIL == cur_state )
          {
            Hashtables.sethash( assertion, assertion_hash, $sym96$UNASSERT );
          }
          else
          {
            Hashtables.sethash( assertion, assertion_hash, $sym95$DO_NOTHING );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( assertion_hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        thread.resetMultipleValues();
        final SubLObject pred = st_break_a_string( k );
        final SubLObject mt = thread.secondMultipleValue();
        final SubLObject col = thread.thirdMultipleValue();
        final SubLObject v_const = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = v;
        if( pcase_var.eql( $sym94$ASSERT ) )
        {
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str97$Asserting____A__A__A__in__A, new SubLObject[] { pred, v_const, col, mt
          } );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( $str98$Result__ );
          cb_utilities.cb_form( ke.ke_assert_now( ConsesLow.list( pred, v_const, col ), mt, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( TWO_INTEGER );
        }
        else
        {
          if( !pcase_var.eql( $sym96$UNASSERT ) )
          {
            continue;
          }
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str99$Unasserting____A__A__A__from__A, new SubLObject[] { pred, v_const, col, mt
          } );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ( $str98$Result__ );
          cb_utilities.cb_form( ke.ke_unassert_now( ConsesLow.list( pred, v_const, col ), mt ), UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( TWO_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    st_similarity_entrance( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 21714L)
  public static SubLObject st_make_a_string(final SubLObject pred, SubLObject mt, SubLObject col, SubLObject v_const, SubLObject truth)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( col == UNPROVIDED )
    {
      col = NIL;
    }
    if( v_const == UNPROVIDED )
    {
      v_const = NIL;
    }
    if( truth == UNPROVIDED )
    {
      truth = NIL;
    }
    final SubLObject pred_id = cb_utilities.cb_fort_identifier( pred );
    final SubLObject mt_id = cb_utilities.cb_fort_identifier( mt );
    final SubLObject col_id = cb_utilities.cb_fort_identifier( col );
    final SubLObject const_id = cb_utilities.cb_fort_identifier( v_const );
    if( NIL == pred )
    {
      return NIL;
    }
    if( NIL == mt )
    {
      return PrintLow.format( NIL, $str105$st__A_, pred_id );
    }
    if( NIL == col )
    {
      return PrintLow.format( NIL, $str104$st__A__A_, pred_id, mt_id );
    }
    if( NIL == v_const )
    {
      return PrintLow.format( NIL, $str103$st__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id
      } );
    }
    if( NIL != truth )
    {
      return PrintLow.format( NIL, $str101$st__A__A__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id, const_id, truth
      } );
    }
    return PrintLow.format( NIL, $str102$st__A__A__A__A_, new SubLObject[] { pred_id, mt_id, col_id, const_id
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-similarity.lisp", position = 23097L)
  public static SubLObject st_break_a_string(final SubLObject s)
  {
    final SubLObject s_list = string_utilities.string_tokenize( s, $list106, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pred = cb_utilities.cb_guess_fort( ConsesLow.nth( ONE_INTEGER, s_list ), UNPROVIDED );
    final SubLObject mt = cb_utilities.cb_guess_fort( ConsesLow.nth( TWO_INTEGER, s_list ), UNPROVIDED );
    final SubLObject col = cb_utilities.cb_guess_fort( ConsesLow.nth( THREE_INTEGER, s_list ), UNPROVIDED );
    final SubLObject v_const = cb_utilities.cb_guess_fort( ConsesLow.nth( FOUR_INTEGER, s_list ), UNPROVIDED );
    return Values.values( pred, mt, col, v_const );
  }

  public static SubLObject declare_cb_similarity_file()
  {
    SubLFiles.declareFunction( me, "st_similarity_entrance", "ST-SIMILARITY-ENTRANCE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_similarity", "CB-LINK-SIMILARITY", 0, 1, false );
    SubLFiles.declareFunction( me, "st_similarity_entrance_internal", "ST-SIMILARITY-ENTRANCE-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "st_similarity_show_recent_history", "ST-SIMILARITY-SHOW-RECENT-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "st_similarity_constant_history_items", "ST-SIMILARITY-CONSTANT-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "st_similarity_nat_history_items", "ST-SIMILARITY-NAT-HISTORY-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_similarity", "CB-SIMILARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "st_html_td_pipes", "ST-HTML-TD-PIPES", 1, 0, false );
    SubLFiles.declareFunction( me, "st_html_table_top", "ST-HTML-TABLE-TOP", 1, 0, false );
    SubLFiles.declareFunction( me, "st_html_tree", "ST-HTML-TREE", 1, 2, false );
    SubLFiles.declareFunction( me, "st_html_print_tree", "ST-HTML-PRINT-TREE", 4, 0, false );
    SubLFiles.declareFunction( me, "st_html_print_node", "ST-HTML-PRINT-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "st_html_legend", "ST-HTML-LEGEND", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_similarity_assert", "CB-SIMILARITY-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "st_make_a_string", "ST-MAKE-A-STRING", 1, 4, false );
    SubLFiles.declareFunction( me, "st_break_a_string", "ST-BREAK-A-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_similarity_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_similarity_file()
  {
    Hashtables.sethash( $kw0$BLUE_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str1$blue_gif, NIL ) );
    Hashtables.sethash( $kw2$GREEN_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str3$green_gif, NIL ) );
    Hashtables.sethash( $kw4$RED_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str5$red_gif, NIL ) );
    Hashtables.sethash( $kw6$WHITE_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str7$white_gif, NIL ) );
    Hashtables.sethash( $kw8$YELLOW_BALL, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str9$yellow_gif, NIL ) );
    html_macros.note_cgi_handler_function( $sym10$ST_SIMILARITY_ENTRANCE, $kw11$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw15$SIMILARITY, $sym16$CB_LINK_SIMILARITY, ONE_INTEGER );
    cb_utilities.declare_deprecated_cb_tool( $kw15$SIMILARITY, $str12$Similarity, $str17$Sim, $str18$Similarity_Tool );
    Hashtables.sethash( $kw19$ST_SIMILARITY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str20$st_similarity_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym54$CB_SIMILARITY, $kw11$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym100$CB_SIMILARITY_ASSERT, $kw11$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_similarity_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_similarity_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_similarity_file();
  }
  static
  {
    me = new cb_similarity();
    $kw0$BLUE_BALL = makeKeyword( "BLUE-BALL" );
    $str1$blue_gif = makeString( "blue.gif" );
    $kw2$GREEN_BALL = makeKeyword( "GREEN-BALL" );
    $str3$green_gif = makeString( "green.gif" );
    $kw4$RED_BALL = makeKeyword( "RED-BALL" );
    $str5$red_gif = makeString( "red.gif" );
    $kw6$WHITE_BALL = makeKeyword( "WHITE-BALL" );
    $str7$white_gif = makeString( "white.gif" );
    $kw8$YELLOW_BALL = makeKeyword( "YELLOW-BALL" );
    $str9$yellow_gif = makeString( "yellow.gif" );
    $sym10$ST_SIMILARITY_ENTRANCE = makeSymbol( "ST-SIMILARITY-ENTRANCE" );
    $kw11$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str12$Similarity = makeString( "Similarity" );
    $kw13$MAIN = makeKeyword( "MAIN" );
    $str14$st_similarity_entrance = makeString( "st-similarity-entrance" );
    $kw15$SIMILARITY = makeKeyword( "SIMILARITY" );
    $sym16$CB_LINK_SIMILARITY = makeSymbol( "CB-LINK-SIMILARITY" );
    $str17$Sim = makeString( "Sim" );
    $str18$Similarity_Tool = makeString( "Similarity Tool" );
    $kw19$ST_SIMILARITY = makeKeyword( "ST-SIMILARITY" );
    $str20$st_similarity_html = makeString( "st-similarity.html" );
    $str21$Similarity_Tool_Choose = makeString( "Similarity Tool Choose" );
    $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str23$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw24$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw25$CB_CYC = makeKeyword( "CB-CYC" );
    $kw26$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw27$SHA1 = makeKeyword( "SHA1" );
    $str28$yui_skin_sam = makeString( "yui-skin-sam" );
    $str29$reloadFrameButton = makeString( "reloadFrameButton" );
    $str30$button = makeString( "button" );
    $str31$reload = makeString( "reload" );
    $str32$Refresh_Frames = makeString( "Refresh Frames" );
    $kw33$CLEAR_HISTORY = makeKeyword( "CLEAR-HISTORY" );
    $str34$cg_cb_similarity = makeString( "cg?cb-similarity" );
    $kw35$POST = makeKeyword( "POST" );
    $str36$cb_similarity = makeString( "cb-similarity" );
    $str37$Run_Similarity_Tool = makeString( "Run Similarity Tool" );
    $str38$Please_choose_two_or_more_constan = makeString( "Please choose two or more constants." );
    $str39$Recent_Constants__ = makeString( "Recent Constants :" );
    $str40$None = makeString( "None" );
    $str41$Recent_NATs__ = makeString( "Recent NATs :" );
    $sym42$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym43$VALID_NART_ = makeSymbol( "VALID-NART?" );
    $str44$the_Similarity_Tool_page = makeString( "the Similarity Tool page" );
    $str45$Cannot_show_similarity_for_just_o = makeString( "Cannot show similarity for just one constant: ~A." );
    $kw46$NBSP = makeKeyword( "NBSP" );
    $str47$Check_or_uncheck_the_boxes_to_mak = makeString( "Check or uncheck the boxes to make or remove assertions." );
    $str48$cg = makeString( "cg" );
    $str49$SimilarityForm = makeString( "SimilarityForm" );
    $str50$cb_similarity_assert = makeString( "cb-similarity-assert" );
    $str51$t = makeString( "t" );
    $str52$Reset = makeString( "Reset" );
    $str53$Submit = makeString( "Submit" );
    $sym54$CB_SIMILARITY = makeSymbol( "CB-SIMILARITY" );
    $kw55$CENTER = makeKeyword( "CENTER" );
    $str56$_nbsp_ = makeString( "&nbsp;" );
    $kw57$LEFT = makeKeyword( "LEFT" );
    $const58$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const59$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const60$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str61$_ = makeString( "(" );
    $str62$_ = makeString( ")" );
    $int63$32 = makeInteger( 32 );
    $str64$_dddddd = makeString( "#dddddd" );
    $str65$_cccccc = makeString( "#cccccc" );
    $str66$___ = makeString( "|__" );
    $str67$__A_ = makeString( "(~A)" );
    $kw68$BASIS = makeKeyword( "BASIS" );
    $kw69$IMPLIED = makeKeyword( "IMPLIED" );
    $kw70$ASSERTED = makeKeyword( "ASSERTED" );
    $str71$BIA_ = makeString( "BIA " );
    $str72$BI__ = makeString( "BI_ " );
    $str73$B_A_ = makeString( "B_A " );
    $str74$B___ = makeString( "B__ " );
    $str75$_IA_ = makeString( "_IA " );
    $str76$_I__ = makeString( "_I_ " );
    $str77$__A_ = makeString( "__A " );
    $str78$____ = makeString( "___ " );
    $kw79$RIGHT = makeKeyword( "RIGHT" );
    $str80$cg_cb_af__a = makeString( "cg?cb-af&~a" );
    $kw81$BOTTOM = makeKeyword( "BOTTOM" );
    $str82$a = makeString( "a" );
    $str83$x = makeString( "x" );
    $str84$L_E_G_E_N_D = makeString( "L E G E N D" );
    $str85$_ = makeString( "*" );
    $str86$ = makeString( "" );
    $str87$Asserted_in_KB_ = makeString( "Asserted in KB." );
    $str88$Asserted_in_KB__but_redundant_ = makeString( "Asserted in KB, but redundant." );
    $kw89$TOP = makeKeyword( "TOP" );
    $str90$Shown_as_asserted_in_KB_by_a_forw = makeString( "Shown as asserted in KB by a forward rule." );
    $str91$Not_asserted_in_KB__but_true_ = makeString( "Not asserted in KB, but true." );
    $str92$Neither_asserted_in_KB_nor_true_ = makeString( "Neither asserted in KB nor true." );
    $int93$64 = makeInteger( 64 );
    $sym94$ASSERT = makeSymbol( "ASSERT" );
    $sym95$DO_NOTHING = makeSymbol( "DO-NOTHING" );
    $sym96$UNASSERT = makeSymbol( "UNASSERT" );
    $str97$Asserting____A__A__A__in__A = makeString( "Asserting: (~A ~A ~A) in ~A" );
    $str98$Result__ = makeString( "Result: " );
    $str99$Unasserting____A__A__A__from__A = makeString( "Unasserting: (~A ~A ~A) from ~A" );
    $sym100$CB_SIMILARITY_ASSERT = makeSymbol( "CB-SIMILARITY-ASSERT" );
    $str101$st__A__A__A__A__A_ = makeString( "st|~A|~A|~A|~A|~A|" );
    $str102$st__A__A__A__A_ = makeString( "st|~A|~A|~A|~A|" );
    $str103$st__A__A__A_ = makeString( "st|~A|~A|~A|" );
    $str104$st__A__A_ = makeString( "st|~A|~A|" );
    $str105$st__A_ = makeString( "st|~A|" );
    $list106 = ConsesLow.list( makeString( "|" ) );
  }
}
/*
 * 
 * Total time: 772 ms
 * 
 */