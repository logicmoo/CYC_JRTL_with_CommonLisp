package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_user_actions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_user_actions";
  public static final String myFingerPrint = "19414f1e4240ed974a7cff21ec46ededf8ee4d1992d5216f012bc3baa26e9a8f";
  private static final SubLString $str0$_User_Actions_;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLString $str2$cb_show_actions;
  private static final SubLSymbol $kw3$USER_ACTIONS;
  private static final SubLSymbol $sym4$CB_LINK_USER_ACTIONS;
  private static final SubLSymbol $sym5$CB_SHOW_ACTIONS;
  private static final SubLSymbol $kw6$HTML_HANDLER;
  private static final SubLString $str7$User_Actions;
  private static final SubLString $str8$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str9$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw10$UNINITIALIZED;
  private static final SubLSymbol $kw11$CB_CYC;
  private static final SubLSymbol $kw12$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw13$SHA1;
  private static final SubLString $str14$yui_skin_sam;
  private static final SubLString $str15$reloadFrameButton;
  private static final SubLString $str16$button;
  private static final SubLString $str17$reload;
  private static final SubLString $str18$Refresh_Frames;
  private static final SubLString $str19$No_user_actions_;
  private static final SubLString $str20$100_;
  private static final SubLSymbol $kw21$LEFT;
  private static final SubLSymbol $kw22$TOP;
  private static final SubLString $str23$Date;
  private static final SubLString $str24$User;
  private static final SubLString $str25$Action_Description;
  private static final SubLString $str26$Options;
  private static final SubLString $str27$_dddddd;
  private static final SubLString $str28$_cccccc;
  private static final SubLString $str29$___4__0D__2__0D__2__0D__2__0D__2_;
  private static final SubLString $str30$No_summary_fn_for_user_action_of_;
  private static final SubLString $str31$_View_;
  private static final SubLString $str32$cg__A__A;
  private static final SubLSymbol $kw33$NBSP;
  private static final SubLString $str34$cg_cb_delete_user_action__A;
  private static final SubLString $str35$_Abort_;
  private static final SubLSymbol $kw36$USER_ACTION_ID_STRING;
  private static final SubLSymbol $kw37$JUST_STRING;
  private static final SubLSymbol $sym38$CB_DELETE_USER_ACTION;
  private static final SubLString $str39$Fatal_Error;
  private static final SubLString $str40$could_not_find_a_user_action_matc;
  private static final SubLString $str41$could_not_find_a_valid_user_actio;

  @SubLTranslatedFile.SubL(source = "cycl/cb-user-actions.lisp", position = 827L)
  public static SubLObject cb_link_user_actions(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$_User_Actions_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str2$cb_show_actions );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-user-actions.lisp", position = 1158L)
  public static SubLObject cb_show_actions(final SubLObject args)
  {
    return cb_show_actions_internal( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-user-actions.lisp", position = 1448L)
  public static SubLObject cb_show_actions_internal(SubLObject user_action_type_key)
  {
    if( user_action_type_key == UNPROVIDED )
    {
      user_action_type_key = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str7$User_Actions;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str8$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str9$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw10$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw11$CB_CYC );
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
          html_utilities.html_markup( $str14$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str15$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str16$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str17$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str18$Refresh_Frames );
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
            if( NIL == user_actions.$user_actions$.getDynamicValue( thread ) )
            {
              html_utilities.html_princ( $str19$No_user_actions_ );
            }
            else
            {
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ZERO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( THREE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str20$100_ );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $kw21$LEFT );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw22$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str23$Date );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str24$User );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str25$Action_Description );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str26$Options );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                SubLObject bgcolor = NIL;
                SubLObject color_toggle = NIL;
                SubLObject list_var = NIL;
                SubLObject user_action = NIL;
                SubLObject ignore_me = NIL;
                list_var = user_actions.$user_actions$.getDynamicValue( thread );
                user_action = list_var.first();
                for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), user_action = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
                {
                  if( NIL != color_toggle )
                  {
                    color_toggle = NIL;
                  }
                  else
                  {
                    color_toggle = T;
                  }
                  bgcolor = ( NIL != color_toggle ) ? $str27$_dddddd : $str28$_cccccc;
                  if( NIL == user_action_type_key || user_actions.user_action_type_key( user_action ).eql( user_action_type_key ) )
                  {
                    final SubLObject user_action_id_string = user_actions.user_action_id_string( user_action );
                    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                    if( NIL != bgcolor )
                    {
                      html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( bgcolor );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw22$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject creation_time = user_actions.user_action_creation_time( user_action );
                        if( creation_time.isNumber() )
                        {
                          thread.resetMultipleValues();
                          final SubLObject second = Time.decode_universal_time( creation_time, UNPROVIDED );
                          final SubLObject minute = thread.secondMultipleValue();
                          final SubLObject hour = thread.thirdMultipleValue();
                          final SubLObject date = thread.fourthMultipleValue();
                          final SubLObject month = thread.fifthMultipleValue();
                          final SubLObject year = thread.sixthMultipleValue();
                          thread.resetMultipleValues();
                          html_utilities.html_princ( PrintLow.format( NIL, $str29$___4__0D__2__0D__2__0D__2__0D__2_, new SubLObject[] { year, month, date, hour, minute, second
                          } ) );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw22$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject cyclist = user_actions.user_action_cyclist( user_action );
                        if( NIL != cyclist )
                        {
                          cb_utilities.cb_form( cyclist, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw21$LEFT ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw22$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject user_action_summary_fn = user_actions.user_action_summary_fn( user_action );
                        if( NIL != user_action_summary_fn && user_action_summary_fn.isFunctionSpec() )
                        {
                          Functions.funcall( user_action_summary_fn, user_action_id_string );
                        }
                        else
                        {
                          html_utilities.html_princ( $str30$No_summary_fn_for_user_action_of_ );
                          html_utilities.html_princ( user_actions.user_action_type_key( user_action ) );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw22$TOP ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject user_action_display_fn = user_actions.user_action_display_fn( user_action );
                        if( NIL == user_action_display_fn )
                        {
                          html_utilities.html_princ( $str31$_View_ );
                        }
                        else
                        {
                          final SubLObject href = PrintLow.format( NIL, $str32$cg__A__A, user_action_display_fn, user_action_id_string );
                          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( href );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ( $str31$_View_ );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                        }
                        html_utilities.html_glyph( $kw33$NBSP, UNPROVIDED );
                        final SubLObject href = PrintLow.format( NIL, $str34$cg_cb_delete_user_action__A, user_action_id_string );
                        html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                        html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( href );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_princ( $str35$_Abort_ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                  }
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            }
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-user-actions.lisp", position = 3868L)
  public static SubLObject cb_delete_user_action(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    SubLObject user_action_id_string = Hashtables.gethash( $kw36$USER_ACTION_ID_STRING, arghash, UNPROVIDED ).first();
    if( NIL == user_action_id_string )
    {
      user_action_id_string = Hashtables.gethash( $kw37$JUST_STRING, arghash, UNPROVIDED ).first();
    }
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    if( NIL != user_action )
    {
      user_actions.delete_user_action( user_action );
    }
    cb_show_actions_internal( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-user-actions.lisp", position = 4440L)
  public static SubLObject get_user_action_from_arghash(final SubLObject arghash)
  {
    final SubLObject user_action_id_string = hash_table_utilities.gethash_first( $kw36$USER_ACTION_ID_STRING, arghash, UNPROVIDED );
    if( NIL != user_action_id_string )
    {
      final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
      if( NIL != user_actions.user_action_p( user_action ) )
      {
        return user_action;
      }
      cyc_navigator_internals.generic_message_page( $str39$Fatal_Error, PrintLow.format( NIL, $str40$could_not_find_a_user_action_matc ) );
    }
    else
    {
      cyc_navigator_internals.generic_message_page( $str39$Fatal_Error, PrintLow.format( NIL, $str41$could_not_find_a_valid_user_actio ) );
    }
    return NIL;
  }

  public static SubLObject declare_cb_user_actions_file()
  {
    SubLFiles.declareFunction( me, "cb_link_user_actions", "CB-LINK-USER-ACTIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_actions", "CB-SHOW-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_actions_internal", "CB-SHOW-ACTIONS-INTERNAL", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_delete_user_action", "CB-DELETE-USER-ACTION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_user_action_from_arghash", "GET-USER-ACTION-FROM-ARGHASH", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_user_actions_file()
  {
    return NIL;
  }

  public static SubLObject setup_cb_user_actions_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$USER_ACTIONS, $sym4$CB_LINK_USER_ACTIONS, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym5$CB_SHOW_ACTIONS, $kw6$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym38$CB_DELETE_USER_ACTION, $kw6$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_user_actions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_user_actions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_user_actions_file();
  }
  static
  {
    me = new cb_user_actions();
    $str0$_User_Actions_ = makeString( "[User Actions]" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $str2$cb_show_actions = makeString( "cb-show-actions" );
    $kw3$USER_ACTIONS = makeKeyword( "USER-ACTIONS" );
    $sym4$CB_LINK_USER_ACTIONS = makeSymbol( "CB-LINK-USER-ACTIONS" );
    $sym5$CB_SHOW_ACTIONS = makeSymbol( "CB-SHOW-ACTIONS" );
    $kw6$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str7$User_Actions = makeString( "User Actions" );
    $str8$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str9$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw10$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw11$CB_CYC = makeKeyword( "CB-CYC" );
    $kw12$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw13$SHA1 = makeKeyword( "SHA1" );
    $str14$yui_skin_sam = makeString( "yui-skin-sam" );
    $str15$reloadFrameButton = makeString( "reloadFrameButton" );
    $str16$button = makeString( "button" );
    $str17$reload = makeString( "reload" );
    $str18$Refresh_Frames = makeString( "Refresh Frames" );
    $str19$No_user_actions_ = makeString( "No user actions." );
    $str20$100_ = makeString( "100%" );
    $kw21$LEFT = makeKeyword( "LEFT" );
    $kw22$TOP = makeKeyword( "TOP" );
    $str23$Date = makeString( "Date" );
    $str24$User = makeString( "User" );
    $str25$Action_Description = makeString( "Action Description" );
    $str26$Options = makeString( "Options" );
    $str27$_dddddd = makeString( "#dddddd" );
    $str28$_cccccc = makeString( "#cccccc" );
    $str29$___4__0D__2__0D__2__0D__2__0D__2_ = makeString( "~&~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D" );
    $str30$No_summary_fn_for_user_action_of_ = makeString( "No summary-fn for user action of type " );
    $str31$_View_ = makeString( "[View]" );
    $str32$cg__A__A = makeString( "cg?~A&~A" );
    $kw33$NBSP = makeKeyword( "NBSP" );
    $str34$cg_cb_delete_user_action__A = makeString( "cg?cb-delete-user-action&~A" );
    $str35$_Abort_ = makeString( "[Abort]" );
    $kw36$USER_ACTION_ID_STRING = makeKeyword( "USER-ACTION-ID-STRING" );
    $kw37$JUST_STRING = makeKeyword( "JUST-STRING" );
    $sym38$CB_DELETE_USER_ACTION = makeSymbol( "CB-DELETE-USER-ACTION" );
    $str39$Fatal_Error = makeString( "Fatal Error" );
    $str40$could_not_find_a_user_action_matc = makeString( "could not find a user-action matching the user-action-id-string" );
    $str41$could_not_find_a_valid_user_actio = makeString( "could not find a valid user-action-id-string" );
  }
}
/*
 * 
 * Total time: 324 ms
 * 
 */