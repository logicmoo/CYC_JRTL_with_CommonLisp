package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.forward;
import java.util.Map;
import java.util.Iterator;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cb_web_services;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cb_sentence_browser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_forward_inference_browser
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_forward_inference_browser";
  public static final String myFingerPrint = "8368e68f0fd4163486b424d23b32586af7078fc39f846b659c3620bcbdbd4dfd";
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1064L)
  private static SubLSymbol $cb_forward_inference_clump_id_index$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1340L)
  private static SubLSymbol $cb_forward_inference_browser_show_focus_sectionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1418L)
  private static SubLSymbol $cb_forward_inference_browser_show_el_queriesP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLSymbol $dtp_forward_inference_clump$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLSymbol $dtp_forward_inference_info$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8480L)
  public static SubLSymbol $cb_current_forward_inference_clump$;
  private static final SubLSymbol $sym0$FORWARD_INFERENCE_CLUMP;
  private static final SubLSymbol $sym1$FORWARD_INFERENCE_CLUMP_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FWD_INF_CLUMP_ID;
  private static final SubLSymbol $sym10$_CSETF_FWD_INF_CLUMP_ID;
  private static final SubLSymbol $sym11$FWD_INF_CLUMP_TIMESTAMP;
  private static final SubLSymbol $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP;
  private static final SubLSymbol $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION;
  private static final SubLSymbol $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION;
  private static final SubLSymbol $sym15$FWD_INF_CLUMP_INFERENCE_INFOS;
  private static final SubLSymbol $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS;
  private static final SubLSymbol $kw17$ID;
  private static final SubLSymbol $kw18$TIMESTAMP;
  private static final SubLSymbol $kw19$TRIGGERING_ASSERTION;
  private static final SubLSymbol $kw20$INFERENCE_INFOS;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_FORWARD_INFERENCE_CLUMP;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD;
  private static final SubLSymbol $kw27$FREE;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw31$DONE;
  private static final SubLSymbol $sym32$DO_LIST;
  private static final SubLSymbol $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
  private static final SubLSymbol $sym34$FORWARD_INFERENCE_INFO_P;
  private static final SubLSymbol $sym35$FORWARD_INFERENCE_INFO;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$FWD_INF_INFO_INFERENCE;
  private static final SubLSymbol $sym43$_CSETF_FWD_INF_INFO_INFERENCE;
  private static final SubLSymbol $sym44$FWD_INF_INFO_RULE;
  private static final SubLSymbol $sym45$_CSETF_FWD_INF_INFO_RULE;
  private static final SubLSymbol $sym46$FWD_INF_INFO_MORE_INFO;
  private static final SubLSymbol $sym47$_CSETF_FWD_INF_INFO_MORE_INFO;
  private static final SubLSymbol $kw48$INFERENCE;
  private static final SubLSymbol $kw49$RULE;
  private static final SubLSymbol $kw50$MORE_INFO;
  private static final SubLSymbol $sym51$MAKE_FORWARD_INFERENCE_INFO;
  private static final SubLSymbol $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD;
  private static final SubLSymbol $sym53$INFERENCE_P;
  private static final SubLSymbol $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS;
  private static final SubLSymbol $sym57$CB_FORWARD_INFERENCE_BROWSER;
  private static final SubLSymbol $kw58$HTML_HANDLER;
  private static final SubLString $str59$FwdInf;
  private static final SubLSymbol $kw60$MAIN;
  private static final SubLString $str61$cb_forward_inference_browser;
  private static final SubLSymbol $kw62$FORWARD_INFERENCE_BROWSER;
  private static final SubLSymbol $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER;
  private static final SubLString $str64$Forward_Inference_Browser;
  private static final SubLString $str65$Browse_the_most_recent_browsable_;
  private static final SubLString $str66$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str67$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw68$UNINITIALIZED;
  private static final SubLSymbol $kw69$CB_CYC;
  private static final SubLSymbol $kw70$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw71$SHA1;
  private static final SubLString $str72$yui_skin_sam;
  private static final SubLString $str73$reloadFrameButton;
  private static final SubLString $str74$button;
  private static final SubLString $str75$reload;
  private static final SubLString $str76$Refresh_Frames;
  private static final SubLString $str77$No_forward_inferences_to_browse_;
  private static final SubLSymbol $sym78$_EXIT;
  private static final SubLString $str79$Last_browsable_forward_inference_;
  private static final SubLSymbol $kw80$ANSWER_COUNT;
  private static final SubLString $str81$Successful_and_watched_results_;
  private static final SubLString $str82$_all;
  private static final SubLString $str83$_Jump_to_all_results_;
  private static final SubLSymbol $kw84$FOCUS;
  private static final SubLString $str85$all;
  private static final SubLString $str86$All_results;
  private static final SubLSymbol $kw87$ALL;
  private static final SubLString $str88$_;
  private static final SubLSymbol $kw89$TRIGGER_SUPPORT;
  private static final SubLSymbol $kw90$REASON;
  private static final SubLString $str91$Propagating_rule__;
  private static final SubLString $str92$Propagating__;
  private static final SubLString $str93$_;
  private static final SubLString $str94$_Next_;
  private static final SubLSymbol $kw95$NBSP;
  private static final SubLString $str96$_Jump_to_all_rules_;
  private static final SubLSymbol $kw97$RARR;
  private static final SubLSymbol $kw98$VERY_VERBOSE;
  private static final SubLSymbol $kw99$TYPE;
  private static final SubLSymbol $kw100$ASENT;
  private static final SubLSymbol $kw101$PLACEMENT_MT;
  private static final SubLString $str102$;
  private static final SubLString $str103$_into_mt_;
  private static final SubLSymbol $kw104$INVISIBLE;
  private static final SubLSymbol $kw105$PARAGRAPH;
  private static final SubLList $list106;
  private static final SubLSymbol $kw107$TOP;
  private static final SubLList $list108;
  private static final SubLSymbol $kw109$BULL;
  private static final SubLSymbol $sym110$SUPPORT_MT;
  private static final SubLString $str111$_d_answer__P;
  private static final SubLSymbol $kw112$SKIP;
  private static final SubLString $str113$___d_justification__P;
  private static final SubLString $str114$__No_inference_was_performed_sinc;
  private static final SubLSymbol $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE;
  private static final SubLSymbol $sym116$BROWSING_NEW_FORWARD_INFERENCE;
  private static final SubLSymbol $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE;

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1211L)
  public static SubLObject cb_forward_inference_clump_lookup_by_id(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return id_index.id_index_lookup( $cb_forward_inference_clump_id_index$.getDynamicValue( thread ), id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject forward_inference_clump_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject forward_inference_clump_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $forward_inference_clump_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject fwd_inf_clump_id(final SubLObject v_object)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject fwd_inf_clump_timestamp(final SubLObject v_object)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject fwd_inf_clump_triggering_assertion(final SubLObject v_object)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject fwd_inf_clump_inference_infos(final SubLObject v_object)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject _csetf_fwd_inf_clump_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject _csetf_fwd_inf_clump_timestamp(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject _csetf_fwd_inf_clump_triggering_assertion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject _csetf_fwd_inf_clump_inference_infos(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_clump_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject make_forward_inference_clump(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $forward_inference_clump_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$ID ) )
      {
        _csetf_fwd_inf_clump_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$TIMESTAMP ) )
      {
        _csetf_fwd_inf_clump_timestamp( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$TRIGGERING_ASSERTION ) )
      {
        _csetf_fwd_inf_clump_triggering_assertion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$INFERENCE_INFOS ) )
      {
        _csetf_fwd_inf_clump_inference_infos( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject visit_defstruct_forward_inference_clump(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$ID, fwd_inf_clump_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$TIMESTAMP, fwd_inf_clump_timestamp( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$TRIGGERING_ASSERTION, fwd_inf_clump_triggering_assertion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$INFERENCE_INFOS, fwd_inf_clump_inference_infos( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_FORWARD_INFERENCE_CLUMP, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1494L)
  public static SubLObject visit_defstruct_object_forward_inference_clump_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_forward_inference_clump( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1721L)
  public static SubLObject valid_forward_inference_clump_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forward_inference_clump_p( v_object ) && $kw27$FREE != fwd_inf_clump_timestamp( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 1887L)
  public static SubLObject new_forward_inference_clump(final SubLObject triggering_assertion_or_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject clump = make_forward_inference_clump( UNPROVIDED );
    final SubLObject id = id_index.id_index_reserve( $cb_forward_inference_clump_id_index$.getDynamicValue( thread ) );
    _csetf_fwd_inf_clump_id( clump, id );
    id_index.id_index_enter( $cb_forward_inference_clump_id_index$.getDynamicValue( thread ), id, clump );
    _csetf_fwd_inf_clump_timestamp( clump, Time.get_universal_time() );
    _csetf_fwd_inf_clump_triggering_assertion( clump, triggering_assertion_or_sentence );
    _csetf_fwd_inf_clump_inference_infos( clump, NIL );
    return clump;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2431L)
  public static SubLObject do_forward_inference_clump_inference_infos(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_info = NIL;
    SubLObject clump = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    inference_info = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    clump = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list28 );
      if( NIL == conses_high.member( current_$1, $list29, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw30$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw31$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym32$DO_LIST, ConsesLow.list( inference_info, ConsesLow.list( $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, clump ), $kw31$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 2662L)
  public static SubLObject destroy_forward_inference_clump(final SubLObject clump)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != valid_forward_inference_clump_p( clump ) )
    {
      SubLObject cdolist_list_var = forward_inference_clump_inference_infos( clump );
      SubLObject inference_info = NIL;
      inference_info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        destroy_inference_info( inference_info );
        cdolist_list_var = cdolist_list_var.rest();
        inference_info = cdolist_list_var.first();
      }
      id_index.id_index_remove( $cb_forward_inference_clump_id_index$.getDynamicValue( thread ), fwd_inf_clump_id( clump ) );
      _csetf_fwd_inf_clump_timestamp( clump, $kw27$FREE );
      _csetf_fwd_inf_clump_triggering_assertion( clump, $kw27$FREE );
      _csetf_fwd_inf_clump_inference_infos( clump, $kw27$FREE );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3287L)
  public static SubLObject forward_inference_clump_id(final SubLObject clump)
  {
    return fwd_inf_clump_id( clump );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3387L)
  public static SubLObject forward_inference_clump_timestamp(final SubLObject clump)
  {
    return fwd_inf_clump_timestamp( clump );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3489L)
  public static SubLObject forward_inference_clump_triggering_assertion(final SubLObject clump)
  {
    SubLObject assertion = fwd_inf_clump_triggering_assertion( clump );
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      final SubLObject found_assertion = czer_meta.find_assertion_cycl( assertion, UNPROVIDED );
      if( NIL != assertion_handles.assertion_p( found_assertion ) )
      {
        assertion = found_assertion;
        _csetf_fwd_inf_clump_triggering_assertion( clump, assertion );
      }
    }
    return assertion;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 3891L)
  public static SubLObject forward_inference_clump_inference_infos(final SubLObject clump)
  {
    return fwd_inf_clump_inference_infos( clump );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4005L)
  public static SubLObject add_forward_inference_info_to_clump(final SubLObject clump, final SubLObject inference_info)
  {
    assert NIL != forward_inference_info_p( inference_info ) : inference_info;
    SubLObject inference_infos = forward_inference_clump_inference_infos( clump );
    inference_infos = ConsesLow.append( inference_infos, ConsesLow.list( inference_info ) );
    _csetf_fwd_inf_clump_inference_infos( clump, inference_infos );
    return clump;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4397L)
  public static SubLObject forward_inference_clump_total_answer_count(final SubLObject clump)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject inference_infos = cdolist_list_var = forward_inference_clump_inference_infos( clump );
    SubLObject inference_info = NIL;
    inference_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject inference = forward_inference_info_inference( inference_info );
      final SubLObject answer_count = inference_datastructures_inference.inference_answer_count( inference );
      if( answer_count.isInteger() )
      {
        count = Numbers.add( count, answer_count );
      }
      cdolist_list_var = cdolist_list_var.rest();
      inference_info = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject forward_inference_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject forward_inference_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $forward_inference_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject fwd_inf_info_inference(final SubLObject v_object)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject fwd_inf_info_rule(final SubLObject v_object)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject fwd_inf_info_more_info(final SubLObject v_object)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject _csetf_fwd_inf_info_inference(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject _csetf_fwd_inf_info_rule(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject _csetf_fwd_inf_info_more_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != forward_inference_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject make_forward_inference_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $forward_inference_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw48$INFERENCE ) )
      {
        _csetf_fwd_inf_info_inference( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$RULE ) )
      {
        _csetf_fwd_inf_info_rule( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$MORE_INFO ) )
      {
        _csetf_fwd_inf_info_more_info( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject visit_defstruct_forward_inference_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym51$MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw48$INFERENCE, fwd_inf_info_inference( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw49$RULE, fwd_inf_info_rule( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw50$MORE_INFO, fwd_inf_info_more_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym51$MAKE_FORWARD_INFERENCE_INFO, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 4832L)
  public static SubLObject visit_defstruct_object_forward_inference_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_forward_inference_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5016L)
  public static SubLObject valid_forward_inference_info_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forward_inference_info_p( v_object ) && $kw27$FREE != fwd_inf_info_inference( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5179L)
  public static SubLObject new_forward_inference_info(final SubLObject possible_inference, final SubLObject rule, SubLObject more_info)
  {
    if( more_info == UNPROVIDED )
    {
      more_info = NIL;
    }
    if( NIL != possible_inference && !assertionsDisabledInClass && NIL == inference_datastructures_inference.inference_p( possible_inference ) )
    {
      throw new AssertionError( possible_inference );
    }
    final SubLObject forward_inference_info = make_forward_inference_info( UNPROVIDED );
    _csetf_fwd_inf_info_inference( forward_inference_info, possible_inference );
    _csetf_fwd_inf_info_rule( forward_inference_info, rule );
    _csetf_fwd_inf_info_more_info( forward_inference_info, more_info );
    return forward_inference_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 5654L)
  public static SubLObject destroy_inference_info(final SubLObject inference_info)
  {
    if( NIL != valid_forward_inference_info_p( inference_info ) )
    {
      final SubLObject inference = forward_inference_info_inference( inference_info );
      inference_datastructures_inference.destroy_inference_and_problem_store( inference );
      _csetf_fwd_inf_info_inference( inference_info, $kw27$FREE );
      _csetf_fwd_inf_info_rule( inference_info, $kw27$FREE );
      _csetf_fwd_inf_info_more_info( inference_info, $kw27$FREE );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6101L)
  public static SubLObject forward_inference_info_inference(final SubLObject inference_info)
  {
    return fwd_inf_info_inference( inference_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6231L)
  public static SubLObject forward_inference_info_rule(final SubLObject inference_info)
  {
    return fwd_inf_info_rule( inference_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6339L)
  public static SubLObject forward_inference_info_more_info(final SubLObject inference_info)
  {
    return fwd_inf_info_more_info( inference_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6457L)
  public static SubLObject inference_info_G(final SubLObject info1, final SubLObject info2)
  {
    return makeBoolean( !info1.eql( info2 ) && NIL == inference_info_L( info1, info2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 6603L)
  public static SubLObject inference_info_L(final SubLObject info1, final SubLObject info2)
  {
    final SubLObject inference1 = forward_inference_info_inference( info1 );
    final SubLObject inference2 = forward_inference_info_inference( info2 );
    final SubLObject store1 = ( NIL != inference1 ) ? inference_datastructures_inference.inference_problem_store( inference1 ) : NIL;
    final SubLObject store2 = ( NIL != inference2 ) ? inference_datastructures_inference.inference_problem_store( inference2 ) : NIL;
    final SubLObject answer_count_1 = ( NIL != inference1 ) ? inference_datastructures_inference.inference_answer_count( inference1 ) : ONE_INTEGER;
    final SubLObject answer_count_2 = ( NIL != inference2 ) ? inference_datastructures_inference.inference_answer_count( inference2 ) : ONE_INTEGER;
    final SubLObject problem_count_1 = ( NIL != store1 ) ? inference_datastructures_problem_store.problem_store_size( store1 ) : NIL;
    final SubLObject problem_count_2 = ( NIL != store2 ) ? inference_datastructures_problem_store.problem_store_size( store2 ) : NIL;
    final SubLObject store_id1 = ( NIL != store1 ) ? inference_datastructures_problem_store.problem_store_suid( store1 ) : NIL;
    final SubLObject store_id2 = ( NIL != store2 ) ? inference_datastructures_problem_store.problem_store_suid( store2 ) : NIL;
    final SubLObject id1 = ( NIL != inference1 ) ? inference_datastructures_inference.inference_suid( inference1 ) : NIL;
    final SubLObject id2 = ( NIL != inference2 ) ? inference_datastructures_inference.inference_suid( inference2 ) : NIL;
    if( NIL != subl_promotions.positive_integer_p( answer_count_1 ) && answer_count_2.isZero() )
    {
      return NIL;
    }
    if( answer_count_1.isZero() && NIL != subl_promotions.positive_integer_p( answer_count_2 ) )
    {
      return T;
    }
    if( NIL == inference1 && NIL == inference2 )
    {
      return Numbers.numL( assertion_handles.assertion_id( forward_inference_info_rule( info2 ) ), assertion_handles.assertion_id( forward_inference_info_rule( info2 ) ) );
    }
    if( NIL == inference1 )
    {
      return T;
    }
    if( NIL == inference2 )
    {
      return NIL;
    }
    if( store_id1.numL( store_id2 ) )
    {
      return NIL;
    }
    if( store_id1.numG( store_id2 ) )
    {
      return T;
    }
    if( id1.numL( id2 ) )
    {
      return NIL;
    }
    if( id1.numG( id2 ) )
    {
      return T;
    }
    if( problem_count_1.numL( problem_count_2 ) )
    {
      return T;
    }
    if( problem_count_1.numG( problem_count_2 ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8668L)
  public static SubLObject cb_current_forward_inference_clump()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_current_forward_inference_clump$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8771L)
  public static SubLObject do_current_forward_inference_infos(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject inference_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    inference_info = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      if( NIL == conses_high.member( current_$2, $list29, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw30$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw31$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS, ConsesLow.list( inference_info, $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_, $kw31$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 8997L)
  public static SubLObject cb_forward_inference_browser(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLObject browser_title = ( NIL != args ) ? args.first() : NIL;
    if( NIL != browser_title )
    {
      return cb_forward_inference_browser_int( cb_current_forward_inference_clump(), browser_title );
    }
    return cb_forward_inference_browser_int( cb_current_forward_inference_clump(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9424L)
  public static SubLObject cb_link_forward_inference_browser(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str59$FwdInf;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw60$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str61$cb_forward_inference_browser );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 9794L)
  public static SubLObject cb_forward_inference_browser_int(final SubLObject clump, SubLObject message)
  {
    if( message == UNPROVIDED )
    {
      message = $str64$Forward_Inference_Browser;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject title_var = message;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str66$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str67$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$3 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw68$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw69$CB_CYC );
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
          html_utilities.html_markup( $str72$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str73$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str74$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str75$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str76$Refresh_Frames );
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
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            if( NIL == forward_inference_clump_p( clump ) || !forward_inference_clump_inference_infos( clump ).isCons() )
            {
              html_utilities.html_princ( $str77$No_forward_inferences_to_browse_ );
              return NIL;
            }
            final SubLObject universal_time = forward_inference_clump_timestamp( clump );
            final SubLObject triggering_assertion = forward_inference_clump_triggering_assertion( clump );
            final SubLObject inference_infos = forward_inference_clump_inference_infos( clump );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str79$Last_browsable_forward_inference_, numeric_date_utilities.timestring( universal_time ) );
            html_utilities.html_newline( UNPROVIDED );
            if( NIL != assertion_handles.assertion_p( triggering_assertion ) )
            {
              cb_utilities.cb_show_assertion_readably( triggering_assertion, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              cb_sentence_browser.cb_show_sentence_readably( triggering_assertion, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            html_utilities.html_newline( TWO_INTEGER );
            SubLObject focus_infos = NIL;
            SubLObject out_of_focus_infos = NIL;
            if( NIL != $cb_forward_inference_browser_show_focus_sectionsP$.getDynamicValue( thread ) )
            {
              SubLObject last_rule = NIL;
              SubLObject focusP = NIL;
              SubLObject cdolist_list_var = inference_infos;
              SubLObject inference_info = NIL;
              inference_info = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                final SubLObject inference = forward_inference_info_inference( inference_info );
                final SubLObject rule = forward_inference_info_rule( inference_info );
                final SubLObject more_info = forward_inference_info_more_info( inference_info );
                final SubLObject answer_count = ( NIL != inference ) ? inference_datastructures_inference.inference_answer_count( inference )
                    : ( ( NIL != list_utilities.plist_lookup( more_info, $kw80$ANSWER_COUNT, UNPROVIDED ) ) ? list_utilities.plist_lookup( more_info, $kw80$ANSWER_COUNT, UNPROVIDED ) : ONE_INTEGER );
                if( NIL == kb_utilities.kbeq( rule, last_rule ) )
                {
                  focusP = NIL;
                }
                if( NIL != subl_promotions.positive_integer_p( answer_count ) || NIL != cb_web_services.currently_bookmarkedP( rule, UNPROVIDED ) || NIL != list_utilities.member_kbeqP( rule,
                    cb_parameters.$cb_assertion_history$.getDynamicValue( thread ) ) )
                {
                  focusP = T;
                }
                if( NIL != focusP )
                {
                  focus_infos = ConsesLow.cons( inference_info, focus_infos );
                }
                out_of_focus_infos = ConsesLow.cons( inference_info, out_of_focus_infos );
                last_rule = rule;
                cdolist_list_var = cdolist_list_var.rest();
                inference_info = cdolist_list_var.first();
              }
            }
            else
            {
              focus_infos = inference_infos;
            }
            focus_infos = Sequences.nreverse( focus_infos );
            out_of_focus_infos = Sequences.nreverse( out_of_focus_infos );
            if( NIL != out_of_focus_infos )
            {
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
              html_utilities.html_princ( $str81$Successful_and_watched_results_ );
              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              if( NIL != out_of_focus_infos )
              {
                html_utilities.html_indent( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str82$_all );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_princ( $str83$_Jump_to_all_results_ );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                }
                html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
              }
              html_utilities.html_newline( UNPROVIDED );
            }
            cb_forward_inference_browser_show_infos( focus_infos, $kw84$FOCUS );
            if( NIL != out_of_focus_infos )
            {
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_anchor_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str85$all );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                html_utilities.html_princ( $str86$All_results );
                html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
              }
              html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
              html_utilities.html_newline( UNPROVIDED );
            }
            cb_forward_inference_browser_show_infos( out_of_focus_infos, $kw87$ALL );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 12981L)
  public static SubLObject cb_fib_trigger_support_link_name(final SubLObject support, final SubLObject type_keyword)
  {
    final SubLObject assertion_id = ( NIL != assertion_handles.assertion_p( support ) ) ? assertion_handles.assertion_id( support ) : NIL;
    final SubLObject type_string = Symbols.symbol_name( type_keyword );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( type_string ), new SubLObject[] { $str88$_, format_nil.format_nil_a_no_copy( assertion_id )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13233L)
  public static SubLObject cb_fib_next_trigger_support_link_name(final SubLObject number, final SubLObject type_keyword)
  {
    final SubLObject type_string = Symbols.symbol_name( type_keyword );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( type_string ), new SubLObject[] { $str88$_, format_nil.format_nil_a_no_copy( number )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 13413L)
  public static SubLObject cb_forward_inference_browser_show_infos(final SubLObject inference_infos, final SubLObject type_keyword)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject trigger_support_num = ZERO_INTEGER;
    SubLObject last_trigger_support = NIL;
    SubLObject last_rule = NIL;
    SubLObject cdolist_list_var = inference_infos;
    SubLObject inference_info = NIL;
    inference_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject inference = forward_inference_info_inference( inference_info );
      final SubLObject rule = forward_inference_info_rule( inference_info );
      final SubLObject more_info = forward_inference_info_more_info( inference_info );
      final SubLObject trigger_support = list_utilities.plist_lookup( more_info, $kw89$TRIGGER_SUPPORT, UNPROVIDED );
      final SubLObject answer_count = ( NIL != inference ) ? inference_datastructures_inference.inference_answer_count( inference )
          : ( ( NIL != list_utilities.plist_lookup( more_info, $kw80$ANSWER_COUNT, UNPROVIDED ) ) ? list_utilities.plist_lookup( more_info, $kw80$ANSWER_COUNT, UNPROVIDED ) : ONE_INTEGER );
      final SubLObject reason = list_utilities.plist_lookup( more_info, $kw90$REASON, UNPROVIDED );
      if( NIL == trigger_support || !trigger_support.equal( last_trigger_support ) )
      {
        html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
        if( NIL == trigger_support )
        {
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          html_utilities.html_princ( $str91$Propagating_rule__ );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        }
        else
        {
          SubLObject trigger_name = cb_fib_trigger_support_link_name( trigger_support, type_keyword );
          final SubLObject next_name = cb_fib_next_trigger_support_link_name( trigger_support_num, type_keyword );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          if( NIL != trigger_name )
          {
            html_utilities.html_markup( html_macros.$html_anchor_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( trigger_name );
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
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          if( NIL != next_name )
          {
            html_utilities.html_markup( html_macros.$html_anchor_name$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( next_name );
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
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
          html_utilities.html_princ( $str92$Propagating__ );
          html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
          final SubLObject next_name2 = Sequences.cconcatenate( $str93$_, cb_fib_next_trigger_support_link_name( Numbers.add( ONE_INTEGER, trigger_support_num ), type_keyword ) );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( next_name2 );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_princ( $str94$_Next_ );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
          }
          html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          if( NIL != assertion_handles.assertion_p( trigger_support ) )
          {
            cb_utilities.cb_show_assertion_readably( trigger_support, T, T );
          }
          else
          {
            cb_utilities.cb_form( trigger_support, UNPROVIDED, UNPROVIDED );
          }
          if( type_keyword == $kw84$FOCUS )
          {
            trigger_name = Sequences.cconcatenate( $str93$_, cb_fib_trigger_support_link_name( trigger_support, $kw87$ALL ) );
            html_utilities.html_glyph( $kw95$NBSP, THREE_INTEGER );
            html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( trigger_name );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str96$_Jump_to_all_rules_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
            }
            html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
          }
        }
        html_utilities.html_newline( UNPROVIDED );
        trigger_support_num = Numbers.add( trigger_support_num, ONE_INTEGER );
        last_trigger_support = trigger_support;
      }
      if( NIL != last_trigger_support && NIL == kb_utilities.kbeq( rule, last_rule ) )
      {
        html_utilities.html_newline( UNPROVIDED );
        cb_utilities.cb_show_assertion_readably( rule, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
        html_utilities.html_glyph( $kw97$RARR, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
        html_utilities.html_indent( UNPROVIDED );
        last_rule = rule;
      }
      if( NIL != inference )
      {
        cb_utilities.cb_link( $kw48$INFERENCE, inference, $kw98$VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
      }
      if( NIL != reason )
      {
        final SubLObject type = conses_high.getf( reason, $kw99$TYPE, UNPROVIDED );
        final SubLObject asent = conses_high.getf( reason, $kw100$ASENT, UNPROVIDED );
        final SubLObject placement_mt = conses_high.getf( reason, $kw101$PLACEMENT_MT, UNPROVIDED );
        final SubLObject other_keys = Sequences.remove( $kw99$TYPE, Sequences.remove( $kw100$ASENT, list_utilities.plist_keys( reason ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED,
            UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        final SubLObject id_string = ( NIL != other_keys ) ? Symbols.symbol_name( Symbols.gensym( UNPROVIDED ) ) : NIL;
        if( NIL != other_keys )
        {
          dhtml_macros.dhtml_switch_visibility_links_arrows( id_string, $str102$ );
        }
        cb_utilities.cb_form( type, UNPROVIDED, UNPROVIDED );
        html_utilities.html_indent( UNPROVIDED );
        cb_utilities.cb_form( asent, UNPROVIDED, UNPROVIDED );
        if( NIL != placement_mt )
        {
          html_utilities.html_princ( $str103$_into_mt_ );
          cb_utilities.cb_form( placement_mt, UNPROVIDED, UNPROVIDED );
        }
        if( NIL != other_keys )
        {
          dhtml_macros.dhtml_set_switched_visibility( id_string, $kw104$INVISIBLE, $kw105$PARAGRAPH );
          html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
          if( NIL != id_string )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( id_string );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_3 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( ONE_INTEGER );
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
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject remainder;
              SubLObject property;
              SubLObject value;
              SubLObject _prev_bind_0_$10;
              SubLObject _prev_bind_0_$11;
              SubLObject _prev_bind_0_$12;
              SubLObject _prev_bind_0_$13;
              SubLObject cdolist_list_var_$14;
              SubLObject value_elem;
              SubLObject _prev_bind_0_$14;
              SubLObject _prev_bind_0_$15;
              SubLObject _prev_bind_0_$16;
              SubLObject _prev_bind_0_$17;
              SubLObject cdolist_list_var_$15;
              SubLObject mt;
              for( remainder = NIL, remainder = reason; NIL != remainder; remainder = conses_high.cddr( remainder ) )
              {
                property = remainder.first();
                value = conses_high.cadr( remainder );
                if( NIL == list_utilities.member_eqP( property, $list106 ) )
                {
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw107$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      cb_utilities.cb_form( property, UNPROVIDED, UNPROVIDED );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_markup( html_utilities.html_align( $kw107$TOP ) );
                    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      if( NIL != list_utilities.member_eqP( property, $list108 ) )
                      {
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
                        _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          cdolist_list_var_$14 = value;
                          value_elem = NIL;
                          value_elem = cdolist_list_var_$14.first();
                          while ( NIL != cdolist_list_var_$14)
                          {
                            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( html_utilities.html_align( $kw107$TOP ) );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                              _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                              try
                              {
                                html_macros.$html_safe_print$.bind( T, thread );
                                html_utilities.html_glyph( $kw109$BULL, UNPROVIDED );
                              }
                              finally
                              {
                                html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                              }
                              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( html_utilities.html_align( $kw107$TOP ) );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                              _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                              try
                              {
                                html_macros.$html_safe_print$.bind( T, thread );
                                cb_utilities.cb_form( value_elem, UNPROVIDED, UNPROVIDED );
                              }
                              finally
                              {
                                html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                              }
                              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( html_utilities.html_align( $kw107$TOP ) );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                              _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                              try
                              {
                                html_macros.$html_safe_print$.bind( T, thread );
                                cdolist_list_var_$15 = Mapping.mapcar( $sym110$SUPPORT_MT, hl_supports.hl_forward_mt_combos( value_elem ) );
                                mt = NIL;
                                mt = cdolist_list_var_$15.first();
                                while ( NIL != cdolist_list_var_$15)
                                {
                                  cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
                                  html_utilities.html_indent( UNPROVIDED );
                                  cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                                  mt = cdolist_list_var_$15.first();
                                }
                              }
                              finally
                              {
                                html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                              }
                              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                            html_utilities.html_source_readability_terpri( UNPROVIDED );
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            value_elem = cdolist_list_var_$14.first();
                          }
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                      }
                      else
                      {
                        cb_utilities.cb_form( value, UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_3, thread );
          }
          html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        html_utilities.html_newline( UNPROVIDED );
      }
      else
      {
        html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str111$_d_answer__P, answer_count );
        html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        if( NIL != inference )
        {
          SubLObject justification_count = ZERO_INTEGER;
          final SubLObject idx = inference_datastructures_inference.inference_answer_id_index( inference );
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw112$SKIP ) )
          {
            final SubLObject idx_$20 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$20, $kw112$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$20 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject v_answer;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                v_answer = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( v_answer ) || NIL == id_index.id_index_skip_tombstones_p( $kw112$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( v_answer ) )
                  {
                    v_answer = $kw112$SKIP;
                  }
                  justification_count = Numbers.add( justification_count, inference_datastructures_inference.inference_answer_justification_count( v_answer ) );
                }
              }
            }
            final SubLObject idx_$21 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$21 ) )
            {
              final SubLObject cdohash_table = id_index.id_index_sparse_objects( idx_$21 );
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
                  justification_count = Numbers.add( justification_count, inference_datastructures_inference.inference_answer_justification_count( v_answer2 ) );
                }
              }
              finally
              {
                Hashtables.releaseEntrySetIterator( cdohash_iterator );
              }
            }
          }
          if( justification_count.numG( answer_count ) )
          {
            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
            PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str113$___d_justification__P, justification_count );
            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          }
        }
        html_utilities.html_newline( UNPROVIDED );
        if( NIL == inference && answer_count.isZero() && NIL != assertions_high.single_literal_antecedent_ruleP( rule ) )
        {
          html_utilities.html_princ( $str114$__No_inference_was_performed_sinc );
        }
      }
      if( NIL != $cb_forward_inference_browser_show_el_queriesP$.getDynamicValue( thread ) && NIL != inference )
      {
        cb_query_browser.cb_show_inference_el_query( inference, NIL );
        html_utilities.html_newline( UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      inference_info = cdolist_list_var.first();
    }
    final SubLObject next_name3 = cb_fib_next_trigger_support_link_name( trigger_support_num, type_keyword );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    if( NIL != next_name3 )
    {
      html_utilities.html_markup( html_macros.$html_anchor_name$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( next_name3 );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_4 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_4, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18494L)
  public static SubLObject cb_note_new_forward_inference_for_browsing(final SubLObject inference, final SubLObject rule, SubLObject more_info)
  {
    if( more_info == UNPROVIDED )
    {
      more_info = NIL;
    }
    if( NIL == cb_current_forward_inference_clump() )
    {
      return NIL;
    }
    more_info = conses_high.putf( more_info, $kw89$TRIGGER_SUPPORT, forward.current_forward_inference_gaf() );
    final SubLObject inference_info = new_forward_inference_info( inference, rule, more_info );
    add_forward_inference_info_to_clump( cb_current_forward_inference_clump(), inference_info );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 18931L)
  public static SubLObject prepare_to_browse_new_forward_inference(final SubLObject triggering_assertion_or_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    destroy_forward_inference_clump( $cb_current_forward_inference_clump$.getDynamicValue( thread ) );
    $cb_current_forward_inference_clump$.setDynamicValue( new_forward_inference_clump( triggering_assertion_or_sentence ), thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/cb-forward-inference-browser.lisp", position = 19266L)
  public static SubLObject cleanup_from_browsing_new_forward_inference()
  {
    return NIL;
  }

  public static SubLObject declare_cb_forward_inference_browser_file()
  {
    SubLFiles.declareFunction( me, "cb_forward_inference_clump_lookup_by_id", "CB-FORWARD-INFERENCE-CLUMP-LOOKUP-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_print_function_trampoline", "FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_p", "FORWARD-INFERENCE-CLUMP-P", 1, 0, false );
    new $forward_inference_clump_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fwd_inf_clump_id", "FWD-INF-CLUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "fwd_inf_clump_timestamp", "FWD-INF-CLUMP-TIMESTAMP", 1, 0, false );
    SubLFiles.declareFunction( me, "fwd_inf_clump_triggering_assertion", "FWD-INF-CLUMP-TRIGGERING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "fwd_inf_clump_inference_infos", "FWD-INF-CLUMP-INFERENCE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_clump_id", "_CSETF-FWD-INF-CLUMP-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_clump_timestamp", "_CSETF-FWD-INF-CLUMP-TIMESTAMP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_clump_triggering_assertion", "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_clump_inference_infos", "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_forward_inference_clump", "MAKE-FORWARD-INFERENCE-CLUMP", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_forward_inference_clump", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-CLUMP", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_forward_inference_clump_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_forward_inference_clump_p", "VALID-FORWARD-INFERENCE-CLUMP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_forward_inference_clump", "NEW-FORWARD-INFERENCE-CLUMP", 1, 0, false );
    SubLFiles.declareMacro( me, "do_forward_inference_clump_inference_infos", "DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS" );
    SubLFiles.declareFunction( me, "destroy_forward_inference_clump", "DESTROY-FORWARD-INFERENCE-CLUMP", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_id", "FORWARD-INFERENCE-CLUMP-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_timestamp", "FORWARD-INFERENCE-CLUMP-TIMESTAMP", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_triggering_assertion", "FORWARD-INFERENCE-CLUMP-TRIGGERING-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_inference_infos", "FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_forward_inference_info_to_clump", "ADD-FORWARD-INFERENCE-INFO-TO-CLUMP", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_clump_total_answer_count", "FORWARD-INFERENCE-CLUMP-TOTAL-ANSWER-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_info_print_function_trampoline", "FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_info_p", "FORWARD-INFERENCE-INFO-P", 1, 0, false );
    new $forward_inference_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "fwd_inf_info_inference", "FWD-INF-INFO-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "fwd_inf_info_rule", "FWD-INF-INFO-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "fwd_inf_info_more_info", "FWD-INF-INFO-MORE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_info_inference", "_CSETF-FWD-INF-INFO-INFERENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_info_rule", "_CSETF-FWD-INF-INFO-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_fwd_inf_info_more_info", "_CSETF-FWD-INF-INFO-MORE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "make_forward_inference_info", "MAKE-FORWARD-INFERENCE-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_forward_inference_info", "VISIT-DEFSTRUCT-FORWARD-INFERENCE-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_forward_inference_info_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_forward_inference_info_p", "VALID-FORWARD-INFERENCE-INFO-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_forward_inference_info", "NEW-FORWARD-INFERENCE-INFO", 2, 1, false );
    SubLFiles.declareFunction( me, "destroy_inference_info", "DESTROY-INFERENCE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_info_inference", "FORWARD-INFERENCE-INFO-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_info_rule", "FORWARD-INFERENCE-INFO-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "forward_inference_info_more_info", "FORWARD-INFERENCE-INFO-MORE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_info_G", "INFERENCE-INFO->", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_info_L", "INFERENCE-INFO-<", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_current_forward_inference_clump", "CB-CURRENT-FORWARD-INFERENCE-CLUMP", 0, 0, false );
    SubLFiles.declareMacro( me, "do_current_forward_inference_infos", "DO-CURRENT-FORWARD-INFERENCE-INFOS" );
    SubLFiles.declareFunction( me, "cb_forward_inference_browser", "CB-FORWARD-INFERENCE-BROWSER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_forward_inference_browser", "CB-LINK-FORWARD-INFERENCE-BROWSER", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_forward_inference_browser_int", "CB-FORWARD-INFERENCE-BROWSER-INT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_fib_trigger_support_link_name", "CB-FIB-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_fib_next_trigger_support_link_name", "CB-FIB-NEXT-TRIGGER-SUPPORT-LINK-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_forward_inference_browser_show_infos", "CB-FORWARD-INFERENCE-BROWSER-SHOW-INFOS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_note_new_forward_inference_for_browsing", "CB-NOTE-NEW-FORWARD-INFERENCE-FOR-BROWSING", 2, 1, false );
    SubLFiles.declareFunction( me, "prepare_to_browse_new_forward_inference", "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cleanup_from_browsing_new_forward_inference", "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_forward_inference_browser_file()
  {
    $cb_forward_inference_clump_id_index$ = SubLFiles.defparameter( "*CB-FORWARD-INFERENCE-CLUMP-ID-INDEX*", id_index.new_id_index( UNPROVIDED, UNPROVIDED ) );
    $cb_forward_inference_browser_show_focus_sectionsP$ = SubLFiles.defparameter( "*CB-FORWARD-INFERENCE-BROWSER-SHOW-FOCUS-SECTIONS?*", T );
    $cb_forward_inference_browser_show_el_queriesP$ = SubLFiles.defparameter( "*CB-FORWARD-INFERENCE-BROWSER-SHOW-EL-QUERIES?*", NIL );
    $dtp_forward_inference_clump$ = SubLFiles.defconstant( "*DTP-FORWARD-INFERENCE-CLUMP*", $sym0$FORWARD_INFERENCE_CLUMP );
    $dtp_forward_inference_info$ = SubLFiles.defconstant( "*DTP-FORWARD-INFERENCE-INFO*", $sym35$FORWARD_INFERENCE_INFO );
    $cb_current_forward_inference_clump$ = SubLFiles.defvar( "*CB-CURRENT-FORWARD-INFERENCE-CLUMP*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_forward_inference_browser_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function(
        $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$FWD_INF_CLUMP_ID, $sym10$_CSETF_FWD_INF_CLUMP_ID );
    Structures.def_csetf( $sym11$FWD_INF_CLUMP_TIMESTAMP, $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP );
    Structures.def_csetf( $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION, $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION );
    Structures.def_csetf( $sym15$FWD_INF_CLUMP_INFERENCE_INFOS, $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS );
    Equality.identity( $sym0$FORWARD_INFERENCE_CLUMP );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_clump$.getGlobalValue(), Symbols.symbol_function(
        $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function(
        $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list41 );
    Structures.def_csetf( $sym42$FWD_INF_INFO_INFERENCE, $sym43$_CSETF_FWD_INF_INFO_INFERENCE );
    Structures.def_csetf( $sym44$FWD_INF_INFO_RULE, $sym45$_CSETF_FWD_INF_INFO_RULE );
    Structures.def_csetf( $sym46$FWD_INF_INFO_MORE_INFO, $sym47$_CSETF_FWD_INF_INFO_MORE_INFO );
    Equality.identity( $sym35$FORWARD_INFERENCE_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_inference_info$.getGlobalValue(), Symbols.symbol_function(
        $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD ) );
    utilities_macros.register_html_state_variable( $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_ );
    html_macros.note_cgi_handler_function( $sym57$CB_FORWARD_INFERENCE_BROWSER, $kw58$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw62$FORWARD_INFERENCE_BROWSER, $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw62$FORWARD_INFERENCE_BROWSER, $str64$Forward_Inference_Browser, $str59$FwdInf, $str65$Browse_the_most_recent_browsable_ );
    access_macros.register_macro_helper( $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE, $sym116$BROWSING_NEW_FORWARD_INFERENCE );
    access_macros.register_macro_helper( $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE, $sym116$BROWSING_NEW_FORWARD_INFERENCE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_forward_inference_browser_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_forward_inference_browser_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_forward_inference_browser_file();
  }
  static
  {
    me = new cb_forward_inference_browser();
    $cb_forward_inference_clump_id_index$ = null;
    $cb_forward_inference_browser_show_focus_sectionsP$ = null;
    $cb_forward_inference_browser_show_el_queriesP$ = null;
    $dtp_forward_inference_clump$ = null;
    $dtp_forward_inference_info$ = null;
    $cb_current_forward_inference_clump$ = null;
    $sym0$FORWARD_INFERENCE_CLUMP = makeSymbol( "FORWARD-INFERENCE-CLUMP" );
    $sym1$FORWARD_INFERENCE_CLUMP_P = makeSymbol( "FORWARD-INFERENCE-CLUMP-P" );
    $list2 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "TIMESTAMP" ), makeSymbol( "TRIGGERING-ASSERTION" ), makeSymbol( "INFERENCE-INFOS" ) );
    $list3 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "TIMESTAMP" ), makeKeyword( "TRIGGERING-ASSERTION" ), makeKeyword( "INFERENCE-INFOS" ) );
    $list4 = ConsesLow.list( makeSymbol( "FWD-INF-CLUMP-ID" ), makeSymbol( "FWD-INF-CLUMP-TIMESTAMP" ), makeSymbol( "FWD-INF-CLUMP-TRIGGERING-ASSERTION" ), makeSymbol( "FWD-INF-CLUMP-INFERENCE-INFOS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-FWD-INF-CLUMP-ID" ), makeSymbol( "_CSETF-FWD-INF-CLUMP-TIMESTAMP" ), makeSymbol( "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION" ), makeSymbol(
        "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS" ) );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$FORWARD_INFERENCE_CLUMP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FORWARD-INFERENCE-CLUMP-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FORWARD-INFERENCE-CLUMP-P" ) );
    $sym9$FWD_INF_CLUMP_ID = makeSymbol( "FWD-INF-CLUMP-ID" );
    $sym10$_CSETF_FWD_INF_CLUMP_ID = makeSymbol( "_CSETF-FWD-INF-CLUMP-ID" );
    $sym11$FWD_INF_CLUMP_TIMESTAMP = makeSymbol( "FWD-INF-CLUMP-TIMESTAMP" );
    $sym12$_CSETF_FWD_INF_CLUMP_TIMESTAMP = makeSymbol( "_CSETF-FWD-INF-CLUMP-TIMESTAMP" );
    $sym13$FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol( "FWD-INF-CLUMP-TRIGGERING-ASSERTION" );
    $sym14$_CSETF_FWD_INF_CLUMP_TRIGGERING_ASSERTION = makeSymbol( "_CSETF-FWD-INF-CLUMP-TRIGGERING-ASSERTION" );
    $sym15$FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol( "FWD-INF-CLUMP-INFERENCE-INFOS" );
    $sym16$_CSETF_FWD_INF_CLUMP_INFERENCE_INFOS = makeSymbol( "_CSETF-FWD-INF-CLUMP-INFERENCE-INFOS" );
    $kw17$ID = makeKeyword( "ID" );
    $kw18$TIMESTAMP = makeKeyword( "TIMESTAMP" );
    $kw19$TRIGGERING_ASSERTION = makeKeyword( "TRIGGERING-ASSERTION" );
    $kw20$INFERENCE_INFOS = makeKeyword( "INFERENCE-INFOS" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_FORWARD_INFERENCE_CLUMP = makeSymbol( "MAKE-FORWARD-INFERENCE-CLUMP" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_CLUMP_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-CLUMP-METHOD" );
    $kw27$FREE = makeKeyword( "FREE" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-INFO" ), makeSymbol( "CLUMP" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list29 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw30$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw31$DONE = makeKeyword( "DONE" );
    $sym32$DO_LIST = makeSymbol( "DO-LIST" );
    $sym33$FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol( "FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS" );
    $sym34$FORWARD_INFERENCE_INFO_P = makeSymbol( "FORWARD-INFERENCE-INFO-P" );
    $sym35$FORWARD_INFERENCE_INFO = makeSymbol( "FORWARD-INFERENCE-INFO" );
    $list36 = ConsesLow.list( makeSymbol( "INFERENCE" ), makeSymbol( "RULE" ), makeSymbol( "MORE-INFO" ) );
    $list37 = ConsesLow.list( makeKeyword( "INFERENCE" ), makeKeyword( "RULE" ), makeKeyword( "MORE-INFO" ) );
    $list38 = ConsesLow.list( makeSymbol( "FWD-INF-INFO-INFERENCE" ), makeSymbol( "FWD-INF-INFO-RULE" ), makeSymbol( "FWD-INF-INFO-MORE-INFO" ) );
    $list39 = ConsesLow.list( makeSymbol( "_CSETF-FWD-INF-INFO-INFERENCE" ), makeSymbol( "_CSETF-FWD-INF-INFO-RULE" ), makeSymbol( "_CSETF-FWD-INF-INFO-MORE-INFO" ) );
    $sym40$FORWARD_INFERENCE_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "FORWARD-INFERENCE-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list41 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "FORWARD-INFERENCE-INFO-P" ) );
    $sym42$FWD_INF_INFO_INFERENCE = makeSymbol( "FWD-INF-INFO-INFERENCE" );
    $sym43$_CSETF_FWD_INF_INFO_INFERENCE = makeSymbol( "_CSETF-FWD-INF-INFO-INFERENCE" );
    $sym44$FWD_INF_INFO_RULE = makeSymbol( "FWD-INF-INFO-RULE" );
    $sym45$_CSETF_FWD_INF_INFO_RULE = makeSymbol( "_CSETF-FWD-INF-INFO-RULE" );
    $sym46$FWD_INF_INFO_MORE_INFO = makeSymbol( "FWD-INF-INFO-MORE-INFO" );
    $sym47$_CSETF_FWD_INF_INFO_MORE_INFO = makeSymbol( "_CSETF-FWD-INF-INFO-MORE-INFO" );
    $kw48$INFERENCE = makeKeyword( "INFERENCE" );
    $kw49$RULE = makeKeyword( "RULE" );
    $kw50$MORE_INFO = makeKeyword( "MORE-INFO" );
    $sym51$MAKE_FORWARD_INFERENCE_INFO = makeSymbol( "MAKE-FORWARD-INFERENCE-INFO" );
    $sym52$VISIT_DEFSTRUCT_OBJECT_FORWARD_INFERENCE_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-FORWARD-INFERENCE-INFO-METHOD" );
    $sym53$INFERENCE_P = makeSymbol( "INFERENCE-P" );
    $sym54$_CB_CURRENT_FORWARD_INFERENCE_CLUMP_ = makeSymbol( "*CB-CURRENT-FORWARD-INFERENCE-CLUMP*" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "INFERENCE-INFO" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym56$DO_FORWARD_INFERENCE_CLUMP_INFERENCE_INFOS = makeSymbol( "DO-FORWARD-INFERENCE-CLUMP-INFERENCE-INFOS" );
    $sym57$CB_FORWARD_INFERENCE_BROWSER = makeSymbol( "CB-FORWARD-INFERENCE-BROWSER" );
    $kw58$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str59$FwdInf = makeString( "FwdInf" );
    $kw60$MAIN = makeKeyword( "MAIN" );
    $str61$cb_forward_inference_browser = makeString( "cb-forward-inference-browser" );
    $kw62$FORWARD_INFERENCE_BROWSER = makeKeyword( "FORWARD-INFERENCE-BROWSER" );
    $sym63$CB_LINK_FORWARD_INFERENCE_BROWSER = makeSymbol( "CB-LINK-FORWARD-INFERENCE-BROWSER" );
    $str64$Forward_Inference_Browser = makeString( "Forward Inference Browser" );
    $str65$Browse_the_most_recent_browsable_ = makeString( "Browse the most recent browsable forward inference" );
    $str66$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str67$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw68$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw69$CB_CYC = makeKeyword( "CB-CYC" );
    $kw70$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw71$SHA1 = makeKeyword( "SHA1" );
    $str72$yui_skin_sam = makeString( "yui-skin-sam" );
    $str73$reloadFrameButton = makeString( "reloadFrameButton" );
    $str74$button = makeString( "button" );
    $str75$reload = makeString( "reload" );
    $str76$Refresh_Frames = makeString( "Refresh Frames" );
    $str77$No_forward_inferences_to_browse_ = makeString( "No forward inferences to browse." );
    $sym78$_EXIT = makeSymbol( "%EXIT" );
    $str79$Last_browsable_forward_inference_ = makeString( "Last browsable forward inference clump was triggered at ~a by the forward propagation of" );
    $kw80$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
    $str81$Successful_and_watched_results_ = makeString( "Successful and watched results:" );
    $str82$_all = makeString( "#all" );
    $str83$_Jump_to_all_results_ = makeString( "[Jump to all results]" );
    $kw84$FOCUS = makeKeyword( "FOCUS" );
    $str85$all = makeString( "all" );
    $str86$All_results = makeString( "All results" );
    $kw87$ALL = makeKeyword( "ALL" );
    $str88$_ = makeString( "_" );
    $kw89$TRIGGER_SUPPORT = makeKeyword( "TRIGGER-SUPPORT" );
    $kw90$REASON = makeKeyword( "REASON" );
    $str91$Propagating_rule__ = makeString( "Propagating rule: " );
    $str92$Propagating__ = makeString( "Propagating: " );
    $str93$_ = makeString( "#" );
    $str94$_Next_ = makeString( "[Next]" );
    $kw95$NBSP = makeKeyword( "NBSP" );
    $str96$_Jump_to_all_rules_ = makeString( "[Jump to all rules]" );
    $kw97$RARR = makeKeyword( "RARR" );
    $kw98$VERY_VERBOSE = makeKeyword( "VERY-VERBOSE" );
    $kw99$TYPE = makeKeyword( "TYPE" );
    $kw100$ASENT = makeKeyword( "ASENT" );
    $kw101$PLACEMENT_MT = makeKeyword( "PLACEMENT-MT" );
    $str102$ = makeString( "" );
    $str103$_into_mt_ = makeString( " into mt " );
    $kw104$INVISIBLE = makeKeyword( "INVISIBLE" );
    $kw105$PARAGRAPH = makeKeyword( "PARAGRAPH" );
    $list106 = ConsesLow.list( makeKeyword( "TYPE" ), makeKeyword( "ASENT" ), makeKeyword( "PLACEMENT-MT" ) );
    $kw107$TOP = makeKeyword( "TOP" );
    $list108 = ConsesLow.list( makeKeyword( "SUPPORTS" ), makeKeyword( "PRAGMATIC-SUPPORTS" ) );
    $kw109$BULL = makeKeyword( "BULL" );
    $sym110$SUPPORT_MT = makeSymbol( "SUPPORT-MT" );
    $str111$_d_answer__P = makeString( "~d answer~:P" );
    $kw112$SKIP = makeKeyword( "SKIP" );
    $str113$___d_justification__P = makeString( ", ~d justification~:P" );
    $str114$__No_inference_was_performed_sinc = makeString( " (No inference was performed since rule is a single literal antecedent rule)" );
    $sym115$PREPARE_TO_BROWSE_NEW_FORWARD_INFERENCE = makeSymbol( "PREPARE-TO-BROWSE-NEW-FORWARD-INFERENCE" );
    $sym116$BROWSING_NEW_FORWARD_INFERENCE = makeSymbol( "BROWSING-NEW-FORWARD-INFERENCE" );
    $sym117$CLEANUP_FROM_BROWSING_NEW_FORWARD_INFERENCE = makeSymbol( "CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE" );
  }

  public static final class $forward_inference_clump_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $timestamp;
    public SubLObject $triggering_assertion;
    public SubLObject $inference_infos;
    private static final SubLStructDeclNative structDecl;

    public $forward_inference_clump_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$timestamp = CommonSymbols.NIL;
      this.$triggering_assertion = CommonSymbols.NIL;
      this.$inference_infos = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $forward_inference_clump_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$timestamp;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$triggering_assertion;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$inference_infos;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$timestamp = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$triggering_assertion = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$inference_infos = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $forward_inference_clump_native.class, $sym0$FORWARD_INFERENCE_CLUMP, $sym1$FORWARD_INFERENCE_CLUMP_P, $list2, $list3, new String[] { "$id", "$timestamp",
        "$triggering_assertion", "$inference_infos"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $forward_inference_clump_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_inference_clump_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-INFERENCE-CLUMP-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_inference_clump_p( arg1 );
    }
  }

  public static final class $forward_inference_info_native
      extends
        SubLStructNative
  {
    public SubLObject $inference;
    public SubLObject $rule;
    public SubLObject $more_info;
    private static final SubLStructDeclNative structDecl;

    public $forward_inference_info_native()
    {
      this.$inference = CommonSymbols.NIL;
      this.$rule = CommonSymbols.NIL;
      this.$more_info = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $forward_inference_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$inference;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$rule;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$more_info;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$inference = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$rule = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$more_info = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $forward_inference_info_native.class, $sym35$FORWARD_INFERENCE_INFO, $sym34$FORWARD_INFERENCE_INFO_P, $list36, $list37, new String[] { "$inference", "$rule",
        "$more_info"
      }, $list38, $list39, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $forward_inference_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $forward_inference_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FORWARD-INFERENCE-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return forward_inference_info_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 817 ms synthetic
 */