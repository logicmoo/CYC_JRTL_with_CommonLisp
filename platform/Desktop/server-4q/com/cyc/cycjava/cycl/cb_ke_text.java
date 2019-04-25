package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_ke_text
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_ke_text";
  public static final String myFingerPrint = "436fede6d011d4f254c9bba351bc6a091e6c77c13fc9859fe93c95ab385718f9";
  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 1952L)
  private static SubLSymbol $ket_do_ke_operations_data_keywords$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 6841L)
  private static SubLSymbol $cb_ke_text_default_cb_form_cons_method_keywords$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$DO_KE_OPERATIONS;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$FILE;
  private static final SubLString $str4$unknown_file;
  private static final SubLSymbol $kw5$COMPOSE;
  private static final SubLString $str6$ke_text_compose;
  private static final SubLString $str7$unknown_source;
  private static final SubLSymbol $kw8$ASSERT;
  private static final SubLSymbol $kw9$UNASSERT;
  private static final SubLSymbol $kw10$NEW_CONSTANT;
  private static final SubLString $str11$cg_cb_handle_ke_text_file__filena;
  private static final SubLString $str12$__user_action_id_string_;
  private static final SubLString $str13$_2;
  private static final SubLString $str14$Reload_File;
  private static final SubLSymbol $kw15$SOURCE;
  private static final SubLSymbol $kw16$FILENAME;
  private static final SubLSymbol $kw17$KE_OPERATIONS;
  private static final SubLString $str18$Evaluate_;
  private static final SubLString $str19$_forms_from_;
  private static final SubLSymbol $sym20$NEW_KE_TEXT_CONSTANT;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $kw23$CHECK_AND_SHOW;
  private static final SubLSymbol $kw24$CHECK_AND_REMOVE;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$TOP;
  private static final SubLString $str27$already_exists_;
  private static final SubLSymbol $kw28$BOTTOM;
  private static final SubLString $str29$does_not_exist;
  private static final SubLSymbol $sym30$CB_DO_KE_OPERATIONS_DISPLAY;
  private static final SubLSymbol $kw31$HTML_HANDLER;
  private static final SubLSymbol $kw32$USER_ACTION_ID_STRING;
  private static final SubLSymbol $kw33$JUST_STRING;
  private static final SubLString $str34$Fatal_Error;
  private static final SubLString $str35$cb_do_ke_operations_display_inter;
  private static final SubLSymbol $kw36$CHECK_EXISTING;
  private static final SubLSymbol $kw37$PROJECT;
  private static final SubLSymbol $kw38$NOT_REDUNDANT;
  private static final SubLString $str39$KE_Text__Parse_Status;
  private static final SubLString $str40$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str41$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw42$UNINITIALIZED;
  private static final SubLSymbol $kw43$CB_CYC;
  private static final SubLSymbol $kw44$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw45$SHA1;
  private static final SubLString $str46$yui_skin_sam;
  private static final SubLString $str47$reloadFrameButton;
  private static final SubLString $str48$button;
  private static final SubLString $str49$reload;
  private static final SubLString $str50$Refresh_Frames;
  private static final SubLString $str51$Your_KE_Text__from_;
  private static final SubLString $str52$__did_not_parse_into_any_operatio;
  private static final SubLString $str53$__has_been_successfully_parsed_in;
  private static final SubLString $str54$cg_cb_handle_ke_operations__user_;
  private static final SubLString $str55$Remove_Redundant_Asserts_Unassert;
  private static final SubLString $str56$cg_cb_handle_ke_operations__user_;
  private static final SubLString $str57$Check_for_Existing_Assertions_;
  private static final SubLString $str58$cg__A__A___method_agenda;
  private static final SubLString $str59$Add_Forms_to_Agenda;
  private static final SubLString $str60$merged;
  private static final SubLString $str61$renamed;
  private static final SubLString $str62$killed;
  private static final SubLString $str63$created;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLString $str67$The_following_constants_will_be_;
  private static final SubLString $str68$_;
  private static final SubLSymbol $kw69$CREATE;
  private static final SubLString $str70$Create__;
  private static final SubLSymbol $kw71$KILL;
  private static final SubLString $str72$Kill__;
  private static final SubLSymbol $kw73$RENAME;
  private static final SubLString $str74$Rename__;
  private static final SubLSymbol $kw75$MERGE;
  private static final SubLString $str76$Merge__;
  private static final SubLSymbol $kw77$CENTER;
  private static final SubLString $str78$_to_;
  private static final SubLString $str79$_onto_;
  private static final SubLString $str80$Project_;
  private static final SubLString $str81$_will_be_used_as_the_KE_purpose_;
  private static final SubLString $str82$100_;
  private static final SubLString $str83$Operations_;
  private static final SubLString $str84$_A_existing_assertion_A;
  private static final SubLString $str85$no;
  private static final SubLString $str86$one;
  private static final SubLString $str87$;
  private static final SubLString $str88$s;
  private static final SubLSymbol $kw89$KET_ADD_TO_HISTORY;
  private static final SubLString $str90$_Add_to_History_;
  private static final SubLString $str91$_dddddd;
  private static final SubLString $str92$_cccccc;
  private static final SubLSymbol $kw93$SELF;
  private static final SubLString $str94$cb_ket_add_to_history__a;
  private static final SubLSymbol $sym95$CB_LINK_KET_ADD_TO_HISTORY;
  private static final SubLSymbol $sym96$LISTP;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$CB_KET_ADD_TO_HISTORY;
  private static final SubLSymbol $kw99$METHOD;
  private static final SubLString $str100$cb_do_ke_operations_handler_calle;
  private static final SubLSymbol $kw101$AGENDA;
  private static final SubLString $str102$KE_Text__Forms_Added_to_Agenda;
  private static final SubLSymbol $kw103$MAKE_CONSTANTS;
  private static final SubLSymbol $kw104$NOW;
  private static final SubLSymbol $sym105$CB_DO_KE_OPERATIONS_HANDLER;
  private static final SubLSymbol $sym106$CB_HANDLE_KE_OPERATIONS;
  private static final SubLSymbol $kw107$CYCLIST;
  private static final SubLSymbol $kw108$TYPE_KEY;
  private static final SubLString $str109$ket_handle_ke_operations__Could_n;
  private static final SubLInteger $int110$32;
  private static final SubLString $str111$User_action__do_ke_operations_not;
  private static final SubLString $str112$KE_Text__Errors_Found;
  private static final SubLString $str113$Some_errors_were_found_parsing_yo;
  private static final SubLSymbol $kw114$LEFT;
  private static final SubLString $str115$1_;
  private static final SubLString $str116$_;
  private static final SubLSymbol $kw117$NBSP;
  private static final SubLString $str118$Looking_over_the_;
  private static final SubLString $str119$ref_ke_file_html;
  private static final SubLString $str120$KE_Text_specification;
  private static final SubLString $str121$_may_also_help_;
  private static final SubLSymbol $kw122$KE_TEXT_LIST;
  private static final SubLSymbol $kw123$CONTENT;
  private static final SubLSymbol $sym124$CB_HANDLE_KE_TEXT_FILE;
  private static final SubLSymbol $kw125$KE_TEXT;
  private static final SubLSymbol $sym126$CB_HANDLE_KE_TEXT_COMPOSE;

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 2606L)
  public static SubLObject ket_string_for_source(SubLObject source, SubLObject filename)
  {
    if( filename == UNPROVIDED )
    {
      filename = NIL;
    }
    if( source.eql( $kw3$FILE ) )
    {
      if( filename.isString() )
      {
        return filename;
      }
      return $str4$unknown_file;
    }
    else
    {
      if( source.eql( $kw5$COMPOSE ) )
      {
        return $str6$ke_text_compose;
      }
      html_utilities.html_princ( $str7$unknown_source );
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 3171L)
  public static SubLObject ket_check_ke_operation(final SubLObject ke_operation)
  {
    final SubLObject ke_operation_type = ke_operation.first();
    final SubLObject ke_operation_args = ke_operation.rest();
    final SubLObject pcase_var = ke_operation_type;
    if( pcase_var.eql( $kw8$ASSERT ) || pcase_var.eql( $kw9$UNASSERT ) )
    {
      final SubLObject sentence = ke_operation_args.first();
      SubLObject mt = conses_high.second( ke_operation_args );
      if( NIL == list_utilities.tree_find( $kw10$NEW_CONSTANT, sentence, UNPROVIDED, UNPROVIDED ) && NIL == list_utilities.tree_find( $kw10$NEW_CONSTANT, mt, UNPROVIDED, UNPROVIDED ) )
      {
        if( NIL == forts.fort_p( mt ) && mt.isCons() )
        {
          mt = narts_high.find_nart( mt );
        }
        if( NIL != forts.fort_p( mt ) )
        {
          final SubLObject assertions = fi.sentence_assertions( sentence, mt );
          SubLObject asserted_assertion = NIL;
          SubLObject doneP = NIL;
          if( NIL == doneP )
          {
            SubLObject csome_list_var = assertions;
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ( NIL == doneP && NIL != csome_list_var)
            {
              if( NIL != assertion_handles.assertion_p( assertion ) && NIL != assertions_high.asserted_assertionP( assertion ) )
              {
                asserted_assertion = assertion;
                doneP = T;
              }
              csome_list_var = csome_list_var.rest();
              assertion = csome_list_var.first();
            }
          }
          return asserted_assertion;
        }
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 4410L)
  public static SubLObject html_reload_ke_file_link(final SubLObject filename, SubLObject user_action_id_string)
  {
    if( user_action_id_string == UNPROVIDED )
    {
      user_action_id_string = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject href = PrintLow.format( NIL, $str11$cg_cb_handle_ke_text_file__filena, filename );
    if( user_action_id_string.isString() )
    {
      href = Sequences.cconcatenate( href, new SubLObject[] { $str12$__user_action_id_string_, user_action_id_string
      } );
    }
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( href );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str13$_2 );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( $str14$Reload_File );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 5013L)
  public static SubLObject do_ke_operations_summary(final SubLObject user_action_id_string)
  {
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    final SubLObject type = user_actions.user_action_type( user_action );
    final SubLObject source = html_arghash.get_arghash_value( $kw15$SOURCE, user_actions.user_action_data( user_action ) );
    final SubLObject filename = html_arghash.get_arghash_value( $kw16$FILENAME, user_actions.user_action_data( user_action ) );
    final SubLObject ke_operations = html_arghash.get_arghash_value( $kw17$KE_OPERATIONS, user_actions.user_action_data( user_action ) );
    html_utilities.html_princ( $str18$Evaluate_ );
    html_utilities.html_princ( Sequences.length( ke_operations ) );
    html_utilities.html_princ( $str19$_forms_from_ );
    html_utilities.html_princ( ket_string_for_source( source, filename ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 6484L)
  public static SubLObject new_ke_text_constant_applicability_test(final SubLObject cons)
  {
    return makeBoolean( cons.isList() && NIL != list_utilities.lengthE( cons, TWO_INTEGER, UNPROVIDED ) && cons.first() == $kw10$NEW_CONSTANT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 6638L)
  public static SubLObject new_ke_text_constant_html_output_fn(final SubLObject cons, final SubLObject depth, final SubLObject wrap_axiomsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
    if( NIL != html_macros.$html_color_sat_red$.getGlobalValue() )
    {
      html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_color( html_macros.$html_color_sat_red$.getGlobalValue() ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( conses_high.second( cons ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 6940L)
  public static SubLObject ket_show_ke_operation_row(final SubLObject ke_operation, SubLObject bgcolor, SubLObject check_existing)
  {
    if( bgcolor == UNPROVIDED )
    {
      bgcolor = NIL;
    }
    if( check_existing == UNPROVIDED )
    {
      check_existing = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ke_operation_type = ke_operation.first();
    SubLObject asserted_assertion = NIL;
    SubLObject operation_displayedP = T;
    if( ( check_existing == $kw23$CHECK_AND_SHOW || check_existing == $kw24$CHECK_AND_REMOVE ) && NIL != subl_promotions.memberP( ke_operation_type, $list25, UNPROVIDED, UNPROVIDED ) )
    {
      asserted_assertion = ket_check_ke_operation( ke_operation );
      if( check_existing == $kw24$CHECK_AND_REMOVE )
      {
        final SubLObject pcase_var = ke_operation_type;
        if( pcase_var.eql( $kw8$ASSERT ) )
        {
          if( NIL != asserted_assertion )
          {
            operation_displayedP = NIL;
          }
        }
        else if( pcase_var.eql( $kw9$UNASSERT ) && NIL == asserted_assertion )
        {
          operation_displayedP = NIL;
        }
      }
    }
    if( NIL != operation_displayedP )
    {
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      if( NIL != bgcolor )
      {
        html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( bgcolor );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw26$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        final SubLObject _prev_bind_2 = cb_utilities.$cb_form_cons_methods_active$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.$cb_form_cons_methods_active$.bind( cb_utilities.compute_cb_form_cons_methods_active( $cb_ke_text_default_cb_form_cons_method_keywords$.getDynamicValue( thread ) ), thread );
          cb_utilities.cb_form( ke_operation, ZERO_INTEGER, T );
        }
        finally
        {
          cb_utilities.$cb_form_cons_methods_active$.rebind( _prev_bind_2, thread );
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw26$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( check_existing == $kw23$CHECK_AND_SHOW || check_existing == $kw24$CHECK_AND_REMOVE )
          {
            final SubLObject pcase_var2 = ke_operation_type;
            if( pcase_var2.eql( $kw8$ASSERT ) )
            {
              if( NIL != asserted_assertion )
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
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str27$already_exists_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                cb_utilities.html_assertion_marker( asserted_assertion, $kw28$BOTTOM );
              }
            }
            else if( pcase_var2.eql( $kw9$UNASSERT ) )
            {
              if( NIL != asserted_assertion )
              {
                cb_utilities.html_assertion_marker( asserted_assertion, $kw28$BOTTOM );
              }
              else
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
                final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str29$does_not_exist );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
                }
                html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
              }
            }
          }
          html_utilities.html_br();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
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
    return operation_displayedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 9030L)
  public static SubLObject cb_do_ke_operations_display(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    return cb_do_ke_operations_display_internal( arghash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 9299L)
  public static SubLObject cb_do_ke_operations_display_internal(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject user_action_id_string = html_arghash.get_arghash_value( $kw32$USER_ACTION_ID_STRING, arghash );
    if( NIL == user_action_id_string )
    {
      user_action_id_string = html_arghash.get_arghash_value( $kw33$JUST_STRING, arghash );
      html_arghash.set_arghash_value( $kw32$USER_ACTION_ID_STRING, arghash, user_action_id_string );
    }
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      cyc_navigator_internals.generic_message_page( $str34$Fatal_Error, PrintLow.format( NIL, $str35$cb_do_ke_operations_display_inter ) );
    }
    else
    {
      final SubLObject cyclist = user_actions.user_action_cyclist( user_action );
      final SubLObject type = user_actions.user_action_type( user_action );
      final SubLObject arghash_$6 = user_actions.user_action_data( user_action );
      final SubLObject source = html_arghash.get_arghash_value( $kw15$SOURCE, arghash_$6 );
      final SubLObject filename = html_arghash.get_arghash_value( $kw16$FILENAME, arghash_$6 );
      final SubLObject check_existing = html_arghash.get_arghash_value( $kw36$CHECK_EXISTING, arghash_$6 );
      SubLObject ke_operations = html_arghash.get_arghash_value( $kw17$KE_OPERATIONS, arghash_$6 );
      final SubLObject project = html_arghash.get_arghash_value( $kw37$PROJECT, arghash_$6 );
      Hashtables.remhash( $kw38$NOT_REDUNDANT, arghash_$6 );
      final SubLObject title_var = $str39$KE_Text__Parse_Status;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw43$CB_CYC );
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
            html_utilities.html_markup( $str46$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str47$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str48$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str49$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str50$Refresh_Frames );
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
              html_utilities.html_princ( $str51$Your_KE_Text__from_ );
              html_utilities.html_princ( ket_string_for_source( source, filename ) );
              if( NIL == ke_operations )
              {
                html_utilities.html_princ( $str52$__did_not_parse_into_any_operatio );
              }
              else
              {
                html_utilities.html_princ( $str53$__has_been_successfully_parsed_in );
              }
              html_utilities.html_newline( TWO_INTEGER );
              if( source == $kw3$FILE && filename.isString() )
              {
                html_reload_ke_file_link( filename, user_action_id_string );
              }
              if( NIL != ke_operations )
              {
                final SubLObject pcase_var = check_existing;
                if( !pcase_var.eql( $kw24$CHECK_AND_REMOVE ) )
                {
                  if( pcase_var.eql( $kw23$CHECK_AND_SHOW ) )
                  {
                    final SubLObject href = PrintLow.format( NIL, $str54$cg_cb_handle_ke_operations__user_, user_action_id_string );
                    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( href );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str13$_2 );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str55$Remove_Redundant_Asserts_Unassert );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                  }
                  else
                  {
                    final SubLObject href = PrintLow.format( NIL, $str56$cg_cb_handle_ke_operations__user_, user_action_id_string );
                    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( href );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str13$_2 );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str57$Check_for_Existing_Assertions_ );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                    html_utilities.html_newline( UNPROVIDED );
                  }
                }
                html_utilities.html_newline( UNPROVIDED );
                final SubLObject href2 = PrintLow.format( NIL, $str58$cg__A__A___method_agenda, user_actions.user_action_handler_fn( user_action ), user_action_id_string );
                html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( href2 );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str13$_2 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str59$Add_Forms_to_Agenda );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                }
                html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
                html_utilities.html_newline( TWO_INTEGER );
                thread.resetMultipleValues();
                final SubLObject new_killed_renamed_constants = ke_text.ke_operations_new_killed_renamed_merged_constant_names( ke_operations );
                final SubLObject new_constantsP = thread.secondMultipleValue();
                final SubLObject killed_constantsP = thread.thirdMultipleValue();
                final SubLObject renamed_constantsP = thread.fourthMultipleValue();
                final SubLObject merged_constantsP = thread.fifthMultipleValue();
                thread.resetMultipleValues();
                SubLObject string_list = NIL;
                SubLObject filler_list = NIL;
                if( NIL != merged_constantsP )
                {
                  string_list = ConsesLow.cons( $str60$merged, string_list );
                }
                if( NIL != renamed_constantsP )
                {
                  string_list = ConsesLow.cons( $str61$renamed, string_list );
                }
                if( NIL != killed_constantsP )
                {
                  string_list = ConsesLow.cons( $str62$killed, string_list );
                }
                if( NIL != new_constantsP )
                {
                  string_list = ConsesLow.cons( $str63$created, string_list );
                }
                final SubLObject pcase_var2 = Sequences.length( string_list );
                if( pcase_var2.eql( TWO_INTEGER ) )
                {
                  filler_list = $list64;
                }
                else if( pcase_var2.eql( THREE_INTEGER ) )
                {
                  filler_list = $list65;
                }
                else if( pcase_var2.eql( FOUR_INTEGER ) )
                {
                  filler_list = $list66;
                }
                if( NIL != string_list )
                {
                  html_utilities.html_princ( $str67$The_following_constants_will_be_ );
                  SubLObject string = NIL;
                  SubLObject string_$17 = NIL;
                  SubLObject filler = NIL;
                  SubLObject filler_$18 = NIL;
                  string = string_list;
                  string_$17 = string.first();
                  filler = filler_list;
                  filler_$18 = filler.first();
                  while ( NIL != filler || NIL != string)
                  {
                    if( NIL != string_$17 )
                    {
                      html_utilities.html_princ( string_$17 );
                    }
                    if( NIL != filler_$18 )
                    {
                      html_utilities.html_princ( filler_$18 );
                    }
                    string = string.rest();
                    string_$17 = string.first();
                    filler = filler.rest();
                    filler_$18 = filler.first();
                  }
                  html_utilities.html_princ( $str68$_ );
                }
                html_utilities.html_newline( UNPROVIDED );
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
                html_utilities.html_markup( ZERO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject cdolist_list_var = new_killed_renamed_constants;
                  SubLObject new_killed_renamed_constant = NIL;
                  new_killed_renamed_constant = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject operation_type = new_killed_renamed_constant.first();
                    final SubLObject column1 = conses_high.second( new_killed_renamed_constant );
                    final SubLObject column2 = conses_high.third( new_killed_renamed_constant );
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
                        final SubLObject pcase_var3 = operation_type;
                        if( pcase_var3.eql( $kw69$CREATE ) )
                        {
                          if( NIL != killed_constantsP || NIL != renamed_constantsP )
                          {
                            html_utilities.html_princ( $str70$Create__ );
                          }
                        }
                        else if( pcase_var3.eql( $kw71$KILL ) )
                        {
                          html_utilities.html_princ( $str72$Kill__ );
                        }
                        else if( pcase_var3.eql( $kw73$RENAME ) )
                        {
                          html_utilities.html_princ( $str74$Rename__ );
                        }
                        else if( pcase_var3.eql( $kw75$MERGE ) )
                        {
                          html_utilities.html_princ( $str76$Merge__ );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        if( NIL != column1 )
                        {
                          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                          html_utilities.html_princ( column1 );
                          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_utilities.html_align( $kw77$CENTER ) );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        final SubLObject pcase_var3 = operation_type;
                        if( pcase_var3.eql( $kw73$RENAME ) )
                        {
                          html_utilities.html_princ( $str78$_to_ );
                        }
                        else if( pcase_var3.eql( $kw75$MERGE ) )
                        {
                          html_utilities.html_princ( $str79$_onto_ );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        if( NIL != column2 )
                        {
                          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                          html_utilities.html_princ( column2 );
                          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
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
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                    html_utilities.html_source_readability_terpri( UNPROVIDED );
                    cdolist_list_var = cdolist_list_var.rest();
                    new_killed_renamed_constant = cdolist_list_var.first();
                  }
                  html_utilities.html_newline( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                if( NIL != project )
                {
                  html_utilities.html_newline( UNPROVIDED );
                  html_utilities.html_princ( $str80$Project_ );
                  cb_utilities.cb_form( project, UNPROVIDED, UNPROVIDED );
                  html_utilities.html_princ( $str81$_will_be_used_as_the_KE_purpose_ );
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
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str82$100_ );
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
                      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( $str13$_2 );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( $str83$Operations_ );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject existing = ke_operations_existing_assertions( ke_operations );
                      final SubLObject existing_count = Sequences.length( existing );
                      if( NIL != existing )
                      {
                        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str84$_A_existing_assertion_A, existing_count.isZero() ? $str85$no
                            : ( ( NIL != number_utilities.onep( existing_count ) ) ? $str86$one : existing_count ), ( NIL != number_utilities.onep( existing_count ) ) ? $str87$ : $str88$s );
                        html_utilities.html_indent( UNPROVIDED );
                        cb_utilities.cb_link( $kw89$KET_ADD_TO_HISTORY, user_action_id_string, $str90$_Add_to_History_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  SubLObject new_ke_operations = NIL;
                  SubLObject bgcolor = NIL;
                  SubLObject color_toggle = NIL;
                  SubLObject list_var = NIL;
                  SubLObject ke_operation = NIL;
                  SubLObject ignore_me = NIL;
                  list_var = ke_operations;
                  ke_operation = list_var.first();
                  for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ke_operation = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
                  {
                    if( NIL != color_toggle )
                    {
                      color_toggle = NIL;
                    }
                    else
                    {
                      color_toggle = T;
                    }
                    bgcolor = ( NIL != color_toggle ) ? $str91$_dddddd : $str92$_cccccc;
                    final SubLObject operation_displayedP = ket_show_ke_operation_row( ke_operation, bgcolor, check_existing );
                    if( NIL != operation_displayedP )
                    {
                      new_ke_operations = ConsesLow.cons( ke_operation, new_ke_operations );
                    }
                  }
                  ke_operations = Sequences.nreverse( new_ke_operations );
                  html_arghash.set_arghash_value( $kw17$KE_OPERATIONS, user_actions.user_action_data( user_action ), ke_operations );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
              }
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
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 16200L)
  public static SubLObject cb_link_ket_add_to_history(final SubLObject user_action_id_string, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str90$_Add_to_History_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw93$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str94$cb_ket_add_to_history__a, user_action_id_string );
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
    return user_action_id_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 16667L)
  public static SubLObject ke_operations_existing_assertions(final SubLObject ke_operations)
  {
    assert NIL != Types.listp( ke_operations ) : ke_operations;
    SubLObject assertions = NIL;
    SubLObject cdolist_list_var = ke_operations;
    SubLObject ke_operation = NIL;
    ke_operation = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject assertion = ket_check_ke_operation( ke_operation );
      if( NIL != assertion_handles.valid_assertionP( assertion, UNPROVIDED ) )
      {
        assertions = ConsesLow.cons( assertion, assertions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      ke_operation = cdolist_list_var.first();
    }
    return Sequences.nreverse( assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 17094L)
  public static SubLObject cb_ket_add_to_history(final SubLObject args)
  {
    SubLObject user_action_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list97 );
    user_action_id_string = args.first();
    final SubLObject current = args.rest();
    if( NIL == current )
    {
      final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
      final SubLObject arghash = user_actions.user_action_data( user_action );
      final SubLObject ke_operations = html_arghash.get_arghash_value( $kw17$KE_OPERATIONS, arghash );
      final SubLObject existing_assertions = ke_operations_existing_assertions( ke_operations );
      SubLObject cdolist_list_var = Sequences.reverse( existing_assertions );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_tools.cb_add_to_history( assertion );
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
      return cb_tools.cb_history( UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( args, $list97 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 17581L)
  public static SubLObject cb_do_ke_operations_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    SubLObject user_action_id_string = html_arghash.get_arghash_value( $kw32$USER_ACTION_ID_STRING, arghash );
    final SubLObject method = html_arghash.get_arghash_value( $kw99$METHOD, arghash );
    if( NIL == user_action_id_string )
    {
      user_action_id_string = html_arghash.get_arghash_value( $kw33$JUST_STRING, arghash );
    }
    final SubLObject user_action = user_actions.user_action_by_id_string( user_action_id_string );
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      cyc_navigator_internals.generic_message_page( $str34$Fatal_Error, PrintLow.format( NIL, $str100$cb_do_ke_operations_handler_calle ) );
    }
    else
    {
      final SubLObject arghash_$30 = user_actions.user_action_data( user_action );
      final SubLObject ke_operations = html_arghash.get_arghash_value( $kw17$KE_OPERATIONS, arghash_$30 );
      final SubLObject project = html_arghash.get_arghash_value( $kw37$PROJECT, arghash_$30 );
      final SubLObject _prev_bind_0 = api_control_vars.$ke_purpose$.currentBinding( thread );
      try
      {
        api_control_vars.$ke_purpose$.bind( ( NIL != forts.fort_p( project ) ) ? project : api_control_vars.$ke_purpose$.getDynamicValue( thread ), thread );
        final SubLObject pcase_var = method;
        if( pcase_var.eql( $kw101$AGENDA ) )
        {
          final SubLObject title_var = $str102$KE_Text__Forms_Added_to_Agenda;
          final SubLObject _prev_bind_0_$31 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
          try
          {
            html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
                ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
                : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
            if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
            {
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
            try
            {
              cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list(
                  EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
              html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
              html_macros.html_head_content_type();
              cb_parameters.cb_head_shortcut_icon();
              html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
              cyc_file_dependencies.css( $kw43$CB_CYC );
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
              final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
                html_utilities.html_markup( $str46$yui_skin_sam );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str47$reloadFrameButton );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str48$button );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( $str49$reload );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_princ( $str50$Refresh_Frames );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                    {
                      html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                    }
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
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
                  SubLObject cdolist_list_var = ke_operations;
                  SubLObject ke_operation = NIL;
                  ke_operation = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    ke_text.do_ke_operation( ke_operation, method );
                    cdolist_list_var = cdolist_list_var.rest();
                    ke_operation = cdolist_list_var.first();
                  }
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                  html_utilities.html_copyright_notice();
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
                }
                html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              finally
              {
                html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$33, thread );
              }
              html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
            }
            finally
            {
              cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$32, thread );
            }
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0_$31, thread );
          }
          user_actions.delete_user_action( user_action );
        }
        else if( pcase_var.eql( $kw103$MAKE_CONSTANTS ) )
        {
          SubLObject cdolist_list_var2 = ke_operations;
          SubLObject ke_operation2 = NIL;
          ke_operation2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( $kw69$CREATE.equal( ke_operation2.first() ) )
            {
              ke_text.do_ke_operation( ke_operation2, $kw104$NOW );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            ke_operation2 = cdolist_list_var2.first();
          }
          ket_handle_ke_text_list( arghash_$30 );
        }
      }
      finally
      {
        api_control_vars.$ke_purpose$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 19217L)
  public static SubLObject cb_handle_ke_operations(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    ket_handle_ke_operations( arghash );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 19607L)
  public static SubLObject ket_handle_ke_operations(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user_action_type_key = $kw1$DO_KE_OPERATIONS;
    final SubLObject existing_user_action_id_string = html_arghash.get_arghash_value( $kw32$USER_ACTION_ID_STRING, arghash );
    SubLObject user_action = user_actions.user_action_by_id_string( existing_user_action_id_string );
    if( NIL == user_action )
    {
      user_action = user_actions.new_user_action( ConsesLow.list( $kw107$CYCLIST, operation_communication.the_cyclist(), $kw108$TYPE_KEY, user_action_type_key ) );
    }
    if( NIL == user_actions.user_action_p( user_action ) )
    {
      Errors.error( $str109$ket_handle_ke_operations__Could_n );
    }
    user_actions._csetf_user_action_creation_time( user_action, Time.get_universal_time() );
    if( !user_actions.user_action_data( user_action ).isHashtable() )
    {
      user_actions._csetf_user_action_data( user_action, Hashtables.make_hash_table( $int110$32, UNPROVIDED, UNPROVIDED ) );
    }
    html_arghash.set_arghash_value( $kw32$USER_ACTION_ID_STRING, user_actions.user_action_data( user_action ), user_actions.user_action_id_string( user_action ) );
    SubLObject k = NIL;
    SubLObject v = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( arghash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        k = Hashtables.getEntryKey( cdohash_entry );
        v = Hashtables.getEntryValue( cdohash_entry );
        if( NIL != subl_promotions.memberP( k, $ket_do_ke_operations_data_keywords$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
        {
          html_arghash.set_arghash_value_list( k, user_actions.user_action_data( user_action ), v );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    final SubLObject user_action_id_string = user_actions.user_action_id_string( user_action );
    final SubLObject user_action_display_fn = user_actions.user_action_display_fn( user_action );
    if( NIL != user_action_display_fn )
    {
      Functions.funcall( user_action_display_fn, ConsesLow.list( user_action_id_string ) );
    }
    else
    {
      Errors.error( $str111$User_action__do_ke_operations_not );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 21974L)
  public static SubLObject ket_html_error_table(final SubLObject error_lists, SubLObject arghash)
  {
    if( arghash == UNPROVIDED )
    {
      arghash = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = $str112$KE_Text__Errors_Found;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str40$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str41$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$36 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw42$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw43$CB_CYC );
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
        final SubLObject _prev_bind_0_$37 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str46$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str47$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str48$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str49$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str50$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
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
            html_utilities.html_princ( $str113$Some_errors_were_found_parsing_yo );
            html_utilities.html_newline( TWO_INTEGER );
            if( NIL != arghash )
            {
              final SubLObject filename = html_arghash.get_arghash_value( $kw16$FILENAME, arghash );
              if( NIL != filename )
              {
                html_reload_ke_file_link( filename, UNPROVIDED );
              }
            }
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( TWO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_width$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str82$100_ );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject bgcolor = NIL;
              SubLObject color_toggle = NIL;
              SubLObject list_var = NIL;
              SubLObject error_list = NIL;
              SubLObject ignore_me = NIL;
              list_var = error_lists;
              error_list = list_var.first();
              for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), error_list = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
              {
                if( NIL != color_toggle )
                {
                  color_toggle = NIL;
                }
                else
                {
                  color_toggle = T;
                }
                bgcolor = ( NIL != color_toggle ) ? $str91$_dddddd : $str92$_cccccc;
                final SubLObject error_file = error_list.first();
                final SubLObject error_line_number_start = conses_high.second( error_list );
                final SubLObject error_line_number_end = conses_high.third( error_list );
                final SubLObject error_string = conses_high.fourth( error_list );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                if( NIL != bgcolor )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( bgcolor );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw114$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw26$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( $str115$1_ );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    if( NIL != error_file )
                    {
                      html_utilities.html_princ( error_file );
                    }
                    html_utilities.html_princ( $str68$_ );
                    if( NIL != error_line_number_start )
                    {
                      html_utilities.html_princ( error_line_number_start );
                    }
                    if( !error_line_number_start.eql( error_line_number_end ) )
                    {
                      html_utilities.html_princ( $str116$_ );
                      if( NIL != error_line_number_end )
                      {
                        html_utilities.html_princ( error_line_number_end );
                      }
                    }
                    html_utilities.html_princ( $str68$_ );
                    html_utilities.html_glyph( $kw117$NBSP, ONE_INTEGER );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw114$LEFT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( error_string );
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
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ( $str118$Looking_over_the_ );
            final SubLObject href = Sequences.cconcatenate( system_parameters.$cyc_documentation_url$.getDynamicValue( thread ), $str119$ref_ke_file_html );
            html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( href );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str120$KE_Text_specification );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
            }
            html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
            html_utilities.html_princ( $str121$_may_also_help_ );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$37, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$36, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 23931L)
  public static SubLObject ket_handle_ke_text_list(final SubLObject arghash)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject filename = html_arghash.get_arghash_value( $kw16$FILENAME, arghash );
    final SubLObject ke_text_list = html_arghash.get_arghash_value( $kw122$KE_TEXT_LIST, arghash );
    thread.resetMultipleValues();
    final SubLObject ke_operations = ke_text.ke_text_list_to_ke_operations( ke_text_list, filename, UNPROVIDED, UNPROVIDED );
    final SubLObject error_lists = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != error_lists )
    {
      ket_html_error_table( error_lists, arghash );
    }
    else
    {
      html_arghash.set_arghash_value( $kw17$KE_OPERATIONS, arghash, ke_operations );
      ket_handle_ke_operations( arghash );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 24680L)
  public static SubLObject cb_handle_ke_text_file(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    final SubLObject content = html_arghash.get_arghash_value( $kw123$CONTENT, arghash );
    final SubLObject filename = html_arghash.get_arghash_value( $kw16$FILENAME, arghash );
    SubLObject error_lists = NIL;
    SubLObject ke_text_list = NIL;
    if( NIL != content )
    {
      thread.resetMultipleValues();
      final SubLObject good_ke = ke_text.ke_text_to_ke_text_list( content, filename );
      final SubLObject bad_ke = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ke_text_list = good_ke;
      error_lists = bad_ke;
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject good_ke = ke_text.ke_text_file_to_ke_text_list( filename );
      final SubLObject bad_ke = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ke_text_list = good_ke;
      error_lists = bad_ke;
    }
    if( NIL != error_lists )
    {
      ket_html_error_table( error_lists, arghash );
    }
    else
    {
      html_arghash.set_arghash_value( $kw15$SOURCE, arghash, $kw3$FILE );
      html_arghash.set_arghash_value( $kw122$KE_TEXT_LIST, arghash, ke_text_list );
      ket_handle_ke_text_list( arghash );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-ke-text.lisp", position = 25731L)
  public static SubLObject cb_handle_ke_text_compose(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    final SubLObject text = html_arghash.get_arghash_value( $kw125$KE_TEXT, arghash );
    final SubLObject ke_text_list = string_utilities.string_tokenize( text, ConsesLow.list( Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_arghash.set_arghash_value( $kw15$SOURCE, arghash, $kw5$COMPOSE );
    html_arghash.set_arghash_value( $kw122$KE_TEXT_LIST, arghash, ke_text_list );
    ket_handle_ke_text_list( arghash );
    return NIL;
  }

  public static SubLObject declare_cb_ke_text_file()
  {
    SubLFiles.declareFunction( me, "ket_string_for_source", "KET-STRING-FOR-SOURCE", 1, 1, false );
    SubLFiles.declareFunction( me, "ket_check_ke_operation", "KET-CHECK-KE-OPERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "html_reload_ke_file_link", "HTML-RELOAD-KE-FILE-LINK", 1, 1, false );
    SubLFiles.declareFunction( me, "do_ke_operations_summary", "DO-KE-OPERATIONS-SUMMARY", 1, 0, false );
    SubLFiles.declareFunction( me, "new_ke_text_constant_applicability_test", "NEW-KE-TEXT-CONSTANT-APPLICABILITY-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "new_ke_text_constant_html_output_fn", "NEW-KE-TEXT-CONSTANT-HTML-OUTPUT-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "ket_show_ke_operation_row", "KET-SHOW-KE-OPERATION-ROW", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_do_ke_operations_display", "CB-DO-KE-OPERATIONS-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_do_ke_operations_display_internal", "CB-DO-KE-OPERATIONS-DISPLAY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_ket_add_to_history", "CB-LINK-KET-ADD-TO-HISTORY", 1, 1, false );
    SubLFiles.declareFunction( me, "ke_operations_existing_assertions", "KE-OPERATIONS-EXISTING-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_ket_add_to_history", "CB-KET-ADD-TO-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_do_ke_operations_handler", "CB-DO-KE-OPERATIONS-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_ke_operations", "CB-HANDLE-KE-OPERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ket_handle_ke_operations", "KET-HANDLE-KE-OPERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ket_html_error_table", "KET-HTML-ERROR-TABLE", 1, 1, false );
    SubLFiles.declareFunction( me, "ket_handle_ke_text_list", "KET-HANDLE-KE-TEXT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_ke_text_file", "CB-HANDLE-KE-TEXT-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_ke_text_compose", "CB-HANDLE-KE-TEXT-COMPOSE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_ke_text_file()
  {
    $ket_do_ke_operations_data_keywords$ = SubLFiles.defparameter( "*KET-DO-KE-OPERATIONS-DATA-KEYWORDS*", $list2 );
    $cb_ke_text_default_cb_form_cons_method_keywords$ = SubLFiles.defparameter( "*CB-KE-TEXT-DEFAULT-CB-FORM-CONS-METHOD-KEYWORDS*", $list22 );
    return NIL;
  }

  public static SubLObject setup_cb_ke_text_file()
  {
    final SubLObject new_action_type = user_actions.make_action_type( $list0 );
    user_actions._csetf_action_type_key( new_action_type, $kw1$DO_KE_OPERATIONS );
    Hashtables.sethash( user_actions.action_type_key( new_action_type ), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type );
    cb_utilities.register_cb_form_cons_method( $sym20$NEW_KE_TEXT_CONSTANT, $list21 );
    html_macros.note_cgi_handler_function( $sym30$CB_DO_KE_OPERATIONS_DISPLAY, $kw31$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw89$KET_ADD_TO_HISTORY, $sym95$CB_LINK_KET_ADD_TO_HISTORY, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym98$CB_KET_ADD_TO_HISTORY, $kw31$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym105$CB_DO_KE_OPERATIONS_HANDLER, $kw31$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym106$CB_HANDLE_KE_OPERATIONS, $kw31$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym124$CB_HANDLE_KE_TEXT_FILE, $kw31$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym126$CB_HANDLE_KE_TEXT_COMPOSE, $kw31$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_ke_text_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_ke_text_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_ke_text_file();
  }
  static
  {
    me = new cb_ke_text();
    $ket_do_ke_operations_data_keywords$ = null;
    $cb_ke_text_default_cb_form_cons_method_keywords$ = null;
    $list0 = ConsesLow.list( makeKeyword( "SUMMARY-FN" ), makeSymbol( "DO-KE-OPERATIONS-SUMMARY" ), makeKeyword( "DISPLAY-FN" ), makeSymbol( "CB-DO-KE-OPERATIONS-DISPLAY" ), makeKeyword( "HANDLER-FN" ), makeSymbol(
        "CB-DO-KE-OPERATIONS-HANDLER" ) );
    $kw1$DO_KE_OPERATIONS = makeKeyword( "DO-KE-OPERATIONS" );
    $list2 = ConsesLow.list( makeKeyword( "USER-ACTION-ID-STRING" ), makeKeyword( "SOURCE" ), makeKeyword( "FILENAME" ), makeKeyword( "CHECK-EXISTING" ), makeKeyword( "KE-TEXT-LIST" ), makeKeyword( "KE-OPERATIONS" ),
        makeKeyword( "PROJECT" ) );
    $kw3$FILE = makeKeyword( "FILE" );
    $str4$unknown_file = makeString( "unknown file" );
    $kw5$COMPOSE = makeKeyword( "COMPOSE" );
    $str6$ke_text_compose = makeString( "ke-text compose" );
    $str7$unknown_source = makeString( "unknown source" );
    $kw8$ASSERT = makeKeyword( "ASSERT" );
    $kw9$UNASSERT = makeKeyword( "UNASSERT" );
    $kw10$NEW_CONSTANT = makeKeyword( "NEW-CONSTANT" );
    $str11$cg_cb_handle_ke_text_file__filena = makeString( "cg?cb-handle-ke-text-file&:filename=~A" );
    $str12$__user_action_id_string_ = makeString( "&:user-action-id-string=" );
    $str13$_2 = makeString( "+2" );
    $str14$Reload_File = makeString( "Reload File" );
    $kw15$SOURCE = makeKeyword( "SOURCE" );
    $kw16$FILENAME = makeKeyword( "FILENAME" );
    $kw17$KE_OPERATIONS = makeKeyword( "KE-OPERATIONS" );
    $str18$Evaluate_ = makeString( "Evaluate " );
    $str19$_forms_from_ = makeString( " forms from " );
    $sym20$NEW_KE_TEXT_CONSTANT = makeSymbol( "NEW-KE-TEXT-CONSTANT" );
    $list21 = ConsesLow.list( makeKeyword( "NAME" ), makeString( "new-ke-text-constant" ), makeKeyword( "KEYWORD" ), makeKeyword( "NEW-KE-TEXT-CONSTANT" ), makeKeyword( "APPLICABILITY-TEST-FN" ), makeSymbol(
        "NEW-KE-TEXT-CONSTANT-APPLICABILITY-TEST" ), makeKeyword( "HTML-OUTPUT-FN" ), makeSymbol( "NEW-KE-TEXT-CONSTANT-HTML-OUTPUT-FN" ) );
    $list22 = ConsesLow.list( makeKeyword( "NEW-KE-TEXT-CONSTANT" ) );
    $kw23$CHECK_AND_SHOW = makeKeyword( "CHECK-AND-SHOW" );
    $kw24$CHECK_AND_REMOVE = makeKeyword( "CHECK-AND-REMOVE" );
    $list25 = ConsesLow.list( makeKeyword( "ASSERT" ), makeKeyword( "UNASSERT" ) );
    $kw26$TOP = makeKeyword( "TOP" );
    $str27$already_exists_ = makeString( "already exists " );
    $kw28$BOTTOM = makeKeyword( "BOTTOM" );
    $str29$does_not_exist = makeString( "does not exist" );
    $sym30$CB_DO_KE_OPERATIONS_DISPLAY = makeSymbol( "CB-DO-KE-OPERATIONS-DISPLAY" );
    $kw31$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw32$USER_ACTION_ID_STRING = makeKeyword( "USER-ACTION-ID-STRING" );
    $kw33$JUST_STRING = makeKeyword( "JUST-STRING" );
    $str34$Fatal_Error = makeString( "Fatal Error" );
    $str35$cb_do_ke_operations_display_inter = makeString( "cb-do-ke-operations-display-internal called without a valid user-action-id-string" );
    $kw36$CHECK_EXISTING = makeKeyword( "CHECK-EXISTING" );
    $kw37$PROJECT = makeKeyword( "PROJECT" );
    $kw38$NOT_REDUNDANT = makeKeyword( "NOT-REDUNDANT" );
    $str39$KE_Text__Parse_Status = makeString( "KE-Text: Parse Status" );
    $str40$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str41$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw42$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw43$CB_CYC = makeKeyword( "CB-CYC" );
    $kw44$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw45$SHA1 = makeKeyword( "SHA1" );
    $str46$yui_skin_sam = makeString( "yui-skin-sam" );
    $str47$reloadFrameButton = makeString( "reloadFrameButton" );
    $str48$button = makeString( "button" );
    $str49$reload = makeString( "reload" );
    $str50$Refresh_Frames = makeString( "Refresh Frames" );
    $str51$Your_KE_Text__from_ = makeString( "Your KE-Text (from " );
    $str52$__did_not_parse_into_any_operatio = makeString( ") did not parse into any operations." );
    $str53$__has_been_successfully_parsed_in = makeString( ") has been successfully parsed into the below lists." );
    $str54$cg_cb_handle_ke_operations__user_ = makeString( "cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-remove" );
    $str55$Remove_Redundant_Asserts_Unassert = makeString( "Remove Redundant Asserts/Unasserts." );
    $str56$cg_cb_handle_ke_operations__user_ = makeString( "cg?cb-handle-ke-operations&:user-action-id-string=~A&::check-existing=check-and-show" );
    $str57$Check_for_Existing_Assertions_ = makeString( "Check for Existing Assertions." );
    $str58$cg__A__A___method_agenda = makeString( "cg?~A&~A&::method=agenda" );
    $str59$Add_Forms_to_Agenda = makeString( "Add Forms to Agenda" );
    $str60$merged = makeString( "merged" );
    $str61$renamed = makeString( "renamed" );
    $str62$killed = makeString( "killed" );
    $str63$created = makeString( "created" );
    $list64 = ConsesLow.list( makeString( " or " ) );
    $list65 = ConsesLow.list( makeString( ", " ), makeString( ", or " ) );
    $list66 = ConsesLow.list( makeString( ", " ), makeString( ", " ), makeString( " or " ) );
    $str67$The_following_constants_will_be_ = makeString( "The following constants will be " );
    $str68$_ = makeString( ":" );
    $kw69$CREATE = makeKeyword( "CREATE" );
    $str70$Create__ = makeString( "Create: " );
    $kw71$KILL = makeKeyword( "KILL" );
    $str72$Kill__ = makeString( "Kill: " );
    $kw73$RENAME = makeKeyword( "RENAME" );
    $str74$Rename__ = makeString( "Rename: " );
    $kw75$MERGE = makeKeyword( "MERGE" );
    $str76$Merge__ = makeString( "Merge: " );
    $kw77$CENTER = makeKeyword( "CENTER" );
    $str78$_to_ = makeString( " to " );
    $str79$_onto_ = makeString( " onto " );
    $str80$Project_ = makeString( "Project " );
    $str81$_will_be_used_as_the_KE_purpose_ = makeString( " will be used as the KE purpose." );
    $str82$100_ = makeString( "100%" );
    $str83$Operations_ = makeString( "Operations:" );
    $str84$_A_existing_assertion_A = makeString( "~A existing assertion~A" );
    $str85$no = makeString( "no" );
    $str86$one = makeString( "one" );
    $str87$ = makeString( "" );
    $str88$s = makeString( "s" );
    $kw89$KET_ADD_TO_HISTORY = makeKeyword( "KET-ADD-TO-HISTORY" );
    $str90$_Add_to_History_ = makeString( "[Add to History]" );
    $str91$_dddddd = makeString( "#dddddd" );
    $str92$_cccccc = makeString( "#cccccc" );
    $kw93$SELF = makeKeyword( "SELF" );
    $str94$cb_ket_add_to_history__a = makeString( "cb-ket-add-to-history&~a" );
    $sym95$CB_LINK_KET_ADD_TO_HISTORY = makeSymbol( "CB-LINK-KET-ADD-TO-HISTORY" );
    $sym96$LISTP = makeSymbol( "LISTP" );
    $list97 = ConsesLow.list( makeSymbol( "USER-ACTION-ID-STRING" ) );
    $sym98$CB_KET_ADD_TO_HISTORY = makeSymbol( "CB-KET-ADD-TO-HISTORY" );
    $kw99$METHOD = makeKeyword( "METHOD" );
    $str100$cb_do_ke_operations_handler_calle = makeString( "cb-do-ke-operations-handler called without a valid user-action-id-string" );
    $kw101$AGENDA = makeKeyword( "AGENDA" );
    $str102$KE_Text__Forms_Added_to_Agenda = makeString( "KE-Text: Forms Added to Agenda" );
    $kw103$MAKE_CONSTANTS = makeKeyword( "MAKE-CONSTANTS" );
    $kw104$NOW = makeKeyword( "NOW" );
    $sym105$CB_DO_KE_OPERATIONS_HANDLER = makeSymbol( "CB-DO-KE-OPERATIONS-HANDLER" );
    $sym106$CB_HANDLE_KE_OPERATIONS = makeSymbol( "CB-HANDLE-KE-OPERATIONS" );
    $kw107$CYCLIST = makeKeyword( "CYCLIST" );
    $kw108$TYPE_KEY = makeKeyword( "TYPE-KEY" );
    $str109$ket_handle_ke_operations__Could_n = makeString( "ket-handle-ke-operations: Could not create a user action." );
    $int110$32 = makeInteger( 32 );
    $str111$User_action__do_ke_operations_not = makeString( "User action :do-ke-operations not defined." );
    $str112$KE_Text__Errors_Found = makeString( "KE-Text: Errors Found" );
    $str113$Some_errors_were_found_parsing_yo = makeString( "Some errors were found parsing your KE-Text.  Please fix and try again." );
    $kw114$LEFT = makeKeyword( "LEFT" );
    $str115$1_ = makeString( "1%" );
    $str116$_ = makeString( "-" );
    $kw117$NBSP = makeKeyword( "NBSP" );
    $str118$Looking_over_the_ = makeString( "Looking over the " );
    $str119$ref_ke_file_html = makeString( "ref/ke-file.html" );
    $str120$KE_Text_specification = makeString( "KE Text specification" );
    $str121$_may_also_help_ = makeString( " may also help." );
    $kw122$KE_TEXT_LIST = makeKeyword( "KE-TEXT-LIST" );
    $kw123$CONTENT = makeKeyword( "CONTENT" );
    $sym124$CB_HANDLE_KE_TEXT_FILE = makeSymbol( "CB-HANDLE-KE-TEXT-FILE" );
    $kw125$KE_TEXT = makeKeyword( "KE-TEXT" );
    $sym126$CB_HANDLE_KE_TEXT_COMPOSE = makeSymbol( "CB-HANDLE-KE-TEXT-COMPOSE" );
  }
}
/*
 * 
 * Total time: 969 ms
 * 
 */