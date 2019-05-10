package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
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

public final class cb_sme_lexification_wizard
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_sme_lexification_wizard";
  public static final String myFingerPrint = "8b99d6aea64c86a19d3be5aeaa6d103d9d9d41c063d4296cad7255e268ba7919";
  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 933L)
  public static SubLSymbol $sme_lexwiz_verboseP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1066L)
  private static SubLSymbol $html_tab_expansion$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1239L)
  private static SubLSymbol $max_sme_listbox_size$;
  private static final SubLSymbol $sym0$_SME_LEXWIZ_VERBOSE__;
  private static final SubLString $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb;
  private static final SubLSymbol $sym2$HTML_QUESTION_ANSWERING_AGENT;
  private static final SubLSymbol $sym3$QUESTION_ANSWERING_AGENT;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$OBJECT;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS;
  private static final SubLSymbol $sym8$ISOLATED_P;
  private static final SubLSymbol $sym9$INSTANCE_NUMBER;
  private static final SubLSymbol $sym10$ID;
  private static final SubLSymbol $sym11$TITLE;
  private static final SubLSymbol $sym12$QUESTION;
  private static final SubLSymbol $sym13$TIP;
  private static final SubLSymbol $sym14$QUESTION_TYPE;
  private static final SubLSymbol $sym15$ERROR_MESSAGE;
  private static final SubLSymbol $sym16$CHOICES;
  private static final SubLSymbol $sym17$DESCRIPTIONS;
  private static final SubLSymbol $sym18$VALUES;
  private static final SubLSymbol $sym19$DEFAULT;
  private static final SubLSymbol $sym20$ANSWER;
  private static final SubLSymbol $sym21$FIELD_WIDTH;
  private static final SubLSymbol $sym22$FIELD_LABELS;
  private static final SubLSymbol $sym23$PROXY;
  private static final SubLSymbol $sym24$CALLBACK_FUNCTION;
  private static final SubLSymbol $sym25$CLIENT_DATA;
  private static final SubLSymbol $sym26$USER_DATA;
  private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC;
  private static final SubLSymbol $sym28$DISPLAY_QUESTION;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLString $str31$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str32$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw33$UNINITIALIZED;
  private static final SubLSymbol $sym34$DISPLAY_QUESTION_PREAMBLE;
  private static final SubLString $str35$post;
  private static final SubLString $str36$handle_html_question_answering;
  private static final SubLSymbol $sym37$DISPLAY_QUESTION_TRAILER;
  private static final SubLSymbol $sym38$_EXIT;
  private static final SubLSymbol $sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $kw42$SME_LEXWIZ;
  private static final SubLSymbol $sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD;
  private static final SubLSymbol $sym46$DISPLAY_QUESTION_PROPER;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD;
  private static final SubLSymbol $kw49$RED;
  private static final SubLString $str50$Error__;
  private static final SubLString $str51$_object_id;
  private static final SubLSymbol $kw52$BOOLEAN;
  private static final SubLString $str53$_positive_choice;
  private static final SubLString $str54$_yes;
  private static final SubLString $str55$_negative_choice;
  private static final SubLString $str56$_no;
  private static final SubLSymbol $kw57$ENUMERATED;
  private static final SubLString $str58$_response;
  private static final SubLString $str59$OK;
  private static final SubLString $str60$_ok;
  private static final SubLSymbol $kw61$MULTIPLE_SELECTION;
  private static final SubLString $str62$Submit;
  private static final SubLSymbol $kw63$FREE_FORM;
  private static final SubLSymbol $kw64$MULTIPLE_FREE_FORM;
  private static final SubLString $str65$_a__;
  private static final SubLString $str66$Tip_;
  private static final SubLSymbol $sym67$LEXIFICATION_PARAMETERS;
  private static final SubLString $str68$Warning__;
  private static final SubLString $str69$____assertion_failed___a______;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD;
  private static final SubLString $str72$sme_lexwiz_html;
  private static final SubLString $str73$the__A;
  private static final SubLString $str74$_id;
  private static final SubLString $str75$cb_handle_sme_lexification_wizard;
  private static final SubLString $str76$_Specify_the_term_and_phrase_for_;
  private static final SubLString $str77$_cyc_term;
  private static final SubLString $str78$Complete;
  private static final SubLString $str79$Term__;
  private static final SubLInteger $int80$50;
  private static final SubLString $str81$Clear_Term;
  private static final SubLString $str82$_create_term;
  private static final SubLString $str83$Create_Term_;
  private static final SubLString $str84$Phrase__;
  private static final SubLString $str85$_phrase;
  private static final SubLInteger $int86$60;
  private static final SubLString $str87$Clear_Phrase;
  private static final SubLString $str88$Error__;
  private static final SubLString $str89$Reset;
  private static final SubLString $str90$_reset;
  private static final SubLInteger $int91$30;
  private static final SubLString $str92$Next_Lexification;
  private static final SubLString $str93$_next_action;
  private static final SubLString $str94$Skip_Lexification;
  private static final SubLString $str95$_skip_action;
  private static final SubLString $str96$_Reason__optional___;
  private static final SubLString $str97$_comment;
  private static final SubLString $str98$;
  private static final SubLInteger $int99$40;
  private static final SubLSymbol $sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD;
  private static final SubLSymbol $kw101$HTML_HANDLER;
  private static final SubLString $str102$_Invoke_Lexification_Assistant_;
  private static final SubLString $str103$Note__For_more_control_over_the_l;
  private static final SubLSymbol $kw104$OE_LEXIFY_TERM;
  private static final SubLString $str105$sme_lexification_wizard;
  private static final SubLSymbol $kw106$MAIN;
  private static final SubLString $str107$cb_invoke_sme_lexification_wizard;
  private static final SubLSymbol $kw108$SME_LEXIFICATION_WIZARD;
  private static final SubLSymbol $sym109$CB_LINK_SME_LEXIFICATION_WIZARD;
  private static final SubLString $str110$SmeLex;
  private static final SubLString $str111$Perform_lexification_with_SME_lex;
  private static final SubLString $str112$Please_specify_a_valid_term;
  private static final SubLString $str113$Please_specify_a_phrase;
  private static final SubLSymbol $sym114$SME_LEXIFICATION_WIZARD;
  private static final SubLSymbol $sym115$NEW;
  private static final SubLSymbol $sym116$LEXWIZ_PARAMETERS;
  private static final SubLSymbol $sym117$LEXIFY;
  private static final SubLSymbol $sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$NOTIFY_CLIENT;
  private static final SubLSymbol $kw121$INPUT_READY;
  private static final SubLString $str122$Unable_to_resolve_question_into_u;
  private static final SubLSymbol $sym123$HANDLE_HTML_QUESTION_ANSWERING;
  private static final SubLString $str124$_br_;
  private static final SubLList $list125;

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
  public static SubLObject subloop_reserved_initialize_html_question_answering_agent_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
  public static SubLObject subloop_reserved_initialize_html_question_answering_agent_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym10$ID, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym11$TITLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym12$QUESTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym13$TIP, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym14$QUESTION_TYPE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym15$ERROR_MESSAGE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym16$CHOICES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym17$DESCRIPTIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym18$VALUES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym19$DEFAULT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym20$ANSWER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym21$FIELD_WIDTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym22$FIELD_LABELS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym23$PROXY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym24$CALLBACK_FUNCTION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym25$CLIENT_DATA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$QUESTION_ANSWERING_AGENT, $sym26$USER_DATA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1347L)
  public static SubLObject html_question_answering_agent_p(final SubLObject html_question_answering_agent)
  {
    return classes.subloop_instanceof_class( html_question_answering_agent, $sym2$HTML_QUESTION_ANSWERING_AGENT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 1790L)
  public static SubLObject html_question_answering_agent_display_question_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str31$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str32$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw33$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      methods.funcall_instance_method_with_0_args( self, $sym34$DISPLAY_QUESTION_PREAMBLE );
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
      html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str35$post );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != frame_name_var )
      {
        html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
      final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_macros.$within_html_form$.bind( T, thread );
        html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
        html_utilities.html_hidden_input( $str36$handle_html_question_answering, T, UNPROVIDED );
        html_question_answering_agent_display_question_proper_method( self );
        html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
      }
      finally
      {
        html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
        html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
      methods.funcall_instance_method_with_0_args( self, $sym37$DISPLAY_QUESTION_TRAILER );
      return NIL;
    }
    finally
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 2463L)
  public static SubLObject html_question_answering_agent_display_question_preamble_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_question_answering_agent_method = NIL;
    final SubLObject title = sme_lexification_wizard.get_question_answering_agent_title( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        final SubLObject title_$2 = sme_lexification_wizard.sme_lexwiz_title();
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
        html_utilities.html_princ( title_$2 );
        html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_princ( title_$2 );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( TWO_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
        html_utilities.html_markup( FOUR_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        cb_utilities.cb_help_preamble( $kw42$SME_LEXWIZ, UNPROVIDED, UNPROVIDED );
        html_utilities.html_princ( title );
        html_utilities.html_newline( TWO_INTEGER );
        html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
        html_utilities.html_markup( FOUR_INTEGER );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_question_answering_agent_title( self, title );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_html_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 3346L)
  public static SubLObject html_question_answering_agent_display_question_trailer_method(final SubLObject self)
  {
    html_utilities.html_copyright_notice();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 3537L)
  public static SubLObject html_question_answering_agent_display_question_proper_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_html_question_answering_agent_method = NIL;
    final SubLObject user_data = sme_lexification_wizard.get_question_answering_agent_user_data( self );
    final SubLObject field_labels = sme_lexification_wizard.get_question_answering_agent_field_labels( self );
    final SubLObject field_width = sme_lexification_wizard.get_question_answering_agent_field_width( self );
    final SubLObject v_default = sme_lexification_wizard.get_question_answering_agent_default( self );
    final SubLObject values = sme_lexification_wizard.get_question_answering_agent_values( self );
    final SubLObject descriptions = sme_lexification_wizard.get_question_answering_agent_descriptions( self );
    final SubLObject choices = sme_lexification_wizard.get_question_answering_agent_choices( self );
    final SubLObject error_message = sme_lexification_wizard.get_question_answering_agent_error_message( self );
    final SubLObject question_type = sme_lexification_wizard.get_question_answering_agent_question_type( self );
    final SubLObject tip = sme_lexification_wizard.get_question_answering_agent_tip( self );
    final SubLObject v_question = sme_lexification_wizard.get_question_answering_agent_question( self );
    final SubLObject id = sme_lexification_wizard.get_question_answering_agent_id( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD );
      try
      {
        if( NIL != error_message )
        {
          final SubLObject color_val = $kw49$RED;
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != color_val )
          {
            html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( color_val ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str50$Error__ );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_princ( error_message );
            html_utilities.html_newline( TWO_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_encode_text( v_question ) );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_hidden_input( $str51$_object_id, id, UNPROVIDED );
        sme_lexification_wizard.set_object_data( id, self );
        final SubLObject pcase_var = question_type;
        if( pcase_var.eql( $kw52$BOOLEAN ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_hidden_input( $str53$_positive_choice, sme_lexification_wizard.question_answering_agent_positive_choice_method( self ), UNPROVIDED );
          html_utilities.html_submit_input( sme_lexification_wizard.question_answering_agent_positive_choice_method( self ), $str54$_yes, UNPROVIDED );
          html_utilities.html_hidden_input( $str55$_negative_choice, sme_lexification_wizard.question_answering_agent_negative_choice_method( self ), UNPROVIDED );
          html_utilities.html_submit_input( sme_lexification_wizard.question_answering_agent_negative_choice_method( self ), $str56$_no, UNPROVIDED );
        }
        else if( pcase_var.eql( $kw57$ENUMERATED ) )
        {
          final SubLObject listbox_size = Numbers.min( Sequences.length( choices ), $max_sme_listbox_size$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          if( NIL != choices )
          {
            html_utilities.html_create_radiobox_form( $str58$_response, choices, values, v_default, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
          }
          html_utilities.html_submit_input( $str59$OK, $str60$_ok, UNPROVIDED );
        }
        else if( pcase_var.eql( $kw61$MULTIPLE_SELECTION ) )
        {
          final SubLObject listbox_size = Numbers.min( Sequences.length( choices ), $max_sme_listbox_size$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.create_multiple_selection_listbox( $str58$_response, choices, values, listbox_size, v_default );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_submit_input( $str62$Submit, $str60$_ok, UNPROVIDED );
        }
        else if( pcase_var.eql( $kw63$FREE_FORM ) )
        {
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_text_input( $str58$_response, v_default, field_width );
          html_utilities.html_submit_input( $str62$Submit, $str60$_ok, UNPROVIDED );
        }
        else if( pcase_var.eql( $kw64$MULTIPLE_FREE_FORM ) )
        {
          html_utilities.html_newline( UNPROVIDED );
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
            SubLObject list_var = NIL;
            SubLObject label = NIL;
            SubLObject i = NIL;
            list_var = field_labels;
            label = list_var.first();
            for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), label = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
            {
              final SubLObject default_value = Sequences.elt( v_default, i );
              final SubLObject optional_description = Sequences.elt( descriptions, i );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str65$_a__, label );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_text_input( $str58$_response, default_value, field_width );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                if( NIL != string_utilities.non_empty_stringP( optional_description ) )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( optional_description );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
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
          html_utilities.html_submit_input( $str62$Submit, $str60$_ok, UNPROVIDED );
        }
        html_utilities.html_newline( UNPROVIDED );
        if( NIL != tip && NIL != $sme_lexwiz_verboseP$.getDynamicValue( thread ) )
        {
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ( $str66$Tip_ );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_markup( html_encode_text( tip ) );
          html_utilities.html_newline( TWO_INTEGER );
        }
        final SubLObject lexwiz_parameters = user_data;
        if( Types.type_of( lexwiz_parameters ) != $sym67$LEXIFICATION_PARAMETERS && lexification_utilities.$lex_trace_level$.getDynamicValue( thread ).numGE( Numbers.max( lexification_utilities.$lex_trace_level$
            .getDynamicValue( thread ), lexification_utilities.$lex_basic$.getGlobalValue() ) ) )
        {
          PrintLow.format( StreamsLow.$trace_output$.getDynamicValue( thread ), Sequences.cconcatenate( $str68$Warning__, $str69$____assertion_failed___a______ ), $list70 );
          streams_high.force_output( StreamsLow.$trace_output$.getDynamicValue( thread ) );
        }
        add_oe_lexification_link( lexification_wizard.lexwiz_id( lexwiz_parameters ) );
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sme_lexification_wizard.set_question_answering_agent_user_data( self, user_data );
          sme_lexification_wizard.set_question_answering_agent_field_labels( self, field_labels );
          sme_lexification_wizard.set_question_answering_agent_field_width( self, field_width );
          sme_lexification_wizard.set_question_answering_agent_default( self, v_default );
          sme_lexification_wizard.set_question_answering_agent_values( self, values );
          sme_lexification_wizard.set_question_answering_agent_descriptions( self, descriptions );
          sme_lexification_wizard.set_question_answering_agent_choices( self, choices );
          sme_lexification_wizard.set_question_answering_agent_error_message( self, error_message );
          sme_lexification_wizard.set_question_answering_agent_question_type( self, question_type );
          sme_lexification_wizard.set_question_answering_agent_tip( self, tip );
          sme_lexification_wizard.set_question_answering_agent_question( self, v_question );
          sme_lexification_wizard.set_question_answering_agent_id( self, id );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_html_question_answering_agent_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_html_question_answering_agent_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 7495L)
  public static SubLObject cb_invoke_sme_lexification_wizard(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( PrintLow.format( NIL, $str73$the__A, sme_lexification_wizard.sme_lexwiz_title() ) );
      return NIL;
    }
    lexification_wizard.$sme_lexwiz_active$.setDynamicValue( T, thread );
    lexification_wizard.init_lexification_wizard( UNPROVIDED );
    final SubLObject old_id = html_utilities.html_extract_input( $str74$_id, args );
    final SubLObject old_object = lexification_wizard.get_lexification_object( old_id );
    final SubLObject default_params = ( NIL != old_object ) ? lexification_wizard.copy_lexification_parameters( old_object )
        : lexification_wizard.copy_lexification_parameters( lexification_wizard.$lexwiz_defaults$.getDynamicValue( thread ) );
    final SubLObject id = lexification_wizard.lexwiz_id( default_params );
    final SubLObject lex_term = misc_kb_utilities.coerce_name( lexification_wizard.lexwiz_term( default_params ) );
    final SubLObject cyc_term = lexification_utilities.lex_fort_for_string( lex_term );
    final SubLObject lex_phrase = lexification_utilities.string_for_field( lexification_wizard.lexwiz_phrase( default_params ) );
    lexification_wizard.trace_lexification_parameters( default_params, UNPROVIDED );
    html_utilities.html_markup( $str31$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str32$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw33$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( sme_lexification_wizard.sme_lexwiz_title() );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_complete.html_complete_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( sme_lexification_wizard.sme_lexwiz_title() );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != html_macros.$html_form_method_post$.getGlobalValue() )
          {
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method_post$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str75$cb_handle_sme_lexification_wizard, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
            html_utilities.html_markup( FOUR_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            cb_utilities.cb_help_preamble( $kw42$SME_LEXWIZ, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str76$_Specify_the_term_and_phrase_for_ );
            html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
            html_utilities.html_markup( FOUR_INTEGER );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            html_utilities.html_hidden_input( $str74$_id, id, UNPROVIDED );
            html_complete.html_complete_button( $str77$_cyc_term, $str78$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( $str79$Term__ );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_text_input( $str77$_cyc_term, lex_term, $int80$50 );
            html_utilities.html_indent( ONE_INTEGER );
            html_script_utilities.html_clear_input_button( $str77$_cyc_term, $str81$Clear_Term, UNPROVIDED );
            if( NIL == cyc_term && string_utilities.char_at( lex_term, ZERO_INTEGER ).eql( Characters.CHAR_lparen ) )
            {
              html_utilities.html_checkbox_input( $str82$_create_term, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_princ( $str83$Create_Term_ );
            }
            html_utilities.html_newline( UNPROVIDED );
            final SubLObject phrase_label = $str84$Phrase__;
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            html_utilities.html_princ( phrase_label );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            html_utilities.html_indent( ONE_INTEGER );
            html_utilities.html_text_input( $str85$_phrase, lex_phrase, $int86$60 );
            html_utilities.html_indent( ONE_INTEGER );
            html_script_utilities.html_clear_input_button( $str85$_phrase, $str87$Clear_Phrase, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            if( NIL != lexification_wizard.lexwiz_error_message( default_params ) )
            {
              html_utilities.html_newline( UNPROVIDED );
              final SubLObject color_val = $kw49$RED;
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != color_val )
              {
                html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_color( color_val ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ( $str88$Error__ );
                html_utilities.html_indent( ONE_INTEGER );
                html_utilities.html_princ( lexification_wizard.lexwiz_error_message( default_params ) );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              html_utilities.html_newline( TWO_INTEGER );
            }
            html_utilities.html_submit_input( $str89$Reset, $str90$_reset, UNPROVIDED );
            html_utilities.html_submit_input( $str59$OK, $str60$_ok, UNPROVIDED );
            html_utilities.html_indent( $int91$30 );
            if( NIL != lexification_utilities.lex_empty_stringP( lex_term ) && NIL != lexification_reminders.lexification_user_actions( UNPROVIDED ) )
            {
              html_utilities.html_submit_input( $str92$Next_Lexification, $str93$_next_action, UNPROVIDED );
            }
            if( NIL != lexification_wizard.lexwiz_user_action( default_params ) )
            {
              html_utilities.html_submit_input( $str94$Skip_Lexification, $str95$_skip_action, UNPROVIDED );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str96$_Reason__optional___ );
              html_utilities.html_text_input( $str97$_comment, $str98$, $int99$40 );
            }
            html_utilities.html_newline( UNPROVIDED );
            if( NIL != $sme_lexwiz_verboseP$.getDynamicValue( thread ) )
            {
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str66$Tip_ );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_encode_text( sme_lexification_wizard.phrase_specification_tip() ) );
              html_utilities.html_newline( UNPROVIDED );
            }
            add_oe_lexification_link( id );
            if( NIL != cyc_term && NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue() )
            {
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_browser.cb_print_documentation_information( cyc_term, T );
              html_utilities.html_newline( UNPROVIDED );
              cb_browser.cb_print_definitional_information( cyc_term );
              html_utilities.html_newline( UNPROVIDED );
              cb_lexical_info.cb_print_lexical_information( cyc_term, UNPROVIDED );
              html_utilities.html_newline( UNPROVIDED );
            }
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
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
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 11501L)
  public static SubLObject add_oe_lexification_link(final SubLObject lexwiz_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fort = lexification_wizard.resolve_lexwiz_object_fort( lexwiz_id );
    final SubLObject lexifier_link_text = $str102$_Invoke_Lexification_Assistant_;
    if( NIL == lexification_utilities.is_relationalP( fort ) || NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue( thread ) )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ( $str103$Note__For_more_control_over_the_l );
      cb_utilities.cb_link( $kw104$OE_LEXIFY_TERM, lexwiz_id, lexifier_link_text, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 12169L)
  public static SubLObject cb_link_sme_lexification_wizard(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str105$sme_lexification_wizard;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw106$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str107$cb_invoke_sme_lexification_wizard );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 12534L)
  public static SubLObject cb_handle_sme_lexification_wizard(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject id = html_utilities.html_extract_input( $str74$_id, args );
    final SubLObject default_params = lexification_wizard.get_lexification_object( id );
    final SubLObject lex_term = html_utilities.html_extract_input( $str77$_cyc_term, args );
    SubLObject cyc_term = lexification_utilities.lex_fort_for_string( lex_term );
    final SubLObject create_termP = html_utilities.html_extract_input( $str82$_create_term, args );
    final SubLObject is_relational_termP = lexification_utilities.is_relationalP( cyc_term );
    final SubLObject lex_mt = ( NIL != is_relational_termP ) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue( thread ) : lexicon_vars.$default_lexification_mt$.getDynamicValue( thread );
    final SubLObject mt = lexification_utilities.lex_fort_for_string( lex_mt );
    final SubLObject lex_phrase = html_utilities.html_extract_string( $str85$_phrase, args, UNPROVIDED );
    final SubLObject resetP = html_utilities.html_extract_input( $str90$_reset, args );
    final SubLObject next_actionP = html_utilities.html_extract_input( $str93$_next_action, args );
    final SubLObject skip_actionP = html_utilities.html_extract_input( $str95$_skip_action, args );
    SubLObject re_invoke = NIL;
    lexification_wizard._csetf_lexwiz_error_message( default_params, NIL );
    if( NIL != resetP )
    {
      sme_lexification_wizard.reset_sme_lexification_parameters();
      return cb_invoke_sme_lexification_wizard( UNPROVIDED );
    }
    if( NIL != next_actionP )
    {
      return lexification_reminders.lexify_next_user_action( UNPROVIDED );
    }
    if( NIL != skip_actionP )
    {
      lexification_reminders.remove_lexification_user_action( default_params, lexification_wizard.lexwiz_user_action( default_params ) );
      final SubLObject result = lexification_reminders.lexify_next_user_action( UNPROVIDED );
      return ( NIL != result ) ? result : cb_invoke_sme_lexification_wizard( UNPROVIDED );
    }
    if( NIL != create_termP )
    {
      cyc_term = misc_kb_utilities.find_or_create_nart_from_text( lex_term );
    }
    if( NIL != sme_lexification_wizard.$verify_beforehandP$.getGlobalValue() )
    {
      if( NIL == forts.fort_p( cyc_term ) )
      {
        lexification_wizard._csetf_lexwiz_error_message( default_params, $str112$Please_specify_a_valid_term );
      }
      if( NIL == string_utilities.non_empty_stringP( lex_phrase ) )
      {
        lexification_wizard._csetf_lexwiz_error_message( default_params, $str113$Please_specify_a_phrase );
      }
    }
    if( NIL != lexification_wizard.lexwiz_error_message( default_params ) )
    {
      re_invoke = T;
      lexification_wizard._csetf_lexwiz_term( default_params, lex_term );
      lexification_wizard._csetf_lexwiz_phrase( default_params, lex_phrase );
      lexification_wizard._csetf_lexwiz_mt( default_params, lex_mt );
    }
    else
    {
      final SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args( $sym114$SME_LEXIFICATION_WIZARD, $sym115$NEW );
      instances.set_slot( sme_lexwiz, $sym116$LEXWIZ_PARAMETERS, lexification_wizard.copy_lexification_parameters( default_params ) );
      methods.funcall_instance_method_with_3_args( sme_lexwiz, $sym117$LEXIFY, cyc_term, lex_phrase, mt );
      sme_lexification_wizard.reset_sme_lexification_parameters();
    }
    return ( NIL != re_invoke ) ? cb_invoke_sme_lexification_wizard( args ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 15897L)
  public static SubLObject handle_html_question_answering(final SubLObject args)
  {
    final SubLObject id = html_utilities.html_extract_input( $str51$_object_id, args );
    final SubLObject html_question_object = sme_lexification_wizard.get_object_data( id );
    SubLObject response = html_utilities.html_extract_input_values( $str58$_response, args );
    final SubLObject positive_choice = html_utilities.html_extract_input( $str53$_positive_choice, args );
    final SubLObject negative_choice = html_utilities.html_extract_input( $str55$_negative_choice, args );
    final SubLObject yesP = html_utilities.html_extract_input( $str54$_yes, args );
    final SubLObject noP = html_utilities.html_extract_input( $str56$_no, args );
    sme_lexification_wizard.lex_describe_instance( lexification_utilities.$lex_very_verbose$.getGlobalValue(), html_question_object );
    if( NIL == subl_promotions.memberP( instances.get_slot( html_question_object, $sym14$QUESTION_TYPE ), $list119, UNPROVIDED, UNPROVIDED ) )
    {
      response = response.first();
    }
    if( NIL != yesP )
    {
      response = positive_choice;
    }
    if( NIL != noP )
    {
      response = negative_choice;
    }
    if( NIL != html_question_object )
    {
      instances.set_slot( html_question_object, $sym10$ID, id );
      instances.set_slot( html_question_object, $sym20$ANSWER, response );
      methods.funcall_instance_method_with_1_args( html_question_object, $sym120$NOTIFY_CLIENT, $kw121$INPUT_READY );
    }
    else
    {
      sme_lexwiz_error( $str122$Unable_to_resolve_question_into_u );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 17371L)
  public static SubLObject sme_lexwiz_error(final SubLObject message)
  {
    if( NIL != sme_lexification_wizard.sme_lexwiz_use_blackboardP() )
    {
      Errors.warn( message );
    }
    else
    {
      cb_utilities.cb_error( message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-sme-lexification-wizard.lisp", position = 17560L)
  public static SubLObject html_encode_text(SubLObject text)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hard_escapes = ConsesLow.list( ConsesLow.cons( Characters.CHAR_newline, $str124$_br_ ), ConsesLow.cons( Characters.CHAR_tab, $html_tab_expansion$.getGlobalValue() ) );
    final SubLObject soft_escapes = html_macros.$html_escapes_map$.getDynamicValue( thread );
    SubLObject cdolist_list_var = ConsesLow.append( soft_escapes, hard_escapes );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject old_char = NIL;
      SubLObject v_new = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list125 );
      old_char = current.first();
      current = ( v_new = current.rest() );
      final SubLObject old = Strings.make_string( ONE_INTEGER, old_char );
      text = string_utilities.string_substitute( v_new, old, text, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return text;
  }

  public static SubLObject declare_cb_sme_lexification_wizard_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_question_answering_agent_p", "HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_question_answering_agent_display_question_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_question_answering_agent_display_question_preamble_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_question_answering_agent_display_question_trailer_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "html_question_answering_agent_display_question_proper_method", "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 1, false );
    SubLFiles.declareFunction( me, "add_oe_lexification_link", "ADD-OE-LEXIFICATION-LINK", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_sme_lexification_wizard", "CB-LINK-SME-LEXIFICATION-WIZARD", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_handle_sme_lexification_wizard", "CB-HANDLE-SME-LEXIFICATION-WIZARD", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_html_question_answering", "HANDLE-HTML-QUESTION-ANSWERING", 1, 0, false );
    SubLFiles.declareFunction( me, "sme_lexwiz_error", "SME-LEXWIZ-ERROR", 1, 0, false );
    SubLFiles.declareFunction( me, "html_encode_text", "HTML-ENCODE-TEXT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_sme_lexification_wizard_file()
  {
    $sme_lexwiz_verboseP$ = SubLFiles.defvar( "*SME-LEXWIZ-VERBOSE?*", T );
    $html_tab_expansion$ = SubLFiles.defconstant( "*HTML-TAB-EXPANSION*", $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb );
    $max_sme_listbox_size$ = SubLFiles.deflexical( "*MAX-SME-LISTBOX-SIZE*", FIFTEEN_INTEGER );
    return NIL;
  }

  public static SubLObject setup_cb_sme_lexification_wizard_file()
  {
    utilities_macros.register_html_state_variable( $sym0$_SME_LEXWIZ_VERBOSE__ );
    utilities_macros.register_html_interface_variable( $sym0$_SME_LEXWIZ_VERBOSE__ );
    classes.subloop_new_class( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym3$QUESTION_ANSWERING_AGENT, NIL, NIL, $list4 );
    classes.class_set_implements_slot_listeners( $sym2$HTML_QUESTION_ANSWERING_AGENT, NIL );
    classes.subloop_note_class_initialization_function( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC );
    subloop_reserved_initialize_html_question_answering_agent_class( $sym2$HTML_QUESTION_ANSWERING_AGENT );
    methods.methods_incorporate_instance_method( $sym28$DISPLAY_QUESTION, $sym2$HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list30 );
    methods.subloop_register_instance_method( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym28$DISPLAY_QUESTION, $sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD );
    methods.methods_incorporate_instance_method( $sym34$DISPLAY_QUESTION_PREAMBLE, $sym2$HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list40 );
    methods.subloop_register_instance_method( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym34$DISPLAY_QUESTION_PREAMBLE, $sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD );
    methods.methods_incorporate_instance_method( $sym37$DISPLAY_QUESTION_TRAILER, $sym2$HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list44 );
    methods.subloop_register_instance_method( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym37$DISPLAY_QUESTION_TRAILER, $sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD );
    methods.methods_incorporate_instance_method( $sym46$DISPLAY_QUESTION_PROPER, $sym2$HTML_QUESTION_ANSWERING_AGENT, $list29, NIL, $list47 );
    methods.subloop_register_instance_method( $sym2$HTML_QUESTION_ANSWERING_AGENT, $sym46$DISPLAY_QUESTION_PROPER, $sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD );
    Hashtables.sethash( $kw42$SME_LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str72$sme_lexwiz_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD, $kw101$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw108$SME_LEXIFICATION_WIZARD, $sym109$CB_LINK_SME_LEXIFICATION_WIZARD, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw108$SME_LEXIFICATION_WIZARD, sme_lexification_wizard.sme_lexwiz_title(), $str110$SmeLex, $str111$Perform_lexification_with_SME_lex );
    html_macros.note_cgi_handler_function( $sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD, $kw101$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym123$HANDLE_HTML_QUESTION_ANSWERING, $kw101$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_sme_lexification_wizard_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_sme_lexification_wizard_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_sme_lexification_wizard_file();
  }
  static
  {
    me = new cb_sme_lexification_wizard();
    $sme_lexwiz_verboseP$ = null;
    $html_tab_expansion$ = null;
    $max_sme_listbox_size$ = null;
    $sym0$_SME_LEXWIZ_VERBOSE__ = makeSymbol( "*SME-LEXWIZ-VERBOSE?*" );
    $str1$_nbsp__nbsp__nbsp__nbsp__nbsp__nb = makeString( "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" );
    $sym2$HTML_QUESTION_ANSWERING_AGENT = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT" );
    $sym3$QUESTION_ANSWERING_AGENT = makeSymbol( "QUESTION-ANSWERING-AGENT" );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-QUESTION-PREAMBLE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "DISPLAY-QUESTION-PROPER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DISPLAY-QUESTION-TRAILER" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-CLASS" );
    $sym8$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym9$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym10$ID = makeSymbol( "ID" );
    $sym11$TITLE = makeSymbol( "TITLE" );
    $sym12$QUESTION = makeSymbol( "QUESTION" );
    $sym13$TIP = makeSymbol( "TIP" );
    $sym14$QUESTION_TYPE = makeSymbol( "QUESTION-TYPE" );
    $sym15$ERROR_MESSAGE = makeSymbol( "ERROR-MESSAGE" );
    $sym16$CHOICES = makeSymbol( "CHOICES" );
    $sym17$DESCRIPTIONS = makeSymbol( "DESCRIPTIONS" );
    $sym18$VALUES = makeSymbol( "VALUES" );
    $sym19$DEFAULT = makeSymbol( "DEFAULT" );
    $sym20$ANSWER = makeSymbol( "ANSWER" );
    $sym21$FIELD_WIDTH = makeSymbol( "FIELD-WIDTH" );
    $sym22$FIELD_LABELS = makeSymbol( "FIELD-LABELS" );
    $sym23$PROXY = makeSymbol( "PROXY" );
    $sym24$CALLBACK_FUNCTION = makeSymbol( "CALLBACK-FUNCTION" );
    $sym25$CLIENT_DATA = makeSymbol( "CLIENT-DATA" );
    $sym26$USER_DATA = makeSymbol( "USER-DATA" );
    $sym27$SUBLOOP_RESERVED_INITIALIZE_HTML_QUESTION_ANSWERING_AGENT_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-HTML-QUESTION-ANSWERING-AGENT-INSTANCE" );
    $sym28$DISPLAY_QUESTION = makeSymbol( "DISPLAY-QUESTION" );
    $list29 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-DOCUMENT" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "DISPLAY-QUESTION-PREAMBLE" ) ) ), ConsesLow.list( makeSymbol( "CB-BASIC-FORM-HANDLER" ), ConsesLow.list( makeString( "handle-html-question-answering" ) ), ConsesLow.list( makeSymbol( "DISPLAY-QUESTION-PROPER" ),
            makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DISPLAY-QUESTION-TRAILER" ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), NIL ) ) );
    $str31$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str32$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw33$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym34$DISPLAY_QUESTION_PREAMBLE = makeSymbol( "DISPLAY-QUESTION-PREAMBLE" );
    $str35$post = makeString( "post" );
    $str36$handle_html_question_answering = makeString( "handle-html-question-answering" );
    $sym37$DISPLAY_QUESTION_TRAILER = makeSymbol( "DISPLAY-QUESTION-TRAILER" );
    $sym38$_EXIT = makeSymbol( "%EXIT" );
    $sym39$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD" );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TITLE" ), ConsesLow.list( makeSymbol( "SME-LEXWIZ-TITLE" ) ) ) ), ConsesLow.list( makeSymbol(
        "HTML-HEAD" ), ConsesLow.list( makeSymbol( "HTML-TITLE" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "TITLE" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-HEADING" ), ConsesLow.list( TWO_INTEGER ),
            ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "TITLE" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-HEADING" ), ConsesLow.list( FOUR_INTEGER ), ConsesLow.list( makeSymbol( "CB-HELP-PREAMBLE" ),
                makeKeyword( "SME-LEXWIZ" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "TITLE" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ),
                    NIL ) );
    $sym41$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD" );
    $kw42$SME_LEXWIZ = makeKeyword( "SME-LEXWIZ" );
    $sym43$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHOD = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-COPYRIGHT-NOTICE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym45$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD" );
    $sym46$DISPLAY_QUESTION_PROPER = makeSymbol( "DISPLAY-QUESTION-PROPER" );
    $list47 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ERROR-MESSAGE" ), ConsesLow.list( makeSymbol( "HTML-FONT-COLOR" ), ConsesLow.list( makeKeyword( "RED" ) ), ConsesLow
        .list( makeSymbol( "HTML-PRINC" ), makeString( "Error: " ) ), ConsesLow.list( makeSymbol( "HTML-INDENT" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "ERROR-MESSAGE" ) ), ConsesLow
            .list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ) ) ), ConsesLow.list( makeSymbol( "HTML-MARKUP" ), ConsesLow.list( makeSymbol( "HTML-ENCODE-TEXT" ), makeSymbol( "QUESTION" ) ) ), ConsesLow.list( makeSymbol(
                "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-HIDDEN-INPUT" ), makeString( ":object-id" ), makeSymbol( "ID" ) ), ConsesLow.list( makeSymbol( "SET-OBJECT-DATA" ), makeSymbol( "ID" ), makeSymbol(
                    "SELF" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "QUESTION-TYPE" ), ConsesLow.list( makeKeyword( "BOOLEAN" ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol(
                        "HTML-HIDDEN-INPUT" ), makeString( ":positive-choice" ), ConsesLow.list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), ConsesLow
                            .list( makeSymbol( "POSITIVE-CHOICE" ), makeSymbol( "SELF" ) ), makeString( ":yes" ) ), ConsesLow.list( makeSymbol( "HTML-HIDDEN-INPUT" ), makeString( ":negative-choice" ), ConsesLow.list(
                                makeSymbol( "NEGATIVE-CHOICE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), ConsesLow.list( makeSymbol( "NEGATIVE-CHOICE" ), makeSymbol( "SELF" ) ),
                                    makeString( ":no" ) ) ), ConsesLow.list( makeKeyword( "ENUMERATED" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTBOX-SIZE" ), ConsesLow
                                        .list( makeSymbol( "MIN" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ), makeSymbol( "*MAX-SME-LISTBOX-SIZE*" ) ) ) ), ConsesLow.list( makeSymbol(
                                            "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "CHOICES" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "LISTBOX-SIZE" ) ), ConsesLow.list(
                                                makeSymbol( "HTML-CREATE-RADIOBOX-FORM" ), makeString( ":response" ), makeSymbol( "CHOICES" ), makeSymbol( "VALUES" ), makeSymbol( "DEFAULT" ) ), ConsesLow.list(
                                                    makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), makeString( "OK" ), makeString( ":ok" ) ) ) ), ConsesLow.list( makeKeyword(
                                                        "MULTIPLE-SELECTION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LISTBOX-SIZE" ), ConsesLow.list( makeSymbol( "MIN" ),
                                                            ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "CHOICES" ) ), makeSymbol( "*MAX-SME-LISTBOX-SIZE*" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ),
                                                            ConsesLow.list( makeSymbol( "CREATE-MULTIPLE-SELECTION-LISTBOX" ), makeString( ":response" ), makeSymbol( "CHOICES" ), makeSymbol( "VALUES" ), makeSymbol(
                                                                "LISTBOX-SIZE" ), makeSymbol( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-SUBMIT-INPUT" ), makeString(
                                                                    "Submit" ), makeString( ":ok" ) ) ) ), ConsesLow.list( makeKeyword( "FREE-FORM" ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list(
                                                                        makeSymbol( "HTML-TEXT-INPUT" ), makeString( ":response" ), makeSymbol( "DEFAULT" ), makeSymbol( "FIELD-WIDTH" ) ), ConsesLow.list( makeSymbol(
                                                                            "HTML-SUBMIT-INPUT" ), makeString( "Submit" ), makeString( ":ok" ) ) ), ConsesLow.list( makeKeyword( "MULTIPLE-FREE-FORM" ), ConsesLow.list(
                                                                                makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-TABLE" ), ConsesLow.list( ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                                                                                    "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "LABEL" ), makeSymbol( "I" ), makeSymbol( "FIELD-LABELS" ) ), ConsesLow.list(
                                                                                        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DEFAULT-VALUE" ), ConsesLow.list( makeSymbol( "ELT" ),
                                                                                            makeSymbol( "DEFAULT" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "OPTIONAL-DESCRIPTION" ), ConsesLow.list(
                                                                                                makeSymbol( "ELT" ), makeSymbol( "DESCRIPTIONS" ), makeSymbol( "I" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-TABLE-ROW" ),
                                                                                                    ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "~a: " ),
                                                                                                        makeSymbol( "LABEL" ) ) ), ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol(
                                                                                                            "HTML-TEXT-INPUT" ), makeString( ":response" ), makeSymbol( "DEFAULT-VALUE" ), makeSymbol( "FIELD-WIDTH" ) ) ),
                                                                                                    ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NON-EMPTY-STRING?" ), makeSymbol(
                                                                                                        "OPTIONAL-DESCRIPTION" ) ), ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol(
                                                                                                            "HTML-PRINC" ), makeSymbol( "OPTIONAL-DESCRIPTION" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                "HTML-SUBMIT-INPUT" ), makeString( "Submit" ), makeString( ":ok" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                    "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ),
                                                                                                                        makeSymbol( "TIP" ), makeSymbol( "*SME-LEXWIZ-VERBOSE?*" ) ), ConsesLow.list( makeSymbol(
                                                                                                                            "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
                                                                                                                                "Tip:" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list(
                                                                                                                                    makeSymbol( "HTML-MARKUP" ), ConsesLow.list( makeSymbol( "HTML-ENCODE-TEXT" ),
                                                                                                                                        makeSymbol( "TIP" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ),
                                                                                                                                            TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                                                                                                                                                .list( makeSymbol( "LEXWIZ-PARAMETERS" ), makeSymbol( "USER-DATA" ) ) ),
                                                                                                                                                ConsesLow.list( makeSymbol( "LEX-ASSERTION" ), ConsesLow.list( EQ, ConsesLow
                                                                                                                                                    .list( makeSymbol( "TYPE-OF" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ),
                                                                                                                                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                                                                        "LEXIFICATION-PARAMETERS" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                            "ADD-OE-LEXIFICATION-LINK" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "LEXWIZ-ID" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ) ) ),
      ConsesLow.list( makeSymbol( "RET" ), NIL )
    } );
    $sym48$OUTER_CATCH_FOR_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-HTML-QUESTION-ANSWERING-AGENT-METHOD" );
    $kw49$RED = makeKeyword( "RED" );
    $str50$Error__ = makeString( "Error: " );
    $str51$_object_id = makeString( ":object-id" );
    $kw52$BOOLEAN = makeKeyword( "BOOLEAN" );
    $str53$_positive_choice = makeString( ":positive-choice" );
    $str54$_yes = makeString( ":yes" );
    $str55$_negative_choice = makeString( ":negative-choice" );
    $str56$_no = makeString( ":no" );
    $kw57$ENUMERATED = makeKeyword( "ENUMERATED" );
    $str58$_response = makeString( ":response" );
    $str59$OK = makeString( "OK" );
    $str60$_ok = makeString( ":ok" );
    $kw61$MULTIPLE_SELECTION = makeKeyword( "MULTIPLE-SELECTION" );
    $str62$Submit = makeString( "Submit" );
    $kw63$FREE_FORM = makeKeyword( "FREE-FORM" );
    $kw64$MULTIPLE_FREE_FORM = makeKeyword( "MULTIPLE-FREE-FORM" );
    $str65$_a__ = makeString( "~a: " );
    $str66$Tip_ = makeString( "Tip:" );
    $sym67$LEXIFICATION_PARAMETERS = makeSymbol( "LEXIFICATION-PARAMETERS" );
    $str68$Warning__ = makeString( "Warning: " );
    $str69$____assertion_failed___a______ = makeString( "*** assertion failed: ~a ***~%" );
    $list70 = ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "TYPE-OF" ), makeSymbol( "LEXWIZ-PARAMETERS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LEXIFICATION-PARAMETERS" ) ) );
    $sym71$HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PROPER_METHOD = makeSymbol( "HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PROPER-METHOD" );
    $str72$sme_lexwiz_html = makeString( "sme-lexwiz.html" );
    $str73$the__A = makeString( "the ~A" );
    $str74$_id = makeString( ":id" );
    $str75$cb_handle_sme_lexification_wizard = makeString( "cb-handle-sme-lexification-wizard" );
    $str76$_Specify_the_term_and_phrase_for_ = makeString( " Specify the term and phrase for the lexical mapping" );
    $str77$_cyc_term = makeString( ":cyc-term" );
    $str78$Complete = makeString( "Complete" );
    $str79$Term__ = makeString( "Term :" );
    $int80$50 = makeInteger( 50 );
    $str81$Clear_Term = makeString( "Clear Term" );
    $str82$_create_term = makeString( ":create-term" );
    $str83$Create_Term_ = makeString( "Create Term?" );
    $str84$Phrase__ = makeString( "Phrase :" );
    $str85$_phrase = makeString( ":phrase" );
    $int86$60 = makeInteger( 60 );
    $str87$Clear_Phrase = makeString( "Clear Phrase" );
    $str88$Error__ = makeString( "Error :" );
    $str89$Reset = makeString( "Reset" );
    $str90$_reset = makeString( ":reset" );
    $int91$30 = makeInteger( 30 );
    $str92$Next_Lexification = makeString( "Next Lexification" );
    $str93$_next_action = makeString( ":next-action" );
    $str94$Skip_Lexification = makeString( "Skip Lexification" );
    $str95$_skip_action = makeString( ":skip-action" );
    $str96$_Reason__optional___ = makeString( " Reason (optional): " );
    $str97$_comment = makeString( ":comment" );
    $str98$ = makeString( "" );
    $int99$40 = makeInteger( 40 );
    $sym100$CB_INVOKE_SME_LEXIFICATION_WIZARD = makeSymbol( "CB-INVOKE-SME-LEXIFICATION-WIZARD" );
    $kw101$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str102$_Invoke_Lexification_Assistant_ = makeString( "[Invoke Lexification Assistant]" );
    $str103$Note__For_more_control_over_the_l = makeString( "Note: For more control over the lexification, switch to the OE lexifier: " );
    $kw104$OE_LEXIFY_TERM = makeKeyword( "OE-LEXIFY-TERM" );
    $str105$sme_lexification_wizard = makeString( "sme-lexification-wizard" );
    $kw106$MAIN = makeKeyword( "MAIN" );
    $str107$cb_invoke_sme_lexification_wizard = makeString( "cb-invoke-sme-lexification-wizard" );
    $kw108$SME_LEXIFICATION_WIZARD = makeKeyword( "SME-LEXIFICATION-WIZARD" );
    $sym109$CB_LINK_SME_LEXIFICATION_WIZARD = makeSymbol( "CB-LINK-SME-LEXIFICATION-WIZARD" );
    $str110$SmeLex = makeString( "SmeLex" );
    $str111$Perform_lexification_with_SME_lex = makeString( "Perform lexification with SME lexwiz tool" );
    $str112$Please_specify_a_valid_term = makeString( "Please specify a valid term" );
    $str113$Please_specify_a_phrase = makeString( "Please specify a phrase" );
    $sym114$SME_LEXIFICATION_WIZARD = makeSymbol( "SME-LEXIFICATION-WIZARD" );
    $sym115$NEW = makeSymbol( "NEW" );
    $sym116$LEXWIZ_PARAMETERS = makeSymbol( "LEXWIZ-PARAMETERS" );
    $sym117$LEXIFY = makeSymbol( "LEXIFY" );
    $sym118$CB_HANDLE_SME_LEXIFICATION_WIZARD = makeSymbol( "CB-HANDLE-SME-LEXIFICATION-WIZARD" );
    $list119 = ConsesLow.list( makeKeyword( "MULTIPLE-SELECTION" ), makeKeyword( "MULTIPLE-FREE-FORM" ) );
    $sym120$NOTIFY_CLIENT = makeSymbol( "NOTIFY-CLIENT" );
    $kw121$INPUT_READY = makeKeyword( "INPUT-READY" );
    $str122$Unable_to_resolve_question_into_u = makeString( "Unable to resolve question into underlying object" );
    $sym123$HANDLE_HTML_QUESTION_ANSWERING = makeSymbol( "HANDLE-HTML-QUESTION-ANSWERING" );
    $str124$_br_ = makeString( "<br>" );
    $list125 = ConsesLow.cons( makeSymbol( "OLD-CHAR" ), makeSymbol( "NEW" ) );
  }
}
/*
 * 
 * Total time: 377 ms
 * 
 */