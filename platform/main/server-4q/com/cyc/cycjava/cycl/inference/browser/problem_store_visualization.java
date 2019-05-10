package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cache;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.web_services;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class problem_store_visualization
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.browser.problem_store_visualization";
  public static final String myFingerPrint = "0a617894a23d15193e00d0b10e2543ea389d47e3c91c16edad89a32464f2f035";
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLSymbol $dtp_problem_layout$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 6964L)
  private static SubLSymbol $octant_locations$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 15087L)
  private static SubLSymbol $html_problem_layout_visualization_script_template$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
  private static SubLSymbol $html_problem_layout_visualization_table_style_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 29870L)
  private static SubLSymbol $cb_problem_store_default_zoom_levels$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 34804L)
  private static SubLSymbol $last_store$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 34986L)
  private static SubLSymbol $last_problem_end$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 35030L)
  private static SubLSymbol $current_vpfm_call_count$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
  private static SubLSymbol $notify_visualizing_problem_store_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37938L)
  private static SubLSymbol $inference_monitor_grid_width$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37995L)
  private static SubLSymbol $inference_monitor_grid_height$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38052L)
  private static SubLSymbol $inference_monitor_max_cell_size$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
  private static SubLSymbol $compute_grid_size_for_inference_monitor_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
  private static SubLSymbol $html_problem_layout_visualization_for_monitor_table_style_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 40659L)
  private static SubLSymbol $cb_problem_store_layout_table$;
  private static final SubLSymbol $sym0$PROBLEM_LAYOUT;
  private static final SubLSymbol $sym1$PROBLEM_LAYOUT_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym7$PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PROB_LAYOUT_PROBLEM_STORE;
  private static final SubLSymbol $sym10$_CSETF_PROB_LAYOUT_PROBLEM_STORE;
  private static final SubLSymbol $sym11$PROB_LAYOUT_MIN_X;
  private static final SubLSymbol $sym12$_CSETF_PROB_LAYOUT_MIN_X;
  private static final SubLSymbol $sym13$PROB_LAYOUT_MAX_X;
  private static final SubLSymbol $sym14$_CSETF_PROB_LAYOUT_MAX_X;
  private static final SubLSymbol $sym15$PROB_LAYOUT_MIN_Y;
  private static final SubLSymbol $sym16$_CSETF_PROB_LAYOUT_MIN_Y;
  private static final SubLSymbol $sym17$PROB_LAYOUT_MAX_Y;
  private static final SubLSymbol $sym18$_CSETF_PROB_LAYOUT_MAX_Y;
  private static final SubLSymbol $sym19$PROB_LAYOUT_GRID;
  private static final SubLSymbol $sym20$_CSETF_PROB_LAYOUT_GRID;
  private static final SubLSymbol $sym21$PROB_LAYOUT_NEXT_PROBLEM_ID;
  private static final SubLSymbol $sym22$_CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID;
  private static final SubLSymbol $sym23$PROB_LAYOUT_PROBLEM_X_TABLE;
  private static final SubLSymbol $sym24$_CSETF_PROB_LAYOUT_PROBLEM_X_TABLE;
  private static final SubLSymbol $sym25$PROB_LAYOUT_PROBLEM_Y_TABLE;
  private static final SubLSymbol $sym26$_CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE;
  private static final SubLSymbol $kw27$PROBLEM_STORE;
  private static final SubLSymbol $kw28$MIN_X;
  private static final SubLSymbol $kw29$MAX_X;
  private static final SubLSymbol $kw30$MIN_Y;
  private static final SubLSymbol $kw31$MAX_Y;
  private static final SubLSymbol $kw32$GRID;
  private static final SubLSymbol $kw33$NEXT_PROBLEM_ID;
  private static final SubLSymbol $kw34$PROBLEM_X_TABLE;
  private static final SubLSymbol $kw35$PROBLEM_Y_TABLE;
  private static final SubLString $str36$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw37$BEGIN;
  private static final SubLSymbol $sym38$MAKE_PROBLEM_LAYOUT;
  private static final SubLSymbol $kw39$SLOT;
  private static final SubLSymbol $kw40$END;
  private static final SubLSymbol $sym41$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD;
  private static final SubLSymbol $sym42$PROBLEM_STORE_P;
  private static final SubLSymbol $kw43$FREE;
  private static final SubLSymbol $sym44$PROBLEM_P;
  private static final SubLString $str45$unable_to_add_to_layout__S;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$_OCTANT_LOCATIONS_;
  private static final SubLInteger $int48$316;
  private static final SubLSymbol $sym49$OCTANT_LOCATION__;
  private static final SubLSymbol $sym50$VECTOR;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$_;
  private static final SubLSymbol $sym54$PROBLEM_SUID;
  private static final SubLSymbol $sym55$PROBLEM_LINK_SUID;
  private static final SubLSymbol $sym56$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $kw57$GOODNESS;
  private static final SubLString $str58$ps_;
  private static final SubLString $str59$_;
  private static final SubLString $str60$problemGrid;
  private static final SubLSymbol $kw61$CENTER;
  private static final SubLSymbol $kw62$PROBLEM;
  private static final SubLSymbol $kw63$MINIMAL;
  private static final SubLString $str64$_;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$EXT_ALL;
  private static final SubLSymbol $kw67$RAPHAEL;
  private static final SubLString $str68$_;
  private static final SubLString $str69$null;
  private static final SubLString $str70$_;
  private static final SubLString $str71$_;
  private static final SubLString $str72$_script_type__text_javascript____;
  private static final SubLString $str73$_style_type__text_css_______A_tab;
  private static final SubLString $str74$height_1_5em;
  private static final SubLString $str75$ps;
  private static final SubLString $str76$_slider;
  private static final SubLString $str77$_slider_field;
  private static final SubLString $str78$_script_type__text_javascript____;
  private static final SubLString $str79$__;
  private static final SubLSymbol $sym80$TO_STRING;
  private static final SubLString $str81$___;
  private static final SubLString $str82$__;
  private static final SubLString $str83$p_;
  private static final SubLSymbol $sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE;
  private static final SubLString $str85$solid_gray_;
  private static final SubLString $str86$px;
  private static final SubLString $str87$_style_type__text_css_______probl;
  private static final SubLString $str88$px__background___000000_______pro;
  private static final SubLString $str89$px__height__;
  private static final SubLString $str90$px__border__;
  private static final SubLString $str91$__font_family__courier__fixed__wh;
  private static final SubLString $str92$px__font_family__courier__fixed__;
  private static final SubLSymbol $sym93$_HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE_CACHING_STATE_;
  private static final SubLString $str94$_style_type__text_css_____body_x_;
  private static final SubLSymbol $kw95$STRATEGY;
  private static final SubLString $str96$unexpected_visualization_scheme__;
  private static final SubLString $str97$problem_none;
  private static final SubLString $str98$problem_invalid;
  private static final SubLString $str99$problem_future;
  private static final SubLString $str100$problem_root;
  private static final SubLSymbol $kw101$TACTICAL;
  private static final SubLString $str102$problem_good;
  private static final SubLString $str103$problem_neutral;
  private static final SubLString $str104$problem_no_good;
  private static final SubLString $str105$_path;
  private static final SubLString $str106$_focus;
  private static final SubLString $str107$problem_new_root;
  private static final SubLString $str108$problem_transformation;
  private static final SubLString $str109$problem_removal;
  private static final SubLString $str110$problem_unmotivated;
  private static final SubLString $str111$_Visualize_;
  private static final SubLSymbol $kw112$SELF;
  private static final SubLString $str113$cb_visualize_problems__A__A__A__A;
  private static final SubLSymbol $kw114$VISUALIZE_PROBLEMS;
  private static final SubLSymbol $sym115$CB_LINK_VISUALIZE_PROBLEMS;
  private static final SubLList $list116;
  private static final SubLString $str117$_A_did_not_specify_a_problem_stor;
  private static final SubLSymbol $sym118$CB_VISUALIZE_PROBLEMS;
  private static final SubLSymbol $kw119$HTML_HANDLER;
  private static final SubLInteger $int120$100000;
  private static final SubLInteger $int121$50000;
  private static final SubLInteger $int122$24000;
  private static final SubLInteger $int123$12000;
  private static final SubLInteger $int124$5000;
  private static final SubLInteger $int125$2000;
  private static final SubLInteger $int126$1000;
  private static final SubLInteger $int127$500;
  private static final SubLInteger $int128$32;
  private static final SubLInteger $int129$40;
  private static final SubLList $list130;
  private static final SubLString $str131$;
  private static final SubLList $list132;
  private static final SubLString $str133$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str134$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw135$UNINITIALIZED;
  private static final SubLSymbol $kw136$CB_CYC;
  private static final SubLString $str137$Problem_Store_;
  private static final SubLString $str138$_Visualization;
  private static final SubLString $str139$visControls;
  private static final SubLString $str140$_Most_Recent_;
  private static final SubLString $str141$Refresh___;
  private static final SubLString $str142$_Now_;
  private static final SubLString $str143$_Auto_;
  private static final SubLString $str144$_Halt_;
  private static final SubLString $str145$Zoom__;
  private static final SubLString $str146$Sequence__;
  private static final SubLString $str147$Begin;
  private static final SubLString $str148$_1000;
  private static final SubLInteger $int149$100;
  private static final SubLString $str150$_100;
  private static final SubLString $str151$_10;
  private static final SubLString $str152$_1;
  private static final SubLString $str153$_1;
  private static final SubLString $str154$_10;
  private static final SubLString $str155$_100;
  private static final SubLString $str156$_1000;
  private static final SubLString $str157$End;
  private static final SubLSymbol $kw158$TERSE;
  private static final SubLString $str159$Percent__;
  private static final SubLString $str160$problemStoreVisualizations;
  private static final SubLString $str161$_D_concurrent_CB_VISUALIZE_PROBLE;
  private static final SubLSymbol $sym162$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list163;
  private static final SubLString $str164$Error_for_args__S_____S;
  private static final SubLSymbol $sym165$CB_VISUALIZE_PROBLEMS_FOR_MONITOR;
  private static final SubLSymbol $kw166$LATEST_INFERENCE;
  private static final SubLString $str167$_A__A_did_not_specify_a_problem_s;
  private static final SubLString $str168$overflow_hidden_;
  private static final SubLString $str169$Visualizing_new_problem_store__S;
  private static final SubLInteger $int170$25;
  private static final SubLString $str171$Jumped_problem_end_from__A_to__A_;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$NOTIFY_VISUALIZING_PROBLEM_STORE;
  private static final SubLString $str174$__Visualizing_problem_store__;
  private static final SubLSymbol $sym175$_NOTIFY_VISUALIZING_PROBLEM_STORE_CACHING_STATE_;
  private static final SubLSymbol $sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR;
  private static final SubLString $str177$Given_layout_of__Dx_D__optimum_ce;
  private static final SubLSymbol $sym178$_COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR_CACHING_STATE_;
  private static final SubLSymbol $sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE;
  private static final SubLFloat $float180$1_5;
  private static final SubLString $str181$_style_type__text_css______proble;
  private static final SubLString $str182$px__margin_top__;
  private static final SubLString $str183$px__opacity___75_____table_proble;
  private static final SubLString $str184$px__height___;
  private static final SubLString $str185$______td_none______border_color__;
  private static final SubLString $str186$Layout__Dx_D_____A;
  private static final SubLSymbol $sym187$_HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE_CACHIN;
  private static final SubLSymbol $sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_;
  private static final SubLSymbol $kw189$NEWEST;

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject problem_layout_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject problem_layout_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $problem_layout_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_problem_store(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_min_x(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_max_x(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_min_y(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_max_y(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_grid(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_next_problem_id(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_problem_x_table(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject prob_layout_problem_y_table(final SubLObject v_object)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_problem_store(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_min_x(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_max_x(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_min_y(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_max_y(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_grid(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_next_problem_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_problem_x_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject _csetf_prob_layout_problem_y_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != problem_layout_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject make_problem_layout(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $problem_layout_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw27$PROBLEM_STORE ) )
      {
        _csetf_prob_layout_problem_store( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$MIN_X ) )
      {
        _csetf_prob_layout_min_x( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$MAX_X ) )
      {
        _csetf_prob_layout_max_x( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$MIN_Y ) )
      {
        _csetf_prob_layout_min_y( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$MAX_Y ) )
      {
        _csetf_prob_layout_max_y( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$GRID ) )
      {
        _csetf_prob_layout_grid( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$NEXT_PROBLEM_ID ) )
      {
        _csetf_prob_layout_next_problem_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$PROBLEM_X_TABLE ) )
      {
        _csetf_prob_layout_problem_x_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$PROBLEM_Y_TABLE ) )
      {
        _csetf_prob_layout_problem_y_table( v_new, current_value );
      }
      else
      {
        Errors.error( $str36$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject visit_defstruct_problem_layout(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw37$BEGIN, $sym38$MAKE_PROBLEM_LAYOUT, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw27$PROBLEM_STORE, prob_layout_problem_store( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw28$MIN_X, prob_layout_min_x( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw29$MAX_X, prob_layout_max_x( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw30$MIN_Y, prob_layout_min_y( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw31$MAX_Y, prob_layout_max_y( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw32$GRID, prob_layout_grid( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw33$NEXT_PROBLEM_ID, prob_layout_next_problem_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw34$PROBLEM_X_TABLE, prob_layout_problem_x_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw35$PROBLEM_Y_TABLE, prob_layout_problem_y_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$END, $sym38$MAKE_PROBLEM_LAYOUT, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
  public static SubLObject visit_defstruct_object_problem_layout_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_problem_layout( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 1399L)
  public static SubLObject new_problem_layout(final SubLObject problem_store)
  {
    assert NIL != inference_datastructures_problem_store.problem_store_p( problem_store ) : problem_store;
    final SubLObject layout = make_problem_layout( UNPROVIDED );
    _csetf_prob_layout_problem_store( layout, problem_store );
    _csetf_prob_layout_min_x( layout, ZERO_INTEGER );
    _csetf_prob_layout_max_x( layout, ZERO_INTEGER );
    _csetf_prob_layout_min_y( layout, ZERO_INTEGER );
    _csetf_prob_layout_max_y( layout, ZERO_INTEGER );
    _csetf_prob_layout_grid( layout, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_layout_next_problem_id( layout, ZERO_INTEGER );
    _csetf_prob_layout_problem_x_table( layout, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    _csetf_prob_layout_problem_y_table( layout, dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED ) );
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2027L)
  public static SubLObject destroy_problem_layout(final SubLObject layout)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    _csetf_prob_layout_problem_store( layout, $kw43$FREE );
    dictionary.clear_dictionary( prob_layout_grid( layout ) );
    _csetf_prob_layout_grid( layout, NIL );
    dictionary.clear_dictionary( prob_layout_problem_x_table( layout ) );
    _csetf_prob_layout_problem_x_table( layout, NIL );
    dictionary.clear_dictionary( prob_layout_problem_y_table( layout ) );
    _csetf_prob_layout_problem_y_table( layout, NIL );
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2523L)
  public static SubLObject problem_layout_store(final SubLObject layout)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    return prob_layout_problem_store( layout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2665L)
  public static SubLObject problem_layout_next_problem_id(final SubLObject layout)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    return prob_layout_next_problem_id( layout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2807L)
  public static SubLObject problem_layout_problem_store(final SubLObject layout)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    return prob_layout_problem_store( layout );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2945L)
  public static SubLObject problem_layout_x_lookup(final SubLObject layout, final SubLObject problem)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return dictionary.dictionary_lookup( prob_layout_problem_x_table( layout ), problem, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3163L)
  public static SubLObject problem_layout_y_lookup(final SubLObject layout, final SubLObject problem)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    return dictionary.dictionary_lookup( prob_layout_problem_y_table( layout ), problem, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3367L)
  public static SubLObject problem_layout_grid_lookup(final SubLObject layout, final SubLObject x, final SubLObject y)
  {
    final SubLObject grid_x_layer = prob_layout_grid( layout );
    if( NIL != grid_x_layer )
    {
      final SubLObject grid_y_layer = dictionary.dictionary_lookup_without_values( grid_x_layer, x, UNPROVIDED );
      if( NIL != grid_y_layer )
      {
        final SubLObject problem = dictionary.dictionary_lookup_without_values( grid_y_layer, y, UNPROVIDED );
        return problem;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3695L)
  public static SubLObject update_problem_layout(final SubLObject layout)
  {
    assert NIL != problem_layout_p( layout ) : layout;
    final SubLObject store = problem_layout_problem_store( layout );
    final SubLObject start_id = problem_layout_next_problem_id( layout );
    SubLObject end_var;
    SubLObject end_id;
    SubLObject id;
    SubLObject problem;
    for( end_id = ( end_var = inference_datastructures_problem_store.problem_store_historical_problem_count( store ) ), id = NIL, id = start_id; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
    {
      problem = inference_datastructures_problem_store.find_problem_by_id( store, id );
      if( NIL != inference_datastructures_problem.problem_p( problem ) )
      {
        problem_layout_add( layout, problem );
      }
    }
    _csetf_prob_layout_next_problem_id( layout, end_id );
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 4205L)
  public static SubLObject problem_layout_add(final SubLObject layout, final SubLObject problem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != problem_layout_p( layout ) : layout;
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    final SubLObject parent_problem = earliest_dependent_problem( problem );
    final SubLObject parent_x = ( NIL != parent_problem ) ? problem_layout_x_lookup( layout, parent_problem ) : ZERO_INTEGER;
    final SubLObject parent_y = ( NIL != parent_problem ) ? problem_layout_y_lookup( layout, parent_problem ) : ZERO_INTEGER;
    if( NIL != parent_x && NIL != parent_y )
    {
      thread.resetMultipleValues();
      final SubLObject x = problem_layout_compute_add_location( layout, parent_x, parent_y );
      final SubLObject y = thread.secondMultipleValue();
      thread.resetMultipleValues();
      problem_layout_add_to_grid( layout, x, y, problem );
    }
    else
    {
      Errors.warn( $str45$unable_to_add_to_layout__S, problem );
    }
    return problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 4814L)
  public static SubLObject problem_layout_add_to_grid(final SubLObject layout, final SubLObject x, final SubLObject y, final SubLObject problem)
  {
    dictionary.dictionary_enter( prob_layout_problem_x_table( layout ), problem, x );
    dictionary.dictionary_enter( prob_layout_problem_y_table( layout ), problem, y );
    final SubLObject grid_x_layer = prob_layout_grid( layout );
    SubLObject grid_y_layer = dictionary.dictionary_lookup( grid_x_layer, x, UNPROVIDED );
    if( NIL == dictionary.dictionary_p( grid_y_layer ) )
    {
      grid_y_layer = dictionary.new_dictionary( Symbols.symbol_function( EQ ), UNPROVIDED );
      dictionary.dictionary_enter( grid_x_layer, x, grid_y_layer );
    }
    dictionary.dictionary_enter( grid_y_layer, y, problem );
    _csetf_prob_layout_min_x( layout, Numbers.min( x, prob_layout_min_x( layout ) ) );
    _csetf_prob_layout_max_x( layout, Numbers.max( x, prob_layout_max_x( layout ) ) );
    _csetf_prob_layout_min_y( layout, Numbers.min( y, prob_layout_min_y( layout ) ) );
    _csetf_prob_layout_max_y( layout, Numbers.max( y, prob_layout_max_y( layout ) ) );
    _csetf_prob_layout_next_problem_id( layout, number_utilities.f_1X( inference_datastructures_problem.problem_suid( problem ) ) );
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 5689L)
  public static SubLObject problem_layout_compute_add_location(final SubLObject layout, final SubLObject parent_x, final SubLObject parent_y)
  {
    final SubLObject octants = octant_preference_order( parent_x, parent_y );
    SubLObject candidate_x = NIL;
    SubLObject candidate_y = NIL;
    SubLObject octant_location = NIL;
    octant_location = ZERO_INTEGER;
    Block_10: while ( true)
    {
      final SubLObject delta_x = octant_location_delta_x( octant_location );
      final SubLObject delta_y = octant_location_delta_y( octant_location );
      SubLObject cdolist_list_var = octants;
      SubLObject octant = NIL;
      octant = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        candidate_x = parent_x;
        candidate_y = parent_y;
        final SubLObject pcase_var = octant;
        if( pcase_var.eql( ZERO_INTEGER ) )
        {
          candidate_x = Numbers.add( candidate_x, delta_x );
          candidate_y = Numbers.add( candidate_y, delta_y );
        }
        else if( pcase_var.eql( ONE_INTEGER ) )
        {
          candidate_x = Numbers.add( candidate_x, delta_y );
          candidate_y = Numbers.add( candidate_y, delta_x );
        }
        else if( pcase_var.eql( TWO_INTEGER ) )
        {
          candidate_x = Numbers.subtract( candidate_x, delta_y );
          candidate_y = Numbers.add( candidate_y, delta_x );
        }
        else if( pcase_var.eql( THREE_INTEGER ) )
        {
          candidate_x = Numbers.subtract( candidate_x, delta_x );
          candidate_y = Numbers.add( candidate_y, delta_y );
        }
        else if( pcase_var.eql( FOUR_INTEGER ) )
        {
          candidate_x = Numbers.subtract( candidate_x, delta_x );
          candidate_y = Numbers.subtract( candidate_y, delta_y );
        }
        else if( pcase_var.eql( FIVE_INTEGER ) )
        {
          candidate_x = Numbers.subtract( candidate_x, delta_y );
          candidate_y = Numbers.subtract( candidate_y, delta_x );
        }
        else if( pcase_var.eql( SIX_INTEGER ) )
        {
          candidate_x = Numbers.add( candidate_x, delta_y );
          candidate_y = Numbers.subtract( candidate_y, delta_x );
        }
        else if( pcase_var.eql( SEVEN_INTEGER ) )
        {
          candidate_x = Numbers.add( candidate_x, delta_x );
          candidate_y = Numbers.subtract( candidate_y, delta_y );
        }
        if( NIL == problem_layout_grid_lookup( layout, candidate_x, candidate_y ) )
        {
          break Block_10;
        }
        cdolist_list_var = cdolist_list_var.rest();
        octant = cdolist_list_var.first();
      }
      octant_location = number_utilities.f_1X( octant_location );
    }
    return Values.values( candidate_x, candidate_y );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 6864L)
  public static SubLObject octant_preference_order(final SubLObject x, final SubLObject y)
  {
    return $list46;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7008L)
  public static SubLObject initialize_octant_locations()
  {
    SubLObject octant_locations = NIL;
    SubLObject end_var;
    SubLObject x;
    SubLObject end_var_$1;
    SubLObject y;
    for( end_var = Numbers.integerDivide( $int48$316, TWO_INTEGER ), x = NIL, x = ZERO_INTEGER; !x.numGE( end_var ); x = number_utilities.f_1X( x ) )
    {
      for( end_var_$1 = number_utilities.f_1X( x ), y = NIL, y = ZERO_INTEGER; !y.numGE( end_var_$1 ); y = number_utilities.f_1X( y ) )
      {
        octant_locations = ConsesLow.cons( ConsesLow.list( x, y ), octant_locations );
      }
    }
    octant_locations = Sort.stable_sort( octant_locations, $sym49$OCTANT_LOCATION__, UNPROVIDED );
    $octant_locations$.setGlobalValue( Functions.apply( Symbols.symbol_function( $sym50$VECTOR ), octant_locations ) );
    return Sequences.length( $octant_locations$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7414L)
  public static SubLObject octant_location_L(final SubLObject ol_1, final SubLObject ol_2)
  {
    SubLObject x_1 = NIL;
    SubLObject y_1 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( ol_1, ol_1, $list51 );
    x_1 = ol_1.first();
    SubLObject current = ol_1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, ol_1, $list51 );
    y_1 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject x_2 = NIL;
      SubLObject y_2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( ol_2, ol_2, $list52 );
      x_2 = ol_2.first();
      SubLObject current_$3 = ol_2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$3, ol_2, $list52 );
      y_2 = current_$3.first();
      current_$3 = current_$3.rest();
      if( NIL == current_$3 )
      {
        return Numbers.numL( Numbers.add( Numbers.multiply( x_1, x_1 ), Numbers.multiply( y_1, y_1 ) ), Numbers.add( Numbers.multiply( x_2, x_2 ), Numbers.multiply( y_2, y_2 ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( ol_2, $list52 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( ol_1, $list51 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7629L)
  public static SubLObject octant_location_delta_x(final SubLObject octant_location)
  {
    if( NIL == $octant_locations$.getGlobalValue() )
    {
      initialize_octant_locations();
    }
    return Vectors.aref( $octant_locations$.getGlobalValue(), octant_location ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7812L)
  public static SubLObject octant_location_delta_y(final SubLObject octant_location)
  {
    if( NIL == $octant_locations$.getGlobalValue() )
    {
      initialize_octant_locations();
    }
    return conses_high.second( Vectors.aref( $octant_locations$.getGlobalValue(), octant_location ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7996L)
  public static SubLObject earliest_dependent_problem(final SubLObject problem)
  {
    SubLObject earliest_id = inference_datastructures_problem.problem_suid( problem );
    SubLObject earliest_problem = NIL;
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject link;
    SubLObject parent_problem;
    SubLObject parent_id;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, link ) )
      {
        parent_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
        if( NIL != parent_problem )
        {
          parent_id = inference_datastructures_problem.problem_suid( parent_problem );
          if( parent_id.numL( earliest_id ) )
          {
            earliest_id = parent_id;
            earliest_problem = parent_problem;
          }
        }
      }
    }
    return earliest_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8501L)
  public static SubLObject problem_store_most_recent_problem(final SubLObject store)
  {
    SubLObject end_var;
    SubLObject id;
    SubLObject problem;
    for( end_var = MINUS_ONE_INTEGER, id = NIL, id = inference_datastructures_problem_store.problem_store_historical_problem_count( store ); !id.numLE( end_var ); id = Numbers.add( id, MINUS_ONE_INTEGER ) )
    {
      problem = inference_datastructures_problem_store.find_problem_by_id( store, id );
      if( NIL != problem )
      {
        return problem;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8742L)
  public static SubLObject all_problem_ancestor_problems(final SubLObject problem)
  {
    return all_problem_ancestor_problems_recursive( problem, set_contents.new_set_contents( ZERO_INTEGER, Symbols.symbol_function( EQ ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8887L)
  public static SubLObject all_problem_ancestor_problems_recursive(final SubLObject problem, SubLObject ancestor_set)
  {
    if( NIL == set_contents.set_contents_memberP( problem, ancestor_set, Symbols.symbol_function( EQ ) ) )
    {
      ancestor_set = set_contents.set_contents_add( problem, ancestor_set, UNPROVIDED );
      final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
      SubLObject basis_object;
      SubLObject state;
      SubLObject link;
      SubLObject ancestor_problem;
      for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
          .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
      {
        link = set_contents.do_set_contents_next( basis_object, state );
        if( NIL != set_contents.do_set_contents_element_validP( state, link ) )
        {
          ancestor_problem = inference_datastructures_problem_link.problem_link_supported_problem( link );
          if( NIL != ancestor_problem )
          {
            ancestor_set = all_problem_ancestor_problems_recursive( ancestor_problem, ancestor_set );
          }
        }
      }
    }
    return ancestor_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9357L)
  public static SubLObject problem_oldest_ancestor_path(final SubLObject problem)
  {
    return problem_oldest_ancestor_path_recursive( problem, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9478L)
  public static SubLObject problem_oldest_ancestor_path_recursive(final SubLObject problem, SubLObject ancestor_path)
  {
    if( NIL != list_utilities.member_eqP( problem, ancestor_path ) )
    {
      return ancestor_path;
    }
    ancestor_path = ConsesLow.cons( problem, ancestor_path );
    final SubLObject oldest_parent_problem = problem_oldest_parent_problem( problem );
    if( NIL == oldest_parent_problem )
    {
      return ancestor_path;
    }
    return problem_oldest_ancestor_path_recursive( oldest_parent_problem, ancestor_path );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9873L)
  public static SubLObject problem_oldest_parent_problem(final SubLObject problem)
  {
    final SubLObject parent_problems = inference_datastructures_problem.problem_supported_problems( problem );
    final SubLObject oldest_parent_problem = list_utilities.extremal( parent_problems, Symbols.symbol_function( $sym53$_ ), Symbols.symbol_function( $sym54$PROBLEM_SUID ) );
    if( NIL != oldest_parent_problem && inference_datastructures_problem.problem_suid( oldest_parent_problem ).numL( inference_datastructures_problem.problem_suid( problem ) ) )
    {
      return oldest_parent_problem;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10433L)
  public static SubLObject problem_oldest_link_to_parent(final SubLObject problem, final SubLObject parent)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    SubLObject links = NIL;
    final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links( problem );
    SubLObject basis_object;
    SubLObject state;
    SubLObject link;
    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object, set_contents_var ); NIL == set_contents
        .do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
    {
      link = set_contents.do_set_contents_next( basis_object, state );
      if( NIL != set_contents.do_set_contents_element_validP( state, link ) && parent.eql( inference_datastructures_problem_link.problem_link_supported_object( link ) ) )
      {
        links = ConsesLow.cons( link, links );
      }
    }
    return list_utilities.extremal( links, Symbols.symbol_function( $sym53$_ ), Symbols.symbol_function( $sym55$PROBLEM_LINK_SUID ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10737L)
  public static SubLObject problem_proof_count_rectangle(final SubLObject problem)
  {
    return squarest_rectangle_for_integer_area( inference_datastructures_problem.problem_proof_count( problem, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10865L)
  public static SubLObject squarest_rectangle_for_integer_area(final SubLObject area)
  {
    assert NIL != subl_promotions.non_negative_integer_p( area ) : area;
    SubLObject height;
    SubLObject width = height = Numbers.isqrt( area );
    if( !area.numLE( Numbers.multiply( width, height ) ) )
    {
      width = Numbers.add( width, ONE_INTEGER );
    }
    if( !area.numLE( Numbers.multiply( width, height ) ) )
    {
      height = Numbers.add( height, ONE_INTEGER );
    }
    return Values.values( width, height );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 11172L)
  public static SubLObject html_problem_layout_visualization_table(final SubLObject layout, SubLObject size, SubLObject problem_end, SubLObject table_style, SubLObject scheme)
  {
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( problem_end == UNPROVIDED )
    {
      problem_end = NIL;
    }
    if( table_style == UNPROVIDED )
    {
      table_style = NIL;
    }
    if( scheme == UNPROVIDED )
    {
      scheme = $kw57$GOODNESS;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == size )
    {
      size = EIGHT_INTEGER;
    }
    final SubLObject store = problem_layout_store( layout );
    final SubLObject grid_id = Sequences.cconcatenate( $str58$ps_, new SubLObject[] { format_nil.format_nil_a_no_copy( inference_datastructures_problem_store.problem_store_suid( store ) ), $str59$_, format_nil
        .format_nil_a_no_copy( scheme )
    } );
    final SubLObject most_recent_problem = problem_end.isNegative() ? problem_store_most_recent_problem( store ) : inference_datastructures_problem_store.find_problem_by_id( store, number_utilities.f_1_( problem_end ) );
    final SubLObject ancestor_path = ( NIL != most_recent_problem ) ? problem_oldest_ancestor_path( most_recent_problem ) : NIL;
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), table_style );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str60$problemGrid );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != grid_id )
    {
      html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( grid_id );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject x_start = prob_layout_min_x( layout );
      final SubLObject x_end = number_utilities.f_1X( prob_layout_max_x( layout ) );
      final SubLObject y_start = prob_layout_max_y( layout );
      SubLObject end_var;
      SubLObject y_end;
      SubLObject y;
      SubLObject _prev_bind_0_$4;
      SubLObject end_var_$5;
      SubLObject x;
      SubLObject problem;
      SubLObject id;
      SubLObject v_class;
      SubLObject _prev_bind_0_$5;
      for( y_end = ( end_var = number_utilities.f_1_( prob_layout_min_y( layout ) ) ), y = NIL, y = y_start; !y.numLE( end_var ); y = Numbers.add( y, MINUS_ONE_INTEGER ) )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( $kw61$CENTER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          for( end_var_$5 = x_end, x = NIL, x = x_start; !x.numGE( end_var_$5 ); x = number_utilities.f_1X( x ) )
          {
            problem = problem_layout_grid_lookup( layout, x, y );
            id = html_problem_layout_id( problem, scheme );
            v_class = html_problem_layout_class( scheme, problem, most_recent_problem, ancestor_path, problem_end );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            if( NIL != id )
            {
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( id );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            if( NIL != v_class )
            {
              html_utilities.html_markup( html_macros.$html_attribute_class$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( v_class );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              if( NIL != problem )
              {
                if( size.numGE( TWENTY_INTEGER ) )
                {
                  cb_utilities.cb_link( $kw62$PROBLEM, problem, $kw63$MINIMAL, NIL, inference_datastructures_problem.problem_suid( problem ), UNPROVIDED );
                }
                else if( size.numGE( SIXTEEN_INTEGER ) )
                {
                  cb_utilities.cb_link( $kw62$PROBLEM, problem, $kw63$MINIMAL, NIL, $str64$_, UNPROVIDED );
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
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
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 12978L)
  public static SubLObject html_problem_layout_visualization_animation_controls(final SubLObject layout, final SubLObject schemes, SubLObject last_available_problem_id)
  {
    if( last_available_problem_id == UNPROVIDED )
    {
      last_available_problem_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = html_problem_layout_visualization_slider_ids( layout );
    SubLObject slider_id = NIL;
    SubLObject slider_field_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    slider_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    slider_field_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      cyc_file_dependencies.javascript( $kw66$EXT_ALL );
      cyc_file_dependencies.javascript( $kw67$RAPHAEL );
      SubLObject parent_id_json = NIL;
      final SubLObject store = problem_layout_store( layout );
      SubLObject s = NIL;
      try
      {
        s = streams_high.make_private_string_output_stream();
        print_high.princ( $str68$_, s );
        SubLObject end_var;
        SubLObject problem_id;
        SubLObject oldest_problem;
        SubLObject oldest_id;
        for( end_var = last_available_problem_id, problem_id = NIL, problem_id = ZERO_INTEGER; !problem_id.numGE( end_var ); problem_id = number_utilities.f_1X( problem_id ) )
        {
          oldest_problem = problem_oldest_parent_problem( inference_datastructures_problem_store.find_problem_by_id( store, problem_id ) );
          oldest_id = ( NIL != oldest_problem ) ? inference_datastructures_problem.problem_suid( oldest_problem ) : $str69$null;
          print_high.princ( oldest_id, s );
          print_high.princ( $str70$_, s );
        }
        print_high.princ( $str71$_, s );
        parent_id_json = streams_high.get_output_stream_string( s );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( s, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str72$_script_type__text_javascript____, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid( store ), parent_id_json,
        number_utilities.f_1_( last_available_problem_id )
      } );
      html_utilities.html_markup( html_problem_layout_visualization_scripts( layout, schemes, slider_id, slider_field_id, last_available_problem_id ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 14142L)
  public static SubLObject html_problem_layout_visualization_animation_controls_placeholder(final SubLObject layout)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = html_problem_layout_visualization_slider_ids( layout );
    SubLObject slider_id = NIL;
    SubLObject slider_field_id = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    slider_id = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    slider_field_id = current.first();
    current = current.rest();
    if( NIL == current )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str73$_style_type__text_css_______A_tab, new SubLObject[] { slider_id, slider_field_id, slider_field_id
      } );
      html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_div_style$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( $str74$height_1_5em );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
          if( NIL != slider_id )
          {
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( slider_id );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          }
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_span_head$.getGlobalValue() );
        if( NIL != slider_field_id )
        {
          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( slider_field_id );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
        }
        html_utilities.html_markup( html_macros.$html_span_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
      return NIL;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 14745L)
  public static SubLObject html_problem_layout_visualization_slider_ids(final SubLObject layout)
  {
    final SubLObject slider_id = Sequences.cconcatenate( $str75$ps, new SubLObject[] { format_nil.format_nil_s_no_copy( inference_datastructures_problem_store.problem_store_suid( problem_layout_problem_store(
        layout ) ) ), $str76$_slider
    } );
    final SubLObject slider_field_id = Sequences.cconcatenate( $str75$ps, new SubLObject[] { format_nil.format_nil_s_no_copy( inference_datastructures_problem_store.problem_store_suid( problem_layout_problem_store(
        layout ) ) ), $str77$_slider_field
    } );
    return ConsesLow.list( slider_id, slider_field_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 21982L)
  public static SubLObject html_problem_layout_visualization_scripts(final SubLObject layout, final SubLObject schemes, final SubLObject slider_id, final SubLObject slider_field_id, SubLObject last_available_problem)
  {
    if( last_available_problem == UNPROVIDED )
    {
      last_available_problem = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject scheme_json = Sequences.cconcatenate( $str79$__, new SubLObject[] { format_nil.format_nil_a_no_copy( string_utilities.bunge_with_string( Mapping.mapcar( $sym80$TO_STRING, schemes ), $str81$___ ) ),
      $str82$__
    } );
    final SubLObject last_visible_problem_id = ( NIL != number_utilities.f_1_( last_available_problem ) ) ? number_utilities.f_1_( last_available_problem )
        : number_utilities.f_1_( inference_datastructures_problem_store.problem_store_problem_count( problem_layout_problem_store( layout ) ) );
    final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid( problem_layout_problem_store( layout ) );
    return PrintLow.format( NIL, $html_problem_layout_visualization_script_template$.getDynamicValue( thread ), new SubLObject[] { last_visible_problem_id, scheme_json, problem_store_id, slider_id, slider_field_id
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22637L)
  public static SubLObject html_problem_layout_id(final SubLObject problem, final SubLObject scheme)
  {
    if( NIL != problem )
    {
      return Sequences.cconcatenate( $str83$p_, new SubLObject[] { format_nil.format_nil_a_no_copy( inference_datastructures_problem_store.problem_store_suid( inference_datastructures_problem.problem_store(
          problem ) ) ), $str59$_, format_nil.format_nil_a_no_copy( inference_datastructures_problem.problem_suid( problem ) ), $str59$_, format_nil.format_nil_a_no_copy( string_utilities.to_string( scheme ) )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
  public static SubLObject clear_html_problem_layout_visualization_table_style()
  {
    final SubLObject cs = $html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
  public static SubLObject remove_html_problem_layout_visualization_table_style(final SubLObject size)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $html_problem_layout_visualization_table_style_caching_state$.getGlobalValue(), ConsesLow.list( size ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
  public static SubLObject html_problem_layout_visualization_table_style_internal(final SubLObject size)
  {
    final SubLObject td_border_width = size.numG( FIVE_INTEGER ) ? ONE_INTEGER : ZERO_INTEGER;
    final SubLObject td_border = Sequences.cconcatenate( $str85$solid_gray_, new SubLObject[] { format_nil.format_nil_d_no_copy( td_border_width ), $str86$px
    } );
    return Sequences.cconcatenate( $str87$_style_type__text_css_______probl, new SubLObject[] { format_nil.format_nil_a_no_copy( Numbers.min( TWO_INTEGER, Numbers.integerDivide( size, EIGHT_INTEGER ) ) ),
      $str88$px__background___000000_______pro, format_nil.format_nil_a_no_copy( size ), $str89$px__height__, format_nil.format_nil_a_no_copy( size ), $str90$px__border__, format_nil.format_nil_a_no_copy( td_border ),
      $str91$__font_family__courier__fixed__wh, format_nil.format_nil_a_no_copy( size ), $str89$px__height__, format_nil.format_nil_a_no_copy( size ), $str92$px__font_family__courier__fixed__
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
  public static SubLObject html_problem_layout_visualization_table_style(final SubLObject size)
  {
    SubLObject caching_state = $html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE, $sym93$_HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE_CACHING_STATE_, SIXTEEN_INTEGER,
          EQL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, size, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_problem_layout_visualization_table_style_internal( size ) ) );
      memoization_state.caching_state_put( caching_state, size, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25147L)
  public static SubLObject html_problem_layout_visualization_page_css()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str94$_style_type__text_css_____body_x_ );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25382L)
  public static SubLObject html_problem_layout_class(final SubLObject scheme, final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end)
  {
    if( scheme.eql( $kw57$GOODNESS ) )
    {
      return html_problem_layout_class_by_goodness( problem, most_recent_problem, ancestor_path, problem_end );
    }
    if( scheme.eql( $kw95$STRATEGY ) )
    {
      return html_problem_layout_class_by_strategy( problem, most_recent_problem, ancestor_path, problem_end );
    }
    return Errors.error( $str96$unexpected_visualization_scheme__, scheme );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25915L)
  public static SubLObject html_problem_layout_class_by_goodness(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end)
  {
    SubLObject v_class = NIL;
    if( NIL == problem )
    {
      v_class = $str97$problem_none;
    }
    else if( NIL == inference_datastructures_problem.valid_problem_p( problem ) )
    {
      v_class = $str98$problem_invalid;
    }
    else if( problem_end.isInteger() && !problem_end.isNegative() && !inference_datastructures_problem.problem_suid( problem ).numL( problem_end ) )
    {
      v_class = $str99$problem_future;
    }
    else if( NIL != inference_datastructures_problem.problem_has_answer_link_p( problem ) )
    {
      v_class = $str100$problem_root;
    }
    else if( NIL != inference_worker.good_problem_p( problem, $kw101$TACTICAL ) )
    {
      v_class = $str102$problem_good;
    }
    else if( NIL != inference_worker.neutral_problem_p( problem, $kw101$TACTICAL ) )
    {
      v_class = $str103$problem_neutral;
    }
    else
    {
      v_class = $str104$problem_no_good;
    }
    if( NIL != list_utilities.member_eqP( problem, ancestor_path ) )
    {
      v_class = Sequences.cconcatenate( v_class, $str105$_path );
    }
    if( NIL != most_recent_problem && problem.eql( most_recent_problem ) )
    {
      v_class = Sequences.cconcatenate( v_class, $str106$_focus );
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 26912L)
  public static SubLObject html_problem_layout_class_by_strategy(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end)
  {
    SubLObject v_class = NIL;
    if( NIL == problem )
    {
      v_class = $str97$problem_none;
    }
    else if( NIL == inference_datastructures_problem.valid_problem_p( problem ) )
    {
      v_class = $str98$problem_invalid;
    }
    else if( problem_end.isInteger() && !problem_end.isNegative() && !inference_datastructures_problem.problem_suid( problem ).numL( problem_end ) )
    {
      v_class = $str99$problem_future;
    }
    else if( NIL != inference_datastructures_problem.problem_has_answer_link_p( problem ) )
    {
      v_class = $str100$problem_root;
    }
    else if( NIL != inference_worker.problem_has_any_new_root_motivationP( problem ) )
    {
      v_class = $str107$problem_new_root;
    }
    else if( NIL != inference_worker.problem_has_any_transformation_motivationP( problem ) )
    {
      v_class = $str108$problem_transformation;
    }
    else if( NIL != inference_worker.problem_has_any_removal_motivationP( problem ) )
    {
      v_class = $str109$problem_removal;
    }
    else
    {
      v_class = $str110$problem_unmotivated;
    }
    if( NIL != list_utilities.member_eqP( problem, ancestor_path ) )
    {
      v_class = Sequences.cconcatenate( v_class, $str105$_path );
    }
    if( problem.eql( most_recent_problem ) )
    {
      v_class = Sequences.cconcatenate( v_class, $str106$_focus );
    }
    return v_class;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 28034L)
  public static SubLObject cb_link_visualize_problems(final SubLObject store, SubLObject linktext, SubLObject refresh_rate, SubLObject size, SubLObject problem_end)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( refresh_rate == UNPROVIDED )
    {
      refresh_rate = NIL;
    }
    if( size == UNPROVIDED )
    {
      size = NIL;
    }
    if( problem_end == UNPROVIDED )
    {
      problem_end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str111$_Visualize_;
    }
    if( NIL == refresh_rate )
    {
      refresh_rate = MINUS_ONE_INTEGER;
    }
    if( NIL == size )
    {
      size = best_problem_store_visualizer_zoom_level_for_store( store );
    }
    if( NIL == problem_end )
    {
      problem_end = MINUS_ONE_INTEGER;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw112$SELF );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str113$cb_visualize_problems__A__A__A__A, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid( store ), refresh_rate,
      size, problem_end
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 28548L)
  public static SubLObject cb_visualize_problems(final SubLObject args)
  {
    SubLObject store_id_string = NIL;
    SubLObject refresh_string = NIL;
    SubLObject size_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( args, args, $list116 );
    store_id_string = args.first();
    SubLObject current = args.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list116 );
    refresh_string = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, args, $list116 );
    size_string = current.first();
    current = current.rest();
    final SubLObject problem_end_string = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, args, $list116 );
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( args, $list116 );
      return NIL;
    }
    final SubLObject store = cb_inference_browser.cb_guess_problem_store( store_id_string );
    if( NIL == inference_datastructures_problem_store.problem_store_p( store ) )
    {
      return cb_utilities.cb_error( $str117$_A_did_not_specify_a_problem_stor, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject refresh_rate = reader.read_from_string_ignoring_errors( refresh_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject size = reader.read_from_string_ignoring_errors( size_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject problem_end = ( NIL != problem_end_string ) ? reader.read_from_string_ignoring_errors( problem_end_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : inference_datastructures_problem_store.problem_store_problem_count( store );
    final SubLObject layout = cb_problem_store_layout( store );
    final SubLObject table_style = html_problem_layout_visualization_table_style( size );
    update_problem_layout( layout );
    return cb_visualize_problems_guts( layout, refresh_rate, size, problem_end, table_style, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 29412L)
  public static SubLObject best_problem_store_visualizer_zoom_level_for_store(final SubLObject store)
  {
    final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count( store );
    if( count.numG( $int120$100000 ) )
    {
      return THREE_INTEGER;
    }
    if( count.numG( $int121$50000 ) )
    {
      return FOUR_INTEGER;
    }
    if( count.numG( $int122$24000 ) )
    {
      return FIVE_INTEGER;
    }
    if( count.numG( $int123$12000 ) )
    {
      return EIGHT_INTEGER;
    }
    if( count.numG( $int124$5000 ) )
    {
      return TEN_INTEGER;
    }
    if( count.numG( $int125$2000 ) )
    {
      return SIXTEEN_INTEGER;
    }
    if( count.numG( $int126$1000 ) )
    {
      return TWENTY_INTEGER;
    }
    if( count.numG( $int127$500 ) )
    {
      return $int128$32;
    }
    return $int129$40;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 29974L)
  public static SubLObject cb_visualize_problems_guts(final SubLObject layout, final SubLObject refresh_rate, final SubLObject size, final SubLObject problem_end, final SubLObject table_style,
      SubLObject suppress_textual_outputP, SubLObject show_copyrightP, SubLObject body_style, SubLObject visualization_schemes)
  {
    if( suppress_textual_outputP == UNPROVIDED )
    {
      suppress_textual_outputP = NIL;
    }
    if( show_copyrightP == UNPROVIDED )
    {
      show_copyrightP = T;
    }
    if( body_style == UNPROVIDED )
    {
      body_style = $str131$;
    }
    if( visualization_schemes == UNPROVIDED )
    {
      visualization_schemes = $list132;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject store = problem_layout_store( layout );
    final SubLObject sequence_max = inference_datastructures_problem_store.problem_store_historical_problem_count( store );
    final SubLObject current_end = problem_end.isNegative() ? sequence_max : problem_end;
    html_utilities.html_markup( $str133$__DOCTYPE_html_PUBLIC_____W3C__DT );
    if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( $str134$_meta_http_equiv__X_UA_Compatible );
    }
    html_utilities.html_source_readability_terpri( UNPROVIDED );
    final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
    try
    {
      cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw135$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
          : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
      html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
      cyc_file_dependencies.css( $kw66$EXT_ALL );
      html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
      html_macros.html_head_content_type();
      cb_parameters.cb_head_shortcut_icon();
      html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
      cyc_file_dependencies.css( $kw136$CB_CYC );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
      html_utilities.html_princ( Sequences.cconcatenate( $str137$Problem_Store_, new SubLObject[] { format_nil.format_nil_a_no_copy( inference_datastructures_problem_store.problem_store_suid( store ) ),
        $str138$_Visualization
      } ) );
      html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
      if( !refresh_rate.isNegative() )
      {
        html_utilities.html_refresh( refresh_rate, UNPROVIDED );
      }
      html_problem_layout_visualization_page_css();
      html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding( thread );
      try
      {
        html_macros.$html_inside_bodyP$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_body_style$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( body_style );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL == suppress_textual_outputP )
          {
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str139$visControls );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( $str137$Problem_Store_ );
              cb_utilities.cb_link( $kw27$PROBLEM_STORE, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( !store.eql( inference_datastructures_problem_store.most_recent_problem_store() ) )
              {
                html_utilities.html_indent( UNPROVIDED );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, inference_datastructures_problem_store.most_recent_problem_store(), $str140$_Most_Recent_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str141$Refresh___ );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str142$_Now_, refresh_rate, size, problem_end );
              html_utilities.html_indent( UNPROVIDED );
              if( refresh_rate.isNegative() )
              {
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str143$_Auto_, FIVE_INTEGER, size, problem_end );
              }
              else
              {
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str144$_Halt_, MINUS_ONE_INTEGER, size, problem_end );
              }
              html_utilities.html_indent( TWO_INTEGER );
              html_utilities.html_princ( $str145$Zoom__ );
              SubLObject cdolist_list_var = $cb_problem_store_default_zoom_levels$.getDynamicValue( thread );
              SubLObject zoom = NIL;
              zoom = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                html_utilities.html_indent( UNPROVIDED );
                if( zoom.numE( size ) )
                {
                  html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                  cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end );
                  html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                }
                else
                {
                  cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end );
                }
                cdolist_list_var = cdolist_list_var.rest();
                zoom = cdolist_list_var.first();
              }
              html_utilities.html_newline( UNPROVIDED );
              html_utilities.html_princ( $str146$Sequence__ );
              html_utilities.html_indent( TWO_INTEGER );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str147$Begin, MINUS_ONE_INTEGER, size, ONE_INTEGER );
              if( sequence_max.numG( $int126$1000 ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str148$_1000, MINUS_ONE_INTEGER, size, Numbers.max( ONE_INTEGER, Numbers.subtract( current_end, $int126$1000 ) ) );
              }
              if( sequence_max.numG( $int149$100 ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str150$_100, MINUS_ONE_INTEGER, size, Numbers.max( ONE_INTEGER, Numbers.subtract( current_end, $int149$100 ) ) );
              }
              if( sequence_max.numG( TEN_INTEGER ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str151$_10, MINUS_ONE_INTEGER, size, Numbers.max( ONE_INTEGER, Numbers.subtract( current_end, TEN_INTEGER ) ) );
              }
              html_utilities.html_indent( ONE_INTEGER );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str152$_1, MINUS_ONE_INTEGER, size, Numbers.max( ONE_INTEGER, Numbers.subtract( current_end, ONE_INTEGER ) ) );
              html_utilities.html_indent( ONE_INTEGER );
              html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, current_end, refresh_rate, size, current_end );
              html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
              html_utilities.html_indent( ONE_INTEGER );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str153$_1, MINUS_ONE_INTEGER, size, Numbers.min( sequence_max, Numbers.add( current_end, ONE_INTEGER ) ) );
              if( sequence_max.numG( TEN_INTEGER ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str154$_10, MINUS_ONE_INTEGER, size, Numbers.min( sequence_max, Numbers.add( current_end, TEN_INTEGER ) ) );
              }
              if( sequence_max.numG( $int149$100 ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str155$_100, MINUS_ONE_INTEGER, size, Numbers.min( sequence_max, Numbers.add( current_end, $int149$100 ) ) );
              }
              if( sequence_max.numG( $int126$1000 ) )
              {
                html_utilities.html_indent( ONE_INTEGER );
                cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str156$_1000, MINUS_ONE_INTEGER, size, Numbers.min( sequence_max, Numbers.add( current_end, $int126$1000 ) ) );
              }
              html_utilities.html_indent( ONE_INTEGER );
              cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, $str157$End, MINUS_ONE_INTEGER, size, MINUS_ONE_INTEGER );
              final SubLObject problem = inference_datastructures_problem_store.find_problem_by_id( store, number_utilities.f_1_( current_end ) );
              if( NIL != problem )
              {
                html_utilities.html_indent( FOUR_INTEGER );
                cb_utilities.cb_link( $kw62$PROBLEM, problem, $kw158$TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              html_utilities.html_indent( FOUR_INTEGER );
              if( sequence_max.numGE( TEN_INTEGER ) )
              {
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_princ( $str159$Percent__ );
                html_utilities.html_indent( THREE_INTEGER );
                SubLObject i;
                SubLObject percent;
                SubLObject percent_problem_end;
                SubLObject precise_percent_current_end;
                SubLObject percent_current_end;
                for( i = NIL, i = ZERO_INTEGER; i.numL( ELEVEN_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
                {
                  percent = Numbers.multiply( i, TEN_INTEGER );
                  percent_problem_end = Numbers.integerDivide( Numbers.multiply( i, sequence_max ), TEN_INTEGER );
                  precise_percent_current_end = number_utilities.percent( current_end, sequence_max, THREE_INTEGER );
                  percent_current_end = Numbers.multiply( TEN_INTEGER, Numbers.ceiling( Numbers.divide( Numbers.multiply( current_end, TEN_INTEGER ), sequence_max ), UNPROVIDED ) );
                  if( percent.numE( percent_current_end ) && !percent_problem_end.numE( current_end ) )
                  {
                    html_utilities.html_indent( ONE_INTEGER );
                    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                    cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, Numbers.sublisp_float( precise_percent_current_end, UNPROVIDED ), MINUS_ONE_INTEGER, size, current_end );
                    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                  }
                  html_utilities.html_indent( ONE_INTEGER );
                  if( problem_end.numE( percent_problem_end ) )
                  {
                    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
                    cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, percent, MINUS_ONE_INTEGER, size, percent_problem_end );
                    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
                  }
                  else
                  {
                    cb_utilities.cb_link( $kw114$VISUALIZE_PROBLEMS, store, percent, MINUS_ONE_INTEGER, size, percent_problem_end );
                  }
                }
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
            }
            html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
          }
          html_problem_layout_visualization_animation_controls_placeholder( layout );
          html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( $str160$problemStoreVisualizations );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              SubLObject cdolist_list_var2 = visualization_schemes;
              SubLObject scheme = NIL;
              scheme = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_problem_layout_visualization_table( layout, size, problem_end, table_style, scheme );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                cdolist_list_var2 = cdolist_list_var2.rest();
                scheme = cdolist_list_var2.first();
              }
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
          if( NIL == suppress_textual_outputP )
          {
            html_problem_layout_visualization_animation_controls( layout, visualization_schemes, current_end );
          }
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          if( NIL != show_copyrightP )
          {
            html_utilities.html_copyright_notice();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
        }
        html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$10, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 35079L)
  public static SubLObject cb_visualize_problems_for_monitor(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $current_vpfm_call_count$.setGlobalValue( Numbers.add( $current_vpfm_call_count$.getGlobalValue(), ONE_INTEGER ) );
    if( ZERO_INTEGER.eql( Numbers.mod( $current_vpfm_call_count$.getGlobalValue(), FOUR_INTEGER ) ) && $current_vpfm_call_count$.getGlobalValue().numGE( FOUR_INTEGER ) )
    {
      cb_inference_monitors.inference_monitor_warn( $str161$_D_concurrent_CB_VISUALIZE_PROBLE, $current_vpfm_call_count$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject err_msg = NIL;
    try
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym162$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            SubLObject store_id_string = NIL;
            SubLObject problem_end_string = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( args, args, $list163 );
            store_id_string = args.first();
            SubLObject current = args.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, args, $list163 );
            problem_end_string = current.first();
            current = current.rest();
            final SubLObject mode_string = current.isCons() ? current.first() : NIL;
            cdestructuring_bind.destructuring_bind_must_listp( current, args, $list163 );
            current = current.rest();
            if( NIL == current )
            {
              notify_visualizing_problem_store( UNPROVIDED );
              cb_visualize_problems_for_monitor_int( store_id_string, problem_end_string, mode_string );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( args, $list163 );
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
        err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        $current_vpfm_call_count$.setGlobalValue( Numbers.subtract( $current_vpfm_call_count$.getGlobalValue(), ONE_INTEGER ) );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( NIL != err_msg )
    {
      cb_inference_monitors.inference_monitor_warn( $str164$Error_for_args__S_____S, args, err_msg, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 35820L)
  public static SubLObject cb_visualize_problems_for_monitor_int(final SubLObject store_id_string, final SubLObject problem_end_string, final SubLObject mode_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mode = mode_string.isString() ? reader.read_from_string_ignoring_errors( mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) : NIL;
    SubLObject store = mode.eql( $kw166$LATEST_INFERENCE ) ? cb_inference_monitors.latest_monitorable_problem_store() : cb_inference_browser.cb_guess_problem_store( store_id_string );
    if( NIL == inference_datastructures_problem_store.problem_store_p( store ) )
    {
      store = Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), web_services.get_inference_from_mode( mode ) );
    }
    if( NIL != inference_datastructures_problem_store.problem_store_p( store ) )
    {
      final SubLObject refresh_rate = MINUS_ONE_INTEGER;
      final SubLObject problem_end = reader.read_from_string_ignoring_errors( problem_end_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject layout = update_problem_layout( cb_problem_store_layout( store ) );
      final SubLObject layout_width = Numbers.subtract( prob_layout_max_x( layout ), prob_layout_min_x( layout ) );
      final SubLObject layout_height = Numbers.subtract( prob_layout_max_y( layout ), prob_layout_min_y( layout ) );
      final SubLObject size = compute_grid_size_for_inference_monitor( layout_width, layout_height );
      final SubLObject suppress_textual_outputP = T;
      final SubLObject show_copyrightP = NIL;
      final SubLObject table_style = html_problem_layout_visualization_for_monitor_table_style( size, layout_width, layout_height );
      final SubLObject body_style = $str168$overflow_hidden_;
      if( !store.eql( $last_store$.getGlobalValue() ) )
      {
        cb_inference_monitors.inference_monitor_info( $str169$Visualizing_new_problem_store__S, store, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( problem_end.isNumber() && $last_problem_end$.getGlobalValue().isNumber() && Numbers.subtract( problem_end, $last_problem_end$.getGlobalValue() ).numG( $int170$25 ) )
      {
        cb_inference_monitors.inference_monitor_info( $str171$Jumped_problem_end_from__A_to__A_, $last_problem_end$.getGlobalValue(), problem_end, UNPROVIDED, UNPROVIDED );
      }
      $last_problem_end$.setGlobalValue( problem_end );
      $last_store$.setGlobalValue( store );
      return cb_visualize_problems_guts( layout, refresh_rate, size, problem_end, table_style, suppress_textual_outputP, show_copyrightP, body_style, $list172 );
    }
    if( mode.eql( $kw166$LATEST_INFERENCE ) )
    {
      html_utilities.html_markup( $str133$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str134$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw135$UNINITIALIZED ) ? ConsesLow.list(
            EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      return NIL;
    }
    return cb_utilities.cb_error( $str167$_A__A_did_not_specify_a_problem_s, store_id_string, mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
  public static SubLObject clear_notify_visualizing_problem_store()
  {
    final SubLObject cs = $notify_visualizing_problem_store_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
  public static SubLObject remove_notify_visualizing_problem_store(SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = numeric_date_utilities.get_universal_second( UNPROVIDED );
    }
    return memoization_state.caching_state_remove_function_results_with_args( $notify_visualizing_problem_store_caching_state$.getGlobalValue(), ConsesLow.list( id ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
  public static SubLObject notify_visualizing_problem_store_internal(final SubLObject id)
  {
    cb_inference_monitors.inference_monitor_info( $str174$__Visualizing_problem_store__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
  public static SubLObject notify_visualizing_problem_store(SubLObject id)
  {
    if( id == UNPROVIDED )
    {
      id = numeric_date_utilities.get_universal_second( UNPROVIDED );
    }
    SubLObject caching_state = $notify_visualizing_problem_store_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym173$NOTIFY_VISUALIZING_PROBLEM_STORE, $sym175$_NOTIFY_VISUALIZING_PROBLEM_STORE_CACHING_STATE_, EIGHT_INTEGER, EQUAL, ONE_INTEGER,
          ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( notify_visualizing_problem_store_internal( id ) ) );
      memoization_state.caching_state_put( caching_state, id, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
  public static SubLObject clear_compute_grid_size_for_inference_monitor()
  {
    final SubLObject cs = $compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
  public static SubLObject remove_compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue(), ConsesLow.list( layout_width, layout_height ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
  public static SubLObject compute_grid_size_for_inference_monitor_internal(final SubLObject layout_width, final SubLObject layout_height)
  {
    if( ZERO_INTEGER.eql( layout_width ) || ZERO_INTEGER.eql( layout_height ) )
    {
      return ZERO_INTEGER;
    }
    final SubLObject max_table_width = $inference_monitor_grid_width$.getGlobalValue();
    final SubLObject max_table_height = $inference_monitor_grid_height$.getGlobalValue();
    final SubLObject optimum_cell_width = Numbers.integerDivide( max_table_width, layout_width );
    final SubLObject optimum_cell_height = Numbers.integerDivide( max_table_height, layout_height );
    cb_inference_monitors.inference_monitor_info( $str177$Given_layout_of__Dx_D__optimum_ce, layout_width, layout_height, optimum_cell_width, optimum_cell_height );
    return Numbers.min( optimum_cell_width, new SubLObject[] { optimum_cell_height, $inference_monitor_max_cell_size$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
  public static SubLObject compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height)
  {
    SubLObject caching_state = $compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR, $sym178$_COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR_CACHING_STATE_, EIGHT_INTEGER, EQL,
          TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( layout_width, layout_height );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( layout_width.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && layout_height.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( compute_grid_size_for_inference_monitor_internal( layout_width, layout_height ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( layout_width, layout_height ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
  public static SubLObject clear_html_problem_layout_visualization_for_monitor_table_style()
  {
    final SubLObject cs = $html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
  public static SubLObject remove_html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue(), ConsesLow.list( td_height, layout_width,
        layout_height ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
  public static SubLObject html_problem_layout_visualization_for_monitor_table_style_internal(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height)
  {
    final SubLObject td_border_width = td_height.numG( FIVE_INTEGER ) ? ONE_INTEGER : ZERO_INTEGER;
    final SubLObject td_border = Sequences.cconcatenate( $str85$solid_gray_, new SubLObject[] { format_nil.format_nil_d_no_copy( td_border_width ), $str86$px
    } );
    final SubLObject td_width = Numbers.multiply( td_height, $float180$1_5 );
    final SubLObject padded_td_height = Numbers.add( td_height, td_border_width );
    final SubLObject padded_td_width = Numbers.add( td_width, td_border_width );
    final SubLObject table_width = Numbers.floor( Numbers.multiply( padded_td_width, layout_width ), UNPROVIDED );
    final SubLObject horizontal_whitespace = Numbers.max( ZERO_INTEGER, Numbers.subtract( $inference_monitor_grid_width$.getGlobalValue(), table_width ) );
    final SubLObject table_left_margin = Numbers.integerDivide( horizontal_whitespace, TWO_INTEGER );
    final SubLObject table_height = Numbers.floor( Numbers.multiply( padded_td_height, layout_height ), UNPROVIDED );
    final SubLObject vertical_whitespace = Numbers.max( ZERO_INTEGER, Numbers.subtract( $inference_monitor_grid_height$.getGlobalValue(), table_height ) );
    final SubLObject table_top_margin = Numbers.integerDivide( vertical_whitespace, TWO_INTEGER );
    final SubLObject style = Sequences.cconcatenate( $str181$_style_type__text_css______proble, new SubLObject[] { format_nil.format_nil_a_no_copy( table_left_margin ), $str182$px__margin_top__, format_nil
        .format_nil_a_no_copy( table_top_margin ), $str183$px__opacity___75_____table_proble, format_nil.format_nil_a_no_copy( td_width ), $str184$px__height___, format_nil.format_nil_a_no_copy( td_height ),
      $str90$px__border__, format_nil.format_nil_a_no_copy( td_border ), $str185$______td_none______border_color__
    } );
    cb_inference_monitors.inference_monitor_info( $str186$Layout__Dx_D_____A, layout_width, layout_height, style, UNPROVIDED );
    return style;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
  public static SubLObject html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height)
  {
    SubLObject caching_state = $html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE, $sym187$_HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE_CACHIN,
          EIGHT_INTEGER, EQL, THREE_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( td_height, layout_width, layout_height );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( td_height.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( layout_width.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && layout_height.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( html_problem_layout_visualization_for_monitor_table_style_internal( td_height, layout_width, layout_height ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( td_height, layout_width, layout_height ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 40862L)
  public static SubLObject cb_problem_store_layout(final SubLObject store)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != inference_datastructures_problem_store.problem_store_p( store ) : store;
    SubLObject layout = cache.cache_get_without_values( $cb_problem_store_layout_table$.getGlobalValue(), store, UNPROVIDED );
    if( NIL == problem_layout_p( layout ) )
    {
      layout = new_problem_layout( store );
      delete_stale_problem_store_layouts();
      thread.resetMultipleValues();
      final SubLObject dropped_store = cache.cache_set_return_dropped( $cb_problem_store_layout_table$.getGlobalValue(), store, layout );
      final SubLObject dropped_layout = thread.secondMultipleValue();
      final SubLObject validP = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != validP )
      {
        destroy_problem_layout( dropped_layout );
      }
    }
    return layout;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 41407L)
  public static SubLObject delete_stale_problem_store_layouts()
  {
    SubLObject stale_stores = NIL;
    final SubLObject cache_var = $cb_problem_store_layout_table$.getGlobalValue();
    final SubLObject order_var = $kw189$NEWEST;
    SubLObject entry = cache.do_cache_first( cache_var, order_var );
    SubLObject store = NIL;
    SubLObject layout = NIL;
    while ( NIL == cache.do_cache_doneP( cache_var, entry ))
    {
      store = cache.do_cache_key( entry );
      layout = cache.do_cache_value( entry );
      entry = cache.do_cache_next( entry, order_var );
      if( NIL == inference_datastructures_problem_store.valid_problem_store_p( store ) )
      {
        stale_stores = ConsesLow.cons( store, stale_stores );
      }
    }
    SubLObject cdolist_list_var = stale_stores;
    SubLObject store2 = NIL;
    store2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject layout2 = cache.cache_get( $cb_problem_store_layout_table$.getGlobalValue(), store2 );
      cache.cache_remove( $cb_problem_store_layout_table$.getGlobalValue(), store2 );
      destroy_problem_layout( layout2 );
      cdolist_list_var = cdolist_list_var.rest();
      store2 = cdolist_list_var.first();
    }
    return Sequences.length( stale_stores );
  }

  public static SubLObject declare_problem_store_visualization_file()
  {
    SubLFiles.declareFunction( me, "problem_layout_print_function_trampoline", "PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_p", "PROBLEM-LAYOUT-P", 1, 0, false );
    new $problem_layout_p$UnaryFunction();
    SubLFiles.declareFunction( me, "prob_layout_problem_store", "PROB-LAYOUT-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_min_x", "PROB-LAYOUT-MIN-X", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_max_x", "PROB-LAYOUT-MAX-X", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_min_y", "PROB-LAYOUT-MIN-Y", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_max_y", "PROB-LAYOUT-MAX-Y", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_grid", "PROB-LAYOUT-GRID", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_next_problem_id", "PROB-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_problem_x_table", "PROB-LAYOUT-PROBLEM-X-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "prob_layout_problem_y_table", "PROB-LAYOUT-PROBLEM-Y-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_problem_store", "_CSETF-PROB-LAYOUT-PROBLEM-STORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_min_x", "_CSETF-PROB-LAYOUT-MIN-X", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_max_x", "_CSETF-PROB-LAYOUT-MAX-X", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_min_y", "_CSETF-PROB-LAYOUT-MIN-Y", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_max_y", "_CSETF-PROB-LAYOUT-MAX-Y", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_grid", "_CSETF-PROB-LAYOUT-GRID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_next_problem_id", "_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_problem_x_table", "_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_prob_layout_problem_y_table", "_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_problem_layout", "MAKE-PROBLEM-LAYOUT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_problem_layout", "VISIT-DEFSTRUCT-PROBLEM-LAYOUT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_problem_layout_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_problem_layout", "NEW-PROBLEM-LAYOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "destroy_problem_layout", "DESTROY-PROBLEM-LAYOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_store", "PROBLEM-LAYOUT-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_next_problem_id", "PROBLEM-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_problem_store", "PROBLEM-LAYOUT-PROBLEM-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_x_lookup", "PROBLEM-LAYOUT-X-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_y_lookup", "PROBLEM-LAYOUT-Y-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_grid_lookup", "PROBLEM-LAYOUT-GRID-LOOKUP", 3, 0, false );
    SubLFiles.declareFunction( me, "update_problem_layout", "UPDATE-PROBLEM-LAYOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_add", "PROBLEM-LAYOUT-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_add_to_grid", "PROBLEM-LAYOUT-ADD-TO-GRID", 4, 0, false );
    SubLFiles.declareFunction( me, "problem_layout_compute_add_location", "PROBLEM-LAYOUT-COMPUTE-ADD-LOCATION", 3, 0, false );
    SubLFiles.declareFunction( me, "octant_preference_order", "OCTANT-PREFERENCE-ORDER", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_octant_locations", "INITIALIZE-OCTANT-LOCATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "octant_location_L", "OCTANT-LOCATION-<", 2, 0, false );
    SubLFiles.declareFunction( me, "octant_location_delta_x", "OCTANT-LOCATION-DELTA-X", 1, 0, false );
    SubLFiles.declareFunction( me, "octant_location_delta_y", "OCTANT-LOCATION-DELTA-Y", 1, 0, false );
    SubLFiles.declareFunction( me, "earliest_dependent_problem", "EARLIEST-DEPENDENT-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_store_most_recent_problem", "PROBLEM-STORE-MOST-RECENT-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "all_problem_ancestor_problems", "ALL-PROBLEM-ANCESTOR-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "all_problem_ancestor_problems_recursive", "ALL-PROBLEM-ANCESTOR-PROBLEMS-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_oldest_ancestor_path", "PROBLEM-OLDEST-ANCESTOR-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_oldest_ancestor_path_recursive", "PROBLEM-OLDEST-ANCESTOR-PATH-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_oldest_parent_problem", "PROBLEM-OLDEST-PARENT-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "problem_oldest_link_to_parent", "PROBLEM-OLDEST-LINK-TO-PARENT", 2, 0, false );
    SubLFiles.declareFunction( me, "problem_proof_count_rectangle", "PROBLEM-PROOF-COUNT-RECTANGLE", 1, 0, false );
    SubLFiles.declareFunction( me, "squarest_rectangle_for_integer_area", "SQUAREST-RECTANGLE-FOR-INTEGER-AREA", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_table", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE", 1, 4, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_animation_controls", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS", 2, 1, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_animation_controls_placeholder", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS-PLACEHOLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_slider_ids", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SLIDER-IDS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_scripts", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPTS", 4, 1, false );
    SubLFiles.declareFunction( me, "html_problem_layout_id", "HTML-PROBLEM-LAYOUT-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_html_problem_layout_visualization_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_problem_layout_visualization_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_page_css", "HTML-PROBLEM-LAYOUT-VISUALIZATION-PAGE-CSS", 0, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_class", "HTML-PROBLEM-LAYOUT-CLASS", 5, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_class_by_goodness", "HTML-PROBLEM-LAYOUT-CLASS-BY-GOODNESS", 4, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_class_by_strategy", "HTML-PROBLEM-LAYOUT-CLASS-BY-STRATEGY", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_link_visualize_problems", "CB-LINK-VISUALIZE-PROBLEMS", 1, 4, false );
    SubLFiles.declareFunction( me, "cb_visualize_problems", "CB-VISUALIZE-PROBLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "best_problem_store_visualizer_zoom_level_for_store", "BEST-PROBLEM-STORE-VISUALIZER-ZOOM-LEVEL-FOR-STORE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_visualize_problems_guts", "CB-VISUALIZE-PROBLEMS-GUTS", 5, 4, false );
    SubLFiles.declareFunction( me, "cb_visualize_problems_for_monitor", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_visualize_problems_for_monitor_int", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_notify_visualizing_problem_store", "CLEAR-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_notify_visualizing_problem_store", "REMOVE-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "notify_visualizing_problem_store_internal", "NOTIFY-VISUALIZING-PROBLEM-STORE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "notify_visualizing_problem_store", "NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false );
    SubLFiles.declareFunction( me, "clear_compute_grid_size_for_inference_monitor", "CLEAR-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_compute_grid_size_for_inference_monitor", "REMOVE-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_grid_size_for_inference_monitor_internal", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_grid_size_for_inference_monitor", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_html_problem_layout_visualization_for_monitor_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_html_problem_layout_visualization_for_monitor_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_for_monitor_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "html_problem_layout_visualization_for_monitor_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_problem_store_layout", "CB-PROBLEM-STORE-LAYOUT", 1, 0, false );
    SubLFiles.declareFunction( me, "delete_stale_problem_store_layouts", "DELETE-STALE-PROBLEM-STORE-LAYOUTS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_problem_store_visualization_file()
  {
    $dtp_problem_layout$ = SubLFiles.defconstant( "*DTP-PROBLEM-LAYOUT*", $sym0$PROBLEM_LAYOUT );
    $octant_locations$ = SubLFiles.deflexical( "*OCTANT-LOCATIONS*", ( maybeDefault( $sym47$_OCTANT_LOCATIONS_, $octant_locations$, NIL ) ) );
    $html_problem_layout_visualization_script_template$ = SubLFiles.defparameter( "*HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPT-TEMPLATE*", $str78$_script_type__text_javascript____ );
    $html_problem_layout_visualization_table_style_caching_state$ = SubLFiles.deflexical( "*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*", NIL );
    $cb_problem_store_default_zoom_levels$ = SubLFiles.defparameter( "*CB-PROBLEM-STORE-DEFAULT-ZOOM-LEVELS*", $list130 );
    $last_store$ = SubLFiles.deflexical( "*LAST-STORE*", NIL );
    $last_problem_end$ = SubLFiles.deflexical( "*LAST-PROBLEM-END*", NIL );
    $current_vpfm_call_count$ = SubLFiles.deflexical( "*CURRENT-VPFM-CALL-COUNT*", ZERO_INTEGER );
    $notify_visualizing_problem_store_caching_state$ = SubLFiles.deflexical( "*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*", NIL );
    $inference_monitor_grid_width$ = SubLFiles.deflexical( "*INFERENCE-MONITOR-GRID-WIDTH*", $int149$100 );
    $inference_monitor_grid_height$ = SubLFiles.deflexical( "*INFERENCE-MONITOR-GRID-HEIGHT*", $int149$100 );
    $inference_monitor_max_cell_size$ = SubLFiles.deflexical( "*INFERENCE-MONITOR-MAX-CELL-SIZE*", FIFTEEN_INTEGER );
    $compute_grid_size_for_inference_monitor_caching_state$ = SubLFiles.deflexical( "*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*", NIL );
    $html_problem_layout_visualization_for_monitor_table_style_caching_state$ = SubLFiles.deflexical( "*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*", NIL );
    $cb_problem_store_layout_table$ = SubLFiles.deflexical( "*CB-PROBLEM-STORE-LAYOUT-TABLE*", maybeDefault( $sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_, $cb_problem_store_layout_table$, () -> ( cache.new_cache( TEN_INTEGER,
        Symbols.symbol_function( EQ ) ) ) ) );
    return NIL;
  }

  public static SubLObject setup_problem_store_visualization_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_layout$.getGlobalValue(), Symbols.symbol_function( $sym7$PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$PROB_LAYOUT_PROBLEM_STORE, $sym10$_CSETF_PROB_LAYOUT_PROBLEM_STORE );
    Structures.def_csetf( $sym11$PROB_LAYOUT_MIN_X, $sym12$_CSETF_PROB_LAYOUT_MIN_X );
    Structures.def_csetf( $sym13$PROB_LAYOUT_MAX_X, $sym14$_CSETF_PROB_LAYOUT_MAX_X );
    Structures.def_csetf( $sym15$PROB_LAYOUT_MIN_Y, $sym16$_CSETF_PROB_LAYOUT_MIN_Y );
    Structures.def_csetf( $sym17$PROB_LAYOUT_MAX_Y, $sym18$_CSETF_PROB_LAYOUT_MAX_Y );
    Structures.def_csetf( $sym19$PROB_LAYOUT_GRID, $sym20$_CSETF_PROB_LAYOUT_GRID );
    Structures.def_csetf( $sym21$PROB_LAYOUT_NEXT_PROBLEM_ID, $sym22$_CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID );
    Structures.def_csetf( $sym23$PROB_LAYOUT_PROBLEM_X_TABLE, $sym24$_CSETF_PROB_LAYOUT_PROBLEM_X_TABLE );
    Structures.def_csetf( $sym25$PROB_LAYOUT_PROBLEM_Y_TABLE, $sym26$_CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE );
    Equality.identity( $sym0$PROBLEM_LAYOUT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_layout$.getGlobalValue(), Symbols.symbol_function( $sym41$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym47$_OCTANT_LOCATIONS_ );
    utilities_macros.note_funcall_helper_function( $sym49$OCTANT_LOCATION__ );
    memoization_state.note_globally_cached_function( $sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE );
    cb_utilities.setup_cb_link_method( $kw114$VISUALIZE_PROBLEMS, $sym115$CB_LINK_VISUALIZE_PROBLEMS, FIVE_INTEGER );
    html_macros.note_cgi_handler_function( $sym118$CB_VISUALIZE_PROBLEMS, $kw119$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym165$CB_VISUALIZE_PROBLEMS_FOR_MONITOR, $kw119$HTML_HANDLER );
    memoization_state.note_globally_cached_function( $sym173$NOTIFY_VISUALIZING_PROBLEM_STORE );
    memoization_state.note_globally_cached_function( $sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR );
    memoization_state.note_globally_cached_function( $sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE );
    subl_macro_promotions.declare_defglobal( $sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_problem_store_visualization_file();
  }

  @Override
  public void initializeVariables()
  {
    init_problem_store_visualization_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_problem_store_visualization_file();
  }
  static
  {
    me = new problem_store_visualization();
    $dtp_problem_layout$ = null;
    $octant_locations$ = null;
    $html_problem_layout_visualization_script_template$ = null;
    $html_problem_layout_visualization_table_style_caching_state$ = null;
    $cb_problem_store_default_zoom_levels$ = null;
    $last_store$ = null;
    $last_problem_end$ = null;
    $current_vpfm_call_count$ = null;
    $notify_visualizing_problem_store_caching_state$ = null;
    $inference_monitor_grid_width$ = null;
    $inference_monitor_grid_height$ = null;
    $inference_monitor_max_cell_size$ = null;
    $compute_grid_size_for_inference_monitor_caching_state$ = null;
    $html_problem_layout_visualization_for_monitor_table_style_caching_state$ = null;
    $cb_problem_store_layout_table$ = null;
    $sym0$PROBLEM_LAYOUT = makeSymbol( "PROBLEM-LAYOUT" );
    $sym1$PROBLEM_LAYOUT_P = makeSymbol( "PROBLEM-LAYOUT-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "PROBLEM-STORE" ), makeSymbol( "MIN-X" ), makeSymbol( "MAX-X" ), makeSymbol( "MIN-Y" ), makeSymbol( "MAX-Y" ), makeSymbol( "GRID" ), makeSymbol(
        "NEXT-PROBLEM-ID" ), makeSymbol( "PROBLEM-X-TABLE" ), makeSymbol( "PROBLEM-Y-TABLE" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "PROBLEM-STORE" ), makeKeyword( "MIN-X" ), makeKeyword( "MAX-X" ), makeKeyword( "MIN-Y" ), makeKeyword( "MAX-Y" ), makeKeyword( "GRID" ), makeKeyword(
        "NEXT-PROBLEM-ID" ), makeKeyword( "PROBLEM-X-TABLE" ), makeKeyword( "PROBLEM-Y-TABLE" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "PROB-LAYOUT-PROBLEM-STORE" ), makeSymbol( "PROB-LAYOUT-MIN-X" ), makeSymbol( "PROB-LAYOUT-MAX-X" ), makeSymbol( "PROB-LAYOUT-MIN-Y" ), makeSymbol(
        "PROB-LAYOUT-MAX-Y" ), makeSymbol( "PROB-LAYOUT-GRID" ), makeSymbol( "PROB-LAYOUT-NEXT-PROBLEM-ID" ), makeSymbol( "PROB-LAYOUT-PROBLEM-X-TABLE" ), makeSymbol( "PROB-LAYOUT-PROBLEM-Y-TABLE" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-PROB-LAYOUT-PROBLEM-STORE" ), makeSymbol( "_CSETF-PROB-LAYOUT-MIN-X" ), makeSymbol( "_CSETF-PROB-LAYOUT-MAX-X" ), makeSymbol(
        "_CSETF-PROB-LAYOUT-MIN-Y" ), makeSymbol( "_CSETF-PROB-LAYOUT-MAX-Y" ), makeSymbol( "_CSETF-PROB-LAYOUT-GRID" ), makeSymbol( "_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID" ), makeSymbol(
            "_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE" ), makeSymbol( "_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE" )
    } );
    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym7$PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROBLEM-LAYOUT-P" ) );
    $sym9$PROB_LAYOUT_PROBLEM_STORE = makeSymbol( "PROB-LAYOUT-PROBLEM-STORE" );
    $sym10$_CSETF_PROB_LAYOUT_PROBLEM_STORE = makeSymbol( "_CSETF-PROB-LAYOUT-PROBLEM-STORE" );
    $sym11$PROB_LAYOUT_MIN_X = makeSymbol( "PROB-LAYOUT-MIN-X" );
    $sym12$_CSETF_PROB_LAYOUT_MIN_X = makeSymbol( "_CSETF-PROB-LAYOUT-MIN-X" );
    $sym13$PROB_LAYOUT_MAX_X = makeSymbol( "PROB-LAYOUT-MAX-X" );
    $sym14$_CSETF_PROB_LAYOUT_MAX_X = makeSymbol( "_CSETF-PROB-LAYOUT-MAX-X" );
    $sym15$PROB_LAYOUT_MIN_Y = makeSymbol( "PROB-LAYOUT-MIN-Y" );
    $sym16$_CSETF_PROB_LAYOUT_MIN_Y = makeSymbol( "_CSETF-PROB-LAYOUT-MIN-Y" );
    $sym17$PROB_LAYOUT_MAX_Y = makeSymbol( "PROB-LAYOUT-MAX-Y" );
    $sym18$_CSETF_PROB_LAYOUT_MAX_Y = makeSymbol( "_CSETF-PROB-LAYOUT-MAX-Y" );
    $sym19$PROB_LAYOUT_GRID = makeSymbol( "PROB-LAYOUT-GRID" );
    $sym20$_CSETF_PROB_LAYOUT_GRID = makeSymbol( "_CSETF-PROB-LAYOUT-GRID" );
    $sym21$PROB_LAYOUT_NEXT_PROBLEM_ID = makeSymbol( "PROB-LAYOUT-NEXT-PROBLEM-ID" );
    $sym22$_CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID = makeSymbol( "_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID" );
    $sym23$PROB_LAYOUT_PROBLEM_X_TABLE = makeSymbol( "PROB-LAYOUT-PROBLEM-X-TABLE" );
    $sym24$_CSETF_PROB_LAYOUT_PROBLEM_X_TABLE = makeSymbol( "_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE" );
    $sym25$PROB_LAYOUT_PROBLEM_Y_TABLE = makeSymbol( "PROB-LAYOUT-PROBLEM-Y-TABLE" );
    $sym26$_CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE = makeSymbol( "_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE" );
    $kw27$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw28$MIN_X = makeKeyword( "MIN-X" );
    $kw29$MAX_X = makeKeyword( "MAX-X" );
    $kw30$MIN_Y = makeKeyword( "MIN-Y" );
    $kw31$MAX_Y = makeKeyword( "MAX-Y" );
    $kw32$GRID = makeKeyword( "GRID" );
    $kw33$NEXT_PROBLEM_ID = makeKeyword( "NEXT-PROBLEM-ID" );
    $kw34$PROBLEM_X_TABLE = makeKeyword( "PROBLEM-X-TABLE" );
    $kw35$PROBLEM_Y_TABLE = makeKeyword( "PROBLEM-Y-TABLE" );
    $str36$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw37$BEGIN = makeKeyword( "BEGIN" );
    $sym38$MAKE_PROBLEM_LAYOUT = makeSymbol( "MAKE-PROBLEM-LAYOUT" );
    $kw39$SLOT = makeKeyword( "SLOT" );
    $kw40$END = makeKeyword( "END" );
    $sym41$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD" );
    $sym42$PROBLEM_STORE_P = makeSymbol( "PROBLEM-STORE-P" );
    $kw43$FREE = makeKeyword( "FREE" );
    $sym44$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $str45$unable_to_add_to_layout__S = makeString( "unable to add to layout ~S" );
    $list46 = ConsesLow.list( FIVE_INTEGER, SIX_INTEGER, FOUR_INTEGER, SEVEN_INTEGER, THREE_INTEGER, ZERO_INTEGER, TWO_INTEGER, ONE_INTEGER );
    $sym47$_OCTANT_LOCATIONS_ = makeSymbol( "*OCTANT-LOCATIONS*" );
    $int48$316 = makeInteger( 316 );
    $sym49$OCTANT_LOCATION__ = makeSymbol( "OCTANT-LOCATION-<" );
    $sym50$VECTOR = makeSymbol( "VECTOR" );
    $list51 = ConsesLow.list( makeSymbol( "X-1" ), makeSymbol( "Y-1" ) );
    $list52 = ConsesLow.list( makeSymbol( "X-2" ), makeSymbol( "Y-2" ) );
    $sym53$_ = makeSymbol( "<" );
    $sym54$PROBLEM_SUID = makeSymbol( "PROBLEM-SUID" );
    $sym55$PROBLEM_LINK_SUID = makeSymbol( "PROBLEM-LINK-SUID" );
    $sym56$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw57$GOODNESS = makeKeyword( "GOODNESS" );
    $str58$ps_ = makeString( "ps-" );
    $str59$_ = makeString( "-" );
    $str60$problemGrid = makeString( "problemGrid" );
    $kw61$CENTER = makeKeyword( "CENTER" );
    $kw62$PROBLEM = makeKeyword( "PROBLEM" );
    $kw63$MINIMAL = makeKeyword( "MINIMAL" );
    $str64$_ = makeString( "*" );
    $list65 = ConsesLow.list( makeSymbol( "SLIDER-ID" ), makeSymbol( "SLIDER-FIELD-ID" ) );
    $kw66$EXT_ALL = makeKeyword( "EXT-ALL" );
    $kw67$RAPHAEL = makeKeyword( "RAPHAEL" );
    $str68$_ = makeString( "[" );
    $str69$null = makeString( "null" );
    $str70$_ = makeString( "," );
    $str71$_ = makeString( "]" );
    $str72$_script_type__text_javascript____ = makeString(
        "<script type='text/javascript'>\n  var Cyc = {problemStore : \n              {~A : \n               { parentData: ~A,\n                 lastNodeId: ~A,\n                 papers: {}\n\t       }\n\t      }\n\t     };\n</script>" );
    $str73$_style_type__text_css_______A_tab = makeString( "<style type=\"text/css\">\n  #~A table { display:inline-table }\n  #~A       { padding-left: 5px }\n  #~A table { display:inline-table }\n</style>" );
    $str74$height_1_5em = makeString( "height:1.5em" );
    $str75$ps = makeString( "ps" );
    $str76$_slider = makeString( "-slider" );
    $str77$_slider_field = makeString( "-slider-field" );
    $str78$_script_type__text_javascript____ = makeString(
        "<script type='text/javascript'>\n    Ext.require('Ext.slider.*');\n\nExt.onReady(function(){\n    var maxProblemId = ~S;\n    var schemes = ~A;\n    var ps = ~A\n    var paper = {};\n    var underlayIdSuffix = '-u';\n    var slider = Ext.create('Ext.slider.Single', {\n        renderTo: '~A',\n        useTips: false,\n        hideLabel: false,\n        fieldLabel: 'Last Visible Problem:',\n        labelWidth: 130,\n        width: 314,\n        value:maxProblemId,\n        increment: 1,\n        minValue: 0,\n        maxValue: maxProblemId,\n        plugins: new Ext.slider.Tip({getText: function(thumb){\n          return Ext.String.format('{0} of {1}' , thumb.value, maxProblemId);\n          }\n        }),\n        userTips: true,\n\tlisteners:{\n\t    change:function(slider, newValue, thumb){\n\t\tsetProblemsVisible(ps, newValue, maxProblemId, schemes);\n                updatePath(ps, newValue, schemes);\n\t    }\n\t}\n    });\n    var typein = Ext.create('Ext.form.field.Number', {\n        renderTo: '~A',\n        scope:this,\n        width: 60,\n        value: maxProblemId,\n        minValue: 0,\n        maxValue: maxProblemId,\n        listeners:{\n          change:function() {\n            slider.setValue(this.getValue());\n          }\n        }\n    });\n\n    function setProblemsVisible(ps, maxVisibleId, maxProblemStoreId, schemes) {\n     var elt;\n     for (var i = 0; i <  schemes.length; i++) {\n       var scheme = schemes[i];\n       var id;\n       for (var num = 0; num <= maxVisibleId; num++) {\n         var elt = Ext.fly(getUnderlayCellId(ps, num, scheme));\n         if (elt) {\n           elt.removeCls('hideme');\n         }\n       }\n       for (var num = maxVisibleId + 1; num <= maxProblemStoreId; num++) {\n         Ext.fly(getUnderlayCellId(ps, num, scheme)).addCls('hideme');\n       }\n     }\n    }\n\n\n    slider.on({\n      change:{fn: function(obj, value)\n       {\n        typein.setValue(value);\n        }\n      }\n    });\n\n   \n   function showPath(ps, finalNodeNum, schemes) {\n     overlayTable = Ext.get('problemStoreVisualizations'); \n     underlayDiv = overlayTable.parent().createChild('<div style=\"position:relative; \" id=\"visualizationUnderlay\"></div>');\n     underlayDiv.setXY(overlayTable.getXY());\n     underlayDiv.setHeight(overlayTable.getHeight());\n     for (var i = 0; i < schemes.length; i++) {\n       var table = Ext.get(getTableId(ps, schemes[i]));\n       var xy = table.getXY();\n       var paperHeight = table.getBottom() - xy[1]; \n       var paperWidth = table.getRight() - xy[0];\n       var clone = table.dom.cloneNode(true);\n       updateIds(clone, underlayIdSuffix);\n       underlayDiv.appendChild(clone);\n       var underlayTable = Ext.get(getTableId(ps, schemes[i]) + underlayIdSuffix);\n       underlayTable.setXY(xy).setWidth(table.getWidth());\n       removeClassFromDescendents('path', underlayTable.dom);\n       //now that the underlay is ready, make it visible.\n       overlayTable.addCls('transparent');\n       Cyc.problemStore[ps].papers[schemes[i]] = Raphael(xy[0], xy[1], paperWidth, paperHeight);\n     }\n     updatePath(ps, finalNodeNum, schemes);\n   }\n\n   function updatePath(ps, finalNodeNum, schemes) {\n     for (var i = 0; i < schemes.length; i++) {\n       var canvas = Cyc.problemStore[ps].papers[schemes[i]];\n       if (canvas) {\n         canvas.clear();\n       }\n       var path = getPathFromRootToNode(ps, finalNodeNum);\n       var tableId = getTableId(ps, schemes[i]);\n       var table = Ext.get('ps-' + ps + '-' + schemes[i]);\n       var nextStr = 'M';\n       var lineCmd = '';\n       var circleLocations = [];\n       for (var j = 0; j < path.length; j++) {\n         lineCmd = lineCmd + nextStr;\n         nextStr = 'L';\n         var eltId = getUnderlayCellId(ps, path[j], schemes[i]);\n         var eltLoc = relativeEltMiddle(eltId, tableId);\n         circleLocations.push(eltLoc);\n         var lineCmd = lineCmd + eltLoc[0] + ' ' + eltLoc[1];\n       }\n       var outline =  canvas.path(lineCmd);\n       outline.attr({'stroke' : '#fff', 'stroke-width': 4});\n       var line =  canvas.path(lineCmd);\n       line.attr({'stroke': '#000', 'stroke-width': 2});\n       circleLocations.forEach(function(xy) {\n          var c = canvas.circle(xy[0],xy[1],4);\n          c.attr('fill', 'white');\n          var c = canvas.circle(xy[0],xy[1],2);\n          c.attr('fill', 'black');\n       });\n     }\n   }\n\n  function removeClassFromDescendents(className, rootElt) {\n     Ext.query('.' + className, rootElt).forEach(function(elt) { Ext.fly(elt).removeCls(className); });\n  }\n\n  function updateIds(parent, newSuffix) {\n    Ext.query('*', parent).concat(parent).forEach(function (elt) { if (elt.id) {elt.id = elt.id + newSuffix;};});\n  }\n\n\n  function getPathFromRootToNode(ps, finalNodeNum) {\n    var nodeNum = finalNodeNum;\n    var path = [];\n    var data = Cyc.problemStore[ps].parentData;\n    while (nodeNum || nodeNum == 0) {\n      path.unshift(nodeNum);\n      nodeNum = data[nodeNum];\n    }\n    return path;\n  }\n\n  function relativeEltMiddle(eltId, parentId) {\n    var parentXY = Ext.fly(parentId).getXY();\n    var elt = Ext.fly(eltId);\n    var eltXY = elt.getXY();\n    var right = elt.getRight();\n    var bottom = elt.getBottom();\n    var xMiddle = eltXY[0] - parentXY[0] + ((right - eltXY[0]) / 2);\n    var yMiddle = eltXY[1] - parentXY[1] + ((bottom - eltXY[1]) / 2)\n    return [xMiddle, yMiddle]; \n  }\n\n   function getTableId(ps, scheme) {\n       return 'ps-' + ps + '-' + scheme;\n   }\n\n   function getCellId(ps, num, scheme) {\n     return 'p-' + ps + '-' + num + '-' + scheme;\n   }\n\n   function getUnderlayCellId(ps, num, scheme) {\n     return getCellId(ps, num, scheme) + underlayIdSuffix;\n   }\n\n  showPath(ps, maxProblemId, schemes);\n\n  setProblemsVisible(ps, maxProblemId, maxProblemId, schemes);\n\n  Ext.create('Ext.tip.ToolTip', {\n    target: Ext.get('problemStoreVisualizations'),\n    delegate : '.problem',\n    renderTo : Ext.getBody(),\n    trackMouse: true,\n    listeners: {\n     beforeShow: function updateTipBody(tip) {\n       var tipStr = '';\n       /p-[0-9]+-([0-9]+)-.*/.exec(tip.triggerElement.id);\n       if (RegExp.$1) {\n         tipStr = tipStr + 'Problem&nbsp;' + RegExp.$1 + ': ';\n       }\n       tip.update(tipStr + tip.triggerElement.className.replace('focus','').replace('problem','').replace('path', '').replace(' ',''));\n     }\n    }\n  });\n\n});\n</script>" );
    $str79$__ = makeString( "['" );
    $sym80$TO_STRING = makeSymbol( "TO-STRING" );
    $str81$___ = makeString( "','" );
    $str82$__ = makeString( "']" );
    $str83$p_ = makeString( "p-" );
    $sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE = makeSymbol( "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE" );
    $str85$solid_gray_ = makeString( "solid gray " );
    $str86$px = makeString( "px" );
    $str87$_style_type__text_css_______probl = makeString(
        "<style type=\"text/css\">\n   #problemStoreVisualizations {z-index: 10; position:relative; }\n   #problemStoreVisualizations.transparent {opacity: 0}\n  .problemGrid { margin: 10px; border-spacing: " );
    $str88$px__background___000000_______pro = makeString( "px; background: #000000; }\n  .problemGrid td { width: " );
    $str89$px__height__ = makeString( "px; height: " );
    $str90$px__border__ = makeString( "px; border: " );
    $str91$__font_family__courier__fixed__wh = makeString(
        "; font-family: courier, fixed; white-space: nowrap; font-size: 12px; box-sizing: context-box; -moz-box-sizing: content-box; -webkit-box-sizing: content-box}\n  .problemGrid a  { text-decoration: none; }\n  .none    { background-color: #000000; }\n  .problem { background-color: #3F3F3F; }\n  .invalid { background-color: #3F3F3F; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    a:link    { color: #FFFFFF; }\n  .problem.root    a:visited { color: #FFFFFF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    a:link    { color: #FFFFFF; }\n  .problem.path.root    a:visited { color: #FFFFFF; }\n  .problem.path.focus        { background-color: #0000FF; }\n  .future         { background-color: #3F3F3F; }\n  .path.focus   a:link    { color: #FFFFFF; }\n  .path.focus   a:visited { color: #FFFFFF; }\n  .problem.path   { background-color: #3FFFFF; }\n  .good           { background-color: #3FFF3F; }\n  .neutral        { background-color: #FFFF3F; }  \n  .no-good        { background-color: #FF3F3F; }\n  .problemGrid tr td { width: " );
    $str92$px__font_family__courier__fixed__ = makeString(
        "px; font-family: courier, fixed; white-space: nowrap;}\n  a { text-decoration: none; }\n  td.hideme              { background-color: #000000; }\n  \n  .new-root              { background-color: #FFFFFF; }\n  .transformation        { background-color: #3F3FFF; }\n  .removal               { background-color: #3FFF3F; }\n  .unmotivated           { background-color: #3F3F00; }\n</style>" );
    $sym93$_HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE_CACHING_STATE_ = makeSymbol( "*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*" );
    $str94$_style_type__text_css_____body_x_ = makeString( "<style type=\"text/css\">\n  body.x-body {font-size: initial; font-family: initial; }\n  body strong {font-style: initial; font-weight: bold; }\n  </style>" );
    $kw95$STRATEGY = makeKeyword( "STRATEGY" );
    $str96$unexpected_visualization_scheme__ = makeString( "unexpected visualization scheme: ~S" );
    $str97$problem_none = makeString( "problem none" );
    $str98$problem_invalid = makeString( "problem invalid" );
    $str99$problem_future = makeString( "problem future" );
    $str100$problem_root = makeString( "problem root" );
    $kw101$TACTICAL = makeKeyword( "TACTICAL" );
    $str102$problem_good = makeString( "problem good" );
    $str103$problem_neutral = makeString( "problem neutral" );
    $str104$problem_no_good = makeString( "problem no-good" );
    $str105$_path = makeString( " path" );
    $str106$_focus = makeString( " focus" );
    $str107$problem_new_root = makeString( "problem new-root" );
    $str108$problem_transformation = makeString( "problem transformation" );
    $str109$problem_removal = makeString( "problem removal" );
    $str110$problem_unmotivated = makeString( "problem unmotivated" );
    $str111$_Visualize_ = makeString( "[Visualize]" );
    $kw112$SELF = makeKeyword( "SELF" );
    $str113$cb_visualize_problems__A__A__A__A = makeString( "cb-visualize-problems&~A&~A&~A&~A" );
    $kw114$VISUALIZE_PROBLEMS = makeKeyword( "VISUALIZE-PROBLEMS" );
    $sym115$CB_LINK_VISUALIZE_PROBLEMS = makeSymbol( "CB-LINK-VISUALIZE-PROBLEMS" );
    $list116 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "REFRESH-STRING" ), makeSymbol( "SIZE-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "PROBLEM-END-STRING" ) );
    $str117$_A_did_not_specify_a_problem_stor = makeString( "~A did not specify a problem store" );
    $sym118$CB_VISUALIZE_PROBLEMS = makeSymbol( "CB-VISUALIZE-PROBLEMS" );
    $kw119$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $int120$100000 = makeInteger( 100000 );
    $int121$50000 = makeInteger( 50000 );
    $int122$24000 = makeInteger( 24000 );
    $int123$12000 = makeInteger( 12000 );
    $int124$5000 = makeInteger( 5000 );
    $int125$2000 = makeInteger( 2000 );
    $int126$1000 = makeInteger( 1000 );
    $int127$500 = makeInteger( 500 );
    $int128$32 = makeInteger( 32 );
    $int129$40 = makeInteger( 40 );
    $list130 = ConsesLow.list( new SubLObject[] { ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, EIGHT_INTEGER, TEN_INTEGER, SIXTEEN_INTEGER, TWENTY_INTEGER, makeInteger( 32 ), makeInteger( 40 ),
      makeInteger( 64 ), makeInteger( 100 )
    } );
    $str131$ = makeString( "" );
    $list132 = ConsesLow.list( makeKeyword( "GOODNESS" ), makeKeyword( "STRATEGY" ) );
    $str133$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str134$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw135$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw136$CB_CYC = makeKeyword( "CB-CYC" );
    $str137$Problem_Store_ = makeString( "Problem Store " );
    $str138$_Visualization = makeString( " Visualization" );
    $str139$visControls = makeString( "visControls" );
    $str140$_Most_Recent_ = makeString( "[Most Recent]" );
    $str141$Refresh___ = makeString( "Refresh : " );
    $str142$_Now_ = makeString( "[Now]" );
    $str143$_Auto_ = makeString( "[Auto]" );
    $str144$_Halt_ = makeString( "[Halt]" );
    $str145$Zoom__ = makeString( "Zoom :" );
    $str146$Sequence__ = makeString( "Sequence :" );
    $str147$Begin = makeString( "Begin" );
    $str148$_1000 = makeString( "-1000" );
    $int149$100 = makeInteger( 100 );
    $str150$_100 = makeString( "-100" );
    $str151$_10 = makeString( "-10" );
    $str152$_1 = makeString( "-1" );
    $str153$_1 = makeString( "+1" );
    $str154$_10 = makeString( "+10" );
    $str155$_100 = makeString( "+100" );
    $str156$_1000 = makeString( "+1000" );
    $str157$End = makeString( "End" );
    $kw158$TERSE = makeKeyword( "TERSE" );
    $str159$Percent__ = makeString( "Percent :" );
    $str160$problemStoreVisualizations = makeString( "problemStoreVisualizations" );
    $str161$_D_concurrent_CB_VISUALIZE_PROBLE = makeString( "~D concurrent CB-VISUALIZE-PROBLEMS-FOR-MONITOR calls!" );
    $sym162$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list163 = ConsesLow.list( makeSymbol( "STORE-ID-STRING" ), makeSymbol( "PROBLEM-END-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "MODE-STRING" ) );
    $str164$Error_for_args__S_____S = makeString( "Error for args ~S:~% ~S" );
    $sym165$CB_VISUALIZE_PROBLEMS_FOR_MONITOR = makeSymbol( "CB-VISUALIZE-PROBLEMS-FOR-MONITOR" );
    $kw166$LATEST_INFERENCE = makeKeyword( "LATEST-INFERENCE" );
    $str167$_A__A_did_not_specify_a_problem_s = makeString( "~A ~A did not specify a problem store" );
    $str168$overflow_hidden_ = makeString( "overflow:hidden;" );
    $str169$Visualizing_new_problem_store__S = makeString( "Visualizing new problem store ~S" );
    $int170$25 = makeInteger( 25 );
    $str171$Jumped_problem_end_from__A_to__A_ = makeString( "Jumped problem end from ~A to ~A." );
    $list172 = ConsesLow.list( makeKeyword( "GOODNESS" ) );
    $sym173$NOTIFY_VISUALIZING_PROBLEM_STORE = makeSymbol( "NOTIFY-VISUALIZING-PROBLEM-STORE" );
    $str174$__Visualizing_problem_store__ = makeString( "~&Visualizing problem store~%" );
    $sym175$_NOTIFY_VISUALIZING_PROBLEM_STORE_CACHING_STATE_ = makeSymbol( "*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*" );
    $sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR = makeSymbol( "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR" );
    $str177$Given_layout_of__Dx_D__optimum_ce = makeString( "Given layout of ~Dx~D, optimum cell size is ~Dx~D" );
    $sym178$_COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR_CACHING_STATE_ = makeSymbol( "*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*" );
    $sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE = makeSymbol( "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE" );
    $float180$1_5 = makeDouble( 1.5 );
    $str181$_style_type__text_css______proble = makeString( "<style type=\"text/css\">\n  #problemGrid { border-collapse: collapse }\n  table.problemGrid { border-spacing: 0; margin-left: " );
    $str182$px__margin_top__ = makeString( "px; margin-top: " );
    $str183$px__opacity___75_____table_proble = makeString( "px; opacity: .75 }\n  table.problemGrid tr td { width : " );
    $str184$px__height___ = makeString( "px; height : " );
    $str185$______td_none______border_color__ = makeString(
        "; }\n  td.none    { border-color: transparent; }\n  td.future  { border-color: transparent; }\n  td.invalid { background-color: #3F3F3F; }\n  .problemGrid td.root    { background-color: #FF00FF; }\n  td.root    a:link    { color: #FFFFFF; }\n  td.root    a:visited { color: #FFFFFF; }\n  .problemGrid td.focus   { background-color: #0000FF; }\n  td.focus   a:link    { color: #FFFFFF; }\n  td.focus   a:visited { color: #FFFFFF; }\n  td.path    { background-color: #3FFFFF; }\n  .good    { background-color: #3FFF3F; }\n  .neutral { background-color: #FFFF3F; }\n  .no-good { background-color: #FF3F3F; }\n</style>" );
    $str186$Layout__Dx_D_____A = makeString( "Layout ~Dx~D:~% ~A" );
    $sym187$_HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE_CACHIN = makeSymbol( "*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*" );
    $sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_ = makeSymbol( "*CB-PROBLEM-STORE-LAYOUT-TABLE*" );
    $kw189$NEWEST = makeKeyword( "NEWEST" );
  }

  public static final class $problem_layout_native
      extends
        SubLStructNative
  {
    public SubLObject $problem_store;
    public SubLObject $min_x;
    public SubLObject $max_x;
    public SubLObject $min_y;
    public SubLObject $max_y;
    public SubLObject $grid;
    public SubLObject $next_problem_id;
    public SubLObject $problem_x_table;
    public SubLObject $problem_y_table;
    private static final SubLStructDeclNative structDecl;

    public $problem_layout_native()
    {
      this.$problem_store = CommonSymbols.NIL;
      this.$min_x = CommonSymbols.NIL;
      this.$max_x = CommonSymbols.NIL;
      this.$min_y = CommonSymbols.NIL;
      this.$max_y = CommonSymbols.NIL;
      this.$grid = CommonSymbols.NIL;
      this.$next_problem_id = CommonSymbols.NIL;
      this.$problem_x_table = CommonSymbols.NIL;
      this.$problem_y_table = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $problem_layout_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$problem_store;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$min_x;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$max_x;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$min_y;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$max_y;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$grid;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$next_problem_id;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$problem_x_table;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$problem_y_table;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$problem_store = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$min_x = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$max_x = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$min_y = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$max_y = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$grid = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$next_problem_id = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$problem_x_table = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$problem_y_table = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $problem_layout_native.class, $sym0$PROBLEM_LAYOUT, $sym1$PROBLEM_LAYOUT_P, $list2, $list3, new String[] { "$problem_store", "$min_x", "$max_x", "$min_y", "$max_y",
        "$grid", "$next_problem_id", "$problem_x_table", "$problem_y_table"
      }, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $problem_layout_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $problem_layout_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROBLEM-LAYOUT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return problem_layout_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 634 ms The overlay table (the original one from the page) is made
 * transparent and put in front of the SVG so that the\n links will be clickable
 * and the SVG will still be visible. To make the links sensible, a copy of the
 * overlay table\n (the underlay table) is put under the SVG, and it's
 * visible.\n
 */