package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_ke_file
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.html_ke_file";
  public static final String myFingerPrint = "062e8916cacfb85f7d58b4d2498e8fc39b9f0e5a033087b88af52fef6d6eef52";
  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 645L)
  public static SubLSymbol $remove_non_printing_characters$;
  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 703L)
  public static SubLSymbol $check_for_existing_assertions$;
  private static final SubLSymbol $sym0$_REMOVE_NON_PRINTING_CHARACTERS_;
  private static final SubLSymbol $sym1$_CHECK_FOR_EXISTING_ASSERTIONS_;
  private static final SubLSymbol $kw2$KE_NAME_FILE;
  private static final SubLString $str3$ke_name_file_html;
  private static final SubLString $str4$KE_File;
  private static final SubLString $str5$Load_a_KE_File;
  private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw8$UNINITIALIZED;
  private static final SubLSymbol $kw9$CB_CYC;
  private static final SubLSymbol $kw10$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw11$SHA1;
  private static final SubLString $str12$yui_skin_sam;
  private static final SubLString $str13$reloadFrameButton;
  private static final SubLString $str14$button;
  private static final SubLString $str15$reload;
  private static final SubLString $str16$Refresh_Frames;
  private static final SubLString $str17$post;
  private static final SubLString $str18$handle_ke_file_input;
  private static final SubLSymbol $kw19$SELF;
  private static final SubLString $str20$Back;
  private static final SubLString $str21$Clear;
  private static final SubLString $str22$Load_File;
  private static final SubLString $str23$eval_ke_text;
  private static final SubLString $str24$Project__;
  private static final SubLString $str25$project;
  private static final SubLString $str26$No_project_selected;
  private static final SubLString $str27$Type_in_pathname_of_the_file_to_l;
  private static final SubLString $str28$pathname_radio;
  private static final SubLString $str29$;
  private static final SubLString $str30$pathname;
  private static final SubLInteger $int31$60;
  private static final SubLString $str32$And_select_any_options_;
  private static final SubLString $str33$remove;
  private static final SubLString $str34$_Remove_non_printing_characters_i;
  private static final SubLString $str35$check;
  private static final SubLString $str36$_Check_for_existing_assertions;
  private static final SubLSymbol $sym37$KE_NAME_FILE;
  private static final SubLSymbol $kw38$HTML_HANDLER;
  private static final SubLSymbol $kw39$KE_COMPOSE;
  private static final SubLString $str40$ke_compose_html;
  private static final SubLString $str41$Compose_KE_Text_Expressions;
  private static final SubLString $str42$handle_compose_input;
  private static final SubLString $str43$Cancel_Compose;
  private static final SubLString $str44$Eval;
  private static final SubLString $str45$Type_KE_text_below___;
  private static final SubLString $str46$Include_a_period_after_each_expre;
  private static final SubLString $str47$compose_text;
  private static final SubLString $str48$Complete;
  private static final SubLInteger $int49$80;
  private static final SubLInteger $int50$30;
  private static final SubLString $str51$virtual;
  private static final SubLSymbol $sym52$KE_COMPOSE;
  private static final SubLSymbol $kw53$APPLICATION;
  private static final SubLSymbol $kw54$ALAKU;
  private static final SubLString $str55$use_old_ke_text;
  private static final SubLString $str56$Content_is_in_the_arguments____co;
  private static final SubLString $str57$t;
  private static final SubLString $str58$_filename;
  private static final SubLString $str59$_content;
  private static final SubLString $str60$__check_existing;
  private static final SubLString $str61$check_and_show;
  private static final SubLString $str62$nil;
  private static final SubLString $str63$__project;
  private static final SubLString $str64$File_Access_Problem;
  private static final SubLString $str65$The_file__s_does_not_exist__or_ca;
  private static final SubLString $str66$The_file__A_cannot_be_found____A_;
  private static final SubLSymbol $kw67$INPUT;
  private static final SubLString $str68$Unable_to_open__S;
  private static final SubLString $str69$Pathname_Input_Problem;
  private static final SubLString $str70$Please_try_again__typing_a_non_em;
  private static final SubLSymbol $sym71$HANDLE_KE_FILE_INPUT;
  private static final SubLSymbol $sym72$FROB_COMMENTS;
  private static final SubLSymbol $sym73$NON_LINE_BREAK_CHAR_;
  private static final SubLString $str74$_ke_text;
  private static final SubLSymbol $sym75$HANDLE_COMPOSE_INPUT;
  private static final SubLSymbol $kw76$OK_TOKEN_FORMS;
  private static final SubLSymbol $kw77$MALFORMED;
  private static final SubLString $str78$Please_check_the_input_for_missin;
  private static final SubLSymbol $kw79$UNKNOWNS;
  private static final SubLSymbol $kw80$REPLACE;
  private static final SubLSymbol $kw81$ALREADY_CREATED;
  private static final SubLString $str82$File_Error;
  private static final SubLString $str83$Problem_loading_file__s___The_fil;
  private static final SubLString $str84$Input_Error;
  private static final SubLString $str85$The_input_text_contains_fatal_syn;
  private static final SubLSymbol $sym86$KE_SIGNAL_INPUT_ERROR_2;
  private static final SubLString $str87$Unknown_Constants;
  private static final SubLString $str88$Make_Cyc_constants_of_the_followi;
  private static final SubLString $str89$If_so__be_sure_that_you_have_spec;
  private static final SubLSymbol $kw90$CONSTANTIFY;
  private static final SubLSymbol $sym91$KE_UNKNOWNS_ALERT;
  private static final SubLString $str92$Waiting_for_Constant_Creations;
  private static final SubLString $str93$Waiting_for_constant_creations_to;
  private static final SubLString $str94$There_are_;
  private static final SubLString $str95$_operations_still_to_be_processed;
  private static final SubLString $str96$Click_;
  private static final SubLSymbol $kw97$CHECK_AND_POLL;
  private static final SubLString $str98$_to_proceed_when_you_think_you_ve;
  private static final SubLSymbol $sym99$KE_CHECK_AND_POLL;
  private static final SubLSymbol $sym100$KE_CONSTANTIFY;
  private static final SubLString $str101$There_is_a_problem_that_may_requi;
  private static final SubLString $str102$Possibly_Malformed_Token_Lists;
  private static final SubLString $str103$_s;
  private static final SubLString $str104$_in_;
  private static final SubLString $str105$_is_not_in_;
  private static final SubLString $str106$_a_form_a_to_evaluate_;
  private static final SubLString $str107$One;
  private static final SubLString $str108$__a;
  private static final SubLString $str109$s;
  private static final SubLSymbol $kw110$KE_EVAL;
  private static final SubLSymbol $kw111$MAIN;
  private static final SubLString $str112$Evaluate_the_a_form_a_below;
  private static final SubLString $str113$Evaluate_the_a_form_a_above;
  private static final SubLSymbol $kw114$FORMS_TO_EVAL;
  private static final SubLSymbol $kw115$ALREADY_IN_KB;
  private static final SubLSymbol $kw116$NOT_IN_KB;
  private static final SubLSymbol $kw117$NOT_VALID_CONSTANTS;
  private static final SubLSymbol $kw118$ALREADY_CONSTANTS;
  private static final SubLString $str119$Check_Forms_to_Eval;
  private static final SubLString $str120$Apparently_you_have_specified_no_;
  private static final SubLString $str121$These_assertions_are_already_in_t;
  private static final SubLString $str122$These_assertions_are_not_in_the_K;
  private static final SubLString $str123$These_strings_are_not_names_of_va;
  private static final SubLString $str124$These_strings_are_already_the_nam;
  private static final SubLString $str125$State_has_been_cleared___There_ar;
  private static final SubLString $str126$_a_form_a_ha_a_been_evaluated_;
  private static final SubLString $str127$ve;
  private static final SubLString $str128$State_has_been_cleared___No_forms;
  private static final SubLString $str129$KE_Evaluation_Notification;
  private static final SubLSymbol $sym130$KE_EVAL;

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 759L)
  public static SubLObject ke_name_file(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str4$KE_File );
    }
    else
    {
      final SubLObject title_var = $str5$Load_a_KE_File;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
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
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str17$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str18$handle_ke_file_input, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw2$KE_NAME_FILE, NIL, UNPROVIDED );
                cb_utilities.cb_back_button( $kw19$SELF, $str20$Back );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str21$Clear );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str22$Load_File, $str23$eval_ke_text, UNPROVIDED );
                final SubLObject projects = kb_utilities.sort_terms( cb_system_tools.ongoing_cyc_projects(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                if( NIL != projects )
                {
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str24$Project__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  cb_utilities.cb_fort_list_selector( $str25$project, projects, ( NIL != api_control_vars.$ke_purpose$.getDynamicValue( thread ) ) ? api_control_vars.$ke_purpose$.getDynamicValue( thread ) : NIL,
                      ONE_INTEGER, Symbols.symbol_function( IDENTITY ), T, $str26$No_project_selected );
                }
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str27$Type_in_pathname_of_the_file_to_l );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_radio_input( $str28$pathname_radio, $str29$, T, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_filename_input( $str30$pathname, $str29$, $int31$60 );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str32$And_select_any_options_ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_checkbox_input( $str33$remove, $str33$remove, $remove_non_printing_characters$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str34$_Remove_non_printing_characters_i );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_indent( FIVE_INTEGER );
                html_utilities.html_checkbox_input( $str35$check, $str35$check, $check_for_existing_assertions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str36$_Check_for_existing_assertions );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str21$Clear );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str22$Load_File, $str23$eval_ke_text, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 3691L)
  public static SubLObject ke_compose(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str4$KE_File );
    }
    else
    {
      final SubLObject title_var = $str41$Compose_KE_Text_Expressions;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw10$SAM_AUTOCOMPLETE_CSS );
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
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
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
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str17$post );
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
                html_utilities.html_hidden_input( $str42$handle_compose_input, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw39$KE_COMPOSE, NIL, UNPROVIDED );
                cb_utilities.cb_back_button( $kw19$SELF, $str43$Cancel_Compose );
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_submit_input( $str44$Eval, $str23$eval_ke_text, UNPROVIDED );
                final SubLObject projects = kb_utilities.sort_terms( cb_system_tools.ongoing_cyc_projects(), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                if( NIL != projects )
                {
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str24$Project__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  cb_utilities.cb_fort_list_selector( $str25$project, projects, ( NIL != api_control_vars.$ke_purpose$.getDynamicValue( thread ) ) ? api_control_vars.$ke_purpose$.getDynamicValue( thread ) : NIL,
                      ONE_INTEGER, Symbols.symbol_function( IDENTITY ), T, $str26$No_project_selected );
                }
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str45$Type_KE_text_below___ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_emphasized_head$.getGlobalValue() );
                html_utilities.html_princ( $str46$Include_a_period_after_each_expre );
                html_utilities.html_markup( html_macros.$html_emphasized_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( ZERO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_reset_input( $str21$Clear );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_complete.html_complete_button( $str47$compose_text, $str48$Complete, NIL, NIL, NIL, NIL, cb_form_widgets.$legacy_sentence_editor_class$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_indent( FIVE_INTEGER );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_checkbox_input( $str33$remove, $str33$remove, $remove_non_printing_characters$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str34$_Remove_non_printing_characters_i );
                      html_utilities.html_newline( UNPROVIDED );
                      html_utilities.html_checkbox_input( $str35$check, $str35$check, $check_for_existing_assertions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str36$_Check_for_existing_assertions );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                if( NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue( thread ) )
                {
                  html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str47$compose_text );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $int49$80 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $int50$30 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_wrap$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str51$virtual );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
                }
                else
                {
                  html_utilities.html_markup( html_macros.$html_textarea_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_textarea_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str47$compose_text );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_textarea_cols$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $int49$80 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_textarea_rows$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $int50$30 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue() )
                  {
                    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( cb_form_widgets.$ke_text_code_editor_textarea_class$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_textarea_tail$.getGlobalValue() );
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_script_utilities.html_ke_text_editor_enable_editors();
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 5610L)
  public static SubLObject init_ke_state()
  {
    if( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw53$APPLICATION ).equal( $kw54$ALAKU ) )
    {
      ke_file.blast_ke_state();
    }
    return ke_file.ke_init( operation_communication.the_cyclist() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 5610L)
  public static SubLObject handle_ke_file_input(final SubLObject args)
  {
    init_ke_state();
    final SubLObject pathname_field = $str30$pathname;
    SubLObject pathname = string_utilities.trim_whitespace( html_utilities.html_extract_input( pathname_field, args ) );
    final SubLObject pathname_radio = html_utilities.html_extract_input( $str28$pathname_radio, args );
    final SubLObject remove = html_utilities.html_extract_input( $str33$remove, args );
    final SubLObject check = html_utilities.html_extract_input( $str35$check, args );
    final SubLObject project = html_utilities.html_extract_input( $str25$project, args );
    final SubLObject content_in_argsP = html_utilities.html_arguments_contain_multipart_form_dataP( args );
    final SubLObject potential_content = html_utilities.html_extract_input( html_utilities.generate_html_filename_input_fieldname( pathname_field ), args );
    final SubLObject use_new_ke_textP = Types.sublisp_null( html_utilities.html_extract_input( $str55$use_old_ke_text, args ) );
    if( NIL != string_utilities.non_empty_stringP( pathname_radio ) )
    {
      pathname = pathname_radio;
    }
    if( NIL != use_new_ke_textP )
    {
      if( NIL != content_in_argsP )
      {
        Errors.warn( $str56$Content_is_in_the_arguments____co, pathname );
        cb_ke_text.cb_handle_ke_text_file( ConsesLow.list( $str57$t, ConsesLow.list( $str58$_filename, pathname ), ConsesLow.list( $str59$_content, potential_content ), ConsesLow.list( $str60$__check_existing,
            ( NIL != check ) ? $str61$check_and_show : $str62$nil ), ConsesLow.list( $str63$__project, project ) ) );
      }
      else if( NIL != string_utilities.null_stringP( pathname ) )
      {
        cyc_navigator_internals.generic_message_page( $str64$File_Access_Problem, PrintLow.format( NIL, $str65$The_file__s_does_not_exist__or_ca, pathname ) );
      }
      else if( NIL == Filesys.probe_file( pathname ) )
      {
        cyc_navigator_internals.generic_message_page( $str64$File_Access_Problem, PrintLow.format( NIL, $str66$The_file__A_cannot_be_found____A_, pathname, file_utilities.why_not_probe_fileP( pathname ) ) );
      }
      else
      {
        cb_ke_text.cb_handle_ke_text_file( ConsesLow.list( $str57$t, ConsesLow.list( $str58$_filename, pathname ), ConsesLow.list( $str60$__check_existing, ( NIL != check ) ? $str61$check_and_show : $str62$nil ),
            ConsesLow.list( $str63$__project, project ) ) );
      }
    }
    else if( NIL != string_utilities.non_empty_stringP( pathname ) && NIL != Filesys.probe_file( pathname ) )
    {
      $remove_non_printing_characters$.setDynamicValue( Equality.equalp( remove, $str33$remove ) );
      $check_for_existing_assertions$.setDynamicValue( Equality.equalp( check, $str35$check ) );
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw67$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str68$Unable_to_open__S, pathname );
        }
        final SubLObject str = stream;
        ke_file.tokenize_read( str, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      ke_check_and_maybe_cyclify( pathname );
    }
    else if( NIL != string_utilities.non_empty_stringP( pathname ) )
    {
      cyc_navigator_internals.generic_message_page( $str64$File_Access_Problem, PrintLow.format( NIL, $str65$The_file__s_does_not_exist__or_ca, pathname ) );
    }
    else
    {
      cyc_navigator_internals.generic_message_page( $str69$Pathname_Input_Problem, PrintLow.format( NIL, $str70$Please_try_again__typing_a_non_em, pathname ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 5610L)
  public static SubLObject non_line_break_charP(final SubLObject ch)
  {
    return makeBoolean( NIL == ke_file.lbrP( ch ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 5610L)
  public static SubLObject ke_text_handle_comments(final SubLObject input_text)
  {
    return string_utilities.bunge( Mapping.mapcar( Symbols.symbol_function( $sym72$FROB_COMMENTS ), string_utilities.break_words( input_text, Symbols.symbol_function( $sym73$NON_LINE_BREAK_CHAR_ ), UNPROVIDED ) ),
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 8489L)
  public static SubLObject handle_compose_input(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    init_ke_state();
    final SubLObject check = html_utilities.html_extract_input( $str35$check, args );
    final SubLObject project = html_utilities.html_extract_input( $str25$project, args );
    SubLObject compose_text = html_utilities.html_extract_input( $str47$compose_text, args );
    final SubLObject use_new_ke_textP = Types.sublisp_null( html_utilities.html_extract_input( $str55$use_old_ke_text, args ) );
    if( NIL != use_new_ke_textP )
    {
      cb_ke_text.cb_handle_ke_text_compose( ConsesLow.list( $str57$t, ConsesLow.list( $str74$_ke_text, compose_text ), ConsesLow.list( $str60$__check_existing, ( NIL != check ) ? $str61$check_and_show : $str62$nil ),
          ConsesLow.list( $str63$__project, project ) ) );
    }
    else
    {
      final SubLObject remove = html_utilities.html_extract_input( $str33$remove, args );
      SubLObject text = NIL;
      $remove_non_printing_characters$.setDynamicValue( Equality.equalp( remove, $str33$remove ), thread );
      $check_for_existing_assertions$.setDynamicValue( Equality.equalp( check, $str35$check ), thread );
      if( NIL == compose_text )
      {
        compose_text = $str29$;
      }
      text = ke_text_handle_comments( compose_text );
      text = ke_utilities.strip_garbage_chars( text, $remove_non_printing_characters$.getDynamicValue( thread ) );
      ke_file.tokenize_read( text, UNPROVIDED );
      ke_check_and_maybe_cyclify( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_check_and_maybe_cyclify(SubLObject string)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    final SubLObject ok = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw76$OK_TOKEN_FORMS );
    final SubLObject malformed = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw77$MALFORMED );
    if( NIL == ok && NIL == malformed )
    {
      ke_signal_input_error( string );
    }
    else if( NIL != malformed )
    {
      ke_problem_alert( $str78$Please_check_the_input_for_missin );
    }
    else
    {
      final SubLObject unknowns = ke_file.unknown_constants_among_tokens( ok );
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS, $kw80$REPLACE, unknowns );
      if( NIL != ke_utilities.ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS ) && NIL != conses_high.set_difference( ke_utilities.ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS ),
          ke_utilities.ke_value( operation_communication.the_cyclist(), $kw81$ALREADY_CREATED ), Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
      {
        ke_unknowns_alert( UNPROVIDED );
      }
      else
      {
        ke_cyclify_forms();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_signal_input_error_1(final SubLObject string)
  {
    cyc_navigator_internals.generic_message_page( $str82$File_Error, PrintLow.format( NIL, $str83$Problem_loading_file__s___The_fil, string ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_signal_input_error_2(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    cyc_navigator_internals.generic_message_page( $str84$Input_Error, PrintLow.format( NIL, $str85$The_input_text_contains_fatal_syn ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_signal_input_error(SubLObject string)
  {
    if( string == UNPROVIDED )
    {
      string = NIL;
    }
    if( NIL != string )
    {
      ke_signal_input_error_1( string );
    }
    else
    {
      ke_signal_input_error_2( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_unknowns_alert(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str87$Unknown_Constants;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$19 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
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
        final SubLObject _prev_bind_0_$20 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
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
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw39$KE_COMPOSE, NIL, UNPROVIDED );
              cb_utilities.cb_back_button( $kw19$SELF, $str20$Back );
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str88$Make_Cyc_constants_of_the_followi );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ_doc_string( $str89$If_so__be_sure_that_you_have_spec, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              cyc_navigator_internals.nav_link( $kw90$CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              SubLObject cdolist_list_var;
              final SubLObject unknowns = cdolist_list_var = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS );
              SubLObject string = NIL;
              string = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_prin1( string );
                html_utilities.html_newline( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                string = cdolist_list_var.first();
              }
              if( Sequences.length( unknowns ).numG( TEN_INTEGER ) )
              {
                html_utilities.html_newline( UNPROVIDED );
                cyc_navigator_internals.nav_link( $kw90$CONSTANTIFY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_utilities.html_newline( TWO_INTEGER );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$19, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_check_and_poll(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject unknowns = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS );
    if( NIL != ke_file.unknown_constants_in_listP( unknowns ) )
    {
      final SubLObject title_var = $str92$Waiting_for_Constant_Creations;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$24 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw9$CB_CYC );
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
            html_utilities.html_markup( $str12$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str13$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str14$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str15$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str16$Refresh_Frames );
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
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                cb_utilities.cb_help_preamble( $kw39$KE_COMPOSE, NIL, UNPROVIDED );
                cb_utilities.cb_back_button( $kw19$SELF, $str20$Back );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_princ( $str93$Waiting_for_constant_creations_to );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_princ( $str94$There_are_ );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( operation_queues.local_queue_size() );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_princ( $str95$_operations_still_to_be_processed );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_princ( $str96$Click_ );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                cyc_navigator_internals.nav_link( $kw97$CHECK_AND_POLL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_princ( $str98$_to_proceed_when_you_think_you_ve );
                html_utilities.html_newline( TWO_INTEGER );
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
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS, UNPROVIDED, UNPROVIDED );
      ke_cyclify_forms();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_constantify(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject unknowns = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS );
    final SubLObject already_created = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw81$ALREADY_CREATED );
    if( NIL != unknowns && NIL != conses_high.set_difference( unknowns, already_created, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      ke_utilities.constantify( unknowns );
    }
    if( NIL != ke_file.unknown_constants_in_listP( unknowns ) )
    {
      ke_check_and_poll( UNPROVIDED );
    }
    else
    {
      ke_utilities.change_ke_value( operation_communication.the_cyclist(), $kw79$UNKNOWNS, UNPROVIDED, UNPROVIDED );
      ke_cyclify_forms();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_cyclify_forms()
  {
    ke_file.build_eval_form_list();
    final SubLObject problems = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw77$MALFORMED );
    if( NIL != problems )
    {
      ke_problem_alert( $str101$There_is_a_problem_that_may_requi );
    }
    else
    {
      final SubLObject pcase_var = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw53$APPLICATION );
      ke_check_forms_to_eval();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_problem_alert(final SubLObject message)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str102$Possibly_Malformed_Token_Lists;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
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
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
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
            html_utilities.html_princ( message );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            SubLObject cdolist_list_var = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw77$MALFORMED );
            SubLObject tl = NIL;
            tl = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_princ( tl );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              tl = cdolist_list_var.first();
            }
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

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_print_forms_1(final SubLObject forms, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forms )
    {
      if( NIL != string_utilities.non_empty_stringP( message ) )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( message );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
      }
      SubLObject cdolist_list_var = forms;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_indent( THREE_INTEGER );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str103$_s, x );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_print_forms_2(final SubLObject ids, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( NIL != ids )
    {
      if( NIL != string_utilities.non_empty_stringP( message ) )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( message );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
      }
      SubLObject cdolist_list_var = ids;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject ass = assertion_handles.find_assertion_by_id( x );
        final SubLObject mt = assertions_high.assertion_mt( ass );
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_form( ass, ZERO_INTEGER, T );
        html_utilities.html_princ( $str104$_in_ );
        cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_print_forms_3(final SubLObject forms, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = NIL;
    }
    if( NIL != forms )
    {
      if( NIL != string_utilities.non_empty_stringP( message ) )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        html_utilities.html_princ( message );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        html_utilities.html_newline( UNPROVIDED );
      }
      SubLObject cdolist_list_var = forms;
      SubLObject x = NIL;
      x = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_form( x.first(), ZERO_INTEGER, T );
        html_utilities.html_princ( $str105$_is_not_in_ );
        cb_utilities.cb_form( conses_high.second( x ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        x = cdolist_list_var.first();
      }
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_present_forms_to_eval(final SubLObject forms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != forms )
    {
      final SubLObject len = Sequences.length( forms );
      html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str106$_a_form_a_to_evaluate_, len.numE( ONE_INTEGER ) ? $str107$One : PrintLow.format( NIL, $str108$__a, len ), len.numE( ONE_INTEGER )
          ? $str29$
          : $str109$s );
      html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      cyc_navigator_internals.nav_link( $kw110$KE_EVAL, NIL, $kw111$MAIN, PrintLow.format( NIL, $str112$Evaluate_the_a_form_a_below, len.numE( ONE_INTEGER ) ? $str29$ : PrintLow.format( NIL, $str108$__a, len ), len.numE(
          ONE_INTEGER ) ? $str29$ : $str109$s ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      SubLObject cdolist_list_var = forms;
      SubLObject f = NIL;
      f = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_form( f, ZERO_INTEGER, T );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        f = cdolist_list_var.first();
      }
      html_utilities.html_newline( UNPROVIDED );
      cyc_navigator_internals.nav_link( $kw110$KE_EVAL, NIL, $kw111$MAIN, PrintLow.format( NIL, $str113$Evaluate_the_a_form_a_above, len.numE( ONE_INTEGER ) ? $str29$ : PrintLow.format( NIL, $str108$__a, len ), len.numE(
          ONE_INTEGER ) ? $str29$ : $str109$s ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_check_forms_to_eval()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject forms_to_eval = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw114$FORMS_TO_EVAL );
    final SubLObject already_in_kb = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw115$ALREADY_IN_KB );
    final SubLObject not_in_kb = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw116$NOT_IN_KB );
    final SubLObject not_valid_constants = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw117$NOT_VALID_CONSTANTS );
    final SubLObject already_constants = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw118$ALREADY_CONSTANTS );
    final SubLObject title_var = $str119$Check_Forms_to_Eval;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str6$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str7$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw8$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw9$CB_CYC );
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
        final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str12$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str13$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str14$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str15$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str16$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
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
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              cb_utilities.cb_help_preamble( $kw39$KE_COMPOSE, NIL, UNPROVIDED );
              cb_utilities.cb_back_button( $kw19$SELF, $str20$Back );
              html_utilities.html_indent( TWO_INTEGER );
              if( NIL != already_in_kb && NIL == forms_to_eval )
              {
                html_utilities.html_princ( $str120$Apparently_you_have_specified_no_ );
                html_utilities.html_newline( TWO_INTEGER );
              }
              ke_print_forms_2( already_in_kb, PrintLow.format( NIL, $str121$These_assertions_are_already_in_t, control_vars.cyc_image_id() ) );
              ke_print_forms_3( not_in_kb, PrintLow.format( NIL, $str122$These_assertions_are_not_in_the_K, control_vars.cyc_image_id() ) );
              ke_print_forms_1( not_valid_constants, $str123$These_strings_are_not_names_of_va );
              ke_print_forms_1( already_constants, $str124$These_strings_are_already_the_nam );
              ke_present_forms_to_eval( forms_to_eval );
              if( NIL == forms_to_eval && NIL == already_in_kb && NIL == not_in_kb && NIL == not_valid_constants && NIL == already_constants )
              {
                html_utilities.html_princ( $str125$State_has_been_cleared___There_ar );
              }
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$34, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$33, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/html-ke-file.lisp", position = 9722L)
  public static SubLObject ke_eval(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject forms = ke_utilities.ke_value( operation_communication.the_cyclist(), $kw114$FORMS_TO_EVAL );
    final SubLObject len = Sequences.length( forms );
    SubLObject cdolist_list_var = forms;
    SubLObject f = NIL;
    f = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Eval.eval( f );
      cdolist_list_var = cdolist_list_var.rest();
      f = cdolist_list_var.first();
    }
    ke_file.reset_ke_state( operation_communication.the_cyclist() );
    SubLObject message = NIL;
    if( len.numGE( ONE_INTEGER ) )
    {
      message = PrintLow.format( NIL, $str126$_a_form_a_ha_a_been_evaluated_, new SubLObject[] { len.numE( ONE_INTEGER ) ? $str107$One : len, len.numE( ONE_INTEGER ) ? $str29$ : $str109$s, len.numE( ONE_INTEGER )
          ? $str109$s
          : $str127$ve
      } );
    }
    else
    {
      message = $str128$State_has_been_cleared___No_forms;
    }
    cyc_navigator_internals.generic_message_page( $str129$KE_Evaluation_Notification, message );
    return NIL;
  }

  public static SubLObject declare_html_ke_file_file()
  {
    SubLFiles.declareFunction( me, "ke_name_file", "KE-NAME-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_compose", "KE-COMPOSE", 0, 1, false );
    SubLFiles.declareFunction( me, "init_ke_state", "INIT-KE-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "handle_ke_file_input", "HANDLE-KE-FILE-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "non_line_break_charP", "NON-LINE-BREAK-CHAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_text_handle_comments", "KE-TEXT-HANDLE-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_compose_input", "HANDLE-COMPOSE-INPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_check_and_maybe_cyclify", "KE-CHECK-AND-MAYBE-CYCLIFY", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_signal_input_error_1", "KE-SIGNAL-INPUT-ERROR-1", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_signal_input_error_2", "KE-SIGNAL-INPUT-ERROR-2", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_signal_input_error", "KE-SIGNAL-INPUT-ERROR", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_unknowns_alert", "KE-UNKNOWNS-ALERT", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_check_and_poll", "KE-CHECK-AND-POLL", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_constantify", "KE-CONSTANTIFY", 0, 1, false );
    SubLFiles.declareFunction( me, "ke_cyclify_forms", "KE-CYCLIFY-FORMS", 0, 0, false );
    SubLFiles.declareFunction( me, "ke_problem_alert", "KE-PROBLEM-ALERT", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_print_forms_1", "KE-PRINT-FORMS-1", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_print_forms_2", "KE-PRINT-FORMS-2", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_print_forms_3", "KE-PRINT-FORMS-3", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_present_forms_to_eval", "KE-PRESENT-FORMS-TO-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "ke_check_forms_to_eval", "KE-CHECK-FORMS-TO-EVAL", 0, 0, false );
    SubLFiles.declareFunction( me, "ke_eval", "KE-EVAL", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_html_ke_file_file()
  {
    $remove_non_printing_characters$ = SubLFiles.defparameter( "*REMOVE-NON-PRINTING-CHARACTERS*", NIL );
    $check_for_existing_assertions$ = SubLFiles.defparameter( "*CHECK-FOR-EXISTING-ASSERTIONS*", NIL );
    return NIL;
  }

  public static SubLObject setup_html_ke_file_file()
  {
    utilities_macros.register_html_state_variable( $sym0$_REMOVE_NON_PRINTING_CHARACTERS_ );
    utilities_macros.register_html_state_variable( $sym1$_CHECK_FOR_EXISTING_ASSERTIONS_ );
    Hashtables.sethash( $kw2$KE_NAME_FILE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str3$ke_name_file_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym37$KE_NAME_FILE, $kw38$HTML_HANDLER );
    Hashtables.sethash( $kw39$KE_COMPOSE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str40$ke_compose_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym52$KE_COMPOSE, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym71$HANDLE_KE_FILE_INPUT, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym75$HANDLE_COMPOSE_INPUT, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym86$KE_SIGNAL_INPUT_ERROR_2, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym91$KE_UNKNOWNS_ALERT, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym99$KE_CHECK_AND_POLL, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym100$KE_CONSTANTIFY, $kw38$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym130$KE_EVAL, $kw38$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_html_ke_file_file();
  }

  @Override
  public void initializeVariables()
  {
    init_html_ke_file_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_html_ke_file_file();
  }
  static
  {
    me = new html_ke_file();
    $remove_non_printing_characters$ = null;
    $check_for_existing_assertions$ = null;
    $sym0$_REMOVE_NON_PRINTING_CHARACTERS_ = makeSymbol( "*REMOVE-NON-PRINTING-CHARACTERS*" );
    $sym1$_CHECK_FOR_EXISTING_ASSERTIONS_ = makeSymbol( "*CHECK-FOR-EXISTING-ASSERTIONS*" );
    $kw2$KE_NAME_FILE = makeKeyword( "KE-NAME-FILE" );
    $str3$ke_name_file_html = makeString( "ke-name-file.html" );
    $str4$KE_File = makeString( "KE File" );
    $str5$Load_a_KE_File = makeString( "Load a KE File" );
    $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str7$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw8$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw9$CB_CYC = makeKeyword( "CB-CYC" );
    $kw10$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw11$SHA1 = makeKeyword( "SHA1" );
    $str12$yui_skin_sam = makeString( "yui-skin-sam" );
    $str13$reloadFrameButton = makeString( "reloadFrameButton" );
    $str14$button = makeString( "button" );
    $str15$reload = makeString( "reload" );
    $str16$Refresh_Frames = makeString( "Refresh Frames" );
    $str17$post = makeString( "post" );
    $str18$handle_ke_file_input = makeString( "handle-ke-file-input" );
    $kw19$SELF = makeKeyword( "SELF" );
    $str20$Back = makeString( "Back" );
    $str21$Clear = makeString( "Clear" );
    $str22$Load_File = makeString( "Load File" );
    $str23$eval_ke_text = makeString( "eval-ke-text" );
    $str24$Project__ = makeString( "Project: " );
    $str25$project = makeString( "project" );
    $str26$No_project_selected = makeString( "No project selected" );
    $str27$Type_in_pathname_of_the_file_to_l = makeString( "Type in pathname of the file to load:" );
    $str28$pathname_radio = makeString( "pathname-radio" );
    $str29$ = makeString( "" );
    $str30$pathname = makeString( "pathname" );
    $int31$60 = makeInteger( 60 );
    $str32$And_select_any_options_ = makeString( "And select any options:" );
    $str33$remove = makeString( "remove" );
    $str34$_Remove_non_printing_characters_i = makeString( " Remove non-printing characters in strings" );
    $str35$check = makeString( "check" );
    $str36$_Check_for_existing_assertions = makeString( " Check for existing assertions" );
    $sym37$KE_NAME_FILE = makeSymbol( "KE-NAME-FILE" );
    $kw38$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw39$KE_COMPOSE = makeKeyword( "KE-COMPOSE" );
    $str40$ke_compose_html = makeString( "ke-compose.html" );
    $str41$Compose_KE_Text_Expressions = makeString( "Compose KE Text Expressions" );
    $str42$handle_compose_input = makeString( "handle-compose-input" );
    $str43$Cancel_Compose = makeString( "Cancel Compose" );
    $str44$Eval = makeString( "Eval" );
    $str45$Type_KE_text_below___ = makeString( "Type KE text below.  " );
    $str46$Include_a_period_after_each_expre = makeString( "Include a period after each expression." );
    $str47$compose_text = makeString( "compose-text" );
    $str48$Complete = makeString( "Complete" );
    $int49$80 = makeInteger( 80 );
    $int50$30 = makeInteger( 30 );
    $str51$virtual = makeString( "virtual" );
    $sym52$KE_COMPOSE = makeSymbol( "KE-COMPOSE" );
    $kw53$APPLICATION = makeKeyword( "APPLICATION" );
    $kw54$ALAKU = makeKeyword( "ALAKU" );
    $str55$use_old_ke_text = makeString( "use-old-ke-text" );
    $str56$Content_is_in_the_arguments____co = makeString( "Content is in the arguments -- contents of ~A in the HTML message." );
    $str57$t = makeString( "t" );
    $str58$_filename = makeString( ":filename" );
    $str59$_content = makeString( ":content" );
    $str60$__check_existing = makeString( ":?check-existing" );
    $str61$check_and_show = makeString( "check-and-show" );
    $str62$nil = makeString( "nil" );
    $str63$__project = makeString( ":$project" );
    $str64$File_Access_Problem = makeString( "File Access Problem" );
    $str65$The_file__s_does_not_exist__or_ca = makeString( "The file ~s does not exist, or cannot be accessed." );
    $str66$The_file__A_cannot_be_found____A_ = makeString( "The file ~A cannot be found. (~A)" );
    $kw67$INPUT = makeKeyword( "INPUT" );
    $str68$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str69$Pathname_Input_Problem = makeString( "Pathname Input Problem" );
    $str70$Please_try_again__typing_a_non_em = makeString( "Please try again, typing a non-empty string.  ~s is not a valid input." );
    $sym71$HANDLE_KE_FILE_INPUT = makeSymbol( "HANDLE-KE-FILE-INPUT" );
    $sym72$FROB_COMMENTS = makeSymbol( "FROB-COMMENTS" );
    $sym73$NON_LINE_BREAK_CHAR_ = makeSymbol( "NON-LINE-BREAK-CHAR?" );
    $str74$_ke_text = makeString( ":ke-text" );
    $sym75$HANDLE_COMPOSE_INPUT = makeSymbol( "HANDLE-COMPOSE-INPUT" );
    $kw76$OK_TOKEN_FORMS = makeKeyword( "OK-TOKEN-FORMS" );
    $kw77$MALFORMED = makeKeyword( "MALFORMED" );
    $str78$Please_check_the_input_for_missin = makeString( "Please check the input for missing parens, periods, etc.  These token lists are malformed:" );
    $kw79$UNKNOWNS = makeKeyword( "UNKNOWNS" );
    $kw80$REPLACE = makeKeyword( "REPLACE" );
    $kw81$ALREADY_CREATED = makeKeyword( "ALREADY-CREATED" );
    $str82$File_Error = makeString( "File Error" );
    $str83$Problem_loading_file__s___The_fil = makeString( "Problem loading file ~s.  The file contains fatal syntax errors, or cannot be located by the pathname given." );
    $str84$Input_Error = makeString( "Input Error" );
    $str85$The_input_text_contains_fatal_syn = makeString( "The input text contains fatal syntax errors, or has unanticipated syntactic forms." );
    $sym86$KE_SIGNAL_INPUT_ERROR_2 = makeSymbol( "KE-SIGNAL-INPUT-ERROR-2" );
    $str87$Unknown_Constants = makeString( "Unknown Constants" );
    $str88$Make_Cyc_constants_of_the_followi = makeString( "Make Cyc constants of the following strings?" );
    $str89$If_so__be_sure_that_you_have_spec = makeString( "If so, be sure that you have specified an #$isa for each new constant,\na #$genls for each new collection, and a #$genlMt for each new microtheory." );
    $kw90$CONSTANTIFY = makeKeyword( "CONSTANTIFY" );
    $sym91$KE_UNKNOWNS_ALERT = makeSymbol( "KE-UNKNOWNS-ALERT" );
    $str92$Waiting_for_Constant_Creations = makeString( "Waiting for Constant Creations" );
    $str93$Waiting_for_constant_creations_to = makeString( "Waiting for constant creations to be processed ...." );
    $str94$There_are_ = makeString( "There are " );
    $str95$_operations_still_to_be_processed = makeString( " operations still to be processed in the local queue." );
    $str96$Click_ = makeString( "Click " );
    $kw97$CHECK_AND_POLL = makeKeyword( "CHECK-AND-POLL" );
    $str98$_to_proceed_when_you_think_you_ve = makeString( " to proceed when you think you've waited long enough, or attend to the Cyc Agenda if there seems to be a problem." );
    $sym99$KE_CHECK_AND_POLL = makeSymbol( "KE-CHECK-AND-POLL" );
    $sym100$KE_CONSTANTIFY = makeSymbol( "KE-CONSTANTIFY" );
    $str101$There_is_a_problem_that_may_requi = makeString( "There is a problem that may require debugging.  Some expressions cannot be coerced into CycL.  Some of these token lists may be malformed:" );
    $str102$Possibly_Malformed_Token_Lists = makeString( "Possibly Malformed Token Lists" );
    $str103$_s = makeString( "~s" );
    $str104$_in_ = makeString( " in " );
    $str105$_is_not_in_ = makeString( " is not in " );
    $str106$_a_form_a_to_evaluate_ = makeString( "~a form~a to evaluate:" );
    $str107$One = makeString( "One" );
    $str108$__a = makeString( " ~a" );
    $str109$s = makeString( "s" );
    $kw110$KE_EVAL = makeKeyword( "KE-EVAL" );
    $kw111$MAIN = makeKeyword( "MAIN" );
    $str112$Evaluate_the_a_form_a_below = makeString( "Evaluate the~a form~a below" );
    $str113$Evaluate_the_a_form_a_above = makeString( "Evaluate the~a form~a above" );
    $kw114$FORMS_TO_EVAL = makeKeyword( "FORMS-TO-EVAL" );
    $kw115$ALREADY_IN_KB = makeKeyword( "ALREADY-IN-KB" );
    $kw116$NOT_IN_KB = makeKeyword( "NOT-IN-KB" );
    $kw117$NOT_VALID_CONSTANTS = makeKeyword( "NOT-VALID-CONSTANTS" );
    $kw118$ALREADY_CONSTANTS = makeKeyword( "ALREADY-CONSTANTS" );
    $str119$Check_Forms_to_Eval = makeString( "Check Forms to Eval" );
    $str120$Apparently_you_have_specified_no_ = makeString( "Apparently you have specified no new assertions." );
    $str121$These_assertions_are_already_in_t = makeString( "These assertions are already in the KB for the Cyc image ~a:" );
    $str122$These_assertions_are_not_in_the_K = makeString( "These assertions are not in the KB for the Cyc image ~a.  They cannot be deleted:" );
    $str123$These_strings_are_not_names_of_va = makeString( "These strings are not names of valid constants.  They cannot be killed:" );
    $str124$These_strings_are_already_the_nam = makeString( "These strings are already the names of constants.  They cannot be used for renaming:" );
    $str125$State_has_been_cleared___There_ar = makeString( "State has been cleared.  There are no forms to evaluate." );
    $str126$_a_form_a_ha_a_been_evaluated_ = makeString( "~a form~a ha~a been evaluated." );
    $str127$ve = makeString( "ve" );
    $str128$State_has_been_cleared___No_forms = makeString( "State has been cleared.  No forms have been evaluated." );
    $str129$KE_Evaluation_Notification = makeString( "KE Evaluation Notification" );
    $sym130$KE_EVAL = makeSymbol( "KE-EVAL" );
  }
}
/*
 * 
 * Total time: 744 ms
 * 
 */