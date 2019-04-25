package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_precision_suggestor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_precision_suggestor";
  public static final String myFingerPrint = "773b60199c8c1551ee8f991ade2297c66a7d5c38d5300f9ed0533ea4b8413812";
  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLSymbol $dtp_cb_precision_suggestor_state$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 20833L)
  private static SubLSymbol $cb_current_precision_suggestion_implementation$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21290L)
  private static SubLSymbol $cb_precision_suggestion_implementations$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLSymbol $dtp_cb_precision_suggestor_rkf_state$;
  private static final SubLString $str0$_Precisify_;
  private static final SubLSymbol $kw1$SELF;
  private static final SubLString $str2$cb_precision_suggest__a;
  private static final SubLSymbol $kw3$PRECISION_SUGGEST;
  private static final SubLSymbol $sym4$CB_LINK_PRECISION_SUGGEST;
  private static final SubLString $str5$the_Cyc_KB_editing_facilities;
  private static final SubLList $list6;
  private static final SubLString $str7$_a_does_not_specify_an_assertion;
  private static final SubLSymbol $sym8$CB_PRECISION_SUGGEST;
  private static final SubLSymbol $kw9$HTML_HANDLER;
  private static final SubLString $str10$Precision_suggestor_done;
  private static final SubLSymbol $kw11$DONE;
  private static final SubLString $str12$Precision_Suggestor;
  private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw15$UNINITIALIZED;
  private static final SubLSymbol $kw16$CB_CYC;
  private static final SubLSymbol $kw17$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw18$SHA1;
  private static final SubLString $str19$yui_skin_sam;
  private static final SubLString $str20$reloadFrameButton;
  private static final SubLString $str21$button;
  private static final SubLString $str22$reload;
  private static final SubLString $str23$Refresh_Frames;
  private static final SubLString $str24$post;
  private static final SubLString $str25$cb_handle_precision_suggest;
  private static final SubLString $str26$stack_id;
  private static final SubLString $str27$state_id;
  private static final SubLString $str28$The_following_are_more_precise_ve;
  private static final SubLString $str29$_in_;
  private static final SubLString $str30$_;
  private static final SubLString $str31$Select_all_that_are_true__possibl;
  private static final SubLString $str32$_Warning___If_there_are_meta_asse;
  private static final SubLString $str33$Submit;
  private static final SubLString $str34$t;
  private static final SubLSymbol $sym35$CB_HANDLE_PRECISION_SUGGEST;
  private static final SubLString $str36$You_submitted_a_stale_Precision_S;
  private static final SubLSymbol $sym37$CB_PRECISION_SUGGESTOR_STATE_P;
  private static final SubLSymbol $sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P;
  private static final SubLSymbol $kw39$PRECISION_SUGGESTOR;
  private static final SubLString $str40$Precis;
  private static final SubLString $str41$Restart_the_Precision_Suggestor_t;
  private static final SubLString $str42$_Precis_;
  private static final SubLSymbol $kw43$MAIN;
  private static final SubLString $str44$cb_restart_precision_suggestor;
  private static final SubLSymbol $sym45$CB_LINK_PRECISION_SUGGESTOR;
  private static final SubLString $str46$the_Precision_Suggestor;
  private static final SubLSymbol $sym47$CB_RESTART_PRECISION_SUGGESTOR;
  private static final SubLString $str48$There_are_no_unfinished_Precision;
  private static final SubLSymbol $sym49$NON_EMPTY_LIST_P;
  private static final SubLSymbol $sym50$NON_DOTTED_LIST_P;
  private static final SubLString $str51$cb_handle_precision_suggestor_res;
  private static final SubLString $str52$Unfinished_sessions;
  private static final SubLString $str53$Resume_or_destroy_unfinished_Prec;
  private static final SubLString $str54$__A_total_;
  private static final SubLSymbol $kw55$DESTROY_ALL_PRECISION_SUGGEST;
  private static final SubLSymbol $kw56$LEFT;
  private static final SubLSymbol $kw57$TOP;
  private static final SubLString $str58$Actions;
  private static final SubLSymbol $kw59$RESUME_PRECISION_SUGGEST;
  private static final SubLSymbol $kw60$DESTROY_PRECISION_SUGGEST;
  private static final SubLString $str61$Original_assertion;
  private static final SubLString $str62$Current_formula;
  private static final SubLString $str63$Leaves;
  private static final SubLString $str64$_Resume_;
  private static final SubLString $str65$cb_resume_precision_suggest__a;
  private static final SubLSymbol $sym66$CB_LINK_RESUME_PRECISION_SUGGEST;
  private static final SubLString $str67$You_attempted_to_resume_a_Precisi;
  private static final SubLSymbol $sym68$CB_RESUME_PRECISION_SUGGEST;
  private static final SubLString $str69$_Destroy_;
  private static final SubLString $str70$cb_destroy_precision_suggest__a;
  private static final SubLSymbol $sym71$CB_LINK_DESTROY_PRECISION_SUGGEST;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$CB_DESTROY_PRECISION_SUGGEST;
  private static final SubLString $str74$_Destroy_All_;
  private static final SubLString $str75$cb_destroy_all_precision_suggest_;
  private static final SubLSymbol $sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST;
  private static final SubLSymbol $sym77$CB_DESTROY_ALL_PRECISION_SUGGEST;
  private static final SubLString $str78$None_;
  private static final SubLString $str79$Mt__;
  private static final SubLString $str80$Sentence__;
  private static final SubLSymbol $sym81$CB_PRECISION_SUGGESTOR_STATE;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE;
  private static final SubLSymbol $sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$CB_PSS_ORIGINAL_FORMULA;
  private static final SubLSymbol $sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA;
  private static final SubLSymbol $sym91$CB_PSS_ORIGINAL_MT;
  private static final SubLSymbol $sym92$_CSETF_CB_PSS_ORIGINAL_MT;
  private static final SubLSymbol $sym93$CB_PSS_CURRENT_FORMULA;
  private static final SubLSymbol $sym94$_CSETF_CB_PSS_CURRENT_FORMULA;
  private static final SubLSymbol $sym95$CB_PSS_CURRENT_MT;
  private static final SubLSymbol $sym96$_CSETF_CB_PSS_CURRENT_MT;
  private static final SubLSymbol $sym97$CB_PSS_SUGGESTIONS;
  private static final SubLSymbol $sym98$_CSETF_CB_PSS_SUGGESTIONS;
  private static final SubLSymbol $sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION;
  private static final SubLSymbol $sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION;
  private static final SubLSymbol $sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
  private static final SubLSymbol $sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
  private static final SubLSymbol $sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE;
  private static final SubLSymbol $sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE;
  private static final SubLSymbol $kw105$ORIGINAL_FORMULA;
  private static final SubLSymbol $kw106$ORIGINAL_MT;
  private static final SubLSymbol $kw107$CURRENT_FORMULA;
  private static final SubLSymbol $kw108$CURRENT_MT;
  private static final SubLSymbol $kw109$SUGGESTIONS;
  private static final SubLSymbol $kw110$PRECISION_SUGGESTION_FUNCTION;
  private static final SubLSymbol $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION;
  private static final SubLSymbol $kw112$IMPLEMENTATION_SPECIFIC_STATE;
  private static final SubLString $str113$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw114$BEGIN;
  private static final SubLSymbol $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE;
  private static final SubLSymbol $kw116$SLOT;
  private static final SubLSymbol $kw117$END;
  private static final SubLSymbol $sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD;
  private static final SubLString $str119$_S;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_;
  private static final SubLSymbol $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION;
  private static final SubLSymbol $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_;
  private static final SubLSymbol $sym124$CAR;
  private static final SubLSymbol $kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION;
  private static final SubLString $str126$OE_inference_based_implementation;
  private static final SubLSymbol $sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION;
  private static final SubLSymbol $sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE;
  private static final SubLSymbol $sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION;
  private static final SubLString $str130$keStrengtheningSuggestion;
  private static final SubLSymbol $sym131$_STRONG;
  private static final SubLObject $const132$and;
  private static final SubLObject $const133$True;
  private static final SubLList $list134;
  private static final SubLString $str135$RKF_implementation;
  private static final SubLSymbol $sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION;
  private static final SubLSymbol $sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE;
  private static final SubLSymbol $sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION;
  private static final SubLSymbol $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE;
  private static final SubLSymbol $sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLList $list143;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY;
  private static final SubLSymbol $sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY;
  private static final SubLSymbol $sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY;
  private static final SubLSymbol $sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY;
  private static final SubLSymbol $kw152$NEXT_ARG_TO_PRECISIFY;
  private static final SubLSymbol $kw153$NEXT_DIRECTION_TO_PRECISIFY;
  private static final SubLSymbol $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE;
  private static final SubLSymbol $sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD;
  private static final SubLSymbol $kw156$GENERALIZE;
  private static final SubLSymbol $kw157$SPECIALIZE;
  private static final SubLObject $const158$genls;
  private static final SubLSymbol $sym159$GENL_;
  private static final SubLSymbol $sym160$SPEC_;
  private static final SubLObject $const161$genlPreds;
  private static final SubLSymbol $sym162$GENL_PREDICATE_;
  private static final SubLSymbol $sym163$SPEC_PREDICATE_;
  private static final SubLSymbol $kw164$ASCENDING;
  private static final SubLSymbol $kw165$DESCENDING;
  private static final SubLSymbol $sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION;

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1039L)
  public static SubLObject cb_link_precision_suggest(final SubLObject assertion, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$_Precisify_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str2$cb_precision_suggest__a, assertion_handles.assertion_id( assertion ) );
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
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1430L)
  public static SubLObject cb_precision_suggest(final SubLObject args)
  {
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str5$the_Cyc_KB_editing_facilities );
    }
    else
    {
      SubLObject id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( args, args, $list6 );
      id = args.first();
      final SubLObject current = args.rest();
      if( NIL == current )
      {
        final SubLObject assertion = cb_utilities.cb_guess_assertion( id );
        if( NIL == assertion_handles.assertion_p( assertion ) )
        {
          cb_utilities.cb_error( $str7$_a_does_not_specify_an_assertion, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          return NIL;
        }
        cb_precision_suggest_assertion( assertion );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( args, $list6 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 1814L)
  public static SubLObject cb_precision_suggest_assertion(final SubLObject assertion)
  {
    final SubLObject formula = assertions_high.assertion_formula( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject state = new_cb_precision_suggestor_initial_state( formula, mt );
    final SubLObject stack = stacks.create_stack();
    stacks.stack_push( state, stack );
    return cb_precision_suggest_next( stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 2120L)
  public static SubLObject cb_precision_suggest_next(final SubLObject cb_precision_suggestor_state_stack)
  {
    if( NIL != stacks.stack_empty_p( cb_precision_suggestor_state_stack ) )
    {
      cb_parameters.cb_glob_remove( cb_precision_suggestor_state_stack );
      return cb_utilities.cb_message_page_with_history( $str10$Precision_suggestor_done, T );
    }
    final SubLObject state = stacks.stack_peek( cb_precision_suggestor_state_stack );
    final SubLObject pcase_var;
    final SubLObject suggestions = pcase_var = cb_generate_precision_suggestions( state );
    if( pcase_var.eql( NIL ) )
    {
      stacks.stack_pop( cb_precision_suggestor_state_stack );
      final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected( state );
      stacks.stack_push( new_state, cb_precision_suggestor_state_stack );
      return cb_precision_suggest_next( cb_precision_suggestor_state_stack );
    }
    if( pcase_var.eql( $kw11$DONE ) )
    {
      stacks.stack_pop( cb_precision_suggestor_state_stack );
      cb_precision_suggest_done( state );
      return cb_precision_suggest_next( cb_precision_suggestor_state_stack );
    }
    return cb_show_precision_suggestions( cb_precision_suggestor_state_stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 3248L)
  public static SubLObject cb_precision_suggest_done(final SubLObject state)
  {
    final SubLObject current_formula = cb_pss_current_formula( state );
    final SubLObject current_mt = cb_pss_current_mt( state );
    final SubLObject original_formula = cb_pss_original_formula( state );
    final SubLObject original_mt = cb_pss_original_mt( state );
    if( !current_formula.equal( original_formula ) || !current_mt.equal( original_mt ) )
    {
      final SubLObject successP = ke.ke_assert_now( current_formula, current_mt, UNPROVIDED, UNPROVIDED );
      if( NIL != successP )
      {
        final SubLObject original_assertion = kb_indexing.find_gaf( original_formula, original_mt );
        if( NIL != original_assertion )
        {
          ke.ke_unassert_assertion( original_assertion );
        }
        cb_tools.cb_add_sentence_in_mt_to_assertion_history( current_formula, current_mt );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 4232L)
  public static SubLObject cb_show_precision_suggestions(final SubLObject stack)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject state = stacks.stack_peek( stack );
    final SubLObject suggestions = cb_pss_suggestions( state );
    final SubLObject current_formula = cb_pss_current_formula( state );
    final SubLObject current_mt = cb_pss_current_mt( state );
    final SubLObject stack_id = cb_parameters.cb_glob_id( stack );
    final SubLObject state_id = cb_parameters.cb_glob_id( state );
    final SubLObject title_var = $str12$Precision_Suggestor;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw16$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw17$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str19$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str20$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str21$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str22$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str23$Refresh_Frames );
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
            html_utilities.html_markup( $str24$post );
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
              html_utilities.html_hidden_input( $str25$cb_handle_precision_suggest, T, UNPROVIDED );
              html_utilities.html_hidden_input( $str26$stack_id, stack_id, UNPROVIDED );
              html_utilities.html_hidden_input( $str27$state_id, state_id, UNPROVIDED );
              html_utilities.html_princ( $str28$The_following_are_more_precise_ve );
              html_utilities.html_newline( UNPROVIDED );
              cb_utilities.cb_form( current_formula, ZERO_INTEGER, T );
              html_utilities.html_princ( $str29$_in_ );
              cb_utilities.cb_form( current_mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_princ( $str30$_ );
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str31$Select_all_that_are_true__possibl );
              html_utilities.html_newline( TWO_INTEGER );
              if( NIL != cb_precision_suggestor_state_possibly_initialP( state ) )
              {
                html_utilities.html_princ( $str32$_Warning___If_there_are_meta_asse );
                html_utilities.html_newline( TWO_INTEGER );
              }
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
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                SubLObject bgcolor = NIL;
                SubLObject color_toggle = NIL;
                SubLObject list_var = NIL;
                SubLObject suggestion = NIL;
                SubLObject index = NIL;
                list_var = suggestions;
                suggestion = list_var.first();
                for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), suggestion = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
                {
                  if( NIL != color_toggle )
                  {
                    color_toggle = NIL;
                  }
                  else
                  {
                    color_toggle = T;
                  }
                  bgcolor = ( ( NIL != color_toggle ) ? html_macros.$html_color_cyc_logo_lighter_violet$.getGlobalValue() : html_macros.$html_color_cyc_logo_light_violet$.getGlobalValue() );
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
                      html_utilities.html_checkbox_input( string_utilities.to_string( index ), T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_indent( TWO_INTEGER );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_form( suggestion, ZERO_INTEGER, T );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
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
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_submit_input( $str33$Submit, UNPROVIDED, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 5821L)
  public static SubLObject cb_handle_precision_suggest(final SubLObject args)
  {
    final SubLObject stack_id = html_utilities.html_extract_input( $str26$stack_id, args );
    final SubLObject stack = cb_parameters.cb_glob_lookup_by_string( stack_id );
    if( NIL == stacks.stack_p( stack ) || NIL != stacks.stack_empty_p( stack ) )
    {
      return cb_precision_suggestor_stale_page_submitted();
    }
    final SubLObject state = stacks.stack_peek( stack );
    final SubLObject state_id_expected = html_utilities.html_extract_input( $str27$state_id, args );
    final SubLObject state_id_actual = cb_parameters.cb_glob_id( state );
    if( !state_id_actual.numE( string_utilities.string_to_integer( state_id_expected ) ) )
    {
      return cb_precision_suggestor_stale_page_submitted();
    }
    stacks.stack_pop( stack );
    cb_parameters.cb_glob_remove_id( state_id_actual );
    final SubLObject suggestions = cb_pss_suggestions( state );
    SubLObject selected_suggestions = NIL;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject this_selectedP;
    for( cdotimes_end_var = Sequences.length( suggestions ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      this_selectedP = html_utilities.html_extract_input( string_utilities.to_string( i ), args );
      if( this_selectedP.equalp( $str34$t ) )
      {
        selected_suggestions = ConsesLow.cons( ConsesLow.nth( i, suggestions ), selected_suggestions );
      }
    }
    if( NIL != list_utilities.empty_list_p( selected_suggestions ) )
    {
      final SubLObject new_state = new_cb_precision_suggestor_state_if_suggestions_rejected( state );
      stacks.stack_push( new_state, stack );
    }
    else
    {
      SubLObject cdolist_list_var = selected_suggestions;
      SubLObject selected_suggestion = NIL;
      selected_suggestion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject mt = cb_pss_current_mt( state );
        final SubLObject new_state2 = new_cb_precision_suggestor_state_for_selected_suggestion( state, selected_suggestion, mt );
        stacks.stack_push( new_state2, stack );
        cdolist_list_var = cdolist_list_var.rest();
        selected_suggestion = cdolist_list_var.first();
      }
    }
    return cb_precision_suggest_next( stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 7551L)
  public static SubLObject cb_precision_suggestor_stale_page_submitted()
  {
    return cb_utilities.cb_error( $str36$You_submitted_a_stale_Precision_S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 7799L)
  public static SubLObject cb_precision_suggestor_state_stack_p(final SubLObject v_object)
  {
    return stacks.stack_of_type_p( Symbols.symbol_function( $sym37$CB_PRECISION_SUGGESTOR_STATE_P ), v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8041L)
  public static SubLObject cb_precision_suggestor_pending_stacks()
  {
    return cb_parameters.cb_glob_find_all_if( Symbols.symbol_function( $sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8419L)
  public static SubLObject cb_link_precision_suggestor(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str42$_Precis_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw43$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str44$cb_restart_precision_suggestor );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8640L)
  public static SubLObject cb_restart_precision_suggestor(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      cyc_navigator_internals.guest_warn( $str46$the_Precision_Suggestor );
    }
    else
    {
      cb_restart_precision_suggestor_internal();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 8861L)
  public static SubLObject cb_restart_precision_suggestor_internal()
  {
    final SubLObject v_stacks = cb_precision_suggestor_pending_stacks();
    if( NIL != list_utilities.empty_list_p( v_stacks ) )
    {
      return cb_utilities.cb_message_page_with_history( $str48$There_are_no_unfinished_Precision, NIL );
    }
    return cb_restart_precision_suggestor_guts( v_stacks );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 9224L)
  public static SubLObject cb_restart_precision_suggestor_guts(final SubLObject v_stacks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_empty_list_p( v_stacks ) : v_stacks;
    assert NIL != list_utilities.non_dotted_list_p( v_stacks ) : v_stacks;
    SubLObject cdolist_list_var = v_stacks;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != cb_precision_suggestor_state_stack_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    final SubLObject title_var = $str12$Precision_Suggestor;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str13$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str14$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw15$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw16$CB_CYC );
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
        final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str19$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str20$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str21$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str22$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str23$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
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
            html_script_utilities.cb_hoverover_page_init();
            final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
            html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str24$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str51$cb_handle_precision_suggestor_res, T, UNPROVIDED );
              final SubLObject size_val = FOUR_INTEGER;
              html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
              if( NIL != size_val )
              {
                html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( size_val );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                cb_query.cb_princ_strong_with_explanation( $str52$Unfinished_sessions, $str53$Resume_or_destroy_unfinished_Prec, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
              }
              html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              html_utilities.html_indent( FOUR_INTEGER );
              html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str54$__A_total_, Sequences.length( v_stacks ) );
              html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
              html_utilities.html_indent( FOUR_INTEGER );
              cb_utilities.cb_link( $kw55$DESTROY_ALL_PRECISION_SUGGEST, v_stacks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( ONE_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str58$Actions );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  SubLObject cdolist_list_var2 = v_stacks;
                  SubLObject stack = NIL;
                  stack = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_link( $kw59$RESUME_PRECISION_SUGGEST, stack, NIL, stacks.stack_empty_p( stack ), UNPROVIDED, UNPROVIDED );
                      html_utilities.html_indent( UNPROVIDED );
                      cb_utilities.cb_link( $kw60$DESTROY_PRECISION_SUGGEST, stack, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    stack = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str61$Original_assertion );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  SubLObject cdolist_list_var2 = v_stacks;
                  SubLObject stack = NIL;
                  stack = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_precision_suggestor_show_original_assertion( stack );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    stack = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str62$Current_formula );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  SubLObject cdolist_list_var2 = v_stacks;
                  SubLObject stack = NIL;
                  stack = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_precision_suggestor_show_current_formula( stack );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    stack = cdolist_list_var2.first();
                  }
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
                  html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ_strong( $str63$Leaves );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  SubLObject cdolist_list_var2 = v_stacks;
                  SubLObject stack = NIL;
                  stack = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw56$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw57$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_princ( stacks.stack_size( stack ) );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    stack = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
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
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$10, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11108L)
  public static SubLObject cb_link_resume_precision_suggest(final SubLObject stack, SubLObject linktext, SubLObject disabledP)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( disabledP == UNPROVIDED )
    {
      disabledP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str64$_Resume_;
    }
    if( NIL != disabledP )
    {
      cb_assertion_editor.cb_disabled_link( linktext );
    }
    else
    {
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$SELF );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str65$cb_resume_precision_suggest__a, cb_parameters.cb_glob_id( stack ) );
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
    }
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11436L)
  public static SubLObject cb_resume_precision_suggest(final SubLObject args)
  {
    SubLObject id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list6 );
    id = args.first();
    final SubLObject current = args.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list6 );
      return NIL;
    }
    final SubLObject stack = cb_parameters.cb_glob_lookup_by_string( id );
    if( NIL == stacks.stack_p( stack ) || NIL != stacks.stack_empty_p( stack ) )
    {
      return cb_utilities.cb_error( $str67$You_attempted_to_resume_a_Precisi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_show_precision_suggestions( stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 11792L)
  public static SubLObject cb_link_destroy_precision_suggest(final SubLObject stack, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str69$_Destroy_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str70$cb_destroy_precision_suggest__a, cb_parameters.cb_glob_id( stack ) );
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
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12058L)
  public static SubLObject cb_destroy_precision_suggest(final SubLObject args)
  {
    SubLObject id_as_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list72 );
    id_as_string = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject id = string_utilities.string_to_integer( id_as_string );
      final SubLObject stack = cb_parameters.cb_glob_lookup( id );
      cb_parameters.cb_glob_remove_id( id );
      stacks.clear_stack( stack );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list72 );
    }
    return cb_restart_precision_suggestor_internal();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12578L)
  public static SubLObject cb_link_destroy_all_precision_suggest(final SubLObject v_stacks, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str74$_Destroy_All_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str75$cb_destroy_all_precision_suggest_, cb_parameters.cb_glob_id( v_stacks ) );
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
    return v_stacks;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 12859L)
  public static SubLObject cb_destroy_all_precision_suggest(final SubLObject args)
  {
    SubLObject id_as_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list72 );
    id_as_string = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject id = string_utilities.string_to_integer( id_as_string );
      final SubLObject v_stacks = cb_parameters.cb_glob_lookup( id );
      cb_parameters.cb_glob_remove_id( id );
      SubLObject cdolist_list_var = v_stacks;
      SubLObject stack = NIL;
      stack = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_parameters.cb_glob_remove( stack );
        cdolist_list_var = cdolist_list_var.rest();
        stack = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list72 );
    }
    return cb_utilities.cb_message_page_with_history( $str10$Precision_suggestor_done, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13202L)
  public static SubLObject cb_precision_suggestor_show_original_assertion(final SubLObject stack)
  {
    if( NIL != stacks.stack_empty_p( stack ) )
    {
      return html_utilities.html_princ( $str78$None_ );
    }
    final SubLObject state = stacks.stack_peek( stack );
    final SubLObject original_formula = cb_pss_original_formula( state );
    final SubLObject original_mt = cb_pss_original_mt( state );
    return cb_precision_suggestor_show_formula( original_formula, original_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13563L)
  public static SubLObject cb_precision_suggestor_show_current_formula(final SubLObject stack)
  {
    if( NIL != stacks.stack_empty_p( stack ) )
    {
      return html_utilities.html_princ( $str78$None_ );
    }
    final SubLObject state = stacks.stack_peek( stack );
    final SubLObject current_formula = cb_pss_current_formula( state );
    final SubLObject current_mt = cb_pss_current_mt( state );
    return cb_precision_suggestor_show_formula( current_formula, current_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 13915L)
  public static SubLObject cb_precision_suggestor_show_formula(final SubLObject sentence, final SubLObject mt)
  {
    html_utilities.html_princ_strong( $str79$Mt__ );
    html_utilities.html_indent( UNPROVIDED );
    cb_utilities.cb_form( mt, ZERO_INTEGER, NIL );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ_strong( $str80$Sentence__ );
    html_utilities.html_newline( UNPROVIDED );
    cb_utilities.cb_form( sentence, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_precision_suggestor_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_cb_precision_suggestor_state( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_precision_suggestor_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cb_precision_suggestor_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_original_formula(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_original_mt(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_current_formula(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_current_mt(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_suggestions(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_precision_suggestion_function(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_implementation_specific_state_update_function(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject cb_pss_implementation_specific_state(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_original_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_original_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_current_formula(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_current_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_suggestions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_precision_suggestion_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_implementation_specific_state_update_function(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject _csetf_cb_pss_implementation_specific_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_state_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject make_cb_precision_suggestor_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cb_precision_suggestor_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw105$ORIGINAL_FORMULA ) )
      {
        _csetf_cb_pss_original_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw106$ORIGINAL_MT ) )
      {
        _csetf_cb_pss_original_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw107$CURRENT_FORMULA ) )
      {
        _csetf_cb_pss_current_formula( v_new, current_value );
      }
      else if( pcase_var.eql( $kw108$CURRENT_MT ) )
      {
        _csetf_cb_pss_current_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw109$SUGGESTIONS ) )
      {
        _csetf_cb_pss_suggestions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw110$PRECISION_SUGGESTION_FUNCTION ) )
      {
        _csetf_cb_pss_precision_suggestion_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION ) )
      {
        _csetf_cb_pss_implementation_specific_state_update_function( v_new, current_value );
      }
      else if( pcase_var.eql( $kw112$IMPLEMENTATION_SPECIFIC_STATE ) )
      {
        _csetf_cb_pss_implementation_specific_state( v_new, current_value );
      }
      else
      {
        Errors.error( $str113$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject visit_defstruct_cb_precision_suggestor_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw114$BEGIN, $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw105$ORIGINAL_FORMULA, cb_pss_original_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw106$ORIGINAL_MT, cb_pss_original_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw107$CURRENT_FORMULA, cb_pss_current_formula( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw108$CURRENT_MT, cb_pss_current_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw109$SUGGESTIONS, cb_pss_suggestions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw110$PRECISION_SUGGESTION_FUNCTION, cb_pss_precision_suggestion_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, cb_pss_implementation_specific_state_update_function( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw112$IMPLEMENTATION_SPECIFIC_STATE, cb_pss_implementation_specific_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw117$END, $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 14712L)
  public static SubLObject visit_defstruct_object_cb_precision_suggestor_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cb_precision_suggestor_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 15740L)
  public static SubLObject print_cb_precision_suggestor_state(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject formula = cb_pss_current_formula( v_object );
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      PrintLow.format( stream, $str119$_S, formula );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 15998L)
  public static SubLObject cb_precision_suggestor_state_possibly_initialP(final SubLObject cb_precision_suggestor_state)
  {
    final SubLObject current_formula = cb_pss_current_formula( cb_precision_suggestor_state );
    final SubLObject current_mt = cb_pss_current_mt( cb_precision_suggestor_state );
    final SubLObject original_formula = cb_pss_original_formula( cb_precision_suggestor_state );
    final SubLObject original_mt = cb_pss_original_mt( cb_precision_suggestor_state );
    return makeBoolean( current_formula.equal( original_formula ) && current_mt.equal( original_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 16509L)
  public static SubLObject cb_generate_precision_suggestions(final SubLObject cb_precision_suggestor_state)
  {
    final SubLObject precision_suggestion_function = cb_pss_precision_suggestion_function( cb_precision_suggestor_state );
    final SubLObject suggestions = Functions.funcall( precision_suggestion_function, cb_precision_suggestor_state );
    _csetf_cb_pss_suggestions( cb_precision_suggestor_state, suggestions );
    return suggestions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 17128L)
  public static SubLObject new_cb_precision_suggestor_initial_state(final SubLObject formula, final SubLObject mt)
  {
    SubLObject current;
    final SubLObject datum = current = cb_current_precision_suggestion_implementation_properties();
    SubLObject name = NIL;
    SubLObject precision_suggestion_function = NIL;
    SubLObject initial_implementation_specific_state_function = NIL;
    SubLObject implementation_specific_state_update_function = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    precision_suggestion_function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    initial_implementation_specific_state_function = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    implementation_specific_state_update_function = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject implementation_specific_state = Functions.funcall( initial_implementation_specific_state_function );
      return make_cb_precision_suggestor_state( ConsesLow.list( new SubLObject[] { $kw105$ORIGINAL_FORMULA, formula, $kw106$ORIGINAL_MT, mt, $kw107$CURRENT_FORMULA, formula, $kw108$CURRENT_MT, mt,
        $kw110$PRECISION_SUGGESTION_FUNCTION, precision_suggestion_function, $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, implementation_specific_state_update_function, $kw112$IMPLEMENTATION_SPECIFIC_STATE,
        implementation_specific_state
      } ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 17943L)
  public static SubLObject new_cb_precision_suggestor_state_for_selected_suggestion(final SubLObject old_cb_precision_suggestor_state, final SubLObject formula, final SubLObject mt)
  {
    final SubLObject new_original_formula = cb_pss_original_formula( old_cb_precision_suggestor_state );
    final SubLObject new_original_mt = cb_pss_original_mt( old_cb_precision_suggestor_state );
    final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function( old_cb_precision_suggestor_state );
    final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function( old_cb_precision_suggestor_state );
    final SubLObject new_implementation_specific_state = Functions.funcall( cb_pss_implementation_specific_state_update_function( old_cb_precision_suggestor_state ), old_cb_precision_suggestor_state, T );
    return make_cb_precision_suggestor_state( ConsesLow.list( new SubLObject[] { $kw105$ORIGINAL_FORMULA, new_original_formula, $kw106$ORIGINAL_MT, new_original_mt, $kw107$CURRENT_FORMULA, formula, $kw108$CURRENT_MT, mt,
      $kw110$PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function,
      $kw112$IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 19338L)
  public static SubLObject new_cb_precision_suggestor_state_if_suggestions_rejected(final SubLObject old_cb_precision_suggestor_state)
  {
    final SubLObject new_original_formula = cb_pss_original_formula( old_cb_precision_suggestor_state );
    final SubLObject new_original_mt = cb_pss_original_mt( old_cb_precision_suggestor_state );
    final SubLObject new_current_formula = cb_pss_current_formula( old_cb_precision_suggestor_state );
    final SubLObject new_current_mt = cb_pss_current_mt( old_cb_precision_suggestor_state );
    final SubLObject new_precision_suggestion_function = cb_pss_precision_suggestion_function( old_cb_precision_suggestor_state );
    final SubLObject new_implementation_specific_state_update_function = cb_pss_implementation_specific_state_update_function( old_cb_precision_suggestor_state );
    final SubLObject new_implementation_specific_state = Functions.funcall( cb_pss_implementation_specific_state_update_function( old_cb_precision_suggestor_state ), old_cb_precision_suggestor_state, NIL );
    return make_cb_precision_suggestor_state( ConsesLow.list( new SubLObject[] { $kw105$ORIGINAL_FORMULA, new_original_formula, $kw106$ORIGINAL_MT, new_original_mt, $kw107$CURRENT_FORMULA, new_current_formula,
      $kw108$CURRENT_MT, new_current_mt, $kw110$PRECISION_SUGGESTION_FUNCTION, new_precision_suggestion_function, $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, new_implementation_specific_state_update_function,
      $kw112$IMPLEMENTATION_SPECIFIC_STATE, new_implementation_specific_state
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21102L)
  public static SubLObject cb_current_precision_suggestion_implementation_properties()
  {
    return cb_precision_suggestion_implementation_properties( $cb_current_precision_suggestion_implementation$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21449L)
  public static SubLObject cb_precision_suggestion_implementations()
  {
    return conses_high.copy_list( $cb_precision_suggestion_implementations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21574L)
  public static SubLObject cb_precision_suggestion_implementation_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $cb_precision_suggestion_implementations$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym124$CAR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21721L)
  public static SubLObject cb_precision_suggestion_implementation_properties(final SubLObject implementation)
  {
    return list_utilities.alist_lookup( $cb_precision_suggestion_implementations$.getGlobalValue(), implementation, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 21888L)
  public static SubLObject declare_cb_precision_suggestion_implementation(final SubLObject implementation, final SubLObject name, final SubLObject precision_suggestion_function,
      final SubLObject initial_implementation_specific_state_function, final SubLObject implementation_specific_state_update_function)
  {
    undeclare_cb_precision_suggestion_implementation( implementation );
    $cb_precision_suggestion_implementations$.setGlobalValue( ConsesLow.cons( ConsesLow.cons( implementation, ConsesLow.list( name, precision_suggestion_function, initial_implementation_specific_state_function,
        implementation_specific_state_update_function ) ), $cb_precision_suggestion_implementations$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 23307L)
  public static SubLObject undeclare_cb_precision_suggestion_implementation(final SubLObject implementation)
  {
    $cb_precision_suggestion_implementations$.setGlobalValue( Sequences.delete( implementation, $cb_precision_suggestion_implementations$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function(
        $sym124$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return implementation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 23979L)
  public static SubLObject cb_inference_precision_suggestion_function(final SubLObject cb_precision_suggestor_state)
  {
    final SubLObject inference_state = cb_pss_implementation_specific_state( cb_precision_suggestor_state );
    final SubLObject formula = cb_pss_current_formula( cb_precision_suggestor_state );
    final SubLObject mt = cb_pss_current_mt( cb_precision_suggestor_state );
    return ( NIL != inference_state ) ? inference_precision_suggest( formula, mt ) : $kw11$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24383L)
  public static SubLObject inference_precision_suggest(final SubLObject formula, final SubLObject mt)
  {
    final SubLObject pred = constants_high.find_constant( $str130$keStrengtheningSuggestion );
    if( NIL != constant_handles.valid_constantP( pred, UNPROVIDED ) )
    {
      return ask_utilities.query_variable( $sym131$_STRONG, el_utilities.make_ternary_formula( $const132$and, el_utilities.make_binary_formula( pred, formula, $sym131$_STRONG ), $const133$True, $const133$True ), mt,
          $list134 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24867L)
  public static SubLObject cb_precision_suggestor_initial_inference_state()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 24945L)
  public static SubLObject cb_precision_suggestor_inference_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP)
  {
    return list_utilities.sublisp_boolean( suggestion_acceptedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 25655L)
  public static SubLObject cb_rkf_precision_suggestion_function(final SubLObject cb_precision_suggestor_state)
  {
    final SubLObject rkf_state = cb_pss_implementation_specific_state( cb_precision_suggestor_state );
    final SubLObject formula = cb_pss_current_formula( cb_precision_suggestor_state );
    final SubLObject mt = cb_pss_current_mt( cb_precision_suggestor_state );
    final SubLObject argnum = cb_ps_rkf_s_next_arg_to_precisify( rkf_state );
    final SubLObject direction = cb_ps_rkf_s_next_direction_to_precisify( rkf_state );
    if( NIL == argnum )
    {
      return $kw11$DONE;
    }
    return cb_precisify_argument_candidates( formula, mt, argnum, direction, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject cb_precision_suggestor_rkf_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject cb_precision_suggestor_rkf_state_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cb_precision_suggestor_rkf_state_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_rkf_state_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object)
  {
    assert NIL != cb_precision_suggestor_rkf_state_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject _csetf_cb_ps_rkf_s_next_arg_to_precisify(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_rkf_state_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject _csetf_cb_ps_rkf_s_next_direction_to_precisify(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_precision_suggestor_rkf_state_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject make_cb_precision_suggestor_rkf_state(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cb_precision_suggestor_rkf_state_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw152$NEXT_ARG_TO_PRECISIFY ) )
      {
        _csetf_cb_ps_rkf_s_next_arg_to_precisify( v_new, current_value );
      }
      else if( pcase_var.eql( $kw153$NEXT_DIRECTION_TO_PRECISIFY ) )
      {
        _csetf_cb_ps_rkf_s_next_direction_to_precisify( v_new, current_value );
      }
      else
      {
        Errors.error( $str113$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject visit_defstruct_cb_precision_suggestor_rkf_state(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw114$BEGIN, $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw152$NEXT_ARG_TO_PRECISIFY, cb_ps_rkf_s_next_arg_to_precisify( obj ) );
    Functions.funcall( visitor_fn, obj, $kw116$SLOT, $kw153$NEXT_DIRECTION_TO_PRECISIFY, cb_ps_rkf_s_next_direction_to_precisify( obj ) );
    Functions.funcall( visitor_fn, obj, $kw117$END, $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26189L)
  public static SubLObject visit_defstruct_object_cb_precision_suggestor_rkf_state_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cb_precision_suggestor_rkf_state( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26326L)
  public static SubLObject cb_precision_suggestor_initial_rkf_state()
  {
    return make_cb_precision_suggestor_rkf_state( ConsesLow.list( $kw152$NEXT_ARG_TO_PRECISIFY, ONE_INTEGER, $kw153$NEXT_DIRECTION_TO_PRECISIFY, $kw156$GENERALIZE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 26526L)
  public static SubLObject cb_precision_suggestor_rkf_state_update_function(final SubLObject old_cb_precision_suggestor_state, final SubLObject suggestion_acceptedP)
  {
    final SubLObject old_rkf_state = cb_pss_implementation_specific_state( old_cb_precision_suggestor_state );
    if( NIL != suggestion_acceptedP )
    {
      return copy_cb_precision_suggestor_rkf_state( old_rkf_state );
    }
    final SubLObject formula = cb_pss_current_formula( old_cb_precision_suggestor_state );
    final SubLObject v_arity = el_utilities.formula_arity( formula, UNPROVIDED );
    final SubLObject old_next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify( old_rkf_state );
    final SubLObject old_next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify( old_rkf_state );
    final SubLObject new_next_direction_to_precisify = ( old_next_direction_to_precisify == $kw156$GENERALIZE ) ? $kw157$SPECIALIZE : $kw156$GENERALIZE;
    final SubLObject new_next_arg_to_precisify = ( new_next_direction_to_precisify == $kw156$GENERALIZE ) ? ( old_next_arg_to_precisify.numGE( v_arity ) ? NIL : number_utilities.f_1X( old_next_arg_to_precisify ) )
        : old_next_arg_to_precisify;
    return make_cb_precision_suggestor_rkf_state( ConsesLow.list( $kw152$NEXT_ARG_TO_PRECISIFY, new_next_arg_to_precisify, $kw153$NEXT_DIRECTION_TO_PRECISIFY, new_next_direction_to_precisify ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 27673L)
  public static SubLObject copy_cb_precision_suggestor_rkf_state(final SubLObject cb_precision_suggestor_rkf_state)
  {
    final SubLObject next_arg_to_precisify = cb_ps_rkf_s_next_arg_to_precisify( cb_precision_suggestor_rkf_state );
    final SubLObject next_direction_to_precisify = cb_ps_rkf_s_next_direction_to_precisify( cb_precision_suggestor_rkf_state );
    return make_cb_precision_suggestor_rkf_state( ConsesLow.list( $kw152$NEXT_ARG_TO_PRECISIFY, next_arg_to_precisify, $kw153$NEXT_DIRECTION_TO_PRECISIFY, next_direction_to_precisify ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28146L)
  public static SubLObject cb_uia_precisify_argument_candidates_subsumption_preds(final SubLObject generalizeP, final SubLObject preds)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = cb_uia_precisify_argument_candidates_subsumption_pred_for_pred( generalizeP, pred );
      if( NIL != var )
      {
        ans = ConsesLow.cons( var, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28405L)
  public static SubLObject cb_uia_precisify_argument_candidates_subsumption_pred_for_pred(final SubLObject generalizeP, final SubLObject pred)
  {
    if( pred.eql( $const158$genls ) )
    {
      return ( NIL != generalizeP ) ? $sym159$GENL_ : $sym160$SPEC_;
    }
    if( pred.eql( $const161$genlPreds ) )
    {
      return ( NIL != generalizeP ) ? $sym162$GENL_PREDICATE_ : $sym163$SPEC_PREDICATE_;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 28805L)
  public static SubLObject cb_precisify_argument_candidates(final SubLObject formula, final SubLObject mt, final SubLObject argnum, final SubLObject direction, SubLObject type_col)
  {
    if( type_col == UNPROVIDED )
    {
      type_col = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == el_utilities.possibly_atomic_sentence_p( formula ) || NIL == fort_types_interface.predicateP( cycl_utilities.sentence_arg( formula, ZERO_INTEGER, UNPROVIDED ) ) )
    {
      return NIL;
    }
    SubLObject result_sentences = NIL;
    final SubLObject generalizeP = Equality.eq( direction, $kw156$GENERALIZE );
    final SubLObject preds = rkf_precision_suggestor.rkf_sentence_arg_precisification_options( formula, mt, argnum, generalizeP );
    final SubLObject original_arg = cycl_utilities.sentence_arg( formula, argnum, UNPROVIDED );
    if( NIL == preds )
    {
      return NIL;
    }
    SubLObject suggestions = rkf_precision_suggestor.rkf_raw_precisify_arg( formula, argnum, mt, generalizeP, original_arg, preds, type_col );
    final SubLObject mode = ( NIL != generalizeP ) ? $kw164$ASCENDING : $kw165$DESCENDING;
    final SubLObject subsumption_preds = cb_uia_precisify_argument_candidates_subsumption_preds( generalizeP, preds );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = subsumption_preds;
      SubLObject subsumption_pred = NIL;
      subsumption_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        suggestions = list_utilities.delete_subsumed_items( suggestions, subsumption_pred, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        subsumption_pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = cardinality_estimates.sort_by_generality_estimate( suggestions, mode );
    SubLObject suggestion = NIL;
    suggestion = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      result_sentences = ConsesLow.cons( el_utilities.replace_formula_arg( argnum, suggestion, formula ), result_sentences );
      cdolist_list_var2 = cdolist_list_var2.rest();
      suggestion = cdolist_list_var2.first();
    }
    result_sentences = Sequences.delete_if( Symbols.symbol_function( $sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION ), result_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result_sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-precision-suggestor.lisp", position = 30412L)
  public static SubLObject cb_precision_suggestor_redundant_suggestion(final SubLObject sentence)
  {
    return makeBoolean( NIL != kb_utilities.kbeq( $const158$genls, cycl_utilities.formula_arg0( sentence ) ) && cycl_utilities.formula_arg1( sentence, UNPROVIDED ).equal( cycl_utilities.formula_arg2( sentence,
        UNPROVIDED ) ) );
  }

  public static SubLObject declare_cb_precision_suggestor_file()
  {
    SubLFiles.declareFunction( me, "cb_link_precision_suggest", "CB-LINK-PRECISION-SUGGEST", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_precision_suggest", "CB-PRECISION-SUGGEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggest_assertion", "CB-PRECISION-SUGGEST-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggest_next", "CB-PRECISION-SUGGEST-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggest_done", "CB-PRECISION-SUGGEST-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_precision_suggestions", "CB-SHOW-PRECISION-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_precision_suggest", "CB-HANDLE-PRECISION-SUGGEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_stale_page_submitted", "CB-PRECISION-SUGGESTOR-STALE-PAGE-SUBMITTED", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_state_stack_p", "CB-PRECISION-SUGGESTOR-STATE-STACK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_pending_stacks", "CB-PRECISION-SUGGESTOR-PENDING-STACKS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_precision_suggestor", "CB-LINK-PRECISION-SUGGESTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_restart_precision_suggestor", "CB-RESTART-PRECISION-SUGGESTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_restart_precision_suggestor_internal", "CB-RESTART-PRECISION-SUGGESTOR-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_restart_precision_suggestor_guts", "CB-RESTART-PRECISION-SUGGESTOR-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_resume_precision_suggest", "CB-LINK-RESUME-PRECISION-SUGGEST", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_resume_precision_suggest", "CB-RESUME-PRECISION-SUGGEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_destroy_precision_suggest", "CB-LINK-DESTROY-PRECISION-SUGGEST", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_destroy_precision_suggest", "CB-DESTROY-PRECISION-SUGGEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_destroy_all_precision_suggest", "CB-LINK-DESTROY-ALL-PRECISION-SUGGEST", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_destroy_all_precision_suggest", "CB-DESTROY-ALL-PRECISION-SUGGEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_show_original_assertion", "CB-PRECISION-SUGGESTOR-SHOW-ORIGINAL-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_show_current_formula", "CB-PRECISION-SUGGESTOR-SHOW-CURRENT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_show_formula", "CB-PRECISION-SUGGESTOR-SHOW-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_state_p", "CB-PRECISION-SUGGESTOR-STATE-P", 1, 0, false );
    new $cb_precision_suggestor_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cb_pss_original_formula", "CB-PSS-ORIGINAL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_original_mt", "CB-PSS-ORIGINAL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_current_formula", "CB-PSS-CURRENT-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_current_mt", "CB-PSS-CURRENT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_suggestions", "CB-PSS-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_precision_suggestion_function", "CB-PSS-PRECISION-SUGGESTION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_implementation_specific_state_update_function", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_pss_implementation_specific_state", "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_original_formula", "_CSETF-CB-PSS-ORIGINAL-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_original_mt", "_CSETF-CB-PSS-ORIGINAL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_current_formula", "_CSETF-CB-PSS-CURRENT-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_current_mt", "_CSETF-CB-PSS-CURRENT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_suggestions", "_CSETF-CB-PSS-SUGGESTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_precision_suggestion_function", "_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_implementation_specific_state_update_function", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_pss_implementation_specific_state", "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cb_precision_suggestor_state", "MAKE-CB-PRECISION-SUGGESTOR-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cb_precision_suggestor_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cb_precision_suggestor_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_cb_precision_suggestor_state", "PRINT-CB-PRECISION-SUGGESTOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_state_possibly_initialP", "CB-PRECISION-SUGGESTOR-STATE-POSSIBLY-INITIAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_generate_precision_suggestions", "CB-GENERATE-PRECISION-SUGGESTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cb_precision_suggestor_initial_state", "NEW-CB-PRECISION-SUGGESTOR-INITIAL-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cb_precision_suggestor_state_for_selected_suggestion", "NEW-CB-PRECISION-SUGGESTOR-STATE-FOR-SELECTED-SUGGESTION", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cb_precision_suggestor_state_if_suggestions_rejected", "NEW-CB-PRECISION-SUGGESTOR-STATE-IF-SUGGESTIONS-REJECTED", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_current_precision_suggestion_implementation_properties", "CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestion_implementations", "CB-PRECISION-SUGGESTION-IMPLEMENTATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestion_implementation_p", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestion_implementation_properties", "CB-PRECISION-SUGGESTION-IMPLEMENTATION-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "declare_cb_precision_suggestion_implementation", "DECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 5, 0, false );
    SubLFiles.declareFunction( me, "undeclare_cb_precision_suggestion_implementation", "UNDECLARE-CB-PRECISION-SUGGESTION-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_precision_suggestion_function", "CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_precision_suggest", "INFERENCE-PRECISION-SUGGEST", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_initial_inference_state", "CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_inference_state_update_function", "CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rkf_precision_suggestion_function", "CB-RKF-PRECISION-SUGGESTION-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_rkf_state_print_function_trampoline", "CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_rkf_state_p", "CB-PRECISION-SUGGESTOR-RKF-STATE-P", 1, 0, false );
    new $cb_precision_suggestor_rkf_state_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cb_ps_rkf_s_next_arg_to_precisify", "CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ps_rkf_s_next_direction_to_precisify", "CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_ps_rkf_s_next_arg_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_ps_rkf_s_next_direction_to_precisify", "_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cb_precision_suggestor_rkf_state", "MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cb_precision_suggestor_rkf_state", "VISIT-DEFSTRUCT-CB-PRECISION-SUGGESTOR-RKF-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cb_precision_suggestor_rkf_state_method", "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_initial_rkf_state", "CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_rkf_state_update_function", "CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION", 2, 0, false );
    SubLFiles.declareFunction( me, "copy_cb_precision_suggestor_rkf_state", "COPY-CB-PRECISION-SUGGESTOR-RKF-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_uia_precisify_argument_candidates_subsumption_preds", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_uia_precisify_argument_candidates_subsumption_pred_for_pred", "CB-UIA-PRECISIFY-ARGUMENT-CANDIDATES-SUBSUMPTION-PRED-FOR-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_precisify_argument_candidates", "CB-PRECISIFY-ARGUMENT-CANDIDATES", 4, 1, false );
    SubLFiles.declareFunction( me, "cb_precision_suggestor_redundant_suggestion", "CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_precision_suggestor_file()
  {
    $dtp_cb_precision_suggestor_state$ = SubLFiles.defconstant( "*DTP-CB-PRECISION-SUGGESTOR-STATE*", $sym81$CB_PRECISION_SUGGESTOR_STATE );
    $cb_current_precision_suggestion_implementation$ = SubLFiles.deflexical( "*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*", ( maybeDefault( $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_,
        $cb_current_precision_suggestion_implementation$, $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION ) ) );
    $cb_precision_suggestion_implementations$ = SubLFiles.deflexical( "*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*", ( maybeDefault( $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_,
        $cb_precision_suggestion_implementations$, NIL ) ) );
    $dtp_cb_precision_suggestor_rkf_state$ = SubLFiles.defconstant( "*DTP-CB-PRECISION-SUGGESTOR-RKF-STATE*", $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE );
    return NIL;
  }

  public static SubLObject setup_cb_precision_suggestor_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$PRECISION_SUGGEST, $sym4$CB_LINK_PRECISION_SUGGEST, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym8$CB_PRECISION_SUGGEST, $kw9$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym35$CB_HANDLE_PRECISION_SUGGEST, $kw9$HTML_HANDLER );
    cb_utilities.declare_cb_tool( $kw39$PRECISION_SUGGESTOR, $str12$Precision_Suggestor, $str40$Precis, $str41$Restart_the_Precision_Suggestor_t );
    cb_utilities.setup_cb_link_method( $kw39$PRECISION_SUGGESTOR, $sym45$CB_LINK_PRECISION_SUGGESTOR, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym47$CB_RESTART_PRECISION_SUGGESTOR, $kw9$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw59$RESUME_PRECISION_SUGGEST, $sym66$CB_LINK_RESUME_PRECISION_SUGGEST, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym68$CB_RESUME_PRECISION_SUGGEST, $kw9$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw60$DESTROY_PRECISION_SUGGEST, $sym71$CB_LINK_DESTROY_PRECISION_SUGGEST, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym73$CB_DESTROY_PRECISION_SUGGEST, $kw9$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw55$DESTROY_ALL_PRECISION_SUGGEST, $sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym77$CB_DESTROY_ALL_PRECISION_SUGGEST, $kw9$HTML_HANDLER );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_state$.getGlobalValue(), Symbols.symbol_function(
        $sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list88 );
    Structures.def_csetf( $sym89$CB_PSS_ORIGINAL_FORMULA, $sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA );
    Structures.def_csetf( $sym91$CB_PSS_ORIGINAL_MT, $sym92$_CSETF_CB_PSS_ORIGINAL_MT );
    Structures.def_csetf( $sym93$CB_PSS_CURRENT_FORMULA, $sym94$_CSETF_CB_PSS_CURRENT_FORMULA );
    Structures.def_csetf( $sym95$CB_PSS_CURRENT_MT, $sym96$_CSETF_CB_PSS_CURRENT_MT );
    Structures.def_csetf( $sym97$CB_PSS_SUGGESTIONS, $sym98$_CSETF_CB_PSS_SUGGESTIONS );
    Structures.def_csetf( $sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION, $sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION );
    Structures.def_csetf( $sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION, $sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION );
    Structures.def_csetf( $sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE, $sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE );
    Equality.identity( $sym81$CB_PRECISION_SUGGESTOR_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_state$.getGlobalValue(), Symbols.symbol_function(
        $sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_ );
    subl_macro_promotions.declare_defglobal( $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_ );
    declare_cb_precision_suggestion_implementation( $kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION, $str126$OE_inference_based_implementation, $sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION,
        $sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE, $sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION );
    declare_cb_precision_suggestion_implementation( $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION, $str135$RKF_implementation, $sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION,
        $sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE, $sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), Symbols.symbol_function(
        $sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list147 );
    Structures.def_csetf( $sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY, $sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY );
    Structures.def_csetf( $sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY, $sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY );
    Equality.identity( $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_precision_suggestor_rkf_state$.getGlobalValue(), Symbols.symbol_function(
        $sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_precision_suggestor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_precision_suggestor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_precision_suggestor_file();
  }
  static
  {
    me = new cb_precision_suggestor();
    $dtp_cb_precision_suggestor_state$ = null;
    $cb_current_precision_suggestion_implementation$ = null;
    $cb_precision_suggestion_implementations$ = null;
    $dtp_cb_precision_suggestor_rkf_state$ = null;
    $str0$_Precisify_ = makeString( "[Precisify]" );
    $kw1$SELF = makeKeyword( "SELF" );
    $str2$cb_precision_suggest__a = makeString( "cb-precision-suggest&~a" );
    $kw3$PRECISION_SUGGEST = makeKeyword( "PRECISION-SUGGEST" );
    $sym4$CB_LINK_PRECISION_SUGGEST = makeSymbol( "CB-LINK-PRECISION-SUGGEST" );
    $str5$the_Cyc_KB_editing_facilities = makeString( "the Cyc KB editing facilities" );
    $list6 = ConsesLow.list( makeSymbol( "ID" ) );
    $str7$_a_does_not_specify_an_assertion = makeString( "~a does not specify an assertion" );
    $sym8$CB_PRECISION_SUGGEST = makeSymbol( "CB-PRECISION-SUGGEST" );
    $kw9$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str10$Precision_suggestor_done = makeString( "Precision suggestor done" );
    $kw11$DONE = makeKeyword( "DONE" );
    $str12$Precision_Suggestor = makeString( "Precision Suggestor" );
    $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str14$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw15$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw16$CB_CYC = makeKeyword( "CB-CYC" );
    $kw17$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw18$SHA1 = makeKeyword( "SHA1" );
    $str19$yui_skin_sam = makeString( "yui-skin-sam" );
    $str20$reloadFrameButton = makeString( "reloadFrameButton" );
    $str21$button = makeString( "button" );
    $str22$reload = makeString( "reload" );
    $str23$Refresh_Frames = makeString( "Refresh Frames" );
    $str24$post = makeString( "post" );
    $str25$cb_handle_precision_suggest = makeString( "cb-handle-precision-suggest" );
    $str26$stack_id = makeString( "stack-id" );
    $str27$state_id = makeString( "state-id" );
    $str28$The_following_are_more_precise_ve = makeString( "The following are more precise versions of " );
    $str29$_in_ = makeString( " in " );
    $str30$_ = makeString( "." );
    $str31$Select_all_that_are_true__possibl = makeString( "Select all that are true (possibly none) and click Submit." );
    $str32$_Warning___If_there_are_meta_asse = makeString( "(Warning:  If there are meta-assertions on the original assertion, they will not be preserved on the precisified version.)" );
    $str33$Submit = makeString( "Submit" );
    $str34$t = makeString( "t" );
    $sym35$CB_HANDLE_PRECISION_SUGGEST = makeSymbol( "CB-HANDLE-PRECISION-SUGGEST" );
    $str36$You_submitted_a_stale_Precision_S = makeString( "You submitted a stale Precision Suggestor page.  No action taken." );
    $sym37$CB_PRECISION_SUGGESTOR_STATE_P = makeSymbol( "CB-PRECISION-SUGGESTOR-STATE-P" );
    $sym38$CB_PRECISION_SUGGESTOR_STATE_STACK_P = makeSymbol( "CB-PRECISION-SUGGESTOR-STATE-STACK-P" );
    $kw39$PRECISION_SUGGESTOR = makeKeyword( "PRECISION-SUGGESTOR" );
    $str40$Precis = makeString( "Precis" );
    $str41$Restart_the_Precision_Suggestor_t = makeString( "Restart the Precision Suggestor tool where you left off" );
    $str42$_Precis_ = makeString( "[Precis]" );
    $kw43$MAIN = makeKeyword( "MAIN" );
    $str44$cb_restart_precision_suggestor = makeString( "cb-restart-precision-suggestor" );
    $sym45$CB_LINK_PRECISION_SUGGESTOR = makeSymbol( "CB-LINK-PRECISION-SUGGESTOR" );
    $str46$the_Precision_Suggestor = makeString( "the Precision Suggestor" );
    $sym47$CB_RESTART_PRECISION_SUGGESTOR = makeSymbol( "CB-RESTART-PRECISION-SUGGESTOR" );
    $str48$There_are_no_unfinished_Precision = makeString( "There are no unfinished Precision Suggestor sessions.  To start one, browse an assertion and click [Precisify]." );
    $sym49$NON_EMPTY_LIST_P = makeSymbol( "NON-EMPTY-LIST-P" );
    $sym50$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $str51$cb_handle_precision_suggestor_res = makeString( "cb-handle-precision-suggestor-restart" );
    $str52$Unfinished_sessions = makeString( "Unfinished sessions" );
    $str53$Resume_or_destroy_unfinished_Prec = makeString( "Resume or destroy unfinished Precision Suggestor sessions that you have started." );
    $str54$__A_total_ = makeString( "(~A total)" );
    $kw55$DESTROY_ALL_PRECISION_SUGGEST = makeKeyword( "DESTROY-ALL-PRECISION-SUGGEST" );
    $kw56$LEFT = makeKeyword( "LEFT" );
    $kw57$TOP = makeKeyword( "TOP" );
    $str58$Actions = makeString( "Actions" );
    $kw59$RESUME_PRECISION_SUGGEST = makeKeyword( "RESUME-PRECISION-SUGGEST" );
    $kw60$DESTROY_PRECISION_SUGGEST = makeKeyword( "DESTROY-PRECISION-SUGGEST" );
    $str61$Original_assertion = makeString( "Original assertion" );
    $str62$Current_formula = makeString( "Current formula" );
    $str63$Leaves = makeString( "Leaves" );
    $str64$_Resume_ = makeString( "[Resume]" );
    $str65$cb_resume_precision_suggest__a = makeString( "cb-resume-precision-suggest&~a" );
    $sym66$CB_LINK_RESUME_PRECISION_SUGGEST = makeSymbol( "CB-LINK-RESUME-PRECISION-SUGGEST" );
    $str67$You_attempted_to_resume_a_Precisi = makeString( "You attempted to resume a Precision Suggestor session that no longer exists." );
    $sym68$CB_RESUME_PRECISION_SUGGEST = makeSymbol( "CB-RESUME-PRECISION-SUGGEST" );
    $str69$_Destroy_ = makeString( "[Destroy]" );
    $str70$cb_destroy_precision_suggest__a = makeString( "cb-destroy-precision-suggest&~a" );
    $sym71$CB_LINK_DESTROY_PRECISION_SUGGEST = makeSymbol( "CB-LINK-DESTROY-PRECISION-SUGGEST" );
    $list72 = ConsesLow.list( makeSymbol( "ID-AS-STRING" ) );
    $sym73$CB_DESTROY_PRECISION_SUGGEST = makeSymbol( "CB-DESTROY-PRECISION-SUGGEST" );
    $str74$_Destroy_All_ = makeString( "[Destroy All]" );
    $str75$cb_destroy_all_precision_suggest_ = makeString( "cb-destroy-all-precision-suggest&~a" );
    $sym76$CB_LINK_DESTROY_ALL_PRECISION_SUGGEST = makeSymbol( "CB-LINK-DESTROY-ALL-PRECISION-SUGGEST" );
    $sym77$CB_DESTROY_ALL_PRECISION_SUGGEST = makeSymbol( "CB-DESTROY-ALL-PRECISION-SUGGEST" );
    $str78$None_ = makeString( "None." );
    $str79$Mt__ = makeString( "Mt :" );
    $str80$Sentence__ = makeString( "Sentence :" );
    $sym81$CB_PRECISION_SUGGESTOR_STATE = makeSymbol( "CB-PRECISION-SUGGESTOR-STATE" );
    $list82 = ConsesLow.list( makeSymbol( "ORIGINAL-FORMULA" ), makeSymbol( "ORIGINAL-MT" ), makeSymbol( "CURRENT-FORMULA" ), makeSymbol( "CURRENT-MT" ), makeSymbol( "SUGGESTIONS" ), makeSymbol(
        "PRECISION-SUGGESTION-FUNCTION" ), makeSymbol( "IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" ), makeSymbol( "IMPLEMENTATION-SPECIFIC-STATE" ) );
    $list83 = ConsesLow.list( makeKeyword( "ORIGINAL-FORMULA" ), makeKeyword( "ORIGINAL-MT" ), makeKeyword( "CURRENT-FORMULA" ), makeKeyword( "CURRENT-MT" ), makeKeyword( "SUGGESTIONS" ), makeKeyword(
        "PRECISION-SUGGESTION-FUNCTION" ), makeKeyword( "IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" ), makeKeyword( "IMPLEMENTATION-SPECIFIC-STATE" ) );
    $list84 = ConsesLow.list( makeSymbol( "CB-PSS-ORIGINAL-FORMULA" ), makeSymbol( "CB-PSS-ORIGINAL-MT" ), makeSymbol( "CB-PSS-CURRENT-FORMULA" ), makeSymbol( "CB-PSS-CURRENT-MT" ), makeSymbol( "CB-PSS-SUGGESTIONS" ),
        makeSymbol( "CB-PSS-PRECISION-SUGGESTION-FUNCTION" ), makeSymbol( "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" ), makeSymbol( "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE" ) );
    $list85 = ConsesLow.list( makeSymbol( "_CSETF-CB-PSS-ORIGINAL-FORMULA" ), makeSymbol( "_CSETF-CB-PSS-ORIGINAL-MT" ), makeSymbol( "_CSETF-CB-PSS-CURRENT-FORMULA" ), makeSymbol( "_CSETF-CB-PSS-CURRENT-MT" ),
        makeSymbol( "_CSETF-CB-PSS-SUGGESTIONS" ), makeSymbol( "_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION" ), makeSymbol( "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" ), makeSymbol(
            "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE" ) );
    $sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE = makeSymbol( "PRINT-CB-PRECISION-SUGGESTOR-STATE" );
    $sym87$CB_PRECISION_SUGGESTOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CB-PRECISION-SUGGESTOR-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list88 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CB-PRECISION-SUGGESTOR-STATE-P" ) );
    $sym89$CB_PSS_ORIGINAL_FORMULA = makeSymbol( "CB-PSS-ORIGINAL-FORMULA" );
    $sym90$_CSETF_CB_PSS_ORIGINAL_FORMULA = makeSymbol( "_CSETF-CB-PSS-ORIGINAL-FORMULA" );
    $sym91$CB_PSS_ORIGINAL_MT = makeSymbol( "CB-PSS-ORIGINAL-MT" );
    $sym92$_CSETF_CB_PSS_ORIGINAL_MT = makeSymbol( "_CSETF-CB-PSS-ORIGINAL-MT" );
    $sym93$CB_PSS_CURRENT_FORMULA = makeSymbol( "CB-PSS-CURRENT-FORMULA" );
    $sym94$_CSETF_CB_PSS_CURRENT_FORMULA = makeSymbol( "_CSETF-CB-PSS-CURRENT-FORMULA" );
    $sym95$CB_PSS_CURRENT_MT = makeSymbol( "CB-PSS-CURRENT-MT" );
    $sym96$_CSETF_CB_PSS_CURRENT_MT = makeSymbol( "_CSETF-CB-PSS-CURRENT-MT" );
    $sym97$CB_PSS_SUGGESTIONS = makeSymbol( "CB-PSS-SUGGESTIONS" );
    $sym98$_CSETF_CB_PSS_SUGGESTIONS = makeSymbol( "_CSETF-CB-PSS-SUGGESTIONS" );
    $sym99$CB_PSS_PRECISION_SUGGESTION_FUNCTION = makeSymbol( "CB-PSS-PRECISION-SUGGESTION-FUNCTION" );
    $sym100$_CSETF_CB_PSS_PRECISION_SUGGESTION_FUNCTION = makeSymbol( "_CSETF-CB-PSS-PRECISION-SUGGESTION-FUNCTION" );
    $sym101$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeSymbol( "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" );
    $sym102$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeSymbol( "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" );
    $sym103$CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = makeSymbol( "CB-PSS-IMPLEMENTATION-SPECIFIC-STATE" );
    $sym104$_CSETF_CB_PSS_IMPLEMENTATION_SPECIFIC_STATE = makeSymbol( "_CSETF-CB-PSS-IMPLEMENTATION-SPECIFIC-STATE" );
    $kw105$ORIGINAL_FORMULA = makeKeyword( "ORIGINAL-FORMULA" );
    $kw106$ORIGINAL_MT = makeKeyword( "ORIGINAL-MT" );
    $kw107$CURRENT_FORMULA = makeKeyword( "CURRENT-FORMULA" );
    $kw108$CURRENT_MT = makeKeyword( "CURRENT-MT" );
    $kw109$SUGGESTIONS = makeKeyword( "SUGGESTIONS" );
    $kw110$PRECISION_SUGGESTION_FUNCTION = makeKeyword( "PRECISION-SUGGESTION-FUNCTION" );
    $kw111$IMPLEMENTATION_SPECIFIC_STATE_UPDATE_FUNCTION = makeKeyword( "IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" );
    $kw112$IMPLEMENTATION_SPECIFIC_STATE = makeKeyword( "IMPLEMENTATION-SPECIFIC-STATE" );
    $str113$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw114$BEGIN = makeKeyword( "BEGIN" );
    $sym115$MAKE_CB_PRECISION_SUGGESTOR_STATE = makeSymbol( "MAKE-CB-PRECISION-SUGGESTOR-STATE" );
    $kw116$SLOT = makeKeyword( "SLOT" );
    $kw117$END = makeKeyword( "END" );
    $sym118$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-STATE-METHOD" );
    $str119$_S = makeString( "~S" );
    $list120 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PRECISION-SUGGESTION-FUNCTION" ), makeSymbol( "INITIAL-IMPLEMENTATION-SPECIFIC-STATE-FUNCTION" ), makeSymbol(
        "IMPLEMENTATION-SPECIFIC-STATE-UPDATE-FUNCTION" ) );
    $sym121$_CB_CURRENT_PRECISION_SUGGESTION_IMPLEMENTATION_ = makeSymbol( "*CB-CURRENT-PRECISION-SUGGESTION-IMPLEMENTATION*" );
    $kw122$CB_RKF_PRECISION_SUGGESTION_IMPLEMENTATION = makeKeyword( "CB-RKF-PRECISION-SUGGESTION-IMPLEMENTATION" );
    $sym123$_CB_PRECISION_SUGGESTION_IMPLEMENTATIONS_ = makeSymbol( "*CB-PRECISION-SUGGESTION-IMPLEMENTATIONS*" );
    $sym124$CAR = makeSymbol( "CAR" );
    $kw125$CB_INFERENCE_PRECISION_SUGGESTION_IMPLEMENTATION = makeKeyword( "CB-INFERENCE-PRECISION-SUGGESTION-IMPLEMENTATION" );
    $str126$OE_inference_based_implementation = makeString( "OE/inference-based implementation" );
    $sym127$CB_INFERENCE_PRECISION_SUGGESTION_FUNCTION = makeSymbol( "CB-INFERENCE-PRECISION-SUGGESTION-FUNCTION" );
    $sym128$CB_PRECISION_SUGGESTOR_INITIAL_INFERENCE_STATE = makeSymbol( "CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE" );
    $sym129$CB_PRECISION_SUGGESTOR_INFERENCE_STATE_UPDATE_FUNCTION = makeSymbol( "CB-PRECISION-SUGGESTOR-INFERENCE-STATE-UPDATE-FUNCTION" );
    $str130$keStrengtheningSuggestion = makeString( "keStrengtheningSuggestion" );
    $sym131$_STRONG = makeSymbol( "?STRONG" );
    $const132$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const133$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $list134 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER, makeKeyword( "MAX-TIME" ), makeInteger( 60 ) );
    $str135$RKF_implementation = makeString( "RKF implementation" );
    $sym136$CB_RKF_PRECISION_SUGGESTION_FUNCTION = makeSymbol( "CB-RKF-PRECISION-SUGGESTION-FUNCTION" );
    $sym137$CB_PRECISION_SUGGESTOR_INITIAL_RKF_STATE = makeSymbol( "CB-PRECISION-SUGGESTOR-INITIAL-RKF-STATE" );
    $sym138$CB_PRECISION_SUGGESTOR_RKF_STATE_UPDATE_FUNCTION = makeSymbol( "CB-PRECISION-SUGGESTOR-RKF-STATE-UPDATE-FUNCTION" );
    $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE = makeSymbol( "CB-PRECISION-SUGGESTOR-RKF-STATE" );
    $sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P = makeSymbol( "CB-PRECISION-SUGGESTOR-RKF-STATE-P" );
    $list141 = ConsesLow.list( makeSymbol( "NEXT-ARG-TO-PRECISIFY" ), makeSymbol( "NEXT-DIRECTION-TO-PRECISIFY" ) );
    $list142 = ConsesLow.list( makeKeyword( "NEXT-ARG-TO-PRECISIFY" ), makeKeyword( "NEXT-DIRECTION-TO-PRECISIFY" ) );
    $list143 = ConsesLow.list( makeSymbol( "CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY" ), makeSymbol( "CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY" ) );
    $list144 = ConsesLow.list( makeSymbol( "_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY" ), makeSymbol( "_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY" ) );
    $sym145$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym146$CB_PRECISION_SUGGESTOR_RKF_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CB-PRECISION-SUGGESTOR-RKF-STATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list147 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CB-PRECISION-SUGGESTOR-RKF-STATE-P" ) );
    $sym148$CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = makeSymbol( "CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY" );
    $sym149$_CSETF_CB_PS_RKF_S_NEXT_ARG_TO_PRECISIFY = makeSymbol( "_CSETF-CB-PS-RKF-S-NEXT-ARG-TO-PRECISIFY" );
    $sym150$CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = makeSymbol( "CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY" );
    $sym151$_CSETF_CB_PS_RKF_S_NEXT_DIRECTION_TO_PRECISIFY = makeSymbol( "_CSETF-CB-PS-RKF-S-NEXT-DIRECTION-TO-PRECISIFY" );
    $kw152$NEXT_ARG_TO_PRECISIFY = makeKeyword( "NEXT-ARG-TO-PRECISIFY" );
    $kw153$NEXT_DIRECTION_TO_PRECISIFY = makeKeyword( "NEXT-DIRECTION-TO-PRECISIFY" );
    $sym154$MAKE_CB_PRECISION_SUGGESTOR_RKF_STATE = makeSymbol( "MAKE-CB-PRECISION-SUGGESTOR-RKF-STATE" );
    $sym155$VISIT_DEFSTRUCT_OBJECT_CB_PRECISION_SUGGESTOR_RKF_STATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CB-PRECISION-SUGGESTOR-RKF-STATE-METHOD" );
    $kw156$GENERALIZE = makeKeyword( "GENERALIZE" );
    $kw157$SPECIALIZE = makeKeyword( "SPECIALIZE" );
    $const158$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym159$GENL_ = makeSymbol( "GENL?" );
    $sym160$SPEC_ = makeSymbol( "SPEC?" );
    $const161$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $sym162$GENL_PREDICATE_ = makeSymbol( "GENL-PREDICATE?" );
    $sym163$SPEC_PREDICATE_ = makeSymbol( "SPEC-PREDICATE?" );
    $kw164$ASCENDING = makeKeyword( "ASCENDING" );
    $kw165$DESCENDING = makeKeyword( "DESCENDING" );
    $sym166$CB_PRECISION_SUGGESTOR_REDUNDANT_SUGGESTION = makeSymbol( "CB-PRECISION-SUGGESTOR-REDUNDANT-SUGGESTION" );
  }

  public static final class $cb_precision_suggestor_state_native
      extends
        SubLStructNative
  {
    public SubLObject $original_formula;
    public SubLObject $original_mt;
    public SubLObject $current_formula;
    public SubLObject $current_mt;
    public SubLObject $suggestions;
    public SubLObject $precision_suggestion_function;
    public SubLObject $implementation_specific_state_update_function;
    public SubLObject $implementation_specific_state;
    private static final SubLStructDeclNative structDecl;

    public $cb_precision_suggestor_state_native()
    {
      this.$original_formula = CommonSymbols.NIL;
      this.$original_mt = CommonSymbols.NIL;
      this.$current_formula = CommonSymbols.NIL;
      this.$current_mt = CommonSymbols.NIL;
      this.$suggestions = CommonSymbols.NIL;
      this.$precision_suggestion_function = CommonSymbols.NIL;
      this.$implementation_specific_state_update_function = CommonSymbols.NIL;
      this.$implementation_specific_state = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cb_precision_suggestor_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$original_formula;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$original_mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$current_formula;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$current_mt;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$suggestions;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$precision_suggestion_function;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$implementation_specific_state_update_function;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$implementation_specific_state;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$original_formula = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$original_mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$current_formula = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$current_mt = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$suggestions = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$precision_suggestion_function = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$implementation_specific_state_update_function = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$implementation_specific_state = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cb_precision_suggestor_state_native.class, $sym81$CB_PRECISION_SUGGESTOR_STATE, $sym37$CB_PRECISION_SUGGESTOR_STATE_P, $list82, $list83, new String[] {
        "$original_formula", "$original_mt", "$current_formula", "$current_mt", "$suggestions", "$precision_suggestion_function", "$implementation_specific_state_update_function", "$implementation_specific_state"
      }, $list84, $list85, $sym86$PRINT_CB_PRECISION_SUGGESTOR_STATE );
    }
  }

  public static final class $cb_precision_suggestor_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cb_precision_suggestor_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CB-PRECISION-SUGGESTOR-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cb_precision_suggestor_state_p( arg1 );
    }
  }

  public static final class $cb_precision_suggestor_rkf_state_native
      extends
        SubLStructNative
  {
    public SubLObject $next_arg_to_precisify;
    public SubLObject $next_direction_to_precisify;
    private static final SubLStructDeclNative structDecl;

    public $cb_precision_suggestor_rkf_state_native()
    {
      this.$next_arg_to_precisify = CommonSymbols.NIL;
      this.$next_direction_to_precisify = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cb_precision_suggestor_rkf_state_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$next_arg_to_precisify;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$next_direction_to_precisify;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$next_arg_to_precisify = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$next_direction_to_precisify = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cb_precision_suggestor_rkf_state_native.class, $sym139$CB_PRECISION_SUGGESTOR_RKF_STATE, $sym140$CB_PRECISION_SUGGESTOR_RKF_STATE_P, $list141, $list142, new String[] {
        "$next_arg_to_precisify", "$next_direction_to_precisify"
      }, $list143, $list144, $sym145$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cb_precision_suggestor_rkf_state_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cb_precision_suggestor_rkf_state_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CB-PRECISION-SUGGESTOR-RKF-STATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cb_precision_suggestor_rkf_state_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 790 ms
 * 
 */