package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava.cycl.inference.harness.balancing_tactician;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_inference_debugger
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_inference_debugger";
  public static final String myFingerPrint = "394517dbd1c887a7bc290f34af643b0da73ba152e06e768c343e0fe886e2cea4";
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 1515L)
  public static SubLSymbol $cb_debug_icon$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3319L)
  public static SubLSymbol $cb_debug_indent_quantum$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3361L)
  private static SubLSymbol $cb_debug_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3443L)
  private static SubLSymbol $cb_debug_duplicate_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3591L)
  private static SubLSymbol $cb_debug_tree$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3645L)
  public static SubLSymbol $cb_current_debug_options$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10938L)
  private static SubLSymbol $cb_debug_options$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12755L)
  private static SubLSymbol $cb_show_hide_value_linktext_pairs$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27522L)
  private static SubLSymbol $cb_debug_max_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27690L)
  private static SubLSymbol $cb_debug_next_object_id$;
  private static final SubLSymbol $kw0$RED_DIAMOND;
  private static final SubLSymbol $sym1$_CB_DEBUG_ICON_;
  private static final SubLSymbol $sym2$_CB_DEBUG_INDENT_QUANTUM_;
  private static final SubLSymbol $kw3$UNINITIALIZED;
  private static final SubLSymbol $sym4$_CB_CURRENT_DEBUG_OPTIONS_;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$HTML_DOCUMENT;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$HTML_FANCY_BODY;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CLET;
  private static final SubLList $list13;
  private static final SubLString $str14$_Debug_Inference__A__A_;
  private static final SubLString $str15$cb_debug_inference_handler;
  private static final SubLSymbol $kw16$DEBUG_INFERENCE;
  private static final SubLSymbol $sym17$CB_LINK_DEBUG_INFERENCE;
  private static final SubLList $list18;
  private static final SubLString $str19$_A_did_not_specify_an_inference;
  private static final SubLSymbol $sym20$CB_DEBUG_OPTION_P;
  private static final SubLString $str21$_A_did_not_specify_valid_debugger;
  private static final SubLString $str22$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str23$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw24$CB_CYC;
  private static final SubLString $str25$Inference_Debugging_Tree_for_;
  private static final SubLSymbol $kw26$INFERENCE;
  private static final SubLSymbol $kw27$VERY_VERBOSE;
  private static final SubLSymbol $sym28$CB_DEBUG_INFERENCE_HANDLER;
  private static final SubLSymbol $kw29$HTML_HANDLER;
  private static final SubLSymbol $kw30$TACTICAL;
  private static final SubLString $str31$_Debug_Problem__A__A_;
  private static final SubLString $str32$_Debug_Problem__A__A_wrt_s_A_;
  private static final SubLString $str33$cb_debug_problem_handler;
  private static final SubLSymbol $kw34$DEBUG_PROBLEM;
  private static final SubLSymbol $sym35$CB_LINK_DEBUG_PROBLEM;
  private static final SubLList $list36;
  private static final SubLString $str37$_A_did_not_specify_a_problem;
  private static final SubLString $str38$_A_did_not_specify_a_strategic_co;
  private static final SubLSymbol $kw39$PROBLEM;
  private static final SubLString $str40$_wrt_;
  private static final SubLSymbol $kw41$STRATEGY;
  private static final SubLSymbol $sym42$CB_DEBUG_PROBLEM_HANDLER;
  private static final SubLString $str43$_Debug_Link__A__A_;
  private static final SubLString $str44$_Debug_Link__A__A_wrt_s_A_;
  private static final SubLString $str45$cb_debug_problem_link_handler;
  private static final SubLSymbol $kw46$DEBUG_PROBLEM_LINK;
  private static final SubLSymbol $sym47$CB_LINK_DEBUG_PROBLEM_LINK;
  private static final SubLList $list48;
  private static final SubLString $str49$_A_did_not_specify_a_link;
  private static final SubLSymbol $kw50$PROBLEM_LINK;
  private static final SubLSymbol $kw51$VERBOSE;
  private static final SubLSymbol $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER;
  private static final SubLSymbol $kw53$SELF;
  private static final SubLString $str54$_A__A__A__A__A;
  private static final SubLString $str55$_A__A__A__A;
  private static final SubLSymbol $kw56$TOP;
  private static final SubLString $str57$Unexpected_cb_debug_link_object__;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$SHOW_SIBLINGS_;
  private static final SubLString $str61$Siblings_;
  private static final SubLSymbol $kw62$SHOW_AUNTS_;
  private static final SubLString $str63$Aunts_;
  private static final SubLSymbol $kw64$DEBUG_NON_NEW_ROOTS_;
  private static final SubLString $str65$Non_New_Roots_;
  private static final SubLSymbol $kw66$DEBUG_GOOD_PROBLEMS_;
  private static final SubLString $str67$Good_Problems_;
  private static final SubLList $list68;
  private static final SubLSymbol $kw69$SHOW_WHICH_QUERIES;
  private static final SubLString $str70$Queries_;
  private static final SubLList $list71;
  private static final SubLSymbol $kw72$SHOW_RULES_;
  private static final SubLString $str73$Rules_;
  private static final SubLSymbol $kw74$SQUARE_PLUS;
  private static final SubLSymbol $kw75$CENTER;
  private static final SubLSymbol $kw76$SQUARE_MINUS;
  private static final SubLString $str77$_;
  private static final SubLSymbol $kw78$DHTML_VISIBILITY;
  private static final SubLString $str79$;
  private static final SubLList $list80;
  private static final SubLString $str81$Ancestor_Depth_;
  private static final SubLString $str82$_;
  private static final SubLString $str83$_;
  private static final SubLSymbol $kw84$ANCESTOR_DEPTH;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$PROPERTY_LIST_P;
  private static final SubLSymbol $kw88$GOOD;
  private static final SubLSymbol $kw89$NEUTRAL;
  private static final SubLSymbol $kw90$NO_GOOD;
  private static final SubLSymbol $kw91$ALL;
  private static final SubLSymbol $kw92$DEAD_END;
  private static final SubLSymbol $kw93$ELLIPSIS;
  private static final SubLSymbol $kw94$RESTRICTION;
  private static final SubLSymbol $sym95$KEYWORDP;
  private static final SubLSymbol $sym96$CB_DEBUG_ARGUMENT_LINK__;
  private static final SubLSymbol $sym97$CB_DEBUG_SUPPORTING_PROBLEM__;
  private static final SubLInteger $int98$212;
  private static final SubLString $str99$root;
  private static final SubLSymbol $kw100$VISIBLE;
  private static final SubLSymbol $kw101$NONE;
  private static final SubLSymbol $kw102$TEXT;
  private static final SubLList $list103;
  private static final SubLSymbol $kw104$SQUARE_BLANK;
  private static final SubLString $str105$___;
  private static final SubLList $list106;
  private static final SubLSymbol $kw107$BLANK_TRIANGLE;
  private static final SubLString $str108$cbd;

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 3690L)
  public static SubLObject html_inference_debug_page(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject focal_object = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    focal_object = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym6$HTML_DOCUMENT, $list7, ConsesLow.listS( $sym8$HTML_FANCY_BODY, $list9, ConsesLow.list( $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS, focal_object ), $list11, ConsesLow.append(
          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4130L)
  public static SubLObject with_debug_inference_indentation_and_recursion_handling(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym12$CLET, $list13, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4348L)
  public static SubLObject cb_link_debug_inference(final SubLObject inference, SubLObject linktext, SubLObject options)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    if( NIL == linktext )
    {
      linktext = PrintLow.format( NIL, $str14$_Debug_Inference__A__A_, store_id, inference_id );
    }
    final SubLObject options_glob_id = cb_parameters.cb_glob_id( options );
    cb_debug_handler_link( $str15$cb_debug_inference_handler, linktext, store_id, inference_id, NIL, options_glob_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 4912L)
  public static SubLObject cb_debug_inference_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject store_id_string = NIL;
    SubLObject inference_id_string = NIL;
    SubLObject options_glob_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list18 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list18 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list18 );
    options_glob_id_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject inference = cb_query.cb_guess_inference( store_id_string, inference_id_string );
      final SubLObject options = cb_lookup_options_by_glob_string( options_glob_id_string );
      if( NIL == inference_datastructures_inference.inference_p( inference ) )
      {
        return cb_utilities.cb_error( $str19$_A_did_not_specify_an_inference, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == list_utilities.plist_of_type_p( options, $sym20$CB_DEBUG_OPTION_P ) )
      {
        return cb_utilities.cb_error( $str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_markup( $str22$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str23$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw24$CB_CYC );
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        dhtml_macros.basic_ajax_scripts();
        dhtml_macros.dhtml_creation_scripts();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_inference_browser.cb_show_relevant_inference_debugging_links( inference );
            html_utilities.html_princ_strong( $str25$Inference_Debugging_Tree_for_ );
            cb_utilities.cb_link( $kw26$INFERENCE, inference, $kw27$VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            cb_show_inference_debugger_option_tweaking_links( inference, inference_datastructures_inference.simplest_inference_strategy( inference ), options );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_debug_inference( inference, options );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
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
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list18 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 5705L)
  public static SubLObject cb_link_debug_problem(final SubLObject problem, final SubLObject strategic_context, SubLObject linktext, SubLObject options)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject problem_id = inference_datastructures_problem.problem_suid( problem );
    final SubLObject strategic_context_id = inference_worker.strategic_context_suid( strategic_context );
    final SubLObject store = inference_datastructures_problem.problem_store( problem );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    if( NIL == linktext )
    {
      if( $kw30$TACTICAL == strategic_context )
      {
        linktext = PrintLow.format( NIL, $str31$_Debug_Problem__A__A_, store_id, problem_id );
      }
      else
      {
        linktext = PrintLow.format( NIL, $str32$_Debug_Problem__A__A_wrt_s_A_, new SubLObject[] { store_id, problem_id, strategic_context_id
        } );
      }
    }
    final SubLObject options_glob_id = cb_parameters.cb_glob_id( options );
    cb_debug_handler_link( $str33$cb_debug_problem_handler, linktext, store_id, problem_id, strategic_context_id, options_glob_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 6568L)
  public static SubLObject cb_debug_problem_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject store_id_string = NIL;
    SubLObject problem_id_string = NIL;
    SubLObject strategic_context_id_string = NIL;
    SubLObject options_glob_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list36 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list36 );
    problem_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list36 );
    strategic_context_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list36 );
    options_glob_id_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject problem = cb_inference_browser.cb_guess_problem( store_id_string, problem_id_string );
      final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context( store_id_string, strategic_context_id_string );
      final SubLObject options = cb_lookup_options_by_glob_string( options_glob_id_string );
      if( NIL == inference_datastructures_problem.problem_p( problem ) )
      {
        return cb_utilities.cb_error( $str37$_A_did_not_specify_a_problem, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == inference_worker.strategic_context_p( strategic_context ) )
      {
        return cb_utilities.cb_error( $str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == list_utilities.plist_of_type_p( options, $sym20$CB_DEBUG_OPTION_P ) )
      {
        return cb_utilities.cb_error( $str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_markup( $str22$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str23$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw24$CB_CYC );
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        dhtml_macros.basic_ajax_scripts();
        dhtml_macros.dhtml_creation_scripts();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_inference_browser.cb_show_relevant_inference_debugging_links( problem );
            html_utilities.html_princ_strong( $str25$Inference_Debugging_Tree_for_ );
            cb_utilities.cb_link( $kw39$PROBLEM, problem, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) )
            {
              html_utilities.html_princ( $str40$_wrt_ );
              cb_utilities.cb_link( $kw41$STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            cb_show_inference_debugger_option_tweaking_links( problem, strategic_context, options );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_debug_problem( problem, strategic_context, options );
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
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list36 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 7682L)
  public static SubLObject cb_link_debug_problem_link(final SubLObject link, final SubLObject strategic_context, SubLObject linktext, SubLObject options)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( options == UNPROVIDED )
    {
      options = NIL;
    }
    final SubLObject link_id = inference_datastructures_problem_link.problem_link_suid( link );
    final SubLObject strategic_context_id = inference_worker.strategic_context_suid( strategic_context );
    final SubLObject store = inference_datastructures_problem_link.problem_link_store( link );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    if( NIL == linktext )
    {
      if( strategic_context == $kw30$TACTICAL )
      {
        linktext = PrintLow.format( NIL, $str43$_Debug_Link__A__A_, store_id, link_id );
      }
      else
      {
        linktext = PrintLow.format( NIL, $str44$_Debug_Link__A__A_wrt_s_A_, new SubLObject[] { store_id, link_id, strategic_context_id
        } );
      }
    }
    final SubLObject options_glob_id = cb_parameters.cb_glob_id( options );
    cb_debug_handler_link( $str45$cb_debug_problem_link_handler, linktext, store_id, link_id, strategic_context_id, options_glob_id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 8538L)
  public static SubLObject cb_debug_problem_link_handler(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject store_id_string = NIL;
    SubLObject link_id_string = NIL;
    SubLObject strategic_context_id_string = NIL;
    SubLObject options_glob_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list48 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list48 );
    link_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list48 );
    strategic_context_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list48 );
    options_glob_id_string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject link = cb_inference_browser.cb_guess_problem_link( store_id_string, link_id_string );
      final SubLObject strategic_context = cb_inference_browser.cb_guess_strategic_context( store_id_string, strategic_context_id_string );
      final SubLObject options = cb_lookup_options_by_glob_string( options_glob_id_string );
      if( NIL == inference_datastructures_problem_link.problem_link_p( link ) )
      {
        return cb_utilities.cb_error( $str49$_A_did_not_specify_a_link, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == inference_worker.strategic_context_p( strategic_context ) )
      {
        return cb_utilities.cb_error( $str38$_A_did_not_specify_a_strategic_co, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == list_utilities.plist_of_type_p( options, $sym20$CB_DEBUG_OPTION_P ) )
      {
        return cb_utilities.cb_error( $str21$_A_did_not_specify_valid_debugger, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      html_utilities.html_markup( $str22$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str23$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw3$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw24$CB_CYC );
        dhtml_macros.dhtml_with_dom_script();
        dhtml_macros.dhtml_with_toggle_visibility_support();
        dhtml_macros.basic_ajax_scripts();
        dhtml_macros.dhtml_creation_scripts();
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$5 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_inference_browser.cb_show_relevant_inference_debugging_links( link );
            html_utilities.html_princ_strong( $str25$Inference_Debugging_Tree_for_ );
            cb_utilities.cb_link( $kw50$PROBLEM_LINK, link, $kw51$VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( NIL != inference_datastructures_strategy.strategy_p( strategic_context ) )
            {
              html_utilities.html_princ( $str40$_wrt_ );
              cb_utilities.cb_link( $kw41$STRATEGY, strategic_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            cb_show_inference_debugger_option_tweaking_links( link, strategic_context, options );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_debug_problem_link( link, strategic_context, options );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$5, thread );
        }
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
      cdestructuring_bind.cdestructuring_bind_error( args, $list48 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 9662L)
  public static SubLObject cb_debug_handler_link(final SubLObject handler_string, final SubLObject linktext, final SubLObject store_id, final SubLObject object_id, final SubLObject strategic_context_id,
      final SubLObject options_glob_id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw53$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    if( NIL != strategic_context_id )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str54$_A__A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, strategic_context_id, options_glob_id
      } );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str55$_A__A__A__A, new SubLObject[] { handler_string, store_id, object_id, options_glob_id
      } );
    }
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
      html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
      if( linktext.isKeyword() )
      {
        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path( linktext );
        final SubLObject align = $kw56$TOP;
        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string( linktext );
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
        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
      }
      else
      {
        html_utilities.html_princ( linktext );
      }
      html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10141L)
  public static SubLObject cb_debug_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject linktext, final SubLObject options)
  {
    SubLObject keyword = NIL;
    if( NIL != inference_datastructures_problem.problem_p( v_object ) )
    {
      keyword = $kw34$DEBUG_PROBLEM;
    }
    else if( NIL != inference_datastructures_problem_link.problem_link_p( v_object ) )
    {
      keyword = $kw46$DEBUG_PROBLEM_LINK;
    }
    else if( NIL != inference_datastructures_inference.inference_p( v_object ) )
    {
      keyword = $kw16$DEBUG_INFERENCE;
    }
    else
    {
      Errors.error( $str57$Unexpected_cb_debug_link_object__, v_object );
    }
    SubLObject arg2 = NIL;
    SubLObject arg3 = NIL;
    SubLObject arg4 = NIL;
    final SubLObject arg5 = NIL;
    if( $kw16$DEBUG_INFERENCE == keyword )
    {
      arg2 = linktext;
      arg3 = options;
    }
    else
    {
      arg2 = strategic_context;
      arg3 = linktext;
      arg4 = options;
    }
    cb_utilities.cb_link( keyword, v_object, arg2, arg3, arg4, arg5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 10758L)
  public static SubLObject cb_lookup_options_by_glob_string(final SubLObject string)
  {
    final SubLObject options = cb_parameters.cb_glob_lookup_by_string( string );
    $cb_current_debug_options$.setDynamicValue( options );
    return options;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12336L)
  public static SubLObject cb_debug_option_p(final SubLObject v_object)
  {
    return list_utilities.alist_has_keyP( $cb_debug_options$.getGlobalValue(), v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12432L)
  public static SubLObject cb_debug_option_default(final SubLObject option)
  {
    assert NIL != cb_debug_option_p( option ) : option;
    return list_utilities.alist_lookup_without_values( $cb_debug_options$.getGlobalValue(), option, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12587L)
  public static SubLObject cb_debug_option_value(final SubLObject option, final SubLObject options)
  {
    assert NIL != cb_debug_option_p( option ) : option;
    return list_utilities.plist_lookup( options, option, cb_debug_option_default( option ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 12870L)
  public static SubLObject cb_show_inference_debugger_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_newline( UNPROVIDED );
    if( NIL == inference_datastructures_inference.inference_p( v_object ) )
    {
      cb_show_ancestor_depth_tweaking_links( v_object, strategic_context, options );
      html_utilities.html_indent( TWO_INTEGER );
      cb_show_option_tweaking_links( v_object, strategic_context, options, $kw60$SHOW_SIBLINGS_, $str61$Siblings_, $cb_show_hide_value_linktext_pairs$.getGlobalValue() );
      html_utilities.html_indent( TWO_INTEGER );
      cb_show_option_tweaking_links( v_object, strategic_context, options, $kw62$SHOW_AUNTS_, $str63$Aunts_, $cb_show_hide_value_linktext_pairs$.getGlobalValue() );
      html_utilities.html_indent( TWO_INTEGER );
    }
    cb_show_option_tweaking_links( v_object, strategic_context, options, $kw64$DEBUG_NON_NEW_ROOTS_, $str65$Non_New_Roots_, $cb_show_hide_value_linktext_pairs$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    cb_show_option_tweaking_links( v_object, strategic_context, options, $kw66$DEBUG_GOOD_PROBLEMS_, $str67$Good_Problems_, $list68 );
    html_utilities.html_indent( TWO_INTEGER );
    cb_show_option_tweaking_links( v_object, strategic_context, options, $kw69$SHOW_WHICH_QUERIES, $str70$Queries_, $list71 );
    html_utilities.html_indent( TWO_INTEGER );
    cb_show_option_tweaking_links( v_object, strategic_context, options, $kw72$SHOW_RULES_, $str73$Rules_, $cb_show_hide_value_linktext_pairs$.getGlobalValue() );
    html_utilities.html_indent( TWO_INTEGER );
    SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw74$SQUARE_PLUS ) );
    SubLObject align = $kw56$TOP;
    SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw74$SQUARE_PLUS );
    SubLObject border = ZERO_INTEGER;
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
    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw76$SQUARE_MINUS ) );
    align = $kw56$TOP;
    alt = cyc_file_dependencies.get_html_icon_alt_string( $kw76$SQUARE_MINUS );
    border = ZERO_INTEGER;
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
    _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
    html_utilities.html_princ( $str77$_ );
    cb_show_option_tweaking_links( v_object, strategic_context, options, $kw78$DHTML_VISIBILITY, $str79$, $list80 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14364L)
  public static SubLObject cb_show_ancestor_depth_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options)
  {
    html_utilities.html_princ( $str81$Ancestor_Depth_ );
    SubLObject cdolist_list_var = $list85;
    SubLObject depth = NIL;
    depth = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject linktext = Sequences.cconcatenate( $str82$_, new SubLObject[] { format_nil.format_nil_a_no_copy( depth ), $str83$_
      } );
      cb_show_option_tweaking_link( v_object, strategic_context, options, $kw84$ANCESTOR_DEPTH, depth, linktext );
      cdolist_list_var = cdolist_list_var.rest();
      depth = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 14692L)
  public static SubLObject cb_show_option_tweaking_links(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject label,
      final SubLObject value_linktext_pairs)
  {
    html_utilities.html_princ( label );
    SubLObject cdolist_list_var = value_linktext_pairs;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = pair;
      SubLObject value = NIL;
      SubLObject linktext = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
      value = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list86 );
      linktext = current.first();
      current = current.rest();
      if( NIL == current )
      {
        html_utilities.html_indent( UNPROVIDED );
        cb_show_option_tweaking_link( v_object, strategic_context, options, option, value, linktext );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list86 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15042L)
  public static SubLObject cb_show_option_tweaking_link(final SubLObject v_object, final SubLObject strategic_context, final SubLObject options, final SubLObject option, final SubLObject value, final SubLObject linktext)
  {
    final SubLObject current_value = cb_debug_option_value( option, options );
    final SubLObject sameP = Equality.eq( value, current_value );
    SubLObject new_options = ( NIL != sameP ) ? options : conses_high.copy_list( options );
    if( NIL == sameP )
    {
      new_options = conses_high.putf( new_options, option, value );
    }
    final SubLObject strong_var = sameP;
    final SubLObject head = ( NIL != strong_var ) ? html_macros.$html_strong_head$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
    final SubLObject tail = ( NIL != strong_var ) ? html_macros.$html_strong_tail$.getGlobalValue() : string_utilities.$empty_string$.getGlobalValue();
    html_utilities.html_markup( head );
    cb_debug_link( v_object, strategic_context, linktext, new_options );
    html_utilities.html_markup( tail );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15491L)
  public static SubLObject cb_debug_inference(final SubLObject inference, final SubLObject options)
  {
    assert NIL != list_utilities.property_list_p( options ) : options;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != cb_debug_option_p( property ) : property;
    }
    return cb_debug_problem_link( inference_datastructures_inference.inference_root_link( inference ), inference_datastructures_inference.simplest_inference_strategy( inference ), options );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 15744L)
  public static SubLObject cb_debug_problem(final SubLObject problem, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.property_list_p( options ) : options;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != cb_debug_option_p( property ) : property;
    }
    thread.resetMultipleValues();
    final SubLObject ancestor_layers = cb_debug_compute_ancestor_layers( problem, options );
    final SubLObject ancestors_to_display = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding( thread );
    try
    {
      $cb_debug_depth$.bind( ZERO_INTEGER, thread );
      $cb_debug_tree$.bind( NIL, thread );
      $cb_debug_duplicate_tree$.bind( set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
      if( NIL != ancestor_layers )
      {
        cb_debug_ancestors( ancestor_layers, strategic_context, problem, ancestors_to_display, options );
      }
      else
      {
        cb_debug_problem_int( problem, strategic_context, problem, NIL, options );
      }
      cb_debug_display_tree( Sequences.nreverse( $cb_debug_tree$.getDynamicValue( thread ) ), strategic_context, options );
    }
    finally
    {
      $cb_debug_duplicate_tree$.rebind( _prev_bind_3, thread );
      $cb_debug_tree$.rebind( _prev_bind_2, thread );
      $cb_debug_depth$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 16391L)
  public static SubLObject cb_debug_problem_link(final SubLObject link, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != list_utilities.property_list_p( options ) : options;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = options; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != cb_debug_option_p( property ) : property;
    }
    final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
    SubLObject ancestor_layers = NIL;
    SubLObject ancestors_to_display = NIL;
    if( NIL != supported_problem )
    {
      thread.resetMultipleValues();
      final SubLObject ancestor_layers_$8 = cb_debug_compute_ancestor_layers( supported_problem, options );
      final SubLObject ancestors_to_display_$9 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      ancestor_layers = ancestor_layers_$8;
      ancestors_to_display = ancestors_to_display_$9;
      set.set_add( link, ancestors_to_display );
    }
    final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $cb_debug_tree$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $cb_debug_duplicate_tree$.currentBinding( thread );
    try
    {
      $cb_debug_depth$.bind( ZERO_INTEGER, thread );
      $cb_debug_tree$.bind( NIL, thread );
      $cb_debug_duplicate_tree$.bind( set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED ), thread );
      if( NIL != ancestor_layers )
      {
        cb_debug_ancestors( ancestor_layers, strategic_context, link, ancestors_to_display, options );
      }
      else
      {
        cb_debug_problem_link_int( link, strategic_context, link, NIL, options );
      }
      cb_debug_display_tree( Sequences.nreverse( $cb_debug_tree$.getDynamicValue( thread ) ), strategic_context, options );
    }
    finally
    {
      $cb_debug_duplicate_tree$.rebind( _prev_bind_3, thread );
      $cb_debug_tree$.rebind( _prev_bind_2, thread );
      $cb_debug_depth$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17229L)
  public static SubLObject cb_debug_ancestors(final SubLObject ancestor_layers, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject ancestors_to_display, final SubLObject options)
  {
    final SubLObject first_layer = ancestor_layers.first();
    if( NIL != set.set_emptyP( first_layer ) )
    {
      final SubLObject set_var = conses_high.second( ancestor_layers );
      final SubLObject set_contents_var = set.do_set_internal( set_var );
      SubLObject basis_object;
      SubLObject state;
      SubLObject root_link;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        root_link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, root_link ) )
        {
          cb_debug_problem_link_int( root_link, strategic_context, focal_object, ancestors_to_display, options );
        }
      }
    }
    else
    {
      final SubLObject set_contents_var2 = set.do_set_internal( first_layer );
      SubLObject basis_object2;
      SubLObject state2;
      SubLObject root_problem;
      for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2, set_contents_var2 ); NIL == set_contents
          .do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
      {
        root_problem = set_contents.do_set_contents_next( basis_object2, state2 );
        if( NIL != set_contents.do_set_contents_element_validP( state2, root_problem ) )
        {
          cb_debug_problem_int( root_problem, strategic_context, focal_object, ancestors_to_display, options );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 17742L)
  public static SubLObject cb_debug_compute_ancestor_layers(final SubLObject start_problem, final SubLObject options)
  {
    SubLObject layer = set.new_set( Symbols.symbol_function( EQ ), ONE_INTEGER );
    final SubLObject all_ancestors_set = set.new_set( Symbols.symbol_function( EQ ), ONE_INTEGER );
    SubLObject ancestor_layers = NIL;
    final SubLObject ancestor_depth = cb_debug_option_value( $kw84$ANCESTOR_DEPTH, options );
    set.set_add( start_problem, layer );
    set.set_add( start_problem, all_ancestors_set );
    while ( NIL == set.set_emptyP( layer ) && !ancestor_depth.numE( Numbers.integerDivide( Sequences.length( ancestor_layers ), TWO_INTEGER ) ))
    {
      final SubLObject new_layer = set.new_set( Symbols.symbol_function( EQ ), UNPROVIDED );
      if( NIL != inference_datastructures_problem.problem_p( set_utilities.set_arbitrary_element( layer ) ) )
      {
        final SubLObject set_contents_var = set.do_set_internal( layer );
        SubLObject basis_object;
        SubLObject state;
        SubLObject problem;
        SubLObject set_contents_var_$10;
        SubLObject basis_object_$11;
        SubLObject state_$12;
        SubLObject link;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          problem = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, problem ) )
          {
            set_contents_var_$10 = inference_datastructures_problem.problem_dependent_links( problem );
            for( basis_object_$11 = set_contents.do_set_contents_basis_object( set_contents_var_$10 ), state_$12 = NIL, state_$12 = set_contents.do_set_contents_initial_state( basis_object_$11,
                set_contents_var_$10 ); NIL == set_contents.do_set_contents_doneP( basis_object_$11, state_$12 ); state_$12 = set_contents.do_set_contents_update_state( state_$12 ) )
            {
              link = set_contents.do_set_contents_next( basis_object_$11, state_$12 );
              if( NIL != set_contents.do_set_contents_element_validP( state_$12, link ) && NIL == set.set_memberP( link, all_ancestors_set ) )
              {
                set.set_add( link, new_layer );
                set.set_add( link, all_ancestors_set );
              }
            }
          }
        }
      }
      else
      {
        final SubLObject set_contents_var = set.do_set_internal( layer );
        SubLObject basis_object;
        SubLObject state;
        SubLObject link2;
        SubLObject problem2;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          link2 = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, link2 ) )
          {
            problem2 = inference_datastructures_problem_link.problem_link_supported_object( link2 );
            if( NIL != inference_datastructures_problem.problem_p( problem2 ) && NIL == set.set_memberP( problem2, all_ancestors_set ) )
            {
              set.set_add( problem2, new_layer );
              set.set_add( problem2, all_ancestors_set );
            }
          }
        }
      }
      ancestor_layers = ConsesLow.cons( new_layer, ancestor_layers );
      layer = new_layer;
    }
    if( NIL != cb_debug_option_value( $kw60$SHOW_SIBLINGS_, options ) )
    {
      final SubLObject parents_set = list_utilities.nth_from_end( ONE_INTEGER, ancestor_layers );
      if( NIL != parents_set )
      {
        final SubLObject set_contents_var = set.do_set_internal( parents_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject parent_problem;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          parent_problem = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, parent_problem ) )
          {
            cb_debug_add_children_and_links_to_set( parent_problem, all_ancestors_set );
          }
        }
      }
    }
    if( NIL != cb_debug_option_value( $kw62$SHOW_AUNTS_, options ) )
    {
      final SubLObject grandparents_set = list_utilities.nth_from_end( THREE_INTEGER, ancestor_layers );
      if( NIL != grandparents_set )
      {
        final SubLObject set_contents_var = set.do_set_internal( grandparents_set );
        SubLObject basis_object;
        SubLObject state;
        SubLObject grandparent_problem;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          grandparent_problem = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, grandparent_problem ) )
          {
            cb_debug_add_children_and_links_to_set( grandparent_problem, all_ancestors_set );
          }
        }
      }
    }
    return Values.values( ancestor_layers, all_ancestors_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 19700L)
  public static SubLObject cb_debug_add_children_and_links_to_set(final SubLObject problem, final SubLObject v_set)
  {
    final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject child_link;
    SubLObject link_var;
    SubLObject cdolist_list_var;
    SubLObject supporting_mapped_problem;
    SubLObject child_problem;
    SubLObject variable_map;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      child_link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, child_link ) )
      {
        set.set_add( child_link, v_set );
        link_var = child_link;
        cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link_var );
        supporting_mapped_problem = NIL;
        supporting_mapped_problem = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link_var, supporting_mapped_problem ) )
          {
            child_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
            variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
            set.set_add( child_problem, v_set );
          }
          cdolist_list_var = cdolist_list_var.rest();
          supporting_mapped_problem = cdolist_list_var.first();
        }
      }
    }
    return v_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 20007L)
  public static SubLObject cb_debug_problem_int(final SubLObject problem, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != display_only_these && NIL == set.set_memberP( problem, display_only_these ) )
    {
      return NIL;
    }
    final SubLObject ellipsisP = makeBoolean( NIL == set.set_add( problem, $cb_debug_duplicate_tree$.getDynamicValue( thread ) ) );
    final SubLObject pcase_var = inference_datastructures_strategy.problem_provability_status( problem, strategic_context );
    if( pcase_var.eql( $kw88$GOOD ) )
    {
      final SubLObject debug_goodsP = cb_debug_option_value( $kw66$DEBUG_GOOD_PROBLEMS_, options );
      cb_debug_problem_parametrized( problem, strategic_context, debug_goodsP, debug_goodsP, ellipsisP, focal_object, display_only_these, options );
    }
    else if( pcase_var.eql( $kw89$NEUTRAL ) )
    {
      cb_debug_problem_parametrized( problem, strategic_context, T, T, ellipsisP, focal_object, display_only_these, options );
    }
    else if( pcase_var.eql( $kw90$NO_GOOD ) )
    {
      cb_debug_problem_parametrized( problem, strategic_context, T, NIL, ellipsisP, focal_object, display_only_these, options );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 21050L)
  public static SubLObject cb_debug_problem_parametrized(final SubLObject problem, final SubLObject strategic_context, final SubLObject show_queryP, SubLObject compute_and_show_argument_linksP,
      final SubLObject ellipsisP, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject is_focal_objectP = NIL;
    if( problem.eql( focal_object ) )
    {
      is_focal_objectP = T;
      display_only_these = NIL;
    }
    if( NIL != display_only_these )
    {
      compute_and_show_argument_linksP = T;
    }
    if( NIL != ellipsisP )
    {
      compute_and_show_argument_linksP = NIL;
    }
    SubLObject argument_links = NIL;
    if( NIL != compute_and_show_argument_linksP )
    {
      SubLObject cdolist_list_var;
      final SubLObject all_argument_links = cdolist_list_var = inference_datastructures_problem.problem_all_argument_links( problem );
      SubLObject link = NIL;
      link = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != ( ( NIL != display_only_these ) ? set.set_memberP( link, display_only_these ) : cb_show_problem_link_for_debuggingP( link, strategic_context, options ) ) )
        {
          argument_links = ConsesLow.cons( link, argument_links );
        }
        cdolist_list_var = cdolist_list_var.rest();
        link = cdolist_list_var.first();
      }
      argument_links = cb_debug_sort_argument_links( argument_links );
    }
    SubLObject query = NIL;
    if( NIL != show_queryP )
    {
      final SubLObject show_which_queries = cb_debug_option_value( $kw69$SHOW_WHICH_QUERIES, options );
      if( $kw91$ALL == show_which_queries || ( $kw92$DEAD_END == show_which_queries && NIL == argument_links ) )
      {
        query = inference_czer.problem_query_formula( inference_datastructures_problem.problem_query( problem ) );
      }
    }
    cb_debug_add_node_to_tree( $kw39$PROBLEM, ConsesLow.list( problem, is_focal_objectP, query ) );
    if( NIL != ellipsisP )
    {
      final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding( thread );
      try
      {
        $cb_debug_depth$.bind( number_utilities.f_1X( $cb_debug_depth$.getDynamicValue( thread ) ), thread );
        cb_debug_add_node_to_tree( $kw93$ELLIPSIS, NIL );
      }
      finally
      {
        $cb_debug_depth$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != compute_and_show_argument_linksP )
    {
      final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding( thread );
      try
      {
        $cb_debug_depth$.bind( number_utilities.f_1X( $cb_debug_depth$.getDynamicValue( thread ) ), thread );
        SubLObject cdolist_list_var = argument_links;
        SubLObject link = NIL;
        link = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cb_debug_problem_link_int( link, strategic_context, focal_object, display_only_these, options );
          cdolist_list_var = cdolist_list_var.rest();
          link = cdolist_list_var.first();
        }
      }
      finally
      {
        $cb_debug_depth$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 22898L)
  public static SubLObject cb_show_problem_link_for_debuggingP(final SubLObject link, final SubLObject strategic_context, final SubLObject options)
  {
    if( NIL != inference_worker.connected_conjunction_link_p( link ) && NIL != inference_datastructures_problem_link.problem_link_closedP( link ) )
    {
      return NIL;
    }
    if( NIL != balancing_tactician.balancing_tactician_p( strategic_context ) )
    {
      if( NIL != cb_debug_option_value( $kw64$DEBUG_NON_NEW_ROOTS_, options ) )
      {
        return T;
      }
      SubLObject link_leads_to_new_rootP;
      SubLObject rest;
      SubLObject supporting_mapped_problem;
      SubLObject supporting_problem;
      SubLObject variable_map;
      for( link_leads_to_new_rootP = NIL, rest = NIL, rest = inference_datastructures_problem_link.problem_link_supporting_mapped_problems( link ); NIL == link_leads_to_new_rootP && NIL != rest; rest = rest.rest() )
      {
        supporting_mapped_problem = rest.first();
        if( NIL != inference_macros.do_problem_link_open_matchP( NIL, link, supporting_mapped_problem ) )
        {
          supporting_problem = inference_datastructures_problem_link.mapped_problem_problem( supporting_mapped_problem );
          variable_map = inference_datastructures_problem_link.mapped_problem_variable_map( supporting_mapped_problem );
          if( NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP( strategic_context, supporting_problem ) )
          {
            link_leads_to_new_rootP = T;
          }
        }
      }
      if( NIL != inference_worker_join_ordered.join_ordered_link_p( link ) && NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP( link ) )
      {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( inference_worker_join_ordered.join_ordered_link_non_focal_problem( link ) );
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        SubLObject restricted_non_focal;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == link_leads_to_new_rootP
            && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          restriction_link = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, restriction_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( restriction_link, $kw94$RESTRICTION )
              && NIL != inference_worker_join_ordered.non_focal_restriction_link_with_corresponding_focal_proofP( restriction_link, link ) )
          {
            restricted_non_focal = inference_datastructures_problem_link.problem_link_sole_supporting_problem( restriction_link );
            if( NIL != balancing_tactician.balancing_tactician_problem_motivated_wrt_nP( strategic_context, restricted_non_focal ) )
            {
              link_leads_to_new_rootP = T;
            }
          }
        }
      }
      if( NIL == link_leads_to_new_rootP )
      {
        return NIL;
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 24000L)
  public static SubLObject cb_debug_problem_link_int(final SubLObject link, final SubLObject strategic_context, final SubLObject focal_object, SubLObject display_only_these, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject is_focal_objectP = NIL;
    if( link.eql( focal_object ) )
    {
      is_focal_objectP = T;
      display_only_these = NIL;
    }
    if( NIL != display_only_these && NIL == set.set_memberP( link, display_only_these ) )
    {
      return NIL;
    }
    SubLObject rule = NIL;
    if( NIL != cb_debug_option_value( $kw72$SHOW_RULES_, options ) && NIL != inference_worker_transformation.generalized_transformation_link_p( link ) )
    {
      rule = inference_worker_transformation.generalized_transformation_link_rule_assertion( link );
    }
    cb_debug_add_node_to_tree( $kw50$PROBLEM_LINK, ConsesLow.list( link, is_focal_objectP, rule ) );
    final SubLObject _prev_bind_0 = $cb_debug_depth$.currentBinding( thread );
    try
    {
      $cb_debug_depth$.bind( number_utilities.f_1X( $cb_debug_depth$.getDynamicValue( thread ) ), thread );
      final SubLObject supporting_problems = cb_debug_sort_supporting_problems( inference_datastructures_problem_link.problem_link_supporting_problems( link ) );
      if( NIL != inference_worker_join_ordered.join_ordered_link_p( link ) )
      {
        cb_debug_join_ordered_link_guts( link, strategic_context, focal_object, display_only_these, options );
      }
      else
      {
        SubLObject cdolist_list_var = supporting_problems;
        SubLObject problem = NIL;
        problem = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cb_debug_problem_int( problem, strategic_context, focal_object, display_only_these, options );
          cdolist_list_var = cdolist_list_var.rest();
          problem = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      $cb_debug_depth$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 25135L)
  public static SubLObject cb_debug_join_ordered_link_guts(final SubLObject join_ordered_link, final SubLObject strategic_context, final SubLObject focal_object, final SubLObject display_only_these,
      final SubLObject options)
  {
    final SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem( join_ordered_link );
    cb_debug_problem_int( focal_problem, strategic_context, focal_object, display_only_these, options );
    if( NIL != inference_worker_join_ordered.join_ordered_link_non_focal_manifestedP( join_ordered_link ) )
    {
      final SubLObject non_focal_problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem( join_ordered_link );
      if( NIL != inference_worker.good_problem_p( focal_problem, strategic_context ) )
      {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links( non_focal_problem );
        SubLObject basis_object;
        SubLObject state;
        SubLObject restriction_link;
        for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
            .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
        {
          restriction_link = set_contents.do_set_contents_next( basis_object, state );
          if( NIL != set_contents.do_set_contents_element_validP( state, restriction_link ) && NIL != inference_datastructures_problem_link.problem_link_has_typeP( restriction_link, $kw94$RESTRICTION )
              && NIL != cb_show_problem_link_for_debuggingP( restriction_link, strategic_context, options ) )
          {
            cb_debug_problem_link_int( restriction_link, strategic_context, focal_object, display_only_these, options );
          }
        }
      }
      else
      {
        cb_debug_problem_int( non_focal_problem, strategic_context, focal_object, display_only_these, options );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26070L)
  public static SubLObject cb_debug_add_node_to_tree(final SubLObject node_type, final SubLObject data)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( node_type ) : node_type;
    final SubLObject node = ConsesLow.listS( node_type, $cb_debug_depth$.getDynamicValue( thread ), data );
    $cb_debug_tree$.setDynamicValue( ConsesLow.cons( node, $cb_debug_tree$.getDynamicValue( thread ) ), thread );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26292L)
  public static SubLObject cb_debug_sort_argument_links(final SubLObject links)
  {
    return Sort.sort( links, $sym96$CB_DEBUG_ARGUMENT_LINK__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26394L)
  public static SubLObject cb_debug_argument_link_L(final SubLObject link1, final SubLObject link2)
  {
    if( NIL != good_problem_link_p( link1 ) )
    {
      if( NIL != good_problem_link_p( link2 ) )
      {
        return problem_link_suid_L( link1, link2 );
      }
      return T;
    }
    else
    {
      if( NIL != good_problem_link_p( link2 ) )
      {
        return NIL;
      }
      return problem_link_suid_L( link1, link2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26687L)
  public static SubLObject problem_link_suid_L(final SubLObject link1, final SubLObject link2)
  {
    return Numbers.numL( inference_datastructures_problem_link.problem_link_suid( link1 ), inference_datastructures_problem_link.problem_link_suid( link2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26803L)
  public static SubLObject good_problem_link_p(final SubLObject link)
  {
    return inference_datastructures_problem_link.problem_link_has_some_proofP( link, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 26892L)
  public static SubLObject cb_debug_sort_supporting_problems(final SubLObject problems)
  {
    return Sort.sort( problems, $sym97$CB_DEBUG_SUPPORTING_PROBLEM__, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27011L)
  public static SubLObject cb_debug_supporting_problem_L(final SubLObject problem1, final SubLObject problem2)
  {
    if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem1 ) )
    {
      if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
      {
        return problem_suid_L( problem1, problem2 );
      }
      return T;
    }
    else
    {
      if( NIL != inference_datastructures_problem.tactically_good_problem_p( problem2 ) )
      {
        return NIL;
      }
      return problem_suid_L( problem1, problem2 );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27409L)
  public static SubLObject problem_suid_L(final SubLObject problem1, final SubLObject problem2)
  {
    return Numbers.numL( inference_datastructures_problem.problem_suid( problem1 ), inference_datastructures_problem.problem_suid( problem2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27779L)
  public static SubLObject cb_debug_display_tree(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $cb_debug_next_object_id$.currentBinding( thread );
    try
    {
      $cb_debug_next_object_id$.bind( ZERO_INTEGER, thread );
      cb_debug_display_tree_children( debug_tree, ZERO_INTEGER, $str99$root, strategic_context, options );
    }
    finally
    {
      $cb_debug_next_object_id$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 27994L)
  public static SubLObject cb_debug_display_tree_children(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject parent_id, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject visibility = cb_debug_option_value( $kw78$DHTML_VISIBILITY, options );
    if( $str99$root.equal( parent_id ) )
    {
      visibility = $kw100$VISIBLE;
    }
    if( $kw101$NONE == visibility )
    {
      cb_debug_display_tree_children_int( debug_tree, exact_depth, strategic_context, options );
    }
    else
    {
      dhtml_macros.dhtml_set_switched_visibility( parent_id, visibility, $kw102$TEXT );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      if( NIL != parent_id )
      {
        html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( parent_id );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_debug_display_tree_children_int( debug_tree, exact_depth, strategic_context, options );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 28630L)
  public static SubLObject cb_debug_display_tree_children_int(final SubLObject debug_tree, final SubLObject exact_depth, final SubLObject strategic_context, final SubLObject options)
  {
    SubLObject done_with_this_subtreeP;
    SubLObject subtree;
    SubLObject child_node;
    SubLObject child_depth;
    for( done_with_this_subtreeP = NIL, subtree = NIL, subtree = debug_tree; NIL != subtree && NIL == done_with_this_subtreeP; subtree = subtree.rest() )
    {
      child_node = subtree.first();
      child_depth = conses_high.second( child_node );
      if( child_depth.eql( exact_depth ) )
      {
        cb_debug_display_tree_int( subtree, strategic_context, options );
      }
      else if( child_depth.numL( exact_depth ) )
      {
        done_with_this_subtreeP = T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 29150L)
  public static SubLObject cb_debug_display_tree_int(final SubLObject debug_tree, final SubLObject strategic_context, final SubLObject options)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject node = debug_tree.first();
    final SubLObject lookhead_node = conses_high.second( debug_tree );
    SubLObject current;
    final SubLObject datum = current = node;
    SubLObject node_type = NIL;
    SubLObject depth = NIL;
    SubLObject data = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    node_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    depth = current.first();
    current = ( data = current.rest() );
    if( depth.numG( $cb_debug_max_depth$.getGlobalValue() ) )
    {
      node_type = $kw93$ELLIPSIS;
    }
    if( $kw93$ELLIPSIS == node_type )
    {
      cb_debug_indent_the_right_amount( depth );
      if( $kw101$NONE != cb_debug_option_value( $kw78$DHTML_VISIBILITY, options ) )
      {
        final SubLObject image_src = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw104$SQUARE_BLANK ) );
        final SubLObject align = $kw56$TOP;
        final SubLObject alt = cyc_file_dependencies.get_html_icon_alt_string( $kw104$SQUARE_BLANK );
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
        html_utilities.html_indent( UNPROVIDED );
      }
      html_utilities.html_princ( $str105$___ );
      html_utilities.html_newline( UNPROVIDED );
    }
    else
    {
      SubLObject current_$15;
      final SubLObject datum_$14 = current_$15 = data;
      SubLObject v_object = NIL;
      SubLObject is_focal_objectP = NIL;
      SubLObject query_or_rule = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list106 );
      v_object = current_$15.first();
      current_$15 = current_$15.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list106 );
      is_focal_objectP = current_$15.first();
      current_$15 = current_$15.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list106 );
      query_or_rule = current_$15.first();
      current_$15 = current_$15.rest();
      if( NIL == current_$15 )
      {
        final SubLObject object_id = cb_debug_next_object_id_string();
        cb_debug_indent_the_right_amount( depth );
        if( $kw101$NONE != cb_debug_option_value( $kw78$DHTML_VISIBILITY, options ) )
        {
          if( NIL == lookhead_node || $kw93$ELLIPSIS == lookhead_node.first() || conses_high.second( lookhead_node ).numLE( depth ) )
          {
            final SubLObject image_src2 = Sequences.cconcatenate( system_parameters.$html_image_directory$.getDynamicValue( thread ), cyc_file_dependencies.html_icon_src( $kw107$BLANK_TRIANGLE ) );
            final SubLObject align2 = $kw56$TOP;
            final SubLObject alt2 = cyc_file_dependencies.get_html_icon_alt_string( $kw107$BLANK_TRIANGLE );
            final SubLObject border2 = ZERO_INTEGER;
            html_utilities.html_markup( html_macros.$html_image_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_image_src$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( image_src2 );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != alt2 )
            {
              html_utilities.html_markup( html_macros.$html_image_alt$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( alt2 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != align2 )
            {
              html_utilities.html_markup( html_macros.$html_image_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( align2 ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != border2 )
            {
              html_utilities.html_markup( html_macros.$html_image_border$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( border2 );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
            }
            html_utilities.html_markup( html_macros.$html_image_tail$.getGlobalValue() );
            html_utilities.html_indent( UNPROVIDED );
          }
          else
          {
            dhtml_macros.dhtml_switch_visibility_links_plus_minus( object_id, $str79$ );
          }
        }
        cb_debug_link( v_object, strategic_context, $cb_debug_icon$.getDynamicValue( thread ), options );
        if( NIL != is_focal_objectP )
        {
          final SubLObject size_val = FIVE_INTEGER;
          html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
          if( NIL != size_val )
          {
            html_utilities.html_markup( html_macros.$html_font_size$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( size_val );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            cb_utilities.cb_link( node_type, v_object, $kw51$VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_3, thread );
          }
          html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
        }
        else
        {
          cb_utilities.cb_link( node_type, v_object, $kw51$VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != query_or_rule )
        {
          cb_debug_inference_form( query_or_rule, depth );
        }
        html_utilities.html_newline( UNPROVIDED );
        cb_debug_display_tree_children( debug_tree.rest(), number_utilities.f_1X( depth ), object_id, strategic_context, options );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$14, $list106 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 30984L)
  public static SubLObject cb_debug_next_object_id_string()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject string = Sequences.cconcatenate( $str108$cbd, string_utilities.str( $cb_debug_next_object_id$.getDynamicValue( thread ) ) );
    $cb_debug_next_object_id$.setDynamicValue( Numbers.add( $cb_debug_next_object_id$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31163L)
  public static SubLObject cb_debug_indent_the_right_amount(final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_indent( Numbers.multiply( depth, $cb_debug_indent_quantum$.getDynamicValue( thread ) ) );
    return depth;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-inference-debugger.lisp", position = 31288L)
  public static SubLObject cb_debug_inference_form(final SubLObject v_object, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return cb_utilities.cb_form( v_object, Numbers.add( TWO_INTEGER, Numbers.integerDivide( Numbers.multiply( depth, $cb_debug_indent_quantum$.getDynamicValue( thread ) ), TWO_INTEGER ) ), T );
  }

  public static SubLObject declare_cb_inference_debugger_file()
  {
    SubLFiles.declareMacro( me, "html_inference_debug_page", "HTML-INFERENCE-DEBUG-PAGE" );
    SubLFiles.declareMacro( me, "with_debug_inference_indentation_and_recursion_handling", "WITH-DEBUG-INFERENCE-INDENTATION-AND-RECURSION-HANDLING" );
    SubLFiles.declareFunction( me, "cb_link_debug_inference", "CB-LINK-DEBUG-INFERENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_debug_inference_handler", "CB-DEBUG-INFERENCE-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_debug_problem", "CB-LINK-DEBUG-PROBLEM", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_handler", "CB-DEBUG-PROBLEM-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_debug_problem_link", "CB-LINK-DEBUG-PROBLEM-LINK", 2, 2, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_link_handler", "CB-DEBUG-PROBLEM-LINK-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_handler_link", "CB-DEBUG-HANDLER-LINK", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_link", "CB-DEBUG-LINK", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_lookup_options_by_glob_string", "CB-LOOKUP-OPTIONS-BY-GLOB-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_option_p", "CB-DEBUG-OPTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_option_default", "CB-DEBUG-OPTION-DEFAULT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_option_value", "CB-DEBUG-OPTION-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_debugger_option_tweaking_links", "CB-SHOW-INFERENCE-DEBUGGER-OPTION-TWEAKING-LINKS", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_ancestor_depth_tweaking_links", "CB-SHOW-ANCESTOR-DEPTH-TWEAKING-LINKS", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_option_tweaking_links", "CB-SHOW-OPTION-TWEAKING-LINKS", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_show_option_tweaking_link", "CB-SHOW-OPTION-TWEAKING-LINK", 6, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_inference", "CB-DEBUG-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_problem", "CB-DEBUG-PROBLEM", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_link", "CB-DEBUG-PROBLEM-LINK", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_ancestors", "CB-DEBUG-ANCESTORS", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_compute_ancestor_layers", "CB-DEBUG-COMPUTE-ANCESTOR-LAYERS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_add_children_and_links_to_set", "CB-DEBUG-ADD-CHILDREN-AND-LINKS-TO-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_int", "CB-DEBUG-PROBLEM-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_parametrized", "CB-DEBUG-PROBLEM-PARAMETRIZED", 8, 0, false );
    SubLFiles.declareFunction( me, "cb_show_problem_link_for_debuggingP", "CB-SHOW-PROBLEM-LINK-FOR-DEBUGGING?", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_problem_link_int", "CB-DEBUG-PROBLEM-LINK-INT", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_join_ordered_link_guts", "CB-DEBUG-JOIN-ORDERED-LINK-GUTS", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_add_node_to_tree", "CB-DEBUG-ADD-NODE-TO-TREE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_sort_argument_links", "CB-DEBUG-SORT-ARGUMENT-LINKS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_argument_link_L", "CB-DEBUG-ARGUMENT-LINK-<", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_link_suid_L", "PROBLEM-LINK-SUID-<", 2, 0, false );
    SubLFiles.declareFunction( me, "good_problem_link_p", "GOOD-PROBLEM-LINK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_sort_supporting_problems", "CB-DEBUG-SORT-SUPPORTING-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_supporting_problem_L", "CB-DEBUG-SUPPORTING-PROBLEM-<", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_suid_L", "PROBLEM-SUID-<", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_display_tree", "CB-DEBUG-DISPLAY-TREE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_display_tree_children", "CB-DEBUG-DISPLAY-TREE-CHILDREN", 5, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_display_tree_children_int", "CB-DEBUG-DISPLAY-TREE-CHILDREN-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_display_tree_int", "CB-DEBUG-DISPLAY-TREE-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_next_object_id_string", "CB-DEBUG-NEXT-OBJECT-ID-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_indent_the_right_amount", "CB-DEBUG-INDENT-THE-RIGHT-AMOUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_debug_inference_form", "CB-DEBUG-INFERENCE-FORM", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_inference_debugger_file()
  {
    $cb_debug_icon$ = SubLFiles.defvar( "*CB-DEBUG-ICON*", $kw0$RED_DIAMOND );
    $cb_debug_indent_quantum$ = SubLFiles.defvar( "*CB-DEBUG-INDENT-QUANTUM*", FOUR_INTEGER );
    $cb_debug_depth$ = SubLFiles.defparameter( "*CB-DEBUG-DEPTH*", $kw3$UNINITIALIZED );
    $cb_debug_duplicate_tree$ = SubLFiles.defparameter( "*CB-DEBUG-DUPLICATE-TREE*", $kw3$UNINITIALIZED );
    $cb_debug_tree$ = SubLFiles.defparameter( "*CB-DEBUG-TREE*", $kw3$UNINITIALIZED );
    $cb_current_debug_options$ = SubLFiles.defvar( "*CB-CURRENT-DEBUG-OPTIONS*", NIL );
    $cb_debug_options$ = SubLFiles.deflexical( "*CB-DEBUG-OPTIONS*", $list58 );
    $cb_show_hide_value_linktext_pairs$ = SubLFiles.deflexical( "*CB-SHOW-HIDE-VALUE-LINKTEXT-PAIRS*", $list59 );
    $cb_debug_max_depth$ = SubLFiles.deflexical( "*CB-DEBUG-MAX-DEPTH*", $int98$212 );
    $cb_debug_next_object_id$ = SubLFiles.defparameter( "*CB-DEBUG-NEXT-OBJECT-ID*", $kw3$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_cb_inference_debugger_file()
  {
    utilities_macros.register_html_state_variable( $sym1$_CB_DEBUG_ICON_ );
    utilities_macros.register_html_state_variable( $sym2$_CB_DEBUG_INDENT_QUANTUM_ );
    utilities_macros.register_html_state_variable( $sym4$_CB_CURRENT_DEBUG_OPTIONS_ );
    cb_utilities.setup_cb_link_method( $kw16$DEBUG_INFERENCE, $sym17$CB_LINK_DEBUG_INFERENCE, THREE_INTEGER );
    html_macros.note_cgi_handler_function( $sym28$CB_DEBUG_INFERENCE_HANDLER, $kw29$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw34$DEBUG_PROBLEM, $sym35$CB_LINK_DEBUG_PROBLEM, FOUR_INTEGER );
    html_macros.note_cgi_handler_function( $sym42$CB_DEBUG_PROBLEM_HANDLER, $kw29$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw46$DEBUG_PROBLEM_LINK, $sym47$CB_LINK_DEBUG_PROBLEM_LINK, FOUR_INTEGER );
    html_macros.note_cgi_handler_function( $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER, $kw29$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_inference_debugger_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_inference_debugger_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_inference_debugger_file();
  }
  static
  {
    me = new cb_inference_debugger();
    $cb_debug_icon$ = null;
    $cb_debug_indent_quantum$ = null;
    $cb_debug_depth$ = null;
    $cb_debug_duplicate_tree$ = null;
    $cb_debug_tree$ = null;
    $cb_current_debug_options$ = null;
    $cb_debug_options$ = null;
    $cb_show_hide_value_linktext_pairs$ = null;
    $cb_debug_max_depth$ = null;
    $cb_debug_next_object_id$ = null;
    $kw0$RED_DIAMOND = makeKeyword( "RED-DIAMOND" );
    $sym1$_CB_DEBUG_ICON_ = makeSymbol( "*CB-DEBUG-ICON*" );
    $sym2$_CB_DEBUG_INDENT_QUANTUM_ = makeSymbol( "*CB-DEBUG-INDENT-QUANTUM*" );
    $kw3$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym4$_CB_CURRENT_DEBUG_OPTIONS_ = makeSymbol( "*CB-CURRENT-DEBUG-OPTIONS*" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "FOCAL-OBJECT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$HTML_DOCUMENT = makeSymbol( "HTML-DOCUMENT" );
    $list7 = ConsesLow.list( makeSymbol( "CB-HEAD" ), ConsesLow.list( makeSymbol( "DHTML-WITH-DOM-SCRIPT" ) ), ConsesLow.list( makeSymbol( "DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT" ) ), ConsesLow.list( makeSymbol(
        "BASIC-AJAX-SCRIPTS" ) ), ConsesLow.list( makeSymbol( "DHTML-CREATION-SCRIPTS" ) ) );
    $sym8$HTML_FANCY_BODY = makeSymbol( "HTML-FANCY-BODY" );
    $list9 = ConsesLow.list( makeKeyword( "SHOW-COPYRIGHT" ), NIL );
    $sym10$CB_SHOW_RELEVANT_INFERENCE_DEBUGGING_LINKS = makeSymbol( "CB-SHOW-RELEVANT-INFERENCE-DEBUGGING-LINKS" );
    $list11 = ConsesLow.list( makeSymbol( "HTML-PRINC-STRONG" ), makeString( "Inference Debugging Tree for " ) );
    $sym12$CLET = makeSymbol( "CLET" );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CB-DEBUG-DEPTH*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*CB-DEBUG-TREE*" ), NIL ), ConsesLow.list( makeSymbol( "*CB-DEBUG-DUPLICATE-TREE*" ), ConsesLow
        .list( makeSymbol( "NEW-SET" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ) ) );
    $str14$_Debug_Inference__A__A_ = makeString( "[Debug Inference ~A.~A]" );
    $str15$cb_debug_inference_handler = makeString( "cb-debug-inference-handler" );
    $kw16$DEBUG_INFERENCE = makeKeyword( "DEBUG-INFERENCE" );
    $sym17$CB_LINK_DEBUG_INFERENCE = makeSymbol( "CB-LINK-DEBUG-INFERENCE" );
    $list18 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "INFERENCE-ID-STRING" ), makeSymbol( "OPTIONS-GLOB-ID-STRING" ) );
    $str19$_A_did_not_specify_an_inference = makeString( "~A did not specify an inference" );
    $sym20$CB_DEBUG_OPTION_P = makeSymbol( "CB-DEBUG-OPTION-P" );
    $str21$_A_did_not_specify_valid_debugger = makeString( "~A did not specify valid debugger options" );
    $str22$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str23$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw24$CB_CYC = makeKeyword( "CB-CYC" );
    $str25$Inference_Debugging_Tree_for_ = makeString( "Inference Debugging Tree for " );
    $kw26$INFERENCE = makeKeyword( "INFERENCE" );
    $kw27$VERY_VERBOSE = makeKeyword( "VERY-VERBOSE" );
    $sym28$CB_DEBUG_INFERENCE_HANDLER = makeSymbol( "CB-DEBUG-INFERENCE-HANDLER" );
    $kw29$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw30$TACTICAL = makeKeyword( "TACTICAL" );
    $str31$_Debug_Problem__A__A_ = makeString( "[Debug Problem ~A.~A]" );
    $str32$_Debug_Problem__A__A_wrt_s_A_ = makeString( "[Debug Problem ~A.~A wrt s~A]" );
    $str33$cb_debug_problem_handler = makeString( "cb-debug-problem-handler" );
    $kw34$DEBUG_PROBLEM = makeKeyword( "DEBUG-PROBLEM" );
    $sym35$CB_LINK_DEBUG_PROBLEM = makeSymbol( "CB-LINK-DEBUG-PROBLEM" );
    $list36 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "PROBLEM-ID-STRING" ), makeSymbol( "STRATEGIC-CONTEXT-ID-STRING" ), makeSymbol( "OPTIONS-GLOB-ID-STRING" ) );
    $str37$_A_did_not_specify_a_problem = makeString( "~A did not specify a problem" );
    $str38$_A_did_not_specify_a_strategic_co = makeString( "~A did not specify a strategic context" );
    $kw39$PROBLEM = makeKeyword( "PROBLEM" );
    $str40$_wrt_ = makeString( " wrt " );
    $kw41$STRATEGY = makeKeyword( "STRATEGY" );
    $sym42$CB_DEBUG_PROBLEM_HANDLER = makeSymbol( "CB-DEBUG-PROBLEM-HANDLER" );
    $str43$_Debug_Link__A__A_ = makeString( "[Debug Link ~A.~A]" );
    $str44$_Debug_Link__A__A_wrt_s_A_ = makeString( "[Debug Link ~A.~A wrt s~A]" );
    $str45$cb_debug_problem_link_handler = makeString( "cb-debug-problem-link-handler" );
    $kw46$DEBUG_PROBLEM_LINK = makeKeyword( "DEBUG-PROBLEM-LINK" );
    $sym47$CB_LINK_DEBUG_PROBLEM_LINK = makeSymbol( "CB-LINK-DEBUG-PROBLEM-LINK" );
    $list48 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "LINK-ID-STRING" ), makeSymbol( "STRATEGIC-CONTEXT-ID-STRING" ), makeSymbol( "OPTIONS-GLOB-ID-STRING" ) );
    $str49$_A_did_not_specify_a_link = makeString( "~A did not specify a link" );
    $kw50$PROBLEM_LINK = makeKeyword( "PROBLEM-LINK" );
    $kw51$VERBOSE = makeKeyword( "VERBOSE" );
    $sym52$CB_DEBUG_PROBLEM_LINK_HANDLER = makeSymbol( "CB-DEBUG-PROBLEM-LINK-HANDLER" );
    $kw53$SELF = makeKeyword( "SELF" );
    $str54$_A__A__A__A__A = makeString( "~A&~A&~A&~A&~A" );
    $str55$_A__A__A__A = makeString( "~A&~A&~A&~A" );
    $kw56$TOP = makeKeyword( "TOP" );
    $str57$Unexpected_cb_debug_link_object__ = makeString( "Unexpected cb-debug-link object: ~a" );
    $list58 = ConsesLow.list( ConsesLow.cons( makeKeyword( "ANCESTOR-DEPTH" ), makeInteger( 21 ) ), ConsesLow.list( makeKeyword( "SHOW-SIBLINGS?" ) ), ConsesLow.list( makeKeyword( "SHOW-AUNTS?" ) ), ConsesLow.cons(
        makeKeyword( "DEBUG-GOOD-PROBLEMS?" ), T ), ConsesLow.cons( makeKeyword( "DEBUG-NON-NEW-ROOTS?" ), T ), ConsesLow.cons( makeKeyword( "SHOW-WHICH-QUERIES" ), makeKeyword( "NONE" ) ), ConsesLow.cons( makeKeyword(
            "SHOW-RULES?" ), T ), ConsesLow.cons( makeKeyword( "DHTML-VISIBILITY" ), makeKeyword( "VISIBLE" ) ) );
    $list59 = ConsesLow.list( ConsesLow.list( T, makeString( "[Show]" ) ), ConsesLow.list( NIL, makeString( "[Hide]" ) ) );
    $kw60$SHOW_SIBLINGS_ = makeKeyword( "SHOW-SIBLINGS?" );
    $str61$Siblings_ = makeString( "Siblings:" );
    $kw62$SHOW_AUNTS_ = makeKeyword( "SHOW-AUNTS?" );
    $str63$Aunts_ = makeString( "Aunts:" );
    $kw64$DEBUG_NON_NEW_ROOTS_ = makeKeyword( "DEBUG-NON-NEW-ROOTS?" );
    $str65$Non_New_Roots_ = makeString( "Non-New Roots:" );
    $kw66$DEBUG_GOOD_PROBLEMS_ = makeKeyword( "DEBUG-GOOD-PROBLEMS?" );
    $str67$Good_Problems_ = makeString( "Good Problems:" );
    $list68 = ConsesLow.list( ConsesLow.list( T, makeString( "[Descend]" ) ), ConsesLow.list( NIL, makeString( "[Stop]" ) ) );
    $kw69$SHOW_WHICH_QUERIES = makeKeyword( "SHOW-WHICH-QUERIES" );
    $str70$Queries_ = makeString( "Queries:" );
    $list71 = ConsesLow.list( ConsesLow.list( makeKeyword( "ALL" ), makeString( "[All]" ) ), ConsesLow.list( makeKeyword( "DEAD-END" ), makeString( "[Dead Ends]" ) ), ConsesLow.list( makeKeyword( "NONE" ), makeString(
        "[None]" ) ) );
    $kw72$SHOW_RULES_ = makeKeyword( "SHOW-RULES?" );
    $str73$Rules_ = makeString( "Rules:" );
    $kw74$SQUARE_PLUS = makeKeyword( "SQUARE-PLUS" );
    $kw75$CENTER = makeKeyword( "CENTER" );
    $kw76$SQUARE_MINUS = makeKeyword( "SQUARE-MINUS" );
    $str77$_ = makeString( ":" );
    $kw78$DHTML_VISIBILITY = makeKeyword( "DHTML-VISIBILITY" );
    $str79$ = makeString( "" );
    $list80 = ConsesLow.list( ConsesLow.list( makeKeyword( "VISIBLE" ), makeString( "[Open All]" ) ), ConsesLow.list( makeKeyword( "INVISIBLE" ), makeString( "[Close All]" ) ), ConsesLow.list( makeKeyword( "NONE" ),
        makeString( "[Turn Off]" ) ) );
    $str81$Ancestor_Depth_ = makeString( "Ancestor Depth:" );
    $str82$_ = makeString( "[" );
    $str83$_ = makeString( "]" );
    $kw84$ANCESTOR_DEPTH = makeKeyword( "ANCESTOR-DEPTH" );
    $list85 = ConsesLow.list( makeInteger( 212 ), makeInteger( 21 ), TWELVE_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER, ZERO_INTEGER );
    $list86 = ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "LINKTEXT" ) );
    $sym87$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $kw88$GOOD = makeKeyword( "GOOD" );
    $kw89$NEUTRAL = makeKeyword( "NEUTRAL" );
    $kw90$NO_GOOD = makeKeyword( "NO-GOOD" );
    $kw91$ALL = makeKeyword( "ALL" );
    $kw92$DEAD_END = makeKeyword( "DEAD-END" );
    $kw93$ELLIPSIS = makeKeyword( "ELLIPSIS" );
    $kw94$RESTRICTION = makeKeyword( "RESTRICTION" );
    $sym95$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym96$CB_DEBUG_ARGUMENT_LINK__ = makeSymbol( "CB-DEBUG-ARGUMENT-LINK-<" );
    $sym97$CB_DEBUG_SUPPORTING_PROBLEM__ = makeSymbol( "CB-DEBUG-SUPPORTING-PROBLEM-<" );
    $int98$212 = makeInteger( 212 );
    $str99$root = makeString( "root" );
    $kw100$VISIBLE = makeKeyword( "VISIBLE" );
    $kw101$NONE = makeKeyword( "NONE" );
    $kw102$TEXT = makeKeyword( "TEXT" );
    $list103 = ConsesLow.listS( makeSymbol( "NODE-TYPE" ), makeSymbol( "DEPTH" ), makeSymbol( "DATA" ) );
    $kw104$SQUARE_BLANK = makeKeyword( "SQUARE-BLANK" );
    $str105$___ = makeString( "..." );
    $list106 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "IS-FOCAL-OBJECT?" ), makeSymbol( "QUERY-OR-RULE" ) );
    $kw107$BLANK_TRIANGLE = makeKeyword( "BLANK-TRIANGLE" );
    $str108$cbd = makeString( "cbd" );
  }
}
/*
 * 
 * Total time: 412 ms
 * 
 */