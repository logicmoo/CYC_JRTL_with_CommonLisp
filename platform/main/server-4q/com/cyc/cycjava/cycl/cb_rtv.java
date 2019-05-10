package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rtv;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_rtv
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_rtv";
  public static final String myFingerPrint = "58deacc99f0e953d57b8faa9d7c8dc205ba788e108037247f50e444ef4664c5d";
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1449L)
  private static SubLSymbol $cb_rtv_fort_generation_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1774L)
  private static SubLSymbol $cb_rtv_fort_parse_fn$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1966L)
  private static SubLSymbol $rtv_default_query_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2140L)
  public static SubLSymbol $cb_rtv_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3107L)
  public static SubLSymbol $cb_rtv_ask_results$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3217L)
  public static SubLSymbol $cb_rtv_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17604L)
  private static SubLSymbol $cb_rtv_meta_support_level$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17880L)
  private static SubLSymbol $cb_rtv_meta_support_max$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  private static SubLSymbol $cb_rtv_graph_keys$;
  private static final SubLString $str0$RTV;
  private static final SubLSymbol $kw1$MAIN;
  private static final SubLString $str2$cb_rtv;
  private static final SubLSymbol $kw3$RTV_QUERY;
  private static final SubLSymbol $sym4$CB_LINK_RTV_QUERY;
  private static final SubLString $str5$relatedToVia_Query_Tool;
  private static final SubLSymbol $sym6$GENERATE_PHRASE;
  private static final SubLSymbol $kw7$NL;
  private static final SubLSymbol $sym8$FORT_TO_STRING;
  private static final SubLSymbol $sym9$TERMS_FOR_BROWSING;
  private static final SubLObject $const10$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym11$_CB_RTV_PREDICATES_;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$_CB_RTV_ASK_RESULTS_;
  private static final SubLSymbol $sym14$_CB_RTV_COLLECTIONS_;
  private static final SubLSymbol $sym15$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const16$EverythingPSC;
  private static final SubLObject $const17$RTVDemoCollection;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$MT;
  private static final SubLSymbol $kw20$RESET;
  private static final SubLString $str21$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str22$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw23$UNINITIALIZED;
  private static final SubLSymbol $kw24$TERM1;
  private static final SubLObject $const25$Individual;
  private static final SubLSymbol $kw26$TERM2_TYPE;
  private static final SubLSymbol $kw27$INDIVIDUAL;
  private static final SubLSymbol $kw28$TERM2;
  private static final SubLSymbol $kw29$ISA;
  private static final SubLSymbol $kw30$GENL;
  private static final SubLSymbol $kw31$TERM2_ADD_TYPE;
  private static final SubLObject $const32$Collection;
  private static final SubLSymbol $kw33$TERM2_VARIABLE_TYPE;
  private static final SubLSymbol $kw34$PRED;
  private static final SubLObject $const35$genls;
  private static final SubLSymbol $kw36$NUM;
  private static final SubLSymbol $kw37$NEW_PRED;
  private static final SubLObject $const38$Predicate;
  private static final SubLSymbol $kw39$REMOVE_PREDS;
  private static final SubLSymbol $kw40$PREDICATES;
  private static final SubLSymbol $kw41$ON;
  private static final SubLSymbol $kw42$GENL_PRED_REASONING;
  private static final SubLObject $const43$Microtheory;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$_ANY;
  private static final SubLObject $const46$TheSet;
  private static final SubLSymbol $kw47$DEPTH;
  private static final SubLObject $const48$relatedToVia;
  private static final SubLObject $const49$isa;
  private static final SubLObject $const50$Thing;
  private static final SubLObject $const51$and;
  private static final SubLSymbol $kw52$ASK_FORMULA;
  private static final SubLString $str53$___;
  private static final SubLSymbol $sym54$STRING_;
  private static final SubLSymbol $sym55$SYMBOL_NAME;
  private static final SubLSymbol $kw56$RUN_QUERY;
  private static final SubLString $str57$cg;
  private static final SubLString $str58$How_can_the_individual_named_;
  private static final SubLSymbol $kw59$NBSP;
  private static final SubLString $str60$be_connected_to_;
  private static final SubLSymbol $kw61$KEYWORD;
  private static final SubLString $str62$onChange_javascript_this_form_sub;
  private static final SubLSymbol $kw63$DEFAULT;
  private static final SubLString $str64$the_individual_named;
  private static final SubLString $str65$any;
  private static final SubLString $str66$any_type_of;
  private static final SubLSymbol $kw67$FORT;
  private static final SubLString $str68$___;
  private static final SubLString $str69$by_at_most;
  private static final SubLString $str70$links_using_;
  private static final SubLString $str71$_the_selected_relations_and_their;
  private static final SubLSymbol $kw72$OFF;
  private static final SubLString $str73$_only_the_selected_relations_;
  private static final SubLSymbol $kw74$CENTER;
  private static final SubLSymbol $kw75$RED;
  private static final SubLString $str76$_;
  private static final SubLString $str77$________Add_New_Relation;
  private static final SubLSymbol $kw78$ADD_PRED;
  private static final SubLString $str79$_____Remove_Selected_Relations;
  private static final SubLSymbol $kw80$RTV_PREDICATE_GRAPH_EVENT;
  private static final SubLString $str81$_Visualize_Selected_Relations_;
  private static final SubLString $str82$in_the_context_;
  private static final SubLString $str83$Current_query_formula____A;
  private static final SubLSymbol $sym84$BOOLEANP;
  private static final SubLSymbol $sym85$CB_RTV;
  private static final SubLSymbol $kw86$HTML_HANDLER;
  private static final SubLString $str87$Update;
  private static final SubLSymbol $kw88$UPDATE;
  private static final SubLString $str89$Run_This_Query;
  private static final SubLString $str90$Reset_Completely;
  private static final SubLString $str91$No_answers_found_;
  private static final SubLString $str92$Query_Results;
  private static final SubLSymbol $kw93$RTV_GRAPH_EVENT;
  private static final SubLString $str94$_Visualize_below_justification_;
  private static final SubLString $str95$_Visualize_more_justifications_;
  private static final SubLSymbol $kw96$EXPANDED_NODE_TO_NODE;
  private static final SubLString $str97$_Visualize_justifications_of_all_;
  private static final SubLList $list98;
  private static final SubLString $str99$True__;
  private static final SubLSymbol $kw100$RTV_JUSTIFY_TERM;
  private static final SubLString $str101$_Explain_;
  private static final SubLString $str102$_Visualize_;
  private static final SubLSymbol $sym103$CB_RTV_JUSTIFY_TERM;
  private static final SubLSymbol $kw104$TERM;
  private static final SubLSymbol $kw105$CB_CYC;
  private static final SubLSymbol $kw106$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw107$SHA1;
  private static final SubLString $str108$yui_skin_sam;
  private static final SubLString $str109$reloadFrameButton;
  private static final SubLString $str110$button;
  private static final SubLString $str111$reload;
  private static final SubLString $str112$Refresh_Frames;
  private static final SubLString $str113$1;
  private static final SubLSymbol $sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW;
  private static final SubLSymbol $kw115$SIGNATURE;
  private static final SubLString $str116$justify_me;
  private static final SubLString $str117$cb_rtv_justify_term;
  private static final SubLSymbol $sym118$CB_LINK_RTV_JUSTIFY_TERM;
  private static final SubLString $str119$window_open__;
  private static final SubLString $str120$__;
  private static final SubLString $str121$__A_;
  private static final SubLString $str122$null;
  private static final SubLString $str123$___A____;
  private static final SubLString $str124$dependent_yes_height_360_width_64;
  private static final SubLString $str125$return_false_;
  private static final SubLSymbol $sym126$HTML_TABLE_ROW;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$HTML_TABLE_DATA;
  private static final SubLString $str129$meta_supports_;
  private static final SubLString $str130$text_css;
  private static final SubLString $str131$screen;
  private static final SubLString $str132$none;
  private static final SubLString $str133$;
  private static final SubLSymbol $kw134$INVISIBLE;
  private static final SubLSymbol $kw135$TEXT;
  private static final SubLString $str136$_A_meta__D;
  private static final SubLString $str137$support;
  private static final SubLString $str138$additional_supports_;
  private static final SubLString $str139$Additional_Supports;
  private static final SubLSymbol $kw140$VISIBLE;
  private static final SubLString $str141$_A_additional__D;
  private static final SubLString $str142$_A__D;
  private static final SubLString $str143$_A_;
  private static final SubLString $str144$_A_D;
  private static final SubLSymbol $kw145$TOP;
  private static final SubLString $str146$_S_;
  private static final SubLSymbol $kw147$RTV;
  private static final SubLList $list148;
  private static final SubLSymbol $kw149$FORTS;
  private static final SubLSymbol $kw150$PREDS;
  private static final SubLSymbol $kw151$FILTER_PRED;
  private static final SubLSymbol $kw152$GENLS;
  private static final SubLSymbol $kw153$FILTER_FORT;
  private static final SubLSymbol $kw154$GRAPH_TYPE;
  private static final SubLString $str155$_A;
  private static final SubLInteger $int156$30;
  private static final SubLString $str157$cb_rtv_graph_event;
  private static final SubLSymbol $sym158$CB_LINK_RTV_GRAPH_EVENT;
  private static final SubLSymbol $sym159$CB_RTV_GRAPH_EVENT_PROCESS;
  private static final SubLSymbol $sym160$CB_RTV_GRAPH_EVENT;
  private static final SubLSymbol $kw161$BUILDER_FN;
  private static final SubLSymbol $sym162$BBF_RTV_ALL_EDGES_BETWEEN;
  private static final SubLSymbol $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING;
  private static final SubLSymbol $kw164$PARAMS;
  private static final SubLSymbol $kw165$FORMULA;
  private static final SubLList $list166;
  private static final SubLObject $const167$genlPreds;
  private static final SubLSymbol $sym168$BBF_RTV_ALL_EDGES_FROM_NODE;
  private static final SubLList $list169;
  private static final SubLList $list170;
  private static final SubLSymbol $sym171$ASSERTION_FORMULA;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$RTV_CLAUSE_P;
  private static final SubLSymbol $sym174$BBF_RTV;
  private static final SubLSymbol $kw175$PRED_SET;
  private static final SubLString $str176$cb_rtv_predicate_graph_event;
  private static final SubLSymbol $sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT;
  private static final SubLSymbol $sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS;
  private static final SubLSymbol $sym179$CB_RTV_PREDICATE_GRAPH_EVENT;
  private static final SubLSymbol $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS;
  private static final SubLList $list181;

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1090L)
  public static SubLObject cb_link_rtv_query(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str0$RTV;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw1$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str2$cb_rtv );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1573L)
  public static SubLObject cb_rtv_fort_generation_fn()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue( thread );
    if( pcase_var.eql( $kw7$NL ) )
    {
      return $cb_rtv_fort_generation_fn$.getDynamicValue( thread );
    }
    return Symbols.symbol_function( $sym8$FORT_TO_STRING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 1893L)
  public static SubLObject cb_rtv_fort_parse_fn()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_rtv_fort_parse_fn$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2248L)
  public static SubLObject maybe_initialize_cb_rtv_predicates()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cb_rtv_predicates$.getDynamicValue( thread ) )
    {
      initialize_cb_rtv_predicates();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 2384L)
  public static SubLObject initialize_cb_rtv_predicates()
  {
    $cb_rtv_predicates$.setDynamicValue( $list12 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3333L)
  public static SubLObject maybe_initialize_cb_rtv_collections()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cb_rtv_collections$.getDynamicValue( thread ) )
    {
      return initialize_cb_rtv_collections();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3475L)
  public static SubLObject initialize_cb_rtv_collections()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym15$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const16$EverythingPSC, thread );
      $cb_rtv_collections$.setDynamicValue( isa.all_fort_instances( $const17$RTVDemoCollection, UNPROVIDED, UNPROVIDED ), thread );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL == $cb_rtv_collections$.getDynamicValue( thread ) )
    {
      $cb_rtv_collections$.setDynamicValue( $list18, thread );
    }
    return $cb_rtv_collections$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 3746L)
  public static SubLObject cb_rtv(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject arghash = html_arghash.arglist_to_arghash( args );
    final SubLObject debug = NIL;
    SubLObject running_query_nowP = NIL;
    SubLObject genl_preds_reasoning_enabledP = NIL;
    final SubLObject filter_mt = ( NIL != fort_types_interface.mtP( html_arghash.get_arghash_value( $kw19$MT, arghash ) ) ) ? html_arghash.get_arghash_value( $kw19$MT, arghash ) : $rtv_default_query_mt$.getGlobalValue();
    final SubLObject generation_fn = cb_rtv_fort_generation_fn();
    final SubLObject parse_fn = cb_rtv_fort_parse_fn();
    if( NIL != html_arghash.get_arghash_value( $kw20$RESET, arghash ) )
    {
      arghash = html_arghash.new_arghash( UNPROVIDED );
      initialize_cb_rtv_collections();
      initialize_cb_rtv_predicates();
    }
    maybe_initialize_cb_rtv_predicates();
    maybe_initialize_cb_rtv_collections();
    html_utilities.html_markup( $str21$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str22$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw23$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      html_utilities.html_princ( $str5$relatedToVia_Query_Tool );
      html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
      html_utilities.html_markup( TWO_INTEGER );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject color_value = html_macros.$html_color_white$.getGlobalValue();
      final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          arghash = html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw24$TERM1, debug, generation_fn, parse_fn, $const25$Individual, filter_mt );
          if( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw27$INDIVIDUAL )
          {
            arghash = html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw28$TERM2, debug, generation_fn, parse_fn, $const25$Individual, filter_mt );
          }
          else if( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw29$ISA || html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw30$GENL )
          {
            arghash = html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw31$TERM2_ADD_TYPE, debug, generation_fn, parse_fn, $const32$Collection, filter_mt );
            if( NIL != forts.fort_p( html_arghash.get_arghash_value( $kw31$TERM2_ADD_TYPE, arghash ) ) )
            {
              $cb_rtv_collections$.setDynamicValue( ConsesLow.cons( html_arghash.get_arghash_value( $kw31$TERM2_ADD_TYPE, arghash ), $cb_rtv_collections$.getDynamicValue( thread ) ), thread );
              html_arghash.set_arghash_value( $kw33$TERM2_VARIABLE_TYPE, arghash, html_arghash.get_arghash_value( $kw31$TERM2_ADD_TYPE, arghash ) );
              html_arghash.html_arghash_nl_fort_input_clear( arghash, $kw31$TERM2_ADD_TYPE );
            }
          }
          else
          {
            html_arghash.set_arghash_value( $kw26$TERM2_TYPE, arghash, $kw27$INDIVIDUAL );
          }
          if( NIL == html_arghash.get_arghash_value( $kw34$PRED, arghash ) )
          {
            html_arghash.set_arghash_value( $kw34$PRED, arghash, $const35$genls );
          }
          if( NIL == html_arghash.get_arghash_value( $kw36$NUM, arghash ) )
          {
            html_arghash.set_arghash_value( $kw36$NUM, arghash, TWO_INTEGER );
          }
          arghash = html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw37$NEW_PRED, debug, generation_fn, parse_fn, $const38$Predicate, filter_mt );
          if( NIL != html_arghash.html_arghash_nl_fort_input_doneP( arghash, $kw37$NEW_PRED ) )
          {
            final SubLObject item_var = html_arghash.get_arghash_value( $kw37$NEW_PRED, arghash );
            if( NIL == conses_high.member( item_var, $cb_rtv_predicates$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              $cb_rtv_predicates$.setDynamicValue( ConsesLow.cons( item_var, $cb_rtv_predicates$.getDynamicValue( thread ) ), thread );
            }
            arghash = html_arghash.html_arghash_nl_fort_input_clear( arghash, $kw37$NEW_PRED );
          }
          if( NIL != html_arghash.get_arghash_value( $kw39$REMOVE_PREDS, arghash ) )
          {
            $cb_rtv_predicates$.setDynamicValue( list_utilities.remove_objects_from_list( html_arghash.get_arghash_value_list( $kw40$PREDICATES, arghash ), $cb_rtv_predicates$.getDynamicValue( thread ), UNPROVIDED ),
                thread );
            html_arghash.rem_arghash_value( $kw39$REMOVE_PREDS, arghash );
          }
          maybe_initialize_cb_rtv_collections();
          maybe_initialize_cb_rtv_predicates();
          genl_preds_reasoning_enabledP = Equality.eq( $kw41$ON, html_arghash.get_arghash_value( $kw42$GENL_PRED_REASONING, arghash ) );
          arghash = html_arghash.html_arghash_nl_fort_input_force_default_if_unset( arghash, $kw19$MT, $rtv_default_query_mt$.getGlobalValue(), generation_fn, debug );
          arghash = html_arghash.html_arghash_nl_fort_input_validate( arghash, $kw19$MT, debug, generation_fn, parse_fn, $const43$Microtheory, filter_mt );
          final SubLObject cb_rtv_query_readyP = cb_rtv_query_readyP( arghash );
          final SubLObject arg1 = html_arghash.get_arghash_value( $kw24$TERM1, arghash );
          final SubLObject arg2 = ( NIL != conses_high.member( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ), $list44, UNPROVIDED, UNPROVIDED ) ) ? $sym45$_ANY
              : html_arghash.get_arghash_value( $kw28$TERM2, arghash );
          final SubLObject pred_set = ConsesLow.cons( $const46$TheSet, html_arghash.get_arghash_value_list( $kw40$PREDICATES, arghash ) );
          final SubLObject depth = html_arghash.get_arghash_value( $kw47$DEPTH, arghash );
          SubLObject ask_formula = ConsesLow.list( $const48$relatedToVia, arg1, arg2, pred_set, depth );
          final SubLObject arg2_var_type = html_arghash.get_arghash_value( $kw33$TERM2_VARIABLE_TYPE, arghash );
          final SubLObject arg2_pred = ( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw30$GENL ) ? $const35$genls : $const49$isa;
          final SubLObject mt = html_arghash.get_arghash_value( $kw19$MT, arghash );
          if( NIL != cb_rtv_query_readyP )
          {
            if( arg2 == $sym45$_ANY && NIL != arg2_var_type && NIL == kb_utilities.kbeq( arg2_var_type, $const50$Thing ) )
            {
              ask_formula = ConsesLow.list( $const51$and, ask_formula, ConsesLow.list( arg2_pred, $sym45$_ANY, arg2_var_type ) );
            }
            html_arghash.set_arghash_value( $kw52$ASK_FORMULA, arghash, ask_formula );
          }
          if( NIL != debug )
          {
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            SubLObject cdolist_list_var = Sort.sort( hash_table_utilities.hash_table_keys( arghash ), Symbols.symbol_function( $sym54$STRING_ ), Symbols.symbol_function( $sym55$SYMBOL_NAME ) );
            SubLObject k = NIL;
            k = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              html_utilities.html_princ( k );
              html_utilities.html_princ( $str53$___ );
              html_utilities.html_princ( Hashtables.gethash( k, arghash, UNPROVIDED ) );
              html_utilities.html_newline( UNPROVIDED );
              cdolist_list_var = cdolist_list_var.rest();
              k = cdolist_list_var.first();
            }
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          }
          dhtml_macros.dhtml_with_toggle_visibility_support();
          dhtml_macros.dhtml_with_dom_script();
          if( NIL != html_arghash.get_arghash_value( $kw56$RUN_QUERY, arghash ) )
          {
            running_query_nowP = T;
          }
          html_arghash.set_arghash_value( $kw56$RUN_QUERY, arghash, NIL );
          html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str57$cg );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          if( NIL != html_macros.$html_form_method_post$.getGlobalValue() )
          {
            html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_form_method_post$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
          final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
          final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_macros.$within_html_form$.bind( T, thread );
            html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
            html_utilities.html_hidden_input( $str2$cb_rtv, T, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( FIVE_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ONE_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != html_macros.$html_color_lighter_blue$.getGlobalValue() )
            {
              html_utilities.html_markup( html_macros.$html_table_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_color_lighter_blue$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str58$How_can_the_individual_named_ );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                html_arghash.html_arghash_nl_fort_input( arghash, $kw24$TERM1, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_terpri( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str60$be_connected_to_ );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                SubLObject key_string = html_arghash.arghash_make_key_string( $kw26$TERM2_TYPE, $kw61$KEYWORD );
                html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( key_string );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
                html_utilities.html_markup( $str62$onChange_javascript_this_form_sub );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject selected = list_utilities.member_equalP( $kw27$INDIVIDUAL, html_arghash.get_arghash_value_list( $kw26$TERM2_TYPE, arghash ) );
                  SubLObject value_string = html_arghash.arghash_get_string( $kw27$INDIVIDUAL, $kw63$DEFAULT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str64$the_individual_named );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                  selected = list_utilities.member_equalP( $kw29$ISA, html_arghash.get_arghash_value_list( $kw26$TERM2_TYPE, arghash ) );
                  value_string = html_arghash.arghash_get_string( $kw29$ISA, $kw63$DEFAULT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str65$any );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                  selected = list_utilities.member_equalP( $kw30$GENL, html_arghash.get_arghash_value_list( $kw26$TERM2_TYPE, arghash ) );
                  value_string = html_arghash.arghash_get_string( $kw30$GENL, $kw63$DEFAULT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str66$any_type_of );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
                }
                html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                if( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw27$INDIVIDUAL )
                {
                  html_arghash.html_arghash_nl_fort_input( arghash, $kw28$TERM2, debug, generation_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  html_arghash.html_arghash_hidden_input( arghash, $kw33$TERM2_VARIABLE_TYPE, UNPROVIDED, UNPROVIDED );
                }
                else
                {
                  key_string = html_arghash.arghash_make_key_string( $kw33$TERM2_VARIABLE_TYPE, $kw67$FORT );
                  html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( key_string );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    SubLObject cdolist_list_var2 = $cb_rtv_collections$.getDynamicValue( thread );
                    SubLObject any_type = NIL;
                    any_type = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      final SubLObject selected2 = list_utilities.member_equalP( any_type, html_arghash.get_arghash_value_list( $kw33$TERM2_VARIABLE_TYPE, arghash ) );
                      final SubLObject value_string2 = html_arghash.arghash_get_string( any_type, $kw63$DEFAULT );
                      html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                      if( NIL != selected2 )
                      {
                        html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                      }
                      if( NIL != value_string2 )
                      {
                        html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        html_utilities.html_markup( value_string2 );
                        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_princ( Functions.funcall( generation_fn, any_type ) );
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      any_type = cdolist_list_var2.first();
                    }
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                  html_utilities.html_princ( $str68$___ );
                  html_arghash.html_arghash_nl_fort_input( arghash, $kw31$TERM2_ADD_TYPE, NIL, generation_fn, NIL, UNPROVIDED, UNPROVIDED );
                  html_arghash.html_arghash_nl_fort_input_invisible( arghash, $kw28$TERM2 );
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str69$by_at_most );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                html_arghash.html_arghash_text_input( arghash, $kw47$DEPTH, TWO_INTEGER, THREE_INTEGER, UNPROVIDED );
                html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str70$links_using_ );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                key_string = html_arghash.arghash_make_key_string( $kw42$GENL_PRED_REASONING, $kw61$KEYWORD );
                html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( key_string );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_space, UNPROVIDED );
                html_utilities.html_markup( $str62$onChange_javascript_this_form_sub );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  SubLObject selected = list_utilities.member_equalP( $kw41$ON, html_arghash.get_arghash_value_list( $kw42$GENL_PRED_REASONING, arghash ) );
                  SubLObject value_string = html_arghash.arghash_get_string( $kw41$ON, $kw63$DEFAULT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str71$_the_selected_relations_and_their );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                  selected = list_utilities.member_equalP( $kw72$OFF, html_arghash.get_arghash_value_list( $kw42$GENL_PRED_REASONING, arghash ) );
                  value_string = html_arghash.arghash_get_string( $kw72$OFF, $kw63$DEFAULT );
                  html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                  if( NIL != selected )
                  {
                    html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                  }
                  if( NIL != value_string )
                  {
                    html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( value_string );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  }
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_princ( $str73$_only_the_selected_relations_ );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                }
                html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( ZERO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( FIVE_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( ZERO_INTEGER );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw74$CENTER ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      if( NIL == html_arghash.get_arghash_value_list( $kw40$PREDICATES, arghash ) )
                      {
                        final SubLObject color = html_utilities.html_color( $kw75$RED );
                        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
                        if( NIL != color )
                        {
                          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_color( color ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                        }
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_princ( $str76$_ );
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject key_string2 = html_arghash.arghash_make_key_string( $kw40$PREDICATES, $kw67$FORT );
                      html_utilities.html_markup( html_macros.$html_select_head$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_select_name$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( key_string2 );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_simple_attribute( html_macros.$html_select_multiple$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_select_size$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( FIFTEEN_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                      {
                        html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                      }
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        SubLObject cdolist_list_var3 = $cb_rtv_predicates$.getDynamicValue( thread );
                        SubLObject pred = NIL;
                        pred = cdolist_list_var3.first();
                        while ( NIL != cdolist_list_var3)
                        {
                          final SubLObject selected3 = list_utilities.member_equalP( pred, html_arghash.get_arghash_value_list( $kw40$PREDICATES, arghash ) );
                          final SubLObject value_string3 = html_arghash.arghash_get_string( pred, $kw63$DEFAULT );
                          html_utilities.html_markup( html_macros.$html_option_head$.getGlobalValue() );
                          if( NIL != selected3 )
                          {
                            html_utilities.html_simple_attribute( html_macros.$html_option_selected$.getGlobalValue() );
                          }
                          if( NIL != value_string3 )
                          {
                            html_utilities.html_markup( html_macros.$html_option_value$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( value_string3 );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_princ( Functions.funcall( generation_fn, pred ) );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_option_tail$.getGlobalValue() );
                          cdolist_list_var3 = cdolist_list_var3.rest();
                          pred = cdolist_list_var3.first();
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_select_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                      html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_arghash.html_arghash_nl_fort_input( arghash, $kw37$NEW_PRED, debug, generation_fn, NIL, $const38$Predicate, UNPROVIDED );
                      html_utilities.html_newline( TWO_INTEGER );
                      html_arghash.html_arghash_submit_input( arghash, $str77$________Add_New_Relation, $kw78$ADD_PRED, UNPROVIDED );
                      html_utilities.html_newline( TWO_INTEGER );
                      html_arghash.html_arghash_submit_input( arghash, $str79$_____Remove_Selected_Relations, $kw39$REMOVE_PREDS, UNPROVIDED );
                      html_utilities.html_newline( TWO_INTEGER );
                      if( ONE_INTEGER.numL( Sequences.length( pred_set ) ) && NIL != fort_types_interface.microtheory_p( mt ) )
                      {
                        html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                        cb_utilities.cb_link( $kw80$RTV_PREDICATE_GRAPH_EVENT, $str81$_Visualize_Selected_Relations_, ConsesLow.list( pred_set, mt ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str82$in_the_context_ );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                html_arghash.html_arghash_nl_fort_input( arghash, $kw19$MT, debug, generation_fn, T, $const43$Microtheory, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
            html_utilities.html_newline( UNPROVIDED );
            cb_rtv_submit_buttons( arghash, cb_rtv_query_readyP );
            html_utilities.html_newline( UNPROVIDED );
            if( NIL != html_arghash.get_arghash_value( $kw52$ASK_FORMULA, arghash ) )
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str83$Current_query_formula____A, html_arghash.get_arghash_value( $kw52$ASK_FORMULA, arghash ) );
              html_utilities.html_newline( TWO_INTEGER );
            }
            if( NIL != running_query_nowP )
            {
              final SubLObject ask_formula_$24 = html_arghash.get_arghash_value( $kw52$ASK_FORMULA, arghash );
              final SubLObject mt_$25 = html_arghash.get_arghash_value( $kw19$MT, arghash );
              assert NIL != Types.booleanp( genl_preds_reasoning_enabledP ) : genl_preds_reasoning_enabledP;
              final SubLObject _prev_bind_0_$24 = ghl_search_vars.$ghl_uses_spec_preds_p$.currentBinding( thread );
              try
              {
                ghl_search_vars.$ghl_uses_spec_preds_p$.bind( genl_preds_reasoning_enabledP, thread );
                cb_rtv_show_query_results( ask_formula_$24, mt_$25, arghash );
              }
              finally
              {
                ghl_search_vars.$ghl_uses_spec_preds_p$.rebind( _prev_bind_0_$24, thread );
              }
            }
            html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
          }
          finally
          {
            html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
            html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$1, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 12916L)
  public static SubLObject cb_rtv_submit_buttons(final SubLObject arghash, final SubLObject cb_rtv_query_readyP)
  {
    html_arghash.html_arghash_submit_input( arghash, $str87$Update, $kw88$UPDATE, UNPROVIDED );
    html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
    if( NIL != cb_rtv_query_readyP )
    {
      html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
      html_arghash.html_arghash_submit_input( arghash, $str89$Run_This_Query, $kw56$RUN_QUERY, UNPROVIDED );
    }
    html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
    html_arghash.html_arghash_submit_input( arghash, $str90$Reset_Completely, $kw20$RESET, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 13325L)
  public static SubLObject cb_rtv_query_readyP(final SubLObject arghash)
  {
    return makeBoolean( NIL != html_arghash.html_arghash_nl_fort_input_doneP( arghash, $kw24$TERM1 ) && ( NIL != html_arghash.html_arghash_nl_fort_input_doneP( arghash, $kw28$TERM2 ) || NIL != conses_high.member(
        html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ), $list44, UNPROVIDED, UNPROVIDED ) ) && NIL != html_arghash.get_arghash_value( $kw40$PREDICATES, arghash ) && NIL != html_arghash
            .html_arghash_nl_fort_input_doneP( arghash, $kw19$MT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 13713L)
  public static SubLObject cb_rtv_show_query_results(final SubLObject ask_formula, final SubLObject mt, SubLObject arghash)
  {
    if( arghash == UNPROVIDED )
    {
      arghash = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_rtv_ask_results$.setDynamicValue( dictionary.new_dictionary( EQUAL, UNPROVIDED ), thread );
    final SubLObject _prev_bind_0 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
    try
    {
      api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
      final SubLObject results = ask_utilities.ask_justified( ask_formula, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      if( NIL == results )
      {
        html_utilities.html_princ( $str91$No_answers_found_ );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str92$Query_Results );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        html_utilities.html_newline( TWO_INTEGER );
        if( NIL != html_arghash.arghash_p( arghash ) )
        {
          if( html_arghash.get_arghash_value( $kw26$TERM2_TYPE, arghash ) == $kw27$INDIVIDUAL )
          {
            cb_utilities.cb_link( $kw93$RTV_GRAPH_EVENT, $str94$_Visualize_below_justification_, arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_link( $kw93$RTV_GRAPH_EVENT, $str95$_Visualize_more_justifications_, arghash, $kw96$EXPANDED_NODE_TO_NODE, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            final SubLObject safe_arghash = html_arghash.copy_arghash( arghash );
            html_arghash.rem_arghash_value( $kw28$TERM2, safe_arghash );
            cb_utilities.cb_link( $kw93$RTV_GRAPH_EVENT, $str97$_Visualize_justifications_of_all_, safe_arghash, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          html_utilities.html_newline( UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_unordered_list_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          SubLObject list_var = NIL;
          SubLObject v_answer = NIL;
          SubLObject answer_num = NIL;
          list_var = results;
          v_answer = list_var.first();
          for( answer_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_answer = list_var.first(), answer_num = Numbers.add( ONE_INTEGER, answer_num ) )
          {
            SubLObject current;
            final SubLObject datum = current = v_answer;
            SubLObject v_bindings = NIL;
            SubLObject justification = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
            justification = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject v_term = bindings.variable_binding_value( v_bindings.first() );
              final SubLObject boolean_queryP = cyc_kernel.closed_query_bindings_p( v_bindings );
              html_utilities.html_markup( html_macros.$html_list_item_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                dictionary.dictionary_enter( $cb_rtv_ask_results$.getDynamicValue( thread ), v_term, justification );
                if( NIL != boolean_queryP )
                {
                  html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                  html_utilities.html_princ( $str99$True__ );
                  html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                }
                else
                {
                  final SubLObject pcase_var = control_vars.$cb_major_presentation_language$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw7$NL ) )
                  {
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    html_utilities.html_markup( pph_html.html_generate_phrase( v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  else
                  {
                    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                    cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                  }
                  html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                  cb_utilities.cb_link( $kw100$RTV_JUSTIFY_TERM, $str101$_Explain_, v_term, justification, UNPROVIDED, UNPROVIDED );
                  if( NIL != html_arghash.arghash_p( arghash ) )
                  {
                    html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
                    final SubLObject safe_arghash2 = html_arghash.copy_arghash( arghash );
                    html_arghash.set_arghash_value( $kw28$TERM2, safe_arghash2, v_term );
                    cb_utilities.cb_link( $kw93$RTV_GRAPH_EVENT, $str102$_Visualize_, safe_arghash2, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                }
                html_utilities.html_newline( UNPROVIDED );
                if( NIL != boolean_queryP )
                {
                  cb_rtv_show_argument( justification, PrintLow.write_to_string( answer_num, EMPTY_SUBL_OBJECT_ARRAY ) );
                }
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
              }
              html_utilities.html_markup( html_macros.$html_list_item_tail$.getGlobalValue() );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
            }
            html_utilities.html_newline( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
        }
        html_utilities.html_markup( html_macros.$html_unordered_list_tail$.getGlobalValue() );
      }
    }
    finally
    {
      api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 15826L)
  public static SubLObject cb_rtv_justify_term(final SubLObject args)
  {
    cb_rtv_justify_term_open_window( args );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 16382L)
  public static SubLObject cb_rtv_justify_term_open_window(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    final SubLObject v_term = html_arghash.get_arghash_value( $kw104$TERM, arghash );
    final SubLObject term_string = Functions.funcall( cb_rtv_fort_generation_fn(), v_term );
    final SubLObject justification = dictionary.dictionary_lookup( $cb_rtv_ask_results$.getDynamicValue( thread ), v_term, UNPROVIDED );
    final SubLObject title_var = term_string;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str21$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str22$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw23$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw105$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw106$SAM_AUTOCOMPLETE_CSS );
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
          html_utilities.html_markup( $str108$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str109$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str110$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str111$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str112$Refresh_Frames );
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
            dhtml_macros.dhtml_with_toggle_visibility_support();
            dhtml_macros.dhtml_with_dom_script();
            cb_rtv_show_argument( justification, $str113$1 );
            html_utilities.html_newline( TWO_INTEGER );
            html_utilities.html_markup( html_macros.$html_center_head$.getGlobalValue() );
            html_script_utilities.html_kill_window_button( UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_center_tail$.getGlobalValue() );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 16932L)
  public static SubLObject cb_link_rtv_justify_term(final SubLObject linktext, final SubLObject v_term)
  {
    final SubLObject arghash = html_arghash.new_arghash( UNPROVIDED );
    html_arghash.set_arghash_value( $kw115$SIGNATURE, arghash, $str116$justify_me );
    html_arghash.set_arghash_value( $kw104$TERM, arghash, v_term );
    cb_rtv_justify_open_window_link( arghash, linktext, $str117$cb_rtv_justify_term );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 17214L)
  public static SubLObject cb_rtv_justify_open_window_link(final SubLObject arghash, final SubLObject linktext, SubLObject handler)
  {
    if( handler == UNPROVIDED )
    {
      handler = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = ( NIL != html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash ) ) ? cb_utilities.cb_frame_name( html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash ) ) : NIL;
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( html_arghash.html_arghash_href( arghash, handler ) );
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
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str119$window_open__ );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( html_arghash.html_arghash_href( arghash, handler ) );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str120$__ );
    if( NIL != html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash ) )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str121$__A_, html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash ) );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str122$null );
    }
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str123$___A____, $str124$dependent_yes_height_360_width_64 );
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str125$return_false_ );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18007L)
  public static SubLObject rtv_hl_justify(final SubLObject support)
  {
    return hl_supports.hl_justify( support );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18159L)
  public static SubLObject cb_rtv_indented_table_data(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym126$HTML_TABLE_ROW, $list127, reader.bq_cons( $sym128$HTML_TABLE_DATA, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18397L)
  public static SubLObject cb_rtv_meta_supports_to_show(final SubLObject support)
  {
    final SubLObject all_meta_supports = rtv_hl_justify( support );
    final SubLObject support_formula = arguments.support_formula( support );
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = all_meta_supports;
    SubLObject meta_support = NIL;
    meta_support = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !arguments.support_formula( meta_support ).equal( support_formula ) )
      {
        ans = ConsesLow.cons( meta_support, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_support = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 18811L)
  public static SubLObject cb_rtv_maybe_show_meta_supports(final SubLObject meta_supports, final SubLObject index_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject object_id = Sequences.cconcatenate( $str129$meta_supports_, index_string );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_head$.getGlobalValue() );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str130$text_css );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_media$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str131$screen );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_terpri( UNPROVIDED );
      dhtml_macros.dhtml_dom_wrapper_preamble( object_id );
      dhtml_macros.dhtml_dom_attribute_preamble( dhtml_macros.$dhtml_dom_display$.getGlobalValue() );
      html_utilities.html_markup( $str132$none );
      dhtml_macros.dhtml_dom_attribute_postamble();
      dhtml_macros.dhtml_dom_wrapper_postamble();
      html_utilities.html_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( dhtml_macros.$dhtml_css_tail$.getGlobalValue() );
    html_utilities.html_terpri( UNPROVIDED );
    dhtml_macros.dhtml_switch_visibility_links_arrows( object_id, $str133$ );
    dhtml_macros.dhtml_set_switched_visibility( object_id, $kw134$INVISIBLE, $kw135$TEXT );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != object_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( object_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject list_var = NIL;
        SubLObject support = NIL;
        SubLObject support_num = NIL;
        list_var = meta_supports;
        support = list_var.first();
        for( support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add( ONE_INTEGER, support_num ) )
        {
          final SubLObject support_index_string = PrintLow.format( NIL, $str136$_A_meta__D, index_string, support_num );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
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
              cb_rtv_show_support( support, support_index_string );
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
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 19483L)
  public static SubLObject cb_rtv_show_support(final SubLObject support, SubLObject index_string)
  {
    if( index_string == UNPROVIDED )
    {
      index_string = $str137$support;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      cb_rtv_show_support_readably( support, UNPROVIDED );
    }
    else if( NIL != arguments.hl_support_p( support ) )
    {
      final SubLObject formula = arguments.support_sentence( support );
      final SubLObject meta_supports = $cb_rtv_meta_support_level$.getDynamicValue( thread ).numL( $cb_rtv_meta_support_max$.getGlobalValue() ) ? cb_rtv_meta_supports_to_show( support ) : NIL;
      cb_rtv_show_support_readably( formula, arguments.support_mt( support ) );
      if( NIL != meta_supports )
      {
        final SubLObject _prev_bind_0 = $cb_rtv_meta_support_level$.currentBinding( thread );
        try
        {
          $cb_rtv_meta_support_level$.bind( number_utilities.f_1X( $cb_rtv_meta_support_level$.getDynamicValue( thread ) ), thread );
          cb_rtv_maybe_show_meta_supports( meta_supports, index_string );
        }
        finally
        {
          $cb_rtv_meta_support_level$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 20167L)
  public static SubLObject cb_rtv_show_support_readably(final SubLObject support, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( support ) )
    {
      cb_utilities.cb_show_assertion_readably( support, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), NIL );
      return NIL;
    }
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym15$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const16$EverythingPSC, thread );
      final SubLObject assertion = czer_meta.find_assertion_cycl( support, UNPROVIDED );
      if( NIL != assertion )
      {
        cb_utilities.cb_show_assertion_readably( assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), NIL );
      }
      else
      {
        cb_sentence_browser.cb_show_sentence_readably( support, mt, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue( thread ), NIL, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 20672L)
  public static SubLObject cb_rtv_maybe_show_additional_supports(final SubLObject supports, final SubLObject index_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject object_id = Sequences.cconcatenate( $str138$additional_supports_, index_string );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_head$.getGlobalValue() );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_type$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str130$text_css );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( dhtml_macros.$dhtml_css_media$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str131$screen );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_terpri( UNPROVIDED );
      dhtml_macros.dhtml_dom_wrapper_preamble( object_id );
      dhtml_macros.dhtml_dom_attribute_preamble( dhtml_macros.$dhtml_dom_display$.getGlobalValue() );
      html_utilities.html_markup( $str132$none );
      dhtml_macros.dhtml_dom_attribute_postamble();
      dhtml_macros.dhtml_dom_wrapper_postamble();
      html_utilities.html_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( dhtml_macros.$dhtml_css_tail$.getGlobalValue() );
    html_utilities.html_terpri( UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    dhtml_macros.dhtml_switch_visibility_links_arrows( object_id, $str139$Additional_Supports );
    dhtml_macros.dhtml_set_switched_visibility( object_id, $kw140$VISIBLE, $kw135$TEXT );
    html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
    if( NIL != object_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( object_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject list_var = NIL;
        SubLObject support = NIL;
        SubLObject support_num = NIL;
        list_var = supports;
        support = list_var.first();
        for( support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), support = list_var.first(), support_num = Numbers.add( ONE_INTEGER, support_num ) )
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
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
              final SubLObject support_index_string = PrintLow.format( NIL, $str141$_A_additional__D, index_string, support_num );
              cb_rtv_show_support( support, support_index_string );
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
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 21406L)
  public static SubLObject cb_rtv_show_argument(final SubLObject argument, final SubLObject index_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != list_utilities.singletonP( argument ) )
    {
      cb_rtv_show_support( argument.first(), index_string );
    }
    else
    {
      SubLObject additional_supports = NIL;
      SubLObject new_argument = NIL;
      SubLObject cdolist_list_var = argument;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != rkf_argument_communicator.rkf_irrelevant_support_p( support ) )
        {
          additional_supports = ConsesLow.cons( support, additional_supports );
        }
        else
        {
          new_argument = Sequences.cconcatenate( new_argument, ConsesLow.list( support ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject list_var = NIL;
        SubLObject support2 = NIL;
        SubLObject support_num = NIL;
        list_var = new_argument;
        support2 = list_var.first();
        for( support_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), support2 = list_var.first(), support_num = Numbers.add( ONE_INTEGER, support_num ) )
        {
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_glyph( $kw59$NBSP, UNPROVIDED );
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
              final SubLObject support_index_string = PrintLow.format( NIL, $str142$_A__D, index_string, support_num );
              cb_rtv_show_support( support2, support_index_string );
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
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      if( NIL != additional_supports )
      {
        cb_rtv_maybe_show_additional_supports( additional_supports, index_string );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 22474L)
  public static SubLObject cb_rtv_show_arguments(final SubLObject v_arguments, SubLObject type, SubLObject show_separatorP)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( show_separatorP == UNPROVIDED )
    {
      show_separatorP = T;
    }
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
      SubLObject list_var = NIL;
      SubLObject argument = NIL;
      SubLObject index = NIL;
      list_var = v_arguments;
      argument = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argument = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject prefix_string = ( NIL != type ) ? PrintLow.format( NIL, $str143$_A_, type ) : $str133$;
        final SubLObject index_string = PrintLow.format( NIL, $str144$_A_D, prefix_string, index );
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw145$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str146$_S_, number_utilities.f_1X( index ) );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
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
            cb_rtv_show_argument( argument, index_string );
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
        if( NIL != list_utilities.lengthG( v_arguments, index, UNPROVIDED ) && NIL != show_separatorP )
        {
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
        }
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23241L)
  public static SubLObject rtv_supportP(final SubLObject support)
  {
    if( support.first() == $kw147$RTV )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_link_rtv_graph_event(final SubLObject linktext, final SubLObject arghash, SubLObject graph_type)
  {
    if( graph_type == UNPROVIDED )
    {
      graph_type = NIL;
    }
    final SubLObject safe_arghash = html_arghash.copy_arghash( arghash );
    html_arghash.set_arghash_value_list( $kw149$FORTS, safe_arghash, ConsesLow.list( html_arghash.get_arghash_value( $kw24$TERM1, safe_arghash ), html_arghash.get_arghash_value( $kw28$TERM2, safe_arghash ) ) );
    html_arghash.set_arghash_value_list( $kw150$PREDS, safe_arghash, html_arghash.get_arghash_value_list( $kw40$PREDICATES, safe_arghash ) );
    html_arghash.set_arghash_value( $kw151$FILTER_PRED, safe_arghash, ( $kw29$ISA == html_arghash.get_arghash_value( $kw26$TERM2_TYPE, safe_arghash ) ) ? $const49$isa
        : ( ( $kw152$GENLS == html_arghash.get_arghash_value( $kw26$TERM2_TYPE, safe_arghash ) ) ? $const35$genls : NIL ) );
    html_arghash.set_arghash_value( $kw153$FILTER_FORT, safe_arghash, html_arghash.get_arghash_value( $kw33$TERM2_VARIABLE_TYPE, safe_arghash ) );
    html_arghash.set_arghash_value( $kw154$GRAPH_TYPE, safe_arghash, graph_type );
    html_arghash.rem_arghash_values_inverse( $cb_rtv_graph_keys$.getGlobalValue(), safe_arghash );
    html_arghash.set_arghash_value( $kw115$SIGNATURE, safe_arghash, PrintLow.format( NIL, $str155$_A, random.random( Numbers.expt( TWO_INTEGER, $int156$30 ) ) ) );
    cb_blue_grapher.cb_blue_applet_window_link( safe_arghash, linktext, $str157$cb_rtv_graph_event );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_rtv_graph_event(final SubLObject args)
  {
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    cb_blue_grapher.cb_blue_applet_window_internal( arghash );
    subl_promotions.make_process_with_args( $str157$cb_rtv_graph_event, Symbols.symbol_function( $sym159$CB_RTV_GRAPH_EVENT_PROCESS ), ConsesLow.list( arghash ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_rtv_graph_event_process(final SubLObject arghash)
  {
    final SubLObject ask_formula = html_arghash.get_arghash_value( $kw52$ASK_FORMULA, arghash );
    final SubLObject mt = html_arghash.get_arghash_value( $kw19$MT, arghash );
    final SubLObject v_forts = html_arghash.get_arghash_value_list( $kw149$FORTS, arghash );
    final SubLObject preds = html_arghash.get_arghash_value_list( $kw150$PREDS, arghash );
    final SubLObject depth = html_arghash.get_arghash_value( $kw47$DEPTH, arghash );
    final SubLObject filter_pred = html_arghash.get_arghash_value( $kw151$FILTER_PRED, arghash );
    final SubLObject filter_fort = html_arghash.get_arghash_value( $kw153$FILTER_FORT, arghash );
    final SubLObject signature = html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash );
    final SubLObject graph_type = html_arghash.get_arghash_value( $kw154$GRAPH_TYPE, arghash );
    final SubLObject arg1 = v_forts.first();
    final SubLObject arg2 = conses_high.second( v_forts );
    if( NIL != forts.fort_p( arg2 ) )
    {
      blue_grapher_utilities.blue_event( signature, ConsesLow.list( cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), ConsesLow.list( new SubLObject[] { $kw161$BUILDER_FN,
        $sym162$BBF_RTV_ALL_EDGES_BETWEEN, $kw149$FORTS, ConsesLow.list( arg1, arg2 ), $kw150$PREDS, preds, $kw47$DEPTH, depth, $kw19$MT, mt, $kw154$GRAPH_TYPE, graph_type
      } ) ) );
    }
    else
    {
      blue_grapher_utilities.blue_event( signature, ConsesLow.list( cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), ConsesLow.list( $kw161$BUILDER_FN,
          $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, $kw164$PARAMS, ConsesLow.list( $kw165$FORMULA, ask_formula ), $kw19$MT, mt, $kw154$GRAPH_TYPE, graph_type ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject bbf_rtv_all_edges_between(final SubLObject arg_plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_forts = conses_high.getf( arg_plist, $kw149$FORTS, UNPROVIDED );
    final SubLObject preds = conses_high.getf( arg_plist, $kw150$PREDS, UNPROVIDED );
    final SubLObject depth = conses_high.getf( arg_plist, $kw47$DEPTH, UNPROVIDED );
    final SubLObject mt = ( NIL != conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED ) ) ? conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED ) : $rtv_default_query_mt$.getGlobalValue();
    final SubLObject graph_type = conses_high.getf( arg_plist, $kw154$GRAPH_TYPE, UNPROVIDED );
    final SubLObject cdolist_list_var = list_utilities.pick_two( v_forts );
    SubLObject fort_pair = NIL;
    fort_pair = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      final SubLObject fort1 = fort_pair.first();
      final SubLObject fort2 = conses_high.second( fort_pair );
      SubLObject just_assertions = NIL;
      SubLObject result_links = NIL;
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        if( graph_type == $kw96$EXPANDED_NODE_TO_NODE )
        {
          just_assertions = Sequences.remove_duplicates( removal_modules_rtv.rtv_all_edges_from_node_to_node( fort1, fort2, preds, depth, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        else
        {
          just_assertions = removal_modules_rtv.inference_rtv_justify( ConsesLow.list( $const48$relatedToVia, fort1, fort2, reader.bq_cons( $const46$TheSet, ConsesLow.append( preds, NIL ) ), depth ), UNPROVIDED );
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
      SubLObject cdolist_list_var_$49 = just_assertions;
      SubLObject just_assertion = NIL;
      just_assertion = cdolist_list_var_$49.first();
      while ( NIL != cdolist_list_var_$49)
      {
        if( NIL != assertion_handles.assertion_p( just_assertion ) && NIL == kb_utilities.kbeq( cycl_utilities.formula_arg0( assertions_high.assertion_formula( just_assertion ) ), $const167$genlPreds ) )
        {
          result_links = ConsesLow.cons( blue_grapher_utilities.bbf_make_edge_from_assertion( just_assertion ), result_links );
        }
        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
        just_assertion = cdolist_list_var_$49.first();
      }
      return blue_grapher_utilities.bbf_make_graph( NIL, list_utilities.hash_remove_duplicates( result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( $kw19$MT, mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject bbf_rtv_all_edges_from_node(final SubLObject arg_plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_forts = conses_high.getf( arg_plist, $kw149$FORTS, UNPROVIDED );
    final SubLObject preds = conses_high.getf( arg_plist, $kw150$PREDS, UNPROVIDED );
    final SubLObject depth = conses_high.getf( arg_plist, $kw47$DEPTH, UNPROVIDED );
    final SubLObject mt = conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED );
    final SubLObject filter_pred = conses_high.getf( arg_plist, $kw151$FILTER_PRED, UNPROVIDED );
    final SubLObject filter_fort = conses_high.getf( arg_plist, $kw153$FILTER_FORT, UNPROVIDED );
    final SubLObject fort1 = v_forts.first();
    final SubLObject test_formula = ( NIL != forts.fort_p( filter_pred ) && NIL != forts.fort_p( filter_fort ) ) ? ConsesLow.list( filter_pred, $sym45$_ANY, filter_fort ) : $list170;
    SubLObject just_assertions = NIL;
    SubLObject result_links = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      just_assertions = Sequences.remove_duplicates( removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying( fort1, test_formula, preds, depth, UNPROVIDED ), Symbols.symbol_function( EQUAL ), Symbols
          .symbol_function( $sym171$ASSERTION_FORMULA ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = just_assertions;
    SubLObject just_assertion = NIL;
    just_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( just_assertion ) && NIL == kb_utilities.kbeq( cycl_utilities.formula_arg0( assertions_high.assertion_formula( just_assertion ) ), $const167$genlPreds ) )
      {
        result_links = ConsesLow.cons( blue_grapher_utilities.bbf_make_edge_from_assertion( just_assertion ), result_links );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just_assertion = cdolist_list_var.first();
    }
    return blue_grapher_utilities.bbf_make_graph( NIL, list_utilities.hash_remove_duplicates( result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( $kw19$MT, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject bbf_rtv_all_edges_from_node_satisfying(final SubLObject arg_plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject params = conses_high.getf( arg_plist, $kw164$PARAMS, UNPROVIDED );
    final SubLObject formula = conses_high.getf( params, $kw165$FORMULA, UNPROVIDED );
    final SubLObject mt = conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED );
    final SubLObject rtv_clause = list_utilities.tree_find_if( $sym173$RTV_CLAUSE_P, formula, UNPROVIDED );
    final SubLObject fort = ( NIL != forts.fort_p( cycl_utilities.formula_arg1( rtv_clause, UNPROVIDED ) ) ) ? cycl_utilities.formula_arg1( rtv_clause, UNPROVIDED )
        : cycl_utilities.formula_arg2( rtv_clause, UNPROVIDED );
    final SubLObject preds = el_utilities.el_extensional_set_elements( cycl_utilities.formula_arg3( rtv_clause, UNPROVIDED ) );
    final SubLObject depth = cycl_utilities.formula_arg4( rtv_clause, UNPROVIDED );
    SubLObject just_assertions = NIL;
    SubLObject result_links = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      just_assertions = Sequences.remove_duplicates( removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying( fort, formula, preds, depth, mt ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function(
          $sym171$ASSERTION_FORMULA ), UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = just_assertions;
    SubLObject just_assertion = NIL;
    just_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( just_assertion ) && NIL == kb_utilities.kbeq( cycl_utilities.formula_arg0( assertions_high.assertion_formula( just_assertion ) ), $const167$genlPreds ) )
      {
        result_links = ConsesLow.cons( blue_grapher_utilities.bbf_make_edge_from_assertion( just_assertion ), result_links );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just_assertion = cdolist_list_var.first();
    }
    return blue_grapher_utilities.bbf_make_graph( NIL, list_utilities.hash_remove_duplicates( result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( $kw19$MT, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject bbf_rtv(final SubLObject arg_plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject params = conses_high.getf( arg_plist, $kw164$PARAMS, UNPROVIDED );
    final SubLObject formula = conses_high.getf( params, $kw165$FORMULA, UNPROVIDED );
    final SubLObject mt = conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED );
    final SubLObject rtv_clause = list_utilities.tree_find_if( $sym173$RTV_CLAUSE_P, formula, UNPROVIDED );
    final SubLObject arg1 = czer_main.canonicalize_term( cycl_utilities.formula_arg1( rtv_clause, UNPROVIDED ), UNPROVIDED );
    final SubLObject arg2 = czer_main.canonicalize_term( cycl_utilities.formula_arg2( rtv_clause, UNPROVIDED ), UNPROVIDED );
    final SubLObject fort = ( NIL != forts.fort_p( arg1 ) ) ? arg1 : arg2;
    final SubLObject preds = el_utilities.el_extensional_set_elements( cycl_utilities.formula_arg3( rtv_clause, UNPROVIDED ) );
    final SubLObject depth = cycl_utilities.formula_arg4( rtv_clause, UNPROVIDED );
    final SubLObject graph_type = conses_high.getf( arg_plist, $kw154$GRAPH_TYPE, UNPROVIDED );
    SubLObject just_assertions = NIL;
    SubLObject result_links = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != cycl_variables.el_varP( cycl_utilities.formula_arg1( rtv_clause, UNPROVIDED ) ) || NIL != cycl_variables.el_varP( cycl_utilities.formula_arg2( rtv_clause, UNPROVIDED ) ) )
      {
        just_assertions = Sequences.remove_duplicates( removal_modules_rtv.rtv_all_edges_from_node_to_nodes_satisfying( fort, formula, preds, depth, mt ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function(
            $sym171$ASSERTION_FORMULA ), UNPROVIDED, UNPROVIDED );
      }
      else if( graph_type == $kw96$EXPANDED_NODE_TO_NODE )
      {
        just_assertions = Sequences.remove_duplicates( removal_modules_rtv.rtv_all_edges_from_node_to_node( arg1, arg2, preds, depth, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        just_assertions = removal_modules_rtv.inference_rtv_justify( ConsesLow.list( $const48$relatedToVia, arg1, arg2, reader.bq_cons( $const46$TheSet, ConsesLow.append( preds, NIL ) ), depth ), UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = just_assertions;
    SubLObject just_assertion = NIL;
    just_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( just_assertion ) && NIL == kb_utilities.kbeq( cycl_utilities.formula_arg0( assertions_high.assertion_formula( just_assertion ) ), $const167$genlPreds ) )
      {
        result_links = ConsesLow.cons( blue_grapher_utilities.bbf_make_edge_from_assertion( just_assertion ), result_links );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just_assertion = cdolist_list_var.first();
    }
    return blue_grapher_utilities.bbf_make_graph( NIL, list_utilities.hash_remove_duplicates( result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( $kw19$MT, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_link_rtv_predicate_graph_event(final SubLObject linktext, final SubLObject args)
  {
    final SubLObject arghash = html_arghash.new_arghash( UNPROVIDED );
    html_arghash.set_arghash_value( $kw115$SIGNATURE, arghash, PrintLow.format( NIL, $str155$_A, random.random( Numbers.expt( TWO_INTEGER, $int156$30 ) ) ) );
    html_arghash.set_arghash_value_list( $kw175$PRED_SET, arghash, ConsesLow.nth( ZERO_INTEGER, args ) );
    html_arghash.set_arghash_value( $kw19$MT, arghash, ( NIL != ConsesLow.nth( ONE_INTEGER, args ) ) ? ConsesLow.nth( ONE_INTEGER, args ) : $rtv_default_query_mt$.getGlobalValue() );
    cb_blue_grapher.cb_blue_applet_window_link( arghash, linktext, $str176$cb_rtv_predicate_graph_event );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_rtv_predicate_graph_event(final SubLObject args)
  {
    cb_blue_grapher.cb_blue_applet_window( args );
    final SubLObject arghash = html_arghash.arglist_to_arghash( args );
    subl_promotions.make_process_with_args( $str176$cb_rtv_predicate_graph_event, Symbols.symbol_function( $sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS ), ConsesLow.list( arghash ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject cb_rtv_predicate_graph_event_process(final SubLObject arghash)
  {
    final SubLObject mt = html_arghash.get_arghash_value( $kw19$MT, arghash );
    final SubLObject preds = html_arghash.get_arghash_value_list( $kw175$PRED_SET, arghash ).rest();
    final SubLObject signature = html_arghash.get_arghash_value( $kw115$SIGNATURE, arghash );
    blue_grapher_utilities.blue_event( signature, ConsesLow.list( cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), ConsesLow.list( $kw161$BUILDER_FN, $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS,
        $kw150$PREDS, preds, $kw19$MT, mt ) ) );
    SubLObject cdolist_list_var = preds;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      blue_grapher_utilities.blue_event( signature, ConsesLow.list( cb_blue_grapher.$cb_blue_cyc_graph_command_add_node_string$.getGlobalValue(), ConsesLow.list( $kw149$FORTS, ConsesLow.list( pred ) ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-rtv.lisp", position = 23348L)
  public static SubLObject bbf_all_edges_subsumed_by_preds(final SubLObject arg_plist)
  {
    final SubLObject preds = conses_high.getf( arg_plist, $kw150$PREDS, UNPROVIDED );
    final SubLObject mt = ( NIL != conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED ) ) ? conses_high.getf( arg_plist, $kw19$MT, UNPROVIDED ) : $rtv_default_query_mt$.getGlobalValue();
    final SubLObject just_assertions = removal_modules_rtv.all_edges_subsumed_by_preds( preds, mt );
    SubLObject result_links = NIL;
    SubLObject cdolist_list_var = just_assertions;
    SubLObject just_assertion = NIL;
    just_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_handles.assertion_p( just_assertion ) )
      {
        result_links = ConsesLow.cons( blue_grapher_utilities.bbf_make_edge_from_assertion( just_assertion ), result_links );
      }
      cdolist_list_var = cdolist_list_var.rest();
      just_assertion = cdolist_list_var.first();
    }
    return blue_grapher_utilities.bbf_make_graph( NIL, list_utilities.hash_remove_duplicates( result_links, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ConsesLow.list( $kw19$MT, mt ) );
  }

  public static SubLObject declare_cb_rtv_file()
  {
    SubLFiles.declareFunction( me, "cb_link_rtv_query", "CB-LINK-RTV-QUERY", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_rtv_fort_generation_fn", "CB-RTV-FORT-GENERATION-FN", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_fort_parse_fn", "CB-RTV-FORT-PARSE-FN", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_cb_rtv_predicates", "MAYBE-INITIALIZE-CB-RTV-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_cb_rtv_predicates", "INITIALIZE-CB-RTV-PREDICATES", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_initialize_cb_rtv_collections", "MAYBE-INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_cb_rtv_collections", "INITIALIZE-CB-RTV-COLLECTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv", "CB-RTV", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_submit_buttons", "CB-RTV-SUBMIT-BUTTONS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_query_readyP", "CB-RTV-QUERY-READY?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_show_query_results", "CB-RTV-SHOW-QUERY-RESULTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_rtv_justify_term", "CB-RTV-JUSTIFY-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_justify_term_open_window", "CB-RTV-JUSTIFY-TERM-OPEN-WINDOW", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_rtv_justify_term", "CB-LINK-RTV-JUSTIFY-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_justify_open_window_link", "CB-RTV-JUSTIFY-OPEN-WINDOW-LINK", 2, 1, false );
    SubLFiles.declareFunction( me, "rtv_hl_justify", "RTV-HL-JUSTIFY", 1, 0, false );
    SubLFiles.declareMacro( me, "cb_rtv_indented_table_data", "CB-RTV-INDENTED-TABLE-DATA" );
    SubLFiles.declareFunction( me, "cb_rtv_meta_supports_to_show", "CB-RTV-META-SUPPORTS-TO-SHOW", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_maybe_show_meta_supports", "CB-RTV-MAYBE-SHOW-META-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_show_support", "CB-RTV-SHOW-SUPPORT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_rtv_show_support_readably", "CB-RTV-SHOW-SUPPORT-READABLY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_rtv_maybe_show_additional_supports", "CB-RTV-MAYBE-SHOW-ADDITIONAL-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_show_argument", "CB-RTV-SHOW-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_show_arguments", "CB-RTV-SHOW-ARGUMENTS", 1, 2, false );
    SubLFiles.declareFunction( me, "rtv_supportP", "RTV-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_rtv_graph_event", "CB-LINK-RTV-GRAPH-EVENT", 2, 1, false );
    SubLFiles.declareFunction( me, "cb_rtv_graph_event", "CB-RTV-GRAPH-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_graph_event_process", "CB-RTV-GRAPH-EVENT-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "bbf_rtv_all_edges_between", "BBF-RTV-ALL-EDGES-BETWEEN", 1, 0, false );
    SubLFiles.declareFunction( me, "bbf_rtv_all_edges_from_node", "BBF-RTV-ALL-EDGES-FROM-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "bbf_rtv_all_edges_from_node_satisfying", "BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING", 1, 0, false );
    SubLFiles.declareFunction( me, "bbf_rtv", "BBF-RTV", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_rtv_predicate_graph_event", "CB-LINK-RTV-PREDICATE-GRAPH-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_predicate_graph_event", "CB-RTV-PREDICATE-GRAPH-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_rtv_predicate_graph_event_process", "CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "bbf_all_edges_subsumed_by_preds", "BBF-ALL-EDGES-SUBSUMED-BY-PREDS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_rtv_file()
  {
    $cb_rtv_fort_generation_fn$ = SubLFiles.defparameter( "*CB-RTV-FORT-GENERATION-FN*", $sym6$GENERATE_PHRASE );
    $cb_rtv_fort_parse_fn$ = SubLFiles.defparameter( "*CB-RTV-FORT-PARSE-FN*", $sym9$TERMS_FOR_BROWSING );
    $rtv_default_query_mt$ = SubLFiles.deflexical( "*RTV-DEFAULT-QUERY-MT*", $const10$CurrentWorldDataCollectorMt_NonHo );
    $cb_rtv_predicates$ = SubLFiles.defparameter( "*CB-RTV-PREDICATES*", NIL );
    $cb_rtv_ask_results$ = SubLFiles.defparameter( "*CB-RTV-ASK-RESULTS*", NIL );
    $cb_rtv_collections$ = SubLFiles.defparameter( "*CB-RTV-COLLECTIONS*", NIL );
    $cb_rtv_meta_support_level$ = SubLFiles.defparameter( "*CB-RTV-META-SUPPORT-LEVEL*", ZERO_INTEGER );
    $cb_rtv_meta_support_max$ = SubLFiles.deflexical( "*CB-RTV-META-SUPPORT-MAX*", FIVE_INTEGER );
    $cb_rtv_graph_keys$ = SubLFiles.deflexical( "*CB-RTV-GRAPH-KEYS*", $list148 );
    return NIL;
  }

  public static SubLObject setup_cb_rtv_file()
  {
    cb_utilities.setup_cb_link_method( $kw3$RTV_QUERY, $sym4$CB_LINK_RTV_QUERY, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw3$RTV_QUERY, $str0$RTV, $str0$RTV, $str5$relatedToVia_Query_Tool );
    utilities_macros.register_html_state_variable( $sym11$_CB_RTV_PREDICATES_ );
    utilities_macros.register_html_state_variable( $sym13$_CB_RTV_ASK_RESULTS_ );
    utilities_macros.register_html_state_variable( $sym14$_CB_RTV_COLLECTIONS_ );
    html_macros.note_cgi_handler_function( $sym85$CB_RTV, $kw86$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym103$CB_RTV_JUSTIFY_TERM, $kw86$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW, $kw86$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw100$RTV_JUSTIFY_TERM, $sym118$CB_LINK_RTV_JUSTIFY_TERM, TWO_INTEGER );
    cb_utilities.setup_cb_link_method( $kw93$RTV_GRAPH_EVENT, $sym158$CB_LINK_RTV_GRAPH_EVENT, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym160$CB_RTV_GRAPH_EVENT, $kw86$HTML_HANDLER );
    Hashtables.sethash( $sym162$BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T );
    Hashtables.sethash( $sym162$BBF_RTV_ALL_EDGES_BETWEEN, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list166 );
    utilities_macros.register_api_predefined_function( $sym162$BBF_RTV_ALL_EDGES_BETWEEN );
    Hashtables.sethash( $sym168$BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T );
    Hashtables.sethash( $sym168$BBF_RTV_ALL_EDGES_FROM_NODE, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list169 );
    utilities_macros.register_api_predefined_function( $sym168$BBF_RTV_ALL_EDGES_FROM_NODE );
    Hashtables.sethash( $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T );
    Hashtables.sethash( $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172 );
    utilities_macros.register_api_predefined_function( $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING );
    Hashtables.sethash( $sym174$BBF_RTV, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T );
    Hashtables.sethash( $sym174$BBF_RTV, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list172 );
    utilities_macros.register_api_predefined_function( $sym174$BBF_RTV );
    cb_utilities.setup_cb_link_method( $kw80$RTV_PREDICATE_GRAPH_EVENT, $sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym179$CB_RTV_PREDICATE_GRAPH_EVENT, $kw86$HTML_HANDLER );
    Hashtables.sethash( $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fns$.getGlobalValue(), T );
    Hashtables.sethash( $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS, blue_grapher_utilities.$blue_builder_fn_to_deflist_hash$.getGlobalValue(), $list181 );
    utilities_macros.register_api_predefined_function( $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_rtv_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_rtv_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_rtv_file();
  }
  static
  {
    me = new cb_rtv();
    $cb_rtv_fort_generation_fn$ = null;
    $cb_rtv_fort_parse_fn$ = null;
    $rtv_default_query_mt$ = null;
    $cb_rtv_predicates$ = null;
    $cb_rtv_ask_results$ = null;
    $cb_rtv_collections$ = null;
    $cb_rtv_meta_support_level$ = null;
    $cb_rtv_meta_support_max$ = null;
    $cb_rtv_graph_keys$ = null;
    $str0$RTV = makeString( "RTV" );
    $kw1$MAIN = makeKeyword( "MAIN" );
    $str2$cb_rtv = makeString( "cb-rtv" );
    $kw3$RTV_QUERY = makeKeyword( "RTV-QUERY" );
    $sym4$CB_LINK_RTV_QUERY = makeSymbol( "CB-LINK-RTV-QUERY" );
    $str5$relatedToVia_Query_Tool = makeString( "relatedToVia Query Tool" );
    $sym6$GENERATE_PHRASE = makeSymbol( "GENERATE-PHRASE" );
    $kw7$NL = makeKeyword( "NL" );
    $sym8$FORT_TO_STRING = makeSymbol( "FORT-TO-STRING" );
    $sym9$TERMS_FOR_BROWSING = makeSymbol( "TERMS-FOR-BROWSING" );
    $const10$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym11$_CB_RTV_PREDICATES_ = makeSymbol( "*CB-RTV-PREDICATES*" );
    $list12 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "actors" ) ), constant_handles.reader_make_constant_shell( makeString( "affiliatedWith" ) ), constant_handles
        .reader_make_constant_shell( makeString( "acquaintedWith" ) ), constant_handles.reader_make_constant_shell( makeString( "allies" ) ), constant_handles.reader_make_constant_shell( makeString( "citizens" ) ),
      constant_handles.reader_make_constant_shell( makeString( "containsInformation" ) ), constant_handles.reader_make_constant_shell( makeString( "deliberateActors" ) ), constant_handles.reader_make_constant_shell(
          makeString( "deviceUsed" ) ), constant_handles.reader_make_constant_shell( makeString( "directingAgent" ) ), constant_handles.reader_make_constant_shell( makeString( "doesBusinessWith" ) ), constant_handles
              .reader_make_constant_shell( makeString( "employees" ) ), constant_handles.reader_make_constant_shell( makeString( "eventOccursAt" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "hasLeaders" ) ), constant_handles.reader_make_constant_shell( makeString( "hasOwnershipIn" ) ), constant_handles.reader_make_constant_shell( makeString( "in-ContCompletely" ) ), constant_handles
                      .reader_make_constant_shell( makeString( "inRegion" ) ), constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "performedBy" ) ), constant_handles.reader_make_constant_shell( makeString( "possesses" ) ), constant_handles.reader_make_constant_shell( makeString( "residenceOfOrganization" ) ),
      constant_handles.reader_make_constant_shell( makeString( "subEvents" ) )
    } );
    $sym13$_CB_RTV_ASK_RESULTS_ = makeSymbol( "*CB-RTV-ASK-RESULTS*" );
    $sym14$_CB_RTV_COLLECTIONS_ = makeSymbol( "*CB-RTV-COLLECTIONS*" );
    $sym15$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const16$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const17$RTVDemoCollection = constant_handles.reader_make_constant_shell( makeString( "RTVDemoCollection" ) );
    $list18 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Thing" ) ), constant_handles.reader_make_constant_shell( makeString( "Person" ) ), constant_handles.reader_make_constant_shell(
        makeString( "Place" ) ) );
    $kw19$MT = makeKeyword( "MT" );
    $kw20$RESET = makeKeyword( "RESET" );
    $str21$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str22$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw23$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw24$TERM1 = makeKeyword( "TERM1" );
    $const25$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $kw26$TERM2_TYPE = makeKeyword( "TERM2-TYPE" );
    $kw27$INDIVIDUAL = makeKeyword( "INDIVIDUAL" );
    $kw28$TERM2 = makeKeyword( "TERM2" );
    $kw29$ISA = makeKeyword( "ISA" );
    $kw30$GENL = makeKeyword( "GENL" );
    $kw31$TERM2_ADD_TYPE = makeKeyword( "TERM2-ADD-TYPE" );
    $const32$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $kw33$TERM2_VARIABLE_TYPE = makeKeyword( "TERM2-VARIABLE-TYPE" );
    $kw34$PRED = makeKeyword( "PRED" );
    $const35$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw36$NUM = makeKeyword( "NUM" );
    $kw37$NEW_PRED = makeKeyword( "NEW-PRED" );
    $const38$Predicate = constant_handles.reader_make_constant_shell( makeString( "Predicate" ) );
    $kw39$REMOVE_PREDS = makeKeyword( "REMOVE-PREDS" );
    $kw40$PREDICATES = makeKeyword( "PREDICATES" );
    $kw41$ON = makeKeyword( "ON" );
    $kw42$GENL_PRED_REASONING = makeKeyword( "GENL-PRED-REASONING" );
    $const43$Microtheory = constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) );
    $list44 = ConsesLow.list( makeKeyword( "ISA" ), makeKeyword( "GENL" ) );
    $sym45$_ANY = makeSymbol( "?ANY" );
    $const46$TheSet = constant_handles.reader_make_constant_shell( makeString( "TheSet" ) );
    $kw47$DEPTH = makeKeyword( "DEPTH" );
    $const48$relatedToVia = constant_handles.reader_make_constant_shell( makeString( "relatedToVia" ) );
    $const49$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const50$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const51$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $kw52$ASK_FORMULA = makeKeyword( "ASK-FORMULA" );
    $str53$___ = makeString( " : " );
    $sym54$STRING_ = makeSymbol( "STRING<" );
    $sym55$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $kw56$RUN_QUERY = makeKeyword( "RUN-QUERY" );
    $str57$cg = makeString( "cg" );
    $str58$How_can_the_individual_named_ = makeString( "How can the individual named " );
    $kw59$NBSP = makeKeyword( "NBSP" );
    $str60$be_connected_to_ = makeString( "be connected to " );
    $kw61$KEYWORD = makeKeyword( "KEYWORD" );
    $str62$onChange_javascript_this_form_sub = makeString( "onChange=javascript:this.form.submit();" );
    $kw63$DEFAULT = makeKeyword( "DEFAULT" );
    $str64$the_individual_named = makeString( "the individual named" );
    $str65$any = makeString( "any" );
    $str66$any_type_of = makeString( "any type of" );
    $kw67$FORT = makeKeyword( "FORT" );
    $str68$___ = makeString( "<--" );
    $str69$by_at_most = makeString( "by at most" );
    $str70$links_using_ = makeString( "links using " );
    $str71$_the_selected_relations_and_their = makeString( " the selected relations and their specializations " );
    $kw72$OFF = makeKeyword( "OFF" );
    $str73$_only_the_selected_relations_ = makeString( " only the selected relations " );
    $kw74$CENTER = makeKeyword( "CENTER" );
    $kw75$RED = makeKeyword( "RED" );
    $str76$_ = makeString( "*" );
    $str77$________Add_New_Relation = makeString( "   <--- Add New Relation" );
    $kw78$ADD_PRED = makeKeyword( "ADD-PRED" );
    $str79$_____Remove_Selected_Relations = makeString( "---> Remove Selected Relations" );
    $kw80$RTV_PREDICATE_GRAPH_EVENT = makeKeyword( "RTV-PREDICATE-GRAPH-EVENT" );
    $str81$_Visualize_Selected_Relations_ = makeString( "[Visualize Selected Relations]" );
    $str82$in_the_context_ = makeString( "in the context " );
    $str83$Current_query_formula____A = makeString( "Current query formula : ~A" );
    $sym84$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym85$CB_RTV = makeSymbol( "CB-RTV" );
    $kw86$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str87$Update = makeString( "Update" );
    $kw88$UPDATE = makeKeyword( "UPDATE" );
    $str89$Run_This_Query = makeString( "Run This Query" );
    $str90$Reset_Completely = makeString( "Reset Completely" );
    $str91$No_answers_found_ = makeString( "No answers found." );
    $str92$Query_Results = makeString( "Query Results" );
    $kw93$RTV_GRAPH_EVENT = makeKeyword( "RTV-GRAPH-EVENT" );
    $str94$_Visualize_below_justification_ = makeString( "[Visualize below justification]" );
    $str95$_Visualize_more_justifications_ = makeString( "[Visualize more justifications]" );
    $kw96$EXPANDED_NODE_TO_NODE = makeKeyword( "EXPANDED-NODE-TO-NODE" );
    $str97$_Visualize_justifications_of_all_ = makeString( "[Visualize justifications of all results]" );
    $list98 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "JUSTIFICATION" ) );
    $str99$True__ = makeString( "True: " );
    $kw100$RTV_JUSTIFY_TERM = makeKeyword( "RTV-JUSTIFY-TERM" );
    $str101$_Explain_ = makeString( "[Explain]" );
    $str102$_Visualize_ = makeString( "[Visualize]" );
    $sym103$CB_RTV_JUSTIFY_TERM = makeSymbol( "CB-RTV-JUSTIFY-TERM" );
    $kw104$TERM = makeKeyword( "TERM" );
    $kw105$CB_CYC = makeKeyword( "CB-CYC" );
    $kw106$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw107$SHA1 = makeKeyword( "SHA1" );
    $str108$yui_skin_sam = makeString( "yui-skin-sam" );
    $str109$reloadFrameButton = makeString( "reloadFrameButton" );
    $str110$button = makeString( "button" );
    $str111$reload = makeString( "reload" );
    $str112$Refresh_Frames = makeString( "Refresh Frames" );
    $str113$1 = makeString( "1" );
    $sym114$CB_RTV_JUSTIFY_TERM_OPEN_WINDOW = makeSymbol( "CB-RTV-JUSTIFY-TERM-OPEN-WINDOW" );
    $kw115$SIGNATURE = makeKeyword( "SIGNATURE" );
    $str116$justify_me = makeString( "justify-me" );
    $str117$cb_rtv_justify_term = makeString( "cb-rtv-justify-term" );
    $sym118$CB_LINK_RTV_JUSTIFY_TERM = makeSymbol( "CB-LINK-RTV-JUSTIFY-TERM" );
    $str119$window_open__ = makeString( "window.open('" );
    $str120$__ = makeString( "'," );
    $str121$__A_ = makeString( "'~A'" );
    $str122$null = makeString( "null" );
    $str123$___A____ = makeString( ",'~A'); " );
    $str124$dependent_yes_height_360_width_64 = makeString( "dependent=yes,height=360,width=640,innerheight=360,innerwidth=640,hotkeys=no,directories=no,menubar=no,resizable=yes,scrollbars=yes,toolbar=no" );
    $str125$return_false_ = makeString( "return false;" );
    $sym126$HTML_TABLE_ROW = makeSymbol( "HTML-TABLE-ROW" );
    $list127 = ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-GLYPH" ), makeKeyword( "NBSP" ) ) );
    $sym128$HTML_TABLE_DATA = makeSymbol( "HTML-TABLE-DATA" );
    $str129$meta_supports_ = makeString( "meta_supports_" );
    $str130$text_css = makeString( "text/css" );
    $str131$screen = makeString( "screen" );
    $str132$none = makeString( "none" );
    $str133$ = makeString( "" );
    $kw134$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw135$TEXT = makeKeyword( "TEXT" );
    $str136$_A_meta__D = makeString( "~A_meta_~D" );
    $str137$support = makeString( "support" );
    $str138$additional_supports_ = makeString( "additional_supports_" );
    $str139$Additional_Supports = makeString( "Additional Supports" );
    $kw140$VISIBLE = makeKeyword( "VISIBLE" );
    $str141$_A_additional__D = makeString( "~A_additional_~D" );
    $str142$_A__D = makeString( "~A_~D" );
    $str143$_A_ = makeString( "~A_" );
    $str144$_A_D = makeString( "~A~D" );
    $kw145$TOP = makeKeyword( "TOP" );
    $str146$_S_ = makeString( "~S." );
    $kw147$RTV = makeKeyword( "RTV" );
    $list148 = ConsesLow.list( new SubLObject[] { makeKeyword( "ASK-FORMULA" ), makeKeyword( "FORTS" ), makeKeyword( "PREDS" ), makeKeyword( "MT" ), makeKeyword( "DEPTH" ), makeKeyword( "FILTER-PRED" ), makeKeyword(
        "FILTER-FORT" ), makeKeyword( "SIGNATURE" ), makeKeyword( "GRAPH-TYPE" )
    } );
    $kw149$FORTS = makeKeyword( "FORTS" );
    $kw150$PREDS = makeKeyword( "PREDS" );
    $kw151$FILTER_PRED = makeKeyword( "FILTER-PRED" );
    $kw152$GENLS = makeKeyword( "GENLS" );
    $kw153$FILTER_FORT = makeKeyword( "FILTER-FORT" );
    $kw154$GRAPH_TYPE = makeKeyword( "GRAPH-TYPE" );
    $str155$_A = makeString( "~A" );
    $int156$30 = makeInteger( 30 );
    $str157$cb_rtv_graph_event = makeString( "cb-rtv-graph-event" );
    $sym158$CB_LINK_RTV_GRAPH_EVENT = makeSymbol( "CB-LINK-RTV-GRAPH-EVENT" );
    $sym159$CB_RTV_GRAPH_EVENT_PROCESS = makeSymbol( "CB-RTV-GRAPH-EVENT-PROCESS" );
    $sym160$CB_RTV_GRAPH_EVENT = makeSymbol( "CB-RTV-GRAPH-EVENT" );
    $kw161$BUILDER_FN = makeKeyword( "BUILDER-FN" );
    $sym162$BBF_RTV_ALL_EDGES_BETWEEN = makeSymbol( "BBF-RTV-ALL-EDGES-BETWEEN" );
    $sym163$BBF_RTV_ALL_EDGES_FROM_NODE_SATISFYING = makeSymbol( "BBF-RTV-ALL-EDGES-FROM-NODE-SATISFYING" );
    $kw164$PARAMS = makeKeyword( "PARAMS" );
    $kw165$FORMULA = makeKeyword( "FORMULA" );
    $list166 = ConsesLow.list( makeKeyword( "HELP-STRING" ), makeString(
        "Show links between two FORTS (nodes) through PREDS (links) in MT with maximum path length of DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Currently only one path is shown.)" ) );
    $const167$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $sym168$BBF_RTV_ALL_EDGES_FROM_NODE = makeSymbol( "BBF-RTV-ALL-EDGES-FROM-NODE" );
    $list169 = ConsesLow.list( makeKeyword( "HELP-STRING" ), makeString(
        "Show all from one FORTS (nodes) through PREDS (links) in MT to DEPTH.  (Forts failing FILTER-FNS are filtered.)  (Note that this can make huge graphs for higher values of DEPTH.)" ) );
    $list170 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?ANY" ), constant_handles.reader_make_constant_shell( makeString( "Thing" ) ) );
    $sym171$ASSERTION_FORMULA = makeSymbol( "ASSERTION-FORMULA" );
    $list172 = ConsesLow.list( makeKeyword( "HELP-STRING" ), makeString( "" ) );
    $sym173$RTV_CLAUSE_P = makeSymbol( "RTV-CLAUSE-P" );
    $sym174$BBF_RTV = makeSymbol( "BBF-RTV" );
    $kw175$PRED_SET = makeKeyword( "PRED-SET" );
    $str176$cb_rtv_predicate_graph_event = makeString( "cb-rtv-predicate-graph-event" );
    $sym177$CB_LINK_RTV_PREDICATE_GRAPH_EVENT = makeSymbol( "CB-LINK-RTV-PREDICATE-GRAPH-EVENT" );
    $sym178$CB_RTV_PREDICATE_GRAPH_EVENT_PROCESS = makeSymbol( "CB-RTV-PREDICATE-GRAPH-EVENT-PROCESS" );
    $sym179$CB_RTV_PREDICATE_GRAPH_EVENT = makeSymbol( "CB-RTV-PREDICATE-GRAPH-EVENT" );
    $sym180$BBF_ALL_EDGES_SUBSUMED_BY_PREDS = makeSymbol( "BBF-ALL-EDGES-SUBSUMED-BY-PREDS" );
    $list181 = ConsesLow.list( makeKeyword( "HELP-STRING" ), makeString( "Show all specPreds of PREDS (nodes) in MT." ) );
  }
}
/*
 * 
 * Total time: 1334 ms
 * 
 */