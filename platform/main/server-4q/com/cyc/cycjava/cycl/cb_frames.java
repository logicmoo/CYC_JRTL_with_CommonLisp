package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.wordnet_import.wordnet_import;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_frames
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_frames";
  public static final String myFingerPrint = "5a88a739c07eaf741ae343e73ea5b946a1eb13c9f7c01ae3f0815f60764a7c78";
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 1802L)
  private static SubLSymbol $cb_name$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 2643L)
  public static SubLSymbol $cb_toolbar_restrict_to_user_toolsP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 6375L)
  private static SubLSymbol $maximum_image_purpose_display_length$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 6553L)
  private static SubLSymbol $cb_user_toolbar_links_for_opencyc$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 7939L)
  private static SubLSymbol $cb_specify_show_gloss_options_text$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 8115L)
  private static SubLSymbol $cb_specify_show_gloss_options$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 8253L)
  public static SubLSymbol $cb_search_autocomplete_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23706L)
  private static SubLSymbol $compute_gloss_max_clarifying_sentences$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 30986L)
  private static SubLSymbol $use_cyc_ir_terms_for_browsingP$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 40666L)
  public static SubLSymbol $cb_default_index_view$;
  private static final SubLString $str0$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str1$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw2$UNINITIALIZED;
  private static final SubLSymbol $kw3$CB_CYC;
  private static final SubLString $str4$Cannot_have_a_FRAMESET_tag_inside;
  private static final SubLString $str5$75___50;
  private static final SubLSymbol $kw6$TOOLBAR;
  private static final SubLSymbol $kw7$MAIN;
  private static final SubLSymbol $kw8$STATUS;
  private static final SubLString $str9$You_must_have_frames_enabled_to_u;
  private static final SubLSymbol $kw10$OPTIONS;
  private static final SubLString $str11$_page_;
  private static final SubLSymbol $sym12$CB_START;
  private static final SubLSymbol $kw13$HTML_HANDLER;
  private static final SubLString $str14$Refresh;
  private static final SubLString $str15$0__url__cgi_bin_cg_cb_start;
  private static final SubLString $str16$If_you_see_this__please_follow_;
  private static final SubLString $str17$_cgi_bin_cg_cb_start;
  private static final SubLString $str18$this_link;
  private static final SubLString $str19$_;
  private static final SubLSymbol $sym20$CB_START_REDIRECT;
  private static final SubLString $str21$ResearchCyc;
  private static final SubLString $str22$__;
  private static final SubLString $str23$_;
  private static final SubLString $str24$_;
  private static final SubLString $str25$;
  private static final SubLString $str26$___;
  private static final SubLString $str27$_A_A_A;
  private static final SubLString $str28$KB_Browser;
  private static final SubLSymbol $kw29$TOP;
  private static final SubLString $str30$cb_start;
  private static final SubLSymbol $kw31$START;
  private static final SubLSymbol $sym32$CB_LINK_START;
  private static final SubLList $list33;
  private static final SubLSymbol $sym34$_CB_TOOLBAR_RESTRICT_TO_USER_TOOLS__;
  private static final SubLSymbol $kw35$PARAMETER;
  private static final SubLSymbol $sym36$CB_TOOLBAR_FRAME;
  private static final SubLString $str37$Update;
  private static final SubLString $str38$cb_toolbar_frame;
  private static final SubLSymbol $sym39$CB_LINK_TOOLBAR;
  private static final SubLSymbol $kw40$OPENCYC_60;
  private static final SubLString $str41$opencyc_logo_60_gif;
  private static final SubLString $str42$OpenCyc_Browser;
  private static final SubLSymbol $kw43$RESEARCHCYC_60;
  private static final SubLString $str44$cyc_logo_violet_60_gif;
  private static final SubLString $str45$ResearchCyc_Browser;
  private static final SubLSymbol $kw46$CB_TOOLBAR_FRAME;
  private static final SubLString $str47$cb_toolbar_frame_html;
  private static final SubLSymbol $kw48$LEFT;
  private static final SubLSymbol $kw49$NBSP;
  private static final SubLString $str50$50_;
  private static final SubLString $str51$You_are__;
  private static final SubLSymbol $kw52$LOGOUT;
  private static final SubLString $str53$Server__;
  private static final SubLString $str54$unknown;
  private static final SubLString $str55$_;
  private static final SubLString $str56$___;
  private static final SubLString $str57$Purpose__;
  private static final SubLInteger $int58$25;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym61$CB_LINK_METHOD;
  private static final SubLSymbol $sym62$STRINGP;
  private static final SubLSymbol $sym63$CB_TOOL_ABBREVIATION;
  private static final SubLSymbol $sym64$STRING_;
  private static final SubLString $str65$Tools;
  private static final SubLSymbol $kw66$TOOLS;
  private static final SubLList $list67;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$_CB_SEARCH_AUTOCOMPLETE_ENABLED_;
  private static final SubLString $str70$98_;
  private static final SubLString $str71$cb_handle_specify;
  private static final SubLString $str72$handler;
  private static final SubLString $str73$cb_cf;
  private static final SubLString $str74$arg_done;
  private static final SubLString $str75$constant_complete;
  private static final SubLString $str76$autocomplete;
  private static final SubLString $str77$query;
  private static final SubLString $str78$completeContainer;
  private static final SubLString $str79$inputBox;
  private static final SubLInteger $int80$50;
  private static final SubLObject $const81$Thing;
  private static final SubLString $str82$Search;
  private static final SubLString $str83$gloss_required;
  private static final SubLSymbol $kw84$RIGHT;
  private static final SubLSymbol $kw85$CYC_MAIN;
  private static final SubLString $str86$cb_handle_specify_query__A_everyt;
  private static final SubLString $str87$_A_results;
  private static final SubLSymbol $kw88$CB_SPECIFY_ALL;
  private static final SubLSymbol $sym89$CB_LINK_CB_SPECIFY_ALL;
  private static final SubLSymbol $sym90$NONE;
  private static final SubLString $str91$lucky;
  private static final SubLString $str92$case_insensitive;
  private static final SubLString $str93$everything;
  private static final SubLInteger $int94$100;
  private static final SubLSymbol $sym95$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLString $str96$Can_t_determine_a_Cyc_term_from__;
  private static final SubLString $str97$Please_enter_a_non_empty_string_;
  private static final SubLSymbol $sym98$CB_HANDLE_SPECIFY;
  private static final SubLSymbol $sym99$ASSERTION_P;
  private static final SubLString $str100$WordNet_search_results_for__;
  private static final SubLString $str101$wn_;
  private static final SubLString $str102$_;
  private static final SubLString $str103$Search_results_for__;
  private static final SubLString $str104$_A_matching_term_found_;
  private static final SubLString $str105$_A_matching_terms_found_;
  private static final SubLString $str106$_A_matching_WordNet_synsets_found;
  private static final SubLString $str107$No_matching_WordNet_synsets_found;
  private static final SubLString $str108$No_matching_terms_found_;
  private static final SubLString $str109$See_also_;
  private static final SubLString $str110$But_see_;
  private static final SubLSymbol $kw111$HTML;
  private static final SubLSymbol $kw112$NEW;
  private static final SubLString $str113$__1__A_of_approximately_;
  private static final SubLSymbol $sym114$NON_DOTTED_LIST_P;
  private static final SubLSymbol $sym115$NAUT_P;
  private static final SubLObject $const116$Noun;
  private static final SubLObject $const117$Verb;
  private static final SubLObject $const118$Adjective;
  private static final SubLObject $const119$Adverb;
  private static final SubLString $str120$WordNet_Noun_Synonym_Sets__in_Ord;
  private static final SubLString $str121$post;
  private static final SubLString $str122$wni_try_concept_match;
  private static final SubLString $str123$synset_id;
  private static final SubLString $str124$WordNet_Verb_Synonym_Sets__in_Ord;
  private static final SubLString $str125$WordNet_Adjective_Synonym_Sets__i;
  private static final SubLString $str126$WordNet_Adverb_Synonym_Sets__in_O;
  private static final SubLString $str127$Other_WordNet_SynSets;
  private static final SubLSymbol $sym128$ISA_COLLECTION_;
  private static final SubLSymbol $sym129$ISA_RELATION_;
  private static final SubLSymbol $sym130$ASSERTION_CONS;
  private static final SubLString $str131$Collections;
  private static final SubLString $str132$Relations;
  private static final SubLString $str133$Individuals;
  private static final SubLString $str134$Assertions;
  private static final SubLString $str135$__;
  private static final SubLSymbol $sym136$ENGLISH;
  private static final SubLSymbol $sym137$_COMPUTE_GLOSS_MAX_CLARIFYING_SENTENCES_;
  private static final SubLSymbol $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH;
  private static final SubLObject $const139$EverythingPSC;
  private static final SubLObject $const140$EnglishParaphraseMt;
  private static final SubLInteger $int141$10000;
  private static final SubLSymbol $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL;
  private static final SubLSymbol $sym143$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLString $str144$a_;
  private static final SubLString $str145$d_;
  private static final SubLString $str146$c_;
  private static final SubLString $str147$n_;
  private static final SubLString $str148$_G_;
  private static final SubLString $str149$Empty_string_results_in_no_consta;
  private static final SubLString $str150$_;
  private static final SubLString $str151$___;
  private static final SubLSymbol $kw152$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym153$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym154$_EXIT;
  private static final SubLString $str155$__;
  private static final SubLString $str156$_;
  private static final SubLString $str157$__;
  private static final SubLString $str158$Cannot_handle_pattern___string___;
  private static final SubLString $str159$Cannot_handle_pattern___string__i;
  private static final SubLString $str160$Cannot_handle_pattern__string___i;
  private static final SubLSymbol $sym161$TERM_OK_FOR_BROWSING_;
  private static final SubLSymbol $sym162$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str163$Unable_to_access_subword_index___;
  private static final SubLObject $const164$AllLexicalMicrotheoryPSC;
  private static final SubLObject $const165$AnytimePSC;
  private static final SubLInteger $int166$40;
  private static final SubLInteger $int167$39;
  private static final SubLInteger $int168$36;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$CB_MAIN_FRAME;
  private static final SubLSymbol $sym172$CB_CF;
  private static final SubLSymbol $sym173$CB_CONSTANT_FRAME;
  private static final SubLSymbol $sym174$CB_NF;
  private static final SubLSymbol $sym175$CB_NART_FRAME;
  private static final SubLSymbol $sym176$CB_NAUT_FRAME;
  private static final SubLString $str177$30___;
  private static final SubLSymbol $kw178$INDEX;
  private static final SubLSymbol $kw179$CONTENT;
  private static final SubLString $str180$The_requested_term_is_not_availab;
  private static final SubLSymbol $kw181$INFERRED;
  private static final SubLSymbol $sym182$_CB_DEFAULT_INDEX_VIEW_;
  private static final SubLSymbol $kw183$LEGACY;
  private static final SubLSymbol $sym184$CB_INDEX_FRAME;
  private static final SubLString $str185$No_Index;
  private static final SubLSymbol $sym186$CB_CONTENT_FRAME;
  private static final SubLSymbol $kw187$LEXICAL;
  private static final SubLSymbol $kw188$NONE;
  private static final SubLSymbol $kw189$DEFINITIONAL;
  private static final SubLSymbol $kw190$DOCUMENTATION;
  private static final SubLSymbol $kw191$MAXIMAL;
  private static final SubLString $str192$Index_Choose;
  private static final SubLString $str193$Choose_an_item_from_the_index_;
  private static final SubLString $str194$1;
  private static final SubLSymbol $sym195$CB_STATUS_FRAME;
  private static final SubLString $str196$cb_status_frame;
  private static final SubLSymbol $kw197$SERVER_STATUS;
  private static final SubLSymbol $sym198$CB_LINK_SERVER_STATUS;
  private static final SubLSymbol $sym199$PROGN;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$HTML_FANCY_TABLE_DATA;
  private static final SubLList $list202;
  private static final SubLSymbol $kw203$CB_SERVER_STATUS;
  private static final SubLString $str204$cb_server_status_html;
  private static final SubLSymbol $kw205$MODE;
  private static final SubLSymbol $kw206$AGENDA;
  private static final SubLString $str207$KB__;
  private static final SubLString $str208$Remote__;
  private static final SubLString $str209$all_;
  private static final SubLString $str210$_of_;
  private static final SubLString $str211$___;
  private static final SubLString $str212$Local_;
  private static final SubLSymbol $kw213$SHOW_LOCAL_OPS;
  private static final SubLString $str214$__d_;
  private static final SubLSymbol $kw215$RED;
  private static final SubLString $str216$_d;
  private static final SubLString $str217$__d_;
  private static final SubLString $str218$__d_;
  private static final SubLString $str219$Aux__;
  private static final SubLString $str220$__d__d_;
  private static final SubLString $str221$Transmit_Pending__;
  private static final SubLSymbol $kw222$SYSTEM;

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 662L)
  public static SubLObject cb_start(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw3$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( cb_page_title( UNPROVIDED ) );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != html_macros.html_inside_body_p() )
      {
        Errors.error( $str4$Cannot_have_a_FRAMESET_tag_inside );
      }
      html_utilities.html_markup( html_macros.$html_frameset_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_frameset_rows$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str5$75___50 );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_frame( $kw6$TOOLBAR, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cb_utilities.cb_frame( $kw7$MAIN, args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cb_utilities.cb_frame( $kw8$STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_frames_head$.getGlobalValue() );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            html_utilities.html_princ( $str9$You_must_have_frames_enabled_to_u );
            cb_utilities.cb_link( $kw10$OPTIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_princ( $str11$_page_ );
            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
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
        html_utilities.html_markup( html_macros.$html_no_frames_tail$.getGlobalValue() );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 1272L)
  public static SubLObject cb_start_redirect(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_meta_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_meta_http_equiv$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str14$Refresh );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_meta_content$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str15$0__url__cgi_bin_cg_cb_start );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( $str16$If_you_see_this__please_follow_ );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str17$_cgi_bin_cg_cb_start );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( $str18$this_link );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_markup( $str19$_ );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$4, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 1957L)
  public static SubLObject cb_page_title(SubLObject tool_name)
  {
    if( tool_name == UNPROVIDED )
    {
      tool_name = NIL;
    }
    SubLObject machine_name = Strings.string_downcase( Environment.get_machine_name( UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    if( machine_name.isString() )
    {
      machine_name = Sequences.cconcatenate( $str22$__, new SubLObject[] { format_nil.format_nil_a_no_copy( machine_name ), $str23$_, format_nil.format_nil_d_no_copy( html_kernel.html_port() ), $str24$_
      } );
    }
    else
    {
      machine_name = $str25$;
    }
    if( tool_name.isString() )
    {
      tool_name = Sequences.cconcatenate( $str26$___, tool_name );
    }
    else
    {
      tool_name = $str25$;
    }
    return PrintLow.format( NIL, $str27$_A_A_A, new SubLObject[] { $cb_name$.getGlobalValue(), tool_name, machine_name
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 2445L)
  public static SubLObject cb_link_start(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str28$KB_Browser;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw29$TOP );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str30$cb_start );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 2941L)
  public static SubLObject cb_toolbar_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        if( NIL != html_macros.$basic_skin_class$.getGlobalValue() )
        {
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$basic_skin_class$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_toolbar_frame_guts();
          html_utilities.html_source_readability_terpri( UNPROVIDED );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 3144L)
  public static SubLObject cb_link_toolbar(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str37$Update;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw6$TOOLBAR );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str38$cb_toolbar_frame );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 3567L)
  public static SubLObject cb_toolbar_frame_guts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_nowrap$.getGlobalValue() );
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
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw29$TOP );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          cb_parameters.cyc_cgi_url_int();
          html_utilities.html_princ( $str30$cb_start );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != frame_name_var )
          {
            html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( frame_name_var );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( $kw43$RESEARCHCYC_60 );
            final SubLObject align = $kw29$TOP;
            final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( $kw43$RESEARCHCYC_60 );
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
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
            }
            html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw49$NBSP, TWO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_specify_input();
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
          html_utilities.html_glyph( $kw49$NBSP, TWO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        final SubLObject align2 = $kw48$LEFT;
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != align2 )
        {
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( align2 ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str50$50_ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_user_toolbar_links();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_glyph( $kw49$NBSP, TWO_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_princ( $str51$You_are__ );
          cb_utilities.cb_form( operation_communication.the_cyclist(), UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          cb_utilities.cb_link( $kw52$LOGOUT, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          html_utilities.html_princ( $str53$Server__ );
          html_utilities.html_princ( Environment.get_machine_name( $str54$unknown ) );
          html_utilities.html_princ( $str55$_ );
          html_utilities.html_princ( system_parameters.$base_tcp_port$.getDynamicValue( thread ) );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          if( NIL != cb_system_tools.$image_purpose$.getDynamicValue( thread ) )
          {
            final SubLObject image_purpose_length = Sequences.length( cb_system_tools.$image_purpose$.getDynamicValue( thread ) );
            final SubLObject image_purpose = image_purpose_length.numG( $maximum_image_purpose_display_length$.getGlobalValue() ) ? Sequences.cconcatenate( string_utilities.string_first_n(
                $maximum_image_purpose_display_length$.getGlobalValue(), cb_system_tools.$image_purpose$.getDynamicValue( thread ) ), $str56$___ ) : cb_system_tools.$image_purpose$.getDynamicValue( thread );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_princ( $str57$Purpose__ );
            html_utilities.html_princ( image_purpose );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
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
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 6439L)
  public static SubLObject cb_toolbar_update_link()
  {
    cb_utilities.cb_link( $kw6$TOOLBAR, $str37$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( TWO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 6724L)
  public static SubLObject cb_user_toolbar_links()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tools = user_toolbar_links();
    tools = list_utilities.remove_if_not( $sym60$FUNCTION_SPEC_P, tools, $sym61$CB_LINK_METHOD, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    tools = list_utilities.remove_if_not( $sym62$STRINGP, tools, $sym63$CB_TOOL_ABBREVIATION, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    tools = Sort.sort( tools, $sym64$STRING_, $sym63$CB_TOOL_ABBREVIATION );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != $cb_toolbar_restrict_to_user_toolsP$.getDynamicValue( thread ) )
          {
            html_utilities.html_princ( $str65$Tools );
          }
          else
          {
            cb_utilities.cb_link( $kw66$TOOLS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_princ( $str55$_ );
          SubLObject cdolist_list_var = tools;
          SubLObject tool = NIL;
          tool = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( cb_utilities.cb_link_method( tool ).isFunctionSpec() )
            {
              html_utilities.html_indent( UNPROVIDED );
              cb_utilities.cb_link( tool, cb_utilities.cb_tool_abbreviation( tool ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            cdolist_list_var = cdolist_list_var.rest();
            tool = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 7792L)
  public static SubLObject user_toolbar_links()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cb_parameters.$cb_user_toolbar_links$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 8400L)
  public static SubLObject cb_specify_input()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject width = $str70$98_;
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw7$MAIN );
    html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != html_macros.$html_form_method_get$.getGlobalValue() )
    {
      html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_form_method_get$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$within_html_form$.bind( T, thread );
      html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
      html_utilities.html_hidden_input( $str71$cb_handle_specify, NIL, UNPROVIDED );
      html_utilities.html_hidden_input( $str72$handler, $str73$cb_cf, UNPROVIDED );
      html_utilities.html_hidden_input( $str74$arg_done, T, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( ZERO_INTEGER );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str75$constant_complete );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str76$autocomplete );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_script_utilities.html_text_input_reset_multi_submit( $str77$query, $str25$, width, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), html_macros.$html_form_method_get$
                    .getGlobalValue(), UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str78$completeContainer );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                }
                html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != $cb_search_autocomplete_enabled$.getDynamicValue( thread ) )
              {
                html_complete.html_print_js_autocomplete_setup_int( $str79$inputBox, $str78$completeContainer, $int80$50, THREE_INTEGER, T, $const81$Thing );
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_script_utilities.html_multi_submit_input( $str82$Search, $str25$, NIL, system_parameters.$cyc_cgi_program$.getDynamicValue( thread ), html_macros.$html_form_method_get$.getGlobalValue(), UNPROVIDED,
                UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
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
        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_create_dropdown_list( $str83$gloss_required, $cb_specify_show_gloss_options_text$.getGlobalValue(), $cb_specify_show_gloss_options$.getGlobalValue(), ONE_INTEGER, Sequences.position(
                cb_parameters.$cb_specify_show_gloss$.getDynamicValue( thread ), $cb_specify_show_gloss_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
            html_utilities.html_glyph( $kw49$NBSP, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw84$RIGHT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_script_utilities.html_clear_input_button( $str77$query, UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 10925L)
  public static SubLObject cb_link_cb_specify_all(final SubLObject search_string, final SubLObject count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw85$CYC_MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str86$cb_handle_specify_query__A_everyt, web_utilities.html_url_encode( search_string, UNPROVIDED ) );
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
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str87$_A_results, count );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return search_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 11169L)
  public static SubLObject cb_handle_specify(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query = html_utilities.html_extract_input( $str77$query, args );
    SubLObject ir_terms = NIL;
    SubLObject ir_term_count = NIL;
    SubLObject wn_synsets = NIL;
    SubLObject perform_wn_searchP = NIL;
    final SubLObject gloss_type_string = html_utilities.html_extract_input( $str83$gloss_required, args );
    final SubLObject gloss_type = gloss_type_string.isString() ? reader.read_from_string_ignoring_errors( gloss_type_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : $sym90$NONE;
    final SubLObject luckyP = ( NIL != html_utilities.html_extract_input( $str91$lucky, args ) ) ? T : NIL;
    final SubLObject case_insensitiveP_string = html_utilities.html_extract_input( $str92$case_insensitive, args );
    final SubLObject search_for_everythingP = html_utilities.html_extract_input( $str93$everything, args );
    final SubLObject other_terms_limit = ( NIL != search_for_everythingP ) ? NIL : $int94$100;
    final SubLObject case_insensitiveP = T;
    if( NIL != luckyP && NIL == cb_parameters.$cb_lucky_term_searchP$.getDynamicValue( thread ) )
    {
      cb_parameters.$cb_lucky_term_searchP$.setDynamicValue( T, thread );
    }
    else if( NIL == luckyP && NIL != cb_parameters.$cb_lucky_term_searchP$.getDynamicValue( thread ) )
    {
      cb_parameters.$cb_lucky_term_searchP$.setDynamicValue( NIL, thread );
    }
    cb_parameters.$cb_specify_show_gloss$.setDynamicValue( gloss_type, thread );
    if( NIL != query )
    {
      query = string_utilities.nsubst_whitespace( query );
      thread.resetMultipleValues();
      final SubLObject terms = terms_for_browsing( query, case_insensitiveP, T );
      final SubLObject error_string = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == list_utilities.singletonP( terms ) && ( NIL == reserved_browser_string_p( query ) || NIL != reserved_wn_browser_string_p( query ) ) )
      {
        thread.resetMultipleValues();
        final SubLObject ir_terms_$31 = related_cyc_terms_for_browsing( query, terms, other_terms_limit );
        final SubLObject ir_term_count_$32 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        ir_terms = ir_terms_$31;
        ir_term_count = ir_term_count_$32;
        perform_wn_searchP = T;
      }
      if( query.isString() && ( NIL != perform_wn_searchP || NIL != reserved_wn_browser_string_p( query ) ) )
      {
        wordnet_import.wni_clear_function_caches();
        wn_synsets = cb_wn_synsets_from_query( query );
      }
      if( NIL == terms && NIL == ir_terms && NIL == wn_synsets )
      {
        if( query.isString() && NIL == list_utilities.find_if_not( Symbols.symbol_function( $sym95$VALID_CONSTANT_NAME_CHAR_P ), query, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          if( Sequences.length( query ).numG( ZERO_INTEGER ) )
          {
            cb_browser.cb_alpha( ConsesLow.list( query ) );
          }
          else
          {
            cb_browser.cb_alpha_top( UNPROVIDED );
          }
        }
        else if( NIL != error_string )
        {
          cb_utilities.cb_error( error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          cb_utilities.cb_error( $str96$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
      else if( NIL != list_utilities.singletonP( terms ) && NIL == ir_terms )
      {
        if( NIL != assertion_handles.assertion_p( terms.first() ) )
        {
          cb_assertion_browser.cb_assertion_internal( terms.first() );
        }
        else if( NIL != deduction_handles.deduction_p( terms.first() ) )
        {
          cb_assertion_browser.cb_deduction_internal( terms.first() );
        }
        else
        {
          cb_term_frame_internal( cb_utilities.cb_term_identifier( terms.first() ) );
        }
      }
      else if( NIL == terms && NIL != list_utilities.singletonP( ir_terms ) )
      {
        if( NIL != assertion_handles.assertion_p( ir_terms.first() ) )
        {
          cb_assertion_browser.cb_assertion_internal( ir_terms.first() );
        }
        else if( NIL != deduction_handles.deduction_p( terms.first() ) )
        {
          cb_assertion_browser.cb_deduction_internal( ir_terms.first() );
        }
        else
        {
          cb_term_frame_internal( cb_utilities.cb_term_identifier( ir_terms.first() ) );
        }
      }
      else if( terms.isCons() || ir_terms.isCons() || wn_synsets.isCons() )
      {
        cb_term_choices( query, terms, ir_terms, wn_synsets, gloss_type, ir_term_count );
      }
      else if( NIL != error_string )
      {
        cb_utilities.cb_error( error_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_error( $str96$Can_t_determine_a_Cyc_term_from__, query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    else
    {
      cb_utilities.cb_error( $str97$Please_enter_a_non_empty_string_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 14715L)
  public static SubLObject cb_wn_synsets_from_query(final SubLObject query)
  {
    if( NIL != reserved_wn_browser_string_p( query ) )
    {
      final SubLObject string = string_utilities.substring( query, THREE_INTEGER, UNPROVIDED );
      return ( NIL != string_utilities.digit_stringP( string ) ) ? ConsesLow.list( wordnet_import.wni_synset_from_id_string( string ) ) : wordnet_import.wni_synsets_for_english_word_string( string );
    }
    return wordnet_import.wni_synsets_for_english_word_string( query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 15074L)
  public static SubLObject cb_term_choices(final SubLObject query, final SubLObject terms_and_assertions, final SubLObject related_terms, final SubLObject wn_synsets, SubLObject gloss_type, SubLObject related_term_count)
  {
    if( gloss_type == UNPROVIDED )
    {
      gloss_type = NIL;
    }
    if( related_term_count == UNPROVIDED )
    {
      related_term_count = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject assertions = list_utilities.partition_list( terms_and_assertions, Symbols.symbol_function( $sym99$ASSERTION_P ) );
    final SubLObject terms = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject title = ( NIL != reserved_wn_browser_string_p( query ) ) ? Sequences.cconcatenate( $str100$WordNet_search_results_for__, new SubLObject[] { string_utilities.pre_remove( query, $str101$wn_,
        UNPROVIDED ), $str102$_
    } ) : Sequences.cconcatenate( $str103$Search_results_for__, new SubLObject[] { query, $str102$_
    } );
    final SubLObject matching_terms_string = ( NIL != terms ) ? ( ( NIL != list_utilities.singletonP( terms ) ) ? $str104$_A_matching_term_found_ : $str105$_A_matching_terms_found_ )
        : ( ( NIL != reserved_wn_browser_string_p( query ) ) ? ( ( NIL != wn_synsets ) ? $str106$_A_matching_WordNet_synsets_found : $str107$No_matching_WordNet_synsets_found ) : $str108$No_matching_terms_found_ );
    final SubLObject see_also_string = ( NIL != terms ) ? $str109$See_also_ : $str110$But_see_;
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( title );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$33 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_princ( title );
          html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
          html_utilities.html_markup( TWO_INTEGER );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw3$CB_CYC );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
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
                if( NIL != reserved_wn_browser_string_p( query ) )
                {
                  html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), matching_terms_string, Sequences.length( wn_synsets ) );
                  html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                else
                {
                  html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), matching_terms_string, Sequences.length( terms ) );
                  html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                final SubLObject _prev_bind_0_$38 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
                try
                {
                  pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$39 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try
                    {
                      thread.resetMultipleValues();
                      final SubLObject _prev_bind_0_$40 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                      try
                      {
                        pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$41 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                        try
                        {
                          pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                          final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                          final SubLObject _prev_bind_0_$42 = memoization_state.$memoization_state$.currentBinding( thread );
                          try
                          {
                            memoization_state.$memoization_state$.bind( local_state, thread );
                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                            try
                            {
                              final SubLObject _prev_bind_0_$43 = pph_vars.$pph_language_mt$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$44 = pph_vars.$paraphrase_mode$.currentBinding( thread );
                              try
                              {
                                pph_vars.$pph_language_mt$.bind( cb_tools.cb_paraphrase_mt(), thread );
                                pph_vars.$paraphrase_mode$.bind( $kw111$HTML, thread );
                                cb_display_term_section( terms, gloss_type );
                              }
                              finally
                              {
                                pph_vars.$paraphrase_mode$.rebind( _prev_bind_1_$44, thread );
                                pph_vars.$pph_language_mt$.rebind( _prev_bind_0_$43, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                                Values.restoreValuesFromVector( _values );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
                              }
                            }
                          }
                          finally
                          {
                            memoization_state.$memoization_state$.rebind( _prev_bind_0_$42, thread );
                          }
                        }
                        finally
                        {
                          pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$41, thread );
                        }
                        if( new_or_reused == $kw112$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                        {
                          memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                        }
                      }
                      finally
                      {
                        pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$40, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$45 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if( NIL == reuseP )
                        {
                          pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                        }
                        Values.restoreValuesFromVector( _values2 );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$45, thread );
                      }
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$39, thread );
                  }
                }
                finally
                {
                  pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$38, thread );
                }
                if( NIL != related_terms || NIL != assertions )
                {
                  html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  html_utilities.html_princ( see_also_string );
                  if( NIL != related_term_count )
                  {
                    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_style_font_size_smaller$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str113$__1__A_of_approximately_, Sequences.length( related_terms ) );
                      cb_utilities.cb_link( $kw88$CB_SPECIFY_ALL, query, related_term_count, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      html_utilities.html_princ( $str24$_ );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
                  }
                  html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                  html_utilities.html_markup( FOUR_INTEGER );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                }
                cb_display_term_section( Sequences.cconcatenate( assertions, related_terms ), gloss_type );
                if( NIL != wn_synsets )
                {
                  html_utilities.html_newline( UNPROVIDED );
                  cb_display_wn_synsets_section( wn_synsets );
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
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$35, thread );
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
      cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return query;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 16821L)
  public static SubLObject cb_display_wn_synsets_section(final SubLObject wn_synsets)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.non_dotted_list_p( wn_synsets ) : wn_synsets;
    SubLObject cdolist_list_var = wn_synsets;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != narts_high.naut_p( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    SubLObject noun_synsets = NIL;
    SubLObject verb_synsets = NIL;
    SubLObject adjective_synsets = NIL;
    SubLObject adverb_synsets = NIL;
    SubLObject other_synsets = NIL;
    SubLObject cdolist_list_var2 = wn_synsets;
    SubLObject synset = NIL;
    synset = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL != kb_utilities.kbeq( wordnet_import.wni_synset_pos( synset ), $const116$Noun ) )
      {
        noun_synsets = ConsesLow.cons( synset, noun_synsets );
      }
      else if( NIL != kb_utilities.kbeq( wordnet_import.wni_synset_pos( synset ), $const117$Verb ) )
      {
        verb_synsets = ConsesLow.cons( synset, verb_synsets );
      }
      else if( NIL != kb_utilities.kbeq( wordnet_import.wni_synset_pos( synset ), $const118$Adjective ) )
      {
        adjective_synsets = ConsesLow.cons( synset, adjective_synsets );
      }
      else if( NIL != kb_utilities.kbeq( wordnet_import.wni_synset_pos( synset ), $const119$Adverb ) )
      {
        adverb_synsets = ConsesLow.cons( synset, adverb_synsets );
      }
      else
      {
        other_synsets = ConsesLow.cons( synset, other_synsets );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      synset = cdolist_list_var2.first();
    }
    if( NIL != noun_synsets )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str120$WordNet_Noun_Synonym_Sets__in_Ord );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      cdolist_list_var2 = Sequences.nreverse( noun_synsets );
      SubLObject noun_synset = NIL;
      noun_synset = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
        html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str121$post );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
        final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding( thread );
        final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_macros.$within_html_form$.bind( T, thread );
          html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
          html_utilities.html_hidden_input( $str122$wni_try_concept_match, T, UNPROVIDED );
          html_utilities.html_hidden_input( $str123$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( noun_synset ) ), UNPROVIDED );
          cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser( noun_synset );
          html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
        }
        finally
        {
          html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_4, thread );
          html_macros.$within_html_form$.rebind( _prev_bind_3, thread );
          html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
        cdolist_list_var2 = cdolist_list_var2.rest();
        noun_synset = cdolist_list_var2.first();
      }
    }
    if( NIL != verb_synsets )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str124$WordNet_Verb_Synonym_Sets__in_Ord );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      cdolist_list_var2 = Sequences.nreverse( verb_synsets );
      SubLObject verb_synset = NIL;
      verb_synset = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
        html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str121$post );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
        final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding( thread );
        final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_macros.$within_html_form$.bind( T, thread );
          html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
          html_utilities.html_hidden_input( $str122$wni_try_concept_match, T, UNPROVIDED );
          html_utilities.html_hidden_input( $str123$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( verb_synset ) ), UNPROVIDED );
          cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser( verb_synset );
          html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
        }
        finally
        {
          html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_4, thread );
          html_macros.$within_html_form$.rebind( _prev_bind_3, thread );
          html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
        cdolist_list_var2 = cdolist_list_var2.rest();
        verb_synset = cdolist_list_var2.first();
      }
    }
    if( NIL != adjective_synsets )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str125$WordNet_Adjective_Synonym_Sets__i );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$53, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$52, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      cdolist_list_var2 = Sequences.nreverse( adjective_synsets );
      SubLObject adjective_synset = NIL;
      adjective_synset = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
        html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str121$post );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
        final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding( thread );
        final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_macros.$within_html_form$.bind( T, thread );
          html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
          html_utilities.html_hidden_input( $str122$wni_try_concept_match, T, UNPROVIDED );
          html_utilities.html_hidden_input( $str123$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( adjective_synset ) ), UNPROVIDED );
          cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser( adjective_synset );
          html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
        }
        finally
        {
          html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_4, thread );
          html_macros.$within_html_form$.rebind( _prev_bind_3, thread );
          html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
        cdolist_list_var2 = cdolist_list_var2.rest();
        adjective_synset = cdolist_list_var2.first();
      }
    }
    if( NIL != adverb_synsets )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str126$WordNet_Adverb_Synonym_Sets__in_O );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$55, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$54, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      cdolist_list_var2 = Sequences.nreverse( adverb_synsets );
      SubLObject adverb_synset = NIL;
      adverb_synset = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
        html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str121$post );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != frame_name_var )
        {
          html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( frame_name_var );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
        final SubLObject _prev_bind_3 = html_macros.$within_html_form$.currentBinding( thread );
        final SubLObject _prev_bind_4 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_macros.$within_html_form$.bind( T, thread );
          html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
          html_utilities.html_hidden_input( $str122$wni_try_concept_match, T, UNPROVIDED );
          html_utilities.html_hidden_input( $str123$synset_id, string_utilities.to_string( wordnet_import.wni_synset_id( adverb_synset ) ), UNPROVIDED );
          cb_wordnet_utilities.wni_html_synset_words_gloss_examples_for_cb_browser( adverb_synset );
          html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
        }
        finally
        {
          html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_4, thread );
          html_macros.$within_html_form$.rebind( _prev_bind_3, thread );
          html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
        }
        html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
        cdolist_list_var2 = cdolist_list_var2.rest();
        adverb_synset = cdolist_list_var2.first();
      }
    }
    if( NIL != other_synsets )
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str127$Other_WordNet_SynSets );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$57, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$56, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      cdolist_list_var2 = other_synsets;
      synset = NIL;
      synset = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        html_utilities.html_princ( synset );
        html_utilities.html_terpri( UNPROVIDED );
        cdolist_list_var2 = cdolist_list_var2.rest();
        synset = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 20028L)
  public static SubLObject cb_display_term_section(final SubLObject terms, SubLObject gloss_type)
  {
    if( gloss_type == UNPROVIDED )
    {
      gloss_type = NIL;
    }
    final SubLObject collections = list_utilities.find_all_if( Symbols.symbol_function( $sym128$ISA_COLLECTION_ ), terms, UNPROVIDED );
    final SubLObject relations = list_utilities.find_all_if( Symbols.symbol_function( $sym129$ISA_RELATION_ ), terms, UNPROVIDED );
    final SubLObject assertions = kb_utilities.sort_terms( list_utilities.find_all_if( Symbols.symbol_function( $sym99$ASSERTION_P ), terms, UNPROVIDED ), NIL, NIL, T, NIL, $sym130$ASSERTION_CONS, UNPROVIDED );
    final SubLObject individuals = list_utilities.ordered_set_difference( list_utilities.ordered_set_difference( list_utilities.ordered_set_difference( terms, collections, UNPROVIDED, UNPROVIDED ), relations, UNPROVIDED,
        UNPROVIDED ), assertions, UNPROVIDED, UNPROVIDED );
    if( gloss_type == $sym90$NONE )
    {
      cb_display_term_section_sans_gloss( collections, relations, assertions, individuals );
    }
    else
    {
      cb_display_term_section_with_gloss( collections, relations, assertions, individuals, gloss_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 20732L)
  public static SubLObject cb_display_term_section_with_gloss(final SubLObject collections, final SubLObject relations, final SubLObject assertions, final SubLObject individuals, final SubLObject gloss_type)
  {
    if( NIL != collections )
    {
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str131$Collections );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = collections;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_display_term_choice( v_term, gloss_type );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    if( NIL != relations )
    {
      if( NIL != collections )
      {
        html_utilities.html_newline( TWO_INTEGER );
      }
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str132$Relations );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = relations;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_display_term_choice( v_term, gloss_type );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    if( NIL != individuals )
    {
      if( NIL != collections || NIL != relations )
      {
        html_utilities.html_newline( TWO_INTEGER );
      }
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str133$Individuals );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = individuals;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_display_term_choice( v_term, gloss_type );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    if( NIL != assertions )
    {
      if( NIL != collections || NIL != relations || NIL != individuals )
      {
        html_utilities.html_newline( TWO_INTEGER );
      }
      html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
      html_utilities.html_princ( $str134$Assertions );
      html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = assertions;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_display_term_choice( v_term, gloss_type );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 21678L)
  public static SubLObject cb_display_term_section_sans_gloss(final SubLObject collections, final SubLObject relations, final SubLObject assertions, final SubLObject individuals)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        if( NIL != collections )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str131$Collections );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = collections;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_display_term_choice( v_term, UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              v_term = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$59, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw49$NBSP, FOUR_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$60, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        if( NIL != relations )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str132$Relations );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = relations;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_display_term_choice( v_term, UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              v_term = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$61, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw49$NBSP, FOUR_INTEGER );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$62, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        if( NIL != individuals )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str133$Individuals );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = individuals;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_display_term_choice( v_term, UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              v_term = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$63, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$58, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( NIL != assertions )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( THREE_INTEGER );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            if( NIL != collections || NIL != relations || NIL != individuals )
            {
              html_utilities.html_newline( TWO_INTEGER );
            }
            html_utilities.html_markup( html_macros.$html_italic_head$.getGlobalValue() );
            html_utilities.html_princ( $str134$Assertions );
            html_utilities.html_markup( html_macros.$html_italic_tail$.getGlobalValue() );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = assertions;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              cb_display_term_choice( v_term, UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              v_term = cdolist_list_var.first();
            }
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$65, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$64, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 22843L)
  public static SubLObject cb_display_term_choice(final SubLObject v_term, SubLObject gloss_type)
  {
    if( gloss_type == UNPROVIDED )
    {
      gloss_type = $sym90$NONE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject gloss = ( gloss_type == $sym90$NONE ) ? NIL : compute_gloss_for_term_to_display( v_term, gloss_type );
    if( gloss_type == $sym90$NONE )
    {
      cb_utilities.cb_form( v_term, NIL, T );
      html_utilities.html_newline( UNPROVIDED );
    }
    else
    {
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
        final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
            cb_utilities.cb_form( v_term, NIL, T );
            html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
            html_utilities.html_princ( $str135$__ );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$67, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          if( NIL != gloss )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( gloss );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$68, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$66, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23423L)
  public static SubLObject compute_gloss_for_term_to_display(final SubLObject v_term, final SubLObject gloss_type)
  {
    final SubLObject gloss = ( gloss_type == $sym136$ENGLISH ) ? compute_gloss_for_term_to_display_english( v_term ) : compute_gloss_for_term_to_display_cycl( v_term );
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23706L)
  public static SubLObject compute_gloss_for_term_to_display_english_internal(final SubLObject v_term)
  {
    final SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences( v_term, $const139$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    return rkf_concept_communicator.rkf_html_summary_sentence( v_term, clarifying_sentences, $const140$EnglishParaphraseMt, $const139$EverythingPSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23706L)
  public static SubLObject compute_gloss_for_term_to_display_english(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return compute_gloss_for_term_to_display_english_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, ONE_INTEGER, $int141$10000, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( compute_gloss_for_term_to_display_english_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23706L)
  public static SubLObject compute_gloss_for_term_to_display_cycl_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject clarifying_sentences = rkf_concept_clarifier.rkf_clarifying_sentences( v_term, $const139$EverythingPSC, $compute_gloss_max_clarifying_sentences$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    SubLObject html = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_3 = html_macros.$html_stream$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym143$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const139$EverythingPSC, thread );
      html_macros.$html_stream$.bind( NIL, thread );
      try
      {
        html_macros.$html_stream$.setDynamicValue( streams_high.make_private_string_output_stream(), thread );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var = clarifying_sentences;
              SubLObject clarifying_sentence = NIL;
              clarifying_sentence = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
                final SubLObject assertion = czer_meta.find_assertions_cycl( clarifying_sentence, UNPROVIDED );
                if( NIL != assertion )
                {
                  cb_utilities.cb_form( assertion.first(), UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  cb_utilities.cb_form( clarifying_sentence, UNPROVIDED, UNPROVIDED );
                }
                html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                clarifying_sentence = cdolist_list_var.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$71, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$70, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$69, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        html = streams_high.get_output_stream_string( html_macros.$html_stream$.getDynamicValue( thread ) );
      }
      finally
      {
        final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( html_macros.$html_stream$.getDynamicValue( thread ), UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$72, thread );
        }
      }
    }
    finally
    {
      html_macros.$html_stream$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return html;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 23706L)
  public static SubLObject compute_gloss_for_term_to_display_cycl(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return compute_gloss_for_term_to_display_cycl_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, ONE_INTEGER, $int141$10000, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( compute_gloss_for_term_to_display_cycl_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 24869L)
  public static SubLObject reserved_browser_string_p(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    if( NIL != string_utilities.starts_with( string, $str144$a_ ) )
    {
      return T;
    }
    if( NIL != string_utilities.starts_with( string, $str145$d_ ) )
    {
      return T;
    }
    if( NIL != string_utilities.starts_with( string, $str146$c_ ) )
    {
      return T;
    }
    if( NIL != string_utilities.starts_with( string, $str147$n_ ) )
    {
      return T;
    }
    if( NIL != reserved_wn_browser_string_p( string ) )
    {
      return T;
    }
    if( NIL != string_utilities.string_starts_with_constant_reader_prefix_p( string ) )
    {
      return T;
    }
    if( NIL != string_utilities.starts_with( string, $str148$_G_ ) && NIL != string_utilities.ends_with( string, $str102$_, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 25848L)
  public static SubLObject reserved_wn_browser_string_p(final SubLObject string)
  {
    assert NIL != Types.stringp( string ) : string;
    return string_utilities.starts_with( string, $str101$wn_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 26125L)
  public static SubLObject terms_for_browsing(SubLObject string, SubLObject case_insensitiveP, SubLObject return_nautsP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = T;
    }
    if( return_nautsP == UNPROVIDED )
    {
      return_nautsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( string ) : string;
    if( NIL != web_utilities.$decode_urls_during_http_read_request$.getGlobalValue() )
    {
      string = unicode_strings.html_escaped_to_utf8_string( string );
    }
    string = string_utilities.trim_whitespace( string );
    case_insensitiveP = list_utilities.sublisp_boolean( case_insensitiveP );
    if( Sequences.length( string ).numE( ZERO_INTEGER ) )
    {
      return Values.values( NIL, $str149$Empty_string_results_in_no_consta );
    }
    if( NIL != string_utilities.starts_with( string, $str101$wn_ ) )
    {
      return Values.values( NIL, NIL );
    }
    if( NIL != cb_parameters.$cb_lucky_term_searchP$.getDynamicValue( thread ) && NIL != constant_completion_high.valid_constant_name_p( string ) )
    {
      final SubLObject constants = constant_completion_high.constant_complete( string, Types.sublisp_null( case_insensitiveP ), T, UNPROVIDED, UNPROVIDED );
      if( NIL != list_utilities.singletonP( constants ) )
      {
        return Values.values( constants, NIL );
      }
    }
    if( NIL != string_utilities.string_starts_with_constant_reader_prefix_p( string ) && NIL != constant_via_exact_name_spec( string ) )
    {
      return Values.values( constant_via_exact_name_spec( string ), NIL );
    }
    final SubLObject constants_via_guid = constant_via_external_id_spec( string );
    if( NIL != constants_via_guid )
    {
      return Values.values( constants_via_guid, NIL );
    }
    if( NIL != string_utilities.starts_with( string, $str150$_ ) )
    {
      final SubLObject asserts = asserts_via_open_paren_spec( string );
      if( NIL != asserts )
      {
        return Values.values( asserts, NIL );
      }
    }
    if( NIL == string_utilities.starts_with( string, $str150$_ ) && NIL == string_utilities.starts_with( string, $str151$___ ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw152$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym153$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            if( NIL != kb_utilities.compact_hl_external_id_string_p( string ) )
            {
              final SubLObject v_term = kb_utilities.find_object_by_compact_hl_external_id_string( string );
              if( NIL != term_ok_for_browsingP( v_term ) && string.equal( kb_utilities.compact_hl_external_id_string( v_term ) ) )
              {
                return Values.values( ConsesLow.list( v_term ), NIL );
              }
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw152$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      SubLObject result = NIL;
      string = string_utilities.string_subst( $str25$, $str155$__, string, UNPROVIDED );
      if( NIL != string_utilities.starts_with( string, $str156$_ ) && NIL == string_utilities.ends_with( string, $str157$__, UNPROVIDED ) )
      {
        if( NIL != string_utilities.ends_with( string, $str156$_, UNPROVIDED ) )
        {
          if( Sequences.length( string ).numLE( FOUR_INTEGER ) )
          {
            return Values.values( NIL, $str158$Cannot_handle_pattern___string___ );
          }
          result = constant_via_star_apropos( string, case_insensitiveP );
        }
        else
        {
          if( Sequences.length( string ).numLE( THREE_INTEGER ) )
          {
            return Values.values( NIL, $str159$Cannot_handle_pattern___string__i );
          }
          result = constant_via_star_postfix( string, case_insensitiveP );
        }
      }
      else if( NIL != string_utilities.ends_with( string, $str156$_, UNPROVIDED ) && NIL == string_utilities.ends_with( string, $str157$__, UNPROVIDED ) )
      {
        if( Sequences.length( string ).numLE( TWO_INTEGER ) )
        {
          return Values.values( NIL, $str160$Cannot_handle_pattern__string___i );
        }
        result = constant_via_star_completion( string, case_insensitiveP );
      }
      else if( NIL != string_utilities.quoted_stringP( string ) )
      {
        final SubLObject unquoted = string_utilities.unquote_string( string );
        result = terms_via_lexicon( unquoted, T );
        if( NIL != kb_indexing_datastructures.indexed_term_p( unquoted ) )
        {
          result = Sequences.cconcatenate( result, assertions_for_string( unquoted ) );
        }
      }
      else
      {
        result = terms_via_dwimming( string, case_insensitiveP );
      }
      result = conses_high.union( result, wordnet.wn_direct_denots_of_string( string, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
      result = list_utilities.delete_if_not( Symbols.symbol_function( $sym161$TERM_OK_FOR_BROWSING_ ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      result = kb_utilities.sort_terms( result, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return Values.values( result, NIL );
    }
    if( NIL != return_nautsP )
    {
      return Values.values( nat_via_open_paren_spec( string ), NIL );
    }
    return Values.values( nart_via_open_paren_spec( string ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 31094L)
  public static SubLObject related_cyc_terms_for_browsing(final SubLObject string, SubLObject terms_already_found, SubLObject limit)
  {
    if( terms_already_found == UNPROVIDED )
    {
      terms_already_found = NIL;
    }
    if( limit == UNPROVIDED )
    {
      limit = $int94$100;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ir_terms = ( NIL != $use_cyc_ir_terms_for_browsingP$.getDynamicValue( thread ) ) ? cyc_ir_terms_for_browsing( string, terms_already_found, limit ) : NIL;
    SubLObject total_count = Sequences.length( ir_terms );
    SubLObject subword_terms = NIL;
    SubLObject total_subword_count = NIL;
    SubLObject err = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym162$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          thread.resetMultipleValues();
          final SubLObject subword_terms_$73 = cyc_substring_terms_for_browsing( string, Sequences.cconcatenate( ir_terms, terms_already_found ), limit );
          final SubLObject total_subword_count_$74 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          subword_terms = subword_terms_$73;
          total_subword_count = total_subword_count_$74;
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err )
    {
      Errors.warn( $str163$Unable_to_access_subword_index___, err );
    }
    if( NIL != total_subword_count )
    {
      total_count = Numbers.add( total_count, total_subword_count );
    }
    else
    {
      total_count = NIL;
    }
    return Values.values( list_utilities.delete_if_not( Symbols.symbol_function( $sym161$TERM_OK_FOR_BROWSING_ ), Sequences.delete_duplicates( Sequences.cconcatenate( ir_terms, subword_terms ), EQUAL, UNPROVIDED,
        UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), total_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 31893L)
  public static SubLObject cyc_substring_terms_for_browsing(final SubLObject string, final SubLObject terms_already_found, SubLObject fail_if_more_than)
  {
    if( fail_if_more_than == UNPROVIDED )
    {
      fail_if_more_than = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subword_terms = NIL;
    SubLObject total_subword_count = NIL;
    thread.resetMultipleValues();
    final SubLObject subword_terms_$75 = lexicon_subword_index.denots_of_nl_trie_subword_index_search( string, fail_if_more_than, UNPROVIDED );
    final SubLObject total_subword_count_$76 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    subword_terms = subword_terms_$75;
    total_subword_count = total_subword_count_$76;
    return Values.values( conses_high.set_difference( subword_terms, terms_already_found, EQUAL, UNPROVIDED ), total_subword_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 32387L)
  public static SubLObject cyc_ir_terms_for_browsing(final SubLObject string, SubLObject terms_already_found, SubLObject limit)
  {
    if( terms_already_found == UNPROVIDED )
    {
      terms_already_found = NIL;
    }
    if( limit == UNPROVIDED )
    {
      limit = NIL;
    }
    SubLObject result = NIL;
    SubLObject total_count = NIL;
    result = Sequences.nreverse( result );
    total_count = Sequences.length( result );
    if( limit.isInteger() && NIL != list_utilities.lengthG( result, limit, UNPROVIDED ) )
    {
      result = list_utilities.first_n( limit, result );
    }
    return Values.values( result, total_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 33324L)
  public static SubLObject term_ok_for_browsingP(final SubLObject v_term)
  {
    return list_utilities.sublisp_boolean( cb_utilities.cb_term_identifier( v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 33415L)
  public static SubLObject asserts_via_open_paren_spec(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym143$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const139$EverythingPSC, thread );
      final SubLObject sentence = ke_utilities.cycl_from_string( string );
      final SubLObject assertions = czer_meta.find_assertions_cycl( sentence, UNPROVIDED );
      return assertions;
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 33625L)
  public static SubLObject nart_via_open_paren_spec(final SubLObject string)
  {
    final SubLObject v_term = ke_utilities.nat_from_string( string );
    if( NIL != nart_handles.nart_p( v_term ) )
    {
      return ConsesLow.list( v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 33770L)
  public static SubLObject nat_via_open_paren_spec(final SubLObject string)
  {
    final SubLObject v_term = ke_utilities.nat_from_string( string );
    if( NIL != v_term )
    {
      return ConsesLow.list( v_term );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 34657L)
  public static SubLObject terms_via_lexicon(final SubLObject string, SubLObject include_word_unitsP)
  {
    if( include_word_unitsP == UNPROVIDED )
    {
      include_word_unitsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.lexicon_initialized_p() && string.isString() )
    {
      SubLObject ans = NIL;
      final SubLObject monad = $const164$AllLexicalMicrotheoryPSC;
      final SubLObject anytime = ( NIL != constant_handles.valid_constantP( monad, UNPROVIDED ) ) ? hlmt_czer.canonicalize_hlmt( hlmt.new_hlmt( ConsesLow.list( monad, $const165$AnytimePSC ) ) ) : NIL;
      final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
      try
      {
        lexicon_vars.$lexicon_lookup_mt$.bind( ( NIL != anytime ) ? anytime : lexicon_vars.$lexicon_lookup_mt$.getDynamicValue( thread ), thread );
        ans = lexicon_accessors.most_denots_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != include_word_unitsP )
        {
          ans = ConsesLow.append( ans, lexicon_cache.words_of_string( string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
      }
      finally
      {
        lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
      }
      return ans;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 35521L)
  public static SubLObject constant_via_exact_name_spec(final SubLObject string)
  {
    return constant_completion_high.constant_complete( string, T, T, TWO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 35640L)
  public static SubLObject constant_via_external_id_spec(SubLObject string)
  {
    if( $int166$40.numE( Sequences.length( string ) ) )
    {
      string = Sequences.subseq( string, THREE_INTEGER, $int167$39 );
    }
    if( NIL != list_utilities.lengthE( string, $int168$36, UNPROVIDED ) && NIL != Guids.guid_string_p( string ) )
    {
      final SubLObject external_id = Guids.string_to_guid( string );
      if( NIL != external_id )
      {
        return ConsesLow.list( constants_high.find_constant_by_external_id( external_id ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 36018L)
  public static SubLObject constant_via_star_completion(final SubLObject string, SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    return constant_completion_high.constant_complete( Sequences.subseq( string, ZERO_INTEGER, Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) ), makeBoolean( NIL == case_insensitiveP ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 36202L)
  public static SubLObject constant_via_star_apropos(final SubLObject string, SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    return constant_completion_high.constant_apropos( Sequences.subseq( string, ONE_INTEGER, Numbers.subtract( Sequences.length( string ), ONE_INTEGER ) ), makeBoolean( NIL == case_insensitiveP ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 36375L)
  public static SubLObject constant_via_star_postfix(final SubLObject string, SubLObject case_insensitiveP)
  {
    if( case_insensitiveP == UNPROVIDED )
    {
      case_insensitiveP = NIL;
    }
    return constant_completion_high.constant_postfix( Sequences.subseq( string, ONE_INTEGER, Sequences.length( string ) ), makeBoolean( NIL == case_insensitiveP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 36542L)
  public static SubLObject terms_via_dwimming(final SubLObject string, SubLObject case_insensitive_grepP)
  {
    if( case_insensitive_grepP == UNPROVIDED )
    {
      case_insensitive_grepP = T;
    }
    final SubLObject exact = constant_completion_high.constant_complete( string, NIL, T, UNPROVIDED, UNPROVIDED );
    final SubLObject former = ke.old_constant_names( string );
    SubLObject denotations = NIL;
    SubLObject intermed_results = NIL;
    if( NIL != kb_control_vars.lexicon_kb_loaded_p() )
    {
      denotations = terms_via_lexicon( string, UNPROVIDED );
    }
    intermed_results = Sequences.delete_duplicates( ConsesLow.append( exact, denotations, former ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != regular_expressions.is_regular_expressions_support_availableP() && NIL == intermed_results )
    {
      intermed_results = constants_via_grep( string, makeBoolean( NIL == case_insensitive_grepP ) );
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( string ) )
    {
      intermed_results = Sequences.cconcatenate( intermed_results, assertions_for_string( string ) );
    }
    return intermed_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 37669L)
  public static SubLObject assertions_for_string(final SubLObject string)
  {
    return kb_mapping.gather_index_in_any_mt( string, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 37760L)
  public static SubLObject constants_via_grep(final SubLObject grep_string, SubLObject case_sensitiveP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject constant_grep_options = ( NIL != case_sensitiveP ) ? NIL : $list169;
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw152$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym153$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          result = constants_high.constant_grep( grep_string, constant_grep_options, UNPROVIDED );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw152$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 38332L)
  public static SubLObject cb_main_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( args.isCons() )
    {
      SubLObject current;
      final SubLObject datum = current = args;
      SubLObject indirect_handler = NIL;
      SubLObject indirect_args = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list170 );
      indirect_handler = current.first();
      current = ( indirect_args = current.rest() );
      if( indirect_handler.isString() )
      {
        indirect_handler = Strings.string_upcase( indirect_handler, UNPROVIDED, UNPROVIDED );
        final SubLObject function_symbol = Packages.find_symbol( indirect_handler, UNPROVIDED );
        if( function_symbol.isSymbol() && NIL != Symbols.fboundp( function_symbol ) && NIL != html_macros.html_handler_functionP( function_symbol ) )
        {
          return Functions.funcall( function_symbol, indirect_args );
        }
      }
    }
    cb_tools.cb_history( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 38936L)
  public static SubLObject cb_cf(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_term_frame_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 39108L)
  public static SubLObject cb_constant_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_term_frame_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 39212L)
  public static SubLObject cb_nf(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_term_frame_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 39336L)
  public static SubLObject cb_nart_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_term_frame_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 39436L)
  public static SubLObject cb_naut_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_term_frame_internal( args.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 39536L)
  public static SubLObject cb_term_frame_internal(final SubLObject term_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cb_utilities.cb_guess_term( term_spec, UNPROVIDED );
    if( NIL != v_term )
    {
      if( NIL != nart_handles.nart_p( v_term ) )
      {
        cb_tools.cb_add_to_nat_history( v_term );
      }
      else if( NIL != term.closed_nautP( v_term, UNPROVIDED ) )
      {
        if( NIL == nart_handles.nart_p( narts_high.find_nart( v_term ) ) )
        {
          cb_tools.cb_add_to_nat_history( v_term );
        }
      }
      else
      {
        cb_events.cb_post_constant_selection_event( v_term );
        cb_tools.cb_add_to_constant_history( v_term );
      }
      final SubLObject identifier = cb_utilities.cb_term_identifier( v_term );
      html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        web_utilities.possibly_add_html_javascript_redirect_when_top_level_page();
        if( NIL != html_macros.html_inside_body_p() )
        {
          Errors.error( $str4$Cannot_have_a_FRAMESET_tag_inside );
        }
        html_utilities.html_markup( html_macros.$html_frameset_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_frameset_cols$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str177$30___ );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_frame( $kw178$INDEX, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          cb_utilities.cb_frame( $kw179$CONTENT, identifier, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$77, thread );
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
    else
    {
      cb_utilities.cb_error( $str180$The_requested_term_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 40771L)
  public static SubLObject cb_index_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject index_hook = cb_utilities.cb_guess_index( args );
    if( $kw183$LEGACY == $cb_default_index_view$.getDynamicValue( thread ) && NIL != kb_indexing_datastructures.indexed_term_p( index_hook ) )
    {
      cb_browser.cb_c_index( index_hook );
    }
    else if( $kw181$INFERRED == $cb_default_index_view$.getDynamicValue( thread ) && NIL != kb_indexing_datastructures.indexed_term_p( index_hook ) )
    {
      cb_inferred_index.cb_inferred_index( index_hook );
    }
    else if( NIL != index_hook )
    {
      cb_browser.cb_c_index( index_hook );
    }
    else
    {
      final SubLObject naut = cb_utilities.cb_guess_naut( args.first(), UNPROVIDED );
      html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_naut_utilities.cb_naut_index( naut );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$79, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$78, thread );
        }
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 41354L)
  public static SubLObject cb_empty_index_frame()
  {
    html_utilities.html_princ( $str185$No_Index );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 41436L)
  public static SubLObject cb_content_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject index_hook = cb_utilities.cb_guess_index( args );
    if( NIL != forts.fort_p( index_hook ) || NIL != auxiliary_indexing.auxiliary_index_p( index_hook ) )
    {
      cb_default_content_internal( index_hook );
    }
    else
    {
      final SubLObject naut = cb_utilities.cb_guess_naut( args.first(), UNPROVIDED );
      cb_default_content_internal( naut );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 41806L)
  public static SubLObject cb_default_content_internal(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != term.closed_nautP( v_term, UNPROVIDED ) )
    {
      return cb_naut_utilities.cb_default_naut_content_internal( v_term );
    }
    if( $kw187$LEXICAL == cb_parameters.$cb_c_default_content$.getDynamicValue( thread ) )
    {
      return cb_lexical_info.cb_c_lexical_internal( v_term, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject pcase_var = cb_parameters.$cb_c_default_content$.getDynamicValue( thread );
    if( pcase_var.eql( $kw188$NONE ) )
    {
      return cb_empty_content_frame( v_term );
    }
    if( pcase_var.eql( $kw189$DEFINITIONAL ) )
    {
      return cb_browser.cb_c_definitional_internal( v_term );
    }
    if( pcase_var.eql( $kw190$DOCUMENTATION ) )
    {
      return cb_browser.cb_c_documentation_internal( v_term );
    }
    if( pcase_var.eql( $kw191$MAXIMAL ) )
    {
      return cb_c_maximal_internal( v_term );
    }
    return cb_browser.cb_c_documentation_internal( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 42405L)
  public static SubLObject cb_empty_content_frame(final SubLObject index_hook)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw3$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str192$Index_Choose );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$80 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_empty_content_frame_internal( index_hook );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$81, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$80, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 42648L)
  public static SubLObject cb_empty_content_frame_internal(final SubLObject index_hook)
  {
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str193$Choose_an_item_from_the_index_ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 42884L)
  public static SubLObject cb_c_maximal_internal(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) || bookkeeping_store.total_num_assertions_on_term( fort ).numL( cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) ) )
    {
      return cb_browser.cb_c_all_asserted_knowledge( ConsesLow.list( fort ) );
    }
    if( kb_indexing.num_index( fort ).numL( cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) ) )
    {
      return cb_browser.cb_c_total( ConsesLow.list( fort ) );
    }
    final SubLObject pred_extent_count = ( NIL != fort_types_interface.predicate_in_any_mtP( fort ) ) ? kb_indexing.num_predicate_extent_index( fort, UNPROVIDED ) : ZERO_INTEGER;
    final SubLObject func_extent_count = ( NIL != fort_types_interface.function_in_any_mtP( fort ) ) ? kb_indexing.num_function_extent_index( fort ) : ZERO_INTEGER;
    if( ( pred_extent_count.numG( ZERO_INTEGER ) || func_extent_count.numG( ZERO_INTEGER ) ) && Numbers.add( kb_indexing.num_gaf_arg_index( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ), pred_extent_count,
        func_extent_count ).numL( cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) ) )
    {
      cb_browser.cb_c_gaf_arg_and_extent( ConsesLow.list( fort ) );
      return NIL;
    }
    if( kb_indexing.num_gaf_arg_index( fort, UNPROVIDED, UNPROVIDED, UNPROVIDED ).numL( cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) ) )
    {
      return cb_browser.cb_c_gaf_arg( ConsesLow.list( fort ) );
    }
    if( kb_indexing.num_gaf_arg_index( fort, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).numL( cb_parameters.$cb_c_maximal_upper_bound$.getDynamicValue( thread ) ) )
    {
      return cb_browser.cb_c_gaf_arg( ConsesLow.list( fort, $str194$1 ) );
    }
    return cb_browser.cb_c_definitional( ConsesLow.list( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 44311L)
  public static SubLObject cb_status_frame(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    cb_server_status( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 44494L)
  public static SubLObject cb_server_status(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str0$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str1$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw2$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      if( NIL != cb_parameters.$cb_status_update_interval$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw3$CB_CYC );
        html_utilities.html_refresh( cb_parameters.$cb_status_update_interval$.getDynamicValue( thread ), UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_status_frame_guts();
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$83, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$82, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 44772L)
  public static SubLObject cb_link_server_status(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str37$Update;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw8$STATUS );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str196$cb_status_frame );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 44984L)
  public static SubLObject html_update_cb_status_script()
  {
    return html_script_utilities.html_refresh_frame_script( cb_utilities.cb_frame_name( $kw8$STATUS ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 45138L)
  public static SubLObject cb_status_element(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym199$PROGN, $list200, ConsesLow.listS( $sym201$HTML_FANCY_TABLE_DATA, $list202, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 45318L)
  public static SubLObject cb_status_frame_guts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
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
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_help();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$85, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$86, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_update_link();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$87, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$88, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_mode();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$89, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$90, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_agenda();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$91, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$92, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_kb();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$93, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        if( NIL != cb_server_show_remote_queueP() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$94, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_server_status_remote_queue();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$95, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        if( NIL != cb_server_show_local_queueP() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$96, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_server_status_local_queue();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$97, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        if( NIL != cb_server_show_aux_queueP() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$98, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_server_status_aux_queue();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$99, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        if( NIL != cb_server_show_transmit_queueP() )
        {
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_indent( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$100, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_server_status_transmit_queue();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$101, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_indent( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$102, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw48$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw29$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$103 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_server_status_system();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$103, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$84, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 46718L)
  public static SubLObject cb_server_status_help()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cb_parameters.$cb_include_help$.getDynamicValue( thread ) )
    {
      cb_utilities.cb_help( $kw203$CB_SERVER_STATUS, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 46833L)
  public static SubLObject cb_server_status_update_link()
  {
    cb_utilities.cb_link( $kw197$SERVER_STATUS, $str37$Update, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 46931L)
  public static SubLObject cb_server_status_mode()
  {
    cb_utilities.cb_link( $kw205$MODE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    final SubLObject mode = operation_communication.communication_mode();
    final SubLObject mode_name = operation_communication.communication_mode_name( mode );
    html_utilities.html_princ( mode_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 47131L)
  public static SubLObject cb_server_status_agenda()
  {
    cb_utilities.cb_link( $kw206$AGENDA, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_princ( agenda.agenda_state() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 47254L)
  public static SubLObject cb_server_status_kb()
  {
    html_utilities.html_princ_strong( $str207$KB__ );
    html_utilities.html_princ( control_vars.kb_loaded() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 47363L)
  public static SubLObject cb_server_show_remote_queueP()
  {
    return makeBoolean( operation_communication.kb_op_number().isPositive() || NIL != operation_communication.receiving_remote_operationsP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 47486L)
  public static SubLObject cb_server_status_remote_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject done = operation_communication.kb_op_number();
    final SubLObject master = transcript_utilities.total_master_transcript_operations( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
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
      final SubLObject _prev_bind_0_$104 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str25$ );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$106 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ_strong( $str208$Remote__ );
            html_utilities.html_princ( $str150$_ );
            if( done.eql( master ) )
            {
              html_utilities.html_princ( $str209$all_ );
            }
            html_utilities.html_princ( done );
            if( !done.eql( master ) )
            {
              html_utilities.html_princ( $str210$_of_ );
              html_utilities.html_princ( ( NIL != master ) ? master : $str211$___ );
            }
            html_utilities.html_princ( $str24$_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$106, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$105, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$104, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      if( master.isNumber() && !done.eql( master ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$107 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $int80$50 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$108 = html_macros.$html_safe_print$.currentBinding( thread );
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
            html_utilities.html_markup( ZERO_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$109 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              thread.resetMultipleValues();
              final SubLObject width1 = html_utilities.html_fancy_percent_progress_bar_widths( done, master, NIL );
              final SubLObject width2 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_row_height$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( TWO_INTEGER );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$110 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_light_green$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_color_light_green$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                if( NIL != width1 )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( width1 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$111 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$111, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                if( NIL != html_macros.$html_color_dark_green$.getGlobalValue() )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_bgcolor$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_color_dark_green$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                if( NIL != width2 )
                {
                  html_utilities.html_markup( html_macros.$html_table_data_width$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( width2 );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$112 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$112, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$110, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$109, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$108, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$107, thread );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 48711L)
  public static SubLObject cb_server_show_local_queueP()
  {
    return operation_queues.local_operations_anywhere();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 48797L)
  public static SubLObject cb_server_status_local_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_size = operation_queues.local_queue_size();
    final SubLObject transcript_size = operation_queues.transcript_queue_size();
    final SubLObject local_storage_size = operation_queues.local_operation_storage_queue_size();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    if( NIL != operation_queues.local_queue_empty() )
    {
      html_utilities.html_princ( $str212$Local_ );
    }
    else
    {
      cb_utilities.cb_link( $kw213$SHOW_LOCAL_OPS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( local_size.isPositive() || transcript_size.isPositive() )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str214$__d_, local_size );
      if( transcript_size.numG( ZERO_INTEGER ) )
      {
        final SubLObject color_val = $kw215$RED;
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
          PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str216$_d, transcript_size );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      }
      else
      {
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str216$_d, transcript_size );
      }
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str217$__d_, local_storage_size );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str218$__d_, local_storage_size );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 49628L)
  public static SubLObject cb_server_show_aux_queueP()
  {
    return makeBoolean( operation_queues.auxiliary_queue_size().isPositive() || operation_communication.total_auxiliary_operations_run().isPositive() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 49766L)
  public static SubLObject cb_server_status_aux_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject aux_size = operation_queues.auxiliary_queue_size();
    final SubLObject aux_total = operation_communication.total_auxiliary_operations_run();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str219$Aux__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( aux_size.isPositive() )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str220$__d__d_, aux_size, aux_total );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str218$__d_, aux_total );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 50081L)
  public static SubLObject cb_server_show_transmit_queueP()
  {
    return Numbers.plusp( operation_queues.transmit_queue_size() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 50171L)
  public static SubLObject cb_server_status_transmit_queue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject transmit_size = operation_queues.transmit_queue_size();
    html_utilities.html_princ_strong( $str221$Transmit_Pending__ );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str218$__d_, transmit_size );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-frames.lisp", position = 50369L)
  public static SubLObject cb_server_status_system()
  {
    cb_utilities.cb_link( $kw222$SYSTEM, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_princ( system_info.cyc_revision_string() );
    final SubLObject system_code_string = misc_utilities.cyc_system_code_string();
    if( NIL != string_utilities.non_empty_string_p( system_code_string ) )
    {
      html_utilities.html_indent( UNPROVIDED );
      html_utilities.html_princ( $str150$_ );
      html_utilities.html_princ( system_code_string );
      html_utilities.html_princ( $str24$_ );
    }
    return NIL;
  }

  public static SubLObject declare_cb_frames_file()
  {
    SubLFiles.declareFunction( me, "cb_start", "CB-START", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_start_redirect", "CB-START-REDIRECT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_page_title", "CB-PAGE-TITLE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_start", "CB-LINK-START", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_toolbar_frame", "CB-TOOLBAR-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_toolbar", "CB-LINK-TOOLBAR", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_toolbar_frame_guts", "CB-TOOLBAR-FRAME-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_toolbar_update_link", "CB-TOOLBAR-UPDATE-LINK", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_user_toolbar_links", "CB-USER-TOOLBAR-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "user_toolbar_links", "USER-TOOLBAR-LINKS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_specify_input", "CB-SPECIFY-INPUT", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_link_cb_specify_all", "CB-LINK-CB-SPECIFY-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_specify", "CB-HANDLE-SPECIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_wn_synsets_from_query", "CB-WN-SYNSETS-FROM-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_term_choices", "CB-TERM-CHOICES", 4, 2, false );
    SubLFiles.declareFunction( me, "cb_display_wn_synsets_section", "CB-DISPLAY-WN-SYNSETS-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_display_term_section", "CB-DISPLAY-TERM-SECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_display_term_section_with_gloss", "CB-DISPLAY-TERM-SECTION-WITH-GLOSS", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_display_term_section_sans_gloss", "CB-DISPLAY-TERM-SECTION-SANS-GLOSS", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_display_term_choice", "CB-DISPLAY-TERM-CHOICE", 1, 1, false );
    SubLFiles.declareFunction( me, "compute_gloss_for_term_to_display", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_gloss_for_term_to_display_english_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_gloss_for_term_to_display_english", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_gloss_for_term_to_display_cycl_internal", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_gloss_for_term_to_display_cycl", "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL", 1, 0, false );
    SubLFiles.declareFunction( me, "reserved_browser_string_p", "RESERVED-BROWSER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "reserved_wn_browser_string_p", "RESERVED-WN-BROWSER-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "terms_for_browsing", "TERMS-FOR-BROWSING", 1, 2, false );
    SubLFiles.declareFunction( me, "related_cyc_terms_for_browsing", "RELATED-CYC-TERMS-FOR-BROWSING", 1, 2, false );
    SubLFiles.declareFunction( me, "cyc_substring_terms_for_browsing", "CYC-SUBSTRING-TERMS-FOR-BROWSING", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_ir_terms_for_browsing", "CYC-IR-TERMS-FOR-BROWSING", 1, 2, false );
    SubLFiles.declareFunction( me, "term_ok_for_browsingP", "TERM-OK-FOR-BROWSING?", 1, 0, false );
    SubLFiles.declareFunction( me, "asserts_via_open_paren_spec", "ASSERTS-VIA-OPEN-PAREN-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_via_open_paren_spec", "NART-VIA-OPEN-PAREN-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "nat_via_open_paren_spec", "NAT-VIA-OPEN-PAREN-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "terms_via_lexicon", "TERMS-VIA-LEXICON", 1, 1, false );
    SubLFiles.declareFunction( me, "constant_via_exact_name_spec", "CONSTANT-VIA-EXACT-NAME-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_via_external_id_spec", "CONSTANT-VIA-EXTERNAL-ID-SPEC", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_via_star_completion", "CONSTANT-VIA-STAR-COMPLETION", 1, 1, false );
    SubLFiles.declareFunction( me, "constant_via_star_apropos", "CONSTANT-VIA-STAR-APROPOS", 1, 1, false );
    SubLFiles.declareFunction( me, "constant_via_star_postfix", "CONSTANT-VIA-STAR-POSTFIX", 1, 1, false );
    SubLFiles.declareFunction( me, "terms_via_dwimming", "TERMS-VIA-DWIMMING", 1, 1, false );
    SubLFiles.declareFunction( me, "assertions_for_string", "ASSERTIONS-FOR-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "constants_via_grep", "CONSTANTS-VIA-GREP", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_main_frame", "CB-MAIN-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_cf", "CB-CF", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_constant_frame", "CB-CONSTANT-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_nf", "CB-NF", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_nart_frame", "CB-NART-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_naut_frame", "CB-NAUT-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_term_frame_internal", "CB-TERM-FRAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_index_frame", "CB-INDEX-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_empty_index_frame", "CB-EMPTY-INDEX-FRAME", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_content_frame", "CB-CONTENT-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_default_content_internal", "CB-DEFAULT-CONTENT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_empty_content_frame", "CB-EMPTY-CONTENT-FRAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_empty_content_frame_internal", "CB-EMPTY-CONTENT-FRAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_c_maximal_internal", "CB-C-MAXIMAL-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_status_frame", "CB-STATUS-FRAME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_server_status", "CB-SERVER-STATUS", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_server_status", "CB-LINK-SERVER-STATUS", 0, 1, false );
    SubLFiles.declareFunction( me, "html_update_cb_status_script", "HTML-UPDATE-CB-STATUS-SCRIPT", 0, 0, false );
    SubLFiles.declareMacro( me, "cb_status_element", "CB-STATUS-ELEMENT" );
    SubLFiles.declareFunction( me, "cb_status_frame_guts", "CB-STATUS-FRAME-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_help", "CB-SERVER-STATUS-HELP", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_update_link", "CB-SERVER-STATUS-UPDATE-LINK", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_mode", "CB-SERVER-STATUS-MODE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_agenda", "CB-SERVER-STATUS-AGENDA", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_kb", "CB-SERVER-STATUS-KB", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_show_remote_queueP", "CB-SERVER-SHOW-REMOTE-QUEUE?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_remote_queue", "CB-SERVER-STATUS-REMOTE-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_show_local_queueP", "CB-SERVER-SHOW-LOCAL-QUEUE?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_local_queue", "CB-SERVER-STATUS-LOCAL-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_show_aux_queueP", "CB-SERVER-SHOW-AUX-QUEUE?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_aux_queue", "CB-SERVER-STATUS-AUX-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_show_transmit_queueP", "CB-SERVER-SHOW-TRANSMIT-QUEUE?", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_transmit_queue", "CB-SERVER-STATUS-TRANSMIT-QUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_server_status_system", "CB-SERVER-STATUS-SYSTEM", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_frames_file()
  {
    $cb_name$ = SubLFiles.deflexical( "*CB-NAME*", $str21$ResearchCyc );
    $cb_toolbar_restrict_to_user_toolsP$ = SubLFiles.defparameter( "*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*", red_infrastructure_macros.red_def_helper( $list33.isSymbol() ? Symbols.symbol_value( $list33 ) : $list33,
        $sym34$_CB_TOOLBAR_RESTRICT_TO_USER_TOOLS__, NIL.isSymbol() ? Symbols.symbol_value( NIL ) : NIL, $kw35$PARAMETER, UNPROVIDED ) );
    $maximum_image_purpose_display_length$ = SubLFiles.deflexical( "*MAXIMUM-IMAGE-PURPOSE-DISPLAY-LENGTH*", $int58$25 );
    $cb_user_toolbar_links_for_opencyc$ = SubLFiles.deflexical( "*CB-USER-TOOLBAR-LINKS-FOR-OPENCYC*", $list59 );
    $cb_specify_show_gloss_options_text$ = SubLFiles.deflexical( "*CB-SPECIFY-SHOW-GLOSS-OPTIONS-TEXT*", $list67 );
    $cb_specify_show_gloss_options$ = SubLFiles.deflexical( "*CB-SPECIFY-SHOW-GLOSS-OPTIONS*", $list68 );
    $cb_search_autocomplete_enabled$ = SubLFiles.defparameter( "*CB-SEARCH-AUTOCOMPLETE-ENABLED*", T );
    $compute_gloss_max_clarifying_sentences$ = SubLFiles.deflexical( "*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*", ( maybeDefault( $sym137$_COMPUTE_GLOSS_MAX_CLARIFYING_SENTENCES_, $compute_gloss_max_clarifying_sentences$,
        THREE_INTEGER ) ) );
    $use_cyc_ir_terms_for_browsingP$ = SubLFiles.defparameter( "*USE-CYC-IR-TERMS-FOR-BROWSING?*", NIL );
    $cb_default_index_view$ = SubLFiles.defvar( "*CB-DEFAULT-INDEX-VIEW*", $kw183$LEGACY );
    return NIL;
  }

  public static SubLObject setup_cb_frames_file()
  {
    html_macros.note_cgi_handler_function( $sym12$CB_START, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym20$CB_START_REDIRECT, $kw13$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw31$START, $sym32$CB_LINK_START, ONE_INTEGER );
    html_macros.note_cgi_handler_function( $sym36$CB_TOOLBAR_FRAME, $kw13$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw6$TOOLBAR, $sym39$CB_LINK_TOOLBAR, ONE_INTEGER );
    Hashtables.sethash( $kw40$OPENCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str41$opencyc_logo_60_gif, $str42$OpenCyc_Browser ) );
    Hashtables.sethash( $kw43$RESEARCHCYC_60, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str44$cyc_logo_violet_60_gif, $str45$ResearchCyc_Browser ) );
    Hashtables.sethash( $kw46$CB_TOOLBAR_FRAME, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str47$cb_toolbar_frame_html, NIL ) );
    utilities_macros.register_html_state_variable( $sym69$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ );
    utilities_macros.register_html_interface_variable( $sym69$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ );
    cb_utilities.setup_cb_link_method( $kw88$CB_SPECIFY_ALL, $sym89$CB_LINK_CB_SPECIFY_ALL, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym98$CB_HANDLE_SPECIFY, $kw13$HTML_HANDLER );
    subl_macro_promotions.declare_defglobal( $sym137$_COMPUTE_GLOSS_MAX_CLARIFYING_SENTENCES_ );
    memoization_state.note_memoized_function( $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH );
    memoization_state.note_memoized_function( $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL );
    html_macros.note_cgi_handler_function( $sym171$CB_MAIN_FRAME, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym172$CB_CF, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym173$CB_CONSTANT_FRAME, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym174$CB_NF, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym175$CB_NART_FRAME, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym176$CB_NAUT_FRAME, $kw13$HTML_HANDLER );
    utilities_macros.register_html_state_variable( $sym182$_CB_DEFAULT_INDEX_VIEW_ );
    utilities_macros.register_html_interface_variable( $sym182$_CB_DEFAULT_INDEX_VIEW_ );
    html_macros.note_cgi_handler_function( $sym184$CB_INDEX_FRAME, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym186$CB_CONTENT_FRAME, $kw13$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym195$CB_STATUS_FRAME, $kw13$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw197$SERVER_STATUS, $sym198$CB_LINK_SERVER_STATUS, ONE_INTEGER );
    Hashtables.sethash( $kw203$CB_SERVER_STATUS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str204$cb_server_status_html, NIL ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_frames_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_frames_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_frames_file();
  }
  static
  {
    me = new cb_frames();
    $cb_name$ = null;
    $cb_toolbar_restrict_to_user_toolsP$ = null;
    $maximum_image_purpose_display_length$ = null;
    $cb_user_toolbar_links_for_opencyc$ = null;
    $cb_specify_show_gloss_options_text$ = null;
    $cb_specify_show_gloss_options$ = null;
    $cb_search_autocomplete_enabled$ = null;
    $compute_gloss_max_clarifying_sentences$ = null;
    $use_cyc_ir_terms_for_browsingP$ = null;
    $cb_default_index_view$ = null;
    $str0$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str1$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw2$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw3$CB_CYC = makeKeyword( "CB-CYC" );
    $str4$Cannot_have_a_FRAMESET_tag_inside = makeString( "Cannot have a FRAMESET tag inside a BODY tag." );
    $str5$75___50 = makeString( "75,*,50" );
    $kw6$TOOLBAR = makeKeyword( "TOOLBAR" );
    $kw7$MAIN = makeKeyword( "MAIN" );
    $kw8$STATUS = makeKeyword( "STATUS" );
    $str9$You_must_have_frames_enabled_to_u = makeString( "You must have frames enabled to use Cyc.  Please either enable frames in your web browser or disable frame support in the Cyc browser at the " );
    $kw10$OPTIONS = makeKeyword( "OPTIONS" );
    $str11$_page_ = makeString( " page." );
    $sym12$CB_START = makeSymbol( "CB-START" );
    $kw13$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str14$Refresh = makeString( "Refresh" );
    $str15$0__url__cgi_bin_cg_cb_start = makeString( "0; url=/cgi-bin/cg?cb-start" );
    $str16$If_you_see_this__please_follow_ = makeString( "If you see this, please follow " );
    $str17$_cgi_bin_cg_cb_start = makeString( "/cgi-bin/cg?cb-start" );
    $str18$this_link = makeString( "this link" );
    $str19$_ = makeString( "." );
    $sym20$CB_START_REDIRECT = makeSymbol( "CB-START-REDIRECT" );
    $str21$ResearchCyc = makeString( "ResearchCyc" );
    $str22$__ = makeString( " (" );
    $str23$_ = makeString( " " );
    $str24$_ = makeString( ")" );
    $str25$ = makeString( "" );
    $str26$___ = makeString( " - " );
    $str27$_A_A_A = makeString( "~A~A~A" );
    $str28$KB_Browser = makeString( "KB Browser" );
    $kw29$TOP = makeKeyword( "TOP" );
    $str30$cb_start = makeString( "cb-start" );
    $kw31$START = makeKeyword( "START" );
    $sym32$CB_LINK_START = makeSymbol( "CB-LINK-START" );
    $list33 = ConsesLow.list( makeString( "system.common.browser.tools.cb-toolbar-restrict-to-user-tools?" ) );
    $sym34$_CB_TOOLBAR_RESTRICT_TO_USER_TOOLS__ = makeSymbol( "*CB-TOOLBAR-RESTRICT-TO-USER-TOOLS?*" );
    $kw35$PARAMETER = makeKeyword( "PARAMETER" );
    $sym36$CB_TOOLBAR_FRAME = makeSymbol( "CB-TOOLBAR-FRAME" );
    $str37$Update = makeString( "Update" );
    $str38$cb_toolbar_frame = makeString( "cb-toolbar-frame" );
    $sym39$CB_LINK_TOOLBAR = makeSymbol( "CB-LINK-TOOLBAR" );
    $kw40$OPENCYC_60 = makeKeyword( "OPENCYC-60" );
    $str41$opencyc_logo_60_gif = makeString( "opencyc-logo-60.gif" );
    $str42$OpenCyc_Browser = makeString( "OpenCyc Browser" );
    $kw43$RESEARCHCYC_60 = makeKeyword( "RESEARCHCYC-60" );
    $str44$cyc_logo_violet_60_gif = makeString( "cyc-logo-violet-60.gif" );
    $str45$ResearchCyc_Browser = makeString( "ResearchCyc Browser" );
    $kw46$CB_TOOLBAR_FRAME = makeKeyword( "CB-TOOLBAR-FRAME" );
    $str47$cb_toolbar_frame_html = makeString( "cb-toolbar-frame.html" );
    $kw48$LEFT = makeKeyword( "LEFT" );
    $kw49$NBSP = makeKeyword( "NBSP" );
    $str50$50_ = makeString( "50%" );
    $str51$You_are__ = makeString( "You are: " );
    $kw52$LOGOUT = makeKeyword( "LOGOUT" );
    $str53$Server__ = makeString( "Server: " );
    $str54$unknown = makeString( "unknown" );
    $str55$_ = makeString( ":" );
    $str56$___ = makeString( "..." );
    $str57$Purpose__ = makeString( "Purpose: " );
    $int58$25 = makeInteger( 25 );
    $list59 = ConsesLow.list( makeKeyword( "HISTORY" ), makeKeyword( "CREATE" ), makeKeyword( "ASSERT" ), makeKeyword( "COMPOSE" ), makeKeyword( "QUERY" ), makeKeyword( "DOC" ) );
    $sym60$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym61$CB_LINK_METHOD = makeSymbol( "CB-LINK-METHOD" );
    $sym62$STRINGP = makeSymbol( "STRINGP" );
    $sym63$CB_TOOL_ABBREVIATION = makeSymbol( "CB-TOOL-ABBREVIATION" );
    $sym64$STRING_ = makeSymbol( "STRING<" );
    $str65$Tools = makeString( "Tools" );
    $kw66$TOOLS = makeKeyword( "TOOLS" );
    $list67 = ConsesLow.list( makeString( "No gloss" ), makeString( "English gloss" ), makeString( "CycL gloss" ) );
    $list68 = ConsesLow.list( makeSymbol( "NONE" ), makeSymbol( "ENGLISH" ), makeSymbol( "CYCL" ) );
    $sym69$_CB_SEARCH_AUTOCOMPLETE_ENABLED_ = makeSymbol( "*CB-SEARCH-AUTOCOMPLETE-ENABLED*" );
    $str70$98_ = makeString( "98%" );
    $str71$cb_handle_specify = makeString( "cb-handle-specify" );
    $str72$handler = makeString( "handler" );
    $str73$cb_cf = makeString( "cb-cf" );
    $str74$arg_done = makeString( "arg-done" );
    $str75$constant_complete = makeString( "constant-complete" );
    $str76$autocomplete = makeString( "autocomplete" );
    $str77$query = makeString( "query" );
    $str78$completeContainer = makeString( "completeContainer" );
    $str79$inputBox = makeString( "inputBox" );
    $int80$50 = makeInteger( 50 );
    $const81$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $str82$Search = makeString( "Search" );
    $str83$gloss_required = makeString( "gloss-required" );
    $kw84$RIGHT = makeKeyword( "RIGHT" );
    $kw85$CYC_MAIN = makeKeyword( "CYC-MAIN" );
    $str86$cb_handle_specify_query__A_everyt = makeString( "cb-handle-specify&query=~A&everything=t" );
    $str87$_A_results = makeString( "~A results" );
    $kw88$CB_SPECIFY_ALL = makeKeyword( "CB-SPECIFY-ALL" );
    $sym89$CB_LINK_CB_SPECIFY_ALL = makeSymbol( "CB-LINK-CB-SPECIFY-ALL" );
    $sym90$NONE = makeSymbol( "NONE" );
    $str91$lucky = makeString( "lucky" );
    $str92$case_insensitive = makeString( "case-insensitive" );
    $str93$everything = makeString( "everything" );
    $int94$100 = makeInteger( 100 );
    $sym95$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $str96$Can_t_determine_a_Cyc_term_from__ = makeString( "Can't determine a Cyc term from ~s." );
    $str97$Please_enter_a_non_empty_string_ = makeString( "Please enter a non-empty string." );
    $sym98$CB_HANDLE_SPECIFY = makeSymbol( "CB-HANDLE-SPECIFY" );
    $sym99$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $str100$WordNet_search_results_for__ = makeString( "WordNet search results for \"" );
    $str101$wn_ = makeString( "wn " );
    $str102$_ = makeString( "\"" );
    $str103$Search_results_for__ = makeString( "Search results for \"" );
    $str104$_A_matching_term_found_ = makeString( "~A matching term found:" );
    $str105$_A_matching_terms_found_ = makeString( "~A matching terms found:" );
    $str106$_A_matching_WordNet_synsets_found = makeString( "~A matching WordNet synsets found:" );
    $str107$No_matching_WordNet_synsets_found = makeString( "No matching WordNet synsets found:" );
    $str108$No_matching_terms_found_ = makeString( "No matching terms found." );
    $str109$See_also_ = makeString( "See also:" );
    $str110$But_see_ = makeString( "But see:" );
    $kw111$HTML = makeKeyword( "HTML" );
    $kw112$NEW = makeKeyword( "NEW" );
    $str113$__1__A_of_approximately_ = makeString( " (1-~A of approximately " );
    $sym114$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $sym115$NAUT_P = makeSymbol( "NAUT-P" );
    $const116$Noun = constant_handles.reader_make_constant_shell( makeString( "Noun" ) );
    $const117$Verb = constant_handles.reader_make_constant_shell( makeString( "Verb" ) );
    $const118$Adjective = constant_handles.reader_make_constant_shell( makeString( "Adjective" ) );
    $const119$Adverb = constant_handles.reader_make_constant_shell( makeString( "Adverb" ) );
    $str120$WordNet_Noun_Synonym_Sets__in_Ord = makeString( "WordNet Noun Synonym Sets, in Order of Frequency" );
    $str121$post = makeString( "post" );
    $str122$wni_try_concept_match = makeString( "wni-try-concept-match" );
    $str123$synset_id = makeString( "synset-id" );
    $str124$WordNet_Verb_Synonym_Sets__in_Ord = makeString( "WordNet Verb Synonym Sets, in Order of Frequency" );
    $str125$WordNet_Adjective_Synonym_Sets__i = makeString( "WordNet Adjective Synonym Sets, in Order of Frequency" );
    $str126$WordNet_Adverb_Synonym_Sets__in_O = makeString( "WordNet Adverb Synonym Sets, in Order of Frequency" );
    $str127$Other_WordNet_SynSets = makeString( "Other WordNet SynSets" );
    $sym128$ISA_COLLECTION_ = makeSymbol( "ISA-COLLECTION?" );
    $sym129$ISA_RELATION_ = makeSymbol( "ISA-RELATION?" );
    $sym130$ASSERTION_CONS = makeSymbol( "ASSERTION-CONS" );
    $str131$Collections = makeString( "Collections" );
    $str132$Relations = makeString( "Relations" );
    $str133$Individuals = makeString( "Individuals" );
    $str134$Assertions = makeString( "Assertions" );
    $str135$__ = makeString( ": " );
    $sym136$ENGLISH = makeSymbol( "ENGLISH" );
    $sym137$_COMPUTE_GLOSS_MAX_CLARIFYING_SENTENCES_ = makeSymbol( "*COMPUTE-GLOSS-MAX-CLARIFYING-SENTENCES*" );
    $sym138$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_ENGLISH = makeSymbol( "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-ENGLISH" );
    $const139$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const140$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $int141$10000 = makeInteger( 10000 );
    $sym142$COMPUTE_GLOSS_FOR_TERM_TO_DISPLAY_CYCL = makeSymbol( "COMPUTE-GLOSS-FOR-TERM-TO-DISPLAY-CYCL" );
    $sym143$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $str144$a_ = makeString( "a " );
    $str145$d_ = makeString( "d " );
    $str146$c_ = makeString( "c " );
    $str147$n_ = makeString( "n " );
    $str148$_G_ = makeString( "#G\"" );
    $str149$Empty_string_results_in_no_consta = makeString( "Empty string results in no constants found." );
    $str150$_ = makeString( "(" );
    $str151$___ = makeString( "#<(" );
    $kw152$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym153$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym154$_EXIT = makeSymbol( "%EXIT" );
    $str155$__ = makeString( "#$" );
    $str156$_ = makeString( "*" );
    $str157$__ = makeString( ".*" );
    $str158$Cannot_handle_pattern___string___ = makeString( "Cannot handle pattern *[string]* if [string] is under 5 characters." );
    $str159$Cannot_handle_pattern___string__i = makeString( "Cannot handle pattern *[string] if [string] is under 4 characters." );
    $str160$Cannot_handle_pattern__string___i = makeString( "Cannot handle pattern [string]* if [string] is under 3 characters." );
    $sym161$TERM_OK_FOR_BROWSING_ = makeSymbol( "TERM-OK-FOR-BROWSING?" );
    $sym162$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str163$Unable_to_access_subword_index___ = makeString( "Unable to access subword-index: ~S" );
    $const164$AllLexicalMicrotheoryPSC = constant_handles.reader_make_constant_shell( makeString( "AllLexicalMicrotheoryPSC" ) );
    $const165$AnytimePSC = constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) );
    $int166$40 = makeInteger( 40 );
    $int167$39 = makeInteger( 39 );
    $int168$36 = makeInteger( 36 );
    $list169 = ConsesLow.list( makeKeyword( "CASELESS" ) );
    $list170 = ConsesLow.cons( makeSymbol( "INDIRECT-HANDLER" ), makeSymbol( "INDIRECT-ARGS" ) );
    $sym171$CB_MAIN_FRAME = makeSymbol( "CB-MAIN-FRAME" );
    $sym172$CB_CF = makeSymbol( "CB-CF" );
    $sym173$CB_CONSTANT_FRAME = makeSymbol( "CB-CONSTANT-FRAME" );
    $sym174$CB_NF = makeSymbol( "CB-NF" );
    $sym175$CB_NART_FRAME = makeSymbol( "CB-NART-FRAME" );
    $sym176$CB_NAUT_FRAME = makeSymbol( "CB-NAUT-FRAME" );
    $str177$30___ = makeString( "30%,*" );
    $kw178$INDEX = makeKeyword( "INDEX" );
    $kw179$CONTENT = makeKeyword( "CONTENT" );
    $str180$The_requested_term_is_not_availab = makeString( "The requested term is not available." );
    $kw181$INFERRED = makeKeyword( "INFERRED" );
    $sym182$_CB_DEFAULT_INDEX_VIEW_ = makeSymbol( "*CB-DEFAULT-INDEX-VIEW*" );
    $kw183$LEGACY = makeKeyword( "LEGACY" );
    $sym184$CB_INDEX_FRAME = makeSymbol( "CB-INDEX-FRAME" );
    $str185$No_Index = makeString( "No Index" );
    $sym186$CB_CONTENT_FRAME = makeSymbol( "CB-CONTENT-FRAME" );
    $kw187$LEXICAL = makeKeyword( "LEXICAL" );
    $kw188$NONE = makeKeyword( "NONE" );
    $kw189$DEFINITIONAL = makeKeyword( "DEFINITIONAL" );
    $kw190$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $kw191$MAXIMAL = makeKeyword( "MAXIMAL" );
    $str192$Index_Choose = makeString( "Index Choose" );
    $str193$Choose_an_item_from_the_index_ = makeString( "Choose an item from the index." );
    $str194$1 = makeString( "1" );
    $sym195$CB_STATUS_FRAME = makeSymbol( "CB-STATUS-FRAME" );
    $str196$cb_status_frame = makeString( "cb-status-frame" );
    $kw197$SERVER_STATUS = makeKeyword( "SERVER-STATUS" );
    $sym198$CB_LINK_SERVER_STATUS = makeSymbol( "CB-LINK-SERVER-STATUS" );
    $sym199$PROGN = makeSymbol( "PROGN" );
    $list200 = ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-INDENT" ) ) );
    $sym201$HTML_FANCY_TABLE_DATA = makeSymbol( "HTML-FANCY-TABLE-DATA" );
    $list202 = ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "LEFT" ), makeKeyword( "VALIGN" ), makeKeyword( "TOP" ), makeKeyword( "NOWRAP" ), T );
    $kw203$CB_SERVER_STATUS = makeKeyword( "CB-SERVER-STATUS" );
    $str204$cb_server_status_html = makeString( "cb-server-status.html" );
    $kw205$MODE = makeKeyword( "MODE" );
    $kw206$AGENDA = makeKeyword( "AGENDA" );
    $str207$KB__ = makeString( "KB: " );
    $str208$Remote__ = makeString( "Remote: " );
    $str209$all_ = makeString( "all " );
    $str210$_of_ = makeString( " of " );
    $str211$___ = makeString( "???" );
    $str212$Local_ = makeString( "Local:" );
    $kw213$SHOW_LOCAL_OPS = makeKeyword( "SHOW-LOCAL-OPS" );
    $str214$__d_ = makeString( "(~d " );
    $kw215$RED = makeKeyword( "RED" );
    $str216$_d = makeString( "~d" );
    $str217$__d_ = makeString( " ~d)" );
    $str218$__d_ = makeString( "(~d)" );
    $str219$Aux__ = makeString( "Aux: " );
    $str220$__d__d_ = makeString( "(~d ~d)" );
    $str221$Transmit_Pending__ = makeString( "Transmit Pending: " );
    $kw222$SYSTEM = makeKeyword( "SYSTEM" );
  }
}
/*
 *
 * Total time: 1923 ms
 *
 */