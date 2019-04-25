package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.browser.cb_inference_browser;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.browser.cb_query_browser;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_template_oe
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_template_oe";
  public static final String myFingerPrint = "4333967550a10def3d0ada32b2f9913834d3c42253bcb62e1e58080caca732bf";
  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3540L)
  public static SubLSymbol $template_query_show_answer_count$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 26172L)
  public static SubLSymbol $cb_toe_resulting_forms_abbreviation_cutoff$;
  private static final SubLSymbol $kw0$CB_TOE;
  private static final SubLString $str1$cb_toe_html;
  private static final SubLString $str2$Template_OE__Query_Specification;
  private static final SubLString $str3$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str4$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw5$UNINITIALIZED;
  private static final SubLSymbol $kw6$CB_CYC;
  private static final SubLSymbol $kw7$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw8$SHA1;
  private static final SubLString $str9$yui_skin_sam;
  private static final SubLString $str10$reloadFrameButton;
  private static final SubLString $str11$button;
  private static final SubLString $str12$reload;
  private static final SubLString $str13$Refresh_Frames;
  private static final SubLString $str14$post;
  private static final SubLString $str15$cb_handle_template_oe;
  private static final SubLString $str16$Clear_All_Fields;
  private static final SubLString $str17$Run_Query;
  private static final SubLString $str18$query_test;
  private static final SubLString $str19$cb_toe_parameters;
  private static final SubLString $str20$Show;
  private static final SubLString $str21$Hide;
  private static final SubLString $str22$Query_Context;
  private static final SubLSymbol $kw23$INVISIBLE;
  private static final SubLSymbol $kw24$PARAGRAPH;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLString $str27$Available_Templates_;
  private static final SubLString $str28$Assert;
  private static final SubLString $str29$template_assert;
  private static final SubLString $str30$Unassert;
  private static final SubLString $str31$template_unassert;
  private static final SubLString $str32$Edit;
  private static final SubLString $str33$template_edit;
  private static final SubLString $str34$Kill;
  private static final SubLString $str35$template_kill;
  private static final SubLString $str36$Blast;
  private static final SubLString $str37$template_blast;
  private static final SubLString $str38$Repropagate;
  private static final SubLString $str39$template_repropagate;
  private static final SubLString $str40$_Template_OE_;
  private static final SubLSymbol $sym41$INFERENCE_P;
  private static final SubLSymbol $kw42$SELF;
  private static final SubLString $str43$cb_toe_inference__A;
  private static final SubLSymbol $kw44$TEMPLATE_OE_INFERENCE;
  private static final SubLSymbol $sym45$CB_LINK_TEMPLATE_OE_INFERENCE;
  private static final SubLList $list46;
  private static final SubLString $str47$That_inference_is_no_longer_avail;
  private static final SubLSymbol $sym48$CB_TOE_INFERENCE;
  private static final SubLSymbol $kw49$HTML_HANDLER;
  private static final SubLString $str50$Template_OE__Inference;
  private static final SubLString $str51$inference;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$TEMPLATE_OE_INFERENCE_HANDLER;
  private static final SubLList $list54;
  private static final SubLString $str55$Inference___;
  private static final SubLSymbol $kw56$INFERENCE;
  private static final SubLString $str57$_Refresh_;
  private static final SubLSymbol $kw58$DISABLED;
  private static final SubLString $str59$template_redo_tms;
  private static final SubLString $str60$Submission_was_not_understood_;
  private static final SubLSymbol $sym61$CB_HANDLE_TEMPLATE_OE;
  private static final SubLString $str62$cb_handle_template_oe__A__A_infer;
  private static final SubLSymbol $sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER;
  private static final SubLSymbol $sym64$CB_TEMPLATE_ASSERT;
  private static final SubLSymbol $sym65$CB_TEMPLATE_UNASSERT;
  private static final SubLSymbol $sym66$CB_TEMPLATE_EDIT;
  private static final SubLString $str67$kill;
  private static final SubLSymbol $sym68$CB_TEMPLATE_KILL;
  private static final SubLSymbol $sym69$CB_TEMPLATE_BLAST;
  private static final SubLSymbol $sym70$CB_TEMPLATE_REPROPAGATE;
  private static final SubLSymbol $sym71$CB_TEMPLATE_REDO_TMS;
  private static final SubLSymbol $sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES;
  private static final SubLSymbol $sym73$CB_TEMPLATE_MERGE;
  private static final SubLString $str74$Template_OE__Query_Results;
  private static final SubLString $str75$Template_OE__Assert;
  private static final SubLString $str76$cb_handle_template_assert;
  private static final SubLString $str77$Assert_Specification;
  private static final SubLString $str78$Run_Template_Assert;
  private static final SubLString $str79$assert;
  private static final SubLSymbol $sym80$CB_HANDLE_TEMPLATE_ASSERT;
  private static final SubLString $str81$Template_OE__Unassert;
  private static final SubLString $str82$cb_handle_template_unassert;
  private static final SubLString $str83$Unassert_Specification;
  private static final SubLString $str84$Run_Template_Unassert;
  private static final SubLString $str85$unassert;
  private static final SubLSymbol $sym86$CB_HANDLE_TEMPLATE_UNASSERT;
  private static final SubLString $str87$Template_OE__Edit;
  private static final SubLString $str88$cb_handle_template_edit;
  private static final SubLString $str89$Edit_Specification;
  private static final SubLString $str90$Run_Template_Edit;
  private static final SubLString $str91$edit;
  private static final SubLList $list92;
  private static final SubLString $str93$mt_monad;
  private static final SubLSymbol $sym94$CB_HANDLE_TEMPLATE_EDIT;
  private static final SubLString $str95$Template_OE__Blast;
  private static final SubLString $str96$cb_handle_template_blast;
  private static final SubLString $str97$Blast_Specification;
  private static final SubLString $str98$Run_Template_Blast;
  private static final SubLString $str99$blast;
  private static final SubLSymbol $sym100$CB_HANDLE_TEMPLATE_BLAST;
  private static final SubLString $str101$Template_OE__Repropagate;
  private static final SubLString $str102$cb_handle_template_repropagate;
  private static final SubLString $str103$Repropagate_Specification;
  private static final SubLString $str104$Run_Template_Repropagate;
  private static final SubLString $str105$repropagate;
  private static final SubLSymbol $sym106$CB_HANDLE_TEMPLATE_REPROPAGATE;
  private static final SubLString $str107$Template_OE__Redo_TMS;
  private static final SubLString $str108$cb_handle_template_redo_tms;
  private static final SubLString $str109$Redo_TMS_Specification;
  private static final SubLString $str110$Run_Template_Redo_TMS;
  private static final SubLString $str111$redo_tms;
  private static final SubLSymbol $sym112$CB_HANDLE_TEMPLATE_REDO_TMS;
  private static final SubLString $str113$template;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$STRING_EQUAL;
  private static final SubLString $str116$_sentence;
  private static final SubLString $str117$_mt;
  private static final SubLSymbol $kw118$INPUT_NAME;
  private static final SubLList $list119;
  private static final SubLString $str120$query_spec;
  private static final SubLString $str121$query_mt;
  private static final SubLSymbol $kw122$DEFAULT;
  private static final SubLSymbol $sym123$KE_KILL;
  private static final SubLSymbol $sym124$KE_ASSERT;
  private static final SubLSymbol $sym125$QUOTE;
  private static final SubLSymbol $sym126$KE_UNASSERT;
  private static final SubLSymbol $sym127$FI_BLAST;
  private static final SubLSymbol $sym128$KE_REPROPAGATE_ASSERTION;
  private static final SubLSymbol $sym129$FIND_ASSERTION_CYCL;
  private static final SubLSymbol $sym130$KE_TMS_RECONSIDER_ASSERTION;
  private static final SubLSymbol $kw131$CYCLIST;
  private static final SubLSymbol $kw132$TYPE_KEY;
  private static final SubLSymbol $kw133$TOE_OPERATIONS;
  private static final SubLSymbol $kw134$DATA;
  private static final SubLString $str135$Current_;
  private static final SubLString $str136$_Template_in_;
  private static final SubLString $str137$__;
  private static final SubLString $str138$Submission_was_not_understood;
  private static final SubLList $list139;
  private static final SubLString $str140$Evaluate_;
  private static final SubLString $str141$_forms_from_;
  private static final SubLString $str142$_template_;
  private static final SubLString $str143$_in_;
  private static final SubLString $str144$_with_bindings_from_;
  private static final SubLString $str145$_with_query;
  private static final SubLList $list146;
  private static final SubLString $str147$query_;
  private static final SubLSymbol $kw148$CB_TOE_TEMPLATE_RESULTS;
  private static final SubLString $str149$cb_toe_template_results_html;
  private static final SubLString $str150$Template_OE__Resulting_Forms;
  private static final SubLString $str151$cb_toe_operations_handler;
  private static final SubLString $str152$id_string;
  private static final SubLString $str153$Current_Inference___;
  private static final SubLString $str154$Current_query;
  private static final SubLSymbol $sym155$CB_TOE_OPERATIONS_DISPLAY;
  private static final SubLInteger $int156$100;
  private static final SubLString $str157$Add_Forms_to_Agenda;
  private static final SubLString $str158$boxes;
  private static final SubLString $str159$100_;
  private static final SubLString $str160$OK_;
  private static final SubLString $str161$_2;
  private static final SubLString $str162$Operations_;
  private static final SubLString $str163$Below_forms_abbreviated__no_links;
  private static final SubLString $str164$_of_them_;
  private static final SubLString $str165$_dddddd;
  private static final SubLString $str166$_cccccc;
  private static final SubLSymbol $kw167$CENTER;
  private static final SubLString $str168$_Check_All_;
  private static final SubLString $str169$this_document_forms_0_;
  private static final SubLString $str170$__;
  private static final SubLString $str171$T;
  private static final SubLString $str172$_Uncheck_All_;
  private static final SubLString $str173$NIL;
  private static final SubLString $str174$_A;
  private static final SubLString $str175$TOE__Forms_Added_to_Agenda;
  private static final SubLSymbol $sym176$CB_TOE_OPERATIONS_HANDLER;
  private static final SubLString $str177$_S;
  private static final SubLString $str178$strength;
  private static final SubLString $str179$direction;
  private static final SubLList $list180;
  private static final SubLString $str181$Template_OE__Error;
  private static final SubLString $str182$Cyc_Error;
  private static final SubLString $str183$The_Mt_you_have_entered_is_invali;

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 934L)
  public static SubLObject cb_toe_query()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str2$Template_OE__Query_Specification;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
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
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$post );
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
              html_utilities.html_hidden_input( $str15$cb_handle_template_oe, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw0$CB_TOE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_reset_input( $str16$Clear_All_Fields );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_submit_input( $str17$Run_Query, $str18$query_test, UNPROVIDED );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              dhtml_macros.dhtml_switch_visibility_links( $str19$cb_toe_parameters, $str20$Show, $str21$Hide );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str22$Query_Context );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              final SubLObject initial_visibility = $kw23$INVISIBLE;
              dhtml_macros.dhtml_set_switched_visibility( $str19$cb_toe_parameters, initial_visibility, $kw24$PARAGRAPH );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str19$cb_toe_parameters );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_form_widgets.cb_mt_input_section( NIL, $list25 );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              cb_form_widgets.cb_el_sentence_input_section( NIL, $list26 );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str27$Available_Templates_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str28$Assert, $str29$template_assert, UNPROVIDED );
              html_utilities.html_submit_input( $str30$Unassert, $str31$template_unassert, UNPROVIDED );
              html_utilities.html_submit_input( $str32$Edit, $str33$template_edit, UNPROVIDED );
              html_utilities.html_submit_input( $str34$Kill, $str35$template_kill, UNPROVIDED );
              html_utilities.html_submit_input( $str36$Blast, $str37$template_blast, UNPROVIDED );
              html_utilities.html_submit_input( $str38$Repropagate, $str39$template_repropagate, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 2776L)
  public static SubLObject cb_link_template_oe_inference(final SubLObject inference, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str40$_Template_OE_;
    }
    assert NIL != inference_datastructures_inference.inference_p( inference ) : inference;
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw42$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str43$cb_toe_inference__A, cb_query.cb_inference_identifier( inference ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3180L)
  public static SubLObject cb_toe_inference(final SubLObject args)
  {
    SubLObject inference_identifier = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list46 );
    inference_identifier = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list46 );
      return NIL;
    }
    final SubLObject inference = cb_query.cb_guess_inference_from_identifier( inference_identifier );
    if( NIL == inference_datastructures_inference.inference_p( inference ) )
    {
      return cb_utilities.cb_error( $str47$That_inference_is_no_longer_avail, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_toe_inference_guts( inference );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 3618L)
  public static SubLObject cb_toe_inference_guts(final SubLObject inference)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str50$Template_OE__Inference;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
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
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str15$cb_handle_template_oe, T, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw0$CB_TOE, UNPROVIDED, UNPROVIDED );
              html_utilities.html_hidden_input( $str51$inference, cb_query.cb_inference_identifier( inference ), UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              cb_show_template_query_inference( inference, $kw44$TEMPLATE_OE_INFERENCE );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str27$Available_Templates_ );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
              SubLObject cdolist_list_var = $list54;
              SubLObject handler_info = NIL;
              handler_info = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current;
                final SubLObject datum = current = handler_info;
                SubLObject handler = NIL;
                SubLObject label = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                handler = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list52 );
                label = current.first();
                current = current.rest();
                if( NIL == current )
                {
                  cb_utilities.cb_link( $kw53$TEMPLATE_OE_INFERENCE_HANDLER, inference, handler, label, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_indent( TWO_INTEGER );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum, $list52 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                handler_info = cdolist_list_var.first();
              }
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_query.cb_show_query_answer_section( inference, $template_query_show_answer_count$.getDynamicValue( thread ) );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$8, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$7, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 5049L)
  public static SubLObject cb_show_template_query_inference(final SubLObject inference, SubLObject refresh_link)
  {
    if( refresh_link == UNPROVIDED )
    {
      refresh_link = NIL;
    }
    html_utilities.html_princ_strong( $str55$Inference___ );
    cb_utilities.cb_link( $kw56$INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != refresh_link )
    {
      html_utilities.html_indent( FOUR_INTEGER );
      cb_utilities.cb_link( refresh_link, inference, $str57$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    cb_query.cb_show_inference_status_section( inference, $kw58$DISABLED );
    html_utilities.html_newline( TWO_INTEGER );
    cb_query_browser.cb_show_inference_el_query( inference, UNPROVIDED );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 5664L)
  public static SubLObject cb_handle_template_oe(final SubLObject args)
  {
    if( NIL != html_utilities.html_extract_input( $str18$query_test, args ) )
    {
      return cb_handle_toe_test_query( args );
    }
    if( NIL != html_utilities.html_extract_input( $str29$template_assert, args ) )
    {
      return cb_template_assert( args );
    }
    if( NIL != html_utilities.html_extract_input( $str31$template_unassert, args ) )
    {
      return cb_template_unassert( args );
    }
    if( NIL != html_utilities.html_extract_input( $str33$template_edit, args ) )
    {
      return cb_template_edit( args );
    }
    if( NIL != html_utilities.html_extract_input( $str35$template_kill, args ) )
    {
      return cb_template_kill( args );
    }
    if( NIL != html_utilities.html_extract_input( $str37$template_blast, args ) )
    {
      return cb_template_blast( args );
    }
    if( NIL != html_utilities.html_extract_input( $str39$template_repropagate, args ) )
    {
      return cb_template_repropagate( args );
    }
    if( NIL != html_utilities.html_extract_input( $str59$template_redo_tms, args ) )
    {
      return cb_template_redo_tms( args );
    }
    return cb_utilities.cb_error( $str60$Submission_was_not_understood_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 6981L)
  public static SubLObject cb_link_template_oe_inference_handler(final SubLObject inference, final SubLObject handler, final SubLObject label)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw42$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str62$cb_handle_template_oe__A__A_infer, new SubLObject[] { handler, label, cb_query.cb_inference_identifier( inference )
    } );
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
      html_utilities.html_princ( label );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7232L)
  public static SubLObject cb_template_assert(final SubLObject args)
  {
    return cb_template_assert_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7406L)
  public static SubLObject cb_template_unassert(final SubLObject args)
  {
    return cb_template_unassert_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7585L)
  public static SubLObject cb_template_edit(final SubLObject args)
  {
    return cb_template_edit_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 7732L)
  public static SubLObject cb_template_kill(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template = NIL;
    thread.resetMultipleValues();
    final SubLObject query_formula = cb_get_ask_from_args( args );
    final SubLObject query_mt = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject query_spec_and_mt_list = ( NIL != inference ) ? inference : ConsesLow.list( query_formula, query_mt );
    template = ConsesLow.list( $str67$kill, query_spec_and_mt_list );
    return cb_handle_template_output( template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8171L)
  public static SubLObject cb_template_blast(final SubLObject args)
  {
    return cb_template_blast_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8340L)
  public static SubLObject cb_template_repropagate(final SubLObject args)
  {
    return cb_template_repropagate_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8508L)
  public static SubLObject cb_template_redo_tms(final SubLObject args)
  {
    return cb_template_redo_tms_internals( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8660L)
  public static SubLObject cb_template_change_assertion_properties(final SubLObject args)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 8892L)
  public static SubLObject cb_template_merge(final SubLObject args)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 9046L)
  public static SubLObject cb_handle_toe_test_query(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject query_formula = cb_get_ask_from_args( args );
    final SubLObject query_mt = thread.secondMultipleValue();
    thread.resetMultipleValues();
    html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str74$Template_OE__Query_Results );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      dhtml_macros.dhtml_with_dom_script();
      dhtml_macros.dhtml_with_toggle_visibility_support();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_princ( $str74$Template_OE__Query_Results );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            cb_query.cb_new_cyc_query( query_formula, query_mt, UNPROVIDED );
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$12, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 9853L)
  public static SubLObject cb_template_assert_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str75$Template_OE__Assert;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$15 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$16 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str76$cb_handle_template_assert, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str77$Assert_Specification, $str78$Run_Template_Assert, $str79$assert );
              cb_show_template_input_area( T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$16, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$15, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 10595L)
  public static SubLObject cb_handle_template_assert(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str79$assert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 10785L)
  public static SubLObject cb_template_unassert_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str81$Template_OE__Unassert;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$20 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str82$cb_handle_template_unassert, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str83$Unassert_Specification, $str84$Run_Template_Unassert, $str85$unassert );
              cb_show_template_input_area( NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$20, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 11353L)
  public static SubLObject cb_handle_template_unassert(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str85$unassert );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 11541L)
  public static SubLObject cb_template_edit_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str87$Template_OE__Edit;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$26 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str88$cb_handle_template_edit, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str89$Edit_Specification, $str90$Run_Template_Edit, $str91$edit );
              final SubLObject default_sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list92 );
              final SubLObject default_mt_string = html_utilities.html_extract_input( $str93$mt_monad, args );
              final SubLObject default_mt = ( NIL != string_utilities.non_empty_stringP( default_mt_string ) ) ? cb_assertion_editor.cb_extract_mt_from_string( default_mt_string ) : NIL;
              cb_show_template_input_area( T, default_sentence, default_mt, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$26, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$25, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 12467L)
  public static SubLObject cb_handle_template_edit(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str91$edit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 12631L)
  public static SubLObject cb_template_blast_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str95$Template_OE__Blast;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$30 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$31 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str96$cb_handle_template_blast, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str97$Blast_Specification, $str98$Run_Template_Blast, $str99$blast );
              cb_show_template_input_area( NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$31, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$30, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13198L)
  public static SubLObject cb_handle_template_blast(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str99$blast );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13379L)
  public static SubLObject cb_template_repropagate_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str101$Template_OE__Repropagate;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$35 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$36 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str102$cb_handle_template_repropagate, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str103$Repropagate_Specification, $str104$Run_Template_Repropagate, $str105$repropagate );
              cb_show_template_input_area( NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$36, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$35, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 13995L)
  public static SubLObject cb_handle_template_repropagate(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str105$repropagate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14194L)
  public static SubLObject cb_template_redo_tms_internals(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str107$Template_OE__Redo_TMS;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$40 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw7$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$41 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
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
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str108$cb_handle_template_redo_tms, T, UNPROVIDED );
              cb_show_template_query( args );
              cb_show_template_specification_and_submit( $str109$Redo_TMS_Specification, $str110$Run_Template_Redo_TMS, $str111$redo_tms );
              cb_show_template_input_area( NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              cb_show_template_query_answers( args );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$41, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$40, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14788L)
  public static SubLObject cb_handle_template_redo_tms(final SubLObject args)
  {
    return cb_handle_template_internals( args, $str111$redo_tms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 14981L)
  public static SubLObject cb_handle_template_internals(final SubLObject args, final SubLObject template_type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_spec_and_mt_list = get_list_with_query_spec_and_mt( args );
    SubLObject template_form = NIL;
    SubLObject template_mt = NIL;
    SubLObject mt_fort = NIL;
    SubLObject template = NIL;
    thread.resetMultipleValues();
    final SubLObject template_form_$45 = get_template_form_specs( args, $str113$template );
    final SubLObject template_mt_$46 = thread.secondMultipleValue();
    final SubLObject mt_fort_$47 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    template_form = template_form_$45;
    template_mt = template_mt_$46;
    mt_fort = mt_fort_$47;
    if( NIL != Strings.string_equal( template_type, $str79$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.string_equal( template_type, $str91$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject template_strength = cb_assertion_editor.cb_extract_strength_and_direction_input( args, UNPROVIDED );
      final SubLObject template_direction = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject template_list = ( NIL != mt_fort ) ? ConsesLow.list( template_form, mt_fort, template_strength, template_direction )
          : ConsesLow.list( template_form, template_mt, template_strength, template_direction );
      template = ConsesLow.list( template_type, query_spec_and_mt_list, template_list );
    }
    else if( NIL != subl_promotions.memberP( template_type, $list114, Symbols.symbol_function( $sym115$STRING_EQUAL ), UNPROVIDED ) )
    {
      template = ( NIL != mt_fort ) ? ConsesLow.list( template_type, query_spec_and_mt_list, ConsesLow.list( template_form, mt_fort ) )
          : ConsesLow.list( template_type, query_spec_and_mt_list, ConsesLow.list( template_form, template_mt ) );
    }
    return cb_handle_template_output( template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 16272L)
  public static SubLObject get_template_form_specs(final SubLObject args, SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str113$template;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sentence_string = Sequences.cconcatenate( prefix, $str116$_sentence );
    final SubLObject mt_string = Sequences.cconcatenate( prefix, $str117$_mt );
    thread.resetMultipleValues();
    final SubLObject template_mt = cb_form_widgets.cb_extract_mt_input( args, NIL, ConsesLow.listS( $kw118$INPUT_NAME, mt_string, $list119 ) );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      return cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, ConsesLow.list( $kw118$INPUT_NAME, sentence_string ) );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_error_string, UNPROVIDED );
    }
    final SubLObject mt_fort = cb_utilities.cb_guess_fort( html_utilities.html_extract_input( mt_string, args ), UNPROVIDED );
    return Values.values( sentence, template_mt, mt_fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 17032L)
  public static SubLObject get_list_with_query_spec_and_mt(final SubLObject args)
  {
    final SubLObject inference_identifier = html_utilities.html_extract_input( $str51$inference, args );
    if( NIL != inference_identifier )
    {
      return cb_query.cb_guess_inference_from_identifier( inference_identifier );
    }
    return ConsesLow.list( reader.read_from_string_ignoring_errors( html_utilities.html_extract_input( $str120$query_spec, args ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), cb_assertion_editor
        .cb_extract_mt_from_string( html_utilities.html_extract_input( $str121$query_mt, args ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 17418L)
  public static SubLObject cb_handle_template_output(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject query_spec_and_mt_list = conses_high.second( template );
    SubLObject v_answer = NIL;
    SubLObject suspend_status = NIL;
    SubLObject query = NIL;
    SubLObject mt = NIL;
    if( NIL != inference_datastructures_inference.inference_p( query_spec_and_mt_list ) )
    {
      final SubLObject inference = query_spec_and_mt_list;
      query = inference_datastructures_inference.inference_input_el_query( inference );
      mt = inference_datastructures_inference.inference_input_mt( inference );
      v_answer = inference_kernel.inference_result_from_all_answers( inference );
      suspend_status = inference_datastructures_inference.inference_suspend_status( inference );
    }
    else
    {
      query = query_spec_and_mt_list.first();
      mt = conses_high.second( query_spec_and_mt_list );
      thread.resetMultipleValues();
      final SubLObject v_answer_$48 = inference_kernel.new_cyc_query( query, mt, UNPROVIDED );
      final SubLObject suspend_status_$49 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      v_answer = v_answer_$48;
      suspend_status = suspend_status_$49;
    }
    final SubLObject id_string = get_toe_template_forms( v_answer, template, suspend_status, query, mt );
    if( NIL != id_string )
    {
      cb_toe_operations_display( ConsesLow.list( id_string ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 18439L)
  public static SubLObject get_toe_template_forms(final SubLObject v_answer, final SubLObject template, final SubLObject suspend_status, final SubLObject query_form, final SubLObject query_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != inference_datastructures_enumerated_types.inference_error_suspend_status_p( suspend_status ) )
    {
      cb_query_browser.cb_show_inference_suspend_status( suspend_status );
      return NIL;
    }
    final SubLObject type = template.first();
    final SubLObject op = conses_high.third( template );
    SubLObject form = NIL;
    SubLObject mt = NIL;
    SubLObject strength = NIL;
    SubLObject direction = NIL;
    SubLObject current_forms = NIL;
    SubLObject temp_user_action = NIL;
    thread.resetMultipleValues();
    final SubLObject form_$50 = destructure_template_op( op );
    final SubLObject mt_$51 = thread.secondMultipleValue();
    final SubLObject strength_$52 = thread.thirdMultipleValue();
    final SubLObject direction_$53 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    form = form_$50;
    mt = mt_$51;
    strength = strength_$52;
    direction = direction_$53;
    if( ( NIL != Strings.string_equal( type, $str79$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Strings.string_equal( type, $str91$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        && NIL == strength )
    {
      strength = $kw122$DEFAULT;
    }
    SubLObject cdolist_list_var = v_answer;
    SubLObject alist = NIL;
    alist = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject temp_form = NIL;
      SubLObject temp_mt = NIL;
      SubLObject constant = NIL;
      SubLObject ke_form = NIL;
      thread.resetMultipleValues();
      final SubLObject temp_form_$54 = template_substitute_in_form( alist, form, mt, type );
      final SubLObject temp_mt_$55 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      temp_form = temp_form_$54;
      temp_mt = temp_mt_$55;
      if( NIL != Strings.string_equal( type, $str67$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        constant = temp_form;
        ke_form = ConsesLow.list( $sym123$KE_KILL, constant );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      else if( NIL != Strings.string_equal( type, $str79$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ke_form = ConsesLow.list( $sym124$KE_ASSERT, ConsesLow.list( $sym125$QUOTE, temp_form ), ConsesLow.list( $sym125$QUOTE, temp_mt ), ConsesLow.list( $sym125$QUOTE, strength ), ConsesLow.list( $sym125$QUOTE,
            direction ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      else if( NIL != Strings.string_equal( type, $str85$unassert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ke_form = ConsesLow.list( $sym126$KE_UNASSERT, ConsesLow.list( $sym125$QUOTE, temp_form ), ConsesLow.list( $sym125$QUOTE, temp_mt ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      else if( NIL != Strings.string_equal( type, $str91$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        thread.resetMultipleValues();
        final SubLObject unassert_form = template_substitute_in_form( alist, query_form, query_mt, type );
        final SubLObject unassert_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ke_form = ConsesLow.list( $sym126$KE_UNASSERT, ConsesLow.list( $sym125$QUOTE, unassert_form ), ConsesLow.list( $sym125$QUOTE, unassert_mt ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
        ke_form = ConsesLow.list( $sym124$KE_ASSERT, ConsesLow.list( $sym125$QUOTE, temp_form ), ConsesLow.list( $sym125$QUOTE, temp_mt ), ConsesLow.list( $sym125$QUOTE, strength ), ConsesLow.list( $sym125$QUOTE,
            direction ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      else if( NIL != Strings.string_equal( type, $str99$blast, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        ke_form = ConsesLow.list( $sym127$FI_BLAST, ConsesLow.list( $sym125$QUOTE, temp_form ), ConsesLow.list( $sym125$QUOTE, temp_mt ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      else if( NIL != Strings.string_equal( type, $str105$repropagate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL != czer_meta.find_assertion_cycl( temp_form, temp_mt ) )
        {
          ke_form = ConsesLow.list( $sym128$KE_REPROPAGATE_ASSERTION, ConsesLow.list( $sym129$FIND_ASSERTION_CYCL, ConsesLow.list( $sym125$QUOTE, temp_form ), temp_mt ) );
          current_forms = ConsesLow.cons( ke_form, current_forms );
        }
      }
      else if( NIL != Strings.string_equal( type, $str111$redo_tms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != czer_meta.find_assertion_cycl( temp_form, temp_mt ) )
      {
        ke_form = ConsesLow.list( $sym130$KE_TMS_RECONSIDER_ASSERTION, ConsesLow.list( $sym129$FIND_ASSERTION_CYCL, ConsesLow.list( $sym125$QUOTE, temp_form ), temp_mt ) );
        current_forms = ConsesLow.cons( ke_form, current_forms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      alist = cdolist_list_var.first();
    }
    current_forms = Sequences.nreverse( current_forms );
    current_forms = list_utilities.fast_delete_duplicates( current_forms, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    temp_user_action = user_actions.new_user_action( ConsesLow.list( $kw131$CYCLIST, api_control_vars.$the_cyclist$.getDynamicValue( thread ), $kw132$TYPE_KEY, $kw133$TOE_OPERATIONS, $kw134$DATA, ConsesLow.list(
        template, current_forms ) ) );
    return user_actions.user_action_id_string( temp_user_action );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 21663L)
  public static SubLObject cb_show_template(final SubLObject template)
  {
    final SubLObject template_type = template.first();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str135$Current_ );
    html_utilities.html_princ( Strings.string_capitalize( template_type, UNPROVIDED, UNPROVIDED ) );
    html_utilities.html_princ( $str136$_Template_in_ );
    final SubLObject mt = cb_utilities.cb_guess_fort( conses_high.second( conses_high.third( template ) ), UNPROVIDED );
    if( NIL != mt )
    {
      cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_form( conses_high.second( conses_high.third( template ) ), UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_princ( $str137$__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    if( NIL != Strings.string_equal( template_type, $str79$assert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    if( NIL != Strings.string_equal( template_type, $str85$unassert, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    if( NIL != Strings.string_equal( template_type, $str91$edit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    if( NIL != Strings.string_equal( template_type, $str99$blast, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    if( NIL != Strings.string_equal( template_type, $str105$repropagate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    if( NIL != Strings.string_equal( template_type, $str111$redo_tms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return cb_show_assertion_template( template );
    }
    return cb_utilities.cb_error( $str138$Submission_was_not_understood, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 22779L)
  public static SubLObject cb_show_assertion_template(final SubLObject template)
  {
    final SubLObject form = conses_high.third( template ).first();
    cb_utilities.cb_form( form, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 23324L)
  public static SubLObject cb_toe_operations_summary(final SubLObject user_action_id_string)
  {
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    final SubLObject template = user_actions.user_action_data( user_action ).first();
    final SubLObject type = template.first();
    final SubLObject forms = conses_high.second( user_actions.user_action_data( user_action ) );
    html_utilities.html_princ( $str140$Evaluate_ );
    html_utilities.html_princ( Sequences.length( forms ) );
    html_utilities.html_princ( $str141$_forms_from_ );
    html_utilities.html_princ( type );
    html_utilities.html_princ( $str142$_template_ );
    if( NIL == Strings.string_equal( type, $str67$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( conses_high.third( template ).first(), UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str143$_in_ );
      cb_utilities.cb_form( conses_high.second( conses_high.third( template ) ), UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str144$_with_bindings_from_ );
    final SubLObject query_spec_and_mt_list = conses_high.second( template );
    if( NIL != inference_datastructures_inference.inference_p( query_spec_and_mt_list ) )
    {
      final SubLObject inference = query_spec_and_mt_list;
      cb_utilities.cb_form( inference, UNPROVIDED, UNPROVIDED );
      html_utilities.html_princ( $str145$_with_query );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( inference_datastructures_inference.inference_input_el_query( inference ), ZERO_INTEGER, T );
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str143$_in_ );
      cb_utilities.cb_form( inference_datastructures_inference.inference_input_mt( inference ), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      SubLObject current;
      final SubLObject datum = current = query_spec_and_mt_list;
      SubLObject query = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
      query = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list146 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        html_utilities.html_princ( $str147$query_ );
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_form( query, ZERO_INTEGER, T );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str143$_in_ );
        cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list146 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 24748L)
  public static SubLObject cb_toe_operations_display(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id_string = args.first();
    final SubLObject user_action = user_actions.user_action_by_id_string( id_string );
    final SubLObject template = user_actions.user_action_data( user_action ).first();
    final SubLObject query_spec_and_mt_list = conses_high.second( template );
    final SubLObject inference = ( NIL != inference_datastructures_inference.inference_p( query_spec_and_mt_list ) ) ? query_spec_and_mt_list : NIL;
    final SubLObject query_formula = ( NIL != inference_datastructures_inference.inference_p( query_spec_and_mt_list ) ) ? NIL : query_spec_and_mt_list.first();
    final SubLObject query_mt = ( NIL != inference_datastructures_inference.inference_p( query_spec_and_mt_list ) ) ? NIL : conses_high.second( query_spec_and_mt_list );
    final SubLObject forms = conses_high.second( user_actions.user_action_data( user_action ) );
    final SubLObject title_var = $str150$Template_OE__Resulting_Forms;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$56 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$57 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
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
            html_script_utilities.html_set_all_radio_buttons_script();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str14$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str151$cb_toe_operations_handler, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str152$id_string, id_string, UNPROVIDED );
              cb_utilities.cb_help_preamble( $kw148$CB_TOE_TEMPLATE_RESULTS, UNPROVIDED, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
              if( NIL != inference )
              {
                html_utilities.html_princ_strong( $str153$Current_Inference___ );
                cb_inference_browser.cb_show_inference_summary( inference );
              }
              else
              {
                cb_query.cb_show_query( query_formula, query_mt, $str154$Current_query );
              }
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              if( NIL == Strings.string_equal( template.first(), $str67$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
              {
                cb_show_template( template );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              }
              cb_show_toe_template_results( forms );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$57, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$56, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 26249L)
  public static SubLObject cb_show_toe_template_results(final SubLObject forms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject total_checkboxes = Sequences.length( forms );
    html_utilities.html_submit_input( $str157$Add_Forms_to_Agenda, UNPROVIDED, UNPROVIDED );
    html_utilities.html_hidden_input( $str158$boxes, total_checkboxes, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
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
    html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str159$100_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str160$OK_ );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( TWO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str161$_2 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str162$Operations_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      SubLObject checkbox_number = MINUS_ONE_INTEGER;
      final SubLObject form_count = Sequences.length( forms );
      SubLObject bgcolor = NIL;
      if( form_count.numG( $cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue( thread ) ) )
      {
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( Sequences.cconcatenate( $str163$Below_forms_abbreviated__no_links, new SubLObject[] { format_nil.format_nil_a_no_copy( $cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue(
              thread ) ), $str164$_of_them_
          } ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      }
      SubLObject color_toggle = NIL;
      SubLObject list_var = NIL;
      SubLObject ke_form = NIL;
      SubLObject ignore_me = NIL;
      list_var = forms;
      ke_form = list_var.first();
      for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ke_form = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
      {
        if( NIL != color_toggle )
        {
          color_toggle = NIL;
        }
        else
        {
          color_toggle = T;
        }
        bgcolor = ( NIL != color_toggle ) ? $str165$_dddddd : $str166$_cccccc;
        checkbox_number = Numbers.add( checkbox_number, ONE_INTEGER );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        if( NIL != bgcolor )
        {
          html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( bgcolor );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw167$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_checkbox_input( checkbox_number, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw167$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( form_count.numG( $cb_toe_resulting_forms_abbreviation_cutoff$.getDynamicValue( thread ) ) )
            {
              html_utilities.html_princ( ke_form );
            }
            else
            {
              cb_utilities.cb_form( ke_form, UNPROVIDED, UNPROVIDED );
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_script_utilities.html_anchor_set_radio_buttons_to_value( $str168$_Check_All_, $str169$this_document_forms_0_, $str170$__, $str171$T );
    html_utilities.html_indent( UNPROVIDED );
    html_script_utilities.html_anchor_set_radio_buttons_to_value( $str172$_Uncheck_All_, $str169$this_document_forms_0_, $str170$__, $str173$NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 28095L)
  public static SubLObject cb_toe_operations_handler(final SubLObject args)
  {
    final SubLObject boxstring = html_utilities.html_extract_input( $str158$boxes, args );
    final SubLObject boxes = reader.read_from_string( boxstring, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject id_string = html_utilities.html_extract_input( $str152$id_string, args );
    final SubLObject forms = conses_high.second( user_actions.user_action_data( user_actions.user_action_by_id_string( id_string ) ) );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; !i.numGE( boxes ); i = number_utilities.f_1X( i ) )
    {
      if( NIL != html_utilities.html_extract_input( PrintLow.format( NIL, $str174$_A, i ), args ) )
      {
        Eval.eval( ConsesLow.nth( i, forms ) );
      }
    }
    user_actions.delete_user_action( user_actions.user_action_by_id_string( id_string ) );
    cb_utilities.cb_message_page_with_history( $str175$TOE__Forms_Added_to_Agenda, T );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 28765L)
  public static SubLObject destructure_template_op(final SubLObject op)
  {
    SubLObject form = op.first();
    final SubLObject mt = conses_high.second( op );
    SubLObject strength = conses_high.third( op );
    SubLObject direction = conses_high.fourth( op );
    if( form.isString() )
    {
      form = reader.read_from_string( form, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( strength.isString() )
    {
      strength = reader.read_from_string( strength, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( direction.isString() )
    {
      direction = reader.read_from_string( direction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return Values.values( form, mt, strength, direction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 29279L)
  public static SubLObject template_substitute_in_form(final SubLObject alist, final SubLObject form, final SubLObject mt, final SubLObject type)
  {
    SubLObject temp_form = form;
    SubLObject temp_mt = mt;
    SubLObject cdolist_list_var = alist;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject hl_term = pair.rest();
      final SubLObject v_term = cycl_utilities.hl_to_el( hl_term );
      final SubLObject variable = pair.first();
      if( NIL != Strings.string_equal( type, $str67$kill, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        temp_form = list_utilities.quotify( v_term );
      }
      else
      {
        temp_mt = conses_high.subst( v_term, variable, temp_mt, UNPROVIDED, UNPROVIDED );
        temp_form = conses_high.subst( v_term, variable, temp_form, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return Values.values( temp_form, temp_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 29777L)
  public static SubLObject cb_show_template_query(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject query_formula = cb_get_ask_from_args( args );
    final SubLObject query_mt = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != inference )
    {
      html_utilities.html_hidden_input( $str51$inference, cb_query.cb_inference_identifier( inference ), UNPROVIDED );
      cb_show_template_query_inference( inference, UNPROVIDED );
    }
    else
    {
      html_utilities.html_hidden_input( $str120$query_spec, PrintLow.format( NIL, $str177$_S, query_formula ), UNPROVIDED );
      html_utilities.html_hidden_input( $str121$query_mt, cb_utilities.cb_string_for_mt( query_mt ), UNPROVIDED );
      cb_query.cb_show_query( query_formula, query_mt, $str154$Current_query );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30285L)
  public static SubLObject cb_show_template_query_answers(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject query_formula = cb_get_ask_from_args( args );
    final SubLObject query_mt = thread.secondMultipleValue();
    final SubLObject inference = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != inference )
    {
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      cb_query.cb_show_query_answer_section( inference, $template_query_show_answer_count$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30603L)
  public static SubLObject cb_show_template_specification_and_submit(final SubLObject specification_string, final SubLObject submit_input_label, final SubLObject submit_input_string)
  {
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( specification_string );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( submit_input_label, submit_input_string, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 30935L)
  public static SubLObject cb_show_template_input_area(final SubLObject with_strength_and_directionP, SubLObject default_sentence, SubLObject default_mt, SubLObject prefix_string)
  {
    if( default_sentence == UNPROVIDED )
    {
      default_sentence = NIL;
    }
    if( default_mt == UNPROVIDED )
    {
      default_mt = NIL;
    }
    if( prefix_string == UNPROVIDED )
    {
      prefix_string = $str113$template;
    }
    html_utilities.html_newline( UNPROVIDED );
    cb_form_widgets.cb_mt_input_section( default_mt, ConsesLow.listS( $kw118$INPUT_NAME, Sequences.cconcatenate( prefix_string, $str117$_mt ), $list25 ) );
    if( NIL != with_strength_and_directionP )
    {
      cb_assertion_editor.cb_strength_and_direction_section( $str178$strength, $str179$direction, UNPROVIDED );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
    }
    cb_form_widgets.cb_el_sentence_input_section( default_sentence, ConsesLow.listS( $kw118$INPUT_NAME, Sequences.cconcatenate( prefix_string, $str116$_sentence ), $list180 ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 31589L)
  public static SubLObject cb_toe_mt_error_page()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str181$Template_OE__Error;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str3$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str4$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$71 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw5$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw6$CB_CYC );
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
        final SubLObject _prev_bind_0_$72 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str9$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str10$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str11$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str12$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str13$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$74, thread );
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
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            final SubLObject size_val = SIX_INTEGER;
            html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
            if( NIL != size_val )
            {
              html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( size_val );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str182$Cyc_Error );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$75, thread );
            }
            html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_br();
            html_utilities.html_br();
            html_utilities.html_princ( $str183$The_Mt_you_have_entered_is_invali );
            html_utilities.html_br();
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$73, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$72, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$71, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-template-oe.lisp", position = 31858L)
  public static SubLObject cb_get_ask_from_args(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject inference_identifier = html_utilities.html_extract_input( $str51$inference, args );
    final SubLObject inference = cb_query.cb_guess_inference_from_identifier( inference_identifier );
    if( NIL != inference )
    {
      return Values.values( NIL, NIL, inference );
    }
    thread.resetMultipleValues();
    final SubLObject mt = cb_form_widgets.cb_extract_mt_input( args, UNPROVIDED, UNPROVIDED );
    final SubLObject mt_error = thread.secondMultipleValue();
    final SubLObject mt_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != mt_error )
    {
      return cb_form_widgets.cb_mt_error( mt_error, mt_error_string );
    }
    thread.resetMultipleValues();
    final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input( args, $list92 );
    final SubLObject sentence_error = thread.secondMultipleValue();
    final SubLObject sentence_error_string = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != sentence_error )
    {
      return cb_form_widgets.cb_el_sentence_error( sentence_error, sentence_error_string, UNPROVIDED );
    }
    return Values.values( sentence, mt, NIL );
  }

  public static SubLObject declare_cb_template_oe_file()
  {
    SubLFiles.declareFunction( me, "cb_toe_query", "CB-TOE-QUERY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_template_oe_inference", "CB-LINK-TEMPLATE-OE-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_toe_inference", "CB-TOE-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_toe_inference_guts", "CB-TOE-INFERENCE-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template_query_inference", "CB-SHOW-TEMPLATE-QUERY-INFERENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_template_oe", "CB-HANDLE-TEMPLATE-OE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_template_oe_inference_handler", "CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_template_assert", "CB-TEMPLATE-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_unassert", "CB-TEMPLATE-UNASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_edit", "CB-TEMPLATE-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_kill", "CB-TEMPLATE-KILL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_blast", "CB-TEMPLATE-BLAST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_repropagate", "CB-TEMPLATE-REPROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_redo_tms", "CB-TEMPLATE-REDO-TMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_change_assertion_properties", "CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_merge", "CB-TEMPLATE-MERGE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_toe_test_query", "CB-HANDLE-TOE-TEST-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_assert_internals", "CB-TEMPLATE-ASSERT-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_assert", "CB-HANDLE-TEMPLATE-ASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_unassert_internals", "CB-TEMPLATE-UNASSERT-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_unassert", "CB-HANDLE-TEMPLATE-UNASSERT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_edit_internals", "CB-TEMPLATE-EDIT-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_edit", "CB-HANDLE-TEMPLATE-EDIT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_blast_internals", "CB-TEMPLATE-BLAST-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_blast", "CB-HANDLE-TEMPLATE-BLAST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_repropagate_internals", "CB-TEMPLATE-REPROPAGATE-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_repropagate", "CB-HANDLE-TEMPLATE-REPROPAGATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_template_redo_tms_internals", "CB-TEMPLATE-REDO-TMS-INTERNALS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_redo_tms", "CB-HANDLE-TEMPLATE-REDO-TMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_internals", "CB-HANDLE-TEMPLATE-INTERNALS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_template_form_specs", "GET-TEMPLATE-FORM-SPECS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_list_with_query_spec_and_mt", "GET-LIST-WITH-QUERY-SPEC-AND-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_template_output", "CB-HANDLE-TEMPLATE-OUTPUT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_toe_template_forms", "GET-TOE-TEMPLATE-FORMS", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template", "CB-SHOW-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_assertion_template", "CB-SHOW-ASSERTION-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_toe_operations_summary", "CB-TOE-OPERATIONS-SUMMARY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_toe_operations_display", "CB-TOE-OPERATIONS-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_toe_template_results", "CB-SHOW-TOE-TEMPLATE-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_toe_operations_handler", "CB-TOE-OPERATIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "destructure_template_op", "DESTRUCTURE-TEMPLATE-OP", 1, 0, false );
    SubLFiles.declareFunction( me, "template_substitute_in_form", "TEMPLATE-SUBSTITUTE-IN-FORM", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template_query", "CB-SHOW-TEMPLATE-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template_query_answers", "CB-SHOW-TEMPLATE-QUERY-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template_specification_and_submit", "CB-SHOW-TEMPLATE-SPECIFICATION-AND-SUBMIT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_template_input_area", "CB-SHOW-TEMPLATE-INPUT-AREA", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_toe_mt_error_page", "CB-TOE-MT-ERROR-PAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_get_ask_from_args", "CB-GET-ASK-FROM-ARGS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_template_oe_file()
  {
    $template_query_show_answer_count$ = SubLFiles.defparameter( "*TEMPLATE-QUERY-SHOW-ANSWER-COUNT*", TWENTY_INTEGER );
    $cb_toe_resulting_forms_abbreviation_cutoff$ = SubLFiles.defparameter( "*CB-TOE-RESULTING-FORMS-ABBREVIATION-CUTOFF*", $int156$100 );
    return NIL;
  }

  public static SubLObject setup_cb_template_oe_file()
  {
    Hashtables.sethash( $kw0$CB_TOE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str1$cb_toe_html, NIL ) );
    cb_utilities.setup_cb_link_method( $kw44$TEMPLATE_OE_INFERENCE, $sym45$CB_LINK_TEMPLATE_OE_INFERENCE, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym48$CB_TOE_INFERENCE, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym61$CB_HANDLE_TEMPLATE_OE, $kw49$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw53$TEMPLATE_OE_INFERENCE_HANDLER, $sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym64$CB_TEMPLATE_ASSERT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym65$CB_TEMPLATE_UNASSERT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym66$CB_TEMPLATE_EDIT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym68$CB_TEMPLATE_KILL, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym69$CB_TEMPLATE_BLAST, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym70$CB_TEMPLATE_REPROPAGATE, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym71$CB_TEMPLATE_REDO_TMS, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym73$CB_TEMPLATE_MERGE, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym80$CB_HANDLE_TEMPLATE_ASSERT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym86$CB_HANDLE_TEMPLATE_UNASSERT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym94$CB_HANDLE_TEMPLATE_EDIT, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym100$CB_HANDLE_TEMPLATE_BLAST, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym106$CB_HANDLE_TEMPLATE_REPROPAGATE, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym112$CB_HANDLE_TEMPLATE_REDO_TMS, $kw49$HTML_HANDLER );
    final SubLObject new_action_type = user_actions.make_action_type( $list139 );
    user_actions._csetf_action_type_key( new_action_type, $kw133$TOE_OPERATIONS );
    Hashtables.sethash( user_actions.action_type_key( new_action_type ), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type );
    Hashtables.sethash( $kw148$CB_TOE_TEMPLATE_RESULTS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str149$cb_toe_template_results_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym155$CB_TOE_OPERATIONS_DISPLAY, $kw49$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym176$CB_TOE_OPERATIONS_HANDLER, $kw49$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_template_oe_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_template_oe_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_template_oe_file();
  }
  static
  {
    me = new cb_template_oe();
    $template_query_show_answer_count$ = null;
    $cb_toe_resulting_forms_abbreviation_cutoff$ = null;
    $kw0$CB_TOE = makeKeyword( "CB-TOE" );
    $str1$cb_toe_html = makeString( "cb-toe.html" );
    $str2$Template_OE__Query_Specification = makeString( "Template OE: Query Specification" );
    $str3$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str4$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw5$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw6$CB_CYC = makeKeyword( "CB-CYC" );
    $kw7$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw8$SHA1 = makeKeyword( "SHA1" );
    $str9$yui_skin_sam = makeString( "yui-skin-sam" );
    $str10$reloadFrameButton = makeString( "reloadFrameButton" );
    $str11$button = makeString( "button" );
    $str12$reload = makeString( "reload" );
    $str13$Refresh_Frames = makeString( "Refresh Frames" );
    $str14$post = makeString( "post" );
    $str15$cb_handle_template_oe = makeString( "cb-handle-template-oe" );
    $str16$Clear_All_Fields = makeString( "Clear All Fields" );
    $str17$Run_Query = makeString( "Run Query" );
    $str18$query_test = makeString( "query-test" );
    $str19$cb_toe_parameters = makeString( "cb-toe-parameters" );
    $str20$Show = makeString( "Show" );
    $str21$Hide = makeString( "Hide" );
    $str22$Query_Context = makeString( "Query Context" );
    $kw23$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw24$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $list25 = ConsesLow.list( makeKeyword( "ANYTIME-PSC-ALLOWED?" ), NIL );
    $list26 = ConsesLow.list( new SubLObject[] { makeKeyword( "INPUT-NAME" ), makeString( "query-sentence" ), makeKeyword( "COMPLETE-LABEL" ), makeString( "Complete" ), makeKeyword( "CYCLIFY-LABEL" ), makeString(
        "Cyclify" ), makeKeyword( "CLEAR-LABEL" ), makeString( "Clear Sentence" ), makeKeyword( "HEIGHT" ), TEN_INTEGER, makeKeyword( "WIDTH" ), makeInteger( 80 )
    } );
    $str27$Available_Templates_ = makeString( "Available Templates:" );
    $str28$Assert = makeString( "Assert" );
    $str29$template_assert = makeString( "template-assert" );
    $str30$Unassert = makeString( "Unassert" );
    $str31$template_unassert = makeString( "template-unassert" );
    $str32$Edit = makeString( "Edit" );
    $str33$template_edit = makeString( "template-edit" );
    $str34$Kill = makeString( "Kill" );
    $str35$template_kill = makeString( "template-kill" );
    $str36$Blast = makeString( "Blast" );
    $str37$template_blast = makeString( "template-blast" );
    $str38$Repropagate = makeString( "Repropagate" );
    $str39$template_repropagate = makeString( "template-repropagate" );
    $str40$_Template_OE_ = makeString( "[Template OE]" );
    $sym41$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $kw42$SELF = makeKeyword( "SELF" );
    $str43$cb_toe_inference__A = makeString( "cb-toe-inference&~A" );
    $kw44$TEMPLATE_OE_INFERENCE = makeKeyword( "TEMPLATE-OE-INFERENCE" );
    $sym45$CB_LINK_TEMPLATE_OE_INFERENCE = makeSymbol( "CB-LINK-TEMPLATE-OE-INFERENCE" );
    $list46 = ConsesLow.list( makeSymbol( "INFERENCE-IDENTIFIER" ) );
    $str47$That_inference_is_no_longer_avail = makeString( "That inference is no longer available." );
    $sym48$CB_TOE_INFERENCE = makeSymbol( "CB-TOE-INFERENCE" );
    $kw49$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str50$Template_OE__Inference = makeString( "Template OE: Inference" );
    $str51$inference = makeString( "inference" );
    $list52 = ConsesLow.list( makeSymbol( "HANDLER" ), makeSymbol( "LABEL" ) );
    $kw53$TEMPLATE_OE_INFERENCE_HANDLER = makeKeyword( "TEMPLATE-OE-INFERENCE-HANDLER" );
    $list54 = ConsesLow.list( ConsesLow.list( makeString( "template-assert" ), makeString( "[Assert]" ) ), ConsesLow.list( makeString( "template-unassert" ), makeString( "[Unassert]" ) ), ConsesLow.list( makeString(
        "template-edit" ), makeString( "[Edit]" ) ), ConsesLow.list( makeString( "template-kill" ), makeString( "[Kill]" ) ), ConsesLow.list( makeString( "template-blast" ), makeString( "[Blast]" ) ), ConsesLow.list(
            makeString( "template-repropagate" ), makeString( "[Repropagate]" ) ), ConsesLow.list( makeString( "template-redo-tms" ), makeString( "[Redo TMS]" ) ) );
    $str55$Inference___ = makeString( "Inference : " );
    $kw56$INFERENCE = makeKeyword( "INFERENCE" );
    $str57$_Refresh_ = makeString( "[Refresh]" );
    $kw58$DISABLED = makeKeyword( "DISABLED" );
    $str59$template_redo_tms = makeString( "template-redo-tms" );
    $str60$Submission_was_not_understood_ = makeString( "Submission was not understood." );
    $sym61$CB_HANDLE_TEMPLATE_OE = makeSymbol( "CB-HANDLE-TEMPLATE-OE" );
    $str62$cb_handle_template_oe__A__A_infer = makeString( "cb-handle-template-oe&~A=~A&inference=~A" );
    $sym63$CB_LINK_TEMPLATE_OE_INFERENCE_HANDLER = makeSymbol( "CB-LINK-TEMPLATE-OE-INFERENCE-HANDLER" );
    $sym64$CB_TEMPLATE_ASSERT = makeSymbol( "CB-TEMPLATE-ASSERT" );
    $sym65$CB_TEMPLATE_UNASSERT = makeSymbol( "CB-TEMPLATE-UNASSERT" );
    $sym66$CB_TEMPLATE_EDIT = makeSymbol( "CB-TEMPLATE-EDIT" );
    $str67$kill = makeString( "kill" );
    $sym68$CB_TEMPLATE_KILL = makeSymbol( "CB-TEMPLATE-KILL" );
    $sym69$CB_TEMPLATE_BLAST = makeSymbol( "CB-TEMPLATE-BLAST" );
    $sym70$CB_TEMPLATE_REPROPAGATE = makeSymbol( "CB-TEMPLATE-REPROPAGATE" );
    $sym71$CB_TEMPLATE_REDO_TMS = makeSymbol( "CB-TEMPLATE-REDO-TMS" );
    $sym72$CB_TEMPLATE_CHANGE_ASSERTION_PROPERTIES = makeSymbol( "CB-TEMPLATE-CHANGE-ASSERTION-PROPERTIES" );
    $sym73$CB_TEMPLATE_MERGE = makeSymbol( "CB-TEMPLATE-MERGE" );
    $str74$Template_OE__Query_Results = makeString( "Template OE: Query Results" );
    $str75$Template_OE__Assert = makeString( "Template OE: Assert" );
    $str76$cb_handle_template_assert = makeString( "cb-handle-template-assert" );
    $str77$Assert_Specification = makeString( "Assert Specification" );
    $str78$Run_Template_Assert = makeString( "Run Template Assert" );
    $str79$assert = makeString( "assert" );
    $sym80$CB_HANDLE_TEMPLATE_ASSERT = makeSymbol( "CB-HANDLE-TEMPLATE-ASSERT" );
    $str81$Template_OE__Unassert = makeString( "Template OE: Unassert" );
    $str82$cb_handle_template_unassert = makeString( "cb-handle-template-unassert" );
    $str83$Unassert_Specification = makeString( "Unassert Specification" );
    $str84$Run_Template_Unassert = makeString( "Run Template Unassert" );
    $str85$unassert = makeString( "unassert" );
    $sym86$CB_HANDLE_TEMPLATE_UNASSERT = makeSymbol( "CB-HANDLE-TEMPLATE-UNASSERT" );
    $str87$Template_OE__Edit = makeString( "Template OE: Edit" );
    $str88$cb_handle_template_edit = makeString( "cb-handle-template-edit" );
    $str89$Edit_Specification = makeString( "Edit Specification" );
    $str90$Run_Template_Edit = makeString( "Run Template Edit" );
    $str91$edit = makeString( "edit" );
    $list92 = ConsesLow.list( makeKeyword( "INPUT-NAME" ), makeString( "query-sentence" ) );
    $str93$mt_monad = makeString( "mt-monad" );
    $sym94$CB_HANDLE_TEMPLATE_EDIT = makeSymbol( "CB-HANDLE-TEMPLATE-EDIT" );
    $str95$Template_OE__Blast = makeString( "Template OE: Blast" );
    $str96$cb_handle_template_blast = makeString( "cb-handle-template-blast" );
    $str97$Blast_Specification = makeString( "Blast Specification" );
    $str98$Run_Template_Blast = makeString( "Run Template Blast" );
    $str99$blast = makeString( "blast" );
    $sym100$CB_HANDLE_TEMPLATE_BLAST = makeSymbol( "CB-HANDLE-TEMPLATE-BLAST" );
    $str101$Template_OE__Repropagate = makeString( "Template OE: Repropagate" );
    $str102$cb_handle_template_repropagate = makeString( "cb-handle-template-repropagate" );
    $str103$Repropagate_Specification = makeString( "Repropagate Specification" );
    $str104$Run_Template_Repropagate = makeString( "Run Template Repropagate" );
    $str105$repropagate = makeString( "repropagate" );
    $sym106$CB_HANDLE_TEMPLATE_REPROPAGATE = makeSymbol( "CB-HANDLE-TEMPLATE-REPROPAGATE" );
    $str107$Template_OE__Redo_TMS = makeString( "Template OE: Redo TMS" );
    $str108$cb_handle_template_redo_tms = makeString( "cb-handle-template-redo-tms" );
    $str109$Redo_TMS_Specification = makeString( "Redo TMS Specification" );
    $str110$Run_Template_Redo_TMS = makeString( "Run Template Redo TMS" );
    $str111$redo_tms = makeString( "redo-tms" );
    $sym112$CB_HANDLE_TEMPLATE_REDO_TMS = makeSymbol( "CB-HANDLE-TEMPLATE-REDO-TMS" );
    $str113$template = makeString( "template" );
    $list114 = ConsesLow.list( makeString( "unassert" ), makeString( "blast" ), makeString( "repropagate" ), makeString( "redo-tms" ) );
    $sym115$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $str116$_sentence = makeString( "-sentence" );
    $str117$_mt = makeString( "-mt" );
    $kw118$INPUT_NAME = makeKeyword( "INPUT-NAME" );
    $list119 = ConsesLow.list( makeKeyword( "ALLOW-VARIABLE?" ), T );
    $str120$query_spec = makeString( "query-spec" );
    $str121$query_mt = makeString( "query-mt" );
    $kw122$DEFAULT = makeKeyword( "DEFAULT" );
    $sym123$KE_KILL = makeSymbol( "KE-KILL" );
    $sym124$KE_ASSERT = makeSymbol( "KE-ASSERT" );
    $sym125$QUOTE = makeSymbol( "QUOTE" );
    $sym126$KE_UNASSERT = makeSymbol( "KE-UNASSERT" );
    $sym127$FI_BLAST = makeSymbol( "FI-BLAST" );
    $sym128$KE_REPROPAGATE_ASSERTION = makeSymbol( "KE-REPROPAGATE-ASSERTION" );
    $sym129$FIND_ASSERTION_CYCL = makeSymbol( "FIND-ASSERTION-CYCL" );
    $sym130$KE_TMS_RECONSIDER_ASSERTION = makeSymbol( "KE-TMS-RECONSIDER-ASSERTION" );
    $kw131$CYCLIST = makeKeyword( "CYCLIST" );
    $kw132$TYPE_KEY = makeKeyword( "TYPE-KEY" );
    $kw133$TOE_OPERATIONS = makeKeyword( "TOE-OPERATIONS" );
    $kw134$DATA = makeKeyword( "DATA" );
    $str135$Current_ = makeString( "Current " );
    $str136$_Template_in_ = makeString( " Template in " );
    $str137$__ = makeString( " :" );
    $str138$Submission_was_not_understood = makeString( "Submission was not understood" );
    $list139 = ConsesLow.list( makeKeyword( "SUMMARY-FN" ), makeSymbol( "CB-TOE-OPERATIONS-SUMMARY" ), makeKeyword( "DISPLAY-FN" ), makeSymbol( "CB-TOE-OPERATIONS-DISPLAY" ), makeKeyword( "HANDLER-FN" ), makeSymbol(
        "CB-TOE-OPERATIONS-HANDLER" ) );
    $str140$Evaluate_ = makeString( "Evaluate " );
    $str141$_forms_from_ = makeString( " forms from " );
    $str142$_template_ = makeString( " template " );
    $str143$_in_ = makeString( " in " );
    $str144$_with_bindings_from_ = makeString( " with bindings from " );
    $str145$_with_query = makeString( " with query" );
    $list146 = ConsesLow.list( makeSymbol( "QUERY" ), makeSymbol( "MT" ) );
    $str147$query_ = makeString( "query " );
    $kw148$CB_TOE_TEMPLATE_RESULTS = makeKeyword( "CB-TOE-TEMPLATE-RESULTS" );
    $str149$cb_toe_template_results_html = makeString( "cb-toe-template-results.html" );
    $str150$Template_OE__Resulting_Forms = makeString( "Template OE: Resulting Forms" );
    $str151$cb_toe_operations_handler = makeString( "cb-toe-operations-handler" );
    $str152$id_string = makeString( "id-string" );
    $str153$Current_Inference___ = makeString( "Current Inference : " );
    $str154$Current_query = makeString( "Current query" );
    $sym155$CB_TOE_OPERATIONS_DISPLAY = makeSymbol( "CB-TOE-OPERATIONS-DISPLAY" );
    $int156$100 = makeInteger( 100 );
    $str157$Add_Forms_to_Agenda = makeString( "Add Forms to Agenda" );
    $str158$boxes = makeString( "boxes" );
    $str159$100_ = makeString( "100%" );
    $str160$OK_ = makeString( "OK?" );
    $str161$_2 = makeString( "+2" );
    $str162$Operations_ = makeString( "Operations:" );
    $str163$Below_forms_abbreviated__no_links = makeString( "Below forms abbreviated (no links) since there are more than " );
    $str164$_of_them_ = makeString( " of them." );
    $str165$_dddddd = makeString( "#dddddd" );
    $str166$_cccccc = makeString( "#cccccc" );
    $kw167$CENTER = makeKeyword( "CENTER" );
    $str168$_Check_All_ = makeString( "[Check All]" );
    $str169$this_document_forms_0_ = makeString( "this.document.forms[0]" );
    $str170$__ = makeString( ".*" );
    $str171$T = makeString( "T" );
    $str172$_Uncheck_All_ = makeString( "[Uncheck All]" );
    $str173$NIL = makeString( "NIL" );
    $str174$_A = makeString( "~A" );
    $str175$TOE__Forms_Added_to_Agenda = makeString( "TOE: Forms Added to Agenda" );
    $sym176$CB_TOE_OPERATIONS_HANDLER = makeSymbol( "CB-TOE-OPERATIONS-HANDLER" );
    $str177$_S = makeString( "~S" );
    $str178$strength = makeString( "strength" );
    $str179$direction = makeString( "direction" );
    $list180 = ConsesLow.list( new SubLObject[] { makeKeyword( "COMPLETE-LABEL" ), makeString( "Complete" ), makeKeyword( "CYCLIFY-LABEL" ), makeString( "Cyclify" ), makeKeyword( "CLEAR-LABEL" ), makeString(
        "Clear Sentence" ), makeKeyword( "HEIGHT" ), TEN_INTEGER, makeKeyword( "WIDTH" ), makeInteger( 80 )
    } );
    $str181$Template_OE__Error = makeString( "Template OE: Error" );
    $str182$Cyc_Error = makeString( "Cyc Error" );
    $str183$The_Mt_you_have_entered_is_invali = makeString( "The Mt you have entered is invalid." );
  }
}
/*
 * 
 * Total time: 1014 ms
 * 
 */