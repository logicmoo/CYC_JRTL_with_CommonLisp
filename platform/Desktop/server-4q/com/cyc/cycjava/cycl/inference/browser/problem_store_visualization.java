package com.cyc.cycjava.cycl.inference.browser;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class problem_store_visualization extends SubLTranslatedFile
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
    public static SubLObject problem_layout_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject problem_layout_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $problem_layout_native.class) ? problem_store_visualization.T : problem_store_visualization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_problem_store(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_min_x(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_max_x(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_min_y(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_max_y(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_grid(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_next_problem_id(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_problem_x_table(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject prob_layout_problem_y_table(final SubLObject v_object) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_problem_store(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_min_x(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_max_x(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_min_y(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_max_y(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_grid(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_next_problem_id(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_problem_x_table(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject _csetf_prob_layout_problem_y_table(final SubLObject v_object, final SubLObject value) {
        assert problem_store_visualization.NIL != problem_layout_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject make_problem_layout(SubLObject arglist) {
        if (arglist == problem_store_visualization.UNPROVIDED) {
            arglist = (SubLObject)problem_store_visualization.NIL;
        }
        final SubLObject v_new = (SubLObject)new $problem_layout_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)problem_store_visualization.NIL, next = arglist; problem_store_visualization.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)problem_store_visualization.$kw27$PROBLEM_STORE)) {
                _csetf_prob_layout_problem_store(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw28$MIN_X)) {
                _csetf_prob_layout_min_x(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw29$MAX_X)) {
                _csetf_prob_layout_max_x(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw30$MIN_Y)) {
                _csetf_prob_layout_min_y(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw31$MAX_Y)) {
                _csetf_prob_layout_max_y(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw32$GRID)) {
                _csetf_prob_layout_grid(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw33$NEXT_PROBLEM_ID)) {
                _csetf_prob_layout_next_problem_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw34$PROBLEM_X_TABLE)) {
                _csetf_prob_layout_problem_x_table(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)problem_store_visualization.$kw35$PROBLEM_Y_TABLE)) {
                _csetf_prob_layout_problem_y_table(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)problem_store_visualization.$str36$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject visit_defstruct_problem_layout(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw37$BEGIN, (SubLObject)problem_store_visualization.$sym38$MAKE_PROBLEM_LAYOUT, (SubLObject)problem_store_visualization.NINE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw27$PROBLEM_STORE, prob_layout_problem_store(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw28$MIN_X, prob_layout_min_x(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw29$MAX_X, prob_layout_max_x(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw30$MIN_Y, prob_layout_min_y(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw31$MAX_Y, prob_layout_max_y(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw32$GRID, prob_layout_grid(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw33$NEXT_PROBLEM_ID, prob_layout_next_problem_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw34$PROBLEM_X_TABLE, prob_layout_problem_x_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw39$SLOT, (SubLObject)problem_store_visualization.$kw35$PROBLEM_Y_TABLE, prob_layout_problem_y_table(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)problem_store_visualization.$kw40$END, (SubLObject)problem_store_visualization.$sym38$MAKE_PROBLEM_LAYOUT, (SubLObject)problem_store_visualization.NINE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 943L)
    public static SubLObject visit_defstruct_object_problem_layout_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_problem_layout(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 1399L)
    public static SubLObject new_problem_layout(final SubLObject problem_store) {
        assert problem_store_visualization.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : problem_store;
        final SubLObject layout = make_problem_layout((SubLObject)problem_store_visualization.UNPROVIDED);
        _csetf_prob_layout_problem_store(layout, problem_store);
        _csetf_prob_layout_min_x(layout, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        _csetf_prob_layout_max_x(layout, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        _csetf_prob_layout_min_y(layout, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        _csetf_prob_layout_max_y(layout, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        _csetf_prob_layout_grid(layout, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)problem_store_visualization.EQ), (SubLObject)problem_store_visualization.UNPROVIDED));
        _csetf_prob_layout_next_problem_id(layout, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        _csetf_prob_layout_problem_x_table(layout, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)problem_store_visualization.EQ), (SubLObject)problem_store_visualization.UNPROVIDED));
        _csetf_prob_layout_problem_y_table(layout, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)problem_store_visualization.EQ), (SubLObject)problem_store_visualization.UNPROVIDED));
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2027L)
    public static SubLObject destroy_problem_layout(final SubLObject layout) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        _csetf_prob_layout_problem_store(layout, (SubLObject)problem_store_visualization.$kw43$FREE);
        dictionary.clear_dictionary(prob_layout_grid(layout));
        _csetf_prob_layout_grid(layout, (SubLObject)problem_store_visualization.NIL);
        dictionary.clear_dictionary(prob_layout_problem_x_table(layout));
        _csetf_prob_layout_problem_x_table(layout, (SubLObject)problem_store_visualization.NIL);
        dictionary.clear_dictionary(prob_layout_problem_y_table(layout));
        _csetf_prob_layout_problem_y_table(layout, (SubLObject)problem_store_visualization.NIL);
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2523L)
    public static SubLObject problem_layout_store(final SubLObject layout) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        return prob_layout_problem_store(layout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2665L)
    public static SubLObject problem_layout_next_problem_id(final SubLObject layout) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        return prob_layout_next_problem_id(layout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2807L)
    public static SubLObject problem_layout_problem_store(final SubLObject layout) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        return prob_layout_problem_store(layout);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 2945L)
    public static SubLObject problem_layout_x_lookup(final SubLObject layout, final SubLObject problem) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        assert problem_store_visualization.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return dictionary.dictionary_lookup(prob_layout_problem_x_table(layout), problem, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3163L)
    public static SubLObject problem_layout_y_lookup(final SubLObject layout, final SubLObject problem) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        assert problem_store_visualization.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        return dictionary.dictionary_lookup(prob_layout_problem_y_table(layout), problem, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3367L)
    public static SubLObject problem_layout_grid_lookup(final SubLObject layout, final SubLObject x, final SubLObject y) {
        final SubLObject grid_x_layer = prob_layout_grid(layout);
        if (problem_store_visualization.NIL != grid_x_layer) {
            final SubLObject grid_y_layer = dictionary.dictionary_lookup_without_values(grid_x_layer, x, (SubLObject)problem_store_visualization.UNPROVIDED);
            if (problem_store_visualization.NIL != grid_y_layer) {
                final SubLObject problem = dictionary.dictionary_lookup_without_values(grid_y_layer, y, (SubLObject)problem_store_visualization.UNPROVIDED);
                return problem;
            }
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 3695L)
    public static SubLObject update_problem_layout(final SubLObject layout) {
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        final SubLObject store = problem_layout_problem_store(layout);
        final SubLObject start_id = problem_layout_next_problem_id(layout);
        SubLObject end_var;
        SubLObject end_id;
        SubLObject id;
        SubLObject problem;
        for (end_id = (end_var = inference_datastructures_problem_store.problem_store_historical_problem_count(store)), id = (SubLObject)problem_store_visualization.NIL, id = start_id; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            problem = inference_datastructures_problem_store.find_problem_by_id(store, id);
            if (problem_store_visualization.NIL != inference_datastructures_problem.problem_p(problem)) {
                problem_layout_add(layout, problem);
            }
        }
        _csetf_prob_layout_next_problem_id(layout, end_id);
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 4205L)
    public static SubLObject problem_layout_add(final SubLObject layout, final SubLObject problem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert problem_store_visualization.NIL != problem_layout_p(layout) : layout;
        assert problem_store_visualization.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        final SubLObject parent_problem = earliest_dependent_problem(problem);
        final SubLObject parent_x = (SubLObject)((problem_store_visualization.NIL != parent_problem) ? problem_layout_x_lookup(layout, parent_problem) : problem_store_visualization.ZERO_INTEGER);
        final SubLObject parent_y = (SubLObject)((problem_store_visualization.NIL != parent_problem) ? problem_layout_y_lookup(layout, parent_problem) : problem_store_visualization.ZERO_INTEGER);
        if (problem_store_visualization.NIL != parent_x && problem_store_visualization.NIL != parent_y) {
            thread.resetMultipleValues();
            final SubLObject x = problem_layout_compute_add_location(layout, parent_x, parent_y);
            final SubLObject y = thread.secondMultipleValue();
            thread.resetMultipleValues();
            problem_layout_add_to_grid(layout, x, y, problem);
        }
        else {
            Errors.warn((SubLObject)problem_store_visualization.$str45$unable_to_add_to_layout__S, problem);
        }
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 4814L)
    public static SubLObject problem_layout_add_to_grid(final SubLObject layout, final SubLObject x, final SubLObject y, final SubLObject problem) {
        dictionary.dictionary_enter(prob_layout_problem_x_table(layout), problem, x);
        dictionary.dictionary_enter(prob_layout_problem_y_table(layout), problem, y);
        final SubLObject grid_x_layer = prob_layout_grid(layout);
        SubLObject grid_y_layer = dictionary.dictionary_lookup(grid_x_layer, x, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (problem_store_visualization.NIL == dictionary.dictionary_p(grid_y_layer)) {
            grid_y_layer = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)problem_store_visualization.EQ), (SubLObject)problem_store_visualization.UNPROVIDED);
            dictionary.dictionary_enter(grid_x_layer, x, grid_y_layer);
        }
        dictionary.dictionary_enter(grid_y_layer, y, problem);
        _csetf_prob_layout_min_x(layout, Numbers.min(x, prob_layout_min_x(layout)));
        _csetf_prob_layout_max_x(layout, Numbers.max(x, prob_layout_max_x(layout)));
        _csetf_prob_layout_min_y(layout, Numbers.min(y, prob_layout_min_y(layout)));
        _csetf_prob_layout_max_y(layout, Numbers.max(y, prob_layout_max_y(layout)));
        _csetf_prob_layout_next_problem_id(layout, number_utilities.f_1X(inference_datastructures_problem.problem_suid(problem)));
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 5689L)
    public static SubLObject problem_layout_compute_add_location(final SubLObject layout, final SubLObject parent_x, final SubLObject parent_y) {
        final SubLObject octants = octant_preference_order(parent_x, parent_y);
        SubLObject candidate_x = (SubLObject)problem_store_visualization.NIL;
        SubLObject candidate_y = (SubLObject)problem_store_visualization.NIL;
        SubLObject octant_location = (SubLObject)problem_store_visualization.NIL;
        octant_location = (SubLObject)problem_store_visualization.ZERO_INTEGER;
    Block_10:
        while (true) {
            final SubLObject delta_x = octant_location_delta_x(octant_location);
            final SubLObject delta_y = octant_location_delta_y(octant_location);
            SubLObject cdolist_list_var = octants;
            SubLObject octant = (SubLObject)problem_store_visualization.NIL;
            octant = cdolist_list_var.first();
            while (problem_store_visualization.NIL != cdolist_list_var) {
                candidate_x = parent_x;
                candidate_y = parent_y;
                final SubLObject pcase_var = octant;
                if (pcase_var.eql((SubLObject)problem_store_visualization.ZERO_INTEGER)) {
                    candidate_x = Numbers.add(candidate_x, delta_x);
                    candidate_y = Numbers.add(candidate_y, delta_y);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.ONE_INTEGER)) {
                    candidate_x = Numbers.add(candidate_x, delta_y);
                    candidate_y = Numbers.add(candidate_y, delta_x);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.TWO_INTEGER)) {
                    candidate_x = Numbers.subtract(candidate_x, delta_y);
                    candidate_y = Numbers.add(candidate_y, delta_x);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.THREE_INTEGER)) {
                    candidate_x = Numbers.subtract(candidate_x, delta_x);
                    candidate_y = Numbers.add(candidate_y, delta_y);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.FOUR_INTEGER)) {
                    candidate_x = Numbers.subtract(candidate_x, delta_x);
                    candidate_y = Numbers.subtract(candidate_y, delta_y);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.FIVE_INTEGER)) {
                    candidate_x = Numbers.subtract(candidate_x, delta_y);
                    candidate_y = Numbers.subtract(candidate_y, delta_x);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.SIX_INTEGER)) {
                    candidate_x = Numbers.add(candidate_x, delta_y);
                    candidate_y = Numbers.subtract(candidate_y, delta_x);
                }
                else if (pcase_var.eql((SubLObject)problem_store_visualization.SEVEN_INTEGER)) {
                    candidate_x = Numbers.add(candidate_x, delta_x);
                    candidate_y = Numbers.subtract(candidate_y, delta_y);
                }
                if (problem_store_visualization.NIL == problem_layout_grid_lookup(layout, candidate_x, candidate_y)) {
                    break Block_10;
                }
                cdolist_list_var = cdolist_list_var.rest();
                octant = cdolist_list_var.first();
            }
            octant_location = number_utilities.f_1X(octant_location);
        }
        return Values.values(candidate_x, candidate_y);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 6864L)
    public static SubLObject octant_preference_order(final SubLObject x, final SubLObject y) {
        return (SubLObject)problem_store_visualization.$list46;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7008L)
    public static SubLObject initialize_octant_locations() {
        SubLObject octant_locations = (SubLObject)problem_store_visualization.NIL;
        SubLObject end_var;
        SubLObject x;
        SubLObject end_var_$1;
        SubLObject y;
        for (end_var = Numbers.integerDivide((SubLObject)problem_store_visualization.$int48$316, (SubLObject)problem_store_visualization.TWO_INTEGER), x = (SubLObject)problem_store_visualization.NIL, x = (SubLObject)problem_store_visualization.ZERO_INTEGER; !x.numGE(end_var); x = number_utilities.f_1X(x)) {
            for (end_var_$1 = number_utilities.f_1X(x), y = (SubLObject)problem_store_visualization.NIL, y = (SubLObject)problem_store_visualization.ZERO_INTEGER; !y.numGE(end_var_$1); y = number_utilities.f_1X(y)) {
                octant_locations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(x, y), octant_locations);
            }
        }
        octant_locations = Sort.stable_sort(octant_locations, (SubLObject)problem_store_visualization.$sym49$OCTANT_LOCATION__, (SubLObject)problem_store_visualization.UNPROVIDED);
        problem_store_visualization.$octant_locations$.setGlobalValue(Functions.apply(Symbols.symbol_function((SubLObject)problem_store_visualization.$sym50$VECTOR), octant_locations));
        return Sequences.length(problem_store_visualization.$octant_locations$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7414L)
    public static SubLObject octant_location_L(final SubLObject ol_1, final SubLObject ol_2) {
        SubLObject x_1 = (SubLObject)problem_store_visualization.NIL;
        SubLObject y_1 = (SubLObject)problem_store_visualization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(ol_1, ol_1, (SubLObject)problem_store_visualization.$list51);
        x_1 = ol_1.first();
        SubLObject current = ol_1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ol_1, (SubLObject)problem_store_visualization.$list51);
        y_1 = current.first();
        current = current.rest();
        if (problem_store_visualization.NIL == current) {
            SubLObject x_2 = (SubLObject)problem_store_visualization.NIL;
            SubLObject y_2 = (SubLObject)problem_store_visualization.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(ol_2, ol_2, (SubLObject)problem_store_visualization.$list52);
            x_2 = ol_2.first();
            SubLObject current_$3 = ol_2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$3, ol_2, (SubLObject)problem_store_visualization.$list52);
            y_2 = current_$3.first();
            current_$3 = current_$3.rest();
            if (problem_store_visualization.NIL == current_$3) {
                return Numbers.numL(Numbers.add(Numbers.multiply(x_1, x_1), Numbers.multiply(y_1, y_1)), Numbers.add(Numbers.multiply(x_2, x_2), Numbers.multiply(y_2, y_2)));
            }
            cdestructuring_bind.cdestructuring_bind_error(ol_2, (SubLObject)problem_store_visualization.$list52);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(ol_1, (SubLObject)problem_store_visualization.$list51);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7629L)
    public static SubLObject octant_location_delta_x(final SubLObject octant_location) {
        if (problem_store_visualization.NIL == problem_store_visualization.$octant_locations$.getGlobalValue()) {
            initialize_octant_locations();
        }
        return Vectors.aref(problem_store_visualization.$octant_locations$.getGlobalValue(), octant_location).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7812L)
    public static SubLObject octant_location_delta_y(final SubLObject octant_location) {
        if (problem_store_visualization.NIL == problem_store_visualization.$octant_locations$.getGlobalValue()) {
            initialize_octant_locations();
        }
        return conses_high.second(Vectors.aref(problem_store_visualization.$octant_locations$.getGlobalValue(), octant_location));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 7996L)
    public static SubLObject earliest_dependent_problem(final SubLObject problem) {
        SubLObject earliest_id = inference_datastructures_problem.problem_suid(problem);
        SubLObject earliest_problem = (SubLObject)problem_store_visualization.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        SubLObject parent_problem;
        SubLObject parent_id;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)problem_store_visualization.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); problem_store_visualization.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (problem_store_visualization.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                parent_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                if (problem_store_visualization.NIL != parent_problem) {
                    parent_id = inference_datastructures_problem.problem_suid(parent_problem);
                    if (parent_id.numL(earliest_id)) {
                        earliest_id = parent_id;
                        earliest_problem = parent_problem;
                    }
                }
            }
        }
        return earliest_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8501L)
    public static SubLObject problem_store_most_recent_problem(final SubLObject store) {
        SubLObject end_var;
        SubLObject id;
        SubLObject problem;
        for (end_var = (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, id = (SubLObject)problem_store_visualization.NIL, id = inference_datastructures_problem_store.problem_store_historical_problem_count(store); !id.numLE(end_var); id = Numbers.add(id, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER)) {
            problem = inference_datastructures_problem_store.find_problem_by_id(store, id);
            if (problem_store_visualization.NIL != problem) {
                return problem;
            }
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8742L)
    public static SubLObject all_problem_ancestor_problems(final SubLObject problem) {
        return all_problem_ancestor_problems_recursive(problem, set_contents.new_set_contents((SubLObject)problem_store_visualization.ZERO_INTEGER, Symbols.symbol_function((SubLObject)problem_store_visualization.EQ)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 8887L)
    public static SubLObject all_problem_ancestor_problems_recursive(final SubLObject problem, SubLObject ancestor_set) {
        if (problem_store_visualization.NIL == set_contents.set_contents_memberP(problem, ancestor_set, Symbols.symbol_function((SubLObject)problem_store_visualization.EQ))) {
            ancestor_set = set_contents.set_contents_add(problem, ancestor_set, (SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject link;
            SubLObject ancestor_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)problem_store_visualization.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); problem_store_visualization.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                link = set_contents.do_set_contents_next(basis_object, state);
                if (problem_store_visualization.NIL != set_contents.do_set_contents_element_validP(state, link)) {
                    ancestor_problem = inference_datastructures_problem_link.problem_link_supported_problem(link);
                    if (problem_store_visualization.NIL != ancestor_problem) {
                        ancestor_set = all_problem_ancestor_problems_recursive(ancestor_problem, ancestor_set);
                    }
                }
            }
        }
        return ancestor_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9357L)
    public static SubLObject problem_oldest_ancestor_path(final SubLObject problem) {
        return problem_oldest_ancestor_path_recursive(problem, (SubLObject)problem_store_visualization.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9478L)
    public static SubLObject problem_oldest_ancestor_path_recursive(final SubLObject problem, SubLObject ancestor_path) {
        if (problem_store_visualization.NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            return ancestor_path;
        }
        ancestor_path = (SubLObject)ConsesLow.cons(problem, ancestor_path);
        final SubLObject oldest_parent_problem = problem_oldest_parent_problem(problem);
        if (problem_store_visualization.NIL == oldest_parent_problem) {
            return ancestor_path;
        }
        return problem_oldest_ancestor_path_recursive(oldest_parent_problem, ancestor_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 9873L)
    public static SubLObject problem_oldest_parent_problem(final SubLObject problem) {
        final SubLObject parent_problems = inference_datastructures_problem.problem_supported_problems(problem);
        final SubLObject oldest_parent_problem = list_utilities.extremal(parent_problems, Symbols.symbol_function((SubLObject)problem_store_visualization.$sym53$_), Symbols.symbol_function((SubLObject)problem_store_visualization.$sym54$PROBLEM_SUID));
        if (problem_store_visualization.NIL != oldest_parent_problem && inference_datastructures_problem.problem_suid(oldest_parent_problem).numL(inference_datastructures_problem.problem_suid(problem))) {
            return oldest_parent_problem;
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10433L)
    public static SubLObject problem_oldest_link_to_parent(final SubLObject problem, final SubLObject parent) {
        assert problem_store_visualization.NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject links = (SubLObject)problem_store_visualization.NIL;
        final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)problem_store_visualization.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); problem_store_visualization.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            link = set_contents.do_set_contents_next(basis_object, state);
            if (problem_store_visualization.NIL != set_contents.do_set_contents_element_validP(state, link) && parent.eql(inference_datastructures_problem_link.problem_link_supported_object(link))) {
                links = (SubLObject)ConsesLow.cons(link, links);
            }
        }
        return list_utilities.extremal(links, Symbols.symbol_function((SubLObject)problem_store_visualization.$sym53$_), Symbols.symbol_function((SubLObject)problem_store_visualization.$sym55$PROBLEM_LINK_SUID));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10737L)
    public static SubLObject problem_proof_count_rectangle(final SubLObject problem) {
        return squarest_rectangle_for_integer_area(inference_datastructures_problem.problem_proof_count(problem, (SubLObject)problem_store_visualization.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 10865L)
    public static SubLObject squarest_rectangle_for_integer_area(final SubLObject area) {
        assert problem_store_visualization.NIL != subl_promotions.non_negative_integer_p(area) : area;
        SubLObject height;
        SubLObject width = height = Numbers.isqrt(area);
        if (!area.numLE(Numbers.multiply(width, height))) {
            width = Numbers.add(width, (SubLObject)problem_store_visualization.ONE_INTEGER);
        }
        if (!area.numLE(Numbers.multiply(width, height))) {
            height = Numbers.add(height, (SubLObject)problem_store_visualization.ONE_INTEGER);
        }
        return Values.values(width, height);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 11172L)
    public static SubLObject html_problem_layout_visualization_table(final SubLObject layout, SubLObject size, SubLObject problem_end, SubLObject table_style, SubLObject scheme) {
        if (size == problem_store_visualization.UNPROVIDED) {
            size = (SubLObject)problem_store_visualization.NIL;
        }
        if (problem_end == problem_store_visualization.UNPROVIDED) {
            problem_end = (SubLObject)problem_store_visualization.NIL;
        }
        if (table_style == problem_store_visualization.UNPROVIDED) {
            table_style = (SubLObject)problem_store_visualization.NIL;
        }
        if (scheme == problem_store_visualization.UNPROVIDED) {
            scheme = (SubLObject)problem_store_visualization.$kw57$GOODNESS;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (problem_store_visualization.NIL == size) {
            size = (SubLObject)problem_store_visualization.EIGHT_INTEGER;
        }
        final SubLObject store = problem_layout_store(layout);
        final SubLObject grid_id = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str58$ps_, new SubLObject[] { format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(store)), problem_store_visualization.$str59$_, format_nil.format_nil_a_no_copy(scheme) });
        final SubLObject most_recent_problem = problem_end.isNegative() ? problem_store_most_recent_problem(store) : inference_datastructures_problem_store.find_problem_by_id(store, number_utilities.f_1_(problem_end));
        final SubLObject ancestor_path = (SubLObject)((problem_store_visualization.NIL != most_recent_problem) ? problem_oldest_ancestor_path(most_recent_problem) : problem_store_visualization.NIL);
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), table_style);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        html_utilities.html_markup((SubLObject)problem_store_visualization.$str60$problemGrid);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (problem_store_visualization.NIL != grid_id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_markup(grid_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject x_start = prob_layout_min_x(layout);
            final SubLObject x_end = number_utilities.f_1X(prob_layout_max_x(layout));
            final SubLObject y_start = prob_layout_max_y(layout);
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
            for (y_end = (end_var = number_utilities.f_1_(prob_layout_min_y(layout))), y = (SubLObject)problem_store_visualization.NIL, y = y_start; !y.numLE(end_var); y = Numbers.add(y, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                html_utilities.html_markup((SubLObject)problem_store_visualization.$kw61$CENTER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                    for (end_var_$5 = x_end, x = (SubLObject)problem_store_visualization.NIL, x = x_start; !x.numGE(end_var_$5); x = number_utilities.f_1X(x)) {
                        problem = problem_layout_grid_lookup(layout, x, y);
                        id = html_problem_layout_id(problem, scheme);
                        v_class = html_problem_layout_class(scheme, problem, most_recent_problem, ancestor_path, problem_end);
                        html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (problem_store_visualization.NIL != id) {
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                            html_utilities.html_markup(id);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                        }
                        if (problem_store_visualization.NIL != v_class) {
                            html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                            html_utilities.html_markup(v_class);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                        _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                            if (problem_store_visualization.NIL != problem) {
                                if (size.numGE((SubLObject)problem_store_visualization.TWENTY_INTEGER)) {
                                    cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw62$PROBLEM, problem, (SubLObject)problem_store_visualization.$kw63$MINIMAL, (SubLObject)problem_store_visualization.NIL, inference_datastructures_problem.problem_suid(problem), (SubLObject)problem_store_visualization.UNPROVIDED);
                                }
                                else if (size.numGE((SubLObject)problem_store_visualization.SIXTEEN_INTEGER)) {
                                    cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw62$PROBLEM, problem, (SubLObject)problem_store_visualization.$kw63$MINIMAL, (SubLObject)problem_store_visualization.NIL, (SubLObject)problem_store_visualization.$str64$_, (SubLObject)problem_store_visualization.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 12978L)
    public static SubLObject html_problem_layout_visualization_animation_controls(final SubLObject layout, final SubLObject schemes, SubLObject last_available_problem_id) {
        if (last_available_problem_id == problem_store_visualization.UNPROVIDED) {
            last_available_problem_id = (SubLObject)problem_store_visualization.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = html_problem_layout_visualization_slider_ids(layout);
        SubLObject slider_id = (SubLObject)problem_store_visualization.NIL;
        SubLObject slider_field_id = (SubLObject)problem_store_visualization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)problem_store_visualization.$list65);
        slider_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)problem_store_visualization.$list65);
        slider_field_id = current.first();
        current = current.rest();
        if (problem_store_visualization.NIL == current) {
            cyc_file_dependencies.javascript((SubLObject)problem_store_visualization.$kw66$EXT_ALL);
            cyc_file_dependencies.javascript((SubLObject)problem_store_visualization.$kw67$RAPHAEL);
            SubLObject parent_id_json = (SubLObject)problem_store_visualization.NIL;
            final SubLObject store = problem_layout_store(layout);
            SubLObject s = (SubLObject)problem_store_visualization.NIL;
            try {
                s = streams_high.make_private_string_output_stream();
                print_high.princ((SubLObject)problem_store_visualization.$str68$_, s);
                SubLObject end_var;
                SubLObject problem_id;
                SubLObject oldest_problem;
                SubLObject oldest_id;
                for (end_var = last_available_problem_id, problem_id = (SubLObject)problem_store_visualization.NIL, problem_id = (SubLObject)problem_store_visualization.ZERO_INTEGER; !problem_id.numGE(end_var); problem_id = number_utilities.f_1X(problem_id)) {
                    oldest_problem = problem_oldest_parent_problem(inference_datastructures_problem_store.find_problem_by_id(store, problem_id));
                    oldest_id = (SubLObject)((problem_store_visualization.NIL != oldest_problem) ? inference_datastructures_problem.problem_suid(oldest_problem) : problem_store_visualization.$str69$null);
                    print_high.princ(oldest_id, s);
                    print_high.princ((SubLObject)problem_store_visualization.$str70$_, s);
                }
                print_high.princ((SubLObject)problem_store_visualization.$str71$_, s);
                parent_id_json = streams_high.get_output_stream_string(s);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)problem_store_visualization.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(s, (SubLObject)problem_store_visualization.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)problem_store_visualization.$str72$_script_type__text_javascript____, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid(store), parent_id_json, number_utilities.f_1_(last_available_problem_id) });
            html_utilities.html_markup(html_problem_layout_visualization_scripts(layout, schemes, slider_id, slider_field_id, last_available_problem_id));
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)problem_store_visualization.$list65);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 14142L)
    public static SubLObject html_problem_layout_visualization_animation_controls_placeholder(final SubLObject layout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = html_problem_layout_visualization_slider_ids(layout);
        SubLObject slider_id = (SubLObject)problem_store_visualization.NIL;
        SubLObject slider_field_id = (SubLObject)problem_store_visualization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)problem_store_visualization.$list65);
        slider_id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)problem_store_visualization.$list65);
        slider_field_id = current.first();
        current = current.rest();
        if (problem_store_visualization.NIL == current) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)problem_store_visualization.$str73$_style_type__text_css_______A_tab, new SubLObject[] { slider_id, slider_field_id, slider_field_id });
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_markup((SubLObject)problem_store_visualization.$str74$height_1_5em);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    if (problem_store_visualization.NIL != slider_id) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                        html_utilities.html_markup(slider_id);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                if (problem_store_visualization.NIL != slider_field_id) {
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                    html_utilities.html_markup(slider_field_id);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            return (SubLObject)problem_store_visualization.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)problem_store_visualization.$list65);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 14745L)
    public static SubLObject html_problem_layout_visualization_slider_ids(final SubLObject layout) {
        final SubLObject slider_id = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str75$ps, new SubLObject[] { format_nil.format_nil_s_no_copy(inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout))), problem_store_visualization.$str76$_slider });
        final SubLObject slider_field_id = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str75$ps, new SubLObject[] { format_nil.format_nil_s_no_copy(inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout))), problem_store_visualization.$str77$_slider_field });
        return (SubLObject)ConsesLow.list(slider_id, slider_field_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 21982L)
    public static SubLObject html_problem_layout_visualization_scripts(final SubLObject layout, final SubLObject schemes, final SubLObject slider_id, final SubLObject slider_field_id, SubLObject last_available_problem) {
        if (last_available_problem == problem_store_visualization.UNPROVIDED) {
            last_available_problem = (SubLObject)problem_store_visualization.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject scheme_json = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str79$__, new SubLObject[] { format_nil.format_nil_a_no_copy(string_utilities.bunge_with_string(Mapping.mapcar((SubLObject)problem_store_visualization.$sym80$TO_STRING, schemes), (SubLObject)problem_store_visualization.$str81$___)), problem_store_visualization.$str82$__ });
        final SubLObject last_visible_problem_id = (problem_store_visualization.NIL != number_utilities.f_1_(last_available_problem)) ? number_utilities.f_1_(last_available_problem) : number_utilities.f_1_(inference_datastructures_problem_store.problem_store_problem_count(problem_layout_problem_store(layout)));
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_layout_problem_store(layout));
        return PrintLow.format((SubLObject)problem_store_visualization.NIL, problem_store_visualization.$html_problem_layout_visualization_script_template$.getDynamicValue(thread), new SubLObject[] { last_visible_problem_id, scheme_json, problem_store_id, slider_id, slider_field_id });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22637L)
    public static SubLObject html_problem_layout_id(final SubLObject problem, final SubLObject scheme) {
        if (problem_store_visualization.NIL != problem) {
            return Sequences.cconcatenate((SubLObject)problem_store_visualization.$str83$p_, new SubLObject[] { format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(inference_datastructures_problem.problem_store(problem))), problem_store_visualization.$str59$_, format_nil.format_nil_a_no_copy(inference_datastructures_problem.problem_suid(problem)), problem_store_visualization.$str59$_, format_nil.format_nil_a_no_copy(string_utilities.to_string(scheme)) });
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
    public static SubLObject clear_html_problem_layout_visualization_table_style() {
        final SubLObject cs = problem_store_visualization.$html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
    public static SubLObject remove_html_problem_layout_visualization_table_style(final SubLObject size) {
        return memoization_state.caching_state_remove_function_results_with_args(problem_store_visualization.$html_problem_layout_visualization_table_style_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(size), (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
    public static SubLObject html_problem_layout_visualization_table_style_internal(final SubLObject size) {
        final SubLObject td_border_width = (SubLObject)(size.numG((SubLObject)problem_store_visualization.FIVE_INTEGER) ? problem_store_visualization.ONE_INTEGER : problem_store_visualization.ZERO_INTEGER);
        final SubLObject td_border = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str85$solid_gray_, new SubLObject[] { format_nil.format_nil_d_no_copy(td_border_width), problem_store_visualization.$str86$px });
        return Sequences.cconcatenate((SubLObject)problem_store_visualization.$str87$_style_type__text_css_______probl, new SubLObject[] { format_nil.format_nil_a_no_copy(Numbers.min((SubLObject)problem_store_visualization.TWO_INTEGER, Numbers.integerDivide(size, (SubLObject)problem_store_visualization.EIGHT_INTEGER))), problem_store_visualization.$str88$px__background___000000_______pro, format_nil.format_nil_a_no_copy(size), problem_store_visualization.$str89$px__height__, format_nil.format_nil_a_no_copy(size), problem_store_visualization.$str90$px__border__, format_nil.format_nil_a_no_copy(td_border), problem_store_visualization.$str91$__font_family__courier__fixed__wh, format_nil.format_nil_a_no_copy(size), problem_store_visualization.$str89$px__height__, format_nil.format_nil_a_no_copy(size), problem_store_visualization.$str92$px__font_family__courier__fixed__ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 22914L)
    public static SubLObject html_problem_layout_visualization_table_style(final SubLObject size) {
        SubLObject caching_state = problem_store_visualization.$html_problem_layout_visualization_table_style_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)problem_store_visualization.$sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE, (SubLObject)problem_store_visualization.$sym93$_HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE_CACHING_STATE_, (SubLObject)problem_store_visualization.SIXTEEN_INTEGER, (SubLObject)problem_store_visualization.EQL, (SubLObject)problem_store_visualization.ONE_INTEGER, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, size, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_problem_layout_visualization_table_style_internal(size)));
            memoization_state.caching_state_put(caching_state, size, results, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25147L)
    public static SubLObject html_problem_layout_visualization_page_css() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)problem_store_visualization.$str94$_style_type__text_css_____body_x_);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25382L)
    public static SubLObject html_problem_layout_class(final SubLObject scheme, final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        if (scheme.eql((SubLObject)problem_store_visualization.$kw57$GOODNESS)) {
            return html_problem_layout_class_by_goodness(problem, most_recent_problem, ancestor_path, problem_end);
        }
        if (scheme.eql((SubLObject)problem_store_visualization.$kw95$STRATEGY)) {
            return html_problem_layout_class_by_strategy(problem, most_recent_problem, ancestor_path, problem_end);
        }
        return Errors.error((SubLObject)problem_store_visualization.$str96$unexpected_visualization_scheme__, scheme);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 25915L)
    public static SubLObject html_problem_layout_class_by_goodness(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        SubLObject v_class = (SubLObject)problem_store_visualization.NIL;
        if (problem_store_visualization.NIL == problem) {
            v_class = (SubLObject)problem_store_visualization.$str97$problem_none;
        }
        else if (problem_store_visualization.NIL == inference_datastructures_problem.valid_problem_p(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str98$problem_invalid;
        }
        else if (problem_end.isInteger() && !problem_end.isNegative() && !inference_datastructures_problem.problem_suid(problem).numL(problem_end)) {
            v_class = (SubLObject)problem_store_visualization.$str99$problem_future;
        }
        else if (problem_store_visualization.NIL != inference_datastructures_problem.problem_has_answer_link_p(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str100$problem_root;
        }
        else if (problem_store_visualization.NIL != inference_worker.good_problem_p(problem, (SubLObject)problem_store_visualization.$kw101$TACTICAL)) {
            v_class = (SubLObject)problem_store_visualization.$str102$problem_good;
        }
        else if (problem_store_visualization.NIL != inference_worker.neutral_problem_p(problem, (SubLObject)problem_store_visualization.$kw101$TACTICAL)) {
            v_class = (SubLObject)problem_store_visualization.$str103$problem_neutral;
        }
        else {
            v_class = (SubLObject)problem_store_visualization.$str104$problem_no_good;
        }
        if (problem_store_visualization.NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            v_class = Sequences.cconcatenate(v_class, (SubLObject)problem_store_visualization.$str105$_path);
        }
        if (problem_store_visualization.NIL != most_recent_problem && problem.eql(most_recent_problem)) {
            v_class = Sequences.cconcatenate(v_class, (SubLObject)problem_store_visualization.$str106$_focus);
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 26912L)
    public static SubLObject html_problem_layout_class_by_strategy(final SubLObject problem, final SubLObject most_recent_problem, final SubLObject ancestor_path, final SubLObject problem_end) {
        SubLObject v_class = (SubLObject)problem_store_visualization.NIL;
        if (problem_store_visualization.NIL == problem) {
            v_class = (SubLObject)problem_store_visualization.$str97$problem_none;
        }
        else if (problem_store_visualization.NIL == inference_datastructures_problem.valid_problem_p(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str98$problem_invalid;
        }
        else if (problem_end.isInteger() && !problem_end.isNegative() && !inference_datastructures_problem.problem_suid(problem).numL(problem_end)) {
            v_class = (SubLObject)problem_store_visualization.$str99$problem_future;
        }
        else if (problem_store_visualization.NIL != inference_datastructures_problem.problem_has_answer_link_p(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str100$problem_root;
        }
        else if (problem_store_visualization.NIL != inference_worker.problem_has_any_new_root_motivationP(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str107$problem_new_root;
        }
        else if (problem_store_visualization.NIL != inference_worker.problem_has_any_transformation_motivationP(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str108$problem_transformation;
        }
        else if (problem_store_visualization.NIL != inference_worker.problem_has_any_removal_motivationP(problem)) {
            v_class = (SubLObject)problem_store_visualization.$str109$problem_removal;
        }
        else {
            v_class = (SubLObject)problem_store_visualization.$str110$problem_unmotivated;
        }
        if (problem_store_visualization.NIL != list_utilities.member_eqP(problem, ancestor_path)) {
            v_class = Sequences.cconcatenate(v_class, (SubLObject)problem_store_visualization.$str105$_path);
        }
        if (problem.eql(most_recent_problem)) {
            v_class = Sequences.cconcatenate(v_class, (SubLObject)problem_store_visualization.$str106$_focus);
        }
        return v_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 28034L)
    public static SubLObject cb_link_visualize_problems(final SubLObject store, SubLObject linktext, SubLObject refresh_rate, SubLObject size, SubLObject problem_end) {
        if (linktext == problem_store_visualization.UNPROVIDED) {
            linktext = (SubLObject)problem_store_visualization.NIL;
        }
        if (refresh_rate == problem_store_visualization.UNPROVIDED) {
            refresh_rate = (SubLObject)problem_store_visualization.NIL;
        }
        if (size == problem_store_visualization.UNPROVIDED) {
            size = (SubLObject)problem_store_visualization.NIL;
        }
        if (problem_end == problem_store_visualization.UNPROVIDED) {
            problem_end = (SubLObject)problem_store_visualization.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (problem_store_visualization.NIL == linktext) {
            linktext = (SubLObject)problem_store_visualization.$str111$_Visualize_;
        }
        if (problem_store_visualization.NIL == refresh_rate) {
            refresh_rate = (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER;
        }
        if (problem_store_visualization.NIL == size) {
            size = best_problem_store_visualizer_zoom_level_for_store(store);
        }
        if (problem_store_visualization.NIL == problem_end) {
            problem_end = (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)problem_store_visualization.$kw112$SELF);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)problem_store_visualization.$str113$cb_visualize_problems__A__A__A__A, new SubLObject[] { inference_datastructures_problem_store.problem_store_suid(store), refresh_rate, size, problem_end });
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (problem_store_visualization.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 28548L)
    public static SubLObject cb_visualize_problems(final SubLObject args) {
        SubLObject store_id_string = (SubLObject)problem_store_visualization.NIL;
        SubLObject refresh_string = (SubLObject)problem_store_visualization.NIL;
        SubLObject size_string = (SubLObject)problem_store_visualization.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)problem_store_visualization.$list116);
        store_id_string = args.first();
        SubLObject current = args.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)problem_store_visualization.$list116);
        refresh_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)problem_store_visualization.$list116);
        size_string = current.first();
        current = current.rest();
        final SubLObject problem_end_string = (SubLObject)(current.isCons() ? current.first() : problem_store_visualization.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)problem_store_visualization.$list116);
        current = current.rest();
        if (problem_store_visualization.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)problem_store_visualization.$list116);
            return (SubLObject)problem_store_visualization.NIL;
        }
        final SubLObject store = cb_inference_browser.cb_guess_problem_store(store_id_string);
        if (problem_store_visualization.NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            return cb_utilities.cb_error((SubLObject)problem_store_visualization.$str117$_A_did_not_specify_a_problem_stor, store_id_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        final SubLObject refresh_rate = reader.read_from_string_ignoring_errors(refresh_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject size = reader.read_from_string_ignoring_errors(size_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject problem_end = (problem_store_visualization.NIL != problem_end_string) ? reader.read_from_string_ignoring_errors(problem_end_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED) : inference_datastructures_problem_store.problem_store_problem_count(store);
        final SubLObject layout = cb_problem_store_layout(store);
        final SubLObject table_style = html_problem_layout_visualization_table_style(size);
        update_problem_layout(layout);
        return cb_visualize_problems_guts(layout, refresh_rate, size, problem_end, table_style, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 29412L)
    public static SubLObject best_problem_store_visualizer_zoom_level_for_store(final SubLObject store) {
        final SubLObject count = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        if (count.numG((SubLObject)problem_store_visualization.$int120$100000)) {
            return (SubLObject)problem_store_visualization.THREE_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int121$50000)) {
            return (SubLObject)problem_store_visualization.FOUR_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int122$24000)) {
            return (SubLObject)problem_store_visualization.FIVE_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int123$12000)) {
            return (SubLObject)problem_store_visualization.EIGHT_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int124$5000)) {
            return (SubLObject)problem_store_visualization.TEN_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int125$2000)) {
            return (SubLObject)problem_store_visualization.SIXTEEN_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int126$1000)) {
            return (SubLObject)problem_store_visualization.TWENTY_INTEGER;
        }
        if (count.numG((SubLObject)problem_store_visualization.$int127$500)) {
            return (SubLObject)problem_store_visualization.$int128$32;
        }
        return (SubLObject)problem_store_visualization.$int129$40;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 29974L)
    public static SubLObject cb_visualize_problems_guts(final SubLObject layout, final SubLObject refresh_rate, final SubLObject size, final SubLObject problem_end, final SubLObject table_style, SubLObject suppress_textual_outputP, SubLObject show_copyrightP, SubLObject body_style, SubLObject visualization_schemes) {
        if (suppress_textual_outputP == problem_store_visualization.UNPROVIDED) {
            suppress_textual_outputP = (SubLObject)problem_store_visualization.NIL;
        }
        if (show_copyrightP == problem_store_visualization.UNPROVIDED) {
            show_copyrightP = (SubLObject)problem_store_visualization.T;
        }
        if (body_style == problem_store_visualization.UNPROVIDED) {
            body_style = (SubLObject)problem_store_visualization.$str131$;
        }
        if (visualization_schemes == problem_store_visualization.UNPROVIDED) {
            visualization_schemes = (SubLObject)problem_store_visualization.$list132;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store = problem_layout_store(layout);
        final SubLObject sequence_max = inference_datastructures_problem_store.problem_store_historical_problem_count(store);
        final SubLObject current_end = problem_end.isNegative() ? sequence_max : problem_end;
        html_utilities.html_markup((SubLObject)problem_store_visualization.$str133$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (problem_store_visualization.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_markup((SubLObject)problem_store_visualization.$str134$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == problem_store_visualization.$kw135$UNINITIALIZED) ? ConsesLow.list(problem_store_visualization.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            cyc_file_dependencies.css((SubLObject)problem_store_visualization.$kw66$EXT_ALL);
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)problem_store_visualization.$kw136$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ(Sequences.cconcatenate((SubLObject)problem_store_visualization.$str137$Problem_Store_, new SubLObject[] { format_nil.format_nil_a_no_copy(inference_datastructures_problem_store.problem_store_suid(store)), problem_store_visualization.$str138$_Visualization }));
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            if (!refresh_rate.isNegative()) {
                html_utilities.html_refresh(refresh_rate, (SubLObject)problem_store_visualization.UNPROVIDED);
            }
            html_problem_layout_visualization_page_css();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)problem_store_visualization.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_body_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                html_utilities.html_markup(body_style);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                    if (problem_store_visualization.NIL == suppress_textual_outputP) {
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)problem_store_visualization.$str139$visControls);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                            html_utilities.html_princ((SubLObject)problem_store_visualization.$str137$Problem_Store_);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw27$PROBLEM_STORE, store, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
                            if (!store.eql(inference_datastructures_problem_store.most_recent_problem_store())) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.UNPROVIDED);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, inference_datastructures_problem_store.most_recent_problem_store(), (SubLObject)problem_store_visualization.$str140$_Most_Recent_, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
                            }
                            html_utilities.html_indent((SubLObject)problem_store_visualization.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)problem_store_visualization.$str141$Refresh___);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str142$_Now_, refresh_rate, size, problem_end);
                            html_utilities.html_indent((SubLObject)problem_store_visualization.UNPROVIDED);
                            if (refresh_rate.isNegative()) {
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str143$_Auto_, (SubLObject)problem_store_visualization.FIVE_INTEGER, size, problem_end);
                            }
                            else {
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str144$_Halt_, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, problem_end);
                            }
                            html_utilities.html_indent((SubLObject)problem_store_visualization.TWO_INTEGER);
                            html_utilities.html_princ((SubLObject)problem_store_visualization.$str145$Zoom__);
                            SubLObject cdolist_list_var = problem_store_visualization.$cb_problem_store_default_zoom_levels$.getDynamicValue(thread);
                            SubLObject zoom = (SubLObject)problem_store_visualization.NIL;
                            zoom = cdolist_list_var.first();
                            while (problem_store_visualization.NIL != cdolist_list_var) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.UNPROVIDED);
                                if (zoom.numE(size)) {
                                    html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                    cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end);
                                    html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                }
                                else {
                                    cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, zoom, refresh_rate, zoom, problem_end);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                zoom = cdolist_list_var.first();
                            }
                            html_utilities.html_newline((SubLObject)problem_store_visualization.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)problem_store_visualization.$str146$Sequence__);
                            html_utilities.html_indent((SubLObject)problem_store_visualization.TWO_INTEGER);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str147$Begin, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, (SubLObject)problem_store_visualization.ONE_INTEGER);
                            if (sequence_max.numG((SubLObject)problem_store_visualization.$int126$1000)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str148$_1000, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.max((SubLObject)problem_store_visualization.ONE_INTEGER, Numbers.subtract(current_end, (SubLObject)problem_store_visualization.$int126$1000)));
                            }
                            if (sequence_max.numG((SubLObject)problem_store_visualization.$int149$100)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str150$_100, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.max((SubLObject)problem_store_visualization.ONE_INTEGER, Numbers.subtract(current_end, (SubLObject)problem_store_visualization.$int149$100)));
                            }
                            if (sequence_max.numG((SubLObject)problem_store_visualization.TEN_INTEGER)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str151$_10, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.max((SubLObject)problem_store_visualization.ONE_INTEGER, Numbers.subtract(current_end, (SubLObject)problem_store_visualization.TEN_INTEGER)));
                            }
                            html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str152$_1, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.max((SubLObject)problem_store_visualization.ONE_INTEGER, Numbers.subtract(current_end, (SubLObject)problem_store_visualization.ONE_INTEGER)));
                            html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                            html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, current_end, refresh_rate, size, current_end);
                            html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str153$_1, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.min(sequence_max, Numbers.add(current_end, (SubLObject)problem_store_visualization.ONE_INTEGER)));
                            if (sequence_max.numG((SubLObject)problem_store_visualization.TEN_INTEGER)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str154$_10, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.min(sequence_max, Numbers.add(current_end, (SubLObject)problem_store_visualization.TEN_INTEGER)));
                            }
                            if (sequence_max.numG((SubLObject)problem_store_visualization.$int149$100)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str155$_100, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.min(sequence_max, Numbers.add(current_end, (SubLObject)problem_store_visualization.$int149$100)));
                            }
                            if (sequence_max.numG((SubLObject)problem_store_visualization.$int126$1000)) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str156$_1000, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, Numbers.min(sequence_max, Numbers.add(current_end, (SubLObject)problem_store_visualization.$int126$1000)));
                            }
                            html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                            cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, (SubLObject)problem_store_visualization.$str157$End, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER);
                            final SubLObject problem = inference_datastructures_problem_store.find_problem_by_id(store, number_utilities.f_1_(current_end));
                            if (problem_store_visualization.NIL != problem) {
                                html_utilities.html_indent((SubLObject)problem_store_visualization.FOUR_INTEGER);
                                cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw62$PROBLEM, problem, (SubLObject)problem_store_visualization.$kw158$TERSE, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
                            }
                            html_utilities.html_indent((SubLObject)problem_store_visualization.FOUR_INTEGER);
                            if (sequence_max.numGE((SubLObject)problem_store_visualization.TEN_INTEGER)) {
                                html_utilities.html_newline((SubLObject)problem_store_visualization.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)problem_store_visualization.$str159$Percent__);
                                html_utilities.html_indent((SubLObject)problem_store_visualization.THREE_INTEGER);
                                SubLObject i;
                                SubLObject percent;
                                SubLObject percent_problem_end;
                                SubLObject precise_percent_current_end;
                                SubLObject percent_current_end;
                                for (i = (SubLObject)problem_store_visualization.NIL, i = (SubLObject)problem_store_visualization.ZERO_INTEGER; i.numL((SubLObject)problem_store_visualization.ELEVEN_INTEGER); i = Numbers.add(i, (SubLObject)problem_store_visualization.ONE_INTEGER)) {
                                    percent = Numbers.multiply(i, (SubLObject)problem_store_visualization.TEN_INTEGER);
                                    percent_problem_end = Numbers.integerDivide(Numbers.multiply(i, sequence_max), (SubLObject)problem_store_visualization.TEN_INTEGER);
                                    precise_percent_current_end = number_utilities.percent(current_end, sequence_max, (SubLObject)problem_store_visualization.THREE_INTEGER);
                                    percent_current_end = Numbers.multiply((SubLObject)problem_store_visualization.TEN_INTEGER, Numbers.ceiling(Numbers.divide(Numbers.multiply(current_end, (SubLObject)problem_store_visualization.TEN_INTEGER), sequence_max), (SubLObject)problem_store_visualization.UNPROVIDED));
                                    if (percent.numE(percent_current_end) && !percent_problem_end.numE(current_end)) {
                                        html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, Numbers.sublisp_float(precise_percent_current_end, (SubLObject)problem_store_visualization.UNPROVIDED), (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, current_end);
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    }
                                    html_utilities.html_indent((SubLObject)problem_store_visualization.ONE_INTEGER);
                                    if (problem_end.numE(percent_problem_end)) {
                                        html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                                        cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, percent, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, percent_problem_end);
                                        html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                    }
                                    else {
                                        cb_utilities.cb_link((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, store, percent, (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER, size, percent_problem_end);
                                    }
                                }
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    html_problem_layout_visualization_animation_controls_placeholder(layout);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)problem_store_visualization.$str160$problemStoreVisualizations);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)problem_store_visualization.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                            SubLObject cdolist_list_var2 = visualization_schemes;
                            SubLObject scheme = (SubLObject)problem_store_visualization.NIL;
                            scheme = cdolist_list_var2.first();
                            while (problem_store_visualization.NIL != cdolist_list_var2) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)problem_store_visualization.UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)problem_store_visualization.T, thread);
                                    html_problem_layout_visualization_table(layout, size, problem_end, table_style, scheme);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                scheme = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    if (problem_store_visualization.NIL == suppress_textual_outputP) {
                        html_problem_layout_visualization_animation_controls(layout, visualization_schemes, current_end);
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
                    if (problem_store_visualization.NIL != show_copyrightP) {
                        html_utilities.html_copyright_notice();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$10, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 35079L)
    public static SubLObject cb_visualize_problems_for_monitor(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        problem_store_visualization.$current_vpfm_call_count$.setGlobalValue(Numbers.add(problem_store_visualization.$current_vpfm_call_count$.getGlobalValue(), (SubLObject)problem_store_visualization.ONE_INTEGER));
        if (problem_store_visualization.ZERO_INTEGER.eql(Numbers.mod(problem_store_visualization.$current_vpfm_call_count$.getGlobalValue(), (SubLObject)problem_store_visualization.FOUR_INTEGER)) && problem_store_visualization.$current_vpfm_call_count$.getGlobalValue().numGE((SubLObject)problem_store_visualization.FOUR_INTEGER)) {
            cb_inference_monitors.inference_monitor_warn((SubLObject)problem_store_visualization.$str161$_D_concurrent_CB_VISUALIZE_PROBLE, problem_store_visualization.$current_vpfm_call_count$.getGlobalValue(), (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        SubLObject err_msg = (SubLObject)problem_store_visualization.NIL;
        try {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)problem_store_visualization.$sym162$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        SubLObject store_id_string = (SubLObject)problem_store_visualization.NIL;
                        SubLObject problem_end_string = (SubLObject)problem_store_visualization.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)problem_store_visualization.$list163);
                        store_id_string = args.first();
                        SubLObject current = args.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, args, (SubLObject)problem_store_visualization.$list163);
                        problem_end_string = current.first();
                        current = current.rest();
                        final SubLObject mode_string = (SubLObject)(current.isCons() ? current.first() : problem_store_visualization.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current, args, (SubLObject)problem_store_visualization.$list163);
                        current = current.rest();
                        if (problem_store_visualization.NIL == current) {
                            notify_visualizing_problem_store((SubLObject)problem_store_visualization.UNPROVIDED);
                            cb_visualize_problems_for_monitor_int(store_id_string, problem_end_string, mode_string);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)problem_store_visualization.$list163);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)problem_store_visualization.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)problem_store_visualization.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                problem_store_visualization.$current_vpfm_call_count$.setGlobalValue(Numbers.subtract(problem_store_visualization.$current_vpfm_call_count$.getGlobalValue(), (SubLObject)problem_store_visualization.ONE_INTEGER));
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (problem_store_visualization.NIL != err_msg) {
            cb_inference_monitors.inference_monitor_warn((SubLObject)problem_store_visualization.$str164$Error_for_args__S_____S, args, err_msg, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 35820L)
    public static SubLObject cb_visualize_problems_for_monitor_int(final SubLObject store_id_string, final SubLObject problem_end_string, final SubLObject mode_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = (SubLObject)(mode_string.isString() ? reader.read_from_string_ignoring_errors(mode_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED) : problem_store_visualization.NIL);
        SubLObject store = mode.eql((SubLObject)problem_store_visualization.$kw166$LATEST_INFERENCE) ? cb_inference_monitors.latest_monitorable_problem_store() : cb_inference_browser.cb_guess_problem_store(store_id_string);
        if (problem_store_visualization.NIL == inference_datastructures_problem_store.problem_store_p(store)) {
            store = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)problem_store_visualization.ONE_INTEGER), web_services.get_inference_from_mode(mode));
        }
        if (problem_store_visualization.NIL != inference_datastructures_problem_store.problem_store_p(store)) {
            final SubLObject refresh_rate = (SubLObject)problem_store_visualization.MINUS_ONE_INTEGER;
            final SubLObject problem_end = reader.read_from_string_ignoring_errors(problem_end_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject layout = update_problem_layout(cb_problem_store_layout(store));
            final SubLObject layout_width = Numbers.subtract(prob_layout_max_x(layout), prob_layout_min_x(layout));
            final SubLObject layout_height = Numbers.subtract(prob_layout_max_y(layout), prob_layout_min_y(layout));
            final SubLObject size = compute_grid_size_for_inference_monitor(layout_width, layout_height);
            final SubLObject suppress_textual_outputP = (SubLObject)problem_store_visualization.T;
            final SubLObject show_copyrightP = (SubLObject)problem_store_visualization.NIL;
            final SubLObject table_style = html_problem_layout_visualization_for_monitor_table_style(size, layout_width, layout_height);
            final SubLObject body_style = (SubLObject)problem_store_visualization.$str168$overflow_hidden_;
            if (!store.eql(problem_store_visualization.$last_store$.getGlobalValue())) {
                cb_inference_monitors.inference_monitor_info((SubLObject)problem_store_visualization.$str169$Visualizing_new_problem_store__S, store, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
            }
            else if (problem_end.isNumber() && problem_store_visualization.$last_problem_end$.getGlobalValue().isNumber() && Numbers.subtract(problem_end, problem_store_visualization.$last_problem_end$.getGlobalValue()).numG((SubLObject)problem_store_visualization.$int170$25)) {
                cb_inference_monitors.inference_monitor_info((SubLObject)problem_store_visualization.$str171$Jumped_problem_end_from__A_to__A_, problem_store_visualization.$last_problem_end$.getGlobalValue(), problem_end, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
            }
            problem_store_visualization.$last_problem_end$.setGlobalValue(problem_end);
            problem_store_visualization.$last_store$.setGlobalValue(store);
            return cb_visualize_problems_guts(layout, refresh_rate, size, problem_end, table_style, suppress_textual_outputP, show_copyrightP, body_style, (SubLObject)problem_store_visualization.$list172);
        }
        if (mode.eql((SubLObject)problem_store_visualization.$kw166$LATEST_INFERENCE)) {
            html_utilities.html_markup((SubLObject)problem_store_visualization.$str133$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (problem_store_visualization.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
                html_utilities.html_markup((SubLObject)problem_store_visualization.$str134$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == problem_store_visualization.$kw135$UNINITIALIZED) ? ConsesLow.list(problem_store_visualization.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)problem_store_visualization.UNPROVIDED);
            return (SubLObject)problem_store_visualization.NIL;
        }
        return cb_utilities.cb_error((SubLObject)problem_store_visualization.$str167$_A__A_did_not_specify_a_problem_s, store_id_string, mode_string, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
    public static SubLObject clear_notify_visualizing_problem_store() {
        final SubLObject cs = problem_store_visualization.$notify_visualizing_problem_store_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
    public static SubLObject remove_notify_visualizing_problem_store(SubLObject id) {
        if (id == problem_store_visualization.UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second((SubLObject)problem_store_visualization.UNPROVIDED);
        }
        return memoization_state.caching_state_remove_function_results_with_args(problem_store_visualization.$notify_visualizing_problem_store_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(id), (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
    public static SubLObject notify_visualizing_problem_store_internal(final SubLObject id) {
        cb_inference_monitors.inference_monitor_info((SubLObject)problem_store_visualization.$str174$__Visualizing_problem_store__, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 37729L)
    public static SubLObject notify_visualizing_problem_store(SubLObject id) {
        if (id == problem_store_visualization.UNPROVIDED) {
            id = numeric_date_utilities.get_universal_second((SubLObject)problem_store_visualization.UNPROVIDED);
        }
        SubLObject caching_state = problem_store_visualization.$notify_visualizing_problem_store_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)problem_store_visualization.$sym173$NOTIFY_VISUALIZING_PROBLEM_STORE, (SubLObject)problem_store_visualization.$sym175$_NOTIFY_VISUALIZING_PROBLEM_STORE_CACHING_STATE_, (SubLObject)problem_store_visualization.EIGHT_INTEGER, (SubLObject)problem_store_visualization.EQUAL, (SubLObject)problem_store_visualization.ONE_INTEGER, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(notify_visualizing_problem_store_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, (SubLObject)problem_store_visualization.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
    public static SubLObject clear_compute_grid_size_for_inference_monitor() {
        final SubLObject cs = problem_store_visualization.$compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
    public static SubLObject remove_compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height) {
        return memoization_state.caching_state_remove_function_results_with_args(problem_store_visualization.$compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(layout_width, layout_height), (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
    public static SubLObject compute_grid_size_for_inference_monitor_internal(final SubLObject layout_width, final SubLObject layout_height) {
        if (problem_store_visualization.ZERO_INTEGER.eql(layout_width) || problem_store_visualization.ZERO_INTEGER.eql(layout_height)) {
            return (SubLObject)problem_store_visualization.ZERO_INTEGER;
        }
        final SubLObject max_table_width = problem_store_visualization.$inference_monitor_grid_width$.getGlobalValue();
        final SubLObject max_table_height = problem_store_visualization.$inference_monitor_grid_height$.getGlobalValue();
        final SubLObject optimum_cell_width = Numbers.integerDivide(max_table_width, layout_width);
        final SubLObject optimum_cell_height = Numbers.integerDivide(max_table_height, layout_height);
        cb_inference_monitors.inference_monitor_info((SubLObject)problem_store_visualization.$str177$Given_layout_of__Dx_D__optimum_ce, layout_width, layout_height, optimum_cell_width, optimum_cell_height);
        return Numbers.min(optimum_cell_width, new SubLObject[] { optimum_cell_height, problem_store_visualization.$inference_monitor_max_cell_size$.getGlobalValue() });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38110L)
    public static SubLObject compute_grid_size_for_inference_monitor(final SubLObject layout_width, final SubLObject layout_height) {
        SubLObject caching_state = problem_store_visualization.$compute_grid_size_for_inference_monitor_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)problem_store_visualization.$sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR, (SubLObject)problem_store_visualization.$sym178$_COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR_CACHING_STATE_, (SubLObject)problem_store_visualization.EIGHT_INTEGER, (SubLObject)problem_store_visualization.EQL, (SubLObject)problem_store_visualization.TWO_INTEGER, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(layout_width, layout_height);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)problem_store_visualization.NIL;
            collision = cdolist_list_var.first();
            while (problem_store_visualization.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (layout_width.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (problem_store_visualization.NIL != cached_args && problem_store_visualization.NIL == cached_args.rest() && layout_height.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(compute_grid_size_for_inference_monitor_internal(layout_width, layout_height)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(layout_width, layout_height));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
    public static SubLObject clear_html_problem_layout_visualization_for_monitor_table_style() {
        final SubLObject cs = problem_store_visualization.$html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
    public static SubLObject remove_html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        return memoization_state.caching_state_remove_function_results_with_args(problem_store_visualization.$html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(td_height, layout_width, layout_height), (SubLObject)problem_store_visualization.UNPROVIDED, (SubLObject)problem_store_visualization.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
    public static SubLObject html_problem_layout_visualization_for_monitor_table_style_internal(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        final SubLObject td_border_width = (SubLObject)(td_height.numG((SubLObject)problem_store_visualization.FIVE_INTEGER) ? problem_store_visualization.ONE_INTEGER : problem_store_visualization.ZERO_INTEGER);
        final SubLObject td_border = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str85$solid_gray_, new SubLObject[] { format_nil.format_nil_d_no_copy(td_border_width), problem_store_visualization.$str86$px });
        final SubLObject td_width = Numbers.multiply(td_height, (SubLObject)problem_store_visualization.$float180$1_5);
        final SubLObject padded_td_height = Numbers.add(td_height, td_border_width);
        final SubLObject padded_td_width = Numbers.add(td_width, td_border_width);
        final SubLObject table_width = Numbers.floor(Numbers.multiply(padded_td_width, layout_width), (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject horizontal_whitespace = Numbers.max((SubLObject)problem_store_visualization.ZERO_INTEGER, Numbers.subtract(problem_store_visualization.$inference_monitor_grid_width$.getGlobalValue(), table_width));
        final SubLObject table_left_margin = Numbers.integerDivide(horizontal_whitespace, (SubLObject)problem_store_visualization.TWO_INTEGER);
        final SubLObject table_height = Numbers.floor(Numbers.multiply(padded_td_height, layout_height), (SubLObject)problem_store_visualization.UNPROVIDED);
        final SubLObject vertical_whitespace = Numbers.max((SubLObject)problem_store_visualization.ZERO_INTEGER, Numbers.subtract(problem_store_visualization.$inference_monitor_grid_height$.getGlobalValue(), table_height));
        final SubLObject table_top_margin = Numbers.integerDivide(vertical_whitespace, (SubLObject)problem_store_visualization.TWO_INTEGER);
        final SubLObject style = Sequences.cconcatenate((SubLObject)problem_store_visualization.$str181$_style_type__text_css______proble, new SubLObject[] { format_nil.format_nil_a_no_copy(table_left_margin), problem_store_visualization.$str182$px__margin_top__, format_nil.format_nil_a_no_copy(table_top_margin), problem_store_visualization.$str183$px__opacity___75_____table_proble, format_nil.format_nil_a_no_copy(td_width), problem_store_visualization.$str184$px__height___, format_nil.format_nil_a_no_copy(td_height), problem_store_visualization.$str90$px__border__, format_nil.format_nil_a_no_copy(td_border), problem_store_visualization.$str185$______td_none______border_color__ });
        cb_inference_monitors.inference_monitor_info((SubLObject)problem_store_visualization.$str186$Layout__Dx_D_____A, layout_width, layout_height, style, (SubLObject)problem_store_visualization.UNPROVIDED);
        return style;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 38777L)
    public static SubLObject html_problem_layout_visualization_for_monitor_table_style(final SubLObject td_height, final SubLObject layout_width, final SubLObject layout_height) {
        SubLObject caching_state = problem_store_visualization.$html_problem_layout_visualization_for_monitor_table_style_caching_state$.getGlobalValue();
        if (problem_store_visualization.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)problem_store_visualization.$sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE, (SubLObject)problem_store_visualization.$sym187$_HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE_CACHIN, (SubLObject)problem_store_visualization.EIGHT_INTEGER, (SubLObject)problem_store_visualization.EQL, (SubLObject)problem_store_visualization.THREE_INTEGER, (SubLObject)problem_store_visualization.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(td_height, layout_width, layout_height);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)problem_store_visualization.NIL;
            collision = cdolist_list_var.first();
            while (problem_store_visualization.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (td_height.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (layout_width.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (problem_store_visualization.NIL != cached_args && problem_store_visualization.NIL == cached_args.rest() && layout_height.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(html_problem_layout_visualization_for_monitor_table_style_internal(td_height, layout_width, layout_height)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(td_height, layout_width, layout_height));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 40862L)
    public static SubLObject cb_problem_store_layout(final SubLObject store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert problem_store_visualization.NIL != inference_datastructures_problem_store.problem_store_p(store) : store;
        SubLObject layout = cache.cache_get_without_values(problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue(), store, (SubLObject)problem_store_visualization.UNPROVIDED);
        if (problem_store_visualization.NIL == problem_layout_p(layout)) {
            layout = new_problem_layout(store);
            delete_stale_problem_store_layouts();
            thread.resetMultipleValues();
            final SubLObject dropped_store = cache.cache_set_return_dropped(problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue(), store, layout);
            final SubLObject dropped_layout = thread.secondMultipleValue();
            final SubLObject validP = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (problem_store_visualization.NIL != validP) {
                destroy_problem_layout(dropped_layout);
            }
        }
        return layout;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/browser/problem-store-visualization.lisp", position = 41407L)
    public static SubLObject delete_stale_problem_store_layouts() {
        SubLObject stale_stores = (SubLObject)problem_store_visualization.NIL;
        final SubLObject cache_var = problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue();
        final SubLObject order_var = (SubLObject)problem_store_visualization.$kw189$NEWEST;
        SubLObject entry = cache.do_cache_first(cache_var, order_var);
        SubLObject store = (SubLObject)problem_store_visualization.NIL;
        SubLObject layout = (SubLObject)problem_store_visualization.NIL;
        while (problem_store_visualization.NIL == cache.do_cache_doneP(cache_var, entry)) {
            store = cache.do_cache_key(entry);
            layout = cache.do_cache_value(entry);
            entry = cache.do_cache_next(entry, order_var);
            if (problem_store_visualization.NIL == inference_datastructures_problem_store.valid_problem_store_p(store)) {
                stale_stores = (SubLObject)ConsesLow.cons(store, stale_stores);
            }
        }
        SubLObject cdolist_list_var = stale_stores;
        SubLObject store2 = (SubLObject)problem_store_visualization.NIL;
        store2 = cdolist_list_var.first();
        while (problem_store_visualization.NIL != cdolist_list_var) {
            final SubLObject layout2 = cache.cache_get(problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue(), store2);
            cache.cache_remove(problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue(), store2);
            destroy_problem_layout(layout2);
            cdolist_list_var = cdolist_list_var.rest();
            store2 = cdolist_list_var.first();
        }
        return Sequences.length(stale_stores);
    }
    
    public static SubLObject declare_problem_store_visualization_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_print_function_trampoline", "PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_p", "PROBLEM-LAYOUT-P", 1, 0, false);
        new $problem_layout_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_problem_store", "PROB-LAYOUT-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_min_x", "PROB-LAYOUT-MIN-X", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_max_x", "PROB-LAYOUT-MAX-X", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_min_y", "PROB-LAYOUT-MIN-Y", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_max_y", "PROB-LAYOUT-MAX-Y", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_grid", "PROB-LAYOUT-GRID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_next_problem_id", "PROB-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_problem_x_table", "PROB-LAYOUT-PROBLEM-X-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "prob_layout_problem_y_table", "PROB-LAYOUT-PROBLEM-Y-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_problem_store", "_CSETF-PROB-LAYOUT-PROBLEM-STORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_min_x", "_CSETF-PROB-LAYOUT-MIN-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_max_x", "_CSETF-PROB-LAYOUT-MAX-X", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_min_y", "_CSETF-PROB-LAYOUT-MIN-Y", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_max_y", "_CSETF-PROB-LAYOUT-MAX-Y", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_grid", "_CSETF-PROB-LAYOUT-GRID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_next_problem_id", "_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_problem_x_table", "_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "_csetf_prob_layout_problem_y_table", "_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "make_problem_layout", "MAKE-PROBLEM-LAYOUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "visit_defstruct_problem_layout", "VISIT-DEFSTRUCT-PROBLEM-LAYOUT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "visit_defstruct_object_problem_layout_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "new_problem_layout", "NEW-PROBLEM-LAYOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "destroy_problem_layout", "DESTROY-PROBLEM-LAYOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_store", "PROBLEM-LAYOUT-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_next_problem_id", "PROBLEM-LAYOUT-NEXT-PROBLEM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_problem_store", "PROBLEM-LAYOUT-PROBLEM-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_x_lookup", "PROBLEM-LAYOUT-X-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_y_lookup", "PROBLEM-LAYOUT-Y-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_grid_lookup", "PROBLEM-LAYOUT-GRID-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "update_problem_layout", "UPDATE-PROBLEM-LAYOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_add", "PROBLEM-LAYOUT-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_add_to_grid", "PROBLEM-LAYOUT-ADD-TO-GRID", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_layout_compute_add_location", "PROBLEM-LAYOUT-COMPUTE-ADD-LOCATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "octant_preference_order", "OCTANT-PREFERENCE-ORDER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "initialize_octant_locations", "INITIALIZE-OCTANT-LOCATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "octant_location_L", "OCTANT-LOCATION-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "octant_location_delta_x", "OCTANT-LOCATION-DELTA-X", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "octant_location_delta_y", "OCTANT-LOCATION-DELTA-Y", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "earliest_dependent_problem", "EARLIEST-DEPENDENT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_store_most_recent_problem", "PROBLEM-STORE-MOST-RECENT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "all_problem_ancestor_problems", "ALL-PROBLEM-ANCESTOR-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "all_problem_ancestor_problems_recursive", "ALL-PROBLEM-ANCESTOR-PROBLEMS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_oldest_ancestor_path", "PROBLEM-OLDEST-ANCESTOR-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_oldest_ancestor_path_recursive", "PROBLEM-OLDEST-ANCESTOR-PATH-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_oldest_parent_problem", "PROBLEM-OLDEST-PARENT-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_oldest_link_to_parent", "PROBLEM-OLDEST-LINK-TO-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "problem_proof_count_rectangle", "PROBLEM-PROOF-COUNT-RECTANGLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "squarest_rectangle_for_integer_area", "SQUAREST-RECTANGLE-FOR-INTEGER-AREA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_table", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_animation_controls", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_animation_controls_placeholder", "HTML-PROBLEM-LAYOUT-VISUALIZATION-ANIMATION-CONTROLS-PLACEHOLDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_slider_ids", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SLIDER-IDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_scripts", "HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPTS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_id", "HTML-PROBLEM-LAYOUT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "clear_html_problem_layout_visualization_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "remove_html_problem_layout_visualization_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_page_css", "HTML-PROBLEM-LAYOUT-VISUALIZATION-PAGE-CSS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_class", "HTML-PROBLEM-LAYOUT-CLASS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_class_by_goodness", "HTML-PROBLEM-LAYOUT-CLASS-BY-GOODNESS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_class_by_strategy", "HTML-PROBLEM-LAYOUT-CLASS-BY-STRATEGY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_link_visualize_problems", "CB-LINK-VISUALIZE-PROBLEMS", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_visualize_problems", "CB-VISUALIZE-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "best_problem_store_visualizer_zoom_level_for_store", "BEST-PROBLEM-STORE-VISUALIZER-ZOOM-LEVEL-FOR-STORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_visualize_problems_guts", "CB-VISUALIZE-PROBLEMS-GUTS", 5, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_visualize_problems_for_monitor", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_visualize_problems_for_monitor_int", "CB-VISUALIZE-PROBLEMS-FOR-MONITOR-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "clear_notify_visualizing_problem_store", "CLEAR-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "remove_notify_visualizing_problem_store", "REMOVE-NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "notify_visualizing_problem_store_internal", "NOTIFY-VISUALIZING-PROBLEM-STORE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "notify_visualizing_problem_store", "NOTIFY-VISUALIZING-PROBLEM-STORE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "clear_compute_grid_size_for_inference_monitor", "CLEAR-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "remove_compute_grid_size_for_inference_monitor", "REMOVE-COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "compute_grid_size_for_inference_monitor_internal", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "compute_grid_size_for_inference_monitor", "COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "clear_html_problem_layout_visualization_for_monitor_table_style", "CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "remove_html_problem_layout_visualization_for_monitor_table_style", "REMOVE-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_for_monitor_table_style_internal", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "html_problem_layout_visualization_for_monitor_table_style", "HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "cb_problem_store_layout", "CB-PROBLEM-STORE-LAYOUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.browser.problem_store_visualization", "delete_stale_problem_store_layouts", "DELETE-STALE-PROBLEM-STORE-LAYOUTS", 0, 0, false);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    public static SubLObject init_problem_store_visualization_file() {
        problem_store_visualization.$dtp_problem_layout$ = SubLFiles.defconstant("*DTP-PROBLEM-LAYOUT*", (SubLObject)problem_store_visualization.$sym0$PROBLEM_LAYOUT);
        problem_store_visualization.$octant_locations$ = SubLFiles.deflexical("*OCTANT-LOCATIONS*", (SubLObject)((problem_store_visualization.NIL != Symbols.boundp((SubLObject)problem_store_visualization.$sym47$_OCTANT_LOCATIONS_)) ? problem_store_visualization.$octant_locations$.getGlobalValue() : problem_store_visualization.NIL));
        problem_store_visualization.$html_problem_layout_visualization_script_template$ = SubLFiles.defparameter("*HTML-PROBLEM-LAYOUT-VISUALIZATION-SCRIPT-TEMPLATE*", (SubLObject)problem_store_visualization.$str78$_script_type__text_javascript____);
        problem_store_visualization.$html_problem_layout_visualization_table_style_caching_state$ = SubLFiles.deflexical("*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$cb_problem_store_default_zoom_levels$ = SubLFiles.defparameter("*CB-PROBLEM-STORE-DEFAULT-ZOOM-LEVELS*", (SubLObject)problem_store_visualization.$list130);
        problem_store_visualization.$last_store$ = SubLFiles.deflexical("*LAST-STORE*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$last_problem_end$ = SubLFiles.deflexical("*LAST-PROBLEM-END*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$current_vpfm_call_count$ = SubLFiles.deflexical("*CURRENT-VPFM-CALL-COUNT*", (SubLObject)problem_store_visualization.ZERO_INTEGER);
        problem_store_visualization.$notify_visualizing_problem_store_caching_state$ = SubLFiles.deflexical("*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$inference_monitor_grid_width$ = SubLFiles.deflexical("*INFERENCE-MONITOR-GRID-WIDTH*", (SubLObject)problem_store_visualization.$int149$100);
        problem_store_visualization.$inference_monitor_grid_height$ = SubLFiles.deflexical("*INFERENCE-MONITOR-GRID-HEIGHT*", (SubLObject)problem_store_visualization.$int149$100);
        problem_store_visualization.$inference_monitor_max_cell_size$ = SubLFiles.deflexical("*INFERENCE-MONITOR-MAX-CELL-SIZE*", (SubLObject)problem_store_visualization.FIFTEEN_INTEGER);
        problem_store_visualization.$compute_grid_size_for_inference_monitor_caching_state$ = SubLFiles.deflexical("*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$html_problem_layout_visualization_for_monitor_table_style_caching_state$ = SubLFiles.deflexical("*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*", (SubLObject)problem_store_visualization.NIL);
        problem_store_visualization.$cb_problem_store_layout_table$ = SubLFiles.deflexical("*CB-PROBLEM-STORE-LAYOUT-TABLE*", (problem_store_visualization.NIL != Symbols.boundp((SubLObject)problem_store_visualization.$sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_)) ? problem_store_visualization.$cb_problem_store_layout_table$.getGlobalValue() : cache.new_cache((SubLObject)problem_store_visualization.TEN_INTEGER, Symbols.symbol_function((SubLObject)problem_store_visualization.EQ)));
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    public static SubLObject setup_problem_store_visualization_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), problem_store_visualization.$dtp_problem_layout$.getGlobalValue(), Symbols.symbol_function((SubLObject)problem_store_visualization.$sym7$PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)problem_store_visualization.$list8);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym9$PROB_LAYOUT_PROBLEM_STORE, (SubLObject)problem_store_visualization.$sym10$_CSETF_PROB_LAYOUT_PROBLEM_STORE);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym11$PROB_LAYOUT_MIN_X, (SubLObject)problem_store_visualization.$sym12$_CSETF_PROB_LAYOUT_MIN_X);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym13$PROB_LAYOUT_MAX_X, (SubLObject)problem_store_visualization.$sym14$_CSETF_PROB_LAYOUT_MAX_X);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym15$PROB_LAYOUT_MIN_Y, (SubLObject)problem_store_visualization.$sym16$_CSETF_PROB_LAYOUT_MIN_Y);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym17$PROB_LAYOUT_MAX_Y, (SubLObject)problem_store_visualization.$sym18$_CSETF_PROB_LAYOUT_MAX_Y);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym19$PROB_LAYOUT_GRID, (SubLObject)problem_store_visualization.$sym20$_CSETF_PROB_LAYOUT_GRID);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym21$PROB_LAYOUT_NEXT_PROBLEM_ID, (SubLObject)problem_store_visualization.$sym22$_CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym23$PROB_LAYOUT_PROBLEM_X_TABLE, (SubLObject)problem_store_visualization.$sym24$_CSETF_PROB_LAYOUT_PROBLEM_X_TABLE);
        Structures.def_csetf((SubLObject)problem_store_visualization.$sym25$PROB_LAYOUT_PROBLEM_Y_TABLE, (SubLObject)problem_store_visualization.$sym26$_CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE);
        Equality.identity((SubLObject)problem_store_visualization.$sym0$PROBLEM_LAYOUT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), problem_store_visualization.$dtp_problem_layout$.getGlobalValue(), Symbols.symbol_function((SubLObject)problem_store_visualization.$sym41$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)problem_store_visualization.$sym47$_OCTANT_LOCATIONS_);
        utilities_macros.note_funcall_helper_function((SubLObject)problem_store_visualization.$sym49$OCTANT_LOCATION__);
        memoization_state.note_globally_cached_function((SubLObject)problem_store_visualization.$sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE);
        cb_utilities.setup_cb_link_method((SubLObject)problem_store_visualization.$kw114$VISUALIZE_PROBLEMS, (SubLObject)problem_store_visualization.$sym115$CB_LINK_VISUALIZE_PROBLEMS, (SubLObject)problem_store_visualization.FIVE_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)problem_store_visualization.$sym118$CB_VISUALIZE_PROBLEMS, (SubLObject)problem_store_visualization.$kw119$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)problem_store_visualization.$sym165$CB_VISUALIZE_PROBLEMS_FOR_MONITOR, (SubLObject)problem_store_visualization.$kw119$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)problem_store_visualization.$sym173$NOTIFY_VISUALIZING_PROBLEM_STORE);
        memoization_state.note_globally_cached_function((SubLObject)problem_store_visualization.$sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR);
        memoization_state.note_globally_cached_function((SubLObject)problem_store_visualization.$sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE);
        subl_macro_promotions.declare_defglobal((SubLObject)problem_store_visualization.$sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_);
        return (SubLObject)problem_store_visualization.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_problem_store_visualization_file();
    }
    
    @Override
	public void initializeVariables() {
        init_problem_store_visualization_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_problem_store_visualization_file();
    }
    
    static {
        me = (SubLFile)new problem_store_visualization();
        problem_store_visualization.$dtp_problem_layout$ = null;
        problem_store_visualization.$octant_locations$ = null;
        problem_store_visualization.$html_problem_layout_visualization_script_template$ = null;
        problem_store_visualization.$html_problem_layout_visualization_table_style_caching_state$ = null;
        problem_store_visualization.$cb_problem_store_default_zoom_levels$ = null;
        problem_store_visualization.$last_store$ = null;
        problem_store_visualization.$last_problem_end$ = null;
        problem_store_visualization.$current_vpfm_call_count$ = null;
        problem_store_visualization.$notify_visualizing_problem_store_caching_state$ = null;
        problem_store_visualization.$inference_monitor_grid_width$ = null;
        problem_store_visualization.$inference_monitor_grid_height$ = null;
        problem_store_visualization.$inference_monitor_max_cell_size$ = null;
        problem_store_visualization.$compute_grid_size_for_inference_monitor_caching_state$ = null;
        problem_store_visualization.$html_problem_layout_visualization_for_monitor_table_style_caching_state$ = null;
        problem_store_visualization.$cb_problem_store_layout_table$ = null;
        $sym0$PROBLEM_LAYOUT = SubLObjectFactory.makeSymbol("PROBLEM-LAYOUT");
        $sym1$PROBLEM_LAYOUT_P = SubLObjectFactory.makeSymbol("PROBLEM-LAYOUT-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PROBLEM-STORE"), SubLObjectFactory.makeSymbol("MIN-X"), SubLObjectFactory.makeSymbol("MAX-X"), SubLObjectFactory.makeSymbol("MIN-Y"), SubLObjectFactory.makeSymbol("MAX-Y"), SubLObjectFactory.makeSymbol("GRID"), SubLObjectFactory.makeSymbol("NEXT-PROBLEM-ID"), SubLObjectFactory.makeSymbol("PROBLEM-X-TABLE"), SubLObjectFactory.makeSymbol("PROBLEM-Y-TABLE") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("PROBLEM-STORE"), SubLObjectFactory.makeKeyword("MIN-X"), SubLObjectFactory.makeKeyword("MAX-X"), SubLObjectFactory.makeKeyword("MIN-Y"), SubLObjectFactory.makeKeyword("MAX-Y"), SubLObjectFactory.makeKeyword("GRID"), SubLObjectFactory.makeKeyword("NEXT-PROBLEM-ID"), SubLObjectFactory.makeKeyword("PROBLEM-X-TABLE"), SubLObjectFactory.makeKeyword("PROBLEM-Y-TABLE") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-MIN-X"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-MAX-X"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-MIN-Y"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-MAX-Y"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-GRID"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-NEXT-PROBLEM-ID"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-X-TABLE"), SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-Y-TABLE") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MIN-X"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MAX-X"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MIN-Y"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MAX-Y"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-GRID"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE"), SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE") });
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$PROBLEM_LAYOUT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROBLEM-LAYOUT-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-LAYOUT-P"));
        $sym9$PROB_LAYOUT_PROBLEM_STORE = SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-STORE");
        $sym10$_CSETF_PROB_LAYOUT_PROBLEM_STORE = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-STORE");
        $sym11$PROB_LAYOUT_MIN_X = SubLObjectFactory.makeSymbol("PROB-LAYOUT-MIN-X");
        $sym12$_CSETF_PROB_LAYOUT_MIN_X = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MIN-X");
        $sym13$PROB_LAYOUT_MAX_X = SubLObjectFactory.makeSymbol("PROB-LAYOUT-MAX-X");
        $sym14$_CSETF_PROB_LAYOUT_MAX_X = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MAX-X");
        $sym15$PROB_LAYOUT_MIN_Y = SubLObjectFactory.makeSymbol("PROB-LAYOUT-MIN-Y");
        $sym16$_CSETF_PROB_LAYOUT_MIN_Y = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MIN-Y");
        $sym17$PROB_LAYOUT_MAX_Y = SubLObjectFactory.makeSymbol("PROB-LAYOUT-MAX-Y");
        $sym18$_CSETF_PROB_LAYOUT_MAX_Y = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-MAX-Y");
        $sym19$PROB_LAYOUT_GRID = SubLObjectFactory.makeSymbol("PROB-LAYOUT-GRID");
        $sym20$_CSETF_PROB_LAYOUT_GRID = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-GRID");
        $sym21$PROB_LAYOUT_NEXT_PROBLEM_ID = SubLObjectFactory.makeSymbol("PROB-LAYOUT-NEXT-PROBLEM-ID");
        $sym22$_CSETF_PROB_LAYOUT_NEXT_PROBLEM_ID = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-NEXT-PROBLEM-ID");
        $sym23$PROB_LAYOUT_PROBLEM_X_TABLE = SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-X-TABLE");
        $sym24$_CSETF_PROB_LAYOUT_PROBLEM_X_TABLE = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-X-TABLE");
        $sym25$PROB_LAYOUT_PROBLEM_Y_TABLE = SubLObjectFactory.makeSymbol("PROB-LAYOUT-PROBLEM-Y-TABLE");
        $sym26$_CSETF_PROB_LAYOUT_PROBLEM_Y_TABLE = SubLObjectFactory.makeSymbol("_CSETF-PROB-LAYOUT-PROBLEM-Y-TABLE");
        $kw27$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw28$MIN_X = SubLObjectFactory.makeKeyword("MIN-X");
        $kw29$MAX_X = SubLObjectFactory.makeKeyword("MAX-X");
        $kw30$MIN_Y = SubLObjectFactory.makeKeyword("MIN-Y");
        $kw31$MAX_Y = SubLObjectFactory.makeKeyword("MAX-Y");
        $kw32$GRID = SubLObjectFactory.makeKeyword("GRID");
        $kw33$NEXT_PROBLEM_ID = SubLObjectFactory.makeKeyword("NEXT-PROBLEM-ID");
        $kw34$PROBLEM_X_TABLE = SubLObjectFactory.makeKeyword("PROBLEM-X-TABLE");
        $kw35$PROBLEM_Y_TABLE = SubLObjectFactory.makeKeyword("PROBLEM-Y-TABLE");
        $str36$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw37$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym38$MAKE_PROBLEM_LAYOUT = SubLObjectFactory.makeSymbol("MAKE-PROBLEM-LAYOUT");
        $kw39$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw40$END = SubLObjectFactory.makeKeyword("END");
        $sym41$VISIT_DEFSTRUCT_OBJECT_PROBLEM_LAYOUT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-LAYOUT-METHOD");
        $sym42$PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("PROBLEM-STORE-P");
        $kw43$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym44$PROBLEM_P = SubLObjectFactory.makeSymbol("PROBLEM-P");
        $str45$unable_to_add_to_layout__S = SubLObjectFactory.makeString("unable to add to layout ~S");
        $list46 = ConsesLow.list((SubLObject)problem_store_visualization.FIVE_INTEGER, (SubLObject)problem_store_visualization.SIX_INTEGER, (SubLObject)problem_store_visualization.FOUR_INTEGER, (SubLObject)problem_store_visualization.SEVEN_INTEGER, (SubLObject)problem_store_visualization.THREE_INTEGER, (SubLObject)problem_store_visualization.ZERO_INTEGER, (SubLObject)problem_store_visualization.TWO_INTEGER, (SubLObject)problem_store_visualization.ONE_INTEGER);
        $sym47$_OCTANT_LOCATIONS_ = SubLObjectFactory.makeSymbol("*OCTANT-LOCATIONS*");
        $int48$316 = SubLObjectFactory.makeInteger(316);
        $sym49$OCTANT_LOCATION__ = SubLObjectFactory.makeSymbol("OCTANT-LOCATION-<");
        $sym50$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X-1"), (SubLObject)SubLObjectFactory.makeSymbol("Y-1"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X-2"), (SubLObject)SubLObjectFactory.makeSymbol("Y-2"));
        $sym53$_ = SubLObjectFactory.makeSymbol("<");
        $sym54$PROBLEM_SUID = SubLObjectFactory.makeSymbol("PROBLEM-SUID");
        $sym55$PROBLEM_LINK_SUID = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUID");
        $sym56$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw57$GOODNESS = SubLObjectFactory.makeKeyword("GOODNESS");
        $str58$ps_ = SubLObjectFactory.makeString("ps-");
        $str59$_ = SubLObjectFactory.makeString("-");
        $str60$problemGrid = SubLObjectFactory.makeString("problemGrid");
        $kw61$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $kw62$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw63$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $str64$_ = SubLObjectFactory.makeString("*");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLIDER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("SLIDER-FIELD-ID"));
        $kw66$EXT_ALL = SubLObjectFactory.makeKeyword("EXT-ALL");
        $kw67$RAPHAEL = SubLObjectFactory.makeKeyword("RAPHAEL");
        $str68$_ = SubLObjectFactory.makeString("[");
        $str69$null = SubLObjectFactory.makeString("null");
        $str70$_ = SubLObjectFactory.makeString(",");
        $str71$_ = SubLObjectFactory.makeString("]");
        $str72$_script_type__text_javascript____ = SubLObjectFactory.makeString("<script type='text/javascript'>\n  var Cyc = {problemStore : \n              {~A : \n               { parentData: ~A,\n                 lastNodeId: ~A,\n                 papers: {}\n\t       }\n\t      }\n\t     };\n</script>");
        $str73$_style_type__text_css_______A_tab = SubLObjectFactory.makeString("<style type=\"text/css\">\n  #~A table { display:inline-table }\n  #~A       { padding-left: 5px }\n  #~A table { display:inline-table }\n</style>");
        $str74$height_1_5em = SubLObjectFactory.makeString("height:1.5em");
        $str75$ps = SubLObjectFactory.makeString("ps");
        $str76$_slider = SubLObjectFactory.makeString("-slider");
        $str77$_slider_field = SubLObjectFactory.makeString("-slider-field");
        $str78$_script_type__text_javascript____ = SubLObjectFactory.makeString("<script type='text/javascript'>\n    Ext.require('Ext.slider.*');\n\nExt.onReady(function(){\n    var maxProblemId = ~S;\n    var schemes = ~A;\n    var ps = ~A\n    var paper = {};\n    var underlayIdSuffix = '-u';\n    var slider = Ext.create('Ext.slider.Single', {\n        renderTo: '~A',\n        useTips: false,\n        hideLabel: false,\n        fieldLabel: 'Last Visible Problem:',\n        labelWidth: 130,\n        width: 314,\n        value:maxProblemId,\n        increment: 1,\n        minValue: 0,\n        maxValue: maxProblemId,\n        plugins: new Ext.slider.Tip({getText: function(thumb){\n          return Ext.String.format('{0} of {1}' , thumb.value, maxProblemId);\n          }\n        }),\n        userTips: true,\n\tlisteners:{\n\t    change:function(slider, newValue, thumb){\n\t\tsetProblemsVisible(ps, newValue, maxProblemId, schemes);\n                updatePath(ps, newValue, schemes);\n\t    }\n\t}\n    });\n    var typein = Ext.create('Ext.form.field.Number', {\n        renderTo: '~A',\n        scope:this,\n        width: 60,\n        value: maxProblemId,\n        minValue: 0,\n        maxValue: maxProblemId,\n        listeners:{\n          change:function() {\n            slider.setValue(this.getValue());\n          }\n        }\n    });\n\n    function setProblemsVisible(ps, maxVisibleId, maxProblemStoreId, schemes) {\n     var elt;\n     for (var i = 0; i <  schemes.length; i++) {\n       var scheme = schemes[i];\n       var id;\n       for (var num = 0; num <= maxVisibleId; num++) {\n         var elt = Ext.fly(getUnderlayCellId(ps, num, scheme));\n         if (elt) {\n           elt.removeCls('hideme');\n         }\n       }\n       for (var num = maxVisibleId + 1; num <= maxProblemStoreId; num++) {\n         Ext.fly(getUnderlayCellId(ps, num, scheme)).addCls('hideme');\n       }\n     }\n    }\n\n\n    slider.on({\n      change:{fn: function(obj, value)\n       {\n        typein.setValue(value);\n        }\n      }\n    });\n\n   \n   function showPath(ps, finalNodeNum, schemes) {\n     overlayTable = Ext.get('problemStoreVisualizations'); \n     underlayDiv = overlayTable.parent().createChild('<div style=\"position:relative; \" id=\"visualizationUnderlay\"></div>');\n     underlayDiv.setXY(overlayTable.getXY());\n     underlayDiv.setHeight(overlayTable.getHeight());\n     for (var i = 0; i < schemes.length; i++) {\n       var table = Ext.get(getTableId(ps, schemes[i]));\n       var xy = table.getXY();\n       var paperHeight = table.getBottom() - xy[1]; \n       var paperWidth = table.getRight() - xy[0];\n       var clone = table.dom.cloneNode(true);\n       updateIds(clone, underlayIdSuffix);\n       underlayDiv.appendChild(clone);\n       var underlayTable = Ext.get(getTableId(ps, schemes[i]) + underlayIdSuffix);\n       underlayTable.setXY(xy).setWidth(table.getWidth());\n       removeClassFromDescendents('path', underlayTable.dom);\n       //now that the underlay is ready, make it visible.\n       overlayTable.addCls('transparent');\n       Cyc.problemStore[ps].papers[schemes[i]] = Raphael(xy[0], xy[1], paperWidth, paperHeight);\n     }\n     updatePath(ps, finalNodeNum, schemes);\n   }\n\n   function updatePath(ps, finalNodeNum, schemes) {\n     for (var i = 0; i < schemes.length; i++) {\n       var canvas = Cyc.problemStore[ps].papers[schemes[i]];\n       if (canvas) {\n         canvas.clear();\n       }\n       var path = getPathFromRootToNode(ps, finalNodeNum);\n       var tableId = getTableId(ps, schemes[i]);\n       var table = Ext.get('ps-' + ps + '-' + schemes[i]);\n       var nextStr = 'M';\n       var lineCmd = '';\n       var circleLocations = [];\n       for (var j = 0; j < path.length; j++) {\n         lineCmd = lineCmd + nextStr;\n         nextStr = 'L';\n         var eltId = getUnderlayCellId(ps, path[j], schemes[i]);\n         var eltLoc = relativeEltMiddle(eltId, tableId);\n         circleLocations.push(eltLoc);\n         var lineCmd = lineCmd + eltLoc[0] + ' ' + eltLoc[1];\n       }\n       var outline =  canvas.path(lineCmd);\n       outline.attr({'stroke' : '#fff', 'stroke-width': 4});\n       var line =  canvas.path(lineCmd);\n       line.attr({'stroke': '#000', 'stroke-width': 2});\n       circleLocations.forEach(function(xy) {\n          var c = canvas.circle(xy[0],xy[1],4);\n          c.attr('fill', 'white');\n          var c = canvas.circle(xy[0],xy[1],2);\n          c.attr('fill', 'black');\n       });\n     }\n   }\n\n  function removeClassFromDescendents(className, rootElt) {\n     Ext.query('.' + className, rootElt).forEach(function(elt) { Ext.fly(elt).removeCls(className); });\n  }\n\n  function updateIds(parent, newSuffix) {\n    Ext.query('*', parent).concat(parent).forEach(function (elt) { if (elt.id) {elt.id = elt.id + newSuffix;};});\n  }\n\n\n  function getPathFromRootToNode(ps, finalNodeNum) {\n    var nodeNum = finalNodeNum;\n    var path = [];\n    var data = Cyc.problemStore[ps].parentData;\n    while (nodeNum || nodeNum == 0) {\n      path.unshift(nodeNum);\n      nodeNum = data[nodeNum];\n    }\n    return path;\n  }\n\n  function relativeEltMiddle(eltId, parentId) {\n    var parentXY = Ext.fly(parentId).getXY();\n    var elt = Ext.fly(eltId);\n    var eltXY = elt.getXY();\n    var right = elt.getRight();\n    var bottom = elt.getBottom();\n    var xMiddle = eltXY[0] - parentXY[0] + ((right - eltXY[0]) / 2);\n    var yMiddle = eltXY[1] - parentXY[1] + ((bottom - eltXY[1]) / 2)\n    return [xMiddle, yMiddle]; \n  }\n\n   function getTableId(ps, scheme) {\n       return 'ps-' + ps + '-' + scheme;\n   }\n\n   function getCellId(ps, num, scheme) {\n     return 'p-' + ps + '-' + num + '-' + scheme;\n   }\n\n   function getUnderlayCellId(ps, num, scheme) {\n     return getCellId(ps, num, scheme) + underlayIdSuffix;\n   }\n\n  showPath(ps, maxProblemId, schemes);\n\n  setProblemsVisible(ps, maxProblemId, maxProblemId, schemes);\n\n  Ext.create('Ext.tip.ToolTip', {\n    target: Ext.get('problemStoreVisualizations'),\n    delegate : '.problem',\n    renderTo : Ext.getBody(),\n    trackMouse: true,\n    listeners: {\n     beforeShow: function updateTipBody(tip) {\n       var tipStr = '';\n       /p-[0-9]+-([0-9]+)-.*/.exec(tip.triggerElement.id);\n       if (RegExp.$1) {\n         tipStr = tipStr + 'Problem&nbsp;' + RegExp.$1 + ': ';\n       }\n       tip.update(tipStr + tip.triggerElement.className.replace('focus','').replace('problem','').replace('path', '').replace(' ',''));\n     }\n    }\n  });\n\n});\n</script>");
        $str79$__ = SubLObjectFactory.makeString("['");
        $sym80$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str81$___ = SubLObjectFactory.makeString("','");
        $str82$__ = SubLObjectFactory.makeString("']");
        $str83$p_ = SubLObjectFactory.makeString("p-");
        $sym84$HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE = SubLObjectFactory.makeSymbol("HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE");
        $str85$solid_gray_ = SubLObjectFactory.makeString("solid gray ");
        $str86$px = SubLObjectFactory.makeString("px");
        $str87$_style_type__text_css_______probl = SubLObjectFactory.makeString("<style type=\"text/css\">\n   #problemStoreVisualizations {z-index: 10; position:relative; }\n   #problemStoreVisualizations.transparent {opacity: 0}\n  .problemGrid { margin: 10px; border-spacing: ");
        $str88$px__background___000000_______pro = SubLObjectFactory.makeString("px; background: #000000; }\n  .problemGrid td { width: ");
        $str89$px__height__ = SubLObjectFactory.makeString("px; height: ");
        $str90$px__border__ = SubLObjectFactory.makeString("px; border: ");
        $str91$__font_family__courier__fixed__wh = SubLObjectFactory.makeString("; font-family: courier, fixed; white-space: nowrap; font-size: 12px; box-sizing: context-box; -moz-box-sizing: content-box; -webkit-box-sizing: content-box}\n  .problemGrid a  { text-decoration: none; }\n  .none    { background-color: #000000; }\n  .problem { background-color: #3F3F3F; }\n  .invalid { background-color: #3F3F3F; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    { background-color: #FF00FF; }\n  .problem.root    a:link    { color: #FFFFFF; }\n  .problem.root    a:visited { color: #FFFFFF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    { background-color: #FF00FF; }\n  .problem.path.root    a:link    { color: #FFFFFF; }\n  .problem.path.root    a:visited { color: #FFFFFF; }\n  .problem.path.focus        { background-color: #0000FF; }\n  .future         { background-color: #3F3F3F; }\n  .path.focus   a:link    { color: #FFFFFF; }\n  .path.focus   a:visited { color: #FFFFFF; }\n  .problem.path   { background-color: #3FFFFF; }\n  .good           { background-color: #3FFF3F; }\n  .neutral        { background-color: #FFFF3F; }  \n  .no-good        { background-color: #FF3F3F; }\n  .problemGrid tr td { width: ");
        $str92$px__font_family__courier__fixed__ = SubLObjectFactory.makeString("px; font-family: courier, fixed; white-space: nowrap;}\n  a { text-decoration: none; }\n  td.hideme              { background-color: #000000; }\n  \n  .new-root              { background-color: #FFFFFF; }\n  .transformation        { background-color: #3F3FFF; }\n  .removal               { background-color: #3FFF3F; }\n  .unmotivated           { background-color: #3F3F00; }\n</style>");
        $sym93$_HTML_PROBLEM_LAYOUT_VISUALIZATION_TABLE_STYLE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE-CACHING-STATE*");
        $str94$_style_type__text_css_____body_x_ = SubLObjectFactory.makeString("<style type=\"text/css\">\n  body.x-body {font-size: initial; font-family: initial; }\n  body strong {font-style: initial; font-weight: bold; }\n  </style>");
        $kw95$STRATEGY = SubLObjectFactory.makeKeyword("STRATEGY");
        $str96$unexpected_visualization_scheme__ = SubLObjectFactory.makeString("unexpected visualization scheme: ~S");
        $str97$problem_none = SubLObjectFactory.makeString("problem none");
        $str98$problem_invalid = SubLObjectFactory.makeString("problem invalid");
        $str99$problem_future = SubLObjectFactory.makeString("problem future");
        $str100$problem_root = SubLObjectFactory.makeString("problem root");
        $kw101$TACTICAL = SubLObjectFactory.makeKeyword("TACTICAL");
        $str102$problem_good = SubLObjectFactory.makeString("problem good");
        $str103$problem_neutral = SubLObjectFactory.makeString("problem neutral");
        $str104$problem_no_good = SubLObjectFactory.makeString("problem no-good");
        $str105$_path = SubLObjectFactory.makeString(" path");
        $str106$_focus = SubLObjectFactory.makeString(" focus");
        $str107$problem_new_root = SubLObjectFactory.makeString("problem new-root");
        $str108$problem_transformation = SubLObjectFactory.makeString("problem transformation");
        $str109$problem_removal = SubLObjectFactory.makeString("problem removal");
        $str110$problem_unmotivated = SubLObjectFactory.makeString("problem unmotivated");
        $str111$_Visualize_ = SubLObjectFactory.makeString("[Visualize]");
        $kw112$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str113$cb_visualize_problems__A__A__A__A = SubLObjectFactory.makeString("cb-visualize-problems&~A&~A&~A&~A");
        $kw114$VISUALIZE_PROBLEMS = SubLObjectFactory.makeKeyword("VISUALIZE-PROBLEMS");
        $sym115$CB_LINK_VISUALIZE_PROBLEMS = SubLObjectFactory.makeSymbol("CB-LINK-VISUALIZE-PROBLEMS");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("REFRESH-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-END-STRING"));
        $str117$_A_did_not_specify_a_problem_stor = SubLObjectFactory.makeString("~A did not specify a problem store");
        $sym118$CB_VISUALIZE_PROBLEMS = SubLObjectFactory.makeSymbol("CB-VISUALIZE-PROBLEMS");
        $kw119$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $int120$100000 = SubLObjectFactory.makeInteger(100000);
        $int121$50000 = SubLObjectFactory.makeInteger(50000);
        $int122$24000 = SubLObjectFactory.makeInteger(24000);
        $int123$12000 = SubLObjectFactory.makeInteger(12000);
        $int124$5000 = SubLObjectFactory.makeInteger(5000);
        $int125$2000 = SubLObjectFactory.makeInteger(2000);
        $int126$1000 = SubLObjectFactory.makeInteger(1000);
        $int127$500 = SubLObjectFactory.makeInteger(500);
        $int128$32 = SubLObjectFactory.makeInteger(32);
        $int129$40 = SubLObjectFactory.makeInteger(40);
        $list130 = ConsesLow.list(new SubLObject[] { problem_store_visualization.ONE_INTEGER, problem_store_visualization.TWO_INTEGER, problem_store_visualization.THREE_INTEGER, problem_store_visualization.FOUR_INTEGER, problem_store_visualization.FIVE_INTEGER, problem_store_visualization.EIGHT_INTEGER, problem_store_visualization.TEN_INTEGER, problem_store_visualization.SIXTEEN_INTEGER, problem_store_visualization.TWENTY_INTEGER, SubLObjectFactory.makeInteger(32), SubLObjectFactory.makeInteger(40), SubLObjectFactory.makeInteger(64), SubLObjectFactory.makeInteger(100) });
        $str131$ = SubLObjectFactory.makeString("");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("STRATEGY"));
        $str133$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str134$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw135$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw136$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str137$Problem_Store_ = SubLObjectFactory.makeString("Problem Store ");
        $str138$_Visualization = SubLObjectFactory.makeString(" Visualization");
        $str139$visControls = SubLObjectFactory.makeString("visControls");
        $str140$_Most_Recent_ = SubLObjectFactory.makeString("[Most Recent]");
        $str141$Refresh___ = SubLObjectFactory.makeString("Refresh : ");
        $str142$_Now_ = SubLObjectFactory.makeString("[Now]");
        $str143$_Auto_ = SubLObjectFactory.makeString("[Auto]");
        $str144$_Halt_ = SubLObjectFactory.makeString("[Halt]");
        $str145$Zoom__ = SubLObjectFactory.makeString("Zoom :");
        $str146$Sequence__ = SubLObjectFactory.makeString("Sequence :");
        $str147$Begin = SubLObjectFactory.makeString("Begin");
        $str148$_1000 = SubLObjectFactory.makeString("-1000");
        $int149$100 = SubLObjectFactory.makeInteger(100);
        $str150$_100 = SubLObjectFactory.makeString("-100");
        $str151$_10 = SubLObjectFactory.makeString("-10");
        $str152$_1 = SubLObjectFactory.makeString("-1");
        $str153$_1 = SubLObjectFactory.makeString("+1");
        $str154$_10 = SubLObjectFactory.makeString("+10");
        $str155$_100 = SubLObjectFactory.makeString("+100");
        $str156$_1000 = SubLObjectFactory.makeString("+1000");
        $str157$End = SubLObjectFactory.makeString("End");
        $kw158$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $str159$Percent__ = SubLObjectFactory.makeString("Percent :");
        $str160$problemStoreVisualizations = SubLObjectFactory.makeString("problemStoreVisualizations");
        $str161$_D_concurrent_CB_VISUALIZE_PROBLE = SubLObjectFactory.makeString("~D concurrent CB-VISUALIZE-PROBLEMS-FOR-MONITOR calls!");
        $sym162$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STORE-ID-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-END-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MODE-STRING"));
        $str164$Error_for_args__S_____S = SubLObjectFactory.makeString("Error for args ~S:~% ~S");
        $sym165$CB_VISUALIZE_PROBLEMS_FOR_MONITOR = SubLObjectFactory.makeSymbol("CB-VISUALIZE-PROBLEMS-FOR-MONITOR");
        $kw166$LATEST_INFERENCE = SubLObjectFactory.makeKeyword("LATEST-INFERENCE");
        $str167$_A__A_did_not_specify_a_problem_s = SubLObjectFactory.makeString("~A ~A did not specify a problem store");
        $str168$overflow_hidden_ = SubLObjectFactory.makeString("overflow:hidden;");
        $str169$Visualizing_new_problem_store__S = SubLObjectFactory.makeString("Visualizing new problem store ~S");
        $int170$25 = SubLObjectFactory.makeInteger(25);
        $str171$Jumped_problem_end_from__A_to__A_ = SubLObjectFactory.makeString("Jumped problem end from ~A to ~A.");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GOODNESS"));
        $sym173$NOTIFY_VISUALIZING_PROBLEM_STORE = SubLObjectFactory.makeSymbol("NOTIFY-VISUALIZING-PROBLEM-STORE");
        $str174$__Visualizing_problem_store__ = SubLObjectFactory.makeString("~&Visualizing problem store~%");
        $sym175$_NOTIFY_VISUALIZING_PROBLEM_STORE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NOTIFY-VISUALIZING-PROBLEM-STORE-CACHING-STATE*");
        $sym176$COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR = SubLObjectFactory.makeSymbol("COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR");
        $str177$Given_layout_of__Dx_D__optimum_ce = SubLObjectFactory.makeString("Given layout of ~Dx~D, optimum cell size is ~Dx~D");
        $sym178$_COMPUTE_GRID_SIZE_FOR_INFERENCE_MONITOR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*COMPUTE-GRID-SIZE-FOR-INFERENCE-MONITOR-CACHING-STATE*");
        $sym179$HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE = SubLObjectFactory.makeSymbol("HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE");
        $float180$1_5 = (SubLFloat)SubLObjectFactory.makeDouble(1.5);
        $str181$_style_type__text_css______proble = SubLObjectFactory.makeString("<style type=\"text/css\">\n  #problemGrid { border-collapse: collapse }\n  table.problemGrid { border-spacing: 0; margin-left: ");
        $str182$px__margin_top__ = SubLObjectFactory.makeString("px; margin-top: ");
        $str183$px__opacity___75_____table_proble = SubLObjectFactory.makeString("px; opacity: .75 }\n  table.problemGrid tr td { width : ");
        $str184$px__height___ = SubLObjectFactory.makeString("px; height : ");
        $str185$______td_none______border_color__ = SubLObjectFactory.makeString("; }\n  td.none    { border-color: transparent; }\n  td.future  { border-color: transparent; }\n  td.invalid { background-color: #3F3F3F; }\n  .problemGrid td.root    { background-color: #FF00FF; }\n  td.root    a:link    { color: #FFFFFF; }\n  td.root    a:visited { color: #FFFFFF; }\n  .problemGrid td.focus   { background-color: #0000FF; }\n  td.focus   a:link    { color: #FFFFFF; }\n  td.focus   a:visited { color: #FFFFFF; }\n  td.path    { background-color: #3FFFFF; }\n  .good    { background-color: #3FFF3F; }\n  .neutral { background-color: #FFFF3F; }\n  .no-good { background-color: #FF3F3F; }\n</style>");
        $str186$Layout__Dx_D_____A = SubLObjectFactory.makeString("Layout ~Dx~D:~% ~A");
        $sym187$_HTML_PROBLEM_LAYOUT_VISUALIZATION_FOR_MONITOR_TABLE_STYLE_CACHIN = SubLObjectFactory.makeSymbol("*HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE-CACHING-STATE*");
        $sym188$_CB_PROBLEM_STORE_LAYOUT_TABLE_ = SubLObjectFactory.makeSymbol("*CB-PROBLEM-STORE-LAYOUT-TABLE*");
        $kw189$NEWEST = SubLObjectFactory.makeKeyword("NEWEST");
    }
    
    public static final class $problem_layout_native extends SubLStructNative
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
        
        public $problem_layout_native() {
            this.$problem_store = (SubLObject)CommonSymbols.NIL;
            this.$min_x = (SubLObject)CommonSymbols.NIL;
            this.$max_x = (SubLObject)CommonSymbols.NIL;
            this.$min_y = (SubLObject)CommonSymbols.NIL;
            this.$max_y = (SubLObject)CommonSymbols.NIL;
            this.$grid = (SubLObject)CommonSymbols.NIL;
            this.$next_problem_id = (SubLObject)CommonSymbols.NIL;
            this.$problem_x_table = (SubLObject)CommonSymbols.NIL;
            this.$problem_y_table = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$problem_layout_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$problem_store;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$min_x;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$max_x;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$min_y;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$max_y;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$grid;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$next_problem_id;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$problem_x_table;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$problem_y_table;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$problem_store = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$min_x = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$max_x = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$min_y = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$max_y = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$grid = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$next_problem_id = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$problem_x_table = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$problem_y_table = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$problem_layout_native.class, problem_store_visualization.$sym0$PROBLEM_LAYOUT, problem_store_visualization.$sym1$PROBLEM_LAYOUT_P, problem_store_visualization.$list2, problem_store_visualization.$list3, new String[] { "$problem_store", "$min_x", "$max_x", "$min_y", "$max_y", "$grid", "$next_problem_id", "$problem_x_table", "$problem_y_table" }, problem_store_visualization.$list4, problem_store_visualization.$list5, problem_store_visualization.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $problem_layout_p$UnaryFunction extends UnaryFunction
    {
        public $problem_layout_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROBLEM-LAYOUT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return problem_store_visualization.problem_layout_p(arg1);
        }
    }
}

/*

	Total time: 634 ms
	 The overlay table (the original one from the page) is made transparent and put in front of the SVG so that the\n     links will be clickable and the SVG will still be visible.  To make the links sensible, a copy of the overlay table\n     (the underlay table) is put under the SVG, and it's visible.\n    
*/