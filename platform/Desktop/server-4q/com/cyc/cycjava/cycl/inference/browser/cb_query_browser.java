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

public final class cb_query_browser extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_query_browser";
  public static final String myFingerPrint = "a5f0ba72c8cc4101b107db5f508befb46d835efeb9cd5fc829b67a88bfa07202";
  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 17353L)
  private static SubLSymbol $cb_inference_browser_show_answer_max_floor_mtsP$;
  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 32751L)
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

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 829L)
  public static SubLObject cb_show_inference_el_query(final SubLObject inference, SubLObject show_mtP)
  {
    if( show_mtP == UNPROVIDED )
    {
      show_mtP = (SubLObject) T;
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
        html_utilities.html_princ_strong( (SubLObject) $str2$Mt__ );
        html_utilities.html_indent( (SubLObject) UNPROVIDED );
        cb_utilities.cb_show_term( mt, (SubLObject) ZERO_INTEGER, (SubLObject) NIL );
        html_utilities.html_newline( (SubLObject) UNPROVIDED );
      }
    }
    html_utilities.html_princ_strong( (SubLObject) $str3$EL_Query__ );
    html_utilities.html_newline( (SubLObject) UNPROVIDED );
    cb_utilities.cb_form( el_query, (SubLObject) ZERO_INTEGER, (SubLObject) T );
    final SubLObject non_explanatory_el_query = inference_datastructures_inference.inference_input_non_explanatory_el_query( inference );
    if( NIL != non_explanatory_el_query )
    {
      html_utilities.html_newline( (SubLObject) UNPROVIDED );
      html_utilities.html_princ_strong( (SubLObject) $str4$Pragmatics__ );
      html_utilities.html_newline( (SubLObject) UNPROVIDED );
      cb_utilities.cb_form( non_explanatory_el_query, (SubLObject) ZERO_INTEGER, (SubLObject) T );
    }
    return inference;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 2160L)
  public static SubLObject cb_show_inference_status(final SubLObject status)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_status_p( status ) : status;
    if( status.eql( (SubLObject) $kw6$NEW ) )
    {
      html_utilities.html_princ( (SubLObject) $str7$New );
    }
    else if( status.eql( (SubLObject) $kw8$PREPARED ) )
    {
      html_utilities.html_princ( (SubLObject) $str9$Prepared );
    }
    else if( status.eql( (SubLObject) $kw10$READY ) )
    {
      html_utilities.html_princ( (SubLObject) $str11$Ready );
    }
    else if( status.eql( (SubLObject) $kw12$RUNNING ) )
    {
      html_utilities.html_princ( (SubLObject) $str13$Running );
    }
    else if( status.eql( (SubLObject) $kw14$SUSPENDED ) )
    {
      html_utilities.html_princ( (SubLObject) $str15$Suspended );
    }
    else if( status.eql( (SubLObject) $kw16$DEAD ) )
    {
      html_utilities.html_princ( (SubLObject) $str17$Dead );
    }
    else if( status.eql( (SubLObject) $kw18$TAUTOLOGY ) )
    {
      html_utilities.html_princ( (SubLObject) $str19$Tautology );
    }
    else if( status.eql( (SubLObject) $kw20$CONTRADICTION ) )
    {
      html_utilities.html_princ( (SubLObject) $str21$Contradiction );
    }
    else if( status.eql( (SubLObject) $kw22$ILL_FORMED ) )
    {
      html_utilities.html_princ( (SubLObject) $str23$Ill_Formed );
    }
    else
    {
      html_utilities.html_princ( status );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 2737L)
  public static SubLObject cb_show_inference_suspend_status(final SubLObject suspend_status)
  {
    assert NIL != inference_datastructures_enumerated_types.inference_suspend_status_p( suspend_status ) : suspend_status;
    if( suspend_status.eql( (SubLObject) $kw25$ABORT ) )
    {
      html_utilities.html_princ( (SubLObject) $str26$Abort );
    }
    else if( suspend_status.eql( (SubLObject) $kw27$INTERRUPT ) )
    {
      html_utilities.html_princ( (SubLObject) $str28$Interrupt );
    }
    else if( suspend_status.eql( (SubLObject) $kw29$MAX_NUMBER ) )
    {
      html_utilities.html_princ( (SubLObject) $str30$Max_Number );
    }
    else if( suspend_status.eql( (SubLObject) $kw31$MAX_TIME ) )
    {
      html_utilities.html_princ( (SubLObject) $str32$Max_Time );
    }
    else if( suspend_status.eql( (SubLObject) $kw33$MAX_STEP ) )
    {
      html_utilities.html_princ( (SubLObject) $str34$Max_Step );
    }
    else if( suspend_status.eql( (SubLObject) $kw35$MAX_PROBLEM_COUNT ) )
    {
      html_utilities.html_princ( (SubLObject) $str36$Max_Problem_Count );
    }
    else if( suspend_status.eql( (SubLObject) $kw37$PROBABLY_APPROXIMATELY_DONE ) )
    {
      html_utilities.html_princ( (SubLObject) $str38$Probably_Approximately_Done );
    }
    else if( suspend_status.eql( (SubLObject) $kw39$EXHAUST ) )
    {
      html_utilities.html_princ( (SubLObject) $str40$Exhaust );
    }
    else if( suspend_status.eql( (SubLObject) $kw41$EXHAUST_TOTAL ) )
    {
      html_utilities.html_princ( (SubLObject) $str42$Exhaust_Total );
    }
    else
    {
      html_utilities.html_princ( suspend_status );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 3437L)
  public static SubLObject cb_inference_answer(final SubLObject args)
  {
    SubLObject store_id_string = (SubLObject) NIL;
    SubLObject inference_id_string = (SubLObject) NIL;
    SubLObject answer_id_string = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, (SubLObject) $list43 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list43 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list43 );
    answer_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, (SubLObject) $list43 );
      return (SubLObject) NIL;
    }
    final SubLObject v_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_p( v_answer ) )
    {
      return cb_utilities.cb_error( (SubLObject) $str44$_A_did_not_specify_an_inference_a, args, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return cb_inference_answer_guts( v_answer );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 3889L)
  public static SubLObject cb_link_inference_answer(final SubLObject v_answer, SubLObject verbosity, SubLObject linktext, SubLObject target)
  {
    if( verbosity == UNPROVIDED )
    {
      verbosity = (SubLObject) NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = (SubLObject) NIL;
    }
    if( target == UNPROVIDED )
    {
      target = (SubLObject) NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == target )
    {
      target = (SubLObject) $kw47$MAIN;
    }
    if( NIL == verbosity )
    {
      verbosity = (SubLObject) $kw48$TERSE;
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
      if( pcase_var.eql( (SubLObject) $kw49$MINIMAL ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str50$__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id
        } );
      }
      else if( pcase_var.eql( (SubLObject) $kw48$TERSE ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str51$_Inference_Answer__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id
        } );
      }
      else if( pcase_var.eql( (SubLObject) $kw52$VERBOSE ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str53$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, v_bindings
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
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( answer_id );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      }
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
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
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str54$cb_inference_answer__A__A__A, new SubLObject[] { store_id, inference_id, answer_id
    } );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    }
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      if( NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) )
      {
        html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( (SubLObject) $str55$button );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        if( NIL != answer_id )
        {
          html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_princ( answer_id );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        }
        if( NIL != linktext )
        {
          html_utilities.html_markup( html_macros.$html_attribute_title$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( linktext );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        }
        if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
        {
          html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
        }
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
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

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 5214L)
  public static SubLObject cb_form_inference_answer_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP)
  {
    if( depth == UNPROVIDED )
    {
      depth = (SubLObject) NIL;
    }
    if( wrap_axiomsP == UNPROVIDED )
    {
      wrap_axiomsP = (SubLObject) NIL;
    }
    cb_utilities.cb_link( (SubLObject) $kw56$INFERENCE_ANSWER, v_object, (SubLObject) $kw52$VERBOSE, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return v_object;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 5387L)
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
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 5878L)
  public static SubLObject cb_show_inference_answer_bindings(final SubLObject v_bindings, final SubLObject free_variables)
  {
    cb_show_bindings_vertical( v_bindings, free_variables );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 6024L)
  public static SubLObject cb_show_inference_answer_summary(final SubLObject v_answer)
  {
    cb_utilities.cb_link( (SubLObject) $kw56$INFERENCE_ANSWER, v_answer, (SubLObject) $kw48$TERSE, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    html_utilities.html_newline( (SubLObject) UNPROVIDED );
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
    cb_show_bindings( v_bindings, (SubLObject) UNPROVIDED );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 6249L)
  public static SubLObject cb_inference_answer_guts(final SubLObject v_answer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( (SubLObject) $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) $str60$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( (SubLObject) ( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw61$UNINITIALIZED ) ? ConsesLow.list(
          EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( (SubLObject) $str62$Inference_Answer );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$1 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      final SubLObject _prev_bind_2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ), thread );
        html_macros.$html_inside_bodyP$.bind( (SubLObject) T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
          html_script_utilities.cb_hoverover_page_init();
          dhtml_macros.html_basic_cb_scripts();
          cb_inference_browser.cb_show_relevant_inference_debugging_links( v_answer );
          html_utilities.html_princ_strong( (SubLObject) $str62$Inference_Answer );
          html_utilities.html_indent( (SubLObject) UNPROVIDED );
          cb_utilities.cb_link( (SubLObject) $kw56$INFERENCE_ANSWER, v_answer, (SubLObject) $kw48$TERSE, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          html_utilities.html_princ( (SubLObject) $str63$_for_ );
          cb_utilities.cb_link( (SubLObject) $kw64$INFERENCE, inference_datastructures_inference.inference_answer_inference( v_answer ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
              (SubLObject) UNPROVIDED );
          html_utilities.html_princ( (SubLObject) $str65$_in_ );
          cb_utilities.cb_link( (SubLObject) $kw66$PROBLEM_STORE, inference_datastructures_inference.inference_answer_problem_store( v_answer ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
              (SubLObject) UNPROVIDED );
          html_utilities.html_indent( (SubLObject) FOUR_INTEGER );
          cb_utilities.cb_link( (SubLObject) $kw67$SOCRATIC_QUERY_FROM_ANSWER, v_answer, (SubLObject) $str68$_Socratic_Query_, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          html_utilities.html_indent( (SubLObject) TWO_INTEGER );
          html_utilities.html_hr( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          cb_show_inference_el_query( inference_datastructures_inference.inference_answer_inference( v_answer ), (SubLObject) UNPROVIDED );
          html_utilities.html_newline( (SubLObject) TWO_INTEGER );
          html_utilities.html_princ_strong( (SubLObject) $str69$Creation_Time____ );
          cb_show_inference_answer_creation_time( v_answer );
          html_utilities.html_newline( (SubLObject) UNPROVIDED );
          html_utilities.html_princ_strong( (SubLObject) $str70$Steps_to_This_Answer____ );
          cb_show_inference_answer_step_count( v_answer );
          html_utilities.html_newline( (SubLObject) UNPROVIDED );
          final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
          final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars( v_answer );
          html_utilities.html_princ_strong( (SubLObject) $str71$Answer_Bindings__ );
          html_utilities.html_newline( (SubLObject) UNPROVIDED );
          cb_show_inference_answer_bindings( v_bindings, free_el_vars );
          if( NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue( thread ) )
          {
            final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer( v_answer, (SubLObject) UNPROVIDED );
            html_utilities.html_princ_strong( PrintLow.format( (SubLObject) NIL, (SubLObject) $str72$Answer_Mt_p___, Sequences.length( mts ) ) );
            if( NIL != mts )
            {
              SubLObject cdolist_list_var = mts;
              SubLObject mt = (SubLObject) NIL;
              mt = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cb_utilities.cb_form( mt, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
                html_utilities.html_newline( (SubLObject) UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
              }
            }
            else
            {
              html_utilities.html_princ( (SubLObject) $str73$None_found );
              html_utilities.html_newline( (SubLObject) UNPROVIDED );
            }
          }
          html_utilities.html_newline( (SubLObject) UNPROVIDED );
          html_utilities.html_princ_strong( (SubLObject) $str74$Justifications__ );
          SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_justifications( v_answer );
          SubLObject justification = (SubLObject) NIL;
          justification = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            cb_show_inference_answer_justification( justification );
            cdolist_list_var2 = cdolist_list_var2.rest();
            justification = cdolist_list_var2.first();
          }
          html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
          html_utilities.html_copyright_notice();
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
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
    html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 8628L)
  public static SubLObject cb_show_inference_answer_creation_time(final SubLObject v_answer)
  {
    final SubLObject creation_time = inference_datastructures_inference.inference_answer_creation_time( v_answer );
    final SubLObject elapsed_creation_time = inference_datastructures_inference.inference_answer_elapsed_time( v_answer, (SubLObject) NIL );
    html_utilities.html_princ( (SubLObject) $str75$after );
    html_utilities.html_princ( numeric_date_utilities.elapsed_seconds_string( elapsed_creation_time ) );
    html_utilities.html_princ( (SubLObject) $str76$__at_ );
    cb_show_universal_time( creation_time );
    html_utilities.html_princ( (SubLObject) $str77$_ );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 9020L)
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
      html_utilities.html_princ( (SubLObject) $str79$_today );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str80$_on__A, numeric_date_utilities.datestring( universal_date ) );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 9481L)
  public static SubLObject cb_show_inference_answer_step_count(final SubLObject v_answer)
  {
    final SubLObject step_count = inference_datastructures_inference.inference_answer_step_count( v_answer );
    html_utilities.html_princ( step_count );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 9645L)
  public static SubLObject cb_socratic_query_from_answer(final SubLObject args)
  {
    SubLObject store_id_string = (SubLObject) NIL;
    SubLObject inference_id_string = (SubLObject) NIL;
    SubLObject answer_id_string = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, (SubLObject) $list43 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list43 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list43 );
    answer_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, (SubLObject) $list43 );
      return (SubLObject) NIL;
    }
    final SubLObject inference_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_p( inference_answer ) )
    {
      return cb_utilities.cb_error( (SubLObject) $str44$_A_did_not_specify_an_inference_a, args, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( inference_answer );
    final SubLObject sentence = inference_datastructures_inference.inference_answer_el_sentence( inference_answer );
    final SubLObject mt = inference_datastructures_inference.inference_input_mt( inference );
    final SubLObject v_properties = inference_datastructures_inference.inference_input_query_properties( cb_inference_browser.compute_the_relevant_inference( inference_answer ) );
    return cb_query.cb_socratic_query( sentence, mt, v_properties );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 10367L)
  public static SubLObject cb_link_socratic_query_from_answer(final SubLObject inference_answer, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = (SubLObject) NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = (SubLObject) $str68$_Socratic_Query_;
    }
    final SubLObject answer_id = inference_datastructures_inference.inference_answer_suid( inference_answer );
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( inference_answer );
    final SubLObject inference_id = inference_datastructures_inference.inference_suid( inference );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid( store );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( (SubLObject) $kw82$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str83$cb_socratic_query_from_answer__A_, new SubLObject[] { store_id, inference_id, answer_id
    } );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    }
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 10963L)
  public static SubLObject cb_inference_answer_full_justification(final SubLObject args)
  {
    SubLObject store_id_string = (SubLObject) NIL;
    SubLObject inference_id_string = (SubLObject) NIL;
    SubLObject answer_id_string = (SubLObject) NIL;
    SubLObject justification_id_string = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, (SubLObject) $list85 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list85 );
    inference_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list85 );
    answer_id_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, (SubLObject) $list85 );
    justification_id_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, (SubLObject) $list85 );
      return (SubLObject) NIL;
    }
    final SubLObject justification = cb_guess_inference_answer_justification( store_id_string, inference_id_string, answer_id_string, justification_id_string );
    if( NIL == inference_datastructures_inference.inference_answer_justification_p( justification ) )
    {
      return cb_utilities.cb_error( (SubLObject) $str86$_A_did_not_specify_an_inference_a, args, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return cb_inference_answer_full_justification_guts( justification );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 11618L)
  public static SubLObject cb_link_inference_answer_full_justification(final SubLObject justification, SubLObject verbosity, SubLObject linktext, SubLObject target)
  {
    if( verbosity == UNPROVIDED )
    {
      verbosity = (SubLObject) NIL;
    }
    if( linktext == UNPROVIDED )
    {
      linktext = (SubLObject) NIL;
    }
    if( target == UNPROVIDED )
    {
      target = (SubLObject) NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == target )
    {
      target = (SubLObject) $kw47$MAIN;
    }
    if( NIL == verbosity )
    {
      verbosity = (SubLObject) $kw48$TERSE;
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
      if( pcase_var.eql( (SubLObject) $kw49$MINIMAL ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str88$__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id
        } );
      }
      else if( pcase_var.eql( (SubLObject) $kw48$TERSE ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str89$_Inference_Answer__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id
        } );
      }
      else if( pcase_var.eql( (SubLObject) $kw52$VERBOSE ) )
      {
        linktext = PrintLow.format( (SubLObject) NIL, (SubLObject) $str90$_Inference_Answer__A__A__A__A__A_, new SubLObject[] { store_id, inference_id, answer_id, justification_id, v_bindings
        } );
      }
    }
    html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( target );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str91$cb_inference_answer_full_justific, new SubLObject[] { store_id, inference_id, answer_id, justification_id
    } );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    }
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
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

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 12933L)
  public static SubLObject inference_answer_justification_suid(final SubLObject justification)
  {
    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
    final SubLObject justifications = inference_datastructures_inference.inference_answer_justifications( v_answer );
    return Sequences.position( justification, justifications, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 13208L)
  public static SubLObject cb_guess_inference_answer_justification(final SubLObject store_id_string, final SubLObject inference_id_string, final SubLObject answer_id_string, final SubLObject justification_id_string)
  {
    final SubLObject v_answer = cb_guess_inference_answer( store_id_string, inference_id_string, answer_id_string );
    if( NIL != inference_datastructures_inference.inference_answer_p( v_answer ) )
    {
      final SubLObject just_id = reader.read_from_string_ignoring_errors( justification_id_string, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != subl_promotions.non_negative_integer_p( just_id ) )
      {
        final SubLObject justification = ConsesLow.nth( just_id, inference_datastructures_inference.inference_answer_justifications( v_answer ) );
        return justification;
      }
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 13720L)
  public static SubLObject cb_inference_answer_full_justification_guts(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
    final SubLObject inference = inference_datastructures_inference.inference_answer_inference( v_answer );
    final SubLObject store = inference_datastructures_inference.inference_problem_store( inference );
    final SubLObject title_var = (SubLObject) $str94$;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ), thread );
      html_utilities.html_markup( (SubLObject) $str59$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
        html_utilities.html_markup( (SubLObject) $str60$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( (SubLObject) ( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw61$UNINITIALIZED ) ? ConsesLow.list(
            EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( (SubLObject) $kw95$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$4 = html_macros.$html_inside_bodyP$.currentBinding( thread );
        try
        {
          html_macros.$html_inside_bodyP$.bind( (SubLObject) T, thread );
          html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
          if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
          {
            html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          }
          html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( (SubLObject) $str98$yui_skin_sam );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( (SubLObject) $str99$reloadFrameButton );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( (SubLObject) $str55$button );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( (SubLObject) $str100$reload );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_princ( (SubLObject) $str101$Refresh_Frames );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
            if( NIL != title_var )
            {
              html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
              html_utilities.html_markup( (SubLObject) TWO_INTEGER );
              html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
              html_utilities.html_princ( title_var );
              html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
              html_utilities.html_markup( (SubLObject) TWO_INTEGER );
              html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            }
            html_script_utilities.cb_hoverover_page_init();
            html_utilities.html_princ_strong( (SubLObject) $str102$Inference_Answer_Full_Justificati );
            html_utilities.html_indent( (SubLObject) UNPROVIDED );
            cb_utilities.cb_link( (SubLObject) $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, (SubLObject) $kw49$MINIMAL, (SubLObject) NIL, (SubLObject) $kw82$SELF, (SubLObject) UNPROVIDED );
            html_utilities.html_princ( (SubLObject) $str103$_for_answer_ );
            cb_utilities.cb_link( (SubLObject) $kw56$INFERENCE_ANSWER, v_answer, (SubLObject) $kw49$MINIMAL, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            html_utilities.html_hr( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            cb_show_inference_el_query( inference, (SubLObject) UNPROVIDED );
            html_utilities.html_newline( (SubLObject) TWO_INTEGER );
            final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( v_answer );
            final SubLObject free_el_vars = inference_datastructures_inference.inference_answer_free_el_vars( v_answer );
            html_utilities.html_princ_strong( (SubLObject) $str71$Answer_Bindings__ );
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            cb_show_inference_answer_bindings( v_bindings, free_el_vars );
            final SubLObject supports = inference_datastructures_inference.inference_answer_justification_supports( justification );
            final SubLObject full_justification = hl_supports.hl_justification_expand( supports );
            final SubLObject validation_level = inference_datastructures_problem_store.problem_store_intermediate_step_validation_level( store );
            final SubLObject mts = genl_mts.max_floor_mts( list_utilities.fast_delete_duplicates( Mapping.mapcar( (SubLObject) $sym104$SUPPORT_MT, full_justification ), Symbols.symbol_function( (SubLObject) EQUAL ),
                (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            html_utilities.html_princ_strong( PrintLow.format( (SubLObject) NIL, (SubLObject) $str105$Answer_Justification_Mt_p___, Sequences.length( mts ) ) );
            if( NIL != mts )
            {
              SubLObject cdolist_list_var = mts;
              SubLObject mt = (SubLObject) NIL;
              mt = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                cb_utilities.cb_form( mt, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
                html_utilities.html_newline( (SubLObject) UNPROVIDED );
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
              }
            }
            else
            {
              html_utilities.html_princ( (SubLObject) $str73$None_found );
              html_utilities.html_newline( (SubLObject) UNPROVIDED );
            }
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            html_utilities.html_princ_strong( (SubLObject) $str106$Full_Justification__ );
            cb_assertion_browser.cb_show_justification_readably( full_justification, validation_level );
            html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
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
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 16056L)
  public static SubLObject cb_show_inference_answer_justification(final SubLObject justification)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
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
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
          html_utilities.html_indent( (SubLObject) FOUR_INTEGER );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
        html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
          cb_utilities.cb_link( (SubLObject) $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, justification, (SubLObject) $kw48$TERSE, (SubLObject) $str109$_Full_Justification_, (SubLObject) UNPROVIDED,
              (SubLObject) UNPROVIDED );
          html_utilities.html_newline( (SubLObject) UNPROVIDED );
          cb_query.cb_princ_with_inference_doc_more_link( (SubLObject) $str110$Proofs__, (SubLObject) $str111$proofs, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          final SubLObject v_answer = inference_datastructures_inference.inference_answer_justification_answer( justification );
          SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_proofs( justification );
          SubLObject proof = (SubLObject) NIL;
          proof = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            cb_utilities.cb_link( (SubLObject) $kw112$PROOF, proof, (SubLObject) $kw48$TERSE, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
            html_utilities.html_newline( (SubLObject) UNPROVIDED );
            cb_utilities.cb_link( (SubLObject) $kw113$SIMPLE_PROOF_VIEW, proof, v_answer, (SubLObject) $str114$_Show_Proof_View_, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
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
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return justification;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 17450L)
  public static SubLObject cb_inference_fancy_table_js(final SubLObject var_count, final SubLObject nanswers)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.web_bundle( (SubLObject) $kw115$DATA_TABLES );
    SubLObject column_type_spec_json = (SubLObject) $str116$_;
    final SubLObject pixel_height = (SubLObject) ( nanswers.numG( (SubLObject) TWENTY_INTEGER ) ? $int117$600
        : ( nanswers.numL( (SubLObject) SEVEN_INTEGER ) ? $int118$200 : Numbers.multiply( nanswers, (SubLObject) $int119$30 ) ) );
    SubLObject n;
    for( n = (SubLObject) NIL, n = (SubLObject) ZERO_INTEGER; n.numL( var_count ); n = Numbers.add( n, (SubLObject) ONE_INTEGER ) )
    {
      column_type_spec_json = Sequences.cconcatenate( column_type_spec_json, (SubLObject) $str120$__null );
    }
    column_type_spec_json = Sequences.copy_seq( (SubLObject) $str121$_columnDefs_____type____num_html_ );
    html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str122$__document__ready_function_______, pixel_height, column_type_spec_json );
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 18571L)
  public static SubLObject cb_inference_fancy_table_all_answers_js(final SubLObject var_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cyc_file_dependencies.web_bundle( (SubLObject) $kw115$DATA_TABLES );
    SubLObject column_type_spec_json = (SubLObject) $str116$_;
    SubLObject n;
    for( n = (SubLObject) NIL, n = (SubLObject) ZERO_INTEGER; n.numL( var_count ); n = Numbers.add( n, (SubLObject) ONE_INTEGER ) )
    {
      column_type_spec_json = Sequences.cconcatenate( column_type_spec_json, (SubLObject) $str120$__null );
    }
    column_type_spec_json = Sequences.copy_seq( (SubLObject) $str123$_columnDefs_____type____num_html_ );
    html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str124$__document__ready_function_______, column_type_spec_json );
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 19469L)
  public static SubLObject cb_show_fully_bound_answer(final SubLObject inference, final SubLObject answer_count, final SubLObject current_answers, final SubLObject inference_new_justification_set)
  {
    if( answer_count.isZero() )
    {
      if( NIL != inference_datastructures_inference.running_inference_p( inference ) )
      {
        html_utilities.html_princ_strong( (SubLObject) $str125$Query_was_not_yet_proven );
      }
      else
      {
        html_utilities.html_princ_strong( (SubLObject) $str126$Query_was_not_proven );
      }
    }
    else
    {
      final SubLObject v_answer = current_answers.first();
      html_utilities.html_princ_strong( (SubLObject) $str127$Query_was_proven );
      html_utilities.html_indent( (SubLObject) UNPROVIDED );
      cb_utilities.cb_show_term( $const128$True, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      html_utilities.html_indent( (SubLObject) UNPROVIDED );
      cb_show_inference_answer_section_answer_number( v_answer, inference_new_justification_set, answer_count );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 20031L)
  public static SubLObject cb_show_streamed_inference_answer_section(final SubLObject inference, final SubLObject answer_limit)
  {
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 20374L)
  public static SubLObject cb_show_inference_answer_section(final SubLObject inference, final SubLObject answer_limit)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject current_answers = cb_inference_current_answers( inference );
    final SubLObject free_el_variables = thread.secondMultipleValue();
    final SubLObject inference_new_justification_set = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject answer_count = Sequences.length( current_answers );
    final SubLObject is_running = Equality.eq( inference_datastructures_inference.inference_status( inference ), (SubLObject) $kw12$RUNNING );
    final SubLObject my_answer_limit = (SubLObject) ( ( NIL == is_running && NIL != cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) ) ? $int129$2100 : answer_limit );
    if( NIL == free_el_variables )
    {
      cb_show_fully_bound_answer( inference, answer_count, current_answers, inference_new_justification_set );
    }
    else if( answer_count.isZero() )
    {
      html_utilities.html_princ_strong( (SubLObject) $str130$No_answers );
      if( NIL != is_running )
      {
        html_utilities.html_princ_strong( (SubLObject) $str131$_yet_ );
      }
    }
    else
    {
      SubLObject index = (SubLObject) ZERO_INTEGER;
      SubLObject answer_limit_exceededP = (SubLObject) NIL;
      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) $str132$display );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) $str133$inferenceresults );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        html_utilities.html_markup( html_macros.$html_table_thead_head$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
            html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
              html_utilities.html_princ_strong( (SubLObject) $str134$Answer );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
            cb_show_bindings_horizontal_variable_row( free_el_variables, (SubLObject) NIL, (SubLObject) T );
            if( NIL != $cb_inference_browser_show_answer_max_floor_mtsP$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
              html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
              html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
              final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
                html_utilities.html_princ_strong( (SubLObject) $str135$Answer_Mt );
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
          html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_thead_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_tbody_head$.getGlobalValue() );
        html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
          if( NIL == answer_limit_exceededP )
          {
            SubLObject csome_list_var = current_answers;
            SubLObject v_answer = (SubLObject) NIL;
            v_answer = csome_list_var.first();
            while ( NIL == answer_limit_exceededP && NIL != csome_list_var)
            {
              if( NIL != my_answer_limit && index.numGE( my_answer_limit ) )
              {
                answer_limit_exceededP = (SubLObject) T;
              }
              else
              {
                index = Numbers.add( index, (SubLObject) ONE_INTEGER );
                html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
                  html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                  html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                  html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw136$RIGHT ) );
                  html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                  html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                  html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                  html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
                  html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                  html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
                  final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
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
                    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
                    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
                    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
                    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
                      final SubLObject mts = inference_analysis.max_floor_mts_of_inference_answer( v_answer, (SubLObject) T );
                      if( NIL != mts )
                      {
                        SubLObject cdolist_list_var = mts;
                        SubLObject mt = (SubLObject) NIL;
                        mt = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          cb_utilities.cb_form( mt, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
                          html_utilities.html_newline( (SubLObject) UNPROVIDED );
                          cdolist_list_var = cdolist_list_var.rest();
                          mt = cdolist_list_var.first();
                        }
                      }
                      else
                      {
                        html_utilities.html_princ( (SubLObject) $str73$None_found );
                        html_utilities.html_newline( (SubLObject) UNPROVIDED );
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
                html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
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
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 23060L)
  public static SubLObject cb_show_inference_answer_section_answer_number(final SubLObject v_answer, final SubLObject inference_new_justification_set, final SubLObject answer_count)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject linktext = (SubLObject) ( ONE_INTEGER.numE( answer_count ) ? $str137$Explain
        : PrintLow.format( (SubLObject) NIL, (SubLObject) $str138$Explain___A, inference_datastructures_inference.inference_answer_suid( v_answer ) ) );
    final SubLObject newness = cb_determine_inference_answer_newness( v_answer, inference_new_justification_set );
    if( NIL == cb_parameters.$cb_use_dynamic_table_for_inference_results$.getDynamicValue( thread ) )
    {
      linktext = Sequences.cconcatenate( (SubLObject) $str139$_, new SubLObject[] { linktext, $str140$_
      } );
    }
    cb_show_normal_inference_answer_justification_button( newness, v_answer, linktext );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 24114L)
  public static SubLObject cb_show_normal_inference_answer_justification_button(final SubLObject newness, final SubLObject v_answer, final SubLObject hover)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) $str141$display_none );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), (SubLObject) $str142$_A, inference_datastructures_inference.inference_answer_suid( v_answer ) );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
    cb_show_inference_answer_newness_token( newness );
    cb_utilities.cb_link( (SubLObject) $kw56$INFERENCE_ANSWER, v_answer, (SubLObject) $kw49$MINIMAL, hover, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 24613L)
  public static SubLObject cb_determine_inference_answer_newness(final SubLObject v_answer, final SubLObject inference_new_justification_set)
  {
    if( NIL != inference_datastructures_inference.inference_answer_newP( v_answer ) )
    {
      return (SubLObject) $kw143$NEW_ANSWER;
    }
    if( NIL != cb_inference_answer_has_new_justificationP( v_answer, inference_new_justification_set ) )
    {
      return (SubLObject) $kw144$NEW_JUSTIFICATION;
    }
    return (SubLObject) $kw145$OLD;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 24923L)
  public static SubLObject cb_show_inference_answer_newness_token(final SubLObject newness)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject color = cb_determine_inference_answer_bgcolor( newness );
    SubLObject explanation = (SubLObject) NIL;
    if( newness.eql( (SubLObject) $kw145$OLD ) )
    {
      explanation = (SubLObject) $str146$Old_answer;
    }
    else if( newness.eql( (SubLObject) $kw143$NEW_ANSWER ) )
    {
      explanation = (SubLObject) $str147$New_answer;
    }
    else if( newness.eql( (SubLObject) $kw144$NEW_JUSTIFICATION ) )
    {
      explanation = (SubLObject) $str148$Old_answer_with_a_new_justificati;
    }
    if( $kw145$OLD != newness )
    {
      html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_span_style$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_style_background_color( color );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        cb_query.cb_princ_with_explanation( (SubLObject) $str149$_, explanation, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 25507L)
  public static SubLObject cb_inference_answer_has_new_justificationP(final SubLObject v_answer, final SubLObject new_justification_set)
  {
    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications( v_answer );
    SubLObject justification = (SubLObject) NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != set.set_memberP( justification, new_justification_set ) )
      {
        return (SubLObject) T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 25749L)
  public static SubLObject cb_determine_inference_answer_bgcolor(final SubLObject newness)
  {
    if( newness.eql( (SubLObject) $kw145$OLD ) )
    {
      return (SubLObject) NIL;
    }
    if( newness.eql( (SubLObject) $kw143$NEW_ANSWER ) )
    {
      return (SubLObject) $kw150$YELLOW;
    }
    if( newness.eql( (SubLObject) $kw144$NEW_JUSTIFICATION ) )
    {
      return (SubLObject) $kw151$GREEN;
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 25982L)
  public static SubLObject cb_inference_current_answers(final SubLObject inference)
  {
    final SubLObject free_el_variables = inference_datastructures_inference.inference_free_el_vars( inference );
    final SubLObject inference_new_justification_set = set.new_set( Symbols.symbol_function( (SubLObject) EQ ), inference_datastructures_inference.inference_new_justification_count( inference ) );
    SubLObject cdolist_list_var = queues.do_queue_elements_queue_elements( inference_datastructures_inference.inference_new_answer_justifications( inference ) );
    SubLObject justification = (SubLObject) NIL;
    justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      set.set_add( justification, inference_new_justification_set );
      cdolist_list_var = cdolist_list_var.rest();
      justification = cdolist_list_var.first();
    }
    SubLObject current_answers = (SubLObject) NIL;
    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
    if( NIL == id_index.id_index_objects_empty_p( idx, (SubLObject) $kw152$SKIP ) )
    {
      final SubLObject idx_$19 = idx;
      if( NIL == id_index.id_index_dense_objects_empty_p( idx_$19, (SubLObject) $kw152$SKIP ) )
      {
        final SubLObject vector_var = id_index.id_index_dense_objects( idx_$19 );
        final SubLObject backwardP_var = (SubLObject) NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject id;
        SubLObject v_answer;
        for( length = Sequences.length( vector_var ), v_iteration = (SubLObject) NIL, v_iteration = (SubLObject) ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration,
            (SubLObject) ONE_INTEGER ) )
        {
          id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, (SubLObject) ONE_INTEGER ) : v_iteration );
          v_answer = Vectors.aref( vector_var, id );
          if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( (SubLObject) $kw152$SKIP ) )
          {
            if( NIL != id_index.id_index_tombstone_p( v_answer ) )
            {
              v_answer = (SubLObject) $kw152$SKIP;
            }
            current_answers = (SubLObject) ConsesLow.cons( v_answer, current_answers );
          }
        }
      }
      final SubLObject idx_$20 = idx;
      if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$20 ) )
      {
        final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$20 );
        SubLObject id2 = (SubLObject) NIL;
        SubLObject v_answer2 = (SubLObject) NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            id2 = Hashtables.getEntryKey( cdohash_entry );
            v_answer2 = Hashtables.getEntryValue( cdohash_entry );
            current_answers = (SubLObject) ConsesLow.cons( v_answer2, current_answers );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
    }
    current_answers = Sort.sort( current_answers, Symbols.symbol_function( (SubLObject) $sym153$_ ), Symbols.symbol_function( (SubLObject) $sym154$INFERENCE_ANSWER_SUID ) );
    return Values.values( current_answers, free_el_variables, inference_new_justification_set );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 26831L)
  public static SubLObject cb_show_inference_answer_section_bindings(final SubLObject inference_answer, final SubLObject free_el_variables)
  {
    final SubLObject v_bindings = inference_datastructures_inference.inference_answer_bindings( inference_answer );
    cb_show_bindings_horizontal_value_row( v_bindings, free_el_variables );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 27080L)
  public static SubLObject cb_show_argumentation_result(final SubLObject inference)
  {
    final SubLObject tv = inference_utilities.inference_argumentation_result( inference );
    html_utilities.html_princ( (SubLObject) $str155$Weighing_these_arguments_yields_a );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    cb_show_tv( tv );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 27558L)
  public static SubLObject cb_show_tv(final SubLObject tv)
  {
    if( tv.eql( (SubLObject) $kw156$TRUE_DEF ) )
    {
      html_utilities.html_princ( (SubLObject) $str157$True__default_ );
    }
    else if( tv.eql( (SubLObject) $kw158$TRUE_MON ) )
    {
      html_utilities.html_princ( (SubLObject) $str159$True__monotonic_ );
    }
    else if( tv.eql( (SubLObject) $kw160$FALSE_DEF ) )
    {
      html_utilities.html_princ( (SubLObject) $str161$False__default_ );
    }
    else if( tv.eql( (SubLObject) $kw162$FALSE_MON ) )
    {
      html_utilities.html_princ( (SubLObject) $str163$False__monotonic_ );
    }
    else if( tv.eql( (SubLObject) $kw164$UNKNOWN ) )
    {
      html_utilities.html_princ( (SubLObject) $str165$Unknown );
    }
    else
    {
      html_utilities.html_princ( (SubLObject) $str166$___ );
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 27887L)
  public static SubLObject cb_show_bindings(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = (SubLObject) $kw167$ALL;
    }
    html_utilities.html_princ( (SubLObject) $str168$_ );
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = (SubLObject) NIL;
      binding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !binding.eql( v_bindings.first() ) )
        {
          html_utilities.html_indent( (SubLObject) UNPROVIDED );
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
      SubLObject some_binding_shownP = (SubLObject) NIL;
      SubLObject cdolist_list_var2 = selected_variables;
      SubLObject selected_variable = (SubLObject) NIL;
      selected_variable = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject binding2 = bindings.get_variable_binding( selected_variable, v_bindings );
        if( NIL != binding2 )
        {
          if( NIL != some_binding_shownP )
          {
            html_utilities.html_indent( (SubLObject) UNPROVIDED );
          }
          else
          {
            some_binding_shownP = (SubLObject) T;
          }
          html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
          cb_show_binding( binding2 );
          html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        selected_variable = cdolist_list_var2.first();
      }
    }
    html_utilities.html_princ( (SubLObject) $str77$_ );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 28868L)
  public static SubLObject cb_show_binding(final SubLObject binding)
  {
    SubLObject variable = (SubLObject) NIL;
    SubLObject value = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, (SubLObject) $list169 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    html_utilities.html_princ( (SubLObject) $str168$_ );
    cb_utilities.cb_show_term( variable, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    html_utilities.html_princ( (SubLObject) $str170$___ );
    cb_utilities.cb_show_term( value, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    html_utilities.html_princ( (SubLObject) $str77$_ );
    return binding;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 29094L)
  public static SubLObject cb_show_bindings_vertical(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = (SubLObject) $kw167$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      if( $kw167$ALL == selected_variables )
      {
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject) NIL;
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
        SubLObject selected_variable = (SubLObject) NIL;
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
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 29841L)
  public static SubLObject cb_show_binding_vertical(final SubLObject binding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject variable = (SubLObject) NIL;
    SubLObject value = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, (SubLObject) $list169 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw136$RIGHT ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        cb_utilities.cb_show_term( variable, (SubLObject) ZERO_INTEGER, (SubLObject) UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        html_utilities.html_glyph( (SubLObject) $kw172$NBSP, (SubLObject) UNPROVIDED );
        html_utilities.html_glyph( (SubLObject) $kw173$RIGHTWARDS_ARROW, (SubLObject) UNPROVIDED );
        html_utilities.html_glyph( (SubLObject) $kw172$NBSP, (SubLObject) UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
      html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
      html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        cb_utilities.cb_show_term( value, (SubLObject) ZERO_INTEGER, (SubLObject) T );
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
    html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    return binding;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 30301L)
  public static SubLObject cb_show_bindings_horizontal(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = (SubLObject) $kw167$ALL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) TWO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) FOUR_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        cb_show_bindings_horizontal_variable_row( selected_variables, v_bindings, (SubLObject) UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        cb_show_bindings_horizontal_value_row( v_bindings, selected_variables );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 30949L)
  public static SubLObject cb_show_bindings_horizontal_variable_row(final SubLObject selected_variables, SubLObject v_bindings, SubLObject strongP)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = (SubLObject) NIL;
    }
    if( strongP == UNPROVIDED )
    {
      strongP = (SubLObject) NIL;
    }
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = (SubLObject) NIL;
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
      SubLObject selected_variable = (SubLObject) NIL;
      selected_variable = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        cb_show_binding_variable_horizontal( selected_variable, strongP );
        cdolist_list_var = cdolist_list_var.rest();
        selected_variable = cdolist_list_var.first();
      }
    }
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 31655L)
  public static SubLObject cb_show_bindings_horizontal_value_row(final SubLObject v_bindings, SubLObject selected_variables)
  {
    if( selected_variables == UNPROVIDED )
    {
      selected_variables = (SubLObject) $kw167$ALL;
    }
    if( $kw167$ALL == selected_variables )
    {
      SubLObject cdolist_list_var = v_bindings;
      SubLObject binding = (SubLObject) NIL;
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
      SubLObject selected_variable = (SubLObject) NIL;
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
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 32489L)
  public static SubLObject cb_show_binding_variable_horizontal(final SubLObject variable, SubLObject strongP)
  {
    if( strongP == UNPROVIDED )
    {
      strongP = (SubLObject) NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
    html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      if( NIL != strongP )
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        cb_utilities.cb_show_term( variable, (SubLObject) ZERO_INTEGER, (SubLObject) NIL );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
      }
      else
      {
        cb_utilities.cb_show_term( variable, (SubLObject) ZERO_INTEGER, (SubLObject) NIL );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
    return variable;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 32863L)
  public static SubLObject cb_show_binding_value_horizontal(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      if( NIL != $cb_show_inference_results_in_nlP$.getDynamicValue( thread ) )
      {
        cb_utilities.cb_show_term_in_nl( value, (SubLObject) UNPROVIDED );
      }
      else
      {
        cb_utilities.cb_show_term( value, (SubLObject) ZERO_INTEGER, (SubLObject) T );
      }
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return value;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 33090L)
  public static SubLObject cb_show_missing_binding_value_horizontal()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw107$LEFT ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_indent( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/inference/browser/cb-query-browser.lisp",
    position = 33235L)
  public static SubLObject cb_variable_map_horizontal(final SubLObject variable_map)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_markup( (SubLObject) ZERO_INTEGER );
    html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
    html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        SubLObject list_var = (SubLObject) NIL;
        SubLObject variable_map_binding = (SubLObject) NIL;
        SubLObject index = (SubLObject) NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = (SubLObject) ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( (SubLObject) ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
              html_utilities.html_indent( (SubLObject) TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          SubLObject current;
          final SubLObject datum = current = variable_map_binding;
          SubLObject from_variable = (SubLObject) NIL;
          SubLObject to_variable = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, (SubLObject) $list175 );
          from_variable = current.first();
          current = ( to_variable = current.rest() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
          final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
            cb_utilities.cb_form( to_variable, (SubLObject) ZERO_INTEGER, (SubLObject) NIL );
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
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        SubLObject list_var = (SubLObject) NIL;
        SubLObject variable_map_binding = (SubLObject) NIL;
        SubLObject index = (SubLObject) NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = (SubLObject) ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( (SubLObject) ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
              html_utilities.html_indent( (SubLObject) TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
          final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
            html_utilities.html_glyph( (SubLObject) $kw176$UPWARDS_ARROW, (SubLObject) UNPROVIDED );
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
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
      final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
        SubLObject list_var = (SubLObject) NIL;
        SubLObject variable_map_binding = (SubLObject) NIL;
        SubLObject index = (SubLObject) NIL;
        list_var = variable_map;
        variable_map_binding = list_var.first();
        for( index = (SubLObject) ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), variable_map_binding = list_var.first(), index = Numbers.add( (SubLObject) ONE_INTEGER, index ) )
        {
          if( !index.isZero() )
          {
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
            html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
            html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
            final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
              html_utilities.html_indent( (SubLObject) TWO_INTEGER );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          SubLObject current;
          final SubLObject datum = current = variable_map_binding;
          SubLObject from_variable = (SubLObject) NIL;
          SubLObject to_variable = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, (SubLObject) $list175 );
          from_variable = current.first();
          current = ( to_variable = current.rest() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw171$CENTER ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_align( (SubLObject) $kw108$TOP ) );
          html_utilities.html_char( (SubLObject) Characters.CHAR_quotation, (SubLObject) UNPROVIDED );
          html_utilities.html_char( (SubLObject) Characters.CHAR_greater, (SubLObject) UNPROVIDED );
          final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( (SubLObject) T, thread );
            cb_utilities.cb_form( from_variable, (SubLObject) ZERO_INTEGER, (SubLObject) NIL );
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
      html_utilities.html_source_readability_terpri( (SubLObject) UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return (SubLObject) NIL;
  }

  public static SubLObject declare_cb_query_browser_file()
  {
    SubLFiles.declareFunction( myName, "cb_show_inference_el_query", "CB-SHOW-INFERENCE-EL-QUERY", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_status", "CB-SHOW-INFERENCE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_suspend_status", "CB-SHOW-INFERENCE-SUSPEND-STATUS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_answer", "CB-INFERENCE-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_link_inference_answer", "CB-LINK-INFERENCE-ANSWER", 1, 3, false );
    SubLFiles.declareFunction( myName, "cb_form_inference_answer_method", "CB-FORM-INFERENCE-ANSWER-METHOD", 1, 2, false );
    SubLFiles.declareFunction( myName, "cb_guess_inference_answer", "CB-GUESS-INFERENCE-ANSWER", 3, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_bindings", "CB-SHOW-INFERENCE-ANSWER-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_summary", "CB-SHOW-INFERENCE-ANSWER-SUMMARY", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_answer_guts", "CB-INFERENCE-ANSWER-GUTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_creation_time", "CB-SHOW-INFERENCE-ANSWER-CREATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_universal_time", "CB-SHOW-UNIVERSAL-TIME", 0, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_step_count", "CB-SHOW-INFERENCE-ANSWER-STEP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_socratic_query_from_answer", "CB-SOCRATIC-QUERY-FROM-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_link_socratic_query_from_answer", "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_inference_answer_full_justification", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_link_inference_answer_full_justification", "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION", 1, 3, false );
    SubLFiles.declareFunction( myName, "inference_answer_justification_suid", "INFERENCE-ANSWER-JUSTIFICATION-SUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_guess_inference_answer_justification", "CB-GUESS-INFERENCE-ANSWER-JUSTIFICATION", 4, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_answer_full_justification_guts", "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION-GUTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_justification", "CB-SHOW-INFERENCE-ANSWER-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_fancy_table_js", "CB-INFERENCE-FANCY-TABLE-JS", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_fancy_table_all_answers_js", "CB-INFERENCE-FANCY-TABLE-ALL-ANSWERS-JS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_fully_bound_answer", "CB-SHOW-FULLY-BOUND-ANSWER", 4, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_streamed_inference_answer_section", "CB-SHOW-STREAMED-INFERENCE-ANSWER-SECTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_section", "CB-SHOW-INFERENCE-ANSWER-SECTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_section_answer_number", "CB-SHOW-INFERENCE-ANSWER-SECTION-ANSWER-NUMBER", 3, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_normal_inference_answer_justification_button", "CB-SHOW-NORMAL-INFERENCE-ANSWER-JUSTIFICATION-BUTTON", 3, 0, false );
    SubLFiles.declareFunction( myName, "cb_determine_inference_answer_newness", "CB-DETERMINE-INFERENCE-ANSWER-NEWNESS", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_newness_token", "CB-SHOW-INFERENCE-ANSWER-NEWNESS-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_answer_has_new_justificationP", "CB-INFERENCE-ANSWER-HAS-NEW-JUSTIFICATION?", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_determine_inference_answer_bgcolor", "CB-DETERMINE-INFERENCE-ANSWER-BGCOLOR", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_inference_current_answers", "CB-INFERENCE-CURRENT-ANSWERS", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_inference_answer_section_bindings", "CB-SHOW-INFERENCE-ANSWER-SECTION-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_argumentation_result", "CB-SHOW-ARGUMENTATION-RESULT", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_tv", "CB-SHOW-TV", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_bindings", "CB-SHOW-BINDINGS", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_binding", "CB-SHOW-BINDING", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_bindings_vertical", "CB-SHOW-BINDINGS-VERTICAL", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_binding_vertical", "CB-SHOW-BINDING-VERTICAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_bindings_horizontal", "CB-SHOW-BINDINGS-HORIZONTAL", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_bindings_horizontal_variable_row", "CB-SHOW-BINDINGS-HORIZONTAL-VARIABLE-ROW", 1, 2, false );
    SubLFiles.declareFunction( myName, "cb_show_bindings_horizontal_value_row", "CB-SHOW-BINDINGS-HORIZONTAL-VALUE-ROW", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_binding_variable_horizontal", "CB-SHOW-BINDING-VARIABLE-HORIZONTAL", 1, 1, false );
    SubLFiles.declareFunction( myName, "cb_show_binding_value_horizontal", "CB-SHOW-BINDING-VALUE-HORIZONTAL", 1, 0, false );
    SubLFiles.declareFunction( myName, "cb_show_missing_binding_value_horizontal", "CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL", 0, 0, false );
    SubLFiles.declareFunction( myName, "cb_variable_map_horizontal", "CB-VARIABLE-MAP-HORIZONTAL", 1, 0, false );
    return (SubLObject) NIL;
  }

  public static SubLObject init_cb_query_browser_file()
  {
    $cb_inference_browser_show_answer_max_floor_mtsP$ = SubLFiles.defparameter( "*CB-INFERENCE-BROWSER-SHOW-ANSWER-MAX-FLOOR-MTS?*", (SubLObject) NIL );
    $cb_show_inference_results_in_nlP$ = SubLFiles.defparameter( "*CB-SHOW-INFERENCE-RESULTS-IN-NL?*", (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject setup_cb_query_browser_file()
  {
    html_macros.note_cgi_handler_function( (SubLObject) $sym45$CB_INFERENCE_ANSWER, (SubLObject) $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( (SubLObject) $kw56$INFERENCE_ANSWER, (SubLObject) $sym57$CB_LINK_INFERENCE_ANSWER, (SubLObject) FOUR_INTEGER );
    Structures.register_method( cb_utilities.$cb_form_method_table$.getGlobalValue(), inference_datastructures_inference.$dtp_inference_answer$.getGlobalValue(), Symbols.symbol_function(
        (SubLObject) $sym58$CB_FORM_INFERENCE_ANSWER_METHOD ) );
    html_macros.note_cgi_handler_function( (SubLObject) $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER, (SubLObject) $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( (SubLObject) $kw67$SOCRATIC_QUERY_FROM_ANSWER, (SubLObject) $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER, (SubLObject) TWO_INTEGER );
    html_macros.note_cgi_handler_function( (SubLObject) $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION, (SubLObject) $kw46$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( (SubLObject) $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION, (SubLObject) $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION, (SubLObject) FOUR_INTEGER );
    utilities_macros.register_html_state_variable( (SubLObject) $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
    utilities_macros.register_html_interface_variable( (SubLObject) $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ );
    return (SubLObject) NIL;
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
    me = (SubLFile) new cb_query_browser();
    $cb_inference_browser_show_answer_max_floor_mtsP$ = null;
    $cb_show_inference_results_in_nlP$ = null;
    $kw0$SILK = SubLObjectFactory.makeKeyword( "SILK" );
    $str1$SILK_Query__ = SubLObjectFactory.makeString( "SILK Query :" );
    $str2$Mt__ = SubLObjectFactory.makeString( "Mt :" );
    $str3$EL_Query__ = SubLObjectFactory.makeString( "EL Query :" );
    $str4$Pragmatics__ = SubLObjectFactory.makeString( "Pragmatics :" );
    $sym5$INFERENCE_STATUS_P = SubLObjectFactory.makeSymbol( "INFERENCE-STATUS-P" );
    $kw6$NEW = SubLObjectFactory.makeKeyword( "NEW" );
    $str7$New = SubLObjectFactory.makeString( "New" );
    $kw8$PREPARED = SubLObjectFactory.makeKeyword( "PREPARED" );
    $str9$Prepared = SubLObjectFactory.makeString( "Prepared" );
    $kw10$READY = SubLObjectFactory.makeKeyword( "READY" );
    $str11$Ready = SubLObjectFactory.makeString( "Ready" );
    $kw12$RUNNING = SubLObjectFactory.makeKeyword( "RUNNING" );
    $str13$Running = SubLObjectFactory.makeString( "Running" );
    $kw14$SUSPENDED = SubLObjectFactory.makeKeyword( "SUSPENDED" );
    $str15$Suspended = SubLObjectFactory.makeString( "Suspended" );
    $kw16$DEAD = SubLObjectFactory.makeKeyword( "DEAD" );
    $str17$Dead = SubLObjectFactory.makeString( "Dead" );
    $kw18$TAUTOLOGY = SubLObjectFactory.makeKeyword( "TAUTOLOGY" );
    $str19$Tautology = SubLObjectFactory.makeString( "Tautology" );
    $kw20$CONTRADICTION = SubLObjectFactory.makeKeyword( "CONTRADICTION" );
    $str21$Contradiction = SubLObjectFactory.makeString( "Contradiction" );
    $kw22$ILL_FORMED = SubLObjectFactory.makeKeyword( "ILL-FORMED" );
    $str23$Ill_Formed = SubLObjectFactory.makeString( "Ill-Formed" );
    $sym24$INFERENCE_SUSPEND_STATUS_P = SubLObjectFactory.makeSymbol( "INFERENCE-SUSPEND-STATUS-P" );
    $kw25$ABORT = SubLObjectFactory.makeKeyword( "ABORT" );
    $str26$Abort = SubLObjectFactory.makeString( "Abort" );
    $kw27$INTERRUPT = SubLObjectFactory.makeKeyword( "INTERRUPT" );
    $str28$Interrupt = SubLObjectFactory.makeString( "Interrupt" );
    $kw29$MAX_NUMBER = SubLObjectFactory.makeKeyword( "MAX-NUMBER" );
    $str30$Max_Number = SubLObjectFactory.makeString( "Max Number" );
    $kw31$MAX_TIME = SubLObjectFactory.makeKeyword( "MAX-TIME" );
    $str32$Max_Time = SubLObjectFactory.makeString( "Max Time" );
    $kw33$MAX_STEP = SubLObjectFactory.makeKeyword( "MAX-STEP" );
    $str34$Max_Step = SubLObjectFactory.makeString( "Max Step" );
    $kw35$MAX_PROBLEM_COUNT = SubLObjectFactory.makeKeyword( "MAX-PROBLEM-COUNT" );
    $str36$Max_Problem_Count = SubLObjectFactory.makeString( "Max Problem Count" );
    $kw37$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $str38$Probably_Approximately_Done = SubLObjectFactory.makeString( "Probably Approximately Done" );
    $kw39$EXHAUST = SubLObjectFactory.makeKeyword( "EXHAUST" );
    $str40$Exhaust = SubLObjectFactory.makeString( "Exhaust" );
    $kw41$EXHAUST_TOTAL = SubLObjectFactory.makeKeyword( "EXHAUST-TOTAL" );
    $str42$Exhaust_Total = SubLObjectFactory.makeString( "Exhaust Total" );
    $list43 = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "STORE-ID-STRING" ), (SubLObject) SubLObjectFactory.makeSymbol( "INFERENCE-ID-STRING" ), (SubLObject) SubLObjectFactory.makeSymbol(
        "ANSWER-ID-STRING" ) );
    $str44$_A_did_not_specify_an_inference_a = SubLObjectFactory.makeString( "~A did not specify an inference answer" );
    $sym45$CB_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol( "CB-INFERENCE-ANSWER" );
    $kw46$HTML_HANDLER = SubLObjectFactory.makeKeyword( "HTML-HANDLER" );
    $kw47$MAIN = SubLObjectFactory.makeKeyword( "MAIN" );
    $kw48$TERSE = SubLObjectFactory.makeKeyword( "TERSE" );
    $kw49$MINIMAL = SubLObjectFactory.makeKeyword( "MINIMAL" );
    $str50$__A__A__A_ = SubLObjectFactory.makeString( "[~A.~A.~A]" );
    $str51$_Inference_Answer__A__A__A_ = SubLObjectFactory.makeString( "[Inference Answer ~A.~A.~A]" );
    $kw52$VERBOSE = SubLObjectFactory.makeKeyword( "VERBOSE" );
    $str53$_Inference_Answer__A__A__A__A_ = SubLObjectFactory.makeString( "[Inference Answer ~A.~A.~A ~A]" );
    $str54$cb_inference_answer__A__A__A = SubLObjectFactory.makeString( "cb-inference-answer&~A&~A&~A" );
    $str55$button = SubLObjectFactory.makeString( "button" );
    $kw56$INFERENCE_ANSWER = SubLObjectFactory.makeKeyword( "INFERENCE-ANSWER" );
    $sym57$CB_LINK_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol( "CB-LINK-INFERENCE-ANSWER" );
    $sym58$CB_FORM_INFERENCE_ANSWER_METHOD = SubLObjectFactory.makeSymbol( "CB-FORM-INFERENCE-ANSWER-METHOD" );
    $str59$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str60$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw61$UNINITIALIZED = SubLObjectFactory.makeKeyword( "UNINITIALIZED" );
    $str62$Inference_Answer = SubLObjectFactory.makeString( "Inference Answer" );
    $str63$_for_ = SubLObjectFactory.makeString( " for " );
    $kw64$INFERENCE = SubLObjectFactory.makeKeyword( "INFERENCE" );
    $str65$_in_ = SubLObjectFactory.makeString( " in " );
    $kw66$PROBLEM_STORE = SubLObjectFactory.makeKeyword( "PROBLEM-STORE" );
    $kw67$SOCRATIC_QUERY_FROM_ANSWER = SubLObjectFactory.makeKeyword( "SOCRATIC-QUERY-FROM-ANSWER" );
    $str68$_Socratic_Query_ = SubLObjectFactory.makeString( "[Socratic Query]" );
    $str69$Creation_Time____ = SubLObjectFactory.makeString( "Creation Time :  " );
    $str70$Steps_to_This_Answer____ = SubLObjectFactory.makeString( "Steps to This Answer :  " );
    $str71$Answer_Bindings__ = SubLObjectFactory.makeString( "Answer Bindings :" );
    $str72$Answer_Mt_p___ = SubLObjectFactory.makeString( "Answer Mt~p : " );
    $str73$None_found = SubLObjectFactory.makeString( "None found" );
    $str74$Justifications__ = SubLObjectFactory.makeString( "Justifications :" );
    $str75$after = SubLObjectFactory.makeString( "after" );
    $str76$__at_ = SubLObjectFactory.makeString( " (at " );
    $str77$_ = SubLObjectFactory.makeString( ")" );
    $sym78$UNIVERSAL_TIME_P = SubLObjectFactory.makeSymbol( "UNIVERSAL-TIME-P" );
    $str79$_today = SubLObjectFactory.makeString( " today" );
    $str80$_on__A = SubLObjectFactory.makeString( " on ~A" );
    $sym81$CB_SOCRATIC_QUERY_FROM_ANSWER = SubLObjectFactory.makeSymbol( "CB-SOCRATIC-QUERY-FROM-ANSWER" );
    $kw82$SELF = SubLObjectFactory.makeKeyword( "SELF" );
    $str83$cb_socratic_query_from_answer__A_ = SubLObjectFactory.makeString( "cb-socratic-query-from-answer&~A&~A&~A" );
    $sym84$CB_LINK_SOCRATIC_QUERY_FROM_ANSWER = SubLObjectFactory.makeSymbol( "CB-LINK-SOCRATIC-QUERY-FROM-ANSWER" );
    $list85 = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "STORE-ID-STRING" ), (SubLObject) SubLObjectFactory.makeSymbol( "INFERENCE-ID-STRING" ), (SubLObject) SubLObjectFactory.makeSymbol(
        "ANSWER-ID-STRING" ), (SubLObject) SubLObjectFactory.makeSymbol( "JUSTIFICATION-ID-STRING" ) );
    $str86$_A_did_not_specify_an_inference_a = SubLObjectFactory.makeString( "~A did not specify an inference answer justification" );
    $sym87$CB_INFERENCE_ANSWER_FULL_JUSTIFICATION = SubLObjectFactory.makeSymbol( "CB-INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $str88$__A__A__A__A_ = SubLObjectFactory.makeString( "[~A.~A.~A.~A]" );
    $str89$_Inference_Answer__A__A__A__A_ = SubLObjectFactory.makeString( "[Inference Answer ~A.~A.~A.~A]" );
    $str90$_Inference_Answer__A__A__A__A__A_ = SubLObjectFactory.makeString( "[Inference Answer ~A.~A.~A.~A ~A]" );
    $str91$cb_inference_answer_full_justific = SubLObjectFactory.makeString( "cb-inference-answer-full-justification&~A&~A&~A&~A" );
    $kw92$INFERENCE_ANSWER_FULL_JUSTIFICATION = SubLObjectFactory.makeKeyword( "INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $sym93$CB_LINK_INFERENCE_ANSWER_FULL_JUSTIFICATION = SubLObjectFactory.makeSymbol( "CB-LINK-INFERENCE-ANSWER-FULL-JUSTIFICATION" );
    $str94$ = SubLObjectFactory.makeString( "" );
    $kw95$CB_CYC = SubLObjectFactory.makeKeyword( "CB-CYC" );
    $kw96$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw97$SHA1 = SubLObjectFactory.makeKeyword( "SHA1" );
    $str98$yui_skin_sam = SubLObjectFactory.makeString( "yui-skin-sam" );
    $str99$reloadFrameButton = SubLObjectFactory.makeString( "reloadFrameButton" );
    $str100$reload = SubLObjectFactory.makeString( "reload" );
    $str101$Refresh_Frames = SubLObjectFactory.makeString( "Refresh Frames" );
    $str102$Inference_Answer_Full_Justificati = SubLObjectFactory.makeString( "Inference Answer Full Justification" );
    $str103$_for_answer_ = SubLObjectFactory.makeString( " for answer " );
    $sym104$SUPPORT_MT = SubLObjectFactory.makeSymbol( "SUPPORT-MT" );
    $str105$Answer_Justification_Mt_p___ = SubLObjectFactory.makeString( "Answer Justification Mt~p : " );
    $str106$Full_Justification__ = SubLObjectFactory.makeString( "Full Justification :" );
    $kw107$LEFT = SubLObjectFactory.makeKeyword( "LEFT" );
    $kw108$TOP = SubLObjectFactory.makeKeyword( "TOP" );
    $str109$_Full_Justification_ = SubLObjectFactory.makeString( "[Full Justification]" );
    $str110$Proofs__ = SubLObjectFactory.makeString( "Proofs :" );
    $str111$proofs = SubLObjectFactory.makeString( "proofs" );
    $kw112$PROOF = SubLObjectFactory.makeKeyword( "PROOF" );
    $kw113$SIMPLE_PROOF_VIEW = SubLObjectFactory.makeKeyword( "SIMPLE-PROOF-VIEW" );
    $str114$_Show_Proof_View_ = SubLObjectFactory.makeString( "[Show Proof View]" );
    $kw115$DATA_TABLES = SubLObjectFactory.makeKeyword( "DATA-TABLES" );
    $str116$_ = SubLObjectFactory.makeString( " " );
    $int117$600 = SubLObjectFactory.makeInteger( 600 );
    $int118$200 = SubLObjectFactory.makeInteger( 200 );
    $int119$30 = SubLObjectFactory.makeInteger( 30 );
    $str120$__null = SubLObjectFactory.makeString( ", null" );
    $str121$_columnDefs_____type____num_html_ = SubLObjectFactory.makeString( "'columnDefs':[{'type': 'num-html', targets: 0, width: '5px'}]" );
    $str122$__document__ready_function_______ = SubLObjectFactory.makeString(
        "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {   'autoWidth':      false,\n        'scrollY':        '~Apx',\n        'scrollX':        false,\n        'scrollCollapse': true,\n        'paging':         false,\n        'dom': 'Rtif',\n        'language': {\n\t       'search': 'Filter Answers:' \n\t },\n         ~A\n    } \n                   )  } );" );
    $str123$_columnDefs_____type____num_html_ = SubLObjectFactory.makeString( "'columnDefs':[{'type': 'num-html', targets: 0, width: 1}]" );
    $str124$__document__ready_function_______ = SubLObjectFactory.makeString(
        "$(document).ready(function() {\n                   var oTable=$('#inferenceresults').DataTable(\n    {\n        'autoWidth': false,\n        'paging'   : false,\n        'dom'      : 'Rfti',\n        'language' : {\n\t       'search': 'Filter Answers:'\n\t },\n         ~A\n    } \n                   )  } );" );
    $str125$Query_was_not_yet_proven = SubLObjectFactory.makeString( "Query was not yet proven" );
    $str126$Query_was_not_proven = SubLObjectFactory.makeString( "Query was not proven" );
    $str127$Query_was_proven = SubLObjectFactory.makeString( "Query was proven" );
    $const128$True = constant_handles.reader_make_constant_shell( (SubLObject) SubLObjectFactory.makeString( "True" ) );
    $int129$2100 = SubLObjectFactory.makeInteger( 2100 );
    $str130$No_answers = SubLObjectFactory.makeString( "No answers" );
    $str131$_yet_ = SubLObjectFactory.makeString( " yet." );
    $str132$display = SubLObjectFactory.makeString( "display" );
    $str133$inferenceresults = SubLObjectFactory.makeString( "inferenceresults" );
    $str134$Answer = SubLObjectFactory.makeString( "Answer" );
    $str135$Answer_Mt = SubLObjectFactory.makeString( "Answer Mt" );
    $kw136$RIGHT = SubLObjectFactory.makeKeyword( "RIGHT" );
    $str137$Explain = SubLObjectFactory.makeString( "Explain" );
    $str138$Explain___A = SubLObjectFactory.makeString( "Explain #~A" );
    $str139$_ = SubLObjectFactory.makeString( "[" );
    $str140$_ = SubLObjectFactory.makeString( "]" );
    $str141$display_none = SubLObjectFactory.makeString( "display:none" );
    $str142$_A = SubLObjectFactory.makeString( "~A" );
    $kw143$NEW_ANSWER = SubLObjectFactory.makeKeyword( "NEW-ANSWER" );
    $kw144$NEW_JUSTIFICATION = SubLObjectFactory.makeKeyword( "NEW-JUSTIFICATION" );
    $kw145$OLD = SubLObjectFactory.makeKeyword( "OLD" );
    $str146$Old_answer = SubLObjectFactory.makeString( "Old answer" );
    $str147$New_answer = SubLObjectFactory.makeString( "New answer" );
    $str148$Old_answer_with_a_new_justificati = SubLObjectFactory.makeString( "Old answer with a new justification" );
    $str149$_ = SubLObjectFactory.makeString( "*" );
    $kw150$YELLOW = SubLObjectFactory.makeKeyword( "YELLOW" );
    $kw151$GREEN = SubLObjectFactory.makeKeyword( "GREEN" );
    $kw152$SKIP = SubLObjectFactory.makeKeyword( "SKIP" );
    $sym153$_ = SubLObjectFactory.makeSymbol( ">" );
    $sym154$INFERENCE_ANSWER_SUID = SubLObjectFactory.makeSymbol( "INFERENCE-ANSWER-SUID" );
    $str155$Weighing_these_arguments_yields_a = SubLObjectFactory.makeString( "Weighing these arguments yields an overall result of: " );
    $kw156$TRUE_DEF = SubLObjectFactory.makeKeyword( "TRUE-DEF" );
    $str157$True__default_ = SubLObjectFactory.makeString( "True (default)" );
    $kw158$TRUE_MON = SubLObjectFactory.makeKeyword( "TRUE-MON" );
    $str159$True__monotonic_ = SubLObjectFactory.makeString( "True (monotonic)" );
    $kw160$FALSE_DEF = SubLObjectFactory.makeKeyword( "FALSE-DEF" );
    $str161$False__default_ = SubLObjectFactory.makeString( "False (default)" );
    $kw162$FALSE_MON = SubLObjectFactory.makeKeyword( "FALSE-MON" );
    $str163$False__monotonic_ = SubLObjectFactory.makeString( "False (monotonic)" );
    $kw164$UNKNOWN = SubLObjectFactory.makeKeyword( "UNKNOWN" );
    $str165$Unknown = SubLObjectFactory.makeString( "Unknown" );
    $str166$___ = SubLObjectFactory.makeString( "???" );
    $kw167$ALL = SubLObjectFactory.makeKeyword( "ALL" );
    $str168$_ = SubLObjectFactory.makeString( "(" );
    $list169 = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "VALUE" ) );
    $str170$___ = SubLObjectFactory.makeString( " . " );
    $kw171$CENTER = SubLObjectFactory.makeKeyword( "CENTER" );
    $kw172$NBSP = SubLObjectFactory.makeKeyword( "NBSP" );
    $kw173$RIGHTWARDS_ARROW = SubLObjectFactory.makeKeyword( "RIGHTWARDS-ARROW" );
    $sym174$_CB_SHOW_INFERENCE_RESULTS_IN_NL__ = SubLObjectFactory.makeSymbol( "*CB-SHOW-INFERENCE-RESULTS-IN-NL?*" );
    $list175 = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "FROM-VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "TO-VARIABLE" ) );
    $kw176$UPWARDS_ARROW = SubLObjectFactory.makeKeyword( "UPWARDS-ARROW" );
  }
}
/*
 *
 * Total time: 739 ms
 *
 */