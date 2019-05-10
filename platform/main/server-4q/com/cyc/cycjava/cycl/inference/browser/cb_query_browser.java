package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.bindings;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_query_browser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_query_browser";
  public static final String myFingerPrint = "a5f0ba72c8cc4101b107db5f508befb46d835efeb9cd5fc829b67a88bfa07202";
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 17353L)
  private static SubLSymbol $cb_inference_browser_show_answer_max_floor_mtsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32751L)
  public static SubLSymbol $cb_show_inference_results_in_nlP$;
  private static final SubLSymbol $kw0$SILK;
  private static final SubLString $str1$SILK_Query__;
  private static final SubLString $str2$Mt__;
  private static final SubLString $str3$EL_Query__;
  private static final SubLString $str4$Pragmatics__;
  private static final SubLSymbol $sym5$INFERENCE_STATUS_P;
  private static final SubLSymbol $kw6$NEW;
  private static final SubLString $str7$New;
  private static final SubLSymbol $kw8$PREPARED;
  private static final SubLString $str9$Prepared;
  private static final SubLSymbol $kw10$READY;
  private static final SubLString $str11$Ready;
  private static final SubLSymbol $kw12$RUNNING;
  private static final SubLString $str13$Running;
  private static final SubLSymbol $kw14$SUSPENDED;
  private static final SubLString $str15$Suspended;
  private static final SubLSymbol $kw16$DEAD;
  private static final SubLString $str17$Dead;
  private static final SubLSymbol $kw18$TAUTOLOGY;
  private static final SubLString $str19$Tautology;
  private static final SubLSymbol $kw20$CONTRADICTION;
  private static final SubLString $str21$Contradiction;
  private static final SubLSymbol $kw22$ILL_FORMED;
  private static final SubLString $str23$Ill_Formed;
  private static final SubLSymbol $sym24$INFERENCE_SUSPEND_STATUS_P;
  private static final SubLSymbol $kw25$ABORT;
  private static final SubLString $str26$Abort;
  private static final SubLSymbol $kw27$INTERRUPT;
  private static final SubLString $str28$Interrupt;
  private static final SubLSymbol $kw29$MAX_NUMBER;
  private static final SubLString $str30$Max_Number;
  private static final SubLSymbol $kw31$MAX_TIME;
  private static final SubLString $str32$Max_Time;
  private static final SubLSymbol $kw33$MAX_STEP;
  private static final SubLString $str34$Max_Step;
  private static final SubLSymbol $kw35$MAX_PROBLEM_COUNT;
  private static final SubLString $str36$Max_Problem_Count;
  private static final SubLSymbol $kw37$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLString $str38$Probably_Approximately_Done;
  private static final SubLSymbol $kw39$EXHAUST;
  private static final SubLString $str40$Exhaust;
  private static final SubLSymbol $kw41$EXHAUST_TOTAL;
  private static final SubLString $str42$Exhaust_Total;
  private static final SubLList $list43;
  private static final SubLString $str44$_A_did_not_specify_an_inference_a;
  private static final SubLSymbol $sym45$CB_INFERENCE_ANSWER;
  private static final SubLSymbol $kw46$HTML_HANDLER;
  private static final SubLSymbol $kw47$MAIN;
  private static final SubLSymbol $kw48$TERSE;
  private static final SubLSymbol $kw49$MINIMAL;
  private static final SubLString $str50$__A__A__A_;
  private static final SubLString $str51$_Inference_Answer__A__A__A_;
  private static final SubLSymbol $kw52$VERBOSE;
  private static final SubLString $str53$_Inference_Answer__A__A__A__A_;
  private static final SubLString $str54$cb_inference_answer__A__A__A;
  private static final SubLString $str55$button;
  private static final SubLSymbol $kw56$INFERENCE_ANSWER;
  private static final SubLSymbol $sym57$CB_LINK_INFERENCE_ANSWER;
  private static final SubLSymbol $sym58$CB_FORM_INFERENCE_ANSWER_METHOD;
  private static final SubLString $str59$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str60$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw61$UNINITIALIZED;
  private static final SubLString $str62$Inference_Answer;
  private static final SubLString $str63$_for_;
  private static final SubLSymbol $kw64$INFERENCE;
  private static final SubLString $str65$_in_;
  private static final SubLSymbol $kw66$PROBLEM_STORE;
  private static final SubLSymbol $kw67$SOCRATIC_QUERY_FROM_ANSWER;
  private static final SubLString $str68$_Socratic_Query_;
  private static final SubLString $str69$Creation_Time____;
  private static final SubLString $str70$Steps_to_This_Answer____;
  private static final SubLString $str71$Answer_Bindings__;
  private static final SubLString $str72$Answer_Mt_p___;
  private static final SubLString $str73$None_found;
  private static final SubLString $str74$Justifications__;
  private static final SubLString $str75$after;
  private static final SubLString $str76$__at_;
  private static final SubLString $str77$_;
  private static final SubLSymbol $sym78$UNIVERSAL_TIME_P;
  private static final SubLString $str79$_today;
  private static final SubLString $str80$_on__A;
  private static final SubLSymbol $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER;
  private static final SubLSymbol $kw82$SELF;
  private static final SubLString $str83$cb_socratic_query_from_answer__A_;
  private static final SubLSymbol $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER;
  private static final SubLList $list85;
  private static final SubLString $str86$_A_did_not_specify_an_inference_a;
  private static final SubLSymbol $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION;
  private static final SubLString $str88$__A__A__A__A_;
  private static final SubLString $str89$_Inference_Answer__A__A__A__A_;
  private static final SubLString $str90$_Inference_Answer__A__A__A__A__A_;
  private static final SubLString $str91$cb_inference_answer_full_justific;
  private static final SubLSymbol $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION;
  private static final SubLSymbol $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION;
  private static final SubLString $str94$;
  private static final SubLSymbol $kw95$CB_CYC;
  private static final SubLSymbol $kw96$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw97$SHA1;
  private static final SubLString $str98$yui_skin_sam;
  private static final SubLString $str99$reloadFrameButton;
  private static final SubLString $str100$reload;
  private static final SubLString $str101$Refresh_Frames;
  private static final SubLString $str102$Inference_Answer_Full_Justificati;
  private static final SubLString $str103$_for_answer_;
  private static final SubLSymbol $sym104$SUPPORT_MT;
  private static final SubLString $str105$Answer_Justification_Mt_p___;
  private static final SubLString $str106$Full_Justification__;
  private static final SubLSymbol $kw107$LEFT;
  private static final SubLSymbol $kw108$TOP;
  private static final SubLString $str109$_Full_Justification_;
  private static final SubLString $str110$Proofs__;
  private static final SubLString $str111$proofs;
  private static final SubLSymbol $kw112$PROOF;
  private static final SubLSymbol $kw113$SIMPLE_PROOF_VIEW;
  private static final SubLString $str114$_Show_Proof_View_;
  private static final SubLSymbol $kw115$DATA_TABLES;
  private static final SubLString $str116$_;
  private static final SubLInteger $int117$600;
  private static final SubLInteger $int118$200;
  private static final SubLInteger $int119$30;
  private static final SubLString $str120$__null;
  private static final SubLString $str121$_columnDefs_____type____num_html_;
  private static final SubLString $str122$__document__ready_function_______;
  private static final SubLString $str123$_columnDefs_____type____num_html_;
  private static final SubLString $str124$__document__ready_function_______;
  private static final SubLString $str125$Query_was_not_yet_proven;
  private static final SubLString $str126$Query_was_not_proven;
  private static final SubLString $str127$Query_was_proven;
  private static final SubLObject $const128$True;
  private static final SubLInteger $int129$2100;
  private static final SubLString $str130$No_answers;
  private static final SubLString $str131$_yet_;
  private static final SubLString $str132$display;
  private static final SubLString $str133$inferenceresults;
  private static final SubLString $str134$Answer;
  private static final SubLString $str135$Answer_Mt;
  private static final SubLSymbol $kw136$RIGHT;
  private static final SubLString $str137$Explain;
  private static final SubLString $str138$Explain___A;
  private static final SubLString $str139$_;
  private static final SubLString $str140$_;
  private static final SubLString $str141$display_none;
  private static final SubLString $str142$_A;
  private static final SubLSymbol $kw143$NEW_ANSWER;
  private static final SubLSymbol $kw144$NEW_JUSTIFICATION;
  private static final SubLSymbol $kw145$OLD;
  private static final SubLString $str146$Old_answer;
  private static final SubLString $str147$New_answer;
  private static final SubLString $str148$Old_answer_with_a_new_justificati;
  private static final SubLString $str149$_;
  private static final SubLSymbol $kw150$YELLOW;
  private static final SubLSymbol $kw151$GREEN;
  private static final SubLSymbol $kw152$SKIP;
  private static final SubLSymbol $sym153$_;
  private static final SubLSymbol $sym154$INFERENCE_ANSWER_SUID;
  private static final SubLString $str155$Weighing_these_arguments_yields_a;
  private static final SubLSymbol $kw156$TRUE_DEF;
  private static final SubLString $str157$True__default_;
  private static final SubLSymbol $kw158$TRUE_MON;
  private static final SubLString $str159$True__monotonic_;
  private static final SubLSymbol $kw160$FALSE_DEF;
  private static final SubLString $str161$False__default_;
  private static final SubLSymbol $kw162$FALSE_MON;
  private static final SubLString $str163$False__monotonic_;
  private static final SubLSymbol $kw164$UNKNOWN;
  private static final SubLString $str165$Unknown;
  private static final SubLString $str166$___;
  private static final SubLSymbol $kw167$ALL;
  private static final SubLString $str168$_;
  private static final SubLList $list169;
  private static final SubLString $str170$___;
  private static final SubLSymbol $kw171$CENTER;
  private static final SubLSymbol $kw172$NBSP;
  private static final SubLSymbol $kw173$RIGHTWARDS_ARROW;
  private static final SubLSymbol $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__;
  private static final SubLList $list175;
  private static final SubLSymbol $kw176$UPWARDS_ARROW;

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 829L)
  public static SubLObject cb_show_inference_el_query(final SubLObject inference, SubLObject show_mtP)
  {
    if( show_mtP == UNPROVIDED )
    {
      show_mtP = T;
    }
    SubLObject el_query = inference_datastructures_inference.inference_input_el_query( inference );
    if( NIL == el_query )
    {
      el_query = clause_utilities.contextualized_dnf_formula_from_clauses( inference_datastructures_inference.inference_hl_query( inference ) );
    }
    if( NIL != show_mtP )
    {
      final SubLObject mt = inference_datastructures_inference.inference_input_mt( inference );
      if( NIL != mt )
      {
        html_utilities.html_princ_strong( $str2$Mt__ );
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_show_term( mt, ZERO_INTEGER, NIL );
        html_utilities.html_newline( UNPROVIDED );
      }
    }
    html_utilities.html_princ_strong( $str3$EL_Query__ );
    html_utilities.html_newline( UNPROVIDED );
    cb_utilities.cb_form( el_query, ZERO_INTEGER, T );
    final SubLObject non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query( inference );
    if( NIL != non_explanatory_el_query )
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_princ_strong( $str4$Pragmatics__ );
      html_utilities.html_newline( UNPROVIDED );
      cb_utilities.cb_form( non_explanatory_el_query, ZERO_INTEGER, T );
    }
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 2160L)
  public static SubLObject cb_show_inference_status(final SubLObject status)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_status_p( status ) : status;
    if( status.eql( $kw6$NEW ) )
    {
      html_utilities.html_princ( $str7$New );
    }
    else if( status.eql( $kw8$PREPARED ) )
    {
      html_utilities.html_princ( $str9$Prepared );
    }
    else if( status.eql( $kw10$READY ) )
    {
      html_utilities.html_princ( $str11$Ready );
    }
    else if( status.eql( $kw12$RUNNING ) )
    {
      html_utilities.html_princ( $str13$Running );
    }
    else if( status.eql( $kw14$SUSPENDED ) )
    {
      html_utilities.html_princ( $str15$Suspended );
    }
    else if( status.eql( $kw16$DEAD ) )
    {
      html_utilities.html_princ( $str17$Dead );
    }
    else if( status.eql( $kw18$TAUTOLOGY ) )
    {
      html_utilities.html_princ( $str19$Tautology );
    }
    else if( status.eql( $kw20$CONTRADICTION ) )
    {
      html_utilities.html_princ( $str21$Contradiction );
    }
    else if( status.eql( $kw22$ILL_FORMED ) )
    {
      html_utilities.html_princ( $str23$Ill_Formed );
    }
    else
    {
      html_utilities.html_princ( status );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 2737L)
  public static SubLObject cb_show_inference_suspend_status(final SubLObject suspend_status)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p( suspend_status ) : suspend_status;
    if( suspend_status.eql( $kw25$ABORT ) )
    {
      html_utilities.html_princ( $str26$Abort );
    }
    else if( suspend_status.eql( $kw27$INTERRUPT ) )
    {
      html_utilities.html_princ( $str28$Interrupt );
    }
    else if( suspend_status.eql( $kw29$MAX_NUMBER ) )
    {
      html_utilities.html_princ( $str30$Max_Number );
    }
    else if( suspend_status.eql( $kw31$MAX_TIME ) )
    {
      html_utilities.html_princ( $str32$Max_Time );
    }
    else if( suspend_status.eql( $kw33$MAX_STEP ) )
    {
      html_utilities.html_princ( $str34$Max_Step );
    }
    else if( suspend_status.eql( $kw35$MAX_PROBLEM_COUNT ) )
    {
      html_utilities.html_princ( $str36$Max_Problem_Count );
    }
    else if( suspend_status.eql( $kw37$PROBABLY_APPROXIMATELY_DONE ) )
    {
      html_utilities.html_princ( $str38$Probably_Approximately_Done );
    }
    else if( suspend_status.eql( $kw39$EXHAUST ) )
    {
      html_utilities.html_princ( $str40$Exhaust );
    }
    else if( suspend_status.eql( $kw41$EXHAUST_TOTAL ) )
    {
      html_utilities.html_princ( $str42$Exhaust_Total );
    }
    else
    {
      html_utilities.html_princ( suspend_status );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 3437L)
  public static SubLObject cb_inference_answer(final SubLObject args)
  {
    SubLObject store_id_string = NIL;
    SubLObject inference_id_string = NIL;
    SubLObject answer_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list43 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list43 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list43 );
    answer_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list43 );
      return NIL;
    }
    final SubLObject v_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_p( v_answer ) )
    {
      return cb_utilities.cb_error( $str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_inference_answer_guts( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 3889L)
  public static SubLObject cb_link_inference_answer(final SubLObject v_answer, SubLObject verbosity, SubLObject linktext, SubLObject target)
  {
    if( verbosity == UNPROVIDED )
    {
      verbosity = NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( target == UNPROVIDED )
    {
      target = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == target )
    {
      target = $kw47$MAIN;
    }
    if( NIL == verbosity )
    {
      verbosity = $kw48$TERSE;
    }
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( v_answer );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid( v_answer );
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
    if( NIL == linktext )
    {
      final SubLObject pcase_var = verbosity;
      if( pcase_var.eql( $kw49$MINIMAL ) )
      {
        linktext = PrintLow.format( NIL, $str50$__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id
        } );
      }
      else if( pcase_var.eql( $kw48$TERSE ) )
      {
        linktext = PrintLow.format( NIL, $str51$_Inference_Answer__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id
        } );
      }
      else if( pcase_var.eql( $kw52$VERBOSE ) )
      {
        linktext = PrintLow.format( NIL, $str53$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, v_bindings
        } );
      }
    }
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    if( NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) )
    {
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      if( NIL != answer_id )
      {
        html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( answer_id );
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
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( target );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str54$cb_inference_answer__A__A__A, new SubLObject[] { store_id, inference_id, answer_id
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
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $str55$button );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        if( NIL != answer_id )
        {
          html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_princ( answer_id );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != linktext )
        {
          html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( linktext );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
        {
          html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      }
      else
      {
        html_utilities.html_princ( linktext );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5214L)
  public static SubLObject cb_form_inference_answer_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = NIL;
    }
    cb_utilities.cb_link( $kw56$INFERENCE_ANSWER, v_object, $kw52$VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5387L)
  public static SubLObject cb_guess_inference_answer(final SubLObject store_id_string, final SubLObject inference_id_string, final SubLObject answer_id_string)
  {
    final SubLObject store_id = string_utilities.string_to_integer( store_id_string );
    final SubLObject inference_id = string_utilities.string_to_integer( inference_id_string );
    final SubLObject answer_id = string_utilities.string_to_integer( answer_id_string );
    if( inference_id.isInteger() && answer_id.isInteger() )
    {
      final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_ids( store_id, inference_id, answer_id );
      if( NIL != inference_datastructures_inference.inference_answer_p( v_answer ) )
      {
        return v_answer;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 5878L)
  public static SubLObject cb_show_inference_answer_bindings(final SubLObject v_bindings, final SubLObject free_variables)
  {
    cb_show_bindings_vertical( v_bindings, free_variables );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 6024L)
  public static SubLObject cb_show_inference_answer_summary(final SubLObject v_answer)
  {
    cb_utilities.cb_link( $kw56$INFERENCE_ANSWER, v_answer, $kw48$TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
    cb_show_bindings( v_bindings, UNPROVIDED );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 6249L)
  public static SubLObject cb_inference_answer_guts(final SubLObject v_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str60$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw61$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( $str62$Inference_Answer );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      final SubLObject _prev_bind_2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_script_utilities.cb_hoverover_page_init();
          dhtml_macros.html_basic_cb_scripts();
          cb_inference_browser.cb_show_relevant_inference_debugging_links( v_answer );
          html_utilities.html_princ_strong( $str62$Inference_Answer );
          html_utilities.html_indent( UNPROVIDED );
          cb_utilities.cb_link( $kw56$INFERENCE_ANSWER, v_answer, $kw48$TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ( $str63$_for_ );
          cb_utilities.cb_link( $kw64$INFERENCE, inference_datastructures_inference.inference_answer_inference( v_answer ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_princ( $str65$_in_ );
          cb_utilities.cb_link( $kw66$PROBLEM_STORE, inference_datastructures_inference.inference_answer_problem_store( v_answer ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( FOUR_INTEGER );
          cb_utilities.cb_link( $kw67$SOCRATIC_QUERY_FROM_ANSWER, v_answer, $str68$_Socratic_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( TWO_INTEGER );
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          cb_show_inference_el_query( inference_datastructures_inference.inference_answer_inference( v_answer ), UNPROVIDED );
          html_utilities.html_newline( TWO_INTEGER );
          html_utilities.html_princ_strong( $str69$Creation_Time____ );
          cb_show_inference_answer_creation_time( v_answer );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ_strong( $str70$Steps_to_This_Answer____ );
          cb_show_inference_answer_step_count( v_answer );
          html_utilities.html_newline( UNPROVIDED );
          final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
          final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars( v_answer );
          html_utilities.html_princ_strong( $str71$Answer_Bindings__ );
          html_utilities.html_newline( UNPROVIDED );
          cb_show_inference_answer_bindings( v_bindings, free_el_vars );
          if( NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue( thread ) )
          {
            final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer( v_answer, UNPROVIDED );
            html_utilities.html_princ_strong( PrintLow.format( NIL, $str72$Answer_Mt_p___, Sequences.length( mts ) ) );
            if( NIL != mts )
            {
              SubLObject cdolist_list_var = mts;
              SubLObject mt = NIL;
              mt = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
              }
            }
            else
            {
              html_utilities.html_princ( $str73$None_found );
              html_utilities.html_newline( UNPROVIDED );
            }
          }
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_princ_strong( $str74$Justifications__ );
          SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer );
          SubLObject justification = NIL;
          justification = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            html_utilities.html_newline( UNPROVIDED );
            cb_show_inference_answer_justification( justification );
            cdolist_list_var2 = cdolist_list_var2.rest();
            justification = cdolist_list_var2.first();
          }
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
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_2, thread );
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0_$1, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 8628L)
  public static SubLObject cb_show_inference_answer_creation_time(final SubLObject v_answer)
  {
    final SubLObject creation_time = inference_datastructures_inference.inference_answer_creation_time( v_answer );
    final SubLObject elapsed_creation_time = inference_datastructures_inference.inference_answer_elapsed_time( v_answer, NIL );
    html_utilities.html_princ( $str75$after );
    html_utilities.html_princ( numeric_date_utilities.elapsed_seconds_string( elapsed_creation_time ) );
    html_utilities.html_princ( $str76$__at_ );
    cb_show_universal_time( creation_time );
    html_utilities.html_princ( $str77$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9020L)
  public static SubLObject cb_show_universal_time(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != numeric_date_utilities.universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time( universal_time );
    final SubLObject universal_seconds = thread.secondMultipleValue();
    thread.resetMultipleValues();
    html_utilities.html_princ( numeric_date_utilities.secondstring( universal_seconds ) );
    if( universal_date.numE( numeric_date_utilities.today() ) )
    {
      html_utilities.html_princ( $str79$_today );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str80$_on__A, numeric_date_utilities.datestring( universal_date ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9481L)
  public static SubLObject cb_show_inference_answer_step_count(final SubLObject v_answer)
  {
    final SubLObject step_count = inference_datastructures_inference.inference_answer_step_count( v_answer );
    html_utilities.html_princ( step_count );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 9645L)
  public static SubLObject cb_socratic_query_from_answer(final SubLObject args)
  {
    SubLObject store_id_string = NIL;
    SubLObject inference_id_string = NIL;
    SubLObject answer_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list43 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list43 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list43 );
    answer_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list43 );
      return NIL;
    }
    final SubLObject inference_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_p( inference_answer ) )
    {
      return cb_utilities.cb_error( $str44$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( inference_answer );
    final SubLObject sentence = inference_datastructures_inference.inference_answer_el_sentence( inference_answer );
    final SubLObject mt = inference_datastructures_inference.inference_input_mt( inference );
    final SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties( cb_inference_browser.compute_the_relevant_inference( inference_answer ) );
    return cb_query.cb_socratic_query( sentence, mt, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 10367L)
  public static SubLObject cb_link_socratic_query_from_answer(final SubLObject inference_answer, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str68$_Socratic_Query_;
    }
    final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid( inference_answer );
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( inference_answer );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw82$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str83$cb_socratic_query_from_answer__A_, new SubLObject[] { store_id, inference_id, answer_id
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
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 10963L)
  public static SubLObject cb_inference_answer_full_justification(final SubLObject args)
  {
    SubLObject store_id_string = NIL;
    SubLObject inference_id_string = NIL;
    SubLObject answer_id_string = NIL;
    SubLObject justification_id_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list85 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list85 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list85 );
    answer_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list85 );
    justification_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list85 );
      return NIL;
    }
    final SubLObject justification = cb_guess_inference_answer_justification( store_id_string, inference_id_string, answer_id_string, justification_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_justification_p( justification ) )
    {
      return cb_utilities.cb_error( $str86$_A_did_not_specify_an_inference_a, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cb_inference_answer_full_justification_guts( justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 11618L)
  public static SubLObject cb_link_inference_answer_full_justification(final SubLObject justification, SubLObject verbosity, SubLObject linktext, SubLObject target)
  {
    if( verbosity == UNPROVIDED )
    {
      verbosity = NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( target == UNPROVIDED )
    {
      target = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == target )
    {
      target = $kw47$MAIN;
    }
    if( NIL == verbosity )
    {
      verbosity = $kw48$TERSE;
    }
    final SubLObject justification_id = inference_answer_justification_suid( justification );
    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
    final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid( v_answer );
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( v_answer );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
    if( NIL == linktext )
    {
      final SubLObject pcase_var = verbosity;
      if( pcase_var.eql( $kw49$MINIMAL ) )
      {
        linktext = PrintLow.format( NIL, $str88$__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id
        } );
      }
      else if( pcase_var.eql( $kw48$TERSE ) )
      {
        linktext = PrintLow.format( NIL, $str89$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id
        } );
      }
      else if( pcase_var.eql( $kw52$VERBOSE ) )
      {
        linktext = PrintLow.format( NIL, $str90$_Inference_Answer__A__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id, v_bindings
        } );
      }
    }
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( target );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str91$cb_inference_answer_full_justific, new SubLObject[] { store_id, inference_id, answer_id, justification_id
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
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 12933L)
  public static SubLObject inference_answer_justification_suid(final SubLObject justification)
  {
    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
    final SubLObject justifications = inference_datastructures_inference.inference_answer_justifications( v_answer );
    return Sequences.position( justification, justifications, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 13208L)
  public static SubLObject cb_guess_inference_answer_justification(final SubLObject store_id_string, final SubLObject inference_id_string, final SubLObject answer_id_string, final SubLObject justification_id_string)
  {
    final SubLObject v_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL != inference_datastructures_inference.inference_answer_p( v_answer ) )
    {
      final SubLObject just_id = reader.read_from_string_ignoring_errors( justification_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != subl_promotions.non_negative_integer_p( just_id ) )
      {
        final SubLObject justification = ConsesLow.nth( just_id, inference_datastructures_inference.inference_answer_justifications( v_answer ) );
        return justification;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 13720L)
  public static SubLObject cb_inference_answer_full_justification_guts(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( v_answer );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject title_var = $str94$;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str60$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw61$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw95$CB_CYC );
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
        final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str98$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str99$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str55$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str100$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str101$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
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
            html_utilities.html_princ_strong( $str102$Inference_Answer_Full_Justificati );
            html_utilities.html_indent( UNPROVIDED );
            cb_utilities.cb_link( $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $kw49$MINIMAL, NIL, $kw82$SELF, UNPROVIDED );
            html_utilities.html_princ( $str103$_for_answer_ );
            cb_utilities.cb_link( $kw56$INFERENCE_ANSWER, v_answer, $kw49$MINIMAL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
            cb_show_inference_el_query( inference, UNPROVIDED );
            html_utilities.html_newline( TWO_INTEGER );
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
            final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars( v_answer );
            html_utilities.html_princ_strong( $str71$Answer_Bindings__ );
            html_utilities.html_newline( UNPROVIDED );
            cb_show_inference_answer_bindings( v_bindings, free_el_vars );
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports( justification );
            final SubLObject full_justification = hl_supports.hl_justification_expand( supports );
            final SubLObject validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level( store );
            final SubLObject mts = genl_mts.max_floor_mts( list_utilities.fast_delete_duplicates( Mapping.mapcar( $sym104$SUPPORT_MT, full_justification ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED,
                UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ_strong( PrintLow.format( NIL, $str105$Answer_Justification_Mt_p___, Sequences.length( mts ) ) );
            if( NIL != mts )
            {
              SubLObject cdolist_list_var = mts;
              SubLObject mt = NIL;
              mt = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
              }
            }
            else
            {
              html_utilities.html_princ( $str73$None_found );
              html_utilities.html_newline( UNPROVIDED );
            }
            html_utilities.html_newline( UNPROVIDED );
            html_utilities.html_princ_strong( $str106$Full_Justification__ );
            cb_assertion_browser.cb_show_justification_readably( full_justification, validation_level );
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
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$3, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 16056L)
  public static SubLObject cb_show_inference_answer_justification(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports( justification );
          cb_assertion_browser.cb_show_justification_readably( supports, inference_datastructures_problem_store.problem_store_intermediate_step_validation_level( inference_datastructures_inference
              .inference_answer_justification_store( justification ) ) );
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
          html_utilities.html_indent( FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          cb_utilities.cb_link( $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, $kw48$TERSE, $str109$_Full_Justification_, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          cb_query.cb_princ_with_inference_doc_more_link( $str110$Proofs__, $str111$proofs, UNPROVIDED, UNPROVIDED );
          final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
          SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_proofs( justification );
          SubLObject proof = NIL;
          proof = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_link( $kw112$PROOF, proof, $kw48$TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_newline( UNPROVIDED );
            cb_utilities.cb_link( $kw113$SIMPLE_PROOF_VIEW, proof, v_answer, $str114$_Show_Proof_View_, UNPROVIDED, UNPROVIDED );
            cdolist_list_var = cdolist_list_var.rest();
            proof = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
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
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return justification;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 17450L)
  public static SubLObject cb_inference_fancy_table_js(final SubLObject var_count, final SubLObject nanswers)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.web_bundle( $kw115$DATA_TABLES );
    SubLObject column_type_spec_json = $str116$_;
    final SubLObject pixel_height = nanswers.numG( TWENTY_INTEGER ) ? $int117$600 : ( nanswers.numL( SEVEN_INTEGER ) ? $int118$200 : Numbers.multiply( nanswers, $int119$30 ) );
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( var_count ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      column_type_spec_json = Sequences.cconcatenate( column_type_spec_json, $str120$__null );
    }
    column_type_spec_json = Sequences.copy_seq( $str121$_columnDefs_____type____num_html_ );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str122$__document__ready_function_______, pixel_height, column_type_spec_json );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 18571L)
  public static SubLObject cb_inference_fancy_table_all_answers_js(final SubLObject var_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.web_bundle( $kw115$DATA_TABLES );
    SubLObject column_type_spec_json = $str116$_;
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( var_count ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      column_type_spec_json = Sequences.cconcatenate( column_type_spec_json, $str120$__null );
    }
    column_type_spec_json = Sequences.copy_seq( $str123$_columnDefs_____type____num_html_ );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str124$__document__ready_function_______, column_type_spec_json );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 19469L)
  public static SubLObject cb_show_fully_bound_answer(final SubLObject inference, final SubLObject answer_count, final SubLObject current_answers, final SubLObject inference_new_justification_set)
  {
    if( answer_count.isZero() )
    {
      if( NIL != inference_datastructures_inference.running_inference_p( inference ) )
      {
        html_utilities.html_princ_strong( $str125$Query_was_not_yet_proven );
      }
      else
      {
        html_utilities.html_princ_strong( $str126$Query_was_not_proven );
      }
    }
    else
    {
      final SubLObject v_answer = current_answers.first();
      html_utilities.html_princ_strong( $str127$Query_was_proven );
      html_utilities.html_indent( UNPROVIDED );
      cb_utilities.cb_show_term( $const128$True, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
      cb_show_inference_answer_section_answer_number( v_answer, inference_new_justification_set, answer_count );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 20031L)
  public static SubLObject cb_show_streamed_inference_answer_section(final SubLObject inference, final SubLObject answer_limit)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 20374L)
  public static SubLObject cb_show_inference_answer_section(final SubLObject inference, final SubLObject answer_limit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject current_answers = cb_inference_current_answers( inference );
    final SubLObject free_el_variables = thread.secondMultipleValue();
    final SubLObject inference_new_justification_set = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject answer_count = Sequences.length( current_answers );
    final SubLObject is_running = Equality.eq( inference_datastructures_inference.inference_status( inference ), $kw12$RUNNING );
    final SubLObject my_answer_limit = ( NIL == is_running && NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) ) ? $int129$2100 : answer_limit;
    if( NIL == free_el_variables )
    {
      cb_show_fully_bound_answer( inference, answer_count, current_answers, inference_new_justification_set );
    }
    else if( answer_count.isZero() )
    {
      html_utilities.html_princ_strong( $str130$No_answers );
      if( NIL != is_running )
      {
        html_utilities.html_princ_strong( $str131$_yet_ );
      }
    }
    else
    {
      SubLObject index = ZERO_INTEGER;
      SubLObject answer_limit_exceededP = NIL;
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str132$display );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str133$inferenceresults );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
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
        html_utilities.html_markup( html_macros.$html_table_thead_head$.getGlobalValue() );
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
            html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str134$Answer );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
            cb_show_bindings_horizontal_variable_row( free_el_variables, NIL, T );
            if( NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_princ_strong( $str135$Answer_Mt );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
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
        html_utilities.html_markup( html_macros.$html_table_thead_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_tbody_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL == answer_limit_exceededP )
          {
            SubLObject csome_list_var = current_answers;
            SubLObject v_answer = NIL;
            v_answer = csome_list_var.first();
            while ( NIL == answer_limit_exceededP && NIL != csome_list_var)
            {
              if( NIL != my_answer_limit && index.numGE( my_answer_limit ) )
              {
                answer_limit_exceededP = T;
              }
              else
              {
                index = Numbers.add( index, ONE_INTEGER );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw136$RIGHT ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
                  html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    cb_show_inference_answer_section_answer_number( v_answer, inference_new_justification_set, answer_count );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  cb_show_inference_answer_section_bindings( v_answer, free_el_variables );
                  if( NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue( thread ) )
                  {
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer( v_answer, T );
                      if( NIL != mts )
                      {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt = NIL;
                        mt = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                          html_utilities.html_newline( UNPROVIDED );
                          cdolist_list_var = cdolist_list_var.rest();
                          mt = cdolist_list_var.first();
                        }
                      }
                      else
                      {
                        html_utilities.html_princ( $str73$None_found );
                        html_utilities.html_newline( UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                html_utilities.html_source_readability_terpri( UNPROVIDED );
              }
              csome_list_var = csome_list_var.rest();
              v_answer = csome_list_var.first();
            }
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tbody_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      if( NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) && NIL == answer_limit_exceededP && NIL == is_running )
      {
        if( NIL == answer_limit )
        {
          cb_inference_fancy_table_all_answers_js( Sequences.length( free_el_variables ) );
        }
        else
        {
          cb_inference_fancy_table_js( Sequences.length( free_el_variables ), index );
        }
      }
      if( NIL != cb_parameters.$cb_perform_argumentation_for_closed_queryP$.getDynamicValue( thread ) && NIL != inference_utilities.inference_requires_argumentationP( inference ) )
      {
        cb_show_argumentation_result( inference );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 23060L)
  public static SubLObject cb_show_inference_answer_section_answer_number(final SubLObject v_answer, final SubLObject inference_new_justification_set, final SubLObject answer_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject linktext = ONE_INTEGER.numE( answer_count ) ? $str137$Explain : PrintLow.format( NIL, $str138$Explain___A, inference_datastructures_inference.inference_answer_suid( v_answer ) );
    final SubLObject newness = cb_determine_inference_answer_newness( v_answer, inference_new_justification_set );
    if( NIL == cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) )
    {
      linktext = Sequences.cconcatenate( $str139$_, new SubLObject[] { linktext, $str140$_
      } );
    }
    cb_show_normal_inference_answer_justification_button( newness, v_answer, linktext );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24114L)
  public static SubLObject cb_show_normal_inference_answer_justification_button(final SubLObject newness, final SubLObject v_answer, final SubLObject hover)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str141$display_none );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str142$_A, inference_datastructures_inference.inference_answer_suid( v_answer ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    cb_show_inference_answer_newness_token( newness );
    cb_utilities.cb_link( $kw56$INFERENCE_ANSWER, v_answer, $kw49$MINIMAL, hover, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24613L)
  public static SubLObject cb_determine_inference_answer_newness(final SubLObject v_answer, final SubLObject inference_new_justification_set)
  {
    if( NIL != inference_datastructures_inference.inference_answer_newP( v_answer ) )
    {
      return $kw143$NEW_ANSWER;
    }
    if( NIL != cb_inference_answer_has_new_justificationP( v_answer, inference_new_justification_set ) )
    {
      return $kw144$NEW_JUSTIFICATION;
    }
    return $kw145$OLD;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 24923L)
  public static SubLObject cb_show_inference_answer_newness_token(final SubLObject newness)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color = cb_determine_inference_answer_bgcolor( newness );
    SubLObject explanation = NIL;
    if( newness.eql( $kw145$OLD ) )
    {
      explanation = $str146$Old_answer;
    }
    else if( newness.eql( $kw143$NEW_ANSWER ) )
    {
      explanation = $str147$New_answer;
    }
    else if( newness.eql( $kw144$NEW_JUSTIFICATION ) )
    {
      explanation = $str148$Old_answer_with_a_new_justificati;
    }
    if( $kw145$OLD != newness )
    {
      html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_style_background_color( color );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_query.cb_princ_with_explanation( $str149$_, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25507L)
  public static SubLObject cb_inference_answer_has_new_justificationP(final SubLObject v_answer, final SubLObject new_justification_set)
  {
    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != set.set_memberP( justification, new_justification_set ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25749L)
  public static SubLObject cb_determine_inference_answer_bgcolor(final SubLObject newness)
  {
    if( newness.eql( $kw145$OLD ) )
    {
      return NIL;
    }
    if( newness.eql( $kw143$NEW_ANSWER ) )
    {
      return $kw150$YELLOW;
    }
    if( newness.eql( $kw144$NEW_JUSTIFICATION ) )
    {
      return $kw151$GREEN;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 25982L)
  public static SubLObject cb_inference_current_answers(final SubLObject inference)
  {
    final SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars( inference );
    final SubLObject inference_new_justification_set = set.new_set( Symbols.symbol_function( EQ ), inference_datastructures_inference.inference_new_justification_count( inference ) );
    SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements( inference_datastructures_inference.inference_new_answer_justifications( inference ) );
    SubLObject justification = NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( justification, inference_new_justification_set );
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    SubLObject current_answers = NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, $kw152$SKIP ) )
    {
      final SubLObject idx_$19 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$19, $kw152$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$19 );
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw152$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = $kw152$SKIP;
            }
            current_answers = ConsesLow.cons( v_answer, current_answers );
          }
        }
      }
      final SubLObject idx_$20 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$20 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$20 );
        SubLObject id2 = NIL;
        SubLObject v_answer2 = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            current_answers = ConsesLow.cons( v_answer2, current_answers );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    current_answers = Sort.sort( current_answers, Symbols.symbol_function( $sym153$_ ), Symbols.symbol_function( $sym154$INFERENCE_ANSWER_SUID ) );
    return Values.values( current_answers, free_el_variables, inference_new_justification_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 26831L)
  public static SubLObject cb_show_inference_answer_section_bindings(final SubLObject inference_answer, final SubLObject free_el_variables)
  {
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( inference_answer );
    cb_show_bindings_horizontal_value_row( v_bindings, free_el_variables );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27080L)
  public static SubLObject cb_show_argumentation_result(final SubLObject inference)
  {
    final SubLObject tv = inference_utilities.inference_argumentation_result( inference );
    html_utilities.html_princ( $str155$Weighing_these_arguments_yields_a );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    cb_show_tv( tv );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27558L)
  public static SubLObject cb_show_tv(final SubLObject tv)
  {
    if( tv.eql( $kw156$TRUE_DEF ) )
    {
      html_utilities.html_princ( $str157$True__default_ );
    }
    else if( tv.eql( $kw158$TRUE_MON ) )
    {
      html_utilities.html_princ( $str159$True__monotonic_ );
    }
    else if( tv.eql( $kw160$FALSE_DEF ) )
    {
      html_utilities.html_princ( $str161$False__default_ );
    }
    else if( tv.eql( $kw162$FALSE_MON ) )
    {
      html_utilities.html_princ( $str163$False__monotonic_ );
    }
    else if( tv.eql( $kw164$UNKNOWN ) )
    {
      html_utilities.html_princ( $str165$Unknown );
    }
    else
    {
      html_utilities.html_princ( $str166$___ );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 27887L)
  public static SubLObject cb_show_bindings(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = $kw167$ALL;
    }
    html_utilities.html_princ( $str168$_ );
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !binding.eql( v_bindings.first() ) )
        {
          html_utilities.html_indent( UNPROVIDED );
        }
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        cb_show_binding( binding );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject some_binding_shownP = NIL;
      SubLObject cdolist_list_var2 = selected_variables;
      SubLObject selected_variable = NIL;
      selected_variable = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject binding2 = bindings.get_variable_binding( selected_variable, v_bindings );
        if( NIL != binding2 )
        {
          if( NIL != some_binding_shownP )
          {
            html_utilities.html_indent( UNPROVIDED );
          }
          else
          {
            some_binding_shownP = T;
          }
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_show_binding( binding2 );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        selected_variable = cdolist_list_var2.first();
      }
    }
    html_utilities.html_princ( $str77$_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 28868L)
  public static SubLObject cb_show_binding(final SubLObject binding)
  {
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list169 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    html_utilities.html_princ( $str168$_ );
    cb_utilities.cb_show_term( variable, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str170$___ );
    cb_utilities.cb_show_term( value, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str77$_ );
    return binding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 29094L)
  public static SubLObject cb_show_bindings_vertical(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = $kw167$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( $kw167$ALL == selected_variables )
      {
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          cb_show_binding_vertical( binding );
          cdolist_list_var = cdolist_list_var.rest();
          binding = cdolist_list_var.first();
        }
      }
      else
      {
        SubLObject cdolist_list_var = selected_variables;
        SubLObject selected_variable = NIL;
        selected_variable = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject binding2 = bindings.get_variable_binding( selected_variable, v_bindings );
          if( NIL != binding2 )
          {
            cb_show_binding_vertical( binding2 );
          }
          cdolist_list_var = cdolist_list_var.rest();
          selected_variable = cdolist_list_var.first();
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 29841L)
  public static SubLObject cb_show_binding_vertical(final SubLObject binding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list169 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw136$RIGHT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_show_term( variable, ZERO_INTEGER, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_glyph( $kw172$NBSP, UNPROVIDED );
        html_utilities.html_glyph( $kw173$RIGHTWARDS_ARROW, UNPROVIDED );
        html_utilities.html_glyph( $kw172$NBSP, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_utilities.cb_show_term( value, ZERO_INTEGER, T );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    return binding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 30301L)
  public static SubLObject cb_show_bindings_horizontal(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = $kw167$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
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
    html_utilities.html_markup( FOUR_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_show_bindings_horizontal_variable_row( selected_variables, v_bindings, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        cb_show_bindings_horizontal_value_row( v_bindings, selected_variables );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 30949L)
  public static SubLObject cb_show_bindings_horizontal_variable_row(final SubLObject selected_variables, SubLObject v_bindings, SubLObject strongP)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( strongP == UNPROVIDED )
    {
      strongP = NIL;
    }
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_show_binding_variable_horizontal( bindings.variable_binding_variable( binding ), strongP );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var = selected_variables;
      SubLObject selected_variable = NIL;
      selected_variable = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_show_binding_variable_horizontal( selected_variable, strongP );
        cdolist_list_var = cdolist_list_var.rest();
        selected_variable = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 31655L)
  public static SubLObject cb_show_bindings_horizontal_value_row(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = $kw167$ALL;
    }
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_show_binding_value_horizontal( bindings.variable_binding_value( binding ) );
        cdolist_list_var = cdolist_list_var.rest();
        binding = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var = selected_variables;
      SubLObject selected_variable = NIL;
      selected_variable = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject binding2 = bindings.get_variable_binding( selected_variable, v_bindings );
        if( NIL != binding2 )
        {
          cb_show_binding_value_horizontal( bindings.variable_binding_value( binding2 ) );
        }
        else
        {
          cb_show_missing_binding_value_horizontal();
        }
        cdolist_list_var = cdolist_list_var.rest();
        selected_variable = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32489L)
  public static SubLObject cb_show_binding_variable_horizontal(final SubLObject variable, SubLObject strongP)
  {
    if( strongP == UNPROVIDED )
    {
      strongP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != strongP )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        cb_utilities.cb_show_term( variable, ZERO_INTEGER, NIL );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      else
      {
        cb_utilities.cb_show_term( variable, ZERO_INTEGER, NIL );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 32863L)
  public static SubLObject cb_show_binding_value_horizontal(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != $cb_show_inference_results_in_nlP$.getDynamicValue( thread ) )
      {
        cb_utilities.cb_show_term_in_nl( value, UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_show_term( value, ZERO_INTEGER, T );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 33090L)
  public static SubLObject cb_show_missing_binding_value_horizontal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw107$LEFT ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_indent( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-query-browser.lisp", position = 33235L)
  public static SubLObject cb_variable_map_horizontal(final SubLObject variable_map)
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
      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject list_var = NIL;
        SubLObject variable_map_binding = NIL;
        SubLObject index = NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_indent( TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          SubLObject current;
          final SubLObject datum = current = variable_map_binding;
          SubLObject from_variable = NIL;
          SubLObject to_variable = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
          from_variable = current.first();
          current = ( to_variable = current.rest() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( to_variable, ZERO_INTEGER, NIL );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        SubLObject list_var = NIL;
        SubLObject variable_map_binding = NIL;
        SubLObject index = NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_indent( TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_glyph( $kw176$UPWARDS_ARROW, UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
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
        SubLObject list_var = NIL;
        SubLObject variable_map_binding = NIL;
        SubLObject index = NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_indent( TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          SubLObject current;
          final SubLObject datum = current = variable_map_binding;
          SubLObject from_variable = NIL;
          SubLObject to_variable = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list175 );
          from_variable = current.first();
          current = ( to_variable = current.rest() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw171$CENTER ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( $kw108$TOP ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            cb_utilities.cb_form( from_variable, ZERO_INTEGER, NIL );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$34, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
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

  public static SubLObject declare_cb_query_browser_file()
  {
    SubLFiles.declareFunction( me, "cb_show_inference_el_query", "CB-SHOW-INFERENCE-EL-QUERY", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_inference_status", "CB-SHOW-INFERENCE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_suspend_status", "CB-SHOW-INFERENCE-SUSPEND-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_answer", "CB-INFERENCE-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_inference_answer", "CB-LINK-INFERENCE-ANSWER", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_form_inference_answer_method", "CB-FORM-INFERENCE-ANSWER-METHOD", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_guess_inference_answer", "CB-GUESS-INFERENCE-ANSWER", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_bindings", "CB-SHOW-INFERENCE-ANSWER-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_summary", "CB-SHOW-INFERENCE-ANSWER-SUMMARY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_answer_guts", "CB-INFERENCE-ANSWER-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_creation_time", "CB-SHOW-INFERENCE-ANSWER-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_universal_time", "CB-SHOW-UNIVERSAL-TIME", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_step_count", "CB-SHOW-INFERENCE-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_socratic_query_from_answer", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_socratic_query_from_answer", "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_inference_answer_full_justification", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_inference_answer_full_justification", "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 3, false );
    SubLFiles.declareFunction( me, "inference_answer_justification_suid", "INFERENCE-ANSWER-JUSTIFICATION-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_guess_inference_answer_justification", "CB-GUESS-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_answer_full_justification_guts", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION-GUTS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_justification", "CB-SHOW-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_fancy_table_js", "CB-INFERENCE-FANCY-TABLE-JS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_fancy_table_all_answers_js", "CB-INFERENCE-FANCY-TABLE-ALL-ANSWERS-JS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_fully_bound_answer", "CB-SHOW-FULLY-BOUND-ANSWER", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_show_streamed_inference_answer_section", "CB-SHOW-STREAMED-INFERENCE-ANSWER-SECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_section", "CB-SHOW-INFERENCE-ANSWER-SECTION", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_section_answer_number", "CB-SHOW-INFERENCE-ANSWER-SECTION-ANSWER-NUMBER", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_normal_inference_answer_justification_button", "CB-SHOW-NORMAL-INFERENCE-ANSWER-JUSTIFICATION-BUTTON", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_inference_answer_newness", "CB-DETERMINE-INFERENCE-ANSWER-NEWNESS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_newness_token", "CB-SHOW-INFERENCE-ANSWER-NEWNESS-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_answer_has_new_justificationP", "CB-INFERENCE-ANSWER-HAS-NEW-JUSTIFICATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_determine_inference_answer_bgcolor", "CB-DETERMINE-INFERENCE-ANSWER-BGCOLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_inference_current_answers", "CB-INFERENCE-CURRENT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_inference_answer_section_bindings", "CB-SHOW-INFERENCE-ANSWER-SECTION-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_show_argumentation_result", "CB-SHOW-ARGUMENTATION-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_tv", "CB-SHOW-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bindings", "CB-SHOW-BINDINGS", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_binding", "CB-SHOW-BINDING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bindings_vertical", "CB-SHOW-BINDINGS-VERTICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_binding_vertical", "CB-SHOW-BINDING-VERTICAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_bindings_horizontal", "CB-SHOW-BINDINGS-HORIZONTAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_bindings_horizontal_variable_row", "CB-SHOW-BINDINGS-HORIZONTAL-VARIABLE-ROW", 1, 2, false );
    SubLFiles.declareFunction( me, "cb_show_bindings_horizontal_value_row", "CB-SHOW-BINDINGS-HORIZONTAL-VALUE-ROW", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_binding_variable_horizontal", "CB-SHOW-BINDING-VARIABLE-HORIZONTAL", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_show_binding_value_horizontal", "CB-SHOW-BINDING-VALUE-HORIZONTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_show_missing_binding_value_horizontal", "CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_variable_map_horizontal", "CB-VARIABLE-MAP-HORIZONTAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_query_browser_file()
  {
    $cb_inference_browser_show_answer_max_floor_mtsP$ = SubLFiles.defparameter( "*CB-INFERENCE-BROWSER-SHOW-ANSWER-MAX-FLOOR-MTS?*", NIL );
    $cb_show_inference_results_in_nlP$ = SubLFiles.defparameter( "*CB-SHOW-INFERENCE-RESULTS-IN-NL?*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_query_browser_file()
  {
    html_macros.note_cgi_handler_function( $sym45$CB_INFERENCE_ANSWER, $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw56$INFERENCE_ANSWER, $sym57$CB_LINK_INFERENCE_ANSWER, FOUR_INTEGER );
    Structures.register_method( cb_utilities.$cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function(
        $sym58$CB_FORM_INFERENCE_ANSWER_METHOD ) );
    html_macros.note_cgi_handler_function( $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER, $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw67$SOCRATIC_QUERY_FROM_ANSWER, $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, TWO_INTEGER );
    html_macros.note_cgi_handler_function( $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION, $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, FOUR_INTEGER );
    utilities_macros.register_html_state_variable( $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
    utilities_macros.register_html_interface_variable( $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_query_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_query_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_query_browser_file();
  }
  static
  {
    me = new cb_query_browser();
    $cb_inference_browser_show_answer_max_floor_mtsP$ = null;
    $cb_show_inference_results_in_nlP$ = null;
    $kw0$SILK = makeKeyword( "SILK" );
    $str1$SILK_Query__ = makeString( "SILK Query :" );
    $str2$Mt__ = makeString( "Mt :" );
    $str3$EL_Query__ = makeString( "EL Query :" );
    $str4$Pragmatics__ = makeString( "Pragmatics :" );
    $sym5$INFERENCE_STATUS_P = makeSymbol( "INFERENCE-STATUS-P" );
    $kw6$NEW = makeKeyword( "NEW" );
    $str7$New = makeString( "New" );
    $kw8$PREPARED = makeKeyword( "PREPARED" );
    $str9$Prepared = makeString( "Prepared" );
    $kw10$READY = makeKeyword( "READY" );
    $str11$Ready = makeString( "Ready" );
    $kw12$RUNNING = makeKeyword( "RUNNING" );
    $str13$Running = makeString( "Running" );
    $kw14$SUSPENDED = makeKeyword( "SUSPENDED" );
    $str15$Suspended = makeString( "Suspended" );
    $kw16$DEAD = makeKeyword( "DEAD" );
    $str17$Dead = makeString( "Dead" );
    $kw18$TAUTOLOGY = makeKeyword( "TAUTOLOGY" );
    $str19$Tautology = makeString( "Tautology" );
    $kw20$CONTRADICTION = makeKeyword( "CONTRADICTION" );
    $str21$Contradiction = makeString( "Contradiction" );
    $kw22$ILL_FORMED = makeKeyword( "ILL-FORMED" );
    $str23$Ill_Formed = makeString( "Ill-Formed" );
    $sym24$INFERENCE_SUSPEND_STATUS_P = makeSymbol( "INFERENCE-SUSPEND-STATUS-P" );
    $kw25$ABORT = makeKeyword( "ABORT" );
    $str26$Abort = makeString( "Abort" );
    $kw27$INTERRUPT = makeKeyword( "INTERRUPT" );
    $str28$Interrupt = makeString( "Interrupt" );
    $kw29$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $str30$Max_Number = makeString( "Max Number" );
    $kw31$MAX_TIME = makeKeyword( "MAX-TIME" );
    $str32$Max_Time = makeString( "Max Time" );
    $kw33$MAX_STEP = makeKeyword( "MAX-STEP" );
    $str34$Max_Step = makeString( "Max Step" );
    $kw35$MAX_PROBLEM_COUNT = makeKeyword( "MAX-PROBLEM-COUNT" );
    $str36$Max_Problem_Count = makeString( "Max Problem Count" );
    $kw37$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $str38$Probably_Approximately_Done = makeString( "Probably Approximately Done" );
    $kw39$EXHAUST = makeKeyword( "EXHAUST" );
    $str40$Exhaust = makeString( "Exhaust" );
    $kw41$EXHAUST_TOTAL = makeKeyword( "EXHAUST-TOTAL" );
    $str42$Exhaust_Total = makeString( "Exhaust Total" );
    $list43 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "INFERENCE-ID-STRING" ), makeSymbol( "ANSWER-ID-STRING" ) );
    $str44$_A_did_not_specify_an_inference_a = makeString( "~A did not specify an inference answer" );
    $sym45$CB_INFERENCE_ANSWER = makeSymbol( "CB-INFERENCE-ANSWER" );
    $kw46$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $kw47$MAIN = makeKeyword( "MAIN" );
    $kw48$TERSE = makeKeyword( "TERSE" );
    $kw49$MINIMAL = makeKeyword( "MINIMAL" );
    $str50$__A__A__A_ = makeString( "[~A.~A.~A]" );
    $str51$_Inference_Answer__A__A__A_ = makeString( "[Inference Answer ~A.~A.~A]" );
    $kw52$VERBOSE = makeKeyword( "VERBOSE" );
    $str53$_Inference_Answer__A__A__A__A_ = makeString( "[Inference Answer ~A.~A.~A ~A]" );
    $str54$cb_inference_answer__A__A__A = makeString( "cb-inference-answer&~A&~A&~A" );
    $str55$button = makeString( "button" );
    $kw56$INFERENCE_ANSWER = makeKeyword( "INFERENCE-ANSWER" );
    $sym57$CB_LINK_INFERENCE_ANSWER = makeSymbol( "CB-LINK-INFERENCE-ANSWER" );
    $sym58$CB_FORM_INFERENCE_ANSWER_METHOD = makeSymbol( "CB-FORM-INFERENCE-ANSWER-METHOD" );
    $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str60$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw61$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str62$Inference_Answer = makeString( "Inference Answer" );
    $str63$_for_ = makeString( " for " );
    $kw64$INFERENCE = makeKeyword( "INFERENCE" );
    $str65$_in_ = makeString( " in " );
    $kw66$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw67$SOCRATIC_QUERY_FROM_ANSWER = makeKeyword( "SOCRATIC-QUERY-FROM-ANSWER" );
    $str68$_Socratic_Query_ = makeString( "[Socratic Query]" );
    $str69$Creation_Time____ = makeString( "Creation Time :  " );
    $str70$Steps_to_This_Answer____ = makeString( "Steps to This Answer :  " );
    $str71$Answer_Bindings__ = makeString( "Answer Bindings :" );
    $str72$Answer_Mt_p___ = makeString( "Answer Mt~p : " );
    $str73$None_found = makeString( "None found" );
    $str74$Justifications__ = makeString( "Justifications :" );
    $str75$after = makeString( "after" );
    $str76$__at_ = makeString( " (at " );
    $str77$_ = makeString( ")" );
    $sym78$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
    $str79$_today = makeString( " today" );
    $str80$_on__A = makeString( " on ~A" );
    $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol( "CB-SOCRATIC-QUERY-FROM-ANSWER" );
    $kw82$SELF = makeKeyword( "SELF" );
    $str83$cb_socratic_query_from_answer__A_ = makeString( "cb-socratic-query-from-answer&~A&~A&~A" );
    $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER = makeSymbol( "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER" );
    $list85 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "INFERENCE-ID-STRING" ), makeSymbol( "ANSWER-ID-STRING" ), makeSymbol( "JUSTIFICATION-ID-STRING" ) );
    $str86$_A_did_not_specify_an_inference_a = makeString( "~A did not specify an inference answer justification" );
    $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol( "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $str88$__A__A__A__A_ = makeString( "[~A.~A.~A.~A]" );
    $str89$_Inference_Answer__A__A__A__A_ = makeString( "[Inference Answer ~A.~A.~A.~A]" );
    $str90$_Inference_Answer__A__A__A__A__A_ = makeString( "[Inference Answer ~A.~A.~A.~A ~A]" );
    $str91$cb_inference_answer_full_justific = makeString( "cb-inference-answer-full-justification&~A&~A&~A&~A" );
    $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION = makeKeyword( "INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION = makeSymbol( "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $str94$ = makeString( "" );
    $kw95$CB_CYC = makeKeyword( "CB-CYC" );
    $kw96$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw97$SHA1 = makeKeyword( "SHA1" );
    $str98$yui_skin_sam = makeString( "yui-skin-sam" );
    $str99$reloadFrameButton = makeString( "reloadFrameButton" );
    $str100$reload = makeString( "reload" );
    $str101$Refresh_Frames = makeString( "Refresh Frames" );
    $str102$Inference_Answer_Full_Justificati = makeString( "Inference Answer Full Justification" );
    $str103$_for_answer_ = makeString( " for answer " );
    $sym104$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $str105$Answer_Justification_Mt_p___ = makeString( "Answer Justification Mt~p : " );
    $str106$Full_Justification__ = makeString( "Full Justification :" );
    $kw107$LEFT = makeKeyword( "LEFT" );
    $kw108$TOP = makeKeyword( "TOP" );
    $str109$_Full_Justification_ = makeString( "[Full Justification]" );
    $str110$Proofs__ = makeString( "Proofs :" );
    $str111$proofs = makeString( "proofs" );
    $kw112$PROOF = makeKeyword( "PROOF" );
    $kw113$SIMPLE_PROOF_VIEW = makeKeyword( "SIMPLE-PROOF-VIEW" );
    $str114$_Show_Proof_View_ = makeString( "[Show Proof View]" );
    $kw115$DATA_TABLES = makeKeyword( "DATA-TABLES" );
    $str116$_ = makeString( " " );
    $int117$600 = makeInteger( 600 );
    $int118$200 = makeInteger( 200 );
    $int119$30 = makeInteger( 30 );
    $str120$__null = makeString( ", null" );
    $str121$_columnDefs_____type____num_html_ = makeString( "'columnDefs':[{'type': 'num-html', targets: 0, width: '5px'}]" );
    $str122$__document__ready_function_______ = makeString(
        "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {   'autoWidth':      false,\n        'scrollY':        '~Apx',\n        'scrollX':        false,\n        'scrollCollapse': true,\n        'paging':         false,\n        'dom': 'Rtif',\n        'language': {\n\t       'search': 'Filter Answers:' \n\t },\n         ~A\n    } \n                   )  } );" );
    $str123$_columnDefs_____type____num_html_ = makeString( "'columnDefs':[{'type': 'num-html', targets: 0, width: 1}]" );
    $str124$__document__ready_function_______ = makeString(
        "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {\n        'autoWidth': false,\n        'paging'   : false,\n        'dom'      : 'Rfti',\n        'language' : {\n\t       'search': 'Filter Answers:'\n\t },\n         ~A\n    } \n                   )  } );" );
    $str125$Query_was_not_yet_proven = makeString( "Query was not yet proven" );
    $str126$Query_was_not_proven = makeString( "Query was not proven" );
    $str127$Query_was_proven = makeString( "Query was proven" );
    $const128$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $int129$2100 = makeInteger( 2100 );
    $str130$No_answers = makeString( "No answers" );
    $str131$_yet_ = makeString( " yet." );
    $str132$display = makeString( "display" );
    $str133$inferenceresults = makeString( "inferenceresults" );
    $str134$Answer = makeString( "Answer" );
    $str135$Answer_Mt = makeString( "Answer Mt" );
    $kw136$RIGHT = makeKeyword( "RIGHT" );
    $str137$Explain = makeString( "Explain" );
    $str138$Explain___A = makeString( "Explain #~A" );
    $str139$_ = makeString( "[" );
    $str140$_ = makeString( "]" );
    $str141$display_none = makeString( "display:none" );
    $str142$_A = makeString( "~A" );
    $kw143$NEW_ANSWER = makeKeyword( "NEW-ANSWER" );
    $kw144$NEW_JUSTIFICATION = makeKeyword( "NEW-JUSTIFICATION" );
    $kw145$OLD = makeKeyword( "OLD" );
    $str146$Old_answer = makeString( "Old answer" );
    $str147$New_answer = makeString( "New answer" );
    $str148$Old_answer_with_a_new_justificati = makeString( "Old answer with a new justification" );
    $str149$_ = makeString( "*" );
    $kw150$YELLOW = makeKeyword( "YELLOW" );
    $kw151$GREEN = makeKeyword( "GREEN" );
    $kw152$SKIP = makeKeyword( "SKIP" );
    $sym153$_ = makeSymbol( ">" );
    $sym154$INFERENCE_ANSWER_SUID = makeSymbol( "INFERENCE-ANSWER-SUID" );
    $str155$Weighing_these_arguments_yields_a = makeString( "Weighing these arguments yields an overall result of: " );
    $kw156$TRUE_DEF = makeKeyword( "TRUE-DEF" );
    $str157$True__default_ = makeString( "True (default)" );
    $kw158$TRUE_MON = makeKeyword( "TRUE-MON" );
    $str159$True__monotonic_ = makeString( "True (monotonic)" );
    $kw160$FALSE_DEF = makeKeyword( "FALSE-DEF" );
    $str161$False__default_ = makeString( "False (default)" );
    $kw162$FALSE_MON = makeKeyword( "FALSE-MON" );
    $str163$False__monotonic_ = makeString( "False (monotonic)" );
    $kw164$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str165$Unknown = makeString( "Unknown" );
    $str166$___ = makeString( "???" );
    $kw167$ALL = makeKeyword( "ALL" );
    $str168$_ = makeString( "(" );
    $list169 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
    $str170$___ = makeString( " . " );
    $kw171$CENTER = makeKeyword( "CENTER" );
    $kw172$NBSP = makeKeyword( "NBSP" );
    $kw173$RIGHTWARDS_ARROW = makeKeyword( "RIGHTWARDS-ARROW" );
    $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = makeSymbol( "*CB-SHOW-INFERENCE-RESULTS-IN-NL?*" );
    $list175 = ConsesLow.cons( makeSymbol( "FROM-VARIABLE" ), makeSymbol( "TO-VARIABLE" ) );
    $kw176$UPWARDS_ARROW = makeKeyword( "UPWARDS-ARROW" );
  }
}
/*
 *
 * Total time: 739 ms
 *
 */