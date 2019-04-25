package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_blue_grapher
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_blue_grapher";
  public static final String myFingerPrint = "2a159d440b6fe62de5ad6bbae7157de4d8b7628a376b5d001a851001eca9008d";
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 766L)
  private static SubLSymbol $cb_blue_grapher_debug$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 818L)
  public static SubLSymbol $cb_blue_current_blue_user_action$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1025L)
  private static SubLSymbol $cb_blue_key$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1178L)
  public static SubLSymbol $cb_blue_user_action_data_pred_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1288L)
  public static SubLSymbol $cb_blue_user_action_data_fort_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1398L)
  public static SubLSymbol $cb_blue_user_action_data_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19226L)
  public static SubLSymbol $cb_blue_codebase$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19415L)
  public static SubLSymbol $cb_blue_class_file$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19506L)
  public static SubLSymbol $cb_blue_applet_default_width$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19568L)
  public static SubLSymbol $cb_blue_applet_default_height$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19629L)
  public static SubLSymbol $cb_blue_cyc_graph_command_add_edge_string$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19754L)
  public static SubLSymbol $cb_blue_cyc_graph_command_add_graph_string$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 19879L)
  public static SubLSymbol $cb_blue_cyc_graph_command_add_node_string$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 21843L)
  public static SubLSymbol $cb_blue_applet_reset_delay$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 21992L)
  public static SubLSymbol $cb_blue_applet_window_width$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22065L)
  public static SubLSymbol $cb_blue_applet_window_height$;
  private static final SubLSymbol $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_;
  private static final SubLSymbol $kw1$BLUE;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$USER_ACTION_ID_STRING;
  private static final SubLSymbol $kw6$PREFERENCES;
  private static final SubLSymbol $kw7$MODE;
  private static final SubLSymbol $kw8$BUILDER_FN_KEY;
  private static final SubLSymbol $kw9$PREDS;
  private static final SubLSymbol $kw10$FORTS;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$CYCLIST;
  private static final SubLSymbol $kw13$TYPE_KEY;
  private static final SubLString $str14$cb_blue__Could_not_create_a_user_;
  private static final SubLSymbol $kw15$BUILD;
  private static final SubLSymbol $kw16$FILTER_FN_KEYS;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLString $str19$_Blue_Grapher_;
  private static final SubLSymbol $kw20$MAIN;
  private static final SubLString $str21$cb_blue;
  private static final SubLSymbol $sym22$CB_LINK__CB_BLUE_KEY_;
  private static final SubLString $str23$Blue_Grapher_interaction_in_progr;
  private static final SubLSymbol $kw24$BLUE_INDEX;
  private static final SubLString $str25$blueindex;
  private static final SubLString $str26$cb_blue_index_frame;
  private static final SubLString $str27$__user_action_id_string__a;
  private static final SubLSymbol $kw28$BLUE_CONTENT;
  private static final SubLString $str29$bluecontent;
  private static final SubLString $str30$cb_blue_content_frame;
  private static final SubLString $str31$Blue_Grapher;
  private static final SubLSymbol $sym32$CB_BLUE;
  private static final SubLSymbol $kw33$HTML_HANDLER;
  private static final SubLString $str34$Fatal_Error;
  private static final SubLString $str35$cb_blue_internal_called_without_a;
  private static final SubLString $str36$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str37$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw38$UNINITIALIZED;
  private static final SubLString $str39$Cannot_have_a_FRAMESET_tag_inside;
  private static final SubLString $str40$40__;
  private static final SubLString $str41$no;
  private static final SubLSymbol $sym42$CB_BLUE_INDEX_FRAME;
  private static final SubLString $str43$Blue_Grapher_Button_Bar;
  private static final SubLString $str44$cb_blue_content_frame__user_actio;
  private static final SubLString $str45$Restart;
  private static final SubLString $str46$_;
  private static final SubLString $str47$cb_blue_content_frame__user_actio;
  private static final SubLString $str48$Build;
  private static final SubLSymbol $sym49$CB_BLUE_CONTENT_FRAME;
  private static final SubLString $str50$cb_blue_content_frame_internal__n;
  private static final SubLSymbol $kw51$ACTION;
  private static final SubLSymbol $kw52$RESTART;
  private static final SubLString $str53$invalid_mode___A__or_mode_not_imp;
  private static final SubLString $str54$cb_blue_build__no_user_action_fou;
  private static final SubLSymbol $sym55$CB_BLUE_BUILD;
  private static final SubLString $str56$cb_blue_build_internal__no_user_a;
  private static final SubLSymbol $sym57$FORT_TO_STRING;
  private static final SubLSymbol $sym58$TERMS_FOR_BROWSING;
  private static final SubLSymbol $kw59$MT;
  private static final SubLObject $const60$CyclistsMt;
  private static final SubLString $str61$initial_arghash;
  private static final SubLString $str62$___;
  private static final SubLSymbol $sym63$STRING_;
  private static final SubLSymbol $sym64$SYMBOL_NAME;
  private static final SubLString $str65$validation;
  private static final SubLObject $const66$Predicate;
  private static final SubLObject $const67$Microtheory;
  private static final SubLString $str68$arghash_after_validation;
  private static final SubLString $str69$_user_action_data_user_action__af;
  private static final SubLString $str70$Blue_Grapher___Building_Graph;
  private static final SubLSymbol $kw71$POST;
  private static final SubLString $str72$cb_blue_build;
  private static final SubLSymbol $kw73$TOP;
  private static final SubLString $str74$;
  private static final SubLSymbol $kw75$KEYWORD;
  private static final SubLString $str76$onChange_javascript_this_form_sub;
  private static final SubLSymbol $kw77$HELP_STRING;
  private static final SubLString $str78$___br_;
  private static final SubLString $str79$___;
  private static final SubLString $str80$__br_;
  private static final SubLString $str81$___;
  private static final SubLString $str82$PREDS__;
  private static final SubLString $str83$FORTS__;
  private static final SubLString $str84$MT__;
  private static final SubLString $str85$FILTER_FNS__;
  private static final SubLString $str86$DEPTH__;
  private static final SubLSymbol $kw87$DEPTH;
  private static final SubLSymbol $kw88$INTEGER;
  private static final SubLSymbol $kw89$NBSP;
  private static final SubLString $str90$Submit;
  private static final SubLSymbol $kw91$SUBMIT;
  private static final SubLString $str92$Status__;
  private static final SubLString $str93$Ready_to_;
  private static final SubLString $str94$_1;
  private static final SubLSymbol $kw95$GRAPH_EVENT;
  private static final SubLString $str96$_Visualize_;
  private static final SubLString $str97$Waiting_for_more_input_;
  private static final SubLString $str98$Algorithm__;
  private static final SubLString $str99$Forts__;
  private static final SubLString $str100$Preds__;
  private static final SubLString $str101$Mt__;
  private static final SubLString $str102$Depth__;
  private static final SubLString $str103$Filters__;
  private static final SubLSymbol $kw104$SIGNATURE;
  private static final SubLString $str105$_A;
  private static final SubLInteger $int106$30;
  private static final SubLString $str107$cb_graph_event;
  private static final SubLSymbol $sym108$CB_LINK_GRAPH_EVENT;
  private static final SubLString $str109$_a;
  private static final SubLSymbol $sym110$CB_GRAPH_EVENT_PROCESS;
  private static final SubLSymbol $sym111$CB_GRAPH_EVENT;
  private static final SubLString $str112$CYC;
  private static final SubLSymbol $kw113$BUILDER_FN;
  private static final SubLSymbol $kw114$FILTER_FNS;
  private static final SubLString $str115$_java_script_editor;
  private static final SubLString $str116$com_cyc_framework_ui_blue_cyc_Cyc;
  private static final SubLString $str117$100_;
  private static final SubLString $str118$90_;
  private static final SubLString $str119$com_cyc_framework_ui_blue_cyc_Cyc;
  private static final SubLString $str120$com_cyc_framework_ui_blue_cyc_Cyc;
  private static final SubLString $str121$com_cyc_framework_ui_blue_cyc_Cyc;
  private static final SubLSymbol $kw122$WIDTH;
  private static final SubLSymbol $kw123$HEIGHT;
  private static final SubLSymbol $kw124$DOMAIN_MT;
  private static final SubLSymbol $kw125$PARSING_MT;
  private static final SubLSymbol $kw126$GENERATION_MT;
  private static final SubLString $str127$script_editor;
  private static final SubLSymbol $kw128$CLASS_FILE;
  private static final SubLString $str129$user;
  private static final SubLString $str130$domain_mt;
  private static final SubLString $str131$parsing_mt;
  private static final SubLString $str132$generation_mt;
  private static final SubLString $str133$signature;
  private static final SubLString $str134$baseport;
  private static final SubLString $str135$_Java_applet_could_not_be_display;
  private static final SubLInteger $int136$1010;
  private static final SubLInteger $int137$750;
  private static final SubLSymbol $sym138$CB_BLUE_APPLET_WINDOW;
  private static final SubLString $str139$Blue_Graph;
  private static final SubLList $list140;
  private static final SubLSymbol $kw141$INNERHEIGHT;
  private static final SubLSymbol $kw142$INNERWIDTH;
  private static final SubLList $list143;
  private static final SubLString $str144$cb_blue_applet_window;
  private static final SubLString $str145$window_open__;
  private static final SubLString $str146$__;
  private static final SubLString $str147$__A_;
  private static final SubLString $str148$null;
  private static final SubLString $str149$___A____;
  private static final SubLString $str150$return_false_;
  private static final SubLSymbol $kw151$BLUE_APPLET_WINDOW;
  private static final SubLSymbol $sym152$CB_LINK_BLUE_APPLET_WINDOW;

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 1919L)
  public static SubLObject cb_blue_new_user_action()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user_action = user_actions.new_user_action( ConsesLow.list( $kw12$CYCLIST, operation_communication.the_cyclist(), $kw13$TYPE_KEY, $cb_blue_key$.getDynamicValue( thread ) ) );
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      Errors.error( $str14$cb_blue__Could_not_create_a_user_ );
    }
    user_actions._csetf_user_action_creation_time( user_action, Time.get_universal_time() );
    user_actions._csetf_user_action_data( user_action, Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED ) );
    Hashtables.sethash( $kw5$USER_ACTION_ID_STRING, user_actions.user_action_data( user_action ), ConsesLow.list( user_actions.user_action_id_string( user_action ) ) );
    cb_blue_restart( user_action );
    cb_blue_remove_transient_user_action_data( user_action );
    return user_action;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 2708L)
  public static SubLObject cb_blue_remove_transient_user_action_data(final SubLObject user_action)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_data = user_actions.user_action_data( user_action );
    user_actions._csetf_user_action_data( user_action, Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED ) );
    if( old_data.isHashtable() )
    {
      SubLObject k = NIL;
      SubLObject v = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( old_data );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          k = Hashtables.getEntryKey( cdohash_entry );
          v = Hashtables.getEntryValue( cdohash_entry );
          if( NIL != subl_promotions.memberP( k, $cb_blue_user_action_data_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
          {
            Hashtables.sethash( k, user_actions.user_action_data( user_action ), v );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3079L)
  public static SubLObject cb_blue_update_user_action_data_from_arghash(final SubLObject user_action, final SubLObject arghash)
  {
    hash_table_utilities.copy_hash_table_values_into( arghash, user_actions.user_action_data( user_action ) );
    hash_table_utilities.copy_hash_table_values_into( user_actions.user_action_data( user_action ), arghash );
    cb_blue_remove_transient_user_action_data( user_action );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3380L)
  public static SubLObject cb_blue_remove_keys_from_user_action_data(final SubLObject user_action, final SubLObject keys)
  {
    SubLObject cdolist_list_var = keys;
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      Hashtables.remhash( key, user_actions.user_action_data( user_action ) );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 3543L)
  public static SubLObject cb_blue_restart(final SubLObject user_action)
  {
    SubLObject arghash = html_arghash.new_arghash( UNPROVIDED );
    final SubLObject user_action_id_string = Hashtables.gethash( $kw5$USER_ACTION_ID_STRING, user_actions.user_action_data( user_action ), UNPROVIDED );
    html_arghash.set_arghash_value( $kw7$MODE, arghash, $kw15$BUILD );
    html_arghash.set_arghash_value_list( $kw16$FILTER_FN_KEYS, arghash, $list17 );
    html_arghash.set_arghash_value_list( $kw8$BUILDER_FN_KEY, arghash, $list18 );
    user_actions._csetf_user_action_data( user_action, Hashtables.make_hash_table( TWENTY_INTEGER, UNPROVIDED, UNPROVIDED ) );
    Hashtables.sethash( $kw5$USER_ACTION_ID_STRING, user_actions.user_action_data( user_action ), user_action_id_string );
    arghash = cb_blue_update_user_action_data_from_arghash( user_action, arghash );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 4208L)
  public static SubLObject cb_link_Xcb_blue_keyX(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str19$_Blue_Grapher_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw20$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str21$cb_blue );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 4623L)
  public static SubLObject cb_blue_summary(final SubLObject user_action_id_string)
  {
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    html_utilities.html_princ( $str23$Blue_Grapher_interaction_in_progr );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 5148L)
  public static SubLObject cb_blue(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str31$Blue_Grapher );
    }
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    return cb_blue_internal( arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 5446L)
  public static SubLObject cb_blue_internal(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject user_action_id_string = hash_table_utilities.gethash_first( $kw5$USER_ACTION_ID_STRING, arghash, UNPROVIDED );
    SubLObject user_action = NIL;
    if( NIL != user_action_id_string )
    {
      user_action = user_actions.user_action_by_id_string( user_action_id_string );
    }
    else
    {
      final SubLObject all_blue_actions_for_user = user_actions.all_actions_for_cyclist_of_type( operation_communication.the_cyclist(), $cb_blue_key$.getDynamicValue( thread ) );
      final SubLObject pcase_var = Sequences.length( all_blue_actions_for_user );
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        final SubLObject user_action_$1 = cb_blue_new_user_action();
        hash_table_utilities.push_hash( $kw5$USER_ACTION_ID_STRING, user_actions.user_action_id_string( user_action_$1 ), arghash );
        cb_blue_internal( arghash );
        return NIL;
      }
      if( !pcase_var.eql( ONE_INTEGER ) )
      {
        cb_user_actions.cb_show_actions_internal( $cb_blue_key$.getDynamicValue( thread ) );
        return NIL;
      }
      user_action = all_blue_actions_for_user.first();
      user_action_id_string = user_actions.user_action_id_string( user_action );
    }
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      cyc_navigator_internals.generic_message_page( $str34$Fatal_Error, PrintLow.format( NIL, $str35$cb_blue_internal_called_without_a ) );
    }
    else
    {
      html_utilities.html_markup( $str36$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str37$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        if( NIL != html_macros.html_inside_body_p() )
        {
          Errors.error( $str39$Cannot_have_a_FRAMESET_tag_inside );
        }
        html_utilities.html_markup( html_macros.$html_frameset_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_frameset_rows$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str40$40__ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_frameset_frameborder$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str41$no );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_frame( $kw24$BLUE_INDEX, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_utilities.cb_frame( $kw28$BLUE_CONTENT, user_action_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7078L)
  public static SubLObject cb_blue_index_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    return cb_blue_index_frame_internal( arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7341L)
  public static SubLObject cb_blue_index_frame_internal(final SubLObject arghash)
  {
    final SubLObject user_action = cb_user_actions.get_user_action_from_arghash( arghash );
    if( NIL != user_action )
    {
      cb_blue_button_bar( user_action );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 7540L)
  public static SubLObject cb_blue_button_bar(final SubLObject user_action)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      return NIL;
    }
    final SubLObject user_action_id_string = user_actions.user_action_id_string( user_action );
    html_utilities.html_markup( $str36$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str37$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str43$Blue_Grapher_Button_Bar );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != html_macros.$html_color_lighter_blue$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_lighter_blue$.getGlobalValue() ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          html_utilities.html_princ( $str31$Blue_Grapher );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
          html_utilities.html_indent( THREE_INTEGER );
          SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw28$BLUE_CONTENT );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_parameters.cyc_cgi_url_int();
          html_utilities.html_princ( PrintLow.format( NIL, $str44$cb_blue_content_frame__user_actio, user_action_id_string ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str45$Restart );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_princ( $str46$_ );
          html_utilities.html_indent( UNPROVIDED );
          frame_name_var = cb_utilities.cb_frame_name( $kw28$BLUE_CONTENT );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_parameters.cyc_cgi_url_int();
          html_utilities.html_princ( PrintLow.format( NIL, $str47$cb_blue_content_frame__user_actio, user_action_id_string ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str48$Build );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 9116L)
  public static SubLObject cb_blue_content_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    return cb_blue_content_frame_internal( arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 9385L)
  public static SubLObject cb_blue_content_frame_internal(SubLObject arghash)
  {
    final SubLObject user_action = cb_user_actions.get_user_action_from_arghash( arghash );
    if( NIL == user_action )
    {
      cb_utilities.cb_error( $str50$cb_blue_content_frame_internal__n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    cb_blue_update_user_action_data_from_arghash( user_action, arghash );
    SubLObject pcase_var;
    final SubLObject action = pcase_var = hash_table_utilities.gethash_first( $kw51$ACTION, arghash, UNPROVIDED );
    if( pcase_var.eql( $kw52$RESTART ) )
    {
      arghash = cb_blue_restart( user_action );
    }
    final SubLObject mode = pcase_var = hash_table_utilities.gethash_first( $kw7$MODE, arghash, UNPROVIDED );
    if( pcase_var.eql( $kw15$BUILD ) )
    {
      cb_blue_build_internal( arghash, UNPROVIDED );
    }
    else
    {
      cb_utilities.cb_error( $str53$invalid_mode___A__or_mode_not_imp, mode, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 10164L)
  public static SubLObject cb_blue_build(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    final SubLObject user_action = cb_user_actions.get_user_action_from_arghash( arghash );
    if( NIL == user_action )
    {
      cb_utilities.cb_error( $str54$cb_blue_build__no_user_action_fou, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    cb_blue_update_user_action_data_from_arghash( user_action, arghash );
    cb_blue_build_internal( arghash, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 10528L)
  public static SubLObject cb_blue_build_internal(final SubLObject raw_arghash, SubLObject user_action)
  {
    if( user_action == UNPROVIDED )
    {
      user_action = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == user_action )
    {
      user_action = cb_user_actions.get_user_action_from_arghash( raw_arghash );
      if( NIL == user_action )
      {
        cb_utilities.cb_error( $str56$cb_blue_build_internal__no_user_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
    }
    final SubLObject debug = $cb_blue_grapher_debug$.getDynamicValue( thread );
    final SubLObject generation_fn = Symbols.symbol_function( $sym57$FORT_TO_STRING );
    final SubLObject parse_fn = Symbols.symbol_function( $sym58$TERMS_FOR_BROWSING );
    final SubLObject filter_mt = ( NIL != fort_types_interface.mtP( html_arghash.get_arghash_value( $kw59$MT, raw_arghash ) ) ) ? html_arghash.get_arghash_value( $kw59$MT, raw_arghash ) : $const60$CyclistsMt;
    if( NIL != debug )
    {
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str61$initial_arghash );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject cdolist_list_var = Sort.sort( hash_table_utilities.hash_table_keys( raw_arghash ), Symbols.symbol_function( $sym63$STRING_ ), Symbols.symbol_function( $sym64$SYMBOL_NAME ) );
      SubLObject k = NIL;
      k = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_princ( k );
        html_utilities.html_princ( $str62$___ );
        html_utilities.html_princ( Hashtables.gethash( k, raw_arghash, UNPROVIDED ) );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        k = cdolist_list_var.first();
      }
    }
    if( NIL != debug )
    {
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str65$validation );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    }
    html_arghash.html_arghash_nl_fort_list_input_validate( raw_arghash, $kw9$PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, parse_fn, $const66$Predicate, filter_mt );
    html_arghash.html_arghash_nl_fort_list_input_validate( raw_arghash, $kw10$FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_arghash.html_arghash_nl_fort_input_validate( raw_arghash, $kw59$MT, debug, generation_fn, parse_fn, $const67$Microtheory, mt_vars.$mt_mt$.getGlobalValue() );
    if( NIL != debug )
    {
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str68$arghash_after_validation );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject cdolist_list_var = Sort.sort( hash_table_utilities.hash_table_keys( raw_arghash ), Symbols.symbol_function( $sym63$STRING_ ), Symbols.symbol_function( $sym64$SYMBOL_NAME ) );
      SubLObject k = NIL;
      k = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_princ( k );
        html_utilities.html_princ( $str62$___ );
        html_utilities.html_princ( Hashtables.gethash( k, raw_arghash, UNPROVIDED ) );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        k = cdolist_list_var.first();
      }
    }
    cb_blue_remove_keys_from_user_action_data( user_action, $cb_blue_user_action_data_fort_keys$.getGlobalValue() );
    cb_blue_remove_keys_from_user_action_data( user_action, $cb_blue_user_action_data_pred_keys$.getGlobalValue() );
    cb_blue_update_user_action_data_from_arghash( user_action, raw_arghash );
    if( NIL != debug )
    {
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str69$_user_action_data_user_action__af );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( THREE_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      SubLObject cdolist_list_var = Sort.sort( hash_table_utilities.hash_table_keys( user_actions.user_action_data( user_action ) ), Symbols.symbol_function( $sym63$STRING_ ), Symbols.symbol_function(
          $sym64$SYMBOL_NAME ) );
      SubLObject k = NIL;
      k = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_princ( k );
        html_utilities.html_princ( $str62$___ );
        html_utilities.html_princ( Hashtables.gethash( k, user_actions.user_action_data( user_action ), UNPROVIDED ) );
        html_utilities.html_newline( UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        k = cdolist_list_var.first();
      }
    }
    html_utilities.html_markup( $str36$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str37$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str70$Blue_Grapher___Building_Graph );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_complete.html_complete_script();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $kw71$POST );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str72$cb_blue_build, T, UNPROVIDED );
            html_arghash.html_arghash_hidden_input( raw_arghash, $kw5$USER_ACTION_ID_STRING, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str74$ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  final SubLObject key_string = html_arghash.arghash_make_key_string( $kw8$BUILDER_FN_KEY, $kw75$KEYWORD );
                  html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( key_string );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
                  html_utilities.html_markup( $str76$onChange_javascript_this_form_sub );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    SubLObject value = NIL;
                    SubLObject value_$15 = NIL;
                    SubLObject value_string = NIL;
                    SubLObject value_string_$16 = NIL;
                    value = blue_grapher_utilities.blue_builder_fn_keys();
                    value_$15 = value.first();
                    value_string = blue_grapher_utilities.blue_builder_fn_keys();
                    value_string_$16 = value_string.first();
                    while ( NIL != value_string || NIL != value)
                    {
                      final SubLObject selected = list_utilities.member_equalP( value_$15, html_arghash.get_arghash_value_list( $kw8$BUILDER_FN_KEY, raw_arghash ) );
                      final SubLObject value_string_$17 = html_arghash.arghash_get_string( value_$15, $kw75$KEYWORD );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      if( NIL != selected )
                      {
                        html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      }
                      if( NIL != value_string_$17 )
                      {
                        html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( value_string_$17 );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( value_string_$16 );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      value = value.rest();
                      value_$15 = value.first();
                      value_string = value_string.rest();
                      value_string_$16 = value_string.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                  SubLObject bbf_help_string = blue_grapher_utilities.get_blue_builder_fn_def_value( html_arghash.get_arghash_value( $kw8$BUILDER_FN_KEY, raw_arghash ), $kw77$HELP_STRING );
                  if( bbf_help_string.isString() )
                  {
                    bbf_help_string = string_utilities.string_substitute( $str78$___br_, $str79$___, bbf_help_string, UNPROVIDED );
                    bbf_help_string = string_utilities.string_substitute( $str80$__br_, $str81$___, bbf_help_string, UNPROVIDED );
                    html_utilities.html_newline( UNPROVIDED );
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( NIL, thread );
                      html_utilities.html_princ( bbf_help_string );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                    }
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str82$PREDS__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_arghash.html_arghash_nl_fort_list_input( raw_arghash, $kw9$PREDS, $cb_blue_user_action_data_pred_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, ONE_INTEGER, T, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str83$FORTS__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_arghash.html_arghash_nl_fort_list_input( raw_arghash, $kw10$FORTS, $cb_blue_user_action_data_fort_keys$.getGlobalValue(), debug, generation_fn, ONE_INTEGER, TWO_INTEGER, T, $const66$Predicate );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str84$MT__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_arghash.html_arghash_nl_fort_input( raw_arghash, $kw59$MT, debug, generation_fn, T, T, $const67$Microtheory );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
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
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str85$FILTER_FNS__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var2 = blue_grapher_utilities.blue_filter_fn_keys( UNPROVIDED );
                  SubLObject filter_fn_key = NIL;
                  filter_fn_key = cdolist_list_var2.first();
                  while ( NIL != cdolist_list_var2)
                  {
                    html_arghash.html_arghash_checkbox_input( raw_arghash, $kw16$FILTER_FN_KEYS, filter_fn_key, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_princ( filter_fn_key );
                    html_utilities.html_newline( UNPROVIDED );
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    filter_fn_key = cdolist_list_var2.first();
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
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
              final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str86$DEPTH__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_arghash.html_arghash_text_input( raw_arghash, $kw87$DEPTH, ONE_INTEGER, THREE_INTEGER, $kw88$INTEGER );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_glyph( $kw89$NBSP, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_arghash.html_arghash_submit_input( raw_arghash, $str90$Submit, $kw91$SUBMIT, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              final SubLObject builder_fn_key = html_arghash.get_arghash_value( $kw8$BUILDER_FN_KEY, raw_arghash );
              final SubLObject v_forts = html_arghash.get_arghash_value_list( $kw10$FORTS, raw_arghash );
              final SubLObject preds = html_arghash.get_arghash_value_list( $kw9$PREDS, raw_arghash );
              final SubLObject mt = html_arghash.get_arghash_value( $kw59$MT, raw_arghash );
              final SubLObject depth = html_arghash.get_arghash_value( $kw87$DEPTH, raw_arghash );
              final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list( $kw16$FILTER_FN_KEYS, raw_arghash );
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_utilities.html_align( $kw73$TOP ) );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str92$Status__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  if( Packages.intern( string_utilities.string_from_keyword( builder_fn_key ), UNPROVIDED ).isFunctionSpec() && ZERO_INTEGER.numL( Sequences.length( v_forts ) ) && ZERO_INTEGER.numL( Sequences.length(
                      preds ) ) && NIL != fort_types_interface.microtheory_p( mt ) && depth.isNumber() )
                  {
                    html_utilities.html_princ( $str93$Ready_to_ );
                    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str94$_1 );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                      cb_utilities.cb_link( $kw95$GRAPH_EVENT, $str96$_Visualize_, user_actions.user_action_data( user_action ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                  }
                  else
                  {
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_princ( $str97$Waiting_for_more_input_ );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  html_utilities.html_newline( TWO_INTEGER );
                  html_utilities.html_princ( $str98$Algorithm__ );
                  html_utilities.html_princ( builder_fn_key );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str99$Forts__ );
                  cb_utilities.cb_form( v_forts, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str100$Preds__ );
                  cb_utilities.cb_form( preds, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str101$Mt__ );
                  cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str102$Depth__ );
                  html_utilities.html_princ( depth );
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str103$Filters__ );
                  html_utilities.html_princ( filter_fn_keys );
                  html_utilities.html_newline( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 17549L)
  public static SubLObject cb_link_graph_event(final SubLObject linktext, final SubLObject arghash)
  {
    html_arghash.set_arghash_value( $kw104$SIGNATURE, arghash, PrintLow.format( NIL, $str105$_A, random.random( Numbers.expt( TWO_INTEGER, $int106$30 ) ) ) );
    cb_blue_applet_window_link( arghash, linktext, $str107$cb_graph_event );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 17913L)
  public static SubLObject cb_graph_event(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    html_arghash.set_arghash_value( $kw104$SIGNATURE, arghash, PrintLow.format( NIL, $str109$_a, random.random( Numbers.expt( TWO_INTEGER, $int106$30 ) ) ) );
    cb_blue_applet_window_internal( arghash );
    subl_promotions.make_process_with_args( $str107$cb_graph_event, Symbols.symbol_function( $sym110$CB_GRAPH_EVENT_PROCESS ), ConsesLow.list( arghash ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 18294L)
  public static SubLObject cb_graph_event_process(final SubLObject arghash)
  {
    final SubLObject preds = html_arghash.get_arghash_value_list( $kw9$PREDS, arghash );
    final SubLObject v_forts = html_arghash.get_arghash_value_list( $kw10$FORTS, arghash );
    final SubLObject mt = html_arghash.get_arghash_value( $kw59$MT, arghash );
    final SubLObject depth = html_arghash.get_arghash_value( $kw87$DEPTH, arghash );
    final SubLObject filter_fn_keys = html_arghash.get_arghash_value_list( $kw16$FILTER_FN_KEYS, arghash );
    SubLObject filter_fns = NIL;
    final SubLObject builder_fn_key = html_arghash.get_arghash_value( $kw8$BUILDER_FN_KEY, arghash );
    final SubLObject builder_fn = Packages.intern( string_utilities.string_from_keyword( builder_fn_key ), $str112$CYC );
    final SubLObject signature = html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash );
    SubLObject cdolist_list_var = filter_fn_keys;
    SubLObject filter_fn_key = NIL;
    filter_fn_key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      filter_fns = ConsesLow.cons( Packages.intern( string_utilities.string_from_keyword( filter_fn_key ), $str112$CYC ), filter_fns );
      cdolist_list_var = cdolist_list_var.rest();
      filter_fn_key = cdolist_list_var.first();
    }
    filter_fns = Sequences.nreverse( filter_fns );
    blue_grapher_utilities.blue_event( signature, ConsesLow.list( $cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), ConsesLow.list( new SubLObject[] { $kw113$BUILDER_FN, builder_fn, $kw9$PREDS, preds,
      $kw10$FORTS, v_forts, $kw59$MT, mt, $kw87$DEPTH, depth, $kw114$FILTER_FNS, filter_fns
    } ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 20003L)
  public static SubLObject cb_blue_applet(final SubLObject keylist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject poss_width = conses_high.getf( keylist, $kw122$WIDTH, UNPROVIDED );
    final SubLObject width = ( poss_width.isString() || ( poss_width.isInteger() && poss_width.numG( ZERO_INTEGER ) ) ) ? poss_width : $cb_blue_applet_default_width$.getGlobalValue();
    final SubLObject poss_height = conses_high.getf( keylist, $kw123$HEIGHT, UNPROVIDED );
    final SubLObject height = ( poss_height.isInteger() && poss_height.numG( ZERO_INTEGER ) ) ? poss_height : $cb_blue_applet_default_height$.getGlobalValue();
    final SubLObject poss_domain_mt = conses_high.getf( keylist, $kw124$DOMAIN_MT, UNPROVIDED );
    final SubLObject domain_mt = ( NIL != fort_types_interface.microtheory_p( poss_domain_mt ) ) ? poss_domain_mt : NIL;
    final SubLObject poss_parsing_mt = conses_high.getf( keylist, $kw125$PARSING_MT, UNPROVIDED );
    final SubLObject parsing_mt = ( NIL != fort_types_interface.microtheory_p( poss_parsing_mt ) ) ? poss_parsing_mt : NIL;
    final SubLObject poss_generation_mt = conses_high.getf( keylist, $kw126$GENERATION_MT, UNPROVIDED );
    final SubLObject generation_mt = ( NIL != fort_types_interface.microtheory_p( poss_generation_mt ) ) ? poss_generation_mt : NIL;
    final SubLObject signature = conses_high.getf( keylist, $kw104$SIGNATURE, UNPROVIDED );
    final SubLObject codebase = $cb_blue_codebase$.getGlobalValue();
    final SubLObject archive = cyc_file_dependencies.java_applet_archive_string( $str127$script_editor );
    final SubLObject poss_class_file = conses_high.getf( keylist, $kw128$CLASS_FILE, UNPROVIDED );
    final SubLObject class_file = poss_class_file.isString() ? poss_class_file : $cb_blue_class_file$.getGlobalValue();
    html_utilities.html_markup( html_macros.$html_applet_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_applet_code$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( class_file );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_applet_codebase$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( codebase );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_applet_archive$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( archive );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_applet_height$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( height );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_applet_width$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( width );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str129$user );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( PrintLow.format( NIL, $str105$_A, operation_communication.the_cyclist() ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      if( NIL != domain_mt )
      {
        html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str130$domain_mt );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( kb_paths.fort_name( domain_mt ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      if( NIL != parsing_mt )
      {
        html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str131$parsing_mt );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( kb_paths.fort_name( parsing_mt ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      if( NIL != generation_mt )
      {
        html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str132$generation_mt );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( kb_paths.fort_name( generation_mt ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str133$signature );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( signature );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str134$baseport );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( system_parameters.$base_tcp_port$.getDynamicValue( thread ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str135$_Java_applet_could_not_be_display );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_applet_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22123L)
  public static SubLObject cb_blue_applet_window(final SubLObject args)
  {
    return cb_blue_applet_window_internal( html_arghash.arglist_to_arghash( args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 22242L)
  public static SubLObject cb_blue_applet_window_internal(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    blue_grapher_utilities.ensure_blue_event_dispatcher_running();
    html_utilities.html_markup( $str36$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str37$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw38$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str139$Blue_Graph );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$56 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_blue_applet( ConsesLow.list( new SubLObject[] { $kw122$WIDTH, html_arghash.get_arghash_value( $kw122$WIDTH, arghash ), $kw123$HEIGHT, html_arghash.get_arghash_value( $kw123$HEIGHT, arghash ),
            $kw124$DOMAIN_MT, html_arghash.get_arghash_value( $kw124$DOMAIN_MT, arghash ), $kw125$PARSING_MT, html_arghash.get_arghash_value( $kw124$DOMAIN_MT, arghash ), $kw126$GENERATION_MT, html_arghash
                .get_arghash_value( $kw126$GENERATION_MT, arghash ), $kw104$SIGNATURE, html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash )
          } ) );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$56, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23094L)
  public static SubLObject cb_blue_applet_window_set_arghash(final SubLObject arghash, final SubLObject signature, SubLObject width, SubLObject height)
  {
    if( width == UNPROVIDED )
    {
      width = $cb_blue_applet_window_width$.getGlobalValue();
    }
    if( height == UNPROVIDED )
    {
      height = $cb_blue_applet_window_height$.getGlobalValue();
    }
    html_arghash.set_arghash_value( $kw104$SIGNATURE, arghash, signature );
    html_arghash.set_arghash_value( $kw122$WIDTH, arghash, width );
    html_arghash.set_arghash_value( $kw123$HEIGHT, arghash, height );
    return arghash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23411L)
  public static SubLObject cb_blue_construct_window_options(final SubLObject width, final SubLObject height)
  {
    return cb_java_utilities.cb_java_applet_construct_window_options( ConsesLow.listS( $list140, ConsesLow.list( $kw123$HEIGHT, height ), ConsesLow.list( $kw122$WIDTH, width ), ConsesLow.list( $kw141$INNERHEIGHT,
        height ), ConsesLow.list( $kw142$INNERWIDTH, width ), $list143 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 23864L)
  public static SubLObject cb_blue_applet_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject initialization)
  {
    if( initialization == UNPROVIDED )
    {
      initialization = $str144$cb_blue_applet_window;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = ( NIL != html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash ) ) ? cb_utilities.cb_frame_name( html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash ) ) : NIL;
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( html_arghash.html_arghash_href( arghash, initialization ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_markup( html_macros.$html_event_attribute_onclick$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str145$window_open__ );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( html_arghash.html_arghash_href( arghash, initialization ) );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str146$__ );
    if( NIL != html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str147$__A_, html_arghash.get_arghash_value( $kw104$SIGNATURE, arghash ) );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str148$null );
    }
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str149$___A____, cb_blue_construct_window_options( $cb_blue_applet_window_width$.getGlobalValue(), $cb_blue_applet_window_height$
        .getGlobalValue() ) );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str150$return_false_ );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-blue-grapher.lisp", position = 24260L)
  public static SubLObject cb_link_blue_applet_window(final SubLObject linktext, SubLObject signature, SubLObject arghash)
  {
    if( signature == UNPROVIDED )
    {
      signature = NIL;
    }
    if( arghash == UNPROVIDED )
    {
      arghash = NIL;
    }
    if( NIL == html_arghash.arghash_p( arghash ) )
    {
      arghash = html_arghash.new_arghash( UNPROVIDED );
    }
    arghash = cb_blue_applet_window_set_arghash( arghash, signature, UNPROVIDED, UNPROVIDED );
    cb_blue_applet_window_link( arghash, linktext, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_cb_blue_grapher_file()
  {
    SubLFiles.declareFunction( me, "cb_blue_new_user_action", "CB-BLUE-NEW-USER-ACTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_remove_transient_user_action_data", "CB-BLUE-REMOVE-TRANSIENT-USER-ACTION-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_update_user_action_data_from_arghash", "CB-BLUE-UPDATE-USER-ACTION-DATA-FROM-ARGHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_remove_keys_from_user_action_data", "CB-BLUE-REMOVE-KEYS-FROM-USER-ACTION-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_restart", "CB-BLUE-RESTART", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_Xcb_blue_keyX", "CB-LINK-*CB-BLUE-KEY*", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_blue_summary", "CB-BLUE-SUMMARY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue", "CB-BLUE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_blue_internal", "CB-BLUE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_index_frame", "CB-BLUE-INDEX-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_blue_index_frame_internal", "CB-BLUE-INDEX-FRAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_button_bar", "CB-BLUE-BUTTON-BAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_content_frame", "CB-BLUE-CONTENT-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_blue_content_frame_internal", "CB-BLUE-CONTENT-FRAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_build", "CB-BLUE-BUILD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_build_internal", "CB-BLUE-BUILD-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_link_graph_event", "CB-LINK-GRAPH-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_graph_event", "CB-GRAPH-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_graph_event_process", "CB-GRAPH-EVENT-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_applet", "CB-BLUE-APPLET", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_applet_window", "CB-BLUE-APPLET-WINDOW", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_applet_window_internal", "CB-BLUE-APPLET-WINDOW-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_applet_window_set_arghash", "CB-BLUE-APPLET-WINDOW-SET-ARGHASH", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_blue_construct_window_options", "CB-BLUE-CONSTRUCT-WINDOW-OPTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_blue_applet_window_link", "CB-BLUE-APPLET-WINDOW-LINK", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_link_blue_applet_window", "CB-LINK-BLUE-APPLET-WINDOW", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_blue_grapher_file()
  {
    $cb_blue_grapher_debug$ = SubLFiles.defparameter( "*CB-BLUE-GRAPHER-DEBUG*", NIL );
    $cb_blue_current_blue_user_action$ = SubLFiles.defparameter( "*CB-BLUE-CURRENT-BLUE-USER-ACTION*", NIL );
    $cb_blue_key$ = SubLFiles.defparameter( "*CB-BLUE-KEY*", $kw1$BLUE );
    $cb_blue_user_action_data_pred_keys$ = SubLFiles.deflexical( "*CB-BLUE-USER-ACTION-DATA-PRED-KEYS*", $list3 );
    $cb_blue_user_action_data_fort_keys$ = SubLFiles.deflexical( "*CB-BLUE-USER-ACTION-DATA-FORT-KEYS*", $list4 );
    $cb_blue_user_action_data_keys$ = SubLFiles.defparameter( "*CB-BLUE-USER-ACTION-DATA-KEYS*", ConsesLow.listS( $kw5$USER_ACTION_ID_STRING, $kw6$PREFERENCES, $kw7$MODE, $kw8$BUILDER_FN_KEY, $kw9$PREDS, ConsesLow
        .append( $cb_blue_user_action_data_pred_keys$.getGlobalValue(), reader.bq_cons( $kw10$FORTS, ConsesLow.append( $cb_blue_user_action_data_fort_keys$.getGlobalValue(), $list11 ) ) ) ) );
    $cb_blue_codebase$ = SubLFiles.deflexical( "*CB-BLUE-CODEBASE*", $str115$_java_script_editor );
    $cb_blue_class_file$ = SubLFiles.deflexical( "*CB-BLUE-CLASS-FILE*", $str116$com_cyc_framework_ui_blue_cyc_Cyc );
    $cb_blue_applet_default_width$ = SubLFiles.deflexical( "*CB-BLUE-APPLET-DEFAULT-WIDTH*", $str117$100_ );
    $cb_blue_applet_default_height$ = SubLFiles.deflexical( "*CB-BLUE-APPLET-DEFAULT-HEIGHT*", $str118$90_ );
    $cb_blue_cyc_graph_command_add_edge_string$ = SubLFiles.deflexical( "*CB-BLUE-CYC-GRAPH-COMMAND-ADD-EDGE-STRING*", $str119$com_cyc_framework_ui_blue_cyc_Cyc );
    $cb_blue_cyc_graph_command_add_graph_string$ = SubLFiles.deflexical( "*CB-BLUE-CYC-GRAPH-COMMAND-ADD-GRAPH-STRING*", $str120$com_cyc_framework_ui_blue_cyc_Cyc );
    $cb_blue_cyc_graph_command_add_node_string$ = SubLFiles.deflexical( "*CB-BLUE-CYC-GRAPH-COMMAND-ADD-NODE-STRING*", $str121$com_cyc_framework_ui_blue_cyc_Cyc );
    $cb_blue_applet_reset_delay$ = SubLFiles.deflexical( "*CB-BLUE-APPLET-RESET-DELAY*", FIVE_INTEGER );
    $cb_blue_applet_window_width$ = SubLFiles.deflexical( "*CB-BLUE-APPLET-WINDOW-WIDTH*", $int136$1010 );
    $cb_blue_applet_window_height$ = SubLFiles.deflexical( "*CB-BLUE-APPLET-WINDOW-HEIGHT*", $int137$750 );
    return NIL;
  }

  public static SubLObject setup_cb_blue_grapher_file()
  {
    utilities_macros.register_html_state_variable( $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_ );
    utilities_macros.register_html_interface_variable( $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_ );
    final SubLObject new_action_type = user_actions.make_action_type( $list2 );
    user_actions._csetf_action_type_key( new_action_type, $kw1$BLUE );
    Hashtables.sethash( user_actions.action_type_key( new_action_type ), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type );
    cb_utilities.setup_cb_link_method( $cb_blue_key$.getDynamicValue(), $sym22$CB_LINK__CB_BLUE_KEY_, ONE_INTEGER );
    cb_utilities.register_cb_frame( $kw24$BLUE_INDEX, $str25$blueindex, $str26$cb_blue_index_frame, $str27$__user_action_id_string__a, T, NIL );
    cb_utilities.register_cb_frame( $kw28$BLUE_CONTENT, $str29$bluecontent, $str30$cb_blue_content_frame, $str27$__user_action_id_string__a, UNPROVIDED, UNPROVIDED );
    html_macros.note_cgi_handler_function( $sym32$CB_BLUE, $kw33$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym42$CB_BLUE_INDEX_FRAME, $kw33$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym49$CB_BLUE_CONTENT_FRAME, $kw33$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym55$CB_BLUE_BUILD, $kw33$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw95$GRAPH_EVENT, $sym108$CB_LINK_GRAPH_EVENT, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym111$CB_GRAPH_EVENT, $kw33$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym138$CB_BLUE_APPLET_WINDOW, $kw33$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw151$BLUE_APPLET_WINDOW, $sym152$CB_LINK_BLUE_APPLET_WINDOW, THREE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_blue_grapher_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_blue_grapher_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_blue_grapher_file();
  }
  static
  {
    me = new cb_blue_grapher();
    $cb_blue_grapher_debug$ = null;
    $cb_blue_current_blue_user_action$ = null;
    $cb_blue_key$ = null;
    $cb_blue_user_action_data_pred_keys$ = null;
    $cb_blue_user_action_data_fort_keys$ = null;
    $cb_blue_user_action_data_keys$ = null;
    $cb_blue_codebase$ = null;
    $cb_blue_class_file$ = null;
    $cb_blue_applet_default_width$ = null;
    $cb_blue_applet_default_height$ = null;
    $cb_blue_cyc_graph_command_add_edge_string$ = null;
    $cb_blue_cyc_graph_command_add_graph_string$ = null;
    $cb_blue_cyc_graph_command_add_node_string$ = null;
    $cb_blue_applet_reset_delay$ = null;
    $cb_blue_applet_window_width$ = null;
    $cb_blue_applet_window_height$ = null;
    $sym0$_CB_BLUE_CURRENT_BLUE_USER_ACTION_ = makeSymbol( "*CB-BLUE-CURRENT-BLUE-USER-ACTION*" );
    $kw1$BLUE = makeKeyword( "BLUE" );
    $list2 = ConsesLow.list( makeKeyword( "SUMMARY-FN" ), makeSymbol( "CB-BLUE-SUMMARY" ), makeKeyword( "DISPLAY-FN" ), makeSymbol( "CB-BLUE" ), makeKeyword( "HANDLER-FN" ), makeSymbol( "CB-BLUE" ) );
    $list3 = ConsesLow.list( makeKeyword( "PRED1" ), makeKeyword( "PRED2" ), makeKeyword( "PRED3" ), makeKeyword( "PRED4" ), makeKeyword( "PRED5" ), makeKeyword( "PRED6" ) );
    $list4 = ConsesLow.list( makeKeyword( "FORT1" ), makeKeyword( "FORT2" ), makeKeyword( "FORT3" ), makeKeyword( "FORT4" ), makeKeyword( "FORT5" ), makeKeyword( "FORT6" ) );
    $kw5$USER_ACTION_ID_STRING = makeKeyword( "USER-ACTION-ID-STRING" );
    $kw6$PREFERENCES = makeKeyword( "PREFERENCES" );
    $kw7$MODE = makeKeyword( "MODE" );
    $kw8$BUILDER_FN_KEY = makeKeyword( "BUILDER-FN-KEY" );
    $kw9$PREDS = makeKeyword( "PREDS" );
    $kw10$FORTS = makeKeyword( "FORTS" );
    $list11 = ConsesLow.list( makeKeyword( "MT" ), makeKeyword( "FILTER-FN-KEYS" ), makeKeyword( "DEPTH" ) );
    $kw12$CYCLIST = makeKeyword( "CYCLIST" );
    $kw13$TYPE_KEY = makeKeyword( "TYPE-KEY" );
    $str14$cb_blue__Could_not_create_a_user_ = makeString( "cb-blue: Could not create a user action." );
    $kw15$BUILD = makeKeyword( "BUILD" );
    $kw16$FILTER_FN_KEYS = makeKeyword( "FILTER-FN-KEYS" );
    $list17 = ConsesLow.list( makeKeyword( "BFF-CYC-KB-SUBSET-COLLECTIONS" ), makeKeyword( "BFF-ARBITRARY-UNIONS" ) );
    $list18 = ConsesLow.list( makeKeyword( "BBF-FORWARD-TRUE" ) );
    $str19$_Blue_Grapher_ = makeString( "[Blue Grapher]" );
    $kw20$MAIN = makeKeyword( "MAIN" );
    $str21$cb_blue = makeString( "cb-blue" );
    $sym22$CB_LINK__CB_BLUE_KEY_ = makeSymbol( "CB-LINK-*CB-BLUE-KEY*" );
    $str23$Blue_Grapher_interaction_in_progr = makeString( "Blue Grapher interaction in progress" );
    $kw24$BLUE_INDEX = makeKeyword( "BLUE-INDEX" );
    $str25$blueindex = makeString( "blueindex" );
    $str26$cb_blue_index_frame = makeString( "cb-blue-index-frame" );
    $str27$__user_action_id_string__a = makeString( "&:user-action-id-string=~a" );
    $kw28$BLUE_CONTENT = makeKeyword( "BLUE-CONTENT" );
    $str29$bluecontent = makeString( "bluecontent" );
    $str30$cb_blue_content_frame = makeString( "cb-blue-content-frame" );
    $str31$Blue_Grapher = makeString( "Blue Grapher" );
    $sym32$CB_BLUE = makeSymbol( "CB-BLUE" );
    $kw33$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str34$Fatal_Error = makeString( "Fatal Error" );
    $str35$cb_blue_internal_called_without_a = makeString( "cb-blue-internal called without a valid user-action-id-string" );
    $str36$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str37$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw38$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str39$Cannot_have_a_FRAMESET_tag_inside = makeString( "Cannot have a FRAMESET tag inside a BODY tag." );
    $str40$40__ = makeString( "40,*" );
    $str41$no = makeString( "no" );
    $sym42$CB_BLUE_INDEX_FRAME = makeSymbol( "CB-BLUE-INDEX-FRAME" );
    $str43$Blue_Grapher_Button_Bar = makeString( "Blue Grapher Button Bar" );
    $str44$cb_blue_content_frame__user_actio = makeString( "cb-blue-content-frame&:user-action-id-string=~A&::action=restart" );
    $str45$Restart = makeString( "Restart" );
    $str46$_ = makeString( "|" );
    $str47$cb_blue_content_frame__user_actio = makeString( "cb-blue-content-frame&:user-action-id-string=~A&::mode=build" );
    $str48$Build = makeString( "Build" );
    $sym49$CB_BLUE_CONTENT_FRAME = makeSymbol( "CB-BLUE-CONTENT-FRAME" );
    $str50$cb_blue_content_frame_internal__n = makeString( "cb-blue-content-frame-internal: no user action found" );
    $kw51$ACTION = makeKeyword( "ACTION" );
    $kw52$RESTART = makeKeyword( "RESTART" );
    $str53$invalid_mode___A__or_mode_not_imp = makeString( "invalid mode (~A) or mode not implemented" );
    $str54$cb_blue_build__no_user_action_fou = makeString( "cb-blue-build: no user action found" );
    $sym55$CB_BLUE_BUILD = makeSymbol( "CB-BLUE-BUILD" );
    $str56$cb_blue_build_internal__no_user_a = makeString( "cb-blue-build-internal: no user action found" );
    $sym57$FORT_TO_STRING = makeSymbol( "FORT-TO-STRING" );
    $sym58$TERMS_FOR_BROWSING = makeSymbol( "TERMS-FOR-BROWSING" );
    $kw59$MT = makeKeyword( "MT" );
    $const60$CyclistsMt = constant_handles.reader_make_constant_shell( makeString( "CyclistsMt" ) );
    $str61$initial_arghash = makeString( "initial arghash" );
    $str62$___ = makeString( " : " );
    $sym63$STRING_ = makeSymbol( "STRING<" );
    $sym64$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $str65$validation = makeString( "validation" );
    $const66$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $const67$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $str68$arghash_after_validation = makeString( "arghash after validation" );
    $str69$_user_action_data_user_action__af = makeString( "(user-action-data user-action) after update from arghash" );
    $str70$Blue_Grapher___Building_Graph = makeString( "Blue Grapher - Building Graph" );
    $kw71$POST = makeKeyword( "POST" );
    $str72$cb_blue_build = makeString( "cb-blue-build" );
    $kw73$TOP = makeKeyword( "TOP" );
    $str74$ = makeString( "" );
    $kw75$KEYWORD = makeKeyword( "KEYWORD" );
    $str76$onChange_javascript_this_form_sub = makeString( "onChange=javascript:this.form.submit();" );
    $kw77$HELP_STRING = makeKeyword( "HELP-STRING" );
    $str78$___br_ = makeString( ".)<br>" );
    $str79$___ = makeString( ".) " );
    $str80$__br_ = makeString( ".<br>" );
    $str81$___ = makeString( ".  " );
    $str82$PREDS__ = makeString( "PREDS: " );
    $str83$FORTS__ = makeString( "FORTS: " );
    $str84$MT__ = makeString( "MT: " );
    $str85$FILTER_FNS__ = makeString( "FILTER-FNS: " );
    $str86$DEPTH__ = makeString( "DEPTH: " );
    $kw87$DEPTH = makeKeyword( "DEPTH" );
    $kw88$INTEGER = makeKeyword( "INTEGER" );
    $kw89$NBSP = makeKeyword( "NBSP" );
    $str90$Submit = makeString( "Submit" );
    $kw91$SUBMIT = makeKeyword( "SUBMIT" );
    $str92$Status__ = makeString( "Status: " );
    $str93$Ready_to_ = makeString( "Ready to " );
    $str94$_1 = makeString( "+1" );
    $kw95$GRAPH_EVENT = makeKeyword( "GRAPH-EVENT" );
    $str96$_Visualize_ = makeString( "[Visualize]" );
    $str97$Waiting_for_more_input_ = makeString( "Waiting for more input." );
    $str98$Algorithm__ = makeString( "Algorithm: " );
    $str99$Forts__ = makeString( "Forts: " );
    $str100$Preds__ = makeString( "Preds: " );
    $str101$Mt__ = makeString( "Mt: " );
    $str102$Depth__ = makeString( "Depth: " );
    $str103$Filters__ = makeString( "Filters: " );
    $kw104$SIGNATURE = makeKeyword( "SIGNATURE" );
    $str105$_A = makeString( "~A" );
    $int106$30 = makeInteger( 30 );
    $str107$cb_graph_event = makeString( "cb-graph-event" );
    $sym108$CB_LINK_GRAPH_EVENT = makeSymbol( "CB-LINK-GRAPH-EVENT" );
    $str109$_a = makeString( "~a" );
    $sym110$CB_GRAPH_EVENT_PROCESS = makeSymbol( "CB-GRAPH-EVENT-PROCESS" );
    $sym111$CB_GRAPH_EVENT = makeSymbol( "CB-GRAPH-EVENT" );
    $str112$CYC = makeString( "CYC" );
    $kw113$BUILDER_FN = makeKeyword( "BUILDER-FN" );
    $kw114$FILTER_FNS = makeKeyword( "FILTER-FNS" );
    $str115$_java_script_editor = makeString( "/java/script-editor" );
    $str116$com_cyc_framework_ui_blue_cyc_Cyc = makeString( "com.cyc.framework.ui.blue.cyc.CycGraphApplet" );
    $str117$100_ = makeString( "100%" );
    $str118$90_ = makeString( "90%" );
    $str119$com_cyc_framework_ui_blue_cyc_Cyc = makeString( "com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddEdge" );
    $str120$com_cyc_framework_ui_blue_cyc_Cyc = makeString( "com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddGraph" );
    $str121$com_cyc_framework_ui_blue_cyc_Cyc = makeString( "com.cyc.framework.ui.blue.cyc.CycGraphCommand_AddNode" );
    $kw122$WIDTH = makeKeyword( "WIDTH" );
    $kw123$HEIGHT = makeKeyword( "HEIGHT" );
    $kw124$DOMAIN_MT = makeKeyword( "DOMAIN-MT" );
    $kw125$PARSING_MT = makeKeyword( "PARSING-MT" );
    $kw126$GENERATION_MT = makeKeyword( "GENERATION-MT" );
    $str127$script_editor = makeString( "script-editor" );
    $kw128$CLASS_FILE = makeKeyword( "CLASS-FILE" );
    $str129$user = makeString( "user" );
    $str130$domain_mt = makeString( "domain_mt" );
    $str131$parsing_mt = makeString( "parsing_mt" );
    $str132$generation_mt = makeString( "generation_mt" );
    $str133$signature = makeString( "signature" );
    $str134$baseport = makeString( "baseport" );
    $str135$_Java_applet_could_not_be_display = makeString( "[Java applet could not be displayed]" );
    $int136$1010 = makeInteger( 1010 );
    $int137$750 = makeInteger( 750 );
    $sym138$CB_BLUE_APPLET_WINDOW = makeSymbol( "CB-BLUE-APPLET-WINDOW" );
    $str139$Blue_Graph = makeString( "Blue Graph" );
    $list140 = ConsesLow.list( makeKeyword( "DEPENDENT" ), makeKeyword( "NO" ) );
    $kw141$INNERHEIGHT = makeKeyword( "INNERHEIGHT" );
    $kw142$INNERWIDTH = makeKeyword( "INNERWIDTH" );
    $list143 = ConsesLow.list( ConsesLow.list( makeKeyword( "HOTKEYS" ), makeKeyword( "NO" ) ), ConsesLow.list( makeKeyword( "DIRECTORIES" ), makeKeyword( "NO" ) ), ConsesLow.list( makeKeyword( "MENUBAR" ), makeKeyword(
        "NO" ) ), ConsesLow.list( makeKeyword( "RESIZABLE" ), makeKeyword( "YES" ) ), ConsesLow.list( makeKeyword( "SCROLLBARS" ), makeKeyword( "YES" ) ), ConsesLow.list( makeKeyword( "TOOLBAR" ), makeKeyword(
            "NO" ) ) );
    $str144$cb_blue_applet_window = makeString( "cb-blue-applet-window" );
    $str145$window_open__ = makeString( "window.open('" );
    $str146$__ = makeString( "'," );
    $str147$__A_ = makeString( "'~A'" );
    $str148$null = makeString( "null" );
    $str149$___A____ = makeString( ",'~A'); " );
    $str150$return_false_ = makeString( "return false;" );
    $kw151$BLUE_APPLET_WINDOW = makeKeyword( "BLUE-APPLET-WINDOW" );
    $sym152$CB_LINK_BLUE_APPLET_WINDOW = makeSymbol( "CB-LINK-BLUE-APPLET-WINDOW" );
  }
}
/*
 * 
 * Total time: 1919 ms
 * 
 */